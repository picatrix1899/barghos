package org.barghos.math.api.quaternion;

import org.barghos.annotation.ExtractionParam;
import org.barghos.annotation.MinLength;
import org.barghos.core.function.FloatTriFunction;
import org.barghos.core.tuple.Tup3fC;
import org.barghos.core.tuple.Tup3fR;
import org.barghos.core.tuple.Tup4fR;
import org.barghos.math.api.vector.Vec3fUtils;

/**
 * This interface provides non invasive (readonly) functions and methods for basic float quaternions.
 */
public interface SimpleQuatfR extends Tup4fR
{
	/**
	 * Creates a new instance of the current class with the same component values.
	 * 
	 * @return A new instance.
	 */
	@Override
	SimpleQuatfR copy();
	
	/**
	 * Returns the value of the w component of the quaternion.
	 * 
	 * @return The value of the w component.
	 */
	float w();
	
	/**
	 * Returns the value of the x component of the quaternion.
	 * 
	 * @return The value of the x component.
	 */
	float x();
	
	/**
	 * Returns the value of the y component of the quaternion.
	 * 
	 * @return The value of the y component.
	 */
	float y();
	
	/**
	 * Returns the value of the z component of the quaternion.
	 * 
	 * @return The value of the z component.
	 */
	float z();
	
	/** {@inheritDoc} */
	@Override
	default float v0()
	{
		return w();
	}
	
	/** {@inheritDoc} */
	@Override
	default float v1()
	{
		return x();
	}
	
	/** {@inheritDoc} */
	@Override
	default float v2()
	{
		return y();
	}
	
	/** {@inheritDoc} */
	@Override
	default float v3()
	{
		return z();
	}
	
	/**
	 * transforms the given vector {@code (v)} by this quaternion.
	 * 
	 * @param <T> The type of the vector.
	 * 
	 * @param v The vector.
	 * 
	 * @return The vector.
	 */
	default <T extends Tup3fC> T transform(T v)
	{
		return Vec3fUtils.transformQuat(v, this, v);
	}
	
	/**
	 * transforms the given vector {@code (v)} by this quaternion, supplies the result to the
	 * given implementation of the functional interface and returns the result of that
	 * implementation.
	 * 
	 * @param <T> The type of the result object.
	 * 
	 * @param v The vector.
	 * @param res A functional interface implementation for consuming the supplied result.
	 * 
	 * @return The result returned from the given functional interface implementation.
	 */
	default <T> T transformFunc(Tup3fR v, FloatTriFunction<T> res)
	{
		return Vec3fUtils.transformQuatFunc(v, this, res);
	}
	
	/**
	 * transforms the given vector {@code (v)} by this quaternion, supplies the result to the
	 * given implementation of the functional interface and returns the result of that
	 * implementation.
	 * 
	 * @param <T> The type of the result object.
	 * 
	 * @param v The vector.
	 * @param res A functional interface implementation for consuming the supplied result.
	 * 
	 * @return The result returned from the given functional interface implementation.
	 */
	default <T> T transformFunc(float[] v, FloatTriFunction<T> res)
	{
		return Vec3fUtils.transformQuatFunc(v, this, res);
	}
	
	default <T> T transformFunc(float vX, float vY, float vZ, FloatTriFunction<T> res)
	{
		return Vec3fUtils.transformQuatFunc(vX, vY, vZ, this, res);
	}
	
	/**
	 * transforms the given vector {@code (v)} by this quaternion and saves the result in the given
	 * extraction parameter object.
	 * 
	 * @param <T> The type of the extraction parameter object.
	 * @param v The vector.
	 * @param res The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	default <T extends Tup3fC> T transformR(Tup3fR v, @ExtractionParam T res)
	{
		return Vec3fUtils.transformQuat(v, this, res);
	}
	
	default <T extends Tup3fC> T transformR(float[] v, @ExtractionParam T res)
	{
		return Vec3fUtils.transformQuat(v, this, res);
	}
	
	default <T extends Tup3fC> T transformR(float vX, float vY, float vZ, @ExtractionParam T res)
	{
		return Vec3fUtils.transformQuat(vX, vY, vZ, this, res);
	}
	
	/**
	 * transforms the given vector {@code (v)} by this quaternion and saves the result in the given extraction parameter.
	 * 
	 * @param v The vector.
	 * @param res The extraction parameter for the result as an array with at least three entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	default float[] transformR(Tup3fR v, @ExtractionParam @MinLength(3) float[] res)
	{
		return Vec3fUtils.transformQuat(v, this, res);
	}
	
	default float[] transformR(float[] v, @ExtractionParam @MinLength(3) float[] res)
	{
		return Vec3fUtils.transformQuat(v, this, res);
	}
	
	default float[] transformR(float vX, float vY, float vZ, @ExtractionParam @MinLength(3) float[] res)
	{
		return Vec3fUtils.transformQuat(vX, vY, vZ, this, res);
	}
}
