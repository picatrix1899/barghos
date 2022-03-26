package org.barghos.core.test.api.tuple;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;
import org.barghos.core.api.tuple.TupdBase;
import org.barghos.core.api.tuple.TupdR;

/**
 * This class provides component tests for the interface {@link TupdBase}.
 * 
 * @author picatrix1899
 */
class TupdBaseTest
{
	/**
	 * This test ensures, that the interface extends the interface {@link TupdR}.
	 */
	@Test
	void inheritance_TupdRTest()
	{
		assertTrue(TupdR.class.isAssignableFrom(TupdBase.class));
	}
	
	/**
	 * This test ensures, that the function {@link TupdBase#set(TupdR)} adopts the
	 * values from the input tuple and returns the current instance.
	 */
	@Test
	void set_TupleTest()
	{
		TupdBase t = mock(TupdBase.class);
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
	 * This test ensures, that the function {@link TupdBase#set(double)} adopts the
	 * value for each component and returns the current instance.
	 */
	@Test
	void set_ValueTest()
	{
		TupdBase t = mock(TupdBase.class);
		
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
	 * This test ensures, that the function {@link TupdBase#setArray(double[])} relays
	 * all array entries to the corresponding component by calling {@link TupdBase#setByIndex(int, double)}
	 * and returns the current instance.
	 */
	@Test
	void setArrayTest()
	{
		TupdBase t = mock(TupdBase.class);
		
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