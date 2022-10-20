package org.barghos.tuple.api.test.tn;

import static org.junit.jupiter.api.Assertions.*;

import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;

import org.barghos.tuple.api.tn.TupboC;
import org.barghos.tuple.api.tn.TupboR;

/**
 * This class provides component tests for the interface {@link TupboC}.
 * 
 * @author picatrix1899
 */
class TupboCTest
{

	/**
	 * This test ensures, that the interface extends the interface
	 * {@link TupboR}.
	 */
	@Test
	void inheritance_TupRTest()
	{
		assertTrue(TupboR.class.isAssignableFrom(TupboC.class));
	}

	/**
	 * This test ensures, that the function {@link TupboC#set(TupboR)} adopts
	 * the values from the input tuple and returns the current instance.
	 */
	@Test
	void set_TupleTest()
	{
		TupboC t = mock(TupboC.class);
		TupboR t2 = mock(TupboR.class);
		
		when(t.set(t2)).thenCallRealMethod();
		
		when(t2.toArray()).thenReturn(new boolean[] {true, false});
		when(t.setArray(new boolean[] {true, false})).thenReturn(t);
		
		assertSame(t, t.set(t2));
		
		verify(t).set(t2);
		
		verify(t2).toArray();
		verify(t).setArray(new boolean[] {true, false});
		
		verifyNoMoreInteractions(t);
	}

	/**
	 * This test ensures, that the function {@link TupboC#set(boolean)} adopts
	 * the value for each component and returns the current instance.
	 */
	@Test
	void set_ValueTest()
	{
		TupboC t = mock(TupboC.class);
		
		when(t.set(true)).thenCallRealMethod();
		
		when(t.getDimensions()).thenReturn(2);
		when(t.setArray(new boolean[] {true, true})).thenReturn(t);
		
		assertSame(t, t.set(true));
		
		verify(t).set(true);
		
		verify(t).getDimensions();
		verify(t).setArray(new boolean[] {true, true});
		
		verifyNoMoreInteractions(t);
	}

	/**
	 * This test ensures, that the function {@link TupboC#setArray(boolean[])}
	 * relays all array entries to the corresponding component by calling
	 * {@link TupboC#setByIndex(int, boolean)} and returns the current instance.
	 */
	@Test
	void setArrayTest()
	{
		TupboC t = mock(TupboC.class);
		
		when(t.setArray(new boolean[] {true, false})).thenCallRealMethod();
		
		when(t.getDimensions()).thenReturn(2);
		
		assertSame(t, t.setArray(new boolean[] {true, false}));
		
		verify(t).setArray(new boolean[] {true, false});
		
		verify(t).getDimensions();
		verify(t).setByIndex(0, true);
		verify(t).setByIndex(1, false);
		
		verifyNoMoreInteractions(t);
	}
}