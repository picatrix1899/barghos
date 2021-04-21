package org.barghos.core.test.api.tuple2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import org.barghos.core.api.tuple2.Tup2oR;

/**
 * This class provides component tests for the interface {@link Tup2oR}.
 * 
 * @author picatrix1899
 */
class Tup2oRTest
{
	/**
	 * This test ensures, that the function {@link Tup2oR#isValid()} returns
	 * the corrct values for different situations.
	 */
	@Test
	void isValidTest()
	{
		Tup2oR<Object, Object> t = new TestTup<>(null, null);
		assertEquals(false, t.isValid());
		
		t = new TestTup<>(null, new Object());
		assertEquals(false, t.isValid());
		
		t = new TestTup<>(new Object(), null);
		assertEquals(false, t.isValid());
		
		t = new TestTup<>(new Object(), new Object());
		assertEquals(true, t.isValid());
	}
	
	/**
	 * This class is a test implementation of the interface {@link Tup2oR}.
	 * 
	 * @author picatrix1899
	 */
	private static class TestTup<X,Y> implements Tup2oR<X,Y>
	{
		private final X x;
		private final Y y;
		
		public TestTup(X x, Y y)
		{
			this.x = x;
			this.y = y;
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
	}
}
