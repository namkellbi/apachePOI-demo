package com.example.demo_timestore.entity;

import javax.persistence.*;

@Entity
@Table(name="category")
public class Category {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Column(name = "name")
  private String name;

  @Column(name = "description")
  private String description;

  @Column(name = "parent_id")
  private Long parentId;

  @Column(name = "is_leaf")
  private Boolean isLeaf;

  @Column(name = "is_delete")
  private Boolean isDelete;

  @Column(name = "status")
  private Boolean status;

  @Column(name = "is_menu")
  private boolean isMenu;

  @Column(name = "is_process")
  private boolean isProcess;

  public Category() {
  }

  public Category(Long id, String name, String description, Long parentId, Boolean isLeaf, Boolean isDelete, Boolean status, boolean isMenu, boolean isProcess) {
    this.id = id;
    this.name = name;
    this.description = description;
    this.parentId = parentId;
    this.isLeaf = isLeaf;
    this.isDelete = isDelete;
    this.status = status;
    this.isMenu = isMenu;
    this.isProcess = isProcess;
  }

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

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Long getParentId() {
    return parentId;
  }

  public void setParentId(Long parentId) {
    this.parentId = parentId;
  }

  public Boolean getLeaf() {
    return isLeaf;
  }

  public void setLeaf(Boolean leaf) {
    isLeaf = leaf;
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

  public boolean isMenu() {
    return isMenu;
  }

  public void setMenu(boolean menu) {
    isMenu = menu;
  }

  public boolean isProcess() {
    return isProcess;
  }

  public void setProcess(boolean process) {
    isProcess = process;
  }
}