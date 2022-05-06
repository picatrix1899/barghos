package org.barghos.core.test.api.tuple;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;

import static org.barghos.core.api.testing.TestObjectFactory.*;

import org.barghos.core.api.tuple.TupsC;
import org.barghos.core.api.tuple.TupsR;

/**
 * This class provides component tests for the interface {@link TupsC}.
 * 
 * @author picatrix1899
 */
class TupsCTest
{
	/**
	 * This test ensures, that the interface extends the interface {@link TupsR}.
	 */
	@Test
	void inheritance_TupsRTest()
	{
		assertTrue(TupsR.class.isAssignableFrom(TupsC.class));
	}
	
	/**
	 * This test ensures, that the function {@link TupsC#set(TupsR)} adopts the
	 * values from the input tuple and returns the current instance.
	 */
	@Test
	void set_TupleTest()
	{
		TupsC t = mock(TupsC.class);
		TupsR t2 = mock(TupsR.class);
		
		when(t.set(t2)).thenCallRealMethod();
		
		when(t2.toArray()).thenReturn(sArray(1, 2));
		when(t.setArray(sArray(1, 2))).thenReturn(t);
		
		assertSame(t, t.set(t2));
		
		verify(t).set(t2);
		
		verify(t2).toArray();
		verify(t).setArray(sArray(1, 2));
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link TupsC#set(short)} adopts the
	 * value for each component and returns the current instance.
	 */
	@Test
	void set_ValueTest()
	{
		TupsC t = mock(TupsC.class);
		
		when(t.set(s(1))).thenCallRealMethod();
		
		when(t.getDimensions()).thenReturn(2);
		when(t.setArray(sArray(1, 1))).thenReturn(t);
		
		assertSame(t, t.set(s(1)));
		
		verify(t).set(s(1));
		
		verify(t).getDimensions();
		verify(t).setArray(sArray(1, 1));
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link TupsC#setArray(short[])} relays
	 * all array entries to the corresponding component by calling {@link TupsC#setByIndex(int, short)}
	 * and returns the current instance.
	 */
	@Test
	void setArrayTest()
	{
		TupsC t = mock(TupsC.class);
		
		when(t.setArray(sArray(1, 2))).thenCallRealMethod();
		
		when(t.getDimensions()).thenReturn(2);
		
		assertSame(t, t.setArray(sArray(1, 2)));
		
		verify(t).setArray(sArray(1, 2));
		
		verify(t).getDimensions();
		verify(t).setByIndex(0, s(1));
		verify(t).setByIndex(1, s(2));
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link TupsC#shallowClone()} calls
	 * by default the standard {@link TupsC#clone()}-function.
	 */
	@Test
	void shallowCloneTest()
	{
		TupsC t = mock(TupsC.class);
		TupsC res = mock(TupsC.class);
		
		when(t.shallowClone()).thenCallRealMethod();
		when(t.clone()).thenReturn(res);
		
		assertSame(res, t.shallowClone());
		
		verify(t).shallowClone();
		verify(t).clone();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link TupsC#deepClone()} calls
	 * by default the standard {@link TupsC#clone()}-function.
	 */
	@Test
	void deepCloneTest()
	{
		TupsC t = mock(TupsC.class);
		TupsC res = mock(TupsC.class);

		when(t.deepClone()).thenCallRealMethod();
		when(t.clone()).thenReturn(res);
		
		assertSame(res, t.deepClone());
		
		verify(t).deepClone();
		verify(t).clone();
		
		verifyNoMoreInteractions(t);
	}
}