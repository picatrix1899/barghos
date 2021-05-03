package org.barghos.core.test.api.tuple4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import org.barghos.core.api.testing.ValueRelay;
import org.barghos.core.api.tuple4.Tup4objR;

/**
 * This class provides component tests for the interface {@link Tup4objR}.
 * 
 * @author picatrix1899
 */
class Tup4objRTest
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
	 * This test ensures, that the function {@link Tup4objR#isValid()} returns
	 * the corrct values for different situations.
	 */
	@Test
	void isValidTest()
	{
		Tup4objR t = new TestTup(null, null, null, null);
		assertEquals(false, t.isValid());
		
		t = new TestTup(new Object(), null, null, null);
		assertEquals(false, t.isValid());
		
		t = new TestTup(null, new Object(), null, null);
		assertEquals(false, t.isValid());
		
		t = new TestTup(null, null, new Object(), null);
		assertEquals(false, t.isValid());
		
		t = new TestTup(null, null, null, new Object());
		assertEquals(false, t.isValid());
		
		t = new TestTup(new Object(), new Object(), new Object(), new Object());
		assertEquals(true, t.isValid());
	}
	
	/**
	 * This test ensures, that the default implementation of the function {@link Tup4objR#getNewInstance(Tup4objR)} calls
	 * the function {@link Tup4objR#getNewInstance(Object, Object, Object, Object)} with the correct components.
	 */
	@Test
	void getNewInstance_TupleTest()
	{
		Tup4objR t = new TestTup(1l, 1l, 1l, 1l);
		
		t.getNewInstance(new TestTup(2l, 3l, 4l, 5l));
		
		assertEquals(true, ValueRelay.get("getNewInstanceC", false));
		assertEquals(2l, ValueRelay.get("getNewInstanceC_X", 0l));
		assertEquals(3l, ValueRelay.get("getNewInstanceC_Y", 0l));
		assertEquals(4l, ValueRelay.get("getNewInstanceC_Z", 0l));
		assertEquals(5l, ValueRelay.get("getNewInstanceC_W", 0l));
		
		// Can't test for the result here, as the relaying and adopting of the values are implementation specific.
	}
	
	/**
	 * This test ensures, that the default implementation of the function {@link Tup4objR#getNewInstance(Object)} calls
	 * the function {@link Tup4objR#getNewInstance(Object, Object, Object, Object)} with the correct components.
	 */
	@Test
	void getNewInstance_ValueTest()
	{
		Tup4objR t = new TestTup(1l, 1l, 1l, 1l);
		
		t.getNewInstance(2l);
		
		assertEquals(true, ValueRelay.get("getNewInstanceC", false));
		assertEquals(2l, ValueRelay.get("getNewInstanceC_X", 0l));
		assertEquals(2l, ValueRelay.get("getNewInstanceC_Y", 0l));
		assertEquals(2l, ValueRelay.get("getNewInstanceC_Z", 0l));
		assertEquals(2l, ValueRelay.get("getNewInstanceC_W", 0l));
		
		// Can't test for the result here, as the relaying and adopting of the values are implementation specific.
	}
	
	/**
	 * This class is a test implementation of the interface {@link Tup4objR}.
	 * 
	 * @author picatrix1899
	 */
	private static class TestTup implements Tup4objR
	{
		private final Object x;
		private final Object y;
		private final Object z;
		private final Object w;
		
		public TestTup(Object x, Object y, Object z, Object w)
		{
			this.x = x;
			this.y = y;
			this.z = z;
			this.w = w;
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
		public Object getW()
		{
			return this.w;
		}
		
		@Override
		public TestTup getNewInstance(Object x, Object y, Object z, Object w)
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
