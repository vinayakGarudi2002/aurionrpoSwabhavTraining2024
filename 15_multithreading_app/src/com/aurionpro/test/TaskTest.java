package com.aurionpro.test;

import com.aurionpro.model.Task;

public class TaskTest {

	public static void main(String[] args) {
		
		Thread thread =new Thread(new Task());
		
		thread.start();

	}

}
