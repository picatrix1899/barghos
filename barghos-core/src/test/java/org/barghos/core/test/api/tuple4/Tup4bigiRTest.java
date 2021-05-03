package org.barghos.core.test.api.tuple4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

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
	 * This method is called after each test in this class.
	 */
	@AfterEach
	void cleanup()
	{
		ValueRelay.clear();
	}
	
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
		final BigInteger zero = BigInteger.ZERO;
		
		Tup4bigiR t = new TestTup(zero, zero, zero, zero);
		
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
	 * This test ensures, that the function {@link Tup4bigiR#isZero(BigInteger)} returns the correct
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
	 * This test ensures, that the default implementation of the function {@link Tup4bigiR#getNewInstance(Tup4bigiR)} calls
	 * the function {@link Tup4bigiR#getNewInstance(BigInteger, BigInteger, BigInteger, BigInteger)} with the correct components.
	 */
	@Test
	void getNewInstance_TupleTest()
	{
		final BigInteger zero = BigInteger.ZERO;
		final BigInteger one = BigInteger.ONE;
		final BigInteger two = BigInteger.valueOf(2);
		final BigInteger three = BigInteger.valueOf(3);
		final BigInteger four = BigInteger.valueOf(4);
		final BigInteger five = BigInteger.valueOf(5);
		
		Tup4bigiR t = new TestTup(one, one, one, one);
		
		t.getNewInstance(new TestTup(two, three, four, five));
		
		assertEquals(true, ValueRelay.get("getNewInstanceC", false));
		assertEquals(two, ValueRelay.get("getNewInstanceC_X", zero));
		assertEquals(three, ValueRelay.get("getNewInstanceC_Y", zero));
		assertEquals(four, ValueRelay.get("getNewInstanceC_Z", zero));
		assertEquals(five, ValueRelay.get("getNewInstanceC_W", zero));
		
		// Can't test for the result here, as the relaying and adopting of the values are implementation specific.
	}
	
	/**
	 * This test ensures, that the default implementation of the function {@link Tup4bigiR#getNewInstance(BigInteger)} calls
	 * the function {@link Tup4bigiR#getNewInstance(BigInteger, BigInteger, BigInteger, BigInteger)} with the correct components.
	 */
	@Test
	void getNewInstance_ValueTest()
	{
		final BigInteger zero = BigInteger.ZERO;
		final BigInteger one = BigInteger.ONE;
		final BigInteger two = BigInteger.valueOf(2);

		Tup4bigiR t = new TestTup(one, one, one, one);
		
		t.getNewInstance(two);
		
		assertEquals(true, ValueRelay.get("getNewInstanceC", false));
		assertEquals(two, ValueRelay.get("getNewInstanceC_X", zero));
		assertEquals(two, ValueRelay.get("getNewInstanceC_Y", zero));
		assertEquals(two, ValueRelay.get("getNewInstanceC_Z", zero));
		assertEquals(two, ValueRelay.get("getNewInstanceC_W", zero));
		
		// Can't test for the result here, as the relaying and adopting of the values are implementation specific.
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
			ValueRelay.relayCall("getX");
			return this.x;
		}
		
		@Override
		public BigInteger getY()
		{
			ValueRelay.relayCall("getY");
			return this.y;
		}
		
		@Override
		public BigInteger getZ()
		{
			ValueRelay.relayCall("getZ");
			return this.z;
		}
		
		@Override
		public BigInteger getW()
		{
			ValueRelay.relayCall("getW");
			return this.w;
		}
		
		@Override
		public TestTup getNewInstance(BigInteger x, BigInteger y, BigInteger z, BigInteger w)
		{
			ValueRelay.relayCall("getNewInstanceC");
			ValueRelay.relay("getNewInstanceC_X", x);
			ValueRelay.relay("getNewInstanceC_Y", y);
			ValueRelay.relay("getNewInstanceC_Z", z);
			ValueRelay.relay("getNewInstanceC_W", w);
			return new TestTup(x, y, z, w);
		}
	}
}
