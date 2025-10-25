package org.barghos.api.core.tuple.floats;

/**
 * This interface provides common operations for float tuples.
 * 
 * <p>
 * Whether the tuple allows to alter the size of this tuple or create new tuple
 * instances with different sizes than the size of this tuple is left to the
 * implementation. However every implementation guarantees to support the
 * creation of tuples of the same size.
 */
public interface ITupWF extends ITupRF
{

	ITupWF at(int index, float value);

	ITupWF set(ITupRF t);

	ITupWF set(float[] t);
	
}
