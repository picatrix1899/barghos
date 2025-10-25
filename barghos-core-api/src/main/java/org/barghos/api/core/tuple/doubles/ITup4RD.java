package org.barghos.api.core.tuple.doubles;

import org.barghos.annotation.ExtractionParam;

/**
 * This interface provides non-modifying operations for float tuples with 
 * four components. Therefore the operations of this interface will not alter
 * the component values of this tuple.
 */
public interface ITup4RD extends ITupRD
{
	
	/** {@inheritDoc} */
	@Override
	default int size()
	{
		return 4;
	}

	double v0();

	double v1();

	double v2();

	double v3();

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