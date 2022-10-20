package org.barghos.tuple.api.test.t2;

import static org.junit.jupiter.api.Assertions.*;

import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;

import java.math.BigInteger;

import org.barghos.tuple.api.t2.Tup2bigiC;
import org.barghos.tuple.api.t2.Tup2bigiR;
import org.barghos.tuple.api.tn.TupbigiC;
import org.barghos.tuple.api.tn.TupbigiR;

/**
 * This class provides comoponent tests for the interface {@link Tup2bigiC}.
 * 
 * @author picatrix1899
 */
class Tup2bigiCTest
{

	/**
	 * This test ensures, that the interface extends the interface
	 * {@link Tup2bigiR}.
	 */
	@Test
	void inheritance_Tup2RTest()
	{
		assertTrue(Tup2bigiR.class.isAssignableFrom(Tup2bigiC.class));
	}

	/**
	 * This test ensures, that the interface extends the interface
	 * {@link TupbigiC}.
	 */
	@Test
	void inheritance_TupCTest()
	{
		assertTrue(TupbigiC.class.isAssignableFrom(Tup2bigiC.class));
	}

	/**
	 * This test ensures, that the function {@link Tup2bigiC#set(Tup2bigiR)} adopts
	 * the values from the input tuple and returns the current instance.
	 */
	@Test
	void set_Tuple2Test()
	{
		Tup2bigiC t = mock(Tup2bigiC.class);
		Tup2bigiR t2 = mock(Tup2bigiR.class);

		when(t.set(t2)).thenCallRealMethod();

		when(t2.getX()).thenReturn(BigInteger.valueOf(1));
		when(t2.getY()).thenReturn(BigInteger.valueOf(2));
		when(t.set(BigInteger.valueOf(1), BigInteger.valueOf(2))).thenReturn(t);

		assertSame(t, t.set(t2));

		verify(t).set(t2);

		verify(t2).getX();
		verify(t2).getY();
		verify(t).set(BigInteger.valueOf(1), BigInteger.valueOf(2));

		verifyNoMoreInteractions(t, t2);
	}

	/**
	 * This test ensures, that the function {@link Tup2bigiC#set(BigInteger)} adopts the
	 * value for each component and returns the current instance.
	 */
	@Test
	void set_ValueTest()
	{
		Tup2bigiC t = mock(Tup2bigiC.class);

		when(t.set(BigInteger.valueOf(1))).thenCallRealMethod();

		when(t.set(BigInteger.valueOf(1), BigInteger.valueOf(1))).thenReturn(t);

		assertSame(t, t.set(BigInteger.valueOf(1)));

		verify(t).set(BigInteger.valueOf(1));

		verify(t).set(BigInteger.valueOf(1), BigInteger.valueOf(1));

		verifyNoMoreInteractions(t);
	}

	/**
	 * This test ensures, that the function {@link Tup2bigiC#set(BigInteger, BigInteger)} adopts
	 * the values and returns the current instance.
	 */
	@Test
	void setTest()
	{
		Tup2bigiC t = mock(Tup2bigiC.class);

		when(t.set(BigInteger.valueOf(1), BigInteger.valueOf(2))).thenCallRealMethod();

		when(t.setX(BigInteger.valueOf(1))).thenReturn(t);
		when(t.setY(BigInteger.valueOf(2))).thenReturn(t);

		assertSame(t, t.set(BigInteger.valueOf(1), BigInteger.valueOf(2)));

		verify(t).set(BigInteger.valueOf(1), BigInteger.valueOf(2));

		verify(t).setX(BigInteger.valueOf(1));
		verify(t).setY(BigInteger.valueOf(2));

		verifyNoMoreInteractions(t);
	}

	/**
	 * This test ensures, that the function {@link Tup2bigiC#set(TupbigiR)} adopts the
	 * values from the input tuple and returns the current instance.
	 */
	@Test
	void set_TupleTest()
	{
		Tup2bigiC t = mock(Tup2bigiC.class);
		TupbigiR t2 = mock(TupbigiR.class);

		when(t.set(t2)).thenCallRealMethod();

		when(t2.toArray()).thenReturn(new BigInteger[] {BigInteger.valueOf(1), BigInteger.valueOf(2)});
		when(t.setArray(new BigInteger[] {BigInteger.valueOf(1), BigInteger.valueOf(2)})).thenReturn(t);

		assertSame(t, t.set(t2));

		verify(t).set(t2);

		verify(t2).toArray();
		verify(t).setArray(new BigInteger[] {BigInteger.valueOf(1), BigInteger.valueOf(2)});

		verifyNoMoreInteractions(t);
	}

	/**
	 * This test ensures, that the function {@link Tup2bigiC#setByIndex(int, BigInteger)}
	 * adopts the value to the x component if the index is 0 and returns the
	 * current instance.
	 */
	@Test
	void setByIndex_XTest()
	{
		Tup2bigiC t = mock(Tup2bigiC.class);

		when(t.setByIndex(0, BigInteger.valueOf(1))).thenCallRealMethod();

		when(t.setX(BigInteger.valueOf(1))).thenReturn(t);

		assertSame(t, t.setByIndex(0, BigInteger.valueOf(1)));

		verify(t).setByIndex(0, BigInteger.valueOf(1));

		verify(t).setX(BigInteger.valueOf(1));

		verifyNoMoreInteractions(t);
	}

	/**
	 * This test ensures, that the function {@link Tup2bigiC#setByIndex(int, BigInteger)}
	 * adopts the value to the y component if the index is 1 and returns the
	 * current instance.
	 */
	@Test
	void setByIndex_YTest()
	{
		Tup2bigiC t = mock(Tup2bigiC.class);

		when(t.setByIndex(1, BigInteger.valueOf(1))).thenCallRealMethod();

		when(t.setY(BigInteger.valueOf(1))).thenReturn(t);

		assertSame(t, t.setByIndex(1, BigInteger.valueOf(1)));

		verify(t).setByIndex(1, BigInteger.valueOf(1));

		verify(t).setY(BigInteger.valueOf(1));

		verifyNoMoreInteractions(t);
	}

	/**
	 * This test ensures, that the function {@link Tup2bigiC#setArray(BigInteger[])}
	 * adopts the values and returns the current instance.
	 */
	@Test
	void setArrayTest()
	{
		Tup2bigiC t = mock(Tup2bigiC.class);

		when(t.setArray(new BigInteger[] {BigInteger.valueOf(1), BigInteger.valueOf(2)})).thenCallRealMethod();

		when(t.set(BigInteger.valueOf(1), BigInteger.valueOf(2))).thenReturn(t);

		assertSame(t, t.setArray(new BigInteger[] {BigInteger.valueOf(1), BigInteger.valueOf(2)}));

		verify(t).setArray(new BigInteger[] {BigInteger.valueOf(1), BigInteger.valueOf(2)});

		verify(t).set(BigInteger.valueOf(1), BigInteger.valueOf(2));

		verifyNoMoreInteractions(t);
	}
}
