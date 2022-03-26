package org.barghos.core.test.api.tuple;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;

import org.barghos.core.api.tuple.TupsR;

/**
 * This class provides component tests for the interface {@link TupsR}.
 * 
 * @author picatrix1899
 */
class TupsRTest
{
	/**
	 * This test ensures, that the function {@link TupsR#isFinite()} returns always
	 * true and does not make any calls.
	 */
	@Test
	void isFiniteTest()
	{
		TupsR t = mock(TupsR.class);
		
		when(t.isFinite()).thenCallRealMethod();
		
		assertEquals(true, t.isFinite());
		
		verify(t).isFinite();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link TupsR#isZero()} returns true
	 * if all components are 0.0.
	 */
	@Test
	void isZero_ZeroTest()
	{
		TupsR t = mock(TupsR.class);
		
		when(t.isZero()).thenCallRealMethod();
		
		when(t.getDimensions()).thenReturn(2);
		when(t.getByIndex(0)).thenReturn((short)0);
		when(t.getByIndex(1)).thenReturn((short)0);
		
		assertEquals(true, t.isZero());
		
		verify(t).isZero();
		
		verify(t).getDimensions();
		verify(t).getByIndex(0);
		verify(t).getByIndex(1);
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link TupsR#isZero()} returns false
	 * after checking the first component, if the first component is a positive number
	 * greater zero.
	 */
	@Test
	void isZero_FailEarly_PositiveTest()
	{
		TupsR t = mock(TupsR.class);
		
		when(t.isZero()).thenCallRealMethod();
		
		when(t.getDimensions()).thenReturn(2);
		when(t.getByIndex(0)).thenReturn((short)1);
		
		assertEquals(false, t.isZero());
		
		verify(t).isZero();

		verify(t).getDimensions();
		verify(t).getByIndex(0);
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link TupsR#isZero()} returns false
	 * after checking the first component, if the first component is a negative number
	 * greater zero.
	 */
	@Test
	void isZero_FailEarly_NegativeTest()
	{
		TupsR t = mock(TupsR.class);
		
		when(t.isZero()).thenCallRealMethod();
		
		when(t.getDimensions()).thenReturn(2);
		when(t.getByIndex(0)).thenReturn((short)-1);
		
		assertEquals(false, t.isZero());
		
		verify(t).isZero();

		verify(t).getDimensions();
		verify(t).getByIndex(0);
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link TupsR#isZero()} returns false
	 * after checking all components, if only the last component is a positive number
	 * greater zero.
	 */
	@Test
	void isZero_Fail_PositiveTest()
	{
		TupsR t = mock(TupsR.class);
		
		when(t.isZero()).thenCallRealMethod();
		
		when(t.getDimensions()).thenReturn(2);
		when(t.getByIndex(0)).thenReturn((short)0);
		when(t.getByIndex(1)).thenReturn((short)1);
		
		assertEquals(false, t.isZero());
		
		verify(t).isZero();

		verify(t).getDimensions();
		verify(t).getByIndex(0);
		verify(t).getByIndex(1);
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link TupsR#isZero()} returns false
	 * after checking all components, if only the last component is a negative number
	 * greater zero.
	 */
	@Test
	void isZero_Fail_NTest()
	{
		TupsR t = mock(TupsR.class);
		
		when(t.isZero()).thenCallRealMethod();
		
		when(t.getDimensions()).thenReturn(2);
		when(t.getByIndex(0)).thenReturn((short)0);
		when(t.getByIndex(1)).thenReturn((short)-1);
		
		assertEquals(false, t.isZero());
		
		verify(t).isZero();

		verify(t).getDimensions();
		verify(t).getByIndex(0);
		verify(t).getByIndex(1);
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link TupsR#isZeroWithMargin(short)} returns true,
	 * if all components are exactly 0.0.
	 */
	@Test
	void isZeroWithMargin_ZeroTest()
	{
		TupsR t = mock(TupsR.class);
		
		when(t.isZeroWithMargin((short)2)).thenCallRealMethod();
		
		when(t.getDimensions()).thenReturn(2);
		when(t.getByIndex(0)).thenReturn((short)0);
		when(t.getByIndex(1)).thenReturn((short)0);

		assertEquals(true, t.isZeroWithMargin((short)2));
		
		verify(t).isZeroWithMargin((short)2);
		
		verify(t).getDimensions();
		verify(t).getByIndex(0);
		verify(t).getByIndex(1);
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link TupsR#isZeroWithMargin(short)} returns true,
	 * if all components are at the positive extreme point that is the inclusive
	 * tolerance parameter.
	 */
	@Test
	void isZeroWithMargin_Extreme_PositiveTest()
	{
		TupsR t = mock(TupsR.class);
		
		when(t.isZeroWithMargin((short)2)).thenCallRealMethod();
		
		when(t.getDimensions()).thenReturn(2);
		when(t.getByIndex(0)).thenReturn((short)2);
		when(t.getByIndex(1)).thenReturn((short)2);

		assertEquals(true, t.isZeroWithMargin((short)2));
		
		verify(t).isZeroWithMargin((short)2);

		verify(t).getDimensions();
		verify(t).getByIndex(0);
		verify(t).getByIndex(1);
		
		verifyNoMoreInteractions(t);
	}
	
		/**
	 * This test ensures, that the function {@link TupsR#isZeroWithMargin(short)} returns true,
	 * if all components are at the negative extreme point that is the inclusive
	 * tolerance parameter.
	 */
	@Test
	void isZeroWithMargin_Extreme_NegativeTest()
	{
		TupsR t = mock(TupsR.class);
		
		when(t.isZeroWithMargin((short)2)).thenCallRealMethod();
		
		when(t.getDimensions()).thenReturn(2);
		when(t.getByIndex(0)).thenReturn((short)-2);
		when(t.getByIndex(1)).thenReturn((short)-2);

		assertEquals(true, t.isZeroWithMargin((short)2));
		
		verify(t).isZeroWithMargin((short)2);

		verify(t).getDimensions();
		verify(t).getByIndex(0);
		verify(t).getByIndex(1);
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link TupsR#isZeroWithMargin(short)} returns false
	 * after checking the first component, if the first component exceeds the positive
	 * extreme point that is the inclusive tolerance parameter.
	 */
	@Test
	void isZeroWithMargin_FailEarly_PositiveTest()
	{
		TupsR t = mock(TupsR.class);
		
		when(t.isZeroWithMargin((short)2)).thenCallRealMethod();
		
		when(t.getDimensions()).thenReturn(2);
		when(t.getByIndex(0)).thenReturn((short)3);

		assertEquals(false, t.isZeroWithMargin((short)2));
		
		verify(t).isZeroWithMargin((short)2);

		verify(t).getDimensions();
		verify(t).getByIndex(0);
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link TupsR#isZeroWithMargin(short)} returns false
	 * after checking the first component, if the first component exceeds the negative
	 * extreme point that is the inclusive tolerance parameter.
	 */
	@Test
	void isZeroWithMargin_FailEarly_NegativeTest()
	{
		TupsR t = mock(TupsR.class);
		
		when(t.isZeroWithMargin((short)2)).thenCallRealMethod();
		
		when(t.getDimensions()).thenReturn(2);
		when(t.getByIndex(0)).thenReturn((short)-3);

		assertEquals(false, t.isZeroWithMargin((short)2));
		
		verify(t).isZeroWithMargin((short)2);

		verify(t).getDimensions();
		verify(t).getByIndex(0);
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link TupsR#isZeroWithMargin(short)} returns false
	 * after checking all components, if only the last component exceeds the positive
	 * extreme point that is the inclusive tolerance parameter.
	 */
	@Test
	void isZeroWithMargin_Fail_PositiveTest()
	{
		TupsR t = mock(TupsR.class);
		
		when(t.isZeroWithMargin((short)2)).thenCallRealMethod();
		
		when(t.getDimensions()).thenReturn(2);
		when(t.getByIndex(0)).thenReturn((short)0);
		when(t.getByIndex(1)).thenReturn((short)3);

		assertEquals(false, t.isZeroWithMargin((short)2));
		
		verify(t).isZeroWithMargin((short)2);

		verify(t).getDimensions();
		verify(t).getByIndex(0);
		verify(t).getByIndex(1);
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link TupsR#isZeroWithMargin(short)} returns false
	 * after checking all components, if only the last component exceeds the negative
	 * extreme point that is the inclusive tolerance parameter.
	 */
	@Test
	void isZeroWithMargin_Fail_NegativeTest()
	{
		TupsR t = mock(TupsR.class);
		
		when(t.isZeroWithMargin((short)2)).thenCallRealMethod();
		
		when(t.getDimensions()).thenReturn(2);
		when(t.getByIndex(0)).thenReturn((short)0);
		when(t.getByIndex(1)).thenReturn((short)-3);

		assertEquals(false, t.isZeroWithMargin((short)2));
		
		verify(t).isZeroWithMargin((short)2);

		verify(t).getDimensions();
		verify(t).getByIndex(0);
		verify(t).getByIndex(1);
		
		verifyNoMoreInteractions(t);
	}
}