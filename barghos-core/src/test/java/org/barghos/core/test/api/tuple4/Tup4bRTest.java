package org.barghos.core.test.api.tuple4;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import org.barghos.core.api.tuple.TupbR;
import org.barghos.core.api.tuple4.Tup4bR;

/**
 * This class provides component tests for the interface {@link Tup4bR}.
 * 
 * @author picatrix1899
 */
class Tup4bRTest
{
	/**
	 * This test ensures, that the interface extends the interface {@link TupbR}.
	 */
	@Test
	void inheritance_TupbRTest()
	{
		assertTrue(TupbR.class.isAssignableFrom(Tup4bR.class));
	}
	
	/**
	 * this test ensures, that the function {@link Tup4bR#getDimensions()} always
	 * returns 4 and does not make any calls.
	 */
	@Test
	void getDimensionsTest()
	{
		Tup4bR t = mock(Tup4bR.class);
		
		when(t.getDimensions()).thenCallRealMethod();
		
		assertEquals(4, t.getDimensions());
		
		verify(t).getDimensions();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4bR#isZero()} returns true,
	 * if all of the components are exactly zero.
	 */
	@Test
	void isZero_ZeroTest()
	{
		Tup4bR t = mock(Tup4bR.class);
		
		when(t.isZero()).thenCallRealMethod();
		
		when(t.getX()).thenReturn((byte)0);
		when(t.getY()).thenReturn((byte)0);
		when(t.getZ()).thenReturn((byte)0);
		when(t.getW()).thenReturn((byte)0);
		
		assertEquals(true, t.isZero());
		
		verify(t).isZero();
		
		verify(t).getX();
		verify(t).getY();
		verify(t).getZ();
		verify(t).getW();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4bR#isZero()} returns false,
	 * if the x component is not zero.
	 */
	@Test
	void isZero_Fail_XTest()
	{
		Tup4bR t = mock(Tup4bR.class);
		
		when(t.isZero()).thenCallRealMethod();
		
		when(t.getX()).thenReturn((byte)1);
		
		assertEquals(false, t.isZero());
		
		verify(t).isZero();
		
		verify(t).getX();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4bR#isZero()} returns false,
	 * if the y component is not zero.
	 */
	@Test
	void isZero_Fail_YTest()
	{
		Tup4bR t = mock(Tup4bR.class);
		
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
	 * This test ensures, that the function {@link Tup4bR#isZero()} returns false,
	 * if the z component is not zero.
	 */
	@Test
	void isZero_Fail_ZTest()
	{
		Tup4bR t = mock(Tup4bR.class);
		
		when(t.isZero()).thenCallRealMethod();
		
		when(t.getX()).thenReturn((byte)0);
		when(t.getY()).thenReturn((byte)0);
		when(t.getZ()).thenReturn((byte)1);
		
		assertEquals(false, t.isZero());
		
		verify(t).isZero();
		
		verify(t).getX();
		verify(t).getY();
		verify(t).getZ();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4bR#isZero()} returns false,
	 * if the w component is not zero.
	 */
	@Test
	void isZero_Fail_WTest()
	{
		Tup4bR t = mock(Tup4bR.class);
		
		when(t.isZero()).thenCallRealMethod();
		
		when(t.getX()).thenReturn((byte)0);
		when(t.getY()).thenReturn((byte)0);
		when(t.getZ()).thenReturn((byte)0);
		when(t.getW()).thenReturn((byte)1);
		
		assertEquals(false, t.isZero());
		
		verify(t).isZero();
		
		verify(t).getX();
		verify(t).getY();
		verify(t).getZ();
		verify(t).getW();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4bR#isZeroWithMargin(byte)} returns true,
	 * if all components are exactly zero.
	 */
	@Test
	void isZeroWithMargin_ZeroTest()
	{
		Tup4bR t = mock(Tup4bR.class);
		
		when(t.isZeroWithMargin((byte)2)).thenCallRealMethod();
		
		when(t.getX()).thenReturn((byte)0);
		when(t.getY()).thenReturn((byte)0);
		when(t.getZ()).thenReturn((byte)0);
		when(t.getW()).thenReturn((byte)0);
		
		assertEquals(true, t.isZeroWithMargin((byte)2));
		
		verify(t).isZeroWithMargin((byte)2);
		
		verify(t).getX();
		verify(t).getY();
		verify(t).getZ();
		verify(t).getW();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4bR#isZeroWithMargin(byte)} returns true,
	 * if all components are at the positive extreme point that is the inclusive
	 * tolerance parameter.
	 */
	@Test
	void isZeroWithMargin_Extreme_PositiveTest()
	{
		Tup4bR t = mock(Tup4bR.class);
		
		when(t.isZeroWithMargin((byte)2)).thenCallRealMethod();
		
		when(t.getX()).thenReturn((byte)2);
		when(t.getY()).thenReturn((byte)2);
		when(t.getZ()).thenReturn((byte)2);
		when(t.getW()).thenReturn((byte)2);
		
		assertEquals(true, t.isZeroWithMargin((byte)2));
		
		verify(t).isZeroWithMargin((byte)2);
		
		verify(t).getX();
		verify(t).getY();
		verify(t).getZ();
		verify(t).getW();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4bR#isZeroWithMargin(byte)} returns true,
	 * if all components are at the negative extreme point that is the inclusive
	 * tolerance parameter.
	 */
	@Test
	void isZeroWithMargin_Extreme_NegativeTest()
	{
		Tup4bR t = mock(Tup4bR.class);
		
		when(t.isZeroWithMargin((byte)2)).thenCallRealMethod();
		
		when(t.getX()).thenReturn((byte)-2);
		when(t.getY()).thenReturn((byte)-2);
		when(t.getZ()).thenReturn((byte)-2);
		when(t.getW()).thenReturn((byte)-2);
		
		assertEquals(true, t.isZeroWithMargin((byte)2));
		
		verify(t).isZeroWithMargin((byte)2);
		
		verify(t).getX();
		verify(t).getY();
		verify(t).getZ();
		verify(t).getW();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4bR#isZeroWithMargin(byte)} returns false,
	 * if the x component exceeds the positive extreme point that is the inclusive
	 * tolerance parameter.
	 */
	@Test
	void isZeroWithMargin_Fail_X_PositiveTest()
	{
		Tup4bR t = mock(Tup4bR.class);
		
		when(t.isZeroWithMargin((byte)2)).thenCallRealMethod();
		
		when(t.getX()).thenReturn((byte)3);
		
		assertEquals(false, t.isZeroWithMargin((byte)2));
		
		verify(t).isZeroWithMargin((byte)2);
		
		verify(t).getX();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4bR#isZeroWithMargin(byte)} returns false,
	 * if the x component exceeds the negative extreme point that is the inclusive
	 * tolerance parameter.
	 */
	@Test
	void isZeroWithMargin_Fail_X_NegativeTest()
	{
		Tup4bR t = mock(Tup4bR.class);
		
		when(t.isZeroWithMargin((byte)2)).thenCallRealMethod();
		
		when(t.getX()).thenReturn((byte)-3);
		
		assertEquals(false, t.isZeroWithMargin((byte)2));
		
		verify(t).isZeroWithMargin((byte)2);
		
		verify(t).getX();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4bR#isZeroWithMargin(byte)} returns false,
	 * if the y component exceeds the positive extreme point that is the inclusive
	 * tolerance parameter.
	 */
	@Test
	void isZeroWithMargin_Fail_Y_PositiveTest()
	{
		Tup4bR t = mock(Tup4bR.class);
		
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
	 * This test ensures, that the function {@link Tup4bR#isZeroWithMargin(byte)} returns false,
	 * if the y component exceeds the positive extreme point that is the inclusive
	 * tolerance parameter.
	 */
	@Test
	void isZeroWithMargin_Fail_Y_NegativeTest()
	{
		Tup4bR t = mock(Tup4bR.class);
		
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
	 * This test ensures, that the function {@link Tup4bR#isZeroWithMargin(byte)} returns false,
	 * if the z component exceeds the positive extreme point that is the inclusive
	 * tolerance parameter.
	 */
	@Test
	void isZeroWithMargin_Fail_Z_PositiveTest()
	{
		Tup4bR t = mock(Tup4bR.class);
		
		when(t.isZeroWithMargin((byte)2)).thenCallRealMethod();
		
		when(t.getX()).thenReturn((byte)0);
		when(t.getY()).thenReturn((byte)0);
		when(t.getZ()).thenReturn((byte)3);
		
		assertEquals(false, t.isZeroWithMargin((byte)2));
		
		verify(t).isZeroWithMargin((byte)2);
		
		verify(t).getX();
		verify(t).getY();
		verify(t).getZ();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4bR#isZeroWithMargin(byte)} returns false,
	 * if the z component exceeds the positive extreme point that is the inclusive
	 * tolerance parameter.
	 */
	@Test
	void isZeroWithMargin_Fail_Z_NegativeTest()
	{
		Tup4bR t = mock(Tup4bR.class);
		
		when(t.isZeroWithMargin((byte)2)).thenCallRealMethod();
		
		when(t.getX()).thenReturn((byte)0);
		when(t.getY()).thenReturn((byte)0);
		when(t.getZ()).thenReturn((byte)-3);
		
		assertEquals(false, t.isZeroWithMargin((byte)2));
		
		verify(t).isZeroWithMargin((byte)2);
		
		verify(t).getX();
		verify(t).getY();
		verify(t).getZ();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4bR#isZeroWithMargin(byte)} returns false,
	 * if the w component exceeds the positive extreme point that is the inclusive
	 * tolerance parameter.
	 */
	@Test
	void isZeroWithMargin_Fail_W_PositiveTest()
	{
		Tup4bR t = mock(Tup4bR.class);
		
		when(t.isZeroWithMargin((byte)2)).thenCallRealMethod();
		
		when(t.getX()).thenReturn((byte)0);
		when(t.getY()).thenReturn((byte)0);
		when(t.getZ()).thenReturn((byte)0);
		when(t.getW()).thenReturn((byte)3);
		
		assertEquals(false, t.isZeroWithMargin((byte)2));
		
		verify(t).isZeroWithMargin((byte)2);
		
		verify(t).getX();
		verify(t).getY();
		verify(t).getZ();
		verify(t).getW();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4bR#isZeroWithMargin(byte)} returns false,
	 * if the w component exceeds the positive extreme point that is the inclusive
	 * tolerance parameter.
	 */
	@Test
	void isZeroWithMargin_Fail_W_NegativeTest()
	{
		Tup4bR t = mock(Tup4bR.class);
		
		when(t.isZeroWithMargin((byte)2)).thenCallRealMethod();
		
		when(t.getX()).thenReturn((byte)0);
		when(t.getY()).thenReturn((byte)0);
		when(t.getZ()).thenReturn((byte)0);
		when(t.getW()).thenReturn((byte)-3);
		
		assertEquals(false, t.isZeroWithMargin((byte)2));
		
		verify(t).isZeroWithMargin((byte)2);
		
		verify(t).getX();
		verify(t).getY();
		verify(t).getZ();
		verify(t).getW();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4bR#getArray(byte[])} returns
	 * the given array with the components in the right order.
	 */
	@Test
	void toArray_QueryTest()
	{
		Tup4bR t = mock(Tup4bR.class);
		
		byte[] array = new byte[4];
		
		when(t.toArray(array)).thenCallRealMethod();
		
		when(t.getX()).thenReturn((byte)1);
		when(t.getY()).thenReturn((byte)2);
		when(t.getZ()).thenReturn((byte)3);
		when(t.getW()).thenReturn((byte)4);
		
		assertSame(array, t.toArray(array));
		assertArrayEquals(new byte[] {(byte)1, (byte)2, (byte)3, (byte)4}, array);
		
		verify(t).toArray(array);
		
		verify(t).getX();
		verify(t).getY();
		verify(t).getZ();
		verify(t).getW();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4bR#getByIndex(int)} returns
	 * the x component for the index 0.
	 */
	@Test
	void getByIndex_XTest()
	{
		Tup4bR t = mock(Tup4bR.class);
		
		when(t.getByIndex(0)).thenCallRealMethod();
		
		when(t.getX()).thenReturn((byte)1);
		
		assertEquals((byte)1, t.getByIndex(0));

		verify(t).getByIndex(0);
		
		verify(t).getX();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4bR#getByIndex(int)} returns
	 * the y component for the index 1.
	 */
	@Test
	void getByIndex_YTest()
	{
		Tup4bR t = mock(Tup4bR.class);
		
		when(t.getByIndex(1)).thenCallRealMethod();
		
		when(t.getY()).thenReturn((byte)1);
		
		assertEquals((byte)1, t.getByIndex(1));

		verify(t).getByIndex(1);
		
		verify(t).getY();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4bR#getByIndex(int)} returns
	 * the z component for the index 2.
	 */
	@Test
	void getByIndex_ZTest()
	{
		Tup4bR t = mock(Tup4bR.class);
		
		when(t.getByIndex(2)).thenCallRealMethod();
		
		when(t.getZ()).thenReturn((byte)1);
		
		assertEquals((byte)1, t.getByIndex(2));

		verify(t).getByIndex(2);
		
		verify(t).getZ();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4bR#getByIndex(int)} returns
	 * the w component for the index 3.
	 */
	@Test
	void getByIndex_WTest()
	{
		Tup4bR t = mock(Tup4bR.class);
		
		when(t.getByIndex(3)).thenCallRealMethod();
		
		when(t.getW()).thenReturn((byte)1);
		
		assertEquals((byte)1, t.getByIndex(3));

		verify(t).getByIndex(3);
		
		verify(t).getW();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4bR#getByIndex(int)} throws
	 * an {@link IndexOutOfBoundsException} for an index different than 0, 1, 2 or 3.
	 */
	@Test
	void getByIndex_ExceptionTest()
	{
		Tup4bR t = mock(Tup4bR.class);
		
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
