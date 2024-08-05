package com.aurionpro.test;

public class ThreadTest {
	
	public static void main(String[] args) {
		Thread thread=Thread.currentThread();
		
		System.out.println(thread);
		
		thread.setName("myThread");
		
		System.out.println(thread);
		
		for(int i=0;i<5;i++) {
			System.out.println("Thread: "+i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
