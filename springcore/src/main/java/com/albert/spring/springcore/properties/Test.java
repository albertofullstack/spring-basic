package com.albert.spring.springcore.properties;

import com.albert.spring.springcore.map.Customer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

  public static void main(String[] args) {
    ApplicationContext context = new ClassPathXmlApplicationContext("propertiesconfig.xml");
    CountriesAndLanguages countriesAndLanguages = (CountriesAndLanguages)
        context.getBean("countriesAndLangs");
    System.out.println(countriesAndLanguages);
  }
}
