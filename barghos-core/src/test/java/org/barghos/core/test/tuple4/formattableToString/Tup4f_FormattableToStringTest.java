package org.barghos.core.test.tuple4.formattableToString;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.barghos.core.tuple4.Tup4f;

/**
 * This class provides component tests for the interface implementation
 * of {@link org.barghos.core.api.formatting.FormattableToString FormattableToString} in the
 * class {@link Tup4f}.
 * 
 * @author picatrix1899
 */
class Tup4f_FormattableToStringTest
{
	/**
	 * This test ensures, that the {@link Tup4f#getValueMapping()} function returns the correct components.
	 */
	@Test
	void getValueMappingTest()
	{
		Tup4f t = new Tup4f(1.1f, 2.2f, 3.3f, 4.4f);
		
		Map<String,Object> values = t.getValueMapping();
		
		assertNotNull(values);
		
		List<Map.Entry<String,Object>> l = new ArrayList<>(values.entrySet());
			
		assertEquals(4, l.size());
		assertEquals("x", l.get(0).getKey());
		assertEquals(1.1f, l.get(0).getValue());
		assertEquals("y", l.get(1).getKey());
		assertEquals(2.2f, l.get(1).getValue());
		assertEquals("z", l.get(2).getKey());
		assertEquals(3.3f, l.get(2).getValue());
		assertEquals("w", l.get(3).getKey());
		assertEquals(4.4f, l.get(3).getValue());
	}
}