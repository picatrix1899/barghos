package org.barghos.core.test.api.tuple;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import org.barghos.core.api.tuple.TupbigdBase;
import org.barghos.core.api.tuple.TupbigdR;

/**
 * This class provides component tests for the interface {@link TupbigdBase}.
 * 
 * @author picatrix1899
 */
class TupbigdBaseTest
{
	/**
	 * This test ensures, that the interface extends the interface {@link TupbigdR}.
	 */
	@Test
	void inheritance_TupbigdRTest()
	{
		assertTrue(TupbigdR.class.isAssignableFrom(TupbigdBase.class));
	}
	
	/**
	 * This test ensures, that the function {@link TupbigdBase#set(TupbigdR)} adopts the
	 * values from the input tuple and returns the current instance.
	 */
	@Test
	void set_TupleTest()
	{
		TupbigdBase t = mock(TupbigdBase.class);
		TupbigdR t2 = mock(TupbigdR.class);
		
		when(t.set(t2)).thenCallRealMethod();
		
		when(t2.toArray()).thenReturn(new BigDecimal[] {BigDecimal.ONE, BigDecimal.valueOf(2)});
		when(t.setArray(new BigDecimal[] {BigDecimal.ONE, BigDecimal.valueOf(2)})).thenReturn(t);
		
		assertSame(t, t.set(t2));
		
		verify(t).set(t2);
		
		verify(t2).toArray();
		verify(t).setArray(new BigDecimal[] {BigDecimal.ONE, BigDecimal.valueOf(2)});
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link TupbigdBase#set(BigDecimal)} adopts the
	 * value for each component and returns the current instance.
	 */
	@Test
	void set_ValueTest()
	{
		TupbigdBase t = mock(TupbigdBase.class);
		
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
	 * This test ensures, that the function {@link TupbigdBase#setArray(BigDecimal[])} relays
	 * all array entries to the corresponding component by calling {@link TupbigdBase#setByIndex(int, BigDecimal)}
	 * and returns the current instance.
	 */
	@Test
	void setArrayTest()
	{
		TupbigdBase t = mock(TupbigdBase.class);
		
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