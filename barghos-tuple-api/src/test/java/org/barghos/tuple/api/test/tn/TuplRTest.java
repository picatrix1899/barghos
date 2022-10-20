package org.barghos.tuple.api.test.tn;

import static org.junit.jupiter.api.Assertions.*;

import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;

import org.barghos.tuple.api.tn.TuplR;

/**
 * This class provides component tests for the interface {@link TuplR}.
 * 
 * @author picatrix1899
 */
class TuplRTest
{

	/**
	 * This test ensures, that the function {@link TuplR#toArray()} calls the
	 * function {@link TuplR#toArray(long[])} with a new array with the size
	 * equal to the number of dimensions of the tuple.
	 */
	@Test
	void toArrayTest()
	{
		TuplR t = mock(TuplR.class);
		
		long[] array = new long[2];
		
		when(t.toArray()).thenCallRealMethod();
		
		when(t.getDimensions()).thenReturn(2);
		when(t.toArray(new long[2])).thenReturn(array);
		
		assertSame(array, t.toArray());
		
		verify(t).toArray();
		
		verify(t).getDimensions();
		verify(t).toArray(new long[2]);
		
		verifyNoMoreInteractions(t);
	}

	/**
	 * This test ensures, that the function {@link TuplR#isZero()} returns true
	 * if all components are +0.0f.
	 */
	@Test
	void isZero_PositiveZeroTest()
	{
		TuplR t = mock(TuplR.class);
		
		when(t.isZero()).thenCallRealMethod();
		
		when(t.getDimensions()).thenReturn(2);
		when(t.getByIndex(0)).thenReturn(0l);
		when(t.getByIndex(1)).thenReturn(0l);
		
		assertEquals(true, t.isZero());
		
		verify(t).isZero();
		
		verify(t).getDimensions();
		verify(t).getByIndex(0);
		verify(t).getByIndex(1);
		
		verifyNoMoreInteractions(t);
	}

	/**
	 * This test ensures, that the function {@link TuplR#isZero()} returns false
	 * after checking the first component, if the first component is a positive
	 * number greater zero.
	 */
	@Test
	void isZero_FailEarly_PositiveTest()
	{
		TuplR t = mock(TuplR.class);
		
		when(t.isZero()).thenCallRealMethod();
		
		when(t.getDimensions()).thenReturn(2);
		when(t.getByIndex(0)).thenReturn(1l);
		
		assertEquals(false, t.isZero());
		
		verify(t).isZero();
		
		verify(t).getDimensions();
		verify(t).getByIndex(0);
		
		verifyNoMoreInteractions(t);
	}

	/**
	 * This test ensures, that the function {@link TuplR#isZero()} returns false
	 * after checking the first component, if the first component is a negative
	 * number greater zero.
	 */
	@Test
	void isZero_FailEarly_NegativeTest()
	{
		TuplR t = mock(TuplR.class);
		
		when(t.isZero()).thenCallRealMethod();
		
		when(t.getDimensions()).thenReturn(2);
		when(t.getByIndex(0)).thenReturn(-1l);
		
		assertEquals(false, t.isZero());
		
		verify(t).isZero();
		
		verify(t).getDimensions();
		verify(t).getByIndex(0);
		
		verifyNoMoreInteractions(t);
	}

	/**
	 * This test ensures, that the function {@link TuplR#isZero()} returns false
	 * after checking all components, if only the last component is a positive
	 * number greater zero.
	 */
	@Test
	void isZero_Fail_PositiveTest()
	{
		TuplR t = mock(TuplR.class);
		
		when(t.isZero()).thenCallRealMethod();
		
		when(t.getDimensions()).thenReturn(2);
		when(t.getByIndex(0)).thenReturn(0l);
		when(t.getByIndex(1)).thenReturn(1l);
		
		assertEquals(false, t.isZero());
		
		verify(t).isZero();
		
		verify(t).getDimensions();
		verify(t).getByIndex(0);
		verify(t).getByIndex(1);
		
		verifyNoMoreInteractions(t);
	}

	/**
	 * This test ensures, that the function {@link TuplR#isZero()} returns false
	 * after checking all components, if only the last component is a negative
	 * number greater zero.
	 */
	@Test
	void isZero_Fail_NegativeTest()
	{
		TuplR t = mock(TuplR.class);
		
		when(t.isZero()).thenCallRealMethod();
		
		when(t.getDimensions()).thenReturn(2);
		when(t.getByIndex(0)).thenReturn(0l);
		when(t.getByIndex(1)).thenReturn(-1l);
		
		assertEquals(false, t.isZero());
		
		verify(t).isZero();
		
		verify(t).getDimensions();
		verify(t).getByIndex(0);
		verify(t).getByIndex(1);
		
		verifyNoMoreInteractions(t);
	}

	/**
	 * This test ensures, that the function {@link TuplR#isZero(long)} returns
	 * true, if all components are exactly +0.0f.
	 */
	@Test
	void isZeroWithTolerance_Zero_PositiveTest()
	{
		TuplR t = mock(TuplR.class);
		
		when(t.isZero(2l)).thenCallRealMethod();
		
		when(t.getDimensions()).thenReturn(2);
		when(t.getByIndex(0)).thenReturn(0l);
		when(t.getByIndex(1)).thenReturn(0l);
		
		assertEquals(true, t.isZero(2l));
		
		verify(t).isZero(2l);
		
		verify(t).getDimensions();
		verify(t).getByIndex(0);
		verify(t).getByIndex(1);
		
		verifyNoMoreInteractions(t);
	}

	/**
	 * This test ensures, that the function {@link TuplR#isZero(long)} returns
	 * true, if all components are at the positive extreme point that is the
	 * inclusive tolerance parameter.
	 */
	@Test
	void isZeroWithTolerance_Extreme_PositiveTest()
	{
		TuplR t = mock(TuplR.class);
		
		when(t.isZero(2l)).thenCallRealMethod();
		
		when(t.getDimensions()).thenReturn(2);
		when(t.getByIndex(0)).thenReturn(2l);
		when(t.getByIndex(1)).thenReturn(2l);
		
		assertEquals(true, t.isZero(2l));
		
		verify(t).isZero(2l);
		
		verify(t).getDimensions();
		verify(t).getByIndex(0);
		verify(t).getByIndex(1);
		
		verifyNoMoreInteractions(t);
	}

	/**
	 * This test ensures, that the function {@link TuplR#isZero(long)} returns
	 * true, if all components are at the negative extreme point that is the
	 * inclusive tolerance parameter.
	 */
	@Test
	void isZeroWithTolerance_Extreme_NegativeTest()
	{
		TuplR t = mock(TuplR.class);
		
		when(t.isZero(2l)).thenCallRealMethod();
		
		when(t.getDimensions()).thenReturn(2);
		when(t.getByIndex(0)).thenReturn(-2l);
		when(t.getByIndex(1)).thenReturn(-2l);
		
		assertEquals(true, t.isZero(2l));
		
		verify(t).isZero(2l);
		
		verify(t).getDimensions();
		verify(t).getByIndex(0);
		verify(t).getByIndex(1);
		
		verifyNoMoreInteractions(t);
	}

	/**
	 * This test ensures, that the function {@link TuplR#isZero(long)} returns
	 * false after checking the first component, if the first component exceeds
	 * the positive extreme point that is the inclusive tolerance parameter.
	 */
	@Test
	void isZeroWithTolerance_FailEarly_PositiveTest()
	{
		TuplR t = mock(TuplR.class);
		
		when(t.isZero(2l)).thenCallRealMethod();
		
		when(t.getDimensions()).thenReturn(2);
		when(t.getByIndex(0)).thenReturn(3l);
		
		assertEquals(false, t.isZero(2l));
		
		verify(t).isZero(2l);
		
		verify(t).getDimensions();
		verify(t).getByIndex(0);
		
		verifyNoMoreInteractions(t);
	}

	/**
	 * This test ensures, that the function {@link TuplR#isZero(long)} returns
	 * false after checking the first component, if the first component exceeds
	 * the negative extreme point that is the inclusive tolerance parameter.
	 */
	@Test
	void isZeroWithTolerance_FailEarly_NegativeTest()
	{
		TuplR t = mock(TuplR.class);
		
		when(t.isZero(2l)).thenCallRealMethod();
		
		when(t.getDimensions()).thenReturn(2);
		when(t.getByIndex(0)).thenReturn(-3l);
		
		assertEquals(false, t.isZero(2l));
		
		verify(t).isZero(2l);
		
		verify(t).getDimensions();
		verify(t).getByIndex(0);
		
		verifyNoMoreInteractions(t);
	}

	/**
	 * This test ensures, that the function {@link TuplR#isZero(long)} returns
	 * false after checking all components, if only the last component exceeds
	 * the positive extreme point that is the inclusive tolerance parameter.
	 */
	@Test
	void isZeroWithTolerance_Fail_PositiveTest()
	{
		TuplR t = mock(TuplR.class);
		
		when(t.isZero(2l)).thenCallRealMethod();
		
		when(t.getDimensions()).thenReturn(2);
		when(t.getByIndex(0)).thenReturn(0l);
		when(t.getByIndex(1)).thenReturn(3l);
		
		assertEquals(false, t.isZero(2l));
		
		verify(t).isZero(2l);
		
		verify(t).getDimensions();
		verify(t).getByIndex(0);
		verify(t).getByIndex(1);
		
		verifyNoMoreInteractions(t);
	}

	/**
	 * This test ensures, that the function {@link TuplR#isZero(long)} returns
	 * false after checking all components, if only the last component exceeds
	 * the negative extreme point that is the inclusive tolerance parameter.
	 */
	@Test
	void isZeroWithTolerance_Fail_NegativeTest()
	{
		TuplR t = mock(TuplR.class);
		
		when(t.isZero(2l)).thenCallRealMethod();
		
		when(t.getDimensions()).thenReturn(2);
		when(t.getByIndex(0)).thenReturn(0l);
		when(t.getByIndex(1)).thenReturn(-3l);
		
		assertEquals(false, t.isZero(2l));
		
		verify(t).isZero(2l);
		
		verify(t).getDimensions();
		verify(t).getByIndex(0);
		verify(t).getByIndex(1);
		
		verifyNoMoreInteractions(t);
	}

	/**
	 * This test ensures, that the function {@link TuplR#isZero(long)} throws an
	 * {@link IllegalArgumentException} if the tolerance parameter is below
	 * zero.
	 */
	@Test
	void isZeroWithTolerance_Error_BelowZeroToleranceTest()
	{
		TuplR t = mock(TuplR.class);
		
		when(t.isZero(-1l)).thenCallRealMethod();
		
		assertThrowsExactly(IllegalArgumentException.class, () -> t.isZero(-1l));
		
		verify(t).isZero(-1l);
		
		verifyNoMoreInteractions(t);
	}
}