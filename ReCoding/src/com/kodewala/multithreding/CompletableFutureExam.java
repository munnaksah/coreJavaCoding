package com.kodewala.multithreding;

import java.util.concurrent.CompletableFuture;
//CompletableFutureExam return the value

public class CompletableFutureExam {
    public static void main(String[] args) {
		CompletableFuture<Integer> future =  CompletableFuture.supplyAsync(()->{
			return 10+20;
		});
	Integer result =	future.join();
	System.out.println(result);
	}

}
