package org.barghos.core.test.api.tuple3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import org.barghos.core.api.testing.ValueRelay;
import org.barghos.core.api.tuple3.Tup3sR;

/**
 * This class provides component tests for the interface {@link Tup3sR}.
 * 
 * @author picatrix1899
 */
class Tup3sRTest
{
	/**
	 * This test ensures, that the function {@link Tup3sR#isValid()} returns
	 * the corrct values for different situations.
	 */
	@Test
	void isValidTest()
	{
		Tup3sR t = new Tup3sR() {
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
			
			public short getZ()
			{
				ValueRelay.relayCall("getZ");
				return (short)0;
			}
		};
		
		assertEquals(true, t.isValid());
		assertEquals(false, ValueRelay.get("getX", false));
		assertEquals(false, ValueRelay.get("getY", false));
		assertEquals(false, ValueRelay.get("getZ", false));
	}
	
	/**
	 * This test ensures, that the function {@link Tup3sR#isFinite()} returns
	 * the corrct values for different situations.
	 */
	@Test
	void isFiniteTest()
	{
		Tup3sR t = new Tup3sR() {
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
			
			public short getZ()
			{
				ValueRelay.relayCall("getZ");
				return (short)0;
			}
		};
		
		assertEquals(true, t.isFinite());
		assertEquals(false, ValueRelay.get("getX", false));
		assertEquals(false, ValueRelay.get("getY", false));
		assertEquals(false, ValueRelay.get("getZ", false));
	}
	
	/**
	 * This test ensures, that the function {@link Tup3sR#isZero()} returns the correct
	 * value based on the situation.
	 */
	@Test
	void isZeroExactTest()
	{
		final short zero = (short)0;
		final short one = (short)1;
		
		Tup3sR t = new TestTup(zero, zero, zero);
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
	 * This test ensures, that the function {@link Tup3sR#isZero(byte)} returns the correct
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
			
			Tup3sR t = new TestTup(v, v, v);
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
	 * This class is a test implementation of the interface {@link Tup3sR}.
	 * 
	 * @author picatrix1899
	 */
	private static class TestTup implements Tup3sR
	{
		private final short x;
		private final short y;
		private final short z;
		
		public TestTup(short x, short y, short z)
		{
			this.x = x;
			this.y = y;
			this.z = z;
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
		
		@Override
		public short getZ()
		{
			return this.z;
		}
	}
}