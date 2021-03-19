package org.barghos.core.test.tuple4.formattableToString;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.barghos.core.tuple4.Tup4c;

/**
 * This class provides component tests for the interface implementation
 * of {@link org.barghos.core.api.formatting.FormattableToString FormattableToString} in the
 * class {@link Tup4c}.
 * 
 * @author picatrix1899
 */
class Tup4c_FormattableToStringTest
{
	/**
	 * This test ensures, that the {@link Tup4c#getValueMapping()} function returns the correct components.
	 */
	@Test
	void getValueMappingTest()
	{
		Tup4c t = new Tup4c('a', 'b', 'c', 'd');
		
		Map<String,Object> values = t.getValueMapping();
		
		assertNotNull(values);
		
		List<Map.Entry<String,Object>> l = new ArrayList<>(values.entrySet());
			
		assertEquals(4, l.size());
		assertEquals("x", l.get(0).getKey());
		assertEquals('a', l.get(0).getValue());
		assertEquals("y", l.get(1).getKey());
		assertEquals('b', l.get(1).getValue());
		assertEquals("z", l.get(2).getKey());
		assertEquals('c', l.get(2).getValue());
		assertEquals("w", l.get(3).getKey());
		assertEquals('d', l.get(3).getValue());
	}
}