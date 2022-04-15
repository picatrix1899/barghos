package org.barghos.core.test.api.tuple;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;
import org.barghos.core.api.tuple.TupsC;
import org.barghos.core.api.tuple.TupsR;

/**
 * This class provides component tests for the interface {@link TupsC}.
 * 
 * @author picatrix1899
 */
class TupsCTest
{
	/**
	 * This test ensures, that the interface extends the interface {@link TupsR}.
	 */
	@Test
	void inheritance_TupsRTest()
	{
		assertTrue(TupsR.class.isAssignableFrom(TupsC.class));
	}
	
	/**
	 * This test ensures, that the function {@link TupsC#set(TupsR)} adopts the
	 * values from the input tuple and returns the current instance.
	 */
	@Test
	void set_TupleTest()
	{
		TupsC t = mock(TupsC.class);
		TupsR t2 = mock(TupsR.class);
		
		when(t.set(t2)).thenCallRealMethod();
		
		when(t2.toArray()).thenReturn(new short[] {(short)1, (short)2});
		when(t.setArray(new short[] {(short)1, (short)2})).thenReturn(t);
		
		assertSame(t, t.set(t2));
		
		verify(t).set(t2);
		
		verify(t2).toArray();
		verify(t).setArray(new short[] {(short)1, (short)2});
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link TupsC#set(short)} adopts the
	 * value for each component and returns the current instance.
	 */
	@Test
	void set_ValueTest()
	{
		TupsC t = mock(TupsC.class);
		
		when(t.set((short)1)).thenCallRealMethod();
		
		when(t.getDimensions()).thenReturn(2);
		when(t.setArray(new short[] {(short)1, (short)1})).thenReturn(t);
		
		assertSame(t, t.set((short)1));
		
		verify(t).set((short)1);
		
		verify(t).getDimensions();
		verify(t).setArray(new short[] {(short)1, (short)1});
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link TupsC#setArray(short[])} relays
	 * all array entries to the corresponding component by calling {@link TupsC#setByIndex(int, short)}
	 * and returns the current instance.
	 */
	@Test
	void setArrayTest()
	{
		TupsC t = mock(TupsC.class);
		
		when(t.setArray(new short[] {(short)1, (short)2})).thenCallRealMethod();
		
		when(t.getDimensions()).thenReturn(2);
		
		assertSame(t, t.setArray(new short[] {(short)1, (short)2}));
		
		verify(t).setArray(new short[] {(short)1, (short)2});
		
		verify(t).getDimensions();
		verify(t).setByIndex(0, (short)1);
		verify(t).setByIndex(1, (short)2);
		
		verifyNoMoreInteractions(t);
	}
}