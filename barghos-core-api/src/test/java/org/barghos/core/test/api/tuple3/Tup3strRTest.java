package org.barghos.core.test.api.tuple3;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import org.barghos.core.api.tuple.TupstrR;
import org.barghos.core.api.tuple3.Tup3strR;

/**
 * This class provides component tests for the interface {@link Tup3strR}.
 * 
 * @author picatrix1899
 */
class Tup3strRTest
{
	/**
	 * This test ensures, that the interface extends the interface {@link TupstrR}.
	 */
	@Test
	void inheritance_TupstrRTest()
	{
		assertTrue(TupstrR.class.isAssignableFrom(Tup3strR.class));
	}
	
	/**
	 * This test ensures, that the function {@link Tup3strR#isValid()} returns true,
	 * if none of the components is null.
	 */
	@Test
	void isValidTest()
	{
		Tup3strR t = mock(Tup3strR.class);
		
		when(t.isValid()).thenCallRealMethod();
		
		when(t.getX()).thenReturn("a");
		when(t.getY()).thenReturn("b");
		when(t.getZ()).thenReturn("c");
		
		assertEquals(true, t.isValid());
		
		verify(t).isValid();
		
		verify(t).getX();
		verify(t).getY();
		verify(t).getZ();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup3strR#isValid()} returns false,
	 * if the x component is null.
	 */
	@Test
	void isValid_Fail_XTest()
	{
		Tup3strR t = mock(Tup3strR.class);
		
		when(t.isValid()).thenCallRealMethod();
		
		when(t.getX()).thenReturn(null);

		assertEquals(false, t.isValid());
		
		verify(t).isValid();
		
		verify(t).getX();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup3strR#isValid()} returns false,
	 * if the y component is null.
	 */
	@Test
	void isValid_Fail_YTest()
	{
		Tup3strR t = mock(Tup3strR.class);
		
		when(t.isValid()).thenCallRealMethod();
		
		when(t.getX()).thenReturn("a");
		when(t.getY()).thenReturn(null);

		assertEquals(false, t.isValid());
		
		verify(t).isValid();
		
		verify(t).getX();
		verify(t).getY();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup3strR#isValid()} returns false,
	 * if the z component is null.
	 */
	@Test
	void isValid_Fail_ZTest()
	{
		Tup3strR t = mock(Tup3strR.class);
		
		when(t.isValid()).thenCallRealMethod();
		
		when(t.getX()).thenReturn("a");
		when(t.getY()).thenReturn("b");
		when(t.getZ()).thenReturn(null);
		
		assertEquals(false, t.isValid());
		
		verify(t).isValid();
		
		verify(t).getX();
		verify(t).getY();
		verify(t).getZ();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * this test ensures, that the function {@link Tup3strR#getDimensions()} always
	 * returns 3 and does not make any calls.
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
	 * This test ensures, that the function {@link Tup3strR#toArray(String[])} returns
	 * the given array with the components in the right order.
	 */
	@Test
	void toArray_QueryTest()
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
	
	/**
	 * This test ensures, that the function {@link Tup3strR#getByIndex(int)} returns
	 * the x component for the index 0.
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
	 * This test ensures, that the function {@link Tup3strR#getByIndex(int)} returns
	 * the y component for the index 1.
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
	 * This test ensures, that the function {@link Tup3strR#getByIndex(int)} returns
	 * the z component for the index 2.
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
	 * This test ensures, that the function {@link Tup3strR#getByIndex(int)} throws
	 * an {@link IndexOutOfBoundsException} for an index different than 0, 1 or 2.
	 */
	@Test
	void getByIndex_ExceptionTest()
	{
		Tup3strR t = mock(Tup3strR.class);
		
		when(t.getByIndex(3)).thenCallRealMethod();

		assertThrows(IndexOutOfBoundsException.class, new Executable() {
			public void execute() throws Throwable
			{
				t.getByIndex(3);
			}
		});

		verify(t).getByIndex(3);

		verifyNoMoreInteractions(t);
	}
}