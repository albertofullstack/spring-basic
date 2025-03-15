package com.albert.spring.springcore.assignment3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

  public static void main(String[] args) {

    ApplicationContext context = new ClassPathXmlApplicationContext("assign3config.xml");

    University university = (University) context.getBean("university");
    System.out.println(university.hashCode());

    University university2 = (University) context.getBean("university");
    System.out.println(university2.hashCode());
  }
}
