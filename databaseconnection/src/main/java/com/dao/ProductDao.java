package com.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.bean.ProductBean;

@Repository
public class ProductDao {

	@Autowired
	JdbcTemplate jdbcTemplate;

	public void addProduct(ProductBean productBean) {
		jdbcTemplate.update(
				"INSERT INTO product(productName, productCategory, productQuantity, productPrice) values(?, ?, ?, ?)",
				productBean.getProductName(), productBean.getProductCategory(), productBean.getProductQuantity(),
				productBean.getProductPrice());
	}

	public List<ProductBean> getProduct() {
		List<ProductBean> productList = jdbcTemplate.query("SELECT * FROM product",
				new BeanPropertyRowMapper<>(ProductBean.class));

		return productList;
	}
 
	public void deleteProduct(Integer productId) {
		jdbcTemplate.update("DELETE FROM product WHERE productId = ?", productId);
	}

	public void deleteProductByName(String productName) {
		jdbcTemplate.update("DELETE FROM product WHERE productName = ?", productName);
		
	}
	
	
	
	
}
