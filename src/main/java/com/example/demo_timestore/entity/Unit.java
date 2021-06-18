package com.example.demo_timestore.entity;

import javax.persistence.*;

@Entity
@Table(name = "unit")
public class Unit {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Column(name = "name", unique = true)
  private String name;

  @Column(name = "is_delete")
  private Boolean isDelete;

  @Column(name = "status")
  private Boolean status;

  @Column(name = "description")
  private String description;

  public Unit() {
  }


  public Unit(Long id, String name, Boolean isDelete, Boolean status, String description) {
    this.id = id;
    this.name = name;
    this.isDelete = isDelete;
    this.status = status;
    this.description = description;
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

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }
}