package com.example.springbeanlifecycle_usingannotation;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class OrderController {
    public static void main(String[] args) {

        AbstractApplicationContext context =
                new ClassPathXmlApplicationContext("Beans.xml");

        ZeptoOrder order = context.getBean(ZeptoOrder.class);
        System.out.println(order);

        // VERY IMPORTANT: triggers @PreDestroy
        context.registerShutdownHook();
    }
}
