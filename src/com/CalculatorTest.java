package com;

import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.Assert;

public class CalculatorTest {

	@Test
	public void testAdd() {
		Calculator obj=new Calculator();
		int actual=obj.add(12, 23);
		int expected=35;
		Assert.assertEquals(expected, actual);
		
	}

	@Test
	public void testMultiply() {
		Calculator obj=new Calculator();
		int actual=obj.multiply(2, 3);
		int expected=6;
		Assert.assertEquals(expected, actual);
		
		
	}

	@Test
	public void testSubtract() {
		Calculator obj=new Calculator();
		int actual=obj.subtract(12, 3);
		int expected=9;
		Assert.assertEquals(expected, actual);
		
		
	}

	@Test
	public void testDivide() {
		Calculator obj=new Calculator();
		float actual=obj.divide(12,2);
		float expected=6;
		Assert.assertEquals(expected, actual);
		
		
	}

}
