package com.aurionpro.test;

import java.util.Scanner;

import com.aurionpro.exception.AgeNotValidException;
import com.aurionpro.model.Voter;

public class VoterTest {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		Voter voter=null;
		
			try {
				System.out.println("Enter voter id: ");
				int id=scanner.nextInt();
				System.out.println("Enter your firstName: ");
				String firstName=scanner.next();
				
				System.out.println("Enter your lastName: ");
				String lastName=scanner.next();
				
				System.out.println("Enter voter age: ");
				int age=scanner.nextInt();
				
				 voter = new Voter(id,firstName,lastName,age);
				
				
			}catch(AgeNotValidException e) {
				System.out.println(e.ageNotValidException());
			}
			System.out.println(voter);
		

	}

}
