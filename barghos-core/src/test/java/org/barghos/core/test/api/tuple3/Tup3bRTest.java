package org.barghos.core.test.api.tuple3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import org.barghos.core.api.testing.ValueRelay;
import org.barghos.core.api.tuple3.Tup3bR;

/**
 * This class provides component tests for the interface {@link Tup3bR}.
 * 
 * @author picatrix1899
 */
class Tup3bRTest
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
	 * This test ensures, that the function {@link Tup3bR#isValid()} returns
	 * the corrct values for different situations.
	 */
	@Test
	void isValidTest()
	{
		final byte zero = (byte)0;
		
		Tup3bR t = new TestTup(zero, zero, zero);
		
		assertEquals(true, t.isValid());
		assertEquals(false, ValueRelay.get("getX", false));
		assertEquals(false, ValueRelay.get("getY", false));
		assertEquals(false, ValueRelay.get("getZ", false));
	}
	
	/**
	 * This test ensures, that the function {@link Tup3bR#isFinite()} returns
	 * the corrct values for different situations.
	 */
	@Test
	void isFiniteTest()
	{
		final byte zero = (byte)0;
		
		Tup3bR t = new TestTup(zero, zero, zero);
		
		assertEquals(true, t.isFinite());
		assertEquals(false, ValueRelay.get("getX", false));
		assertEquals(false, ValueRelay.get("getY", false));
		assertEquals(false, ValueRelay.get("getZ", false));
	}
	
	/**
	 * This test ensures, that the function {@link Tup3bR#isZero()} returns the correct
	 * value based on the situation.
	 */
	@Test
	void isZeroExactTest()
	{
		final byte zero = (byte)0;
		final byte one = (byte)1;
		
		Tup3bR t = new TestTup(zero, zero, zero);
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
	 * This test ensures, that the function {@link Tup3bR#isZero(byte)} returns the correct
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
			
			Tup3bR t = new TestTup(v, v, v);
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
	 * This test ensures, that the default implementation of the function {@link Tup3bR#getNewInstance(Tup3bR)} calls
	 * the function {@link Tup3bR#getNewInstance(byte, byte, byte)} with the correct components.
	 */
	@Test
	void getNewInstance_TupleTest()
	{
		final byte zero = (byte)0;
		final byte one = (byte)1;
		final byte two = (byte)2;
		final byte three = (byte)3;
		final byte four = (byte)4;
		
		Tup3bR t = new TestTup(one, one, one);
		
		t.getNewInstance(new TestTup(two, three, four));
		
		assertEquals(true, ValueRelay.get("getNewInstanceC", false));
		assertEquals(two, ValueRelay.get("getNewInstanceC_X", zero));
		assertEquals(three, ValueRelay.get("getNewInstanceC_Y", zero));
		assertEquals(four, ValueRelay.get("getNewInstanceC_Z", zero));
		
		// Can't test for the result here, as the relaying and adopting of the values are implementation specific.
	}
	
	/**
	 * This test ensures, that the default implementation of the function {@link Tup3bR#getNewInstance(byte)} calls
	 * the function {@link Tup3bR#getNewInstance(byte, byte, byte)} with the correct components.
	 */
	@Test
	void getNewInstance_ValueTest()
	{
		final byte zero = (byte)0;
		final byte one = (byte)1;
		final byte two = (byte)2;
		
		Tup3bR t = new TestTup(one, one, one);
		
		t.getNewInstance(two);
		
		assertEquals(true, ValueRelay.get("getNewInstanceC", false));
		assertEquals(two, ValueRelay.get("getNewInstanceC_X", zero));
		assertEquals(two, ValueRelay.get("getNewInstanceC_Y", zero));
		assertEquals(two, ValueRelay.get("getNewInstanceC_Z", zero));
		
		// Can't test for the result here, as the relaying and adopting of the values are implementation specific.
	}
	
	/**
	 * This class is a test implementation of the interface {@link Tup3bR}.
	 * 
	 * @author picatrix1899
	 */
	private static class TestTup implements Tup3bR
	{
		private final byte x;
		private final byte y;
		private final byte z;
		
		public TestTup(byte x, byte y, byte z)
		{
			this.x = x;
			this.y = y;
			this.z = z;
		}
		
		@Override
		public byte getX()
		{
			ValueRelay.relayCall("getX");
			return this.x;
		}
		
		@Override
		public byte getY()
		{
			ValueRelay.relayCall("getY");
			return this.y;
		}
		
		@Override
		public byte getZ()
		{
			ValueRelay.relayCall("getZ");
			return this.z;
		}
		
		@Override
		public TestTup getNewInstance(byte x, byte y, byte z)
		{
			ValueRelay.relayCall("getNewInstanceC");
			ValueRelay.relay("getNewInstanceC_X", x);
			ValueRelay.relay("getNewInstanceC_Y", y);
			ValueRelay.relay("getNewInstanceC_Z", z);
			return new TestTup(x, y, z);
		}
	}
}
