package org.barghos.core.test.api.tuple3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import org.barghos.core.api.testing.ValueRelay;
import org.barghos.core.api.tuple3.Tup3fR;

/**
 * This class provides component tests for the interface {@link Tup3fR}.
 * 
 * @author picatrix1899
 */
class Tup3fRTest
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
	 * This test ensures, that the function {@link Tup3fR#isValid()} returns
	 * the corrct values for different situations.
	 */
	@Test
	void isValidTest()
	{
		Tup3fR t = new TestTup(0.0f, 0.0f, 0.0f);
		
		assertEquals(true, t.isValid());
		assertEquals(false, ValueRelay.get("getX", false));
		assertEquals(false, ValueRelay.get("getY", false));
		assertEquals(false, ValueRelay.get("getZ", false));
	}
	
	/**
	 * This test ensures, that the function {@link Tup3fR#isFinite()} returns
	 * the corrct values for different situations.
	 */
	@Test
	void isFiniteTest()
	{
		final float[] values = new float[] {0.0f, Float.NaN, Float.NEGATIVE_INFINITY, Float.POSITIVE_INFINITY};
		
		for(int i = 0; i < 4; i++)
		{
			float v = values[i];
			
			boolean b = i == 0;
			
			Tup3fR t = new TestTup(v, v, v);
			assertEquals(b, t.isFinite());
			
			t = new TestTup(v, 0.0f, 0.0f);
			assertEquals(b, t.isFinite());
			
			t = new TestTup(0.0f, v, 0.0f);
			assertEquals(b, t.isFinite());
			
			t = new TestTup(0.0f, 0.0f, v);
			assertEquals(b, t.isFinite());
		}
	}
	
	/**
	 * This test ensures, that the function {@link Tup3fR#isZero()} returns the correct
	 * value based on the situation.
	 */
	@Test
	void isZeroExactTest()
	{
		Tup3fR t = new TestTup(0.0f, 0.0f, 0.0f);
		assertEquals(true, t.isZero());
		
		t = new TestTup(1.0f, 0.0f, 0.0f);
		assertEquals(false, t.isZero());
		
		t = new TestTup(0.0f, 1.0f, 0.0f);
		assertEquals(false, t.isZero());
		
		t = new TestTup(0.0f, 0.0f, 1.0f);
		assertEquals(false, t.isZero());

		t = new TestTup(1.0f, 1.0f, 1.0f);
		assertEquals(false, t.isZero());
	}
	
	/**
	 * This test ensures, that the function {@link Tup3fR#isZero(float)} returns the correct
	 * value based on the situation.
	 */
	@Test
	void isZeroTest()
	{
		final int tolerance = 2;
		final float tol = (float)tolerance;
		
		for(int i = -tolerance - 1; i <= tolerance + 1; i++)
		{
			float v = (float)i;
			
			boolean b = Math.abs(i) <= tolerance;
			
			Tup3fR t = new TestTup(v, v, v);
			assertEquals(b, t.isZero(tol));
			
			t = new TestTup(v, 0.0f, 0.0f);
			assertEquals(b, t.isZero(tol));
			
			t = new TestTup(0.0f, v, 0.0f);
			assertEquals(b, t.isZero(tol));
			
			t = new TestTup(0.0f, 0.0f, v);
			assertEquals(b, t.isZero(tol));
		}
	}
	
	/**
	 * This test ensures, that the default implementation of the function {@link Tup3fR#getNewInstance(Tup3fR)} calls
	 * the function {@link Tup3fR#getNewInstance(float, float, float)} with the correct components.
	 */
	@Test
	void getNewInstance_TupleTest()
	{
		Tup3fR t = new TestTup(0.0f, 0.0f, 0.0f);
		
		t.getNewInstance(new TestTup(1.0f, 2.0f, 3.0f));
		
		assertEquals(true, ValueRelay.get("getNewInstanceC", false));
		assertEquals(1.0f, ValueRelay.get("getNewInstanceC_X", 0.0f));
		assertEquals(2.0f, ValueRelay.get("getNewInstanceC_Y", 0.0f));
		assertEquals(3.0f, ValueRelay.get("getNewInstanceC_Z", 0.0f));
		
		// Can't test for the result here, as the relaying and adopting of the values are implementation specific.
	}
	
	/**
	 * This test ensures, that the default implementation of the function {@link Tup3fR#getNewInstance(float)} calls
	 * the function {@link Tup3fR#getNewInstance(float, float, float)} with the correct components.
	 */
	@Test
	void getNewInstance_ValueTest()
	{
		Tup3fR t = new TestTup(0.0f, 0.0f, 0.0f);
		
		t.getNewInstance(1.0f);
		
		assertEquals(true, ValueRelay.get("getNewInstanceC", false));
		assertEquals(1.0f, ValueRelay.get("getNewInstanceC_X", 0.0f));
		assertEquals(1.0f, ValueRelay.get("getNewInstanceC_Y", 0.0f));
		assertEquals(1.0f, ValueRelay.get("getNewInstanceC_Z", 0.0f));
		
		// Can't test for the result here, as the relaying and adopting of the values are implementation specific.
	}
	
	/**
	 * This class is a test implementation of the interface {@link Tup3fR}.
	 * 
	 * @author picatrix1899
	 */
	private static class TestTup implements Tup3fR
	{
		private final float x;
		private final float y;
		private final float z;
		
		public TestTup(float x, float y, float z)
		{
			this.x = x;
			this.y = y;
			this.z = z;
		}
		
		@Override
		public float getX()
		{
			ValueRelay.relayCall("getX");
			return this.x;
		}
		
		@Override
		public float getY()
		{
			ValueRelay.relayCall("getY");
			return this.y;
		}
		
		@Override
		public float getZ()
		{
			ValueRelay.relayCall("getZ");
			return this.z;
		}
		
		@Override
		public TestTup getNewInstance(float x, float y, float z)
		{
			ValueRelay.relayCall("getNewInstanceC");
			ValueRelay.relay("getNewInstanceC_X", x);
			ValueRelay.relay("getNewInstanceC_Y", y);
			ValueRelay.relay("getNewInstanceC_Z", z);
			return new TestTup(x, y, z);
		}
	}
}