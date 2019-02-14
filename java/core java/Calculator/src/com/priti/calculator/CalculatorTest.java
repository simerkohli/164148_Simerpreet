package com.priti.calculator;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CalculatorTest {
	
	
	static Calculator calculator;
    @BeforeClass
	public static void method() {
    	
    	calculator = new Calculator();
    	
		System.out.println("Hello");
		
	}
	
    @Before
    public void method1() {
		System.out.println("Before");
	}
	@Test
	public void testDivide() {
		
		int result=calculator.divide(6, 2);
		assertEquals(3,result);
		System.out.println("Test 1");
	}

	@Test
	public void testMultiply() {
		
		int result=calculator.multiply(6, 2);
		assertEquals(12,result);
		System.out.println("Test 2");

	}

	@Test
	public void testSum() {
		
		int result=calculator.sum(6, 2);
		assertEquals(8,result);
		System.out.println("Test 3");

	}

	@Test
	public void testSubtract() {
		
		int result=calculator.subtract(6, 2);
		assertEquals(4,result);
		System.out.println("Test 4");
	}
	
	@After
	 public void method2() {
			System.out.println("After");
		}
	@AfterClass
	public static void method3() {
		System.out.println("Bye");
		
	}
}
