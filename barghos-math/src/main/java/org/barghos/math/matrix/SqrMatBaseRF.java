package org.barghos.math.matrix;

/**
 * This interface provides non invasive (readonly) functions and methods for square float matrices.
 */
public interface SqrMatBaseRF extends MatBaseRF
{
	/** {@inheritDoc} */
	@Override
	SqrMatBaseRF createNew();
	
	/** {@inheritDoc} */
	@Override
	SqrMatBaseRF createNew(float[][] m);
}
