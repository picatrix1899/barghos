package org.barghos.core.test.api.util;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

import org.barghos.core.api.util.CollectionUtils;


/**
 * This class provides component tests for the class {@link CollectionUtils}.
 * 
 * @author picatrix1899
 */
class CollectionUtilsTest
{
	/**
	 * This test ensures, that the function {@link CollectionUtils#contains(java.util.Collection, Function)}
	 * returns the correct value.
	 */
	@Test
	void containsTest()
	{
		List<TestClass> list = new ArrayList<>();
		list.add(new TestClass("value1"));
		list.add(new TestClass("value2"));
		
		assertEquals(true, CollectionUtils.contains(list, new Function<>() {
			public Boolean apply(TestClass t)
			{
				return t.value.equals("value1");
			}
		}));
		
		assertEquals(true, CollectionUtils.contains(list, new Function<>() {
			public Boolean apply(TestClass t)
			{
				return t.value.equals("value2");
			}
		}));
		
		assertEquals(false, CollectionUtils.contains(list, new Function<>() {
			public Boolean apply(TestClass t)
			{
				return t.value.equals("value3");
			}
		}));
	}
	
	/**
	 * This is a test class used for the tests of the class {@link CollectionUtils} it contains a single
	 * public string value.
	 * 
	 * @author picatrix1899
	 */
	static class TestClass
	{
		public String value;
		
		TestClass(String value)
		{
			this.value = value;
		}
	}
}