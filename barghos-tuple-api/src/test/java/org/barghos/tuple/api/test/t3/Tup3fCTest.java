package org.barghos.tuple.api.test.t3;

import static org.junit.jupiter.api.Assertions.*;

import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;

import org.barghos.tuple.api.t3.Tup3fC;
import org.barghos.tuple.api.t3.Tup3fR;
import org.barghos.tuple.api.tn.TupfC;
import org.barghos.tuple.api.tn.TupfR;

/**
 * This class provides comoponent tests for the interface {@link Tup3fC}.
 * 
 * @author picatrix1899
 */
class Tup3fCTest
{

	/**
	 * This test ensures, that the interface extends the interface
	 * {@link Tup3fR}.
	 */
	@Test
	void inheritance_Tup3fRTest()
	{
		assertTrue(Tup3fR.class.isAssignableFrom(Tup3fC.class));
	}

	/**
	 * This test ensures, that the interface extends the interface
	 * {@link TupfC}.
	 */
	@Test
	void inheritance_TupfCTest()
	{
		assertTrue(TupfC.class.isAssignableFrom(Tup3fC.class));
	}

	/**
	 * This test ensures, that the function {@link Tup3fC#set(Tup3fR)} adopts
	 * the values from the input tuple and returns the current instance.
	 */
	@Test
	void set_Tuple3Test()
	{
		Tup3fC t = mock(Tup3fC.class);
		Tup3fR t2 = mock(Tup3fR.class);

		when(t.set(t2)).thenCallRealMethod();

		when(t2.getX()).thenReturn(1.0f);
		when(t2.getY()).thenReturn(2.0f);
		when(t2.getZ()).thenReturn(3.0f);
		when(t.set(1.0f, 2.0f, 3.0f)).thenReturn(t);

		assertSame(t, t.set(t2));

		verify(t).set(t2);

		verify(t2).getX();
		verify(t2).getY();
		verify(t2).getZ();
		verify(t).set(1.0f, 2.0f, 3.0f);

		verifyNoMoreInteractions(t, t2);
	}

	/**
	 * This test ensures, that the function {@link Tup3fC#set(float)} adopts the
	 * value for each component and returns the current instance.
	 */
	@Test
	void set_ValueTest()
	{
		Tup3fC t = mock(Tup3fC.class);

		when(t.set(1.0f)).thenCallRealMethod();

		when(t.set(1.0f, 1.0f, 1.0f)).thenReturn(t);

		assertSame(t, t.set(1.0f));

		verify(t).set(1.0f);

		verify(t).set(1.0f, 1.0f, 1.0f);

		verifyNoMoreInteractions(t);
	}

	/**
	 * This test ensures, that the function
	 * {@link Tup3fC#set(float, float, float)} adopts the values and returns the
	 * current instance.
	 */
	@Test
	void setTest()
	{
		Tup3fC t = mock(Tup3fC.class);

		when(t.set(1.0f, 2.0f, 3.0f)).thenCallRealMethod();

		when(t.setX(1.0f)).thenReturn(t);
		when(t.setY(2.0f)).thenReturn(t);
		when(t.setZ(3.0f)).thenReturn(t);

		assertSame(t, t.set(1.0f, 2.0f, 3.0f));

		verify(t).set(1.0f, 2.0f, 3.0f);

		verify(t).setX(1.0f);
		verify(t).setY(2.0f);
		verify(t).setZ(3.0f);

		verifyNoMoreInteractions(t);
	}

	/**
	 * This test ensures, that the function {@link Tup3fC#set(TupfR)} adopts the
	 * values from the input tuple and returns the current instance.
	 */
	@Test
	void set_TupleTest()
	{
		Tup3fC t = mock(Tup3fC.class);
		TupfR t2 = mock(TupfR.class);

		when(t.set(t2)).thenCallRealMethod();

		when(t2.toArray()).thenReturn(new float[] {1.0f, 2.0f, 3.0f});
		when(t.setArray(new float[] {1.0f, 2.0f, 3.0f})).thenReturn(t);

		assertSame(t, t.set(t2));

		verify(t).set(t2);

		verify(t2).toArray();
		verify(t).setArray(new float[] {1.0f, 2.0f, 3.0f});

		verifyNoMoreInteractions(t);
	}

	/**
	 * This test ensures, that the function
	 * {@link Tup3fC#setByIndex(int, float)} adopts the value to the x component
	 * if the index is 0 and returns the current instance.
	 */
	@Test
	void setByIndex_XTest()
	{
		Tup3fC t = mock(Tup3fC.class);

		when(t.setByIndex(0, 1.0f)).thenCallRealMethod();

		when(t.setX(1.0f)).thenReturn(t);

		assertSame(t, t.setByIndex(0, 1.0f));

		verify(t).setByIndex(0, 1.0f);

		verify(t).setX(1.0f);

		verifyNoMoreInteractions(t);
	}

	/**
	 * This test ensures, that the function
	 * {@link Tup3fC#setByIndex(int, float)} adopts the value to the y component
	 * if the index is 1 and returns the current instance.
	 */
	@Test
	void setByIndex_YTest()
	{
		Tup3fC t = mock(Tup3fC.class);

		when(t.setByIndex(1, 1.0f)).thenCallRealMethod();

		when(t.setY(1.0f)).thenReturn(t);

		assertSame(t, t.setByIndex(1, 1.0f));

		verify(t).setByIndex(1, 1.0f);

		verify(t).setY(1.0f);

		verifyNoMoreInteractions(t);
	}

	/**
	 * This test ensures, that the function
	 * {@link Tup3fC#setByIndex(int, float)} adopts the value to the z component
	 * if the index is 2 and returns the current instance.
	 */
	@Test
	void setByIndex_ZTest()
	{
		Tup3fC t = mock(Tup3fC.class);

		when(t.setByIndex(2, 1.0f)).thenCallRealMethod();

		when(t.setZ(1.0f)).thenReturn(t);

		assertSame(t, t.setByIndex(2, 1.0f));

		verify(t).setByIndex(2, 1.0f);

		verify(t).setZ(1.0f);

		verifyNoMoreInteractions(t);
	}

	/**
	 * This test ensures, that the function {@link Tup3fC#setArray(float[])}
	 * adopts the values and returns the current instance.
	 */
	@Test
	void setArrayTest()
	{
		Tup3fC t = mock(Tup3fC.class);

		when(t.setArray(new float[] {1.0f, 2.0f, 3.0f})).thenCallRealMethod();

		when(t.set(1.0f, 2.0f, 3.0f)).thenReturn(t);

		assertSame(t, t.setArray(new float[] {1.0f, 2.0f, 3.0f}));

		verify(t).setArray(new float[] {1.0f, 2.0f, 3.0f});

		verify(t).set(1.0f, 2.0f, 3.0f);

		verifyNoMoreInteractions(t);
	}
}
