package org.barghos.core.test.api.tuple3;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import org.barghos.core.api.tuple.TuplR;
import org.barghos.core.api.tuple3.Tup3lR;

/**
 * This class provides component tests for the interface {@link Tup3lR}.
 * 
 * @author picatrix1899
 */
class Tup3lRTest
{
	/**
	 * This test ensures, that the interface extends the interface {@link TuplR}.
	 */
	@Test
	void inheritance_TuplRTest()
	{
		assertTrue(TuplR.class.isAssignableFrom(Tup3lR.class));
	}

	/**
	 * this test ensures, that the function {@link Tup3lR#getDimensions()} always
	 * returns 3 and does not make any calls.
	 */
	@Test
	void getDimensionsTest()
	{
		Tup3lR t = mock(Tup3lR.class);
		
		when(t.getDimensions()).thenCallRealMethod();
		
		assertEquals(3, t.getDimensions());
		
		verify(t).getDimensions();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup3lR#isZero()} returns true,
	 * if all of the components are exactly zero.
	 */
	@Test
	void isZero_ZeroTest()
	{
		Tup3lR t = mock(Tup3lR.class);
		
		when(t.isZero()).thenCallRealMethod();
		
		when(t.getX()).thenReturn(0l);
		when(t.getY()).thenReturn(0l);
		when(t.getZ()).thenReturn(0l);
		
		assertEquals(true, t.isZero());
		
		verify(t).isZero();
		
		verify(t).getX();
		verify(t).getY();
		verify(t).getZ();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup3lR#isZero()} returns false,
	 * if the x component is not zero.
	 */
	@Test
	void isZero_Fail_XTest()
	{
		Tup3lR t = mock(Tup3lR.class);
		
		when(t.isZero()).thenCallRealMethod();
		
		when(t.getX()).thenReturn(1l);
		
		assertEquals(false, t.isZero());
		
		verify(t).isZero();
		
		verify(t).getX();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup3lR#isZero()} returns false,
	 * if the y component is not zero.
	 */
	@Test
	void isZero_Fail_YTest()
	{
		Tup3lR t = mock(Tup3lR.class);
		
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
	 * This test ensures, that the function {@link Tup3lR#isZero()} returns false,
	 * if the z component is not zero.
	 */
	@Test
	void isZero_Fail_ZTest()
	{
		Tup3lR t = mock(Tup3lR.class);
		
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
	 * This test ensures, that the function {@link Tup3lR#isZeroWithMargin(long)} returns true,
	 * if all components are exactly zero.
	 */
	@Test
	void isZeroWithMargin_ZeroTest()
	{
		Tup3lR t = mock(Tup3lR.class);
		
		when(t.isZeroWithMargin(2l)).thenCallRealMethod();
		
		when(t.getX()).thenReturn(0l);
		when(t.getY()).thenReturn(0l);
		when(t.getZ()).thenReturn(0l);
		
		assertEquals(true, t.isZeroWithMargin(2l));
		
		verify(t).isZeroWithMargin(2l);
		
		verify(t).getX();
		verify(t).getY();
		verify(t).getZ();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup3lR#isZeroWithMargin(long)} returns true,
	 * if all components are at the positive extreme point that is the inclusive
	 * tolerance parameter.
	 */
	@Test
	void isZeroWithMargin_Extreme_PositiveTest()
	{
		Tup3lR t = mock(Tup3lR.class);
		
		when(t.isZeroWithMargin(2l)).thenCallRealMethod();
		
		when(t.getX()).thenReturn(2l);
		when(t.getY()).thenReturn(2l);
		when(t.getZ()).thenReturn(2l);
		
		assertEquals(true, t.isZeroWithMargin(2l));
		
		verify(t).isZeroWithMargin(2l);
		
		verify(t).getX();
		verify(t).getY();
		verify(t).getZ();
		
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
		Tup3lR t = mock(Tup3lR.class);
		
		when(t.isZeroWithMargin(2l)).thenCallRealMethod();
		
		when(t.getX()).thenReturn(-2l);
		when(t.getY()).thenReturn(-2l);
		when(t.getZ()).thenReturn(-2l);
		
		assertEquals(true, t.isZeroWithMargin(2l));
		
		verify(t).isZeroWithMargin(2l);
		
		verify(t).getX();
		verify(t).getY();
		verify(t).getZ();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup3lR#isZeroWithMargin(long)} returns false,
	 * if the x component exceeds the positive extreme point that is the inclusive
	 * tolerance parameter.
	 */
	@Test
	void isZeroWithMargin_Fail_X_PositiveTest()
	{
		Tup3lR t = mock(Tup3lR.class);
		
		when(t.isZeroWithMargin(2l)).thenCallRealMethod();
		
		when(t.getX()).thenReturn(3l);
		
		assertEquals(false, t.isZeroWithMargin(2l));
		
		verify(t).isZeroWithMargin(2l);
		
		verify(t).getX();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup3lR#isZeroWithMargin(long)} returns false,
	 * if the x component exceeds the negative extreme point that is the inclusive
	 * tolerance parameter.
	 */
	@Test
	void isZeroWithMargin_Fail_X_NegativeTest()
	{
		Tup3lR t = mock(Tup3lR.class);
		
		when(t.isZeroWithMargin(2l)).thenCallRealMethod();
		
		when(t.getX()).thenReturn(-3l);
		
		assertEquals(false, t.isZeroWithMargin(2l));
		
		verify(t).isZeroWithMargin(2l);
		
		verify(t).getX();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup3lR#isZeroWithMargin(long)} returns false,
	 * if the y component exceeds the positive extreme point that is the inclusive
	 * tolerance parameter.
	 */
	@Test
	void isZeroWithMargin_Fail_Y_PositiveTest()
	{
		Tup3lR t = mock(Tup3lR.class);
		
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
	 * This test ensures, that the function {@link Tup3lR#isZeroWithMargin(long)} returns false,
	 * if the y component exceeds the positive extreme point that is the inclusive
	 * tolerance parameter.
	 */
	@Test
	void isZeroWithMargin_Fail_Y_NegativeTest()
	{
		Tup3lR t = mock(Tup3lR.class);
		
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
	 * This test ensures, that the function {@link Tup3lR#isZeroWithMargin(long)} returns false,
	 * if the z component exceeds the positive extreme point that is the inclusive
	 * tolerance parameter.
	 */
	@Test
	void isZeroWithMargin_Fail_Z_PositiveTest()
	{
		Tup3lR t = mock(Tup3lR.class);
		
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
	 * This test ensures, that the function {@link Tup3lR#isZeroWithMargin(long)} returns false,
	 * if the z component exceeds the positive extreme point that is the inclusive
	 * tolerance parameter.
	 */
	@Test
	void isZeroWithMargin_Fail_Z_NegativeTest()
	{
		Tup3lR t = mock(Tup3lR.class);
		
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
	 * This test ensures, that the default implementation of the function {@link Tup3lR#getNewInstance(Tup3lR)} calls
	 * the function {@link Tup3lR#getNewInstance(long, long, long)} with the correct components.
	 */
	@Test
	void getNewInstance_Tuple2Test()
	{
		Tup3lR original = mock(Tup3lR.class);
		Tup3lR newInstance = mock(Tup3lR.class);
		Tup3lR t = mock(Tup3lR.class);
		
		when(t.getNewInstance(original)).thenCallRealMethod();
		
		when(original.getX()).thenReturn(1l);
		when(original.getY()).thenReturn(2l);
		when(original.getZ()).thenReturn(3l);
		when(t.getNewInstance(1l, 2l, 3l)).thenReturn(newInstance);
		
		assertSame(newInstance, t.getNewInstance(original));
		
		verify(t).getNewInstance(original);
		
		verify(original).getX();
		verify(original).getY();
		verify(original).getZ();
		verify(t).getNewInstance(1l, 2l, 3l);
		
		verifyNoMoreInteractions(t, original);
	}
	
	/**
	 * This test ensures, that the default implementation of the function {@link Tup3lR#getNewInstance(long)} calls
	 * the function {@link Tup3lR#getNewInstance(long, long, long)} with the correct components.
	 */
	@Test
	void getNewInstance_ValueTest()
	{
		Tup3lR newInstance = mock(Tup3lR.class);
		Tup3lR t = mock(Tup3lR.class);
		
		when(t.getNewInstance(1l)).thenCallRealMethod();

		when(t.getNewInstance(1l, 1l, 1l)).thenReturn(newInstance);
		
		assertSame(newInstance, t.getNewInstance(1l));
		
		verify(t).getNewInstance(1l);
		
		verify(t).getNewInstance(1l, 1l, 1l);
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the default implementation of the function {@link Tup3lR#getNewInstance(TuplR)} calls
	 * the function {@link Tup3lR#getNewInstance(long, long, long)} with the correct components.
	 */
	@Test
	void getNewInstance_TupleTest()
	{
		TuplR original = mock(TuplR.class);
		Tup3lR newInstance = mock(Tup3lR.class);
		Tup3lR t = mock(Tup3lR.class);
		
		when(t.getNewInstance(original)).thenCallRealMethod();
		
		when(original.getArray()).thenReturn(new long[] {1l, 2l, 3l});
		when(t.getNewInstance(1l, 2l, 3l)).thenReturn(newInstance);
		
		assertSame(newInstance, t.getNewInstance(original));
		
		verify(t).getNewInstance(original);
		
		verify(original).getArray();
		verify(t).getNewInstance(1l, 2l, 3l);
		
		verifyNoMoreInteractions(t, original);
	}
	
	/**
	 * This test ensures, that the default implementation of the function {@link Tup3lR#getNewInstanceFromArray(long[])} calls
	 * the function {@link Tup3lR#getNewInstance(long, long, long)} with the correct components.
	 */
	@Test
	void getNewInstanceFromArrayTest()
	{
		Tup3lR newInstance = mock(Tup3lR.class);
		Tup3lR t = mock(Tup3lR.class);
		
		when(t.getNewInstanceFromArray(new long[] {1l, 2l, 3l})).thenCallRealMethod();

		when(t.getNewInstance(1l, 2l, 3l)).thenReturn(newInstance);
		
		assertSame(newInstance, t.getNewInstanceFromArray(new long[] {1l, 2l, 3l}));
		
		verify(t).getNewInstanceFromArray(new long[] {1l, 2l, 3l});
		
		verify(t).getNewInstance(1l, 2l, 3l);
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup3lR#getArray()} returns
	 * an array with the components in the right order.
	 */
	@Test
	void getArrayTest()
	{
		Tup3lR t = mock(Tup3lR.class);
		
		when(t.getArray()).thenCallRealMethod();
		
		when(t.getX()).thenReturn(1l);
		when(t.getY()).thenReturn(2l);
		when(t.getZ()).thenReturn(3l);
		
		assertArrayEquals(new long[] {1l, 2l, 3l}, t.getArray());
		
		verify(t).getArray();
		
		verify(t).getX();
		verify(t).getY();
		verify(t).getZ();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup3lR#getByIndex(int)} returns
	 * the x component for the index 0.
	 */
	@Test
	void getByIndex_XTest()
	{
		Tup3lR t = mock(Tup3lR.class);
		
		when(t.getByIndex(0)).thenCallRealMethod();
		
		when(t.getX()).thenReturn(1l);
		
		assertEquals(1l, t.getByIndex(0));

		verify(t).getByIndex(0);
		
		verify(t).getX();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup3lR#getByIndex(int)} returns
	 * the y component for the index 1.
	 */
	@Test
	void getByIndex_YTest()
	{
		Tup3lR t = mock(Tup3lR.class);
		
		when(t.getByIndex(1)).thenCallRealMethod();
		
		when(t.getY()).thenReturn(1l);
		
		assertEquals(1l, t.getByIndex(1));

		verify(t).getByIndex(1);
		
		verify(t).getY();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup3lR#getByIndex(int)} returns
	 * the z component for the index 2.
	 */
	@Test
	void getByIndex_ZTest()
	{
		Tup3lR t = mock(Tup3lR.class);
		
		when(t.getByIndex(2)).thenCallRealMethod();
		
		when(t.getZ()).thenReturn(1l);
		
		assertEquals(1l, t.getByIndex(2));

		verify(t).getByIndex(2);
		
		verify(t).getZ();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup3lR#getByIndex(int)} throws
	 * an {@link IndexOutOfBoundsException} for an index different than 0, 1 or 2.
	 */
	@Test
	void getByIndex_ExceptionTest()
	{
		Tup3lR t = mock(Tup3lR.class);
		
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