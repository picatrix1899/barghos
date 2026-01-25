package org.barghos.math.vector.floats;

import org.barghos.annotation.ExtractionParam;
import org.barghos.api.core.collection.IndexValuePairF;
import org.barghos.core.math.MathUtils;

public final class BaseVecOps2F
{
	private BaseVecOps2F() { }
	
	public static float[] add(float[] v1, float[] v2, @ExtractionParam float[] res)
	{
		res[0] = v1[0] + v2[0];
		res[1] = v1[1] + v2[1];
		
		return res;
	}
	
	public static float[] add(float[] v1, float v2, @ExtractionParam float[] res)
	{
		res[0] = v1[0] + v2;
		res[1] = v1[1] + v2;
		
		return res;
	}
	
	public static float[] add(float[] v1, float v2X, float v2Y, @ExtractionParam float[] res)
	{
		res[0] = v1[0] + v2X;
		res[1] = v1[1] + v2Y;
		
		return res;
	}
	
	public static float[] add(float v1X, float v1Y, float[] v2, @ExtractionParam float[] res)
	{
		res[0] = v1X + v2[0];
		res[1] = v1Y + v2[1];
		
		return res;
	}
	
	public static float[] add(float v1X, float v1Y, float v2X, float v2Y, @ExtractionParam float[] res)
	{
		res[0] = v1X + v2X;
		res[1] = v1Y + v2Y;
		
		return res;
	}
	
	public static float[] addAssign(@ExtractionParam float[] v1, float[] v2)
	{
		v1[0] += v2[0];
		v1[1] += v2[1];
		
		return v1;
	}
	
	public static float[] addAssign(@ExtractionParam float[] v1, float v2)
	{
		v1[0] += v2;
		v1[1] += v2;
		
		return v1;
	}
	
	public static float[] addAssign(@ExtractionParam float[] v1, float v2X, float v2Y)
	{
		v1[0] += v2X;
		v1[1] += v2Y;
		
		return v1;
	}
	
	public static float[] sub(float[] v1, float[] v2, @ExtractionParam float[] res)
	{
		res[0] = v1[0] - v2[0];
		res[1] = v1[1] - v2[1];
		
		return res;
	}
	
	public static float[] sub(float[] v1, float v2, @ExtractionParam float[] res)
	{
		res[0] = v1[0] - v2;
		res[1] = v1[1] - v2;
		
		return res;
	}
	
	public static float[] sub(float[] v1, float v2X, float v2Y, @ExtractionParam float[] res)
	{
		res[0] = v1[0] - v2X;
		res[1] = v1[1] - v2Y;
		
		return res;
	}
	
	public static float[] sub(float v1X, float v1Y, float[] v2, @ExtractionParam float[] res)
	{
		res[0] = v1X - v2[0];
		res[1] = v1Y - v2[1];
		
		return res;
	}
	
	public static float[] sub(float v1X, float v1Y, float v2X, float v2Y, @ExtractionParam float[] res)
	{
		res[0] = v1X - v2X;
		res[1] = v1Y - v2Y;
		
		return res;
	}
	
	public static float[] subAssign(@ExtractionParam float[] v1, float[] v2)
	{
		v1[0] -= v2[0];
		v1[1] -= v2[1];
		
		return v1;
	}
	
	public static float[] subAssign(@ExtractionParam float[] v1, float v2)
	{
		v1[0] -= v2;
		v1[1] -= v2;
		
		return v1;
	}
	
	public static float[] subAssign(@ExtractionParam float[] v1, float v2X, float v2Y)
	{
		v1[0] -= v2X;
		v1[1] -= v2Y;
		
		return v1;
	}
	
	public static float[] revSub(float[] v1, float[] v2, @ExtractionParam float[] res)
	{
		res[0] = v2[0] - v1[0];
		res[1] = v2[1] - v1[1];
		
		return res;
	}
	
	public static float[] revSub(float[] v1, float v2, @ExtractionParam float[] res)
	{
		res[0] = v2 - v1[0];
		res[1] = v2 - v1[1];
		
		return res;
	}
	
	public static float[] revSub(float[] v1, float v2X, float v2Y, @ExtractionParam float[] res)
	{
		res[0] = v2X - v1[0];
		res[1] = v2Y - v1[1];
		
		return res;
	}
	
	public static float[] revSub(float v1X, float v1Y, float[] v2, @ExtractionParam float[] res)
	{
		res[0] = v2[0] - v1X;
		res[1] = v2[1] - v1Y;
		
		return res;
	}
	
	public static float[] revSub(float v1X, float v1Y, float v2X, float v2Y, @ExtractionParam float[] res)
	{
		res[0] = v2X - v1X;
		res[1] = v2Y - v1Y;
		
		return res;
	}
	
	public static float[] revSubAssign(@ExtractionParam float[] v1, float[] v2)
	{
		v1[0] = v2[0] - v1[0];
		v1[1] = v2[1] - v1[1];
		
		return v1;
	}
	
	public static float[] revSubAssign(@ExtractionParam float[] v1, float v2)
	{
		v1[0] = v2 - v1[0];
		v1[1] = v2 - v1[1];
		
		return v1;
	}
	
	public static float[] revSubAssign(@ExtractionParam float[] v1, float v2X, float v2Y)
	{
		v1[0] = v2X - v1[0];
		v1[1] = v2Y - v1[1];
		
		return v1;
	}
	
	public static float[] mul(float[] v1, float[] v2, @ExtractionParam float[] res)
	{
		res[0] = v1[0] * v2[0];
		res[1] = v1[1] * v2[1];
		
		return res;
	}
	
	public static float[] mul(float[] v1, float v2, @ExtractionParam float[] res)
	{
		res[0] = v1[0] * v2;
		res[1] = v1[1] * v2;
		
		return res;
	}
	
	public static float[] mul(float[] v1, float v2X, float v2Y, @ExtractionParam float[] res)
	{
		res[0] = v1[0] * v2X;
		res[1] = v1[1] * v2Y;
		
		return res;
	}
	
	public static float[] mul(float v1X, float v1Y, float[] v2, @ExtractionParam float[] res)
	{
		res[0] = v1X * v2[0];
		res[1] = v1Y * v2[1];
		
		return res;
	}
	
	public static float[] mul(float v1X, float v1Y, float v2X, float v2Y, @ExtractionParam float[] res)
	{
		res[0] = v1X * v2X;
		res[1] = v1Y * v2Y;
		
		return res;
	}
	
	public static float[] mulAssign(@ExtractionParam float[] v1, float[] v2)
	{
		v1[0] *= v2[0];
		v1[1] *= v2[1];
		
		return v1;
	}
	
	public static float[] mulAssign(@ExtractionParam float[] v1, float v2)
	{
		v1[0] *= v2;
		v1[1] *= v2;
		
		return v1;
	}
	
	public static float[] mulAssign(@ExtractionParam float[] v1, float v2X, float v2Y)
	{
		v1[0] *= v2X;
		v1[1] *= v2Y;
		
		return v1;
	}
	
	public static float[] div(float[] v1, float[] v2, @ExtractionParam float[] res)
	{
		res[0] = v1[0] / v2[0];
		res[1] = v1[1] / v2[1];
		
		return res;
	}
	
	public static float[] div(float[] v1, float v2, @ExtractionParam float[] res)
	{
		res[0] = v1[0] / v2;
		res[1] = v1[1] / v2;
		
		return res;
	}
	
	public static float[] div(float[] v1, float v2X, float v2Y, @ExtractionParam float[] res)
	{
		res[0] = v1[0] / v2X;
		res[1] = v1[1] / v2Y;
		
		return res;
	}
	
	public static float[] div(float v1X, float v1Y, float[] v2, @ExtractionParam float[] res)
	{
		res[0] = v1X / v2[0];
		res[1] = v1Y / v2[1];
		
		return res;
	}
	
	public static float[] div(float v1X, float v1Y, float v2X, float v2Y, @ExtractionParam float[] res)
	{
		res[0] = v1X / v2X;
		res[1] = v1Y / v2Y;
		
		return res;
	}
	
	public static float[] divAssign(@ExtractionParam float[] v1, float[] v2)
	{
		v1[0] /= v2[0];
		v1[1] /= v2[1];
		
		return v1;
	}
	
	public static float[] divAssign(@ExtractionParam float[] v1, float v2)
	{
		v1[0] /= v2;
		v1[1] /= v2;
		
		return v1;
	}
	
	public static float[] divAssign(@ExtractionParam float[] v1, float v2X, float v2Y)
	{
		v1[0] /= v2X;
		v1[1] /= v2Y;
		
		return v1;
	}
	
	public static float[] revDiv(float[] v1, float[] v2, @ExtractionParam float[] res)
	{
		res[0] = v2[0] / v1[0];
		res[1] = v2[1] / v1[1];
		
		return res;
	}
	
	public static float[] revDiv(float[] v1, float v2, @ExtractionParam float[] res)
	{
		res[0] = v2 / v1[0];
		res[1] = v2 / v1[1];
		
		return res;
	}
	
	public static float[] revDiv(float[] v1, float v2X, float v2Y, @ExtractionParam float[] res)
	{
		res[0] = v2X / v1[0];
		res[1] = v2Y / v1[1];
		
		return res;
	}
	
	public static float[] revDiv(float v1X, float v1Y, float[] v2, @ExtractionParam float[] res)
	{
		res[0] = v2[0] / v1X;
		res[1] = v2[1] / v1Y;
		
		return res;
	}
	
	public static float[] revDiv(float v1X, float v1Y, float v2X, float v2Y, @ExtractionParam float[] res)
	{
		res[0] = v2X / v1X;
		res[1] = v2Y / v1Y;
		
		return res;
	}
	
	public static float[] revDivAssign(@ExtractionParam float[] v1, float[] v2)
	{
		v1[0] = v2[0] / v1[0];
		v1[1] = v2[1] / v1[1];
		
		return v1;
	}
	
	public static float[] revDivAssign(@ExtractionParam float[] v1, float v2)
	{
		v1[0] = v2 / v1[0];
		v1[1] = v2 / v1[1];
		
		return v1;
	}
	
	public static float[] revDivAssign(@ExtractionParam float[] v1, float v2X, float v2Y)
	{
		v1[0] = v2X / v1[0];
		v1[1] = v2Y / v1[1];
		
		return v1;
	}
	
	public static float[] mulAdd(float[] v1, float[] v2, float[] v3, @ExtractionParam float[] res)
	{
		res[0] = Math.fma(v1[0], v2[0], v3[0]);
		res[1] = Math.fma(v1[1], v2[1], v3[1]);
		
		return res;
	}
	
	public static float[] mulAdd(float[] v1, float[] v2, float v3X, float v3Y, @ExtractionParam float[] res)
	{
		res[0] = Math.fma(v1[0], v2[0], v3X);
		res[1] = Math.fma(v1[1], v2[1], v3Y);
		
		return res;
	}
	
	public static float[] mulAdd(float[] v1, float v2X, float v2Y, float[] v3, @ExtractionParam float[] res)
	{
		res[0] = Math.fma(v1[0], v2X, v3[0]);
		res[1] = Math.fma(v1[1], v2Y, v3[1]);
		
		return res;
	}
	
	public static float[] mulAdd(float[] v1, float v2X, float v2Y, float v3X, float v3Y, @ExtractionParam float[] res)
	{
		res[0] = Math.fma(v1[0], v2X, v3X);
		res[1] = Math.fma(v1[1], v2Y, v3Y);
		
		return res;
	}
	
	public static float[] mulAdd(float v1X, float v1Y, float[] v2, float[] v3, @ExtractionParam float[] res)
	{
		res[0] = Math.fma(v1X, v2[0], v3[0]);
		res[1] = Math.fma(v1Y, v2[1], v3[1]);
		
		return res;
	}
	
	public static float[] mulAdd(float v1X, float v1Y, float[] v2, float v3X, float v3Y, @ExtractionParam float[] res)
	{
		res[0] = Math.fma(v1X, v2[0], v3X);
		res[1] = Math.fma(v1Y, v2[1], v3Y);
		
		return res;
	}
	
	public static float[] mulAdd(float v1X, float v1Y, float v2X, float v2Y, float[] v3, @ExtractionParam float[] res)
	{
		res[0] = Math.fma(v1X, v2X, v3[0]);
		res[1] = Math.fma(v1Y, v2Y, v3[1]);
		
		return res;
	}
	
	public static float[] mulAdd(float v1X, float v1Y, float v2X, float v2Y, float v3X, float v3Y, @ExtractionParam float[] res)
	{
		res[0] = Math.fma(v1X, v2X, v3X);
		res[1] = Math.fma(v1Y, v2Y, v3Y);
		
		return res;
	}
	
	public static float[] mulAddAssign(@ExtractionParam float[] v1, float[] v2, float[] v3)
	{
		v1[0] = Math.fma(v1[0], v2[0], v3[0]);
		v1[1] = Math.fma(v1[1], v2[1], v3[1]);
		
		return v1;
	}
	
	public static float[] mulAddAssign(@ExtractionParam float[] v1, float[] v2, float v3X, float v3Y)
	{
		v1[0] = Math.fma(v1[0], v2[0], v3X);
		v1[1] = Math.fma(v1[1], v2[1], v3Y);
		
		return v1;
	}
	
	public static float[] mulAddAssign(@ExtractionParam float[] v1, float v2X, float v2Y, float[] v3)
	{
		v1[0] = Math.fma(v1[0], v2X, v3[0]);
		v1[1] = Math.fma(v1[1], v2Y, v3[1]);
		
		return v1;
	}
	
	public static float[] mulAddAssign(@ExtractionParam float[] v1, float v2X, float v2Y, float v3X, float v3Y)
	{
		v1[0] = Math.fma(v1[0], v2X, v3X);
		v1[1] = Math.fma(v1[1], v2Y, v3Y);
		
		return v1;
	}
	
	public static float[] revMulAdd(float[] v1, float[] v2, float[] v3, @ExtractionParam float[] res)
	{
		res[0] = Math.fma(v2[0], v3[0], v1[0]);
		res[1] = Math.fma(v2[1], v3[1], v1[1]);
		
		return res;
	}
	
	public static float[] revMulAdd(float[] v1, float[] v2, float v3X, float v3Y, @ExtractionParam float[] res)
	{
		res[0] = Math.fma(v2[0], v3X, v1[0]);
		res[1] = Math.fma(v2[1], v3Y, v1[1]);
		
		return res;
	}
	
	public static float[] revMulAdd(float[] v1, float v2X, float v2Y, float[] v3, @ExtractionParam float[] res)
	{
		res[0] = Math.fma(v2X, v3[0], v1[0]);
		res[1] = Math.fma(v2Y, v3[1], v1[1]);
		
		return res;
	}
	
	public static float[] revMulAdd(float[] v1, float v2X, float v2Y, float v3X, float v3Y, @ExtractionParam float[] res)
	{
		res[0] = Math.fma(v2X, v3X, v1[0]);
		res[1] = Math.fma(v2Y, v3Y, v1[1]);
		
		return res;
	}
	
	public static float[] revMulAdd(float v1X, float v1Y, float[] v2, float[] v3, @ExtractionParam float[] res)
	{
		res[0] = Math.fma(v2[0], v3[0], v1X);
		res[1] = Math.fma(v2[1], v3[1], v1Y);
		
		return res;
	}
	
	public static float[] revMulAdd(float v1X, float v1Y, float[] v2, float v3X, float v3Y, @ExtractionParam float[] res)
	{
		res[0] = Math.fma(v2[0], v3X, v1X);
		res[1] = Math.fma(v2[1], v3Y, v1Y);
		
		return res;
	}
	
	public static float[] revMulAdd(float v1X, float v1Y, float v2X, float v2Y, float[] v3, @ExtractionParam float[] res)
	{
		res[0] = Math.fma(v2X, v3[0], v1X);
		res[1] = Math.fma(v2Y, v3[1], v1Y);
		
		return res;
	}
	
	public static float[] revMulAdd(float v1X, float v1Y, float v2X, float v2Y, float v3X, float v3Y, @ExtractionParam float[] res)
	{
		res[0] = Math.fma(v2X, v3X, v1X);
		res[1] = Math.fma(v2Y, v3Y, v1Y);
		
		return res;
	}
	
	public static float[] revMulAddAssign(@ExtractionParam float[] v1, float[] v2, float[] v3)
	{
		v1[0] = Math.fma(v2[0], v3[0], v1[0]);
		v1[1] = Math.fma(v2[1], v3[1], v1[1]);
		
		return v1;
	}
	
	public static float[] revMulAddAssign(@ExtractionParam float[] v1, float[] v2, float v3X, float v3Y)
	{
		v1[0] = Math.fma(v2[0], v3X, v1[0]);
		v1[1] = Math.fma(v2[1], v3Y, v1[1]);
		
		return v1;
	}
	
	public static float[] revMulAddAssign(@ExtractionParam float[] v1, float v2X, float v2Y, float[] v3)
	{
		v1[0] = Math.fma(v2X, v3[0], v1[0]);
		v1[1] = Math.fma(v2Y, v3[1], v1[1]);
		
		return v1;
	}
	
	public static float[] revMulAddAssign(@ExtractionParam float[] v1, float v2X, float v2Y, float v3X, float v3Y)
	{
		v1[0] = Math.fma(v2X, v3X, v1[0]);
		v1[1] = Math.fma(v2Y, v3Y, v1[1]);
		
		return v1;
	}
	
	public static float[] pow(float[] v1, float[] v2, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.pow(v1[0], v2[0]);
		res[1] = MathUtils.pow(v1[1], v2[1]);
		
		return res;
	}
	
	public static float[] pow(float[] v1, float v2, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.pow(v1[0], v2);
		res[1] = MathUtils.pow(v1[1], v2);
		
		return res;
	}
	
	public static float[] pow(float[] v1, float v2X, float v2Y, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.pow(v1[0], v2X);
		res[1] = MathUtils.pow(v1[1], v2Y);
		
		return res;
	}
	
	public static float[] pow(float v1X, float v1Y, float[] v2, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.pow(v1X, v2[0]);
		res[1] = MathUtils.pow(v1Y, v2[1]);
		
		return res;
	}
	
	public static float[] pow(float v1X, float v1Y, float v2X, float v2Y, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.pow(v1X, v2X);
		res[1] = MathUtils.pow(v1Y, v2Y);
		
		return res;
	}
	
	public static float[] powAssign(@ExtractionParam float[] v1, float[] v2)
	{
		v1[0] = MathUtils.pow(v1[0], v2[0]);
		v1[1] = MathUtils.pow(v1[1], v2[1]);
		
		return v1;
	}
	
	public static float[] powAssign(@ExtractionParam float[] v1, float v2)
	{
		v1[0] = MathUtils.pow(v1[0], v2);
		v1[1] = MathUtils.pow(v1[1], v2);
		
		return v1;
	}
	
	public static float[] powAssign(@ExtractionParam float[] v1, float v2X, float v2Y)
	{
		v1[0] = MathUtils.pow(v1[0], v2X);
		v1[1] = MathUtils.pow(v1[1], v2Y);
		
		return v1;
	}
	
	public static float[] revPow(float[] v1, float[] v2, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.pow(v2[0], v1[0]);
		res[1] = MathUtils.pow(v2[1], v1[1]);
		
		return res;
	}
	
	public static float[] revPow(float[] v1, float v2, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.pow(v2, v1[0]);
		res[1] = MathUtils.pow(v2, v1[1]);
		
		return res;
	}
	
	public static float[] revPow(float[] v1, float v2X, float v2Y, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.pow(v2X, v1[0]);
		res[1] = MathUtils.pow(v2Y, v1[1]);
		
		return res;
	}
	
	public static float[] revPow(float v1X, float v1Y, float[] v2, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.pow(v2[0], v1X);
		res[1] = MathUtils.pow(v2[1], v1Y);
		
		return res;
	}
	
	public static float[] revPow(float v1X, float v1Y, float v2X, float v2Y, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.pow(v2X, v1X);
		res[1] = MathUtils.pow(v2Y, v1Y);
		
		return res;
	}
	
	public static float[] revPowAssign(@ExtractionParam float[] v1, float[] v2)
	{
		v1[0] = MathUtils.pow(v2[0], v1[0]);
		v1[1] = MathUtils.pow(v2[1], v1[1]);
		
		return v1;
	}
	
	public static float[] revPowAssign(@ExtractionParam float[] v1, float v2)
	{
		v1[0] = MathUtils.pow(v2, v1[0]);
		v1[1] = MathUtils.pow(v2, v1[1]);
		
		return v1;
	}
	
	public static float[] revPowAssign(@ExtractionParam float[] v1, float v2X, float v2Y)
	{
		v1[0] = MathUtils.pow(v2X, v1[0]);
		v1[1] = MathUtils.pow(v2Y, v1[1]);
		
		return v1;
	}
	
	public static float[] sqrt(float[] v1, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.sqrt(v1[0]);
		res[1] = MathUtils.sqrt(v1[1]);
		
		return res;
	}
	
	public static float[] sqrt(float v1X, float v1Y, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.sqrt(v1X);
		res[1] = MathUtils.sqrt(v1Y);
		
		return res;
	}
	
	public static float[] sqrtAssign(@ExtractionParam float[] v1)
	{
		v1[0] = MathUtils.sqrt(v1[0]);
		v1[1] = MathUtils.sqrt(v1[1]);
		
		return v1;
	}
	
	public static float[] invSqrt(float[] v1, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.invSqrt(v1[0]);
		res[1] = MathUtils.invSqrt(v1[1]);
		
		return res;
	}
	
	public static float[] invSqrt(float v1X, float v1Y, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.invSqrt(v1X);
		res[1] = MathUtils.invSqrt(v1Y);
		
		return res;
	}
	
	public static float[] invSqrtAssign(@ExtractionParam float[] v1)
	{
		v1[0] = MathUtils.invSqrt(v1[0]);
		v1[1] = MathUtils.invSqrt(v1[1]);
		
		return v1;
	}
	
	public static float[] cbrt(float[] v1, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.cbrt(v1[0]);
		res[1] = MathUtils.cbrt(v1[1]);
		
		return res;
	}
	
	public static float[] cbrt(float v1X, float v1Y, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.cbrt(v1X);
		res[1] = MathUtils.cbrt(v1Y);
		
		return res;
	}
	
	public static float[] cbrtAssign(@ExtractionParam float[] v1)
	{
		v1[0] = MathUtils.cbrt(v1[0]);
		v1[1] = MathUtils.cbrt(v1[1]);
		
		return v1;
	}
	
	public static float[] invCbrt(float[] v1, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.invCbrt(v1[0]);
		res[1] = MathUtils.invCbrt(v1[1]);
		
		return res;
	}
	
	public static float[] invCbrt(float v1X, float v1Y, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.invCbrt(v1X);
		res[1] = MathUtils.invCbrt(v1Y);
		
		return res;
	}
	
	public static float[] invCbrtAssign(@ExtractionParam float[] v1)
	{
		v1[0] = MathUtils.invCbrt(v1[0]);
		v1[1] = MathUtils.invCbrt(v1[1]);
		
		return v1;
	}
	
	public static float[] abs(float[] v1, @ExtractionParam float[] res)
	{
		res[0] = Math.abs(v1[0]);
		res[1] = Math.abs(v1[1]);
		
		return res;
	}
	
	public static float[] abs(float v1X, float v1Y, @ExtractionParam float[] res)
	{
		res[0] = Math.abs(v1X);
		res[1] = Math.abs(v1Y);
		
		return res;
	}
	
	public static float[] absAssign(@ExtractionParam float[] v1)
	{
		v1[0] = Math.abs(v1[0]);
		v1[1] = Math.abs(v1[1]);
		
		return v1;
	}
	
	public static float[] reciprocal(float[] v1, @ExtractionParam float[] res)
	{
		res[0] = 1.0f / v1[0];
		res[1] = 1.0f / v1[1];
		
		return res;
	}
	
	public static float[] reciprocal(float v1X, float v1Y, @ExtractionParam float[] res)
	{
		res[0] = 1.0f / v1X;
		res[1] = 1.0f / v1Y;
		
		return res;
	}
	
	public static float[] reciprocalAssign(@ExtractionParam float[] v1)
	{
		v1[0] = 1.0f / v1[0];
		v1[1] = 1.0f / v1[1];
		
		return v1;
	}
	
	public static float[] negate(float[] v1, @ExtractionParam float[] res)
	{
		res[0] = -v1[0];
		res[1] = -v1[1];
		
		return res;
	}
	
	public static float[] negate(float v1X, float v1Y, @ExtractionParam float[] res)
	{
		res[0] = -v1X;
		res[1] = -v1Y;
		
		return res;
	}
	
	public static float[] negateAssign(@ExtractionParam float[] v1)
	{
		v1[0] = -v1[0];
		v1[1] = -v1[1];
		
		return v1;
	}
	
	public static float[] squared(float[] v1, @ExtractionParam float[] res)
	{
		float v1X = v1[0];
		float v1Y = v1[1];
		
		res[0] = v1X * v1X;
		res[1] = v1Y * v1Y;
		
		return res;
	}
	
	public static float[] squared(float v1X, float v1Y, @ExtractionParam float[] res)
	{
		res[0] = v1X * v1X;
		res[1] = v1Y * v1Y;
		
		return res;
	}
	
	public static float[] squaredAssign(@ExtractionParam float[] v1)
	{
		v1[0] *= v1[0];
		v1[1] *= v1[1];
		
		return v1;
	}
	
	public static float[] sin(float[] v1, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.sin(v1[0]);
		res[1] = MathUtils.sin(v1[1]);
		
		return res;
	}
	
	public static float[] sin(float v1X, float v1Y, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.sin(v1X);
		res[1] = MathUtils.sin(v1Y);
		
		return res;
	}
	
	public static float[] sinAssign(@ExtractionParam float[] v1)
	{
		v1[0] = MathUtils.sin(v1[0]);
		v1[1] = MathUtils.sin(v1[1]);
		
		return v1;
	}
	
	public static float[] asin(float[] v1, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.asin(v1[0]);
		res[1] = MathUtils.asin(v1[1]);
		
		return res;
	}
	
	public static float[] asin(float v1X, float v1Y, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.asin(v1X);
		res[1] = MathUtils.asin(v1Y);
		
		return res;
	}
	
	public static float[] asinAssign(@ExtractionParam float[] v1)
	{
		v1[0] = MathUtils.asin(v1[0]);
		v1[1] = MathUtils.asin(v1[1]);
		
		return v1;
	}
	
	public static float[] sinh(float[] v1, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.sinh(v1[0]);
		res[1] = MathUtils.sinh(v1[1]);
		
		return res;
	}
	
	public static float[] sinh(float v1X, float v1Y, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.sinh(v1X);
		res[1] = MathUtils.sinh(v1Y);
		
		return res;
	}
	
	public static float[] sinhAssign(@ExtractionParam float[] v1)
	{
		v1[0] = MathUtils.sinh(v1[0]);
		v1[1] = MathUtils.sinh(v1[1]);
		
		return v1;
	}
	
	public static float[] cos(float[] v1, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.cos(v1[0]);
		res[1] = MathUtils.cos(v1[1]);
		
		return res;
	}
	
	public static float[] cos(float v1X, float v1Y, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.cos(v1X);
		res[1] = MathUtils.cos(v1Y);
		
		return res;
	}
	
	public static float[] cosAssign(@ExtractionParam float[] v1)
	{
		v1[0] = MathUtils.cos(v1[0]);
		v1[1] = MathUtils.cos(v1[1]);
		
		return v1;
	}
	
	public static float[] acos(float[] v1, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.acos(v1[0]);
		res[1] = MathUtils.acos(v1[1]);
		
		return res;
	}
	
	public static float[] acos(float v1X, float v1Y, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.acos(v1X);
		res[1] = MathUtils.acos(v1Y);
		
		return res;
	}
	
	public static float[] acosAssign(@ExtractionParam float[] v1)
	{
		v1[0] = MathUtils.acos(v1[0]);
		v1[1] = MathUtils.acos(v1[1]);
		
		return v1;
	}
	
	public static float[] cosh(float[] v1, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.cosh(v1[0]);
		res[1] = MathUtils.cosh(v1[1]);
		
		return res;
	}
	
	public static float[] cosh(float v1X, float v1Y, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.cosh(v1X);
		res[1] = MathUtils.cosh(v1Y);
		
		return res;
	}
	
	public static float[] coshAssign(@ExtractionParam float[] v1)
	{
		v1[0] = MathUtils.cosh(v1[0]);
		v1[1] = MathUtils.cosh(v1[1]);
		
		return v1;
	}
	
	public static float[] tan(float[] v1, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.tan(v1[0]);
		res[1] = MathUtils.tan(v1[1]);
		
		return res;
	}
	
	public static float[] tan(float v1X, float v1Y, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.tan(v1X);
		res[1] = MathUtils.tan(v1Y);
		
		return res;
	}
	
	public static float[] tanAssign(@ExtractionParam float[] v1)
	{
		v1[0] = MathUtils.tan(v1[0]);
		v1[1] = MathUtils.tan(v1[1]);
		
		return v1;
	}
	
	public static float[] atan(float[] v1, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.atan(v1[0]);
		res[1] = MathUtils.atan(v1[1]);
		
		return res;
	}
	
	public static float[] atan(float v1X, float v1Y, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.atan(v1X);
		res[1] = MathUtils.atan(v1Y);
		
		return res;
	}
	
	public static float[] atanAssign(@ExtractionParam float[] v1)
	{
		v1[0] = MathUtils.atan(v1[0]);
		v1[1] = MathUtils.atan(v1[1]);
		
		return v1;
	}
	
	public static float[] tanh(float[] v1, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.tanh(v1[0]);
		res[1] = MathUtils.tanh(v1[1]);
		
		return res;
	}
	
	public static float[] tanh(float v1X, float v1Y, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.tanh(v1X);
		res[1] = MathUtils.tanh(v1Y);
		
		return res;
	}
	
	public static float[] tanhAssign(@ExtractionParam float[] v1)
	{
		v1[0] = MathUtils.tanh(v1[0]);
		v1[1] = MathUtils.tanh(v1[1]);
		
		return v1;
	}
	
	public static float minValue(float[] v1)
	{
		return Math.min(v1[0], v1[1]);
	}
	
	public static float minValue(float v1X, float v1Y)
	{
		return Math.min(v1X, v1Y);
	}
	
	public static int minComponent(float[] v1)
	{
		float value = v1[0];
		int index = 0;

		float v1Y = v1[1];

		if (v1Y < value)
		{
			index = 1;
		}
		
		return index;
	}
	
	public static int minComponent(float v1X, float v1Y)
	{
		float value = v1X;
		int index = 0;

		if (v1Y < value)
		{
			index = 1;
		}
		
		return index;
	}
	
	public static IndexValuePairF min(float[] v1, @ExtractionParam IndexValuePairF res)
	{
		float value = v1[0];
		int index = 0;

		float v1Y = v1[1];

		if (v1Y < value)
		{
			value = v1Y;
			index = 1;
		}

		res.set(value, index);

		return res;
	}
	
	public static IndexValuePairF min(float v1X, float v1Y, @ExtractionParam IndexValuePairF res)
	{
		float value = v1X;
		int index = 0;

		if (v1Y < value)
		{
			value = v1Y;
			index = 1;
		}

		res.set(value, index);

		return res;
	}
	
	public static float[] min(float[] v1, float[] v2, @ExtractionParam float[] res)
	{
		res[0] = Math.min(v1[0], v2[0]);
		res[1] = Math.min(v1[1], v2[1]);
		
		return res;
	}
	
	public static float[] min(float[] v1, float v2, @ExtractionParam float[] res)
	{
		res[0] = Math.min(v1[0], v2);
		res[1] = Math.min(v1[1], v2);
		
		return res;
	}
	
	public static float[] min(float[] v1, float v2X, float v2Y, @ExtractionParam float[] res)
	{
		res[0] = Math.min(v1[0], v2X);
		res[1] = Math.min(v1[1], v2Y);
		
		return res;
	}
	
	public static float[] min(float v1X, float v1Y, float[] v2, @ExtractionParam float[] res)
	{
		res[0] = Math.min(v1X, v2[0]);
		res[1] = Math.min(v1Y, v2[1]);
		
		return res;
	}
	
	public static float[] min(float v1X, float v1Y, float v2X, float v2Y, @ExtractionParam float[] res)
	{
		res[0] = Math.min(v1X, v2X);
		res[1] = Math.min(v1Y, v2Y);
		
		return res;
	}
	
	public static float[] minAssign(@ExtractionParam float[] v1, float[] v2)
	{
		v1[0] = Math.min(v1[0], v2[0]);
		v1[1] = Math.min(v1[1], v2[1]);
		
		return v1;
	}
	
	public static float[] minAssign(@ExtractionParam float[] v1, float v2)
	{
		v1[0] = Math.min(v1[0], v2);
		v1[1] = Math.min(v1[1], v2);
		
		return v1;
	}
	
	public static float[] minAssign(@ExtractionParam float[] v1, float v2X, float v2Y)
	{
		v1[0] = Math.min(v1[0], v2X);
		v1[1] = Math.min(v1[1], v2Y);
		
		return v1;
	}
	
	public static float maxValue(float[] v1)
	{
		return Math.max(v1[0], v1[1]);
	}
	
	public static float maxValue(float v1X, float v1Y)
	{
		return Math.max(v1X, v1Y);
	}
	
	public static int maxComponent(float[] v1)
	{
		float value = v1[0];
		int index = 0;

		float v1Y = v1[1];

		if (v1Y > value)
		{
			index = 1;
		}
		
		return index;
	}
	
	public static int maxComponent(float v1X, float v1Y)
	{
		float value = v1X;
		int index = 0;

		if (v1Y > value)
		{
			index = 1;
		}
		
		return index;
	}
	
	public static IndexValuePairF max(float[] v1, @ExtractionParam IndexValuePairF res)
	{
		float value = v1[0];
		int index = 0;

		float v1Y = v1[1];

		if (v1Y < value)
		{
			value = v1Y;
			index = 1;
		}

		res.set(value, index);

		return res;
	}

	public static IndexValuePairF max(float v1X, float v1Y, @ExtractionParam IndexValuePairF res)
	{
		float value = v1X;
		int index = 0;

		if (v1Y > value)
		{
			value = v1Y;
			index = 1;
		}

		res.set(value, index);

		return res;
	}
	
	public static float[] max(float[] v1, float[] v2, @ExtractionParam float[] res)
	{
		res[0] = Math.max(v1[0], v2[0]);
		res[1] = Math.max(v1[1], v2[1]);
		
		return res;
	}
	
	public static float[] max(float[] v1, float v2, @ExtractionParam float[] res)
	{
		res[0] = Math.max(v1[0], v2);
		res[1] = Math.max(v1[1], v2);
		
		return res;
	}
	
	public static float[] max(float[] v1, float v2X, float v2Y, @ExtractionParam float[] res)
	{
		res[0] = Math.max(v1[0], v2X);
		res[1] = Math.max(v1[1], v2Y);
		
		return res;
	}
	
	public static float[] max(float v1X, float v1Y, float[] v2, @ExtractionParam float[] res)
	{
		res[0] = Math.max(v1X, v2[0]);
		res[1] = Math.max(v1Y, v2[1]);
		
		return res;
	}
	
	public static float[] max(float v1X, float v1Y, float v2X, float v2Y, @ExtractionParam float[] res)
	{
		res[0] = Math.max(v1X, v2X);
		res[1] = Math.max(v1Y, v2Y);
		
		return res;
	}
	
	public static float[] maxAssign(@ExtractionParam float[] v1, float[] v2)
	{
		v1[0] = Math.max(v1[0], v2[0]);
		v1[1] = Math.max(v1[1], v2[1]);
		
		return v1;
	}
	
	public static float[] maxAssign(@ExtractionParam float[] v1, float v2)
	{
		v1[0] = Math.max(v1[0], v2);
		v1[1] = Math.max(v1[1], v2);
		
		return v1;
	}
	
	public static float[] maxAssign(@ExtractionParam float[] v1, float v2X, float v2Y)
	{
		v1[0] = Math.max(v1[0], v2X);
		v1[1] = Math.max(v1[1], v2Y);
		
		return v1;
	}
	
	public static float[] signum(float[] v1, @ExtractionParam float[] res)
	{
		res[0] = Math.signum(v1[0]);
		res[1] = Math.signum(v1[1]);
		
		return res;
	}
	
	public static float[] signum(float v1X, float v1Y, @ExtractionParam float[] res)
	{
		res[0] = Math.signum(v1X);
		res[1] = Math.signum(v1Y);
		
		return res;
	}
	
	public static float[] signumAssign(@ExtractionParam float[] v1)
	{
		v1[0] = Math.signum(v1[0]);
		v1[1] = Math.signum(v1[1]);
		
		return v1;
	}
	
	public static float[] signumEps4(float[] v1, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.signumEps4(v1[0]);
		res[1] = MathUtils.signumEps4(v1[1]);
		
		return res;
	}
	
	public static float[] signumEps4(float v1X, float v1Y, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.signumEps4(v1X);
		res[1] = MathUtils.signumEps4(v1Y);
		
		return res;
	}
	
	public static float[] signumEps4Assign(@ExtractionParam float[] v1)
	{
		v1[0] = MathUtils.signumEps4(v1[0]);
		v1[1] = MathUtils.signumEps4(v1[1]);
		
		return v1;
	}
	
	public static float[] signumEps6(float[] v1, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.signumEps6(v1[0]);
		res[1] = MathUtils.signumEps6(v1[1]);
		
		return res;
	}
	
	public static float[] signumEps6(float v1X, float v1Y, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.signumEps6(v1X);
		res[1] = MathUtils.signumEps6(v1Y);
		
		return res;
	}
	
	public static float[] signumEps6Assign(@ExtractionParam float[] v1)
	{
		v1[0] = MathUtils.signumEps6(v1[0]);
		v1[1] = MathUtils.signumEps6(v1[1]);
		
		return v1;
	}
	
	public static float[] signumEps8(float[] v1, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.signumEps8(v1[0]);
		res[1] = MathUtils.signumEps8(v1[1]);
		
		return res;
	}
	
	public static float[] signumEps8(float v1X, float v1Y, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.signumEps8(v1X);
		res[1] = MathUtils.signumEps8(v1Y);
		
		return res;
	}
	
	public static float[] signumEps8Assign(@ExtractionParam float[] v1)
	{
		v1[0] = MathUtils.signumEps8(v1[0]);
		v1[1] = MathUtils.signumEps8(v1[1]);
		
		return v1;
	}
	
	public static float[] clampMin(float[] v1, float[] min, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.clampMin(v1[0], min[0]);
		res[1] = MathUtils.clampMin(v1[1], min[1]);
		
		return res;
	}
	
	public static float[] clampMin(float[] v1, float min, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.clampMin(v1[0], min);
		res[1] = MathUtils.clampMin(v1[1], min);
		
		return res;
	}
	
	public static float[] clampMin(float[] v1, float minX, float minY, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.clampMin(v1[0], minX);
		res[1] = MathUtils.clampMin(v1[1], minY);
		
		return res;
	}
	
	public static float[] clampMin(float v1X, float v1Y, float[] min, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.clampMin(v1X, min[0]);
		res[1] = MathUtils.clampMin(v1Y, min[1]);
		
		return res;
	}
	
	public static float[] clampMin(float v1X, float v1Y, float minX, float minY, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.clampMin(v1X, minX);
		res[1] = MathUtils.clampMin(v1Y, minY);
		
		return res;
	}
	
	public static float[] clampMinAssign(@ExtractionParam float[] v1, float[] min)
	{
		v1[0] = MathUtils.clampMin(v1[0], min[0]);
		v1[1] = MathUtils.clampMin(v1[1], min[1]);
		
		return v1;
	}
	
	public static float[] clampMinAssign(@ExtractionParam float[] v1, float min)
	{
		v1[0] = MathUtils.clampMin(v1[0], min);
		v1[1] = MathUtils.clampMin(v1[1], min);
		
		return v1;
	}
	
	public static float[] clampMinAssign(@ExtractionParam float[] v1, float minX, float minY)
	{
		v1[0] = MathUtils.clampMin(v1[0], minX);
		v1[1] = MathUtils.clampMin(v1[1], minY);
		
		return v1;
	}
	
	public static float[] clampMax(float[] v1, float[] max, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.clampMax(v1[0], max[0]);
		res[1] = MathUtils.clampMax(v1[1], max[1]);
		
		return res;
	}
	
	public static float[] clampMax(float[] v1, float max, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.clampMax(v1[0], max);
		res[1] = MathUtils.clampMax(v1[1], max);
		
		return res;
	}
	
	public static float[] clampMax(float[] v1, float maxX, float maxY, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.clampMax(v1[0], maxX);
		res[1] = MathUtils.clampMax(v1[1], maxY);
		
		return res;
	}
	
	public static float[] clampMax(float v1X, float v1Y, float[] max, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.clampMax(v1X, max[0]);
		res[1] = MathUtils.clampMax(v1Y, max[1]);
		
		return res;
	}
	
	public static float[] clampMax(float v1X, float v1Y, float maxX, float maxY, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.clampMax(v1X, maxX);
		res[1] = MathUtils.clampMax(v1Y, maxY);
		
		return res;
	}
	
	public static float[] clampMaxAssign(@ExtractionParam float[] v1, float[] max)
	{
		v1[0] = MathUtils.clampMax(v1[0], max[0]);
		v1[1] = MathUtils.clampMax(v1[1], max[1]);
		
		return v1;
	}
	
	public static float[] clampMaxAssign(@ExtractionParam float[] v1, float max)
	{
		v1[0] = MathUtils.clampMax(v1[0], max);
		v1[1] = MathUtils.clampMax(v1[1], max);
		
		return v1;
	}
	
	public static float[] clampMaxAssign(@ExtractionParam float[] v1, float maxX, float maxY)
	{
		v1[0] = MathUtils.clampMax(v1[0], maxX);
		v1[1] = MathUtils.clampMax(v1[1], maxY);
		
		return v1;
	}
	
	public static float[] clamp(float[] v1, float[] min, float[] max, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.clamp(v1[0], min[0], max[0]);
		res[1] = MathUtils.clamp(v1[1], min[1], max[1]);
		
		return res;
	}
	
	public static float[] clamp(float[] v1, float[] min, float maxX, float maxY, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.clamp(v1[0], min[0], maxX);
		res[1] = MathUtils.clamp(v1[1], min[1], maxY);
		
		return res;
	}
	
	public static float[] clamp(float[] v1, float min, float max, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.clamp(v1[0], min, max);
		res[1] = MathUtils.clamp(v1[1], min, max);
		
		return res;
	}
	
	public static float[] clamp(float[] v1, float minX, float minY, float maxX, float maxY, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.clamp(v1[0], minX, maxX);
		res[1] = MathUtils.clamp(v1[1], minY, maxY);
		
		return res;
	}
	
	public static float[] clamp(float v1X, float v1Y, float[] min, float[] max, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.clamp(v1X, min[0], max[0]);
		res[1] = MathUtils.clamp(v1Y, min[1], max[1]);
		
		return res;
	}
	
	public static float[] clamp(float v1X, float v1Y, float[] min, float maxX, float maxY, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.clamp(v1X, min[0], maxX);
		res[1] = MathUtils.clamp(v1Y, min[1], maxY);
		
		return res;
	}
	
	public static float[] clamp(float v1X, float v1Y, float minX, float minY, float[] max, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.clamp(v1X, minX, max[0]);
		res[1] = MathUtils.clamp(v1Y, minY, max[1]);
		
		return res;
	}
	
	public static float[] clamp(float v1X, float v1Y, float minX, float minY, float maxX, float maxY, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.clamp(v1X, minX, maxX);
		res[1] = MathUtils.clamp(v1Y, minY, maxY);
		
		return res;
	}
	
	public static float[] clampAssign(@ExtractionParam float[] v1, float[] min, float[] max)
	{
		v1[0] = MathUtils.clamp(v1[0], min[0], max[0]);
		v1[1] = MathUtils.clamp(v1[1], min[1], max[1]);
		
		return v1;
	}
	
	public static float[] clampAssign(@ExtractionParam float[] v1, float[] min, float maxX, float maxY)
	{
		v1[0] = MathUtils.clamp(v1[0], min[0], maxX);
		v1[1] = MathUtils.clamp(v1[1], min[1], maxY);
		
		return v1;
	}
	
	public static float[] clampAssign(@ExtractionParam float[] v1, float min, float max)
	{
		v1[0] = MathUtils.clamp(v1[0], min, max);
		v1[1] = MathUtils.clamp(v1[1], min, max);
		
		return v1;
	}
	
	public static float[] clampAssign(@ExtractionParam float[] v1, float minX, float minY, float[] max)
	{
		v1[0] = MathUtils.clamp(v1[0], minX, max[0]);
		v1[1] = MathUtils.clamp(v1[1], minY, max[1]);
		
		return v1;
	}
	
	public static float[] clampAssign(@ExtractionParam float[] v1, float minX, float minY, float maxX, float maxY)
	{
		v1[0] = MathUtils.clamp(v1[0], minX, maxX);
		v1[1] = MathUtils.clamp(v1[1], minY, maxY);
		
		return v1;
	}
	
	public static float[] swizzleT_rvec2f(float[] v1, int[] indices, @ExtractionParam float[] res)
	{
		float v1X = v1[0];
		float v1Y = v1[1];
		
		float x = switch (indices[0]) {
			case 0 -> v1X;
			case 1 -> v1Y;
			default -> throw new IndexOutOfBoundsException();
		};

		float y = switch (indices[1]) {
			case 0 -> v1X;
			case 1 -> v1Y;
			default -> throw new IndexOutOfBoundsException();
		};

		res[0] = x;
		res[1] = y;

		return res;
	}

	public static float[] swizzle(float[] v1, int indexX, int indexY, @ExtractionParam float[] res)
	{
		float v1X = v1[0];
		float v1Y = v1[1];
		
		float x = switch (indexX) {
			case 0 -> v1X;
			case 1 -> v1Y;
			default -> throw new IndexOutOfBoundsException();
		};

		float y = switch (indexY) {
			case 0 -> v1X;
			case 1 -> v1Y;
			default -> throw new IndexOutOfBoundsException();
		};

		res[0] = x;
		res[1] = y;
		
		return res;
	}
	
	public static float[] swizzle(float v1X, float v1Y, int[] indices, @ExtractionParam float[] res)
	{
		float x = switch (indices[0]) {
			case 0 -> v1X;
			case 1 -> v1Y;
			default -> throw new IndexOutOfBoundsException();
		};

		float y = switch (indices[1]) {
			case 0 -> v1X;
			case 1 -> v1Y;
			default -> throw new IndexOutOfBoundsException();
		};

		res[0] = x;
		res[1] = y;

		return res;
	}
	
	public static float[] swizzle(float v1X, float v1Y, int indexX, int indexY, @ExtractionParam float[] res)
	{
		float x = switch (indexX) {
			case 0 -> v1X;
			case 1 -> v1Y;
			default -> throw new IndexOutOfBoundsException();
		};

		float y = switch (indexY) {
			case 0 -> v1X;
			case 1 -> v1Y;
			default -> throw new IndexOutOfBoundsException();
		};

		res[0] = x;
		res[1] = y;

		return res;
	}

	public static float[] swizzleAssign(@ExtractionParam float[] v1, int[] indices)
	{
		float v1X = v1[0];
		float v1Y = v1[1];
		
		float x = switch (indices[0]) {
			case 0 -> v1X;
			case 1 -> v1Y;
			default -> throw new IndexOutOfBoundsException();
		};

		float y = switch (indices[1]) {
			case 0 -> v1X;
			case 1 -> v1Y;
			default -> throw new IndexOutOfBoundsException();
		};

		v1[0] = x;
		v1[1] = y;

		return v1;
	}
	
	public static float[] swizzleAssign(@ExtractionParam float[] v1, int indexX, int indexY)
	{
		float v1X = v1[0];
		float v1Y = v1[1];
		
		float x = switch (indexX) {
			case 0 -> v1X;
			case 1 -> v1Y;
			default -> throw new IndexOutOfBoundsException();
		};

		float y = switch (indexY) {
			case 0 -> v1X;
			case 1 -> v1Y;
			default -> throw new IndexOutOfBoundsException();
		};

		v1[0] = x;
		v1[1] = y;
		
		return v1;
	}
	
	public static float[] swap(float[] v1, int[] indices, @ExtractionParam float[] res)
	{
		float v1X = v1[0];
		float v1Y = v1[1];
		
		int indexA = indices[0];
		int indexB = indices[1];
		
		if(indexA == indexB)
		{
			res[0] = v1X;
			res[1] = v1Y;
			
			return res;
		}
		
		float a = switch(indexA) {
			case 0 -> v1X;
			case 1 -> v1Y;
			default -> throw new IndexOutOfBoundsException();
		};
		
		float b = switch(indexB) {
			case 0 -> v1X;
			case 1 -> v1Y;
			default -> throw new IndexOutOfBoundsException();
		};
		
		float rX = v1X;
		float rY = v1Y;
		
		switch(indexB) {
			case 0: rX = a; break;
			case 1: rY = a; break;
			default: throw new IndexOutOfBoundsException();
		}
		
		switch(indexA) {
			case 0: rX = b; break;
			case 1: rY = b; break;
			default: throw new IndexOutOfBoundsException();
		}
		
		res[0] = rX;
		res[1] = rY;

		return res;
	}
	
	public static float[] swap(float[] v1, int indexA, int indexB, @ExtractionParam float[] res)
	{
		float v1X = v1[0];
		float v1Y = v1[1];
		
		if(indexA == indexB)
		{
			res[0] = v1X;
			res[1] = v1Y;
			
			return res;
		}
		
		float a = switch(indexA) {
			case 0 -> v1X;
			case 1 -> v1Y;
			default -> throw new IndexOutOfBoundsException();
		};
		
		float b = switch(indexB) {
			case 0 -> v1X;
			case 1 -> v1Y;
			default -> throw new IndexOutOfBoundsException();
		};
		
		float rX = v1X;
		float rY = v1Y;
		
		switch(indexB) {
			case 0: rX = a; break;
			case 1: rY = a; break;
			default: throw new IndexOutOfBoundsException();
		}
		
		switch(indexA) {
			case 0: rX = b; break;
			case 1: rY = b; break;
			default: throw new IndexOutOfBoundsException();
		}
		
		res[0] = rX;
		res[1] = rY;

		return res;
	}

	public static float[] swap(float v1X, float v1Y, int[] indices, @ExtractionParam float[] res)
	{
		int indexA = indices[0];
		int indexB = indices[1];
		
		if(indexA == indexB)
		{
			res[0] = v1X;
			res[1] = v1Y;
			
			return res;
		}
		
		float a = switch(indexA) {
			case 0 -> v1X;
			case 1 -> v1Y;
			default -> throw new IndexOutOfBoundsException();
		};
		
		float b = switch(indexB) {
			case 0 -> v1X;
			case 1 -> v1Y;
			default -> throw new IndexOutOfBoundsException();
		};
		
		float rX = v1X;
		float rY = v1Y;
		
		switch(indexB) {
			case 0: rX = a; break;
			case 1: rY = a; break;
			default: throw new IndexOutOfBoundsException();
		}
		
		switch(indexA) {
			case 0: rX = b; break;
			case 1: rY = b; break;
			default: throw new IndexOutOfBoundsException();
		}
		
		res[0] = rX;
		res[1] = rY;

		return res;
	}
	
	public static float[] swap(float v1X, float v1Y, int indexA, int indexB, @ExtractionParam float[] res)
	{
		if(indexA == indexB)
		{
			res[0] = v1X;
			res[1] = v1Y;
			
			return res;
		}
		
		float a = switch(indexA) {
			case 0 -> v1X;
			case 1 -> v1Y;
			default -> throw new IndexOutOfBoundsException();
		};
		
		float b = switch(indexB) {
			case 0 -> v1X;
			case 1 -> v1Y;
			default -> throw new IndexOutOfBoundsException();
		};
		
		float rX = v1X;
		float rY = v1Y;
		
		switch(indexB) {
			case 0: rX = a; break;
			case 1: rY = a; break;
			default: throw new IndexOutOfBoundsException();
		}
		
		switch(indexA) {
			case 0: rX = b; break;
			case 1: rY = b; break;
			default: throw new IndexOutOfBoundsException();
		}
		
		res[0] = rX;
		res[1] = rY;

		return res;
	}

	public static float[] swapAssign(@ExtractionParam float[] v1, int[] indices)
	{
		float v1X = v1[0];
		float v1Y = v1[1];

		int indexA = indices[0];
		int indexB = indices[1];
		
		if(indexA == indexB) return v1;
		
		float a = switch(indexA) {
			case 0 -> v1X;
			case 1 -> v1Y;
			default -> throw new IndexOutOfBoundsException();
		};
		
		float b = switch(indexB) {
			case 0 -> v1X;
			case 1 -> v1Y;
			default -> throw new IndexOutOfBoundsException();
		};
		
		float rX = v1X;
		float rY = v1Y;
		
		switch(indexB) {
			case 0: rX = a; break;
			case 1: rY = a; break;
			default: throw new IndexOutOfBoundsException();
		}
		
		switch(indexA) {
			case 0: rX = b; break;
			case 1: rY = b; break;
			default: throw new IndexOutOfBoundsException();
		}
		
		v1[0] = rX;
		v1[1] = rY;

		return v1;
	}
	
	public static float[] swapAssign(@ExtractionParam float[] v1, int indexA, int indexB)
	{
		float v1X = v1[0];
		float v1Y = v1[1];
		
		if(indexA == indexB) return v1;
		
		float a = switch(indexA) {
			case 0 -> v1X;
			case 1 -> v1Y;
			default -> throw new IndexOutOfBoundsException();
		};
		
		float b = switch(indexB) {
			case 0 -> v1X;
			case 1 -> v1Y;
			default -> throw new IndexOutOfBoundsException();
		};
		
		float rX = v1X;
		float rY = v1Y;
		
		switch(indexB) {
			case 0: rX = a; break;
			case 1: rY = a; break;
			default: throw new IndexOutOfBoundsException();
		}
		
		switch(indexA) {
			case 0: rX = b; break;
			case 1: rY = b; break;
			default: throw new IndexOutOfBoundsException();
		}
		
		v1[0] = rX;
		v1[1] = rY;

		return v1;
	}
	
	public static float[] swapXY(float[] v1, @ExtractionParam float[] res)
	{
		float v1X = v1[0];
		float v1Y = v1[1];
		
		res[0] = v1Y;
		res[1] = v1X;

		return res;
	}

	public static float[] swapXY(float v1X, float v1Y, @ExtractionParam float[] res)
	{
		res[0] = v1Y;
		res[1] = v1X;

		return res;
	}
	
	public static float[] swapXYAssign(@ExtractionParam float[] v1)
	{
		float v1X = v1[0];
		float v1Y = v1[1];
		
		v1[0] = v1Y;
		v1[1] = v1X;

		return v1;
	}
	
	public static float[] integer(float[] v1, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.integer(v1[0]);
		res[1] = MathUtils.integer(v1[1]);
		
		return res;
	}
	
	public static float[] integer(float v1X, float v1Y, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.integer(v1X);
		res[1] = MathUtils.integer(v1Y);
		
		return res;
	}
	
	public static float[] integerAssign(@ExtractionParam float[] v1)
	{
		v1[0] = MathUtils.integer(v1[0]);
		v1[1] = MathUtils.integer(v1[1]);
		
		return v1;
	}
	
	public static float[] frac(float[] v1, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.frac(v1[0]);
		res[1] = MathUtils.frac(v1[1]);
		
		return res;
	}
	
	public static float[] frac(float v1X, float v1Y, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.frac(v1X);
		res[1] = MathUtils.frac(v1Y);
		
		return res;
	}
	
	public static float[] fracAssign(@ExtractionParam float[] v1)
	{
		v1[0] = MathUtils.frac(v1[0]);
		v1[1] = MathUtils.frac(v1[1]);
		
		return v1;
	}
	
	public static float[] sanitizeEps(float tolerance, float[] v1, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.sanitizeEps(tolerance, v1[0]);
		res[1] = MathUtils.sanitizeEps(tolerance, v1[1]);
		
		return res;
	}
	
	public static float[] sanitizeEps(float tolerance, float v1X, float v1Y, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.sanitizeEps(tolerance, v1X);
		res[1] = MathUtils.sanitizeEps(tolerance, v1Y);
		
		return res;
	}
	
	public static float[] sanitizeEpsAssign(float tolerance, @ExtractionParam float[] v1)
	{
		v1[0] = MathUtils.sanitizeEps(tolerance, v1[0]);
		v1[1] = MathUtils.sanitizeEps(tolerance, v1[1]);
		
		return v1;
	}
	
	public static float[] sanitizeEps4(float[] v1, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.sanitizeEps4(v1[0]);
		res[1] = MathUtils.sanitizeEps4(v1[1]);
		
		return res;
	}
	
	public static float[] sanitizeEps4(float v1X, float v1Y, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.sanitizeEps4(v1X);
		res[1] = MathUtils.sanitizeEps4(v1Y);
		
		return res;
	}
	
	public static float[] sanitizeEps4Assign(@ExtractionParam float[] v1)
	{
		v1[0] = MathUtils.sanitizeEps4(v1[0]);
		v1[1] = MathUtils.sanitizeEps4(v1[1]);
		
		return v1;
	}
	
	public static float[] sanitizeEps6(float[] v1, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.sanitizeEps6(v1[0]);
		res[1] = MathUtils.sanitizeEps6(v1[1]);
		
		return res;
	}
	
	public static float[] sanitizeEps6(float v1X, float v1Y, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.sanitizeEps6(v1X);
		res[1] = MathUtils.sanitizeEps6(v1Y);
		
		return res;
	}
	
	public static float[] sanitizeEps6Assign(@ExtractionParam float[] v1)
	{
		v1[0] = MathUtils.sanitizeEps6(v1[0]);
		v1[1] = MathUtils.sanitizeEps6(v1[1]);
		
		return v1;
	}
	
	public static float[] sanitizeEps8(float[] v1, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.sanitizeEps8(v1[0]);
		res[1] = MathUtils.sanitizeEps8(v1[1]);
		
		return res;
	}
	
	public static float[] sanitizeEps8(float v1X, float v1Y, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.sanitizeEps8(v1X);
		res[1] = MathUtils.sanitizeEps8(v1Y);
		
		return res;
	}
	
	public static float[] sanitizeEps8Assign(float[] v1)
	{
		v1[0] = MathUtils.sanitizeEps8(v1[0]);
		v1[1] = MathUtils.sanitizeEps8(v1[1]);
		
		return v1;
	}
	
	public static float[] addWeighted(float[] v1, float[] v2, float[] weight, @ExtractionParam float[] res)
	{
		res[0] = Math.fma(v2[0], weight[0], v1[0]);
		res[1] = Math.fma(v2[1], weight[1], v1[1]);
		
		return res;
	}
	
	public static float[] addWeighted(float[] v1, float[] v2, float weight, @ExtractionParam float[] res)
	{
		res[0] = Math.fma(v2[0], weight, v1[0]);
		res[1] = Math.fma(v2[1], weight, v1[1]);
		
		return res;
	}
	
	public static float[] addWeighted(float[] v1, float[] v2, float weightX, float weightY, @ExtractionParam float[] res)
	{
		res[0] = Math.fma(v2[0], weightX, v1[0]);
		res[1] = Math.fma(v2[1], weightY, v1[1]);
		
		return res;
	}
	
	public static float[] addWeighted(float[] v1, float v2X, float v2Y, float[] weight, @ExtractionParam float[] res)
	{
		res[0] = Math.fma(v2X, weight[0], v1[0]);
		res[1] = Math.fma(v2Y, weight[1], v1[1]);
		
		return res;
	}
	
	public static float[] addWeighted(float[] v1, float v2X, float v2Y, float weightX, float weightY, @ExtractionParam float[] res)
	{
		res[0] = Math.fma(v2X, weightX, v1[0]);
		res[1] = Math.fma(v2Y, weightY, v1[1]);
		
		return res;
	}
	
	public static float[] addWeighted(float v1X, float v1Y, float[] v2, float[] weight, @ExtractionParam float[] res)
	{
		res[0] = Math.fma(v2[0], weight[0], v1X);
		res[1] = Math.fma(v2[1], weight[1], v1Y);
		
		return res;
	}
	
	public static float[] addWeighted(float v1X, float v1Y, float[] v2, float weightX, float weightY, @ExtractionParam float[] res)
	{
		res[0] = Math.fma(v2[0], weightX, v1X);
		res[1] = Math.fma(v2[1], weightY, v1Y);
		
		return res;
	}
	
	public static float[] addWeighted(float v1X, float v1Y, float v2X, float v2Y, float[] weight, @ExtractionParam float[] res)
	{
		res[0] = Math.fma(v2X, weight[0], v1X);
		res[1] = Math.fma(v2Y, weight[1], v1Y);
		
		return res;
	}
	
	public static float[] addWeighted(float v1X, float v1Y, float v2X, float v2Y, float weightX, float weightY, @ExtractionParam float[] res)
	{
		res[0] = Math.fma(v2X, weightX, v1X);
		res[1] = Math.fma(v2Y, weightY, v1Y);
		
		return res;
	}

	public static float[] addWeightedAssign(@ExtractionParam float[] v1, float[] v2, float[] weight)
	{
		v1[0] = Math.fma(v2[0], weight[0], v1[0]);
		v1[1] = Math.fma(v2[1], weight[1], v1[1]);
		
		return v1;
	}
	
	public static float[] addWeightedAssign(@ExtractionParam float[] v1, float[] v2, float weight)
	{
		v1[0] = Math.fma(v2[0], weight, v1[0]);
		v1[1] = Math.fma(v2[1], weight, v1[1]);
		
		return v1;
	}
	
	public static float[] addWeightedAssign(@ExtractionParam float[] v1, float[] v2, float weightX, float weightY)
	{
		v1[0] = Math.fma(v2[0], weightX, v1[0]);
		v1[1] = Math.fma(v2[1], weightY, v1[1]);
		
		return v1;
	}
	
	public static float[] addWeightedAssign(@ExtractionParam float[] v1, float v2X, float v2Y, float[] weight)
	{
		v1[0] = Math.fma(v2X, weight[0], v1[0]);
		v1[1] = Math.fma(v2Y, weight[1], v1[1]);
		
		return v1;
	}
	
	public static float[] addWeightedAssign(@ExtractionParam float[] v1, float v2X, float v2Y, float weightX, float weightY)
	{
		v1[0] = Math.fma(v2X, weightX, v1[0]);
		v1[1] = Math.fma(v2Y, weightY, v1[1]);
		
		return v1;
	}
	
	public static float[] saturate(float[] v1, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.saturate(v1[0]);
		res[1] = MathUtils.saturate(v1[1]);
		
		return res;
	}
	
	public static float[] saturate(float v1X, float v1Y, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.saturate(v1X);
		res[1] = MathUtils.saturate(v1Y);
		
		return res;
	}
	
	public static float[] saturateAssign(float[] v1)
	{
		v1[0] = MathUtils.saturate(v1[0]);
		v1[1] = MathUtils.saturate(v1[1]);
		
		return v1;
	}
	
	public static float[] remapRange(float[] v1, float[] srcMin, float[] srcMax, float[] dstMin, float[] dstMax, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.remapRange(v1[0], srcMin[0], srcMax[0], dstMin[0], dstMax[0]);
		res[1] = MathUtils.remapRange(v1[1], srcMin[1], srcMax[1], dstMin[1], dstMax[1]);
		
		return res;
	}
	
	public static float[] remapRange(float[] v1, float srcMin, float srcMax, float dstMin, float dstMax, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.remapRange(v1[0], srcMin, srcMax, dstMin, dstMax);
		res[1] = MathUtils.remapRange(v1[1], srcMin, srcMax, dstMin, dstMax);
		
		return res;
	}
	
	public static float[] remapRange(float[] v1, float srcMinX, float srcMinY, float srcMaxX, float srcMaxY, float dstMinX, float dstMinY, float dstMaxX, float dstMaxY, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.remapRange(v1[0], srcMinX, srcMaxX, dstMinX, dstMaxX);
		res[1] = MathUtils.remapRange(v1[1], srcMinY, srcMaxY, dstMinY, dstMaxY);
		
		return res;
	}
	
	public static float[] remapRange(float v1X, float v1Y, float[] srcMin, float[] srcMax, float[] dstMin, float[] dstMax, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.remapRange(v1X, srcMin[0], srcMax[0], dstMin[0], dstMax[0]);
		res[1] = MathUtils.remapRange(v1Y, srcMin[1], srcMax[1], dstMin[1], dstMax[1]);
		
		return res;
	}
	
	public static float[] remapRange(float v1X, float v1Y, float srcMin, float srcMax, float dstMin, float dstMax, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.remapRange(v1X, srcMin, srcMax, dstMin, dstMax);
		res[1] = MathUtils.remapRange(v1Y, srcMin, srcMax, dstMin, dstMax);
		
		return res;
	}
	
	public static float[] remapRange(float v1X, float v1Y, float srcMinX, float srcMinY, float srcMaxX, float srcMaxY, float dstMinX, float dstMinY, float dstMaxX, float dstMaxY, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.remapRange(v1X, srcMinX, srcMaxX, dstMinX, dstMaxX);
		res[1] = MathUtils.remapRange(v1Y, srcMinY, srcMaxY, dstMinY, dstMaxY);
		
		return res;
	}
	
	public static float[] remapRangeAssign(float[] v1, float[] srcMin, float[] srcMax, float[] dstMin, float[] dstMax)
	{
		v1[0] = MathUtils.remapRange(v1[0], srcMin[0], srcMax[0], dstMin[0], dstMax[0]);
		v1[1] = MathUtils.remapRange(v1[1], srcMin[1], srcMax[1], dstMin[1], dstMax[1]);
		
		return v1;
	}
	
	public static float[] remapRangeAssign(float[] v1, float srcMin, float srcMax, float dstMin, float dstMax)
	{
		v1[0] = MathUtils.remapRange(v1[0], srcMin, srcMax, dstMin, dstMax);
		v1[1] = MathUtils.remapRange(v1[1], srcMin, srcMax, dstMin, dstMax);
		
		return v1;
	}
	
	public static float[] remapRangeAssign(float[] v1, float srcMinX, float srcMinY, float srcMaxX, float srcMaxY, float dstMinX, float dstMinY, float dstMaxX, float dstMaxY)
	{
		v1[0] = MathUtils.remapRange(v1[0], srcMinX, srcMaxX, dstMinX, dstMaxX);
		v1[1] = MathUtils.remapRange(v1[1], srcMinY, srcMaxY, dstMinY, dstMaxY);
		
		return v1;
	}
	
}
