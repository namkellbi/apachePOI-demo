package com.example.demo_timestore.model;

public class BatchResponse {
  private Long id;
  private String batchCode;
  private Long expireDate;
  private Long amount;
  private Long damageQuantity;
  private Long soldQuantity;
  private Long remainingQuantity;
  private Long importPrice;
  private Long importDate;
  private String lotCode;
  private Long totalQuantity;
  private Long purchasePrice;
  private Long amountMenu;
  private Long menuQuantity;

  public BatchResponse(Long id, String batchCode, Long expireDate, Long amount, Long damageQuantity, Long soldQuantity,
                       Long remainingQuantity, Long importPrice, Long importDate, String lotCode, Long totalQuantity,
                       Long purchasePrice, Long amountMenu) {
    this.id = id;
    this.batchCode = batchCode;
    this.expireDate = expireDate;
    this.amount = amount;
    this.damageQuantity = damageQuantity;
    this.soldQuantity = soldQuantity;
    this.remainingQuantity = remainingQuantity;
    this.importPrice = importPrice;
    this.importDate = importDate;
    this.lotCode = lotCode;
    this.totalQuantity = totalQuantity;
    this.purchasePrice = purchasePrice;
    this.amountMenu = amountMenu;
  }

  public BatchResponse() {
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getBatchCode() {
    return batchCode;
  }

  public void setBatchCode(String batchCode) {
    this.batchCode = batchCode;
  }

  public Long getExpireDate() {
    return expireDate;
  }

  public void setExpireDate(Long expireDate) {
    this.expireDate = expireDate;
  }

  public Long getAmount() {
    return amount;
  }

  public void setAmount(Long amount) {
    this.amount = amount;
  }

  public Long getDamageQuantity() {
    return damageQuantity;
  }

  public void setDamageQuantity(Long damageQuantity) {
    this.damageQuantity = damageQuantity;
  }

  public Long getSoldQuantity() {
    return soldQuantity;
  }

  public void setSoldQuantity(Long soldQuantity) {
    this.soldQuantity = soldQuantity;
  }

  public Long getRemainingQuantity() {
    return remainingQuantity;
  }

  public void setRemainingQuantity(Long remainingQuantity) {
    this.remainingQuantity = remainingQuantity;
  }

  public Long getImportPrice() {
    return importPrice;
  }

  public void setImportPrice(Long importPrice) {
    this.importPrice = importPrice;
  }

  public Long getImportDate() {
    return importDate;
  }

  public void setImportDate(Long importDate) {
    this.importDate = importDate;
  }

  public String getLotCode() {
    return lotCode;
  }

  public void setLotCode(String lotCode) {
    this.lotCode = lotCode;
  }

  public Long getTotalQuantity() {
    return totalQuantity;
  }

  public void setTotalQuantity(Long totalQuantity) {
    this.totalQuantity = totalQuantity;
  }

  public Long getPurchasePrice() {
    return purchasePrice;
  }

  public void setPurchasePrice(Long purchasePrice) {
    this.purchasePrice = purchasePrice;
  }

  public Long getAmountMenu() {
    return amountMenu;
  }

  public void setAmountMenu(Long amountMenu) {
    this.amountMenu = amountMenu;
  }

  public Long getMenuQuantity() {
    return menuQuantity;
  }

  public void setMenuQuantity(Long menuQuantity) {
    this.menuQuantity = menuQuantity;
  }
}
