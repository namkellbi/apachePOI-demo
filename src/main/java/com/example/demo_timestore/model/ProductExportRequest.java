package com.example.demo_timestore.model;

import java.util.List;

public class ProductExportRequest {
  private List <Long> listIdSelected;


  public ProductExportRequest(List<Long> listIdSelected) {
    this.listIdSelected = listIdSelected;
  }

  public ProductExportRequest(){

  }

  public List<Long> getListIdSelected() {
    return listIdSelected;
  }

  public void setListIdSelected(List<Long> listIdSelected) {
    this.listIdSelected = listIdSelected;
  }
}
