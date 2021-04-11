package org.barghos.core.test.formatting;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import java.util.LinkedHashMap;
import java.util.Map;

import org.barghos.core.api.formatting.FormattableToString;
import org.barghos.core.api.formatting.ToStringFormatter;
import org.barghos.core.formatting.DefaultToStringFormatter;

/**
 * This class provides component tests for the class {@link DefaultToStringFormatter}
 * 
 * @author picatrix1899
 */
class DefaultToStringFormatterTest
{
	/**
	 * This test ensures, that the function {@link DefaultToStringFormatter#format(Object, java.util.Map, String)} formats
	 * the type and the value-pairs as intended.
	 */
	@Test
	void formatTest()
	{
		DefaultToStringFormatter formatter = new DefaultToStringFormatter();
		
		Object obj = new TestClass3o();
		
		Map<String,Object> values = new LinkedHashMap<>();
		values.put("param1", (byte)1);
		values.put("param2", (short)2);
		values.put("param3", 3);
		values.put("param4", 4l);
		values.put("param5", 5.1f);
		values.put("param6", 6.1);
		values.put("param7", "lorem");
		values.put("param8", new TestClass3o());
		values.put("param9", new TestClassFormatted());
		
		String result = formatter.format(obj, values, null);
		
		assertEquals("testclass3o(param1=1, param2=2, param3=3, param4=4l, param5=5.1f, param6=6.1d, param7=lorem, param8=ipsum, param9=formatted)", result);
	}
	
	/**
	 * This test ensures, that the function {@link DefaultToStringFormatter#format(Object, java.util.Map, String)} formats
	 * the type and the values-pairs in the output as intended, if there are no value-pairs available.
	 */
	@Test
	void format_noValuesTest()
	{
		DefaultToStringFormatter formatter = new DefaultToStringFormatter();
		
		Object obj = new TestClass3o();
		
		Map<String,Object> values = new LinkedHashMap<>();
		
		String result = formatter.format(obj, values, null);
		
		assertEquals("testclass3o()", result);
	}
	
	/**
	 * This test ensures, that the function {@link DefaultToStringFormatter#format(Object, java.util.Map, String)} formats
	 * the type and the values-pairs in the output as intended, if the value-map parameter is null.
	 */
	@Test
	void format_valuesNullTest()
	{
		DefaultToStringFormatter formatter = new DefaultToStringFormatter();
		
		Object obj = new TestClass3o();
		
		String result = formatter.format(obj, null, null);
		
		assertEquals("testclass3o()", result);
	}
	
	/**
	 * This test ensures, that the function {@link DefaultToStringFormatter#format(Object, java.util.Map, String)} formats
	 * the type and the value-pairs as intended, if a custom name should be used.
	 */
	@Test
	void format_customNameTest()
	{
		DefaultToStringFormatter formatter = new DefaultToStringFormatter();
		
		Object obj = new TestClass3o();
		
		Map<String,Object> values = new LinkedHashMap<>();
		values.put("param1", (byte)1);
		values.put("param2", (short)2);
		values.put("param3", 3);
		values.put("param4", 4l);
		values.put("param5", 5.1f);
		values.put("param6", 6.1);
		values.put("param7", "lorem");
		values.put("param8", new TestClass3o());
		values.put("param9", new TestClassFormatted());
		
		String result = formatter.format(obj, values, "test");
		
		assertEquals("test(param1=1, param2=2, param3=3, param4=4l, param5=5.1f, param6=6.1d, param7=lorem, param8=ipsum, param9=formatted)", result);
	}
	
	/**
	 * This class represents a test class used to prove that {@link DefaultToStringFormatter} uses the {@link Object#toString()}
	 * function to retrieve the text for value pairs if the value of the value pair is an object that does not implement the
	 * {@link FormattableToString} interface.
	 * 
	 * @author picatrix1899
	 *
	 */
	static class TestClass3o
	{
		@Override
		public String toString()
		{
			return "ipsum";
		}
	}
	
	/**
	 * This class represents a test implementation of the {@link FormattableToString} interface for proving,
	 * that the {@link DefaultToStringFormatter} uses the {@link FormattableToString#toFormattedString()}
	 * to retrieve the text for value pairs if the value of the value pair is an object that implements the
	 * {@link FormattableToString} interface.
	 * 
	 * @author picatrix1899
	 */
	static class TestClassFormatted implements FormattableToString
	{
		@Override
		public String toFormattedString()
		{
			return "formatted";
		}
		
		@Override
		public String toFormattedString(ToStringFormatter formatter)
		{
			fail();
			return "";
		}
		
		@Override
		public Map<String,Object> getValueMapping()
		{
			return null;
		}
	}
}