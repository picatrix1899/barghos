package org.barghos.math.matrix;

/**
 * This interface provides non invasive (readonly) functions and methods for all float matrices.
 */
public interface MatRF extends MatBaseRF
{
	/** {@inheritDoc} */
	@Override
	MatRF createNew();
	
	/** {@inheritDoc} */
	@Override
	MatRF createNew(float[][] m);	
}
