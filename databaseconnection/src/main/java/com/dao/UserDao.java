package com.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.bean.UserBean;

@Repository
public class UserDao {

	@Autowired
	JdbcTemplate jdbcTemplate;

	public void insertUser(UserBean userBean) {

		jdbcTemplate.update("INSERT INTO user(username, email, password) values(?, ?, ?)", userBean.getUsername(),
				userBean.getEmail(), userBean.getPassword());
	}
}
