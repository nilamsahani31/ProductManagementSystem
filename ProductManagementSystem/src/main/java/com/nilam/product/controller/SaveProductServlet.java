package com.nilam.product.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.nilam.product.entity.Product;
import com.nilam.product.service.impl.ProductServiceImpl;

@WebServlet("/Save")
public class SaveProductServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String productName = req.getParameter("productName");
		String productCategory = req.getParameter("productCategory");
		String mfgDate = req.getParameter("mfgDate");
		String expDate = req.getParameter("expDate");
		double productPrice = Double.parseDouble(req.getParameter("productPrice"));
		int productQty = Integer.parseInt(req.getParameter("productQty"));
		
		Product p = new Product(productName,productCategory,mfgDate,expDate,productPrice,productQty);
		ProductServiceImpl ps = new ProductServiceImpl();
		ps.save(p);
		
			
	}

}
