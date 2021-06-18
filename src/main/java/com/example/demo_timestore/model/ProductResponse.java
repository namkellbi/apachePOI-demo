package com.example.demo_timestore.model;

public class ProductResponse {
  private Long id;
  private String name;
  private String categoryName;
  private String unitName;
  private String description;
  private Long categoryMenuId;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getCategoryName() {
    return categoryName;
  }

  public void setCategoryName(String categoryName) {
    this.categoryName = categoryName;
  }

  public String getUnitName() {
    return unitName;
  }

  public void setUnitName(String unitName) {
    this.unitName = unitName;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Long getCategoryMenuId() {
    return categoryMenuId;
  }

  public void setCategoryMenuId(Long categoryMenuId) {
    this.categoryMenuId = categoryMenuId;
  }

  public ProductResponse(Long id, String name, String categoryName, String unitName, String description, Long categoryMenuId) {
    this.id = id;
    this.name = name;
    this.categoryName = categoryName;
    this.unitName = unitName;
    this.description = description;
    this.categoryMenuId = categoryMenuId;
  }

  public ProductResponse() {
  }
}