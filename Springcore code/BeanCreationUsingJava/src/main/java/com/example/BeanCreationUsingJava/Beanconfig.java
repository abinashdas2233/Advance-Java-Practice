package com.example.BeanCreationUsingJava;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Beanconfig {
	@Bean
	public Order orderBeanCreation() {
		Order order=new Order();
		order.setOrderId(101);
		order.setOrderName("Samosha");
		
		return order;
	}

}
