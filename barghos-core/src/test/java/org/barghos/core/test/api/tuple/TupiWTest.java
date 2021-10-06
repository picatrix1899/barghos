package org.barghos.core.test.api.tuple;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;

import org.barghos.core.api.tuple.TupiR;
import org.barghos.core.api.tuple.TupiW;

/**
 * This class provides component tests for the interface {@link TupiW}.
 * 
 * @author picatrix1899
 */
class TupiWTest
{
	/**
	 * This test ensures, that the function {@link TupiW#set(TupiR)} adopts the
	 * values from the input tuple and returns the current instance.
	 */
	@Test
	void set_TupleTest()
	{
		TupiW t = mock(TupiW.class);
		TupiR t2 = mock(TupiR.class);
		
		when(t.set(t2)).thenCallRealMethod();
		
		when(t2.getArray()).thenReturn(new int[] {1, 2});
		when(t.setArray(new int[] {1, 2})).thenReturn(t);
		
		assertSame(t, t.set(t2));
		
		verify(t).set(t2);
		
		verify(t2).getArray();
		verify(t).setArray(new int[] {1, 2});
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link TupiW#set(int)} adopts the
	 * value for each component and returns the current instance.
	 */
	@Test
	void set_ValueTest()
	{
		TupiW t = mock(TupiW.class);
		
		when(t.set(1)).thenCallRealMethod();
		
		when(t.getDimensions()).thenReturn(2);
		when(t.setArray(new int[] {1, 1})).thenReturn(t);
		
		assertSame(t, t.set(1));
		
		verify(t).set(1);
		
		verify(t).getDimensions();
		verify(t).setArray(new int[] {1, 1});
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link TupiW#setArray(int[])} relays
	 * all array entries to the corresponding component by calling {@link TupiW#setByIndex(int, int)}
	 * and returns the current instance.
	 */
	@Test
	void setArrayTest()
	{
		TupiW t = mock(TupiW.class);
		
		when(t.setArray(new int[] {1, 2})).thenCallRealMethod();
		
		when(t.getDimensions()).thenReturn(2);
		
		assertSame(t, t.setArray(new int[] {1, 2}));
		
		verify(t).setArray(new int[] {1, 2});
		
		verify(t).getDimensions();
		verify(t).setByIndex(0, 1);
		verify(t).setByIndex(1, 2);
		
		verifyNoMoreInteractions(t);
	}
}