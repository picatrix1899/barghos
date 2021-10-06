package org.barghos.core.test.api.tuple3;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import java.math.BigInteger;

import org.barghos.core.api.tuple.TupbigiR;
import org.barghos.core.api.tuple3.Tup3bigiR;

/**
 * This class provides component tests for the interface {@link Tup3bigiR}.
 * 
 * @author picatrix1899
 */
class Tup3bigiRTest
{
	/**
	 * This test ensures, that the interface extends the interface {@link TupbigiR}.
	 */
	@Test
	void inheritance_TupbigiRTest()
	{
		assertTrue(TupbigiR.class.isAssignableFrom(Tup3bigiR.class));
	}
	
	/**
	 * This test ensures, that the function {@link Tup3bigiR#isValid()} returns true,
	 * if none of the components is null.
	 */
	@Test
	void isValidTest()
	{
		Tup3bigiR t = mock(Tup3bigiR.class);
		
		when(t.isValid()).thenCallRealMethod();
		
		when(t.getX()).thenReturn(BigInteger.ONE);
		when(t.getY()).thenReturn(BigInteger.ONE);
		when(t.getZ()).thenReturn(BigInteger.ONE);
		
		assertEquals(true, t.isValid());
		
		verify(t).isValid();
		
		verify(t).getX();
		verify(t).getY();
		verify(t).getZ();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup3bigiR#isValid()} returns false,
	 * if the x component is null.
	 */
	@Test
	void isValid_Fail_XTest()
	{
		Tup3bigiR t = mock(Tup3bigiR.class);
		
		when(t.isValid()).thenCallRealMethod();
		
		when(t.getX()).thenReturn(null);

		assertEquals(false, t.isValid());
		
		verify(t).isValid();
		
		verify(t).getX();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup3bigiR#isValid()} returns false,
	 * if the y component is null.
	 */
	@Test
	void isValid_Fail_YTest()
	{
		Tup3bigiR t = mock(Tup3bigiR.class);
		
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
	 * This test ensures, that the function {@link Tup3bigiR#isValid()} returns false,
	 * if the z component is null.
	 */
	@Test
	void isValid_Fail_ZTest()
	{
		Tup3bigiR t = mock(Tup3bigiR.class);
		
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
	 * this test ensures, that the function {@link Tup3bigiR#getDimensions()} always
	 * returns 3 and does not make any calls.
	 */
	@Test
	void getDimensionsTest()
	{
		Tup3bigiR t = mock(Tup3bigiR.class);
		
		when(t.getDimensions()).thenCallRealMethod();
		
		assertEquals(3, t.getDimensions());
		
		verify(t).getDimensions();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup3bigiR#isZero()} returns true,
	 * if all of the components are exactly {@link BigInteger#ZERO}.
	 */
	@Test
	void isZero_ZeroTest()
	{
		Tup3bigiR t = mock(Tup3bigiR.class);
		
		when(t.isZero()).thenCallRealMethod();
		
		when(t.getX()).thenReturn(BigInteger.ZERO);
		when(t.getY()).thenReturn(BigInteger.ZERO);
		when(t.getZ()).thenReturn(BigInteger.ZERO);
		
		assertEquals(true, t.isZero());
		
		verify(t).isZero();
		
		verify(t).getX();
		verify(t).getY();
		verify(t).getZ();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup3bigiR#isZero()} returns false,
	 * if the x component is not {@link BigInteger#ZERO}.
	 */
	@Test
	void isZero_Fail_XTest()
	{
		Tup3bigiR t = mock(Tup3bigiR.class);
		
		when(t.isZero()).thenCallRealMethod();
		
		when(t.getX()).thenReturn(BigInteger.ONE);
		
		assertEquals(false, t.isZero());
		
		verify(t).isZero();
		
		verify(t).getX();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup3bigiR#isZero()} returns false,
	 * if the y component is not {@link BigInteger#ZERO}.
	 */
	@Test
	void isZero_Fail_YTest()
	{
		Tup3bigiR t = mock(Tup3bigiR.class);
		
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
	 * This test ensures, that the function {@link Tup3bigiR#isZero()} returns false,
	 * if the z component is not {@link BigInteger#ZERO}.
	 */
	@Test
	void isZero_Fail_ZTest()
	{
		Tup3bigiR t = mock(Tup3bigiR.class);
		
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
	 * This test ensures, that the function {@link Tup3bigiR#isZeroWithMargin(BigInteger)} returns true,
	 * if all components are exactly {@link BigInteger#ZERO}.
	 */
	@Test
	void isZeroWithMargin_ZeroTest()
	{
		Tup3bigiR t = mock(Tup3bigiR.class);
		
		when(t.isZeroWithMargin(BigInteger.valueOf(2))).thenCallRealMethod();
		
		when(t.getX()).thenReturn(BigInteger.ZERO);
		when(t.getY()).thenReturn(BigInteger.ZERO);
		when(t.getZ()).thenReturn(BigInteger.ZERO);
		
		assertEquals(true, t.isZeroWithMargin(BigInteger.valueOf(2)));
		
		verify(t).isZeroWithMargin(BigInteger.valueOf(2));
		
		verify(t).getX();
		verify(t).getY();
		verify(t).getZ();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup3bigiR#isZeroWithMargin(BigInteger)} returns true,
	 * if all components are at the positive extreme point that is the inclusive
	 * tolerance parameter.
	 */
	@Test
	void isZeroWithMargin_Extreme_PositiveTest()
	{
		Tup3bigiR t = mock(Tup3bigiR.class);
		
		when(t.isZeroWithMargin(BigInteger.valueOf(2))).thenCallRealMethod();
		
		when(t.getX()).thenReturn(BigInteger.valueOf(2));
		when(t.getY()).thenReturn(BigInteger.valueOf(2));
		when(t.getZ()).thenReturn(BigInteger.valueOf(2));
		
		assertEquals(true, t.isZeroWithMargin(BigInteger.valueOf(2)));
		
		verify(t).isZeroWithMargin(BigInteger.valueOf(2));
		
		verify(t).getX();
		verify(t).getY();
		verify(t).getZ();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup3bigiR#isZeroWithMargin(BigInteger)} returns true,
	 * if all components are at the negative extreme point that is the inclusive
	 * tolerance parameter.
	 */
	@Test
	void isZeroWithMargin_Extreme_NegativeTest()
	{
		Tup3bigiR t = mock(Tup3bigiR.class);
		
		when(t.isZeroWithMargin(BigInteger.valueOf(2))).thenCallRealMethod();
		
		when(t.getX()).thenReturn(BigInteger.valueOf(-2));
		when(t.getY()).thenReturn(BigInteger.valueOf(-2));
		when(t.getZ()).thenReturn(BigInteger.valueOf(-2));
		
		assertEquals(true, t.isZeroWithMargin(BigInteger.valueOf(2)));
		
		verify(t).isZeroWithMargin(BigInteger.valueOf(2));
		
		verify(t).getX();
		verify(t).getY();
		verify(t).getZ();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup3bigiR#isZeroWithMargin(BigInteger)} returns false,
	 * if the x component exceeds the positive extreme point that is the inclusive
	 * tolerance parameter.
	 */
	@Test
	void isZeroWithMargin_Fail_X_PositiveTest()
	{
		Tup3bigiR t = mock(Tup3bigiR.class);
		
		when(t.isZeroWithMargin(BigInteger.valueOf(2))).thenCallRealMethod();
		
		when(t.getX()).thenReturn(BigInteger.valueOf(3));
		
		assertEquals(false, t.isZeroWithMargin(BigInteger.valueOf(2)));
		
		verify(t).isZeroWithMargin(BigInteger.valueOf(2));
		
		verify(t).getX();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup3bigiR#isZeroWithMargin(BigInteger)} returns false,
	 * if the x component exceeds the negative extreme point that is the inclusive
	 * tolerance parameter.
	 */
	@Test
	void isZeroWithMargin_Fail_X_NegativeTest()
	{
		Tup3bigiR t = mock(Tup3bigiR.class);
		
		when(t.isZeroWithMargin(BigInteger.valueOf(2))).thenCallRealMethod();
		
		when(t.getX()).thenReturn(BigInteger.valueOf(-3));
		
		assertEquals(false, t.isZeroWithMargin(BigInteger.valueOf(2)));
		
		verify(t).isZeroWithMargin(BigInteger.valueOf(2));
		
		verify(t).getX();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup3bigiR#isZeroWithMargin(BigInteger)} returns false,
	 * if the y component exceeds the positive extreme point that is the inclusive
	 * tolerance parameter.
	 */
	@Test
	void isZeroWithMargin_Fail_Y_PositiveTest()
	{
		Tup3bigiR t = mock(Tup3bigiR.class);
		
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
	 * This test ensures, that the function {@link Tup3bigiR#isZeroWithMargin(BigInteger)} returns false,
	 * if the y component exceeds the positive extreme point that is the inclusive
	 * tolerance parameter.
	 */
	@Test
	void isZeroWithMargin_Fail_Y_NegativeTest()
	{
		Tup3bigiR t = mock(Tup3bigiR.class);
		
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
	 * This test ensures, that the function {@link Tup3bigiR#isZeroWithMargin(BigInteger)} returns false,
	 * if the z component exceeds the positive extreme point that is the inclusive
	 * tolerance parameter.
	 */
	@Test
	void isZeroWithMargin_Fail_Z_PositiveTest()
	{
		Tup3bigiR t = mock(Tup3bigiR.class);
		
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
	 * This test ensures, that the function {@link Tup3bigiR#isZeroWithMargin(BigInteger)} returns false,
	 * if the z component exceeds the positive extreme point that is the inclusive
	 * tolerance parameter.
	 */
	@Test
	void isZeroWithMargin_Fail_Z_NegativeTest()
	{
		Tup3bigiR t = mock(Tup3bigiR.class);
		
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
	 * This test ensures, that the default implementation of the function {@link Tup3bigiR#getNewInstance(Tup3bigiR)} calls
	 * the function {@link Tup3bigiR#getNewInstance(BigInteger, BigInteger, BigInteger)} with the correct components.
	 */
	@Test
	void getNewInstance_Tuple2Test()
	{
		Tup3bigiR original = mock(Tup3bigiR.class);
		Tup3bigiR newInstance = mock(Tup3bigiR.class);
		Tup3bigiR t = mock(Tup3bigiR.class);
		
		when(t.getNewInstance(original)).thenCallRealMethod();
		
		when(original.getX()).thenReturn(BigInteger.ONE);
		when(original.getY()).thenReturn(BigInteger.valueOf(2));
		when(original.getZ()).thenReturn(BigInteger.valueOf(3));
		when(t.getNewInstance(BigInteger.ONE, BigInteger.valueOf(2), BigInteger.valueOf(3))).thenReturn(newInstance);
		
		assertSame(newInstance, t.getNewInstance(original));
		
		verify(t).getNewInstance(original);
		
		verify(original).getX();
		verify(original).getY();
		verify(original).getZ();
		verify(t).getNewInstance(BigInteger.ONE, BigInteger.valueOf(2), BigInteger.valueOf(3));
		
		verifyNoMoreInteractions(t, original);
	}
	
	/**
	 * This test ensures, that the default implementation of the function {@link Tup3bigiR#getNewInstance(BigInteger)} calls
	 * the function {@link Tup3bigiR#getNewInstance(BigInteger, BigInteger, BigInteger)} with the correct components.
	 */
	@Test
	void getNewInstance_ValueTest()
	{
		Tup3bigiR newInstance = mock(Tup3bigiR.class);
		Tup3bigiR t = mock(Tup3bigiR.class);
		
		when(t.getNewInstance(BigInteger.ONE)).thenCallRealMethod();

		when(t.getNewInstance(BigInteger.ONE, BigInteger.ONE, BigInteger.ONE)).thenReturn(newInstance);
		
		assertSame(newInstance, t.getNewInstance(BigInteger.ONE));
		
		verify(t).getNewInstance(BigInteger.ONE);
		
		verify(t).getNewInstance(BigInteger.ONE, BigInteger.ONE, BigInteger.ONE);
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the default implementation of the function {@link Tup3bigiR#getNewInstance(TupbigiR)} calls
	 * the function {@link Tup3bigiR#getNewInstance(BigInteger, BigInteger, BigInteger)} with the correct components.
	 */
	@Test
	void getNewInstance_TupleTest()
	{
		TupbigiR original = mock(TupbigiR.class);
		Tup3bigiR newInstance = mock(Tup3bigiR.class);
		Tup3bigiR t = mock(Tup3bigiR.class);
		
		when(t.getNewInstance(original)).thenCallRealMethod();
		
		when(original.getArray()).thenReturn(new BigInteger[] {BigInteger.ONE, BigInteger.valueOf(2), BigInteger.valueOf(3)});
		when(t.getNewInstance(BigInteger.ONE, BigInteger.valueOf(2), BigInteger.valueOf(3))).thenReturn(newInstance);
		
		assertSame(newInstance, t.getNewInstance(original));
		
		verify(t).getNewInstance(original);
		
		verify(original).getArray();
		verify(t).getNewInstance(BigInteger.ONE, BigInteger.valueOf(2), BigInteger.valueOf(3));
		
		verifyNoMoreInteractions(t, original);
	}
	
	/**
	 * This test ensures, that the default implementation of the function {@link Tup3bigiR#getNewInstanceFromArray(BigInteger[])} calls
	 * the function {@link Tup3bigiR#getNewInstance(BigInteger, BigInteger, BigInteger)} with the correct components.
	 */
	@Test
	void getNewInstanceFromArrayTest()
	{
		Tup3bigiR newInstance = mock(Tup3bigiR.class);
		Tup3bigiR t = mock(Tup3bigiR.class);
		
		when(t.getNewInstanceFromArray(new BigInteger[] {BigInteger.ONE, BigInteger.valueOf(2), BigInteger.valueOf(3)})).thenCallRealMethod();

		when(t.getNewInstance(BigInteger.ONE, BigInteger.valueOf(2), BigInteger.valueOf(3))).thenReturn(newInstance);
		
		assertSame(newInstance, t.getNewInstanceFromArray(new BigInteger[] {BigInteger.ONE, BigInteger.valueOf(2), BigInteger.valueOf(3)}));
		
		verify(t).getNewInstanceFromArray(new BigInteger[] {BigInteger.ONE, BigInteger.valueOf(2), BigInteger.valueOf(3)});
		
		verify(t).getNewInstance(BigInteger.ONE, BigInteger.valueOf(2), BigInteger.valueOf(3));
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup3bigiR#getArray()} returns
	 * an array with the components in the right order.
	 */
	@Test
	void getArrayTest()
	{
		Tup3bigiR t = mock(Tup3bigiR.class);
		
		when(t.getArray()).thenCallRealMethod();
		
		when(t.getX()).thenReturn(BigInteger.ONE);
		when(t.getY()).thenReturn(BigInteger.valueOf(2));
		when(t.getZ()).thenReturn(BigInteger.valueOf(3));
		
		assertArrayEquals(new BigInteger[] {BigInteger.ONE, BigInteger.valueOf(2), BigInteger.valueOf(3)}, t.getArray());
		
		verify(t).getArray();
		
		verify(t).getX();
		verify(t).getY();
		verify(t).getZ();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup3bigiR#getByIndex(int)} returns
	 * the x component for the index 0.
	 */
	@Test
	void getByIndex_XTest()
	{
		Tup3bigiR t = mock(Tup3bigiR.class);
		
		when(t.getByIndex(0)).thenCallRealMethod();
		
		when(t.getX()).thenReturn(BigInteger.ONE);
		
		assertEquals(BigInteger.ONE, t.getByIndex(0));

		verify(t).getByIndex(0);
		
		verify(t).getX();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup3bigiR#getByIndex(int)} returns
	 * the y component for the index 1.
	 */
	@Test
	void getByIndex_YTest()
	{
		Tup3bigiR t = mock(Tup3bigiR.class);
		
		when(t.getByIndex(1)).thenCallRealMethod();
		
		when(t.getY()).thenReturn(BigInteger.ONE);
		
		assertEquals(BigInteger.ONE, t.getByIndex(1));

		verify(t).getByIndex(1);
		
		verify(t).getY();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup3bigiR#getByIndex(int)} returns
	 * the z component for the index 2.
	 */
	@Test
	void getByIndex_ZTest()
	{
		Tup3bigiR t = mock(Tup3bigiR.class);
		
		when(t.getByIndex(2)).thenCallRealMethod();
		
		when(t.getZ()).thenReturn(BigInteger.ONE);
		
		assertEquals(BigInteger.ONE, t.getByIndex(2));

		verify(t).getByIndex(2);
		
		verify(t).getZ();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup3bigiR#getByIndex(int)} throws
	 * an {@link IndexOutOfBoundsException} for an index different than 0, 1 or 2.
	 */
	@Test
	void getByIndex_ExceptionTest()
	{
		Tup3bigiR t = mock(Tup3bigiR.class);
		
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