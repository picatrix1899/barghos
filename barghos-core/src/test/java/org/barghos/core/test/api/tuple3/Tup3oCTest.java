package org.barghos.core.test.api.tuple3;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;
import org.barghos.core.api.tuple3.Tup3oC;
import org.barghos.core.api.tuple3.Tup3oR;

/**
 * This class provides component tests for the interface {@link Tup3oC}.
 * 
 * @author picatrix1899
 */
class Tup3oCTest
{
	/**
	 * This test ensures, that the interface extends the interface {@link Tup3oR}.
	 */
	@Test
	void inheritance_Tup3oRTest()
	{
		assertTrue(Tup3oR.class.isAssignableFrom(Tup3oC.class));
	}
	
	/**
	 * This test ensures, that the function {@link Tup3oC#set(Tup3oR)} adopts the
	 * values from the input tuple and returns the current instance.
	 */
	@Test
	void set_Tuple2Test()
	{
		@SuppressWarnings("unchecked")
		Tup3oC<Integer,Double,String> t = (Tup3oC<Integer,Double,String>)mock(Tup3oC.class);
		
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
	 * This test ensures, that the function {@link Tup3oC#set(Object, Object, Object)} adopts
	 * the values and returns the current instance.
	 */
	@Test
	void setTest()
	{
		@SuppressWarnings("unchecked")
		Tup3oC<Integer,Double,String> t = (Tup3oC<Integer,Double,String>)mock(Tup3oC.class);
		
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
}
