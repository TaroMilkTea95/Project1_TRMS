package com.trms.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.trms.pojos.User;

public class HomeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		HttpSession sess = req.getSession(false);
		if(sess == null || sess.getAttribute("user") == null) {
			req.getRequestDispatcher("Login").forward(req, resp);
			return;
		}
		User user = (User) sess.getAttribute("user");
		
		String username = user.getUsername();
		String password = user.getPassword();
		System.out.println("username " + username + " password: " + password);
		
		if(user != null) {
			resp.getWriter().write("<h2>Welcome " + user.getUsername() + " </h1><br><a href=\"Logout\"/>Logout</a>");
		}
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req, resp);
	}

}
