package com.kodewala.model;

import java.util.Scanner;

import com.kodewala.service.CartService;
import com.kodewala.service.CheckoutService;
import com.kodewala.service.OutOfStockException;
import com.kodewala.service.ProductService;

public class Driver {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		ProductService productService = new ProductService();
		CartService cartService = new CartService();
		CheckoutService checkoutService = new CheckoutService();

		productService.loadProducts(); // Step 1

		while (true) {

			System.out.println("\n==== MENU ====");
			System.out.println("1. View Products");
			System.out.println("2. Search Product");
			System.out.println("3. Sort by Assending");
			System.out.println("4. Sort by Dessending");
			System.out.println("5. Add to Cart");
			System.out.println("6. Remove from Cart");
			System.out.println("7. View Cart");
			System.out.println("8. Checkout");
			System.out.println("9. Exit");

			int choice = sc.nextInt();

			switch (choice) {

			case 1:
				productService.displayProducts();
				break;

			case 2:
				sc.nextLine();
				System.out.print("Enter name: ");
				String name = sc.nextLine();
				productService.searchByName(name).forEach(System.out::println);
				break;

			case 3:

				productService.sortByPriceAscending().forEach(n -> System.out.println(n));
				break;

			case 4:

				productService.sortByPriceDescending().forEach(n -> System.out.println(n));
				break;

//                    System.out.println("1. Ascending  2. Descending");
//                    int sortChoice = sc.nextInt();
//                    productService.sortByPrice(sortChoice == 1);
//                    System.out.println("Sorted successfully.");

			case 5:
				System.out.print("Enter Product ID: ");
				int id = sc.nextInt();
				System.out.print("Enter Quantity: ");
				int qty = sc.nextInt();
				Product product = productService.getProductById(id);
				if (product != null)
					cartService.addToCart(product, qty);
				else
					System.out.println("Invalid ID");
				break;

			case 6:
				System.out.print("Enter Product ID: ");
				int rid = sc.nextInt();
				Product remove = productService.getProductById(rid);
				if (remove != null)
					cartService.removeFromCart(remove);
				break;

			case 7:
				cartService.viewCart();
				break;

			case 8:
				try {
					checkoutService.checkout(cartService);
				} catch (OutOfStockException e) {
					System.out.println(e.getMessage());
				}
				break;

			case 9:
				System.out.println("Thank you! Visit once again ");
				System.exit(0);

			default:
				System.out.println("Invalid choice!");
			}
		}
	}
}
