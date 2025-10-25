package org.barghos.api.core.tuple.floats;

import org.barghos.annotation.ExtractionParam;

/**
 * This interface provides non-modifying operations for float tuples with 
 * four components. Therefore the operations of this interface will not alter
 * the component values of this tuple.
 */
public interface ITup4RF extends ITupRF
{
	
	/** {@inheritDoc} */
	@Override
	default int size()
	{
		return 4;
	}

	float v0();

	float v1();

	float v2();

	float v3();

	/** {@inheritDoc} */
	@Override
	float at(int index);

	/** {@inheritDoc} */
	@Override
	float[] toArray();

	/** {@inheritDoc} */
	@Override
	float[] toArray(@ExtractionParam float[] res);
	
}