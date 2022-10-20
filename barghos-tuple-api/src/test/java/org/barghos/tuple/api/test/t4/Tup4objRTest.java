package org.barghos.tuple.api.test.t4;

import static org.junit.jupiter.api.Assertions.*;

import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;

import org.barghos.tuple.api.t4.Tup4objR;
import org.barghos.tuple.api.tn.TupobjR;

/**
 * This class provides component tests for the interface {@link Tup4objR}.
 * 
 * @author picatrix1899
 */
class Tup4objRTest
{

	/**
	 * This test ensures, that the interface extends the interface
	 * {@link TupobjR}.
	 */
	@Test
	void inheritance_TupRTest()
	{
		assertTrue(TupobjR.class.isAssignableFrom(Tup4objR.class));
	}

	/**
	 * this test ensures, that the function {@link Tup4objR#getDimensions()}
	 * always returns 4 and does not make any calls.
	 */
	@Test
	void getDimensionsTest()
	{
		Tup4objR t = mock(Tup4objR.class);

		when(t.getDimensions()).thenCallRealMethod();

		assertEquals(4, t.getDimensions());

		verify(t).getDimensions();

		verifyNoMoreInteractions(t);
	}

	/**
	 * This test ensures, that the function {@link Tup4objR#getByIndex(int)}
	 * returns the x component for the index 0.
	 */
	@Test
	void getByIndex_XTest()
	{
		Tup4objR t = mock(Tup4objR.class);

		when(t.getByIndex(0)).thenCallRealMethod();

		when(t.getX()).thenReturn(1);

		assertEquals(1, t.getByIndex(0));

		verify(t).getByIndex(0);

		verify(t).getX();

		verifyNoMoreInteractions(t);
	}

	/**
	 * This test ensures, that the function {@link Tup4objR#getByIndex(int)}
	 * returns the y component for the index 1.
	 */
	@Test
	void getByIndex_YTest()
	{
		Tup4objR t = mock(Tup4objR.class);

		when(t.getByIndex(1)).thenCallRealMethod();

		when(t.getY()).thenReturn(1);

		assertEquals(1, t.getByIndex(1));

		verify(t).getByIndex(1);

		verify(t).getY();

		verifyNoMoreInteractions(t);
	}

	/**
	 * This test ensures, that the function {@link Tup4objR#getByIndex(int)}
	 * returns the z component for the index 2.
	 */
	@Test
	void getByIndex_ZTest()
	{
		Tup4objR t = mock(Tup4objR.class);

		when(t.getByIndex(2)).thenCallRealMethod();

		when(t.getZ()).thenReturn(1);

		assertEquals(1, t.getByIndex(2));

		verify(t).getByIndex(2);

		verify(t).getZ();

		verifyNoMoreInteractions(t);
	}

	/**
	 * This test ensures, that the function {@link Tup4objR#getByIndex(int)}
	 * returns the w component for the index 3.
	 */
	@Test
	void getByIndex_WTest()
	{
		Tup4objR t = mock(Tup4objR.class);

		when(t.getByIndex(3)).thenCallRealMethod();

		when(t.getW()).thenReturn(1);

		assertEquals(1, t.getByIndex(3));

		verify(t).getByIndex(3);

		verify(t).getW();

		verifyNoMoreInteractions(t);
	}

	/**
	 * This test ensures, that the function {@link Tup4objR#toArray(Object[])}
	 * returns the given array with the components in the right order.
	 */
	@Test
	void toArrayWithExtractParamTest()
	{
		Tup4objR t = mock(Tup4objR.class);

		Object[] array = new Object[4];

		when(t.toArray(array)).thenCallRealMethod();

		when(t.getX()).thenReturn(1);
		when(t.getY()).thenReturn(1.0);
		when(t.getZ()).thenReturn("a");
		when(t.getW()).thenReturn('a');

		assertSame(array, t.toArray(array));
		assertArrayEquals(new Object[] {1, 1.0, "a", 'a'}, array);

		verify(t).toArray(array);

		verify(t).getX();
		verify(t).getY();
		verify(t).getZ();
		verify(t).getW();

		verifyNoMoreInteractions(t);
	}
}