package org.barghos.core.test.api.tuple4;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import org.barghos.core.api.tuple.TupiR;
import org.barghos.core.api.tuple.TupiW;
import org.barghos.core.api.tuple4.Tup4iR;
import org.barghos.core.api.tuple4.Tup4iW;

/**
 * This class provides component tests for the interface {@link Tup4iW}.
 * 
 * @author picatrix1899
 */
class Tup4iWTest
{
	/**
	 * This test ensures, that the interface extends the interface {@link TupiW}.
	 */
	@Test
	void inheritance_TupiWTest()
	{
		assertTrue(TupiW.class.isAssignableFrom(Tup4iW.class));
	}
	
	/**
	 * This test ensures, that the function {@link Tup4iW#set(Tup4iR)} adopts the
	 * values from the input tuple and returns the current instance.
	 */
	@Test
	void set_Tuple2Test()
	{
		Tup4iW t = mock(Tup4iW.class);
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
	 * This test ensures, that the function {@link Tup4iW#set(int)} adopts the
	 * value for each component and returns the current instance.
	 */
	@Test
	void set_ValueTest()
	{
		Tup4iW t = mock(Tup4iW.class);
		
		when(t.set(1)).thenCallRealMethod();
		
		when(t.set(1, 1, 1, 1)).thenReturn(t);
		
		assertSame(t, t.set(1));
		
		verify(t).set(1);

		verify(t).set(1, 1, 1, 1);
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4iW#set(int, int, int, int)} adopts
	 * the values and returns the current instance.
	 */
	@Test
	void setTest()
	{
		Tup4iW t = mock(Tup4iW.class);
		
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
	 * This test ensures, that the function {@link Tup4iW#set(TupiR)} adopts the
	 * values from the input tuple and returns the current instance.
	 */
	@Test
	void set_TupleTest()
	{
		Tup4iW t = mock(Tup4iW.class);
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
	 * This test ensures, that the function {@link Tup4iW#getDimensions()} always
	 * returns 4 and does not do any calls.
	 */
	@Test
	void getDimensionsTest()
	{
		Tup4iW t = mock(Tup4iW.class);
		
		when(t.getDimensions()).thenCallRealMethod();
		
		assertEquals(4, t.getDimensions());
		
		verify(t).getDimensions();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4iW#setArray(int[])} adopts the
	 * values and returns the current instance.
	 */
	@Test
	void setArrayTest()
	{
		Tup4iW t = mock(Tup4iW.class);
		
		when(t.setArray(new int[] {1, 2, 3, 4})).thenCallRealMethod();
		
		when(t.set(1, 2, 3, 4)).thenReturn(t);
		
		assertSame(t, t.setArray(new int[] {1, 2, 3, 4}));
		
		verify(t).setArray(new int[] {1, 2, 3, 4});
		
		verify(t).set(1, 2, 3, 4);
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4iW#setByIndex(int, int)} adopts the
	 * value to the x component if the index is 0 and returns the current instance.
	 */
	@Test
	void setByIndex_XTest()
	{
		Tup4iW t = mock(Tup4iW.class);
		
		when(t.setByIndex(0, 1)).thenCallRealMethod();
		
		when(t.setX(1)).thenReturn(t);
		
		assertSame(t, t.setByIndex(0, 1));
		
		verify(t).setByIndex(0, 1);
		
		verify(t).setX(1);
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4iW#setByIndex(int, int)} adopts the
	 * value to the y component if the index is 1 and returns the current instance.
	 */
	@Test
	void setByIndex_YTest()
	{
		Tup4iW t = mock(Tup4iW.class);
		
		when(t.setByIndex(1, 1)).thenCallRealMethod();
		
		when(t.setY(1)).thenReturn(t);
		
		assertSame(t, t.setByIndex(1, 1));
		
		verify(t).setByIndex(1, 1);
		
		verify(t).setY(1);
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4iW#setByIndex(int, int)} adopts the
	 * value to the z component if the index is 2 and returns the current instance.
	 */
	@Test
	void setByIndex_ZTest()
	{
		Tup4iW t = mock(Tup4iW.class);
		
		when(t.setByIndex(2, 1)).thenCallRealMethod();
		
		when(t.setZ(1)).thenReturn(t);
		
		assertSame(t, t.setByIndex(2, 1));
		
		verify(t).setByIndex(2, 1);
		
		verify(t).setZ(1);
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4iW#setByIndex(int, int)} adopts the
	 * value to the w component if the index is 3 and returns the current instance.
	 */
	@Test
	void setByIndex_WTest()
	{
		Tup4iW t = mock(Tup4iW.class);
		
		when(t.setByIndex(3, 1)).thenCallRealMethod();
		
		when(t.setW(1)).thenReturn(t);
		
		assertSame(t, t.setByIndex(3, 1));
		
		verify(t).setByIndex(3, 1);
		
		verify(t).setW(1);
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4iW#setByIndex(int, int)} throws
	 * an {@link IndexOutOfBoundsException} for an index different than 0, 1, 2 or 3.
	 */
	@Test
	void setByIndex_ExceptionTest()
	{
		Tup4iW t = mock(Tup4iW.class);
		
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
