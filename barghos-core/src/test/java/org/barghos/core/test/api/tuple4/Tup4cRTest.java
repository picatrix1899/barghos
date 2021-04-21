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
		Tup4cR t = new Tup4cR() {
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
			
			public char getW()
			{
				ValueRelay.relayCall("getW");
				return 'a';
			}
		};
		
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
		Tup4cR t = new Tup4cR() {
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
			
			public char getW()
			{
				ValueRelay.relayCall("getW");
				return 'a';
			}
		};
		
		assertEquals(true, t.isFinite());
		assertEquals(false, ValueRelay.get("getX", false));
		assertEquals(false, ValueRelay.get("getY", false));
		assertEquals(false, ValueRelay.get("getZ", false));
		assertEquals(false, ValueRelay.get("getW", false));
	}
}