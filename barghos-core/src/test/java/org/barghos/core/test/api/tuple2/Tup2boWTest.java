package org.barghos.core.test.api.tuple2;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import org.barghos.core.api.tuple.TupboR;
import org.barghos.core.api.tuple.TupboW;
import org.barghos.core.api.tuple2.Tup2boR;
import org.barghos.core.api.tuple2.Tup2boW;

/**
 * This class provides component tests for the interface {@link Tup2boW}.
 * 
 * @author picatrix1899
 */
class Tup2boWTest
{
	/**
	 * This test ensures, that the interface extends the interface {@link TupboW}.
	 */
	@Test
	void inheritance_TupboWTest()
	{
		assertTrue(TupboW.class.isAssignableFrom(Tup2boW.class));
	}
	
	/**
	 * This test ensures, that the function {@link Tup2boW#set(Tup2boR)} adopts the
	 * values from the input tuple and returns the current instance.
	 */
	@Test
	void set_Tuple2Test()
	{
		Tup2boW t = mock(Tup2boW.class);
		Tup2boR t2 = mock(Tup2boR.class);
		
		when(t.set(t2)).thenCallRealMethod();
		
		when(t2.getX()).thenReturn(true);
		when(t2.getY()).thenReturn(false);
		when(t.set(true, false)).thenReturn(t);
		
		assertSame(t, t.set(t2));
		
		verify(t).set(t2);
		
		verify(t2).getX();
		verify(t2).getY();
		verify(t).set(true, false);
		
		verifyNoMoreInteractions(t, t2);
	}
	
	/**
	 * This test ensures, that the function {@link Tup2boW#set(boolean)} adopts the
	 * value for each component and returns the current instance.
	 */
	@Test
	void set_ValueTest()
	{
		Tup2boW t = mock(Tup2boW.class);
		
		when(t.set(true)).thenCallRealMethod();
		
		when(t.set(true, true)).thenReturn(t);
		
		assertSame(t, t.set(true));
		
		verify(t).set(true);

		verify(t).set(true, true);
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup2boW#set(boolean, boolean)} adopts
	 * the values and returns the current instance.
	 */
	@Test
	void setTest()
	{
		Tup2boW t = mock(Tup2boW.class);
		
		when(t.set(true, false)).thenCallRealMethod();
		
		when(t.setX(true)).thenReturn(t);
		when(t.setY(false)).thenReturn(t);
		
		assertSame(t, t.set(true, false));
		
		verify(t).set(true, false);

		verify(t).setX(true);
		verify(t).setY(false);
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup2boW#set(TupboR)} adopts the
	 * values from the input tuple and returns the current instance.
	 */
	@Test
	void set_TupleTest()
	{
		Tup2boW t = mock(Tup2boW.class);
		TupboR t2 = mock(TupboR.class);
		
		when(t.set(t2)).thenCallRealMethod();
		
		when(t2.getArray()).thenReturn(new boolean[] {true, false});
		when(t.set(true, false)).thenReturn(t);

		assertSame(t, t.set(t2));
		
		verify(t).set(t2);
		
		verify(t2).getArray();
		verify(t).set(true, false);

		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup2boW#getDimensions()} always
	 * returns 2 and does not do any calls.
	 */
	@Test
	void getDimensionsTest()
	{
		Tup2boW t = mock(Tup2boW.class);
		
		when(t.getDimensions()).thenCallRealMethod();
		
		assertEquals(2, t.getDimensions());
		
		verify(t).getDimensions();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup2boW#setArray(boolean[])} adopts the
	 * values and returns the current instance.
	 */
	@Test
	void setArrayTest()
	{
		Tup2boW t = mock(Tup2boW.class);
		
		when(t.setArray(new boolean[] {true, false})).thenCallRealMethod();
		
		when(t.set(true, false)).thenReturn(t);
		
		assertSame(t, t.setArray(new boolean[] {true, false}));
		
		verify(t).setArray(new boolean[] {true, false});
		
		verify(t).set(true, false);
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup2boW#setByIndex(int, boolean)} adopts the
	 * value to the x component if the index is 0 and returns the current instance.
	 */
	@Test
	void setByIndex_XTest()
	{
		Tup2boW t = mock(Tup2boW.class);
		
		when(t.setByIndex(0, true)).thenCallRealMethod();
		
		when(t.setX(true)).thenReturn(t);
		
		assertSame(t, t.setByIndex(0, true));
		
		verify(t).setByIndex(0, true);
		
		verify(t).setX(true);
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup2boW#setByIndex(int, boolean)} adopts the
	 * value to the y component if the index is 1 and returns the current instance.
	 */
	@Test
	void setByIndex_YTest()
	{
		Tup2boW t = mock(Tup2boW.class);
		
		when(t.setByIndex(1, true)).thenCallRealMethod();
		
		when(t.setY(true)).thenReturn(t);
		
		assertSame(t, t.setByIndex(1, true));
		
		verify(t).setByIndex(1, true);
		
		verify(t).setY(true);
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup2boW#setByIndex(int, boolean)} throws
	 * an {@link IndexOutOfBoundsException} for an index different than 0 or 1.
	 */
	@Test
	void setByIndex_ExceptionTest()
	{
		Tup2boW t = mock(Tup2boW.class);
		
		when(t.setByIndex(2, true)).thenCallRealMethod();

		assertThrows(IndexOutOfBoundsException.class, new Executable() {
			public void execute() throws Throwable
			{
				t.setByIndex(2, true);
			}
		});

		verify(t).setByIndex(2, true);

		verifyNoMoreInteractions(t);
	}
}
