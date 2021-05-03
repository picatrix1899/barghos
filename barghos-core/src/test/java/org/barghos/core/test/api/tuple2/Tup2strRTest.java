package org.barghos.core.test.api.tuple2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import org.barghos.core.api.testing.ValueRelay;
import org.barghos.core.api.tuple2.Tup2strR;

/**
 * This class provides component tests for the interface {@link Tup2strR}.
 * 
 * @author picatrix1899
 */
class Tup2strRTest
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
	 * This test ensures, that the default implementation of the function {@link Tup2strR#getNewInstance(Tup2strR)} calls
	 * the function {@link Tup2strR#getNewInstance(String, String)} with the correct components.
	 */
	@Test
	void getNewInstance_TupleTest()
	{
		Tup2strR t = new TestTup("a", "a");
		
		t.getNewInstance(new TestTup("b", "c"));
		
		assertEquals(true, ValueRelay.get("getNewInstanceC", false));
		assertEquals("b", ValueRelay.get("getNewInstanceC_X", ""));
		assertEquals("c", ValueRelay.get("getNewInstanceC_Y", ""));
		
		// Can't test for the result here, as the relaying and adopting of the values are implementation specific.
	}
	
	/**
	 * This test ensures, that the default implementation of the function {@link Tup2strR#getNewInstance(String)} calls
	 * the function {@link Tup2strR#getNewInstance(String, String)} with the correct components.
	 */
	@Test
	void getNewInstance_ValueTest()
	{
		Tup2strR t = new TestTup("a", "a");
		
		t.getNewInstance("b");
		
		assertEquals(true, ValueRelay.get("getNewInstanceC", false));
		assertEquals("b", ValueRelay.get("getNewInstanceC_X", ""));
		assertEquals("b", ValueRelay.get("getNewInstanceC_Y", ""));
		
		// Can't test for the result here, as the relaying and adopting of the values are implementation specific.
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
		
		@Override
		public TestTup getNewInstance(String x, String y)
		{
			ValueRelay.relayCall("getNewInstanceC");
			ValueRelay.relay("getNewInstanceC_X", x);
			ValueRelay.relay("getNewInstanceC_Y", y);
			return new TestTup(x, y);
		}
	}
}
