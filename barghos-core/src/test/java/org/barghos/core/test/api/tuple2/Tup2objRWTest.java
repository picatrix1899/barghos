package org.barghos.core.test.api.tuple2;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import org.barghos.core.api.tuple.TupobjR;
import org.barghos.core.api.tuple.TupobjRW;
import org.barghos.core.api.tuple2.Tup2objR;
import org.barghos.core.api.tuple2.Tup2objRW;
import org.barghos.core.api.tuple2.Tup2objW;

/**
 * This class provides comoponent tests for the interface {@link Tup2objRW}.
 * 
 * @author picatrix1899
 */
class Tup2objRWTest
{
	/**
	 * This test ensures, that the interface extends the interface {@link Tup2objR}.
	 */
	@Test
	void inheritance_Tup2objRTest()
	{
		assertTrue(Tup2objR.class.isAssignableFrom(Tup2objRW.class));
	}
	
	/**
	 * This test ensures, that the interface extends the interface {@link Tup2objW}.
	 */
	@Test
	void inheritance_Tup2objWTest()
	{
		assertTrue(Tup2objW.class.isAssignableFrom(Tup2objRW.class));
	}
	
	/**
	 * This test ensures, that the interface extends the interface {@link TupobjRW}.
	 */
	@Test
	void inheritance_TupobjRWTest()
	{
		assertTrue(TupobjRW.class.isAssignableFrom(Tup2objRW.class));
	}
	
	/**
	 * This test ensures, that the default implementation of the function {@link Tup2objRW#getNewInstance(Tup2objR)} calls
	 * the function {@link Tup2objRW#getNewInstance(Object, Object)} with the correct components.
	 */
	@Test
	void getNewInstance_Tuple2Test()
	{
		Tup2objR original = mock(Tup2objR.class);
		Tup2objRW newInstance = mock(Tup2objRW.class);
		Tup2objRW t = mock(Tup2objRW.class);
		
		when(t.getNewInstance(original)).thenCallRealMethod();
		
		when(original.getX()).thenReturn(1);
		when(original.getY()).thenReturn(1.0);
		when(t.getNewInstance(1, 1.0)).thenReturn(newInstance);
		
		assertSame(newInstance, t.getNewInstance(original));
		
		verify(t).getNewInstance(original);
		
		verify(original).getX();
		verify(original).getY();
		verify(t).getNewInstance(1, 1.0);
		
		verifyNoMoreInteractions(t, original);
	}
	
	/**
	 * This test ensures, that the default implementation of the function {@link Tup2objRW#getNewInstance(Object)} calls
	 * the function {@link Tup2objRW#getNewInstance(Object, Object)} with the correct components.
	 */
	@Test
	void getNewInstance_ValueTest()
	{
		Tup2objRW newInstance = mock(Tup2objRW.class);
		Tup2objRW t = mock(Tup2objRW.class);
		
		when(t.getNewInstance(1.0)).thenCallRealMethod();

		when(t.getNewInstance(1.0, 1.0)).thenReturn(newInstance);
		
		assertSame(newInstance, t.getNewInstance(1.0));
		
		verify(t).getNewInstance(1.0);
		
		verify(t).getNewInstance(1.0, 1.0);
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the default implementation of the function {@link Tup2objRW#getNewInstance(TupobjR)} calls
	 * the function {@link Tup2objRW#getNewInstance(Object, Object)} with the correct components.
	 */
	@Test
	void getNewInstance_TupleTest()
	{
		TupobjR original = mock(TupobjR.class);
		Tup2objRW newInstance = mock(Tup2objRW.class);
		Tup2objRW t = mock(Tup2objRW.class);
		
		when(t.getNewInstance(original)).thenCallRealMethod();
		
		when(original.getArray()).thenReturn(new Object[] {1, 1.0});
		when(t.getNewInstance(1, 1.0)).thenReturn(newInstance);
		
		assertSame(newInstance, t.getNewInstance(original));
		
		verify(t).getNewInstance(original);
		
		verify(original).getArray();
		verify(t).getNewInstance(1, 1.0);
		
		verifyNoMoreInteractions(t, original);
	}
	
	/**
	 * This test ensures, that the default implementation of the function {@link Tup2objRW#getNewInstanceFromArray(Object[])} calls
	 * the function {@link Tup2objRW#getNewInstance(Object, Object)} with the correct components.
	 */
	@Test
	void getNewInstanceFromArrayTest()
	{
		Tup2objRW newInstance = mock(Tup2objRW.class);
		Tup2objRW t = mock(Tup2objRW.class);
		
		when(t.getNewInstanceFromArray(new Object[] {1, 1.0})).thenCallRealMethod();

		when(t.getNewInstance(1, 1.0)).thenReturn(newInstance);
		
		assertSame(newInstance, t.getNewInstanceFromArray(new Object[] {1, 1.0}));
		
		verify(t).getNewInstanceFromArray(new Object[] {1, 1.0});
		
		verify(t).getNewInstance(1, 1.0);
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * this test ensures, that the function {@link Tup2objRW#getDimensions()} always
	 * returns 2 and does not make any calls.
	 */
	@Test
	void getDimensionsTest()
	{
		Tup2objRW t = mock(Tup2objRW.class);
		
		when(t.getDimensions()).thenCallRealMethod();
		
		assertEquals(2, t.getDimensions());
		
		verify(t).getDimensions();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup2objRW#set(Tup2objR)} adopts the
	 * values from the input tuple and returns the current instance.
	 */
	@Test
	void set_Tuple2Test()
	{
		Tup2objRW t = mock(Tup2objRW.class);
		Tup2objR t2 = mock(Tup2objR.class);
		
		when(t.set(t2)).thenCallRealMethod();
		
		when(t2.getX()).thenReturn(1);
		when(t2.getY()).thenReturn(1.0);
		when(t.set(1, 1.0)).thenReturn(t);
		
		assertSame(t, t.set(t2));
		
		verify(t).set(t2);
		
		verify(t2).getX();
		verify(t2).getY();
		verify(t).set(1, 1.0);
		
		verifyNoMoreInteractions(t, t2);
	}
	
	/**
	 * This test ensures, that the function {@link Tup2objRW#set(Object)} adopts the
	 * value for each component and returns the current instance.
	 */
	@Test
	void set_ValueTest()
	{
		Tup2objRW t = mock(Tup2objRW.class);
		
		when(t.set(1.0)).thenCallRealMethod();
		
		when(t.set(1.0, 1.0)).thenReturn(t);
		
		assertSame(t, t.set(1.0));
		
		verify(t).set(1.0);

		verify(t).set(1.0, 1.0);
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup2objRW#set(Object, Object)} adopts
	 * the values and returns the current instance.
	 */
	@Test
	void setTest()
	{
		Tup2objRW t = mock(Tup2objRW.class);
		
		when(t.set(1, 1.0)).thenCallRealMethod();
		
		when(t.setX(1)).thenReturn(t);
		when(t.setY(1.0)).thenReturn(t);
		
		assertSame(t, t.set(1, 1.0));
		
		verify(t).set(1, 1.0);

		verify(t).setX(1);
		verify(t).setY(1.0);
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup2objRW#set(TupobjR)} adopts the
	 * values from the input tuple and returns the current instance.
	 */
	@Test
	void set_TupleTest()
	{
		Tup2objRW t = mock(Tup2objRW.class);
		TupobjR t2 = mock(TupobjR.class);
		
		when(t.set(t2)).thenCallRealMethod();
		
		when(t2.getArray()).thenReturn(new Object[] {1, 1.0});
		when(t.set(1, 1.0)).thenReturn(t);

		assertSame(t, t.set(t2));
		
		verify(t).set(t2);
		
		verify(t2).getArray();
		verify(t).set(1, 1.0);

		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup2objRW#setArray(Object[])} adopts the
	 * values and returns the current instance.
	 */
	@Test
	void setArrayTest()
	{
		Tup2objRW t = mock(Tup2objRW.class);
		
		when(t.setArray(new Object[] {1, 1.0})).thenCallRealMethod();
		
		when(t.set(1, 1.0)).thenReturn(t);
		
		assertSame(t, t.setArray(new Object[] {1, 1.0}));
		
		verify(t).setArray(new Object[] {1, 1.0});
		
		verify(t).set(1, 1.0);
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup2objRW#setByIndex(int, Object)} adopts the
	 * value to the x component if the index is 0 and returns the current instance.
	 */
	@Test
	void setByIndex_XTest()
	{
		Tup2objRW t = mock(Tup2objRW.class);
		
		when(t.setByIndex(0, 1)).thenCallRealMethod();
		
		when(t.setX(1)).thenReturn(t);
		
		assertSame(t, t.setByIndex(0, 1));
		
		verify(t).setByIndex(0, 1);
		
		verify(t).setX(1);
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup2objRW#setByIndex(int, Object)} adopts the
	 * value to the y component if the index is 1 and returns the current instance.
	 */
	@Test
	void setByIndex_YTest()
	{
		Tup2objRW t = mock(Tup2objRW.class);
		
		when(t.setByIndex(1, 1)).thenCallRealMethod();
		
		when(t.setY(1)).thenReturn(t);
		
		assertSame(t, t.setByIndex(1, 1));
		
		verify(t).setByIndex(1, 1);
		
		verify(t).setY(1);
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup2objRW#setByIndex(int, Object)} throws
	 * an {@link IndexOutOfBoundsException} for an index different than 0 or 1.
	 */
	@Test
	void setByIndex_ExceptionTest()
	{
		Tup2objRW t = mock(Tup2objRW.class);
		
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
