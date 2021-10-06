package org.barghos.core.test.api.tuple;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;

import org.barghos.core.api.tuple.TuplR;
import org.barghos.core.api.tuple.TuplRW;
import org.barghos.core.api.tuple.TuplW;

/**
 * This class provides component tests for the interface {@link TuplRW}.
 * 
 * @author picatrix1899
 */
class TuplRWTest
{
	/**
	 * This test ensures, that the interface extends the interface {@link TuplR}.
	 */
	@Test
	void inheritance_TuplRTest()
	{
		assertTrue(TuplR.class.isAssignableFrom(TuplRW.class));
	}
	
	/**
	 * This test ensures, that the interface extends the interface {@link TuplW}.
	 */
	@Test
	void inheritance_TuplWTest()
	{
		assertTrue(TuplW.class.isAssignableFrom(TuplRW.class));
	}
	
	/**
	 * This test ensures, that the default implementation of the function {@link TuplRW#getNewInstance(TuplR)} calls
	 * the function {@link TuplRW#getNewInstance(long[])} with the correct components.
	 */
	@Test
	void getNewInstance_TupleTest()
	{
		TuplR original = mock(TuplR.class);
		TuplRW newInstance = mock(TuplRW.class);
		TuplRW t = mock(TuplRW.class);
		
		when(t.getNewInstance(original)).thenCallRealMethod();
		
		when(original.getArray()).thenReturn(new long[] {1l, 2l});
		when(t.getNewInstanceFromArray(new long[] {1l, 2l})).thenReturn(newInstance);
		
		assertSame(newInstance, t.getNewInstance(original));
		
		verify(t).getNewInstance(original);

		verify(original).getArray();
		verify(t).getNewInstanceFromArray(new long[] {1l, 2l});
		
		verifyNoMoreInteractions(t, original);
	}
	
	/**
	 * This test ensures, that the default implementation of the function {@link TuplRW#getNewInstance(long)} calls
	 * the function {@link TuplRW#getNewInstanceFromArray(long[])} with the correct components.
	 */
	@Test
	void getNewInstance_ValueTest()
	{
		TuplRW newInstance = mock(TuplRW.class);
		TuplRW t = mock(TuplRW.class);
		
		when(t.getNewInstance(1l)).thenCallRealMethod();
		
		when(t.getDimensions()).thenReturn(2);
		when(t.getNewInstanceFromArray(new long[] {1l, 1l})).thenReturn(newInstance);
		
		assertSame(newInstance, t.getNewInstance(1l));
		
		verify(t).getNewInstance(1l);

		verify(t).getDimensions();
		verify(t).getNewInstanceFromArray(new long[] {1l, 1l});
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link TuplRW#set(TuplR)} adopts the
	 * values from the input tuple and returns the current instance.
	 */
	@Test
	void set_TupleTest()
	{
		TuplRW t = mock(TuplRW.class);
		TuplR t2 = mock(TuplR.class);
		
		when(t.set(t2)).thenCallRealMethod();
		
		when(t2.getArray()).thenReturn(new long[] {1l, 2l});
		when(t.setArray(new long[] {1l, 2l})).thenReturn(t);
		
		assertSame(t, t.set(t2));
		
		verify(t).set(t2);
		
		verify(t2).getArray();
		verify(t).setArray(new long[] {1l, 2l});
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link TuplRW#set(long)} adopts the
	 * value for each component and returns the current instance.
	 */
	@Test
	void set_ValueTest()
	{
		TuplRW t = mock(TuplRW.class);
		
		when(t.set(1)).thenCallRealMethod();
		
		when(t.getDimensions()).thenReturn(2);
		when(t.setArray(new long[] {1l, 1l})).thenReturn(t);
		
		assertSame(t, t.set(1l));
		
		verify(t).set(1l);
		
		verify(t).getDimensions();
		verify(t).setArray(new long[] {1l, 1l});
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link TuplRW#setArray(long[])} relays
	 * all array entries to the corresponding component by calling {@link TuplRW#setByIndex(int, long)}
	 * and returns the current instance.
	 */
	@Test
	void setArrayTest()
	{
		TuplRW t = mock(TuplRW.class);
		
		when(t.setArray(new long[] {1l, 2l})).thenCallRealMethod();
		
		when(t.getDimensions()).thenReturn(2);
		
		assertSame(t, t.setArray(new long[] {1l, 2l}));
		
		verify(t).setArray(new long[] {1l, 2l});
		
		verify(t).getDimensions();
		verify(t).setByIndex(0, 1l);
		verify(t).setByIndex(1, 2l);
		
		verifyNoMoreInteractions(t);
	}
}