package com.kodewala.academy.jdbcPrep;

import java.io.BufferedReader;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class JDBCCon {
	public static void main(String[] args) {

		String file = "customers.csv";

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/customerdb", "root", "root");
			System.out.println("database connection succesful");
			String validSqlQuery = "INSERT INTO customer_info VALUES(?,?,?,?,?,?,?,?,?,?)";

			String invalidSqlQuery = "INSERT INTO customer_info_invalid VALUES(?,?,?,?,?,?,?,?,?,?,?)";

			PreparedStatement validPS = con.prepareStatement(validSqlQuery);
			PreparedStatement invalidPS = con.prepareStatement(invalidSqlQuery);

			BufferedReader br = new BufferedReader(new FileReader(file));

			String line;

			br.readLine(); // skip header

			int batchSize = 100;
			int count = 0;

			while ((line = br.readLine()) != null) {
				 System.out.println(line);

				String[] data = line.split(",");

				if (data.length < 10) {
//				        System.out.println("Skipping invalid row: " + line);
					continue;
				}

				String id = data[0];
				String first = data[1];
				String last = data[2];
				String email = data[3];
				String phone = data[4];
				String city = data[5];
				String state = data[6];
				String country = data[7];
				String signup = data[8];
				String status = data[9];

				boolean valid = true;
				String reason = "";

				// Rule 1: ID must be number
				if (!id.matches("\\d+")) {
					valid = false;
					reason = "Invalid Customer ID";
				}

				// Rule 2: Name validation
				if (first.isEmpty() || last.isEmpty()) {
					valid = false;
					reason = "Name missing";
				}

				// Rule 3: Email validation
				if (!email.contains("@")) {
					valid = false;
					reason = "Invalid Email";
				}

				if (valid) {
					

				    System.out.println("Adding valid record: " + id);

				    validPS.setInt(1, Integer.parseInt(id));

					validPS.setInt(1, Integer.parseInt(id));
					validPS.setString(2, first);
					validPS.setString(3, last);
					validPS.setString(4, email);
					validPS.setString(5, phone);
					validPS.setString(6, city);
					validPS.setString(7, state);
					validPS.setString(8, country);
					validPS.setString(9, signup);
					validPS.setString(10, status);

					validPS.addBatch();

				} else {

					invalidPS.setString(1, id);
					invalidPS.setString(2, first);
					invalidPS.setString(3, last);
					invalidPS.setString(4, email);
					invalidPS.setString(5, phone);
					invalidPS.setString(6, city);
					invalidPS.setString(7, state);
					invalidPS.setString(8, country);
					invalidPS.setString(9, signup);
					invalidPS.setString(10, status);
					invalidPS.setString(11, reason);

					invalidPS.addBatch();
				}
			}

			count++;

			if (count % batchSize == 0) {
				validPS.executeBatch();
				invalidPS.executeBatch();
				System.out.println("Batch executed for " + count + " records");

			}

			// execute remaining records
			validPS.executeBatch();
			invalidPS.executeBatch();
			System.out.println("Executing batch...");

			System.out.println("Processing Completed");

			br.close();
			validPS.close();
			invalidPS.close();
			con.close();

		} catch (Exception e) {
			e.printStackTrace();

		}

	}
}
