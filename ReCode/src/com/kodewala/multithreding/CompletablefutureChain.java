package com.kodewala.multithreding;

import java.util.concurrent.CompletableFuture;

//completablefuture support  task chaining

public class CompletablefutureChain {
	
	public static void main(String[] args) {
		CompletableFuture<Integer> future = CompletableFuture.supplyAsync(()->10)
				.thenApply(x -> x+5)
				.thenApply(x->x*2);
				
				System.out.println(future.join());
			
	
		
		
	}

}
