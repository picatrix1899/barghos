package org.barghos.core.test.api.tuple3;

import static org.junit.jupiter.api.Assertions.*;

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
	 * This test ensures, that the function {@link Tup3iR#isValid()} returns
	 * the corrct values for different situations.
	 */
	@Test
	void isValidTest()
	{
		Tup3iR t = new Tup3iR() {
			public int getX()
			{
				ValueRelay.relayCall("getX");
				return 0;
			}

			public int getY()
			{
				ValueRelay.relayCall("getY");
				return 0;
			}
			
			public int getZ()
			{
				ValueRelay.relayCall("getZ");
				return 0;
			}
		};
		
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
		Tup3iR t = new Tup3iR() {
			public int getX()
			{
				ValueRelay.relayCall("getX");
				return 0;
			}

			public int getY()
			{
				ValueRelay.relayCall("getY");
				return 0;
			}
			
			public int getZ()
			{
				ValueRelay.relayCall("getZ");
				return 0;
			}
		};
		
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
			return this.x;
		}
		
		@Override
		public int getY()
		{
			return this.y;
		}
		
		@Override
		public int getZ()
		{
			return this.z;
		}
	}
}