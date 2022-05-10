package com.minutes.mokito.mokitodemo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SomeBusinessTest {

	@Test
	void testFindTheGreatestFromAllData() {
		SomeBusinessImpl businessImpl = new SomeBusinessImpl(new DataServiceStub1());
		int result = businessImpl.findTheGreatestFromAllData();
		assertEquals(24, result);
	}

}

class DataServiceStub1 implements DataService {

	@Override
	public int[] retriveAllData() {
		// TODO Auto-generated method stub
		return new int[] {24, 6, 15};
	}
	
}