package org.barghos.annotation;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.RetentionPolicy.*;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

/**
 * This annotation indicates, that the annotated method argument may be null.
 * It usually indicates an argument with a special handling for null in the corresponding method.
 * 
 * @author picatrix1899
 */
@Retention(CLASS)
@Target(PARAMETER)
public @interface Nullable
{

}