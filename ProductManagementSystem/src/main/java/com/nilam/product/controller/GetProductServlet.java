package com.nilam.product.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.nilam.product.entity.Product;
import com.nilam.product.service.impl.ProductServiceImpl;

@WebServlet("/get")
public class GetProductServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 int id = Integer.parseInt(request.getParameter("id"));
		 request.setAttribute("id", id);
		 String welcome = null;
		 String msg = null;
		 
		 ProductServiceImpl ps = new ProductServiceImpl();
		 Product product = ps.get(id);
		 System.out.println(product);
		 if(product!=null) {
			 welcome = "get.jsp";
		 }else {
			 welcome = "msg.jsp";
			 msg="Id not present, add product";
		 }
		 request.setAttribute("msg", msg);
		 request.setAttribute("product", product);
		 RequestDispatcher rd = request.getRequestDispatcher(welcome);
		 rd.forward(request, response);
	}

}
