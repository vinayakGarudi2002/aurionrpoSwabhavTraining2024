package com.aurionpo.dip.solution.test;

import com.aurionpo.dip.solution.model.DBLogger;
import com.aurionpo.dip.solution.model.FileLogger;
import com.aurionpo.dip.solution.model.TaxCalculator;


public class TaxCalculatorTest {
	
	public static void main(String[] args) {
		TaxCalculator tax = new TaxCalculator();
		
		//tax.calculate(122, 2);
		System.out.println(tax.calculate(122, 0));
		
       TaxCalculator tax1 = new TaxCalculator();
		
		//tax.calculate(122, 2);
		System.out.println(tax1.calculate(122, 0));
		
	}

}
