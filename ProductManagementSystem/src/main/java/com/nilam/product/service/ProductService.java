package com.nilam.product.service;

import java.util.List;

import com.nilam.product.entity.Product;

public interface ProductService {
	
	boolean save(Product object);
	boolean update(Product p);
	boolean delete(int id);
	Product get(int id);
	List<Product> getAllProduct();

}
