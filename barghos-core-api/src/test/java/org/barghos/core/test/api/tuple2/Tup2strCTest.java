package org.barghos.core.test.api.tuple2;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import org.barghos.core.api.tuple.TupstrC;
import org.barghos.core.api.tuple.TupstrR;
import org.barghos.core.api.tuple2.Tup2strC;
import org.barghos.core.api.tuple2.Tup2strR;

/**
 * This class provides comoponent tests for the interface {@link Tup2strC}.
 * 
 * @author picatrix1899
 */
class Tup2strCTest
{
	/**
	 * This test ensures, that the interface extends the interface {@link Tup2strR}.
	 */
	@Test
	void inheritance_Tup2strRTest()
	{
		assertTrue(Tup2strR.class.isAssignableFrom(Tup2strC.class));
	}
	
	/**
	 * This test ensures, that the interface extends the interface {@link TupstrC}.
	 */
	@Test
	void inheritance_TupstrCTest()
	{
		assertTrue(TupstrC.class.isAssignableFrom(Tup2strC.class));
	}
	
	/**
	 * This test ensures, that the function {@link Tup2strC#set(Tup2strR)} adopts the
	 * values from the input tuple and returns the current instance.
	 */
	@Test
	void set_Tuple2Test()
	{
		Tup2strC t = mock(Tup2strC.class);
		Tup2strR t2 = mock(Tup2strR.class);
		
		when(t.set(t2)).thenCallRealMethod();
		
		when(t2.getX()).thenReturn("a");
		when(t2.getY()).thenReturn("b");
		when(t.set("a", "b")).thenReturn(t);
		
		assertSame(t, t.set(t2));
		
		verify(t).set(t2);
		
		verify(t2).getX();
		verify(t2).getY();
		verify(t).set("a", "b");
		
		verifyNoMoreInteractions(t, t2);
	}
	
	/**
	 * This test ensures, that the function {@link Tup2strC#set(String)} adopts the
	 * value for each component and returns the current instance.
	 */
	@Test
	void set_ValueTest()
	{
		Tup2strC t = mock(Tup2strC.class);
		
		when(t.set("a")).thenCallRealMethod();
		
		when(t.set("a", "a")).thenReturn(t);
		
		assertSame(t, t.set("a"));
		
		verify(t).set("a");

		verify(t).set("a", "a");
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup2strC#set(String, String)} adopts
	 * the values and returns the current instance.
	 */
	@Test
	void setTest()
	{
		Tup2strC t = mock(Tup2strC.class);
		
		when(t.set("a", "b")).thenCallRealMethod();
		
		when(t.setX("a")).thenReturn(t);
		when(t.setY("b")).thenReturn(t);
		
		assertSame(t, t.set("a", "b"));
		
		verify(t).set("a", "b");

		verify(t).setX("a");
		verify(t).setY("b");
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup2strC#set(TupstrR)} adopts the
	 * values from the input tuple and returns the current instance.
	 */
	@Test
	void set_TupleTest()
	{
		Tup2strC t = mock(Tup2strC.class);
		TupstrR t2 = mock(TupstrR.class);
		
		when(t.set(t2)).thenCallRealMethod();
		
		when(t2.toArray()).thenReturn(new String[] {"a", "b"});
		when(t.setArray("a", "b")).thenReturn(t);

		assertSame(t, t.set(t2));
		
		verify(t).set(t2);
		
		verify(t2).toArray();
		verify(t).setArray("a", "b");

		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup2strC#setArray(String[])} adopts the
	 * values and returns the current instance.
	 */
	@Test
	void setArrayTest()
	{
		Tup2strC t = mock(Tup2strC.class);
		
		when(t.setArray(new String[] {"a", "b"})).thenCallRealMethod();
		
		when(t.set("a", "b")).thenReturn(t);
		
		assertSame(t, t.setArray(new String[] {"a", "b"}));
		
		verify(t).setArray(new String[] {"a", "b"});
		
		verify(t).set("a", "b");
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup2strC#setByIndex(int, String)} adopts the
	 * value to the x component if the index is 0 and returns the current instance.
	 */
	@Test
	void setByIndex_XTest()
	{
		Tup2strC t = mock(Tup2strC.class);
		
		when(t.setByIndex(0, "a")).thenCallRealMethod();
		
		when(t.setX("a")).thenReturn(t);
		
		assertSame(t, t.setByIndex(0, "a"));
		
		verify(t).setByIndex(0, "a");
		
		verify(t).setX("a");
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup2strC#setByIndex(int, String)} adopts the
	 * value to the y component if the index is 1 and returns the current instance.
	 */
	@Test
	void setByIndex_YTest()
	{
		Tup2strC t = mock(Tup2strC.class);
		
		when(t.setByIndex(1, "a")).thenCallRealMethod();
		
		when(t.setY("a")).thenReturn(t);
		
		assertSame(t, t.setByIndex(1, "a"));
		
		verify(t).setByIndex(1, "a");
		
		verify(t).setY("a");
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup2strC#setByIndex(int, String)} throws
	 * an {@link IndexOutOfBoundsException} for an index different than 0 or 1.
	 */
	@Test
	void setByIndex_ExceptionTest()
	{
		Tup2strC t = mock(Tup2strC.class);
		
		when(t.setByIndex(2, "a")).thenCallRealMethod();

		assertThrows(IndexOutOfBoundsException.class, new Executable() {
			public void execute() throws Throwable
			{
				t.setByIndex(2, "a");
			}
		});

		verify(t).setByIndex(2, "a");

		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup2strC#shallowClone()} calls
	 * by default the standard {@link Tup2strC#clone()}-function.
	 */
	@Test
	void shallowCloneTest()
	{
		Tup2strC t = mock(Tup2strC.class);
		Tup2strC res = mock(Tup2strC.class);
		
		when(t.shallowClone()).thenCallRealMethod();
		when(t.clone()).thenReturn(res);
		
		assertSame(res, t.shallowClone());
		
		verify(t).shallowClone();
		verify(t).clone();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup2strC#deepClone()} calls
	 * by default the standard {@link Tup2strC#clone()}-function.
	 */
	@Test
	void deepCloneTest()
	{
		Tup2strC t = mock(Tup2strC.class);
		Tup2strC res = mock(Tup2strC.class);

		when(t.deepClone()).thenCallRealMethod();
		when(t.clone()).thenReturn(res);
		
		assertSame(res, t.deepClone());
		
		verify(t).deepClone();
		verify(t).clone();
		
		verifyNoMoreInteractions(t);
	}
}
