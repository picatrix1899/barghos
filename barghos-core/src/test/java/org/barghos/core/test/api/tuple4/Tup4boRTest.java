package org.barghos.core.test.api.tuple4;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import org.barghos.core.api.tuple.TupboR;
import org.barghos.core.api.tuple4.Tup4boR;

/**
 * This claa provides component tests for the interface {@link Tup4boR}.
 * 
 * @author picatrix1899
 */
class Tup4boRTest
{
	/**
	 * This test ensures, that the interface extends the interface {@link TupboR}.
	 */
	@Test
	void inheritance_TupbigdRTest()
	{
		assertTrue(TupboR.class.isAssignableFrom(Tup4boR.class));
	}
	
	/**
	 * this test ensures, that the function {@link Tup4boR#getDimensions()} always
	 * returns 4 and does not make any calls.
	 */
	@Test
	void getDimensionsTest()
	{
		Tup4boR t = mock(Tup4boR.class);
		
		when(t.getDimensions()).thenCallRealMethod();
		
		assertEquals(4, t.getDimensions());
		
		verify(t).getDimensions();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the default implementation of the function {@link Tup4boR#getNewInstance(Tup4boR)} calls
	 * the function {@link Tup4boR#getNewInstance(boolean, boolean, boolean, boolean)} with the correct components.
	 */
	@Test
	void getNewInstance_Tuple2Test()
	{
		Tup4boR original = mock(Tup4boR.class);
		Tup4boR newInstance = mock(Tup4boR.class);
		Tup4boR t = mock(Tup4boR.class);
		
		when(t.getNewInstance(original)).thenCallRealMethod();
		
		when(original.getX()).thenReturn(true);
		when(original.getY()).thenReturn(false);
		when(original.getZ()).thenReturn(true);
		when(original.getW()).thenReturn(false);
		when(t.getNewInstance(true, false, true, false)).thenReturn(newInstance);
		
		assertSame(newInstance, t.getNewInstance(original));
		
		verify(t).getNewInstance(original);
		
		verify(original).getX();
		verify(original).getY();
		verify(original).getZ();
		verify(original).getW();
		verify(t).getNewInstance(true, false, true, false);
		
		verifyNoMoreInteractions(t, original);
	}
	
	/**
	 * This test ensures, that the default implementation of the function {@link Tup4boR#getNewInstance(boolean)} calls
	 * the function {@link Tup4boR#getNewInstance(boolean, boolean, boolean, boolean)} with the correct components.
	 */
	@Test
	void getNewInstance_ValueTest()
	{
		Tup4boR newInstance = mock(Tup4boR.class);
		Tup4boR t = mock(Tup4boR.class);
		
		when(t.getNewInstance(true)).thenCallRealMethod();

		when(t.getNewInstance(true, true, true, true)).thenReturn(newInstance);
		
		assertSame(newInstance, t.getNewInstance(true));
		
		verify(t).getNewInstance(true);
		
		verify(t).getNewInstance(true, true, true, true);
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the default implementation of the function {@link Tup4boR#getNewInstance(TupboR)} calls
	 * the function {@link Tup4boR#getNewInstance(boolean, boolean, boolean, boolean)} with the correct components.
	 */
	@Test
	void getNewInstance_TupleTest()
	{
		TupboR original = mock(TupboR.class);
		Tup4boR newInstance = mock(Tup4boR.class);
		Tup4boR t = mock(Tup4boR.class);
		
		when(t.getNewInstance(original)).thenCallRealMethod();
		
		when(original.getArray()).thenReturn(new boolean[] {true, false, true, false});
		when(t.getNewInstance(true, false, true, false)).thenReturn(newInstance);
		
		assertSame(newInstance, t.getNewInstance(original));
		
		verify(t).getNewInstance(original);
		
		verify(original).getArray();
		verify(t).getNewInstance(true, false, true, false);
		
		verifyNoMoreInteractions(t, original);
	}
	
	/**
	 * This test ensures, that the default implementation of the function {@link Tup4boR#getNewInstanceFromArray(boolean[])} calls
	 * the function {@link Tup4boR#getNewInstance(boolean, boolean, boolean, boolean)} with the correct components.
	 */
	@Test
	void getNewInstanceFromArrayTest()
	{
		Tup4boR newInstance = mock(Tup4boR.class);
		Tup4boR t = mock(Tup4boR.class);
		
		when(t.getNewInstanceFromArray(new boolean[] {true, false, true, false})).thenCallRealMethod();

		when(t.getNewInstance(true, false, true, false)).thenReturn(newInstance);
		
		assertSame(newInstance, t.getNewInstanceFromArray(new boolean[] {true, false, true, false}));
		
		verify(t).getNewInstanceFromArray(new boolean[] {true, false, true, false});
		
		verify(t).getNewInstance(true, false, true, false);
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4boR#getArray()} returns
	 * an array with the components in the right order.
	 */
	@Test
	void getArrayTest()
	{
		Tup4boR t = mock(Tup4boR.class);
		
		when(t.getArray()).thenCallRealMethod();
		
		when(t.getX()).thenReturn(true);
		when(t.getY()).thenReturn(false);
		when(t.getZ()).thenReturn(true);
		when(t.getW()).thenReturn(false);
		
		assertArrayEquals(new boolean[] {true, false, true, false}, t.getArray());
		
		verify(t).getArray();
		
		verify(t).getX();
		verify(t).getY();
		verify(t).getZ();
		verify(t).getW();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4boR#getByIndex(int)} returns
	 * the x component for the index 0.
	 */
	@Test
	void getByIndex_XTest()
	{
		Tup4boR t = mock(Tup4boR.class);
		
		when(t.getByIndex(0)).thenCallRealMethod();
		
		when(t.getX()).thenReturn(true);
		
		assertEquals(true, t.getByIndex(0));

		verify(t).getByIndex(0);
		
		verify(t).getX();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4boR#getByIndex(int)} returns
	 * the y component for the index 1.
	 */
	@Test
	void getByIndex_YTest()
	{
		Tup4boR t = mock(Tup4boR.class);
		
		when(t.getByIndex(1)).thenCallRealMethod();
		
		when(t.getY()).thenReturn(true);
		
		assertEquals(true, t.getByIndex(1));

		verify(t).getByIndex(1);
		
		verify(t).getY();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4boR#getByIndex(int)} returns
	 * the z component for the index 2.
	 */
	@Test
	void getByIndex_ZTest()
	{
		Tup4boR t = mock(Tup4boR.class);
		
		when(t.getByIndex(2)).thenCallRealMethod();
		
		when(t.getZ()).thenReturn(true);
		
		assertEquals(true, t.getByIndex(2));

		verify(t).getByIndex(2);
		
		verify(t).getZ();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4boR#getByIndex(int)} returns
	 * the w component for the index 3.
	 */
	@Test
	void getByIndex_WTest()
	{
		Tup4boR t = mock(Tup4boR.class);
		
		when(t.getByIndex(3)).thenCallRealMethod();
		
		when(t.getW()).thenReturn(true);
		
		assertEquals(true, t.getByIndex(3));

		verify(t).getByIndex(3);
		
		verify(t).getW();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4boR#getByIndex(int)} throws
	 * an {@link IndexOutOfBoundsException} for an index different than 0, 1, 2 or 3.
	 */
	@Test
	void getByIndex_ExceptionTest()
	{
		Tup4boR t = mock(Tup4boR.class);
		
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