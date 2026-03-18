package com.kodewala.jdbc1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class JDBCConn {

	public static void main(String[] args) {

		try {
			// 1 . Register the driver or load driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			// 2. Create Connection
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/user_db", "root", "root");

			String sql = "INSERT INTO student(id, name, age) VALUES (?, ?, ?)";
			System.out.println("Connected Successfully!");
			// 3. Create Statement

			PreparedStatement ps = con.prepareStatement(sql);

			int batchSize = 15;
			for (int i = 0; i < 100; i++) {
				ps.setInt(1, 100);
				ps.setString(2, "Mannuk");
				ps.setInt(3, 25);
				ps.addBatch();
				System.out.println("adding to batch!");

				ps.executeUpdate();

				System.out.println("Data inserted successfully");
				if (i % batchSize == 0) {
					System.out.println("Executing the batch of " + i);
					ps.executeBatch();

				}

			}
		
			

//			System.out.println("Records Inserted!");

//			System.out.println("Table Created!");

			// 5. Close
			con.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
