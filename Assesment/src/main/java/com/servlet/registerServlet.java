package com.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import com.dao.registerDao;
import com.javabeans.registerbean;


@WebServlet("/registerServlet")
public class registerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String empid = request.getParameter("empid");
		String empname = request.getParameter("empname");
		String email = request.getParameter("email");
		
		registerbean rg = new registerbean();
		rg.setEmpid(empid);
		rg.setEmpname(empname);
		rg.setEmail(email);
		
		registerDao newemp = new registerDao();
		newemp.insert(rg);
		
		response.sendRedirect("login.jsp");
	}

}
