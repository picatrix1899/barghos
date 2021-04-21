package org.barghos.core.test.api.tuple4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import org.barghos.core.api.tuple4.Tup4strR;

/**
 * This class provides component tests for the interface {@link Tup4strR}.
 * 
 * @author picatrix1899
 */
class Tup4strRTest
{
	/**
	 * This test ensures, that the function {@link Tup4strR#isValid()} returns
	 * the corrct values for different situations.
	 */
	@Test
	void isValidTest()
	{
		Tup4strR t = new TestTup(null, null, null, null);
		assertEquals(false, t.isValid());
		
		t = new TestTup("", null, null, null);
		assertEquals(false, t.isValid());
		
		t = new TestTup(null, "", null, null);
		assertEquals(false, t.isValid());
		
		t = new TestTup(null, null, "", null);
		assertEquals(false, t.isValid());
		
		t = new TestTup(null, null, null, "");
		assertEquals(false, t.isValid());
		
		t = new TestTup("", "", "", "");
		assertEquals(true, t.isValid());
	}
	
	/**
	 * This class is a test implementation of the interface {@link Tup4strR}.
	 * 
	 * @author picatrix1899
	 */
	private static class TestTup implements Tup4strR
	{
		private final String x;
		private final String y;
		private final String z;
		private final String w;
		
		public TestTup(String x, String y, String z, String w)
		{
			this.x = x;
			this.y = y;
			this.z = z;
			this.w = w;
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
		
		@Override
		public String getW()
		{
			return this.w;
		}
	}
}
