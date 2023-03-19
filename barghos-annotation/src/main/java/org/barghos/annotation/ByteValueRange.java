package org.barghos.annotation;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.RetentionPolicy.*;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

/**
 * Indicates the valid value range for the annotated byte parameter.
 */
@Documented
@Retention(CLASS)
@Target(PARAMETER)
public @interface ByteValueRange
{
	/**
	 * This parameter contains the minimum value for the annotated parameter.
	 * 
	 * @return The minimum value for the annotated parameter.
	 */
	byte min() default 0;
	
	/**
	 * This parameter contains the maximum value for the annotated parameter.
	 * 
	 * @return The maximum value for the annotated parameter.
	 */
	byte max() default Byte.MAX_VALUE;
}
