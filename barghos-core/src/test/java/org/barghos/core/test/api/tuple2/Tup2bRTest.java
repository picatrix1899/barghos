package org.barghos.core.test.api.tuple2;

import static org.barghos.testutils.TestObjectFactory.*;
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
	 * This test ensures, that the function {@link Tup2bR#isExactlyZero()} returns true,
	 * if all of the components are exactly zero.
	 */
	@Test
	void isExactlyZero_ZeroTest()
	{
		Tup2bR t = mock(Tup2bR.class);
		
		when(t.isExactlyZero()).thenCallRealMethod();
		
		when(t.getX()).thenReturn(b(0));
		when(t.getY()).thenReturn(b(0));
		
		assertEquals(true, t.isExactlyZero());
		
		verify(t).isExactlyZero();
		
		verify(t).getX();
		verify(t).getY();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup2bR#isExactlyZero()} returns false,
	 * if the x component is not zero.
	 */
	@Test
	void isExactlyZero_Fail_XTest()
	{
		Tup2bR t = mock(Tup2bR.class);
		
		when(t.isExactlyZero()).thenCallRealMethod();
		
		when(t.getX()).thenReturn(b(1));
		
		assertEquals(false, t.isExactlyZero());
		
		verify(t).isExactlyZero();
		
		verify(t).getX();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup2bR#isExactlyZero()} returns false,
	 * if the y component is not zero.
	 */
	@Test
	void isExactlyZero_Fail_YTest()
	{
		Tup2bR t = mock(Tup2bR.class);
		
		when(t.isExactlyZero()).thenCallRealMethod();
		
		when(t.getX()).thenReturn(b(0));
		when(t.getY()).thenReturn(b(1));
		
		assertEquals(false, t.isExactlyZero());
		
		verify(t).isExactlyZero();
		
		verify(t).getX();
		verify(t).getY();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup2bR#isZero(byte)} returns true,
	 * if all components are exactly zero.
	 */
	@Test
	void isZero_ZeroTest()
	{
		Tup2bR t = mock(Tup2bR.class);
		
		when(t.isZero(b(2))).thenCallRealMethod();
		
		when(t.getX()).thenReturn(b(0));
		when(t.getY()).thenReturn(b(0));
		
		assertEquals(true, t.isZero(b(2)));
		
		verify(t).isZero(b(2));
		
		verify(t).getX();
		verify(t).getY();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup2bR#isZero(byte)} returns true,
	 * if all components are at the positive extreme point that is the inclusive
	 * tolerance parameter.
	 */
	@Test
	void isZero_Extreme_PositiveTest()
	{
		Tup2bR t = mock(Tup2bR.class);
		
		when(t.isZero(b(2))).thenCallRealMethod();
		
		when(t.getX()).thenReturn(b(2));
		when(t.getY()).thenReturn(b(2));
		
		assertEquals(true, t.isZero(b(2)));
		
		verify(t).isZero(b(2));
		
		verify(t).getX();
		verify(t).getY();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup2bR#isZero(byte)} returns true,
	 * if all components are at the negative extreme point that is the inclusive
	 * tolerance parameter.
	 */
	@Test
	void isZero_Extreme_NegativeTest()
	{
		Tup2bR t = mock(Tup2bR.class);
		
		when(t.isZero(b(2))).thenCallRealMethod();
		
		when(t.getX()).thenReturn(b(-2));
		when(t.getY()).thenReturn(b(-2));
		
		assertEquals(true, t.isZero(b(2)));
		
		verify(t).isZero(b(2));
		
		verify(t).getX();
		verify(t).getY();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup2bR#isZero(byte)} returns false,
	 * if the x component exceeds the positive extreme point that is the inclusive
	 * tolerance parameter.
	 */
	@Test
	void isZero_Fail_X_PositiveTest()
	{
		Tup2bR t = mock(Tup2bR.class);
		
		when(t.isZero(b(2))).thenCallRealMethod();
		
		when(t.getX()).thenReturn(b(3));
		
		assertEquals(false, t.isZero(b(2)));
		
		verify(t).isZero(b(2));
		
		verify(t).getX();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup2bR#isZero(byte)} returns false,
	 * if the x component exceeds the negative extreme point that is the inclusive
	 * tolerance parameter.
	 */
	@Test
	void isZero_Fail_X_NegativeTest()
	{
		Tup2bR t = mock(Tup2bR.class);
		
		when(t.isZero(b(2))).thenCallRealMethod();
		
		when(t.getX()).thenReturn(b(-3));
		
		assertEquals(false, t.isZero(b(2)));
		
		verify(t).isZero(b(2));
		
		verify(t).getX();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup2bR#isZero(byte)} returns false,
	 * if the y component exceeds the positive extreme point that is the inclusive
	 * tolerance parameter.
	 */
	@Test
	void isZero_Fail_Y_PositiveTest()
	{
		Tup2bR t = mock(Tup2bR.class);
		
		when(t.isZero(b(2))).thenCallRealMethod();
		
		when(t.getX()).thenReturn(b(0));
		when(t.getY()).thenReturn(b(3));
		
		assertEquals(false, t.isZero(b(2)));
		
		verify(t).isZero(b(2));
		
		verify(t).getX();
		verify(t).getY();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup2bR#isZero(byte)} returns false,
	 * if the y component exceeds the positive extreme point that is the inclusive
	 * tolerance parameter.
	 */
	@Test
	void isZero_Fail_Y_NegativeTest()
	{
		Tup2bR t = mock(Tup2bR.class);
		
		when(t.isZero(b(2))).thenCallRealMethod();
		
		when(t.getX()).thenReturn(b(0));
		when(t.getY()).thenReturn(b(-3));
		
		assertEquals(false, t.isZero(b(2)));
		
		verify(t).isZero(b(2));
		
		verify(t).getX();
		verify(t).getY();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup2bR#toArray(byte[])} returns
	 * the given array with the components in the right order.
	 */
	@Test
	void toArray_ExtractParamTest()
	{
		Tup2bR t = mock(Tup2bR.class);
		
		byte[] array = new byte[2];
		
		when(t.toArray(array)).thenCallRealMethod();
		
		when(t.getX()).thenReturn(b(1));
		when(t.getY()).thenReturn(b(2));
		
		assertSame(array, t.toArray(array));
		assertArrayEquals(bArray(1, 2), array);
		
		verify(t).toArray(array);
		
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
		
		when(t.getX()).thenReturn(b(1));
		
		assertEquals(b(1), t.getByIndex(0));

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
		
		when(t.getY()).thenReturn(b(1));
		
		assertEquals(b(1), t.getByIndex(1));

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
