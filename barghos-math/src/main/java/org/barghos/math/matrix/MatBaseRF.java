package org.barghos.math.matrix;

import java.nio.FloatBuffer;

import org.barghos.annotation.ExtractionParam;

/**
 * This interface provides non invasive (readonly) functions and methods for all float matrices.
 */
public interface MatBaseRF
{
	/**
	 * Creates a new instance of the type of this matrix.
	 * 
	 * @return A new instance.
	 */
	MatBaseRF createNew();
	
	/**
	 * Creates a new instance of the type of this matrix and adopts the component values from the
	 * given matrix {@code (m)}.
	 * 
	 * @param m
	 *     The matrix as an array to adopt the component values from. The two indices of the array
	 *     are expected to represent first the row and second the column {@code m[row][column]}.
	 * 
	 * @return A new instance.
	 */
	MatBaseRF createNew(float[][] m);
	
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
	 * @param row
	 *     The index of the row the cell is in.
	 * @param column
	 *     The index of the column the cell is in.
	 * 
	 * @return The value of the cell.
	 */
	float getCell(int row, int column);
	
	/**
	 * Retrieves the values of the specified row and returns them in a new array.
	 * 
	 * @param row
	 *     The index of the row to retrieve the values from.
	 * 
	 * @return A new array with the result.
	 */
	float[] getRow(int row);
	
	/**
	 * Retrieves the values of the specified row and saves them in the given extraction parameter.
	 * 
	 * @param row
	 *     The index of the row to retrieve the values from.
	 * @param res
	 *     The extraction parameter for the result as an array.
	 * 
	 * @return The extraction parameter with the result.
	 */
	float[] getRow(int row, @ExtractionParam float[] res);
	
	/**
	 * Retrieves the values of the specified column and returns them in a new array.
	 * 
	 * @param column
	 *     The index of the column to retrieve the values from.
	 * 
	 * @return A new array with the result.
	 */
	float[] getColumn(int column);
	
	/**
	 * Retrieves the values of the specified column and saves them in the given extraction
	 * parameter.
	 * 
	 * @param column
	 *     The index of the column to retrieve the values from.
	 * @param res
	 *     The extraction parameter for the result as an array.
	 * 
	 * @return The extraction parameter with the result.
	 */
	float[] getColumn(int column, @ExtractionParam float[] res);
	
	/**
	 * Retrieves the values of all the cells and returns the in a new array.
	 * 
	 * @return A new array with the result. The first index of the array represents the row and the
	 * second index the column {@code m[row][column]}.
	 */
	float[][] toArray();
	
	/**
	 * Retrieves the values of all the cells and saves them in the given extraction parameter.
	 * 
	 * @param res
	 *     The extraction parameter for the result as an array. The two indices of the array are
	 *     expected to represent first the row and second the column {@code m[row][column]}.
	 * 
	 * @return The extraction parameter with the result.
	 */
	float[][] toArray(@ExtractionParam float[][] res);
	
	/**
	 * Stores the values of all cells in row major order in a new array and returns it. Row major
	 * means that first all components of a row (i.e. x, y, z etc.) are stored before advancing to
	 * the next row.
	 * 
	 * <p>
	 * Example:
	 * 
	 * <table>
	 * <tbody>
	 * <tr>
	 * <td>m00</td>
	 * <td>m01</td>
	 * <td>m02</td>
	 * </tr>
	 * <tr>
	 * <td>m10</td>
	 * <td>m11</td>
	 * <td>m12</td>
	 * </tr>
	 * <tr>
	 * <td>m20</td>
	 * <td>m21</td>
	 * <td>m22</td>
	 * </tr>
	 * </tbody>
	 * </table>
	 * 
	 * Would be stored as: m00, m01, m02, m10, m11, m12, m20, m21, m22
	 * 
	 * @return A new array with the result.
	 */
	float[] toArrayRowMajor();
	
	/**
	 * Stores the values of all cells in row major order in the given extraction parameter. Row
	 * major means that first all components of a row (i.e. x, y, z etc.) are stored before
	 * advancing to the next row.
	 * 
	 * <p>
	 * Example:
	 * 
	 * <table>
	 * <tbody>
	 * <tr>
	 * <td>m00</td>
	 * <td>m01</td>
	 * <td>m02</td>
	 * </tr>
	 * <tr>
	 * <td>m10</td>
	 * <td>m11</td>
	 * <td>m12</td>
	 * </tr>
	 * <tr>
	 * <td>m20</td>
	 * <td>m21</td>
	 * <td>m22</td>
	 * </tr>
	 * </tbody>
	 * </table>
	 * 
	 * Would be stored as: m00, m01, m02, m10, m11, m12, m20, m21, m22
	 * 
	 * @param res
	 *     The extraction parameter for the result as an array.
	 * 
	 * @return The extraction parameter with the result.
	 */
	float[] toArrayRowMajor(@ExtractionParam float[] res);
	
	/**
	 * Stores the values of all cells in row major order in the buffer and returns it. The buffer
	 * does not getting flipped. Row major means that first all components of a row (i.e. x, y, z
	 * etc.) are stored before advancing to the next row.
	 * 
	 * <p>
	 * Example:
	 * 
	 * <table>
	 * <tbody>
	 * <tr>
	 * <td>m00</td>
	 * <td>m01</td>
	 * <td>m02</td>
	 * </tr>
	 * <tr>
	 * <td>m10</td>
	 * <td>m11</td>
	 * <td>m12</td>
	 * </tr>
	 * <tr>
	 * <td>m20</td>
	 * <td>m21</td>
	 * <td>m22</td>
	 * </tr>
	 * </tbody>
	 * </table>
	 * 
	 * Would be stored as: m00, m01, m02, m10, m11, m12, m20, m21, m22
	 * 
	 * @param res
	 *     The buffer to store the values in.
	 * 
	 * @return The buffer with the values.
	 */
	FloatBuffer toBufferRowMajor(FloatBuffer res);
	
	/**
	 * Stores the values of all cells in column major order in a new array and returns it. Column
	 * major means that first all components of a column (i.e. x, y, z etc.) are stored before
	 * advancing to the next column.
	 * 
	 * <p>
	 * Example:
	 * 
	 * <table>
	 * <tbody>
	 * <tr>
	 * <td>m00</td>
	 * <td>m01</td>
	 * <td>m02</td>
	 * </tr>
	 * <tr>
	 * <td>m10</td>
	 * <td>m11</td>
	 * <td>m12</td>
	 * </tr>
	 * <tr>
	 * <td>m20</td>
	 * <td>m21</td>
	 * <td>m22</td>
	 * </tr>
	 * </tbody>
	 * </table>
	 * 
	 * Would be stored as: m00, m10, m20, m01, m11, m21, m02, m12, m22
	 * 
	 * @return A new array with the result.
	 */
	float[] toArrayColumnMajor();
	
	/**
	 * Stores the values of all cells in column major order in the given extraction parameter.
	 * Column major means that first all components of a column (i.e. x, y, z etc.) are stored
	 * before advancing to the next column.
	 * 
	 * <p>
	 * Example:
	 * 
	 * <table>
	 * <tbody>
	 * <tr>
	 * <td>m00</td>
	 * <td>m01</td>
	 * <td>m02</td>
	 * </tr>
	 * <tr>
	 * <td>m10</td>
	 * <td>m11</td>
	 * <td>m12</td>
	 * </tr>
	 * <tr>
	 * <td>m20</td>
	 * <td>m21</td>
	 * <td>m22</td>
	 * </tr>
	 * </tbody>
	 * </table>
	 * 
	 * Would be stored as: m00, m10, m20, m01, m11, m21, m02, m12, m22
	 * 
	 * @param res
	 *     The extraction parameter for the result as an array.
	 * 
	 * @return The extraction parameter with the result.
	 */
	float[] toArrayColumnMajor(@ExtractionParam float[] res);
	
	/**
	 * Stores the values of all cells in row major order in the buffer and returns it. The buffer
	 * does not getting flipped. Column major means that first all components of a column (i.e. x,
	 * y, z etc.) are stored before advancing to the next column.
	 * 
	 * <p>
	 * Example:
	 * 
	 * <table>
	 * <tbody>
	 * <tr>
	 * <td>m00</td>
	 * <td>m01</td>
	 * <td>m02</td>
	 * </tr>
	 * <tr>
	 * <td>m10</td>
	 * <td>m11</td>
	 * <td>m12</td>
	 * </tr>
	 * <tr>
	 * <td>m20</td>
	 * <td>m21</td>
	 * <td>m22</td>
	 * </tr>
	 * </tbody>
	 * </table>
	 * 
	 * Would be stored as: m00, m10, m20, m01, m11, m21, m02, m12, m22
	 * 
	 * @param res
	 *     The buffer to store the values in.
	 * 
	 * @return The buffer with the values.
	 */
	FloatBuffer toBufferColumnMajor(FloatBuffer res);
	
}
