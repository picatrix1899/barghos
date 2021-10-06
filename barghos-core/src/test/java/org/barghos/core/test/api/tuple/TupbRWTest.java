package org.barghos.core.test.api.tuple;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;

import org.barghos.core.api.tuple.TupbR;
import org.barghos.core.api.tuple.TupbRW;
import org.barghos.core.api.tuple.TupbW;

/**
 * This class provides component tests for the interface {@link TupbRW}.
 * 
 * @author picatrix1899
 */
class TupbRWTest
{
	/**
	 * This test ensures, that the interface extends the interface {@link TupbR}.
	 */
	@Test
	void inheritance_TupbRTest()
	{
		assertTrue(TupbR.class.isAssignableFrom(TupbRW.class));
	}
	
	/**
	 * This test ensures, that the interface extends the interface {@link TupbW}.
	 */
	@Test
	void inheritance_TupbWTest()
	{
		assertTrue(TupbW.class.isAssignableFrom(TupbRW.class));
	}
	
	/**
	 * This test ensures, that the default implementation of the function {@link TupbRW#getNewInstance(TupbR)} calls
	 * the function {@link TupbRW#getNewInstance(byte[])} with the correct components.
	 */
	@Test
	void getNewInstance_TupleTest()
	{
		TupbR original = mock(TupbR.class);
		TupbRW newInstance = mock(TupbRW.class);
		TupbRW t = mock(TupbRW.class);
		
		when(t.getNewInstance(original)).thenCallRealMethod();
		
		when(original.getArray()).thenReturn(new byte[] {1, 2});
		when(t.getNewInstanceFromArray(new byte[] {1, 2})).thenReturn(newInstance);
		
		assertSame(newInstance, t.getNewInstance(original));
		
		verify(t).getNewInstance(original);

		verify(original).getArray();
		verify(t).getNewInstanceFromArray(new byte[] {1, 2});
		
		verifyNoMoreInteractions(t, original);
	}
	
	/**
	 * This test ensures, that the default implementation of the function {@link TupbRW#getNewInstance(byte)} calls
	 * the function {@link TupbRW#getNewInstanceFromArray(byte[])} with the correct components.
	 */
	@Test
	void getNewInstance_ValueTest()
	{
		TupbRW newInstance = mock(TupbRW.class);
		TupbRW t = mock(TupbRW.class);
		
		when(t.getNewInstance((byte)1)).thenCallRealMethod();
		
		when(t.getDimensions()).thenReturn(2);
		when(t.getNewInstanceFromArray(new byte[] {1, 1})).thenReturn(newInstance);
		
		assertSame(newInstance, t.getNewInstance((byte)1));
		
		verify(t).getNewInstance((byte)1);

		verify(t).getDimensions();
		verify(t).getNewInstanceFromArray(new byte[] {1, 1});
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link TupbRW#set(TupbR)} adopts the
	 * values from the input tuple and returns the current instance.
	 */
	@Test
	void set_TupleTest()
	{
		TupbRW t = mock(TupbRW.class);
		TupbR t2 = mock(TupbR.class);
		
		when(t.set(t2)).thenCallRealMethod();
		
		when(t2.getArray()).thenReturn(new byte[] {(byte)1, (byte)2});
		when(t.setArray(new byte[] {(byte)1, (byte)2})).thenReturn(t);
		
		assertSame(t, t.set(t2));
		
		verify(t).set(t2);
		
		verify(t2).getArray();
		verify(t).setArray(new byte[] {(byte)1, (byte)2});
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link TupbRW#set(byte)} adopts the
	 * value for each component and returns the current instance.
	 */
	@Test
	void set_ValueTest()
	{
		TupbRW t = mock(TupbRW.class);
		
		when(t.set((byte)1)).thenCallRealMethod();
		
		when(t.getDimensions()).thenReturn(2);
		when(t.setArray(new byte[] {(byte)1, (byte)1})).thenReturn(t);
		
		assertSame(t, t.set((byte)1));
		
		verify(t).set((byte)1);
		
		verify(t).getDimensions();
		verify(t).setArray(new byte[] {(byte)1, (byte)1});
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link TupbRW#setArray(byte[])} relays
	 * all array entries to the corresponding component by calling {@link TupbRW#setByIndex(int, byte)}
	 * and returns the current instance.
	 */
	@Test
	void setArrayTest()
	{
		TupbRW t = mock(TupbRW.class);
		
		when(t.setArray(new byte[] {(byte)1, (byte)2})).thenCallRealMethod();
		
		when(t.getDimensions()).thenReturn(2);
		
		assertSame(t, t.setArray(new byte[] {(byte)1, (byte)2}));
		
		verify(t).setArray(new byte[] {(byte)1, (byte)2});
		
		verify(t).getDimensions();
		verify(t).setByIndex(0, (byte)1);
		verify(t).setByIndex(1, (byte)2);
		
		verifyNoMoreInteractions(t);
	}
}