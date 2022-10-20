package org.barghos.tuple.api.test.t4;

import static org.junit.jupiter.api.Assertions.*;

import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import org.barghos.tuple.api.t4.Tup4bigdR;
import org.barghos.tuple.api.tn.TupbigdR;

/**
 * This class provides component tests for the interface {@link Tup4bigdR}.
 * 
 * @author picatrix1899
 */
class Tup4bigdRTest
{

	/**
	 * This test ensures, that the interface extends the interface
	 * {@link TupbigdR}.
	 */
	@Test
	void inheritance_TupRTest()
	{
		assertTrue(TupbigdR.class.isAssignableFrom(Tup4bigdR.class));
	}

	/**
	 * this test ensures, that the function {@link Tup4bigdR#getDimensions()}
	 * always returns 4 and does not make any calls.
	 */
	@Test
	void getDimensionsTest()
	{
		Tup4bigdR t = mock(Tup4bigdR.class);

		when(t.getDimensions()).thenCallRealMethod();

		assertEquals(4, t.getDimensions());

		verify(t).getDimensions();

		verifyNoMoreInteractions(t);
	}

	/**
	 * This test ensures, that the function {@link Tup4bigdR#getByIndex(int)}
	 * returns the x component for the index 0.
	 */
	@Test
	void getByIndex_XTest()
	{
		Tup4bigdR t = mock(Tup4bigdR.class);

		when(t.getByIndex(0)).thenCallRealMethod();

		when(t.getX()).thenReturn(BigDecimal.valueOf(1.0));

		assertEquals(BigDecimal.valueOf(1.0), t.getByIndex(0));

		verify(t).getByIndex(0);

		verify(t).getX();

		verifyNoMoreInteractions(t);
	}

	/**
	 * This test ensures, that the function {@link Tup4bigdR#getByIndex(int)}
	 * returns the y component for the index 1.
	 */
	@Test
	void getByIndex_YTest()
	{
		Tup4bigdR t = mock(Tup4bigdR.class);

		when(t.getByIndex(1)).thenCallRealMethod();

		when(t.getY()).thenReturn(BigDecimal.valueOf(1.0));

		assertEquals(BigDecimal.valueOf(1.0), t.getByIndex(1));

		verify(t).getByIndex(1);

		verify(t).getY();

		verifyNoMoreInteractions(t);
	}

	/**
	 * This test ensures, that the function {@link Tup4bigdR#getByIndex(int)}
	 * returns the z component for the index 2.
	 */
	@Test
	void getByIndex_ZTest()
	{
		Tup4bigdR t = mock(Tup4bigdR.class);

		when(t.getByIndex(2)).thenCallRealMethod();

		when(t.getZ()).thenReturn(BigDecimal.valueOf(1.0));

		assertEquals(BigDecimal.valueOf(1.0), t.getByIndex(2));

		verify(t).getByIndex(2);

		verify(t).getZ();

		verifyNoMoreInteractions(t);
	}

	/**
	 * This test ensures, that the function {@link Tup4bigdR#getByIndex(int)}
	 * returns the w component for the index 3.
	 */
	@Test
	void getByIndex_WTest()
	{
		Tup4bigdR t = mock(Tup4bigdR.class);

		when(t.getByIndex(3)).thenCallRealMethod();

		when(t.getW()).thenReturn(BigDecimal.valueOf(1.0));

		assertEquals(BigDecimal.valueOf(1.0), t.getByIndex(3));

		verify(t).getByIndex(3);

		verify(t).getW();

		verifyNoMoreInteractions(t);
	}

	/**
	 * This test ensures, that the function {@link Tup4bigdR#isZero()} returns
	 * true, if all of the components are exactly zero.
	 */
	@Test
	void isZero_ZeroTest()
	{
		Tup4bigdR t = mock(Tup4bigdR.class);

		when(t.isZero()).thenCallRealMethod();

		when(t.getX()).thenReturn(BigDecimal.valueOf(0.0));
		when(t.getY()).thenReturn(BigDecimal.valueOf(0.0));
		when(t.getZ()).thenReturn(BigDecimal.valueOf(0.0));
		when(t.getW()).thenReturn(BigDecimal.valueOf(0.0));

		assertEquals(true, t.isZero());

		verify(t).isZero();

		verify(t).getX();
		verify(t).getY();
		verify(t).getZ();
		verify(t).getW();

		verifyNoMoreInteractions(t);
	}

	/**
	 * This test ensures, that the function {@link Tup4bigdR#isZero()} returns
	 * false, if the x component is not zero.
	 */
	@Test
	void isZero_Fail_XTest()
	{
		Tup4bigdR t = mock(Tup4bigdR.class);

		when(t.isZero()).thenCallRealMethod();

		when(t.getX()).thenReturn(BigDecimal.valueOf(1.0));

		assertEquals(false, t.isZero());

		verify(t).isZero();

		verify(t).getX();

		verifyNoMoreInteractions(t);
	}

	/**
	 * This test ensures, that the function {@link Tup4bigdR#isZero()} returns
	 * false, if the y component is not zero.
	 */
	@Test
	void isZero_Fail_YTest()
	{
		Tup4bigdR t = mock(Tup4bigdR.class);

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
	 * This test ensures, that the function {@link Tup4bigdR#isZero()} returns
	 * false, if the z component is not zero.
	 */
	@Test
	void isZero_Fail_ZTest()
	{
		Tup4bigdR t = mock(Tup4bigdR.class);

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
	 * This test ensures, that the function {@link Tup4bigdR#isZero()} returns
	 * false, if the w component is not zero.
	 */
	@Test
	void isZero_Fail_WTest()
	{
		Tup4bigdR t = mock(Tup4bigdR.class);

		when(t.isZero()).thenCallRealMethod();

		when(t.getX()).thenReturn(BigDecimal.valueOf(0.0));
		when(t.getY()).thenReturn(BigDecimal.valueOf(0.0));
		when(t.getZ()).thenReturn(BigDecimal.valueOf(0.0));
		when(t.getW()).thenReturn(BigDecimal.valueOf(1.0));

		assertEquals(false, t.isZero());

		verify(t).isZero();

		verify(t).getX();
		verify(t).getY();
		verify(t).getZ();
		verify(t).getW();

		verifyNoMoreInteractions(t);
	}

	/**
	 * This test ensures, that the function {@link Tup4bigdR#isZero(BigDecimal)} returns
	 * true, if all components are exactly zero.
	 */
	@Test
	void isZeroWithTolerance_ZeroTest()
	{
		Tup4bigdR t = mock(Tup4bigdR.class);

		when(t.isZero(BigDecimal.valueOf(2.0))).thenCallRealMethod();

		when(t.getX()).thenReturn(BigDecimal.valueOf(0.0));
		when(t.getY()).thenReturn(BigDecimal.valueOf(0.0));
		when(t.getZ()).thenReturn(BigDecimal.valueOf(0.0));
		when(t.getW()).thenReturn(BigDecimal.valueOf(0.0));

		assertEquals(true, t.isZero(BigDecimal.valueOf(2.0)));

		verify(t).isZero(BigDecimal.valueOf(2.0));

		verify(t).getX();
		verify(t).getY();
		verify(t).getZ();
		verify(t).getW();

		verifyNoMoreInteractions(t);
	}

	/**
	 * This test ensures, that the function {@link Tup4bigdR#isZero(BigDecimal)} returns
	 * true, if all components are at the positive extreme point that is the
	 * inclusive tolerance parameter.
	 */
	@Test
	void isZeroWithTolerance_Extreme_PositiveTest()
	{
		Tup4bigdR t = mock(Tup4bigdR.class);

		when(t.isZero(BigDecimal.valueOf(2.0))).thenCallRealMethod();

		when(t.getX()).thenReturn(BigDecimal.valueOf(2.0));
		when(t.getY()).thenReturn(BigDecimal.valueOf(2.0));
		when(t.getZ()).thenReturn(BigDecimal.valueOf(2.0));
		when(t.getW()).thenReturn(BigDecimal.valueOf(2.0));

		assertEquals(true, t.isZero(BigDecimal.valueOf(2.0)));

		verify(t).isZero(BigDecimal.valueOf(2.0));

		verify(t).getX();
		verify(t).getY();
		verify(t).getZ();
		verify(t).getW();

		verifyNoMoreInteractions(t);
	}

	/**
	 * This test ensures, that the function {@link Tup4bigdR#isZero(BigDecimal)} returns
	 * true, if all components are at the negative extreme point that is the
	 * inclusive tolerance parameter.
	 */
	@Test
	void isZeroWithTolerance_Extreme_NegativeTest()
	{
		Tup4bigdR t = mock(Tup4bigdR.class);

		when(t.isZero(BigDecimal.valueOf(2.0))).thenCallRealMethod();

		when(t.getX()).thenReturn(BigDecimal.valueOf(-2.0));
		when(t.getY()).thenReturn(BigDecimal.valueOf(-2.0));
		when(t.getZ()).thenReturn(BigDecimal.valueOf(-2.0));
		when(t.getW()).thenReturn(BigDecimal.valueOf(-2.0));

		assertEquals(true, t.isZero(BigDecimal.valueOf(2.0)));

		verify(t).isZero(BigDecimal.valueOf(2.0));

		verify(t).getX();
		verify(t).getY();
		verify(t).getZ();
		verify(t).getW();

		verifyNoMoreInteractions(t);
	}

	/**
	 * This test ensures, that the function {@link Tup4bigdR#isZero(BigDecimal)} returns
	 * false, if the x component exceeds the positive extreme point that is the
	 * inclusive tolerance parameter.
	 */
	@Test
	void isZeroWithTolerance_Fail_X_PositiveTest()
	{
		Tup4bigdR t = mock(Tup4bigdR.class);

		when(t.isZero(BigDecimal.valueOf(2.0))).thenCallRealMethod();

		when(t.getX()).thenReturn(BigDecimal.valueOf(3.0));

		assertEquals(false, t.isZero(BigDecimal.valueOf(2.0)));

		verify(t).isZero(BigDecimal.valueOf(2.0));

		verify(t).getX();

		verifyNoMoreInteractions(t);
	}

	/**
	 * This test ensures, that the function {@link Tup4bigdR#isZero(BigDecimal)} returns
	 * false, if the x component exceeds the negative extreme point that is the
	 * inclusive tolerance parameter.
	 */
	@Test
	void isZeroWithTolerance_Fail_X_NegativeTest()
	{
		Tup4bigdR t = mock(Tup4bigdR.class);

		when(t.isZero(BigDecimal.valueOf(2.0))).thenCallRealMethod();

		when(t.getX()).thenReturn(BigDecimal.valueOf(-3.0));

		assertEquals(false, t.isZero(BigDecimal.valueOf(2.0)));

		verify(t).isZero(BigDecimal.valueOf(2.0));

		verify(t).getX();

		verifyNoMoreInteractions(t);
	}

	/**
	 * This test ensures, that the function {@link Tup4bigdR#isZero(BigDecimal)} returns
	 * false, if the y component exceeds the positive extreme point that is the
	 * inclusive tolerance parameter.
	 */
	@Test
	void isZeroWithTolerance_Fail_Y_PositiveTest()
	{
		Tup4bigdR t = mock(Tup4bigdR.class);

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
	 * This test ensures, that the function {@link Tup4bigdR#isZero(BigDecimal)} returns
	 * false, if the y component exceeds the positive extreme point that is the
	 * inclusive tolerance parameter.
	 */
	@Test
	void isZeroWithTolerance_Fail_Y_NegativeTest()
	{
		Tup4bigdR t = mock(Tup4bigdR.class);

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
	 * This test ensures, that the function {@link Tup4bigdR#isZero(BigDecimal)} returns
	 * false, if the z component exceeds the positive extreme point that is the
	 * inclusive tolerance parameter.
	 */
	@Test
	void isZeroWithTolerance_Fail_Z_PositiveTest()
	{
		Tup4bigdR t = mock(Tup4bigdR.class);

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
	 * This test ensures, that the function {@link Tup4bigdR#isZero(BigDecimal)} returns
	 * false, if the z component exceeds the positive extreme point that is the
	 * inclusive tolerance parameter.
	 */
	@Test
	void isZeroWithTolerance_Fail_Z_NegativeTest()
	{
		Tup4bigdR t = mock(Tup4bigdR.class);

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
	 * This test ensures, that the function {@link Tup4bigdR#isZero(BigDecimal)} returns
	 * false, if the w component exceeds the positive extreme point that is the
	 * inclusive tolerance parameter.
	 */
	@Test
	void isZeroWithTolerance_Fail_W_PositiveTest()
	{
		Tup4bigdR t = mock(Tup4bigdR.class);

		when(t.isZero(BigDecimal.valueOf(2.0))).thenCallRealMethod();

		when(t.getX()).thenReturn(BigDecimal.valueOf(0.0));
		when(t.getY()).thenReturn(BigDecimal.valueOf(0.0));
		when(t.getZ()).thenReturn(BigDecimal.valueOf(0.0));
		when(t.getW()).thenReturn(BigDecimal.valueOf(3.0));

		assertEquals(false, t.isZero(BigDecimal.valueOf(2.0)));

		verify(t).isZero(BigDecimal.valueOf(2.0));

		verify(t).getX();
		verify(t).getY();
		verify(t).getZ();
		verify(t).getW();

		verifyNoMoreInteractions(t);
	}

	/**
	 * This test ensures, that the function {@link Tup4bigdR#isZero(BigDecimal)} returns
	 * false, if the w component exceeds the positive extreme point that is the
	 * inclusive tolerance parameter.
	 */
	@Test
	void isZeroWithTolerance_Fail_W_NegativeTest()
	{
		Tup4bigdR t = mock(Tup4bigdR.class);

		when(t.isZero(BigDecimal.valueOf(2.0))).thenCallRealMethod();

		when(t.getX()).thenReturn(BigDecimal.valueOf(0.0));
		when(t.getY()).thenReturn(BigDecimal.valueOf(0.0));
		when(t.getZ()).thenReturn(BigDecimal.valueOf(0.0));
		when(t.getW()).thenReturn(BigDecimal.valueOf(-3.0));

		assertEquals(false, t.isZero(BigDecimal.valueOf(2.0)));

		verify(t).isZero(BigDecimal.valueOf(2.0));

		verify(t).getX();
		verify(t).getY();
		verify(t).getZ();
		verify(t).getW();

		verifyNoMoreInteractions(t);
	}

	/**
	 * This test ensures, that the function {@link Tup4bigdR#toArray(BigDecimal[])}
	 * returns the given array with the components in the right order.
	 */
	@Test
	void toArrayWithExtractionParamTest()
	{
		Tup4bigdR t = mock(Tup4bigdR.class);

		BigDecimal[] array = new BigDecimal[4];

		when(t.toArray(array)).thenCallRealMethod();

		when(t.getX()).thenReturn(BigDecimal.valueOf(1.0));
		when(t.getY()).thenReturn(BigDecimal.valueOf(2.0));
		when(t.getZ()).thenReturn(BigDecimal.valueOf(3.0));
		when(t.getW()).thenReturn(BigDecimal.valueOf(4.0));

		assertSame(array, t.toArray(array));
		assertArrayEquals(new BigDecimal[] {BigDecimal.valueOf(1.0), BigDecimal.valueOf(2.0), BigDecimal.valueOf(3.0), BigDecimal.valueOf(4.0)}, array);

		verify(t).toArray(array);

		verify(t).getX();
		verify(t).getY();
		verify(t).getZ();
		verify(t).getW();

		verifyNoMoreInteractions(t);
	}
}