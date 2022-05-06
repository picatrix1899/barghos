package org.barghos.core.test.api.tuple2;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import org.barghos.core.api.tuple.TupdC;
import org.barghos.core.api.tuple.TupdR;
import org.barghos.core.api.tuple2.Tup2dC;
import org.barghos.core.api.tuple2.Tup2dR;

/**
 * This class provides comoponent tests for the interface {@link Tup2dC}.
 * 
 * @author picatrix1899
 */
class Tup2dCTest
{
	/**
	 * This test ensures, that the interface extends the interface {@link Tup2dR}.
	 */
	@Test
	void inheritance_Tup2dRTest()
	{
		assertTrue(Tup2dR.class.isAssignableFrom(Tup2dC.class));
	}
	
	/**
	 * This test ensures, that the interface extends the interface {@link TupdC}.
	 */
	@Test
	void inheritance_TupdCTest()
	{
		assertTrue(TupdC.class.isAssignableFrom(Tup2dC.class));
	}
	
	/**
	 * This test ensures, that the function {@link Tup2dC#set(Tup2dR)} adopts the
	 * values from the input tuple and returns the current instance.
	 */
	@Test
	void set_Tuple2Test()
	{
		Tup2dC t = mock(Tup2dC.class);
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
	 * This test ensures, that the function {@link Tup2dC#set(double)} adopts the
	 * value for each component and returns the current instance.
	 */
	@Test
	void set_ValueTest()
	{
		Tup2dC t = mock(Tup2dC.class);
		
		when(t.set(1.0)).thenCallRealMethod();
		
		when(t.set(1.0, 1.0)).thenReturn(t);
		
		assertSame(t, t.set(1.0));
		
		verify(t).set(1.0);

		verify(t).set(1.0, 1.0);
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup2dC#set(double, double)} adopts
	 * the values and returns the current instance.
	 */
	@Test
	void setTest()
	{
		Tup2dC t = mock(Tup2dC.class);
		
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
	 * This test ensures, that the function {@link Tup2dC#set(TupdR)} adopts the
	 * values from the input tuple and returns the current instance.
	 */
	@Test
	void set_TupleTest()
	{
		Tup2dC t = mock(Tup2dC.class);
		TupdR t2 = mock(TupdR.class);
		
		when(t.set(t2)).thenCallRealMethod();
		
		when(t2.toArray()).thenReturn(new double[] {1.0, 2.0});
		when(t.setArray(new double[] {1.0, 2.0})).thenReturn(t);

		assertSame(t, t.set(t2));
		
		verify(t).set(t2);
		
		verify(t2).toArray();
		verify(t).setArray(new double[] {1.0, 2.0});

		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup2dC#setByIndex(int, double)} adopts the
	 * value to the x component if the index is 0 and returns the current instance.
	 */
	@Test
	void setByIndex_XTest()
	{
		Tup2dC t = mock(Tup2dC.class);
		
		when(t.setByIndex(0, 1.0)).thenCallRealMethod();
		
		when(t.setX(1.0)).thenReturn(t);
		
		assertSame(t, t.setByIndex(0, 1.0));
		
		verify(t).setByIndex(0, 1.0);
		
		verify(t).setX(1.0);
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup2dC#setByIndex(int, double)} adopts the
	 * value to the y component if the index is 1 and returns the current instance.
	 */
	@Test
	void setByIndex_YTest()
	{
		Tup2dC t = mock(Tup2dC.class);
		
		when(t.setByIndex(1, 1.0)).thenCallRealMethod();
		
		when(t.setY(1.0)).thenReturn(t);
		
		assertSame(t, t.setByIndex(1, 1.0));
		
		verify(t).setByIndex(1, 1.0);
		
		verify(t).setY(1.0);
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup2dC#setByIndex(int, double)} throws
	 * an {@link IndexOutOfBoundsException} for an index different than 0 or 1.
	 */
	@Test
	void setByIndex_ExceptionTest()
	{
		Tup2dC t = mock(Tup2dC.class);
		
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
