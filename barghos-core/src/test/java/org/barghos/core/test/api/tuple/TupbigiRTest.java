package org.barghos.core.test.api.tuple;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;

import java.math.BigInteger;

import org.barghos.core.api.tuple.TupbigiR;

/**
 * This class provides component tests for the interface {@link TupbigiR}.
 * 
 * @author picatrix1899
 */
class TupbigiRTest
{
	/**
	 * This test ensures, that the function {@link TupbigiR#isFinite()} returns
	 * always true and doesn't do any calls.
	 */
	@Test
	void isFiniteTest()
	{
		TupbigiR t = mock(TupbigiR.class);
		
		when(t.isFinite()).thenCallRealMethod();
		
		assertEquals(true, t.isFinite());

		verify(t).isFinite();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link TupbigiR#isValid()} returns true
	 * if none of the components is null.
	 */
	@Test
	void isValidTest()
	{
		TupbigiR t = mock(TupbigiR.class);
		
		when(t.isValid()).thenCallRealMethod();
		
		when(t.getDimensions()).thenReturn(2);
		when(t.getByIndex(0)).thenReturn(BigInteger.ONE);
		when(t.getByIndex(1)).thenReturn(BigInteger.ONE);
		
		assertEquals(true, t.isValid());
		
		verify(t).isValid();
		
		verify(t).getDimensions();
		verify(t).getByIndex(0);
		verify(t).getByIndex(1);
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link TupbigiR#isValid()} returns false
	 * after checking the first component, if the first component is null.
	 */
	@Test
	void isValid_FailEarlyTest()
	{
		TupbigiR t = mock(TupbigiR.class);
		
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
	 * This test ensures, that the function {@link TupbigiR#isValid()} returns false
	 * after checking all components, if only the last component is null.
	 */
	@Test
	void isValid_FailTest()
	{
		TupbigiR t = mock(TupbigiR.class);
		
		when(t.isValid()).thenCallRealMethod();
		
		when(t.getDimensions()).thenReturn(2);
		when(t.getByIndex(0)).thenReturn(BigInteger.ONE);
		when(t.getByIndex(1)).thenReturn(null);
		
		assertEquals(false, t.isValid());
		
		verify(t).isValid();

		verify(t).getDimensions();
		verify(t).getByIndex(0);
		verify(t).getByIndex(1);
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link TupbigiR#isZero()} returns true
	 * if all components are {@link BigInteger#ZERO}.
	 */
	@Test
	void isZero_ZeroTest()
	{
		TupbigiR t = mock(TupbigiR.class);
		
		when(t.isZero()).thenCallRealMethod();
		
		when(t.getDimensions()).thenReturn(2);
		when(t.getByIndex(0)).thenReturn(BigInteger.ZERO);
		when(t.getByIndex(1)).thenReturn(BigInteger.ZERO);
		
		assertEquals(true, t.isZero());
		
		verify(t).isZero();
		
		verify(t).getDimensions();
		verify(t).getByIndex(0);
		verify(t).getByIndex(1);
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link TupbigiR#isZero()} returns false
	 * after checking the first component, if the first component is a positive number
	 * greater zero.
	 */
	@Test
	void isZero_FailEarly_PositiveTest()
	{
		TupbigiR t = mock(TupbigiR.class);
		
		when(t.isZero()).thenCallRealMethod();
		
		when(t.getDimensions()).thenReturn(2);
		when(t.getByIndex(0)).thenReturn(BigInteger.ONE);
		
		assertEquals(false, t.isZero());
		
		verify(t).isZero();
		
		verify(t).getDimensions();
		verify(t).getByIndex(0);
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link TupbigiR#isZero()} returns false
	 * after checking the first component, if the first component is a negative number
	 * greater zero.
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
	 * This test ensures, that the function {@link TupbigiR#isZero()} returns false
	 * after checking all components, if only the last component is a positive number
	 * greater zero.
	 */
	@Test
	void isZero_Fail_PositiveTest()
	{
		TupbigiR t = mock(TupbigiR.class);
		
		when(t.isZero()).thenCallRealMethod();
		
		when(t.getDimensions()).thenReturn(2);
		when(t.getByIndex(0)).thenReturn(BigInteger.ZERO);
		when(t.getByIndex(1)).thenReturn(BigInteger.ONE);
		
		assertEquals(false, t.isZero());
		
		verify(t).isZero();
		
		verify(t).getDimensions();
		verify(t).getByIndex(0);
		verify(t).getByIndex(1);
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link TupbigiR#isZero()} returns false
	 * after checking all components, if only the last component is a negative number
	 * greater zero.
	 */
	@Test
	void isZero_Fail_NegativeTest()
	{
		TupbigiR t = mock(TupbigiR.class);
		
		when(t.isZero()).thenCallRealMethod();
		
		when(t.getDimensions()).thenReturn(2);
		when(t.getByIndex(0)).thenReturn(BigInteger.ZERO);
		when(t.getByIndex(1)).thenReturn(BigInteger.valueOf(-1));
		
		assertEquals(false, t.isZero());
		
		verify(t).isZero();

		verify(t).getDimensions();
		verify(t).getByIndex(0);
		verify(t).getByIndex(1);
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link TupbigiR#isZeroWithMargin(BigInteger)} returns true,
	 * if all components are exactly {@link BigInteger#ZERO}.
	 */
	@Test
	void isZeroWithMargin_ZeroTest()
	{
		TupbigiR t = mock(TupbigiR.class);
		
		when(t.isZeroWithMargin(BigInteger.valueOf(2))).thenCallRealMethod();
		
		when(t.getDimensions()).thenReturn(2);
		when(t.getByIndex(0)).thenReturn(BigInteger.ZERO);
		when(t.getByIndex(1)).thenReturn(BigInteger.ZERO);

		assertEquals(true, t.isZeroWithMargin(BigInteger.valueOf(2)));
		
		verify(t).isZeroWithMargin(BigInteger.valueOf(2));

		verify(t).getDimensions();
		verify(t).getByIndex(0);
		verify(t).getByIndex(1);
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link TupbigiR#isZeroWithMargin(BigInteger)} returns true,
	 * if all components are at the positive extreme point that is the inclusive
	 * tolerance parameter.
	 */
	@Test
	void isZeroWithMargin_Extreme_PositiveTest()
	{
		TupbigiR t = mock(TupbigiR.class);
		
		when(t.isZeroWithMargin(BigInteger.valueOf(2))).thenCallRealMethod();
		
		when(t.getDimensions()).thenReturn(2);
		when(t.getByIndex(0)).thenReturn(BigInteger.valueOf(2));
		when(t.getByIndex(1)).thenReturn(BigInteger.valueOf(2));

		assertEquals(true, t.isZeroWithMargin(BigInteger.valueOf(2)));
		
		verify(t).isZeroWithMargin(BigInteger.valueOf(2));
		
		verify(t).getDimensions();
		verify(t).getByIndex(0);
		verify(t).getByIndex(1);
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link TupbigiR#isZeroWithMargin(BigInteger)} returns true,
	 * if all components are at the negative extreme point that is the inclusive
	 * tolerance parameter.
	 */
	@Test
	void isZeroWithMargin_Extreme_NegativeTest()
	{
		TupbigiR t = mock(TupbigiR.class);
		
		when(t.isZeroWithMargin(BigInteger.valueOf(2))).thenCallRealMethod();
		
		when(t.getDimensions()).thenReturn(2);
		when(t.getByIndex(0)).thenReturn(BigInteger.valueOf(-2));
		when(t.getByIndex(1)).thenReturn(BigInteger.valueOf(-2));

		assertEquals(true, t.isZeroWithMargin(BigInteger.valueOf(2)));
		
		verify(t).isZeroWithMargin(BigInteger.valueOf(2));

		verify(t).getDimensions();
		verify(t).getByIndex(0);
		verify(t).getByIndex(1);
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link TupbigiR#isZeroWithMargin(BigInteger)} returns false
	 * after checking the first component, if the first component exceeds the positive
	 * extreme point that is the inclusive tolerance parameter.
	 */
	@Test
	void isZeroWithMargin_FailEarly_PositiveTest()
	{
		TupbigiR t = mock(TupbigiR.class);
		
		when(t.isZeroWithMargin(BigInteger.valueOf(2))).thenCallRealMethod();
		
		when(t.getDimensions()).thenReturn(2);
		when(t.getByIndex(0)).thenReturn(BigInteger.valueOf(3));

		assertEquals(false, t.isZeroWithMargin(BigInteger.valueOf(2)));
		
		verify(t).isZeroWithMargin(BigInteger.valueOf(2));

		verify(t).getDimensions();
		verify(t).getByIndex(0);
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link TupbigiR#isZeroWithMargin(BigInteger)} returns false
	 * after checking the first component, if the first component exceeds the negative
	 * extreme point that is the inclusive tolerance parameter.
	 */
	@Test
	void isZeroWithMargin_FailEarly_NegativeTest()
	{
		TupbigiR t = mock(TupbigiR.class);
		
		when(t.isZeroWithMargin(BigInteger.valueOf(2))).thenCallRealMethod();
		
		when(t.getDimensions()).thenReturn(2);
		when(t.getByIndex(0)).thenReturn(BigInteger.valueOf(-3));

		assertEquals(false, t.isZeroWithMargin(BigInteger.valueOf(2)));
		
		verify(t).isZeroWithMargin(BigInteger.valueOf(2));
		
		verify(t).getDimensions();
		verify(t).getByIndex(0);
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link TupbigiR#isZeroWithMargin(BigInteger)} returns false
	 * after checking all components, if only the last component exceeds the positive
	 * extreme point that is the inclusive tolerance parameter.
	 */
	@Test
	void isZeroWithMargin_Fail_PositiveTest()
	{
		TupbigiR t = mock(TupbigiR.class);
		
		when(t.isZeroWithMargin(BigInteger.valueOf(2))).thenCallRealMethod();
		
		when(t.getDimensions()).thenReturn(2);
		when(t.getByIndex(0)).thenReturn(BigInteger.ZERO);
		when(t.getByIndex(1)).thenReturn(BigInteger.valueOf(3));

		assertEquals(false, t.isZeroWithMargin(BigInteger.valueOf(2)));
		
		verify(t).isZeroWithMargin(BigInteger.valueOf(2));

		verify(t).getDimensions();
		verify(t).getByIndex(0);
		verify(t).getByIndex(1);
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link TupbigiR#isZeroWithMargin(BigInteger)} returns false
	 * after checking all components, if only the last component exceeds the negative
	 * extreme point that is the inclusive tolerance parameter.
	 */
	@Test
	void isZeroWithMargin_Fail_NegativeTest()
	{
		TupbigiR t = mock(TupbigiR.class);
		
		when(t.isZeroWithMargin(BigInteger.valueOf(2))).thenCallRealMethod();
		
		when(t.getDimensions()).thenReturn(2);
		when(t.getByIndex(0)).thenReturn(BigInteger.ZERO);
		when(t.getByIndex(1)).thenReturn(BigInteger.valueOf(-3));

		assertEquals(false, t.isZeroWithMargin(BigInteger.valueOf(2)));
		
		verify(t).isZeroWithMargin(BigInteger.valueOf(2));

		verify(t).getDimensions();
		verify(t).getByIndex(0);
		verify(t).getByIndex(1);
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the default implementation of the function {@link TupbigiR#getNewInstance(TupbigiR)} calls
	 * the function {@link TupbigiR#getNewInstance(BigInteger[])} with the correct components.
	 */
	@Test
	void getNewInstance_TupleTest()
	{
		TupbigiR original = mock(TupbigiR.class);
		TupbigiR newInstance = mock(TupbigiR.class);
		TupbigiR t = mock(TupbigiR.class);
		
		when(t.getNewInstance(original)).thenCallRealMethod();
		
		when(original.getArray()).thenReturn(new BigInteger[] {BigInteger.ONE, BigInteger.valueOf(2)});
		when(t.getNewInstanceFromArray(new BigInteger[] {BigInteger.ONE, BigInteger.valueOf(2)})).thenReturn(newInstance);
		
		assertSame(newInstance, t.getNewInstance(original));
		
		verify(t).getNewInstance(original);

		verify(original).getArray();
		verify(t).getNewInstanceFromArray(new BigInteger[] {BigInteger.ONE, BigInteger.valueOf(2)});
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the default implementation of the function {@link TupbigiR#getNewInstance(BigInteger)} calls
	 * the function {@link TupbigiR#getNewInstanceFromArray(BigInteger[])} with the correct components.
	 */
	@Test
	void getNewInstance_ValueTest()
	{
		TupbigiR newInstance = mock(TupbigiR.class);
		TupbigiR t = mock(TupbigiR.class);
		
		when(t.getNewInstance(BigInteger.ONE)).thenCallRealMethod();
		
		when(t.getDimensions()).thenReturn(2);
		when(t.getNewInstanceFromArray(new BigInteger[] {BigInteger.ONE, BigInteger.ONE})).thenReturn(newInstance);
		
		assertSame(newInstance, t.getNewInstance(BigInteger.ONE));
		
		verify(t).getNewInstance(BigInteger.ONE);

		verify(t).getDimensions();
		verify(t).getNewInstanceFromArray(new BigInteger[] {BigInteger.ONE, BigInteger.ONE});
		
		verifyNoMoreInteractions(t);
	}
}