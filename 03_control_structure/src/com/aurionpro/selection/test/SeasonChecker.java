package com.aurionpro.selection.test;

import java.util.Scanner;

public class SeasonChecker {

	public static void main(String[] args) {
	
		  Scanner scanner = new Scanner(System.in);
          System.out.println("Enter Month in Number: ");
          int month=scanner.nextInt();
          
          switch (month) {
		case 1:
		case 2:
			System.out.println("Winter "+month);
			break;
		case 3:
		case 4:
		case 5:
			System.out.println("Summer "+month);
			break;
		case 6:
		case 7:
		case 8:
		case 9:
			System.out.println("Rainy "+month);
			break;
		case 10:
		case 11:
		case 12:			
			System.out.println("Winter "+month);
			break;


		default:
			System.out.println("Enter Correct Month 1-12");
			break;
		}
		
		scanner.close();
	}

}
