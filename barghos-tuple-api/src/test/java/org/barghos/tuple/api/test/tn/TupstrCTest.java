package org.barghos.tuple.api.test.tn;

import static org.junit.jupiter.api.Assertions.*;

import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;

import org.barghos.tuple.api.tn.TupstrC;
import org.barghos.tuple.api.tn.TupstrR;

/**
 * This class provides component tests for the interface {@link TupstrC}.
 * 
 * @author picatrix1899
 */
class TupstrCTest
{

	/**
	 * This test ensures, that the interface extends the interface
	 * {@link TupstrR}.
	 */
	@Test
	void inheritance_TupRTest()
	{
		assertTrue(TupstrR.class.isAssignableFrom(TupstrC.class));
	}

	/**
	 * This test ensures, that the function {@link TupstrC#set(TupstrR)} adopts
	 * the values from the input tuple and returns the current instance.
	 */
	@Test
	void set_TupleTest()
	{
		TupstrC t = mock(TupstrC.class);
		TupstrR t2 = mock(TupstrR.class);
		
		when(t.set(t2)).thenCallRealMethod();
		
		when(t2.toArray()).thenReturn(new String[] {"a", "b"});
		when(t.setArray(new String[] {"a", "b"})).thenReturn(t);
		
		assertSame(t, t.set(t2));
		
		verify(t).set(t2);
		
		verify(t2).toArray();
		verify(t).setArray(new String[] {"a", "b"});
		
		verifyNoMoreInteractions(t);
	}

	/**
	 * This test ensures, that the function {@link TupstrC#set(String)} adopts
	 * the value for each component and returns the current instance.
	 */
	@Test
	void set_ValueTest()
	{
		TupstrC t = mock(TupstrC.class);
		
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
	 * This test ensures, that the function {@link TupstrC#setArray(String[])}
	 * relays all array entries to the corresponding component by calling
	 * {@link TupstrC#setByIndex(int, String)} and returns the current instance.
	 */
	@Test
	void setArrayTest()
	{
		TupstrC t = mock(TupstrC.class);
		
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