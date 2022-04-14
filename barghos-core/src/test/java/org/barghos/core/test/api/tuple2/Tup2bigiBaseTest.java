package org.barghos.core.test.api.tuple2;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import java.math.BigInteger;

import org.barghos.core.api.tuple.TupbigiBase;
import org.barghos.core.api.tuple.TupbigiR;
import org.barghos.core.api.tuple2.Tup2bigiBase;
import org.barghos.core.api.tuple2.Tup2bigiR;

/**
 * This class provides comoponent tests for the interface {@link Tup2bigiBase}.
 * 
 * @author picatrix1899
 */
class Tup2bigiBaseTest
{
	/**
	 * This test ensures, that the interface extends the interface {@link Tup2bigiR}.
	 */
	@Test
	void inheritance_Tup2bigiRTest()
	{
		assertTrue(Tup2bigiR.class.isAssignableFrom(Tup2bigiBase.class));
	}
	
	/**
	 * This test ensures, that the interface extends the interface {@link TupbigiBase}.
	 */
	@Test
	void inheritance_TupbigiBaseTest()
	{
		assertTrue(TupbigiBase.class.isAssignableFrom(Tup2bigiBase.class));
	}
	
	/**
	 * This test ensures, that the function {@link Tup2bigiBase#set(Tup2bigiR)} adopts the
	 * values from the input tuple and returns the current instance.
	 */
	@Test
	void set_Tuple2Test()
	{
		Tup2bigiBase t = mock(Tup2bigiBase.class);
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
	 * This test ensures, that the function {@link Tup2bigiBase#set(BigInteger)} adopts the
	 * value for each component and returns the current instance.
	 */
	@Test
	void set_ValueTest()
	{
		Tup2bigiBase t = mock(Tup2bigiBase.class);
		
		when(t.set(BigInteger.ONE)).thenCallRealMethod();
		
		when(t.set(BigInteger.ONE, BigInteger.ONE)).thenReturn(t);
		
		assertSame(t, t.set(BigInteger.ONE));
		
		verify(t).set(BigInteger.ONE);

		verify(t).set(BigInteger.ONE, BigInteger.ONE);
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup2bigiBase#set(BigInteger, BigInteger)} adopts
	 * the values and returns the current instance.
	 */
	@Test
	void setTest()
	{
		Tup2bigiBase t = mock(Tup2bigiBase.class);
		
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
	 * This test ensures, that the function {@link Tup2bigiBase#set(TupbigiR)} adopts the
	 * values from the input tuple and returns the current instance.
	 */
	@Test
	void set_TupleTest()
	{
		Tup2bigiBase t = mock(Tup2bigiBase.class);
		TupbigiR t2 = mock(TupbigiR.class);
		
		when(t.set(t2)).thenCallRealMethod();
		
		when(t2.toArray()).thenReturn(new BigInteger[] {BigInteger.ONE, BigInteger.valueOf(2)});
		when(t.setArray(new BigInteger[] {BigInteger.ONE, BigInteger.valueOf(2)})).thenReturn(t);

		assertSame(t, t.set(t2));
		
		verify(t).set(t2);
		
		verify(t2).toArray();
		verify(t).setArray(new BigInteger[] {BigInteger.ONE, BigInteger.valueOf(2)});

		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup2bigiBase#setByIndex(int, BigInteger)} adopts the
	 * value to the x component if the index is 0 and returns the current instance.
	 */
	@Test
	void setByIndex_XTest()
	{
		Tup2bigiBase t = mock(Tup2bigiBase.class);
		
		when(t.setByIndex(0, BigInteger.ONE)).thenCallRealMethod();
		
		when(t.setX(BigInteger.ONE)).thenReturn(t);
		
		assertSame(t, t.setByIndex(0, BigInteger.ONE));
		
		verify(t).setByIndex(0, BigInteger.ONE);
		
		verify(t).setX(BigInteger.ONE);
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup2bigiBase#setByIndex(int, BigInteger)} adopts the
	 * value to the y component if the index is 1 and returns the current instance.
	 */
	@Test
	void setByIndex_YTest()
	{
		Tup2bigiBase t = mock(Tup2bigiBase.class);
		
		when(t.setByIndex(1, BigInteger.ONE)).thenCallRealMethod();
		
		when(t.setY(BigInteger.ONE)).thenReturn(t);
		
		assertSame(t, t.setByIndex(1, BigInteger.ONE));
		
		verify(t).setByIndex(1, BigInteger.ONE);
		
		verify(t).setY(BigInteger.ONE);
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup2bigiBase#setByIndex(int, BigInteger)} throws
	 * an {@link IndexOutOfBoundsException} for an index different than 0 or 1.
	 */
	@Test
	void setByIndex_ExceptionTest()
	{
		Tup2bigiBase t = mock(Tup2bigiBase.class);
		
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
