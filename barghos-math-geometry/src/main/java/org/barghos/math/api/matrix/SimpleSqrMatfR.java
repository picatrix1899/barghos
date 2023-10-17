package org.barghos.math.api.matrix;

/**
 * This interface provides non invasive (readonly) functions and methods for square float matrices.
 */
public interface SimpleSqrMatfR extends SimpleMatfR
{
	/** {@inheritDoc} */
	@Override
	SimpleSqrMatfR createNew();
	
	/** {@inheritDoc} */
	@Override
	SimpleSqrMatfR createNew(float[][] m);
}
