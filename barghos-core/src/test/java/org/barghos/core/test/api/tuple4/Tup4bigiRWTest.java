package org.barghos.core.test.api.tuple4;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import java.math.BigInteger;

import org.barghos.core.api.tuple.TupbigiR;
import org.barghos.core.api.tuple.TupbigiRW;
import org.barghos.core.api.tuple4.Tup4bigiR;
import org.barghos.core.api.tuple4.Tup4bigiRW;
import org.barghos.core.api.tuple4.Tup4bigiW;

/**
 * This class provides comoponent tests for the interface {@link Tup4bigiRW}.
 * 
 * @author picatrix1899
 */
class Tup4bigiRWTest
{
	/**
	 * This test ensures, that the interface extends the interface {@link Tup4bigiR}.
	 */
	@Test
	void inheritance_Tup4bigiRTest()
	{
		assertTrue(Tup4bigiR.class.isAssignableFrom(Tup4bigiRW.class));
	}
	
	/**
	 * This test ensures, that the interface extends the interface {@link Tup4bigiW}.
	 */
	@Test
	void inheritance_Tup4bigiWTest()
	{
		assertTrue(Tup4bigiW.class.isAssignableFrom(Tup4bigiRW.class));
	}
	
	/**
	 * This test ensures, that the interface extends the interface {@link TupbigiRW}.
	 */
	@Test
	void inheritance_TupbigiRWTest()
	{
		assertTrue(TupbigiRW.class.isAssignableFrom(Tup4bigiRW.class));
	}
	
	/**
	 * This test ensures, that the default implementation of the function {@link Tup4bigiRW#getNewInstance(Tup4bigiR)} calls
	 * the function {@link Tup4bigiRW#getNewInstance(BigInteger, BigInteger, BigInteger, BigInteger)} with the correct components.
	 */
	@Test
	void getNewInstance_Tuple2Test()
	{
		Tup4bigiR original = mock(Tup4bigiR.class);
		Tup4bigiRW newInstance = mock(Tup4bigiRW.class);
		Tup4bigiRW t = mock(Tup4bigiRW.class);
		
		when(t.getNewInstance(original)).thenCallRealMethod();
		
		when(original.getX()).thenReturn(BigInteger.ONE);
		when(original.getY()).thenReturn(BigInteger.valueOf(2));
		when(original.getZ()).thenReturn(BigInteger.valueOf(3));
		when(original.getW()).thenReturn(BigInteger.valueOf(4));
		when(t.getNewInstance(BigInteger.ONE, BigInteger.valueOf(2), BigInteger.valueOf(3), BigInteger.valueOf(4))).thenReturn(newInstance);
		
		assertSame(newInstance, t.getNewInstance(original));
		
		verify(t).getNewInstance(original);
		
		verify(original).getX();
		verify(original).getY();
		verify(original).getZ();
		verify(original).getW();
		verify(t).getNewInstance(BigInteger.ONE, BigInteger.valueOf(2), BigInteger.valueOf(3), BigInteger.valueOf(4));
		
		verifyNoMoreInteractions(t, original);
	}
	
	/**
	 * This test ensures, that the default implementation of the function {@link Tup4bigiRW#getNewInstance(BigInteger)} calls
	 * the function {@link Tup4bigiRW#getNewInstance(BigInteger, BigInteger, BigInteger, BigInteger)} with the correct components.
	 */
	@Test
	void getNewInstance_ValueTest()
	{
		Tup4bigiRW newInstance = mock(Tup4bigiRW.class);
		Tup4bigiRW t = mock(Tup4bigiRW.class);
		
		when(t.getNewInstance(BigInteger.ONE)).thenCallRealMethod();

		when(t.getNewInstance(BigInteger.ONE, BigInteger.ONE, BigInteger.ONE, BigInteger.ONE)).thenReturn(newInstance);
		
		assertSame(newInstance, t.getNewInstance(BigInteger.ONE));
		
		verify(t).getNewInstance(BigInteger.ONE);
		
		verify(t).getNewInstance(BigInteger.ONE, BigInteger.ONE, BigInteger.ONE, BigInteger.ONE);
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the default implementation of the function {@link Tup4bigiRW#getNewInstance(TupbigiR)} calls
	 * the function {@link Tup4bigiRW#getNewInstance(BigInteger, BigInteger, BigInteger, BigInteger)} with the correct components.
	 */
	@Test
	void getNewInstance_TupleTest()
	{
		TupbigiR original = mock(TupbigiR.class);
		Tup4bigiRW newInstance = mock(Tup4bigiRW.class);
		Tup4bigiRW t = mock(Tup4bigiRW.class);
		
		when(t.getNewInstance(original)).thenCallRealMethod();
		
		when(original.getArray()).thenReturn(new BigInteger[] {BigInteger.ONE, BigInteger.valueOf(2), BigInteger.valueOf(3), BigInteger.valueOf(4)});
		when(t.getNewInstance(BigInteger.ONE, BigInteger.valueOf(2), BigInteger.valueOf(3), BigInteger.valueOf(4))).thenReturn(newInstance);
		
		assertSame(newInstance, t.getNewInstance(original));
		
		verify(t).getNewInstance(original);
		
		verify(original).getArray();
		verify(t).getNewInstance(BigInteger.ONE, BigInteger.valueOf(2), BigInteger.valueOf(3), BigInteger.valueOf(4));
		
		verifyNoMoreInteractions(t, original);
	}
	
	/**
	 * This test ensures, that the default implementation of the function {@link Tup4bigiRW#getNewInstanceFromArray(BigInteger[])} calls
	 * the function {@link Tup4bigiRW#getNewInstance(BigInteger, BigInteger, BigInteger, BigInteger)} with the correct components.
	 */
	@Test
	void getNewInstanceFromArrayTest()
	{
		Tup4bigiRW newInstance = mock(Tup4bigiRW.class);
		Tup4bigiRW t = mock(Tup4bigiRW.class);
		
		when(t.getNewInstanceFromArray(new BigInteger[] {BigInteger.ONE, BigInteger.valueOf(2), BigInteger.valueOf(3), BigInteger.valueOf(4)})).thenCallRealMethod();

		when(t.getNewInstance(BigInteger.ONE, BigInteger.valueOf(2), BigInteger.valueOf(3), BigInteger.valueOf(4))).thenReturn(newInstance);
		
		assertSame(newInstance, t.getNewInstanceFromArray(new BigInteger[] {BigInteger.ONE, BigInteger.valueOf(2), BigInteger.valueOf(3), BigInteger.valueOf(4)}));
		
		verify(t).getNewInstanceFromArray(new BigInteger[] {BigInteger.ONE, BigInteger.valueOf(2), BigInteger.valueOf(3), BigInteger.valueOf(4)});
		
		verify(t).getNewInstance(BigInteger.ONE, BigInteger.valueOf(2), BigInteger.valueOf(3), BigInteger.valueOf(4));
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * this test ensures, that the function {@link Tup4bigiRW#getDimensions()} always
	 * returns 4 and does not make any calls.
	 */
	@Test
	void getDimensionsTest()
	{
		Tup4bigiRW t = mock(Tup4bigiRW.class);
		
		when(t.getDimensions()).thenCallRealMethod();
		
		assertEquals(4, t.getDimensions());
		
		verify(t).getDimensions();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4bigiRW#set(Tup4bigiR)} adopts the
	 * values from the input tuple and returns the current instance.
	 */
	@Test
	void set_Tuple2Test()
	{
		Tup4bigiRW t = mock(Tup4bigiRW.class);
		Tup4bigiR t2 = mock(Tup4bigiR.class);
		
		when(t.set(t2)).thenCallRealMethod();
		
		when(t2.getX()).thenReturn(BigInteger.ONE);
		when(t2.getY()).thenReturn(BigInteger.valueOf(2));
		when(t2.getZ()).thenReturn(BigInteger.valueOf(3));
		when(t2.getW()).thenReturn(BigInteger.valueOf(4));
		when(t.set(BigInteger.ONE, BigInteger.valueOf(2), BigInteger.valueOf(3), BigInteger.valueOf(4))).thenReturn(t);
		
		assertSame(t, t.set(t2));
		
		verify(t).set(t2);
		
		verify(t2).getX();
		verify(t2).getY();
		verify(t2).getZ();
		verify(t2).getW();
		verify(t).set(BigInteger.ONE, BigInteger.valueOf(2), BigInteger.valueOf(3), BigInteger.valueOf(4));
		
		verifyNoMoreInteractions(t, t2);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4bigiRW#set(BigInteger)} adopts the
	 * value for each component and returns the current instance.
	 */
	@Test
	void set_ValueTest()
	{
		Tup4bigiRW t = mock(Tup4bigiRW.class);
		
		when(t.set(BigInteger.ONE)).thenCallRealMethod();
		
		when(t.set(BigInteger.ONE, BigInteger.ONE, BigInteger.ONE, BigInteger.ONE)).thenReturn(t);
		
		assertSame(t, t.set(BigInteger.ONE));
		
		verify(t).set(BigInteger.ONE);

		verify(t).set(BigInteger.ONE, BigInteger.ONE, BigInteger.ONE, BigInteger.ONE);
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4bigiRW#set(BigInteger, BigInteger, BigInteger, BigInteger)} adopts
	 * the values and returns the current instance.
	 */
	@Test
	void setTest()
	{
		Tup4bigiRW t = mock(Tup4bigiRW.class);
		
		when(t.set(BigInteger.ONE, BigInteger.valueOf(2), BigInteger.valueOf(3), BigInteger.valueOf(4))).thenCallRealMethod();
		
		when(t.setX(BigInteger.ONE)).thenReturn(t);
		when(t.setY(BigInteger.valueOf(2))).thenReturn(t);
		when(t.setZ(BigInteger.valueOf(3))).thenReturn(t);
		when(t.setW(BigInteger.valueOf(4))).thenReturn(t);
		
		assertSame(t, t.set(BigInteger.ONE, BigInteger.valueOf(2), BigInteger.valueOf(3), BigInteger.valueOf(4)));
		
		verify(t).set(BigInteger.ONE, BigInteger.valueOf(2), BigInteger.valueOf(3), BigInteger.valueOf(4));

		verify(t).setX(BigInteger.ONE);
		verify(t).setY(BigInteger.valueOf(2));
		verify(t).setZ(BigInteger.valueOf(3));
		verify(t).setW(BigInteger.valueOf(4));
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4bigiRW#set(TupbigiR)} adopts the
	 * values from the input tuple and returns the current instance.
	 */
	@Test
	void set_TupleTest()
	{
		Tup4bigiRW t = mock(Tup4bigiRW.class);
		TupbigiR t2 = mock(TupbigiR.class);
		
		when(t.set(t2)).thenCallRealMethod();
		
		when(t2.getArray()).thenReturn(new BigInteger[] {BigInteger.ONE, BigInteger.valueOf(2), BigInteger.valueOf(3), BigInteger.valueOf(4)});
		when(t.set(BigInteger.ONE, BigInteger.valueOf(2), BigInteger.valueOf(3), BigInteger.valueOf(4))).thenReturn(t);

		assertSame(t, t.set(t2));
		
		verify(t).set(t2);
		
		verify(t2).getArray();
		verify(t).set(BigInteger.ONE, BigInteger.valueOf(2), BigInteger.valueOf(3), BigInteger.valueOf(4));

		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4bigiRW#setArray(BigInteger[])} adopts the
	 * values and returns the current instance.
	 */
	@Test
	void setArrayTest()
	{
		Tup4bigiRW t = mock(Tup4bigiRW.class);
		
		when(t.setArray(new BigInteger[] {BigInteger.ONE, BigInteger.valueOf(2), BigInteger.valueOf(3), BigInteger.valueOf(4)})).thenCallRealMethod();
		
		when(t.set(BigInteger.ONE, BigInteger.valueOf(2), BigInteger.valueOf(3), BigInteger.valueOf(4))).thenReturn(t);
		
		assertSame(t, t.setArray(new BigInteger[] {BigInteger.ONE, BigInteger.valueOf(2), BigInteger.valueOf(3), BigInteger.valueOf(4)}));
		
		verify(t).setArray(new BigInteger[] {BigInteger.ONE, BigInteger.valueOf(2), BigInteger.valueOf(3), BigInteger.valueOf(4)});
		
		verify(t).set(BigInteger.ONE, BigInteger.valueOf(2), BigInteger.valueOf(3), BigInteger.valueOf(4));
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4bigiRW#setByIndex(int, BigInteger)} adopts the
	 * value to the x component if the index is 0 and returns the current instance.
	 */
	@Test
	void setByIndex_XTest()
	{
		Tup4bigiRW t = mock(Tup4bigiRW.class);
		
		when(t.setByIndex(0, BigInteger.ONE)).thenCallRealMethod();
		
		when(t.setX(BigInteger.ONE)).thenReturn(t);
		
		assertSame(t, t.setByIndex(0, BigInteger.ONE));
		
		verify(t).setByIndex(0, BigInteger.ONE);
		
		verify(t).setX(BigInteger.ONE);
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4bigiRW#setByIndex(int, BigInteger)} adopts the
	 * value to the y component if the index is 1 and returns the current instance.
	 */
	@Test
	void setByIndex_YTest()
	{
		Tup4bigiRW t = mock(Tup4bigiRW.class);
		
		when(t.setByIndex(1, BigInteger.ONE)).thenCallRealMethod();
		
		when(t.setY(BigInteger.ONE)).thenReturn(t);
		
		assertSame(t, t.setByIndex(1, BigInteger.ONE));
		
		verify(t).setByIndex(1, BigInteger.ONE);
		
		verify(t).setY(BigInteger.ONE);
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4bigiRW#setByIndex(int, BigInteger)} adopts the
	 * value to the z component if the index is 2 and returns the current instance.
	 */
	@Test
	void setByIndex_ZTest()
	{
		Tup4bigiRW t = mock(Tup4bigiRW.class);
		
		when(t.setByIndex(2, BigInteger.ONE)).thenCallRealMethod();
		
		when(t.setZ(BigInteger.ONE)).thenReturn(t);
		
		assertSame(t, t.setByIndex(2, BigInteger.ONE));
		
		verify(t).setByIndex(2, BigInteger.ONE);
		
		verify(t).setZ(BigInteger.ONE);
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4bigiRW#setByIndex(int, BigInteger)} adopts the
	 * value to the w component if the index is 3 and returns the current instance.
	 */
	@Test
	void setByIndex_WTest()
	{
		Tup4bigiRW t = mock(Tup4bigiRW.class);
		
		when(t.setByIndex(3, BigInteger.ONE)).thenCallRealMethod();
		
		when(t.setW(BigInteger.ONE)).thenReturn(t);
		
		assertSame(t, t.setByIndex(3, BigInteger.ONE));
		
		verify(t).setByIndex(3, BigInteger.ONE);
		
		verify(t).setW(BigInteger.ONE);
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4bigiRW#setByIndex(int, BigInteger)} throws
	 * an {@link IndexOutOfBoundsException} for an index different than 0, 1, 2 or 3.
	 */
	@Test
	void setByIndex_ExceptionTest()
	{
		Tup4bigiRW t = mock(Tup4bigiRW.class);
		
		when(t.setByIndex(4, BigInteger.ONE)).thenCallRealMethod();

		assertThrows(IndexOutOfBoundsException.class, new Executable() {
			public void execute() throws Throwable
			{
				t.setByIndex(4, BigInteger.ONE);
			}
		});

		verify(t).setByIndex(4, BigInteger.ONE);

		verifyNoMoreInteractions(t);
	}
}
