package org.barghos.api.math.quaternion;

import org.barghos.annotation.ExtractionParam;
import org.barghos.api.core.function.floats.IFunc4F;
import org.barghos.api.core.math.MathUtils;
import org.barghos.api.core.tuple.floats.ITup4RF;
import org.barghos.api.core.tuple.floats.ITup4WF;

/**
 * This class provides utilities for working with float quaternions.
 */
public class QuatUtilsF
{
	/**
	 * Returns the squared length (magnitude, norm) of the quaternion {@code (q)}.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code |q|²}
	 * 
	 * @param q The quaternion.
	 * 
	 * @return The squared length of the quaternion.
	 */
	public static float lenSq(ITup4RF q)
	{
		float v0 = q.v0();
		float v1 = q.v1();
		float v2 = q.v2();
		float v3 = q.v3();
		
		return v0 * v0 + v1 * v1 + v2 * v2 + v3 * v3;
	}

	public static float lenSq(float[] q)
	{
		float v0 = q[0];
		float v1 = q[1];
		float v2 = q[2];
		float v3 = q[3];
		
		return v0 * v0 + v1 * v1 + v2 * v2 + v3 * v3;
	}

	public static float lenSq(float v0, float v1, float v2, float v3)
	{
		return v0 * v0 + v1 * v1 + v2 * v2 + v3 * v3;
	}
	
	/**
	 * Returns the length (magnitude, norm) of the quaternion {@code (q)}.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link BarghosMath#PROVIDER} is used for
	 * calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code |q|}
	 * 
	 * @param q The quaternion.
	 * 
	 * @return The length of the quaternion.
	 */
	public static float len(ITup4RF q)
	{
		float v0 = q.v0();
		float v1 = q.v1();
		float v2 = q.v2();
		float v3 = q.v3();
		
		float sqareLength = v0 * v0 + v1 * v1 + v2 * v2 + v3 * v3;
		
		if(MathUtils.isZero(sqareLength)) return 0.0f;
		
		return MathUtils.sqrt(sqareLength);
	}

	public static float len(float[] q)
	{
		float v0 = q[0];
		float v1 = q[1];
		float v2 = q[2];
		float v3 = q[3];
		
		float sqareLength = v0 * v0 + v1 * v1 + v2 * v2 + v3 * v3;
		
		if(MathUtils.isZero(sqareLength)) return 0.0f;
		
		return MathUtils.sqrt(sqareLength);
	}

	public static float len(float v0, float v1, float v2, float v3)
	{
		float sqareLength = v0 * v0 + v1 * v1 + v2 * v2 + v3 * v3;
		
		if(MathUtils.isZero(sqareLength)) return 0.0f;
		
		return MathUtils.sqrt(sqareLength);
	}
	
	/**
	 * Returns the inverse (reciprocal) length (magnitude, norm) of the quaternion {@code (q)}.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link BarghosMath#PROVIDER} is used for
	 * calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code 1 / |q|}
	 * 
	 * @param q The quaternion.
	 * 
	 * @return The reciprocal length of the quaternion.
	 */
	public static float lenRc(ITup4RF q)
	{
		float v0 = q.v0();
		float v1 = q.v1();
		float v2 = q.v2();
		float v3 = q.v3();
		
		float sqareLength = v0 * v0 + v1 * v1 + v2 * v2 + v3 * v3;
		
		return MathUtils.invSqrt(sqareLength);
	}
	
	public static float lenRc(float[] q)
	{
		float v0 = q[0];
		float v1 = q[1];
		float v2 = q[2];
		float v3 = q[3];
		
		float sqareLength = v0 * v0 + v1 * v1 + v2 * v2 + v3 * v3;
		
		return MathUtils.invSqrt(sqareLength);
	}
	
	public static float lenRc(float v0, float v1, float v2, float v3)
	{
		float sqareLength = v0 * v0 + v1 * v1 + v2 * v2 + v3 * v3;
		
		return MathUtils.invSqrt(sqareLength);
	}
	
	/**
	 * Calculates the dot (scalar) product between the first given quaternion {@code (q1)} and the
	 * second given quaternion {@code (q2)}.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code q1 . q2}
	 * 
	 * @param q1 The first quaternion.
	 * @param q2 The second quaternion.
	 * 
	 * @return The dot (scalar) product.
	 */
	public static float dot(ITup4RF q1, ITup4RF q2)
	{
		float q1v0 = q1.v0();
		float q1v1 = q1.v1();
		float q1v2 = q1.v2();
		float q1v3 = q1.v3();
		
		float q2v0 = q2.v0();
		float q2v1 = q2.v1();
		float q2v2 = q2.v2();
		float q2v3 = q2.v3();
		
		return q1v0 * q2v0 + q1v1 * q2v1 + q1v2 * q2v2 + q1v3 * q2v3;
	}
	
	public static float dot(ITup4RF q1, float[] q2)
	{
		float q1v0 = q1.v0();
		float q1v1 = q1.v1();
		float q1v2 = q1.v2();
		float q1v3 = q1.v3();
		
		float q2v0 = q2[0];
		float q2v1 = q2[1];
		float q2v2 = q2[2];
		float q2v3 = q2[3];
		
		return q1v0 * q2v0 + q1v1 * q2v1 + q1v2 * q2v2 + q1v3 * q2v3;
	}
	
	public static float dot(ITup4RF q1, float q2v0, float q2v1, float q2v2, float q2v3)
	{
		float q1v0 = q1.v0();
		float q1v1 = q1.v1();
		float q1v2 = q1.v2();
		float q1v3 = q1.v3();
		
		return q1v0 * q2v0 + q1v1 * q2v1 + q1v2 * q2v2 + q1v3 * q2v3;
	}
	
	public static float dot(float[] q1, ITup4RF q2)
	{
		float q1v0 = q1[0];
		float q1v1 = q1[1];
		float q1v2 = q1[2];
		float q1v3 = q1[3];
		
		float q2v0 = q2.v0();
		float q2v1 = q2.v1();
		float q2v2 = q2.v2();
		float q2v3 = q2.v3();
		
		return q1v0 * q2v0 + q1v1 * q2v1 + q1v2 * q2v2 + q1v3 * q2v3;
	}
	
	public static float dot(float[] q1, float[] q2)
	{
		float q1v0 = q1[0];
		float q1v1 = q1[1];
		float q1v2 = q1[2];
		float q1v3 = q1[3];
		
		float q2v0 = q2[0];
		float q2v1 = q2[1];
		float q2v2 = q2[2];
		float q2v3 = q2[3];
		
		return q1v0 * q2v0 + q1v1 * q2v1 + q1v2 * q2v2 + q1v3 * q2v3;
	}
	
	public static float dot(float[] q1, float q2v0, float q2v1, float q2v2, float q2v3)
	{
		float q1v0 = q1[0];
		float q1v1 = q1[1];
		float q1v2 = q1[2];
		float q1v3 = q1[3];
		
		return q1v0 * q2v0 + q1v1 * q2v1 + q1v2 * q2v2 + q1v3 * q2v3;
	}
	
	public static float dot(float q1v0, float q1v1, float q1v2, float q1v3, ITup4RF q2)
	{
		float q2v0 = q2.v0();
		float q2v1 = q2.v1();
		float q2v2 = q2.v2();
		float q2v3 = q2.v3();
		
		return q1v0 * q2v0 + q1v1 * q2v1 + q1v2 * q2v2 + q1v3 * q2v3;
	}
	
	public static float dot(float q1v0, float q1v1, float q1v2, float q1v3, float[] q2)
	{
		float q2v0 = q2[0];
		float q2v1 = q2[1];
		float q2v2 = q2[2];
		float q2v3 = q2[3];
		
		return q1v0 * q2v0 + q1v1 * q2v1 + q1v2 * q2v2 + q1v3 * q2v3;
	}
	
	public static float dot(float q1v0, float q1v1, float q1v2, float q1v3, float q2v0, float q2v1, float q2v2, float q2v3)
	{
		return q1v0 * q2v0 + q1v1 * q2v1 + q1v2 * q2v2 + q1v3 * q2v3;
	}
	
	/**
	 * Calculates the conjugate of the quaternion {@code (q)} and saves the result in the given
	 * extraction parameter.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code q* }
	 * 
	 * @param q The quaternion as an array with at least four entries.
	 * @param res The extraction parameter for the result as an array with at least four entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] conj(ITup4RF q, @ExtractionParam float[] res)
	{
		float v0 = q.v0();
		float v1 = q.v1();
		float v2 = q.v2();
		float v3 = q.v3();
		
		res[0] = -v0;
		res[1] = -v1;
		res[2] = -v2;
		res[3] = v3;
		
		return res;
	}

	public static float[] conj(float[] q, @ExtractionParam float[] res)
	{
		float v0 = q[0];
		float v1 = q[1];
		float v2 = q[2];
		float v3 = q[3];
		
		res[0] = -v0;
		res[1] = -v1;
		res[2] = -v2;
		res[3] = v3;
		
		return res;
	}

	public static float[] conj(float v0, float v1, float v2, float v3, @ExtractionParam float[] res)
	{
		res[0] = -v0;
		res[1] = -v1;
		res[2] = -v2;
		res[3] = v3;
		
		return res;
	}
	
	public static <T extends ITup4WF> T conj(ITup4RF q, @ExtractionParam T res)
	{
		float v0 = q.v0();
		float v1 = q.v1();
		float v2 = q.v2();
		float v3 = q.v3();

		res.set(-v0, -v1, -v2, v3);
		
		return res;
	}

	public static <T extends ITup4WF> T conj(float[] q, @ExtractionParam T res)
	{
		float v0 = q[0];
		float v1 = q[1];
		float v2 = q[2];
		float v3 = q[3];
		
		res.set(-v0, -v1, -v2, v3);
		
		return res;
	}

	public static <T extends ITup4WF> T conj(float v0, float v1, float v2, float v3, @ExtractionParam T res)
	{
		res.set(-v0, -v1, -v2, v3);
		
		return res;
	}
	
	public static <T> T conjFunc(ITup4RF q, IFunc4F<T> func)
	{
		float v0 = q.v0();
		float v1 = q.v1();
		float v2 = q.v2();
		float v3 = q.v3();

		return func.apply(-v0, -v1, -v2, v3);
	}

	public static <T> T conjFunc(float[] q, IFunc4F<T> func)
	{
		float v0 = q[0];
		float v1 = q[1];
		float v2 = q[2];
		float v3 = q[3];
		
		return func.apply(-v0, -v1, -v2, v3);
	}

	public static <T> T conjFunc(float v0, float v1, float v2, float v3, IFunc4F<T> func)
	{
		return func.apply(-v0, -v1, -v2, v3);
	}
	
	/**
	 * Calculates the inverse of the quaternion {@code (q)} and saves the result in the given
	 * extraction parameter.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code q* / |q|² }
	 * 
	 * @param q The quaternion.
	 * @param res The extraction parameter for the result as an array with at least four entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] inv(ITup4RF q, @ExtractionParam float[] res)
	{
		float v0 = q.v0();
		float v1 = q.v1();
		float v2 = q.v2();
		float v3 = q.v3();
		
		float invLength = 1.0f / (v0 * v0 + v1 * v1 + v2 * v2 + v3 * v3);
		
		res[0] = -v0 * invLength;
		res[1] = -v1 * invLength;
		res[2] = -v2 * invLength;
		res[3] = v3 * invLength; 
		
		return res;
	}

	public static float[] inv(float[] q, @ExtractionParam float[] res)
	{
		float v0 = q[0];
		float v1 = q[1];
		float v2 = q[2];
		float v3 = q[3];
		
		float invLength = 1.0f / (v0 * v0 + v1 * v1 + v2 * v2 + v3 * v3);
		
		res[0] = -v0 * invLength;
		res[1] = -v1 * invLength;
		res[2] = -v2 * invLength;
		res[3] = v3 * invLength; 
		
		return res;
	}

	public static float[] inv(float v0, float v1, float v2, float v3, @ExtractionParam float[] res)
	{
		float invLength = 1.0f / (v0 * v0 + v1 * v1 + v2 * v2 + v3 * v3);
		
		res[0] = -v0 * invLength;
		res[1] = -v1 * invLength;
		res[2] = -v2 * invLength;
		res[3] = v3 * invLength; 
		
		return res;
	}
	
	public static <T extends ITup4WF> T inv(ITup4RF q, @ExtractionParam T res)
	{
		float v0 = q.v0();
		float v1 = q.v1();
		float v2 = q.v2();
		float v3 = q.v3();
		
		float invLength = 1.0f / (v0 * v0 + v1 * v1 + v2 * v2 + v3 * v3);
		
		res.set(-v0 * invLength, -v1 * invLength, -v2 * invLength, v3 * invLength);
		
		return res;
	}

	public static <T extends ITup4WF> T inv(float[] q, @ExtractionParam T res)
	{
		float v0 = q[0];
		float v1 = q[1];
		float v2 = q[2];
		float v3 = q[3];
		
		float invLength = 1.0f / (v0 * v0 + v1 * v1 + v2 * v2 + v3 * v3);
		
		res.set(-v0 * invLength, -v1 * invLength, -v2 * invLength, v3 * invLength);
		
		return res;
	}

	public static <T extends ITup4WF> T inv(float v0, float v1, float v2, float v3, @ExtractionParam T res)
	{
		float invLength = 1.0f / (v0 * v0 + v1 * v1 + v2 * v2 + v3 * v3);
		
		res.set(-v0 * invLength, -v1 * invLength, -v2 * invLength, v3 * invLength);
		
		return res;
	}
	
	public static <T> T invFunc(ITup4RF q, IFunc4F<T> func)
	{
		float v0 = q.v0();
		float v1 = q.v1();
		float v2 = q.v2();
		float v3 = q.v3();
		
		float invLength = 1.0f / (v0 * v0 + v1 * v1 + v2 * v2 + v3 * v3);
		
		return func.apply(-v0 * invLength, -v1 * invLength, -v2 * invLength, v3 * invLength);
	}

	public static <T> T invFunc(float[] q, IFunc4F<T> func)
	{
		float v0 = q[0];
		float v1 = q[1];
		float v2 = q[2];
		float v3 = q[3];
		
		float invLength = 1.0f / (v0 * v0 + v1 * v1 + v2 * v2 + v3 * v3);
		
		return func.apply(-v0 * invLength, -v1 * invLength, -v2 * invLength, v3 * invLength);
	}

	public static <T> T invFunc(float v0, float v1, float v2, float v3, IFunc4F<T> func)
	{
		float invLength = 1.0f / (v0 * v0 + v1 * v1 + v2 * v2 + v3 * v3);
		
		return func.apply(-v0 * invLength, -v1 * invLength, -v2 * invLength, v3 * invLength);
	}
	


	
	/**
	 * Normalizes the quaternion {@code (q)} and saves the result in the given extraction parameter.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link BarghosMath#PROVIDER} is used for
	 * calculation.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code q / |q|}
	 * 
	 * @param q The quaternion.
	 * @param res The extraction parameter for the result as an array with at least four entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] nrm(ITup4RF q, @ExtractionParam float[] res)
	{
		float v0 = q.v0();
		float v1 = q.v1();
		float v2 = q.v2();
		float v3 = q.v3();
		
		float invLength = MathUtils.invSqrt(v0 * v0 + v1 * v1 + v2 * v2 + v3 * v3);
		
		res[0] = v0 * invLength;
		res[1] = v1 * invLength;
		res[2] = v2 * invLength;
		res[3] = v3 * invLength;
		
		return res;
	}	

	public static float[] nrm(float[] q, @ExtractionParam float[] res)
	{
		float v0 = q[0];
		float v1 = q[1];
		float v2 = q[2];
		float v3 = q[3];
		
		float invLength = MathUtils.invSqrt(v0 * v0 + v1 * v1 + v2 * v2 + v3 * v3);
		
		res[0] = v0 * invLength;
		res[1] = v1 * invLength;
		res[2] = v2 * invLength;
		res[3] = v3 * invLength;
		
		return res;
	}	

	public static float[] nrm(float v0, float v1, float v2, float v3, @ExtractionParam float[] res)
	{
		float invLength = MathUtils.invSqrt(v0 * v0 + v1 * v1 + v2 * v2 + v3 * v3);
		
		res[0] = v0 * invLength;
		res[1] = v1 * invLength;
		res[2] = v2 * invLength;
		res[3] = v3 * invLength;
		
		return res;
	}	
	
	public static <T extends ITup4WF> T nrm(ITup4RF q, @ExtractionParam T res)
	{
		float v0 = q.v0();
		float v1 = q.v1();
		float v2 = q.v2();
		float v3 = q.v3();
		
		float invLength = MathUtils.invSqrt(v0 * v0 + v1 * v1 + v2 * v2 + v3 * v3);
		
		res.set(v0 * invLength, v1 * invLength, v2 * invLength, v3 * invLength);
		
		return res;
	}	

	public static <T extends ITup4WF> T nrm(float[] q, @ExtractionParam T res)
	{
		float v0 = q[0];
		float v1 = q[1];
		float v2 = q[2];
		float v3 = q[3];
		
		float invLength = MathUtils.invSqrt(v0 * v0 + v1 * v1 + v2 * v2 + v3 * v3);
		
		res.set(v0 * invLength, v1 * invLength, v2 * invLength, v3 * invLength);
		
		return res;
	}	

	public static <T extends ITup4WF> T nrm(float v0, float v1, float v2, float v3, @ExtractionParam T res)
	{
		float invLength = MathUtils.invSqrt(v0 * v0 + v1 * v1 + v2 * v2 + v3 * v3);
		
		res.set(v0 * invLength, v1 * invLength, v2 * invLength, v3 * invLength);
		
		return res;
	}	
	
	public static <T> T nrmFunc(ITup4RF q, IFunc4F<T> func)
	{
		float v0 = q.v0();
		float v1 = q.v1();
		float v2 = q.v2();
		float v3 = q.v3();
		
		float invLength = MathUtils.invSqrt(v0 * v0 + v1 * v1 + v2 * v2 + v3 * v3);
		
		return func.apply(v0 * invLength, v1 * invLength, v2 * invLength, v3 * invLength);
	}	

	public static <T> T nrmFunc(float[] q, IFunc4F<T> func)
	{
		float v0 = q[0];
		float v1 = q[1];
		float v2 = q[2];
		float v3 = q[3];
		
		float invLength = MathUtils.invSqrt(v0 * v0 + v1 * v1 + v2 * v2 + v3 * v3);
		
		return func.apply(v0 * invLength, v1 * invLength, v2 * invLength, v3 * invLength);
	}	

	public static <T> T nrmFunc(float v0, float v1, float v2, float v3, IFunc4F<T> func)
	{
		float invLength = MathUtils.invSqrt(v0 * v0 + v1 * v1 + v2 * v2 + v3 * v3);
		
		return func.apply(v0 * invLength, v1 * invLength, v2 * invLength, v3 * invLength);
	}	
	
	/**
	 * Multiplies the first given quaternion {@code (q1)} with the second given quaternion {@code (q2)}, normalizes the result and saves the result in the given extraction parameter.
	 * 
	 * <p>
	 * Here the default {@link MathProvider} from {@link BarghosMath#PROVIDER} is used for
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code q1 * q2}
	 * 
	 * @param q1 The first quaternion.
	 * @param q2 The second quaternion.
	 * @param res The extraction parameter for the result as an array with at least four entries.
	 * 
	 * @return The extraction parameter with the result.
	 */
	public static float[] mul(ITup4RF q1, ITup4RF q2, @ExtractionParam float[] res)
	{
		float q1v0 = q1.v0();
		float q1v1 = q1.v1();
		float q1v2 = q1.v2();
		float q1v3 = q1.v3();
		
		float q2v0 = q2.v0();
		float q2v1 = q2.v1();
		float q2v2 = q2.v2();
		float q2v3 = q2.v3();
		
		/*
		 * Mutliplication happens for (v1; w1) * (v2; w2) by:
		 * 
		 * (w1 * v2 + w2 * v1 + v1 x v2; w1 * w2 + (-v1) . v2)
		 */
		
		float rv0 = q1v3 * q2v0 + q2v3 * q1v0 + q1v1 * q2v2 - q1v2 * q2v1;  // s * v'.x + s' * v.x + (V x V').x
		float rv1 = q1v3 * q2v1 + q2v3 * q1v1 + q1v2 * q2v0 - q1v0 * q2v2; // s * v'.y + s' * v.y + (V x V').y
		float rv2 = q1v3 * q2v2 + q2v3 * q1v2 + q1v0 * q2v1 - q1v1 * q2v0;  // s * v'.z + s' * v.z + (V x V').z
		float rv3 = q1v3 * q2v3 - q1v0 * q2v0 - q1v1 * q2v1 - q1v2 * q2v2; // w * w' - v * v'
		
		res[0] = rv0;
		res[1] = rv1;
		res[2] = rv2;
		res[3] = rv3;
		
		return res;
	}
	
	public static float[] mul(ITup4RF q1, float[] q2, @ExtractionParam float[] res)
	{
		float q1v0 = q1.v0();
		float q1v1 = q1.v1();
		float q1v2 = q1.v2();
		float q1v3 = q1.v3();
		
		float q2v0 = q2[0];
		float q2v1 = q2[1];
		float q2v2 = q2[2];
		float q2v3 = q2[3];
		
		/*
		 * Mutliplication happens for (v1; w1) * (v2; w2) by:
		 * 
		 * (w1 * v2 + w2 * v1 + v1 x v2; w1 * w2 + (-v1) . v2)
		 */
		
		float rv0 = q1v3 * q2v0 + q2v3 * q1v0 + q1v1 * q2v2 - q1v2 * q2v1;  // s * v'.x + s' * v.x + (V x V').x
		float rv1 = q1v3 * q2v1 + q2v3 * q1v1 + q1v2 * q2v0 - q1v0 * q2v2; // s * v'.y + s' * v.y + (V x V').y
		float rv2 = q1v3 * q2v2 + q2v3 * q1v2 + q1v0 * q2v1 - q1v1 * q2v0;  // s * v'.z + s' * v.z + (V x V').z
		float rv3 = q1v3 * q2v3 - q1v0 * q2v0 - q1v1 * q2v1 - q1v2 * q2v2; // w * w' - v * v'
		
		res[0] = rv0;
		res[1] = rv1;
		res[2] = rv2;
		res[3] = rv3;
		
		return res;
	}
	
	public static float[] mul(ITup4RF q1, float q2v0, float q2v1, float q2v2, float q2v3, @ExtractionParam float[] res)
	{
		float q1v0 = q1.v0();
		float q1v1 = q1.v1();
		float q1v2 = q1.v2();
		float q1v3 = q1.v3();
		
		/*
		 * Mutliplication happens for (v1; w1) * (v2; w2) by:
		 * 
		 * (w1 * v2 + w2 * v1 + v1 x v2; w1 * w2 + (-v1) . v2)
		 */
		
		float rv0 = q1v3 * q2v0 + q2v3 * q1v0 + q1v1 * q2v2 - q1v2 * q2v1;  // s * v'.x + s' * v.x + (V x V').x
		float rv1 = q1v3 * q2v1 + q2v3 * q1v1 + q1v2 * q2v0 - q1v0 * q2v2; // s * v'.y + s' * v.y + (V x V').y
		float rv2 = q1v3 * q2v2 + q2v3 * q1v2 + q1v0 * q2v1 - q1v1 * q2v0;  // s * v'.z + s' * v.z + (V x V').z
		float rv3 = q1v3 * q2v3 - q1v0 * q2v0 - q1v1 * q2v1 - q1v2 * q2v2; // w * w' - v * v'
		
		res[0] = rv0;
		res[1] = rv1;
		res[2] = rv2;
		res[3] = rv3;
		
		return res;
	}
	
	public static float[] mul(float[] q1, ITup4RF q2, @ExtractionParam float[] res)
	{
		float q1v0 = q1[0];
		float q1v1 = q1[1];
		float q1v2 = q1[2];
		float q1v3 = q1[3];
		
		float q2v0 = q2.v0();
		float q2v1 = q2.v1();
		float q2v2 = q2.v2();
		float q2v3 = q2.v3();
		
		/*
		 * Mutliplication happens for (v1; w1) * (v2; w2) by:
		 * 
		 * (w1 * v2 + w2 * v1 + v1 x v2; w1 * w2 + (-v1) . v2)
		 */
		
		float rv0 = q1v3 * q2v0 + q2v3 * q1v0 + q1v1 * q2v2 - q1v2 * q2v1;  // s * v'.x + s' * v.x + (V x V').x
		float rv1 = q1v3 * q2v1 + q2v3 * q1v1 + q1v2 * q2v0 - q1v0 * q2v2; // s * v'.y + s' * v.y + (V x V').y
		float rv2 = q1v3 * q2v2 + q2v3 * q1v2 + q1v0 * q2v1 - q1v1 * q2v0;  // s * v'.z + s' * v.z + (V x V').z
		float rv3 = q1v3 * q2v3 - q1v0 * q2v0 - q1v1 * q2v1 - q1v2 * q2v2; // w * w' - v * v'
		
		res[0] = rv0;
		res[1] = rv1;
		res[2] = rv2;
		res[3] = rv3;
		
		return res;
	}
	
	public static float[] mul(float[] q1, float[] q2, @ExtractionParam float[] res)
	{
		float q1v0 = q1[0];
		float q1v1 = q1[1];
		float q1v2 = q1[2];
		float q1v3 = q1[3];
		
		float q2v0 = q2[0];
		float q2v1 = q2[1];
		float q2v2 = q2[2];
		float q2v3 = q2[3];
		
		/*
		 * Mutliplication happens for (v1; w1) * (v2; w2) by:
		 * 
		 * (w1 * v2 + w2 * v1 + v1 x v2; w1 * w2 + (-v1) . v2)
		 */
		
		float rv0 = q1v3 * q2v0 + q2v3 * q1v0 + q1v1 * q2v2 - q1v2 * q2v1;  // s * v'.x + s' * v.x + (V x V').x
		float rv1 = q1v3 * q2v1 + q2v3 * q1v1 + q1v2 * q2v0 - q1v0 * q2v2; // s * v'.y + s' * v.y + (V x V').y
		float rv2 = q1v3 * q2v2 + q2v3 * q1v2 + q1v0 * q2v1 - q1v1 * q2v0;  // s * v'.z + s' * v.z + (V x V').z
		float rv3 = q1v3 * q2v3 - q1v0 * q2v0 - q1v1 * q2v1 - q1v2 * q2v2; // w * w' - v * v'
		
		res[0] = rv0;
		res[1] = rv1;
		res[2] = rv2;
		res[3] = rv3;
		
		return res;
	}
	
	public static float[] mul(float[] q1, float q2v0, float q2v1, float q2v2, float q2v3, @ExtractionParam float[] res)
	{
		float q1v0 = q1[0];
		float q1v1 = q1[1];
		float q1v2 = q1[2];
		float q1v3 = q1[3];
		
		/*
		 * Mutliplication happens for (v1; w1) * (v2; w2) by:
		 * 
		 * (w1 * v2 + w2 * v1 + v1 x v2; w1 * w2 + (-v1) . v2)
		 */
		
		float rv0 = q1v3 * q2v0 + q2v3 * q1v0 + q1v1 * q2v2 - q1v2 * q2v1;  // s * v'.x + s' * v.x + (V x V').x
		float rv1 = q1v3 * q2v1 + q2v3 * q1v1 + q1v2 * q2v0 - q1v0 * q2v2; // s * v'.y + s' * v.y + (V x V').y
		float rv2 = q1v3 * q2v2 + q2v3 * q1v2 + q1v0 * q2v1 - q1v1 * q2v0;  // s * v'.z + s' * v.z + (V x V').z
		float rv3 = q1v3 * q2v3 - q1v0 * q2v0 - q1v1 * q2v1 - q1v2 * q2v2; // w * w' - v * v'
		
		res[0] = rv0;
		res[1] = rv1;
		res[2] = rv2;
		res[3] = rv3;
		
		return res;
	}
	
	public static float[] mul(float q1v0, float q1v1, float q1v2, float q1v3, ITup4RF q2, @ExtractionParam float[] res)
	{
		float q2v0 = q2.v0();
		float q2v1 = q2.v1();
		float q2v2 = q2.v2();
		float q2v3 = q2.v3();
		
		/*
		 * Mutliplication happens for (v1; w1) * (v2; w2) by:
		 * 
		 * (w1 * v2 + w2 * v1 + v1 x v2; w1 * w2 + (-v1) . v2)
		 */
		
		float rv0 = q1v3 * q2v0 + q2v3 * q1v0 + q1v1 * q2v2 - q1v2 * q2v1;  // s * v'.x + s' * v.x + (V x V').x
		float rv1 = q1v3 * q2v1 + q2v3 * q1v1 + q1v2 * q2v0 - q1v0 * q2v2; // s * v'.y + s' * v.y + (V x V').y
		float rv2 = q1v3 * q2v2 + q2v3 * q1v2 + q1v0 * q2v1 - q1v1 * q2v0;  // s * v'.z + s' * v.z + (V x V').z
		float rv3 = q1v3 * q2v3 - q1v0 * q2v0 - q1v1 * q2v1 - q1v2 * q2v2; // w * w' - v * v'
		
		res[0] = rv0;
		res[1] = rv1;
		res[2] = rv2;
		res[3] = rv3;
		
		return res;
	}
	
	public static float[] mul(float q1v0, float q1v1, float q1v2, float q1v3, float[] q2, @ExtractionParam float[] res)
	{
		float q2v0 = q2[0];
		float q2v1 = q2[1];
		float q2v2 = q2[2];
		float q2v3 = q2[3];
		
		/*
		 * Mutliplication happens for (v1; w1) * (v2; w2) by:
		 * 
		 * (w1 * v2 + w2 * v1 + v1 x v2; w1 * w2 + (-v1) . v2)
		 */
		
		float rv0 = q1v3 * q2v0 + q2v3 * q1v0 + q1v1 * q2v2 - q1v2 * q2v1;  // s * v'.x + s' * v.x + (V x V').x
		float rv1 = q1v3 * q2v1 + q2v3 * q1v1 + q1v2 * q2v0 - q1v0 * q2v2; // s * v'.y + s' * v.y + (V x V').y
		float rv2 = q1v3 * q2v2 + q2v3 * q1v2 + q1v0 * q2v1 - q1v1 * q2v0;  // s * v'.z + s' * v.z + (V x V').z
		float rv3 = q1v3 * q2v3 - q1v0 * q2v0 - q1v1 * q2v1 - q1v2 * q2v2; // w * w' - v * v'
		
		res[0] = rv0;
		res[1] = rv1;
		res[2] = rv2;
		res[3] = rv3;
		
		return res;
	}
	
	public static float[] mul(float q1v0, float q1v1, float q1v2, float q1v3, float q2v0, float q2v1, float q2v2, float q2v3, @ExtractionParam float[] res)
	{
		/*
		 * Mutliplication happens for (v1; w1) * (v2; w2) by:
		 * 
		 * (w1 * v2 + w2 * v1 + v1 x v2; w1 * w2 + (-v1) . v2)
		 */
		
		float rv0 = q1v3 * q2v0 + q2v3 * q1v0 + q1v1 * q2v2 - q1v2 * q2v1;  // s * v'.x + s' * v.x + (V x V').x
		float rv1 = q1v3 * q2v1 + q2v3 * q1v1 + q1v2 * q2v0 - q1v0 * q2v2; // s * v'.y + s' * v.y + (V x V').y
		float rv2 = q1v3 * q2v2 + q2v3 * q1v2 + q1v0 * q2v1 - q1v1 * q2v0;  // s * v'.z + s' * v.z + (V x V').z
		float rv3 = q1v3 * q2v3 - q1v0 * q2v0 - q1v1 * q2v1 - q1v2 * q2v2; // w * w' - v * v'
		
		res[0] = rv0;
		res[1] = rv1;
		res[2] = rv2;
		res[3] = rv3;
		
		return res;
	}
	
	public static <T extends ITup4WF> T mul(ITup4RF q1, ITup4RF q2, @ExtractionParam T res)
	{
		float q1v0 = q1.v0();
		float q1v1 = q1.v1();
		float q1v2 = q1.v2();
		float q1v3 = q1.v3();
		
		float q2v0 = q2.v0();
		float q2v1 = q2.v1();
		float q2v2 = q2.v2();
		float q2v3 = q2.v3();
		
		/*
		 * Mutliplication happens for (v1; w1) * (v2; w2) by:
		 * 
		 * (w1 * v2 + w2 * v1 + v1 x v2; w1 * w2 + (-v1) . v2)
		 */
		
		float rv0 = q1v3 * q2v0 + q2v3 * q1v0 + q1v1 * q2v2 - q1v2 * q2v1;  // s * v'.x + s' * v.x + (V x V').x
		float rv1 = q1v3 * q2v1 + q2v3 * q1v1 + q1v2 * q2v0 - q1v0 * q2v2; // s * v'.y + s' * v.y + (V x V').y
		float rv2 = q1v3 * q2v2 + q2v3 * q1v2 + q1v0 * q2v1 - q1v1 * q2v0;  // s * v'.z + s' * v.z + (V x V').z
		float rv3 = q1v3 * q2v3 - q1v0 * q2v0 - q1v1 * q2v1 - q1v2 * q2v2; // w * w' - v * v'
		
		res.set(rv0, rv1, rv2, rv3);
		
		return res;
	}
	
	public static <T extends ITup4WF> T mul(ITup4RF q1, float[] q2, @ExtractionParam T res)
	{
		float q1v0 = q1.v0();
		float q1v1 = q1.v1();
		float q1v2 = q1.v2();
		float q1v3 = q1.v3();
		
		float q2v0 = q2[0];
		float q2v1 = q2[1];
		float q2v2 = q2[2];
		float q2v3 = q2[3];
		
		/*
		 * Mutliplication happens for (v1; w1) * (v2; w2) by:
		 * 
		 * (w1 * v2 + w2 * v1 + v1 x v2; w1 * w2 + (-v1) . v2)
		 */
		
		float rv0 = q1v3 * q2v0 + q2v3 * q1v0 + q1v1 * q2v2 - q1v2 * q2v1;  // s * v'.x + s' * v.x + (V x V').x
		float rv1 = q1v3 * q2v1 + q2v3 * q1v1 + q1v2 * q2v0 - q1v0 * q2v2; // s * v'.y + s' * v.y + (V x V').y
		float rv2 = q1v3 * q2v2 + q2v3 * q1v2 + q1v0 * q2v1 - q1v1 * q2v0;  // s * v'.z + s' * v.z + (V x V').z
		float rv3 = q1v3 * q2v3 - q1v0 * q2v0 - q1v1 * q2v1 - q1v2 * q2v2; // w * w' - v * v'
		
		res.set(rv0, rv1, rv2, rv3);
		
		return res;
	}
	
	public static <T extends ITup4WF> T mul(ITup4RF q1, float q2v0, float q2v1, float q2v2, float q2v3, @ExtractionParam T res)
	{
		float q1v0 = q1.v0();
		float q1v1 = q1.v1();
		float q1v2 = q1.v2();
		float q1v3 = q1.v3();
		
		/*
		 * Mutliplication happens for (v1; w1) * (v2; w2) by:
		 * 
		 * (w1 * v2 + w2 * v1 + v1 x v2; w1 * w2 + (-v1) . v2)
		 */
		
		float rv0 = q1v3 * q2v0 + q2v3 * q1v0 + q1v1 * q2v2 - q1v2 * q2v1;  // s * v'.x + s' * v.x + (V x V').x
		float rv1 = q1v3 * q2v1 + q2v3 * q1v1 + q1v2 * q2v0 - q1v0 * q2v2; // s * v'.y + s' * v.y + (V x V').y
		float rv2 = q1v3 * q2v2 + q2v3 * q1v2 + q1v0 * q2v1 - q1v1 * q2v0;  // s * v'.z + s' * v.z + (V x V').z
		float rv3 = q1v3 * q2v3 - q1v0 * q2v0 - q1v1 * q2v1 - q1v2 * q2v2; // w * w' - v * v'
		
		res.set(rv0, rv1, rv2, rv3);
		
		return res;
	}
	
	public static <T extends ITup4WF> T mul(float[] q1, ITup4RF q2, @ExtractionParam T res)
	{
		float q1v0 = q1[0];
		float q1v1 = q1[1];
		float q1v2 = q1[2];
		float q1v3 = q1[3];
		
		float q2v0 = q2.v0();
		float q2v1 = q2.v1();
		float q2v2 = q2.v2();
		float q2v3 = q2.v3();
		
		/*
		 * Mutliplication happens for (v1; w1) * (v2; w2) by:
		 * 
		 * (w1 * v2 + w2 * v1 + v1 x v2; w1 * w2 + (-v1) . v2)
		 */
		
		float rv0 = q1v3 * q2v0 + q2v3 * q1v0 + q1v1 * q2v2 - q1v2 * q2v1;  // s * v'.x + s' * v.x + (V x V').x
		float rv1 = q1v3 * q2v1 + q2v3 * q1v1 + q1v2 * q2v0 - q1v0 * q2v2; // s * v'.y + s' * v.y + (V x V').y
		float rv2 = q1v3 * q2v2 + q2v3 * q1v2 + q1v0 * q2v1 - q1v1 * q2v0;  // s * v'.z + s' * v.z + (V x V').z
		float rv3 = q1v3 * q2v3 - q1v0 * q2v0 - q1v1 * q2v1 - q1v2 * q2v2; // w * w' - v * v'
		
		res.set(rv0, rv1, rv2, rv3);
		
		return res;
	}
	
	public static <T extends ITup4WF> T mul(float[] q1, float[] q2, @ExtractionParam T res)
	{
		float q1v0 = q1[0];
		float q1v1 = q1[1];
		float q1v2 = q1[2];
		float q1v3 = q1[3];
		
		float q2v0 = q2[0];
		float q2v1 = q2[1];
		float q2v2 = q2[2];
		float q2v3 = q2[3];
		
		/*
		 * Mutliplication happens for (v1; w1) * (v2; w2) by:
		 * 
		 * (w1 * v2 + w2 * v1 + v1 x v2; w1 * w2 + (-v1) . v2)
		 */
		
		float rv0 = q1v3 * q2v0 + q2v3 * q1v0 + q1v1 * q2v2 - q1v2 * q2v1;  // s * v'.x + s' * v.x + (V x V').x
		float rv1 = q1v3 * q2v1 + q2v3 * q1v1 + q1v2 * q2v0 - q1v0 * q2v2; // s * v'.y + s' * v.y + (V x V').y
		float rv2 = q1v3 * q2v2 + q2v3 * q1v2 + q1v0 * q2v1 - q1v1 * q2v0;  // s * v'.z + s' * v.z + (V x V').z
		float rv3 = q1v3 * q2v3 - q1v0 * q2v0 - q1v1 * q2v1 - q1v2 * q2v2; // w * w' - v * v'
		
		res.set(rv0, rv1, rv2, rv3);
		
		return res;
	}
	
	public static <T extends ITup4WF> T mul(float[] q1, float q2v0, float q2v1, float q2v2, float q2v3, @ExtractionParam T res)
	{
		float q1v0 = q1[0];
		float q1v1 = q1[1];
		float q1v2 = q1[2];
		float q1v3 = q1[3];
		
		/*
		 * Mutliplication happens for (v1; w1) * (v2; w2) by:
		 * 
		 * (w1 * v2 + w2 * v1 + v1 x v2; w1 * w2 + (-v1) . v2)
		 */
		
		float rv0 = q1v3 * q2v0 + q2v3 * q1v0 + q1v1 * q2v2 - q1v2 * q2v1;  // s * v'.x + s' * v.x + (V x V').x
		float rv1 = q1v3 * q2v1 + q2v3 * q1v1 + q1v2 * q2v0 - q1v0 * q2v2; // s * v'.y + s' * v.y + (V x V').y
		float rv2 = q1v3 * q2v2 + q2v3 * q1v2 + q1v0 * q2v1 - q1v1 * q2v0;  // s * v'.z + s' * v.z + (V x V').z
		float rv3 = q1v3 * q2v3 - q1v0 * q2v0 - q1v1 * q2v1 - q1v2 * q2v2; // w * w' - v * v'
		
		res.set(rv0, rv1, rv2, rv3);
		
		return res;
	}
	
	public static <T extends ITup4WF> T mul(float q1v0, float q1v1, float q1v2, float q1v3, ITup4RF q2, @ExtractionParam T res)
	{
		float q2v0 = q2.v0();
		float q2v1 = q2.v1();
		float q2v2 = q2.v2();
		float q2v3 = q2.v3();
		
		/*
		 * Mutliplication happens for (v1; w1) * (v2; w2) by:
		 * 
		 * (w1 * v2 + w2 * v1 + v1 x v2; w1 * w2 + (-v1) . v2)
		 */
		
		float rv0 = q1v3 * q2v0 + q2v3 * q1v0 + q1v1 * q2v2 - q1v2 * q2v1;  // s * v'.x + s' * v.x + (V x V').x
		float rv1 = q1v3 * q2v1 + q2v3 * q1v1 + q1v2 * q2v0 - q1v0 * q2v2; // s * v'.y + s' * v.y + (V x V').y
		float rv2 = q1v3 * q2v2 + q2v3 * q1v2 + q1v0 * q2v1 - q1v1 * q2v0;  // s * v'.z + s' * v.z + (V x V').z
		float rv3 = q1v3 * q2v3 - q1v0 * q2v0 - q1v1 * q2v1 - q1v2 * q2v2; // w * w' - v * v'
		
		res.set(rv0, rv1, rv2, rv3);
		
		return res;
	}
	
	public static <T extends ITup4WF> T mul(float q1v0, float q1v1, float q1v2, float q1v3, float[] q2, @ExtractionParam T res)
	{
		float q2v0 = q2[0];
		float q2v1 = q2[1];
		float q2v2 = q2[2];
		float q2v3 = q2[3];
		
		/*
		 * Mutliplication happens for (v1; w1) * (v2; w2) by:
		 * 
		 * (w1 * v2 + w2 * v1 + v1 x v2; w1 * w2 + (-v1) . v2)
		 */
		
		float rv0 = q1v3 * q2v0 + q2v3 * q1v0 + q1v1 * q2v2 - q1v2 * q2v1;  // s * v'.x + s' * v.x + (V x V').x
		float rv1 = q1v3 * q2v1 + q2v3 * q1v1 + q1v2 * q2v0 - q1v0 * q2v2; // s * v'.y + s' * v.y + (V x V').y
		float rv2 = q1v3 * q2v2 + q2v3 * q1v2 + q1v0 * q2v1 - q1v1 * q2v0;  // s * v'.z + s' * v.z + (V x V').z
		float rv3 = q1v3 * q2v3 - q1v0 * q2v0 - q1v1 * q2v1 - q1v2 * q2v2; // w * w' - v * v'
		
		res.set(rv0, rv1, rv2, rv3);
		
		return res;
	}
	
	public static <T extends ITup4WF> T mul(float q1v0, float q1v1, float q1v2, float q1v3, float q2v0, float q2v1, float q2v2, float q2v3, @ExtractionParam T res)
	{
		/*
		 * Mutliplication happens for (v1; w1) * (v2; w2) by:
		 * 
		 * (w1 * v2 + w2 * v1 + v1 x v2; w1 * w2 + (-v1) . v2)
		 */
		
		float rv0 = q1v3 * q2v0 + q2v3 * q1v0 + q1v1 * q2v2 - q1v2 * q2v1;  // s * v'.x + s' * v.x + (V x V').x
		float rv1 = q1v3 * q2v1 + q2v3 * q1v1 + q1v2 * q2v0 - q1v0 * q2v2; // s * v'.y + s' * v.y + (V x V').y
		float rv2 = q1v3 * q2v2 + q2v3 * q1v2 + q1v0 * q2v1 - q1v1 * q2v0;  // s * v'.z + s' * v.z + (V x V').z
		float rv3 = q1v3 * q2v3 - q1v0 * q2v0 - q1v1 * q2v1 - q1v2 * q2v2; // w * w' - v * v'
		
		res.set(rv0, rv1, rv2, rv3);
		
		return res;
	}
	
	public static <T> T mul(ITup4RF q1, ITup4RF q2, IFunc4F<T> func)
	{
		float q1v0 = q1.v0();
		float q1v1 = q1.v1();
		float q1v2 = q1.v2();
		float q1v3 = q1.v3();
		
		float q2v0 = q2.v0();
		float q2v1 = q2.v1();
		float q2v2 = q2.v2();
		float q2v3 = q2.v3();
		
		/*
		 * Mutliplication happens for (v1; w1) * (v2; w2) by:
		 * 
		 * (w1 * v2 + w2 * v1 + v1 x v2; w1 * w2 + (-v1) . v2)
		 */
		
		float rv0 = q1v3 * q2v0 + q2v3 * q1v0 + q1v1 * q2v2 - q1v2 * q2v1;  // s * v'.x + s' * v.x + (V x V').x
		float rv1 = q1v3 * q2v1 + q2v3 * q1v1 + q1v2 * q2v0 - q1v0 * q2v2; // s * v'.y + s' * v.y + (V x V').y
		float rv2 = q1v3 * q2v2 + q2v3 * q1v2 + q1v0 * q2v1 - q1v1 * q2v0;  // s * v'.z + s' * v.z + (V x V').z
		float rv3 = q1v3 * q2v3 - q1v0 * q2v0 - q1v1 * q2v1 - q1v2 * q2v2; // w * w' - v * v'
		
		return func.apply(rv0, rv1, rv2, rv3);
	}
	
	public static <T> T mul(ITup4RF q1, float[] q2, IFunc4F<T> func)
	{
		float q1v0 = q1.v0();
		float q1v1 = q1.v1();
		float q1v2 = q1.v2();
		float q1v3 = q1.v3();
		
		float q2v0 = q2[0];
		float q2v1 = q2[1];
		float q2v2 = q2[2];
		float q2v3 = q2[3];
		
		/*
		 * Mutliplication happens for (v1; w1) * (v2; w2) by:
		 * 
		 * (w1 * v2 + w2 * v1 + v1 x v2; w1 * w2 + (-v1) . v2)
		 */
		
		float rv0 = q1v3 * q2v0 + q2v3 * q1v0 + q1v1 * q2v2 - q1v2 * q2v1;  // s * v'.x + s' * v.x + (V x V').x
		float rv1 = q1v3 * q2v1 + q2v3 * q1v1 + q1v2 * q2v0 - q1v0 * q2v2; // s * v'.y + s' * v.y + (V x V').y
		float rv2 = q1v3 * q2v2 + q2v3 * q1v2 + q1v0 * q2v1 - q1v1 * q2v0;  // s * v'.z + s' * v.z + (V x V').z
		float rv3 = q1v3 * q2v3 - q1v0 * q2v0 - q1v1 * q2v1 - q1v2 * q2v2; // w * w' - v * v'
		
		return func.apply(rv0, rv1, rv2, rv3);
	}
	
	public static <T> T mul(ITup4RF q1, float q2v0, float q2v1, float q2v2, float q2v3, IFunc4F<T> func)
	{
		float q1v0 = q1.v0();
		float q1v1 = q1.v1();
		float q1v2 = q1.v2();
		float q1v3 = q1.v3();
		
		/*
		 * Mutliplication happens for (v1; w1) * (v2; w2) by:
		 * 
		 * (w1 * v2 + w2 * v1 + v1 x v2; w1 * w2 + (-v1) . v2)
		 */
		
		float rv0 = q1v3 * q2v0 + q2v3 * q1v0 + q1v1 * q2v2 - q1v2 * q2v1;  // s * v'.x + s' * v.x + (V x V').x
		float rv1 = q1v3 * q2v1 + q2v3 * q1v1 + q1v2 * q2v0 - q1v0 * q2v2; // s * v'.y + s' * v.y + (V x V').y
		float rv2 = q1v3 * q2v2 + q2v3 * q1v2 + q1v0 * q2v1 - q1v1 * q2v0;  // s * v'.z + s' * v.z + (V x V').z
		float rv3 = q1v3 * q2v3 - q1v0 * q2v0 - q1v1 * q2v1 - q1v2 * q2v2; // w * w' - v * v'
		
		return func.apply(rv0, rv1, rv2, rv3);
	}
	
	public static <T> T mul(float[] q1, ITup4RF q2, IFunc4F<T> func)
	{
		float q1v0 = q1[0];
		float q1v1 = q1[1];
		float q1v2 = q1[2];
		float q1v3 = q1[3];
		
		float q2v0 = q2.v0();
		float q2v1 = q2.v1();
		float q2v2 = q2.v2();
		float q2v3 = q2.v3();
		
		/*
		 * Mutliplication happens for (v1; w1) * (v2; w2) by:
		 * 
		 * (w1 * v2 + w2 * v1 + v1 x v2; w1 * w2 + (-v1) . v2)
		 */
		
		float rv0 = q1v3 * q2v0 + q2v3 * q1v0 + q1v1 * q2v2 - q1v2 * q2v1;  // s * v'.x + s' * v.x + (V x V').x
		float rv1 = q1v3 * q2v1 + q2v3 * q1v1 + q1v2 * q2v0 - q1v0 * q2v2; // s * v'.y + s' * v.y + (V x V').y
		float rv2 = q1v3 * q2v2 + q2v3 * q1v2 + q1v0 * q2v1 - q1v1 * q2v0;  // s * v'.z + s' * v.z + (V x V').z
		float rv3 = q1v3 * q2v3 - q1v0 * q2v0 - q1v1 * q2v1 - q1v2 * q2v2; // w * w' - v * v'
		
		return func.apply(rv0, rv1, rv2, rv3);
	}
	
	public static <T> T mul(float[] q1, float[] q2, IFunc4F<T> func)
	{
		float q1v0 = q1[0];
		float q1v1 = q1[1];
		float q1v2 = q1[2];
		float q1v3 = q1[3];
		
		float q2v0 = q2[0];
		float q2v1 = q2[1];
		float q2v2 = q2[2];
		float q2v3 = q2[3];
		
		/*
		 * Mutliplication happens for (v1; w1) * (v2; w2) by:
		 * 
		 * (w1 * v2 + w2 * v1 + v1 x v2; w1 * w2 + (-v1) . v2)
		 */
		
		float rv0 = q1v3 * q2v0 + q2v3 * q1v0 + q1v1 * q2v2 - q1v2 * q2v1;  // s * v'.x + s' * v.x + (V x V').x
		float rv1 = q1v3 * q2v1 + q2v3 * q1v1 + q1v2 * q2v0 - q1v0 * q2v2; // s * v'.y + s' * v.y + (V x V').y
		float rv2 = q1v3 * q2v2 + q2v3 * q1v2 + q1v0 * q2v1 - q1v1 * q2v0;  // s * v'.z + s' * v.z + (V x V').z
		float rv3 = q1v3 * q2v3 - q1v0 * q2v0 - q1v1 * q2v1 - q1v2 * q2v2; // w * w' - v * v'
		
		return func.apply(rv0, rv1, rv2, rv3);
	}
	
	public static <T> T mul(float[] q1, float q2v0, float q2v1, float q2v2, float q2v3, IFunc4F<T> func)
	{
		float q1v0 = q1[0];
		float q1v1 = q1[1];
		float q1v2 = q1[2];
		float q1v3 = q1[3];
		
		/*
		 * Mutliplication happens for (v1; w1) * (v2; w2) by:
		 * 
		 * (w1 * v2 + w2 * v1 + v1 x v2; w1 * w2 + (-v1) . v2)
		 */
		
		float rv0 = q1v3 * q2v0 + q2v3 * q1v0 + q1v1 * q2v2 - q1v2 * q2v1;  // s * v'.x + s' * v.x + (V x V').x
		float rv1 = q1v3 * q2v1 + q2v3 * q1v1 + q1v2 * q2v0 - q1v0 * q2v2; // s * v'.y + s' * v.y + (V x V').y
		float rv2 = q1v3 * q2v2 + q2v3 * q1v2 + q1v0 * q2v1 - q1v1 * q2v0;  // s * v'.z + s' * v.z + (V x V').z
		float rv3 = q1v3 * q2v3 - q1v0 * q2v0 - q1v1 * q2v1 - q1v2 * q2v2; // w * w' - v * v'
		
		return func.apply(rv0, rv1, rv2, rv3);
	}
	
	public static <T> T mul(float q1v0, float q1v1, float q1v2, float q1v3, ITup4RF q2, IFunc4F<T> func)
	{
		float q2v0 = q2.v0();
		float q2v1 = q2.v1();
		float q2v2 = q2.v2();
		float q2v3 = q2.v3();
		
		/*
		 * Mutliplication happens for (v1; w1) * (v2; w2) by:
		 * 
		 * (w1 * v2 + w2 * v1 + v1 x v2; w1 * w2 + (-v1) . v2)
		 */
		
		float rv0 = q1v3 * q2v0 + q2v3 * q1v0 + q1v1 * q2v2 - q1v2 * q2v1;  // s * v'.x + s' * v.x + (V x V').x
		float rv1 = q1v3 * q2v1 + q2v3 * q1v1 + q1v2 * q2v0 - q1v0 * q2v2; // s * v'.y + s' * v.y + (V x V').y
		float rv2 = q1v3 * q2v2 + q2v3 * q1v2 + q1v0 * q2v1 - q1v1 * q2v0;  // s * v'.z + s' * v.z + (V x V').z
		float rv3 = q1v3 * q2v3 - q1v0 * q2v0 - q1v1 * q2v1 - q1v2 * q2v2; // w * w' - v * v'
		
		return func.apply(rv0, rv1, rv2, rv3);
	}
	
	public static <T> T mul(float q1v0, float q1v1, float q1v2, float q1v3, float[] q2, IFunc4F<T> func)
	{
		float q2v0 = q2[0];
		float q2v1 = q2[1];
		float q2v2 = q2[2];
		float q2v3 = q2[3];
		
		/*
		 * Mutliplication happens for (v1; w1) * (v2; w2) by:
		 * 
		 * (w1 * v2 + w2 * v1 + v1 x v2; w1 * w2 + (-v1) . v2)
		 */
		
		float rv0 = q1v3 * q2v0 + q2v3 * q1v0 + q1v1 * q2v2 - q1v2 * q2v1;  // s * v'.x + s' * v.x + (V x V').x
		float rv1 = q1v3 * q2v1 + q2v3 * q1v1 + q1v2 * q2v0 - q1v0 * q2v2; // s * v'.y + s' * v.y + (V x V').y
		float rv2 = q1v3 * q2v2 + q2v3 * q1v2 + q1v0 * q2v1 - q1v1 * q2v0;  // s * v'.z + s' * v.z + (V x V').z
		float rv3 = q1v3 * q2v3 - q1v0 * q2v0 - q1v1 * q2v1 - q1v2 * q2v2; // w * w' - v * v'
		
		return func.apply(rv0, rv1, rv2, rv3);
	}
	
	public static <T> T mul(float q1v0, float q1v1, float q1v2, float q1v3, float q2v0, float q2v1, float q2v2, float q2v3, IFunc4F<T> func)
	{
		/*
		 * Mutliplication happens for (v1; w1) * (v2; w2) by:
		 * 
		 * (w1 * v2 + w2 * v1 + v1 x v2; w1 * w2 + (-v1) . v2)
		 */
		
		float rv0 = q1v3 * q2v0 + q2v3 * q1v0 + q1v1 * q2v2 - q1v2 * q2v1;  // s * v'.x + s' * v.x + (V x V').x
		float rv1 = q1v3 * q2v1 + q2v3 * q1v1 + q1v2 * q2v0 - q1v0 * q2v2; // s * v'.y + s' * v.y + (V x V').y
		float rv2 = q1v3 * q2v2 + q2v3 * q1v2 + q1v0 * q2v1 - q1v1 * q2v0;  // s * v'.z + s' * v.z + (V x V').z
		float rv3 = q1v3 * q2v3 - q1v0 * q2v0 - q1v1 * q2v1 - q1v2 * q2v2; // w * w' - v * v'
		
		return func.apply(rv0, rv1, rv2, rv3);
	}
}
