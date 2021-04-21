package org.barghos.core.test.api.tuple4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import org.barghos.core.api.testing.ValueRelay;
import org.barghos.core.api.tuple4.Tup4boR;

/**
 * This claa provides component tests for the interface {@link Tup4boR}.
 * 
 * @author picatrix1899
 */
class Tup4boRTest
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
	 * This test ensures, that the function {@link Tup4boR#isValid()} returns
	 * the corrct values for different situations.
	 */
	@Test
	void isValidTest()
	{
		Tup4boR t = new Tup4boR() {
			public boolean getX()
			{
				ValueRelay.relayCall("getX");
				return false;
			}

			public boolean getY()
			{
				ValueRelay.relayCall("getY");
				return false;
			}
			
			public boolean getZ()
			{
				ValueRelay.relayCall("getZ");
				return false;
			}
			
			public boolean getW()
			{
				ValueRelay.relayCall("getW");
				return false;
			}
		};
		
		assertEquals(true, t.isValid());
		assertEquals(false, ValueRelay.get("getX", false));
		assertEquals(false, ValueRelay.get("getY", false));
		assertEquals(false, ValueRelay.get("getZ", false));
		assertEquals(false, ValueRelay.get("getW", false));
	}
}