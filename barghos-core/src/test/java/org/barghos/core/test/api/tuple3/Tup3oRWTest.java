package org.barghos.core.test.api.tuple3;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;

import org.barghos.core.api.tuple3.Tup3oR;
import org.barghos.core.api.tuple3.Tup3oRW;
import org.barghos.core.api.tuple3.Tup3oW;

/**
 * This class provides component tests for the interface {@link Tup3oRW}.
 * 
 * @author picatrix1899
 */
class Tup3oRWTest
{
	/**
	 * This test ensures, that the interface extends the interface {@link Tup3oR}.
	 */
	@Test
	void inheritance_Tup3oRTest()
	{
		assertTrue(Tup3oR.class.isAssignableFrom(Tup3oRW.class));
	}
	
	/**
	 * This test ensures, that the interface extends the interface {@link Tup3oW}.
	 */
	@Test
	void inheritance_Tup3oWTest()
	{
		assertTrue(Tup3oW.class.isAssignableFrom(Tup3oRW.class));
	}
	
	/**
	 * This test ensures, that the function {@link Tup3oRW#set(Tup3oR)} adopts the
	 * values from the input tuple and returns the current instance.
	 */
	@Test
	void set_Tuple2Test()
	{
		@SuppressWarnings("unchecked")
		Tup3oRW<Integer,Double,String> t = (Tup3oRW<Integer,Double,String>)mock(Tup3oRW.class);
		
		@SuppressWarnings("unchecked")
		Tup3oR<Integer,Double,String> t2 = (Tup3oR<Integer,Double,String>)mock(Tup3oR.class);
		
		when(t.set(t2)).thenCallRealMethod();
		
		when(t2.getX()).thenReturn(1);
		when(t2.getY()).thenReturn(1.0);
		when(t2.getZ()).thenReturn("a");
		when(t.set(1, 1.0, "a")).thenReturn(t);
		
		assertSame(t, t.set(t2));
		
		verify(t).set(t2);
		
		verify(t2).getX();
		verify(t2).getY();
		verify(t2).getZ();
		verify(t).set(1, 1.0, "a");
		
		verifyNoMoreInteractions(t, t2);
	}
	
	/**
	 * This test ensures, that the function {@link Tup3oRW#set(Object, Object, Object)} adopts
	 * the values and returns the current instance.
	 */
	@Test
	void setTest()
	{
		@SuppressWarnings("unchecked")
		Tup3oRW<Integer,Double,String> t = (Tup3oRW<Integer,Double,String>)mock(Tup3oRW.class);
		
		when(t.set(1, 1.0, "a")).thenCallRealMethod();
		
		when(t.setX(1)).thenReturn(t);
		when(t.setY(1.0)).thenReturn(t);
		when(t.setZ("a")).thenReturn(t);
		
		assertSame(t, t.set(1, 1.0, "a"));
		
		verify(t).set(1, 1.0, "a");

		verify(t).setX(1);
		verify(t).setY(1.0);
		verify(t).setZ("a");
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the default implementation of the function {@link Tup3oR#getNewInstance(Tup3oR)} calls
	 * the function {@link Tup3oRW#getNewInstance(Object, Object, Object)} with the correct components.
	 */
	@Test
	void getNewInstance_Tuple2Test()
	{
		@SuppressWarnings("unchecked")
		Tup3oR<Integer,Double,String> original = (Tup3oR<Integer,Double,String>)mock(Tup3oR.class);
		
		@SuppressWarnings("unchecked")
		Tup3oRW<Integer,Double,String> newInstance = (Tup3oRW<Integer,Double,String>)mock(Tup3oRW.class);
		
		@SuppressWarnings("unchecked")
		Tup3oRW<Integer,Double,String> t = (Tup3oRW<Integer,Double,String>)mock(Tup3oRW.class);
		
		when(t.getNewInstance(original)).thenCallRealMethod();
		
		when(original.getX()).thenReturn(1);
		when(original.getY()).thenReturn(1.0);
		when(original.getZ()).thenReturn("a");
		when(t.getNewInstance(1, 1.0, "a")).thenReturn(newInstance);
		
		assertSame(newInstance, t.getNewInstance(original));
		
		verify(t).getNewInstance(original);
		
		verify(original).getX();
		verify(original).getY();
		verify(original).getZ();
		verify(t).getNewInstance(1, 1.0, "a");
		
		verifyNoMoreInteractions(t, original);
	}
}
