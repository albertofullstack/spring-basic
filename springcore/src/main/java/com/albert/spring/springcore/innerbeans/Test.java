package com.albert.spring.springcore.innerbeans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

  public static void main(String[] args) {

    ApplicationContext context = new ClassPathXmlApplicationContext("innerbeansconfig.xml");

    Employee employee = (Employee) context.getBean("employee");
    System.out.println(employee.hashCode());

    Employee employee2 = (Employee) context.getBean("employee");
    System.out.println(employee2.hashCode());
  }
}
