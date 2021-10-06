package org.barghos.core.test.api.tuple2;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import org.barghos.core.api.tuple.TuplR;
import org.barghos.core.api.tuple2.Tup2lR;

/**
 * This class provides component tests for the interface {@link Tup2lR}.
 * 
 * @author picatrix1899
 */
class Tup2lRTest
{
	/**
	 * This test ensures, that the interface extends the interface {@link TuplR}.
	 */
	@Test
	void inheritance_TuplRTest()
	{
		assertTrue(TuplR.class.isAssignableFrom(Tup2lR.class));
	}

	/**
	 * this test ensures, that the function {@link Tup2lR#getDimensions()} always
	 * returns 2 and does not make any calls.
	 */
	@Test
	void getDimensionsTest()
	{
		Tup2lR t = mock(Tup2lR.class);
		
		when(t.getDimensions()).thenCallRealMethod();
		
		assertEquals(2, t.getDimensions());
		
		verify(t).getDimensions();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup2lR#isZero()} returns true,
	 * if all of the components are exactly zero.
	 */
	@Test
	void isZero_ZeroTest()
	{
		Tup2lR t = mock(Tup2lR.class);
		
		when(t.isZero()).thenCallRealMethod();
		
		when(t.getX()).thenReturn(0l);
		when(t.getY()).thenReturn(0l);
		
		assertEquals(true, t.isZero());
		
		verify(t).isZero();
		
		verify(t).getX();
		verify(t).getY();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup2lR#isZero()} returns false,
	 * if the x component is not zero.
	 */
	@Test
	void isZero_Fail_XTest()
	{
		Tup2lR t = mock(Tup2lR.class);
		
		when(t.isZero()).thenCallRealMethod();
		
		when(t.getX()).thenReturn(1l);
		
		assertEquals(false, t.isZero());
		
		verify(t).isZero();
		
		verify(t).getX();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup2lR#isZero()} returns false,
	 * if the y component is not zero.
	 */
	@Test
	void isZero_Fail_YTest()
	{
		Tup2lR t = mock(Tup2lR.class);
		
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
	 * This test ensures, that the function {@link Tup2lR#isZeroWithMargin(long)} returns true,
	 * if all components are exactly zero.
	 */
	@Test
	void isZeroWithMargin_ZeroTest()
	{
		Tup2lR t = mock(Tup2lR.class);
		
		when(t.isZeroWithMargin(2l)).thenCallRealMethod();
		
		when(t.getX()).thenReturn(0l);
		when(t.getY()).thenReturn(0l);
		
		assertEquals(true, t.isZeroWithMargin(2l));
		
		verify(t).isZeroWithMargin(2l);
		
		verify(t).getX();
		verify(t).getY();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup2lR#isZeroWithMargin(long)} returns true,
	 * if all components are at the positive extreme point that is the inclusive
	 * tolerance parameter.
	 */
	@Test
	void isZeroWithMargin_Extreme_PositiveTest()
	{
		Tup2lR t = mock(Tup2lR.class);
		
		when(t.isZeroWithMargin(2l)).thenCallRealMethod();
		
		when(t.getX()).thenReturn(2l);
		when(t.getY()).thenReturn(2l);
		
		assertEquals(true, t.isZeroWithMargin(2l));
		
		verify(t).isZeroWithMargin(2l);
		
		verify(t).getX();
		verify(t).getY();
		
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
		Tup2lR t = mock(Tup2lR.class);
		
		when(t.isZeroWithMargin(2l)).thenCallRealMethod();
		
		when(t.getX()).thenReturn(-2l);
		when(t.getY()).thenReturn(-2l);
		
		assertEquals(true, t.isZeroWithMargin(2l));
		
		verify(t).isZeroWithMargin(2l);
		
		verify(t).getX();
		verify(t).getY();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup2lR#isZeroWithMargin(long)} returns false,
	 * if the x component exceeds the positive extreme point that is the inclusive
	 * tolerance parameter.
	 */
	@Test
	void isZeroWithMargin_Fail_X_PositiveTest()
	{
		Tup2lR t = mock(Tup2lR.class);
		
		when(t.isZeroWithMargin(2l)).thenCallRealMethod();
		
		when(t.getX()).thenReturn(3l);
		
		assertEquals(false, t.isZeroWithMargin(2l));
		
		verify(t).isZeroWithMargin(2l);
		
		verify(t).getX();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup2lR#isZeroWithMargin(long)} returns false,
	 * if the x component exceeds the negative extreme point that is the inclusive
	 * tolerance parameter.
	 */
	@Test
	void isZeroWithMargin_Fail_X_NegativeTest()
	{
		Tup2lR t = mock(Tup2lR.class);
		
		when(t.isZeroWithMargin(2l)).thenCallRealMethod();
		
		when(t.getX()).thenReturn(-3l);
		
		assertEquals(false, t.isZeroWithMargin(2l));
		
		verify(t).isZeroWithMargin(2l);
		
		verify(t).getX();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup2lR#isZeroWithMargin(long)} returns false,
	 * if the y component exceeds the positive extreme point that is the inclusive
	 * tolerance parameter.
	 */
	@Test
	void isZeroWithMargin_Fail_Y_PositiveTest()
	{
		Tup2lR t = mock(Tup2lR.class);
		
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
	 * This test ensures, that the function {@link Tup2lR#isZeroWithMargin(long)} returns false,
	 * if the y component exceeds the positive extreme point that is the inclusive
	 * tolerance parameter.
	 */
	@Test
	void isZeroWithMargin_Fail_Y_NegativeTest()
	{
		Tup2lR t = mock(Tup2lR.class);
		
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
	 * This test ensures, that the default implementation of the function {@link Tup2lR#getNewInstance(Tup2lR)} calls
	 * the function {@link Tup2lR#getNewInstance(long, long)} with the correct components.
	 */
	@Test
	void getNewInstance_Tuple2Test()
	{
		Tup2lR original = mock(Tup2lR.class);
		Tup2lR newInstance = mock(Tup2lR.class);
		Tup2lR t = mock(Tup2lR.class);
		
		when(t.getNewInstance(original)).thenCallRealMethod();
		
		when(original.getX()).thenReturn(1l);
		when(original.getY()).thenReturn(2l);
		when(t.getNewInstance(1l, 2l)).thenReturn(newInstance);
		
		assertSame(newInstance, t.getNewInstance(original));
		
		verify(t).getNewInstance(original);
		
		verify(original).getX();
		verify(original).getY();
		verify(t).getNewInstance(1l, 2l);
		
		verifyNoMoreInteractions(t, original);
	}
	
	/**
	 * This test ensures, that the default implementation of the function {@link Tup2lR#getNewInstance(long)} calls
	 * the function {@link Tup2lR#getNewInstance(long, long)} with the correct components.
	 */
	@Test
	void getNewInstance_ValueTest()
	{
		Tup2lR newInstance = mock(Tup2lR.class);
		Tup2lR t = mock(Tup2lR.class);
		
		when(t.getNewInstance(1l)).thenCallRealMethod();

		when(t.getNewInstance(1l, 1l)).thenReturn(newInstance);
		
		assertSame(newInstance, t.getNewInstance(1l));
		
		verify(t).getNewInstance(1l);
		
		verify(t).getNewInstance(1l, 1l);
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the default implementation of the function {@link Tup2lR#getNewInstance(TuplR)} calls
	 * the function {@link Tup2lR#getNewInstance(long, long)} with the correct components.
	 */
	@Test
	void getNewInstance_TupleTest()
	{
		TuplR original = mock(TuplR.class);
		Tup2lR newInstance = mock(Tup2lR.class);
		Tup2lR t = mock(Tup2lR.class);
		
		when(t.getNewInstance(original)).thenCallRealMethod();
		
		when(original.getArray()).thenReturn(new long[] {1l, 2l});
		when(t.getNewInstance(1l, 2l)).thenReturn(newInstance);
		
		assertSame(newInstance, t.getNewInstance(original));
		
		verify(t).getNewInstance(original);
		
		verify(original).getArray();
		verify(t).getNewInstance(1l, 2l);
		
		verifyNoMoreInteractions(t, original);
	}
	
	/**
	 * This test ensures, that the default implementation of the function {@link Tup2lR#getNewInstanceFromArray(long[])} calls
	 * the function {@link Tup2lR#getNewInstance(long, long)} with the correct components.
	 */
	@Test
	void getNewInstanceFromArrayTest()
	{
		Tup2lR newInstance = mock(Tup2lR.class);
		Tup2lR t = mock(Tup2lR.class);
		
		when(t.getNewInstanceFromArray(new long[] {1l, 2l})).thenCallRealMethod();

		when(t.getNewInstance(1l, 2l)).thenReturn(newInstance);
		
		assertSame(newInstance, t.getNewInstanceFromArray(new long[] {1l, 2l}));
		
		verify(t).getNewInstanceFromArray(new long[] {1l, 2l});
		
		verify(t).getNewInstance(1l, 2l);
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup2lR#getArray()} returns
	 * an array with the components in the right order.
	 */
	@Test
	void getArrayTest()
	{
		Tup2lR t = mock(Tup2lR.class);
		
		when(t.getArray()).thenCallRealMethod();
		
		when(t.getX()).thenReturn(1l);
		when(t.getY()).thenReturn(2l);
		
		assertArrayEquals(new long[] {1l, 2l}, t.getArray());
		
		verify(t).getArray();
		
		verify(t).getX();
		verify(t).getY();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup2lR#getByIndex(int)} returns
	 * the x component for the index 0.
	 */
	@Test
	void getByIndex_XTest()
	{
		Tup2lR t = mock(Tup2lR.class);
		
		when(t.getByIndex(0)).thenCallRealMethod();
		
		when(t.getX()).thenReturn(1l);
		
		assertEquals(1l, t.getByIndex(0));

		verify(t).getByIndex(0);
		
		verify(t).getX();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup2lR#getByIndex(int)} returns
	 * the y component for the index 1.
	 */
	@Test
	void getByIndex_YTest()
	{
		Tup2lR t = mock(Tup2lR.class);
		
		when(t.getByIndex(1)).thenCallRealMethod();
		
		when(t.getY()).thenReturn(1l);
		
		assertEquals(1l, t.getByIndex(1));

		verify(t).getByIndex(1);
		
		verify(t).getY();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup2lR#getByIndex(int)} throws
	 * an {@link IndexOutOfBoundsException} for an index different than 0 or 1.
	 */
	@Test
	void getByIndex_ExceptionTest()
	{
		Tup2lR t = mock(Tup2lR.class);
		
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