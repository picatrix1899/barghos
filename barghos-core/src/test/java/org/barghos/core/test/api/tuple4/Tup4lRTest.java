package org.barghos.core.test.api.tuple4;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import org.barghos.core.api.tuple.TuplR;
import org.barghos.core.api.tuple4.Tup4lR;

/**
 * This class provides component tests for the interface {@link Tup4lR}.
 * 
 * @author picatrix1899
 */
class Tup4lRTest
{
	/**
	 * This test ensures, that the interface extends the interface {@link TuplR}.
	 */
	@Test
	void inheritance_TuplRTest()
	{
		assertTrue(TuplR.class.isAssignableFrom(Tup4lR.class));
	}

	/**
	 * this test ensures, that the function {@link Tup4lR#getDimensions()} always
	 * returns 4 and does not make any calls.
	 */
	@Test
	void getDimensionsTest()
	{
		Tup4lR t = mock(Tup4lR.class);
		
		when(t.getDimensions()).thenCallRealMethod();
		
		assertEquals(4, t.getDimensions());
		
		verify(t).getDimensions();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4lR#isZero()} returns true,
	 * if all of the components are exactly zero.
	 */
	@Test
	void isZero_ZeroTest()
	{
		Tup4lR t = mock(Tup4lR.class);
		
		when(t.isZero()).thenCallRealMethod();
		
		when(t.getX()).thenReturn(0l);
		when(t.getY()).thenReturn(0l);
		when(t.getZ()).thenReturn(0l);
		when(t.getW()).thenReturn(0l);
		
		assertEquals(true, t.isZero());
		
		verify(t).isZero();
		
		verify(t).getX();
		verify(t).getY();
		verify(t).getZ();
		verify(t).getW();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4lR#isZero()} returns false,
	 * if the x component is not zero.
	 */
	@Test
	void isZero_Fail_XTest()
	{
		Tup4lR t = mock(Tup4lR.class);
		
		when(t.isZero()).thenCallRealMethod();
		
		when(t.getX()).thenReturn(1l);
		
		assertEquals(false, t.isZero());
		
		verify(t).isZero();
		
		verify(t).getX();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4lR#isZero()} returns false,
	 * if the y component is not zero.
	 */
	@Test
	void isZero_Fail_YTest()
	{
		Tup4lR t = mock(Tup4lR.class);
		
		when(t.isZero()).thenCallRealMethod();
		
		when(t.getX()).thenReturn(0l);
		when(t.getY()).thenReturn(1l);
		
		assertEquals(false, t.isZero());
		
		verify(t).isZero();
		
		verify(t).getX();
		verify(t).getY();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4lR#isZero()} returns false,
	 * if the z component is not zero.
	 */
	@Test
	void isZero_Fail_ZTest()
	{
		Tup4lR t = mock(Tup4lR.class);
		
		when(t.isZero()).thenCallRealMethod();
		
		when(t.getX()).thenReturn(0l);
		when(t.getY()).thenReturn(0l);
		when(t.getZ()).thenReturn(1l);
		
		assertEquals(false, t.isZero());
		
		verify(t).isZero();
		
		verify(t).getX();
		verify(t).getY();
		verify(t).getZ();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4lR#isZero()} returns false,
	 * if the w component is not zero.
	 */
	@Test
	void isZero_Fail_WTest()
	{
		Tup4lR t = mock(Tup4lR.class);
		
		when(t.isZero()).thenCallRealMethod();
		
		when(t.getX()).thenReturn(0l);
		when(t.getY()).thenReturn(0l);
		when(t.getZ()).thenReturn(0l);
		when(t.getW()).thenReturn(1l);
		
		assertEquals(false, t.isZero());
		
		verify(t).isZero();
		
		verify(t).getX();
		verify(t).getY();
		verify(t).getZ();
		verify(t).getW();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4lR#isZeroWithMargin(long)} returns true,
	 * if all components are exactly zero.
	 */
	@Test
	void isZeroWithMargin_ZeroTest()
	{
		Tup4lR t = mock(Tup4lR.class);
		
		when(t.isZeroWithMargin(2l)).thenCallRealMethod();
		
		when(t.getX()).thenReturn(0l);
		when(t.getY()).thenReturn(0l);
		when(t.getZ()).thenReturn(0l);
		when(t.getW()).thenReturn(0l);
		
		assertEquals(true, t.isZeroWithMargin(2l));
		
		verify(t).isZeroWithMargin(2l);
		
		verify(t).getX();
		verify(t).getY();
		verify(t).getZ();
		verify(t).getW();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4lR#isZeroWithMargin(long)} returns true,
	 * if all components are at the positive extreme point that is the inclusive
	 * tolerance parameter.
	 */
	@Test
	void isZeroWithMargin_Extreme_PositiveTest()
	{
		Tup4lR t = mock(Tup4lR.class);
		
		when(t.isZeroWithMargin(2l)).thenCallRealMethod();
		
		when(t.getX()).thenReturn(2l);
		when(t.getY()).thenReturn(2l);
		when(t.getZ()).thenReturn(2l);
		when(t.getW()).thenReturn(2l);
		
		assertEquals(true, t.isZeroWithMargin(2l));
		
		verify(t).isZeroWithMargin(2l);
		
		verify(t).getX();
		verify(t).getY();
		verify(t).getZ();
		verify(t).getW();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup2bR#isZeroWithMargin(long)} returns true,
	 * if all components are at the negative extreme point that is the inclusive
	 * tolerance parameter.
	 */
	@Test
	void isZeroWithMargin_Extreme_NegativeTest()
	{
		Tup4lR t = mock(Tup4lR.class);
		
		when(t.isZeroWithMargin(2l)).thenCallRealMethod();
		
		when(t.getX()).thenReturn(-2l);
		when(t.getY()).thenReturn(-2l);
		when(t.getZ()).thenReturn(-2l);
		when(t.getW()).thenReturn(-2l);
		
		assertEquals(true, t.isZeroWithMargin(2l));
		
		verify(t).isZeroWithMargin(2l);
		
		verify(t).getX();
		verify(t).getY();
		verify(t).getZ();
		verify(t).getW();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4lR#isZeroWithMargin(long)} returns false,
	 * if the x component exceeds the positive extreme point that is the inclusive
	 * tolerance parameter.
	 */
	@Test
	void isZeroWithMargin_Fail_X_PositiveTest()
	{
		Tup4lR t = mock(Tup4lR.class);
		
		when(t.isZeroWithMargin(2l)).thenCallRealMethod();
		
		when(t.getX()).thenReturn(3l);
		
		assertEquals(false, t.isZeroWithMargin(2l));
		
		verify(t).isZeroWithMargin(2l);
		
		verify(t).getX();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4lR#isZeroWithMargin(long)} returns false,
	 * if the x component exceeds the negative extreme point that is the inclusive
	 * tolerance parameter.
	 */
	@Test
	void isZeroWithMargin_Fail_X_NegativeTest()
	{
		Tup4lR t = mock(Tup4lR.class);
		
		when(t.isZeroWithMargin(2l)).thenCallRealMethod();
		
		when(t.getX()).thenReturn(-3l);
		
		assertEquals(false, t.isZeroWithMargin(2l));
		
		verify(t).isZeroWithMargin(2l);
		
		verify(t).getX();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4lR#isZeroWithMargin(long)} returns false,
	 * if the y component exceeds the positive extreme point that is the inclusive
	 * tolerance parameter.
	 */
	@Test
	void isZeroWithMargin_Fail_Y_PositiveTest()
	{
		Tup4lR t = mock(Tup4lR.class);
		
		when(t.isZeroWithMargin(2l)).thenCallRealMethod();
		
		when(t.getX()).thenReturn(0l);
		when(t.getY()).thenReturn(3l);
		
		assertEquals(false, t.isZeroWithMargin(2l));
		
		verify(t).isZeroWithMargin(2l);
		
		verify(t).getX();
		verify(t).getY();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4lR#isZeroWithMargin(long)} returns false,
	 * if the y component exceeds the positive extreme point that is the inclusive
	 * tolerance parameter.
	 */
	@Test
	void isZeroWithMargin_Fail_Y_NegativeTest()
	{
		Tup4lR t = mock(Tup4lR.class);
		
		when(t.isZeroWithMargin(2l)).thenCallRealMethod();
		
		when(t.getX()).thenReturn(0l);
		when(t.getY()).thenReturn(-3l);
		
		assertEquals(false, t.isZeroWithMargin(2l));
		
		verify(t).isZeroWithMargin(2l);
		
		verify(t).getX();
		verify(t).getY();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4lR#isZeroWithMargin(long)} returns false,
	 * if the z component exceeds the positive extreme point that is the inclusive
	 * tolerance parameter.
	 */
	@Test
	void isZeroWithMargin_Fail_Z_PositiveTest()
	{
		Tup4lR t = mock(Tup4lR.class);
		
		when(t.isZeroWithMargin(2l)).thenCallRealMethod();
		
		when(t.getX()).thenReturn(0l);
		when(t.getY()).thenReturn(0l);
		when(t.getZ()).thenReturn(3l);
		
		assertEquals(false, t.isZeroWithMargin(2l));
		
		verify(t).isZeroWithMargin(2l);
		
		verify(t).getX();
		verify(t).getY();
		verify(t).getZ();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4lR#isZeroWithMargin(long)} returns false,
	 * if the y component exceeds the positive extreme point that is the inclusive
	 * tolerance parameter.
	 */
	@Test
	void isZeroWithMargin_Fail_Z_NegativeTest()
	{
		Tup4lR t = mock(Tup4lR.class);
		
		when(t.isZeroWithMargin(2l)).thenCallRealMethod();
		
		when(t.getX()).thenReturn(0l);
		when(t.getY()).thenReturn(0l);
		when(t.getZ()).thenReturn(-3l);
		
		assertEquals(false, t.isZeroWithMargin(2l));
		
		verify(t).isZeroWithMargin(2l);
		
		verify(t).getX();
		verify(t).getY();
		verify(t).getZ();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4lR#isZeroWithMargin(long)} returns false,
	 * if the w component exceeds the positive extreme point that is the inclusive
	 * tolerance parameter.
	 */
	@Test
	void isZeroWithMargin_Fail_W_PositiveTest()
	{
		Tup4lR t = mock(Tup4lR.class);
		
		when(t.isZeroWithMargin(2l)).thenCallRealMethod();
		
		when(t.getX()).thenReturn(0l);
		when(t.getY()).thenReturn(0l);
		when(t.getZ()).thenReturn(0l);
		when(t.getW()).thenReturn(3l);
		
		assertEquals(false, t.isZeroWithMargin(2l));
		
		verify(t).isZeroWithMargin(2l);
		
		verify(t).getX();
		verify(t).getY();
		verify(t).getZ();
		verify(t).getW();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4lR#isZeroWithMargin(long)} returns false,
	 * if the w component exceeds the positive extreme point that is the inclusive
	 * tolerance parameter.
	 */
	@Test
	void isZeroWithMargin_Fail_W_NegativeTest()
	{
		Tup4lR t = mock(Tup4lR.class);
		
		when(t.isZeroWithMargin(2l)).thenCallRealMethod();
		
		when(t.getX()).thenReturn(0l);
		when(t.getY()).thenReturn(0l);
		when(t.getZ()).thenReturn(0l);
		when(t.getW()).thenReturn(-3l);
		
		assertEquals(false, t.isZeroWithMargin(2l));
		
		verify(t).isZeroWithMargin(2l);
		
		verify(t).getX();
		verify(t).getY();
		verify(t).getZ();
		verify(t).getW();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4lR#getArray(long[])} returns
	 * the given array with the components in the right order.
	 */
	@Test
	void toArray_QueryTest()
	{
		Tup4lR t = mock(Tup4lR.class);
		
		long[] array = new long[4];
		
		when(t.toArray(array)).thenCallRealMethod();
		
		when(t.getX()).thenReturn(1l);
		when(t.getY()).thenReturn(2l);
		when(t.getZ()).thenReturn(3l);
		when(t.getW()).thenReturn(4l);
		
		assertSame(array, t.toArray(array));
		assertArrayEquals(new long[] {1l, 2l, 3l, 4l}, array);
		
		verify(t).toArray(array);
		
		verify(t).getX();
		verify(t).getY();
		verify(t).getZ();
		verify(t).getW();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4lR#getByIndex(int)} returns
	 * the x component for the index 0.
	 */
	@Test
	void getByIndex_XTest()
	{
		Tup4lR t = mock(Tup4lR.class);
		
		when(t.getByIndex(0)).thenCallRealMethod();
		
		when(t.getX()).thenReturn(1l);
		
		assertEquals(1l, t.getByIndex(0));

		verify(t).getByIndex(0);
		
		verify(t).getX();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4lR#getByIndex(int)} returns
	 * the y component for the index 1.
	 */
	@Test
	void getByIndex_YTest()
	{
		Tup4lR t = mock(Tup4lR.class);
		
		when(t.getByIndex(1)).thenCallRealMethod();
		
		when(t.getY()).thenReturn(1l);
		
		assertEquals(1l, t.getByIndex(1));

		verify(t).getByIndex(1);
		
		verify(t).getY();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4lR#getByIndex(int)} returns
	 * the z component for the index 2.
	 */
	@Test
	void getByIndex_ZTest()
	{
		Tup4lR t = mock(Tup4lR.class);
		
		when(t.getByIndex(2)).thenCallRealMethod();
		
		when(t.getZ()).thenReturn(1l);
		
		assertEquals(1l, t.getByIndex(2));

		verify(t).getByIndex(2);
		
		verify(t).getZ();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4lR#getByIndex(int)} returns
	 * the w component for the index 3.
	 */
	@Test
	void getByIndex_WTest()
	{
		Tup4lR t = mock(Tup4lR.class);
		
		when(t.getByIndex(3)).thenCallRealMethod();
		
		when(t.getW()).thenReturn(1l);
		
		assertEquals(1l, t.getByIndex(3));

		verify(t).getByIndex(3);
		
		verify(t).getW();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4lR#getByIndex(int)} throws
	 * an {@link IndexOutOfBoundsException} for an index different than 0, 1, 2 or 3.
	 */
	@Test
	void getByIndex_ExceptionTest()
	{
		Tup4lR t = mock(Tup4lR.class);
		
		when(t.getByIndex(4)).thenCallRealMethod();

		assertThrows(IndexOutOfBoundsException.class, new Executable() {
			public void execute() throws Throwable
			{
				t.getByIndex(4);
			}
		});

		verify(t).getByIndex(4);

		verifyNoMoreInteractions(t);
	}
}