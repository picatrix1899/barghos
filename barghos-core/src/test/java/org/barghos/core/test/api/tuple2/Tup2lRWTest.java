package org.barghos.core.test.api.tuple2;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import org.barghos.core.api.tuple.TuplR;
import org.barghos.core.api.tuple.TuplRW;
import org.barghos.core.api.tuple2.Tup2lR;
import org.barghos.core.api.tuple2.Tup2lRW;
import org.barghos.core.api.tuple2.Tup2lW;

/**
 * This class provides comoponent tests for the interface {@link Tup2lRW}.
 * 
 * @author picatrix1899
 */
class Tup2lRWTest
{
	/**
	 * This test ensures, that the interface extends the interface {@link Tup2lR}.
	 */
	@Test
	void inheritance_Tup2lRTest()
	{
		assertTrue(Tup2lR.class.isAssignableFrom(Tup2lRW.class));
	}
	
	/**
	 * This test ensures, that the interface extends the interface {@link Tup2lW}.
	 */
	@Test
	void inheritance_Tup2lWTest()
	{
		assertTrue(Tup2lW.class.isAssignableFrom(Tup2lRW.class));
	}
	
	/**
	 * This test ensures, that the interface extends the interface {@link TuplRW}.
	 */
	@Test
	void inheritance_TuplRWTest()
	{
		assertTrue(TuplRW.class.isAssignableFrom(Tup2lRW.class));
	}
	
	/**
	 * This test ensures, that the default implementation of the function {@link Tup2lRW#getNewInstance(Tup2lR)} calls
	 * the function {@link Tup2lRW#getNewInstance(long, long)} with the correct components.
	 */
	@Test
	void getNewInstance_Tuple2Test()
	{
		Tup2lR original = mock(Tup2lR.class);
		Tup2lRW newInstance = mock(Tup2lRW.class);
		Tup2lRW t = mock(Tup2lRW.class);
		
		when(t.getNewInstance(original)).thenCallRealMethod();
		
		when(original.getX()).thenReturn(1l);
		when(original.getY()).thenReturn(2l);
		when(t.getNewInstance(1l, 2l)).thenReturn(newInstance);
		
		assertSame(newInstance, t.getNewInstance(original));
		
		verify(t).getNewInstance(original);
		
		verify(original).getX();
		verify(original).getY();
		verify(t).getNewInstance(1l, 2l);
		
		verifyNoMoreInteractions(t, original);
	}
	
	/**
	 * This test ensures, that the default implementation of the function {@link Tup2lRW#getNewInstance(long)} calls
	 * the function {@link Tup2lRW#getNewInstance(long, long)} with the correct components.
	 */
	@Test
	void getNewInstance_ValueTest()
	{
		Tup2lRW newInstance = mock(Tup2lRW.class);
		Tup2lRW t = mock(Tup2lRW.class);
		
		when(t.getNewInstance(1l)).thenCallRealMethod();

		when(t.getNewInstance(1l, 1l)).thenReturn(newInstance);
		
		assertSame(newInstance, t.getNewInstance(1l));
		
		verify(t).getNewInstance(1l);
		
		verify(t).getNewInstance(1l, 1l);
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the default implementation of the function {@link Tup2lRW#getNewInstance(TuplR)} calls
	 * the function {@link Tup2lRW#getNewInstance(long, long)} with the correct components.
	 */
	@Test
	void getNewInstance_TupleTest()
	{
		TuplR original = mock(TuplR.class);
		Tup2lRW newInstance = mock(Tup2lRW.class);
		Tup2lRW t = mock(Tup2lRW.class);
		
		when(t.getNewInstance(original)).thenCallRealMethod();
		
		when(original.getArray()).thenReturn(new long[] {1l, 2l});
		when(t.getNewInstance(1l, 2l)).thenReturn(newInstance);
		
		assertSame(newInstance, t.getNewInstance(original));
		
		verify(t).getNewInstance(original);
		
		verify(original).getArray();
		verify(t).getNewInstance(1l, 2l);
		
		verifyNoMoreInteractions(t, original);
	}
	
	/**
	 * This test ensures, that the default implementation of the function {@link Tup2lRW#getNewInstanceFromArray(long[])} calls
	 * the function {@link Tup2lRW#getNewInstance(long, long)} with the correct components.
	 */
	@Test
	void getNewInstanceFromArrayTest()
	{
		Tup2lRW newInstance = mock(Tup2lRW.class);
		Tup2lRW t = mock(Tup2lRW.class);
		
		when(t.getNewInstanceFromArray(new long[] {1l, 2l})).thenCallRealMethod();

		when(t.getNewInstance(1l, 2l)).thenReturn(newInstance);
		
		assertSame(newInstance, t.getNewInstanceFromArray(new long[] {1l, 2l}));
		
		verify(t).getNewInstanceFromArray(new long[] {1l, 2l});
		
		verify(t).getNewInstance(1l, 2l);
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * this test ensures, that the function {@link Tup2lRW#getDimensions()} always
	 * returns 2 and does not make any calls.
	 */
	@Test
	void getDimensionsTest()
	{
		Tup2lRW t = mock(Tup2lRW.class);
		
		when(t.getDimensions()).thenCallRealMethod();
		
		assertEquals(2, t.getDimensions());
		
		verify(t).getDimensions();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup2lRW#set(Tup2lR)} adopts the
	 * values from the input tuple and returns the current instance.
	 */
	@Test
	void set_Tuple2Test()
	{
		Tup2lRW t = mock(Tup2lRW.class);
		Tup2lR t2 = mock(Tup2lR.class);
		
		when(t.set(t2)).thenCallRealMethod();
		
		when(t2.getX()).thenReturn(1l);
		when(t2.getY()).thenReturn(2l);
		when(t.set(1l, 2l)).thenReturn(t);
		
		assertSame(t, t.set(t2));
		
		verify(t).set(t2);
		
		verify(t2).getX();
		verify(t2).getY();
		verify(t).set(1l, 2l);
		
		verifyNoMoreInteractions(t, t2);
	}
	
	/**
	 * This test ensures, that the function {@link Tup2lRW#set(long)} adopts the
	 * value for each component and returns the current instance.
	 */
	@Test
	void set_ValueTest()
	{
		Tup2lRW t = mock(Tup2lRW.class);
		
		when(t.set(1l)).thenCallRealMethod();
		
		when(t.set(1l, 1l)).thenReturn(t);
		
		assertSame(t, t.set(1l));
		
		verify(t).set(1l);

		verify(t).set(1l, 1l);
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup2lRW#set(long, long)} adopts
	 * the values and returns the current instance.
	 */
	@Test
	void setTest()
	{
		Tup2lRW t = mock(Tup2lRW.class);
		
		when(t.set(1l, 2l)).thenCallRealMethod();
		
		when(t.setX(1l)).thenReturn(t);
		when(t.setY(2l)).thenReturn(t);
		
		assertSame(t, t.set(1l, 2l));
		
		verify(t).set(1l, 2l);

		verify(t).setX(1l);
		verify(t).setY(2l);
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup2lRW#set(TuplR)} adopts the
	 * values from the input tuple and returns the current instance.
	 */
	@Test
	void set_TupleTest()
	{
		Tup2lRW t = mock(Tup2lRW.class);
		TuplR t2 = mock(TuplR.class);
		
		when(t.set(t2)).thenCallRealMethod();
		
		when(t2.getArray()).thenReturn(new long[] {1l, 2l});
		when(t.set(1l, 2l)).thenReturn(t);

		assertSame(t, t.set(t2));
		
		verify(t).set(t2);
		
		verify(t2).getArray();
		verify(t).set(1l, 2l);

		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup2lRW#setArray(long[])} adopts the
	 * values and returns the current instance.
	 */
	@Test
	void setArrayTest()
	{
		Tup2lRW t = mock(Tup2lRW.class);
		
		when(t.setArray(new long[] {1l, 2l})).thenCallRealMethod();
		
		when(t.set(1l, 2l)).thenReturn(t);
		
		assertSame(t, t.setArray(new long[] {1l, 2l}));
		
		verify(t).setArray(new long[] {1l, 2l});
		
		verify(t).set(1l, 2l);
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup2lRW#setByIndex(int, long)} adopts the
	 * value to the x component if the index is 0 and returns the current instance.
	 */
	@Test
	void setByIndex_XTest()
	{
		Tup2lRW t = mock(Tup2lRW.class);
		
		when(t.setByIndex(0, 1l)).thenCallRealMethod();
		
		when(t.setX(1l)).thenReturn(t);
		
		assertSame(t, t.setByIndex(0, 1l));
		
		verify(t).setByIndex(0, 1l);
		
		verify(t).setX(1l);
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup2lRW#setByIndex(int, long)} adopts the
	 * value to the y component if the index is 1 and returns the current instance.
	 */
	@Test
	void setByIndex_YTest()
	{
		Tup2lRW t = mock(Tup2lRW.class);
		
		when(t.setByIndex(1, 1l)).thenCallRealMethod();
		
		when(t.setY(1l)).thenReturn(t);
		
		assertSame(t, t.setByIndex(1, 1l));
		
		verify(t).setByIndex(1, 1l);
		
		verify(t).setY(1l);
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup2lRW#setByIndex(int, long)} throws
	 * an {@link IndexOutOfBoundsException} for an index different than 0 or 1.
	 */
	@Test
	void setByIndex_ExceptionTest()
	{
		Tup2lRW t = mock(Tup2lRW.class);
		
		when(t.setByIndex(2, 1l)).thenCallRealMethod();

		assertThrows(IndexOutOfBoundsException.class, new Executable() {
			public void execute() throws Throwable
			{
				t.setByIndex(2, 1l);
			}
		});

		verify(t).setByIndex(2, 1l);

		verifyNoMoreInteractions(t);
	}
}
