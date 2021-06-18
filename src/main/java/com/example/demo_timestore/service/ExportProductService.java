package com.example.demo_timestore.service;

import com.example.demo_timestore.model.ProductResponse;
import com.example.demo_timestore.utils.ExcelUtil;
import org.apache.poi.ss.usermodel.*;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExportProductService {
  public ProductToExcelExporter getProductToExcelExporter(){
    return new ProductToExcelExporter();
  }

  public class ProductToExcelExporter  extends ExcelUtil<ProductResponse> {
    @Override
    protected void fillData(Sheet sheet, List<ProductResponse> dataList) {
      CellStyle normalStyle = getNormalStyle();
      normalStyle.setVerticalAlignment(VerticalAlignment.TOP);
      int startDataRow = getStartDataRow();
      int rownum = startDataRow;
      int no = 0;
      for (ProductResponse response : dataList) {
        Row row = sheet.createRow(rownum);

        //No
        Cell cell_0 = row.createCell(0, CellType.NUMERIC);
        cell_0.setCellStyle(normalStyle);
        cell_0.setCellValue(++no);

        //ProductName
        Cell cell_1 = row.createCell(1, CellType.STRING);
        cell_1.setCellStyle(normalStyle);
        cell_1.setCellValue(response.getName());

        //ProductType
        Cell cell_2 = row.createCell(2, CellType.STRING);
        cell_2.setCellStyle(normalStyle);
        cell_2.setCellValue(response.getCategoryName());

        //Unit
        Cell cell_3 = row.createCell(3, CellType.STRING);
        cell_3.setCellStyle(normalStyle);
        cell_3.setCellValue(response.getUnitName());

        //Description
        Cell cell_4 = row.createCell(4, CellType.STRING);
        cell_4.setCellStyle(normalStyle);
        cell_4.setCellValue(response.getDescription());

        rownum++;
      }
    }

    @Override
    protected void fillData(Sheet sheet, List<ProductResponse> dataList, Object object) {

    }
  }
}
