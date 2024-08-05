package com.aurionpro.test;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import com.aurionpro.model.NewTask;

public class ExecutorServiceTest {
	
	public static void main(String[] args) {
		
		ExecutorService service=Executors.newFixedThreadPool(10);
		
		Future<String> future = service.submit(new NewTask());
		
		List<NewTask> tasks=new ArrayList<NewTask>();
		
		tasks.add(new NewTask());
		tasks.add(new NewTask());
		tasks.add(new NewTask());
		tasks.add(new NewTask());
		tasks.add(new NewTask());
		
		try {
			//System.out.println(future.get());
			System.out.println(service.invokeAny(tasks));
			
			List<Future<String>> futures = service.invokeAll(tasks);
			
			for(Future<String> newFuture : futures) {
				System.out.println(newFuture.get());
			}
		} catch (InterruptedException | ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
