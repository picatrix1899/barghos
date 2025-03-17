package org.barghos.util.math;

import java.math.BigDecimal;

/**
 * This interface represents a method of rounding for double values.
 * 
 * @author picatrix1899
 */
public interface RoundMethodBigd
{
	/**
	 * Rounds the given value by this rounding method.
	 * 
	 * @param value The value to round.
	 * 
	 * @return The rounded value.
	 */
	BigDecimal roundBigd(BigDecimal value);
}
