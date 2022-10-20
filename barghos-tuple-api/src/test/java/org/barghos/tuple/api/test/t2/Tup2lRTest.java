package org.barghos.tuple.api.test.t2;

import static org.junit.jupiter.api.Assertions.*;

import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;

import org.barghos.tuple.api.t2.Tup2lR;
import org.barghos.tuple.api.tn.TuplR;

/**
 * This class provides component tests for the interface {@link Tup2lR}.
 * 
 * @author picatrix1899
 */
class Tup2lRTest
{

	/**
	 * This test ensures, that the interface extends the interface
	 * {@link TuplR}.
	 */
	@Test
	void inheritance_TupRTest()
	{
		assertTrue(TuplR.class.isAssignableFrom(Tup2lR.class));
	}

	/**
	 * this test ensures, that the function {@link Tup2lR#getDimensions()}
	 * always returns 2 and does not make any calls.
	 */
	@Test
	void getDimensionsTest()
	{
		Tup2lR t = mock(Tup2lR.class);

		when(t.getDimensions()).thenCallRealMethod();

		assertEquals(2, t.getDimensions());

		verify(t).getDimensions();

		verifyNoMoreInteractions(t);
	}

	/**
	 * This test ensures, that the function {@link Tup2lR#getByIndex(int)}
	 * returns the x component for the index 0.
	 */
	@Test
	void getByIndex_XTest()
	{
		Tup2lR t = mock(Tup2lR.class);

		when(t.getByIndex(0)).thenCallRealMethod();

		when(t.getX()).thenReturn(1l);

		assertEquals(1, t.getByIndex(0));

		verify(t).getByIndex(0);

		verify(t).getX();

		verifyNoMoreInteractions(t);
	}

	/**
	 * This test ensures, that the function {@link Tup2lR#getByIndex(int)}
	 * returns the y component for the index 1.
	 */
	@Test
	void getByIndex_YTest()
	{
		Tup2lR t = mock(Tup2lR.class);

		when(t.getByIndex(1)).thenCallRealMethod();

		when(t.getY()).thenReturn(1l);

		assertEquals(1, t.getByIndex(1));

		verify(t).getByIndex(1);

		verify(t).getY();

		verifyNoMoreInteractions(t);
	}

	/**
	 * This test ensures, that the function {@link Tup2lR#isZero()} returns
	 * true, if all of the components are exactly zero.
	 */
	@Test
	void isZero_ZeroTest()
	{
		Tup2lR t = mock(Tup2lR.class);

		when(t.isZero()).thenCallRealMethod();

		when(t.getX()).thenReturn(0l);
		when(t.getY()).thenReturn(0l);

		assertEquals(true, t.isZero());

		verify(t).isZero();

		verify(t).getX();
		verify(t).getY();

		verifyNoMoreInteractions(t);
	}

	/**
	 * This test ensures, that the function {@link Tup2lR#isZero()} returns
	 * false, if the x component is not zero.
	 */
	@Test
	void isZero_Fail_XTest()
	{
		Tup2lR t = mock(Tup2lR.class);

		when(t.isZero()).thenCallRealMethod();

		when(t.getX()).thenReturn(1l);

		assertEquals(false, t.isZero());

		verify(t).isZero();

		verify(t).getX();

		verifyNoMoreInteractions(t);
	}

	/**
	 * This test ensures, that the function {@link Tup2lR#isZero()} returns
	 * false, if the y component is not zero.
	 */
	@Test
	void isZero_Fail_YTest()
	{
		Tup2lR t = mock(Tup2lR.class);

		when(t.isZero()).thenCallRealMethod();

		when(t.getX()).thenReturn(0l);
		when(t.getY()).thenReturn(1l);

		assertEquals(false, t.isZero());

		verify(t).isZero();

		verify(t).getX();
		verify(t).getY();

		verifyNoMoreInteractions(t);
	}

	/**
	 * This test ensures, that the function {@link Tup2lR#isZero(long)} returns
	 * true, if all components are exactly zero.
	 */
	@Test
	void isZeroWithTolerance_ZeroTest()
	{
		Tup2lR t = mock(Tup2lR.class);

		when(t.isZero(2l)).thenCallRealMethod();

		when(t.getX()).thenReturn(0l);
		when(t.getY()).thenReturn(0l);

		assertEquals(true, t.isZero(2l));

		verify(t).isZero(2l);

		verify(t).getX();
		verify(t).getY();

		verifyNoMoreInteractions(t);
	}

	/**
	 * This test ensures, that the function {@link Tup2lR#isZero(long)} returns
	 * true, if all components are at the positive extreme point that is the
	 * inclusive tolerance parameter.
	 */
	@Test
	void isZeroWithTolerance_Extreme_PositiveTest()
	{
		Tup2lR t = mock(Tup2lR.class);

		when(t.isZero(2l)).thenCallRealMethod();

		when(t.getX()).thenReturn(2l);
		when(t.getY()).thenReturn(2l);

		assertEquals(true, t.isZero(2l));

		verify(t).isZero(2l);

		verify(t).getX();
		verify(t).getY();

		verifyNoMoreInteractions(t);
	}

	/**
	 * This test ensures, that the function {@link Tup2lR#isZero(long)} returns
	 * true, if all components are at the negative extreme point that is the
	 * inclusive tolerance parameter.
	 */
	@Test
	void isZeroWithTolerance_Extreme_NegativeTest()
	{
		Tup2lR t = mock(Tup2lR.class);

		when(t.isZero(2l)).thenCallRealMethod();

		when(t.getX()).thenReturn(-2l);
		when(t.getY()).thenReturn(-2l);

		assertEquals(true, t.isZero(2l));

		verify(t).isZero(2l);

		verify(t).getX();
		verify(t).getY();

		verifyNoMoreInteractions(t);
	}

	/**
	 * This test ensures, that the function {@link Tup2lR#isZero(long)} returns
	 * false, if the x component exceeds the positive extreme point that is the
	 * inclusive tolerance parameter.
	 */
	@Test
	void isZeroWithTolerance_Fail_X_PositiveTest()
	{
		Tup2lR t = mock(Tup2lR.class);

		when(t.isZero(2l)).thenCallRealMethod();

		when(t.getX()).thenReturn(3l);

		assertEquals(false, t.isZero(2l));

		verify(t).isZero(2l);

		verify(t).getX();

		verifyNoMoreInteractions(t);
	}

	/**
	 * This test ensures, that the function {@link Tup2lR#isZero(long)} returns
	 * false, if the x component exceeds the negative extreme point that is the
	 * inclusive tolerance parameter.
	 */
	@Test
	void isZeroWithTolerance_Fail_X_NegativeTest()
	{
		Tup2lR t = mock(Tup2lR.class);

		when(t.isZero(2l)).thenCallRealMethod();

		when(t.getX()).thenReturn(-3l);

		assertEquals(false, t.isZero(2l));

		verify(t).isZero(2l);

		verify(t).getX();

		verifyNoMoreInteractions(t);
	}

	/**
	 * This test ensures, that the function {@link Tup2lR#isZero(long)} returns
	 * false, if the y component exceeds the positive extreme point that is the
	 * inclusive tolerance parameter.
	 */
	@Test
	void isZeroWithTolerance_Fail_Y_PositiveTest()
	{
		Tup2lR t = mock(Tup2lR.class);

		when(t.isZero(2l)).thenCallRealMethod();

		when(t.getX()).thenReturn(0l);
		when(t.getY()).thenReturn(3l);

		assertEquals(false, t.isZero(2l));

		verify(t).isZero(2l);

		verify(t).getX();
		verify(t).getY();

		verifyNoMoreInteractions(t);
	}

	/**
	 * This test ensures, that the function {@link Tup2lR#isZero(long)} returns
	 * false, if the y component exceeds the positive extreme point that is the
	 * inclusive tolerance parameter.
	 */
	@Test
	void isZeroWithTolerance_Fail_Y_NegativeTest()
	{
		Tup2lR t = mock(Tup2lR.class);

		when(t.isZero(2l)).thenCallRealMethod();

		when(t.getX()).thenReturn(0l);
		when(t.getY()).thenReturn(-3l);

		assertEquals(false, t.isZero(2l));

		verify(t).isZero(2l);

		verify(t).getX();
		verify(t).getY();

		verifyNoMoreInteractions(t);
	}

	/**
	 * This test ensures, that the function {@link Tup2lR#isZero(long)} throws an
	 * {@link IllegalArgumentException} if the tolerance parameter is below
	 * zero.
	 */
	@Test
	void isZeroWithTolerance_Error_BelowZeroToleranceTest()
	{
		Tup2lR t = mock(Tup2lR.class);

		when(t.isZero(-1l)).thenCallRealMethod();

		assertThrowsExactly(IllegalArgumentException.class, () -> t.isZero(-1l));

		verify(t).isZero(-1l);

		verifyNoMoreInteractions(t);
	}

	/**
	 * This test ensures, that the function {@link Tup2lR#toArray(long[])}
	 * returns the given array with the components in the right order.
	 */
	@Test
	void toArrayWithExtractionParamTest()
	{
		Tup2lR t = mock(Tup2lR.class);

		long[] array = new long[2];

		when(t.toArray(array)).thenCallRealMethod();

		when(t.getX()).thenReturn(1l);
		when(t.getY()).thenReturn(2l);

		assertSame(array, t.toArray(array));
		assertArrayEquals(new long[] {1l, 2l}, array);

		verify(t).toArray(array);

		verify(t).getX();
		verify(t).getY();

		verifyNoMoreInteractions(t);
	}
}