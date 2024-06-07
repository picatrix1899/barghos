package org.barghos.math.matrix;

/**
 * This interface provides the common functions and methods for all float matrices.
 */
public interface MatWF extends MatRF, MatBaseWF
{
	/** {@inheritDoc} */
	@Override
	MatWF createNew();
	
	/** {@inheritDoc} */
	@Override
	MatWF createNew(float[][] m);
	
	/** {@inheritDoc} */
	@Override
	MatWF setCell(int row, int column, float value);
	
	/** {@inheritDoc} */
	@Override
	MatWF setRow(int row, float[] values);
	
	/** {@inheritDoc} */
	@Override
	MatWF setColumn(int column, float[] values);
	
	/** {@inheritDoc} */
	@Override
	MatWF setArray(float[][] m);
	
	/**
	 * Initializes the matrix as a zero matrix.
	 * 
	 * <p>
	 * Initializing a already populated matrix resets all values to the default for the
	 * initialization.
	 * 
	 * @return The current matrix.
	 */
	MatWF initZero();
}
