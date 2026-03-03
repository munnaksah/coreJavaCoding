   package com.kodewala.service;


import java.util.Map;

import com.kodewala.model.Product;

public class CheckoutService {

    public void checkout(CartService cartService) throws OutOfStockException {

        Map<Product, Integer> cart = cartService.getCart();

        if (cart.isEmpty()) {
            System.out.println("Cart is empty.");
           
        }

        for (Map.Entry<Product, Integer> entry : cart.entrySet()) {

            Product product = entry.getKey();
            int qty = entry.getValue();

            if (product.getStock() < qty) {
                throw new OutOfStockException(
                        product.getName() + " stock insufficient!");
            }

            product.setStock(product.getStock() - qty);
        }

        System.out.println("===== FINAL BILL =====");
        cartService.viewCart();
        System.out.println("Purchase successful!");

        cartService.cleanCart();
    }
}

