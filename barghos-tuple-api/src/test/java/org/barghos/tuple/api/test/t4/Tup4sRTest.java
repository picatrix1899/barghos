package org.barghos.tuple.api.test.t4;

import static org.junit.jupiter.api.Assertions.*;

import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;

import org.barghos.tuple.api.t4.Tup4sR;
import org.barghos.tuple.api.tn.TupsR;

/**
 * This class provides component tests for the interface {@link Tup4sR}.
 * 
 * @author picatrix1899
 */
class Tup4sRTest
{

	/**
	 * This test ensures, that the interface extends the interface
	 * {@link TupsR}.
	 */
	@Test
	void inheritance_TupRTest()
	{
		assertTrue(TupsR.class.isAssignableFrom(Tup4sR.class));
	}

	/**
	 * this test ensures, that the function {@link Tup4sR#getDimensions()}
	 * always returns 4 and does not make any calls.
	 */
	@Test
	void getDimensionsTest()
	{
		Tup4sR t = mock(Tup4sR.class);

		when(t.getDimensions()).thenCallRealMethod();

		assertEquals(4, t.getDimensions());

		verify(t).getDimensions();

		verifyNoMoreInteractions(t);
	}

	/**
	 * This test ensures, that the function {@link Tup4sR#getByIndex(int)}
	 * returns the x component for the index 0.
	 */
	@Test
	void getByIndex_XTest()
	{
		Tup4sR t = mock(Tup4sR.class);

		when(t.getByIndex(0)).thenCallRealMethod();

		when(t.getX()).thenReturn((short)1);

		assertEquals((short)1, t.getByIndex(0));

		verify(t).getByIndex(0);

		verify(t).getX();

		verifyNoMoreInteractions(t);
	}

	/**
	 * This test ensures, that the function {@link Tup4sR#getByIndex(int)}
	 * returns the y component for the index 1.
	 */
	@Test
	void getByIndex_YTest()
	{
		Tup4sR t = mock(Tup4sR.class);

		when(t.getByIndex(1)).thenCallRealMethod();

		when(t.getY()).thenReturn((short)1);

		assertEquals((short)1, t.getByIndex(1));

		verify(t).getByIndex(1);

		verify(t).getY();

		verifyNoMoreInteractions(t);
	}

	/**
	 * This test ensures, that the function {@link Tup4sR#getByIndex(int)}
	 * returns the z component for the index 2.
	 */
	@Test
	void getByIndex_ZTest()
	{
		Tup4sR t = mock(Tup4sR.class);

		when(t.getByIndex(2)).thenCallRealMethod();

		when(t.getZ()).thenReturn((short)1);

		assertEquals((short)1, t.getByIndex(2));

		verify(t).getByIndex(2);

		verify(t).getZ();

		verifyNoMoreInteractions(t);
	}

	/**
	 * This test ensures, that the function {@link Tup4sR#getByIndex(int)}
	 * returns the w component for the index 3.
	 */
	@Test
	void getByIndex_WTest()
	{
		Tup4sR t = mock(Tup4sR.class);

		when(t.getByIndex(3)).thenCallRealMethod();

		when(t.getW()).thenReturn((short)1);

		assertEquals((short)1, t.getByIndex(3));

		verify(t).getByIndex(3);

		verify(t).getW();

		verifyNoMoreInteractions(t);
	}

	/**
	 * This test ensures, that the function {@link Tup4sR#isZero()} returns
	 * true, if all of the components are exactly zero.
	 */
	@Test
	void isZero_ZeroTest()
	{
		Tup4sR t = mock(Tup4sR.class);

		when(t.isZero()).thenCallRealMethod();

		when(t.getX()).thenReturn((short)0);
		when(t.getY()).thenReturn((short)0);
		when(t.getZ()).thenReturn((short)0);
		when(t.getW()).thenReturn((short)0);

		assertEquals(true, t.isZero());

		verify(t).isZero();

		verify(t).getX();
		verify(t).getY();
		verify(t).getZ();
		verify(t).getW();

		verifyNoMoreInteractions(t);
	}

	/**
	 * This test ensures, that the function {@link Tup4sR#isZero()} returns
	 * false, if the x component is not zero.
	 */
	@Test
	void isZero_Fail_XTest()
	{
		Tup4sR t = mock(Tup4sR.class);

		when(t.isZero()).thenCallRealMethod();

		when(t.getX()).thenReturn((short)1);

		assertEquals(false, t.isZero());

		verify(t).isZero();

		verify(t).getX();

		verifyNoMoreInteractions(t);
	}

	/**
	 * This test ensures, that the function {@link Tup4sR#isZero()} returns
	 * false, if the y component is not zero.
	 */
	@Test
	void isZero_Fail_YTest()
	{
		Tup4sR t = mock(Tup4sR.class);

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
	 * This test ensures, that the function {@link Tup4sR#isZero()} returns
	 * false, if the z component is not zero.
	 */
	@Test
	void isZero_Fail_ZTest()
	{
		Tup4sR t = mock(Tup4sR.class);

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
	 * This test ensures, that the function {@link Tup4sR#isZero()} returns
	 * false, if the w component is not zero.
	 */
	@Test
	void isZero_Fail_WTest()
	{
		Tup4sR t = mock(Tup4sR.class);

		when(t.isZero()).thenCallRealMethod();

		when(t.getX()).thenReturn((short)0);
		when(t.getY()).thenReturn((short)0);
		when(t.getZ()).thenReturn((short)0);
		when(t.getW()).thenReturn((short)1);

		assertEquals(false, t.isZero());

		verify(t).isZero();

		verify(t).getX();
		verify(t).getY();
		verify(t).getZ();
		verify(t).getW();

		verifyNoMoreInteractions(t);
	}

	/**
	 * This test ensures, that the function {@link Tup4sR#isZero(short)} returns
	 * true, if all components are exactly zero.
	 */
	@Test
	void isZeroWithTolerance_ZeroTest()
	{
		Tup4sR t = mock(Tup4sR.class);

		when(t.isZero((short)2)).thenCallRealMethod();

		when(t.getX()).thenReturn((short)0);
		when(t.getY()).thenReturn((short)0);
		when(t.getZ()).thenReturn((short)0);
		when(t.getW()).thenReturn((short)0);

		assertEquals(true, t.isZero((short)2));

		verify(t).isZero((short)2);

		verify(t).getX();
		verify(t).getY();
		verify(t).getZ();
		verify(t).getW();

		verifyNoMoreInteractions(t);
	}

	/**
	 * This test ensures, that the function {@link Tup4sR#isZero(short)} returns
	 * true, if all components are at the positive extreme point that is the
	 * inclusive tolerance parameter.
	 */
	@Test
	void isZeroWithTolerance_Extreme_PositiveTest()
	{
		Tup4sR t = mock(Tup4sR.class);

		when(t.isZero((short)2)).thenCallRealMethod();

		when(t.getX()).thenReturn((short)2);
		when(t.getY()).thenReturn((short)2);
		when(t.getZ()).thenReturn((short)2);
		when(t.getW()).thenReturn((short)2);

		assertEquals(true, t.isZero((short)2));

		verify(t).isZero((short)2);

		verify(t).getX();
		verify(t).getY();
		verify(t).getZ();
		verify(t).getW();

		verifyNoMoreInteractions(t);
	}

	/**
	 * This test ensures, that the function {@link Tup4sR#isZero(short)} returns
	 * true, if all components are at the negative extreme point that is the
	 * inclusive tolerance parameter.
	 */
	@Test
	void isZeroWithTolerance_Extreme_NegativeTest()
	{
		Tup4sR t = mock(Tup4sR.class);

		when(t.isZero((short)2)).thenCallRealMethod();

		when(t.getX()).thenReturn((short)-2);
		when(t.getY()).thenReturn((short)-2);
		when(t.getZ()).thenReturn((short)-2);
		when(t.getW()).thenReturn((short)-2);

		assertEquals(true, t.isZero((short)2));

		verify(t).isZero((short)2);

		verify(t).getX();
		verify(t).getY();
		verify(t).getZ();
		verify(t).getW();

		verifyNoMoreInteractions(t);
	}

	/**
	 * This test ensures, that the function {@link Tup4sR#isZero(short)} returns
	 * false, if the x component exceeds the positive extreme point that is the
	 * inclusive tolerance parameter.
	 */
	@Test
	void isZeroWithTolerance_Fail_X_PositiveTest()
	{
		Tup4sR t = mock(Tup4sR.class);

		when(t.isZero((short)2)).thenCallRealMethod();

		when(t.getX()).thenReturn((short)3);

		assertEquals(false, t.isZero((short)2));

		verify(t).isZero((short)2);

		verify(t).getX();

		verifyNoMoreInteractions(t);
	}

	/**
	 * This test ensures, that the function {@link Tup4sR#isZero(short)} returns
	 * false, if the x component exceeds the negative extreme point that is the
	 * inclusive tolerance parameter.
	 */
	@Test
	void isZeroWithTolerance_Fail_X_NegativeTest()
	{
		Tup4sR t = mock(Tup4sR.class);

		when(t.isZero((short)2)).thenCallRealMethod();

		when(t.getX()).thenReturn((short)-3);

		assertEquals(false, t.isZero((short)2));

		verify(t).isZero((short)2);

		verify(t).getX();

		verifyNoMoreInteractions(t);
	}

	/**
	 * This test ensures, that the function {@link Tup4sR#isZero(short)} returns
	 * false, if the y component exceeds the positive extreme point that is the
	 * inclusive tolerance parameter.
	 */
	@Test
	void isZeroWithTolerance_Fail_Y_PositiveTest()
	{
		Tup4sR t = mock(Tup4sR.class);

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
	 * This test ensures, that the function {@link Tup4sR#isZero(short)} returns
	 * false, if the y component exceeds the positive extreme point that is the
	 * inclusive tolerance parameter.
	 */
	@Test
	void isZeroWithTolerance_Fail_Y_NegativeTest()
	{
		Tup4sR t = mock(Tup4sR.class);

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
	 * This test ensures, that the function {@link Tup4sR#isZero(short)} returns
	 * false, if the z component exceeds the positive extreme point that is the
	 * inclusive tolerance parameter.
	 */
	@Test
	void isZeroWithTolerance_Fail_Z_PositiveTest()
	{
		Tup4sR t = mock(Tup4sR.class);

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
	 * This test ensures, that the function {@link Tup4sR#isZero(short)} returns
	 * false, if the z component exceeds the positive extreme point that is the
	 * inclusive tolerance parameter.
	 */
	@Test
	void isZeroWithTolerance_Fail_Z_NegativeTest()
	{
		Tup4sR t = mock(Tup4sR.class);

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
	 * This test ensures, that the function {@link Tup4sR#isZero(short)} returns
	 * false, if the w component exceeds the positive extreme point that is the
	 * inclusive tolerance parameter.
	 */
	@Test
	void isZeroWithTolerance_Fail_W_PositiveTest()
	{
		Tup4sR t = mock(Tup4sR.class);

		when(t.isZero((short)2)).thenCallRealMethod();

		when(t.getX()).thenReturn((short)0);
		when(t.getY()).thenReturn((short)0);
		when(t.getZ()).thenReturn((short)0);
		when(t.getW()).thenReturn((short)3);

		assertEquals(false, t.isZero((short)2));

		verify(t).isZero((short)2);

		verify(t).getX();
		verify(t).getY();
		verify(t).getZ();
		verify(t).getW();

		verifyNoMoreInteractions(t);
	}

	/**
	 * This test ensures, that the function {@link Tup4sR#isZero(short)} returns
	 * false, if the w component exceeds the positive extreme point that is the
	 * inclusive tolerance parameter.
	 */
	@Test
	void isZeroWithTolerance_Fail_W_NegativeTest()
	{
		Tup4sR t = mock(Tup4sR.class);

		when(t.isZero((short)2)).thenCallRealMethod();

		when(t.getX()).thenReturn((short)0);
		when(t.getY()).thenReturn((short)0);
		when(t.getZ()).thenReturn((short)0);
		when(t.getW()).thenReturn((short)-3);

		assertEquals(false, t.isZero((short)2));

		verify(t).isZero((short)2);

		verify(t).getX();
		verify(t).getY();
		verify(t).getZ();
		verify(t).getW();

		verifyNoMoreInteractions(t);
	}

	/**
	 * This test ensures, that the function {@link Tup4sR#toArray(short[])}
	 * returns the given array with the components in the right order.
	 */
	@Test
	void toArrayWithExtractionParamTest()
	{
		Tup4sR t = mock(Tup4sR.class);

		short[] array = new short[4];

		when(t.toArray(array)).thenCallRealMethod();

		when(t.getX()).thenReturn((short)1);
		when(t.getY()).thenReturn((short)2);
		when(t.getZ()).thenReturn((short)3);
		when(t.getW()).thenReturn((short)4);

		assertSame(array, t.toArray(array));
		assertArrayEquals(new short[] {(short)1, (short)2, (short)3, (short)4}, array);

		verify(t).toArray(array);

		verify(t).getX();
		verify(t).getY();
		verify(t).getZ();
		verify(t).getW();

		verifyNoMoreInteractions(t);
	}
}