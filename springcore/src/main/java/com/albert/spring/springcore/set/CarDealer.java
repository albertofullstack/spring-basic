package com.albert.spring.springcore.set;

import java.util.Set;

public class CarDealer {

  private String name;

  // set does not allow duplicate
  private Set<String> models;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Set<String> getModels() {
    return models;
  }

  public void setModels(Set<String> models) {
    this.models = models;
  }
}
