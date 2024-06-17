package com;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bean.UserBean;

public class App {
	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("dependencyinjection.xml");
		// System.out.println(context);
		
        UserBean userBean = context.getBean("userBean", UserBean.class);
        
        System.out.println(userBean.getId());
        System.out.println(userBean.getName());
        System.out.println(userBean.getEmail());
        System.out.println(userBean.getPassword());
        System.out.println(userBean.getAddressBean());
        
	}
}
