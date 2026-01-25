package org.barghos.api.math.quaternion;

import org.barghos.annotation.ExtractionParam;
import org.barghos.core.math.MathUtils;

public class QuatOpsIF
{
	private QuatOpsIF() { }
	
	public static float squaredLength(IQuatRF q1)
	{
		float q1X = q1.x();
		float q1Y = q1.y();
		float q1Z = q1.z();
		float q1W = q1.w();
		
		return Math.fma(q1X, q1X, Math.fma(q1Y, q1Y, Math.fma(q1Z, q1Z, q1W * q1W)));
	}
	
	public static float length(IQuatRF q1)
	{
		float q1X = q1.x();
		float q1Y = q1.y();
		float q1Z = q1.z();
		float q1W = q1.w();
		
		return MathUtils.sqrt(Math.fma(q1X, q1X, Math.fma(q1Y, q1Y, Math.fma(q1Z, q1Z, q1W * q1W))));
	}
	
	public static float reciprocalSquaredLength(IQuatRF q1)
	{
		float q1X = q1.x();
		float q1Y = q1.y();
		float q1Z = q1.z();
		float q1W = q1.w();
		
		return 1.0f / (Math.fma(q1X, q1X, Math.fma(q1Y, q1Y, Math.fma(q1Z, q1Z, q1W * q1W))));
	}
	
	public static float reciprocalLength(IQuatRF q1)
	{
		float q1X = q1.x();
		float q1Y = q1.y();
		float q1Z = q1.z();
		float q1W = q1.w();
		
		return MathUtils.invSqrt(Math.fma(q1X, q1X, Math.fma(q1Y, q1Y, Math.fma(q1Z, q1Z, q1W * q1W))));
	}
	
	public static float dot(IQuatRF q1, IQuatRF q2)
	{	
		return Math.fma(q1.x(), q2.x(), Math.fma(q1.y(), q2.y(), Math.fma(q1.z(), q2.z(), q1.w() * q2.w())));
	}
	
	public static float dot(IQuatRF q1, float[] q2)
	{	
		return Math.fma(q1.x(), q2[0], Math.fma(q1.y(), q2[1], Math.fma(q1.z(), q2[2], q1.w() * q2[3])));
	}
	
	public static float dot(IQuatRF q1, float q2X, float q2Y, float q2Z, float q2W)
	{	
		return Math.fma(q1.x(), q2X, Math.fma(q1.y(), q2Y, Math.fma(q1.z(), q2Z, q1.w() * q2W)));
	}
	
	public static float dot(float[] q1, IQuatRF q2)
	{	
		return Math.fma(q1[0], q2.x(), Math.fma(q1[1], q2.y(), Math.fma(q1[2], q2.z(), q1[3] * q2.w())));
	}
	
	public static float dot(float q1X, float q1Y, float q1Z, float q1W, IQuatRF q2)
	{	
		return Math.fma(q1X, q2.x(), Math.fma(q1Y, q2.y(), Math.fma(q1Z, q2.z(), q1W * q2.w())));
	}
	
	public static float[] conjugate(IQuatRF q1, @ExtractionParam float[] res)
	{
		res[0] = -q1.x();
		res[1] = -q1.y();
		res[2] = -q1.z();
		res[3] =  q1.w();
		
		return res;
	}
	
	public static <T extends IQuatWF> T conjugate(IQuatRF q1, @ExtractionParam T res)
	{
		res.set(
			-q1.x(),
			-q1.y(),
			-q1.z(),
			q1.w()
		);
		
		return res;
	}
	
	public static <T extends IQuatWF> T conjugate(float[] q1, @ExtractionParam T res)
	{
		res.set(
			-q1[0],
			-q1[1],
			-q1[2],
			q1[3]
		);
		
		return res;
	}
	
	public static <T extends IQuatWF> T conjugate(float q1X, float q1Y, float q1Z, float q1W, @ExtractionParam T res)
	{
		res.set(
			-q1X,
			-q1Y,
			-q1Z,
			q1W
		);
		
		return res;
	}
	
	public static <T extends IQuatWF> T conjugateAssign(@ExtractionParam T q1)
	{
		q1.set(
			-q1.x(),
			-q1.y(),
			-q1.z(),
			q1.w()
		);
		
		return q1;
	}
	
	public static float[] inverse(IQuatRF q1, @ExtractionParam float[] res)
	{
		float q1X = q1.x();
		float q1Y = q1.y();
		float q1Z = q1.z();
		float q1W = q1.w();
		
		float recLength = MathUtils.invSqrt(Math.fma(q1X, q1X, Math.fma(q1Y, q1Y, Math.fma(q1Z, q1Z, q1W * q1W))));
		
		res[0] = -q1X * recLength;
		res[1] = -q1Y * recLength;
		res[2] = -q1Z * recLength;
		res[3] =  q1W * recLength;
		
		return res;
	}
	
	public static <T extends IQuatWF> T inverse(IQuatRF q1, @ExtractionParam T res)
	{
		float q1X = q1.x();
		float q1Y = q1.y();
		float q1Z = q1.z();
		float q1W = q1.w();
		
		float recLength = MathUtils.invSqrt(Math.fma(q1X, q1X, Math.fma(q1Y, q1Y, Math.fma(q1Z, q1Z, q1W * q1W))));
		
		res.set(
			-q1X * recLength,
			-q1Y * recLength,
			-q1Z * recLength,
			q1W * recLength
		);
		
		return res;
	}
	
	public static <T extends IQuatWF> T inverse(float[] q1, @ExtractionParam T res)
	{
		float q1X = q1[0];
		float q1Y = q1[1];
		float q1Z = q1[2];
		float q1W = q1[3];
		
		float recLength = MathUtils.invSqrt(Math.fma(q1X, q1X, Math.fma(q1Y, q1Y, Math.fma(q1Z, q1Z, q1W * q1W))));
		
		res.set(
			-q1X * recLength,
			-q1Y * recLength,
			-q1Z * recLength,
			q1W * recLength
		);
		
		return res;
	}
	
	public static <T extends IQuatWF> T inverse(float q1X, float q1Y, float q1Z, float q1W, @ExtractionParam T res)
	{
		float recLength = MathUtils.invSqrt(Math.fma(q1X, q1X, Math.fma(q1Y, q1Y, Math.fma(q1Z, q1Z, q1W * q1W))));
		
		res.set(
			-q1X * recLength,
			-q1Y * recLength,
			-q1Z * recLength,
			q1W * recLength
		);
		
		return res;
	}
	
	public static <T extends IQuatWF> T inverseAssign(@ExtractionParam T q1)
	{
		float q1X = q1.x();
		float q1Y = q1.y();
		float q1Z = q1.z();
		float q1W = q1.w();
		
		float recLength = MathUtils.invSqrt(Math.fma(q1X, q1X, Math.fma(q1Y, q1Y, Math.fma(q1Z, q1Z, q1W * q1W))));
		
		q1.set(
			-q1X * recLength,
			-q1Y * recLength,
			-q1Z * recLength,
			q1W * recLength
		);
		
		return q1;
	}
	
	public static float[] normalize(IQuatRF q1, @ExtractionParam float[] res)
	{
		float q1X = q1.x();
		float q1Y = q1.y();
		float q1Z = q1.z();
		float q1W = q1.w();
		
		float recLength = MathUtils.invSqrt(Math.fma(q1X, q1X, Math.fma(q1Y, q1Y, Math.fma(q1Z, q1Z, q1W * q1W))));
		
		res[0] = q1X * recLength;
		res[1] = q1Y * recLength;
		res[2] = q1Z * recLength;
		res[3] = q1W * recLength;
		
		return res;
	}
	
	public static <T extends IQuatWF> T normalize(IQuatRF q1, @ExtractionParam T res)
	{
		float q1X = q1.x();
		float q1Y = q1.y();
		float q1Z = q1.z();
		float q1W = q1.w();
		
		float recLength = MathUtils.invSqrt(Math.fma(q1X, q1X, Math.fma(q1Y, q1Y, Math.fma(q1Z, q1Z, q1W * q1W))));
		
		res.set(
			q1X * recLength,
			q1Y * recLength,
			q1Z * recLength,
			q1W * recLength
		);
		
		return res;
	}
	
	public static <T extends IQuatWF> T normalize(float[] q1, @ExtractionParam T res)
	{
		float q1X = q1[0];
		float q1Y = q1[1];
		float q1Z = q1[2];
		float q1W = q1[3];
		
		float recLength = MathUtils.invSqrt(Math.fma(q1X, q1X, Math.fma(q1Y, q1Y, Math.fma(q1Z, q1Z, q1W * q1W))));
		
		res.set(
			q1X * recLength,
			q1Y * recLength,
			q1Z * recLength,
			q1W * recLength
		);
		
		return res;
	}
	
	public static <T extends IQuatWF> T normalize(float q1X, float q1Y, float q1Z, float q1W, @ExtractionParam T res)
	{
		float recLength = MathUtils.invSqrt(Math.fma(q1X, q1X, Math.fma(q1Y, q1Y, Math.fma(q1Z, q1Z, q1W * q1W))));
		
		res.set(
			q1X * recLength,
			q1Y * recLength,
			q1Z * recLength,
			q1W * recLength
		);
		
		return res;
	}
	
	public static <T extends IQuatWF> T normalizeAssign(@ExtractionParam T q1)
	{
		float q1X = q1.x();
		float q1Y = q1.y();
		float q1Z = q1.z();
		float q1W = q1.w();
		
		float recLength = MathUtils.invSqrt(Math.fma(q1X, q1X, Math.fma(q1Y, q1Y, Math.fma(q1Z, q1Z, q1W * q1W))));
		
		q1.set(
			q1X * recLength,
			q1Y * recLength,
			q1Z * recLength,
			q1W * recLength
		);
		
		return q1;
	}
	
	public static float[] mul(IQuatRF q1, IQuatRF q2, @ExtractionParam float[] res)
	{
		float q1X = q1.x();
		float q1Y = q1.y();
		float q1Z = q1.z();
		float q1W = q1.w();
		
		float q2X = q2.x();
		float q2Y = q2.y();
		float q2Z = q2.z();
		float q2W = q2.w();
		
		/*
		 * Mutliplication happens for (v1; w1) * (v2; w2) by:
		 * 
		 * (w1 * v2 + w2 * v1 + v1 x v2; w1 * w2 + (-v1) . v2)
		 */
		
		float rX = Math.fma(q1W, q2X, Math.fma( q2W, q1X, Math.fma( q1Y, q2Z, -q1Z * q2Y)));  // s * v'.x + s' * v.x + (V x V').x
		float rY = Math.fma(q1W, q2Y, Math.fma( q2W, q1Y, Math.fma( q1Z, q2X, -q1X * q2Z))); // s * v'.y + s' * v.y + (V x V').y
		float rZ = Math.fma(q1W, q2Z, Math.fma( q2W, q1Z, Math.fma( q1X, q2Y, -q1Y * q2X)));  // s * v'.z + s' * v.z + (V x V').z
		float rW = Math.fma(q1W, q2W, Math.fma(-q1X, q2X, Math.fma(-q1Y, q2Y, -q1Z * q2Z))); // w * w' - v * v'
		
		res[0] = rX;
		res[1] = rY;
		res[2] = rZ;
		res[3] = rW;
		
		return res;
	}
	
	public static float[] mul(IQuatRF q1, float[] q2, @ExtractionParam float[] res)
	{
		float q1X = q1.x();
		float q1Y = q1.y();
		float q1Z = q1.z();
		float q1W = q1.w();
		
		float q2X = q2[0];
		float q2Y = q2[1];
		float q2Z = q2[2];
		float q2W = q2[3];
		
		/*
		 * Mutliplication happens for (v1; w1) * (v2; w2) by:
		 * 
		 * (w1 * v2 + w2 * v1 + v1 x v2; w1 * w2 + (-v1) . v2)
		 */
		
		float rX = Math.fma(q1W, q2X, Math.fma( q2W, q1X, Math.fma( q1Y, q2Z, -q1Z * q2Y)));  // s * v'.x + s' * v.x + (V x V').x
		float rY = Math.fma(q1W, q2Y, Math.fma( q2W, q1Y, Math.fma( q1Z, q2X, -q1X * q2Z))); // s * v'.y + s' * v.y + (V x V').y
		float rZ = Math.fma(q1W, q2Z, Math.fma( q2W, q1Z, Math.fma( q1X, q2Y, -q1Y * q2X)));  // s * v'.z + s' * v.z + (V x V').z
		float rW = Math.fma(q1W, q2W, Math.fma(-q1X, q2X, Math.fma(-q1Y, q2Y, -q1Z * q2Z))); // w * w' - v * v'
		
		res[0] = rX;
		res[1] = rY;
		res[2] = rZ;
		res[3] = rW;
		
		return res;
	}
	
	public static float[] mul(IQuatRF q1, float q2X, float q2Y, float q2Z, float q2W, @ExtractionParam float[] res)
	{
		float q1X = q1.x();
		float q1Y = q1.y();
		float q1Z = q1.z();
		float q1W = q1.w();
		
		/*
		 * Mutliplication happens for (v1; w1) * (v2; w2) by:
		 * 
		 * (w1 * v2 + w2 * v1 + v1 x v2; w1 * w2 + (-v1) . v2)
		 */
		
		float rX = Math.fma(q1W, q2X, Math.fma( q2W, q1X, Math.fma( q1Y, q2Z, -q1Z * q2Y)));  // s * v'.x + s' * v.x + (V x V').x
		float rY = Math.fma(q1W, q2Y, Math.fma( q2W, q1Y, Math.fma( q1Z, q2X, -q1X * q2Z))); // s * v'.y + s' * v.y + (V x V').y
		float rZ = Math.fma(q1W, q2Z, Math.fma( q2W, q1Z, Math.fma( q1X, q2Y, -q1Y * q2X)));  // s * v'.z + s' * v.z + (V x V').z
		float rW = Math.fma(q1W, q2W, Math.fma(-q1X, q2X, Math.fma(-q1Y, q2Y, -q1Z * q2Z))); // w * w' - v * v'
		
		res[0] = rX;
		res[1] = rY;
		res[2] = rZ;
		res[3] = rW;
		
		return res;
	}
	
	public static float[] mul(float[] q1, IQuatRF q2, @ExtractionParam float[] res)
	{
		float q1X = q1[0];
		float q1Y = q1[1];
		float q1Z = q1[2];
		float q1W = q1[3];
		
		float q2X = q2.x();
		float q2Y = q2.y();
		float q2Z = q2.z();
		float q2W = q2.w();
		
		/*
		 * Mutliplication happens for (v1; w1) * (v2; w2) by:
		 * 
		 * (w1 * v2 + w2 * v1 + v1 x v2; w1 * w2 + (-v1) . v2)
		 */
		
		float rX = Math.fma(q1W, q2X, Math.fma( q2W, q1X, Math.fma( q1Y, q2Z, -q1Z * q2Y)));  // s * v'.x + s' * v.x + (V x V').x
		float rY = Math.fma(q1W, q2Y, Math.fma( q2W, q1Y, Math.fma( q1Z, q2X, -q1X * q2Z))); // s * v'.y + s' * v.y + (V x V').y
		float rZ = Math.fma(q1W, q2Z, Math.fma( q2W, q1Z, Math.fma( q1X, q2Y, -q1Y * q2X)));  // s * v'.z + s' * v.z + (V x V').z
		float rW = Math.fma(q1W, q2W, Math.fma(-q1X, q2X, Math.fma(-q1Y, q2Y, -q1Z * q2Z))); // w * w' - v * v'
		
		res[0] = rX;
		res[1] = rY;
		res[2] = rZ;
		res[3] = rW;
		
		return res;
	}
	
	public static float[] mul(float q1X, float q1Y, float q1Z, float q1W, IQuatRF q2, @ExtractionParam float[] res)
	{
		float q2X = q2.x();
		float q2Y = q2.y();
		float q2Z = q2.z();
		float q2W = q2.w();
		
		/*
		 * Mutliplication happens for (v1; w1) * (v2; w2) by:
		 * 
		 * (w1 * v2 + w2 * v1 + v1 x v2; w1 * w2 + (-v1) . v2)
		 */
		
		float rX = Math.fma(q1W, q2X, Math.fma( q2W, q1X, Math.fma( q1Y, q2Z, -q1Z * q2Y)));  // s * v'.x + s' * v.x + (V x V').x
		float rY = Math.fma(q1W, q2Y, Math.fma( q2W, q1Y, Math.fma( q1Z, q2X, -q1X * q2Z))); // s * v'.y + s' * v.y + (V x V').y
		float rZ = Math.fma(q1W, q2Z, Math.fma( q2W, q1Z, Math.fma( q1X, q2Y, -q1Y * q2X)));  // s * v'.z + s' * v.z + (V x V').z
		float rW = Math.fma(q1W, q2W, Math.fma(-q1X, q2X, Math.fma(-q1Y, q2Y, -q1Z * q2Z))); // w * w' - v * v'
		
		res[0] = rX;
		res[1] = rY;
		res[2] = rZ;
		res[3] = rW;
		
		return res;
	}
	
	public static float[] mulAssign(@ExtractionParam float[] q1, IQuatRF q2)
	{
		float q1X = q1[0];
		float q1Y = q1[1];
		float q1Z = q1[2];
		float q1W = q1[3];
		
		float q2X = q2.x();
		float q2Y = q2.y();
		float q2Z = q2.z();
		float q2W = q2.w();
		
		/*
		 * Mutliplication happens for (v1; w1) * (v2; w2) by:
		 * 
		 * (w1 * v2 + w2 * v1 + v1 x v2; w1 * w2 + (-v1) . v2)
		 */
		
		float rX = Math.fma(q1W, q2X, Math.fma( q2W, q1X, Math.fma( q1Y, q2Z, -q1Z * q2Y)));  // s * v'.x + s' * v.x + (V x V').x
		float rY = Math.fma(q1W, q2Y, Math.fma( q2W, q1Y, Math.fma( q1Z, q2X, -q1X * q2Z))); // s * v'.y + s' * v.y + (V x V').y
		float rZ = Math.fma(q1W, q2Z, Math.fma( q2W, q1Z, Math.fma( q1X, q2Y, -q1Y * q2X)));  // s * v'.z + s' * v.z + (V x V').z
		float rW = Math.fma(q1W, q2W, Math.fma(-q1X, q2X, Math.fma(-q1Y, q2Y, -q1Z * q2Z))); // w * w' - v * v'
		
		q1[0] = rX;
		q1[1] = rY;
		q1[2] = rZ;
		q1[3] = rW;
		
		return q1;
	}
	
	public static <T extends IQuatWF> T mul(IQuatRF q1, IQuatRF q2, @ExtractionParam T res)
	{
		float q1X = q1.x();
		float q1Y = q1.y();
		float q1Z = q1.z();
		float q1W = q1.w();
		
		float q2X = q2.x();
		float q2Y = q2.y();
		float q2Z = q2.z();
		float q2W = q2.w();
		
		/*
		 * Mutliplication happens for (v1; w1) * (v2; w2) by:
		 * 
		 * (w1 * v2 + w2 * v1 + v1 x v2; w1 * w2 + (-v1) . v2)
		 */
		
		float rX = Math.fma(q1W, q2X, Math.fma( q2W, q1X, Math.fma( q1Y, q2Z, -q1Z * q2Y)));  // s * v'.x + s' * v.x + (V x V').x
		float rY = Math.fma(q1W, q2Y, Math.fma( q2W, q1Y, Math.fma( q1Z, q2X, -q1X * q2Z))); // s * v'.y + s' * v.y + (V x V').y
		float rZ = Math.fma(q1W, q2Z, Math.fma( q2W, q1Z, Math.fma( q1X, q2Y, -q1Y * q2X)));  // s * v'.z + s' * v.z + (V x V').z
		float rW = Math.fma(q1W, q2W, Math.fma(-q1X, q2X, Math.fma(-q1Y, q2Y, -q1Z * q2Z))); // w * w' - v * v'
		
		res.set(
			rX,
			rY,
			rZ,
			rW
		);
		
		return res;
	}
	
	public static <T extends IQuatWF> T mul(IQuatRF q1, float[] q2, @ExtractionParam T res)
	{
		float q1X = q1.x();
		float q1Y = q1.y();
		float q1Z = q1.z();
		float q1W = q1.w();
		
		float q2X = q2[0];
		float q2Y = q2[1];
		float q2Z = q2[2];
		float q2W = q2[3];
		
		/*
		 * Mutliplication happens for (v1; w1) * (v2; w2) by:
		 * 
		 * (w1 * v2 + w2 * v1 + v1 x v2; w1 * w2 + (-v1) . v2)
		 */
		
		float rX = Math.fma(q1W, q2X, Math.fma( q2W, q1X, Math.fma( q1Y, q2Z, -q1Z * q2Y)));  // s * v'.x + s' * v.x + (V x V').x
		float rY = Math.fma(q1W, q2Y, Math.fma( q2W, q1Y, Math.fma( q1Z, q2X, -q1X * q2Z))); // s * v'.y + s' * v.y + (V x V').y
		float rZ = Math.fma(q1W, q2Z, Math.fma( q2W, q1Z, Math.fma( q1X, q2Y, -q1Y * q2X)));  // s * v'.z + s' * v.z + (V x V').z
		float rW = Math.fma(q1W, q2W, Math.fma(-q1X, q2X, Math.fma(-q1Y, q2Y, -q1Z * q2Z))); // w * w' - v * v'
		
		res.set(
			rX,
			rY,
			rZ,
			rW
		);
		
		return res;
	}
	
	public static <T extends IQuatWF> T mul(IQuatRF q1, float q2X, float q2Y, float q2Z, float q2W, @ExtractionParam T res)
	{
		float q1X = q1.x();
		float q1Y = q1.y();
		float q1Z = q1.z();
		float q1W = q1.w();
		
		/*
		 * Mutliplication happens for (v1; w1) * (v2; w2) by:
		 * 
		 * (w1 * v2 + w2 * v1 + v1 x v2; w1 * w2 + (-v1) . v2)
		 */
		
		float rX = Math.fma(q1W, q2X, Math.fma( q2W, q1X, Math.fma( q1Y, q2Z, -q1Z * q2Y)));  // s * v'.x + s' * v.x + (V x V').x
		float rY = Math.fma(q1W, q2Y, Math.fma( q2W, q1Y, Math.fma( q1Z, q2X, -q1X * q2Z))); // s * v'.y + s' * v.y + (V x V').y
		float rZ = Math.fma(q1W, q2Z, Math.fma( q2W, q1Z, Math.fma( q1X, q2Y, -q1Y * q2X)));  // s * v'.z + s' * v.z + (V x V').z
		float rW = Math.fma(q1W, q2W, Math.fma(-q1X, q2X, Math.fma(-q1Y, q2Y, -q1Z * q2Z))); // w * w' - v * v'
		
		res.set(
			rX,
			rY,
			rZ,
			rW
		);
		
		return res;
	}
	
	public static <T extends IQuatWF> T mul(float[] q1, IQuatRF q2, @ExtractionParam T res)
	{
		float q1X = q1[0];
		float q1Y = q1[1];
		float q1Z = q1[2];
		float q1W = q1[3];
		
		float q2X = q2.x();
		float q2Y = q2.y();
		float q2Z = q2.z();
		float q2W = q2.w();
		
		/*
		 * Mutliplication happens for (v1; w1) * (v2; w2) by:
		 * 
		 * (w1 * v2 + w2 * v1 + v1 x v2; w1 * w2 + (-v1) . v2)
		 */
		
		float rX = Math.fma(q1W, q2X, Math.fma( q2W, q1X, Math.fma( q1Y, q2Z, -q1Z * q2Y)));  // s * v'.x + s' * v.x + (V x V').x
		float rY = Math.fma(q1W, q2Y, Math.fma( q2W, q1Y, Math.fma( q1Z, q2X, -q1X * q2Z))); // s * v'.y + s' * v.y + (V x V').y
		float rZ = Math.fma(q1W, q2Z, Math.fma( q2W, q1Z, Math.fma( q1X, q2Y, -q1Y * q2X)));  // s * v'.z + s' * v.z + (V x V').z
		float rW = Math.fma(q1W, q2W, Math.fma(-q1X, q2X, Math.fma(-q1Y, q2Y, -q1Z * q2Z))); // w * w' - v * v'
		
		res.set(
			rX,
			rY,
			rZ,
			rW
		);
		
		return res;
	}
	
	public static <T extends IQuatWF> T mul(float[] q1, float[] q2, @ExtractionParam T res)
	{
		float q1X = q1[0];
		float q1Y = q1[1];
		float q1Z = q1[2];
		float q1W = q1[3];
		
		float q2X = q2[0];
		float q2Y = q2[1];
		float q2Z = q2[2];
		float q2W = q2[3];
		
		/*
		 * Mutliplication happens for (v1; w1) * (v2; w2) by:
		 * 
		 * (w1 * v2 + w2 * v1 + v1 x v2; w1 * w2 + (-v1) . v2)
		 */
		
		float rX = Math.fma(q1W, q2X, Math.fma( q2W, q1X, Math.fma( q1Y, q2Z, -q1Z * q2Y)));  // s * v'.x + s' * v.x + (V x V').x
		float rY = Math.fma(q1W, q2Y, Math.fma( q2W, q1Y, Math.fma( q1Z, q2X, -q1X * q2Z))); // s * v'.y + s' * v.y + (V x V').y
		float rZ = Math.fma(q1W, q2Z, Math.fma( q2W, q1Z, Math.fma( q1X, q2Y, -q1Y * q2X)));  // s * v'.z + s' * v.z + (V x V').z
		float rW = Math.fma(q1W, q2W, Math.fma(-q1X, q2X, Math.fma(-q1Y, q2Y, -q1Z * q2Z))); // w * w' - v * v'
		
		res.set(
			rX,
			rY,
			rZ,
			rW
		);
		
		return res;
	}
	
	public static <T extends IQuatWF> T mul(float[] q1, float q2X, float q2Y, float q2Z, float q2W, @ExtractionParam T res)
	{
		float q1X = q1[0];
		float q1Y = q1[1];
		float q1Z = q1[2];
		float q1W = q1[3];
		
		/*
		 * Mutliplication happens for (v1; w1) * (v2; w2) by:
		 * 
		 * (w1 * v2 + w2 * v1 + v1 x v2; w1 * w2 + (-v1) . v2)
		 */
		
		float rX = Math.fma(q1W, q2X, Math.fma( q2W, q1X, Math.fma( q1Y, q2Z, -q1Z * q2Y)));  // s * v'.x + s' * v.x + (V x V').x
		float rY = Math.fma(q1W, q2Y, Math.fma( q2W, q1Y, Math.fma( q1Z, q2X, -q1X * q2Z))); // s * v'.y + s' * v.y + (V x V').y
		float rZ = Math.fma(q1W, q2Z, Math.fma( q2W, q1Z, Math.fma( q1X, q2Y, -q1Y * q2X)));  // s * v'.z + s' * v.z + (V x V').z
		float rW = Math.fma(q1W, q2W, Math.fma(-q1X, q2X, Math.fma(-q1Y, q2Y, -q1Z * q2Z))); // w * w' - v * v'
		
		res.set(
			rX,
			rY,
			rZ,
			rW
		);
		
		return res;
	}
	
	public static <T extends IQuatWF> T mul(float q1X, float q1Y, float q1Z, float q1W, IQuatRF q2, @ExtractionParam T res)
	{
		float q2X = q2.x();
		float q2Y = q2.y();
		float q2Z = q2.z();
		float q2W = q2.w();
		
		/*
		 * Mutliplication happens for (v1; w1) * (v2; w2) by:
		 * 
		 * (w1 * v2 + w2 * v1 + v1 x v2; w1 * w2 + (-v1) . v2)
		 */
		
		float rX = Math.fma(q1W, q2X, Math.fma( q2W, q1X, Math.fma( q1Y, q2Z, -q1Z * q2Y)));  // s * v'.x + s' * v.x + (V x V').x
		float rY = Math.fma(q1W, q2Y, Math.fma( q2W, q1Y, Math.fma( q1Z, q2X, -q1X * q2Z))); // s * v'.y + s' * v.y + (V x V').y
		float rZ = Math.fma(q1W, q2Z, Math.fma( q2W, q1Z, Math.fma( q1X, q2Y, -q1Y * q2X)));  // s * v'.z + s' * v.z + (V x V').z
		float rW = Math.fma(q1W, q2W, Math.fma(-q1X, q2X, Math.fma(-q1Y, q2Y, -q1Z * q2Z))); // w * w' - v * v'
		
		res.set(
			rX,
			rY,
			rZ,
			rW
		);
		
		return res;
	}
	
	public static <T extends IQuatWF> T mul(float q1X, float q1Y, float q1Z, float q1W, float[] q2, @ExtractionParam T res)
	{
		float q2X = q2[0];
		float q2Y = q2[1];
		float q2Z = q2[2];
		float q2W = q2[3];
		
		/*
		 * Mutliplication happens for (v1; w1) * (v2; w2) by:
		 * 
		 * (w1 * v2 + w2 * v1 + v1 x v2; w1 * w2 + (-v1) . v2)
		 */
		
		float rX = Math.fma(q1W, q2X, Math.fma( q2W, q1X, Math.fma( q1Y, q2Z, -q1Z * q2Y)));  // s * v'.x + s' * v.x + (V x V').x
		float rY = Math.fma(q1W, q2Y, Math.fma( q2W, q1Y, Math.fma( q1Z, q2X, -q1X * q2Z))); // s * v'.y + s' * v.y + (V x V').y
		float rZ = Math.fma(q1W, q2Z, Math.fma( q2W, q1Z, Math.fma( q1X, q2Y, -q1Y * q2X)));  // s * v'.z + s' * v.z + (V x V').z
		float rW = Math.fma(q1W, q2W, Math.fma(-q1X, q2X, Math.fma(-q1Y, q2Y, -q1Z * q2Z))); // w * w' - v * v'
		
		res.set(
			rX,
			rY,
			rZ,
			rW
		);
		
		return res;
	}
	
	public static <T extends IQuatWF> T mul(float q1X, float q1Y, float q1Z, float q1W, float q2X, float q2Y, float q2Z, float q2W, @ExtractionParam T res)
	{
		/*
		 * Mutliplication happens for (v1; w1) * (v2; w2) by:
		 * 
		 * (w1 * v2 + w2 * v1 + v1 x v2; w1 * w2 + (-v1) . v2)
		 */
		
		float rX = Math.fma(q1W, q2X, Math.fma( q2W, q1X, Math.fma( q1Y, q2Z, -q1Z * q2Y)));  // s * v'.x + s' * v.x + (V x V').x
		float rY = Math.fma(q1W, q2Y, Math.fma( q2W, q1Y, Math.fma( q1Z, q2X, -q1X * q2Z))); // s * v'.y + s' * v.y + (V x V').y
		float rZ = Math.fma(q1W, q2Z, Math.fma( q2W, q1Z, Math.fma( q1X, q2Y, -q1Y * q2X)));  // s * v'.z + s' * v.z + (V x V').z
		float rW = Math.fma(q1W, q2W, Math.fma(-q1X, q2X, Math.fma(-q1Y, q2Y, -q1Z * q2Z))); // w * w' - v * v'
		
		res.set(
			rX,
			rY,
			rZ,
			rW
		);
		
		return res;
	}
	
	public static <T extends IQuatWF> T mulAssign(@ExtractionParam T q1, IQuatRF q2)
	{
		float q1X = q1.x();
		float q1Y = q1.y();
		float q1Z = q1.z();
		float q1W = q1.w();
		
		float q2X = q2.x();
		float q2Y = q2.y();
		float q2Z = q2.z();
		float q2W = q2.w();
		
		/*
		 * Mutliplication happens for (v1; w1) * (v2; w2) by:
		 * 
		 * (w1 * v2 + w2 * v1 + v1 x v2; w1 * w2 + (-v1) . v2)
		 */
		
		float rX = Math.fma(q1W, q2X, Math.fma( q2W, q1X, Math.fma( q1Y, q2Z, -q1Z * q2Y)));  // s * v'.x + s' * v.x + (V x V').x
		float rY = Math.fma(q1W, q2Y, Math.fma( q2W, q1Y, Math.fma( q1Z, q2X, -q1X * q2Z))); // s * v'.y + s' * v.y + (V x V').y
		float rZ = Math.fma(q1W, q2Z, Math.fma( q2W, q1Z, Math.fma( q1X, q2Y, -q1Y * q2X)));  // s * v'.z + s' * v.z + (V x V').z
		float rW = Math.fma(q1W, q2W, Math.fma(-q1X, q2X, Math.fma(-q1Y, q2Y, -q1Z * q2Z))); // w * w' - v * v'
		
		q1.set(
			rX,
			rY,
			rZ,
			rW
		);
		
		return q1;
	}
	
	public static <T extends IQuatWF> T mulAssign(@ExtractionParam T q1, float[] q2)
	{
		float q1X = q1.x();
		float q1Y = q1.y();
		float q1Z = q1.z();
		float q1W = q1.w();
		
		float q2X = q2[0];
		float q2Y = q2[1];
		float q2Z = q2[2];
		float q2W = q2[3];
		
		/*
		 * Mutliplication happens for (v1; w1) * (v2; w2) by:
		 * 
		 * (w1 * v2 + w2 * v1 + v1 x v2; w1 * w2 + (-v1) . v2)
		 */
		
		float rX = Math.fma(q1W, q2X, Math.fma( q2W, q1X, Math.fma( q1Y, q2Z, -q1Z * q2Y)));  // s * v'.x + s' * v.x + (V x V').x
		float rY = Math.fma(q1W, q2Y, Math.fma( q2W, q1Y, Math.fma( q1Z, q2X, -q1X * q2Z))); // s * v'.y + s' * v.y + (V x V').y
		float rZ = Math.fma(q1W, q2Z, Math.fma( q2W, q1Z, Math.fma( q1X, q2Y, -q1Y * q2X)));  // s * v'.z + s' * v.z + (V x V').z
		float rW = Math.fma(q1W, q2W, Math.fma(-q1X, q2X, Math.fma(-q1Y, q2Y, -q1Z * q2Z))); // w * w' - v * v'
		
		q1.set(
			rX,
			rY,
			rZ,
			rW
		);
		
		return q1;
	}
	
	public static <T extends IQuatWF> T mulAssign(@ExtractionParam T q1, float q2X, float q2Y, float q2Z, float q2W)
	{
		float q1X = q1.x();
		float q1Y = q1.y();
		float q1Z = q1.z();
		float q1W = q1.w();
		
		/*
		 * Mutliplication happens for (v1; w1) * (v2; w2) by:
		 * 
		 * (w1 * v2 + w2 * v1 + v1 x v2; w1 * w2 + (-v1) . v2)
		 */
		
		float rX = Math.fma(q1W, q2X, Math.fma( q2W, q1X, Math.fma( q1Y, q2Z, -q1Z * q2Y)));  // s * v'.x + s' * v.x + (V x V').x
		float rY = Math.fma(q1W, q2Y, Math.fma( q2W, q1Y, Math.fma( q1Z, q2X, -q1X * q2Z))); // s * v'.y + s' * v.y + (V x V').y
		float rZ = Math.fma(q1W, q2Z, Math.fma( q2W, q1Z, Math.fma( q1X, q2Y, -q1Y * q2X)));  // s * v'.z + s' * v.z + (V x V').z
		float rW = Math.fma(q1W, q2W, Math.fma(-q1X, q2X, Math.fma(-q1Y, q2Y, -q1Z * q2Z))); // w * w' - v * v'
		
		q1.set(
			rX,
			rY,
			rZ,
			rW
		);
		
		return q1;
	}
	
	public static float[] revMul(IQuatRF q1, IQuatRF q2, @ExtractionParam float[] res)
	{
		float q1X = q1.x();
		float q1Y = q1.y();
		float q1Z = q1.z();
		float q1W = q1.w();
		
		float q2X = q2.x();
		float q2Y = q2.y();
		float q2Z = q2.z();
		float q2W = q2.w();
		
		float rX = Math.fma(q2W, q1X, Math.fma( q1W, q2X, Math.fma( q2Y, q1Z, -q2Z * q1Y)));
		float rY = Math.fma(q2W, q1Y, Math.fma( q1W, q2Y, Math.fma( q2Z, q1X, -q2X * q1Z)));
		float rZ = Math.fma(q2W, q1Z, Math.fma( q1W, q2Z, Math.fma( q2X, q1Y, -q2Y * q1X)));
		float rW = Math.fma(q2W, q1W, Math.fma(-q2X, q1X, Math.fma(-q2Y, q1Y, -q2Z * q1Z)));
		
		res[0] = rX;
		res[1] = rY;
		res[2] = rZ;
		res[3] = rW;
		
		return res;
	}
	
	public static float[] revMul(IQuatRF q1, float[] q2, @ExtractionParam float[] res)
	{
		float q1X = q1.x();
		float q1Y = q1.y();
		float q1Z = q1.z();
		float q1W = q1.w();
		
		float q2X = q2[0];
		float q2Y = q2[1];
		float q2Z = q2[2];
		float q2W = q2[3];
		
		float rX = Math.fma(q2W, q1X, Math.fma( q1W, q2X, Math.fma( q2Y, q1Z, -q2Z * q1Y)));
		float rY = Math.fma(q2W, q1Y, Math.fma( q1W, q2Y, Math.fma( q2Z, q1X, -q2X * q1Z)));
		float rZ = Math.fma(q2W, q1Z, Math.fma( q1W, q2Z, Math.fma( q2X, q1Y, -q2Y * q1X)));
		float rW = Math.fma(q2W, q1W, Math.fma(-q2X, q1X, Math.fma(-q2Y, q1Y, -q2Z * q1Z)));
		
		res[0] = rX;
		res[1] = rY;
		res[2] = rZ;
		res[3] = rW;
		
		return res;
	}
	
	public static float[] revMul(IQuatRF q1, float q2X, float q2Y, float q2Z, float q2W, @ExtractionParam float[] res)
	{
		float q1X = q1.x();
		float q1Y = q1.y();
		float q1Z = q1.z();
		float q1W = q1.w();
		
		float rX = Math.fma(q2W, q1X, Math.fma( q1W, q2X, Math.fma( q2Y, q1Z, -q2Z * q1Y)));
		float rY = Math.fma(q2W, q1Y, Math.fma( q1W, q2Y, Math.fma( q2Z, q1X, -q2X * q1Z)));
		float rZ = Math.fma(q2W, q1Z, Math.fma( q1W, q2Z, Math.fma( q2X, q1Y, -q2Y * q1X)));
		float rW = Math.fma(q2W, q1W, Math.fma(-q2X, q1X, Math.fma(-q2Y, q1Y, -q2Z * q1Z)));
		
		res[0] = rX;
		res[1] = rY;
		res[2] = rZ;
		res[3] = rW;
		
		return res;
	}
	
	public static float[] revMul(float[] q1, IQuatRF q2, @ExtractionParam float[] res)
	{
		float q1X = q1[0];
		float q1Y = q1[1];
		float q1Z = q1[2];
		float q1W = q1[3];
		
		float q2X = q2.x();
		float q2Y = q2.y();
		float q2Z = q2.z();
		float q2W = q2.w();
		
		float rX = Math.fma(q2W, q1X, Math.fma( q1W, q2X, Math.fma( q2Y, q1Z, -q2Z * q1Y)));
		float rY = Math.fma(q2W, q1Y, Math.fma( q1W, q2Y, Math.fma( q2Z, q1X, -q2X * q1Z)));
		float rZ = Math.fma(q2W, q1Z, Math.fma( q1W, q2Z, Math.fma( q2X, q1Y, -q2Y * q1X)));
		float rW = Math.fma(q2W, q1W, Math.fma(-q2X, q1X, Math.fma(-q2Y, q1Y, -q2Z * q1Z)));
		
		res[0] = rX;
		res[1] = rY;
		res[2] = rZ;
		res[3] = rW;
		
		return res;
	}
	
	public static float[] revMul(float q1X, float q1Y, float q1Z, float q1W, IQuatRF q2, @ExtractionParam float[] res)
	{
		float q2X = q2.x();
		float q2Y = q2.y();
		float q2Z = q2.z();
		float q2W = q2.w();
		
		float rX = Math.fma(q2W, q1X, Math.fma( q1W, q2X, Math.fma( q2Y, q1Z, -q2Z * q1Y)));
		float rY = Math.fma(q2W, q1Y, Math.fma( q1W, q2Y, Math.fma( q2Z, q1X, -q2X * q1Z)));
		float rZ = Math.fma(q2W, q1Z, Math.fma( q1W, q2Z, Math.fma( q2X, q1Y, -q2Y * q1X)));
		float rW = Math.fma(q2W, q1W, Math.fma(-q2X, q1X, Math.fma(-q2Y, q1Y, -q2Z * q1Z)));
		
		res[0] = rX;
		res[1] = rY;
		res[2] = rZ;
		res[3] = rW;
		
		return res;
	}
	
	public static float[] revMulAssign(@ExtractionParam float[] q1, IQuatRF q2)
	{
		float q1X = q1[0];
		float q1Y = q1[1];
		float q1Z = q1[2];
		float q1W = q1[3];
		
		float q2X = q2.x();
		float q2Y = q2.y();
		float q2Z = q2.z();
		float q2W = q2.w();
		
		float rX = Math.fma(q2W, q1X, Math.fma( q1W, q2X, Math.fma( q2Y, q1Z, -q2Z * q1Y)));
		float rY = Math.fma(q2W, q1Y, Math.fma( q1W, q2Y, Math.fma( q2Z, q1X, -q2X * q1Z)));
		float rZ = Math.fma(q2W, q1Z, Math.fma( q1W, q2Z, Math.fma( q2X, q1Y, -q2Y * q1X)));
		float rW = Math.fma(q2W, q1W, Math.fma(-q2X, q1X, Math.fma(-q2Y, q1Y, -q2Z * q1Z)));
		
		q1[0] = rX;
		q1[1] = rY;
		q1[2] = rZ;
		q1[3] = rW;
		
		return q1;
	}
	
	public static <T extends IQuatWF> T revMul(IQuatRF q1, IQuatRF q2, @ExtractionParam T res)
	{
		float q1X = q1.x();
		float q1Y = q1.y();
		float q1Z = q1.z();
		float q1W = q1.w();
		
		float q2X = q2.x();
		float q2Y = q2.y();
		float q2Z = q2.z();
		float q2W = q2.w();
		
		float rX = Math.fma(q2W, q1X, Math.fma( q1W, q2X, Math.fma( q2Y, q1Z, -q2Z * q1Y)));
		float rY = Math.fma(q2W, q1Y, Math.fma( q1W, q2Y, Math.fma( q2Z, q1X, -q2X * q1Z)));
		float rZ = Math.fma(q2W, q1Z, Math.fma( q1W, q2Z, Math.fma( q2X, q1Y, -q2Y * q1X)));
		float rW = Math.fma(q2W, q1W, Math.fma(-q2X, q1X, Math.fma(-q2Y, q1Y, -q2Z * q1Z)));
		
		res.set(
			rX,
			rY,
			rZ,
			rW
		);
		
		return res;
	}
	
	public static <T extends IQuatWF> T revMul(IQuatRF q1, float[] q2, @ExtractionParam T res)
	{
		float q1X = q1.x();
		float q1Y = q1.y();
		float q1Z = q1.z();
		float q1W = q1.w();
		
		float q2X = q2[0];
		float q2Y = q2[1];
		float q2Z = q2[2];
		float q2W = q2[3];
		
		float rX = Math.fma(q2W, q1X, Math.fma( q1W, q2X, Math.fma( q2Y, q1Z, -q2Z * q1Y)));
		float rY = Math.fma(q2W, q1Y, Math.fma( q1W, q2Y, Math.fma( q2Z, q1X, -q2X * q1Z)));
		float rZ = Math.fma(q2W, q1Z, Math.fma( q1W, q2Z, Math.fma( q2X, q1Y, -q2Y * q1X)));
		float rW = Math.fma(q2W, q1W, Math.fma(-q2X, q1X, Math.fma(-q2Y, q1Y, -q2Z * q1Z)));
		
		res.set(
			rX,
			rY,
			rZ,
			rW
		);
		
		return res;
	}
	
	public static <T extends IQuatWF> T revMul(IQuatRF q1, float q2X, float q2Y, float q2Z, float q2W, @ExtractionParam T res)
	{
		float q1X = q1.x();
		float q1Y = q1.y();
		float q1Z = q1.z();
		float q1W = q1.w();
		
		float rX = Math.fma(q2W, q1X, Math.fma( q1W, q2X, Math.fma( q2Y, q1Z, -q2Z * q1Y)));
		float rY = Math.fma(q2W, q1Y, Math.fma( q1W, q2Y, Math.fma( q2Z, q1X, -q2X * q1Z)));
		float rZ = Math.fma(q2W, q1Z, Math.fma( q1W, q2Z, Math.fma( q2X, q1Y, -q2Y * q1X)));
		float rW = Math.fma(q2W, q1W, Math.fma(-q2X, q1X, Math.fma(-q2Y, q1Y, -q2Z * q1Z)));
		
		res.set(
			rX,
			rY,
			rZ,
			rW
		);
		
		return res;
	}
	
	public static <T extends IQuatWF> T revMul(float[] q1, IQuatRF q2, @ExtractionParam T res)
	{
		float q1X = q1[0];
		float q1Y = q1[1];
		float q1Z = q1[2];
		float q1W = q1[3];
		
		float q2X = q2.x();
		float q2Y = q2.y();
		float q2Z = q2.z();
		float q2W = q2.w();
		
		float rX = Math.fma(q2W, q1X, Math.fma( q1W, q2X, Math.fma( q2Y, q1Z, -q2Z * q1Y)));
		float rY = Math.fma(q2W, q1Y, Math.fma( q1W, q2Y, Math.fma( q2Z, q1X, -q2X * q1Z)));
		float rZ = Math.fma(q2W, q1Z, Math.fma( q1W, q2Z, Math.fma( q2X, q1Y, -q2Y * q1X)));
		float rW = Math.fma(q2W, q1W, Math.fma(-q2X, q1X, Math.fma(-q2Y, q1Y, -q2Z * q1Z)));
		
		res.set(
			rX,
			rY,
			rZ,
			rW
		);
		
		return res;
	}
	
	public static <T extends IQuatWF> T revMul(float[] q1, float[] q2, @ExtractionParam T res)
	{
		float q1X = q1[0];
		float q1Y = q1[1];
		float q1Z = q1[2];
		float q1W = q1[3];
		
		float q2X = q2[0];
		float q2Y = q2[1];
		float q2Z = q2[2];
		float q2W = q2[3];
		
		float rX = Math.fma(q2W, q1X, Math.fma( q1W, q2X, Math.fma( q2Y, q1Z, -q2Z * q1Y)));
		float rY = Math.fma(q2W, q1Y, Math.fma( q1W, q2Y, Math.fma( q2Z, q1X, -q2X * q1Z)));
		float rZ = Math.fma(q2W, q1Z, Math.fma( q1W, q2Z, Math.fma( q2X, q1Y, -q2Y * q1X)));
		float rW = Math.fma(q2W, q1W, Math.fma(-q2X, q1X, Math.fma(-q2Y, q1Y, -q2Z * q1Z)));
		
		res.set(
			rX,
			rY,
			rZ,
			rW
		);
		
		return res;
	}
	
	public static <T extends IQuatWF> T revMul(float[] q1, float q2X, float q2Y, float q2Z, float q2W, @ExtractionParam T res)
	{
		float q1X = q1[0];
		float q1Y = q1[1];
		float q1Z = q1[2];
		float q1W = q1[3];
		
		float rX = Math.fma(q2W, q1X, Math.fma( q1W, q2X, Math.fma( q2Y, q1Z, -q2Z * q1Y)));
		float rY = Math.fma(q2W, q1Y, Math.fma( q1W, q2Y, Math.fma( q2Z, q1X, -q2X * q1Z)));
		float rZ = Math.fma(q2W, q1Z, Math.fma( q1W, q2Z, Math.fma( q2X, q1Y, -q2Y * q1X)));
		float rW = Math.fma(q2W, q1W, Math.fma(-q2X, q1X, Math.fma(-q2Y, q1Y, -q2Z * q1Z)));
		
		res.set(
			rX,
			rY,
			rZ,
			rW
		);
		
		return res;
	}
	
	public static <T extends IQuatWF> T revMul(float q1X, float q1Y, float q1Z, float q1W, IQuatRF q2, @ExtractionParam T res)
	{
		float q2X = q2.x();
		float q2Y = q2.y();
		float q2Z = q2.z();
		float q2W = q2.w();
		
		float rX = Math.fma(q2W, q1X, Math.fma( q1W, q2X, Math.fma( q2Y, q1Z, -q2Z * q1Y)));
		float rY = Math.fma(q2W, q1Y, Math.fma( q1W, q2Y, Math.fma( q2Z, q1X, -q2X * q1Z)));
		float rZ = Math.fma(q2W, q1Z, Math.fma( q1W, q2Z, Math.fma( q2X, q1Y, -q2Y * q1X)));
		float rW = Math.fma(q2W, q1W, Math.fma(-q2X, q1X, Math.fma(-q2Y, q1Y, -q2Z * q1Z)));
		
		res.set(
			rX,
			rY,
			rZ,
			rW
		);
		
		return res;
	}
	
	public static <T extends IQuatWF> T revMul(float q1X, float q1Y, float q1Z, float q1W, float[] q2, @ExtractionParam T res)
	{
		float q2X = q2[0];
		float q2Y = q2[1];
		float q2Z = q2[2];
		float q2W = q2[3];
		
		float rX = Math.fma(q2W, q1X, Math.fma( q1W, q2X, Math.fma( q2Y, q1Z, -q2Z * q1Y)));
		float rY = Math.fma(q2W, q1Y, Math.fma( q1W, q2Y, Math.fma( q2Z, q1X, -q2X * q1Z)));
		float rZ = Math.fma(q2W, q1Z, Math.fma( q1W, q2Z, Math.fma( q2X, q1Y, -q2Y * q1X)));
		float rW = Math.fma(q2W, q1W, Math.fma(-q2X, q1X, Math.fma(-q2Y, q1Y, -q2Z * q1Z)));
		
		res.set(
			rX,
			rY,
			rZ,
			rW
		);
		
		return res;
	}
	
	public static <T extends IQuatWF> T revMul(float q1X, float q1Y, float q1Z, float q1W, float q2X, float q2Y, float q2Z, float q2W, @ExtractionParam T res)
	{
		float rX = Math.fma(q2W, q1X, Math.fma( q1W, q2X, Math.fma( q2Y, q1Z, -q2Z * q1Y)));
		float rY = Math.fma(q2W, q1Y, Math.fma( q1W, q2Y, Math.fma( q2Z, q1X, -q2X * q1Z)));
		float rZ = Math.fma(q2W, q1Z, Math.fma( q1W, q2Z, Math.fma( q2X, q1Y, -q2Y * q1X)));
		float rW = Math.fma(q2W, q1W, Math.fma(-q2X, q1X, Math.fma(-q2Y, q1Y, -q2Z * q1Z)));
		
		res.set(
			rX,
			rY,
			rZ,
			rW
		);
		
		return res;
	}
	
	public static <T extends IQuatWF> T revMulAssign(@ExtractionParam T q1, IQuatRF q2)
	{
		float q1X = q1.x();
		float q1Y = q1.y();
		float q1Z = q1.z();
		float q1W = q1.w();
		
		float q2X = q2.x();
		float q2Y = q2.y();
		float q2Z = q2.z();
		float q2W = q2.w();
		
		float rX = Math.fma(q2W, q1X, Math.fma( q1W, q2X, Math.fma( q2Y, q1Z, -q2Z * q1Y)));
		float rY = Math.fma(q2W, q1Y, Math.fma( q1W, q2Y, Math.fma( q2Z, q1X, -q2X * q1Z)));
		float rZ = Math.fma(q2W, q1Z, Math.fma( q1W, q2Z, Math.fma( q2X, q1Y, -q2Y * q1X)));
		float rW = Math.fma(q2W, q1W, Math.fma(-q2X, q1X, Math.fma(-q2Y, q1Y, -q2Z * q1Z)));
		
		q1.set(
			rX,
			rY,
			rZ,
			rW
		);
		
		return q1;
	}
	
	public static <T extends IQuatWF> T revMulAssign(@ExtractionParam T q1, float[] q2)
	{
		float q1X = q1.x();
		float q1Y = q1.y();
		float q1Z = q1.z();
		float q1W = q1.w();
		
		float q2X = q2[0];
		float q2Y = q2[1];
		float q2Z = q2[2];
		float q2W = q2[3];
		
		float rX = Math.fma(q2W, q1X, Math.fma( q1W, q2X, Math.fma( q2Y, q1Z, -q2Z * q1Y)));
		float rY = Math.fma(q2W, q1Y, Math.fma( q1W, q2Y, Math.fma( q2Z, q1X, -q2X * q1Z)));
		float rZ = Math.fma(q2W, q1Z, Math.fma( q1W, q2Z, Math.fma( q2X, q1Y, -q2Y * q1X)));
		float rW = Math.fma(q2W, q1W, Math.fma(-q2X, q1X, Math.fma(-q2Y, q1Y, -q2Z * q1Z)));
		
		q1.set(
			rX,
			rY,
			rZ,
			rW
		);
		
		return q1;
	}
	
	public static <T extends IQuatWF> T revMulAssign(@ExtractionParam T q1, float q2X, float q2Y, float q2Z, float q2W)
	{
		float q1X = q1.x();
		float q1Y = q1.y();
		float q1Z = q1.z();
		float q1W = q1.w();
		
		float rX = Math.fma(q2W, q1X, Math.fma( q1W, q2X, Math.fma( q2Y, q1Z, -q2Z * q1Y)));
		float rY = Math.fma(q2W, q1Y, Math.fma( q1W, q2Y, Math.fma( q2Z, q1X, -q2X * q1Z)));
		float rZ = Math.fma(q2W, q1Z, Math.fma( q1W, q2Z, Math.fma( q2X, q1Y, -q2Y * q1X)));
		float rW = Math.fma(q2W, q1W, Math.fma(-q2X, q1X, Math.fma(-q2Y, q1Y, -q2Z * q1Z)));
		
		q1.set(
			rX,
			rY,
			rZ,
			rW
		);
		
		return q1;
	}
	
}
