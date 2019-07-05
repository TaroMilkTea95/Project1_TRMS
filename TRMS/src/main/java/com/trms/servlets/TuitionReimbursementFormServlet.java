package com.trms.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.trms.pojos.ReimbursementForm;
import com.trms.services.ReimbursementServiceImpl;
import com.trms.services.UserService;
import com.trms.services.UserServiceImpl;

public class TuitionReimbursementFormServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private ReimbursementServiceImpl rsi = new ReimbursementServiceImpl();

	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession sess = req.getSession(false);
		if (sess == null || sess.getAttribute("user") == null) {
			req.getRequestDispatcher("login").forward(req, resp);
			return;
		} else {
			resp.sendRedirect("EmployeeHome.html");
		}
	}

	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String firstname = req.getParameter("firstname");
		String lastname = req.getParameter("lastname");
		String date_of_event = req.getParameter("date_of_event");
		String time_of_event = req.getParameter("time_of_event");
		String location_of_event = req.getParameter("location_of_event");
		String description = req.getParameter("description");
		String event_cost = req.getParameter("event_cost");
		String grading_format = req.getParameter("grading_format");
		String type_of_event = req.getParameter("type_of_event");
		String comments = req.getParameter("additional_comments");
		
		HttpSession sess = req.getSession(false);
		if (sess == null || sess.getAttribute("user") == null) {
			req.getRequestDispatcher("login").forward(req, resp);
			return;
		}
		
		ReimbursementForm reimbursementForm = new ReimbursementForm((Integer)sess.getAttribute("roleid"), null, firstname, lastname, date_of_event, time_of_event, 
				location_of_event, description, event_cost, grading_format, type_of_event, comments);
		rsi.createReimbursementForm(reimbursementForm);
		resp.sendRedirect("EmployeeHome.html");
	}
}
