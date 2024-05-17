package com.nilam.product.dao;

import java.util.List;

import com.nilam.product.entity.Product;

public interface ProductDAO {

	boolean save(Product object);
	boolean update(Product p);
	boolean delete(int id);
	Product get(int id);
	List<Product> getAllProduct();

}
