package org.barghos.core.test.api.tuple3;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import static org.barghos.core.api.testing.TestObjectFactory.*;

import org.barghos.core.api.tuple.TupbC;
import org.barghos.core.api.tuple.TupbR;
import org.barghos.core.api.tuple3.Tup3bC;
import org.barghos.core.api.tuple3.Tup3bR;

/**
 * This class provides comoponent tests for the interface {@link Tup3bC}.
 * 
 * @author picatrix1899
 */
class Tup3bCTest
{
	/**
	 * This test ensures, that the interface extends the interface {@link Tup3bR}.
	 */
	@Test
	void inheritance_Tup3bRTest()
	{
		assertTrue(Tup3bR.class.isAssignableFrom(Tup3bC.class));
	}
	
	/**
	 * This test ensures, that the interface extends the interface {@link Tup3bC}.
	 */
	@Test
	void inheritance_TupbCTest()
	{
		assertTrue(TupbC.class.isAssignableFrom(Tup3bC.class));
	}

	/**
	 * This test ensures, that the function {@link Tup3bC#set(Tup3bR)} adopts the
	 * values from the input tuple and returns the current instance.
	 */
	@Test
	void set_Tuple2Test()
	{
		Tup3bC t = mock(Tup3bC.class);
		Tup3bR t2 = mock(Tup3bR.class);
		
		when(t.set(t2)).thenCallRealMethod();
		
		when(t2.getX()).thenReturn(b(1));
		when(t2.getY()).thenReturn(b(2));
		when(t2.getZ()).thenReturn(b(3));
		when(t.set(b(1), b(2), b(3))).thenReturn(t);
		
		assertSame(t, t.set(t2));
		
		verify(t).set(t2);
		
		verify(t2).getX();
		verify(t2).getY();
		verify(t2).getZ();
		verify(t).set(b(1), b(2), b(3));
		
		verifyNoMoreInteractions(t, t2);
	}
	
	/**
	 * This test ensures, that the function {@link Tup3bC#set(byte)} adopts the
	 * value for each component and returns the current instance.
	 */
	@Test
	void set_ValueTest()
	{
		Tup3bC t = mock(Tup3bC.class);
		
		when(t.set(b(1))).thenCallRealMethod();
		
		when(t.set(b(1), b(1), b(1))).thenReturn(t);
		
		assertSame(t, t.set(b(1)));
		
		verify(t).set(b(1));

		verify(t).set(b(1), b(1), b(1));
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup3bC#set(byte, byte, byte)} adopts
	 * the values and returns the current instance.
	 */
	@Test
	void setTest()
	{
		Tup3bC t = mock(Tup3bC.class);
		
		when(t.set(b(1), b(2), b(3))).thenCallRealMethod();
		
		when(t.setX(b(1))).thenReturn(t);
		when(t.setY(b(2))).thenReturn(t);
		when(t.setZ(b(3))).thenReturn(t);
		
		assertSame(t, t.set(b(1), b(2), b(3)));
		
		verify(t).set(b(1), b(2), b(3));

		verify(t).setX(b(1));
		verify(t).setY(b(2));
		verify(t).setZ(b(3));
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup3bC#set(TupbR)} adopts the
	 * values from the input tuple and returns the current instance.
	 */
	@Test
	void set_TupleTest()
	{
		Tup3bC t = mock(Tup3bC.class);
		TupbR t2 = mock(TupbR.class);
		
		when(t.set(t2)).thenCallRealMethod();
		
		when(t2.toArray()).thenReturn(bArray(1, 2, 3));
		when(t.setArray(bArray(1, 2, 3))).thenReturn(t);

		assertSame(t, t.set(t2));
		
		verify(t).set(t2);
		
		verify(t2).toArray();
		verify(t).setArray(bArray(1, 2, 3));

		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup3bC#setByIndex(int, byte)} adopts the
	 * value to the x component if the index is 0 and returns the current instance.
	 */
	@Test
	void setByIndex_XTest()
	{
		Tup3bC t = mock(Tup3bC.class);
		
		when(t.setByIndex(0, b(1))).thenCallRealMethod();
		
		when(t.setX(b(1))).thenReturn(t);
		
		assertSame(t, t.setByIndex(0, b(1)));
		
		verify(t).setByIndex(0, b(1));
		
		verify(t).setX(b(1));
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup3bC#setByIndex(int, byte)} adopts the
	 * value to the y component if the index is 1 and returns the current instance.
	 */
	@Test
	void setByIndex_YTest()
	{
		Tup3bC t = mock(Tup3bC.class);
		
		when(t.setByIndex(1, b(1))).thenCallRealMethod();
		
		when(t.setY(b(1))).thenReturn(t);
		
		assertSame(t, t.setByIndex(1, b(1)));
		
		verify(t).setByIndex(1, b(1));
		
		verify(t).setY(b(1));
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup3bC#setByIndex(int, byte)} adopts the
	 * value to the z component if the index is 2 and returns the current instance.
	 */
	@Test
	void setByIndex_ZTest()
	{
		Tup3bC t = mock(Tup3bC.class);
		
		when(t.setByIndex(2, b(1))).thenCallRealMethod();
		
		when(t.setZ(b(1))).thenReturn(t);
		
		assertSame(t, t.setByIndex(2, b(1)));
		
		verify(t).setByIndex(2, b(1));
		
		verify(t).setZ(b(1));
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup3bC#setByIndex(int, byte)} throws
	 * an {@link IndexOutOfBoundsException} for an index different than 0, 1 or 2.
	 */
	@Test
	void setByIndex_ExceptionTest()
	{
		Tup3bC t = mock(Tup3bC.class);
		
		when(t.setByIndex(3, b(1))).thenCallRealMethod();

		assertThrows(IndexOutOfBoundsException.class, new Executable() {
			public void execute() throws Throwable
			{
				t.setByIndex(3, b(1));
			}
		});

		verify(t).setByIndex(3, b(1));

		verifyNoMoreInteractions(t);
	}
}
