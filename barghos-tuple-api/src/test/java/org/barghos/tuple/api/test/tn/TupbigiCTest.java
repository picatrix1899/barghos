package org.barghos.tuple.api.test.tn;

import static org.junit.jupiter.api.Assertions.*;

import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;

import java.math.BigInteger;

import org.barghos.tuple.api.tn.TupbigiC;
import org.barghos.tuple.api.tn.TupbigiR;

/**
 * This class provides component tests for the interface {@link TupbigiC}.
 * 
 * @author picatrix1899
 */
class TupbigiCTest
{

	/**
	 * This test ensures, that the interface extends the interface
	 * {@link TupbigiR}.
	 */
	@Test
	void inheritance_TupRTest()
	{
		assertTrue(TupbigiR.class.isAssignableFrom(TupbigiC.class));
	}

	/**
	 * This test ensures, that the function {@link TupbigiC#set(TupbigiR)}
	 * adopts the values from the input tuple and returns the current instance.
	 */
	@Test
	void set_TupleTest()
	{
		TupbigiC t = mock(TupbigiC.class);
		TupbigiR t2 = mock(TupbigiR.class);
		
		when(t.set(t2)).thenCallRealMethod();
		
		when(t2.toArray()).thenReturn(new BigInteger[] {BigInteger.valueOf(1), BigInteger.valueOf(2)});
		when(t.setArray(new BigInteger[] {BigInteger.valueOf(1), BigInteger.valueOf(2)})).thenReturn(t);
		
		assertSame(t, t.set(t2));
		
		verify(t).set(t2);
		
		verify(t2).toArray();
		verify(t).setArray(new BigInteger[] {BigInteger.valueOf(1), BigInteger.valueOf(2)});
		
		verifyNoMoreInteractions(t);
	}

	/**
	 * This test ensures, that the function {@link TupbigiC#set(BigInteger)}
	 * adopts the value for each component and returns the current instance.
	 */
	@Test
	void set_ValueTest()
	{
		TupbigiC t = mock(TupbigiC.class);
		
		when(t.set(BigInteger.valueOf(1))).thenCallRealMethod();
		
		when(t.getDimensions()).thenReturn(2);
		when(t.setArray(new BigInteger[] {BigInteger.valueOf(1), BigInteger.valueOf(1)})).thenReturn(t);
		
		assertSame(t, t.set(BigInteger.valueOf(1)));
		
		verify(t).set(BigInteger.valueOf(1));
		
		verify(t).getDimensions();
		verify(t).setArray(new BigInteger[] {BigInteger.valueOf(1), BigInteger.valueOf(1)});
		
		verifyNoMoreInteractions(t);
	}

	/**
	 * This test ensures, that the function
	 * {@link TupbigiC#setArray(BigInteger[])} relays all array entries to the
	 * corresponding component by calling
	 * {@link TupbigiC#setByIndex(int, BigInteger)} and returns the current
	 * instance.
	 */
	@Test
	void setArrayTest()
	{
		TupbigiC t = mock(TupbigiC.class);
		
		when(t.setArray(new BigInteger[] {BigInteger.valueOf(1), BigInteger.valueOf(2)})).thenCallRealMethod();
		
		when(t.getDimensions()).thenReturn(2);
		
		assertSame(t, t.setArray(new BigInteger[] {BigInteger.valueOf(1), BigInteger.valueOf(2)}));
		
		verify(t).setArray(new BigInteger[] {BigInteger.valueOf(1), BigInteger.valueOf(2)});
		
		verify(t).getDimensions();
		verify(t).setByIndex(0, BigInteger.valueOf(1));
		verify(t).setByIndex(1, BigInteger.valueOf(2));
		
		verifyNoMoreInteractions(t);
	}
}