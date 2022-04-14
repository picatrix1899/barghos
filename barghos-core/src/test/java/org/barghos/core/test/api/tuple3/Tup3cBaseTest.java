package org.barghos.core.test.api.tuple3;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;
import org.barghos.core.api.tuple.TupcBase;
import org.barghos.core.api.tuple.TupcR;
import org.barghos.core.api.tuple3.Tup3cBase;
import org.barghos.core.api.tuple3.Tup3cR;

/**
 * This class provides comoponent tests for the interface {@link Tup3cBase}.
 * 
 * @author picatrix1899
 */
class Tup3cBaseTest
{
	/**
	 * This test ensures, that the interface extends the interface {@link Tup3cR}.
	 */
	@Test
	void inheritance_Tup3cRTest()
	{
		assertTrue(Tup3cR.class.isAssignableFrom(Tup3cBase.class));
	}
	
	/**
	 * This test ensures, that the interface extends the interface {@link TupcBase}.
	 */
	@Test
	void inheritance_TupcBaseTest()
	{
		assertTrue(TupcBase.class.isAssignableFrom(Tup3cBase.class));
	}
	
	/**
	 * This test ensures, that the function {@link Tup3cBase#set(Tup3cR)} adopts the
	 * values from the input tuple and returns the current instance.
	 */
	@Test
	void set_Tuple2Test()
	{
		Tup3cBase t = mock(Tup3cBase.class);
		Tup3cR t2 = mock(Tup3cR.class);
		
		when(t.set(t2)).thenCallRealMethod();
		
		when(t2.getX()).thenReturn('a');
		when(t2.getY()).thenReturn('b');
		when(t2.getZ()).thenReturn('c');
		when(t.set('a', 'b', 'c')).thenReturn(t);
		
		assertSame(t, t.set(t2));
		
		verify(t).set(t2);
		
		verify(t2).getX();
		verify(t2).getY();
		verify(t2).getZ();
		verify(t).set('a', 'b', 'c');
		
		verifyNoMoreInteractions(t, t2);
	}
	
	/**
	 * This test ensures, that the function {@link Tup3cBase#set(char)} adopts the
	 * value for each component and returns the current instance.
	 */
	@Test
	void set_ValueTest()
	{
		Tup3cBase t = mock(Tup3cBase.class);
		
		when(t.set('a')).thenCallRealMethod();
		
		when(t.set('a', 'a', 'a')).thenReturn(t);
		
		assertSame(t, t.set('a'));
		
		verify(t).set('a');

		verify(t).set('a', 'a', 'a');
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup3cBase#set(char, char, char)} adopts
	 * the values and returns the current instance.
	 */
	@Test
	void setTest()
	{
		Tup3cBase t = mock(Tup3cBase.class);
		
		when(t.set('a', 'b', 'c')).thenCallRealMethod();
		
		when(t.setX('a')).thenReturn(t);
		when(t.setY('b')).thenReturn(t);
		when(t.setZ('c')).thenReturn(t);
		
		assertSame(t, t.set('a', 'b', 'c'));
		
		verify(t).set('a', 'b', 'c');

		verify(t).setX('a');
		verify(t).setY('b');
		verify(t).setZ('c');
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup3cBase#set(TupcR)} adopts the
	 * values from the input tuple and returns the current instance.
	 */
	@Test
	void set_TupleTest()
	{
		Tup3cBase t = mock(Tup3cBase.class);
		TupcR t2 = mock(TupcR.class);
		
		when(t.set(t2)).thenCallRealMethod();
		
		when(t2.toArray()).thenReturn(new char[] {'a', 'b', 'c'});
		when(t.setArray(new char[] {'a', 'b', 'c'})).thenReturn(t);

		assertSame(t, t.set(t2));
		
		verify(t).set(t2);
		
		verify(t2).toArray();
		verify(t).setArray(new char[] {'a', 'b', 'c'});

		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup3cBase#setArray(char[])} adopts the
	 * values and returns the current instance.
	 */
	@Test
	void setArrayTest()
	{
		Tup3cBase t = mock(Tup3cBase.class);
		
		when(t.setArray(new char[] {'a', 'b', 'c'})).thenCallRealMethod();
		
		when(t.set('a', 'b', 'c')).thenReturn(t);
		
		assertSame(t, t.setArray(new char[] {'a', 'b', 'c'}));
		
		verify(t).setArray(new char[] {'a', 'b', 'c'});
		
		verify(t).set('a', 'b', 'c');
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup3cBase#setByIndex(int, char)} adopts the
	 * value to the x component if the index is 0 and returns the current instance.
	 */
	@Test
	void setByIndex_XTest()
	{
		Tup3cBase t = mock(Tup3cBase.class);
		
		when(t.setByIndex(0, 'a')).thenCallRealMethod();
		
		when(t.setX('a')).thenReturn(t);
		
		assertSame(t, t.setByIndex(0, 'a'));
		
		verify(t).setByIndex(0, 'a');
		
		verify(t).setX('a');
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup3cBase#setByIndex(int, char)} adopts the
	 * value to the y component if the index is 1 and returns the current instance.
	 */
	@Test
	void setByIndex_YTest()
	{
		Tup3cBase t = mock(Tup3cBase.class);
		
		when(t.setByIndex(1, 'a')).thenCallRealMethod();
		
		when(t.setY('a')).thenReturn(t);
		
		assertSame(t, t.setByIndex(1, 'a'));
		
		verify(t).setByIndex(1, 'a');
		
		verify(t).setY('a');
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup3cBase#setByIndex(int, char)} adopts the
	 * value to the z component if the index is 2 and returns the current instance.
	 */
	@Test
	void setByIndex_ZTest()
	{
		Tup3cBase t = mock(Tup3cBase.class);
		
		when(t.setByIndex(2, 'a')).thenCallRealMethod();
		
		when(t.setZ('a')).thenReturn(t);
		
		assertSame(t, t.setByIndex(2, 'a'));
		
		verify(t).setByIndex(2, 'a');
		
		verify(t).setZ('a');
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup3cBase#setByIndex(int, char)} throws
	 * an {@link IndexOutOfBoundsException} for an index different than 0, 1 or 2.
	 */
	@Test
	void setByIndex_ExceptionTest()
	{
		Tup3cBase t = mock(Tup3cBase.class);
		
		when(t.setByIndex(3, 'a')).thenCallRealMethod();

		assertThrows(IndexOutOfBoundsException.class, new Executable() {
			public void execute() throws Throwable
			{
				t.setByIndex(3, 'a');
			}
		});

		verify(t).setByIndex(3, 'a');

		verifyNoMoreInteractions(t);
	}
}
