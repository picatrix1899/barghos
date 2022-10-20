package org.barghos.tuple.api.test.t2;

import static org.junit.jupiter.api.Assertions.*;

import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;

import org.barghos.tuple.api.t2.Tup2cR;
import org.barghos.tuple.api.tn.TupcR;

/**
 * This claa provides component tests for the interface {@link Tup2cR}.
 * 
 * @author picatrix1899
 */
class Tup2cRTest
{

	/**
	 * This test ensures, that the interface extends the interface
	 * {@link TupcR}.
	 */
	@Test
	void inheritance_TupRTest()
	{
		assertTrue(TupcR.class.isAssignableFrom(Tup2cR.class));
	}

	/**
	 * this test ensures, that the function {@link Tup2cR#getDimensions()}
	 * always returns 2 and does not make any calls.
	 */
	@Test
	void getDimensionsTest()
	{
		Tup2cR t = mock(Tup2cR.class);

		when(t.getDimensions()).thenCallRealMethod();

		assertEquals(2, t.getDimensions());

		verify(t).getDimensions();
		verifyNoMoreInteractions(t);
	}

	/**
	 * This test ensures, that the function {@link Tup2cR#toArray(char[])}
	 * returns the given array with the components in the right order.
	 */
	@Test
	void toArray_ExtractParamTest()
	{
		Tup2cR t = mock(Tup2cR.class);

		char[] array = new char[2];

		when(t.toArray(array)).thenCallRealMethod();

		when(t.getX()).thenReturn('a');
		when(t.getY()).thenReturn('b');

		assertSame(array, t.toArray(array));
		assertArrayEquals(new char[] {'a', 'b'}, array);

		verify(t).toArray(array);

		verify(t).getX();
		verify(t).getY();

		verifyNoMoreInteractions(t);
	}

	/**
	 * This test ensures, that the function {@link Tup2cR#getByIndex(int)}
	 * returns the x component for the index 0.
	 */
	@Test
	void getByIndex_XTest()
	{
		Tup2cR t = mock(Tup2cR.class);

		when(t.getByIndex(0)).thenCallRealMethod();

		when(t.getX()).thenReturn('a');

		assertEquals('a', t.getByIndex(0));

		verify(t).getByIndex(0);

		verify(t).getX();

		verifyNoMoreInteractions(t);
	}

	/**
	 * This test ensures, that the function {@link Tup2cR#getByIndex(int)}
	 * returns the y component for the index 1.
	 */
	@Test
	void getByIndex_YTest()
	{
		Tup2cR t = mock(Tup2cR.class);

		when(t.getByIndex(1)).thenCallRealMethod();

		when(t.getY()).thenReturn('a');

		assertEquals('a', t.getByIndex(1));

		verify(t).getByIndex(1);

		verify(t).getY();

		verifyNoMoreInteractions(t);
	}
}