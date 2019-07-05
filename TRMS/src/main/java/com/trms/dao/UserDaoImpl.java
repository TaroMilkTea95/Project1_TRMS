package com.trms.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.trms.connections.ConnectionFactory;
import com.trms.connections.LoggingUtil;
import com.trms.pojos.User;

public class UserDaoImpl implements UserDao {

	private Connection conn = ConnectionFactory.getConnection();

	@Override
	public User getUserByUsername(String username) {
		User u = null;
		String sql = "select * from user_table where username = '" + username + "'";
		Statement smt;
		
		try {
			conn.setAutoCommit(false);
			smt = conn.createStatement();
			ResultSet rs = smt.executeQuery(sql);

			if (rs.next()) {
				u = new User();

				u.setUserid(rs.getInt("userid"));
				u.setRoleid(rs.getInt("roleid"));
				u.setUsername(rs.getString("username"));
				u.setPassword(rs.getString("password"));
				u.setFirstname(rs.getString("firstname"));
				u.setLastname(rs.getString("lastname"));
				u.setPhone(rs.getString("phone"));
				u.setEmail(rs.getString("email"));
				u.setBalance(rs.getInt("balance"));
				
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return u;
	}

	@Override
	public ArrayList<User> getAllUsers() {
		ArrayList<User> userList = new ArrayList<User>();
		String sql = "select username, pass from user_table";
		
		Statement stmt;
		try {
			stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql);

			while(rs.next()) {
				userList.add(new User(rs.getString(1), rs.getString(2)));
			}

		} catch (SQLException e) {
			LoggingUtil.error("Failed to get all users");
			e.printStackTrace();
		}

		return userList;
	}
}
