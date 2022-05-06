package org.barghos.core.test.api.tuple4;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import org.barghos.core.api.tuple.TupstrR;
import org.barghos.core.api.tuple4.Tup4strR;

/**
 * This class provides component tests for the interface {@link Tup4strR}.
 * 
 * @author picatrix1899
 */
class Tup4strRTest
{
	/**
	 * This test ensures, that the interface extends the interface {@link TupstrR}.
	 */
	@Test
	void inheritance_TupstrRTest()
	{
		assertTrue(TupstrR.class.isAssignableFrom(Tup4strR.class));
	}
	
	/**
	 * This test ensures, that the function {@link Tup4strR#isValid()} returns true,
	 * if none of the components is null.
	 */
	@Test
	void isValidTest()
	{
		Tup4strR t = mock(Tup4strR.class);
		
		when(t.isValid()).thenCallRealMethod();
		
		when(t.getX()).thenReturn("a");
		when(t.getY()).thenReturn("b");
		when(t.getZ()).thenReturn("c");
		when(t.getW()).thenReturn("d");
		
		assertEquals(true, t.isValid());
		
		verify(t).isValid();
		
		verify(t).getX();
		verify(t).getY();
		verify(t).getZ();
		verify(t).getW();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4strR#isValid()} returns false,
	 * if the x component is null.
	 */
	@Test
	void isValid_Fail_XTest()
	{
		Tup4strR t = mock(Tup4strR.class);
		
		when(t.isValid()).thenCallRealMethod();
		
		when(t.getX()).thenReturn(null);

		assertEquals(false, t.isValid());
		
		verify(t).isValid();
		
		verify(t).getX();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4strR#isValid()} returns false,
	 * if the y component is null.
	 */
	@Test
	void isValid_Fail_YTest()
	{
		Tup4strR t = mock(Tup4strR.class);
		
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
	 * This test ensures, that the function {@link Tup4strR#isValid()} returns false,
	 * if the z component is null.
	 */
	@Test
	void isValid_Fail_ZTest()
	{
		Tup4strR t = mock(Tup4strR.class);
		
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
	 * This test ensures, that the function {@link Tup4strR#isValid()} returns false,
	 * if the w component is null.
	 */
	@Test
	void isValid_Fail_WTest()
	{
		Tup4strR t = mock(Tup4strR.class);
		
		when(t.isValid()).thenCallRealMethod();
		
		when(t.getX()).thenReturn("a");
		when(t.getY()).thenReturn("b");
		when(t.getZ()).thenReturn("c");
		when(t.getW()).thenReturn(null);
		
		assertEquals(false, t.isValid());
		
		verify(t).isValid();
		
		verify(t).getX();
		verify(t).getY();
		verify(t).getZ();
		verify(t).getW();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * this test ensures, that the function {@link Tup4strR#getDimensions()} always
	 * returns 4 and does not make any calls.
	 */
	@Test
	void getDimensionsTest()
	{
		Tup4strR t = mock(Tup4strR.class);
		
		when(t.getDimensions()).thenCallRealMethod();
		
		assertEquals(4, t.getDimensions());
		
		verify(t).getDimensions();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4strR#toArray(String[])} returns
	 * the given array with the components in the right order.
	 */
	@Test
	void toArray_QueryTest()
	{
		Tup4strR t = mock(Tup4strR.class);
		
		String[] array = new String[4];
		
		when(t.toArray(array)).thenCallRealMethod();
		
		when(t.getX()).thenReturn("a");
		when(t.getY()).thenReturn("b");
		when(t.getZ()).thenReturn("c");
		when(t.getW()).thenReturn("d");
		
		assertSame(array, t.toArray(array));
		assertArrayEquals(new String[] {"a", "b", "c", "d"}, array);
		
		verify(t).toArray(array);
		
		verify(t).getX();
		verify(t).getY();
		verify(t).getZ();
		verify(t).getW();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4strR#getByIndex(int)} returns
	 * the x component for the index 0.
	 */
	@Test
	void getByIndex_XTest()
	{
		Tup4strR t = mock(Tup4strR.class);
		
		when(t.getByIndex(0)).thenCallRealMethod();
		
		when(t.getX()).thenReturn("a");
		
		assertEquals("a", t.getByIndex(0));

		verify(t).getByIndex(0);
		
		verify(t).getX();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4strR#getByIndex(int)} returns
	 * the y component for the index 1.
	 */
	@Test
	void getByIndex_YTest()
	{
		Tup4strR t = mock(Tup4strR.class);
		
		when(t.getByIndex(1)).thenCallRealMethod();
		
		when(t.getY()).thenReturn("a");
		
		assertEquals("a", t.getByIndex(1));

		verify(t).getByIndex(1);
		
		verify(t).getY();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4strR#getByIndex(int)} returns
	 * the z component for the index 2.
	 */
	@Test
	void getByIndex_ZTest()
	{
		Tup4strR t = mock(Tup4strR.class);
		
		when(t.getByIndex(2)).thenCallRealMethod();
		
		when(t.getZ()).thenReturn("a");
		
		assertEquals("a", t.getByIndex(2));

		verify(t).getByIndex(2);
		
		verify(t).getZ();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4strR#getByIndex(int)} returns
	 * the w component for the index 3.
	 */
	@Test
	void getByIndex_WTest()
	{
		Tup4strR t = mock(Tup4strR.class);
		
		when(t.getByIndex(3)).thenCallRealMethod();
		
		when(t.getW()).thenReturn("a");
		
		assertEquals("a", t.getByIndex(3));

		verify(t).getByIndex(3);
		
		verify(t).getW();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4strR#getByIndex(int)} throws
	 * an {@link IndexOutOfBoundsException} for an index different than 0, 1, 2 or 3.
	 */
	@Test
	void getByIndex_ExceptionTest()
	{
		Tup4strR t = mock(Tup4strR.class);
		
		when(t.getByIndex(4)).thenCallRealMethod();

		assertThrows(IndexOutOfBoundsException.class, new Executable() {
			public void execute() throws Throwable
			{
				t.getByIndex(4);
			}
		});

		verify(t).getByIndex(4);

		verifyNoMoreInteractions(t);
	}
}