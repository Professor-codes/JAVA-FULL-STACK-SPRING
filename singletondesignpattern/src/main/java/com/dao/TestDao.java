package com.dao;

public class TestDao {
	
	// SINGLETON DESIGN PATTERN

	// constructor
	private TestDao() {

	}

	// method
	public void print() {
		System.out.println("TestDao::print()");
	}

	static TestDao testDao = null;

	// call this method to get TestDao object
	public static TestDao getTestDao() {

		if (testDao == null) {
			testDao = new TestDao();
		}
		
		return testDao;
	}

}
