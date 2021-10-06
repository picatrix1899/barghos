package org.barghos.core.test.api.tuple2;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import org.barghos.core.api.tuple.TupfR;
import org.barghos.core.api.tuple.TupfRW;
import org.barghos.core.api.tuple2.Tup2fR;
import org.barghos.core.api.tuple2.Tup2fRW;
import org.barghos.core.api.tuple2.Tup2fW;

/**
 * This class provides comoponent tests for the interface {@link Tup2fRW}.
 * 
 * @author picatrix1899
 */
class Tup2fRWTest
{
	/**
	 * This test ensures, that the interface extends the interface {@link Tup2fR}.
	 */
	@Test
	void inheritance_Tup2fRTest()
	{
		assertTrue(Tup2fR.class.isAssignableFrom(Tup2fRW.class));
	}
	
	/**
	 * This test ensures, that the interface extends the interface {@link Tup2fW}.
	 */
	@Test
	void inheritance_Tup2fWTest()
	{
		assertTrue(Tup2fW.class.isAssignableFrom(Tup2fRW.class));
	}
	
	/**
	 * This test ensures, that the interface extends the interface {@link TupfRW}.
	 */
	@Test
	void inheritance_TupfRWTest()
	{
		assertTrue(TupfRW.class.isAssignableFrom(Tup2fRW.class));
	}
	
	/**
	 * This test ensures, that the default implementation of the function {@link Tup2fRW#getNewInstance(Tup2fR)} calls
	 * the function {@link Tup2fRW#getNewInstance(float, float)} with the correct components.
	 */
	@Test
	void getNewInstance_Tuple2Test()
	{
		Tup2fR original = mock(Tup2fR.class);
		Tup2fRW newInstance = mock(Tup2fRW.class);
		Tup2fRW t = mock(Tup2fRW.class);
		
		when(t.getNewInstance(original)).thenCallRealMethod();
		
		when(original.getX()).thenReturn(1.0f);
		when(original.getY()).thenReturn(2.0f);
		when(t.getNewInstance(1.0f, 2.0f)).thenReturn(newInstance);
		
		assertSame(newInstance, t.getNewInstance(original));
		
		verify(t).getNewInstance(original);
		
		verify(original).getX();
		verify(original).getY();
		verify(t).getNewInstance(1.0f, 2.0f);
		
		verifyNoMoreInteractions(t, original);
	}
	
	/**
	 * This test ensures, that the default implementation of the function {@link Tup2fRW#getNewInstance(float)} calls
	 * the function {@link Tup2fRW#getNewInstance(float, float)} with the correct components.
	 */
	@Test
	void getNewInstance_ValueTest()
	{
		Tup2fRW newInstance = mock(Tup2fRW.class);
		Tup2fRW t = mock(Tup2fRW.class);
		
		when(t.getNewInstance(1.0f)).thenCallRealMethod();

		when(t.getNewInstance(1.0f, 1.0f)).thenReturn(newInstance);
		
		assertSame(newInstance, t.getNewInstance(1.0f));
		
		verify(t).getNewInstance(1.0f);
		
		verify(t).getNewInstance(1.0f, 1.0f);
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the default implementation of the function {@link Tup2fRW#getNewInstance(TupfR)} calls
	 * the function {@link Tup2fRW#getNewInstance(float, float)} with the correct components.
	 */
	@Test
	void getNewInstance_TupleTest()
	{
		TupfR original = mock(TupfR.class);
		Tup2fRW newInstance = mock(Tup2fRW.class);
		Tup2fRW t = mock(Tup2fRW.class);
		
		when(t.getNewInstance(original)).thenCallRealMethod();
		
		when(original.getArray()).thenReturn(new float[] {1.0f, 2.0f});
		when(t.getNewInstance(1.0f, 2.0f)).thenReturn(newInstance);
		
		assertSame(newInstance, t.getNewInstance(original));
		
		verify(t).getNewInstance(original);
		
		verify(original).getArray();
		verify(t).getNewInstance(1.0f, 2.0f);
		
		verifyNoMoreInteractions(t, original);
	}
	
	/**
	 * This test ensures, that the default implementation of the function {@link Tup2fRW#getNewInstanceFromArray(float[])} calls
	 * the function {@link Tup2fRW#getNewInstance(float, float)} with the correct components.
	 */
	@Test
	void getNewInstanceFromArrayTest()
	{
		Tup2fRW newInstance = mock(Tup2fRW.class);
		Tup2fRW t = mock(Tup2fRW.class);
		
		when(t.getNewInstanceFromArray(new float[] {1.0f, 2.0f})).thenCallRealMethod();

		when(t.getNewInstance(1.0f, 2.0f)).thenReturn(newInstance);
		
		assertSame(newInstance, t.getNewInstanceFromArray(new float[] {1.0f, 2.0f}));
		
		verify(t).getNewInstanceFromArray(new float[] {1.0f, 2.0f});
		
		verify(t).getNewInstance(1.0f, 2.0f);
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * this test ensures, that the function {@link Tup2fRW#getDimensions()} always
	 * returns 2 and does not make any calls.
	 */
	@Test
	void getDimensionsTest()
	{
		Tup2fRW t = mock(Tup2fRW.class);
		
		when(t.getDimensions()).thenCallRealMethod();
		
		assertEquals(2, t.getDimensions());
		
		verify(t).getDimensions();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup2fRW#set(Tup2fR)} adopts the
	 * values from the input tuple and returns the current instance.
	 */
	@Test
	void set_Tuple2Test()
	{
		Tup2fRW t = mock(Tup2fRW.class);
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
	 * This test ensures, that the function {@link Tup2fRW#set(float)} adopts the
	 * value for each component and returns the current instance.
	 */
	@Test
	void set_ValueTest()
	{
		Tup2fRW t = mock(Tup2fRW.class);
		
		when(t.set(1.0f)).thenCallRealMethod();
		
		when(t.set(1.0f, 1.0f)).thenReturn(t);
		
		assertSame(t, t.set(1.0f));
		
		verify(t).set(1.0f);

		verify(t).set(1.0f, 1.0f);
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup2fRW#set(float, float)} adopts
	 * the values and returns the current instance.
	 */
	@Test
	void setTest()
	{
		Tup2fRW t = mock(Tup2fRW.class);
		
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
	 * This test ensures, that the function {@link Tup2fRW#set(TupfR)} adopts the
	 * values from the input tuple and returns the current instance.
	 */
	@Test
	void set_TupleTest()
	{
		Tup2fRW t = mock(Tup2fRW.class);
		TupfR t2 = mock(TupfR.class);
		
		when(t.set(t2)).thenCallRealMethod();
		
		when(t2.getArray()).thenReturn(new float[] {1.0f, 2.0f});
		when(t.set(1.0f, 2.0f)).thenReturn(t);

		assertSame(t, t.set(t2));
		
		verify(t).set(t2);
		
		verify(t2).getArray();
		verify(t).set(1.0f, 2.0f);

		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup2fRW#setArray(float[])} adopts the
	 * values and returns the current instance.
	 */
	@Test
	void setArrayTest()
	{
		Tup2fRW t = mock(Tup2fRW.class);
		
		when(t.setArray(new float[] {1.0f, 2.0f})).thenCallRealMethod();
		
		when(t.set(1.0f, 2.0f)).thenReturn(t);
		
		assertSame(t, t.setArray(new float[] {1.0f, 2.0f}));
		
		verify(t).setArray(new float[] {1.0f, 2.0f});
		
		verify(t).set(1.0f, 2.0f);
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup2fRW#setByIndex(int, float)} adopts the
	 * value to the x component if the index is 0 and returns the current instance.
	 */
	@Test
	void setByIndex_XTest()
	{
		Tup2fRW t = mock(Tup2fRW.class);
		
		when(t.setByIndex(0, 1.0f)).thenCallRealMethod();
		
		when(t.setX(1.0f)).thenReturn(t);
		
		assertSame(t, t.setByIndex(0, 1.0f));
		
		verify(t).setByIndex(0, 1.0f);
		
		verify(t).setX(1.0f);
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup2fRW#setByIndex(int, float)} adopts the
	 * value to the y component if the index is 1 and returns the current instance.
	 */
	@Test
	void setByIndex_YTest()
	{
		Tup2fRW t = mock(Tup2fRW.class);
		
		when(t.setByIndex(1, 1.0f)).thenCallRealMethod();
		
		when(t.setY(1.0f)).thenReturn(t);
		
		assertSame(t, t.setByIndex(1, 1.0f));
		
		verify(t).setByIndex(1, 1.0f);
		
		verify(t).setY(1.0f);
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup2fRW#setByIndex(int, float)} throws
	 * an {@link IndexOutOfBoundsException} for an index different than 0 or 1.
	 */
	@Test
	void setByIndex_ExceptionTest()
	{
		Tup2fRW t = mock(Tup2fRW.class);
		
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
}
