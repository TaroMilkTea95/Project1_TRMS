package com.trms.connections;

import java.sql.Connection;

public class JDBCDriver {
	
	public static void main(String[] args) {
		
	Connection conn = ConnectionFactory.getConnection();
	
	}
}