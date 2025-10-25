package org.barghos.api.core.tuple.ints;

import org.barghos.annotation.ExtractionParam;

/**
 * This interface provides non-modifying operations for float tuples with 
 * four components. Therefore the operations of this interface will not alter
 * the component values of this tuple.
 */
public interface ITup4RI extends ITupRI
{
	
	/** {@inheritDoc} */
	@Override
	default int size()
	{
		return 4;
	}

	int v0();

	int v1();

	int v2();

	int v3();

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