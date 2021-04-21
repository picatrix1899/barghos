package org.barghos.core.test.api.tuple4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.math.BigInteger;

import org.barghos.core.api.testing.ValueRelay;
import org.barghos.core.api.tuple4.Tup4bigiR;

/**
 * This class provides component tests for the interface {@link Tup4bigiR}.
 * 
 * @author picatrix1899
 */
class Tup4bigiRTest
{
	/**
	 * This test ensures, that the function {@link Tup4bigiR#isValid()} returns
	 * the corrct values for different situations.
	 */
	@Test
	void isValidTest()
	{
		final BigInteger one = BigInteger.ONE;
		
		Tup4bigiR t = new TestTup(null, null, null, null);
		assertEquals(false, t.isValid());
		
		t = new TestTup(one, null, null, null);
		assertEquals(false, t.isValid());
		
		t = new TestTup(null, one, null, null);
		assertEquals(false, t.isValid());
		
		t = new TestTup(null, null, one, null);
		assertEquals(false, t.isValid());
		
		t = new TestTup(null, null, null, one);
		assertEquals(false, t.isValid());
		
		t = new TestTup(one, one, one, one);
		assertEquals(true, t.isValid());
	}
	
	/**
	 * This test ensures, that the function {@link Tup4bigiR#isFinite()} returns
	 * the corrct values for different situations.
	 */
	@Test
	void isFiniteTest()
	{
		Tup4bigiR t = new Tup4bigiR() {
			public BigInteger getX()
			{
				ValueRelay.relayCall("getX");
				return null;
			}

			public BigInteger getY()
			{
				ValueRelay.relayCall("getY");
				return null;
			}
			
			public BigInteger getZ()
			{
				ValueRelay.relayCall("getZ");
				return null;
			}
			
			public BigInteger getW()
			{
				ValueRelay.relayCall("getW");
				return null;
			}
		};
		
		assertEquals(true, t.isFinite());
		assertEquals(false, ValueRelay.get("getX", false));
		assertEquals(false, ValueRelay.get("getY", false));
		assertEquals(false, ValueRelay.get("getZ", false));
		assertEquals(false, ValueRelay.get("getW", false));
	}
	
	/**
	 * This test ensures, that the function {@link Tup4bigiR#isZero()} returns the correct
	 * value based on the situation.
	 */
	@Test
	void isZeroExactTest()
	{
		final BigInteger zero = BigInteger.ZERO;
		final BigInteger one = BigInteger.ONE;
		
		Tup4bigiR t = new TestTup(zero, zero, zero, zero);
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
	 * This test ensures, that the function {@link Tup4bigiR#isZero(BigDecimal)} returns the correct
	 * value based on the situation.
	 */
	@Test
	void isZeroTest()
	{
		final BigInteger zero = BigInteger.ZERO;
		
		final int tolerance = 2;
		final BigInteger tol = BigInteger.valueOf(tolerance);
		
		for(int i = -tolerance - 1; i <= tolerance + 1; i++)
		{
			BigInteger v = BigInteger.valueOf(i);
			
			boolean b = Math.abs(i) <= tolerance;
			
			Tup4bigiR t = new TestTup(v, v, v, v);
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
	 * This class is a test implementation of the interface {@link Tup4bigiR}.
	 * 
	 * @author picatrix1899
	 */
	private static class TestTup implements Tup4bigiR
	{
		private final BigInteger x;
		private final BigInteger y;
		private final BigInteger z;
		private final BigInteger w;
		
		public TestTup(BigInteger x, BigInteger y, BigInteger z, BigInteger w)
		{
			this.x = x;
			this.y = y;
			this.z = z;
			this.w = w;
		}
		
		@Override
		public BigInteger getX()
		{
			return this.x;
		}
		
		@Override
		public BigInteger getY()
		{
			return this.y;
		}
		
		@Override
		public BigInteger getZ()
		{
			return this.z;
		}
		
		@Override
		public BigInteger getW()
		{
			return this.w;
		}
	}
}