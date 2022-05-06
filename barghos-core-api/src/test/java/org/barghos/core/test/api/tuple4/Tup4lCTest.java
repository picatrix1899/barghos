package org.barghos.core.test.api.tuple4;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import org.barghos.core.api.tuple.TuplC;
import org.barghos.core.api.tuple.TuplR;
import org.barghos.core.api.tuple4.Tup4lC;
import org.barghos.core.api.tuple4.Tup4lR;

/**
 * This class provides comoponent tests for the interface {@link Tup4lC}.
 * 
 * @author picatrix1899
 */
class Tup4lCTest
{
	/**
	 * This test ensures, that the interface extends the interface {@link Tup4lR}.
	 */
	@Test
	void inheritance_Tup4lRTest()
	{
		assertTrue(Tup4lR.class.isAssignableFrom(Tup4lC.class));
	}
	
	/**
	 * This test ensures, that the interface extends the interface {@link TuplC}.
	 */
	@Test
	void inheritance_TuplCTest()
	{
		assertTrue(TuplC.class.isAssignableFrom(Tup4lC.class));
	}
	
	/**
	 * This test ensures, that the function {@link Tup4lC#set(Tup4lR)} adopts the
	 * values from the input tuple and returns the current instance.
	 */
	@Test
	void set_Tuple2Test()
	{
		Tup4lC t = mock(Tup4lC.class);
		Tup4lR t2 = mock(Tup4lR.class);
		
		when(t.set(t2)).thenCallRealMethod();
		
		when(t2.getX()).thenReturn(1l);
		when(t2.getY()).thenReturn(2l);
		when(t2.getZ()).thenReturn(3l);
		when(t2.getW()).thenReturn(4l);
		when(t.set(1l, 2l, 3l, 4l)).thenReturn(t);
		
		assertSame(t, t.set(t2));
		
		verify(t).set(t2);
		
		verify(t2).getX();
		verify(t2).getY();
		verify(t2).getZ();
		verify(t2).getW();
		verify(t).set(1l, 2l, 3l, 4l);
		
		verifyNoMoreInteractions(t, t2);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4lC#set(long)} adopts the
	 * value for each component and returns the current instance.
	 */
	@Test
	void set_ValueTest()
	{
		Tup4lC t = mock(Tup4lC.class);
		
		when(t.set(1l)).thenCallRealMethod();
		
		when(t.set(1l, 1l, 1l, 1l)).thenReturn(t);
		
		assertSame(t, t.set(1l));
		
		verify(t).set(1l);

		verify(t).set(1l, 1l, 1l, 1l);
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4lC#set(long, long, long, long)} adopts
	 * the values and returns the current instance.
	 */
	@Test
	void setTest()
	{
		Tup4lC t = mock(Tup4lC.class);
		
		when(t.set(1l, 2l, 3l, 4l)).thenCallRealMethod();
		
		when(t.setX(1l)).thenReturn(t);
		when(t.setY(2l)).thenReturn(t);
		when(t.setZ(3l)).thenReturn(t);
		when(t.setW(4l)).thenReturn(t);
		
		assertSame(t, t.set(1l, 2l, 3l, 4l));
		
		verify(t).set(1l, 2l, 3l, 4l);

		verify(t).setX(1l);
		verify(t).setY(2l);
		verify(t).setZ(3l);
		verify(t).setW(4l);
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4lC#set(TuplR)} adopts the
	 * values from the input tuple and returns the current instance.
	 */
	@Test
	void set_TupleTest()
	{
		Tup4lC t = mock(Tup4lC.class);
		TuplR t2 = mock(TuplR.class);
		
		when(t.set(t2)).thenCallRealMethod();
		
		when(t2.toArray()).thenReturn(new long[] {1l, 2l, 3l, 4l});
		when(t.setArray(new long[] {1l, 2l, 3l, 4l})).thenReturn(t);

		assertSame(t, t.set(t2));
		
		verify(t).set(t2);
		
		verify(t2).toArray();
		verify(t).setArray(new long[] {1l, 2l, 3l, 4l});

		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4lC#setArray(long[])} adopts the
	 * values and returns the current instance.
	 */
	@Test
	void setArrayTest()
	{
		Tup4lC t = mock(Tup4lC.class);
		
		when(t.setArray(new long[] {1l, 2l, 3l, 4l})).thenCallRealMethod();
		
		when(t.set(1l, 2l, 3l, 4l)).thenReturn(t);
		
		assertSame(t, t.setArray(new long[] {1l, 2l, 3l, 4l}));
		
		verify(t).setArray(new long[] {1l, 2l, 3l, 4l});
		
		verify(t).set(1l, 2l, 3l, 4l);
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4lC#setByIndex(int, long)} adopts the
	 * value to the x component if the index is 0 and returns the current instance.
	 */
	@Test
	void setByIndex_XTest()
	{
		Tup4lC t = mock(Tup4lC.class);
		
		when(t.setByIndex(0, 1l)).thenCallRealMethod();
		
		when(t.setX(1l)).thenReturn(t);
		
		assertSame(t, t.setByIndex(0, 1l));
		
		verify(t).setByIndex(0, 1l);
		
		verify(t).setX(1l);
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4lC#setByIndex(int, long)} adopts the
	 * value to the y component if the index is 1 and returns the current instance.
	 */
	@Test
	void setByIndex_YTest()
	{
		Tup4lC t = mock(Tup4lC.class);
		
		when(t.setByIndex(1, 1l)).thenCallRealMethod();
		
		when(t.setY(1l)).thenReturn(t);
		
		assertSame(t, t.setByIndex(1, 1l));
		
		verify(t).setByIndex(1, 1l);
		
		verify(t).setY(1l);
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4lC#setByIndex(int, long)} adopts the
	 * value to the z component if the index is 2 and returns the current instance.
	 */
	@Test
	void setByIndex_ZTest()
	{
		Tup4lC t = mock(Tup4lC.class);
		
		when(t.setByIndex(2, 1l)).thenCallRealMethod();
		
		when(t.setZ(1l)).thenReturn(t);
		
		assertSame(t, t.setByIndex(2, 1l));
		
		verify(t).setByIndex(2, 1l);
		
		verify(t).setZ(1l);
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4lC#setByIndex(int, long)} adopts the
	 * value to the w component if the index is 3 and returns the current instance.
	 */
	@Test
	void setByIndex_WTest()
	{
		Tup4lC t = mock(Tup4lC.class);
		
		when(t.setByIndex(3, 1l)).thenCallRealMethod();
		
		when(t.setW(1l)).thenReturn(t);
		
		assertSame(t, t.setByIndex(3, 1l));
		
		verify(t).setByIndex(3, 1l);
		
		verify(t).setW(1l);
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4lC#setByIndex(int, long)} throws
	 * an {@link IndexOutOfBoundsException} for an index different than 0, 1, 2 or 3.
	 */
	@Test
	void setByIndex_ExceptionTest()
	{
		Tup4lC t = mock(Tup4lC.class);
		
		when(t.setByIndex(4, 1l)).thenCallRealMethod();

		assertThrows(IndexOutOfBoundsException.class, new Executable() {
			public void execute() throws Throwable
			{
				t.setByIndex(4, 1l);
			}
		});

		verify(t).setByIndex(4, 1l);

		verifyNoMoreInteractions(t);
	}
}
