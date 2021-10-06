package org.barghos.core.test.api.tuple3;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import java.math.BigInteger;

import org.barghos.core.api.tuple.TupbigiR;
import org.barghos.core.api.tuple.TupbigiRW;
import org.barghos.core.api.tuple3.Tup3bigiR;
import org.barghos.core.api.tuple3.Tup3bigiRW;
import org.barghos.core.api.tuple3.Tup3bigiW;

/**
 * This class provides comoponent tests for the interface {@link Tup3bigiRW}.
 * 
 * @author picatrix1899
 */
class Tup3bigiRWTest
{
	/**
	 * This test ensures, that the interface extends the interface {@link Tup3bigiR}.
	 */
	@Test
	void inheritance_Tup3bigiRTest()
	{
		assertTrue(Tup3bigiR.class.isAssignableFrom(Tup3bigiRW.class));
	}
	
	/**
	 * This test ensures, that the interface extends the interface {@link Tup3bigiW}.
	 */
	@Test
	void inheritance_Tup3bigiWTest()
	{
		assertTrue(Tup3bigiW.class.isAssignableFrom(Tup3bigiRW.class));
	}
	
	/**
	 * This test ensures, that the interface extends the interface {@link TupbigiRW}.
	 */
	@Test
	void inheritance_TupbigiRWTest()
	{
		assertTrue(TupbigiRW.class.isAssignableFrom(Tup3bigiRW.class));
	}
	
	/**
	 * This test ensures, that the default implementation of the function {@link Tup3bigiRW#getNewInstance(Tup3bigiR)} calls
	 * the function {@link Tup3bigiRW#getNewInstance(BigInteger, BigInteger, BigInteger)} with the correct components.
	 */
	@Test
	void getNewInstance_Tuple2Test()
	{
		Tup3bigiR original = mock(Tup3bigiR.class);
		Tup3bigiRW newInstance = mock(Tup3bigiRW.class);
		Tup3bigiRW t = mock(Tup3bigiRW.class);
		
		when(t.getNewInstance(original)).thenCallRealMethod();
		
		when(original.getX()).thenReturn(BigInteger.ONE);
		when(original.getY()).thenReturn(BigInteger.valueOf(2));
		when(original.getZ()).thenReturn(BigInteger.valueOf(3));
		when(t.getNewInstance(BigInteger.ONE, BigInteger.valueOf(2), BigInteger.valueOf(3))).thenReturn(newInstance);
		
		assertSame(newInstance, t.getNewInstance(original));
		
		verify(t).getNewInstance(original);
		
		verify(original).getX();
		verify(original).getY();
		verify(original).getZ();
		verify(t).getNewInstance(BigInteger.ONE, BigInteger.valueOf(2), BigInteger.valueOf(3));
		
		verifyNoMoreInteractions(t, original);
	}
	
	/**
	 * This test ensures, that the default implementation of the function {@link Tup3bigiRW#getNewInstance(BigInteger)} calls
	 * the function {@link Tup3bigiRW#getNewInstance(BigInteger, BigInteger, BigInteger)} with the correct components.
	 */
	@Test
	void getNewInstance_ValueTest()
	{
		Tup3bigiRW newInstance = mock(Tup3bigiRW.class);
		Tup3bigiRW t = mock(Tup3bigiRW.class);
		
		when(t.getNewInstance(BigInteger.ONE)).thenCallRealMethod();

		when(t.getNewInstance(BigInteger.ONE, BigInteger.ONE, BigInteger.ONE)).thenReturn(newInstance);
		
		assertSame(newInstance, t.getNewInstance(BigInteger.ONE));
		
		verify(t).getNewInstance(BigInteger.ONE);
		
		verify(t).getNewInstance(BigInteger.ONE, BigInteger.ONE, BigInteger.ONE);
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the default implementation of the function {@link Tup3bigiRW#getNewInstance(TupbigiR)} calls
	 * the function {@link Tup3bigiRW#getNewInstance(BigInteger, BigInteger, BigInteger)} with the correct components.
	 */
	@Test
	void getNewInstance_TupleTest()
	{
		TupbigiR original = mock(TupbigiR.class);
		Tup3bigiRW newInstance = mock(Tup3bigiRW.class);
		Tup3bigiRW t = mock(Tup3bigiRW.class);
		
		when(t.getNewInstance(original)).thenCallRealMethod();
		
		when(original.getArray()).thenReturn(new BigInteger[] {BigInteger.ONE, BigInteger.valueOf(2), BigInteger.valueOf(3)});
		when(t.getNewInstance(BigInteger.ONE, BigInteger.valueOf(2), BigInteger.valueOf(3))).thenReturn(newInstance);
		
		assertSame(newInstance, t.getNewInstance(original));
		
		verify(t).getNewInstance(original);
		
		verify(original).getArray();
		verify(t).getNewInstance(BigInteger.ONE, BigInteger.valueOf(2), BigInteger.valueOf(3));
		
		verifyNoMoreInteractions(t, original);
	}
	
	/**
	 * This test ensures, that the default implementation of the function {@link Tup3bigiRW#getNewInstanceFromArray(BigInteger[])} calls
	 * the function {@link Tup3bigiRW#getNewInstance(BigInteger, BigInteger, BigInteger)} with the correct components.
	 */
	@Test
	void getNewInstanceFromArrayTest()
	{
		Tup3bigiRW newInstance = mock(Tup3bigiRW.class);
		Tup3bigiRW t = mock(Tup3bigiRW.class);
		
		when(t.getNewInstanceFromArray(new BigInteger[] {BigInteger.ONE, BigInteger.valueOf(2), BigInteger.valueOf(3)})).thenCallRealMethod();

		when(t.getNewInstance(BigInteger.ONE, BigInteger.valueOf(2), BigInteger.valueOf(3))).thenReturn(newInstance);
		
		assertSame(newInstance, t.getNewInstanceFromArray(new BigInteger[] {BigInteger.ONE, BigInteger.valueOf(2), BigInteger.valueOf(3)}));
		
		verify(t).getNewInstanceFromArray(new BigInteger[] {BigInteger.ONE, BigInteger.valueOf(2), BigInteger.valueOf(3)});
		
		verify(t).getNewInstance(BigInteger.ONE, BigInteger.valueOf(2), BigInteger.valueOf(3));
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * this test ensures, that the function {@link Tup3bigiRW#getDimensions()} always
	 * returns 3 and does not make any calls.
	 */
	@Test
	void getDimensionsTest()
	{
		Tup3bigiRW t = mock(Tup3bigiRW.class);
		
		when(t.getDimensions()).thenCallRealMethod();
		
		assertEquals(3, t.getDimensions());
		
		verify(t).getDimensions();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup3bigiRW#set(Tup3bigiR)} adopts the
	 * values from the input tuple and returns the current instance.
	 */
	@Test
	void set_Tuple2Test()
	{
		Tup3bigiRW t = mock(Tup3bigiRW.class);
		Tup3bigiR t2 = mock(Tup3bigiR.class);
		
		when(t.set(t2)).thenCallRealMethod();
		
		when(t2.getX()).thenReturn(BigInteger.ONE);
		when(t2.getY()).thenReturn(BigInteger.valueOf(2));
		when(t2.getZ()).thenReturn(BigInteger.valueOf(3));
		when(t.set(BigInteger.ONE, BigInteger.valueOf(2), BigInteger.valueOf(3))).thenReturn(t);
		
		assertSame(t, t.set(t2));
		
		verify(t).set(t2);
		
		verify(t2).getX();
		verify(t2).getY();
		verify(t2).getZ();
		verify(t).set(BigInteger.ONE, BigInteger.valueOf(2), BigInteger.valueOf(3));
		
		verifyNoMoreInteractions(t, t2);
	}
	
	/**
	 * This test ensures, that the function {@link Tup3bigiRW#set(BigInteger)} adopts the
	 * value for each component and returns the current instance.
	 */
	@Test
	void set_ValueTest()
	{
		Tup3bigiRW t = mock(Tup3bigiRW.class);
		
		when(t.set(BigInteger.ONE)).thenCallRealMethod();
		
		when(t.set(BigInteger.ONE, BigInteger.ONE, BigInteger.ONE)).thenReturn(t);
		
		assertSame(t, t.set(BigInteger.ONE));
		
		verify(t).set(BigInteger.ONE);

		verify(t).set(BigInteger.ONE, BigInteger.ONE, BigInteger.ONE);
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup3bigiRW#set(BigInteger, BigInteger, BigInteger)} adopts
	 * the values and returns the current instance.
	 */
	@Test
	void setTest()
	{
		Tup3bigiRW t = mock(Tup3bigiRW.class);
		
		when(t.set(BigInteger.ONE, BigInteger.valueOf(2), BigInteger.valueOf(3))).thenCallRealMethod();
		
		when(t.setX(BigInteger.ONE)).thenReturn(t);
		when(t.setY(BigInteger.valueOf(2))).thenReturn(t);
		when(t.setZ(BigInteger.valueOf(3))).thenReturn(t);
		
		assertSame(t, t.set(BigInteger.ONE, BigInteger.valueOf(2), BigInteger.valueOf(3)));
		
		verify(t).set(BigInteger.ONE, BigInteger.valueOf(2), BigInteger.valueOf(3));

		verify(t).setX(BigInteger.ONE);
		verify(t).setY(BigInteger.valueOf(2));
		verify(t).setZ(BigInteger.valueOf(3));
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup3bigiRW#set(TupbigiR)} adopts the
	 * values from the input tuple and returns the current instance.
	 */
	@Test
	void set_TupleTest()
	{
		Tup3bigiRW t = mock(Tup3bigiRW.class);
		TupbigiR t2 = mock(TupbigiR.class);
		
		when(t.set(t2)).thenCallRealMethod();
		
		when(t2.getArray()).thenReturn(new BigInteger[] {BigInteger.ONE, BigInteger.valueOf(2), BigInteger.valueOf(3)});
		when(t.set(BigInteger.ONE, BigInteger.valueOf(2), BigInteger.valueOf(3))).thenReturn(t);

		assertSame(t, t.set(t2));
		
		verify(t).set(t2);
		
		verify(t2).getArray();
		verify(t).set(BigInteger.ONE, BigInteger.valueOf(2), BigInteger.valueOf(3));

		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup3bigiRW#setArray(BigInteger[])} adopts the
	 * values and returns the current instance.
	 */
	@Test
	void setArrayTest()
	{
		Tup3bigiRW t = mock(Tup3bigiRW.class);
		
		when(t.setArray(new BigInteger[] {BigInteger.ONE, BigInteger.valueOf(2), BigInteger.valueOf(3)})).thenCallRealMethod();
		
		when(t.set(BigInteger.ONE, BigInteger.valueOf(2), BigInteger.valueOf(3))).thenReturn(t);
		
		assertSame(t, t.setArray(new BigInteger[] {BigInteger.ONE, BigInteger.valueOf(2), BigInteger.valueOf(3)}));
		
		verify(t).setArray(new BigInteger[] {BigInteger.ONE, BigInteger.valueOf(2), BigInteger.valueOf(3)});
		
		verify(t).set(BigInteger.ONE, BigInteger.valueOf(2), BigInteger.valueOf(3));
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup3bigiRW#setByIndex(int, BigInteger)} adopts the
	 * value to the x component if the index is 0 and returns the current instance.
	 */
	@Test
	void setByIndex_XTest()
	{
		Tup3bigiRW t = mock(Tup3bigiRW.class);
		
		when(t.setByIndex(0, BigInteger.ONE)).thenCallRealMethod();
		
		when(t.setX(BigInteger.ONE)).thenReturn(t);
		
		assertSame(t, t.setByIndex(0, BigInteger.ONE));
		
		verify(t).setByIndex(0, BigInteger.ONE);
		
		verify(t).setX(BigInteger.ONE);
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup3bigiRW#setByIndex(int, BigInteger)} adopts the
	 * value to the y component if the index is 1 and returns the current instance.
	 */
	@Test
	void setByIndex_YTest()
	{
		Tup3bigiRW t = mock(Tup3bigiRW.class);
		
		when(t.setByIndex(1, BigInteger.ONE)).thenCallRealMethod();
		
		when(t.setY(BigInteger.ONE)).thenReturn(t);
		
		assertSame(t, t.setByIndex(1, BigInteger.ONE));
		
		verify(t).setByIndex(1, BigInteger.ONE);
		
		verify(t).setY(BigInteger.ONE);
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup3bigiRW#setByIndex(int, BigInteger)} adopts the
	 * value to the z component if the index is 2 and returns the current instance.
	 */
	@Test
	void setByIndex_ZTest()
	{
		Tup3bigiRW t = mock(Tup3bigiRW.class);
		
		when(t.setByIndex(2, BigInteger.ONE)).thenCallRealMethod();
		
		when(t.setZ(BigInteger.ONE)).thenReturn(t);
		
		assertSame(t, t.setByIndex(2, BigInteger.ONE));
		
		verify(t).setByIndex(2, BigInteger.ONE);
		
		verify(t).setZ(BigInteger.ONE);
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup3bigiRW#setByIndex(int, BigInteger)} throws
	 * an {@link IndexOutOfBoundsException} for an index different than 0, 1 or 2.
	 */
	@Test
	void setByIndex_ExceptionTest()
	{
		Tup3bigiRW t = mock(Tup3bigiRW.class);
		
		when(t.setByIndex(3, BigInteger.ONE)).thenCallRealMethod();

		assertThrows(IndexOutOfBoundsException.class, new Executable() {
			public void execute() throws Throwable
			{
				t.setByIndex(3, BigInteger.ONE);
			}
		});

		verify(t).setByIndex(3, BigInteger.ONE);

		verifyNoMoreInteractions(t);
	}
}
