package com.albert.spring.springcore.list;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

  public static void main(String[] args) {
    ApplicationContext context = new ClassPathXmlApplicationContext(
        "listconfig.xml");
    Hospital hospital = (Hospital) context.getBean("hospital");
    System.out.println(hospital.getName());
    System.out.println(hospital.getDepartments());
  }
}
