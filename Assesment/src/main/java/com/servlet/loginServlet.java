package com.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dao.loginDao;
import com.javabeans.loginbean;

@WebServlet("/loginServlet")
public class loginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private loginDao ld;
	public void init() {
        ld = new loginDao();
    }
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String empid = request.getParameter("empid");
		String empname = request.getParameter("empname");
		String date = request.getParameter("date");
		
		loginbean lg = new loginbean();
		lg.setEmpid(empid);
		lg.setEmpname(empname);
		lg.setDate(date);
        HttpSession session = request.getSession(true);

		if(loginDao.check(lg))
		{
			
			loginDao.login(lg);
			session.setAttribute("loggedIn_empname", empname);
			response.sendRedirect("index.jsp");
			
		}
		else
		{
			response.sendRedirect("register.jsp");
			
		}
		
		
	}

}
