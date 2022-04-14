package org.barghos.math.api.matrix;

import java.nio.FloatBuffer;

/**
 * This interface grants readonly access to any float matrix.
 * 
 * <p>
 * It should be prefered by design before direct usage of a type in method parameters,
 * if the method only reads data from the parameter.
 * 
 * @author picatrix1899
 */
public interface MatR
{
	/**
	 * Returns the amount of rows the matrix have.
	 * 
	 * @return The amount of rows.
	 */
	int getRowCount();
	
	/**
	 * Returns the amount of columns the matrix have.
	 * 
	 * @return The amount of columns.
	 */
	int getColumnCount();
	
	/**
	 * Returns the amount of cells the matrix have.
	 * 
	 * @return The amount of cells.
	 */
	int getCellCount();
	
	/**
	 * Returns the value of the specified cell.
	 * 
	 * @param row The index of the row the cell is in.
	 * @param column The index of the column the cell is in.
	 * 
	 * @return The value of the cell.
	 */
	float getCell(int row, int column);
	
	/**
	 * Retrieves the values of the specified row, saves them in the array and returns it.
	 * 
	 * @param row The index of the row to retrieve the values from.
	 * @param res The result array.
	 * 
	 * @return The result array with the result.
	 */
	float[] getRow(int row, float[] res);
	
	/**
	 * Retrieves the values of the specified column, saves them in the array and returns it.
	 * 
	 * @param row The index of the column to retrieve the values from.
	 * @param res The result array.
	 * 
	 * @return The result array with the result.
	 */
	float[] getColumn(int column, float[] res);
	
	/**
	 * Retrieves the values of all the cells, saves them in a new array and returns it.
	 * 
	 * @return The result array with the result.
	 */
	float[][] toArray();
	
	/**
	 * Retrieves the values of all the cells, saves them in the array and returns it.
	 * 
	 * @param res The result array.
	 * 
	 * @return The result array with the result.
	 */
	float[][] toArray(float[][] res);
	
	/**
	 * Stores the values of all cells in row major order in the array and returns it.
	 * Row major means that first all components of a row (i.e. x, y, z etc.) are stored
	 * before advancing to the next row.
	 * 
	 * <p>
	 * Example:
	 * 
	 * <table>
	 * <tbody>
	 * <tr><td>m00</td><td>m01</td><td>m02</td></tr>
	 * <tr><td>m10</td><td>m11</td><td>m12</td></tr>
	 * <tr><td>m20</td><td>m21</td><td>m22</td></tr>
	 * </tbody>
	 * </table>
	 * 
	 * Would be stored as: m00, m01, m02, m10, m11, m12, m20, m21, m22
	 * 
	 * @param res The result array.
	 * 
	 * @return The result array with the result.
	 */
	float[] toArrayRowMajor(float[] res);
	
	/**
	 * Stores the values of all cells in row major order in the buffer and returns it. The buffer does not getting flipped.
	 * Row major means that first all components of a row (i.e. x, y, z etc.) are stored
	 * before advancing to the next row.
	 * 
	 * <p>
	 * Example:
	 * 
	 * <table>
	 * <tbody>
	 * <tr><td>m00</td><td>m01</td><td>m02</td></tr>
	 * <tr><td>m10</td><td>m11</td><td>m12</td></tr>
	 * <tr><td>m20</td><td>m21</td><td>m22</td></tr>
	 * </tbody>
	 * </table>
	 * 
	 * Would be stored as: m00, m01, m02, m10, m11, m12, m20, m21, m22
	 * 
	 * @param res The buffer to store the values in.
	 * 
	 * @return The buffer with the values.
	 */
	FloatBuffer toBufferRowMajor(FloatBuffer res);
	
	/**
	 * Stores the values of all cells in column major order in the array and returns it.
	 * Column major means that first all components of a column (i.e. x, y, z etc.) are stored
	 * before advancing to the next column.
	 * 
	 * <p>
	 * Example:
	 * 
	 * <table>
	 * <tbody>
	 * <tr><td>m00</td><td>m01</td><td>m02</td></tr>
	 * <tr><td>m10</td><td>m11</td><td>m12</td></tr>
	 * <tr><td>m20</td><td>m21</td><td>m22</td></tr>
	 * </tbody>
	 * </table>
	 * 
	 * Would be stored as: m00, m10, m20, m01, m11, m21, m02, m12, m22
	 * 
	 * @param res The result array.
	 * 
	 * @return The result array with the result.
	 */
	float[] toArrayColumnMajor(float[] res);
	
	/**
	 * Stores the values of all cells in row major order in the buffer and returns it. The buffer does not getting flipped.
	 * Column major means that first all components of a column (i.e. x, y, z etc.) are stored
	 * before advancing to the next column.
	 * 
	 * <p>
	 * Example:
	 * 
	 * <table>
	 * <tbody>
	 * <tr><td>m00</td><td>m01</td><td>m02</td></tr>
	 * <tr><td>m10</td><td>m11</td><td>m12</td></tr>
	 * <tr><td>m20</td><td>m21</td><td>m22</td></tr>
	 * </tbody>
	 * </table>
	 * 
	 * Would be stored as: m00, m10, m20, m01, m11, m21, m02, m12, m22
	 * 
	 * @param res The buffer to store the values in.
	 * 
	 * @return The buffer with the values.
	 */
	FloatBuffer toBufferColumnMajor(FloatBuffer res);
	
}
