package org.barghos.api.core.tuple.ints;

import org.barghos.annotation.ExtractionParam;

/**
 * This interface provides non-modifying operations for float tuples with 
 * three components. Therefore the operations of this interface will not alter
 * the component values of this tuple.
 */
public interface ITup3RI extends ITupRI
{
	public static final int SIZE = 3;

	/** {@inheritDoc} */
	@Override
	default int size()
	{
		return SIZE;
	}

	int v0();

	int v1();

	int v2();

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