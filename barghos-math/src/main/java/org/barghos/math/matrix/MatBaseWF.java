package org.barghos.math.matrix;

/**
 * This interface provides the common functions and methods for all float matrices.
 */
public interface MatBaseWF extends MatBaseRF
{
	/** {@inheritDoc} */
	@Override
	MatBaseWF createNew();
	
	/** {@inheritDoc} */
	@Override
	MatBaseWF createNew(float[][] m);
	
	/**
	 * Sets the value of the specified cell.
	 * 
	 * @param row
	 *     The index of the row the cell is in.
	 * @param column
	 *     The index of the column the cell is in.
	 * @param value
	 *     The new value of the cell.
	 * 
	 * @return The current matrix.
	 */
	MatBaseWF setCell(int row, int column, float value);
	
	/**
	 * Sets all the values in the specified row.
	 * 
	 * @param row
	 *     The index of the row.
	 * @param values
	 *     The new values of the row.
	 * 
	 * @return The current matrix.
	 */
	MatBaseWF setRow(int row, float[] values);
	
	/**
	 * Sets all the values in the specified column.
	 * 
	 * @param column
	 *     The index of the column.
	 * @param values
	 *     The new values of the column.
	 * 
	 * @return The current matrix.
	 */
	MatBaseWF setColumn(int column, float[] values);
	
	/**
	 * Adopts all the values of the given matrix to this matrix.
	 * 
	 * @param m
	 *     The matrix to adopt the values from as an array. The two indices of the array are
	 *     expected to represent first the row and second the column {@code m[row][column]}.
	 * 
	 * @return The current matrix.
	 */
	MatBaseWF setArray(float[][] m);
}
