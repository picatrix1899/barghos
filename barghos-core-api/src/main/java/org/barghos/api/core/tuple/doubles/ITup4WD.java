package org.barghos.api.core.tuple.doubles;

/**
 * This interface provides common operations for float tuples with three
 * components.
 */
public interface ITup4WD extends ITup4RD, ITupWD
{

	ITup4WD v0(double v0);

	ITup4WD v1(double v1);
	
	ITup4WD v2(double v2);

	ITup4WD v3(double v3);

	/** {@inheritDoc} */
	@Override
	ITup4WD at(int index, double value);

	ITup4WD set(ITup4RD t);

	/** {@inheritDoc} */
	@Override
	ITup4WD set(ITupRD t);

	/** {@inheritDoc} */
	@Override
	ITup4WD set(double[] t);

	ITup4WD set(double v0, double v1, double v2, double v3);
	
}