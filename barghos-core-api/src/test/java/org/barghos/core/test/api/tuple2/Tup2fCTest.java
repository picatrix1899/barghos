package org.barghos.core.test.api.tuple2;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import org.barghos.core.api.tuple.TupfC;
import org.barghos.core.api.tuple.TupfR;
import org.barghos.core.api.tuple2.Tup2fC;
import org.barghos.core.api.tuple2.Tup2fR;

/**
 * This class provides comoponent tests for the interface {@link Tup2fC}.
 * 
 * @author picatrix1899
 */
class Tup2fCTest
{
	/**
	 * This test ensures, that the interface extends the interface {@link Tup2fR}.
	 */
	@Test
	void inheritance_Tup2fRTest()
	{
		assertTrue(Tup2fR.class.isAssignableFrom(Tup2fC.class));
	}
	
	/**
	 * This test ensures, that the interface extends the interface {@link TupfC}.
	 */
	@Test
	void inheritance_TupfCTest()
	{
		assertTrue(TupfC.class.isAssignableFrom(Tup2fC.class));
	}
	
	/**
	 * This test ensures, that the function {@link Tup2fC#set(Tup2fR)} adopts the
	 * values from the input tuple and returns the current instance.
	 */
	@Test
	void set_Tuple2Test()
	{
		Tup2fC t = mock(Tup2fC.class);
		Tup2fR t2 = mock(Tup2fR.class);
		
		when(t.set(t2)).thenCallRealMethod();
		
		when(t2.getX()).thenReturn(1.0f);
		when(t2.getY()).thenReturn(2.0f);
		when(t.set(1.0f, 2.0f)).thenReturn(t);
		
		assertSame(t, t.set(t2));
		
		verify(t).set(t2);
		
		verify(t2).getX();
		verify(t2).getY();
		verify(t).set(1.0f, 2.0f);
		
		verifyNoMoreInteractions(t, t2);
	}
	
	/**
	 * This test ensures, that the function {@link Tup2fC#set(float)} adopts the
	 * value for each component and returns the current instance.
	 */
	@Test
	void set_ValueTest()
	{
		Tup2fC t = mock(Tup2fC.class);
		
		when(t.set(1.0f)).thenCallRealMethod();
		
		when(t.set(1.0f, 1.0f)).thenReturn(t);
		
		assertSame(t, t.set(1.0f));
		
		verify(t).set(1.0f);

		verify(t).set(1.0f, 1.0f);
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup2fC#set(float, float)} adopts
	 * the values and returns the current instance.
	 */
	@Test
	void setTest()
	{
		Tup2fC t = mock(Tup2fC.class);
		
		when(t.set(1.0f, 2.0f)).thenCallRealMethod();
		
		when(t.setX(1.0f)).thenReturn(t);
		when(t.setY(2.0f)).thenReturn(t);
		
		assertSame(t, t.set(1.0f, 2.0f));
		
		verify(t).set(1.0f, 2.0f);

		verify(t).setX(1.0f);
		verify(t).setY(2.0f);
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup2fC#set(TupfR)} adopts the
	 * values from the input tuple and returns the current instance.
	 */
	@Test
	void set_TupleTest()
	{
		Tup2fC t = mock(Tup2fC.class);
		TupfR t2 = mock(TupfR.class);
		
		when(t.set(t2)).thenCallRealMethod();
		
		when(t2.toArray()).thenReturn(new float[] {1.0f, 2.0f});
		when(t.setArray(new float[] {1.0f, 2.0f})).thenReturn(t);

		assertSame(t, t.set(t2));
		
		verify(t).set(t2);
		
		verify(t2).toArray();
		verify(t).setArray(new float[] {1.0f, 2.0f});

		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup2fC#setByIndex(int, float)} adopts the
	 * value to the x component if the index is 0 and returns the current instance.
	 */
	@Test
	void setByIndex_XTest()
	{
		Tup2fC t = mock(Tup2fC.class);
		
		when(t.setByIndex(0, 1.0f)).thenCallRealMethod();
		
		when(t.setX(1.0f)).thenReturn(t);
		
		assertSame(t, t.setByIndex(0, 1.0f));
		
		verify(t).setByIndex(0, 1.0f);
		
		verify(t).setX(1.0f);
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup2fC#setByIndex(int, float)} adopts the
	 * value to the y component if the index is 1 and returns the current instance.
	 */
	@Test
	void setByIndex_YTest()
	{
		Tup2fC t = mock(Tup2fC.class);
		
		when(t.setByIndex(1, 1.0f)).thenCallRealMethod();
		
		when(t.setY(1.0f)).thenReturn(t);
		
		assertSame(t, t.setByIndex(1, 1.0f));
		
		verify(t).setByIndex(1, 1.0f);
		
		verify(t).setY(1.0f);
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup2fC#setByIndex(int, float)} throws
	 * an {@link IndexOutOfBoundsException} for an index different than 0 or 1.
	 */
	@Test
	void setByIndex_ExceptionTest()
	{
		Tup2fC t = mock(Tup2fC.class);
		
		when(t.setByIndex(2, 1.0f)).thenCallRealMethod();

		assertThrows(IndexOutOfBoundsException.class, new Executable() {
			public void execute() throws Throwable
			{
				t.setByIndex(2, 1.0f);
			}
		});

		verify(t).setByIndex(2, 1.0f);

		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup2fC#shallowClone()} calls
	 * by default the standard {@link Tup2fC#clone()}-function.
	 */
	@Test
	void shallowCloneTest()
	{
		Tup2fC t = mock(Tup2fC.class);
		Tup2fC res = mock(Tup2fC.class);
		
		when(t.shallowClone()).thenCallRealMethod();
		when(t.clone()).thenReturn(res);
		
		assertSame(res, t.shallowClone());
		
		verify(t).shallowClone();
		verify(t).clone();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup2fC#deepClone()} calls
	 * by default the standard {@link Tup2fC#clone()}-function.
	 */
	@Test
	void deepCloneTest()
	{
		Tup2fC t = mock(Tup2fC.class);
		Tup2fC res = mock(Tup2fC.class);

		when(t.deepClone()).thenCallRealMethod();
		when(t.clone()).thenReturn(res);
		
		assertSame(res, t.deepClone());
		
		verify(t).deepClone();
		verify(t).clone();
		
		verifyNoMoreInteractions(t);
	}
}