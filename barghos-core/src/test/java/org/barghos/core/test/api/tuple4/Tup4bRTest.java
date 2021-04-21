package org.barghos.core.test.api.tuple4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import org.barghos.core.api.testing.ValueRelay;
import org.barghos.core.api.tuple4.Tup4bR;

/**
 * This class provides component tests for the interface {@link Tup4bR}.
 * 
 * @author picatrix1899
 */
class Tup4bRTest
{
	/**
	 * This test ensures, that the function {@link Tup4bR#isValid()} returns
	 * the corrct values for different situations.
	 */
	@Test
	void isValidTest()
	{
		Tup4bR t = new Tup4bR() {
			public byte getX()
			{
				ValueRelay.relayCall("getX");
				return (byte)0;
			}

			public byte getY()
			{
				ValueRelay.relayCall("getY");
				return (byte)0;
			}
			
			public byte getZ()
			{
				ValueRelay.relayCall("getZ");
				return (byte)0;
			}
			
			public byte getW()
			{
				ValueRelay.relayCall("getW");
				return (byte)0;
			}
		};
		
		assertEquals(true, t.isValid());
		assertEquals(false, ValueRelay.get("getX", false));
		assertEquals(false, ValueRelay.get("getY", false));
		assertEquals(false, ValueRelay.get("getZ", false));
		assertEquals(false, ValueRelay.get("getW", false));
	}
	
	/**
	 * This test ensures, that the function {@link Tup4bR#isFinite()} returns
	 * the corrct values for different situations.
	 */
	@Test
	void isFiniteTest()
	{
		Tup4bR t = new Tup4bR() {
			public byte getX()
			{
				ValueRelay.relayCall("getX");
				return (byte)0;
			}

			public byte getY()
			{
				ValueRelay.relayCall("getY");
				return (byte)0;
			}
			
			public byte getZ()
			{
				ValueRelay.relayCall("getZ");
				return (byte)0;
			}
			
			public byte getW()
			{
				ValueRelay.relayCall("getW");
				return (byte)0;
			}
		};
		
		assertEquals(true, t.isFinite());
		assertEquals(false, ValueRelay.get("getX", false));
		assertEquals(false, ValueRelay.get("getY", false));
		assertEquals(false, ValueRelay.get("getZ", false));
		assertEquals(false, ValueRelay.get("getW", false));
	}
	
	/**
	 * This test ensures, that the function {@link Tup4bR#isZero()} returns the correct
	 * value based on the situation.
	 */
	@Test
	void isZeroExactTest()
	{
		final byte zero = (byte)0;
		final byte one = (byte)1;
		
		Tup4bR t = new TestTup(zero, zero, zero, zero);
		assertEquals(true, t.isZero());
		
		t = new TestTup(one, zero, zero, zero);
		assertEquals(false, t.isZero());
		
		t = new TestTup(zero, one, zero, zero);
		assertEquals(false, t.isZero());
		
		t = new TestTup(zero, zero, one, zero);
		assertEquals(false, t.isZero());
		
		t = new TestTup(zero, zero, zero, one);
		assertEquals(false, t.isZero());
		
		t = new TestTup(one, one, one, one);
		assertEquals(false, t.isZero());
	}
	
	/**
	 * This test ensures, that the function {@link Tup4bR#isZero(byte)} returns the correct
	 * value based on the situation.
	 */
	@Test
	void isZeroTest()
	{
		final byte zero = (byte)0;
		
		final int tolerance = 2;
		final byte tol = (byte)tolerance;
		
		for(int i = -tolerance - 1; i <= tolerance + 1; i++)
		{
			byte v = (byte)i;
			
			boolean b = Math.abs(i) <= tolerance;
			
			Tup4bR t = new TestTup(v, v, v, v);
			assertEquals(b, t.isZero(tol));
			
			t = new TestTup(v, zero, zero, zero);
			assertEquals(b, t.isZero(tol));
			
			t = new TestTup(zero, v, zero, zero);
			assertEquals(b, t.isZero(tol));
			
			t = new TestTup(zero, zero, v, zero);
			assertEquals(b, t.isZero(tol));
			
			t = new TestTup(zero, zero, zero, v);
			assertEquals(b, t.isZero(tol));
		}
	}
	
	/**
	 * This class is a test implementation of the interface {@link Tup4bR}.
	 * 
	 * @author picatrix1899
	 */
	private static class TestTup implements Tup4bR
	{
		private final byte x;
		private final byte y;
		private final byte z;
		private final byte w;
		
		public TestTup(byte x, byte y, byte z, byte w)
		{
			this.x = x;
			this.y = y;
			this.z = z;
			this.w = w;
		}
		
		@Override
		public byte getX()
		{
			return this.x;
		}
		
		@Override
		public byte getY()
		{
			return this.y;
		}
		
		@Override
		public byte getZ()
		{
			return this.z;
		}
		
		@Override
		public byte getW()
		{
			return this.w;
		}
	}
}
