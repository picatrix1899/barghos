package org.barghos.core.test.api.tuple;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;

import org.barghos.core.api.tuple.TupfR;
import org.barghos.core.api.tuple.TupfW;

/**
 * This class provides component tests for the interface {@link TupfW}.
 * 
 * @author picatrix1899
 */
class TupfWTest
{
	/**
	 * This test ensures, that the function {@link TupfW#set(TupfR)} adopts the
	 * values from the input tuple and returns the current instance.
	 */
	@Test
	void set_TupleTest()
	{
		TupfW t = mock(TupfW.class);
		TupfR t2 = mock(TupfR.class);
		
		when(t.set(t2)).thenCallRealMethod();
		
		when(t2.getArray()).thenReturn(new float[] {1.0f, 2.0f});
		when(t.setArray(new float[] {1.0f, 2.0f})).thenReturn(t);
		
		assertSame(t, t.set(t2));
		
		verify(t).set(t2);
		
		verify(t2).getArray();
		verify(t).setArray(new float[] {1.0f, 2.0f});
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link TupfW#set(float)} adopts the
	 * value for each component and returns the current instance.
	 */
	@Test
	void set_ValueTest()
	{
		TupfW t = mock(TupfW.class);
		
		when(t.set(1.0f)).thenCallRealMethod();
		
		when(t.getDimensions()).thenReturn(2);
		when(t.setArray(new float[] {1.0f, 1.0f})).thenReturn(t);
		
		assertSame(t, t.set(1.0f));
		
		verify(t).set(1.0f);
		
		verify(t).getDimensions();
		verify(t).setArray(new float[] {1.0f, 1.0f});
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link TupfW#setArray(float[])} relays
	 * all array entries to the corresponding component by calling {@link TupfW#setByIndex(int, float)}
	 * and returns the current instance.
	 */
	@Test
	void setArrayTest()
	{
		TupfW t = mock(TupfW.class);
		
		when(t.setArray(new float[] {1.0f, 2.0f})).thenCallRealMethod();
		
		when(t.getDimensions()).thenReturn(2);
		
		assertSame(t, t.setArray(new float[] {1.0f, 2.0f}));
		
		verify(t).setArray(new float[] {1.0f, 2.0f});
		
		verify(t).getDimensions();
		verify(t).setByIndex(0, 1.0f);
		verify(t).setByIndex(1, 2.0f);
		
		verifyNoMoreInteractions(t);
	}
}