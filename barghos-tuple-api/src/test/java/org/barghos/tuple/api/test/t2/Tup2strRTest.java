package org.barghos.tuple.api.test.t2;

import static org.junit.jupiter.api.Assertions.*;

import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;

import org.barghos.tuple.api.t2.Tup2strR;
import org.barghos.tuple.api.tn.TupstrR;

/**
 * This class provides component tests for the interface {@link Tup2strR}.
 * 
 * @author picatrix1899
 */
class Tup2strRTest
{

	/**
	 * This test ensures, that the interface extends the interface
	 * {@link TupstrR}.
	 */
	@Test
	void inheritance_TupRTest()
	{
		assertTrue(TupstrR.class.isAssignableFrom(Tup2strR.class));
	}

	/**
	 * this test ensures, that the function {@link Tup2strR#getDimensions()}
	 * always returns 2 and does not make any calls.
	 */
	@Test
	void getDimensionsTest()
	{
		Tup2strR t = mock(Tup2strR.class);

		when(t.getDimensions()).thenCallRealMethod();

		assertEquals(2, t.getDimensions());

		verify(t).getDimensions();

		verifyNoMoreInteractions(t);
	}

	/**
	 * This test ensures, that the function {@link Tup2strR#getByIndex(int)}
	 * returns the x component for the index 0.
	 */
	@Test
	void getByIndex_XTest()
	{
		Tup2strR t = mock(Tup2strR.class);

		when(t.getByIndex(0)).thenCallRealMethod();

		when(t.getX()).thenReturn("a");

		assertEquals("a", t.getByIndex(0));

		verify(t).getByIndex(0);

		verify(t).getX();

		verifyNoMoreInteractions(t);
	}

	/**
	 * This test ensures, that the function {@link Tup2strR#getByIndex(int)}
	 * returns the y component for the index 1.
	 */
	@Test
	void getByIndex_YTest()
	{
		Tup2strR t = mock(Tup2strR.class);

		when(t.getByIndex(1)).thenCallRealMethod();

		when(t.getY()).thenReturn("a");

		assertEquals("a", t.getByIndex(1));

		verify(t).getByIndex(1);

		verify(t).getY();

		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup2strR#toArray(String[])}
	 * returns the given array with the components in the right order.
	 */
	@Test
	void toArrayWithExtractionParamTest()
	{
		Tup2strR t = mock(Tup2strR.class);

		String[] array = new String[2];

		when(t.toArray(array)).thenCallRealMethod();

		when(t.getX()).thenReturn("a");
		when(t.getY()).thenReturn("b");

		assertSame(array, t.toArray(array));
		assertArrayEquals(new String[] {"a", "b"}, array);

		verify(t).toArray(array);

		verify(t).getX();
		verify(t).getY();

		verifyNoMoreInteractions(t);
	}
}