package org.barghos.core.test.tuple3.formattableToString;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.barghos.core.tuple3.Tup3l;

/**
 * This class provides component tests for the interface implementation
 * of {@link org.barghos.core.api.formatting.FormattableToString FormattableToString} in the
 * class {@link Tup3l}.
 * 
 * @author picatrix1899
 */
class Tup3l_FormattableToStringTest
{
	/**
	 * This test ensures, that the {@link Tup3l#getValueMapping()} function returns the correct components.
	 */
	@Test
	void getValueMappingTest()
	{
		Tup3l t = new Tup3l(1l, 2l, 3l);
		
		Map<String,Object> values = t.getValueMapping();
		
		assertNotNull(values);
		
		List<Map.Entry<String,Object>> l = new ArrayList<>(values.entrySet());
			
		assertEquals(3, l.size());
		assertEquals("x", l.get(0).getKey());
		assertEquals(1l, l.get(0).getValue());
		assertEquals("y", l.get(1).getKey());
		assertEquals(2l, l.get(1).getValue());
		assertEquals("z", l.get(2).getKey());
		assertEquals(3l, l.get(2).getValue());
	}
}