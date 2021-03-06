package com.mvcapp;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/CustomerServletMvc")
public class CustomerServletMvc extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// retrieve customer data from CustomerDataUtil class (Model)
		response.setContentType("text/html");
		List<Customer> customers = CustomerDataUtil.getCustomers();
		
		// add the customers to the request object
		
		request.setAttribute("customer_list", customers);
		
		// use the request dispatcher 
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("view_customer_list.jsp");
		
		// forward the data to the JSP
		
		dispatcher.forward(request, response);
	}

}
