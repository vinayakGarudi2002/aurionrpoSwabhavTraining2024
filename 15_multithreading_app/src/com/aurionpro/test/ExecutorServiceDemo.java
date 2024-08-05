package com.aurionpro.test;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import com.aurionpro.model.Task;

public class ExecutorServiceDemo {
	
	

	public static void main(String[] args) {
		int coureCount=Runtime.getRuntime().availableProcessors();
		// TODO Auto-generated method stub
		System.out.println("Available Processors "+coureCount);
		ExecutorService service = Executors.newFixedThreadPool(coureCount);
		ExecutorService service1 = Executors.newCachedThreadPool();
		ExecutorService service2 = Executors.newSingleThreadExecutor();
		for(int i=0;i<1000;i++) {
			service1.execute(new Task());
		}

	}

}
