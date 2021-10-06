package org.barghos.core.test.api.tuple4;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import java.math.BigInteger;

import org.barghos.core.api.tuple.TupbigiR;
import org.barghos.core.api.tuple4.Tup4bigiR;

/**
 * This class provides component tests for the interface {@link Tup4bigiR}.
 * 
 * @author picatrix1899
 */
class Tup4bigiRTest
{
	/**
	 * This test ensures, that the interface extends the interface {@link TupbigiR}.
	 */
	@Test
	void inheritance_TupbigiRTest()
	{
		assertTrue(TupbigiR.class.isAssignableFrom(Tup4bigiR.class));
	}
	
	/**
	 * This test ensures, that the function {@link Tup4bigiR#isValid()} returns true,
	 * if none of the components is null.
	 */
	@Test
	void isValidTest()
	{
		Tup4bigiR t = mock(Tup4bigiR.class);
		
		when(t.isValid()).thenCallRealMethod();
		
		when(t.getX()).thenReturn(BigInteger.ONE);
		when(t.getY()).thenReturn(BigInteger.ONE);
		when(t.getZ()).thenReturn(BigInteger.ONE);
		when(t.getW()).thenReturn(BigInteger.ONE);
		
		assertEquals(true, t.isValid());
		
		verify(t).isValid();
		
		verify(t).getX();
		verify(t).getY();
		verify(t).getZ();
		verify(t).getW();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4bigiR#isValid()} returns false,
	 * if the x component is null.
	 */
	@Test
	void isValid_Fail_XTest()
	{
		Tup4bigiR t = mock(Tup4bigiR.class);
		
		when(t.isValid()).thenCallRealMethod();
		
		when(t.getX()).thenReturn(null);

		assertEquals(false, t.isValid());
		
		verify(t).isValid();
		
		verify(t).getX();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4bigiR#isValid()} returns false,
	 * if the y component is null.
	 */
	@Test
	void isValid_Fail_YTest()
	{
		Tup4bigiR t = mock(Tup4bigiR.class);
		
		when(t.isValid()).thenCallRealMethod();
		
		when(t.getX()).thenReturn(BigInteger.ONE);
		when(t.getY()).thenReturn(null);

		assertEquals(false, t.isValid());
		
		verify(t).isValid();
		
		verify(t).getX();
		verify(t).getY();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4bigiR#isValid()} returns false,
	 * if the z component is null.
	 */
	@Test
	void isValid_Fail_ZTest()
	{
		Tup4bigiR t = mock(Tup4bigiR.class);
		
		when(t.isValid()).thenCallRealMethod();
		
		when(t.getX()).thenReturn(BigInteger.ONE);
		when(t.getY()).thenReturn(BigInteger.ONE);
		when(t.getZ()).thenReturn(null);

		assertEquals(false, t.isValid());
		
		verify(t).isValid();
		
		verify(t).getX();
		verify(t).getY();
		verify(t).getZ();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4bigiR#isValid()} returns false,
	 * if the w component is null.
	 */
	@Test
	void isValid_Fail_WTest()
	{
		Tup4bigiR t = mock(Tup4bigiR.class);
		
		when(t.isValid()).thenCallRealMethod();
		
		when(t.getX()).thenReturn(BigInteger.ONE);
		when(t.getY()).thenReturn(BigInteger.ONE);
		when(t.getZ()).thenReturn(BigInteger.ONE);
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
	 * this test ensures, that the function {@link Tup4bigiR#getDimensions()} always
	 * returns 4 and does not make any calls.
	 */
	@Test
	void getDimensionsTest()
	{
		Tup4bigiR t = mock(Tup4bigiR.class);
		
		when(t.getDimensions()).thenCallRealMethod();
		
		assertEquals(4, t.getDimensions());
		
		verify(t).getDimensions();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4bigiR#isZero()} returns true,
	 * if all of the components are exactly {@link BigInteger#ZERO}.
	 */
	@Test
	void isZero_ZeroTest()
	{
		Tup4bigiR t = mock(Tup4bigiR.class);
		
		when(t.isZero()).thenCallRealMethod();
		
		when(t.getX()).thenReturn(BigInteger.ZERO);
		when(t.getY()).thenReturn(BigInteger.ZERO);
		when(t.getZ()).thenReturn(BigInteger.ZERO);
		when(t.getW()).thenReturn(BigInteger.ZERO);
		
		assertEquals(true, t.isZero());
		
		verify(t).isZero();
		
		verify(t).getX();
		verify(t).getY();
		verify(t).getZ();
		verify(t).getW();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4bigiR#isZero()} returns false,
	 * if the x component is not {@link BigInteger#ZERO}.
	 */
	@Test
	void isZero_Fail_XTest()
	{
		Tup4bigiR t = mock(Tup4bigiR.class);
		
		when(t.isZero()).thenCallRealMethod();
		
		when(t.getX()).thenReturn(BigInteger.ONE);
		
		assertEquals(false, t.isZero());
		
		verify(t).isZero();
		
		verify(t).getX();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4bigiR#isZero()} returns false,
	 * if the y component is not {@link BigInteger#ZERO}.
	 */
	@Test
	void isZero_Fail_YTest()
	{
		Tup4bigiR t = mock(Tup4bigiR.class);
		
		when(t.isZero()).thenCallRealMethod();
		
		when(t.getX()).thenReturn(BigInteger.ZERO);
		when(t.getY()).thenReturn(BigInteger.ONE);
		
		assertEquals(false, t.isZero());
		
		verify(t).isZero();
		
		verify(t).getX();
		verify(t).getY();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4bigiR#isZero()} returns false,
	 * if the z component is not {@link BigInteger#ZERO}.
	 */
	@Test
	void isZero_Fail_ZTest()
	{
		Tup4bigiR t = mock(Tup4bigiR.class);
		
		when(t.isZero()).thenCallRealMethod();
		
		when(t.getX()).thenReturn(BigInteger.ZERO);
		when(t.getY()).thenReturn(BigInteger.ZERO);
		when(t.getZ()).thenReturn(BigInteger.ONE);
		
		assertEquals(false, t.isZero());
		
		verify(t).isZero();
		
		verify(t).getX();
		verify(t).getY();
		verify(t).getZ();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4bigiR#isZero()} returns false,
	 * if the w component is not {@link BigInteger#ZERO}.
	 */
	@Test
	void isZero_Fail_WTest()
	{
		Tup4bigiR t = mock(Tup4bigiR.class);
		
		when(t.isZero()).thenCallRealMethod();
		
		when(t.getX()).thenReturn(BigInteger.ZERO);
		when(t.getY()).thenReturn(BigInteger.ZERO);
		when(t.getZ()).thenReturn(BigInteger.ZERO);
		when(t.getW()).thenReturn(BigInteger.ONE);
		
		assertEquals(false, t.isZero());
		
		verify(t).isZero();
		
		verify(t).getX();
		verify(t).getY();
		verify(t).getZ();
		verify(t).getW();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4bigiR#isZeroWithMargin(BigInteger)} returns true,
	 * if all components are exactly {@link BigInteger#ZERO}.
	 */
	@Test
	void isZeroWithMargin_ZeroTest()
	{
		Tup4bigiR t = mock(Tup4bigiR.class);
		
		when(t.isZeroWithMargin(BigInteger.valueOf(2))).thenCallRealMethod();
		
		when(t.getX()).thenReturn(BigInteger.ZERO);
		when(t.getY()).thenReturn(BigInteger.ZERO);
		when(t.getZ()).thenReturn(BigInteger.ZERO);
		when(t.getW()).thenReturn(BigInteger.ZERO);
		
		assertEquals(true, t.isZeroWithMargin(BigInteger.valueOf(2)));
		
		verify(t).isZeroWithMargin(BigInteger.valueOf(2));
		
		verify(t).getX();
		verify(t).getY();
		verify(t).getZ();
		verify(t).getW();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4bigiR#isZeroWithMargin(BigInteger)} returns true,
	 * if all components are at the positive extreme point that is the inclusive
	 * tolerance parameter.
	 */
	@Test
	void isZeroWithMargin_Extreme_PositiveTest()
	{
		Tup4bigiR t = mock(Tup4bigiR.class);
		
		when(t.isZeroWithMargin(BigInteger.valueOf(2))).thenCallRealMethod();
		
		when(t.getX()).thenReturn(BigInteger.valueOf(2));
		when(t.getY()).thenReturn(BigInteger.valueOf(2));
		when(t.getZ()).thenReturn(BigInteger.valueOf(2));
		when(t.getW()).thenReturn(BigInteger.valueOf(2));
		
		assertEquals(true, t.isZeroWithMargin(BigInteger.valueOf(2)));
		
		verify(t).isZeroWithMargin(BigInteger.valueOf(2));
		
		verify(t).getX();
		verify(t).getY();
		verify(t).getZ();
		verify(t).getW();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4bigiR#isZeroWithMargin(BigInteger)} returns true,
	 * if all components are at the negative extreme point that is the inclusive
	 * tolerance parameter.
	 */
	@Test
	void isZeroWithMargin_Extreme_NegativeTest()
	{
		Tup4bigiR t = mock(Tup4bigiR.class);
		
		when(t.isZeroWithMargin(BigInteger.valueOf(2))).thenCallRealMethod();
		
		when(t.getX()).thenReturn(BigInteger.valueOf(-2));
		when(t.getY()).thenReturn(BigInteger.valueOf(-2));
		when(t.getZ()).thenReturn(BigInteger.valueOf(-2));
		when(t.getW()).thenReturn(BigInteger.valueOf(-2));
		
		assertEquals(true, t.isZeroWithMargin(BigInteger.valueOf(2)));
		
		verify(t).isZeroWithMargin(BigInteger.valueOf(2));
		
		verify(t).getX();
		verify(t).getY();
		verify(t).getZ();
		verify(t).getW();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4bigiR#isZeroWithMargin(BigInteger)} returns false,
	 * if the x component exceeds the positive extreme point that is the inclusive
	 * tolerance parameter.
	 */
	@Test
	void isZeroWithMargin_Fail_X_PositiveTest()
	{
		Tup4bigiR t = mock(Tup4bigiR.class);
		
		when(t.isZeroWithMargin(BigInteger.valueOf(2))).thenCallRealMethod();
		
		when(t.getX()).thenReturn(BigInteger.valueOf(3));
		
		assertEquals(false, t.isZeroWithMargin(BigInteger.valueOf(2)));
		
		verify(t).isZeroWithMargin(BigInteger.valueOf(2));
		
		verify(t).getX();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4bigiR#isZeroWithMargin(BigInteger)} returns false,
	 * if the x component exceeds the negative extreme point that is the inclusive
	 * tolerance parameter.
	 */
	@Test
	void isZeroWithMargin_Fail_X_NegativeTest()
	{
		Tup4bigiR t = mock(Tup4bigiR.class);
		
		when(t.isZeroWithMargin(BigInteger.valueOf(2))).thenCallRealMethod();
		
		when(t.getX()).thenReturn(BigInteger.valueOf(-3));
		
		assertEquals(false, t.isZeroWithMargin(BigInteger.valueOf(2)));
		
		verify(t).isZeroWithMargin(BigInteger.valueOf(2));
		
		verify(t).getX();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4bigiR#isZeroWithMargin(BigInteger)} returns false,
	 * if the y component exceeds the positive extreme point that is the inclusive
	 * tolerance parameter.
	 */
	@Test
	void isZeroWithMargin_Fail_Y_PositiveTest()
	{
		Tup4bigiR t = mock(Tup4bigiR.class);
		
		when(t.isZeroWithMargin(BigInteger.valueOf(2))).thenCallRealMethod();
		
		when(t.getX()).thenReturn(BigInteger.ZERO);
		when(t.getY()).thenReturn(BigInteger.valueOf(3));
		
		assertEquals(false, t.isZeroWithMargin(BigInteger.valueOf(2)));
		
		verify(t).isZeroWithMargin(BigInteger.valueOf(2));
		
		verify(t).getX();
		verify(t).getY();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4bigiR#isZeroWithMargin(BigInteger)} returns false,
	 * if the y component exceeds the positive extreme point that is the inclusive
	 * tolerance parameter.
	 */
	@Test
	void isZeroWithMargin_Fail_Y_NegativeTest()
	{
		Tup4bigiR t = mock(Tup4bigiR.class);
		
		when(t.isZeroWithMargin(BigInteger.valueOf(2))).thenCallRealMethod();
		
		when(t.getX()).thenReturn(BigInteger.ZERO);
		when(t.getY()).thenReturn(BigInteger.valueOf(-3));
		
		assertEquals(false, t.isZeroWithMargin(BigInteger.valueOf(2)));
		
		verify(t).isZeroWithMargin(BigInteger.valueOf(2));
		
		verify(t).getX();
		verify(t).getY();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4bigiR#isZeroWithMargin(BigInteger)} returns false,
	 * if the z component exceeds the positive extreme point that is the inclusive
	 * tolerance parameter.
	 */
	@Test
	void isZeroWithMargin_Fail_Z_PositiveTest()
	{
		Tup4bigiR t = mock(Tup4bigiR.class);
		
		when(t.isZeroWithMargin(BigInteger.valueOf(2))).thenCallRealMethod();
		
		when(t.getX()).thenReturn(BigInteger.ZERO);
		when(t.getY()).thenReturn(BigInteger.ZERO);
		when(t.getZ()).thenReturn(BigInteger.valueOf(3));
		
		assertEquals(false, t.isZeroWithMargin(BigInteger.valueOf(2)));
		
		verify(t).isZeroWithMargin(BigInteger.valueOf(2));
		
		verify(t).getX();
		verify(t).getY();
		verify(t).getZ();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4bigiR#isZeroWithMargin(BigInteger)} returns false,
	 * if the z component exceeds the positive extreme point that is the inclusive
	 * tolerance parameter.
	 */
	@Test
	void isZeroWithMargin_Fail_Z_NegativeTest()
	{
		Tup4bigiR t = mock(Tup4bigiR.class);
		
		when(t.isZeroWithMargin(BigInteger.valueOf(2))).thenCallRealMethod();
		
		when(t.getX()).thenReturn(BigInteger.ZERO);
		when(t.getY()).thenReturn(BigInteger.ZERO);
		when(t.getZ()).thenReturn(BigInteger.valueOf(-3));
		
		assertEquals(false, t.isZeroWithMargin(BigInteger.valueOf(2)));
		
		verify(t).isZeroWithMargin(BigInteger.valueOf(2));
		
		verify(t).getX();
		verify(t).getY();
		verify(t).getZ();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4bigiR#isZeroWithMargin(BigInteger)} returns false,
	 * if the w component exceeds the positive extreme point that is the inclusive
	 * tolerance parameter.
	 */
	@Test
	void isZeroWithMargin_Fail_W_PositiveTest()
	{
		Tup4bigiR t = mock(Tup4bigiR.class);
		
		when(t.isZeroWithMargin(BigInteger.valueOf(2))).thenCallRealMethod();
		
		when(t.getX()).thenReturn(BigInteger.ZERO);
		when(t.getY()).thenReturn(BigInteger.ZERO);
		when(t.getZ()).thenReturn(BigInteger.ZERO);
		when(t.getW()).thenReturn(BigInteger.valueOf(3));
		
		assertEquals(false, t.isZeroWithMargin(BigInteger.valueOf(2)));
		
		verify(t).isZeroWithMargin(BigInteger.valueOf(2));
		
		verify(t).getX();
		verify(t).getY();
		verify(t).getZ();
		verify(t).getW();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4bigiR#isZeroWithMargin(BigInteger)} returns false,
	 * if the w component exceeds the positive extreme point that is the inclusive
	 * tolerance parameter.
	 */
	@Test
	void isZeroWithMargin_Fail_W_NegativeTest()
	{
		Tup4bigiR t = mock(Tup4bigiR.class);
		
		when(t.isZeroWithMargin(BigInteger.valueOf(2))).thenCallRealMethod();
		
		when(t.getX()).thenReturn(BigInteger.ZERO);
		when(t.getY()).thenReturn(BigInteger.ZERO);
		when(t.getZ()).thenReturn(BigInteger.ZERO);
		when(t.getW()).thenReturn(BigInteger.valueOf(-3));
		
		assertEquals(false, t.isZeroWithMargin(BigInteger.valueOf(2)));
		
		verify(t).isZeroWithMargin(BigInteger.valueOf(2));
		
		verify(t).getX();
		verify(t).getY();
		verify(t).getZ();
		verify(t).getW();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the default implementation of the function {@link Tup4bigiR#getNewInstance(Tup4bigiR)} calls
	 * the function {@link Tup4bigiR#getNewInstance(BigInteger, BigInteger, BigInteger, BigInteger)} with the correct components.
	 */
	@Test
	void getNewInstance_Tuple2Test()
	{
		Tup4bigiR original = mock(Tup4bigiR.class);
		Tup4bigiR newInstance = mock(Tup4bigiR.class);
		Tup4bigiR t = mock(Tup4bigiR.class);
		
		when(t.getNewInstance(original)).thenCallRealMethod();
		
		when(original.getX()).thenReturn(BigInteger.ONE);
		when(original.getY()).thenReturn(BigInteger.valueOf(2));
		when(original.getZ()).thenReturn(BigInteger.valueOf(3));
		when(original.getW()).thenReturn(BigInteger.valueOf(4));
		when(t.getNewInstance(BigInteger.ONE, BigInteger.valueOf(2), BigInteger.valueOf(3), BigInteger.valueOf(4))).thenReturn(newInstance);
		
		assertSame(newInstance, t.getNewInstance(original));
		
		verify(t).getNewInstance(original);
		
		verify(original).getX();
		verify(original).getY();
		verify(original).getZ();
		verify(original).getW();
		verify(t).getNewInstance(BigInteger.ONE, BigInteger.valueOf(2), BigInteger.valueOf(3), BigInteger.valueOf(4));
		
		verifyNoMoreInteractions(t, original);
	}
	
	/**
	 * This test ensures, that the default implementation of the function {@link Tup4bigiR#getNewInstance(BigInteger)} calls
	 * the function {@link Tup4bigiR#getNewInstance(BigInteger, BigInteger, BigInteger, BigInteger)} with the correct components.
	 */
	@Test
	void getNewInstance_ValueTest()
	{
		Tup4bigiR newInstance = mock(Tup4bigiR.class);
		Tup4bigiR t = mock(Tup4bigiR.class);
		
		when(t.getNewInstance(BigInteger.ONE)).thenCallRealMethod();

		when(t.getNewInstance(BigInteger.ONE, BigInteger.ONE, BigInteger.ONE, BigInteger.ONE)).thenReturn(newInstance);
		
		assertSame(newInstance, t.getNewInstance(BigInteger.ONE));
		
		verify(t).getNewInstance(BigInteger.ONE);
		
		verify(t).getNewInstance(BigInteger.ONE, BigInteger.ONE, BigInteger.ONE, BigInteger.ONE);
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the default implementation of the function {@link Tup4bigiR#getNewInstance(TupbigiR)} calls
	 * the function {@link Tup4bigiR#getNewInstance(BigInteger, BigInteger, BigInteger, BigInteger)} with the correct components.
	 */
	@Test
	void getNewInstance_TupleTest()
	{
		TupbigiR original = mock(TupbigiR.class);
		Tup4bigiR newInstance = mock(Tup4bigiR.class);
		Tup4bigiR t = mock(Tup4bigiR.class);
		
		when(t.getNewInstance(original)).thenCallRealMethod();
		
		when(original.getArray()).thenReturn(new BigInteger[] {BigInteger.ONE, BigInteger.valueOf(2), BigInteger.valueOf(3), BigInteger.valueOf(4)});
		when(t.getNewInstance(BigInteger.ONE, BigInteger.valueOf(2), BigInteger.valueOf(3), BigInteger.valueOf(4))).thenReturn(newInstance);
		
		assertSame(newInstance, t.getNewInstance(original));
		
		verify(t).getNewInstance(original);
		
		verify(original).getArray();
		verify(t).getNewInstance(BigInteger.ONE, BigInteger.valueOf(2), BigInteger.valueOf(3), BigInteger.valueOf(4));
		
		verifyNoMoreInteractions(t, original);
	}
	
	/**
	 * This test ensures, that the default implementation of the function {@link Tup4bigiR#getNewInstanceFromArray(BigInteger[])} calls
	 * the function {@link Tup4bigiR#getNewInstance(BigInteger, BigInteger, BigInteger)} with the correct components.
	 */
	@Test
	void getNewInstanceFromArrayTest()
	{
		Tup4bigiR newInstance = mock(Tup4bigiR.class);
		Tup4bigiR t = mock(Tup4bigiR.class);
		
		when(t.getNewInstanceFromArray(new BigInteger[] {BigInteger.ONE, BigInteger.valueOf(2), BigInteger.valueOf(3), BigInteger.valueOf(4)})).thenCallRealMethod();

		when(t.getNewInstance(BigInteger.ONE, BigInteger.valueOf(2), BigInteger.valueOf(3), BigInteger.valueOf(4))).thenReturn(newInstance);
		
		assertSame(newInstance, t.getNewInstanceFromArray(new BigInteger[] {BigInteger.ONE, BigInteger.valueOf(2), BigInteger.valueOf(3), BigInteger.valueOf(4)}));
		
		verify(t).getNewInstanceFromArray(new BigInteger[] {BigInteger.ONE, BigInteger.valueOf(2), BigInteger.valueOf(3), BigInteger.valueOf(4)});
		
		verify(t).getNewInstance(BigInteger.ONE, BigInteger.valueOf(2), BigInteger.valueOf(3), BigInteger.valueOf(4));
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4bigiR#getArray()} returns
	 * an array with the components in the right order.
	 */
	@Test
	void getArrayTest()
	{
		Tup4bigiR t = mock(Tup4bigiR.class);
		
		when(t.getArray()).thenCallRealMethod();
		
		when(t.getX()).thenReturn(BigInteger.ONE);
		when(t.getY()).thenReturn(BigInteger.valueOf(2));
		when(t.getZ()).thenReturn(BigInteger.valueOf(3));
		when(t.getW()).thenReturn(BigInteger.valueOf(4));
		
		assertArrayEquals(new BigInteger[] {BigInteger.ONE, BigInteger.valueOf(2), BigInteger.valueOf(3), BigInteger.valueOf(4)}, t.getArray());
		
		verify(t).getArray();
		
		verify(t).getX();
		verify(t).getY();
		verify(t).getZ();
		verify(t).getW();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4bigiR#getByIndex(int)} returns
	 * the x component for the index 0.
	 */
	@Test
	void getByIndex_XTest()
	{
		Tup4bigiR t = mock(Tup4bigiR.class);
		
		when(t.getByIndex(0)).thenCallRealMethod();
		
		when(t.getX()).thenReturn(BigInteger.ONE);
		
		assertEquals(BigInteger.ONE, t.getByIndex(0));

		verify(t).getByIndex(0);
		
		verify(t).getX();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4bigiR#getByIndex(int)} returns
	 * the y component for the index 1.
	 */
	@Test
	void getByIndex_YTest()
	{
		Tup4bigiR t = mock(Tup4bigiR.class);
		
		when(t.getByIndex(1)).thenCallRealMethod();
		
		when(t.getY()).thenReturn(BigInteger.ONE);
		
		assertEquals(BigInteger.ONE, t.getByIndex(1));

		verify(t).getByIndex(1);
		
		verify(t).getY();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4bigiR#getByIndex(int)} returns
	 * the z component for the index 2.
	 */
	@Test
	void getByIndex_ZTest()
	{
		Tup4bigiR t = mock(Tup4bigiR.class);
		
		when(t.getByIndex(2)).thenCallRealMethod();
		
		when(t.getZ()).thenReturn(BigInteger.ONE);
		
		assertEquals(BigInteger.ONE, t.getByIndex(2));

		verify(t).getByIndex(2);
		
		verify(t).getZ();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4bigiR#getByIndex(int)} returns
	 * the w component for the index 3.
	 */
	@Test
	void getByIndex_WTest()
	{
		Tup4bigiR t = mock(Tup4bigiR.class);
		
		when(t.getByIndex(3)).thenCallRealMethod();
		
		when(t.getW()).thenReturn(BigInteger.ONE);
		
		assertEquals(BigInteger.ONE, t.getByIndex(3));

		verify(t).getByIndex(3);
		
		verify(t).getW();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4bigiR#getByIndex(int)} throws
	 * an {@link IndexOutOfBoundsException} for an index different than 0, 1, 2 or 3.
	 */
	@Test
	void getByIndex_ExceptionTest()
	{
		Tup4bigiR t = mock(Tup4bigiR.class);
		
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