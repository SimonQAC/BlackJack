package com.qa.blackjackmaven;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
public class DrawTest {

	
	@BeforeClass
	public static void setup() {
		System.out.println("Before class");
	}
	
	@Before
	public void init() {
		System.out.println("Before test");
	}
	
	@Test
	public void test1() {
		System.out.println("Example test");
	}
	
	@After
	public void finalise() {
		System.out.println("After test");
	}
	@AfterClass
	public static void teardown() {
		System.out.println("After Class");
	}
	
	@Test
	public void bothBustTest() {
		Calculations b = new Calculations();
		assertEquals(0, b.cardCheck(22,22));
	}
	@Test
	public void drawCheck() {
		Calculations b = new Calculations();
		assertEquals(2, b.cardCheck(10,10));
	}
	
	@Test
	public void isNotNull() {
		Calculations b = new Calculations();
		assertNotNull(b.cardCheck(0, 0));
	}
	
}


		
