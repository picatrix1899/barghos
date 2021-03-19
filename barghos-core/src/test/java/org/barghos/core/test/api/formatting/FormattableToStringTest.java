package org.barghos.core.test.api.formatting;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.barghos.core.Barghos;
import org.barghos.core.api.formatting.FormattableToString;
import org.barghos.core.api.formatting.ToStringFormatter;

/**
 * This class provides component tests for the interface {@link FormattableToString}.
 * 
 * @author picatrix1899
 */
class FormattableToStringTest
{
	/**
	 * This test ensures, that the default implementation of the {@link FormattableToString#getDefaultToStringFormatter()}
	 * function returns the formatter instance stored in {@link Barghos#DEFAULT_TO_STRING_FORMATTER}.
	 */
	@Test
	void getDefaultToStringFormatterTest()
	{
		ToStringFormatter formatter = new ToStringFormatter() {
			public String format(Object obj, Map<String,Object> values, String customName)
			{
				return null;
			}
		};
		
		FormattableToString obj = new FormattableToString() {
			public Map<String,Object> getValueMapping()
			{
				return null;
			}
		};
		
		Barghos.DEFAULT_TO_STRING_FORMATTER = formatter;
		
		assertSame(formatter, obj.getDefaultToStringFormatter());
	}
	
	/**
	 * This test ensures, that the default implementation of the {@link FormattableToString#toFormattedString()}
	 * function calls the {@link FormattableToString#toFormattedString(ToStringFormatter)} function with the
	 * formatter from {@link FormattableToString#getDefaultToStringFormatter()} and returns the result.
	 */
	@Test
	void toFormattedString_DefaultTest()
	{
		final ToStringFormatter customFormatter = new ToStringFormatter() {
			public String format(Object obj, Map<String,Object> values, String customName)
			{
				return null;
			}
		};
		
		FormattableToString obj = new FormattableToString() {
			public ToStringFormatter getDefaultToStringFormatter()
			{
				return customFormatter;
			}
			
			public String toFormattedString(ToStringFormatter formatter)
			{
				assertSame(customFormatter, formatter);
				
				return "test";
			}

			public Map<String,Object> getValueMapping()
			{
				return null;
			}
		};
		
		assertEquals("test", obj.toFormattedString());
	}
	
	/**
	 * This test ensures, that the default implementation of the function
	 * {@link FormattableToString#toFormattedString(ToStringFormatter)} passes the
	 * value mapping from the function {@link FormattableToString#getValueMapping()} and the
	 * custom display name from the function {@link FormattableToString#getCustomFormattedName()} to
	 * the formatter.
	 */
	@Test
	void toFormattedString_ExplicitTest()
	{
		final Map<String,Object> fvalues = new LinkedHashMap<>();
		fvalues.put("x", "arg1");
		fvalues.put("y", 2);
		
		final ToStringFormatter customFormatter = new ToStringFormatter() {
			public String format(Object obj, Map<String,Object> values, String customName)
			{
				assertSame(fvalues, values);
				
				assertEquals("ipsum", customName);
				
				List<Map.Entry<String,Object>> l = new ArrayList<>(values.entrySet());
				
				assertEquals(2, l.size());
				assertEquals("x", l.get(0).getKey());
				assertEquals("arg1", l.get(0).getValue());
				assertEquals("y", l.get(1).getKey());
				assertEquals(2, l.get(1).getValue());
				
				return "test";
			}
		};
		
		FormattableToString obj = new FormattableToString() {
			public ToStringFormatter getDefaultToStringFormatter()
			{
				return customFormatter;
			}

			public Map<String,Object> getValueMapping()
			{
				return fvalues;
			}
			
			public String getCustomFormattedName()
			{
				return "ipsum";
			}
		};
		
		assertEquals("test", obj.toFormattedString());
	}
	
	/**
	 * This test ensures, that the default implementation of the function {@link FormattableToString#getCustomFormattedName()}
	 * returns <code>null</code>.
	 */
	@Test
	void getCustomFormattedNameTest()
	{
		FormattableToString obj = new FormattableToString() {
			public Map<String,Object> getValueMapping()
			{
				return null;
			}
		};
		
		assertNull(obj.getCustomFormattedName());
	}
}