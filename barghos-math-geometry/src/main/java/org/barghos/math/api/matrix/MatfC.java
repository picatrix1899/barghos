package org.barghos.math.api.matrix;

/**
 * This interface provides the common functions and methods for all float matrices.
 */
public interface MatfC extends MatfR, SimpleMatfC
{
	/** {@inheritDoc} */
	@Override
	MatfC createNew();
	
	/** {@inheritDoc} */
	@Override
	MatfC createNew(float[][] m);
	
	/** {@inheritDoc} */
	@Override
	MatfC setCell(int row, int column, float value);
	
	/** {@inheritDoc} */
	@Override
	MatfC setRow(int row, float[] values);
	
	/** {@inheritDoc} */
	@Override
	MatfC setColumn(int column, float[] values);
	
	/** {@inheritDoc} */
	@Override
	MatfC setArray(float[][] m);
	
	/**
	 * Initializes the matrix as a zero matrix.
	 * 
	 * <p>
	 * Initializing a already populated matrix resets all values to the default for the
	 * initialization.
	 * 
	 * @return The current matrix.
	 */
	MatfC initZero();
}
