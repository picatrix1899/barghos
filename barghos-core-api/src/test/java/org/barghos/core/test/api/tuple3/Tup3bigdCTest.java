package org.barghos.core.test.api.tuple3;

import static org.barghos.testutils.TestObjectFactory.*;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import java.math.BigDecimal;

import org.barghos.core.api.tuple.TupbigdC;
import org.barghos.core.api.tuple.TupbigdR;
import org.barghos.core.api.tuple3.Tup3bigdC;
import org.barghos.core.api.tuple3.Tup3bigdR;

/**
 * This class provides comoponent tests for the interface {@link Tup3bigdC}.
 * 
 * @author picatrix1899
 */
class Tup3bigdCTest
{
	/**
	 * This test ensures, that the interface extends the interface {@link Tup3bigdR}.
	 */
	@Test
	void inheritance_Tup3bigdRTest()
	{
		assertTrue(Tup3bigdR.class.isAssignableFrom(Tup3bigdC.class));
	}
	
	/**
	 * This test ensures, that the interface extends the interface {@link TupbigdC}.
	 */
	@Test
	void inheritance_TupbigdCTest()
	{
		assertTrue(TupbigdC.class.isAssignableFrom(Tup3bigdC.class));
	}
	
	/**
	 * This test ensures, that the function {@link Tup3bigdC#set(Tup3bigdR)} adopts the
	 * values from the input tuple and returns the current instance.
	 */
	@Test
	void set_Tuple2Test()
	{
		Tup3bigdC t = mock(Tup3bigdC.class);
		Tup3bigdR t2 = mock(Tup3bigdR.class);
		
		when(t.set(t2)).thenCallRealMethod();
		
		when(t2.getX()).thenReturn(bigd(1));
		when(t2.getY()).thenReturn(bigd(2));
		when(t2.getZ()).thenReturn(bigd(3));
		when(t.set(bigd(1), bigd(2), bigd(3))).thenReturn(t);
		
		assertSame(t, t.set(t2));
		
		verify(t).set(t2);
		
		verify(t2).getX();
		verify(t2).getY();
		verify(t2).getZ();
		verify(t).set(bigd(1), bigd(2), bigd(3));
		
		verifyNoMoreInteractions(t, t2);
	}
	
	/**
	 * This test ensures, that the function {@link Tup3bigdC#set(BigDecimal)} adopts the
	 * value for each component and returns the current instance.
	 */
	@Test
	void set_ValueTest()
	{
		Tup3bigdC t = mock(Tup3bigdC.class);
		
		when(t.set(bigd(1))).thenCallRealMethod();
		
		when(t.set(bigd(1), bigd(1), bigd(1))).thenReturn(t);
		
		assertSame(t, t.set(bigd(1)));
		
		verify(t).set(bigd(1));

		verify(t).set(bigd(1), bigd(1), bigd(1));
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup3bigdC#set(BigDecimal, BigDecimal, BigDecimal)} adopts
	 * the values and returns the current instance.
	 */
	@Test
	void setTest()
	{
		Tup3bigdC t = mock(Tup3bigdC.class);
		
		when(t.set(bigd(1), bigd(2), bigd(3))).thenCallRealMethod();
		
		when(t.setX(bigd(1))).thenReturn(t);
		when(t.setY(bigd(2))).thenReturn(t);
		when(t.setZ(bigd(3))).thenReturn(t);
		
		assertSame(t, t.set(bigd(1), bigd(2), bigd(3)));
		
		verify(t).set(bigd(1), bigd(2), bigd(3));

		verify(t).setX(bigd(1));
		verify(t).setY(bigd(2));
		verify(t).setZ(bigd(3));
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup3bigdC#set(TupbigdR)} adopts the
	 * values from the input tuple and returns the current instance.
	 */
	@Test
	void set_TupleTest()
	{
		Tup3bigdC t = mock(Tup3bigdC.class);
		TupbigdR t2 = mock(TupbigdR.class);
		
		when(t.set(t2)).thenCallRealMethod();
		
		when(t2.toArray()).thenReturn(bigdArray(1, 2, 3));
		when(t.setArray(bigdArray(1, 2, 3))).thenReturn(t);

		assertSame(t, t.set(t2));
		
		verify(t).set(t2);
		
		verify(t2).toArray();
		verify(t).setArray(bigdArray(1, 2, 3));

		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup3bigdC#setArray(BigDecimal[])} adopts the
	 * values and returns the current instance.
	 */
	@Test
	void setArrayTest()
	{
		Tup3bigdC t = mock(Tup3bigdC.class);
		
		when(t.setArray(bigdArray(1, 2, 3))).thenCallRealMethod();
		
		when(t.set(bigd(1), bigd(2), bigd(3))).thenReturn(t);
		
		assertSame(t, t.setArray(bigdArray(1, 2, 3)));
		
		verify(t).setArray(bigdArray(1, 2, 3));
		
		verify(t).set(bigd(1), bigd(2), bigd(3));
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup3bigdC#setByIndex(int, BigDecimal)} adopts the
	 * value to the x component if the index is 0 and returns the current instance.
	 */
	@Test
	void setByIndex_XTest()
	{
		Tup3bigdC t = mock(Tup3bigdC.class);
		
		when(t.setByIndex(0, bigd(1))).thenCallRealMethod();
		
		when(t.setX(bigd(1))).thenReturn(t);
		
		assertSame(t, t.setByIndex(0, bigd(1)));
		
		verify(t).setByIndex(0, bigd(1));
		
		verify(t).setX(bigd(1));
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup3bigdC#setByIndex(int, BigDecimal)} adopts the
	 * value to the y component if the index is 1 and returns the current instance.
	 */
	@Test
	void setByIndex_YTest()
	{
		Tup3bigdC t = mock(Tup3bigdC.class);
		
		when(t.setByIndex(1, bigd(1))).thenCallRealMethod();
		
		when(t.setY(bigd(1))).thenReturn(t);
		
		assertSame(t, t.setByIndex(1, bigd(1)));
		
		verify(t).setByIndex(1, bigd(1));
		
		verify(t).setY(bigd(1));
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup3bigdC#setByIndex(int, BigDecimal)} adopts the
	 * value to the z component if the index is 2 and returns the current instance.
	 */
	@Test
	void setByIndex_ZTest()
	{
		Tup3bigdC t = mock(Tup3bigdC.class);
		
		when(t.setByIndex(2, bigd(1))).thenCallRealMethod();
		
		when(t.setZ(bigd(1))).thenReturn(t);
		
		assertSame(t, t.setByIndex(2, bigd(1)));
		
		verify(t).setByIndex(2, bigd(1));
		
		verify(t).setZ(bigd(1));
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup3bigdC#setByIndex(int, BigDecimal)} throws
	 * an {@link IndexOutOfBoundsException} for an index different than 0, 1 or 2.
	 */
	@Test
	void setByIndex_ExceptionTest()
	{
		Tup3bigdC t = mock(Tup3bigdC.class);
		
		when(t.setByIndex(3, bigd(1))).thenCallRealMethod();

		assertThrows(IndexOutOfBoundsException.class, new Executable() {
			public void execute() throws Throwable
			{
				t.setByIndex(3, bigd(1));
			}
		});
		
		verify(t).setByIndex(3, bigd(1));

		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup3bigdC#shallowClone()} calls
	 * by default the standard {@link Tup3bigdC#clone()}-function.
	 */
	@Test
	void shallowCloneTest()
	{
		Tup3bigdC t = mock(Tup3bigdC.class);
		Tup3bigdC res = mock(Tup3bigdC.class);
		
		when(t.shallowClone()).thenCallRealMethod();
		when(t.clone()).thenReturn(res);
		
		assertSame(res, t.shallowClone());
		
		verify(t).shallowClone();
		verify(t).clone();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup3bigdC#deepClone()} calls
	 * by default the standard {@link Tup3bigdC#clone()}-function.
	 */
	@Test
	void deepCloneTest()
	{
		Tup3bigdC t = mock(Tup3bigdC.class);
		Tup3bigdC res = mock(Tup3bigdC.class);

		when(t.deepClone()).thenCallRealMethod();
		when(t.clone()).thenReturn(res);
		
		assertSame(res, t.deepClone());
		
		verify(t).deepClone();
		verify(t).clone();
		
		verifyNoMoreInteractions(t);
	}
}
