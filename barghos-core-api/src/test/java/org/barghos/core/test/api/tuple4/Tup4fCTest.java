package org.barghos.core.test.api.tuple4;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import org.barghos.core.api.tuple.TupfC;
import org.barghos.core.api.tuple.TupfR;
import org.barghos.core.api.tuple4.Tup4fC;
import org.barghos.core.api.tuple4.Tup4fR;

/**
 * This class provides comoponent tests for the interface {@link Tup4fC}.
 * 
 * @author picatrix1899
 */
class Tup4fCTest
{
	/**
	 * This test ensures, that the interface extends the interface {@link Tup4fR}.
	 */
	@Test
	void inheritance_Tup4fRTest()
	{
		assertTrue(Tup4fR.class.isAssignableFrom(Tup4fC.class));
	}
	
	/**
	 * This test ensures, that the interface extends the interface {@link TupfC}.
	 */
	@Test
	void inheritance_TupfCTest()
	{
		assertTrue(TupfC.class.isAssignableFrom(Tup4fC.class));
	}
	
	/**
	 * This test ensures, that the function {@link Tup4fC#set(Tup4fR)} adopts the
	 * values from the input tuple and returns the current instance.
	 */
	@Test
	void set_Tuple2Test()
	{
		Tup4fC t = mock(Tup4fC.class);
		Tup4fR t2 = mock(Tup4fR.class);
		
		when(t.set(t2)).thenCallRealMethod();
		
		when(t2.getX()).thenReturn(1.0f);
		when(t2.getY()).thenReturn(2.0f);
		when(t2.getZ()).thenReturn(3.0f);
		when(t2.getW()).thenReturn(4.0f);
		when(t.set(1.0f, 2.0f, 3.0f, 4.0f)).thenReturn(t);
		
		assertSame(t, t.set(t2));
		
		verify(t).set(t2);
		
		verify(t2).getX();
		verify(t2).getY();
		verify(t2).getZ();
		verify(t2).getW();
		verify(t).set(1.0f, 2.0f, 3.0f, 4.0f);
		
		verifyNoMoreInteractions(t, t2);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4fC#set(float)} adopts the
	 * value for each component and returns the current instance.
	 */
	@Test
	void set_ValueTest()
	{
		Tup4fC t = mock(Tup4fC.class);
		
		when(t.set(1.0f)).thenCallRealMethod();
		
		when(t.set(1.0f, 1.0f, 1.0f, 1.0f)).thenReturn(t);
		
		assertSame(t, t.set(1.0f));
		
		verify(t).set(1.0f);

		verify(t).set(1.0f, 1.0f, 1.0f, 1.0f);
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4fC#set(float, float, float, float)} adopts
	 * the values and returns the current instance.
	 */
	@Test
	void setTest()
	{
		Tup4fC t = mock(Tup4fC.class);
		
		when(t.set(1.0f, 2.0f, 3.0f, 4.0f)).thenCallRealMethod();
		
		when(t.setX(1.0f)).thenReturn(t);
		when(t.setY(2.0f)).thenReturn(t);
		when(t.setZ(3.0f)).thenReturn(t);
		when(t.setW(4.0f)).thenReturn(t);
		
		assertSame(t, t.set(1.0f, 2.0f, 3.0f, 4.0f));
		
		verify(t).set(1.0f, 2.0f, 3.0f, 4.0f);

		verify(t).setX(1.0f);
		verify(t).setY(2.0f);
		verify(t).setZ(3.0f);
		verify(t).setW(4.0f);
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4fC#set(TupfR)} adopts the
	 * values from the input tuple and returns the current instance.
	 */
	@Test
	void set_TupleTest()
	{
		Tup4fC t = mock(Tup4fC.class);
		TupfR t2 = mock(TupfR.class);
		
		when(t.set(t2)).thenCallRealMethod();
		
		when(t2.toArray()).thenReturn(new float[] {1.0f, 2.0f, 3.0f, 4.0f});
		when(t.setArray(new float[] {1.0f, 2.0f, 3.0f, 4.0f})).thenReturn(t);

		assertSame(t, t.set(t2));
		
		verify(t).set(t2);
		
		verify(t2).toArray();
		verify(t).setArray(new float[] {1.0f, 2.0f, 3.0f, 4.0f});

		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4fC#setArray(float[])} adopts the
	 * values and returns the current instance.
	 */
	@Test
	void setArrayTest()
	{
		Tup4fC t = mock(Tup4fC.class);
		
		when(t.setArray(new float[] {1.0f, 2.0f, 3.0f, 4.0f})).thenCallRealMethod();
		
		when(t.set(1.0f, 2.0f, 3.0f, 4.0f)).thenReturn(t);
		
		assertSame(t, t.setArray(new float[] {1.0f, 2.0f, 3.0f, 4.0f}));
		
		verify(t).setArray(new float[] {1.0f, 2.0f, 3.0f, 4.0f});
		
		verify(t).set(1.0f, 2.0f, 3.0f, 4.0f);
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4fC#setByIndex(int, float)} adopts the
	 * value to the x component if the index is 0 and returns the current instance.
	 */
	@Test
	void setByIndex_XTest()
	{
		Tup4fC t = mock(Tup4fC.class);
		
		when(t.setByIndex(0, 1.0f)).thenCallRealMethod();
		
		when(t.setX(1.0f)).thenReturn(t);
		
		assertSame(t, t.setByIndex(0, 1.0f));
		
		verify(t).setByIndex(0, 1.0f);
		
		verify(t).setX(1.0f);
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4fC#setByIndex(int, float)} adopts the
	 * value to the y component if the index is 1 and returns the current instance.
	 */
	@Test
	void setByIndex_YTest()
	{
		Tup4fC t = mock(Tup4fC.class);
		
		when(t.setByIndex(1, 1.0f)).thenCallRealMethod();
		
		when(t.setY(1.0f)).thenReturn(t);
		
		assertSame(t, t.setByIndex(1, 1.0f));
		
		verify(t).setByIndex(1, 1.0f);
		
		verify(t).setY(1.0f);
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4fC#setByIndex(int, float)} adopts the
	 * value to the z component if the index is 2 and returns the current instance.
	 */
	@Test
	void setByIndex_ZTest()
	{
		Tup4fC t = mock(Tup4fC.class);
		
		when(t.setByIndex(2, 1.0f)).thenCallRealMethod();
		
		when(t.setZ(1.0f)).thenReturn(t);
		
		assertSame(t, t.setByIndex(2, 1.0f));
		
		verify(t).setByIndex(2, 1.0f);
		
		verify(t).setZ(1.0f);
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4fC#setByIndex(int, float)} adopts the
	 * value to the w component if the index is 3 and returns the current instance.
	 */
	@Test
	void setByIndex_WTest()
	{
		Tup4fC t = mock(Tup4fC.class);
		
		when(t.setByIndex(3, 1.0f)).thenCallRealMethod();
		
		when(t.setW(1.0f)).thenReturn(t);
		
		assertSame(t, t.setByIndex(3, 1.0f));
		
		verify(t).setByIndex(3, 1.0f);
		
		verify(t).setW(1.0f);
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4fC#setByIndex(int, float)} throws
	 * an {@link IndexOutOfBoundsException} for an index different than 0, 1, 2 or 3.
	 */
	@Test
	void setByIndex_ExceptionTest()
	{
		Tup4fC t = mock(Tup4fC.class);
		
		when(t.setByIndex(4, 1.0f)).thenCallRealMethod();

		assertThrows(IndexOutOfBoundsException.class, new Executable() {
			public void execute() throws Throwable
			{
				t.setByIndex(4, 1.0f);
			}
		});

		verify(t).setByIndex(4, 1.0f);

		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4fC#shallowClone()} calls
	 * by default the standard {@link Tup4fC#clone()}-function.
	 */
	@Test
	void shallowCloneTest()
	{
		Tup4fC t = mock(Tup4fC.class);
		Tup4fC res = mock(Tup4fC.class);
		
		when(t.shallowClone()).thenCallRealMethod();
		when(t.clone()).thenReturn(res);
		
		assertSame(res, t.shallowClone());
		
		verify(t).shallowClone();
		verify(t).clone();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4fC#deepClone()} calls
	 * by default the standard {@link Tup4fC#clone()}-function.
	 */
	@Test
	void deepCloneTest()
	{
		Tup4fC t = mock(Tup4fC.class);
		Tup4fC res = mock(Tup4fC.class);

		when(t.deepClone()).thenCallRealMethod();
		when(t.clone()).thenReturn(res);
		
		assertSame(res, t.deepClone());
		
		verify(t).deepClone();
		verify(t).clone();
		
		verifyNoMoreInteractions(t);
	}
}
