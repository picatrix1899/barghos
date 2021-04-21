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
		Tup2cR t = new Tup2cR() {
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
		};
		
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
		Tup2cR t = new Tup2cR() {
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
		};
		
		assertEquals(true, t.isFinite());
		assertEquals(false, ValueRelay.get("getX", false));
		assertEquals(false, ValueRelay.get("getY", false));
	}
}