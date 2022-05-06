package org.barghos.core.test.api.tuple;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;

import static org.barghos.core.api.testing.TestObjectFactory.*;

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
	 * This test ensures, that the function {@link TupsR#isExactlyZero()} returns true
	 * if all components are 0.0.
	 */
	@Test
	void isExactlyZero_ZeroTest()
	{
		TupsR t = mock(TupsR.class);
		
		when(t.isExactlyZero()).thenCallRealMethod();
		
		when(t.getDimensions()).thenReturn(2);
		when(t.getByIndex(0)).thenReturn(s(0));
		when(t.getByIndex(1)).thenReturn(s(0));
		
		assertEquals(true, t.isExactlyZero());
		
		verify(t).isExactlyZero();
		
		verify(t).getDimensions();
		verify(t).getByIndex(0);
		verify(t).getByIndex(1);
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link TupsR#isExactlyZero()} returns false
	 * after checking the first component, if the first component is a positive number
	 * greater zero.
	 */
	@Test
	void isExactlyZero_FailEarly_PositiveTest()
	{
		TupsR t = mock(TupsR.class);
		
		when(t.isExactlyZero()).thenCallRealMethod();
		
		when(t.getDimensions()).thenReturn(2);
		when(t.getByIndex(0)).thenReturn(s(1));
		
		assertEquals(false, t.isExactlyZero());
		
		verify(t).isExactlyZero();

		verify(t).getDimensions();
		verify(t).getByIndex(0);
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link TupsR#isExactlyZero()} returns false
	 * after checking the first component, if the first component is a negative number
	 * greater zero.
	 */
	@Test
	void isExactlyZero_FailEarly_NegativeTest()
	{
		TupsR t = mock(TupsR.class);
		
		when(t.isExactlyZero()).thenCallRealMethod();
		
		when(t.getDimensions()).thenReturn(2);
		when(t.getByIndex(0)).thenReturn(s(-1));
		
		assertEquals(false, t.isExactlyZero());
		
		verify(t).isExactlyZero();

		verify(t).getDimensions();
		verify(t).getByIndex(0);
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link TupsR#isExactlyZero()} returns false
	 * after checking all components, if only the last component is a positive number
	 * greater zero.
	 */
	@Test
	void isExactlyZero_Fail_PositiveTest()
	{
		TupsR t = mock(TupsR.class);
		
		when(t.isExactlyZero()).thenCallRealMethod();
		
		when(t.getDimensions()).thenReturn(2);
		when(t.getByIndex(0)).thenReturn(s(0));
		when(t.getByIndex(1)).thenReturn(s(1));
		
		assertEquals(false, t.isExactlyZero());
		
		verify(t).isExactlyZero();

		verify(t).getDimensions();
		verify(t).getByIndex(0);
		verify(t).getByIndex(1);
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link TupsR#isExactlyZero()} returns false
	 * after checking all components, if only the last component is a negative number
	 * greater zero.
	 */
	@Test
	void isExactlyZero_Fail_NTest()
	{
		TupsR t = mock(TupsR.class);
		
		when(t.isExactlyZero()).thenCallRealMethod();
		
		when(t.getDimensions()).thenReturn(2);
		when(t.getByIndex(0)).thenReturn(s(0));
		when(t.getByIndex(1)).thenReturn(s(-1));
		
		assertEquals(false, t.isExactlyZero());
		
		verify(t).isExactlyZero();

		verify(t).getDimensions();
		verify(t).getByIndex(0);
		verify(t).getByIndex(1);
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link TupsR#isZero(short)} returns true,
	 * if all components are exactly 0.0.
	 */
	@Test
	void isZero_ZeroTest()
	{
		TupsR t = mock(TupsR.class);
		
		when(t.isZero(s(2))).thenCallRealMethod();
		
		when(t.getDimensions()).thenReturn(2);
		when(t.getByIndex(0)).thenReturn(s(0));
		when(t.getByIndex(1)).thenReturn(s(0));

		assertEquals(true, t.isZero(s(2)));
		
		verify(t).isZero(s(2));
		
		verify(t).getDimensions();
		verify(t).getByIndex(0);
		verify(t).getByIndex(1);
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link TupsR#isZero(short)} returns true,
	 * if all components are at the positive extreme point that is the inclusive
	 * tolerance parameter.
	 */
	@Test
	void isZero_Extreme_PositiveTest()
	{
		TupsR t = mock(TupsR.class);
		
		when(t.isZero(s(2))).thenCallRealMethod();
		
		when(t.getDimensions()).thenReturn(2);
		when(t.getByIndex(0)).thenReturn(s(2));
		when(t.getByIndex(1)).thenReturn(s(2));

		assertEquals(true, t.isZero(s(2)));
		
		verify(t).isZero(s(2));

		verify(t).getDimensions();
		verify(t).getByIndex(0);
		verify(t).getByIndex(1);
		
		verifyNoMoreInteractions(t);
	}
	
		/**
	 * This test ensures, that the function {@link TupsR#isZero(short)} returns true,
	 * if all components are at the negative extreme point that is the inclusive
	 * tolerance parameter.
	 */
	@Test
	void isZero_Extreme_NegativeTest()
	{
		TupsR t = mock(TupsR.class);
		
		when(t.isZero(s(2))).thenCallRealMethod();
		
		when(t.getDimensions()).thenReturn(2);
		when(t.getByIndex(0)).thenReturn(s(-2));
		when(t.getByIndex(1)).thenReturn(s(-2));

		assertEquals(true, t.isZero(s(2)));
		
		verify(t).isZero(s(2));

		verify(t).getDimensions();
		verify(t).getByIndex(0);
		verify(t).getByIndex(1);
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link TupsR#isZero(short)} returns false
	 * after checking the first component, if the first component exceeds the positive
	 * extreme point that is the inclusive tolerance parameter.
	 */
	@Test
	void isZero_FailEarly_PositiveTest()
	{
		TupsR t = mock(TupsR.class);
		
		when(t.isZero(s(2))).thenCallRealMethod();
		
		when(t.getDimensions()).thenReturn(2);
		when(t.getByIndex(0)).thenReturn(s(3));

		assertEquals(false, t.isZero(s(2)));
		
		verify(t).isZero(s(2));

		verify(t).getDimensions();
		verify(t).getByIndex(0);
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link TupsR#isZero(short)} returns false
	 * after checking the first component, if the first component exceeds the negative
	 * extreme point that is the inclusive tolerance parameter.
	 */
	@Test
	void isZero_FailEarly_NegativeTest()
	{
		TupsR t = mock(TupsR.class);
		
		when(t.isZero(s(2))).thenCallRealMethod();
		
		when(t.getDimensions()).thenReturn(2);
		when(t.getByIndex(0)).thenReturn(s(-3));

		assertEquals(false, t.isZero(s(2)));
		
		verify(t).isZero(s(2));

		verify(t).getDimensions();
		verify(t).getByIndex(0);
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link TupsR#isZero(short)} returns false
	 * after checking all components, if only the last component exceeds the positive
	 * extreme point that is the inclusive tolerance parameter.
	 */
	@Test
	void isZero_Fail_PositiveTest()
	{
		TupsR t = mock(TupsR.class);
		
		when(t.isZero(s(2))).thenCallRealMethod();
		
		when(t.getDimensions()).thenReturn(2);
		when(t.getByIndex(0)).thenReturn(s(0));
		when(t.getByIndex(1)).thenReturn(s(3));

		assertEquals(false, t.isZero(s(2)));
		
		verify(t).isZero(s(2));

		verify(t).getDimensions();
		verify(t).getByIndex(0);
		verify(t).getByIndex(1);
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link TupsR#isZero(short)} returns false
	 * after checking all components, if only the last component exceeds the negative
	 * extreme point that is the inclusive tolerance parameter.
	 */
	@Test
	void isZero_Fail_NegativeTest()
	{
		TupsR t = mock(TupsR.class);
		
		when(t.isZero(s(2))).thenCallRealMethod();
		
		when(t.getDimensions()).thenReturn(2);
		when(t.getByIndex(0)).thenReturn(s(0));
		when(t.getByIndex(1)).thenReturn(s(-3));

		assertEquals(false, t.isZero(s(2)));
		
		verify(t).isZero(s(2));

		verify(t).getDimensions();
		verify(t).getByIndex(0);
		verify(t).getByIndex(1);
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link TupsR#toArray()} calls
	 * the function {@link TupsR#toArray(short[])} with a new array with the size
	 * equal to the number of dimensions of the tuple.
	 */
	@Test
	void toArrayTest()
	{
		TupsR t = mock(TupsR.class);
		
		short[] array = new short[2];
		
		when(t.toArray()).thenCallRealMethod();
		when(t.getDimensions()).thenReturn(2);

		when(t.toArray(new short[2])).thenReturn(array);
		
		assertSame(array, t.toArray());
		
		verify(t).toArray();
		
		verify(t).getDimensions();
		
		verify(t).toArray(new short[2]);
		
		verifyNoMoreInteractions(t);
	}
}