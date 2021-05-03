package org.barghos.core.test.api.tuple3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import org.barghos.core.api.testing.ValueRelay;
import org.barghos.core.api.tuple3.Tup3iR;

/**
 * This class provides component tests for the interface {@link Tup3iR}.
 * 
 * @author picatrix1899
 */
class Tup3iRTest
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
	 * This test ensures, that the function {@link Tup3iR#isValid()} returns
	 * the corrct values for different situations.
	 */
	@Test
	void isValidTest()
	{
		Tup3iR t = new TestTup(0, 0, 0);
		
		assertEquals(true, t.isValid());
		assertEquals(false, ValueRelay.get("getX", false));
		assertEquals(false, ValueRelay.get("getY", false));
		assertEquals(false, ValueRelay.get("getZ", false));
	}
	
	/**
	 * This test ensures, that the function {@link Tup3iR#isFinite()} returns
	 * the corrct values for different situations.
	 */
	@Test
	void isFiniteTest()
	{
		Tup3iR t = new TestTup(0, 0, 0);
		
		assertEquals(true, t.isFinite());
		assertEquals(false, ValueRelay.get("getX", false));
		assertEquals(false, ValueRelay.get("getY", false));
		assertEquals(false, ValueRelay.get("getZ", false));
	}
	
	/**
	 * This test ensures, that the function {@link Tup3iR#isZero()} returns the correct
	 * value based on the situation.
	 */
	@Test
	void isZeroExactTest()
	{
		Tup3iR t = new TestTup(0, 0, 0);
		assertEquals(true, t.isZero());
		
		t = new TestTup(1, 0, 0);
		assertEquals(false, t.isZero());
		
		t = new TestTup(0, 1, 0);
		assertEquals(false, t.isZero());
		
		t = new TestTup(1, 1, 1);
		assertEquals(false, t.isZero());
	}
	
	/**
	 * This test ensures, that the function {@link Tup3iR#isZero(byte)} returns the correct
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
			
			Tup3iR t = new TestTup(v, v, v);
			assertEquals(b, t.isZero(tol));
			
			t = new TestTup(v, 0, 0);
			assertEquals(b, t.isZero(tol));
			
			t = new TestTup(0, v, 0);
			assertEquals(b, t.isZero(tol));
			
			t = new TestTup(0, 0, v);
			assertEquals(b, t.isZero(tol));
		}
	}
	
	/**
	 * This test ensures, that the default implementation of the function {@link Tup3iR#getNewInstance(Tup3iR)} calls
	 * the function {@link Tup3iR#getNewInstance(int, int, int)} with the correct components.
	 */
	@Test
	void getNewInstance_TupleTest()
	{
		Tup3iR t = new TestTup(0, 0, 0);
		
		t.getNewInstance(new TestTup(1, 2, 3));
		
		assertEquals(true, ValueRelay.get("getNewInstanceC", false));
		assertEquals(1, ValueRelay.get("getNewInstanceC_X", 0));
		assertEquals(2, ValueRelay.get("getNewInstanceC_Y", 0));
		assertEquals(3, ValueRelay.get("getNewInstanceC_Z", 0));
		
		// Can't test for the result here, as the relaying and adopting of the values are implementation specific.
	}
	
	/**
	 * This test ensures, that the default implementation of the function {@link Tup3iR#getNewInstance(int)} calls
	 * the function {@link Tup3iR#getNewInstance(int, int, int)} with the correct components.
	 */
	@Test
	void getNewInstance_ValueTest()
	{
		Tup3iR t = new TestTup(0, 0, 0);
		
		t.getNewInstance(1);
		
		assertEquals(true, ValueRelay.get("getNewInstanceC", false));
		assertEquals(1, ValueRelay.get("getNewInstanceC_X", 0));
		assertEquals(1, ValueRelay.get("getNewInstanceC_Y", 0));
		assertEquals(1, ValueRelay.get("getNewInstanceC_Z", 0));
		
		// Can't test for the result here, as the relaying and adopting of the values are implementation specific.
	}
	
	/**
	 * This class is a test implementation of the interface {@link Tup3iR}.
	 * 
	 * @author picatrix1899
	 */
	private static class TestTup implements Tup3iR
	{
		private final int x;
		private final int y;
		private final int z;
		
		public TestTup(int x, int y, int z)
		{
			this.x = x;
			this.y = y;
			this.z = z;
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
		public int getZ()
		{
			ValueRelay.relayCall("getZ");
			return this.z;
		}
		
		@Override
		public TestTup getNewInstance(int x, int y, int z)
		{
			ValueRelay.relayCall("getNewInstanceC");
			ValueRelay.relay("getNewInstanceC_X", x);
			ValueRelay.relay("getNewInstanceC_Y", y);
			ValueRelay.relay("getNewInstanceC_Z", z);
			return new TestTup(x, y, z);
		}
	}
}