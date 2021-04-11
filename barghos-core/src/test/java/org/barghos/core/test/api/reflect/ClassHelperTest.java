package org.barghos.core.test.api.reflect;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;
import java.util.List;
import java.util.function.Function;

import org.barghos.core.api.reflect.ClassHelper;
import org.barghos.core.api.util.CollectionUtils;

/**
 * This class provides component tests for the class {@link ClassHelper}.
 * 
 * @author picatrix1899
 */
class ClassHelperTest
{
	/**
	 * This test ensures, that the function {@link ClassHelper#getAnnotatedMethods(Class, Class)} correctly returns the
	 * expected functions.
	 */
	@Test
	void getAnnotatedMethodsTest()
	{
		List<Method> result = ClassHelper.getAnnotatedMethods(TestClass.class, TestAnnotation.class);
		
		assertEquals(2, result.size());
		
		assertTrue(CollectionUtils.contains(result, new Function<>() {
			public Boolean apply(Method t)
			{
				return t.getName() == "publicAnnotatedTest";
			}
		}));
		
		assertTrue(CollectionUtils.contains(result, new Function<>() {
			public Boolean apply(Method t)
			{
				return t.getName() == "publicAnnotatedParentTest";
			}
		}));
	}
	
	/**
	 * This test ensures, that the function {@link ClassHelper#getAnnotatedDeclaredMethods(Class, Class)} correctly returns the
	 * expected functions.
	 */
	@Test
	void getAnnotatedDeclaredMethodsTest()
	{
		List<Method> result = ClassHelper.getAnnotatedDeclaredMethods(TestClass.class, TestAnnotation.class);
		
		assertEquals(4, result.size());
		
		assertTrue(CollectionUtils.contains(result, new Function<>() {
			public Boolean apply(Method t)
			{
				return t.getName() == "publicAnnotatedTest";
			}
		}));
		
		assertTrue(CollectionUtils.contains(result, new Function<>() {
			public Boolean apply(Method t)
			{
				return t.getName() == "protectedAnnotatedTest";
			}
		}));
		
		assertTrue(CollectionUtils.contains(result, new Function<>() {
			public Boolean apply(Method t)
			{
				return t.getName() == "packageAnnotatedTest";
			}
		}));
		
		assertTrue(CollectionUtils.contains(result, new Function<>() {
			public Boolean apply(Method t)
			{
				return t.getName() == "privateAnnotatedTest";
			}
		}));
	}
	
	/**
	 * This class is a test class used for testing some of the {@link ClassHelper} functions.
	 * 
	 * @author picatrix1899
	 */
	static class TestClass extends TestParentClass
	{
		public void publicTest() { }
		
		protected void protectedTest() { }
		
		void packageTest() { }
		
		@SuppressWarnings("unused")
		private void privateTest() { }
		
		@TestAnnotation
		public void publicAnnotatedTest() { }
		
		@TestAnnotation
		protected void protectedAnnotatedTest() { }
		
		@TestAnnotation
		void packageAnnotatedTest() { }
		
		@TestAnnotation
		private void privateAnnotatedTest() { }
	}
	
	/**
	 * This class is a test class used as a parent class for testing some of the {@link ClassHelper} functions.
	 * 
	 * @author picatrix1899
	 */
	static class TestParentClass
	{
		public void publicParentTest() { }
		
		protected void protectedParentTest() { }
		
		void packageParentTest() { }
		
		@SuppressWarnings("unused")
		private void privateParentTest() { }
		
		@TestAnnotation
		public void publicAnnotatedParentTest() { }
		
		@TestAnnotation
		protected void protectedAnnotatedParentTest() { }
		
		@TestAnnotation
		void packageAnnotatedParentTest() { }
		
		@TestAnnotation
		private void privateAnnotatedParentTest() { }
	}
	
	/**
	 * This annotation is a test annotation used for testing some of the {@link ClassHelper} functions.
	 * 
	 * @author picatrix1899
	 */
	@Retention(RetentionPolicy.RUNTIME)
	static @interface TestAnnotation
	{
	}
}