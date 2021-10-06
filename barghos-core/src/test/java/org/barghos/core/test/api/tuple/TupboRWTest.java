package org.barghos.core.test.api.tuple;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;

import org.barghos.core.api.tuple.TupboR;
import org.barghos.core.api.tuple.TupboRW;
import org.barghos.core.api.tuple.TupboW;

/**
 * This class provides component tests for the interface {@link TupboRW}.
 * 
 * @author picatrix1899
 */
class TupboRWTest
{
	/**
	 * This test ensures, that the interface extends the interface {@link TupboR}.
	 */
	@Test
	void inheritance_TupboRTest()
	{
		assertTrue(TupboR.class.isAssignableFrom(TupboRW.class));
	}
	
	/**
	 * This test ensures, that the interface extends the interface {@link TupboW}.
	 */
	@Test
	void inheritance_TupboWTest()
	{
		assertTrue(TupboW.class.isAssignableFrom(TupboRW.class));
	}
	
	/**
	 * This test ensures, that the default implementation of the function {@link TupboRW#getNewInstance(TupboR)} calls
	 * the function {@link TupboRW#getNewInstance(boolean, boolean)} with the correct components.
	 */
	@Test
	void getNewInstance_TupleTest()
	{
		TupboR original = mock(TupboR.class);
		TupboRW newInstance = mock(TupboRW.class);
		TupboRW t = mock(TupboRW.class);
		
		when(t.getNewInstance(original)).thenCallRealMethod();
		
		when(original.getArray()).thenReturn(new boolean[] {true, false});
		when(t.getNewInstanceFromArray(new boolean[] {true, false})).thenReturn(newInstance);
		
		assertSame(newInstance, t.getNewInstance(original));
		
		verify(t).getNewInstance(original);

		verify(original).getArray();
		verify(t).getNewInstanceFromArray(new boolean[] {true, false});
		
		verifyNoMoreInteractions(t, original);
	}
	
	/**
	 * This test ensures, that the default implementation of the function {@link TupboRW#getNewInstance(boolean)} calls
	 * the function {@link TupboRW#getNewInstance(boolean, boolean)} with the correct components.
	 */
	@Test
	void getNewInstance_ValueTest()
	{
		TupboRW newInstance = mock(TupboRW.class);
		TupboRW t = mock(TupboRW.class);
		
		when(t.getNewInstance(true)).thenCallRealMethod();
		
		when(t.getDimensions()).thenReturn(2);
		when(t.getNewInstanceFromArray(new boolean[] {true, true})).thenReturn(newInstance);
		
		assertSame(newInstance, t.getNewInstance(true));
		
		verify(t).getNewInstance(true);

		verify(t).getDimensions();
		verify(t).getNewInstanceFromArray(new boolean[] {true, true});
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link TupboRW#set(TupboR)} adopts the
	 * values from the input tuple and returns the current instance.
	 */
	@Test
	void set_TupleTest()
	{
		TupboRW t = mock(TupboRW.class);
		TupboR t2 = mock(TupboR.class);
		
		when(t.set(t2)).thenCallRealMethod();
		
		when(t2.getArray()).thenReturn(new boolean[] {true, false});
		when(t.setArray(new boolean[] {true, false})).thenReturn(t);
		
		assertSame(t, t.set(t2));
		
		verify(t).set(t2);
		
		verify(t2).getArray();
		verify(t).setArray(new boolean[] {true, false});
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link TupboRW#set(boolean)} adopts the
	 * value for each component and returns the current instance.
	 */
	@Test
	void set_ValueTest()
	{
		TupboRW t = mock(TupboRW.class);
		
		when(t.set(true)).thenCallRealMethod();
		
		when(t.getDimensions()).thenReturn(2);
		when(t.setArray(new boolean[] {true, true})).thenReturn(t);
		
		assertSame(t, t.set(true));
		
		verify(t).set(true);
		
		verify(t).getDimensions();
		verify(t).setArray(new boolean[] {true, true});
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link TupboRW#setArray(boolean[])} relays
	 * all array entries to the corresponding component by calling {@link TupboRW#setByIndex(int, boolean)}
	 * and returns the current instance.
	 */
	@Test
	void setArrayTest()
	{
		TupboRW t = mock(TupboRW.class);
		
		when(t.setArray(new boolean[] {true, false})).thenCallRealMethod();
		
		when(t.getDimensions()).thenReturn(2);
		
		assertSame(t, t.setArray(new boolean[] {true, false}));
		
		verify(t).setArray(new boolean[] {true, false});
		
		verify(t).getDimensions();
		verify(t).setByIndex(0, true);
		verify(t).setByIndex(1, false);
		
		verifyNoMoreInteractions(t);
	}
}