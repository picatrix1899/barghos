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
		Tup3cR t = new Tup3cR() {
			public char getX()
			{
				ValueRelay.relayCall("getX");
				return 'a';
			}

			public char getY()
			{
				ValueRelay.relayCall("getY");
				return 'a';
			}
			
			public char getZ()
			{
				ValueRelay.relayCall("getZ");
				return 'a';
			}
		};
		
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
		Tup3cR t = new Tup3cR() {
			public char getX()
			{
				ValueRelay.relayCall("getX");
				return 'a';
			}

			public char getY()
			{
				ValueRelay.relayCall("getY");
				return 'a';
			}
			
			public char getZ()
			{
				ValueRelay.relayCall("getZ");
				return 'a';
			}
		};
		
		assertEquals(true, t.isFinite());
		assertEquals(false, ValueRelay.get("getX", false));
		assertEquals(false, ValueRelay.get("getY", false));
		assertEquals(false, ValueRelay.get("getZ", false));
	}
}