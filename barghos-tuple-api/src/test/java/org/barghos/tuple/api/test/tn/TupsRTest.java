package org.barghos.tuple.api.test.tn;

import static org.junit.jupiter.api.Assertions.*;

import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;

import org.barghos.tuple.api.tn.TupsR;

/**
 * This class provides component tests for the interface {@link TupsR}.
 * 
 * @author picatrix1899
 */
class TupsRTest
{

	/**
	 * This test ensures, that the function {@link TupsR#toArray()} calls the
	 * function {@link TupsR#toArray(short[])} with a new array with the size
	 * equal to the number of dimensions of the tuple.
	 */
	@Test
	void toArrayTest()
	{
		TupsR t = mock(TupsR.class);
		
		short[] array = new short[2];
		
		when(t.toArray()).thenCallRealMethod();
		
		when(t.getDimensions()).thenReturn(2);
		when(t.toArray(new short[2])).thenReturn(array);
		
		assertSame(array, t.toArray());
		
		verify(t).toArray();
		
		verify(t).getDimensions();
		verify(t).toArray(new short[2]);
		
		verifyNoMoreInteractions(t);
	}

	/**
	 * This test ensures, that the function {@link TupsR#isZero()} returns true
	 * if all components are 0.
	 */
	@Test
	void isZero_ZeroTest()
	{
		TupsR t = mock(TupsR.class);
		
		when(t.isZero()).thenCallRealMethod();
		
		when(t.getDimensions()).thenReturn(2);
		when(t.getByIndex(0)).thenReturn((short)0);
		when(t.getByIndex(1)).thenReturn((short)0);
		
		assertEquals(true, t.isZero());
		
		verify(t).isZero();
		
		verify(t).getDimensions();
		verify(t).getByIndex(0);
		verify(t).getByIndex(1);
		
		verifyNoMoreInteractions(t);
	}

	/**
	 * This test ensures, that the function {@link TupsR#isZero()} returns false
	 * after checking the first component, if the first component is a positive
	 * number greater zero.
	 */
	@Test
	void isZero_FailEarly_PositiveTest()
	{
		TupsR t = mock(TupsR.class);
		
		when(t.isZero()).thenCallRealMethod();
		
		when(t.getDimensions()).thenReturn(2);
		when(t.getByIndex(0)).thenReturn((short)1);
		
		assertEquals(false, t.isZero());
		
		verify(t).isZero();
		
		verify(t).getDimensions();
		verify(t).getByIndex(0);
		
		verifyNoMoreInteractions(t);
	}

	/**
	 * This test ensures, that the function {@link TupsR#isZero()} returns false
	 * after checking the first component, if the first component is a negative
	 * number greater zero.
	 */
	@Test
	void isZero_FailEarly_NegativeTest()
	{
		TupsR t = mock(TupsR.class);
		
		when(t.isZero()).thenCallRealMethod();
		
		when(t.getDimensions()).thenReturn(2);
		when(t.getByIndex(0)).thenReturn((short)-1);
		
		assertEquals(false, t.isZero());
		
		verify(t).isZero();
		
		verify(t).getDimensions();
		verify(t).getByIndex(0);
		
		verifyNoMoreInteractions(t);
	}

	/**
	 * This test ensures, that the function {@link TupsR#isZero()} returns false
	 * after checking all components, if only the last component is a positive
	 * number greater zero.
	 */
	@Test
	void isZero_Fail_PositiveTest()
	{
		TupsR t = mock(TupsR.class);
		
		when(t.isZero()).thenCallRealMethod();
		
		when(t.getDimensions()).thenReturn(2);
		when(t.getByIndex(0)).thenReturn((short)0);
		when(t.getByIndex(1)).thenReturn((short)1);
		
		assertEquals(false, t.isZero());
		
		verify(t).isZero();
		
		verify(t).getDimensions();
		verify(t).getByIndex(0);
		verify(t).getByIndex(1);
		
		verifyNoMoreInteractions(t);
	}

	/**
	 * This test ensures, that the function {@link TupsR#isZero()} returns false
	 * after checking all components, if only the last component is a negative
	 * number greater zero.
	 */
	@Test
	void isZero_Fail_NegativeTest()
	{
		TupsR t = mock(TupsR.class);
		
		when(t.isZero()).thenCallRealMethod();
		
		when(t.getDimensions()).thenReturn(2);
		when(t.getByIndex(0)).thenReturn((short)0);
		when(t.getByIndex(1)).thenReturn((short)-1);
		
		assertEquals(false, t.isZero());
		
		verify(t).isZero();
		
		verify(t).getDimensions();
		verify(t).getByIndex(0);
		verify(t).getByIndex(1);
		
		verifyNoMoreInteractions(t);
	}

	/**
	 * This test ensures, that the function {@link TupsR#isZero(short)} returns
	 * true, if all components are exactly +0.0f.
	 */
	@Test
	void isZeroWithTolerance_ZeroTest()
	{
		TupsR t = mock(TupsR.class);
		
		when(t.isZero((short)2)).thenCallRealMethod();
		
		when(t.getDimensions()).thenReturn(2);
		when(t.getByIndex(0)).thenReturn((short)0);
		when(t.getByIndex(1)).thenReturn((short)0);
		
		assertEquals(true, t.isZero((short)2));
		
		verify(t).isZero((short)2);
		
		verify(t).getDimensions();
		verify(t).getByIndex(0);
		verify(t).getByIndex(1);
		
		verifyNoMoreInteractions(t);
	}

	/**
	 * This test ensures, that the function {@link TupsR#isZero(short)} returns
	 * true, if all components are at the positive extreme point that is the
	 * inclusive tolerance parameter.
	 */
	@Test
	void isZeroWithTolerance_Extreme_PositiveTest()
	{
		TupsR t = mock(TupsR.class);
		
		when(t.isZero((short)2)).thenCallRealMethod();
		
		when(t.getDimensions()).thenReturn(2);
		when(t.getByIndex(0)).thenReturn((short)2);
		when(t.getByIndex(1)).thenReturn((short)2);
		
		assertEquals(true, t.isZero((short)2));
		
		verify(t).isZero((short)2);
		
		verify(t).getDimensions();
		verify(t).getByIndex(0);
		verify(t).getByIndex(1);
		
		verifyNoMoreInteractions(t);
	}

	/**
	 * This test ensures, that the function {@link TupsR#isZero(short)} returns
	 * true, if all components are at the negative extreme point that is the
	 * inclusive tolerance parameter.
	 */
	@Test
	void isZeroWithTolerance_Extreme_NegativeTest()
	{
		TupsR t = mock(TupsR.class);
		
		when(t.isZero((short)2)).thenCallRealMethod();
		
		when(t.getDimensions()).thenReturn(2);
		when(t.getByIndex(0)).thenReturn((short)-2);
		when(t.getByIndex(1)).thenReturn((short)-2);
		
		assertEquals(true, t.isZero((short)2));
		
		verify(t).isZero((short)2);
		
		verify(t).getDimensions();
		verify(t).getByIndex(0);
		verify(t).getByIndex(1);
		
		verifyNoMoreInteractions(t);
	}

	/**
	 * This test ensures, that the function {@link TupsR#isZero(short)} returns
	 * false after checking the first component, if the first component exceeds
	 * the positive extreme point that is the inclusive tolerance parameter.
	 */
	@Test
	void isZeroWithTolerance_FailEarly_PositiveTest()
	{
		TupsR t = mock(TupsR.class);
		
		when(t.isZero((short)2)).thenCallRealMethod();
		
		when(t.getDimensions()).thenReturn(2);
		when(t.getByIndex(0)).thenReturn((short)3);
		
		assertEquals(false, t.isZero((short)2));
		
		verify(t).isZero((short)2);
		
		verify(t).getDimensions();
		verify(t).getByIndex(0);
		
		verifyNoMoreInteractions(t);
	}

	/**
	 * This test ensures, that the function {@link TupsR#isZero(short)} returns
	 * false after checking the first component, if the first component exceeds
	 * the negative extreme point that is the inclusive tolerance parameter.
	 */
	@Test
	void isZeroWithTolerance_FailEarly_NegativeTest()
	{
		TupsR t = mock(TupsR.class);
		
		when(t.isZero((short)2)).thenCallRealMethod();
		
		when(t.getDimensions()).thenReturn(2);
		when(t.getByIndex(0)).thenReturn((short)-3);
		
		assertEquals(false, t.isZero((short)2));
		
		verify(t).isZero((short)2);
		
		verify(t).getDimensions();
		verify(t).getByIndex(0);
		
		verifyNoMoreInteractions(t);
	}

	/**
	 * This test ensures, that the function {@link TupsR#isZero(short)} returns
	 * false after checking all components, if only the last component exceeds
	 * the positive extreme point that is the inclusive tolerance parameter.
	 */
	@Test
	void isZeroWithTolerance_Fail_PositiveTest()
	{
		TupsR t = mock(TupsR.class);
		
		when(t.isZero((short)2)).thenCallRealMethod();
		
		when(t.getDimensions()).thenReturn(2);
		when(t.getByIndex(0)).thenReturn((short)0);
		when(t.getByIndex(1)).thenReturn((short)3);
		
		assertEquals(false, t.isZero((short)2));
		
		verify(t).isZero((short)2);
		
		verify(t).getDimensions();
		verify(t).getByIndex(0);
		verify(t).getByIndex(1);
		
		verifyNoMoreInteractions(t);
	}

	/**
	 * This test ensures, that the function {@link TupsR#isZero(short)} returns
	 * false after checking all components, if only the last component exceeds
	 * the negative extreme point that is the inclusive tolerance parameter.
	 */
	@Test
	void isZeroWithTolerance_Fail_NegativeTest()
	{
		TupsR t = mock(TupsR.class);
		
		when(t.isZero((short)2)).thenCallRealMethod();
		
		when(t.getDimensions()).thenReturn(2);
		when(t.getByIndex(0)).thenReturn((short)0);
		when(t.getByIndex(1)).thenReturn((short)-3);
		
		assertEquals(false, t.isZero((short)2));
		
		verify(t).isZero((short)2);
		
		verify(t).getDimensions();
		verify(t).getByIndex(0);
		verify(t).getByIndex(1);
		
		verifyNoMoreInteractions(t);
	}

	/**
	 * This test ensures, that the function {@link TupsR#isZero(short)} throws
	 * an {@link IllegalArgumentException} if the tolerance parameter is below
	 * zero.
	 */
	@Test
	void isZeroWithTolerance_Error_BelowZeroToleranceTest()
	{
		TupsR t = mock(TupsR.class);
		
		when(t.isZero((short)-1)).thenCallRealMethod();
		
		assertThrowsExactly(IllegalArgumentException.class, () -> t.isZero((short)-1));
		
		verify(t).isZero((short)-1);
		
		verifyNoMoreInteractions(t);
	}
}