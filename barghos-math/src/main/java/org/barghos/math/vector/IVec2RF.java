package org.barghos.math.vector;

import org.barghos.annotation.ExtractionParam;
import org.barghos.util.tuple.floats.ITup2RF;
import org.barghos.util.tuple.floats.ITup2WF;
import org.barghos.util.tuple.floats.ITupRF;

/**
 * This interface provides non-invasive (read only) functions and methods for float vectors with two
 * dimensions.
 */
public interface IVec2RF extends ITup2RF
{	
	/** {@inheritDoc} */
	@Override
	IVec2RF createNew(ITup2RF t);
	
	/** {@inheritDoc} */
	@Override
	IVec2RF createNew(ITupRF t);
	
	/** {@inheritDoc} */
	@Override
	IVec2RF createNew(float[] t);
	
	/** {@inheritDoc} */
	@Override
	IVec2RF createNew(float value);
	
	/** {@inheritDoc} */
	@Override
	IVec2RF createNew(float x, float y);
	
	/** {@inheritDoc} */
	@Override
	IVec2RF copy();
	
	/**
	 * Returns the x component of the vector.
	 * 
	 * @return The x component.
	 */
	float x();
	
	/**
	 * Returns the y component of the vector.
	 * 
	 * @return The y component.
	 */
	float y();
	
	/**
	 * Returns the length (magnitude, norm) of this vector.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link BarghosMath#PROVIDER} is used for
	 * calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code |v|}
	 * 
	 * @return The length of this vector.
	 */
	float len();
	
	/**
	 * Returns the length (magnitude, norm) of this vector.
	 * 
	 * <p>
	 * If all the component values are within the given inclusive margin around zero defined by
	 * {@code tolerance}, the length will be zero. This allows to account for floating point
	 * precision errors.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link BarghosMath#PROVIDER} is used for
	 * calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code |v|}
	 * 
	 * @param tolerance
	 *     The inclusive margin around zero to still count as zero.
	 * 
	 * @return The length of this vector.
	 * 
	 * @throws IllegalArgumentException
	 *     If the given {@code tolerance} is below zero.
	 */
	float len(float tolerance);
	
	/**
	 * Returns the inverse (reciprocal) length (magnitude, norm) of this vector. If the length of
	 * this vector is zero, an {@link ArithmeticException} is thrown.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link BarghosMath#PROVIDER} is used for
	 * calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code 1 / |v|}
	 * 
	 * @return The inverse length of this vector.
	 * 
	 * @throws ArithmeticException
	 *     If the vector has a length of zero.
	 */
	float recLen();
	
	/**
	 * Returns the distance between the endpoint of this vector and the endpoint of the given vector
	 * {@code (v2)}.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link BarghosMath#PROVIDER} is used for
	 * calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code |v2 - v|}
	 * 
	 * @param v2
	 *     The second vector.
	 * 
	 * @return The distance between the endpoint of this vector and the endpoint of the given
	 * vector.
	 */
	float lenTo(ITup2RF t);
	
	float lenTo(ITupRF t);
	
	/**
	 * Returns the distance between the endpoint of this vector and the endpoint of the given vector
	 * {@code (v2)}.
	 * 
	 * <p>
	 * If the distance is less or equal to the given inclusive {@code tolerance} the distance will
	 * be zero. This allows to account for floating point precision errors.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link BarghosMath#PROVIDER} is used for
	 * calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code |v2 - v|}
	 * 
	 * @param v2
	 *     The second vector.
	 * @param tolerance
	 *     The inclusive margin around zero to still count as zero.
	 * 
	 * @return The distance between the endpoint of this vector and the endpoint of the given
	 * vector.
	 * 
	 * @throws IllegalArgumentException
	 *     If the given {@code tolerance} is below zero.
	 */
	float lenTo(float tolerance, ITup2RF t);
	
	float lenTo(float tolerance, ITupRF t);
	
	/**
	 * Returns the distance between the endpoint of this vector and the endpoint of the given vector
	 * {@code (v2[0], v2[1])}.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link BarghosMath#PROVIDER} is used for
	 * calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code |(v2[0], v2[1]) - v|}
	 * 
	 * @param v2
	 *     The second vector as an array with at least two entries.
	 * 
	 * @return The distance between the endpoint of this vector and the endpoint of the given
	 * vector.
	 */
	float lenTo(float[] t);
	
	/**
	 * Returns the distance between the endpoint of this vector and the endpoint of the given vector
	 * {@code (v2[0], v2[1])}.
	 * 
	 * <p>
	 * If the distance is less or equal to the given inclusive {@code tolerance} the distance will
	 * be zero. This allows to account for floating point precision errors.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link BarghosMath#PROVIDER} is used for
	 * calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code |(v2[0], v2[1]) - v|}
	 * 
	 * @param v2
	 *     The second vector as an array with at least two entries.
	 * @param tolerance
	 *     The inclusive margin around zero to still count as zero.
	 * 
	 * @return The distance between the endpoint of this vector and the endpoint of the given
	 * vector.
	 * 
	 * @throws IllegalArgumentException
	 *     If the given {@code tolerance} is below zero.
	 */
	float lenTo(float tolerance, float[] t);
	
	/**
	 * Returns the distance between the endpoint of this vector and the endpoint of the given vector
	 * {@code (v2x, v2y)}.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link BarghosMath#PROVIDER} is used for
	 * calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code |(v2x, v2y) - v|}
	 * 
	 * @param v2x
	 *     The value of the x component of the second vector.
	 * @param v2y
	 *     The value of the y component of the second vector.
	 * 
	 * @return The distance between the endpoint of this vector and the endpoint of the given
	 * vector.
	 */
	float lenTo(float tx, float ty);
	
	/**
	 * Returns the distance between the endpoint of this vector and the endpoint of the given vector
	 * {@code (v2x, v2y)}.
	 * 
	 * <p>
	 * If the distance is less or equal to the given inclusive {@code tolerance} the distance will
	 * be zero. This allows to account for floating point precision errors.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link BarghosMath#PROVIDER} is used for
	 * calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code |(v2x, v2y) - v|}
	 * 
	 * @param v2x
	 *     The value of the x component of the second vector.
	 * @param v2y
	 *     The value of the y component of the second vector.
	 * @param tolerance
	 *     The inclusive margin around zero to still count as zero.
	 * 
	 * @return The distance between the endpoint of this vector and the endpoint of the given
	 * vector.
	 * 
	 * @throws IllegalArgumentException
	 *     If the given {@code tolerance} is below zero.
	 */
	float lenTo(float tolerance, float tx, float ty);
	
	/**
	 * Returns the inverse (reciprocal) distance between the endpoint of this vector and the
	 * endpoint of the given vector {@code (v2)}. If the distance is zero an
	 * {@link ArithmeticException} is thrown.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link BarghosMath#PROVIDER} is used for
	 * calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code 1 / |v2 - v|}
	 * 
	 * @param v2
	 *     The second vector.
	 * 
	 * @return The inverse distance between the endpoint of this vector and the endpoint of the
	 * given vector.
	 * 
	 * @throws ArithmeticException
	 *     If the distance between the endpoints is zero.
	 */
	float recLenTo(ITup2RF t);
	
	float recLenTo(ITupRF t);
	
	/**
	 * Returns the inverse (reciprocal) distance between the endpoint of this vector and the
	 * endpoint of the given vector {@code (v2[0], v2[1])}. If the distance is zero an
	 * {@link ArithmeticException} is thrown.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link BarghosMath#PROVIDER} is used for
	 * calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code 1 / |(v2[0], v2[1]) - v|}
	 * 
	 * @param v2
	 *     The second vector as an array with at least two entries.
	 * 
	 * @return The inverse distance between the endpoint of this vector and the endpoint of the
	 * given vector.
	 * 
	 * @throws ArithmeticException
	 *     If the distance between the endpoints is zero.
	 */
	float recLenTo(float[] t);
	
	/**
	 * Returns the inverse (reciprocal) distance between the endpoint of this vector and the
	 * endpoint of the given vector {@code (v2x, v2y)}. If the distance is zero an
	 * {@link ArithmeticException} is thrown.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link BarghosMath#PROVIDER} is used for
	 * calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code 1 / |(v2x, v2y) - v|}
	 * 
	 * @param v2x
	 *     The value of the x component of the second vector.
	 * @param v2y
	 *     The value of the y component of the second vector.
	 * 
	 * @return The inverse distance between the endpoint of this vector and the endpoint of the
	 * given vector.
	 * 
	 * @throws ArithmeticException
	 *     If the distance between the endpoints is zero.
	 */
	float recLenTo(float tx, float ty);
	
	/**
	 * Returns the squared length (magnitude, norm) of this vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code |v|^2}
	 * 
	 * @return The squared length of this vector.
	 */
	float sqrLen();
	
	/**
	 * Returns the squared distance between the endpoint of this vector and the endpoint of the
	 * given vector {@code (v2)}.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code |v2 - v|^2}
	 * 
	 * @param v2
	 *     The second vector.
	 * 
	 * @return The squared distance between the endpoint of this vector and the endpoint of the
	 * given vector.
	 */
	float sqrLenTo(ITup2RF t);
	
	float sqrLenTo(ITupRF t);
	
	/**
	 * Returns the squared distance between the endpoint of this vector and the endpoint of the
	 * given vector {@code (v2[0], v2[1])}.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code |(v2[0], v2[1]) - v|^2}
	 * 
	 * @param v2
	 *     The second vector as an array with at least two entries.
	 * 
	 * @return The squared distance between the endpoint of this vector and the endpoint of the
	 * given vector.
	 */
	float sqrLenTo(float[] t);
	
	/**
	 * Returns the squared distance between the endpoint of this vector and the endpoint of the
	 * given vector {@code (v2x, v2y)}.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code |(v2x, v2y) - v|^2}
	 * 
	 * @param v2x
	 *     The value of the x component of the second vector.
	 * @param v2y
	 *     The value of the y component of the second vector.
	 * 
	 * @return The squared distance between the endpoint of this vector and the endpoint of the
	 * given vector.
	 */
	float sqrLenTo(float tx, float ty);
	
	/**
	 * Returns the dot product (scalar product) between this vector and the given vector
	 * {@code (v2)}.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v . v2}
	 * 
	 * @param v2
	 *     The second vector.
	 * 
	 * @return The dot product.
	 */
	float dot(ITup2RF t);
	
	float dot(ITupRF t);
	
	/**
	 * Returns the dot product (scalar product) between this vector and the given vector
	 * {@code (v2[0], v2[1])}.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v . (v2[0], v2[1])}
	 * 
	 * @param v2
	 *     The second vector as an array with at least two entries.
	 * 
	 * @return The dot product.
	 */
	float dot(float[] t);
	
	/**
	 * Returns the dot product (scalar product) between this vector and the given vector
	 * {@code (v2x, v2y)}.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v . (v2x, v2y)}
	 * 
	 * @param v2x
	 *     The value of the x component of the second vector.
	 * @param v2y
	 *     The value of the y component of the second vector.
	 * 
	 * @return The dot product.
	 */
	float dot(float tx, float ty);
	
	/**
	 * Adds the given vector {@code (v2)} to this vector and saves the result in a new instance.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v + v2}
	 * 
	 * @param v2
	 *     The vector to add to this vector.
	 * 
	 * @return A new instance of this vector with the result.
	 */
	IVec2RF addN(ITup2RF t);
	
	IVec2RF addN(ITupRF t);
	
	/**
	 * Adds the given vector {@code (v2[0], v2[1])} to this vector and saves the result in a new
	 * instance.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v + (v2[0], v2[1])}
	 * 
	 * @param v2
	 *     The vector to add to this vector as an array with at least two entries.
	 * 
	 * @return A new instance of this vector with the result.
	 */
	IVec2RF addN(float[] t);
	
	/**
	 * Adds the given value {@code (value)} to every component of this vector and saves the result
	 * in a new instance.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v + (value, value)}
	 * 
	 * @param value
	 *     The value to add to this vector.
	 * 
	 * @return A new instance of this vector with the result.
	 */
	IVec2RF addN(float value);
	
	/**
	 * Adds the given vector {@code (v2x, v2y)} to this vector and saves the result in a new
	 * instance.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v + (v2x, v2y)}
	 * 
	 * @param v2x
	 *     The value of the x component to add to this vector.
	 * @param v2y
	 *     The value of the y component to add to this vector.
	 * 
	 * @return A new instance of this vector with the result.
	 */
	IVec2RF addN(float tx, float ty);
	
	/**
	 * Adds the given vector {@code (v2)} to this vector and saves the result in the extraction
	 * parameter {@code res}.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v + v2}
	 * 
	 * @param v2
	 *     The vector to add to this vector.
	 * @param res
	 *     The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	float[] addT(ITup2RF t, @ExtractionParam float[] res);
	
	float[] addT(ITupRF t, @ExtractionParam float[] res);
	
	/**
	 * Adds the given vector {@code (v2[0], v2[1])} to this vector and saves the result in the
	 * extraction parameter {@code res}.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * <p>
	 * It is safe to use the given vector {@code v2} as the extraction parameter.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v + (v2[0], v2[1])}
	 * 
	 * @param v2
	 *     The vector to add to this vector as an array with at least two entries.
	 * @param res
	 *     The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	float[] addT(float[] t, @ExtractionParam float[] res);
	
	/**
	 * Adds the given value {@code (value)} to every component of this vector and saves the result
	 * in the extraction parameter {@code res}.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v + (value, value)}
	 * 
	 * @param value
	 *     The value to add to this vector.
	 * @param res
	 *     The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	float[] addT(float value, @ExtractionParam float[] res);
	
	/**
	 * Adds the given vector {@code (v2x, v2y)} to this vector and saves the result in the
	 * extraction parameter {@code res}.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v + (v2x, v2y)}
	 * 
	 * @param v2x
	 *     The value of the x component to add to this vector.
	 * @param v2y
	 *     The value of the y component to add to this vector.
	 * @param res
	 *     The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	float[] addT(float tx, float ty, @ExtractionParam float[] res);
	
	/**
	 * Adds the given vector {@code (v2)} to this vector and saves the result in the extraction
	 * parameter {@code res}.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * <p>
	 * It is safe to use this vector or the given vector {@code v2} as the extraction parameter.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v + v2}
	 * 
	 * @param <T>
	 *     The type of the extraction parameter.
	 * 
	 * @param v2
	 *     The vector to add to this vector.
	 * @param res
	 *     The extraction parameter for the result.
	 * 
	 * @return The extraction parameter with the result.
	 */
	<T extends ITup2WF> T addT(ITup2RF t, @ExtractionParam T res);
	
	<T extends ITup2WF> T addT(ITupRF t, @ExtractionParam T res);
	
	/**
	 * Adds the given vector {@code (v2[0], v2[1])} to this vector and saves the result in the
	 * extraction parameter {@code res}.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * <p>
	 * It is safe to use this vector as the extraction parameter.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v + (v2[0], v2[1])}
	 * 
	 * @param <T>
	 *     The type of the extraction parameter.
	 * 
	 * @param v2
	 *     The vector to add to this vector as an array with at least two entries.
	 * @param res
	 *     The extraction parameter for the result.
	 * 
	 * @return The extraction parameter with the result.
	 */
	<T extends ITup2WF> T addT(float[] t, @ExtractionParam T res);
	
	/**
	 * Adds the given value {@code (value)} to every component of this vector and saves the result
	 * in the extraction parameter {@code res}.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * <p>
	 * It is safe to use this vector as the extraction parameter.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v + (value, value)}
	 * 
	 * @param <T>
	 *     The type of the extraction parameter.
	 * 
	 * @param value
	 *     The value to add to this vector.
	 * @param res
	 *     The extraction parameter for the result.
	 * 
	 * @return The extraction parameter with the result.
	 */
	<T extends ITup2WF> T addT(float value, @ExtractionParam T res);
	
	/**
	 * Adds the given vector {@code (v2x, v2y)} to this vector and saves the result in the
	 * extraction parameter {@code res}.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * <p>
	 * It is safe to use this vector as the extraction parameter.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v + (v2x, v2y)}
	 * 
	 * @param <T>
	 *     The type of the extraction parameter.
	 * 
	 * @param v2x
	 *     The value of the x component to add to this vector.
	 * @param v2y
	 *     The value of the y component to add to this vector.
	 * @param res
	 *     The extraction parameter for the result.
	 * 
	 * @return The extraction parameter with the result.
	 */
	<T extends ITup2WF> T addT(float tx, float ty, @ExtractionParam T res);
	
	/**
	 * Subtracts the given vector {@code (v2)} from this vector and saves the result in a new
	 * instance.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v - v2}
	 * 
	 * @param v2
	 *     The vector to subtract from this vector.
	 * 
	 * @return A new instance of this vector with the result.
	 */
	IVec2RF subN(ITup2RF t);
	
	IVec2RF subN(ITupRF t);
	
	/**
	 * Subtracts the given vector {@code (v2[0], v2[1])} from this vector and saves the result in a
	 * new instance.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v - (v2[0], v2[1])}
	 * 
	 * @param v2
	 *     The vector to subtract from this vector as an array with at least two entries.
	 * 
	 * @return A new instance of this vector with the result.
	 */
	IVec2RF subN(float[] t);
	
	/**
	 * Subtracts the given value {@code (value)} from every component of this vector and saves the
	 * result in a new instance.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v - (value, value)}
	 * 
	 * @param value
	 *     The value to subtract from this vector.
	 * 
	 * @return A new instance of this vector with the result.
	 */
	IVec2RF subN(float value);
	
	/**
	 * Subtracts the given vector {@code (v2x, v2y)} from this vector and saves the result in a new
	 * instance.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v - (v2x, v2y)}
	 * 
	 * @param v2x
	 *     The value of the x component to subtract from this vector.
	 * @param v2y
	 *     The value of the y component to subtract from this vector.
	 * 
	 * @return A new instance of this vector with the result.
	 */
	IVec2RF subN(float tx, float ty);
	
	/**
	 * Subtracts the given vector {@code (v2)} from this vector and saves the result in the
	 * extraction parameter {@code res}.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v - v2}
	 * 
	 * @param v2
	 *     The vector to subtract from this vector.
	 * @param res
	 *     The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	float[] subT(ITup2RF t, @ExtractionParam float[] res);
	
	float[] subT(ITupRF t, @ExtractionParam float[] res);
	
	/**
	 * Subtracts the given vector {@code (v2[0], v2[1])} from this vector and saves the result in
	 * the extraction parameter {@code res}.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * <p>
	 * It is safe to use the given vector {@code v2} as the extraction parameter.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v - (v2[0], v2[1])}
	 * 
	 * 
	 * @param v2
	 *     The vector to subtract from this vector as an array with at least two entries.
	 * @param res
	 *     The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	float[] subT(float[] t, @ExtractionParam float[] res);
	
	/**
	 * Subtracts the given value {@code (value)} from every component of this vector and saves the
	 * result in the extraction parameter {@code res}.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v - (value, value)}
	 * 
	 * @param value
	 *     The value to subtract from this vector.
	 * @param res
	 *     The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	float[] subT(float value, @ExtractionParam float[] res);
	
	/**
	 * Subtracts the given vector {@code (v2x, v2y)} from this vector and saves the result in the
	 * extraction parameter {@code res}.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v - (v2x, v2y)}
	 * 
	 * 
	 * @param v2x
	 *     The value of the x component to subtract from this vector.
	 * @param v2y
	 *     The value of the y component to subtract from this vector.
	 * @param res
	 *     The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	float[] subT(float tx, float ty, @ExtractionParam float[] res);
	
	/**
	 * Subtracts the given vector {@code (v2)} from this vector and saves the result in the
	 * extraction parameter {@code res}.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * <p>
	 * It is safe to use this vector or the given vector {@code v2} as the extraction parameter.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v - v2}
	 * 
	 * @param <T>
	 *     The type of the extraction parameter.
	 * 
	 * @param v2
	 *     The vector to subtract from this vector.
	 * @param res
	 *     The extraction parameter for the result.
	 * 
	 * @return The extraction parameter with the result.
	 */
	<T extends ITup2WF> T subT(ITup2RF t, @ExtractionParam T res);
	
	<T extends ITup2WF> T subT(ITupRF t, @ExtractionParam T res);
	
	/**
	 * Subtracts the given vector {@code (v2[0], v2[1])} from this vector and saves the result in
	 * the extraction parameter {@code res}.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * <p>
	 * It is safe to use this vector as the extraction parameter.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v - (v2[0], v2[1])}
	 * 
	 * @param <T>
	 *     The type of the extraction parameter.
	 * 
	 * @param v2
	 *     The vector to subtract from this vector as an array with at least two entries.
	 * @param res
	 *     The extraction parameter for the result.
	 * 
	 * @return The extraction parameter with the result.
	 */
	<T extends ITup2WF> T subT(float[] t, @ExtractionParam T res);
	
	/**
	 * Subtracts the given value {@code (value)} from every component of this vector and saves the
	 * result in the extraction parameter {@code res}.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * <p>
	 * It is safe to use this vector as the extraction parameter.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v - (value, value)}
	 * 
	 * @param <T>
	 *     The type of the extraction parameter.
	 * 
	 * @param value
	 *     The value to subtract from this vector.
	 * @param res
	 *     The extraction parameter for the result.
	 * 
	 * @return The extraction parameter with the result.
	 */
	<T extends ITup2WF> T subT(float value, @ExtractionParam T res);
	
	/**
	 * Subtracts the given vector {@code (v2x, v2y)} from this vector and saves the result in the
	 * extraction parameter {@code res}.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * <p>
	 * It is safe to use this vector as the extraction parameter.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v - (v2x, v2y)}
	 * 
	 * @param <T>
	 *     The type of the extraction parameter.
	 * 
	 * @param v2x
	 *     The value of the x component to subtract from this vector.
	 * @param v2y
	 *     The value of the y component to subtract from this vector.
	 * @param res
	 *     The extraction parameter for the result.
	 * 
	 * @return The extraction parameter with the result.
	 */
	<T extends ITup2WF> T subT(float tx, float ty, @ExtractionParam T res);
	
	/**
	 * Subtracts this vector from the given vector {@code (v2)} and saves the result in a new
	 * instance.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v2 - v}
	 * 
	 * @param v2
	 *     The vector this vector is subtracted from.
	 * 
	 * @return A new instance of this vector with the result.
	 */
	IVec2RF rSubN(ITup2RF t);
	
	IVec2RF rSubN(ITupRF t);
	
	/**
	 * Subtracts this vector from the given vector {@code (v2[0], v2[1])} and saves the result in a
	 * new instance.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v2[0], v2[1]) - v}
	 * 
	 * @param v2
	 *     The vector this vector is subtracted from as an array with at least two entries.
	 * 
	 * @return A new instance of this vector with the result.
	 */
	IVec2RF rSubN(float[] t);
	
	/**
	 * Subtracts every component of this vector from the given value {@code (value)} and saves the
	 * result in a new instance.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (value, value) - v}
	 * 
	 * @param value
	 *     The value this vector is subtracted from.
	 * 
	 * @return A new instance of this vector with the result.
	 */
	IVec2RF rSubN(float value);
	
	/**
	 * Subtracts this vector from the given vector {@code (v2x, v2y)} and saves the result in a new
	 * instance.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v2x, v2y) - v}
	 * 
	 * @param v2x
	 *     The value of the x component this vector is subtracted from.
	 * @param v2y
	 *     The value of the y component this vector is subtracted from.
	 * 
	 * @return A new instance of this vector with the result.
	 */
	IVec2RF rSubN(float tx, float ty);
	
	/**
	 * Subtracts this vector from the given vector {@code (v2)} and saves the result in the
	 * extraction parameter {@code res}.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v2 - v}
	 * 
	 * @param v2
	 *     The vector this vector is subtracted from.
	 * @param res
	 *     The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	float[] rSubT(ITup2RF t, @ExtractionParam float[] res);
	
	float[] rSubT(ITupRF t, @ExtractionParam float[] res);
	
	/**
	 * Subtracts this vector from the given vector {@code (v2[0], v2[1])} and saves the result in
	 * the extraction parameter {@code res}.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * <p>
	 * It is safe to use the given vector {@code v2} as the extraction parameter.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v2[0], v2[1]) - v}
	 * 
	 * @param v2
	 *     The vector this vector is subtracted from as an array with at least two entries.
	 * @param res
	 *     The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	float[] rSubT(float[] t, @ExtractionParam float[] res);

	/**
	 * Subtracts every component of this vector from the given value {@code (value)} and saves the
	 * result in the extraction parameter {@code res}.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (value, value) - v}
	 * 
	 * @param value
	 *     The value this vector is subtracted from.
	 * @param res
	 *     The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	float[] rSubT(float value, @ExtractionParam float[] res);

	/**
	 * Subtracts this vector from the given vector {@code (v2x, v2y)} and saves the result in the
	 * extraction parameter {@code res}.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v2x, v2y) - v}
	 * 
	 * @param v2x
	 *     The value of the x component this vector is subtracted from.
	 * @param v2y
	 *     The value of the y component this vector is subtracted from.
	 * @param res
	 *     The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	float[] rSubT(float tx, float ty, @ExtractionParam float[] res);
	
	/**
	 * Subtracts this vector from the given vector {@code (v2)} and saves the result in the
	 * extraction parameter {@code res}.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * <p>
	 * It is safe to use this vector or the given vector {@code v2} as the extraction parameter.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v2 - v}
	 * 
	 * @param <T>
	 *     The type of the extraction parameter.
	 * 
	 * @param v2
	 *     The vector this vector is subtracted from.
	 * @param res
	 *     The extraction parameter for the result.
	 * 
	 * @return The extraction parameter with the result.
	 */
	<T extends ITup2WF> T rSubT(ITup2RF t, @ExtractionParam T res);
	
	<T extends ITup2WF> T rSubT(ITupRF t, @ExtractionParam T res);
	
	/**
	 * Subtracts this vector from the given vector {@code (v2[0], v2[1])} and saves the result in
	 * the extraction parameter {@code res}.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * <p>
	 * It is safe to use this vector or the given vector {@code v2} as the extraction parameter.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v2[0], v2[1]) - v}
	 * 
	 * @param <T>
	 *     The type of the extraction parameter.
	 * 
	 * @param v2
	 *     The vector this vector is subtracted from as an array with at least two entries.
	 * @param res
	 *     The extraction parameter for the result.
	 * 
	 * @return The extraction parameter with the result.
	 */
	<T extends ITup2WF> T rSubT(float[] t, @ExtractionParam T res);
	
	/**
	 * Subtracts every component of this vector from the given value {@code (value)} and saves the
	 * result in the extraction parameter {@code res}.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * <p>
	 * It is safe to use this vector as the extraction parameter.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (value, value) - v}
	 * 
	 * @param <T>
	 *     The type of the extraction parameter.
	 * 
	 * @param value
	 *     The value this vector is subtracted from.
	 * @param res
	 *     The extraction parameter for the result.
	 * 
	 * @return The extraction parameter with the result.
	 */
	<T extends ITup2WF> T rSubT(float value, @ExtractionParam T res);
	
	/**
	 * Subtracts this vector from the given vector {@code (v2x, v2y)} and saves the result in the
	 * extraction parameter {@code res}.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v2x, v2y) - v}
	 * 
	 * @param v2x
	 *     The value of the x component this vector is subtracted from.
	 * @param v2y
	 *     The value of the y component this vector is subtracted from.
	 * @param res
	 *     The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	<T extends ITup2WF> T rSubT(float tx, float ty, @ExtractionParam T res);
	
	/**
	 * Multiplies this vector with the given vector {@code (v2)} and saves the result in a new
	 * instance.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v * v2}
	 * 
	 * @param v2
	 *     The vector to multiply this vector with.
	 * 
	 * @return A new instance of this vector with the result.
	 */
	IVec2RF mulN(ITup2RF t);
	
	IVec2RF mulN(ITupRF t);
	
	/**
	 * Multiplies this vector with the given vector {@code (v2[0], v2[1])} and saves the result in a
	 * new instance.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v * (v2[0], v2[1])}
	 * 
	 * @param v2
	 *     The vector to multiply this vector with as an array with at least two entries.
	 * 
	 * @return A new instance of this vector with the result.
	 */
	IVec2RF mulN(float[] t);
	
	/**
	 * Multiplies every component of this vector with the given value {@code (value)} and saves the
	 * result in a new instance.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v * (value, value)}
	 * 
	 * @param value
	 *     The value to multiply this vector with.
	 * 
	 * @return A new instance of this vector with the result.
	 */
	IVec2RF mulN(float value);
	
	/**
	 * Multiplies this vector with the given vector {@code (v2x, v2y)} and saves the result in a new
	 * instance.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v * (v2x, v2y)}
	 * 
	 * @param v2x
	 *     The value of the x component to multiply this vector with.
	 * @param v2y
	 *     The value of the y component to multiply this vector with.
	 * 
	 * @return A new instance of this vector with the result.
	 */
	IVec2RF mulN(float tx, float ty);
	
	/**
	 * Multiplies this vector with the given vector {@code (v2)} and saves the result in the
	 * extraction parameter {@code res}.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v * v2}
	 * 
	 * @param v2
	 *     The vector to multiply this vector with.
	 * @param res
	 *     The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	float[] mulT(ITup2RF t, @ExtractionParam float[] res);
	
	float[] mulT(ITupRF t, @ExtractionParam float[] res);
	
	/**
	 * Multiplies this vector with the given vector {@code (v2[0], v2[1])} and saves the result in
	 * the extraction parameter {@code res}.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * <p>
	 * It is safe to use the given vector {@code v2} as the extraction parameter.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v * (v2[0], v2[1])}
	 * 
	 * @param v2
	 *     The vector to multiply this vector with as an array with at least two entries.
	 * @param res
	 *     The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	float[] mulT(float[] t, @ExtractionParam float[] res);
	
	/**
	 * Multiplies every component of this vector with the given value {@code (value)} and saves the
	 * result in the extraction parameter {@code res}.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v * (value, value)}
	 * 
	 * @param value
	 *     The value to multiply this vector with.
	 * @param res
	 *     The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	float[] mulT(float value, @ExtractionParam float[] res);
	
	/**
	 * Multiplies this vector with the given vector {@code (v2x, v2y)} and saves the result in the
	 * extraction parameter {@code res}.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v * (v2x, v2y)}
	 * 
	 * @param v2x
	 *     The value of the x component to multiply this vector with.
	 * @param v2y
	 *     The value of the y component to multiply this vector with.
	 * @param res
	 *     The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	float[] mulT(float tx, float ty, @ExtractionParam float[] res);
	
	/**
	 * Multiplies this vector with the given vector {@code (v2)} and saves the result in the
	 * extraction parameter {@code res}.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * <p>
	 * It is safe to use this vector or the given vector {@code v2} as the extraction parameter.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v * v2}
	 * 
	 * @param <T>
	 *     The type of the extraction parameter.
	 * 
	 * @param v2
	 *     The vector to multiply this vector with.
	 * @param res
	 *     The extraction parameter for the result.
	 * 
	 * @return The extraction parameter with the result.
	 */
	<T extends ITup2WF> T mulT(ITup2RF t, @ExtractionParam T res);
	
	<T extends ITup2WF> T mulT(ITupRF t, @ExtractionParam T res);
	
	/**
	 * Multiplies this vector with the given vector {@code (v2[0], v2[1])} and saves the result in
	 * the extraction parameter {@code res}.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * <p>
	 * It is safe to use this vector as the extraction parameter.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v * (v2[0], v2[1])}
	 * 
	 * @param <T>
	 *     The type of the extraction parameter.
	 * 
	 * @param v2
	 *     The vector to multiply this vector with as an array with at least two entries.
	 * @param res
	 *     The extraction parameter for the result.
	 * 
	 * @return The extraction parameter with the result.
	 */
	<T extends ITup2WF> T mulT(float[] t, @ExtractionParam T res);
	
	/**
	 * Multiplies every component of this vector with the given value {@code (value)} and saves the
	 * result in the extraction parameter {@code res}.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * <p>
	 * It is safe to use this vector as the extraction parameter.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v * (value, value)}
	 * 
	 * @param <T>
	 *     The type of the extraction parameter.
	 * 
	 * @param value
	 *     The value to multiply this vector with.
	 * @param res
	 *     The extraction parameter for the result.
	 * 
	 * @return The extraction parameter with the result.
	 */
	<T extends ITup2WF> T mulT(float value, @ExtractionParam T res);
	
	/**
	 * Multiplies this vector with the given vector {@code (v2x, v2y)} and saves the result in the
	 * extraction parameter {@code res}.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * <p>
	 * It is safe to use this vector as the extraction parameter.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v * (v2x, v2y)}
	 * 
	 * @param <T>
	 *     The type of the extraction parameter.
	 * 
	 * @param v2x
	 *     The value of the x component to multiply this vector with.
	 * @param v2y
	 *     The value of the y component to multiply this vector with.
	 * @param res
	 *     The extraction parameter for the result.
	 * 
	 * @return The extraction parameter with the result.
	 */
	<T extends ITup2WF> T mulT(float tx, float ty, @ExtractionParam T res);
	
	/**
	 * Divides this vector by the given vector {@code (v2)} and saves the result in a new instance.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v / v2}
	 * 
	 * @param v2
	 *     The vector to divide this vector by.
	 * 
	 * @return A new instance of this vector with the result.
	 */
	IVec2RF divN(ITup2RF t);
	
	IVec2RF divN(ITupRF t);
	
	/**
	 * Divides this vector by the given vector {@code (v2[0], v2[1])} and saves the result in a new
	 * instance.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v / (v2[0], v2[1])}
	 * 
	 * @param v2
	 *     The vector to divide this vector by as an array with at least two entries.
	 * 
	 * @return A new instance of this vector with the result.
	 */
	IVec2RF divN(float[] t);
	
	/**
	 * Divides each component of this vector by the given value {@code (value)} and saves the result
	 * in a new instance.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v / (value, value)}
	 * 
	 * @param value
	 *     The value to divide this vector by.
	 * 
	 * @return A new instance of this vector with the result.
	 */
	IVec2RF divN(float value);
	
	/**
	 * Divides this vector by the given vector {@code (v2x, v2y)} and saves the result in a new
	 * instance.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v / (v2x, v2y)}
	 * 
	 * @param v2x
	 *     The value of the x component to divide this vector by.
	 * @param v2y
	 *     The value of the y component to divide this vector by.
	 * 
	 * @return A new instance of this vector with the result.
	 */
	IVec2RF divN(float tx, float ty);
	
	/**
	 * Divides this vector by the given vector {@code (v2)} and saves the result in the extraction
	 * parameter {@code res}.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v / v2}
	 * 
	 * @param v2
	 *     The vector to divide this vector by.
	 * @param res
	 *     The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	float[] divT(ITup2RF t, @ExtractionParam float[] res);
	
	float[] divT(ITupRF t, @ExtractionParam float[] res);
	
	/**
	 * Divides this vector by the given vector {@code (v2[0], v2[1])} and saves the result in the
	 * extraction parameter {@code res}.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * <p>
	 * It is safe to use the given vector {@code v2} as the extraction parameter.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v / (v2[0], v2[1])}
	 * 
	 * @param v2
	 *     The vector to divide this vector by as an array with at least two entries.
	 * @param res
	 *     The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	float[] divT(float[] t, @ExtractionParam float[] res);
	
	/**
	 * Divides each component of this vector by the given value {@code (value)} and saves the result
	 * in the extraction parameter {@code res}.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v / (value, value)}
	 * 
	 * @param value
	 *     The value to divide this vector by.
	 * @param res
	 *     The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	float[] divT(float value, @ExtractionParam float[] res);
	
	/**
	 * Divides this vector by the given vector {@code (v2x, v2y)} and saves the result in the
	 * extraction parameter {@code res}.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v / (v2x, v2y)}
	 * 
	 * @param v2x
	 *     The value of the x component to divide this vector by.
	 * @param v2y
	 *     The value of the y component to divide this vector by.
	 * @param res
	 *     The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	float[] divT(float tx, float ty, @ExtractionParam float[] res);
	
	/**
	 * Divides this vector by the given vector {@code (v2)} and saves the result in the extraction
	 * parameter {@code res}.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * <p>
	 * It is safe to use this vector or the given vector {@code v2} as the extraction parameter.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v / v2}
	 * 
	 * @param <T>
	 *     The type of the extraction parameter.
	 * 
	 * @param v2
	 *     The vector to divide this vector by.
	 * @param res
	 *     The extraction parameter for the result.
	 * 
	 * @return The extraction parameter with the result.
	 */
	<T extends ITup2WF> T divT(ITup2RF t, @ExtractionParam T res);
	
	<T extends ITup2WF> T divT(ITupRF t, @ExtractionParam T res);
	
	/**
	 * Divides this vector by the given vector {@code (v2[0], v2[1])} and saves the result in the
	 * extraction parameter {@code res}.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * <p>
	 * It is safe to use this vector as the extraction parameter.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v / (v2[0], v2[1])}
	 * 
	 * @param <T>
	 *     The type of the extraction parameter.
	 * 
	 * @param v2
	 *     The vector to divide this vector by as an array with at least two entries.
	 * @param res
	 *     The extraction parameter for the result.
	 * 
	 * @return The extraction parameter with the result.
	 */
	<T extends ITup2WF> T divT(float[] t, @ExtractionParam T res);
	
	/**
	 * Divides each component of this vector by the given value {@code (value)} and saves the result
	 * in the extraction parameter {@code res}.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * <p>
	 * It is safe to use this vector as the extraction parameter.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v / (value, value)}
	 * 
	 * @param <T>
	 *     The type of the extraction parameter.
	 * 
	 * @param value
	 *     The value to divide this vector by.
	 * @param res
	 *     The extraction parameter for the result.
	 * 
	 * @return The extraction parameter with the result.
	 */
	<T extends ITup2WF> T divT(float value, @ExtractionParam T res);
	
	/**
	 * Divides this vector by the given vector {@code (v2x, v2y)} and saves the result in the
	 * extraction parameter {@code res}.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * <p>
	 * It is safe to use this vector as the extraction parameter.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v / (v2x, v2y)}
	 * 
	 * @param <T>
	 *     The type of the extraction parameter.
	 * 
	 * @param v2x
	 *     The value of the x component to divide this vector by.
	 * @param v2y
	 *     The value of the y component to divide this vector by.
	 * @param res
	 *     The extraction parameter for the result.
	 * 
	 * @return The extraction parameter with the result.
	 */
	<T extends ITup2WF> T divT(float tx, float ty, @ExtractionParam T res);
	
	/**
	 * Divides the given vector {@code (v2)} by this vector and saves the result in a new instance.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v2 / v}
	 * 
	 * @param v2
	 *     The vector to divide by this vector.
	 * 
	 * @return A new instance of this vector with the result.
	 */
	IVec2RF rDivN(ITup2RF t);
	
	IVec2RF rDivN(ITupRF t);
	
	/**
	 * Divides the given vector {@code (v2[0], v2[1])} by this vector and saves the result in a new
	 * instance.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v2[0], v2[1]) / v}
	 * 
	 * @param v2
	 *     The vector to divide by this vector as an array with at least two entries.
	 * 
	 * @return A new instance of this vector with the result.
	 */
	IVec2RF rDivN(float[] t);
	
	/**
	 * Divides the given value {@code (value)} by each component of this vector and saves the result
	 * in a new instance.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (value, value) / v}
	 * 
	 * @param value
	 *     The value to divide by this vector.
	 * 
	 * @return A new instance of this vector with the result.
	 */
	IVec2RF rDivN(float value);
	
	/**
	 * Divides the given vector {@code (v2x, v2y)} by this vector and saves the result in a new
	 * instance.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v2x, v2y) / v}
	 * 
	 * @param v2x
	 *     The value of the x component to divide by this vector.
	 * @param v2y
	 *     The value of the y component to divide by this vector.
	 * 
	 * @return A new instance of this vector with the result.
	 */
	IVec2RF rDivN(float tx, float ty);
	
	/**
	 * Divides the given vector {@code (v2)} by this vector and saves the result in the extraction
	 * parameter {@code res}.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v2 / v}
	 * 
	 * @param v2
	 *     The vector to divide by this vector.
	 * @param res
	 *     The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	float[] rDivT(ITup2RF t, @ExtractionParam float[] res);
	
	float[] rDivT(ITupRF t, @ExtractionParam float[] res);
	
	/**
	 * Divides the given vector {@code (v2[0], v2[1])} by this vector and saves the result in the
	 * extraction parameter {@code res}.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * <p>
	 * It is safe to use the given vector {@code v2} as the extraction parameter.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v2[0], v2[1]) / v}
	 * 
	 * @param v2
	 *     The vector to divide by this vector as an array with at least two entries.
	 * @param res
	 *     The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	float[] rDivT(float[] t, @ExtractionParam float[] res);
	
	/**
	 * Divides the given value {@code (value)} by each component of this vector and saves the result
	 * in the extraction parameter {@code res}.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (value, value) / v}
	 * 
	 * @param value
	 *     The value to divide by this vector.
	 * @param res
	 *     The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	float[] rDivT(float value, @ExtractionParam float[] res);
	
	/**
	 * Divides the given vector {@code (v2x, v2y)} by this vector and saves the result in the
	 * extraction parameter {@code res}.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v2x, v2y) / v}
	 * 
	 * @param v2x
	 *     The value of the x component to divide by this vector.
	 * @param v2y
	 *     The value of the y component to divide by this vector.
	 * @param res
	 *     The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	float[] rDivT(float tx, float ty, @ExtractionParam float[] res);
	
	/**
	 * Divides the given vector {@code (v2)} by this vector and saves the result in the extraction
	 * parameter {@code res}.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * <p>
	 * It is safe to use this vector as the extraction parameter.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v2 / v}
	 * 
	 * @param <T>
	 *     The type of the extraction parameter.
	 * 
	 * @param v2
	 *     The vector to divide by this vector.
	 * @param res
	 *     The extraction parameter for the result.
	 * 
	 * @return The extraction parameter with the result.
	 */
	<T extends ITup2WF> T rDivT(ITup2RF t, @ExtractionParam T res);
	
	<T extends ITup2WF> T rDivT(ITupRF t, @ExtractionParam T res);
	
	/**
	 * Divides the given vector {@code (v2[0], v2[1])} by this vector and saves the result in the
	 * extraction parameter {@code res}.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * <p>
	 * It is safe to use this vector as the extraction parameter.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v2[0], v2[1]) / v}
	 * 
	 * @param <T>
	 *     The type of the extraction parameter.
	 * 
	 * @param v2
	 *     The vector to divide by this vector as an array with at least two entries.
	 * @param res
	 *     The extraction parameter for the result.
	 * 
	 * @return The extraction parameter with the result.
	 */
	<T extends ITup2WF> T rDivT(float[] t, @ExtractionParam T res);
	
	/**
	 * Divides the given value {@code (value)} by each component of this vector and saves the result
	 * in the extraction parameter {@code res}.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * <p>
	 * It is safe to use this vector as the extraction parameter.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (value, value) / v}
	 * 
	 * @param <T>
	 *     The type of the extraction parameter.
	 * 
	 * @param value
	 *     The value to divide by this vector.
	 * @param res
	 *     The extraction parameter for the result.
	 * 
	 * @return The extraction parameter with the result.
	 */
	<T extends ITup2WF> T rDivT(float value, @ExtractionParam T res);
	
	/**
	 * Divides the given vector {@code (v2x, v2y)} by this vector and saves the result in the
	 * extraction parameter {@code res}.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * <p>
	 * It is safe to use this vector as the extraction parameter.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (v2x, v2y) / v}
	 * 
	 * @param <T>
	 *     The type of the extraction parameter.
	 * 
	 * @param v2x
	 *     The value of the x component to divide by this vector.
	 * @param v2y
	 *     The value of the y component to divide by this vector.
	 * @param res
	 *     The extraction parameter for the result.
	 * 
	 * @return The extraction parameter with the result.
	 */
	<T extends ITup2WF> T rDivT(float tx, float ty, @ExtractionParam T res);
	
	/**
	 * Returns half the vector from the endpoint of this vector to the endpoint of the given vector
	 * {@code (v2)} as a new instance.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code ( v2 - v ) / 2}
	 * 
	 * @param v2
	 *     The second vector.
	 * 
	 * @return A new instance of this vector with the result.
	 */
	IVec2RF halfVecToN(ITup2RF t);
	
	IVec2RF halfVecToN(ITupRF t);
	
	/**
	 * Returns half the vector from the endpoint of this vector to the endpoint of the given vector
	 * {@code (v2[0], v2[1])} as a new instance.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code ( (v2[0], v2[1]) - v ) / 2}
	 * 
	 * @param v2
	 *     The second vector as an array with at least two entries.
	 * 
	 * @return A new instance of this vector with the result.
	 */
	IVec2RF halfVecToN(float[] t);
	
	/**
	 * Returns half the vector from the endpoint of this vector to the endpoint of the given vector
	 * {@code (v2x, v2y)} as a new instance.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code ( (v2x, v2y) - v ) / 2}
	 * 
	 * @param v2x
	 *     The value of the x component of the second vector.
	 * @param v2y
	 *     The value of the y component of the second vector.
	 * 
	 * @return A new instance of this vector with the result.
	 */
	IVec2RF halfVecToN(float tx, float ty);
	
	/**
	 * Returns half the vector from the endpoint of this vector to the endpoint of the given vector
	 * {@code (v2)} as the extraction parameter {@code res}.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code ( v2 - v ) / 2}
	 * 
	 * @param v2
	 *     The second vector.
	 * @param res
	 *     The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	float[] halfVecToT(ITup2RF t, @ExtractionParam float[] res);
	
	float[] halfVecToT(ITupRF t, @ExtractionParam float[] res);
	
	/**
	 * Returns half the vector from the endpoint of this vector to the endpoint of the given vector
	 * {@code (v2[0], v2[1])} as the extraction parameter {@code res}.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * <p>
	 * It is safe to use the given vector {@code v2} as the extraction parameter.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code ( (v2[0], v2[1]) - v ) / 2}
	 * 
	 * @param v2
	 *     The second vector as an array with at least two entries.
	 * @param res
	 *     The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	float[] halfVecToT(float[] t, @ExtractionParam float[] res);
	
	/**
	 * Returns half the vector from the endpoint of this vector to the endpoint of the given vector
	 * {@code (v2x, v2y)} as the extraction parameter {@code res}.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code ( (v2x, v2y) - v ) / 2}
	 * 
	 * @param v2x
	 *     The value of the x component of the second vector.
	 * @param v2y
	 *     The value of the y component of the second vector.
	 * @param res
	 *     The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	float[] halfVecToT(float tx, float ty, @ExtractionParam float[] res);
	
	/**
	 * Returns half the vector from the endpoint of this vector to the endpoint of the given vector
	 * {@code (v2)} as the extraction parameter {@code res}.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * <p>
	 * It is safe to use this vector as the extraction parameter.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code ( v2 - v ) / 2}
	 * 
	 * @param <T>
	 *     The type of the extraction parameter.
	 * 
	 * @param v2
	 *     The second vector.
	 * @param res
	 *     The extraction parameter for the result.
	 * 
	 * @return The extraction parameter with the result.
	 */
	<T extends ITup2WF> T halfVecToT(ITup2RF t, @ExtractionParam T res);
	
	<T extends ITup2WF> T halfVecToT(ITupRF t, @ExtractionParam T res);
	
	/**
	 * Returns half the vector from the endpoint of this vector to the endpoint of the given vector
	 * {@code (v2[0], v2[1])} as the extraction parameter {@code res}.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * <p>
	 * It is safe to use this vector as the extraction parameter.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code ( (v2[0], v2[1]) - v ) / 2}
	 * 
	 * @param <T>
	 *     The type of the extraction parameter.
	 * 
	 * @param v2
	 *     The second vector as an array with at least two entries.
	 * @param res
	 *     The extraction parameter for the result.
	 * 
	 * @return The extraction parameter with the result.
	 */
	<T extends ITup2WF> T halfVecToT(float[] t, @ExtractionParam T res);
	
	/**
	 * Returns half the vector from the endpoint of this vector to the endpoint of the given vector
	 * {@code (v2x, v2y)} as the extraction parameter {@code res}.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * <p>
	 * It is safe to use this vector as the extraction parameter.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code ( (v2x, v2y) - v ) / 2}
	 * 
	 * @param <T>
	 *     The type of the extraction parameter.
	 * 
	 * @param v2x
	 *     The value of the x component of the second vector.
	 * @param v2y
	 *     The value of the y component of the second vector.
	 * @param res
	 *     The extraction parameter for the result.
	 * 
	 * @return The extraction parameter with the result.
	 */
	<T extends ITup2WF> T halfVecToT(float tx, float ty, @ExtractionParam T res);
	
	/**
	 * Returns the origin vector to the point that lies half way between the endpoint of this vector
	 * and the endpoint of the given vector {@code (v2)} as a new instance.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code ( v2 + v ) / 2}
	 * 
	 * @param v2
	 *     The second vector.
	 * 
	 * @return A new instance of this vector with the result.
	 */
	IVec2RF midPointToN(ITup2RF t);
	
	IVec2RF midPointToN(ITupRF t);
	
	/**
	 * Returns the origin vector to the point that lies half way between the endpoint of this vector
	 * and the endpoint of the given vector {@code (v2[0], v2[1])} as a new instance.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code ( (v2[0], v2[1]) + v ) / 2}
	 * 
	 * @param v2
	 *     The second vector as an array with at least two entries.
	 * 
	 * @return A new instance of this vector with the result.
	 */
	IVec2RF midPointToN(float[] t);
	
	/**
	 * Returns the origin vector to the point that lies half way between the endpoint of this vector
	 * and the endpoint of the given vector {@code (v2x, v2y)} as a new instance.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code ( (v2x, v2y) + v ) / 2}
	 * 
	 * @param v2x
	 *     The value of the x component of the second vector.
	 * @param v2y
	 *     The value of the y component of the second vector.
	 * 
	 * @return A new instance of this vector with the result.
	 */
	IVec2RF midPointToN(float tx, float ty);
	
	/**
	 * Returns the origin vector to the point that lies half way between the endpoint of this vector
	 * and the endpoint of the given vector {@code (v2)} as the extraction parameter {@code res}.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code ( v2 + v ) / 2}
	 * 
	 * @param v2
	 *     The second vector.
	 * @param res
	 *     The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	float[] midPointToT(ITup2RF t, @ExtractionParam float[] res);
	
	float[] midPointToT(ITupRF t, @ExtractionParam float[] res);
	
	/**
	 * Returns the origin vector to the point that lies half way between the endpoint of this vector
	 * and the endpoint of the given vector {@code (v2[0], v2[1])} as the extraction parameter
	 * {@code res}.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * <p>
	 * It is safe to use the given vector {@code v2} as the extraction parameter.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code ( (v2[0], v2[1]) + v ) / 2}
	 * 
	 * @param v2
	 *     The second vector as an array with at least two entries.
	 * @param res
	 *     The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	float[] midPointToT(float[] t, @ExtractionParam float[] res);
	
	/**
	 * Returns the origin vector to the point that lies half way between the endpoint of this vector
	 * and the endpoint of the given vector {@code (v2x, v2y)} as the extraction parameter
	 * {@code res}.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code ( (v2x, v2y) + v ) / 2}
	 * 
	 * @param v2x
	 *     The value of the x component of the second vector.
	 * @param v2y
	 *     The value of the y component of the second vector.
	 * @param res
	 *     The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	float[] midPointToT(float tx, float ty, @ExtractionParam float[] res);
	
	/**
	 * Returns the origin vector to the point that lies half way between the endpoint of this vector
	 * and the endpoint of the given vector {@code (v2)} as the extraction parameter {@code res}.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * <p>
	 * It is safe to use this vector as the extraction parameter.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code ( v2 + v ) / 2}
	 * 
	 * @param <T>
	 *     The type of the extraction parameter.
	 * 
	 * @param v2
	 *     The second vector.
	 * @param res
	 *     The extraction parameter for the result.
	 * 
	 * @return The extraction parameter with the result.
	 */
	<T extends ITup2WF> T midPointToT(ITup2RF t, @ExtractionParam T res);
	
	<T extends ITup2WF> T midPointToT(ITupRF t, @ExtractionParam T res);
	
	/**
	 * Returns the origin vector to the point that lies half way between the endpoint of this vector
	 * and the endpoint of the given vector {@code (v2[0], v2[1])} as the extraction parameter
	 * {@code res}.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * <p>
	 * It is safe to use this vector as the extraction parameter.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code ( (v2[0], v2[1]) + v ) / 2}
	 * 
	 * @param <T>
	 *     The type of the extraction parameter.
	 * 
	 * @param v2
	 *     The second vector as an array with at least two entries.
	 * @param res
	 *     The extraction parameter for the result.
	 * 
	 * @return The extraction parameter with the result.
	 */
	<T extends ITup2WF> T midPointToT(float[] t, @ExtractionParam T res);
	
	/**
	 * Returns the origin vector to the point that lies half way between the endpoint of this vector
	 * and the endpoint of the given vector {@code (v2x, v2y)} as the extraction parameter
	 * {@code res}.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * <p>
	 * It is safe to use this vector as the extraction parameter.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code ( (v2x, v2y) + v ) / 2}
	 * 
	 * @param <T>
	 *     The type of the extraction parameter.
	 * 
	 * @param v2x
	 *     The value of the x component of the second vector.
	 * @param v2y
	 *     The value of the y component of the second vector.
	 * @param res
	 *     The extraction parameter for the result.
	 * 
	 * @return The extraction parameter with the result.
	 */
	<T extends ITup2WF> T midPointToT(float tx, float ty, @ExtractionParam T res);
	
	/**
	 * Negates this vector and returns the result as a new instance.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code -v}
	 * 
	 * @return A new instance of this vector with the result.
	 */
	IVec2RF negN();
	
	/**
	 * Negates this vector and returns the result as the extraction parameter {@code res}.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code -v}
	 * 
	 * @param res
	 *     The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	float[] negT(@ExtractionParam float[] res);
	
	/**
	 * Negates this vector and returns the result as the extraction parameter {@code res}.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * <p>
	 * It is safe to use this vector as the extraction parameter.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code -v}
	 * 
	 * @param <T>
	 *     The type of the extraction parameter.
	 * 
	 * @param res
	 *     The extraction parameter for the result.
	 * 
	 * @return The extraction parameter with the result.
	 */
	<T extends ITup2WF> T negT(@ExtractionParam T res);
	
	/**
	 * Inverses this vector and returns the result as a new instance.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code 1 / v}
	 * 
	 * @return A new instance of this vector with the result.
	 */
	IVec2RF recN();
	
	/**
	 * Inverses this vector and returns the result as the extraction parameter {@code res}.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code 1 / v}
	 * 
	 * @param res
	 *     The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	float[] recT(@ExtractionParam float[] res);
	
	/**
	 * Inverses this vector and returns the result as the extraction parameter {@code res}.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * <p>
	 * It is safe to use this vector as the extraction parameter.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code 1 / v}
	 * 
	 * @param <T>
	 *     The type of the extraction parameter.
	 * 
	 * @param res
	 *     The extraction parameter for the result.
	 * 
	 * @return The extraction parameter with the result.
	 */
	<T extends ITup2WF> T recT(@ExtractionParam T res);
	
	/**
	 * Normalizes this vector and returns the result as a new instance.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v / |v|}
	 * 
	 * @return A new instance of this vector with the result.
	 */
	IVec2RF nrmN();
	
	/**
	 * Normalizes this vector and returns the result as the extraction parameter {@code res}.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v / |v|}
	 * 
	 * @param res
	 *     The extraction parameter for the result.
	 * 
	 * @return The extraction parameter with the result.
	 */
	float[] nrmT(@ExtractionParam float[] res);
	
	/**
	 * Normalizes this vector and returns the result as the extraction parameter {@code res}.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * <p>
	 * It is safe to use this vector as the extraction parameter.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code v / |v|}
	 * 
	 * @param <T>
	 *     The type of the extraction parameter.
	 * 
	 * @param res
	 *     The extraction parameter for the result.
	 * 
	 * @return The extraction parameter with the result.
	 */
	<T extends ITup2WF> T nrmT(@ExtractionParam T res);
	
	/**
	 * Rotates this vector by the given angle in radians and returns the result as a new instance.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link BarghosMath#PROVIDER} is used for
	 * calculation.
	 * 
	 * @param angle
	 *     The angle in radians.
	 * 
	 * @return A new instance of this vector with the result.
	 */
	IVec2RF rotRadN(double angle);
	
	/**
	 * Rotates this vector by the given angle in radians and saves the result in the given
	 * extraction parameter.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link BarghosMath#PROVIDER} is used for
	 * calculation.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * 
	 * @param angle
	 *     The angle in radians.
	 * @param res
	 *     The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	float[] rotRadT(double angle, @ExtractionParam float[] res);
	
	/**
	 * Rotates this vector by the given angle in radians and saves the result in the given
	 * extraction parameter object.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link BarghosMath#PROVIDER} is used for
	 * calculation.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * <p>
	 * It is safe to use this vector as the extraction parameter.
	 * 
	 * @param <T>
	 *     The type of the extraction parameter.
	 * 
	 * @param angle
	 *     The angle in radians.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	<T extends ITup2WF> T rotRadT(double angle, @ExtractionParam T res);
	
	/**
	 * Rotates this vector by the given angle in degrees and returns the result as a new instance.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link BarghosMath#PROVIDER} is used for
	 * calculation.
	 * 
	 * @param angle
	 *     The angle in radians.
	 * 
	 * @return A new instance of this vector with the result.
	 */
	IVec2RF rotDegN(double angle);
	
	/**
	 * Rotates this vector by the given angle in degrees and saves the result in the given
	 * extraction parameter.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link BarghosMath#PROVIDER} is used for
	 * calculation.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * 
	 * @param angle
	 *     The angle in radians.
	 * @param res
	 *     The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	float[] rotDegT(double angle, @ExtractionParam float[] res);
	
	/**
	 * Rotates this vector by the given angle in degrees and saves the result in the given
	 * extraction parameter object.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link BarghosMath#PROVIDER} is used for
	 * calculation.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * <p>
	 * It is safe to use this vector as the extraction parameter.
	 * 
	 * @param <T>
	 *     The type of the extraction parameter.
	 * 
	 * @param angle
	 *     The angle in radians.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	<T extends ITup2WF> T rotDegT(double angle, @ExtractionParam T res);
	
	/**
	 * Calculates the orthogonal projection of this vector onto the normalized target vector
	 * {@code (t)} and returns the result as a new instance.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code t * (v . t)}
	 * 
	 * @param t
	 *     The projection target vector.
	 * 
	 * @return A new instance of this vector with the result.
	 */
	IVec2RF projectN(ITup2RF t);
	
	IVec2RF projectN(ITupRF t);
	
	/**
	 * Calculates the orthogonal projection of this vector onto the normalized target vector
	 * {@code (t[0], t[1])} and returns the result as a new instance.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (t[0], t[1]) * (v . (t[0], t[1]))}
	 * 
	 * @param t
	 *     The projection target vector as an array with at least two entries.
	 * 
	 * @return A new instance of this vector with the result.
	 */
	IVec2RF projectN(float[] t);
	
	/**
	 * Calculates the orthogonal projection of this vector onto the normalized target vector
	 * {@code (tX, tY)} and returns the result as a new instance.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (tX, tY) * (v . (tX, tY))}
	 * 
	 * @param tX
	 *     The value of the x component of the projection target vector.
	 * @param tY
	 *     The value of the y component of the projection target vector.
	 * 
	 * @return A new instance of this vector with the result.
	 */
	IVec2RF projectN(float tx, float ty);
	
	/**
	 * Calculates the orthogonal projection of this vector onto the normalized target vector
	 * {@code (t)} and saves the result in the given extraction parameter.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code t * (v . t)}
	 * 
	 * @param t
	 *     The projection target vector.
	 * @param res
	 *     The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	float[] projectT(ITup2RF t, @ExtractionParam float[] res);
	
	float[] projectT(ITupRF t, @ExtractionParam float[] res);
	
	/**
	 * Calculates the orthogonal projection of this vector onto the normalized target vector
	 * {@code (t[0], t[1])} and saves the result in the given extraction parameter.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (t[0], t[1]) * (v . (t[0], t[1]))}
	 * 
	 * @param t
	 *     The projection target vector as an array with at least two entries.
	 * @param res
	 *     The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	float[] projectT(float[] t, @ExtractionParam float[] res);
	
	/**
	 * Calculates the orthogonal projection of this vector onto the normalized target vector
	 * {@code (tX, tY)} and saves the result in the given extraction parameter.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (tX, tY) * (v . (tX, tY))}
	 * 
	 * @param tX
	 *     The value of the x component of the projection target vector.
	 * @param tY
	 *     The value of the y component of the projection target vector.
	 * @param res
	 *     The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	float[] projectT(float tx, float ty, @ExtractionParam float[] res);
	
	/**
	 * Calculates the orthogonal projection of this vector onto the normalized target vector
	 * {@code (t)} and saves the result in the given extraction parameter object.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * <p>
	 * It is safe to use this vector as the extraction parameter.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code t * (v . t)}
	 * 
	 * @param <T>
	 *     The type of the extraction parameter.
	 * 
	 * @param t
	 *     The projection target vector.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	<T extends ITup2WF> T projectT(ITup2RF t, @ExtractionParam T res);
	
	<T extends ITup2WF> T projectT(ITupRF t, @ExtractionParam T res);
	
	/**
	 * Calculates the orthogonal projection of this vector onto the normalized target vector
	 * {@code (t[0], t[1])} and saves the result in the given extraction parameter object.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * <p>
	 * It is safe to use this vector as the extraction parameter.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (t[0], t[1]) * (v . (t[0], t[1]))}
	 * 
	 * @param <T>
	 *     The type of the extraction parameter.
	 * 
	 * @param t
	 *     The projection target vector as an array with at least two entries.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	<T extends ITup2WF> T projectT(float[] t, @ExtractionParam T res);
	
	/**
	 * Calculates the orthogonal projection of this vector onto the normalized target vector
	 * {@code (tX, tY)} and saves the result in the given extraction parameter object.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * <p>
	 * It is safe to use this vector as the extraction parameter.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (tX, tY) * (v . (tX, tY))}
	 * 
	 * @param <T>
	 *     The type of the extraction parameter.
	 * 
	 * @param tX
	 *     The value of the x component of the projection target vector.
	 * @param tY
	 *     The value of the y component of the projection target vector.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	<T extends ITup2WF> T projectT(float tx, float ty, @ExtractionParam T res);
	
	/**
	 * Calculates the reflection of this vector based on the given normalized surface normal
	 * {@code (n)} and returns the result as a new instance.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * @param n
	 *     The surface normal vector.
	 * 
	 * @return A new instance of this vector with the result.
	 */
	IVec2RF reflectN(ITup2RF n);
	
	IVec2RF reflectN(ITupRF n);
	
	/**
	 * Calculates the reflection of this vector based on the given normalized surface normal
	 * {@code (n[0], n[1])} and returns the result as a new instance.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * @param n
	 *     The surface normal vector as an array with at least two entries.
	 * 
	 * @return A new instance of this vector with the result.
	 */
	IVec2RF reflectN(float[] n);
	
	/**
	 * Calculates the reflection of this vector based on the given normalized surface normal
	 * {@code (nX, nY)} and returns the result as a new instance.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * @param nX
	 *     The value of the x component of the surface normal vector.
	 * @param nY
	 *     The value of the y component of the surface normal vector.
	 * 
	 * @return A new instance of this vector with the result.
	 */
	IVec2RF reflectN(float nx, float ny);
	
	/**
	 * Calculates the reflection of this vector based on the given normalized surface normal
	 * {@code (n)} and saves the result in the given extraction parameter.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * @param n
	 *     The surface normal vector.
	 * @param res
	 *     The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	float[] reflectT(ITup2RF n, @ExtractionParam float[] res);
	
	float[] reflectT(ITupRF n, @ExtractionParam float[] res);
	
	/**
	 * Calculates the reflection of this vector based on the given normalized surface normal
	 * {@code (n[0], n[1])} and saves the result in the given extraction parameter.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * @param n
	 *     The surface normal vector as an array with at least two entries.
	 * @param res
	 *     The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	float[] reflectT(float[] n, @ExtractionParam float[] res);
	
	/**
	 * Calculates the reflection of this vector based on the given normalized surface normal
	 * {@code (nX, nY)} and saves the result in the given extraction parameter.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * @param nX
	 *     The value of the x component of the surface normal vector.
	 * @param nY
	 *     The value of the y component of the surface normal vector.
	 * @param res
	 *     The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	float[] reflectT(float nx, float ny, @ExtractionParam float[] res);
	
	/**
	 * Calculates the reflection of this vector based on the given normalized surface normal
	 * {@code (n)} and saves the result in the given extraction parameter object.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * <p>
	 * It is safe to use this vector as the extraction parameter.
	 * 
	 * @param <T>
	 *     The type of the extraction parameter.
	 * 
	 * @param n
	 *     The surface normal vector.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	<T extends ITup2WF> T reflectT(ITup2RF n, @ExtractionParam T res);
	
	<T extends ITup2WF> T reflectT(ITupRF n, @ExtractionParam T res);
	
	/**
	 * Calculates the reflection of this vector based on the given normalized surface normal
	 * {@code (n[0], n[1])} and saves the result in the given extraction parameter object.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * <p>
	 * It is safe to use this vector as the extraction parameter.
	 * 
	 * @param <T>
	 *     The type of the extraction parameter.
	 * 
	 * @param n
	 *     The surface normal vector as an array with at least two entries.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	<T extends ITup2WF> T reflectT(float[] n, @ExtractionParam T res);
	
	/**
	 * Calculates the reflection of this vector based on the given normalized surface normal
	 * {@code (nX, nY)} and saves the result in the given extraction parameter object.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * <p>
	 * It is safe to use this vector as the extraction parameter.
	 * 
	 * @param <T>
	 *     The type of the extraction parameter.
	 * 
	 * @param nX
	 *     The value of the x component of the surface normal vector.
	 * @param nY
	 *     The value of the y component of the surface normal vector.
	 * @param res
	 *     The extraction parameter object for the result.
	 * 
	 * @return The extraction parameter object with the result.
	 */
	<T extends ITup2WF> T reflectT(float nx, float ny, @ExtractionParam T res);
	
	/**
	 * Calculates the absolute value of the component values and saves the result in a new instance.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * @return A new instance of this vector with the result.
	 */
	IVec2RF absN();
	
	/**
	 * Calculates the absolute values of the component values and saves the result in the extraction
	 * parameter.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * @param res
	 *     The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	float[] absT(@ExtractionParam float[] res);
	
	/**
	 * Calculates the absolute values of the component values and saves the result in the extraction
	 * parameter.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * @param <T>
	 *     The type of the extraction parameter.
	 * 
	 * @param res
	 *     The extraction parameter for the result.
	 * 
	 * @return The extraction parameter with the result.
	 */
	<T extends ITup2WF> T absT(@ExtractionParam T res);
	
	/**
	 * Calculates the {@link Math#signum(float) signum} of the components of this vector and saves
	 * the result in a new instance.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * @return A new instance of this vector with the result.
	 */
	IVec2RF signN();
	
	/**
	 * Calculates the {@link Math#signum(float) signum} of the components of this vector and saves
	 * the result in the extraction parameter.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * @param res
	 *     The extraction parameter for the result as an array with at least two entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	float[] signT(@ExtractionParam float[] res);
	
	/**
	 * Calculates the {@link Math#signum(float) signum} of the components of this vector and saves
	 * the result in the extraction parameter.
	 * 
	 * <p>
	 * This operation <u><b>does not</b></u> alter the vector.
	 * 
	 * @param <T>
	 *     The type of the extraction parameter.
	 * 
	 * @param res
	 *     The extraction parameter for the result.
	 * 
	 * @return The extraction parameter with the result.
	 */
	<T extends ITup2WF> T signT(@ExtractionParam T res);
	
	/**
	 * Arranges the order of the component values by their indices and returns
	 * the result as a new instance of the original type of this tuple.
	 * This does not change the size of the tuple.
	 * 
	 * <p>
	 * The passed indices array contains the current indices at the new
	 * positions. If the value at the current index 7 in this tuple should be
	 * placed at the new index 2, the value 7 would be passed at index 2 in the
	 * indices array.
	 * 
	 * <p>
	 * The valid index range is from 0 to 1. The given array has to have at
	 * least two entries. It is however not required to use all indices, neither
	 * is it required that each index is only used once.
	 * 
	 * @param indices The indices of the components of this tuple in new order.
	 * 
	 * @return A new instance of this type of tuple with the result.
	 */
	IVec2RF arrangeN(int[] indices);
	
	/**
	 * Arranges the order of the component values by their indices and returns
	 * the result as a new instance of the original type of this tuple.
	 * This does not change the size of the tuple.
	 * 
	 * <p>
	 * The passed indices array contains the current indices at the new
	 * positions. If the value at the current index 7 in this tuple should be
	 * placed at the new index 2, the value 7 would be passed at index 2 in the
	 * indices array.
	 * 
	 * <p>
	 * The valid index range is from 0 to 1. It is however not required to use
	 * all indices, neither is it required that each index is only used once.
	 * 
	 * @param i0
	 * The index of the old component value which will be adopted to the
	 * first component.
	 * @param i1
	 * The index of the old component value which will be adopted to the
	 * second component.
	 * 
	 * @return A new instance of this type of tuple with the result.
	 */
	IVec2RF arrangeN(int indexX, int indexY);
	
	/**
	 * Swaps two component values at the given indices and returns the result
	 * as a new instance of the original type of this tuple, so that the value
	 * at the first given index becomes the value at the second given index and
	 * the value at the second given index becomes the value at the fist given
	 * index.
	 * 
	 * <p>
	 * The valid index range is from 0 to 1. It is however not
	 * required to use different indices.
	 * 
	 * @param indexA The index to the first component value to be swapped.
	 * @param indexB The index to the second component value to be swapped.
	 * 
	 * @return A new instance of this type of tuple with the result.
	 */
	@Override
	IVec2RF swizzleN(int indexA, int indexB);
	
	/**
	 * Swaps the values of the components {@code v0} and {@code v1} and returns
	 * the result as a new instance of the type of this tuple.
	 * 
	 * @return A new instance of the type of this tuple with the result.
	 */
	IVec2RF swizzleV0V1N();

	IVec2RF swizzleXYN();
	
	IVec2RF minComponentsN(ITup2RF t);
	
	IVec2RF minComponentsN(ITupRF t);
	
	IVec2RF minComponentsN(float[] t);
	
	IVec2RF minComponentsN(float tv0, float tv1);

	IVec2RF maxComponentsN(ITup2RF t);
	
	IVec2RF maxComponentsN(ITupRF t);
	
	IVec2RF maxComponentsN(float[] t);
	
	IVec2RF maxComponentsN(float tv0, float tv1);
}
