package com.org.kodewala.ecommerce.jdbc.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class OrderHistoryService {

	public void viewOrderHistory(Connection connection, int customerId) {
	    String orderQuery = "SELECT order_id, order_date, total_amount, status " +
	                        "FROM orders WHERE customer_id = ? ORDER BY order_date DESC";
	    
	    String itemQuery = "SELECT p.product_name, oi.quantity, oi.price " +
	                       "FROM order_items oi JOIN products p ON oi.product_id = p.product_id " +
	                       "WHERE oi.order_id = ?";

	    try (PreparedStatement orderStmt = connection.prepareStatement(orderQuery)) {
	        orderStmt.setInt(1, customerId);

	        try (ResultSet orderRs = orderStmt.executeQuery()) {
	            boolean hasOrders = false;

	            System.out.println("\n===============================================================");
	            System.out.println("                      YOUR ORDER HISTORY                       ");
	            System.out.println("===============================================================");

	            while (orderRs.next()) {
	                hasOrders = true;
	                int orderId = orderRs.getInt(1);
	                
	                // Truncate the timestamp slightly if it's too long, or just print as string
	                String orderDate = orderRs.getString(2); 
	                double totalAmount = orderRs.getDouble(3);
	                String status = orderRs.getString(4);

	                // Order Header
	                System.out.printf("ORDER ID : #%-15d DATE  : %-20s%n", orderId, orderDate);
	                System.out.printf("STATUS   : %-15s TOTAL : $%.2f%n", status, totalAmount);
	                System.out.println("---------------------------------------------------------------");
	                
	                // Items Table Header
	                System.out.printf("%-30s | %-10s | %-15s%n", "Item Name", "Quantity", "Price Each");
	                System.out.println("---------------------------------------------------------------");

	                try (PreparedStatement itemStmt = connection.prepareStatement(itemQuery)) {
	                    itemStmt.setInt(1, orderId);
	                    try (ResultSet itemRs = itemStmt.executeQuery()) {
	                        while (itemRs.next()) {
	                            String productName = itemRs.getString(1);
	                            int qty = itemRs.getInt(2);
	                            double price = itemRs.getDouble(3);
	                            
	                            // Formatted item row
	                            System.out.printf("%-30s | %-10d | $%-14.2f%n", productName, qty, price);
	                        }
	                    }
	                }
	                // Separator between different orders
	                System.out.println("===============================================================");
	            }

	            if (!hasOrders) {
	                System.out.println("             You have not placed any orders yet.               ");
	                System.out.println("===============================================================");
	            }
	            System.out.println(); // Extra blank line for spacing
	        }

	    } catch (SQLException e) {
	        System.out.println("Database error occurred while fetching your order history.");
	        e.printStackTrace();
	    }
	}
}