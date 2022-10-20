package org.barghos.tuple.api.test.t4;

import static org.junit.jupiter.api.Assertions.*;

import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;

import org.barghos.tuple.api.t4.Tup4boR;
import org.barghos.tuple.api.tn.TupboR;

/**
 * This claa provides component tests for the interface {@link Tup4boR}.
 * 
 * @author picatrix1899
 */
class Tup4boRTest
{

	/**
	 * This test ensures, that the interface extends the interface
	 * {@link TupboR}.
	 */
	@Test
	void inheritance_TupRTest()
	{
		assertTrue(TupboR.class.isAssignableFrom(Tup4boR.class));
	}

	/**
	 * this test ensures, that the function {@link Tup4boR#getDimensions()}
	 * always returns 4 and does not make any calls.
	 */
	@Test
	void getDimensionsTest()
	{
		Tup4boR t = mock(Tup4boR.class);

		when(t.getDimensions()).thenCallRealMethod();

		assertEquals(4, t.getDimensions());

		verify(t).getDimensions();

		verifyNoMoreInteractions(t);
	}

	/**
	 * This test ensures, that the function {@link Tup4boR#getByIndex(int)}
	 * returns the x component for the index 0.
	 */
	@Test
	void getByIndex_XTest()
	{
		Tup4boR t = mock(Tup4boR.class);

		when(t.getByIndex(0)).thenCallRealMethod();

		when(t.getX()).thenReturn(true);

		assertEquals(true, t.getByIndex(0));

		verify(t).getByIndex(0);

		verify(t).getX();

		verifyNoMoreInteractions(t);
	}

	/**
	 * This test ensures, that the function {@link Tup4boR#getByIndex(int)}
	 * returns the y component for the index 1.
	 */
	@Test
	void getByIndex_YTest()
	{
		Tup4boR t = mock(Tup4boR.class);

		when(t.getByIndex(1)).thenCallRealMethod();

		when(t.getY()).thenReturn(true);

		assertEquals(true, t.getByIndex(1));

		verify(t).getByIndex(1);

		verify(t).getY();

		verifyNoMoreInteractions(t);
	}

	/**
	 * This test ensures, that the function {@link Tup4boR#getByIndex(int)}
	 * returns the z component for the index 2.
	 */
	@Test
	void getByIndex_ZTest()
	{
		Tup4boR t = mock(Tup4boR.class);

		when(t.getByIndex(2)).thenCallRealMethod();

		when(t.getZ()).thenReturn(true);

		assertEquals(true, t.getByIndex(2));

		verify(t).getByIndex(2);

		verify(t).getZ();

		verifyNoMoreInteractions(t);
	}

	/**
	 * This test ensures, that the function {@link Tup4boR#getByIndex(int)}
	 * returns the w component for the index 3.
	 */
	@Test
	void getByIndex_WTest()
	{
		Tup4boR t = mock(Tup4boR.class);

		when(t.getByIndex(3)).thenCallRealMethod();

		when(t.getW()).thenReturn(true);

		assertEquals(true, t.getByIndex(3));

		verify(t).getByIndex(3);

		verify(t).getW();

		verifyNoMoreInteractions(t);
	}

	/**
	 * This test ensures, that the function {@link Tup4boR#toArray(boolean[])}
	 * returns the given array with the components in the right order.
	 */
	@Test
	void toArrayWithExtractParamTest()
	{
		Tup4boR t = mock(Tup4boR.class);

		boolean[] array = new boolean[4];

		when(t.toArray(array)).thenCallRealMethod();

		when(t.getX()).thenReturn(true);
		when(t.getY()).thenReturn(false);
		when(t.getZ()).thenReturn(true);
		when(t.getW()).thenReturn(false);

		assertSame(array, t.toArray(array));
		assertArrayEquals(new boolean[] {true, false, true, false}, array);

		verify(t).toArray(array);

		verify(t).getX();
		verify(t).getY();
		verify(t).getZ();
		verify(t).getW();

		verifyNoMoreInteractions(t);
	}
}