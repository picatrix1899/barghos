package org.barghos.core.test.api.tuple4;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import org.barghos.core.api.tuple.TupdR;
import org.barghos.core.api.tuple.TupdW;
import org.barghos.core.api.tuple4.Tup4dR;
import org.barghos.core.api.tuple4.Tup4dW;

/**
 * This class provides component tests for the interface {@link Tup4dW}.
 * 
 * @author picatrix1899
 */
class Tup4dWTest
{
	/**
	 * This test ensures, that the interface extends the interface {@link TupdW}.
	 */
	@Test
	void inheritance_TupdWTest()
	{
		assertTrue(TupdW.class.isAssignableFrom(Tup4dW.class));
	}
	
	/**
	 * This test ensures, that the function {@link Tup4dW#set(Tup4dR)} adopts the
	 * values from the input tuple and returns the current instance.
	 */
	@Test
	void set_Tuple2Test()
	{
		Tup4dW t = mock(Tup4dW.class);
		Tup4dR t2 = mock(Tup4dR.class);
		
		when(t.set(t2)).thenCallRealMethod();
		
		when(t2.getX()).thenReturn(1.0);
		when(t2.getY()).thenReturn(2.0);
		when(t2.getZ()).thenReturn(3.0);
		when(t2.getW()).thenReturn(4.0);
		when(t.set(1.0, 2.0, 3.0, 4.0)).thenReturn(t);
		
		assertSame(t, t.set(t2));
		
		verify(t).set(t2);
		
		verify(t2).getX();
		verify(t2).getY();
		verify(t2).getZ();
		verify(t2).getW();
		verify(t).set(1.0, 2.0, 3.0, 4.0);
		
		verifyNoMoreInteractions(t, t2);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4dW#set(double)} adopts the
	 * value for each component and returns the current instance.
	 */
	@Test
	void set_ValueTest()
	{
		Tup4dW t = mock(Tup4dW.class);
		
		when(t.set(1.0)).thenCallRealMethod();
		
		when(t.set(1.0, 1.0, 1.0, 1.0)).thenReturn(t);
		
		assertSame(t, t.set(1.0));
		
		verify(t).set(1.0);

		verify(t).set(1.0, 1.0, 1.0, 1.0);
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4dW#set(double, double)} adopts
	 * the values and returns the current instance.
	 */
	@Test
	void setTest()
	{
		Tup4dW t = mock(Tup4dW.class);
		
		when(t.set(1.0, 2.0, 3.0, 4.0)).thenCallRealMethod();
		
		when(t.setX(1.0)).thenReturn(t);
		when(t.setY(2.0)).thenReturn(t);
		when(t.setZ(3.0)).thenReturn(t);
		when(t.setW(4.0)).thenReturn(t);
		
		assertSame(t, t.set(1.0, 2.0, 3.0, 4.0));
		
		verify(t).set(1.0, 2.0, 3.0, 4.0);

		verify(t).setX(1.0);
		verify(t).setY(2.0);
		verify(t).setZ(3.0);
		verify(t).setW(4.0);
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4dW#set(TupdR)} adopts the
	 * values from the input tuple and returns the current instance.
	 */
	@Test
	void set_TupleTest()
	{
		Tup4dW t = mock(Tup4dW.class);
		TupdR t2 = mock(TupdR.class);
		
		when(t.set(t2)).thenCallRealMethod();
		
		when(t2.getArray()).thenReturn(new double[] {1.0, 2.0, 3.0, 4.0});
		when(t.set(1.0, 2.0, 3.0, 4.0)).thenReturn(t);

		assertSame(t, t.set(t2));
		
		verify(t).set(t2);

		verify(t2).getArray();
		verify(t).set(1.0, 2.0, 3.0, 4.0);

		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4dW#getDimensions()} always
	 * returns 4 and does not do any calls.
	 */
	@Test
	void getDimensionsTest()
	{
		Tup4dW t = mock(Tup4dW.class);
		
		when(t.getDimensions()).thenCallRealMethod();
		
		assertEquals(4, t.getDimensions());
		
		verify(t).getDimensions();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4dW#setArray(double[])} adopts the
	 * values and returns the current instance.
	 */
	@Test
	void setArrayTest()
	{
		Tup4dW t = mock(Tup4dW.class);
		
		when(t.setArray(new double[] {1.0, 2.0, 3.0, 4.0})).thenCallRealMethod();
		
		when(t.set(1.0, 2.0, 3.0, 4.0)).thenReturn(t);
		
		assertSame(t, t.setArray(new double[] {1.0, 2.0, 3.0, 4.0}));
		
		verify(t).setArray(new double[] {1.0, 2.0, 3.0, 4.0});
		
		verify(t).set(1.0, 2.0, 3.0, 4.0);
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4dW#setByIndex(int, double)} adopts the
	 * value to the x component if the index is 0 and returns the current instance.
	 */
	@Test
	void setByIndex_XTest()
	{
		Tup4dW t = mock(Tup4dW.class);
		
		when(t.setByIndex(0, 1.0)).thenCallRealMethod();
		
		when(t.setX(1.0)).thenReturn(t);
		
		assertSame(t, t.setByIndex(0, 1.0));
		
		verify(t).setByIndex(0, 1.0);
		
		verify(t).setX(1.0);
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4dW#setByIndex(int, double)} adopts the
	 * value to the y component if the index is 1 and returns the current instance.
	 */
	@Test
	void setByIndex_YTest()
	{
		Tup4dW t = mock(Tup4dW.class);
		
		when(t.setByIndex(1, 1.0)).thenCallRealMethod();
		
		when(t.setY(1.0)).thenReturn(t);
		
		assertSame(t, t.setByIndex(1, 1.0));
		
		verify(t).setByIndex(1, 1.0);
		
		verify(t).setY(1.0);
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4dW#setByIndex(int, double)} adopts the
	 * value to the z component if the index is 2 and returns the current instance.
	 */
	@Test
	void setByIndex_ZTest()
	{
		Tup4dW t = mock(Tup4dW.class);
		
		when(t.setByIndex(2, 1.0)).thenCallRealMethod();
		
		when(t.setZ(1.0)).thenReturn(t);
		
		assertSame(t, t.setByIndex(2, 1.0));
		
		verify(t).setByIndex(2, 1.0);
		
		verify(t).setZ(1.0);
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4dW#setByIndex(int, double)} adopts the
	 * value to the w component if the index is 3 and returns the current instance.
	 */
	@Test
	void setByIndex_WTest()
	{
		Tup4dW t = mock(Tup4dW.class);
		
		when(t.setByIndex(3, 1.0)).thenCallRealMethod();
		
		when(t.setW(1.0)).thenReturn(t);
		
		assertSame(t, t.setByIndex(3, 1.0));
		
		verify(t).setByIndex(3, 1.0);
		
		verify(t).setW(1.0);
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4dW#setByIndex(int, double)} throws
	 * an {@link IndexOutOfBoundsException} for an index different than 0, 1, 2 or 3.
	 */
	@Test
	void setByIndex_ExceptionTest()
	{
		Tup4dW t = mock(Tup4dW.class);
		
		when(t.setByIndex(4, 1.0)).thenCallRealMethod();

		assertThrows(IndexOutOfBoundsException.class, new Executable() {
			public void execute() throws Throwable
			{
				t.setByIndex(4, 1.0);
			}
		});

		verify(t).setByIndex(4, 1.0);

		verifyNoMoreInteractions(t);
	}
}
