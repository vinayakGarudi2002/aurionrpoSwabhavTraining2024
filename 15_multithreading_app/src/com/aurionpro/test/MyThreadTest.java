package com.aurionpro.test;

import com.aurionpro.threads.MyThread;
import com.aurionpro.threads.RunableThread;

public class MyThreadTest {

	public static void main(String[] args) {
		
		RunableThread thread6= new RunableThread("Thread6");
		
		
		
		MyThread thread = new MyThread("Thread1");
		MyThread thread2 = new MyThread("Thread2");
		MyThread thread3 = new MyThread("Thread3");	
		
		System.out.println("thread1: "+thread.isAlive());
		System.out.println("thread2: "+thread2.isAlive());
		System.out.println("thread3: "+thread3.isAlive());
		
		thread.setPriority(Thread.MAX_PRIORITY);
		thread2.setPriority(Thread.MIN_PRIORITY);
		thread3.setPriority(Thread.MIN_PRIORITY);
		
		

		for(int i=4;i>0;i--) {
			System.out.println(Thread.currentThread().getName()+"-"+i);
			
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		try {
			thread.join();
			thread2.join();
			thread3.join();
			thread6.getThread().join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("thread1: "+thread.isAlive());
		System.out.println("thread2: "+thread2.isAlive());
		System.out.println("thread3: "+thread3.isAlive());	
		
	}
		


}
