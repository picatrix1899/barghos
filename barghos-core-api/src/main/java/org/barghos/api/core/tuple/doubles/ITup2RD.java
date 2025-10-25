package org.barghos.api.core.tuple.doubles;

import org.barghos.annotation.ExtractionParam;

/**
 * This interface provides non-modifying operations for float tuples with 
 * two components. Therefore the operations of this interface will not alter
 * the component values of this tuple.
 */
public interface ITup2RD extends ITupRD
{
	
	public static final int SIZE = 2;

	/** {@inheritDoc} */
	@Override
	default int size()
	{
		return SIZE;
	}

	double v0();

	double v1();

	/** {@inheritDoc} */
	@Override
	double at(int index);

	/** {@inheritDoc} */
	@Override
	double[] toArray();

	/** {@inheritDoc} */
	@Override
	double[] toArray(@ExtractionParam double[] res);
	
}