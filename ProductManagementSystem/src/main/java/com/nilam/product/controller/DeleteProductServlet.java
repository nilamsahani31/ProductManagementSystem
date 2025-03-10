package com.nilam.product.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.nilam.product.service.impl.ProductServiceImpl;

@WebServlet("/delete")
public class DeleteProductServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    		int id = Integer.parseInt(request.getParameter("id"));
    		System.out.println(id);
    		request.setAttribute("id", id);
    		RequestDispatcher rd = request.getRequestDispatcher("delete.jsp");
    		rd.forward(request, response);

	}
        protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        	int id = Integer.parseInt(request.getParameter("id"));
        	ProductServiceImpl ps = new ProductServiceImpl();
        	ps.delete(id);
        	
        	response.sendRedirect("list");
	}

}
