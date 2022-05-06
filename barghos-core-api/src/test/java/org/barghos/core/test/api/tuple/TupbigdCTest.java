package org.barghos.core.test.api.tuple;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.barghos.core.api.testing.TestObjectFactory.*;

import org.barghos.core.api.tuple.TupbigdC;
import org.barghos.core.api.tuple.TupbigdR;

/**
 * This class provides component tests for the interface {@link TupbigdC}.
 * 
 * @author picatrix1899
 */
class TupbigdCTest
{
	/**
	 * This test ensures, that the interface extends the interface {@link TupbigdR}.
	 */
	@Test
	void inheritance_TupbigdRTest()
	{
		assertTrue(TupbigdR.class.isAssignableFrom(TupbigdC.class));
	}
	
	/**
	 * This test ensures, that the function {@link TupbigdC#set(TupbigdR)} adopts the
	 * values from the input tuple and returns the current instance.
	 */
	@Test
	void set_TupleTest()
	{
		TupbigdC t = mock(TupbigdC.class);
		TupbigdR t2 = mock(TupbigdR.class);
		
		when(t.set(t2)).thenCallRealMethod();
		
		when(t2.toArray()).thenReturn(bigdArray(1, 2));
		when(t.setArray(bigdArray(1, 2))).thenReturn(t);
		
		assertSame(t, t.set(t2));
		
		verify(t).set(t2);
		
		verify(t2).toArray();
		verify(t).setArray(bigdArray(1, 2));
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link TupbigdC#set(BigDecimal)} adopts the
	 * value for each component and returns the current instance.
	 */
	@Test
	void set_ValueTest()
	{
		TupbigdC t = mock(TupbigdC.class);
		
		when(t.set(bigd(1))).thenCallRealMethod();
		
		when(t.getDimensions()).thenReturn(2);
		when(t.setArray(bigdArray(1, 1))).thenReturn(t);
		
		assertSame(t, t.set(bigd(1)));
		
		verify(t).set(bigd(1));
		
		verify(t).getDimensions();
		verify(t).setArray(bigdArray(1, 1));
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link TupbigdC#setArray(BigDecimal[])} relays
	 * all array entries to the corresponding component by calling {@link TupbigdC#setByIndex(int, BigDecimal)}
	 * and returns the current instance.
	 */
	@Test
	void setArrayTest()
	{
		TupbigdC t = mock(TupbigdC.class);
		
		when(t.setArray(bigdArray(1, 2))).thenCallRealMethod();
		
		when(t.getDimensions()).thenReturn(2);
		
		assertSame(t, t.setArray(bigdArray(1, 2)));
		
		verify(t).setArray(bigdArray(1, 2));
		
		verify(t).getDimensions();
		verify(t).setByIndex(0, bigd(1));
		verify(t).setByIndex(1, bigd(2));
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link TupbigdC#shallowClone()} calls
	 * by default the standard {@link TupbigdC#clone()}-function.
	 */
	@Test
	void shallowCloneTest()
	{
		TupbigdC t = mock(TupbigdC.class);
		TupbigdC res = mock(TupbigdC.class);
		
		when(t.shallowClone()).thenCallRealMethod();
		when(t.clone()).thenReturn(res);
		
		assertSame(res, t.shallowClone());
		
		verify(t).shallowClone();
		verify(t).clone();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link TupbigdC#deepClone()} calls
	 * by default the standard {@link TupbigdC#clone()}-function.
	 */
	@Test
	void deepCloneTest()
	{
		TupbigdC t = mock(TupbigdC.class);
		TupbigdC res = mock(TupbigdC.class);

		when(t.deepClone()).thenCallRealMethod();
		when(t.clone()).thenReturn(res);
		
		assertSame(res, t.deepClone());
		
		verify(t).deepClone();
		verify(t).clone();
		
		verifyNoMoreInteractions(t);
	}
}