package org.barghos.core.test.api.tuple4;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;
import org.barghos.core.api.tuple4.Tup4oBase;
import org.barghos.core.api.tuple4.Tup4oR;

/**
 * This class provides component tests for the interface {@link Tup4oBase}.
 * 
 * @author picatrix1899
 */
class Tup4oBaseTest
{
	/**
	 * This test ensures, that the interface extends the interface {@link Tup4oR}.
	 */
	@Test
	void inheritance_Tup4oRTest()
	{
		assertTrue(Tup4oR.class.isAssignableFrom(Tup4oBase.class));
	}
	
	/**
	 * This test ensures, that the function {@link Tup4oBase#set(Tup4oR)} adopts the
	 * values from the input tuple and returns the current instance.
	 */
	@Test
	void set_Tuple2Test()
	{
		@SuppressWarnings("unchecked")
		Tup4oBase<Integer,Double,String,Character> t = (Tup4oBase<Integer,Double,String,Character>)mock(Tup4oBase.class);
		
		@SuppressWarnings("unchecked")
		Tup4oR<Integer,Double,String,Character> t2 = (Tup4oR<Integer,Double,String,Character>)mock(Tup4oR.class);
		
		when(t.set(t2)).thenCallRealMethod();
		
		when(t2.getX()).thenReturn(1);
		when(t2.getY()).thenReturn(1.0);
		when(t2.getZ()).thenReturn("a");
		when(t2.getW()).thenReturn('a');
		when(t.set(1, 1.0, "a", 'a')).thenReturn(t);
		
		assertSame(t, t.set(t2));
		
		verify(t).set(t2);
		
		verify(t2).getX();
		verify(t2).getY();
		verify(t2).getZ();
		verify(t2).getW();
		verify(t).set(1, 1.0, "a", 'a');
		
		verifyNoMoreInteractions(t, t2);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4oBase#set(Object, Object, Object, Object)} adopts
	 * the values and returns the current instance.
	 */
	@Test
	void setTest()
	{
		@SuppressWarnings("unchecked")
		Tup4oBase<Integer,Double,String,Character> t = (Tup4oBase<Integer,Double,String,Character>)mock(Tup4oBase.class);
		
		when(t.set(1, 1.0, "a", 'a')).thenCallRealMethod();
		
		when(t.setX(1)).thenReturn(t);
		when(t.setY(1.0)).thenReturn(t);
		when(t.setZ("a")).thenReturn(t);
		when(t.setW('a')).thenReturn(t);
		
		assertSame(t, t.set(1, 1.0, "a", 'a'));
		
		verify(t).set(1, 1.0, "a", 'a');

		verify(t).setX(1);
		verify(t).setY(1.0);
		verify(t).setZ("a");
		verify(t).setW('a');
		
		verifyNoMoreInteractions(t);
	}
}
