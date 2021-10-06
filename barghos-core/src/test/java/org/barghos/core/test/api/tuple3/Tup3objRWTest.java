package org.barghos.core.test.api.tuple3;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import org.barghos.core.api.tuple.TupobjR;
import org.barghos.core.api.tuple.TupobjRW;
import org.barghos.core.api.tuple3.Tup3objR;
import org.barghos.core.api.tuple3.Tup3objRW;
import org.barghos.core.api.tuple3.Tup3objW;

/**
 * This class provides comoponent tests for the interface {@link Tup3objRW}.
 * 
 * @author picatrix1899
 */
class Tup3objRWTest
{
	/**
	 * This test ensures, that the interface extends the interface {@link Tup3objR}.
	 */
	@Test
	void inheritance_Tup3objRTest()
	{
		assertTrue(Tup3objR.class.isAssignableFrom(Tup3objRW.class));
	}
	
	/**
	 * This test ensures, that the interface extends the interface {@link Tup3objW}.
	 */
	@Test
	void inheritance_Tup3objWTest()
	{
		assertTrue(Tup3objW.class.isAssignableFrom(Tup3objRW.class));
	}
	
	/**
	 * This test ensures, that the interface extends the interface {@link TupobjRW}.
	 */
	@Test
	void inheritance_TupobjRWTest()
	{
		assertTrue(TupobjRW.class.isAssignableFrom(Tup3objRW.class));
	}
	
	/**
	 * This test ensures, that the default implementation of the function {@link Tup3objRW#getNewInstance(Tup3objR)} calls
	 * the function {@link Tup3objRW#getNewInstance(Object, Object, Object)} with the correct components.
	 */
	@Test
	void getNewInstance_Tuple2Test()
	{
		Tup3objR original = mock(Tup3objR.class);
		Tup3objRW newInstance = mock(Tup3objRW.class);
		Tup3objRW t = mock(Tup3objRW.class);
		
		when(t.getNewInstance(original)).thenCallRealMethod();
		
		when(original.getX()).thenReturn(1);
		when(original.getY()).thenReturn(1.0);
		when(original.getZ()).thenReturn("a");
		when(t.getNewInstance(1, 1.0, "a")).thenReturn(newInstance);
		
		assertSame(newInstance, t.getNewInstance(original));
		
		verify(t).getNewInstance(original);
		
		verify(original).getX();
		verify(original).getY();
		verify(original).getZ();
		verify(t).getNewInstance(1, 1.0, "a");
		
		verifyNoMoreInteractions(t, original);
	}
	
	/**
	 * This test ensures, that the default implementation of the function {@link Tup3objRW#getNewInstance(Object)} calls
	 * the function {@link Tup3objRW#getNewInstance(Object, Object, Object)} with the correct components.
	 */
	@Test
	void getNewInstance_ValueTest()
	{
		Tup3objRW newInstance = mock(Tup3objRW.class);
		Tup3objRW t = mock(Tup3objRW.class);
		
		when(t.getNewInstance(1.0)).thenCallRealMethod();

		when(t.getNewInstance(1.0, 1.0, 1.0)).thenReturn(newInstance);
		
		assertSame(newInstance, t.getNewInstance(1.0));
		
		verify(t).getNewInstance(1.0);
		
		verify(t).getNewInstance(1.0, 1.0, 1.0);
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the default implementation of the function {@link Tup3objRW#getNewInstance(TupobjR)} calls
	 * the function {@link Tup3objRW#getNewInstance(Object, Object, Object)} with the correct components.
	 */
	@Test
	void getNewInstance_TupleTest()
	{
		TupobjR original = mock(TupobjR.class);
		Tup3objRW newInstance = mock(Tup3objRW.class);
		Tup3objRW t = mock(Tup3objRW.class);
		
		when(t.getNewInstance(original)).thenCallRealMethod();
		
		when(original.getArray()).thenReturn(new Object[] {1, 1.0, "a"});
		when(t.getNewInstance(1, 1.0, "a")).thenReturn(newInstance);
		
		assertSame(newInstance, t.getNewInstance(original));
		
		verify(t).getNewInstance(original);
		
		verify(original).getArray();
		verify(t).getNewInstance(1, 1.0, "a");
		
		verifyNoMoreInteractions(t, original);
	}
	
	/**
	 * This test ensures, that the default implementation of the function {@link Tup3objRW#getNewInstanceFromArray(Object[])} calls
	 * the function {@link Tup3objRW#getNewInstance(Object, Object, Object)} with the correct components.
	 */
	@Test
	void getNewInstanceFromArrayTest()
	{
		Tup3objRW newInstance = mock(Tup3objRW.class);
		Tup3objRW t = mock(Tup3objRW.class);
		
		when(t.getNewInstanceFromArray(new Object[] {1, 1.0, "a"})).thenCallRealMethod();

		when(t.getNewInstance(1, 1.0, "a")).thenReturn(newInstance);
		
		assertSame(newInstance, t.getNewInstanceFromArray(new Object[] {1, 1.0, "a"}));
		
		verify(t).getNewInstanceFromArray(new Object[] {1, 1.0, "a"});
		
		verify(t).getNewInstance(1, 1.0, "a");
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * this test ensures, that the function {@link Tup3objRW#getDimensions()} always
	 * returns 3 and does not make any calls.
	 */
	@Test
	void getDimensionsTest()
	{
		Tup3objRW t = mock(Tup3objRW.class);
		
		when(t.getDimensions()).thenCallRealMethod();
		
		assertEquals(3, t.getDimensions());
		
		verify(t).getDimensions();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup3objRW#set(Tup3objR)} adopts the
	 * values from the input tuple and returns the current instance.
	 */
	@Test
	void set_Tuple2Test()
	{
		Tup3objRW t = mock(Tup3objRW.class);
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
	 * This test ensures, that the function {@link Tup3objRW#set(Object)} adopts the
	 * value for each component and returns the current instance.
	 */
	@Test
	void set_ValueTest()
	{
		Tup3objRW t = mock(Tup3objRW.class);
		
		when(t.set(1.0)).thenCallRealMethod();
		
		when(t.set(1.0, 1.0, 1.0)).thenReturn(t);
		
		assertSame(t, t.set(1.0));
		
		verify(t).set(1.0);

		verify(t).set(1.0, 1.0, 1.0);
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup3objRW#set(Object, Object, Object)} adopts
	 * the values and returns the current instance.
	 */
	@Test
	void setTest()
	{
		Tup3objRW t = mock(Tup3objRW.class);
		
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
	 * This test ensures, that the function {@link Tup3objRW#set(TupobjR)} adopts the
	 * values from the input tuple and returns the current instance.
	 */
	@Test
	void set_TupleTest()
	{
		Tup3objRW t = mock(Tup3objRW.class);
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
	 * This test ensures, that the function {@link Tup3objRW#setArray(Object[])} adopts the
	 * values and returns the current instance.
	 */
	@Test
	void setArrayTest()
	{
		Tup3objRW t = mock(Tup3objRW.class);
		
		when(t.setArray(new Object[] {1, 1.0, "a"})).thenCallRealMethod();
		
		when(t.set(1, 1.0, "a")).thenReturn(t);
		
		assertSame(t, t.setArray(new Object[] {1, 1.0, "a"}));
		
		verify(t).setArray(new Object[] {1, 1.0, "a"});
		
		verify(t).set(1, 1.0, "a");
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup3objRW#setByIndex(int, Object)} adopts the
	 * value to the x component if the index is 0 and returns the current instance.
	 */
	@Test
	void setByIndex_XTest()
	{
		Tup3objRW t = mock(Tup3objRW.class);
		
		when(t.setByIndex(0, 1)).thenCallRealMethod();
		
		when(t.setX(1)).thenReturn(t);
		
		assertSame(t, t.setByIndex(0, 1));
		
		verify(t).setByIndex(0, 1);
		
		verify(t).setX(1);
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup3objRW#setByIndex(int, Object)} adopts the
	 * value to the y component if the index is 1 and returns the current instance.
	 */
	@Test
	void setByIndex_YTest()
	{
		Tup3objRW t = mock(Tup3objRW.class);
		
		when(t.setByIndex(1, 1)).thenCallRealMethod();
		
		when(t.setY(1)).thenReturn(t);
		
		assertSame(t, t.setByIndex(1, 1));
		
		verify(t).setByIndex(1, 1);
		
		verify(t).setY(1);
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup3objRW#setByIndex(int, Object)} adopts the
	 * value to the z component if the index is 2 and returns the current instance.
	 */
	@Test
	void setByIndex_ZTest()
	{
		Tup3objRW t = mock(Tup3objRW.class);
		
		when(t.setByIndex(2, 1)).thenCallRealMethod();
		
		when(t.setZ(1)).thenReturn(t);
		
		assertSame(t, t.setByIndex(2, 1));
		
		verify(t).setByIndex(2, 1);
		
		verify(t).setZ(1);
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup3objRW#setByIndex(int, Object)} throws
	 * an {@link IndexOutOfBoundsException} for an index different than 0, 1 or 2.
	 */
	@Test
	void setByIndex_ExceptionTest()
	{
		Tup3objRW t = mock(Tup3objRW.class);
		
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
