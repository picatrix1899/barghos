package org.barghos.core.test.api.tuple4;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import org.barghos.core.api.tuple.TupcR;
import org.barghos.core.api.tuple.TupcW;
import org.barghos.core.api.tuple4.Tup4cR;
import org.barghos.core.api.tuple4.Tup4cW;

/**
 * This class provides component tests for the interface {@link Tup4cW}.
 * 
 * @author picatrix1899
 */
class Tup4cWTest
{
	/**
	 * This test ensures, that the interface extends the interface {@link TupcW}.
	 */
	@Test
	void inheritance_TupcWTest()
	{
		assertTrue(TupcW.class.isAssignableFrom(Tup4cW.class));
	}
	
	/**
	 * This test ensures, that the function {@link Tup4cW#set(Tup4cR)} adopts the
	 * values from the input tuple and returns the current instance.
	 */
	@Test
	void set_Tuple2Test()
	{
		Tup4cW t = mock(Tup4cW.class);
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
	 * This test ensures, that the function {@link Tup4cW#set(char)} adopts the
	 * value for each component and returns the current instance.
	 */
	@Test
	void set_ValueTest()
	{
		Tup4cW t = mock(Tup4cW.class);
		
		when(t.set('a')).thenCallRealMethod();
		
		when(t.set('a', 'a', 'a', 'a')).thenReturn(t);
		
		assertSame(t, t.set('a'));
		
		verify(t).set('a');

		verify(t).set('a', 'a', 'a', 'a');
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4cW#set(char, char, char, char)} adopts
	 * the values and returns the current instance.
	 */
	@Test
	void setTest()
	{
		Tup4cW t = mock(Tup4cW.class);
		
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
	 * This test ensures, that the function {@link Tup4cW#set(TupcR)} adopts the
	 * values from the input tuple and returns the current instance.
	 */
	@Test
	void set_TupleTest()
	{
		Tup4cW t = mock(Tup4cW.class);
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
	 * This test ensures, that the function {@link Tup4cW#getDimensions()} always
	 * returns 4 and does not do any calls.
	 */
	@Test
	void getDimensionsTest()
	{
		Tup4cW t = mock(Tup4cW.class);
		
		when(t.getDimensions()).thenCallRealMethod();
		
		assertEquals(4, t.getDimensions());
		
		verify(t).getDimensions();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4cW#setArray(char[])} adopts the
	 * values and returns the current instance.
	 */
	@Test
	void setArrayTest()
	{
		Tup4cW t = mock(Tup4cW.class);
		
		when(t.setArray(new char[] {'a', 'b', 'c', 'd'})).thenCallRealMethod();
		
		when(t.set('a', 'b', 'c', 'd')).thenReturn(t);
		
		assertSame(t, t.setArray(new char[] {'a', 'b', 'c', 'd'}));
		
		verify(t).setArray(new char[] {'a', 'b', 'c', 'd'});
		
		verify(t).set('a', 'b', 'c', 'd');
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4cW#setByIndex(int, char)} adopts the
	 * value to the x component if the index is 0 and returns the current instance.
	 */
	@Test
	void setByIndex_XTest()
	{
		Tup4cW t = mock(Tup4cW.class);
		
		when(t.setByIndex(0, 'a')).thenCallRealMethod();
		
		when(t.setX('a')).thenReturn(t);
		
		assertSame(t, t.setByIndex(0, 'a'));
		
		verify(t).setByIndex(0, 'a');
		
		verify(t).setX('a');
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4cW#setByIndex(int, char)} adopts the
	 * value to the y component if the index is 1 and returns the current instance.
	 */
	@Test
	void setByIndex_YTest()
	{
		Tup4cW t = mock(Tup4cW.class);
		
		when(t.setByIndex(1, 'a')).thenCallRealMethod();
		
		when(t.setY('a')).thenReturn(t);
		
		assertSame(t, t.setByIndex(1, 'a'));
		
		verify(t).setByIndex(1, 'a');
		
		verify(t).setY('a');
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4cW#setByIndex(int, char)} adopts the
	 * value to the z component if the index is 2 and returns the current instance.
	 */
	@Test
	void setByIndex_ZTest()
	{
		Tup4cW t = mock(Tup4cW.class);
		
		when(t.setByIndex(2, 'a')).thenCallRealMethod();
		
		when(t.setZ('a')).thenReturn(t);
		
		assertSame(t, t.setByIndex(2, 'a'));
		
		verify(t).setByIndex(2, 'a');
		
		verify(t).setZ('a');
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4cW#setByIndex(int, char)} adopts the
	 * value to the w component if the index is 3 and returns the current instance.
	 */
	@Test
	void setByIndex_WTest()
	{
		Tup4cW t = mock(Tup4cW.class);
		
		when(t.setByIndex(3, 'a')).thenCallRealMethod();
		
		when(t.setW('a')).thenReturn(t);
		
		assertSame(t, t.setByIndex(3, 'a'));
		
		verify(t).setByIndex(3, 'a');
		
		verify(t).setW('a');
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4cW#setByIndex(int, char)} throws
	 * an {@link IndexOutOfBoundsException} for an index different than 0, 1, 2 or 3.
	 */
	@Test
	void setByIndex_ExceptionTest()
	{
		Tup4cW t = mock(Tup4cW.class);
		
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