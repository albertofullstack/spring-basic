package com.albert.spring.springcore.assignment1;

import com.albert.spring.springcore.reftypes.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

  public static void main(String[] args) {
    ApplicationContext context = new ClassPathXmlApplicationContext("assign1config.xml");
    ShoppingCart shoppingCart = (ShoppingCart) context.getBean("shoppingCart");
    System.out.println(shoppingCart);
  }
}
