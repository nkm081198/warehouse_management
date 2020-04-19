package com.manhnk.app.model;
// Generated Apr 19, 2020 7:59:47 AM by Hibernate Tools 5.2.12.Final


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Menu generated by hbm2java
 */
public class Menu implements java.io.Serializable {


  private long id;
  private long parentId;
  private String url;
  private String name;
  private int oderIndex;
  private int activeFlag;
  private Date createdDate;
  private Date updateDate;
  private Set auths = new HashSet(0);

  public Menu() {}


  public Menu(long id, long parentId, String url, String name, int oderIndex, int activeFlag,
      Date createdDate, Date updateDate) {
    this.id = id;
    this.parentId = parentId;
    this.url = url;
    this.name = name;
    this.oderIndex = oderIndex;
    this.activeFlag = activeFlag;
    this.createdDate = createdDate;
    this.updateDate = updateDate;
  }

  public Menu(long id, long parentId, String url, String name, int oderIndex, int activeFlag,
      Date createdDate, Date updateDate, Set auths) {
    this.id = id;
    this.parentId = parentId;
    this.url = url;
    this.name = name;
    this.oderIndex = oderIndex;
    this.activeFlag = activeFlag;
    this.createdDate = createdDate;
    this.updateDate = updateDate;
    this.auths = auths;
  }

  public long getId() {
    return this.id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public long getParentId() {
    return this.parentId;
  }

  public void setParentId(long parentId) {
    this.parentId = parentId;
  }

  public String getUrl() {
    return this.url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getOderIndex() {
    return this.oderIndex;
  }

  public void setOderIndex(int oderIndex) {
    this.oderIndex = oderIndex;
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

  public Set getAuths() {
    return this.auths;
  }

  public void setAuths(Set auths) {
    this.auths = auths;
  }



}

