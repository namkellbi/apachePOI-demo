package com.example.demo_timestore.entity;

import javax.persistence.*;

@Entity
@Table(name = "batch")
public class Batch{

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Column(name = "option_id")
  private Long optionId;

  @Column(name = "product_id")
  private Long productId;

  @Column(name = "name")
  private String name;

  @Column(name = "import_price")
  private Long importPrice;

  @Column(name = "import_quantity")
  private Long importQuantity;

  @Column(name = "broken_quantity")
  private Long brokenQuantity;

  @Column(name = "sold_quantity")
  private Long soldQuantity;

  @Column(name = "menu_quantity")
  private Long menuQuantity;

  @Column(name = "remaining_quantity")
  private Long remainingQuantity;

  @Column(name = "batch_code")
  private String batchCode;

  @Column(name = "import_date")
  private Long importDate;

  @Column(name = "expiry_date")
  private Long expiryDate;

  @Column(name = "is_process")
  private Boolean isProcess;

  @Column(name = "is_delete")
  private Boolean isDelete;

  @Column(name = "status")
  private Boolean status;

  @Column(name = "status_export_code")
  private Boolean statusExportCode;

  @Column(name = "menu_id")
  private Long menuId;

  public Batch() {
  }

  public Batch(Long id, Long optionId, Long productId, String name, Long importPrice, Long importQuantity,
    Long brokenQuantity, Long soldQuantity, Long menuQuantity, Long remainingQuantity, String batchCode,
    Long importDate, Long expiryDate, Boolean isProcess, Boolean isDelete, Boolean status, Boolean statusExportCode,
    long menuId) {
    this.id = id;
    this.optionId = optionId;
    this.productId = productId;
    this.name = name;
    this.importPrice = importPrice;
    this.importQuantity = importQuantity;
    this.brokenQuantity = brokenQuantity;
    this.soldQuantity = soldQuantity;
    this.menuQuantity = menuQuantity;
    this.remainingQuantity = remainingQuantity;
    this.batchCode = batchCode;
    this.importDate = importDate;
    this.expiryDate = expiryDate;
    this.isProcess = isProcess;
    this.isDelete = isDelete;
    this.status = status;
    this.statusExportCode = statusExportCode;
    this.menuId = menuId;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Long getOptionId() {
    return optionId;
  }

  public void setOptionId(Long optionId) {
    this.optionId = optionId;
  }

  public Long getProductId() {
    return productId;
  }

  public void setProductId(Long productId) {
    this.productId = productId;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Long getImportPrice() {
    return importPrice;
  }

  public void setImportPrice(Long importPrice) {
    this.importPrice = importPrice;
  }

  public Long getImportQuantity() {
    return importQuantity;
  }

  public void setImportQuantity(Long importQuantity) {
    this.importQuantity = importQuantity;
  }

  public Long getBrokenQuantity() {
    return brokenQuantity;
  }

  public void setBrokenQuantity(Long brokenQuantity) {
    this.brokenQuantity = brokenQuantity;
  }

  public Long getSoldQuantity() {
    return soldQuantity;
  }

  public void setSoldQuantity(Long soldQuantity) {
    this.soldQuantity = soldQuantity;
  }

  public Long getMenuQuantity() {
    return menuQuantity;
  }

  public void setMenuQuantity(Long menuQuantity) {
    this.menuQuantity = menuQuantity;
  }

  public Long getRemainingQuantity() {
    return remainingQuantity;
  }

  public void setRemainingQuantity(Long remainingQuantity) {
    this.remainingQuantity = remainingQuantity;
  }

  public String getBatchCode() {
    return batchCode;
  }

  public void setBatchCode(String batchCode) {
    this.batchCode = batchCode;
  }

  public Long getImportDate() {
    return importDate;
  }

  public void setImportDate(Long importDate) {
    this.importDate = importDate;
  }

  public Long getExpiryDate() {
    return expiryDate;
  }

  public void setExpiryDate(Long expiryDate) {
    this.expiryDate = expiryDate;
  }

  public Boolean getProcess() {
    return isProcess;
  }

  public void setProcess(Boolean process) {
    isProcess = process;
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

  public Boolean getStatusExportCode() {
    return statusExportCode;
  }

  public void setStatusExportCode(Boolean statusExportCode) {
    this.statusExportCode = statusExportCode;
  }

  public long getMenuId() {
    return menuId;
  }

  public void setMenuId(long menuId) {
    this.menuId = menuId;
  }
}
