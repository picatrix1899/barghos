package org.barghos.math.api.matrix;

/**
 * This interface provides the common functions and methods for square float matrices.
 */
public interface SqrMatfC extends SqrMatfR, SimpleSqrMatfC, MatfC
{
	/** {@inheritDoc} */
	@Override
	SqrMatfC createNew();
	
	/** {@inheritDoc} */
	@Override
	SqrMatfC createNew(float[][] m);
	
	/** {@inheritDoc} */
	@Override
	SqrMatfC initZero();
	
	/**
	 * Initializes the matrix as an identity matrix.
	 * 
	 * <p>
	 * Initializing a already populated matrix resets all values to the default for the
	 * initialization.
	 * 
	 * @return The current matrix.
	 */
	SqrMatfC initIdentity();
}
