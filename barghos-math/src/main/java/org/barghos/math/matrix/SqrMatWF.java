package org.barghos.math.matrix;

/**
 * This interface provides the common functions and methods for square float matrices.
 */
public interface SqrMatWF extends SqrMatRF, SqrMatBaseWF, MatWF
{
	/** {@inheritDoc} */
	@Override
	SqrMatWF createNew();
	
	/** {@inheritDoc} */
	@Override
	SqrMatWF createNew(float[][] m);
	
	/** {@inheritDoc} */
	@Override
	SqrMatWF initZero();
	
	/**
	 * Initializes the matrix as an identity matrix.
	 * 
	 * <p>
	 * Initializing a already populated matrix resets all values to the default for the
	 * initialization.
	 * 
	 * @return The current matrix.
	 */
	SqrMatWF initIdentity();
}
