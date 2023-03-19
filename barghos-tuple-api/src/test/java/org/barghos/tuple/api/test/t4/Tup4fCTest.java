package org.barghos.tuple.api.test.t4;

import static org.junit.jupiter.api.Assertions.*;

import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;

import org.barghos.tuple.api.t4.Tup4fC;
import org.barghos.tuple.api.t4.Tup4fR;
import org.barghos.tuple.api.tn.TupfC;
import org.barghos.tuple.api.tn.TupfR;

/**
 * This class provides comoponent tests for the interface {@link Tup4fC}.
 * 
 * @author picatrix1899
 */
class Tup4fCTest
{

	/**
	 * This test ensures, that the interface extends the interface
	 * {@link Tup4fR}.
	 */
	@Test
	void inheritance_Tup4fRTest()
	{
		assertTrue(Tup4fR.class.isAssignableFrom(Tup4fC.class));
	}

	/**
	 * This test ensures, that the interface extends the interface
	 * {@link TupfC}.
	 */
	@Test
	void inheritance_TupfCTest()
	{
		assertTrue(TupfC.class.isAssignableFrom(Tup4fC.class));
	}

	/**
	 * This test ensures, that the function {@link Tup4fC#set(Tup4fR)} adopts
	 * the values from the input tuple and returns the current instance.
	 */
	@Test
	void set_Tuple4Test()
	{
		Tup4fC t = mock(Tup4fC.class);
		Tup4fR t2 = mock(Tup4fR.class);

		when(t.set(t2)).thenCallRealMethod();

		when(t2.getV0()).thenReturn(1.0f);
		when(t2.getV1()).thenReturn(2.0f);
		when(t2.getV2()).thenReturn(3.0f);
		when(t2.getV3()).thenReturn(4.0f);
		when(t.set(1.0f, 2.0f, 3.0f, 4.0f)).thenReturn(t);

		assertSame(t, t.set(t2));

		verify(t).set(t2);

		verify(t2).getV0();
		verify(t2).getV1();
		verify(t2).getV2();
		verify(t2).getV3();
		verify(t).set(1.0f, 2.0f, 3.0f, 4.0f);

		verifyNoMoreInteractions(t, t2);
	}

	/**
	 * This test ensures, that the function {@link Tup4fC#set(float)} adopts the
	 * value for each component and returns the current instance.
	 */
	@Test
	void set_ValueTest()
	{
		Tup4fC t = mock(Tup4fC.class);

		when(t.set(1.0f)).thenCallRealMethod();

		when(t.set(1.0f, 1.0f, 1.0f, 1.0f)).thenReturn(t);

		assertSame(t, t.set(1.0f));

		verify(t).set(1.0f);

		verify(t).set(1.0f, 1.0f, 1.0f, 1.0f);

		verifyNoMoreInteractions(t);
	}

	/**
	 * This test ensures, that the function
	 * {@link Tup4fC#set(float, float, float, float)} adopts the values and
	 * returns the current instance.
	 */
	@Test
	void setTest()
	{
		Tup4fC t = mock(Tup4fC.class);

		when(t.set(1.0f, 2.0f, 3.0f, 4.0f)).thenCallRealMethod();

		when(t.setV0(1.0f)).thenReturn(t);
		when(t.setV1(2.0f)).thenReturn(t);
		when(t.setV2(3.0f)).thenReturn(t);
		when(t.setV3(4.0f)).thenReturn(t);

		assertSame(t, t.set(1.0f, 2.0f, 3.0f, 4.0f));

		verify(t).set(1.0f, 2.0f, 3.0f, 4.0f);

		verify(t).setV0(1.0f);
		verify(t).setV1(2.0f);
		verify(t).setV2(3.0f);
		verify(t).setV3(4.0f);

		verifyNoMoreInteractions(t);
	}

	/**
	 * This test ensures, that the function {@link Tup4fC#set(TupfR)} adopts the
	 * values from the input tuple and returns the current instance.
	 */
	@Test
	void set_TupleTest()
	{
		Tup4fC t = mock(Tup4fC.class);
		TupfR t2 = mock(TupfR.class);

		when(t.set(t2)).thenCallRealMethod();

		when(t2.toArray()).thenReturn(new float[] {1.0f, 2.0f, 3.0f, 4.0f});
		when(t.setArray(new float[] {1.0f, 2.0f, 3.0f, 4.0f})).thenReturn(t);

		assertSame(t, t.set(t2));

		verify(t).set(t2);

		verify(t2).toArray();
		verify(t).setArray(new float[] {1.0f, 2.0f, 3.0f, 4.0f});

		verifyNoMoreInteractions(t);
	}

	/**
	 * This test ensures, that the function
	 * {@link Tup4fC#setByIndex(int, float)} adopts the value to the x component
	 * if the index is 0 and returns the current instance.
	 */
	@Test
	void setByIndex_XTest()
	{
		Tup4fC t = mock(Tup4fC.class);

		when(t.setByIndex(0, 1.0f)).thenCallRealMethod();

		when(t.setV0(1.0f)).thenReturn(t);

		assertSame(t, t.setByIndex(0, 1.0f));

		verify(t).setByIndex(0, 1.0f);

		verify(t).setV0(1.0f);

		verifyNoMoreInteractions(t);
	}

	/**
	 * This test ensures, that the function
	 * {@link Tup4fC#setByIndex(int, float)} adopts the value to the y component
	 * if the index is 1 and returns the current instance.
	 */
	@Test
	void setByIndex_YTest()
	{
		Tup4fC t = mock(Tup4fC.class);

		when(t.setByIndex(1, 1.0f)).thenCallRealMethod();

		when(t.setV1(1.0f)).thenReturn(t);

		assertSame(t, t.setByIndex(1, 1.0f));

		verify(t).setByIndex(1, 1.0f);

		verify(t).setV1(1.0f);

		verifyNoMoreInteractions(t);
	}

	/**
	 * This test ensures, that the function
	 * {@link Tup4fC#setByIndex(int, float)} adopts the value to the z component
	 * if the index is 2 and returns the current instance.
	 */
	@Test
	void setByIndex_ZTest()
	{
		Tup4fC t = mock(Tup4fC.class);

		when(t.setByIndex(2, 1.0f)).thenCallRealMethod();

		when(t.setV2(1.0f)).thenReturn(t);

		assertSame(t, t.setByIndex(2, 1.0f));

		verify(t).setByIndex(2, 1.0f);

		verify(t).setV2(1.0f);

		verifyNoMoreInteractions(t);
	}

	/**
	 * This test ensures, that the function
	 * {@link Tup4fC#setByIndex(int, float)} adopts the value to the w component
	 * if the index is 3 and returns the current instance.
	 */
	@Test
	void setByIndex_WTest()
	{
		Tup4fC t = mock(Tup4fC.class);

		when(t.setByIndex(3, 1.0f)).thenCallRealMethod();

		when(t.setV3(1.0f)).thenReturn(t);

		assertSame(t, t.setByIndex(3, 1.0f));

		verify(t).setByIndex(3, 1.0f);

		verify(t).setV3(1.0f);

		verifyNoMoreInteractions(t);
	}

	/**
	 * This test ensures, that the function {@link Tup4fC#setArray(float[])}
	 * adopts the values and returns the current instance.
	 */
	@Test
	void setArrayTest()
	{
		Tup4fC t = mock(Tup4fC.class);

		when(t.setArray(new float[] {1.0f, 2.0f, 3.0f, 4.0f})).thenCallRealMethod();

		when(t.set(1.0f, 2.0f, 3.0f, 4.0f)).thenReturn(t);

		assertSame(t, t.setArray(new float[] {1.0f, 2.0f, 3.0f, 4.0f}));

		verify(t).setArray(new float[] {1.0f, 2.0f, 3.0f, 4.0f});

		verify(t).set(1.0f, 2.0f, 3.0f, 4.0f);

		verifyNoMoreInteractions(t);
	}
}
