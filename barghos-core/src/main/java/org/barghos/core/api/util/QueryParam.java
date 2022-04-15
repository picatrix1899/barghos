package org.barghos.core.api.util;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.RetentionPolicy.*;


import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

/**
 * Indicates that the annotated parameter is used as a query parameter.
 * Query parameters are used to shift the responsibility for creating and maintaining the
 * instance of a return object to the function caller. The type of a query parameter
 * always has to be mutable in some form. This could be for example through a "setter" function.
 * As the caller has the resposibility for instance management it is possible to either reuse
 * an existing instance (i.e. an array) or utilize an instance pool. With this it is possible to
 * increase the performance by cutting out unnecessary allocations. A query parameter must never be null.
 * 
 * @author picatrix1899
 */
@Documented
@Retention(CLASS)
@Target(PARAMETER)
public @interface QueryParam
{

}
