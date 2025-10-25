package org.barghos.api.core.tuple.longs;

import org.barghos.annotation.ExtractionParam;

/**
 * This interface provides non-modifying operations for float tuples with 
 * three components. Therefore the operations of this interface will not alter
 * the component values of this tuple.
 */
public interface ITup3RL extends ITupRL
{
	public static final int SIZE = 3;

	/** {@inheritDoc} */
	@Override
	default int size()
	{
		return SIZE;
	}

	long v0();

	long v1();

	long v2();

	/** {@inheritDoc} */
	@Override
	long at(int index);

	/** {@inheritDoc} */
	@Override
	long[] toArray();

	/** {@inheritDoc} */
	@Override
	long[] toArray(@ExtractionParam long[] res);
	
}