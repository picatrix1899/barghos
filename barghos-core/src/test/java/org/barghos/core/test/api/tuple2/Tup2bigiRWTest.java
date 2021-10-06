package org.barghos.core.test.api.tuple2;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import java.math.BigInteger;

import org.barghos.core.api.tuple.TupbigiR;
import org.barghos.core.api.tuple.TupbigiRW;
import org.barghos.core.api.tuple2.Tup2bigiR;
import org.barghos.core.api.tuple2.Tup2bigiRW;
import org.barghos.core.api.tuple2.Tup2bigiW;

/**
 * This class provides comoponent tests for the interface {@link Tup2bigiRW}.
 * 
 * @author picatrix1899
 */
class Tup2bigiRWTest
{
	/**
	 * This test ensures, that the interface extends the interface {@link Tup2bigiR}.
	 */
	@Test
	void inheritance_Tup2bigiRTest()
	{
		assertTrue(Tup2bigiR.class.isAssignableFrom(Tup2bigiRW.class));
	}
	
	/**
	 * This test ensures, that the interface extends the interface {@link Tup2bigiW}.
	 */
	@Test
	void inheritance_Tup2bigiWTest()
	{
		assertTrue(Tup2bigiW.class.isAssignableFrom(Tup2bigiRW.class));
	}
	
	/**
	 * This test ensures, that the interface extends the interface {@link TupbigiRW}.
	 */
	@Test
	void inheritance_TupbigiRWTest()
	{
		assertTrue(TupbigiRW.class.isAssignableFrom(Tup2bigiRW.class));
	}
	
	/**
	 * This test ensures, that the default implementation of the function {@link Tup2bigiRW#getNewInstance(Tup2bigiR)} calls
	 * the function {@link Tup2bigiRW#getNewInstance(BigInteger, BigInteger)} with the correct components.
	 */
	@Test
	void getNewInstance_Tuple2Test()
	{
		Tup2bigiR original = mock(Tup2bigiR.class);
		Tup2bigiRW newInstance = mock(Tup2bigiRW.class);
		Tup2bigiRW t = mock(Tup2bigiRW.class);
		
		when(t.getNewInstance(original)).thenCallRealMethod();
		
		when(original.getX()).thenReturn(BigInteger.ONE);
		when(original.getY()).thenReturn(BigInteger.valueOf(2));
		when(t.getNewInstance(BigInteger.ONE, BigInteger.valueOf(2))).thenReturn(newInstance);
		
		assertSame(newInstance, t.getNewInstance(original));
		
		verify(t).getNewInstance(original);
		
		verify(original).getX();
		verify(original).getY();
		verify(t).getNewInstance(BigInteger.ONE, BigInteger.valueOf(2));
		
		verifyNoMoreInteractions(t, original);
	}
	
	/**
	 * This test ensures, that the default implementation of the function {@link Tup2bigiRW#getNewInstance(BigInteger)} calls
	 * the function {@link Tup2bigiRW#getNewInstance(BigInteger, BigInteger)} with the correct components.
	 */
	@Test
	void getNewInstance_ValueTest()
	{
		Tup2bigiRW newInstance = mock(Tup2bigiRW.class);
		Tup2bigiRW t = mock(Tup2bigiRW.class);
		
		when(t.getNewInstance(BigInteger.ONE)).thenCallRealMethod();

		when(t.getNewInstance(BigInteger.ONE, BigInteger.ONE)).thenReturn(newInstance);
		
		assertSame(newInstance, t.getNewInstance(BigInteger.ONE));
		
		verify(t).getNewInstance(BigInteger.ONE);
		
		verify(t).getNewInstance(BigInteger.ONE, BigInteger.ONE);
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the default implementation of the function {@link Tup2bigiRW#getNewInstance(TupbigiR)} calls
	 * the function {@link Tup2bigiRW#getNewInstance(BigInteger, BigInteger)} with the correct components.
	 */
	@Test
	void getNewInstance_TupleTest()
	{
		TupbigiR original = mock(TupbigiR.class);
		Tup2bigiRW newInstance = mock(Tup2bigiRW.class);
		Tup2bigiRW t = mock(Tup2bigiRW.class);
		
		when(t.getNewInstance(original)).thenCallRealMethod();
		
		when(original.getArray()).thenReturn(new BigInteger[] {BigInteger.ONE, BigInteger.valueOf(2)});
		when(t.getNewInstance(BigInteger.ONE, BigInteger.valueOf(2))).thenReturn(newInstance);
		
		assertSame(newInstance, t.getNewInstance(original));
		
		verify(t).getNewInstance(original);
		
		verify(original).getArray();
		verify(t).getNewInstance(BigInteger.ONE, BigInteger.valueOf(2));
		
		verifyNoMoreInteractions(t, original);
	}
	
	/**
	 * This test ensures, that the default implementation of the function {@link Tup2bigiRW#getNewInstanceFromArray(BigInteger[])} calls
	 * the function {@link Tup2bigiRW#getNewInstance(BigInteger, BigInteger)} with the correct components.
	 */
	@Test
	void getNewInstanceFromArrayTest()
	{
		Tup2bigiRW newInstance = mock(Tup2bigiRW.class);
		Tup2bigiRW t = mock(Tup2bigiRW.class);
		
		when(t.getNewInstanceFromArray(new BigInteger[] {BigInteger.ONE, BigInteger.valueOf(2)})).thenCallRealMethod();

		when(t.getNewInstance(BigInteger.ONE, BigInteger.valueOf(2))).thenReturn(newInstance);
		
		assertSame(newInstance, t.getNewInstanceFromArray(new BigInteger[] {BigInteger.ONE, BigInteger.valueOf(2)}));
		
		verify(t).getNewInstanceFromArray(new BigInteger[] {BigInteger.ONE, BigInteger.valueOf(2)});
		
		verify(t).getNewInstance(BigInteger.ONE, BigInteger.valueOf(2));
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * this test ensures, that the function {@link Tup2bigiRW#getDimensions()} always
	 * returns 2 and does not make any calls.
	 */
	@Test
	void getDimensionsTest()
	{
		Tup2bigiRW t = mock(Tup2bigiRW.class);
		
		when(t.getDimensions()).thenCallRealMethod();
		
		assertEquals(2, t.getDimensions());
		
		verify(t).getDimensions();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup2bigiRW#set(Tup2bigiR)} adopts the
	 * values from the input tuple and returns the current instance.
	 */
	@Test
	void set_Tuple2Test()
	{
		Tup2bigiRW t = mock(Tup2bigiRW.class);
		Tup2bigiR t2 = mock(Tup2bigiR.class);
		
		when(t.set(t2)).thenCallRealMethod();
		
		when(t2.getX()).thenReturn(BigInteger.ONE);
		when(t2.getY()).thenReturn(BigInteger.valueOf(2));
		when(t.set(BigInteger.ONE, BigInteger.valueOf(2))).thenReturn(t);
		
		assertSame(t, t.set(t2));
		
		verify(t).set(t2);
		
		verify(t2).getX();
		verify(t2).getY();
		verify(t).set(BigInteger.ONE, BigInteger.valueOf(2));
		
		verifyNoMoreInteractions(t, t2);
	}
	
	/**
	 * This test ensures, that the function {@link Tup2bigiRW#set(BigInteger)} adopts the
	 * value for each component and returns the current instance.
	 */
	@Test
	void set_ValueTest()
	{
		Tup2bigiRW t = mock(Tup2bigiRW.class);
		
		when(t.set(BigInteger.ONE)).thenCallRealMethod();
		
		when(t.set(BigInteger.ONE, BigInteger.ONE)).thenReturn(t);
		
		assertSame(t, t.set(BigInteger.ONE));
		
		verify(t).set(BigInteger.ONE);

		verify(t).set(BigInteger.ONE, BigInteger.ONE);
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup2bigiRW#set(BigInteger, BigInteger)} adopts
	 * the values and returns the current instance.
	 */
	@Test
	void setTest()
	{
		Tup2bigiRW t = mock(Tup2bigiRW.class);
		
		when(t.set(BigInteger.ONE, BigInteger.valueOf(2))).thenCallRealMethod();
		
		when(t.setX(BigInteger.ONE)).thenReturn(t);
		when(t.setY(BigInteger.valueOf(2))).thenReturn(t);
		
		assertSame(t, t.set(BigInteger.ONE, BigInteger.valueOf(2)));
		
		verify(t).set(BigInteger.ONE, BigInteger.valueOf(2));

		verify(t).setX(BigInteger.ONE);
		verify(t).setY(BigInteger.valueOf(2));
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup2bigiRW#set(TupbigiR)} adopts the
	 * values from the input tuple and returns the current instance.
	 */
	@Test
	void set_TupleTest()
	{
		Tup2bigiRW t = mock(Tup2bigiRW.class);
		TupbigiR t2 = mock(TupbigiR.class);
		
		when(t.set(t2)).thenCallRealMethod();
		
		when(t2.getArray()).thenReturn(new BigInteger[] {BigInteger.ONE, BigInteger.valueOf(2)});
		when(t.set(BigInteger.ONE, BigInteger.valueOf(2))).thenReturn(t);

		assertSame(t, t.set(t2));
		
		verify(t).set(t2);
		
		verify(t2).getArray();
		verify(t).set(BigInteger.ONE, BigInteger.valueOf(2));

		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup2bigiRW#setArray(BigInteger[])} adopts the
	 * values and returns the current instance.
	 */
	@Test
	void setArrayTest()
	{
		Tup2bigiRW t = mock(Tup2bigiRW.class);
		
		when(t.setArray(new BigInteger[] {BigInteger.ONE, BigInteger.valueOf(2)})).thenCallRealMethod();
		
		when(t.set(BigInteger.ONE, BigInteger.valueOf(2))).thenReturn(t);
		
		assertSame(t, t.setArray(new BigInteger[] {BigInteger.ONE, BigInteger.valueOf(2)}));
		
		verify(t).setArray(new BigInteger[] {BigInteger.ONE, BigInteger.valueOf(2)});
		
		verify(t).set(BigInteger.ONE, BigInteger.valueOf(2));
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup2bigiRW#setByIndex(int, BigInteger)} adopts the
	 * value to the x component if the index is 0 and returns the current instance.
	 */
	@Test
	void setByIndex_XTest()
	{
		Tup2bigiRW t = mock(Tup2bigiRW.class);
		
		when(t.setByIndex(0, BigInteger.ONE)).thenCallRealMethod();
		
		when(t.setX(BigInteger.ONE)).thenReturn(t);
		
		assertSame(t, t.setByIndex(0, BigInteger.ONE));
		
		verify(t).setByIndex(0, BigInteger.ONE);
		
		verify(t).setX(BigInteger.ONE);
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup2bigiRW#setByIndex(int, BigInteger)} adopts the
	 * value to the y component if the index is 1 and returns the current instance.
	 */
	@Test
	void setByIndex_YTest()
	{
		Tup2bigiRW t = mock(Tup2bigiRW.class);
		
		when(t.setByIndex(1, BigInteger.ONE)).thenCallRealMethod();
		
		when(t.setY(BigInteger.ONE)).thenReturn(t);
		
		assertSame(t, t.setByIndex(1, BigInteger.ONE));
		
		verify(t).setByIndex(1, BigInteger.ONE);
		
		verify(t).setY(BigInteger.ONE);
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup2bigiRW#setByIndex(int, BigInteger)} throws
	 * an {@link IndexOutOfBoundsException} for an index different than 0 or 1.
	 */
	@Test
	void setByIndex_ExceptionTest()
	{
		Tup2bigiRW t = mock(Tup2bigiRW.class);
		
		when(t.setByIndex(2, BigInteger.ONE)).thenCallRealMethod();

		assertThrows(IndexOutOfBoundsException.class, new Executable() {
			public void execute() throws Throwable
			{
				t.setByIndex(2, BigInteger.ONE);
			}
		});

		verify(t).setByIndex(2, BigInteger.ONE);

		verifyNoMoreInteractions(t);
	}
}
