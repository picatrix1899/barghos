package org.barghos.api.core.tuple.floats;

import org.barghos.annotation.ExtractionParam;
import org.barghos.api.core.tuple.floats.ITupRF;

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
public interface ITupRF
{

	int size();

	float at(int index);

	float[] toArray();

	float[] toArray(@ExtractionParam float[] res);
	
}
