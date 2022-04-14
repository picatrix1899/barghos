package org.barghos.core.test.api.tuple2;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import org.barghos.core.api.tuple.TupobjR;
import org.barghos.core.api.tuple2.Tup2objR;

/**
 * This class provides component tests for the interface {@link Tup2objR}.
 * 
 * @author picatrix1899
 */
class Tup2objRTest
{
	/**
	 * This test ensures, that the interface extends the interface {@link TupobjR}.
	 */
	@Test
	void inheritance_TupobjRTest()
	{
		assertTrue(TupobjR.class.isAssignableFrom(Tup2objR.class));
	}
	
	/**
	 * This test ensures, that the function {@link Tup2objR#isValid()} returns true,
	 * if none of the components is null.
	 */
	@Test
	void isValidTest()
	{
		Tup2objR t = mock(Tup2objR.class);
		
		when(t.isValid()).thenCallRealMethod();
		
		when(t.getX()).thenReturn(1);
		when(t.getY()).thenReturn(1.0);
		
		assertEquals(true, t.isValid());
		
		verify(t).isValid();
		
		verify(t).getX();
		verify(t).getY();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup2objR#isValid()} returns false,
	 * if the x component is null.
	 */
	@Test
	void isValid_Fail_XTest()
	{
		Tup2objR t = mock(Tup2objR.class);
		
		when(t.isValid()).thenCallRealMethod();
		
		when(t.getX()).thenReturn(null);

		assertEquals(false, t.isValid());
		
		verify(t).isValid();
		
		verify(t).getX();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup2objR#isValid()} returns false,
	 * if the y component is null.
	 */
	@Test
	void isValid_Fail_YTest()
	{
		Tup2objR t = mock(Tup2objR.class);
		
		when(t.isValid()).thenCallRealMethod();
		
		when(t.getX()).thenReturn(1);
		when(t.getY()).thenReturn(null);

		assertEquals(false, t.isValid());
		
		verify(t).isValid();
		
		verify(t).getX();
		verify(t).getY();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * this test ensures, that the function {@link Tup2objR#getDimensions()} always
	 * returns 2 and does not make any calls.
	 */
	@Test
	void getDimensionsTest()
	{
		Tup2objR t = mock(Tup2objR.class);
		
		when(t.getDimensions()).thenCallRealMethod();
		
		assertEquals(2, t.getDimensions());
		
		verify(t).getDimensions();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup2objR#getArray(Object[])} returns
	 * the given array with the components in the right order.
	 */
	@Test
	void toArray_QueryTest()
	{
		Tup2objR t = mock(Tup2objR.class);
		
		Object[] array = new Object[2];
		
		when(t.toArray(array)).thenCallRealMethod();
		
		when(t.getX()).thenReturn(1);
		when(t.getY()).thenReturn(1.0);
		
		assertSame(array, t.toArray(array));
		assertArrayEquals(new Object[] {1, 1.0}, array);
		
		verify(t).toArray(array);
		
		verify(t).getX();
		verify(t).getY();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup2objR#getByIndex(int)} returns
	 * the x component for the index 0.
	 */
	@Test
	void getByIndex_XTest()
	{
		Tup2objR t = mock(Tup2objR.class);
		
		when(t.getByIndex(0)).thenCallRealMethod();
		
		when(t.getX()).thenReturn(1);
		
		assertEquals(1, t.getByIndex(0));

		verify(t).getByIndex(0);
		
		verify(t).getX();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup2objR#getByIndex(int)} returns
	 * the y component for the index 1.
	 */
	@Test
	void getByIndex_YTest()
	{
		Tup2objR t = mock(Tup2objR.class);
		
		when(t.getByIndex(1)).thenCallRealMethod();
		
		when(t.getY()).thenReturn(1);
		
		assertEquals(1, t.getByIndex(1));

		verify(t).getByIndex(1);
		
		verify(t).getY();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup2objR#getByIndex(int)} throws
	 * an {@link IndexOutOfBoundsException} for an index different than 0 or 1.
	 */
	@Test
	void getByIndex_ExceptionTest()
	{
		Tup2objR t = mock(Tup2objR.class);
		
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