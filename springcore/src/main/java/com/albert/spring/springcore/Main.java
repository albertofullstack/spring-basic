package com.albert.spring.springcore;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

  public static void main(String[] args) {
    ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext(
        "config.xml");
    Employee emp = (Employee) ctx.getBean("emp");
    System.out.println("Employee ID: " + emp.getId());
    System.out.println("Employee name: " + emp.getName());
  }
}
