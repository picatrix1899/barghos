package org.barghos.core.test.api.tuple;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;

import org.barghos.core.api.tuple.TupobjR;
import org.barghos.core.api.tuple.TupobjRW;
import org.barghos.core.api.tuple.TupobjW;

/**
 * This class provides component tests for the interface {@link TupobjRW}.
 * 
 * @author picatrix1899
 */
class TupobjRWTest
{
	/**
	 * This test ensures, that the interface extends the interface {@link TupobjR}.
	 */
	@Test
	void inheritance_TupobjRTest()
	{
		assertTrue(TupobjR.class.isAssignableFrom(TupobjRW.class));
	}
	
	/**
	 * This test ensures, that the interface extends the interface {@link TupobjW}.
	 */
	@Test
	void inheritance_TupobjWTest()
	{
		assertTrue(TupobjW.class.isAssignableFrom(TupobjRW.class));
	}
	
	/**
	 * This test ensures, that the default implementation of the function {@link TupobjRW#getNewInstance(TupobjR)} calls
	 * the function {@link TupobjRW#getNewInstance(Object[])} with the correct components.
	 */
	@Test
	void getNewInstance_TupleTest()
	{
		TupobjR original = mock(TupobjR.class);
		TupobjRW newInstance = mock(TupobjRW.class);
		TupobjRW t = mock(TupobjRW.class);
		
		when(t.getNewInstance(original)).thenCallRealMethod();
		
		when(original.getArray()).thenReturn(new Object[] {1, 1.0});
		when(t.getNewInstanceFromArray(new Object[] {1, 1.0})).thenReturn(newInstance);
		
		assertSame(newInstance, t.getNewInstance(original));
		
		verify(t).getNewInstance(original);

		verify(original).getArray();
		verify(t).getNewInstanceFromArray(new Object[] {1, 1.0});
		
		verifyNoMoreInteractions(t, original);
	}
	
	/**
	 * This test ensures, that the default implementation of the function {@link TupobjRW#getNewInstance(Object)} calls
	 * the function {@link TupobjRW#getNewInstanceFromArray(Object[])} with the correct components.
	 */
	@Test
	void getNewInstance_ValueTest()
	{
		TupobjRW newInstance = mock(TupobjRW.class);
		TupobjRW t = mock(TupobjRW.class);
		
		when(t.getNewInstance(1)).thenCallRealMethod();
		
		when(t.getDimensions()).thenReturn(2);
		when(t.getNewInstanceFromArray(new Object[] {1, 1})).thenReturn(newInstance);
		
		assertSame(newInstance, t.getNewInstance(1));
		
		verify(t).getNewInstance(1);

		verify(t).getDimensions();
		verify(t).getNewInstanceFromArray(new Object[] {1, 1});
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link TupobjRW#set(TupobjR)} adopts the
	 * values from the input tuple and returns the current instance.
	 */
	@Test
	void set_TupleTest()
	{
		TupobjRW t = mock(TupobjRW.class);
		TupobjR t2 = mock(TupobjR.class);
		
		when(t.set(t2)).thenCallRealMethod();
		
		when(t2.getArray()).thenReturn(new Object[] {1, 1.0});
		when(t.setArray(new Object[] {1, 1.0})).thenReturn(t);
		
		assertSame(t, t.set(t2));
		
		verify(t).set(t2);
		
		verify(t2).getArray();
		verify(t).setArray(new Object[] {1, 1.0});
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link TupobjRW#set(Object)} adopts the
	 * value for each component and returns the current instance.
	 */
	@Test
	void set_ValueTest()
	{
		TupobjRW t = mock(TupobjRW.class);
		
		when(t.set(1)).thenCallRealMethod();
		
		when(t.getDimensions()).thenReturn(2);
		when(t.setArray(new Object[] {1, 1})).thenReturn(t);
		
		assertSame(t, t.set(1));
		
		verify(t).set(1);
		
		verify(t).getDimensions();
		verify(t).setArray(new Object[] {1, 1});
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link TupobjRW#setArray(Object[])} relays
	 * all array entries to the corresponding component by calling {@link TupobjRW#setByIndex(int, Object)}
	 * and returns the current instance.
	 */
	@Test
	void setArrayTest()
	{
		TupobjRW t = mock(TupobjRW.class);
		
		when(t.setArray(new Object[] {1, 1.0})).thenCallRealMethod();
		
		when(t.getDimensions()).thenReturn(2);
		
		assertSame(t, t.setArray(new Object[] {1, 1.0}));
		
		verify(t).setArray(new Object[] {1, 1.0});
		
		verify(t).getDimensions();
		verify(t).setByIndex(0, 1);
		verify(t).setByIndex(1, 1.0);
		
		verifyNoMoreInteractions(t);
	}
}