package org.barghos.core.test.api.tuple3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import org.barghos.core.api.testing.ValueRelay;
import org.barghos.core.api.tuple3.Tup3bigdR;

/**
 * This class provides component tests for the interface {@link Tup3bigdR}.
 * 
 * @author picatrix1899
 */
class Tup3bigdRTest
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
	 * This test ensures, that the function {@link Tup3bigdR#isValid()} returns
	 * the corrct values for different situations.
	 */
	@Test
	void isValidTest()
	{
		final BigDecimal one = BigDecimal.ONE;
		
		Tup3bigdR t = new TestTup(null, null, null);
		assertEquals(false, t.isValid());
		
		t = new TestTup(one, null, null);
		assertEquals(false, t.isValid());
		
		t = new TestTup(null, one, null);
		assertEquals(false, t.isValid());
		
		t = new TestTup(null, null, one);
		assertEquals(false, t.isValid());
		
		t = new TestTup(one, one, one);
		assertEquals(true, t.isValid());
	}
	
	/**
	 * This test ensures, that the function {@link Tup3bigdR#isFinite()} returns
	 * the corrct values for different situations.
	 */
	@Test
	void isFiniteTest()
	{
		BigDecimal zero = BigDecimal.ZERO;
		
		Tup3bigdR t = new TestTup(zero, zero, zero);
		
		assertEquals(true, t.isFinite());
		assertEquals(false, ValueRelay.get("getX", false));
		assertEquals(false, ValueRelay.get("getY", false));
		assertEquals(false, ValueRelay.get("getZ", false));
	}
	
	/**
	 * This test ensures, that the function {@link Tup3bigdR#isZero()} returns the correct
	 * value based on the situation.
	 */
	@Test
	void isZeroExactTest()
	{
		final BigDecimal zero = BigDecimal.ZERO;
		final BigDecimal one = BigDecimal.ONE;
		
		Tup3bigdR t = new TestTup(zero, zero, zero);
		assertEquals(true, t.isZero());
		
		t = new TestTup(one, zero, zero);
		assertEquals(false, t.isZero());
		
		t = new TestTup(zero, one, zero);
		assertEquals(false, t.isZero());
		
		t = new TestTup(zero, zero, one);
		assertEquals(false, t.isZero());
		
		t = new TestTup(one, one, one);
		assertEquals(false, t.isZero());
	}
	
	/**
	 * This test ensures, that the function {@link Tup3bigdR#isZero(BigDecimal)} returns the correct
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
			
			Tup3bigdR t = new TestTup(v, v, v);
			assertEquals(b, t.isZero(tol));
			
			t = new TestTup(v, zero, zero);
			assertEquals(b, t.isZero(tol));
			
			t = new TestTup(zero, v, zero);
			assertEquals(b, t.isZero(tol));
			
			t = new TestTup(zero, zero, v);
			assertEquals(b, t.isZero(tol));
		}
	}
	
	/**
	 * This test ensures, that the default implementation of the function {@link Tup3bigdR#getNewInstance(Tup3bigdR)} calls
	 * the function {@link Tup3bigdR#getNewInstance(BigDecimal, BigDecimal, BigDecimal)} with the correct components.
	 */
	@Test
	void getNewInstance_TupleTest()
	{
		final BigDecimal zero = BigDecimal.ZERO;
		final BigDecimal one = BigDecimal.ONE;
		final BigDecimal two = BigDecimal.valueOf(2.0);
		final BigDecimal three = BigDecimal.valueOf(3.0);
		final BigDecimal four = BigDecimal.valueOf(4.0);
		
		Tup3bigdR t = new TestTup(one, one, one);
		
		t.getNewInstance(new TestTup(two, three, four));
		
		assertEquals(true, ValueRelay.get("getNewInstanceC", false));
		assertEquals(two, ValueRelay.get("getNewInstanceC_X", zero));
		assertEquals(three, ValueRelay.get("getNewInstanceC_Y", zero));
		assertEquals(four, ValueRelay.get("getNewInstanceC_Z", zero));
		
		// Can't test for the result here, as the relaying and adopting of the values are implementation specific.
	}
	
	/**
	 * This test ensures, that the default implementation of the function {@link Tup3bigdR#getNewInstance(BigDecimal)} calls
	 * the function {@link Tup3bigdR#getNewInstance(BigDecimal, BigDecimal, BigDecimal)} with the correct components.
	 */
	@Test
	void getNewInstance_ValueTest()
	{
		final BigDecimal zero = BigDecimal.ZERO;
		final BigDecimal one = BigDecimal.ONE;
		final BigDecimal two = BigDecimal.valueOf(2.0);

		Tup3bigdR t = new TestTup(one, one, one);
		
		t.getNewInstance(two);
		
		assertEquals(true, ValueRelay.get("getNewInstanceC", false));
		assertEquals(two, ValueRelay.get("getNewInstanceC_X", zero));
		assertEquals(two, ValueRelay.get("getNewInstanceC_Y", zero));
		assertEquals(two, ValueRelay.get("getNewInstanceC_Z", zero));
		
		// Can't test for the result here, as the relaying and adopting of the values are implementation specific.
	}
	
	/**
	 * This class is a test implementation of the interface {@link Tup2bigdR}.
	 * 
	 * @author picatrix1899
	 */
	private static class TestTup implements Tup3bigdR
	{
		private final BigDecimal x;
		private final BigDecimal y;
		private final BigDecimal z;
		
		public TestTup(BigDecimal x, BigDecimal y, BigDecimal z)
		{
			this.x = x;
			this.y = y;
			this.z = z;
		}
		
		@Override
		public BigDecimal getX()
		{
			ValueRelay.relayCall("getX");
			return this.x;
		}
		
		@Override
		public BigDecimal getY()
		{
			ValueRelay.relayCall("getY");
			return this.y;
		}
		
		@Override
		public BigDecimal getZ()
		{
			ValueRelay.relayCall("getZ");
			return this.z;
		}
		
		@Override
		public TestTup getNewInstance(BigDecimal x, BigDecimal y, BigDecimal z)
		{
			ValueRelay.relayCall("getNewInstanceC");
			ValueRelay.relay("getNewInstanceC_X", x);
			ValueRelay.relay("getNewInstanceC_Y", y);
			ValueRelay.relay("getNewInstanceC_Z", z);
			return new TestTup(x, y, z);
		}
	}
}
