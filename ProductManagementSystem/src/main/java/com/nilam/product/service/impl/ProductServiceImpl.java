package com.nilam.product.service.impl;

import java.util.List;
import com.nilam.product.dao.impl.ProductDAOimpl;
import com.nilam.product.entity.Product;
import com.nilam.product.service.ProductService;

public class ProductServiceImpl implements ProductService {

	@Override
	public boolean save(Product object) {
		ProductDAOimpl dao = new ProductDAOimpl();
		dao.save(object);
		return true;
	}

	@Override
	public boolean update(Product p) {
		ProductDAOimpl dao = new ProductDAOimpl();
		dao.update(p);
		return true;
	}

	@Override
	public boolean delete(int id) {
		ProductDAOimpl dao = new ProductDAOimpl();
		dao.delete(id);
		return true;
	}

	@Override
	public Product get(int id) {
		ProductDAOimpl dao = new ProductDAOimpl();
		Product product = dao.get(id);
		return product;
	}

	@Override
	public List<Product> getAllProduct() {
		ProductDAOimpl dao = new ProductDAOimpl();
		List<Product> allProduct = dao.getAllProduct();
		System.out.println(allProduct);
		return allProduct;
	}

}
