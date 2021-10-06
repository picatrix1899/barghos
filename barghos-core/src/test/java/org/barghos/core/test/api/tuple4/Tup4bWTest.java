package org.barghos.core.test.api.tuple4;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import org.barghos.core.api.tuple.TupbR;
import org.barghos.core.api.tuple.TupbW;
import org.barghos.core.api.tuple4.Tup4bR;
import org.barghos.core.api.tuple4.Tup4bW;

/**
 * This class provides component tests for the interface {@link Tup4bW}.
 * 
 * @author picatrix1899
 */
class Tup4bWTest
{
	/**
	 * This test ensures, that the interface extends the interface {@link TupbW}.
	 */
	@Test
	void inheritance_TupbWTest()
	{
		assertTrue(TupbW.class.isAssignableFrom(Tup4bW.class));
	}
	
	/**
	 * This test ensures, that the function {@link Tup4bW#set(Tup4bR)} adopts the
	 * values from the input tuple and returns the current instance.
	 */
	@Test
	void set_Tuple2Test()
	{
		Tup4bW t = mock(Tup4bW.class);
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
	 * This test ensures, that the function {@link Tup4bW#set(byte)} adopts the
	 * value for each component and returns the current instance.
	 */
	@Test
	void set_ValueTest()
	{
		Tup4bW t = mock(Tup4bW.class);
		
		when(t.set((byte)1)).thenCallRealMethod();
		
		when(t.set((byte)1, (byte)1, (byte)1, (byte)1)).thenReturn(t);
		
		assertSame(t, t.set((byte)1));
		
		verify(t).set((byte)1);

		verify(t).set((byte)1, (byte)1, (byte)1, (byte)1);
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4bW#set(byte, byte, byte, byte)} adopts
	 * the values and returns the current instance.
	 */
	@Test
	void setTest()
	{
		Tup4bW t = mock(Tup4bW.class);
		
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
	 * This test ensures, that the function {@link Tup4bW#set(TupbR)} adopts the
	 * values from the input tuple and returns the current instance.
	 */
	@Test
	void set_TupleTest()
	{
		Tup4bW t = mock(Tup4bW.class);
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
	 * This test ensures, that the function {@link Tup4bW#getDimensions()} always
	 * returns 4 and does not do any calls.
	 */
	@Test
	void getDimensionsTest()
	{
		Tup4bW t = mock(Tup4bW.class);
		
		when(t.getDimensions()).thenCallRealMethod();
		
		assertEquals(4, t.getDimensions());
		
		verify(t).getDimensions();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4bW#setArray(byte[])} adopts the
	 * values and returns the current instance.
	 */
	@Test
	void setArrayTest()
	{
		Tup4bW t = mock(Tup4bW.class);
		
		when(t.setArray(new byte[] {(byte)1, (byte)2, (byte)3, (byte)4})).thenCallRealMethod();
		
		when(t.set((byte)1, (byte)2, (byte)3, (byte)4)).thenReturn(t);
		
		assertSame(t, t.setArray(new byte[] {(byte)1, (byte)2, (byte)3, (byte)4}));
		
		verify(t).setArray(new byte[] {(byte)1, (byte)2, (byte)3, (byte)4});
		
		verify(t).set((byte)1, (byte)2, (byte)3, (byte)4);
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4bW#setByIndex(int, byte)} adopts the
	 * value to the x component if the index is 0 and returns the current instance.
	 */
	@Test
	void setByIndex_XTest()
	{
		Tup4bW t = mock(Tup4bW.class);
		
		when(t.setByIndex(0, (byte)1)).thenCallRealMethod();
		
		when(t.setX((byte)1)).thenReturn(t);
		
		assertSame(t, t.setByIndex(0, (byte)1));
		
		verify(t).setByIndex(0, (byte)1);
		
		verify(t).setX((byte)1);
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4bW#setByIndex(int, byte)} adopts the
	 * value to the y component if the index is 1 and returns the current instance.
	 */
	@Test
	void setByIndex_YTest()
	{
		Tup4bW t = mock(Tup4bW.class);
		
		when(t.setByIndex(1, (byte)1)).thenCallRealMethod();
		
		when(t.setY((byte)1)).thenReturn(t);
		
		assertSame(t, t.setByIndex(1, (byte)1));
		
		verify(t).setByIndex(1, (byte)1);
		
		verify(t).setY((byte)1);
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4bW#setByIndex(int, byte)} adopts the
	 * value to the z component if the index is 2 and returns the current instance.
	 */
	@Test
	void setByIndex_ZTest()
	{
		Tup4bW t = mock(Tup4bW.class);
		
		when(t.setByIndex(2, (byte)1)).thenCallRealMethod();
		
		when(t.setZ((byte)1)).thenReturn(t);
		
		assertSame(t, t.setByIndex(2, (byte)1));
		
		verify(t).setByIndex(2, (byte)1);
		
		verify(t).setZ((byte)1);
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4bW#setByIndex(int, byte)} adopts the
	 * value to the w component if the index is 3 and returns the current instance.
	 */
	@Test
	void setByIndex_WTest()
	{
		Tup4bW t = mock(Tup4bW.class);
		
		when(t.setByIndex(3, (byte)1)).thenCallRealMethod();
		
		when(t.setW((byte)1)).thenReturn(t);
		
		assertSame(t, t.setByIndex(3, (byte)1));
		
		verify(t).setByIndex(3, (byte)1);
		
		verify(t).setW((byte)1);
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4bW#setByIndex(int, byte)} throws
	 * an {@link IndexOutOfBoundsException} for an index different than 0, 1, 2 or 3.
	 */
	@Test
	void setByIndex_ExceptionTest()
	{
		Tup4bW t = mock(Tup4bW.class);
		
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