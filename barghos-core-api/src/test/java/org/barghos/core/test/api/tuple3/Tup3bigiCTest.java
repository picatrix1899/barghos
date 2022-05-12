package org.barghos.core.test.api.tuple3;

import static org.barghos.testutils.TestObjectFactory.*;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import java.math.BigInteger;

import org.barghos.core.api.tuple.TupbigiC;
import org.barghos.core.api.tuple.TupbigiR;
import org.barghos.core.api.tuple3.Tup3bigiC;
import org.barghos.core.api.tuple3.Tup3bigiR;

/**
 * This class provides comoponent tests for the interface {@link Tup3bigiC}.
 * 
 * @author picatrix1899
 */
class Tup3bigiCTest
{
	/**
	 * This test ensures, that the interface extends the interface {@link Tup3bigiR}.
	 */
	@Test
	void inheritance_Tup3bigiRTest()
	{
		assertTrue(Tup3bigiR.class.isAssignableFrom(Tup3bigiC.class));
	}
	
	/**
	 * This test ensures, that the interface extends the interface {@link Tup3bigiC}.
	 */
	@Test
	void inheritance_TupbigiCTest()
	{
		assertTrue(TupbigiC.class.isAssignableFrom(Tup3bigiC.class));
	}
	
	/**
	 * This test ensures, that the function {@link Tup3bigiC#set(Tup3bigiR)} adopts the
	 * values from the input tuple and returns the current instance.
	 */
	@Test
	void set_Tuple2Test()
	{
		Tup3bigiC t = mock(Tup3bigiC.class);
		Tup3bigiR t2 = mock(Tup3bigiR.class);
		
		when(t.set(t2)).thenCallRealMethod();
		
		when(t2.getX()).thenReturn(bigi(1));
		when(t2.getY()).thenReturn(bigi(2));
		when(t2.getZ()).thenReturn(bigi(3));
		when(t.set(bigi(1), bigi(2), bigi(3))).thenReturn(t);
		
		assertSame(t, t.set(t2));
		
		verify(t).set(t2);
		
		verify(t2).getX();
		verify(t2).getY();
		verify(t2).getZ();
		verify(t).set(bigi(1), bigi(2), bigi(3));
		
		verifyNoMoreInteractions(t, t2);
	}
	
	/**
	 * This test ensures, that the function {@link Tup3bigiC#set(BigInteger)} adopts the
	 * value for each component and returns the current instance.
	 */
	@Test
	void set_ValueTest()
	{
		Tup3bigiC t = mock(Tup3bigiC.class);
		
		when(t.set(bigi(1))).thenCallRealMethod();
		
		when(t.set(bigi(1), bigi(1), bigi(1))).thenReturn(t);
		
		assertSame(t, t.set(bigi(1)));
		
		verify(t).set(bigi(1));

		verify(t).set(bigi(1), bigi(1), bigi(1));
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup3bigiC#set(BigInteger, BigInteger, BigInteger)} adopts
	 * the values and returns the current instance.
	 */
	@Test
	void setTest()
	{
		Tup3bigiC t = mock(Tup3bigiC.class);
		
		when(t.set(bigi(1), bigi(2), bigi(3))).thenCallRealMethod();
		
		when(t.setX(bigi(1))).thenReturn(t);
		when(t.setY(bigi(2))).thenReturn(t);
		when(t.setZ(bigi(3))).thenReturn(t);
		
		assertSame(t, t.set(bigi(1), bigi(2), bigi(3)));
		
		verify(t).set(bigi(1), bigi(2), bigi(3));

		verify(t).setX(bigi(1));
		verify(t).setY(bigi(2));
		verify(t).setZ(bigi(3));
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup3bigiC#set(TupbigiR)} adopts the
	 * values from the input tuple and returns the current instance.
	 */
	@Test
	void set_TupleTest()
	{
		Tup3bigiC t = mock(Tup3bigiC.class);
		TupbigiR t2 = mock(TupbigiR.class);
		
		when(t.set(t2)).thenCallRealMethod();
		
		when(t2.toArray()).thenReturn(bigiArray(1, 2, 3));
		when(t.setArray(bigiArray(1, 2, 3))).thenReturn(t);

		assertSame(t, t.set(t2));
		
		verify(t).set(t2);
		
		verify(t2).toArray();
		verify(t).setArray(bigiArray(1, 2, 3));

		verifyNoMoreInteractions(t);
	}
	
		/**
	 * This test ensures, that the function {@link Tup3bigiC#setArray(BigInteger[])} adopts the
	 * values and returns the current instance.
	 */
	@Test
	void setArrayTest()
	{
		Tup3bigiC t = mock(Tup3bigiC.class);
		
		when(t.setArray(bigiArray(1, 2, 3))).thenCallRealMethod();
		
		when(t.set(bigi(1), bigi(2), bigi(3))).thenReturn(t);
		
		assertSame(t, t.setArray(bigiArray(1, 2, 3)));
		
		verify(t).setArray(bigiArray(1, 2, 3));
		
		verify(t).set(bigi(1), bigi(2), bigi(3));
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup3bigiC#setByIndex(int, BigInteger)} adopts the
	 * value to the x component if the index is 0 and returns the current instance.
	 */
	@Test
	void setByIndex_XTest()
	{
		Tup3bigiC t = mock(Tup3bigiC.class);
		
		when(t.setByIndex(0, bigi(1))).thenCallRealMethod();
		
		when(t.setX(bigi(1))).thenReturn(t);
		
		assertSame(t, t.setByIndex(0, bigi(1)));
		
		verify(t).setByIndex(0, bigi(1));
		
		verify(t).setX(bigi(1));
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup3bigiC#setByIndex(int, BigInteger)} adopts the
	 * value to the y component if the index is 1 and returns the current instance.
	 */
	@Test
	void setByIndex_YTest()
	{
		Tup3bigiC t = mock(Tup3bigiC.class);
		
		when(t.setByIndex(1, bigi(1))).thenCallRealMethod();
		
		when(t.setY(bigi(1))).thenReturn(t);
		
		assertSame(t, t.setByIndex(1, bigi(1)));
		
		verify(t).setByIndex(1, bigi(1));
		
		verify(t).setY(bigi(1));
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup3bigiC#setByIndex(int, BigInteger)} adopts the
	 * value to the z component if the index is 2 and returns the current instance.
	 */
	@Test
	void setByIndex_ZTest()
	{
		Tup3bigiC t = mock(Tup3bigiC.class);
		
		when(t.setByIndex(2, bigi(1))).thenCallRealMethod();
		
		when(t.setZ(bigi(1))).thenReturn(t);
		
		assertSame(t, t.setByIndex(2, bigi(1)));
		
		verify(t).setByIndex(2, bigi(1));
		
		verify(t).setZ(bigi(1));
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup3bigiC#setByIndex(int, BigInteger)} throws
	 * an {@link IndexOutOfBoundsException} for an index different than 0, 1 or 2.
	 */
	@Test
	void setByIndex_ExceptionTest()
	{
		Tup3bigiC t = mock(Tup3bigiC.class);
		
		when(t.setByIndex(3, bigi(1))).thenCallRealMethod();

		assertThrows(IndexOutOfBoundsException.class, new Executable() {
			public void execute() throws Throwable
			{
				t.setByIndex(3, bigi(1));
			}
		});

		verify(t).setByIndex(3, bigi(1));

		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup3bigiC#shallowClone()} calls
	 * by default the standard {@link Tup3bigiC#clone()}-function.
	 */
	@Test
	void shallowCloneTest()
	{
		Tup3bigiC t = mock(Tup3bigiC.class);
		Tup3bigiC res = mock(Tup3bigiC.class);
		
		when(t.shallowClone()).thenCallRealMethod();
		when(t.clone()).thenReturn(res);
		
		assertSame(res, t.shallowClone());
		
		verify(t).shallowClone();
		verify(t).clone();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup3bigiC#deepClone()} calls
	 * by default the standard {@link Tup3bigiC#clone()}-function.
	 */
	@Test
	void deepCloneTest()
	{
		Tup3bigiC t = mock(Tup3bigiC.class);
		Tup3bigiC res = mock(Tup3bigiC.class);

		when(t.deepClone()).thenCallRealMethod();
		when(t.clone()).thenReturn(res);
		
		assertSame(res, t.deepClone());
		
		verify(t).deepClone();
		verify(t).clone();
		
		verifyNoMoreInteractions(t);
	}
}
