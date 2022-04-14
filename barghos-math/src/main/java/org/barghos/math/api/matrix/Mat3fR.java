package org.barghos.math.api.matrix;

import org.barghos.core.api.tuple2.Tup2fBase;
import org.barghos.core.api.tuple2.Tup2fR;
import org.barghos.core.api.tuple3.Tup3fBase;
import org.barghos.core.api.tuple3.Tup3fR;

/**
 * This interface grants readonly access to any 3 by 3 float matrix.
 * 
 * <p>
 * It should be prefered by design before direct usage of a type in method parameters,
 * if the method only reads data from the parameter.
 * 
 * @author picatrix1899
 */
public interface Mat3fR extends SqrMatR
{
	/** {@inheritDoc}} */
	@Override
	default int getRowCount()
	{
		return 3;
	}
	
	/** {@inheritDoc}} */
	@Override
	default int getColumnCount()
	{
		return 3;
	}
	
	/** {@inheritDoc}} */
	@Override
	default int getCellCount()
	{
		return 9;
	}
	
	/**
	 * Applies the current matrix to the tuple and therefore transforming it. If needed the additional
	 * column z can be included in the calculation by setting the corresponding parameter to true.
	 * The result of the transformation is saved in the query parameter.
	 * 
	 * @param <T> The type of the query parameter.
	 * 
	 * @param t The tuple to transform.
	 * @param useZ A flag to include the z column in the calculation.
	 * @param res The query parameter.
	 * 
	 * @return The query parameter with the result.
	 */
	default <T extends Tup2fBase> T transform(Tup2fR t, boolean useZ, T res)
	{
		return transform(t.getX(), t.getY(), useZ, res);
	}
	
	/**
	 * Applies the current matrix to the tuple definded by the components and therefore transforming it. If needed the additional
	 * column z can be included in the calculation by setting the corresponding parameter to true.
	 * The result of the transformation is saved in the query parameter.
	 * 
	 * @param <T> The type of the query parameter.
	 * 
	 * @param tX The value of the x component of the tuple to transform.
	 * @param tY The value of the y component of the tuple to transform.
	 * @param useZ A flag to include the z column in the calculation.
	 * @param res The query parameter.
	 * 
	 * @return The query parameter with the result.
	 */
	<T extends Tup2fBase> T transform(float tX, float tY, boolean useZ, T res);
	
	/**
	 * Applies the current matrix to the tuple definded by the components and therefore transforming it. If needed the additional
	 * column z can be included in the calculation by setting the corresponding parameter to true.
	 * The result of the transformation is saved in the array.
	 * 
	 * @param tX The value of the x component of the tuple to transform.
	 * @param tY The value of the y component of the tuple to transform.
	 * @param useZ A flag to include the z column in the calculation.
	 * @param res The result array.
	 * 
	 * @return The result array with the result.
	 */
	float[] transform(float tX, float tY, boolean useZ, float[] res);
	
	/**
	 * Applies the current matrix to the tuple and therefore transforming it.
	 * The result of the transformation is saved in the query parameter.
	 * 
	 * @param <T> The type of the query parameter.
	 * 
	 * @param t The tuple to transform.
	 * @param res The query parameter.
	 * 
	 * @return The query parameter with the result.
	 */
	default <T extends Tup3fBase> T transform(Tup3fR t, T res)
	{
		return transform(t.getX(), t.getY(), t.getZ(), res);
	}
	
	/**
	 * Applies the current matrix to the tuple definded by the components and therefore transforming it.
	 * The result of the transformation is saved in the query parameter.
	 * 
	 * @param <T> The type of the query parameter.
	 * 
	 * @param tX The value of the x component of the tuple to transform.
	 * @param tY The value of the y component of the tuple to transform.
	 * @param tZ The value of the z component of the tuple to transform.
	 * @param res The query parameter.
	 * 
	 * @return The query parameter with the result.
	 */
	<T extends Tup3fBase> T transform(float tX, float tY, float tZ, T res);
	
	/**
	 * Applies the current matrix to the tuple definded by the components and therefore transforming it.
	 * The result of the transformation is saved in the array.
	 * 
	 * @param tX The value of the x component of the tuple to transform.
	 * @param tY The value of the y component of the tuple to transform.
	 * @param tZ The value of the z component of the tuple to transform.
	 * @param res The result array.
	 * 
	 * @return The result array with the result.
	 */
	float[] transform(float tX, float tY, float tZ, float[] res);
}
