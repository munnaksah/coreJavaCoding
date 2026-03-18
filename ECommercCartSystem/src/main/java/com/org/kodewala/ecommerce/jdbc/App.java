package com.org.kodewala.ecommerce.jdbc;

import java.sql.Connection;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import com.org.kodewala.ecommerce.jdbc.entities.Customer;
import com.org.kodewala.ecommerce.jdbc.entities.Product;
import com.org.kodewala.ecommerce.jdbc.exception.CustomerNotFoundException;
import com.org.kodewala.ecommerce.jdbc.service.CSVToDatabaseService;
import com.org.kodewala.ecommerce.jdbc.service.CartService;
import com.org.kodewala.ecommerce.jdbc.service.CheckoutService;
import com.org.kodewala.ecommerce.jdbc.service.ConnectionService;
import com.org.kodewala.ecommerce.jdbc.service.CustomerService;
import com.org.kodewala.ecommerce.jdbc.service.OrderHistoryService;
import com.org.kodewala.ecommerce.jdbc.service.ProductService;

public class App {
	public static void main(String[] args) {
		Connection connection=ConnectionService.getConnection();
		CSVToDatabaseService.processProductsCSV(connection);
		CSVToDatabaseService.processCustomersCSV(connection);
		
		CustomerService customerService = new CustomerService();
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to our e-commerce website");
		System.out.println("List of available customers are as follows: ");
		List<Customer> customers = customerService.showAllCustomers(connection);
		System.out.println("Please enter the customer Id before proceeding");
		Customer selectedCustomer=null;
		while (true) {
			try {
				int selectedCustomerId = sc.nextInt();
				selectedCustomer=customerService.getCustomer(customers, selectedCustomerId);
				break;
			} catch (InputMismatchException e) {
				System.out.println("Wrong input!! please try again");
				sc.nextLine(); 
			}catch (CustomerNotFoundException e) {
				System.out.println(e.getMessage());
			}
		}
		
		ProductService productService=new ProductService();
		List<Product> products=productService.getProductsFromDatabase(connection);
		CartService cartService=new CartService();
		CheckoutService checkoutService=new CheckoutService();
		OrderHistoryService orderHistoryService=new OrderHistoryService();
		
		System.out.println("Press 1 to see available products");
		System.out.println("Press 2 to search availble products");
		System.out.println("Press 3 to sort products by price low-high");
		System.out.println("Press 4 to sort products by price high-low");
		System.out.println("Press 5 to add product to cart");
		System.out.println("Press 6 to remove product from cart");
		System.out.println("Press 7 to update quantity of product from cart");
		System.out.println("Press 8 to check cart");
		System.out.println("Press 9 to check-out");
		System.out.println("Press 10 to show order history");
		System.out.println("Press 11 to exit");
		while (true) {
			System.out.print("Please select an option : ");
			try {
				int selectedOption = sc.nextInt();
				switch (selectedOption) {
				case 1:
					productService.printProductList(products);
					break;
				case 2:
					String keyWord = sc.next();
					productService.findProductByKeyWord(products, keyWord);
					break;
				case 3:
					productService.sortProducts(products,true);
					break;
				case 4:
					productService.sortProducts(products,false);
					break;
				case 5:
					cartService.addProductToCart(products, sc, connection, selectedCustomer.getCustomerId());
					break;
				case 6:
					cartService.removeProductFromCart(sc, connection, selectedCustomer.getCustomerId());
					break;
				case 7:
					cartService.updateProductQuantityInCart(products,sc, connection, selectedCustomer.getCustomerId());
					break;
				case 8:
					cartService.seeCart(connection, selectedCustomer.getCustomerId());
					break;
				case 9:
					checkoutService.doCheckout(connection, selectedCustomer.getCustomerId());
					products=productService.getProductsFromDatabase(connection);
					break;
				case 10:
					orderHistoryService.viewOrderHistory(connection, selectedCustomer.getCustomerId());
					break;
				case 11:
					System.out.println("Thanks for using the website!!");
					connection.close();
					System.exit(0);
					break;
				default:
					System.out.println("Wrong option, please try again!");
					break;
				}

			} catch (InputMismatchException e) {
				System.out.println("Invalid input! Please try again.");
				sc.nextLine(); 
				
			}catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}
}
