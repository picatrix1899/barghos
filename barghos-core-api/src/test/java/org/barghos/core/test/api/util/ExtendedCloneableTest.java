package org.barghos.core.test.api.util;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;

import org.barghos.core.api.util.ExtendedCloneable;

/**
 * This class provides component tests for the interface {@link ExtendedCloneable}.
 * 
 * @author picatrix1899
 */
class ExtendedCloneableTest
{
	/**
	 * This test ensures, that the function {@link ExtendedCloneable#isCloneable()} returns
	 * always {@code true} and doesn't do any calls.
	 */
	@Test
	void isCloneableTest()
	{
		ExtendedCloneable ec = mock(ExtendedCloneable.class);
		
		when(ec.isCloneable()).thenCallRealMethod();
		
		assertEquals(true, ec.isCloneable());
		
		verify(ec).isCloneable();

		verifyNoMoreInteractions(ec);
	}
	
	/**
	 * This test ensures, that the function {@link ExtendedCloneable#isDeepCloneable()} returns
	 * always {@code true} and doesn't do any calls.
	 */
	@Test
	void isDeepCloneableTest()
	{
		ExtendedCloneable ec = mock(ExtendedCloneable.class);
		
		when(ec.isDeepCloneable()).thenCallRealMethod();
		
		assertEquals(true, ec.isDeepCloneable());
		
		verify(ec).isDeepCloneable();

		verifyNoMoreInteractions(ec);
	}
	
	/**
	 * This test ensures, that the function {@link ExtendedCloneable#shallowClone()} calls
	 * by default the standard {@link ExtendedCloneable#clone()}-function.
	 */
	@Test
	void shallowCloneTest()
	{
		ExtendedCloneable ec = mock(ExtendedCloneable.class);
		
		Object obj = new Object();
		
		when(ec.shallowClone()).thenCallRealMethod();
		when(ec.clone()).thenReturn(obj);
		
		assertSame(obj, ec.shallowClone());
		
		verify(ec).shallowClone();
		verify(ec).clone();
		
		verifyNoMoreInteractions(ec);
	}
	
	/**
	 * This test ensures, that the function {@link ExtendedCloneable#deepClone()} calls
	 * by default the standard {@link ExtendedCloneable#clone()}-function.
	 */
	@Test
	void deepCloneTest()
	{
		ExtendedCloneable ec = mock(ExtendedCloneable.class);
		
		Object obj = new Object();
		
		when(ec.deepClone()).thenCallRealMethod();
		when(ec.clone()).thenReturn(obj);
		
		assertSame(obj, ec.deepClone());
		
		verify(ec).deepClone();
		verify(ec).clone();
		
		verifyNoMoreInteractions(ec);
	}
}
