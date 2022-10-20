package org.barghos.tuple.api.test.t2;

import static org.junit.jupiter.api.Assertions.*;

import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import org.barghos.tuple.api.t2.Tup2bigdR;
import org.barghos.tuple.api.tn.TupbigdR;

/**
 * This class provides component tests for the interface {@link Tup2bigdR}.
 * 
 * @author picatrix1899
 */
class Tup2bigdRTest
{

	/**
	 * This test ensures, that the interface extends the interface
	 * {@link TupbigdR}.
	 */
	@Test
	void inheritance_TupRTest()
	{
		assertTrue(TupbigdR.class.isAssignableFrom(Tup2bigdR.class));
	}

	/**
	 * this test ensures, that the function {@link Tup2bigdR#getDimensions()}
	 * always returns 2 and does not make any calls.
	 */
	@Test
	void getDimensionsTest()
	{
		Tup2bigdR t = mock(Tup2bigdR.class);

		when(t.getDimensions()).thenCallRealMethod();

		assertEquals(2, t.getDimensions());

		verify(t).getDimensions();

		verifyNoMoreInteractions(t);
	}

	/**
	 * This test ensures, that the function {@link Tup2bigdR#getByIndex(int)}
	 * returns the x component for the index 0.
	 */
	@Test
	void getByIndex_XTest()
	{
		Tup2bigdR t = mock(Tup2bigdR.class);

		when(t.getByIndex(0)).thenCallRealMethod();

		when(t.getX()).thenReturn(BigDecimal.valueOf(1.0));

		assertEquals(BigDecimal.valueOf(1.0), t.getByIndex(0));

		verify(t).getByIndex(0);

		verify(t).getX();

		verifyNoMoreInteractions(t);
	}

	/**
	 * This test ensures, that the function {@link Tup2bigdR#getByIndex(int)}
	 * returns the y component for the index 1.
	 */
	@Test
	void getByIndex_YTest()
	{
		Tup2bigdR t = mock(Tup2bigdR.class);

		when(t.getByIndex(1)).thenCallRealMethod();

		when(t.getY()).thenReturn(BigDecimal.valueOf(1.0));

		assertEquals(BigDecimal.valueOf(1.0), t.getByIndex(1));

		verify(t).getByIndex(1);

		verify(t).getY();

		verifyNoMoreInteractions(t);
	}

	/**
	 * This test ensures, that the function {@link Tup2bigdR#isZero()} returns
	 * true, if all of the components are exactly zero.
	 */
	@Test
	void isZero_ZeroTest()
	{
		Tup2bigdR t = mock(Tup2bigdR.class);

		when(t.isZero()).thenCallRealMethod();

		when(t.getX()).thenReturn(BigDecimal.valueOf(0.0));
		when(t.getY()).thenReturn(BigDecimal.valueOf(0.0));

		assertEquals(true, t.isZero());

		verify(t).isZero();

		verify(t).getX();
		verify(t).getY();

		verifyNoMoreInteractions(t);
	}

	/**
	 * This test ensures, that the function {@link Tup2bigdR#isZero()} returns
	 * false, if the x component is not zero.
	 */
	@Test
	void isZero_Fail_XTest()
	{
		Tup2bigdR t = mock(Tup2bigdR.class);

		when(t.isZero()).thenCallRealMethod();

		when(t.getX()).thenReturn(BigDecimal.valueOf(1.0));

		assertEquals(false, t.isZero());

		verify(t).isZero();

		verify(t).getX();

		verifyNoMoreInteractions(t);
	}

	/**
	 * This test ensures, that the function {@link Tup2bigdR#isZero()} returns
	 * false, if the y component is not zero.
	 */
	@Test
	void isZero_Fail_YTest()
	{
		Tup2bigdR t = mock(Tup2bigdR.class);

		when(t.isZero()).thenCallRealMethod();

		when(t.getX()).thenReturn(BigDecimal.valueOf(0.0));
		when(t.getY()).thenReturn(BigDecimal.valueOf(1.0));

		assertEquals(false, t.isZero());

		verify(t).isZero();

		verify(t).getX();
		verify(t).getY();

		verifyNoMoreInteractions(t);
	}

	/**
	 * This test ensures, that the function {@link Tup2bigdR#isZero(BigDecimal)}
	 * returns true, if all components are exactly zero.
	 */
	@Test
	void isZeroWithTolerance_ZeroTest()
	{
		Tup2bigdR t = mock(Tup2bigdR.class);

		when(t.isZero(BigDecimal.valueOf(2.0))).thenCallRealMethod();

		when(t.getX()).thenReturn(BigDecimal.valueOf(0.0));
		when(t.getY()).thenReturn(BigDecimal.valueOf(0.0));

		assertEquals(true, t.isZero(BigDecimal.valueOf(2.0)));

		verify(t).isZero(BigDecimal.valueOf(2.0));

		verify(t).getX();
		verify(t).getY();

		verifyNoMoreInteractions(t);
	}

	/**
	 * This test ensures, that the function {@link Tup2bigdR#isZero(BigDecimal)}
	 * returns true, if all components are at the positive extreme point that is
	 * the inclusive tolerance parameter.
	 */
	@Test
	void isZeroWithTolerance_Extreme_PositiveTest()
	{
		Tup2bigdR t = mock(Tup2bigdR.class);

		when(t.isZero(BigDecimal.valueOf(2.0))).thenCallRealMethod();

		when(t.getX()).thenReturn(BigDecimal.valueOf(2.0));
		when(t.getY()).thenReturn(BigDecimal.valueOf(2.0));

		assertEquals(true, t.isZero(BigDecimal.valueOf(2.0)));

		verify(t).isZero(BigDecimal.valueOf(2.0));

		verify(t).getX();
		verify(t).getY();

		verifyNoMoreInteractions(t);
	}

	/**
	 * This test ensures, that the function {@link Tup2bigdR#isZero(BigDecimal)}
	 * returns true, if all components are at the negative extreme point that is
	 * the inclusive tolerance parameter.
	 */
	@Test
	void isZeroWithTolerance_Extreme_NegativeTest()
	{
		Tup2bigdR t = mock(Tup2bigdR.class);

		when(t.isZero(BigDecimal.valueOf(2.0))).thenCallRealMethod();

		when(t.getX()).thenReturn(BigDecimal.valueOf(-2.0));
		when(t.getY()).thenReturn(BigDecimal.valueOf(-2.0));

		assertEquals(true, t.isZero(BigDecimal.valueOf(2.0)));

		verify(t).isZero(BigDecimal.valueOf(2.0));

		verify(t).getX();
		verify(t).getY();

		verifyNoMoreInteractions(t);
	}

	/**
	 * This test ensures, that the function {@link Tup2bigdR#isZero(BigDecimal)}
	 * returns false, if the x component exceeds the positive extreme point that
	 * is the inclusive tolerance parameter.
	 */
	@Test
	void isZeroWithTolerance_Fail_X_PositiveTest()
	{
		Tup2bigdR t = mock(Tup2bigdR.class);

		when(t.isZero(BigDecimal.valueOf(2.0))).thenCallRealMethod();

		when(t.getX()).thenReturn(BigDecimal.valueOf(3.0));

		assertEquals(false, t.isZero(BigDecimal.valueOf(2.0)));

		verify(t).isZero(BigDecimal.valueOf(2.0));

		verify(t).getX();

		verifyNoMoreInteractions(t);
	}

	/**
	 * This test ensures, that the function {@link Tup2bigdR#isZero(BigDecimal)}
	 * returns false, if the x component exceeds the negative extreme point that
	 * is the inclusive tolerance parameter.
	 */
	@Test
	void isZeroWithTolerance_Fail_X_NegativeTest()
	{
		Tup2bigdR t = mock(Tup2bigdR.class);

		when(t.isZero(BigDecimal.valueOf(2.0))).thenCallRealMethod();

		when(t.getX()).thenReturn(BigDecimal.valueOf(-3.0));

		assertEquals(false, t.isZero(BigDecimal.valueOf(2.0)));

		verify(t).isZero(BigDecimal.valueOf(2.0));

		verify(t).getX();

		verifyNoMoreInteractions(t);
	}

	/**
	 * This test ensures, that the function {@link Tup2bigdR#isZero(BigDecimal)}
	 * returns false, if the y component exceeds the positive extreme point that
	 * is the inclusive tolerance parameter.
	 */
	@Test
	void isZeroWithTolerance_Fail_Y_PositiveTest()
	{
		Tup2bigdR t = mock(Tup2bigdR.class);

		when(t.isZero(BigDecimal.valueOf(2.0))).thenCallRealMethod();

		when(t.getX()).thenReturn(BigDecimal.valueOf(0.0));
		when(t.getY()).thenReturn(BigDecimal.valueOf(3.0));

		assertEquals(false, t.isZero(BigDecimal.valueOf(2.0)));

		verify(t).isZero(BigDecimal.valueOf(2.0));

		verify(t).getX();
		verify(t).getY();

		verifyNoMoreInteractions(t);
	}

	/**
	 * This test ensures, that the function {@link Tup2bigdR#isZero(BigDecimal)}
	 * returns false, if the y component exceeds the positive extreme point that
	 * is the inclusive tolerance parameter.
	 */
	@Test
	void isZeroWithTolerance_Fail_Y_NegativeTest()
	{
		Tup2bigdR t = mock(Tup2bigdR.class);

		when(t.isZero(BigDecimal.valueOf(2.0))).thenCallRealMethod();

		when(t.getX()).thenReturn(BigDecimal.valueOf(0.0));
		when(t.getY()).thenReturn(BigDecimal.valueOf(-3.0));

		assertEquals(false, t.isZero(BigDecimal.valueOf(2.0)));

		verify(t).isZero(BigDecimal.valueOf(2.0));

		verify(t).getX();
		verify(t).getY();

		verifyNoMoreInteractions(t);
	}

	/**
	 * This test ensures, that the function {@link Tup2bigdR#isZero(BigDecimal)} throws
	 * an {@link IllegalArgumentException} if the tolerance parameter is below
	 * zero.
	 */
	@Test
	void isZeroWithTolerance_Error_BelowZeroToleranceTest()
	{
		Tup2bigdR t = mock(Tup2bigdR.class);

		when(t.isZero(BigDecimal.valueOf(-1.0))).thenCallRealMethod();

		assertThrowsExactly(IllegalArgumentException.class, () -> t.isZero(BigDecimal.valueOf(-1.0)));

		verify(t).isZero(BigDecimal.valueOf(-1.0));

		verifyNoMoreInteractions(t);
	}

	/**
	 * This test ensures, that the function {@link Tup2bigdR#toArray(BigDecimal[])}
	 * returns the given array with the components in the right order.
	 */
	@Test
	void toArrayWithExtractionParamTest()
	{
		Tup2bigdR t = mock(Tup2bigdR.class);

		BigDecimal[] array = new BigDecimal[2];

		when(t.toArray(array)).thenCallRealMethod();

		when(t.getX()).thenReturn(BigDecimal.valueOf(1.0));
		when(t.getY()).thenReturn(BigDecimal.valueOf(2.0));

		assertSame(array, t.toArray(array));
		assertArrayEquals(new BigDecimal[] {BigDecimal.valueOf(1.0), BigDecimal.valueOf(2.0)}, array);

		verify(t).toArray(array);

		verify(t).getX();
		verify(t).getY();

		verifyNoMoreInteractions(t);
	}
}