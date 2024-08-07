package org.barghos.util.reflect;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/**
 * This class provides reflection utilities for types, classes and interfaces.
 * 
 * @author picatrix1899
 */
public class ClassHelper
{
	/**
	 * This class contains only static methods and functions and therefore must not be instanciated.
	 */
	private ClassHelper() {}
	
	/**
	 * This returns all public methods and functions of the given class and its superclass or any interface that
	 * are annotated with the given annotatation. This will work only for annotations with the runtime retention policy.
	 * 
	 * @param clazz The class to retrieve the methods and functions from.
	 * @param annotationClass The class of the annotation, that has to be applied to the methods and functions to return.
	 * 
	 * @return A list of all methods and functions annotated with the given annotation from the given class and super.
	 */
	public static List<Method> getAnnotatedMethods(Class<?> clazz, Class<? extends Annotation> annotationClass)
	{
		List<Method> result = new ArrayList<>();
		
		for(Method method : clazz.getMethods())
			if(method.isAnnotationPresent(annotationClass))
				result.add(method);
		
		return result;
	}
	
	/**
	 * This returns all methods and functions regardless of the visibillity of the given class but not of the superclass or any
	 * interfaces that are annotated with the given annotatation. This will work only for annotations with the runtime retention policy.
	 * 
	 * @param clazz The class to retrieve the methods and functions from.
	 * @param annotationClass The class of the annotation, that has to be applied to the methods and functions to return.
	 * 
	 * @return A list of all methods and functions annotated with the given annotation from the given class.
	 */
	public static List<Method> getAnnotatedDeclaredMethods(Class<?> clazz, Class<? extends Annotation> annotationClass)
	{
		List<Method> result = new ArrayList<>();
		
		for(Method method : clazz.getDeclaredMethods())
			if(method.isAnnotationPresent(annotationClass))
				result.add(method);
		
		return result;
	}
}