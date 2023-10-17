package org.barghos.math.api.matrix;

/**
 * This interface provides non invasive (readonly) functions and methods for all float matrices.
 */
public interface MatfR extends SimpleMatfR
{
	/** {@inheritDoc} */
	@Override
	MatfR createNew();
	
	/** {@inheritDoc} */
	@Override
	MatfR createNew(float[][] m);	
}
