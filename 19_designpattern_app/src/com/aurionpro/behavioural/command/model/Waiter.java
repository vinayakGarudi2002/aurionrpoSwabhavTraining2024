package com.aurionpro.behavioural.command.model;

public class Waiter {
	//the Invoker class
    private Order order;

    public void takeOrder(Order order) {
        this.order = order;
    }

    public void placeOrder() {
        if (order != null) {
            order.execute();
        }
    }
}