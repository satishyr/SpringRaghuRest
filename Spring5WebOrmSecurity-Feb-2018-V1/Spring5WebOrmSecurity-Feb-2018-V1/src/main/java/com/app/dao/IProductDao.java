package com.app.dao;

import java.util.List;

import com.app.model.Product;

public interface IProductDao {

	public Integer saveProduct(Product p);
	public void updateProduct(Product p);
	public void deleteProduct(Integer id);
	
	public Product getProductById(Integer id);
	public List<Product> getAllProducts();
	
	
}
