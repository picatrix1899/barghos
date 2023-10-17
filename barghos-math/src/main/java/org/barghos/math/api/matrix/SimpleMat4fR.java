package org.barghos.math.api.matrix;

import org.barghos.annotation.ExtractionParam;
import org.barghos.annotation.MinLength;
import org.barghos.annotation.MinLength2d;
import org.barghos.core.function.FloatBiFunction;
import org.barghos.core.function.FloatTriFunction;
import org.barghos.core.tuple.Tup2fC;
import org.barghos.core.tuple.Tup2fR;
import org.barghos.core.tuple.Tup3fC;
import org.barghos.core.tuple.Tup3fR;
import org.barghos.core.tuple.Tup4fC;
import org.barghos.math.api.vector.Vec3fUtils;

/**
 * This interface provides non invasive (readonly) functions and methods for basic 4x4 float matrices.
 */
public interface SimpleMat4fR extends SimpleSqrMatfR
{
	/** {@inheritDoc} */
	@Override
	SimpleMat4fR createNew();
	
	/**
	 * Creates a new instance of the type of this vector and adopts the component values from the given matrix {@code (m)}.
	 * 
	 * @param m The matrix to adopt the component values from.
	 * 
	 * @return A new instance.
	 */
	default SimpleMat4fR createNew(SimpleMat4fR m)
	{
		return createNew(m.toArray());
	}
	
	/** {@inheritDoc} */
	@Override
	SimpleMat4fR createNew(@MinLength2d(a0=4, a1=4) float[][] m);
	
	/** {@inheritDoc}} */
	@Override
	default int getRowCount()
	{
		return 4;
	}
	
	/** {@inheritDoc}} */
	@Override
	default int getColumnCount()
	{
		return 4;
	}
	
	/** {@inheritDoc}} */
	@Override
	default int getCellCount()
	{
		return 8;
	}
	
	/** {@inheritDoc}} */
	@Override
	default float[][] toArray()
	{
		return toArray(new float[4][4]);
	}
	
	/**
	 * Retrieves the values of the specified row, saves them in the array and returns it.
	 * 
	 * @param row The index of the row to retrieve the values from.
	 * @param res The result array.
	 * 
	 * @return The result array with the result.
	 */
	float[] getRow(int row, @ExtractionParam @MinLength(4) float[] res);
	
	<T extends Tup4fC> T getRow(int row, @ExtractionParam T res);
	
	/**
	 * Retrieves the values of the specified column, saves them in the array and returns it.
	 * 
	 * @param column The index of the column to retrieve the values from.
	 * @param res The result array.
	 * 
	 * @return The result array with the result.
	 */
	float[] getColumn(int column, @ExtractionParam @MinLength(4) float[] res);
	
	<T extends Tup4fC> T getColumn(int column, @ExtractionParam T res);
	
	default <T extends Tup2fC> T transform2d(T v, boolean useZ, boolean useW)
	{
		return transform2dR(v.v0(), v.v1(), useZ, useW, v);
	}
	
	default <T> T transform2dFunc(Tup2fR v, boolean useZ, boolean useW, FloatBiFunction<T> res)
	{
		return transform2dFunc(v.v0(), v.v1(), useZ, useW, res);
	}
	
	default <T> T transform2dFunc(@MinLength(2) float[] v, boolean useZ, boolean useW, FloatBiFunction<T> res)
	{
		return transform2dFunc(v[0], v[1], useZ, useW, res);
	}
	
	default <T> T transform2dFunc(float vX, float vY, boolean useZ, boolean useW, FloatBiFunction<T> res)
	{
		return Mat4fUtils.transform2dFunc(vX, vY, useZ, useW, this, res);
	}
	
	default <T extends Tup2fC> T transform2dR(Tup2fR v, boolean useZ, boolean useW, @ExtractionParam T res)
	{
		return transform2dR(v.v0(), v.v1(), useZ, useW, res);
	}
	
	default <T extends Tup2fC> T transform2dR(@MinLength(2) float[] v, boolean useZ, boolean useW, @ExtractionParam T res)
	{
		return transform2dR(v[0], v[1], useZ, useW, res);
	}
	
	default <T extends Tup2fC> T transform2dR(float vX, float vY, boolean useZ, boolean useW, @ExtractionParam T res)
	{
		return Mat4fUtils.transform2d(vX, vY, useZ,  useW, this, res);
	}
	
	default float[] transform2dR(Tup2fR v, boolean useZ, boolean useW, @ExtractionParam @MinLength(2) float[] res)
	{
		return transform2dR(v.v0(), v.v1(), useZ, useW, res);
	}

	default float[] transform2dR(@MinLength(2) float[] v, boolean useZ, boolean useW, @ExtractionParam @MinLength(2) float[] res)
	{
		return transform2dR(v[0], v[1], useZ, useW, res);
	}
	
	default float[] transform2dR(float vX, float vY, boolean useZ, boolean useW, @ExtractionParam @MinLength(2) float[] res)
	{
		return Mat4fUtils.transform2d(vX, vY, useZ, useW, this, res);
	}

	default <T extends Tup3fC> T transform3d(T v, boolean useW)
	{
		return transform3dR(v.v0(), v.v1(), v.v2(), useW, v);
	}
	
	default <T> T transform3dFunc(Tup3fR v, boolean useW, FloatTriFunction<T> res)
	{
		return transform3dFunc(v.v0(), v.v1(), v.v2(), useW, res);
	}
	
	default <T> T transform3dFunc(@MinLength(3) float[] v, boolean useW, FloatTriFunction<T> res)
	{
		return transform3dFunc(v[0], v[1], v[2], useW, res);
	}
	
	default <T> T transform3dFunc(float vX, float vY, float vZ, boolean useW, FloatTriFunction<T> res)
	{
		return Vec3fUtils.transformMat4Func(vX, vY, vZ, useW, this, res);
	}
	
	default <T extends Tup3fC> T transform3dR(Tup3fR v, boolean useW, @ExtractionParam T res)
	{
		return transform3dR(v.v0(), v.v1(), v.v2(), useW, res);
	}
	
	default <T extends Tup3fC> T transform3dR(@MinLength(3) float[] v, boolean useW, @ExtractionParam T res)
	{
		return transform3dR(v[0], v[1], v[2], useW, res);
	}
	
	default <T extends Tup3fC> T transform3dR(float vX, float vY, float vZ, boolean useW, @ExtractionParam T res)
	{
		return Vec3fUtils.transformMat4(vX, vY, vZ, useW, this, res);
	}
	
	default float[] transform3dR(Tup3fR v, boolean useW, @ExtractionParam @MinLength(3) float[] res)
	{
		return transform3dR(v.v0(), v.v1(), v.v2(), useW, res);
	}

	default float[] transform3dR(@MinLength(3) float[] v, boolean useW, @ExtractionParam @MinLength(3) float[] res)
	{
		return transform3dR(v[0], v[1], v[2], useW, res);
	}
	
	default float[] transform3dR(float vX, float vY, float vZ, boolean useW, @ExtractionParam @MinLength(3) float[] res)
	{
		return Vec3fUtils.transformMat4(vX, vY, vZ, useW, this, res);
	}
}
