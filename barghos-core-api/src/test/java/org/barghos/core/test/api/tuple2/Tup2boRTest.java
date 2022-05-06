package org.barghos.core.test.api.tuple2;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import org.barghos.core.api.tuple.TupboR;
import org.barghos.core.api.tuple2.Tup2boR;

/**
 * This claa provides component tests for the interface {@link Tup2boR}.
 * 
 * @author picatrix1899
 */
class Tup2boRTest
{
	/**
	 * This test ensures, that the interface extends the interface {@link TupboR}.
	 */
	@Test
	void inheritance_TupbigdRTest()
	{
		assertTrue(TupboR.class.isAssignableFrom(Tup2boR.class));
	}
	
	/**
	 * this test ensures, that the function {@link Tup2boR#getDimensions()} always
	 * returns 2 and does not make any calls.
	 */
	@Test
	void getDimensionsTest()
	{
		Tup2boR t = mock(Tup2boR.class);
		
		when(t.getDimensions()).thenCallRealMethod();
		
		assertEquals(2, t.getDimensions());
		
		verify(t).getDimensions();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup2boR#toArray(boolean[])} returns
	 * the given array with the components in the right order.
	 */
	@Test
	void toArray_ExtractParamTest()
	{
		Tup2boR t = mock(Tup2boR.class);
		
		boolean[] array = new boolean[2];
		
		when(t.toArray(array)).thenCallRealMethod();
		
		when(t.getX()).thenReturn(true);
		when(t.getY()).thenReturn(false);
		
		assertSame(array, t.toArray(array));
		assertArrayEquals(new boolean[] {true, false}, array);
		
		verify(t).toArray(array);
		
		verify(t).getX();
		verify(t).getY();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup2boR#getByIndex(int)} returns
	 * the x component for the index 0.
	 */
	@Test
	void getByIndex_XTest()
	{
		Tup2boR t = mock(Tup2boR.class);
		
		when(t.getByIndex(0)).thenCallRealMethod();
		
		when(t.getX()).thenReturn(true);
		
		assertEquals(true, t.getByIndex(0));

		verify(t).getByIndex(0);
		
		verify(t).getX();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup2boR#getByIndex(int)} returns
	 * the y component for the index 1.
	 */
	@Test
	void getByIndex_YTest()
	{
		Tup2boR t = mock(Tup2boR.class);
		
		when(t.getByIndex(1)).thenCallRealMethod();
		
		when(t.getY()).thenReturn(true);
		
		assertEquals(true, t.getByIndex(1));

		verify(t).getByIndex(1);
		
		verify(t).getY();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup2boR#getByIndex(int)} throws
	 * an {@link IndexOutOfBoundsException} for an index different than 0 or 1.
	 */
	@Test
	void getByIndex_ExceptionTest()
	{
		Tup2boR t = mock(Tup2boR.class);
		
		when(t.getByIndex(2)).thenCallRealMethod();

		assertThrows(IndexOutOfBoundsException.class, new Executable() {
			public void execute() throws Throwable
			{
				t.getByIndex(2);
			}
		});

		verify(t).getByIndex(2);

		verifyNoMoreInteractions(t);
	}
}