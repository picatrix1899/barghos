package org.barghos.tuple.api.test.t4;

import static org.junit.jupiter.api.Assertions.*;

import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;

import org.barghos.tuple.api.t4.Tup4oC;
import org.barghos.tuple.api.t4.Tup4oR;

/**
 * This class provides component tests for the interface {@link Tup4oC}.
 * 
 * @author picatrix1899
 */
class Tup4oCTest
{

	/**
	 * This test ensures, that the interface extends the interface
	 * {@link Tup4oR}.
	 */
	@Test
	void inheritance_Tup4RTest()
	{
		assertTrue(Tup4oR.class.isAssignableFrom(Tup4oC.class));
	}

	/**
	 * This test ensures, that the function {@link Tup4oC#set(Tup4oR)} adopts
	 * the values from the input tuple and returns the current instance.
	 */
	@Test
	void set_Tuple2Test()
	{
		@SuppressWarnings("unchecked")
		Tup4oC<Integer,Double,String,Character> t = (Tup4oC<Integer,Double,String,Character>)mock(Tup4oC.class);

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
	 * This test ensures, that the function
	 * {@link Tup4oC#set(Object, Object, Object, Object)} adopts the values and
	 * returns the current instance.
	 */
	@Test
	void setTest()
	{
		@SuppressWarnings("unchecked")
		Tup4oC<Integer,Double,String,Character> t = (Tup4oC<Integer,Double,String,Character>)mock(Tup4oC.class);

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
