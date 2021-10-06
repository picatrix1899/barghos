package org.barghos.core.test.api.tuple2;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import org.barghos.core.api.tuple.TupbR;
import org.barghos.core.api.tuple.TupbRW;
import org.barghos.core.api.tuple2.Tup2bR;
import org.barghos.core.api.tuple2.Tup2bRW;
import org.barghos.core.api.tuple2.Tup2bW;

/**
 * This class provides comoponent tests for the interface {@link Tup2bRW}.
 * 
 * @author picatrix1899
 */
class Tup2bRWTest
{
	/**
	 * This test ensures, that the interface extends the interface {@link Tup2bR}.
	 */
	@Test
	void inheritance_Tup2bRTest()
	{
		assertTrue(Tup2bR.class.isAssignableFrom(Tup2bRW.class));
	}
	
	/**
	 * This test ensures, that the interface extends the interface {@link Tup2bW}.
	 */
	@Test
	void inheritance_Tup2bWTest()
	{
		assertTrue(Tup2bW.class.isAssignableFrom(Tup2bRW.class));
	}
	
	/**
	 * This test ensures, that the interface extends the interface {@link TupbRW}.
	 */
	@Test
	void inheritance_TupbRWTest()
	{
		assertTrue(TupbRW.class.isAssignableFrom(Tup2bRW.class));
	}
	
	/**
	 * This test ensures, that the default implementation of the function {@link Tup2bRW#getNewInstance(Tup2bR)} calls
	 * the function {@link Tup2bRW#getNewInstance(byte, byte)} with the correct components.
	 */
	@Test
	void getNewInstance_Tuple2Test()
	{
		Tup2bR original = mock(Tup2bR.class);
		Tup2bRW newInstance = mock(Tup2bRW.class);
		Tup2bRW t = mock(Tup2bRW.class);
		
		when(t.getNewInstance(original)).thenCallRealMethod();
		
		when(original.getX()).thenReturn((byte)1);
		when(original.getY()).thenReturn((byte)2);
		when(t.getNewInstance((byte)1, (byte)2)).thenReturn(newInstance);
		
		assertSame(newInstance, t.getNewInstance(original));
		
		verify(t).getNewInstance(original);
		
		verify(original).getX();
		verify(original).getY();
		verify(t).getNewInstance((byte)1, (byte)2);
		
		verifyNoMoreInteractions(t, original);
	}
	
	/**
	 * This test ensures, that the default implementation of the function {@link Tup2bRW#getNewInstance(byte)} calls
	 * the function {@link Tup2bRW#getNewInstance(byte, byte)} with the correct components.
	 */
	@Test
	void getNewInstance_ValueTest()
	{
		Tup2bRW newInstance = mock(Tup2bRW.class);
		Tup2bRW t = mock(Tup2bRW.class);
		
		when(t.getNewInstance((byte)1)).thenCallRealMethod();

		when(t.getNewInstance((byte)1, (byte)1)).thenReturn(newInstance);
		
		assertSame(newInstance, t.getNewInstance((byte)1));
		
		verify(t).getNewInstance((byte)1);
		
		verify(t).getNewInstance((byte)1, (byte)1);
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the default implementation of the function {@link Tup2bRW#getNewInstance(TupbR)} calls
	 * the function {@link Tup2bRW#getNewInstance(byte, byte)} with the correct components.
	 */
	@Test
	void getNewInstance_TupleTest()
	{
		TupbR original = mock(TupbR.class);
		Tup2bRW newInstance = mock(Tup2bRW.class);
		Tup2bRW t = mock(Tup2bRW.class);
		
		when(t.getNewInstance(original)).thenCallRealMethod();
		
		when(original.getArray()).thenReturn(new byte[] {(byte)1, (byte)2});
		when(t.getNewInstance((byte)1, (byte)2)).thenReturn(newInstance);
		
		assertSame(newInstance, t.getNewInstance(original));
		
		verify(t).getNewInstance(original);
		
		verify(original).getArray();
		verify(t).getNewInstance((byte)1, (byte)2);
		
		verifyNoMoreInteractions(t, original);
	}
	
	/**
	 * This test ensures, that the default implementation of the function {@link Tup2bRW#getNewInstanceFromArray(byte[])} calls
	 * the function {@link Tup2bRW#getNewInstance(byte, byte)} with the correct components.
	 */
	@Test
	void getNewInstanceFromArrayTest()
	{
		Tup2bRW newInstance = mock(Tup2bRW.class);
		Tup2bRW t = mock(Tup2bRW.class);
		
		when(t.getNewInstanceFromArray(new byte[] {(byte)1, (byte)2})).thenCallRealMethod();

		when(t.getNewInstance((byte)1, (byte)2)).thenReturn(newInstance);
		
		assertSame(newInstance, t.getNewInstanceFromArray(new byte[] {(byte)1, (byte)2}));
		
		verify(t).getNewInstanceFromArray(new byte[] {(byte)1, (byte)2});
		
		verify(t).getNewInstance((byte)1, (byte)2);
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * this test ensures, that the function {@link Tup2bRW#getDimensions()} always
	 * returns 2 and does not make any calls.
	 */
	@Test
	void getDimensionsTest()
	{
		Tup2bRW t = mock(Tup2bRW.class);
		
		when(t.getDimensions()).thenCallRealMethod();
		
		assertEquals(2, t.getDimensions());
		
		verify(t).getDimensions();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup2bRW#set(Tup2bR)} adopts the
	 * values from the input tuple and returns the current instance.
	 */
	@Test
	void set_Tuple2Test()
	{
		Tup2bRW t = mock(Tup2bRW.class);
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
	 * This test ensures, that the function {@link Tup2bRW#set(byte)} adopts the
	 * value for each component and returns the current instance.
	 */
	@Test
	void set_ValueTest()
	{
		Tup2bRW t = mock(Tup2bRW.class);
		
		when(t.set((byte)1)).thenCallRealMethod();
		
		when(t.set((byte)1, (byte)1)).thenReturn(t);
		
		assertSame(t, t.set((byte)1));
		
		verify(t).set((byte)1);

		verify(t).set((byte)1, (byte)1);
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup2bRW#set(byte, byte)} adopts
	 * the values and returns the current instance.
	 */
	@Test
	void setTest()
	{
		Tup2bRW t = mock(Tup2bRW.class);
		
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
	 * This test ensures, that the function {@link Tup2bRW#set(TupbR)} adopts the
	 * values from the input tuple and returns the current instance.
	 */
	@Test
	void set_TupleTest()
	{
		Tup2bRW t = mock(Tup2bRW.class);
		TupbR t2 = mock(TupbR.class);
		
		when(t.set(t2)).thenCallRealMethod();
		
		when(t2.getArray()).thenReturn(new byte[] {(byte)1, (byte)2});
		when(t.set((byte)1, (byte)2)).thenReturn(t);

		assertSame(t, t.set(t2));
		
		verify(t).set(t2);
		
		verify(t2).getArray();
		verify(t).set((byte)1, (byte)2);

		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup2bRW#setArray(byte[])} adopts the
	 * values and returns the current instance.
	 */
	@Test
	void setArrayTest()
	{
		Tup2bRW t = mock(Tup2bRW.class);
		
		when(t.setArray(new byte[] {(byte)1, (byte)2})).thenCallRealMethod();
		
		when(t.set((byte)1, (byte)2)).thenReturn(t);
		
		assertSame(t, t.setArray(new byte[] {(byte)1, (byte)2}));
		
		verify(t).setArray(new byte[] {(byte)1, (byte)2});
		
		verify(t).set((byte)1, (byte)2);
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup2bRW#setByIndex(int, byte)} adopts the
	 * value to the x component if the index is 0 and returns the current instance.
	 */
	@Test
	void setByIndex_XTest()
	{
		Tup2bRW t = mock(Tup2bRW.class);
		
		when(t.setByIndex(0, (byte)1)).thenCallRealMethod();
		
		when(t.setX((byte)1)).thenReturn(t);
		
		assertSame(t, t.setByIndex(0, (byte)1));
		
		verify(t).setByIndex(0, (byte)1);
		
		verify(t).setX((byte)1);
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup2bRW#setByIndex(int, byte)} adopts the
	 * value to the y component if the index is 1 and returns the current instance.
	 */
	@Test
	void setByIndex_YTest()
	{
		Tup2bRW t = mock(Tup2bRW.class);
		
		when(t.setByIndex(1, (byte)1)).thenCallRealMethod();
		
		when(t.setY((byte)1)).thenReturn(t);
		
		assertSame(t, t.setByIndex(1, (byte)1));
		
		verify(t).setByIndex(1, (byte)1);
		
		verify(t).setY((byte)1);
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup2bRW#setByIndex(int, byte)} throws
	 * an {@link IndexOutOfBoundsException} for an index different than 0 or 1.
	 */
	@Test
	void setByIndex_ExceptionTest()
	{
		Tup2bRW t = mock(Tup2bRW.class);
		
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
