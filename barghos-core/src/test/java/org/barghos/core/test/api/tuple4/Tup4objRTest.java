package org.barghos.core.test.api.tuple4;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import org.barghos.core.api.tuple.TupobjR;
import org.barghos.core.api.tuple4.Tup4objR;

/**
 * This class provides component tests for the interface {@link Tup4objR}.
 * 
 * @author picatrix1899
 */
class Tup4objRTest
{
	/**
	 * This test ensures, that the interface extends the interface {@link TupobjR}.
	 */
	@Test
	void inheritance_TupobjRTest()
	{
		assertTrue(TupobjR.class.isAssignableFrom(Tup4objR.class));
	}
	
	/**
	 * This test ensures, that the function {@link Tup4objR#isValid()} returns true,
	 * if none of the components is null.
	 */
	@Test
	void isValidTest()
	{
		Tup4objR t = mock(Tup4objR.class);
		
		when(t.isValid()).thenCallRealMethod();
		
		when(t.getX()).thenReturn(1);
		when(t.getY()).thenReturn(1.0);
		when(t.getZ()).thenReturn("a");
		when(t.getW()).thenReturn('a');
		
		assertEquals(true, t.isValid());
		
		verify(t).isValid();
		
		verify(t).getX();
		verify(t).getY();
		verify(t).getZ();
		verify(t).getW();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4objR#isValid()} returns false,
	 * if the x component is null.
	 */
	@Test
	void isValid_Fail_XTest()
	{
		Tup4objR t = mock(Tup4objR.class);
		
		when(t.isValid()).thenCallRealMethod();
		
		when(t.getX()).thenReturn(null);

		assertEquals(false, t.isValid());
		
		verify(t).isValid();
		
		verify(t).getX();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4objR#isValid()} returns false,
	 * if the y component is null.
	 */
	@Test
	void isValid_Fail_YTest()
	{
		Tup4objR t = mock(Tup4objR.class);
		
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
	 * This test ensures, that the function {@link Tup4objR#isValid()} returns false,
	 * if the z component is null.
	 */
	@Test
	void isValid_Fail_ZTest()
	{
		Tup4objR t = mock(Tup4objR.class);
		
		when(t.isValid()).thenCallRealMethod();
		
		when(t.getX()).thenReturn(1);
		when(t.getY()).thenReturn(1.0);
		when(t.getZ()).thenReturn(null);

		assertEquals(false, t.isValid());
		
		verify(t).isValid();
		
		verify(t).getX();
		verify(t).getY();
		verify(t).getZ();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4objR#isValid()} returns false,
	 * if the w component is null.
	 */
	@Test
	void isValid_Fail_WTest()
	{
		Tup4objR t = mock(Tup4objR.class);
		
		when(t.isValid()).thenCallRealMethod();
		
		when(t.getX()).thenReturn(1);
		when(t.getY()).thenReturn(1.0);
		when(t.getZ()).thenReturn("a");

		assertEquals(false, t.isValid());
		
		verify(t).isValid();
		
		verify(t).getX();
		verify(t).getY();
		verify(t).getZ();
		verify(t).getW();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * this test ensures, that the function {@link Tup4objR#getDimensions()} always
	 * returns 4 and does not make any calls.
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
	 * This test ensures, that the default implementation of the function {@link Tup4objR#getNewInstance(Tup4objR)} calls
	 * the function {@link Tup4objR#getNewInstance(Object, Object, Object, Object)} with the correct components.
	 */
	@Test
	void getNewInstance_Tuple2Test()
	{
		Tup4objR original = mock(Tup4objR.class);
		Tup4objR newInstance = mock(Tup4objR.class);
		Tup4objR t = mock(Tup4objR.class);
		
		when(t.getNewInstance(original)).thenCallRealMethod();
		
		when(original.getX()).thenReturn(1);
		when(original.getY()).thenReturn(1.0);
		when(original.getZ()).thenReturn("a");
		when(original.getW()).thenReturn('a');
		when(t.getNewInstance(1, 1.0, "a", 'a')).thenReturn(newInstance);
		
		assertSame(newInstance, t.getNewInstance(original));
		
		verify(t).getNewInstance(original);
		
		verify(original).getX();
		verify(original).getY();
		verify(original).getZ();
		verify(original).getW();
		verify(t).getNewInstance(1, 1.0, "a", 'a');
		
		verifyNoMoreInteractions(t, original);
	}
	
	/**
	 * This test ensures, that the default implementation of the function {@link Tup4objR#getNewInstance(Object)} calls
	 * the function {@link Tup4objR#getNewInstance(Object, Object, Object, Object)} with the correct components.
	 */
	@Test
	void getNewInstance_ValueTest()
	{
		Tup4objR newInstance = mock(Tup4objR.class);
		Tup4objR t = mock(Tup4objR.class);
		
		when(t.getNewInstance(1)).thenCallRealMethod();

		when(t.getNewInstance(1, 1, 1, 1)).thenReturn(newInstance);
		
		assertSame(newInstance, t.getNewInstance(1));
		
		verify(t).getNewInstance(1);
		
		verify(t).getNewInstance(1, 1, 1, 1);
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the default implementation of the function {@link Tup4objR#getNewInstance(TupobjR)} calls
	 * the function {@link Tup4objR#getNewInstance(Object, Object, Object, Object)} with the correct components.
	 */
	@Test
	void getNewInstance_TupleTest()
	{
		TupobjR original = mock(TupobjR.class);
		Tup4objR newInstance = mock(Tup4objR.class);
		Tup4objR t = mock(Tup4objR.class);
		
		when(t.getNewInstance(original)).thenCallRealMethod();
		
		when(original.getArray()).thenReturn(new Object[] {1, 1.0, "a", 'a'});
		when(t.getNewInstance(1, 1.0, "a", 'a')).thenReturn(newInstance);
		
		assertSame(newInstance, t.getNewInstance(original));
		
		verify(t).getNewInstance(original);
		
		verify(original).getArray();
		verify(t).getNewInstance(1, 1.0, "a", 'a');
		
		verifyNoMoreInteractions(t, original);
	}
	
	/**
	 * This test ensures, that the default implementation of the function {@link Tup4objR#getNewInstanceFromArray(Object[])} calls
	 * the function {@link Tup4objR#getNewInstance(Object, Object, Object, Object)} with the correct components.
	 */
	@Test
	void getNewInstanceFromArrayTest()
	{
		Tup4objR newInstance = mock(Tup4objR.class);
		Tup4objR t = mock(Tup4objR.class);
		
		when(t.getNewInstanceFromArray(new Object[] {1, 1.0, "a", 'a'})).thenCallRealMethod();

		when(t.getNewInstance(1, 1.0, "a", 'a')).thenReturn(newInstance);
		
		assertSame(newInstance, t.getNewInstanceFromArray(new Object[] {1, 1.0, "a", 'a'}));
		
		verify(t).getNewInstanceFromArray(new Object[] {1, 1.0, "a", 'a'});
		
		verify(t).getNewInstance(1, 1.0, "a", 'a');
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4objR#getArray()} returns
	 * an array with the components in the right order.
	 */
	@Test
	void getArrayTest()
	{
		Tup4objR t = mock(Tup4objR.class);
		
		when(t.getArray()).thenCallRealMethod();
		
		when(t.getX()).thenReturn(1);
		when(t.getY()).thenReturn(1.0);
		when(t.getZ()).thenReturn("a");
		when(t.getW()).thenReturn('a');
		
		assertArrayEquals(new Object[] {1, 1.0, "a", 'a'}, t.getArray());
		
		verify(t).getArray();
		
		verify(t).getX();
		verify(t).getY();
		verify(t).getZ();
		verify(t).getW();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4objR#getByIndex(int)} returns
	 * the x component for the index 0.
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
	 * This test ensures, that the function {@link Tup4objR#getByIndex(int)} returns
	 * the y component for the index 1.
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
	 * This test ensures, that the function {@link Tup4objR#getByIndex(int)} returns
	 * the z component for the index 2.
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
	 * This test ensures, that the function {@link Tup4objR#getByIndex(int)} returns
	 * the w component for the index 3.
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
	 * This test ensures, that the function {@link Tup4objR#getByIndex(int)} throws
	 * an {@link IndexOutOfBoundsException} for an index different than 0, 1, 2 or 3.
	 */
	@Test
	void getByIndex_ExceptionTest()
	{
		Tup4objR t = mock(Tup4objR.class);
		
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