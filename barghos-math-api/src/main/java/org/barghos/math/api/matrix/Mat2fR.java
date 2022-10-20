//package org.barghos.math.api.matrix;
//
//import org.barghos.core.api.tuple2.Tup2fC;
//import org.barghos.core.api.tuple2.Tup2fR;
//
///**
// * This interface grants readonly access to any 2 by 2 float matrix.
// * 
// * <p>
// * It should be prefered by design before direct usage of a type in method parameters,
// * if the method only reads data from the parameter.
// * 
// * @author picatrix1899
// */
//public interface Mat2fR extends SqrMatR
//{
//	/** {@inheritDoc}} */
//	@Override
//	default int getRowCount()
//	{
//		return 2;
//	}
//	
//	/** {@inheritDoc}} */
//	@Override
//	default int getColumnCount()
//	{
//		return 2;
//	}
//	
//	/** {@inheritDoc}} */
//	@Override
//	default int getCellCount()
//	{
//		return 4;
//	}
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
//	default <T extends Tup2fC> T transform(Tup2fR t, T res)
//	{
//		return transform(t.getX(), t.getY(), res);
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
//	 * @param res The query parameter.
//	 * 
//	 * @return The query parameter with the result.
//	 */
//	<T extends Tup2fC> T transform(float tX, float tY, T res);
//	
//	/**
//	 * Applies the current matrix to the tuple definded by the components and therefore transforming it.
//	 * The result of the transformation is saved in the array.
//	 * 
//	 * @param tX The value of the x component of the tuple to transform.
//	 * @param tY The value of the y component of the tuple to transform.
//	 * @param res The result array.
//	 * 
//	 * @return The result array with the result.
//	 */
//	float[] transform(float tX, float tY, float[] res);
//}
