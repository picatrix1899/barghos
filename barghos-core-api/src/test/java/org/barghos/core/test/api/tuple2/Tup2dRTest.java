package org.barghos.core.test.api.tuple2;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import java.nio.DoubleBuffer;

import org.barghos.core.api.tuple.TupdR;
import org.barghos.core.api.tuple2.Tup2dR;

/**
 * This class provides component tests for the interface {@link Tup2dR}.
 * 
 * @author picatrix1899
 */
class Tup2dRTest
{
	/**
	 * This test ensures, that the interface extends the interface {@link TupdR}.
	 */
	@Test
	void inheritance_TupdRTest()
	{
		assertTrue(TupdR.class.isAssignableFrom(Tup2dR.class));
	}
	
	/**
	 * This test ensures, that the function {@link Tup2dR#isFinite()} returns true,
	 * if none of the components is either {@link Double#POSITIVE_INFINITY},
	 * {@link Double#NEGATIVE_INFINITY}} or {@link Double#NaN}.
	 */
	@Test
	void isFiniteTest()
	{
		Tup2dR t = mock(Tup2dR.class);
		
		when(t.isFinite()).thenCallRealMethod();
		
		when(t.getX()).thenReturn(1.0);
		when(t.getY()).thenReturn(1.0);
		
		assertEquals(true, t.isFinite());
		
		verify(t).isFinite();
		
		verify(t).getX();
		verify(t).getY();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup2dR#isFinite()} returns false
	 * after checking the x component, if the x component is {@link Double#POSITIVE_INFINITY}.
	 */
	@Test
	void isFinite_Fail_X_PositiveInfTest()
	{
		Tup2dR t = mock(Tup2dR.class);
		
		when(t.isFinite()).thenCallRealMethod();
		
		when(t.getX()).thenReturn(Double.POSITIVE_INFINITY);
		
		assertEquals(false, t.isFinite());
		
		verify(t).isFinite();
		
		verify(t).getX();

		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup2dR#isFinite()} returns false
	 * after checking the x component, if the x component is {@link Double#NEGATIVE_INFINITY}.
	 */
	@Test
	void isFinite_Fail_X_NegativeInfTest()
	{
		Tup2dR t = mock(Tup2dR.class);
		
		when(t.isFinite()).thenCallRealMethod();
		
		when(t.getX()).thenReturn(Double.NEGATIVE_INFINITY);
		
		assertEquals(false, t.isFinite());
		
		verify(t).isFinite();
		
		verify(t).getX();

		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup2dR#isFinite()} returns false
	 * after checking the x component, if the x component is {@link Double#NaN}.
	 */
	@Test
	void isFinite_Fail_X_NaNTest()
	{
		Tup2dR t = mock(Tup2dR.class);
		
		when(t.isFinite()).thenCallRealMethod();
		
		when(t.getX()).thenReturn(Double.NaN);
		
		assertEquals(false, t.isFinite());
		
		verify(t).isFinite();
		
		verify(t).getX();

		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup2dR#isFinite()} returns false
	 * after checking the y component, if the y component is {@link Double#POSITIVE_INFINITY}.
	 */
	@Test
	void isFinite_Fail_Y_PositiveInfTest()
	{
		Tup2dR t = mock(Tup2dR.class);
		
		when(t.isFinite()).thenCallRealMethod();
		
		when(t.getX()).thenReturn(1.0);
		when(t.getY()).thenReturn(Double.POSITIVE_INFINITY);
		
		assertEquals(false, t.isFinite());
		
		verify(t).isFinite();
		
		verify(t).getX();
		verify(t).getY();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup2dR#isFinite()} returns false
	 * after checking the y component, if the y component is {@link Double#NEGATIVE_INFINITY}.
	 */
	@Test
	void isFinite_Fail_Y_NegativeInfTest()
	{
		Tup2dR t = mock(Tup2dR.class);
		
		when(t.isFinite()).thenCallRealMethod();
		
		when(t.getX()).thenReturn(1.0);
		when(t.getY()).thenReturn(Double.NEGATIVE_INFINITY);
		
		assertEquals(false, t.isFinite());
		
		verify(t).isFinite();
		
		verify(t).getX();
		verify(t).getY();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup2dR#isFinite()} returns false
	 * after checking the y component, if the y component is {@link Double#NaN}.
	 */
	@Test
	void isFinite_Fail_Y_NaNTest()
	{
		Tup2dR t = mock(Tup2dR.class);
		
		when(t.isFinite()).thenCallRealMethod();
		
		when(t.getX()).thenReturn(1.0);
		when(t.getY()).thenReturn(Double.NaN);
		
		assertEquals(false, t.isFinite());
		
		verify(t).isFinite();
		
		verify(t).getX();
		verify(t).getY();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * this test ensures, that the function {@link Tup2dR#getDimensions()} always
	 * returns 2 and does not make any calls.
	 */
	@Test
	void getDimensionsTest()
	{
		Tup2dR t = mock(Tup2dR.class);
		
		when(t.getDimensions()).thenCallRealMethod();
		
		assertEquals(2, t.getDimensions());
		
		verify(t).getDimensions();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup2dR#isExactlyZero()} returns true,
	 * if all of the components are exactly zero.
	 */
	@Test
	void isExactlyZero_ZeroTest()
	{
		Tup2dR t = mock(Tup2dR.class);
		
		when(t.isExactlyZero()).thenCallRealMethod();
		
		when(t.getX()).thenReturn(0.0);
		when(t.getY()).thenReturn(0.0);
		
		assertEquals(true, t.isExactlyZero());
		
		verify(t).isExactlyZero();
		
		verify(t).getX();
		verify(t).getY();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup2dR#isExactlyZero()} returns false,
	 * if the x component is not zero.
	 */
	@Test
	void isExactlyZero_Fail_XTest()
	{
		Tup2dR t = mock(Tup2dR.class);
		
		when(t.isExactlyZero()).thenCallRealMethod();
		
		when(t.getX()).thenReturn(1.0);
		
		assertEquals(false, t.isExactlyZero());
		
		verify(t).isExactlyZero();
		
		verify(t).getX();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup2dR#isExactlyZero()} returns false,
	 * if the y component is not zero.
	 */
	@Test
	void isExactlyZero_Fail_YTest()
	{
		Tup2dR t = mock(Tup2dR.class);
		
		when(t.isExactlyZero()).thenCallRealMethod();
		
		when(t.getX()).thenReturn(0.0);
		when(t.getY()).thenReturn(1.0);
		
		assertEquals(false, t.isExactlyZero());
		
		verify(t).isExactlyZero();
		
		verify(t).getX();
		verify(t).getY();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup2dR#isZero(double)} returns true,
	 * if all components are exactly zero.
	 */
	@Test
	void isZero_ZeroTest()
	{
		Tup2dR t = mock(Tup2dR.class);
		
		when(t.isZero(2.0)).thenCallRealMethod();
		
		when(t.getX()).thenReturn(0.0);
		when(t.getY()).thenReturn(0.0);
		
		assertEquals(true, t.isZero(2.0));
		
		verify(t).isZero(2.0);
		
		verify(t).getX();
		verify(t).getY();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup2dR#isZero(double)} returns true,
	 * if all components are at the positive extreme point that is the inclusive
	 * tolerance parameter.
	 */
	@Test
	void isZero_Extreme_PositiveTest()
	{
		Tup2dR t = mock(Tup2dR.class);
		
		when(t.isZero(2.0)).thenCallRealMethod();
		
		when(t.getX()).thenReturn(2.0);
		when(t.getY()).thenReturn(2.0);
		
		assertEquals(true, t.isZero(2.0));
		
		verify(t).isZero(2.0);
		
		verify(t).getX();
		verify(t).getY();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup2dR#isZero(double)} returns true,
	 * if all components are at the negative extreme point that is the inclusive
	 * tolerance parameter.
	 */
	@Test
	void isZero_Extreme_NegativeTest()
	{
		Tup2dR t = mock(Tup2dR.class);
		
		when(t.isZero(2.0)).thenCallRealMethod();
		
		when(t.getX()).thenReturn(-2.0);
		when(t.getY()).thenReturn(-2.0);
		
		assertEquals(true, t.isZero(2.0));
		
		verify(t).isZero(2.0);
		
		verify(t).getX();
		verify(t).getY();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup2dR#isZero(double)} returns false,
	 * if the x component exceeds the positive extreme point that is the inclusive
	 * tolerance parameter.
	 */
	@Test
	void isZero_Fail_X_PositiveTest()
	{
		Tup2dR t = mock(Tup2dR.class);
		
		when(t.isZero(2.0)).thenCallRealMethod();
		
		when(t.getX()).thenReturn(3.0);
		
		assertEquals(false, t.isZero(2.0));
		
		verify(t).isZero(2.0);
		
		verify(t).getX();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup2dR#isZero(double)} returns false,
	 * if the x component exceeds the negative extreme point that is the inclusive
	 * tolerance parameter.
	 */
	@Test
	void isZero_Fail_X_NegativeTest()
	{
		Tup2dR t = mock(Tup2dR.class);
		
		when(t.isZero(2.0)).thenCallRealMethod();
		
		when(t.getX()).thenReturn(-3.0);
		
		assertEquals(false, t.isZero(2.0));
		
		verify(t).isZero(2.0);
		
		verify(t).getX();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup2dR#isZero(double)} returns false,
	 * if the y component exceeds the positive extreme point that is the inclusive
	 * tolerance parameter.
	 */
	@Test
	void isZero_Fail_Y_PositiveTest()
	{
		Tup2dR t = mock(Tup2dR.class);
		
		when(t.isZero(2.0)).thenCallRealMethod();
		
		when(t.getX()).thenReturn(0.0);
		when(t.getY()).thenReturn(3.0);
		
		assertEquals(false, t.isZero(2.0));
		
		verify(t).isZero(2.0);
		
		verify(t).getX();
		verify(t).getY();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup2dR#isZero(double)} returns false,
	 * if the y component exceeds the positive extreme point that is the inclusive
	 * tolerance parameter.
	 */
	@Test
	void isZero_Fail_Y_NegativeTest()
	{
		Tup2dR t = mock(Tup2dR.class);
		
		when(t.isZero(2.0)).thenCallRealMethod();
		
		when(t.getX()).thenReturn(0.0);
		when(t.getY()).thenReturn(-3.0);
		
		assertEquals(false, t.isZero(2.0));
		
		verify(t).isZero(2.0);
		
		verify(t).getX();
		verify(t).getY();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup2dR#toArray(double[])} returns
	 * the given array with the components in the right order.
	 */
	@Test
	void toArray_ExtractParamTest()
	{
		Tup2dR t = mock(Tup2dR.class);
		
		double[] array = new double[2];
		
		when(t.toArray(array)).thenCallRealMethod();
		
		when(t.getX()).thenReturn(1.0);
		when(t.getY()).thenReturn(2.0);
		
		assertSame(array, t.toArray(array));
		assertArrayEquals(new double[] {1.0, 2.0}, array);
		
		verify(t).toArray(array);
		
		verify(t).getX();
		verify(t).getY();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup2dR#getByIndex(int)} returns
	 * the x component for the index 0.
	 */
	@Test
	void getByIndex_XTest()
	{
		Tup2dR t = mock(Tup2dR.class);
		
		when(t.getByIndex(0)).thenCallRealMethod();
		
		when(t.getX()).thenReturn(1.0);
		
		assertEquals(1.0, t.getByIndex(0));

		verify(t).getByIndex(0);
		
		verify(t).getX();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup2dR#getByIndex(int)} returns
	 * the y component for the index 1.
	 */
	@Test
	void getByIndex_YTest()
	{
		Tup2dR t = mock(Tup2dR.class);
		
		when(t.getByIndex(1)).thenCallRealMethod();
		
		when(t.getY()).thenReturn(1.0);
		
		assertEquals(1.0, t.getByIndex(1));

		verify(t).getByIndex(1);
		
		verify(t).getY();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup2dR#getByIndex(int)} throws
	 * an {@link IndexOutOfBoundsException} for an index different than 0 or 1.
	 */
	@Test
	void getByIndex_ExceptionTest()
	{
		Tup2dR t = mock(Tup2dR.class);
		
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
	
	/**
	 * This test ensures, that the function {@link Tup2dR#toBuffer(DoubleBuffer)}
	 * puts the components correctly in the buffer.
	 */
	@Test
	void toBufferTest()
	{
		Tup2dR t = mock(Tup2dR.class);
		
		DoubleBuffer buffer = mock(DoubleBuffer.class);
		
		when(t.toBuffer(buffer)).thenCallRealMethod();
		when(t.getX()).thenReturn(1.0);
		when(t.getY()).thenReturn(2.0);
		
		assertSame(buffer, t.toBuffer(buffer));
		
		verify(t).toBuffer(buffer);
		verify(t).getX();
		verify(buffer).put(1.0);
		verify(t).getY();
		verify(buffer).put(2.0);
		
		verifyNoMoreInteractions(t, buffer);
	}
}