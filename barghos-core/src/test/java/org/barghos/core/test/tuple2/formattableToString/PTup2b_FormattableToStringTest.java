package org.barghos.core.test.tuple2.formattableToString;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.barghos.core.tuple2.PTup2b;

/**
 * This class provides component tests for the interface implementation
 * of {@link org.barghos.core.api.formatting.FormattableToString FormattableToString} in the
 * class {@link PTup2b}.
 * 
 * @author picatrix1899
 */
class PTup2b_FormattableToStringTest
{
	/**
	 * This test ensures, that the {@link PTup2b#getValueMapping()} function returns the correct components.
	 */
	@Test
	void getValueMappingTest()
	{
		PTup2b t = PTup2b.gen((byte)1, (byte)2);
		
		Map<String,Object> values = t.getValueMapping();
		
		assertNotNull(values);
		
		List<Map.Entry<String,Object>> l = new ArrayList<>(values.entrySet());
			
		assertEquals(2, l.size());
		assertEquals("x", l.get(0).getKey());
		assertEquals((byte)1, l.get(0).getValue());
		assertEquals("y", l.get(1).getKey());
		assertEquals((byte)2, l.get(1).getValue());
	}
}