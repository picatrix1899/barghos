package org.barghos.core.test.api.tuple2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import org.barghos.core.api.testing.ValueRelay;
import org.barghos.core.api.tuple2.Tup2dR;

/**
 * This class provides component tests for the interface {@link Tup2dR}.
 * 
 * @author picatrix1899
 */
class Tup2dRTest
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
	 * This test ensures, that the function {@link Tup2dR#isValid()} returns
	 * the corrct values for different situations.
	 */
	@Test
	void isValidTest()
	{
		Tup2dR t = new TestTup(0.0, 0.0);
		
		assertEquals(true, t.isValid());
		assertEquals(false, ValueRelay.get("getX", false));
		assertEquals(false, ValueRelay.get("getY", false));
	}
	
	/**
	 * This test ensures, that the function {@link Tup2dR#isFinite()} returns
	 * the corrct values for different situations.
	 */
	@Test
	void isFiniteTest()
	{
		final double[] values = new double[] {0.0, Double.NaN, Double.NEGATIVE_INFINITY, Double.POSITIVE_INFINITY};
		
		for(int i = 0; i < 4; i++)
		{
			double v = values[i];
			
			boolean b = i == 0;
			
			Tup2dR t = new TestTup(v, v);
			assertEquals(b, t.isFinite());
			
			t = new TestTup(v, 0.0);
			assertEquals(b, t.isFinite());
			
			t = new TestTup(0.0, v);
			assertEquals(b, t.isFinite());
		}
	}
	
	/**
	 * This test ensures, that the function {@link Tup2dR#isZero()} returns the correct
	 * value based on the situation.
	 */
	@Test
	void isZeroExactTest()
	{
		Tup2dR t = new TestTup(0.0, 0.0);
		assertEquals(true, t.isZero());
		
		t = new TestTup(1.0, 0.0);
		assertEquals(false, t.isZero());
		
		t = new TestTup(0.0, 1.0);
		assertEquals(false, t.isZero());
		
		t = new TestTup(1.0, 1.0);
		assertEquals(false, t.isZero());
	}
	
	/**
	 * This test ensures, that the function {@link Tup2dR#isZero(byte)} returns the correct
	 * value based on the situation.
	 */
	@Test
	void isZeroTest()
	{
		final int tolerance = 2;
		final double tol = (double)tolerance;
		
		for(int i = -tolerance - 1; i <= tolerance + 1; i++)
		{
			double v = (double)i;
			
			boolean b = Math.abs(i) <= tolerance;
			
			Tup2dR t = new TestTup(v, v);
			assertEquals(b, t.isZero(tol));
			
			t = new TestTup(v, 0.0);
			assertEquals(b, t.isZero(tol));
			
			t = new TestTup(0.0, v);
			assertEquals(b, t.isZero(tol));
		}
	}
	
	/**
	 * This test ensures, that the default implementation of the function {@link Tup2dR#getNewInstance(Tup2dR)} calls
	 * the function {@link Tup2dR#getNewInstance(double, double)} with the correct components.
	 */
	@Test
	void getNewInstance_TupleTest()
	{
		Tup2dR t = new TestTup(1.0, 1.0);
		
		t.getNewInstance(new TestTup(2.0, 3.0));
		
		assertEquals(true, ValueRelay.get("getNewInstanceC", false));
		assertEquals(2.0, ValueRelay.get("getNewInstanceC_X", 0.0));
		assertEquals(3.0, ValueRelay.get("getNewInstanceC_Y", 0.0));
		
		// Can't test for the result here, as the relaying and adopting of the values are implementation specific.
	}
	
	/**
	 * This test ensures, that the default implementation of the function {@link Tup2dR#getNewInstance(double)} calls
	 * the function {@link Tup2dR#getNewInstance(double, double)} with the correct components.
	 */
	@Test
	void getNewInstance_ValueTest()
	{
		Tup2dR t = new TestTup(1.0, 1.0);
		
		t.getNewInstance(2.0);
		
		assertEquals(true, ValueRelay.get("getNewInstanceC", false));
		assertEquals(2.0, ValueRelay.get("getNewInstanceC_X", 0.0));
		assertEquals(2.0, ValueRelay.get("getNewInstanceC_Y", 0.0));
		
		// Can't test for the result here, as the relaying and adopting of the values are implementation specific.
	}
	
	/**
	 * This class is a test implementation of the interface {@link Tup2dR}.
	 * 
	 * @author picatrix1899
	 */
	private static class TestTup implements Tup2dR
	{
		private final double x;
		private final double y;
		
		public TestTup(double x, double y)
		{
			this.x = x;
			this.y = y;
		}
		
		@Override
		public double getX()
		{
			ValueRelay.relayCall("getX");
			return this.x;
		}
		
		@Override
		public double getY()
		{
			ValueRelay.relayCall("getY");
			return this.y;
		}
		
		@Override
		public TestTup getNewInstance(double x, double y)
		{
			ValueRelay.relayCall("getNewInstanceC");
			ValueRelay.relay("getNewInstanceC_X", x);
			ValueRelay.relay("getNewInstanceC_Y", y);
			return new TestTup(x, y);
		}
	}
}
