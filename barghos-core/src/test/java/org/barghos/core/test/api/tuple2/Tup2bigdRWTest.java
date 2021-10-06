package org.barghos.core.test.api.tuple2;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import java.math.BigDecimal;

import org.barghos.core.api.tuple.TupbigdR;
import org.barghos.core.api.tuple.TupbigdRW;
import org.barghos.core.api.tuple2.Tup2bigdR;
import org.barghos.core.api.tuple2.Tup2bigdRW;
import org.barghos.core.api.tuple2.Tup2bigdW;

/**
 * This class provides comoponent tests for the interface {@link Tup2bigdRW}.
 * 
 * @author picatrix1899
 */
class Tup2bigdRWTest
{
	/**
	 * This test ensures, that the interface extends the interface {@link Tup2bigdR}.
	 */
	@Test
	void inheritance_Tup2bigdRTest()
	{
		assertTrue(Tup2bigdR.class.isAssignableFrom(Tup2bigdRW.class));
	}
	
	/**
	 * This test ensures, that the interface extends the interface {@link Tup2bigdW}.
	 */
	@Test
	void inheritance_Tup2bigdWTest()
	{
		assertTrue(Tup2bigdW.class.isAssignableFrom(Tup2bigdRW.class));
	}
	
	/**
	 * This test ensures, that the interface extends the interface {@link TupbigdRW}.
	 */
	@Test
	void inheritance_TupbigdRWTest()
	{
		assertTrue(TupbigdRW.class.isAssignableFrom(Tup2bigdRW.class));
	}
	
	/**
	 * This test ensures, that the default implementation of the function {@link Tup2bigdRW#getNewInstance(Tup2bigdR)} calls
	 * the function {@link Tup2bigdRW#getNewInstance(BigDecimal, BigDecimal)} with the correct components.
	 */
	@Test
	void getNewInstance_Tuple2Test()
	{
		Tup2bigdR original = mock(Tup2bigdR.class);
		Tup2bigdRW newInstance = mock(Tup2bigdRW.class);
		Tup2bigdRW t = mock(Tup2bigdRW.class);
		
		when(t.getNewInstance(original)).thenCallRealMethod();
		
		when(original.getX()).thenReturn(BigDecimal.ONE);
		when(original.getY()).thenReturn(BigDecimal.valueOf(2));
		when(t.getNewInstance(BigDecimal.ONE, BigDecimal.valueOf(2))).thenReturn(newInstance);
		
		assertSame(newInstance, t.getNewInstance(original));
		
		verify(t).getNewInstance(original);
		
		verify(original).getX();
		verify(original).getY();
		verify(t).getNewInstance(BigDecimal.ONE, BigDecimal.valueOf(2));
		
		verifyNoMoreInteractions(t, original);
	}
	
	/**
	 * This test ensures, that the default implementation of the function {@link Tup2bigdRW#getNewInstance(BigDecimal)} calls
	 * the function {@link Tup2bigdRW#getNewInstance(BigDecimal, BigDecimal)} with the correct components.
	 */
	@Test
	void getNewInstance_ValueTest()
	{
		Tup2bigdRW newInstance = mock(Tup2bigdRW.class);
		Tup2bigdRW t = mock(Tup2bigdRW.class);
		
		when(t.getNewInstance(BigDecimal.ONE)).thenCallRealMethod();

		when(t.getNewInstance(BigDecimal.ONE, BigDecimal.ONE)).thenReturn(newInstance);
		
		assertSame(newInstance, t.getNewInstance(BigDecimal.ONE));
		
		verify(t).getNewInstance(BigDecimal.ONE);
		
		verify(t).getNewInstance(BigDecimal.ONE, BigDecimal.ONE);
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the default implementation of the function {@link Tup2bigdRW#getNewInstance(TupbigdR)} calls
	 * the function {@link Tup2bigdRW#getNewInstance(BigDecimal, BigDecimal)} with the correct components.
	 */
	@Test
	void getNewInstance_TupleTest()
	{
		TupbigdR original = mock(TupbigdR.class);
		Tup2bigdRW newInstance = mock(Tup2bigdRW.class);
		Tup2bigdRW t = mock(Tup2bigdRW.class);
		
		when(t.getNewInstance(original)).thenCallRealMethod();
		
		when(original.getArray()).thenReturn(new BigDecimal[] {BigDecimal.ONE, BigDecimal.valueOf(2)});
		when(t.getNewInstance(BigDecimal.ONE, BigDecimal.valueOf(2))).thenReturn(newInstance);
		
		assertSame(newInstance, t.getNewInstance(original));
		
		verify(t).getNewInstance(original);
		
		verify(original).getArray();
		verify(t).getNewInstance(BigDecimal.ONE, BigDecimal.valueOf(2));
		
		verifyNoMoreInteractions(t, original);
	}
	
	/**
	 * This test ensures, that the default implementation of the function {@link Tup2bigdRW#getNewInstanceFromArray(BigDecimal[])} calls
	 * the function {@link Tup2bigdRW#getNewInstance(BigDecimal, BigDecimal)} with the correct components.
	 */
	@Test
	void getNewInstanceFromArrayTest()
	{
		Tup2bigdRW newInstance = mock(Tup2bigdRW.class);
		Tup2bigdRW t = mock(Tup2bigdRW.class);
		
		when(t.getNewInstanceFromArray(new BigDecimal[] {BigDecimal.ONE, BigDecimal.valueOf(2)})).thenCallRealMethod();

		when(t.getNewInstance(BigDecimal.ONE, BigDecimal.valueOf(2))).thenReturn(newInstance);
		
		assertSame(newInstance, t.getNewInstanceFromArray(new BigDecimal[] {BigDecimal.ONE, BigDecimal.valueOf(2)}));
		
		verify(t).getNewInstanceFromArray(new BigDecimal[] {BigDecimal.ONE, BigDecimal.valueOf(2)});
		
		verify(t).getNewInstance(BigDecimal.ONE, BigDecimal.valueOf(2));
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * this test ensures, that the function {@link Tup2bigdRW#getDimensions()} always
	 * returns 2 and does not make any calls.
	 */
	@Test
	void getDimensionsTest()
	{
		Tup2bigdRW t = mock(Tup2bigdRW.class);
		
		when(t.getDimensions()).thenCallRealMethod();
		
		assertEquals(2, t.getDimensions());
		
		verify(t).getDimensions();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup2bigdRW#set(Tup2bigdR)} adopts the
	 * values from the input tuple and returns the current instance.
	 */
	@Test
	void set_Tuple2Test()
	{
		Tup2bigdRW t = mock(Tup2bigdRW.class);
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
	 * This test ensures, that the function {@link Tup2bigdRW#set(BigDecimal)} adopts the
	 * value for each component and returns the current instance.
	 */
	@Test
	void set_ValueTest()
	{
		Tup2bigdRW t = mock(Tup2bigdRW.class);
		
		when(t.set(BigDecimal.ONE)).thenCallRealMethod();
		
		when(t.set(BigDecimal.ONE, BigDecimal.ONE)).thenReturn(t);
		
		assertSame(t, t.set(BigDecimal.ONE));
		
		verify(t).set(BigDecimal.ONE);

		verify(t).set(BigDecimal.ONE, BigDecimal.ONE);
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup2bigdRW#set(BigDecimal, BigDecimal)} adopts
	 * the values and returns the current instance.
	 */
	@Test
	void setTest()
	{
		Tup2bigdRW t = mock(Tup2bigdRW.class);
		
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
	 * This test ensures, that the function {@link Tup2bigdRW#set(TupbigdR)} adopts the
	 * values from the input tuple and returns the current instance.
	 */
	@Test
	void set_TupleTest()
	{
		Tup2bigdRW t = mock(Tup2bigdRW.class);
		TupbigdR t2 = mock(TupbigdR.class);
		
		when(t.set(t2)).thenCallRealMethod();
		
		when(t2.getArray()).thenReturn(new BigDecimal[] {BigDecimal.ONE, BigDecimal.valueOf(2)});
		when(t.set(BigDecimal.ONE, BigDecimal.valueOf(2))).thenReturn(t);

		assertSame(t, t.set(t2));
		
		verify(t).set(t2);
		
		verify(t2).getArray();
		verify(t).set(BigDecimal.ONE, BigDecimal.valueOf(2));

		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup2bigdRW#setArray(BigDecimal[])} adopts the
	 * values and returns the current instance.
	 */
	@Test
	void setArrayTest()
	{
		Tup2bigdRW t = mock(Tup2bigdRW.class);
		
		when(t.setArray(new BigDecimal[] {BigDecimal.ONE, BigDecimal.valueOf(2)})).thenCallRealMethod();
		
		when(t.set(BigDecimal.ONE, BigDecimal.valueOf(2))).thenReturn(t);
		
		assertSame(t, t.setArray(new BigDecimal[] {BigDecimal.ONE, BigDecimal.valueOf(2)}));
		
		verify(t).setArray(new BigDecimal[] {BigDecimal.ONE, BigDecimal.valueOf(2)});
		
		verify(t).set(BigDecimal.ONE, BigDecimal.valueOf(2));
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup2bigdRW#setByIndex(int, BigDecimal)} adopts the
	 * value to the x component if the index is 0 and returns the current instance.
	 */
	@Test
	void setByIndex_XTest()
	{
		Tup2bigdRW t = mock(Tup2bigdRW.class);
		
		when(t.setByIndex(0, BigDecimal.ONE)).thenCallRealMethod();
		
		when(t.setX(BigDecimal.ONE)).thenReturn(t);
		
		assertSame(t, t.setByIndex(0, BigDecimal.ONE));
		
		verify(t).setByIndex(0, BigDecimal.ONE);
		
		verify(t).setX(BigDecimal.ONE);
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup2bigdRW#setByIndex(int, BigDecimal)} adopts the
	 * value to the y component if the index is 1 and returns the current instance.
	 */
	@Test
	void setByIndex_YTest()
	{
		Tup2bigdRW t = mock(Tup2bigdRW.class);
		
		when(t.setByIndex(1, BigDecimal.ONE)).thenCallRealMethod();
		
		when(t.setY(BigDecimal.ONE)).thenReturn(t);
		
		assertSame(t, t.setByIndex(1, BigDecimal.ONE));
		
		verify(t).setByIndex(1, BigDecimal.ONE);
		
		verify(t).setY(BigDecimal.ONE);
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup2bigdRW#setByIndex(int, BigDecimal)} throws
	 * an {@link IndexOutOfBoundsException} for an index different than 0 or 1.
	 */
	@Test
	void setByIndex_ExceptionTest()
	{
		Tup2bigdRW t = mock(Tup2bigdRW.class);
		
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
