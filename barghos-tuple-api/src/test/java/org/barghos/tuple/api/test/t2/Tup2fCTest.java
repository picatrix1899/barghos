package org.barghos.tuple.api.test.t2;

import static org.junit.jupiter.api.Assertions.*;

import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;

import org.barghos.tuple.api.t2.Tup2fC;
import org.barghos.tuple.api.t2.Tup2fR;
import org.barghos.tuple.api.tn.TupfC;
import org.barghos.tuple.api.tn.TupfR;

/**
 * This class provides comoponent tests for the interface {@link Tup2fC}.
 * 
 * @author picatrix1899
 */
class Tup2fCTest
{

	/**
	 * This test ensures, that the interface extends the interface
	 * {@link Tup2fR}.
	 */
	@Test
	void inheritance_Tup2RTest()
	{
		assertTrue(Tup2fR.class.isAssignableFrom(Tup2fC.class));
	}

	/**
	 * This test ensures, that the interface extends the interface
	 * {@link TupfC}.
	 */
	@Test
	void inheritance_TupCTest()
	{
		assertTrue(TupfC.class.isAssignableFrom(Tup2fC.class));
	}

	/**
	 * This test ensures, that the function {@link Tup2fC#set(Tup2fR)} adopts
	 * the values from the input tuple and returns the current instance.
	 */
	@Test
	void set_Tuple2Test()
	{
		Tup2fC t = mock(Tup2fC.class);
		Tup2fR t2 = mock(Tup2fR.class);

		when(t.set(t2)).thenCallRealMethod();

		when(t2.getX()).thenReturn(1.0f);
		when(t2.getY()).thenReturn(2.0f);
		when(t.set(1.0f, 2.0f)).thenReturn(t);

		assertSame(t, t.set(t2));

		verify(t).set(t2);

		verify(t2).getX();
		verify(t2).getY();
		verify(t).set(1.0f, 2.0f);

		verifyNoMoreInteractions(t, t2);
	}

	/**
	 * This test ensures, that the function {@link Tup2fC#set(float)} adopts the
	 * value for each component and returns the current instance.
	 */
	@Test
	void set_ValueTest()
	{
		Tup2fC t = mock(Tup2fC.class);

		when(t.set(1.0f)).thenCallRealMethod();

		when(t.set(1.0f, 1.0f)).thenReturn(t);

		assertSame(t, t.set(1.0f));

		verify(t).set(1.0f);

		verify(t).set(1.0f, 1.0f);

		verifyNoMoreInteractions(t);
	}

	/**
	 * This test ensures, that the function {@link Tup2fC#set(float, float)}
	 * adopts the values and returns the current instance.
	 */
	@Test
	void setTest()
	{
		Tup2fC t = mock(Tup2fC.class);

		when(t.set(1.0f, 2.0f)).thenCallRealMethod();

		when(t.setX(1.0f)).thenReturn(t);
		when(t.setY(2.0f)).thenReturn(t);

		assertSame(t, t.set(1.0f, 2.0f));

		verify(t).set(1.0f, 2.0f);

		verify(t).setX(1.0f);
		verify(t).setY(2.0f);

		verifyNoMoreInteractions(t);
	}

	/**
	 * This test ensures, that the function {@link Tup2fC#set(TupfR)} adopts the
	 * values from the input tuple and returns the current instance.
	 */
	@Test
	void set_TupleTest()
	{
		Tup2fC t = mock(Tup2fC.class);
		TupfR t2 = mock(TupfR.class);

		when(t.set(t2)).thenCallRealMethod();

		when(t2.toArray()).thenReturn(new float[] {1.0f, 2.0f});
		when(t.setArray(new float[] {1.0f, 2.0f})).thenReturn(t);

		assertSame(t, t.set(t2));

		verify(t).set(t2);

		verify(t2).toArray();
		verify(t).setArray(new float[] {1.0f, 2.0f});

		verifyNoMoreInteractions(t);
	}

	/**
	 * This test ensures, that the function
	 * {@link Tup2fC#setByIndex(int, float)} adopts the value to the x component
	 * if the index is 0 and returns the current instance.
	 */
	@Test
	void setByIndex_XTest()
	{
		Tup2fC t = mock(Tup2fC.class);

		when(t.setByIndex(0, 1.0f)).thenCallRealMethod();

		when(t.setX(1.0f)).thenReturn(t);

		assertSame(t, t.setByIndex(0, 1.0f));

		verify(t).setByIndex(0, 1.0f);

		verify(t).setX(1.0f);

		verifyNoMoreInteractions(t);
	}

	/**
	 * This test ensures, that the function
	 * {@link Tup2fC#setByIndex(int, float)} adopts the value to the y component
	 * if the index is 1 and returns the current instance.
	 */
	@Test
	void setByIndex_YTest()
	{
		Tup2fC t = mock(Tup2fC.class);

		when(t.setByIndex(1, 1.0f)).thenCallRealMethod();

		when(t.setY(1.0f)).thenReturn(t);

		assertSame(t, t.setByIndex(1, 1.0f));

		verify(t).setByIndex(1, 1.0f);

		verify(t).setY(1.0f);

		verifyNoMoreInteractions(t);
	}

	/**
	 * This test ensures, that the function {@link Tup2fC#setArray(float[])}
	 * adopts the values and returns the current instance.
	 */
	@Test
	void setArrayTest()
	{
		Tup2fC t = mock(Tup2fC.class);

		when(t.setArray(new float[] {1.0f, 2.0f})).thenCallRealMethod();

		when(t.set(1.0f, 2.0f)).thenReturn(t);

		assertSame(t, t.setArray(new float[] {1.0f, 2.0f}));

		verify(t).setArray(new float[] {1.0f, 2.0f});

		verify(t).set(1.0f, 2.0f);

		verifyNoMoreInteractions(t);
	}
}
