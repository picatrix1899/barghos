package org.barghos.core.test.api.tuple;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;

import org.barghos.core.api.tuple.TupfR;

/**
 * This class provides component tests for the interface {@link TupfR}.
 * 
 * @author picatrix1899
 */
class TupfRTest
{
	/**
	 * This test ensures, that the function {@link TupfR#isFinite()} returns true,
	 * if none of the components is either {@link Float#POSITIVE_INFINITY},
	 * {@link Float#NEGATIVE_INFINITY} or {@link Float#NaN}.
	 */
	@Test
	void isFiniteTest()
	{
		TupfR t = mock(TupfR.class);
		
		when(t.isFinite()).thenCallRealMethod();
		
		when(t.getDimensions()).thenReturn(2);
		when(t.getByIndex(0)).thenReturn(1.0f);
		when(t.getByIndex(1)).thenReturn(1.0f);

		assertEquals(true, t.isFinite());
		
		verify(t).isFinite();

		verify(t).getDimensions();
		verify(t).getByIndex(0);
		verify(t).getByIndex(1);
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link TupfR#isFinite()} returns false
	 * after checking the first component, if the first component is
	 * {@link Float#POSITIVE_INFINITY}.
	 */
	@Test
	void isFinite_FailEarly_PositiveInfTest()
	{
		TupfR t = mock(TupfR.class);
		
		when(t.isFinite()).thenCallRealMethod();
		
		when(t.getDimensions()).thenReturn(2);
		when(t.getByIndex(0)).thenReturn(Float.POSITIVE_INFINITY);
		
		assertEquals(false, t.isFinite());
		
		verify(t).isFinite();

		verify(t).getDimensions();
		verify(t).getByIndex(0);
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link TupfR#isFinite()} returns false
	 * after checking the first component, if the first component is
	 * {@link Float#NEGATIVE_INFINITY}.
	 */
	@Test
	void isFinite_FailEarly_NegativeInfTest()
	{
		TupfR t = mock(TupfR.class);
		
		when(t.isFinite()).thenCallRealMethod();
		
		when(t.getDimensions()).thenReturn(2);
		when(t.getByIndex(0)).thenReturn(Float.NEGATIVE_INFINITY);
		
		assertEquals(false, t.isFinite());
		
		verify(t).isFinite();

		verify(t).getDimensions();
		verify(t).getByIndex(0);
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link TupfR#isFinite()} returns false
	 * after checking the first component, if the first component is
	 * {@link Float#NaN}.
	 */
	@Test
	void isFinite_FailEarly_NaNTest()
	{
		TupfR t = mock(TupfR.class);
		
		when(t.isFinite()).thenCallRealMethod();
		
		when(t.getDimensions()).thenReturn(2);
		when(t.getByIndex(0)).thenReturn(Float.NaN);
		
		assertEquals(false, t.isFinite());
		
		verify(t).isFinite();

		verify(t).getDimensions();
		verify(t).getByIndex(0);
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link TupfR#isFinite()} returns false
	 * after checking all components, if only the last component is
	 * {@link Float#POSITIVE_INFINITY}.
	 */
	@Test
	void isFinite_Fail_PositiveInfTest()
	{
		TupfR t = mock(TupfR.class);
		
		when(t.isFinite()).thenCallRealMethod();
		
		when(t.getDimensions()).thenReturn(2);
		when(t.getByIndex(0)).thenReturn(1.0f);
		when(t.getByIndex(1)).thenReturn(Float.POSITIVE_INFINITY);
		
		assertEquals(false, t.isFinite());
		
		verify(t).isFinite();

		verify(t).getDimensions();
		verify(t).getByIndex(0);
		verify(t).getByIndex(1);
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link TupfR#isFinite()} returns false
	 * after checking all components, if only the last component is
	 * {@link Float#NEGATIVE_INFINITY}.
	 */
	@Test
	void isFinite_Fail_NegativeInfTest()
	{
		TupfR t = mock(TupfR.class);
		
		when(t.isFinite()).thenCallRealMethod();
		
		when(t.getDimensions()).thenReturn(2);
		when(t.getByIndex(0)).thenReturn(1.0f);
		when(t.getByIndex(1)).thenReturn(Float.NEGATIVE_INFINITY);
		
		assertEquals(false, t.isFinite());
		
		verify(t).isFinite();

		verify(t).getDimensions();
		verify(t).getByIndex(0);
		verify(t).getByIndex(1);
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link TupfR#isFinite()} returns false
	 * after checking all components, if only the last component is
	 * {@link Float#NaN}.
	 */
	@Test
	void isFinite_Fail_NaNTest()
	{
		TupfR t = mock(TupfR.class);
		
		when(t.isFinite()).thenCallRealMethod();
		
		when(t.getDimensions()).thenReturn(2);
		when(t.getByIndex(0)).thenReturn(1.0f);
		when(t.getByIndex(1)).thenReturn(Float.NaN);
		
		assertEquals(false, t.isFinite());
		
		verify(t).isFinite();

		verify(t).getDimensions();
		verify(t).getByIndex(0);
		verify(t).getByIndex(1);
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link TupfR#isZero()} returns true
	 * if all components are +0.0f.
	 */
	@Test
	void isZero_PositiveZeroTest()
	{
		TupfR t = mock(TupfR.class);
		
		when(t.isZero()).thenCallRealMethod();
		
		when(t.getDimensions()).thenReturn(2);
		when(t.getByIndex(0)).thenReturn(0.0f);
		when(t.getByIndex(1)).thenReturn(0.0f);
		
		assertEquals(true, t.isZero());
		
		verify(t).isZero();
		
		verify(t).getDimensions();
		verify(t).getByIndex(0);
		verify(t).getByIndex(1);
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link TupfR#isZero()} returns true
	 * if all components are -0.0.
	 */
	@Test
	void isZero_NegativeZeroTest()
	{
		TupfR t = mock(TupfR.class);
		
		when(t.isZero()).thenCallRealMethod();
		
		when(t.getDimensions()).thenReturn(2);
		when(t.getByIndex(0)).thenReturn(-0.0f);
		when(t.getByIndex(1)).thenReturn(-0.0f);
		
		assertEquals(true, t.isZero());
		
		verify(t).isZero();
		
		verify(t).getDimensions();
		verify(t).getByIndex(0);
		verify(t).getByIndex(1);
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link TupfR#isZero()} returns false
	 * after checking the first component, if the first component is a positive number
	 * greater zero.
	 */
	@Test
	void isZero_FailEarly_PositiveTest()
	{
		TupfR t = mock(TupfR.class);
		
		when(t.isZero()).thenCallRealMethod();
		
		when(t.getDimensions()).thenReturn(2);
		when(t.getByIndex(0)).thenReturn(1.0f);
		
		assertEquals(false, t.isZero());
		
		verify(t).isZero();

		verify(t).getDimensions();
		verify(t).getByIndex(0);
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link TupfR#isZero()} returns false
	 * after checking the first component, if the first component is a negative number
	 * greater zero.
	 */
	@Test
	void isZero_FailEarly_NegativeTest()
	{
		TupfR t = mock(TupfR.class);
		
		when(t.isZero()).thenCallRealMethod();
		
		when(t.getDimensions()).thenReturn(2);
		when(t.getByIndex(0)).thenReturn(-1.0f);
		
		assertEquals(false, t.isZero());
		
		verify(t).isZero();

		verify(t).getDimensions();
		verify(t).getByIndex(0);
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link TupfR#isZero()} returns false
	 * after checking all components, if only the last component is a positive number
	 * greater zero.
	 */
	@Test
	void isZero_Fail_PositiveTest()
	{
		TupfR t = mock(TupfR.class);
		
		when(t.isZero()).thenCallRealMethod();
		
		when(t.getDimensions()).thenReturn(2);
		when(t.getByIndex(0)).thenReturn(0.0f);
		when(t.getByIndex(1)).thenReturn(1.0f);
		
		assertEquals(false, t.isZero());
		
		verify(t).isZero();

		verify(t).getDimensions();
		verify(t).getByIndex(0);
		verify(t).getByIndex(1);
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link TupfR#isZero()} returns false
	 * after checking all components, if only the last component is a negative number
	 * greater zero.
	 */
	@Test
	void isZero_Fail_NTest()
	{
		TupfR t = mock(TupfR.class);
		
		when(t.isZero()).thenCallRealMethod();
		
		when(t.getDimensions()).thenReturn(2);
		when(t.getByIndex(0)).thenReturn(0.0f);
		when(t.getByIndex(1)).thenReturn(-1.0f);
		
		assertEquals(false, t.isZero());
		
		verify(t).isZero();

		verify(t).getDimensions();
		verify(t).getByIndex(0);
		verify(t).getByIndex(1);
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link TupfR#isZeroWithMargin(double)} returns true,
	 * if all components are exactly +0.0f.
	 */
	@Test
	void isZeroWithMargin_Zero_PositiveTest()
	{
		TupfR t = mock(TupfR.class);
		
		when(t.isZeroWithMargin(2.0f)).thenCallRealMethod();
		
		when(t.getDimensions()).thenReturn(2);
		when(t.getByIndex(0)).thenReturn(0.0f);
		when(t.getByIndex(1)).thenReturn(0.0f);

		assertEquals(true, t.isZeroWithMargin(2.0f));
		
		verify(t).isZeroWithMargin(2.0f);
		
		verify(t).getDimensions();
		verify(t).getByIndex(0);
		verify(t).getByIndex(1);
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link TupfR#isZeroWithMargin(double)} returns true,
	 * if all components are exactly -0.0f.
	 */
	@Test
	void isZeroWithMargin_Zero_NegativeTest()
	{
		TupfR t = mock(TupfR.class);
		
		when(t.isZeroWithMargin(2.0f)).thenCallRealMethod();
		
		when(t.getDimensions()).thenReturn(2);
		when(t.getByIndex(0)).thenReturn(-0.0f);
		when(t.getByIndex(1)).thenReturn(-0.0f);

		assertEquals(true, t.isZeroWithMargin(2.0f));
		
		verify(t).isZeroWithMargin(2.0f);
		
		verify(t).getDimensions();
		verify(t).getByIndex(0);
		verify(t).getByIndex(1);
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link TupfR#isZeroWithMargin(double)} returns true,
	 * if all components are at the positive extreme point that is the inclusive
	 * tolerance parameter.
	 */
	@Test
	void isZeroWithMargin_Extreme_PositiveTest()
	{
		TupfR t = mock(TupfR.class);
		
		when(t.isZeroWithMargin(2.0f)).thenCallRealMethod();
		
		when(t.getDimensions()).thenReturn(2);
		when(t.getByIndex(0)).thenReturn(2.0f);
		when(t.getByIndex(1)).thenReturn(2.0f);

		assertEquals(true, t.isZeroWithMargin(2.0f));
		
		verify(t).isZeroWithMargin(2.0f);

		verify(t).getDimensions();
		verify(t).getByIndex(0);
		verify(t).getByIndex(1);
		
		verifyNoMoreInteractions(t);
	}
	
		/**
	 * This test ensures, that the function {@link TupfR#isZeroWithMargin(double)} returns true,
	 * if all components are at the negative extreme point that is the inclusive
	 * tolerance parameter.
	 */
	@Test
	void isZeroWithMargin_Extreme_NegativeTest()
	{
		TupfR t = mock(TupfR.class);
		
		when(t.isZeroWithMargin(2.0f)).thenCallRealMethod();
		
		when(t.getDimensions()).thenReturn(2);
		when(t.getByIndex(0)).thenReturn(-2.0f);
		when(t.getByIndex(1)).thenReturn(-2.0f);

		assertEquals(true, t.isZeroWithMargin(2.0f));
		
		verify(t).isZeroWithMargin(2.0f);

		verify(t).getDimensions();
		verify(t).getByIndex(0);
		verify(t).getByIndex(1);
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link TupfR#isZeroWithMargin(double)} returns false
	 * after checking the first component, if the first component exceeds the positive
	 * extreme point that is the inclusive tolerance parameter.
	 */
	@Test
	void isZeroWithMargin_FailEarly_PositiveTest()
	{
		TupfR t = mock(TupfR.class);
		
		when(t.isZeroWithMargin(2.0f)).thenCallRealMethod();
		
		when(t.getDimensions()).thenReturn(2);
		when(t.getByIndex(0)).thenReturn(3.0f);

		assertEquals(false, t.isZeroWithMargin(2.0f));
		
		verify(t).isZeroWithMargin(2.0f);

		verify(t).getDimensions();
		verify(t).getByIndex(0);
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link TupfR#isZeroWithMargin(double)} returns false
	 * after checking the first component, if the first component exceeds the negative
	 * extreme point that is the inclusive tolerance parameter.
	 */
	@Test
	void isZeroWithMargin_FailEarly_NegativeTest()
	{
		TupfR t = mock(TupfR.class);
		
		when(t.isZeroWithMargin(2.0f)).thenCallRealMethod();
		
		when(t.getDimensions()).thenReturn(2);
		when(t.getByIndex(0)).thenReturn(-3.0f);

		assertEquals(false, t.isZeroWithMargin(2.0f));
		
		verify(t).isZeroWithMargin(2.0f);

		verify(t).getDimensions();
		verify(t).getByIndex(0);
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link TupfR#isZeroWithMargin(double)} returns false
	 * after checking all components, if only the last component exceeds the positive
	 * extreme point that is the inclusive tolerance parameter.
	 */
	@Test
	void isZeroWithMargin_Fail_PositiveTest()
	{
		TupfR t = mock(TupfR.class);
		
		when(t.isZeroWithMargin(2.0f)).thenCallRealMethod();
		
		when(t.getDimensions()).thenReturn(2);
		when(t.getByIndex(0)).thenReturn(0.0f);
		when(t.getByIndex(1)).thenReturn(3.0f);

		assertEquals(false, t.isZeroWithMargin(2.0f));
		
		verify(t).isZeroWithMargin(2.0f);

		verify(t).getDimensions();
		verify(t).getByIndex(0);
		verify(t).getByIndex(1);
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link TupfR#isZeroWithMargin(double)} returns false
	 * after checking all components, if only the last component exceeds the negative
	 * extreme point that is the inclusive tolerance parameter.
	 */
	@Test
	void isZeroWithMargin_Fail_NegativeTest()
	{
		TupfR t = mock(TupfR.class);
		
		when(t.isZeroWithMargin(2.0f)).thenCallRealMethod();
		
		when(t.getDimensions()).thenReturn(2);
		when(t.getByIndex(0)).thenReturn(0.0f);
		when(t.getByIndex(1)).thenReturn(-3.0f);

		assertEquals(false, t.isZeroWithMargin(2.0f));
		
		verify(t).isZeroWithMargin(2.0f);

		verify(t).getDimensions();
		verify(t).getByIndex(0);
		verify(t).getByIndex(1);
		
		verifyNoMoreInteractions(t);
	}
}