package org.barghos.core.api.formatting;

import java.util.Map;

/**
 * This interface represents a special formatter used for the toFormattedString functions
 * of the interface {@link org.barghos.core.api.formatting.FormattableToString}.
 * It provides functions to return a formatted string representation of objects and their
 * values.
 * 
 * @author picatrix1899
 */
public interface ToStringFormatter
{
	/**
	 * Returns a formatted string representation of the given class with the given value pairs.
	 * 
	 * @param obj The object to create the string representation from.
	 * @param values Value pairs consisting of the component names and values.
	 * 
	 * @return A formatted string representation of the given class and the value pairs.
	 */
	String format(Object obj, Map<String,Object> values);
}
