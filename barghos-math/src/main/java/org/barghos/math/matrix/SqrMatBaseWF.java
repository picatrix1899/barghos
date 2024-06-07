package org.barghos.math.matrix;

/**
 * This interface provides the common functions and methods for square float matrices.
 */
public interface SqrMatBaseWF extends SqrMatBaseRF, MatBaseWF
{
	/** {@inheritDoc} */
	@Override
	SqrMatBaseWF createNew();
	
	/** {@inheritDoc} */
	@Override
	SqrMatBaseWF createNew(float[][] m);
}
