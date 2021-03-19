package org.barghos.core.test.tuple4.formattableToString;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.barghos.core.tuple4.PTup4bigd;

/**
 * This class provides component tests for the interface implementation
 * of {@link org.barghos.core.api.formatting.FormattableToString FormattableToString} in the
 * class {@link PTup4bigd}.
 * 
 * @author picatrix1899
 */
class PTup4bigd_FormattableToStringTest
{
	/**
	 * This test ensures, that the {@link PTup4bigd#getValueMapping()} function returns the correct components.
	 */
	@Test
	void getValueMappingTest()
	{
		PTup4bigd t = PTup4bigd.gen(BigDecimal.valueOf(1.1), BigDecimal.valueOf(2.2), BigDecimal.valueOf(3.3), BigDecimal.valueOf(4.4));
		
		Map<String,Object> values = t.getValueMapping();
		
		assertNotNull(values);
		
		List<Map.Entry<String,Object>> l = new ArrayList<>(values.entrySet());
			
		assertEquals(4, l.size());
		assertEquals("x", l.get(0).getKey());
		assertEquals(BigDecimal.valueOf(1.1), l.get(0).getValue());
		assertEquals("y", l.get(1).getKey());
		assertEquals(BigDecimal.valueOf(2.2), l.get(1).getValue());
		assertEquals("z", l.get(2).getKey());
		assertEquals(BigDecimal.valueOf(3.3), l.get(2).getValue());
		assertEquals("w", l.get(3).getKey());
		assertEquals(BigDecimal.valueOf(4.4), l.get(3).getValue());
	}
}