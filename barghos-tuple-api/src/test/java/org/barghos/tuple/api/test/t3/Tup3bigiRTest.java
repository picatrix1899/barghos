package org.barghos.tuple.api.test.t3;

import static org.junit.jupiter.api.Assertions.*;

import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;

import java.math.BigInteger;

import org.barghos.tuple.api.t3.Tup3bigiR;
import org.barghos.tuple.api.tn.TupbigiR;

/**
 * This class provides component tests for the interface {@link Tup3bigiR}.
 * 
 * @author picatrix1899
 */
class Tup3bigiRTest
{

	/**
	 * This test ensures, that the interface extends the interface
	 * {@link TupbigiR}.
	 */
	@Test
	void inheritance_TupRTest()
	{
		assertTrue(TupbigiR.class.isAssignableFrom(Tup3bigiR.class));
	}

	/**
	 * this test ensures, that the function {@link Tup3bigiR#getDimensions()}
	 * always returns 3 and does not make any calls.
	 */
	@Test
	void getDimensionsTest()
	{
		Tup3bigiR t = mock(Tup3bigiR.class);

		when(t.getDimensions()).thenCallRealMethod();

		assertEquals(3, t.getDimensions());

		verify(t).getDimensions();

		verifyNoMoreInteractions(t);
	}

	/**
	 * This test ensures, that the function {@link Tup3bigiR#getByIndex(int)}
	 * returns the x component for the index 0.
	 */
	@Test
	void getByIndex_XTest()
	{
		Tup3bigiR t = mock(Tup3bigiR.class);

		when(t.getByIndex(0)).thenCallRealMethod();

		when(t.getX()).thenReturn(BigInteger.valueOf(1));

		assertEquals(BigInteger.valueOf(1), t.getByIndex(0));

		verify(t).getByIndex(0);

		verify(t).getX();

		verifyNoMoreInteractions(t);
	}

	/**
	 * This test ensures, that the function {@link Tup3bigiR#getByIndex(int)}
	 * returns the y component for the index 1.
	 */
	@Test
	void getByIndex_YTest()
	{
		Tup3bigiR t = mock(Tup3bigiR.class);

		when(t.getByIndex(1)).thenCallRealMethod();

		when(t.getY()).thenReturn(BigInteger.valueOf(1));

		assertEquals(BigInteger.valueOf(1), t.getByIndex(1));

		verify(t).getByIndex(1);

		verify(t).getY();

		verifyNoMoreInteractions(t);
	}

	/**
	 * This test ensures, that the function {@link Tup3bigiR#getByIndex(int)}
	 * returns the z component for the index 2.
	 */
	@Test
	void getByIndex_ZTest()
	{
		Tup3bigiR t = mock(Tup3bigiR.class);

		when(t.getByIndex(2)).thenCallRealMethod();

		when(t.getZ()).thenReturn(BigInteger.valueOf(1));

		assertEquals(BigInteger.valueOf(1), t.getByIndex(2));

		verify(t).getByIndex(2);

		verify(t).getZ();

		verifyNoMoreInteractions(t);
	}

	/**
	 * This test ensures, that the function {@link Tup3bigiR#isZero()} returns
	 * true, if all of the components are exactly zero.
	 */
	@Test
	void isZero_ZeroTest()
	{
		Tup3bigiR t = mock(Tup3bigiR.class);

		when(t.isZero()).thenCallRealMethod();

		when(t.getX()).thenReturn(BigInteger.valueOf(0));
		when(t.getY()).thenReturn(BigInteger.valueOf(0));
		when(t.getZ()).thenReturn(BigInteger.valueOf(0));

		assertEquals(true, t.isZero());

		verify(t).isZero();

		verify(t).getX();
		verify(t).getY();
		verify(t).getZ();

		verifyNoMoreInteractions(t);
	}

	/**
	 * This test ensures, that the function {@link Tup3bigiR#isZero()} returns
	 * false, if the x component is not zero.
	 */
	@Test
	void isZero_Fail_XTest()
	{
		Tup3bigiR t = mock(Tup3bigiR.class);

		when(t.isZero()).thenCallRealMethod();

		when(t.getX()).thenReturn(BigInteger.valueOf(1));

		assertEquals(false, t.isZero());

		verify(t).isZero();

		verify(t).getX();

		verifyNoMoreInteractions(t);
	}

	/**
	 * This test ensures, that the function {@link Tup3bigiR#isZero()} returns
	 * false, if the y component is not zero.
	 */
	@Test
	void isZero_Fail_YTest()
	{
		Tup3bigiR t = mock(Tup3bigiR.class);

		when(t.isZero()).thenCallRealMethod();

		when(t.getX()).thenReturn(BigInteger.valueOf(0));
		when(t.getY()).thenReturn(BigInteger.valueOf(1));

		assertEquals(false, t.isZero());

		verify(t).isZero();

		verify(t).getX();
		verify(t).getY();

		verifyNoMoreInteractions(t);
	}

	/**
	 * This test ensures, that the function {@link Tup3bigiR#isZero()} returns
	 * false, if the z component is not zero.
	 */
	@Test
	void isZero_Fail_ZTest()
	{
		Tup3bigiR t = mock(Tup3bigiR.class);

		when(t.isZero()).thenCallRealMethod();

		when(t.getX()).thenReturn(BigInteger.valueOf(0));
		when(t.getY()).thenReturn(BigInteger.valueOf(0));
		when(t.getZ()).thenReturn(BigInteger.valueOf(1));

		assertEquals(false, t.isZero());

		verify(t).isZero();

		verify(t).getX();
		verify(t).getY();
		verify(t).getZ();

		verifyNoMoreInteractions(t);
	}

	/**
	 * This test ensures, that the function {@link Tup3bigiR#isZero(BigInteger)} returns
	 * true, if all components are exactly zero.
	 */
	@Test
	void isZeroWithTolerance_ZeroTest()
	{
		Tup3bigiR t = mock(Tup3bigiR.class);

		when(t.isZero(BigInteger.valueOf(2))).thenCallRealMethod();

		when(t.getX()).thenReturn(BigInteger.valueOf(0));
		when(t.getY()).thenReturn(BigInteger.valueOf(0));
		when(t.getZ()).thenReturn(BigInteger.valueOf(0));

		assertEquals(true, t.isZero(BigInteger.valueOf(2)));

		verify(t).isZero(BigInteger.valueOf(2));

		verify(t).getX();
		verify(t).getY();
		verify(t).getZ();

		verifyNoMoreInteractions(t);
	}

	/**
	 * This test ensures, that the function {@link Tup3bigiR#isZero(BigInteger)} returns
	 * true, if all components are at the positive extreme point that is the
	 * inclusive tolerance parameter.
	 */
	@Test
	void isZeroWithTolerance_Extreme_PositiveTest()
	{
		Tup3bigiR t = mock(Tup3bigiR.class);

		when(t.isZero(BigInteger.valueOf(2))).thenCallRealMethod();

		when(t.getX()).thenReturn(BigInteger.valueOf(2));
		when(t.getY()).thenReturn(BigInteger.valueOf(2));
		when(t.getZ()).thenReturn(BigInteger.valueOf(2));

		assertEquals(true, t.isZero(BigInteger.valueOf(2)));

		verify(t).isZero(BigInteger.valueOf(2));

		verify(t).getX();
		verify(t).getY();
		verify(t).getZ();

		verifyNoMoreInteractions(t);
	}

	/**
	 * This test ensures, that the function {@link Tup3bigiR#isZero(BigInteger)} returns
	 * true, if all components are at the negative extreme point that is the
	 * inclusive tolerance parameter.
	 */
	@Test
	void isZeroWithTolerance_Extreme_NegativeTest()
	{
		Tup3bigiR t = mock(Tup3bigiR.class);

		when(t.isZero(BigInteger.valueOf(2))).thenCallRealMethod();

		when(t.getX()).thenReturn(BigInteger.valueOf(-2));
		when(t.getY()).thenReturn(BigInteger.valueOf(-2));
		when(t.getZ()).thenReturn(BigInteger.valueOf(-2));

		assertEquals(true, t.isZero(BigInteger.valueOf(2)));

		verify(t).isZero(BigInteger.valueOf(2));

		verify(t).getX();
		verify(t).getY();
		verify(t).getZ();

		verifyNoMoreInteractions(t);
	}

	/**
	 * This test ensures, that the function {@link Tup3bigiR#isZero(BigInteger)} returns
	 * false, if the x component exceeds the positive extreme point that is the
	 * inclusive tolerance parameter.
	 */
	@Test
	void isZeroWithTolerance_Fail_X_PositiveTest()
	{
		Tup3bigiR t = mock(Tup3bigiR.class);

		when(t.isZero(BigInteger.valueOf(2))).thenCallRealMethod();

		when(t.getX()).thenReturn(BigInteger.valueOf(3));

		assertEquals(false, t.isZero(BigInteger.valueOf(2)));

		verify(t).isZero(BigInteger.valueOf(2));

		verify(t).getX();

		verifyNoMoreInteractions(t);
	}

	/**
	 * This test ensures, that the function {@link Tup3bigiR#isZero(BigInteger)} returns
	 * false, if the x component exceeds the negative extreme point that is the
	 * inclusive tolerance parameter.
	 */
	@Test
	void isZeroWithTolerance_Fail_X_NegativeTest()
	{
		Tup3bigiR t = mock(Tup3bigiR.class);

		when(t.isZero(BigInteger.valueOf(2))).thenCallRealMethod();

		when(t.getX()).thenReturn(BigInteger.valueOf(-3));

		assertEquals(false, t.isZero(BigInteger.valueOf(2)));

		verify(t).isZero(BigInteger.valueOf(2));

		verify(t).getX();

		verifyNoMoreInteractions(t);
	}

	/**
	 * This test ensures, that the function {@link Tup3bigiR#isZero(BigInteger)} returns
	 * false, if the y component exceeds the positive extreme point that is the
	 * inclusive tolerance parameter.
	 */
	@Test
	void isZeroWithTolerance_Fail_Y_PositiveTest()
	{
		Tup3bigiR t = mock(Tup3bigiR.class);

		when(t.isZero((BigInteger.valueOf(2)))).thenCallRealMethod();

		when(t.getX()).thenReturn(BigInteger.valueOf(0));
		when(t.getY()).thenReturn(BigInteger.valueOf(3));

		assertEquals(false, t.isZero(BigInteger.valueOf(2)));

		verify(t).isZero(BigInteger.valueOf(2));

		verify(t).getX();
		verify(t).getY();

		verifyNoMoreInteractions(t);
	}

	/**
	 * This test ensures, that the function {@link Tup3bigiR#isZero(BigInteger)} returns
	 * false, if the y component exceeds the positive extreme point that is the
	 * inclusive tolerance parameter.
	 */
	@Test
	void isZeroWithTolerance_Fail_Y_NegativeTest()
	{
		Tup3bigiR t = mock(Tup3bigiR.class);

		when(t.isZero(BigInteger.valueOf(2))).thenCallRealMethod();

		when(t.getX()).thenReturn(BigInteger.valueOf(0));
		when(t.getY()).thenReturn(BigInteger.valueOf(-3));

		assertEquals(false, t.isZero(BigInteger.valueOf(2)));

		verify(t).isZero(BigInteger.valueOf(2));

		verify(t).getX();
		verify(t).getY();

		verifyNoMoreInteractions(t);
	}

	/**
	 * This test ensures, that the function {@link Tup3bigiR#isZero(BigInteger)} returns
	 * false, if the z component exceeds the positive extreme point that is the
	 * inclusive tolerance parameter.
	 */
	@Test
	void isZeroWithTolerance_Fail_Z_PositiveTest()
	{
		Tup3bigiR t = mock(Tup3bigiR.class);

		when(t.isZero(BigInteger.valueOf(2))).thenCallRealMethod();

		when(t.getX()).thenReturn(BigInteger.valueOf(0));
		when(t.getY()).thenReturn(BigInteger.valueOf(0));
		when(t.getZ()).thenReturn(BigInteger.valueOf(3));

		assertEquals(false, t.isZero(BigInteger.valueOf(2)));

		verify(t).isZero(BigInteger.valueOf(2));

		verify(t).getX();
		verify(t).getY();
		verify(t).getZ();

		verifyNoMoreInteractions(t);
	}

	/**
	 * This test ensures, that the function {@link Tup3bigiR#isZero(BigInteger)} returns
	 * false, if the z component exceeds the positive extreme point that is the
	 * inclusive tolerance parameter.
	 */
	@Test
	void isZeroWithTolerance_Fail_Z_NegativeTest()
	{
		Tup3bigiR t = mock(Tup3bigiR.class);

		when(t.isZero(BigInteger.valueOf(2))).thenCallRealMethod();

		when(t.getX()).thenReturn(BigInteger.valueOf(0));
		when(t.getY()).thenReturn(BigInteger.valueOf(0));
		when(t.getZ()).thenReturn(BigInteger.valueOf(-3));

		assertEquals(false, t.isZero(BigInteger.valueOf(2)));

		verify(t).isZero(BigInteger.valueOf(2));

		verify(t).getX();
		verify(t).getY();
		verify(t).getZ();

		verifyNoMoreInteractions(t);
	}

	/**
	 * This test ensures, that the function {@link Tup3bigiR#toArray(BigInteger[])}
	 * returns the given array with the components in the right order.
	 */
	@Test
	void toArrayWithExtractParamTest()
	{
		Tup3bigiR t = mock(Tup3bigiR.class);

		BigInteger[] array = new BigInteger[3];

		when(t.toArray(array)).thenCallRealMethod();

		when(t.getX()).thenReturn(BigInteger.valueOf(1));
		when(t.getY()).thenReturn(BigInteger.valueOf(2));
		when(t.getZ()).thenReturn(BigInteger.valueOf(3));

		assertSame(array, t.toArray(array));
		assertArrayEquals(new BigInteger[] {BigInteger.valueOf(1), BigInteger.valueOf(2), BigInteger.valueOf(3)}, array);

		verify(t).toArray(array);

		verify(t).getX();
		verify(t).getY();
		verify(t).getZ();

		verifyNoMoreInteractions(t);
	}
}