package org.barghos.core.test.api.tuple4;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import org.barghos.core.api.tuple.TupbR;
import org.barghos.core.api.tuple.TupbRW;
import org.barghos.core.api.tuple4.Tup4bR;
import org.barghos.core.api.tuple4.Tup4bRW;
import org.barghos.core.api.tuple4.Tup4bW;

/**
 * This class provides comoponent tests for the interface {@link Tup4bRW}.
 * 
 * @author picatrix1899
 */
class Tup4bRWTest
{
	/**
	 * This test ensures, that the interface extends the interface {@link Tup4bR}.
	 */
	@Test
	void inheritance_Tup4bRTest()
	{
		assertTrue(Tup4bR.class.isAssignableFrom(Tup4bRW.class));
	}
	
	/**
	 * This test ensures, that the interface extends the interface {@link Tup4bW}.
	 */
	@Test
	void inheritance_Tup4bWTest()
	{
		assertTrue(Tup4bW.class.isAssignableFrom(Tup4bRW.class));
	}
	
	/**
	 * This test ensures, that the interface extends the interface {@link TupbRW}.
	 */
	@Test
	void inheritance_TupbRWTest()
	{
		assertTrue(TupbRW.class.isAssignableFrom(Tup4bRW.class));
	}
	
	/**
	 * This test ensures, that the default implementation of the function {@link Tup4bRW#getNewInstance(Tup4bR)} calls
	 * the function {@link Tup4bRW#getNewInstance(byte, byte, byte, byte)} with the correct components.
	 */
	@Test
	void getNewInstance_Tuple2Test()
	{
		Tup4bR original = mock(Tup4bR.class);
		Tup4bRW newInstance = mock(Tup4bRW.class);
		Tup4bRW t = mock(Tup4bRW.class);
		
		when(t.getNewInstance(original)).thenCallRealMethod();
		
		when(original.getX()).thenReturn((byte)1);
		when(original.getY()).thenReturn((byte)2);
		when(original.getZ()).thenReturn((byte)3);
		when(original.getW()).thenReturn((byte)4);
		when(t.getNewInstance((byte)1, (byte)2, (byte)3, (byte)4)).thenReturn(newInstance);
		
		assertSame(newInstance, t.getNewInstance(original));
		
		verify(t).getNewInstance(original);
		
		verify(original).getX();
		verify(original).getY();
		verify(original).getZ();
		verify(original).getW();
		verify(t).getNewInstance((byte)1, (byte)2, (byte)3, (byte)4);
		
		verifyNoMoreInteractions(t, original);
	}
	
	/**
	 * This test ensures, that the default implementation of the function {@link Tup4bRW#getNewInstance(byte)} calls
	 * the function {@link Tup4bRW#getNewInstance(byte, byte, byte, byte)} with the correct components.
	 */
	@Test
	void getNewInstance_ValueTest()
	{
		Tup4bRW newInstance = mock(Tup4bRW.class);
		Tup4bRW t = mock(Tup4bRW.class);
		
		when(t.getNewInstance((byte)1)).thenCallRealMethod();

		when(t.getNewInstance((byte)1, (byte)1, (byte)1, (byte)1)).thenReturn(newInstance);
		
		assertSame(newInstance, t.getNewInstance((byte)1));
		
		verify(t).getNewInstance((byte)1);
		
		verify(t).getNewInstance((byte)1, (byte)1, (byte)1, (byte)1);
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the default implementation of the function {@link Tup4bRW#getNewInstance(TupbR)} calls
	 * the function {@link Tup4bRW#getNewInstance(byte, byte, byte, byte)} with the correct components.
	 */
	@Test
	void getNewInstance_TupleTest()
	{
		TupbR original = mock(TupbR.class);
		Tup4bRW newInstance = mock(Tup4bRW.class);
		Tup4bRW t = mock(Tup4bRW.class);
		
		when(t.getNewInstance(original)).thenCallRealMethod();
		
		when(original.getArray()).thenReturn(new byte[] {(byte)1, (byte)2, (byte)3, (byte)4});
		when(t.getNewInstance((byte)1, (byte)2, (byte)3, (byte)4)).thenReturn(newInstance);
		
		assertSame(newInstance, t.getNewInstance(original));
		
		verify(t).getNewInstance(original);
		
		verify(original).getArray();
		verify(t).getNewInstance((byte)1, (byte)2, (byte)3, (byte)4);
		
		verifyNoMoreInteractions(t, original);
	}
	
	/**
	 * This test ensures, that the default implementation of the function {@link Tup4bRW#getNewInstanceFromArray(byte[])} calls
	 * the function {@link Tup4bRW#getNewInstance(byte, byte, byte, byte)} with the correct components.
	 */
	@Test
	void getNewInstanceFromArrayTest()
	{
		Tup4bRW newInstance = mock(Tup4bRW.class);
		Tup4bRW t = mock(Tup4bRW.class);
		
		when(t.getNewInstanceFromArray(new byte[] {(byte)1, (byte)2, (byte)3, (byte)4})).thenCallRealMethod();

		when(t.getNewInstance((byte)1, (byte)2, (byte)3, (byte)4)).thenReturn(newInstance);
		
		assertSame(newInstance, t.getNewInstanceFromArray(new byte[] {(byte)1, (byte)2, (byte)3, (byte)4}));
		
		verify(t).getNewInstanceFromArray(new byte[] {(byte)1, (byte)2, (byte)3, (byte)4});
		
		verify(t).getNewInstance((byte)1, (byte)2, (byte)3, (byte)4);
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * this test ensures, that the function {@link Tup4bRW#getDimensions()} always
	 * returns 4 and does not make any calls.
	 */
	@Test
	void getDimensionsTest()
	{
		Tup4bRW t = mock(Tup4bRW.class);
		
		when(t.getDimensions()).thenCallRealMethod();
		
		assertEquals(4, t.getDimensions());
		
		verify(t).getDimensions();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4bRW#set(Tup4bR)} adopts the
	 * values from the input tuple and returns the current instance.
	 */
	@Test
	void set_Tuple2Test()
	{
		Tup4bRW t = mock(Tup4bRW.class);
		Tup4bR t2 = mock(Tup4bR.class);
		
		when(t.set(t2)).thenCallRealMethod();
		
		when(t2.getX()).thenReturn((byte)1);
		when(t2.getY()).thenReturn((byte)2);
		when(t2.getZ()).thenReturn((byte)3);
		when(t2.getW()).thenReturn((byte)4);
		when(t.set((byte)1, (byte)2, (byte)3, (byte)4)).thenReturn(t);
		
		assertSame(t, t.set(t2));
		
		verify(t).set(t2);
		
		verify(t2).getX();
		verify(t2).getY();
		verify(t2).getZ();
		verify(t2).getW();
		verify(t).set((byte)1, (byte)2, (byte)3, (byte)4);
		
		verifyNoMoreInteractions(t, t2);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4bRW#set(byte)} adopts the
	 * value for each component and returns the current instance.
	 */
	@Test
	void set_ValueTest()
	{
		Tup4bRW t = mock(Tup4bRW.class);
		
		when(t.set((byte)1)).thenCallRealMethod();
		
		when(t.set((byte)1, (byte)1, (byte)1, (byte)1)).thenReturn(t);
		
		assertSame(t, t.set((byte)1));
		
		verify(t).set((byte)1);

		verify(t).set((byte)1, (byte)1, (byte)1, (byte)1);
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4bRW#set(byte, byte, byte, byte)} adopts
	 * the values and returns the current instance.
	 */
	@Test
	void setTest()
	{
		Tup4bRW t = mock(Tup4bRW.class);
		
		when(t.set((byte)1, (byte)2, (byte)3, (byte)4)).thenCallRealMethod();
		
		when(t.setX((byte)1)).thenReturn(t);
		when(t.setY((byte)2)).thenReturn(t);
		when(t.setZ((byte)3)).thenReturn(t);
		when(t.setW((byte)4)).thenReturn(t);
		
		assertSame(t, t.set((byte)1, (byte)2, (byte)3, (byte)4));
		
		verify(t).set((byte)1, (byte)2, (byte)3, (byte)4);

		verify(t).setX((byte)1);
		verify(t).setY((byte)2);
		verify(t).setZ((byte)3);
		verify(t).setW((byte)4);
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4bRW#set(TupbR)} adopts the
	 * values from the input tuple and returns the current instance.
	 */
	@Test
	void set_TupleTest()
	{
		Tup4bRW t = mock(Tup4bRW.class);
		TupbR t2 = mock(TupbR.class);
		
		when(t.set(t2)).thenCallRealMethod();
		
		when(t2.getArray()).thenReturn(new byte[] {(byte)1, (byte)2, (byte)3, (byte)4});
		when(t.set((byte)1, (byte)2, (byte)3, (byte)4)).thenReturn(t);

		assertSame(t, t.set(t2));
		
		verify(t).set(t2);
		
		verify(t2).getArray();
		verify(t).set((byte)1, (byte)2, (byte)3, (byte)4);

		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4bRW#setArray(byte[])} adopts the
	 * values and returns the current instance.
	 */
	@Test
	void setArrayTest()
	{
		Tup4bRW t = mock(Tup4bRW.class);
		
		when(t.setArray(new byte[] {(byte)1, (byte)2, (byte)3, (byte)4})).thenCallRealMethod();
		
		when(t.set((byte)1, (byte)2, (byte)3, (byte)4)).thenReturn(t);
		
		assertSame(t, t.setArray(new byte[] {(byte)1, (byte)2, (byte)3, (byte)4}));
		
		verify(t).setArray(new byte[] {(byte)1, (byte)2, (byte)3, (byte)4});
		
		verify(t).set((byte)1, (byte)2, (byte)3, (byte)4);
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4bRW#setByIndex(int, byte)} adopts the
	 * value to the x component if the index is 0 and returns the current instance.
	 */
	@Test
	void setByIndex_XTest()
	{
		Tup4bRW t = mock(Tup4bRW.class);
		
		when(t.setByIndex(0, (byte)1)).thenCallRealMethod();
		
		when(t.setX((byte)1)).thenReturn(t);
		
		assertSame(t, t.setByIndex(0, (byte)1));
		
		verify(t).setByIndex(0, (byte)1);
		
		verify(t).setX((byte)1);
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4bRW#setByIndex(int, byte)} adopts the
	 * value to the y component if the index is 1 and returns the current instance.
	 */
	@Test
	void setByIndex_YTest()
	{
		Tup4bRW t = mock(Tup4bRW.class);
		
		when(t.setByIndex(1, (byte)1)).thenCallRealMethod();
		
		when(t.setY((byte)1)).thenReturn(t);
		
		assertSame(t, t.setByIndex(1, (byte)1));
		
		verify(t).setByIndex(1, (byte)1);
		
		verify(t).setY((byte)1);
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4bRW#setByIndex(int, byte)} adopts the
	 * value to the z component if the index is 2 and returns the current instance.
	 */
	@Test
	void setByIndex_ZTest()
	{
		Tup4bRW t = mock(Tup4bRW.class);
		
		when(t.setByIndex(2, (byte)1)).thenCallRealMethod();
		
		when(t.setZ((byte)1)).thenReturn(t);
		
		assertSame(t, t.setByIndex(2, (byte)1));
		
		verify(t).setByIndex(2, (byte)1);
		
		verify(t).setZ((byte)1);
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4bRW#setByIndex(int, byte)} adopts the
	 * value to the w component if the index is 3 and returns the current instance.
	 */
	@Test
	void setByIndex_WTest()
	{
		Tup4bRW t = mock(Tup4bRW.class);
		
		when(t.setByIndex(3, (byte)1)).thenCallRealMethod();
		
		when(t.setW((byte)1)).thenReturn(t);
		
		assertSame(t, t.setByIndex(3, (byte)1));
		
		verify(t).setByIndex(3, (byte)1);
		
		verify(t).setW((byte)1);
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4bRW#setByIndex(int, byte)} throws
	 * an {@link IndexOutOfBoundsException} for an index different than 0, 1, 2 or 3.
	 */
	@Test
	void setByIndex_ExceptionTest()
	{
		Tup4bRW t = mock(Tup4bRW.class);
		
		when(t.setByIndex(4, (byte)1)).thenCallRealMethod();

		assertThrows(IndexOutOfBoundsException.class, new Executable() {
			public void execute() throws Throwable
			{
				t.setByIndex(4, (byte)1);
			}
		});

		verify(t).setByIndex(4, (byte)1);

		verifyNoMoreInteractions(t);
	}
}
