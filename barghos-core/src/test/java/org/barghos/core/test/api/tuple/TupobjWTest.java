package org.barghos.core.test.api.tuple;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;

import org.barghos.core.api.tuple.TupobjR;
import org.barghos.core.api.tuple.TupobjW;

/**
 * This class provides component tests for the interface {@link TupobjW}.
 * 
 * @author picatrix1899
 */
class TupobjWTest
{
	/**
	 * This test ensures, that the function {@link TupobjW#set(TupobjR)} adopts the
	 * values from the input tuple and returns the current instance.
	 */
	@Test
	void set_TupleTest()
	{
		TupobjW t = mock(TupobjW.class);
		TupobjR t2 = mock(TupobjR.class);
		
		when(t.set(t2)).thenCallRealMethod();
		
		when(t2.getArray()).thenReturn(new Object[] {1, 1.0});
		when(t.setArray(new Object[] {1, 1.0})).thenReturn(t);
		
		assertSame(t, t.set(t2));
		
		verify(t).set(t2);
		
		verify(t2).getArray();
		verify(t).setArray(new Object[] {1, 1.0});
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link TupobjW#set(Object)} adopts the
	 * value for each component and returns the current instance.
	 */
	@Test
	void set_ValueTest()
	{
		TupobjW t = mock(TupobjW.class);
		
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
	 * This test ensures, that the function {@link TupobjW#setArray(Object[])} relays
	 * all array entries to the corresponding component by calling {@link TupobjW#setByIndex(int, Object)}
	 * and returns the current instance.
	 */
	@Test
	void setArrayTest()
	{
		TupobjW t = mock(TupobjW.class);
		
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