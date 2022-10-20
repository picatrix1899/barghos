//package org.barghos.math.api.matrix;
//
//import org.barghos.core.api.tuple2.Tup2fC;
//import org.barghos.core.api.tuple2.Tup2fR;
//import org.barghos.core.api.tuple3.Tup3fC;
//import org.barghos.core.api.tuple3.Tup3fR;
//import org.barghos.core.api.tuple4.Tup4fC;
//import org.barghos.core.api.tuple4.Tup4fR;
//
//import static org.barghos.math.api.matrix.MatrixConstants.*;
//
///**
// * This interface grants readonly access to any 4 by 4 float matrix.
// * 
// * <p>
// * It should be prefered by design before direct usage of a type in method parameters,
// * if the method only reads data from the parameter.
// * 
// * @author picatrix1899
// */
//public interface Mat4fR extends SqrMatR
//{
//	/** {@inheritDoc}} */
//	@Override
//	default int getRowCount()
//	{
//		return M4_ROWS;
//	}
//	
//	/** {@inheritDoc}} */
//	@Override
//	default int getColumnCount()
//	{
//		return M4_COLUMNS;
//	}
//	
//	/** {@inheritDoc}} */
//	@Override
//	default int getCellCount()
//	{
//		return M4_CELLS;
//	}
//	
//	/** {@inheritDoc}} */
//	@Override
//	default float[][] toArray()
//	{
//		return toArray(new float[M4_ROWS][M4_COLUMNS]);
//	}
//	
//	/**
//	 * Applies the current matrix to the tuple and therefore transforming it. If needed the additional
//	 * columns z and w can be included in the calculation by setting the corresponding parameter to true.
//	 * The result of the transformation is saved in the query parameter.
//	 * 
//	 * @param <T> The type of the query parameter.
//	 * 
//	 * @param t The tuple to transform.
//	 * @param useZ A flag to include the z column in the calculation.
//	 * @param useW A flag to include the w column in the calculation.
//	 * @param res The query parameter.
//	 * 
//	 * @return The query parameter with the result.
//	 */
//	default <T extends Tup2fC> T transform(Tup2fR t, boolean useZ, boolean useW, T res)
//	{
//		return transform(t.getX(), t.getY(), useZ, useW, res);
//	}
//	
//	/**
//	 * Applies the current matrix to the tuple definded by the components and therefore transforming it. If needed the additional
//	 * columns z and w can be included in the calculation by setting the corresponding parameter to true.
//	 * The result of the transformation is saved in the query parameter.
//	 * 
//	 * @param <T> The type of the query parameter.
//	 * 
//	 * @param tX The value of the x component of the tuple to transform.
//	 * @param tY The value of the y component of the tuple to transform.
//	 * @param useZ A flag to include the z column in the calculation.
//	 * @param useW A flag to include the w column in the calculation.
//	 * @param res The query parameter.
//	 * 
//	 * @return The query parameter with the result.
//	 */
//	<T extends Tup2fC> T transform(float tX, float tY, boolean useZ, boolean useW, T res);
//	
//	/**
//	 * Applies the current matrix to the tuple definded by the components and therefore transforming it. If needed the additional
//	 * columns z and w can be included in the calculation by setting the corresponding parameter to true.
//	 * The result of the transformation is saved in the array.
//	 * 
//	 * @param tX The value of the x component of the tuple to transform.
//	 * @param tY The value of the y component of the tuple to transform.
//	 * @param useZ A flag to include the z column in the calculation.
//	 * @param useW A flag to include the w column in the calculation.
//	 * @param res The result array.
//	 * 
//	 * @return The result array with the result.
//	 */
//	float[] transform(float tX, float tY, boolean useZ, boolean useW, float[] res);
//	
//	/**
//	 * Applies the current matrix to the tuple and therefore transforming it. If needed the additional
//	 * column w can be included in the calculation by setting the corresponding parameter to true.
//	 * The result of the transformation is saved in the query parameter.
//	 * 
//	 * @param <T> The type of the query parameter.
//	 * 
//	 * @param t The tuple to transform.
//	 * @param useW A flag to include the w column in the calculation.
//	 * @param res The query parameter.
//	 * 
//	 * @return The query parameter with the result.
//	 */
//	default <T extends Tup3fC> T transform(Tup3fR t, boolean useW, T res)
//	{
//		return transform(t.getX(), t.getY(), t.getZ(), useW, res);
//	}
//	
//	/**
//	 * Applies the current matrix to the tuple definded by the components and therefore transforming it. If needed the additional
//	 * column w can be included in the calculation by setting the corresponding parameter to true.
//	 * The result of the transformation is saved in the query parameter.
//	 * 
//	 * @param <T> The type of the query parameter.
//	 * 
//	 * @param tX The value of the x component of the tuple to transform.
//	 * @param tY The value of the y component of the tuple to transform.
//	 * @param tZ The value of the z component of the tuple to transform.
//	 * @param useW A flag to include the w column in the calculation.
//	 * @param res The query parameter.
//	 * 
//	 * @return The query parameter with the result.
//	 */
//	<T extends Tup3fC> T transform(float tX, float tY, float tZ, boolean useW, T res);
//	
//	/**
//	 * Applies the current matrix to the tuple definded by the components and therefore transforming it. If needed the additional
//	 * column w can be included in the calculation by setting the corresponding parameter to true.
//	 * The result of the transformation is saved in the array.
//	 * 
//	 * @param tX The value of the x component of the tuple to transform.
//	 * @param tY The value of the y component of the tuple to transform.
//	 * @param tZ The value of the z component of the tuple to transform.
//	 * @param useW A flag to include the w column in the calculation.
//	 * @param res The result array.
//	 * 
//	 * @return The result array with the result.
//	 */
//	float[] transform(float tX, float tY, float tZ, boolean useW, float[] res);
//	
//	/**
//	 * Applies the current matrix to the tuple and therefore transforming it.
//	 * The result of the transformation is saved in the query parameter.
//	 * 
//	 * @param <T> The type of the query parameter.
//	 * 
//	 * @param t The tuple to transform.
//	 * @param res The query parameter.
//	 * 
//	 * @return The query parameter with the result.
//	 */
//	default <T extends Tup4fC> T transform(Tup4fR t, T res)
//	{
//		return transform(t.getX(), t.getY(), t.getZ(), t.getW(), res);
//	}
//	
//	/**
//	 * Applies the current matrix to the tuple definded by the components and therefore transforming it.
//	 * The result of the transformation is saved in the query parameter.
//	 * 
//	 * @param <T> The type of the query parameter.
//	 * 
//	 * @param tX The value of the x component of the tuple to transform.
//	 * @param tY The value of the y component of the tuple to transform.
//	 * @param tZ The value of the z component of the tuple to transform.
//	 * @param tW The value of the w component of the tuple to transform.
//	 * @param res The query parameter.
//	 * 
//	 * @return The query parameter with the result.
//	 */
//	<T extends Tup4fC> T transform(float tX, float tY, float tZ, float tW, T res);
//	
//	/**
//	 * Applies the current matrix to the tuple definded by the components and therefore transforming it.
//	 * The result of the transformation is saved in the array.
//	 * 
//	 * @param tX The value of the x component of the tuple to transform.
//	 * @param tY The value of the y component of the tuple to transform.
//	 * @param tZ The value of the z component of the tuple to transform.
//	 * @param tW The value of the w component of the tuple to transform.
//	 * @param res The result array.
//	 * 
//	 * @return The result array with the result.
//	 */
//	float[] transform(float tX, float tY, float tZ, float tW, float[] res);
//	
//	/**
//	 * Calculates the trace of the current matrix.
//	 * 
//	 * @return The trace of the current matrix.
//	 */
//	float trace();
//}
