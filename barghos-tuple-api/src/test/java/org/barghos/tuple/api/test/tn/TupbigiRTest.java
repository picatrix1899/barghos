package org.barghos.tuple.api.test.tn;

import static org.junit.jupiter.api.Assertions.*;

import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;

import java.math.BigInteger;

import org.barghos.tuple.api.tn.TupbigiR;

/**
 * This class provides component tests for the interface {@link TupbigiR}.
 * 
 * @author picatrix1899
 */
class TupbigiRTest
{

	/**
	 * This test ensures, that the function {@link TupbigiR#toArray()} calls the
	 * function {@link TupbigiR#toArray(BigInteger[])} with a new array with the
	 * size equal to the number of dimensions of the tuple.
	 */
	@Test
	void toArrayTest()
	{
		TupbigiR t = mock(TupbigiR.class);
		
		BigInteger[] array = new BigInteger[2];
		
		when(t.toArray()).thenCallRealMethod();
		
		when(t.getDimensions()).thenReturn(2);
		when(t.toArray(new BigInteger[2])).thenReturn(array);
		
		assertSame(array, t.toArray());
		
		verify(t).toArray();
		
		verify(t).getDimensions();
		verify(t).toArray(new BigInteger[2]);
		
		verifyNoMoreInteractions(t);
	}

	/**
	 * This test ensures, that the function {@link TupbigiR#isZero()} returns
	 * true if all components are +0.0f.
	 */
	@Test
	void isZero_PositiveZeroTest()
	{
		TupbigiR t = mock(TupbigiR.class);
		
		when(t.isZero()).thenCallRealMethod();
		
		when(t.getDimensions()).thenReturn(2);
		when(t.getByIndex(0)).thenReturn(BigInteger.valueOf(0));
		when(t.getByIndex(1)).thenReturn(BigInteger.valueOf(0));
		
		assertEquals(true, t.isZero());
		
		verify(t).isZero();
		
		verify(t).getDimensions();
		verify(t).getByIndex(0);
		verify(t).getByIndex(1);
		
		verifyNoMoreInteractions(t);
	}

	/**
	 * This test ensures, that the function {@link TupbigiR#isZero()} returns
	 * false after checking the first component, if the first component is a
	 * positive number greater zero.
	 */
	@Test
	void isZero_FailEarly_PositiveTest()
	{
		TupbigiR t = mock(TupbigiR.class);
		
		when(t.isZero()).thenCallRealMethod();
		
		when(t.getDimensions()).thenReturn(2);
		when(t.getByIndex(0)).thenReturn(BigInteger.valueOf(1));
		
		assertEquals(false, t.isZero());
		
		verify(t).isZero();
		
		verify(t).getDimensions();
		verify(t).getByIndex(0);
		
		verifyNoMoreInteractions(t);
	}

	/**
	 * This test ensures, that the function {@link TupbigiR#isZero()} returns
	 * false after checking the first component, if the first component is a
	 * negative number greater zero.
	 */
	@Test
	void isZero_FailEarly_NegativeTest()
	{
		TupbigiR t = mock(TupbigiR.class);
		
		when(t.isZero()).thenCallRealMethod();
		
		when(t.getDimensions()).thenReturn(2);
		when(t.getByIndex(0)).thenReturn(BigInteger.valueOf(-1));
		
		assertEquals(false, t.isZero());
		
		verify(t).isZero();
		
		verify(t).getDimensions();
		verify(t).getByIndex(0);
		
		verifyNoMoreInteractions(t);
	}

	/**
	 * This test ensures, that the function {@link TupbigiR#isZero()} returns
	 * false after checking all components, if only the last component is a
	 * positive number greater zero.
	 */
	@Test
	void isZero_Fail_PositiveTest()
	{
		TupbigiR t = mock(TupbigiR.class);
		
		when(t.isZero()).thenCallRealMethod();
		
		when(t.getDimensions()).thenReturn(2);
		when(t.getByIndex(0)).thenReturn(BigInteger.valueOf(0));
		when(t.getByIndex(1)).thenReturn(BigInteger.valueOf(1));
		
		assertEquals(false, t.isZero());
		
		verify(t).isZero();
		
		verify(t).getDimensions();
		verify(t).getByIndex(0);
		verify(t).getByIndex(1);
		
		verifyNoMoreInteractions(t);
	}

	/**
	 * This test ensures, that the function {@link TupbigiR#isZero()} returns
	 * false after checking all components, if only the last component is a
	 * negative number greater zero.
	 */
	@Test
	void isZero_Fail_NegativeTest()
	{
		TupbigiR t = mock(TupbigiR.class);
		
		when(t.isZero()).thenCallRealMethod();
		
		when(t.getDimensions()).thenReturn(2);
		when(t.getByIndex(0)).thenReturn(BigInteger.valueOf(0));
		when(t.getByIndex(1)).thenReturn(BigInteger.valueOf(-1));
		
		assertEquals(false, t.isZero());
		
		verify(t).isZero();
		
		verify(t).getDimensions();
		verify(t).getByIndex(0);
		verify(t).getByIndex(1);
		
		verifyNoMoreInteractions(t);
	}

	/**
	 * This test ensures, that the function {@link TupbigiR#isZero(BigInteger)}
	 * returns true, if all components are exactly +0.0f.
	 */
	@Test
	void isZeroWithTolerance_Zero_PositiveTest()
	{
		TupbigiR t = mock(TupbigiR.class);
		
		when(t.isZero(BigInteger.valueOf(2))).thenCallRealMethod();
		
		when(t.getDimensions()).thenReturn(2);
		when(t.getByIndex(0)).thenReturn(BigInteger.valueOf(0));
		when(t.getByIndex(1)).thenReturn(BigInteger.valueOf(0));
		
		assertEquals(true, t.isZero(BigInteger.valueOf(2)));
		
		verify(t).isZero(BigInteger.valueOf(2));
		
		verify(t).getDimensions();
		verify(t).getByIndex(0);
		verify(t).getByIndex(1);
		
		verifyNoMoreInteractions(t);
	}

	/**
	 * This test ensures, that the function {@link TupbigiR#isZero(BigInteger)}
	 * returns true, if all components are at the positive extreme point that is
	 * the inclusive tolerance parameter.
	 */
	@Test
	void isZeroWithTolerance_Extreme_PositiveTest()
	{
		TupbigiR t = mock(TupbigiR.class);
		
		when(t.isZero(BigInteger.valueOf(2))).thenCallRealMethod();
		
		when(t.getDimensions()).thenReturn(2);
		when(t.getByIndex(0)).thenReturn(BigInteger.valueOf(2));
		when(t.getByIndex(1)).thenReturn(BigInteger.valueOf(2));
		
		assertEquals(true, t.isZero(BigInteger.valueOf(2)));
		
		verify(t).isZero(BigInteger.valueOf(2));
		
		verify(t).getDimensions();
		verify(t).getByIndex(0);
		verify(t).getByIndex(1);
		
		verifyNoMoreInteractions(t);
	}

	/**
	 * This test ensures, that the function {@link TupbigiR#isZero(BigInteger)}
	 * returns true, if all components are at the negative extreme point that is
	 * the inclusive tolerance parameter.
	 */
	@Test
	void isZeroWithTolerance_Extreme_NegativeTest()
	{
		TupbigiR t = mock(TupbigiR.class);
		
		when(t.isZero(BigInteger.valueOf(2))).thenCallRealMethod();
		
		when(t.getDimensions()).thenReturn(2);
		when(t.getByIndex(0)).thenReturn(BigInteger.valueOf(-2));
		when(t.getByIndex(1)).thenReturn(BigInteger.valueOf(-2));
		
		assertEquals(true, t.isZero(BigInteger.valueOf(2)));
		
		verify(t).isZero(BigInteger.valueOf(2));
		
		verify(t).getDimensions();
		verify(t).getByIndex(0);
		verify(t).getByIndex(1);
		
		verifyNoMoreInteractions(t);
	}

	/**
	 * This test ensures, that the function {@link TupbigiR#isZero(BigInteger)}
	 * returns false after checking the first component, if the first component
	 * exceeds the positive extreme point that is the inclusive tolerance
	 * parameter.
	 */
	@Test
	void isZeroWithTolerance_FailEarly_PositiveTest()
	{
		TupbigiR t = mock(TupbigiR.class);
		
		when(t.isZero(BigInteger.valueOf(2))).thenCallRealMethod();
		
		when(t.getDimensions()).thenReturn(2);
		when(t.getByIndex(0)).thenReturn(BigInteger.valueOf(3));
		
		assertEquals(false, t.isZero(BigInteger.valueOf(2)));
		
		verify(t).isZero(BigInteger.valueOf(2));
		
		verify(t).getDimensions();
		verify(t).getByIndex(0);
		
		verifyNoMoreInteractions(t);
	}

	/**
	 * This test ensures, that the function {@link TupbigiR#isZero(BigInteger)}
	 * returns false after checking the first component, if the first component
	 * exceeds the negative extreme point that is the inclusive tolerance
	 * parameter.
	 */
	@Test
	void isZeroWithTolerance_FailEarly_NegativeTest()
	{
		TupbigiR t = mock(TupbigiR.class);
		
		when(t.isZero(BigInteger.valueOf(2))).thenCallRealMethod();
		
		when(t.getDimensions()).thenReturn(2);
		when(t.getByIndex(0)).thenReturn(BigInteger.valueOf(-3));
		
		assertEquals(false, t.isZero(BigInteger.valueOf(2)));
		
		verify(t).isZero(BigInteger.valueOf(2));
		
		verify(t).getDimensions();
		verify(t).getByIndex(0);
		
		verifyNoMoreInteractions(t);
	}

	/**
	 * This test ensures, that the function {@link TupbigiR#isZero(BigInteger)}
	 * returns false after checking all components, if only the last component
	 * exceeds the positive extreme point that is the inclusive tolerance
	 * parameter.
	 */
	@Test
	void isZeroWithTolerance_Fail_PositiveTest()
	{
		TupbigiR t = mock(TupbigiR.class);
		
		when(t.isZero(BigInteger.valueOf(2))).thenCallRealMethod();
		
		when(t.getDimensions()).thenReturn(2);
		when(t.getByIndex(0)).thenReturn(BigInteger.valueOf(0));
		when(t.getByIndex(1)).thenReturn(BigInteger.valueOf(3));
		
		assertEquals(false, t.isZero(BigInteger.valueOf(2)));
		
		verify(t).isZero(BigInteger.valueOf(2));
		
		verify(t).getDimensions();
		verify(t).getByIndex(0);
		verify(t).getByIndex(1);
		
		verifyNoMoreInteractions(t);
	}

	/**
	 * This test ensures, that the function {@link TupbigiR#isZero(BigInteger)}
	 * returns false after checking all components, if only the last component
	 * exceeds the negative extreme point that is the inclusive tolerance
	 * parameter.
	 */
	@Test
	void isZeroWithTolerance_Fail_NegativeTest()
	{
		TupbigiR t = mock(TupbigiR.class);
		
		when(t.isZero(BigInteger.valueOf(2))).thenCallRealMethod();
		
		when(t.getDimensions()).thenReturn(2);
		when(t.getByIndex(0)).thenReturn(BigInteger.valueOf(0));
		when(t.getByIndex(1)).thenReturn(BigInteger.valueOf(-3));
		
		assertEquals(false, t.isZero(BigInteger.valueOf(2)));
		
		verify(t).isZero(BigInteger.valueOf(2));
		
		verify(t).getDimensions();
		verify(t).getByIndex(0);
		verify(t).getByIndex(1);
		
		verifyNoMoreInteractions(t);
	}

	/**
	 * This test ensures, that the function {@link TupbigiR#isZero(BigInteger)}
	 * throws an {@link IllegalArgumentException} if the tolerance parameter is
	 * below zero.
	 */
	@Test
	void isZeroWithTolerance_Error_BelowZeroToleranceTest()
	{
		TupbigiR t = mock(TupbigiR.class);
		
		when(t.isZero(BigInteger.valueOf(-1))).thenCallRealMethod();
		
		assertThrowsExactly(IllegalArgumentException.class, () -> t.isZero(BigInteger.valueOf(-1)));
		
		verify(t).isZero(BigInteger.valueOf(-1));
		
		verifyNoMoreInteractions(t);
	}
}