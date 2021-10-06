package org.barghos.core.test.api.tuple;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;

import org.barghos.core.api.tuple.TuplR;

/**
 * This class provides component tests for the interface {@link TuplR}.
 * 
 * @author picatrix1899
 */
class TuplRTest
{
	/**
	 * This test ensures, that the function {@link TuplR#isFinite()} returns always
	 * true and does not make any calls.
	 */
	@Test
	void isFiniteTest()
	{
		TuplR t = mock(TuplR.class);
		
		when(t.isFinite()).thenCallRealMethod();
		
		assertEquals(true, t.isFinite());
		
		verify(t).isFinite();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link TuplR#isValid()} returns always
	 * true and does not make any calls.
	 */
	@Test
	void isValidTest()
	{
		TuplR t = mock(TuplR.class);
		
		when(t.isValid()).thenCallRealMethod();
		
		assertEquals(true, t.isValid());
		
		verify(t).isValid();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link TuplR#isZero()} returns true
	 * if all components are 0.0.
	 */
	@Test
	void isZero_ZeroTest()
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
	 * after checking the first component, if the first component is a positive number
	 * greater zero.
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
	 * after checking the first component, if the first component is a negative number
	 * greater zero.
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
	 * after checking all components, if only the last component is a positive number
	 * greater zero.
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
	 * after checking all components, if only the last component is a negative number
	 * greater zero.
	 */
	@Test
	void isZero_Fail_NTest()
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
	 * This test ensures, that the function {@link TuplR#isZeroWithMargin(long)} returns true,
	 * if all components are exactly 0.0.
	 */
	@Test
	void isZeroWithMargin_ZeroTest()
	{
		TuplR t = mock(TuplR.class);
		
		when(t.isZeroWithMargin(2l)).thenCallRealMethod();
		
		when(t.getDimensions()).thenReturn(2);
		when(t.getByIndex(0)).thenReturn(0l);
		when(t.getByIndex(1)).thenReturn(0l);

		assertEquals(true, t.isZeroWithMargin(2l));
		
		verify(t).isZeroWithMargin(2l);
		
		verify(t).getDimensions();
		verify(t).getByIndex(0);
		verify(t).getByIndex(1);
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link TuplR#isZeroWithMargin(long)} returns true,
	 * if all components are at the positive extreme point that is the inclusive
	 * tolerance parameter.
	 */
	@Test
	void isZeroWithMargin_Extreme_PositiveTest()
	{
		TuplR t = mock(TuplR.class);
		
		when(t.isZeroWithMargin(2l)).thenCallRealMethod();
		
		when(t.getDimensions()).thenReturn(2);
		when(t.getByIndex(0)).thenReturn(2l);
		when(t.getByIndex(1)).thenReturn(2l);

		assertEquals(true, t.isZeroWithMargin(2l));
		
		verify(t).isZeroWithMargin(2l);

		verify(t).getDimensions();
		verify(t).getByIndex(0);
		verify(t).getByIndex(1);
		
		verifyNoMoreInteractions(t);
	}
	
		/**
	 * This test ensures, that the function {@link TuplR#isZeroWithMargin(long)} returns true,
	 * if all components are at the negative extreme point that is the inclusive
	 * tolerance parameter.
	 */
	@Test
	void isZeroWithMargin_Extreme_NegativeTest()
	{
		TuplR t = mock(TuplR.class);
		
		when(t.isZeroWithMargin(2l)).thenCallRealMethod();
		
		when(t.getDimensions()).thenReturn(2);
		when(t.getByIndex(0)).thenReturn(-2l);
		when(t.getByIndex(1)).thenReturn(-2l);

		assertEquals(true, t.isZeroWithMargin(2l));
		
		verify(t).isZeroWithMargin(2l);

		verify(t).getDimensions();
		verify(t).getByIndex(0);
		verify(t).getByIndex(1);
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link TuplR#isZeroWithMargin(long)} returns false
	 * after checking the first component, if the first component exceeds the positive
	 * extreme point that is the inclusive tolerance parameter.
	 */
	@Test
	void isZeroWithMargin_FailEarly_PositiveTest()
	{
		TuplR t = mock(TuplR.class);
		
		when(t.isZeroWithMargin(2l)).thenCallRealMethod();
		
		when(t.getDimensions()).thenReturn(2);
		when(t.getByIndex(0)).thenReturn(3l);

		assertEquals(false, t.isZeroWithMargin(2l));
		
		verify(t).isZeroWithMargin(2l);

		verify(t).getDimensions();
		verify(t).getByIndex(0);
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link TuplR#isZeroWithMargin(long)} returns false
	 * after checking the first component, if the first component exceeds the negative
	 * extreme point that is the inclusive tolerance parameter.
	 */
	@Test
	void isZeroWithMargin_FailEarly_NegativeTest()
	{
		TuplR t = mock(TuplR.class);
		
		when(t.isZeroWithMargin(2l)).thenCallRealMethod();
		
		when(t.getDimensions()).thenReturn(2);
		when(t.getByIndex(0)).thenReturn(-3l);

		assertEquals(false, t.isZeroWithMargin(2l));
		
		verify(t).isZeroWithMargin(2l);

		verify(t).getDimensions();
		verify(t).getByIndex(0);
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link TuplR#isZeroWithMargin(long)} returns false
	 * after checking all components, if only the last component exceeds the positive
	 * extreme point that is the inclusive tolerance parameter.
	 */
	@Test
	void isZeroWithMargin_Fail_PositiveTest()
	{
		TuplR t = mock(TuplR.class);
		
		when(t.isZeroWithMargin(2l)).thenCallRealMethod();
		
		when(t.getDimensions()).thenReturn(2);
		when(t.getByIndex(0)).thenReturn(0l);
		when(t.getByIndex(1)).thenReturn(3l);

		assertEquals(false, t.isZeroWithMargin(2l));
		
		verify(t).isZeroWithMargin(2l);

		verify(t).getDimensions();
		verify(t).getByIndex(0);
		verify(t).getByIndex(1);
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link TuplR#isZeroWithMargin(long)} returns false
	 * after checking all components, if only the last component exceeds the negative
	 * extreme point that is the inclusive tolerance parameter.
	 */
	@Test
	void isZeroWithMargin_Fail_NegativeTest()
	{
		TuplR t = mock(TuplR.class);
		
		when(t.isZeroWithMargin(2l)).thenCallRealMethod();
		
		when(t.getDimensions()).thenReturn(2);
		when(t.getByIndex(0)).thenReturn(0l);
		when(t.getByIndex(1)).thenReturn(-3l);

		assertEquals(false, t.isZeroWithMargin(2l));
		
		verify(t).isZeroWithMargin(2l);

		verify(t).getDimensions();
		verify(t).getByIndex(0);
		verify(t).getByIndex(1);
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the default implementation of the function {@link TuplR#getNewInstance(TuplR)} calls
	 * the function {@link TuplR#getNewInstance(long[])} with the correct components.
	 */
	@Test
	void getNewInstance_TupleTest()
	{
		TuplR original = mock(TuplR.class);
		TuplR newInstance = mock(TuplR.class);
		TuplR t = mock(TuplR.class);
		
		when(t.getNewInstance(original)).thenCallRealMethod();
		
		when(original.getArray()).thenReturn(new long[] {1l, 2l});
		when(t.getNewInstanceFromArray(new long[] {1l, 2l})).thenReturn(newInstance);
		
		assertSame(newInstance, t.getNewInstance(original));
		
		verify(t).getNewInstance(original);

		verify(original).getArray();
		verify(t).getNewInstanceFromArray(new long[] {1l, 2l});
		
		verifyNoMoreInteractions(t, original);
	}
	
	/**
	 * This test ensures, that the default implementation of the function {@link TuplR#getNewInstance(long)} calls
	 * the function {@link TuplR#getNewInstanceFromArray(long[])} with the correct components.
	 */
	@Test
	void getNewInstance_ValueTest()
	{
		TuplR newInstance = mock(TuplR.class);
		TuplR t = mock(TuplR.class);
		
		when(t.getNewInstance(1l)).thenCallRealMethod();
		
		when(t.getDimensions()).thenReturn(2);
		when(t.getNewInstanceFromArray(new long[] {1l, 1l})).thenReturn(newInstance);
		
		assertSame(newInstance, t.getNewInstance(1l));
		
		verify(t).getNewInstance(1l);

		verify(t).getDimensions();
		verify(t).getNewInstanceFromArray(new long[] {1l, 1l});
		
		verifyNoMoreInteractions(t);
	}
}