package org.barghos.core.api.documentation;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.RetentionPolicy.*;


import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

/**
 * Shows the minimum required amount of entries of the annotated array or collection for the function.
 * 
 * @author picatrix1899
 */
@Documented
@Retention(CLASS)
@Target(PARAMETER)
public @interface MinLength
{
	/**
	 * This parameter contains the minimum required amount of entries of the annotated array or collection.
	 */
	int value();
}
