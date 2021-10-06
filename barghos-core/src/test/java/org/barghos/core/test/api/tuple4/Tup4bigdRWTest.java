package org.barghos.core.test.api.tuple4;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import java.math.BigDecimal;

import org.barghos.core.api.tuple.TupbigdR;
import org.barghos.core.api.tuple.TupbigdRW;
import org.barghos.core.api.tuple4.Tup4bigdR;
import org.barghos.core.api.tuple4.Tup4bigdRW;
import org.barghos.core.api.tuple4.Tup4bigdW;

/**
 * This class provides comoponent tests for the interface {@link Tup4bigdRW}.
 * 
 * @author picatrix1899
 */
class Tup4bigdRWTest
{
	/**
	 * This test ensures, that the interface extends the interface {@link Tup4bigdR}.
	 */
	@Test
	void inheritance_Tup4bigdRTest()
	{
		assertTrue(Tup4bigdR.class.isAssignableFrom(Tup4bigdRW.class));
	}
	
	/**
	 * This test ensures, that the interface extends the interface {@link Tup4bigdW}.
	 */
	@Test
	void inheritance_Tup4bigdWTest()
	{
		assertTrue(Tup4bigdW.class.isAssignableFrom(Tup4bigdRW.class));
	}
	
	/**
	 * This test ensures, that the interface extends the interface {@link TupbigdRW}.
	 */
	@Test
	void inheritance_TupbigdRWTest()
	{
		assertTrue(TupbigdRW.class.isAssignableFrom(Tup4bigdRW.class));
	}
	
	/**
	 * This test ensures, that the default implementation of the function {@link Tup4bigdRW#getNewInstance(Tup4bigdR)} calls
	 * the function {@link Tup4bigdRW#getNewInstance(BigDecimal, BigDecimal, BigDecimal, BigDecimal)} with the correct components.
	 */
	@Test
	void getNewInstance_Tuple2Test()
	{
		Tup4bigdR original = mock(Tup4bigdR.class);
		Tup4bigdRW newInstance = mock(Tup4bigdRW.class);
		Tup4bigdRW t = mock(Tup4bigdRW.class);
		
		when(t.getNewInstance(original)).thenCallRealMethod();
		
		when(original.getX()).thenReturn(BigDecimal.ONE);
		when(original.getY()).thenReturn(BigDecimal.valueOf(2));
		when(original.getZ()).thenReturn(BigDecimal.valueOf(3));
		when(original.getW()).thenReturn(BigDecimal.valueOf(4));
		when(t.getNewInstance(BigDecimal.ONE, BigDecimal.valueOf(2), BigDecimal.valueOf(3), BigDecimal.valueOf(4))).thenReturn(newInstance);
		
		assertSame(newInstance, t.getNewInstance(original));
		
		verify(t).getNewInstance(original);
		
		verify(original).getX();
		verify(original).getY();
		verify(original).getZ();
		verify(original).getW();
		verify(t).getNewInstance(BigDecimal.ONE, BigDecimal.valueOf(2), BigDecimal.valueOf(3), BigDecimal.valueOf(4));
		
		verifyNoMoreInteractions(t, original);
	}
	
	/**
	 * This test ensures, that the default implementation of the function {@link Tup4bigdRW#getNewInstance(BigDecimal)} calls
	 * the function {@link Tup4bigdRW#getNewInstance(BigDecimal, BigDecimal, BigDecimal, BigDecimal)} with the correct components.
	 */
	@Test
	void getNewInstance_ValueTest()
	{
		Tup4bigdRW newInstance = mock(Tup4bigdRW.class);
		Tup4bigdRW t = mock(Tup4bigdRW.class);
		
		when(t.getNewInstance(BigDecimal.ONE)).thenCallRealMethod();

		when(t.getNewInstance(BigDecimal.ONE, BigDecimal.ONE, BigDecimal.ONE, BigDecimal.ONE)).thenReturn(newInstance);
		
		assertSame(newInstance, t.getNewInstance(BigDecimal.ONE));
		
		verify(t).getNewInstance(BigDecimal.ONE);
		
		verify(t).getNewInstance(BigDecimal.ONE, BigDecimal.ONE, BigDecimal.ONE, BigDecimal.ONE);
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the default implementation of the function {@link Tup4bigdRW#getNewInstance(TupbigdR)} calls
	 * the function {@link Tup4bigdRW#getNewInstance(BigDecimal, BigDecimal, BigDecimal, BigDecimal)} with the correct components.
	 */
	@Test
	void getNewInstance_TupleTest()
	{
		TupbigdR original = mock(TupbigdR.class);
		Tup4bigdRW newInstance = mock(Tup4bigdRW.class);
		Tup4bigdRW t = mock(Tup4bigdRW.class);
		
		when(t.getNewInstance(original)).thenCallRealMethod();
		
		when(original.getArray()).thenReturn(new BigDecimal[] {BigDecimal.ONE, BigDecimal.valueOf(2), BigDecimal.valueOf(3), BigDecimal.valueOf(4)});
		when(t.getNewInstance(BigDecimal.ONE, BigDecimal.valueOf(2), BigDecimal.valueOf(3), BigDecimal.valueOf(4))).thenReturn(newInstance);
		
		assertSame(newInstance, t.getNewInstance(original));
		
		verify(t).getNewInstance(original);
		
		verify(original).getArray();
		verify(t).getNewInstance(BigDecimal.ONE, BigDecimal.valueOf(2), BigDecimal.valueOf(3), BigDecimal.valueOf(4));
		
		verifyNoMoreInteractions(t, original);
	}
	
	/**
	 * This test ensures, that the default implementation of the function {@link Tup4bigdRW#getNewInstanceFromArray(BigDecimal[])} calls
	 * the function {@link Tup4bigdRW#getNewInstance(BigDecimal, BigDecimal, BigDecimal, BigDecimal)} with the correct components.
	 */
	@Test
	void getNewInstanceFromArrayTest()
	{
		Tup4bigdRW newInstance = mock(Tup4bigdRW.class);
		Tup4bigdRW t = mock(Tup4bigdRW.class);
		
		when(t.getNewInstanceFromArray(new BigDecimal[] {BigDecimal.ONE, BigDecimal.valueOf(2), BigDecimal.valueOf(3), BigDecimal.valueOf(4)})).thenCallRealMethod();

		when(t.getNewInstance(BigDecimal.ONE, BigDecimal.valueOf(2), BigDecimal.valueOf(3), BigDecimal.valueOf(4))).thenReturn(newInstance);
		
		assertSame(newInstance, t.getNewInstanceFromArray(new BigDecimal[] {BigDecimal.ONE, BigDecimal.valueOf(2), BigDecimal.valueOf(3), BigDecimal.valueOf(4)}));
		
		verify(t).getNewInstanceFromArray(new BigDecimal[] {BigDecimal.ONE, BigDecimal.valueOf(2), BigDecimal.valueOf(3), BigDecimal.valueOf(4)});
		
		verify(t).getNewInstance(BigDecimal.ONE, BigDecimal.valueOf(2), BigDecimal.valueOf(3), BigDecimal.valueOf(4));
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * this test ensures, that the function {@link Tup4bigdRW#getDimensions()} always
	 * returns 4 and does not make any calls.
	 */
	@Test
	void getDimensionsTest()
	{
		Tup4bigdRW t = mock(Tup4bigdRW.class);
		
		when(t.getDimensions()).thenCallRealMethod();
		
		assertEquals(4, t.getDimensions());
		
		verify(t).getDimensions();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4bigdRW#set(Tup4bigdR)} adopts the
	 * values from the input tuple and returns the current instance.
	 */
	@Test
	void set_Tuple2Test()
	{
		Tup4bigdRW t = mock(Tup4bigdRW.class);
		Tup4bigdR t2 = mock(Tup4bigdR.class);
		
		when(t.set(t2)).thenCallRealMethod();
		
		when(t2.getX()).thenReturn(BigDecimal.ONE);
		when(t2.getY()).thenReturn(BigDecimal.valueOf(2));
		when(t2.getZ()).thenReturn(BigDecimal.valueOf(3));
		when(t2.getW()).thenReturn(BigDecimal.valueOf(4));
		when(t.set(BigDecimal.ONE, BigDecimal.valueOf(2), BigDecimal.valueOf(3), BigDecimal.valueOf(4))).thenReturn(t);
		
		assertSame(t, t.set(t2));
		
		verify(t).set(t2);
		
		verify(t2).getX();
		verify(t2).getY();
		verify(t2).getZ();
		verify(t2).getW();
		verify(t).set(BigDecimal.ONE, BigDecimal.valueOf(2), BigDecimal.valueOf(3), BigDecimal.valueOf(4));
		
		verifyNoMoreInteractions(t, t2);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4bigdRW#set(BigDecimal)} adopts the
	 * value for each component and returns the current instance.
	 */
	@Test
	void set_ValueTest()
	{
		Tup4bigdRW t = mock(Tup4bigdRW.class);
		
		when(t.set(BigDecimal.ONE)).thenCallRealMethod();
		
		when(t.set(BigDecimal.ONE, BigDecimal.ONE, BigDecimal.ONE, BigDecimal.ONE)).thenReturn(t);
		
		assertSame(t, t.set(BigDecimal.ONE));
		
		verify(t).set(BigDecimal.ONE);

		verify(t).set(BigDecimal.ONE, BigDecimal.ONE, BigDecimal.ONE, BigDecimal.ONE);
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4bigdRW#set(BigDecimal, BigDecimal, BigDecimal, BigDecimal)} adopts
	 * the values and returns the current instance.
	 */
	@Test
	void setTest()
	{
		Tup4bigdRW t = mock(Tup4bigdRW.class);
		
		when(t.set(BigDecimal.ONE, BigDecimal.valueOf(2), BigDecimal.valueOf(3), BigDecimal.valueOf(4))).thenCallRealMethod();
		
		when(t.setX(BigDecimal.ONE)).thenReturn(t);
		when(t.setY(BigDecimal.valueOf(2))).thenReturn(t);
		when(t.setZ(BigDecimal.valueOf(3))).thenReturn(t);
		when(t.setW(BigDecimal.valueOf(4))).thenReturn(t);
		
		assertSame(t, t.set(BigDecimal.ONE, BigDecimal.valueOf(2), BigDecimal.valueOf(3), BigDecimal.valueOf(4)));
		
		verify(t).set(BigDecimal.ONE, BigDecimal.valueOf(2), BigDecimal.valueOf(3), BigDecimal.valueOf(4));

		verify(t).setX(BigDecimal.ONE);
		verify(t).setY(BigDecimal.valueOf(2));
		verify(t).setZ(BigDecimal.valueOf(3));
		verify(t).setW(BigDecimal.valueOf(4));
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4bigdRW#set(TupbigdR)} adopts the
	 * values from the input tuple and returns the current instance.
	 */
	@Test
	void set_TupleTest()
	{
		Tup4bigdRW t = mock(Tup4bigdRW.class);
		TupbigdR t2 = mock(TupbigdR.class);
		
		when(t.set(t2)).thenCallRealMethod();
		
		when(t2.getArray()).thenReturn(new BigDecimal[] {BigDecimal.ONE, BigDecimal.valueOf(2), BigDecimal.valueOf(3), BigDecimal.valueOf(4)});
		when(t.set(BigDecimal.ONE, BigDecimal.valueOf(2), BigDecimal.valueOf(3), BigDecimal.valueOf(4))).thenReturn(t);

		assertSame(t, t.set(t2));
		
		verify(t).set(t2);
		
		verify(t2).getArray();
		verify(t).set(BigDecimal.ONE, BigDecimal.valueOf(2), BigDecimal.valueOf(3), BigDecimal.valueOf(4));

		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4bigdRW#setArray(BigDecimal[])} adopts the
	 * values and returns the current instance.
	 */
	@Test
	void setArrayTest()
	{
		Tup4bigdRW t = mock(Tup4bigdRW.class);
		
		when(t.setArray(new BigDecimal[] {BigDecimal.ONE, BigDecimal.valueOf(2), BigDecimal.valueOf(3), BigDecimal.valueOf(4)})).thenCallRealMethod();
		
		when(t.set(BigDecimal.ONE, BigDecimal.valueOf(2), BigDecimal.valueOf(3), BigDecimal.valueOf(4))).thenReturn(t);
		
		assertSame(t, t.setArray(new BigDecimal[] {BigDecimal.ONE, BigDecimal.valueOf(2), BigDecimal.valueOf(3), BigDecimal.valueOf(4)}));
		
		verify(t).setArray(new BigDecimal[] {BigDecimal.ONE, BigDecimal.valueOf(2), BigDecimal.valueOf(3), BigDecimal.valueOf(4)});
		
		verify(t).set(BigDecimal.ONE, BigDecimal.valueOf(2), BigDecimal.valueOf(3), BigDecimal.valueOf(4));
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4bigdRW#setByIndex(int, BigDecimal)} adopts the
	 * value to the x component if the index is 0 and returns the current instance.
	 */
	@Test
	void setByIndex_XTest()
	{
		Tup4bigdRW t = mock(Tup4bigdRW.class);
		
		when(t.setByIndex(0, BigDecimal.ONE)).thenCallRealMethod();
		
		when(t.setX(BigDecimal.ONE)).thenReturn(t);
		
		assertSame(t, t.setByIndex(0, BigDecimal.ONE));
		
		verify(t).setByIndex(0, BigDecimal.ONE);
		
		verify(t).setX(BigDecimal.ONE);
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4bigdRW#setByIndex(int, BigDecimal)} adopts the
	 * value to the y component if the index is 1 and returns the current instance.
	 */
	@Test
	void setByIndex_YTest()
	{
		Tup4bigdRW t = mock(Tup4bigdRW.class);
		
		when(t.setByIndex(1, BigDecimal.ONE)).thenCallRealMethod();
		
		when(t.setY(BigDecimal.ONE)).thenReturn(t);
		
		assertSame(t, t.setByIndex(1, BigDecimal.ONE));
		
		verify(t).setByIndex(1, BigDecimal.ONE);
		
		verify(t).setY(BigDecimal.ONE);
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4bigdRW#setByIndex(int, BigDecimal)} adopts the
	 * value to the z component if the index is 2 and returns the current instance.
	 */
	@Test
	void setByIndex_ZTest()
	{
		Tup4bigdRW t = mock(Tup4bigdRW.class);
		
		when(t.setByIndex(2, BigDecimal.ONE)).thenCallRealMethod();
		
		when(t.setZ(BigDecimal.ONE)).thenReturn(t);
		
		assertSame(t, t.setByIndex(2, BigDecimal.ONE));
		
		verify(t).setByIndex(2, BigDecimal.ONE);
		
		verify(t).setZ(BigDecimal.ONE);
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4bigdRW#setByIndex(int, BigDecimal)} adopts the
	 * value to the w component if the index is 3 and returns the current instance.
	 */
	@Test
	void setByIndex_WTest()
	{
		Tup4bigdRW t = mock(Tup4bigdRW.class);
		
		when(t.setByIndex(3, BigDecimal.ONE)).thenCallRealMethod();
		
		when(t.setW(BigDecimal.ONE)).thenReturn(t);
		
		assertSame(t, t.setByIndex(3, BigDecimal.ONE));
		
		verify(t).setByIndex(3, BigDecimal.ONE);
		
		verify(t).setW(BigDecimal.ONE);
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4bigdRW#setByIndex(int, BigDecimal)} throws
	 * an {@link IndexOutOfBoundsException} for an index different than 0, 1, 2 or 3.
	 */
	@Test
	void setByIndex_ExceptionTest()
	{
		Tup4bigdRW t = mock(Tup4bigdRW.class);
		
		when(t.setByIndex(4, BigDecimal.ONE)).thenCallRealMethod();

		assertThrows(IndexOutOfBoundsException.class, new Executable() {
			public void execute() throws Throwable
			{
				t.setByIndex(4, BigDecimal.ONE);
			}
		});
		
		verify(t).setByIndex(4, BigDecimal.ONE);

		verifyNoMoreInteractions(t);
	}
}
