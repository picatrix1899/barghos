package org.barghos.core.test.api.tuple3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import org.barghos.core.api.testing.ValueRelay;
import org.barghos.core.api.tuple3.Tup3boR;

/**
 * This claa provides component tests for the interface {@link Tup3boR}.
 * 
 * @author picatrix1899
 */
class Tup3boRTest
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
	 * This test ensures, that the function {@link Tup3boR#isValid()} returns
	 * the corrct values for different situations.
	 */
	@Test
	void isValidTest()
	{
		Tup3boR t = new TestTup(false, false, false);
		
		assertEquals(true, t.isValid());
		assertEquals(false, ValueRelay.get("getX", false));
		assertEquals(false, ValueRelay.get("getY", false));
		assertEquals(false, ValueRelay.get("getZ", false));
	}
	
	/**
	 * This test ensures, that the default implementation of the function {@link Tup3boR#getNewInstance(Tup3boR)} calls
	 * the function {@link Tup3boR#getNewInstance(boolean, boolean, boolean)} with the correct components.
	 */
	@Test
	void getNewInstance_TupleTest()
	{
		Tup3boR t = new TestTup(false, false, false);
		
		t.getNewInstance(new TestTup(true, true, true));
		
		assertEquals(true, ValueRelay.get("getNewInstanceC", false));
		assertEquals(true, ValueRelay.get("getNewInstanceC_X", false));
		assertEquals(true, ValueRelay.get("getNewInstanceC_Y", false));
		assertEquals(true, ValueRelay.get("getNewInstanceC_Z", false));
		
		// Can't test for the result here, as the relaying and adopting of the values are implementation specific.
	}
	
	/**
	 * This test ensures, that the default implementation of the function {@link Tup3boR#getNewInstance(boolean)} calls
	 * the function {@link Tup3boR#getNewInstance(boolean, boolean, boolean)} with the correct components.
	 */
	@Test
	void getNewInstance_ValueTest()
	{
		Tup3boR t = new TestTup(false, false, false);
		
		t.getNewInstance(true);
		
		assertEquals(true, ValueRelay.get("getNewInstanceC", false));
		assertEquals(true, ValueRelay.get("getNewInstanceC_X", false));
		assertEquals(true, ValueRelay.get("getNewInstanceC_Y", false));
		assertEquals(true, ValueRelay.get("getNewInstanceC_Z", false));
		
		// Can't test for the result here, as the relaying and adopting of the values are implementation specific.
	}
	
	/**
	 * This class is a test implementation of the interface {@link Tup3boR}.
	 * 
	 * @author picatrix1899
	 */
	private static class TestTup implements Tup3boR
	{
		private final boolean x;
		private final boolean y;
		private final boolean z;
		
		public TestTup(boolean x, boolean y, boolean z)
		{
			this.x = x;
			this.y = y;
			this.z = z;
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
		public boolean getZ()
		{
			ValueRelay.relayCall("getZ");
			return this.z;
		}
		
		@Override
		public TestTup getNewInstance(boolean x, boolean y, boolean z)
		{
			ValueRelay.relayCall("getNewInstanceC");
			ValueRelay.relay("getNewInstanceC_X", x);
			ValueRelay.relay("getNewInstanceC_Y", y);
			ValueRelay.relay("getNewInstanceC_Z", z);
			return new TestTup(x, y, z);
		}
	}
}