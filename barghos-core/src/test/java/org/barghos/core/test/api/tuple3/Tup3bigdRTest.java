package org.barghos.core.test.api.tuple3;

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
		
		when(t.getX()).thenReturn(BigDecimal.ONE);
		when(t.getY()).thenReturn(BigDecimal.ONE);
		when(t.getZ()).thenReturn(BigDecimal.ONE);
		
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
		
		when(t.getX()).thenReturn(BigDecimal.ONE);
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
		
		when(t.getX()).thenReturn(BigDecimal.ONE);
		when(t.getY()).thenReturn(BigDecimal.ONE);
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
	 * This test ensures, that the function {@link Tup3bigdR#isZero()} returns true,
	 * if all of the components are exactly {@link BigDecimal#ZERO}.
	 */
	@Test
	void isZero_ZeroTest()
	{
		Tup3bigdR t = mock(Tup3bigdR.class);
		
		when(t.isZero()).thenCallRealMethod();
		
		when(t.getX()).thenReturn(BigDecimal.ZERO);
		when(t.getY()).thenReturn(BigDecimal.ZERO);
		when(t.getZ()).thenReturn(BigDecimal.ZERO);
		
		assertEquals(true, t.isZero());
		
		verify(t).isZero();
		
		verify(t).getX();
		verify(t).getY();
		verify(t).getZ();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup3bigdR#isZero()} returns false,
	 * if the x component is not {@link BigDecimal#ZERO}.
	 */
	@Test
	void isZero_Fail_XTest()
	{
		Tup3bigdR t = mock(Tup3bigdR.class);
		
		when(t.isZero()).thenCallRealMethod();
		
		when(t.getX()).thenReturn(BigDecimal.ONE);
		
		assertEquals(false, t.isZero());
		
		verify(t).isZero();
		
		verify(t).getX();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup3bigdR#isZero()} returns false,
	 * if the y component is not {@link BigDecimal#ZERO}.
	 */
	@Test
	void isZero_Fail_YTest()
	{
		Tup3bigdR t = mock(Tup3bigdR.class);
		
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
	 * This test ensures, that the function {@link Tup3bigdR#isZero()} returns false,
	 * if the z component is not {@link BigDecimal#ZERO}.
	 */
	@Test
	void isZero_Fail_ZTest()
	{
		Tup3bigdR t = mock(Tup3bigdR.class);
		
		when(t.isZero()).thenCallRealMethod();
		
		when(t.getX()).thenReturn(BigDecimal.ZERO);
		when(t.getY()).thenReturn(BigDecimal.ZERO);
		when(t.getZ()).thenReturn(BigDecimal.ONE);
		
		assertEquals(false, t.isZero());
		
		verify(t).isZero();
		
		verify(t).getX();
		verify(t).getY();
		verify(t).getZ();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup3bigdR#isZeroWithMargin(BigDecimal)} returns true,
	 * if all components are exactly {@link BigDecimal#ZERO}.
	 */
	@Test
	void isZeroWithMargin_ZeroTest()
	{
		Tup3bigdR t = mock(Tup3bigdR.class);
		
		when(t.isZeroWithMargin(BigDecimal.valueOf(2))).thenCallRealMethod();
		
		when(t.getX()).thenReturn(BigDecimal.ZERO);
		when(t.getY()).thenReturn(BigDecimal.ZERO);
		when(t.getZ()).thenReturn(BigDecimal.ZERO);
		
		assertEquals(true, t.isZeroWithMargin(BigDecimal.valueOf(2)));
		
		verify(t).isZeroWithMargin(BigDecimal.valueOf(2));
		
		verify(t).getX();
		verify(t).getY();
		verify(t).getZ();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup3bigdR#isZeroWithMargin(BigDecimal)} returns true,
	 * if all components are at the positive extreme point that is the inclusive
	 * tolerance parameter.
	 */
	@Test
	void isZeroWithMargin_Extreme_PositiveTest()
	{
		Tup3bigdR t = mock(Tup3bigdR.class);
		
		when(t.isZeroWithMargin(BigDecimal.valueOf(2))).thenCallRealMethod();
		
		when(t.getX()).thenReturn(BigDecimal.valueOf(2));
		when(t.getY()).thenReturn(BigDecimal.valueOf(2));
		when(t.getZ()).thenReturn(BigDecimal.valueOf(2));
		
		assertEquals(true, t.isZeroWithMargin(BigDecimal.valueOf(2)));
		
		verify(t).isZeroWithMargin(BigDecimal.valueOf(2));
		
		verify(t).getX();
		verify(t).getY();
		verify(t).getZ();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup3bigdR#isZeroWithMargin(BigDecimal)} returns true,
	 * if all components are at the negative extreme point that is the inclusive
	 * tolerance parameter.
	 */
	@Test
	void isZeroWithMargin_Extreme_NegativeTest()
	{
		Tup3bigdR t = mock(Tup3bigdR.class);
		
		when(t.isZeroWithMargin(BigDecimal.valueOf(2))).thenCallRealMethod();
		
		when(t.getX()).thenReturn(BigDecimal.valueOf(-2));
		when(t.getY()).thenReturn(BigDecimal.valueOf(-2));
		when(t.getZ()).thenReturn(BigDecimal.valueOf(-2));
		
		assertEquals(true, t.isZeroWithMargin(BigDecimal.valueOf(2)));
		
		verify(t).isZeroWithMargin(BigDecimal.valueOf(2));
		
		verify(t).getX();
		verify(t).getY();
		verify(t).getZ();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup3bigdR#isZeroWithMargin(BigDecimal)} returns false,
	 * if the x component exceeds the positive extreme point that is the inclusive
	 * tolerance parameter.
	 */
	@Test
	void isZeroWithMargin_Fail_X_PositiveTest()
	{
		Tup3bigdR t = mock(Tup3bigdR.class);
		
		when(t.isZeroWithMargin(BigDecimal.valueOf(2))).thenCallRealMethod();
		
		when(t.getX()).thenReturn(BigDecimal.valueOf(3));
		
		assertEquals(false, t.isZeroWithMargin(BigDecimal.valueOf(2)));
		
		verify(t).isZeroWithMargin(BigDecimal.valueOf(2));
		
		verify(t).getX();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup3bigdR#isZeroWithMargin(BigDecimal)} returns false,
	 * if the x component exceeds the negative extreme point that is the inclusive
	 * tolerance parameter.
	 */
	@Test
	void isZeroWithMargin_Fail_X_NegativeTest()
	{
		Tup3bigdR t = mock(Tup3bigdR.class);
		
		when(t.isZeroWithMargin(BigDecimal.valueOf(2))).thenCallRealMethod();
		
		when(t.getX()).thenReturn(BigDecimal.valueOf(-3));
		
		assertEquals(false, t.isZeroWithMargin(BigDecimal.valueOf(2)));
		
		verify(t).isZeroWithMargin(BigDecimal.valueOf(2));
		
		verify(t).getX();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup3bigdR#isZeroWithMargin(BigDecimal)} returns false,
	 * if the y component exceeds the positive extreme point that is the inclusive
	 * tolerance parameter.
	 */
	@Test
	void isZeroWithMargin_Fail_Y_PositiveTest()
	{
		Tup3bigdR t = mock(Tup3bigdR.class);
		
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
	 * This test ensures, that the function {@link Tup3bigdR#isZeroWithMargin(BigDecimal)} returns false,
	 * if the y component exceeds the positive extreme point that is the inclusive
	 * tolerance parameter.
	 */
	@Test
	void isZeroWithMargin_Fail_Y_NegativeTest()
	{
		Tup3bigdR t = mock(Tup3bigdR.class);
		
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
	 * This test ensures, that the function {@link Tup3bigdR#isZeroWithMargin(BigDecimal)} returns false,
	 * if the z component exceeds the positive extreme point that is the inclusive
	 * tolerance parameter.
	 */
	@Test
	void isZeroWithMargin_Fail_Z_PositiveTest()
	{
		Tup3bigdR t = mock(Tup3bigdR.class);
		
		when(t.isZeroWithMargin(BigDecimal.valueOf(2))).thenCallRealMethod();
		
		when(t.getX()).thenReturn(BigDecimal.ZERO);
		when(t.getY()).thenReturn(BigDecimal.ZERO);
		when(t.getZ()).thenReturn(BigDecimal.valueOf(3));
		
		assertEquals(false, t.isZeroWithMargin(BigDecimal.valueOf(2)));
		
		verify(t).isZeroWithMargin(BigDecimal.valueOf(2));
		
		verify(t).getX();
		verify(t).getY();
		verify(t).getZ();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup3bigdR#isZeroWithMargin(BigDecimal)} returns false,
	 * if the z component exceeds the positive extreme point that is the inclusive
	 * tolerance parameter.
	 */
	@Test
	void isZeroWithMargin_Fail_Z_NegativeTest()
	{
		Tup3bigdR t = mock(Tup3bigdR.class);
		
		when(t.isZeroWithMargin(BigDecimal.valueOf(2))).thenCallRealMethod();
		
		when(t.getX()).thenReturn(BigDecimal.ZERO);
		when(t.getY()).thenReturn(BigDecimal.ZERO);
		when(t.getZ()).thenReturn(BigDecimal.valueOf(-3));
		
		assertEquals(false, t.isZeroWithMargin(BigDecimal.valueOf(2)));
		
		verify(t).isZeroWithMargin(BigDecimal.valueOf(2));
		
		verify(t).getX();
		verify(t).getY();
		verify(t).getZ();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the default implementation of the function {@link Tup3bigdR#getNewInstance(Tup3bigdR)} calls
	 * the function {@link Tup3bigdR#getNewInstance(BigDecimal, BigDecimal, BigDecimal)} with the correct components.
	 */
	@Test
	void getNewInstance_Tuple2Test()
	{
		Tup3bigdR original = mock(Tup3bigdR.class);
		Tup3bigdR newInstance = mock(Tup3bigdR.class);
		Tup3bigdR t = mock(Tup3bigdR.class);
		
		when(t.getNewInstance(original)).thenCallRealMethod();
		
		when(original.getX()).thenReturn(BigDecimal.ONE);
		when(original.getY()).thenReturn(BigDecimal.valueOf(2));
		when(original.getZ()).thenReturn(BigDecimal.valueOf(3));
		when(t.getNewInstance(BigDecimal.ONE, BigDecimal.valueOf(2), BigDecimal.valueOf(3))).thenReturn(newInstance);
		
		assertSame(newInstance, t.getNewInstance(original));
		
		verify(t).getNewInstance(original);
		
		verify(original).getX();
		verify(original).getY();
		verify(original).getZ();
		verify(t).getNewInstance(BigDecimal.ONE, BigDecimal.valueOf(2), BigDecimal.valueOf(3));
		
		verifyNoMoreInteractions(t, original);
	}
	
	/**
	 * This test ensures, that the default implementation of the function {@link Tup3bigdR#getNewInstance(BigDecimal)} calls
	 * the function {@link Tup3bigdR#getNewInstance(BigDecimal, BigDecimal, BigDecimal)} with the correct components.
	 */
	@Test
	void getNewInstance_ValueTest()
	{
		Tup3bigdR newInstance = mock(Tup3bigdR.class);
		Tup3bigdR t = mock(Tup3bigdR.class);
		
		when(t.getNewInstance(BigDecimal.ONE)).thenCallRealMethod();

		when(t.getNewInstance(BigDecimal.ONE, BigDecimal.ONE, BigDecimal.ONE)).thenReturn(newInstance);
		
		assertSame(newInstance, t.getNewInstance(BigDecimal.ONE));
		
		verify(t).getNewInstance(BigDecimal.ONE);
		
		verify(t).getNewInstance(BigDecimal.ONE, BigDecimal.ONE, BigDecimal.ONE);
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the default implementation of the function {@link Tup3bigdR#getNewInstance(TupbigdR)} calls
	 * the function {@link Tup3bigdR#getNewInstance(BigDecimal, BigDecimal, BigDecimal)} with the correct components.
	 */
	@Test
	void getNewInstance_TupleTest()
	{
		TupbigdR original = mock(TupbigdR.class);
		Tup3bigdR newInstance = mock(Tup3bigdR.class);
		Tup3bigdR t = mock(Tup3bigdR.class);
		
		when(t.getNewInstance(original)).thenCallRealMethod();
		
		when(original.getArray()).thenReturn(new BigDecimal[] {BigDecimal.ONE, BigDecimal.valueOf(2), BigDecimal.valueOf(3)});
		when(t.getNewInstance(BigDecimal.ONE, BigDecimal.valueOf(2), BigDecimal.valueOf(3))).thenReturn(newInstance);
		
		assertSame(newInstance, t.getNewInstance(original));
		
		verify(t).getNewInstance(original);
		
		verify(original).getArray();
		verify(t).getNewInstance(BigDecimal.ONE, BigDecimal.valueOf(2), BigDecimal.valueOf(3));
		
		verifyNoMoreInteractions(t, original);
	}
	
	/**
	 * This test ensures, that the default implementation of the function {@link Tup3bigdR#getNewInstanceFromArray(BigDecimal[])} calls
	 * the function {@link Tup3bigdR#getNewInstance(BigDecimal, BigDecimal, BigDecimal)} with the correct components.
	 */
	@Test
	void getNewInstanceFromArrayTest()
	{
		Tup3bigdR newInstance = mock(Tup3bigdR.class);
		Tup3bigdR t = mock(Tup3bigdR.class);
		
		when(t.getNewInstanceFromArray(new BigDecimal[] {BigDecimal.ONE, BigDecimal.valueOf(2), BigDecimal.valueOf(3)})).thenCallRealMethod();

		when(t.getNewInstance(BigDecimal.ONE, BigDecimal.valueOf(2), BigDecimal.valueOf(3))).thenReturn(newInstance);
		
		assertSame(newInstance, t.getNewInstanceFromArray(new BigDecimal[] {BigDecimal.ONE, BigDecimal.valueOf(2), BigDecimal.valueOf(3)}));
		
		verify(t).getNewInstanceFromArray(new BigDecimal[] {BigDecimal.ONE, BigDecimal.valueOf(2), BigDecimal.valueOf(3)});
		
		verify(t).getNewInstance(BigDecimal.ONE, BigDecimal.valueOf(2), BigDecimal.valueOf(3));
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup3bigdR#getArray()} returns
	 * an array with the components in the right order.
	 */
	@Test
	void getArrayTest()
	{
		Tup3bigdR t = mock(Tup3bigdR.class);
		
		when(t.getArray()).thenCallRealMethod();
		
		when(t.getX()).thenReturn(BigDecimal.ONE);
		when(t.getY()).thenReturn(BigDecimal.valueOf(2));
		when(t.getZ()).thenReturn(BigDecimal.valueOf(3));
		
		assertArrayEquals(new BigDecimal[] {BigDecimal.ONE, BigDecimal.valueOf(2), BigDecimal.valueOf(3)}, t.getArray());
		
		verify(t).getArray();
		
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
		
		when(t.getX()).thenReturn(BigDecimal.ONE);
		
		assertEquals(BigDecimal.ONE, t.getByIndex(0));

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
		
		when(t.getY()).thenReturn(BigDecimal.ONE);
		
		assertEquals(BigDecimal.ONE, t.getByIndex(1));

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
		
		when(t.getZ()).thenReturn(BigDecimal.ONE);
		
		assertEquals(BigDecimal.ONE, t.getByIndex(2));

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