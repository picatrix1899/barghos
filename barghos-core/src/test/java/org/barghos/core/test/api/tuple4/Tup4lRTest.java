package org.barghos.core.test.api.tuple4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import org.barghos.core.api.testing.ValueRelay;
import org.barghos.core.api.tuple4.Tup4lR;

/**
 * This class provides component tests for the interface {@link Tup4lR}.
 * 
 * @author picatrix1899
 */
class Tup4lRTest
{
	/**
	 * This test ensures, that the function {@link Tup4lR#isValid()} returns
	 * the corrct values for different situations.
	 */
	@Test
	void isValidTest()
	{
		Tup4lR t = new Tup4lR() {
			public long getX()
			{
				ValueRelay.relayCall("getX");
				return 0l;
			}

			public long getY()
			{
				ValueRelay.relayCall("getY");
				return 0l;
			}
			
			public long getZ()
			{
				ValueRelay.relayCall("getZ");
				return 0l;
			}
			
			public long getW()
			{
				ValueRelay.relayCall("getW");
				return 0l;
			}
		};
		
		assertEquals(true, t.isValid());
		assertEquals(false, ValueRelay.get("getX", false));
		assertEquals(false, ValueRelay.get("getY", false));
		assertEquals(false, ValueRelay.get("getZ", false));
		assertEquals(false, ValueRelay.get("getW", false));
	}
	
	/**
	 * This test ensures, that the function {@link Tup4lR#isFinite()} returns
	 * the corrct values for different situations.
	 */
	@Test
	void isFiniteTest()
	{
		Tup4lR t = new Tup4lR() {
			public long getX()
			{
				ValueRelay.relayCall("getX");
				return 0l;
			}

			public long getY()
			{
				ValueRelay.relayCall("getY");
				return 0l;
			}
			
			public long getZ()
			{
				ValueRelay.relayCall("getZ");
				return 0l;
			}
			
			public long getW()
			{
				ValueRelay.relayCall("getW");
				return 0l;
			}
		};
		
		assertEquals(true, t.isFinite());
		assertEquals(false, ValueRelay.get("getX", false));
		assertEquals(false, ValueRelay.get("getY", false));
		assertEquals(false, ValueRelay.get("getZ", false));
		assertEquals(false, ValueRelay.get("getW", false));
	}
	
	/**
	 * This test ensures, that the function {@link Tup4lR#isZero()} returns the correct
	 * value based on the situation.
	 */
	@Test
	void isZeroExactTest()
	{
		Tup4lR t = new TestTup(0l, 0l, 0l, 0l);
		assertEquals(true, t.isZero());
		
		t = new TestTup(1l, 0l, 0l, 0l);
		assertEquals(false, t.isZero());
		
		t = new TestTup(0l, 1l, 0l, 0l);
		assertEquals(false, t.isZero());
		
		t = new TestTup(0l, 0l, 1l, 0l);
		assertEquals(false, t.isZero());
		
		t = new TestTup(0l, 0l, 0l, 1l);
		assertEquals(false, t.isZero());
		
		t = new TestTup(1l, 1l, 1l, 1l);
		assertEquals(false, t.isZero());
	}
	
	/**
	 * This test ensures, that the function {@link Tup4lR#isZero(byte)} returns the correct
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
			
			Tup4lR t = new TestTup(v, v, v, v);
			assertEquals(b, t.isZero(tol));
			
			t = new TestTup(v, 0l, 0l, 0l);
			assertEquals(b, t.isZero(tol));
			
			t = new TestTup(0l, v, 0l, 0l);
			assertEquals(b, t.isZero(tol));
			
			t = new TestTup(0l, 0l, v, 0l);
			assertEquals(b, t.isZero(tol));
			
			t = new TestTup(0l, 0l, 0l, v);
			assertEquals(b, t.isZero(tol));
		}
	}
	
	/**
	 * This class is a test implementation of the interface {@link Tup4lR}.
	 * 
	 * @author picatrix1899
	 */
	private static class TestTup implements Tup4lR
	{
		private final long x;
		private final long y;
		private final long z;
		private final long w;
		
		public TestTup(long x, long y, long z, long w)
		{
			this.x = x;
			this.y = y;
			this.z = z;
			this.w = w;
		}
		
		@Override
		public long getX()
		{
			return this.x;
		}
		
		@Override
		public long getY()
		{
			return this.y;
		}
		
		@Override
		public long getZ()
		{
			return this.z;
		}
		
		@Override
		public long getW()
		{
			return this.w;
		}
	}
}