package com.minutes.mokito.mokitodemo;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class SomeBusinessMockAnnotationsTest {
//ALT + SHIFT + I
	@Mock
	DataService dataServiceMock;
	@InjectMocks
	SomeBusinessImpl businessImpl;
	
	@Test
	void testFindTheGreatestFromAllData() {
		DataService dataServiceMock = mock(DataService.class);
		
		when(dataServiceMock.retriveAllData()).thenReturn(new int[] {24, 15, 7});
		assertEquals(24, businessImpl.findTheGreatestFromAllData());
	}
	
	@Test
	void testFindTheGreatestFromAllData_ForOneValue() {
		DataService dataServiceMock = mock(DataService.class);
		
		when(dataServiceMock.retriveAllData()).thenReturn(new int[] {15});
		assertEquals(15, businessImpl.findTheGreatestFromAllData());
	}
	
	@Test
	void testFindTheGreatestFromAllData_NoValue() {
		DataService dataServiceMock = mock(DataService.class);
		
		when(dataServiceMock.retriveAllData()).thenReturn(new int[] {});
		assertEquals(Integer.MIN_VALUE, businessImpl.findTheGreatestFromAllData());
	}

}