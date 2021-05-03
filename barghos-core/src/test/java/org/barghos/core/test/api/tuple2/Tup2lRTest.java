package org.barghos.core.test.api.tuple2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import org.barghos.core.api.testing.ValueRelay;
import org.barghos.core.api.tuple2.Tup2lR;

/**
 * This class provides component tests for the interface {@link Tup2lR}.
 * 
 * @author picatrix1899
 */
class Tup2lRTest
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
	 * This test ensures, that the function {@link Tup2lR#isValid()} returns
	 * the corrct values for different situations.
	 */
	@Test
	void isValidTest()
	{
		Tup2lR t = new TestTup(0l, 0l);
		
		assertEquals(true, t.isValid());
		assertEquals(false, ValueRelay.get("getX", false));
		assertEquals(false, ValueRelay.get("getY", false));
	}
	
	/**
	 * This test ensures, that the function {@link Tup2lR#isFinite()} returns
	 * the corrct values for different situations.
	 */
	@Test
	void isFiniteTest()
	{
		Tup2lR t = new TestTup(0l, 0l);
		
		assertEquals(true, t.isFinite());
		assertEquals(false, ValueRelay.get("getX", false));
		assertEquals(false, ValueRelay.get("getY", false));
	}
	
	/**
	 * This test ensures, that the function {@link Tup2lR#isZero()} returns the correct
	 * value based on the situation.
	 */
	@Test
	void isZeroExactTest()
	{
		Tup2lR t = new TestTup(0l, 0l);
		assertEquals(true, t.isZero());
		
		t = new TestTup(1l, 0l);
		assertEquals(false, t.isZero());
		
		t = new TestTup(0l, 1l);
		assertEquals(false, t.isZero());
		
		t = new TestTup(1l, 1l);
		assertEquals(false, t.isZero());
	}
	
	/**
	 * This test ensures, that the function {@link Tup2lR#isZero(byte)} returns the correct
	 * value based on the situation.
	 */
	@Test
	void isZeroTest()
	{
		final int tolerance = 2;
		final long tol = (long)tolerance;
		
		for(int i = -tolerance - 1; i <= tolerance + 1; i++)
		{
			long v = (long)i;
			
			boolean b = Math.abs(i) <= tolerance;
			
			Tup2lR t = new TestTup(v, v);
			assertEquals(b, t.isZero(tol));
			
			t = new TestTup(v, 0l);
			assertEquals(b, t.isZero(tol));
			
			t = new TestTup(0l, v);
			assertEquals(b, t.isZero(tol));
		}
	}
	
	/**
	 * This test ensures, that the default implementation of the function {@link Tup2lR#getNewInstance(Tup2lR)} calls
	 * the function {@link Tup2lR#getNewInstance(long, long)} with the correct components.
	 */
	@Test
	void getNewInstance_TupleTest()
	{
		Tup2lR t = new TestTup(1l, 1l);
		
		t.getNewInstance(new TestTup(2l, 3l));
		
		assertEquals(true, ValueRelay.get("getNewInstanceC", false));
		assertEquals(2l, ValueRelay.get("getNewInstanceC_X", 0l));
		assertEquals(3l, ValueRelay.get("getNewInstanceC_Y", 0l));
		
		// Can't test for the result here, as the relaying and adopting of the values are implementation specific.
	}
	
	/**
	 * This test ensures, that the default implementation of the function {@link Tup2lR#getNewInstance(long)} calls
	 * the function {@link Tup2lR#getNewInstance(long, long)} with the correct components.
	 */
	@Test
	void getNewInstance_ValueTest()
	{
		Tup2lR t = new TestTup(1l, 1l);
		
		t.getNewInstance(2l);
		
		assertEquals(true, ValueRelay.get("getNewInstanceC", false));
		assertEquals(2l, ValueRelay.get("getNewInstanceC_X", 0l));
		assertEquals(2l, ValueRelay.get("getNewInstanceC_Y", 0l));
		
		// Can't test for the result here, as the relaying and adopting of the values are implementation specific.
	}
	
	/**
	 * This class is a test implementation of the interface {@link Tup2lR}.
	 * 
	 * @author picatrix1899
	 */
	private static class TestTup implements Tup2lR
	{
		private final long x;
		private final long y;
		
		public TestTup(long x, long y)
		{
			this.x = x;
			this.y = y;
		}
		
		@Override
		public long getX()
		{
			ValueRelay.relayCall("getX");
			return this.x;
		}
		
		@Override
		public long getY()
		{
			ValueRelay.relayCall("getY");
			return this.y;
		}
		
		@Override
		public TestTup getNewInstance(long x, long y)
		{
			ValueRelay.relayCall("getNewInstanceC");
			ValueRelay.relay("getNewInstanceC_X", x);
			ValueRelay.relay("getNewInstanceC_Y", y);
			return new TestTup(x, y);
		}
	}
}