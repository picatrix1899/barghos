package org.barghos.core.test.api.tuple2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.math.BigInteger;

import org.barghos.core.api.testing.ValueRelay;
import org.barghos.core.api.tuple2.Tup2bigiR;

/**
 * This class provides component tests for the interface {@link Tup2bigiR}.
 * 
 * @author picatrix1899
 */
class Tup2bigiRTest
{
	/**
	 * This test ensures, that the function {@link Tup2bigiR#isValid()} returns
	 * the corrct values for different situations.
	 */
	@Test
	void isValidTest()
	{
		final BigInteger one = BigInteger.ONE;
		
		Tup2bigiR t = new TestTup(null, null);
		assertEquals(false, t.isValid());
		
		t = new TestTup(one, null);
		assertEquals(false, t.isValid());
		
		t = new TestTup(null, one);
		assertEquals(false, t.isValid());
		
		t = new TestTup(one, one);
		assertEquals(true, t.isValid());
	}
	
	/**
	 * This test ensures, that the function {@link Tup2bigiR#isFinite()} returns
	 * the corrct values for different situations.
	 */
	@Test
	void isFiniteTest()
	{
		Tup2bigiR t = new Tup2bigiR() {
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
		};
		
		assertEquals(true, t.isFinite());
		assertEquals(false, ValueRelay.get("getX", false));
		assertEquals(false, ValueRelay.get("getY", false));
	}
	
	/**
	 * This test ensures, that the function {@link Tup2bigiR#isZero()} returns the correct
	 * value based on the situation.
	 */
	@Test
	void isZeroExactTest()
	{
		final BigInteger zero = BigInteger.ZERO;
		final BigInteger one = BigInteger.ONE;
		
		Tup2bigiR t = new TestTup(zero, zero);
		assertEquals(true, t.isZero());
		
		t = new TestTup(one, zero);
		assertEquals(false, t.isZero());
		
		t = new TestTup(zero, one);
		assertEquals(false, t.isZero());
		
		t = new TestTup(one, one);
		assertEquals(false, t.isZero());
	}
	
	/**
	 * This test ensures, that the function {@link Tup2bigiR#isZero(BigDecimal)} returns the correct
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
			
			Tup2bigiR t = new TestTup(v, v);
			assertEquals(b, t.isZero(tol));
			
			t = new TestTup(v, zero);
			assertEquals(b, t.isZero(tol));
			
			t = new TestTup(zero, v);
			assertEquals(b, t.isZero(tol));
		}
	}
	
	/**
	 * This class is a test implementation of the interface {@link Tup2bigiR}.
	 * 
	 * @author picatrix1899
	 */
	private static class TestTup implements Tup2bigiR
	{
		private final BigInteger x;
		private final BigInteger y;
		
		public TestTup(BigInteger x, BigInteger y)
		{
			this.x = x;
			this.y = y;
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
	}
}
