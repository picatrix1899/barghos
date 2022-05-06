package org.barghos.core.test.api.tuple;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;

import org.barghos.core.api.tuple.TuplC;
import org.barghos.core.api.tuple.TuplR;

/**
 * This class provides component tests for the interface {@link TuplC}.
 * 
 * @author picatrix1899
 */
class TuplCTest
{
	/**
	 * This test ensures, that the interface extends the interface {@link TuplR}.
	 */
	@Test
	void inheritance_TuplRTest()
	{
		assertTrue(TuplR.class.isAssignableFrom(TuplC.class));
	}
	
	/**
	 * This test ensures, that the function {@link TuplC#set(TuplR)} adopts the
	 * values from the input tuple and returns the current instance.
	 */
	@Test
	void set_TupleTest()
	{
		TuplC t = mock(TuplC.class);
		TuplR t2 = mock(TuplR.class);
		
		when(t.set(t2)).thenCallRealMethod();
		
		when(t2.toArray()).thenReturn(new long[] {1l, 2l});
		when(t.setArray(new long[] {1l, 2l})).thenReturn(t);
		
		assertSame(t, t.set(t2));
		
		verify(t).set(t2);
		
		verify(t2).toArray();
		verify(t).setArray(new long[] {1l, 2l});
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link TuplC#set(long)} adopts the
	 * value for each component and returns the current instance.
	 */
	@Test
	void set_ValueTest()
	{
		TuplC t = mock(TuplC.class);
		
		when(t.set(1)).thenCallRealMethod();
		
		when(t.getDimensions()).thenReturn(2);
		when(t.setArray(new long[] {1l, 1l})).thenReturn(t);
		
		assertSame(t, t.set(1l));
		
		verify(t).set(1l);
		
		verify(t).getDimensions();
		verify(t).setArray(new long[] {1l, 1l});
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link TuplC#setArray(long[])} relays
	 * all array entries to the corresponding component by calling {@link TuplC#setByIndex(int, long)}
	 * and returns the current instance.
	 */
	@Test
	void setArrayTest()
	{
		TuplC t = mock(TuplC.class);
		
		when(t.setArray(new long[] {1l, 2l})).thenCallRealMethod();
		
		when(t.getDimensions()).thenReturn(2);
		
		assertSame(t, t.setArray(new long[] {1l, 2l}));
		
		verify(t).setArray(new long[] {1l, 2l});
		
		verify(t).getDimensions();
		verify(t).setByIndex(0, 1l);
		verify(t).setByIndex(1, 2l);
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link TuplC#shallowClone()} calls
	 * by default the standard {@link TuplC#clone()}-function.
	 */
	@Test
	void shallowCloneTest()
	{
		TuplC t = mock(TuplC.class);
		TuplC res = mock(TuplC.class);
		
		when(t.shallowClone()).thenCallRealMethod();
		when(t.clone()).thenReturn(res);
		
		assertSame(res, t.shallowClone());
		
		verify(t).shallowClone();
		verify(t).clone();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link TuplC#deepClone()} calls
	 * by default the standard {@link TuplC#clone()}-function.
	 */
	@Test
	void deepCloneTest()
	{
		TuplC t = mock(TuplC.class);
		TuplC res = mock(TuplC.class);

		when(t.deepClone()).thenCallRealMethod();
		when(t.clone()).thenReturn(res);
		
		assertSame(res, t.deepClone());
		
		verify(t).deepClone();
		verify(t).clone();
		
		verifyNoMoreInteractions(t);
	}
}