package com.example.demo_timestore.entity;

import javax.persistence.*;

@Entity
@Table(name = "product")
public class Product {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Column(name = "category_id")
  private Long categoryId;

  @Column(name = "unit_id")
  private Long unitId;

  @Column(name = "name")
  private String name;

  @Column(name = "description")
  private String description;

  @Column(name = "is_delete")
  private  Boolean isDelete;

  @Column(name = "status")
  private  Boolean status;

  @Column(name = "best_seller")
  private int bestSeller;

  @Column(name = "barcode")
  private String barcode;

  public Product() {
  }

  public Product(Long id, Long categoryId, Long unitId, String name, String description, Boolean isDelete, Boolean status, int bestSeller, String barcode) {
    this.id = id;
    this.categoryId = categoryId;
    this.unitId = unitId;
    this.name = name;
    this.description = description;
    this.isDelete = isDelete;
    this.status = status;
    this.bestSeller = bestSeller;
    this.barcode = barcode;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Long getCategoryId() {
    return categoryId;
  }

  public void setCategoryId(Long categoryId) {
    this.categoryId = categoryId;
  }

  public Long getUnitId() {
    return unitId;
  }

  public void setUnitId(Long unitId) {
    this.unitId = unitId;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Boolean getDelete() {
    return isDelete;
  }

  public void setDelete(Boolean delete) {
    isDelete = delete;
  }

  public Boolean getStatus() {
    return status;
  }

  public void setStatus(Boolean status) {
    this.status = status;
  }

  public int getBestSeller() {
    return bestSeller;
  }

  public void setBestSeller(int bestSeller) {
    this.bestSeller = bestSeller;
  }

  public String getBarcode() {
    return barcode;
  }

  public void setBarcode(String barcode) {
    this.barcode = barcode;
  }
}