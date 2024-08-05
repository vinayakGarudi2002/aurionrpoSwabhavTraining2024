package com.aurionpro.model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class OperationsTest {
	Operations operation;
	
	@BeforeEach
	void init() {
		 operation = new Operations();
	}
	
	@AfterEach
	void status() {
		System.out.println("Test Executed");
	}
	@Test
	void testAddition() {
		//Operations operation = new Operations();
		int actual=operation.addition(2, 2);
		int expected=4;
		
		assertEquals(expected,actual);

	}

	@Test
	void testSubration() {
		//Operations operation = new Operations();
		assertEquals(3,operation.subration(5, 2),"It should subract");
		
		//assertEquals(1,operation.subration(5, 2),"It should subract");
	}

	@Test
	void testMultiplication() {
		//Operations operation = new Operations();
		assertEquals(3,operation.multiplication(1, 3));	
	}
	
	@Test
	void testDevision() {
		//Operations operation = new Operations();
		
		// Test for a valid division
        assertEquals(0, operation.devision(1, 3));
        
        // Test for ArithmeticException when dividing by zero
        assertThrows(ArithmeticException.class, () -> {
            operation.devision(1, 0);
        });
	}

}
