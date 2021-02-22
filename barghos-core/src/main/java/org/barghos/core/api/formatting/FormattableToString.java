package org.barghos.core.api.formatting;

/**
 * This interface provides functions for a formatted toString version.
 * 
 * @author picatrix1899
 */
public interface FormattableToString
{
	/**
	 * Returns a string representation of the current object formatted with
	 * the formatter defiened in {@link org.barghos.core.Barghos#DEFAULT_TO_STRING_FORMATTER}.
	 * 
	 * @return A formatted string representation of the current object.
	 */
	String toFormattedString();
	
	/**
	 * Returns a string representation of the current object formatted with
	 * the specified formatter.
	 * 
	 * @param formatter The formatter used to format the values of the current object.
	 * 
	 * @return A formatted string representation of the current object.
	 */
	String toFormattedString(ToStringFormatter formatter);
}