package com.aurionpro.threads;

public class RunableThread implements Runnable{
	
	private Thread thread;
	
	

	public RunableThread(String name) {
		super();
		thread=new Thread(this);
		thread.start();
		thread.setName(name);
	}



	public Thread getThread() {
		return thread;
	}



	@Override
	public void run() {
		for(int i=3;i>0;i--) {
			System.out.println(Thread.currentThread().getName()+"-"+i);
			
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
