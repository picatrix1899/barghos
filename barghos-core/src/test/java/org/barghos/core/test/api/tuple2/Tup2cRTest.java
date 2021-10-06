package org.barghos.core.test.api.tuple2;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import org.barghos.core.api.tuple.TupcR;
import org.barghos.core.api.tuple2.Tup2cR;

/**
 * This claa provides component tests for the interface {@link Tup2cR}.
 * 
 * @author picatrix1899
 */
class Tup2cRTest
{
	/**
	 * This test ensures, that the interface extends the interface {@link TupcR}.
	 */
	@Test
	void inheritance_TupcRTest()
	{
		assertTrue(TupcR.class.isAssignableFrom(Tup2cR.class));
	}
	
	/**
	 * this test ensures, that the function {@link Tup2cR#getDimensions()} always
	 * returns 2 and does not make any calls.
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
	 * This test ensures, that the default implementation of the function {@link Tup2cR#getNewInstance(Tup2cR)} calls
	 * the function {@link Tup2cR#getNewInstance(char, char)} with the correct components.
	 */
	@Test
	void getNewInstance_Tuple2Test()
	{
		Tup2cR original = mock(Tup2cR.class);
		Tup2cR newInstance = mock(Tup2cR.class);
		Tup2cR t = mock(Tup2cR.class);
		
		when(t.getNewInstance(original)).thenCallRealMethod();
		
		when(original.getX()).thenReturn('a');
		when(original.getY()).thenReturn('b');
		when(t.getNewInstance('a', 'b')).thenReturn(newInstance);
		
		assertSame(newInstance, t.getNewInstance(original));
		
		verify(t).getNewInstance(original);
		
		verify(original).getX();
		verify(original).getY();
		verify(t).getNewInstance('a', 'b');
		
		verifyNoMoreInteractions(t, original);
	}
	
	/**
	 * This test ensures, that the default implementation of the function {@link Tup2cR#getNewInstance(char)} calls
	 * the function {@link Tup2cR#getNewInstance(char, char)} with the correct components.
	 */
	@Test
	void getNewInstance_ValueTest()
	{
		Tup2cR newInstance = mock(Tup2cR.class);
		Tup2cR t = mock(Tup2cR.class);
		
		when(t.getNewInstance('a')).thenCallRealMethod();

		when(t.getNewInstance('a', 'a')).thenReturn(newInstance);
		
		assertSame(newInstance, t.getNewInstance('a'));
		
		verify(t).getNewInstance('a');
		
		verify(t).getNewInstance('a', 'a');
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the default implementation of the function {@link Tup2cR#getNewInstance(TupcR)} calls
	 * the function {@link Tup2cR#getNewInstance(char, char)} with the correct components.
	 */
	@Test
	void getNewInstance_TupleTest()
	{
		TupcR original = mock(TupcR.class);
		Tup2cR newInstance = mock(Tup2cR.class);
		Tup2cR t = mock(Tup2cR.class);
		
		when(t.getNewInstance(original)).thenCallRealMethod();
		
		when(original.getArray()).thenReturn(new char[] {'a', 'b'});
		when(t.getNewInstance('a', 'b')).thenReturn(newInstance);
		
		assertSame(newInstance, t.getNewInstance(original));
		
		verify(t).getNewInstance(original);
		
		verify(original).getArray();
		verify(t).getNewInstance('a', 'b');
		
		verifyNoMoreInteractions(t, original);
	}
	
	/**
	 * This test ensures, that the default implementation of the function
	 * {@link Tup2cR#getNewInstanceFromArray(char[])} calls the function
	 * {@link Tup2cR#getNewInstance(char, char)} with the correct components.
	 */
	@Test
	void getNewInstanceFromArrayTest()
	{
		Tup2cR newInstance = mock(Tup2cR.class);
		Tup2cR t = mock(Tup2cR.class);
		
		when(t.getNewInstanceFromArray(new char[] {'a', 'b'})).thenCallRealMethod();

		when(t.getNewInstance('a', 'b')).thenReturn(newInstance);
		
		assertSame(newInstance, t.getNewInstanceFromArray(new char[] {'a', 'b'}));
		
		verify(t).getNewInstanceFromArray(new char[] {'a', 'b'});
		
		verify(t).getNewInstance('a', 'b');
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup2cR#getArray()} returns
	 * an array with the components in the right order.
	 */
	@Test
	void getArrayTest()
	{
		Tup2cR t = mock(Tup2cR.class);
		
		when(t.getArray()).thenCallRealMethod();
		
		when(t.getX()).thenReturn('a');
		when(t.getY()).thenReturn('b');
		
		assertArrayEquals(new char[] {'a', 'b'}, t.getArray());
		
		verify(t).getArray();
		
		verify(t).getX();
		verify(t).getY();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup2cR#getByIndex(int)} returns
	 * the x component for the index 0.
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
	 * This test ensures, that the function {@link Tup2cR#getByIndex(int)} returns
	 * the y component for the index 1.
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
	
	/**
	 * This test ensures, that the function {@link Tup2cR#getByIndex(int)} throws
	 * an {@link IndexOutOfBoundsException} for an index different than 0 or 1.
	 */
	@Test
	void getByIndex_ExceptionTest()
	{
		Tup2cR t = mock(Tup2cR.class);
		
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