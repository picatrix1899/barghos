package org.barghos.core.test.api.tuple2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import org.barghos.core.api.testing.ValueRelay;
import org.barghos.core.api.tuple2.Tup2iR;

/**
 * This class provides component tests for the interface {@link Tup2iR}.
 * 
 * @author picatrix1899
 */
class Tup2iRTest
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
	 * This test ensures, that the function {@link Tup2iR#isValid()} returns
	 * the corrct values for different situations.
	 */
	@Test
	void isValidTest()
	{
		Tup2iR t = new TestTup(0, 0);
		
		assertEquals(true, t.isValid());
		assertEquals(false, ValueRelay.get("getX", false));
		assertEquals(false, ValueRelay.get("getY", false));
	}
	
	/**
	 * This test ensures, that the function {@link Tup2iR#isFinite()} returns
	 * the corrct values for different situations.
	 */
	@Test
	void isFiniteTest()
	{
		Tup2iR t = new TestTup(0, 0);
		
		assertEquals(true, t.isFinite());
		assertEquals(false, ValueRelay.get("getX", false));
		assertEquals(false, ValueRelay.get("getY", false));
	}
	
	/**
	 * This test ensures, that the function {@link Tup2iR#isZero()} returns the correct
	 * value based on the situation.
	 */
	@Test
	void isZeroExactTest()
	{
		Tup2iR t = new TestTup(0, 0);
		assertEquals(true, t.isZero());
		
		t = new TestTup(1, 0);
		assertEquals(false, t.isZero());
		
		t = new TestTup(0, 1);
		assertEquals(false, t.isZero());
		
		t = new TestTup(1, 1);
		assertEquals(false, t.isZero());
	}
	
	/**
	 * This test ensures, that the function {@link Tup2iR#isZero(byte)} returns the correct
	 * value based on the situation.
	 */
	@Test
	void isZeroTest()
	{
		final int tolerance = 2;
		final int tol = tolerance;
		
		for(int i = -tolerance - 1; i <= tolerance + 1; i++)
		{
			int v = i;
			
			boolean b = Math.abs(i) <= tolerance;
			
			Tup2iR t = new TestTup(v, v);
			assertEquals(b, t.isZero(tol));
			
			t = new TestTup(v, 0);
			assertEquals(b, t.isZero(tol));
			
			t = new TestTup(0, v);
			assertEquals(b, t.isZero(tol));
		}
	}
	
	/**
	 * This test ensures, that the default implementation of the function {@link Tup2iR#getNewInstance(Tup2iR)} calls
	 * the function {@link Tup2iR#getNewInstance(int, int)} with the correct components.
	 */
	@Test
	void getNewInstance_TupleTest()
	{
		Tup2iR t = new TestTup(1, 1);
		
		t.getNewInstance(new TestTup(2, 3));
		
		assertEquals(true, ValueRelay.get("getNewInstanceC", false));
		assertEquals(2, ValueRelay.get("getNewInstanceC_X", 0));
		assertEquals(3, ValueRelay.get("getNewInstanceC_Y", 0));
		
		// Can't test for the result here, as the relaying and adopting of the values are implementation specific.
	}
	
	/**
	 * This test ensures, that the default implementation of the function {@link Tup2iR#getNewInstance(int)} calls
	 * the function {@link Tup2dR#getNewInstance(int, int)} with the correct components.
	 */
	@Test
	void getNewInstance_ValueTest()
	{
		Tup2iR t = new TestTup(1, 1);
		
		t.getNewInstance(2);
		
		assertEquals(true, ValueRelay.get("getNewInstanceC", false));
		assertEquals(2, ValueRelay.get("getNewInstanceC_X", 0));
		assertEquals(2, ValueRelay.get("getNewInstanceC_Y", 0));
		
		// Can't test for the result here, as the relaying and adopting of the values are implementation specific.
	}
	
	/**
	 * This class is a test implementation of the interface {@link Tup2iR}.
	 * 
	 * @author picatrix1899
	 */
	private static class TestTup implements Tup2iR
	{
		private final int x;
		private final int y;
		
		public TestTup(int x, int y)
		{
			this.x = x;
			this.y = y;
		}
		
		@Override
		public int getX()
		{
			ValueRelay.relayCall("getX");
			return this.x;
		}
		
		@Override
		public int getY()
		{
			ValueRelay.relayCall("getY");
			return this.y;
		}
		
		@Override
		public TestTup getNewInstance(int x, int y)
		{
			ValueRelay.relayCall("getNewInstanceC");
			ValueRelay.relay("getNewInstanceC_X", x);
			ValueRelay.relay("getNewInstanceC_Y", y);
			return new TestTup(x, y);
		}
	}
}