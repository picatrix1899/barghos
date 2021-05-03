package org.barghos.core.test.api.tuple4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import org.barghos.core.api.testing.ValueRelay;
import org.barghos.core.api.tuple4.Tup4boR;

/**
 * This claa provides component tests for the interface {@link Tup4boR}.
 * 
 * @author picatrix1899
 */
class Tup4boRTest
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
	 * This test ensures, that the function {@link Tup4boR#isValid()} returns
	 * the corrct values for different situations.
	 */
	@Test
	void isValidTest()
	{
		Tup4boR t = new TestTup(false, false, false, false);
		
		assertEquals(true, t.isValid());
		assertEquals(false, ValueRelay.get("getX", false));
		assertEquals(false, ValueRelay.get("getY", false));
		assertEquals(false, ValueRelay.get("getZ", false));
		assertEquals(false, ValueRelay.get("getW", false));
	}
	
	/**
	 * This test ensures, that the default implementation of the function {@link Tup4boR#getNewInstance(Tup4boR)} calls
	 * the function {@link Tup4boR#getNewInstance(boolean, boolean, boolean, boolean)} with the correct components.
	 */
	@Test
	void getNewInstance_TupleTest()
	{
		Tup4boR t = new TestTup(false, false, false, false);
		
		t.getNewInstance(new TestTup(true, true, true, true));
		
		assertEquals(true, ValueRelay.get("getNewInstanceC", false));
		assertEquals(true, ValueRelay.get("getNewInstanceC_X", false));
		assertEquals(true, ValueRelay.get("getNewInstanceC_Y", false));
		assertEquals(true, ValueRelay.get("getNewInstanceC_Z", false));
		assertEquals(true, ValueRelay.get("getNewInstanceC_W", false));
		
		// Can't test for the result here, as the relaying and adopting of the values are implementation specific.
	}
	
	/**
	 * This test ensures, that the default implementation of the function {@link Tup4boR#getNewInstance(boolean)} calls
	 * the function {@link Tup4boR#getNewInstance(boolean, boolean, boolean, boolean)} with the correct components.
	 */
	@Test
	void getNewInstance_ValueTest()
	{
		Tup4boR t = new TestTup(false, false, false, false);
		
		t.getNewInstance(true);
		
		assertEquals(true, ValueRelay.get("getNewInstanceC", false));
		assertEquals(true, ValueRelay.get("getNewInstanceC_X", false));
		assertEquals(true, ValueRelay.get("getNewInstanceC_Y", false));
		assertEquals(true, ValueRelay.get("getNewInstanceC_Z", false));
		assertEquals(true, ValueRelay.get("getNewInstanceC_W", false));
		
		// Can't test for the result here, as the relaying and adopting of the values are implementation specific.
	}
	
	/**
	 * This class is a test implementation of the interface {@link Tup4boR}.
	 * 
	 * @author picatrix1899
	 */
	private static class TestTup implements Tup4boR
	{
		private final boolean x;
		private final boolean y;
		private final boolean z;
		private final boolean w;
		
		public TestTup(boolean x, boolean y, boolean z, boolean w)
		{
			this.x = x;
			this.y = y;
			this.z = z;
			this.w = w;
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
		public boolean getW()
		{
			ValueRelay.relayCall("getW");
			return this.w;
		}
		
		@Override
		public TestTup getNewInstance(boolean x, boolean y, boolean z, boolean w)
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