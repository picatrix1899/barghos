package org.barghos.math.api.vec2;

import org.barghos.core.api.tuple2.Tup2fR;
import org.barghos.core.api.tuple2.Tup2fW;

/**
 * This interface grants readonly access to any 2-dimensional mathematical float vector.
 * 
 * <p>
 * It should be prefered by design before direct usage of a type in method parameters,
 * if the method only reads data from the parameter.
 * 
 * @author picatrix1899
 */
public interface Vec2fR extends Tup2fR
{
	/**
	 * Adds the x and y parameter to their corresponding components in the current vector and stores the result in the object
	 * given by the parameter res. This operation does not alter the current vector.
	 * 
	 * <p>
	 * Operation: (vector.x + x, vector.y + y)
	 * 
	 * @param res The object to store the result of the operation in.
	 * @param x The value to add to the x component of the current vector.
	 * @param y The value to add to the y component of the current vector.
	 * 
	 * @return The altered result object.
	 */
	<T extends Tup2fW> T addR(T res, float x, float y);
}
