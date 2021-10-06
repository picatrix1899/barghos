package org.barghos.core.test.api.tuple;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import org.barghos.core.api.tuple.TupbigdR;
import org.barghos.core.api.tuple.TupbigdRW;
import org.barghos.core.api.tuple.TupbigdW;

/**
 * This class provides component tests for the interface {@link TupbigdRW}.
 * 
 * @author picatrix1899
 */
class TupbigdRWTest
{
	/**
	 * This test ensures, that the interface extends the interface {@link TupbigdR}.
	 */
	@Test
	void inheritance_TupbigdRTest()
	{
		assertTrue(TupbigdR.class.isAssignableFrom(TupbigdRW.class));
	}
	
	/**
	 * This test ensures, that the interface extends the interface {@link TupbigdW}.
	 */
	@Test
	void inheritance_TupbigdWTest()
	{
		assertTrue(TupbigdW.class.isAssignableFrom(TupbigdRW.class));
	}
	
	/**
	 * This test ensures, that the default implementation of the function {@link TupbigdRW#getNewInstance(TupbigdR)} calls
	 * the function {@link TupbigdRW#getNewInstance(BigDecimal[])} with the correct components.
	 */
	@Test
	void getNewInstance_TupleTest()
	{
		TupbigdR original = mock(TupbigdR.class);
		TupbigdRW newInstance = mock(TupbigdRW.class);
		TupbigdRW t = mock(TupbigdRW.class);
		
		when(t.getNewInstance(original)).thenCallRealMethod();
		
		when(original.getArray()).thenReturn(new BigDecimal[] {BigDecimal.ONE, BigDecimal.valueOf(2)});
		when(t.getNewInstanceFromArray(new BigDecimal[] {BigDecimal.ONE, BigDecimal.valueOf(2)})).thenReturn(newInstance);
		
		assertSame(newInstance, t.getNewInstance(original));

		verify(t).getNewInstance(original);
		
		verify(original).getArray();
		verify(t).getNewInstanceFromArray(new BigDecimal[] {BigDecimal.ONE, BigDecimal.valueOf(2)});
		
		verifyNoMoreInteractions(t, original);
	}
	
	/**
	 * This test ensures, that the default implementation of the function {@link TupbigdRW#getNewInstance(BigDecimal)} calls
	 * the function {@link TupbigdRW#getNewInstanceFromArray(BigDecimal[])} with the correct components.
	 */
	@Test
	void getNewInstance_ValueTest()
	{
		TupbigdRW newInstance = mock(TupbigdRW.class);
		TupbigdRW t = mock(TupbigdRW.class);
		
		when(t.getNewInstance(BigDecimal.ONE)).thenCallRealMethod();
		
		when(t.getDimensions()).thenReturn(2);
		when(t.getNewInstanceFromArray(new BigDecimal[] {BigDecimal.ONE, BigDecimal.ONE})).thenReturn(newInstance);
		
		assertSame(newInstance, t.getNewInstance(BigDecimal.ONE));

		verify(t).getNewInstance(BigDecimal.ONE);
		
		verify(t).getDimensions();
		verify(t).getNewInstanceFromArray(new BigDecimal[] {BigDecimal.ONE, BigDecimal.ONE});
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link TupbigdRW#set(TupbigdR)} adopts the
	 * values from the input tuple and returns the current instance.
	 */
	@Test
	void set_TupleTest()
	{
		TupbigdRW t = mock(TupbigdRW.class);
		TupbigdR t2 = mock(TupbigdR.class);
		
		when(t.set(t2)).thenCallRealMethod();
		
		when(t2.getArray()).thenReturn(new BigDecimal[] {BigDecimal.ONE, BigDecimal.valueOf(2)});
		when(t.setArray(new BigDecimal[] {BigDecimal.ONE, BigDecimal.valueOf(2)})).thenReturn(t);
		
		assertSame(t, t.set(t2));
		
		verify(t).set(t2);
		
		verify(t2).getArray();
		verify(t).setArray(new BigDecimal[] {BigDecimal.ONE, BigDecimal.valueOf(2)});
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link TupbigdRW#set(BigDecimal)} adopts the
	 * value for each component and returns the current instance.
	 */
	@Test
	void set_ValueTest()
	{
		TupbigdRW t = mock(TupbigdRW.class);
		
		when(t.set(BigDecimal.ONE)).thenCallRealMethod();
		
		when(t.getDimensions()).thenReturn(2);
		when(t.setArray(new BigDecimal[] {BigDecimal.ONE, BigDecimal.ONE})).thenReturn(t);
		
		assertSame(t, t.set(BigDecimal.ONE));
		
		verify(t).set(BigDecimal.ONE);
		
		verify(t).getDimensions();
		verify(t).setArray(new BigDecimal[] {BigDecimal.ONE, BigDecimal.ONE});
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link TupbigdRW#setArray(BigDecimal[])} relays
	 * all array entries to the corresponding component by calling {@link TupbigdRW#setByIndex(int, BigDecimal)}
	 * and returns the current instance.
	 */
	@Test
	void setArrayTest()
	{
		TupbigdRW t = mock(TupbigdRW.class);
		
		when(t.setArray(new BigDecimal[] {BigDecimal.ONE, BigDecimal.valueOf(2)})).thenCallRealMethod();
		
		when(t.getDimensions()).thenReturn(2);
		
		assertSame(t, t.setArray(new BigDecimal[] {BigDecimal.ONE, BigDecimal.valueOf(2)}));
		
		verify(t).setArray(new BigDecimal[] {BigDecimal.ONE, BigDecimal.valueOf(2)});
		
		verify(t).getDimensions();
		verify(t).setByIndex(0, BigDecimal.ONE);
		verify(t).setByIndex(1, BigDecimal.valueOf(2));
		
		verifyNoMoreInteractions(t);
	}
}