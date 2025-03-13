package com.albert.spring.springcore.assignment2;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class TicketReservation {

  private int id;

  public int getId() {
    return id;
  }

  public void setId(int id) {
    System.out.println("Inside setter method");
    this.id = id;
  }

  @PostConstruct
  public void initialize() {
    System.out.println("Inside initialize method");
  }

  @PreDestroy
  public void cleanup() {
    System.out.println("Inside cleanup method");
  }

  @Override
  public String toString() {
    return "Patient{" +
        "id=" + id +
        '}';
  }
}
