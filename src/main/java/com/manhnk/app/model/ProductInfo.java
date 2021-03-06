package com.manhnk.app.model;
// Generated Apr 19, 2020 7:59:47 AM by Hibernate Tools 5.2.12.Final


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * ProductInfo generated by hbm2java
 */
public class ProductInfo implements java.io.Serializable {


  private Long id;
  private Category category;
  private String code;
  private String name;
  private String description;
  private String imageUrl;
  private int activeFlag;
  private Date createdDate;
  private Date updateDate;
  private Set invoices = new HashSet(0);
  private Set histories = new HashSet(0);
  private Set productInStocks = new HashSet(0);

  public ProductInfo() {}


  public ProductInfo(Category category, String code, String name, String imageUrl, int activeFlag,
      Date createdDate, Date updateDate) {
    this.category = category;
    this.code = code;
    this.name = name;
    this.imageUrl = imageUrl;
    this.activeFlag = activeFlag;
    this.createdDate = createdDate;
    this.updateDate = updateDate;
  }

  public ProductInfo(Category category, String code, String name, String description,
      String imageUrl, int activeFlag, Date createdDate, Date updateDate, Set invoices,
      Set histories, Set productInStocks) {
    this.category = category;
    this.code = code;
    this.name = name;
    this.description = description;
    this.imageUrl = imageUrl;
    this.activeFlag = activeFlag;
    this.createdDate = createdDate;
    this.updateDate = updateDate;
    this.invoices = invoices;
    this.histories = histories;
    this.productInStocks = productInStocks;
  }

  public Long getId() {
    return this.id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Category getCategory() {
    return this.category;
  }

  public void setCategory(Category category) {
    this.category = category;
  }

  public String getCode() {
    return this.code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getDescription() {
    return this.description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public String getImageUrl() {
    return this.imageUrl;
  }

  public void setImageUrl(String imageUrl) {
    this.imageUrl = imageUrl;
  }

  public int getActiveFlag() {
    return this.activeFlag;
  }

  public void setActiveFlag(int activeFlag) {
    this.activeFlag = activeFlag;
  }

  public Date getCreatedDate() {
    return this.createdDate;
  }

  public void setCreatedDate(Date createdDate) {
    this.createdDate = createdDate;
  }

  public Date getUpdateDate() {
    return this.updateDate;
  }

  public void setUpdateDate(Date updateDate) {
    this.updateDate = updateDate;
  }

  public Set getInvoices() {
    return this.invoices;
  }

  public void setInvoices(Set invoices) {
    this.invoices = invoices;
  }

  public Set getHistories() {
    return this.histories;
  }

  public void setHistories(Set histories) {
    this.histories = histories;
  }

  public Set getProductInStocks() {
    return this.productInStocks;
  }

  public void setProductInStocks(Set productInStocks) {
    this.productInStocks = productInStocks;
  }



}


