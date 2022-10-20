package org.barghos.tuple.api.test.t3;

import static org.junit.jupiter.api.Assertions.*;

import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;

import org.barghos.tuple.api.t3.Tup3sR;
import org.barghos.tuple.api.tn.TupsR;

/**
 * This class provides component tests for the interface {@link Tup3sR}.
 * 
 * @author picatrix1899
 */
class Tup3sRTest
{

	/**
	 * This test ensures, that the interface extends the interface
	 * {@link TupsR}.
	 */
	@Test
	void inheritance_TupRTest()
	{
		assertTrue(TupsR.class.isAssignableFrom(Tup3sR.class));
	}

	/**
	 * this test ensures, that the function {@link Tup3sR#getDimensions()}
	 * always returns 3 and does not make any calls.
	 */
	@Test
	void getDimensionsTest()
	{
		Tup3sR t = mock(Tup3sR.class);

		when(t.getDimensions()).thenCallRealMethod();

		assertEquals(3, t.getDimensions());

		verify(t).getDimensions();

		verifyNoMoreInteractions(t);
	}

	/**
	 * This test ensures, that the function {@link Tup3sR#getByIndex(int)}
	 * returns the x component for the index 0.
	 */
	@Test
	void getByIndex_XTest()
	{
		Tup3sR t = mock(Tup3sR.class);

		when(t.getByIndex(0)).thenCallRealMethod();

		when(t.getX()).thenReturn((short)1);

		assertEquals((short)1, t.getByIndex(0));

		verify(t).getByIndex(0);

		verify(t).getX();

		verifyNoMoreInteractions(t);
	}

	/**
	 * This test ensures, that the function {@link Tup3sR#getByIndex(int)}
	 * returns the y component for the index 1.
	 */
	@Test
	void getByIndex_YTest()
	{
		Tup3sR t = mock(Tup3sR.class);

		when(t.getByIndex(1)).thenCallRealMethod();

		when(t.getY()).thenReturn((short)1);

		assertEquals((short)1, t.getByIndex(1));

		verify(t).getByIndex(1);

		verify(t).getY();

		verifyNoMoreInteractions(t);
	}

	/**
	 * This test ensures, that the function {@link Tup3sR#getByIndex(int)}
	 * returns the z component for the index 2.
	 */
	@Test
	void getByIndex_ZTest()
	{
		Tup3sR t = mock(Tup3sR.class);

		when(t.getByIndex(2)).thenCallRealMethod();

		when(t.getZ()).thenReturn((short)1);

		assertEquals((short)1, t.getByIndex(2));

		verify(t).getByIndex(2);

		verify(t).getZ();

		verifyNoMoreInteractions(t);
	}

	/**
	 * This test ensures, that the function {@link Tup3sR#isZero()} returns
	 * true, if all of the components are exactly zero.
	 */
	@Test
	void isZero_ZeroTest()
	{
		Tup3sR t = mock(Tup3sR.class);

		when(t.isZero()).thenCallRealMethod();

		when(t.getX()).thenReturn((short)0);
		when(t.getY()).thenReturn((short)0);
		when(t.getZ()).thenReturn((short)0);

		assertEquals(true, t.isZero());

		verify(t).isZero();

		verify(t).getX();
		verify(t).getY();
		verify(t).getZ();

		verifyNoMoreInteractions(t);
	}

	/**
	 * This test ensures, that the function {@link Tup3sR#isZero()} returns
	 * false, if the x component is not zero.
	 */
	@Test
	void isZero_Fail_XTest()
	{
		Tup3sR t = mock(Tup3sR.class);

		when(t.isZero()).thenCallRealMethod();

		when(t.getX()).thenReturn((short)1);

		assertEquals(false, t.isZero());

		verify(t).isZero();

		verify(t).getX();

		verifyNoMoreInteractions(t);
	}

	/**
	 * This test ensures, that the function {@link Tup3sR#isZero()} returns
	 * false, if the y component is not zero.
	 */
	@Test
	void isZero_Fail_YTest()
	{
		Tup3sR t = mock(Tup3sR.class);

		when(t.isZero()).thenCallRealMethod();

		when(t.getX()).thenReturn((short)0);
		when(t.getY()).thenReturn((short)1);

		assertEquals(false, t.isZero());

		verify(t).isZero();

		verify(t).getX();
		verify(t).getY();

		verifyNoMoreInteractions(t);
	}

	/**
	 * This test ensures, that the function {@link Tup3sR#isZero()} returns
	 * false, if the z component is not zero.
	 */
	@Test
	void isZero_Fail_ZTest()
	{
		Tup3sR t = mock(Tup3sR.class);

		when(t.isZero()).thenCallRealMethod();

		when(t.getX()).thenReturn((short)0);
		when(t.getY()).thenReturn((short)0);
		when(t.getZ()).thenReturn((short)1);

		assertEquals(false, t.isZero());

		verify(t).isZero();

		verify(t).getX();
		verify(t).getY();
		verify(t).getZ();

		verifyNoMoreInteractions(t);
	}

	/**
	 * This test ensures, that the function {@link Tup3sR#isZero(short)} returns
	 * true, if all components are exactly zero.
	 */
	@Test
	void isZeroWithTolerance_ZeroTest()
	{
		Tup3sR t = mock(Tup3sR.class);

		when(t.isZero((short)2)).thenCallRealMethod();

		when(t.getX()).thenReturn((short)0);
		when(t.getY()).thenReturn((short)0);
		when(t.getZ()).thenReturn((short)0);

		assertEquals(true, t.isZero((short)2));

		verify(t).isZero((short)2);

		verify(t).getX();
		verify(t).getY();
		verify(t).getZ();

		verifyNoMoreInteractions(t);
	}

	/**
	 * This test ensures, that the function {@link Tup3sR#isZero(short)} returns
	 * true, if all components are at the positive extreme point that is the
	 * inclusive tolerance parameter.
	 */
	@Test
	void isZeroWithTolerance_Extreme_PositiveTest()
	{
		Tup3sR t = mock(Tup3sR.class);

		when(t.isZero((short)2)).thenCallRealMethod();

		when(t.getX()).thenReturn((short)2);
		when(t.getY()).thenReturn((short)2);
		when(t.getZ()).thenReturn((short)2);

		assertEquals(true, t.isZero((short)2));

		verify(t).isZero((short)2);

		verify(t).getX();
		verify(t).getY();
		verify(t).getZ();

		verifyNoMoreInteractions(t);
	}

	/**
	 * This test ensures, that the function {@link Tup3sR#isZero(short)} returns
	 * true, if all components are at the negative extreme point that is the
	 * inclusive tolerance parameter.
	 */
	@Test
	void isZeroWithTolerance_Extreme_NegativeTest()
	{
		Tup3sR t = mock(Tup3sR.class);

		when(t.isZero((short)2)).thenCallRealMethod();

		when(t.getX()).thenReturn((short)-2);
		when(t.getY()).thenReturn((short)-2);
		when(t.getZ()).thenReturn((short)-2);

		assertEquals(true, t.isZero((short)2));

		verify(t).isZero((short)2);

		verify(t).getX();
		verify(t).getY();
		verify(t).getZ();

		verifyNoMoreInteractions(t);
	}

	/**
	 * This test ensures, that the function {@link Tup3sR#isZero(short)} returns
	 * false, if the x component exceeds the positive extreme point that is the
	 * inclusive tolerance parameter.
	 */
	@Test
	void isZeroWithTolerance_Fail_X_PositiveTest()
	{
		Tup3sR t = mock(Tup3sR.class);

		when(t.isZero((short)2)).thenCallRealMethod();

		when(t.getX()).thenReturn((short)3);

		assertEquals(false, t.isZero((short)2));

		verify(t).isZero((short)2);

		verify(t).getX();

		verifyNoMoreInteractions(t);
	}

	/**
	 * This test ensures, that the function {@link Tup3sR#isZero(short)} returns
	 * false, if the x component exceeds the negative extreme point that is the
	 * inclusive tolerance parameter.
	 */
	@Test
	void isZeroWithTolerance_Fail_X_NegativeTest()
	{
		Tup3sR t = mock(Tup3sR.class);

		when(t.isZero((short)2)).thenCallRealMethod();

		when(t.getX()).thenReturn((short)-3);

		assertEquals(false, t.isZero((short)2));

		verify(t).isZero((short)2);

		verify(t).getX();

		verifyNoMoreInteractions(t);
	}

	/**
	 * This test ensures, that the function {@link Tup3sR#isZero(short)} returns
	 * false, if the y component exceeds the positive extreme point that is the
	 * inclusive tolerance parameter.
	 */
	@Test
	void isZeroWithTolerance_Fail_Y_PositiveTest()
	{
		Tup3sR t = mock(Tup3sR.class);

		when(t.isZero((short)2)).thenCallRealMethod();

		when(t.getX()).thenReturn((short)0);
		when(t.getY()).thenReturn((short)3);

		assertEquals(false, t.isZero((short)2));

		verify(t).isZero((short)2);

		verify(t).getX();
		verify(t).getY();

		verifyNoMoreInteractions(t);
	}

	/**
	 * This test ensures, that the function {@link Tup3sR#isZero(short)} returns
	 * false, if the y component exceeds the positive extreme point that is the
	 * inclusive tolerance parameter.
	 */
	@Test
	void isZeroWithTolerance_Fail_Y_NegativeTest()
	{
		Tup3sR t = mock(Tup3sR.class);

		when(t.isZero((short)2)).thenCallRealMethod();

		when(t.getX()).thenReturn((short)0);
		when(t.getY()).thenReturn((short)-3);

		assertEquals(false, t.isZero((short)2));

		verify(t).isZero((short)2);

		verify(t).getX();
		verify(t).getY();

		verifyNoMoreInteractions(t);
	}

	/**
	 * This test ensures, that the function {@link Tup3sR#isZero(short)} returns
	 * false, if the z component exceeds the positive extreme point that is the
	 * inclusive tolerance parameter.
	 */
	@Test
	void isZeroWithTolerance_Fail_Z_PositiveTest()
	{
		Tup3sR t = mock(Tup3sR.class);

		when(t.isZero((short)2)).thenCallRealMethod();

		when(t.getX()).thenReturn((short)0);
		when(t.getY()).thenReturn((short)0);
		when(t.getZ()).thenReturn((short)3);

		assertEquals(false, t.isZero((short)2));

		verify(t).isZero((short)2);

		verify(t).getX();
		verify(t).getY();
		verify(t).getZ();

		verifyNoMoreInteractions(t);
	}

	/**
	 * This test ensures, that the function {@link Tup3sR#isZero(short)} returns
	 * false, if the z component exceeds the positive extreme point that is the
	 * inclusive tolerance parameter.
	 */
	@Test
	void isZeroWithTolerance_Fail_Z_NegativeTest()
	{
		Tup3sR t = mock(Tup3sR.class);

		when(t.isZero((short)2)).thenCallRealMethod();

		when(t.getX()).thenReturn((short)0);
		when(t.getY()).thenReturn((short)0);
		when(t.getZ()).thenReturn((short)-3);

		assertEquals(false, t.isZero((short)2));

		verify(t).isZero((short)2);

		verify(t).getX();
		verify(t).getY();
		verify(t).getZ();

		verifyNoMoreInteractions(t);
	}

	/**
	 * This test ensures, that the function {@link Tup3sR#toArray(short[])}
	 * returns the given array with the components in the right order.
	 */
	@Test
	void toArrayWithExtractParamTest()
	{
		Tup3sR t = mock(Tup3sR.class);

		short[] array = new short[3];

		when(t.toArray(array)).thenCallRealMethod();

		when(t.getX()).thenReturn((short)1);
		when(t.getY()).thenReturn((short)2);
		when(t.getZ()).thenReturn((short)3);

		assertSame(array, t.toArray(array));
		assertArrayEquals(new short[] {(short)1, (short)2, (short)3}, array);

		verify(t).toArray(array);

		verify(t).getX();
		verify(t).getY();
		verify(t).getZ();

		verifyNoMoreInteractions(t);
	}
}