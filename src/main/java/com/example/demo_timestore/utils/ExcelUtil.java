package com.example.demo_timestore.utils;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.streaming.SXSSFWorkbook;

import java.io.ByteArrayOutputStream;
import java.util.List;
public abstract class ExcelUtil<E> {
  protected Workbook workbook;
  protected static final String EMPTY_VALUE = " ";
  protected static final Integer START_DATA_ROW = 1;

  private int startDataRow = START_DATA_ROW;

  // getter & setter
  public Sheet getSheet(int sheetIndex) {
    return workbook.getSheetAt(sheetIndex);
  }

  public Sheet getSheet(String sheetName) {
    return workbook.getSheet(sheetName);
  }

  public int getNumberOfSheets() {
    return workbook.getNumberOfSheets();
  }

  public int getStartDataRow() {
    return startDataRow;
  }

  public void setStartDataRow(int startDataRow) {
    this.startDataRow = startDataRow;
  }

  // build excel methods
  protected CellStyle getHeaderStyle() {
    CellStyle style = workbook.createCellStyle();
    Font headerFont = workbook.createFont();
    headerFont.setColor(IndexedColors.WHITE.index);
    headerFont.setBold(true);

    style.setFillForegroundColor(IndexedColors.ROYAL_BLUE.getIndex());
    style.setFont(headerFont);
    style.setFillPattern(FillPatternType.SOLID_FOREGROUND);
    style.setAlignment(HorizontalAlignment.CENTER);
    style.setTopBorderColor(IndexedColors.BLACK.getIndex());
    style.setBorderTop(BorderStyle.THIN);
    style.setLeftBorderColor(IndexedColors.BLACK.getIndex());
    style.setBorderLeft(BorderStyle.THIN);
    style.setRightBorderColor(IndexedColors.BLACK.getIndex());
    style.setBorderRight(BorderStyle.THIN);
    style.setBottomBorderColor(IndexedColors.BLACK.getIndex());
    style.setBorderBottom(BorderStyle.THIN);

    return style;
  }

  protected CellStyle getNormalStyle() {
    CellStyle style = workbook.createCellStyle();

    style.setBorderBottom(BorderStyle.THIN);
    style.setBottomBorderColor(IndexedColors.BLACK.getIndex());
    style.setBorderLeft(BorderStyle.THIN);
    style.setLeftBorderColor(IndexedColors.BLACK.getIndex());
    style.setBorderRight(BorderStyle.THIN);
    style.setRightBorderColor(IndexedColors.BLACK.getIndex());
    style.setBorderTop(BorderStyle.THIN);
    style.setTopBorderColor(IndexedColors.BLACK.getIndex());
    style.setAlignment(HorizontalAlignment.LEFT);

    return style;
  }

  protected CellStyle getCellNumberStyle() {
    CellStyle style = workbook.createCellStyle();
    DataFormat format = workbook.createDataFormat();

    style.setBorderBottom(BorderStyle.THIN);
    style.setBottomBorderColor(IndexedColors.BLACK.getIndex());
    style.setBorderLeft(BorderStyle.THIN);
    style.setLeftBorderColor(IndexedColors.BLACK.getIndex());
    style.setBorderRight(BorderStyle.THIN);
    style.setRightBorderColor(IndexedColors.BLACK.getIndex());
    style.setBorderTop(BorderStyle.THIN);
    style.setTopBorderColor(IndexedColors.BLACK.getIndex());
    style.setAlignment(HorizontalAlignment.RIGHT);
    style.setDataFormat(format.getFormat("#,##0.00"));

    return style;
  }

  protected void autoResizeColumns(Sheet sheet, int size) {
    for (int colIndex = 0; colIndex < size; colIndex++) {
      sheet.autoSizeColumn(colIndex);
    }
  }

  private void fillHeader(Sheet sheet, String[] columns) {
    CellStyle headerStyle = getHeaderStyle();
    for (int rownum = 0; rownum < 1; rownum++) {
      Row row = sheet.createRow(rownum);
      for (int cellnum = 0; cellnum < columns.length; cellnum++) {
        Cell cell = row.createCell(cellnum);
        cell.setCellValue(columns[cellnum]);
        cell.setCellStyle(headerStyle);
      }
    }
  }

  public Sheet createSheet(String sheetName, String[] header, List<E> data) {
    if (workbook == null)
      workbook = new SXSSFWorkbook();

    Sheet newSheet = workbook.createSheet(sheetName);

    fillHeader(newSheet, header);
    fillData(newSheet, data);
    //autoResizeColumns(newSheet, header.length);

    return newSheet;
  }

  public Sheet createSheet(String sheetName, String[] header, List<E> data, Object object) {
    if (workbook == null)
      workbook = new SXSSFWorkbook();

    Sheet newSheet = workbook.createSheet(sheetName);

    fillHeader(newSheet, header);
    fillData(newSheet, data, object);

    return newSheet;
  }

  public final byte[] export() throws Exception {
    ByteArrayOutputStream outByteStream = new ByteArrayOutputStream();
    workbook.write(outByteStream);

    return outByteStream.toByteArray();
  }

  protected abstract void fillData(Sheet sheet, List<E> dataList);

  protected abstract void fillData(Sheet sheet, List<E> dataList, Object object);
}
