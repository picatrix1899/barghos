package org.barghos.core.test.tuple2.formattableToString;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.barghos.core.tuple2.PTup2f;

/**
 * This class provides component tests for the interface implementation
 * of {@link org.barghos.core.api.formatting.FormattableToString FormattableToString} in the
 * class {@link PTup2f}.
 * 
 * @author picatrix1899
 */
class PTup2f_FormattableToStringTest
{
	/**
	 * This test ensures, that the {@link PTup2f#getValueMapping()} function returns the correct components.
	 */
	@Test
	void getValueMappingTest()
	{
		PTup2f t = PTup2f.gen(1.1f, 2.2f);
		
		Map<String,Object> values = t.getValueMapping();
		
		assertNotNull(values);
		
		List<Map.Entry<String,Object>> l = new ArrayList<>(values.entrySet());
			
		assertEquals(2, l.size());
		assertEquals("x", l.get(0).getKey());
		assertEquals(1.1f, l.get(0).getValue());
		assertEquals("y", l.get(1).getKey());
		assertEquals(2.2f, l.get(1).getValue());
	}
}