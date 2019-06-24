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
}
