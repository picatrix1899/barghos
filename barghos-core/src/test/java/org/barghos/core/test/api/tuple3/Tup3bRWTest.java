package org.barghos.core.test.api.tuple3;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import org.barghos.core.api.tuple.TupbR;
import org.barghos.core.api.tuple.TupbRW;
import org.barghos.core.api.tuple3.Tup3bR;
import org.barghos.core.api.tuple3.Tup3bRW;
import org.barghos.core.api.tuple3.Tup3bW;

/**
 * This class provides comoponent tests for the interface {@link Tup3bRW}.
 * 
 * @author picatrix1899
 */
class Tup3bRWTest
{
	/**
	 * This test ensures, that the interface extends the interface {@link Tup3bR}.
	 */
	@Test
	void inheritance_Tup3bRTest()
	{
		assertTrue(Tup3bR.class.isAssignableFrom(Tup3bRW.class));
	}
	
	/**
	 * This test ensures, that the interface extends the interface {@link Tup3bW}.
	 */
	@Test
	void inheritance_Tup3bWTest()
	{
		assertTrue(Tup3bW.class.isAssignableFrom(Tup3bRW.class));
	}
	
	/**
	 * This test ensures, that the interface extends the interface {@link TupbRW}.
	 */
	@Test
	void inheritance_TupbRWTest()
	{
		assertTrue(TupbRW.class.isAssignableFrom(Tup3bRW.class));
	}
	
	/**
	 * This test ensures, that the default implementation of the function {@link Tup3bRW#getNewInstance(Tup3bR)} calls
	 * the function {@link Tup3bRW#getNewInstance(byte, byte, byte)} with the correct components.
	 */
	@Test
	void getNewInstance_Tuple2Test()
	{
		Tup3bR original = mock(Tup3bR.class);
		Tup3bRW newInstance = mock(Tup3bRW.class);
		Tup3bRW t = mock(Tup3bRW.class);
		
		when(t.getNewInstance(original)).thenCallRealMethod();
		
		when(original.getX()).thenReturn((byte)1);
		when(original.getY()).thenReturn((byte)2);
		when(original.getZ()).thenReturn((byte)3);
		when(t.getNewInstance((byte)1, (byte)2, (byte)3)).thenReturn(newInstance);
		
		assertSame(newInstance, t.getNewInstance(original));
		
		verify(t).getNewInstance(original);
		
		verify(original).getX();
		verify(original).getY();
		verify(original).getZ();
		verify(t).getNewInstance((byte)1, (byte)2, (byte)3);
		
		verifyNoMoreInteractions(t, original);
	}
	
	/**
	 * This test ensures, that the default implementation of the function {@link Tup3bRW#getNewInstance(byte)} calls
	 * the function {@link Tup3bRW#getNewInstance(byte, byte, byte)} with the correct components.
	 */
	@Test
	void getNewInstance_ValueTest()
	{
		Tup3bRW newInstance = mock(Tup3bRW.class);
		Tup3bRW t = mock(Tup3bRW.class);
		
		when(t.getNewInstance((byte)1)).thenCallRealMethod();

		when(t.getNewInstance((byte)1, (byte)1, (byte)1)).thenReturn(newInstance);
		
		assertSame(newInstance, t.getNewInstance((byte)1));
		
		verify(t).getNewInstance((byte)1);
		
		verify(t).getNewInstance((byte)1, (byte)1, (byte)1);
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the default implementation of the function {@link Tup3bRW#getNewInstance(TupbR)} calls
	 * the function {@link Tup3bRW#getNewInstance(byte, byte, byte)} with the correct components.
	 */
	@Test
	void getNewInstance_TupleTest()
	{
		TupbR original = mock(TupbR.class);
		Tup3bRW newInstance = mock(Tup3bRW.class);
		Tup3bRW t = mock(Tup3bRW.class);
		
		when(t.getNewInstance(original)).thenCallRealMethod();
		
		when(original.getArray()).thenReturn(new byte[] {(byte)1, (byte)2, (byte)3});
		when(t.getNewInstance((byte)1, (byte)2, (byte)3)).thenReturn(newInstance);
		
		assertSame(newInstance, t.getNewInstance(original));
		
		verify(t).getNewInstance(original);
		
		verify(original).getArray();
		verify(t).getNewInstance((byte)1, (byte)2, (byte)3);
		
		verifyNoMoreInteractions(t, original);
	}
	
	/**
	 * This test ensures, that the default implementation of the function {@link Tup3bRW#getNewInstanceFromArray(byte[])} calls
	 * the function {@link Tup3bRW#getNewInstance(byte, byte, byte)} with the correct components.
	 */
	@Test
	void getNewInstanceFromArrayTest()
	{
		Tup3bRW newInstance = mock(Tup3bRW.class);
		Tup3bRW t = mock(Tup3bRW.class);
		
		when(t.getNewInstanceFromArray(new byte[] {(byte)1, (byte)2, (byte)3})).thenCallRealMethod();

		when(t.getNewInstance((byte)1, (byte)2, (byte)3)).thenReturn(newInstance);
		
		assertSame(newInstance, t.getNewInstanceFromArray(new byte[] {(byte)1, (byte)2, (byte)3}));
		
		verify(t).getNewInstanceFromArray(new byte[] {(byte)1, (byte)2, (byte)3});
		
		verify(t).getNewInstance((byte)1, (byte)2, (byte)3);
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * this test ensures, that the function {@link Tup3bRW#getDimensions()} always
	 * returns 3 and does not make any calls.
	 */
	@Test
	void getDimensionsTest()
	{
		Tup3bRW t = mock(Tup3bRW.class);
		
		when(t.getDimensions()).thenCallRealMethod();
		
		assertEquals(3, t.getDimensions());
		
		verify(t).getDimensions();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup3bRW#set(Tup3bR)} adopts the
	 * values from the input tuple and returns the current instance.
	 */
	@Test
	void set_Tuple2Test()
	{
		Tup3bRW t = mock(Tup3bRW.class);
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
	 * This test ensures, that the function {@link Tup3bRW#set(byte)} adopts the
	 * value for each component and returns the current instance.
	 */
	@Test
	void set_ValueTest()
	{
		Tup3bRW t = mock(Tup3bRW.class);
		
		when(t.set((byte)1)).thenCallRealMethod();
		
		when(t.set((byte)1, (byte)1, (byte)1)).thenReturn(t);
		
		assertSame(t, t.set((byte)1));
		
		verify(t).set((byte)1);

		verify(t).set((byte)1, (byte)1, (byte)1);
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup3bRW#set(byte, byte, byte)} adopts
	 * the values and returns the current instance.
	 */
	@Test
	void setTest()
	{
		Tup3bRW t = mock(Tup3bRW.class);
		
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
	 * This test ensures, that the function {@link Tup3bRW#set(TupbR)} adopts the
	 * values from the input tuple and returns the current instance.
	 */
	@Test
	void set_TupleTest()
	{
		Tup3bRW t = mock(Tup3bRW.class);
		TupbR t2 = mock(TupbR.class);
		
		when(t.set(t2)).thenCallRealMethod();
		
		when(t2.getArray()).thenReturn(new byte[] {(byte)1, (byte)2, (byte)3});
		when(t.set((byte)1, (byte)2, (byte)3)).thenReturn(t);

		assertSame(t, t.set(t2));
		
		verify(t).set(t2);
		
		verify(t2).getArray();
		verify(t).set((byte)1, (byte)2, (byte)3);

		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup3bRW#setArray(byte[])} adopts the
	 * values and returns the current instance.
	 */
	@Test
	void setArrayTest()
	{
		Tup3bRW t = mock(Tup3bRW.class);
		
		when(t.setArray(new byte[] {(byte)1, (byte)2, (byte)3})).thenCallRealMethod();
		
		when(t.set((byte)1, (byte)2, (byte)3)).thenReturn(t);
		
		assertSame(t, t.setArray(new byte[] {(byte)1, (byte)2, (byte)3}));
		
		verify(t).setArray(new byte[] {(byte)1, (byte)2, (byte)3});
		
		verify(t).set((byte)1, (byte)2, (byte)3);
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup3bRW#setByIndex(int, byte)} adopts the
	 * value to the x component if the index is 0 and returns the current instance.
	 */
	@Test
	void setByIndex_XTest()
	{
		Tup3bRW t = mock(Tup3bRW.class);
		
		when(t.setByIndex(0, (byte)1)).thenCallRealMethod();
		
		when(t.setX((byte)1)).thenReturn(t);
		
		assertSame(t, t.setByIndex(0, (byte)1));
		
		verify(t).setByIndex(0, (byte)1);
		
		verify(t).setX((byte)1);
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup3bRW#setByIndex(int, byte)} adopts the
	 * value to the y component if the index is 1 and returns the current instance.
	 */
	@Test
	void setByIndex_YTest()
	{
		Tup3bRW t = mock(Tup3bRW.class);
		
		when(t.setByIndex(1, (byte)1)).thenCallRealMethod();
		
		when(t.setY((byte)1)).thenReturn(t);
		
		assertSame(t, t.setByIndex(1, (byte)1));
		
		verify(t).setByIndex(1, (byte)1);
		
		verify(t).setY((byte)1);
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup3bRW#setByIndex(int, byte)} adopts the
	 * value to the z component if the index is 2 and returns the current instance.
	 */
	@Test
	void setByIndex_ZTest()
	{
		Tup3bRW t = mock(Tup3bRW.class);
		
		when(t.setByIndex(2, (byte)1)).thenCallRealMethod();
		
		when(t.setZ((byte)1)).thenReturn(t);
		
		assertSame(t, t.setByIndex(2, (byte)1));
		
		verify(t).setByIndex(2, (byte)1);
		
		verify(t).setZ((byte)1);
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup3bRW#setByIndex(int, byte)} throws
	 * an {@link IndexOutOfBoundsException} for an index different than 0, 1 or 2.
	 */
	@Test
	void setByIndex_ExceptionTest()
	{
		Tup3bRW t = mock(Tup3bRW.class);
		
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
