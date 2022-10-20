package org.barghos.tuple.api.test.t3;

import static org.junit.jupiter.api.Assertions.*;

import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;

import java.math.BigInteger;

import org.barghos.tuple.api.t3.Tup3bigiC;
import org.barghos.tuple.api.t3.Tup3bigiR;
import org.barghos.tuple.api.tn.TupbigiC;
import org.barghos.tuple.api.tn.TupbigiR;

/**
 * This class provides comoponent tests for the interface {@link Tup3bigiC}.
 * 
 * @author picatrix1899
 */
class Tup3bigiCTest
{

	/**
	 * This test ensures, that the interface extends the interface
	 * {@link Tup3bigiR}.
	 */
	@Test
	void inheritance_Tup3RTest()
	{
		assertTrue(Tup3bigiR.class.isAssignableFrom(Tup3bigiC.class));
	}

	/**
	 * This test ensures, that the interface extends the interface
	 * {@link TupbigiC}.
	 */
	@Test
	void inheritance_TupCTest()
	{
		assertTrue(TupbigiC.class.isAssignableFrom(Tup3bigiC.class));
	}

	/**
	 * This test ensures, that the function {@link Tup3bigiC#set(Tup3bigiR)} adopts
	 * the values from the input tuple and returns the current instance.
	 */
	@Test
	void set_Tuple3Test()
	{
		Tup3bigiC t = mock(Tup3bigiC.class);
		Tup3bigiR t2 = mock(Tup3bigiR.class);

		when(t.set(t2)).thenCallRealMethod();

		when(t2.getX()).thenReturn(BigInteger.valueOf(1));
		when(t2.getY()).thenReturn(BigInteger.valueOf(2));
		when(t2.getZ()).thenReturn(BigInteger.valueOf(3));
		when(t.set(BigInteger.valueOf(1), BigInteger.valueOf(2), BigInteger.valueOf(3))).thenReturn(t);

		assertSame(t, t.set(t2));

		verify(t).set(t2);

		verify(t2).getX();
		verify(t2).getY();
		verify(t2).getZ();
		verify(t).set(BigInteger.valueOf(1), BigInteger.valueOf(2), BigInteger.valueOf(3));

		verifyNoMoreInteractions(t, t2);
	}

	/**
	 * This test ensures, that the function {@link Tup3bigiC#set(BigInteger)} adopts the
	 * value for each component and returns the current instance.
	 */
	@Test
	void set_ValueTest()
	{
		Tup3bigiC t = mock(Tup3bigiC.class);

		when(t.set(BigInteger.valueOf(1))).thenCallRealMethod();

		when(t.set(BigInteger.valueOf(1), BigInteger.valueOf(1), BigInteger.valueOf(1))).thenReturn(t);

		assertSame(t, t.set(BigInteger.valueOf(1)));

		verify(t).set(BigInteger.valueOf(1));

		verify(t).set(BigInteger.valueOf(1), BigInteger.valueOf(1), BigInteger.valueOf(1));

		verifyNoMoreInteractions(t);
	}

	/**
	 * This test ensures, that the function
	 * {@link Tup3bigiC#set(BigInteger, BigInteger, BigInteger)} adopts the values and returns the
	 * current instance.
	 */
	@Test
	void setTest()
	{
		Tup3bigiC t = mock(Tup3bigiC.class);

		when(t.set(BigInteger.valueOf(1), BigInteger.valueOf(2), BigInteger.valueOf(3))).thenCallRealMethod();

		when(t.setX(BigInteger.valueOf(1))).thenReturn(t);
		when(t.setY(BigInteger.valueOf(2))).thenReturn(t);
		when(t.setZ(BigInteger.valueOf(3))).thenReturn(t);

		assertSame(t, t.set(BigInteger.valueOf(1), BigInteger.valueOf(2), BigInteger.valueOf(3)));

		verify(t).set(BigInteger.valueOf(1), BigInteger.valueOf(2), BigInteger.valueOf(3));

		verify(t).setX(BigInteger.valueOf(1));
		verify(t).setY(BigInteger.valueOf(2));
		verify(t).setZ(BigInteger.valueOf(3));

		verifyNoMoreInteractions(t);
	}

	/**
	 * This test ensures, that the function {@link Tup3bigiC#set(TupbigiR)} adopts the
	 * values from the input tuple and returns the current instance.
	 */
	@Test
	void set_TupleTest()
	{
		Tup3bigiC t = mock(Tup3bigiC.class);
		TupbigiR t2 = mock(TupbigiR.class);

		when(t.set(t2)).thenCallRealMethod();

		when(t2.toArray()).thenReturn(new BigInteger[] {BigInteger.valueOf(1), BigInteger.valueOf(2), BigInteger.valueOf(3)});
		when(t.setArray(new BigInteger[] {BigInteger.valueOf(1), BigInteger.valueOf(2), BigInteger.valueOf(3)})).thenReturn(t);

		assertSame(t, t.set(t2));

		verify(t).set(t2);

		verify(t2).toArray();
		verify(t).setArray(new BigInteger[] {BigInteger.valueOf(1), BigInteger.valueOf(2), BigInteger.valueOf(3)});

		verifyNoMoreInteractions(t);
	}

	/**
	 * This test ensures, that the function
	 * {@link Tup3bigiC#setByIndex(int, BigInteger)} adopts the value to the x component
	 * if the index is 0 and returns the current instance.
	 */
	@Test
	void setByIndex_XTest()
	{
		Tup3bigiC t = mock(Tup3bigiC.class);

		when(t.setByIndex(0, BigInteger.valueOf(1))).thenCallRealMethod();

		when(t.setX(BigInteger.valueOf(1))).thenReturn(t);

		assertSame(t, t.setByIndex(0, BigInteger.valueOf(1)));

		verify(t).setByIndex(0, BigInteger.valueOf(1));

		verify(t).setX(BigInteger.valueOf(1));

		verifyNoMoreInteractions(t);
	}

	/**
	 * This test ensures, that the function
	 * {@link Tup3bigiC#setByIndex(int, BigInteger)} adopts the value to the y component
	 * if the index is 1 and returns the current instance.
	 */
	@Test
	void setByIndex_YTest()
	{
		Tup3bigiC t = mock(Tup3bigiC.class);

		when(t.setByIndex(1, BigInteger.valueOf(1))).thenCallRealMethod();

		when(t.setY(BigInteger.valueOf(1))).thenReturn(t);

		assertSame(t, t.setByIndex(1, BigInteger.valueOf(1)));

		verify(t).setByIndex(1, BigInteger.valueOf(1));

		verify(t).setY(BigInteger.valueOf(1));

		verifyNoMoreInteractions(t);
	}

	/**
	 * This test ensures, that the function
	 * {@link Tup3bigiC#setByIndex(int, BigInteger)} adopts the value to the z component
	 * if the index is 2 and returns the current instance.
	 */
	@Test
	void setByIndex_ZTest()
	{
		Tup3bigiC t = mock(Tup3bigiC.class);

		when(t.setByIndex(2, BigInteger.valueOf(1))).thenCallRealMethod();

		when(t.setZ(BigInteger.valueOf(1))).thenReturn(t);

		assertSame(t, t.setByIndex(2, BigInteger.valueOf(1)));

		verify(t).setByIndex(2, BigInteger.valueOf(1));

		verify(t).setZ(BigInteger.valueOf(1));

		verifyNoMoreInteractions(t);
	}

	/**
	 * This test ensures, that the function {@link Tup3bigiC#setArray(BigInteger[])}
	 * adopts the values and returns the current instance.
	 */
	@Test
	void setArrayTest()
	{
		Tup3bigiC t = mock(Tup3bigiC.class);

		when(t.setArray(new BigInteger[] {BigInteger.valueOf(1), BigInteger.valueOf(2), BigInteger.valueOf(3)})).thenCallRealMethod();

		when(t.set(BigInteger.valueOf(1), BigInteger.valueOf(2), BigInteger.valueOf(3))).thenReturn(t);

		assertSame(t, t.setArray(new BigInteger[] {BigInteger.valueOf(1), BigInteger.valueOf(2), BigInteger.valueOf(3)}));

		verify(t).setArray(new BigInteger[] {BigInteger.valueOf(1), BigInteger.valueOf(2), BigInteger.valueOf(3)});

		verify(t).set(BigInteger.valueOf(1), BigInteger.valueOf(2), BigInteger.valueOf(3));

		verifyNoMoreInteractions(t);
	}
}
