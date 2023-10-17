package org.barghos.math.api.matrix;

/**
 * This interface provides the common functions and methods for square float matrices.
 */
public interface SimpleSqrMatfC extends SimpleSqrMatfR, SimpleMatfC
{
	/** {@inheritDoc} */
	@Override
	SimpleSqrMatfC createNew();
	
	/** {@inheritDoc} */
	@Override
	SimpleSqrMatfC createNew(float[][] m);
}
