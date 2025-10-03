package org.barghos.annotation;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.RetentionPolicy.*;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

/**
 * Shows the minimum required amount of entries of the annotated array or
 * collection for the function.
 */
@Documented
@Retention(CLASS)
@Target(PARAMETER)
public @interface MinLength2d
{
	int a0();
	
	int a1();
}
