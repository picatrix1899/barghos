package org.barghos.core.test.api.tuple4;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import org.barghos.core.api.tuple.TupiR;
import org.barghos.core.api.tuple.TupiRW;
import org.barghos.core.api.tuple4.Tup4iR;
import org.barghos.core.api.tuple4.Tup4iRW;
import org.barghos.core.api.tuple4.Tup4iW;

/**
 * This class provides comoponent tests for the interface {@link Tup4iRW}.
 * 
 * @author picatrix1899
 */
class Tup4iRWTest
{
	/**
	 * This test ensures, that the interface extends the interface {@link Tup4iR}.
	 */
	@Test
	void inheritance_Tup4iRTest()
	{
		assertTrue(Tup4iR.class.isAssignableFrom(Tup4iRW.class));
	}
	
	/**
	 * This test ensures, that the interface extends the interface {@link Tup4iW}.
	 */
	@Test
	void inheritance_Tup4iWTest()
	{
		assertTrue(Tup4iW.class.isAssignableFrom(Tup4iRW.class));
	}
	
	/**
	 * This test ensures, that the interface extends the interface {@link TupiRW}.
	 */
	@Test
	void inheritance_TupiRWTest()
	{
		assertTrue(TupiRW.class.isAssignableFrom(Tup4iRW.class));
	}
	
	/**
	 * This test ensures, that the default implementation of the function {@link Tup4iRW#getNewInstance(Tup4iR)} calls
	 * the function {@link Tup4iRW#getNewInstance(int, int, int, int)} with the correct components.
	 */
	@Test
	void getNewInstance_Tuple2Test()
	{
		Tup4iR original = mock(Tup4iR.class);
		Tup4iRW newInstance = mock(Tup4iRW.class);
		Tup4iRW t = mock(Tup4iRW.class);
		
		when(t.getNewInstance(original)).thenCallRealMethod();
		
		when(original.getX()).thenReturn(1);
		when(original.getY()).thenReturn(2);
		when(original.getZ()).thenReturn(3);
		when(original.getW()).thenReturn(4);
		when(t.getNewInstance(1, 2, 3, 4)).thenReturn(newInstance);
		
		assertSame(newInstance, t.getNewInstance(original));
		
		verify(t).getNewInstance(original);
		
		verify(original).getX();
		verify(original).getY();
		verify(original).getZ();
		verify(original).getW();
		verify(t).getNewInstance(1, 2, 3, 4);
		
		verifyNoMoreInteractions(t, original);
	}
	
	/**
	 * This test ensures, that the default implementation of the function {@link Tup4iRW#getNewInstance(int)} calls
	 * the function {@link Tup4iRW#getNewInstance(int, int, int, int)} with the correct components.
	 */
	@Test
	void getNewInstance_ValueTest()
	{
		Tup4iRW newInstance = mock(Tup4iRW.class);
		Tup4iRW t = mock(Tup4iRW.class);
		
		when(t.getNewInstance(1)).thenCallRealMethod();

		when(t.getNewInstance(1, 1, 1, 1)).thenReturn(newInstance);
		
		assertSame(newInstance, t.getNewInstance(1));
		
		verify(t).getNewInstance(1);
		
		verify(t).getNewInstance(1, 1, 1, 1);
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the default implementation of the function {@link Tup4iRW#getNewInstance(TupiR)} calls
	 * the function {@link Tup4iRW#getNewInstance(int, int, int, int)} with the correct components.
	 */
	@Test
	void getNewInstance_TupleTest()
	{
		TupiR original = mock(TupiR.class);
		Tup4iRW newInstance = mock(Tup4iRW.class);
		Tup4iRW t = mock(Tup4iRW.class);
		
		when(t.getNewInstance(original)).thenCallRealMethod();
		
		when(original.getArray()).thenReturn(new int[] {1, 2, 3, 4});
		when(t.getNewInstance(1, 2, 3, 4)).thenReturn(newInstance);
		
		assertSame(newInstance, t.getNewInstance(original));
		
		verify(t).getNewInstance(original);
		
		verify(original).getArray();
		verify(t).getNewInstance(1, 2, 3, 4);
		
		verifyNoMoreInteractions(t, original);
	}
	
	/**
	 * This test ensures, that the default implementation of the function {@link Tup4iRW#getNewInstanceFromArray(int[])} calls
	 * the function {@link Tup4iRW#getNewInstance(int, int, int, int)} with the correct components.
	 */
	@Test
	void getNewInstanceFromArrayTest()
	{
		Tup4iRW newInstance = mock(Tup4iRW.class);
		Tup4iRW t = mock(Tup4iRW.class);
		
		when(t.getNewInstanceFromArray(new int[] {1, 2, 3, 4})).thenCallRealMethod();

		when(t.getNewInstance(1, 2, 3, 4)).thenReturn(newInstance);
		
		assertSame(newInstance, t.getNewInstanceFromArray(new int[] {1, 2, 3, 4}));
		
		verify(t).getNewInstanceFromArray(new int[] {1, 2, 3, 4});
		
		verify(t).getNewInstance(1, 2, 3, 4);
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * this test ensures, that the function {@link Tup4iRW#getDimensions()} always
	 * returns 4 and does not make any calls.
	 */
	@Test
	void getDimensionsTest()
	{
		Tup4iRW t = mock(Tup4iRW.class);
		
		when(t.getDimensions()).thenCallRealMethod();
		
		assertEquals(4, t.getDimensions());
		
		verify(t).getDimensions();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4iRW#set(Tup4iR)} adopts the
	 * values from the input tuple and returns the current instance.
	 */
	@Test
	void set_Tuple2Test()
	{
		Tup4iRW t = mock(Tup4iRW.class);
		Tup4iR t2 = mock(Tup4iR.class);
		
		when(t.set(t2)).thenCallRealMethod();
		
		when(t2.getX()).thenReturn(1);
		when(t2.getY()).thenReturn(2);
		when(t2.getZ()).thenReturn(3);
		when(t2.getW()).thenReturn(4);
		when(t.set(1, 2, 3, 4)).thenReturn(t);
		
		assertSame(t, t.set(t2));
		
		verify(t).set(t2);
		
		verify(t2).getX();
		verify(t2).getY();
		verify(t2).getZ();
		verify(t2).getW();
		verify(t).set(1, 2, 3, 4);
		
		verifyNoMoreInteractions(t, t2);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4iRW#set(int)} adopts the
	 * value for each component and returns the current instance.
	 */
	@Test
	void set_ValueTest()
	{
		Tup4iRW t = mock(Tup4iRW.class);
		
		when(t.set(1)).thenCallRealMethod();
		
		when(t.set(1, 1, 1, 1)).thenReturn(t);
		
		assertSame(t, t.set(1));
		
		verify(t).set(1);

		verify(t).set(1, 1, 1, 1);
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4iRW#set(int, int, int, int)} adopts
	 * the values and returns the current instance.
	 */
	@Test
	void setTest()
	{
		Tup4iRW t = mock(Tup4iRW.class);
		
		when(t.set(1, 2, 3, 4)).thenCallRealMethod();
		
		when(t.setX(1)).thenReturn(t);
		when(t.setY(2)).thenReturn(t);
		when(t.setZ(3)).thenReturn(t);
		when(t.setW(4)).thenReturn(t);
		
		assertSame(t, t.set(1, 2, 3, 4));
		
		verify(t).set(1, 2, 3, 4);

		verify(t).setX(1);
		verify(t).setY(2);
		verify(t).setZ(3);
		verify(t).setW(4);
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4iRW#set(TupiR)} adopts the
	 * values from the input tuple and returns the current instance.
	 */
	@Test
	void set_TupleTest()
	{
		Tup4iRW t = mock(Tup4iRW.class);
		TupiR t2 = mock(TupiR.class);
		
		when(t.set(t2)).thenCallRealMethod();
		
		when(t2.getArray()).thenReturn(new int[] {1, 2, 3, 4});
		when(t.set(1, 2, 3, 4)).thenReturn(t);

		assertSame(t, t.set(t2));
		
		verify(t).set(t2);
		
		verify(t2).getArray();
		verify(t).set(1, 2, 3, 4);

		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4iRW#setArray(int[])} adopts the
	 * values and returns the current instance.
	 */
	@Test
	void setArrayTest()
	{
		Tup4iRW t = mock(Tup4iRW.class);
		
		when(t.setArray(new int[] {1, 2, 3, 4})).thenCallRealMethod();
		
		when(t.set(1, 2, 3, 4)).thenReturn(t);
		
		assertSame(t, t.setArray(new int[] {1, 2, 3, 4}));
		
		verify(t).setArray(new int[] {1, 2, 3, 4});
		
		verify(t).set(1, 2, 3, 4);
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4iRW#setByIndex(int, int)} adopts the
	 * value to the x component if the index is 0 and returns the current instance.
	 */
	@Test
	void setByIndex_XTest()
	{
		Tup4iRW t = mock(Tup4iRW.class);
		
		when(t.setByIndex(0, 1)).thenCallRealMethod();
		
		when(t.setX(1)).thenReturn(t);
		
		assertSame(t, t.setByIndex(0, 1));
		
		verify(t).setByIndex(0, 1);
		
		verify(t).setX(1);
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4iRW#setByIndex(int, int)} adopts the
	 * value to the y component if the index is 1 and returns the current instance.
	 */
	@Test
	void setByIndex_YTest()
	{
		Tup4iRW t = mock(Tup4iRW.class);
		
		when(t.setByIndex(1, 1)).thenCallRealMethod();
		
		when(t.setY(1)).thenReturn(t);
		
		assertSame(t, t.setByIndex(1, 1));
		
		verify(t).setByIndex(1, 1);
		
		verify(t).setY(1);
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4iRW#setByIndex(int, int)} adopts the
	 * value to the z component if the index is 2 and returns the current instance.
	 */
	@Test
	void setByIndex_ZTest()
	{
		Tup4iRW t = mock(Tup4iRW.class);
		
		when(t.setByIndex(2, 1)).thenCallRealMethod();
		
		when(t.setZ(1)).thenReturn(t);
		
		assertSame(t, t.setByIndex(2, 1));
		
		verify(t).setByIndex(2, 1);
		
		verify(t).setZ(1);
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4iRW#setByIndex(int, int)} adopts the
	 * value to the w component if the index is 3 and returns the current instance.
	 */
	@Test
	void setByIndex_WTest()
	{
		Tup4iRW t = mock(Tup4iRW.class);
		
		when(t.setByIndex(3, 1)).thenCallRealMethod();
		
		when(t.setW(1)).thenReturn(t);
		
		assertSame(t, t.setByIndex(3, 1));
		
		verify(t).setByIndex(3, 1);
		
		verify(t).setW(1);
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4iRW#setByIndex(int, int)} throws
	 * an {@link IndexOutOfBoundsException} for an index different than 0, 1, 2 or 3.
	 */
	@Test
	void setByIndex_ExceptionTest()
	{
		Tup4iRW t = mock(Tup4iRW.class);
		
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
