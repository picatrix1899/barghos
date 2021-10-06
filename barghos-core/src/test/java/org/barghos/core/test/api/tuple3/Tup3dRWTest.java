package org.barghos.core.test.api.tuple3;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import org.barghos.core.api.tuple.TupdR;
import org.barghos.core.api.tuple.TupdRW;
import org.barghos.core.api.tuple3.Tup3dR;
import org.barghos.core.api.tuple3.Tup3dRW;
import org.barghos.core.api.tuple3.Tup3dW;

/**
 * This class provides comoponent tests for the interface {@link Tup3dRW}.
 * 
 * @author picatrix1899
 */
class Tup3dRWTest
{
	/**
	 * This test ensures, that the interface extends the interface {@link Tup3dR}.
	 */
	@Test
	void inheritance_Tup3dRTest()
	{
		assertTrue(Tup3dR.class.isAssignableFrom(Tup3dRW.class));
	}
	
	/**
	 * This test ensures, that the interface extends the interface {@link Tup3dW}.
	 */
	@Test
	void inheritance_Tup3dWTest()
	{
		assertTrue(Tup3dW.class.isAssignableFrom(Tup3dRW.class));
	}
	
	/**
	 * This test ensures, that the interface extends the interface {@link TupdRW}.
	 */
	@Test
	void inheritance_TupdRWTest()
	{
		assertTrue(TupdRW.class.isAssignableFrom(Tup3dRW.class));
	}
	
	/**
	 * This test ensures, that the default implementation of the function {@link Tup3dRW#getNewInstance(Tup3dR)} calls
	 * the function {@link Tup3dRW#getNewInstance(double, double, double)} with the correct components.
	 */
	@Test
	void getNewInstance_Tuple2Test()
	{
		Tup3dR original = mock(Tup3dR.class);
		Tup3dRW newInstance = mock(Tup3dRW.class);
		Tup3dRW t = mock(Tup3dRW.class);
		
		when(t.getNewInstance(original)).thenCallRealMethod();
		
		when(original.getX()).thenReturn(1.0);
		when(original.getY()).thenReturn(2.0);
		when(original.getZ()).thenReturn(3.0);
		when(t.getNewInstance(1.0, 2.0, 3.0)).thenReturn(newInstance);
		
		assertSame(newInstance, t.getNewInstance(original));
		
		verify(t).getNewInstance(original);
		
		verify(original).getX();
		verify(original).getY();
		verify(original).getZ();
		verify(t).getNewInstance(1.0, 2.0, 3.0);
		
		verifyNoMoreInteractions(t, original);
	}
	
	/**
	 * This test ensures, that the default implementation of the function {@link Tup3dRW#getNewInstance(double)} calls
	 * the function {@link Tup3dRW#getNewInstance(double, double, double)} with the correct components.
	 */
	@Test
	void getNewInstance_ValueTest()
	{
		Tup3dRW newInstance = mock(Tup3dRW.class);
		Tup3dRW t = mock(Tup3dRW.class);
		
		when(t.getNewInstance(1.0)).thenCallRealMethod();

		when(t.getNewInstance(1.0, 1.0, 1.0)).thenReturn(newInstance);
		
		assertSame(newInstance, t.getNewInstance(1.0));
		
		verify(t).getNewInstance(1.0);
		
		verify(t).getNewInstance(1.0, 1.0, 1.0);
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the default implementation of the function {@link Tup3dRW#getNewInstance(TupdR)} calls
	 * the function {@link Tup3dRW#getNewInstance(double, double, double)} with the correct components.
	 */
	@Test
	void getNewInstance_TupleTest()
	{
		TupdR original = mock(TupdR.class);
		Tup3dRW newInstance = mock(Tup3dRW.class);
		Tup3dRW t = mock(Tup3dRW.class);
		
		when(t.getNewInstance(original)).thenCallRealMethod();
		
		when(original.getArray()).thenReturn(new double[] {1.0, 2.0, 3.0});
		when(t.getNewInstance(1.0, 2.0, 3.0)).thenReturn(newInstance);
		
		assertSame(newInstance, t.getNewInstance(original));
		
		verify(t).getNewInstance(original);
		
		verify(original).getArray();
		verify(t).getNewInstance(1.0, 2.0, 3.0);
		
		verifyNoMoreInteractions(t, original);
	}
	
	/**
	 * This test ensures, that the default implementation of the function {@link Tup3dRW#getNewInstanceFromArray(double[])} calls
	 * the function {@link Tup3dRW#getNewInstance(double, double, double)} with the correct components.
	 */
	@Test
	void getNewInstanceFromArrayTest()
	{
		Tup3dRW newInstance = mock(Tup3dRW.class);
		Tup3dRW t = mock(Tup3dRW.class);
		
		when(t.getNewInstanceFromArray(new double[] {1.0, 2.0, 3.0})).thenCallRealMethod();

		when(t.getNewInstance(1.0, 2.0, 3.0)).thenReturn(newInstance);
		
		assertSame(newInstance, t.getNewInstanceFromArray(new double[] {1.0, 2.0, 3.0}));
		
		verify(t).getNewInstanceFromArray(new double[] {1.0, 2.0, 3.0});
		
		verify(t).getNewInstance(1.0, 2.0, 3.0);
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * this test ensures, that the function {@link Tup3dRW#getDimensions()} always
	 * returns 3 and does not make any calls.
	 */
	@Test
	void getDimensionsTest()
	{
		Tup3dRW t = mock(Tup3dRW.class);
		
		when(t.getDimensions()).thenCallRealMethod();
		
		assertEquals(3, t.getDimensions());
		
		verify(t).getDimensions();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup3dRW#set(Tup3dR)} adopts the
	 * values from the input tuple and returns the current instance.
	 */
	@Test
	void set_Tuple2Test()
	{
		Tup3dRW t = mock(Tup3dRW.class);
		Tup3dR t2 = mock(Tup3dR.class);
		
		when(t.set(t2)).thenCallRealMethod();
		
		when(t2.getX()).thenReturn(1.0);
		when(t2.getY()).thenReturn(2.0);
		when(t2.getZ()).thenReturn(3.0);
		when(t.set(1.0, 2.0, 3.0)).thenReturn(t);
		
		assertSame(t, t.set(t2));
		
		verify(t).set(t2);
		
		verify(t2).getX();
		verify(t2).getY();
		verify(t2).getZ();
		verify(t).set(1.0, 2.0, 3.0);
		
		verifyNoMoreInteractions(t, t2);
	}
	
	/**
	 * This test ensures, that the function {@link Tup3dRW#set(double)} adopts the
	 * value for each component and returns the current instance.
	 */
	@Test
	void set_ValueTest()
	{
		Tup3dRW t = mock(Tup3dRW.class);
		
		when(t.set(1.0)).thenCallRealMethod();
		
		when(t.set(1.0, 1.0, 1.0)).thenReturn(t);
		
		assertSame(t, t.set(1.0));
		
		verify(t).set(1.0);

		verify(t).set(1.0, 1.0, 1.0);
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup3dRW#set(double, double)} adopts
	 * the values and returns the current instance.
	 */
	@Test
	void setTest()
	{
		Tup3dRW t = mock(Tup3dRW.class);
		
		when(t.set(1.0, 2.0, 3.0)).thenCallRealMethod();
		
		when(t.setX(1.0)).thenReturn(t);
		when(t.setY(2.0)).thenReturn(t);
		when(t.setZ(3.0)).thenReturn(t);
		
		assertSame(t, t.set(1.0, 2.0, 3.0));
		
		verify(t).set(1.0, 2.0, 3.0);

		verify(t).setX(1.0);
		verify(t).setY(2.0);
		verify(t).setZ(3.0);
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup3dRW#set(TupdR)} adopts the
	 * values from the input tuple and returns the current instance.
	 */
	@Test
	void set_TupleTest()
	{
		Tup3dRW t = mock(Tup3dRW.class);
		TupdR t2 = mock(TupdR.class);
		
		when(t.set(t2)).thenCallRealMethod();
		
		when(t2.getArray()).thenReturn(new double[] {1.0, 2.0, 3.0});
		when(t.set(1.0, 2.0, 3.0)).thenReturn(t);

		assertSame(t, t.set(t2));
		
		verify(t).set(t2);
		
		verify(t2).getArray();
		verify(t).set(1.0, 2.0, 3.0);

		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup3dRW#setArray(double[])} adopts the
	 * values and returns the current instance.
	 */
	@Test
	void setArrayTest()
	{
		Tup3dRW t = mock(Tup3dRW.class);
		
		when(t.setArray(new double[] {1.0, 2.0, 3.0})).thenCallRealMethod();
		
		when(t.set(1.0, 2.0, 3.0)).thenReturn(t);
		
		assertSame(t, t.setArray(new double[] {1.0, 2.0, 3.0}));
		
		verify(t).setArray(new double[] {1.0, 2.0, 3.0});
		
		verify(t).set(1.0, 2.0, 3.0);
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup3dRW#setByIndex(int, double)} adopts the
	 * value to the x component if the index is 0 and returns the current instance.
	 */
	@Test
	void setByIndex_XTest()
	{
		Tup3dRW t = mock(Tup3dRW.class);
		
		when(t.setByIndex(0, 1.0)).thenCallRealMethod();
		
		when(t.setX(1.0)).thenReturn(t);
		
		assertSame(t, t.setByIndex(0, 1.0));
		
		verify(t).setByIndex(0, 1.0);
		
		verify(t).setX(1.0);
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup3dRW#setByIndex(int, double)} adopts the
	 * value to the y component if the index is 1 and returns the current instance.
	 */
	@Test
	void setByIndex_YTest()
	{
		Tup3dRW t = mock(Tup3dRW.class);
		
		when(t.setByIndex(1, 1.0)).thenCallRealMethod();
		
		when(t.setY(1.0)).thenReturn(t);
		
		assertSame(t, t.setByIndex(1, 1.0));
		
		verify(t).setByIndex(1, 1.0);
		
		verify(t).setY(1.0);
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup3dRW#setByIndex(int, double)} adopts the
	 * value to the z component if the index is 2 and returns the current instance.
	 */
	@Test
	void setByIndex_ZTest()
	{
		Tup3dRW t = mock(Tup3dRW.class);
		
		when(t.setByIndex(2, 1.0)).thenCallRealMethod();
		
		when(t.setZ(1.0)).thenReturn(t);
		
		assertSame(t, t.setByIndex(2, 1.0));
		
		verify(t).setByIndex(2, 1.0);
		
		verify(t).setZ(1.0);
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup3dRW#setByIndex(int, double)} throws
	 * an {@link IndexOutOfBoundsException} for an index different than 0, 1 or 2.
	 */
	@Test
	void setByIndex_ExceptionTest()
	{
		Tup3dRW t = mock(Tup3dRW.class);
		
		when(t.setByIndex(3, 1.0)).thenCallRealMethod();

		assertThrows(IndexOutOfBoundsException.class, new Executable() {
			public void execute() throws Throwable
			{
				t.setByIndex(3, 1.0);
			}
		});

		verify(t).setByIndex(3, 1.0);

		verifyNoMoreInteractions(t);
	}
}
