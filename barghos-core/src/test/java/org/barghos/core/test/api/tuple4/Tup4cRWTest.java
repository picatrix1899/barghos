package org.barghos.core.test.api.tuple4;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import org.barghos.core.api.tuple.TupcR;
import org.barghos.core.api.tuple.TupcRW;
import org.barghos.core.api.tuple4.Tup4cR;
import org.barghos.core.api.tuple4.Tup4cRW;
import org.barghos.core.api.tuple4.Tup4cW;

/**
 * This class provides comoponent tests for the interface {@link Tup4cRW}.
 * 
 * @author picatrix1899
 */
class Tup4cRWTest
{
	/**
	 * This test ensures, that the interface extends the interface {@link Tup4cR}.
	 */
	@Test
	void inheritance_Tup4cRTest()
	{
		assertTrue(Tup4cR.class.isAssignableFrom(Tup4cRW.class));
	}
	
	/**
	 * This test ensures, that the interface extends the interface {@link Tup4cW}.
	 */
	@Test
	void inheritance_Tup4cWTest()
	{
		assertTrue(Tup4cW.class.isAssignableFrom(Tup4cRW.class));
	}
	
	/**
	 * This test ensures, that the interface extends the interface {@link TupcRW}.
	 */
	@Test
	void inheritance_TupcRWTest()
	{
		assertTrue(TupcRW.class.isAssignableFrom(Tup4cRW.class));
	}
	
	/**
	 * This test ensures, that the default implementation of the function {@link Tup4cRW#getNewInstance(Tup4cR)} calls
	 * the function {@link Tup4cRW#getNewInstance(char, char, char, char)} with the correct components.
	 */
	@Test
	void getNewInstance_Tuple2Test()
	{
		Tup4cR original = mock(Tup4cR.class);
		Tup4cRW newInstance = mock(Tup4cRW.class);
		Tup4cRW t = mock(Tup4cRW.class);
		
		when(t.getNewInstance(original)).thenCallRealMethod();
		
		when(original.getX()).thenReturn('a');
		when(original.getY()).thenReturn('b');
		when(original.getZ()).thenReturn('c');
		when(original.getW()).thenReturn('d');
		when(t.getNewInstance('a', 'b', 'c', 'd')).thenReturn(newInstance);
		
		assertSame(newInstance, t.getNewInstance(original));
		
		verify(t).getNewInstance(original);
		
		verify(original).getX();
		verify(original).getY();
		verify(original).getZ();
		verify(original).getW();
		verify(t).getNewInstance('a', 'b', 'c', 'd');
		
		verifyNoMoreInteractions(t, original);
	}
	
	/**
	 * This test ensures, that the default implementation of the function {@link Tup4cRW#getNewInstance(char)} calls
	 * the function {@link Tup4cRW#getNewInstance(char, char, char, char)} with the correct components.
	 */
	@Test
	void getNewInstance_ValueTest()
	{
		Tup4cRW newInstance = mock(Tup4cRW.class);
		Tup4cRW t = mock(Tup4cRW.class);
		
		when(t.getNewInstance('a')).thenCallRealMethod();

		when(t.getNewInstance('a', 'a', 'a', 'a')).thenReturn(newInstance);
		
		assertSame(newInstance, t.getNewInstance('a'));
		
		verify(t).getNewInstance('a');
		
		verify(t).getNewInstance('a', 'a', 'a', 'a');
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the default implementation of the function {@link Tup4cRW#getNewInstance(TupcR)} calls
	 * the function {@link Tup4cRW#getNewInstance(char, char, char, char)} with the correct components.
	 */
	@Test
	void getNewInstance_TupleTest()
	{
		TupcR original = mock(TupcR.class);
		Tup4cRW newInstance = mock(Tup4cRW.class);
		Tup4cRW t = mock(Tup4cRW.class);
		
		when(t.getNewInstance(original)).thenCallRealMethod();
		
		when(original.getArray()).thenReturn(new char[] {'a', 'b', 'c', 'd'});
		when(t.getNewInstance('a', 'b', 'c', 'd')).thenReturn(newInstance);
		
		assertSame(newInstance, t.getNewInstance(original));
		
		verify(t).getNewInstance(original);
		
		verify(original).getArray();
		verify(t).getNewInstance('a', 'b', 'c', 'd');
		
		verifyNoMoreInteractions(t, original);
	}
	
	/**
	 * This test ensures, that the default implementation of the function {@link Tup4cRW#getNewInstanceFromArray(char[])} calls
	 * the function {@link Tup4cRW#getNewInstance(char, char, char, char)} with the correct components.
	 */
	@Test
	void getNewInstanceFromArrayTest()
	{
		Tup4cRW newInstance = mock(Tup4cRW.class);
		Tup4cRW t = mock(Tup4cRW.class);
		
		when(t.getNewInstanceFromArray(new char[] {'a', 'b', 'c', 'd'})).thenCallRealMethod();

		when(t.getNewInstance('a', 'b', 'c', 'd')).thenReturn(newInstance);
		
		assertSame(newInstance, t.getNewInstanceFromArray(new char[] {'a', 'b', 'c', 'd'}));
		
		verify(t).getNewInstanceFromArray(new char[] {'a', 'b', 'c', 'd'});
		
		verify(t).getNewInstance('a', 'b', 'c', 'd');
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * this test ensures, that the function {@link Tup4cRW#getDimensions()} always
	 * returns 4 and does not make any calls.
	 */
	@Test
	void getDimensionsTest()
	{
		Tup4cRW t = mock(Tup4cRW.class);
		
		when(t.getDimensions()).thenCallRealMethod();
		
		assertEquals(4, t.getDimensions());
		
		verify(t).getDimensions();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4cRW#set(Tup4cR)} adopts the
	 * values from the input tuple and returns the current instance.
	 */
	@Test
	void set_Tuple2Test()
	{
		Tup4cRW t = mock(Tup4cRW.class);
		Tup4cR t2 = mock(Tup4cR.class);
		
		when(t.set(t2)).thenCallRealMethod();
		
		when(t2.getX()).thenReturn('a');
		when(t2.getY()).thenReturn('b');
		when(t2.getZ()).thenReturn('c');
		when(t2.getW()).thenReturn('d');
		when(t.set('a', 'b', 'c', 'd')).thenReturn(t);
		
		assertSame(t, t.set(t2));
		
		verify(t).set(t2);
		
		verify(t2).getX();
		verify(t2).getY();
		verify(t2).getZ();
		verify(t2).getW();
		verify(t).set('a', 'b', 'c', 'd');
		
		verifyNoMoreInteractions(t, t2);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4cRW#set(char)} adopts the
	 * value for each component and returns the current instance.
	 */
	@Test
	void set_ValueTest()
	{
		Tup4cRW t = mock(Tup4cRW.class);
		
		when(t.set('a')).thenCallRealMethod();
		
		when(t.set('a', 'a', 'a', 'a')).thenReturn(t);
		
		assertSame(t, t.set('a'));
		
		verify(t).set('a');

		verify(t).set('a', 'a', 'a', 'a');
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4cRW#set(char, char, char, char)} adopts
	 * the values and returns the current instance.
	 */
	@Test
	void setTest()
	{
		Tup4cRW t = mock(Tup4cRW.class);
		
		when(t.set('a', 'b', 'c', 'd')).thenCallRealMethod();
		
		when(t.setX('a')).thenReturn(t);
		when(t.setY('b')).thenReturn(t);
		when(t.setZ('c')).thenReturn(t);
		when(t.setW('d')).thenReturn(t);
		
		assertSame(t, t.set('a', 'b', 'c', 'd'));
		
		verify(t).set('a', 'b', 'c', 'd');

		verify(t).setX('a');
		verify(t).setY('b');
		verify(t).setZ('c');
		verify(t).setW('d');
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4cRW#set(TupcR)} adopts the
	 * values from the input tuple and returns the current instance.
	 */
	@Test
	void set_TupleTest()
	{
		Tup4cRW t = mock(Tup4cRW.class);
		TupcR t2 = mock(TupcR.class);
		
		when(t.set(t2)).thenCallRealMethod();
		
		when(t2.getArray()).thenReturn(new char[] {'a', 'b', 'c', 'd'});
		when(t.set('a', 'b', 'c', 'd')).thenReturn(t);

		assertSame(t, t.set(t2));
		
		verify(t).set(t2);
		
		verify(t2).getArray();
		verify(t).set('a', 'b', 'c', 'd');

		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4cRW#setArray(char[])} adopts the
	 * values and returns the current instance.
	 */
	@Test
	void setArrayTest()
	{
		Tup4cRW t = mock(Tup4cRW.class);
		
		when(t.setArray(new char[] {'a', 'b', 'c', 'd'})).thenCallRealMethod();
		
		when(t.set('a', 'b', 'c', 'd')).thenReturn(t);
		
		assertSame(t, t.setArray(new char[] {'a', 'b', 'c', 'd'}));
		
		verify(t).setArray(new char[] {'a', 'b', 'c', 'd'});
		
		verify(t).set('a', 'b', 'c', 'd');
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4cRW#setByIndex(int, char)} adopts the
	 * value to the x component if the index is 0 and returns the current instance.
	 */
	@Test
	void setByIndex_XTest()
	{
		Tup4cRW t = mock(Tup4cRW.class);
		
		when(t.setByIndex(0, 'a')).thenCallRealMethod();
		
		when(t.setX('a')).thenReturn(t);
		
		assertSame(t, t.setByIndex(0, 'a'));
		
		verify(t).setByIndex(0, 'a');
		
		verify(t).setX('a');
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4cRW#setByIndex(int, char)} adopts the
	 * value to the y component if the index is 1 and returns the current instance.
	 */
	@Test
	void setByIndex_YTest()
	{
		Tup4cRW t = mock(Tup4cRW.class);
		
		when(t.setByIndex(1, 'a')).thenCallRealMethod();
		
		when(t.setY('a')).thenReturn(t);
		
		assertSame(t, t.setByIndex(1, 'a'));
		
		verify(t).setByIndex(1, 'a');
		
		verify(t).setY('a');
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4cRW#setByIndex(int, char)} adopts the
	 * value to the z component if the index is 2 and returns the current instance.
	 */
	@Test
	void setByIndex_ZTest()
	{
		Tup4cRW t = mock(Tup4cRW.class);
		
		when(t.setByIndex(2, 'a')).thenCallRealMethod();
		
		when(t.setZ('a')).thenReturn(t);
		
		assertSame(t, t.setByIndex(2, 'a'));
		
		verify(t).setByIndex(2, 'a');
		
		verify(t).setZ('a');
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4cRW#setByIndex(int, char)} adopts the
	 * value to the w component if the index is 3 and returns the current instance.
	 */
	@Test
	void setByIndex_WTest()
	{
		Tup4cRW t = mock(Tup4cRW.class);
		
		when(t.setByIndex(3, 'a')).thenCallRealMethod();
		
		when(t.setW('a')).thenReturn(t);
		
		assertSame(t, t.setByIndex(3, 'a'));
		
		verify(t).setByIndex(3, 'a');
		
		verify(t).setW('a');
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4cRW#setByIndex(int, char)} throws
	 * an {@link IndexOutOfBoundsException} for an index different than 0, 1, 2 or 3.
	 */
	@Test
	void setByIndex_ExceptionTest()
	{
		Tup4cRW t = mock(Tup4cRW.class);
		
		when(t.setByIndex(4, 'a')).thenCallRealMethod();

		assertThrows(IndexOutOfBoundsException.class, new Executable() {
			public void execute() throws Throwable
			{
				t.setByIndex(4, 'a');
			}
		});

		verify(t).setByIndex(4, 'a');

		verifyNoMoreInteractions(t);
	}
}
