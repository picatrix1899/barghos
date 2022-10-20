package org.barghos.documentation;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.RetentionPolicy.*;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

/**
 * Indicates the minimum value for the annotated int parameter.
 * 
 * @author picatrix1899
 */
@Documented
@Retention(CLASS)
@Target(PARAMETER)
public @interface IntMinValue
{
	/**
	 * This parameter contains the minimum value for the annotated parameter.
	 * 
	 * @return The minimum value for the annotated parameter.
	 */
	int value();
}
