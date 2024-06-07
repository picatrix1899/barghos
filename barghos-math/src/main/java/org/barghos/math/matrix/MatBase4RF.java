package org.barghos.math.matrix;

import org.barghos.annotation.ExtractionParam;
import org.barghos.util.tuple.floats.Tup2RF;
import org.barghos.util.tuple.floats.Tup2WF;
import org.barghos.util.tuple.floats.Tup3RF;
import org.barghos.util.tuple.floats.Tup3WF;
import org.barghos.util.tuple.floats.Tup4WF;

/**
 * This interface provides non invasive (readonly) functions and methods for basic 4x4 float matrices.
 */
public interface MatBase4RF extends SqrMatBaseRF
{
	/** {@inheritDoc} */
	@Override
	MatBase4RF createNew();
	
	/**
	 * Creates a new instance of the type of this vector and adopts the component values from the given matrix {@code (m)}.
	 * 
	 * @param m The matrix to adopt the component values from.
	 * 
	 * @return A new instance.
	 */
	MatBase4RF createNew(MatBase4RF m);
	
	/** {@inheritDoc} */
	@Override
	MatBase4RF createNew(float[][] m);
	
	/** {@inheritDoc}} */
	@Override
	default int getRowCount()
	{
		return 4;
	}
	
	/** {@inheritDoc}} */
	@Override
	default int getColumnCount()
	{
		return 4;
	}
	
	/** {@inheritDoc}} */
	@Override
	default int getCellCount()
	{
		return 16;
	}
	
	/** {@inheritDoc}} */
	@Override
	float[][] toArray();
	
	/**
	 * Retrieves the values of the specified row, saves them in the array and returns it.
	 * 
	 * @param row The index of the row to retrieve the values from.
	 * @param res The result array.
	 * 
	 * @return The result array with the result.
	 */
	float[] getRow(int row, @ExtractionParam float[] res);
	
	<T extends Tup4WF> T getRow(int row, @ExtractionParam T res);
	
	/**
	 * Retrieves the values of the specified column, saves them in the array and returns it.
	 * 
	 * @param column The index of the column to retrieve the values from.
	 * @param res The result array.
	 * 
	 * @return The result array with the result.
	 */
	float[] getColumn(int column, @ExtractionParam float[] res);
	
	<T extends Tup4WF> T getColumn(int column, @ExtractionParam T res);
	
	<T extends Tup2WF> T transform2d(T v, boolean useZ, boolean useW);

	<T extends Tup2WF> T transform2dR(Tup2RF v, boolean useZ, boolean useW, @ExtractionParam T res);
	
	<T extends Tup2WF> T transform2dR(float[] v, boolean useZ, boolean useW, @ExtractionParam T res);
	
	<T extends Tup2WF> T transform2dR(float vX, float vY, boolean useZ, boolean useW, @ExtractionParam T res);
	
	float[] transform2dR(Tup2RF v, boolean useZ, boolean useW, @ExtractionParam float[] res);

	float[] transform2dR(float[] v, boolean useZ, boolean useW, @ExtractionParam float[] res);
	
	float[] transform2dR(float vX, float vY, boolean useZ, boolean useW, @ExtractionParam float[] res);

	<T extends Tup3WF> T transform3d(T v, boolean useW);

	<T extends Tup3WF> T transform3dR(Tup3RF v, boolean useW, @ExtractionParam T res);
	
	<T extends Tup3WF> T transform3dR(float[] v, boolean useW, @ExtractionParam T res);
	
	<T extends Tup3WF> T transform3dR(float vX, float vY, float vZ, boolean useW, @ExtractionParam T res);
	
	float[] transform3dR(Tup3RF v, boolean useW, @ExtractionParam float[] res);

	float[] transform3dR(float[] v, boolean useW, @ExtractionParam float[] res);
	
	float[] transform3dR(float vX, float vY, float vZ, boolean useW, @ExtractionParam float[] res);
}
