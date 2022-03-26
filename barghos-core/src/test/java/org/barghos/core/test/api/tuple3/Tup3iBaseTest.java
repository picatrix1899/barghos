package org.barghos.core.test.api.tuple3;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;
import org.barghos.core.api.tuple.TupiBase;
import org.barghos.core.api.tuple.TupiR;
import org.barghos.core.api.tuple3.Tup3iBase;
import org.barghos.core.api.tuple3.Tup3iR;

/**
 * This class provides comoponent tests for the interface {@link Tup3iBase}.
 * 
 * @author picatrix1899
 */
class Tup3iBaseTest
{
	/**
	 * This test ensures, that the interface extends the interface {@link Tup3iR}.
	 */
	@Test
	void inheritance_Tup3iRTest()
	{
		assertTrue(Tup3iR.class.isAssignableFrom(Tup3iBase.class));
	}
	
	/**
	 * This test ensures, that the interface extends the interface {@link TupiBase}.
	 */
	@Test
	void inheritance_TupiBaseTest()
	{
		assertTrue(TupiBase.class.isAssignableFrom(Tup3iBase.class));
	}
	
	/**
	 * This test ensures, that the function {@link Tup3iBase#set(Tup3iR)} adopts the
	 * values from the input tuple and returns the current instance.
	 */
	@Test
	void set_Tuple2Test()
	{
		Tup3iBase t = mock(Tup3iBase.class);
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
	 * This test ensures, that the function {@link Tup3iBase#set(int)} adopts the
	 * value for each component and returns the current instance.
	 */
	@Test
	void set_ValueTest()
	{
		Tup3iBase t = mock(Tup3iBase.class);
		
		when(t.set(1)).thenCallRealMethod();
		
		when(t.set(1, 1, 1)).thenReturn(t);
		
		assertSame(t, t.set(1));
		
		verify(t).set(1);

		verify(t).set(1, 1, 1);
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup3iBase#set(int, int, int)} adopts
	 * the values and returns the current instance.
	 */
	@Test
	void setTest()
	{
		Tup3iBase t = mock(Tup3iBase.class);
		
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
	 * This test ensures, that the function {@link Tup3iBase#set(TupiR)} adopts the
	 * values from the input tuple and returns the current instance.
	 */
	@Test
	void set_TupleTest()
	{
		Tup3iBase t = mock(Tup3iBase.class);
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
	 * This test ensures, that the function {@link Tup3iBase#setArray(int[])} adopts the
	 * values and returns the current instance.
	 */
	@Test
	void setArrayTest()
	{
		Tup3iBase t = mock(Tup3iBase.class);
		
		when(t.setArray(new int[] {1, 2, 3})).thenCallRealMethod();
		
		when(t.set(1, 2, 3)).thenReturn(t);
		
		assertSame(t, t.setArray(new int[] {1, 2, 3}));
		
		verify(t).setArray(new int[] {1, 2, 3});
		
		verify(t).set(1, 2, 3);
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup3iBase#setByIndex(int, int)} adopts the
	 * value to the x component if the index is 0 and returns the current instance.
	 */
	@Test
	void setByIndex_XTest()
	{
		Tup3iBase t = mock(Tup3iBase.class);
		
		when(t.setByIndex(0, 1)).thenCallRealMethod();
		
		when(t.setX(1)).thenReturn(t);
		
		assertSame(t, t.setByIndex(0, 1));
		
		verify(t).setByIndex(0, 1);
		
		verify(t).setX(1);
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup3iBase#setByIndex(int, int)} adopts the
	 * value to the y component if the index is 1 and returns the current instance.
	 */
	@Test
	void setByIndex_YTest()
	{
		Tup3iBase t = mock(Tup3iBase.class);
		
		when(t.setByIndex(1, 1)).thenCallRealMethod();
		
		when(t.setY(1)).thenReturn(t);
		
		assertSame(t, t.setByIndex(1, 1));
		
		verify(t).setByIndex(1, 1);
		
		verify(t).setY(1);
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup3iBase#setByIndex(int, int)} adopts the
	 * value to the z component if the index is 2 and returns the current instance.
	 */
	@Test
	void setByIndex_ZTest()
	{
		Tup3iBase t = mock(Tup3iBase.class);
		
		when(t.setByIndex(2, 1)).thenCallRealMethod();
		
		when(t.setZ(1)).thenReturn(t);
		
		assertSame(t, t.setByIndex(2, 1));
		
		verify(t).setByIndex(2, 1);
		
		verify(t).setZ(1);
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup3iBase#setByIndex(int, int)} throws
	 * an {@link IndexOutOfBoundsException} for an index different than 0, 1 or 2.
	 */
	@Test
	void setByIndex_ExceptionTest()
	{
		Tup3iBase t = mock(Tup3iBase.class);
		
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