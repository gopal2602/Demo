package com.sgtesting.calculator.tests;

import org.junit.Assert;
import org.junit.Test;

import com.sgtesting.calculator.sourcecode.Calculator;

public class AdditionTests {
	
	Calculator obj=new Calculator();
	/**
	 * Crated By:
	 * Creatd Date:
	 * Return Value:
	 * Purpose/Description:
	 */
	@Test
	public void addTwoPositiveNumbers()
	{
		int expected =70;
		try
		{
			int actual=obj.addition(30,40);
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
	public void addTwoNegativeNumbers()
	{
		int expected =-40;
		try
		{
			int actual=obj.addition(-30,-10);
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
	public void addOneNegativeAndOnePositiveNumbers()
	{
		int expected =-20;
		try
		{
			int actual=obj.addition(-50,30);
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
	public void addOneNegativeWithZeroNumbers()
	{
		int expected =-10;
		try
		{
			int actual=obj.addition(-10,0);
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
	public void addOnePositiveWithZeroNumbers()
	{
		int expected =15;
		try
		{
			int actual=obj.addition(15,0);
			Assert.assertEquals(expected, actual);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
