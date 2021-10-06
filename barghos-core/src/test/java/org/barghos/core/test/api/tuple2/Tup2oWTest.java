package org.barghos.core.test.api.tuple2;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;

import org.barghos.core.api.tuple2.Tup2oR;
import org.barghos.core.api.tuple2.Tup2oW;

/**
 * This class provides component tests for the interface {@link Tup2oW}.
 * 
 * @author picatrix1899
 */
class Tup2oWTest
{
	/**
	 * This test ensures, that the function {@link Tup2oW#set(Tup2oR)} adopts the
	 * values from the input tuple and returns the current instance.
	 */
	@Test
	void set_Tuple2Test()
	{
		@SuppressWarnings("unchecked")
		Tup2oW<Integer,Double> t = (Tup2oW<Integer,Double>)mock(Tup2oW.class);
		
		@SuppressWarnings("unchecked")
		Tup2oR<Integer,Double> t2 = (Tup2oR<Integer,Double>)mock(Tup2oR.class);
		
		when(t.set(t2)).thenCallRealMethod();
		
		when(t2.getX()).thenReturn(1);
		when(t2.getY()).thenReturn(1.0);
		when(t.set(1, 1.0)).thenReturn(t);
		
		assertSame(t, t.set(t2));
		
		verify(t).set(t2);
		
		verify(t2).getX();
		verify(t2).getY();
		verify(t).set(1, 1.0);
		
		verifyNoMoreInteractions(t, t2);
	}
	
	/**
	 * This test ensures, that the function {@link Tup2oW#set(Object, Object)} adopts
	 * the values and returns the current instance.
	 */
	@Test
	void setTest()
	{
		@SuppressWarnings("unchecked")
		Tup2oW<Integer,Double> t = (Tup2oW<Integer,Double>)mock(Tup2oW.class);
		
		when(t.set(1, 1.0)).thenCallRealMethod();
		
		when(t.setX(1)).thenReturn(t);
		when(t.setY(1.0)).thenReturn(t);
		
		assertSame(t, t.set(1, 1.0));
		
		verify(t).set(1, 1.0);

		verify(t).setX(1);
		verify(t).setY(1.0);
		
		verifyNoMoreInteractions(t);
	}
}
