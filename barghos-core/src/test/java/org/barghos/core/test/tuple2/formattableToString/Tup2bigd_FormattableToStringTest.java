package org.barghos.core.test.tuple2.formattableToString;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.barghos.core.tuple2.Tup2bigd;

/**
 * This class provides component tests for the interface implementation
 * of {@link org.barghos.core.api.formatting.FormattableToString FormattableToString} in the
 * class {@link Tup2bigd}.
 * 
 * @author picatrix1899
 */
class Tup2bigd_FormattableToStringTest
{
	/**
	 * This test ensures, that the {@link Tup2bigd#getValueMapping()} function returns the correct components.
	 */
	@Test
	void getValueMappingTest()
	{
		Tup2bigd t = new Tup2bigd(BigDecimal.valueOf(1.1), BigDecimal.valueOf(2.2));
		
		Map<String,Object> values = t.getValueMapping();
		
		assertNotNull(values);
		
		List<Map.Entry<String,Object>> l = new ArrayList<>(values.entrySet());
			
		assertEquals(2, l.size());
		assertEquals("x", l.get(0).getKey());
		assertEquals(BigDecimal.valueOf(1.1), l.get(0).getValue());
		assertEquals("y", l.get(1).getKey());
		assertEquals(BigDecimal.valueOf(2.2), l.get(1).getValue());
	}
}