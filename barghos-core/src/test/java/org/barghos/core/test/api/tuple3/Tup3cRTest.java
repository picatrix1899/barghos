package org.barghos.core.test.api.tuple3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import org.barghos.core.api.testing.ValueRelay;
import org.barghos.core.api.tuple3.Tup3cR;

/**
 * This claa provides component tests for the interface {@link Tup3cR}.
 * 
 * @author picatrix1899
 */
class Tup3cRTest
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
	 * This test ensures, that the function {@link Tup3cR#isValid()} returns
	 * the corrct values for different situations.
	 */
	@Test
	void isValidTest()
	{
		Tup3cR t = new TestTup('a', 'a', 'a');
		
		assertEquals(true, t.isValid());
		assertEquals(false, ValueRelay.get("getX", false));
		assertEquals(false, ValueRelay.get("getY", false));
		assertEquals(false, ValueRelay.get("getZ", false));
	}
	
	/**
	 * This test ensures, that the function {@link Tup3cR#isFinite()} returns
	 * the corrct values for different situations.
	 */
	@Test
	void isFiniteTest()
	{
		Tup3cR t = new TestTup('a', 'a', 'a');
		
		assertEquals(true, t.isFinite());
		assertEquals(false, ValueRelay.get("getX", false));
		assertEquals(false, ValueRelay.get("getY", false));
		assertEquals(false, ValueRelay.get("getZ", false));
	}
	
	/**
	 * This test ensures, that the default implementation of the function {@link Tup3cR#getNewInstance(Tup3cR)} calls
	 * the function {@link Tup3cR#getNewInstance(char, char, char)} with the correct components.
	 */
	@Test
	void getNewInstance_TupleTest()
	{
		Tup3cR t = new TestTup('b', 'b', 'b');
		
		t.getNewInstance(new TestTup('c', 'd', 'e'));
		
		assertEquals(true, ValueRelay.get("getNewInstanceC", false));
		assertEquals('c', ValueRelay.get("getNewInstanceC_X", 'a'));
		assertEquals('d', ValueRelay.get("getNewInstanceC_Y", 'a'));
		assertEquals('e', ValueRelay.get("getNewInstanceC_Z", 'a'));
		
		// Can't test for the result here, as the relaying and adopting of the values are implementation specific.
	}
	
	/**
	 * This test ensures, that the default implementation of the function {@link Tup3cR#getNewInstance(char)} calls
	 * the function {@link Tup3cR#getNewInstance(char, char, char)} with the correct components.
	 */
	@Test
	void getNewInstance_ValueTest()
	{
		Tup3cR t = new TestTup('a', 'a', 'a');
		
		t.getNewInstance('b');
		
		assertEquals(true, ValueRelay.get("getNewInstanceC", false));
		assertEquals('b', ValueRelay.get("getNewInstanceC_X", 'a'));
		assertEquals('b', ValueRelay.get("getNewInstanceC_Y", 'a'));
		assertEquals('b', ValueRelay.get("getNewInstanceC_Z", 'a'));
		
		// Can't test for the result here, as the relaying and adopting of the values are implementation specific.
	}
	
	/**
	 * This class is a test implementation of the interface {@link Tup3bR}.
	 * 
	 * @author picatrix1899
	 */
	private static class TestTup implements Tup3cR
	{
		private final char x;
		private final char y;
		private final char z;
		
		public TestTup(char x, char y, char z)
		{
			this.x = x;
			this.y = y;
			this.z = z;
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
		public TestTup getNewInstance(char x, char y, char z)
		{
			ValueRelay.relayCall("getNewInstanceC");
			ValueRelay.relay("getNewInstanceC_X", x);
			ValueRelay.relay("getNewInstanceC_Y", y);
			ValueRelay.relay("getNewInstanceC_Z", z);
			return new TestTup(x, y, z);
		}
	}
}