package org.barghos.core.test.api.tuple3;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import org.barghos.core.api.tuple.TupsR;
import org.barghos.core.api.tuple3.Tup3sR;

/**
 * This class provides component tests for the interface {@link Tup3sR}.
 * 
 * @author picatrix1899
 */
class Tup3sRTest
{
	/**
	 * This test ensures, that the interface extends the interface {@link TupsR}.
	 */
	@Test
	void inheritance_TupsRTest()
	{
		assertTrue(TupsR.class.isAssignableFrom(Tup3sR.class));
	}

	/**
	 * this test ensures, that the function {@link Tup3sR#getDimensions()} always
	 * returns 3 and does not make any calls.
	 */
	@Test
	void getDimensionsTest()
	{
		Tup3sR t = mock(Tup3sR.class);
		
		when(t.getDimensions()).thenCallRealMethod();
		
		assertEquals(3, t.getDimensions());
		
		verify(t).getDimensions();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup3sR#isZero()} returns true,
	 * if all of the components are exactly zero.
	 */
	@Test
	void isZero_ZeroTest()
	{
		Tup3sR t = mock(Tup3sR.class);
		
		when(t.isZero()).thenCallRealMethod();
		
		when(t.getX()).thenReturn((short)0);
		when(t.getY()).thenReturn((short)0);
		when(t.getZ()).thenReturn((short)0);
		
		assertEquals(true, t.isZero());
		
		verify(t).isZero();
		
		verify(t).getX();
		verify(t).getY();
		verify(t).getZ();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup3sR#isZero()} returns false,
	 * if the x component is not zero.
	 */
	@Test
	void isZero_Fail_XTest()
	{
		Tup3sR t = mock(Tup3sR.class);
		
		when(t.isZero()).thenCallRealMethod();
		
		when(t.getX()).thenReturn((short)1);
		
		assertEquals(false, t.isZero());
		
		verify(t).isZero();
		
		verify(t).getX();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup3sR#isZero()} returns false,
	 * if the y component is not zero.
	 */
	@Test
	void isZero_Fail_YTest()
	{
		Tup3sR t = mock(Tup3sR.class);
		
		when(t.isZero()).thenCallRealMethod();
		
		when(t.getX()).thenReturn((short)0);
		when(t.getY()).thenReturn((short)1);
		
		assertEquals(false, t.isZero());
		
		verify(t).isZero();
		
		verify(t).getX();
		verify(t).getY();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup3sR#isZero()} returns false,
	 * if the z component is not zero.
	 */
	@Test
	void isZero_Fail_ZTest()
	{
		Tup3sR t = mock(Tup3sR.class);
		
		when(t.isZero()).thenCallRealMethod();
		
		when(t.getX()).thenReturn((short)0);
		when(t.getY()).thenReturn((short)0);
		when(t.getZ()).thenReturn((short)1);
		
		assertEquals(false, t.isZero());
		
		verify(t).isZero();
		
		verify(t).getX();
		verify(t).getY();
		verify(t).getZ();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup3sR#isZeroWithMargin(short)} returns true,
	 * if all components are exactly zero.
	 */
	@Test
	void isZeroWithMargin_ZeroTest()
	{
		Tup3sR t = mock(Tup3sR.class);
		
		when(t.isZeroWithMargin((short)2)).thenCallRealMethod();
		
		when(t.getX()).thenReturn((short)0);
		when(t.getY()).thenReturn((short)0);
		when(t.getZ()).thenReturn((short)0);
		
		assertEquals(true, t.isZeroWithMargin((short)2));
		
		verify(t).isZeroWithMargin((short)2);
		
		verify(t).getX();
		verify(t).getY();
		verify(t).getZ();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup3sR#isZeroWithMargin(short)} returns true,
	 * if all components are at the positive extreme point that is the inclusive
	 * tolerance parameter.
	 */
	@Test
	void isZeroWithMargin_Extreme_PositiveTest()
	{
		Tup3sR t = mock(Tup3sR.class);
		
		when(t.isZeroWithMargin((short)2)).thenCallRealMethod();
		
		when(t.getX()).thenReturn((short)2);
		when(t.getY()).thenReturn((short)2);
		when(t.getZ()).thenReturn((short)2);
		
		assertEquals(true, t.isZeroWithMargin((short)2));
		
		verify(t).isZeroWithMargin((short)2);
		
		verify(t).getX();
		verify(t).getY();
		verify(t).getZ();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup2bR#isZeroWithMargin(short)} returns true,
	 * if all components are at the negative extreme point that is the inclusive
	 * tolerance parameter.
	 */
	@Test
	void isZeroWithMargin_Extreme_NegativeTest()
	{
		Tup3sR t = mock(Tup3sR.class);
		
		when(t.isZeroWithMargin((short)2)).thenCallRealMethod();
		
		when(t.getX()).thenReturn((short)-2);
		when(t.getY()).thenReturn((short)-2);
		when(t.getZ()).thenReturn((short)-2);
		
		assertEquals(true, t.isZeroWithMargin((short)2));
		
		verify(t).isZeroWithMargin((short)2);
		
		verify(t).getX();
		verify(t).getY();
		verify(t).getZ();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup3sR#isZeroWithMargin(short)} returns false,
	 * if the x component exceeds the positive extreme point that is the inclusive
	 * tolerance parameter.
	 */
	@Test
	void isZeroWithMargin_Fail_X_PositiveTest()
	{
		Tup3sR t = mock(Tup3sR.class);
		
		when(t.isZeroWithMargin((short)2)).thenCallRealMethod();
		
		when(t.getX()).thenReturn((short)3);
		
		assertEquals(false, t.isZeroWithMargin((short)2));
		
		verify(t).isZeroWithMargin((short)2);
		
		verify(t).getX();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup3sR#isZeroWithMargin(short)} returns false,
	 * if the x component exceeds the negative extreme point that is the inclusive
	 * tolerance parameter.
	 */
	@Test
	void isZeroWithMargin_Fail_X_NegativeTest()
	{
		Tup3sR t = mock(Tup3sR.class);
		
		when(t.isZeroWithMargin((short)2)).thenCallRealMethod();
		
		when(t.getX()).thenReturn((short)-3);
		
		assertEquals(false, t.isZeroWithMargin((short)2));
		
		verify(t).isZeroWithMargin((short)2);
		
		verify(t).getX();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup3sR#isZeroWithMargin(short)} returns false,
	 * if the y component exceeds the positive extreme point that is the inclusive
	 * tolerance parameter.
	 */
	@Test
	void isZeroWithMargin_Fail_Y_PositiveTest()
	{
		Tup3sR t = mock(Tup3sR.class);
		
		when(t.isZeroWithMargin((short)2)).thenCallRealMethod();
		
		when(t.getX()).thenReturn((short)0);
		when(t.getY()).thenReturn((short)3);
		
		assertEquals(false, t.isZeroWithMargin((short)2));
		
		verify(t).isZeroWithMargin((short)2);
		
		verify(t).getX();
		verify(t).getY();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup3sR#isZeroWithMargin(short)} returns false,
	 * if the y component exceeds the positive extreme point that is the inclusive
	 * tolerance parameter.
	 */
	@Test
	void isZeroWithMargin_Fail_Y_NegativeTest()
	{
		Tup3sR t = mock(Tup3sR.class);
		
		when(t.isZeroWithMargin((short)2)).thenCallRealMethod();
		
		when(t.getX()).thenReturn((short)0);
		when(t.getY()).thenReturn((short)-3);
		
		assertEquals(false, t.isZeroWithMargin((short)2));
		
		verify(t).isZeroWithMargin((short)2);
		
		verify(t).getX();
		verify(t).getY();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup3sR#isZeroWithMargin(short)} returns false,
	 * if the z component exceeds the positive extreme point that is the inclusive
	 * tolerance parameter.
	 */
	@Test
	void isZeroWithMargin_Fail_Z_PositiveTest()
	{
		Tup3sR t = mock(Tup3sR.class);
		
		when(t.isZeroWithMargin((short)2)).thenCallRealMethod();
		
		when(t.getX()).thenReturn((short)0);
		when(t.getY()).thenReturn((short)0);
		when(t.getZ()).thenReturn((short)3);
		
		assertEquals(false, t.isZeroWithMargin((short)2));
		
		verify(t).isZeroWithMargin((short)2);
		
		verify(t).getX();
		verify(t).getY();
		verify(t).getZ();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup3sR#isZeroWithMargin(short)} returns false,
	 * if the z component exceeds the positive extreme point that is the inclusive
	 * tolerance parameter.
	 */
	@Test
	void isZeroWithMargin_Fail_Z_NegativeTest()
	{
		Tup3sR t = mock(Tup3sR.class);
		
		when(t.isZeroWithMargin((short)2)).thenCallRealMethod();
		
		when(t.getX()).thenReturn((short)0);
		when(t.getY()).thenReturn((short)0);
		when(t.getZ()).thenReturn((short)-3);
		
		assertEquals(false, t.isZeroWithMargin((short)2));
		
		verify(t).isZeroWithMargin((short)2);
		
		verify(t).getX();
		verify(t).getY();
		verify(t).getZ();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the default implementation of the function {@link Tup3sR#getNewInstance(Tup3sR)} calls
	 * the function {@link Tup3sR#getNewInstance(short, short, short)} with the correct components.
	 */
	@Test
	void getNewInstance_Tuple2Test()
	{
		Tup3sR original = mock(Tup3sR.class);
		Tup3sR newInstance = mock(Tup3sR.class);
		Tup3sR t = mock(Tup3sR.class);
		
		when(t.getNewInstance(original)).thenCallRealMethod();
		
		when(original.getX()).thenReturn((short)1);
		when(original.getY()).thenReturn((short)2);
		when(original.getZ()).thenReturn((short)3);
		when(t.getNewInstance((short)1, (short)2, (short)3)).thenReturn(newInstance);
		
		assertSame(newInstance, t.getNewInstance(original));
		
		verify(t).getNewInstance(original);
		
		verify(original).getX();
		verify(original).getY();
		verify(original).getZ();
		verify(t).getNewInstance((short)1, (short)2, (short)3);
		
		verifyNoMoreInteractions(t, original);
	}
	
	/**
	 * This test ensures, that the default implementation of the function {@link Tup3sR#getNewInstance(short)} calls
	 * the function {@link Tup3sR#getNewInstance(short, short, short)} with the correct components.
	 */
	@Test
	void getNewInstance_ValueTest()
	{
		Tup3sR newInstance = mock(Tup3sR.class);
		Tup3sR t = mock(Tup3sR.class);
		
		when(t.getNewInstance((short)1)).thenCallRealMethod();

		when(t.getNewInstance((short)1, (short)1, (short)1)).thenReturn(newInstance);
		
		assertSame(newInstance, t.getNewInstance((short)1));
		
		verify(t).getNewInstance((short)1);
		
		verify(t).getNewInstance((short)1, (short)1, (short)1);
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the default implementation of the function {@link Tup3sR#getNewInstance(TupsR)} calls
	 * the function {@link Tup3sR#getNewInstance(short, short, short)} with the correct components.
	 */
	@Test
	void getNewInstance_TupleTest()
	{
		TupsR original = mock(TupsR.class);
		Tup3sR newInstance = mock(Tup3sR.class);
		Tup3sR t = mock(Tup3sR.class);
		
		when(t.getNewInstance(original)).thenCallRealMethod();
		
		when(original.getArray()).thenReturn(new short[] {(short)1, (short)2, (short)3});
		when(t.getNewInstance((short)1, (short)2, (short)3)).thenReturn(newInstance);
		
		assertSame(newInstance, t.getNewInstance(original));
		
		verify(t).getNewInstance(original);
		
		verify(original).getArray();
		verify(t).getNewInstance((short)1, (short)2, (short)3);
		
		verifyNoMoreInteractions(t, original);
	}
	
	/**
	 * This test ensures, that the default implementation of the function {@link Tup3sR#getNewInstanceFromArray(short[])} calls
	 * the function {@link Tup3sR#getNewInstance(short, short, short)} with the correct components.
	 */
	@Test
	void getNewInstanceFromArrayTest()
	{
		Tup3sR newInstance = mock(Tup3sR.class);
		Tup3sR t = mock(Tup3sR.class);
		
		when(t.getNewInstanceFromArray(new short[] {(short)1, (short)2, (short)3})).thenCallRealMethod();

		when(t.getNewInstance((short)1, (short)2, (short)3)).thenReturn(newInstance);
		
		assertSame(newInstance, t.getNewInstanceFromArray(new short[] {(short)1, (short)2, (short)3}));
		
		verify(t).getNewInstanceFromArray(new short[] {(short)1, (short)2, (short)3});
		
		verify(t).getNewInstance((short)1, (short)2, (short)3);
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup3sR#getArray()} returns
	 * an array with the components in the right order.
	 */
	@Test
	void getArrayTest()
	{
		Tup3sR t = mock(Tup3sR.class);
		
		when(t.getArray()).thenCallRealMethod();
		
		when(t.getX()).thenReturn((short)1);
		when(t.getY()).thenReturn((short)2);
		when(t.getZ()).thenReturn((short)3);
		
		assertArrayEquals(new short[] {(short)1, (short)2, (short)3}, t.getArray());
		
		verify(t).getArray();
		
		verify(t).getX();
		verify(t).getY();
		verify(t).getZ();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup3sR#getByIndex(int)} returns
	 * the x component for the index 0.
	 */
	@Test
	void getByIndex_XTest()
	{
		Tup3sR t = mock(Tup3sR.class);
		
		when(t.getByIndex(0)).thenCallRealMethod();
		
		when(t.getX()).thenReturn((short)1);
		
		assertEquals((short)1, t.getByIndex(0));

		verify(t).getByIndex(0);
		
		verify(t).getX();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup3sR#getByIndex(int)} returns
	 * the y component for the index 1.
	 */
	@Test
	void getByIndex_YTest()
	{
		Tup3sR t = mock(Tup3sR.class);
		
		when(t.getByIndex(1)).thenCallRealMethod();
		
		when(t.getY()).thenReturn((short)1);
		
		assertEquals((short)1, t.getByIndex(1));

		verify(t).getByIndex(1);
		
		verify(t).getY();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup3sR#getByIndex(int)} returns
	 * the z component for the index 2.
	 */
	@Test
	void getByIndex_ZTest()
	{
		Tup3sR t = mock(Tup3sR.class);
		
		when(t.getByIndex(2)).thenCallRealMethod();
		
		when(t.getZ()).thenReturn((short)1);
		
		assertEquals((short)1, t.getByIndex(2));

		verify(t).getByIndex(2);
		
		verify(t).getZ();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup3sR#getByIndex(int)} throws
	 * an {@link IndexOutOfBoundsException} for an index different than 0, 1 or 2.
	 */
	@Test
	void getByIndex_ExceptionTest()
	{
		Tup3sR t = mock(Tup3sR.class);
		
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