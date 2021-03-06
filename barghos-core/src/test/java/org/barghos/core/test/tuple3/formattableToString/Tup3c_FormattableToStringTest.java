package org.barghos.core.test.tuple3.formattableToString;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.barghos.core.tuple3.Tup3c;

/**
 * This class provides component tests for the interface implementation
 * of {@link org.barghos.core.api.formatting.FormattableToString FormattableToString} in the
 * class {@link Tup3c}.
 * 
 * @author picatrix1899
 */
class Tup3c_FormattableToStringTest
{
	/**
	 * This test ensures, that the {@link Tup3c#getValueMapping()} function returns the correct components.
	 */
	@Test
	void getValueMappingTest()
	{
		Tup3c t = new Tup3c('a', 'b', 'c');
		
		Map<String,Object> values = t.getValueMapping();
		
		assertNotNull(values);
		
		List<Map.Entry<String,Object>> l = new ArrayList<>(values.entrySet());
			
		assertEquals(3, l.size());
		assertEquals("x", l.get(0).getKey());
		assertEquals('a', l.get(0).getValue());
		assertEquals("y", l.get(1).getKey());
		assertEquals('b', l.get(1).getValue());
		assertEquals("z", l.get(2).getKey());
		assertEquals('c', l.get(2).getValue());
	}
}