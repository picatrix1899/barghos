package org.barghos.tuple.api.test.t4;

import static org.junit.jupiter.api.Assertions.*;

import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import org.barghos.tuple.api.t4.Tup4bigdC;
import org.barghos.tuple.api.t4.Tup4bigdR;
import org.barghos.tuple.api.tn.TupbigdC;
import org.barghos.tuple.api.tn.TupbigdR;

/**
 * This class provides comoponent tests for the interface {@link Tup4bigdC}.
 * 
 * @author picatrix1899
 */
class Tup4bigdCTest
{

	/**
	 * This test ensures, that the interface extends the interface
	 * {@link Tup4bigdR}.
	 */
	@Test
	void inheritance_Tup4RTest()
	{
		assertTrue(Tup4bigdR.class.isAssignableFrom(Tup4bigdC.class));
	}

	/**
	 * This test ensures, that the interface extends the interface
	 * {@link TupbigdC}.
	 */
	@Test
	void inheritance_TupCTest()
	{
		assertTrue(TupbigdC.class.isAssignableFrom(Tup4bigdC.class));
	}

	/**
	 * This test ensures, that the function {@link Tup4bigdC#set(Tup4bigdR)} adopts
	 * the values from the input tuple and returns the current instance.
	 */
	@Test
	void set_Tuple4Test()
	{
		Tup4bigdC t = mock(Tup4bigdC.class);
		Tup4bigdR t2 = mock(Tup4bigdR.class);

		when(t.set(t2)).thenCallRealMethod();

		when(t2.getX()).thenReturn(BigDecimal.valueOf(1.0));
		when(t2.getY()).thenReturn(BigDecimal.valueOf(2.0));
		when(t2.getZ()).thenReturn(BigDecimal.valueOf(3.0));
		when(t2.getW()).thenReturn(BigDecimal.valueOf(4.0));
		when(t.set(BigDecimal.valueOf(1.0), BigDecimal.valueOf(2.0), BigDecimal.valueOf(3.0), BigDecimal.valueOf(4.0))).thenReturn(t);

		assertSame(t, t.set(t2));

		verify(t).set(t2);

		verify(t2).getX();
		verify(t2).getY();
		verify(t2).getZ();
		verify(t2).getW();
		verify(t).set(BigDecimal.valueOf(1.0), BigDecimal.valueOf(2.0), BigDecimal.valueOf(3.0), BigDecimal.valueOf(4.0));

		verifyNoMoreInteractions(t, t2);
	}

	/**
	 * This test ensures, that the function {@link Tup4bigdC#set(BigDecimal)} adopts the
	 * value for each component and returns the current instance.
	 */
	@Test
	void set_ValueTest()
	{
		Tup4bigdC t = mock(Tup4bigdC.class);

		when(t.set(BigDecimal.valueOf(1.0))).thenCallRealMethod();

		when(t.set(BigDecimal.valueOf(1.0), BigDecimal.valueOf(1.0), BigDecimal.valueOf(1.0), BigDecimal.valueOf(1.0))).thenReturn(t);

		assertSame(t, t.set(BigDecimal.valueOf(1.0)));

		verify(t).set(BigDecimal.valueOf(1.0));

		verify(t).set(BigDecimal.valueOf(1.0), BigDecimal.valueOf(1.0), BigDecimal.valueOf(1.0), BigDecimal.valueOf(1.0));

		verifyNoMoreInteractions(t);
	}

	/**
	 * This test ensures, that the function
	 * {@link Tup4bigdC#set(BigDecimal, BigDecimal, BigDecimal, BigDecimal)} adopts the values and
	 * returns the current instance.
	 */
	@Test
	void setTest()
	{
		Tup4bigdC t = mock(Tup4bigdC.class);

		when(t.set(BigDecimal.valueOf(1.0), BigDecimal.valueOf(2.0), BigDecimal.valueOf(3.0), BigDecimal.valueOf(4.0))).thenCallRealMethod();

		when(t.setX(BigDecimal.valueOf(1.0))).thenReturn(t);
		when(t.setY(BigDecimal.valueOf(2.0))).thenReturn(t);
		when(t.setZ(BigDecimal.valueOf(3.0))).thenReturn(t);
		when(t.setW(BigDecimal.valueOf(4.0))).thenReturn(t);

		assertSame(t, t.set(BigDecimal.valueOf(1.0), BigDecimal.valueOf(2.0), BigDecimal.valueOf(3.0), BigDecimal.valueOf(4.0)));

		verify(t).set(BigDecimal.valueOf(1.0), BigDecimal.valueOf(2.0), BigDecimal.valueOf(3.0), BigDecimal.valueOf(4.0));

		verify(t).setX(BigDecimal.valueOf(1.0));
		verify(t).setY(BigDecimal.valueOf(2.0));
		verify(t).setZ(BigDecimal.valueOf(3.0));
		verify(t).setW(BigDecimal.valueOf(4.0));

		verifyNoMoreInteractions(t);
	}

	/**
	 * This test ensures, that the function {@link Tup4bigdC#set(TupbigdR)} adopts the
	 * values from the input tuple and returns the current instance.
	 */
	@Test
	void set_TupleTest()
	{
		Tup4bigdC t = mock(Tup4bigdC.class);
		TupbigdR t2 = mock(TupbigdR.class);

		when(t.set(t2)).thenCallRealMethod();

		when(t2.toArray()).thenReturn(new BigDecimal[] {BigDecimal.valueOf(1.0), BigDecimal.valueOf(2.0), BigDecimal.valueOf(3.0), BigDecimal.valueOf(4.0)});
		when(t.setArray(new BigDecimal[] {BigDecimal.valueOf(1.0), BigDecimal.valueOf(2.0), BigDecimal.valueOf(3.0), BigDecimal.valueOf(4.0)})).thenReturn(t);

		assertSame(t, t.set(t2));

		verify(t).set(t2);

		verify(t2).toArray();
		verify(t).setArray(new BigDecimal[] {BigDecimal.valueOf(1.0), BigDecimal.valueOf(2.0), BigDecimal.valueOf(3.0), BigDecimal.valueOf(4.0)});

		verifyNoMoreInteractions(t);
	}

	/**
	 * This test ensures, that the function
	 * {@link Tup4bigdC#setByIndex(int, BigDecimal)} adopts the value to the x component
	 * if the index is 0 and returns the current instance.
	 */
	@Test
	void setByIndex_XTest()
	{
		Tup4bigdC t = mock(Tup4bigdC.class);

		when(t.setByIndex(0, BigDecimal.valueOf(1.0))).thenCallRealMethod();

		when(t.setX(BigDecimal.valueOf(1.0))).thenReturn(t);

		assertSame(t, t.setByIndex(0, BigDecimal.valueOf(1.0)));

		verify(t).setByIndex(0, BigDecimal.valueOf(1.0));

		verify(t).setX(BigDecimal.valueOf(1.0));

		verifyNoMoreInteractions(t);
	}

	/**
	 * This test ensures, that the function
	 * {@link Tup4bigdC#setByIndex(int, BigDecimal)} adopts the value to the y component
	 * if the index is 1 and returns the current instance.
	 */
	@Test
	void setByIndex_YTest()
	{
		Tup4bigdC t = mock(Tup4bigdC.class);

		when(t.setByIndex(1, BigDecimal.valueOf(1.0))).thenCallRealMethod();

		when(t.setY(BigDecimal.valueOf(1.0))).thenReturn(t);

		assertSame(t, t.setByIndex(1, BigDecimal.valueOf(1.0)));

		verify(t).setByIndex(1, BigDecimal.valueOf(1.0));

		verify(t).setY(BigDecimal.valueOf(1.0));

		verifyNoMoreInteractions(t);
	}

	/**
	 * This test ensures, that the function
	 * {@link Tup4bigdC#setByIndex(int, BigDecimal)} adopts the value to the z component
	 * if the index is 2 and returns the current instance.
	 */
	@Test
	void setByIndex_ZTest()
	{
		Tup4bigdC t = mock(Tup4bigdC.class);

		when(t.setByIndex(2, BigDecimal.valueOf(1.0))).thenCallRealMethod();

		when(t.setZ(BigDecimal.valueOf(1.0))).thenReturn(t);

		assertSame(t, t.setByIndex(2, BigDecimal.valueOf(1.0)));

		verify(t).setByIndex(2, BigDecimal.valueOf(1.0));

		verify(t).setZ(BigDecimal.valueOf(1.0));

		verifyNoMoreInteractions(t);
	}

	/**
	 * This test ensures, that the function
	 * {@link Tup4bigdC#setByIndex(int, BigDecimal)} adopts the value to the w component
	 * if the index is 3 and returns the current instance.
	 */
	@Test
	void setByIndex_WTest()
	{
		Tup4bigdC t = mock(Tup4bigdC.class);

		when(t.setByIndex(3, BigDecimal.valueOf(1.0))).thenCallRealMethod();

		when(t.setW(BigDecimal.valueOf(1.0))).thenReturn(t);

		assertSame(t, t.setByIndex(3, BigDecimal.valueOf(1.0)));

		verify(t).setByIndex(3, BigDecimal.valueOf(1.0));

		verify(t).setW(BigDecimal.valueOf(1.0));

		verifyNoMoreInteractions(t);
	}

	/**
	 * This test ensures, that the function {@link Tup4bigdC#setArray(BigDecimal[])}
	 * adopts the values and returns the current instance.
	 */
	@Test
	void setArrayTest()
	{
		Tup4bigdC t = mock(Tup4bigdC.class);

		when(t.setArray(new BigDecimal[] {BigDecimal.valueOf(1.0), BigDecimal.valueOf(2.0), BigDecimal.valueOf(3.0), BigDecimal.valueOf(4.0)})).thenCallRealMethod();

		when(t.set(BigDecimal.valueOf(1.0), BigDecimal.valueOf(2.0), BigDecimal.valueOf(3.0), BigDecimal.valueOf(4.0))).thenReturn(t);

		assertSame(t, t.setArray(new BigDecimal[] {BigDecimal.valueOf(1.0), BigDecimal.valueOf(2.0), BigDecimal.valueOf(3.0), BigDecimal.valueOf(4.0)}));

		verify(t).setArray(new BigDecimal[] {BigDecimal.valueOf(1.0), BigDecimal.valueOf(2.0), BigDecimal.valueOf(3.0), BigDecimal.valueOf(4.0)});

		verify(t).set(BigDecimal.valueOf(1.0), BigDecimal.valueOf(2.0), BigDecimal.valueOf(3.0), BigDecimal.valueOf(4.0));

		verifyNoMoreInteractions(t);
	}
}
