package org.barghos.core.test.api.tuple2;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import org.barghos.core.api.tuple.TupiR;
import org.barghos.core.api.tuple.TupiRW;
import org.barghos.core.api.tuple2.Tup2iR;
import org.barghos.core.api.tuple2.Tup2iRW;
import org.barghos.core.api.tuple2.Tup2iW;

/**
 * This class provides comoponent tests for the interface {@link Tup2iRW}.
 * 
 * @author picatrix1899
 */
class Tup2iRWTest
{
	/**
	 * This test ensures, that the interface extends the interface {@link Tup2iR}.
	 */
	@Test
	void inheritance_Tup2iRTest()
	{
		assertTrue(Tup2iR.class.isAssignableFrom(Tup2iRW.class));
	}
	
	/**
	 * This test ensures, that the interface extends the interface {@link Tup2iW}.
	 */
	@Test
	void inheritance_Tup2iWTest()
	{
		assertTrue(Tup2iW.class.isAssignableFrom(Tup2iRW.class));
	}
	
	/**
	 * This test ensures, that the interface extends the interface {@link TupiRW}.
	 */
	@Test
	void inheritance_TupiRWTest()
	{
		assertTrue(TupiRW.class.isAssignableFrom(Tup2iRW.class));
	}
	
	/**
	 * This test ensures, that the default implementation of the function {@link Tup2iRW#getNewInstance(Tup2iR)} calls
	 * the function {@link Tup2iRW#getNewInstance(int, int)} with the correct components.
	 */
	@Test
	void getNewInstance_Tuple2Test()
	{
		Tup2iR original = mock(Tup2iR.class);
		Tup2iRW newInstance = mock(Tup2iRW.class);
		Tup2iRW t = mock(Tup2iRW.class);
		
		when(t.getNewInstance(original)).thenCallRealMethod();
		
		when(original.getX()).thenReturn(1);
		when(original.getY()).thenReturn(2);
		when(t.getNewInstance(1, 2)).thenReturn(newInstance);
		
		assertSame(newInstance, t.getNewInstance(original));
		
		verify(t).getNewInstance(original);
		
		verify(original).getX();
		verify(original).getY();
		verify(t).getNewInstance(1, 2);
		
		verifyNoMoreInteractions(t, original);
	}
	
	/**
	 * This test ensures, that the default implementation of the function {@link Tup2iRW#getNewInstance(int)} calls
	 * the function {@link Tup2iRW#getNewInstance(int, int)} with the correct components.
	 */
	@Test
	void getNewInstance_ValueTest()
	{
		Tup2iRW newInstance = mock(Tup2iRW.class);
		Tup2iRW t = mock(Tup2iRW.class);
		
		when(t.getNewInstance(1)).thenCallRealMethod();

		when(t.getNewInstance(1, 1)).thenReturn(newInstance);
		
		assertSame(newInstance, t.getNewInstance(1));
		
		verify(t).getNewInstance(1);
		
		verify(t).getNewInstance(1, 1);
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the default implementation of the function {@link Tup2iRW#getNewInstance(TupiR)} calls
	 * the function {@link Tup2iRW#getNewInstance(int, int)} with the correct components.
	 */
	@Test
	void getNewInstance_TupleTest()
	{
		TupiR original = mock(TupiR.class);
		Tup2iRW newInstance = mock(Tup2iRW.class);
		Tup2iRW t = mock(Tup2iRW.class);
		
		when(t.getNewInstance(original)).thenCallRealMethod();
		
		when(original.getArray()).thenReturn(new int[] {1, 2});
		when(t.getNewInstance(1, 2)).thenReturn(newInstance);
		
		assertSame(newInstance, t.getNewInstance(original));
		
		verify(t).getNewInstance(original);
		
		verify(original).getArray();
		verify(t).getNewInstance(1, 2);
		
		verifyNoMoreInteractions(t, original);
	}
	
	/**
	 * This test ensures, that the default implementation of the function {@link Tup2iRW#getNewInstanceFromArray(int[])} calls
	 * the function {@link Tup2iRW#getNewInstance(int, int)} with the correct components.
	 */
	@Test
	void getNewInstanceFromArrayTest()
	{
		Tup2iRW newInstance = mock(Tup2iRW.class);
		Tup2iRW t = mock(Tup2iRW.class);
		
		when(t.getNewInstanceFromArray(new int[] {1, 2})).thenCallRealMethod();

		when(t.getNewInstance(1, 2)).thenReturn(newInstance);
		
		assertSame(newInstance, t.getNewInstanceFromArray(new int[] {1, 2}));
		
		verify(t).getNewInstanceFromArray(new int[] {1, 2});
		
		verify(t).getNewInstance(1, 2);
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * this test ensures, that the function {@link Tup2iRW#getDimensions()} always
	 * returns 2 and does not make any calls.
	 */
	@Test
	void getDimensionsTest()
	{
		Tup2iRW t = mock(Tup2iRW.class);
		
		when(t.getDimensions()).thenCallRealMethod();
		
		assertEquals(2, t.getDimensions());
		
		verify(t).getDimensions();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup2iRW#set(Tup2iR)} adopts the
	 * values from the input tuple and returns the current instance.
	 */
	@Test
	void set_Tuple2Test()
	{
		Tup2iRW t = mock(Tup2iRW.class);
		Tup2iR t2 = mock(Tup2iR.class);
		
		when(t.set(t2)).thenCallRealMethod();
		
		when(t2.getX()).thenReturn(1);
		when(t2.getY()).thenReturn(2);
		when(t.set(1, 2)).thenReturn(t);
		
		assertSame(t, t.set(t2));
		
		verify(t).set(t2);
		
		verify(t2).getX();
		verify(t2).getY();
		verify(t).set(1, 2);
		
		verifyNoMoreInteractions(t, t2);
	}
	
	/**
	 * This test ensures, that the function {@link Tup2iRW#set(int)} adopts the
	 * value for each component and returns the current instance.
	 */
	@Test
	void set_ValueTest()
	{
		Tup2iRW t = mock(Tup2iRW.class);
		
		when(t.set(1)).thenCallRealMethod();
		
		when(t.set(1, 1)).thenReturn(t);
		
		assertSame(t, t.set(1));
		
		verify(t).set(1);

		verify(t).set(1, 1);
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup2iRW#set(int, int)} adopts
	 * the values and returns the current instance.
	 */
	@Test
	void setTest()
	{
		Tup2iRW t = mock(Tup2iRW.class);
		
		when(t.set(1, 2)).thenCallRealMethod();
		
		when(t.setX(1)).thenReturn(t);
		when(t.setY(2)).thenReturn(t);
		
		assertSame(t, t.set(1, 2));
		
		verify(t).set(1, 2);

		verify(t).setX(1);
		verify(t).setY(2);
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup2iRW#set(TupiR)} adopts the
	 * values from the input tuple and returns the current instance.
	 */
	@Test
	void set_TupleTest()
	{
		Tup2iRW t = mock(Tup2iRW.class);
		TupiR t2 = mock(TupiR.class);
		
		when(t.set(t2)).thenCallRealMethod();
		
		when(t2.getArray()).thenReturn(new int[] {1, 2});
		when(t.set(1, 2)).thenReturn(t);

		assertSame(t, t.set(t2));
		
		verify(t).set(t2);
		
		verify(t2).getArray();
		verify(t).set(1, 2);

		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup2iRW#setArray(int[])} adopts the
	 * values and returns the current instance.
	 */
	@Test
	void setArrayTest()
	{
		Tup2iRW t = mock(Tup2iRW.class);
		
		when(t.setArray(new int[] {1, 2})).thenCallRealMethod();
		
		when(t.set(1, 2)).thenReturn(t);
		
		assertSame(t, t.setArray(new int[] {1, 2}));
		
		verify(t).setArray(new int[] {1, 2});
		
		verify(t).set(1, 2);
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup2iRW#setByIndex(int, int)} adopts the
	 * value to the x component if the index is 0 and returns the current instance.
	 */
	@Test
	void setByIndex_XTest()
	{
		Tup2iRW t = mock(Tup2iRW.class);
		
		when(t.setByIndex(0, 1)).thenCallRealMethod();
		
		when(t.setX(1)).thenReturn(t);
		
		assertSame(t, t.setByIndex(0, 1));
		
		verify(t).setByIndex(0, 1);
		
		verify(t).setX(1);
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup2iRW#setByIndex(int, int)} adopts the
	 * value to the y component if the index is 1 and returns the current instance.
	 */
	@Test
	void setByIndex_YTest()
	{
		Tup2iRW t = mock(Tup2iRW.class);
		
		when(t.setByIndex(1, 1)).thenCallRealMethod();
		
		when(t.setY(1)).thenReturn(t);
		
		assertSame(t, t.setByIndex(1, 1));
		
		verify(t).setByIndex(1, 1);
		
		verify(t).setY(1);
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup2iRW#setByIndex(int, int)} throws
	 * an {@link IndexOutOfBoundsException} for an index different than 0 or 1.
	 */
	@Test
	void setByIndex_ExceptionTest()
	{
		Tup2iRW t = mock(Tup2iRW.class);
		
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
