package org.barghos.core.test.api.tuple3;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;

import org.barghos.core.api.tuple3.Tup3oR;

/**
 * This class provides component tests for the interface {@link Tup3oR}.
 * 
 * @author picatrix1899
 */
class Tup3oRTest
{
	/**
	 * This test ensures, that the function {@link Tup3oR#isValid()} returns true,
	 * if none of the components is null.
	 */
	@Test
	void isValidTest()
	{
		@SuppressWarnings("unchecked")
		Tup3oR<Integer,Double,String> t = (Tup3oR<Integer,Double, String>)mock(Tup3oR.class);
		
		when(t.isValid()).thenCallRealMethod();
		
		when(t.getX()).thenReturn(1);
		when(t.getY()).thenReturn(1.0);
		when(t.getZ()).thenReturn("a");
		
		assertEquals(true, t.isValid());
		
		verify(t).isValid();
		
		verify(t).getX();
		verify(t).getY();
		verify(t).getZ();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup3oR#isValid()} returns false,
	 * if the x component is null.
	 */
	@Test
	void isValid_Fail_XTest()
	{
		@SuppressWarnings("unchecked")
		Tup3oR<Integer,Double,String> t = (Tup3oR<Integer,Double,String>)mock(Tup3oR.class);
		
		when(t.isValid()).thenCallRealMethod();
		
		when(t.getX()).thenReturn(null);

		assertEquals(false, t.isValid());
		
		verify(t).isValid();
		
		verify(t).getX();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup3oR#isValid()} returns false,
	 * if the y component is null.
	 */
	@Test
	void isValid_Fail_YTest()
	{
		@SuppressWarnings("unchecked")
		Tup3oR<Integer,Double,String> t = (Tup3oR<Integer,Double,String>)mock(Tup3oR.class);
		
		when(t.isValid()).thenCallRealMethod();
		
		when(t.getX()).thenReturn(1);
		when(t.getY()).thenReturn(null);

		assertEquals(false, t.isValid());
		
		verify(t).isValid();
		
		verify(t).getX();
		verify(t).getY();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup3oR#isValid()} returns false,
	 * if the z component is null.
	 */
	@Test
	void isValid_Fail_ZTest()
	{
		@SuppressWarnings("unchecked")
		Tup3oR<Integer,Double,String> t = (Tup3oR<Integer,Double,String>)mock(Tup3oR.class);
		
		when(t.isValid()).thenCallRealMethod();
		
		when(t.getX()).thenReturn(1);
		when(t.getY()).thenReturn(1.0);
		when(t.getZ()).thenReturn(null);

		assertEquals(false, t.isValid());
		
		verify(t).isValid();
		
		verify(t).getX();
		verify(t).getY();
		verify(t).getZ();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the default implementation of the function {@link Tup3oR#getNewInstance(Tup3oR)} calls
	 * the function {@link Tup3oR#getNewInstance(Object, Object, Object)} with the correct components.
	 */
	@Test
	void getNewInstance_Tuple2Test()
	{
		@SuppressWarnings("unchecked")
		Tup3oR<Integer,Double,String> original = (Tup3oR<Integer,Double,String>)mock(Tup3oR.class);
		
		@SuppressWarnings("unchecked")
		Tup3oR<Integer,Double,String> newInstance = (Tup3oR<Integer,Double,String>)mock(Tup3oR.class);
		
		@SuppressWarnings("unchecked")
		Tup3oR<Integer,Double,String> t = (Tup3oR<Integer,Double,String>)mock(Tup3oR.class);
		
		when(t.getNewInstance(original)).thenCallRealMethod();
		
		when(original.getX()).thenReturn(1);
		when(original.getY()).thenReturn(1.0);
		when(original.getZ()).thenReturn("a");
		when(t.getNewInstance(1, 1.0, "a")).thenReturn(newInstance);
		
		assertSame(newInstance, t.getNewInstance(original));
		
		verify(t).getNewInstance(original);
		
		verify(original).getX();
		verify(original).getY();
		verify(original).getZ();
		verify(t).getNewInstance(1, 1.0, "a");
		
		verifyNoMoreInteractions(t, original);
	}
}