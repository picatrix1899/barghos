package org.barghos.core.api.util;


/**
 * This interface represents an object that can be in a valid or invalid state.
 * 
 * @author picatrix1899
 */
public interface Validateable
{
	/**
	 * Returns true if the current object is in a valid state.
	 * The definition of beeing in a valid state depends on the implementation.
	 * 
	 * @return True if the object is in a valid state.
	 */
	default boolean isValid()
	{
		return true;
	}
}
