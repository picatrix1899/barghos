package org.barghos.core.test.tuple3.formattableToString;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.barghos.core.tuple3.Tup3str;

/**
 * This class provides component tests for the interface implementation
 * of {@link org.barghos.core.api.formatting.FormattableToString FormattableToString} in the
 * class {@link Tup3str}.
 * 
 * @author picatrix1899
 */
class Tup3str_FormattableToStringTest
{
	/**
	 * This test ensures, that the {@link Tup3str#getValueMapping()} function returns the correct components.
	 */
	@Test
	void getValueMappingTest()
	{
		Tup3str t = new Tup3str("arg1", "arg2", "arg3");
		
		Map<String,Object> values = t.getValueMapping();
		
		assertNotNull(values);
		
		List<Map.Entry<String,Object>> l = new ArrayList<>(values.entrySet());
			
		assertEquals(3, l.size());
		assertEquals("x", l.get(0).getKey());
		assertEquals("arg1", l.get(0).getValue());
		assertEquals("y", l.get(1).getKey());
		assertEquals("arg2", l.get(1).getValue());
		assertEquals("z", l.get(2).getKey());
		assertEquals("arg3", l.get(2).getValue());
	}
}