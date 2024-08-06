package com.capgemini.bnk.junitscbnew;

import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class InterestTester {
	 static InterestCalculator calculator;
	@BeforeAll
	public  static void setUpForOnce()
	{
	 calculator = new InterestCalculator();
		System.out.println("Before All called for  test case");
	}
	
	@BeforeEach
	public void setUp()
	{
		
		System.out.println("Before Each called for every test case");
	}
	
	@Test
	@DisplayName("SmallNumbers")
	@Order(1)
	public void testWithSmallNumbers()
	{
		
		double actual = calculator.calculateInterest(20000,8.0,4.0);
		double expected = 6400;
		Assertions.assertEquals(actual, expected);
		
		
	}
	@Test
	@DisplayName("BigNumbers")
	@Order(-1)
	public void testWithBigNumbers()
	{
		//InterestCalculator calculator = new InterestCalculator();
		double actual = calculator.calculateInterest(2000000,8.0,4.0);
		double expected = 640000;
		Assertions.assertEquals(actual, expected);
		
		
	}
	@Test
	@DisplayName("ExceptionChecker")
	@Order(2)
	public void testWithInvalidInput()
	{
		//InterestCalculator calculator = new InterestCalculator();
		assertThrows(IllegalArgumentException.class,()->
		{
			calculator.calculateInterest(0,0,0);
		},"ExceptionMatching");
	}
	@AfterEach
	public void clearUp()
	{
		
		
		System.out.println("After Each called for every test case");
	}
	@AfterAll
	public static void clearUpOnce()
	{
		
		calculator = null;
		System.out.println("After All called for  test case");
	}

}
