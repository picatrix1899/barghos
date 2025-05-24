package org.barghos.util.lazy.strings;

/**
 * Represents a string value provider, that determines the value to provide on
 * the first call to {@link #valueStr()} and stores it for any further calls.
 * This allows to execute probably complex code for determining the value only
 * if and when the value is really needed. This extends the {@link LazyStr}
 * interface by the possibility to clear and to re-determine the stored value.
 */
public interface ILazyWStr extends ILazyRStr
{
	/**
	 * Clears the stored determined value and resets the
	 * {@link #hasValue()} flag to false.
	 */
	void clear();
	
	/**
	 * Forces the code to determine the value to run and stores the determined
	 * value and sets the {@link #hasValue()} flag to true. Therefore this
	 * allows to update the stored value.
	 */
	void update();
}
