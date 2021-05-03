package org.barghos.core.test.api.tuple3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import org.barghos.core.api.testing.ValueRelay;
import org.barghos.core.api.tuple3.Tup3objR;

/**
 * This class provides component tests for the interface {@link Tup3objR}.
 * 
 * @author picatrix1899
 */
class Tup3objRTest
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
	 * This test ensures, that the default implementation of the function {@link Tup3objR#getNewInstance(Tup3objR)} calls
	 * the function {@link Tup3objR#getNewInstance(Object, Object, Object)} with the correct components.
	 */
	@Test
	void getNewInstance_TupleTest()
	{
		Tup3objR t = new TestTup(1l, 1l, 1l);
		
		t.getNewInstance(new TestTup(2l, 3l, 4l));
		
		assertEquals(true, ValueRelay.get("getNewInstanceC", false));
		assertEquals(2l, ValueRelay.get("getNewInstanceC_X", 0l));
		assertEquals(3l, ValueRelay.get("getNewInstanceC_Y", 0l));
		assertEquals(4l, ValueRelay.get("getNewInstanceC_Z", 0l));
		
		// Can't test for the result here, as the relaying and adopting of the values are implementation specific.
	}
	
	/**
	 * This test ensures, that the default implementation of the function {@link Tup3objR#getNewInstance(Object)} calls
	 * the function {@link Tup3objR#getNewInstance(Object, Object, Object)} with the correct components.
	 */
	@Test
	void getNewInstance_ValueTest()
	{
		Tup3objR t = new TestTup(1l, 1l, 1l);
		
		t.getNewInstance(2l);
		
		assertEquals(true, ValueRelay.get("getNewInstanceC", false));
		assertEquals(2l, ValueRelay.get("getNewInstanceC_X", 0l));
		assertEquals(2l, ValueRelay.get("getNewInstanceC_Y", 0l));
		assertEquals(2l, ValueRelay.get("getNewInstanceC_Z", 0l));
		
		// Can't test for the result here, as the relaying and adopting of the values are implementation specific.
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
		
		@Override
		public TestTup getNewInstance(Object x, Object y, Object z)
		{
			ValueRelay.relayCall("getNewInstanceC");
			ValueRelay.relay("getNewInstanceC_X", x);
			ValueRelay.relay("getNewInstanceC_Y", y);
			ValueRelay.relay("getNewInstanceC_Z", z);
			return new TestTup(x, y, z);
		}
	}
}
