package org.barghos.api.core.tuple.longs;

import org.barghos.annotation.ExtractionParam;

/**
 * This interface provides non-modifying operations for float tuples with 
 * two components. Therefore the operations of this interface will not alter
 * the component values of this tuple.
 */
public interface ITup2RL extends ITupRL
{
	
	public static final int SIZE = 2;

	/** {@inheritDoc} */
	@Override
	default int size()
	{
		return SIZE;
	}

	long v0();

	long v1();

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