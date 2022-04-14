package org.barghos.core.test.api.tuple3;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;
import org.barghos.core.api.tuple.TupbBase;
import org.barghos.core.api.tuple.TupbR;
import org.barghos.core.api.tuple3.Tup3bBase;
import org.barghos.core.api.tuple3.Tup3bR;

/**
 * This class provides comoponent tests for the interface {@link Tup3bBase}.
 * 
 * @author picatrix1899
 */
class Tup3bBaseTest
{
	/**
	 * This test ensures, that the interface extends the interface {@link Tup3bR}.
	 */
	@Test
	void inheritance_Tup3bRTest()
	{
		assertTrue(Tup3bR.class.isAssignableFrom(Tup3bBase.class));
	}
	
	/**
	 * This test ensures, that the interface extends the interface {@link Tup3bBase}.
	 */
	@Test
	void inheritance_TupbBaseTest()
	{
		assertTrue(TupbBase.class.isAssignableFrom(Tup3bBase.class));
	}

	/**
	 * This test ensures, that the function {@link Tup3bBase#set(Tup3bR)} adopts the
	 * values from the input tuple and returns the current instance.
	 */
	@Test
	void set_Tuple2Test()
	{
		Tup3bBase t = mock(Tup3bBase.class);
		Tup3bR t2 = mock(Tup3bR.class);
		
		when(t.set(t2)).thenCallRealMethod();
		
		when(t2.getX()).thenReturn((byte)1);
		when(t2.getY()).thenReturn((byte)2);
		when(t2.getZ()).thenReturn((byte)3);
		when(t.set((byte)1, (byte)2, (byte)3)).thenReturn(t);
		
		assertSame(t, t.set(t2));
		
		verify(t).set(t2);
		
		verify(t2).getX();
		verify(t2).getY();
		verify(t2).getZ();
		verify(t).set((byte)1, (byte)2, (byte)3);
		
		verifyNoMoreInteractions(t, t2);
	}
	
	/**
	 * This test ensures, that the function {@link Tup3bBase#set(byte)} adopts the
	 * value for each component and returns the current instance.
	 */
	@Test
	void set_ValueTest()
	{
		Tup3bBase t = mock(Tup3bBase.class);
		
		when(t.set((byte)1)).thenCallRealMethod();
		
		when(t.set((byte)1, (byte)1, (byte)1)).thenReturn(t);
		
		assertSame(t, t.set((byte)1));
		
		verify(t).set((byte)1);

		verify(t).set((byte)1, (byte)1, (byte)1);
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup3bBase#set(byte, byte, byte)} adopts
	 * the values and returns the current instance.
	 */
	@Test
	void setTest()
	{
		Tup3bBase t = mock(Tup3bBase.class);
		
		when(t.set((byte)1, (byte)2, (byte)3)).thenCallRealMethod();
		
		when(t.setX((byte)1)).thenReturn(t);
		when(t.setY((byte)2)).thenReturn(t);
		when(t.setZ((byte)3)).thenReturn(t);
		
		assertSame(t, t.set((byte)1, (byte)2, (byte)3));
		
		verify(t).set((byte)1, (byte)2, (byte)3);

		verify(t).setX((byte)1);
		verify(t).setY((byte)2);
		verify(t).setZ((byte)3);
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup3bBase#set(TupbR)} adopts the
	 * values from the input tuple and returns the current instance.
	 */
	@Test
	void set_TupleTest()
	{
		Tup3bBase t = mock(Tup3bBase.class);
		TupbR t2 = mock(TupbR.class);
		
		when(t.set(t2)).thenCallRealMethod();
		
		when(t2.toArray()).thenReturn(new byte[] {(byte)1, (byte)2, (byte)3});
		when(t.setArray(new byte[] {(byte)1, (byte)2, (byte)3})).thenReturn(t);

		assertSame(t, t.set(t2));
		
		verify(t).set(t2);
		
		verify(t2).toArray();
		verify(t).setArray(new byte[] {(byte)1, (byte)2, (byte)3});

		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup3bBase#setByIndex(int, byte)} adopts the
	 * value to the x component if the index is 0 and returns the current instance.
	 */
	@Test
	void setByIndex_XTest()
	{
		Tup3bBase t = mock(Tup3bBase.class);
		
		when(t.setByIndex(0, (byte)1)).thenCallRealMethod();
		
		when(t.setX((byte)1)).thenReturn(t);
		
		assertSame(t, t.setByIndex(0, (byte)1));
		
		verify(t).setByIndex(0, (byte)1);
		
		verify(t).setX((byte)1);
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup3bBase#setByIndex(int, byte)} adopts the
	 * value to the y component if the index is 1 and returns the current instance.
	 */
	@Test
	void setByIndex_YTest()
	{
		Tup3bBase t = mock(Tup3bBase.class);
		
		when(t.setByIndex(1, (byte)1)).thenCallRealMethod();
		
		when(t.setY((byte)1)).thenReturn(t);
		
		assertSame(t, t.setByIndex(1, (byte)1));
		
		verify(t).setByIndex(1, (byte)1);
		
		verify(t).setY((byte)1);
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup3bBase#setByIndex(int, byte)} adopts the
	 * value to the z component if the index is 2 and returns the current instance.
	 */
	@Test
	void setByIndex_ZTest()
	{
		Tup3bBase t = mock(Tup3bBase.class);
		
		when(t.setByIndex(2, (byte)1)).thenCallRealMethod();
		
		when(t.setZ((byte)1)).thenReturn(t);
		
		assertSame(t, t.setByIndex(2, (byte)1));
		
		verify(t).setByIndex(2, (byte)1);
		
		verify(t).setZ((byte)1);
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup3bBase#setByIndex(int, byte)} throws
	 * an {@link IndexOutOfBoundsException} for an index different than 0, 1 or 2.
	 */
	@Test
	void setByIndex_ExceptionTest()
	{
		Tup3bBase t = mock(Tup3bBase.class);
		
		when(t.setByIndex(3, (byte)1)).thenCallRealMethod();

		assertThrows(IndexOutOfBoundsException.class, new Executable() {
			public void execute() throws Throwable
			{
				t.setByIndex(3, (byte)1);
			}
		});

		verify(t).setByIndex(3, (byte)1);

		verifyNoMoreInteractions(t);
	}
}
