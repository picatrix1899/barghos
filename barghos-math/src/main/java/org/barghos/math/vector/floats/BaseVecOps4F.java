package org.barghos.math.vector.floats;

import org.barghos.annotation.ExtractionParam;
import org.barghos.api.core.collection.IndexValuePairF;
import org.barghos.core.math.MathUtils;

public final class BaseVecOps4F
{
	private BaseVecOps4F() { }
	
	public static float[] add(float[] v1, float[] v2, @ExtractionParam float[] res)
	{
		res[0] = v1[0] + v2[0];
		res[1] = v1[1] + v2[1];
		res[2] = v1[2] + v2[2];
		res[3] = v1[3] + v2[3];
		
		return res;
	}
	
	public static float[] add(float[] v1, float v2, @ExtractionParam float[] res)
	{
		res[0] = v1[0] + v2;
		res[1] = v1[1] + v2;
		res[2] = v1[2] + v2;
		res[3] = v1[3] + v2;
		
		return res;
	}
	
	public static float[] add(float[] v1, float v2X, float v2Y, float v2Z, float v2W, @ExtractionParam float[] res)
	{
		res[0] = v1[0] + v2X;
		res[1] = v1[1] + v2Y;
		res[2] = v1[2] + v2Z;
		res[3] = v1[3] + v2W;
		
		return res;
	}
	
	public static float[] add(float v1X, float v1Y, float v1Z, float v1W, float[] v2, @ExtractionParam float[] res)
	{
		res[0] = v1X + v2[0];
		res[1] = v1Y + v2[1];
		res[2] = v1Z + v2[2];
		res[3] = v1W + v2[3];
		
		return res;
	}
	
	public static float[] add(float v1X, float v1Y, float v1Z, float v1W, float v2X, float v2Y, float v2Z, float v2W, @ExtractionParam float[] res)
	{
		res[0] = v1X + v2X;
		res[1] = v1Y + v2Y;
		res[2] = v1Z + v2Z;
		res[3] = v1W + v2W;
		
		return res;
	}
	
	public static float[] addAssign(@ExtractionParam float[] v1, float[] v2)
	{
		v1[0] += v2[0];
		v1[1] += v2[1];
		v1[2] += v2[2];
		v1[3] += v2[3];
		
		return v1;
	}
	
	public static float[] addAssign(@ExtractionParam float[] v1, float v2)
	{
		v1[0] += v2;
		v1[1] += v2;
		v1[2] += v2;
		v1[3] += v2;
		
		return v1;
	}
	
	public static float[] addAssign(@ExtractionParam float[] v1, float v2X, float v2Y, float v2Z, float v2W)
	{
		v1[0] += v2X;
		v1[1] += v2Y;
		v1[2] += v2Z;
		v1[3] += v2W;
		
		return v1;
	}
	
	public static float[] sub(float[] v1, float[] v2, @ExtractionParam float[] res)
	{
		res[0] = v1[0] - v2[0];
		res[1] = v1[1] - v2[1];
		res[2] = v1[2] - v2[2];
		res[3] = v1[3] - v2[3];
		
		return res;
	}
	
	public static float[] sub(float[] v1, float v2, @ExtractionParam float[] res)
	{
		res[0] = v1[0] - v2;
		res[1] = v1[1] - v2;
		res[2] = v1[2] - v2;
		res[3] = v1[3] - v2;
		
		return res;
	}
	
	public static float[] sub(float[] v1, float v2X, float v2Y, float v2Z, float v2W, @ExtractionParam float[] res)
	{
		res[0] = v1[0] - v2X;
		res[1] = v1[1] - v2Y;
		res[2] = v1[2] - v2Z;
		res[3] = v1[3] - v2W;
		
		return res;
	}
	
	public static float[] sub(float v1X, float v1Y, float v1Z, float v1W, float[] v2, @ExtractionParam float[] res)
	{
		res[0] = v1X - v2[0];
		res[1] = v1Y - v2[1];
		res[2] = v1Z - v2[2];
		res[3] = v1W - v2[3];
		
		return res;
	}
	
	public static float[] sub(float v1X, float v1Y, float v1Z, float v1W, float v2X, float v2Y, float v2Z, float v2W, @ExtractionParam float[] res)
	{
		res[0] = v1X - v2X;
		res[1] = v1Y - v2Y;
		res[2] = v1Z - v2Z;
		res[3] = v1W - v2W;
		
		return res;
	}
	
	public static float[] subAssign(@ExtractionParam float[] v1, float[] v2)
	{
		v1[0] -= v2[0];
		v1[1] -= v2[1];
		v1[2] -= v2[2];
		v1[3] -= v2[3];
		
		return v1;
	}
	
	public static float[] subAssign(@ExtractionParam float[] v1, float v2)
	{
		v1[0] -= v2;
		v1[1] -= v2;
		v1[2] -= v2;
		v1[3] -= v2;
		
		return v1;
	}
	
	public static float[] subAssign(@ExtractionParam float[] v1, float v2X, float v2Y, float v2Z, float v2W)
	{
		v1[0] -= v2X;
		v1[1] -= v2Y;
		v1[2] -= v2Z;
		v1[3] -= v2W;
		
		return v1;
	}
	
	public static float[] revSub(float[] v1, float[] v2, @ExtractionParam float[] res)
	{
		res[0] = v2[0] - v1[0];
		res[1] = v2[1] - v1[1];
		res[2] = v2[2] - v1[2];
		res[3] = v2[3] - v1[3];
		
		return res;
	}
	
	public static float[] revSub(float[] v1, float v2, @ExtractionParam float[] res)
	{
		res[0] = v2 - v1[0];
		res[1] = v2 - v1[1];
		res[2] = v2 - v1[2];
		res[3] = v2 - v1[3];
		
		return res;
	}
	
	public static float[] revSub(float[] v1, float v2X, float v2Y, float v2Z, float v2W, @ExtractionParam float[] res)
	{
		res[0] = v2X - v1[0];
		res[1] = v2Y - v1[1];
		res[2] = v2Z - v1[2];
		res[3] = v2W - v1[3];
		
		return res;
	}
	
	public static float[] revSub(float v1X, float v1Y, float v1Z, float v1W, float[] v2, @ExtractionParam float[] res)
	{
		res[0] = v2[0] - v1X;
		res[1] = v2[1] - v1Y;
		res[2] = v2[2] - v1Z;
		res[3] = v2[3] - v1W;
		
		return res;
	}
	
	public static float[] revSub(float v1X, float v1Y, float v1Z, float v1W, float v2X, float v2Y, float v2Z, float v2W, @ExtractionParam float[] res)
	{
		res[0] = v2X - v1X;
		res[1] = v2Y - v1Y;
		res[2] = v2Z - v1Z;
		res[3] = v2W - v1W;
		
		return res;
	}
	
	public static float[] revSubAssign(@ExtractionParam float[] v1, float[] v2)
	{
		v1[0] = v2[0] - v1[0];
		v1[1] = v2[1] - v1[1];
		v1[2] = v2[2] - v1[2];
		v1[3] = v2[3] - v1[3];
		
		return v1;
	}
	
	public static float[] revSubAssign(@ExtractionParam float[] v1, float v2)
	{
		v1[0] = v2 - v1[0];
		v1[1] = v2 - v1[1];
		v1[2] = v2 - v1[2];
		v1[3] = v2 - v1[3];
		
		return v1;
	}
	
	public static float[] revSubAssign(@ExtractionParam float[] v1, float v2X, float v2Y, float v2Z, float v2W)
	{
		v1[0] = v2X - v1[0];
		v1[1] = v2Y - v1[1];
		v1[2] = v2Z - v1[2];
		v1[3] = v2W - v1[3];
		
		return v1;
	}
	
	public static float[] mul(float[] v1, float[] v2, @ExtractionParam float[] res)
	{
		res[0] = v1[0] * v2[0];
		res[1] = v1[1] * v2[1];
		res[2] = v1[2] * v2[2];
		res[3] = v1[3] * v2[3];
		
		return res;
	}
	
	public static float[] mul(float[] v1, float v2, @ExtractionParam float[] res)
	{
		res[0] = v1[0] * v2;
		res[1] = v1[1] * v2;
		res[2] = v1[2] * v2;
		res[3] = v1[3] * v2;
		
		return res;
	}
	
	public static float[] mul(float[] v1, float v2X, float v2Y, float v2Z, float v2W, @ExtractionParam float[] res)
	{
		res[0] = v1[0] * v2X;
		res[1] = v1[1] * v2Y;
		res[2] = v1[2] * v2Z;
		res[3] = v1[3] * v2W;
		
		return res;
	}
	
	public static float[] mul(float v1X, float v1Y, float v1Z, float v1W, float[] v2, @ExtractionParam float[] res)
	{
		res[0] = v1X * v2[0];
		res[1] = v1Y * v2[1];
		res[2] = v1Z * v2[2];
		res[3] = v1W * v2[3];
		
		return res;
	}
	
	public static float[] mul(float v1X, float v1Y, float v1Z, float v1W, float v2X, float v2Y, float v2Z, float v2W, @ExtractionParam float[] res)
	{
		res[0] = v1X * v2X;
		res[1] = v1Y * v2Y;
		res[2] = v1Z * v2Z;
		res[3] = v1W * v2W;
		
		return res;
	}
	
	public static float[] mulAssign(@ExtractionParam float[] v1, float[] v2)
	{
		v1[0] *= v2[0];
		v1[1] *= v2[1];
		v1[2] *= v2[2];
		v1[3] *= v2[3];
		
		return v1;
	}
	
	public static float[] mulAssign(@ExtractionParam float[] v1, float v2)
	{
		v1[0] *= v2;
		v1[1] *= v2;
		v1[2] *= v2;
		v1[3] *= v2;
		
		return v1;
	}
	
	public static float[] mulAssign(@ExtractionParam float[] v1, float v2X, float v2Y, float v2Z, float v2W)
	{
		v1[0] *= v2X;
		v1[1] *= v2Y;
		v1[2] *= v2Z;
		v1[3] *= v2W;
		
		return v1;
	}
	
	public static float[] div(float[] v1, float[] v2, @ExtractionParam float[] res)
	{
		res[0] = v1[0] / v2[0];
		res[1] = v1[1] / v2[1];
		res[2] = v1[2] / v2[2];
		res[3] = v1[3] / v2[3];
		
		return res;
	}
	
	public static float[] div(float[] v1, float v2, @ExtractionParam float[] res)
	{
		res[0] = v1[0] / v2;
		res[1] = v1[1] / v2;
		res[2] = v1[2] / v2;
		res[3] = v1[3] / v2;
		
		return res;
	}
	
	public static float[] div(float[] v1, float v2X, float v2Y, float v2Z, float v2W, @ExtractionParam float[] res)
	{
		res[0] = v1[0] / v2X;
		res[1] = v1[1] / v2Y;
		res[2] = v1[2] / v2Z;
		res[3] = v1[3] / v2W;
		
		return res;
	}
	
	public static float[] div(float v1X, float v1Y, float v1Z, float v1W, float[] v2, @ExtractionParam float[] res)
	{
		res[0] = v1X / v2[0];
		res[1] = v1Y / v2[1];
		res[2] = v1Z / v2[2];
		res[3] = v1W / v2[3];
		
		return res;
	}
	
	public static float[] div(float v1X, float v1Y, float v1Z, float v1W, float v2X, float v2Y, float v2Z, float v2W, @ExtractionParam float[] res)
	{
		res[0] = v1X / v2X;
		res[1] = v1Y / v2Y;
		res[2] = v1Z / v2Z;
		res[3] = v1W / v2W;
		
		return res;
	}
	
	public static float[] divAssign(@ExtractionParam float[] v1, float[] v2)
	{
		v1[0] /= v2[0];
		v1[1] /= v2[1];
		v1[2] /= v2[2];
		v1[3] /= v2[3];
		
		return v1;
	}
	
	public static float[] divAssign(@ExtractionParam float[] v1, float v2)
	{
		v1[0] /= v2;
		v1[1] /= v2;
		v1[2] /= v2;
		v1[3] /= v2;
		
		return v1;
	}
	
	public static float[] divAssign(@ExtractionParam float[] v1, float v2X, float v2Y, float v2Z, float v2W)
	{
		v1[0] /= v2X;
		v1[1] /= v2Y;
		v1[2] /= v2Z;
		v1[3] /= v2W;
		
		return v1;
	}
	
	public static float[] revDiv(float[] v1, float[] v2, @ExtractionParam float[] res)
	{
		res[0] = v2[0] / v1[0];
		res[1] = v2[1] / v1[1];
		res[2] = v2[2] / v1[2];
		res[3] = v2[3] / v1[3];
		
		return res;
	}
	
	public static float[] revDiv(float[] v1, float v2, @ExtractionParam float[] res)
	{
		res[0] = v2 / v1[0];
		res[1] = v2 / v1[1];
		res[2] = v2 / v1[2];
		res[3] = v2 / v1[3];
		
		return res;
	}
	
	public static float[] revDiv(float[] v1, float v2X, float v2Y, float v2Z, float v2W, @ExtractionParam float[] res)
	{
		res[0] = v2X / v1[0];
		res[1] = v2Y / v1[1];
		res[2] = v2Z / v1[2];
		res[3] = v2W / v1[3];
		
		return res;
	}
	
	public static float[] revDiv(float v1X, float v1Y, float v1Z, float v1W, float[] v2, @ExtractionParam float[] res)
	{
		res[0] = v2[0] / v1X;
		res[1] = v2[1] / v1Y;
		res[2] = v2[2] / v1Z;
		res[3] = v2[3] / v1W;
		
		return res;
	}
	
	public static float[] revDiv(float v1X, float v1Y, float v1Z, float v1W, float v2X, float v2Y, float v2Z, float v2W, @ExtractionParam float[] res)
	{
		res[0] = v2X / v1X;
		res[1] = v2Y / v1Y;
		res[2] = v2Z / v1Z;
		res[3] = v2W / v1W;
		
		return res;
	}
	
	public static float[] revDivAssign(@ExtractionParam float[] v1, float[] v2)
	{
		v1[0] = v2[0] / v1[0];
		v1[1] = v2[1] / v1[1];
		v1[2] = v2[2] / v1[2];
		v1[3] = v2[3] / v1[3];
		
		return v1;
	}
	
	public static float[] revDivAssign(@ExtractionParam float[] v1, float v2)
	{
		v1[0] = v2 / v1[0];
		v1[1] = v2 / v1[1];
		v1[2] = v2 / v1[2];
		v1[3] = v2 / v1[3];
		
		return v1;
	}
	
	public static float[] revDivAssign(@ExtractionParam float[] v1, float v2X, float v2Y, float v2Z, float v2W)
	{
		v1[0] = v2X / v1[0];
		v1[1] = v2Y / v1[1];
		v1[2] = v2Z / v1[2];
		v1[3] = v2Z / v1[3];
		
		return v1;
	}
	
	public static float[] mulAdd(float[] v1, float[] v2, float[] v3, @ExtractionParam float[] res)
	{
		res[0] = Math.fma(v1[0], v2[0], v3[0]);
		res[1] = Math.fma(v1[1], v2[1], v3[1]);
		res[2] = Math.fma(v1[2], v2[2], v3[2]);
		res[3] = Math.fma(v1[3], v2[3], v3[3]);
		
		return res;
	}
	
	public static float[] mulAdd(float[] v1, float[] v2, float v3X, float v3Y, float v3Z, float v3W, @ExtractionParam float[] res)
	{
		res[0] = Math.fma(v1[0], v2[0], v3X);
		res[1] = Math.fma(v1[1], v2[1], v3Y);
		res[2] = Math.fma(v1[2], v2[2], v3Z);
		res[3] = Math.fma(v1[3], v2[3], v3W);
		
		return res;
	}
	
	public static float[] mulAdd(float[] v1, float v2X, float v2Y, float v2Z, float v2W, float[] v3, @ExtractionParam float[] res)
	{
		res[0] = Math.fma(v1[0], v2X, v3[0]);
		res[1] = Math.fma(v1[1], v2Y, v3[1]);
		res[2] = Math.fma(v1[2], v2Z, v3[2]);
		res[3] = Math.fma(v1[3], v2W, v3[3]);
		
		return res;
	}
	
	public static float[] mulAdd(float[] v1, float v2X, float v2Y, float v2Z, float v2W, float v3X, float v3Y, float v3Z, float v3W, @ExtractionParam float[] res)
	{
		res[0] = Math.fma(v1[0], v2X, v3X);
		res[1] = Math.fma(v1[1], v2Y, v3Y);
		res[2] = Math.fma(v1[2], v2Z, v3Z);
		res[3] = Math.fma(v1[3], v2W, v3W);
		
		return res;
	}
	
	public static float[] mulAdd(float v1X, float v1Y, float v1Z, float v1W, float[] v2, float[] v3, @ExtractionParam float[] res)
	{
		res[0] = Math.fma(v1X, v2[0], v3[0]);
		res[1] = Math.fma(v1Y, v2[1], v3[1]);
		res[2] = Math.fma(v1Z, v2[2], v3[2]);
		res[3] = Math.fma(v1W, v2[3], v3[3]);
		
		return res;
	}
	
	public static float[] mulAdd(float v1X, float v1Y, float v1Z, float v1W, float[] v2, float v3X, float v3Y, float v3Z, float v3W, @ExtractionParam float[] res)
	{
		res[0] = Math.fma(v1X, v2[0], v3X);
		res[1] = Math.fma(v1Y, v2[1], v3Y);
		res[2] = Math.fma(v1Z, v2[2], v3Z);
		res[3] = Math.fma(v1W, v2[3], v3W);
		
		return res;
	}
	
	public static float[] mulAdd(float v1X, float v1Y, float v1Z, float v1W, float v2X, float v2Y, float v2Z, float v2W, float[] v3, @ExtractionParam float[] res)
	{
		res[0] = Math.fma(v1X, v2X, v3[0]);
		res[1] = Math.fma(v1Y, v2Y, v3[1]);
		res[2] = Math.fma(v1Z, v2Z, v3[2]);
		res[3] = Math.fma(v1W, v2W, v3[3]);
		
		return res;
	}
	
	public static float[] mulAdd(float v1X, float v1Y, float v1Z, float v1W, float v2X, float v2Y, float v2Z, float v2W, float v3X, float v3Y, float v3Z, float v3W, @ExtractionParam float[] res)
	{
		res[0] = Math.fma(v1X, v2X, v3X);
		res[1] = Math.fma(v1Y, v2Y, v3Y);
		res[2] = Math.fma(v1Z, v2Z, v3Z);
		res[3] = Math.fma(v1W, v2W, v3W);
		
		return res;
	}
	
	public static float[] mulAddAssign(@ExtractionParam float[] v1, float[] v2, float[] v3)
	{
		v1[0] = Math.fma(v1[0], v2[0], v3[0]);
		v1[1] = Math.fma(v1[1], v2[1], v3[1]);
		v1[2] = Math.fma(v1[2], v2[2], v3[2]);
		v1[3] = Math.fma(v1[3], v2[3], v3[3]);
		
		return v1;
	}
	
	public static float[] mulAddAssign(@ExtractionParam float[] v1, float[] v2, float v3X, float v3Y, float v3Z, float v3W)
	{
		v1[0] = Math.fma(v1[0], v2[0], v3X);
		v1[1] = Math.fma(v1[1], v2[1], v3Y);
		v1[2] = Math.fma(v1[2], v2[2], v3Z);
		v1[3] = Math.fma(v1[3], v2[3], v3W);
		
		return v1;
	}
	
	public static float[] mulAddAssign(@ExtractionParam float[] v1, float v2X, float v2Y, float v2Z, float v2W, float[] v3)
	{
		v1[0] = Math.fma(v1[0], v2X, v3[0]);
		v1[1] = Math.fma(v1[1], v2Y, v3[1]);
		v1[2] = Math.fma(v1[2], v2Z, v3[2]);
		v1[3] = Math.fma(v1[3], v2W, v3[3]);
		
		return v1;
	}
	
	public static float[] mulAddAssign(@ExtractionParam float[] v1, float v2X, float v2Y, float v2Z, float v2W, float v3X, float v3Y, float v3Z, float v3W)
	{
		v1[0] = Math.fma(v1[0], v2X, v3X);
		v1[1] = Math.fma(v1[1], v2Y, v3Y);
		v1[2] = Math.fma(v1[2], v2Z, v3Z);
		v1[3] = Math.fma(v1[3], v2W, v3W);
		
		return v1;
	}
	
	public static float[] revMulAdd(float[] v1, float[] v2, float[] v3, @ExtractionParam float[] res)
	{
		res[0] = Math.fma(v2[0], v3[0], v1[0]);
		res[1] = Math.fma(v2[1], v3[1], v1[1]);
		res[2] = Math.fma(v2[2], v3[2], v1[2]);
		res[3] = Math.fma(v2[3], v3[3], v1[3]);
		
		return res;
	}
	
	public static float[] revMulAdd(float[] v1, float[] v2, float v3X, float v3Y, float v3Z, float v3W, @ExtractionParam float[] res)
	{
		res[0] = Math.fma(v2[0], v3X, v1[0]);
		res[1] = Math.fma(v2[1], v3Y, v1[1]);
		res[2] = Math.fma(v2[2], v3Z, v1[2]);
		res[3] = Math.fma(v2[3], v3W, v1[3]);
		
		return res;
	}
	
	public static float[] revMulAdd(float[] v1, float v2X, float v2Y, float v2Z, float v2W, float[] v3, @ExtractionParam float[] res)
	{
		res[0] = Math.fma(v2X, v3[0], v1[0]);
		res[1] = Math.fma(v2Y, v3[1], v1[1]);
		res[2] = Math.fma(v2Z, v3[2], v1[2]);
		res[3] = Math.fma(v2W, v3[3], v1[3]);
		
		return res;
	}
	
	public static float[] revMulAdd(float[] v1, float v2X, float v2Y, float v2Z, float v2W, float v3X, float v3Y, float v3Z, float v3W, @ExtractionParam float[] res)
	{
		res[0] = Math.fma(v2X, v3X, v1[0]);
		res[1] = Math.fma(v2Y, v3Y, v1[1]);
		res[2] = Math.fma(v2Z, v3Z, v1[2]);
		res[3] = Math.fma(v2W, v3W, v1[3]);
		
		return res;
	}
	
	public static float[] revMulAdd(float v1X, float v1Y, float v1Z, float v1W, float[] v2, float[] v3, @ExtractionParam float[] res)
	{
		res[0] = Math.fma(v2[0], v3[0], v1X);
		res[1] = Math.fma(v2[1], v3[1], v1Y);
		res[2] = Math.fma(v2[2], v3[2], v1Z);
		res[3] = Math.fma(v2[3], v3[3], v1W);
		
		return res;
	}
	
	public static float[] revMulAdd(float v1X, float v1Y, float v1Z, float v1W, float[] v2, float v3X, float v3Y, float v3Z, float v3W, @ExtractionParam float[] res)
	{
		res[0] = Math.fma(v2[0], v3X, v1X);
		res[1] = Math.fma(v2[1], v3Y, v1Y);
		res[2] = Math.fma(v2[2], v3Z, v1Z);
		res[3] = Math.fma(v2[3], v3W, v1W);
		
		return res;
	}
	
	public static float[] revMulAdd(float v1X, float v1Y, float v1Z, float v1W, float v2X, float v2Y, float v2Z, float v2W, float[] v3, @ExtractionParam float[] res)
	{
		res[0] = Math.fma(v2X, v3[0], v1X);
		res[1] = Math.fma(v2Y, v3[1], v1Y);
		res[2] = Math.fma(v2Z, v3[2], v1Z);
		res[3] = Math.fma(v2W, v3[3], v1W);
		
		return res;
	}
	
	public static float[] revMulAdd(float v1X, float v1Y, float v1Z, float v1W, float v2X, float v2Y, float v2Z, float v2W, float v3X, float v3Y, float v3Z, float v3W, @ExtractionParam float[] res)
	{
		res[0] = Math.fma(v2X, v3X, v1X);
		res[1] = Math.fma(v2Y, v3Y, v1Y);
		res[2] = Math.fma(v2Z, v3Z, v1Z);
		res[3] = Math.fma(v2W, v3W, v1W);
		
		return res;
	}
	
	public static float[] revMulAddAssign(@ExtractionParam float[] v1, float[] v2, float[] v3)
	{
		v1[0] = Math.fma(v2[0], v3[0], v1[0]);
		v1[1] = Math.fma(v2[1], v3[1], v1[1]);
		v1[2] = Math.fma(v2[2], v3[2], v1[2]);
		v1[3] = Math.fma(v2[3], v3[3], v1[3]);
		
		return v1;
	}
	
	public static float[] revMulAddAssign(@ExtractionParam float[] v1, float[] v2, float v3X, float v3Y, float v3Z, float v3W)
	{
		v1[0] = Math.fma(v2[0], v3X, v1[0]);
		v1[1] = Math.fma(v2[1], v3Y, v1[1]);
		v1[2] = Math.fma(v2[2], v3Z, v1[2]);
		v1[3] = Math.fma(v2[3], v3W, v1[3]);
		
		return v1;
	}
	
	public static float[] revMulAddAssign(@ExtractionParam float[] v1, float v2X, float v2Y, float v2Z, float v2W, float[] v3)
	{
		v1[0] = Math.fma(v2X, v3[0], v1[0]);
		v1[1] = Math.fma(v2Y, v3[1], v1[1]);
		v1[2] = Math.fma(v2Z, v3[2], v1[2]);
		v1[3] = Math.fma(v2W, v3[3], v1[3]);
		
		return v1;
	}
	
	public static float[] revMulAddAssign(@ExtractionParam float[] v1, float v2X, float v2Y, float v2Z, float v2W, float v3X, float v3Y, float v3Z, float v3W)
	{
		v1[0] = Math.fma(v2X, v3X, v1[0]);
		v1[1] = Math.fma(v2Y, v3Y, v1[1]);
		v1[2] = Math.fma(v2Z, v3Z, v1[2]);
		v1[3] = Math.fma(v2W, v3W, v1[3]);
		
		return v1;
	}
	
	public static float[] pow(float[] v1, float[] v2, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.pow(v1[0], v2[0]);
		res[1] = MathUtils.pow(v1[1], v2[1]);
		res[2] = MathUtils.pow(v1[2], v2[2]);
		res[3] = MathUtils.pow(v1[3], v2[3]);
		
		return res;
	}
	
	public static float[] pow(float[] v1, float v2, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.pow(v1[0], v2);
		res[1] = MathUtils.pow(v1[1], v2);
		res[2] = MathUtils.pow(v1[2], v2);
		res[3] = MathUtils.pow(v1[3], v2);
		
		return res;
	}
	
	public static float[] pow(float[] v1, float v2X, float v2Y, float v2Z, float v2W, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.pow(v1[0], v2X);
		res[1] = MathUtils.pow(v1[1], v2Y);
		res[2] = MathUtils.pow(v1[2], v2Z);
		res[3] = MathUtils.pow(v1[3], v2W);
		
		return res;
	}
	
	public static float[] pow(float v1X, float v1Y, float v1Z, float v1W, float[] v2, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.pow(v1X, v2[0]);
		res[1] = MathUtils.pow(v1Y, v2[1]);
		res[2] = MathUtils.pow(v1Z, v2[2]);
		res[3] = MathUtils.pow(v1W, v2[3]);
		
		return res;
	}
	
	public static float[] pow(float v1X, float v1Y, float v1Z, float v1W, float v2X, float v2Y, float v2Z, float v2W, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.pow(v1X, v2X);
		res[1] = MathUtils.pow(v1Y, v2Y);
		res[2] = MathUtils.pow(v1Z, v2Z);
		res[3] = MathUtils.pow(v1W, v2W);
		
		return res;
	}
	
	public static float[] powAssign(@ExtractionParam float[] v1, float[] v2)
	{
		v1[0] = MathUtils.pow(v1[0], v2[0]);
		v1[1] = MathUtils.pow(v1[1], v2[1]);
		v1[2] = MathUtils.pow(v1[2], v2[2]);
		v1[3] = MathUtils.pow(v1[3], v2[3]);
		
		return v1;
	}
	
	public static float[] powAssign(@ExtractionParam float[] v1, float v2)
	{
		v1[0] = MathUtils.pow(v1[0], v2);
		v1[1] = MathUtils.pow(v1[1], v2);
		v1[2] = MathUtils.pow(v1[2], v2);
		v1[3] = MathUtils.pow(v1[3], v2);
		
		return v1;
	}
	
	public static float[] powAssign(@ExtractionParam float[] v1, float v2X, float v2Y, float v2Z, float v2W)
	{
		v1[0] = MathUtils.pow(v1[0], v2X);
		v1[1] = MathUtils.pow(v1[1], v2Y);
		v1[2] = MathUtils.pow(v1[2], v2Z);
		v1[3] = MathUtils.pow(v1[3], v2W);
		
		return v1;
	}
	
	public static float[] revPow(float[] v1, float[] v2, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.pow(v2[0], v1[0]);
		res[1] = MathUtils.pow(v2[1], v1[1]);
		res[2] = MathUtils.pow(v2[2], v1[2]);
		res[3] = MathUtils.pow(v2[3], v1[3]);
		
		return res;
	}
	
	public static float[] revPow(float[] v1, float v2, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.pow(v2, v1[0]);
		res[1] = MathUtils.pow(v2, v1[1]);
		res[2] = MathUtils.pow(v2, v1[2]);
		res[3] = MathUtils.pow(v2, v1[3]);
		
		return res;
	}
	
	public static float[] revPow(float[] v1, float v2X, float v2Y, float v2Z, float v2W, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.pow(v2X, v1[0]);
		res[1] = MathUtils.pow(v2Y, v1[1]);
		res[2] = MathUtils.pow(v2Z, v1[2]);
		res[3] = MathUtils.pow(v2W, v1[3]);
		
		return res;
	}
	
	public static float[] revPow(float v1X, float v1Y, float v1Z, float v1W, float[] v2, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.pow(v2[0], v1X);
		res[1] = MathUtils.pow(v2[1], v1Y);
		res[2] = MathUtils.pow(v2[2], v1Z);
		res[3] = MathUtils.pow(v2[3], v1W);
		
		return res;
	}
	
	public static float[] revPow(float v1X, float v1Y, float v1Z, float v1W, float v2X, float v2Y, float v2Z, float v2W, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.pow(v2X, v1X);
		res[1] = MathUtils.pow(v2Y, v1Y);
		res[2] = MathUtils.pow(v2Z, v1Z);
		res[3] = MathUtils.pow(v2W, v1W);
		
		return res;
	}
	
	public static float[] revPowAssign(@ExtractionParam float[] v1, float[] v2)
	{
		v1[0] = MathUtils.pow(v2[0], v1[0]);
		v1[1] = MathUtils.pow(v2[1], v1[1]);
		v1[2] = MathUtils.pow(v2[2], v1[2]);
		v1[3] = MathUtils.pow(v2[3], v1[3]);
		
		return v1;
	}
	
	public static float[] revPowAssign(@ExtractionParam float[] v1, float v2)
	{
		v1[0] = MathUtils.pow(v2, v1[0]);
		v1[1] = MathUtils.pow(v2, v1[1]);
		v1[2] = MathUtils.pow(v2, v1[2]);
		v1[3] = MathUtils.pow(v2, v1[3]);
		
		return v1;
	}
	
	public static float[] revPowAssign(@ExtractionParam float[] v1, float v2X, float v2Y, float v2Z, float v2W)
	{
		v1[0] = MathUtils.pow(v2X, v1[0]);
		v1[1] = MathUtils.pow(v2Y, v1[1]);
		v1[2] = MathUtils.pow(v2Z, v1[2]);
		v1[3] = MathUtils.pow(v2W, v1[3]);
		
		return v1;
	}
	
	public static float[] sqrt(float[] v1, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.sqrt(v1[0]);
		res[1] = MathUtils.sqrt(v1[1]);
		res[2] = MathUtils.sqrt(v1[2]);
		res[3] = MathUtils.sqrt(v1[3]);
		
		return res;
	}
	
	public static float[] sqrt(float v1X, float v1Y, float v1Z, float v1W, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.sqrt(v1X);
		res[1] = MathUtils.sqrt(v1Y);
		res[2] = MathUtils.sqrt(v1Z);
		res[3] = MathUtils.sqrt(v1W);
		
		return res;
	}
	
	public static float[] sqrtAssign(@ExtractionParam float[] v1)
	{
		v1[0] = MathUtils.sqrt(v1[0]);
		v1[1] = MathUtils.sqrt(v1[1]);
		v1[2] = MathUtils.sqrt(v1[2]);
		v1[3] = MathUtils.sqrt(v1[3]);
		
		return v1;
	}
	
	public static float[] invSqrt(float[] v1, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.invSqrt(v1[0]);
		res[1] = MathUtils.invSqrt(v1[1]);
		res[2] = MathUtils.invSqrt(v1[2]);
		res[3] = MathUtils.invSqrt(v1[3]);
		
		return res;
	}
	
	public static float[] invSqrt(float v1X, float v1Y, float v1Z, float v1W, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.invSqrt(v1X);
		res[1] = MathUtils.invSqrt(v1Y);
		res[2] = MathUtils.invSqrt(v1Z);
		res[3] = MathUtils.invSqrt(v1W);
		
		return res;
	}
	
	public static float[] invSqrtAssign(@ExtractionParam float[] v1)
	{
		v1[0] = MathUtils.invSqrt(v1[0]);
		v1[1] = MathUtils.invSqrt(v1[1]);
		v1[2] = MathUtils.invSqrt(v1[2]);
		v1[3] = MathUtils.invSqrt(v1[3]);
		
		return v1;
	}
	
	public static float[] cbrt(float[] v1, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.cbrt(v1[0]);
		res[1] = MathUtils.cbrt(v1[1]);
		res[2] = MathUtils.cbrt(v1[2]);
		res[2] = MathUtils.cbrt(v1[3]);
		
		return res;
	}
	
	public static float[] cbrt(float v1X, float v1Y, float v1Z, float v1W, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.cbrt(v1X);
		res[1] = MathUtils.cbrt(v1Y);
		res[2] = MathUtils.cbrt(v1Z);
		res[3] = MathUtils.cbrt(v1W);
		
		return res;
	}
	
	public static float[] cbrtAssign(@ExtractionParam float[] v1)
	{
		v1[0] = MathUtils.cbrt(v1[0]);
		v1[1] = MathUtils.cbrt(v1[1]);
		v1[2] = MathUtils.cbrt(v1[2]);
		v1[3] = MathUtils.cbrt(v1[3]);
		
		return v1;
	}
	
	public static float[] invCbrt(float[] v1, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.invCbrt(v1[0]);
		res[1] = MathUtils.invCbrt(v1[1]);
		res[2] = MathUtils.invCbrt(v1[2]);
		res[3] = MathUtils.invCbrt(v1[3]);
		
		return res;
	}
	
	public static float[] invCbrt(float v1X, float v1Y, float v1Z, float v1W, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.invCbrt(v1X);
		res[1] = MathUtils.invCbrt(v1Y);
		res[2] = MathUtils.invCbrt(v1Z);
		res[3] = MathUtils.invCbrt(v1W);
		
		return res;
	}
	
	public static float[] invCbrtASsign(@ExtractionParam float[] v1)
	{
		v1[0] = MathUtils.invCbrt(v1[0]);
		v1[1] = MathUtils.invCbrt(v1[1]);
		v1[2] = MathUtils.invCbrt(v1[2]);
		v1[3] = MathUtils.invCbrt(v1[3]);
		
		return v1;
	}
	
	public static float[] abs(float[] v1, @ExtractionParam float[] res)
	{
		res[0] = Math.abs(v1[0]);
		res[1] = Math.abs(v1[1]);
		res[2] = Math.abs(v1[2]);
		res[3] = Math.abs(v1[3]);
		
		return res;
	}
	
	public static float[] abs(float v1X, float v1Y, float v1Z, float v1W, @ExtractionParam float[] res)
	{
		res[0] = Math.abs(v1X);
		res[1] = Math.abs(v1Y);
		res[2] = Math.abs(v1Z);
		res[3] = Math.abs(v1W);
		
		return res;
	}
	
	public static float[] absAssign(@ExtractionParam float[] v1)
	{
		v1[0] = Math.abs(v1[0]);
		v1[1] = Math.abs(v1[1]);
		v1[2] = Math.abs(v1[2]);
		v1[3] = Math.abs(v1[3]);
		
		return v1;
	}
	
	public static float[] reciprocal(float[] v1, @ExtractionParam float[] res)
	{
		res[0] = 1.0f / v1[0];
		res[1] = 1.0f / v1[1];
		res[2] = 1.0f / v1[2];
		res[3] = 1.0f / v1[3];
		
		return res;
	}
	
	public static float[] reciprocal(float v1X, float v1Y, float v1Z, float v1W, @ExtractionParam float[] res)
	{
		res[0] = 1.0f / v1X;
		res[1] = 1.0f / v1Y;
		res[2] = 1.0f / v1Z;
		res[3] = 1.0f / v1W;
		
		return res;
	}
	
	public static float[] reciprocalAssign(@ExtractionParam float[] v1)
	{
		v1[0] = 1.0f / v1[0];
		v1[1] = 1.0f / v1[1];
		v1[2] = 1.0f / v1[2];
		v1[3] = 1.0f / v1[3];
		
		return v1;
	}
	
	public static float[] negate(float[] v1, @ExtractionParam float[] res)
	{
		res[0] = -v1[0];
		res[1] = -v1[1];
		res[2] = -v1[2];
		res[3] = -v1[3];
		
		return res;
	}
	
	public static float[] negate(float v1X, float v1Y, float v1Z, float v1W, @ExtractionParam float[] res)
	{
		res[0] = -v1X;
		res[1] = -v1Y;
		res[2] = -v1Z;
		res[3] = -v1W;
		
		return res;
	}
	
	public static float[] negateAssign(@ExtractionParam float[] v1)
	{
		v1[0] = -v1[0];
		v1[1] = -v1[1];
		v1[2] = -v1[2];
		v1[3] = -v1[3];
		
		return v1;
	}
	
	public static float[] squared(float[] v1, @ExtractionParam float[] res)
	{
		float v1X = v1[0];
		float v1Y = v1[1];
		float v1Z = v1[2];
		float v1W = v1[3];
		
		res[0] = v1X * v1X;
		res[1] = v1Y * v1Y;
		res[2] = v1Z * v1Z;
		res[3] = v1W * v1W;
		
		return res;
	}
	
	public static float[] squared(float v1X, float v1Y, float v1Z, float v1W, @ExtractionParam float[] res)
	{
		res[0] = v1X * v1X;
		res[1] = v1Y * v1Y;
		res[2] = v1Z * v1Z;
		res[3] = v1W * v1W;
		
		return res;
	}
	
	public static float[] squaredASsign(@ExtractionParam float[] v1)
	{
		v1[0] *= v1[0];
		v1[1] *= v1[1];
		v1[2] *= v1[2];
		v1[3] *= v1[3];
		
		return v1;
	}
	
	public static float[] sin(float[] v1, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.sin(v1[0]);
		res[1] = MathUtils.sin(v1[1]);
		res[2] = MathUtils.sin(v1[2]);
		res[3] = MathUtils.sin(v1[3]);
		
		return res;
	}
	
	public static float[] sin(float v1X, float v1Y, float v1Z, float v1W, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.sin(v1X);
		res[1] = MathUtils.sin(v1Y);
		res[2] = MathUtils.sin(v1Z);
		res[3] = MathUtils.sin(v1W);
		
		return res;
	}
	
	public static float[] sinAssign(@ExtractionParam float[] v1)
	{
		v1[0] = MathUtils.sin(v1[0]);
		v1[1] = MathUtils.sin(v1[1]);
		v1[2] = MathUtils.sin(v1[2]);
		v1[3] = MathUtils.sin(v1[3]);
		
		return v1;
	}
	
	public static float[] asin(float[] v1, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.asin(v1[0]);
		res[1] = MathUtils.asin(v1[1]);
		res[2] = MathUtils.asin(v1[2]);
		res[3] = MathUtils.asin(v1[3]);
		
		return res;
	}
	
	public static float[] asin(float v1X, float v1Y, float v1Z, float v1W, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.asin(v1X);
		res[1] = MathUtils.asin(v1Y);
		res[2] = MathUtils.asin(v1Z);
		res[3] = MathUtils.asin(v1W);
		
		return res;
	}
	
	public static float[] asinAssign(@ExtractionParam float[] v1)
	{
		v1[0] = MathUtils.asin(v1[0]);
		v1[1] = MathUtils.asin(v1[1]);
		v1[2] = MathUtils.asin(v1[2]);
		v1[3] = MathUtils.asin(v1[3]);
		
		return v1;
	}
	
	public static float[] sinh(float[] v1, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.sinh(v1[0]);
		res[1] = MathUtils.sinh(v1[1]);
		res[2] = MathUtils.sinh(v1[2]);
		res[3] = MathUtils.sinh(v1[3]);
		
		return res;
	}
	
	public static float[] sinh(float v1X, float v1Y, float v1Z, float v1W, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.sinh(v1X);
		res[1] = MathUtils.sinh(v1Y);
		res[2] = MathUtils.sinh(v1Z);
		res[3] = MathUtils.sinh(v1W);
		
		return res;
	}
	
	public static float[] sinhAssign(@ExtractionParam float[] v1)
	{
		v1[0] = MathUtils.sinh(v1[0]);
		v1[1] = MathUtils.sinh(v1[1]);
		v1[2] = MathUtils.sinh(v1[2]);
		v1[3] = MathUtils.sinh(v1[3]);
		
		return v1;
	}
	
	public static float[] cos(float[] v1, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.cos(v1[0]);
		res[1] = MathUtils.cos(v1[1]);
		res[2] = MathUtils.cos(v1[2]);
		res[3] = MathUtils.cos(v1[3]);
		
		return res;
	}
	
	public static float[] cos(float v1X, float v1Y, float v1Z, float v1W, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.cos(v1X);
		res[1] = MathUtils.cos(v1Y);
		res[2] = MathUtils.cos(v1Z);
		res[3] = MathUtils.cos(v1W);
		
		return res;
	}
	
	public static float[] cosAssign(@ExtractionParam float[] v1)
	{
		v1[0] = MathUtils.cos(v1[0]);
		v1[1] = MathUtils.cos(v1[1]);
		v1[2] = MathUtils.cos(v1[2]);
		v1[3] = MathUtils.cos(v1[3]);
		
		return v1;
	}
	
	public static float[] acos(float[] v1, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.acos(v1[0]);
		res[1] = MathUtils.acos(v1[1]);
		res[2] = MathUtils.acos(v1[2]);
		res[3] = MathUtils.acos(v1[3]);
		
		return res;
	}
	
	public static float[] acos(float v1X, float v1Y, float v1Z, float v1W, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.acos(v1X);
		res[1] = MathUtils.acos(v1Y);
		res[2] = MathUtils.acos(v1Z);
		res[3] = MathUtils.acos(v1W);
		
		return res;
	}
	
	public static float[] acosAssign(@ExtractionParam float[] v1)
	{
		v1[0] = MathUtils.acos(v1[0]);
		v1[1] = MathUtils.acos(v1[1]);
		v1[2] = MathUtils.acos(v1[2]);
		v1[3] = MathUtils.acos(v1[3]);
		
		return v1;
	}
	
	public static float[] cosh(float[] v1, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.cosh(v1[0]);
		res[1] = MathUtils.cosh(v1[1]);
		res[2] = MathUtils.cosh(v1[2]);
		res[3] = MathUtils.cosh(v1[3]);
		
		return res;
	}
	
	public static float[] cosh(float v1X, float v1Y, float v1Z, float v1W, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.cosh(v1X);
		res[1] = MathUtils.cosh(v1Y);
		res[2] = MathUtils.cosh(v1Z);
		res[3] = MathUtils.cosh(v1W);
		
		return res;
	}
	
	public static float[] coshAssign(@ExtractionParam float[] v1)
	{
		v1[0] = MathUtils.cosh(v1[0]);
		v1[1] = MathUtils.cosh(v1[1]);
		v1[2] = MathUtils.cosh(v1[2]);
		v1[3] = MathUtils.cosh(v1[3]);
		
		return v1;
	}
	
	public static float[] tan(float[] v1, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.tan(v1[0]);
		res[1] = MathUtils.tan(v1[1]);
		res[2] = MathUtils.tan(v1[2]);
		res[3] = MathUtils.tan(v1[3]);
		
		return res;
	}
	
	public static float[] tan(float v1X, float v1Y, float v1Z, float v1W, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.tan(v1X);
		res[1] = MathUtils.tan(v1Y);
		res[2] = MathUtils.tan(v1Z);
		res[3] = MathUtils.tan(v1W);
		
		return res;
	}
	
	public static float[] tanAssign(@ExtractionParam float[] v1)
	{
		v1[0] = MathUtils.tan(v1[0]);
		v1[1] = MathUtils.tan(v1[1]);
		v1[2] = MathUtils.tan(v1[2]);
		v1[3] = MathUtils.tan(v1[3]);
		
		return v1;
	}
	
	public static float[] atan(float[] v1, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.atan(v1[0]);
		res[1] = MathUtils.atan(v1[1]);
		res[2] = MathUtils.atan(v1[2]);
		res[3] = MathUtils.atan(v1[3]);
		
		return res;
	}
	
	public static float[] atan(float v1X, float v1Y, float v1Z, float v1W, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.atan(v1X);
		res[1] = MathUtils.atan(v1Y);
		res[2] = MathUtils.atan(v1Z);
		res[3] = MathUtils.atan(v1W);
		
		return res;
	}
	
	public static float[] atanAssign(@ExtractionParam float[] v1)
	{
		v1[0] = MathUtils.atan(v1[0]);
		v1[1] = MathUtils.atan(v1[1]);
		v1[2] = MathUtils.atan(v1[2]);
		v1[3] = MathUtils.atan(v1[3]);
		
		return v1;
	}
	
	public static float[] tanh(float[] v1, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.tanh(v1[0]);
		res[1] = MathUtils.tanh(v1[1]);
		res[2] = MathUtils.tanh(v1[2]);
		res[3] = MathUtils.tanh(v1[3]);
		
		return res;
	}
	
	public static float[] tanh(float v1X, float v1Y, float v1Z, float v1W, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.tanh(v1X);
		res[1] = MathUtils.tanh(v1Y);
		res[2] = MathUtils.tanh(v1Z);
		res[3] = MathUtils.tanh(v1W);
		
		return res;
	}
	
	public static float[] tanhAssign(@ExtractionParam float[] v1)
	{
		v1[0] = MathUtils.tanh(v1[0]);
		v1[1] = MathUtils.tanh(v1[1]);
		v1[2] = MathUtils.tanh(v1[2]);
		v1[3] = MathUtils.tanh(v1[3]);
		
		return v1;
	}
	
	public static float minValue(float[] v1)
	{
		return MathUtils.min(v1[0], v1[1], v1[2], v1[3]);
	}
	
	public static float minValue(float v1X, float v1Y, float v1Z, float v1W)
	{
		return MathUtils.min(v1X, v1Y, v1Z, v1W);
	}
	
	public static int minComponent(float[] v1)
	{
		float value = v1[0];
		int index = 0;

		float v1Y = v1[1];
		

		if (v1Y < value)
		{
			index = 1;
			value = v1Y;
		}
		
		float v1Z = v1[2];
		
		if (v1Z < value)
		{
			index = 2;
			value = v1Z;
		}
		
		float v1W = v1[3];
		
		if (v1W < value)
		{
			index = 3;
		}
		
		return index;
	}
	
	public static int minComponent(float v1X, float v1Y, float v1Z, float v1W)
	{
		float value = v1X;
		int index = 0;

		if (v1Y < value)
		{
			index = 1;
			value = v1Y;
		}
		
		if (v1Z < value)
		{
			index = 2;
			value = v1Z;
		}
		
		if (v1W < value)
		{
			index = 3;
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
		
		float v1Z = v1[2];
		
		if (v1Z < value)
		{
			value = v1Z;
			index = 2;
		}
		
		float v1W = v1[3];
		
		if (v1W < value)
		{
			value = v1W;
			index = 3;
		}
		
		res.set(value, index);

		return res;
	}
	
	public static IndexValuePairF min(float v1X, float v1Y, float v1Z, float v1W, @ExtractionParam IndexValuePairF res)
	{
		float value = v1X;
		int index = 0;
		
		if (v1Y < value)
		{
			value = v1Y;
			index = 1;
		}
		
		if (v1Z < value)
		{
			value = v1Z;
			index = 2;
		}
		
		if (v1W < value)
		{
			value = v1W;
			index = 3;
		}
		
		res.set(value, index);

		return res;
	}
	
	public static float[] min(float[] v1, float[] v2, @ExtractionParam float[] res)
	{
		res[0] = Math.min(v1[0], v2[0]);
		res[1] = Math.min(v1[1], v2[1]);
		res[2] = Math.min(v1[2], v2[2]);
		res[3] = Math.min(v1[3], v2[3]);
		
		return res;
	}
	
	public static float[] min(float[] v1, float v2, @ExtractionParam float[] res)
	{
		res[0] = Math.min(v1[0], v2);
		res[1] = Math.min(v1[1], v2);
		res[2] = Math.min(v1[2], v2);
		res[3] = Math.min(v1[3], v2);
		
		return res;
	}
	
	public static float[] min(float[] v1, float v2X, float v2Y, float v2Z, float v2W, @ExtractionParam float[] res)
	{
		res[0] = Math.min(v1[0], v2X);
		res[1] = Math.min(v1[1], v2Y);
		res[2] = Math.min(v1[2], v2Z);
		res[3] = Math.min(v1[3], v2W);
		
		return res;
	}
	
	public static float[] min(float v1X, float v1Y, float v1Z, float v1W, float[] v2, @ExtractionParam float[] res)
	{
		res[0] = Math.min(v1X, v2[0]);
		res[1] = Math.min(v1Y, v2[1]);
		res[2] = Math.min(v1Z, v2[2]);
		res[3] = Math.min(v1W, v2[3]);
		
		return res;
	}
	
	public static float[] min(float v1X, float v1Y, float v1Z, float v1W, float v2X, float v2Y, float v2Z, float v2W, @ExtractionParam float[] res)
	{
		res[0] = Math.min(v1X, v2X);
		res[1] = Math.min(v1Y, v2Y);
		res[2] = Math.min(v1Z, v2Z);
		res[3] = Math.min(v1W, v2W);
		
		return res;
	}
	
	public static float[] minAssign(@ExtractionParam float[] v1, float[] v2)
	{
		v1[0] = Math.min(v1[0], v2[0]);
		v1[1] = Math.min(v1[1], v2[1]);
		v1[2] = Math.min(v1[2], v2[2]);
		v1[3] = Math.min(v1[3], v2[3]);
		
		return v1;
	}
	
	public static float[] minAssign(@ExtractionParam float[] v1, float v2)
	{
		v1[0] = Math.min(v1[0], v2);
		v1[1] = Math.min(v1[1], v2);
		v1[2] = Math.min(v1[2], v2);
		v1[3] = Math.min(v1[3], v2);
		
		return v1;
	}
	
	public static float[] minAssign(@ExtractionParam float[] v1, float v2X, float v2Y, float v2Z, float v2W)
	{
		v1[0] = Math.min(v1[0], v2X);
		v1[1] = Math.min(v1[1], v2Y);
		v1[2] = Math.min(v1[2], v2Z);
		v1[3] = Math.min(v1[3], v2W);
		
		return v1;
	}
	
	public static float maxValue(float[] v1)
	{
		return MathUtils.max(v1[0], v1[1], v1[2], v1[3]);
	}
	
	public static float maxValue(float v1X, float v1Y, float v1Z, float v1W)
	{
		return MathUtils.max(v1X, v1Y, v1Z, v1W);
	}
	
	public static int maxComponent(float[] v1)
	{
		float value = v1[0];
		int index = 0;

		float v1Y = v1[1];

		if (v1Y > value)
		{
			index = 1;
			value = v1Y;
		}
		
		float v1Z = v1[2];

		if (v1Z > value)
		{
			index = 2;
			value = v1Z;
		}
		
		float v1W = v1[3];

		if (v1W > value)
		{
			index = 3;
		}
		
		return index;
	}
	
	public static int maxComponent(float v1X, float v1Y, float v1Z, float v1W)
	{
		float value = v1X;
		int index = 0;

		if (v1Y > value)
		{
			index = 1;
			value = v1Y;
		}
		
		if (v1Z > value)
		{
			index = 2;
			value = v1Z;
		}
		
		if (v1W > value)
		{
			index = 3;
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

		float v1Z = v1[2];

		if (v1Z < value)
		{
			value = v1Z;
			index = 2;
		}
		
		float v1W = v1[3];

		if (v1W < value)
		{
			value = v1W;
			index = 3;
		}
		
		res.set(value, index);

		return res;
	}

	public static IndexValuePairF max(float v1X, float v1Y, float v1Z, float v1W, @ExtractionParam IndexValuePairF res)
	{
		float value = v1X;
		int index = 0;

		if (v1Y > value)
		{
			value = v1Y;
			index = 1;
		}

		if (v1Z > value)
		{
			value = v1Z;
			index = 2;
		}
		
		if (v1W > value)
		{
			value = v1W;
			index = 3;
		}
		
		res.set(value, index);

		return res;
	}
	
	public static float[] max(float[] v1, float[] v2, @ExtractionParam float[] res)
	{
		res[0] = Math.max(v1[0], v2[0]);
		res[1] = Math.max(v1[1], v2[1]);
		res[2] = Math.max(v1[2], v2[2]);
		res[3] = Math.max(v1[3], v2[3]);
		
		return res;
	}
	
	public static float[] max(float[] v1, float v2, @ExtractionParam float[] res)
	{
		res[0] = Math.max(v1[0], v2);
		res[1] = Math.max(v1[1], v2);
		res[2] = Math.max(v1[2], v2);
		res[3] = Math.max(v1[3], v2);
		
		return res;
	}
	
	public static float[] max(float[] v1, float v2X, float v2Y, float v2Z, float v2W, @ExtractionParam float[] res)
	{
		res[0] = Math.max(v1[0], v2X);
		res[1] = Math.max(v1[1], v2Y);
		res[2] = Math.max(v1[2], v2Z);
		res[3] = Math.max(v1[3], v2W);
		
		return res;
	}
	
	public static float[] max(float v1X, float v1Y, float v1Z, float v1W, float[] v2, @ExtractionParam float[] res)
	{
		res[0] = Math.max(v1X, v2[0]);
		res[1] = Math.max(v1Y, v2[1]);
		res[2] = Math.max(v1Z, v2[2]);
		res[3] = Math.max(v1W, v2[3]);
		
		return res;
	}
	
	public static float[] max(float v1X, float v1Y, float v1Z, float v1W, float v2X, float v2Y, float v2Z, float v2W, @ExtractionParam float[] res)
	{
		res[0] = Math.max(v1X, v2X);
		res[1] = Math.max(v1Y, v2Y);
		res[2] = Math.max(v1Z, v2Z);
		res[3] = Math.max(v1W, v2W);
		
		return res;
	}
	
	public static float[] maxAssign(@ExtractionParam float[] v1, float[] v2)
	{
		v1[0] = Math.max(v1[0], v2[0]);
		v1[1] = Math.max(v1[1], v2[1]);
		v1[2] = Math.max(v1[2], v2[2]);
		v1[3] = Math.max(v1[3], v2[3]);
		
		return v1;
	}
	
	public static float[] maxAssign(@ExtractionParam float[] v1, float v2)
	{
		v1[0] = Math.max(v1[0], v2);
		v1[1] = Math.max(v1[1], v2);
		v1[2] = Math.max(v1[2], v2);
		v1[3] = Math.max(v1[3], v2);
		
		return v1;
	}
	
	public static float[] maxAssign(@ExtractionParam float[] v1, float v2X, float v2Y, float v2Z, float v2W)
	{
		v1[0] = Math.max(v1[0], v2X);
		v1[1] = Math.max(v1[1], v2Y);
		v1[2] = Math.max(v1[2], v2Z);
		v1[3] = Math.max(v1[2], v2W);
		
		return v1;
	}
	
	public static float[] signum(float[] v1, @ExtractionParam float[] res)
	{
		res[0] = Math.signum(v1[0]);
		res[1] = Math.signum(v1[1]);
		res[2] = Math.signum(v1[2]);
		res[3] = Math.signum(v1[3]);
		
		return res;
	}
	
	public static float[] signum(float v1X, float v1Y, float v1Z, float v1W, @ExtractionParam float[] res)
	{
		res[0] = Math.signum(v1X);
		res[1] = Math.signum(v1Y);
		res[2] = Math.signum(v1Z);
		res[3] = Math.signum(v1W);
		
		return res;
	}
	
	public static float[] signumAssign(@ExtractionParam float[] v1)
	{
		v1[0] = Math.signum(v1[0]);
		v1[1] = Math.signum(v1[1]);
		v1[2] = Math.signum(v1[2]);
		v1[3] = Math.signum(v1[3]);
		
		return v1;
	}
	
	public static float[] signumEps(float tolerance, float[] v1, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.signumEps(tolerance, v1[0]);
		res[1] = MathUtils.signumEps(tolerance, v1[1]);
		res[2] = MathUtils.signumEps(tolerance, v1[2]);
		res[3] = MathUtils.signumEps(tolerance, v1[3]);
		
		return res;
	}
	
	public static float[] signumEps(float tolerance, float v1X, float v1Y, float v1Z, float v1W, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.signumEps(tolerance, v1X);
		res[1] = MathUtils.signumEps(tolerance, v1Y);
		res[2] = MathUtils.signumEps(tolerance, v1Z);
		res[3] = MathUtils.signumEps(tolerance, v1W);
		
		return res;
	}
	
	public static float[] signumEpsAssign(float tolerance, @ExtractionParam float[] v1)
	{
		v1[0] = MathUtils.signumEps(tolerance, v1[0]);
		v1[1] = MathUtils.signumEps(tolerance, v1[1]);
		v1[2] = MathUtils.signumEps(tolerance, v1[2]);
		v1[3] = MathUtils.signumEps(tolerance, v1[3]);
		
		return v1;
	}
	
	public static float[] signumEps4(float[] v1, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.signumEps4(v1[0]);
		res[1] = MathUtils.signumEps4(v1[1]);
		res[2] = MathUtils.signumEps4(v1[2]);
		res[3] = MathUtils.signumEps4(v1[3]);
		
		return res;
	}
	
	public static float[] signumEps4(float v1X, float v1Y, float v1Z, float v1W, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.signumEps4(v1X);
		res[1] = MathUtils.signumEps4(v1Y);
		res[2] = MathUtils.signumEps4(v1Z);
		res[3] = MathUtils.signumEps4(v1W);
		
		return res;
	}
	
	public static float[] signumEps4Assign(@ExtractionParam float[] v1)
	{
		v1[0] = MathUtils.signumEps4(v1[0]);
		v1[1] = MathUtils.signumEps4(v1[1]);
		v1[2] = MathUtils.signumEps4(v1[2]);
		v1[3] = MathUtils.signumEps4(v1[3]);
		
		return v1;
	}
	
	public static float[] signumEps6(float[] v1, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.signumEps6(v1[0]);
		res[1] = MathUtils.signumEps6(v1[1]);
		res[2] = MathUtils.signumEps6(v1[2]);
		res[3] = MathUtils.signumEps6(v1[2]);
		
		return res;
	}
	
	public static float[] signumEps6(float v1X, float v1Y, float v1Z, float v1W, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.signumEps6(v1X);
		res[1] = MathUtils.signumEps6(v1Y);
		res[2] = MathUtils.signumEps6(v1Z);
		res[3] = MathUtils.signumEps6(v1W);
		
		return res;
	}
	
	public static float[] signumEps6Assign(@ExtractionParam float[] v1)
	{
		v1[0] = MathUtils.signumEps6(v1[0]);
		v1[1] = MathUtils.signumEps6(v1[1]);
		v1[2] = MathUtils.signumEps6(v1[2]);
		v1[3] = MathUtils.signumEps6(v1[3]);
		
		return v1;
	}
	
	public static float[] signumEps8(float[] v1, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.signumEps8(v1[0]);
		res[1] = MathUtils.signumEps8(v1[1]);
		res[2] = MathUtils.signumEps8(v1[2]);
		res[3] = MathUtils.signumEps8(v1[3]);
		
		return res;
	}
	
	public static float[] signumEps8(float v1X, float v1Y, float v1Z, float v1W, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.signumEps8(v1X);
		res[1] = MathUtils.signumEps8(v1Y);
		res[2] = MathUtils.signumEps8(v1Z);
		res[3] = MathUtils.signumEps8(v1W);
		
		return res;
	}
	
	public static float[] signumEps8Assign(@ExtractionParam float[] v1)
	{
		v1[0] = MathUtils.signumEps8(v1[0]);
		v1[1] = MathUtils.signumEps8(v1[1]);
		v1[2] = MathUtils.signumEps8(v1[2]);
		v1[3] = MathUtils.signumEps8(v1[3]);
		
		return v1;
	}
	
	public static float[] clampMin(float[] v1, float[] min, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.clampMin(v1[0], min[0]);
		res[1] = MathUtils.clampMin(v1[1], min[1]);
		res[2] = MathUtils.clampMin(v1[2], min[2]);
		res[3] = MathUtils.clampMin(v1[3], min[3]);
		
		return res;
	}
	
	public static float[] clampMin(float[] v1, float min, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.clampMin(v1[0], min);
		res[1] = MathUtils.clampMin(v1[1], min);
		res[2] = MathUtils.clampMin(v1[2], min);
		res[3] = MathUtils.clampMin(v1[3], min);
		
		return res;
	}
	
	public static float[] clampMin(float[] v1, float minX, float minY, float minZ, float minW, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.clampMin(v1[0], minX);
		res[1] = MathUtils.clampMin(v1[1], minY);
		res[2] = MathUtils.clampMin(v1[2], minZ);
		res[3] = MathUtils.clampMin(v1[3], minW);
		
		return res;
	}
	
	public static float[] clampMin(float v1X, float v1Y, float v1Z, float v1W, float[] min, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.clampMin(v1X, min[0]);
		res[1] = MathUtils.clampMin(v1Y, min[1]);
		res[2] = MathUtils.clampMin(v1Z, min[2]);
		res[3] = MathUtils.clampMin(v1W, min[3]);
		
		return res;
	}
	
	public static float[] clampMin(float v1X, float v1Y, float v1Z, float v1W, float minX, float minY, float minZ, float minW, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.clampMin(v1X, minX);
		res[1] = MathUtils.clampMin(v1Y, minY);
		res[2] = MathUtils.clampMin(v1Z, minZ);
		res[3] = MathUtils.clampMin(v1W, minW);
		
		return res;
	}
	
	public static float[] clampMinAssign(@ExtractionParam float[] v1, float[] min)
	{
		v1[0] = MathUtils.clampMin(v1[0], min[0]);
		v1[1] = MathUtils.clampMin(v1[1], min[1]);
		v1[2] = MathUtils.clampMin(v1[2], min[2]);
		v1[3] = MathUtils.clampMin(v1[3], min[3]);
		
		return v1;
	}
	
	public static float[] clampMinAssign(@ExtractionParam float[] v1, float min)
	{
		v1[0] = MathUtils.clampMin(v1[0], min);
		v1[1] = MathUtils.clampMin(v1[1], min);
		v1[2] = MathUtils.clampMin(v1[2], min);
		v1[3] = MathUtils.clampMin(v1[3], min);
		
		return v1;
	}
	
	public static float[] clampMinAssign(@ExtractionParam float[] v1, float minX, float minY, float minZ, float minW)
	{
		v1[0] = MathUtils.clampMin(v1[0], minX);
		v1[1] = MathUtils.clampMin(v1[1], minY);
		v1[2] = MathUtils.clampMin(v1[2], minZ);
		v1[3] = MathUtils.clampMin(v1[3], minW);
		
		return v1;
	}
	
	public static float[] clampMax(float[] v1, float[] max, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.clampMax(v1[0], max[0]);
		res[1] = MathUtils.clampMax(v1[1], max[1]);
		res[2] = MathUtils.clampMax(v1[2], max[2]);
		res[3] = MathUtils.clampMax(v1[3], max[3]);
		
		return res;
	}
	
	public static float[] clampMax(float[] v1, float max, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.clampMax(v1[0], max);
		res[1] = MathUtils.clampMax(v1[1], max);
		res[2] = MathUtils.clampMax(v1[2], max);
		res[3] = MathUtils.clampMax(v1[3], max);
		
		return res;
	}
	
	public static float[] clampMax(float[] v1, float maxX, float maxY, float maxZ, float maxW, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.clampMax(v1[0], maxX);
		res[1] = MathUtils.clampMax(v1[1], maxY);
		res[2] = MathUtils.clampMax(v1[2], maxZ);
		res[3] = MathUtils.clampMax(v1[3], maxW);
		
		return res;
	}
	
	public static float[] clampMax(float v1X, float v1Y, float v1Z, float v1W, float[] max, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.clampMax(v1X, max[0]);
		res[1] = MathUtils.clampMax(v1Y, max[1]);
		res[2] = MathUtils.clampMax(v1Z, max[2]);
		res[3] = MathUtils.clampMax(v1W, max[3]);
		
		return res;
	}
	
	public static float[] clampMax(float v1X, float v1Y, float v1Z, float v1W, float maxX, float maxY, float maxZ, float maxW, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.clampMax(v1X, maxX);
		res[1] = MathUtils.clampMax(v1Y, maxY);
		res[2] = MathUtils.clampMax(v1Z, maxZ);
		res[3] = MathUtils.clampMax(v1W, maxW);
		
		return res;
	}
	
	public static float[] clampMaxAssign(@ExtractionParam float[] v1, float[] max)
	{
		v1[0] = MathUtils.clampMax(v1[0], max[0]);
		v1[1] = MathUtils.clampMax(v1[1], max[1]);
		v1[2] = MathUtils.clampMax(v1[2], max[2]);
		v1[3] = MathUtils.clampMax(v1[3], max[3]);
		
		return v1;
	}
	
	public static float[] clampMaxAssign(@ExtractionParam float[] v1, float max)
	{
		v1[0] = MathUtils.clampMax(v1[0], max);
		v1[1] = MathUtils.clampMax(v1[1], max);
		v1[2] = MathUtils.clampMax(v1[2], max);
		v1[3] = MathUtils.clampMax(v1[3], max);
		
		return v1;
	}
	
	public static float[] clampMaxAssign(@ExtractionParam float[] v1, float maxX, float maxY, float maxZ, float maxW)
	{
		v1[0] = MathUtils.clampMax(v1[0], maxX);
		v1[1] = MathUtils.clampMax(v1[1], maxY);
		v1[2] = MathUtils.clampMax(v1[2], maxZ);
		v1[3] = MathUtils.clampMax(v1[3], maxW);
		
		return v1;
	}
	
	public static float[] clamp(float[] v1, float[] min, float[] max, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.clamp(v1[0], min[0], max[0]);
		res[1] = MathUtils.clamp(v1[1], min[1], max[1]);
		res[2] = MathUtils.clamp(v1[2], min[2], max[2]);
		res[3] = MathUtils.clamp(v1[3], min[3], max[3]);
		
		return res;
	}
	
	public static float[] clamp(float[] v1, float[] min, float maxX, float maxY, float maxZ, float maxW, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.clamp(v1[0], min[0], maxX);
		res[1] = MathUtils.clamp(v1[1], min[1], maxY);
		res[2] = MathUtils.clamp(v1[2], min[2], maxZ);
		res[3] = MathUtils.clamp(v1[3], min[3], maxW);
		
		return res;
	}
	
	public static float[] clamp(float[] v1, float min, float max, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.clamp(v1[0], min, max);
		res[1] = MathUtils.clamp(v1[1], min, max);
		res[2] = MathUtils.clamp(v1[2], min, max);
		res[3] = MathUtils.clamp(v1[3], min, max);
		
		return res;
	}
	
	public static float[] clamp(float[] v1, float minX, float minY, float minZ, float minW, float[] max, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.clamp(v1[0], minX, max[0]);
		res[1] = MathUtils.clamp(v1[1], minY, max[1]);
		res[2] = MathUtils.clamp(v1[2], minZ, max[2]);
		res[3] = MathUtils.clamp(v1[3], minW, max[3]);
		
		return res;
	}
	
	public static float[] clamp(float[] v1, float minX, float minY, float minZ, float minW, float maxX, float maxY, float maxZ, float maxW, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.clamp(v1[0], minX, maxX);
		res[1] = MathUtils.clamp(v1[1], minY, maxY);
		res[2] = MathUtils.clamp(v1[2], minZ, maxZ);
		res[3] = MathUtils.clamp(v1[3], minW, maxW);
		
		return res;
	}
	
	public static float[] clamp(float v1X, float v1Y, float v1Z, float v1W, float[] min, float[] max, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.clamp(v1X, min[0], max[0]);
		res[1] = MathUtils.clamp(v1Y, min[1], max[1]);
		res[2] = MathUtils.clamp(v1Z, min[2], max[2]);
		res[3] = MathUtils.clamp(v1W, min[3], max[3]);
		
		return res;
	}
	
	public static float[] clamp(float v1X, float v1Y, float v1Z, float v1W, float[] min, float maxX, float maxY, float maxZ, float maxW, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.clamp(v1X, min[0], maxX);
		res[1] = MathUtils.clamp(v1Y, min[1], maxY);
		res[2] = MathUtils.clamp(v1Z, min[2], maxZ);
		res[3] = MathUtils.clamp(v1W, min[3], maxW);
		
		return res;
	}
	
	public static float[] clamp(float v1X, float v1Y, float v1Z, float v1W, float minX, float minY, float minZ, float minW, float[] max, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.clamp(v1X, minX, max[0]);
		res[1] = MathUtils.clamp(v1Y, minY, max[1]);
		res[2] = MathUtils.clamp(v1Z, minZ, max[2]);
		res[3] = MathUtils.clamp(v1W, minW, max[3]);
		
		return res;
	}
	
	public static float[] clamp(float v1X, float v1Y, float v1Z, float v1W, float minX, float minY, float minZ, float minW, float maxX, float maxY, float maxZ, float maxW, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.clamp(v1X, minX, maxX);
		res[1] = MathUtils.clamp(v1Y, minY, maxY);
		res[2] = MathUtils.clamp(v1Z, minZ, maxZ);
		res[3] = MathUtils.clamp(v1W, minW, maxW);
		
		return res;
	}
	
	public static float[] clampAssign(@ExtractionParam float[] v1, float[] min, float[] max)
	{
		v1[0] = MathUtils.clamp(v1[0], min[0], max[0]);
		v1[1] = MathUtils.clamp(v1[1], min[1], max[1]);
		v1[2] = MathUtils.clamp(v1[2], min[2], max[2]);
		v1[3] = MathUtils.clamp(v1[3], min[3], max[3]);
		
		return v1;
	}
	
	public static float[] clampAssign(@ExtractionParam float[] v1, float[] min, float maxX, float maxY, float maxZ, float maxW)
	{
		v1[0] = MathUtils.clamp(v1[0], min[0], maxX);
		v1[1] = MathUtils.clamp(v1[1], min[1], maxY);
		v1[2] = MathUtils.clamp(v1[2], min[2], maxZ);
		v1[3] = MathUtils.clamp(v1[3], min[3], maxW);
		
		return v1;
	}
	
	public static float[] clampAssign(@ExtractionParam float[] v1, float min, float max)
	{
		v1[0] = MathUtils.clamp(v1[0], min, max);
		v1[1] = MathUtils.clamp(v1[1], min, max);
		v1[2] = MathUtils.clamp(v1[2], min, max);
		v1[3] = MathUtils.clamp(v1[3], min, max);
		
		return v1;
	}
	
	public static float[] clampAssign(@ExtractionParam float[] v1, float minX, float minY, float minZ, float minW, float[] max)
	{
		v1[0] = MathUtils.clamp(v1[0], minX, max[0]);
		v1[1] = MathUtils.clamp(v1[1], minY, max[1]);
		v1[2] = MathUtils.clamp(v1[2], minZ, max[2]);
		v1[3] = MathUtils.clamp(v1[3], minW, max[3]);
		
		return v1;
	}
	
	public static float[] clampAssign(@ExtractionParam float[] v1, float minX, float minY, float minZ, float minW, float maxX, float maxY, float maxZ, float maxW)
	{
		v1[0] = MathUtils.clamp(v1[0], minX, maxX);
		v1[1] = MathUtils.clamp(v1[1], minY, maxY);
		v1[2] = MathUtils.clamp(v1[2], minZ, maxZ);
		v1[3] = MathUtils.clamp(v1[3], minW, maxW);
		
		return v1;
	}
	
	public static float[] swizzle(float[] v1, int[] indices, @ExtractionParam float[] res)
	{
		float v1X = v1[0];
		float v1Y = v1[1];
		float v1Z = v1[2];
		float v1W = v1[3];
		
		float x = switch (indices[0]) {
			case 0 -> v1X;
			case 1 -> v1Y;
			case 2 -> v1Z;
			case 3 -> v1W;
			default -> throw new IndexOutOfBoundsException();
		};

		float y = switch (indices[1]) {
			case 0 -> v1X;
			case 1 -> v1Y;
			case 2 -> v1Z;
			case 3 -> v1W;
			default -> throw new IndexOutOfBoundsException();
		};

		float z = switch (indices[2]) {
			case 0 -> v1X;
			case 1 -> v1Y;
			case 2 -> v1Z;
			case 3 -> v1W;
			default -> throw new IndexOutOfBoundsException();
		};
		
		float w = switch (indices[3]) {
			case 0 -> v1X;
			case 1 -> v1Y;
			case 2 -> v1Z;
			case 3 -> v1W;
			default -> throw new IndexOutOfBoundsException();
		};
		
		res[0] = x;
		res[1] = y;
		res[2] = z;
		res[3] = w;

		return res;
	}

	public static float[] swizzle(float[] v1, int indexX, int indexY, int indexZ, int indexW, @ExtractionParam float[] res)
	{
		float v1X = v1[0];
		float v1Y = v1[1];
		float v1Z = v1[2];
		float v1W = v1[3];
		
		float x = switch (indexX) {
			case 0 -> v1X;
			case 1 -> v1Y;
			case 2 -> v1Z;
			case 3 -> v1W;
			default -> throw new IndexOutOfBoundsException();
		};

		float y = switch (indexY) {
			case 0 -> v1X;
			case 1 -> v1Y;
			case 2 -> v1Z;
			case 3 -> v1W;
			default -> throw new IndexOutOfBoundsException();
		};

		float z = switch (indexZ) {
			case 0 -> v1X;
			case 1 -> v1Y;
			case 2 -> v1Z;
			case 3 -> v1W;
			default -> throw new IndexOutOfBoundsException();
		};
		
		float w = switch (indexW) {
			case 0 -> v1X;
			case 1 -> v1Y;
			case 2 -> v1Z;
			case 3 -> v1W;
			default -> throw new IndexOutOfBoundsException();
		};
		
		res[0] = x;
		res[1] = y;
		res[2] = z;
		res[3] = w;
		
		return res;
	}
	
	public static float[] swizzle(float v1X, float v1Y, float v1Z, float v1W, int[] indices, @ExtractionParam float[] res)
	{
		float x = switch (indices[0]) {
			case 0 -> v1X;
			case 1 -> v1Y;
			case 2 -> v1Z;
			case 3 -> v1W;
			default -> throw new IndexOutOfBoundsException();
		};

		float y = switch (indices[1]) {
			case 0 -> v1X;
			case 1 -> v1Y;
			case 2 -> v1Z;
			case 3 -> v1W;
			default -> throw new IndexOutOfBoundsException();
		};

		float z = switch (indices[2]) {
			case 0 -> v1X;
			case 1 -> v1Y;
			case 2 -> v1Z;
			case 3 -> v1W;
			default -> throw new IndexOutOfBoundsException();
		};
		
		float w = switch (indices[3]) {
			case 0 -> v1X;
			case 1 -> v1Y;
			case 2 -> v1Z;
			case 3 -> v1W;
			default -> throw new IndexOutOfBoundsException();
		};
		
		res[0] = x;
		res[1] = y;
		res[2] = z;
		res[3] = w;

		return res;
	}
	
	public static float[] swizzle(float v1X, float v1Y, float v1Z, float v1W, int indexX, int indexY, int indexZ, int indexW, @ExtractionParam float[] res)
	{
		float x = switch (indexX) {
			case 0 -> v1X;
			case 1 -> v1Y;
			case 2 -> v1Z;
			case 3 -> v1W;
			default -> throw new IndexOutOfBoundsException();
		};

		float y = switch (indexY) {
			case 0 -> v1X;
			case 1 -> v1Y;
			case 2 -> v1Z;
			case 3 -> v1W;
			default -> throw new IndexOutOfBoundsException();
		};

		float z = switch (indexZ) {
			case 0 -> v1X;
			case 1 -> v1Y;
			case 2 -> v1Z;
			case 3 -> v1W;
			default -> throw new IndexOutOfBoundsException();
		};
		
		float w = switch (indexW) {
			case 0 -> v1X;
			case 1 -> v1Y;
			case 2 -> v1Z;
			case 3 -> v1W;
			default -> throw new IndexOutOfBoundsException();
		};
		
		res[0] = x;
		res[1] = y;
		res[2] = z;
		res[3] = w;

		return res;
	}

	public static float[] swizzleAssign(@ExtractionParam float[] v1, int[] indices)
	{
		float v1X = v1[0];
		float v1Y = v1[1];
		float v1Z = v1[2];
		float v1W = v1[3];
		
		float x = switch (indices[0]) {
			case 0 -> v1X;
			case 1 -> v1Y;
			case 2 -> v1Z;
			case 3 -> v1W;
			default -> throw new IndexOutOfBoundsException();
		};

		float y = switch (indices[1]) {
			case 0 -> v1X;
			case 1 -> v1Y;
			case 2 -> v1Z;
			case 3 -> v1W;
			default -> throw new IndexOutOfBoundsException();
		};

		float z = switch (indices[2]) {
			case 0 -> v1X;
			case 1 -> v1Y;
			case 2 -> v1Z;
			case 3 -> v1W;
			default -> throw new IndexOutOfBoundsException();
		};
		
		float w = switch (indices[2]) {
			case 0 -> v1X;
			case 1 -> v1Y;
			case 2 -> v1Z;
			case 3 -> v1W;
			default -> throw new IndexOutOfBoundsException();
		};
		
		v1[0] = x;
		v1[1] = y;
		v1[2] = z;
		v1[3] = w;

		return v1;
	}
	
	public static float[] swizzleAssign(@ExtractionParam float[] v1, int indexX, int indexY, int indexZ, int indexW)
	{
		float v1X = v1[0];
		float v1Y = v1[1];
		float v1Z = v1[2];
		float v1W = v1[3];
		
		float x = switch (indexX) {
			case 0 -> v1X;
			case 1 -> v1Y;
			case 2 -> v1Z;
			case 3 -> v1W;
			default -> throw new IndexOutOfBoundsException();
		};

		float y = switch (indexY) {
			case 0 -> v1X;
			case 1 -> v1Y;
			case 2 -> v1Z;
			case 3 -> v1W;
			default -> throw new IndexOutOfBoundsException();
		};

		float z = switch (indexZ) {
			case 0 -> v1X;
			case 1 -> v1Y;
			case 2 -> v1Z;
			case 3 -> v1W;
			default -> throw new IndexOutOfBoundsException();
		};
		
		float w = switch (indexW) {
		case 0 -> v1X;
		case 1 -> v1Y;
		case 2 -> v1Z;
		case 3 -> v1W;
		default -> throw new IndexOutOfBoundsException();
	};
		
		v1[0] = x;
		v1[1] = y;
		v1[2] = z;
		v1[3] = w;
		
		return v1;
	}
	
	public static float[] swap(float[] v1, int[] indices, @ExtractionParam float[] res)
	{
		float v1X = v1[0];
		float v1Y = v1[1];
		float v1Z = v1[2];
		float v1W = v1[3];
		
		int indexA = indices[0];
		int indexB = indices[1];
		
		if(indexA == indexB)
		{
			res[0] = v1X;
			res[1] = v1Y;
			res[2] = v1Z;
			res[3] = v1W;
			
			return res;
		}
		
		float a = switch(indexA) {
			case 0 -> v1X;
			case 1 -> v1Y;
			case 2 -> v1Z;
			case 3 -> v1W;
			default -> throw new IndexOutOfBoundsException();
		};
		
		float b = switch(indexB) {
			case 0 -> v1X;
			case 1 -> v1Y;
			case 2 -> v1Z;
			case 3 -> v1W;
			default -> throw new IndexOutOfBoundsException();
		};
		
		float rX = v1X;
		float rY = v1Y;
		float rZ = v1Z;
		float rW = v1W;
		
		switch(indexB) {
			case 0: rX = a; break;
			case 1: rY = a; break;
			case 2: rZ = a; break;
			case 3: rW = a; break;
			default: throw new IndexOutOfBoundsException();
		}
		
		switch(indexA) {
			case 0: rX = b; break;
			case 1: rY = b; break;
			case 2: rZ = b; break;
			case 3: rW = b; break;
			default: throw new IndexOutOfBoundsException();
		}
		
		res[0] = rX;
		res[1] = rY;
		res[2] = rZ;
		res[3] = rW;

		return res;
	}
	
	public static float[] swap(float[] v1, int indexA, int indexB, @ExtractionParam float[] res)
	{
		float v1X = v1[0];
		float v1Y = v1[1];
		float v1Z = v1[2];
		float v1W = v1[3];
		
		if(indexA == indexB)
		{
			res[0] = v1X;
			res[1] = v1Y;
			res[2] = v1Z;
			res[3] = v1W;
			
			return res;
		}
		
		float a = switch(indexA) {
			case 0 -> v1X;
			case 1 -> v1Y;
			case 2 -> v1Z;
			case 3 -> v1W;
			default -> throw new IndexOutOfBoundsException();
		};
		
		float b = switch(indexB) {
			case 0 -> v1X;
			case 1 -> v1Y;
			case 2 -> v1Z;
			case 3 -> v1W;
			default -> throw new IndexOutOfBoundsException();
		};
		
		float rX = v1X;
		float rY = v1Y;
		float rZ = v1Z;
		float rW = v1W;
		
		switch(indexB) {
			case 0: rX = a; break;
			case 1: rY = a; break;
			case 2: rZ = a; break;
			case 3: rW = a; break;
			default: throw new IndexOutOfBoundsException();
		}
		
		switch(indexA) {
			case 0: rX = b; break;
			case 1: rY = b; break;
			case 2: rZ = b; break;
			case 3: rW = b; break;
			default: throw new IndexOutOfBoundsException();
		}
		
		res[0] = rX;
		res[1] = rY;
		res[2] = rZ;
		res[3] = rW;

		return res;
	}

	public static float[] swap(float v1X, float v1Y, float v1Z, float v1W, int[] indices, @ExtractionParam float[] res)
	{
		int indexA = indices[0];
		int indexB = indices[1];
		
		if(indexA == indexB)
		{
			res[0] = v1X;
			res[1] = v1Y;
			res[2] = v1Z;
			res[3] = v1W;
			
			return res;
		}
		
		float a = switch(indexA) {
			case 0 -> v1X;
			case 1 -> v1Y;
			case 2 -> v1Z;
			case 3 -> v1W;
			default -> throw new IndexOutOfBoundsException();
		};
		
		float b = switch(indexB) {
			case 0 -> v1X;
			case 1 -> v1Y;
			case 2 -> v1Z;
			case 3 -> v1W;
			default -> throw new IndexOutOfBoundsException();
		};
		
		float rX = v1X;
		float rY = v1Y;
		float rZ = v1Z;
		float rW = v1W;
		
		switch(indexB) {
			case 0: rX = a; break;
			case 1: rY = a; break;
			case 2: rZ = a; break;
			case 3: rW = a; break;
			default: throw new IndexOutOfBoundsException();
		}
		
		switch(indexA) {
			case 0: rX = b; break;
			case 1: rY = b; break;
			case 2: rZ = b; break;
			case 3: rW = b; break;
			default: throw new IndexOutOfBoundsException();
		}
		
		res[0] = rX;
		res[1] = rY;
		res[2] = rZ;
		res[3] = rW;

		return res;
	}
	
	public static float[] swap(float v1X, float v1Y, float v1Z, float v1W, int indexA, int indexB, @ExtractionParam float[] res)
	{
		if(indexA == indexB)
		{
			res[0] = v1X;
			res[1] = v1Y;
			res[2] = v1Z;
			res[3] = v1W;
			
			return res;
		}
		
		float a = switch(indexA) {
			case 0 -> v1X;
			case 1 -> v1Y;
			case 2 -> v1Z;
			case 3 -> v1W;
			default -> throw new IndexOutOfBoundsException();
		};
		
		float b = switch(indexB) {
			case 0 -> v1X;
			case 1 -> v1Y;
			case 2 -> v1Z;
			case 3 -> v1W;
			default -> throw new IndexOutOfBoundsException();
		};
		
		float rX = v1X;
		float rY = v1Y;
		float rZ = v1Z;
		float rW = v1W;
		
		switch(indexB) {
			case 0: rX = a; break;
			case 1: rY = a; break;
			case 2: rZ = a; break;
			case 3: rW = a; break;
			default: throw new IndexOutOfBoundsException();
		}
		
		switch(indexA) {
			case 0: rX = b; break;
			case 1: rY = b; break;
			case 2: rZ = b; break;
			case 3: rW = b; break;
			default: throw new IndexOutOfBoundsException();
		}
		
		res[0] = rX;
		res[1] = rY;
		res[2] = rZ;
		res[3] = rW;

		return res;
	}

	public static float[] swapAssign(@ExtractionParam float[] v1, int[] indices)
	{
		int indexA = indices[0];
		int indexB = indices[1];
		
		if(indexA == indexB) return v1;
		
		float v1X = v1[0];
		float v1Y = v1[1];
		float v1Z = v1[2];
		float v1W = v1[3];
		
		float a = switch(indexA) {
			case 0 -> v1X;
			case 1 -> v1Y;
			case 2 -> v1Z;
			case 3 -> v1W;
			default -> throw new IndexOutOfBoundsException();
		};
		
		float b = switch(indexB) {
			case 0 -> v1X;
			case 1 -> v1Y;
			case 2 -> v1Z;
			case 3 -> v1W;
			default -> throw new IndexOutOfBoundsException();
		};
		
		float rX = v1X;
		float rY = v1Y;
		float rZ = v1Z;
		float rW = v1W;
		
		switch(indexB) {
			case 0: rX = a; break;
			case 1: rY = a; break;
			case 2: rZ = a; break;
			case 3: rW = a; break;
			default: throw new IndexOutOfBoundsException();
		}
		
		switch(indexA) {
			case 0: rX = b; break;
			case 1: rY = b; break;
			case 2: rZ = b; break;
			case 3: rW = b; break;
			default: throw new IndexOutOfBoundsException();
		}
		
		v1[0] = rX;
		v1[1] = rY;
		v1[2] = rZ;
		v1[3] = rW;

		return v1;
	}
	
	public static float[] swapAssign(@ExtractionParam float[] v1, int indexA, int indexB)
	{
		if(indexA == indexB) return v1;
		
		float v1X = v1[0];
		float v1Y = v1[1];
		float v1Z = v1[2];
		float v1W = v1[3];
		
		float a = switch(indexA) {
			case 0 -> v1X;
			case 1 -> v1Y;
			case 2 -> v1Z;
			case 3 -> v1W;
			default -> throw new IndexOutOfBoundsException();
		};
		
		float b = switch(indexB) {
			case 0 -> v1X;
			case 1 -> v1Y;
			case 2 -> v1Z;
			case 3 -> v1W;
			default -> throw new IndexOutOfBoundsException();
		};
		
		float rX = v1X;
		float rY = v1Y;
		float rZ = v1Z;
		float rW = v1W;
		
		switch(indexB) {
			case 0: rX = a; break;
			case 1: rY = a; break;
			case 2: rZ = a; break;
			case 3: rW = a; break;
			default: throw new IndexOutOfBoundsException();
		}
		
		switch(indexA) {
			case 0: rX = b; break;
			case 1: rY = b; break;
			case 2: rZ = b; break;
			case 3: rW = b; break;
			default: throw new IndexOutOfBoundsException();
		}
		
		v1[0] = rX;
		v1[1] = rY;
		v1[2] = rZ;
		v1[3] = rW;

		return v1;
	}
	
	public static float[] swapXY(float[] v1, @ExtractionParam float[] res)
	{
		float v1X = v1[0];
		float v1Y = v1[1];
		float v1Z = v1[2];
		float v1W = v1[3];
		
		res[0] = v1Y;
		res[1] = v1X;
		res[2] = v1Z;
		res[3] = v1W;

		return res;
	}

	public static float[] swapXY(float v1X, float v1Y, float v1Z, float v1W, @ExtractionParam float[] res)
	{
		res[0] = v1Y;
		res[1] = v1X;
		res[2] = v1Z;
		res[3] = v1W;

		return res;
	}
	
	public static float[] swapXYAssign(@ExtractionParam float[] v1)
	{
		float v1X = v1[0];
		float v1Y = v1[1];
		float v1Z = v1[2];
		float v1W = v1[3];
		
		v1[0] = v1Y;
		v1[1] = v1X;
		v1[2] = v1Z;
		v1[3] = v1W;

		return v1;
	}
	
	public static float[] swapXZ(float[] v1, @ExtractionParam float[] res)
	{
		float v1X = v1[0];
		float v1Y = v1[1];
		float v1Z = v1[2];
		float v1W = v1[3];
		
		res[0] = v1Z;
		res[1] = v1Y;
		res[2] = v1X;
		res[3] = v1W;

		return res;
	}

	public static float[] swapXZ(float v1X, float v1Y, float v1Z, float v1W, @ExtractionParam float[] res)
	{
		res[0] = v1Z;
		res[1] = v1Y;
		res[2] = v1X;
		res[3] = v1W;

		return res;
	}
	
	public static float[] swapXZAssign(@ExtractionParam float[] v1)
	{
		float v1X = v1[0];
		float v1Y = v1[1];
		float v1Z = v1[2];
		float v1W = v1[3];
		
		v1[0] = v1Z;
		v1[1] = v1Y;
		v1[2] = v1X;
		v1[3] = v1W;

		return v1;
	}
	
	public static float[] swapXW(float[] v1, @ExtractionParam float[] res)
	{
		float v1X = v1[0];
		float v1Y = v1[1];
		float v1Z = v1[2];
		float v1W = v1[3];
		
		res[0] = v1W;
		res[1] = v1Y;
		res[2] = v1Z;
		res[3] = v1X;

		return res;
	}

	public static float[] swapXW(float v1X, float v1Y, float v1Z, float v1W, @ExtractionParam float[] res)
	{
		res[0] = v1W;
		res[1] = v1Y;
		res[2] = v1Z;
		res[3] = v1X;

		return res;
	}
	
	public static float[] swapXWAssign(@ExtractionParam float[] v1)
	{
		float v1X = v1[0];
		float v1Y = v1[1];
		float v1Z = v1[2];
		float v1W = v1[3];
		
		v1[0] = v1W;
		v1[1] = v1Y;
		v1[2] = v1Z;
		v1[3] = v1X;

		return v1;
	}
	
	public static float[] swapYZ(float[] v1, @ExtractionParam float[] res)
	{
		float v1X = v1[0];
		float v1Y = v1[1];
		float v1Z = v1[2];
		float v1W = v1[3];
		
		res[0] = v1X;
		res[1] = v1Z;
		res[2] = v1Y;
		res[3] = v1W;
		
		return res;
	}

	public static float[] swapYZ(float v1X, float v1Y, float v1Z, float v1W, @ExtractionParam float[] res)
	{
		res[0] = v1X;
		res[1] = v1Z;
		res[2] = v1Y;
		res[3] = v1W;

		return res;
	}
	
	public static float[] swapYZAssign(@ExtractionParam float[] v1)
	{
		float v1X = v1[0];
		float v1Y = v1[1];
		float v1Z = v1[2];
		float v1W = v1[3];
		
		v1[0] = v1X;
		v1[1] = v1Z;
		v1[2] = v1Y;
		v1[3] = v1W;

		return v1;
	}
	
	public static float[] swapYW(float[] v1, @ExtractionParam float[] res)
	{
		float v1X = v1[0];
		float v1Y = v1[1];
		float v1Z = v1[2];
		float v1W = v1[3];
		
		res[0] = v1X;
		res[1] = v1W;
		res[2] = v1Z;
		res[3] = v1Y;
		
		return res;
	}

	public static float[] swapYW(float v1X, float v1Y, float v1Z, float v1W, @ExtractionParam float[] res)
	{
		res[0] = v1X;
		res[1] = v1W;
		res[2] = v1Z;
		res[3] = v1Y;

		return res;
	}
	
	public static float[] swapYWAssign(@ExtractionParam float[] v1)
	{
		float v1X = v1[0];
		float v1Y = v1[1];
		float v1Z = v1[2];
		float v1W = v1[3];
		
		v1[0] = v1X;
		v1[1] = v1W;
		v1[2] = v1Z;
		v1[3] = v1Y;

		return v1;
	}
	
	public static float[] swapZW(float[] v1, @ExtractionParam float[] res)
	{
		float v1X = v1[0];
		float v1Y = v1[1];
		float v1Z = v1[2];
		float v1W = v1[3];
		
		res[0] = v1X;
		res[1] = v1Y;
		res[2] = v1W;
		res[3] = v1Z;
		
		return res;
	}

	public static float[] swapZW(float v1X, float v1Y, float v1Z, float v1W, @ExtractionParam float[] res)
	{
		res[0] = v1X;
		res[1] = v1Y;
		res[2] = v1W;
		res[3] = v1Z;

		return res;
	}
	
	public static float[] swapZWAssign(@ExtractionParam float[] v1)
	{
		float v1X = v1[0];
		float v1Y = v1[1];
		float v1Z = v1[2];
		float v1W = v1[3];
		
		v1[0] = v1X;
		v1[1] = v1Y;
		v1[2] = v1W;
		v1[3] = v1Z;

		return v1;
	}
	
	public static float[] integer(float[] v1, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.integer(v1[0]);
		res[1] = MathUtils.integer(v1[1]);
		res[2] = MathUtils.integer(v1[2]);
		res[3] = MathUtils.integer(v1[3]);
		
		return res;
	}
	
	public static float[] integer(float v1X, float v1Y, float v1Z, float v1W, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.integer(v1X);
		res[1] = MathUtils.integer(v1Y);
		res[2] = MathUtils.integer(v1Z);
		res[3] = MathUtils.integer(v1W);
		
		return res;
	}
	
	public static float[] integerAssign(@ExtractionParam float[] v1)
	{
		v1[0] = MathUtils.integer(v1[0]);
		v1[1] = MathUtils.integer(v1[1]);
		v1[2] = MathUtils.integer(v1[2]);
		v1[3] = MathUtils.integer(v1[3]);
		
		return v1;
	}
	
	public static float[] frac(float[] v1, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.frac(v1[0]);
		res[1] = MathUtils.frac(v1[1]);
		res[2] = MathUtils.frac(v1[2]);
		res[3] = MathUtils.frac(v1[3]);
		
		return res;
	}
	
	public static float[] frac(float v1X, float v1Y, float v1Z, float v1W, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.frac(v1X);
		res[1] = MathUtils.frac(v1Y);
		res[2] = MathUtils.frac(v1Z);
		res[3] = MathUtils.frac(v1W);
		
		return res;
	}
	
	public static float[] fracAssign(@ExtractionParam float[] v1)
	{
		v1[0] = MathUtils.frac(v1[0]);
		v1[1] = MathUtils.frac(v1[1]);
		v1[2] = MathUtils.frac(v1[2]);
		v1[3] = MathUtils.frac(v1[3]);
		
		return v1;
	}
	
	public static float[] sanitizeEps(float tolerance, float[] v1, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.sanitizeEps(tolerance, v1[0]);
		res[1] = MathUtils.sanitizeEps(tolerance, v1[1]);
		res[2] = MathUtils.sanitizeEps(tolerance, v1[2]);
		res[3] = MathUtils.sanitizeEps(tolerance, v1[3]);
		
		return res;
	}
	
	public static float[] sanitizeEps(float tolerance, float v1X, float v1Y, float v1Z, float v1W, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.sanitizeEps(tolerance, v1X);
		res[1] = MathUtils.sanitizeEps(tolerance, v1Y);
		res[2] = MathUtils.sanitizeEps(tolerance, v1Z);
		res[3] = MathUtils.sanitizeEps(tolerance, v1W);
		
		return res;
	}
	
	public static float[] sanitizeEpsAssign(float tolerance, @ExtractionParam float[] v1)
	{
		v1[0] = MathUtils.sanitizeEps(tolerance, v1[0]);
		v1[1] = MathUtils.sanitizeEps(tolerance, v1[1]);
		v1[2] = MathUtils.sanitizeEps(tolerance, v1[2]);
		v1[3] = MathUtils.sanitizeEps(tolerance, v1[3]);
		
		return v1;
	}
	
	public static float[] sanitizeEps4(float[] v1, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.sanitizeEps4(v1[0]);
		res[1] = MathUtils.sanitizeEps4(v1[1]);
		res[2] = MathUtils.sanitizeEps4(v1[2]);
		res[3] = MathUtils.sanitizeEps4(v1[3]);
		
		return res;
	}
	
	public static float[] sanitizeEps4(float v1X, float v1Y, float v1Z, float v1W, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.sanitizeEps4(v1X);
		res[1] = MathUtils.sanitizeEps4(v1Y);
		res[2] = MathUtils.sanitizeEps4(v1Z);
		res[3] = MathUtils.sanitizeEps4(v1W);
		
		return res;
	}
	
	public static float[] sanitizeEps4Assign(@ExtractionParam float[] v1)
	{
		v1[0] = MathUtils.sanitizeEps4(v1[0]);
		v1[1] = MathUtils.sanitizeEps4(v1[1]);
		v1[2] = MathUtils.sanitizeEps4(v1[2]);
		v1[3] = MathUtils.sanitizeEps4(v1[3]);
		
		return v1;
	}
	
	public static float[] sanitizeEps6(float[] v1, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.sanitizeEps6(v1[0]);
		res[1] = MathUtils.sanitizeEps6(v1[1]);
		res[2] = MathUtils.sanitizeEps6(v1[2]);
		res[3] = MathUtils.sanitizeEps6(v1[3]);
		
		return res;
	}
	
	public static float[] sanitizeEps6(float v1X, float v1Y, float v1Z, float v1W, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.sanitizeEps6(v1X);
		res[1] = MathUtils.sanitizeEps6(v1Y);
		res[2] = MathUtils.sanitizeEps6(v1Z);
		res[3] = MathUtils.sanitizeEps6(v1W);
		
		return res;
	}
	
	public static float[] sanitizeEps6Assign(@ExtractionParam float[] v1)
	{
		v1[0] = MathUtils.sanitizeEps6(v1[0]);
		v1[1] = MathUtils.sanitizeEps6(v1[1]);
		v1[2] = MathUtils.sanitizeEps6(v1[2]);
		v1[3] = MathUtils.sanitizeEps6(v1[3]);
		
		return v1;
	}
	
	public static float[] sanitizeEps8(float[] v1, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.sanitizeEps8(v1[0]);
		res[1] = MathUtils.sanitizeEps8(v1[1]);
		res[2] = MathUtils.sanitizeEps8(v1[2]);
		res[3] = MathUtils.sanitizeEps8(v1[3]);
		
		return res;
	}
	
	public static float[] sanitizeEps8(float v1X, float v1Y, float v1Z, float v1W, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.sanitizeEps8(v1X);
		res[1] = MathUtils.sanitizeEps8(v1Y);
		res[2] = MathUtils.sanitizeEps8(v1Z);
		res[3] = MathUtils.sanitizeEps8(v1W);
		
		return res;
	}
	
	public static float[] sanitizeEps8Assign(@ExtractionParam float[] v1)
	{
		v1[0] = MathUtils.sanitizeEps8(v1[0]);
		v1[1] = MathUtils.sanitizeEps8(v1[1]);
		v1[2] = MathUtils.sanitizeEps8(v1[2]);
		v1[3] = MathUtils.sanitizeEps8(v1[3]);
		
		return v1;
	}
	
	public static float[] addWeighted(float[] v1, float[] v2, float[] weight, @ExtractionParam float[] res)
	{
		res[0] = Math.fma(v2[0], weight[0], v1[0]);
		res[1] = Math.fma(v2[1], weight[1], v1[1]);
		res[2] = Math.fma(v2[2], weight[2], v1[2]);
		res[3] = Math.fma(v2[3], weight[3], v1[3]);
		
		return res;
	}
	
	public static float[] addWeighted(float[] v1, float[] v2, float weight, @ExtractionParam float[] res)
	{
		res[0] = Math.fma(v2[0], weight, v1[0]);
		res[1] = Math.fma(v2[1], weight, v1[1]);
		res[2] = Math.fma(v2[2], weight, v1[2]);
		res[3] = Math.fma(v2[3], weight, v1[3]);
		
		return res;
	}
	
	public static float[] addWeighted(float[] v1, float[] v2, float weightX, float weightY, float weightZ, float weightW, @ExtractionParam float[] res)
	{
		res[0] = Math.fma(v2[0], weightX, v1[0]);
		res[1] = Math.fma(v2[1], weightY, v1[1]);
		res[2] = Math.fma(v2[2], weightZ, v1[2]);
		res[3] = Math.fma(v2[3], weightW, v1[3]);
		
		return res;
	}
	
	public static float[] addWeighted(float[] v1, float v2X, float v2Y, float v2Z, float v2W, float[] weight, @ExtractionParam float[] res)
	{
		res[0] = Math.fma(v2X, weight[0], v1[0]);
		res[1] = Math.fma(v2Y, weight[1], v1[1]);
		res[2] = Math.fma(v2Z, weight[2], v1[2]);
		res[3] = Math.fma(v2W, weight[3], v1[3]);
		
		return res;
	}
	
	public static float[] addWeighted(float[] v1, float v2X, float v2Y, float v2Z, float v2W, float weightX, float weightY, float weightZ, float weightW, @ExtractionParam float[] res)
	{
		res[0] = Math.fma(v2X, weightX, v1[0]);
		res[1] = Math.fma(v2Y, weightY, v1[1]);
		res[2] = Math.fma(v2Z, weightZ, v1[2]);
		res[3] = Math.fma(v2W, weightW, v1[3]);
		
		return res;
	}
	
	public static float[] addWeighted(float v1X, float v1Y, float v1Z, float v1W, float[] v2, float[] weight, @ExtractionParam float[] res)
	{
		res[0] = Math.fma(v2[0], weight[0], v1X);
		res[1] = Math.fma(v2[1], weight[1], v1Y);
		res[2] = Math.fma(v2[2], weight[2], v1Z);
		res[3] = Math.fma(v2[3], weight[3], v1W);
		
		return res;
	}
	
	public static float[] addWeighted(float v1X, float v1Y, float v1Z, float v1W, float[] v2, float weightX, float weightY, float weightZ, float weightW, @ExtractionParam float[] res)
	{
		res[0] = Math.fma(v2[0], weightX, v1X);
		res[1] = Math.fma(v2[1], weightY, v1Y);
		res[2] = Math.fma(v2[2], weightZ, v1Z);
		res[3] = Math.fma(v2[3], weightW, v1W);
		
		return res;
	}
	
	public static float[] addWeighted(float v1X, float v1Y, float v1Z, float v1W, float v2X, float v2Y, float v2Z, float v2W, float[] weight, @ExtractionParam float[] res)
	{
		res[0] = Math.fma(v2X, weight[0], v1X);
		res[1] = Math.fma(v2Y, weight[1], v1Y);
		res[2] = Math.fma(v2Z, weight[2], v1Z);
		res[3] = Math.fma(v2W, weight[3], v1W);
		
		return res;
	}
	
	public static float[] addWeighted(float v1X, float v1Y, float v1Z, float v1W, float v2X, float v2Y, float v2Z, float v2W, float weightX, float weightY, float weightZ, float weightW, @ExtractionParam float[] res)
	{
		res[0] = Math.fma(v2X, weightX, v1X);
		res[1] = Math.fma(v2Y, weightY, v1Y);
		res[2] = Math.fma(v2Z, weightZ, v1Z);
		res[3] = Math.fma(v2W, weightW, v1W);
		
		return res;
	}

	public static float[] addWeightedAssign(@ExtractionParam float[] v1, float[] v2, float[] weight)
	{
		v1[0] = Math.fma(v2[0], weight[0], v1[0]);
		v1[1] = Math.fma(v2[1], weight[1], v1[1]);
		v1[2] = Math.fma(v2[2], weight[2], v1[2]);
		v1[3] = Math.fma(v2[3], weight[3], v1[3]);
		
		return v1;
	}
	
	public static float[] addWeightedAssign(@ExtractionParam float[] v1, float[] v2, float weight)
	{
		v1[0] = Math.fma(v2[0], weight, v1[0]);
		v1[1] = Math.fma(v2[1], weight, v1[1]);
		v1[2] = Math.fma(v2[2], weight, v1[2]);
		v1[3] = Math.fma(v2[3], weight, v1[3]);
		
		return v1;
	}
	
	public static float[] addWeightedAssign(@ExtractionParam float[] v1, float[] v2, float weightX, float weightY, float weightZ, float weightW)
	{
		v1[0] = Math.fma(v2[0], weightX, v1[0]);
		v1[1] = Math.fma(v2[1], weightY, v1[1]);
		v1[2] = Math.fma(v2[2], weightZ, v1[2]);
		v1[3] = Math.fma(v2[3], weightW, v1[3]);
		
		return v1;
	}
	
	public static float[] addWeightedAssign(@ExtractionParam float[] v1, float v2X, float v2Y, float v2Z, float v2W, float[] weight)
	{
		v1[0] = Math.fma(v2X, weight[0], v1[0]);
		v1[1] = Math.fma(v2Y, weight[1], v1[1]);
		v1[2] = Math.fma(v2Z, weight[2], v1[2]);
		v1[3] = Math.fma(v2W, weight[3], v1[3]);
		
		return v1;
	}
	
	public static float[] addWeightedAssign(@ExtractionParam float[] v1, float v2X, float v2Y, float v2Z, float v2W, float weightX, float weightY, float weightZ, float weightW)
	{
		v1[0] = Math.fma(v2X, weightX, v1[0]);
		v1[1] = Math.fma(v2Y, weightY, v1[1]);
		v1[2] = Math.fma(v2Z, weightZ, v1[2]);
		v1[3] = Math.fma(v2W, weightW, v1[3]);
		
		return v1;
	}
	
	public static float[] saturate(float[] v1, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.saturate(v1[0]);
		res[1] = MathUtils.saturate(v1[1]);
		res[2] = MathUtils.saturate(v1[2]);
		
		return res;
	}
	
	public static float[] saturate(float v1X, float v1Y, float v1Z, float v1W, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.saturate(v1X);
		res[1] = MathUtils.saturate(v1Y);
		res[2] = MathUtils.saturate(v1Z);
		res[3] = MathUtils.saturate(v1W);
		
		return res;
	}
	
	public static float[] saturateAssign(float[] v1)
	{
		v1[0] = MathUtils.saturate(v1[0]);
		v1[1] = MathUtils.saturate(v1[1]);
		v1[2] = MathUtils.saturate(v1[2]);
		v1[3] = MathUtils.saturate(v1[3]);
		
		return v1;
	}
	
	public static float[] remapRange(float[] v1, float[] srcMin, float[] srcMax, float[] dstMin, float[] dstMax, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.remapRange(v1[0], srcMin[0], srcMax[0], dstMin[0], dstMax[0]);
		res[1] = MathUtils.remapRange(v1[1], srcMin[1], srcMax[1], dstMin[1], dstMax[1]);
		res[2] = MathUtils.remapRange(v1[2], srcMin[2], srcMax[2], dstMin[2], dstMax[2]);
		res[3] = MathUtils.remapRange(v1[3], srcMin[3], srcMax[3], dstMin[3], dstMax[3]);
		
		return res;
	}
	
	public static float[] remapRange(float[] v1, float srcMin, float srcMax, float dstMin, float dstMax, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.remapRange(v1[0], srcMin, srcMax, dstMin, dstMax);
		res[1] = MathUtils.remapRange(v1[1], srcMin, srcMax, dstMin, dstMax);
		res[2] = MathUtils.remapRange(v1[2], srcMin, srcMax, dstMin, dstMax);
		res[3] = MathUtils.remapRange(v1[3], srcMin, srcMax, dstMin, dstMax);
		
		return res;
	}
	
	public static float[] remapRange(float[] v1, float srcMinX, float srcMinY, float srcMinZ, float srcMinW, float srcMaxX, float srcMaxY, float srcMaxZ, float srcMaxW, float dstMinX, float dstMinY, float dstMinZ, float dstMinW, float dstMaxX, float dstMaxY, float dstMaxZ, float dstMaxW, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.remapRange(v1[0], srcMinX, srcMaxX, dstMinX, dstMaxX);
		res[1] = MathUtils.remapRange(v1[1], srcMinY, srcMaxY, dstMinY, dstMaxY);
		res[2] = MathUtils.remapRange(v1[2], srcMinZ, srcMaxZ, dstMinZ, dstMaxZ);
		res[3] = MathUtils.remapRange(v1[3], srcMinW, srcMaxW, dstMinW, dstMaxW);
		
		return res;
	}
	
	public static float[] remapRange(float v1X, float v1Y, float v1Z, float v1W, float[] srcMin, float[] srcMax, float[] dstMin, float[] dstMax, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.remapRange(v1X, srcMin[0], srcMax[0], dstMin[0], dstMax[0]);
		res[1] = MathUtils.remapRange(v1Y, srcMin[1], srcMax[1], dstMin[1], dstMax[1]);
		res[2] = MathUtils.remapRange(v1Z, srcMin[2], srcMax[2], dstMin[2], dstMax[2]);
		res[3] = MathUtils.remapRange(v1W, srcMin[3], srcMax[3], dstMin[3], dstMax[3]);
		
		return res;
	}
	
	public static float[] remapRange(float v1X, float v1Y, float v1Z, float v1W, float srcMin, float srcMax, float dstMin, float dstMax, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.remapRange(v1X, srcMin, srcMax, dstMin, dstMax);
		res[1] = MathUtils.remapRange(v1Y, srcMin, srcMax, dstMin, dstMax);
		res[2] = MathUtils.remapRange(v1Z, srcMin, srcMax, dstMin, dstMax);
		res[3] = MathUtils.remapRange(v1W, srcMin, srcMax, dstMin, dstMax);
		
		return res;
	}
	
	public static float[] remapRange(float v1X, float v1Y, float v1Z, float v1W, float srcMinX, float srcMinY, float srcMinZ, float srcMinW, float srcMaxX, float srcMaxY, float srcMaxZ, float srcMaxW, float dstMinX, float dstMinY, float dstMinZ, float dstMinW, float dstMaxX, float dstMaxY, float dstMaxZ, float dstMaxW, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.remapRange(v1X, srcMinX, srcMaxX, dstMinX, dstMaxX);
		res[1] = MathUtils.remapRange(v1Y, srcMinY, srcMaxY, dstMinY, dstMaxY);
		res[2] = MathUtils.remapRange(v1Z, srcMinZ, srcMaxZ, dstMinZ, dstMaxZ);
		res[3] = MathUtils.remapRange(v1W, srcMinW, srcMaxW, dstMinW, dstMaxW);
		
		return res;
	}
	
	public static float[] remapRangeAssign(float[] v1, float[] srcMin, float[] srcMax, float[] dstMin, float[] dstMax)
	{
		v1[0] = MathUtils.remapRange(v1[0], srcMin[0], srcMax[0], dstMin[0], dstMax[0]);
		v1[1] = MathUtils.remapRange(v1[1], srcMin[1], srcMax[1], dstMin[1], dstMax[1]);
		v1[2] = MathUtils.remapRange(v1[2], srcMin[2], srcMax[2], dstMin[2], dstMax[2]);
		v1[3] = MathUtils.remapRange(v1[3], srcMin[3], srcMax[3], dstMin[3], dstMax[3]);
		
		return v1;
	}
	
	public static float[] remapRangeAssign(float[] v1, float srcMin, float srcMax, float dstMin, float dstMax)
	{
		v1[0] = MathUtils.remapRange(v1[0], srcMin, srcMax, dstMin, dstMax);
		v1[1] = MathUtils.remapRange(v1[1], srcMin, srcMax, dstMin, dstMax);
		v1[2] = MathUtils.remapRange(v1[2], srcMin, srcMax, dstMin, dstMax);
		v1[3] = MathUtils.remapRange(v1[3], srcMin, srcMax, dstMin, dstMax);
		
		return v1;
	}
	
	public static float[] remapRangeAssign(float[] v1, float srcMinX, float srcMinY, float srcMinZ, float srcMinW, float srcMaxX, float srcMaxY, float srcMaxZ, float srcMaxW, float dstMinX, float dstMinY, float dstMinZ, float dstMinW, float dstMaxX, float dstMaxY, float dstMaxZ, float dstMaxW)
	{
		v1[0] = MathUtils.remapRange(v1[0], srcMinX, srcMaxX, dstMinX, dstMaxX);
		v1[1] = MathUtils.remapRange(v1[1], srcMinY, srcMaxY, dstMinY, dstMaxY);
		v1[2] = MathUtils.remapRange(v1[2], srcMinZ, srcMaxZ, dstMinZ, dstMaxZ);
		v1[3] = MathUtils.remapRange(v1[3], srcMinW, srcMaxW, dstMinW, dstMaxW);
		
		return v1;
	}
	
}
