package org.barghos.core.test.api.tuple3;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import org.barghos.core.api.tuple.TupiR;
import org.barghos.core.api.tuple3.Tup3iR;

/**
 * This class provides component tests for the interface {@link Tup3iR}.
 * 
 * @author picatrix1899
 */
class Tup3iRTest
{
	/**
	 * This test ensures, that the interface extends the interface {@link TupiR}.
	 */
	@Test
	void inheritance_TupiRTest()
	{
		assertTrue(TupiR.class.isAssignableFrom(Tup3iR.class));
	}

	/**
	 * this test ensures, that the function {@link Tup3iR#getDimensions()} always
	 * returns 3 and does not make any calls.
	 */
	@Test
	void getDimensionsTest()
	{
		Tup3iR t = mock(Tup3iR.class);
		
		when(t.getDimensions()).thenCallRealMethod();
		
		assertEquals(3, t.getDimensions());
		
		verify(t).getDimensions();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup3iR#isZero()} returns true,
	 * if all of the components are exactly zero.
	 */
	@Test
	void isZero_ZeroTest()
	{
		Tup3iR t = mock(Tup3iR.class);
		
		when(t.isZero()).thenCallRealMethod();
		
		when(t.getX()).thenReturn(0);
		when(t.getY()).thenReturn(0);
		when(t.getZ()).thenReturn(0);
		
		assertEquals(true, t.isZero());
		
		verify(t).isZero();
		
		verify(t).getX();
		verify(t).getY();
		verify(t).getZ();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup3iR#isZero()} returns false,
	 * if the x component is not zero.
	 */
	@Test
	void isZero_Fail_XTest()
	{
		Tup3iR t = mock(Tup3iR.class);
		
		when(t.isZero()).thenCallRealMethod();
		
		when(t.getX()).thenReturn(1);
		
		assertEquals(false, t.isZero());
		
		verify(t).isZero();
		
		verify(t).getX();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup3iR#isZero()} returns false,
	 * if the y component is not zero.
	 */
	@Test
	void isZero_Fail_YTest()
	{
		Tup3iR t = mock(Tup3iR.class);
		
		when(t.isZero()).thenCallRealMethod();
		
		when(t.getX()).thenReturn(0);
		when(t.getY()).thenReturn(1);
		
		assertEquals(false, t.isZero());
		
		verify(t).isZero();
		
		verify(t).getX();
		verify(t).getY();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup3iR#isZero()} returns false,
	 * if the z component is not zero.
	 */
	@Test
	void isZero_Fail_ZTest()
	{
		Tup3iR t = mock(Tup3iR.class);
		
		when(t.isZero()).thenCallRealMethod();
		
		when(t.getX()).thenReturn(0);
		when(t.getY()).thenReturn(0);
		when(t.getZ()).thenReturn(1);
		
		assertEquals(false, t.isZero());
		
		verify(t).isZero();
		
		verify(t).getX();
		verify(t).getY();
		verify(t).getZ();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup3iR#isZeroWithMargin(int)} returns true,
	 * if all components are exactly zero.
	 */
	@Test
	void isZeroWithMargin_ZeroTest()
	{
		Tup3iR t = mock(Tup3iR.class);
		
		when(t.isZeroWithMargin(2)).thenCallRealMethod();
		
		when(t.getX()).thenReturn(0);
		when(t.getY()).thenReturn(0);
		when(t.getZ()).thenReturn(0);
		
		assertEquals(true, t.isZeroWithMargin(2));
		
		verify(t).isZeroWithMargin(2);
		
		verify(t).getX();
		verify(t).getY();
		verify(t).getZ();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup3iR#isZeroWithMargin(int)} returns true,
	 * if all components are at the positive extreme point that is the inclusive
	 * tolerance parameter.
	 */
	@Test
	void isZeroWithMargin_Extreme_PositiveTest()
	{
		Tup3iR t = mock(Tup3iR.class);
		
		when(t.isZeroWithMargin(2)).thenCallRealMethod();
		
		when(t.getX()).thenReturn(2);
		when(t.getY()).thenReturn(2);
		when(t.getZ()).thenReturn(2);
		
		assertEquals(true, t.isZeroWithMargin(2));
		
		verify(t).isZeroWithMargin(2);
		
		verify(t).getX();
		verify(t).getY();
		verify(t).getZ();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup2bR#isZeroWithMargin(int)} returns true,
	 * if all components are at the negative extreme point that is the inclusive
	 * tolerance parameter.
	 */
	@Test
	void isZeroWithMargin_Extreme_NegativeTest()
	{
		Tup3iR t = mock(Tup3iR.class);
		
		when(t.isZeroWithMargin(2)).thenCallRealMethod();
		
		when(t.getX()).thenReturn(-2);
		when(t.getY()).thenReturn(-2);
		when(t.getZ()).thenReturn(-2);
		
		assertEquals(true, t.isZeroWithMargin(2));
		
		verify(t).isZeroWithMargin(2);
		
		verify(t).getX();
		verify(t).getY();
		verify(t).getZ();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup3iR#isZeroWithMargin(int)} returns false,
	 * if the x component exceeds the positive extreme point that is the inclusive
	 * tolerance parameter.
	 */
	@Test
	void isZeroWithMargin_Fail_X_PositiveTest()
	{
		Tup3iR t = mock(Tup3iR.class);
		
		when(t.isZeroWithMargin(2)).thenCallRealMethod();
		
		when(t.getX()).thenReturn(3);
		
		assertEquals(false, t.isZeroWithMargin(2));
		
		verify(t).isZeroWithMargin(2);
		
		verify(t).getX();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup3iR#isZeroWithMargin(int)} returns false,
	 * if the x component exceeds the negative extreme point that is the inclusive
	 * tolerance parameter.
	 */
	@Test
	void isZeroWithMargin_Fail_X_NegativeTest()
	{
		Tup3iR t = mock(Tup3iR.class);
		
		when(t.isZeroWithMargin(2)).thenCallRealMethod();
		
		when(t.getX()).thenReturn(-3);
		
		assertEquals(false, t.isZeroWithMargin(2));
		
		verify(t).isZeroWithMargin(2);
		
		verify(t).getX();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup3iR#isZeroWithMargin(int)} returns false,
	 * if the y component exceeds the positive extreme point that is the inclusive
	 * tolerance parameter.
	 */
	@Test
	void isZeroWithMargin_Fail_Y_PositiveTest()
	{
		Tup3iR t = mock(Tup3iR.class);
		
		when(t.isZeroWithMargin(2)).thenCallRealMethod();
		
		when(t.getX()).thenReturn(0);
		when(t.getY()).thenReturn(3);
		
		assertEquals(false, t.isZeroWithMargin(2));
		
		verify(t).isZeroWithMargin(2);
		
		verify(t).getX();
		verify(t).getY();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup3iR#isZeroWithMargin(int)} returns false,
	 * if the y component exceeds the positive extreme point that is the inclusive
	 * tolerance parameter.
	 */
	@Test
	void isZeroWithMargin_Fail_Y_NegativeTest()
	{
		Tup3iR t = mock(Tup3iR.class);
		
		when(t.isZeroWithMargin(2)).thenCallRealMethod();
		
		when(t.getX()).thenReturn(0);
		when(t.getY()).thenReturn(-3);
		
		assertEquals(false, t.isZeroWithMargin(2));
		
		verify(t).isZeroWithMargin(2);
		
		verify(t).getX();
		verify(t).getY();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup3iR#isZeroWithMargin(int)} returns false,
	 * if the z component exceeds the positive extreme point that is the inclusive
	 * tolerance parameter.
	 */
	@Test
	void isZeroWithMargin_Fail_Z_PositiveTest()
	{
		Tup3iR t = mock(Tup3iR.class);
		
		when(t.isZeroWithMargin(2)).thenCallRealMethod();
		
		when(t.getX()).thenReturn(0);
		when(t.getY()).thenReturn(0);
		when(t.getZ()).thenReturn(3);
		
		assertEquals(false, t.isZeroWithMargin(2));
		
		verify(t).isZeroWithMargin(2);
		
		verify(t).getX();
		verify(t).getY();
		verify(t).getZ();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup3iR#isZeroWithMargin(int)} returns false,
	 * if the z component exceeds the positive extreme point that is the inclusive
	 * tolerance parameter.
	 */
	@Test
	void isZeroWithMargin_Fail_Z_NegativeTest()
	{
		Tup3iR t = mock(Tup3iR.class);
		
		when(t.isZeroWithMargin(2)).thenCallRealMethod();
		
		when(t.getX()).thenReturn(0);
		when(t.getY()).thenReturn(0);
		when(t.getZ()).thenReturn(-3);
		
		assertEquals(false, t.isZeroWithMargin(2));
		
		verify(t).isZeroWithMargin(2);
		
		verify(t).getX();
		verify(t).getY();
		verify(t).getZ();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup3iR#getArray()} returns
	 * an array with the components in the right order.
	 */
	@Test
	void getArrayTest()
	{
		Tup3iR t = mock(Tup3iR.class);
		
		when(t.getArray()).thenCallRealMethod();
		
		when(t.getX()).thenReturn(1);
		when(t.getY()).thenReturn(2);
		when(t.getZ()).thenReturn(3);
		
		assertArrayEquals(new int[] {1, 2, 3}, t.getArray());
		
		verify(t).getArray();
		
		verify(t).getX();
		verify(t).getY();
		verify(t).getZ();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup3iR#getByIndex(int)} returns
	 * the x component for the index 0.
	 */
	@Test
	void getByIndex_XTest()
	{
		Tup3iR t = mock(Tup3iR.class);
		
		when(t.getByIndex(0)).thenCallRealMethod();
		
		when(t.getX()).thenReturn(1);
		
		assertEquals(1, t.getByIndex(0));

		verify(t).getByIndex(0);
		
		verify(t).getX();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup3iR#getByIndex(int)} returns
	 * the y component for the index 1.
	 */
	@Test
	void getByIndex_YTest()
	{
		Tup3iR t = mock(Tup3iR.class);
		
		when(t.getByIndex(1)).thenCallRealMethod();
		
		when(t.getY()).thenReturn(1);
		
		assertEquals(1, t.getByIndex(1));

		verify(t).getByIndex(1);
		
		verify(t).getY();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup3iR#getByIndex(int)} returns
	 * the z component for the index 2.
	 */
	@Test
	void getByIndex_ZTest()
	{
		Tup3iR t = mock(Tup3iR.class);
		
		when(t.getByIndex(2)).thenCallRealMethod();
		
		when(t.getZ()).thenReturn(1);
		
		assertEquals(1, t.getByIndex(2));

		verify(t).getByIndex(2);
		
		verify(t).getZ();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup3iR#getByIndex(int)} throws
	 * an {@link IndexOutOfBoundsException} for an index different than 0, 1 or 2.
	 */
	@Test
	void getByIndex_ExceptionTest()
	{
		Tup3iR t = mock(Tup3iR.class);
		
		when(t.getByIndex(3)).thenCallRealMethod();

		assertThrows(IndexOutOfBoundsException.class, new Executable() {
			public void execute() throws Throwable
			{
				t.getByIndex(3);
			}
		});

		verify(t).getByIndex(3);

		verifyNoMoreInteractions(t);
	}
}