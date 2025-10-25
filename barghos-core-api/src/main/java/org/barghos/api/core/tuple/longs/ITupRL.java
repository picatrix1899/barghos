package org.barghos.api.core.tuple.longs;

import org.barghos.annotation.ExtractionParam;

/**
 * This interface provides non-modifying operations for float tuples.
 * Therefore the operations of this interface will not alter the component
 * values of this tuple nor the size of this tuple.
 * 
 * <p>
 * Whether the tuple allows to create new tuple instances with different sizes
 * than the size of this tuple is left to the implementation. However every
 * implementation guarantees to support the creation of tuples of the same
 * size.
 */
public interface ITupRL
{

	int size();

	long at(int index);

	long[] toArray();

	long[] toArray(@ExtractionParam long[] res);
	
}
