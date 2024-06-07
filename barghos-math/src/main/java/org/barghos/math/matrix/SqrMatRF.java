package org.barghos.math.matrix;

/**
 * This interface provides non invasive (readonly) functions and methods for square float matrices.
 */
public interface SqrMatRF extends SqrMatBaseRF, MatRF
{
	/** {@inheritDoc} */
	@Override
	SqrMatRF createNew();
	
	/** {@inheritDoc} */
	@Override
	SqrMatRF createNew(float[][] m);
	
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
