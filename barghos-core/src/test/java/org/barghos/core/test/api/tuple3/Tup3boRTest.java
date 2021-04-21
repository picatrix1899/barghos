package org.barghos.core.test.api.tuple3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import org.barghos.core.api.testing.ValueRelay;
import org.barghos.core.api.tuple3.Tup3boR;

/**
 * This claa provides component tests for the interface {@link Tup3boR}.
 * 
 * @author picatrix1899
 */
class Tup3boRTest
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
	 * This test ensures, that the function {@link Tup3boR#isValid()} returns
	 * the corrct values for different situations.
	 */
	@Test
	void isValidTest()
	{
		Tup3boR t = new Tup3boR() {
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
		};
		
		assertEquals(true, t.isValid());
		assertEquals(false, ValueRelay.get("getX", false));
		assertEquals(false, ValueRelay.get("getY", false));
		assertEquals(false, ValueRelay.get("getZ", false));
	}
}