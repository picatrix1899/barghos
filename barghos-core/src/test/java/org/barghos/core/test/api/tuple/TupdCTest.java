package org.barghos.core.test.api.tuple;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;
import org.barghos.core.api.tuple.TupdC;
import org.barghos.core.api.tuple.TupdR;

/**
 * This class provides component tests for the interface {@link TupdC}.
 * 
 * @author picatrix1899
 */
class TupdCTest
{
	/**
	 * This test ensures, that the interface extends the interface {@link TupdR}.
	 */
	@Test
	void inheritance_TupdRTest()
	{
		assertTrue(TupdR.class.isAssignableFrom(TupdC.class));
	}
	
	/**
	 * This test ensures, that the function {@link TupdC#set(TupdR)} adopts the
	 * values from the input tuple and returns the current instance.
	 */
	@Test
	void set_TupleTest()
	{
		TupdC t = mock(TupdC.class);
		TupdR t2 = mock(TupdR.class);
		
		when(t.set(t2)).thenCallRealMethod();
		
		when(t2.toArray()).thenReturn(new double[] {1.0, 2.0});
		when(t.setArray(new double[] {1.0, 2.0})).thenReturn(t);
		
		assertSame(t, t.set(t2));
		
		verify(t).set(t2);
		
		verify(t2).toArray();
		verify(t).setArray(new double[] {1.0, 2.0});
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link TupdC#set(double)} adopts the
	 * value for each component and returns the current instance.
	 */
	@Test
	void set_ValueTest()
	{
		TupdC t = mock(TupdC.class);
		
		when(t.set(1.0)).thenCallRealMethod();
		
		when(t.getDimensions()).thenReturn(2);
		when(t.setArray(new double[] {1.0, 1.0})).thenReturn(t);
		
		assertSame(t, t.set(1.0));
		
		verify(t).set(1.0);
		
		verify(t).getDimensions();
		verify(t).setArray(new double[] {1.0, 1.0});
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link TupdC#setArray(double[])} relays
	 * all array entries to the corresponding component by calling {@link TupdC#setByIndex(int, double)}
	 * and returns the current instance.
	 */
	@Test
	void setArrayTest()
	{
		TupdC t = mock(TupdC.class);
		
		when(t.setArray(new double[] {1.0, 2.0})).thenCallRealMethod();
		
		when(t.getDimensions()).thenReturn(2);
		
		assertSame(t, t.setArray(new double[] {1.0, 2.0}));
		
		verify(t).setArray(new double[] {1.0, 2.0});
		
		verify(t).getDimensions();
		verify(t).setByIndex(0, 1.0);
		verify(t).setByIndex(1, 2.0);
		
		verifyNoMoreInteractions(t);
	}
}