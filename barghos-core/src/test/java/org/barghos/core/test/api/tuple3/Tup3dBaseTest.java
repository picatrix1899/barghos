package org.barghos.core.test.api.tuple3;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;
import org.barghos.core.api.tuple.TupdBase;
import org.barghos.core.api.tuple.TupdR;
import org.barghos.core.api.tuple3.Tup3dBase;
import org.barghos.core.api.tuple3.Tup3dR;

/**
 * This class provides comoponent tests for the interface {@link Tup3dBase}.
 * 
 * @author picatrix1899
 */
class Tup3dBaseTest
{
	/**
	 * This test ensures, that the interface extends the interface {@link Tup3dR}.
	 */
	@Test
	void inheritance_Tup3dRTest()
	{
		assertTrue(Tup3dR.class.isAssignableFrom(Tup3dBase.class));
	}
	
	/**
	 * This test ensures, that the interface extends the interface {@link TupdBase}.
	 */
	@Test
	void inheritance_TupdBaseTest()
	{
		assertTrue(TupdBase.class.isAssignableFrom(Tup3dBase.class));
	}
	
	/**
	 * this test ensures, that the function {@link Tup3dBase#getDimensions()} always
	 * returns 3 and does not make any calls.
	 */
	@Test
	void getDimensionsTest()
	{
		Tup3dBase t = mock(Tup3dBase.class);
		
		when(t.getDimensions()).thenCallRealMethod();
		
		assertEquals(3, t.getDimensions());
		
		verify(t).getDimensions();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup3dBase#set(Tup3dR)} adopts the
	 * values from the input tuple and returns the current instance.
	 */
	@Test
	void set_Tuple2Test()
	{
		Tup3dBase t = mock(Tup3dBase.class);
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
	 * This test ensures, that the function {@link Tup3dBase#set(double)} adopts the
	 * value for each component and returns the current instance.
	 */
	@Test
	void set_ValueTest()
	{
		Tup3dBase t = mock(Tup3dBase.class);
		
		when(t.set(1.0)).thenCallRealMethod();
		
		when(t.set(1.0, 1.0, 1.0)).thenReturn(t);
		
		assertSame(t, t.set(1.0));
		
		verify(t).set(1.0);

		verify(t).set(1.0, 1.0, 1.0);
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup3dBase#set(double, double)} adopts
	 * the values and returns the current instance.
	 */
	@Test
	void setTest()
	{
		Tup3dBase t = mock(Tup3dBase.class);
		
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
	 * This test ensures, that the function {@link Tup3dBase#set(TupdR)} adopts the
	 * values from the input tuple and returns the current instance.
	 */
	@Test
	void set_TupleTest()
	{
		Tup3dBase t = mock(Tup3dBase.class);
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
	 * This test ensures, that the function {@link Tup3dBase#setArray(double[])} adopts the
	 * values and returns the current instance.
	 */
	@Test
	void setArrayTest()
	{
		Tup3dBase t = mock(Tup3dBase.class);
		
		when(t.setArray(new double[] {1.0, 2.0, 3.0})).thenCallRealMethod();
		
		when(t.set(1.0, 2.0, 3.0)).thenReturn(t);
		
		assertSame(t, t.setArray(new double[] {1.0, 2.0, 3.0}));
		
		verify(t).setArray(new double[] {1.0, 2.0, 3.0});
		
		verify(t).set(1.0, 2.0, 3.0);
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup3dBase#setByIndex(int, double)} adopts the
	 * value to the x component if the index is 0 and returns the current instance.
	 */
	@Test
	void setByIndex_XTest()
	{
		Tup3dBase t = mock(Tup3dBase.class);
		
		when(t.setByIndex(0, 1.0)).thenCallRealMethod();
		
		when(t.setX(1.0)).thenReturn(t);
		
		assertSame(t, t.setByIndex(0, 1.0));
		
		verify(t).setByIndex(0, 1.0);
		
		verify(t).setX(1.0);
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup3dBase#setByIndex(int, double)} adopts the
	 * value to the y component if the index is 1 and returns the current instance.
	 */
	@Test
	void setByIndex_YTest()
	{
		Tup3dBase t = mock(Tup3dBase.class);
		
		when(t.setByIndex(1, 1.0)).thenCallRealMethod();
		
		when(t.setY(1.0)).thenReturn(t);
		
		assertSame(t, t.setByIndex(1, 1.0));
		
		verify(t).setByIndex(1, 1.0);
		
		verify(t).setY(1.0);
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup3dBase#setByIndex(int, double)} adopts the
	 * value to the z component if the index is 2 and returns the current instance.
	 */
	@Test
	void setByIndex_ZTest()
	{
		Tup3dBase t = mock(Tup3dBase.class);
		
		when(t.setByIndex(2, 1.0)).thenCallRealMethod();
		
		when(t.setZ(1.0)).thenReturn(t);
		
		assertSame(t, t.setByIndex(2, 1.0));
		
		verify(t).setByIndex(2, 1.0);
		
		verify(t).setZ(1.0);
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup3dBase#setByIndex(int, double)} throws
	 * an {@link IndexOutOfBoundsException} for an index different than 0, 1 or 2.
	 */
	@Test
	void setByIndex_ExceptionTest()
	{
		Tup3dBase t = mock(Tup3dBase.class);
		
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
