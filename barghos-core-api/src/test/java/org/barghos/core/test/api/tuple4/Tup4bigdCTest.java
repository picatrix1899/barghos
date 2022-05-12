package org.barghos.core.test.api.tuple4;

import static org.barghos.testutils.TestObjectFactory.*;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import java.math.BigDecimal;

import org.barghos.core.api.tuple.TupbigdC;
import org.barghos.core.api.tuple.TupbigdR;
import org.barghos.core.api.tuple4.Tup4bigdC;
import org.barghos.core.api.tuple4.Tup4bigdR;

/**
 * This class provides comoponent tests for the interface {@link Tup4bigdC}.
 * 
 * @author picatrix1899
 */
class Tup4bigdCTest
{
	/**
	 * This test ensures, that the interface extends the interface {@link Tup4bigdR}.
	 */
	@Test
	void inheritance_Tup4bigdRTest()
	{
		assertTrue(Tup4bigdR.class.isAssignableFrom(Tup4bigdC.class));
	}
	
	/**
	 * This test ensures, that the interface extends the interface {@link TupbigdC}.
	 */
	@Test
	void inheritance_TupbigdCTest()
	{
		assertTrue(TupbigdC.class.isAssignableFrom(Tup4bigdC.class));
	}
	
	/**
	 * This test ensures, that the function {@link Tup4bigdC#set(Tup4bigdR)} adopts the
	 * values from the input tuple and returns the current instance.
	 */
	@Test
	void set_Tuple2Test()
	{
		Tup4bigdC t = mock(Tup4bigdC.class);
		Tup4bigdR t2 = mock(Tup4bigdR.class);
		
		when(t.set(t2)).thenCallRealMethod();
		
		when(t2.getX()).thenReturn(bigd(1));
		when(t2.getY()).thenReturn(bigd(2));
		when(t2.getZ()).thenReturn(bigd(3));
		when(t2.getW()).thenReturn(bigd(4));
		when(t.set(bigd(1), bigd(2), bigd(3), bigd(4))).thenReturn(t);
		
		assertSame(t, t.set(t2));
		
		verify(t).set(t2);
		
		verify(t2).getX();
		verify(t2).getY();
		verify(t2).getZ();
		verify(t2).getW();
		verify(t).set(bigd(1), bigd(2), bigd(3), bigd(4));
		
		verifyNoMoreInteractions(t, t2);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4bigdC#set(BigDecimal)} adopts the
	 * value for each component and returns the current instance.
	 */
	@Test
	void set_ValueTest()
	{
		Tup4bigdC t = mock(Tup4bigdC.class);
		
		when(t.set(bigd(1))).thenCallRealMethod();
		
		when(t.set(bigd(1), bigd(1), bigd(1), bigd(1))).thenReturn(t);
		
		assertSame(t, t.set(bigd(1)));
		
		verify(t).set(bigd(1));

		verify(t).set(bigd(1), bigd(1), bigd(1), bigd(1));
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4bigdC#set(BigDecimal, BigDecimal, BigDecimal, BigDecimal)} adopts
	 * the values and returns the current instance.
	 */
	@Test
	void setTest()
	{
		Tup4bigdC t = mock(Tup4bigdC.class);
		
		when(t.set(bigd(1), bigd(2), bigd(3), bigd(4))).thenCallRealMethod();
		
		when(t.setX(bigd(1))).thenReturn(t);
		when(t.setY(bigd(2))).thenReturn(t);
		when(t.setZ(bigd(3))).thenReturn(t);
		when(t.setW(bigd(4))).thenReturn(t);
		
		assertSame(t, t.set(bigd(1), bigd(2), bigd(3), bigd(4)));
		
		verify(t).set(bigd(1), bigd(2), bigd(3), bigd(4));

		verify(t).setX(bigd(1));
		verify(t).setY(bigd(2));
		verify(t).setZ(bigd(3));
		verify(t).setW(bigd(4));
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4bigdC#set(TupbigdR)} adopts the
	 * values from the input tuple and returns the current instance.
	 */
	@Test
	void set_TupleTest()
	{
		Tup4bigdC t = mock(Tup4bigdC.class);
		TupbigdR t2 = mock(TupbigdR.class);
		
		when(t.set(t2)).thenCallRealMethod();
		
		when(t2.toArray()).thenReturn(bigdArray(1, 2, 3, 4));
		when(t.setArray(bigdArray(1, 2, 3, 4))).thenReturn(t);

		assertSame(t, t.set(t2));
		
		verify(t).set(t2);
		
		verify(t2).toArray();
		verify(t).setArray(bigdArray(1, 2, 3, 4));

		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4bigdC#setArray(BigDecimal[])} adopts the
	 * values and returns the current instance.
	 */
	@Test
	void setArrayTest()
	{
		Tup4bigdC t = mock(Tup4bigdC.class);
		
		when(t.setArray(new BigDecimal[] {bigd(1), bigd(2), bigd(3), bigd(4)})).thenCallRealMethod();
		
		when(t.set(bigd(1), bigd(2), bigd(3), bigd(4))).thenReturn(t);
		
		assertSame(t, t.setArray(new BigDecimal[] {bigd(1), bigd(2), bigd(3), bigd(4)}));
		
		verify(t).setArray(new BigDecimal[] {bigd(1), bigd(2), bigd(3), bigd(4)});
		
		verify(t).set(bigd(1), bigd(2), bigd(3), bigd(4));
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4bigdC#setByIndex(int, BigDecimal)} adopts the
	 * value to the x component if the index is 0 and returns the current instance.
	 */
	@Test
	void setByIndex_XTest()
	{
		Tup4bigdC t = mock(Tup4bigdC.class);
		
		when(t.setByIndex(0, bigd(1))).thenCallRealMethod();
		
		when(t.setX(bigd(1))).thenReturn(t);
		
		assertSame(t, t.setByIndex(0, bigd(1)));
		
		verify(t).setByIndex(0, bigd(1));
		
		verify(t).setX(bigd(1));
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4bigdC#setByIndex(int, BigDecimal)} adopts the
	 * value to the y component if the index is 1 and returns the current instance.
	 */
	@Test
	void setByIndex_YTest()
	{
		Tup4bigdC t = mock(Tup4bigdC.class);
		
		when(t.setByIndex(1, bigd(1))).thenCallRealMethod();
		
		when(t.setY(bigd(1))).thenReturn(t);
		
		assertSame(t, t.setByIndex(1, bigd(1)));
		
		verify(t).setByIndex(1, bigd(1));
		
		verify(t).setY(bigd(1));
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4bigdC#setByIndex(int, BigDecimal)} adopts the
	 * value to the z component if the index is 2 and returns the current instance.
	 */
	@Test
	void setByIndex_ZTest()
	{
		Tup4bigdC t = mock(Tup4bigdC.class);
		
		when(t.setByIndex(2, bigd(1))).thenCallRealMethod();
		
		when(t.setZ(bigd(1))).thenReturn(t);
		
		assertSame(t, t.setByIndex(2, bigd(1)));
		
		verify(t).setByIndex(2, bigd(1));
		
		verify(t).setZ(bigd(1));
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4bigdC#setByIndex(int, BigDecimal)} adopts the
	 * value to the w component if the index is 3 and returns the current instance.
	 */
	@Test
	void setByIndex_WTest()
	{
		Tup4bigdC t = mock(Tup4bigdC.class);
		
		when(t.setByIndex(3, bigd(1))).thenCallRealMethod();
		
		when(t.setW(bigd(1))).thenReturn(t);
		
		assertSame(t, t.setByIndex(3, bigd(1)));
		
		verify(t).setByIndex(3, bigd(1));
		
		verify(t).setW(bigd(1));
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4bigdC#setByIndex(int, BigDecimal)} throws
	 * an {@link IndexOutOfBoundsException} for an index different than 0, 1, 2 or 3.
	 */
	@Test
	void setByIndex_ExceptionTest()
	{
		Tup4bigdC t = mock(Tup4bigdC.class);
		
		when(t.setByIndex(4, bigd(1))).thenCallRealMethod();

		assertThrows(IndexOutOfBoundsException.class, new Executable() {
			public void execute() throws Throwable
			{
				t.setByIndex(4, bigd(1));
			}
		});
		
		verify(t).setByIndex(4, bigd(1));

		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4bigdC#shallowClone()} calls
	 * by default the standard {@link Tup4bigdC#clone()}-function.
	 */
	@Test
	void shallowCloneTest()
	{
		Tup4bigdC t = mock(Tup4bigdC.class);
		Tup4bigdC res = mock(Tup4bigdC.class);
		
		when(t.shallowClone()).thenCallRealMethod();
		when(t.clone()).thenReturn(res);
		
		assertSame(res, t.shallowClone());
		
		verify(t).shallowClone();
		verify(t).clone();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4bigdC#deepClone()} calls
	 * by default the standard {@link Tup4bigdC#clone()}-function.
	 */
	@Test
	void deepCloneTest()
	{
		Tup4bigdC t = mock(Tup4bigdC.class);
		Tup4bigdC res = mock(Tup4bigdC.class);

		when(t.deepClone()).thenCallRealMethod();
		when(t.clone()).thenReturn(res);
		
		assertSame(res, t.deepClone());
		
		verify(t).deepClone();
		verify(t).clone();
		
		verifyNoMoreInteractions(t);
	}
}
