package com.org.kodewala.ecommerce.jdbc.service;

import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;
import com.opencsv.exceptions.CsvException;

public class CSVToDatabaseService {
	private static final String PRODUCTS_CSV_FILE_PATH = "C:\\Users\\SCL\\Downloads\\products.csv";
	private static final String CUSTOMERS_CSV_FILE_PATH = "C:\\Users\\SCL\\Downloads\\customers.csv";

	public static List<String[]> readAllDataAtOnce(String file) {
		FileReader filereader;
		List<String[]> allData = null;
		try {
			filereader = new FileReader(file);
			CSVReader csvReader = new CSVReaderBuilder(filereader).withSkipLines(1).build();
			allData = csvReader.readAll();
		} catch (IOException | CsvException e) {
			System.out.println(e.getMessage());
		}
		return allData;

	}

	public static void processProductsCSV(Connection connection) {
		List<String[]> csvData = readAllDataAtOnce(PRODUCTS_CSV_FILE_PATH);
		String sql = "INSERT IGNORE INTO products (product_id, product_name, price, stock) VALUES (?, ?, ?, ?)";
		PreparedStatement smt = null;
		try {
			smt = connection.prepareStatement(sql);
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		for (String row[] : csvData) {
			try {
				smt.setInt(1, Integer.parseInt(row[0]));
				smt.setString(2, row[1]);
				smt.setDouble(3, Double.parseDouble(row[2]));
				smt.setInt(4, Integer.parseInt(row[3]));
				smt.addBatch();
			} catch (SQLException e) {
				System.out.println(e.getMessage());
			}
		}
		try {
			smt.executeBatch();
			System.out.println("Product batch executed successfully");
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}

	public static void processCustomersCSV(Connection connection) {
		List<String[]> csvData = readAllDataAtOnce(CUSTOMERS_CSV_FILE_PATH);
		String sql = "INSERT IGNORE INTO customers (customer_id, first_name,last_name, address, phone_number) VALUES (?, ?, ?, ?,?)";
		PreparedStatement smt = null;
		try {
			smt = connection.prepareStatement(sql);
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		for (String row[] : csvData) {
			try {
				smt.setInt(1, Integer.parseInt(row[0]));
				smt.setString(2, row[1]);
				smt.setString(3, row[2]);
				smt.setString(4, row[3]);
				smt.setString(5, row[4]);
				smt.addBatch();
			} catch (SQLException e) {
				System.out.println(e.getMessage());
			}
		}
		try {
			smt.executeBatch();
			System.out.println("Customer batch executed successfully");
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}
}
