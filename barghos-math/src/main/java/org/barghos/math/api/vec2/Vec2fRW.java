package org.barghos.math.api.vec2;

import org.barghos.core.api.tuple2.Tup2fR;
import org.barghos.core.api.tuple2.Tup2fRW;

/**
 * This interface grants read and write access to any 2-dimensional mathematical float vector.
 * 
 * @author picatrix1899
 */
public interface Vec2fRW extends Vec2fR, Vec2fW, Tup2fRW
{
	@Override
	Vec2fRW setX(float x);
	
	@Override
	Vec2fRW setY(float y);
	
	@Override
	Vec2fRW set(Tup2fR t);
	
	@Override
	Vec2fRW set(float value);
	
	@Override
	Vec2fRW set(float x, float y);
	
	@Override
	Vec2fRW add(float x, float y);
	
	/**
	 * Adds the x and y parameter to their corresponding components in the current vector and stores the result in a new instance.
	 * This operation does not alter the current vector.
	 * 
	 * <p>
	 * Operation: (vector.x + x, vector.y + y)
	 * 
	 * @param x The value to add to the x component of the current vector.
	 * @param y The value to add to the y component of the current vector.
	 * 
	 * @return The altered result object.
	 */
	Vec2fRW addN(float x, float y);
}
