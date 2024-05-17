package com.nilam.product.dao.impl;

import java.io.Serializable;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.nilam.product.dao.ProductDAO;
import com.nilam.product.entity.Product;
import com.nilam.product.util.FactoryProviderUtil;

public class ProductDAOimpl implements ProductDAO{

	@Override
	public boolean save(Product p) {
		SessionFactory factory = FactoryProviderUtil.getFactoryProvider();
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		Serializable save = session.save(p);
		tx.commit();
		return true;
	}

	@Override
	public boolean update(Product p) {
		SessionFactory factory = FactoryProviderUtil.getFactoryProvider();
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		Product product = session.get(Product.class, p.getProductId());
		product.setProductName(p.getProductName());
		product.setMfgDate(p.getMfgDate());
		product.setExpDate(p.getExpDate());
		product.setProductPrice(p.getProductPrice());
		product.setProductQty(p.getProductQty());
		session.update(product);
		tx.commit();
		return true;
	}

	@Override
	public boolean delete(int id) {
		SessionFactory factory = FactoryProviderUtil.getFactoryProvider();
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		Product p = session.get(Product.class, id);
		session.delete(p);
		tx.commit();
		return true;
	}

	@Override
	public Product get(int id) {
	
		SessionFactory factory = FactoryProviderUtil.getFactoryProvider();
		Session session = factory.openSession();
		
		Product p = session.get(Product.class, id);
		return p;
		
		
	}

	@Override
	public List<Product> getAllProduct() {
		SessionFactory factory = FactoryProviderUtil.getFactoryProvider();
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(Product.class);
		 List<Product> listofproduct = criteria.list();
	    System.out.println(listofproduct);
		return listofproduct;
	}
}
