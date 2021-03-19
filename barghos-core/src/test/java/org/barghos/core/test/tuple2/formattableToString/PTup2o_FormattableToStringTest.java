package org.barghos.core.test.tuple2.formattableToString;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.barghos.core.tuple2.PTup2o;

/**
 * This class provides component tests for the interface implementation
 * of {@link org.barghos.core.api.formatting.FormattableToString FormattableToString} in the
 * class {@link PTup2o}.
 * 
 * @author picatrix1899
 */
class PTup2o_FormattableToStringTest
{
	/**
	 * This test ensures, that the {@link PTup2o#getValueMapping()} function returns the correct components.
	 */
	@Test
	void getValueMappingTest()
	{
		PTup2o<Integer,String> t = PTup2o.gen(1, "arg2");
		
		Map<String,Object> values = t.getValueMapping();
		
		assertNotNull(values);
		
		List<Map.Entry<String,Object>> l = new ArrayList<>(values.entrySet());
			
		assertEquals(2, l.size());
		assertEquals("x", l.get(0).getKey());
		assertEquals(1, l.get(0).getValue());
		assertEquals("y", l.get(1).getKey());
		assertEquals("arg2", l.get(1).getValue());
	}
}