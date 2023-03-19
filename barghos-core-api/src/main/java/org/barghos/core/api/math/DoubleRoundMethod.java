package org.barghos.core.api.math;

/**
 * This interface represents a method of rounding for double values.
 * 
 * @author picatrix1899
 */
public interface DoubleRoundMethod
{
	/**
	 * Rounds the given value by this rounding method.
	 * 
	 * @param value The value to round.
	 * 
	 * @return The rounded value.
	 */
	double round(double value);
}
