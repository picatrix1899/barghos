package org.barghos.core.test.api.tuple4;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import org.barghos.core.api.tuple.TupobjR;
import org.barghos.core.api.tuple.TupobjRW;
import org.barghos.core.api.tuple4.Tup4objR;
import org.barghos.core.api.tuple4.Tup4objRW;
import org.barghos.core.api.tuple4.Tup4objW;

/**
 * This class provides comoponent tests for the interface {@link Tup4objRW}.
 * 
 * @author picatrix1899
 */
class Tup4objRWTest
{
	/**
	 * This test ensures, that the interface extends the interface {@link Tup4objR}.
	 */
	@Test
	void inheritance_Tup4objRTest()
	{
		assertTrue(Tup4objR.class.isAssignableFrom(Tup4objRW.class));
	}
	
	/**
	 * This test ensures, that the interface extends the interface {@link Tup4objW}.
	 */
	@Test
	void inheritance_Tup4objWTest()
	{
		assertTrue(Tup4objW.class.isAssignableFrom(Tup4objRW.class));
	}
	
	/**
	 * This test ensures, that the interface extends the interface {@link TupobjRW}.
	 */
	@Test
	void inheritance_TupobjRWTest()
	{
		assertTrue(TupobjRW.class.isAssignableFrom(Tup4objRW.class));
	}
	
	/**
	 * This test ensures, that the default implementation of the function {@link Tup4objRW#getNewInstance(Tup4objR)} calls
	 * the function {@link Tup4objRW#getNewInstance(Object, Object, Object, Object)} with the correct components.
	 */
	@Test
	void getNewInstance_Tuple2Test()
	{
		Tup4objR original = mock(Tup4objR.class);
		Tup4objRW newInstance = mock(Tup4objRW.class);
		Tup4objRW t = mock(Tup4objRW.class);
		
		when(t.getNewInstance(original)).thenCallRealMethod();
		
		when(original.getX()).thenReturn(1);
		when(original.getY()).thenReturn(1.0);
		when(original.getZ()).thenReturn("a");
		when(original.getW()).thenReturn('a');
		when(t.getNewInstance(1, 1.0, "a", 'a')).thenReturn(newInstance);
		
		assertSame(newInstance, t.getNewInstance(original));
		
		verify(t).getNewInstance(original);
		
		verify(original).getX();
		verify(original).getY();
		verify(original).getZ();
		verify(original).getW();
		verify(t).getNewInstance(1, 1.0, "a", 'a');
		
		verifyNoMoreInteractions(t, original);
	}
	
	/**
	 * This test ensures, that the default implementation of the function {@link Tup4objRW#getNewInstance(Object)} calls
	 * the function {@link Tup4objRW#getNewInstance(Object, Object, Object, Object)} with the correct components.
	 */
	@Test
	void getNewInstance_ValueTest()
	{
		Tup4objRW newInstance = mock(Tup4objRW.class);
		Tup4objRW t = mock(Tup4objRW.class);
		
		when(t.getNewInstance(1.0)).thenCallRealMethod();

		when(t.getNewInstance(1.0, 1.0, 1.0, 1.0)).thenReturn(newInstance);
		
		assertSame(newInstance, t.getNewInstance(1.0));
		
		verify(t).getNewInstance(1.0);
		
		verify(t).getNewInstance(1.0, 1.0, 1.0, 1.0);
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the default implementation of the function {@link Tup4objRW#getNewInstance(TupobjR)} calls
	 * the function {@link Tup4objRW#getNewInstance(Object, Object, Object, Object)} with the correct components.
	 */
	@Test
	void getNewInstance_TupleTest()
	{
		TupobjR original = mock(TupobjR.class);
		Tup4objRW newInstance = mock(Tup4objRW.class);
		Tup4objRW t = mock(Tup4objRW.class);
		
		when(t.getNewInstance(original)).thenCallRealMethod();
		
		when(original.getArray()).thenReturn(new Object[] {1, 1.0, "a", 'a'});
		when(t.getNewInstance(1, 1.0, "a", 'a')).thenReturn(newInstance);
		
		assertSame(newInstance, t.getNewInstance(original));
		
		verify(t).getNewInstance(original);
		
		verify(original).getArray();
		verify(t).getNewInstance(1, 1.0, "a", 'a');
		
		verifyNoMoreInteractions(t, original);
	}
	
	/**
	 * This test ensures, that the default implementation of the function {@link Tup4objRW#getNewInstanceFromArray(Object[])} calls
	 * the function {@link Tup4objRW#getNewInstance(Object, Object, Object, Object)} with the correct components.
	 */
	@Test
	void getNewInstanceFromArrayTest()
	{
		Tup4objRW newInstance = mock(Tup4objRW.class);
		Tup4objRW t = mock(Tup4objRW.class);
		
		when(t.getNewInstanceFromArray(new Object[] {1, 1.0, "a", 'a'})).thenCallRealMethod();

		when(t.getNewInstance(1, 1.0, "a", 'a')).thenReturn(newInstance);
		
		assertSame(newInstance, t.getNewInstanceFromArray(new Object[] {1, 1.0, "a", 'a'}));
		
		verify(t).getNewInstanceFromArray(new Object[] {1, 1.0, "a", 'a'});
		
		verify(t).getNewInstance(1, 1.0, "a", 'a');
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * this test ensures, that the function {@link Tup4objRW#getDimensions()} always
	 * returns 4 and does not make any calls.
	 */
	@Test
	void getDimensionsTest()
	{
		Tup4objRW t = mock(Tup4objRW.class);
		
		when(t.getDimensions()).thenCallRealMethod();
		
		assertEquals(4, t.getDimensions());
		
		verify(t).getDimensions();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4objRW#set(Tup4objR)} adopts the
	 * values from the input tuple and returns the current instance.
	 */
	@Test
	void set_Tuple2Test()
	{
		Tup4objRW t = mock(Tup4objRW.class);
		Tup4objR t2 = mock(Tup4objR.class);
		
		when(t.set(t2)).thenCallRealMethod();
		
		when(t2.getX()).thenReturn(1);
		when(t2.getY()).thenReturn(1.0);
		when(t2.getZ()).thenReturn("a");
		when(t2.getW()).thenReturn('a');
		when(t.set(1, 1.0, "a", 'a')).thenReturn(t);
		
		assertSame(t, t.set(t2));
		
		verify(t).set(t2);
		
		verify(t2).getX();
		verify(t2).getY();
		verify(t2).getZ();
		verify(t2).getW();
		verify(t).set(1, 1.0, "a", 'a');
		
		verifyNoMoreInteractions(t, t2);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4objRW#set(Object)} adopts the
	 * value for each component and returns the current instance.
	 */
	@Test
	void set_ValueTest()
	{
		Tup4objRW t = mock(Tup4objRW.class);
		
		when(t.set(1.0)).thenCallRealMethod();
		
		when(t.set(1.0, 1.0, 1.0, 1.0)).thenReturn(t);
		
		assertSame(t, t.set(1.0));
		
		verify(t).set(1.0);

		verify(t).set(1.0, 1.0, 1.0, 1.0);
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4objRW#set(Object, Object, Object, Object)} adopts
	 * the values and returns the current instance.
	 */
	@Test
	void setTest()
	{
		Tup4objRW t = mock(Tup4objRW.class);
		
		when(t.set(1, 1.0, "a", 'a')).thenCallRealMethod();
		
		when(t.setX(1)).thenReturn(t);
		when(t.setY(1.0)).thenReturn(t);
		when(t.setZ("a")).thenReturn(t);
		when(t.setW('a')).thenReturn(t);
		
		assertSame(t, t.set(1, 1.0, "a", 'a'));
		
		verify(t).set(1, 1.0, "a", 'a');

		verify(t).setX(1);
		verify(t).setY(1.0);
		verify(t).setZ("a");
		verify(t).setW('a');
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4objRW#set(TupobjR)} adopts the
	 * values from the input tuple and returns the current instance.
	 */
	@Test
	void set_TupleTest()
	{
		Tup4objRW t = mock(Tup4objRW.class);
		TupobjR t2 = mock(TupobjR.class);
		
		when(t.set(t2)).thenCallRealMethod();
		
		when(t2.getArray()).thenReturn(new Object[] {1, 1.0, "a", 'a'});
		when(t.set(1, 1.0, "a", 'a')).thenReturn(t);

		assertSame(t, t.set(t2));
		
		verify(t).set(t2);
		
		verify(t2).getArray();
		verify(t).set(1, 1.0, "a", 'a');

		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4objRW#setArray(Object[])} adopts the
	 * values and returns the current instance.
	 */
	@Test
	void setArrayTest()
	{
		Tup4objRW t = mock(Tup4objRW.class);
		
		when(t.setArray(new Object[] {1, 1.0, "a", 'a'})).thenCallRealMethod();
		
		when(t.set(1, 1.0, "a", 'a')).thenReturn(t);
		
		assertSame(t, t.setArray(new Object[] {1, 1.0, "a", 'a'}));
		
		verify(t).setArray(new Object[] {1, 1.0, "a", 'a'});
		
		verify(t).set(1, 1.0, "a", 'a');
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4objRW#setByIndex(int, Object)} adopts the
	 * value to the x component if the index is 0 and returns the current instance.
	 */
	@Test
	void setByIndex_XTest()
	{
		Tup4objRW t = mock(Tup4objRW.class);
		
		when(t.setByIndex(0, 1)).thenCallRealMethod();
		
		when(t.setX(1)).thenReturn(t);
		
		assertSame(t, t.setByIndex(0, 1));
		
		verify(t).setByIndex(0, 1);
		
		verify(t).setX(1);
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4objRW#setByIndex(int, Object)} adopts the
	 * value to the y component if the index is 1 and returns the current instance.
	 */
	@Test
	void setByIndex_YTest()
	{
		Tup4objRW t = mock(Tup4objRW.class);
		
		when(t.setByIndex(1, 1)).thenCallRealMethod();
		
		when(t.setY(1)).thenReturn(t);
		
		assertSame(t, t.setByIndex(1, 1));
		
		verify(t).setByIndex(1, 1);
		
		verify(t).setY(1);
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4objRW#setByIndex(int, Object)} adopts the
	 * value to the z component if the index is 2 and returns the current instance.
	 */
	@Test
	void setByIndex_ZTest()
	{
		Tup4objRW t = mock(Tup4objRW.class);
		
		when(t.setByIndex(2, 1)).thenCallRealMethod();
		
		when(t.setZ(1)).thenReturn(t);
		
		assertSame(t, t.setByIndex(2, 1));
		
		verify(t).setByIndex(2, 1);
		
		verify(t).setZ(1);
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4objRW#setByIndex(int, Object)} adopts the
	 * value to the w component if the index is 3 and returns the current instance.
	 */
	@Test
	void setByIndex_WTest()
	{
		Tup4objRW t = mock(Tup4objRW.class);
		
		when(t.setByIndex(3, 1)).thenCallRealMethod();
		
		when(t.setW(1)).thenReturn(t);
		
		assertSame(t, t.setByIndex(3, 1));
		
		verify(t).setByIndex(3, 1);
		
		verify(t).setW(1);
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4objRW#setByIndex(int, Object)} throws
	 * an {@link IndexOutOfBoundsException} for an index different than 0, 1, 2 or 3.
	 */
	@Test
	void setByIndex_ExceptionTest()
	{
		Tup4objRW t = mock(Tup4objRW.class);
		
		when(t.setByIndex(4, 1)).thenCallRealMethod();

		assertThrows(IndexOutOfBoundsException.class, new Executable() {
			public void execute() throws Throwable
			{
				t.setByIndex(4, 1);
			}
		});

		verify(t).setByIndex(4, 1);

		verifyNoMoreInteractions(t);
	}
}
