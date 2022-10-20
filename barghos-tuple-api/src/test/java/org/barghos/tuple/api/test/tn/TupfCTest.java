package org.barghos.tuple.api.test.tn;

import static org.junit.jupiter.api.Assertions.*;

import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;

import org.barghos.tuple.api.tn.TupfC;
import org.barghos.tuple.api.tn.TupfR;

/**
 * This class provides component tests for the interface {@link TupfC}.
 * 
 * @author picatrix1899
 */
class TupfCTest
{

	/**
	 * This test ensures, that the interface extends the interface
	 * {@link TupfR}.
	 */
	@Test
	void inheritance_TupRTest()
	{
		assertTrue(TupfR.class.isAssignableFrom(TupfC.class));
	}

	/**
	 * This test ensures, that the function {@link TupfC#set(TupfR)} adopts the
	 * values from the input tuple and returns the current instance.
	 */
	@Test
	void set_TupleTest()
	{
		TupfC t = mock(TupfC.class);
		TupfR t2 = mock(TupfR.class);
		
		when(t.set(t2)).thenCallRealMethod();
		
		when(t2.toArray()).thenReturn(new float[] {1.0f, 2.0f});
		when(t.setArray(new float[] {1.0f, 2.0f})).thenReturn(t);
		
		assertSame(t, t.set(t2));
		
		verify(t).set(t2);
		
		verify(t2).toArray();
		verify(t).setArray(new float[] {1.0f, 2.0f});
		
		verifyNoMoreInteractions(t);
	}

	/**
	 * This test ensures, that the function {@link TupfC#set(float)} adopts the
	 * value for each component and returns the current instance.
	 */
	@Test
	void set_ValueTest()
	{
		TupfC t = mock(TupfC.class);
		
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
	 * This test ensures, that the function {@link TupfC#setArray(float[])}
	 * relays all array entries to the corresponding component by calling
	 * {@link TupfC#setByIndex(int, float)} and returns the current instance.
	 */
	@Test
	void setArrayTest()
	{
		TupfC t = mock(TupfC.class);
		
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