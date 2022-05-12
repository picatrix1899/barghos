package org.barghos.core.test.api.tuple;

import static org.barghos.testutils.TestObjectFactory.*;
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
		when(t.getByIndex(0)).thenReturn(bigd(1));
		when(t.getByIndex(1)).thenReturn(bigd(1));
		
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
		when(t.getByIndex(0)).thenReturn(bigd(1));
		when(t.getByIndex(1)).thenReturn(null);
		
		assertEquals(false, t.isValid());
		
		verify(t).isValid();
		
		verify(t).getDimensions();
		verify(t).getByIndex(0);
		verify(t).getByIndex(1);
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link TupbigdR#isExactlyZero()} returns true
	 * if all components are {@link BigDecimal#ZERO}.
	 */
	@Test
	void isExactlyZero_ZeroTest()
	{
		TupbigdR t = mock(TupbigdR.class);
		
		when(t.isExactlyZero()).thenCallRealMethod();
		
		when(t.getDimensions()).thenReturn(2);
		when(t.getByIndex(0)).thenReturn(bigd(0));
		when(t.getByIndex(1)).thenReturn(bigd(0));
		
		assertEquals(true, t.isExactlyZero());
		
		verify(t).isExactlyZero();

		verify(t).getDimensions();
		verify(t).getByIndex(0);
		verify(t).getByIndex(1);
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link TupbigdR#isExactlyZero()} returns false
	 * after checking the first component, if the first component is a positive number
	 * greater zero.
	 */
	@Test
	void isExactlyZero_FailEarly_PositiveTest()
	{
		TupbigdR t = mock(TupbigdR.class);
		
		when(t.isExactlyZero()).thenCallRealMethod();
		
		when(t.getDimensions()).thenReturn(2);
		when(t.getByIndex(0)).thenReturn(bigd(1));
		
		assertEquals(false, t.isExactlyZero());
		
		verify(t).isExactlyZero();
		
		verify(t).getDimensions();
		verify(t).getByIndex(0);
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link TupbigdR#isExactlyZero()} returns false
	 * after checking the first component, if the first component is a negative number
	 * greater zero.
	 */
	@Test
	void isExactlyZero_FailEarly_NegativeTest()
	{
		TupbigdR t = mock(TupbigdR.class);
		
		when(t.isExactlyZero()).thenCallRealMethod();
		
		when(t.getDimensions()).thenReturn(2);
		when(t.getByIndex(0)).thenReturn(bigd(-1));
		
		assertEquals(false, t.isExactlyZero());
		
		verify(t).isExactlyZero();

		verify(t).getDimensions();
		verify(t).getByIndex(0);
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link TupbigdR#isExactlyZero()} returns false
	 * after checking all components, if only the last component is a positive number
	 * greater zero.
	 */
	@Test
	void isExactlyZero_Fail_PositiveTest()
	{
		TupbigdR t = mock(TupbigdR.class);
		
		when(t.isExactlyZero()).thenCallRealMethod();
		
		when(t.getDimensions()).thenReturn(2);
		when(t.getByIndex(0)).thenReturn(bigd(0));
		when(t.getByIndex(1)).thenReturn(bigd(1));
		
		assertEquals(false, t.isExactlyZero());
		
		verify(t).isExactlyZero();

		verify(t).getDimensions();
		verify(t).getByIndex(0);
		verify(t).getByIndex(1);
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link TupbigdR#isExactlyZero()} returns false
	 * after checking all components, if only the last component is a negative number
	 * greater zero.
	 */
	@Test
	void isExactlyZero_Fail_NegativeTest()
	{
		TupbigdR t = mock(TupbigdR.class);
		
		when(t.isExactlyZero()).thenCallRealMethod();
		
		when(t.getDimensions()).thenReturn(2);
		when(t.getByIndex(0)).thenReturn(bigd(0));
		when(t.getByIndex(1)).thenReturn(bigd(-1));
		
		assertEquals(false, t.isExactlyZero());
		
		verify(t).isExactlyZero();

		verify(t).getDimensions();
		verify(t).getByIndex(0);
		verify(t).getByIndex(1);
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link TupbigdR#isZero(BigDecimal)} returns true,
	 * if all components are exactly {@link BigDecimal#ZERO}.
	 */
	@Test
	void isZero_ZeroTest()
	{
		TupbigdR t = mock(TupbigdR.class);
		
		when(t.isZero(bigd(2))).thenCallRealMethod();
		
		when(t.getDimensions()).thenReturn(2);
		when(t.getByIndex(0)).thenReturn(bigd(0));
		when(t.getByIndex(1)).thenReturn(bigd(0));

		assertEquals(true, t.isZero(bigd(2)));
		
		verify(t).isZero(bigd(2));

		verify(t).getDimensions();
		verify(t).getByIndex(0);
		verify(t).getByIndex(1);
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link TupbigdR#isZero(BigDecimal)} returns true,
	 * if all components are at the positive extreme point that is the inclusive
	 * tolerance parameter.
	 */
	@Test
	void isZero_Extreme_PositiveTest()
	{
		TupbigdR t = mock(TupbigdR.class);
		
		when(t.isZero(bigd(2))).thenCallRealMethod();
		
		when(t.getDimensions()).thenReturn(2);
		when(t.getByIndex(0)).thenReturn(bigd(2));
		when(t.getByIndex(1)).thenReturn(bigd(2));

		assertEquals(true, t.isZero(bigd(2)));
		
		verify(t).isZero(bigd(2));

		verify(t).getDimensions();
		verify(t).getByIndex(0);
		verify(t).getByIndex(1);
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link TupbigdR#isZero(BigDecimal)} returns true,
	 * if all components are at the negative extreme point that is the inclusive
	 * tolerance parameter.
	 */
	@Test
	void isZero_Extreme_NegativeTest()
	{
		TupbigdR t = mock(TupbigdR.class);
		
		when(t.isZero(bigd(2))).thenCallRealMethod();
		
		when(t.getDimensions()).thenReturn(2);
		when(t.getByIndex(0)).thenReturn(bigd(-2));
		when(t.getByIndex(1)).thenReturn(bigd(-2));

		assertEquals(true, t.isZero(bigd(2)));
		
		verify(t).isZero(bigd(2));

		verify(t).getDimensions();
		verify(t).getByIndex(0);
		verify(t).getByIndex(1);
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link TupbigdR#isZero(BigDecimal)} returns false
	 * after checking the first component, if the first component exceeds the positive
	 * extreme point that is the inclusive tolerance parameter.
	 */
	@Test
	void isZero_FailEarly_PositiveTest()
	{
		TupbigdR t = mock(TupbigdR.class);
		
		when(t.isZero(bigd(2))).thenCallRealMethod();
		
		when(t.getDimensions()).thenReturn(2);
		when(t.getByIndex(0)).thenReturn(bigd(3));

		assertEquals(false, t.isZero(bigd(2)));
		
		verify(t).isZero(bigd(2));

		verify(t).getDimensions();
		verify(t).getByIndex(0);
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link TupbigdR#isZero(BigDecimal)} returns false
	 * after checking the first component, if the first component exceeds the negative
	 * extreme point that is the inclusive tolerance parameter.
	 */
	@Test
	void isZeroWithMargin_FailEarly_NegativeTest()
	{
		TupbigdR t = mock(TupbigdR.class);
		
		when(t.isZero(bigd(2))).thenCallRealMethod();
		
		when(t.getDimensions()).thenReturn(2);
		when(t.getByIndex(0)).thenReturn(bigd(-3));

		assertEquals(false, t.isZero(bigd(2)));
		
		verify(t).isZero(bigd(2));
		
		verify(t).getDimensions();
		verify(t).getByIndex(0);
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link TupbigdR#isZero(BigDecimal)} returns false
	 * after checking all components, if only the last component exceeds the positive
	 * extreme point that is the inclusive tolerance parameter.
	 */
	@Test
	void isZero_Fail_PositiveTest()
	{
		TupbigdR t = mock(TupbigdR.class);
		
		when(t.isZero(bigd(2))).thenCallRealMethod();
		
		when(t.getDimensions()).thenReturn(2);
		when(t.getByIndex(0)).thenReturn(bigd(0));
		when(t.getByIndex(1)).thenReturn(bigd(3));

		assertEquals(false, t.isZero(bigd(2)));
		
		verify(t).isZero(bigd(2));

		verify(t).getDimensions();
		verify(t).getByIndex(0);
		verify(t).getByIndex(1);
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link TupbigdR#isZero(BigDecimal)} returns false
	 * after checking all components, if only the last component exceeds the negative
	 * extreme point that is the inclusive tolerance parameter.
	 */
	@Test
	void isZero_Fail_NegativeTest()
	{
		TupbigdR t = mock(TupbigdR.class);
		
		when(t.isZero(bigd(2))).thenCallRealMethod();
		
		when(t.getDimensions()).thenReturn(2);
		when(t.getByIndex(0)).thenReturn(bigd(0));
		when(t.getByIndex(1)).thenReturn(bigd(-3));
		
		assertEquals(false, t.isZero(bigd(2)));
		
		verify(t).isZero(bigd(2));
		
		verify(t).getDimensions();
		verify(t).getByIndex(0);
		verify(t).getByIndex(1);
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link TupbigdR#toArray()} calls
	 * the function {@link TupbigdR#toArray(BigDecimal[])} with a new array with the size
	 * equal to the number of dimensions of the tuple.
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
}