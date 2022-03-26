package org.barghos.core.test.api.tuple3;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;
import org.barghos.core.api.tuple.TupboBase;
import org.barghos.core.api.tuple.TupboR;
import org.barghos.core.api.tuple3.Tup3boBase;
import org.barghos.core.api.tuple3.Tup3boR;

/**
 * This class provides comoponent tests for the interface {@link Tup3boBase}.
 * 
 * @author picatrix1899
 */
class Tup3boBaseTest
{
	/**
	 * This test ensures, that the interface extends the interface {@link Tup3boR}.
	 */
	@Test
	void inheritance_Tup3boRTest()
	{
		assertTrue(Tup3boR.class.isAssignableFrom(Tup3boBase.class));
	}
	
	/**
	 * This test ensures, that the interface extends the interface {@link Tup3boBase}.
	 */
	@Test
	void inheritance_TupboBaseTest()
	{
		assertTrue(TupboBase.class.isAssignableFrom(Tup3boBase.class));
	}

	/**
	 * This test ensures, that the function {@link Tup3boBase#set(Tup3boR)} adopts the
	 * values from the input tuple and returns the current instance.
	 */
	@Test
	void set_Tuple2Test()
	{
		Tup3boBase t = mock(Tup3boBase.class);
		Tup3boR t2 = mock(Tup3boR.class);
		
		when(t.set(t2)).thenCallRealMethod();
		
		when(t2.getX()).thenReturn(true);
		when(t2.getY()).thenReturn(false);
		when(t2.getZ()).thenReturn(true);
		when(t.set(true, false, true)).thenReturn(t);
		
		assertSame(t, t.set(t2));
		
		verify(t).set(t2);
		
		verify(t2).getX();
		verify(t2).getY();
		verify(t2).getZ();
		verify(t).set(true, false, true);
		
		verifyNoMoreInteractions(t, t2);
	}
	
	/**
	 * This test ensures, that the function {@link Tup3boBase#set(boolean)} adopts the
	 * value for each component and returns the current instance.
	 */
	@Test
	void set_ValueTest()
	{
		Tup3boBase t = mock(Tup3boBase.class);
		
		when(t.set(true)).thenCallRealMethod();
		
		when(t.set(true, true, true)).thenReturn(t);
		
		assertSame(t, t.set(true));
		
		verify(t).set(true);

		verify(t).set(true, true, true);
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup3boBase#set(boolean, boolean, boolean)} adopts
	 * the values and returns the current instance.
	 */
	@Test
	void setTest()
	{
		Tup3boBase t = mock(Tup3boBase.class);
		
		when(t.set(true, false, true)).thenCallRealMethod();
		
		when(t.setX(true)).thenReturn(t);
		when(t.setY(false)).thenReturn(t);
		when(t.setZ(true)).thenReturn(t);
		
		assertSame(t, t.set(true, false, true));
		
		verify(t).set(true, false, true);

		verify(t).setX(true);
		verify(t).setY(false);
		verify(t).setZ(true);
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup3boBase#set(TupboR)} adopts the
	 * values from the input tuple and returns the current instance.
	 */
	@Test
	void set_TupleTest()
	{
		Tup3boBase t = mock(Tup3boBase.class);
		TupboR t2 = mock(TupboR.class);
		
		when(t.set(t2)).thenCallRealMethod();
		
		when(t2.getArray()).thenReturn(new boolean[] {true, false, true});
		when(t.set(true, false, true)).thenReturn(t);

		assertSame(t, t.set(t2));
		
		verify(t).set(t2);
		
		verify(t2).getArray();
		verify(t).set(true, false, true);

		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup3boBase#setArray(boolean[])} adopts the
	 * values and returns the current instance.
	 */
	@Test
	void setArrayTest()
	{
		Tup3boBase t = mock(Tup3boBase.class);
		
		when(t.setArray(new boolean[] {true, false, true})).thenCallRealMethod();
		
		when(t.set(true, false, true)).thenReturn(t);
		
		assertSame(t, t.setArray(new boolean[] {true, false, true}));
		
		verify(t).setArray(new boolean[] {true, false, true});
		
		verify(t).set(true, false, true);
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup3boBase#setByIndex(int, boolean)} adopts the
	 * value to the x component if the index is 0 and returns the current instance.
	 */
	@Test
	void setByIndex_XTest()
	{
		Tup3boBase t = mock(Tup3boBase.class);
		
		when(t.setByIndex(0, true)).thenCallRealMethod();
		
		when(t.setX(true)).thenReturn(t);
		
		assertSame(t, t.setByIndex(0, true));
		
		verify(t).setByIndex(0, true);
		
		verify(t).setX(true);
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup3boBase#setByIndex(int, boolean)} adopts the
	 * value to the y component if the index is 1 and returns the current instance.
	 */
	@Test
	void setByIndex_YTest()
	{
		Tup3boBase t = mock(Tup3boBase.class);
		
		when(t.setByIndex(1, true)).thenCallRealMethod();
		
		when(t.setY(true)).thenReturn(t);
		
		assertSame(t, t.setByIndex(1, true));
		
		verify(t).setByIndex(1, true);
		
		verify(t).setY(true);
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup3boBase#setByIndex(int, boolean)} adopts the
	 * value to the z component if the index is 2 and returns the current instance.
	 */
	@Test
	void setByIndex_ZTest()
	{
		Tup3boBase t = mock(Tup3boBase.class);
		
		when(t.setByIndex(2, true)).thenCallRealMethod();
		
		when(t.setZ(true)).thenReturn(t);
		
		assertSame(t, t.setByIndex(2, true));
		
		verify(t).setByIndex(2, true);
		
		verify(t).setZ(true);
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup3boBase#setByIndex(int, boolean)} throws
	 * an {@link IndexOutOfBoundsException} for an index different than 0, 1 or 2.
	 */
	@Test
	void setByIndex_ExceptionTest()
	{
		Tup3boBase t = mock(Tup3boBase.class);
		
		when(t.setByIndex(3, true)).thenCallRealMethod();

		assertThrows(IndexOutOfBoundsException.class, new Executable() {
			public void execute() throws Throwable
			{
				t.setByIndex(3, true);
			}
		});

		verify(t).setByIndex(3, true);

		verifyNoMoreInteractions(t);
	}
}