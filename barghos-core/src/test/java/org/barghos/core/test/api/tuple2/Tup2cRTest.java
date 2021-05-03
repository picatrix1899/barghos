package org.barghos.core.test.api.tuple2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import org.barghos.core.api.testing.ValueRelay;
import org.barghos.core.api.tuple2.Tup2cR;

/**
 * This claa provides component tests for the interface {@link Tup2cR}.
 * 
 * @author picatrix1899
 */
class Tup2cRTest
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
	 * This test ensures, that the function {@link Tup2cR#isValid()} returns
	 * the corrct values for different situations.
	 */
	@Test
	void isValidTest()
	{
		Tup2cR t = new TestTup('a', 'a');
		
		assertEquals(true, t.isValid());
		assertEquals(false, ValueRelay.get("getX", false));
		assertEquals(false, ValueRelay.get("getY", false));
	}
	
	/**
	 * This test ensures, that the function {@link Tup2cR#isFinite()} returns
	 * the corrct values for different situations.
	 */
	@Test
	void isFiniteTest()
	{
		Tup2cR t = new TestTup('a', 'a');
		
		assertEquals(true, t.isFinite());
		assertEquals(false, ValueRelay.get("getX", false));
		assertEquals(false, ValueRelay.get("getY", false));
	}
	
	/**
	 * This test ensures, that the default implementation of the function {@link Tup2cR#getNewInstance(Tup2cR)} calls
	 * the function {@link Tup2cR#getNewInstance(char, char)} with the correct components.
	 */
	@Test
	void getNewInstance_TupleTest()
	{
		Tup2cR t = new TestTup('b', 'b');
		
		t.getNewInstance(new TestTup('c', 'd'));
		
		assertEquals(true, ValueRelay.get("getNewInstanceC", false));
		assertEquals('c', ValueRelay.get("getNewInstanceC_X", 'a'));
		assertEquals('d', ValueRelay.get("getNewInstanceC_Y", 'a'));
		
		// Can't test for the result here, as the relaying and adopting of the values are implementation specific.
	}
	
	/**
	 * This test ensures, that the default implementation of the function {@link Tup2cR#getNewInstance(char)} calls
	 * the function {@link Tup2cR#getNewInstance(char, char)} with the correct components.
	 */
	@Test
	void getNewInstance_ValueTest()
	{
		Tup2cR t = new TestTup('b', 'b');
		
		t.getNewInstance('c');
		
		assertEquals(true, ValueRelay.get("getNewInstanceC", false));
		assertEquals('c', ValueRelay.get("getNewInstanceC_X", 'a'));
		assertEquals('c', ValueRelay.get("getNewInstanceC_Y", 'a'));
		
		// Can't test for the result here, as the relaying and adopting of the values are implementation specific.
	}
	
	/**
	 * This class is a test implementation of the interface {@link Tup2cR}.
	 * 
	 * @author picatrix1899
	 */
	private static class TestTup implements Tup2cR
	{
		private final char x;
		private final char y;
		
		public TestTup(char x, char y)
		{
			this.x = x;
			this.y = y;
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
		public TestTup getNewInstance(char x, char y)
		{
			ValueRelay.relayCall("getNewInstanceC");
			ValueRelay.relay("getNewInstanceC_X", x);
			ValueRelay.relay("getNewInstanceC_Y", y);
			return new TestTup(x, y);
		}
	}
}