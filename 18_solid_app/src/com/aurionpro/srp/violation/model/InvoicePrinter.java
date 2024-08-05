package com.aurionpro.srp.violation.model;

public class InvoicePrinter {
	
	private Invoice invoice;
	private TaxCalculator taxCalculator;
	
	

	public InvoicePrinter(Invoice invoice, TaxCalculator taxCalculator) {
		super();
		this.invoice = invoice;
		this.taxCalculator = taxCalculator;
	}



	public void printInvoice() {
		System.out.println( "Invoice [id=" + invoice.getId() + ", description=" + invoice.getDescription() + ", amount=" + invoice.getAmount() + ", tax=" + invoice.getTax() +"Total tax amount "+(taxCalculator.calculateTax()+invoice.getAmount())+"]");
		
	}

}
