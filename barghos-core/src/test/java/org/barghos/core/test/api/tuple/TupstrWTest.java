package org.barghos.core.test.api.tuple;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;

import org.barghos.core.api.tuple.TupstrR;
import org.barghos.core.api.tuple.TupstrW;

/**
 * This class provides component tests for the interface {@link TupstrW}.
 * 
 * @author picatrix1899
 */
class TupstrWTest
{
	/**
	 * This test ensures, that the function {@link TupstrW#set(TupstrR)} adopts the
	 * values from the input tuple and returns the current instance.
	 */
	@Test
	void set_TupleTest()
	{
		TupstrW t = mock(TupstrW.class);
		TupstrR t2 = mock(TupstrR.class);
		
		when(t.set(t2)).thenCallRealMethod();
		
		when(t2.getArray()).thenReturn(new String[] {"a", "b"});
		when(t.setArray(new String[] {"a", "b"})).thenReturn(t);
		
		assertSame(t, t.set(t2));
		
		verify(t).set(t2);
		
		verify(t2).getArray();
		verify(t).setArray(new String[] {"a", "b"});
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link TupstrW#set(String)} adopts the
	 * value for each component and returns the current instance.
	 */
	@Test
	void set_ValueTest()
	{
		TupstrW t = mock(TupstrW.class);
		
		when(t.set("a")).thenCallRealMethod();
		
		when(t.getDimensions()).thenReturn(2);
		when(t.setArray(new String[] {"a", "a"})).thenReturn(t);
		
		assertSame(t, t.set("a"));
		
		verify(t).set("a");
		
		verify(t).getDimensions();
		verify(t).setArray(new String[] {"a", "a"});
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link TupstrW#setArray(String[])} relays
	 * all array entries to the corresponding component by calling {@link TupstrW#setByIndex(int, String)}
	 * and returns the current instance.
	 */
	@Test
	void setArrayTest()
	{
		TupstrW t = mock(TupstrW.class);
		
		when(t.setArray(new String[] {"a", "b"})).thenCallRealMethod();
		
		when(t.getDimensions()).thenReturn(2);
		
		assertSame(t, t.setArray(new String[] {"a", "b"}));
		
		verify(t).setArray(new String[] {"a", "b"});
		
		verify(t).getDimensions();
		verify(t).setByIndex(0, "a");
		verify(t).setByIndex(1, "b");
		
		verifyNoMoreInteractions(t);
	}
}