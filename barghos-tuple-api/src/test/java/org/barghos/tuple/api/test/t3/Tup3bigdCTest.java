package org.barghos.tuple.api.test.t3;

import static org.junit.jupiter.api.Assertions.*;

import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import org.barghos.tuple.api.t3.Tup3bigdC;
import org.barghos.tuple.api.t3.Tup3bigdR;
import org.barghos.tuple.api.tn.TupbigdC;
import org.barghos.tuple.api.tn.TupbigdR;

/**
 * This class provides comoponent tests for the interface {@link Tup3bigdC}.
 * 
 * @author picatrix1899
 */
class Tup3bigdCTest
{

	/**
	 * This test ensures, that the interface extends the interface
	 * {@link Tup3bigdR}.
	 */
	@Test
	void inheritance_Tup3RTest()
	{
		assertTrue(Tup3bigdR.class.isAssignableFrom(Tup3bigdC.class));
	}

	/**
	 * This test ensures, that the interface extends the interface
	 * {@link TupbigdC}.
	 */
	@Test
	void inheritance_TupCTest()
	{
		assertTrue(TupbigdC.class.isAssignableFrom(Tup3bigdC.class));
	}

	/**
	 * This test ensures, that the function {@link Tup3bigdC#set(Tup3bigdR)} adopts
	 * the values from the input tuple and returns the current instance.
	 */
	@Test
	void set_Tuple3Test()
	{
		Tup3bigdC t = mock(Tup3bigdC.class);
		Tup3bigdR t2 = mock(Tup3bigdR.class);

		when(t.set(t2)).thenCallRealMethod();

		when(t2.getX()).thenReturn(BigDecimal.valueOf(1.0));
		when(t2.getY()).thenReturn(BigDecimal.valueOf(2.0));
		when(t2.getZ()).thenReturn(BigDecimal.valueOf(3.0));
		when(t.set(BigDecimal.valueOf(1.0), BigDecimal.valueOf(2.0), BigDecimal.valueOf(3.0))).thenReturn(t);

		assertSame(t, t.set(t2));

		verify(t).set(t2);

		verify(t2).getX();
		verify(t2).getY();
		verify(t2).getZ();
		verify(t).set(BigDecimal.valueOf(1.0), BigDecimal.valueOf(2.0), BigDecimal.valueOf(3.0));

		verifyNoMoreInteractions(t, t2);
	}

	/**
	 * This test ensures, that the function {@link Tup3bigdC#set(BigDecimal)} adopts the
	 * value for each component and returns the current instance.
	 */
	@Test
	void set_ValueTest()
	{
		Tup3bigdC t = mock(Tup3bigdC.class);

		when(t.set(BigDecimal.valueOf(1.0))).thenCallRealMethod();

		when(t.set(BigDecimal.valueOf(1.0), BigDecimal.valueOf(1.0), BigDecimal.valueOf(1.0))).thenReturn(t);

		assertSame(t, t.set(BigDecimal.valueOf(1.0)));

		verify(t).set(BigDecimal.valueOf(1.0));

		verify(t).set(BigDecimal.valueOf(1.0), BigDecimal.valueOf(1.0), BigDecimal.valueOf(1.0));

		verifyNoMoreInteractions(t);
	}

	/**
	 * This test ensures, that the function
	 * {@link Tup3bigdC#set(BigDecimal, BigDecimal, BigDecimal)} adopts the values and returns the
	 * current instance.
	 */
	@Test
	void setTest()
	{
		Tup3bigdC t = mock(Tup3bigdC.class);

		when(t.set(BigDecimal.valueOf(1.0), BigDecimal.valueOf(2.0), BigDecimal.valueOf(3.0))).thenCallRealMethod();

		when(t.setX(BigDecimal.valueOf(1.0))).thenReturn(t);
		when(t.setY(BigDecimal.valueOf(2.0))).thenReturn(t);
		when(t.setZ(BigDecimal.valueOf(3.0))).thenReturn(t);

		assertSame(t, t.set(BigDecimal.valueOf(1.0), BigDecimal.valueOf(2.0), BigDecimal.valueOf(3.0)));

		verify(t).set(BigDecimal.valueOf(1.0), BigDecimal.valueOf(2.0), BigDecimal.valueOf(3.0));

		verify(t).setX(BigDecimal.valueOf(1.0));
		verify(t).setY(BigDecimal.valueOf(2.0));
		verify(t).setZ(BigDecimal.valueOf(3.0));

		verifyNoMoreInteractions(t);
	}

	/**
	 * This test ensures, that the function {@link Tup3bigdC#set(TupbigdR)} adopts the
	 * values from the input tuple and returns the current instance.
	 */
	@Test
	void set_TupleTest()
	{
		Tup3bigdC t = mock(Tup3bigdC.class);
		TupbigdR t2 = mock(TupbigdR.class);

		when(t.set(t2)).thenCallRealMethod();

		when(t2.toArray()).thenReturn(new BigDecimal[] {BigDecimal.valueOf(1.0), BigDecimal.valueOf(2.0), BigDecimal.valueOf(3.0)});
		when(t.setArray(new BigDecimal[] {BigDecimal.valueOf(1.0), BigDecimal.valueOf(2.0), BigDecimal.valueOf(3.0)})).thenReturn(t);

		assertSame(t, t.set(t2));

		verify(t).set(t2);

		verify(t2).toArray();
		verify(t).setArray(new BigDecimal[] {BigDecimal.valueOf(1.0), BigDecimal.valueOf(2.0), BigDecimal.valueOf(3.0)});

		verifyNoMoreInteractions(t);
	}

	/**
	 * This test ensures, that the function
	 * {@link Tup3bigdC#setByIndex(int, BigDecimal)} adopts the value to the x component
	 * if the index is 0 and returns the current instance.
	 */
	@Test
	void setByIndex_XTest()
	{
		Tup3bigdC t = mock(Tup3bigdC.class);

		when(t.setByIndex(0, BigDecimal.valueOf(1.0))).thenCallRealMethod();

		when(t.setX(BigDecimal.valueOf(1.0))).thenReturn(t);

		assertSame(t, t.setByIndex(0, BigDecimal.valueOf(1.0)));

		verify(t).setByIndex(0, BigDecimal.valueOf(1.0));

		verify(t).setX(BigDecimal.valueOf(1.0));

		verifyNoMoreInteractions(t);
	}

	/**
	 * This test ensures, that the function
	 * {@link Tup3bigdC#setByIndex(int, BigDecimal)} adopts the value to the y component
	 * if the index is 1 and returns the current instance.
	 */
	@Test
	void setByIndex_YTest()
	{
		Tup3bigdC t = mock(Tup3bigdC.class);

		when(t.setByIndex(1, BigDecimal.valueOf(1.0))).thenCallRealMethod();

		when(t.setY(BigDecimal.valueOf(1.0))).thenReturn(t);

		assertSame(t, t.setByIndex(1, BigDecimal.valueOf(1.0)));

		verify(t).setByIndex(1, BigDecimal.valueOf(1.0));

		verify(t).setY(BigDecimal.valueOf(1.0));

		verifyNoMoreInteractions(t);
	}

	/**
	 * This test ensures, that the function
	 * {@link Tup3bigdC#setByIndex(int, BigDecimal)} adopts the value to the z component
	 * if the index is 2 and returns the current instance.
	 */
	@Test
	void setByIndex_ZTest()
	{
		Tup3bigdC t = mock(Tup3bigdC.class);

		when(t.setByIndex(2, BigDecimal.valueOf(1.0))).thenCallRealMethod();

		when(t.setZ(BigDecimal.valueOf(1.0))).thenReturn(t);

		assertSame(t, t.setByIndex(2, BigDecimal.valueOf(1.0)));

		verify(t).setByIndex(2, BigDecimal.valueOf(1.0));

		verify(t).setZ(BigDecimal.valueOf(1.0));

		verifyNoMoreInteractions(t);
	}

	/**
	 * This test ensures, that the function {@link Tup3bigdC#setArray(BigDecimal[])}
	 * adopts the values and returns the current instance.
	 */
	@Test
	void setArrayTest()
	{
		Tup3bigdC t = mock(Tup3bigdC.class);

		when(t.setArray(new BigDecimal[] {BigDecimal.valueOf(1.0), BigDecimal.valueOf(2.0), BigDecimal.valueOf(3.0)})).thenCallRealMethod();

		when(t.set(BigDecimal.valueOf(1.0), BigDecimal.valueOf(2.0), BigDecimal.valueOf(3.0))).thenReturn(t);

		assertSame(t, t.setArray(new BigDecimal[] {BigDecimal.valueOf(1.0), BigDecimal.valueOf(2.0), BigDecimal.valueOf(3.0)}));

		verify(t).setArray(new BigDecimal[] {BigDecimal.valueOf(1.0), BigDecimal.valueOf(2.0), BigDecimal.valueOf(3.0)});

		verify(t).set(BigDecimal.valueOf(1.0), BigDecimal.valueOf(2.0), BigDecimal.valueOf(3.0));

		verifyNoMoreInteractions(t);
	}
}
