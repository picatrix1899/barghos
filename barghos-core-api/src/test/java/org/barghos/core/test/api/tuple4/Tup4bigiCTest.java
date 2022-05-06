package org.barghos.core.test.api.tuple4;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import java.math.BigInteger;

import static org.barghos.core.api.testing.TestObjectFactory.*;

import org.barghos.core.api.tuple.TupbigiC;
import org.barghos.core.api.tuple.TupbigiR;
import org.barghos.core.api.tuple4.Tup4bigiC;
import org.barghos.core.api.tuple4.Tup4bigiR;

/**
 * This class provides comoponent tests for the interface {@link Tup4bigiC}.
 * 
 * @author picatrix1899
 */
class Tup4bigiCTest
{
	/**
	 * This test ensures, that the interface extends the interface {@link Tup4bigiR}.
	 */
	@Test
	void inheritance_Tup4bigiRTest()
	{
		assertTrue(Tup4bigiR.class.isAssignableFrom(Tup4bigiC.class));
	}
	
	/**
	 * This test ensures, that the interface extends the interface {@link TupbigiC}.
	 */
	@Test
	void inheritance_TupbigiCTest()
	{
		assertTrue(TupbigiC.class.isAssignableFrom(Tup4bigiC.class));
	}

	/**
	 * This test ensures, that the function {@link Tup4bigiC#set(Tup4bigiR)} adopts the
	 * values from the input tuple and returns the current instance.
	 */
	@Test
	void set_Tuple2Test()
	{
		Tup4bigiC t = mock(Tup4bigiC.class);
		Tup4bigiR t2 = mock(Tup4bigiR.class);
		
		when(t.set(t2)).thenCallRealMethod();
		
		when(t2.getX()).thenReturn(bigi(1));
		when(t2.getY()).thenReturn(bigi(2));
		when(t2.getZ()).thenReturn(bigi(3));
		when(t2.getW()).thenReturn(bigi(4));
		when(t.set(bigi(1), bigi(2), bigi(3), bigi(4))).thenReturn(t);
		
		assertSame(t, t.set(t2));
		
		verify(t).set(t2);
		
		verify(t2).getX();
		verify(t2).getY();
		verify(t2).getZ();
		verify(t2).getW();
		verify(t).set(bigi(1), bigi(2), bigi(3), bigi(4));
		
		verifyNoMoreInteractions(t, t2);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4bigiC#set(BigInteger)} adopts the
	 * value for each component and returns the current instance.
	 */
	@Test
	void set_ValueTest()
	{
		Tup4bigiC t = mock(Tup4bigiC.class);
		
		when(t.set(bigi(1))).thenCallRealMethod();
		
		when(t.set(bigi(1), bigi(1), bigi(1), bigi(1))).thenReturn(t);
		
		assertSame(t, t.set(bigi(1)));
		
		verify(t).set(bigi(1));

		verify(t).set(bigi(1), bigi(1), bigi(1), bigi(1));
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4bigiC#set(BigInteger, BigInteger, BigInteger, BigInteger)} adopts
	 * the values and returns the current instance.
	 */
	@Test
	void setTest()
	{
		Tup4bigiC t = mock(Tup4bigiC.class);
		
		when(t.set(bigi(1), bigi(2), bigi(3), bigi(4))).thenCallRealMethod();
		
		when(t.setX(bigi(1))).thenReturn(t);
		when(t.setY(bigi(2))).thenReturn(t);
		when(t.setZ(bigi(3))).thenReturn(t);
		when(t.setW(bigi(4))).thenReturn(t);
		
		assertSame(t, t.set(bigi(1), bigi(2), bigi(3), bigi(4)));
		
		verify(t).set(bigi(1), bigi(2), bigi(3), bigi(4));

		verify(t).setX(bigi(1));
		verify(t).setY(bigi(2));
		verify(t).setZ(bigi(3));
		verify(t).setW(bigi(4));
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4bigiC#set(TupbigiR)} adopts the
	 * values from the input tuple and returns the current instance.
	 */
	@Test
	void set_TupleTest()
	{
		Tup4bigiC t = mock(Tup4bigiC.class);
		TupbigiR t2 = mock(TupbigiR.class);
		
		when(t.set(t2)).thenCallRealMethod();
		
		when(t2.toArray()).thenReturn(bigiArray(1, 2, 3, 4));
		when(t.setArray(bigiArray(1, 2, 3, 4))).thenReturn(t);

		assertSame(t, t.set(t2));
		
		verify(t).set(t2);
		
		verify(t2).toArray();
		verify(t).setArray(bigiArray(1, 2, 3, 4));

		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4bigiC#setArray(BigInteger[])} adopts the
	 * values and returns the current instance.
	 */
	@Test
	void setArrayTest()
	{
		Tup4bigiC t = mock(Tup4bigiC.class);
		
		when(t.setArray(bigiArray(1, 2, 3, 4))).thenCallRealMethod();
		
		when(t.set(bigi(1), bigi(2), bigi(3), bigi(4))).thenReturn(t);
		
		assertSame(t, t.setArray(bigiArray(1, 2, 3, 4)));
		
		verify(t).setArray(bigiArray(1, 2, 3, 4));
		
		verify(t).set(bigi(1), bigi(2), bigi(3), bigi(4));
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4bigiC#setByIndex(int, BigInteger)} adopts the
	 * value to the x component if the index is 0 and returns the current instance.
	 */
	@Test
	void setByIndex_XTest()
	{
		Tup4bigiC t = mock(Tup4bigiC.class);
		
		when(t.setByIndex(0, bigi(1))).thenCallRealMethod();
		
		when(t.setX(bigi(1))).thenReturn(t);
		
		assertSame(t, t.setByIndex(0, bigi(1)));
		
		verify(t).setByIndex(0, bigi(1));
		
		verify(t).setX(bigi(1));
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4bigiC#setByIndex(int, BigInteger)} adopts the
	 * value to the y component if the index is 1 and returns the current instance.
	 */
	@Test
	void setByIndex_YTest()
	{
		Tup4bigiC t = mock(Tup4bigiC.class);
		
		when(t.setByIndex(1, bigi(1))).thenCallRealMethod();
		
		when(t.setY(bigi(1))).thenReturn(t);
		
		assertSame(t, t.setByIndex(1, bigi(1)));
		
		verify(t).setByIndex(1, bigi(1));
		
		verify(t).setY(bigi(1));
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4bigiC#setByIndex(int, BigInteger)} adopts the
	 * value to the z component if the index is 2 and returns the current instance.
	 */
	@Test
	void setByIndex_ZTest()
	{
		Tup4bigiC t = mock(Tup4bigiC.class);
		
		when(t.setByIndex(2, bigi(1))).thenCallRealMethod();
		
		when(t.setZ(bigi(1))).thenReturn(t);
		
		assertSame(t, t.setByIndex(2, bigi(1)));
		
		verify(t).setByIndex(2, bigi(1));
		
		verify(t).setZ(bigi(1));
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4bigiC#setByIndex(int, BigInteger)} adopts the
	 * value to the w component if the index is 3 and returns the current instance.
	 */
	@Test
	void setByIndex_WTest()
	{
		Tup4bigiC t = mock(Tup4bigiC.class);
		
		when(t.setByIndex(3, bigi(1))).thenCallRealMethod();
		
		when(t.setW(bigi(1))).thenReturn(t);
		
		assertSame(t, t.setByIndex(3, bigi(1)));
		
		verify(t).setByIndex(3, bigi(1));
		
		verify(t).setW(bigi(1));
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4bigiC#setByIndex(int, BigInteger)} throws
	 * an {@link IndexOutOfBoundsException} for an index different than 0, 1, 2 or 3.
	 */
	@Test
	void setByIndex_ExceptionTest()
	{
		Tup4bigiC t = mock(Tup4bigiC.class);
		
		when(t.setByIndex(4, bigi(1))).thenCallRealMethod();

		assertThrows(IndexOutOfBoundsException.class, new Executable() {
			public void execute() throws Throwable
			{
				t.setByIndex(4, bigi(1));
			}
		});

		verify(t).setByIndex(4, bigi(1));

		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4bigiC#shallowClone()} calls
	 * by default the standard {@link Tup4bigiC#clone()}-function.
	 */
	@Test
	void shallowCloneTest()
	{
		Tup4bigiC t = mock(Tup4bigiC.class);
		Tup4bigiC res = mock(Tup4bigiC.class);
		
		when(t.shallowClone()).thenCallRealMethod();
		when(t.clone()).thenReturn(res);
		
		assertSame(res, t.shallowClone());
		
		verify(t).shallowClone();
		verify(t).clone();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4bigiC#deepClone()} calls
	 * by default the standard {@link Tup4bigiC#clone()}-function.
	 */
	@Test
	void deepCloneTest()
	{
		Tup4bigiC t = mock(Tup4bigiC.class);
		Tup4bigiC res = mock(Tup4bigiC.class);

		when(t.deepClone()).thenCallRealMethod();
		when(t.clone()).thenReturn(res);
		
		assertSame(res, t.deepClone());
		
		verify(t).deepClone();
		verify(t).clone();
		
		verifyNoMoreInteractions(t);
	}
}
