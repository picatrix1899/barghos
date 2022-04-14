package org.barghos.math.api.point;

import org.barghos.core.api.tuple2.Tup2fBase;
import org.barghos.core.api.tuple2.Tup2fR;

/**
 * This interface grants readonly access to any 2-dimensional float point.
 * 
 * <p>
 * It should be prefered by design before direct usage of a type in method parameters,
 * if the method only reads data from the parameter.
 * 
 * @author picatrix1899
 */
public interface Point2fR extends Tup2fR
{
	/**
	 * Copies the values of the components of the current point to the query parameter.
	 * 
	 * @param <T> The type of the query parameter.
	 * 
	 * @param res The query parameter.
	 * 
	 * @return The query parameter with the values.
	 */
	<T extends Tup2fBase> T copyTo(T res);
	
	/**
	 * Calculates the vector from this point to the given second point and saves the result in the
	 * query parameter.
	 * 
	 * @param <T> The type of the query parameter.
	 * 
	 * @param p The second point.
	 * @param res The query parameter.
	 * 
	 * @return The query parameter with the result.
	 */
	<T extends Tup2fBase> T vectorTo(Point2dR p, T res);
	
	/**
	 * Calculates the vector from this point to the given second point defined by the components and saves the result in the
	 * query parameter.
	 * 
	 * @param <T> The type of the query parameter.
	 * 
	 * @param pX The value of the x component of the second point.
	 * @param pY The value of the y component of the second point.
	 * @param res The query parameter.
	 * 
	 * @return The query parameter with the result.
	 */
	<T extends Tup2fBase> T vectorTo(float pX, float pY, T res);
	
	/**
	 * Calculates the vector from the given second point to this point and saves the result in the
	 * query parameter.
	 * 
	 * @param <T> The type of the query parameter.
	 * 
	 * @param p The second point.
	 * @param res The query parameter.
	 * 
	 * @return The query parameter with the result.
	 */
	<T extends Tup2fBase> T vectorFrom(Point2dR p, T res);
	
	/**
	 * Calculates the vector from the given second point defined by the components to this point and saves the result in the
	 * query parameter.
	 * 
	 * @param <T> The type of the query parameter.
	 * 
	 * @param pX The value of the x component of the second point.
	 * @param pY The value of the y component of the second point.
	 * @param res The query parameter.
	 * 
	 * @return The query parameter with the result.
	 */
	<T extends Tup2fBase> T vectorFrom(float pX, float pY, T res);
}
