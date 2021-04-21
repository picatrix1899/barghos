package org.barghos.core.test.api.tuple2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import org.barghos.core.api.testing.ValueRelay;
import org.barghos.core.api.tuple2.Tup2sR;

/**
 * This class provides component tests for the interface {@link Tup2sR}.
 * 
 * @author picatrix1899
 */
class Tup2sRTest
{
	/**
	 * This test ensures, that the function {@link Tup2sR#isValid()} returns
	 * the corrct values for different situations.
	 */
	@Test
	void isValidTest()
	{
		Tup2sR t = new Tup2sR() {
			public short getX()
			{
				ValueRelay.relayCall("getX");
				return (short)0;
			}

			public short getY()
			{
				ValueRelay.relayCall("getY");
				return (short)0;
			}
		};
		
		assertEquals(true, t.isValid());
		assertEquals(false, ValueRelay.get("getX", false));
		assertEquals(false, ValueRelay.get("getY", false));
	}
	
	/**
	 * This test ensures, that the function {@link Tup2sR#isFinite()} returns
	 * the corrct values for different situations.
	 */
	@Test
	void isFiniteTest()
	{
		Tup2sR t = new Tup2sR() {
			public short getX()
			{
				ValueRelay.relayCall("getX");
				return (short)0;
			}

			public short getY()
			{
				ValueRelay.relayCall("getY");
				return (short)0;
			}
		};
		
		assertEquals(true, t.isFinite());
		assertEquals(false, ValueRelay.get("getX", false));
		assertEquals(false, ValueRelay.get("getY", false));
	}
	
	/**
	 * This test ensures, that the function {@link Tup2sR#isZero()} returns the correct
	 * value based on the situation.
	 */
	@Test
	void isZeroExactTest()
	{
		final short zero = (short)0;
		final short one = (short)1;
		
		Tup2sR t = new TestTup(zero, zero);
		assertEquals(true, t.isZero());
		
		t = new TestTup(one, zero);
		assertEquals(false, t.isZero());
		
		t = new TestTup(zero, one);
		assertEquals(false, t.isZero());
		
		t = new TestTup(one, one);
		assertEquals(false, t.isZero());
	}
	
	/**
	 * This test ensures, that the function {@link Tup2sR#isZero(byte)} returns the correct
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
			
			Tup2sR t = new TestTup(v, v);
			assertEquals(b, t.isZero(tol));
			
			t = new TestTup(v, zero);
			assertEquals(b, t.isZero(tol));
			
			t = new TestTup(zero, v);
			assertEquals(b, t.isZero(tol));
		}
	}
	
	/**
	 * This class is a test implementation of the interface {@link Tup2sR}.
	 * 
	 * @author picatrix1899
	 */
	private static class TestTup implements Tup2sR
	{
		private final short x;
		private final short y;
		
		public TestTup(short x, short y)
		{
			this.x = x;
			this.y = y;
		}
		
		@Override
		public short getX()
		{
			return this.x;
		}
		
		@Override
		public short getY()
		{
			return this.y;
		}
	}
}