package com.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context=new ClassPathXmlApplicationContext("\\resources\\Beans.xml");
        Products product=context.getBean(Products.class);
        System.out.println(product.getSrlNo()+" "+product.getProdName()+" "+product.getPrice());
        
        
        
        Items item=context.getBean(Items.class);
        System.out.println(item.getSrlNo()+" "+item.getItemName()+" "+item.getPrice());
    }
}
