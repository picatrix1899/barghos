package org.barghos.tuple.api.test.t4;

import static org.junit.jupiter.api.Assertions.*;

import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;

import java.math.BigInteger;

import org.barghos.tuple.api.t4.Tup4bigiC;
import org.barghos.tuple.api.t4.Tup4bigiR;
import org.barghos.tuple.api.tn.TupbigiC;
import org.barghos.tuple.api.tn.TupbigiR;

/**
 * This class provides comoponent tests for the interface {@link Tup4bigiC}.
 * 
 * @author picatrix1899
 */
class Tup4bigiCTest
{

	/**
	 * This test ensures, that the interface extends the interface
	 * {@link Tup4bigiR}.
	 */
	@Test
	void inheritance_Tup4RTest()
	{
		assertTrue(Tup4bigiR.class.isAssignableFrom(Tup4bigiC.class));
	}

	/**
	 * This test ensures, that the interface extends the interface
	 * {@link TupbigiC}.
	 */
	@Test
	void inheritance_TupCTest()
	{
		assertTrue(TupbigiC.class.isAssignableFrom(Tup4bigiC.class));
	}

	/**
	 * This test ensures, that the function {@link Tup4bigiC#set(Tup4bigiR)} adopts
	 * the values from the input tuple and returns the current instance.
	 */
	@Test
	void set_Tuple4Test()
	{
		Tup4bigiC t = mock(Tup4bigiC.class);
		Tup4bigiR t2 = mock(Tup4bigiR.class);

		when(t.set(t2)).thenCallRealMethod();

		when(t2.getX()).thenReturn(BigInteger.valueOf(1));
		when(t2.getY()).thenReturn(BigInteger.valueOf(2));
		when(t2.getZ()).thenReturn(BigInteger.valueOf(3));
		when(t2.getW()).thenReturn(BigInteger.valueOf(4));
		when(t.set(BigInteger.valueOf(1), BigInteger.valueOf(2), BigInteger.valueOf(3), BigInteger.valueOf(4))).thenReturn(t);

		assertSame(t, t.set(t2));

		verify(t).set(t2);

		verify(t2).getX();
		verify(t2).getY();
		verify(t2).getZ();
		verify(t2).getW();
		verify(t).set(BigInteger.valueOf(1), BigInteger.valueOf(2), BigInteger.valueOf(3), BigInteger.valueOf(4));

		verifyNoMoreInteractions(t, t2);
	}

	/**
	 * This test ensures, that the function {@link Tup4bigiC#set(BigInteger)} adopts the
	 * value for each component and returns the current instance.
	 */
	@Test
	void set_ValueTest()
	{
		Tup4bigiC t = mock(Tup4bigiC.class);

		when(t.set(BigInteger.valueOf(1))).thenCallRealMethod();

		when(t.set(BigInteger.valueOf(1), BigInteger.valueOf(1), BigInteger.valueOf(1), BigInteger.valueOf(1))).thenReturn(t);

		assertSame(t, t.set(BigInteger.valueOf(1)));

		verify(t).set(BigInteger.valueOf(1));

		verify(t).set(BigInteger.valueOf(1), BigInteger.valueOf(1), BigInteger.valueOf(1), BigInteger.valueOf(1));

		verifyNoMoreInteractions(t);
	}

	/**
	 * This test ensures, that the function
	 * {@link Tup4bigiC#set(BigInteger, BigInteger, BigInteger, BigInteger)} adopts the values and
	 * returns the current instance.
	 */
	@Test
	void setTest()
	{
		Tup4bigiC t = mock(Tup4bigiC.class);

		when(t.set(BigInteger.valueOf(1), BigInteger.valueOf(2), BigInteger.valueOf(3), BigInteger.valueOf(4))).thenCallRealMethod();

		when(t.setX(BigInteger.valueOf(1))).thenReturn(t);
		when(t.setY(BigInteger.valueOf(2))).thenReturn(t);
		when(t.setZ(BigInteger.valueOf(3))).thenReturn(t);
		when(t.setW(BigInteger.valueOf(4))).thenReturn(t);

		assertSame(t, t.set(BigInteger.valueOf(1), BigInteger.valueOf(2), BigInteger.valueOf(3), BigInteger.valueOf(4)));

		verify(t).set(BigInteger.valueOf(1), BigInteger.valueOf(2), BigInteger.valueOf(3), BigInteger.valueOf(4));

		verify(t).setX(BigInteger.valueOf(1));
		verify(t).setY(BigInteger.valueOf(2));
		verify(t).setZ(BigInteger.valueOf(3));
		verify(t).setW(BigInteger.valueOf(4));

		verifyNoMoreInteractions(t);
	}

	/**
	 * This test ensures, that the function {@link Tup4bigiC#set(TupbigiR)} adopts the
	 * values from the input tuple and returns the current instance.
	 */
	@Test
	void set_TupleTest()
	{
		Tup4bigiC t = mock(Tup4bigiC.class);
		TupbigiR t2 = mock(TupbigiR.class);

		when(t.set(t2)).thenCallRealMethod();

		when(t2.toArray()).thenReturn(new BigInteger[] {BigInteger.valueOf(1), BigInteger.valueOf(2), BigInteger.valueOf(3), BigInteger.valueOf(4)});
		when(t.setArray(new BigInteger[] {BigInteger.valueOf(1), BigInteger.valueOf(2), BigInteger.valueOf(3), BigInteger.valueOf(4)})).thenReturn(t);

		assertSame(t, t.set(t2));

		verify(t).set(t2);

		verify(t2).toArray();
		verify(t).setArray(new BigInteger[] {BigInteger.valueOf(1), BigInteger.valueOf(2), BigInteger.valueOf(3), BigInteger.valueOf(4)});

		verifyNoMoreInteractions(t);
	}

	/**
	 * This test ensures, that the function
	 * {@link Tup4bigiC#setByIndex(int, BigInteger)} adopts the value to the x component
	 * if the index is 0 and returns the current instance.
	 */
	@Test
	void setByIndex_XTest()
	{
		Tup4bigiC t = mock(Tup4bigiC.class);

		when(t.setByIndex(0, BigInteger.valueOf(1))).thenCallRealMethod();

		when(t.setX(BigInteger.valueOf(1))).thenReturn(t);

		assertSame(t, t.setByIndex(0, BigInteger.valueOf(1)));

		verify(t).setByIndex(0, BigInteger.valueOf(1));

		verify(t).setX(BigInteger.valueOf(1));

		verifyNoMoreInteractions(t);
	}

	/**
	 * This test ensures, that the function
	 * {@link Tup4bigiC#setByIndex(int, BigInteger)} adopts the value to the y component
	 * if the index is 1 and returns the current instance.
	 */
	@Test
	void setByIndex_YTest()
	{
		Tup4bigiC t = mock(Tup4bigiC.class);

		when(t.setByIndex(1, BigInteger.valueOf(1))).thenCallRealMethod();

		when(t.setY(BigInteger.valueOf(1))).thenReturn(t);

		assertSame(t, t.setByIndex(1, BigInteger.valueOf(1)));

		verify(t).setByIndex(1, BigInteger.valueOf(1));

		verify(t).setY(BigInteger.valueOf(1));

		verifyNoMoreInteractions(t);
	}

	/**
	 * This test ensures, that the function
	 * {@link Tup4bigiC#setByIndex(int, BigInteger)} adopts the value to the z component
	 * if the index is 2 and returns the current instance.
	 */
	@Test
	void setByIndex_ZTest()
	{
		Tup4bigiC t = mock(Tup4bigiC.class);

		when(t.setByIndex(2, BigInteger.valueOf(1))).thenCallRealMethod();

		when(t.setZ(BigInteger.valueOf(1))).thenReturn(t);

		assertSame(t, t.setByIndex(2, BigInteger.valueOf(1)));

		verify(t).setByIndex(2, BigInteger.valueOf(1));

		verify(t).setZ(BigInteger.valueOf(1));

		verifyNoMoreInteractions(t);
	}

	/**
	 * This test ensures, that the function
	 * {@link Tup4bigiC#setByIndex(int, BigInteger)} adopts the value to the w component
	 * if the index is 3 and returns the current instance.
	 */
	@Test
	void setByIndex_WTest()
	{
		Tup4bigiC t = mock(Tup4bigiC.class);

		when(t.setByIndex(3, BigInteger.valueOf(1))).thenCallRealMethod();

		when(t.setW(BigInteger.valueOf(1))).thenReturn(t);

		assertSame(t, t.setByIndex(3, BigInteger.valueOf(1)));

		verify(t).setByIndex(3, BigInteger.valueOf(1));

		verify(t).setW(BigInteger.valueOf(1));

		verifyNoMoreInteractions(t);
	}

	/**
	 * This test ensures, that the function {@link Tup4bigiC#setArray(BigInteger[])}
	 * adopts the values and returns the current instance.
	 */
	@Test
	void setArrayTest()
	{
		Tup4bigiC t = mock(Tup4bigiC.class);

		when(t.setArray(new BigInteger[] {BigInteger.valueOf(1), BigInteger.valueOf(2), BigInteger.valueOf(3), BigInteger.valueOf(4)})).thenCallRealMethod();

		when(t.set(BigInteger.valueOf(1), BigInteger.valueOf(2), BigInteger.valueOf(3), BigInteger.valueOf(4))).thenReturn(t);

		assertSame(t, t.setArray(new BigInteger[] {BigInteger.valueOf(1), BigInteger.valueOf(2), BigInteger.valueOf(3), BigInteger.valueOf(4)}));

		verify(t).setArray(new BigInteger[] {BigInteger.valueOf(1), BigInteger.valueOf(2), BigInteger.valueOf(3), BigInteger.valueOf(4)});

		verify(t).set(BigInteger.valueOf(1), BigInteger.valueOf(2), BigInteger.valueOf(3), BigInteger.valueOf(4));

		verifyNoMoreInteractions(t);
	}
}
