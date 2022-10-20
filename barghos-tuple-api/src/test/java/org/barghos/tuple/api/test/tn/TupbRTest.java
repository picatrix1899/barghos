package org.barghos.tuple.api.test.tn;

import static org.junit.jupiter.api.Assertions.*;

import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;

import org.barghos.tuple.api.tn.TupbR;

/**
 * This class provides component tests for the interface {@link TupbR}.
 * 
 * @author picatrix1899
 */
class TupbRTest
{

	/**
	 * This test ensures, that the function {@link TupbR#toArray()} calls the
	 * function {@link TupbR#toArray(byte[])} with a new array with the size
	 * equal to the number of dimensions of the tuple.
	 */
	@Test
	void toArrayTest()
	{
		TupbR t = mock(TupbR.class);
		
		byte[] array = new byte[2];
		
		when(t.toArray()).thenCallRealMethod();
		
		when(t.getDimensions()).thenReturn(2);
		when(t.toArray(new byte[2])).thenReturn(array);
		
		assertSame(array, t.toArray());
		
		verify(t).toArray();
		
		verify(t).getDimensions();
		verify(t).toArray(new byte[2]);
		
		verifyNoMoreInteractions(t);
	}

	/**
	 * This test ensures, that the function {@link TupbR#isZero()} returns true
	 * if all components are 0.
	 */
	@Test
	void isZero_ZeroTest()
	{
		TupbR t = mock(TupbR.class);
		
		when(t.isZero()).thenCallRealMethod();
		
		when(t.getDimensions()).thenReturn(2);
		when(t.getByIndex(0)).thenReturn((byte)0);
		when(t.getByIndex(1)).thenReturn((byte)0);
		
		assertEquals(true, t.isZero());
		
		verify(t).isZero();
		
		verify(t).getDimensions();
		verify(t).getByIndex(0);
		verify(t).getByIndex(1);
		
		verifyNoMoreInteractions(t);
	}

	/**
	 * This test ensures, that the function {@link TupbR#isZero()} returns false
	 * after checking the first component, if the first component is a positive
	 * number greater zero.
	 */
	@Test
	void isZero_FailEarly_PositiveTest()
	{
		TupbR t = mock(TupbR.class);
		
		when(t.isZero()).thenCallRealMethod();
		
		when(t.getDimensions()).thenReturn(2);
		when(t.getByIndex(0)).thenReturn((byte)1);
		
		assertEquals(false, t.isZero());
		
		verify(t).isZero();
		
		verify(t).getDimensions();
		verify(t).getByIndex(0);
		
		verifyNoMoreInteractions(t);
	}

	/**
	 * This test ensures, that the function {@link TupbR#isZero()} returns false
	 * after checking the first component, if the first component is a negative
	 * number greater zero.
	 */
	@Test
	void isZero_FailEarly_NegativeTest()
	{
		TupbR t = mock(TupbR.class);
		
		when(t.isZero()).thenCallRealMethod();
		
		when(t.getDimensions()).thenReturn(2);
		when(t.getByIndex(0)).thenReturn((byte)-1);
		
		assertEquals(false, t.isZero());
		
		verify(t).isZero();
		
		verify(t).getDimensions();
		verify(t).getByIndex(0);
		
		verifyNoMoreInteractions(t);
	}

	/**
	 * This test ensures, that the function {@link TupbR#isZero()} returns false
	 * after checking all components, if only the last component is a positive
	 * number greater zero.
	 */
	@Test
	void isZero_Fail_PositiveTest()
	{
		TupbR t = mock(TupbR.class);
		
		when(t.isZero()).thenCallRealMethod();
		
		when(t.getDimensions()).thenReturn(2);
		when(t.getByIndex(0)).thenReturn((byte)0);
		when(t.getByIndex(1)).thenReturn((byte)1);
		
		assertEquals(false, t.isZero());
		
		verify(t).isZero();
		
		verify(t).getDimensions();
		verify(t).getByIndex(0);
		verify(t).getByIndex(1);
		
		verifyNoMoreInteractions(t);
	}

	/**
	 * This test ensures, that the function {@link TupbR#isZero()} returns false
	 * after checking all components, if only the last component is a negative
	 * number greater zero.
	 */
	@Test
	void isZero_Fail_NegativeTest()
	{
		TupbR t = mock(TupbR.class);
		
		when(t.isZero()).thenCallRealMethod();
		
		when(t.getDimensions()).thenReturn(2);
		when(t.getByIndex(0)).thenReturn((byte)0);
		when(t.getByIndex(1)).thenReturn((byte)-1);
		
		assertEquals(false, t.isZero());
		
		verify(t).isZero();
		
		verify(t).getDimensions();
		verify(t).getByIndex(0);
		verify(t).getByIndex(1);
		
		verifyNoMoreInteractions(t);
	}

	/**
	 * This test ensures, that the function {@link TupbR#isZero(byte)} returns
	 * true, if all components are exactly +0.0f.
	 */
	@Test
	void isZeroWithTolerance_ZeroTest()
	{
		TupbR t = mock(TupbR.class);
		
		when(t.isZero((byte)2)).thenCallRealMethod();
		
		when(t.getDimensions()).thenReturn(2);
		when(t.getByIndex(0)).thenReturn((byte)0);
		when(t.getByIndex(1)).thenReturn((byte)0);
		
		assertEquals(true, t.isZero((byte)2));
		
		verify(t).isZero((byte)2);
		
		verify(t).getDimensions();
		verify(t).getByIndex(0);
		verify(t).getByIndex(1);
		
		verifyNoMoreInteractions(t);
	}

	/**
	 * This test ensures, that the function {@link TupbR#isZero(byte)} returns
	 * true, if all components are at the positive extreme point that is the
	 * inclusive tolerance parameter.
	 */
	@Test
	void isZeroWithTolerance_Extreme_PositiveTest()
	{
		TupbR t = mock(TupbR.class);
		
		when(t.isZero((byte)2)).thenCallRealMethod();
		
		when(t.getDimensions()).thenReturn(2);
		when(t.getByIndex(0)).thenReturn((byte)2);
		when(t.getByIndex(1)).thenReturn((byte)2);
		
		assertEquals(true, t.isZero((byte)2));
		
		verify(t).isZero((byte)2);
		
		verify(t).getDimensions();
		verify(t).getByIndex(0);
		verify(t).getByIndex(1);
		
		verifyNoMoreInteractions(t);
	}

	/**
	 * This test ensures, that the function {@link TupbR#isZero(byte)} returns
	 * true, if all components are at the negative extreme point that is the
	 * inclusive tolerance parameter.
	 */
	@Test
	void isZeroWithTolerance_Extreme_NegativeTest()
	{
		TupbR t = mock(TupbR.class);
		
		when(t.isZero((byte)2)).thenCallRealMethod();
		
		when(t.getDimensions()).thenReturn(2);
		when(t.getByIndex(0)).thenReturn((byte)-2);
		when(t.getByIndex(1)).thenReturn((byte)-2);
		
		assertEquals(true, t.isZero((byte)2));
		
		verify(t).isZero((byte)2);
		
		verify(t).getDimensions();
		verify(t).getByIndex(0);
		verify(t).getByIndex(1);
		
		verifyNoMoreInteractions(t);
	}

	/**
	 * This test ensures, that the function {@link TupbR#isZero(byte)} returns
	 * false after checking the first component, if the first component exceeds
	 * the positive extreme point that is the inclusive tolerance parameter.
	 */
	@Test
	void isZeroWithTolerance_FailEarly_PositiveTest()
	{
		TupbR t = mock(TupbR.class);
		
		when(t.isZero((byte)2)).thenCallRealMethod();
		
		when(t.getDimensions()).thenReturn(2);
		when(t.getByIndex(0)).thenReturn((byte)3);
		
		assertEquals(false, t.isZero((byte)2));
		
		verify(t).isZero((byte)2);
		
		verify(t).getDimensions();
		verify(t).getByIndex(0);
		
		verifyNoMoreInteractions(t);
	}

	/**
	 * This test ensures, that the function {@link TupbR#isZero(byte)} returns
	 * false after checking the first component, if the first component exceeds
	 * the negative extreme point that is the inclusive tolerance parameter.
	 */
	@Test
	void isZeroWithTolerance_FailEarly_NegativeTest()
	{
		TupbR t = mock(TupbR.class);
		
		when(t.isZero((byte)2)).thenCallRealMethod();
		
		when(t.getDimensions()).thenReturn(2);
		when(t.getByIndex(0)).thenReturn((byte)-3);
		
		assertEquals(false, t.isZero((byte)2));
		
		verify(t).isZero((byte)2);
		
		verify(t).getDimensions();
		verify(t).getByIndex(0);
		
		verifyNoMoreInteractions(t);
	}

	/**
	 * This test ensures, that the function {@link TupbR#isZero(byte)} returns
	 * false after checking all components, if only the last component exceeds
	 * the positive extreme point that is the inclusive tolerance parameter.
	 */
	@Test
	void isZeroWithTolerance_Fail_PositiveTest()
	{
		TupbR t = mock(TupbR.class);
		
		when(t.isZero((byte)2)).thenCallRealMethod();
		
		when(t.getDimensions()).thenReturn(2);
		when(t.getByIndex(0)).thenReturn((byte)0);
		when(t.getByIndex(1)).thenReturn((byte)3);
		
		assertEquals(false, t.isZero((byte)2));
		
		verify(t).isZero((byte)2);
		
		verify(t).getDimensions();
		verify(t).getByIndex(0);
		verify(t).getByIndex(1);
		
		verifyNoMoreInteractions(t);
	}

	/**
	 * This test ensures, that the function {@link TupbR#isZero(byte)} returns
	 * false after checking all components, if only the last component exceeds
	 * the negative extreme point that is the inclusive tolerance parameter.
	 */
	@Test
	void isZeroWithTolerance_Fail_NegativeTest()
	{
		TupbR t = mock(TupbR.class);
		
		when(t.isZero((byte)2)).thenCallRealMethod();
		
		when(t.getDimensions()).thenReturn(2);
		when(t.getByIndex(0)).thenReturn((byte)0);
		when(t.getByIndex(1)).thenReturn((byte)-3);
		
		assertEquals(false, t.isZero((byte)2));
		
		verify(t).isZero((byte)2);
		
		verify(t).getDimensions();
		verify(t).getByIndex(0);
		verify(t).getByIndex(1);
		
		verifyNoMoreInteractions(t);
	}

	/**
	 * This test ensures, that the function {@link TupbR#isZero(byte)} throws an
	 * {@link IllegalArgumentException} if the tolerance parameter is below
	 * zero.
	 */
	@Test
	void isZeroWithTolerance_Error_BelowZeroToleranceTest()
	{
		TupbR t = mock(TupbR.class);
		
		when(t.isZero((byte)-1)).thenCallRealMethod();
		
		assertThrowsExactly(IllegalArgumentException.class, () -> t.isZero((byte)-1));
		
		verify(t).isZero((byte)-1);
		
		verifyNoMoreInteractions(t);
	}
}