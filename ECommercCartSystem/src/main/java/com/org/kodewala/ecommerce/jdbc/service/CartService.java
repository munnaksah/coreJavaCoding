package com.org.kodewala.ecommerce.jdbc.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

import com.org.kodewala.ecommerce.jdbc.entities.Product;
import com.org.kodewala.ecommerce.jdbc.exception.EmptyCartException;
import com.org.kodewala.ecommerce.jdbc.exception.OutOfStockException;
import com.org.kodewala.ecommerce.jdbc.exception.ProductNotFoundException;

public class CartService {

	public void seeCart(Connection connection, int customerId) throws EmptyCartException {
	    String query = "SELECT p.product_id, p.product_name, c.quantity, p.price " + 
	                   "FROM cart c " +
	                   "JOIN products p ON c.product_id = p.product_id " + 
	                   "WHERE c.customer_id = ?";

	    try (PreparedStatement stmt = connection.prepareStatement(query)) {
	        stmt.setInt(1, customerId);

	        try (ResultSet rs = stmt.executeQuery()) {
	            boolean isCartEmpty = true;
	            double grandTotal = 0.0;

	            while (rs.next()) {
	                // Print the header only once when the first item is found
	                if (isCartEmpty) {
	                    System.out.println("\n===============================================================");
	                    System.out.println("                          YOUR CART                            ");
	                    System.out.println("===============================================================");
	                    // The %-10s means "pad with spaces to make it exactly 10 characters wide, aligned left"
	                    System.out.printf("%-10s | %-25s | %-8s | %-12s%n", "Product ID", "Product Name", "Quantity", "Total Price");
	                    System.out.println("---------------------------------------------------------------");
	                    isCartEmpty = false;
	                }

	                int productId = rs.getInt(1);
	                String name = rs.getString(2);
	                int qty = rs.getInt(3);
	                double price = rs.getDouble(4);

	                double itemTotal = price * qty;
	                grandTotal += itemTotal;

	                // Print each item row beautifully aligned
	                System.out.printf("%-10d | %-25s | %-8d | $%-11.2f%n", productId, name, qty, itemTotal);
	            }

	            if (isCartEmpty) {
	                throw new EmptyCartException("Your cart is empty. Time to do some shopping!");
	            } else {
	                // Print the final grand total footer
	                System.out.println("===============================================================");
	                // The %48s pushes the text to the right to align nicely under the columns
	                System.out.printf("%48s: $%.2f%n", "GRAND TOTAL", grandTotal);
	                System.out.println("===============================================================");
	            }
	        }
	    } catch (SQLException e) {
	        System.out.println("Database error occurred while fetching your cart.");
	        e.printStackTrace();
	    }
	}

	public void addProductToCart(List<Product> products, Scanner sc, Connection connection, int customerId)
	        throws ProductNotFoundException, OutOfStockException, SQLException {

	    System.out.print("Type the product id you want to add to cart: ");
	    int productId = sc.nextInt();

	    ProductService productService = new ProductService();
	    Product product = productService.getProductById(products, productId);

	    System.out.print("Enter quantity you want to add to cart: ");
	    int quantity = sc.nextInt();

	    int currentCartQty = 0;
	    String checkCartSql = "SELECT quantity FROM cart WHERE customer_id = ? AND product_id = ?";
	    try (PreparedStatement checkStmt = connection.prepareStatement(checkCartSql)) {
	        checkStmt.setInt(1, customerId);
	        checkStmt.setInt(2, product.getProductId());
	        try (ResultSet rs = checkStmt.executeQuery()) {
	            if (rs.next()) {
	                currentCartQty = rs.getInt("quantity");
	            }
	        }
	    }

	    if ((currentCartQty + quantity) > product.getStock()) {
	        throw new OutOfStockException("Cannot add to cart. We only have " + product.getStock() + 
	                                      " in stock.");
	    }

	    String sql = "INSERT INTO cart (customer_id, product_id, quantity) VALUES (?, ?, ?) "
	            + "ON DUPLICATE KEY UPDATE quantity = quantity + ?";

	    try (PreparedStatement stmt = connection.prepareStatement(sql)) {
	        stmt.setInt(1, customerId);
	        stmt.setInt(2, product.getProductId());
	        stmt.setInt(3, quantity);
	        stmt.setInt(4, quantity);

	        int result = stmt.executeUpdate();

	        if (result > 0) {
	            System.out.println("Cart updated successfully!!");
	        }
	    }
	}

	public void removeProductFromCart(Scanner sc, Connection connection, int customerId)
			throws ProductNotFoundException {
		System.out.print("Type the product id you want to remove from cart: ");
		int productId = sc.nextInt();
		String deleteQuery = "DELETE FROM cart WHERE customer_id = ? AND product_id = ?";
		try (PreparedStatement pstmt = connection.prepareStatement(deleteQuery)) {
			pstmt.setInt(1, customerId);
			pstmt.setInt(2, productId);

			int rowsAffected = pstmt.executeUpdate();

			if (rowsAffected == 0) {
				throw new ProductNotFoundException("Product not found in cart, please try again");
			} else {
				System.out.println("Product successfully removed from your cart.");
			}

		} catch (SQLException e) {
			System.out.println("Database error occurred while trying to remove the product.");
			e.printStackTrace();
		}
	}

	public void updateProductQuantityInCart(List<Product> products, Scanner sc, Connection connection, int customerId)
	        throws ProductNotFoundException, OutOfStockException {
	    
	    System.out.print("Type the product id you want to update quantity in cart: ");
	    int productId = sc.nextInt();

	    ProductService productService = new ProductService();
	    Product product = productService.getProductById(products, productId);

	    System.out.print("Type the new quantity: ");
	    int qty = sc.nextInt();

	    if (qty > product.getStock()) {
	        throw new OutOfStockException("Cannot update cart. We only have " + product.getStock() + " available in stock.");
	    }

	    String updateQuery = "UPDATE cart SET quantity = ? WHERE customer_id = ? AND product_id = ?";

	    try (PreparedStatement pstmt = connection.prepareStatement(updateQuery)) {
	        pstmt.setInt(1, qty);
	        pstmt.setInt(2, customerId);
	        pstmt.setInt(3, productId);

	        int rowsAffected = pstmt.executeUpdate();

	        if (rowsAffected == 0) {
	            throw new ProductNotFoundException("Product not found in cart, please try again.");
	        } else {
	            System.out.println("Cart updated successfully with the new quantity.");
	        }

	    } catch (SQLException e) {
	        System.out.println("Database error occurred while trying to update the product quantity.");
	        e.printStackTrace();
	    }
	}
}
