package org.barghos.core.test.api.tuple2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import org.barghos.core.api.testing.ValueRelay;
import org.barghos.core.api.tuple2.Tup2bigdR;

/**
 * This class provides component tests for the interface {@link Tup2bigdR}.
 * 
 * @author picatrix1899
 */
class Tup2bigdRTest
{
	/**
	 * This test ensures, that the function {@link Tup2bigdR#isValid()} returns
	 * the corrct values for different situations.
	 */
	@Test
	void isValidTest()
	{
		final BigDecimal one = BigDecimal.ONE;
		
		Tup2bigdR t = new TestTup(null, null);
		assertEquals(false, t.isValid());
		
		t = new TestTup(one, null);
		assertEquals(false, t.isValid());
		
		t = new TestTup(null, one);
		assertEquals(false, t.isValid());
		
		t = new TestTup(one, one);
		assertEquals(true, t.isValid());
	}
	
	/**
	 * This test ensures, that the function {@link Tup2bigdR#isFinite()} returns
	 * the corrct values for different situations.
	 */
	@Test
	void isFiniteTest()
	{
		Tup2bigdR t = new Tup2bigdR() {
			public BigDecimal getX()
			{
				ValueRelay.relayCall("getX");
				return null;
			}

			public BigDecimal getY()
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
	 * This test ensures, that the function {@link Tup2bigdR#isZero()} returns the correct
	 * value based on the situation.
	 */
	@Test
	void isZeroExactTest()
	{
		final BigDecimal zero = BigDecimal.ZERO;
		final BigDecimal one = BigDecimal.ONE;
		
		Tup2bigdR t = new TestTup(zero, zero);
		assertEquals(true, t.isZero());
		
		t = new TestTup(one, zero);
		assertEquals(false, t.isZero());
		
		t = new TestTup(zero, one);
		assertEquals(false, t.isZero());
		
		t = new TestTup(one, one);
		assertEquals(false, t.isZero());
	}
	
	/**
	 * This test ensures, that the function {@link Tup2bigdR#isZero(BigDecimal)} returns the correct
	 * value based on the situation.
	 */
	@Test
	void isZeroTest()
	{
		final BigDecimal zero = BigDecimal.ZERO;
		
		final int tolerance = 2;
		final BigDecimal tol = BigDecimal.valueOf(tolerance);
		
		for(int i = -tolerance - 1; i <= tolerance + 1; i++)
		{
			BigDecimal v = BigDecimal.valueOf(i);
			
			boolean b = Math.abs(i) <= tolerance;
			
			Tup2bigdR t = new TestTup(v, v);
			assertEquals(b, t.isZero(tol));
			
			t = new TestTup(v, zero);
			assertEquals(b, t.isZero(tol));
			
			t = new TestTup(zero, v);
			assertEquals(b, t.isZero(tol));
		}
	}
	
	/**
	 * This class is a test implementation of the interface {@link Tup2bigdR}.
	 * 
	 * @author picatrix1899
	 */
	private static class TestTup implements Tup2bigdR
	{
		private final BigDecimal x;
		private final BigDecimal y;
		
		public TestTup(BigDecimal x, BigDecimal y)
		{
			this.x = x;
			this.y = y;
		}
		
		@Override
		public BigDecimal getX()
		{
			return this.x;
		}
		
		@Override
		public BigDecimal getY()
		{
			return this.y;
		}
	}
}
