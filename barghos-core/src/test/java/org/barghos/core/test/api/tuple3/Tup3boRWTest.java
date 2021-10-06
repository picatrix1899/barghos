package org.barghos.core.test.api.tuple3;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import org.barghos.core.api.tuple.TupboR;
import org.barghos.core.api.tuple.TupboRW;
import org.barghos.core.api.tuple3.Tup3boR;
import org.barghos.core.api.tuple3.Tup3boRW;
import org.barghos.core.api.tuple3.Tup3boW;

/**
 * This class provides comoponent tests for the interface {@link Tup3boRW}.
 * 
 * @author picatrix1899
 */
class Tup3boRWTest
{
	/**
	 * This test ensures, that the interface extends the interface {@link Tup3boR}.
	 */
	@Test
	void inheritance_Tup3boRTest()
	{
		assertTrue(Tup3boR.class.isAssignableFrom(Tup3boRW.class));
	}
	
	/**
	 * This test ensures, that the interface extends the interface {@link Tup3boW}.
	 */
	@Test
	void inheritance_Tup3boWTest()
	{
		assertTrue(Tup3boW.class.isAssignableFrom(Tup3boRW.class));
	}
	
	/**
	 * This test ensures, that the interface extends the interface {@link TupboRW}.
	 */
	@Test
	void inheritance_TupboRWTest()
	{
		assertTrue(TupboRW.class.isAssignableFrom(Tup3boRW.class));
	}
	
	/**
	 * This test ensures, that the default implementation of the function {@link Tup3boRW#getNewInstance(Tup3boR)} calls
	 * the function {@link Tup3boRW#getNewInstance(boolean, boolean, boolean)} with the correct components.
	 */
	@Test
	void getNewInstance_Tuple2Test()
	{
		Tup3boR original = mock(Tup3boR.class);
		Tup3boRW newInstance = mock(Tup3boRW.class);
		Tup3boRW t = mock(Tup3boRW.class);
		
		when(t.getNewInstance(original)).thenCallRealMethod();
		
		when(original.getX()).thenReturn(true);
		when(original.getY()).thenReturn(false);
		when(original.getZ()).thenReturn(true);
		when(t.getNewInstance(true, false, true)).thenReturn(newInstance);
		
		assertSame(newInstance, t.getNewInstance(original));
		
		verify(t).getNewInstance(original);
		
		verify(original).getX();
		verify(original).getY();
		verify(original).getZ();
		verify(t).getNewInstance(true, false, true);
		
		verifyNoMoreInteractions(t, original);
	}
	
	/**
	 * This test ensures, that the default implementation of the function {@link Tup3boRW#getNewInstance(boolean)} calls
	 * the function {@link Tup3boRW#getNewInstance(boolean, boolean, boolean)} with the correct components.
	 */
	@Test
	void getNewInstance_ValueTest()
	{
		Tup3boRW newInstance = mock(Tup3boRW.class);
		Tup3boRW t = mock(Tup3boRW.class);
		
		when(t.getNewInstance(true)).thenCallRealMethod();

		when(t.getNewInstance(true, true, true)).thenReturn(newInstance);
		
		assertSame(newInstance, t.getNewInstance(true));
		
		verify(t).getNewInstance(true);
		
		verify(t).getNewInstance(true, true, true);
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the default implementation of the function {@link Tup3boRW#getNewInstance(TupboR)} calls
	 * the function {@link Tup3boRW#getNewInstance(boolean, boolean, boolean)} with the correct components.
	 */
	@Test
	void getNewInstance_TupleTest()
	{
		TupboR original = mock(TupboR.class);
		Tup3boRW newInstance = mock(Tup3boRW.class);
		Tup3boRW t = mock(Tup3boRW.class);
		
		when(t.getNewInstance(original)).thenCallRealMethod();
		
		when(original.getArray()).thenReturn(new boolean[] {true, false, true});
		when(t.getNewInstance(true, false, true)).thenReturn(newInstance);
		
		assertSame(newInstance, t.getNewInstance(original));
		
		verify(t).getNewInstance(original);
		
		verify(original).getArray();
		verify(t).getNewInstance(true, false, true);
		
		verifyNoMoreInteractions(t, original);
	}
	
	/**
	 * This test ensures, that the default implementation of the function {@link Tup3boRW#getNewInstanceFromArray(boolean[])} calls
	 * the function {@link Tup3boRW#getNewInstance(boolean, boolean, boolean)} with the correct components.
	 */
	@Test
	void getNewInstanceFromArrayTest()
	{
		Tup3boRW newInstance = mock(Tup3boRW.class);
		Tup3boRW t = mock(Tup3boRW.class);
		
		when(t.getNewInstanceFromArray(new boolean[] {true, false, true})).thenCallRealMethod();

		when(t.getNewInstance(true, false, true)).thenReturn(newInstance);
		
		assertSame(newInstance, t.getNewInstanceFromArray(new boolean[] {true, false, true}));
		
		verify(t).getNewInstanceFromArray(new boolean[] {true, false, true});
		
		verify(t).getNewInstance(true, false, true);
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * this test ensures, that the function {@link Tup3boRW#getDimensions()} always
	 * returns 3 and does not make any calls.
	 */
	@Test
	void getDimensionsTest()
	{
		Tup3boRW t = mock(Tup3boRW.class);
		
		when(t.getDimensions()).thenCallRealMethod();
		
		assertEquals(3, t.getDimensions());
		
		verify(t).getDimensions();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup3boRW#set(Tup3boR)} adopts the
	 * values from the input tuple and returns the current instance.
	 */
	@Test
	void set_Tuple2Test()
	{
		Tup3boRW t = mock(Tup3boRW.class);
		Tup3boR t2 = mock(Tup3boR.class);
		
		when(t.set(t2)).thenCallRealMethod();
		
		when(t2.getX()).thenReturn(true);
		when(t2.getY()).thenReturn(false);
		when(t2.getZ()).thenReturn(true);
		when(t.set(true, false, true)).thenReturn(t);
		
		assertSame(t, t.set(t2));
		
		verify(t).set(t2);
		
		verify(t2).getX();
		verify(t2).getY();
		verify(t2).getZ();
		verify(t).set(true, false, true);
		
		verifyNoMoreInteractions(t, t2);
	}
	
	/**
	 * This test ensures, that the function {@link Tup3boRW#set(boolean)} adopts the
	 * value for each component and returns the current instance.
	 */
	@Test
	void set_ValueTest()
	{
		Tup3boRW t = mock(Tup3boRW.class);
		
		when(t.set(true)).thenCallRealMethod();
		
		when(t.set(true, true, true)).thenReturn(t);
		
		assertSame(t, t.set(true));
		
		verify(t).set(true);

		verify(t).set(true, true, true);
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup3boRW#set(boolean, boolean, boolean)} adopts
	 * the values and returns the current instance.
	 */
	@Test
	void setTest()
	{
		Tup3boRW t = mock(Tup3boRW.class);
		
		when(t.set(true, false, true)).thenCallRealMethod();
		
		when(t.setX(true)).thenReturn(t);
		when(t.setY(false)).thenReturn(t);
		when(t.setZ(true)).thenReturn(t);
		
		assertSame(t, t.set(true, false, true));
		
		verify(t).set(true, false, true);

		verify(t).setX(true);
		verify(t).setY(false);
		verify(t).setZ(true);
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup3boRW#set(TupboR)} adopts the
	 * values from the input tuple and returns the current instance.
	 */
	@Test
	void set_TupleTest()
	{
		Tup3boRW t = mock(Tup3boRW.class);
		TupboR t2 = mock(TupboR.class);
		
		when(t.set(t2)).thenCallRealMethod();
		
		when(t2.getArray()).thenReturn(new boolean[] {true, false, true});
		when(t.set(true, false, true)).thenReturn(t);

		assertSame(t, t.set(t2));
		
		verify(t).set(t2);
		
		verify(t2).getArray();
		verify(t).set(true, false, true);

		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup3boRW#setArray(boolean[])} adopts the
	 * values and returns the current instance.
	 */
	@Test
	void setArrayTest()
	{
		Tup3boRW t = mock(Tup3boRW.class);
		
		when(t.setArray(new boolean[] {true, false, true})).thenCallRealMethod();
		
		when(t.set(true, false, true)).thenReturn(t);
		
		assertSame(t, t.setArray(new boolean[] {true, false, true}));
		
		verify(t).setArray(new boolean[] {true, false, true});
		
		verify(t).set(true, false, true);
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup3boRW#setByIndex(int, boolean)} adopts the
	 * value to the x component if the index is 0 and returns the current instance.
	 */
	@Test
	void setByIndex_XTest()
	{
		Tup3boRW t = mock(Tup3boRW.class);
		
		when(t.setByIndex(0, true)).thenCallRealMethod();
		
		when(t.setX(true)).thenReturn(t);
		
		assertSame(t, t.setByIndex(0, true));
		
		verify(t).setByIndex(0, true);
		
		verify(t).setX(true);
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup3boRW#setByIndex(int, boolean)} adopts the
	 * value to the y component if the index is 1 and returns the current instance.
	 */
	@Test
	void setByIndex_YTest()
	{
		Tup3boRW t = mock(Tup3boRW.class);
		
		when(t.setByIndex(1, true)).thenCallRealMethod();
		
		when(t.setY(true)).thenReturn(t);
		
		assertSame(t, t.setByIndex(1, true));
		
		verify(t).setByIndex(1, true);
		
		verify(t).setY(true);
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup3boRW#setByIndex(int, boolean)} adopts the
	 * value to the z component if the index is 2 and returns the current instance.
	 */
	@Test
	void setByIndex_ZTest()
	{
		Tup3boRW t = mock(Tup3boRW.class);
		
		when(t.setByIndex(2, true)).thenCallRealMethod();
		
		when(t.setZ(true)).thenReturn(t);
		
		assertSame(t, t.setByIndex(2, true));
		
		verify(t).setByIndex(2, true);
		
		verify(t).setZ(true);
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup3boRW#setByIndex(int, boolean)} throws
	 * an {@link IndexOutOfBoundsException} for an index different than 0, 1 or 2.
	 */
	@Test
	void setByIndex_ExceptionTest()
	{
		Tup3boRW t = mock(Tup3boRW.class);
		
		when(t.setByIndex(3, true)).thenCallRealMethod();

		assertThrows(IndexOutOfBoundsException.class, new Executable() {
			public void execute() throws Throwable
			{
				t.setByIndex(3, true);
			}
		});

		verify(t).setByIndex(3, true);

		verifyNoMoreInteractions(t);
	}
}
