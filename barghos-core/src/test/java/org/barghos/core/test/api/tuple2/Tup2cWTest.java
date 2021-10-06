package org.barghos.core.test.api.tuple2;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import org.barghos.core.api.tuple.TupcR;
import org.barghos.core.api.tuple.TupcW;
import org.barghos.core.api.tuple2.Tup2cR;
import org.barghos.core.api.tuple2.Tup2cW;

/**
 * This class provides component tests for the interface {@link Tup2cW}.
 * 
 * @author picatrix1899
 */
class Tup2cWTest
{
	/**
	 * This test ensures, that the interface extends the interface {@link TupcW}.
	 */
	@Test
	void inheritance_TupcWTest()
	{
		assertTrue(TupcW.class.isAssignableFrom(Tup2cW.class));
	}
	
	/**
	 * This test ensures, that the function {@link Tup2cW#set(Tup2cR)} adopts the
	 * values from the input tuple and returns the current instance.
	 */
	@Test
	void set_Tuple2Test()
	{
		Tup2cW t = mock(Tup2cW.class);
		Tup2cR t2 = mock(Tup2cR.class);
		
		when(t.set(t2)).thenCallRealMethod();
		
		when(t2.getX()).thenReturn('a');
		when(t2.getY()).thenReturn('b');
		when(t.set('a', 'b')).thenReturn(t);
		
		assertSame(t, t.set(t2));
		
		verify(t).set(t2);
		
		verify(t2).getX();
		verify(t2).getY();
		verify(t).set('a', 'b');
		
		verifyNoMoreInteractions(t, t2);
	}
	
	/**
	 * This test ensures, that the function {@link Tup2cW#set(char)} adopts the
	 * value for each component and returns the current instance.
	 */
	@Test
	void set_ValueTest()
	{
		Tup2cW t = mock(Tup2cW.class);
		
		when(t.set('a')).thenCallRealMethod();
		
		when(t.set('a', 'a')).thenReturn(t);
		
		assertSame(t, t.set('a'));
		
		verify(t).set('a');

		verify(t).set('a', 'a');
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup2cW#set(char, char)} adopts
	 * the values and returns the current instance.
	 */
	@Test
	void setTest()
	{
		Tup2cW t = mock(Tup2cW.class);
		
		when(t.set('a', 'b')).thenCallRealMethod();
		
		when(t.setX('a')).thenReturn(t);
		when(t.setY('b')).thenReturn(t);
		
		assertSame(t, t.set('a', 'b'));
		
		verify(t).set('a', 'b');

		verify(t).setX('a');
		verify(t).setY('b');
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup2cW#set(TupcR)} adopts the
	 * values from the input tuple and returns the current instance.
	 */
	@Test
	void set_TupleTest()
	{
		Tup2cW t = mock(Tup2cW.class);
		TupcR t2 = mock(TupcR.class);
		
		when(t.set(t2)).thenCallRealMethod();
		
		when(t2.getArray()).thenReturn(new char[] {'a', 'b'});
		when(t.set('a', 'b')).thenReturn(t);

		assertSame(t, t.set(t2));
		
		verify(t).set(t2);
		
		verify(t2).getArray();
		verify(t).set('a', 'b');

		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup2cW#getDimensions()} always
	 * returns 2 and does not do any calls.
	 */
	@Test
	void getDimensionsTest()
	{
		Tup2cW t = mock(Tup2cW.class);
		
		when(t.getDimensions()).thenCallRealMethod();
		
		assertEquals(2, t.getDimensions());
		
		verify(t).getDimensions();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup2cW#setArray(char[])} adopts the
	 * values and returns the current instance.
	 */
	@Test
	void setArrayTest()
	{
		Tup2cW t = mock(Tup2cW.class);
		
		when(t.setArray(new char[] {'a', 'b'})).thenCallRealMethod();
		
		when(t.set('a', 'b')).thenReturn(t);
		
		assertSame(t, t.setArray(new char[] {'a', 'b'}));
		
		verify(t).setArray(new char[] {'a', 'b'});
		
		verify(t).set('a', 'b');
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup2cW#setByIndex(int, char)} adopts the
	 * value to the x component if the index is 0 and returns the current instance.
	 */
	@Test
	void setByIndex_XTest()
	{
		Tup2cW t = mock(Tup2cW.class);
		
		when(t.setByIndex(0, 'a')).thenCallRealMethod();
		
		when(t.setX('a')).thenReturn(t);
		
		assertSame(t, t.setByIndex(0, 'a'));
		
		verify(t).setByIndex(0, 'a');
		
		verify(t).setX('a');
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup2cW#setByIndex(int, char)} adopts the
	 * value to the y component if the index is 1 and returns the current instance.
	 */
	@Test
	void setByIndex_YTest()
	{
		Tup2cW t = mock(Tup2cW.class);
		
		when(t.setByIndex(1, 'a')).thenCallRealMethod();
		
		when(t.setY('a')).thenReturn(t);
		
		assertSame(t, t.setByIndex(1, 'a'));
		
		verify(t).setByIndex(1, 'a');
		
		verify(t).setY('a');
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup2cW#setByIndex(int, char)} throws
	 * an {@link IndexOutOfBoundsException} for an index different than 0 or 1.
	 */
	@Test
	void setByIndex_ExceptionTest()
	{
		Tup2cW t = mock(Tup2cW.class);
		
		when(t.setByIndex(2, 'a')).thenCallRealMethod();

		assertThrows(IndexOutOfBoundsException.class, new Executable() {
			public void execute() throws Throwable
			{
				t.setByIndex(2, 'a');
			}
		});

		verify(t).setByIndex(2, 'a');

		verifyNoMoreInteractions(t);
	}
}
