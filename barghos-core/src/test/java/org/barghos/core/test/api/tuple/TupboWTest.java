package org.barghos.core.test.api.tuple;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;

import org.barghos.core.api.tuple.TupboR;
import org.barghos.core.api.tuple.TupboW;

/**
 * This class provides component tests for the interface {@link TupboW}.
 * 
 * @author picatrix1899
 */
class TupboWTest
{
	/**
	 * This test ensures, that the function {@link TupboW#set(TupboR)} adopts the
	 * values from the input tuple and returns the current instance.
	 */
	@Test
	void set_TupleTest()
	{
		TupboW t = mock(TupboW.class);
		TupboR t2 = mock(TupboR.class);
		
		when(t.set(t2)).thenCallRealMethod();
		
		when(t2.getArray()).thenReturn(new boolean[] {true, false});
		when(t.setArray(new boolean[] {true, false})).thenReturn(t);
		
		assertSame(t, t.set(t2));
		
		verify(t).set(t2);
		
		verify(t2).getArray();
		verify(t).setArray(new boolean[] {true, false});
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link TupboW#set(boolean)} adopts the
	 * value for each component and returns the current instance.
	 */
	@Test
	void set_ValueTest()
	{
		TupboW t = mock(TupboW.class);
		
		when(t.set(true)).thenCallRealMethod();
		
		when(t.getDimensions()).thenReturn(2);
		when(t.setArray(new boolean[] {true, true})).thenReturn(t);
		
		assertSame(t, t.set(true));
		
		verify(t).set(true);
		
		verify(t).getDimensions();
		verify(t).setArray(new boolean[] {true, true});
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link TupboW#setArray(boolean[])} relays
	 * all array entries to the corresponding component by calling {@link TupboW#setByIndex(int, boolean)}
	 * and returns the current instance.
	 */
	@Test
	void setArrayTest()
	{
		TupboW t = mock(TupboW.class);
		
		when(t.setArray(new boolean[] {true, false})).thenCallRealMethod();
		
		when(t.getDimensions()).thenReturn(2);
		
		assertSame(t, t.setArray(new boolean[] {true, false}));
		
		verify(t).setArray(new boolean[] {true, false});
		
		verify(t).getDimensions();
		verify(t).setByIndex(0, true);
		verify(t).setByIndex(1, false);
		
		verifyNoMoreInteractions(t);
	}
}