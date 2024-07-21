package org.barghos.math.vector;

import org.barghos.annotation.ExtractionParam;
import org.barghos.util.math.MathProvider;
import org.barghos.util.math.MathUtils;
import org.barghos.util.tuple.floats.Tup2RF;
import org.barghos.util.tuple.floats.Tup2WF;
import org.barghos.util.tuple.floats.TupUtils2F;

/**
 * This class provides vector operations for two dimensions.
 */
public class VecUtils2F extends TupUtils2F
{
	/**
	 * Returns the inverse (reciprocal) length (magnitude, norm) of the vector {@code (v)}.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link MathUtil#PROVIDER} is used for
	 * calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code 1 / |v|}
	 * 
	 * @param v
	 *     The vector.
	 * 
	 * @return The inverse length of the vector.
	 */
	public static float invLen(Tup2RF v)
	{
		return invLen(v.v0(), v.v1());
	}
	
	/**
	 * Returns the inverse (reciprocal) length (magnitude, norm) of the vector {@code (v[0], v[1])}.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link MathUtil#PROVIDER} is used for
	 * calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code 1 / |(v[0], v[1])|}
	 * 
	 * @param v
	 *     The vector as an array with at least two entries.
	 * 
	 * @return The reciprocal length of the vector.
	 */
	public static float invLen(float[] v)
	{
		return invLen(v[0], v[1]);
	}
	
	/**
	 * Returns the inverse (reciprocal) length (magnitude, norm) of the vector {@code (x, y)}.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link MathUtil#PROVIDER} is used for
	 * calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code 1 / |(x, y)|}
	 * 
	 * @param x
	 *     The value of the x component of the vector.
	 * @param y
	 *     The value of the y component of the vector.
	 * 
	 * @return The reciprocal length of the vector.
	 */
	public static float invLen(float x, float y)
	{
		return MathUtils.invSqrt(sqrLen(x, y));
	}
	
	/**
	 * Returns the length (magnitude, norm) of the vector {@code (v)}.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link MathUtil#PROVIDER} is used for
	 * calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code |v|}
	 * 
	 * @param v
	 *     The vector.
	 * 
	 * @return The length of the vector.
	 */
	public static float len(Tup2RF v)
	{
		return len(v.v0(), v.v1());
	}
	
	/**
	 * Returns the length (magnitude, norm) of the vector {@code (v)}. If the values of all
	 * components are within the margin defined by {@code (-tolerance <= value <= tolerance)} the
	 * result will be zero.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link MathUtil#PROVIDER} is used for
	 * calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code |v|}
	 * 
	 * @param v
	 *     The vector.
	 * @param tolerance
	 *     The tolerance for defining the margin around zero. Must be positive.
	 * 
	 * @return The length of the vector.
	 */
	public static float len(float tolerance, Tup2RF v)
	{
		return len(v.v0(), v.v1(), tolerance);
	}
	
	/**
	 * Returns the length (magnitude, norm) of the vector {@code (v[0], v[1])}.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link MathUtil#PROVIDER} is used for
	 * calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code |(v[0], v[1])|}
	 * 
	 * @param v
	 *     The vector as an array with at least two entries.
	 * 
	 * @return The length of the vector.
	 */
	public static float len(float[] v)
	{
		return len(v[0], v[1]);
	}
	
	/**
	 * Returns the length (magnitude, norm) of the vector {@code (v[0], v[1])}. If the values of all
	 * components are within the margin defined by {@code (-tolerance <= value <= tolerance)} the
	 * result will be zero.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link MathUtil#PROVIDER} is used for
	 * calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code |(v[0], v[1])|}
	 * 
	 * @param v
	 *     The vector as an array with at least two entries.
	 * @param tolerance
	 *     The tolerance for defining the margin around zero. Must be positive.
	 * 
	 * @return The length of the vector.
	 */
	public static float len(float tolerance, float[] v)
	{
		return len(v[0], v[1], tolerance);
	}
	
	/**
	 * Returns the length (magnitude, norm) of the vector {@code (x, y)}.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link MathUtil#PROVIDER} is used for
	 * calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code |(x, y)|}
	 * 
	 * @param x
	 *     The value of the x component of the vector.
	 * @param y
	 *     The value of the y component of the vector.
	 * 
	 * @return The length of the vector.
	 */
	public static float len(float x, float y)
	{
		float sqareLength = sqrLen(x, y);
		
		if(MathUtils.isZero(sqareLength)) return 0.0f;
		
		return MathUtils.sqrt(sqareLength);
	}
	
	/**
	 * Returns the length (magnitude, norm) of the vector {@code (x, y)}. If the values of all
	 * components are within the margin defined by {@code (-tolerance <= value <= tolerance)} the
	 * result will be zero.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link MathUtil#PROVIDER} is used for
	 * calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code |(x, y)|}
	 * 
	 * @param x
	 *     The value of the x component of the vector.
	 * @param y
	 *     The value of the y component of the vector.
	 * @param tolerance
	 *     The tolerance for defining the margin around zero. Must be positive.
	 * 
	 * @return The length of the vector.
	 */
	public static float len(float tolerance, float x, float y)
	{
		float sqareLength = sqrLen(x, y);
		
		if(MathUtils.isZero(tolerance, sqareLength)) return 0.0f;
		
		return MathUtils.sqrt(sqareLength);
	}
	
	/**
	 * Returns the squared length (magnitude, norm) of the vector {@code (x, y)}. It doesn't account
	 * for zero-length vectors.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code |v|²}
	 * 
	 * @param v
	 *     The vector.
	 * 
	 * @return The squared length of the vector.
	 */
	public static float sqrLen(Tup2RF v)
	{
		return sqrLen(v.v0(), v.v1());
	}
	
	/**
	 * Returns the squared length (magnitude, norm) of the vector {@code (v[0], v[1])}. It doesn't
	 * account for zero-length vectors.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code |(v[0], v[1])|²}
	 * 
	 * @param v
	 *     The vector as an array with at least two entries.
	 * 
	 * @return The squared length of the vector.
	 */
	public static float sqrLen(float[] v)
	{
		return sqrLen(v[0], v[1]);
	}
	
	/**
	 * Returns the squared length (magnitude, norm) of the vector {@code (x, y)}. It doesn't account
	 * for zero-length vectors.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code |(x, y)|²}
	 * 
	 * @param x
	 *     The value of the x component of the vector.
	 * @param y
	 *     The value of the y component of the vector.
	 * 
	 * @return The squared length of the vector.
	 */
	public static float sqrLen(float x, float y)
	{
		return x * x + y * y;
	}
	
	/**
	 * Normalizes the vector {@code (v)} and saves the result in the given extraction parameter.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link MathUtil#PROVIDER} is used for
	 * calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v / |v|}
	 * 
	 * @param v
	 *     The vector.
	 * @param res
	 *     The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] nrm(Tup2RF v, @ExtractionParam float[] res)
	{
		return nrm(v.v0(), v.v1(), res);
	}
	
	/**
	 * Normalizes the vector {@code (v)} and saves the result in the given extraction parameter. If
	 * the values of all components are within the margin defined by
	 * {@code (-tolerance <= value <= tolerance)} the result will be a zero vector.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link MathUtil#PROVIDER} is used for
	 * calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v / |v|}
	 * 
	 * @param v
	 *     The vector.
	 * @param tolerance
	 *     The tolerance for defining the margin around zero. Must be positive.
	 * @param res
	 *     The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] nrm(float tolerance, Tup2RF v, @ExtractionParam float[] res)
	{
		return nrm(v.v0(), v.v1(), tolerance, res);
	}
	
	/**
	 * Normalizes the vector {@code (v[0], v[1])} and saves the result in the given extraction
	 * parameter.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link MathUtil#PROVIDER} is used for
	 * calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v[0], v[1]) / |(v[0], v[1])|}
	 * 
	 * @param v
	 *     The vector as an array with at least two entries.
	 * @param res
	 *     The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] nrm(float[] v, @ExtractionParam float[] res)
	{
		return nrm(v[0], v[1], res);
	}
	
	/**
	 * Normalizes the vector {@code (v[0], v[1])} and saves the result in the given extraction
	 * parameter. If the values of all components are within the margin defined by
	 * {@code (-tolerance <= value <= tolerance)} the result will be a zero vector.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link MathUtil#PROVIDER} is used for
	 * calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v[0], v[1]) / |(v[0], v[1])|}
	 * 
	 * @param v
	 *     The vector as an array with at least two entries.
	 * @param tolerance
	 *     The tolerance for defining the margin around zero. Must be positive.
	 * @param res
	 *     The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] nrm(float tolerance, float[] v, @ExtractionParam float[] res)
	{
		return nrm(v[0], v[1], tolerance, res);
	}
	
	/**
	 * Normalizes the vector {@code (x, y)} and saves the result in the given extraction parameter.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link MathUtil#PROVIDER} is used for
	 * calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (x, y) / |(x, y)|}
	 * 
	 * @param x
	 *     The value of the x component of the vector.
	 * @param y
	 *     The value of the y component of the vector.
	 * @param res
	 *     The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] nrm(float x, float y, @ExtractionParam float[] res)
	{
		if (x == 0.0f && y == 0.0f)
		{
			res[0] = 0.0f;
			res[1] = 0.0f;
			
			return res;
		}
		
		float invLength = invLen(x, y);
		
		res[0] = x * invLength;
		res[1] = y * invLength;
		
		return res;
	}
	
	/**
	 * Normalizes the vector {@code (x, y)} and saves the result in the given extraction parameter.
	 * If the values of all components are within the margin defined by
	 * {@code (-tolerance <= value <= tolerance)} the result will be a zero vector.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link MathUtil#PROVIDER} is used for
	 * calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (x, y) / |(x, y)|}
	 * 
	 * @param x
	 *     The value of the x component of the vector.
	 * @param y
	 *     The value of the y component of the vector.
	 * @param tolerance
	 *     The tolerance for defining the margin around zero. Must be positive.
	 * @param res
	 *     The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] nrm(float tolerance, float x, float y, @ExtractionParam float[] res)
	{
		if (Math.abs(x) <= tolerance && Math.abs(y) <= tolerance)
		{
			res[0] = 0.0f;
			res[1] = 0.0f;
			
			return res;
		}
		
		float invLength = invLen(x, y);
		
		res[0] = x * invLength;
		res[1] = y * invLength;
		
		return res;
	}
	
	/**
	 * Normalizes the vector {@code (v)} and saves the result in the given extraction parameter
	 * object.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link MathUtil#PROVIDER} is used for
	 * calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v / |v|}
	 * 
	 * @param <T>
	 *     The type of the extraction parameter object.
	 * 
	 * @param v
	 *     The vector.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup2WF> T nrm(Tup2RF v, @ExtractionParam T res)
	{
		return nrm(v.v0(), v.v1(), res);
	}
	
	/**
	 * Normalizes the vector {@code (v)} and saves the result in the given extraction parameter
	 * object. If the values of all components are within the margin defined by
	 * {@code (-tolerance <= value <= tolerance)} the result will be a zero vector.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link MathUtil#PROVIDER} is used for
	 * calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v / |v|}
	 * 
	 * @param <T>
	 *     The type of the extraction parameter object.
	 * 
	 * @param v
	 *     The vector.
	 * @param tolerance
	 *     The tolerance for defining the margin around zero. Must be positive.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup2WF> T nrm(float tolerance, Tup2RF v, @ExtractionParam T res)
	{
		return nrm(v.v0(), v.v1(), tolerance, res);
	}
	
	/**
	 * Normalizes the vector {@code (v[0], v[1])} and saves the result in the given extraction
	 * parameter object.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link MathUtil#PROVIDER} is used for
	 * calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v[0], v[1]) / |(v[0], v[1])|}
	 * 
	 * @param <T>
	 *     The type of the extraction parameter object.
	 * 
	 * @param v
	 *     The vector as an array with at least two entries.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup2WF> T nrm(float[] v, @ExtractionParam T res)
	{
		return nrm(v[0], v[1], res);
	}
	
	/**
	 * Normalizes the vector {@code (v[0], v[1])} and saves the result in the given extraction
	 * parameter object. If the values of all components are within the margin defined by
	 * {@code (-tolerance <= value <= tolerance)} the result will be a zero vector.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link MathUtil#PROVIDER} is used for
	 * calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v[0], v[1]) / |(v[0], v[1])|}
	 * 
	 * @param <T>
	 *     The type of the extraction parameter object.
	 * 
	 * @param v
	 *     The vector as an array with at least two entries.
	 * @param tolerance
	 *     The tolerance for defining the margin around zero. Must be positive.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup2WF> T nrm(float tolerance, float[] v, @ExtractionParam T res)
	{
		return nrm(v[0], v[1], tolerance, res);
	}
	
	/**
	 * Normalizes the vector {@code (x, y)} and saves the result in the given extraction parameter
	 * object.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link MathUtil#PROVIDER} is used for
	 * calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (x, y) / |(x, y)|}
	 * 
	 * @param <T>
	 *     The type of the extraction parameter object.
	 * 
	 * @param x
	 *     The value of the x component of the vector.
	 * @param y
	 *     The value of the y component of the vector.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup2WF> T nrm(float x, float y, @ExtractionParam T res)
	{
		if (x == 0.0f && y == 0.0f)
		{
			res.set(0.0f, 0.0f);
			
			return res;
		}
		
		float invLength = invLen(x, y);
		
		res.set(x * invLength, y * invLength);
		
		return res;
	}
	
	/**
	 * Normalizes the vector {@code (x, y)} and saves the result in the given extraction parameter
	 * object. If the values of all components are within the margin defined by
	 * {@code (-tolerance <= value <= tolerance)} the result will be a zero vector.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link MathUtil#PROVIDER} is used for
	 * calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (x, y) / |(x, y)|}
	 * 
	 * @param <T>
	 *     The type of the extraction parameter object.
	 * 
	 * @param x
	 *     The value of the x component of the vector.
	 * @param y
	 *     The value of the y component of the vector.
	 * @param tolerance
	 *     The tolerance for defining the margin around zero. Must be positive.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup2WF> T nrm(float tolerance, float x, float y, @ExtractionParam T res)
	{
		if (Math.abs(x) <= tolerance && Math.abs(y) <= tolerance)
		{
			res.set(0.0f, 0.0f);
			
			return res;
		}
		
		float invLength = invLen(x, y);
		
		res.set(x * invLength, y * invLength);
		
		return res;
	}
	
	/**
	 * Rotates the vector {@code (v)} by the given angle in radians and saves the result in the
	 * given extraction parameter.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link MathUtil#PROVIDER} is used for
	 * calculation.
	 * 
	 * @param v
	 *     The vector.
	 * @param angle
	 *     The angle in radians.
	 * @param res
	 *     The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] rotRad(Tup2RF v, float angle, @ExtractionParam float[] res)
	{
		return rotRad(v.v0(), v.v1(), angle, res);
	}
	
	/**
	 * Rotates the vector {@code (v[0], v[1])} by the given angle in radians and saves the result in
	 * the given extraction parameter.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link MathUtil#PROVIDER} is used for
	 * calculation.
	 * 
	 * @param v
	 *     The vector as an array with at least two entries.
	 * @param angle
	 *     The angle in radians.
	 * @param res
	 *     The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] rotRad(float[] v, float angle, @ExtractionParam float[] res)
	{
		return rotRad(v[0], v[1], angle, res);
	}
	
	/**
	 * Rotates the vector {@code (x, y)} by the given angle in radians and saves the result in the
	 * given extraction parameter.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link MathUtil#PROVIDER} is used for
	 * calculation.
	 * 
	 * @param x
	 *     The value of the x component of the vector.
	 * @param y
	 *     The value of the y component of the vector.
	 * @param angle
	 *     The angle in radians.
	 * @param res
	 *     The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] rotRad(float x, float y, float angle, @ExtractionParam float[] res)
	{
		res[0] = x * MathUtils.cos(angle) - y * MathUtils.sin(angle);
		res[1] = x * MathUtils.sin(angle) + y * MathUtils.cos(angle);
		
		return res;
	}
	
	/**
	 * Rotates the vector {@code (v)} by the given angle in degrees and saves the result in the
	 * given extraction parameter.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link MathUtil#PROVIDER} is used for
	 * calculation.
	 * 
	 * @param v
	 *     The vector.
	 * @param angle
	 *     The angle in degrees.
	 * @param res
	 *     The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] rotDeg(Tup2RF v, float angle, @ExtractionParam float[] res)
	{
		return rotDeg(v.v0(), v.v1(), angle, res);
	}
	
	/**
	 * Rotates the vector {@code (v[0], v[1])} by the given angle in degrees and saves the result in
	 * the given extraction parameter.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link MathUtil#PROVIDER} is used for
	 * calculation.
	 * 
	 * @param v
	 *     The vector as an array with at least two entries.
	 * @param angle
	 *     The angle in degrees.
	 * @param res
	 *     The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] rotDeg(float[] v, float angle, @ExtractionParam float[] res)
	{
		return rotDeg(v[0], v[1], angle, res);
	}
	
	/**
	 * Rotates the vector {@code (x, y)} by the given angle in degrees and saves the result in the
	 * given extraction parameter.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link MathUtil#PROVIDER} is used for
	 * calculation.
	 * 
	 * @param x
	 *     The value of the x component of the vector.
	 * @param y
	 *     The value of the y component of the vector.
	 * @param angle
	 *     The angle in degrees.
	 * @param res
	 *     The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] rotDeg(float x, float y, float angle, @ExtractionParam float[] res)
	{
		return rotRad(x, y, angle * MathUtils.DEG_TO_RADf, res);
	}
	
	/**
	 * Rotates the vector {@code (v)} by the given angle in radians and saves the result in the
	 * given extraction parameter object.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link MathUtil#PROVIDER} is used for
	 * calculation.
	 * 
	 * @param <T>
	 *     The type of the extraction parameter object.
	 * 
	 * @param v
	 *     The.
	 * @param angle
	 *     The angle in radians.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup2WF> T rotRad(Tup2RF v, float angle, @ExtractionParam T res)
	{
		return rotRad(v.v0(), v.v1(), angle, res);
	}
	
	/**
	 * Rotates the vector {@code (v[0], v[1])} by the given angle in radians and saves the result in
	 * the given extraction parameter object.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link MathUtil#PROVIDER} is used for
	 * calculation.
	 * 
	 * @param <T>
	 *     The type of the extraction parameter object.
	 * 
	 * @param v
	 *     The vector as an array with at least two entries.
	 * @param angle
	 *     The angle in radians.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup2WF> T rotRad(float[] v, float angle, @ExtractionParam T res)
	{
		return rotRad(v[0], v[1], angle, res);
	}
	
	/**
	 * Rotates the vector {@code (x, y)} by the given angle in radians and saves the result in the
	 * given extraction parameter object.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link MathUtil#PROVIDER} is used for
	 * calculation.
	 * 
	 * @param <T>
	 *     The type of the extraction parameter object.
	 * 
	 * @param x
	 *     The value of the x component of the vector.
	 * @param y
	 *     The value of the y component of the vector.
	 * @param angle
	 *     The angle in radians.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup2WF> T rotRad(float x, float y, float angle, @ExtractionParam T res)
	{
		res.set(x * MathUtils.cos(angle) - y * MathUtils.sin(angle), x * MathUtils.sin(angle) + y * MathUtils.cos(angle));
		
		return res;
	}
	
	/**
	 * Rotates the vector {@code (v)} by the given angle in degrees and saves the result in the
	 * given extraction parameter object.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link MathUtil#PROVIDER} is used for
	 * calculation.
	 * 
	 * @param <T>
	 *     The type of the extraction parameter object.
	 * 
	 * @param v
	 *     The vector.
	 * @param angle
	 *     The angle in degrees.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup2WF> T rotDeg(Tup2RF v, float angle, @ExtractionParam T res)
	{
		return rotDeg(v.v0(), v.v1(), angle, res);
	}
	
	/**
	 * Rotates the vector {@code (v[0], v[1])} by the given angle in degrees and saves the result in
	 * the given extraction parameter object.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link MathUtil#PROVIDER} is used for
	 * calculation.
	 * 
	 * @param <T>
	 *     The type of the extraction parameter object.
	 * 
	 * @param v
	 *     The vector as an array with at least two entries.
	 * @param angle
	 *     The angle in degrees.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup2WF> T rotDeg(float[] v, float angle, @ExtractionParam T res)
	{
		return rotDeg(v[0], v[1], angle, res);
	}
	
	/**
	 * Rotates the vector {@code (x, y)} by the given angle in degrees and saves the result in the
	 * given extraction parameter object.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link MathUtil#PROVIDER} is used for
	 * calculation.
	 * 
	 * @param <T>
	 *     The type of the extraction parameter object.
	 * 
	 * @param x
	 *     The value of the x component of the vector.
	 * @param y
	 *     The value of the y component of the vector.
	 * @param angle
	 *     The angle in degrees.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup2WF> T rotDeg(float x, float y, float angle, @ExtractionParam T res)
	{
		return rotRad(x, y, angle * MathUtils.DEG_TO_RADf, res);
	}
	
	/**
	 * Calculates the orthogonal projection of the vector {@code (v)} onto the normalized target
	 * vector {@code (t)} and saves the result in the extraction parameter.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code t * (v . t)}
	 * 
	 * @param v
	 *     The vector.
	 * @param t
	 *     The projection target vector.
	 * @param res
	 *     The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result
	 */
	public static float[] prj(Tup2RF v, Tup2RF t, @ExtractionParam float[] res)
	{
		return prj(v.v0(), v.v1(), t.v0(), t.v1(), res);
	}
	
	/**
	 * Calculates the orthogonal projection of the vector {@code (v)} onto the normalized target
	 * vector {@code (t[0], t[1])} and saves the result in the extraction parameter.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (t[0], t[1]) * (v . (t[0], t[1]))}
	 * 
	 * @param v
	 *     The vector.
	 * @param t
	 *     The projection target vector as an array with at least two entries.
	 * @param res
	 *     The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result
	 */
	public static float[] prj(Tup2RF v, float[] t, @ExtractionParam float[] res)
	{
		return prj(v.v0(), v.v1(), t[0], t[1], res);
	}
	
	/**
	 * Calculates the orthogonal projection of the vector {@code (v)} onto the normalized target
	 * vector {@code (tX, tY)} and saves the result in the extraction parameter.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (tX, tY) * (v . (tX, tY))}
	 * 
	 * @param v
	 *     The vector.
	 * @param tX
	 *     The value of the x component of the projection target vector.
	 * @param tY
	 *     The value of the y component of the projection target vector.
	 * @param res
	 *     The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result
	 */
	public static float[] prj(Tup2RF v, float tX, float tY, @ExtractionParam float[] res)
	{
		return prj(v.v0(), v.v1(), tX, tY, res);
	}
	
	/**
	 * Calculates the orthogonal projection of the vector {@code (v[0], v[1])} onto the normalized
	 * target vector {@code (t)} and saves the result in the extraction parameter.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code t * ((v[0], v[1]) . t)}
	 * 
	 * @param v
	 *     The vector as an array with at least two entries.
	 * @param t
	 *     The projection target vector.
	 * @param res
	 *     The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result
	 */
	public static float[] prj(float[] v, Tup2RF t, @ExtractionParam float[] res)
	{
		return prj(v[0], v[1], t.v0(), t.v1(), res);
	}
	
	/**
	 * Calculates the orthogonal projection of the vector {@code (v[0], v[1])} onto the normalized
	 * target vector {@code (t[0], t[1])} and saves the result in the extraction parameter.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (t[0], t[1]) * ((v[0], v[1]) . (t[0], t[1]))}
	 * 
	 * @param v
	 *     The vector as an array with at least two entries.
	 * @param t
	 *     The projection target vector as an array with at least two entries.
	 * @param res
	 *     The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result
	 */
	public static float[] prj(float[] v, float[] t, @ExtractionParam float[] res)
	{
		return prj(v[0], v[1], t[0], t[1], res);
	}
	
	/**
	 * Calculates the orthogonal projection of the vector {@code (v[0], v[1])} onto the normalized
	 * target vector {@code (tX, tY)} and saves the result in the extraction parameter.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (tX, tY) * ((v[0], v[1]) . (tX, tY))}
	 * 
	 * @param v
	 *     The vector as an array with at least two entries.
	 * @param tX
	 *     The value of the x component of the projection target vector.
	 * @param tY
	 *     The value of the y component of the projection target vector.
	 * @param res
	 *     The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result
	 */
	public static float[] prj(float[] v, float tX, float tY, @ExtractionParam float[] res)
	{
		return prj(v[0], v[1], tX, tY, res);
	}
	
	/**
	 * Calculates the orthogonal projection of the vector {@code (vX, vY)} onto the normalized
	 * target vector {@code (t)} and saves the result in the extraction parameter.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code t * ((vX, vY) . t)}
	 * 
	 * @param vX
	 *     The value of the x component of the vector.
	 * @param vY
	 *     The value of the y component of the vector.
	 * @param t
	 *     The projection target vector.
	 * @param res
	 *     The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result
	 */
	public static float[] prj(float vX, float vY, Tup2RF t, @ExtractionParam float[] res)
	{
		return prj(vX, vY, t.v0(), t.v1(), res);
	}
	
	/**
	 * Calculates the orthogonal projection of the vector {@code (vX, vY)} onto the normalized
	 * target vector {@code (t[0], t[1])} and saves the result in the extraction parameter.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (t[0], t[1]) * ((vX, vY) . (t[0], t[1]))}
	 * 
	 * @param vX
	 *     The value of the x component of the vector.
	 * @param vY
	 *     The value of the y component of the vector.
	 * @param t
	 *     The projection target vector as an array with at least two entries.
	 * @param res
	 *     The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result
	 */
	public static float[] prj(float vX, float vY, float[] t, @ExtractionParam float[] res)
	{
		return prj(vX, vY, t[0], t[1], res);
	}
	
	/**
	 * Calculates the orthogonal projection of the vector {@code (vX, vY)} onto the normalized
	 * target vector {@code (tX, tY)} and saves the result in the extraction parameter.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (tX, tY) * ((vX, vY) . (tX, tY))}
	 * 
	 * @param vX
	 *     The value of the x component of the vector.
	 * @param vY
	 *     The value of the y component of the vector.
	 * @param tX
	 *     The value of the x component of the projection target vector.
	 * @param tY
	 *     The value of the y component of the projection target vector.
	 * @param res
	 *     The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result
	 */
	public static float[] prj(float vX, float vY, float tX, float tY, @ExtractionParam float[] res)
	{
		float dot = dot(vX, vY, tX, tY);
		
		res[0] = tX * dot;
		res[1] = tY * dot;
		
		return res;
	}
	
	/**
	 * Calculates the orthogonal projection of the vector {@code (v)} onto the normalized target
	 * vector {@code (t)} and saves the result in the extraction parameter object.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code t * (v . t)}
	 * 
	 * @param <T>
	 *     The type of the extraction parameter object.
	 * 
	 * @param v
	 *     The vector.
	 * @param t
	 *     The projection target vector as an array with at least two entries.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup2WF> T prj(Tup2RF v, Tup2RF t, @ExtractionParam T res)
	{
		return prj(v.v0(), v.v1(), t.v0(), t.v1(), res);
	}
	
	/**
	 * Calculates the orthogonal projection of the vector {@code (v)} onto the normalized target
	 * vector {@code (t[0], t[1])} and saves the result in the extraction parameter object.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (t[0], t[1]) * (v . (t[0], t[1]))}
	 * 
	 * @param <T>
	 *     The type of the extraction parameter object.
	 * 
	 * @param v
	 *     The vector.
	 * @param t
	 *     The projection target vector as an array with at least two entries.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup2WF> T prj(Tup2RF v, float[] t, @ExtractionParam T res)
	{
		return prj(v.v0(), v.v1(), t[0], t[1], res);
	}
	
	/**
	 * Calculates the orthogonal projection of the vector {@code (v)} onto the normalized target
	 * vector {@code (tX, tY)} and saves the result in the extraction parameter object.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (tX, tY) * (v . (tX, tY))}
	 * 
	 * @param <T>
	 *     The type of the extraction parameter object.
	 * 
	 * @param v
	 *     The vector.
	 * @param tX
	 *     The value of the x component of the projection target vector.
	 * @param tY
	 *     The value of the y component of the projection target vector.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup2WF> T prj(Tup2RF v, float tX, float tY, @ExtractionParam T res)
	{
		return prj(v.v0(), v.v1(), tX, tY, res);
	}
	
	/**
	 * Calculates the orthogonal projection of the vector {@code (v[0], v[1])} onto the normalized
	 * target vector {@code (t)} and saves the result in the extraction parameter object.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code t * ((v[0], v[1]) . t)}
	 * 
	 * @param <T>
	 *     The type of the extraction parameter object.
	 * 
	 * @param v
	 *     The vector as an array with at least two entries.
	 * @param t
	 *     The projection target vector.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup2WF> T prj(float[] v, Tup2RF t, @ExtractionParam T res)
	{
		return prj(v[0], v[1], t.v0(), t.v1(), res);
	}
	
	/**
	 * Calculates the orthogonal projection of the vector {@code (v[0], v[1])} onto the normalized
	 * target vector {@code (t[0], t[1])} and saves the result in the extraction parameter object.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (t[0], t[1]) * ((v[0], v[1]) . (t[0], t[1]))}
	 * 
	 * @param <T>
	 *     The type of the extraction parameter object.
	 * 
	 * @param v
	 *     The vector as an array with at least two entries.
	 * @param t
	 *     The projection target vector as an array with at least two entries.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup2WF> T prj(float[] v, float[] t, @ExtractionParam T res)
	{
		return prj(v[0], v[1], t[0], t[1], res);
	}
	
	/**
	 * Calculates the orthogonal projection of the vector {@code (v[0], v[1])} onto the normalized
	 * target vector {@code (tX, tY)} and saves the result in the extraction parameter object.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (tX, tY) * ((v[0], v[1]) . (tX, tY))}
	 * 
	 * @param <T>
	 *     The type of the extraction parameter object.
	 * 
	 * @param v
	 *     The vector as an array with at least two entries.
	 * @param tX
	 *     The value of the x component of the projection target vector.
	 * @param tY
	 *     The value of the y component of the projection target vector.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup2WF> T prj(float[] v, float tX, float tY, @ExtractionParam T res)
	{
		return prj(v[0], v[1], tX, tY, res);
	}
	
	/**
	 * Calculates the orthogonal projection of the vector {@code (vX, vY)} onto the normalized
	 * target vector {@code (t)} and saves the result in the extraction parameter object.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code t * ((vX, vY) . t)}
	 * 
	 * @param <T>
	 *     The type of the extraction parameter object.
	 * 
	 * @param vX
	 *     The value of the x component of the vector.
	 * @param vY
	 *     The value of the y component of the vector.
	 * @param t
	 *     The projection target vector.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup2WF> T prj(float vX, float vY, Tup2RF t, @ExtractionParam T res)
	{
		return prj(vX, vY, t.v0(), t.v1(), res);
	}
	
	/**
	 * Calculates the orthogonal projection of the vector {@code (vX, vY)} onto the normalized
	 * target vector {@code (t[0], t[1])} and saves the result in the extraction parameter object.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (t[0], t[1]) * ((vX, vY) . (t[0], t[1]))}
	 * 
	 * @param <T>
	 *     The type of the extraction parameter object.
	 * 
	 * @param vX
	 *     The value of the x component of the vector.
	 * @param vY
	 *     The value of the y component of the vector.
	 * @param t
	 *     The projection target vector as an array with at least two entries.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup2WF> T prj(float vX, float vY, float[] t, @ExtractionParam T res)
	{
		return prj(vX, vY, t[0], t[1], res);
	}
	
	/**
	 * Calculates the orthogonal projection of the vector {@code (vX, vY)} onto the normalized
	 * target vector {@code (tX, tY)} and saves the result in the extraction parameter object.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (tX, tY) * ((vX, vY) . (tX, tY))}
	 * 
	 * @param <T>
	 *     The type of the extraction parameter object.
	 * 
	 * @param vX
	 *     The value of the x component of the vector.
	 * @param vY
	 *     The value of the y component of the vector.
	 * @param tX
	 *     The value of the x component of the projection target vector.
	 * @param tY
	 *     The value of the y component of the projection target vector.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup2WF> T prj(float vX, float vY, float tX, float tY, @ExtractionParam T res)
	{
		float dot = dot(vX, vY, tX, tY);
		
		res.set(tX * dot, tY * dot);
		
		return res;
	}
	
	/**
	 * Calculates the reflection of the vector {@code (v)} based on the given normalized surface
	 * normal {@code (n)} and saves the result in the given extraction parameter.
	 * 
	 * @param v
	 *     The vector.
	 * @param n
	 *     The surface normal vector.
	 * @param res
	 *     The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] rfl(Tup2RF v, Tup2RF n, @ExtractionParam float[] res)
	{
		return rfl(v.v0(), v.v1(), n.v0(), n.v1(), res);
	}
	
	/**
	 * Calculates the reflection of the vector {@code (v)} based on the given normalized surface
	 * normal {@code (n[0], n[1])} and saves the result in the given extraction parameter.
	 * 
	 * @param v
	 *     The vector.
	 * @param n
	 *     The surface normal vector as an array with at least two entries.
	 * @param res
	 *     The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] rfl(Tup2RF v, float[] n, @ExtractionParam float[] res)
	{
		return rfl(v.v0(), v.v1(), n[0], n[1], res);
	}
	
	/**
	 * Calculates the reflection of the vector {@code (v)} based on the given normalized surface
	 * normal {@code (nX, nY)} and saves the result in the given extraction parameter.
	 * 
	 * @param v
	 *     The vector.
	 * @param nX
	 *     The value of the x component of the surface normal vector.
	 * @param nY
	 *     The value of the y component of the surface normal vector.
	 * @param res
	 *     The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] rfl(Tup2RF v, float nX, float nY, @ExtractionParam float[] res)
	{
		return rfl(v.v0(), v.v1(), nX, nY, res);
	}
	
	/**
	 * Calculates the reflection of the vector {@code (v[0], v[1])} based on the given normalized
	 * surface normal {@code (n)} and saves the result in the given extraction parameter.
	 * 
	 * @param v
	 *     The vector as an array with at least two entries.
	 * @param n
	 *     The surface normal vector.
	 * @param res
	 *     The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] rfl(float[] v, Tup2RF n, @ExtractionParam float[] res)
	{
		return rfl(v[0], v[1], n.v0(), n.v1(), res);
	}
	
	/**
	 * Calculates the reflection of the vector {@code (v[0], v[1])} based on the given normalized
	 * surface normal {@code (n[0], n[1])} and saves the result in the given extraction parameter.
	 * 
	 * @param v
	 *     The vector as an array with at least two entries.
	 * @param n
	 *     The surface normal vector as an array with at least two entries.
	 * @param res
	 *     The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] rfl(float[] v, float[] n, @ExtractionParam float[] res)
	{
		return rfl(v[0], v[1], n[0], n[1], res);
	}
	
	/**
	 * Calculates the reflection of the vector {@code (v[0], v[1])} based on the given normalized
	 * surface normal {@code (nX, nY)} and saves the result in the given extraction parameter.
	 * 
	 * @param v
	 *     The vector as an array with at least two entries.
	 * @param nX
	 *     The value of the x component of the surface normal vector.
	 * @param nY
	 *     The value of the y component of the surface normal vector.
	 * @param res
	 *     The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] rfl(float[] v, float nX, float nY, @ExtractionParam float[] res)
	{
		return rfl(v[0], v[1], nX, nY, res);
	}
	
	/**
	 * Calculates the reflection of the vector {@code (vX, vY)} based on the given normalized
	 * surface normal {@code (n)} and saves the result in the given extraction parameter.
	 * 
	 * @param vX
	 *     The value of the x component of the vector.
	 * @param vY
	 *     The value of the y component of the vector.
	 * @param n
	 *     The surface normal vector.
	 * @param res
	 *     The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] rfl(float vX, float vY, Tup2RF n, @ExtractionParam float[] res)
	{
		return rfl(vX, vY, n.v0(), n.v1(), res);
	}
	
	/**
	 * Calculates the reflection of the vector {@code (vX, vY)} based on the given normalized
	 * surface normal {@code (n[0], n[1])} and saves the result in the given extraction parameter.
	 * 
	 * @param vX
	 *     The value of the x component of the vector.
	 * @param vY
	 *     The value of the y component of the vector.
	 * @param n
	 *     The surface normal vector as an array with at least two entries.
	 * @param res
	 *     The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] rfl(float vX, float vY, float[] n, @ExtractionParam float[] res)
	{
		return rfl(vX, vY, n[0], n[1], res);
	}
	
	/**
	 * Calculates the reflection of the vector {@code (vX, vY)} based on the given normalized
	 * surface normal {@code (nX, nY)} and saves the result in the given extraction parameter.
	 * 
	 * @param vX
	 *     The value of the x component of the vector.
	 * @param vY
	 *     The value of the y component of the vector.
	 * @param nX
	 *     The value of the x component of the surface normal vector.
	 * @param nY
	 *     The value of the y component of the surface normal vector.
	 * @param res
	 *     The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] rfl(float vX, float vY, float nX, float nY, @ExtractionParam float[] res)
	{
		float dot = -2 * dot(vX, vY, nX, nY);
		
		res[0] = nX * dot + vX;
		res[1] = nY * dot + vY;
		
		return res;
	}
	
	/**
	 * Calculates the reflection of the vector {@code (v)} based on the given normalized surface
	 * normal {@code (n)} and saves the result in the given extraction parameter object.
	 * 
	 * @param <T>
	 *     The type of the extraction parameter object.
	 * 
	 * @param v
	 *     The vector.
	 * @param n
	 *     The surface normal vector.
	 * @param res
	 *     The extraction parameter object.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup2WF> T rfl(Tup2RF v, Tup2RF n, @ExtractionParam T res)
	{
		return rfl(v.v0(), v.v1(), n.v0(), n.v1(), res);
	}
	
	/**
	 * Calculates the reflection of the vector {@code (v)} based on the given normalized surface
	 * normal {@code (n[0], n[1])} and saves the result in the given extraction parameter object.
	 * 
	 * @param <T>
	 *     The type of the extraction parameter object.
	 * 
	 * @param v
	 *     The vector.
	 * @param n
	 *     The surface normal vector as an array with at least two entries.
	 * @param res
	 *     The extraction parameter object.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup2WF> T rfl(Tup2RF v, float[] n, @ExtractionParam T res)
	{
		return rfl(v.v0(), v.v1(), n[0], n[1], res);
	}
	
	/**
	 * Calculates the reflection of the vector {@code (v)} based on the given normalized surface
	 * normal {@code (nX, nY)} and saves the result in the given extraction parameter object.
	 * 
	 * @param <T>
	 *     The type of the extraction parameter object.
	 * 
	 * @param v
	 *     The vector.
	 * @param nX
	 *     The value of the x component of the surface normal vector.
	 * @param nY
	 *     The value of the y component of the surface normal vector.
	 * @param res
	 *     The extraction parameter object.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup2WF> T rfl(Tup2RF v, float nX, float nY, @ExtractionParam T res)
	{
		return rfl(v.v0(), v.v1(), nX, nY, res);
	}
	
	/**
	 * Calculates the reflection of the vector {@code (v[0], v[1])} based on the given normalized
	 * surface normal {@code (n)} and saves the result in the given extraction parameter object.
	 * 
	 * @param <T>
	 *     The type of the extraction parameter object.
	 * 
	 * @param v
	 *     The vector as an array with at least two entries.
	 * @param n
	 *     The surface normal vector.
	 * @param res
	 *     The extraction parameter object.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup2WF> T rfl(float[] v, Tup2RF n, @ExtractionParam T res)
	{
		return rfl(v[0], v[1], n.v0(), n.v1(), res);
	}
	
	/**
	 * Calculates the reflection of the vector {@code (v[0], v[1])} based on the given normalized
	 * surface normal {@code (n[0], n[1])} and saves the result in the given extraction parameter
	 * object.
	 * 
	 * @param <T>
	 *     The type of the extraction parameter object.
	 * 
	 * @param v
	 *     The vector as an array with at least two entries.
	 * @param n
	 *     The surface normal vector as an array with at least two entries.
	 * @param res
	 *     The extraction parameter object.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup2WF> T rfl(float[] v, float[] n, @ExtractionParam T res)
	{
		return rfl(v[0], v[1], n[0], n[1], res);
	}
	
	/**
	 * Calculates the reflection of the vector {@code (v[0], v[1])} based on the given normalized
	 * surface normal {@code (nX, nY)} and saves the result in the given extraction parameter
	 * object.
	 * 
	 * @param <T>
	 *     The type of the extraction parameter object.
	 * 
	 * @param v
	 *     The vector as an array with at least two entries.
	 * @param nX
	 *     The value of the x component of the surface normal vector.
	 * @param nY
	 *     The value of the y component of the surface normal vector.
	 * @param res
	 *     The extraction parameter object.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup2WF> T rfl(float[] v, float nX, float nY, @ExtractionParam T res)
	{
		return rfl(v[0], v[1], nX, nY, res);
	}
	
	/**
	 * Calculates the reflection of the vector {@code (vX, vY)} based on the given normalized
	 * surface normal {@code (n)} and saves the result in the given extraction parameter object.
	 * 
	 * @param <T>
	 *     The type of the extraction parameter object.
	 * 
	 * @param vX
	 *     The value of the x component of the vector.
	 * @param vY
	 *     The value of the y component of the vector.
	 * @param n
	 *     The surface normal vector.
	 * @param res
	 *     The extraction parameter object.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup2WF> T rfl(float vX, float vY, Tup2RF n, @ExtractionParam T res)
	{
		return rfl(vX, vY, n.v0(), n.v1(), res);
	}
	
	/**
	 * Calculates the reflection of the vector {@code (vX, vY)} based on the given normalized
	 * surface normal {@code (n[0], n[1])} and saves the result in the given extraction parameter
	 * object.
	 * 
	 * @param <T>
	 *     The type of the extraction parameter object.
	 * 
	 * @param vX
	 *     The value of the x component of the vector.
	 * @param vY
	 *     The value of the y component of the vector.
	 * @param n
	 *     The surface normal vector as an array with at least two entries.
	 * @param res
	 *     The extraction parameter object.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup2WF> T rfl(float vX, float vY, float[] n, @ExtractionParam T res)
	{
		return rfl(vX, vY, n[0], n[1], res);
	}
	
	/**
	 * Calculates the reflection of the vector {@code (vX, vY)} based on the given normalized
	 * surface normal {@code (nX, nY)} and saves the result in the given extraction parameter
	 * object.
	 * 
	 * @param <T>
	 *     The type of the extraction parameter object.
	 * 
	 * @param vX
	 *     The value of the x component of the vector.
	 * @param vY
	 *     The value of the y component of the vector.
	 * @param nX
	 *     The value of the x component of the surface normal vector.
	 * @param nY
	 *     The value of the y component of the surface normal vector.
	 * @param res
	 *     The extraction parameter object.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup2WF> T rfl(float vX, float vY, float nX, float nY, @ExtractionParam T res)
	{
		float dot = -2 * dot(vX, vY, nX, nY);
		
		res.set(nX * dot + vX, nY * dot + vY);
		
		return res;
	}
	
	/**
	 * Returns the dot product (scalar product) between the first vector {@code (v1)} and the second
	 * vector {@code (v2)}.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v1 . v2}
	 * 
	 * @param v1
	 *     The first vector.
	 * @param v2
	 *     The second vector.
	 * 
	 * @return The dot product (scalar product).
	 */
	public static float dot(Tup2RF v1, Tup2RF v2)
	{
		return dot(v1.v0(), v1.v1(), v2.v0(), v2.v1());
	}
	
	/**
	 * Returns the dot product (scalar product) between the first vector {@code (v1)} and the second
	 * vector {@code (v2[0], v2[1])}.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v1 . (v2[0], v2[1])}
	 * 
	 * @param v1
	 *     The first vector.
	 * @param v2
	 *     The second vector as an array with at least two entries.
	 * 
	 * @return The dot product (scalar product).
	 */
	public static float dot(Tup2RF v1, float[] v2)
	{
		return dot(v1.v0(), v1.v1(), v2[0], v2[1]);
	}
	
	/**
	 * Returns the dot product (scalar product) between the first vector {@code (v1)} and the second
	 * vector {@code (v2x, v2y)}.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v1 . (v2x, v2y)}
	 * 
	 * @param v1
	 *     The first vector.
	 * @param v2x
	 *     The value of the x component of the second vector.
	 * @param v2y
	 *     The value of the y component of the second vector.
	 * 
	 * @return The dot product (scalar product).
	 */
	public static float dot(Tup2RF v1, float v2x, float v2y)
	{
		return dot(v1.v0(), v1.v1(), v2x, v2y);
	}
	
	/**
	 * Returns the dot product (scalar product) between the first vector {@code (v1[0], v1[1])} and
	 * the second vector {@code (v2)}.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v1[0], v1[1]) . v2}
	 * 
	 * @param v1
	 *     The first vector as an array with at least two entries.
	 * @param v2
	 *     The second vector.
	 * 
	 * @return The dot product (scalar product).
	 */
	public static float dot(float[] v1, Tup2RF v2)
	{
		return dot(v1[0], v1[1], v2.v0(), v2.v1());
	}
	
	/**
	 * Returns the dot product (scalar product) between the first vector {@code (v1[0], v1[1])} and
	 * the second vector {@code (v2[0], v2[1])}.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v1[0], v1[1]) . (v2[0], v2[1])}
	 * 
	 * @param v1
	 *     The first vector as an array with at least two entries.
	 * @param v2
	 *     The second vector as an array with at least two entries.
	 * 
	 * @return The dot product (scalar product).
	 */
	public static float dot(float[] v1, float[] v2)
	{
		return dot(v1[0], v1[1], v2[0], v2[1]);
	}
	
	/**
	 * Returns the dot product (scalar product) between the first vector {@code (v1[0], v1[1])} and
	 * the second vector {@code (v2x, v2y)}.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v1[0], v1[1]) . (v2x, v2y)}
	 * 
	 * @param v1
	 *     The first vector as an array with at least two entries.
	 * @param v2x
	 *     The value of the x component of the second vector.
	 * @param v2y
	 *     The value of the y component of the second vector.
	 * 
	 * @return The dot product (scalar product).
	 */
	public static float dot(float[] v1, float v2x, float v2y)
	{
		return dot(v1[0], v1[1], v2x, v2y);
	}
	
	/**
	 * Returns the dot product (scalar product) between the first vector {@code (v1x, v1y)} and the
	 * second vector {@code (v2)}.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v1x, v1y) . v2}
	 * 
	 * @param v1x
	 *     The value of the x component of the first vector.
	 * @param v1y
	 *     The value of the y component of the first vector.
	 * @param v2
	 *     The second vector.
	 * 
	 * @return The dot product (scalar product).
	 */
	public static float dot(float v1x, float v1y, Tup2RF v2)
	{
		return dot(v1x, v1y, v2.v0(), v2.v1());
	}
	
	/**
	 * Returns the dot product (scalar product) between the first vector {@code (v1x, v1y)} and the
	 * second vector {@code (v2[0], v2[1])}.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v1x, v1y) . (v2[0], v2[1])}
	 * 
	 * @param v1x
	 *     The value of the x component of the first vector.
	 * @param v1y
	 *     The value of the y component of the first vector.
	 * @param v2
	 *     The second vector as an array with at least two entries.
	 * 
	 * @return The dot product (scalar product).
	 */
	public static float dot(float v1x, float v1y, float[] v2)
	{
		return dot(v1x, v1y, v2[0], v2[1]);
	}
	
	/**
	 * Returns the dot product (scalar product) between the first vector {@code (v1x, v1y)} and the
	 * second vector {@code (v2x, v2y)}.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v1x, v1y) . (v2x, v2y)}
	 * 
	 * @param v1x
	 *     The value of the x component of the first vector.
	 * @param v1y
	 *     The value of the y component of the first vector.
	 * @param v2x
	 *     The value of the x component of the second vector.
	 * @param v2y
	 *     The value of the y component of the second vector.
	 * 
	 * @return The dot product (scalar product).
	 */
	public static float dot(float v1x, float v1y, float v2x, float v2y)
	{
		return v1x * v2x + v1y * v2y;
	}
	
	/**
	 * Calculates half the vector from the point given by the origin vector {@code (v1)} to the
	 * point given by the origin vector {@code (v2)} and saves the result in the extraction
	 * parameter.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v2 - v1) / 2}
	 * 
	 * @param v1
	 *     The first point.
	 * @param v2
	 *     The second point.
	 * @param res
	 *     The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] halfVec(Tup2RF v1, Tup2RF v2, @ExtractionParam float[] res)
	{
		return halfVec(v1.v0(), v1.v1(), v2.v0(), v2.v1(), res);
	}
	
	/**
	 * Calculates half the vector from the point given by the origin vector {@code (v1)} to the
	 * point given by the origin vector {@code (v2[0], v2[1])} and saves the result in the
	 * extraction parameter.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code ((v2[0], v2[1]) - v1) / 2}
	 * 
	 * @param v1
	 *     The first point.
	 * @param v2
	 *     The second point as an array with at least two entries.
	 * @param res
	 *     The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] halfVec(Tup2RF v1, float[] v2, @ExtractionParam float[] res)
	{
		return halfVec(v1.v0(), v1.v1(), v2[0], v2[1], res);
	}
	
	/**
	 * Calculates half the vector from the point given by the origin vector {@code (v1)} to the
	 * point given by the origin vector {@code (v2x, v2y)} and saves the result in the extraction
	 * parameter.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code ((v2x, v2y) - v1) / 2}
	 * 
	 * @param v1
	 *     The first point.
	 * @param v2x
	 *     The value of the x component of the second point.
	 * @param v2y
	 *     The value of the y component of the second point.
	 * @param res
	 *     The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] halfVec(Tup2RF v1, float v2x, float v2y, @ExtractionParam float[] res)
	{
		return halfVec(v1.v0(), v1.v1(), v2x, v2y, res);
	}
	
	/**
	 * Calculates half the vector from the point given by the origin vector {@code (v1[0], v1[1])}
	 * to the point given by the origin vector {@code (v2)} and saves the result in the extraction
	 * parameter.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v2 - (v1[0], v1[1])) / 2}
	 * 
	 * @param v1
	 *     The first point as an array with at least two entries.
	 * @param v2
	 *     The second point.
	 * @param res
	 *     The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] halfVec(float[] v1, Tup2RF v2, @ExtractionParam float[] res)
	{
		return halfVec(v1[0], v1[1], v2.v0(), v2.v1(), res);
	}
	
	/**
	 * Calculates half the vector from the point given by the origin vector {@code (v1[0], v1[1])}
	 * to the point given by the origin vector {@code (v2[0], v2[1])} and saves the result in the
	 * extraction parameter.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code ((v2[0], v2[1]) - (v1[0], v1[1])) / 2}
	 * 
	 * @param v1
	 *     The first point as an array with at least two entries.
	 * @param v2
	 *     The second point as an array with at least two entries.
	 * @param res
	 *     The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] halfVec(float[] v1, float[] v2, @ExtractionParam float[] res)
	{
		return halfVec(v1[0], v1[1], v2[0], v2[1], res);
	}
	
	/**
	 * Calculates half the vector from the point given by the origin vector {@code (v1[0], v1[1])}
	 * to the point given by the origin vector {@code (v2x, v2y)} and saves the result in the
	 * extraction parameter.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code ((v2x, v2y) - (v1[0], v1[1])) / 2}
	 * 
	 * @param v1
	 *     The first point as an array with at least two entries.
	 * @param v2x
	 *     The value of the x component of the second point.
	 * @param v2y
	 *     The value of the y component of the second point.
	 * @param res
	 *     The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] halfVec(float[] v1, float v2x, float v2y, @ExtractionParam float[] res)
	{
		return halfVec(v1[0], v1[1], v2x, v2y, res);
	}
	
	/**
	 * Calculates half the vector from the point given by the origin vector {@code (v1x, v1y)} to
	 * the point given by the origin vector {@code (v2)} and saves the result in the extraction
	 * parameter.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v2 - (v1x, v1y)) / 2}
	 * 
	 * @param v1x
	 *     The value of the x component of the first point.
	 * @param v1y
	 *     The value of the y component of the first point.
	 * @param v2
	 *     The second point.
	 * @param res
	 *     The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] halfVec(float v1x, float v1y, Tup2RF v2, @ExtractionParam float[] res)
	{
		return halfVec(v1x, v1y, v2.v0(), v2.v1(), res);
	}
	
	/**
	 * Calculates half the vector from the point given by the origin vector {@code (v1x, v1y)} to
	 * the point given by the origin vector {@code (v2[0], v2[1])} and saves the result in the
	 * extraction parameter.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code ((v2[0], v2[1]) - (v1x, v1y)) / 2}
	 * 
	 * @param v1x
	 *     The value of the x component of the first point.
	 * @param v1y
	 *     The value of the y component of the first point.
	 * @param v2
	 *     The second point as an array with at least two entries.
	 * @param res
	 *     The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] halfVec(float v1x, float v1y, float[] v2, @ExtractionParam float[] res)
	{
		return halfVec(v1x, v1y, v2[0], v2[1], res);
	}
	
	/**
	 * Calculates half the vector from the point given by the origin vector {@code (v1x, v1y)} to
	 * the point given by the origin vector {@code (v2x, v2y)} and saves the result in the
	 * extraction parameter.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code ((v2x, v2y) - (v1x, v1y)) / 2}
	 * 
	 * @param v1x
	 *     The value of the x component of the first point.
	 * @param v1y
	 *     The value of the y component of the first point.
	 * @param v2x
	 *     The value of the x component of the second point.
	 * @param v2y
	 *     The value of the y component of the second point.
	 * @param res
	 *     The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] halfVec(float v1x, float v1y, float v2x, float v2y, @ExtractionParam float[] res)
	{
		res[0] = (v2x - v1x) * 0.5f;
		res[1] = (v2y - v1y) * 0.5f;
		
		return res;
	}
	
	/**
	 * Calculates half the vector from the point given by the origin vector {@code (v1)} to the
	 * point given by the origin vector {@code (v2)} and saves the result in the extraction
	 * parameter object.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v2 - v1) / 2}
	 * 
	 * @param <T>
	 *     The type of the extraction parameter object.
	 * 
	 * @param v1
	 *     The first point.
	 * @param v2
	 *     The second point.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup2WF> T halfVec(Tup2RF v1, Tup2RF v2, @ExtractionParam T res)
	{
		return halfVec(v1.v0(), v1.v1(), v2.v0(), v2.v1(), res);
	}
	
	/**
	 * Calculates half the vector from the point given by the origin vector {@code (v1)} to the
	 * point given by the origin vector {@code (v2[0], v2[1])} and saves the result in the
	 * extraction parameter object.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code ((v2[0], v2[1]) - v1) / 2}
	 * 
	 * @param <T>
	 *     The type of the extraction parameter object.
	 * 
	 * @param v1
	 *     The first point.
	 * @param v2
	 *     The second point as an array with at least two entries.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup2WF> T halfVec(Tup2RF v1, float[] v2, @ExtractionParam T res)
	{
		return halfVec(v1.v0(), v1.v1(), v2[0], v2[1], res);
	}
	
	/**
	 * Calculates half the vector from the point given by the origin vector {@code (v1)} to the
	 * point given by the origin vector {@code (v2x, v2y)} and saves the result in the extraction
	 * parameter object.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code ((v2x, v2y) - v1) / 2}
	 * 
	 * @param <T>
	 *     The type of the extraction parameter object.
	 * 
	 * @param v1
	 *     The first point.
	 * @param v2x
	 *     The value of the x component of the second point.
	 * @param v2y
	 *     The value of the y component of the second point.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup2WF> T halfVec(Tup2RF v1, float v2x, float v2y, @ExtractionParam T res)
	{
		return halfVec(v1.v0(), v1.v1(), v2x, v2y, res);
	}
	
	/**
	 * Calculates half the vector from the point given by the origin vector {@code (v1[0], v1[1])}
	 * to the point given by the origin vector {@code (v2)} and saves the result in the extraction
	 * parameter object.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v2 - (v1[0], v1[1])) / 2}
	 * 
	 * @param <T>
	 *     The type of the extraction parameter object.
	 * 
	 * @param v1
	 *     The first point as an array with at least two entries.
	 * @param v2
	 *     The second point.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup2WF> T halfVec(float[] v1, Tup2RF v2, @ExtractionParam T res)
	{
		return halfVec(v1[0], v1[1], v2.v0(), v2.v1(), res);
	}
	
	/**
	 * Calculates half the vector from the point given by the origin vector {@code (v1[0], v1[1])}
	 * to the point given by the origin vector {@code (v2[0], v2[1])} and saves the result in the
	 * extraction parameter object.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code ((v2[0], v2[1]) - (v1[0], v1[1])) / 2}
	 * 
	 * @param <T>
	 *     The type of the extraction parameter object.
	 * 
	 * @param v1
	 *     The first point as an array with at least two entries.
	 * @param v2
	 *     The second point as an array with at least two entries.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup2WF> T halfVec(float[] v1, float[] v2, @ExtractionParam T res)
	{
		return halfVec(v1[0], v1[1], v2[0], v2[1], res);
	}
	
	/**
	 * Calculates half the vector from the point given by the origin vector {@code (v1[0], v1[1])}
	 * to the point given by the origin vector {@code (v2x, v2y)} and saves the result in the
	 * extraction parameter object.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code ((v2x, v2y) - (v1[0], v1[1])) / 2}
	 * 
	 * @param <T>
	 *     The type of the extraction parameter object.
	 * 
	 * @param v1
	 *     The first point as an array with at least two entries.
	 * @param v2x
	 *     The value of the x component of the second point.
	 * @param v2y
	 *     The value of the y component of the second point.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup2WF> T halfVec(float[] v1, float v2x, float v2y, @ExtractionParam T res)
	{
		return halfVec(v1[0], v1[1], v2x, v2y, res);
	}
	
	/**
	 * Calculates half the vector from the point given by the origin vector {@code (v1x, v1y)} to
	 * the point given by the origin vector {@code (v2)} and saves the result in the extraction
	 * parameter object.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v2 - (v1x, v1y)) / 2}
	 * 
	 * @param <T>
	 *     The type of the extraction parameter object.
	 * 
	 * @param v1x
	 *     The value of the x component of the first point.
	 * @param v1y
	 *     The value of the y component of the first point.
	 * @param v2
	 *     The second point.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup2WF> T halfVec(float v1x, float v1y, Tup2RF v2, @ExtractionParam T res)
	{
		return halfVec(v1x, v1y, v2.v0(), v2.v1(), res);
	}
	
	/**
	 * Calculates half the vector from the point given by the origin vector {@code (v1x, v1y)} to
	 * the point given by the origin vector {@code (v2[0], v2[1])} and saves the result in the
	 * extraction parameter object.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code ((v2[0], v2[1]) - (v1x, v1y)) / 2}
	 * 
	 * @param <T>
	 *     The type of the extraction parameter object.
	 * 
	 * @param v1x
	 *     The value of the x component of the first point.
	 * @param v1y
	 *     The value of the y component of the first point.
	 * @param v2
	 *     The second point as an array with at least two entries.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup2WF> T halfVec(float v1x, float v1y, float[] v2, @ExtractionParam T res)
	{
		return halfVec(v1x, v1y, v2[0], v2[1], res);
	}
	
	/**
	 * Calculates half the vector from the point given by the origin vector {@code (v1x, v1y)} to
	 * the point given by the origin vector {@code (v2x, v2y)} and saves the result in the
	 * extraction parameter object.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code ((v2x, v2y) - (v1x, v1y)) / 2}
	 * 
	 * @param <T>
	 *     The type of the extraction parameter object.
	 * 
	 * @param v1x
	 *     The value of the x component of the first point.
	 * @param v1y
	 *     The value of the y component of the first point.
	 * @param v2x
	 *     The value of the x component of the second point.
	 * @param v2y
	 *     The value of the y component of the second point.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup2WF> T halfVec(float v1x, float v1y, float v2x, float v2y, @ExtractionParam T res)
	{
		res.set((v2x - v1x) * 0.5f, (v2y - v1y) * 0.5f);
		
		return res;
	}
	
	/**
	 * Calculates the point that lies half way between the point given by the origin vector
	 * {@code (v1)} and the point given by the origin vector {@code (v2)} and saves the result in
	 * the extraction parameter.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v2 + v1) / 2}
	 * 
	 * @param v1
	 *     The first point.
	 * @param v2
	 *     The second point.
	 * @param res
	 *     The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] halfPoint(Tup2RF v1, Tup2RF v2, @ExtractionParam float[] res)
	{
		return halfPoint(v1.v0(), v1.v1(), v2.v0(), v2.v1(), res);
	}
	
	/**
	 * Calculates the point that lies half way between the point given by the origin vector
	 * {@code (v1)} and the point given by the origin vector {@code (v2[0], v2[1])} and saves the
	 * result in the extraction parameter.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code ((v2[0], v2[1]) + v1) / 2}
	 * 
	 * @param v1
	 *     The first point.
	 * @param v2
	 *     The second point as an array with at least two entries.
	 * @param res
	 *     The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] halfPoint(Tup2RF v1, float[] v2, @ExtractionParam float[] res)
	{
		return halfPoint(v1.v0(), v1.v1(), v2[0], v2[1], res);
	}
	
	/**
	 * Calculates the point that lies half way between the point given by the origin vector
	 * {@code (v1)} and the point given by the origin vector {@code (v2x, v2y)} and saves the result
	 * in the extraction parameter.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code ((v2x, v2y) + v1) / 2}
	 * 
	 * @param v1
	 *     The first point.
	 * @param v2x
	 *     The value of the x component of the second point.
	 * @param v2y
	 *     The value of the y component of the second point.
	 * @param res
	 *     The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] halfPoint(Tup2RF v1, float v2x, float v2y, @ExtractionParam float[] res)
	{
		return halfPoint(v1.v0(), v1.v1(), v2x, v2y, res);
	}
	
	/**
	 * Calculates the point that lies half way between the point given by the origin vector
	 * {@code (v1[0], v1[1])} and the point given by the origin vector {@code (v2)} and saves the
	 * result in the extraction parameter.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v2 + (v1[0], v1[1])) / 2}
	 * 
	 * @param v1
	 *     The first point as an array with at least two entries.
	 * @param v2
	 *     The second point.
	 * @param res
	 *     The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] halfPoint(float[] v1, Tup2RF v2, @ExtractionParam float[] res)
	{
		return halfPoint(v1[0], v1[1], v2.v0(), v2.v1(), res);
	}
	
	/**
	 * Calculates the point that lies half way between the point given by the origin vector
	 * {@code (v1[0], v1[1])} and the point given by the origin vector {@code (v2[0], v2[1])} and
	 * saves the result in the extraction parameter.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code ((v2[0], v2[1]) + (v1[0], v1[1])) / 2}
	 * 
	 * @param v1
	 *     The first point as an array with at least two entries.
	 * @param v2
	 *     The second point as an array with at least two entries.
	 * @param res
	 *     The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] halfPoint(float[] v1, float[] v2, @ExtractionParam float[] res)
	{
		return halfPoint(v1[0], v1[1], v2[0], v2[1], res);
	}
	
	/**
	 * Calculates the point that lies half way between the point given by the origin vector
	 * {@code (v1[0], v1[1])} and the point given by the origin vector {@code (v2x, v2y)} and saves
	 * the result in the extraction parameter.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code ((v2x, v2y) + (v1[0], v1[1])) / 2}
	 * 
	 * @param v1
	 *     The first point as an array with at least two entries.
	 * @param v2x
	 *     The value of the x component of the second point.
	 * @param v2y
	 *     The value of the y component of the second point.
	 * @param res
	 *     The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] halfPoint(float[] v1, float v2x, float v2y, @ExtractionParam float[] res)
	{
		return halfPoint(v1[0], v1[1], v2x, v2y, res);
	}
	
	/**
	 * Calculates the point that lies half way between the point given by the origin vector
	 * {@code (v1x, v1y)} and the point given by the origin vector {@code (v2)} and saves the result
	 * in the extraction parameter.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v2 + (v1x, v1y)) / 2}
	 * 
	 * @param v1x
	 *     The value of the x component of the first point.
	 * @param v1y
	 *     The value of the y component of the first point.
	 * @param v2
	 *     The second point.
	 * @param res
	 *     The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] halfPoint(float v1x, float v1y, Tup2RF v2, @ExtractionParam float[] res)
	{
		return halfPoint(v1x, v1y, v2.v0(), v2.v1(), res);
	}
	
	/**
	 * Calculates the point that lies half way between the point given by the origin vector
	 * {@code (v1x, v1y)} and the point given by the origin vector {@code (v2[0], v2[1])} and saves
	 * the result in the extraction parameter.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code ((v2[0], v2[1]) + (v1x, v1y)) / 2}
	 * 
	 * @param v1x
	 *     The value of the x component of the first point.
	 * @param v1y
	 *     The value of the y component of the first point.
	 * @param v2
	 *     The second point as an array with at least two entries.
	 * @param res
	 *     The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] halfPoint(float v1x, float v1y, float[] v2, @ExtractionParam float[] res)
	{
		return halfPoint(v1x, v1y, v2[0], v2[1], res);
	}
	
	/**
	 * Calculates the point that lies half way between the point given by the origin vector
	 * {@code (v1x, v1y)} and the point given by the origin vector {@code (v2x, v2y)} and saves the
	 * result in the extraction parameter.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code ((v2x, v2y) + (v1x, v1y)) / 2}
	 * 
	 * @param v1x
	 *     The value of the x component of the first point.
	 * @param v1y
	 *     The value of the y component of the first point.
	 * @param v2x
	 *     The value of the x component of the second point.
	 * @param v2y
	 *     The value of the y component of the second point.
	 * @param res
	 *     The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] halfPoint(float v1x, float v1y, float v2x, float v2y, @ExtractionParam float[] res)
	{
		res[0] = (v2x - v1x) * 0.5f;
		res[1] = (v2y - v1y) * 0.5f;
		
		return res;
	}
	
	/**
	 * Calculates the point that lies half way between the point given by the origin vector
	 * {@code (v1)} and the point given by the origin vector {@code (v2)} and saves the result in
	 * the extraction parameter object.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v2 + v1) / 2}
	 * 
	 * @param <T>
	 *     The type of the extraction parameter object.
	 * 
	 * @param v1
	 *     The first point.
	 * @param v2
	 *     The second point.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup2WF> T halfPoint(Tup2RF v1, Tup2RF v2, @ExtractionParam T res)
	{
		return halfPoint(v1.v0(), v1.v1(), v2.v0(), v2.v1(), res);
	}
	
	/**
	 * Calculates the point that lies half way between the point given by the origin vector
	 * {@code (v1)} and the point given by the origin vector {@code (v2[0], v2[1])} and saves the
	 * result in the extraction parameter object.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code ((v2[0], v2[1]) + v1) / 2}
	 * 
	 * @param <T>
	 *     The type of the extraction parameter object.
	 * 
	 * @param v1
	 *     The first point.
	 * @param v2
	 *     The second point as an array with at least two entries.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup2WF> T halfPoint(Tup2RF v1, float[] v2, @ExtractionParam T res)
	{
		return halfPoint(v1.v0(), v1.v1(), v2[0], v2[1], res);
	}
	
	/**
	 * Calculates the point that lies half way between the point given by the origin vector
	 * {@code (v1)} and the point given by the origin vector {@code (v2x, v2y)} and saves the result
	 * in the extraction parameter object.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code ((v2x, v2y) + v1) / 2}
	 * 
	 * @param <T>
	 *     The type of the extraction parameter object.
	 * 
	 * @param v1
	 *     The first point.
	 * @param v2x
	 *     The value of the x component of the second point.
	 * @param v2y
	 *     The value of the y component of the second point.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup2WF> T halfPoint(Tup2RF v1, float v2x, float v2y, @ExtractionParam T res)
	{
		return halfPoint(v1.v0(), v1.v1(), v2x, v2y, res);
	}
	
	/**
	 * Calculates the point that lies half way between the point given by the origin vector
	 * {@code (v1[0], v1[1])} and the point given by the origin vector {@code (v2)} and saves the
	 * result in the extraction parameter object.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v2 + (v1[0], v1[1])) / 2}
	 * 
	 * @param <T>
	 *     The type of the extraction parameter object.
	 * 
	 * @param v1
	 *     The first point as an array with at least two entries.
	 * @param v2
	 *     The second point
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup2WF> T halfPoint(float[] v1, Tup2RF v2, @ExtractionParam T res)
	{
		return halfPoint(v1[0], v1[1], v2.v0(), v2.v1(), res);
	}
	
	/**
	 * Calculates the point that lies half way between the point given by the origin vector
	 * {@code (v1[0], v1[1])} and the point given by the origin vector {@code (v2[0], v2[1])} and
	 * saves the result in the extraction parameter object.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code ((v2[0], v2[1]) + (v1[0], v1[1])) / 2}
	 * 
	 * @param <T>
	 *     The type of the extraction parameter object.
	 * 
	 * @param v1
	 *     The first point as an array with at least two entries.
	 * @param v2
	 *     The second point as an array with at least two entries.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup2WF> T halfPoint(float[] v1, float[] v2, @ExtractionParam T res)
	{
		return halfPoint(v1[0], v1[1], v2[0], v2[1], res);
	}
	
	/**
	 * Calculates the point that lies half way between the point given by the origin vector
	 * {@code (v1[0], v1[1])} and the point given by the origin vector {@code (v2x, v2y)} and saves
	 * the result in the extraction parameter object.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code ((v2x, v2y) + (v1[0], v1[1])) / 2}
	 * 
	 * @param <T>
	 *     The type of the extraction parameter object.
	 * 
	 * @param v1
	 *     The first point as an array with at least two entries.
	 * @param v2x
	 *     The value of the x component of the second point.
	 * @param v2y
	 *     The value of the y component of the second point.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup2WF> T halfPoint(float[] v1, float v2x, float v2y, @ExtractionParam T res)
	{
		return halfPoint(v1[0], v1[1], v2x, v2y, res);
	}
	
	/**
	 * Calculates the point that lies half way between the point given by the origin vector
	 * {@code (v1x, v1y)} and the point given by the origin vector {@code (v2)} and saves the result
	 * in the extraction parameter object.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v2 + (v1x, v1y)) / 2}
	 * 
	 * @param <T>
	 *     The type of the extraction parameter object.
	 * 
	 * @param v1x
	 *     The value of the x component of the first point.
	 * @param v1y
	 *     The value of the y component of the first point.
	 * @param v2
	 *     The second point.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup2WF> T halfPoint(float v1x, float v1y, Tup2RF v2, @ExtractionParam T res)
	{
		return halfPoint(v1x, v1y, v2.v0(), v2.v1(), res);
	}
	
	/**
	 * Calculates the point that lies half way between the point given by the origin vector
	 * {@code (v1x, v1y)} and the point given by the origin vector {@code (v2[0], v2[1])} and saves
	 * the result in the extraction parameter object.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code ((v2[0], v2[1]) + (v1x, v1y)) / 2}
	 * 
	 * @param <T>
	 *     The type of the extraction parameter object.
	 * 
	 * @param v1x
	 *     The value of the x component of the first point.
	 * @param v1y
	 *     The value of the y component of the first point.
	 * @param v2
	 *     The second point as an array with at least two entries.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup2WF> T halfPoint(float v1x, float v1y, float[] v2, @ExtractionParam T res)
	{
		return halfPoint(v1x, v1y, v2[0], v2[1], res);
	}
	
	/**
	 * Calculates the point that lies half way between the point given by the origin vector
	 * {@code (v1x, v1y)} and the point given by the origin vector {@code (v2x, v2y)} and saves the
	 * result in the extraction parameter object.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code ((v2x, v2y) + (v1x, v1y)) / 2}
	 * 
	 * @param <T>
	 *     The type of the extraction parameter object.
	 * 
	 * @param v1x
	 *     The value of the x component of the first point.
	 * @param v1y
	 *     The value of the y component of the first point.
	 * @param v2x
	 *     The value of the x component of the second point.
	 * @param v2y
	 *     The value of the y component of the second point.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	public static <T extends Tup2WF> T halfPoint(float v1x, float v1y, float v2x, float v2y, @ExtractionParam T res)
	{
		res.set((v2x - v1x) * 0.5f, (v2y - v1y) * 0.5f);
		
		return res;
	}
	
	/**
	 * Returns the distance from the point given by the origin vector {@code (v1)} to the point
	 * given by the origin vector {@code (v2)}.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link MathUtil#PROVIDER} is used for
	 * calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code |v2 - v1|}
	 * 
	 * @param v1
	 *     The first point.
	 * @param v2
	 *     The second point.
	 * 
	 * @return The distance between the points.
	 */
	public static float dist(Tup2RF v1, Tup2RF v2)
	{
		return dist(v1.v0(), v1.v1(), v2.v0(), v2.v1());
	}
	
	/**
	 * Returns the distance from the point given by the origin vector {@code (v1)} to the point
	 * given by the origin vector {@code (v2)}.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link MathUtil#PROVIDER} is used for
	 * calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code |v2 - v1|}
	 * 
	 * @param v1
	 *     The first point.
	 * @param v2
	 *     The second point.
	 * @param tolerance
	 *     The tolerance for defining the margin around zero. Must be positive.
	 * 
	 * @return The distance between the points.
	 */
	public static float dist(float tolerance, Tup2RF v1, Tup2RF v2)
	{
		return dist(v1.v0(), v1.v1(), v2.v0(), v2.v1(), tolerance);
	}
	
	/**
	 * Returns the distance from the point given by the origin vector {@code (v1)} to the point
	 * given by the origin vector {@code (v2[0], v2[1])}.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link MathUtil#PROVIDER} is used for
	 * calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code |(v2[0], v2[1]) - v1|}
	 * 
	 * @param v1
	 *     The first point.
	 * @param v2
	 *     The second point as an array with at least two entries.
	 * 
	 * @return The distance between the points.
	 */
	public static float dist(Tup2RF v1, float[] v2)
	{
		return dist(v1.v0(), v1.v1(), v2[0], v2[1]);
	}
	
	/**
	 * Returns the distance from the point given by the origin vector {@code (v1)} to the point
	 * given by the origin vector {@code (v2[0], v2[1])}.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link MathUtil#PROVIDER} is used for
	 * calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code |(v2[0], v2[1]) - v1|}
	 * 
	 * @param v1
	 *     The first point.
	 * @param v2
	 *     The second point as an array with at least two entries.
	 * @param tolerance
	 *     The tolerance for defining the margin around zero. Must be positive.
	 * 
	 * @return The distance between the points.
	 */
	public static float dist(float tolerance, Tup2RF v1, float[] v2)
	{
		return dist(v1.v0(), v1.v1(), v2[0], v2[1], tolerance);
	}
	
	/**
	 * Returns the distance from the point given by the origin vector {@code (v1)} to the point
	 * given by the origin vector {@code (v2x, v2y)}.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link MathUtil#PROVIDER} is used for
	 * calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code |(v2x, v2y) - v1|}
	 * 
	 * @param v1
	 *     The first point.
	 * @param v2x
	 *     The value of the x component of the second point.
	 * @param v2y
	 *     The value of the y component of the second point.
	 * 
	 * @return The distance between the points.
	 */
	public static float dist(Tup2RF v1, float v2x, float v2y)
	{
		return dist(v1.v0(), v1.v1(), v2x, v2y);
	}
	
	/**
	 * Returns the distance from the point given by the origin vector {@code (v1)} to the point
	 * given by the origin vector {@code (v2x, v2y)}.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link MathUtil#PROVIDER} is used for
	 * calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code |(v2x, v2y) - v1|}
	 * 
	 * @param v1
	 *     The first point.
	 * @param v2x
	 *     The value of the x component of the second point.
	 * @param v2y
	 *     The value of the y component of the second point.
	 * @param tolerance
	 *     The tolerance for defining the margin around zero. Must be positive.
	 * 
	 * @return The distance between the points.
	 */
	public static float dist(float tolerance, Tup2RF v1, float v2x, float v2y)
	{
		return dist(v1.v0(), v1.v1(), v2x, v2y, tolerance);
	}
	
	/**
	 * Returns the distance from the point given by the origin vector {@code (v1[0], v1[1])} to the
	 * point given by the origin vector {@code (v2)}.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link MathUtil#PROVIDER} is used for
	 * calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code |v2 - (v1[0], v1[1])|}
	 * 
	 * @param v1
	 *     The first point as an array with at least two entries.
	 * @param v2
	 *     The second point.
	 * 
	 * @return The distance between the points.
	 */
	public static float dist(float[] v1, Tup2RF v2)
	{
		return dist(v1[0], v1[1], v2.v0(), v2.v1());
	}
	
	/**
	 * Returns the distance from the point given by the origin vector {@code (v1[0], v1[1])} to the
	 * point given by the origin vector {@code (v2)}.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link MathUtil#PROVIDER} is used for
	 * calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code |v2 - (v1[0], v1[1])|}
	 * 
	 * @param v1
	 *     The first point as an array with at least two entries.
	 * @param v2
	 *     The second point.
	 * @param tolerance
	 *     The tolerance for defining the margin around zero. Must be positive.
	 * 
	 * @return The distance between the points.
	 */
	public static float dist(float tolerance, float[] v1, Tup2RF v2)
	{
		return dist(v1[0], v1[1], v2.v0(), v2.v1(), tolerance);
	}
	
	/**
	 * Returns the distance from the point given by the origin vector {@code (v1[0], v1[1])} to the
	 * point given by the origin vector {@code (v2[0], v2[1])}.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link MathUtil#PROVIDER} is used for
	 * calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code |(v2[0], v2[1]) - (v1[0], v1[1])|}
	 * 
	 * @param v1
	 *     The first point as an array with at least two entries.
	 * @param v2
	 *     The second point as an array with at least two entries.
	 * 
	 * @return The distance between the points.
	 */
	public static float dist(float[] v1, float[] v2)
	{
		return dist(v1[0], v1[1], v2[0], v2[1]);
	}
	
	/**
	 * Returns the distance from the point given by the origin vector {@code (v1[0], v1[1])} to the
	 * point given by the origin vector {@code (v2[0], v2[1])}.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link MathUtil#PROVIDER} is used for
	 * calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code |(v2[0], v2[1]) - (v1[0], v1[1])|}
	 * 
	 * @param v1
	 *     The first point as an array with at least two entries.
	 * @param v2
	 *     The second point as an array with at least two entries.
	 * @param tolerance
	 *     The tolerance for defining the margin around zero. Must be positive.
	 * 
	 * @return The distance between the points.
	 */
	public static float dist(float tolerance, float[] v1, float[] v2)
	{
		return dist(v1[0], v1[1], v2[0], v2[1], tolerance);
	}
	
	/**
	 * Returns the distance from the point given by the origin vector {@code (v1[0], v1[1])} to the
	 * point given by the origin vector {@code (v2x, v2y)}.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link MathUtil#PROVIDER} is used for
	 * calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code |(v2x, v2y) - (v1[0], v1[1])|}
	 * 
	 * @param v1
	 *     The first point as an array with at least two entries.
	 * @param v2x
	 *     The value of the x component of the second point.
	 * @param v2y
	 *     The value of the y component of the second point.
	 * 
	 * @return The distance between the points.
	 */
	public static float dist(float[] v1, float v2x, float v2y)
	{
		return dist(v1[0], v1[1], v2x, v2y);
	}
	
	/**
	 * Returns the distance from the point given by the origin vector {@code (v1[0], v1[1])} to the
	 * point given by the origin vector {@code (v2x, v2y)}.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link MathUtil#PROVIDER} is used for
	 * calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code |(v2x, v2y) - (v1[0], v1[1])|}
	 * 
	 * @param v1
	 *     The first point as an array with at least two entries.
	 * @param v2x
	 *     The value of the x component of the second point.
	 * @param v2y
	 *     The value of the y component of the second point.
	 * @param tolerance
	 *     The tolerance for defining the margin around zero. Must be positive.
	 * 
	 * @return The distance between the points.
	 */
	public static float dist(float tolerance, float[] v1, float v2x, float v2y)
	{
		return dist(v1[0], v1[1], v2x, v2y, tolerance);
	}
	
	/**
	 * Returns the distance from the point given by the origin vector {@code (v1x, v1y)} to the
	 * point given by the origin vector {@code (v2)}.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link MathUtil#PROVIDER} is used for
	 * calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code |v2 - (v1x, v1y)|}
	 * 
	 * @param v1x
	 *     The value of the x component of the first point.
	 * @param v1y
	 *     The value of the y component of the first point.
	 * @param v2
	 *     The second point.
	 * 
	 * @return The distance between the points.
	 */
	public static float dist(float v1x, float v1y, Tup2RF v2)
	{
		return dist(v1x, v1y, v2.v0(), v2.v1());
	}
	
	/**
	 * Returns the distance from the point given by the origin vector {@code (v1x, v1y)} to the
	 * point given by the origin vector {@code (v2)}.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link MathUtil#PROVIDER} is used for
	 * calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code |v2 - (v1x, v1y)|}
	 * 
	 * @param v1x
	 *     The value of the x component of the first point.
	 * @param v1y
	 *     The value of the y component of the first point.
	 * @param v2
	 *     The second point.
	 * @param tolerance
	 *     The tolerance for defining the margin around zero. Must be positive.
	 * 
	 * @return The distance between the points.
	 */
	public static float dist(float tolerance, float v1x, float v1y, Tup2RF v2)
	{
		return dist(v1x, v1y, v2.v0(), v2.v1(), tolerance);
	}
	
	/**
	 * Returns the distance from the point given by the origin vector {@code (v1x, v1y)} to the
	 * point given by the origin vector {@code (v2[0], v2[1])}.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link MathUtil#PROVIDER} is used for
	 * calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code |(v2[0], v2[1]) - (v1x, v1y)|}
	 * 
	 * @param v1x
	 *     The value of the x component of the first point.
	 * @param v1y
	 *     The value of the y component of the first point.
	 * @param v2
	 *     The second point as an array with at least two entries.
	 * 
	 * @return The distance between the points.
	 */
	public static float dist(float v1x, float v1y, float[] v2)
	{
		return dist(v1x, v1y, v2[0], v2[1]);
	}
	
	/**
	 * Returns the distance from the point given by the origin vector {@code (v1x, v1y)} to the
	 * point given by the origin vector {@code (v2[0], v2[1])}.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link MathUtil#PROVIDER} is used for
	 * calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code |(v2[0], v2[1]) - (v1x, v1y)|}
	 * 
	 * @param v1x
	 *     The value of the x component of the first point.
	 * @param v1y
	 *     The value of the y component of the first point.
	 * @param v2
	 *     The second point as an array with at least two entries.
	 * @param tolerance
	 *     The tolerance for defining the margin around zero. Must be positive.
	 * 
	 * @return The distance between the points.
	 */
	public static float dist(float tolerance, float v1x, float v1y, float[] v2)
	{
		return dist(v1x, v1y, v2[0], v2[1], tolerance);
	}
	
	/**
	 * Returns the distance from the point given by the origin vector {@code (v1x, v1y)} to the
	 * point given by the origin vector {@code (v2x, v2y)}.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link MathUtil#PROVIDER} is used for
	 * calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code |(v2x, v2y) - (v1x, v1y)|}
	 * 
	 * @param v1x
	 *     The value of the x component of the first point.
	 * @param v1y
	 *     The value of the y component of the first point.
	 * @param v2x
	 *     The value of the x component of the second point.
	 * @param v2y
	 *     The value of the y component of the second point.
	 * 
	 * @return The distance between the points.
	 */
	public static float dist(float v1x, float v1y, float v2x, float v2y)
	{
		return len(v2x - v1x, v2y - v1y);
	}
	
	/**
	 * Returns the distance from the point given by the origin vector {@code (v1x, v1y)} to the
	 * point given by the origin vector {@code (v2x, v2y)}. If the values of all components are
	 * within the margin defined by {@code (-tolerance <= value <= tolerance)} around the other
	 * vectors components the result will be zero.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link MathUtil#PROVIDER} is used for
	 * calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code |(v2x, v2y) - (v1x, v1y)|}
	 * 
	 * @param v1x
	 *     The value of the x component of the first point.
	 * @param v1y
	 *     The value of the y component of the first point.
	 * @param v2x
	 *     The value of the x component of the second point.
	 * @param v2y
	 *     The value of the y component of the second point.
	 * @param tolerance
	 *     The tolerance for defining the margin around zero. Must be positive.
	 * 
	 * @return The distance between the points.
	 */
	public static float dist(float tolerance, float v1x, float v1y, float v2x, float v2y)
	{
		return len(v2x - v1x, v2y - v1y, tolerance);
	}
	
	/**
	 * Returns the squared distance from the point given by the origin vector {@code (v1)} to the
	 * point given by the origin vector {@code (v2)}.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code |v2 - v1|²}
	 * 
	 * @param v1
	 *     The first point.
	 * @param v2
	 *     The second point.
	 * 
	 * @return The squared distance between the points.
	 */
	public static float sqrDist(Tup2RF v1, Tup2RF v2)
	{
		return sqrDist(v1.v0(), v1.v1(), v2.v0(), v2.v1());
	}
	
	/**
	 * Returns the squared distance from the point given by the origin vector {@code (v1)} to the
	 * point given by the origin vector {@code (v2[0], v2[1])}.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code |(v2[0], v2[1]) - v1|²}
	 * 
	 * @param v1
	 *     The first point.
	 * @param v2
	 *     The second point as an array with at least two entries.
	 * 
	 * @return The squared distance between the points.
	 */
	public static float sqrDist(Tup2RF v1, float[] v2)
	{
		return sqrDist(v1.v0(), v1.v1(), v2[0], v2[1]);
	}
	
	/**
	 * Returns the squared distance from the point given by the origin vector {@code (v1)} to the
	 * point given by the origin vector {@code (v2x, v2y)}.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code |(v2x, v2y) - v1|²}
	 * 
	 * @param v1
	 *     The first point.
	 * @param v2x
	 *     The value of the x component of the second point.
	 * @param v2y
	 *     The value of the y component of the second point.
	 * 
	 * @return The squared distance between the points.
	 */
	public static float sqrDist(Tup2RF v1, float v2x, float v2y)
	{
		return sqrDist(v1.v0(), v1.v1(), v2x, v2y);
	}
	
	/**
	 * Returns the squared distance from the point given by the origin vector {@code (v1[0], v1[1])}
	 * to the point given by the origin vector {@code (v2)}.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code |v2 - (v1[0], v1[1])|²}
	 * 
	 * @param v1
	 *     The first point as an array with at least two entries.
	 * @param v2
	 *     The second point.
	 * 
	 * @return The squared distance between the points.
	 */
	public static float sqrDist(float[] v1, Tup2RF v2)
	{
		return sqrDist(v1[0], v1[1], v2.v0(), v2.v1());
	}
	
	/**
	 * Returns the squared distance from the point given by the origin vector {@code (v1[0], v1[1])}
	 * to the point given by the origin vector {@code (v2[0], v2[1])}.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code |(v2[0], v2[1]) - (v1[0], v1[1])|²}
	 * 
	 * @param v1
	 *     The first point as an array with at least two entries.
	 * @param v2
	 *     The second point as an array with at least two entries.
	 * 
	 * @return The squared distance between the points.
	 */
	public static float sqrDist(float[] v1, float[] v2)
	{
		return sqrDist(v1[0], v1[1], v2[0], v2[1]);
	}
	
	/**
	 * Returns the squared distance from the point given by the origin vector {@code (v1[0], v1[1])}
	 * to the point given by the origin vector {@code (v2x, v2y)}.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code |(v2x, v2y) - (v1[0], v1[1])|²}
	 * 
	 * @param v1
	 *     The first point as an array with at least two entries.
	 * @param v2x
	 *     The value of the x component of the second point.
	 * @param v2y
	 *     The value of the y component of the second point.
	 * 
	 * @return The squared distance between the points.
	 */
	public static float sqrDist(float[] v1, float v2x, float v2y)
	{
		return sqrDist(v1[0], v1[1], v2x, v2y);
	}
	
	/**
	 * Returns the squared distance from the point given by the origin vector {@code (v1x, v1y)} to
	 * the point given by the origin vector {@code (v2)}.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code |v2 - (v1x, v1y)|²}
	 * 
	 * @param v1x
	 *     The value of the x component of the first point.
	 * @param v1y
	 *     The value of the y component of the first point.
	 * @param v2
	 *     The second point.
	 * 
	 * @return The squared distance between the points.
	 */
	public static float sqrDist(float v1x, float v1y, Tup2RF v2)
	{
		return sqrDist(v1x, v1y, v2.v0(), v2.v1());
	}
	
	/**
	 * Returns the squared distance from the point given by the origin vector {@code (v1x, v1y)} to
	 * the point given by the origin vector {@code (v2[0], v2[1])}.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code |(v2[0], v2[1]) - (v1x, v1y)|²}
	 * 
	 * @param v1x
	 *     The value of the x component of the first point.
	 * @param v1y
	 *     The value of the y component of the first point.
	 * @param v2
	 *     The second point as an array with at least two entries.
	 * 
	 * @return The squared distance between the points.
	 */
	public static float sqrDist(float v1x, float v1y, float[] v2)
	{
		return sqrDist(v1x, v1y, v2[0], v2[1]);
	}
	
	/**
	 * Returns the squared distance from the point given by the origin vector {@code (v1x, v1y)} to
	 * the point given by the origin vector {@code (v2x, v2y)}.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code |(v2x, v2y) - (v1x, v1y)|²}
	 * 
	 * @param v1x
	 *     The value of the x component of the first point.
	 * @param v1y
	 *     The value of the y component of the first point.
	 * @param v2x
	 *     The value of the x component of the second point.
	 * @param v2y
	 *     The value of the y component of the second point.
	 * 
	 * @return The squared distance between the points.
	 */
	public static float sqrDist(float v1x, float v1y, float v2x, float v2y)
	{
		return sqrLen(v2x - v1x, v2y - v1y);
	}
	
	/**
	 * Returns the inverse distance from the point given by the origin vector {@code (v1)} to the
	 * point given by the origin vector {@code (v2)}.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link MathUtil#PROVIDER} is used for
	 * calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code 1 / |v2 - v1|}
	 * 
	 * @param v1
	 *     The first point.
	 * @param v2
	 *     The second point.
	 * 
	 * @return The invers distance between the points.
	 */
	public static float invDist(Tup2RF v1, Tup2RF v2)
	{
		return invDist(v1.v0(), v1.v1(), v2.v0(), v2.v1());
	}
	
	/**
	 * Returns the inverse distance from the point given by the origin vector {@code (v1)} to the
	 * point given by the origin vector {@code (v2[0], v2[1])}.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link MathUtil#PROVIDER} is used for
	 * calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code 1 / |(v2[0], v2[1]) - v1|}
	 * 
	 * @param v1
	 *     The first point.
	 * @param v2
	 *     The second point as an array with at least two entries.
	 * 
	 * @return The invers distance between the points.
	 */
	public static float invDist(Tup2RF v1, float[] v2)
	{
		return invDist(v1.v0(), v1.v1(), v2[0], v2[1]);
	}
	
	/**
	 * Returns the inverse distance from the point given by the origin vector {@code (v1)} to the
	 * point given by the origin vector {@code (v2x, v2y)}.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link MathUtil#PROVIDER} is used for
	 * calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code 1 / |(v2x, v2y) - v1|}
	 * 
	 * @param v1
	 *     The first point.
	 * @param v2x
	 *     The value of the x component of the second point.
	 * @param v2y
	 *     The value of the y component of the second point.
	 * 
	 * @return The invers distance between the points.
	 */
	public static float invDist(Tup2RF v1, float v2x, float v2y)
	{
		return invDist(v1.v0(), v1.v1(), v2x, v2y);
	}
	
	/**
	 * Returns the inverse distance from the point given by the origin vector {@code (v1[0], v1[1])}
	 * to the point given by the origin vector {@code (v2)}.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link MathUtil#PROVIDER} is used for
	 * calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code 1 / |v2 - (v1[0], v1[1])|}
	 * 
	 * @param v1
	 *     The first point as an array with at least two entries.
	 * @param v2
	 *     The second point.
	 * 
	 * @return The invers distance between the points.
	 */
	public static float invDist(float[] v1, Tup2RF v2)
	{
		return invDist(v1[0], v1[1], v2.v0(), v2.v1());
	}
	
	/**
	 * Returns the inverse distance from the point given by the origin vector {@code (v1[0], v1[1])}
	 * to the point given by the origin vector {@code (v2[0], v2[1])}.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link MathUtil#PROVIDER} is used for
	 * calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code 1 / |(v2[0], v2[1]) - (v1[0], v1[1])|}
	 * 
	 * @param v1
	 *     The first point as an array with at least two entries.
	 * @param v2
	 *     The second point as an array with at least two entries.
	 * 
	 * @return The invers distance between the points.
	 */
	public static float invDist(float[] v1, float[] v2)
	{
		return invDist(v1[0], v1[1], v2[0], v2[1]);
	}
	
	/**
	 * Returns the inverse distance from the point given by the origin vector {@code (v1[0], v1[1])}
	 * to the point given by the origin vector {@code (v2x, v2y)}.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link MathUtil#PROVIDER} is used for
	 * calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code 1 / |(v2x, v2y) - (v1[0], v1[1])|}
	 * 
	 * @param v1
	 *     The first point as an array with at least two entries.
	 * @param v2x
	 *     The value of the x component of the second point.
	 * @param v2y
	 *     The value of the y component of the second point.
	 * 
	 * @return The invers distance between the points.
	 */
	public static float invDist(float[] v1, float v2x, float v2y)
	{
		return invDist(v1[0], v1[1], v2x, v2y);
	}
	
	/**
	 * Returns the inverse distance from the point given by the origin vector {@code (v1x, v1y)} to
	 * the point given by the origin vector {@code (v2)}.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link MathUtil#PROVIDER} is used for
	 * calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code 1 / |v2 - (v1x, v1y)|}
	 * 
	 * @param v1x
	 *     The value of the x component of the first point.
	 * @param v1y
	 *     The value of the y component of the first point.
	 * @param v2
	 *     The second point.
	 * 
	 * @return The invers distance between the points.
	 */
	public static float invDist(float v1x, float v1y, Tup2RF v2)
	{
		return invDist(v1x, v1y, v2.v0(), v2.v1());
	}
	
	/**
	 * Returns the inverse distance from the point given by the origin vector {@code (v1x, v1y)} to
	 * the point given by the origin vector {@code (v2[0], v2[1])}.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link MathUtil#PROVIDER} is used for
	 * calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code 1 / |(v2[0], v2[1]) - (v1x, v1y)|}
	 * 
	 * @param v1x
	 *     The value of the x component of the first point.
	 * @param v1y
	 *     The value of the y component of the first point.
	 * @param v2
	 *     The second point as an array with at least two entries.
	 * 
	 * @return The invers distance between the points.
	 */
	public static float invDist(float v1x, float v1y, float[] v2)
	{
		return invDist(v1x, v1y, v2[0], v2[1]);
	}
	
	/**
	 * Returns the inverse distance from the point given by the origin vector {@code (v1x, v1y)} to
	 * the point given by the origin vector {@code (v2x, v2y)}.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link MathUtil#PROVIDER} is used for
	 * calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code 1 / |(v2x, v2y) - (v1x, v1y)|}
	 * 
	 * @param v1x
	 *     The value of the x component of the first point.
	 * @param v1y
	 *     The value of the y component of the first point.
	 * @param v2x
	 *     The value of the x component of the second point.
	 * @param v2y
	 *     The value of the y component of the second point.
	 * 
	 * @return The invers distance between the points.
	 */
	public static float invDist(float v1x, float v1y, float v2x, float v2y)
	{
		return invLen(v2x - v1x, v2y - v1y);
	}
	
	public static float[] intLin(Tup2RF v, float alpha, @ExtractionParam float[] res)
	{
		return intLin(v.v0(), v.v1(), alpha, res);
	}

	public static float[] intLin(float[] v, float alpha, @ExtractionParam float[] res)
	{
		return intLin(v[0], v[1], alpha, res);
	}
	
	public static float[] intLin(float vx, float vy, float alpha, @ExtractionParam float[] res)
	{
		res[0] = vx * alpha;
		res[1] = vy * alpha;
		
		return res;
	}
	
	public static <T extends Tup2WF> T intLin(Tup2RF v, float alpha, @ExtractionParam T res)
	{
		return intLin(v.v0(), v.v0(), alpha, res);
	}
	
	public static <T extends Tup2WF> T intLin(float[] v, float alpha, @ExtractionParam T res)
	{
		return intLin(v[0], v[1], alpha, res);
	}
	
	public static <T extends Tup2WF> T intLin(float vx, float vy, float alpha, @ExtractionParam T res)
	{
		res.set(vx * alpha, vy * alpha);
		
		return res;
	}
	
	public static float[] intVecLin(Tup2RF v1, Tup2RF v2, float alpha, @ExtractionParam float[] res)
	{
		return intVecLin(v1.v0(), v1.v1(), v2.v0(), v2.v1(), alpha, res);
	}

	public static float[] intVecLin(Tup2RF v1, float[] v2, float alpha, @ExtractionParam float[] res)
	{
		return intVecLin(v1.v0(), v1.v1(), v2[0], v2[1], alpha, res);
	}

	public static float[] intVecLin(Tup2RF v1, float v2x, float v2y, float alpha, @ExtractionParam float[] res)
	{
		return intVecLin(v1.v0(), v1.v1(), v2x, v2y, alpha, res);
	}
	
	public static float[] intVecLin(float[] v1, Tup2RF v2, float alpha, @ExtractionParam float[] res)
	{
		return intVecLin(v1[0], v1[1], v2.v0(), v2.v1(), alpha, res);
	}

	public static float[] intVecLin(float[] v1, float[] v2, float alpha, @ExtractionParam float[] res)
	{
		return intVecLin(v1[0], v1[1], v2[0], v2[1], alpha, res);
	}

	public static float[] intVecLin(float[] v1, float v2x, float v2y, float alpha, @ExtractionParam float[] res)
	{
		return intVecLin(v1[0], v1[1], v2x, v2y, alpha, res);
	}
	
	public static float[] intVecLin(float v1x, float v1y, Tup2RF v2, float alpha, @ExtractionParam float[] res)
	{
		return intVecLin(v1x, v1y, v2.v0(), v2.v1(), alpha, res);
	}

	public static float[] intVecLin(float v1x, float v1y, float[] v2, float alpha, @ExtractionParam float[] res)
	{
		return intVecLin(v1x, v1y, v2[0], v2[1], alpha, res);
	}
	
	public static float[] intVecLin(float v1x, float v1y, float v2x, float v2y, float alpha, @ExtractionParam float[] res)
	{
		res[0] = (v2x - v1x) * alpha;
		res[1] = (v2y - v1y) * alpha;
		
		return res;
	}
	
	public static <T extends Tup2WF> T intVecLin(Tup2RF v1, Tup2RF v2, float alpha, @ExtractionParam T res)
	{
		return intVecLin(v1.v0(), v1.v0(), v2.v0(), v2.v1(), alpha, res);
	}
	
	public static <T extends Tup2WF> T intVecLin(Tup2RF v1, float[] v2, float alpha, @ExtractionParam T res)
	{
		return intVecLin(v1.v0(), v1.v1(), v2[0], v2[1], alpha, res);
	}
	
	public static <T extends Tup2WF> T intVecLin(Tup2RF v1, float v2x, float v2y, float alpha, @ExtractionParam T res)
	{
		return intVecLin(v1.v0(), v1.v1(), v2x, v2y, alpha, res);
	}
	
	public static <T extends Tup2WF> T intVecLin(float[] v1, Tup2RF v2, float alpha, @ExtractionParam T res)
	{
		return intVecLin(v1[0], v1[1], v2.v0(), v2.v1(), alpha, res);
	}
	
	public static <T extends Tup2WF> T intVecLin(float[] v1, float[] v2, float alpha, @ExtractionParam T res)
	{
		return intVecLin(v1[0], v1[1], v2[0], v2[1], alpha, res);
	}
	
	public static <T extends Tup2WF> T intVecLin(float[] v1, float v2x, float v2y, float alpha, @ExtractionParam T res)
	{
		return intVecLin(v1[0], v1[1], v2x, v2y, alpha, res);
	}
	
	public static <T extends Tup2WF> T intVecLin(float v1x, float v1y, Tup2RF v2, float alpha, @ExtractionParam T res)
	{
		return intVecLin(v1x, v1y, v2.v0(), v2.v1(), alpha, res);
	}
	
	public static <T extends Tup2WF> T intVecLin(float v1x, float v1y, float[] v2, float alpha, @ExtractionParam T res)
	{
		return intVecLin(v1x, v1y, v2[0], v2[1], alpha, res);
	}
	
	public static <T extends Tup2WF> T intVecLin(float v1x, float v1y, float v2x, float v2y, float alpha, @ExtractionParam T res)
	{
		res.set((v2x - v1x) * alpha, (v2y - v1y) * alpha);
		
		return res;
	}
}
