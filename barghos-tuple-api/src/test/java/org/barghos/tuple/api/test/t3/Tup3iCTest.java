package org.barghos.tuple.api.test.t3;

import static org.junit.jupiter.api.Assertions.*;

import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;

import org.barghos.tuple.api.t3.Tup3iC;
import org.barghos.tuple.api.t3.Tup3iR;
import org.barghos.tuple.api.tn.TupiC;
import org.barghos.tuple.api.tn.TupiR;

/**
 * This class provides comoponent tests for the interface {@link Tup3iC}.
 * 
 * @author picatrix1899
 */
class Tup3iCTest
{

	/**
	 * This test ensures, that the interface extends the interface
	 * {@link Tup3iR}.
	 */
	@Test
	void inheritance_Tup3RTest()
	{
		assertTrue(Tup3iR.class.isAssignableFrom(Tup3iC.class));
	}

	/**
	 * This test ensures, that the interface extends the interface
	 * {@link TupiC}.
	 */
	@Test
	void inheritance_TupCTest()
	{
		assertTrue(TupiC.class.isAssignableFrom(Tup3iC.class));
	}

	/**
	 * This test ensures, that the function {@link Tup3iC#set(Tup3iR)} adopts
	 * the values from the input tuple and returns the current instance.
	 */
	@Test
	void set_Tuple3Test()
	{
		Tup3iC t = mock(Tup3iC.class);
		Tup3iR t2 = mock(Tup3iR.class);

		when(t.set(t2)).thenCallRealMethod();

		when(t2.getX()).thenReturn(1);
		when(t2.getY()).thenReturn(2);
		when(t2.getZ()).thenReturn(3);
		when(t.set(1, 2, 3)).thenReturn(t);

		assertSame(t, t.set(t2));

		verify(t).set(t2);

		verify(t2).getX();
		verify(t2).getY();
		verify(t2).getZ();
		verify(t).set(1, 2, 3);

		verifyNoMoreInteractions(t, t2);
	}

	/**
	 * This test ensures, that the function {@link Tup3iC#set(int)} adopts the
	 * value for each component and returns the current instance.
	 */
	@Test
	void set_ValueTest()
	{
		Tup3iC t = mock(Tup3iC.class);

		when(t.set(1)).thenCallRealMethod();

		when(t.set(1, 1, 1)).thenReturn(t);

		assertSame(t, t.set(1));

		verify(t).set(1);

		verify(t).set(1, 1, 1);

		verifyNoMoreInteractions(t);
	}

	/**
	 * This test ensures, that the function
	 * {@link Tup3iC#set(int, int, int)} adopts the values and returns the
	 * current instance.
	 */
	@Test
	void setTest()
	{
		Tup3iC t = mock(Tup3iC.class);

		when(t.set(1, 2, 3)).thenCallRealMethod();

		when(t.setX(1)).thenReturn(t);
		when(t.setY(2)).thenReturn(t);
		when(t.setZ(3)).thenReturn(t);

		assertSame(t, t.set(1, 2, 3));

		verify(t).set(1, 2, 3);

		verify(t).setX(1);
		verify(t).setY(2);
		verify(t).setZ(3);

		verifyNoMoreInteractions(t);
	}

	/**
	 * This test ensures, that the function {@link Tup3iC#set(TupiR)} adopts the
	 * values from the input tuple and returns the current instance.
	 */
	@Test
	void set_TupleTest()
	{
		Tup3iC t = mock(Tup3iC.class);
		TupiR t2 = mock(TupiR.class);

		when(t.set(t2)).thenCallRealMethod();

		when(t2.toArray()).thenReturn(new int[] {1, 2, 3});
		when(t.setArray(new int[] {1, 2, 3})).thenReturn(t);

		assertSame(t, t.set(t2));

		verify(t).set(t2);

		verify(t2).toArray();
		verify(t).setArray(new int[] {1, 2, 3});

		verifyNoMoreInteractions(t);
	}

	/**
	 * This test ensures, that the function
	 * {@link Tup3iC#setByIndex(int, int)} adopts the value to the x component
	 * if the index is 0 and returns the current instance.
	 */
	@Test
	void setByIndex_XTest()
	{
		Tup3iC t = mock(Tup3iC.class);

		when(t.setByIndex(0, 1)).thenCallRealMethod();

		when(t.setX(1)).thenReturn(t);

		assertSame(t, t.setByIndex(0, 1));

		verify(t).setByIndex(0, 1);

		verify(t).setX(1);

		verifyNoMoreInteractions(t);
	}

	/**
	 * This test ensures, that the function
	 * {@link Tup3iC#setByIndex(int, int)} adopts the value to the y component
	 * if the index is 1 and returns the current instance.
	 */
	@Test
	void setByIndex_YTest()
	{
		Tup3iC t = mock(Tup3iC.class);

		when(t.setByIndex(1, 1)).thenCallRealMethod();

		when(t.setY(1)).thenReturn(t);

		assertSame(t, t.setByIndex(1, 1));

		verify(t).setByIndex(1, 1);

		verify(t).setY(1);

		verifyNoMoreInteractions(t);
	}

	/**
	 * This test ensures, that the function
	 * {@link Tup3iC#setByIndex(int, int)} adopts the value to the z component
	 * if the index is 2 and returns the current instance.
	 */
	@Test
	void setByIndex_ZTest()
	{
		Tup3iC t = mock(Tup3iC.class);

		when(t.setByIndex(2, 1)).thenCallRealMethod();

		when(t.setZ(1)).thenReturn(t);

		assertSame(t, t.setByIndex(2, 1));

		verify(t).setByIndex(2, 1);

		verify(t).setZ(1);

		verifyNoMoreInteractions(t);
	}

	/**
	 * This test ensures, that the function {@link Tup3iC#setArray(int[])}
	 * adopts the values and returns the current instance.
	 */
	@Test
	void setArrayTest()
	{
		Tup3iC t = mock(Tup3iC.class);

		when(t.setArray(new int[] {1, 2, 3})).thenCallRealMethod();

		when(t.set(1, 2, 3)).thenReturn(t);

		assertSame(t, t.setArray(new int[] {1, 2, 3}));

		verify(t).setArray(new int[] {1, 2, 3});

		verify(t).set(1, 2, 3);

		verifyNoMoreInteractions(t);
	}
}
