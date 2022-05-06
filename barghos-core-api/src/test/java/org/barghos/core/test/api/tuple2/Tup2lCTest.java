package org.barghos.core.test.api.tuple2;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import org.barghos.core.api.tuple.TuplC;
import org.barghos.core.api.tuple.TuplR;
import org.barghos.core.api.tuple2.Tup2lC;
import org.barghos.core.api.tuple2.Tup2lR;

/**
 * This class provides comoponent tests for the interface {@link Tup2lC}.
 * 
 * @author picatrix1899
 */
class Tup2lCTest
{
	/**
	 * This test ensures, that the interface extends the interface {@link Tup2lR}.
	 */
	@Test
	void inheritance_Tup2lRTest()
	{
		assertTrue(Tup2lR.class.isAssignableFrom(Tup2lC.class));
	}
	
	/**
	 * This test ensures, that the interface extends the interface {@link TuplC}.
	 */
	@Test
	void inheritance_TuplCTest()
	{
		assertTrue(TuplC.class.isAssignableFrom(Tup2lC.class));
	}
	
	/**
	 * This test ensures, that the function {@link Tup2lC#set(Tup2lR)} adopts the
	 * values from the input tuple and returns the current instance.
	 */
	@Test
	void set_Tuple2Test()
	{
		Tup2lC t = mock(Tup2lC.class);
		Tup2lR t2 = mock(Tup2lR.class);
		
		when(t.set(t2)).thenCallRealMethod();
		
		when(t2.getX()).thenReturn(1l);
		when(t2.getY()).thenReturn(2l);
		when(t.set(1l, 2l)).thenReturn(t);
		
		assertSame(t, t.set(t2));
		
		verify(t).set(t2);
		
		verify(t2).getX();
		verify(t2).getY();
		verify(t).set(1l, 2l);
		
		verifyNoMoreInteractions(t, t2);
	}
	
	/**
	 * This test ensures, that the function {@link Tup2lC#set(long)} adopts the
	 * value for each component and returns the current instance.
	 */
	@Test
	void set_ValueTest()
	{
		Tup2lC t = mock(Tup2lC.class);
		
		when(t.set(1l)).thenCallRealMethod();
		
		when(t.set(1l, 1l)).thenReturn(t);
		
		assertSame(t, t.set(1l));
		
		verify(t).set(1l);

		verify(t).set(1l, 1l);
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup2lC#set(long, long)} adopts
	 * the values and returns the current instance.
	 */
	@Test
	void setTest()
	{
		Tup2lC t = mock(Tup2lC.class);
		
		when(t.set(1l, 2l)).thenCallRealMethod();
		
		when(t.setX(1l)).thenReturn(t);
		when(t.setY(2l)).thenReturn(t);
		
		assertSame(t, t.set(1l, 2l));
		
		verify(t).set(1l, 2l);

		verify(t).setX(1l);
		verify(t).setY(2l);
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup2lC#set(TuplR)} adopts the
	 * values from the input tuple and returns the current instance.
	 */
	@Test
	void set_TupleTest()
	{
		Tup2lC t = mock(Tup2lC.class);
		TuplR t2 = mock(TuplR.class);
		
		when(t.set(t2)).thenCallRealMethod();
		
		when(t2.toArray()).thenReturn(new long[] {1l, 2l});
		when(t.setArray(new long[] {1l, 2l})).thenReturn(t);

		assertSame(t, t.set(t2));
		
		verify(t).set(t2);
		
		verify(t2).toArray();
		verify(t).setArray(new long[] {1l, 2l});

		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup2lC#setByIndex(int, long)} adopts the
	 * value to the x component if the index is 0 and returns the current instance.
	 */
	@Test
	void setByIndex_XTest()
	{
		Tup2lC t = mock(Tup2lC.class);
		
		when(t.setByIndex(0, 1l)).thenCallRealMethod();
		
		when(t.setX(1l)).thenReturn(t);
		
		assertSame(t, t.setByIndex(0, 1l));
		
		verify(t).setByIndex(0, 1l);
		
		verify(t).setX(1l);
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup2lC#setByIndex(int, long)} adopts the
	 * value to the y component if the index is 1 and returns the current instance.
	 */
	@Test
	void setByIndex_YTest()
	{
		Tup2lC t = mock(Tup2lC.class);
		
		when(t.setByIndex(1, 1l)).thenCallRealMethod();
		
		when(t.setY(1l)).thenReturn(t);
		
		assertSame(t, t.setByIndex(1, 1l));
		
		verify(t).setByIndex(1, 1l);
		
		verify(t).setY(1l);
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup2lC#setByIndex(int, long)} throws
	 * an {@link IndexOutOfBoundsException} for an index different than 0 or 1.
	 */
	@Test
	void setByIndex_ExceptionTest()
	{
		Tup2lC t = mock(Tup2lC.class);
		
		when(t.setByIndex(2, 1l)).thenCallRealMethod();

		assertThrows(IndexOutOfBoundsException.class, new Executable() {
			public void execute() throws Throwable
			{
				t.setByIndex(2, 1l);
			}
		});

		verify(t).setByIndex(2, 1l);

		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup2lC#shallowClone()} calls
	 * by default the standard {@link Tup2lC#clone()}-function.
	 */
	@Test
	void shallowCloneTest()
	{
		Tup2lC t = mock(Tup2lC.class);
		Tup2lC res = mock(Tup2lC.class);
		
		when(t.shallowClone()).thenCallRealMethod();
		when(t.clone()).thenReturn(res);
		
		assertSame(res, t.shallowClone());
		
		verify(t).shallowClone();
		verify(t).clone();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup2lC#deepClone()} calls
	 * by default the standard {@link Tup2lC#clone()}-function.
	 */
	@Test
	void deepCloneTest()
	{
		Tup2lC t = mock(Tup2lC.class);
		Tup2lC res = mock(Tup2lC.class);

		when(t.deepClone()).thenCallRealMethod();
		when(t.clone()).thenReturn(res);
		
		assertSame(res, t.deepClone());
		
		verify(t).deepClone();
		verify(t).clone();
		
		verifyNoMoreInteractions(t);
	}
}
