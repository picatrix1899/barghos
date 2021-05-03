package org.barghos.core.test.api.tuple2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import org.barghos.core.api.testing.ValueRelay;
import org.barghos.core.api.tuple2.Tup2objR;

/**
 * This class provides component tests for the interface {@link Tup2objR}.
 * 
 * @author picatrix1899
 */
class Tup2objRTest
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
	 * This test ensures, that the function {@link Tup2objR#isValid()} returns
	 * the corrct values for different situations.
	 */
	@Test
	void isValidTest()
	{
		Tup2objR t = new TestTup(null, null);
		assertEquals(false, t.isValid());
		
		t = new TestTup(null, new Object());
		assertEquals(false, t.isValid());
		
		t = new TestTup(new Object(), null);
		assertEquals(false, t.isValid());
		
		t = new TestTup(new Object(), new Object());
		assertEquals(true, t.isValid());
	}
	
	/**
	 * This test ensures, that the default implementation of the function {@link Tup2objR#getNewInstance(Tup2objR)} calls
	 * the function {@link Tup2objR#getNewInstance(Object, Object)} with the correct components.
	 */
	@Test
	void getNewInstance_TupleTest()
	{
		Tup2objR t = new TestTup(1l, 1l);
		
		t.getNewInstance(new TestTup(2l, 3l));
		
		assertEquals(true, ValueRelay.get("getNewInstanceC", false));
		assertEquals(2l, ValueRelay.get("getNewInstanceC_X", 0l));
		assertEquals(3l, ValueRelay.get("getNewInstanceC_Y", 0l));
		
		// Can't test for the result here, as the relaying and adopting of the values are implementation specific.
	}
	
	/**
	 * This test ensures, that the default implementation of the function {@link Tup2objR#getNewInstance(Object)} calls
	 * the function {@link Tup2objR#getNewInstance(Object, Object)} with the correct components.
	 */
	@Test
	void getNewInstance_ValueTest()
	{
		Tup2objR t = new TestTup(1l, 1l);
		
		t.getNewInstance(2l);
		
		assertEquals(true, ValueRelay.get("getNewInstanceC", false));
		assertEquals(2l, ValueRelay.get("getNewInstanceC_X", 0l));
		assertEquals(2l, ValueRelay.get("getNewInstanceC_Y", 0l));
		
		// Can't test for the result here, as the relaying and adopting of the values are implementation specific.
	}
	
	/**
	 * This class is a test implementation of the interface {@link Tup2objR}.
	 * 
	 * @author picatrix1899
	 */
	private static class TestTup implements Tup2objR
	{
		private final Object x;
		private final Object y;
		
		public TestTup(Object x, Object y)
		{
			this.x = x;
			this.y = y;
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
		public TestTup getNewInstance(Object x, Object y)
		{
			ValueRelay.relayCall("getNewInstanceC");
			ValueRelay.relay("getNewInstanceC_X", x);
			ValueRelay.relay("getNewInstanceC_Y", y);
			return new TestTup(x, y);
		}
	}
}
