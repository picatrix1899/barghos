package org.barghos.core.test.api.tuple;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;

import org.barghos.core.api.tuple.TupfR;
import org.barghos.core.api.tuple.TupfRW;
import org.barghos.core.api.tuple.TupfW;

/**
 * This class provides component tests for the interface {@link TupfRW}.
 * 
 * @author picatrix1899
 */
class TupfRWTest
{
	/**
	 * This test ensures, that the interface extends the interface {@link TupfR}.
	 */
	@Test
	void inheritance_TupfRTest()
	{
		assertTrue(TupfR.class.isAssignableFrom(TupfRW.class));
	}
	
	/**
	 * This test ensures, that the interface extends the interface {@link TupfW}.
	 */
	@Test
	void inheritance_TupfWTest()
	{
		assertTrue(TupfW.class.isAssignableFrom(TupfRW.class));
	}
	
	/**
	 * This test ensures, that the default implementation of the function {@link TupfRW#getNewInstance(TupfR)} calls
	 * the function {@link TupfRW#getNewInstance(float[])} with the correct components.
	 */
	@Test
	void getNewInstance_TupleTest()
	{
		TupfR original = mock(TupfR.class);
		TupfRW newInstance = mock(TupfRW.class);
		TupfRW t = mock(TupfRW.class);
		
		when(t.getNewInstance(original)).thenCallRealMethod();
		
		when(original.getArray()).thenReturn(new float[] {1.0f, 2.0f});
		when(t.getNewInstanceFromArray(new float[] {1.0f, 2.0f})).thenReturn(newInstance);
		
		assertSame(newInstance, t.getNewInstance(original));
		
		verify(t).getNewInstance(original);

		verify(original).getArray();
		verify(t).getNewInstanceFromArray(new float[] {1.0f, 2.0f});
		
		verifyNoMoreInteractions(t, original);
	}
	
	/**
	 * This test ensures, that the default implementation of the function {@link TupfRW#getNewInstance(float)} calls
	 * the function {@link TupfRW#getNewInstanceFromArray(float[])} with the correct components.
	 */
	@Test
	void getNewInstance_ValueTest()
	{
		TupfRW newInstance = mock(TupfRW.class);
		TupfRW t = mock(TupfRW.class);
		
		when(t.getNewInstance(1.0f)).thenCallRealMethod();
		
		when(t.getDimensions()).thenReturn(2);
		when(t.getNewInstanceFromArray(new float[] {1.0f, 1.0f})).thenReturn(newInstance);
		
		assertSame(newInstance, t.getNewInstance(1.0f));
		
		verify(t).getNewInstance(1.0f);

		verify(t).getDimensions();
		verify(t).getNewInstanceFromArray(new float[] {1.0f, 1.0f});
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link TupfRW#set(TupfR)} adopts the
	 * values from the input tuple and returns the current instance.
	 */
	@Test
	void set_TupleTest()
	{
		TupfRW t = mock(TupfRW.class);
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
	 * This test ensures, that the function {@link TupfRW#set(float)} adopts the
	 * value for each component and returns the current instance.
	 */
	@Test
	void set_ValueTest()
	{
		TupfRW t = mock(TupfRW.class);
		
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
	 * This test ensures, that the function {@link TupfRW#setArray(float[])} relays
	 * all array entries to the corresponding component by calling {@link TupfRW#setByIndex(int, float)}
	 * and returns the current instance.
	 */
	@Test
	void setArrayTest()
	{
		TupfRW t = mock(TupfRW.class);
		
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