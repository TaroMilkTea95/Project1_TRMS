package com.trms.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.trms.connections.ConnectionFactory;
import com.trms.connections.LoggingUtil;
import com.trms.pojos.ReimbursementForm;

import main.java.com.revature.dao.ReimburseForm;

public class ReimbursementDaoImpl implements ReimbursementDao {

	private static Connection conn = ConnectionFactory.getConnection();

	@Override
	public void submitForm(ReimbursementForm rf) {
		try {
			conn.setAutoCommit(false);
			String query = "insert into reimbursement_form "
					+ "(firstname, lastname, date_of_event, time_of_event, "
					+ "location_of_event, description, event_cost, grading_format, type_of_event, additional_comment) values"
					+ "(?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
			PreparedStatement pstmt = conn.prepareStatement(query);

			pstmt.setString(1, rf.getFirstname());
			pstmt.setString(2, rf.getLastname());
			pstmt.setString(3, rf.getDate_of_event());
			pstmt.setString(4, rf.getTime_of_event());
			pstmt.setString(5, rf.getLocation_of_event());
			pstmt.setString(6, rf.getDescription());
			pstmt.setString(7, rf.getEvent_cost());
			pstmt.setString(8, rf.getGrading_format());
			pstmt.setString(9, rf.getType_of_event());
			pstmt.setString(10, rf.getComments());

			pstmt.execute();
			conn.commit();
			conn.setAutoCommit(true);
			LoggingUtil.info("Form Submitted");
		} catch (SQLException e) {
			LoggingUtil.info("SQLException");
			e.printStackTrace();
		}

	}

	@Override
	public ReimbursementForm getFormById(Integer formid) {

		ReimbursementForm re = null;
		String sql = "select * from reimbursement_form where reimbursement_form_id =" + formid;
		try {
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			if (rs.next()) {
				re = new ReimbursementForm(rs.getInt("formid"), rs.getInt("userid"), rs.getString("firstname"), rs.getString("lastname"),
						rs.getString("date_of_event"), rs.getString("time_of_event"), rs.getString("location_of_event"),
						rs.getString("description"), rs.getString("event_cost"), rs.getString("grading_format"), rs.getString("type_of_event"), 
						rs.getString("comments"), rs.getString("status"));
						
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return re;
	}

	@Override
	public List<ReimbursementForm> viewBySupervisorId(Integer id) {
		
		ArrayList<ReimbursementForm> formList = new ArrayList<>();
		String sql = "select * from reimbursement_form where status = 'pending'";
		Statement stmt;
		try {
			conn.setAutoCommit(false);
			stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			
			while (rs.next()) {
				formList.add(new ReimbursementForm(rs.getInt("formid"), rs.getInt("userid"), rs.getString("firstname"), rs.getString("lastname"),
						rs.getString("date_of_event"), rs.getString("time_of_event"), rs.getString("location_of_event"),
						rs.getString("description"), rs.getString("event_cost"), rs.getString("grading_format"), rs.getString("type_of_event"), 
						rs.getString("comments"), rs.getString("status")));
			}
			conn.commit();
			conn.setAutoCommit(true);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return formList;
	}

	@Override
	public List<ReimbursementForm> viewByHead(Integer id) {
		
		ArrayList<ReimbursementForm> formList = new ArrayList<>();
		String sql = "select * from reimbursement_form where status = 'supervisor-pending'";
		Statement stmt;
		try {
			conn.setAutoCommit(false);
			stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			
			while (rs.next()) {
				formList.add(new ReimbursementForm(rs.getInt("formid"), rs.getInt("userid"), rs.getString("firstname"), rs.getString("lastname"),
						rs.getString("date_of_event"), rs.getString("time_of_event"), rs.getString("location_of_event"),
						rs.getString("description"), rs.getString("event_cost"), rs.getString("grading_format"), rs.getString("type_of_event"), 
						rs.getString("comments"), rs.getString("status")));
			}
			conn.commit();
			conn.setAutoCommit(true);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return formList;
	}

	@Override
	public List<ReimbursementForm> viewByBenCo(Integer id) {
		
		ArrayList<ReimbursementForm> formList = new ArrayList<>();
		String sql = "select * from reimbursement_form where status = 'head-pending'";
		Statement stmt;
		try {
			conn.setAutoCommit(false);
			stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			
			while (rs.next()) {
				formList.add(new ReimbursementForm(rs.getInt("formid"), rs.getInt("userid"), rs.getString("firstname"), rs.getString("lastname"),
						rs.getString("date_of_event"), rs.getString("time_of_event"), rs.getString("location_of_event"),
						rs.getString("description"), rs.getString("event_cost"), rs.getString("grading_format"), rs.getString("type_of_event"), 
						rs.getString("comments"), rs.getString("status")));
			}
			conn.commit();
			conn.setAutoCommit(true);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return formList;
	}

	@Override
	public void supervisorApprove(Integer formid) {
		try {
			PreparedStatement pstmt = conn.prepareStatement("update reimbursement_form set status = 'supervisor-pending' where reimbursement_form_id = ?");
			pstmt.setInt(1, formid);
			pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void supervisorDeny(Integer formid) {
		try {
			PreparedStatement pstmt = conn.prepareStatement("update reimbursement_form set status = 'supervisor-denied' where reimbursement_form_id = ?");
			pstmt.setInt(1, formid);
			pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void headApprove(Integer formid) {
		try {
			PreparedStatement pstmt = conn.prepareStatement("update reimbursement_form set status = 'head-pending' where reimbursement_form_id = ?");
			pstmt.setInt(1, formid);
			pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void headDeny(Integer formid) {
		try {
			PreparedStatement pstmt = conn.prepareStatement("update reimbursement_form set status = 'head-denied' where reimbursement_form_id = ?");
			pstmt.setInt(1, formid);
			pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	@Override
	public void benCoApprove(Integer formid) {
		try {
			PreparedStatement pstmt = conn.prepareStatement("update reimbursement_form set status = 'benco-pending' where reimbursement_form_id = ?");
			pstmt.setInt(1, formid);
			pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void benCoDeny(Integer formid) {
		try {
			PreparedStatement pstmt = conn.prepareStatement("update reimbursement_form set status = 'benco-denied' where reimbursement_form_id = ?");
			pstmt.setInt(1, formid);
			pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public List<ReimbursementForm> viewFormByEmployeeId(Integer id) {
		
		ArrayList<ReimbursementForm> formList = new ArrayList<>();
		String sql = "select * from reimbursement_form where status = 'benco-pending' and userid = " + id;
		Statement stmt;
		try {
			conn.setAutoCommit(false);
			stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			
			while (rs.next()) {
				formList.add(new ReimbursementForm(rs.getInt("formid"), rs.getInt("userid"), rs.getString("firstname"), rs.getString("lastname"),
						rs.getString("date_of_event"), rs.getString("time_of_event"), rs.getString("location_of_event"),
						rs.getString("description"), rs.getString("event_cost"), rs.getString("grading_format"), rs.getString("type_of_event"), 
						rs.getString("comments"), rs.getString("status")));
			}
			conn.commit();
			conn.setAutoCommit(true);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return formList;
	}
}
