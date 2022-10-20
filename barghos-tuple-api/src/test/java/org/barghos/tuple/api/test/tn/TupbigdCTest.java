package org.barghos.tuple.api.test.tn;

import static org.junit.jupiter.api.Assertions.*;

import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import org.barghos.tuple.api.tn.TupbigdC;
import org.barghos.tuple.api.tn.TupbigdR;

/**
 * This class provides component tests for the interface {@link TupbigdC}.
 * 
 * @author picatrix1899
 */
class TupbigdCTest
{

	/**
	 * This test ensures, that the interface extends the interface
	 * {@link TupbigdR}.
	 */
	@Test
	void inheritance_TupRTest()
	{
		assertTrue(TupbigdR.class.isAssignableFrom(TupbigdC.class));
	}

	/**
	 * This test ensures, that the function {@link TupbigdC#set(TupbigdR)}
	 * adopts the values from the input tuple and returns the current instance.
	 */
	@Test
	void set_TupleTest()
	{
		TupbigdC t = mock(TupbigdC.class);
		TupbigdR t2 = mock(TupbigdR.class);
		
		when(t.set(t2)).thenCallRealMethod();
		
		when(t2.toArray()).thenReturn(new BigDecimal[] { BigDecimal.valueOf(1.0), BigDecimal.valueOf(2.0)});
		when(t.setArray(new BigDecimal[] { BigDecimal.valueOf(1.0), BigDecimal.valueOf(2.0)})).thenReturn(t);
		
		assertSame(t, t.set(t2));
		
		verify(t).set(t2);
		
		verify(t2).toArray();
		verify(t).setArray(new BigDecimal[] { BigDecimal.valueOf(1.0), BigDecimal.valueOf(2.0)});
		
		verifyNoMoreInteractions(t);
	}

	/**
	 * This test ensures, that the function {@link TupbigdC#set(BigDecimal)}
	 * adopts the value for each component and returns the current instance.
	 */
	@Test
	void set_ValueTest()
	{
		TupbigdC t = mock(TupbigdC.class);
		
		when(t.set(BigDecimal.valueOf(1.0))).thenCallRealMethod();
		
		when(t.getDimensions()).thenReturn(2);
		when(t.setArray(BigDecimal.valueOf(1.0), BigDecimal.valueOf(1.0))).thenReturn(t);
		
		assertSame(t, t.set(BigDecimal.valueOf(1.0)));
		
		verify(t).set(BigDecimal.valueOf(1.0));
		
		verify(t).getDimensions();
		verify(t).setArray(BigDecimal.valueOf(1.0), BigDecimal.valueOf(1.0));
		
		verifyNoMoreInteractions(t);
	}

	/**
	 * This test ensures, that the function
	 * {@link TupbigdC#setArray(BigDecimal[])} relays all array entries to the
	 * corresponding component by calling
	 * {@link TupbigdC#setByIndex(int, BigDecimal)} and returns the current
	 * instance.
	 */
	@Test
	void setArrayTest()
	{
		TupbigdC t = mock(TupbigdC.class);
		
		when(t.setArray(new BigDecimal[] {BigDecimal.valueOf(1.0), BigDecimal.valueOf(2.0)})).thenCallRealMethod();
		
		when(t.getDimensions()).thenReturn(2);
		
		assertSame(t, t.setArray(new BigDecimal[] {BigDecimal.valueOf(1.0), BigDecimal.valueOf(2.0)}));
		
		verify(t).setArray(new BigDecimal[] {BigDecimal.valueOf(1.0), BigDecimal.valueOf(2.0)});
		
		verify(t).getDimensions();
		verify(t).setByIndex(0, BigDecimal.valueOf(1.0));
		verify(t).setByIndex(1, BigDecimal.valueOf(2.0));
		
		verifyNoMoreInteractions(t);
	}
}