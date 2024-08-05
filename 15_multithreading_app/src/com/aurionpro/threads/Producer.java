package com.aurionpro.threads;

public class Producer implements Runnable {
    Q q;

    public Producer(Q q) {
        this.q = q;
        new Thread(this, "Producer").start();
    }

    public void run() {
        int count = 10;
        for (int i = 0; i < count; i++) {
            q.put(i);
        }
        
        
//        while(true) {
//        	q.put(count++);
//        }
    }
}
