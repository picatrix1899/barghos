package org.barghos.core.test.api.tuple4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import org.barghos.core.api.testing.ValueRelay;
import org.barghos.core.api.tuple4.Tup4strR;

/**
 * This class provides component tests for the interface {@link Tup4strR}.
 * 
 * @author picatrix1899
 */
class Tup4strRTest
{
	/**
	 * This method is called after each test in this class.
	 */
	@AfterEach
	void cleanup()
	{
		ValueRelay.clear();
	}
	
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
	 * This test ensures, that the default implementation of the function {@link Tup4strR#getNewInstance(Tup4strR)} calls
	 * the function {@link Tup4strR#getNewInstance(String, String, String, String)} with the correct components.
	 */
	@Test
	void getNewInstance_TupleTest()
	{
		Tup4strR t = new TestTup("a", "a", "a", "a");
		
		t.getNewInstance(new TestTup("b", "c", "d", "e"));
		
		assertEquals(true, ValueRelay.get("getNewInstanceC", false));
		assertEquals("b", ValueRelay.get("getNewInstanceC_X", ""));
		assertEquals("c", ValueRelay.get("getNewInstanceC_Y", ""));
		assertEquals("d", ValueRelay.get("getNewInstanceC_Z", ""));
		assertEquals("e", ValueRelay.get("getNewInstanceC_W", ""));
		
		// Can't test for the result here, as the relaying and adopting of the values are implementation specific.
	}
	
	/**
	 * This test ensures, that the default implementation of the function {@link Tup4strR#getNewInstance(String)} calls
	 * the function {@link Tup4strR#getNewInstance(String, String, String, String)} with the correct components.
	 */
	@Test
	void getNewInstance_ValueTest()
	{
		Tup4strR t = new TestTup("a", "a", "a", "a");
		
		t.getNewInstance("b");
		
		assertEquals(true, ValueRelay.get("getNewInstanceC", false));
		assertEquals("b", ValueRelay.get("getNewInstanceC_X", ""));
		assertEquals("b", ValueRelay.get("getNewInstanceC_Y", ""));
		assertEquals("b", ValueRelay.get("getNewInstanceC_Z", ""));
		assertEquals("b", ValueRelay.get("getNewInstanceC_W", ""));
		
		// Can't test for the result here, as the relaying and adopting of the values are implementation specific.
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
		
		@Override
		public TestTup getNewInstance(String x, String y, String z, String w)
		{
			ValueRelay.relayCall("getNewInstanceC");
			ValueRelay.relay("getNewInstanceC_X", x);
			ValueRelay.relay("getNewInstanceC_Y", y);
			ValueRelay.relay("getNewInstanceC_Z", z);
			ValueRelay.relay("getNewInstanceC_W", w);
			return new TestTup(x, y, z, w);
		}
	}
}
