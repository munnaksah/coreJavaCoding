package com.org.kodewala.ecommerce.jdbc.service;

import java.lang.System.Logger;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.LogManager;

public class ConnectionService {
	
//
//    private static final Logger logger = LogManager.getLogger(DBConnection.class);
    
    
	private static final String DB_URL = "jdbc:mysql://localhost:3306/ecommerce_databases?rewriteBatchedStatements=true";
	private static final String DB_USER = "root";
	private static final String DB_PASSWORD = "root";
	
	public static Connection getConnection() {
		Connection connection=null;
		try {
			connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/ecommerce_databases", "root","root");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return connection;
	}
}
