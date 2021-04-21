package org.barghos.core.test.api.tuple3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import org.barghos.core.api.tuple3.Tup3strR;

/**
 * This class provides component tests for the interface {@link Tup3strR}.
 * 
 * @author picatrix1899
 */
class Tup3strRTest
{
	/**
	 * This test ensures, that the function {@link Tup3strR#isValid()} returns
	 * the corrct values for different situations.
	 */
	@Test
	void isValidTest()
	{
		Tup3strR t = new TestTup(null, null, null);
		assertEquals(false, t.isValid());
		
		t = new TestTup("", null, null);
		assertEquals(false, t.isValid());
		
		t = new TestTup(null, "", null);
		assertEquals(false, t.isValid());
		
		t = new TestTup(null, null, "");
		assertEquals(false, t.isValid());
		
		t = new TestTup("", "", "");
		assertEquals(true, t.isValid());
	}
	
	/**
	 * This class is a test implementation of the interface {@link Tup3strR}.
	 * 
	 * @author picatrix1899
	 */
	private static class TestTup implements Tup3strR
	{
		private final String x;
		private final String y;
		private final String z;
		
		public TestTup(String x, String y, String z)
		{
			this.x = x;
			this.y = y;
			this.z = z;
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
		
		@Override
		public String getZ()
		{
			return this.z;
		}
	}
}
