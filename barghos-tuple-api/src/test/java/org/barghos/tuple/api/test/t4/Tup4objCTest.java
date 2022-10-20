package org.barghos.tuple.api.test.t4;

import static org.junit.jupiter.api.Assertions.*;

import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;

import org.barghos.tuple.api.t4.Tup4objC;
import org.barghos.tuple.api.t4.Tup4objR;
import org.barghos.tuple.api.tn.TupobjC;
import org.barghos.tuple.api.tn.TupobjR;

/**
 * This class provides comoponent tests for the interface {@link Tup4objC}.
 * 
 * @author picatrix1899
 */
class Tup4objCTest
{

	/**
	 * This test ensures, that the interface extends the interface
	 * {@link Tup4objR}.
	 */
	@Test
	void inheritance_Tup4RTest()
	{
		assertTrue(Tup4objR.class.isAssignableFrom(Tup4objC.class));
	}

	/**
	 * This test ensures, that the interface extends the interface
	 * {@link TupobjC}.
	 */
	@Test
	void inheritance_TupCTest()
	{
		assertTrue(TupobjC.class.isAssignableFrom(Tup4objC.class));
	}

	/**
	 * This test ensures, that the function {@link Tup4objC#set(Tup4objR)}
	 * adopts the values from the input tuple and returns the current instance.
	 */
	@Test
	void set_Tuple2Test()
	{
		Tup4objC t = mock(Tup4objC.class);
		Tup4objR t2 = mock(Tup4objR.class);

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
	 * This test ensures, that the function {@link Tup4objC#set(Object)} adopts
	 * the value for each component and returns the current instance.
	 */
	@Test
	void set_ValueTest()
	{
		Tup4objC t = mock(Tup4objC.class);

		when(t.set(1.0)).thenCallRealMethod();

		when(t.set(1.0, 1.0, 1.0, 1.0)).thenReturn(t);

		assertSame(t, t.set(1.0));

		verify(t).set(1.0);

		verify(t).set(1.0, 1.0, 1.0, 1.0);

		verifyNoMoreInteractions(t);
	}

	/**
	 * This test ensures, that the function
	 * {@link Tup4objC#set(Object, Object, Object, Object)} adopts the values
	 * and returns the current instance.
	 */
	@Test
	void setTest()
	{
		Tup4objC t = mock(Tup4objC.class);

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

	/**
	 * This test ensures, that the function {@link Tup4objC#set(TupobjR)} adopts
	 * the values from the input tuple and returns the current instance.
	 */
	@Test
	void set_TupleTest()
	{
		Tup4objC t = mock(Tup4objC.class);
		TupobjR t2 = mock(TupobjR.class);

		when(t.set(t2)).thenCallRealMethod();

		when(t2.toArray()).thenReturn(new Object[] {1, 1.0, "a", 'a'});
		when(t.setArray(new Object[] {1, 1.0, "a", 'a'})).thenReturn(t);

		assertSame(t, t.set(t2));

		verify(t).set(t2);

		verify(t2).toArray();
		verify(t).setArray(new Object[] {1, 1.0, "a", 'a'});

		verifyNoMoreInteractions(t);
	}

	/**
	 * This test ensures, that the function {@link Tup4objC#setArray(Object[])}
	 * adopts the values and returns the current instance.
	 */
	@Test
	void setArrayTest()
	{
		Tup4objC t = mock(Tup4objC.class);

		when(t.setArray(new Object[] {1, 1.0, "a", 'a'})).thenCallRealMethod();

		when(t.set(1, 1.0, "a", 'a')).thenReturn(t);

		assertSame(t, t.setArray(new Object[] {1, 1.0, "a", 'a'}));

		verify(t).setArray(new Object[] {1, 1.0, "a", 'a'});

		verify(t).set(1, 1.0, "a", 'a');

		verifyNoMoreInteractions(t);
	}

	/**
	 * This test ensures, that the function
	 * {@link Tup4objC#setByIndex(int, Object)} adopts the value to the x
	 * component if the index is 0 and returns the current instance.
	 */
	@Test
	void setByIndex_XTest()
	{
		Tup4objC t = mock(Tup4objC.class);

		when(t.setByIndex(0, 1)).thenCallRealMethod();

		when(t.setX(1)).thenReturn(t);

		assertSame(t, t.setByIndex(0, 1));

		verify(t).setByIndex(0, 1);

		verify(t).setX(1);

		verifyNoMoreInteractions(t);
	}

	/**
	 * This test ensures, that the function
	 * {@link Tup4objC#setByIndex(int, Object)} adopts the value to the y
	 * component if the index is 1 and returns the current instance.
	 */
	@Test
	void setByIndex_YTest()
	{
		Tup4objC t = mock(Tup4objC.class);

		when(t.setByIndex(1, 1)).thenCallRealMethod();

		when(t.setY(1)).thenReturn(t);

		assertSame(t, t.setByIndex(1, 1));

		verify(t).setByIndex(1, 1);

		verify(t).setY(1);

		verifyNoMoreInteractions(t);
	}

	/**
	 * This test ensures, that the function
	 * {@link Tup4objC#setByIndex(int, Object)} adopts the value to the z
	 * component if the index is 2 and returns the current instance.
	 */
	@Test
	void setByIndex_ZTest()
	{
		Tup4objC t = mock(Tup4objC.class);

		when(t.setByIndex(2, 1)).thenCallRealMethod();

		when(t.setZ(1)).thenReturn(t);

		assertSame(t, t.setByIndex(2, 1));

		verify(t).setByIndex(2, 1);

		verify(t).setZ(1);

		verifyNoMoreInteractions(t);
	}

	/**
	 * This test ensures, that the function
	 * {@link Tup4objC#setByIndex(int, Object)} adopts the value to the w
	 * component if the index is 3 and returns the current instance.
	 */
	@Test
	void setByIndex_WTest()
	{
		Tup4objC t = mock(Tup4objC.class);

		when(t.setByIndex(3, 1)).thenCallRealMethod();

		when(t.setW(1)).thenReturn(t);

		assertSame(t, t.setByIndex(3, 1));

		verify(t).setByIndex(3, 1);

		verify(t).setW(1);

		verifyNoMoreInteractions(t);
	}
}
