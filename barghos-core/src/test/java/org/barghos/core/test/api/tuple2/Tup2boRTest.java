package org.barghos.core.test.api.tuple2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import org.barghos.core.api.testing.ValueRelay;
import org.barghos.core.api.tuple2.Tup2boR;

/**
 * This claa provides component tests for the interface {@link Tup2boR}.
 * 
 * @author picatrix1899
 */
class Tup2boRTest
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
	 * This test ensures, that the function {@link Tup2boR#isValid()} returns
	 * the corrct values for different situations.
	 */
	@Test
	void isValidTest()
	{
		Tup2boR t = new TestTup(false, false);
		
		assertEquals(true, t.isValid());
		assertEquals(false, ValueRelay.get("getX", false));
		assertEquals(false, ValueRelay.get("getY", false));
	}
	
	/**
	 * This test ensures, that the default implementation of the function {@link Tup2boR#getNewInstance(Tup2boR)} calls
	 * the function {@link Tup2boR#getNewInstance(boolean, boolean)} with the correct components.
	 */
	@Test
	void getNewInstance_TupleTest()
	{
		Tup2boR t = new TestTup(false, false);
		
		t.getNewInstance(new TestTup(true, true));
		
		assertEquals(true, ValueRelay.get("getNewInstanceC", false));
		assertEquals(true, ValueRelay.get("getNewInstanceC_X", false));
		assertEquals(true, ValueRelay.get("getNewInstanceC_Y", false));
		
		// Can't test for the result here, as the relaying and adopting of the values are implementation specific.
	}
	
	/**
	 * This test ensures, that the default implementation of the function {@link Tup2boR#getNewInstance(boolean)} calls
	 * the function {@link Tup2boR#getNewInstance(boolean, boolean)} with the correct components.
	 */
	@Test
	void getNewInstance_ValueTest()
	{
		Tup2boR t = new TestTup(false, false);
		
		t.getNewInstance(true);
		
		assertEquals(true, ValueRelay.get("getNewInstanceC", false));
		assertEquals(true, ValueRelay.get("getNewInstanceC_X", false));
		assertEquals(true, ValueRelay.get("getNewInstanceC_Y", false));
		
		// Can't test for the result here, as the relaying and adopting of the values are implementation specific.
	}
	
	/**
	 * This class is a test implementation of the interface {@link Tup2boR}.
	 * 
	 * @author picatrix1899
	 */
	private static class TestTup implements Tup2boR
	{
		private final boolean x;
		private final boolean y;
		
		public TestTup(boolean x, boolean y)
		{
			this.x = x;
			this.y = y;
		}
		
		@Override
		public boolean getX()
		{
			ValueRelay.relayCall("getX");
			return this.x;
		}
		
		@Override
		public boolean getY()
		{
			ValueRelay.relayCall("getY");
			return this.y;
		}
		
		@Override
		public TestTup getNewInstance(boolean x, boolean y)
		{
			ValueRelay.relayCall("getNewInstanceC");
			ValueRelay.relay("getNewInstanceC_X", x);
			ValueRelay.relay("getNewInstanceC_Y", y);
			return new TestTup(x, y);
		}
	}
}