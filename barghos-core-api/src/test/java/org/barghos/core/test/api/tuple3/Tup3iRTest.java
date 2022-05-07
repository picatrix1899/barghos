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
	 * This test ensures, that the function {@link Tup3iR#isExactlyZero()} returns true,
	 * if all of the components are exactly zero.
	 */
	@Test
	void isExactlyZero_ZeroTest()
	{
		Tup3iR t = mock(Tup3iR.class);
		
		when(t.isExactlyZero()).thenCallRealMethod();
		
		when(t.getX()).thenReturn(0);
		when(t.getY()).thenReturn(0);
		when(t.getZ()).thenReturn(0);
		
		assertEquals(true, t.isExactlyZero());
		
		verify(t).isExactlyZero();
		
		verify(t).getX();
		verify(t).getY();
		verify(t).getZ();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup3iR#isExactlyZero()} returns false,
	 * if the x component is not zero.
	 */
	@Test
	void isExactlyZero_Fail_XTest()
	{
		Tup3iR t = mock(Tup3iR.class);
		
		when(t.isExactlyZero()).thenCallRealMethod();
		
		when(t.getX()).thenReturn(1);
		
		assertEquals(false, t.isExactlyZero());
		
		verify(t).isExactlyZero();
		
		verify(t).getX();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup3iR#isExactlyZero()} returns false,
	 * if the y component is not zero.
	 */
	@Test
	void isExactlyZero_Fail_YTest()
	{
		Tup3iR t = mock(Tup3iR.class);
		
		when(t.isExactlyZero()).thenCallRealMethod();
		
		when(t.getX()).thenReturn(0);
		when(t.getY()).thenReturn(1);
		
		assertEquals(false, t.isExactlyZero());
		
		verify(t).isExactlyZero();
		
		verify(t).getX();
		verify(t).getY();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup3iR#isExactlyZero()} returns false,
	 * if the z component is not zero.
	 */
	@Test
	void isExactlyZero_Fail_ZTest()
	{
		Tup3iR t = mock(Tup3iR.class);
		
		when(t.isExactlyZero()).thenCallRealMethod();
		
		when(t.getX()).thenReturn(0);
		when(t.getY()).thenReturn(0);
		when(t.getZ()).thenReturn(1);
		
		assertEquals(false, t.isExactlyZero());
		
		verify(t).isExactlyZero();
		
		verify(t).getX();
		verify(t).getY();
		verify(t).getZ();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup3iR#isZero(int)} returns true,
	 * if all components are exactly zero.
	 */
	@Test
	void isZero_ZeroTest()
	{
		Tup3iR t = mock(Tup3iR.class);
		
		when(t.isZero(2)).thenCallRealMethod();
		
		when(t.getX()).thenReturn(0);
		when(t.getY()).thenReturn(0);
		when(t.getZ()).thenReturn(0);
		
		assertEquals(true, t.isZero(2));
		
		verify(t).isZero(2);
		
		verify(t).getX();
		verify(t).getY();
		verify(t).getZ();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup3iR#isZero(int)} returns true,
	 * if all components are at the positive extreme point that is the inclusive
	 * tolerance parameter.
	 */
	@Test
	void isZero_Extreme_PositiveTest()
	{
		Tup3iR t = mock(Tup3iR.class);
		
		when(t.isZero(2)).thenCallRealMethod();
		
		when(t.getX()).thenReturn(2);
		when(t.getY()).thenReturn(2);
		when(t.getZ()).thenReturn(2);
		
		assertEquals(true, t.isZero(2));
		
		verify(t).isZero(2);
		
		verify(t).getX();
		verify(t).getY();
		verify(t).getZ();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup3iR#isZero(int)} returns true,
	 * if all components are at the negative extreme point that is the inclusive
	 * tolerance parameter.
	 */
	@Test
	void isZero_Extreme_NegativeTest()
	{
		Tup3iR t = mock(Tup3iR.class);
		
		when(t.isZero(2)).thenCallRealMethod();
		
		when(t.getX()).thenReturn(-2);
		when(t.getY()).thenReturn(-2);
		when(t.getZ()).thenReturn(-2);
		
		assertEquals(true, t.isZero(2));
		
		verify(t).isZero(2);
		
		verify(t).getX();
		verify(t).getY();
		verify(t).getZ();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup3iR#isZero(int)} returns false,
	 * if the x component exceeds the positive extreme point that is the inclusive
	 * tolerance parameter.
	 */
	@Test
	void isZero_Fail_X_PositiveTest()
	{
		Tup3iR t = mock(Tup3iR.class);
		
		when(t.isZero(2)).thenCallRealMethod();
		
		when(t.getX()).thenReturn(3);
		
		assertEquals(false, t.isZero(2));
		
		verify(t).isZero(2);
		
		verify(t).getX();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup3iR#isZero(int)} returns false,
	 * if the x component exceeds the negative extreme point that is the inclusive
	 * tolerance parameter.
	 */
	@Test
	void isZero_Fail_X_NegativeTest()
	{
		Tup3iR t = mock(Tup3iR.class);
		
		when(t.isZero(2)).thenCallRealMethod();
		
		when(t.getX()).thenReturn(-3);
		
		assertEquals(false, t.isZero(2));
		
		verify(t).isZero(2);
		
		verify(t).getX();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup3iR#isZero(int)} returns false,
	 * if the y component exceeds the positive extreme point that is the inclusive
	 * tolerance parameter.
	 */
	@Test
	void isZero_Fail_Y_PositiveTest()
	{
		Tup3iR t = mock(Tup3iR.class);
		
		when(t.isZero(2)).thenCallRealMethod();
		
		when(t.getX()).thenReturn(0);
		when(t.getY()).thenReturn(3);
		
		assertEquals(false, t.isZero(2));
		
		verify(t).isZero(2);
		
		verify(t).getX();
		verify(t).getY();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup3iR#isZero(int)} returns false,
	 * if the y component exceeds the positive extreme point that is the inclusive
	 * tolerance parameter.
	 */
	@Test
	void isZero_Fail_Y_NegativeTest()
	{
		Tup3iR t = mock(Tup3iR.class);
		
		when(t.isZero(2)).thenCallRealMethod();
		
		when(t.getX()).thenReturn(0);
		when(t.getY()).thenReturn(-3);
		
		assertEquals(false, t.isZero(2));
		
		verify(t).isZero(2);
		
		verify(t).getX();
		verify(t).getY();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup3iR#isZero(int)} returns false,
	 * if the z component exceeds the positive extreme point that is the inclusive
	 * tolerance parameter.
	 */
	@Test
	void isZero_Fail_Z_PositiveTest()
	{
		Tup3iR t = mock(Tup3iR.class);
		
		when(t.isZero(2)).thenCallRealMethod();
		
		when(t.getX()).thenReturn(0);
		when(t.getY()).thenReturn(0);
		when(t.getZ()).thenReturn(3);
		
		assertEquals(false, t.isZero(2));
		
		verify(t).isZero(2);
		
		verify(t).getX();
		verify(t).getY();
		verify(t).getZ();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup3iR#isZero(int)} returns false,
	 * if the z component exceeds the positive extreme point that is the inclusive
	 * tolerance parameter.
	 */
	@Test
	void isZero_Fail_Z_NegativeTest()
	{
		Tup3iR t = mock(Tup3iR.class);
		
		when(t.isZero(2)).thenCallRealMethod();
		
		when(t.getX()).thenReturn(0);
		when(t.getY()).thenReturn(0);
		when(t.getZ()).thenReturn(-3);
		
		assertEquals(false, t.isZero(2));
		
		verify(t).isZero(2);
		
		verify(t).getX();
		verify(t).getY();
		verify(t).getZ();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup3iR#toArray(int[])} returns
	 * the given array with the components in the right order.
	 */
	@Test
	void toArray_QueryTest()
	{
		Tup3iR t = mock(Tup3iR.class);
		
		int[] array = new int[3];
		
		when(t.toArray(array)).thenCallRealMethod();
		
		when(t.getX()).thenReturn(1);
		when(t.getY()).thenReturn(2);
		when(t.getZ()).thenReturn(3);
		
		assertSame(array, t.toArray(array));
		assertArrayEquals(new int[] {1, 2, 3}, array);
		
		verify(t).toArray(array);
		
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