package org.barghos.core.test.api.tuple4;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import java.math.BigDecimal;

import static org.barghos.core.api.testing.TestObjectFactory.*;

import org.barghos.core.api.tuple.TupbigdR;
import org.barghos.core.api.tuple4.Tup4bigdR;

/**
 * This class provides component tests for the interface {@link Tup4bigdR}.
 * 
 * @author picatrix1899
 */
class Tup4bigdRTest
{
	/**
	 * This test ensures, that the interface extends the interface {@link TupbigdR}.
	 */
	@Test
	void inheritance_TupbigdRTest()
	{
		assertTrue(TupbigdR.class.isAssignableFrom(Tup4bigdR.class));
	}
	
	/**
	 * This test ensures, that the function {@link Tup4bigdR#isValid()} returns true,
	 * if none of the components is null.
	 */
	@Test
	void isValidTest()
	{
		Tup4bigdR t = mock(Tup4bigdR.class);
		
		when(t.isValid()).thenCallRealMethod();
		
		when(t.getX()).thenReturn(bigd(1));
		when(t.getY()).thenReturn(bigd(1));
		when(t.getZ()).thenReturn(bigd(1));
		when(t.getW()).thenReturn(bigd(1));
		
		assertEquals(true, t.isValid());
		
		verify(t).isValid();
		
		verify(t).getX();
		verify(t).getY();
		verify(t).getZ();
		verify(t).getW();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4bigdR#isValid()} returns false,
	 * if the x component is null.
	 */
	@Test
	void isValid_Fail_XTest()
	{
		Tup4bigdR t = mock(Tup4bigdR.class);
		
		when(t.isValid()).thenCallRealMethod();
		
		when(t.getX()).thenReturn(null);

		assertEquals(false, t.isValid());
		
		verify(t).isValid();
		
		verify(t).getX();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4bigdR#isValid()} returns false,
	 * if the y component is null.
	 */
	@Test
	void isValid_Fail_YTest()
	{
		Tup4bigdR t = mock(Tup4bigdR.class);
		
		when(t.isValid()).thenCallRealMethod();
		
		when(t.getX()).thenReturn(bigd(1));
		when(t.getY()).thenReturn(null);

		assertEquals(false, t.isValid());
		
		verify(t).isValid();
		
		verify(t).getX();
		verify(t).getY();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4bigdR#isValid()} returns false,
	 * if the z component is null.
	 */
	@Test
	void isValid_Fail_ZTest()
	{
		Tup4bigdR t = mock(Tup4bigdR.class);
		
		when(t.isValid()).thenCallRealMethod();
		
		when(t.getX()).thenReturn(bigd(1));
		when(t.getY()).thenReturn(bigd(1));
		when(t.getZ()).thenReturn(null);

		assertEquals(false, t.isValid());
		
		verify(t).isValid();
		
		verify(t).getX();
		verify(t).getY();
		verify(t).getZ();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4bigdR#isValid()} returns false,
	 * if the w component is null.
	 */
	@Test
	void isValid_Fail_WTest()
	{
		Tup4bigdR t = mock(Tup4bigdR.class);
		
		when(t.isValid()).thenCallRealMethod();
		
		when(t.getX()).thenReturn(bigd(1));
		when(t.getY()).thenReturn(bigd(1));
		when(t.getZ()).thenReturn(bigd(1));
		when(t.getW()).thenReturn(null);

		assertEquals(false, t.isValid());
		
		verify(t).isValid();
		
		verify(t).getX();
		verify(t).getY();
		verify(t).getZ();
		verify(t).getW();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * this test ensures, that the function {@link Tup4bigdR#getDimensions()} always
	 * returns 4 and does not make any calls.
	 */
	@Test
	void getDimensionsTest()
	{
		Tup4bigdR t = mock(Tup4bigdR.class);
		
		when(t.getDimensions()).thenCallRealMethod();
		
		assertEquals(4, t.getDimensions());
		
		verify(t).getDimensions();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4bigdR#isExactlyZero()} returns true,
	 * if all of the components are exactly {@link BigDecimal#ZERO}.
	 */
	@Test
	void isExactlyZero_ZeroTest()
	{
		Tup4bigdR t = mock(Tup4bigdR.class);
		
		when(t.isExactlyZero()).thenCallRealMethod();
		
		when(t.getX()).thenReturn(bigd(0));
		when(t.getY()).thenReturn(bigd(0));
		when(t.getZ()).thenReturn(bigd(0));
		when(t.getW()).thenReturn(bigd(0));
		
		assertEquals(true, t.isExactlyZero());
		
		verify(t).isExactlyZero();
		
		verify(t).getX();
		verify(t).getY();
		verify(t).getZ();
		verify(t).getW();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4bigdR#isExactlyZero()} returns false,
	 * if the x component is not {@link BigDecimal#ZERO}.
	 */
	@Test
	void isExactlyZero_Fail_XTest()
	{
		Tup4bigdR t = mock(Tup4bigdR.class);
		
		when(t.isExactlyZero()).thenCallRealMethod();
		
		when(t.getX()).thenReturn(bigd(1));
		
		assertEquals(false, t.isExactlyZero());
		
		verify(t).isExactlyZero();
		
		verify(t).getX();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4bigdR#isExactlyZero()} returns false,
	 * if the y component is not {@link BigDecimal#ZERO}.
	 */
	@Test
	void isExactlyZero_Fail_YTest()
	{
		Tup4bigdR t = mock(Tup4bigdR.class);
		
		when(t.isExactlyZero()).thenCallRealMethod();
		
		when(t.getX()).thenReturn(bigd(0));
		when(t.getY()).thenReturn(bigd(1));
		
		assertEquals(false, t.isExactlyZero());
		
		verify(t).isExactlyZero();
		
		verify(t).getX();
		verify(t).getY();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4bigdR#isExactlyZero()} returns false,
	 * if the z component is not {@link BigDecimal#ZERO}.
	 */
	@Test
	void isExactlyZero_Fail_ZTest()
	{
		Tup4bigdR t = mock(Tup4bigdR.class);
		
		when(t.isExactlyZero()).thenCallRealMethod();
		
		when(t.getX()).thenReturn(bigd(0));
		when(t.getY()).thenReturn(bigd(0));
		when(t.getZ()).thenReturn(bigd(1));
		
		assertEquals(false, t.isExactlyZero());
		
		verify(t).isExactlyZero();
		
		verify(t).getX();
		verify(t).getY();
		verify(t).getZ();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4bigdR#isExactlyZero()} returns false,
	 * if the w component is not {@link BigDecimal#ZERO}.
	 */
	@Test
	void isExactlyZero_Fail_WTest()
	{
		Tup4bigdR t = mock(Tup4bigdR.class);
		
		when(t.isExactlyZero()).thenCallRealMethod();
		
		when(t.getX()).thenReturn(bigd(0));
		when(t.getY()).thenReturn(bigd(0));
		when(t.getZ()).thenReturn(bigd(0));
		when(t.getW()).thenReturn(bigd(1));
		
		assertEquals(false, t.isExactlyZero());
		
		verify(t).isExactlyZero();
		
		verify(t).getX();
		verify(t).getY();
		verify(t).getZ();
		verify(t).getW();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4bigdR#isZero(BigDecimal)} returns true,
	 * if all components are exactly {@link BigDecimal#ZERO}.
	 */
	@Test
	void isZero_ZeroTest()
	{
		Tup4bigdR t = mock(Tup4bigdR.class);
		
		when(t.isZero(bigd(2))).thenCallRealMethod();
		
		when(t.getX()).thenReturn(bigd(0));
		when(t.getY()).thenReturn(bigd(0));
		when(t.getZ()).thenReturn(bigd(0));
		when(t.getW()).thenReturn(bigd(0));
		
		assertEquals(true, t.isZero(bigd(2)));
		
		verify(t).isZero(bigd(2));
		
		verify(t).getX();
		verify(t).getY();
		verify(t).getZ();
		verify(t).getW();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4bigdR#isZero(BigDecimal)} returns true,
	 * if all components are at the positive extreme point that is the inclusive
	 * tolerance parameter.
	 */
	@Test
	void isZero_Extreme_PositiveTest()
	{
		Tup4bigdR t = mock(Tup4bigdR.class);
		
		when(t.isZero(bigd(2))).thenCallRealMethod();
		
		when(t.getX()).thenReturn(bigd(2));
		when(t.getY()).thenReturn(bigd(2));
		when(t.getZ()).thenReturn(bigd(2));
		when(t.getW()).thenReturn(bigd(2));
		
		assertEquals(true, t.isZero(bigd(2)));
		
		verify(t).isZero(bigd(2));
		
		verify(t).getX();
		verify(t).getY();
		verify(t).getZ();
		verify(t).getW();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4bigdR#isZero(BigDecimal)} returns true,
	 * if all components are at the negative extreme point that is the inclusive
	 * tolerance parameter.
	 */
	@Test
	void isZero_Extreme_NegativeTest()
	{
		Tup4bigdR t = mock(Tup4bigdR.class);
		
		when(t.isZero(bigd(2))).thenCallRealMethod();
		
		when(t.getX()).thenReturn(bigd(-2));
		when(t.getY()).thenReturn(bigd(-2));
		when(t.getZ()).thenReturn(bigd(-2));
		when(t.getW()).thenReturn(bigd(-2));
		
		assertEquals(true, t.isZero(bigd(2)));
		
		verify(t).isZero(bigd(2));
		
		verify(t).getX();
		verify(t).getY();
		verify(t).getZ();
		verify(t).getW();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4bigdR#isZero(BigDecimal)} returns false,
	 * if the x component exceeds the positive extreme point that is the inclusive
	 * tolerance parameter.
	 */
	@Test
	void isZero_Fail_X_PositiveTest()
	{
		Tup4bigdR t = mock(Tup4bigdR.class);
		
		when(t.isZero(bigd(2))).thenCallRealMethod();
		
		when(t.getX()).thenReturn(bigd(3));
		
		assertEquals(false, t.isZero(bigd(2)));
		
		verify(t).isZero(bigd(2));
		
		verify(t).getX();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4bigdR#isZero(BigDecimal)} returns false,
	 * if the x component exceeds the negative extreme point that is the inclusive
	 * tolerance parameter.
	 */
	@Test
	void isZero_Fail_X_NegativeTest()
	{
		Tup4bigdR t = mock(Tup4bigdR.class);
		
		when(t.isZero(bigd(2))).thenCallRealMethod();
		
		when(t.getX()).thenReturn(bigd(-3));
		
		assertEquals(false, t.isZero(bigd(2)));
		
		verify(t).isZero(bigd(2));
		
		verify(t).getX();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4bigdR#isZero(BigDecimal)} returns false,
	 * if the y component exceeds the positive extreme point that is the inclusive
	 * tolerance parameter.
	 */
	@Test
	void isZero_Fail_Y_PositiveTest()
	{
		Tup4bigdR t = mock(Tup4bigdR.class);
		
		when(t.isZero(bigd(2))).thenCallRealMethod();
		
		when(t.getX()).thenReturn(bigd(0));
		when(t.getY()).thenReturn(bigd(3));
		
		assertEquals(false, t.isZero(bigd(2)));
		
		verify(t).isZero(bigd(2));
		
		verify(t).getX();
		verify(t).getY();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4bigdR#isZero(BigDecimal)} returns false,
	 * if the y component exceeds the positive extreme point that is the inclusive
	 * tolerance parameter.
	 */
	@Test
	void isZero_Fail_Y_NegativeTest()
	{
		Tup4bigdR t = mock(Tup4bigdR.class);
		
		when(t.isZero(bigd(2))).thenCallRealMethod();
		
		when(t.getX()).thenReturn(bigd(0));
		when(t.getY()).thenReturn(bigd(-3));
		
		assertEquals(false, t.isZero(bigd(2)));
		
		verify(t).isZero(bigd(2));
		
		verify(t).getX();
		verify(t).getY();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4bigdR#isZero(BigDecimal)} returns false,
	 * if the z component exceeds the positive extreme point that is the inclusive
	 * tolerance parameter.
	 */
	@Test
	void isZero_Fail_Z_PositiveTest()
	{
		Tup4bigdR t = mock(Tup4bigdR.class);
		
		when(t.isZero(bigd(2))).thenCallRealMethod();
		
		when(t.getX()).thenReturn(bigd(0));
		when(t.getY()).thenReturn(bigd(0));
		when(t.getZ()).thenReturn(bigd(3));
		
		assertEquals(false, t.isZero(bigd(2)));
		
		verify(t).isZero(bigd(2));
		
		verify(t).getX();
		verify(t).getY();
		verify(t).getZ();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4bigdR#isZero(BigDecimal)} returns false,
	 * if the y component exceeds the positive extreme point that is the inclusive
	 * tolerance parameter.
	 */
	@Test
	void isZero_Fail_Z_NegativeTest()
	{
		Tup4bigdR t = mock(Tup4bigdR.class);
		
		when(t.isZero(bigd(2))).thenCallRealMethod();
		
		when(t.getX()).thenReturn(bigd(0));
		when(t.getY()).thenReturn(bigd(0));
		when(t.getZ()).thenReturn(bigd(-3));
		
		assertEquals(false, t.isZero(bigd(2)));
		
		verify(t).isZero(bigd(2));
		
		verify(t).getX();
		verify(t).getY();
		verify(t).getZ();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4bigdR#isZero(BigDecimal)} returns false,
	 * if the w component exceeds the positive extreme point that is the inclusive
	 * tolerance parameter.
	 */
	@Test
	void isZero_Fail_W_PositiveTest()
	{
		Tup4bigdR t = mock(Tup4bigdR.class);
		
		when(t.isZero(bigd(2))).thenCallRealMethod();
		
		when(t.getX()).thenReturn(bigd(0));
		when(t.getY()).thenReturn(bigd(0));
		when(t.getZ()).thenReturn(bigd(0));
		when(t.getW()).thenReturn(bigd(3));
		
		assertEquals(false, t.isZero(bigd(2)));
		
		verify(t).isZero(bigd(2));
		
		verify(t).getX();
		verify(t).getY();
		verify(t).getZ();
		verify(t).getW();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4bigdR#isZero(BigDecimal)} returns false,
	 * if the w component exceeds the positive extreme point that is the inclusive
	 * tolerance parameter.
	 */
	@Test
	void isZero_Fail_W_NegativeTest()
	{
		Tup4bigdR t = mock(Tup4bigdR.class);
		
		when(t.isZero(bigd(2))).thenCallRealMethod();
		
		when(t.getX()).thenReturn(bigd(0));
		when(t.getY()).thenReturn(bigd(0));
		when(t.getZ()).thenReturn(bigd(0));
		when(t.getW()).thenReturn(bigd(-3));
		
		assertEquals(false, t.isZero(bigd(2)));
		
		verify(t).isZero(bigd(2));
		
		verify(t).getX();
		verify(t).getY();
		verify(t).getZ();
		verify(t).getW();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4bigdR#toArray(BigDecimal[])} returns
	 * the given array with the components in the right order.
	 */
	@Test
	void toArray_QueryTest()
	{
		Tup4bigdR t = mock(Tup4bigdR.class);
		
		BigDecimal[] array = new BigDecimal[4];
		
		when(t.toArray(array)).thenCallRealMethod();
		
		when(t.getX()).thenReturn(bigd(1));
		when(t.getY()).thenReturn(bigd(2));
		when(t.getZ()).thenReturn(bigd(3));
		when(t.getW()).thenReturn(bigd(4));
		
		assertSame(array, t.toArray(array));
		assertArrayEquals(bigdArray(1, 2, 3, 4), array);
		
		verify(t).toArray(array);
		
		verify(t).getX();
		verify(t).getY();
		verify(t).getZ();
		verify(t).getW();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4bigdR#getByIndex(int)} returns
	 * the x component for the index 0.
	 */
	@Test
	void getByIndex_XTest()
	{
		Tup4bigdR t = mock(Tup4bigdR.class);
		
		when(t.getByIndex(0)).thenCallRealMethod();
		
		when(t.getX()).thenReturn(bigd(1));
		
		assertEquals(bigd(1), t.getByIndex(0));

		verify(t).getByIndex(0);
		
		verify(t).getX();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4bigdR#getByIndex(int)} returns
	 * the y component for the index 1.
	 */
	@Test
	void getByIndex_YTest()
	{
		Tup4bigdR t = mock(Tup4bigdR.class);
		
		when(t.getByIndex(1)).thenCallRealMethod();
		
		when(t.getY()).thenReturn(bigd(1));
		
		assertEquals(bigd(1), t.getByIndex(1));

		verify(t).getByIndex(1);
		
		verify(t).getY();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4bigdR#getByIndex(int)} returns
	 * the z component for the index 2.
	 */
	@Test
	void getByIndex_ZTest()
	{
		Tup4bigdR t = mock(Tup4bigdR.class);
		
		when(t.getByIndex(2)).thenCallRealMethod();
		
		when(t.getZ()).thenReturn(bigd(1));
		
		assertEquals(bigd(1), t.getByIndex(2));

		verify(t).getByIndex(2);
		
		verify(t).getZ();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4bigdR#getByIndex(int)} returns
	 * the w component for the index 3.
	 */
	@Test
	void getByIndex_WTest()
	{
		Tup4bigdR t = mock(Tup4bigdR.class);
		
		when(t.getByIndex(3)).thenCallRealMethod();
		
		when(t.getW()).thenReturn(bigd(1));
		
		assertEquals(bigd(1), t.getByIndex(3));

		verify(t).getByIndex(3);
		
		verify(t).getW();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4bigdR#getByIndex(int)} throws
	 * an {@link IndexOutOfBoundsException} for an index different than 0, 1, 2 or 3.
	 */
	@Test
	void getByIndex_ExceptionTest()
	{
		Tup4bigdR t = mock(Tup4bigdR.class);
		
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