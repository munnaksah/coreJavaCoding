//package com.kodewala.academy.jdbcPrep.ft;
//
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.PreparedStatement;
//import java.sql.SQLException;
//
//public class FundTransfer {
//n {
//
//	public void doFundTransfer(String from, String to, int amount) throws ClassNotFoundException, SQLExceptio
//		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/user_db", "root", "root");
//
//		String balanceQuery = "select amount from balance where user_id=  ?";                                 
//		// DEBIT
//		String query = "update balance set amount = ? where user_id = ?";
//
//		PreparedStatement ps = con.prepareStatement(query);
//  		ps.setInt(1, amount);
//		ps.setString(2, from);
//		int recordsUpdated = ps.executeUpdate();
//
//		if (recordsUpdated > 0) {
//			System.out.println("Amount " + amount + ", has been deducted from user " + from);
//
//		}
//		// CREDIT
//		ps = con.prepareStatement(query);
//		ps.setInt(1, amount);
//		ps.setString(2, to);
//
//		recordsUpdated = ps.executeUpdate();
//		if (recordsUpdated > 0) {
//			System.out.println("Amount " + amount + ", has been credited from user " + to);
//
//		}
//
//	}
//
//}
