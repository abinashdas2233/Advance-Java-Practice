package com.example.BeanCreationUsingJava;



import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class OrderController {
    public static void main(String[] args) {
        ApplicationContext context=new AnnotationConfigApplicationContext(Beanconfig.class);
        Order order=context.getBean(Order.class);
       System.out.println(order.toString()); 
    }
}
