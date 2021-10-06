package org.barghos.core.test.api.tuple3;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import org.barghos.core.api.tuple.TupobjR;
import org.barghos.core.api.tuple.TupobjW;
import org.barghos.core.api.tuple3.Tup3objR;
import org.barghos.core.api.tuple3.Tup3objW;

/**
 * This class provides component tests for the interface {@link Tup3objW}.
 * 
 * @author picatrix1899
 */
class Tup3objWTest
{
	/**
	 * This test ensures, that the interface extends the interface {@link TupobjW}.
	 */
	@Test
	void inheritance_TupobjWTest()
	{
		assertTrue(TupobjW.class.isAssignableFrom(Tup3objW.class));
	}
	
	/**
	 * This test ensures, that the function {@link Tup3objW#set(Tup3objR)} adopts the
	 * values from the input tuple and returns the current instance.
	 */
	@Test
	void set_Tuple2Test()
	{
		Tup3objW t = mock(Tup3objW.class);
		Tup3objR t2 = mock(Tup3objR.class);
		
		when(t.set(t2)).thenCallRealMethod();
		
		when(t2.getX()).thenReturn(1);
		when(t2.getY()).thenReturn(1.0);
		when(t2.getZ()).thenReturn("a");
		when(t.set(1, 1.0, "a")).thenReturn(t);
		
		assertSame(t, t.set(t2));
		
		verify(t).set(t2);
		
		verify(t2).getX();
		verify(t2).getY();
		verify(t2).getZ();
		verify(t).set(1, 1.0, "a");
		
		verifyNoMoreInteractions(t, t2);
	}
	
	/**
	 * This test ensures, that the function {@link Tup3objW#set(Object)} adopts the
	 * value for each component and returns the current instance.
	 */
	@Test
	void set_ValueTest()
	{
		Tup3objW t = mock(Tup3objW.class);
		
		when(t.set(1)).thenCallRealMethod();
		
		when(t.set(1, 1, 1)).thenReturn(t);
		
		assertSame(t, t.set(1));
		
		verify(t).set(1);

		verify(t).set(1, 1, 1);
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup3objW#set(Object, Object, Object)} adopts
	 * the values and returns the current instance.
	 */
	@Test
	void setTest()
	{
		Tup3objW t = mock(Tup3objW.class);
		
		when(t.set(1, 1.0, "a")).thenCallRealMethod();
		
		when(t.setX(1)).thenReturn(t);
		when(t.setY(1.0)).thenReturn(t);
		when(t.setZ("a")).thenReturn(t);
		
		assertSame(t, t.set(1, 1.0, "a"));
		
		verify(t).set(1, 1.0, "a");

		verify(t).setX(1);
		verify(t).setY(1.0);
		verify(t).setZ("a");
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup3objW#set(TupobjR)} adopts the
	 * values from the input tuple and returns the current instance.
	 */
	@Test
	void set_TupleTest()
	{
		Tup3objW t = mock(Tup3objW.class);
		TupobjR t2 = mock(TupobjR.class);
		
		when(t.set(t2)).thenCallRealMethod();
		
		when(t2.getArray()).thenReturn(new Object[] {1, 1.0, "a"});
		when(t.set(1, 1.0, "a")).thenReturn(t);

		assertSame(t, t.set(t2));
		
		verify(t).set(t2);
		
		verify(t2).getArray();
		verify(t).set(1, 1.0, "a");

		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup3objW#getDimensions()} always
	 * returns 3 and does not do any calls.
	 */
	@Test
	void getDimensionsTest()
	{
		Tup3objW t = mock(Tup3objW.class);
		
		when(t.getDimensions()).thenCallRealMethod();
		
		assertEquals(3, t.getDimensions());
		
		verify(t).getDimensions();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup3objW#setArray(Object[])} adopts the
	 * values and returns the current instance.
	 */
	@Test
	void setArrayTest()
	{
		Tup3objW t = mock(Tup3objW.class);
		
		when(t.setArray(new Object[] {1, 1.0, "a"})).thenCallRealMethod();
		
		when(t.set(1, 1.0, "a")).thenReturn(t);
		
		assertSame(t, t.setArray(new Object[] {1, 1.0, "a"}));
		
		verify(t).setArray(new Object[] {1, 1.0, "a"});
		
		verify(t).set(1, 1.0, "a");
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup3objW#setByIndex(int, Object)} adopts the
	 * value to the x component if the index is 0 and returns the current instance.
	 */
	@Test
	void setByIndex_XTest()
	{
		Tup3objW t = mock(Tup3objW.class);
		
		when(t.setByIndex(0, 1)).thenCallRealMethod();
		
		when(t.setX(1)).thenReturn(t);
		
		assertSame(t, t.setByIndex(0, 1));
		
		verify(t).setByIndex(0, 1);
		
		verify(t).setX(1);
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup3objW#setByIndex(int, Object)} adopts the
	 * value to the y component if the index is 1 and returns the current instance.
	 */
	@Test
	void setByIndex_YTest()
	{
		Tup3objW t = mock(Tup3objW.class);
		
		when(t.setByIndex(1, 1)).thenCallRealMethod();
		
		when(t.setY(1)).thenReturn(t);
		
		assertSame(t, t.setByIndex(1, 1));
		
		verify(t).setByIndex(1, 1);
		
		verify(t).setY(1);
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup3objW#setByIndex(int, Object)} adopts the
	 * value to the z component if the index is 2 and returns the current instance.
	 */
	@Test
	void setByIndex_ZTest()
	{
		Tup3objW t = mock(Tup3objW.class);
		
		when(t.setByIndex(2, 1)).thenCallRealMethod();
		
		when(t.setZ(1)).thenReturn(t);
		
		assertSame(t, t.setByIndex(2, 1));
		
		verify(t).setByIndex(2, 1);
		
		verify(t).setZ(1);
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup3objW#setByIndex(int, Object)} throws
	 * an {@link IndexOutOfBoundsException} for an index different than 0, 1 or 2.
	 */
	@Test
	void setByIndex_ExceptionTest()
	{
		Tup3objW t = mock(Tup3objW.class);
		
		when(t.setByIndex(3, 1)).thenCallRealMethod();

		assertThrows(IndexOutOfBoundsException.class, new Executable() {
			public void execute() throws Throwable
			{
				t.setByIndex(3, 1);
			}
		});

		verify(t).setByIndex(3, 1);

		verifyNoMoreInteractions(t);
	}
}
