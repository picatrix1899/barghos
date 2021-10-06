package org.barghos.core.test.api.tuple4;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import org.barghos.core.api.tuple.TuplR;
import org.barghos.core.api.tuple.TuplRW;
import org.barghos.core.api.tuple4.Tup4lR;
import org.barghos.core.api.tuple4.Tup4lRW;
import org.barghos.core.api.tuple4.Tup4lW;

/**
 * This class provides comoponent tests for the interface {@link Tup4lRW}.
 * 
 * @author picatrix1899
 */
class Tup4lRWTest
{
	/**
	 * This test ensures, that the interface extends the interface {@link Tup4lR}.
	 */
	@Test
	void inheritance_Tup4lRTest()
	{
		assertTrue(Tup4lR.class.isAssignableFrom(Tup4lRW.class));
	}
	
	/**
	 * This test ensures, that the interface extends the interface {@link Tup4lW}.
	 */
	@Test
	void inheritance_Tup4lWTest()
	{
		assertTrue(Tup4lW.class.isAssignableFrom(Tup4lRW.class));
	}
	
	/**
	 * This test ensures, that the interface extends the interface {@link TuplRW}.
	 */
	@Test
	void inheritance_TuplRWTest()
	{
		assertTrue(TuplRW.class.isAssignableFrom(Tup4lRW.class));
	}
	
	/**
	 * This test ensures, that the default implementation of the function {@link Tup4lRW#getNewInstance(Tup4lR)} calls
	 * the function {@link Tup4lRW#getNewInstance(long, long, long, long)} with the correct components.
	 */
	@Test
	void getNewInstance_Tuple2Test()
	{
		Tup4lR original = mock(Tup4lR.class);
		Tup4lRW newInstance = mock(Tup4lRW.class);
		Tup4lRW t = mock(Tup4lRW.class);
		
		when(t.getNewInstance(original)).thenCallRealMethod();
		
		when(original.getX()).thenReturn(1l);
		when(original.getY()).thenReturn(2l);
		when(original.getZ()).thenReturn(3l);
		when(original.getW()).thenReturn(4l);
		when(t.getNewInstance(1l, 2l, 3l, 4l)).thenReturn(newInstance);
		
		assertSame(newInstance, t.getNewInstance(original));
		
		verify(t).getNewInstance(original);
		
		verify(original).getX();
		verify(original).getY();
		verify(original).getZ();
		verify(original).getW();
		verify(t).getNewInstance(1l, 2l, 3l, 4l);
		
		verifyNoMoreInteractions(t, original);
	}
	
	/**
	 * This test ensures, that the default implementation of the function {@link Tup4lRW#getNewInstance(long)} calls
	 * the function {@link Tup4lRW#getNewInstance(long, long, long, long)} with the correct components.
	 */
	@Test
	void getNewInstance_ValueTest()
	{
		Tup4lRW newInstance = mock(Tup4lRW.class);
		Tup4lRW t = mock(Tup4lRW.class);
		
		when(t.getNewInstance(1l)).thenCallRealMethod();

		when(t.getNewInstance(1l, 1l, 1l, 1l)).thenReturn(newInstance);
		
		assertSame(newInstance, t.getNewInstance(1l));
		
		verify(t).getNewInstance(1l);
		
		verify(t).getNewInstance(1l, 1l, 1l, 1l);
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the default implementation of the function {@link Tup4lRW#getNewInstance(TuplR)} calls
	 * the function {@link Tup4lRW#getNewInstance(long, long, long, long)} with the correct components.
	 */
	@Test
	void getNewInstance_TupleTest()
	{
		TuplR original = mock(TuplR.class);
		Tup4lRW newInstance = mock(Tup4lRW.class);
		Tup4lRW t = mock(Tup4lRW.class);
		
		when(t.getNewInstance(original)).thenCallRealMethod();
		
		when(original.getArray()).thenReturn(new long[] {1l, 2l, 3, 4l});
		when(t.getNewInstance(1l, 2l, 3l, 4l)).thenReturn(newInstance);
		
		assertSame(newInstance, t.getNewInstance(original));
		
		verify(t).getNewInstance(original);
		
		verify(original).getArray();
		verify(t).getNewInstance(1l, 2l, 3l, 4l);
		
		verifyNoMoreInteractions(t, original);
	}
	
	/**
	 * This test ensures, that the default implementation of the function {@link Tup4lRW#getNewInstanceFromArray(long[])} calls
	 * the function {@link Tup4lRW#getNewInstance(long, long, long, long)} with the correct components.
	 */
	@Test
	void getNewInstanceFromArrayTest()
	{
		Tup4lRW newInstance = mock(Tup4lRW.class);
		Tup4lRW t = mock(Tup4lRW.class);
		
		when(t.getNewInstanceFromArray(new long[] {1l, 2l, 3l, 4l})).thenCallRealMethod();

		when(t.getNewInstance(1l, 2l, 3l, 4l)).thenReturn(newInstance);
		
		assertSame(newInstance, t.getNewInstanceFromArray(new long[] {1l, 2l, 3l, 4l}));
		
		verify(t).getNewInstanceFromArray(new long[] {1l, 2l, 3l, 4l});
		
		verify(t).getNewInstance(1l, 2l, 3l, 4l);
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * this test ensures, that the function {@link Tup4lRW#getDimensions()} always
	 * returns 4 and does not make any calls.
	 */
	@Test
	void getDimensionsTest()
	{
		Tup4lRW t = mock(Tup4lRW.class);
		
		when(t.getDimensions()).thenCallRealMethod();
		
		assertEquals(4, t.getDimensions());
		
		verify(t).getDimensions();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4lRW#set(Tup4lR)} adopts the
	 * values from the input tuple and returns the current instance.
	 */
	@Test
	void set_Tuple2Test()
	{
		Tup4lRW t = mock(Tup4lRW.class);
		Tup4lR t2 = mock(Tup4lR.class);
		
		when(t.set(t2)).thenCallRealMethod();
		
		when(t2.getX()).thenReturn(1l);
		when(t2.getY()).thenReturn(2l);
		when(t2.getZ()).thenReturn(3l);
		when(t2.getW()).thenReturn(4l);
		when(t.set(1l, 2l, 3l, 4l)).thenReturn(t);
		
		assertSame(t, t.set(t2));
		
		verify(t).set(t2);
		
		verify(t2).getX();
		verify(t2).getY();
		verify(t2).getZ();
		verify(t2).getW();
		verify(t).set(1l, 2l, 3l, 4l);
		
		verifyNoMoreInteractions(t, t2);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4lRW#set(long)} adopts the
	 * value for each component and returns the current instance.
	 */
	@Test
	void set_ValueTest()
	{
		Tup4lRW t = mock(Tup4lRW.class);
		
		when(t.set(1l)).thenCallRealMethod();
		
		when(t.set(1l, 1l, 1l, 1l)).thenReturn(t);
		
		assertSame(t, t.set(1l));
		
		verify(t).set(1l);

		verify(t).set(1l, 1l, 1l, 1l);
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4lRW#set(long, long, long, long)} adopts
	 * the values and returns the current instance.
	 */
	@Test
	void setTest()
	{
		Tup4lRW t = mock(Tup4lRW.class);
		
		when(t.set(1l, 2l, 3l, 4l)).thenCallRealMethod();
		
		when(t.setX(1l)).thenReturn(t);
		when(t.setY(2l)).thenReturn(t);
		when(t.setZ(3l)).thenReturn(t);
		when(t.setW(4l)).thenReturn(t);
		
		assertSame(t, t.set(1l, 2l, 3l, 4l));
		
		verify(t).set(1l, 2l, 3l, 4l);

		verify(t).setX(1l);
		verify(t).setY(2l);
		verify(t).setZ(3l);
		verify(t).setW(4l);
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4lRW#set(TuplR)} adopts the
	 * values from the input tuple and returns the current instance.
	 */
	@Test
	void set_TupleTest()
	{
		Tup4lRW t = mock(Tup4lRW.class);
		TuplR t2 = mock(TuplR.class);
		
		when(t.set(t2)).thenCallRealMethod();
		
		when(t2.getArray()).thenReturn(new long[] {1l, 2l, 3l, 4l});
		when(t.set(1l, 2l, 3l, 4l)).thenReturn(t);

		assertSame(t, t.set(t2));
		
		verify(t).set(t2);
		
		verify(t2).getArray();
		verify(t).set(1l, 2l, 3l, 4l);

		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4lRW#setArray(long[])} adopts the
	 * values and returns the current instance.
	 */
	@Test
	void setArrayTest()
	{
		Tup4lRW t = mock(Tup4lRW.class);
		
		when(t.setArray(new long[] {1l, 2l, 3l, 4l})).thenCallRealMethod();
		
		when(t.set(1l, 2l, 3l, 4l)).thenReturn(t);
		
		assertSame(t, t.setArray(new long[] {1l, 2l, 3l, 4l}));
		
		verify(t).setArray(new long[] {1l, 2l, 3l, 4l});
		
		verify(t).set(1l, 2l, 3l, 4l);
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4lRW#setByIndex(int, long)} adopts the
	 * value to the x component if the index is 0 and returns the current instance.
	 */
	@Test
	void setByIndex_XTest()
	{
		Tup4lRW t = mock(Tup4lRW.class);
		
		when(t.setByIndex(0, 1l)).thenCallRealMethod();
		
		when(t.setX(1l)).thenReturn(t);
		
		assertSame(t, t.setByIndex(0, 1l));
		
		verify(t).setByIndex(0, 1l);
		
		verify(t).setX(1l);
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4lRW#setByIndex(int, long)} adopts the
	 * value to the y component if the index is 1 and returns the current instance.
	 */
	@Test
	void setByIndex_YTest()
	{
		Tup4lRW t = mock(Tup4lRW.class);
		
		when(t.setByIndex(1, 1l)).thenCallRealMethod();
		
		when(t.setY(1l)).thenReturn(t);
		
		assertSame(t, t.setByIndex(1, 1l));
		
		verify(t).setByIndex(1, 1l);
		
		verify(t).setY(1l);
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4lRW#setByIndex(int, long)} adopts the
	 * value to the z component if the index is 2 and returns the current instance.
	 */
	@Test
	void setByIndex_ZTest()
	{
		Tup4lRW t = mock(Tup4lRW.class);
		
		when(t.setByIndex(2, 1l)).thenCallRealMethod();
		
		when(t.setZ(1l)).thenReturn(t);
		
		assertSame(t, t.setByIndex(2, 1l));
		
		verify(t).setByIndex(2, 1l);
		
		verify(t).setZ(1l);
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4lRW#setByIndex(int, long)} adopts the
	 * value to the w component if the index is 3 and returns the current instance.
	 */
	@Test
	void setByIndex_WTest()
	{
		Tup4lRW t = mock(Tup4lRW.class);
		
		when(t.setByIndex(3, 1l)).thenCallRealMethod();
		
		when(t.setW(1l)).thenReturn(t);
		
		assertSame(t, t.setByIndex(3, 1l));
		
		verify(t).setByIndex(3, 1l);
		
		verify(t).setW(1l);
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4lRW#setByIndex(int, long)} throws
	 * an {@link IndexOutOfBoundsException} for an index different than 0, 1, 2 or 3.
	 */
	@Test
	void setByIndex_ExceptionTest()
	{
		Tup4lRW t = mock(Tup4lRW.class);
		
		when(t.setByIndex(4, 1l)).thenCallRealMethod();

		assertThrows(IndexOutOfBoundsException.class, new Executable() {
			public void execute() throws Throwable
			{
				t.setByIndex(4, 1l);
			}
		});

		verify(t).setByIndex(4, 1l);

		verifyNoMoreInteractions(t);
	}
}
