package com.example.demo_timestore.controller;


import com.example.demo_timestore.model.ProductResponse;
import com.example.demo_timestore.service.ExportProductService;
import com.example.demo_timestore.service.ProductService;
import com.example.demo_timestore.utils.ExcelSheetNameConstants;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ByteArrayResource;
import org.springframework.core.io.Resource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/api/v1/export")
public class ExportController {
  @Autowired
  ExportProductService exportProductService;

  @Autowired
  ProductService productService;

  private static final Logger logger = LoggerFactory.getLogger(ExportController.class);

  @GetMapping("/product-to-excel")
  public ResponseEntity<Resource> exportProductListToExcel(
    @RequestParam(value = "listIdSelected",required = false,  defaultValue = "") List<Long> listIdSelected) {
    try {
      List<String> headers = Arrays.asList("NO", "PRODUCT NAME", "PRODUCT TYPE", "UNIT", "DESCRIPTION");
      ExportProductService.ProductToExcelExporter exporter = exportProductService.getProductToExcelExporter();

      List<ProductResponse> productResponses = productService.getListProducts(listIdSelected);
      exporter.createSheet(ExcelSheetNameConstants.SHEET_PRODUCT, headers.toArray(new String[0]), productResponses);

      ByteArrayResource resource = new ByteArrayResource(exporter.export());
      return ResponseEntity.ok().header(HttpHeaders.CONTENT_DISPOSITION, "attachment;filename=products.xlsx")
        .contentType(MediaType.parseMediaType("application/vnd.openxmlformats-officedocument.spreadsheetml.sheet"))
        .body(resource);
    } catch (Exception e) {
      logger.error(e.getMessage());
      return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
    }
  }
}
