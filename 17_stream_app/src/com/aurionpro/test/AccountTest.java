package com.aurionpro.test;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import com.aurionpro.model.Account;

public class AccountTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Account> listOfAccount=Arrays.asList(new Account(12345,"vinayak",1000),new Account(12390,"mahesh",2000),new Account(12378,"ramesh",3000)
				
				);
		
		System.out.println("Minimum Balance Account Detail");
		
		 Optional<Account> minimumBalAcount=listOfAccount.stream().min((account1,account2)->(int)account1.getBalance()-(int)account2.getBalance());
		 
		 if(minimumBalAcount.isPresent()) {
			 System.out.println(minimumBalAcount.get());
		 }
		
		 System.out.println("Maximum Balance Account Detail");
			
		 Optional<Account> maximumBalAcount=listOfAccount.stream().max((account1,account2)->(int)account1.getBalance()-(int)account2.getBalance());
		 
		 if(maximumBalAcount.isPresent()) {
			 System.out.println(maximumBalAcount.get());
		 }
		 
		 System.out.println("Show names greater than 6 characters"); 
		
		 listOfAccount.stream().filter((account)->account.getName().length()>6).forEach((account)->System.out.println(account));
		
		System.out.println("find total of balance of all accounts");
		
		 double sum =listOfAccount.stream().map((account)->account.getBalance()).reduce(0.0, (account1,account2)->account1+account2);
		 
		 System.out.println("Total balance of all account is: "+sum);

	}

}
