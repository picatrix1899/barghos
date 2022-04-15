package org.barghos.core.test.api.tuple4;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;
import org.barghos.core.api.tuple.TupboC;
import org.barghos.core.api.tuple.TupboR;
import org.barghos.core.api.tuple4.Tup4boC;
import org.barghos.core.api.tuple4.Tup4boR;

/**
 * This class provides comoponent tests for the interface {@link Tup4boC}.
 * 
 * @author picatrix1899
 */
class Tup4boCTest
{
	/**
	 * This test ensures, that the interface extends the interface {@link Tup4boR}.
	 */
	@Test
	void inheritance_Tup4boRTest()
	{
		assertTrue(Tup4boR.class.isAssignableFrom(Tup4boC.class));
	}
	
	/**
	 * This test ensures, that the interface extends the interface {@link TupboC}.
	 */
	@Test
	void inheritance_TupboCTest()
	{
		assertTrue(TupboC.class.isAssignableFrom(Tup4boC.class));
	}
	
	/**
	 * This test ensures, that the function {@link Tup4boC#set(Tup4boR)} adopts the
	 * values from the input tuple and returns the current instance.
	 */
	@Test
	void set_Tuple2Test()
	{
		Tup4boC t = mock(Tup4boC.class);
		Tup4boR t2 = mock(Tup4boR.class);
		
		when(t.set(t2)).thenCallRealMethod();
		
		when(t2.getX()).thenReturn(true);
		when(t2.getY()).thenReturn(false);
		when(t2.getZ()).thenReturn(true);
		when(t2.getW()).thenReturn(false);
		when(t.set(true, false, true, false)).thenReturn(t);
		
		assertSame(t, t.set(t2));
		
		verify(t).set(t2);
		
		verify(t2).getX();
		verify(t2).getY();
		verify(t2).getZ();
		verify(t2).getW();
		verify(t).set(true, false, true, false);
		
		verifyNoMoreInteractions(t, t2);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4boC#set(boolean)} adopts the
	 * value for each component and returns the current instance.
	 */
	@Test
	void set_ValueTest()
	{
		Tup4boC t = mock(Tup4boC.class);
		
		when(t.set(true)).thenCallRealMethod();
		
		when(t.set(true, true, true, true)).thenReturn(t);
		
		assertSame(t, t.set(true));
		
		verify(t).set(true);

		verify(t).set(true, true, true, true);
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4boC#set(boolean, boolean, boolean, boolean)} adopts
	 * the values and returns the current instance.
	 */
	@Test
	void setTest()
	{
		Tup4boC t = mock(Tup4boC.class);
		
		when(t.set(true, false, true, false)).thenCallRealMethod();
		
		when(t.setX(true)).thenReturn(t);
		when(t.setY(false)).thenReturn(t);
		when(t.setZ(true)).thenReturn(t);
		when(t.setW(false)).thenReturn(t);
		
		assertSame(t, t.set(true, false, true, false));
		
		verify(t).set(true, false, true, false);

		verify(t).setX(true);
		verify(t).setY(false);
		verify(t).setZ(true);
		verify(t).setW(false);
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4boC#set(TupboR)} adopts the
	 * values from the input tuple and returns the current instance.
	 */
	@Test
	void set_TupleTest()
	{
		Tup4boC t = mock(Tup4boC.class);
		TupboR t2 = mock(TupboR.class);
		
		when(t.set(t2)).thenCallRealMethod();
		
		when(t2.toArray()).thenReturn(new boolean[] {true, false, true, false});
		when(t.setArray(new boolean[] {true, false, true, false})).thenReturn(t);

		assertSame(t, t.set(t2));
		
		verify(t).set(t2);
		
		verify(t2).toArray();
		verify(t).setArray(new boolean[] {true, false, true, false});

		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4boC#setArray(boolean[])} adopts the
	 * values and returns the current instance.
	 */
	@Test
	void setArrayTest()
	{
		Tup4boC t = mock(Tup4boC.class);
		
		when(t.setArray(new boolean[] {true, false, true, false})).thenCallRealMethod();
		
		when(t.set(true, false, true, false)).thenReturn(t);
		
		assertSame(t, t.setArray(new boolean[] {true, false, true, false}));
		
		verify(t).setArray(new boolean[] {true, false, true, false});
		
		verify(t).set(true, false, true, false);
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4boC#setByIndex(int, boolean)} adopts the
	 * value to the x component if the index is 0 and returns the current instance.
	 */
	@Test
	void setByIndex_XTest()
	{
		Tup4boC t = mock(Tup4boC.class);
		
		when(t.setByIndex(0, true)).thenCallRealMethod();
		
		when(t.setX(true)).thenReturn(t);
		
		assertSame(t, t.setByIndex(0, true));
		
		verify(t).setByIndex(0, true);
		
		verify(t).setX(true);
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4boC#setByIndex(int, boolean)} adopts the
	 * value to the y component if the index is 1 and returns the current instance.
	 */
	@Test
	void setByIndex_YTest()
	{
		Tup4boC t = mock(Tup4boC.class);
		
		when(t.setByIndex(1, true)).thenCallRealMethod();
		
		when(t.setY(true)).thenReturn(t);
		
		assertSame(t, t.setByIndex(1, true));
		
		verify(t).setByIndex(1, true);
		
		verify(t).setY(true);
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4boC#setByIndex(int, boolean)} adopts the
	 * value to the z component if the index is 2 and returns the current instance.
	 */
	@Test
	void setByIndex_ZTest()
	{
		Tup4boC t = mock(Tup4boC.class);
		
		when(t.setByIndex(2, true)).thenCallRealMethod();
		
		when(t.setZ(true)).thenReturn(t);
		
		assertSame(t, t.setByIndex(2, true));
		
		verify(t).setByIndex(2, true);
		
		verify(t).setZ(true);
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4boC#setByIndex(int, boolean)} adopts the
	 * value to the w component if the index is 3 and returns the current instance.
	 */
	@Test
	void setByIndex_WTest()
	{
		Tup4boC t = mock(Tup4boC.class);
		
		when(t.setByIndex(3, true)).thenCallRealMethod();
		
		when(t.setW(true)).thenReturn(t);
		
		assertSame(t, t.setByIndex(3, true));
		
		verify(t).setByIndex(3, true);
		
		verify(t).setW(true);
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4boC#setByIndex(int, boolean)} throws
	 * an {@link IndexOutOfBoundsException} for an index different than 0, 1, 2 or 3.
	 */
	@Test
	void setByIndex_ExceptionTest()
	{
		Tup4boC t = mock(Tup4boC.class);
		
		when(t.setByIndex(4, true)).thenCallRealMethod();

		assertThrows(IndexOutOfBoundsException.class, new Executable() {
			public void execute() throws Throwable
			{
				t.setByIndex(4, true);
			}
		});

		verify(t).setByIndex(4, true);

		verifyNoMoreInteractions(t);
	}
}
