package com.batch.demo.config;

import org.springframework.batch.infrastructure.item.ItemProcessor;

import com.batch.demo.entity.Person;

public class PersonProcess implements ItemProcessor<Person, Person> {

	@Override
	public Person process(Person item) throws Exception {
		 item.setFirstName(item.getFirstName().toUpperCase());
		 item.setLastName(item.getLastName().toUpperCase());
		return item;
	}

}
