package com.nilam.product.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.nilam.product.entity.Product;
import com.nilam.product.service.impl.ProductServiceImpl;

@WebServlet("/list")
public class ListProductServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ProductServiceImpl ps = new ProductServiceImpl();
		List<Product> product = ps.getAllProduct();
		System.out.println(product);
		request.setAttribute("product", product);
		
		 RequestDispatcher rd = request.getRequestDispatcher("showpage.jsp");
		 rd.forward(request, response);
	
	}

}
