package com.albert.spring.springcore.assignment2;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

  public static void main(String[] args) {
    AbstractApplicationContext context = new ClassPathXmlApplicationContext("assign2config.xml");
    TicketReservation ticketReservation = (TicketReservation) context.getBean("ticketReservation");
    System.out.println(ticketReservation);

    // this tells the spring container that it needs to invoke the destroy method
    context.registerShutdownHook();
  }
}
