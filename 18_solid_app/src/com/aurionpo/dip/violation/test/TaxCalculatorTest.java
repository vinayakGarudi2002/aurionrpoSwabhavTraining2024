package com.aurionpo.dip.violation.test;

import com.aurionpo.dip.violation.model.DBLogger;
import com.aurionpo.dip.violation.model.TaxCalculator;


public class TaxCalculatorTest {
	
	public static void main(String[] args) {
		TaxCalculator tax = new TaxCalculator(new DBLogger());
		
		//tax.calculate(122, 2);
		System.out.println(tax.calculate(122, 0));
		
	}

}
