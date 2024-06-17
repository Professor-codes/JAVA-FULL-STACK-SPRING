package com;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bean.StudentBean;
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
		
		// singleton design pattern 
		// create 1 object for all
		UserBean u1 = context.getBean("userBean", UserBean.class);
		UserBean u2 = context.getBean("userBean", UserBean.class);
		UserBean u3 = context.getBean("userBean", UserBean.class);
		
		System.out.println(u1);
		System.out.println(u2);
		System.out.println(u3);
		
		// prototype design pattern
		// create 1 object for each
		StudentBean s1 = context.getBean("studentBean", StudentBean.class);
		StudentBean s2 = context.getBean("studentBean", StudentBean.class);
		StudentBean s3 = context.getBean("studentBean", StudentBean.class);
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
	}
}
