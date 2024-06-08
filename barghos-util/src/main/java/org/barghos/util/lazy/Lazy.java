package org.barghos.util.lazy;

/**
 * Represents a value provider, that determines the value to provide on the
 * first call to {@link #value()} and stores it for any further calls. This
 * allows to execute probably complex code for determining the value only if and
 * when the value is really needed. 
 * 
 * @param <T> The type of the value.
 */
public interface Lazy<T>
{
	/**
	 * Returns the provided value.
	 * 
	 * <p>
	 * WARNING: This will execute the code to determine the value on the first
	 * call.
	 * 
	 * @return The provided value.
	 */
	T value();
	
	/**
	 * Returns if a value was determined. This is helpful if the provided value
	 * is null.
	 * 
	 * @return True, if the value was determined. False otherwise.
	 */
	boolean hasValue();
}
