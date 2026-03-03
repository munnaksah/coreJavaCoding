package com.kodewala.service;

import java.util.*;

import com.kodewala.model.Product;

public class CartService
{

     Map<Product, Integer> cart = new HashMap<>();

    public void addToCart(Product product, int quantity)
    {
// if stock is less than of quantity of item or product . it will give 
        if (product.getStock() < quantity)
        {
            System.out.println("Insufficient stock");
           
        }

        cart.put(product,cart.getOrDefault(product, 0) + quantity);

        System.out.println(" succesfully Added to cart.");
    }

    public void removeFromCart(Product product) 
    {

        if (cart.containsKey(product)) {
            cart.remove(product);
            System.out.println("Removed from cart.");
        } else {
            System.out.println("Product not availbable  in the  cart.");
        }
    }

    public void updatedQuantity(Product product, int quantity) {

        if (!cart.containsKey(product)) 
        {
            System.out.println("Product not availbable in cart.");
         
        }

        if (quantity <= 0)
        {
            cart.remove(product);
        } else {
            cart.put(product, quantity);
        }

        System.out.println("Quantity updated.");
    }

    public void viewCart()
    {

        if (cart.isEmpty())
        {
            System.out.println("Cart is empty or nothing is here  .");
            
        }

        cart.forEach((product, qty) ->
                System.out.println(product.getName() +  " | Qty: " + qty + " | ₹" + product.getPrice() * qty));

        System.out.println("Total: ₹" + calculateTotal());
    }

    public double calculateTotal()
    {
        return cart.entrySet()
                .stream()
                .mapToDouble(e -> e.getKey().getPrice() * e.getValue())
                .sum();
    }

    public Map<Product, Integer> getCart() 
    {
        return cart;
    }

    public void clearCart() 
    {
        cart.clear();
    }
}

