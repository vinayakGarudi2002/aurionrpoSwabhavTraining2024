package com.aurionpro.test;

import com.aurionpro.model.BankTransferPayment;
import com.aurionpro.model.CreditCardPayment;
import com.aurionpro.model.PayPalPayment;
import com.aurionpro.model.Payment;

public class PaymentTest {

	public static void main(String[] args) {
		

              Payment payment = new CreditCardPayment();
              
              payment.processPayment();
              payment.refund();
              
              
              payment = new PayPalPayment();
              
              payment.processPayment();
              payment.refund();
              
              payment = new BankTransferPayment();
              
              payment.processPayment();
              payment.refund();

	}

}
