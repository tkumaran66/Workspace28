package com.tkcomp.product.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.tkcomp.product.bo.ProductBO;
import com.tkcomp.product.bo.ProductBOImpl;
import com.tkcomp.product.dto.Product;

/**
 * Servlet implementation class CreateProductServlet
 */
public class CreateProductServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Integer id = Integer.parseInt(request.getParameter("id"));
		String name = request.getParameter("name");
		String description = request.getParameter("description");
		Integer price = Integer.parseInt(request.getParameter("price"));
		
		Product product = new Product();
		product.setId(id);
		product.setName(name);
		product.setDesc(description);
		product.setPrice(price);
		
		ProductBO bo = new ProductBOImpl();
		bo.create(product);
		
		PrintWriter out = response.getWriter();
		out.print("Product Created!!!");
	}
}
