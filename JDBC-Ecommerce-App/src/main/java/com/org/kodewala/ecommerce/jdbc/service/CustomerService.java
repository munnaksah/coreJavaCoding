package com.org.kodewala.ecommerce.jdbc.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.org.kodewala.ecommerce.jdbc.entities.Customer;
import com.org.kodewala.ecommerce.jdbc.exception.CustomerNotFoundException;

public class CustomerService {
	public List<Customer> getCustomersFromDatabase(Connection connection){
		List<Customer> customers = new ArrayList<Customer>();
		try {
			String query = "Select * from customers";
			PreparedStatement stmt = connection.prepareStatement(query);
			ResultSet resultSet = stmt.executeQuery();
			while (resultSet.next()) {
				int id = resultSet.getInt(1);
				String firstName = resultSet.getString(2);
				String lastName = resultSet.getString(3);
				String address=resultSet.getString(4);
				String phoneNumber=resultSet.getString(5);
				
				Customer customer=new Customer(id, firstName, lastName, address, phoneNumber);
				customers.add(customer);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return customers;
	}
	
	public List<Customer> showAllCustomers(Connection connection) {
	    List<Customer> customers = getCustomersFromDatabase(connection);
	    
	    System.out.println("\n=============================================");
	    System.out.println("                CUSTOMER LIST                ");
	    System.out.println("=============================================");
	    
	    System.out.printf("%-15s | %-25s%n", "Customer ID", "Customer Name");
	    System.out.println("---------------------------------------------");
	    
	    for(Customer customer: customers) {
	        String fullName = customer.getFirstName() + " " + customer.getLastName();
	        
	        System.out.printf("%-15d | %-25s%n", customer.getCustomerId(), fullName);
	    }
	    
	    System.out.println("=============================================\n");
	    
	    return customers;
	}
	
	public Customer getCustomer(List<Customer> customers,int customerId) throws CustomerNotFoundException {
		Customer customer=customers.stream().filter(cust->cust.getCustomerId()==customerId).findFirst().orElse(null);
		if(customer==null) {
			throw new CustomerNotFoundException("Customer not found!! Please try again");
		}else {
			return customer;
		}
	}
}
