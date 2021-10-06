package org.barghos.core.test.api.tuple2;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import org.barghos.core.api.tuple.TupcR;
import org.barghos.core.api.tuple.TupcRW;
import org.barghos.core.api.tuple2.Tup2cR;
import org.barghos.core.api.tuple2.Tup2cRW;
import org.barghos.core.api.tuple2.Tup2cW;

/**
 * This class provides comoponent tests for the interface {@link Tup2cRW}.
 * 
 * @author picatrix1899
 */
class Tup2cRWTest
{
	/**
	 * This test ensures, that the interface extends the interface {@link Tup2cR}.
	 */
	@Test
	void inheritance_Tup2cRTest()
	{
		assertTrue(Tup2cR.class.isAssignableFrom(Tup2cRW.class));
	}
	
	/**
	 * This test ensures, that the interface extends the interface {@link Tup2cW}.
	 */
	@Test
	void inheritance_Tup2cWTest()
	{
		assertTrue(Tup2cW.class.isAssignableFrom(Tup2cRW.class));
	}
	
	/**
	 * This test ensures, that the interface extends the interface {@link TupcRW}.
	 */
	@Test
	void inheritance_TupcRWTest()
	{
		assertTrue(TupcRW.class.isAssignableFrom(Tup2cRW.class));
	}
	
	/**
	 * This test ensures, that the default implementation of the function {@link Tup2cRW#getNewInstance(Tup2cR)} calls
	 * the function {@link Tup2cRW#getNewInstance(char, char)} with the correct components.
	 */
	@Test
	void getNewInstance_Tuple2Test()
	{
		Tup2cR original = mock(Tup2cR.class);
		Tup2cRW newInstance = mock(Tup2cRW.class);
		Tup2cRW t = mock(Tup2cRW.class);
		
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
	 * This test ensures, that the default implementation of the function {@link Tup2cRW#getNewInstance(char)} calls
	 * the function {@link Tup2cRW#getNewInstance(char, char)} with the correct components.
	 */
	@Test
	void getNewInstance_ValueTest()
	{
		Tup2cRW newInstance = mock(Tup2cRW.class);
		Tup2cRW t = mock(Tup2cRW.class);
		
		when(t.getNewInstance('a')).thenCallRealMethod();

		when(t.getNewInstance('a', 'a')).thenReturn(newInstance);
		
		assertSame(newInstance, t.getNewInstance('a'));
		
		verify(t).getNewInstance('a');
		
		verify(t).getNewInstance('a', 'a');
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the default implementation of the function {@link Tup2cRW#getNewInstance(TupcR)} calls
	 * the function {@link Tup2cRW#getNewInstance(char, char)} with the correct components.
	 */
	@Test
	void getNewInstance_TupleTest()
	{
		TupcR original = mock(TupcR.class);
		Tup2cRW newInstance = mock(Tup2cRW.class);
		Tup2cRW t = mock(Tup2cRW.class);
		
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
	 * This test ensures, that the default implementation of the function {@link Tup2cRW#getNewInstanceFromArray(char[])} calls
	 * the function {@link Tup2cRW#getNewInstance(char, char)} with the correct components.
	 */
	@Test
	void getNewInstanceFromArrayTest()
	{
		Tup2cRW newInstance = mock(Tup2cRW.class);
		Tup2cRW t = mock(Tup2cRW.class);
		
		when(t.getNewInstanceFromArray(new char[] {'a', 'b'})).thenCallRealMethod();

		when(t.getNewInstance('a', 'b')).thenReturn(newInstance);
		
		assertSame(newInstance, t.getNewInstanceFromArray(new char[] {'a', 'b'}));
		
		verify(t).getNewInstanceFromArray(new char[] {'a', 'b'});
		
		verify(t).getNewInstance('a', 'b');
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * this test ensures, that the function {@link Tup2cRW#getDimensions()} always
	 * returns 2 and does not make any calls.
	 */
	@Test
	void getDimensionsTest()
	{
		Tup2cRW t = mock(Tup2cRW.class);
		
		when(t.getDimensions()).thenCallRealMethod();
		
		assertEquals(2, t.getDimensions());
		
		verify(t).getDimensions();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup2cRW#set(Tup2cR)} adopts the
	 * values from the input tuple and returns the current instance.
	 */
	@Test
	void set_Tuple2Test()
	{
		Tup2cRW t = mock(Tup2cRW.class);
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
	 * This test ensures, that the function {@link Tup2cRW#set(char)} adopts the
	 * value for each component and returns the current instance.
	 */
	@Test
	void set_ValueTest()
	{
		Tup2cRW t = mock(Tup2cRW.class);
		
		when(t.set('a')).thenCallRealMethod();
		
		when(t.set('a', 'a')).thenReturn(t);
		
		assertSame(t, t.set('a'));
		
		verify(t).set('a');

		verify(t).set('a', 'a');
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup2cRW#set(char, char)} adopts
	 * the values and returns the current instance.
	 */
	@Test
	void setTest()
	{
		Tup2cRW t = mock(Tup2cRW.class);
		
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
	 * This test ensures, that the function {@link Tup2cRW#set(TupcR)} adopts the
	 * values from the input tuple and returns the current instance.
	 */
	@Test
	void set_TupleTest()
	{
		Tup2cRW t = mock(Tup2cRW.class);
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
	 * This test ensures, that the function {@link Tup2cRW#setArray(char[])} adopts the
	 * values and returns the current instance.
	 */
	@Test
	void setArrayTest()
	{
		Tup2cRW t = mock(Tup2cRW.class);
		
		when(t.setArray(new char[] {'a', 'b'})).thenCallRealMethod();
		
		when(t.set('a', 'b')).thenReturn(t);
		
		assertSame(t, t.setArray(new char[] {'a', 'b'}));
		
		verify(t).setArray(new char[] {'a', 'b'});
		
		verify(t).set('a', 'b');
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup2cRW#setByIndex(int, char)} adopts the
	 * value to the x component if the index is 0 and returns the current instance.
	 */
	@Test
	void setByIndex_XTest()
	{
		Tup2cRW t = mock(Tup2cRW.class);
		
		when(t.setByIndex(0, 'a')).thenCallRealMethod();
		
		when(t.setX('a')).thenReturn(t);
		
		assertSame(t, t.setByIndex(0, 'a'));
		
		verify(t).setByIndex(0, 'a');
		
		verify(t).setX('a');
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup2cRW#setByIndex(int, char)} adopts the
	 * value to the y component if the index is 1 and returns the current instance.
	 */
	@Test
	void setByIndex_YTest()
	{
		Tup2cRW t = mock(Tup2cRW.class);
		
		when(t.setByIndex(1, 'a')).thenCallRealMethod();
		
		when(t.setY('a')).thenReturn(t);
		
		assertSame(t, t.setByIndex(1, 'a'));
		
		verify(t).setByIndex(1, 'a');
		
		verify(t).setY('a');
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup2cRW#setByIndex(int, char)} throws
	 * an {@link IndexOutOfBoundsException} for an index different than 0 or 1.
	 */
	@Test
	void setByIndex_ExceptionTest()
	{
		Tup2cRW t = mock(Tup2cRW.class);
		
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
