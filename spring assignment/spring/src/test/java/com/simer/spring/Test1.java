package com.simer.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.simer.main.spring.Customer;

public class Test1 {
	public static void main(String[] args) {
		ApplicationContext customerdetails=new ClassPathXmlApplicationContext("assignment1.xml");
		Customer c1=(Customer) customerdetails.getBean("address1");
		System.out.println(c1);
	}
}
