package org.barghos.core.test.tuple2.formattableToString;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.barghos.core.tuple2.Tup2c;

/**
 * This class provides component tests for the interface implementation
 * of {@link org.barghos.core.api.formatting.FormattableToString FormattableToString} in the
 * class {@link Tup2c}.
 * 
 * @author picatrix1899
 */
class Tup2c_FormattableToStringTest
{
	/**
	 * This test ensures, that the {@link Tup2c#getValueMapping()} function returns the correct components.
	 */
	@Test
	void getValueMappingTest()
	{
		Tup2c t = new Tup2c('a', 'b');
		
		Map<String,Object> values = t.getValueMapping();
		
		assertNotNull(values);
		
		List<Map.Entry<String,Object>> l = new ArrayList<>(values.entrySet());
			
		assertEquals(2, l.size());
		assertEquals("x", l.get(0).getKey());
		assertEquals('a', l.get(0).getValue());
		assertEquals("y", l.get(1).getKey());
		assertEquals('b', l.get(1).getValue());
	}
}