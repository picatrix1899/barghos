package org.barghos.core.test.api.tuple2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import org.barghos.core.api.tuple2.Tup2objR;

/**
 * This class provides component tests for the interface {@link Tup2objR}.
 * 
 * @author picatrix1899
 */
class Tup2objRTest
{
	/**
	 * This test ensures, that the function {@link Tup2objR#isValid()} returns
	 * the corrct values for different situations.
	 */
	@Test
	void isValidTest()
	{
		Tup2objR t = new TestTup(null, null);
		assertEquals(false, t.isValid());
		
		t = new TestTup(null, new Object());
		assertEquals(false, t.isValid());
		
		t = new TestTup(new Object(), null);
		assertEquals(false, t.isValid());
		
		t = new TestTup(new Object(), new Object());
		assertEquals(true, t.isValid());
	}
	
	/**
	 * This class is a test implementation of the interface {@link Tup2objR}.
	 * 
	 * @author picatrix1899
	 */
	private static class TestTup implements Tup2objR
	{
		private final Object x;
		private final Object y;
		
		public TestTup(Object x, Object y)
		{
			this.x = x;
			this.y = y;
		}
		
		@Override
		public Object getX()
		{
			return this.x;
		}
		
		@Override
		public Object getY()
		{
			return this.y;
		}
	}
}
