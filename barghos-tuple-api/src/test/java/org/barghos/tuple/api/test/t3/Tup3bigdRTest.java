package org.barghos.tuple.api.test.t3;

import static org.junit.jupiter.api.Assertions.*;

import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import org.barghos.tuple.api.t3.Tup3bigdR;
import org.barghos.tuple.api.tn.TupbigdR;

/**
 * This class provides component tests for the interface {@link Tup3bigdR}.
 * 
 * @author picatrix1899
 */
class Tup3bigdRTest
{

	/**
	 * This test ensures, that the interface extends the interface
	 * {@link TupbigdR}.
	 */
	@Test
	void inheritance_TupRTest()
	{
		assertTrue(TupbigdR.class.isAssignableFrom(Tup3bigdR.class));
	}

	/**
	 * this test ensures, that the function {@link Tup3bigdR#getDimensions()}
	 * always returns 3 and does not make any calls.
	 */
	@Test
	void getDimensionsTest()
	{
		Tup3bigdR t = mock(Tup3bigdR.class);

		when(t.getDimensions()).thenCallRealMethod();

		assertEquals(3, t.getDimensions());

		verify(t).getDimensions();

		verifyNoMoreInteractions(t);
	}

	/**
	 * This test ensures, that the function {@link Tup3bigdR#getByIndex(int)}
	 * returns the x component for the index 0.
	 */
	@Test
	void getByIndex_XTest()
	{
		Tup3bigdR t = mock(Tup3bigdR.class);

		when(t.getByIndex(0)).thenCallRealMethod();

		when(t.getX()).thenReturn(BigDecimal.valueOf(1.0));

		assertEquals(BigDecimal.valueOf(1.0), t.getByIndex(0));

		verify(t).getByIndex(0);

		verify(t).getX();

		verifyNoMoreInteractions(t);
	}

	/**
	 * This test ensures, that the function {@link Tup3bigdR#getByIndex(int)}
	 * returns the y component for the index 1.
	 */
	@Test
	void getByIndex_YTest()
	{
		Tup3bigdR t = mock(Tup3bigdR.class);

		when(t.getByIndex(1)).thenCallRealMethod();

		when(t.getY()).thenReturn(BigDecimal.valueOf(1.0));

		assertEquals(BigDecimal.valueOf(1.0), t.getByIndex(1));

		verify(t).getByIndex(1);

		verify(t).getY();

		verifyNoMoreInteractions(t);
	}

	/**
	 * This test ensures, that the function {@link Tup3bigdR#getByIndex(int)}
	 * returns the z component for the index 2.
	 */
	@Test
	void getByIndex_ZTest()
	{
		Tup3bigdR t = mock(Tup3bigdR.class);

		when(t.getByIndex(2)).thenCallRealMethod();

		when(t.getZ()).thenReturn(BigDecimal.valueOf(1.0));

		assertEquals(BigDecimal.valueOf(1.0), t.getByIndex(2));

		verify(t).getByIndex(2);

		verify(t).getZ();

		verifyNoMoreInteractions(t);
	}

	/**
	 * This test ensures, that the function {@link Tup3bigdR#isZero()} returns
	 * true, if all of the components are exactly zero.
	 */
	@Test
	void isZero_ZeroTest()
	{
		Tup3bigdR t = mock(Tup3bigdR.class);

		when(t.isZero()).thenCallRealMethod();

		when(t.getX()).thenReturn(BigDecimal.valueOf(0.0));
		when(t.getY()).thenReturn(BigDecimal.valueOf(0.0));
		when(t.getZ()).thenReturn(BigDecimal.valueOf(0.0));

		assertEquals(true, t.isZero());

		verify(t).isZero();

		verify(t).getX();
		verify(t).getY();
		verify(t).getZ();

		verifyNoMoreInteractions(t);
	}

	/**
	 * This test ensures, that the function {@link Tup3bigdR#isZero()} returns
	 * false, if the x component is not zero.
	 */
	@Test
	void isZero_Fail_XTest()
	{
		Tup3bigdR t = mock(Tup3bigdR.class);

		when(t.isZero()).thenCallRealMethod();

		when(t.getX()).thenReturn(BigDecimal.valueOf(1.0));

		assertEquals(false, t.isZero());

		verify(t).isZero();

		verify(t).getX();

		verifyNoMoreInteractions(t);
	}

	/**
	 * This test ensures, that the function {@link Tup3bigdR#isZero()} returns
	 * false, if the y component is not zero.
	 */
	@Test
	void isZero_Fail_YTest()
	{
		Tup3bigdR t = mock(Tup3bigdR.class);

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
	 * This test ensures, that the function {@link Tup3bigdR#isZero()} returns
	 * false, if the z component is not zero.
	 */
	@Test
	void isZero_Fail_ZTest()
	{
		Tup3bigdR t = mock(Tup3bigdR.class);

		when(t.isZero()).thenCallRealMethod();

		when(t.getX()).thenReturn(BigDecimal.valueOf(0.0));
		when(t.getY()).thenReturn(BigDecimal.valueOf(0.0));
		when(t.getZ()).thenReturn(BigDecimal.valueOf(1.0));

		assertEquals(false, t.isZero());

		verify(t).isZero();

		verify(t).getX();
		verify(t).getY();
		verify(t).getZ();

		verifyNoMoreInteractions(t);
	}

	/**
	 * This test ensures, that the function {@link Tup3bigdR#isZero(BigDecimal)} returns
	 * true, if all components are exactly zero.
	 */
	@Test
	void isZeroWithTolerance_ZeroTest()
	{
		Tup3bigdR t = mock(Tup3bigdR.class);

		when(t.isZero(BigDecimal.valueOf(2.0))).thenCallRealMethod();

		when(t.getX()).thenReturn(BigDecimal.valueOf(0.0));
		when(t.getY()).thenReturn(BigDecimal.valueOf(0.0));
		when(t.getZ()).thenReturn(BigDecimal.valueOf(0.0));

		assertEquals(true, t.isZero(BigDecimal.valueOf(2.0)));

		verify(t).isZero(BigDecimal.valueOf(2.0));

		verify(t).getX();
		verify(t).getY();
		verify(t).getZ();

		verifyNoMoreInteractions(t);
	}

	/**
	 * This test ensures, that the function {@link Tup3bigdR#isZero(BigDecimal)} returns
	 * true, if all components are at the positive extreme point that is the
	 * inclusive tolerance parameter.
	 */
	@Test
	void isZeroWithTolerance_Extreme_PositiveTest()
	{
		Tup3bigdR t = mock(Tup3bigdR.class);

		when(t.isZero(BigDecimal.valueOf(2.0))).thenCallRealMethod();

		when(t.getX()).thenReturn(BigDecimal.valueOf(2.0));
		when(t.getY()).thenReturn(BigDecimal.valueOf(2.0));
		when(t.getZ()).thenReturn(BigDecimal.valueOf(2.0));

		assertEquals(true, t.isZero(BigDecimal.valueOf(2.0)));

		verify(t).isZero(BigDecimal.valueOf(2.0));

		verify(t).getX();
		verify(t).getY();
		verify(t).getZ();

		verifyNoMoreInteractions(t);
	}

	/**
	 * This test ensures, that the function {@link Tup3bigdR#isZero(BigDecimal)} returns
	 * true, if all components are at the negative extreme point that is the
	 * inclusive tolerance parameter.
	 */
	@Test
	void isZeroWithTolerance_Extreme_NegativeTest()
	{
		Tup3bigdR t = mock(Tup3bigdR.class);

		when(t.isZero(BigDecimal.valueOf(2.0))).thenCallRealMethod();

		when(t.getX()).thenReturn(BigDecimal.valueOf(-2.0));
		when(t.getY()).thenReturn(BigDecimal.valueOf(-2.0));
		when(t.getZ()).thenReturn(BigDecimal.valueOf(-2.0));

		assertEquals(true, t.isZero(BigDecimal.valueOf(2.0)));

		verify(t).isZero(BigDecimal.valueOf(2.0));

		verify(t).getX();
		verify(t).getY();
		verify(t).getZ();

		verifyNoMoreInteractions(t);
	}

	/**
	 * This test ensures, that the function {@link Tup3bigdR#isZero(BigDecimal)} returns
	 * false, if the x component exceeds the positive extreme point that is the
	 * inclusive tolerance parameter.
	 */
	@Test
	void isZeroWithTolerance_Fail_X_PositiveTest()
	{
		Tup3bigdR t = mock(Tup3bigdR.class);

		when(t.isZero(BigDecimal.valueOf(2.0))).thenCallRealMethod();

		when(t.getX()).thenReturn(BigDecimal.valueOf(3.0));

		assertEquals(false, t.isZero(BigDecimal.valueOf(2.0)));

		verify(t).isZero(BigDecimal.valueOf(2.0));

		verify(t).getX();

		verifyNoMoreInteractions(t);
	}

	/**
	 * This test ensures, that the function {@link Tup3bigdR#isZero(BigDecimal)} returns
	 * false, if the x component exceeds the negative extreme point that is the
	 * inclusive tolerance parameter.
	 */
	@Test
	void isZeroWithTolerance_Fail_X_NegativeTest()
	{
		Tup3bigdR t = mock(Tup3bigdR.class);

		when(t.isZero(BigDecimal.valueOf(2.0))).thenCallRealMethod();

		when(t.getX()).thenReturn(BigDecimal.valueOf(-3.0));

		assertEquals(false, t.isZero(BigDecimal.valueOf(2.0)));

		verify(t).isZero(BigDecimal.valueOf(2.0));

		verify(t).getX();

		verifyNoMoreInteractions(t);
	}

	/**
	 * This test ensures, that the function {@link Tup3bigdR#isZero(BigDecimal)} returns
	 * false, if the y component exceeds the positive extreme point that is the
	 * inclusive tolerance parameter.
	 */
	@Test
	void isZeroWithTolerance_Fail_Y_PositiveTest()
	{
		Tup3bigdR t = mock(Tup3bigdR.class);

		when(t.isZero((BigDecimal.valueOf(2.0)))).thenCallRealMethod();

		when(t.getX()).thenReturn(BigDecimal.valueOf(0.0));
		when(t.getY()).thenReturn(BigDecimal.valueOf(3.0));

		assertEquals(false, t.isZero(BigDecimal.valueOf(2.0)));

		verify(t).isZero(BigDecimal.valueOf(2.0));

		verify(t).getX();
		verify(t).getY();

		verifyNoMoreInteractions(t);
	}

	/**
	 * This test ensures, that the function {@link Tup3bigdR#isZero(BigDecimal)} returns
	 * false, if the y component exceeds the positive extreme point that is the
	 * inclusive tolerance parameter.
	 */
	@Test
	void isZeroWithTolerance_Fail_Y_NegativeTest()
	{
		Tup3bigdR t = mock(Tup3bigdR.class);

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
	 * This test ensures, that the function {@link Tup3bigdR#isZero(BigDecimal)} returns
	 * false, if the z component exceeds the positive extreme point that is the
	 * inclusive tolerance parameter.
	 */
	@Test
	void isZeroWithTolerance_Fail_Z_PositiveTest()
	{
		Tup3bigdR t = mock(Tup3bigdR.class);

		when(t.isZero(BigDecimal.valueOf(2.0))).thenCallRealMethod();

		when(t.getX()).thenReturn(BigDecimal.valueOf(0.0));
		when(t.getY()).thenReturn(BigDecimal.valueOf(0.0));
		when(t.getZ()).thenReturn(BigDecimal.valueOf(3.0));

		assertEquals(false, t.isZero(BigDecimal.valueOf(2.0)));

		verify(t).isZero(BigDecimal.valueOf(2.0));

		verify(t).getX();
		verify(t).getY();
		verify(t).getZ();

		verifyNoMoreInteractions(t);
	}

	/**
	 * This test ensures, that the function {@link Tup3bigdR#isZero(BigDecimal)} returns
	 * false, if the z component exceeds the positive extreme point that is the
	 * inclusive tolerance parameter.
	 */
	@Test
	void isZeroWithTolerance_Fail_Z_NegativeTest()
	{
		Tup3bigdR t = mock(Tup3bigdR.class);

		when(t.isZero(BigDecimal.valueOf(2.0))).thenCallRealMethod();

		when(t.getX()).thenReturn(BigDecimal.valueOf(0.0));
		when(t.getY()).thenReturn(BigDecimal.valueOf(0.0));
		when(t.getZ()).thenReturn(BigDecimal.valueOf(-3.0));

		assertEquals(false, t.isZero(BigDecimal.valueOf(2.0)));

		verify(t).isZero(BigDecimal.valueOf(2.0));

		verify(t).getX();
		verify(t).getY();
		verify(t).getZ();

		verifyNoMoreInteractions(t);
	}

	/**
	 * This test ensures, that the function {@link Tup3bigdR#toArray(BigDecimal[])}
	 * returns the given array with the components in the right order.
	 */
	@Test
	void toArrayWithExtractParamTest()
	{
		Tup3bigdR t = mock(Tup3bigdR.class);

		BigDecimal[] array = new BigDecimal[3];

		when(t.toArray(array)).thenCallRealMethod();

		when(t.getX()).thenReturn(BigDecimal.valueOf(1.0));
		when(t.getY()).thenReturn(BigDecimal.valueOf(2.0));
		when(t.getZ()).thenReturn(BigDecimal.valueOf(3.0));

		assertSame(array, t.toArray(array));
		assertArrayEquals(new BigDecimal[] {BigDecimal.valueOf(1.0), BigDecimal.valueOf(2.0), BigDecimal.valueOf(3.0)}, array);

		verify(t).toArray(array);

		verify(t).getX();
		verify(t).getY();
		verify(t).getZ();

		verifyNoMoreInteractions(t);
	}
}