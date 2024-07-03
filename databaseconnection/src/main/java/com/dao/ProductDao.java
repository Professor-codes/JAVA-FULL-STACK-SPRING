package com.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.bean.ProductBean;

@Repository
public class ProductDao {

	@Autowired
	JdbcTemplate jdbcTemplate;

	public void addProduct(ProductBean productBean) {
		jdbcTemplate.update(
				"INSERT INTO product(productName,  productCategory, productQuantity, productPrice) values(?, ?, ?, ?)",
				productBean.getProductName(), productBean.getProductCategory(), productBean.getProductQuantity(),
				productBean.getProductPrice());
	}
}
