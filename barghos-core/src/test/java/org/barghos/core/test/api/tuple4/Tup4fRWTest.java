package org.barghos.core.test.api.tuple4;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import org.barghos.core.api.tuple.TupfR;
import org.barghos.core.api.tuple.TupfRW;
import org.barghos.core.api.tuple4.Tup4fR;
import org.barghos.core.api.tuple4.Tup4fRW;
import org.barghos.core.api.tuple4.Tup4fW;

/**
 * This class provides comoponent tests for the interface {@link Tup4fRW}.
 * 
 * @author picatrix1899
 */
class Tup4fRWTest
{
	/**
	 * This test ensures, that the interface extends the interface {@link Tup4fR}.
	 */
	@Test
	void inheritance_Tup4fRTest()
	{
		assertTrue(Tup4fR.class.isAssignableFrom(Tup4fRW.class));
	}
	
	/**
	 * This test ensures, that the interface extends the interface {@link Tup4fW}.
	 */
	@Test
	void inheritance_Tup4fWTest()
	{
		assertTrue(Tup4fW.class.isAssignableFrom(Tup4fRW.class));
	}
	
	/**
	 * This test ensures, that the interface extends the interface {@link TupfRW}.
	 */
	@Test
	void inheritance_TupfRWTest()
	{
		assertTrue(TupfRW.class.isAssignableFrom(Tup4fRW.class));
	}
	
	/**
	 * This test ensures, that the default implementation of the function {@link Tup4fRW#getNewInstance(Tup4fR)} calls
	 * the function {@link Tup4fRW#getNewInstance(float, float, float, float)} with the correct components.
	 */
	@Test
	void getNewInstance_Tuple2Test()
	{
		Tup4fR original = mock(Tup4fR.class);
		Tup4fRW newInstance = mock(Tup4fRW.class);
		Tup4fRW t = mock(Tup4fRW.class);
		
		when(t.getNewInstance(original)).thenCallRealMethod();
		
		when(original.getX()).thenReturn(1.0f);
		when(original.getY()).thenReturn(2.0f);
		when(original.getZ()).thenReturn(3.0f);
		when(original.getW()).thenReturn(4.0f);
		when(t.getNewInstance(1.0f, 2.0f, 3.0f, 4.0f)).thenReturn(newInstance);
		
		assertSame(newInstance, t.getNewInstance(original));
		
		verify(t).getNewInstance(original);
		
		verify(original).getX();
		verify(original).getY();
		verify(original).getZ();
		verify(original).getW();
		verify(t).getNewInstance(1.0f, 2.0f, 3.0f, 4.0f);
		
		verifyNoMoreInteractions(t, original);
	}
	
	/**
	 * This test ensures, that the default implementation of the function {@link Tup4fRW#getNewInstance(float)} calls
	 * the function {@link Tup4fRW#getNewInstance(float, float, float, float)} with the correct components.
	 */
	@Test
	void getNewInstance_ValueTest()
	{
		Tup4fRW newInstance = mock(Tup4fRW.class);
		Tup4fRW t = mock(Tup4fRW.class);
		
		when(t.getNewInstance(1.0f)).thenCallRealMethod();

		when(t.getNewInstance(1.0f, 1.0f, 1.0f, 1.0f)).thenReturn(newInstance);
		
		assertSame(newInstance, t.getNewInstance(1.0f));
		
		verify(t).getNewInstance(1.0f);
		
		verify(t).getNewInstance(1.0f, 1.0f, 1.0f, 1.0f);
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the default implementation of the function {@link Tup4fRW#getNewInstance(TupfR)} calls
	 * the function {@link Tup4fRW#getNewInstance(float, float, float, float)} with the correct components.
	 */
	@Test
	void getNewInstance_TupleTest()
	{
		TupfR original = mock(TupfR.class);
		Tup4fRW newInstance = mock(Tup4fRW.class);
		Tup4fRW t = mock(Tup4fRW.class);
		
		when(t.getNewInstance(original)).thenCallRealMethod();
		
		when(original.getArray()).thenReturn(new float[] {1.0f, 2.0f, 3.0f, 4.0f});
		when(t.getNewInstance(1.0f, 2.0f, 3.0f, 4.0f)).thenReturn(newInstance);
		
		assertSame(newInstance, t.getNewInstance(original));
		
		verify(t).getNewInstance(original);
		
		verify(original).getArray();
		verify(t).getNewInstance(1.0f, 2.0f, 3.0f, 4.0f);
		
		verifyNoMoreInteractions(t, original);
	}
	
	/**
	 * This test ensures, that the default implementation of the function {@link Tup4fRW#getNewInstanceFromArray(float[])} calls
	 * the function {@link Tup4fRW#getNewInstance(float, float, float, float)} with the correct components.
	 */
	@Test
	void getNewInstanceFromArrayTest()
	{
		Tup4fRW newInstance = mock(Tup4fRW.class);
		Tup4fRW t = mock(Tup4fRW.class);
		
		when(t.getNewInstanceFromArray(new float[] {1.0f, 2.0f, 3.0f, 4.0f})).thenCallRealMethod();

		when(t.getNewInstance(1.0f, 2.0f, 3.0f, 4.0f)).thenReturn(newInstance);
		
		assertSame(newInstance, t.getNewInstanceFromArray(new float[] {1.0f, 2.0f, 3.0f, 4.0f}));
		
		verify(t).getNewInstanceFromArray(new float[] {1.0f, 2.0f, 3.0f, 4.0f});
		
		verify(t).getNewInstance(1.0f, 2.0f, 3.0f, 4.0f);
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * this test ensures, that the function {@link Tup4fRW#getDimensions()} always
	 * returns 4 and does not make any calls.
	 */
	@Test
	void getDimensionsTest()
	{
		Tup4fRW t = mock(Tup4fRW.class);
		
		when(t.getDimensions()).thenCallRealMethod();
		
		assertEquals(4, t.getDimensions());
		
		verify(t).getDimensions();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4fRW#set(Tup4fR)} adopts the
	 * values from the input tuple and returns the current instance.
	 */
	@Test
	void set_Tuple2Test()
	{
		Tup4fRW t = mock(Tup4fRW.class);
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
	 * This test ensures, that the function {@link Tup4fRW#set(float)} adopts the
	 * value for each component and returns the current instance.
	 */
	@Test
	void set_ValueTest()
	{
		Tup4fRW t = mock(Tup4fRW.class);
		
		when(t.set(1.0f)).thenCallRealMethod();
		
		when(t.set(1.0f, 1.0f, 1.0f, 1.0f)).thenReturn(t);
		
		assertSame(t, t.set(1.0f));
		
		verify(t).set(1.0f);

		verify(t).set(1.0f, 1.0f, 1.0f, 1.0f);
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4fRW#set(float, float, float, float)} adopts
	 * the values and returns the current instance.
	 */
	@Test
	void setTest()
	{
		Tup4fRW t = mock(Tup4fRW.class);
		
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
	 * This test ensures, that the function {@link Tup4fRW#set(TupfR)} adopts the
	 * values from the input tuple and returns the current instance.
	 */
	@Test
	void set_TupleTest()
	{
		Tup4fRW t = mock(Tup4fRW.class);
		TupfR t2 = mock(TupfR.class);
		
		when(t.set(t2)).thenCallRealMethod();
		
		when(t2.getArray()).thenReturn(new float[] {1.0f, 2.0f, 3.0f, 4.0f});
		when(t.set(1.0f, 2.0f, 3.0f, 4.0f)).thenReturn(t);

		assertSame(t, t.set(t2));
		
		verify(t).set(t2);
		
		verify(t2).getArray();
		verify(t).set(1.0f, 2.0f, 3.0f, 4.0f);

		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4fRW#setArray(float[])} adopts the
	 * values and returns the current instance.
	 */
	@Test
	void setArrayTest()
	{
		Tup4fRW t = mock(Tup4fRW.class);
		
		when(t.setArray(new float[] {1.0f, 2.0f, 3.0f, 4.0f})).thenCallRealMethod();
		
		when(t.set(1.0f, 2.0f, 3.0f, 4.0f)).thenReturn(t);
		
		assertSame(t, t.setArray(new float[] {1.0f, 2.0f, 3.0f, 4.0f}));
		
		verify(t).setArray(new float[] {1.0f, 2.0f, 3.0f, 4.0f});
		
		verify(t).set(1.0f, 2.0f, 3.0f, 4.0f);
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4fRW#setByIndex(int, float)} adopts the
	 * value to the x component if the index is 0 and returns the current instance.
	 */
	@Test
	void setByIndex_XTest()
	{
		Tup4fRW t = mock(Tup4fRW.class);
		
		when(t.setByIndex(0, 1.0f)).thenCallRealMethod();
		
		when(t.setX(1.0f)).thenReturn(t);
		
		assertSame(t, t.setByIndex(0, 1.0f));
		
		verify(t).setByIndex(0, 1.0f);
		
		verify(t).setX(1.0f);
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4fRW#setByIndex(int, float)} adopts the
	 * value to the y component if the index is 1 and returns the current instance.
	 */
	@Test
	void setByIndex_YTest()
	{
		Tup4fRW t = mock(Tup4fRW.class);
		
		when(t.setByIndex(1, 1.0f)).thenCallRealMethod();
		
		when(t.setY(1.0f)).thenReturn(t);
		
		assertSame(t, t.setByIndex(1, 1.0f));
		
		verify(t).setByIndex(1, 1.0f);
		
		verify(t).setY(1.0f);
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4fRW#setByIndex(int, float)} adopts the
	 * value to the z component if the index is 2 and returns the current instance.
	 */
	@Test
	void setByIndex_ZTest()
	{
		Tup4fRW t = mock(Tup4fRW.class);
		
		when(t.setByIndex(2, 1.0f)).thenCallRealMethod();
		
		when(t.setZ(1.0f)).thenReturn(t);
		
		assertSame(t, t.setByIndex(2, 1.0f));
		
		verify(t).setByIndex(2, 1.0f);
		
		verify(t).setZ(1.0f);
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4fRW#setByIndex(int, float)} adopts the
	 * value to the w component if the index is 3 and returns the current instance.
	 */
	@Test
	void setByIndex_WTest()
	{
		Tup4fRW t = mock(Tup4fRW.class);
		
		when(t.setByIndex(3, 1.0f)).thenCallRealMethod();
		
		when(t.setW(1.0f)).thenReturn(t);
		
		assertSame(t, t.setByIndex(3, 1.0f));
		
		verify(t).setByIndex(3, 1.0f);
		
		verify(t).setW(1.0f);
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4fRW#setByIndex(int, float)} throws
	 * an {@link IndexOutOfBoundsException} for an index different than 0, 1, 2 or 3.
	 */
	@Test
	void setByIndex_ExceptionTest()
	{
		Tup4fRW t = mock(Tup4fRW.class);
		
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
}
