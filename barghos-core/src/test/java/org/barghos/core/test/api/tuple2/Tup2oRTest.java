package org.barghos.core.test.api.tuple2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import org.barghos.core.api.testing.ValueRelay;
import org.barghos.core.api.tuple2.Tup2oR;

/**
 * This class provides component tests for the interface {@link Tup2oR}.
 * 
 * @author picatrix1899
 */
class Tup2oRTest
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
	 * This test ensures, that the default implementation of the function {@link Tup2oR#getNewInstance(Tup2objR)} calls
	 * the function {@link Tup2oR#getNewInstance(Object, Object)} with the correct components.
	 */
	@Test
	void getNewInstance_TupleTest()
	{
		Tup2oR<Long,Long> t = new TestTup<>(1l, 1l);
		
		t.getNewInstance(new TestTup<>(2l, 3l));
		
		assertEquals(true, ValueRelay.get("getNewInstanceC", false));
		assertEquals(2l, ValueRelay.get("getNewInstanceC_X", 0l));
		assertEquals(3l, ValueRelay.get("getNewInstanceC_Y", 0l));
		
		// Can't test for the result here, as the relaying and adopting of the values are implementation specific.
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
		
		@Override
		public TestTup<X,Y> getNewInstance(X x, Y y)
		{
			ValueRelay.relayCall("getNewInstanceC");
			ValueRelay.relay("getNewInstanceC_X", x);
			ValueRelay.relay("getNewInstanceC_Y", y);
			return new TestTup<>(x, y);
		}
	}
}
