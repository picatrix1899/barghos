package org.barghos.core.test.api.tuple3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import org.barghos.core.api.testing.ValueRelay;
import org.barghos.core.api.tuple3.Tup3strR;

/**
 * This class provides component tests for the interface {@link Tup3strR}.
 * 
 * @author picatrix1899
 */
class Tup3strRTest
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
	 * This test ensures, that the default implementation of the function {@link Tup3strR#getNewInstance(Tup3strR)} calls
	 * the function {@link Tup3sRtr#getNewInstance(String, String, String)} with the correct components.
	 */
	@Test
	void getNewInstance_TupleTest()
	{
		Tup3strR t = new TestTup("a", "a", "a");
		
		t.getNewInstance(new TestTup("b", "c", "d"));
		
		assertEquals(true, ValueRelay.get("getNewInstanceC", false));
		assertEquals("b", ValueRelay.get("getNewInstanceC_X", ""));
		assertEquals("c", ValueRelay.get("getNewInstanceC_Y", ""));
		assertEquals("d", ValueRelay.get("getNewInstanceC_Z", ""));
		
		// Can't test for the result here, as the relaying and adopting of the values are implementation specific.
	}
	
	/**
	 * This test ensures, that the default implementation of the function {@link Tup3strR#getNewInstance(String)} calls
	 * the function {@link Tup3strR#getNewInstance(String, String, String)} with the correct components.
	 */
	@Test
	void getNewInstance_ValueTest()
	{
		Tup3strR t = new TestTup("a", "a", "a");
		
		t.getNewInstance("b");
		
		assertEquals(true, ValueRelay.get("getNewInstanceC", false));
		assertEquals("b", ValueRelay.get("getNewInstanceC_X", ""));
		assertEquals("b", ValueRelay.get("getNewInstanceC_Y", ""));
		assertEquals("b", ValueRelay.get("getNewInstanceC_Z", ""));
		
		// Can't test for the result here, as the relaying and adopting of the values are implementation specific.
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
		
		@Override
		public TestTup getNewInstance(String x, String y, String z)
		{
			ValueRelay.relayCall("getNewInstanceC");
			ValueRelay.relay("getNewInstanceC_X", x);
			ValueRelay.relay("getNewInstanceC_Y", y);
			ValueRelay.relay("getNewInstanceC_Z", z);
			return new TestTup(x, y, z);
		}
	}
}
