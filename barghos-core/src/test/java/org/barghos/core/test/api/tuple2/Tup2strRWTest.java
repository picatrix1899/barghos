package org.barghos.core.test.api.tuple2;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import org.barghos.core.api.tuple.TupstrR;
import org.barghos.core.api.tuple.TupstrRW;
import org.barghos.core.api.tuple2.Tup2strR;
import org.barghos.core.api.tuple2.Tup2strRW;
import org.barghos.core.api.tuple2.Tup2strW;

/**
 * This class provides comoponent tests for the interface {@link Tup2strRW}.
 * 
 * @author picatrix1899
 */
class Tup2strRWTest
{
	/**
	 * This test ensures, that the interface extends the interface {@link Tup2strR}.
	 */
	@Test
	void inheritance_Tup2strRTest()
	{
		assertTrue(Tup2strR.class.isAssignableFrom(Tup2strRW.class));
	}
	
	/**
	 * This test ensures, that the interface extends the interface {@link Tup2strW}.
	 */
	@Test
	void inheritance_Tup2strWTest()
	{
		assertTrue(Tup2strW.class.isAssignableFrom(Tup2strRW.class));
	}
	
	/**
	 * This test ensures, that the interface extends the interface {@link TupstrRW}.
	 */
	@Test
	void inheritance_TupstrRWTest()
	{
		assertTrue(TupstrRW.class.isAssignableFrom(Tup2strRW.class));
	}
	
	/**
	 * This test ensures, that the default implementation of the function {@link Tup2strRW#getNewInstance(Tup2strR)} calls
	 * the function {@link Tup2strRW#getNewInstance(String, String)} with the correct components.
	 */
	@Test
	void getNewInstance_Tuple2Test()
	{
		Tup2strR original = mock(Tup2strR.class);
		Tup2strRW newInstance = mock(Tup2strRW.class);
		Tup2strRW t = mock(Tup2strRW.class);
		
		when(t.getNewInstance(original)).thenCallRealMethod();
		
		when(original.getX()).thenReturn("a");
		when(original.getY()).thenReturn("b");
		when(t.getNewInstance("a", "b")).thenReturn(newInstance);
		
		assertSame(newInstance, t.getNewInstance(original));
		
		verify(t).getNewInstance(original);
		
		verify(original).getX();
		verify(original).getY();
		verify(t).getNewInstance("a", "b");
		
		verifyNoMoreInteractions(t, original);
	}
	
	/**
	 * This test ensures, that the default implementation of the function {@link Tup2strRW#getNewInstance(String)} calls
	 * the function {@link Tup2strRW#getNewInstance(String, String)} with the correct components.
	 */
	@Test
	void getNewInstance_ValueTest()
	{
		Tup2strRW newInstance = mock(Tup2strRW.class);
		Tup2strRW t = mock(Tup2strRW.class);
		
		when(t.getNewInstance("a")).thenCallRealMethod();

		when(t.getNewInstance("a", "a")).thenReturn(newInstance);
		
		assertSame(newInstance, t.getNewInstance("a"));
		
		verify(t).getNewInstance("a");
		
		verify(t).getNewInstance("a", "a");
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the default implementation of the function {@link Tup2strRW#getNewInstance(TupstrR)} calls
	 * the function {@link Tup2strRW#getNewInstance(String, String)} with the correct components.
	 */
	@Test
	void getNewInstance_TupleTest()
	{
		TupstrR original = mock(TupstrR.class);
		Tup2strRW newInstance = mock(Tup2strRW.class);
		Tup2strRW t = mock(Tup2strRW.class);
		
		when(t.getNewInstance(original)).thenCallRealMethod();
		
		when(original.getArray()).thenReturn(new String[] {"a", "b"});
		when(t.getNewInstance("a", "b")).thenReturn(newInstance);
		
		assertSame(newInstance, t.getNewInstance(original));
		
		verify(t).getNewInstance(original);
		
		verify(original).getArray();
		verify(t).getNewInstance("a", "b");
		
		verifyNoMoreInteractions(t, original);
	}
	
	/**
	 * This test ensures, that the default implementation of the function {@link Tup2strRW#getNewInstanceFromArray(String[])} calls
	 * the function {@link Tup2strRW#getNewInstance(String, String)} with the correct components.
	 */
	@Test
	void getNewInstanceFromArrayTest()
	{
		Tup2strRW newInstance = mock(Tup2strRW.class);
		Tup2strRW t = mock(Tup2strRW.class);
		
		when(t.getNewInstanceFromArray(new String[] {"a", "b"})).thenCallRealMethod();

		when(t.getNewInstance("a", "b")).thenReturn(newInstance);
		
		assertSame(newInstance, t.getNewInstanceFromArray(new String[] {"a", "b"}));
		
		verify(t).getNewInstanceFromArray(new String[] {"a", "b"});
		
		verify(t).getNewInstance("a", "b");
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * this test ensures, that the function {@link Tup2strRW#getDimensions()} always
	 * returns 2 and does not make any calls.
	 */
	@Test
	void getDimensionsTest()
	{
		Tup2strRW t = mock(Tup2strRW.class);
		
		when(t.getDimensions()).thenCallRealMethod();
		
		assertEquals(2, t.getDimensions());
		
		verify(t).getDimensions();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup2strRW#set(Tup2strR)} adopts the
	 * values from the input tuple and returns the current instance.
	 */
	@Test
	void set_Tuple2Test()
	{
		Tup2strRW t = mock(Tup2strRW.class);
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
	 * This test ensures, that the function {@link Tup2strRW#set(String)} adopts the
	 * value for each component and returns the current instance.
	 */
	@Test
	void set_ValueTest()
	{
		Tup2strRW t = mock(Tup2strRW.class);
		
		when(t.set("a")).thenCallRealMethod();
		
		when(t.set("a", "a")).thenReturn(t);
		
		assertSame(t, t.set("a"));
		
		verify(t).set("a");

		verify(t).set("a", "a");
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup2strRW#set(String, String)} adopts
	 * the values and returns the current instance.
	 */
	@Test
	void setTest()
	{
		Tup2strRW t = mock(Tup2strRW.class);
		
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
	 * This test ensures, that the function {@link Tup2strRW#set(TupstrR)} adopts the
	 * values from the input tuple and returns the current instance.
	 */
	@Test
	void set_TupleTest()
	{
		Tup2strRW t = mock(Tup2strRW.class);
		TupstrR t2 = mock(TupstrR.class);
		
		when(t.set(t2)).thenCallRealMethod();
		
		when(t2.getArray()).thenReturn(new String[] {"a", "b"});
		when(t.set("a", "b")).thenReturn(t);

		assertSame(t, t.set(t2));
		
		verify(t).set(t2);
		
		verify(t2).getArray();
		verify(t).set("a", "b");

		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup2strRW#setArray(String[])} adopts the
	 * values and returns the current instance.
	 */
	@Test
	void setArrayTest()
	{
		Tup2strRW t = mock(Tup2strRW.class);
		
		when(t.setArray(new String[] {"a", "b"})).thenCallRealMethod();
		
		when(t.set("a", "b")).thenReturn(t);
		
		assertSame(t, t.setArray(new String[] {"a", "b"}));
		
		verify(t).setArray(new String[] {"a", "b"});
		
		verify(t).set("a", "b");
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup2strRW#setByIndex(int, String)} adopts the
	 * value to the x component if the index is 0 and returns the current instance.
	 */
	@Test
	void setByIndex_XTest()
	{
		Tup2strRW t = mock(Tup2strRW.class);
		
		when(t.setByIndex(0, "a")).thenCallRealMethod();
		
		when(t.setX("a")).thenReturn(t);
		
		assertSame(t, t.setByIndex(0, "a"));
		
		verify(t).setByIndex(0, "a");
		
		verify(t).setX("a");
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup2strRW#setByIndex(int, String)} adopts the
	 * value to the y component if the index is 1 and returns the current instance.
	 */
	@Test
	void setByIndex_YTest()
	{
		Tup2strRW t = mock(Tup2strRW.class);
		
		when(t.setByIndex(1, "a")).thenCallRealMethod();
		
		when(t.setY("a")).thenReturn(t);
		
		assertSame(t, t.setByIndex(1, "a"));
		
		verify(t).setByIndex(1, "a");
		
		verify(t).setY("a");
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup2strRW#setByIndex(int, String)} throws
	 * an {@link IndexOutOfBoundsException} for an index different than 0 or 1.
	 */
	@Test
	void setByIndex_ExceptionTest()
	{
		Tup2strRW t = mock(Tup2strRW.class);
		
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
}
