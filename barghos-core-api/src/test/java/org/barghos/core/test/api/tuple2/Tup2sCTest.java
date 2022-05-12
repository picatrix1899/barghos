package org.barghos.core.test.api.tuple2;

import static org.barghos.testutils.TestObjectFactory.*;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;
import org.barghos.core.api.tuple.TupsC;
import org.barghos.core.api.tuple.TupsR;
import org.barghos.core.api.tuple2.Tup2sC;
import org.barghos.core.api.tuple2.Tup2sR;

/**
 * This class provides component tests for the interface {@link Tup2sC}.
 * 
 * @author picatrix1899
 */
class Tup2sCTest
{
	/**
	 * This test ensures, that the interface extends the interface {@link Tup2sR}.
	 */
	@Test
	void inheritance_Tup2sRTest()
	{
		assertTrue(Tup2sR.class.isAssignableFrom(Tup2sC.class));
	}
	
	/**
	 * This test ensures, that the interface extends the interface {@link Tup2sC}.
	 */
	@Test
	void inheritance_TupsCTest()
	{
		assertTrue(TupsC.class.isAssignableFrom(Tup2sC.class));
	}
	
	/**
	 * This test ensures, that the function {@link Tup2sC#set(Tup2sR)} adopts the
	 * values from the input tuple and returns the current instance.
	 */
	@Test
	void set_Tuple2Test()
	{
		Tup2sC t = mock(Tup2sC.class);
		Tup2sR t2 = mock(Tup2sR.class);
		
		when(t.set(t2)).thenCallRealMethod();
		
		when(t2.getX()).thenReturn(s(1));
		when(t2.getY()).thenReturn(s(2));
		when(t.set(s(1), s(2))).thenReturn(t);
		
		assertSame(t, t.set(t2));
		
		verify(t).set(t2);
		
		verify(t2).getX();
		verify(t2).getY();
		verify(t).set(s(1), s(2));
		
		verifyNoMoreInteractions(t, t2);
	}
	
	/**
	 * This test ensures, that the function {@link Tup2sC#set(short)} adopts the
	 * value for each component and returns the current instance.
	 */
	@Test
	void set_ValueTest()
	{
		Tup2sC t = mock(Tup2sC.class);
		
		when(t.set(s(1))).thenCallRealMethod();
		
		when(t.set(s(1), s(1))).thenReturn(t);
		
		assertSame(t, t.set(s(1)));
		
		verify(t).set(s(1));

		verify(t).set(s(1), s(1));
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup2sC#set(short, short)} adopts
	 * the values and returns the current instance.
	 */
	@Test
	void setTest()
	{
		Tup2sC t = mock(Tup2sC.class);
		
		when(t.set(s(1), s(2))).thenCallRealMethod();
		
		when(t.setX(s(1))).thenReturn(t);
		when(t.setY(s(2))).thenReturn(t);
		
		assertSame(t, t.set(s(1), s(2)));
		
		verify(t).set(s(1), s(2));

		verify(t).setX(s(1));
		verify(t).setY(s(2));
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup2sC#set(TupsR)} adopts the
	 * values from the input tuple and returns the current instance.
	 */
	@Test
	void set_TupleTest()
	{
		Tup2sC t = mock(Tup2sC.class);
		TupsR t2 = mock(TupsR.class);
		
		when(t.set(t2)).thenCallRealMethod();
		
		when(t2.toArray()).thenReturn(sArray(1, 2));
		when(t.setArray(sArray(1, 2))).thenReturn(t);

		assertSame(t, t.set(t2));
		
		verify(t).set(t2);
		
		verify(t2).toArray();
		verify(t).setArray(sArray(1, 2));

		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup2sC#setArray(short[])} adopts the
	 * values and returns the current instance.
	 */
	@Test
	void setArrayTest()
	{
		Tup2sC t = mock(Tup2sC.class);
		
		when(t.setArray(sArray(1, 2))).thenCallRealMethod();
		
		when(t.set(s(1), s(2))).thenReturn(t);
		
		assertSame(t, t.setArray(sArray(1, 2)));
		
		verify(t).setArray(sArray(1, 2));
		
		verify(t).set(s(1), s(2));
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup2sC#setByIndex(int, short)} adopts the
	 * value to the x component if the index is 0 and returns the current instance.
	 */
	@Test
	void setByIndex_XTest()
	{
		Tup2sC t = mock(Tup2sC.class);
		
		when(t.setByIndex(0, s(1))).thenCallRealMethod();
		
		when(t.setX(s(1))).thenReturn(t);
		
		assertSame(t, t.setByIndex(0, s(1)));
		
		verify(t).setByIndex(0, s(1));
		
		verify(t).setX(s(1));
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup2sC#setByIndex(int, short)} adopts the
	 * value to the y component if the index is 1 and returns the current instance.
	 */
	@Test
	void setByIndex_YTest()
	{
		Tup2sC t = mock(Tup2sC.class);
		
		when(t.setByIndex(1, s(1))).thenCallRealMethod();
		
		when(t.setY(s(1))).thenReturn(t);
		
		assertSame(t, t.setByIndex(1, s(1)));
		
		verify(t).setByIndex(1, s(1));
		
		verify(t).setY(s(1));
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup2sC#setByIndex(int, short)} throws
	 * an {@link IndexOutOfBoundsException} for an index different than 0 or 1.
	 */
	@Test
	void setByIndex_ExceptionTest()
	{
		Tup2sC t = mock(Tup2sC.class);
		
		when(t.setByIndex(2, s(1))).thenCallRealMethod();

		assertThrows(IndexOutOfBoundsException.class, new Executable() {
			public void execute() throws Throwable
			{
				t.setByIndex(2, s(1));
			}
		});

		verify(t).setByIndex(2, s(1));

		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup2sC#shallowClone()} calls
	 * by default the standard {@link Tup2sC#clone()}-function.
	 */
	@Test
	void shallowCloneTest()
	{
		Tup2sC t = mock(Tup2sC.class);
		Tup2sC res = mock(Tup2sC.class);
		
		when(t.shallowClone()).thenCallRealMethod();
		when(t.clone()).thenReturn(res);
		
		assertSame(res, t.shallowClone());
		
		verify(t).shallowClone();
		verify(t).clone();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup2sC#deepClone()} calls
	 * by default the standard {@link Tup2sC#clone()}-function.
	 */
	@Test
	void deepCloneTest()
	{
		Tup2sC t = mock(Tup2sC.class);
		Tup2sC res = mock(Tup2sC.class);

		when(t.deepClone()).thenCallRealMethod();
		when(t.clone()).thenReturn(res);
		
		assertSame(res, t.deepClone());
		
		verify(t).deepClone();
		verify(t).clone();
		
		verifyNoMoreInteractions(t);
	}
}
