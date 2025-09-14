package org.barghos.api.core.lazy;

/**
 * Represents a value provider, that determines the value to provide on the
 * first call to {@link #valueGeneric()} and stores it for any further calls.
 * This allows to execute probably complex code for determining the value only
 * if and when the value is really needed. This extends the {@link Lazy}
 * interface by the possibility to clear and to re-determine the stored value.
 * 
 * @param <T> The type of the provided value.
 */
public interface ILazyW<T> extends ILazyR<T>
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
