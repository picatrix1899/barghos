package org.barghos.api.core.tuple.longs;

/**
 * This interface provides common operations for float tuples.
 * 
 * <p>
 * Whether the tuple allows to alter the size of this tuple or create new tuple
 * instances with different sizes than the size of this tuple is left to the
 * implementation. However every implementation guarantees to support the
 * creation of tuples of the same size.
 */
public interface ITupWL extends ITupRL
{

	ITupWL at(int index, long value);

	ITupWL set(ITupRL t);

	ITupWL set(long[] t);
	
}
