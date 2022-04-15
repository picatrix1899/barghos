package org.barghos.core.test.api.tuple2;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import org.barghos.core.api.tuple.TupiC;
import org.barghos.core.api.tuple.TupiR;
import org.barghos.core.api.tuple2.Tup2iC;
import org.barghos.core.api.tuple2.Tup2iR;

/**
 * This class provides comoponent tests for the interface {@link Tup2iC}.
 * 
 * @author picatrix1899
 */
class Tup2iCTest
{
	/**
	 * This test ensures, that the interface extends the interface {@link Tup2iR}.
	 */
	@Test
	void inheritance_Tup2iRTest()
	{
		assertTrue(Tup2iR.class.isAssignableFrom(Tup2iC.class));
	}
	
	/**
	 * This test ensures, that the interface extends the interface {@link Tup2iC}.
	 */
	@Test
	void inheritance_TupiCTest()
	{
		assertTrue(TupiC.class.isAssignableFrom(Tup2iC.class));
	}
	
	/**
	 * This test ensures, that the function {@link Tup2iC#set(Tup2iR)} adopts the
	 * values from the input tuple and returns the current instance.
	 */
	@Test
	void set_Tuple2Test()
	{
		Tup2iC t = mock(Tup2iC.class);
		Tup2iR t2 = mock(Tup2iR.class);
		
		when(t.set(t2)).thenCallRealMethod();
		
		when(t2.getX()).thenReturn(1);
		when(t2.getY()).thenReturn(2);
		when(t.set(1, 2)).thenReturn(t);
		
		assertSame(t, t.set(t2));
		
		verify(t).set(t2);
		
		verify(t2).getX();
		verify(t2).getY();
		verify(t).set(1, 2);
		
		verifyNoMoreInteractions(t, t2);
	}
	
	/**
	 * This test ensures, that the function {@link Tup2iC#set(int)} adopts the
	 * value for each component and returns the current instance.
	 */
	@Test
	void set_ValueTest()
	{
		Tup2iC t = mock(Tup2iC.class);
		
		when(t.set(1)).thenCallRealMethod();
		
		when(t.set(1, 1)).thenReturn(t);
		
		assertSame(t, t.set(1));
		
		verify(t).set(1);

		verify(t).set(1, 1);
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup2iC#set(int, int)} adopts
	 * the values and returns the current instance.
	 */
	@Test
	void setTest()
	{
		Tup2iC t = mock(Tup2iC.class);
		
		when(t.set(1, 2)).thenCallRealMethod();
		
		when(t.setX(1)).thenReturn(t);
		when(t.setY(2)).thenReturn(t);
		
		assertSame(t, t.set(1, 2));
		
		verify(t).set(1, 2);

		verify(t).setX(1);
		verify(t).setY(2);
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup2iC#set(TupiR)} adopts the
	 * values from the input tuple and returns the current instance.
	 */
	@Test
	void set_TupleTest()
	{
		Tup2iC t = mock(Tup2iC.class);
		TupiR t2 = mock(TupiR.class);
		
		when(t.set(t2)).thenCallRealMethod();
		
		when(t2.toArray()).thenReturn(new int[] {1, 2});
		when(t.setArray(new int[] {1, 2})).thenReturn(t);

		assertSame(t, t.set(t2));
		
		verify(t).set(t2);
		
		verify(t2).toArray();
		verify(t).setArray(new int[] {1, 2});

		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup2iC#setByIndex(int, int)} adopts the
	 * value to the x component if the index is 0 and returns the current instance.
	 */
	@Test
	void setByIndex_XTest()
	{
		Tup2iC t = mock(Tup2iC.class);
		
		when(t.setByIndex(0, 1)).thenCallRealMethod();
		
		when(t.setX(1)).thenReturn(t);
		
		assertSame(t, t.setByIndex(0, 1));
		
		verify(t).setByIndex(0, 1);
		
		verify(t).setX(1);
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup2iC#setByIndex(int, int)} adopts the
	 * value to the y component if the index is 1 and returns the current instance.
	 */
	@Test
	void setByIndex_YTest()
	{
		Tup2iC t = mock(Tup2iC.class);
		
		when(t.setByIndex(1, 1)).thenCallRealMethod();
		
		when(t.setY(1)).thenReturn(t);
		
		assertSame(t, t.setByIndex(1, 1));
		
		verify(t).setByIndex(1, 1);
		
		verify(t).setY(1);
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup2iC#setByIndex(int, int)} throws
	 * an {@link IndexOutOfBoundsException} for an index different than 0 or 1.
	 */
	@Test
	void setByIndex_ExceptionTest()
	{
		Tup2iC t = mock(Tup2iC.class);
		
		when(t.setByIndex(2, 1)).thenCallRealMethod();

		assertThrows(IndexOutOfBoundsException.class, new Executable() {
			public void execute() throws Throwable
			{
				t.setByIndex(2, 1);
			}
		});

		verify(t).setByIndex(2, 1);

		verifyNoMoreInteractions(t);
	}
}
