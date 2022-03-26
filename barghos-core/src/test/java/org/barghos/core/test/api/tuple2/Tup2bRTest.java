package org.barghos.core.test.api.tuple2;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import org.barghos.core.api.tuple.TupbR;
import org.barghos.core.api.tuple2.Tup2bR;

/**
 * This class provides component tests for the interface {@link Tup2bR}.
 * 
 * @author picatrix1899
 */
class Tup2bRTest
{
	/**
	 * This test ensures, that the interface extends the interface {@link TupbR}.
	 */
	@Test
	void inheritance_TupbRTest()
	{
		assertTrue(TupbR.class.isAssignableFrom(Tup2bR.class));
	}
	
	/**
	 * this test ensures, that the function {@link Tup2bR#getDimensions()} always
	 * returns 2 and does not make any calls.
	 */
	@Test
	void getDimensionsTest()
	{
		Tup2bR t = mock(Tup2bR.class);
		
		when(t.getDimensions()).thenCallRealMethod();
		
		assertEquals(2, t.getDimensions());
		
		verify(t).getDimensions();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup2bR#isZero()} returns true,
	 * if all of the components are exactly zero.
	 */
	@Test
	void isZero_ZeroTest()
	{
		Tup2bR t = mock(Tup2bR.class);
		
		when(t.isZero()).thenCallRealMethod();
		
		when(t.getX()).thenReturn((byte)0);
		when(t.getY()).thenReturn((byte)0);
		
		assertEquals(true, t.isZero());
		
		verify(t).isZero();
		
		verify(t).getX();
		verify(t).getY();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup2bR#isZero()} returns false,
	 * if the x component is not zero.
	 */
	@Test
	void isZero_Fail_XTest()
	{
		Tup2bR t = mock(Tup2bR.class);
		
		when(t.isZero()).thenCallRealMethod();
		
		when(t.getX()).thenReturn((byte)1);
		
		assertEquals(false, t.isZero());
		
		verify(t).isZero();
		
		verify(t).getX();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup2bR#isZero()} returns false,
	 * if the y component is not zero.
	 */
	@Test
	void isZero_Fail_YTest()
	{
		Tup2bR t = mock(Tup2bR.class);
		
		when(t.isZero()).thenCallRealMethod();
		
		when(t.getX()).thenReturn((byte)0);
		when(t.getY()).thenReturn((byte)1);
		
		assertEquals(false, t.isZero());
		
		verify(t).isZero();
		
		verify(t).getX();
		verify(t).getY();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup2bR#isZeroWithMargin(byte)} returns true,
	 * if all components are exactly zero.
	 */
	@Test
	void isZeroWithMargin_ZeroTest()
	{
		Tup2bR t = mock(Tup2bR.class);
		
		when(t.isZeroWithMargin((byte)2)).thenCallRealMethod();
		
		when(t.getX()).thenReturn((byte)0);
		when(t.getY()).thenReturn((byte)0);
		
		assertEquals(true, t.isZeroWithMargin((byte)2));
		
		verify(t).isZeroWithMargin((byte)2);
		
		verify(t).getX();
		verify(t).getY();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup2bR#isZeroWithMargin(byte)} returns true,
	 * if all components are at the positive extreme point that is the inclusive
	 * tolerance parameter.
	 */
	@Test
	void isZeroWithMargin_Extreme_PositiveTest()
	{
		Tup2bR t = mock(Tup2bR.class);
		
		when(t.isZeroWithMargin((byte)2)).thenCallRealMethod();
		
		when(t.getX()).thenReturn((byte)2);
		when(t.getY()).thenReturn((byte)2);
		
		assertEquals(true, t.isZeroWithMargin((byte)2));
		
		verify(t).isZeroWithMargin((byte)2);
		
		verify(t).getX();
		verify(t).getY();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup2bR#isZeroWithMargin(byte)} returns true,
	 * if all components are at the negative extreme point that is the inclusive
	 * tolerance parameter.
	 */
	@Test
	void isZeroWithMargin_Extreme_NegativeTest()
	{
		Tup2bR t = mock(Tup2bR.class);
		
		when(t.isZeroWithMargin((byte)2)).thenCallRealMethod();
		
		when(t.getX()).thenReturn((byte)-2);
		when(t.getY()).thenReturn((byte)-2);
		
		assertEquals(true, t.isZeroWithMargin((byte)2));
		
		verify(t).isZeroWithMargin((byte)2);
		
		verify(t).getX();
		verify(t).getY();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup2bR#isZeroWithMargin(byte)} returns false,
	 * if the x component exceeds the positive extreme point that is the inclusive
	 * tolerance parameter.
	 */
	@Test
	void isZeroWithMargin_Fail_X_PositiveTest()
	{
		Tup2bR t = mock(Tup2bR.class);
		
		when(t.isZeroWithMargin((byte)2)).thenCallRealMethod();
		
		when(t.getX()).thenReturn((byte)3);
		
		assertEquals(false, t.isZeroWithMargin((byte)2));
		
		verify(t).isZeroWithMargin((byte)2);
		
		verify(t).getX();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup2bR#isZeroWithMargin(byte)} returns false,
	 * if the x component exceeds the negative extreme point that is the inclusive
	 * tolerance parameter.
	 */
	@Test
	void isZeroWithMargin_Fail_X_NegativeTest()
	{
		Tup2bR t = mock(Tup2bR.class);
		
		when(t.isZeroWithMargin((byte)2)).thenCallRealMethod();
		
		when(t.getX()).thenReturn((byte)-3);
		
		assertEquals(false, t.isZeroWithMargin((byte)2));
		
		verify(t).isZeroWithMargin((byte)2);
		
		verify(t).getX();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup2bR#isZeroWithMargin(byte)} returns false,
	 * if the y component exceeds the positive extreme point that is the inclusive
	 * tolerance parameter.
	 */
	@Test
	void isZeroWithMargin_Fail_Y_PositiveTest()
	{
		Tup2bR t = mock(Tup2bR.class);
		
		when(t.isZeroWithMargin((byte)2)).thenCallRealMethod();
		
		when(t.getX()).thenReturn((byte)0);
		when(t.getY()).thenReturn((byte)3);
		
		assertEquals(false, t.isZeroWithMargin((byte)2));
		
		verify(t).isZeroWithMargin((byte)2);
		
		verify(t).getX();
		verify(t).getY();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup2bR#isZeroWithMargin(byte)} returns false,
	 * if the y component exceeds the positive extreme point that is the inclusive
	 * tolerance parameter.
	 */
	@Test
	void isZeroWithMargin_Fail_Y_NegativeTest()
	{
		Tup2bR t = mock(Tup2bR.class);
		
		when(t.isZeroWithMargin((byte)2)).thenCallRealMethod();
		
		when(t.getX()).thenReturn((byte)0);
		when(t.getY()).thenReturn((byte)-3);
		
		assertEquals(false, t.isZeroWithMargin((byte)2));
		
		verify(t).isZeroWithMargin((byte)2);
		
		verify(t).getX();
		verify(t).getY();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup2bR#getArray()} returns
	 * an array with the components in the right order.
	 */
	@Test
	void getArrayTest()
	{
		Tup2bR t = mock(Tup2bR.class);
		
		when(t.getArray()).thenCallRealMethod();
		
		when(t.getX()).thenReturn((byte)1);
		when(t.getY()).thenReturn((byte)2);
		
		assertArrayEquals(new byte[] {(byte)1, (byte)2}, t.getArray());
		
		verify(t).getArray();
		
		verify(t).getX();
		verify(t).getY();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup2bR#getByIndex(int)} returns
	 * the x component for the index 0.
	 */
	@Test
	void getByIndex_XTest()
	{
		Tup2bR t = mock(Tup2bR.class);
		
		when(t.getByIndex(0)).thenCallRealMethod();
		
		when(t.getX()).thenReturn((byte)1);
		
		assertEquals((byte)1, t.getByIndex(0));

		verify(t).getByIndex(0);
		
		verify(t).getX();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup2bR#getByIndex(int)} returns
	 * the y component for the index 1.
	 */
	@Test
	void getByIndex_YTest()
	{
		Tup2bR t = mock(Tup2bR.class);
		
		when(t.getByIndex(1)).thenCallRealMethod();
		
		when(t.getY()).thenReturn((byte)1);
		
		assertEquals((byte)1, t.getByIndex(1));

		verify(t).getByIndex(1);
		
		verify(t).getY();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup2bR#getByIndex(int)} throws
	 * an {@link IndexOutOfBoundsException} for an index different than 0 or 1.
	 */
	@Test
	void getByIndex_ExceptionTest()
	{
		Tup2bR t = mock(Tup2bR.class);
		
		when(t.getByIndex(2)).thenCallRealMethod();

		assertThrows(IndexOutOfBoundsException.class, new Executable() {
			public void execute() throws Throwable
			{
				t.getByIndex(2);
			}
		});

		verify(t).getByIndex(2);

		verifyNoMoreInteractions(t);
	}
}
