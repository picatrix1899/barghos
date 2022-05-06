package org.barghos.core.test.api.tuple2;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import java.math.BigInteger;

import static org.barghos.core.api.testing.TestObjectFactory.*;

import org.barghos.core.api.tuple.TupbigiC;
import org.barghos.core.api.tuple.TupbigiR;
import org.barghos.core.api.tuple2.Tup2bigiC;
import org.barghos.core.api.tuple2.Tup2bigiR;

/**
 * This class provides comoponent tests for the interface {@link Tup2bigiC}.
 * 
 * @author picatrix1899
 */
class Tup2bigiCTest
{
	/**
	 * This test ensures, that the interface extends the interface {@link Tup2bigiR}.
	 */
	@Test
	void inheritance_Tup2bigiRTest()
	{
		assertTrue(Tup2bigiR.class.isAssignableFrom(Tup2bigiC.class));
	}
	
	/**
	 * This test ensures, that the interface extends the interface {@link TupbigiC}.
	 */
	@Test
	void inheritance_TupbigiCTest()
	{
		assertTrue(TupbigiC.class.isAssignableFrom(Tup2bigiC.class));
	}
	
	/**
	 * This test ensures, that the function {@link Tup2bigiC#set(Tup2bigiR)} adopts the
	 * values from the input tuple and returns the current instance.
	 */
	@Test
	void set_Tuple2Test()
	{
		Tup2bigiC t = mock(Tup2bigiC.class);
		Tup2bigiR t2 = mock(Tup2bigiR.class);
		
		when(t.set(t2)).thenCallRealMethod();
		
		when(t2.getX()).thenReturn(bigi(1));
		when(t2.getY()).thenReturn(bigi(2));
		when(t.set(bigi(1), bigi(2))).thenReturn(t);
		
		assertSame(t, t.set(t2));
		
		verify(t).set(t2);
		
		verify(t2).getX();
		verify(t2).getY();
		verify(t).set(bigi(1), bigi(2));
		
		verifyNoMoreInteractions(t, t2);
	}
	
	/**
	 * This test ensures, that the function {@link Tup2bigiC#set(BigInteger)} adopts the
	 * value for each component and returns the current instance.
	 */
	@Test
	void set_ValueTest()
	{
		Tup2bigiC t = mock(Tup2bigiC.class);
		
		when(t.set(bigi(1))).thenCallRealMethod();
		
		when(t.set(bigi(1), bigi(1))).thenReturn(t);
		
		assertSame(t, t.set(bigi(1)));
		
		verify(t).set(bigi(1));

		verify(t).set(bigi(1), bigi(1));
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup2bigiC#set(BigInteger, BigInteger)} adopts
	 * the values and returns the current instance.
	 */
	@Test
	void setTest()
	{
		Tup2bigiC t = mock(Tup2bigiC.class);
		
		when(t.set(bigi(1), bigi(2))).thenCallRealMethod();
		
		when(t.setX(bigi(1))).thenReturn(t);
		when(t.setY(bigi(2))).thenReturn(t);
		
		assertSame(t, t.set(bigi(1), bigi(2)));
		
		verify(t).set(bigi(1), bigi(2));

		verify(t).setX(bigi(1));
		verify(t).setY(bigi(2));
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup2bigiC#set(TupbigiR)} adopts the
	 * values from the input tuple and returns the current instance.
	 */
	@Test
	void set_TupleTest()
	{
		Tup2bigiC t = mock(Tup2bigiC.class);
		TupbigiR t2 = mock(TupbigiR.class);
		
		when(t.set(t2)).thenCallRealMethod();
		
		when(t2.toArray()).thenReturn(bigiArray(1, 2));
		when(t.setArray(bigiArray(1, 2))).thenReturn(t);

		assertSame(t, t.set(t2));
		
		verify(t).set(t2);
		
		verify(t2).toArray();
		verify(t).setArray(bigiArray(1, 2));

		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup2bigiC#setByIndex(int, BigInteger)} adopts the
	 * value to the x component if the index is 0 and returns the current instance.
	 */
	@Test
	void setByIndex_XTest()
	{
		Tup2bigiC t = mock(Tup2bigiC.class);
		
		when(t.setByIndex(0, bigi(1))).thenCallRealMethod();
		
		when(t.setX(bigi(1))).thenReturn(t);
		
		assertSame(t, t.setByIndex(0, bigi(1)));
		
		verify(t).setByIndex(0, bigi(1));
		
		verify(t).setX(bigi(1));
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup2bigiC#setByIndex(int, BigInteger)} adopts the
	 * value to the y component if the index is 1 and returns the current instance.
	 */
	@Test
	void setByIndex_YTest()
	{
		Tup2bigiC t = mock(Tup2bigiC.class);
		
		when(t.setByIndex(1, bigi(1))).thenCallRealMethod();
		
		when(t.setY(bigi(1))).thenReturn(t);
		
		assertSame(t, t.setByIndex(1, bigi(1)));
		
		verify(t).setByIndex(1, bigi(1));
		
		verify(t).setY(bigi(1));
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup2bigiC#setByIndex(int, BigInteger)} throws
	 * an {@link IndexOutOfBoundsException} for an index different than 0 or 1.
	 */
	@Test
	void setByIndex_ExceptionTest()
	{
		Tup2bigiC t = mock(Tup2bigiC.class);
		
		when(t.setByIndex(2, bigi(1))).thenCallRealMethod();

		assertThrows(IndexOutOfBoundsException.class, new Executable() {
			public void execute() throws Throwable
			{
				t.setByIndex(2, bigi(1));
			}
		});

		verify(t).setByIndex(2, bigi(1));

		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup2bigiC#shallowClone()} calls
	 * by default the standard {@link Tup2bigiC#clone()}-function.
	 */
	@Test
	void shallowCloneTest()
	{
		Tup2bigiC t = mock(Tup2bigiC.class);
		Tup2bigiC res = mock(Tup2bigiC.class);
		
		when(t.shallowClone()).thenCallRealMethod();
		when(t.clone()).thenReturn(res);
		
		assertSame(res, t.shallowClone());
		
		verify(t).shallowClone();
		verify(t).clone();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup2bigiC#deepClone()} calls
	 * by default the standard {@link Tup2bigiC#clone()}-function.
	 */
	@Test
	void deepCloneTest()
	{
		Tup2bigiC t = mock(Tup2bigiC.class);
		Tup2bigiC res = mock(Tup2bigiC.class);

		when(t.deepClone()).thenCallRealMethod();
		when(t.clone()).thenReturn(res);
		
		assertSame(res, t.deepClone());
		
		verify(t).deepClone();
		verify(t).clone();
		
		verifyNoMoreInteractions(t);
	}
}
