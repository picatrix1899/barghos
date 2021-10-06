package org.barghos.core.test.api.tuple2;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import org.barghos.core.api.tuple.TupsR;
import org.barghos.core.api.tuple.TupsRW;
import org.barghos.core.api.tuple2.Tup2sR;
import org.barghos.core.api.tuple2.Tup2sRW;
import org.barghos.core.api.tuple2.Tup2sW;

/**
 * This class provides comoponent tests for the interface {@link Tup2sRW}.
 * 
 * @author picatrix1899
 */
class Tup2sRWTest
{
	/**
	 * This test ensures, that the interface extends the interface {@link Tup2sR}.
	 */
	@Test
	void inheritance_Tup2sRTest()
	{
		assertTrue(Tup2sR.class.isAssignableFrom(Tup2sRW.class));
	}
	
	/**
	 * This test ensures, that the interface extends the interface {@link Tup2sW}.
	 */
	@Test
	void inheritance_Tup2sWTest()
	{
		assertTrue(Tup2sW.class.isAssignableFrom(Tup2sRW.class));
	}
	
	/**
	 * This test ensures, that the interface extends the interface {@link TupsRW}.
	 */
	@Test
	void inheritance_TupsRWTest()
	{
		assertTrue(TupsRW.class.isAssignableFrom(Tup2sRW.class));
	}
	
	/**
	 * This test ensures, that the default implementation of the function {@link Tup2sRW#getNewInstance(Tup2sR)} calls
	 * the function {@link Tup2sRW#getNewInstance(short, short)} with the correct components.
	 */
	@Test
	void getNewInstance_Tuple2Test()
	{
		Tup2sR original = mock(Tup2sR.class);
		Tup2sRW newInstance = mock(Tup2sRW.class);
		Tup2sRW t = mock(Tup2sRW.class);
		
		when(t.getNewInstance(original)).thenCallRealMethod();
		
		when(original.getX()).thenReturn((short)1);
		when(original.getY()).thenReturn((short)2);
		when(t.getNewInstance((short)1, (short)2)).thenReturn(newInstance);
		
		assertSame(newInstance, t.getNewInstance(original));
		
		verify(t).getNewInstance(original);
		
		verify(original).getX();
		verify(original).getY();
		verify(t).getNewInstance((short)1, (short)2);
		
		verifyNoMoreInteractions(t, original);
	}
	
	/**
	 * This test ensures, that the default implementation of the function {@link Tup2sRW#getNewInstance(short)} calls
	 * the function {@link Tup2sRW#getNewInstance(short, short)} with the correct components.
	 */
	@Test
	void getNewInstance_ValueTest()
	{
		Tup2sRW newInstance = mock(Tup2sRW.class);
		Tup2sRW t = mock(Tup2sRW.class);
		
		when(t.getNewInstance((short)1)).thenCallRealMethod();

		when(t.getNewInstance((short)1, (short)1)).thenReturn(newInstance);
		
		assertSame(newInstance, t.getNewInstance((short)1));
		
		verify(t).getNewInstance((short)1);
		
		verify(t).getNewInstance((short)1, (short)1);
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the default implementation of the function {@link Tup2sRW#getNewInstance(TupsR)} calls
	 * the function {@link Tup2sRW#getNewInstance(short, short)} with the correct components.
	 */
	@Test
	void getNewInstance_TupleTest()
	{
		TupsR original = mock(TupsR.class);
		Tup2sRW newInstance = mock(Tup2sRW.class);
		Tup2sRW t = mock(Tup2sRW.class);
		
		when(t.getNewInstance(original)).thenCallRealMethod();
		
		when(original.getArray()).thenReturn(new short[] {(short)1, (short)2});
		when(t.getNewInstance((short)1, (short)2)).thenReturn(newInstance);
		
		assertSame(newInstance, t.getNewInstance(original));
		
		verify(t).getNewInstance(original);
		
		verify(original).getArray();
		verify(t).getNewInstance((short)1, (short)2);
		
		verifyNoMoreInteractions(t, original);
	}
	
	/**
	 * This test ensures, that the default implementation of the function {@link Tup2sRW#getNewInstanceFromArray(short[])} calls
	 * the function {@link Tup2sRW#getNewInstance(short, short)} with the correct components.
	 */
	@Test
	void getNewInstanceFromArrayTest()
	{
		Tup2sRW newInstance = mock(Tup2sRW.class);
		Tup2sRW t = mock(Tup2sRW.class);
		
		when(t.getNewInstanceFromArray(new short[] {(short)1, (short)2})).thenCallRealMethod();

		when(t.getNewInstance((short)1, (short)2)).thenReturn(newInstance);
		
		assertSame(newInstance, t.getNewInstanceFromArray(new short[] {(short)1, (short)2}));
		
		verify(t).getNewInstanceFromArray(new short[] {(short)1, (short)2});
		
		verify(t).getNewInstance((short)1, (short)2);
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * this test ensures, that the function {@link Tup2sRW#getDimensions()} always
	 * returns 2 and does not make any calls.
	 */
	@Test
	void getDimensionsTest()
	{
		Tup2sRW t = mock(Tup2sRW.class);
		
		when(t.getDimensions()).thenCallRealMethod();
		
		assertEquals(2, t.getDimensions());
		
		verify(t).getDimensions();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup2sRW#set(Tup2sR)} adopts the
	 * values from the input tuple and returns the current instance.
	 */
	@Test
	void set_Tuple2Test()
	{
		Tup2sRW t = mock(Tup2sRW.class);
		Tup2sR t2 = mock(Tup2sR.class);
		
		when(t.set(t2)).thenCallRealMethod();
		
		when(t2.getX()).thenReturn((short)1);
		when(t2.getY()).thenReturn((short)2);
		when(t.set((short)1, (short)2)).thenReturn(t);
		
		assertSame(t, t.set(t2));
		
		verify(t).set(t2);
		
		verify(t2).getX();
		verify(t2).getY();
		verify(t).set((short)1, (short)2);
		
		verifyNoMoreInteractions(t, t2);
	}
	
	/**
	 * This test ensures, that the function {@link Tup2sRW#set(short)} adopts the
	 * value for each component and returns the current instance.
	 */
	@Test
	void set_ValueTest()
	{
		Tup2sRW t = mock(Tup2sRW.class);
		
		when(t.set((short)1)).thenCallRealMethod();
		
		when(t.set((short)1, (short)1)).thenReturn(t);
		
		assertSame(t, t.set((short)1));
		
		verify(t).set((short)1);

		verify(t).set((short)1, (short)1);
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup2sRW#set(short, short)} adopts
	 * the values and returns the current instance.
	 */
	@Test
	void setTest()
	{
		Tup2sRW t = mock(Tup2sRW.class);
		
		when(t.set((short)1, (short)2)).thenCallRealMethod();
		
		when(t.setX((short)1)).thenReturn(t);
		when(t.setY((short)2)).thenReturn(t);
		
		assertSame(t, t.set((short)1, (short)2));
		
		verify(t).set((short)1, (short)2);

		verify(t).setX((short)1);
		verify(t).setY((short)2);
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup2sRW#set(TupsR)} adopts the
	 * values from the input tuple and returns the current instance.
	 */
	@Test
	void set_TupleTest()
	{
		Tup2sRW t = mock(Tup2sRW.class);
		TupsR t2 = mock(TupsR.class);
		
		when(t.set(t2)).thenCallRealMethod();
		
		when(t2.getArray()).thenReturn(new short[] {(short)1, (short)2});
		when(t.set((short)1, (short)2)).thenReturn(t);

		assertSame(t, t.set(t2));
		
		verify(t).set(t2);
		
		verify(t2).getArray();
		verify(t).set((short)1, (short)2);

		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup2sRW#setArray(short[])} adopts the
	 * values and returns the current instance.
	 */
	@Test
	void setArrayTest()
	{
		Tup2sRW t = mock(Tup2sRW.class);
		
		when(t.setArray(new short[] {(short)1, (short)2})).thenCallRealMethod();
		
		when(t.set((short)1, (short)2)).thenReturn(t);
		
		assertSame(t, t.setArray(new short[] {(short)1, (short)2}));
		
		verify(t).setArray(new short[] {(short)1, (short)2});
		
		verify(t).set((short)1, (short)2);
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup2sRW#setByIndex(int, short)} adopts the
	 * value to the x component if the index is 0 and returns the current instance.
	 */
	@Test
	void setByIndex_XTest()
	{
		Tup2sRW t = mock(Tup2sRW.class);
		
		when(t.setByIndex(0, (short)1)).thenCallRealMethod();
		
		when(t.setX((short)1)).thenReturn(t);
		
		assertSame(t, t.setByIndex(0, (short)1));
		
		verify(t).setByIndex(0, (short)1);
		
		verify(t).setX((short)1);
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup2sRW#setByIndex(int, short)} adopts the
	 * value to the y component if the index is 1 and returns the current instance.
	 */
	@Test
	void setByIndex_YTest()
	{
		Tup2sRW t = mock(Tup2sRW.class);
		
		when(t.setByIndex(1, (short)1)).thenCallRealMethod();
		
		when(t.setY((short)1)).thenReturn(t);
		
		assertSame(t, t.setByIndex(1, (short)1));
		
		verify(t).setByIndex(1, (short)1);
		
		verify(t).setY((short)1);
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup2sRW#setByIndex(int, short)} throws
	 * an {@link IndexOutOfBoundsException} for an index different than 0 or 1.
	 */
	@Test
	void setByIndex_ExceptionTest()
	{
		Tup2sRW t = mock(Tup2sRW.class);
		
		when(t.setByIndex(2, (short)1)).thenCallRealMethod();

		assertThrows(IndexOutOfBoundsException.class, new Executable() {
			public void execute() throws Throwable
			{
				t.setByIndex(2, (short)1);
			}
		});

		verify(t).setByIndex(2, (short)1);

		verifyNoMoreInteractions(t);
	}
}
