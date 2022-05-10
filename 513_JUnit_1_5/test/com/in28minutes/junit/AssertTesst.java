package com.in28minutes.junit;

import static org.junit.Assert.*;

import org.junit.Test;

public class AssertTesst {

	@Test
	public void test() {
		boolean cond = false;
		String value = null;
		assertEquals(3, 3);
		assertEquals(true, cond);
		assertTrue(cond);
		assertFalse(cond);
		assertNotNull(value);
		assertNull(value);
		//assertArrayEquals(expectedArray, resultArray);
		
	}

}
