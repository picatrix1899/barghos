package org.barghos.core.test.api.tuple4;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;

import org.barghos.core.api.tuple4.Tup4oR;

/**
 * This class provides component tests for the interface {@link Tup4oR}.
 * 
 * @author picatrix1899
 */
class Tup4oRTest
{
	/**
	 * This test ensures, that the function {@link Tup4oR#isValid()} returns true,
	 * if none of the components is null.
	 */
	@Test
	void isValidTest()
	{
		@SuppressWarnings("unchecked")
		Tup4oR<Integer,Double,String,Character> t = (Tup4oR<Integer,Double, String,Character>)mock(Tup4oR.class);
		
		when(t.isValid()).thenCallRealMethod();
		
		when(t.getX()).thenReturn(1);
		when(t.getY()).thenReturn(1.0);
		when(t.getZ()).thenReturn("a");
		when(t.getW()).thenReturn('a');
		
		assertEquals(true, t.isValid());
		
		verify(t).isValid();
		
		verify(t).getX();
		verify(t).getY();
		verify(t).getZ();
		verify(t).getW();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4oR#isValid()} returns false,
	 * if the x component is null.
	 */
	@Test
	void isValid_Fail_XTest()
	{
		@SuppressWarnings("unchecked")
		Tup4oR<Integer,Double,String,Character> t = (Tup4oR<Integer,Double,String,Character>)mock(Tup4oR.class);
		
		when(t.isValid()).thenCallRealMethod();
		
		when(t.getX()).thenReturn(null);

		assertEquals(false, t.isValid());
		
		verify(t).isValid();
		
		verify(t).getX();
		
		verifyNoMoreInteractions(t);
	}
	
	/**
	 * This test ensures, that the function {@link Tup4oR#isValid()} returns false,
	 * if the y component is null.
	 */
	@Test
	void isValid_Fail_YTest()
	{
		@SuppressWarnings("unchecked")
		Tup4oR<Integer,Double,String,Character> t = (Tup4oR<Integer,Double,String,Character>)mock(Tup4oR.class);
		
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
	 * This test ensures, that the function {@link Tup4oR#isValid()} returns false,
	 * if the z component is null.
	 */
	@Test
	void isValid_Fail_ZTest()
	{
		@SuppressWarnings("unchecked")
		Tup4oR<Integer,Double,String,Character> t = (Tup4oR<Integer,Double,String,Character>)mock(Tup4oR.class);
		
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
	 * This test ensures, that the function {@link Tup4oR#isValid()} returns false,
	 * if the w component is null.
	 */
	@Test
	void isValid_Fail_WTest()
	{
		@SuppressWarnings("unchecked")
		Tup4oR<Integer,Double,String,Character> t = (Tup4oR<Integer,Double,String,Character>)mock(Tup4oR.class);
		
		when(t.isValid()).thenCallRealMethod();
		
		when(t.getX()).thenReturn(1);
		when(t.getY()).thenReturn(1.0);
		when(t.getZ()).thenReturn("a");
		when(t.getW()).thenReturn(null);
		
		assertEquals(false, t.isValid());
		
		verify(t).isValid();
		
		verify(t).getX();
		verify(t).getY();
		verify(t).getZ();
		verify(t).getW();
		
		verifyNoMoreInteractions(t);
	}
}