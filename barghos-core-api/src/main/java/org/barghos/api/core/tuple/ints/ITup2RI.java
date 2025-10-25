package org.barghos.api.core.tuple.ints;

import org.barghos.annotation.ExtractionParam;

/**
 * This interface provides non-modifying operations for float tuples with 
 * two components. Therefore the operations of this interface will not alter
 * the component values of this tuple.
 */
public interface ITup2RI extends ITupRI
{
	
	public static final int SIZE = 2;

	/** {@inheritDoc} */
	@Override
	default int size()
	{
		return SIZE;
	}

	int v0();

	int v1();

	/** {@inheritDoc} */
	@Override
	int at(int index);

	/** {@inheritDoc} */
	@Override
	int[] toArray();

	/** {@inheritDoc} */
	@Override
	int[] toArray(@ExtractionParam int[] res);
	
}