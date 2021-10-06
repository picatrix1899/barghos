package org.barghos.core.test.api.tuple;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import org.barghos.core.api.tuple.TupbigdR;

/**
 * This class provides component tests for the interface {@link TupbigdR}.
 * 
 * @author picatrix1899
 */
class TupbigdRTest
{
	/**
	 * This test ensures, that the function {@link TupbigdR#isFinite()} returns
	 * always true and doesn't do any calls.
	 */
	@Test
	void isFiniteTest()
	{
		TupbigdR t = mock(TupbigdR.class);
		
		when(t.isFinite()).thenCallRealMethod();
		
		assertEquals(true, t.isFinite());
		
		verify(t).isFinite();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link TupbigdR#isValid()} returns true
	 * if none of the components is null.
	 */
	@Test
	void isValidTest()
	{
		TupbigdR t = mock(TupbigdR.class);
		
		when(t.isValid()).thenCallRealMethod();
		
		when(t.getDimensions()).thenReturn(2);
		when(t.getByIndex(0)).thenReturn(BigDecimal.ONE);
		when(t.getByIndex(1)).thenReturn(BigDecimal.ONE);
		
		assertEquals(true, t.isValid());
		
		verify(t).isValid();
		
		verify(t).getDimensions();
		verify(t).getByIndex(0);
		verify(t).getByIndex(1);
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link TupbigdR#isValid()} returns false
	 * after checking the first component, if the first component is null.
	 */
	@Test
	void isValid_FailEarlyTest()
	{
		TupbigdR t = mock(TupbigdR.class);
		
		when(t.isValid()).thenCallRealMethod();
		
		when(t.getDimensions()).thenReturn(2);
		when(t.getByIndex(0)).thenReturn(null);
		
		assertEquals(false, t.isValid());
		
		verify(t).isValid();
		
		verify(t).getDimensions();
		verify(t).getByIndex(0);
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link TupbigdR#isValid()} returns false
	 * after checking all components, if only the last component is null.
	 */
	@Test
	void isValid_FailTest()
	{
		TupbigdR t = mock(TupbigdR.class);
		
		when(t.isValid()).thenCallRealMethod();
		
		when(t.getDimensions()).thenReturn(2);
		when(t.getByIndex(0)).thenReturn(BigDecimal.ONE);
		when(t.getByIndex(1)).thenReturn(null);
		
		assertEquals(false, t.isValid());
		
		verify(t).isValid();
		
		verify(t).getDimensions();
		verify(t).getByIndex(0);
		verify(t).getByIndex(1);
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link TupbigdR#isZero()} returns true
	 * if all components are {@link BigDecimal#ZERO}.
	 */
	@Test
	void isZero_ZeroTest()
	{
		TupbigdR t = mock(TupbigdR.class);
		
		when(t.isZero()).thenCallRealMethod();
		
		when(t.getDimensions()).thenReturn(2);
		when(t.getByIndex(0)).thenReturn(BigDecimal.ZERO);
		when(t.getByIndex(1)).thenReturn(BigDecimal.ZERO);
		
		assertEquals(true, t.isZero());
		
		verify(t).isZero();

		verify(t).getDimensions();
		verify(t).getByIndex(0);
		verify(t).getByIndex(1);
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link TupbigdR#isZero()} returns false
	 * after checking the first component, if the first component is a positive number
	 * greater zero.
	 */
	@Test
	void isZero_FailEarly_PositiveTest()
	{
		TupbigdR t = mock(TupbigdR.class);
		
		when(t.isZero()).thenCallRealMethod();
		
		when(t.getDimensions()).thenReturn(2);
		when(t.getByIndex(0)).thenReturn(BigDecimal.ONE);
		
		assertEquals(false, t.isZero());
		
		verify(t).isZero();
		
		verify(t).getDimensions();
		verify(t).getByIndex(0);
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link TupbigdR#isZero()} returns false
	 * after checking the first component, if the first component is a negative number
	 * greater zero.
	 */
	@Test
	void isZero_FailEarly_NegativeTest()
	{
		TupbigdR t = mock(TupbigdR.class);
		
		when(t.isZero()).thenCallRealMethod();
		
		when(t.getDimensions()).thenReturn(2);
		when(t.getByIndex(0)).thenReturn(BigDecimal.valueOf(-1));
		
		assertEquals(false, t.isZero());
		
		verify(t).isZero();

		verify(t).getDimensions();
		verify(t).getByIndex(0);
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link TupbigdR#isZero()} returns false
	 * after checking all components, if only the last component is a positive number
	 * greater zero.
	 */
	@Test
	void isZero_Fail_PositiveTest()
	{
		TupbigdR t = mock(TupbigdR.class);
		
		when(t.isZero()).thenCallRealMethod();
		
		when(t.getDimensions()).thenReturn(2);
		when(t.getByIndex(0)).thenReturn(BigDecimal.ZERO);
		when(t.getByIndex(1)).thenReturn(BigDecimal.ONE);
		
		assertEquals(false, t.isZero());
		
		verify(t).isZero();

		verify(t).getDimensions();
		verify(t).getByIndex(0);
		verify(t).getByIndex(1);
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link TupbigdR#isZero()} returns false
	 * after checking all components, if only the last component is a negative number
	 * greater zero.
	 */
	@Test
	void isZero_Fail_NegativeTest()
	{
		TupbigdR t = mock(TupbigdR.class);
		
		when(t.isZero()).thenCallRealMethod();
		
		when(t.getDimensions()).thenReturn(2);
		when(t.getByIndex(0)).thenReturn(BigDecimal.ZERO);
		when(t.getByIndex(1)).thenReturn(BigDecimal.valueOf(-1));
		
		assertEquals(false, t.isZero());
		
		verify(t).isZero();

		verify(t).getDimensions();
		verify(t).getByIndex(0);
		verify(t).getByIndex(1);
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link TupbigdR#isZeroWithMargin(BigDecimal)} returns true,
	 * if all components are exactly {@link BigDecimal#ZERO}.
	 */
	@Test
	void isZeroWithMargin_ZeroTest()
	{
		TupbigdR t = mock(TupbigdR.class);
		
		when(t.isZeroWithMargin(BigDecimal.valueOf(2))).thenCallRealMethod();
		
		when(t.getDimensions()).thenReturn(2);
		when(t.getByIndex(0)).thenReturn(BigDecimal.ZERO);
		when(t.getByIndex(1)).thenReturn(BigDecimal.ZERO);

		assertEquals(true, t.isZeroWithMargin(BigDecimal.valueOf(2)));
		
		verify(t).isZeroWithMargin(BigDecimal.valueOf(2));

		verify(t).getDimensions();
		verify(t).getByIndex(0);
		verify(t).getByIndex(1);
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link TupbigdR#isZeroWithMargin(BigDecimal)} returns true,
	 * if all components are at the positive extreme point that is the inclusive
	 * tolerance parameter.
	 */
	@Test
	void isZeroWithMargin_Extreme_PositiveTest()
	{
		TupbigdR t = mock(TupbigdR.class);
		
		when(t.isZeroWithMargin(BigDecimal.valueOf(2))).thenCallRealMethod();
		
		when(t.getDimensions()).thenReturn(2);
		when(t.getByIndex(0)).thenReturn(BigDecimal.valueOf(2));
		when(t.getByIndex(1)).thenReturn(BigDecimal.valueOf(2));

		assertEquals(true, t.isZeroWithMargin(BigDecimal.valueOf(2)));
		
		verify(t).isZeroWithMargin(BigDecimal.valueOf(2));

		verify(t).getDimensions();
		verify(t).getByIndex(0);
		verify(t).getByIndex(1);
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link TupbigdR#isZeroWithMargin(BigDecimal)} returns true,
	 * if all components are at the negative extreme point that is the inclusive
	 * tolerance parameter.
	 */
	@Test
	void isZeroWithMargin_Extreme_NegativeTest()
	{
		TupbigdR t = mock(TupbigdR.class);
		
		when(t.isZeroWithMargin(BigDecimal.valueOf(2))).thenCallRealMethod();
		
		when(t.getDimensions()).thenReturn(2);
		when(t.getByIndex(0)).thenReturn(BigDecimal.valueOf(-2));
		when(t.getByIndex(1)).thenReturn(BigDecimal.valueOf(-2));

		assertEquals(true, t.isZeroWithMargin(BigDecimal.valueOf(2)));
		
		verify(t).isZeroWithMargin(BigDecimal.valueOf(2));

		verify(t).getDimensions();
		verify(t).getByIndex(0);
		verify(t).getByIndex(1);
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link TupbigdR#isZeroWithMargin(BigDecimal)} returns false
	 * after checking the first component, if the first component exceeds the positive
	 * extreme point that is the inclusive tolerance parameter.
	 */
	@Test
	void isZeroWithMargin_FailEarly_PositiveTest()
	{
		TupbigdR t = mock(TupbigdR.class);
		
		when(t.isZeroWithMargin(BigDecimal.valueOf(2))).thenCallRealMethod();
		
		when(t.getDimensions()).thenReturn(2);
		when(t.getByIndex(0)).thenReturn(BigDecimal.valueOf(3));

		assertEquals(false, t.isZeroWithMargin(BigDecimal.valueOf(2)));
		
		verify(t).isZeroWithMargin(BigDecimal.valueOf(2));

		verify(t).getDimensions();
		verify(t).getByIndex(0);
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link TupbigdR#isZeroWithMargin(BigDecimal)} returns false
	 * after checking the first component, if the first component exceeds the negative
	 * extreme point that is the inclusive tolerance parameter.
	 */
	@Test
	void isZeroWithMargin_FailEarly_NegativeTest()
	{
		TupbigdR t = mock(TupbigdR.class);
		
		when(t.isZeroWithMargin(BigDecimal.valueOf(2))).thenCallRealMethod();
		
		when(t.getDimensions()).thenReturn(2);
		when(t.getByIndex(0)).thenReturn(BigDecimal.valueOf(-3));

		assertEquals(false, t.isZeroWithMargin(BigDecimal.valueOf(2)));
		
		verify(t).isZeroWithMargin(BigDecimal.valueOf(2));
		
		verify(t).getDimensions();
		verify(t).getByIndex(0);
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link TupbigdR#isZeroWithMargin(BigDecimal)} returns false
	 * after checking all components, if only the last component exceeds the positive
	 * extreme point that is the inclusive tolerance parameter.
	 */
	@Test
	void isZeroWithMargin_Fail_PositiveTest()
	{
		TupbigdR t = mock(TupbigdR.class);
		
		when(t.isZeroWithMargin(BigDecimal.valueOf(2))).thenCallRealMethod();
		
		when(t.getDimensions()).thenReturn(2);
		when(t.getByIndex(0)).thenReturn(BigDecimal.ZERO);
		when(t.getByIndex(1)).thenReturn(BigDecimal.valueOf(3));

		assertEquals(false, t.isZeroWithMargin(BigDecimal.valueOf(2)));
		
		verify(t).isZeroWithMargin(BigDecimal.valueOf(2));

		verify(t).getDimensions();
		verify(t).getByIndex(0);
		verify(t).getByIndex(1);
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link TupbigdR#isZeroWithMargin(BigDecimal)} returns false
	 * after checking all components, if only the last component exceeds the negative
	 * extreme point that is the inclusive tolerance parameter.
	 */
	@Test
	void isZeroWithMargin_Fail_NegativeTest()
	{
		TupbigdR t = mock(TupbigdR.class);
		
		when(t.isZeroWithMargin(BigDecimal.valueOf(2))).thenCallRealMethod();
		
		when(t.getDimensions()).thenReturn(2);
		when(t.getByIndex(0)).thenReturn(BigDecimal.ZERO);
		when(t.getByIndex(1)).thenReturn(BigDecimal.valueOf(-3));
		
		assertEquals(false, t.isZeroWithMargin(BigDecimal.valueOf(2)));
		
		verify(t).isZeroWithMargin(BigDecimal.valueOf(2));
		
		verify(t).getDimensions();
		verify(t).getByIndex(0);
		verify(t).getByIndex(1);
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the default implementation of the function {@link TupbigdR#getNewInstance(TupbigdR)} calls
	 * the function {@link TupbigdR#getNewInstance(BigDecimal[])} with the correct components.
	 */
	@Test
	void getNewInstance_TupleTest()
	{
		TupbigdR original = mock(TupbigdR.class);
		TupbigdR newInstance = mock(TupbigdR.class);
		TupbigdR t = mock(TupbigdR.class);
		
		when(t.getNewInstance(original)).thenCallRealMethod();
		
		when(original.getArray()).thenReturn(new BigDecimal[] {BigDecimal.ONE, BigDecimal.valueOf(2)});
		when(t.getNewInstanceFromArray(new BigDecimal[] {BigDecimal.ONE, BigDecimal.valueOf(2)})).thenReturn(newInstance);
		
		assertSame(newInstance, t.getNewInstance(original));

		verify(t).getNewInstance(original);
		
		verify(original).getArray();
		verify(t).getNewInstanceFromArray(new BigDecimal[] {BigDecimal.ONE, BigDecimal.valueOf(2)});
		
		verifyNoMoreInteractions(t, original);
	}
	
	/**
	 * This test ensures, that the default implementation of the function {@link TupbigdR#getNewInstance(BigDecimal)} calls
	 * the function {@link TupbigdR#getNewInstanceFromArray(BigDecimal[])} with the correct components.
	 */
	@Test
	void getNewInstance_ValueTest()
	{
		TupbigdR newInstance = mock(TupbigdR.class);
		TupbigdR t = mock(TupbigdR.class);
		
		when(t.getNewInstance(BigDecimal.ONE)).thenCallRealMethod();
		
		when(t.getDimensions()).thenReturn(2);
		when(t.getNewInstanceFromArray(new BigDecimal[] {BigDecimal.ONE, BigDecimal.ONE})).thenReturn(newInstance);
		
		assertSame(newInstance, t.getNewInstance(BigDecimal.ONE));

		verify(t).getNewInstance(BigDecimal.ONE);
		
		verify(t).getDimensions();
		verify(t).getNewInstanceFromArray(new BigDecimal[] {BigDecimal.ONE, BigDecimal.ONE});
		
		verifyNoMoreInteractions(t);
	}
}