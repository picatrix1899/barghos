package org.barghos.core.test.tuple4.formattableToString;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.barghos.core.tuple4.PTup4obj;

/**
 * This class provides component tests for the interface implementation
 * of {@link org.barghos.core.api.formatting.FormattableToString FormattableToString} in the
 * class {@link PTup4obj}.
 * 
 * @author picatrix1899
 */
class PTup4obj_FormattableToStringTest
{
	/**
	 * This test ensures, that the {@link PTup4obj#getValueMapping()} function returns the correct components.
	 */
	@Test
	void getValueMappingTest()
	{
		PTup4obj t = PTup4obj.gen(1, "arg2", 3.3, 'd');
		
		Map<String,Object> values = t.getValueMapping();
		
		assertNotNull(values);
		
		List<Map.Entry<String,Object>> l = new ArrayList<>(values.entrySet());
			
		assertEquals(4, l.size());
		assertEquals("x", l.get(0).getKey());
		assertEquals(1, l.get(0).getValue());
		assertEquals("y", l.get(1).getKey());
		assertEquals("arg2", l.get(1).getValue());
		assertEquals("z", l.get(2).getKey());
		assertEquals(3.3, l.get(2).getValue());
		assertEquals("w", l.get(3).getKey());
		assertEquals('d', l.get(3).getValue());
	}
}