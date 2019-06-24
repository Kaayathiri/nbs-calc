package com.qa.calculator;

import org.junit.Assert;
import org.junit.Test;

public class mycalculatortest {

	@Test
	public void AddTwoNumbersTest() {
	Calculator calculator = new Calculator();
	int result = calculator.add (2,2);
	Assert.assertEquals(4, result);
	}


@Test
	public void SubtractTwoNumbersTest() {
	Calculator calculator = new Calculator();
	int result = calculator.subtract (5,2);
	Assert.assertEquals(3, result);
}

@Test
	public void MinusTwoNumbersTest() {
	Calculator calculator = new Calculator();
	int result = calculator.multiply (5,2);
	Assert.assertEquals(10, result);
}



}