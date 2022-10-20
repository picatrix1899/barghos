package org.barghos.tuple.api.test.t2;

import static org.junit.jupiter.api.Assertions.*;

import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;

import org.barghos.tuple.api.t2.Tup2lC;
import org.barghos.tuple.api.t2.Tup2lR;
import org.barghos.tuple.api.tn.TuplC;
import org.barghos.tuple.api.tn.TuplR;

/**
 * This class provides comoponent tests for the interface {@link Tup2lC}.
 * 
 * @author picatrix1899
 */
class Tup2lCTest
{

	/**
	 * This test ensures, that the interface extends the interface
	 * {@link Tup2lR}.
	 */
	@Test
	void inheritance_Tup2RTest()
	{
		assertTrue(Tup2lR.class.isAssignableFrom(Tup2lC.class));
	}

	/**
	 * This test ensures, that the interface extends the interface
	 * {@link TuplC}.
	 */
	@Test
	void inheritance_TupCTest()
	{
		assertTrue(TuplC.class.isAssignableFrom(Tup2lC.class));
	}

	/**
	 * This test ensures, that the function {@link Tup2lC#set(Tup2lR)} adopts
	 * the values from the input tuple and returns the current instance.
	 */
	@Test
	void set_Tuple2Test()
	{
		Tup2lC t = mock(Tup2lC.class);
		Tup2lR t2 = mock(Tup2lR.class);

		when(t.set(t2)).thenCallRealMethod();

		when(t2.getX()).thenReturn(1l);
		when(t2.getY()).thenReturn(2l);
		when(t.set(1l, 2l)).thenReturn(t);

		assertSame(t, t.set(t2));

		verify(t).set(t2);

		verify(t2).getX();
		verify(t2).getY();
		verify(t).set(1l, 2l);

		verifyNoMoreInteractions(t, t2);
	}

	/**
	 * This test ensures, that the function {@link Tup2lC#set(long)} adopts the
	 * value for each component and returns the current instance.
	 */
	@Test
	void set_ValueTest()
	{
		Tup2lC t = mock(Tup2lC.class);

		when(t.set(1l)).thenCallRealMethod();

		when(t.set(1l, 1l)).thenReturn(t);

		assertSame(t, t.set(1l));

		verify(t).set(1l);

		verify(t).set(1l, 1l);

		verifyNoMoreInteractions(t);
	}

	/**
	 * This test ensures, that the function {@link Tup2lC#set(long, long)} adopts
	 * the values and returns the current instance.
	 */
	@Test
	void setTest()
	{
		Tup2lC t = mock(Tup2lC.class);

		when(t.set(1l, 2l)).thenCallRealMethod();

		when(t.setX(1l)).thenReturn(t);
		when(t.setY(2l)).thenReturn(t);

		assertSame(t, t.set(1l, 2l));

		verify(t).set(1l, 2l);

		verify(t).setX(1l);
		verify(t).setY(2l);

		verifyNoMoreInteractions(t);
	}

	/**
	 * This test ensures, that the function {@link Tup2lC#set(TuplR)} adopts the
	 * values from the input tuple and returns the current instance.
	 */
	@Test
	void set_TupleTest()
	{
		Tup2lC t = mock(Tup2lC.class);
		TuplR t2 = mock(TuplR.class);

		when(t.set(t2)).thenCallRealMethod();

		when(t2.toArray()).thenReturn(new long[] {1l, 2l});
		when(t.setArray(new long[] {1l, 2l})).thenReturn(t);

		assertSame(t, t.set(t2));

		verify(t).set(t2);

		verify(t2).toArray();
		verify(t).setArray(new long[] {1l, 2l});

		verifyNoMoreInteractions(t);
	}

	/**
	 * This test ensures, that the function {@link Tup2lC#setByIndex(int, long)}
	 * adopts the value to the x component if the index is 0 and returns the
	 * current instance.
	 */
	@Test
	void setByIndex_XTest()
	{
		Tup2lC t = mock(Tup2lC.class);

		when(t.setByIndex(0, 1l)).thenCallRealMethod();

		when(t.setX(1l)).thenReturn(t);

		assertSame(t, t.setByIndex(0, 1l));

		verify(t).setByIndex(0, 1l);

		verify(t).setX(1l);

		verifyNoMoreInteractions(t);
	}

	/**
	 * This test ensures, that the function {@link Tup2lC#setByIndex(int, long)}
	 * adopts the value to the y component if the index is 1 and returns the
	 * current instance.
	 */
	@Test
	void setByIndex_YTest()
	{
		Tup2lC t = mock(Tup2lC.class);

		when(t.setByIndex(1, 1l)).thenCallRealMethod();

		when(t.setY(1l)).thenReturn(t);

		assertSame(t, t.setByIndex(1, 1l));

		verify(t).setByIndex(1, 1l);

		verify(t).setY(1l);

		verifyNoMoreInteractions(t);
	}

	/**
	 * This test ensures, that the function {@link Tup2lC#setArray(long[])}
	 * adopts the values and returns the current instance.
	 */
	@Test
	void setArrayTest()
	{
		Tup2lC t = mock(Tup2lC.class);

		when(t.setArray(new long[] {1l, 2l})).thenCallRealMethod();

		when(t.set(1l, 2l)).thenReturn(t);

		assertSame(t, t.setArray(new long[] {1l, 2l}));

		verify(t).setArray(new long[] {1l, 2l});

		verify(t).set(1l, 2l);

		verifyNoMoreInteractions(t);
	}
}
