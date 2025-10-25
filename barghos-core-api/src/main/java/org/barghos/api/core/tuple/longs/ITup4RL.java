package org.barghos.api.core.tuple.longs;

import org.barghos.annotation.ExtractionParam;

/**
 * This interface provides non-modifying operations for float tuples with 
 * four components. Therefore the operations of this interface will not alter
 * the component values of this tuple.
 */
public interface ITup4RL extends ITupRL
{
	
	/** {@inheritDoc} */
	@Override
	default int size()
	{
		return 4;
	}

	long v0();

	long v1();

	long v2();

	long v3();

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