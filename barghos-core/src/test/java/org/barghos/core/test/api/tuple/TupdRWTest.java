package org.barghos.core.test.api.tuple;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;

import org.barghos.core.api.tuple.TupdR;
import org.barghos.core.api.tuple.TupdRW;
import org.barghos.core.api.tuple.TupdW;

/**
 * This class provides component tests for the interface {@link TupdRW}.
 * 
 * @author picatrix1899
 */
class TupdRWTest
{
	/**
	 * This test ensures, that the interface extends the interface {@link TupdR}.
	 */
	@Test
	void inheritance_TupdRTest()
	{
		assertTrue(TupdR.class.isAssignableFrom(TupdRW.class));
	}
	
	/**
	 * This test ensures, that the interface extends the interface {@link TupdW}.
	 */
	@Test
	void inheritance_TupdWTest()
	{
		assertTrue(TupdW.class.isAssignableFrom(TupdRW.class));
	}
	
	/**
	 * This test ensures, that the default implementation of the function {@link TupdRW#getNewInstance(TupdR)} calls
	 * the function {@link TupdRW#getNewInstance(double[])} with the correct components.
	 */
	@Test
	void getNewInstance_TupleTest()
	{
		TupdR original = mock(TupdR.class);
		TupdRW newInstance = mock(TupdRW.class);
		TupdRW t = mock(TupdRW.class);
		
		when(t.getNewInstance(original)).thenCallRealMethod();
		
		when(original.getArray()).thenReturn(new double[] {1.0, 2.0});
		when(t.getNewInstanceFromArray(new double[] {1.0, 2.0})).thenReturn(newInstance);
		
		assertSame(newInstance, t.getNewInstance(original));
		
		verify(t).getNewInstance(original);

		verify(original).getArray();
		verify(t).getNewInstanceFromArray(new double[] {1.0, 2.0});
		
		verifyNoMoreInteractions(t, original);
	}
	
	/**
	 * This test ensures, that the default implementation of the function {@link TupdRW#getNewInstance(double)} calls
	 * the function {@link TupdRW#getNewInstanceFromArray(double[])} with the correct components.
	 */
	@Test
	void getNewInstance_ValueTest()
	{
		TupdRW newInstance = mock(TupdRW.class);
		TupdRW t = mock(TupdRW.class);
		
		when(t.getNewInstance(1.0)).thenCallRealMethod();
		
		when(t.getDimensions()).thenReturn(2);
		when(t.getNewInstanceFromArray(new double[] {1.0, 1.0})).thenReturn(newInstance);
		
		assertSame(newInstance, t.getNewInstance(1.0));
		
		verify(t).getNewInstance(1.0);

		verify(t).getDimensions();
		verify(t).getNewInstanceFromArray(new double[] {1.0, 1.0});
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link TupdRW#set(TupdR)} adopts the
	 * values from the input tuple and returns the current instance.
	 */
	@Test
	void set_TupleTest()
	{
		TupdRW t = mock(TupdRW.class);
		TupdR t2 = mock(TupdR.class);
		
		when(t.set(t2)).thenCallRealMethod();
		
		when(t2.getArray()).thenReturn(new double[] {1.0, 2.0});
		when(t.setArray(new double[] {1.0, 2.0})).thenReturn(t);
		
		assertSame(t, t.set(t2));
		
		verify(t).set(t2);
		
		verify(t2).getArray();
		verify(t).setArray(new double[] {1.0, 2.0});
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link TupdRW#set(double)} adopts the
	 * value for each component and returns the current instance.
	 */
	@Test
	void set_ValueTest()
	{
		TupdRW t = mock(TupdRW.class);
		
		when(t.set(1.0)).thenCallRealMethod();
		
		when(t.getDimensions()).thenReturn(2);
		when(t.setArray(new double[] {1.0, 1.0})).thenReturn(t);
		
		assertSame(t, t.set(1.0));
		
		verify(t).set(1.0);
		
		verify(t).getDimensions();
		verify(t).setArray(new double[] {1.0, 1.0});
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link TupdRW#setArray(double[])} relays
	 * all array entries to the corresponding component by calling {@link TupdRW#setByIndex(int, double)}
	 * and returns the current instance.
	 */
	@Test
	void setArrayTest()
	{
		TupdRW t = mock(TupdRW.class);
		
		when(t.setArray(new double[] {1.0, 2.0})).thenCallRealMethod();
		
		when(t.getDimensions()).thenReturn(2);
		
		assertSame(t, t.setArray(new double[] {1.0, 2.0}));
		
		verify(t).setArray(new double[] {1.0, 2.0});
		
		verify(t).getDimensions();
		verify(t).setByIndex(0, 1.0);
		verify(t).setByIndex(1, 2.0);
		
		verifyNoMoreInteractions(t);
	}
}