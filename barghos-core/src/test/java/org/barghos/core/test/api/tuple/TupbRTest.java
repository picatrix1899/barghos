package org.barghos.core.test.api.tuple;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;

import org.barghos.core.api.tuple.TupbR;

/**
 * This class provides component tests for the interface {@link TupbR}.
 * 
 * @author picatrix1899
 */
class TupbRTest
{
	/**
	 * This test ensures, that the function {@link TupbR#isFinite()} returns
	 * always true and doesn't do any calls.
	 */
	@Test
	void isFiniteTest()
	{
		TupbR t = mock(TupbR.class);
		
		when(t.isFinite()).thenCallRealMethod();
		
		assertEquals(true, t.isFinite());
		
		verify(t).isFinite();

		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link TupbR#isValid()} returns
	 * always true and doesn't do any calls.
	 */
	@Test
	void isValidTest()
	{
		TupbR t = mock(TupbR.class);
		
		when(t.isValid()).thenCallRealMethod();
		
		assertEquals(true, t.isValid());
		
		verify(t).isValid();

		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link TupbR#isZero()} returns true if
	 * all components are exactly zero.
	 */
	@Test
	void isZero_ZeroTest()
	{
		TupbR t = mock(TupbR.class);
		
		when(t.isZero()).thenCallRealMethod();
		
		when(t.getDimensions()).thenReturn(2);
		when(t.getByIndex(0)).thenReturn((byte)0);
		when(t.getByIndex(1)).thenReturn((byte)0);
		
		assertEquals(true, t.isZero());
		
		verify(t).isZero();

		verify(t).getDimensions();
		verify(t).getByIndex(0);
		verify(t).getByIndex(1);
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link TupbR#isZero()} returns false
	 * after checking the first component, if the first component is a positive
	 * number greater zero.
	 */
	@Test
	void isZero_FailEarly_PositiveTest()
	{
		TupbR t = mock(TupbR.class);
		
		when(t.isZero()).thenCallRealMethod();
		
		when(t.getDimensions()).thenReturn(2);
		when(t.getByIndex(0)).thenReturn((byte)1);

		assertEquals(false, t.isZero());
		
		verify(t).isZero();

		verify(t).getDimensions();
		verify(t).getByIndex(0);
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link TupbR#isZero()} returns false
	 * after checking the first component, if the first component is a negative
	 * number greater zero.
	 */
	@Test
	void isZero_FailEarly_NegativeTest()
	{
		TupbR t = mock(TupbR.class);
		
		when(t.isZero()).thenCallRealMethod();
		
		when(t.getDimensions()).thenReturn(2);
		when(t.getByIndex(0)).thenReturn((byte)-1);

		assertEquals(false, t.isZero());
		
		verify(t).isZero();

		verify(t).getDimensions();
		verify(t).getByIndex(0);
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link TupbR#isZero()} returns false
	 * after checking all components, if only the last component is a positive number
	 * greater zero.
	 */
	@Test
	void isZero_Fail_PositiveTest()
	{
		TupbR t = mock(TupbR.class);
		
		when(t.isZero()).thenCallRealMethod();
		
		when(t.getDimensions()).thenReturn(2);
		when(t.getByIndex(0)).thenReturn((byte)0);
		when(t.getByIndex(1)).thenReturn((byte)1);

		assertEquals(false, t.isZero());
		
		verify(t).isZero();

		verify(t).getDimensions();
		verify(t).getByIndex(0);
		verify(t).getByIndex(1);
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link TupbR#isZero()} returns false
	 * after checking all components, if only the last component is a negative number
	 * greater zero.
	 */
	@Test
	void isZero_Fail_NegativeTest()
	{
		TupbR t = mock(TupbR.class);
		
		when(t.isZero()).thenCallRealMethod();
		
		when(t.getDimensions()).thenReturn(2);
		when(t.getByIndex(0)).thenReturn((byte)0);
		when(t.getByIndex(1)).thenReturn((byte)-1);

		assertEquals(false, t.isZero());
		
		verify(t).isZero();

		verify(t).getDimensions();
		verify(t).getByIndex(0);
		verify(t).getByIndex(1);
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link TupbR#isZeroWithMargin(byte)} returns true,
	 * if all components are exactly zero.
	 */
	@Test
	void isZeroWithMargin_ZeroTest()
	{
		TupbR t = mock(TupbR.class);
		
		when(t.isZeroWithMargin((byte)2)).thenCallRealMethod();
		
		when(t.getDimensions()).thenReturn(2);
		when(t.getByIndex(0)).thenReturn((byte)0);
		when(t.getByIndex(1)).thenReturn((byte)0);

		assertEquals(true, t.isZeroWithMargin((byte)2));
		
		verify(t).isZeroWithMargin((byte)2);

		verify(t).getDimensions();
		verify(t).getByIndex(0);
		verify(t).getByIndex(1);
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link TupbR#isZeroWithMargin(byte)} returns true,
	 * if all components are at the positive extreme point that is the inclusive
	 * tolerance parameter.
	 */
	@Test
	void isZeroWithMargin_Extreme_PositiveTest()
	{
		TupbR t = mock(TupbR.class);
		
		when(t.isZeroWithMargin((byte)2)).thenCallRealMethod();
		
		when(t.getDimensions()).thenReturn(2);
		when(t.getByIndex(0)).thenReturn((byte)2);
		when(t.getByIndex(1)).thenReturn((byte)2);

		assertEquals(true, t.isZeroWithMargin((byte)2));
		
		verify(t).isZeroWithMargin((byte)2);

		verify(t).getDimensions();
		verify(t).getByIndex(0);
		verify(t).getByIndex(1);
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link TupbR#isZeroWithMargin(byte)} returns true,
	 * if all components are at the negative extreme point that is the inclusive
	 * tolerance parameter.
	 */
	@Test
	void isZeroWithMargin_Extreme_NegativeTest()
	{
		TupbR t = mock(TupbR.class);
		
		when(t.isZeroWithMargin((byte)2)).thenCallRealMethod();
		
		when(t.getDimensions()).thenReturn(2);
		when(t.getByIndex(0)).thenReturn((byte)-2);
		when(t.getByIndex(1)).thenReturn((byte)-2);

		assertEquals(true, t.isZeroWithMargin((byte)2));
		
		verify(t).isZeroWithMargin((byte)2);

		verify(t).getDimensions();
		verify(t).getByIndex(0);
		verify(t).getByIndex(1);
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link TupbR#isZeroWithMargin(byte)} returns false
	 * after checking the first component, if the first component exceeds the positive
	 * extreme point that is the inclusive tolerance parameter.
	 */
	@Test
	void isZeroWithMargin_FailEarly_PositiveTest()
	{
		TupbR t = mock(TupbR.class);
		
		when(t.isZeroWithMargin((byte)2)).thenCallRealMethod();
		
		when(t.getDimensions()).thenReturn(2);
		when(t.getByIndex(0)).thenReturn((byte)3);

		assertEquals(false, t.isZeroWithMargin((byte)2));
		
		verify(t).isZeroWithMargin((byte)2);

		verify(t).getDimensions();
		verify(t).getByIndex(0);
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link TupbR#isZeroWithMargin(byte)} returns false
	 * after checking the first component, if the first component exceeds the negative
	 * extreme point that is the inclusive tolerance parameter.
	 */
	@Test
	void isZeroWithMargin_FailEarly_NegativeTest()
	{
		TupbR t = mock(TupbR.class);
		
		when(t.isZeroWithMargin((byte)2)).thenCallRealMethod();
		
		when(t.getDimensions()).thenReturn(2);
		when(t.getByIndex(0)).thenReturn((byte)-3);

		assertEquals(false, t.isZeroWithMargin((byte)2));
		
		verify(t).isZeroWithMargin((byte)2);

		verify(t).getDimensions();
		verify(t).getByIndex(0);
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link TupbR#isZeroWithMargin(byte)} returns false
	 * after checking all components, if only the last component exceeds the positive
	 * extreme point that is the inclusive tolerance parameter.
	 */
	@Test
	void isZeroWithMargin_Fail_PositiveTest()
	{
		TupbR t = mock(TupbR.class);
		
		when(t.isZeroWithMargin((byte)2)).thenCallRealMethod();
		
		when(t.getDimensions()).thenReturn(2);
		when(t.getByIndex(0)).thenReturn((byte)0);
		when(t.getByIndex(1)).thenReturn((byte)3);

		assertEquals(false, t.isZeroWithMargin((byte)2));
		
		verify(t).isZeroWithMargin((byte)2);

		verify(t).getDimensions();
		verify(t).getByIndex(0);
		verify(t).getByIndex(1);
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link TupbR#isZeroWithMargin(byte)} returns false
	 * after checking all components, if only the last component exceeds the negative
	 * extreme point that is the inclusive tolerance parameter.
	 */
	@Test
	void isZeroWithMargin_Fail_NegativeTest()
	{
		TupbR t = mock(TupbR.class);
		
		when(t.isZeroWithMargin((byte)2)).thenCallRealMethod();
		
		when(t.getDimensions()).thenReturn(2);
		when(t.getByIndex(0)).thenReturn((byte)0);
		when(t.getByIndex(1)).thenReturn((byte)-3);

		assertEquals(false, t.isZeroWithMargin((byte)2));
		
		verify(t).isZeroWithMargin((byte)2);

		verify(t).getDimensions();
		verify(t).getByIndex(0);
		verify(t).getByIndex(1);
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the default implementation of the function {@link TupbR#getNewInstance(TupbR)} calls
	 * the function {@link TupbR#getNewInstance(byte[])} with the correct components.
	 */
	@Test
	void getNewInstance_TupleTest()
	{
		TupbR original = mock(TupbR.class);
		TupbR newInstance = mock(TupbR.class);
		TupbR t = mock(TupbR.class);
		
		when(t.getNewInstance(original)).thenCallRealMethod();
		
		when(original.getArray()).thenReturn(new byte[] {1, 2});
		when(t.getNewInstanceFromArray(new byte[] {1, 2})).thenReturn(newInstance);
		
		assertSame(newInstance, t.getNewInstance(original));
		
		verify(t).getNewInstance(original);

		verify(original).getArray();
		verify(t).getNewInstanceFromArray(new byte[] {1, 2});
		
		verifyNoMoreInteractions(t, original);
	}
	
	/**
	 * This test ensures, that the default implementation of the function {@link TupbR#getNewInstance(byte)} calls
	 * the function {@link TupbR#getNewInstanceFromArray(byte[])} with the correct components.
	 */
	@Test
	void getNewInstance_ValueTest()
	{
		TupbR newInstance = mock(TupbR.class);
		TupbR t = mock(TupbR.class);
		
		when(t.getNewInstance((byte)1)).thenCallRealMethod();
		
		when(t.getDimensions()).thenReturn(2);
		when(t.getNewInstanceFromArray(new byte[] {1, 1})).thenReturn(newInstance);
		
		assertSame(newInstance, t.getNewInstance((byte)1));
		
		verify(t).getNewInstance((byte)1);

		verify(t).getDimensions();
		verify(t).getNewInstanceFromArray(new byte[] {1, 1});
		
		verifyNoMoreInteractions(t);
	}
}