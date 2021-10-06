package org.barghos.core.test.api.tuple3;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import org.barghos.core.api.tuple.TupiR;
import org.barghos.core.api.tuple.TupiRW;
import org.barghos.core.api.tuple3.Tup3iR;
import org.barghos.core.api.tuple3.Tup3iRW;
import org.barghos.core.api.tuple3.Tup3iW;

/**
 * This class provides comoponent tests for the interface {@link Tup3iRW}.
 * 
 * @author picatrix1899
 */
class Tup3iRWTest
{
	/**
	 * This test ensures, that the interface extends the interface {@link Tup3iR}.
	 */
	@Test
	void inheritance_Tup3iRTest()
	{
		assertTrue(Tup3iR.class.isAssignableFrom(Tup3iRW.class));
	}
	
	/**
	 * This test ensures, that the interface extends the interface {@link Tup3iW}.
	 */
	@Test
	void inheritance_Tup3iWTest()
	{
		assertTrue(Tup3iW.class.isAssignableFrom(Tup3iRW.class));
	}
	
	/**
	 * This test ensures, that the interface extends the interface {@link TupiRW}.
	 */
	@Test
	void inheritance_TupiRWTest()
	{
		assertTrue(TupiRW.class.isAssignableFrom(Tup3iRW.class));
	}
	
	/**
	 * This test ensures, that the default implementation of the function {@link Tup3iRW#getNewInstance(Tup3iR)} calls
	 * the function {@link Tup3iRW#getNewInstance(int, int, int)} with the correct components.
	 */
	@Test
	void getNewInstance_Tuple2Test()
	{
		Tup3iR original = mock(Tup3iR.class);
		Tup3iRW newInstance = mock(Tup3iRW.class);
		Tup3iRW t = mock(Tup3iRW.class);
		
		when(t.getNewInstance(original)).thenCallRealMethod();
		
		when(original.getX()).thenReturn(1);
		when(original.getY()).thenReturn(2);
		when(original.getZ()).thenReturn(3);
		when(t.getNewInstance(1, 2, 3)).thenReturn(newInstance);
		
		assertSame(newInstance, t.getNewInstance(original));
		
		verify(t).getNewInstance(original);
		
		verify(original).getX();
		verify(original).getY();
		verify(original).getZ();
		verify(t).getNewInstance(1, 2, 3);
		
		verifyNoMoreInteractions(t, original);
	}
	
	/**
	 * This test ensures, that the default implementation of the function {@link Tup3iRW#getNewInstance(int)} calls
	 * the function {@link Tup3iRW#getNewInstance(int, int, int)} with the correct components.
	 */
	@Test
	void getNewInstance_ValueTest()
	{
		Tup3iRW newInstance = mock(Tup3iRW.class);
		Tup3iRW t = mock(Tup3iRW.class);
		
		when(t.getNewInstance(1)).thenCallRealMethod();

		when(t.getNewInstance(1, 1, 1)).thenReturn(newInstance);
		
		assertSame(newInstance, t.getNewInstance(1));
		
		verify(t).getNewInstance(1);
		
		verify(t).getNewInstance(1, 1, 1);
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the default implementation of the function {@link Tup3iRW#getNewInstance(TupiR)} calls
	 * the function {@link Tup3iRW#getNewInstance(int, int, int)} with the correct components.
	 */
	@Test
	void getNewInstance_TupleTest()
	{
		TupiR original = mock(TupiR.class);
		Tup3iRW newInstance = mock(Tup3iRW.class);
		Tup3iRW t = mock(Tup3iRW.class);
		
		when(t.getNewInstance(original)).thenCallRealMethod();
		
		when(original.getArray()).thenReturn(new int[] {1, 2, 3});
		when(t.getNewInstance(1, 2, 3)).thenReturn(newInstance);
		
		assertSame(newInstance, t.getNewInstance(original));
		
		verify(t).getNewInstance(original);
		
		verify(original).getArray();
		verify(t).getNewInstance(1, 2, 3);
		
		verifyNoMoreInteractions(t, original);
	}
	
	/**
	 * This test ensures, that the default implementation of the function {@link Tup3iRW#getNewInstanceFromArray(int[])} calls
	 * the function {@link Tup3iRW#getNewInstance(int, int, int)} with the correct components.
	 */
	@Test
	void getNewInstanceFromArrayTest()
	{
		Tup3iRW newInstance = mock(Tup3iRW.class);
		Tup3iRW t = mock(Tup3iRW.class);
		
		when(t.getNewInstanceFromArray(new int[] {1, 2, 3})).thenCallRealMethod();

		when(t.getNewInstance(1, 2, 3)).thenReturn(newInstance);
		
		assertSame(newInstance, t.getNewInstanceFromArray(new int[] {1, 2, 3}));
		
		verify(t).getNewInstanceFromArray(new int[] {1, 2, 3});
		
		verify(t).getNewInstance(1, 2, 3);
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * this test ensures, that the function {@link Tup3iRW#getDimensions()} always
	 * returns 3 and does not make any calls.
	 */
	@Test
	void getDimensionsTest()
	{
		Tup3iRW t = mock(Tup3iRW.class);
		
		when(t.getDimensions()).thenCallRealMethod();
		
		assertEquals(3, t.getDimensions());
		
		verify(t).getDimensions();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup3iRW#set(Tup3iR)} adopts the
	 * values from the input tuple and returns the current instance.
	 */
	@Test
	void set_Tuple2Test()
	{
		Tup3iRW t = mock(Tup3iRW.class);
		Tup3iR t2 = mock(Tup3iR.class);
		
		when(t.set(t2)).thenCallRealMethod();
		
		when(t2.getX()).thenReturn(1);
		when(t2.getY()).thenReturn(2);
		when(t2.getZ()).thenReturn(3);
		when(t.set(1, 2, 3)).thenReturn(t);
		
		assertSame(t, t.set(t2));
		
		verify(t).set(t2);
		
		verify(t2).getX();
		verify(t2).getY();
		verify(t2).getZ();
		verify(t).set(1, 2, 3);
		
		verifyNoMoreInteractions(t, t2);
	}
	
	/**
	 * This test ensures, that the function {@link Tup3iRW#set(int)} adopts the
	 * value for each component and returns the current instance.
	 */
	@Test
	void set_ValueTest()
	{
		Tup3iRW t = mock(Tup3iRW.class);
		
		when(t.set(1)).thenCallRealMethod();
		
		when(t.set(1, 1, 1)).thenReturn(t);
		
		assertSame(t, t.set(1));
		
		verify(t).set(1);

		verify(t).set(1, 1, 1);
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup3iRW#set(int, int, int)} adopts
	 * the values and returns the current instance.
	 */
	@Test
	void setTest()
	{
		Tup3iRW t = mock(Tup3iRW.class);
		
		when(t.set(1, 2, 3)).thenCallRealMethod();
		
		when(t.setX(1)).thenReturn(t);
		when(t.setY(2)).thenReturn(t);
		when(t.setZ(3)).thenReturn(t);
		
		assertSame(t, t.set(1, 2, 3));
		
		verify(t).set(1, 2, 3);

		verify(t).setX(1);
		verify(t).setY(2);
		verify(t).setZ(3);
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup3iRW#set(TupiR)} adopts the
	 * values from the input tuple and returns the current instance.
	 */
	@Test
	void set_TupleTest()
	{
		Tup3iRW t = mock(Tup3iRW.class);
		TupiR t2 = mock(TupiR.class);
		
		when(t.set(t2)).thenCallRealMethod();
		
		when(t2.getArray()).thenReturn(new int[] {1, 2, 3});
		when(t.set(1, 2, 3)).thenReturn(t);

		assertSame(t, t.set(t2));
		
		verify(t).set(t2);
		
		verify(t2).getArray();
		verify(t).set(1, 2, 3);

		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup3iRW#setArray(int[])} adopts the
	 * values and returns the current instance.
	 */
	@Test
	void setArrayTest()
	{
		Tup3iRW t = mock(Tup3iRW.class);
		
		when(t.setArray(new int[] {1, 2, 3})).thenCallRealMethod();
		
		when(t.set(1, 2, 3)).thenReturn(t);
		
		assertSame(t, t.setArray(new int[] {1, 2, 3}));
		
		verify(t).setArray(new int[] {1, 2, 3});
		
		verify(t).set(1, 2, 3);
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup3iRW#setByIndex(int, int)} adopts the
	 * value to the x component if the index is 0 and returns the current instance.
	 */
	@Test
	void setByIndex_XTest()
	{
		Tup3iRW t = mock(Tup3iRW.class);
		
		when(t.setByIndex(0, 1)).thenCallRealMethod();
		
		when(t.setX(1)).thenReturn(t);
		
		assertSame(t, t.setByIndex(0, 1));
		
		verify(t).setByIndex(0, 1);
		
		verify(t).setX(1);
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup3iRW#setByIndex(int, int)} adopts the
	 * value to the y component if the index is 1 and returns the current instance.
	 */
	@Test
	void setByIndex_YTest()
	{
		Tup3iRW t = mock(Tup3iRW.class);
		
		when(t.setByIndex(1, 1)).thenCallRealMethod();
		
		when(t.setY(1)).thenReturn(t);
		
		assertSame(t, t.setByIndex(1, 1));
		
		verify(t).setByIndex(1, 1);
		
		verify(t).setY(1);
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup3iRW#setByIndex(int, int)} adopts the
	 * value to the z component if the index is 2 and returns the current instance.
	 */
	@Test
	void setByIndex_ZTest()
	{
		Tup3iRW t = mock(Tup3iRW.class);
		
		when(t.setByIndex(2, 1)).thenCallRealMethod();
		
		when(t.setZ(1)).thenReturn(t);
		
		assertSame(t, t.setByIndex(2, 1));
		
		verify(t).setByIndex(2, 1);
		
		verify(t).setZ(1);
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup3iRW#setByIndex(int, int)} throws
	 * an {@link IndexOutOfBoundsException} for an index different than 0, 1 or 2.
	 */
	@Test
	void setByIndex_ExceptionTest()
	{
		Tup3iRW t = mock(Tup3iRW.class);
		
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
