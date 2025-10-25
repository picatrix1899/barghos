package org.barghos.api.core.tuple.doubles;

/**
 * This interface provides common operations for float tuples with two
 * components.
 */
public interface ITup2WD extends ITup2RD, ITupWD
{

	ITup2WD v0(double v0);

	ITup2WD v1(double v1);

	/** {@inheritDoc} */
	@Override
	ITup2WD at(int index, double value);

	ITup2WD set(ITup2RD t);

	/** {@inheritDoc} */
	@Override
	ITup2WD set(ITupRD t);

	/** {@inheritDoc} */
	@Override
	ITup2WD set(double[] t);

	ITup2WD set(double v0, double v1);
	
}