package org.barghos.math.api.vec2;

import org.barghos.core.api.tuple2.Tup2fR;
import org.barghos.core.api.tuple2.Tup2fW;

/**
 * This interface grants writeonly access to any 2-dimensional mathematical float vector.
 * 
 * <p>
 * It should be prefered by design before direct usage of a type in method parameters,
 * if the method only writes data to the parameter.
 * 
 * @author picatrix1899
 */
public interface Vec2fW extends Tup2fW
{
	@Override
	Vec2fW setX(float x);
	
	@Override
	Vec2fW setY(float y);
	
	@Override
	Vec2fW set(Tup2fR t);
	
	@Override
	Vec2fW set(float value);
	
	@Override
	Vec2fW set(float x, float y);
	
	/**
	 * Adds the x and y parameter to their corresponding components in the current vector. This operation
	 * alters the current vector.
	 * 
	 * <p>
	 * Operation: (vector.x + x, vector.y + y)
	 * 
	 * @param x The value to add to the x component of the current vector.
	 * @param y The value to add to the y component of the current vector.
	 * 
	 * @return The altered current vector.
	 */
	Vec2fW add(float x, float y);
}
