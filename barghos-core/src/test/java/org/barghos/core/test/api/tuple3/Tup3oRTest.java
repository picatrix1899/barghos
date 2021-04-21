package org.barghos.core.test.api.tuple3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import org.barghos.core.api.tuple3.Tup3oR;

/**
 * This class provides component tests for the interface {@link Tup3oR}.
 * 
 * @author picatrix1899
 */
class Tup3oRTest
{
	/**
	 * This test ensures, that the function {@link Tup3oR#isValid()} returns
	 * the corrct values for different situations.
	 */
	@Test
	void isValidTest()
	{
		Tup3oR<Object, Object, Object> t = new TestTup<>(null, null, null);
		assertEquals(false, t.isValid());
		
		t = new TestTup<>(new Object(), null, null);
		assertEquals(false, t.isValid());
		
		t = new TestTup<>(null, new Object(), null);
		assertEquals(false, t.isValid());
		
		t = new TestTup<>(null, null, new Object());
		assertEquals(false, t.isValid());
		
		t = new TestTup<>(new Object(), new Object(), new Object());
		assertEquals(true, t.isValid());
	}
	
	/**
	 * This class is a test implementation of the interface {@link Tup3oR}.
	 * 
	 * @author picatrix1899
	 */
	private static class TestTup<X,Y,Z> implements Tup3oR<X,Y,Z>
	{
		private final X x;
		private final Y y;
		private final Z z;
		
		public TestTup(X x, Y y, Z z)
		{
			this.x = x;
			this.y = y;
			this.z = z;
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
	}
}
