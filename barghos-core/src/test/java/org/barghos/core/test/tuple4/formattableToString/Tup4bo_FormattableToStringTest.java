package org.barghos.core.test.tuple4.formattableToString;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.barghos.core.tuple4.Tup4bo;

/**
 * This class provides component tests for the interface implementation
 * of {@link org.barghos.core.api.formatting.FormattableToString FormattableToString} in the
 * class {@link Tup4bo}.
 * 
 * @author picatrix1899
 */
class Tup4bo_FormattableToStringTest
{
	/**
	 * This test ensures, that the {@link Tup4bo#getValueMapping()} function returns the correct components.
	 */
	@Test
	void getValueMappingTest()
	{
		Tup4bo t = new Tup4bo(false, true, true, false);
		
		Map<String,Object> values = t.getValueMapping();
		
		assertNotNull(values);
		
		List<Map.Entry<String,Object>> l = new ArrayList<>(values.entrySet());
			
		assertEquals(4, l.size());
		assertEquals("x", l.get(0).getKey());
		assertEquals(false, l.get(0).getValue());
		assertEquals("y", l.get(1).getKey());
		assertEquals(true, l.get(1).getValue());
		assertEquals("z", l.get(2).getKey());
		assertEquals(true, l.get(2).getValue());
		assertEquals("w", l.get(3).getKey());
		assertEquals(false, l.get(3).getValue());
	}
}