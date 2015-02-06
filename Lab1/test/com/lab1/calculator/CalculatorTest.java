package com.lab1.calculator;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.Before;

public class CalculatorTest {
	
	private Calculator calculator;
	
	@Before
	public void setup(){
		calculator = new Calculator();
	}
	@Test
	public void addTest(){
		assertEquals(4, calculator.add(2,2));
	}
	
	@Test
	public void subtractTest(){
		assertEquals(8, calculator.subtract(10,2));
	}
	
	@Test
	public void multiply(){
		assertEquals(50, calculator.multiply(10,5));
	}
	
	@Test
	public void divideTest(){
		assertEquals(30, calculator.divide(60,2));
	}
	
	@Test
	public void isEqualPositiveTest() {
		assertTrue(calculator.isEqual(2, 2));
		
	}
	
	@Test
	public void isEqualNegativeTest() {
		assertFalse(calculator.isEqual(4, 2));
	}
}
