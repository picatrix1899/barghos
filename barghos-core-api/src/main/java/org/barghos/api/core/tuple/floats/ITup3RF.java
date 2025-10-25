package org.barghos.api.core.tuple.floats;

import org.barghos.annotation.ExtractionParam;

/**
 * This interface provides non-modifying operations for float tuples with 
 * three components. Therefore the operations of this interface will not alter
 * the component values of this tuple.
 */
public interface ITup3RF extends ITupRF
{
	public static final int SIZE = 3;

	/** {@inheritDoc} */
	@Override
	default int size()
	{
		return SIZE;
	}

	float v0();

	float v1();

	float v2();

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