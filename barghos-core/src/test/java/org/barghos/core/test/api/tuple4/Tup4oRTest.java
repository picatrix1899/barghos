package org.barghos.core.test.api.tuple4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import org.barghos.core.api.tuple4.Tup4oR;

/**
 * This class provides component tests for the interface {@link Tup4oR}.
 * 
 * @author picatrix1899
 */
class Tup4oRTest
{
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
	}
}
