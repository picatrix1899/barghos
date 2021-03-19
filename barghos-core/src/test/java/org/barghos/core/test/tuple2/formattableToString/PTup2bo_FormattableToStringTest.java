package org.barghos.core.test.tuple2.formattableToString;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.barghos.core.tuple2.PTup2bo;

/**
 * This class provides component tests for the interface implementation
 * of {@link org.barghos.core.api.formatting.FormattableToString FormattableToString} in the
 * class {@link PTup2bo}.
 * 
 * @author picatrix1899
 */
class PTup2bo_FormattableToStringTest
{
	/**
	 * This test ensures, that the {@link PTup2bo#getValueMapping()} function returns the correct components.
	 */
	@Test
	void getValueMappingTest()
	{
		PTup2bo t = PTup2bo.gen(false, true);
		
		Map<String,Object> values = t.getValueMapping();
		
		assertNotNull(values);
		
		List<Map.Entry<String,Object>> l = new ArrayList<>(values.entrySet());
			
		assertEquals(2, l.size());
		assertEquals("x", l.get(0).getKey());
		assertEquals(false, l.get(0).getValue());
		assertEquals("y", l.get(1).getKey());
		assertEquals(true, l.get(1).getValue());
	}
}