package org.barghos.core.test.api.tuple4;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import org.barghos.core.api.tuple.TupdR;
import org.barghos.core.api.tuple4.Tup4dR;

/**
 * This class provides component tests for the interface {@link Tup4dR}.
 * 
 * @author picatrix1899
 */
class Tup4dRTest
{
	/**
	 * This test ensures, that the interface extends the interface {@link TupdR}.
	 */
	@Test
	void inheritance_TupdRTest()
	{
		assertTrue(TupdR.class.isAssignableFrom(Tup4dR.class));
	}
	
	/**
	 * This test ensures, that the function {@link Tup4dR#isFinite()} returns true,
	 * if none of the components is either {@link Double#POSITIVE_INFINITY},
	 * {@link Double#NEGATIVE_INFINITY}} or {@link Double#NaN}.
	 */
	@Test
	void isFiniteTest()
	{
		Tup4dR t = mock(Tup4dR.class);
		
		when(t.isFinite()).thenCallRealMethod();
		
		when(t.getX()).thenReturn(1.0);
		when(t.getY()).thenReturn(1.0);
		when(t.getZ()).thenReturn(1.0);
		when(t.getW()).thenReturn(1.0);
		
		assertEquals(true, t.isFinite());
		
		verify(t).isFinite();
		
		verify(t).getX();
		verify(t).getY();
		verify(t).getZ();
		verify(t).getW();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4dR#isFinite()} returns false
	 * after checking the x component, if the x component is {@link Double#POSITIVE_INFINITY}.
	 */
	@Test
	void isFinite_Fail_X_PositiveInfTest()
	{
		Tup4dR t = mock(Tup4dR.class);
		
		when(t.isFinite()).thenCallRealMethod();
		
		when(t.getX()).thenReturn(Double.POSITIVE_INFINITY);
		
		assertEquals(false, t.isFinite());
		
		verify(t).isFinite();
		
		verify(t).getX();

		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4dR#isFinite()} returns false
	 * after checking the x component, if the x component is {@link Double#NEGATIVE_INFINITY}.
	 */
	@Test
	void isFinite_Fail_X_NegativeInfTest()
	{
		Tup4dR t = mock(Tup4dR.class);
		
		when(t.isFinite()).thenCallRealMethod();
		
		when(t.getX()).thenReturn(Double.NEGATIVE_INFINITY);
		
		assertEquals(false, t.isFinite());
		
		verify(t).isFinite();
		
		verify(t).getX();

		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4dR#isFinite()} returns false
	 * after checking the x component, if the x component is {@link Double#NaN}.
	 */
	@Test
	void isFinite_Fail_X_NaNTest()
	{
		Tup4dR t = mock(Tup4dR.class);
		
		when(t.isFinite()).thenCallRealMethod();
		
		when(t.getX()).thenReturn(Double.NaN);
		
		assertEquals(false, t.isFinite());
		
		verify(t).isFinite();
		
		verify(t).getX();

		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4dR#isFinite()} returns false
	 * after checking the y component, if the y component is {@link Double#POSITIVE_INFINITY}.
	 */
	@Test
	void isFinite_Fail_Y_PositiveInfTest()
	{
		Tup4dR t = mock(Tup4dR.class);
		
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
	 * This test ensures, that the function {@link Tup4dR#isFinite()} returns false
	 * after checking the y component, if the y component is {@link Double#NEGATIVE_INFINITY}.
	 */
	@Test
	void isFinite_Fail_Y_NegativeInfTest()
	{
		Tup4dR t = mock(Tup4dR.class);
		
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
	 * This test ensures, that the function {@link Tup4dR#isFinite()} returns false
	 * after checking the y component, if the y component is {@link Double#NaN}.
	 */
	@Test
	void isFinite_Fail_Y_NaNTest()
	{
		Tup4dR t = mock(Tup4dR.class);
		
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
	 * This test ensures, that the function {@link Tup4dR#isFinite()} returns false
	 * after checking the z component, if the z component is {@link Double#POSITIVE_INFINITY}.
	 */
	@Test
	void isFinite_Fail_Z_PositiveInfTest()
	{
		Tup4dR t = mock(Tup4dR.class);
		
		when(t.isFinite()).thenCallRealMethod();
		
		when(t.getX()).thenReturn(1.0);
		when(t.getY()).thenReturn(1.0);
		when(t.getZ()).thenReturn(Double.POSITIVE_INFINITY);
		
		assertEquals(false, t.isFinite());
		
		verify(t).isFinite();
		
		verify(t).getX();
		verify(t).getY();
		verify(t).getZ();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4dR#isFinite()} returns false
	 * after checking the z component, if the z component is {@link Double#NEGATIVE_INFINITY}.
	 */
	@Test
	void isFinite_Fail_Z_NegativeInfTest()
	{
		Tup4dR t = mock(Tup4dR.class);
		
		when(t.isFinite()).thenCallRealMethod();
		
		when(t.getX()).thenReturn(1.0);
		when(t.getY()).thenReturn(1.0);
		when(t.getZ()).thenReturn(Double.NEGATIVE_INFINITY);
		
		assertEquals(false, t.isFinite());
		
		verify(t).isFinite();
		
		verify(t).getX();
		verify(t).getY();
		verify(t).getZ();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4dR#isFinite()} returns false
	 * after checking the z component, if the z component is {@link Double#NaN}.
	 */
	@Test
	void isFinite_Fail_Z_NaNTest()
	{
		Tup4dR t = mock(Tup4dR.class);
		
		when(t.isFinite()).thenCallRealMethod();
		
		when(t.getX()).thenReturn(1.0);
		when(t.getY()).thenReturn(1.0);
		when(t.getZ()).thenReturn(Double.NaN);
		
		assertEquals(false, t.isFinite());
		
		verify(t).isFinite();
		
		verify(t).getX();
		verify(t).getY();
		verify(t).getZ();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4dR#isFinite()} returns false
	 * after checking the w component, if the w component is {@link Double#POSITIVE_INFINITY}.
	 */
	@Test
	void isFinite_Fail_W_PositiveInfTest()
	{
		Tup4dR t = mock(Tup4dR.class);
		
		when(t.isFinite()).thenCallRealMethod();
		
		when(t.getX()).thenReturn(1.0);
		when(t.getY()).thenReturn(1.0);
		when(t.getZ()).thenReturn(1.0);
		when(t.getW()).thenReturn(Double.POSITIVE_INFINITY);
		
		assertEquals(false, t.isFinite());
		
		verify(t).isFinite();
		
		verify(t).getX();
		verify(t).getY();
		verify(t).getZ();
		verify(t).getW();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4dR#isFinite()} returns false
	 * after checking the w component, if the w component is {@link Double#NEGATIVE_INFINITY}.
	 */
	@Test
	void isFinite_Fail_W_NegativeInfTest()
	{
		Tup4dR t = mock(Tup4dR.class);
		
		when(t.isFinite()).thenCallRealMethod();
		
		when(t.getX()).thenReturn(1.0);
		when(t.getY()).thenReturn(1.0);
		when(t.getZ()).thenReturn(1.0);
		when(t.getW()).thenReturn(Double.NEGATIVE_INFINITY);
		
		assertEquals(false, t.isFinite());
		
		verify(t).isFinite();
		
		verify(t).getX();
		verify(t).getY();
		verify(t).getZ();
		verify(t).getW();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4dR#isFinite()} returns false
	 * after checking the z component, if the w component is {@link Double#NaN}.
	 */
	@Test
	void isFinite_Fail_W_NaNTest()
	{
		Tup4dR t = mock(Tup4dR.class);
		
		when(t.isFinite()).thenCallRealMethod();
		
		when(t.getX()).thenReturn(1.0);
		when(t.getY()).thenReturn(1.0);
		when(t.getZ()).thenReturn(1.0);
		when(t.getW()).thenReturn(Double.NaN);
		
		assertEquals(false, t.isFinite());
		
		verify(t).isFinite();
		
		verify(t).getX();
		verify(t).getY();
		verify(t).getZ();
		verify(t).getW();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * this test ensures, that the function {@link Tup4dR#getDimensions()} always
	 * returns 4 and does not make any calls.
	 */
	@Test
	void getDimensionsTest()
	{
		Tup4dR t = mock(Tup4dR.class);
		
		when(t.getDimensions()).thenCallRealMethod();
		
		assertEquals(4, t.getDimensions());
		
		verify(t).getDimensions();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4dR#isZero()} returns true,
	 * if all of the components are exactly zero.
	 */
	@Test
	void isZero_ZeroTest()
	{
		Tup4dR t = mock(Tup4dR.class);
		
		when(t.isZero()).thenCallRealMethod();
		
		when(t.getX()).thenReturn(0.0);
		when(t.getY()).thenReturn(0.0);
		when(t.getZ()).thenReturn(0.0);
		when(t.getW()).thenReturn(0.0);
		
		assertEquals(true, t.isZero());
		
		verify(t).isZero();
		
		verify(t).getX();
		verify(t).getY();
		verify(t).getZ();
		verify(t).getW();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4dR#isZero()} returns false,
	 * if the x component is not zero.
	 */
	@Test
	void isZero_Fail_XTest()
	{
		Tup4dR t = mock(Tup4dR.class);
		
		when(t.isZero()).thenCallRealMethod();
		
		when(t.getX()).thenReturn(1.0);
		
		assertEquals(false, t.isZero());
		
		verify(t).isZero();
		
		verify(t).getX();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4dR#isZero()} returns false,
	 * if the y component is not zero.
	 */
	@Test
	void isZero_Fail_YTest()
	{
		Tup4dR t = mock(Tup4dR.class);
		
		when(t.isZero()).thenCallRealMethod();
		
		when(t.getX()).thenReturn(0.0);
		when(t.getY()).thenReturn(1.0);
		
		assertEquals(false, t.isZero());
		
		verify(t).isZero();
		
		verify(t).getX();
		verify(t).getY();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4dR#isZero()} returns false,
	 * if the z component is not zero.
	 */
	@Test
	void isZero_Fail_ZTest()
	{
		Tup4dR t = mock(Tup4dR.class);
		
		when(t.isZero()).thenCallRealMethod();
		
		when(t.getX()).thenReturn(0.0);
		when(t.getY()).thenReturn(0.0);
		when(t.getZ()).thenReturn(1.0);
		
		assertEquals(false, t.isZero());
		
		verify(t).isZero();
		
		verify(t).getX();
		verify(t).getY();
		verify(t).getZ();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4dR#isZero()} returns false,
	 * if the w component is not zero.
	 */
	@Test
	void isZero_Fail_WTest()
	{
		Tup4dR t = mock(Tup4dR.class);
		
		when(t.isZero()).thenCallRealMethod();
		
		when(t.getX()).thenReturn(0.0);
		when(t.getY()).thenReturn(0.0);
		when(t.getZ()).thenReturn(0.0);
		when(t.getW()).thenReturn(1.0);
		
		assertEquals(false, t.isZero());
		
		verify(t).isZero();
		
		verify(t).getX();
		verify(t).getY();
		verify(t).getZ();
		verify(t).getW();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4dR#isZeroWithMargin(double)} returns true,
	 * if all components are exactly zero.
	 */
	@Test
	void isZeroWithMargin_ZeroTest()
	{
		Tup4dR t = mock(Tup4dR.class);
		
		when(t.isZeroWithMargin(2.0)).thenCallRealMethod();
		
		when(t.getX()).thenReturn(0.0);
		when(t.getY()).thenReturn(0.0);
		when(t.getZ()).thenReturn(0.0);
		when(t.getW()).thenReturn(0.0);
		
		assertEquals(true, t.isZeroWithMargin(2.0));
		
		verify(t).isZeroWithMargin(2.0);
		
		verify(t).getX();
		verify(t).getY();
		verify(t).getZ();
		verify(t).getW();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4dR#isZeroWithMargin(double)} returns true,
	 * if all components are at the positive extreme point that is the inclusive
	 * tolerance parameter.
	 */
	@Test
	void isZeroWithMargin_Extreme_PositiveTest()
	{
		Tup4dR t = mock(Tup4dR.class);
		
		when(t.isZeroWithMargin(2.0)).thenCallRealMethod();
		
		when(t.getX()).thenReturn(2.0);
		when(t.getY()).thenReturn(2.0);
		when(t.getZ()).thenReturn(2.0);
		when(t.getW()).thenReturn(2.0);
		
		assertEquals(true, t.isZeroWithMargin(2.0));
		
		verify(t).isZeroWithMargin(2.0);
		
		verify(t).getX();
		verify(t).getY();
		verify(t).getZ();
		verify(t).getW();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup2bR#isZeroWithMargin(double)} returns true,
	 * if all components are at the negative extreme point that is the inclusive
	 * tolerance parameter.
	 */
	@Test
	void isZeroWithMargin_Extreme_NegativeTest()
	{
		Tup4dR t = mock(Tup4dR.class);
		
		when(t.isZeroWithMargin(2.0)).thenCallRealMethod();
		
		when(t.getX()).thenReturn(-2.0);
		when(t.getY()).thenReturn(-2.0);
		when(t.getZ()).thenReturn(-2.0);
		when(t.getW()).thenReturn(-2.0);
		
		assertEquals(true, t.isZeroWithMargin(2.0));
		
		verify(t).isZeroWithMargin(2.0);
		
		verify(t).getX();
		verify(t).getY();
		verify(t).getZ();
		verify(t).getW();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4dR#isZeroWithMargin(double)} returns false,
	 * if the x component exceeds the positive extreme point that is the inclusive
	 * tolerance parameter.
	 */
	@Test
	void isZeroWithMargin_Fail_X_PositiveTest()
	{
		Tup4dR t = mock(Tup4dR.class);
		
		when(t.isZeroWithMargin(2.0)).thenCallRealMethod();
		
		when(t.getX()).thenReturn(3.0);
		
		assertEquals(false, t.isZeroWithMargin(2.0));
		
		verify(t).isZeroWithMargin(2.0);
		
		verify(t).getX();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4dR#isZeroWithMargin(double)} returns false,
	 * if the x component exceeds the negative extreme point that is the inclusive
	 * tolerance parameter.
	 */
	@Test
	void isZeroWithMargin_Fail_X_NegativeTest()
	{
		Tup4dR t = mock(Tup4dR.class);
		
		when(t.isZeroWithMargin(2.0)).thenCallRealMethod();
		
		when(t.getX()).thenReturn(-3.0);
		
		assertEquals(false, t.isZeroWithMargin(2.0));
		
		verify(t).isZeroWithMargin(2.0);
		
		verify(t).getX();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4dR#isZeroWithMargin(double)} returns false,
	 * if the y component exceeds the positive extreme point that is the inclusive
	 * tolerance parameter.
	 */
	@Test
	void isZeroWithMargin_Fail_Y_PositiveTest()
	{
		Tup4dR t = mock(Tup4dR.class);
		
		when(t.isZeroWithMargin(2.0)).thenCallRealMethod();
		
		when(t.getX()).thenReturn(0.0);
		when(t.getY()).thenReturn(3.0);
		
		assertEquals(false, t.isZeroWithMargin(2.0));
		
		verify(t).isZeroWithMargin(2.0);
		
		verify(t).getX();
		verify(t).getY();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4dR#isZeroWithMargin(double)} returns false,
	 * if the y component exceeds the positive extreme point that is the inclusive
	 * tolerance parameter.
	 */
	@Test
	void isZeroWithMargin_Fail_Y_NegativeTest()
	{
		Tup4dR t = mock(Tup4dR.class);
		
		when(t.isZeroWithMargin(2.0)).thenCallRealMethod();
		
		when(t.getX()).thenReturn(0.0);
		when(t.getY()).thenReturn(-3.0);
		
		assertEquals(false, t.isZeroWithMargin(2.0));
		
		verify(t).isZeroWithMargin(2.0);
		
		verify(t).getX();
		verify(t).getY();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4dR#isZeroWithMargin(double)} returns false,
	 * if the z component exceeds the positive extreme point that is the inclusive
	 * tolerance parameter.
	 */
	@Test
	void isZeroWithMargin_Fail_Z_PositiveTest()
	{
		Tup4dR t = mock(Tup4dR.class);
		
		when(t.isZeroWithMargin(2.0)).thenCallRealMethod();
		
		when(t.getX()).thenReturn(0.0);
		when(t.getY()).thenReturn(0.0);
		when(t.getZ()).thenReturn(3.0);
		
		assertEquals(false, t.isZeroWithMargin(2.0));
		
		verify(t).isZeroWithMargin(2.0);
		
		verify(t).getX();
		verify(t).getY();
		verify(t).getZ();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4dR#isZeroWithMargin(double)} returns false,
	 * if the z component exceeds the positive extreme point that is the inclusive
	 * tolerance parameter.
	 */
	@Test
	void isZeroWithMargin_Fail_Z_NegativeTest()
	{
		Tup4dR t = mock(Tup4dR.class);
		
		when(t.isZeroWithMargin(2.0)).thenCallRealMethod();
		
		when(t.getX()).thenReturn(0.0);
		when(t.getY()).thenReturn(0.0);
		when(t.getZ()).thenReturn(-3.0);
		
		assertEquals(false, t.isZeroWithMargin(2.0));
		
		verify(t).isZeroWithMargin(2.0);
		
		verify(t).getX();
		verify(t).getY();
		verify(t).getZ();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4dR#isZeroWithMargin(double)} returns false,
	 * if the w component exceeds the positive extreme point that is the inclusive
	 * tolerance parameter.
	 */
	@Test
	void isZeroWithMargin_Fail_W_PositiveTest()
	{
		Tup4dR t = mock(Tup4dR.class);
		
		when(t.isZeroWithMargin(2.0)).thenCallRealMethod();
		
		when(t.getX()).thenReturn(0.0);
		when(t.getY()).thenReturn(0.0);
		when(t.getZ()).thenReturn(0.0);
		when(t.getW()).thenReturn(3.0);
		
		assertEquals(false, t.isZeroWithMargin(2.0));
		
		verify(t).isZeroWithMargin(2.0);
		
		verify(t).getX();
		verify(t).getY();
		verify(t).getZ();
		verify(t).getW();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4dR#isZeroWithMargin(double)} returns false,
	 * if the w component exceeds the positive extreme point that is the inclusive
	 * tolerance parameter.
	 */
	@Test
	void isZeroWithMargin_Fail_W_NegativeTest()
	{
		Tup4dR t = mock(Tup4dR.class);
		
		when(t.isZeroWithMargin(2.0)).thenCallRealMethod();
		
		when(t.getX()).thenReturn(0.0);
		when(t.getY()).thenReturn(0.0);
		when(t.getZ()).thenReturn(0.0);
		when(t.getW()).thenReturn(-3.0);
		
		assertEquals(false, t.isZeroWithMargin(2.0));
		
		verify(t).isZeroWithMargin(2.0);
		
		verify(t).getX();
		verify(t).getY();
		verify(t).getZ();
		verify(t).getW();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the default implementation of the function {@link Tup4dR#getNewInstance(Tup4dR)} calls
	 * the function {@link Tup4dR#getNewInstance(double, double, double, double)} with the correct components.
	 */
	@Test
	void getNewInstance_Tuple2Test()
	{
		Tup4dR original = mock(Tup4dR.class);
		Tup4dR newInstance = mock(Tup4dR.class);
		Tup4dR t = mock(Tup4dR.class);
		
		when(t.getNewInstance(original)).thenCallRealMethod();
		
		when(original.getX()).thenReturn(1.0);
		when(original.getY()).thenReturn(2.0);
		when(original.getZ()).thenReturn(3.0);
		when(original.getW()).thenReturn(4.0);
		when(t.getNewInstance(1.0, 2.0, 3.0, 4.0)).thenReturn(newInstance);
		
		assertSame(newInstance, t.getNewInstance(original));
		
		verify(t).getNewInstance(original);
		
		verify(original).getX();
		verify(original).getY();
		verify(original).getZ();
		verify(original).getW();
		verify(t).getNewInstance(1.0, 2.0, 3.0, 4.0);
		
		verifyNoMoreInteractions(t, original);
	}
	
	/**
	 * This test ensures, that the default implementation of the function {@link Tup4dR#getNewInstance(double)} calls
	 * the function {@link Tup4dR#getNewInstance(double, double, double, double)} with the correct components.
	 */
	@Test
	void getNewInstance_ValueTest()
	{
		Tup4dR newInstance = mock(Tup4dR.class);
		Tup4dR t = mock(Tup4dR.class);
		
		when(t.getNewInstance(1.0)).thenCallRealMethod();

		when(t.getNewInstance(1.0, 1.0, 1.0, 1.0)).thenReturn(newInstance);
		
		assertSame(newInstance, t.getNewInstance(1.0));
		
		verify(t).getNewInstance(1.0);
		
		verify(t).getNewInstance(1.0, 1.0, 1.0, 1.0);
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the default implementation of the function {@link Tup4dR#getNewInstance(TupdR)} calls
	 * the function {@link Tup4dR#getNewInstance(double, double, double, double)} with the correct components.
	 */
	@Test
	void getNewInstance_TupleTest()
	{
		TupdR original = mock(TupdR.class);
		Tup4dR newInstance = mock(Tup4dR.class);
		Tup4dR t = mock(Tup4dR.class);
		
		when(t.getNewInstance(original)).thenCallRealMethod();
		
		when(original.getArray()).thenReturn(new double[] {1.0, 2.0, 3.0, 4.0});
		when(t.getNewInstance(1.0, 2.0, 3.0, 4.0)).thenReturn(newInstance);
		
		assertSame(newInstance, t.getNewInstance(original));
		
		verify(t).getNewInstance(original);
		
		verify(original).getArray();
		verify(t).getNewInstance(1.0, 2.0, 3.0, 4.0);
		
		verifyNoMoreInteractions(t, original);
	}
	
	/**
	 * This test ensures, that the default implementation of the function {@link Tup4dR#getNewInstanceFromArray(double[])} calls
	 * the function {@link Tup4dR#getNewInstance(double, double, double, double)} with the correct components.
	 */
	@Test
	void getNewInstanceFromArrayTest()
	{
		Tup4dR newInstance = mock(Tup4dR.class);
		Tup4dR t = mock(Tup4dR.class);
		
		when(t.getNewInstanceFromArray(new double[] {1.0, 2.0, 3.0, 4.0})).thenCallRealMethod();

		when(t.getNewInstance(1.0, 2.0, 3.0, 4.0)).thenReturn(newInstance);
		
		assertSame(newInstance, t.getNewInstanceFromArray(new double[] {1.0, 2.0, 3.0, 4.0}));
		
		verify(t).getNewInstanceFromArray(new double[] {1.0, 2.0, 3.0, 4.0});
		
		verify(t).getNewInstance(1.0, 2.0, 3.0, 4.0);
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4dR#getArray()} returns
	 * an array with the components in the right order.
	 */
	@Test
	void getArrayTest()
	{
		Tup4dR t = mock(Tup4dR.class);
		
		when(t.getArray()).thenCallRealMethod();
		
		when(t.getX()).thenReturn(1.0);
		when(t.getY()).thenReturn(2.0);
		when(t.getZ()).thenReturn(3.0);
		when(t.getW()).thenReturn(4.0);
		
		assertArrayEquals(new double[] {1.0, 2.0, 3.0, 4.0}, t.getArray());
		
		verify(t).getArray();
		
		verify(t).getX();
		verify(t).getY();
		verify(t).getZ();
		verify(t).getW();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4dR#getByIndex(int)} returns
	 * the x component for the index 0.
	 */
	@Test
	void getByIndex_XTest()
	{
		Tup4dR t = mock(Tup4dR.class);
		
		when(t.getByIndex(0)).thenCallRealMethod();
		
		when(t.getX()).thenReturn(1.0);
		
		assertEquals(1.0, t.getByIndex(0));

		verify(t).getByIndex(0);
		
		verify(t).getX();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4dR#getByIndex(int)} returns
	 * the y component for the index 1.
	 */
	@Test
	void getByIndex_YTest()
	{
		Tup4dR t = mock(Tup4dR.class);
		
		when(t.getByIndex(1)).thenCallRealMethod();
		
		when(t.getY()).thenReturn(1.0);
		
		assertEquals(1.0, t.getByIndex(1));

		verify(t).getByIndex(1);
		
		verify(t).getY();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4dR#getByIndex(int)} returns
	 * the z component for the index 2.
	 */
	@Test
	void getByIndex_ZTest()
	{
		Tup4dR t = mock(Tup4dR.class);
		
		when(t.getByIndex(2)).thenCallRealMethod();
		
		when(t.getZ()).thenReturn(1.0);
		
		assertEquals(1.0, t.getByIndex(2));

		verify(t).getByIndex(2);
		
		verify(t).getZ();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4dR#getByIndex(int)} returns
	 * the w component for the index 3.
	 */
	@Test
	void getByIndex_WTest()
	{
		Tup4dR t = mock(Tup4dR.class);
		
		when(t.getByIndex(3)).thenCallRealMethod();
		
		when(t.getW()).thenReturn(1.0);
		
		assertEquals(1.0, t.getByIndex(3));

		verify(t).getByIndex(3);
		
		verify(t).getW();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4dR#getByIndex(int)} throws
	 * an {@link IndexOutOfBoundsException} for an index different than 0, 1, 2 or 3.
	 */
	@Test
	void getByIndex_ExceptionTest()
	{
		Tup4dR t = mock(Tup4dR.class);
		
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