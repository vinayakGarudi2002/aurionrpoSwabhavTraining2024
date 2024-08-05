package com.aurionpro.srp.violation.test;

import com.aurionpro.srp.violation.model.Invoice;
import com.aurionpro.srp.violation.model.InvoicePrinter;
import com.aurionpro.srp.violation.model.TaxCalculator;

public class InvoiceTest {
	
public static void main(String[] args) {
	
	Invoice invoice = new Invoice("123", "my tax", 120000, 10);
	
	TaxCalculator taxclc=new TaxCalculator(invoice);
//	
	InvoicePrinter invoicePrinter = new InvoicePrinter(invoice, taxclc);
//	
	System.out.println(taxclc.calculateTax());
//	
	invoicePrinter.printInvoice();
}
	

}
