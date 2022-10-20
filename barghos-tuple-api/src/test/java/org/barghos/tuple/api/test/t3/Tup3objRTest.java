package org.barghos.tuple.api.test.t3;

import static org.junit.jupiter.api.Assertions.*;

import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;

import org.barghos.tuple.api.t3.Tup3objR;
import org.barghos.tuple.api.tn.TupobjR;

/**
 * This class provides component tests for the interface {@link Tup3objR}.
 * 
 * @author picatrix1899
 */
class Tup3objRTest
{

	/**
	 * This test ensures, that the interface extends the interface
	 * {@link TupobjR}.
	 */
	@Test
	void inheritance_TupRTest()
	{
		assertTrue(TupobjR.class.isAssignableFrom(Tup3objR.class));
	}

	/**
	 * this test ensures, that the function {@link Tup3objR#getDimensions()}
	 * always returns 3 and does not make any calls.
	 */
	@Test
	void getDimensionsTest()
	{
		Tup3objR t = mock(Tup3objR.class);

		when(t.getDimensions()).thenCallRealMethod();

		assertEquals(3, t.getDimensions());

		verify(t).getDimensions();

		verifyNoMoreInteractions(t);
	}

	/**
	 * This test ensures, that the function {@link Tup3objR#toArray(Object[])}
	 * returns the given array with the components in the right order.
	 */
	@Test
	void toArray_ExtractParamTest()
	{
		Tup3objR t = mock(Tup3objR.class);

		Object[] array = new Object[3];

		when(t.toArray(array)).thenCallRealMethod();

		when(t.getX()).thenReturn(1);
		when(t.getY()).thenReturn(1.0);
		when(t.getZ()).thenReturn("a");

		assertSame(array, t.toArray(array));
		assertArrayEquals(new Object[] {1, 1.0, "a"}, array);

		verify(t).toArray(array);

		verify(t).getX();
		verify(t).getY();
		verify(t).getZ();

		verifyNoMoreInteractions(t);
	}

	/**
	 * This test ensures, that the function {@link Tup3objR#getByIndex(int)}
	 * returns the x component for the index 0.
	 */
	@Test
	void getByIndex_XTest()
	{
		Tup3objR t = mock(Tup3objR.class);

		when(t.getByIndex(0)).thenCallRealMethod();

		when(t.getX()).thenReturn(1);

		assertEquals(1, t.getByIndex(0));

		verify(t).getByIndex(0);

		verify(t).getX();

		verifyNoMoreInteractions(t);
	}

	/**
	 * This test ensures, that the function {@link Tup3objR#getByIndex(int)}
	 * returns the y component for the index 1.
	 */
	@Test
	void getByIndex_YTest()
	{
		Tup3objR t = mock(Tup3objR.class);

		when(t.getByIndex(1)).thenCallRealMethod();

		when(t.getY()).thenReturn(1);

		assertEquals(1, t.getByIndex(1));

		verify(t).getByIndex(1);

		verify(t).getY();

		verifyNoMoreInteractions(t);
	}

	/**
	 * This test ensures, that the function {@link Tup3objR#getByIndex(int)}
	 * returns the z component for the index 2.
	 */
	@Test
	void getByIndex_ZTest()
	{
		Tup3objR t = mock(Tup3objR.class);

		when(t.getByIndex(2)).thenCallRealMethod();

		when(t.getZ()).thenReturn(1);

		assertEquals(1, t.getByIndex(2));

		verify(t).getByIndex(2);

		verify(t).getZ();

		verifyNoMoreInteractions(t);
	}
}