package org.barghos.core.test.api.tuple4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import org.barghos.core.api.testing.ValueRelay;
import org.barghos.core.api.tuple4.Tup4oR;

/**
 * This class provides component tests for the interface {@link Tup4oR}.
 * 
 * @author picatrix1899
 */
class Tup4oRTest
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
	 * This test ensures, that the function {@link Tup4oR#isValid()} returns
	 * the corrct values for different situations.
	 */
	@Test
	void isValidTest()
	{
		Tup4oR<Object, Object, Object, Object> t = new TestTup<>(null, null, null, null);
		assertEquals(false, t.isValid());
		
		t = new TestTup<>(new Object(), null, null, null);
		assertEquals(false, t.isValid());
		
		t = new TestTup<>(null, new Object(), null, null);
		assertEquals(false, t.isValid());
		
		t = new TestTup<>(null, null, new Object(), null);
		assertEquals(false, t.isValid());
		
		t = new TestTup<>(null, null, null, new Object());
		assertEquals(false, t.isValid());
		
		t = new TestTup<>(new Object(), new Object(), new Object(), new Object());
		assertEquals(true, t.isValid());
	}
	
	/**
	 * This test ensures, that the default implementation of the function {@link Tup4oR#getNewInstance(Tup4oR)} calls
	 * the function {@link Tup4oR#getNewInstance(Object, Object, Object, Object)} with the correct components.
	 */
	@Test
	void getNewInstance_TupleTest()
	{
		Tup4oR<Long,Long,Long,Long> t = new TestTup<>(1l, 1l, 1l, 1l);
		
		t.getNewInstance(new TestTup<>(2l, 3l, 4l, 5l));
		
		assertEquals(true, ValueRelay.get("getNewInstanceC", false));
		assertEquals(2l, ValueRelay.get("getNewInstanceC_X", 0l));
		assertEquals(3l, ValueRelay.get("getNewInstanceC_Y", 0l));
		assertEquals(4l, ValueRelay.get("getNewInstanceC_Z", 0l));
		assertEquals(5l, ValueRelay.get("getNewInstanceC_W", 0l));
		
		// Can't test for the result here, as the relaying and adopting of the values are implementation specific.
	}
	
	/**
	 * This class is a test implementation of the interface {@link Tup4oR}.
	 * 
	 * @author picatrix1899
	 */
	private static class TestTup<X,Y,Z,W> implements Tup4oR<X,Y,Z,W>
	{
		private final X x;
		private final Y y;
		private final Z z;
		private final W w;
		
		public TestTup(X x, Y y, Z z, W w)
		{
			this.x = x;
			this.y = y;
			this.z = z;
			this.w = w;
		}
		
		@Override
		public X getX()
		{
			return this.x;
		}
		
		@Override
		public Y getY()
		{
			return this.y;
		}
		
		@Override
		public Z getZ()
		{
			return this.z;
		}
		
		@Override
		public W getW()
		{
			return this.w;
		}
		
		@Override
		public TestTup<X,Y,Z,W> getNewInstance(X x, Y y, Z z, W w)
		{
			ValueRelay.relayCall("getNewInstanceC");
			ValueRelay.relay("getNewInstanceC_X", x);
			ValueRelay.relay("getNewInstanceC_Y", y);
			ValueRelay.relay("getNewInstanceC_Z", z);
			ValueRelay.relay("getNewInstanceC_W", w);
			return new TestTup<>(x, y, z, w);
		}
	}
}
