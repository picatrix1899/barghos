package org.barghos.core.test.api.tuple;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;

import org.barghos.core.api.tuple.TupcR;
import org.barghos.core.api.tuple.TupcRW;
import org.barghos.core.api.tuple.TupcW;

/**
 * This class provides component tests for the interface {@link TupcRW}.
 * 
 * @author picatrix1899
 */
class TupcRWTest
{
	/**
	 * This test ensures, that the interface extends the interface {@link TupcR}.
	 */
	@Test
	void inheritance_TupcRTest()
	{
		assertTrue(TupcR.class.isAssignableFrom(TupcRW.class));
	}
	
	/**
	 * This test ensures, that the interface extends the interface {@link TupcW}.
	 */
	@Test
	void inheritance_TupcWTest()
	{
		assertTrue(TupcW.class.isAssignableFrom(TupcRW.class));
	}
	
	/**
	 * This test ensures, that the default implementation of the function {@link TupcRW#getNewInstance(TupcR)} calls
	 * the function {@link TupcRW#getNewInstance(char[])} with the correct components.
	 */
	@Test
	void getNewInstance_TupleTest()
	{
		TupcR original = mock(TupcR.class);
		TupcRW newInstance = mock(TupcRW.class);
		TupcRW t = mock(TupcRW.class);
		
		when(t.getNewInstance(original)).thenCallRealMethod();
		
		when(original.getArray()).thenReturn(new char[] {'a', 'b'});
		when(t.getNewInstanceFromArray(new char[] {'a', 'b'})).thenReturn(newInstance);
		
		assertSame(newInstance, t.getNewInstance(original));
		
		verify(t).getNewInstance(original);

		verify(original).getArray();
		verify(t).getNewInstanceFromArray(new char[] {'a', 'b'});
		
		verifyNoMoreInteractions(t, original);
	}
	
	/**
	 * This test ensures, that the default implementation of the function {@link TupcRW#getNewInstance(char)} calls
	 * the function {@link TupcRW#getNewInstanceFromArray(char[])} with the correct components.
	 */
	@Test
	void getNewInstance_ValueTest()
	{
		TupcRW newInstance = mock(TupcRW.class);
		TupcRW t = mock(TupcRW.class);
		
		when(t.getNewInstance('a')).thenCallRealMethod();
		
		when(t.getDimensions()).thenReturn(2);
		when(t.getNewInstanceFromArray(new char[] {'a', 'a'})).thenReturn(newInstance);
		
		assertSame(newInstance, t.getNewInstance('a'));
		
		verify(t).getNewInstance('a');

		verify(t).getDimensions();
		verify(t).getNewInstanceFromArray(new char[] {'a', 'a'});
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link TupcRW#set(TupcR)} adopts the
	 * values from the input tuple and returns the current instance.
	 */
	@Test
	void set_TupleTest()
	{
		TupcRW t = mock(TupcRW.class);
		TupcR t2 = mock(TupcR.class);
		
		when(t.set(t2)).thenCallRealMethod();
		
		when(t2.getArray()).thenReturn(new char[] {'a', 'b'});
		when(t.setArray(new char[] {'a', 'b'})).thenReturn(t);
		
		assertSame(t, t.set(t2));
		
		verify(t).set(t2);
		
		verify(t2).getArray();
		verify(t).setArray(new char[] {'a', 'b'});
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link TupcRW#set(char)} adopts the
	 * value for each component and returns the current instance.
	 */
	@Test
	void set_ValueTest()
	{
		TupcRW t = mock(TupcRW.class);
		
		when(t.set('a')).thenCallRealMethod();
		
		when(t.getDimensions()).thenReturn(2);
		when(t.setArray(new char[] {'a', 'a'})).thenReturn(t);
		
		assertSame(t, t.set('a'));
		
		verify(t).set('a');
		
		verify(t).getDimensions();
		verify(t).setArray(new char[] {'a', 'a'});
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link TupcRW#setArray(char[])} relays
	 * all array entries to the corresponding component by calling {@link TupcRW#setByIndex(int, char)}
	 * and returns the current instance.
	 */
	@Test
	void setArrayTest()
	{
		TupcRW t = mock(TupcRW.class);
		
		when(t.setArray(new char[] {'a', 'b'})).thenCallRealMethod();
		
		when(t.getDimensions()).thenReturn(2);
		
		assertSame(t, t.setArray(new char[] {'a', 'b'}));
		
		verify(t).setArray(new char[] {'a', 'b'});
		
		verify(t).getDimensions();
		verify(t).setByIndex(0, 'a');
		verify(t).setByIndex(1, 'b');
		
		verifyNoMoreInteractions(t);
	}
}