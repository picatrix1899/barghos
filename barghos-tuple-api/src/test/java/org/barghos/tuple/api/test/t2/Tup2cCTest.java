package org.barghos.tuple.api.test.t2;

import static org.junit.jupiter.api.Assertions.*;

import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;

import org.barghos.tuple.api.t2.Tup2cC;
import org.barghos.tuple.api.t2.Tup2cR;
import org.barghos.tuple.api.tn.TupcC;
import org.barghos.tuple.api.tn.TupcR;

/**
 * This class provides comoponent tests for the interface {@link Tup2cC}.
 * 
 * @author picatrix1899
 */
class Tup2cCTest
{

	/**
	 * This test ensures, that the interface extends the interface
	 * {@link Tup2cR}.
	 */
	@Test
	void inheritance_Tup2RTest()
	{
		assertTrue(Tup2cR.class.isAssignableFrom(Tup2cC.class));
	}

	/**
	 * This test ensures, that the interface extends the interface
	 * {@link TupcC}.
	 */
	@Test
	void inheritance_TupCTest()
	{
		assertTrue(TupcC.class.isAssignableFrom(Tup2cC.class));
	}

	/**
	 * this test ensures, that the function {@link Tup2cC#getDimensions()}
	 * always returns 2 and does not make any calls.
	 */
	@Test
	void getDimensionsTest()
	{
		Tup2cC t = mock(Tup2cC.class);

		when(t.getDimensions()).thenCallRealMethod();

		assertEquals(2, t.getDimensions());

		verify(t).getDimensions();

		verifyNoMoreInteractions(t);
	}

	/**
	 * This test ensures, that the function {@link Tup2cC#set(Tup2cR)} adopts
	 * the values from the input tuple and returns the current instance.
	 */
	@Test
	void set_Tuple2Test()
	{
		Tup2cC t = mock(Tup2cC.class);
		Tup2cR t2 = mock(Tup2cR.class);

		when(t.set(t2)).thenCallRealMethod();

		when(t2.getX()).thenReturn('a');
		when(t2.getY()).thenReturn('b');
		when(t.set('a', 'b')).thenReturn(t);

		assertSame(t, t.set(t2));

		verify(t).set(t2);

		verify(t2).getX();
		verify(t2).getY();
		verify(t).set('a', 'b');

		verifyNoMoreInteractions(t, t2);
	}

	/**
	 * This test ensures, that the function {@link Tup2cC#set(char)} adopts the
	 * value for each component and returns the current instance.
	 */
	@Test
	void set_ValueTest()
	{
		Tup2cC t = mock(Tup2cC.class);

		when(t.set('a')).thenCallRealMethod();

		when(t.set('a', 'a')).thenReturn(t);

		assertSame(t, t.set('a'));

		verify(t).set('a');

		verify(t).set('a', 'a');

		verifyNoMoreInteractions(t);
	}

	/**
	 * This test ensures, that the function {@link Tup2cC#set(char, char)}
	 * adopts the values and returns the current instance.
	 */
	@Test
	void setTest()
	{
		Tup2cC t = mock(Tup2cC.class);

		when(t.set('a', 'b')).thenCallRealMethod();

		when(t.setX('a')).thenReturn(t);
		when(t.setY('b')).thenReturn(t);

		assertSame(t, t.set('a', 'b'));

		verify(t).set('a', 'b');

		verify(t).setX('a');
		verify(t).setY('b');

		verifyNoMoreInteractions(t);
	}

	/**
	 * This test ensures, that the function {@link Tup2cC#set(TupcR)} adopts the
	 * values from the input tuple and returns the current instance.
	 */
	@Test
	void set_TupleTest()
	{
		Tup2cC t = mock(Tup2cC.class);
		TupcR t2 = mock(TupcR.class);

		when(t.set(t2)).thenCallRealMethod();

		when(t2.toArray()).thenReturn(new char[] {'a', 'b'});
		when(t.setArray(new char[] {'a', 'b'})).thenReturn(t);

		assertSame(t, t.set(t2));

		verify(t).set(t2);

		verify(t2).toArray();
		verify(t).setArray(new char[] {'a', 'b'});

		verifyNoMoreInteractions(t);
	}

	/**
	 * This test ensures, that the function {@link Tup2cC#setArray(char[])}
	 * adopts the values and returns the current instance.
	 */
	@Test
	void setArrayTest()
	{
		Tup2cC t = mock(Tup2cC.class);

		when(t.setArray(new char[] {'a', 'b'})).thenCallRealMethod();

		when(t.set('a', 'b')).thenReturn(t);

		assertSame(t, t.setArray(new char[] {'a', 'b'}));

		verify(t).setArray(new char[] {'a', 'b'});

		verify(t).set('a', 'b');

		verifyNoMoreInteractions(t);
	}

	/**
	 * This test ensures, that the function {@link Tup2cC#setByIndex(int, char)}
	 * adopts the value to the x component if the index is 0 and returns the
	 * current instance.
	 */
	@Test
	void setByIndex_XTest()
	{
		Tup2cC t = mock(Tup2cC.class);

		when(t.setByIndex(0, 'a')).thenCallRealMethod();

		when(t.setX('a')).thenReturn(t);

		assertSame(t, t.setByIndex(0, 'a'));

		verify(t).setByIndex(0, 'a');

		verify(t).setX('a');

		verifyNoMoreInteractions(t);
	}

	/**
	 * This test ensures, that the function {@link Tup2cC#setByIndex(int, char)}
	 * adopts the value to the y component if the index is 1 and returns the
	 * current instance.
	 */
	@Test
	void setByIndex_YTest()
	{
		Tup2cC t = mock(Tup2cC.class);

		when(t.setByIndex(1, 'a')).thenCallRealMethod();

		when(t.setY('a')).thenReturn(t);

		assertSame(t, t.setByIndex(1, 'a'));

		verify(t).setByIndex(1, 'a');

		verify(t).setY('a');

		verifyNoMoreInteractions(t);
	}
}
