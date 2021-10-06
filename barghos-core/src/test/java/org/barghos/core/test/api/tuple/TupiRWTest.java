package org.barghos.core.test.api.tuple;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;

import org.barghos.core.api.tuple.TupiR;
import org.barghos.core.api.tuple.TupiRW;
import org.barghos.core.api.tuple.TupiW;

/**
 * This class provides component tests for the interface {@link TupiRW}.
 * 
 * @author picatrix1899
 */
class TupiRWTest
{
	/**
	 * This test ensures, that the interface extends the interface {@link TupiR}.
	 */
	@Test
	void inheritance_TupiRTest()
	{
		assertTrue(TupiR.class.isAssignableFrom(TupiRW.class));
	}
	
	/**
	 * This test ensures, that the interface extends the interface {@link TupiW}.
	 */
	@Test
	void inheritance_TupiWTest()
	{
		assertTrue(TupiW.class.isAssignableFrom(TupiRW.class));
	}
	
	/**
	 * This test ensures, that the default implementation of the function {@link TupiRW#getNewInstance(TupiR)} calls
	 * the function {@link TupiRW#getNewInstance(int[])} with the correct components.
	 */
	@Test
	void getNewInstance_TupleTest()
	{
		TupiR original = mock(TupiR.class);
		TupiRW newInstance = mock(TupiRW.class);
		TupiRW t = mock(TupiRW.class);
		
		when(t.getNewInstance(original)).thenCallRealMethod();
		
		when(original.getArray()).thenReturn(new int[] {1, 2});
		when(t.getNewInstanceFromArray(new int[] {1, 2})).thenReturn(newInstance);
		
		assertSame(newInstance, t.getNewInstance(original));
		
		verify(t).getNewInstance(original);

		verify(original).getArray();
		verify(t).getNewInstanceFromArray(new int[] {1, 2});
		
		verifyNoMoreInteractions(t, original);
	}
	
	/**
	 * This test ensures, that the default implementation of the function {@link TupiRW#getNewInstance(int)} calls
	 * the function {@link TupiRW#getNewInstanceFromArray(int[])} with the correct components.
	 */
	@Test
	void getNewInstance_ValueTest()
	{
		TupiRW newInstance = mock(TupiRW.class);
		TupiRW t = mock(TupiRW.class);
		
		when(t.getNewInstance(1)).thenCallRealMethod();
		
		when(t.getDimensions()).thenReturn(2);
		when(t.getNewInstanceFromArray(new int[] {1, 1})).thenReturn(newInstance);
		
		assertSame(newInstance, t.getNewInstance(1));
		
		verify(t).getNewInstance(1);

		verify(t).getDimensions();
		verify(t).getNewInstanceFromArray(new int[] {1, 1});
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link TupiRW#set(TupiR)} adopts the
	 * values from the input tuple and returns the current instance.
	 */
	@Test
	void set_TupleTest()
	{
		TupiRW t = mock(TupiRW.class);
		TupiR t2 = mock(TupiR.class);
		
		when(t.set(t2)).thenCallRealMethod();
		
		when(t2.getArray()).thenReturn(new int[] {1, 2});
		when(t.setArray(new int[] {1, 2})).thenReturn(t);
		
		assertSame(t, t.set(t2));
		
		verify(t).set(t2);
		
		verify(t2).getArray();
		verify(t).setArray(new int[] {1, 2});
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link TupiRW#set(int)} adopts the
	 * value for each component and returns the current instance.
	 */
	@Test
	void set_ValueTest()
	{
		TupiRW t = mock(TupiRW.class);
		
		when(t.set(1)).thenCallRealMethod();
		
		when(t.getDimensions()).thenReturn(2);
		when(t.setArray(new int[] {1, 1})).thenReturn(t);
		
		assertSame(t, t.set(1));
		
		verify(t).set(1);
		
		verify(t).getDimensions();
		verify(t).setArray(new int[] {1, 1});
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link TupiRW#setArray(int[])} relays
	 * all array entries to the corresponding component by calling {@link TupiRW#setByIndex(int, int)}
	 * and returns the current instance.
	 */
	@Test
	void setArrayTest()
	{
		TupiRW t = mock(TupiRW.class);
		
		when(t.setArray(new int[] {1, 2})).thenCallRealMethod();
		
		when(t.getDimensions()).thenReturn(2);
		
		assertSame(t, t.setArray(new int[] {1, 2}));
		
		verify(t).setArray(new int[] {1, 2});
		
		verify(t).getDimensions();
		verify(t).setByIndex(0, 1);
		verify(t).setByIndex(1, 2);
		
		verifyNoMoreInteractions(t);
	}
}