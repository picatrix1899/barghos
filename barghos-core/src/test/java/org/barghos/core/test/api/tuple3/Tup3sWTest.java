package org.barghos.core.test.api.tuple3;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import org.barghos.core.api.tuple.TupsR;
import org.barghos.core.api.tuple.TupsW;
import org.barghos.core.api.tuple3.Tup3sR;
import org.barghos.core.api.tuple3.Tup3sW;

/**
 * This class provides component tests for the interface {@link Tup3sW}.
 * 
 * @author picatrix1899
 */
class Tup3sWTest
{
	/**
	 * This test ensures, that the interface extends the interface {@link TupsW}.
	 */
	@Test
	void inheritance_TupsWTest()
	{
		assertTrue(TupsW.class.isAssignableFrom(Tup3sW.class));
	}
	
	/**
	 * This test ensures, that the function {@link Tup3sW#set(Tup3sR)} adopts the
	 * values from the input tuple and returns the current instance.
	 */
	@Test
	void set_Tuple2Test()
	{
		Tup3sW t = mock(Tup3sW.class);
		Tup3sR t2 = mock(Tup3sR.class);
		
		when(t.set(t2)).thenCallRealMethod();
		
		when(t2.getX()).thenReturn((short)1);
		when(t2.getY()).thenReturn((short)2);
		when(t2.getZ()).thenReturn((short)3);
		when(t.set((short)1, (short)2, (short)3)).thenReturn(t);
		
		assertSame(t, t.set(t2));
		
		verify(t).set(t2);
		
		verify(t2).getX();
		verify(t2).getY();
		verify(t2).getZ();
		verify(t).set((short)1, (short)2, (short)3);
		
		verifyNoMoreInteractions(t, t2);
	}
	
	/**
	 * This test ensures, that the function {@link Tup3sW#set(short)} adopts the
	 * value for each component and returns the current instance.
	 */
	@Test
	void set_ValueTest()
	{
		Tup3sW t = mock(Tup3sW.class);
		
		when(t.set((short)1)).thenCallRealMethod();
		
		when(t.set((short)1, (short)1, (short)1)).thenReturn(t);
		
		assertSame(t, t.set((short)1));
		
		verify(t).set((short)1);

		verify(t).set((short)1, (short)1, (short)1);
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup3sW#set(short, short, short)} adopts
	 * the values and returns the current instance.
	 */
	@Test
	void setTest()
	{
		Tup3sW t = mock(Tup3sW.class);
		
		when(t.set((short)1, (short)2, (short)3)).thenCallRealMethod();
		
		when(t.setX((short)1)).thenReturn(t);
		when(t.setY((short)2)).thenReturn(t);
		when(t.setZ((short)3)).thenReturn(t);
		
		assertSame(t, t.set((short)1, (short)2, (short)3));
		
		verify(t).set((short)1, (short)2, (short)3);

		verify(t).setX((short)1);
		verify(t).setY((short)2);
		verify(t).setZ((short)3);
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup3sW#set(TupsR)} adopts the
	 * values from the input tuple and returns the current instance.
	 */
	@Test
	void set_TupleTest()
	{
		Tup3sW t = mock(Tup3sW.class);
		TupsR t2 = mock(TupsR.class);
		
		when(t.set(t2)).thenCallRealMethod();
		
		when(t2.getArray()).thenReturn(new short[] {(short)1, (short)2, (short)3});
		when(t.set((short)1, (short)2, (short)3)).thenReturn(t);

		assertSame(t, t.set(t2));
		
		verify(t).set(t2);
		
		verify(t2).getArray();
		verify(t).set((short)1, (short)2, (short)3);

		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup3sW#getDimensions()} always
	 * returns 3 and does not do any calls.
	 */
	@Test
	void getDimensionsTest()
	{
		Tup3sW t = mock(Tup3sW.class);
		
		when(t.getDimensions()).thenCallRealMethod();
		
		assertEquals(3, t.getDimensions());
		
		verify(t).getDimensions();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup3sW#setArray(short[])} adopts the
	 * values and returns the current instance.
	 */
	@Test
	void setArrayTest()
	{
		Tup3sW t = mock(Tup3sW.class);
		
		when(t.setArray(new short[] {(short)1, (short)2, (short)3})).thenCallRealMethod();
		
		when(t.set((short)1, (short)2, (short)3)).thenReturn(t);
		
		assertSame(t, t.setArray(new short[] {(short)1, (short)2, (short)3}));
		
		verify(t).setArray(new short[] {(short)1, (short)2, (short)3});
		
		verify(t).set((short)1, (short)2, (short)3);
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup3sW#setByIndex(int, short)} adopts the
	 * value to the x component if the index is 0 and returns the current instance.
	 */
	@Test
	void setByIndex_XTest()
	{
		Tup3sW t = mock(Tup3sW.class);
		
		when(t.setByIndex(0, (short)1)).thenCallRealMethod();
		
		when(t.setX((short)1)).thenReturn(t);
		
		assertSame(t, t.setByIndex(0, (short)1));
		
		verify(t).setByIndex(0, (short)1);
		
		verify(t).setX((short)1);
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup3sW#setByIndex(int, short)} adopts the
	 * value to the y component if the index is 1 and returns the current instance.
	 */
	@Test
	void setByIndex_YTest()
	{
		Tup3sW t = mock(Tup3sW.class);
		
		when(t.setByIndex(1, (short)1)).thenCallRealMethod();
		
		when(t.setY((short)1)).thenReturn(t);
		
		assertSame(t, t.setByIndex(1, (short)1));
		
		verify(t).setByIndex(1, (short)1);
		
		verify(t).setY((short)1);
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup3sW#setByIndex(int, short)} adopts the
	 * value to the z component if the index is 2 and returns the current instance.
	 */
	@Test
	void setByIndex_ZTest()
	{
		Tup3sW t = mock(Tup3sW.class);
		
		when(t.setByIndex(2, (short)1)).thenCallRealMethod();
		
		when(t.setZ((short)1)).thenReturn(t);
		
		assertSame(t, t.setByIndex(2, (short)1));
		
		verify(t).setByIndex(2, (short)1);
		
		verify(t).setZ((short)1);
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup3sW#setByIndex(int, short)} throws
	 * an {@link IndexOutOfBoundsException} for an index different than 0, 1 or 2.
	 */
	@Test
	void setByIndex_ExceptionTest()
	{
		Tup3sW t = mock(Tup3sW.class);
		
		when(t.setByIndex(3, (short)1)).thenCallRealMethod();

		assertThrows(IndexOutOfBoundsException.class, new Executable() {
			public void execute() throws Throwable
			{
				t.setByIndex(3, (short)1);
			}
		});

		verify(t).setByIndex(3, (short)1);

		verifyNoMoreInteractions(t);
	}
}
