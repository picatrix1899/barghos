package org.barghos.core.test.api.tuple4;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import org.barghos.core.api.tuple.TupfR;
import org.barghos.core.api.tuple4.Tup4fR;

/**
 * This class provides component tests for the interface {@link Tup4fR}.
 * 
 * @author picatrix1899
 */
class Tup4fRTest
{
	/**
	 * This test ensures, that the interface extends the interface {@link TupfR}.
	 */
	@Test
	void inheritance_TupfRTest()
	{
		assertTrue(TupfR.class.isAssignableFrom(Tup4fR.class));
	}
	
	/**
	 * This test ensures, that the function {@link Tup4fR#isFinite()} returns true,
	 * if none of the components is either {@link Float#POSITIVE_INFINITY},
	 * {@link Float#NEGATIVE_INFINITY}} or {@link Float#NaN}.
	 */
	@Test
	void isFiniteTest()
	{
		Tup4fR t = mock(Tup4fR.class);
		
		when(t.isFinite()).thenCallRealMethod();
		
		when(t.getX()).thenReturn(1.0f);
		when(t.getY()).thenReturn(1.0f);
		when(t.getZ()).thenReturn(1.0f);
		when(t.getW()).thenReturn(1.0f);
		
		assertEquals(true, t.isFinite());
		
		verify(t).isFinite();
		
		verify(t).getX();
		verify(t).getY();
		verify(t).getZ();
		verify(t).getW();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4fR#isFinite()} returns false
	 * after checking the x component, if the x component is {@link Float#POSITIVE_INFINITY}.
	 */
	@Test
	void isFinite_Fail_X_PositiveInfTest()
	{
		Tup4fR t = mock(Tup4fR.class);
		
		when(t.isFinite()).thenCallRealMethod();
		
		when(t.getX()).thenReturn(Float.POSITIVE_INFINITY);
		
		assertEquals(false, t.isFinite());
		
		verify(t).isFinite();
		
		verify(t).getX();

		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4fR#isFinite()} returns false
	 * after checking the x component, if the x component is {@link Float#NEGATIVE_INFINITY}.
	 */
	@Test
	void isFinite_Fail_X_NegativeInfTest()
	{
		Tup4fR t = mock(Tup4fR.class);
		
		when(t.isFinite()).thenCallRealMethod();
		
		when(t.getX()).thenReturn(Float.NEGATIVE_INFINITY);
		
		assertEquals(false, t.isFinite());
		
		verify(t).isFinite();
		
		verify(t).getX();

		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4fR#isFinite()} returns false
	 * after checking the x component, if the x component is {@link Float#NaN}.
	 */
	@Test
	void isFinite_Fail_X_NaNTest()
	{
		Tup4fR t = mock(Tup4fR.class);
		
		when(t.isFinite()).thenCallRealMethod();
		
		when(t.getX()).thenReturn(Float.NaN);
		
		assertEquals(false, t.isFinite());
		
		verify(t).isFinite();
		
		verify(t).getX();

		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4fR#isFinite()} returns false
	 * after checking the y component, if the y component is {@link Float#POSITIVE_INFINITY}.
	 */
	@Test
	void isFinite_Fail_Y_PositiveInfTest()
	{
		Tup4fR t = mock(Tup4fR.class);
		
		when(t.isFinite()).thenCallRealMethod();
		
		when(t.getX()).thenReturn(1.0f);
		when(t.getY()).thenReturn(Float.POSITIVE_INFINITY);
		
		assertEquals(false, t.isFinite());
		
		verify(t).isFinite();
		
		verify(t).getX();
		verify(t).getY();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4fR#isFinite()} returns false
	 * after checking the y component, if the y component is {@link Float#NEGATIVE_INFINITY}.
	 */
	@Test
	void isFinite_Fail_Y_NegativeInfTest()
	{
		Tup4fR t = mock(Tup4fR.class);
		
		when(t.isFinite()).thenCallRealMethod();
		
		when(t.getX()).thenReturn(1.0f);
		when(t.getY()).thenReturn(Float.NEGATIVE_INFINITY);
		
		assertEquals(false, t.isFinite());
		
		verify(t).isFinite();
		
		verify(t).getX();
		verify(t).getY();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4fR#isFinite()} returns false
	 * after checking the y component, if the y component is {@link Float#NaN}.
	 */
	@Test
	void isFinite_Fail_Y_NaNTest()
	{
		Tup4fR t = mock(Tup4fR.class);
		
		when(t.isFinite()).thenCallRealMethod();
		
		when(t.getX()).thenReturn(1.0f);
		when(t.getY()).thenReturn(Float.NaN);
		
		assertEquals(false, t.isFinite());
		
		verify(t).isFinite();
		
		verify(t).getX();
		verify(t).getY();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4fR#isFinite()} returns false
	 * after checking the z component, if the z component is {@link Float#POSITIVE_INFINITY}.
	 */
	@Test
	void isFinite_Fail_Z_PositiveInfTest()
	{
		Tup4fR t = mock(Tup4fR.class);
		
		when(t.isFinite()).thenCallRealMethod();
		
		when(t.getX()).thenReturn(1.0f);
		when(t.getY()).thenReturn(1.0f);
		when(t.getZ()).thenReturn(Float.POSITIVE_INFINITY);
		
		assertEquals(false, t.isFinite());
		
		verify(t).isFinite();
		
		verify(t).getX();
		verify(t).getY();
		verify(t).getZ();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4fR#isFinite()} returns false
	 * after checking the z component, if the z component is {@link Float#NEGATIVE_INFINITY}.
	 */
	@Test
	void isFinite_Fail_Z_NegativeInfTest()
	{
		Tup4fR t = mock(Tup4fR.class);
		
		when(t.isFinite()).thenCallRealMethod();
		
		when(t.getX()).thenReturn(1.0f);
		when(t.getY()).thenReturn(1.0f);
		when(t.getZ()).thenReturn(Float.NEGATIVE_INFINITY);
		
		assertEquals(false, t.isFinite());
		
		verify(t).isFinite();
		
		verify(t).getX();
		verify(t).getY();
		verify(t).getZ();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4fR#isFinite()} returns false
	 * after checking the z component, if the z component is {@link Float#NaN}.
	 */
	@Test
	void isFinite_Fail_Z_NaNTest()
	{
		Tup4fR t = mock(Tup4fR.class);
		
		when(t.isFinite()).thenCallRealMethod();
		
		when(t.getX()).thenReturn(1.0f);
		when(t.getY()).thenReturn(1.0f);
		when(t.getZ()).thenReturn(Float.NaN);
		
		assertEquals(false, t.isFinite());
		
		verify(t).isFinite();
		
		verify(t).getX();
		verify(t).getY();
		verify(t).getZ();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4fR#isFinite()} returns false
	 * after checking the w component, if the w component is {@link Float#POSITIVE_INFINITY}.
	 */
	@Test
	void isFinite_Fail_W_PositiveInfTest()
	{
		Tup4fR t = mock(Tup4fR.class);
		
		when(t.isFinite()).thenCallRealMethod();
		
		when(t.getX()).thenReturn(1.0f);
		when(t.getY()).thenReturn(1.0f);
		when(t.getZ()).thenReturn(1.0f);
		when(t.getW()).thenReturn(Float.POSITIVE_INFINITY);
		
		assertEquals(false, t.isFinite());
		
		verify(t).isFinite();
		
		verify(t).getX();
		verify(t).getY();
		verify(t).getZ();
		verify(t).getW();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4fR#isFinite()} returns false
	 * after checking the w component, if the w component is {@link Float#NEGATIVE_INFINITY}.
	 */
	@Test
	void isFinite_Fail_W_NegativeInfTest()
	{
		Tup4fR t = mock(Tup4fR.class);
		
		when(t.isFinite()).thenCallRealMethod();
		
		when(t.getX()).thenReturn(1.0f);
		when(t.getY()).thenReturn(1.0f);
		when(t.getZ()).thenReturn(1.0f);
		when(t.getW()).thenReturn(Float.NEGATIVE_INFINITY);
		
		assertEquals(false, t.isFinite());
		
		verify(t).isFinite();
		
		verify(t).getX();
		verify(t).getY();
		verify(t).getZ();
		verify(t).getW();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4fR#isFinite()} returns false
	 * after checking the w component, if the w component is {@link Float#NaN}.
	 */
	@Test
	void isFinite_Fail_W_NaNTest()
	{
		Tup4fR t = mock(Tup4fR.class);
		
		when(t.isFinite()).thenCallRealMethod();
		
		when(t.getX()).thenReturn(1.0f);
		when(t.getY()).thenReturn(1.0f);
		when(t.getZ()).thenReturn(1.0f);
		when(t.getW()).thenReturn(Float.NaN);
		
		assertEquals(false, t.isFinite());
		
		verify(t).isFinite();
		
		verify(t).getX();
		verify(t).getY();
		verify(t).getZ();
		verify(t).getW();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * this test ensures, that the function {@link Tup4fR#getDimensions()} always
	 * returns 4 and does not make any calls.
	 */
	@Test
	void getDimensionsTest()
	{
		Tup4fR t = mock(Tup4fR.class);
		
		when(t.getDimensions()).thenCallRealMethod();
		
		assertEquals(4, t.getDimensions());
		
		verify(t).getDimensions();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4fR#isZero()} returns true,
	 * if all of the components are exactly zero.
	 */
	@Test
	void isZero_ZeroTest()
	{
		Tup4fR t = mock(Tup4fR.class);
		
		when(t.isZero()).thenCallRealMethod();
		
		when(t.getX()).thenReturn(0.0f);
		when(t.getY()).thenReturn(0.0f);
		when(t.getZ()).thenReturn(0.0f);
		when(t.getW()).thenReturn(0.0f);
		
		assertEquals(true, t.isZero());
		
		verify(t).isZero();
		
		verify(t).getX();
		verify(t).getY();
		verify(t).getZ();
		verify(t).getW();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4fR#isZero()} returns false,
	 * if the x component is not zero.
	 */
	@Test
	void isZero_Fail_XTest()
	{
		Tup4fR t = mock(Tup4fR.class);
		
		when(t.isZero()).thenCallRealMethod();
		
		when(t.getX()).thenReturn(1.0f);
		
		assertEquals(false, t.isZero());
		
		verify(t).isZero();
		
		verify(t).getX();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4fR#isZero()} returns false,
	 * if the y component is not zero.
	 */
	@Test
	void isZero_Fail_YTest()
	{
		Tup4fR t = mock(Tup4fR.class);
		
		when(t.isZero()).thenCallRealMethod();
		
		when(t.getX()).thenReturn(0.0f);
		when(t.getY()).thenReturn(1.0f);
		
		assertEquals(false, t.isZero());
		
		verify(t).isZero();
		
		verify(t).getX();
		verify(t).getY();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4fR#isZero()} returns false,
	 * if the z component is not zero.
	 */
	@Test
	void isZero_Fail_ZTest()
	{
		Tup4fR t = mock(Tup4fR.class);
		
		when(t.isZero()).thenCallRealMethod();
		
		when(t.getX()).thenReturn(0.0f);
		when(t.getY()).thenReturn(0.0f);
		when(t.getZ()).thenReturn(1.0f);
		
		assertEquals(false, t.isZero());
		
		verify(t).isZero();
		
		verify(t).getX();
		verify(t).getY();
		verify(t).getZ();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4fR#isZero()} returns false,
	 * if the w component is not zero.
	 */
	@Test
	void isZero_Fail_WTest()
	{
		Tup4fR t = mock(Tup4fR.class);
		
		when(t.isZero()).thenCallRealMethod();
		
		when(t.getX()).thenReturn(0.0f);
		when(t.getY()).thenReturn(0.0f);
		when(t.getZ()).thenReturn(0.0f);
		when(t.getW()).thenReturn(1.0f);
		
		assertEquals(false, t.isZero());
		
		verify(t).isZero();
		
		verify(t).getX();
		verify(t).getY();
		verify(t).getZ();
		verify(t).getW();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4fR#isZeroWithMargin(float)} returns true,
	 * if all components are exactly zero.
	 */
	@Test
	void isZeroWithMargin_ZeroTest()
	{
		Tup4fR t = mock(Tup4fR.class);
		
		when(t.isZeroWithMargin(2.0f)).thenCallRealMethod();
		
		when(t.getX()).thenReturn(0.0f);
		when(t.getY()).thenReturn(0.0f);
		when(t.getZ()).thenReturn(0.0f);
		when(t.getW()).thenReturn(0.0f);
		
		assertEquals(true, t.isZeroWithMargin(2.0f));
		
		verify(t).isZeroWithMargin(2.0f);
		
		verify(t).getX();
		verify(t).getY();
		verify(t).getZ();
		verify(t).getW();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4fR#isZeroWithMargin(float)} returns true,
	 * if all components are at the positive extreme point that is the inclusive
	 * tolerance parameter.
	 */
	@Test
	void isZeroWithMargin_Extreme_PositiveTest()
	{
		Tup4fR t = mock(Tup4fR.class);
		
		when(t.isZeroWithMargin(2.0f)).thenCallRealMethod();
		
		when(t.getX()).thenReturn(2.0f);
		when(t.getY()).thenReturn(2.0f);
		when(t.getZ()).thenReturn(2.0f);
		when(t.getW()).thenReturn(2.0f);
		
		assertEquals(true, t.isZeroWithMargin(2.0f));
		
		verify(t).isZeroWithMargin(2.0f);
		
		verify(t).getX();
		verify(t).getY();
		verify(t).getZ();
		verify(t).getW();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup2bR#isZeroWithMargin(float)} returns true,
	 * if all components are at the negative extreme point that is the inclusive
	 * tolerance parameter.
	 */
	@Test
	void isZeroWithMargin_Extreme_NegativeTest()
	{
		Tup4fR t = mock(Tup4fR.class);
		
		when(t.isZeroWithMargin(2.0f)).thenCallRealMethod();
		
		when(t.getX()).thenReturn(-2.0f);
		when(t.getY()).thenReturn(-2.0f);
		when(t.getZ()).thenReturn(-2.0f);
		when(t.getW()).thenReturn(-2.0f);
		
		assertEquals(true, t.isZeroWithMargin(2.0f));
		
		verify(t).isZeroWithMargin(2.0f);
		
		verify(t).getX();
		verify(t).getY();
		verify(t).getZ();
		verify(t).getW();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4fR#isZeroWithMargin(float)} returns false,
	 * if the x component exceeds the positive extreme point that is the inclusive
	 * tolerance parameter.
	 */
	@Test
	void isZeroWithMargin_Fail_X_PositiveTest()
	{
		Tup4fR t = mock(Tup4fR.class);
		
		when(t.isZeroWithMargin(2.0f)).thenCallRealMethod();
		
		when(t.getX()).thenReturn(3.0f);
		
		assertEquals(false, t.isZeroWithMargin(2.0f));
		
		verify(t).isZeroWithMargin(2.0f);
		
		verify(t).getX();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4fR#isZeroWithMargin(float)} returns false,
	 * if the x component exceeds the negative extreme point that is the inclusive
	 * tolerance parameter.
	 */
	@Test
	void isZeroWithMargin_Fail_X_NegativeTest()
	{
		Tup4fR t = mock(Tup4fR.class);
		
		when(t.isZeroWithMargin(2.0f)).thenCallRealMethod();
		
		when(t.getX()).thenReturn(-3.0f);
		
		assertEquals(false, t.isZeroWithMargin(2.0f));
		
		verify(t).isZeroWithMargin(2.0f);
		
		verify(t).getX();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4fR#isZeroWithMargin(float)} returns false,
	 * if the y component exceeds the positive extreme point that is the inclusive
	 * tolerance parameter.
	 */
	@Test
	void isZeroWithMargin_Fail_Y_PositiveTest()
	{
		Tup4fR t = mock(Tup4fR.class);
		
		when(t.isZeroWithMargin(2.0f)).thenCallRealMethod();
		
		when(t.getX()).thenReturn(0.0f);
		when(t.getY()).thenReturn(3.0f);
		
		assertEquals(false, t.isZeroWithMargin(2.0f));
		
		verify(t).isZeroWithMargin(2.0f);
		
		verify(t).getX();
		verify(t).getY();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4fR#isZeroWithMargin(float)} returns false,
	 * if the y component exceeds the positive extreme point that is the inclusive
	 * tolerance parameter.
	 */
	@Test
	void isZeroWithMargin_Fail_Y_NegativeTest()
	{
		Tup4fR t = mock(Tup4fR.class);
		
		when(t.isZeroWithMargin(2.0f)).thenCallRealMethod();
		
		when(t.getX()).thenReturn(0.0f);
		when(t.getY()).thenReturn(-3.0f);
		
		assertEquals(false, t.isZeroWithMargin(2.0f));
		
		verify(t).isZeroWithMargin(2.0f);
		
		verify(t).getX();
		verify(t).getY();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4fR#isZeroWithMargin(float)} returns false,
	 * if the z component exceeds the positive extreme point that is the inclusive
	 * tolerance parameter.
	 */
	@Test
	void isZeroWithMargin_Fail_Z_PositiveTest()
	{
		Tup4fR t = mock(Tup4fR.class);
		
		when(t.isZeroWithMargin(2.0f)).thenCallRealMethod();
		
		when(t.getX()).thenReturn(0.0f);
		when(t.getY()).thenReturn(0.0f);
		when(t.getZ()).thenReturn(3.0f);
		
		assertEquals(false, t.isZeroWithMargin(2.0f));
		
		verify(t).isZeroWithMargin(2.0f);
		
		verify(t).getX();
		verify(t).getY();
		verify(t).getZ();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4fR#isZeroWithMargin(float)} returns false,
	 * if the z component exceeds the positive extreme point that is the inclusive
	 * tolerance parameter.
	 */
	@Test
	void isZeroWithMargin_Fail_Z_NegativeTest()
	{
		Tup4fR t = mock(Tup4fR.class);
		
		when(t.isZeroWithMargin(2.0f)).thenCallRealMethod();
		
		when(t.getX()).thenReturn(0.0f);
		when(t.getY()).thenReturn(0.0f);
		when(t.getZ()).thenReturn(-3.0f);
		
		assertEquals(false, t.isZeroWithMargin(2.0f));
		
		verify(t).isZeroWithMargin(2.0f);
		
		verify(t).getX();
		verify(t).getY();
		verify(t).getZ();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4fR#isZeroWithMargin(float)} returns false,
	 * if the w component exceeds the positive extreme point that is the inclusive
	 * tolerance parameter.
	 */
	@Test
	void isZeroWithMargin_Fail_W_PositiveTest()
	{
		Tup4fR t = mock(Tup4fR.class);
		
		when(t.isZeroWithMargin(2.0f)).thenCallRealMethod();
		
		when(t.getX()).thenReturn(0.0f);
		when(t.getY()).thenReturn(0.0f);
		when(t.getZ()).thenReturn(0.0f);
		when(t.getW()).thenReturn(3.0f);
		
		assertEquals(false, t.isZeroWithMargin(2.0f));
		
		verify(t).isZeroWithMargin(2.0f);
		
		verify(t).getX();
		verify(t).getY();
		verify(t).getZ();
		verify(t).getW();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4fR#isZeroWithMargin(float)} returns false,
	 * if the w component exceeds the positive extreme point that is the inclusive
	 * tolerance parameter.
	 */
	@Test
	void isZeroWithMargin_Fail_W_NegativeTest()
	{
		Tup4fR t = mock(Tup4fR.class);
		
		when(t.isZeroWithMargin(2.0f)).thenCallRealMethod();
		
		when(t.getX()).thenReturn(0.0f);
		when(t.getY()).thenReturn(0.0f);
		when(t.getZ()).thenReturn(0.0f);
		when(t.getW()).thenReturn(-3.0f);
		
		assertEquals(false, t.isZeroWithMargin(2.0f));
		
		verify(t).isZeroWithMargin(2.0f);
		
		verify(t).getX();
		verify(t).getY();
		verify(t).getZ();
		verify(t).getW();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4fR#getArray()} returns
	 * an array with the components in the right order.
	 */
	@Test
	void getArrayTest()
	{
		Tup4fR t = mock(Tup4fR.class);
		
		when(t.getArray()).thenCallRealMethod();
		
		when(t.getX()).thenReturn(1.0f);
		when(t.getY()).thenReturn(2.0f);
		when(t.getZ()).thenReturn(3.0f);
		when(t.getW()).thenReturn(4.0f);
		
		assertArrayEquals(new float[] {1.0f, 2.0f, 3.0f, 4.0f}, t.getArray());
		
		verify(t).getArray();
		
		verify(t).getX();
		verify(t).getY();
		verify(t).getZ();
		verify(t).getW();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4fR#getByIndex(int)} returns
	 * the x component for the index 0.
	 */
	@Test
	void getByIndex_XTest()
	{
		Tup4fR t = mock(Tup4fR.class);
		
		when(t.getByIndex(0)).thenCallRealMethod();
		
		when(t.getX()).thenReturn(1.0f);
		
		assertEquals(1.0f, t.getByIndex(0));

		verify(t).getByIndex(0);
		
		verify(t).getX();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4fR#getByIndex(int)} returns
	 * the y component for the index 1.
	 */
	@Test
	void getByIndex_YTest()
	{
		Tup4fR t = mock(Tup4fR.class);
		
		when(t.getByIndex(1)).thenCallRealMethod();
		
		when(t.getY()).thenReturn(1.0f);
		
		assertEquals(1.0f, t.getByIndex(1));

		verify(t).getByIndex(1);
		
		verify(t).getY();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4fR#getByIndex(int)} returns
	 * the z component for the index 2.
	 */
	@Test
	void getByIndex_ZTest()
	{
		Tup4fR t = mock(Tup4fR.class);
		
		when(t.getByIndex(2)).thenCallRealMethod();
		
		when(t.getZ()).thenReturn(1.0f);
		
		assertEquals(1.0f, t.getByIndex(2));

		verify(t).getByIndex(2);
		
		verify(t).getZ();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4fR#getByIndex(int)} returns
	 * the w component for the index 3.
	 */
	@Test
	void getByIndex_WTest()
	{
		Tup4fR t = mock(Tup4fR.class);
		
		when(t.getByIndex(3)).thenCallRealMethod();
		
		when(t.getW()).thenReturn(1.0f);
		
		assertEquals(1.0f, t.getByIndex(3));

		verify(t).getByIndex(3);
		
		verify(t).getW();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4fR#getByIndex(int)} throws
	 * an {@link IndexOutOfBoundsException} for an index different than 0, 1, 2 or 3.
	 */
	@Test
	void getByIndex_ExceptionTest()
	{
		Tup4fR t = mock(Tup4fR.class);
		
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