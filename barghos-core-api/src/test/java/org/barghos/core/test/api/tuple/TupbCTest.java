package org.barghos.core.test.api.tuple;

import static org.barghos.testutils.TestObjectFactory.*;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;
import org.barghos.core.api.tuple.TupbC;
import org.barghos.core.api.tuple.TupbR;

/**
 * This class provides component tests for the interface {@link TupbC}.
 * 
 * @author picatrix1899
 */
class TupbCTest
{
	/**
	 * This test ensures, that the interface extends the interface {@link TupbR}.
	 */
	@Test
	void inheritance_TupbRTest()
	{
		assertTrue(TupbR.class.isAssignableFrom(TupbC.class));
	}
	
	/**
	 * This test ensures, that the function {@link TupbC#set(TupbR)} adopts the
	 * values from the input tuple and returns the current instance.
	 */
	@Test
	void set_TupleTest()
	{
		TupbC t = mock(TupbC.class);
		TupbR t2 = mock(TupbR.class);
		
		when(t.set(t2)).thenCallRealMethod();
		
		when(t2.toArray()).thenReturn(bArray(1, 2));
		when(t.setArray(bArray(1, 2))).thenReturn(t);
		
		assertSame(t, t.set(t2));
		
		verify(t).set(t2);
		
		verify(t2).toArray();
		verify(t).setArray(bArray(1, 2));
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link TupbC#set(byte)} adopts the
	 * value for each component and returns the current instance.
	 */
	@Test
	void set_ValueTest()
	{
		TupbC t = mock(TupbC.class);
		
		when(t.set(b(1))).thenCallRealMethod();
		
		when(t.getDimensions()).thenReturn(2);
		when(t.setArray(bArray(1, 1))).thenReturn(t);
		
		assertSame(t, t.set(b(1)));
		
		verify(t).set(b(1));
		
		verify(t).getDimensions();
		verify(t).setArray(bArray(1, 1));
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link TupbC#setArray(byte[])} relays
	 * all array entries to the corresponding component by calling {@link TupbC#setByIndex(int, byte)}
	 * and returns the current instance.
	 */
	@Test
	void setArrayTest()
	{
		TupbC t = mock(TupbC.class);
		
		when(t.setArray(bArray(1, 2))).thenCallRealMethod();
		
		when(t.getDimensions()).thenReturn(2);
		
		assertSame(t, t.setArray(bArray(1, 2)));
		
		verify(t).setArray(bArray(1, 2));
		
		verify(t).getDimensions();
		verify(t).setByIndex(0, b(1));
		verify(t).setByIndex(1, b(2));
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link TupbC#shallowClone()} calls
	 * by default the standard {@link TupbC#clone()}-function.
	 */
	@Test
	void shallowCloneTest()
	{
		TupbC t = mock(TupbC.class);
		TupbC res = mock(TupbC.class);
		
		when(t.shallowClone()).thenCallRealMethod();
		when(t.clone()).thenReturn(res);
		
		assertSame(res, t.shallowClone());
		
		verify(t).shallowClone();
		verify(t).clone();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link TupbC#deepClone()} calls
	 * by default the standard {@link TupbC#clone()}-function.
	 */
	@Test
	void deepCloneTest()
	{
		TupbC t = mock(TupbC.class);
		TupbC res = mock(TupbC.class);

		when(t.deepClone()).thenCallRealMethod();
		when(t.clone()).thenReturn(res);
		
		assertSame(res, t.deepClone());
		
		verify(t).deepClone();
		verify(t).clone();
		
		verifyNoMoreInteractions(t);
	}
}