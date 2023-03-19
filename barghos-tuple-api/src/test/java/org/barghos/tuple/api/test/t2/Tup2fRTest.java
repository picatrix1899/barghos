package org.barghos.tuple.api.test.t2;

import static org.junit.jupiter.api.Assertions.*;

import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;

import org.barghos.tuple.api.t2.Tup2fR;
import org.barghos.tuple.api.tn.TupfR;

/**
 * This class provides component tests for the interface {@link Tup2fR}.
 * 
 * @author picatrix1899
 */
class Tup2fRTest
{

	/**
	 * This test ensures, that the interface extends the interface
	 * {@link TupfR}.
	 */
	@Test
	void inheritance_TupRTest()
	{
		assertTrue(TupfR.class.isAssignableFrom(Tup2fR.class));
	}

	/**
	 * this test ensures, that the function {@link Tup2fR#getDimensions()}
	 * always returns 2 and does not make any calls.
	 */
	@Test
	void getDimensionsTest()
	{
		Tup2fR t = mock(Tup2fR.class);

		when(t.getDimensions()).thenCallRealMethod();

		assertEquals(2, t.getDimensions());

		verify(t).getDimensions();

		verifyNoMoreInteractions(t);
	}

	/**
	 * This test ensures, that the function {@link Tup2fR#getByIndex(int)}
	 * returns the x component for the index 0.
	 */
	@Test
	void getByIndex_XTest()
	{
		Tup2fR t = mock(Tup2fR.class);

		when(t.getByIndex(0)).thenCallRealMethod();

		when(t.getV0()).thenReturn(1.0f);

		assertEquals(1.0f, t.getByIndex(0));

		verify(t).getByIndex(0);

		verify(t).getV0();

		verifyNoMoreInteractions(t);
	}

	/**
	 * This test ensures, that the function {@link Tup2fR#getByIndex(int)}
	 * returns the y component for the index 1.
	 */
	@Test
	void getByIndex_YTest()
	{
		Tup2fR t = mock(Tup2fR.class);

		when(t.getByIndex(1)).thenCallRealMethod();

		when(t.getV1()).thenReturn(1.0f);

		assertEquals(1.0f, t.getByIndex(1));

		verify(t).getByIndex(1);

		verify(t).getV1();

		verifyNoMoreInteractions(t);
	}

	/**
	 * This test ensures, that the function {@link Tup2fR#isFinite()} returns
	 * true, if none of the components is either
	 * {@link Float#POSITIVE_INFINITY}, {@link Float#NEGATIVE_INFINITY}} or
	 * {@link Float#NaN}.
	 */
	@Test
	void isFiniteTest()
	{
		Tup2fR t = mock(Tup2fR.class);

		when(t.isFinite()).thenCallRealMethod();

		when(t.getV0()).thenReturn(1.0f);
		when(t.getV1()).thenReturn(1.0f);

		assertEquals(true, t.isFinite());

		verify(t).isFinite();

		verify(t).getV0();
		verify(t).getV1();

		verifyNoMoreInteractions(t);
	}

	/**
	 * This test ensures, that the function {@link Tup2fR#isFinite()} returns
	 * false after checking the x component, if the x component is
	 * {@link Float#POSITIVE_INFINITY}.
	 */
	@Test
	void isFinite_Fail_X_PositiveInfTest()
	{
		Tup2fR t = mock(Tup2fR.class);

		when(t.isFinite()).thenCallRealMethod();

		when(t.getV0()).thenReturn(Float.POSITIVE_INFINITY);

		assertEquals(false, t.isFinite());

		verify(t).isFinite();

		verify(t).getV0();

		verifyNoMoreInteractions(t);
	}

	/**
	 * This test ensures, that the function {@link Tup2fR#isFinite()} returns
	 * false after checking the x component, if the x component is
	 * {@link Float#NEGATIVE_INFINITY}.
	 */
	@Test
	void isFinite_Fail_X_NegativeInfTest()
	{
		Tup2fR t = mock(Tup2fR.class);

		when(t.isFinite()).thenCallRealMethod();

		when(t.getV0()).thenReturn(Float.NEGATIVE_INFINITY);

		assertEquals(false, t.isFinite());

		verify(t).isFinite();

		verify(t).getV0();

		verifyNoMoreInteractions(t);
	}

	/**
	 * This test ensures, that the function {@link Tup2fR#isFinite()} returns
	 * false after checking the x component, if the x component is
	 * {@link Float#NaN}.
	 */
	@Test
	void isFinite_Fail_X_NaNTest()
	{
		Tup2fR t = mock(Tup2fR.class);

		when(t.isFinite()).thenCallRealMethod();

		when(t.getV0()).thenReturn(Float.NaN);

		assertEquals(false, t.isFinite());

		verify(t).isFinite();

		verify(t).getV0();

		verifyNoMoreInteractions(t);
	}

	/**
	 * This test ensures, that the function {@link Tup2fR#isFinite()} returns
	 * false after checking the y component, if the y component is
	 * {@link Float#POSITIVE_INFINITY}.
	 */
	@Test
	void isFinite_Fail_Y_PositiveInfTest()
	{
		Tup2fR t = mock(Tup2fR.class);

		when(t.isFinite()).thenCallRealMethod();

		when(t.getV0()).thenReturn(1.0f);
		when(t.getV1()).thenReturn(Float.POSITIVE_INFINITY);

		assertEquals(false, t.isFinite());

		verify(t).isFinite();

		verify(t).getV0();
		verify(t).getV1();

		verifyNoMoreInteractions(t);
	}

	/**
	 * This test ensures, that the function {@link Tup2fR#isFinite()} returns
	 * false after checking the y component, if the y component is
	 * {@link Float#NEGATIVE_INFINITY}.
	 */
	@Test
	void isFinite_Fail_Y_NegativeInfTest()
	{
		Tup2fR t = mock(Tup2fR.class);

		when(t.isFinite()).thenCallRealMethod();

		when(t.getV0()).thenReturn(1.0f);
		when(t.getV1()).thenReturn(Float.NEGATIVE_INFINITY);

		assertEquals(false, t.isFinite());

		verify(t).isFinite();

		verify(t).getV0();
		verify(t).getV1();

		verifyNoMoreInteractions(t);
	}

	/**
	 * This test ensures, that the function {@link Tup2fR#isFinite()} returns
	 * false after checking the y component, if the y component is
	 * {@link Float#NaN}.
	 */
	@Test
	void isFinite_Fail_Y_NaNTest()
	{
		Tup2fR t = mock(Tup2fR.class);

		when(t.isFinite()).thenCallRealMethod();

		when(t.getV0()).thenReturn(1.0f);
		when(t.getV1()).thenReturn(Float.NaN);

		assertEquals(false, t.isFinite());

		verify(t).isFinite();

		verify(t).getV0();
		verify(t).getV1();

		verifyNoMoreInteractions(t);
	}

	/**
	 * This test ensures, that the function {@link Tup2fR#isZero()} returns
	 * true, if all of the components are exactly zero.
	 */
	@Test
	void isZero_ZeroTest()
	{
		Tup2fR t = mock(Tup2fR.class);

		when(t.isZero()).thenCallRealMethod();

		when(t.getV0()).thenReturn(0.0f);
		when(t.getV1()).thenReturn(0.0f);

		assertEquals(true, t.isZero());

		verify(t).isZero();

		verify(t).getV0();
		verify(t).getV1();

		verifyNoMoreInteractions(t);
	}

	/**
	 * This test ensures, that the function {@link Tup2fR#isZero()} returns
	 * false, if the x component is not zero.
	 */
	@Test
	void isZero_Fail_XTest()
	{
		Tup2fR t = mock(Tup2fR.class);

		when(t.isZero()).thenCallRealMethod();

		when(t.getV0()).thenReturn(1.0f);

		assertEquals(false, t.isZero());

		verify(t).isZero();

		verify(t).getV0();

		verifyNoMoreInteractions(t);
	}

	/**
	 * This test ensures, that the function {@link Tup2fR#isZero()} returns
	 * false, if the y component is not zero.
	 */
	@Test
	void isZero_Fail_YTest()
	{
		Tup2fR t = mock(Tup2fR.class);

		when(t.isZero()).thenCallRealMethod();

		when(t.getV0()).thenReturn(0.0f);
		when(t.getV1()).thenReturn(1.0f);

		assertEquals(false, t.isZero());

		verify(t).isZero();

		verify(t).getV0();
		verify(t).getV1();

		verifyNoMoreInteractions(t);
	}

	/**
	 * This test ensures, that the function {@link Tup2fR#isZero(float)} returns
	 * true, if all components are exactly zero.
	 */
	@Test
	void isZeroWithTolerance_ZeroTest()
	{
		Tup2fR t = mock(Tup2fR.class);

		when(t.isZero(2.0f)).thenCallRealMethod();

		when(t.getV0()).thenReturn(0.0f);
		when(t.getV1()).thenReturn(0.0f);

		assertEquals(true, t.isZero(2.0f));

		verify(t).isZero(2.0f);

		verify(t).getV0();
		verify(t).getV1();

		verifyNoMoreInteractions(t);
	}

	/**
	 * This test ensures, that the function {@link Tup2fR#isZero(float)} returns
	 * true, if all components are at the positive extreme point that is the
	 * inclusive tolerance parameter.
	 */
	@Test
	void isZeroWithTolerance_Extreme_PositiveTest()
	{
		Tup2fR t = mock(Tup2fR.class);

		when(t.isZero(2.0f)).thenCallRealMethod();

		when(t.getV0()).thenReturn(2.0f);
		when(t.getV1()).thenReturn(2.0f);

		assertEquals(true, t.isZero(2.0f));

		verify(t).isZero(2.0f);

		verify(t).getV0();
		verify(t).getV1();

		verifyNoMoreInteractions(t);
	}

	/**
	 * This test ensures, that the function {@link Tup2fR#isZero(float)} returns
	 * true, if all components are at the negative extreme point that is the
	 * inclusive tolerance parameter.
	 */
	@Test
	void isZeroWithTolerance_Extreme_NegativeTest()
	{
		Tup2fR t = mock(Tup2fR.class);

		when(t.isZero(2.0f)).thenCallRealMethod();

		when(t.getV0()).thenReturn(-2.0f);
		when(t.getV1()).thenReturn(-2.0f);

		assertEquals(true, t.isZero(2.0f));

		verify(t).isZero(2.0f);

		verify(t).getV0();
		verify(t).getV1();

		verifyNoMoreInteractions(t);
	}

	/**
	 * This test ensures, that the function {@link Tup2fR#isZero(float)} returns
	 * false, if the x component exceeds the positive extreme point that is the
	 * inclusive tolerance parameter.
	 */
	@Test
	void isZeroWithTolerance_Fail_X_PositiveTest()
	{
		Tup2fR t = mock(Tup2fR.class);

		when(t.isZero(2.0f)).thenCallRealMethod();

		when(t.getV0()).thenReturn(3.0f);

		assertEquals(false, t.isZero(2.0f));

		verify(t).isZero(2.0f);

		verify(t).getV0();

		verifyNoMoreInteractions(t);
	}

	/**
	 * This test ensures, that the function {@link Tup2fR#isZero(float)} returns
	 * false, if the x component exceeds the negative extreme point that is the
	 * inclusive tolerance parameter.
	 */
	@Test
	void isZeroWithTolerance_Fail_X_NegativeTest()
	{
		Tup2fR t = mock(Tup2fR.class);

		when(t.isZero(2.0f)).thenCallRealMethod();

		when(t.getV0()).thenReturn(-3.0f);

		assertEquals(false, t.isZero(2.0f));

		verify(t).isZero(2.0f);

		verify(t).getV0();

		verifyNoMoreInteractions(t);
	}

	/**
	 * This test ensures, that the function {@link Tup2fR#isZero(float)} returns
	 * false, if the y component exceeds the positive extreme point that is the
	 * inclusive tolerance parameter.
	 */
	@Test
	void isZeroWithTolerance_Fail_Y_PositiveTest()
	{
		Tup2fR t = mock(Tup2fR.class);

		when(t.isZero(2.0f)).thenCallRealMethod();

		when(t.getV0()).thenReturn(0.0f);
		when(t.getV1()).thenReturn(3.0f);

		assertEquals(false, t.isZero(2.0f));

		verify(t).isZero(2.0f);

		verify(t).getV0();
		verify(t).getV1();

		verifyNoMoreInteractions(t);
	}

	/**
	 * This test ensures, that the function {@link Tup2fR#isZero(float)} returns
	 * false, if the y component exceeds the positive extreme point that is the
	 * inclusive tolerance parameter.
	 */
	@Test
	void isZeroWithTolerance_Fail_Y_NegativeTest()
	{
		Tup2fR t = mock(Tup2fR.class);

		when(t.isZero(2.0f)).thenCallRealMethod();

		when(t.getV0()).thenReturn(0.0f);
		when(t.getV1()).thenReturn(-3.0f);

		assertEquals(false, t.isZero(2.0f));

		verify(t).isZero(2.0f);

		verify(t).getV0();
		verify(t).getV1();

		verifyNoMoreInteractions(t);
	}

	/**
	 * This test ensures, that the function {@link Tup2fR#isZero(float)} throws
	 * an {@link IllegalArgumentException} if the tolerance parameter is below
	 * zero.
	 */
	@Test
	void isZeroWithTolerance_Error_BelowZeroToleranceTest()
	{
		Tup2fR t = mock(Tup2fR.class);

		when(t.isZero(-1.0f)).thenCallRealMethod();

		assertThrowsExactly(IllegalArgumentException.class, () -> t.isZero(-1.0f));

		verify(t).isZero(-1.0f);

		verifyNoMoreInteractions(t);
	}

	/**
	 * This test ensures, that the function {@link Tup2fR#toArray(float[])}
	 * returns the given array with the components in the right order.
	 */
	@Test
	void toArrayWithExtractionParamTest()
	{
		Tup2fR t = mock(Tup2fR.class);

		float[] array = new float[2];

		when(t.toArray(array)).thenCallRealMethod();

		when(t.getV0()).thenReturn(1.0f);
		when(t.getV1()).thenReturn(2.0f);

		assertSame(array, t.toArray(array));
		assertArrayEquals(new float[] {1.0f, 2.0f}, array);

		verify(t).toArray(array);

		verify(t).getV0();
		verify(t).getV1();

		verifyNoMoreInteractions(t);
	}
}