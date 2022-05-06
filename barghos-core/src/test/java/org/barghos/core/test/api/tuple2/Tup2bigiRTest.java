package org.barghos.core.test.api.tuple2;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import java.math.BigInteger;

import static org.barghos.core.api.testing.TestObjectFactory.*;

import org.barghos.core.api.tuple.TupbigiR;
import org.barghos.core.api.tuple2.Tup2bigiR;

/**
 * This class provides component tests for the interface {@link Tup2bigiR}.
 * 
 * @author picatrix1899
 */
class Tup2bigiRTest
{
	/**
	 * This test ensures, that the interface extends the interface {@link TupbigiR}.
	 */
	@Test
	void inheritance_TupbigiRTest()
	{
		assertTrue(TupbigiR.class.isAssignableFrom(Tup2bigiR.class));
	}
	
	/**
	 * This test ensures, that the function {@link Tup2bigiR#isValid()} returns true,
	 * if none of the components is null.
	 */
	@Test
	void isValidTest()
	{
		Tup2bigiR t = mock(Tup2bigiR.class);
		
		when(t.isValid()).thenCallRealMethod();
		
		when(t.getX()).thenReturn(bigi(1));
		when(t.getY()).thenReturn(bigi(1));
		
		assertEquals(true, t.isValid());
		
		verify(t).isValid();
		
		verify(t).getX();
		verify(t).getY();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup2bigiR#isValid()} returns false,
	 * if the x component is null.
	 */
	@Test
	void isValid_Fail_XTest()
	{
		Tup2bigiR t = mock(Tup2bigiR.class);
		
		when(t.isValid()).thenCallRealMethod();
		
		when(t.getX()).thenReturn(null);

		assertEquals(false, t.isValid());
		
		verify(t).isValid();
		
		verify(t).getX();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup2bigiR#isValid()} returns false,
	 * if the y component is null.
	 */
	@Test
	void isValid_Fail_YTest()
	{
		Tup2bigiR t = mock(Tup2bigiR.class);
		
		when(t.isValid()).thenCallRealMethod();
		
		when(t.getX()).thenReturn(bigi(1));
		when(t.getY()).thenReturn(null);

		assertEquals(false, t.isValid());
		
		verify(t).isValid();
		
		verify(t).getX();
		verify(t).getY();
		
		verifyNoMoreInteractions(t);
	}

	/**
	 * this test ensures, that the function {@link Tup2bigiR#getDimensions()} always
	 * returns 2 and does not make any calls.
	 */
	@Test
	void getDimensionsTest()
	{
		Tup2bigiR t = mock(Tup2bigiR.class);
		
		when(t.getDimensions()).thenCallRealMethod();
		
		assertEquals(2, t.getDimensions());
		
		verify(t).getDimensions();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup2bigiR#isExactlyZero()} returns true,
	 * if all of the components are exactly {@link BigInteger#ZERO}.
	 */
	@Test
	void isExactlyZero_ZeroTest()
	{
		Tup2bigiR t = mock(Tup2bigiR.class);
		
		when(t.isExactlyZero()).thenCallRealMethod();
		
		when(t.getX()).thenReturn(bigi(0));
		when(t.getY()).thenReturn(bigi(0));
		
		assertEquals(true, t.isExactlyZero());
		
		verify(t).isExactlyZero();
		
		verify(t).getX();
		verify(t).getY();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup2bigiR#isExactlyZero()} returns false,
	 * if the x component is not {@link BigInteger#ZERO}.
	 */
	@Test
	void isExactlyZero_Fail_XTest()
	{
		Tup2bigiR t = mock(Tup2bigiR.class);
		
		when(t.isExactlyZero()).thenCallRealMethod();
		
		when(t.getX()).thenReturn(bigi(1));
		
		assertEquals(false, t.isExactlyZero());
		
		verify(t).isExactlyZero();
		
		verify(t).getX();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup2bigiR#isExactlyZero()} returns false,
	 * if the y component is not {@link BigInteger#ZERO}.
	 */
	@Test
	void isExactlyZero_Fail_YTest()
	{
		Tup2bigiR t = mock(Tup2bigiR.class);
		
		when(t.isExactlyZero()).thenCallRealMethod();
		
		when(t.getX()).thenReturn(bigi(0));
		when(t.getY()).thenReturn(bigi(1));
		
		assertEquals(false, t.isExactlyZero());
		
		verify(t).isExactlyZero();
		
		verify(t).getX();
		verify(t).getY();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup2bigiR#isZero(BigInteger)} returns true,
	 * if all components are exactly {@link BigInteger#ZERO}.
	 */
	@Test
	void isZero_ZeroTest()
	{
		Tup2bigiR t = mock(Tup2bigiR.class);
		
		when(t.isZero(bigi(2))).thenCallRealMethod();
		
		when(t.getX()).thenReturn(bigi(0));
		when(t.getY()).thenReturn(bigi(0));
		
		assertEquals(true, t.isZero(bigi(2)));
		
		verify(t).isZero(bigi(2));
		
		verify(t).getX();
		verify(t).getY();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup2bigiR#isZero(BigInteger)} returns true,
	 * if all components are at the positive extreme point that is the inclusive
	 * tolerance parameter.
	 */
	@Test
	void isZero_Extreme_PositiveTest()
	{
		Tup2bigiR t = mock(Tup2bigiR.class);
		
		when(t.isZero(bigi(2))).thenCallRealMethod();
		
		when(t.getX()).thenReturn(bigi(2));
		when(t.getY()).thenReturn(bigi(2));
		
		assertEquals(true, t.isZero(bigi(2)));
		
		verify(t).isZero(bigi(2));
		
		verify(t).getX();
		verify(t).getY();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup2bigiR#isZero(BigInteger)} returns true,
	 * if all components are at the negative extreme point that is the inclusive
	 * tolerance parameter.
	 */
	@Test
	void isZero_Extreme_NegativeTest()
	{
		Tup2bigiR t = mock(Tup2bigiR.class);
		
		when(t.isZero(bigi(2))).thenCallRealMethod();
		
		when(t.getX()).thenReturn(bigi(-2));
		when(t.getY()).thenReturn(bigi(-2));
		
		assertEquals(true, t.isZero(bigi(2)));
		
		verify(t).isZero(bigi(2));
		
		verify(t).getX();
		verify(t).getY();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup2bigiR#isZero(BigInteger)} returns false,
	 * if the x component exceeds the positive extreme point that is the inclusive
	 * tolerance parameter.
	 */
	@Test
	void isZero_Fail_X_PositiveTest()
	{
		Tup2bigiR t = mock(Tup2bigiR.class);
		
		when(t.isZero(bigi(2))).thenCallRealMethod();
		
		when(t.getX()).thenReturn(bigi(3));
		
		assertEquals(false, t.isZero(bigi(2)));
		
		verify(t).isZero(bigi(2));
		
		verify(t).getX();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup2bigiR#isZero(BigInteger)} returns false,
	 * if the x component exceeds the negative extreme point that is the inclusive
	 * tolerance parameter.
	 */
	@Test
	void isZero_Fail_X_NegativeTest()
	{
		Tup2bigiR t = mock(Tup2bigiR.class);
		
		when(t.isZero(bigi(2))).thenCallRealMethod();
		
		when(t.getX()).thenReturn(bigi(-3));
		
		assertEquals(false, t.isZero(bigi(2)));
		
		verify(t).isZero(bigi(2));
		
		verify(t).getX();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup2bigiR#isZero(BigInteger)} returns false,
	 * if the y component exceeds the positive extreme point that is the inclusive
	 * tolerance parameter.
	 */
	@Test
	void isZero_Fail_Y_PositiveTest()
	{
		Tup2bigiR t = mock(Tup2bigiR.class);
		
		when(t.isZero(bigi(2))).thenCallRealMethod();
		
		when(t.getX()).thenReturn(bigi(0));
		when(t.getY()).thenReturn(bigi(3));
		
		assertEquals(false, t.isZero(bigi(2)));
		
		verify(t).isZero(bigi(2));
		
		verify(t).getX();
		verify(t).getY();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup2bigiR#isZero(BigInteger)} returns false,
	 * if the y component exceeds the positive extreme point that is the inclusive
	 * tolerance parameter.
	 */
	@Test
	void isZero_Fail_Y_NegativeTest()
	{
		Tup2bigiR t = mock(Tup2bigiR.class);
		
		when(t.isZero(bigi(2))).thenCallRealMethod();
		
		when(t.getX()).thenReturn(bigi(0));
		when(t.getY()).thenReturn(bigi(-3));
		
		assertEquals(false, t.isZero(bigi(2)));
		
		verify(t).isZero(bigi(2));
		
		verify(t).getX();
		verify(t).getY();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup2bigiR#toArray(BigInteger[])} returns
	 * the given array with the components in the right order.
	 */
	@Test
	void toArray_ExtractParamTest()
	{
		Tup2bigiR t = mock(Tup2bigiR.class);
		
		BigInteger[] array = new BigInteger[2];
		
		when(t.toArray(array)).thenCallRealMethod();
		
		when(t.getX()).thenReturn(bigi(1));
		when(t.getY()).thenReturn(bigi(2));
		
		assertSame(array, t.toArray(array));
		assertArrayEquals(bigiArray(1, 2), array);
		
		verify(t).toArray(array);
		
		verify(t).getX();
		verify(t).getY();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup2bigiR#getByIndex(int)} returns
	 * the x component for the index 0.
	 */
	@Test
	void getByIndex_XTest()
	{
		Tup2bigiR t = mock(Tup2bigiR.class);
		
		when(t.getByIndex(0)).thenCallRealMethod();
		
		when(t.getX()).thenReturn(bigi(1));
		
		assertEquals(bigi(1), t.getByIndex(0));

		verify(t).getByIndex(0);
		
		verify(t).getX();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup2bigiR#getByIndex(int)} returns
	 * the y component for the index 1.
	 */
	@Test
	void getByIndex_YTest()
	{
		Tup2bigiR t = mock(Tup2bigiR.class);
		
		when(t.getByIndex(1)).thenCallRealMethod();
		
		when(t.getY()).thenReturn(bigi(1));
		
		assertEquals(bigi(1), t.getByIndex(1));

		verify(t).getByIndex(1);
		
		verify(t).getY();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup2bigiR#getByIndex(int)} throws
	 * an {@link IndexOutOfBoundsException} for an index different than 0 or 1.
	 */
	@Test
	void getByIndex_ExceptionTest()
	{
		Tup2bigiR t = mock(Tup2bigiR.class);
		
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