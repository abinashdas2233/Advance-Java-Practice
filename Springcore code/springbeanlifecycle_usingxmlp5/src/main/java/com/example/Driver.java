package com.example;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {
    public static void main(String[] args) {

        AbstractApplicationContext context =
                new ClassPathXmlApplicationContext("Beans.xml");

        Order order = context.getBean("order", Order.class);
        System.out.println(order.getItemName());

        // VERY IMPORTANT: triggers destroy-method
        context.registerShutdownHook();
    }
}
