package com;

import com.dao.TestDao;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		System.out.println("Hello World!");

		TestDao obj1 = TestDao.getTestDao();
		obj1.print();
		
		TestDao obj2 = TestDao.getTestDao();
		obj2.print();

			
		System.out.println(obj1);
		System.out.println(obj2);

	}
}
