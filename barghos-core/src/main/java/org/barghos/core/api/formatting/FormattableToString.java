package org.barghos.core.api.formatting;

import java.util.Map;

import org.barghos.core.Barghos;
import org.barghos.core.api.util.ArgumentNullException;

/**
 * This interface provides functions for a formatted toString version.
 * 
 * @author picatrix1899
 */
public interface FormattableToString
{
	/**
	 * Returns a mapping of this objects values consisting of the values name and the value itself.
	 * This may return <code>null</code>.
	 * 
	 * @return A mapping of value names and the values of this object or <code>null</code>.
	 */
	Map<String,Object> getValueMapping();
	
	/**
	 * Returns the custom name, that should be used by any formatted toString function.
	 * It may return null or an empty string aswell. The default implementation returns null.
	 * 
	 * @return The custom name, that should be used by any formatted toString function, empty String or <code>null</code>.
	 */
	default String getCustomFormattedName()
	{
		return null;
	}
	
	/**
	 * Returns the default toString-formatter for the current type.
	 * This is by default the formatter stored in
	 * {@link org.barghos.core.Barghos#DEFAULT_TO_STRING_FORMATTER Barghos.DEFAULT_TO_STRING_FORMATTER} but it may be overidden
	 * for the current type.
	 * 
	 * @return The default toString-formatter for the current type.
	 */
	default ToStringFormatter getDefaultToStringFormatter()
	{
		return Barghos.DEFAULT_TO_STRING_FORMATTER;
	}
	
	/**
	 * Returns a string representation of the current object formatted with the default toString-formatter
	 * for this type.
	 * 
	 * @return A formatted string representation of the current object.
	 */
	default String toFormattedString()
	{
		return toFormattedString(getDefaultToStringFormatter());
	}
	
	/**
	 * Returns a string representation of the current object formatted with
	 * the specified formatter.
	 * 
	 * @param formatter The formatter used to format the values of the current object.
	 * 
	 * @return A formatted string representation of the current object.
	 */
	default String toFormattedString(ToStringFormatter formatter)
	{
		if(Barghos.BUILD_FLAG__PARAMETER_CHECKS)
		{
			if(formatter == null) throw new ArgumentNullException("formatter");
		}

		return formatter.format(this, getValueMapping(), getCustomFormattedName());
	}
}