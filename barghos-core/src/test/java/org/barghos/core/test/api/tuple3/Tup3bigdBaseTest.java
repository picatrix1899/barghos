package org.barghos.core.test.api.tuple3;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import java.math.BigDecimal;

import org.barghos.core.api.tuple.TupbigdBase;
import org.barghos.core.api.tuple.TupbigdR;
import org.barghos.core.api.tuple3.Tup3bigdBase;
import org.barghos.core.api.tuple3.Tup3bigdR;

/**
 * This class provides comoponent tests for the interface {@link Tup3bigdBase}.
 * 
 * @author picatrix1899
 */
class Tup3bigdBaseTest
{
	/**
	 * This test ensures, that the interface extends the interface {@link Tup3bigdR}.
	 */
	@Test
	void inheritance_Tup3bigdRTest()
	{
		assertTrue(Tup3bigdR.class.isAssignableFrom(Tup3bigdBase.class));
	}
	
	/**
	 * This test ensures, that the interface extends the interface {@link TupbigdBase}.
	 */
	@Test
	void inheritance_TupbigdBaseTest()
	{
		assertTrue(TupbigdBase.class.isAssignableFrom(Tup3bigdBase.class));
	}
	
	/**
	 * This test ensures, that the function {@link Tup3bigdBase#set(Tup3bigdR)} adopts the
	 * values from the input tuple and returns the current instance.
	 */
	@Test
	void set_Tuple2Test()
	{
		Tup3bigdBase t = mock(Tup3bigdBase.class);
		Tup3bigdR t2 = mock(Tup3bigdR.class);
		
		when(t.set(t2)).thenCallRealMethod();
		
		when(t2.getX()).thenReturn(BigDecimal.ONE);
		when(t2.getY()).thenReturn(BigDecimal.valueOf(2));
		when(t2.getZ()).thenReturn(BigDecimal.valueOf(3));
		when(t.set(BigDecimal.ONE, BigDecimal.valueOf(2), BigDecimal.valueOf(3))).thenReturn(t);
		
		assertSame(t, t.set(t2));
		
		verify(t).set(t2);
		
		verify(t2).getX();
		verify(t2).getY();
		verify(t2).getZ();
		verify(t).set(BigDecimal.ONE, BigDecimal.valueOf(2), BigDecimal.valueOf(3));
		
		verifyNoMoreInteractions(t, t2);
	}
	
	/**
	 * This test ensures, that the function {@link Tup3bigdBase#set(BigDecimal)} adopts the
	 * value for each component and returns the current instance.
	 */
	@Test
	void set_ValueTest()
	{
		Tup3bigdBase t = mock(Tup3bigdBase.class);
		
		when(t.set(BigDecimal.ONE)).thenCallRealMethod();
		
		when(t.set(BigDecimal.ONE, BigDecimal.ONE, BigDecimal.ONE)).thenReturn(t);
		
		assertSame(t, t.set(BigDecimal.ONE));
		
		verify(t).set(BigDecimal.ONE);

		verify(t).set(BigDecimal.ONE, BigDecimal.ONE, BigDecimal.ONE);
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup3bigdBase#set(BigDecimal, BigDecimal, BigDecimal)} adopts
	 * the values and returns the current instance.
	 */
	@Test
	void setTest()
	{
		Tup3bigdBase t = mock(Tup3bigdBase.class);
		
		when(t.set(BigDecimal.ONE, BigDecimal.valueOf(2), BigDecimal.valueOf(3))).thenCallRealMethod();
		
		when(t.setX(BigDecimal.ONE)).thenReturn(t);
		when(t.setY(BigDecimal.valueOf(2))).thenReturn(t);
		when(t.setZ(BigDecimal.valueOf(3))).thenReturn(t);
		
		assertSame(t, t.set(BigDecimal.ONE, BigDecimal.valueOf(2), BigDecimal.valueOf(3)));
		
		verify(t).set(BigDecimal.ONE, BigDecimal.valueOf(2), BigDecimal.valueOf(3));

		verify(t).setX(BigDecimal.ONE);
		verify(t).setY(BigDecimal.valueOf(2));
		verify(t).setZ(BigDecimal.valueOf(3));
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup3bigdBase#set(TupbigdR)} adopts the
	 * values from the input tuple and returns the current instance.
	 */
	@Test
	void set_TupleTest()
	{
		Tup3bigdBase t = mock(Tup3bigdBase.class);
		TupbigdR t2 = mock(TupbigdR.class);
		
		when(t.set(t2)).thenCallRealMethod();
		
		when(t2.getArray()).thenReturn(new BigDecimal[] {BigDecimal.ONE, BigDecimal.valueOf(2), BigDecimal.valueOf(3)});
		when(t.set(BigDecimal.ONE, BigDecimal.valueOf(2), BigDecimal.valueOf(3))).thenReturn(t);

		assertSame(t, t.set(t2));
		
		verify(t).set(t2);
		
		verify(t2).getArray();
		verify(t).set(BigDecimal.ONE, BigDecimal.valueOf(2), BigDecimal.valueOf(3));

		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup3bigdBase#setArray(BigDecimal[])} adopts the
	 * values and returns the current instance.
	 */
	@Test
	void setArrayTest()
	{
		Tup3bigdBase t = mock(Tup3bigdBase.class);
		
		when(t.setArray(new BigDecimal[] {BigDecimal.ONE, BigDecimal.valueOf(2), BigDecimal.valueOf(3)})).thenCallRealMethod();
		
		when(t.set(BigDecimal.ONE, BigDecimal.valueOf(2), BigDecimal.valueOf(3))).thenReturn(t);
		
		assertSame(t, t.setArray(new BigDecimal[] {BigDecimal.ONE, BigDecimal.valueOf(2), BigDecimal.valueOf(3)}));
		
		verify(t).setArray(new BigDecimal[] {BigDecimal.ONE, BigDecimal.valueOf(2), BigDecimal.valueOf(3)});
		
		verify(t).set(BigDecimal.ONE, BigDecimal.valueOf(2), BigDecimal.valueOf(3));
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup3biTup3bigdBasegdRW#setByIndex(int, BigDecimal)} adopts the
	 * value to the x component if the index is 0 and returns the current instance.
	 */
	@Test
	void setByIndex_XTest()
	{
		Tup3bigdBase t = mock(Tup3bigdBase.class);
		
		when(t.setByIndex(0, BigDecimal.ONE)).thenCallRealMethod();
		
		when(t.setX(BigDecimal.ONE)).thenReturn(t);
		
		assertSame(t, t.setByIndex(0, BigDecimal.ONE));
		
		verify(t).setByIndex(0, BigDecimal.ONE);
		
		verify(t).setX(BigDecimal.ONE);
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup3bigdBase#setByIndex(int, BigDecimal)} adopts the
	 * value to the y component if the index is 1 and returns the current instance.
	 */
	@Test
	void setByIndex_YTest()
	{
		Tup3bigdBase t = mock(Tup3bigdBase.class);
		
		when(t.setByIndex(1, BigDecimal.ONE)).thenCallRealMethod();
		
		when(t.setY(BigDecimal.ONE)).thenReturn(t);
		
		assertSame(t, t.setByIndex(1, BigDecimal.ONE));
		
		verify(t).setByIndex(1, BigDecimal.ONE);
		
		verify(t).setY(BigDecimal.ONE);
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup3bigdBase#setByIndex(int, BigDecimal)} adopts the
	 * value to the z component if the index is 2 and returns the current instance.
	 */
	@Test
	void setByIndex_ZTest()
	{
		Tup3bigdBase t = mock(Tup3bigdBase.class);
		
		when(t.setByIndex(2, BigDecimal.ONE)).thenCallRealMethod();
		
		when(t.setZ(BigDecimal.ONE)).thenReturn(t);
		
		assertSame(t, t.setByIndex(2, BigDecimal.ONE));
		
		verify(t).setByIndex(2, BigDecimal.ONE);
		
		verify(t).setZ(BigDecimal.ONE);
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup3bigdBase#setByIndex(int, BigDecimal)} throws
	 * an {@link IndexOutOfBoundsException} for an index different than 0, 1 or 2.
	 */
	@Test
	void setByIndex_ExceptionTest()
	{
		Tup3bigdBase t = mock(Tup3bigdBase.class);
		
		when(t.setByIndex(3, BigDecimal.ONE)).thenCallRealMethod();

		assertThrows(IndexOutOfBoundsException.class, new Executable() {
			public void execute() throws Throwable
			{
				t.setByIndex(3, BigDecimal.ONE);
			}
		});
		
		verify(t).setByIndex(3, BigDecimal.ONE);

		verifyNoMoreInteractions(t);
	}
}
