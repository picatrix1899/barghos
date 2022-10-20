package org.barghos.tuple.api.test.t3;

import static org.junit.jupiter.api.Assertions.*;

import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;

import org.barghos.tuple.api.t3.Tup3strR;
import org.barghos.tuple.api.tn.TupstrR;

/**
 * This class provides component tests for the interface {@link Tup3strR}.
 * 
 * @author picatrix1899
 */
class Tup3strRTest
{

	/**
	 * This test ensures, that the interface extends the interface
	 * {@link TupstrR}.
	 */
	@Test
	void inheritance_TupRTest()
	{
		assertTrue(TupstrR.class.isAssignableFrom(Tup3strR.class));
	}

	/**
	 * this test ensures, that the function {@link Tup3strR#getDimensions()}
	 * always returns 3 and does not make any calls.
	 */
	@Test
	void getDimensionsTest()
	{
		Tup3strR t = mock(Tup3strR.class);

		when(t.getDimensions()).thenCallRealMethod();

		assertEquals(3, t.getDimensions());

		verify(t).getDimensions();

		verifyNoMoreInteractions(t);
	}

	/**
	 * This test ensures, that the function {@link Tup3strR#getByIndex(int)}
	 * returns the x component for the index 0.
	 */
	@Test
	void getByIndex_XTest()
	{
		Tup3strR t = mock(Tup3strR.class);

		when(t.getByIndex(0)).thenCallRealMethod();

		when(t.getX()).thenReturn("a");

		assertEquals("a", t.getByIndex(0));

		verify(t).getByIndex(0);

		verify(t).getX();

		verifyNoMoreInteractions(t);
	}

	/**
	 * This test ensures, that the function {@link Tup3strR#getByIndex(int)}
	 * returns the y component for the index 1.
	 */
	@Test
	void getByIndex_YTest()
	{
		Tup3strR t = mock(Tup3strR.class);

		when(t.getByIndex(1)).thenCallRealMethod();

		when(t.getY()).thenReturn("a");

		assertEquals("a", t.getByIndex(1));

		verify(t).getByIndex(1);

		verify(t).getY();

		verifyNoMoreInteractions(t);
	}

	/**
	 * This test ensures, that the function {@link Tup3strR#getByIndex(int)}
	 * returns the z component for the index 2.
	 */
	@Test
	void getByIndex_ZTest()
	{
		Tup3strR t = mock(Tup3strR.class);

		when(t.getByIndex(2)).thenCallRealMethod();

		when(t.getZ()).thenReturn("a");

		assertEquals("a", t.getByIndex(2));

		verify(t).getByIndex(2);

		verify(t).getZ();

		verifyNoMoreInteractions(t);
	}

	/**
	 * This test ensures, that the function {@link Tup3strR#toArray(String[])}
	 * returns the given array with the components in the right order.
	 */
	@Test
	void toArrayWithExtractionParamTest()
	{
		Tup3strR t = mock(Tup3strR.class);

		String[] array = new String[3];

		when(t.toArray(array)).thenCallRealMethod();

		when(t.getX()).thenReturn("a");
		when(t.getY()).thenReturn("b");
		when(t.getZ()).thenReturn("c");

		assertSame(array, t.toArray(array));
		assertArrayEquals(new String[] {"a", "b", "c"}, array);

		verify(t).toArray(array);

		verify(t).getX();
		verify(t).getY();
		verify(t).getZ();

		verifyNoMoreInteractions(t);
	}
}