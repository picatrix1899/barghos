package org.barghos.tuple.api.test.t4;

import static org.junit.jupiter.api.Assertions.*;

import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;

import org.barghos.tuple.api.t4.Tup4sC;
import org.barghos.tuple.api.t4.Tup4sR;
import org.barghos.tuple.api.tn.TupsC;
import org.barghos.tuple.api.tn.TupsR;

/**
 * This class provides comoponent tests for the interface {@link Tup4sC}.
 * 
 * @author picatrix1899
 */
class Tup4sCTest
{

	/**
	 * This test ensures, that the interface extends the interface
	 * {@link Tup4sR}.
	 */
	@Test
	void inheritance_Tup4RTest()
	{
		assertTrue(Tup4sR.class.isAssignableFrom(Tup4sC.class));
	}

	/**
	 * This test ensures, that the interface extends the interface
	 * {@link TupsC}.
	 */
	@Test
	void inheritance_TupCTest()
	{
		assertTrue(TupsC.class.isAssignableFrom(Tup4sC.class));
	}

	/**
	 * This test ensures, that the function {@link Tup4sC#set(Tup4sR)} adopts
	 * the values from the input tuple and returns the current instance.
	 */
	@Test
	void set_Tuple4Test()
	{
		Tup4sC t = mock(Tup4sC.class);
		Tup4sR t2 = mock(Tup4sR.class);

		when(t.set(t2)).thenCallRealMethod();

		when(t2.getX()).thenReturn((short)1);
		when(t2.getY()).thenReturn((short)2);
		when(t2.getZ()).thenReturn((short)3);
		when(t2.getW()).thenReturn((short)4);
		when(t.set((short)1, (short)2, (short)3, (short)4)).thenReturn(t);

		assertSame(t, t.set(t2));

		verify(t).set(t2);

		verify(t2).getX();
		verify(t2).getY();
		verify(t2).getZ();
		verify(t2).getW();
		verify(t).set((short)1, (short)2, (short)3, (short)4);

		verifyNoMoreInteractions(t, t2);
	}

	/**
	 * This test ensures, that the function {@link Tup4sC#set(short)} adopts the
	 * value for each component and returns the current instance.
	 */
	@Test
	void set_ValueTest()
	{
		Tup4sC t = mock(Tup4sC.class);

		when(t.set((short)1)).thenCallRealMethod();

		when(t.set((short)1, (short)1, (short)1, (short)1)).thenReturn(t);

		assertSame(t, t.set((short)1));

		verify(t).set((short)1);

		verify(t).set((short)1, (short)1, (short)1, (short)1);

		verifyNoMoreInteractions(t);
	}

	/**
	 * This test ensures, that the function
	 * {@link Tup4sC#set(short, short, short, short)} adopts the values and
	 * returns the current instance.
	 */
	@Test
	void setTest()
	{
		Tup4sC t = mock(Tup4sC.class);

		when(t.set((short)1, (short)2, (short)3, (short)4)).thenCallRealMethod();

		when(t.setX((short)1)).thenReturn(t);
		when(t.setY((short)2)).thenReturn(t);
		when(t.setZ((short)3)).thenReturn(t);
		when(t.setW((short)4)).thenReturn(t);

		assertSame(t, t.set((short)1, (short)2, (short)3, (short)4));

		verify(t).set((short)1, (short)2, (short)3, (short)4);

		verify(t).setX((short)1);
		verify(t).setY((short)2);
		verify(t).setZ((short)3);
		verify(t).setW((short)4);

		verifyNoMoreInteractions(t);
	}

	/**
	 * This test ensures, that the function {@link Tup4sC#set(TupsR)} adopts the
	 * values from the input tuple and returns the current instance.
	 */
	@Test
	void set_TupleTest()
	{
		Tup4sC t = mock(Tup4sC.class);
		TupsR t2 = mock(TupsR.class);

		when(t.set(t2)).thenCallRealMethod();

		when(t2.toArray()).thenReturn(new short[] {(short)1, (short)2, (short)3, (short)4});
		when(t.setArray(new short[] {(short)1, (short)2, (short)3, (short)4})).thenReturn(t);

		assertSame(t, t.set(t2));

		verify(t).set(t2);

		verify(t2).toArray();
		verify(t).setArray(new short[] {(short)1, (short)2, (short)3, (short)4});

		verifyNoMoreInteractions(t);
	}

	/**
	 * This test ensures, that the function
	 * {@link Tup4sC#setByIndex(int, short)} adopts the value to the x component
	 * if the index is 0 and returns the current instance.
	 */
	@Test
	void setByIndex_XTest()
	{
		Tup4sC t = mock(Tup4sC.class);

		when(t.setByIndex(0, (short)1)).thenCallRealMethod();

		when(t.setX((short)1)).thenReturn(t);

		assertSame(t, t.setByIndex(0, (short)1));

		verify(t).setByIndex(0, (short)1);

		verify(t).setX((short)1);

		verifyNoMoreInteractions(t);
	}

	/**
	 * This test ensures, that the function
	 * {@link Tup4sC#setByIndex(int, short)} adopts the value to the y component
	 * if the index is 1 and returns the current instance.
	 */
	@Test
	void setByIndex_YTest()
	{
		Tup4sC t = mock(Tup4sC.class);

		when(t.setByIndex(1, (short)1)).thenCallRealMethod();

		when(t.setY((short)1)).thenReturn(t);

		assertSame(t, t.setByIndex(1, (short)1));

		verify(t).setByIndex(1, (short)1);

		verify(t).setY((short)1);

		verifyNoMoreInteractions(t);
	}

	/**
	 * This test ensures, that the function
	 * {@link Tup4sC#setByIndex(int, short)} adopts the value to the z component
	 * if the index is 2 and returns the current instance.
	 */
	@Test
	void setByIndex_ZTest()
	{
		Tup4sC t = mock(Tup4sC.class);

		when(t.setByIndex(2, (short)1)).thenCallRealMethod();

		when(t.setZ((short)1)).thenReturn(t);

		assertSame(t, t.setByIndex(2, (short)1));

		verify(t).setByIndex(2, (short)1);

		verify(t).setZ((short)1);

		verifyNoMoreInteractions(t);
	}

	/**
	 * This test ensures, that the function
	 * {@link Tup4sC#setByIndex(int, short)} adopts the value to the w component
	 * if the index is 3 and returns the current instance.
	 */
	@Test
	void setByIndex_WTest()
	{
		Tup4sC t = mock(Tup4sC.class);

		when(t.setByIndex(3, (short)1)).thenCallRealMethod();

		when(t.setW((short)1)).thenReturn(t);

		assertSame(t, t.setByIndex(3, (short)1));

		verify(t).setByIndex(3, (short)1);

		verify(t).setW((short)1);

		verifyNoMoreInteractions(t);
	}

	/**
	 * This test ensures, that the function {@link Tup4sC#setArray(short[])}
	 * adopts the values and returns the current instance.
	 */
	@Test
	void setArrayTest()
	{
		Tup4sC t = mock(Tup4sC.class);

		when(t.setArray(new short[] {(short)1, (short)2, (short)3, (short)4})).thenCallRealMethod();

		when(t.set((short)1, (short)2, (short)3, (short)4)).thenReturn(t);

		assertSame(t, t.setArray(new short[] {(short)1, (short)2, (short)3, (short)4}));

		verify(t).setArray(new short[] {(short)1, (short)2, (short)3, (short)4});

		verify(t).set((short)1, (short)2, (short)3, (short)4);

		verifyNoMoreInteractions(t);
	}
}
