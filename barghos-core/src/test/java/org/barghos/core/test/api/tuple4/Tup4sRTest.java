package org.barghos.core.test.api.tuple4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import org.barghos.core.api.testing.ValueRelay;
import org.barghos.core.api.tuple4.Tup4sR;

/**
 * This class provides component tests for the interface {@link Tup4sR}.
 * 
 * @author picatrix1899
 */
class Tup4sRTest
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
	 * This test ensures, that the function {@link Tup4sR#isValid()} returns
	 * the corrct values for different situations.
	 */
	@Test
	void isValidTest()
	{
		final short zero = (short)0;
		
		Tup4sR t = new TestTup(zero, zero, zero, zero);
		
		assertEquals(true, t.isValid());
		assertEquals(false, ValueRelay.get("getX", false));
		assertEquals(false, ValueRelay.get("getY", false));
		assertEquals(false, ValueRelay.get("getZ", false));
		assertEquals(false, ValueRelay.get("getW", false));
	}
	
	/**
	 * This test ensures, that the function {@link Tup4sR#isFinite()} returns
	 * the corrct values for different situations.
	 */
	@Test
	void isFiniteTest()
	{
		final short zero = (short)0;
		
		Tup4sR t = new TestTup(zero, zero, zero, zero);
		
		assertEquals(true, t.isFinite());
		assertEquals(false, ValueRelay.get("getX", false));
		assertEquals(false, ValueRelay.get("getY", false));
		assertEquals(false, ValueRelay.get("getZ", false));
		assertEquals(false, ValueRelay.get("getW", false));
	}
	
	/**
	 * This test ensures, that the function {@link Tup4sR#isZero()} returns the correct
	 * value based on the situation.
	 */
	@Test
	void isZeroExactTest()
	{	
		final short zero = (short)0;
		final short one = (short)1;
		
		Tup4sR t = new TestTup(zero, zero, zero, zero);
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
	 * This test ensures, that the function {@link Tup4sR#isZero(byte)} returns the correct
	 * value based on the situation.
	 */
	@Test
	void isZeroTest()
	{
		final short zero = (short)0;
		
		final int tolerance = 2;
		final short tol = (short)tolerance;
		
		for(int i = -tolerance - 1; i <= tolerance + 1; i++)
		{
			short v = (short)i;
			
			boolean b = Math.abs(i) <= tolerance;
			
			Tup4sR t = new TestTup(v, v, v, v);
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
	 * This test ensures, that the default implementation of the function {@link Tup4sR#getNewInstance(Tup4sR)} calls
	 * the function {@link Tup4sR#getNewInstance(short, short, short, short)} with the correct components.
	 */
	@Test
	void getNewInstance_TupleTest()
	{
		final short zero = (short)0;
		final short one = (short)1;
		final short two = (short)2;
		final short three = (short)3;
		final short four = (short)4;
		final short five = (short)5;
		
		Tup4sR t = new TestTup(one, one, one, one);
		
		t.getNewInstance(new TestTup(two, three, four, five));
		
		assertEquals(true, ValueRelay.get("getNewInstanceC", false));
		assertEquals(two, ValueRelay.get("getNewInstanceC_X", zero));
		assertEquals(three, ValueRelay.get("getNewInstanceC_Y", zero));
		assertEquals(four, ValueRelay.get("getNewInstanceC_Z", zero));
		assertEquals(five, ValueRelay.get("getNewInstanceC_W", zero));
		
		// Can't test for the result here, as the relaying and adopting of the values are implementation specific.
	}
	
	/**
	 * This test ensures, that the default implementation of the function {@link Tup4sR#getNewInstance(short)} calls
	 * the function {@link Tup4sR#getNewInstance(short, short, short, short)} with the correct components.
	 */
	@Test
	void getNewInstance_ValueTest()
	{
		final short zero = (short)0;
		final short one = (short)1;
		final short two = (short)2;
		
		Tup4sR t = new TestTup(one, one, one, one);
		
		t.getNewInstance(two);
		
		assertEquals(true, ValueRelay.get("getNewInstanceC", false));
		assertEquals(two, ValueRelay.get("getNewInstanceC_X", zero));
		assertEquals(two, ValueRelay.get("getNewInstanceC_Y", zero));
		assertEquals(two, ValueRelay.get("getNewInstanceC_Z", zero));
		assertEquals(two, ValueRelay.get("getNewInstanceC_W", zero));
		
		// Can't test for the result here, as the relaying and adopting of the values are implementation specific.
	}
	
	/**
	 * This class is a test implementation of the interface {@link Tup4sR}.
	 * 
	 * @author picatrix1899
	 */
	private static class TestTup implements Tup4sR
	{
		private final short x;
		private final short y;
		private final short z;
		private final short w;
		
		public TestTup(short x, short y, short z, short w)
		{
			this.x = x;
			this.y = y;
			this.z = z;
			this.w = w;
		}
		
		@Override
		public short getX()
		{
			ValueRelay.relayCall("getX");
			return this.x;
		}
		
		@Override
		public short getY()
		{
			ValueRelay.relayCall("getY");
			return this.y;
		}
		
		@Override
		public short getZ()
		{
			ValueRelay.relayCall("getZ");
			return this.z;
		}
		
		@Override
		public short getW()
		{
			ValueRelay.relayCall("getW");
			return this.w;
		}
		
		@Override
		public TestTup getNewInstance(short x, short y, short z, short w)
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