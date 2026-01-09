package com.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.example.bean.DeliveryPartner;

public class PartnerDriver 
{
    public static void main( String[] args )
    {
        ApplicationContext context=new AnnotationConfigApplicationContext(BeanConfig.class);
        DeliveryPartner partner=context.getBean(DeliveryPartner.class);
        System.out.println(partner.toString());
    }
}
