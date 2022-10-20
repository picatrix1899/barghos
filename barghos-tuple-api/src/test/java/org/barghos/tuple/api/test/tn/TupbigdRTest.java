package org.barghos.tuple.api.test.tn;

import static org.junit.jupiter.api.Assertions.*;

import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import org.barghos.tuple.api.tn.TupbigdR;

/**
 * This class provides component tests for the interface {@link TupbigdR}.
 * 
 * @author picatrix1899
 */
class TupbigdRTest
{

	/**
	 * This test ensures, that the function {@link TupbigdR#toArray()} calls the
	 * function {@link TupbigdR#toArray(BigDecimal[])} with a new array with the
	 * size equal to the number of dimensions of the tuple.
	 */
	@Test
	void toArrayTest()
	{
		TupbigdR t = mock(TupbigdR.class);
		
		BigDecimal[] array = new BigDecimal[2];
		
		when(t.toArray()).thenCallRealMethod();
		
		when(t.getDimensions()).thenReturn(2);
		when(t.toArray(new BigDecimal[2])).thenReturn(array);
		
		assertSame(array, t.toArray());
		
		verify(t).toArray();
		
		verify(t).getDimensions();
		verify(t).toArray(new BigDecimal[2]);
		
		verifyNoMoreInteractions(t);
	}

	/**
	 * This test ensures, that the function {@link TupbigdR#isZero()} returns
	 * true if all components are +0.0f.
	 */
	@Test
	void isZero_PositiveZeroTest()
	{
		TupbigdR t = mock(TupbigdR.class);
		
		when(t.isZero()).thenCallRealMethod();
		
		when(t.getDimensions()).thenReturn(2);
		when(t.getByIndex(0)).thenReturn(BigDecimal.valueOf(0.0));
		when(t.getByIndex(1)).thenReturn(BigDecimal.valueOf(0.0));
		
		assertEquals(true, t.isZero());
		
		verify(t).isZero();
		
		verify(t).getDimensions();
		verify(t).getByIndex(0);
		verify(t).getByIndex(1);
		
		verifyNoMoreInteractions(t);
	}

	/**
	 * This test ensures, that the function {@link TupbigdR#isZero()} returns
	 * true if all components are -0.0.
	 */
	@Test
	void isZero_NegativeZeroTest()
	{
		TupbigdR t = mock(TupbigdR.class);
		
		when(t.isZero()).thenCallRealMethod();
		
		when(t.getDimensions()).thenReturn(2);
		when(t.getByIndex(0)).thenReturn(BigDecimal.valueOf(-0.0));
		when(t.getByIndex(1)).thenReturn(BigDecimal.valueOf(-0.0));
		
		assertEquals(true, t.isZero());
		
		verify(t).isZero();
		
		verify(t).getDimensions();
		verify(t).getByIndex(0);
		verify(t).getByIndex(1);
		
		verifyNoMoreInteractions(t);
	}

	/**
	 * This test ensures, that the function {@link TupbigdR#isZero()} returns
	 * false after checking the first component, if the first component is a
	 * positive number greater zero.
	 */
	@Test
	void isZero_FailEarly_PositiveTest()
	{
		TupbigdR t = mock(TupbigdR.class);
		
		when(t.isZero()).thenCallRealMethod();
		
		when(t.getDimensions()).thenReturn(2);
		when(t.getByIndex(0)).thenReturn(BigDecimal.valueOf(1.0));
		
		assertEquals(false, t.isZero());
		
		verify(t).isZero();
		
		verify(t).getDimensions();
		verify(t).getByIndex(0);
		
		verifyNoMoreInteractions(t);
	}

	/**
	 * This test ensures, that the function {@link TupbigdR#isZero()} returns
	 * false after checking the first component, if the first component is a
	 * negative number greater zero.
	 */
	@Test
	void isZero_FailEarly_NegativeTest()
	{
		TupbigdR t = mock(TupbigdR.class);
		
		when(t.isZero()).thenCallRealMethod();
		
		when(t.getDimensions()).thenReturn(2);
		when(t.getByIndex(0)).thenReturn(BigDecimal.valueOf(-1.0));
		
		assertEquals(false, t.isZero());
		
		verify(t).isZero();
		
		verify(t).getDimensions();
		verify(t).getByIndex(0);
		
		verifyNoMoreInteractions(t);
	}

	/**
	 * This test ensures, that the function {@link TupbigdR#isZero()} returns
	 * false after checking all components, if only the last component is a
	 * positive number greater zero.
	 */
	@Test
	void isZero_Fail_PositiveTest()
	{
		TupbigdR t = mock(TupbigdR.class);
		
		when(t.isZero()).thenCallRealMethod();
		
		when(t.getDimensions()).thenReturn(2);
		when(t.getByIndex(0)).thenReturn(BigDecimal.valueOf(0.0));
		when(t.getByIndex(1)).thenReturn(BigDecimal.valueOf(1.0));
		
		assertEquals(false, t.isZero());
		
		verify(t).isZero();
		
		verify(t).getDimensions();
		verify(t).getByIndex(0);
		verify(t).getByIndex(1);
		
		verifyNoMoreInteractions(t);
	}

	/**
	 * This test ensures, that the function {@link TupbigdR#isZero()} returns
	 * false after checking all components, if only the last component is a
	 * negative number greater zero.
	 */
	@Test
	void isZero_Fail_NegativeTest()
	{
		TupbigdR t = mock(TupbigdR.class);
		
		when(t.isZero()).thenCallRealMethod();
		
		when(t.getDimensions()).thenReturn(2);
		when(t.getByIndex(0)).thenReturn(BigDecimal.valueOf(0.0));
		when(t.getByIndex(1)).thenReturn(BigDecimal.valueOf(-1.0));
		
		assertEquals(false, t.isZero());
		
		verify(t).isZero();
		
		verify(t).getDimensions();
		verify(t).getByIndex(0);
		verify(t).getByIndex(1);
		
		verifyNoMoreInteractions(t);
	}

	/**
	 * This test ensures, that the function {@link TupbigdR#isZero(BigDecimal)}
	 * returns true, if all components are exactly +0.0f.
	 */
	@Test
	void isZeroWithTolerance_Zero_PositiveTest()
	{
		TupbigdR t = mock(TupbigdR.class);
		
		when(t.isZero(BigDecimal.valueOf(2.0))).thenCallRealMethod();
		
		when(t.getDimensions()).thenReturn(2);
		when(t.getByIndex(0)).thenReturn(BigDecimal.valueOf(0.0));
		when(t.getByIndex(1)).thenReturn(BigDecimal.valueOf(0.0));
		
		assertEquals(true, t.isZero(BigDecimal.valueOf(2.0)));
		
		verify(t).isZero(BigDecimal.valueOf(2.0));
		
		verify(t).getDimensions();
		verify(t).getByIndex(0);
		verify(t).getByIndex(1);
		
		verifyNoMoreInteractions(t);
	}

	/**
	 * This test ensures, that the function {@link TupbigdR#isZero(BigDecimal)}
	 * returns true, if all components are exactly -0.0f.
	 */
	@Test
	void isZeroWithTolerance_Zero_NegativeTest()
	{
		TupbigdR t = mock(TupbigdR.class);
		
		when(t.isZero(BigDecimal.valueOf(2.0))).thenCallRealMethod();
		
		when(t.getDimensions()).thenReturn(2);
		when(t.getByIndex(0)).thenReturn(BigDecimal.valueOf(-0.0));
		when(t.getByIndex(1)).thenReturn(BigDecimal.valueOf(-0.0));
		
		assertEquals(true, t.isZero(BigDecimal.valueOf(2.0)));
		
		verify(t).isZero(BigDecimal.valueOf(2.0));
		
		verify(t).getDimensions();
		verify(t).getByIndex(0);
		verify(t).getByIndex(1);
		
		verifyNoMoreInteractions(t);
	}

	/**
	 * This test ensures, that the function {@link TupbigdR#isZero(BigDecimal)}
	 * returns true, if all components are at the positive extreme point that is
	 * the inclusive tolerance parameter.
	 */
	@Test
	void isZeroWithTolerance_Extreme_PositiveTest()
	{
		TupbigdR t = mock(TupbigdR.class);
		
		when(t.isZero(BigDecimal.valueOf(2.0))).thenCallRealMethod();
		
		when(t.getDimensions()).thenReturn(2);
		when(t.getByIndex(0)).thenReturn(BigDecimal.valueOf(2.0));
		when(t.getByIndex(1)).thenReturn(BigDecimal.valueOf(2.0));
		
		assertEquals(true, t.isZero(BigDecimal.valueOf(2.0)));
		
		verify(t).isZero(BigDecimal.valueOf(2.0));
		
		verify(t).getDimensions();
		verify(t).getByIndex(0);
		verify(t).getByIndex(1);
		
		verifyNoMoreInteractions(t);
	}

	/**
	 * This test ensures, that the function {@link TupbigdR#isZero(BigDecimal)}
	 * returns true, if all components are at the negative extreme point that is
	 * the inclusive tolerance parameter.
	 */
	@Test
	void isZeroWithTolerance_Extreme_NegativeTest()
	{
		TupbigdR t = mock(TupbigdR.class);
		
		when(t.isZero(BigDecimal.valueOf(2.0))).thenCallRealMethod();
		
		when(t.getDimensions()).thenReturn(2);
		when(t.getByIndex(0)).thenReturn(BigDecimal.valueOf(-2.0));
		when(t.getByIndex(1)).thenReturn(BigDecimal.valueOf(-2.0));
		
		assertEquals(true, t.isZero(BigDecimal.valueOf(2.0)));
		
		verify(t).isZero(BigDecimal.valueOf(2.0));
		
		verify(t).getDimensions();
		verify(t).getByIndex(0);
		verify(t).getByIndex(1);
		
		verifyNoMoreInteractions(t);
	}

	/**
	 * This test ensures, that the function {@link TupbigdR#isZero(BigDecimal)}
	 * returns false after checking the first component, if the first component
	 * exceeds the positive extreme point that is the inclusive tolerance
	 * parameter.
	 */
	@Test
	void isZeroWithTolerance_FailEarly_PositiveTest()
	{
		TupbigdR t = mock(TupbigdR.class);
		
		when(t.isZero(BigDecimal.valueOf(2.0))).thenCallRealMethod();
		
		when(t.getDimensions()).thenReturn(2);
		when(t.getByIndex(0)).thenReturn(BigDecimal.valueOf(3.0));
		
		assertEquals(false, t.isZero(BigDecimal.valueOf(2.0)));
		
		verify(t).isZero(BigDecimal.valueOf(2.0));
		
		verify(t).getDimensions();
		verify(t).getByIndex(0);
		
		verifyNoMoreInteractions(t);
	}

	/**
	 * This test ensures, that the function {@link TupbigdR#isZero(BigDecimal)}
	 * returns false after checking the first component, if the first component
	 * exceeds the negative extreme point that is the inclusive tolerance
	 * parameter.
	 */
	@Test
	void isZeroWithTolerance_FailEarly_NegativeTest()
	{
		TupbigdR t = mock(TupbigdR.class);
		
		when(t.isZero(BigDecimal.valueOf(2.0))).thenCallRealMethod();
		
		when(t.getDimensions()).thenReturn(2);
		when(t.getByIndex(0)).thenReturn(BigDecimal.valueOf(-3.0));
		
		assertEquals(false, t.isZero(BigDecimal.valueOf(2.0)));
		
		verify(t).isZero(BigDecimal.valueOf(2.0));
		
		verify(t).getDimensions();
		verify(t).getByIndex(0);
		
		verifyNoMoreInteractions(t);
	}

	/**
	 * This test ensures, that the function {@link TupbigdR#isZero(BigDecimal)}
	 * returns false after checking all components, if only the last component
	 * exceeds the positive extreme point that is the inclusive tolerance
	 * parameter.
	 */
	@Test
	void isZeroWithTolerance_Fail_PositiveTest()
	{
		TupbigdR t = mock(TupbigdR.class);
		
		when(t.isZero(BigDecimal.valueOf(2.0))).thenCallRealMethod();
		
		when(t.getDimensions()).thenReturn(2);
		when(t.getByIndex(0)).thenReturn(BigDecimal.valueOf(0.0));
		when(t.getByIndex(1)).thenReturn(BigDecimal.valueOf(3.0));
		
		assertEquals(false, t.isZero(BigDecimal.valueOf(2.0)));
		
		verify(t).isZero(BigDecimal.valueOf(2.0));
		
		verify(t).getDimensions();
		verify(t).getByIndex(0);
		verify(t).getByIndex(1);
		
		verifyNoMoreInteractions(t);
	}

	/**
	 * This test ensures, that the function {@link TupbigdR#isZero(BigDecimal)}
	 * returns false after checking all components, if only the last component
	 * exceeds the negative extreme point that is the inclusive tolerance
	 * parameter.
	 */
	@Test
	void isZeroWithTolerance_Fail_NegativeTest()
	{
		TupbigdR t = mock(TupbigdR.class);
		
		when(t.isZero(BigDecimal.valueOf(2.0))).thenCallRealMethod();
		
		when(t.getDimensions()).thenReturn(2);
		when(t.getByIndex(0)).thenReturn(BigDecimal.valueOf(0.0));
		when(t.getByIndex(1)).thenReturn(BigDecimal.valueOf(-3.0));
		
		assertEquals(false, t.isZero(BigDecimal.valueOf(2.0)));
		
		verify(t).isZero(BigDecimal.valueOf(2.0));
		
		verify(t).getDimensions();
		verify(t).getByIndex(0);
		verify(t).getByIndex(1);
		
		verifyNoMoreInteractions(t);
	}

	/**
	 * This test ensures, that the function {@link TupbigdR#isZero(BigDecimal)}
	 * throws an {@link IllegalArgumentException} if the tolerance parameter is
	 * below zero.
	 */
	@Test
	void isZeroWithTolerance_Error_BelowZeroToleranceTest()
	{
		TupbigdR t = mock(TupbigdR.class);
		
		when(t.isZero(BigDecimal.valueOf(-1.0))).thenCallRealMethod();
		
		assertThrowsExactly(IllegalArgumentException.class, () -> t.isZero(BigDecimal.valueOf(-1.0)));
		
		verify(t).isZero(BigDecimal.valueOf(-1.0));
		
		verifyNoMoreInteractions(t);
	}
}