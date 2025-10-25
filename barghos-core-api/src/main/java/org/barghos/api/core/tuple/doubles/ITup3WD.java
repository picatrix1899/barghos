package org.barghos.api.core.tuple.doubles;

/**
 * This interface provides common operations for float tuples with three
 * components.
 */
public interface ITup3WD extends ITup3RD, ITupWD
{

	ITup3WD v0(double v0);

	ITup3WD v1(double v1);

	ITup3WD v2(double v2);

	/** {@inheritDoc} */
	@Override
	ITup3WD at(int index, double value);

	ITup3WD set(ITup3RD t);

	/** {@inheritDoc} */
	@Override
	ITup3WD set(ITupRD t);

	/** {@inheritDoc} */
	@Override
	ITup3WD set(double[] t);

	ITup3WD set(double v0, double v1, double v2);
	
}