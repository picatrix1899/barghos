package org.barghos.math.api.point;

import org.barghos.core.api.tuple3.Tup3fC;
import org.barghos.core.api.tuple3.Tup3fR;
import org.barghos.math.api.vector.Vec3fR;

/**
 * This interface grants readonly access to any 3-dimensional float point.
 * 
 * <p>
 * It should be prefered by design before direct usage of a type in method parameters,
 * if the method only reads data from the parameter.
 * 
 * @author picatrix1899
 */
public interface Point3fR extends Vec3fR
{	
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
	default <T extends Tup3fC> T vectorTo(Tup3fR p, T res)
	{
		return vectorTo(p.getX(), p.getY(), p.getZ(), res);
	}
	
	/**
	 * Calculates the vector from this point to the given second point defined by the components and saves the result in the
	 * query parameter.
	 * 
	 * @param <T> The type of the query parameter.
	 * 
	 * @param pX The value of the x component of the second point.
	 * @param pY The value of the y component of the second point.
	 * @param pZ The value of the z component of the second point.
	 * @param res The query parameter.
	 * 
	 * @return The query parameter with the result.
	 */
	<T extends Tup3fC> T vectorTo(float pX, float pY, float pZ, T res);
	
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
	default <T extends Tup3fC> T vectorFrom(Tup3fR p, T res)
	{
		return vectorFrom(p.getX(), p.getY(), p.getZ(), res);
	}
	
	/**
	 * Calculates the vector from the given second point defined by the components to this point and saves the result in the
	 * query parameter.
	 * 
	 * @param <T> The type of the query parameter.
	 * 
	 * @param pX The value of the x component of the second point.
	 * @param pY The value of the y component of the second point.
	 * @param pZ The value of the z component of the second point.
	 * @param res The query parameter.
	 * 
	 * @return The query parameter with the result.
	 */
	<T extends Tup3fC> T vectorFrom(float pX, float pY, float pZ, T res);
}
