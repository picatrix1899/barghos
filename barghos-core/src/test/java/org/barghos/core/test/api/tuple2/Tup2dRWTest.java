package org.barghos.core.test.api.tuple2;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import org.barghos.core.api.tuple.TupdR;
import org.barghos.core.api.tuple.TupdRW;
import org.barghos.core.api.tuple2.Tup2dR;
import org.barghos.core.api.tuple2.Tup2dRW;
import org.barghos.core.api.tuple2.Tup2dW;

/**
 * This class provides comoponent tests for the interface {@link Tup2dRW}.
 * 
 * @author picatrix1899
 */
class Tup2dRWTest
{
	/**
	 * This test ensures, that the interface extends the interface {@link Tup2dR}.
	 */
	@Test
	void inheritance_Tup2dRTest()
	{
		assertTrue(Tup2dR.class.isAssignableFrom(Tup2dRW.class));
	}
	
	/**
	 * This test ensures, that the interface extends the interface {@link Tup2dW}.
	 */
	@Test
	void inheritance_Tup2dWTest()
	{
		assertTrue(Tup2dW.class.isAssignableFrom(Tup2dRW.class));
	}
	
	/**
	 * This test ensures, that the interface extends the interface {@link TupdRW}.
	 */
	@Test
	void inheritance_TupdRWTest()
	{
		assertTrue(TupdRW.class.isAssignableFrom(Tup2dRW.class));
	}
	
	/**
	 * This test ensures, that the default implementation of the function {@link Tup2dRW#getNewInstance(Tup2dR)} calls
	 * the function {@link Tup2dRW#getNewInstance(double, double)} with the correct components.
	 */
	@Test
	void getNewInstance_Tuple2Test()
	{
		Tup2dR original = mock(Tup2dR.class);
		Tup2dRW newInstance = mock(Tup2dRW.class);
		Tup2dRW t = mock(Tup2dRW.class);
		
		when(t.getNewInstance(original)).thenCallRealMethod();
		
		when(original.getX()).thenReturn(1.0);
		when(original.getY()).thenReturn(2.0);
		when(t.getNewInstance(1.0, 2.0)).thenReturn(newInstance);
		
		assertSame(newInstance, t.getNewInstance(original));
		
		verify(t).getNewInstance(original);
		
		verify(original).getX();
		verify(original).getY();
		verify(t).getNewInstance(1.0, 2.0);
		
		verifyNoMoreInteractions(t, original);
	}
	
	/**
	 * This test ensures, that the default implementation of the function {@link Tup2dRW#getNewInstance(double)} calls
	 * the function {@link Tup2dRW#getNewInstance(double, double)} with the correct components.
	 */
	@Test
	void getNewInstance_ValueTest()
	{
		Tup2dRW newInstance = mock(Tup2dRW.class);
		Tup2dRW t = mock(Tup2dRW.class);
		
		when(t.getNewInstance(1.0)).thenCallRealMethod();

		when(t.getNewInstance(1.0, 1.0)).thenReturn(newInstance);
		
		assertSame(newInstance, t.getNewInstance(1.0));
		
		verify(t).getNewInstance(1.0);
		
		verify(t).getNewInstance(1.0, 1.0);
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the default implementation of the function {@link Tup2dRW#getNewInstance(TupdR)} calls
	 * the function {@link Tup2dRW#getNewInstance(double, double)} with the correct components.
	 */
	@Test
	void getNewInstance_TupleTest()
	{
		TupdR original = mock(TupdR.class);
		Tup2dRW newInstance = mock(Tup2dRW.class);
		Tup2dRW t = mock(Tup2dRW.class);
		
		when(t.getNewInstance(original)).thenCallRealMethod();
		
		when(original.getArray()).thenReturn(new double[] {1.0, 2.0});
		when(t.getNewInstance(1.0, 2.0)).thenReturn(newInstance);
		
		assertSame(newInstance, t.getNewInstance(original));
		
		verify(t).getNewInstance(original);
		
		verify(original).getArray();
		verify(t).getNewInstance(1.0, 2.0);
		
		verifyNoMoreInteractions(t, original);
	}
	
	/**
	 * This test ensures, that the default implementation of the function {@link Tup2dRW#getNewInstanceFromArray(double[])} calls
	 * the function {@link Tup2dRW#getNewInstance(double, double)} with the correct components.
	 */
	@Test
	void getNewInstanceFromArrayTest()
	{
		Tup2dRW newInstance = mock(Tup2dRW.class);
		Tup2dRW t = mock(Tup2dRW.class);
		
		when(t.getNewInstanceFromArray(new double[] {1.0, 2.0})).thenCallRealMethod();

		when(t.getNewInstance(1.0, 2.0)).thenReturn(newInstance);
		
		assertSame(newInstance, t.getNewInstanceFromArray(new double[] {1.0, 2.0}));
		
		verify(t).getNewInstanceFromArray(new double[] {1.0, 2.0});
		
		verify(t).getNewInstance(1.0, 2.0);
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * this test ensures, that the function {@link Tup2dRW#getDimensions()} always
	 * returns 2 and does not make any calls.
	 */
	@Test
	void getDimensionsTest()
	{
		Tup2dRW t = mock(Tup2dRW.class);
		
		when(t.getDimensions()).thenCallRealMethod();
		
		assertEquals(2, t.getDimensions());
		
		verify(t).getDimensions();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup2dRW#set(Tup2dR)} adopts the
	 * values from the input tuple and returns the current instance.
	 */
	@Test
	void set_Tuple2Test()
	{
		Tup2dRW t = mock(Tup2dRW.class);
		Tup2dR t2 = mock(Tup2dR.class);
		
		when(t.set(t2)).thenCallRealMethod();
		
		when(t2.getX()).thenReturn(1.0);
		when(t2.getY()).thenReturn(2.0);
		when(t.set(1.0, 2.0)).thenReturn(t);
		
		assertSame(t, t.set(t2));
		
		verify(t).set(t2);
		
		verify(t2).getX();
		verify(t2).getY();
		verify(t).set(1.0, 2.0);
		
		verifyNoMoreInteractions(t, t2);
	}
	
	/**
	 * This test ensures, that the function {@link Tup2dRW#set(double)} adopts the
	 * value for each component and returns the current instance.
	 */
	@Test
	void set_ValueTest()
	{
		Tup2dRW t = mock(Tup2dRW.class);
		
		when(t.set(1.0)).thenCallRealMethod();
		
		when(t.set(1.0, 1.0)).thenReturn(t);
		
		assertSame(t, t.set(1.0));
		
		verify(t).set(1.0);

		verify(t).set(1.0, 1.0);
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup2dRW#set(double, double)} adopts
	 * the values and returns the current instance.
	 */
	@Test
	void setTest()
	{
		Tup2dRW t = mock(Tup2dRW.class);
		
		when(t.set(1.0, 2.0)).thenCallRealMethod();
		
		when(t.setX(1.0)).thenReturn(t);
		when(t.setY(2.0)).thenReturn(t);
		
		assertSame(t, t.set(1.0, 2.0));
		
		verify(t).set(1.0, 2.0);

		verify(t).setX(1.0);
		verify(t).setY(2.0);
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup2dRW#set(TupdR)} adopts the
	 * values from the input tuple and returns the current instance.
	 */
	@Test
	void set_TupleTest()
	{
		Tup2dRW t = mock(Tup2dRW.class);
		TupdR t2 = mock(TupdR.class);
		
		when(t.set(t2)).thenCallRealMethod();
		
		when(t2.getArray()).thenReturn(new double[] {1.0, 2.0});
		when(t.set(1.0, 2.0)).thenReturn(t);

		assertSame(t, t.set(t2));
		
		verify(t).set(t2);
		
		verify(t2).getArray();
		verify(t).set(1.0, 2.0);

		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup2dRW#setArray(double[])} adopts the
	 * values and returns the current instance.
	 */
	@Test
	void setArrayTest()
	{
		Tup2dRW t = mock(Tup2dRW.class);
		
		when(t.setArray(new double[] {1.0, 2.0})).thenCallRealMethod();
		
		when(t.set(1.0, 2.0)).thenReturn(t);
		
		assertSame(t, t.setArray(new double[] {1.0, 2.0}));
		
		verify(t).setArray(new double[] {1.0, 2.0});
		
		verify(t).set(1.0, 2.0);
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup2dRW#setByIndex(int, double)} adopts the
	 * value to the x component if the index is 0 and returns the current instance.
	 */
	@Test
	void setByIndex_XTest()
	{
		Tup2dRW t = mock(Tup2dRW.class);
		
		when(t.setByIndex(0, 1.0)).thenCallRealMethod();
		
		when(t.setX(1.0)).thenReturn(t);
		
		assertSame(t, t.setByIndex(0, 1.0));
		
		verify(t).setByIndex(0, 1.0);
		
		verify(t).setX(1.0);
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup2dRW#setByIndex(int, double)} adopts the
	 * value to the y component if the index is 1 and returns the current instance.
	 */
	@Test
	void setByIndex_YTest()
	{
		Tup2dRW t = mock(Tup2dRW.class);
		
		when(t.setByIndex(1, 1.0)).thenCallRealMethod();
		
		when(t.setY(1.0)).thenReturn(t);
		
		assertSame(t, t.setByIndex(1, 1.0));
		
		verify(t).setByIndex(1, 1.0);
		
		verify(t).setY(1.0);
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup2dRW#setByIndex(int, double)} throws
	 * an {@link IndexOutOfBoundsException} for an index different than 0 or 1.
	 */
	@Test
	void setByIndex_ExceptionTest()
	{
		Tup2dRW t = mock(Tup2dRW.class);
		
		when(t.setByIndex(2, 1.0)).thenCallRealMethod();

		assertThrows(IndexOutOfBoundsException.class, new Executable() {
			public void execute() throws Throwable
			{
				t.setByIndex(2, 1.0);
			}
		});

		verify(t).setByIndex(2, 1.0);

		verifyNoMoreInteractions(t);
	}
}
