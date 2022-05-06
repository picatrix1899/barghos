package org.barghos.core.test.api.tuple;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;

import org.barghos.core.api.tuple.TupiR;

/**
 * This class provides component tests for the interface {@link TupiR}.
 * 
 * @author picatrix1899
 */
class TupiRTest
{
	/**
	 * This test ensures, that the function {@link TupiR#isFinite()} returns always
	 * true and does not make any calls.
	 */
	@Test
	void isFiniteTest()
	{
		TupiR t = mock(TupiR.class);
		
		when(t.isFinite()).thenCallRealMethod();
		
		assertEquals(true, t.isFinite());
		
		verify(t).isFinite();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link TupiR#isExactlyZero()} returns true
	 * if all components are 0.0.
	 */
	@Test
	void isExactlyZero_ZeroTest()
	{
		TupiR t = mock(TupiR.class);
		
		when(t.isExactlyZero()).thenCallRealMethod();
		
		when(t.getDimensions()).thenReturn(2);
		when(t.getByIndex(0)).thenReturn(0);
		when(t.getByIndex(1)).thenReturn(0);
		
		assertEquals(true, t.isExactlyZero());
		
		verify(t).isExactlyZero();
		
		verify(t).getDimensions();
		verify(t).getByIndex(0);
		verify(t).getByIndex(1);
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link TupiR#isExactlyZero()} returns false
	 * after checking the first component, if the first component is a positive number
	 * greater zero.
	 */
	@Test
	void isExactlyZero_FailEarly_PositiveTest()
	{
		TupiR t = mock(TupiR.class);
		
		when(t.isExactlyZero()).thenCallRealMethod();
		
		when(t.getDimensions()).thenReturn(2);
		when(t.getByIndex(0)).thenReturn(1);
		
		assertEquals(false, t.isExactlyZero());
		
		verify(t).isExactlyZero();

		verify(t).getDimensions();
		verify(t).getByIndex(0);
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link TupiR#isExactlyZero()} returns false
	 * after checking the first component, if the first component is a negative number
	 * greater zero.
	 */
	@Test
	void isExactlyZero_FailEarly_NegativeTest()
	{
		TupiR t = mock(TupiR.class);
		
		when(t.isExactlyZero()).thenCallRealMethod();
		
		when(t.getDimensions()).thenReturn(2);
		when(t.getByIndex(0)).thenReturn(-1);
		
		assertEquals(false, t.isExactlyZero());
		
		verify(t).isExactlyZero();

		verify(t).getDimensions();
		verify(t).getByIndex(0);
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link TupiR#isExactlyZero()} returns false
	 * after checking all components, if only the last component is a positive number
	 * greater zero.
	 */
	@Test
	void isExactlyZero_Fail_PositiveTest()
	{
		TupiR t = mock(TupiR.class);
		
		when(t.isExactlyZero()).thenCallRealMethod();
		
		when(t.getDimensions()).thenReturn(2);
		when(t.getByIndex(0)).thenReturn(0);
		when(t.getByIndex(1)).thenReturn(1);
		
		assertEquals(false, t.isExactlyZero());
		
		verify(t).isExactlyZero();

		verify(t).getDimensions();
		verify(t).getByIndex(0);
		verify(t).getByIndex(1);
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link TupiR#isExactlyZero()} returns false
	 * after checking all components, if only the last component is a negative number
	 * greater zero.
	 */
	@Test
	void isZero_Fail_NTest()
	{
		TupiR t = mock(TupiR.class);
		
		when(t.isExactlyZero()).thenCallRealMethod();
		
		when(t.getDimensions()).thenReturn(2);
		when(t.getByIndex(0)).thenReturn(0);
		when(t.getByIndex(1)).thenReturn(-1);
		
		assertEquals(false, t.isExactlyZero());
		
		verify(t).isExactlyZero();

		verify(t).getDimensions();
		verify(t).getByIndex(0);
		verify(t).getByIndex(1);
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link TupiR#isZero(int)} returns true,
	 * if all components are exactly 0.0.
	 */
	@Test
	void isZero_ZeroTest()
	{
		TupiR t = mock(TupiR.class);
		
		when(t.isZero(2)).thenCallRealMethod();
		
		when(t.getDimensions()).thenReturn(2);
		when(t.getByIndex(0)).thenReturn(0);
		when(t.getByIndex(1)).thenReturn(0);

		assertEquals(true, t.isZero(2));
		
		verify(t).isZero(2);
		
		verify(t).getDimensions();
		verify(t).getByIndex(0);
		verify(t).getByIndex(1);
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link TupiR#isZero(int)} returns true,
	 * if all components are at the positive extreme point that is the inclusive
	 * tolerance parameter.
	 */
	@Test
	void isZero_Extreme_PositiveTest()
	{
		TupiR t = mock(TupiR.class);
		
		when(t.isZero(2)).thenCallRealMethod();
		
		when(t.getDimensions()).thenReturn(2);
		when(t.getByIndex(0)).thenReturn(2);
		when(t.getByIndex(1)).thenReturn(2);

		assertEquals(true, t.isZero(2));
		
		verify(t).isZero(2);

		verify(t).getDimensions();
		verify(t).getByIndex(0);
		verify(t).getByIndex(1);
		
		verifyNoMoreInteractions(t);
	}
	
		/**
	 * This test ensures, that the function {@link TupiR#isZero(int)} returns true,
	 * if all components are at the negative extreme point that is the inclusive
	 * tolerance parameter.
	 */
	@Test
	void isZero_Extreme_NegativeTest()
	{
		TupiR t = mock(TupiR.class);
		
		when(t.isZero(2)).thenCallRealMethod();
		
		when(t.getDimensions()).thenReturn(2);
		when(t.getByIndex(0)).thenReturn(-2);
		when(t.getByIndex(1)).thenReturn(-2);

		assertEquals(true, t.isZero(2));
		
		verify(t).isZero(2);

		verify(t).getDimensions();
		verify(t).getByIndex(0);
		verify(t).getByIndex(1);
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link TupiR#isZero(int)} returns false
	 * after checking the first component, if the first component exceeds the positive
	 * extreme point that is the inclusive tolerance parameter.
	 */
	@Test
	void isZero_FailEarly_PositiveTest()
	{
		TupiR t = mock(TupiR.class);
		
		when(t.isZero(2)).thenCallRealMethod();
		
		when(t.getDimensions()).thenReturn(2);
		when(t.getByIndex(0)).thenReturn(3);

		assertEquals(false, t.isZero(2));
		
		verify(t).isZero(2);

		verify(t).getDimensions();
		verify(t).getByIndex(0);
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link TupiR#isZero(int)} returns false
	 * after checking the first component, if the first component exceeds the negative
	 * extreme point that is the inclusive tolerance parameter.
	 */
	@Test
	void isZero_FailEarly_NegativeTest()
	{
		TupiR t = mock(TupiR.class);
		
		when(t.isZero(2)).thenCallRealMethod();
		
		when(t.getDimensions()).thenReturn(2);
		when(t.getByIndex(0)).thenReturn(-3);

		assertEquals(false, t.isZero(2));
		
		verify(t).isZero(2);

		verify(t).getDimensions();
		verify(t).getByIndex(0);
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link TupiR#isZero(int)} returns false
	 * after checking all components, if only the last component exceeds the positive
	 * extreme point that is the inclusive tolerance parameter.
	 */
	@Test
	void isZero_Fail_PositiveTest()
	{
		TupiR t = mock(TupiR.class);
		
		when(t.isZero(2)).thenCallRealMethod();
		
		when(t.getDimensions()).thenReturn(2);
		when(t.getByIndex(0)).thenReturn(0);
		when(t.getByIndex(1)).thenReturn(3);

		assertEquals(false, t.isZero(2));
		
		verify(t).isZero(2);

		verify(t).getDimensions();
		verify(t).getByIndex(0);
		verify(t).getByIndex(1);
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link TupiR#isZero(int)} returns false
	 * after checking all components, if only the last component exceeds the negative
	 * extreme point that is the inclusive tolerance parameter.
	 */
	@Test
	void isZero_Fail_NegativeTest()
	{
		TupiR t = mock(TupiR.class);
		
		when(t.isZero(2)).thenCallRealMethod();
		
		when(t.getDimensions()).thenReturn(2);
		when(t.getByIndex(0)).thenReturn(0);
		when(t.getByIndex(1)).thenReturn(-3);

		assertEquals(false, t.isZero(2));
		
		verify(t).isZero(2);

		verify(t).getDimensions();
		verify(t).getByIndex(0);
		verify(t).getByIndex(1);
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link TupiR#toArray()} calls
	 * the function {@link TupiR#toArray(int[])} with a new array with the size
	 * equal to the number of dimensions of the tuple.
	 */
	@Test
	void toArrayTest()
	{
		TupiR t = mock(TupiR.class);
		
		int[] array = new int[2];
		
		when(t.toArray()).thenCallRealMethod();
		when(t.getDimensions()).thenReturn(2);

		when(t.toArray(new int[2])).thenReturn(array);
		
		assertSame(array, t.toArray());
		
		verify(t).toArray();
		
		verify(t).getDimensions();
		
		verify(t).toArray(new int[2]);
		
		verifyNoMoreInteractions(t);
	}
}