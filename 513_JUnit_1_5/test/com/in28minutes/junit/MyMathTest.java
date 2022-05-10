package com.in28minutes.junit;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Test;

public class MyMathTest {
	MyMath myMath = new MyMath();
	
	@Before
	public void before3() {
		System.out.println("Before3");
	}
	
	@After
	public void after2() {
		System.out.println("After2");
	}
	
	@BeforeClass
	public static void beforeClass() {
		System.out.println("BeforeClass");
	}
	
	@AfterClass
	public static void afterClass() {
		System.out.println("AfterClass");
	}
	
	@Test
	public void sum_with3numbers() {
		System.out.println("Test1");
		System.out.println(myMath.sum(new int[] {1, 3, 3}));
		
		assertEquals(6, myMath.sum(new int[] {1, 3, 3}));
		//fail("Not yet implemented"); -- Absence of failure is success.
	}
	
	@Test
	public void sum_with1numbers() {
		System.out.println("Test2");
		System.out.println(myMath.sum(new int[] {3}));
		
		assertEquals(3, myMath.sum(new int[] {3}));
		//fail("Not yet implemented"); -- Absence of failure is success.
		//Alt + Shift + i
	}
	
	@Before
	public void before2() {
		System.out.println("Before2");
	}
	
	@After
	public void after() {
		System.out.println("After");
	}
	
	@Before
	public void before1() {
		System.out.println("Before1");
	}

}