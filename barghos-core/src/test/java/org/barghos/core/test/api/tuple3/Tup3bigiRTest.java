package org.barghos.core.test.api.tuple3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import java.math.BigInteger;

import org.barghos.core.api.testing.ValueRelay;
import org.barghos.core.api.tuple3.Tup3bigiR;

/**
 * This class provides component tests for the interface {@link Tup3bigiR}.
 * 
 * @author picatrix1899
 */
class Tup3bigiRTest
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
	 * This test ensures, that the function {@link Tup3bigiR#isValid()} returns
	 * the corrct values for different situations.
	 */
	@Test
	void isValidTest()
	{
		final BigInteger one = BigInteger.ONE;
		
		Tup3bigiR t = new TestTup(null, null, null);
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
	 * This test ensures, that the function {@link Tup3bigiR#isFinite()} returns
	 * the corrct values for different situations.
	 */
	@Test
	void isFiniteTest()
	{
		final BigInteger zero = BigInteger.ZERO;
		
		Tup3bigiR t = new TestTup(zero, zero, zero);
		
		assertEquals(true, t.isFinite());
		assertEquals(false, ValueRelay.get("getX", false));
		assertEquals(false, ValueRelay.get("getY", false));
		assertEquals(false, ValueRelay.get("getZ", false));
	}
	
	/**
	 * This test ensures, that the function {@link Tup3bigiR#isZero()} returns the correct
	 * value based on the situation.
	 */
	@Test
	void isZeroExactTest()
	{
		final BigInteger zero = BigInteger.ZERO;
		final BigInteger one = BigInteger.ONE;
		
		Tup3bigiR t = new TestTup(zero, zero, zero);
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
	 * This test ensures, that the function {@link Tup3bigiR#isZero(BigInteger)} returns the correct
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
			
			Tup3bigiR t = new TestTup(v, v, v);
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
	 * This test ensures, that the default implementation of the function {@link Tup3bigiR#getNewInstance(Tup3bigiR)} calls
	 * the function {@link Tup3bigiR#getNewInstance(BigInteger, BigInteger, BigInteger)} with the correct components.
	 */
	@Test
	void getNewInstance_TupleTest()
	{
		final BigInteger zero = BigInteger.ZERO;
		final BigInteger one = BigInteger.ONE;
		final BigInteger two = BigInteger.valueOf(2);
		final BigInteger three = BigInteger.valueOf(3);
		final BigInteger four = BigInteger.valueOf(4);
		
		Tup3bigiR t = new TestTup(one, one, one);
		
		t.getNewInstance(new TestTup(two, three, four));
		
		assertEquals(true, ValueRelay.get("getNewInstanceC", false));
		assertEquals(two, ValueRelay.get("getNewInstanceC_X", zero));
		assertEquals(three, ValueRelay.get("getNewInstanceC_Y", zero));
		assertEquals(four, ValueRelay.get("getNewInstanceC_Z", zero));
		
		// Can't test for the result here, as the relaying and adopting of the values are implementation specific.
	}
	
	/**
	 * This test ensures, that the default implementation of the function {@link Tup3bigiR#getNewInstance(BigInteger)} calls
	 * the function {@link Tup3bigiR#getNewInstance(BigInteger, BigInteger, BigInteger)} with the correct components.
	 */
	@Test
	void getNewInstance_ValueTest()
	{
		final BigInteger zero = BigInteger.ZERO;
		final BigInteger one = BigInteger.ONE;
		final BigInteger two = BigInteger.valueOf(2);

		Tup3bigiR t = new TestTup(one, one, one);
		
		t.getNewInstance(two);
		
		assertEquals(true, ValueRelay.get("getNewInstanceC", false));
		assertEquals(two, ValueRelay.get("getNewInstanceC_X", zero));
		assertEquals(two, ValueRelay.get("getNewInstanceC_Y", zero));
		assertEquals(two, ValueRelay.get("getNewInstanceC_Z", zero));
		
		// Can't test for the result here, as the relaying and adopting of the values are implementation specific.
	}
	
	/**
	 * This class is a test implementation of the interface {@link Tup3bigiR}.
	 * 
	 * @author picatrix1899
	 */
	private static class TestTup implements Tup3bigiR
	{
		private final BigInteger x;
		private final BigInteger y;
		private final BigInteger z;
		
		public TestTup(BigInteger x, BigInteger y, BigInteger z)
		{
			this.x = x;
			this.y = y;
			this.z = z;
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
		public TestTup getNewInstance(BigInteger x, BigInteger y, BigInteger z)
		{
			ValueRelay.relayCall("getNewInstanceC");
			ValueRelay.relay("getNewInstanceC_X", x);
			ValueRelay.relay("getNewInstanceC_Y", y);
			ValueRelay.relay("getNewInstanceC_Z", z);
			return new TestTup(x, y, z);
		}
	}
}
