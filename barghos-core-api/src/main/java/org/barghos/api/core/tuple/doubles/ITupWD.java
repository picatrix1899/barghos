package org.barghos.api.core.tuple.doubles;

/**
 * This interface provides common operations for float tuples.
 * 
 * <p>
 * Whether the tuple allows to alter the size of this tuple or create new tuple
 * instances with different sizes than the size of this tuple is left to the
 * implementation. However every implementation guarantees to support the
 * creation of tuples of the same size.
 */
public interface ITupWD extends ITupRD
{

	ITupWD at(int index, double value);

	ITupWD set(ITupRD t);

	ITupWD set(double[] t);
	
}
