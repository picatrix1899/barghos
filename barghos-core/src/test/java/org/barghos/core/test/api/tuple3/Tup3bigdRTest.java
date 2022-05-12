package org.barghos.core.test.api.tuple3;

import static org.barghos.testutils.TestObjectFactory.*;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import java.math.BigDecimal;

import org.barghos.core.api.tuple.TupbigdR;
import org.barghos.core.api.tuple3.Tup3bigdR;

/**
 * This class provides component tests for the interface {@link Tup3bigdR}.
 * 
 * @author picatrix1899
 */
class Tup3bigdRTest
{
	/**
	 * This test ensures, that the interface extends the interface {@link TupbigdR}.
	 */
	@Test
	void inheritance_TupbigdRTest()
	{
		assertTrue(TupbigdR.class.isAssignableFrom(Tup3bigdR.class));
	}
	
	/**
	 * This test ensures, that the function {@link Tup3bigdR#isValid()} returns true,
	 * if none of the components is null.
	 */
	@Test
	void isValidTest()
	{
		Tup3bigdR t = mock(Tup3bigdR.class);
		
		when(t.isValid()).thenCallRealMethod();
		
		when(t.getX()).thenReturn(bigd(1));
		when(t.getY()).thenReturn(bigd(1));
		when(t.getZ()).thenReturn(bigd(1));
		
		assertEquals(true, t.isValid());
		
		verify(t).isValid();
		
		verify(t).getX();
		verify(t).getY();
		verify(t).getZ();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup3bigdR#isValid()} returns false,
	 * if the x component is null.
	 */
	@Test
	void isValid_Fail_XTest()
	{
		Tup3bigdR t = mock(Tup3bigdR.class);
		
		when(t.isValid()).thenCallRealMethod();
		
		when(t.getX()).thenReturn(null);

		assertEquals(false, t.isValid());
		
		verify(t).isValid();
		
		verify(t).getX();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup3bigdR#isValid()} returns false,
	 * if the y component is null.
	 */
	@Test
	void isValid_Fail_YTest()
	{
		Tup3bigdR t = mock(Tup3bigdR.class);
		
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
	 * This test ensures, that the function {@link Tup3bigdR#isValid()} returns false,
	 * if the z component is null.
	 */
	@Test
	void isValid_Fail_ZTest()
	{
		Tup3bigdR t = mock(Tup3bigdR.class);
		
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
	 * this test ensures, that the function {@link Tup3bigdR#getDimensions()} always
	 * returns 3 and does not make any calls.
	 */
	@Test
	void getDimensionsTest()
	{
		Tup3bigdR t = mock(Tup3bigdR.class);
		
		when(t.getDimensions()).thenCallRealMethod();
		
		assertEquals(3, t.getDimensions());
		
		verify(t).getDimensions();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup3bigdR#isExactlyZero()} returns true,
	 * if all of the components are exactly {@link BigDecimal#ZERO}.
	 */
	@Test
	void isExactlyZero_ZeroTest()
	{
		Tup3bigdR t = mock(Tup3bigdR.class);
		
		when(t.isExactlyZero()).thenCallRealMethod();
		
		when(t.getX()).thenReturn(bigd(0));
		when(t.getY()).thenReturn(bigd(0));
		when(t.getZ()).thenReturn(bigd(0));
		
		assertEquals(true, t.isExactlyZero());
		
		verify(t).isExactlyZero();
		
		verify(t).getX();
		verify(t).getY();
		verify(t).getZ();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup3bigdR#isExactlyZero()} returns false,
	 * if the x component is not {@link BigDecimal#ZERO}.
	 */
	@Test
	void isExactlyZero_Fail_XTest()
	{
		Tup3bigdR t = mock(Tup3bigdR.class);
		
		when(t.isExactlyZero()).thenCallRealMethod();
		
		when(t.getX()).thenReturn(bigd(1));
		
		assertEquals(false, t.isExactlyZero());
		
		verify(t).isExactlyZero();
		
		verify(t).getX();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup3bigdR#isExactlyZero()} returns false,
	 * if the y component is not {@link BigDecimal#ZERO}.
	 */
	@Test
	void isExactlyZero_Fail_YTest()
	{
		Tup3bigdR t = mock(Tup3bigdR.class);
		
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
	 * This test ensures, that the function {@link Tup3bigdR#isExactlyZero()} returns false,
	 * if the z component is not {@link BigDecimal#ZERO}.
	 */
	@Test
	void isExactlyZero_Fail_ZTest()
	{
		Tup3bigdR t = mock(Tup3bigdR.class);
		
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
	 * This test ensures, that the function {@link Tup3bigdR#isZero(BigDecimal)} returns true,
	 * if all components are exactly {@link BigDecimal#ZERO}.
	 */
	@Test
	void isZero_ZeroTest()
	{
		Tup3bigdR t = mock(Tup3bigdR.class);
		
		when(t.isZero(bigd(2))).thenCallRealMethod();
		
		when(t.getX()).thenReturn(bigd(0));
		when(t.getY()).thenReturn(bigd(0));
		when(t.getZ()).thenReturn(bigd(0));
		
		assertEquals(true, t.isZero(bigd(2)));
		
		verify(t).isZero(bigd(2));
		
		verify(t).getX();
		verify(t).getY();
		verify(t).getZ();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup3bigdR#isZero(BigDecimal)} returns true,
	 * if all components are at the positive extreme point that is the inclusive
	 * tolerance parameter.
	 */
	@Test
	void isZero_Extreme_PositiveTest()
	{
		Tup3bigdR t = mock(Tup3bigdR.class);
		
		when(t.isZero(bigd(2))).thenCallRealMethod();
		
		when(t.getX()).thenReturn(bigd(2));
		when(t.getY()).thenReturn(bigd(2));
		when(t.getZ()).thenReturn(bigd(2));
		
		assertEquals(true, t.isZero(bigd(2)));
		
		verify(t).isZero(bigd(2));
		
		verify(t).getX();
		verify(t).getY();
		verify(t).getZ();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup3bigdR#isZero(BigDecimal)} returns true,
	 * if all components are at the negative extreme point that is the inclusive
	 * tolerance parameter.
	 */
	@Test
	void isZero_Extreme_NegativeTest()
	{
		Tup3bigdR t = mock(Tup3bigdR.class);
		
		when(t.isZero(bigd(2))).thenCallRealMethod();
		
		when(t.getX()).thenReturn(bigd(-2));
		when(t.getY()).thenReturn(bigd(-2));
		when(t.getZ()).thenReturn(bigd(-2));
		
		assertEquals(true, t.isZero(bigd(2)));
		
		verify(t).isZero(bigd(2));
		
		verify(t).getX();
		verify(t).getY();
		verify(t).getZ();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup3bigdR#isZero(BigDecimal)} returns false,
	 * if the x component exceeds the positive extreme point that is the inclusive
	 * tolerance parameter.
	 */
	@Test
	void isZero_Fail_X_PositiveTest()
	{
		Tup3bigdR t = mock(Tup3bigdR.class);
		
		when(t.isZero(bigd(2))).thenCallRealMethod();
		
		when(t.getX()).thenReturn(bigd(3));
		
		assertEquals(false, t.isZero(bigd(2)));
		
		verify(t).isZero(bigd(2));
		
		verify(t).getX();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup3bigdR#isZero(BigDecimal)} returns false,
	 * if the x component exceeds the negative extreme point that is the inclusive
	 * tolerance parameter.
	 */
	@Test
	void isZero_Fail_X_NegativeTest()
	{
		Tup3bigdR t = mock(Tup3bigdR.class);
		
		when(t.isZero(bigd(2))).thenCallRealMethod();
		
		when(t.getX()).thenReturn(bigd(-3));
		
		assertEquals(false, t.isZero(bigd(2)));
		
		verify(t).isZero(bigd(2));
		
		verify(t).getX();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup3bigdR#isZero(BigDecimal)} returns false,
	 * if the y component exceeds the positive extreme point that is the inclusive
	 * tolerance parameter.
	 */
	@Test
	void isZero_Fail_Y_PositiveTest()
	{
		Tup3bigdR t = mock(Tup3bigdR.class);
		
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
	 * This test ensures, that the function {@link Tup3bigdR#isZero(BigDecimal)} returns false,
	 * if the y component exceeds the positive extreme point that is the inclusive
	 * tolerance parameter.
	 */
	@Test
	void isZero_Fail_Y_NegativeTest()
	{
		Tup3bigdR t = mock(Tup3bigdR.class);
		
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
	 * This test ensures, that the function {@link Tup3bigdR#isZero(BigDecimal)} returns false,
	 * if the z component exceeds the positive extreme point that is the inclusive
	 * tolerance parameter.
	 */
	@Test
	void isZero_Fail_Z_PositiveTest()
	{
		Tup3bigdR t = mock(Tup3bigdR.class);
		
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
	 * This test ensures, that the function {@link Tup3bigdR#isZero(BigDecimal)} returns false,
	 * if the z component exceeds the positive extreme point that is the inclusive
	 * tolerance parameter.
	 */
	@Test
	void isZero_Fail_Z_NegativeTest()
	{
		Tup3bigdR t = mock(Tup3bigdR.class);
		
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
	 * This test ensures, that the function {@link Tup3bigdR#toArray(BigDecimal[])} returns
	 * the given array with the components in the right order.
	 */
	@Test
	void toArray_QueryTest()
	{
		Tup3bigdR t = mock(Tup3bigdR.class);
		
		BigDecimal[] array = new BigDecimal[3];
		
		when(t.toArray(array)).thenCallRealMethod();
		
		when(t.getX()).thenReturn(bigd(1));
		when(t.getY()).thenReturn(bigd(2));
		when(t.getZ()).thenReturn(bigd(3));
		
		assertSame(array, t.toArray(array));
		assertArrayEquals(bigdArray(1, 2, 3), array);
		
		verify(t).toArray(array);
		
		verify(t).getX();
		verify(t).getY();
		verify(t).getZ();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup3bigdR#getByIndex(int)} returns
	 * the x component for the index 0.
	 */
	@Test
	void getByIndex_XTest()
	{
		Tup3bigdR t = mock(Tup3bigdR.class);
		
		when(t.getByIndex(0)).thenCallRealMethod();
		
		when(t.getX()).thenReturn(bigd(1));
		
		assertEquals(bigd(1), t.getByIndex(0));

		verify(t).getByIndex(0);
		
		verify(t).getX();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup3bigdR#getByIndex(int)} returns
	 * the y component for the index 1.
	 */
	@Test
	void getByIndex_YTest()
	{
		Tup3bigdR t = mock(Tup3bigdR.class);
		
		when(t.getByIndex(1)).thenCallRealMethod();
		
		when(t.getY()).thenReturn(bigd(1));
		
		assertEquals(bigd(1), t.getByIndex(1));

		verify(t).getByIndex(1);
		
		verify(t).getY();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup3bigdR#getByIndex(int)} returns
	 * the z component for the index 2.
	 */
	@Test
	void getByIndex_ZTest()
	{
		Tup3bigdR t = mock(Tup3bigdR.class);
		
		when(t.getByIndex(2)).thenCallRealMethod();
		
		when(t.getZ()).thenReturn(bigd(1));
		
		assertEquals(bigd(1), t.getByIndex(2));

		verify(t).getByIndex(2);
		
		verify(t).getZ();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup3bigdR#getByIndex(int)} throws
	 * an {@link IndexOutOfBoundsException} for an index different than 0, 1 or 2.
	 */
	@Test
	void getByIndex_ExceptionTest()
	{
		Tup3bigdR t = mock(Tup3bigdR.class);
		
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