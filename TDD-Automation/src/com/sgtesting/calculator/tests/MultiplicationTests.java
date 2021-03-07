package com.sgtesting.calculator.tests;

import org.junit.Assert;
import org.junit.Test;

import com.sgtesting.calculator.sourcecode.Calculator;

public class MultiplicationTests {
	
	Calculator calculator=new Calculator();
	/**
	 * Crated By:
	 * Creatd Date:
	 * Return Value:
	 * Purpose/Description:
	 */
	@Test
	public void multiplyTwoPositiveNumbers()
	{
		int expected,actual;
		try
		{
			expected=70;
			actual=calculator.multiplication(10,7);
			Assert.assertEquals(expected, actual);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	/**
	 * Crated By:
	 * Creatd Date:
	 * Return Value:
	 * Purpose/Description:
	 */
	@Test
	public void multiplyTwoNegativeNumbers()
	{
		int expected,actual;
		try
		{
			expected=120;
			actual=calculator.multiplication(-12,-10);
			Assert.assertEquals(expected, actual);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	/**
	 * Crated By:
	 * Creatd Date:
	 * Return Value:
	 * Purpose/Description:
	 */
	@Test
	public void multiplyPostiveAndNegativeNumbers()
	{
		int expected,actual;
		try
		{
			expected=-25;
			actual=calculator.multiplication(-5,5);
			Assert.assertEquals(expected, actual);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	/**
	 * Crated By:
	 * Creatd Date:
	 * Return Value:
	 * Purpose/Description:
	 */
	@Test
	public void multiplyPostiveAndZeroNumbers()
	{
		int expected,actual;
		try
		{
			expected=0;
			actual=calculator.multiplication(15,0);
			Assert.assertEquals(expected, actual);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	/**
	 * Crated By:
	 * Creatd Date:
	 * Return Value:
	 * Purpose/Description:
	 */
	@Test
	public void multiplyNegativeAndZeroNumbers()
	{
		int expected,actual;
		try
		{
			expected=0;
			actual=calculator.multiplication(-15,0);
			Assert.assertEquals(expected, actual);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
