package org.barghos.core.test.api.tuple2;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import java.math.BigDecimal;

import org.barghos.core.api.tuple.TupbigdR;
import org.barghos.core.api.tuple2.Tup2bigdR;

/**
 * This class provides component tests for the interface {@link Tup2bigdR}.
 * 
 * @author picatrix1899
 */
class Tup2bigdRTest
{
	/**
	 * This test ensures, that the interface extends the interface {@link TupbigdR}.
	 */
	@Test
	void inheritance_TupbigdRTest()
	{
		assertTrue(TupbigdR.class.isAssignableFrom(Tup2bigdR.class));
	}
	
	/**
	 * This test ensures, that the function {@link Tup2bigdR#isValid()} returns true,
	 * if none of the components is null.
	 */
	@Test
	void isValidTest()
	{
		Tup2bigdR t = mock(Tup2bigdR.class);
		
		when(t.isValid()).thenCallRealMethod();
		
		when(t.getX()).thenReturn(BigDecimal.ONE);
		when(t.getY()).thenReturn(BigDecimal.ONE);
		
		assertEquals(true, t.isValid());
		
		verify(t).isValid();
		
		verify(t).getX();
		verify(t).getY();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup2bigdR#isValid()} returns false,
	 * if the x component is null.
	 */
	@Test
	void isValid_Fail_XTest()
	{
		Tup2bigdR t = mock(Tup2bigdR.class);
		
		when(t.isValid()).thenCallRealMethod();
		
		when(t.getX()).thenReturn(null);

		assertEquals(false, t.isValid());
		
		verify(t).isValid();
		
		verify(t).getX();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup2bigdR#isValid()} returns false,
	 * if the y component is null.
	 */
	@Test
	void isValid_Fail_YTest()
	{
		Tup2bigdR t = mock(Tup2bigdR.class);
		
		when(t.isValid()).thenCallRealMethod();
		
		when(t.getX()).thenReturn(BigDecimal.ONE);
		when(t.getY()).thenReturn(null);

		assertEquals(false, t.isValid());
		
		verify(t).isValid();
		
		verify(t).getX();
		verify(t).getY();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * this test ensures, that the function {@link Tup2bigdR#getDimensions()} always
	 * returns 2 and does not make any calls.
	 */
	@Test
	void getDimensionsTest()
	{
		Tup2bigdR t = mock(Tup2bigdR.class);
		
		when(t.getDimensions()).thenCallRealMethod();
		
		assertEquals(2, t.getDimensions());
		
		verify(t).getDimensions();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup2bigdR#isZero()} returns true,
	 * if all of the components are exactly {@link BigDecimal#ZERO}.
	 */
	@Test
	void isZero_ZeroTest()
	{
		Tup2bigdR t = mock(Tup2bigdR.class);
		
		when(t.isZero()).thenCallRealMethod();
		
		when(t.getX()).thenReturn(BigDecimal.ZERO);
		when(t.getY()).thenReturn(BigDecimal.ZERO);
		
		assertEquals(true, t.isZero());
		
		verify(t).isZero();
		
		verify(t).getX();
		verify(t).getY();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup2bigdR#isZero()} returns false,
	 * if the x component is not {@link BigDecimal#ZERO}.
	 */
	@Test
	void isZero_Fail_XTest()
	{
		Tup2bigdR t = mock(Tup2bigdR.class);
		
		when(t.isZero()).thenCallRealMethod();
		
		when(t.getX()).thenReturn(BigDecimal.ONE);
		
		assertEquals(false, t.isZero());
		
		verify(t).isZero();
		
		verify(t).getX();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup2bigdR#isZero()} returns false,
	 * if the y component is not {@link BigDecimal#ZERO}.
	 */
	@Test
	void isZero_Fail_YTest()
	{
		Tup2bigdR t = mock(Tup2bigdR.class);
		
		when(t.isZero()).thenCallRealMethod();
		
		when(t.getX()).thenReturn(BigDecimal.ZERO);
		when(t.getY()).thenReturn(BigDecimal.ONE);
		
		assertEquals(false, t.isZero());
		
		verify(t).isZero();
		
		verify(t).getX();
		verify(t).getY();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup2bigdR#isZeroWithMargin(BigDecimal)} returns true,
	 * if all components are exactly {@link BigDecimal#ZERO}.
	 */
	@Test
	void isZeroWithMargin_ZeroTest()
	{
		Tup2bigdR t = mock(Tup2bigdR.class);
		
		when(t.isZeroWithMargin(BigDecimal.valueOf(2))).thenCallRealMethod();
		
		when(t.getX()).thenReturn(BigDecimal.ZERO);
		when(t.getY()).thenReturn(BigDecimal.ZERO);
		
		assertEquals(true, t.isZeroWithMargin(BigDecimal.valueOf(2)));
		
		verify(t).isZeroWithMargin(BigDecimal.valueOf(2));
		
		verify(t).getX();
		verify(t).getY();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup2bigdR#isZeroWithMargin(BigDecimal)} returns true,
	 * if all components are at the positive extreme point that is the inclusive
	 * tolerance parameter.
	 */
	@Test
	void isZeroWithMargin_Extreme_PositiveTest()
	{
		Tup2bigdR t = mock(Tup2bigdR.class);
		
		when(t.isZeroWithMargin(BigDecimal.valueOf(2))).thenCallRealMethod();
		
		when(t.getX()).thenReturn(BigDecimal.valueOf(2));
		when(t.getY()).thenReturn(BigDecimal.valueOf(2));
		
		assertEquals(true, t.isZeroWithMargin(BigDecimal.valueOf(2)));
		
		verify(t).isZeroWithMargin(BigDecimal.valueOf(2));
		
		verify(t).getX();
		verify(t).getY();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup2bigdR#isZeroWithMargin(BigDecimal)} returns true,
	 * if all components are at the negative extreme point that is the inclusive
	 * tolerance parameter.
	 */
	@Test
	void isZeroWithMargin_Extreme_NegativeTest()
	{
		Tup2bigdR t = mock(Tup2bigdR.class);
		
		when(t.isZeroWithMargin(BigDecimal.valueOf(2))).thenCallRealMethod();
		
		when(t.getX()).thenReturn(BigDecimal.valueOf(-2));
		when(t.getY()).thenReturn(BigDecimal.valueOf(-2));
		
		assertEquals(true, t.isZeroWithMargin(BigDecimal.valueOf(2)));
		
		verify(t).isZeroWithMargin(BigDecimal.valueOf(2));
		
		verify(t).getX();
		verify(t).getY();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup2bigdR#isZeroWithMargin(BigDecimal)} returns false,
	 * if the x component exceeds the positive extreme point that is the inclusive
	 * tolerance parameter.
	 */
	@Test
	void isZeroWithMargin_Fail_X_PositiveTest()
	{
		Tup2bigdR t = mock(Tup2bigdR.class);
		
		when(t.isZeroWithMargin(BigDecimal.valueOf(2))).thenCallRealMethod();
		
		when(t.getX()).thenReturn(BigDecimal.valueOf(3));
		
		assertEquals(false, t.isZeroWithMargin(BigDecimal.valueOf(2)));
		
		verify(t).isZeroWithMargin(BigDecimal.valueOf(2));
		
		verify(t).getX();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup2bigdR#isZeroWithMargin(BigDecimal)} returns false,
	 * if the x component exceeds the negative extreme point that is the inclusive
	 * tolerance parameter.
	 */
	@Test
	void isZeroWithMargin_Fail_X_NegativeTest()
	{
		Tup2bigdR t = mock(Tup2bigdR.class);
		
		when(t.isZeroWithMargin(BigDecimal.valueOf(2))).thenCallRealMethod();
		
		when(t.getX()).thenReturn(BigDecimal.valueOf(-3));
		
		assertEquals(false, t.isZeroWithMargin(BigDecimal.valueOf(2)));
		
		verify(t).isZeroWithMargin(BigDecimal.valueOf(2));
		
		verify(t).getX();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup2bigdR#isZeroWithMargin(BigDecimal)} returns false,
	 * if the y component exceeds the positive extreme point that is the inclusive
	 * tolerance parameter.
	 */
	@Test
	void isZeroWithMargin_Fail_Y_PositiveTest()
	{
		Tup2bigdR t = mock(Tup2bigdR.class);
		
		when(t.isZeroWithMargin(BigDecimal.valueOf(2))).thenCallRealMethod();
		
		when(t.getX()).thenReturn(BigDecimal.ZERO);
		when(t.getY()).thenReturn(BigDecimal.valueOf(3));
		
		assertEquals(false, t.isZeroWithMargin(BigDecimal.valueOf(2)));
		
		verify(t).isZeroWithMargin(BigDecimal.valueOf(2));
		
		verify(t).getX();
		verify(t).getY();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup2bigdR#isZeroWithMargin(BigDecimal)} returns false,
	 * if the y component exceeds the positive extreme point that is the inclusive
	 * tolerance parameter.
	 */
	@Test
	void isZeroWithMargin_Fail_Y_NegativeTest()
	{
		Tup2bigdR t = mock(Tup2bigdR.class);
		
		when(t.isZeroWithMargin(BigDecimal.valueOf(2))).thenCallRealMethod();
		
		when(t.getX()).thenReturn(BigDecimal.ZERO);
		when(t.getY()).thenReturn(BigDecimal.valueOf(-3));
		
		assertEquals(false, t.isZeroWithMargin(BigDecimal.valueOf(2)));
		
		verify(t).isZeroWithMargin(BigDecimal.valueOf(2));
		
		verify(t).getX();
		verify(t).getY();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup2bigdR#getArray(BigDecimal[])} returns
	 * the given array with the components in the right order.
	 */
	@Test
	void toArray_QueryTest()
	{
		Tup2bigdR t = mock(Tup2bigdR.class);
		
		BigDecimal[] array = new BigDecimal[2];
		
		when(t.toArray(array)).thenCallRealMethod();
		
		when(t.getX()).thenReturn(BigDecimal.ONE);
		when(t.getY()).thenReturn(BigDecimal.valueOf(2));
		
		assertSame(array, t.toArray(array));
		assertArrayEquals(new BigDecimal[] {BigDecimal.ONE, BigDecimal.valueOf(2)}, array);
		
		verify(t).toArray(array);
		
		verify(t).getX();
		verify(t).getY();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup2bigdR#getByIndex(int)} returns
	 * the x component for the index 0.
	 */
	@Test
	void getByIndex_XTest()
	{
		Tup2bigdR t = mock(Tup2bigdR.class);
		
		when(t.getByIndex(0)).thenCallRealMethod();
		
		when(t.getX()).thenReturn(BigDecimal.ONE);
		
		assertEquals(BigDecimal.ONE, t.getByIndex(0));

		verify(t).getByIndex(0);
		
		verify(t).getX();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup2bigdR#getByIndex(int)} returns
	 * the y component for the index 1.
	 */
	@Test
	void getByIndex_YTest()
	{
		Tup2bigdR t = mock(Tup2bigdR.class);
		
		when(t.getByIndex(1)).thenCallRealMethod();
		
		when(t.getY()).thenReturn(BigDecimal.ONE);
		
		assertEquals(BigDecimal.ONE, t.getByIndex(1));

		verify(t).getByIndex(1);
		
		verify(t).getY();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup2bigdR#getByIndex(int)} throws
	 * an {@link IndexOutOfBoundsException} for an index different than 0 or 1.
	 */
	@Test
	void getByIndex_ExceptionTest()
	{
		Tup2bigdR t = mock(Tup2bigdR.class);
		
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