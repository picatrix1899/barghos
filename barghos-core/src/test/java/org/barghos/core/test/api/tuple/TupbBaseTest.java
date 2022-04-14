package org.barghos.core.test.api.tuple;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;
import org.barghos.core.api.tuple.TupbBase;
import org.barghos.core.api.tuple.TupbR;

/**
 * This class provides component tests for the interface {@link TupbBase}.
 * 
 * @author picatrix1899
 */
class TupbBaseTest
{
	/**
	 * This test ensures, that the interface extends the interface {@link TupbR}.
	 */
	@Test
	void inheritance_TupbRTest()
	{
		assertTrue(TupbR.class.isAssignableFrom(TupbBase.class));
	}
	
	/**
	 * This test ensures, that the function {@link TupbBase#set(TupbR)} adopts the
	 * values from the input tuple and returns the current instance.
	 */
	@Test
	void set_TupleTest()
	{
		TupbBase t = mock(TupbBase.class);
		TupbR t2 = mock(TupbR.class);
		
		when(t.set(t2)).thenCallRealMethod();
		
		when(t2.toArray()).thenReturn(new byte[] {(byte)1, (byte)2});
		when(t.setArray(new byte[] {(byte)1, (byte)2})).thenReturn(t);
		
		assertSame(t, t.set(t2));
		
		verify(t).set(t2);
		
		verify(t2).toArray();
		verify(t).setArray(new byte[] {(byte)1, (byte)2});
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link TupbBase#set(byte)} adopts the
	 * value for each component and returns the current instance.
	 */
	@Test
	void set_ValueTest()
	{
		TupbBase t = mock(TupbBase.class);
		
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
	 * This test ensures, that the function {@link TupbBase#setArray(byte[])} relays
	 * all array entries to the corresponding component by calling {@link TupbBase#setByIndex(int, byte)}
	 * and returns the current instance.
	 */
	@Test
	void setArrayTest()
	{
		TupbBase t = mock(TupbBase.class);
		
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