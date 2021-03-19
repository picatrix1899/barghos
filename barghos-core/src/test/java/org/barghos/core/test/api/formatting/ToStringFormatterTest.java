package org.barghos.core.test.api.formatting;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import java.util.LinkedHashMap;
import java.util.Map;

import org.barghos.core.api.formatting.ToStringFormatter;

/**
 * This class provides component tests for the interface {@link ToStringFormatter}
 * 
 * @author picatrix1899
 */
class ToStringFormatterTest
{
	/**
	 * This test ensures, that the function {@link ToStringFormatter#format(Object, java.util.Map)}
	 * calls the function {@link ToStringFormatter#format(Object, java.util.Map, String)} with the correct
	 * parameters.
	 */
	@Test
	void formatTest()
	{
		final String originalObj = "";
		final Map<String,Object> originalValues = new LinkedHashMap<>();
		
		ToStringFormatter formatter = new ToStringFormatter() {
			public String format(Object obj, Map<String,Object> values, String customName)
			{
				assertSame(originalObj, obj);
				assertSame(originalValues, values);
				assertNull(customName);
				
				return "test";
			}
		};
		
		String result = formatter.format(originalObj, originalValues);
		
		assertEquals("test", result);
	}
}
