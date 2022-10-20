package org.barghos.tuple.api.test.t3;

import static org.junit.jupiter.api.Assertions.*;

import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;

import org.barghos.tuple.api.t3.Tup3dR;
import org.barghos.tuple.api.tn.TupdR;

/**
 * This class provides component tests for the interface {@link Tup3dR}.
 * 
 * @author picatrix1899
 */
class Tup3dRTest
{

	/**
	 * This test ensures, that the interface extends the interface
	 * {@link TupdR}.
	 */
	@Test
	void inheritance_TupRTest()
	{
		assertTrue(TupdR.class.isAssignableFrom(Tup3dR.class));
	}

	/**
	 * this test ensures, that the function {@link Tup3dR#getDimensions()}
	 * always returns 3 and does not make any calls.
	 */
	@Test
	void getDimensionsTest()
	{
		Tup3dR t = mock(Tup3dR.class);

		when(t.getDimensions()).thenCallRealMethod();

		assertEquals(3, t.getDimensions());

		verify(t).getDimensions();

		verifyNoMoreInteractions(t);
	}

	/**
	 * This test ensures, that the function {@link Tup3dR#getByIndex(int)}
	 * returns the x component for the index 0.
	 */
	@Test
	void getByIndex_XTest()
	{
		Tup3dR t = mock(Tup3dR.class);

		when(t.getByIndex(0)).thenCallRealMethod();

		when(t.getX()).thenReturn(1.0);

		assertEquals(1.0, t.getByIndex(0));

		verify(t).getByIndex(0);

		verify(t).getX();

		verifyNoMoreInteractions(t);
	}

	/**
	 * This test ensures, that the function {@link Tup3dR#getByIndex(int)}
	 * returns the y component for the index 1.
	 */
	@Test
	void getByIndex_YTest()
	{
		Tup3dR t = mock(Tup3dR.class);

		when(t.getByIndex(1)).thenCallRealMethod();

		when(t.getY()).thenReturn(1.0);

		assertEquals(1.0, t.getByIndex(1));

		verify(t).getByIndex(1);

		verify(t).getY();

		verifyNoMoreInteractions(t);
	}

	/**
	 * This test ensures, that the function {@link Tup3dR#getByIndex(int)}
	 * returns the z component for the index 2.
	 */
	@Test
	void getByIndex_ZTest()
	{
		Tup3dR t = mock(Tup3dR.class);

		when(t.getByIndex(2)).thenCallRealMethod();

		when(t.getZ()).thenReturn(1.0);

		assertEquals(1.0, t.getByIndex(2));

		verify(t).getByIndex(2);

		verify(t).getZ();

		verifyNoMoreInteractions(t);
	}

	/**
	 * This test ensures, that the function {@link Tup3dR#isFinite()} returns
	 * true, if none of the components is either
	 * {@link Float#POSITIVE_INFINITY}, {@link Float#NEGATIVE_INFINITY}} or
	 * {@link Float#NaN}.
	 */
	@Test
	void isFiniteTest()
	{
		Tup3dR t = mock(Tup3dR.class);

		when(t.isFinite()).thenCallRealMethod();

		when(t.getX()).thenReturn(1.0);
		when(t.getY()).thenReturn(1.0);
		when(t.getZ()).thenReturn(1.0);

		assertEquals(true, t.isFinite());

		verify(t).isFinite();

		verify(t).getX();
		verify(t).getY();
		verify(t).getZ();

		verifyNoMoreInteractions(t);
	}

	/**
	 * This test ensures, that the function {@link Tup3dR#isFinite()} returns
	 * false after checking the x component, if the x component is
	 * {@link Double#POSITIVE_INFINITY}.
	 */
	@Test
	void isFinite_Fail_X_PositiveInfTest()
	{
		Tup3dR t = mock(Tup3dR.class);

		when(t.isFinite()).thenCallRealMethod();

		when(t.getX()).thenReturn(Double.POSITIVE_INFINITY);

		assertEquals(false, t.isFinite());

		verify(t).isFinite();

		verify(t).getX();

		verifyNoMoreInteractions(t);
	}

	/**
	 * This test ensures, that the function {@link Tup3dR#isFinite()} returns
	 * false after checking the x component, if the x component is
	 * {@link Double#NEGATIVE_INFINITY}.
	 */
	@Test
	void isFinite_Fail_X_NegativeInfTest()
	{
		Tup3dR t = mock(Tup3dR.class);

		when(t.isFinite()).thenCallRealMethod();

		when(t.getX()).thenReturn(Double.NEGATIVE_INFINITY);

		assertEquals(false, t.isFinite());

		verify(t).isFinite();

		verify(t).getX();

		verifyNoMoreInteractions(t);
	}

	/**
	 * This test ensures, that the function {@link Tup3dR#isFinite()} returns
	 * false after checking the x component, if the x component is
	 * {@link Double#NaN}.
	 */
	@Test
	void isFinite_Fail_X_NaNTest()
	{
		Tup3dR t = mock(Tup3dR.class);

		when(t.isFinite()).thenCallRealMethod();

		when(t.getX()).thenReturn(Double.NaN);

		assertEquals(false, t.isFinite());

		verify(t).isFinite();

		verify(t).getX();

		verifyNoMoreInteractions(t);
	}

	/**
	 * This test ensures, that the function {@link Tup3dR#isFinite()} returns
	 * false after checking the y component, if the y component is
	 * {@link Double#POSITIVE_INFINITY}.
	 */
	@Test
	void isFinite_Fail_Y_PositiveInfTest()
	{
		Tup3dR t = mock(Tup3dR.class);

		when(t.isFinite()).thenCallRealMethod();

		when(t.getX()).thenReturn(1.0);
		when(t.getY()).thenReturn(Double.POSITIVE_INFINITY);

		assertEquals(false, t.isFinite());

		verify(t).isFinite();

		verify(t).getX();
		verify(t).getY();

		verifyNoMoreInteractions(t);
	}

	/**
	 * This test ensures, that the function {@link Tup3dR#isFinite()} returns
	 * false after checking the y component, if the y component is
	 * {@link Double#NEGATIVE_INFINITY}.
	 */
	@Test
	void isFinite_Fail_Y_NegativeInfTest()
	{
		Tup3dR t = mock(Tup3dR.class);

		when(t.isFinite()).thenCallRealMethod();

		when(t.getX()).thenReturn(1.0);
		when(t.getY()).thenReturn(Double.NEGATIVE_INFINITY);

		assertEquals(false, t.isFinite());

		verify(t).isFinite();

		verify(t).getX();
		verify(t).getY();

		verifyNoMoreInteractions(t);
	}

	/**
	 * This test ensures, that the function {@link Tup3dR#isFinite()} returns
	 * false after checking the y component, if the y component is
	 * {@link Double#NaN}.
	 */
	@Test
	void isFinite_Fail_Y_NaNTest()
	{
		Tup3dR t = mock(Tup3dR.class);

		when(t.isFinite()).thenCallRealMethod();

		when(t.getX()).thenReturn(1.0);
		when(t.getY()).thenReturn(Double.NaN);

		assertEquals(false, t.isFinite());

		verify(t).isFinite();

		verify(t).getX();
		verify(t).getY();

		verifyNoMoreInteractions(t);
	}

	/**
	 * This test ensures, that the function {@link Tup3dR#isFinite()} returns
	 * false after checking the z component, if the z component is
	 * {@link Double#POSITIVE_INFINITY}.
	 */
	@Test
	void isFinite_Fail_Z_PositiveInfTest()
	{
		Tup3dR t = mock(Tup3dR.class);

		when(t.isFinite()).thenCallRealMethod();

		when(t.getX()).thenReturn(1.0);
		when(t.getY()).thenReturn(1.0);
		when(t.getZ()).thenReturn(Double.POSITIVE_INFINITY);

		assertEquals(false, t.isFinite());

		verify(t).isFinite();

		verify(t).getX();
		verify(t).getY();
		verify(t).getZ();

		verifyNoMoreInteractions(t);
	}

	/**
	 * This test ensures, that the function {@link Tup3dR#isFinite()} returns
	 * false after checking the z component, if the z component is
	 * {@link Double#NEGATIVE_INFINITY}.
	 */
	@Test
	void isFinite_Fail_Z_NegativeInfTest()
	{
		Tup3dR t = mock(Tup3dR.class);

		when(t.isFinite()).thenCallRealMethod();

		when(t.getX()).thenReturn(1.0);
		when(t.getY()).thenReturn(1.0);
		when(t.getZ()).thenReturn(Double.NEGATIVE_INFINITY);

		assertEquals(false, t.isFinite());

		verify(t).isFinite();

		verify(t).getX();
		verify(t).getY();
		verify(t).getZ();

		verifyNoMoreInteractions(t);
	}

	/**
	 * This test ensures, that the function {@link Tup3dR#isFinite()} returns
	 * false after checking the z component, if the z component is
	 * {@link Double#NaN}.
	 */
	@Test
	void isFinite_Fail_Z_NaNTest()
	{
		Tup3dR t = mock(Tup3dR.class);

		when(t.isFinite()).thenCallRealMethod();

		when(t.getX()).thenReturn(1.0);
		when(t.getY()).thenReturn(1.0);
		when(t.getZ()).thenReturn(Double.NaN);

		assertEquals(false, t.isFinite());

		verify(t).isFinite();

		verify(t).getX();
		verify(t).getY();
		verify(t).getZ();

		verifyNoMoreInteractions(t);
	}

	/**
	 * This test ensures, that the function {@link Tup3dR#isZero()} returns
	 * true, if all of the components are exactly zero.
	 */
	@Test
	void isZero_ZeroTest()
	{
		Tup3dR t = mock(Tup3dR.class);

		when(t.isZero()).thenCallRealMethod();

		when(t.getX()).thenReturn(0.0);
		when(t.getY()).thenReturn(0.0);
		when(t.getZ()).thenReturn(0.0);

		assertEquals(true, t.isZero());

		verify(t).isZero();

		verify(t).getX();
		verify(t).getY();
		verify(t).getZ();

		verifyNoMoreInteractions(t);
	}

	/**
	 * This test ensures, that the function {@link Tup3dR#isZero()} returns
	 * false, if the x component is not zero.
	 */
	@Test
	void isZero_Fail_XTest()
	{
		Tup3dR t = mock(Tup3dR.class);

		when(t.isZero()).thenCallRealMethod();

		when(t.getX()).thenReturn(1.0);

		assertEquals(false, t.isZero());

		verify(t).isZero();

		verify(t).getX();

		verifyNoMoreInteractions(t);
	}

	/**
	 * This test ensures, that the function {@link Tup3dR#isZero()} returns
	 * false, if the y component is not zero.
	 */
	@Test
	void isZero_Fail_YTest()
	{
		Tup3dR t = mock(Tup3dR.class);

		when(t.isZero()).thenCallRealMethod();

		when(t.getX()).thenReturn(0.0);
		when(t.getY()).thenReturn(1.0);

		assertEquals(false, t.isZero());

		verify(t).isZero();

		verify(t).getX();
		verify(t).getY();

		verifyNoMoreInteractions(t);
	}

	/**
	 * This test ensures, that the function {@link Tup3dR#isZero()} returns
	 * false, if the z component is not zero.
	 */
	@Test
	void isZero_Fail_ZTest()
	{
		Tup3dR t = mock(Tup3dR.class);

		when(t.isZero()).thenCallRealMethod();

		when(t.getX()).thenReturn(0.0);
		when(t.getY()).thenReturn(0.0);
		when(t.getZ()).thenReturn(1.0);

		assertEquals(false, t.isZero());

		verify(t).isZero();

		verify(t).getX();
		verify(t).getY();
		verify(t).getZ();

		verifyNoMoreInteractions(t);
	}

	/**
	 * This test ensures, that the function {@link Tup3dR#isZero(double)} returns
	 * true, if all components are exactly zero.
	 */
	@Test
	void isZeroWithTolerance_ZeroTest()
	{
		Tup3dR t = mock(Tup3dR.class);

		when(t.isZero(2.0)).thenCallRealMethod();

		when(t.getX()).thenReturn(0.0);
		when(t.getY()).thenReturn(0.0);
		when(t.getZ()).thenReturn(0.0);

		assertEquals(true, t.isZero(2.0));

		verify(t).isZero(2.0);

		verify(t).getX();
		verify(t).getY();
		verify(t).getZ();

		verifyNoMoreInteractions(t);
	}

	/**
	 * This test ensures, that the function {@link Tup3dR#isZero(double)} returns
	 * true, if all components are at the positive extreme point that is the
	 * inclusive tolerance parameter.
	 */
	@Test
	void isZeroWithTolerance_Extreme_PositiveTest()
	{
		Tup3dR t = mock(Tup3dR.class);

		when(t.isZero(2.0)).thenCallRealMethod();

		when(t.getX()).thenReturn(2.0);
		when(t.getY()).thenReturn(2.0);
		when(t.getZ()).thenReturn(2.0);

		assertEquals(true, t.isZero(2.0));

		verify(t).isZero(2.0);

		verify(t).getX();
		verify(t).getY();
		verify(t).getZ();

		verifyNoMoreInteractions(t);
	}

	/**
	 * This test ensures, that the function {@link Tup3dR#isZero(double)} returns
	 * true, if all components are at the negative extreme point that is the
	 * inclusive tolerance parameter.
	 */
	@Test
	void isZeroWithTolerance_Extreme_NegativeTest()
	{
		Tup3dR t = mock(Tup3dR.class);

		when(t.isZero(2.0)).thenCallRealMethod();

		when(t.getX()).thenReturn(-2.0);
		when(t.getY()).thenReturn(-2.0);
		when(t.getZ()).thenReturn(-2.0);

		assertEquals(true, t.isZero(2.0));

		verify(t).isZero(2.0);

		verify(t).getX();
		verify(t).getY();
		verify(t).getZ();

		verifyNoMoreInteractions(t);
	}

	/**
	 * This test ensures, that the function {@link Tup3dR#isZero(double)} returns
	 * false, if the x component exceeds the positive extreme point that is the
	 * inclusive tolerance parameter.
	 */
	@Test
	void isZeroWithTolerance_Fail_X_PositiveTest()
	{
		Tup3dR t = mock(Tup3dR.class);

		when(t.isZero(2.0)).thenCallRealMethod();

		when(t.getX()).thenReturn(3.0);

		assertEquals(false, t.isZero(2.0));

		verify(t).isZero(2.0);

		verify(t).getX();

		verifyNoMoreInteractions(t);
	}

	/**
	 * This test ensures, that the function {@link Tup3dR#isZero(double)} returns
	 * false, if the x component exceeds the negative extreme point that is the
	 * inclusive tolerance parameter.
	 */
	@Test
	void isZeroWithTolerance_Fail_X_NegativeTest()
	{
		Tup3dR t = mock(Tup3dR.class);

		when(t.isZero(2.0)).thenCallRealMethod();

		when(t.getX()).thenReturn(-3.0);

		assertEquals(false, t.isZero(2.0));

		verify(t).isZero(2.0);

		verify(t).getX();

		verifyNoMoreInteractions(t);
	}

	/**
	 * This test ensures, that the function {@link Tup3dR#isZero(double)} returns
	 * false, if the y component exceeds the positive extreme point that is the
	 * inclusive tolerance parameter.
	 */
	@Test
	void isZeroWithTolerance_Fail_Y_PositiveTest()
	{
		Tup3dR t = mock(Tup3dR.class);

		when(t.isZero(2.0)).thenCallRealMethod();

		when(t.getX()).thenReturn(0.0);
		when(t.getY()).thenReturn(3.0);

		assertEquals(false, t.isZero(2.0));

		verify(t).isZero(2.0);

		verify(t).getX();
		verify(t).getY();

		verifyNoMoreInteractions(t);
	}

	/**
	 * This test ensures, that the function {@link Tup3dR#isZero(double)} returns
	 * false, if the y component exceeds the positive extreme point that is the
	 * inclusive tolerance parameter.
	 */
	@Test
	void isZeroWithTolerance_Fail_Y_NegativeTest()
	{
		Tup3dR t = mock(Tup3dR.class);

		when(t.isZero(2.0)).thenCallRealMethod();

		when(t.getX()).thenReturn(0.0);
		when(t.getY()).thenReturn(-3.0);

		assertEquals(false, t.isZero(2.0));

		verify(t).isZero(2.0);

		verify(t).getX();
		verify(t).getY();

		verifyNoMoreInteractions(t);
	}

	/**
	 * This test ensures, that the function {@link Tup3dR#isZero(double)} returns
	 * false, if the z component exceeds the positive extreme point that is the
	 * inclusive tolerance parameter.
	 */
	@Test
	void isZeroWithTolerance_Fail_Z_PositiveTest()
	{
		Tup3dR t = mock(Tup3dR.class);

		when(t.isZero(2.0)).thenCallRealMethod();

		when(t.getX()).thenReturn(0.0);
		when(t.getY()).thenReturn(0.0);
		when(t.getZ()).thenReturn(3.0);

		assertEquals(false, t.isZero(2.0));

		verify(t).isZero(2.0);

		verify(t).getX();
		verify(t).getY();
		verify(t).getZ();

		verifyNoMoreInteractions(t);
	}

	/**
	 * This test ensures, that the function {@link Tup3dR#isZero(double)} returns
	 * false, if the z component exceeds the positive extreme point that is the
	 * inclusive tolerance parameter.
	 */
	@Test
	void isZeroWithTolerance_Fail_Z_NegativeTest()
	{
		Tup3dR t = mock(Tup3dR.class);

		when(t.isZero(2.0)).thenCallRealMethod();

		when(t.getX()).thenReturn(0.0);
		when(t.getY()).thenReturn(0.0);
		when(t.getZ()).thenReturn(-3.0);

		assertEquals(false, t.isZero(2.0));

		verify(t).isZero(2.0);

		verify(t).getX();
		verify(t).getY();
		verify(t).getZ();

		verifyNoMoreInteractions(t);
	}

	/**
	 * This test ensures, that the function {@link Tup3dR#toArray(double[])}
	 * returns the given array with the components in the right order.
	 */
	@Test
	void toArrayWithExtractParamTest()
	{
		Tup3dR t = mock(Tup3dR.class);

		double[] array = new double[3];

		when(t.toArray(array)).thenCallRealMethod();

		when(t.getX()).thenReturn(1.0);
		when(t.getY()).thenReturn(2.0);
		when(t.getZ()).thenReturn(3.0);

		assertSame(array, t.toArray(array));
		assertArrayEquals(new double[] {1.0, 2.0, 3.0}, array);

		verify(t).toArray(array);

		verify(t).getX();
		verify(t).getY();
		verify(t).getZ();

		verifyNoMoreInteractions(t);
	}
}