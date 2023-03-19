package org.barghos.math.api.vector;

import org.barghos.annotation.ExtractionParam;
import org.barghos.annotation.MinLength;
import org.barghos.core.api.math.BarghosMath;
import org.barghos.core.api.math.MathProvider;
import org.barghos.tuple.api.t3.Tup3fC;
import org.barghos.tuple.api.t3.Tup3fR;
import org.barghos.tuple.api.t4.Tup4fC;
import org.barghos.tuple.api.t4.Tup4fR;

/**
 * This interface provides non invasive (readonly) functions and methods for float vectors with two dimensions.
 */
public interface QuatfR extends SimpleQuatfR
{
	/**
	 * Creates a new instance of the type of this vector.
	 * 
	 * @return A new instance.
	 */
	QuatfR createNew();
	
	/**
	 * Creates a new instance of the type of this quaternion and adopts the component values from the givewn quaternion {@code (v)}.
	 * 
	 * @param v The quaternion to adopt the component values from.
	 * 
	 * @return A new instance.
	 */
	default QuatfR createNew(Tup4fR v)
	{
		return createNew(v.getV0(), v.getV1(), v.getV2(), v.getV3());
	}
	
	/**
	 * Creates a new instance of the type of this quaternion and adopts the component values from the given quaternion {@code (v[0], v[1], v[2], v[3])}.
	 * 
	 * @param v The quaternion as an array with at least three entries to adopt the component values from.
	 * 
	 * @return A new instance.
	 */
	default QuatfR createNew(@MinLength(4) float[] v)
	{
		return createNew(v[0], v[1], v[2], v[3]);
	}
	
	/**
	 * Creates a new instance of the type of this quaternion and adopts the component values from the given quaternion {@code (x, y, z, w)}.
	 * 
	 * @param x The value of the x component.
	 * @param y The value of the y component.
	 * @param z The value of the z component.
	 * @param w The value of the w component.
	 * 
	 * @return A new instance.
	 */
	QuatfR createNew(float x, float y, float z, float w);
	
	/**
	 * Creates a new instance of the current class with the same component values.
	 * 
	 * @return A new instance.
	 */
	@Override
	QuatfR copy();
	
	/**
	 * Returns the squared length (magnitude, norm) of this quaternion.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code |Q|²}
	 * 
	 * @return The squared length of the quaternion.
	 */
	default float squaredLength()
	{
		return QuatfUtils.squaredLength(this);
	}
	
	/**
	 * Returns the length (magnitude, norm) of this quaternion.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link BarghosMath#PROVIDER} is used for
	 * calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code |Q|}
	 * 
	 * @return The length of the quaternion.
	 */
	default float length()
	{
		return QuatfUtils.length(this);
	}
	
	/**
	 * Returns the length (magnitude, norm) of this quaternion.
	 * 
	 * <p>
	 * Here the explicitly given {@link MathProvider} is used for calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code |Q|}
	 * 
	 * @param mathProvider
	 * The provider of fundamental math functions that should be used for calculation.
	 * 
	 * @return The length of the quaternion.
	 */
	default float length(MathProvider mathProvider)
	{
		return QuatfUtils.length(this, mathProvider);
	}
	
	/**
	 * Returns the inverse (reciprocal) length (magnitude, norm) of this quaternion.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link BarghosMath#PROVIDER} is used for
	 * calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code 1 / |Q|}
	 * 
	 * @return The reciprocal length of the quaternion.
	 */
	default float inverseLength()
	{
		return QuatfUtils.inverseLength(this);
	}
	
	/**
	 * Returns the inverse (reciprocal) length (magnitude, norm) of this quaternion.
	 * 
	 * <p>
	 * Here the explicitly given {@link MathProvider} is used for calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code 1 / |Q|}
	 * 
	 * @param mathProvider
	 * The provider of fundamental math functions that should be used for calculation.
	 * 
	 * @return The reciprocal length of the quaternion.
	 */
	default float inverseLength(MathProvider mathProvider)
	{
		return QuatfUtils.inverseLength(this, mathProvider);
	}
	
	/**
	 * Calculates the dot (scalar) product between this quaternion and the
	 * given quaternion {@code (q)}.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code Q . q}
	 * 
	 * @param q The quaternion.
	 * 
	 * @return The dot (scalar) product.
	 */
	default float dot(Tup4fR q)
	{
		return QuatfUtils.dot(this, q);
	}
	
	/**
	 * Calculates the dot (scalar) product between this quaternion and the
	 * given quaternion {@code (q[0], q[1], q[2], q[3])}.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code Q . (q[0], q[1], q[2], q[3])}
	 * 
	 * @param q The quaternion as an array with at least four entries.
	 * 
	 * @return The dot (scalar) product.
	 */
	default float dot(@MinLength(4) float[] q)
	{
		return QuatfUtils.dot(this, q);
	}
	
	/**
	 * Calculates the dot (scalar) product between this quaternion and the
	 * given quaternion {@code (x, y, z, w)}.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code Q . (x, y, z, w)}
	 * 
	 * @param x The value of the x component of the quaternion.
	 * @param y The value of the y component of the quaternion.
	 * @param z The value of the z component of the quaternion.
	 * @param w The value of the w component of the quaternion.
	 * 
	 * @return The dot (scalar) product.
	 */
	default float dot(float x, float y, float z, float w)
	{
		return QuatfUtils.dot(this, x, y, z, w);
	}
	
	/**
	 * Calculates the conjugate of this quaternion and saves the result in a new instance.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the quaternion.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code Q* }
	 * 
	 * @return A new instance of this vector with the result.
	 */
	default QuatfR conjugateN()
	{
		return QuatfUtils.conjugateFunc(this, (x, y, z, w) -> createNew(x, y, z, w));
	}
	
	/**
	 * Calculates the inverse of this quaternion and saves the result in a new instance.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the quaternion.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code Q* / |Q|² }
	 * 
	 * 
	 * @return A new instance of this vector with the result.
	 */
	default QuatfR inverseN()
	{
		return QuatfUtils.inverseFunc(this, (x, y, z, w) -> createNew(x, y, z, w));
	}
	
	/**
	 * Normalizes this quaternion and saves the result in a new instance.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link BarghosMath#PROVIDER} is used for
	 * calculation.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the quaternion.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code Q / |Q|}
	 * 
	 * @return A new instance of this vector with the result.
	 */
	default QuatfR normalizeN()
	{
		return QuatfUtils.normalizeFunc(this, (x, y, z, w) -> createNew(x, y, z, w));
	}
	
	/**
	 * Normalizes this quaternion and saves the result in a new instance.
	 * 
	 * <p>
	 * Here the explicitly given {@link MathProvider} is used for calculation.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the quaternion.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code Q / |Q|}
	 * 
	 * @param mathProvider
	 * The provider of fundamental math functions that should be used for calculation.
	 * 
	 * @return A new instance of this vector with the result.
	 */
	default QuatfR normalizeN(MathProvider mathProvider)
	{
		return QuatfUtils.normalizeFunc(this, mathProvider, (x, y, z, w) -> createNew(x, y, z, w));
	}
	
	/**
	 * Calculates the conjugate of this quaternion and saves the result in the given
	 * extraction parameter.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the quaternion.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code Q* }
	 * 
	 * @param res The extraction parameter for the result as an array with at least four entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	default float[] conjugateR(@ExtractionParam @MinLength(4) float[] res)
	{
		return QuatfUtils.conjugate(this, res);
	}
	
	/**
	 * Calculates the conjugate of this quaternion and saves the result in the given
	 * extraction parameter object.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the quaternion.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code Q* }
	 * 
	 * @param <T> The type of the extraction parameter object.
	 * 
	 * @param res The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	default <T extends Tup4fC> T conjugateR(@ExtractionParam T res)
	{
		return QuatfUtils.conjugate(this, res);
	}
	
	/**
	 * Calculates the inverse of this quaternion and saves the result in the given
	 * extraction parameter.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the quaternion.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code Q* / |Q|² }
	 * 
	 * @param res The extraction parameter for the result as an array with at least four entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	default float[] inverseR(@ExtractionParam @MinLength(4) float[] res)
	{
		return QuatfUtils.inverse(this, res);
	}
	
	/**
	 * Calculates the inverse of the quaternion and saves the result in the given extraction
	 * parameter object.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the quaternion.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code Q* / |Q|² }
	 * 
	 * @param <T> The type of the extraction parameter object.
	 * 
	 * @param res The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	default <T extends Tup4fC> T inverseR(@ExtractionParam T res)
	{
		return QuatfUtils.inverse(this, res);
	}
	
	/**
	 * Normalizes this quaternion and saves the result in the given extraction parameter.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link BarghosMath#PROVIDER} is used for
	 * calculation.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the quaternion.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code Q / |Q|}
	 * 
	 * @param res The extraction parameter for the result as an array with at least four entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	default float[] normalizeR(@ExtractionParam @MinLength(4) float[] res)
	{
		return QuatfUtils.normalize(this, res);
	}
	
	/**
	 * Normalizes this quaternion and saves the result in the given extraction parameter.
	 * 
	 * <p>
	 * Here the explicitly given {@link MathProvider} is used for calculation.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the quaternion.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code Q / |Q|}
	 * 
	 * @param mathProvider
	 * The provider of fundamental math functions that should be used for calculation.
	 * @param res The extraction parameter for the result as an array with at least four entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	default float[] normalizeR(MathProvider mathProvider, @ExtractionParam @MinLength(4) float[] res)
	{
		return QuatfUtils.normalize(this, mathProvider, res);
	}
	
	/**
	 * Normalizes this quaternion and saves the result in the given extraction parameter object.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link BarghosMath#PROVIDER} is used for
	 * calculation.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the quaternion.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code Q / |Q|}
	 * 
	 * @param <T> The type of the extraction parameter object.
	 * 
	 * @param res The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	default <T extends Tup4fC> T normalizeR(@ExtractionParam T res)
	{
		return QuatfUtils.normalize(this, res);
	}
	
	/**
	 * Normalizes this quaternion and saves the result in the given extraction parameter object.
	 * 
	 * <p>
	 * Here the explicitly given {@link MathProvider} is used for calculation.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the quaternion.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code Q / |Q|}
	 * 
	 * @param <T> The type of the extraction parameter object.
	 * 
	 * @param mathProvider
	 * The provider of fundamental math functions that should be used for calculation.
	 * @param res The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	default <T extends Tup4fC> T normalizeR(MathProvider mathProvider, @ExtractionParam T res)
	{
		return QuatfUtils.normalize(this, mathProvider, res);
	}
}
