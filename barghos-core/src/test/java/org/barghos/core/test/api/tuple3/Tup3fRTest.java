package org.barghos.core.test.api.tuple3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import org.barghos.core.api.testing.ValueRelay;
import org.barghos.core.api.tuple4.Tup4fR;

/**
 * This class provides component tests for the interface {@link Tup4fR}.
 * 
 * @author picatrix1899
 */
class Tup3fRTest
{
	/**
	 * This test ensures, that the function {@link Tup4fR#isValid()} returns
	 * the corrct values for different situations.
	 */
	@Test
	void isValidTest()
	{
		Tup4fR t = new Tup4fR() {
			public float getX()
			{
				ValueRelay.relayCall("getX");
				return 0.0f;
			}

			public float getY()
			{
				ValueRelay.relayCall("getY");
				return 0.0f;
			}
			
			public float getZ()
			{
				ValueRelay.relayCall("getZ");
				return 0.0f;
			}
			
			public float getW()
			{
				ValueRelay.relayCall("getW");
				return 0.0f;
			}
		};
		
		assertEquals(true, t.isValid());
		assertEquals(false, ValueRelay.get("getX", false));
		assertEquals(false, ValueRelay.get("getY", false));
		assertEquals(false, ValueRelay.get("getZ", false));
		assertEquals(false, ValueRelay.get("getW", false));
	}
	
	/**
	 * This test ensures, that the function {@link Tup4fR#isFinite()} returns
	 * the corrct values for different situations.
	 */
	@Test
	void isFiniteTest()
	{
		final float[] values = new float[] {0.0f, Float.NaN, Float.NEGATIVE_INFINITY, Float.POSITIVE_INFINITY};
		
		for(int i = 0; i <= 4; i++)
		{
			float v = values[i];
			
			boolean b = i == 0;
			
			Tup4fR t = new TestTup(v, v, v, v);
			assertEquals(b, t.isFinite());
			
			t = new TestTup(v, 0.0f, 0.0f, 0.0f);
			assertEquals(b, t.isFinite());
			
			t = new TestTup(0.0f, v, 0.0f, 0.0f);
			assertEquals(b, t.isFinite());
			
			t = new TestTup(0.0f, 0.0f, v, 0.0f);
			assertEquals(b, t.isFinite());
			
			t = new TestTup(0.0f, 0.0f, 0.0f, v);
			assertEquals(b, t.isFinite());
		}
	}
	
	/**
	 * This test ensures, that the function {@link Tup4fR#isZero()} returns the correct
	 * value based on the situation.
	 */
	@Test
	void isZeroExactTest()
	{
		Tup4fR t = new TestTup(0.0f, 0.0f, 0.0f, 0.0f);
		assertEquals(true, t.isZero());
		
		t = new TestTup(1.0f, 0.0f, 0.0f, 0.0f);
		assertEquals(false, t.isZero());
		
		t = new TestTup(0.0f, 1.0f, 0.0f, 0.0f);
		assertEquals(false, t.isZero());
		
		t = new TestTup(0.0f, 0.0f, 1.0f, 0.0f);
		assertEquals(false, t.isZero());
		
		t = new TestTup(0.0f, 0.0f, 0.0f, 1.0f);
		assertEquals(false, t.isZero());
		
		t = new TestTup(1.0f, 1.0f, 1.0f, 1.0f);
		assertEquals(false, t.isZero());
	}
	
	/**
	 * This test ensures, that the function {@link Tup4fR#isZero(byte)} returns the correct
	 * value based on the situation.
	 */
	@Test
	void isZeroTest()
	{
		final int tolerance = 2;
		final float tol = (float)tolerance;
		
		for(int i = -tolerance - 1; i <= tolerance + 1; i++)
		{
			float v = (float)i;
			
			boolean b = Math.abs(i) <= tolerance;
			
			Tup4fR t = new TestTup(v, v, v, v);
			assertEquals(b, t.isZero(tol));
			
			t = new TestTup(v, 0.0f, 0.0f, 0.0f);
			assertEquals(b, t.isZero(tol));
			
			t = new TestTup(0.0f, v, 0.0f, 0.0f);
			assertEquals(b, t.isZero(tol));
			
			t = new TestTup(0.0f, 0.0f, v, 0.0f);
			assertEquals(b, t.isZero(tol));
			
			t = new TestTup(0.0f, 0.0f, 0.0f, v);
			assertEquals(b, t.isZero(tol));
		}
	}
	
	/**
	 * This class is a test implementation of the interface {@link Tup4fR}.
	 * 
	 * @author picatrix1899
	 */
	private static class TestTup implements Tup4fR
	{
		private final float x;
		private final float y;
		private final float z;
		private final float w;
		
		public TestTup(float x, float y, float z, float w)
		{
			this.x = x;
			this.y = y;
			this.z = z;
			this.w = w;
		}
		
		@Override
		public float getX()
		{
			return this.x;
		}
		
		@Override
		public float getY()
		{
			return this.y;
		}
		
		@Override
		public float getZ()
		{
			return this.z;
		}
		
		@Override
		public float getW()
		{
			return this.w;
		}
	}
}