package com.aurionpro.threads;

public class Consumer implements Runnable {
    Q q;

    public Consumer(Q q) {
        this.q = q;
        new Thread(this, "Consumer").start();
    }

    public void run() {
    	int count = 10;
        for (int i = 0; i < count; i++) {
            q.get();
        }
        
        
//        while(true) {
//        	q.get();
//        }
    }
}
