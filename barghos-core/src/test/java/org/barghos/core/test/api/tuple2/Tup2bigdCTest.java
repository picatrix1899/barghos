package org.barghos.core.test.api.tuple2;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import java.math.BigDecimal;

import org.barghos.core.api.tuple.TupbigdC;
import org.barghos.core.api.tuple.TupbigdR;
import org.barghos.core.api.tuple2.Tup2bigdC;
import org.barghos.core.api.tuple2.Tup2bigdR;

/**
 * This class provides comoponent tests for the interface {@link Tup2bigdC}.
 * 
 * @author picatrix1899
 */
class Tup2bigdCTest
{
	/**
	 * This test ensures, that the interface extends the interface {@link Tup2bigdR}.
	 */
	@Test
	void inheritance_Tup2bigdRTest()
	{
		assertTrue(Tup2bigdR.class.isAssignableFrom(Tup2bigdC.class));
	}
	
	/**
	 * This test ensures, that the interface extends the interface {@link TupbigdC}.
	 */
	@Test
	void inheritance_TupbigdCTest()
	{
		assertTrue(TupbigdC.class.isAssignableFrom(Tup2bigdC.class));
	}
	
	/**
	 * This test ensures, that the function {@link Tup2bigdC#set(Tup2bigdR)} adopts the
	 * values from the input tuple and returns the current instance.
	 */
	@Test
	void set_Tuple2Test()
	{
		Tup2bigdC t = mock(Tup2bigdC.class);
		Tup2bigdR t2 = mock(Tup2bigdR.class);
		
		when(t.set(t2)).thenCallRealMethod();
		
		when(t2.getX()).thenReturn(BigDecimal.ONE);
		when(t2.getY()).thenReturn(BigDecimal.valueOf(2));
		when(t.set(BigDecimal.ONE, BigDecimal.valueOf(2))).thenReturn(t);
		
		assertSame(t, t.set(t2));
		
		verify(t).set(t2);
		
		verify(t2).getX();
		verify(t2).getY();
		verify(t).set(BigDecimal.ONE, BigDecimal.valueOf(2));
		
		verifyNoMoreInteractions(t, t2);
	}
	
	/**
	 * This test ensures, that the function {@link Tup2bigdC#set(BigDecimal)} adopts the
	 * value for each component and returns the current instance.
	 */
	@Test
	void set_ValueTest()
	{
		Tup2bigdC t = mock(Tup2bigdC.class);
		
		when(t.set(BigDecimal.ONE)).thenCallRealMethod();
		
		when(t.set(BigDecimal.ONE, BigDecimal.ONE)).thenReturn(t);
		
		assertSame(t, t.set(BigDecimal.ONE));
		
		verify(t).set(BigDecimal.ONE);

		verify(t).set(BigDecimal.ONE, BigDecimal.ONE);
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup2bigdC#set(BigDecimal, BigDecimal)} adopts
	 * the values and returns the current instance.
	 */
	@Test
	void setTest()
	{
		Tup2bigdC t = mock(Tup2bigdC.class);
		
		when(t.set(BigDecimal.ONE, BigDecimal.valueOf(2))).thenCallRealMethod();
		
		when(t.setX(BigDecimal.ONE)).thenReturn(t);
		when(t.setY(BigDecimal.valueOf(2))).thenReturn(t);
		
		assertSame(t, t.set(BigDecimal.ONE, BigDecimal.valueOf(2)));
		
		verify(t).set(BigDecimal.ONE, BigDecimal.valueOf(2));

		verify(t).setX(BigDecimal.ONE);
		verify(t).setY(BigDecimal.valueOf(2));
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup2bigdC#set(TupbigdR)} adopts the
	 * values from the input tuple and returns the current instance.
	 */
	@Test
	void set_TupleTest()
	{
		Tup2bigdC t = mock(Tup2bigdC.class);
		TupbigdR t2 = mock(TupbigdR.class);
		
		when(t.set(t2)).thenCallRealMethod();
		
		when(t2.toArray()).thenReturn(new BigDecimal[] {BigDecimal.ONE, BigDecimal.valueOf(2)});
		when(t.setArray(new BigDecimal[] {BigDecimal.ONE, BigDecimal.valueOf(2)})).thenReturn(t);

		assertSame(t, t.set(t2));
		
		verify(t).set(t2);
		
		verify(t2).toArray();
		verify(t).setArray(new BigDecimal[] {BigDecimal.ONE, BigDecimal.valueOf(2)});

		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup2bigdC#setArray(BigDecimal[])} adopts the
	 * values and returns the current instance.
	 */
	@Test
	void setArrayTest()
	{
		Tup2bigdC t = mock(Tup2bigdC.class);
		
		when(t.setArray(new BigDecimal[] {BigDecimal.ONE, BigDecimal.valueOf(2)})).thenCallRealMethod();
		
		when(t.set(BigDecimal.ONE, BigDecimal.valueOf(2))).thenReturn(t);
		
		assertSame(t, t.setArray(new BigDecimal[] {BigDecimal.ONE, BigDecimal.valueOf(2)}));
		
		verify(t).setArray(new BigDecimal[] {BigDecimal.ONE, BigDecimal.valueOf(2)});
		
		verify(t).set(BigDecimal.ONE, BigDecimal.valueOf(2));
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup2bigdC#setByIndex(int, BigDecimal)} adopts the
	 * value to the x component if the index is 0 and returns the current instance.
	 */
	@Test
	void setByIndex_XTest()
	{
		Tup2bigdC t = mock(Tup2bigdC.class);
		
		when(t.setByIndex(0, BigDecimal.ONE)).thenCallRealMethod();
		
		when(t.setX(BigDecimal.ONE)).thenReturn(t);
		
		assertSame(t, t.setByIndex(0, BigDecimal.ONE));
		
		verify(t).setByIndex(0, BigDecimal.ONE);
		
		verify(t).setX(BigDecimal.ONE);
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup2bigdC#setByIndex(int, BigDecimal)} adopts the
	 * value to the y component if the index is 1 and returns the current instance.
	 */
	@Test
	void setByIndex_YTest()
	{
		Tup2bigdC t = mock(Tup2bigdC.class);
		
		when(t.setByIndex(1, BigDecimal.ONE)).thenCallRealMethod();
		
		when(t.setY(BigDecimal.ONE)).thenReturn(t);
		
		assertSame(t, t.setByIndex(1, BigDecimal.ONE));
		
		verify(t).setByIndex(1, BigDecimal.ONE);
		
		verify(t).setY(BigDecimal.ONE);
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup2bigdC#setByIndex(int, BigDecimal)} throws
	 * an {@link IndexOutOfBoundsException} for an index different than 0 or 1.
	 */
	@Test
	void setByIndex_ExceptionTest()
	{
		Tup2bigdC t = mock(Tup2bigdC.class);
		
		when(t.setByIndex(2, BigDecimal.ONE)).thenCallRealMethod();

		assertThrows(IndexOutOfBoundsException.class, new Executable() {
			public void execute() throws Throwable
			{
				t.setByIndex(2, BigDecimal.ONE);
			}
		});

		verify(t).setByIndex(2, BigDecimal.ONE);

		verifyNoMoreInteractions(t);
	}
}