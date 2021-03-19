package org.barghos.core.test.tuple2.formattableToString;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.barghos.core.tuple2.Tup2bigi;

/**
 * This class provides component tests for the interface implementation
 * of {@link org.barghos.core.api.formatting.FormattableToString FormattableToString} in the
 * class {@link Tup2bigi}.
 * 
 * @author picatrix1899
 */
class Tup2bigi_FormattableToStringTest
{
	/**
	 * This test ensures, that the {@link Tup2bigi#getValueMapping()} function returns the correct components.
	 */
	@Test
	void getValueMappingTest()
	{
		Tup2bigi t = new Tup2bigi(BigInteger.valueOf(1), BigInteger.valueOf(2));
		
		Map<String,Object> values = t.getValueMapping();
		
		assertNotNull(values);
		
		List<Map.Entry<String,Object>> l = new ArrayList<>(values.entrySet());
			
		assertEquals(2, l.size());
		assertEquals("x", l.get(0).getKey());
		assertEquals(BigInteger.valueOf(1), l.get(0).getValue());
		assertEquals("y", l.get(1).getKey());
		assertEquals(BigInteger.valueOf(2), l.get(1).getValue());
	}
}