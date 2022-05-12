package org.barghos.math.api.point;

import org.barghos.core.api.tuple3.Tup3dC;
import org.barghos.core.api.tuple3.Tup3dR;

/**
 * This interface grants readonly access to any 3-dimensional double point.
 * 
 * <p>
 * It should be prefered by design before direct usage of a type in method parameters,
 * if the method only reads data from the parameter.
 * 
 * @author picatrix1899
 */
public interface Point3dR extends Tup3dR
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
	<T extends Tup3dC> T copyTo(T res);
	
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
	default <T extends Tup3dC> T vectorTo(Tup3dR p, T res)
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
	<T extends Tup3dC> T vectorTo(double pX, double pY, double pZ, T res);
	
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
	default <T extends Tup3dC> T vectorFrom(Tup3dR p, T res)
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
	<T extends Tup3dC> T vectorFrom(double pX, double pY, double pZ, T res);
}
