package org.barghos.core.test.api.tuple3;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import org.barghos.core.api.tuple.TuplC;
import org.barghos.core.api.tuple.TuplR;
import org.barghos.core.api.tuple3.Tup3lC;
import org.barghos.core.api.tuple3.Tup3lR;

/**
 * This class provides comoponent tests for the interface {@link Tup3lC}.
 * 
 * @author picatrix1899
 */
class Tup3lCTest
{
	/**
	 * This test ensures, that the interface extends the interface {@link Tup3lR}.
	 */
	@Test
	void inheritance_Tup3lRTest()
	{
		assertTrue(Tup3lR.class.isAssignableFrom(Tup3lC.class));
	}

	/**
	 * This test ensures, that the interface extends the interface {@link TuplC}.
	 */
	@Test
	void inheritance_TuplCTest()
	{
		assertTrue(TuplC.class.isAssignableFrom(Tup3lC.class));
	}
	
	/**
	 * This test ensures, that the function {@link Tup3lC#set(Tup3lR)} adopts the
	 * values from the input tuple and returns the current instance.
	 */
	@Test
	void set_Tuple2Test()
	{
		Tup3lC t = mock(Tup3lC.class);
		Tup3lR t2 = mock(Tup3lR.class);
		
		when(t.set(t2)).thenCallRealMethod();
		
		when(t2.getX()).thenReturn(1l);
		when(t2.getY()).thenReturn(2l);
		when(t2.getZ()).thenReturn(3l);
		when(t.set(1l, 2l, 3l)).thenReturn(t);
		
		assertSame(t, t.set(t2));
		
		verify(t).set(t2);
		
		verify(t2).getX();
		verify(t2).getY();
		verify(t2).getZ();
		verify(t).set(1l, 2l, 3l);
		
		verifyNoMoreInteractions(t, t2);
	}
	
	/**
	 * This test ensures, that the function {@link Tup3lC#set(long)} adopts the
	 * value for each component and returns the current instance.
	 */
	@Test
	void set_ValueTest()
	{
		Tup3lC t = mock(Tup3lC.class);
		
		when(t.set(1l)).thenCallRealMethod();
		
		when(t.set(1l, 1l, 1l)).thenReturn(t);
		
		assertSame(t, t.set(1l));
		
		verify(t).set(1l);

		verify(t).set(1l, 1l, 1l);
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup3lC#set(long, long, long)} adopts
	 * the values and returns the current instance.
	 */
	@Test
	void setTest()
	{
		Tup3lC t = mock(Tup3lC.class);
		
		when(t.set(1l, 2l, 3l)).thenCallRealMethod();
		
		when(t.setX(1l)).thenReturn(t);
		when(t.setY(2l)).thenReturn(t);
		when(t.setZ(3l)).thenReturn(t);
		
		assertSame(t, t.set(1l, 2l, 3l));
		
		verify(t).set(1l, 2l, 3l);

		verify(t).setX(1l);
		verify(t).setY(2l);
		verify(t).setZ(3l);
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup3lC#set(TuplR)} adopts the
	 * values from the input tuple and returns the current instance.
	 */
	@Test
	void set_TupleTest()
	{
		Tup3lC t = mock(Tup3lC.class);
		TuplR t2 = mock(TuplR.class);
		
		when(t.set(t2)).thenCallRealMethod();
		
		when(t2.toArray()).thenReturn(new long[] {1l, 2l, 3l});
		when(t.setArray(new long[] {1l, 2l, 3l})).thenReturn(t);

		assertSame(t, t.set(t2));
		
		verify(t).set(t2);
		
		verify(t2).toArray();
		verify(t).setArray(new long[] {1l, 2l, 3l});

		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup3lC#setArray(long[])} adopts the
	 * values and returns the current instance.
	 */
	@Test
	void setArrayTest()
	{
		Tup3lC t = mock(Tup3lC.class);
		
		when(t.setArray(new long[] {1l, 2l, 3l})).thenCallRealMethod();
		
		when(t.set(1l, 2l, 3l)).thenReturn(t);
		
		assertSame(t, t.setArray(new long[] {1l, 2l, 3l}));
		
		verify(t).setArray(new long[] {1l, 2l, 3l});
		
		verify(t).set(1l, 2l, 3l);
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup3lC#setByIndex(int, long)} adopts the
	 * value to the x component if the index is 0 and returns the current instance.
	 */
	@Test
	void setByIndex_XTest()
	{
		Tup3lC t = mock(Tup3lC.class);
		
		when(t.setByIndex(0, 1l)).thenCallRealMethod();
		
		when(t.setX(1l)).thenReturn(t);
		
		assertSame(t, t.setByIndex(0, 1l));
		
		verify(t).setByIndex(0, 1l);
		
		verify(t).setX(1l);
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup3lC#setByIndex(int, long)} adopts the
	 * value to the y component if the index is 1 and returns the current instance.
	 */
	@Test
	void setByIndex_YTest()
	{
		Tup3lC t = mock(Tup3lC.class);
		
		when(t.setByIndex(1, 1l)).thenCallRealMethod();
		
		when(t.setY(1l)).thenReturn(t);
		
		assertSame(t, t.setByIndex(1, 1l));
		
		verify(t).setByIndex(1, 1l);
		
		verify(t).setY(1l);
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup3lC#setByIndex(int, long)} adopts the
	 * value to the z component if the index is 2 and returns the current instance.
	 */
	@Test
	void setByIndex_ZTest()
	{
		Tup3lC t = mock(Tup3lC.class);
		
		when(t.setByIndex(2, 1l)).thenCallRealMethod();
		
		when(t.setZ(1l)).thenReturn(t);
		
		assertSame(t, t.setByIndex(2, 1l));
		
		verify(t).setByIndex(2, 1l);
		
		verify(t).setZ(1l);
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup3lC#setByIndex(int, long)} throws
	 * an {@link IndexOutOfBoundsException} for an index different than 0, 1 or 2.
	 */
	@Test
	void setByIndex_ExceptionTest()
	{
		Tup3lC t = mock(Tup3lC.class);
		
		when(t.setByIndex(3, 1l)).thenCallRealMethod();

		assertThrows(IndexOutOfBoundsException.class, new Executable() {
			public void execute() throws Throwable
			{
				t.setByIndex(3, 1l);
			}
		});

		verify(t).setByIndex(3, 1l);

		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup3lC#shallowClone()} calls
	 * by default the standard {@link Tup3lC#clone()}-function.
	 */
	@Test
	void shallowCloneTest()
	{
		Tup3lC t = mock(Tup3lC.class);
		Tup3lC res = mock(Tup3lC.class);
		
		when(t.shallowClone()).thenCallRealMethod();
		when(t.clone()).thenReturn(res);
		
		assertSame(res, t.shallowClone());
		
		verify(t).shallowClone();
		verify(t).clone();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup3lC#deepClone()} calls
	 * by default the standard {@link Tup3lC#clone()}-function.
	 */
	@Test
	void deepCloneTest()
	{
		Tup3lC t = mock(Tup3lC.class);
		Tup3lC res = mock(Tup3lC.class);

		when(t.deepClone()).thenCallRealMethod();
		when(t.clone()).thenReturn(res);
		
		assertSame(res, t.deepClone());
		
		verify(t).deepClone();
		verify(t).clone();
		
		verifyNoMoreInteractions(t);
	}
}