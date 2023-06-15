package com.jdbclogin.servlet;

import javax.servlet.http.HttpServlet;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import com.jdbclogin.dao.UserDao;
import com.jdbclogin.daoimpl.UserDaoImpl;
import com.jdbclogin.pojo.User;

@WebServlet(urlPatterns = "/checkuser")
public class LoginControllerServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest request, 
	HttpServletResponse response) throws ServletException, IOException {
		
		String uname = request.getParameter("txtUname");
		String upass = request.getParameter("txtPass");
	
		User user = new User();
		user.setUsername(uname);
		user.setPassword(upass);
		UserDao daoImpl = new UserDaoImpl();
		boolean num=daoImpl.checkUserCredentials(user);
		System.out.println(num);
		if(num) {
			HttpSession session = request.getSession();
			session.setMaxInactiveInterval(60);
			session.setAttribute("USERNAME", uname);
			response.sendRedirect("home");
		}
		else  {
			response.sendRedirect("error?msg=loginerror");
		}	
	}
}








