package org.barghos.annotation;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.RetentionPolicy.*;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

/**
 * Indicates the valid value range for the annotated long parameter.
 */
@Documented
@Retention(CLASS)
@Target(PARAMETER)
public @interface LongValueRange
{
	/**
	 * This parameter contains the minimum value for the annotated parameter.
	 * 
	 * @return The minimum value for the annotated parameter.
	 */
	long min() default 0;
	
	/**
	 * This parameter contains the maximum value for the annotated parameter.
	 * 
	 * @return The maximum value for the annotated parameter.
	 */
	long max() default Long.MAX_VALUE;
}
