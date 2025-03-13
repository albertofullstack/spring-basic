package com.albert.spring.springcore.interfaces;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

  public static void main(String[] args) {
    AbstractApplicationContext context = new ClassPathXmlApplicationContext("xmlinterfconfig.xml");
    Patient patient = (Patient) context.getBean("patient");
    System.out.println(patient);

    // this tells the spring container that it needs to invoke the destroy method
    context.registerShutdownHook();
  }
}
