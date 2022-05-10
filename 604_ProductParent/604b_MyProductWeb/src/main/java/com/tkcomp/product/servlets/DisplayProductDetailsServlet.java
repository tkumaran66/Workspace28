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
 * Servlet implementation class DisplayProductDetailsServlet
 */
public class DisplayProductDetailsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ProductBO bo = new ProductBOImpl();
		Product product = bo.findProduct(Integer.parseInt(request.getParameter("Id")));
		
		PrintWriter out = response.getWriter();
		out.print("Product Details");
		out.print("Product Id: "+product.getId());
		out.print("Product Name: "+product.getName());
		out.print("Product Desc: "+product.getDesc());
		out.print("Product Price: "+product.getPrice());
	}
}
