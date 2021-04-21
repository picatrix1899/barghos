package org.barghos.core.test.api.tuple2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import org.barghos.core.api.tuple2.Tup2strR;

/**
 * This class provides component tests for the interface {@link Tup2strR}.
 * 
 * @author picatrix1899
 */
class Tup2strRTest
{
	/**
	 * This test ensures, that the function {@link Tup2strR#isValid()} returns
	 * the corrct values for different situations.
	 */
	@Test
	void isValidTest()
	{
		Tup2strR t = new TestTup(null, null);
		assertEquals(false, t.isValid());
		
		t = new TestTup("", null);
		assertEquals(false, t.isValid());
		
		t = new TestTup(null, "");
		assertEquals(false, t.isValid());
		
		t = new TestTup("", "");
		assertEquals(true, t.isValid());
	}
	
	/**
	 * This class is a test implementation of the interface {@link Tup2strR}.
	 * 
	 * @author picatrix1899
	 */
	private static class TestTup implements Tup2strR
	{
		private final String x;
		private final String y;
		
		public TestTup(String x, String y)
		{
			this.x = x;
			this.y = y;
		}
		
		@Override
		public String getX()
		{
			return this.x;
		}
		
		@Override
		public String getY()
		{
			return this.y;
		}
	}
}
