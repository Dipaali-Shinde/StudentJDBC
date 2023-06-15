package com.jdbclogin.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.jdbclogin.dao.UserDao;
import com.jdbclogin.daoimpl.UserDaoImpl;
import com.jdbclogin.pojo.User;

@WebServlet(urlPatterns = "/reguser")
public class RegControllerServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest request, 
	HttpServletResponse response) throws ServletException, IOException {
		
		String uname = request.getParameter("txtUname");
		String upass = request.getParameter("txtPass");
		
		User user = new User();
		user.setUsername(uname);
		user.setPassword(upass);
		
		UserDao daoImpl = new UserDaoImpl();
		
		if(daoImpl.addNewUser(user)) {
			response.sendRedirect("success?msg=regsuccess");
		}
		else  {
			response.sendRedirect("error?msg=regerror");
		}	
	}
}








