package org.barghos.core.test.api.tuple;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;

import org.barghos.core.api.tuple.TupsR;
import org.barghos.core.api.tuple.TupsW;

/**
 * This class provides component tests for the interface {@link TupsW}.
 * 
 * @author picatrix1899
 */
class TupsWTest
{
	/**
	 * This test ensures, that the function {@link TupsW#set(TupsR)} adopts the
	 * values from the input tuple and returns the current instance.
	 */
	@Test
	void set_TupleTest()
	{
		TupsW t = mock(TupsW.class);
		TupsR t2 = mock(TupsR.class);
		
		when(t.set(t2)).thenCallRealMethod();
		
		when(t2.getArray()).thenReturn(new short[] {(short)1, (short)2});
		when(t.setArray(new short[] {(short)1, (short)2})).thenReturn(t);
		
		assertSame(t, t.set(t2));
		
		verify(t).set(t2);
		
		verify(t2).getArray();
		verify(t).setArray(new short[] {(short)1, (short)2});
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link TupsW#set(short)} adopts the
	 * value for each component and returns the current instance.
	 */
	@Test
	void set_ValueTest()
	{
		TupsW t = mock(TupsW.class);
		
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
	 * This test ensures, that the function {@link TupsW#setArray(short[])} relays
	 * all array entries to the corresponding component by calling {@link TupsW#setByIndex(int, short)}
	 * and returns the current instance.
	 */
	@Test
	void setArrayTest()
	{
		TupsW t = mock(TupsW.class);
		
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