package org.barghos.core.test.api.tuple;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;

import org.barghos.core.api.tuple.TupsR;
import org.barghos.core.api.tuple.TupsRW;
import org.barghos.core.api.tuple.TupsW;

/**
 * This class provides component tests for the interface {@link TupsRW}.
 * 
 * @author picatrix1899
 */
class TupsRWTest
{
	/**
	 * This test ensures, that the interface extends the interface {@link TupsR}.
	 */
	@Test
	void inheritance_TupsRTest()
	{
		assertTrue(TupsR.class.isAssignableFrom(TupsRW.class));
	}
	
	/**
	 * This test ensures, that the interface extends the interface {@link TupsW}.
	 */
	@Test
	void inheritance_TupsWTest()
	{
		assertTrue(TupsW.class.isAssignableFrom(TupsRW.class));
	}
	
	/**
	 * This test ensures, that the default implementation of the function {@link TupsRW#getNewInstance(TupsR)} calls
	 * the function {@link TupsRW#getNewInstance(short[])} with the correct components.
	 */
	@Test
	void getNewInstance_TupleTest()
	{
		TupsR original = mock(TupsR.class);
		TupsRW newInstance = mock(TupsRW.class);
		TupsRW t = mock(TupsRW.class);
		
		when(t.getNewInstance(original)).thenCallRealMethod();
		
		when(original.getArray()).thenReturn(new short[] {(short)1, (short)2});
		when(t.getNewInstanceFromArray(new short[] {(short)1, (short)2})).thenReturn(newInstance);
		
		assertSame(newInstance, t.getNewInstance(original));
		
		verify(t).getNewInstance(original);

		verify(original).getArray();
		verify(t).getNewInstanceFromArray(new short[] {(short)1, (short)2});
		
		verifyNoMoreInteractions(t, original);
	}
	
	/**
	 * This test ensures, that the default implementation of the function {@link TupsRW#getNewInstance(short)} calls
	 * the function {@link TupsRW#getNewInstanceFromArray(short[])} with the correct components.
	 */
	@Test
	void getNewInstance_ValueTest()
	{
		TupsRW newInstance = mock(TupsRW.class);
		TupsRW t = mock(TupsRW.class);
		
		when(t.getNewInstance((short)1)).thenCallRealMethod();
		
		when(t.getDimensions()).thenReturn(2);
		when(t.getNewInstanceFromArray(new short[] {(short)1, (short)1})).thenReturn(newInstance);
		
		assertSame(newInstance, t.getNewInstance((short)1));
		
		verify(t).getNewInstance((short)1);

		verify(t).getDimensions();
		verify(t).getNewInstanceFromArray(new short[] {(short)1, (short)1});
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link TupsRW#set(TupsR)} adopts the
	 * values from the input tuple and returns the current instance.
	 */
	@Test
	void set_TupleTest()
	{
		TupsRW t = mock(TupsRW.class);
		TupsR t2 = mock(TupsR.class);
		
		when(t.set(t2)).thenCallRealMethod();
		
		when(t2.getArray()).thenReturn(new short[] {(short)1, (short)2});
		when(t.setArray(new short[] {(short)1, (short)2})).thenReturn(t);
		
		assertSame(t, t.set(t2));
		
		verify(t).set(t2);
		
		verify(t2).getArray();
		verify(t).setArray(new short[] {(short)1, (short)2});
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link TupsRW#set(short)} adopts the
	 * value for each component and returns the current instance.
	 */
	@Test
	void set_ValueTest()
	{
		TupsRW t = mock(TupsRW.class);
		
		when(t.set((short)1)).thenCallRealMethod();
		
		when(t.getDimensions()).thenReturn(2);
		when(t.setArray(new short[] {(short)1, (short)1})).thenReturn(t);
		
		assertSame(t, t.set((short)1));
		
		verify(t).set((short)1);
		
		verify(t).getDimensions();
		verify(t).setArray(new short[] {(short)1, (short)1});
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link TupsRW#setArray(short[])} relays
	 * all array entries to the corresponding component by calling {@link TupsRW#setByIndex(int, short)}
	 * and returns the current instance.
	 */
	@Test
	void setArrayTest()
	{
		TupsRW t = mock(TupsRW.class);
		
		when(t.setArray(new short[] {(short)1, (short)2})).thenCallRealMethod();
		
		when(t.getDimensions()).thenReturn(2);
		
		assertSame(t, t.setArray(new short[] {(short)1, (short)2}));
		
		verify(t).setArray(new short[] {(short)1, (short)2});
		
		verify(t).getDimensions();
		verify(t).setByIndex(0, (short)1);
		verify(t).setByIndex(1, (short)2);
		
		verifyNoMoreInteractions(t);
	}
}