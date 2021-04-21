package org.barghos.core.test.api.tuple3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import org.barghos.core.api.tuple3.Tup3objR;

/**
 * This class provides component tests for the interface {@link Tup3objR}.
 * 
 * @author picatrix1899
 */
class Tup3objRTest
{
	/**
	 * This test ensures, that the function {@link Tup3objR#isValid()} returns
	 * the corrct values for different situations.
	 */
	@Test
	void isValidTest()
	{
		Tup3objR t = new TestTup(null, null, null);
		assertEquals(false, t.isValid());
		
		t = new TestTup(new Object(), null, null);
		assertEquals(false, t.isValid());
		
		t = new TestTup(null, new Object(), null);
		assertEquals(false, t.isValid());
		
		t = new TestTup(null, null, new Object());
		assertEquals(false, t.isValid());
		
		t = new TestTup(new Object(), new Object(), new Object());
		assertEquals(true, t.isValid());
	}
	
	/**
	 * This class is a test implementation of the interface {@link Tup3objR}.
	 * 
	 * @author picatrix1899
	 */
	private static class TestTup implements Tup3objR
	{
		private final Object x;
		private final Object y;
		private final Object z;
		
		public TestTup(Object x, Object y, Object z)
		{
			this.x = x;
			this.y = y;
			this.z = z;
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
		
		@Override
		public Object getZ()
		{
			return this.z;
		}
	}
}
