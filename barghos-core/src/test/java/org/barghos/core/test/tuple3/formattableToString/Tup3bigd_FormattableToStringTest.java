package org.barghos.core.test.tuple3.formattableToString;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.barghos.core.tuple3.Tup3bigd;

/**
 * This class provides component tests for the interface implementation
 * of {@link org.barghos.core.api.formatting.FormattableToString FormattableToString} in the
 * class {@link Tup3bigd}.
 * 
 * @author picatrix1899
 */
class Tup3bigd_FormattableToStringTest
{
	/**
	 * This test ensures, that the {@link Tup3bigd#getValueMapping()} function returns the correct components.
	 */
	@Test
	void getValueMappingTest()
	{
		Tup3bigd t = new Tup3bigd(BigDecimal.valueOf(1.1), BigDecimal.valueOf(2.2), BigDecimal.valueOf(3.3));
		
		Map<String,Object> values = t.getValueMapping();
		
		assertNotNull(values);
		
		List<Map.Entry<String,Object>> l = new ArrayList<>(values.entrySet());
			
		assertEquals(3, l.size());
		assertEquals("x", l.get(0).getKey());
		assertEquals(BigDecimal.valueOf(1.1), l.get(0).getValue());
		assertEquals("y", l.get(1).getKey());
		assertEquals(BigDecimal.valueOf(2.2), l.get(1).getValue());
		assertEquals("z", l.get(2).getKey());
		assertEquals(BigDecimal.valueOf(3.3), l.get(2).getValue());
	}
}