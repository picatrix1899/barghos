package org.barghos.core.test.api.tuple2;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import org.barghos.core.api.tuple.TupbBase;
import org.barghos.core.api.tuple.TupbR;
import org.barghos.core.api.tuple2.Tup2bBase;
import org.barghos.core.api.tuple2.Tup2bR;

/**
 * This class provides comoponent tests for the interface {@link Tup2bBase}.
 * 
 * @author picatrix1899
 */
class Tup2bBaseTest
{
	/**
	 * This test ensures, that the interface extends the interface {@link Tup2bR}.
	 */
	@Test
	void inheritance_Tup2bRTest()
	{
		assertTrue(Tup2bR.class.isAssignableFrom(Tup2bBase.class));
	}
	
	/**
	 * This test ensures, that the interface extends the interface {@link TupbBase}.
	 */
	@Test
	void inheritance_TupbBaseTest()
	{
		assertTrue(TupbBase.class.isAssignableFrom(Tup2bBase.class));
	}
	
	/**
	 * This test ensures, that the function {@link Tup2bBase#set(Tup2bR)} adopts the
	 * values from the input tuple and returns the current instance.
	 */
	@Test
	void set_Tuple2Test()
	{
		Tup2bBase t = mock(Tup2bBase.class);
		Tup2bR t2 = mock(Tup2bR.class);
		
		when(t.set(t2)).thenCallRealMethod();
		
		when(t2.getX()).thenReturn((byte)1);
		when(t2.getY()).thenReturn((byte)2);
		when(t.set((byte)1, (byte)2)).thenReturn(t);
		
		assertSame(t, t.set(t2));
		
		verify(t).set(t2);
		
		verify(t2).getX();
		verify(t2).getY();
		verify(t).set((byte)1, (byte)2);
		
		verifyNoMoreInteractions(t, t2);
	}
	
	/**
	 * This test ensures, that the function {@link Tup2bBase#set(byte)} adopts the
	 * value for each component and returns the current instance.
	 */
	@Test
	void set_ValueTest()
	{
		Tup2bBase t = mock(Tup2bBase.class);
		
		when(t.set((byte)1)).thenCallRealMethod();
		
		when(t.set((byte)1, (byte)1)).thenReturn(t);
		
		assertSame(t, t.set((byte)1));
		
		verify(t).set((byte)1);

		verify(t).set((byte)1, (byte)1);
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup2bBase#set(byte, byte)} adopts
	 * the values and returns the current instance.
	 */
	@Test
	void setTest()
	{
		Tup2bBase t = mock(Tup2bBase.class);
		
		when(t.set((byte)1, (byte)2)).thenCallRealMethod();
		
		when(t.setX((byte)1)).thenReturn(t);
		when(t.setY((byte)2)).thenReturn(t);
		
		assertSame(t, t.set((byte)1, (byte)2));
		
		verify(t).set((byte)1, (byte)2);

		verify(t).setX((byte)1);
		verify(t).setY((byte)2);
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup2bBase#set(TupbR)} adopts the
	 * values from the input tuple and returns the current instance.
	 */
	@Test
	void set_TupleTest()
	{
		Tup2bBase t = mock(Tup2bBase.class);
		TupbR t2 = mock(TupbR.class);
		
		when(t.set(t2)).thenCallRealMethod();
		
		when(t2.toArray()).thenReturn(new byte[] {(byte)1, (byte)2});
		when(t.setArray(new byte[] {(byte)1, (byte)2})).thenReturn(t);

		assertSame(t, t.set(t2));
		
		verify(t).set(t2);
		
		verify(t2).toArray();
		verify(t).setArray(new byte[] {(byte)1, (byte)2});

		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup2bBase#setByIndex(int, byte)} adopts the
	 * value to the x component if the index is 0 and returns the current instance.
	 */
	@Test
	void setByIndex_XTest()
	{
		Tup2bBase t = mock(Tup2bBase.class);
		
		when(t.setByIndex(0, (byte)1)).thenCallRealMethod();
		
		when(t.setX((byte)1)).thenReturn(t);
		
		assertSame(t, t.setByIndex(0, (byte)1));
		
		verify(t).setByIndex(0, (byte)1);
		
		verify(t).setX((byte)1);
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup2bBase#setByIndex(int, byte)} adopts the
	 * value to the y component if the index is 1 and returns the current instance.
	 */
	@Test
	void setByIndex_YTest()
	{
		Tup2bBase t = mock(Tup2bBase.class);
		
		when(t.setByIndex(1, (byte)1)).thenCallRealMethod();
		
		when(t.setY((byte)1)).thenReturn(t);
		
		assertSame(t, t.setByIndex(1, (byte)1));
		
		verify(t).setByIndex(1, (byte)1);
		
		verify(t).setY((byte)1);
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup2bBase#setByIndex(int, byte)} throws
	 * an {@link IndexOutOfBoundsException} for an index different than 0 or 1.
	 */
	@Test
	void setByIndex_ExceptionTest()
	{
		Tup2bBase t = mock(Tup2bBase.class);
		
		when(t.setByIndex(2, (byte)1)).thenCallRealMethod();

		assertThrows(IndexOutOfBoundsException.class, new Executable() {
			public void execute() throws Throwable
			{
				t.setByIndex(2, (byte)1);
			}
		});

		verify(t).setByIndex(2, (byte)1);

		verifyNoMoreInteractions(t);
	}
}
