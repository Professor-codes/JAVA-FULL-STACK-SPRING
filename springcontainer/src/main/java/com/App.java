package com;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bean.UserBean;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		// SPRING CONTAINER
		// IOC CONTAINER

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		System.out.println(context);
		
		UserBean first = context.getBean("userBean", UserBean.class);
		UserBean second = context.getBean("userBean", UserBean.class);
		UserBean third = context.getBean("userBean", UserBean.class);
		
		System.out.println(first);
		System.out.println(second);
		System.out.println(third);
		
	}
}
