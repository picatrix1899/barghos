package org.barghos.core.test.api.tuple;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;

import org.barghos.core.api.tuple.TupdR;

/**
 * This class provides component tests for the interface {@link TupdR}.
 * 
 * @author picatrix1899
 */
class TupdRTest
{
	/**
	 * This test ensures, that the function {@link TupdR#isFinite()} returns true,
	 * if none of the components is either {@link Double#POSITIVE_INFINITY},
	 * {@link Double#NEGATIVE_INFINITY} or {@link Double#NaN}.
	 */
	@Test
	void isFiniteTest()
	{
		TupdR t = mock(TupdR.class);
		
		when(t.isFinite()).thenCallRealMethod();
		
		when(t.getDimensions()).thenReturn(2);
		when(t.getByIndex(0)).thenReturn(1.0);
		when(t.getByIndex(1)).thenReturn(1.0);

		assertEquals(true, t.isFinite());
		
		verify(t).isFinite();

		verify(t).getDimensions();
		verify(t).getByIndex(0);
		verify(t).getByIndex(1);
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link TupdR#isFinite()} returns false
	 * after checking the first component, if the first component is
	 * {@link Double#POSITIVE_INFINITY}.
	 */
	@Test
	void isFinite_FailEarly_PositiveInfTest()
	{
		TupdR t = mock(TupdR.class);
		
		when(t.isFinite()).thenCallRealMethod();
		
		when(t.getDimensions()).thenReturn(2);
		when(t.getByIndex(0)).thenReturn(Double.POSITIVE_INFINITY);
		
		assertEquals(false, t.isFinite());
		
		verify(t).isFinite();

		verify(t).getDimensions();
		verify(t).getByIndex(0);
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link TupdR#isFinite()} returns false
	 * after checking the first component, if the first component is
	 * {@link Double#NEGATIVE_INFINITY}.
	 */
	@Test
	void isFinite_FailEarly_NegativeInfTest()
	{
		TupdR t = mock(TupdR.class);
		
		when(t.isFinite()).thenCallRealMethod();
		
		when(t.getDimensions()).thenReturn(2);
		when(t.getByIndex(0)).thenReturn(Double.NEGATIVE_INFINITY);
		
		assertEquals(false, t.isFinite());
		
		verify(t).isFinite();

		verify(t).getDimensions();
		verify(t).getByIndex(0);
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link TupdR#isFinite()} returns false
	 * after checking the first component, if the first component is
	 * {@link Double#NaN}.
	 */
	@Test
	void isFinite_FailEarly_NaNTest()
	{
		TupdR t = mock(TupdR.class);
		
		when(t.isFinite()).thenCallRealMethod();
		
		when(t.getDimensions()).thenReturn(2);
		when(t.getByIndex(0)).thenReturn(Double.NaN);
		
		assertEquals(false, t.isFinite());
		
		verify(t).isFinite();

		verify(t).getDimensions();
		verify(t).getByIndex(0);
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link TupdR#isFinite()} returns false
	 * after checking all components, if only the last component is
	 * {@link Double#POSITIVE_INFINITY}.
	 */
	@Test
	void isFinite_Fail_PositiveInfTest()
	{
		TupdR t = mock(TupdR.class);
		
		when(t.isFinite()).thenCallRealMethod();
		
		when(t.getDimensions()).thenReturn(2);
		when(t.getByIndex(0)).thenReturn(1.0);
		when(t.getByIndex(1)).thenReturn(Double.POSITIVE_INFINITY);
		
		assertEquals(false, t.isFinite());
		
		verify(t).isFinite();

		verify(t).getDimensions();
		verify(t).getByIndex(0);
		verify(t).getByIndex(1);
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link TupdR#isFinite()} returns false
	 * after checking all components, if only the last component is
	 * {@link Double#NEGATIVE_INFINITY}.
	 */
	@Test
	void isFinite_Fail_NegativeInfTest()
	{
		TupdR t = mock(TupdR.class);
		
		when(t.isFinite()).thenCallRealMethod();
		
		when(t.getDimensions()).thenReturn(2);
		when(t.getByIndex(0)).thenReturn(1.0);
		when(t.getByIndex(1)).thenReturn(Double.NEGATIVE_INFINITY);
		
		assertEquals(false, t.isFinite());
		
		verify(t).isFinite();

		verify(t).getDimensions();
		verify(t).getByIndex(0);
		verify(t).getByIndex(1);
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link TupdR#isFinite()} returns false
	 * after checking all components, if only the last component is
	 * {@link Double#NaN}.
	 */
	@Test
	void isFinite_Fail_NaNTest()
	{
		TupdR t = mock(TupdR.class);
		
		when(t.isFinite()).thenCallRealMethod();
		
		when(t.getDimensions()).thenReturn(2);
		when(t.getByIndex(0)).thenReturn(1.0);
		when(t.getByIndex(1)).thenReturn(Double.NaN);
		
		assertEquals(false, t.isFinite());
		
		verify(t).isFinite();

		verify(t).getDimensions();
		verify(t).getByIndex(0);
		verify(t).getByIndex(1);
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link TupdR#isZero()} returns true
	 * if all components are +0.0.
	 */
	@Test
	void isZero_PositiveZeroTest()
	{
		TupdR t = mock(TupdR.class);
		
		when(t.isZero()).thenCallRealMethod();
		
		when(t.getDimensions()).thenReturn(2);
		when(t.getByIndex(0)).thenReturn(0.0);
		when(t.getByIndex(1)).thenReturn(0.0);
		
		assertEquals(true, t.isZero());
		
		verify(t).isZero();
		
		verify(t).getDimensions();
		verify(t).getByIndex(0);
		verify(t).getByIndex(1);
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link TupdR#isZero()} returns true
	 * if all components are -0.0.
	 */
	@Test
	void isZero_NegativeZeroTest()
	{
		TupdR t = mock(TupdR.class);
		
		when(t.isZero()).thenCallRealMethod();
		
		when(t.getDimensions()).thenReturn(2);
		when(t.getByIndex(0)).thenReturn(-0.0);
		when(t.getByIndex(1)).thenReturn(-0.0);
		
		assertEquals(true, t.isZero());
		
		verify(t).isZero();
		
		verify(t).getDimensions();
		verify(t).getByIndex(0);
		verify(t).getByIndex(1);
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link TupdR#isZero()} returns false
	 * after checking the first component, if the first component is a positive number
	 * greater zero.
	 */
	@Test
	void isZero_FailEarly_PositiveTest()
	{
		TupdR t = mock(TupdR.class);
		
		when(t.isZero()).thenCallRealMethod();
		
		when(t.getDimensions()).thenReturn(2);
		when(t.getByIndex(0)).thenReturn(1.0);
		
		assertEquals(false, t.isZero());
		
		verify(t).isZero();

		verify(t).getDimensions();
		verify(t).getByIndex(0);
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link TupdR#isZero()} returns false
	 * after checking the first component, if the first component is a negative number
	 * greater zero.
	 */
	@Test
	void isZero_FailEarly_NegativeTest()
	{
		TupdR t = mock(TupdR.class);
		
		when(t.isZero()).thenCallRealMethod();
		
		when(t.getDimensions()).thenReturn(2);
		when(t.getByIndex(0)).thenReturn(-1.0);
		
		assertEquals(false, t.isZero());
		
		verify(t).isZero();

		verify(t).getDimensions();
		verify(t).getByIndex(0);
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link TupdR#isZero()} returns false
	 * after checking all components, if only the last component is a positive number
	 * greater zero.
	 */
	@Test
	void isZero_Fail_PositiveTest()
	{
		TupdR t = mock(TupdR.class);
		
		when(t.isZero()).thenCallRealMethod();
		
		when(t.getDimensions()).thenReturn(2);
		when(t.getByIndex(0)).thenReturn(0.0);
		when(t.getByIndex(1)).thenReturn(1.0);
		
		assertEquals(false, t.isZero());
		
		verify(t).isZero();

		verify(t).getDimensions();
		verify(t).getByIndex(0);
		verify(t).getByIndex(1);
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link TupdR#isZero()} returns false
	 * after checking all components, if only the last component is a negative number
	 * greater zero.
	 */
	@Test
	void isZero_Fail_NTest()
	{
		TupdR t = mock(TupdR.class);
		
		when(t.isZero()).thenCallRealMethod();
		
		when(t.getDimensions()).thenReturn(2);
		when(t.getByIndex(0)).thenReturn(0.0);
		when(t.getByIndex(1)).thenReturn(-1.0);
		
		assertEquals(false, t.isZero());
		
		verify(t).isZero();

		verify(t).getDimensions();
		verify(t).getByIndex(0);
		verify(t).getByIndex(1);
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link TupdR#isZeroWithMargin(double)} returns true,
	 * if all components are exactly +0.0.
	 */
	@Test
	void isZeroWithMargin_Zero_PositiveTest()
	{
		TupdR t = mock(TupdR.class);
		
		when(t.isZeroWithMargin(2.0)).thenCallRealMethod();
		
		when(t.getDimensions()).thenReturn(2);
		when(t.getByIndex(0)).thenReturn(0.0);
		when(t.getByIndex(1)).thenReturn(0.0);

		assertEquals(true, t.isZeroWithMargin(2.0));
		
		verify(t).isZeroWithMargin(2.0);
		
		verify(t).getDimensions();
		verify(t).getByIndex(0);
		verify(t).getByIndex(1);
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link TupdR#isZeroWithMargin(double)} returns true,
	 * if all components are exactly -0.0.
	 */
	@Test
	void isZeroWithMargin_Zero_NegativeTest()
	{
		TupdR t = mock(TupdR.class);
		
		when(t.isZeroWithMargin(2.0)).thenCallRealMethod();
		
		when(t.getDimensions()).thenReturn(2);
		when(t.getByIndex(0)).thenReturn(-0.0);
		when(t.getByIndex(1)).thenReturn(-0.0);

		assertEquals(true, t.isZeroWithMargin(2.0));
		
		verify(t).isZeroWithMargin(2.0);
		
		verify(t).getDimensions();
		verify(t).getByIndex(0);
		verify(t).getByIndex(1);
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link TupdR#isZeroWithMargin(double)} returns true,
	 * if all components are at the positive extreme point that is the inclusive
	 * tolerance parameter.
	 */
	@Test
	void isZeroWithMargin_Extreme_PositiveTest()
	{
		TupdR t = mock(TupdR.class);
		
		when(t.isZeroWithMargin(2.0)).thenCallRealMethod();
		
		when(t.getDimensions()).thenReturn(2);
		when(t.getByIndex(0)).thenReturn(2.0);
		when(t.getByIndex(1)).thenReturn(2.0);

		assertEquals(true, t.isZeroWithMargin(2.0));
		
		verify(t).isZeroWithMargin(2.0);

		verify(t).getDimensions();
		verify(t).getByIndex(0);
		verify(t).getByIndex(1);
		
		verifyNoMoreInteractions(t);
	}
	
		/**
	 * This test ensures, that the function {@link TupdR#isZeroWithMargin(double)} returns true,
	 * if all components are at the negative extreme point that is the inclusive
	 * tolerance parameter.
	 */
	@Test
	void isZeroWithMargin_Extreme_NegativeTest()
	{
		TupdR t = mock(TupdR.class);
		
		when(t.isZeroWithMargin(2.0)).thenCallRealMethod();
		
		when(t.getDimensions()).thenReturn(2);
		when(t.getByIndex(0)).thenReturn(-2.0);
		when(t.getByIndex(1)).thenReturn(-2.0);

		assertEquals(true, t.isZeroWithMargin(2.0));
		
		verify(t).isZeroWithMargin(2.0);

		verify(t).getDimensions();
		verify(t).getByIndex(0);
		verify(t).getByIndex(1);
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link TupdR#isZeroWithMargin(double)} returns false
	 * after checking the first component, if the first component exceeds the positive
	 * extreme point that is the inclusive tolerance parameter.
	 */
	@Test
	void isZeroWithMargin_FailEarly_PositiveTest()
	{
		TupdR t = mock(TupdR.class);
		
		when(t.isZeroWithMargin(2.0)).thenCallRealMethod();
		
		when(t.getDimensions()).thenReturn(2);
		when(t.getByIndex(0)).thenReturn(3.0);

		assertEquals(false, t.isZeroWithMargin(2.0));
		
		verify(t).isZeroWithMargin(2.0);

		verify(t).getDimensions();
		verify(t).getByIndex(0);
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link TupdR#isZeroWithMargin(double)} returns false
	 * after checking the first component, if the first component exceeds the negative
	 * extreme point that is the inclusive tolerance parameter.
	 */
	@Test
	void isZeroWithMargin_FailEarly_NegativeTest()
	{
		TupdR t = mock(TupdR.class);
		
		when(t.isZeroWithMargin(2.0)).thenCallRealMethod();
		
		when(t.getDimensions()).thenReturn(2);
		when(t.getByIndex(0)).thenReturn(-3.0);

		assertEquals(false, t.isZeroWithMargin(2.0));
		
		verify(t).isZeroWithMargin(2.0);

		verify(t).getDimensions();
		verify(t).getByIndex(0);
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link TupdR#isZeroWithMargin(double)} returns false
	 * after checking all components, if only the last component exceeds the positive
	 * extreme point that is the inclusive tolerance parameter.
	 */
	@Test
	void isZeroWithMargin_Fail_PositiveTest()
	{
		TupdR t = mock(TupdR.class);
		
		when(t.isZeroWithMargin(2.0)).thenCallRealMethod();
		
		when(t.getDimensions()).thenReturn(2);
		when(t.getByIndex(0)).thenReturn(0.0);
		when(t.getByIndex(1)).thenReturn(3.0);

		assertEquals(false, t.isZeroWithMargin(2.0));
		
		verify(t).isZeroWithMargin(2.0);

		verify(t).getDimensions();
		verify(t).getByIndex(0);
		verify(t).getByIndex(1);
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link TupdR#isZeroWithMargin(double)} returns false
	 * after checking all components, if only the last component exceeds the negative
	 * extreme point that is the inclusive tolerance parameter.
	 */
	@Test
	void isZeroWithMargin_Fail_NegativeTest()
	{
		TupdR t = mock(TupdR.class);
		
		when(t.isZeroWithMargin(2.0)).thenCallRealMethod();
		
		when(t.getDimensions()).thenReturn(2);
		when(t.getByIndex(0)).thenReturn(0.0);
		when(t.getByIndex(1)).thenReturn(-3.0);

		assertEquals(false, t.isZeroWithMargin(2.0));
		
		verify(t).isZeroWithMargin(2.0);

		verify(t).getDimensions();
		verify(t).getByIndex(0);
		verify(t).getByIndex(1);
		
		verifyNoMoreInteractions(t);
	}
}