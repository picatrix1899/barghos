package org.barghos.core.api.formatting;

import java.util.Map;

import org.barghos.core.api.Nullable;

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
	 * The values parameter may be <code>null</code>.
	 * 
	 * <p>As the values parameter may be null, special care must be taken for the implementation.
	 * 
	 * @param obj The object to create the string representation from.
	 * @param values Value pairs consisting of the component names and values or <code>null</code>.
	 * 
	 * @return A formatted string representation of the given class and the value pairs.
	 */
	default String format(Object obj, @Nullable Map<String,Object> values)
	{
		return format(obj, values, null);
	}
	
	/**
	 * Returns a formatted string representation of the given class with the given value pairs and a custom name to display.
	 * The custom name may be <code>null</code> or an empty string.
	 * The values parameter may be <code>null</code>.
	 * 
	 * <p>As the values parameter and also the custom name may be null, special care must be taken for the implementation.
	 * 
	 * @param obj The object to create the string representation from.
	 * @param values Value pairs consisting of the component names and values or <code>null</code>.
	 * @param customName The custom name to display. May be <code>null</code> or an empty string aswell.
	 * 
	 * @return A formatted string representation of the given class and the value pairs.
	 */
	String format(Object obj, @Nullable Map<String,Object> values, @Nullable String customName);
}
