package org.barghos.tuple.api.test.t4;

import static org.junit.jupiter.api.Assertions.*;

import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;

import org.barghos.tuple.api.t4.Tup4cC;
import org.barghos.tuple.api.t4.Tup4cR;
import org.barghos.tuple.api.tn.TupcC;
import org.barghos.tuple.api.tn.TupcR;

/**
 * This class provides comoponent tests for the interface {@link Tup4cC}.
 * 
 * @author picatrix1899
 */
class Tup4cCTest
{

	/**
	 * This test ensures, that the interface extends the interface
	 * {@link Tup4cR}.
	 */
	@Test
	void inheritance_Tup4RTest()
	{
		assertTrue(Tup4cR.class.isAssignableFrom(Tup4cC.class));
	}

	/**
	 * This test ensures, that the interface extends the interface
	 * {@link TupcC}.
	 */
	@Test
	void inheritance_TupCTest()
	{
		assertTrue(TupcC.class.isAssignableFrom(Tup4cC.class));
	}

	/**
	 * This test ensures, that the function {@link Tup4cC#set(Tup4cR)} adopts
	 * the values from the input tuple and returns the current instance.
	 */
	@Test
	void set_Tuple2Test()
	{
		Tup4cC t = mock(Tup4cC.class);
		Tup4cR t2 = mock(Tup4cR.class);

		when(t.set(t2)).thenCallRealMethod();

		when(t2.getX()).thenReturn('a');
		when(t2.getY()).thenReturn('b');
		when(t2.getZ()).thenReturn('c');
		when(t2.getW()).thenReturn('d');
		when(t.set('a', 'b', 'c', 'd')).thenReturn(t);

		assertSame(t, t.set(t2));

		verify(t).set(t2);

		verify(t2).getX();
		verify(t2).getY();
		verify(t2).getZ();
		verify(t2).getW();
		verify(t).set('a', 'b', 'c', 'd');

		verifyNoMoreInteractions(t, t2);
	}

	/**
	 * This test ensures, that the function {@link Tup4cC#set(char)} adopts the
	 * value for each component and returns the current instance.
	 */
	@Test
	void set_ValueTest()
	{
		Tup4cC t = mock(Tup4cC.class);

		when(t.set('a')).thenCallRealMethod();

		when(t.set('a', 'a', 'a', 'a')).thenReturn(t);

		assertSame(t, t.set('a'));

		verify(t).set('a');

		verify(t).set('a', 'a', 'a', 'a');

		verifyNoMoreInteractions(t);
	}

	/**
	 * This test ensures, that the function
	 * {@link Tup4cC#set(char, char, char, char)} adopts the values and returns
	 * the current instance.
	 */
	@Test
	void setTest()
	{
		Tup4cC t = mock(Tup4cC.class);

		when(t.set('a', 'b', 'c', 'd')).thenCallRealMethod();

		when(t.setX('a')).thenReturn(t);
		when(t.setY('b')).thenReturn(t);
		when(t.setZ('c')).thenReturn(t);
		when(t.setW('d')).thenReturn(t);

		assertSame(t, t.set('a', 'b', 'c', 'd'));

		verify(t).set('a', 'b', 'c', 'd');

		verify(t).setX('a');
		verify(t).setY('b');
		verify(t).setZ('c');
		verify(t).setW('d');

		verifyNoMoreInteractions(t);
	}

	/**
	 * This test ensures, that the function {@link Tup4cC#set(TupcR)} adopts the
	 * values from the input tuple and returns the current instance.
	 */
	@Test
	void set_TupleTest()
	{
		Tup4cC t = mock(Tup4cC.class);
		TupcR t2 = mock(TupcR.class);

		when(t.set(t2)).thenCallRealMethod();

		when(t2.toArray()).thenReturn(new char[] {'a', 'b', 'c', 'd'});
		when(t.setArray(new char[] {'a', 'b', 'c', 'd'})).thenReturn(t);

		assertSame(t, t.set(t2));

		verify(t).set(t2);

		verify(t2).toArray();
		verify(t).setArray(new char[] {'a', 'b', 'c', 'd'});

		verifyNoMoreInteractions(t);
	}

	/**
	 * This test ensures, that the function {@link Tup4cC#setArray(char[])}
	 * adopts the values and returns the current instance.
	 */
	@Test
	void setArrayTest()
	{
		Tup4cC t = mock(Tup4cC.class);

		when(t.setArray(new char[] {'a', 'b', 'c', 'd'})).thenCallRealMethod();

		when(t.set('a', 'b', 'c', 'd')).thenReturn(t);

		assertSame(t, t.setArray(new char[] {'a', 'b', 'c', 'd'}));

		verify(t).setArray(new char[] {'a', 'b', 'c', 'd'});

		verify(t).set('a', 'b', 'c', 'd');

		verifyNoMoreInteractions(t);
	}

	/**
	 * This test ensures, that the function {@link Tup4cC#setByIndex(int, char)}
	 * adopts the value to the x component if the index is 0 and returns the
	 * current instance.
	 */
	@Test
	void setByIndex_XTest()
	{
		Tup4cC t = mock(Tup4cC.class);

		when(t.setByIndex(0, 'a')).thenCallRealMethod();

		when(t.setX('a')).thenReturn(t);

		assertSame(t, t.setByIndex(0, 'a'));

		verify(t).setByIndex(0, 'a');

		verify(t).setX('a');

		verifyNoMoreInteractions(t);
	}

	/**
	 * This test ensures, that the function {@link Tup4cC#setByIndex(int, char)}
	 * adopts the value to the y component if the index is 1 and returns the
	 * current instance.
	 */
	@Test
	void setByIndex_YTest()
	{
		Tup4cC t = mock(Tup4cC.class);

		when(t.setByIndex(1, 'a')).thenCallRealMethod();

		when(t.setY('a')).thenReturn(t);

		assertSame(t, t.setByIndex(1, 'a'));

		verify(t).setByIndex(1, 'a');

		verify(t).setY('a');

		verifyNoMoreInteractions(t);
	}

	/**
	 * This test ensures, that the function {@link Tup4cC#setByIndex(int, char)}
	 * adopts the value to the z component if the index is 2 and returns the
	 * current instance.
	 */
	@Test
	void setByIndex_ZTest()
	{
		Tup4cC t = mock(Tup4cC.class);

		when(t.setByIndex(2, 'a')).thenCallRealMethod();

		when(t.setZ('a')).thenReturn(t);

		assertSame(t, t.setByIndex(2, 'a'));

		verify(t).setByIndex(2, 'a');

		verify(t).setZ('a');

		verifyNoMoreInteractions(t);
	}

	/**
	 * This test ensures, that the function {@link Tup4cC#setByIndex(int, char)}
	 * adopts the value to the w component if the index is 3 and returns the
	 * current instance.
	 */
	@Test
	void setByIndex_WTest()
	{
		Tup4cC t = mock(Tup4cC.class);

		when(t.setByIndex(3, 'a')).thenCallRealMethod();

		when(t.setW('a')).thenReturn(t);

		assertSame(t, t.setByIndex(3, 'a'));

		verify(t).setByIndex(3, 'a');

		verify(t).setW('a');

		verifyNoMoreInteractions(t);
	}
}
