package org.barghos.core.test.api.tuple3;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import org.barghos.core.api.tuple.TupfR;
import org.barghos.core.api.tuple.TupfW;
import org.barghos.core.api.tuple3.Tup3fR;
import org.barghos.core.api.tuple3.Tup3fW;

/**
 * This class provides component tests for the interface {@link Tup3fW}.
 * 
 * @author picatrix1899
 */
class Tup3fWTest
{
	/**
	 * This test ensures, that the interface extends the interface {@link TupfW}.
	 */
	@Test
	void inheritance_TupfWTest()
	{
		assertTrue(TupfW.class.isAssignableFrom(Tup3fW.class));
	}
	
	/**
	 * This test ensures, that the function {@link Tup3fW#set(Tup3fR)} adopts the
	 * values from the input tuple and returns the current instance.
	 */
	@Test
	void set_Tuple2Test()
	{
		Tup3fW t = mock(Tup3fW.class);
		Tup3fR t2 = mock(Tup3fR.class);
		
		when(t.set(t2)).thenCallRealMethod();
		
		when(t2.getX()).thenReturn(1.0f);
		when(t2.getY()).thenReturn(2.0f);
		when(t2.getZ()).thenReturn(3.0f);
		when(t.set(1.0f, 2.0f, 3.0f)).thenReturn(t);
		
		assertSame(t, t.set(t2));
		
		verify(t).set(t2);
		
		verify(t2).getX();
		verify(t2).getY();
		verify(t2).getZ();
		verify(t).set(1.0f, 2.0f, 3.0f);
		
		verifyNoMoreInteractions(t, t2);
	}
	
	/**
	 * This test ensures, that the function {@link Tup3fW#set(float)} adopts the
	 * value for each component and returns the current instance.
	 */
	@Test
	void set_ValueTest()
	{
		Tup3fW t = mock(Tup3fW.class);
		
		when(t.set(1.0f)).thenCallRealMethod();
		
		when(t.set(1.0f, 1.0f, 1.0f)).thenReturn(t);
		
		assertSame(t, t.set(1.0f));
		
		verify(t).set(1.0f);

		verify(t).set(1.0f, 1.0f, 1.0f);
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup3fW#set(float, float, float)} adopts
	 * the values and returns the current instance.
	 */
	@Test
	void setTest()
	{
		Tup3fW t = mock(Tup3fW.class);
		
		when(t.set(1.0f, 2.0f, 3.0f)).thenCallRealMethod();
		
		when(t.setX(1.0f)).thenReturn(t);
		when(t.setY(2.0f)).thenReturn(t);
		when(t.setZ(3.0f)).thenReturn(t);
		
		assertSame(t, t.set(1.0f, 2.0f, 3.0f));
		
		verify(t).set(1.0f, 2.0f, 3.0f);

		verify(t).setX(1.0f);
		verify(t).setY(2.0f);
		verify(t).setZ(3.0f);
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup3fW#set(TupfR)} adopts the
	 * values from the input tuple and returns the current instance.
	 */
	@Test
	void set_TupleTest()
	{
		Tup3fW t = mock(Tup3fW.class);
		TupfR t2 = mock(TupfR.class);
		
		when(t.set(t2)).thenCallRealMethod();
		
		when(t2.getArray()).thenReturn(new float[] {1.0f, 2.0f, 3.0f});
		when(t.set(1.0f, 2.0f, 3.0f)).thenReturn(t);

		assertSame(t, t.set(t2));
		
		verify(t).set(t2);
		
		verify(t2).getArray();
		verify(t).set(1.0f, 2.0f, 3.0f);

		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup3fW#getDimensions()} always
	 * returns 3 and does not do any calls.
	 */
	@Test
	void getDimensionsTest()
	{
		Tup3fW t = mock(Tup3fW.class);
		
		when(t.getDimensions()).thenCallRealMethod();
		
		assertEquals(3, t.getDimensions());
		
		verify(t).getDimensions();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup3fW#setArray(float[])} adopts the
	 * values and returns the current instance.
	 */
	@Test
	void setArrayTest()
	{
		Tup3fW t = mock(Tup3fW.class);
		
		when(t.setArray(new float[] {1.0f, 2.0f, 3.0f})).thenCallRealMethod();
		
		when(t.set(1.0f, 2.0f, 3.0f)).thenReturn(t);
		
		assertSame(t, t.setArray(new float[] {1.0f, 2.0f, 3.0f}));
		
		verify(t).setArray(new float[] {1.0f, 2.0f, 3.0f});
		
		verify(t).set(1.0f, 2.0f, 3.0f);
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup3fW#setByIndex(int, float)} adopts the
	 * value to the x component if the index is 0 and returns the current instance.
	 */
	@Test
	void setByIndex_XTest()
	{
		Tup3fW t = mock(Tup3fW.class);
		
		when(t.setByIndex(0, 1.0f)).thenCallRealMethod();
		
		when(t.setX(1.0f)).thenReturn(t);
		
		assertSame(t, t.setByIndex(0, 1.0f));
		
		verify(t).setByIndex(0, 1.0f);
		
		verify(t).setX(1.0f);
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup3fW#setByIndex(int, float)} adopts the
	 * value to the y component if the index is 1 and returns the current instance.
	 */
	@Test
	void setByIndex_YTest()
	{
		Tup3fW t = mock(Tup3fW.class);
		
		when(t.setByIndex(1, 1.0f)).thenCallRealMethod();
		
		when(t.setY(1.0f)).thenReturn(t);
		
		assertSame(t, t.setByIndex(1, 1.0f));
		
		verify(t).setByIndex(1, 1.0f);
		
		verify(t).setY(1.0f);
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup3fW#setByIndex(int, float)} adopts the
	 * value to the z component if the index is 2 and returns the current instance.
	 */
	@Test
	void setByIndex_ZTest()
	{
		Tup3fW t = mock(Tup3fW.class);
		
		when(t.setByIndex(2, 1.0f)).thenCallRealMethod();
		
		when(t.setZ(1.0f)).thenReturn(t);
		
		assertSame(t, t.setByIndex(2, 1.0f));
		
		verify(t).setByIndex(2, 1.0f);
		
		verify(t).setZ(1.0f);
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup3fW#setByIndex(int, float)} throws
	 * an {@link IndexOutOfBoundsException} for an index different than 0, 1 or 2.
	 */
	@Test
	void setByIndex_ExceptionTest()
	{
		Tup3fW t = mock(Tup3fW.class);
		
		when(t.setByIndex(3, 1.0f)).thenCallRealMethod();

		assertThrows(IndexOutOfBoundsException.class, new Executable() {
			public void execute() throws Throwable
			{
				t.setByIndex(3, 1.0f);
			}
		});

		verify(t).setByIndex(3, 1.0f);

		verifyNoMoreInteractions(t);
	}
}
