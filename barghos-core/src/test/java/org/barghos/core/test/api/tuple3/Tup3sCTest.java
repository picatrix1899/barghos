package org.barghos.core.test.api.tuple3;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import static org.barghos.core.api.testing.TestObjectFactory.*;

import org.barghos.core.api.tuple.TupsC;
import org.barghos.core.api.tuple.TupsR;
import org.barghos.core.api.tuple3.Tup3sC;
import org.barghos.core.api.tuple3.Tup3sR;

/**
 * This class provides component tests for the interface {@link Tup3sC}.
 * 
 * @author picatrix1899
 */
class Tup3sCTest
{
	/**
	 * This test ensures, that the interface extends the interface {@link Tup3sR}.
	 */
	@Test
	void inheritance_Tup3sRTest()
	{
		assertTrue(Tup3sR.class.isAssignableFrom(Tup3sC.class));
	}
	
	/**
	 * This test ensures, that the interface extends the interface {@link Tup3sC}.
	 */
	@Test
	void inheritance_TupsCTest()
	{
		assertTrue(TupsC.class.isAssignableFrom(Tup3sC.class));
	}
	
	/**
	 * This test ensures, that the function {@link Tup3sC#set(Tup3sR)} adopts the
	 * values from the input tuple and returns the current instance.
	 */
	@Test
	void set_Tuple2Test()
	{
		Tup3sC t = mock(Tup3sC.class);
		Tup3sR t2 = mock(Tup3sR.class);
		
		when(t.set(t2)).thenCallRealMethod();
		
		when(t2.getX()).thenReturn(s(1));
		when(t2.getY()).thenReturn(s(2));
		when(t2.getZ()).thenReturn(s(3));
		when(t.set(s(1), s(2), s(3))).thenReturn(t);
		
		assertSame(t, t.set(t2));
		
		verify(t).set(t2);
		
		verify(t2).getX();
		verify(t2).getY();
		verify(t2).getZ();
		verify(t).set(s(1), s(2), s(3));
		
		verifyNoMoreInteractions(t, t2);
	}
	
	/**
	 * This test ensures, that the function {@link Tup3sC#set(short)} adopts the
	 * value for each component and returns the current instance.
	 */
	@Test
	void set_ValueTest()
	{
		Tup3sC t = mock(Tup3sC.class);
		
		when(t.set(s(1))).thenCallRealMethod();
		
		when(t.set(s(1), s(1), s(1))).thenReturn(t);
		
		assertSame(t, t.set(s(1)));
		
		verify(t).set(s(1));

		verify(t).set(s(1), s(1), s(1));
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup3sC#set(short, short, short)} adopts
	 * the values and returns the current instance.
	 */
	@Test
	void setTest()
	{
		Tup3sC t = mock(Tup3sC.class);
		
		when(t.set(s(1), s(2), s(3))).thenCallRealMethod();
		
		when(t.setX(s(1))).thenReturn(t);
		when(t.setY(s(2))).thenReturn(t);
		when(t.setZ(s(3))).thenReturn(t);
		
		assertSame(t, t.set(s(1), s(2), s(3)));
		
		verify(t).set(s(1), s(2), s(3));

		verify(t).setX(s(1));
		verify(t).setY(s(2));
		verify(t).setZ(s(3));
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup3sC#set(TupsR)} adopts the
	 * values from the input tuple and returns the current instance.
	 */
	@Test
	void set_TupleTest()
	{
		Tup3sC t = mock(Tup3sC.class);
		TupsR t2 = mock(TupsR.class);
		
		when(t.set(t2)).thenCallRealMethod();
		
		when(t2.toArray()).thenReturn(sArray(1, 2, 3));
		when(t.setArray(sArray(1, 2, 3))).thenReturn(t);

		assertSame(t, t.set(t2));
		
		verify(t).set(t2);
		
		verify(t2).toArray();
		verify(t).setArray(sArray(1, 2, 3));

		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup3sC#setByIndex(int, short)} adopts the
	 * value to the x component if the index is 0 and returns the current instance.
	 */
	@Test
	void setByIndex_XTest()
	{
		Tup3sC t = mock(Tup3sC.class);
		
		when(t.setByIndex(0, s(1))).thenCallRealMethod();
		
		when(t.setX(s(1))).thenReturn(t);
		
		assertSame(t, t.setByIndex(0, s(1)));
		
		verify(t).setByIndex(0, s(1));
		
		verify(t).setX(s(1));
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup3sC#setByIndex(int, short)} adopts the
	 * value to the y component if the index is 1 and returns the current instance.
	 */
	@Test
	void setByIndex_YTest()
	{
		Tup3sC t = mock(Tup3sC.class);
		
		when(t.setByIndex(1, s(1))).thenCallRealMethod();
		
		when(t.setY(s(1))).thenReturn(t);
		
		assertSame(t, t.setByIndex(1, s(1)));
		
		verify(t).setByIndex(1, s(1));
		
		verify(t).setY(s(1));
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup3sC#setByIndex(int, short)} adopts the
	 * value to the z component if the index is 2 and returns the current instance.
	 */
	@Test
	void setByIndex_ZTest()
	{
		Tup3sC t = mock(Tup3sC.class);
		
		when(t.setByIndex(2, s(2))).thenCallRealMethod();
		
		when(t.setZ(s(2))).thenReturn(t);
		
		assertSame(t, t.setByIndex(2, s(2)));
		
		verify(t).setByIndex(2, s(2));
		
		verify(t).setZ(s(2));
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup3sC#setByIndex(int, short)} throws
	 * an {@link IndexOutOfBoundsException} for an index different than 0, 1 or 2.
	 */
	@Test
	void setByIndex_ExceptionTest()
	{
		Tup3sC t = mock(Tup3sC.class);
		
		when(t.setByIndex(3, s(1))).thenCallRealMethod();

		assertThrows(IndexOutOfBoundsException.class, new Executable() {
			public void execute() throws Throwable
			{
				t.setByIndex(3, s(1));
			}
		});

		verify(t).setByIndex(3, s(1));

		verifyNoMoreInteractions(t);
	}
}
