package org.barghos.core.test.api.tuple4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import org.barghos.core.api.testing.ValueRelay;
import org.barghos.core.api.tuple4.Tup4cR;

/**
 * This claa provides component tests for the interface {@link Tup4cR}.
 * 
 * @author picatrix1899
 */
class Tup4cRTest
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
	 * This test ensures, that the function {@link Tup4cR#isValid()} returns
	 * the corrct values for different situations.
	 */
	@Test
	void isValidTest()
	{
		Tup4cR t = new TestTup('a', 'a', 'a', 'a');
		
		assertEquals(true, t.isValid());
		assertEquals(false, ValueRelay.get("getX", false));
		assertEquals(false, ValueRelay.get("getY", false));
		assertEquals(false, ValueRelay.get("getZ", false));
		assertEquals(false, ValueRelay.get("getW", false));
	}
	
	/**
	 * This test ensures, that the function {@link Tup4cR#isFinite()} returns
	 * the corrct values for different situations.
	 */
	@Test
	void isFiniteTest()
	{
		Tup4cR t = new TestTup('a', 'a', 'a', 'a');
		
		assertEquals(true, t.isFinite());
		assertEquals(false, ValueRelay.get("getX", false));
		assertEquals(false, ValueRelay.get("getY", false));
		assertEquals(false, ValueRelay.get("getZ", false));
		assertEquals(false, ValueRelay.get("getW", false));
	}
	
	/**
	 * This test ensures, that the default implementation of the function {@link Tup4cR#getNewInstance(Tup4cR)} calls
	 * the function {@link Tup4cR#getNewInstance(char, char, char, char)} with the correct components.
	 */
	@Test
	void getNewInstance_TupleTest()
	{
		Tup4cR t = new TestTup('b', 'b', 'b', 'b');
		
		t.getNewInstance(new TestTup('c', 'd', 'e', 'f'));
		
		assertEquals(true, ValueRelay.get("getNewInstanceC", false));
		assertEquals('c', ValueRelay.get("getNewInstanceC_X", 'a'));
		assertEquals('d', ValueRelay.get("getNewInstanceC_Y", 'a'));
		assertEquals('e', ValueRelay.get("getNewInstanceC_Z", 'a'));
		assertEquals('f', ValueRelay.get("getNewInstanceC_W", 'a'));
		
		// Can't test for the result here, as the relaying and adopting of the values are implementation specific.
	}
	
	/**
	 * This test ensures, that the default implementation of the function {@link Tup4cR#getNewInstance(char)} calls
	 * the function {@link Tup4cR#getNewInstance(char, char, char, char)} with the correct components.
	 */
	@Test
	void getNewInstance_ValueTest()
	{
		Tup4cR t = new TestTup('b', 'b', 'b', 'b');
		
		t.getNewInstance('c');
		
		assertEquals(true, ValueRelay.get("getNewInstanceC", false));
		assertEquals('c', ValueRelay.get("getNewInstanceC_X", 'a'));
		assertEquals('c', ValueRelay.get("getNewInstanceC_Y", 'a'));
		assertEquals('c', ValueRelay.get("getNewInstanceC_Z", 'a'));
		assertEquals('c', ValueRelay.get("getNewInstanceC_W", 'a'));
		
		// Can't test for the result here, as the relaying and adopting of the values are implementation specific.
	}
	
	/**
	 * This class is a test implementation of the interface {@link Tup4cR}.
	 * 
	 * @author picatrix1899
	 */
	private static class TestTup implements Tup4cR
	{
		private final char x;
		private final char y;
		private final char z;
		private final char w;
		
		public TestTup(char x, char y, char z, char w)
		{
			this.x = x;
			this.y = y;
			this.z = z;
			this.w = w;
		}
		
		@Override
		public char getX()
		{
			ValueRelay.relayCall("getX");
			return this.x;
		}
		
		@Override
		public char getY()
		{
			ValueRelay.relayCall("getY");
			return this.y;
		}
		
		@Override
		public char getZ()
		{
			ValueRelay.relayCall("getZ");
			return this.z;
		}
		
		@Override
		public char getW()
		{
			ValueRelay.relayCall("getW");
			return this.w;
		}
		
		@Override
		public TestTup getNewInstance(char x, char y, char z, char w)
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