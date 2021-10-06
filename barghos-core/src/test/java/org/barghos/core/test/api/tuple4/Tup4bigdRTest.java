package org.barghos.core.test.api.tuple4;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import java.math.BigDecimal;

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
		
		when(t.getX()).thenReturn(BigDecimal.ONE);
		when(t.getY()).thenReturn(BigDecimal.ONE);
		when(t.getZ()).thenReturn(BigDecimal.ONE);
		when(t.getW()).thenReturn(BigDecimal.ONE);
		
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
		
		when(t.getX()).thenReturn(BigDecimal.ONE);
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
	 * This test ensures, that the function {@link Tup4bigdR#isValid()} returns false,
	 * if the w component is null.
	 */
	@Test
	void isValid_Fail_WTest()
	{
		Tup4bigdR t = mock(Tup4bigdR.class);
		
		when(t.isValid()).thenCallRealMethod();
		
		when(t.getX()).thenReturn(BigDecimal.ONE);
		when(t.getY()).thenReturn(BigDecimal.ONE);
		when(t.getZ()).thenReturn(BigDecimal.ONE);
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
	 * This test ensures, that the function {@link Tup4bigdR#isZero()} returns true,
	 * if all of the components are exactly {@link BigDecimal#ZERO}.
	 */
	@Test
	void isZero_ZeroTest()
	{
		Tup4bigdR t = mock(Tup4bigdR.class);
		
		when(t.isZero()).thenCallRealMethod();
		
		when(t.getX()).thenReturn(BigDecimal.ZERO);
		when(t.getY()).thenReturn(BigDecimal.ZERO);
		when(t.getZ()).thenReturn(BigDecimal.ZERO);
		when(t.getW()).thenReturn(BigDecimal.ZERO);
		
		assertEquals(true, t.isZero());
		
		verify(t).isZero();
		
		verify(t).getX();
		verify(t).getY();
		verify(t).getZ();
		verify(t).getW();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4bigdR#isZero()} returns false,
	 * if the x component is not {@link BigDecimal#ZERO}.
	 */
	@Test
	void isZero_Fail_XTest()
	{
		Tup4bigdR t = mock(Tup4bigdR.class);
		
		when(t.isZero()).thenCallRealMethod();
		
		when(t.getX()).thenReturn(BigDecimal.ONE);
		
		assertEquals(false, t.isZero());
		
		verify(t).isZero();
		
		verify(t).getX();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4bigdR#isZero()} returns false,
	 * if the y component is not {@link BigDecimal#ZERO}.
	 */
	@Test
	void isZero_Fail_YTest()
	{
		Tup4bigdR t = mock(Tup4bigdR.class);
		
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
	 * This test ensures, that the function {@link Tup4bigdR#isZero()} returns false,
	 * if the z component is not {@link BigDecimal#ZERO}.
	 */
	@Test
	void isZero_Fail_ZTest()
	{
		Tup4bigdR t = mock(Tup4bigdR.class);
		
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
	 * This test ensures, that the function {@link Tup4bigdR#isZero()} returns false,
	 * if the w component is not {@link BigDecimal#ZERO}.
	 */
	@Test
	void isZero_Fail_WTest()
	{
		Tup4bigdR t = mock(Tup4bigdR.class);
		
		when(t.isZero()).thenCallRealMethod();
		
		when(t.getX()).thenReturn(BigDecimal.ZERO);
		when(t.getY()).thenReturn(BigDecimal.ZERO);
		when(t.getZ()).thenReturn(BigDecimal.ZERO);
		when(t.getW()).thenReturn(BigDecimal.ONE);
		
		assertEquals(false, t.isZero());
		
		verify(t).isZero();
		
		verify(t).getX();
		verify(t).getY();
		verify(t).getZ();
		verify(t).getW();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4bigdR#isZeroWithMargin(BigDecimal)} returns true,
	 * if all components are exactly {@link BigDecimal#ZERO}.
	 */
	@Test
	void isZeroWithMargin_ZeroTest()
	{
		Tup4bigdR t = mock(Tup4bigdR.class);
		
		when(t.isZeroWithMargin(BigDecimal.valueOf(2))).thenCallRealMethod();
		
		when(t.getX()).thenReturn(BigDecimal.ZERO);
		when(t.getY()).thenReturn(BigDecimal.ZERO);
		when(t.getZ()).thenReturn(BigDecimal.ZERO);
		when(t.getW()).thenReturn(BigDecimal.ZERO);
		
		assertEquals(true, t.isZeroWithMargin(BigDecimal.valueOf(2)));
		
		verify(t).isZeroWithMargin(BigDecimal.valueOf(2));
		
		verify(t).getX();
		verify(t).getY();
		verify(t).getZ();
		verify(t).getW();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4bigdR#isZeroWithMargin(BigDecimal)} returns true,
	 * if all components are at the positive extreme point that is the inclusive
	 * tolerance parameter.
	 */
	@Test
	void isZeroWithMargin_Extreme_PositiveTest()
	{
		Tup4bigdR t = mock(Tup4bigdR.class);
		
		when(t.isZeroWithMargin(BigDecimal.valueOf(2))).thenCallRealMethod();
		
		when(t.getX()).thenReturn(BigDecimal.valueOf(2));
		when(t.getY()).thenReturn(BigDecimal.valueOf(2));
		when(t.getZ()).thenReturn(BigDecimal.valueOf(2));
		when(t.getW()).thenReturn(BigDecimal.valueOf(2));
		
		assertEquals(true, t.isZeroWithMargin(BigDecimal.valueOf(2)));
		
		verify(t).isZeroWithMargin(BigDecimal.valueOf(2));
		
		verify(t).getX();
		verify(t).getY();
		verify(t).getZ();
		verify(t).getW();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4bigdR#isZeroWithMargin(BigDecimal)} returns true,
	 * if all components are at the negative extreme point that is the inclusive
	 * tolerance parameter.
	 */
	@Test
	void isZeroWithMargin_Extreme_NegativeTest()
	{
		Tup4bigdR t = mock(Tup4bigdR.class);
		
		when(t.isZeroWithMargin(BigDecimal.valueOf(2))).thenCallRealMethod();
		
		when(t.getX()).thenReturn(BigDecimal.valueOf(-2));
		when(t.getY()).thenReturn(BigDecimal.valueOf(-2));
		when(t.getZ()).thenReturn(BigDecimal.valueOf(-2));
		when(t.getW()).thenReturn(BigDecimal.valueOf(-2));
		
		assertEquals(true, t.isZeroWithMargin(BigDecimal.valueOf(2)));
		
		verify(t).isZeroWithMargin(BigDecimal.valueOf(2));
		
		verify(t).getX();
		verify(t).getY();
		verify(t).getZ();
		verify(t).getW();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4bigdR#isZeroWithMargin(BigDecimal)} returns false,
	 * if the x component exceeds the positive extreme point that is the inclusive
	 * tolerance parameter.
	 */
	@Test
	void isZeroWithMargin_Fail_X_PositiveTest()
	{
		Tup4bigdR t = mock(Tup4bigdR.class);
		
		when(t.isZeroWithMargin(BigDecimal.valueOf(2))).thenCallRealMethod();
		
		when(t.getX()).thenReturn(BigDecimal.valueOf(3));
		
		assertEquals(false, t.isZeroWithMargin(BigDecimal.valueOf(2)));
		
		verify(t).isZeroWithMargin(BigDecimal.valueOf(2));
		
		verify(t).getX();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4bigdR#isZeroWithMargin(BigDecimal)} returns false,
	 * if the x component exceeds the negative extreme point that is the inclusive
	 * tolerance parameter.
	 */
	@Test
	void isZeroWithMargin_Fail_X_NegativeTest()
	{
		Tup4bigdR t = mock(Tup4bigdR.class);
		
		when(t.isZeroWithMargin(BigDecimal.valueOf(2))).thenCallRealMethod();
		
		when(t.getX()).thenReturn(BigDecimal.valueOf(-3));
		
		assertEquals(false, t.isZeroWithMargin(BigDecimal.valueOf(2)));
		
		verify(t).isZeroWithMargin(BigDecimal.valueOf(2));
		
		verify(t).getX();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4bigdR#isZeroWithMargin(BigDecimal)} returns false,
	 * if the y component exceeds the positive extreme point that is the inclusive
	 * tolerance parameter.
	 */
	@Test
	void isZeroWithMargin_Fail_Y_PositiveTest()
	{
		Tup4bigdR t = mock(Tup4bigdR.class);
		
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
	 * This test ensures, that the function {@link Tup4bigdR#isZeroWithMargin(BigDecimal)} returns false,
	 * if the y component exceeds the positive extreme point that is the inclusive
	 * tolerance parameter.
	 */
	@Test
	void isZeroWithMargin_Fail_Y_NegativeTest()
	{
		Tup4bigdR t = mock(Tup4bigdR.class);
		
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
	 * This test ensures, that the function {@link Tup4bigdR#isZeroWithMargin(BigDecimal)} returns false,
	 * if the z component exceeds the positive extreme point that is the inclusive
	 * tolerance parameter.
	 */
	@Test
	void isZeroWithMargin_Fail_Z_PositiveTest()
	{
		Tup4bigdR t = mock(Tup4bigdR.class);
		
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
	 * This test ensures, that the function {@link Tup4bigdR#isZeroWithMargin(BigDecimal)} returns false,
	 * if the y component exceeds the positive extreme point that is the inclusive
	 * tolerance parameter.
	 */
	@Test
	void isZeroWithMargin_Fail_Z_NegativeTest()
	{
		Tup4bigdR t = mock(Tup4bigdR.class);
		
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
	 * This test ensures, that the function {@link Tup4bigdR#isZeroWithMargin(BigDecimal)} returns false,
	 * if the w component exceeds the positive extreme point that is the inclusive
	 * tolerance parameter.
	 */
	@Test
	void isZeroWithMargin_Fail_W_PositiveTest()
	{
		Tup4bigdR t = mock(Tup4bigdR.class);
		
		when(t.isZeroWithMargin(BigDecimal.valueOf(2))).thenCallRealMethod();
		
		when(t.getX()).thenReturn(BigDecimal.ZERO);
		when(t.getY()).thenReturn(BigDecimal.ZERO);
		when(t.getZ()).thenReturn(BigDecimal.ZERO);
		when(t.getW()).thenReturn(BigDecimal.valueOf(3));
		
		assertEquals(false, t.isZeroWithMargin(BigDecimal.valueOf(2)));
		
		verify(t).isZeroWithMargin(BigDecimal.valueOf(2));
		
		verify(t).getX();
		verify(t).getY();
		verify(t).getZ();
		verify(t).getW();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4bigdR#isZeroWithMargin(BigDecimal)} returns false,
	 * if the w component exceeds the positive extreme point that is the inclusive
	 * tolerance parameter.
	 */
	@Test
	void isZeroWithMargin_Fail_W_NegativeTest()
	{
		Tup4bigdR t = mock(Tup4bigdR.class);
		
		when(t.isZeroWithMargin(BigDecimal.valueOf(2))).thenCallRealMethod();
		
		when(t.getX()).thenReturn(BigDecimal.ZERO);
		when(t.getY()).thenReturn(BigDecimal.ZERO);
		when(t.getZ()).thenReturn(BigDecimal.ZERO);
		when(t.getW()).thenReturn(BigDecimal.valueOf(-3));
		
		assertEquals(false, t.isZeroWithMargin(BigDecimal.valueOf(2)));
		
		verify(t).isZeroWithMargin(BigDecimal.valueOf(2));
		
		verify(t).getX();
		verify(t).getY();
		verify(t).getZ();
		verify(t).getW();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the default implementation of the function {@link Tup4bigdR#getNewInstance(Tup4bigdR)} calls
	 * the function {@link Tup4bigdR#getNewInstance(BigDecimal, BigDecimal, BigDecimal, BigDecimal)} with the correct components.
	 */
	@Test
	void getNewInstance_Tuple2Test()
	{
		Tup4bigdR original = mock(Tup4bigdR.class);
		Tup4bigdR newInstance = mock(Tup4bigdR.class);
		Tup4bigdR t = mock(Tup4bigdR.class);
		
		when(t.getNewInstance(original)).thenCallRealMethod();
		
		when(original.getX()).thenReturn(BigDecimal.ONE);
		when(original.getY()).thenReturn(BigDecimal.valueOf(2));
		when(original.getZ()).thenReturn(BigDecimal.valueOf(3));
		when(original.getW()).thenReturn(BigDecimal.valueOf(4));
		when(t.getNewInstance(BigDecimal.ONE, BigDecimal.valueOf(2), BigDecimal.valueOf(3), BigDecimal.valueOf(4))).thenReturn(newInstance);
		
		assertSame(newInstance, t.getNewInstance(original));
		
		verify(t).getNewInstance(original);
		
		verify(original).getX();
		verify(original).getY();
		verify(original).getZ();
		verify(original).getW();
		verify(t).getNewInstance(BigDecimal.ONE, BigDecimal.valueOf(2), BigDecimal.valueOf(3), BigDecimal.valueOf(4));
		
		verifyNoMoreInteractions(t, original);
	}
	
	/**
	 * This test ensures, that the default implementation of the function {@link Tup4bigdR#getNewInstance(BigDecimal)} calls
	 * the function {@link Tup4bigdR#getNewInstance(BigDecimal, BigDecimal, BigDecimal, BigDecimal)} with the correct components.
	 */
	@Test
	void getNewInstance_ValueTest()
	{
		Tup4bigdR newInstance = mock(Tup4bigdR.class);
		Tup4bigdR t = mock(Tup4bigdR.class);
		
		when(t.getNewInstance(BigDecimal.ONE)).thenCallRealMethod();

		when(t.getNewInstance(BigDecimal.ONE, BigDecimal.ONE, BigDecimal.ONE, BigDecimal.ONE)).thenReturn(newInstance);
		
		assertSame(newInstance, t.getNewInstance(BigDecimal.ONE));
		
		verify(t).getNewInstance(BigDecimal.ONE);
		
		verify(t).getNewInstance(BigDecimal.ONE, BigDecimal.ONE, BigDecimal.ONE, BigDecimal.ONE);
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the default implementation of the function {@link Tup4bigdR#getNewInstance(TupbigdR)} calls
	 * the function {@link Tup4bigdR#getNewInstance(BigDecimal, BigDecimal, BigDecimal, BigDecimal)} with the correct components.
	 */
	@Test
	void getNewInstance_TupleTest()
	{
		TupbigdR original = mock(TupbigdR.class);
		Tup4bigdR newInstance = mock(Tup4bigdR.class);
		Tup4bigdR t = mock(Tup4bigdR.class);
		
		when(t.getNewInstance(original)).thenCallRealMethod();
		
		when(original.getArray()).thenReturn(new BigDecimal[] {BigDecimal.ONE, BigDecimal.valueOf(2), BigDecimal.valueOf(3), BigDecimal.valueOf(4)});
		when(t.getNewInstance(BigDecimal.ONE, BigDecimal.valueOf(2), BigDecimal.valueOf(3), BigDecimal.valueOf(4))).thenReturn(newInstance);
		
		assertSame(newInstance, t.getNewInstance(original));
		
		verify(t).getNewInstance(original);
		
		verify(original).getArray();
		verify(t).getNewInstance(BigDecimal.ONE, BigDecimal.valueOf(2), BigDecimal.valueOf(3), BigDecimal.valueOf(4));
		
		verifyNoMoreInteractions(t, original);
	}
	
	/**
	 * This test ensures, that the default implementation of the function {@link Tup4bigdR#getNewInstanceFromArray(BigDecimal[])} calls
	 * the function {@link Tup4bigdR#getNewInstance(BigDecimal, BigDecimal, BigDecimal, BigDecimal)} with the correct components.
	 */
	@Test
	void getNewInstanceFromArrayTest()
	{
		Tup4bigdR newInstance = mock(Tup4bigdR.class);
		Tup4bigdR t = mock(Tup4bigdR.class);
		
		when(t.getNewInstanceFromArray(new BigDecimal[] {BigDecimal.ONE, BigDecimal.valueOf(2), BigDecimal.valueOf(3), BigDecimal.valueOf(4)})).thenCallRealMethod();

		when(t.getNewInstance(BigDecimal.ONE, BigDecimal.valueOf(2), BigDecimal.valueOf(3), BigDecimal.valueOf(4))).thenReturn(newInstance);
		
		assertSame(newInstance, t.getNewInstanceFromArray(new BigDecimal[] {BigDecimal.ONE, BigDecimal.valueOf(2), BigDecimal.valueOf(3), BigDecimal.valueOf(4)}));
		
		verify(t).getNewInstanceFromArray(new BigDecimal[] {BigDecimal.ONE, BigDecimal.valueOf(2), BigDecimal.valueOf(3), BigDecimal.valueOf(4)});
		
		verify(t).getNewInstance(BigDecimal.ONE, BigDecimal.valueOf(2), BigDecimal.valueOf(3), BigDecimal.valueOf(4));
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4bigdR#getArray()} returns
	 * an array with the components in the right order.
	 */
	@Test
	void getArrayTest()
	{
		Tup4bigdR t = mock(Tup4bigdR.class);
		
		when(t.getArray()).thenCallRealMethod();
		
		when(t.getX()).thenReturn(BigDecimal.ONE);
		when(t.getY()).thenReturn(BigDecimal.valueOf(2));
		when(t.getZ()).thenReturn(BigDecimal.valueOf(3));
		when(t.getW()).thenReturn(BigDecimal.valueOf(4));
		
		assertArrayEquals(new BigDecimal[] {BigDecimal.ONE, BigDecimal.valueOf(2), BigDecimal.valueOf(3), BigDecimal.valueOf(4)}, t.getArray());
		
		verify(t).getArray();
		
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
		
		when(t.getX()).thenReturn(BigDecimal.ONE);
		
		assertEquals(BigDecimal.ONE, t.getByIndex(0));

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
		
		when(t.getY()).thenReturn(BigDecimal.ONE);
		
		assertEquals(BigDecimal.ONE, t.getByIndex(1));

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
		
		when(t.getZ()).thenReturn(BigDecimal.ONE);
		
		assertEquals(BigDecimal.ONE, t.getByIndex(2));

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
		
		when(t.getW()).thenReturn(BigDecimal.ONE);
		
		assertEquals(BigDecimal.ONE, t.getByIndex(3));

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