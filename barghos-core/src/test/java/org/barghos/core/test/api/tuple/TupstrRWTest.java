package org.barghos.core.test.api.tuple;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;

import org.barghos.core.api.tuple.TupstrR;
import org.barghos.core.api.tuple.TupstrRW;
import org.barghos.core.api.tuple.TupstrW;

/**
 * This class provides component tests for the interface {@link TupstrRW}.
 * 
 * @author picatrix1899
 */
class TupstrRWTest
{
	/**
	 * This test ensures, that the interface extends the interface {@link TupstrR}.
	 */
	@Test
	void inheritance_TupstrRTest()
	{
		assertTrue(TupstrR.class.isAssignableFrom(TupstrRW.class));
	}
	
	/**
	 * This test ensures, that the interface extends the interface {@link TupstrW}.
	 */
	@Test
	void inheritance_TupstrWTest()
	{
		assertTrue(TupstrW.class.isAssignableFrom(TupstrRW.class));
	}
	
	/**
	 * This test ensures, that the default implementation of the function {@link TupstrRW#getNewInstance(TupstrR)} calls
	 * the function {@link TupstrRW#getNewInstance(String[])} with the correct components.
	 */
	@Test
	void getNewInstance_TupleTest()
	{
		TupstrR original = mock(TupstrR.class);
		TupstrRW newInstance = mock(TupstrRW.class);
		TupstrRW t = mock(TupstrRW.class);
		
		when(t.getNewInstance(original)).thenCallRealMethod();
		
		when(original.getArray()).thenReturn(new String[] {"a", "b"});
		when(t.getNewInstanceFromArray(new String[] {"a", "b"})).thenReturn(newInstance);
		
		assertSame(newInstance, t.getNewInstance(original));
		
		verify(t).getNewInstance(original);

		verify(original).getArray();
		verify(t).getNewInstanceFromArray(new String[] {"a", "b"});
		
		verifyNoMoreInteractions(t, original);
	}
	
	/**
	 * This test ensures, that the default implementation of the function {@link TupstrRW#getNewInstance(String)} calls
	 * the function {@link TupstrRW#getNewInstanceFromArray(String[])} with the correct components.
	 */
	@Test
	void getNewInstance_ValueTest()
	{
		TupstrRW newInstance = mock(TupstrRW.class);
		TupstrRW t = mock(TupstrRW.class);
		
		when(t.getNewInstance("a")).thenCallRealMethod();
		
		when(t.getDimensions()).thenReturn(2);
		when(t.getNewInstanceFromArray(new String[] {"a", "a"})).thenReturn(newInstance);
		
		assertSame(newInstance, t.getNewInstance("a"));
		
		verify(t).getNewInstance("a");

		verify(t).getDimensions();
		verify(t).getNewInstanceFromArray(new String[] {"a", "a"});
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link TupstrRW#set(TupstrR)} adopts the
	 * values from the input tuple and returns the current instance.
	 */
	@Test
	void set_TupleTest()
	{
		TupstrRW t = mock(TupstrRW.class);
		TupstrR t2 = mock(TupstrR.class);
		
		when(t.set(t2)).thenCallRealMethod();
		
		when(t2.getArray()).thenReturn(new String[] {"a", "b"});
		when(t.setArray(new String[] {"a", "b"})).thenReturn(t);
		
		assertSame(t, t.set(t2));
		
		verify(t).set(t2);
		
		verify(t2).getArray();
		verify(t).setArray(new String[] {"a", "b"});
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link TupstrRW#set(String)} adopts the
	 * value for each component and returns the current instance.
	 */
	@Test
	void set_ValueTest()
	{
		TupstrRW t = mock(TupstrRW.class);
		
		when(t.set("a")).thenCallRealMethod();
		
		when(t.getDimensions()).thenReturn(2);
		when(t.setArray(new String[] {"a", "a"})).thenReturn(t);
		
		assertSame(t, t.set("a"));
		
		verify(t).set("a");
		
		verify(t).getDimensions();
		verify(t).setArray(new String[] {"a", "a"});
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link TupstrRW#setArray(String[])} relays
	 * all array entries to the corresponding component by calling {@link TupstrRW#setByIndex(int, String)}
	 * and returns the current instance.
	 */
	@Test
	void setArrayTest()
	{
		TupstrRW t = mock(TupstrRW.class);
		
		when(t.setArray(new String[] {"a", "b"})).thenCallRealMethod();
		
		when(t.getDimensions()).thenReturn(2);
		
		assertSame(t, t.setArray(new String[] {"a", "b"}));
		
		verify(t).setArray(new String[] {"a", "b"});
		
		verify(t).getDimensions();
		verify(t).setByIndex(0, "a");
		verify(t).setByIndex(1, "b");
		
		verifyNoMoreInteractions(t);
	}
}