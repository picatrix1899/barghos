package org.barghos.core.test.api.tuple4;

import static org.barghos.testutils.TestObjectFactory.*;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;
import org.barghos.core.api.tuple.TupbC;
import org.barghos.core.api.tuple.TupbR;
import org.barghos.core.api.tuple4.Tup4bC;
import org.barghos.core.api.tuple4.Tup4bR;

/**
 * This class provides comoponent tests for the interface {@link Tup4bC}.
 * 
 * @author picatrix1899
 */
class Tup4bCTest
{
	/**
	 * This test ensures, that the interface extends the interface {@link Tup4bR}.
	 */
	@Test
	void inheritance_Tup4bRTest()
	{
		assertTrue(Tup4bR.class.isAssignableFrom(Tup4bC.class));
	}
	
	/**
	 * This test ensures, that the interface extends the interface {@link TupbC}.
	 */
	@Test
	void inheritance_TupbCTest()
	{
		assertTrue(TupbC.class.isAssignableFrom(Tup4bC.class));
	}
	
	/**
	 * This test ensures, that the function {@link Tup4bC#set(Tup4bR)} adopts the
	 * values from the input tuple and returns the current instance.
	 */
	@Test
	void set_Tuple2Test()
	{
		Tup4bC t = mock(Tup4bC.class);
		Tup4bR t2 = mock(Tup4bR.class);
		
		when(t.set(t2)).thenCallRealMethod();
		
		when(t2.getX()).thenReturn(b(1));
		when(t2.getY()).thenReturn(b(2));
		when(t2.getZ()).thenReturn(b(3));
		when(t2.getW()).thenReturn(b(4));
		when(t.set(b(1), b(2), b(3), b(4))).thenReturn(t);
		
		assertSame(t, t.set(t2));
		
		verify(t).set(t2);
		
		verify(t2).getX();
		verify(t2).getY();
		verify(t2).getZ();
		verify(t2).getW();
		verify(t).set(b(1), b(2), b(3), b(4));
		
		verifyNoMoreInteractions(t, t2);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4bC#set(byte)} adopts the
	 * value for each component and returns the current instance.
	 */
	@Test
	void set_ValueTest()
	{
		Tup4bC t = mock(Tup4bC.class);
		
		when(t.set(b(1))).thenCallRealMethod();
		
		when(t.set(b(1), b(1), b(1), b(1))).thenReturn(t);
		
		assertSame(t, t.set(b(1)));
		
		verify(t).set(b(1));

		verify(t).set(b(1), b(1), b(1), b(1));
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4bC#set(byte, byte, byte, byte)} adopts
	 * the values and returns the current instance.
	 */
	@Test
	void setTest()
	{
		Tup4bC t = mock(Tup4bC.class);
		
		when(t.set(b(1), b(2), b(3), b(4))).thenCallRealMethod();
		
		when(t.setX(b(1))).thenReturn(t);
		when(t.setY(b(2))).thenReturn(t);
		when(t.setZ(b(3))).thenReturn(t);
		when(t.setW(b(4))).thenReturn(t);
		
		assertSame(t, t.set(b(1), b(2), b(3), b(4)));
		
		verify(t).set(b(1), b(2), b(3), b(4));

		verify(t).setX(b(1));
		verify(t).setY(b(2));
		verify(t).setZ(b(3));
		verify(t).setW(b(4));
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4bC#set(TupbR)} adopts the
	 * values from the input tuple and returns the current instance.
	 */
	@Test
	void set_TupleTest()
	{
		Tup4bC t = mock(Tup4bC.class);
		TupbR t2 = mock(TupbR.class);
		
		when(t.set(t2)).thenCallRealMethod();
		
		when(t2.toArray()).thenReturn(bArray(1, 2, 3, 4));
		when(t.setArray(bArray(1, 2, 3, 4))).thenReturn(t);

		assertSame(t, t.set(t2));
		
		verify(t).set(t2);
		
		verify(t2).toArray();
		verify(t).setArray(bArray(1, 2, 3, 4));

		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4bC#setArray(byte[])} adopts the
	 * values and returns the current instance.
	 */
	@Test
	void setArrayTest()
	{
		Tup4bC t = mock(Tup4bC.class);
		
		when(t.setArray(bArray(1, 2, 3, 4))).thenCallRealMethod();
		
		when(t.set(b(1), b(2), b(3), b(4))).thenReturn(t);
		
		assertSame(t, t.setArray(bArray(1, 2, 3, 4)));
		
		verify(t).setArray(bArray(1, 2, 3, 4));
		
		verify(t).set(b(1), b(2), b(3), b(4));
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4bC#setByIndex(int, byte)} adopts the
	 * value to the x component if the index is 0 and returns the current instance.
	 */
	@Test
	void setByIndex_XTest()
	{
		Tup4bC t = mock(Tup4bC.class);
		
		when(t.setByIndex(0, b(1))).thenCallRealMethod();
		
		when(t.setX(b(1))).thenReturn(t);
		
		assertSame(t, t.setByIndex(0, b(1)));
		
		verify(t).setByIndex(0, b(1));
		
		verify(t).setX(b(1));
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4bC#setByIndex(int, byte)} adopts the
	 * value to the y component if the index is 1 and returns the current instance.
	 */
	@Test
	void setByIndex_YTest()
	{
		Tup4bC t = mock(Tup4bC.class);
		
		when(t.setByIndex(1, b(1))).thenCallRealMethod();
		
		when(t.setY(b(1))).thenReturn(t);
		
		assertSame(t, t.setByIndex(1, b(1)));
		
		verify(t).setByIndex(1, b(1));
		
		verify(t).setY(b(1));
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4bC#setByIndex(int, byte)} adopts the
	 * value to the z component if the index is 2 and returns the current instance.
	 */
	@Test
	void setByIndex_ZTest()
	{
		Tup4bC t = mock(Tup4bC.class);
		
		when(t.setByIndex(2, b(1))).thenCallRealMethod();
		
		when(t.setZ(b(1))).thenReturn(t);
		
		assertSame(t, t.setByIndex(2, b(1)));
		
		verify(t).setByIndex(2, b(1));
		
		verify(t).setZ(b(1));
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4bC#setByIndex(int, byte)} adopts the
	 * value to the w component if the index is 3 and returns the current instance.
	 */
	@Test
	void setByIndex_WTest()
	{
		Tup4bC t = mock(Tup4bC.class);
		
		when(t.setByIndex(3, b(1))).thenCallRealMethod();
		
		when(t.setW(b(1))).thenReturn(t);
		
		assertSame(t, t.setByIndex(3, b(1)));
		
		verify(t).setByIndex(3, b(1));
		
		verify(t).setW(b(1));
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4bC#setByIndex(int, byte)} throws
	 * an {@link IndexOutOfBoundsException} for an index different than 0, 1, 2 or 3.
	 */
	@Test
	void setByIndex_ExceptionTest()
	{
		Tup4bC t = mock(Tup4bC.class);
		
		when(t.setByIndex(4, b(1))).thenCallRealMethod();

		assertThrows(IndexOutOfBoundsException.class, new Executable() {
			public void execute() throws Throwable
			{
				t.setByIndex(4, b(1));
			}
		});

		verify(t).setByIndex(4, b(1));

		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4bC#shallowClone()} calls
	 * by default the standard {@link Tup4bC#clone()}-function.
	 */
	@Test
	void shallowCloneTest()
	{
		Tup4bC t = mock(Tup4bC.class);
		Tup4bC res = mock(Tup4bC.class);
		
		when(t.shallowClone()).thenCallRealMethod();
		when(t.clone()).thenReturn(res);
		
		assertSame(res, t.shallowClone());
		
		verify(t).shallowClone();
		verify(t).clone();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4bC#deepClone()} calls
	 * by default the standard {@link Tup4bC#clone()}-function.
	 */
	@Test
	void deepCloneTest()
	{
		Tup4bC t = mock(Tup4bC.class);
		Tup4bC res = mock(Tup4bC.class);

		when(t.deepClone()).thenCallRealMethod();
		when(t.clone()).thenReturn(res);
		
		assertSame(res, t.deepClone());
		
		verify(t).deepClone();
		verify(t).clone();
		
		verifyNoMoreInteractions(t);
	}
}
