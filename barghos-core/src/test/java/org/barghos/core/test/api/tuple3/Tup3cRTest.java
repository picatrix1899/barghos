package org.barghos.core.test.api.tuple3;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import org.barghos.core.api.tuple.TupcR;
import org.barghos.core.api.tuple3.Tup3cR;

/**
 * This claa provides component tests for the interface {@link Tup3cR}.
 * 
 * @author picatrix1899
 */
class Tup3cRTest
{
	/**
	 * This test ensures, that the interface extends the interface {@link TupcR}.
	 */
	@Test
	void inheritance_TupcRTest()
	{
		assertTrue(TupcR.class.isAssignableFrom(Tup3cR.class));
	}
	
	/**
	 * this test ensures, that the function {@link Tup3cR#getDimensions()} always
	 * returns 3 and does not make any calls.
	 */
	@Test
	void getDimensionsTest()
	{
		Tup3cR t = mock(Tup3cR.class);
		
		when(t.getDimensions()).thenCallRealMethod();
		
		assertEquals(3, t.getDimensions());
		
		verify(t).getDimensions();
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the default implementation of the function {@link Tup3cR#getNewInstance(Tup3cR)} calls
	 * the function {@link Tup3cR#getNewInstance(char, char, char)} with the correct components.
	 */
	@Test
	void getNewInstance_Tuple2Test()
	{
		Tup3cR original = mock(Tup3cR.class);
		Tup3cR newInstance = mock(Tup3cR.class);
		Tup3cR t = mock(Tup3cR.class);
		
		when(t.getNewInstance(original)).thenCallRealMethod();
		
		when(original.getX()).thenReturn('a');
		when(original.getY()).thenReturn('b');
		when(original.getZ()).thenReturn('c');
		when(t.getNewInstance('a', 'b', 'c')).thenReturn(newInstance);
		
		assertSame(newInstance, t.getNewInstance(original));
		
		verify(t).getNewInstance(original);
		
		verify(original).getX();
		verify(original).getY();
		verify(original).getZ();
		verify(t).getNewInstance('a', 'b', 'c');
		
		verifyNoMoreInteractions(t, original);
	}
	
	/**
	 * This test ensures, that the default implementation of the function {@link Tup3cR#getNewInstance(char)} calls
	 * the function {@link Tup3cR#getNewInstance(char, char, char)} with the correct components.
	 */
	@Test
	void getNewInstance_ValueTest()
	{
		Tup3cR newInstance = mock(Tup3cR.class);
		Tup3cR t = mock(Tup3cR.class);
		
		when(t.getNewInstance('a')).thenCallRealMethod();

		when(t.getNewInstance('a', 'a', 'a')).thenReturn(newInstance);
		
		assertSame(newInstance, t.getNewInstance('a'));
		
		verify(t).getNewInstance('a');
		
		verify(t).getNewInstance('a', 'a', 'a');
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the default implementation of the function {@link Tup3cR#getNewInstance(TupcR)} calls
	 * the function {@link Tup3cR#getNewInstance(char, char, char)} with the correct components.
	 */
	@Test
	void getNewInstance_TupleTest()
	{
		TupcR original = mock(TupcR.class);
		Tup3cR newInstance = mock(Tup3cR.class);
		Tup3cR t = mock(Tup3cR.class);
		
		when(t.getNewInstance(original)).thenCallRealMethod();
		
		when(original.getArray()).thenReturn(new char[] {'a', 'b', 'c'});
		when(t.getNewInstance('a', 'b', 'c')).thenReturn(newInstance);
		
		assertSame(newInstance, t.getNewInstance(original));
		
		verify(t).getNewInstance(original);
		
		verify(original).getArray();
		verify(t).getNewInstance('a', 'b', 'c');
		
		verifyNoMoreInteractions(t, original);
	}
	
	/**
	 * This test ensures, that the default implementation of the function
	 * {@link Tup3cR#getNewInstanceFromArray(char[])} calls the function
	 * {@link Tup3cR#getNewInstance(char, char, char)} with the correct components.
	 */
	@Test
	void getNewInstanceFromArrayTest()
	{
		Tup3cR newInstance = mock(Tup3cR.class);
		Tup3cR t = mock(Tup3cR.class);
		
		when(t.getNewInstanceFromArray(new char[] {'a', 'b', 'c'})).thenCallRealMethod();

		when(t.getNewInstance('a', 'b', 'c')).thenReturn(newInstance);
		
		assertSame(newInstance, t.getNewInstanceFromArray(new char[] {'a', 'b', 'c'}));
		
		verify(t).getNewInstanceFromArray(new char[] {'a', 'b', 'c'});
		
		verify(t).getNewInstance('a', 'b', 'c');
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup3cR#getArray()} returns
	 * an array with the components in the right order.
	 */
	@Test
	void getArrayTest()
	{
		Tup3cR t = mock(Tup3cR.class);
		
		when(t.getArray()).thenCallRealMethod();
		
		when(t.getX()).thenReturn('a');
		when(t.getY()).thenReturn('b');
		when(t.getZ()).thenReturn('c');
		
		assertArrayEquals(new char[] {'a', 'b', 'c'}, t.getArray());
		
		verify(t).getArray();
		
		verify(t).getX();
		verify(t).getY();
		verify(t).getZ();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup3cR#getByIndex(int)} returns
	 * the x component for the index 0.
	 */
	@Test
	void getByIndex_XTest()
	{
		Tup3cR t = mock(Tup3cR.class);
		
		when(t.getByIndex(0)).thenCallRealMethod();
		
		when(t.getX()).thenReturn('a');
		
		assertEquals('a', t.getByIndex(0));

		verify(t).getByIndex(0);
		
		verify(t).getX();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup3cR#getByIndex(int)} returns
	 * the y component for the index 1.
	 */
	@Test
	void getByIndex_YTest()
	{
		Tup3cR t = mock(Tup3cR.class);
		
		when(t.getByIndex(1)).thenCallRealMethod();
		
		when(t.getY()).thenReturn('a');
		
		assertEquals('a', t.getByIndex(1));

		verify(t).getByIndex(1);
		
		verify(t).getY();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup3cR#getByIndex(int)} returns
	 * the z component for the index 2.
	 */
	@Test
	void getByIndex_ZTest()
	{
		Tup3cR t = mock(Tup3cR.class);
		
		when(t.getByIndex(2)).thenCallRealMethod();
		
		when(t.getZ()).thenReturn('a');
		
		assertEquals('a', t.getByIndex(2));

		verify(t).getByIndex(2);
		
		verify(t).getZ();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup3cR#getByIndex(int)} throws
	 * an {@link IndexOutOfBoundsException} for an index different than 0, 1 or 2.
	 */
	@Test
	void getByIndex_ExceptionTest()
	{
		Tup3cR t = mock(Tup3cR.class);
		
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