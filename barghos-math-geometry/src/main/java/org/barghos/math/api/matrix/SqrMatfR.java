package org.barghos.math.api.matrix;

/**
 * This interface provides non invasive (readonly) functions and methods for square float matrices.
 */
public interface SqrMatfR extends SimpleSqrMatfR, MatfR
{
	/** {@inheritDoc} */
	@Override
	SqrMatfR createNew();
	
	/** {@inheritDoc} */
	@Override
	SqrMatfR createNew(float[][] m);
	
	/**
	 * Calculates the determinant of this matrix.
	 * 
	 * @return The determinant.
	 */
	float determinant();
	
	/**
	 * Calculates the trace of this matrix.
	 * 
	 * @return The trace.
	 */
	float trace();
}
