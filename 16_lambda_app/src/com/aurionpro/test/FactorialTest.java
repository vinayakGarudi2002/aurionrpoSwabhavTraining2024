package com.aurionpro.test;

import com.aurionpro.model.IFactorial;

public class FactorialTest {

	public static void main(String[] args) {


		IFactorial fact = (int number)->{
			int result=1;
			if(number==0 || number==1) {
				return 1;
			}
			
			for(int i=number;i>=1;i-- ) {
				result=result*i;
			}
			
			return result;
		};
		
		System.out.println(fact.factorial(5));

	}

}
