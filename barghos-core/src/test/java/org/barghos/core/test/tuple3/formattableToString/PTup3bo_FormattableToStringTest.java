package org.barghos.core.test.tuple3.formattableToString;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.barghos.core.tuple3.PTup3bo;

/**
 * This class provides component tests for the interface implementation
 * of {@link org.barghos.core.api.formatting.FormattableToString FormattableToString} in the
 * class {@link PTup3bo}.
 * 
 * @author picatrix1899
 */
class PTup3bo_FormattableToStringTest
{
	/**
	 * This test ensures, that the {@link PTup3bo#getValueMapping()} function returns the correct components.
	 */
	@Test
	void getValueMappingTest()
	{
		PTup3bo t = PTup3bo.gen(false, true, false);
		
		Map<String,Object> values = t.getValueMapping();
		
		assertNotNull(values);
		
		List<Map.Entry<String,Object>> l = new ArrayList<>(values.entrySet());
			
		assertEquals(3, l.size());
		assertEquals("x", l.get(0).getKey());
		assertEquals(false, l.get(0).getValue());
		assertEquals("y", l.get(1).getKey());
		assertEquals(true, l.get(1).getValue());
		assertEquals("z", l.get(2).getKey());
		assertEquals(false, l.get(2).getValue());
	}
}