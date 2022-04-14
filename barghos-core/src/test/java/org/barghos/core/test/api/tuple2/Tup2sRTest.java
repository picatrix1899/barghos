package org.barghos.core.test.api.tuple2;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import org.barghos.core.api.tuple.TupsR;
import org.barghos.core.api.tuple2.Tup2sR;

/**
 * This class provides component tests for the interface {@link Tup2sR}.
 * 
 * @author picatrix1899
 */
class Tup2sRTest
{
	/**
	 * This test ensures, that the interface extends the interface {@link TupsR}.
	 */
	@Test
	void inheritance_TupsRTest()
	{
		assertTrue(TupsR.class.isAssignableFrom(Tup2sR.class));
	}

	/**
	 * this test ensures, that the function {@link Tup2sR#getDimensions()} always
	 * returns 2 and does not make any calls.
	 */
	@Test
	void getDimensionsTest()
	{
		Tup2sR t = mock(Tup2sR.class);
		
		when(t.getDimensions()).thenCallRealMethod();
		
		assertEquals(2, t.getDimensions());
		
		verify(t).getDimensions();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup2sR#isZero()} returns true,
	 * if all of the components are exactly zero.
	 */
	@Test
	void isZero_ZeroTest()
	{
		Tup2sR t = mock(Tup2sR.class);
		
		when(t.isZero()).thenCallRealMethod();
		
		when(t.getX()).thenReturn((short)0);
		when(t.getY()).thenReturn((short)0);
		
		assertEquals(true, t.isZero());
		
		verify(t).isZero();
		
		verify(t).getX();
		verify(t).getY();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup2sR#isZero()} returns false,
	 * if the x component is not zero.
	 */
	@Test
	void isZero_Fail_XTest()
	{
		Tup2sR t = mock(Tup2sR.class);
		
		when(t.isZero()).thenCallRealMethod();
		
		when(t.getX()).thenReturn((short)1);
		
		assertEquals(false, t.isZero());
		
		verify(t).isZero();
		
		verify(t).getX();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup2sR#isZero()} returns false,
	 * if the y component is not zero.
	 */
	@Test
	void isZero_Fail_YTest()
	{
		Tup2sR t = mock(Tup2sR.class);
		
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
	 * This test ensures, that the function {@link Tup2sR#isZeroWithMargin(short)} returns true,
	 * if all components are exactly zero.
	 */
	@Test
	void isZeroWithMargin_ZeroTest()
	{
		Tup2sR t = mock(Tup2sR.class);
		
		when(t.isZeroWithMargin((short)2)).thenCallRealMethod();
		
		when(t.getX()).thenReturn((short)0);
		when(t.getY()).thenReturn((short)0);
		
		assertEquals(true, t.isZeroWithMargin((short)2));
		
		verify(t).isZeroWithMargin((short)2);
		
		verify(t).getX();
		verify(t).getY();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup2sR#isZeroWithMargin(short)} returns true,
	 * if all components are at the positive extreme point that is the inclusive
	 * tolerance parameter.
	 */
	@Test
	void isZeroWithMargin_Extreme_PositiveTest()
	{
		Tup2sR t = mock(Tup2sR.class);
		
		when(t.isZeroWithMargin((short)2)).thenCallRealMethod();
		
		when(t.getX()).thenReturn((short)2);
		when(t.getY()).thenReturn((short)2);
		
		assertEquals(true, t.isZeroWithMargin((short)2));
		
		verify(t).isZeroWithMargin((short)2);
		
		verify(t).getX();
		verify(t).getY();
		
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
		Tup2sR t = mock(Tup2sR.class);
		
		when(t.isZeroWithMargin((short)2)).thenCallRealMethod();
		
		when(t.getX()).thenReturn((short)-2);
		when(t.getY()).thenReturn((short)-2);
		
		assertEquals(true, t.isZeroWithMargin((short)2));
		
		verify(t).isZeroWithMargin((short)2);
		
		verify(t).getX();
		verify(t).getY();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup2sR#isZeroWithMargin(short)} returns false,
	 * if the x component exceeds the positive extreme point that is the inclusive
	 * tolerance parameter.
	 */
	@Test
	void isZeroWithMargin_Fail_X_PositiveTest()
	{
		Tup2sR t = mock(Tup2sR.class);
		
		when(t.isZeroWithMargin((short)2)).thenCallRealMethod();
		
		when(t.getX()).thenReturn((short)3);
		
		assertEquals(false, t.isZeroWithMargin((short)2));
		
		verify(t).isZeroWithMargin((short)2);
		
		verify(t).getX();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup2sR#isZeroWithMargin(short)} returns false,
	 * if the x component exceeds the negative extreme point that is the inclusive
	 * tolerance parameter.
	 */
	@Test
	void isZeroWithMargin_Fail_X_NegativeTest()
	{
		Tup2sR t = mock(Tup2sR.class);
		
		when(t.isZeroWithMargin((short)2)).thenCallRealMethod();
		
		when(t.getX()).thenReturn((short)-3);
		
		assertEquals(false, t.isZeroWithMargin((short)2));
		
		verify(t).isZeroWithMargin((short)2);
		
		verify(t).getX();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup2sR#isZeroWithMargin(short)} returns false,
	 * if the y component exceeds the positive extreme point that is the inclusive
	 * tolerance parameter.
	 */
	@Test
	void isZeroWithMargin_Fail_Y_PositiveTest()
	{
		Tup2sR t = mock(Tup2sR.class);
		
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
	 * This test ensures, that the function {@link Tup2sR#isZeroWithMargin(short)} returns false,
	 * if the y component exceeds the positive extreme point that is the inclusive
	 * tolerance parameter.
	 */
	@Test
	void isZeroWithMargin_Fail_Y_NegativeTest()
	{
		Tup2sR t = mock(Tup2sR.class);
		
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
	 * This test ensures, that the function {@link Tup2sR#getArray(short[])} returns
	 * the given array with the components in the right order.
	 */
	@Test
	void toArray_QueryTest()
	{
		Tup2sR t = mock(Tup2sR.class);
		
		short[] array = new short[2];
		
		when(t.toArray(array)).thenCallRealMethod();
		
		when(t.getX()).thenReturn((short)1);
		when(t.getY()).thenReturn((short)2);
		
		assertSame(array, t.toArray(array));
		assertArrayEquals(new short[] {(short)1, (short)2}, array);
		
		verify(t).toArray(array);
		
		verify(t).getX();
		verify(t).getY();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup2sR#getByIndex(int)} returns
	 * the x component for the index 0.
	 */
	@Test
	void getByIndex_XTest()
	{
		Tup2sR t = mock(Tup2sR.class);
		
		when(t.getByIndex(0)).thenCallRealMethod();
		
		when(t.getX()).thenReturn((short)1);
		
		assertEquals((short)1, t.getByIndex(0));

		verify(t).getByIndex(0);
		
		verify(t).getX();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup2sR#getByIndex(int)} returns
	 * the y component for the index 1.
	 */
	@Test
	void getByIndex_YTest()
	{
		Tup2sR t = mock(Tup2sR.class);
		
		when(t.getByIndex(1)).thenCallRealMethod();
		
		when(t.getY()).thenReturn((short)1);
		
		assertEquals((short)1, t.getByIndex(1));

		verify(t).getByIndex(1);
		
		verify(t).getY();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup2sR#getByIndex(int)} throws
	 * an {@link IndexOutOfBoundsException} for an index different than 0 or 1.
	 */
	@Test
	void getByIndex_ExceptionTest()
	{
		Tup2sR t = mock(Tup2sR.class);
		
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