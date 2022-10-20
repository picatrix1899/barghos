package org.barghos.tuple.api.test.t2;

import static org.junit.jupiter.api.Assertions.*;

import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;

import org.barghos.tuple.api.t2.Tup2strC;
import org.barghos.tuple.api.t2.Tup2strR;
import org.barghos.tuple.api.tn.TupstrC;
import org.barghos.tuple.api.tn.TupstrR;

/**
 * This class provides comoponent tests for the interface {@link Tup2strC}.
 * 
 * @author picatrix1899
 */
class Tup2strCTest
{

	/**
	 * This test ensures, that the interface extends the interface
	 * {@link Tup2strR}.
	 */
	@Test
	void inheritance_Tup2RTest()
	{
		assertTrue(Tup2strR.class.isAssignableFrom(Tup2strC.class));
	}

	/**
	 * This test ensures, that the interface extends the interface
	 * {@link TupstrC}.
	 */
	@Test
	void inheritance_TupCTest()
	{
		assertTrue(TupstrC.class.isAssignableFrom(Tup2strC.class));
	}

	/**
	 * This test ensures, that the function {@link Tup2strC#set(Tup2strR)}
	 * adopts the values from the input tuple and returns the current instance.
	 */
	@Test
	void set_Tuple2Test()
	{
		Tup2strC t = mock(Tup2strC.class);
		Tup2strR t2 = mock(Tup2strR.class);

		when(t.set(t2)).thenCallRealMethod();

		when(t2.getX()).thenReturn("a");
		when(t2.getY()).thenReturn("b");
		when(t.set("a", "b")).thenReturn(t);

		assertSame(t, t.set(t2));

		verify(t).set(t2);

		verify(t2).getX();
		verify(t2).getY();
		verify(t).set("a", "b");

		verifyNoMoreInteractions(t, t2);
	}

	/**
	 * This test ensures, that the function {@link Tup2strC#set(String)} adopts
	 * the value for each component and returns the current instance.
	 */
	@Test
	void set_ValueTest()
	{
		Tup2strC t = mock(Tup2strC.class);

		when(t.set("a")).thenCallRealMethod();

		when(t.set("a", "a")).thenReturn(t);

		assertSame(t, t.set("a"));

		verify(t).set("a");

		verify(t).set("a", "a");

		verifyNoMoreInteractions(t);
	}

	/**
	 * This test ensures, that the function {@link Tup2strC#set(String, String)}
	 * adopts the values and returns the current instance.
	 */
	@Test
	void setTest()
	{
		Tup2strC t = mock(Tup2strC.class);

		when(t.set("a", "b")).thenCallRealMethod();

		when(t.setX("a")).thenReturn(t);
		when(t.setY("b")).thenReturn(t);

		assertSame(t, t.set("a", "b"));

		verify(t).set("a", "b");

		verify(t).setX("a");
		verify(t).setY("b");

		verifyNoMoreInteractions(t);
	}

	/**
	 * This test ensures, that the function {@link Tup2strC#set(TupstrR)} adopts
	 * the values from the input tuple and returns the current instance.
	 */
	@Test
	void set_TupleTest()
	{
		Tup2strC t = mock(Tup2strC.class);
		TupstrR t2 = mock(TupstrR.class);

		when(t.set(t2)).thenCallRealMethod();

		when(t2.toArray()).thenReturn(new String[] {"a", "b"});
		when(t.setArray("a", "b")).thenReturn(t);

		assertSame(t, t.set(t2));

		verify(t).set(t2);

		verify(t2).toArray();
		verify(t).setArray("a", "b");

		verifyNoMoreInteractions(t);
	}

	/**
	 * This test ensures, that the function {@link Tup2strC#setArray(String[])}
	 * adopts the values and returns the current instance.
	 */
	@Test
	void setArrayTest()
	{
		Tup2strC t = mock(Tup2strC.class);

		when(t.setArray(new String[] {"a", "b"})).thenCallRealMethod();

		when(t.set("a", "b")).thenReturn(t);

		assertSame(t, t.setArray(new String[] {"a", "b"}));

		verify(t).setArray(new String[] {"a", "b"});

		verify(t).set("a", "b");

		verifyNoMoreInteractions(t);
	}

	/**
	 * This test ensures, that the function
	 * {@link Tup2strC#setByIndex(int, String)} adopts the value to the x
	 * component if the index is 0 and returns the current instance.
	 */
	@Test
	void setByIndex_XTest()
	{
		Tup2strC t = mock(Tup2strC.class);

		when(t.setByIndex(0, "a")).thenCallRealMethod();

		when(t.setX("a")).thenReturn(t);

		assertSame(t, t.setByIndex(0, "a"));

		verify(t).setByIndex(0, "a");

		verify(t).setX("a");

		verifyNoMoreInteractions(t);
	}

	/**
	 * This test ensures, that the function
	 * {@link Tup2strC#setByIndex(int, String)} adopts the value to the y
	 * component if the index is 1 and returns the current instance.
	 */
	@Test
	void setByIndex_YTest()
	{
		Tup2strC t = mock(Tup2strC.class);

		when(t.setByIndex(1, "a")).thenCallRealMethod();

		when(t.setY("a")).thenReturn(t);

		assertSame(t, t.setByIndex(1, "a"));

		verify(t).setByIndex(1, "a");

		verify(t).setY("a");

		verifyNoMoreInteractions(t);
	}
}
