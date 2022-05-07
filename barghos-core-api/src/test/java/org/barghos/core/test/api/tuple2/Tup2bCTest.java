package org.barghos.core.test.api.tuple2;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import static org.barghos.core.api.testing.TestObjectFactory.*;

import org.barghos.core.api.tuple.TupbC;
import org.barghos.core.api.tuple.TupbR;
import org.barghos.core.api.tuple2.Tup2bC;
import org.barghos.core.api.tuple2.Tup2bR;

/**
 * This class provides comoponent tests for the interface {@link Tup2bC}.
 * 
 * @author picatrix1899
 */
class Tup2bCTest
{
	/**
	 * This test ensures, that the interface extends the interface {@link Tup2bR}.
	 */
	@Test
	void inheritance_Tup2bRTest()
	{
		assertTrue(Tup2bR.class.isAssignableFrom(Tup2bC.class));
	}
	
	/**
	 * This test ensures, that the interface extends the interface {@link TupbC}.
	 */
	@Test
	void inheritance_TupbCTest()
	{
		assertTrue(TupbC.class.isAssignableFrom(Tup2bC.class));
	}
	
	/**
	 * This test ensures, that the function {@link Tup2bC#set(Tup2bR)} adopts the
	 * values from the input tuple and returns the current instance.
	 */
	@Test
	void set_Tuple2Test()
	{
		Tup2bC t = mock(Tup2bC.class);
		Tup2bR t2 = mock(Tup2bR.class);
		
		when(t.set(t2)).thenCallRealMethod();
		
		when(t2.getX()).thenReturn(b(1));
		when(t2.getY()).thenReturn(b(2));
		when(t.set(b(1), b(2))).thenReturn(t);
		
		assertSame(t, t.set(t2));
		
		verify(t).set(t2);
		
		verify(t2).getX();
		verify(t2).getY();
		verify(t).set(b(1), b(2));
		
		verifyNoMoreInteractions(t, t2);
	}
	
	/**
	 * This test ensures, that the function {@link Tup2bC#set(byte)} adopts the
	 * value for each component and returns the current instance.
	 */
	@Test
	void set_ValueTest()
	{
		Tup2bC t = mock(Tup2bC.class);
		
		when(t.set(b(1))).thenCallRealMethod();
		
		when(t.set(b(1), b(1))).thenReturn(t);
		
		assertSame(t, t.set(b(1)));
		
		verify(t).set(b(1));

		verify(t).set(b(1), b(1));
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup2bC#set(byte, byte)} adopts
	 * the values and returns the current instance.
	 */
	@Test
	void setTest()
	{
		Tup2bC t = mock(Tup2bC.class);
		
		when(t.set(b(1), b(2))).thenCallRealMethod();
		
		when(t.setX(b(1))).thenReturn(t);
		when(t.setY(b(2))).thenReturn(t);
		
		assertSame(t, t.set(b(1), b(2)));
		
		verify(t).set(b(1), b(2));

		verify(t).setX(b(1));
		verify(t).setY(b(2));
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup2bC#set(TupbR)} adopts the
	 * values from the input tuple and returns the current instance.
	 */
	@Test
	void set_TupleTest()
	{
		Tup2bC t = mock(Tup2bC.class);
		TupbR t2 = mock(TupbR.class);
		
		when(t.set(t2)).thenCallRealMethod();
		
		when(t2.toArray()).thenReturn(bArray(1, 2));
		when(t.setArray(bArray(1, 2))).thenReturn(t);

		assertSame(t, t.set(t2));
		
		verify(t).set(t2);
		
		verify(t2).toArray();
		verify(t).setArray(bArray(1, 2));

		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup2bC#setByIndex(int, byte)} adopts the
	 * value to the x component if the index is 0 and returns the current instance.
	 */
	@Test
	void setByIndex_XTest()
	{
		Tup2bC t = mock(Tup2bC.class);
		
		when(t.setByIndex(0, b(1))).thenCallRealMethod();
		
		when(t.setX(b(1))).thenReturn(t);
		
		assertSame(t, t.setByIndex(0, b(1)));
		
		verify(t).setByIndex(0, b(1));
		
		verify(t).setX(b(1));
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup2bC#setByIndex(int, byte)} adopts the
	 * value to the y component if the index is 1 and returns the current instance.
	 */
	@Test
	void setByIndex_YTest()
	{
		Tup2bC t = mock(Tup2bC.class);
		
		when(t.setByIndex(1, b(1))).thenCallRealMethod();
		
		when(t.setY(b(1))).thenReturn(t);
		
		assertSame(t, t.setByIndex(1, b(1)));
		
		verify(t).setByIndex(1, b(1));
		
		verify(t).setY(b(1));
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup2bC#setByIndex(int, byte)} throws
	 * an {@link IndexOutOfBoundsException} for an index different than 0 or 1.
	 */
	@Test
	void setByIndex_ExceptionTest()
	{
		Tup2bC t = mock(Tup2bC.class);
		
		when(t.setByIndex(2, b(1))).thenCallRealMethod();

		assertThrows(IndexOutOfBoundsException.class, new Executable() {
			public void execute() throws Throwable
			{
				t.setByIndex(2, b(1));
			}
		});

		verify(t).setByIndex(2, b(1));

		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup2bC#shallowClone()} calls
	 * by default the standard {@link Tup2bC#clone()}-function.
	 */
	@Test
	void shallowCloneTest()
	{
		Tup2bC t = mock(Tup2bC.class);
		Tup2bC res = mock(Tup2bC.class);
		
		when(t.shallowClone()).thenCallRealMethod();
		when(t.clone()).thenReturn(res);
		
		assertSame(res, t.shallowClone());
		
		verify(t).shallowClone();
		verify(t).clone();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup2bC#deepClone()} calls
	 * by default the standard {@link Tup2bC#clone()}-function.
	 */
	@Test
	void deepCloneTest()
	{
		Tup2bC t = mock(Tup2bC.class);
		Tup2bC res = mock(Tup2bC.class);

		when(t.deepClone()).thenCallRealMethod();
		when(t.clone()).thenReturn(res);
		
		assertSame(res, t.deepClone());
		
		verify(t).deepClone();
		verify(t).clone();
		
		verifyNoMoreInteractions(t);
	}
}