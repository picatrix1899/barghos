package org.barghos.core.test.api.tuple;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;

import org.barghos.core.api.tuple.TupcR;
import org.barghos.core.api.tuple.TupcW;

/**
 * This class provides component tests for the interface {@link TupcW}.
 * 
 * @author picatrix1899
 */
class TupcWTest
{
	/**
	 * This test ensures, that the function {@link TupcW#set(TupcR)} adopts the
	 * values from the input tuple and returns the current instance.
	 */
	@Test
	void set_TupleTest()
	{
		TupcW t = mock(TupcW.class);
		TupcR t2 = mock(TupcR.class);
		
		when(t.set(t2)).thenCallRealMethod();
		
		when(t2.getArray()).thenReturn(new char[] {'a', 'b'});
		when(t.setArray(new char[] {'a', 'b'})).thenReturn(t);
		
		assertSame(t, t.set(t2));
		
		verify(t).set(t2);
		
		verify(t2).getArray();
		verify(t).setArray(new char[] {'a', 'b'});
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link TupcW#set(char)} adopts the
	 * value for each component and returns the current instance.
	 */
	@Test
	void set_ValueTest()
	{
		TupcW t = mock(TupcW.class);
		
		when(t.set('a')).thenCallRealMethod();
		
		when(t.getDimensions()).thenReturn(2);
		when(t.setArray(new char[] {'a', 'a'})).thenReturn(t);
		
		assertSame(t, t.set('a'));
		
		verify(t).set('a');
		
		verify(t).getDimensions();
		verify(t).setArray(new char[] {'a', 'a'});
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link TupcW#setArray(char[])} relays
	 * all array entries to the corresponding component by calling {@link TupcW#setByIndex(int, char)}
	 * and returns the current instance.
	 */
	@Test
	void setArrayTest()
	{
		TupcW t = mock(TupcW.class);
		
		when(t.setArray(new char[] {'a', 'b'})).thenCallRealMethod();
		
		when(t.getDimensions()).thenReturn(2);
		
		assertSame(t, t.setArray(new char[] {'a', 'b'}));
		
		verify(t).setArray(new char[] {'a', 'b'});
		
		verify(t).getDimensions();
		verify(t).setByIndex(0, 'a');
		verify(t).setByIndex(1, 'b');
		
		verifyNoMoreInteractions(t);
	}
}