package org.barghos.core.test.api.tuple4;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import org.barghos.core.api.tuple.TupiR;
import org.barghos.core.api.tuple4.Tup4iR;

/**
 * This class provides component tests for the interface {@link Tup4iR}.
 * 
 * @author picatrix1899
 */
class Tup4iRTest
{
	/**
	 * This test ensures, that the interface extends the interface {@link TupiR}.
	 */
	@Test
	void inheritance_TupiRTest()
	{
		assertTrue(TupiR.class.isAssignableFrom(Tup4iR.class));
	}

	/**
	 * this test ensures, that the function {@link Tup4iR#getDimensions()} always
	 * returns 4 and does not make any calls.
	 */
	@Test
	void getDimensionsTest()
	{
		Tup4iR t = mock(Tup4iR.class);
		
		when(t.getDimensions()).thenCallRealMethod();
		
		assertEquals(4, t.getDimensions());
		
		verify(t).getDimensions();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4iR#isZero()} returns true,
	 * if all of the components are exactly zero.
	 */
	@Test
	void isZero_ZeroTest()
	{
		Tup4iR t = mock(Tup4iR.class);
		
		when(t.isZero()).thenCallRealMethod();
		
		when(t.getX()).thenReturn(0);
		when(t.getY()).thenReturn(0);
		when(t.getZ()).thenReturn(0);
		when(t.getW()).thenReturn(0);
		
		assertEquals(true, t.isZero());
		
		verify(t).isZero();
		
		verify(t).getX();
		verify(t).getY();
		verify(t).getZ();
		verify(t).getW();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4iR#isZero()} returns false,
	 * if the x component is not zero.
	 */
	@Test
	void isZero_Fail_XTest()
	{
		Tup4iR t = mock(Tup4iR.class);
		
		when(t.isZero()).thenCallRealMethod();
		
		when(t.getX()).thenReturn(1);
		
		assertEquals(false, t.isZero());
		
		verify(t).isZero();
		
		verify(t).getX();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4iR#isZero()} returns false,
	 * if the y component is not zero.
	 */
	@Test
	void isZero_Fail_YTest()
	{
		Tup4iR t = mock(Tup4iR.class);
		
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
	 * This test ensures, that the function {@link Tup4iR#isZero()} returns false,
	 * if the z component is not zero.
	 */
	@Test
	void isZero_Fail_ZTest()
	{
		Tup4iR t = mock(Tup4iR.class);
		
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
	 * This test ensures, that the function {@link Tup4iR#isZero()} returns false,
	 * if the w component is not zero.
	 */
	@Test
	void isZero_Fail_WTest()
	{
		Tup4iR t = mock(Tup4iR.class);
		
		when(t.isZero()).thenCallRealMethod();
		
		when(t.getX()).thenReturn(0);
		when(t.getY()).thenReturn(0);
		when(t.getZ()).thenReturn(0);
		when(t.getW()).thenReturn(1);
		
		assertEquals(false, t.isZero());
		
		verify(t).isZero();
		
		verify(t).getX();
		verify(t).getY();
		verify(t).getZ();
		verify(t).getW();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4iR#isZeroWithMargin(int)} returns true,
	 * if all components are exactly zero.
	 */
	@Test
	void isZeroWithMargin_ZeroTest()
	{
		Tup4iR t = mock(Tup4iR.class);
		
		when(t.isZeroWithMargin(2)).thenCallRealMethod();
		
		when(t.getX()).thenReturn(0);
		when(t.getY()).thenReturn(0);
		when(t.getZ()).thenReturn(0);
		when(t.getW()).thenReturn(0);
		
		assertEquals(true, t.isZeroWithMargin(2));
		
		verify(t).isZeroWithMargin(2);
		
		verify(t).getX();
		verify(t).getY();
		verify(t).getZ();
		verify(t).getW();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4iR#isZeroWithMargin(int)} returns true,
	 * if all components are at the positive extreme point that is the inclusive
	 * tolerance parameter.
	 */
	@Test
	void isZeroWithMargin_Extreme_PositiveTest()
	{
		Tup4iR t = mock(Tup4iR.class);
		
		when(t.isZeroWithMargin(2)).thenCallRealMethod();
		
		when(t.getX()).thenReturn(2);
		when(t.getY()).thenReturn(2);
		when(t.getZ()).thenReturn(2);
		when(t.getW()).thenReturn(2);
		
		assertEquals(true, t.isZeroWithMargin(2));
		
		verify(t).isZeroWithMargin(2);
		
		verify(t).getX();
		verify(t).getY();
		verify(t).getZ();
		verify(t).getW();
		
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
		Tup4iR t = mock(Tup4iR.class);
		
		when(t.isZeroWithMargin(2)).thenCallRealMethod();
		
		when(t.getX()).thenReturn(-2);
		when(t.getY()).thenReturn(-2);
		when(t.getZ()).thenReturn(-2);
		when(t.getW()).thenReturn(-2);
		
		assertEquals(true, t.isZeroWithMargin(2));
		
		verify(t).isZeroWithMargin(2);
		
		verify(t).getX();
		verify(t).getY();
		verify(t).getZ();
		verify(t).getW();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4iR#isZeroWithMargin(int)} returns false,
	 * if the x component exceeds the positive extreme point that is the inclusive
	 * tolerance parameter.
	 */
	@Test
	void isZeroWithMargin_Fail_X_PositiveTest()
	{
		Tup4iR t = mock(Tup4iR.class);
		
		when(t.isZeroWithMargin(2)).thenCallRealMethod();
		
		when(t.getX()).thenReturn(3);
		
		assertEquals(false, t.isZeroWithMargin(2));
		
		verify(t).isZeroWithMargin(2);
		
		verify(t).getX();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4iR#isZeroWithMargin(int)} returns false,
	 * if the x component exceeds the negative extreme point that is the inclusive
	 * tolerance parameter.
	 */
	@Test
	void isZeroWithMargin_Fail_X_NegativeTest()
	{
		Tup4iR t = mock(Tup4iR.class);
		
		when(t.isZeroWithMargin(2)).thenCallRealMethod();
		
		when(t.getX()).thenReturn(-3);
		
		assertEquals(false, t.isZeroWithMargin(2));
		
		verify(t).isZeroWithMargin(2);
		
		verify(t).getX();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4iR#isZeroWithMargin(int)} returns false,
	 * if the y component exceeds the positive extreme point that is the inclusive
	 * tolerance parameter.
	 */
	@Test
	void isZeroWithMargin_Fail_Y_PositiveTest()
	{
		Tup4iR t = mock(Tup4iR.class);
		
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
	 * This test ensures, that the function {@link Tup4iR#isZeroWithMargin(int)} returns false,
	 * if the y component exceeds the positive extreme point that is the inclusive
	 * tolerance parameter.
	 */
	@Test
	void isZeroWithMargin_Fail_Y_NegativeTest()
	{
		Tup4iR t = mock(Tup4iR.class);
		
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
	 * This test ensures, that the function {@link Tup4iR#isZeroWithMargin(int)} returns false,
	 * if the z component exceeds the positive extreme point that is the inclusive
	 * tolerance parameter.
	 */
	@Test
	void isZeroWithMargin_Fail_Z_PositiveTest()
	{
		Tup4iR t = mock(Tup4iR.class);
		
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
	 * This test ensures, that the function {@link Tup4iR#isZeroWithMargin(int)} returns false,
	 * if the z component exceeds the positive extreme point that is the inclusive
	 * tolerance parameter.
	 */
	@Test
	void isZeroWithMargin_Fail_Z_NegativeTest()
	{
		Tup4iR t = mock(Tup4iR.class);
		
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
	 * This test ensures, that the function {@link Tup4iR#isZeroWithMargin(int)} returns false,
	 * if the w component exceeds the positive extreme point that is the inclusive
	 * tolerance parameter.
	 */
	@Test
	void isZeroWithMargin_Fail_W_PositiveTest()
	{
		Tup4iR t = mock(Tup4iR.class);
		
		when(t.isZeroWithMargin(2)).thenCallRealMethod();
		
		when(t.getX()).thenReturn(0);
		when(t.getY()).thenReturn(0);
		when(t.getZ()).thenReturn(0);
		when(t.getW()).thenReturn(3);
		
		assertEquals(false, t.isZeroWithMargin(2));
		
		verify(t).isZeroWithMargin(2);
		
		verify(t).getX();
		verify(t).getY();
		verify(t).getZ();
		verify(t).getW();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4iR#isZeroWithMargin(int)} returns false,
	 * if the w component exceeds the positive extreme point that is the inclusive
	 * tolerance parameter.
	 */
	@Test
	void isZeroWithMargin_Fail_W_NegativeTest()
	{
		Tup4iR t = mock(Tup4iR.class);
		
		when(t.isZeroWithMargin(2)).thenCallRealMethod();
		
		when(t.getX()).thenReturn(0);
		when(t.getY()).thenReturn(0);
		when(t.getZ()).thenReturn(0);
		when(t.getW()).thenReturn(-3);
		
		assertEquals(false, t.isZeroWithMargin(2));
		
		verify(t).isZeroWithMargin(2);
		
		verify(t).getX();
		verify(t).getY();
		verify(t).getZ();
		verify(t).getW();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the default implementation of the function {@link Tup4iR#getNewInstance(Tup4iR)} calls
	 * the function {@link Tup4iR#getNewInstance(int, int, int, int)} with the correct components.
	 */
	@Test
	void getNewInstance_Tuple2Test()
	{
		Tup4iR original = mock(Tup4iR.class);
		Tup4iR newInstance = mock(Tup4iR.class);
		Tup4iR t = mock(Tup4iR.class);
		
		when(t.getNewInstance(original)).thenCallRealMethod();
		
		when(original.getX()).thenReturn(1);
		when(original.getY()).thenReturn(2);
		when(original.getZ()).thenReturn(3);
		when(original.getW()).thenReturn(4);
		when(t.getNewInstance(1, 2, 3, 4)).thenReturn(newInstance);
		
		assertSame(newInstance, t.getNewInstance(original));
		
		verify(t).getNewInstance(original);
		
		verify(original).getX();
		verify(original).getY();
		verify(original).getZ();
		verify(original).getW();
		verify(t).getNewInstance(1, 2, 3, 4);
		
		verifyNoMoreInteractions(t, original);
	}
	
	/**
	 * This test ensures, that the default implementation of the function {@link Tup4iR#getNewInstance(int)} calls
	 * the function {@link Tup4iR#getNewInstance(int, int, int, int)} with the correct components.
	 */
	@Test
	void getNewInstance_ValueTest()
	{
		Tup4iR newInstance = mock(Tup4iR.class);
		Tup4iR t = mock(Tup4iR.class);
		
		when(t.getNewInstance(1)).thenCallRealMethod();

		when(t.getNewInstance(1, 1, 1, 1)).thenReturn(newInstance);
		
		assertSame(newInstance, t.getNewInstance(1));
		
		verify(t).getNewInstance(1);
		
		verify(t).getNewInstance(1, 1, 1, 1);
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the default implementation of the function {@link Tup4iR#getNewInstance(TupiR)} calls
	 * the function {@link Tup4iR#getNewInstance(int, int, int, int)} with the correct components.
	 */
	@Test
	void getNewInstance_TupleTest()
	{
		TupiR original = mock(TupiR.class);
		Tup4iR newInstance = mock(Tup4iR.class);
		Tup4iR t = mock(Tup4iR.class);
		
		when(t.getNewInstance(original)).thenCallRealMethod();
		
		when(original.getArray()).thenReturn(new int[] {1, 2, 3, 4});
		when(t.getNewInstance(1, 2, 3, 4)).thenReturn(newInstance);
		
		assertSame(newInstance, t.getNewInstance(original));
		
		verify(t).getNewInstance(original);
		
		verify(original).getArray();
		verify(t).getNewInstance(1, 2, 3, 4);
		
		verifyNoMoreInteractions(t, original);
	}
	
	/**
	 * This test ensures, that the default implementation of the function {@link Tup4iR#getNewInstanceFromArray(int[])} calls
	 * the function {@link Tup4iR#getNewInstance(int, int, int, int)} with the correct components.
	 */
	@Test
	void getNewInstanceFromArrayTest()
	{
		Tup4iR newInstance = mock(Tup4iR.class);
		Tup4iR t = mock(Tup4iR.class);
		
		when(t.getNewInstanceFromArray(new int[] {1, 2, 3, 4})).thenCallRealMethod();

		when(t.getNewInstance(1, 2, 3, 4)).thenReturn(newInstance);
		
		assertSame(newInstance, t.getNewInstanceFromArray(new int[] {1, 2, 3, 4}));
		
		verify(t).getNewInstanceFromArray(new int[] {1, 2, 3, 4});
		
		verify(t).getNewInstance(1, 2, 3, 4);
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4iR#getArray()} returns
	 * an array with the components in the right order.
	 */
	@Test
	void getArrayTest()
	{
		Tup4iR t = mock(Tup4iR.class);
		
		when(t.getArray()).thenCallRealMethod();
		
		when(t.getX()).thenReturn(1);
		when(t.getY()).thenReturn(2);
		when(t.getZ()).thenReturn(3);
		when(t.getW()).thenReturn(4);
		
		assertArrayEquals(new int[] {1, 2, 3, 4}, t.getArray());
		
		verify(t).getArray();
		
		verify(t).getX();
		verify(t).getY();
		verify(t).getZ();
		verify(t).getW();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4iR#getByIndex(int)} returns
	 * the x component for the index 0.
	 */
	@Test
	void getByIndex_XTest()
	{
		Tup4iR t = mock(Tup4iR.class);
		
		when(t.getByIndex(0)).thenCallRealMethod();
		
		when(t.getX()).thenReturn(1);
		
		assertEquals(1, t.getByIndex(0));

		verify(t).getByIndex(0);
		
		verify(t).getX();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4iR#getByIndex(int)} returns
	 * the y component for the index 1.
	 */
	@Test
	void getByIndex_YTest()
	{
		Tup4iR t = mock(Tup4iR.class);
		
		when(t.getByIndex(1)).thenCallRealMethod();
		
		when(t.getY()).thenReturn(1);
		
		assertEquals(1, t.getByIndex(1));

		verify(t).getByIndex(1);
		
		verify(t).getY();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4iR#getByIndex(int)} returns
	 * the z component for the index 2.
	 */
	@Test
	void getByIndex_ZTest()
	{
		Tup4iR t = mock(Tup4iR.class);
		
		when(t.getByIndex(2)).thenCallRealMethod();
		
		when(t.getZ()).thenReturn(1);
		
		assertEquals(1, t.getByIndex(2));

		verify(t).getByIndex(2);
		
		verify(t).getZ();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4iR#getByIndex(int)} returns
	 * the w component for the index 3.
	 */
	@Test
	void getByIndex_WTest()
	{
		Tup4iR t = mock(Tup4iR.class);
		
		when(t.getByIndex(3)).thenCallRealMethod();
		
		when(t.getW()).thenReturn(1);
		
		assertEquals(1, t.getByIndex(3));

		verify(t).getByIndex(3);
		
		verify(t).getW();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4iR#getByIndex(int)} throws
	 * an {@link IndexOutOfBoundsException} for an index different than 0, 1, 2 or 3.
	 */
	@Test
	void getByIndex_ExceptionTest()
	{
		Tup4iR t = mock(Tup4iR.class);
		
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