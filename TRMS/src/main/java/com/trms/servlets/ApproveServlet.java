package com.trms.servlets;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.trms.pojos.ReimbursementForm;
import com.trms.services.ReimbursementService;
import com.trms.services.ReimbursementServiceImpl;

public class ApproveServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private ReimbursementService rs = new ReimbursementServiceImpl();
       

	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession sess = req.getSession(false);
		if(sess == null || sess.getAttribute("user") == null) {
			resp.sendRedirect("login");
			return;
		}
		String name = req.getPathInfo();
		Integer roleid = (Integer) sess.getAttribute("roleid");
		
		if(name == null || name.substring(1) == "") {
			List<ReimbursementForm> formList = null;
			Integer userid = (Integer) sess.getAttribute("userid");
			
		}
	}

	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

	}

}
