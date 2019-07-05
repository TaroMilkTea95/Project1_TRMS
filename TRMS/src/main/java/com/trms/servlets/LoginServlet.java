package com.trms.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.trms.pojos.User;
import com.trms.services.UserService;
import com.trms.services.UserServiceImpl;

public class LoginServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;
	private UserService userService = new UserServiceImpl();

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession sess = req.getSession(false);
		
		if (sess != null && sess.getAttribute("user") != null) {
			Integer type = (Integer) sess.getAttribute("roleid");
			if (type.equals(1)) {
				resp.sendRedirect("EmployeeHome.html");
		} else {
			resp.sendRedirect("SupervisorHome.html");
		}
		} else {
			resp.sendRedirect("Login.html");
		}
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String username = req.getParameter("username");
		String password = req.getParameter("pass");
		User user = userService.loginUser(username, password);
		
		User u = userService.getAllUsers(username);
				
		if (user == null) {
			resp.setStatus(401);
			resp.getWriter().write("Failed Login");
		} else {
			HttpSession sess = req.getSession(true);
			sess.setAttribute("User", user);
			sess.setAttribute("userid", u.getUserid());
			sess.setAttribute("roleid", u.getRoleid());
			
			if(u.getRoleid().equals(4)) {
				resp.sendRedirect("BencCo.html");			
			} else if (u.getRoleid().equals(3)) {
				resp.sendRedirect("HeadHome.html");	
			} else if (u.getRoleid().equals(2)) {
				resp.sendRedirect("SupervisorHome.html");		
			} else {
				resp.sendRedirect("EmployeeHome.html");
			}
		}
	}
}
