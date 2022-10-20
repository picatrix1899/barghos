package org.barghos.tuple.api.test.tn;

import static org.junit.jupiter.api.Assertions.*;

import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;

import org.barghos.tuple.api.tn.TupobjC;
import org.barghos.tuple.api.tn.TupobjR;

/**
 * This class provides component tests for the interface {@link TupobjC}.
 * 
 * @author picatrix1899
 */
class TupobjCTest
{

	/**
	 * This test ensures, that the interface extends the interface
	 * {@link TupobjR}.
	 */
	@Test
	void inheritance_TupRTest()
	{
		assertTrue(TupobjR.class.isAssignableFrom(TupobjC.class));
	}

	/**
	 * This test ensures, that the function {@link TupobjC#set(TupobjR)} adopts
	 * the values from the input tuple and returns the current instance.
	 */
	@Test
	void set_TupleTest()
	{
		TupobjC t = mock(TupobjC.class);
		TupobjR t2 = mock(TupobjR.class);
		
		when(t.set(t2)).thenCallRealMethod();
		
		when(t2.toArray()).thenReturn(new Object[] {1, 1.0});
		when(t.setArray(new Object[] {1, 1.0})).thenReturn(t);
		
		assertSame(t, t.set(t2));
		
		verify(t).set(t2);
		
		verify(t2).toArray();
		verify(t).setArray(new Object[] {1, 1.0});
		
		verifyNoMoreInteractions(t);
	}

	/**
	 * This test ensures, that the function {@link TupobjC#set(Object)} adopts
	 * the value for each component and returns the current instance.
	 */
	@Test
	void set_ValueTest()
	{
		TupobjC t = mock(TupobjC.class);
		
		when(t.set(1)).thenCallRealMethod();
		
		when(t.getDimensions()).thenReturn(2);
		when(t.setArray(new Object[] {1, 1})).thenReturn(t);
		
		assertSame(t, t.set(1));
		
		verify(t).set(1);
		
		verify(t).getDimensions();
		verify(t).setArray(new Object[] {1, 1});
		
		verifyNoMoreInteractions(t);
	}

	/**
	 * This test ensures, that the function {@link TupobjC#setArray(Object[])}
	 * relays all array entries to the corresponding component by calling
	 * {@link TupobjC#setByIndex(int, Object)} and returns the current instance.
	 */
	@Test
	void setArrayTest()
	{
		TupobjC t = mock(TupobjC.class);
		
		when(t.setArray(new Object[] {1, 1.0})).thenCallRealMethod();
		
		when(t.getDimensions()).thenReturn(2);
		
		assertSame(t, t.setArray(new Object[] {1, 1.0}));
		
		verify(t).setArray(new Object[] {1, 1.0});
		
		verify(t).getDimensions();
		verify(t).setByIndex(0, 1);
		verify(t).setByIndex(1, 1.0);
		
		verifyNoMoreInteractions(t);
	}
}