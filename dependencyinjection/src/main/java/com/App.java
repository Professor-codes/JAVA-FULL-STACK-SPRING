package com;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bean.UserBean;

public class App {
	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("dependencyinjection.xml");
		// System.out.println(context);
		
        UserBean user = context.getBean("userBean", UserBean.class);
        
        System.out.println(user.getId());
        System.out.println(user.getName());
        System.out.println(user.getEmail());
        System.out.println(user.getPassword());
        System.out.println(user.getAddressBean());
	}
}
