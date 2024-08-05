package com.aurionpro.selection.test;

import java.util.Scanner;

public class VowelChecker {

	public static void main(String[] args) {

              Scanner scanner = new Scanner(System.in);
              System.out.println("Enter Character to Check Vowel: ");
              char ch=scanner.next().charAt(0);
              
              switch (ch) {
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
				System.out.println("vowel "+ch);
				break;


			default:
				System.out.println("Not Vowel "+ch);
				break;
			}

	}

}
