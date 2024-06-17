package com;

import com.bean.AddressBean;
import com.bean.UserBean;

public class App {
	public static void main(String[] args) {

		AddressBean addressBean = new AddressBean();
		UserBean userBean = new UserBean(addressBean);

		System.out.println(userBean.getId());
		System.out.println(userBean.getName());
		System.out.println(userBean.getEmail());
		System.out.println(userBean.getPassword());
		System.out.println(userBean.getAddressBean());

	}
}
