package org.barghos.core.test.api.tuple;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;

import org.barghos.core.api.tuple.TupcC;
import org.barghos.core.api.tuple.TupcR;

/**
 * This class provides component tests for the interface {@link TupcC}.
 * 
 * @author picatrix1899
 */
class TupcCTest
{
	/**
	 * This test ensures, that the interface extends the interface {@link TupcR}.
	 */
	@Test
	void inheritance_TupcRTest()
	{
		assertTrue(TupcR.class.isAssignableFrom(TupcC.class));
	}
	
	/**
	 * This test ensures, that the function {@link TupcC#set(TupcR)} adopts the
	 * values from the input tuple and returns the current instance.
	 */
	@Test
	void set_TupleTest()
	{
		TupcC t = mock(TupcC.class);
		TupcR t2 = mock(TupcR.class);
		
		when(t.set(t2)).thenCallRealMethod();
		
		when(t2.toArray()).thenReturn(new char[] {'a', 'b'});
		when(t.setArray(new char[] {'a', 'b'})).thenReturn(t);
		
		assertSame(t, t.set(t2));
		
		verify(t).set(t2);
		
		verify(t2).toArray();
		verify(t).setArray(new char[] {'a', 'b'});
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link TupcC#set(char)} adopts the
	 * value for each component and returns the current instance.
	 */
	@Test
	void set_ValueTest()
	{
		TupcC t = mock(TupcC.class);
		
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
	 * This test ensures, that the function {@link TupcC#setArray(char[])} relays
	 * all array entries to the corresponding component by calling {@link TupcC#setByIndex(int, char)}
	 * and returns the current instance.
	 */
	@Test
	void setArrayTest()
	{
		TupcC t = mock(TupcC.class);
		
		when(t.setArray(new char[] {'a', 'b'})).thenCallRealMethod();
		
		when(t.getDimensions()).thenReturn(2);
		
		assertSame(t, t.setArray(new char[] {'a', 'b'}));
		
		verify(t).setArray(new char[] {'a', 'b'});
		
		verify(t).getDimensions();
		verify(t).setByIndex(0, 'a');
		verify(t).setByIndex(1, 'b');
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link TupcC#shallowClone()} calls
	 * by default the standard {@link TupcC#clone()}-function.
	 */
	@Test
	void shallowCloneTest()
	{
		TupcC t = mock(TupcC.class);
		TupcC res = mock(TupcC.class);
		
		when(t.shallowClone()).thenCallRealMethod();
		when(t.clone()).thenReturn(res);
		
		assertSame(res, t.shallowClone());
		
		verify(t).shallowClone();
		verify(t).clone();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link TupcC#deepClone()} calls
	 * by default the standard {@link TupcC#clone()}-function.
	 */
	@Test
	void deepCloneTest()
	{
		TupcC t = mock(TupcC.class);
		TupcC res = mock(TupcC.class);

		when(t.deepClone()).thenCallRealMethod();
		when(t.clone()).thenReturn(res);
		
		assertSame(res, t.deepClone());
		
		verify(t).deepClone();
		verify(t).clone();
		
		verifyNoMoreInteractions(t);
	}
}