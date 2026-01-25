package org.barghos.math.vector.floats;

import org.barghos.annotation.ExtractionParam;

public class QuatVecOps3F
{
	private QuatVecOps3F() { }
	
	public static float[] transform(float[] v1, float[] q1, @ExtractionParam float[] res)
	{
		float q1X = q1[0];
		float q1Y = q1[1];
		float q1Z = q1[2];
		float q1W = q1[3];
		
		float v1X = v1[0];
		float v1Y = v1[1];
		float v1Z = v1[2];
		
		float tX = 2.0f * Math.fma(q1Y, v1Z, -q1Z * v1Y);
		float tY = 2.0f * Math.fma(q1Z, v1X, -q1X * v1Z);
		float tZ = 2.0f * Math.fma(q1X, v1Y, -q1Y * v1X);
		
		res[0] = v1X + Math.fma(q1W, tX, Math.fma(q1Y, tZ, -q1Z * tY));
		res[1] = v1Y + Math.fma(q1W, tY, Math.fma(q1Z, tX, -q1X * tZ));
		res[2] = v1Z + Math.fma(q1W, tZ, Math.fma(q1X, tY, -q1Y * tX));
		
		return res;
	}
	
	public static float[] transform(float[] v1, float q1X, float q1Y, float q1Z, float q1W, @ExtractionParam float[] res)
	{
		float v1X = v1[0];
		float v1Y = v1[1];
		float v1Z = v1[2];
		
		float tX = 2.0f * Math.fma(q1Y, v1Z, -q1Z * v1Y);
		float tY = 2.0f * Math.fma(q1Z, v1X, -q1X * v1Z);
		float tZ = 2.0f * Math.fma(q1X, v1Y, -q1Y * v1X);
		
		res[0] = v1X + Math.fma(q1W, tX, Math.fma(q1Y, tZ, -q1Z * tY));
		res[1] = v1Y + Math.fma(q1W, tY, Math.fma(q1Z, tX, -q1X * tZ));
		res[2] = v1Z + Math.fma(q1W, tZ, Math.fma(q1X, tY, -q1Y * tX));
		
		return res;
	}
	
	public static float[] transform(float v1X, float v1Y, float v1Z, float[] q1, @ExtractionParam float[] res)
	{
		float q1X = q1[0];
		float q1Y = q1[1];
		float q1Z = q1[2];
		float q1W = q1[3];
		
		float tX = 2.0f * Math.fma(q1Y, v1Z, -q1Z * v1Y);
		float tY = 2.0f * Math.fma(q1Z, v1X, -q1X * v1Z);
		float tZ = 2.0f * Math.fma(q1X, v1Y, -q1Y * v1X);
		
		res[0] = v1X + Math.fma(q1W, tX, Math.fma(q1Y, tZ, -q1Z * tY));
		res[1] = v1Y + Math.fma(q1W, tY, Math.fma(q1Z, tX, -q1X * tZ));
		res[2] = v1Z + Math.fma(q1W, tZ, Math.fma(q1X, tY, -q1Y * tX));
		
		return res;
	}
	
	public static float[] transform(float v1X, float v1Y, float v1Z, float q1X, float q1Y, float q1Z, float q1W, @ExtractionParam float[] res)
	{
		float tX = 2.0f * Math.fma(q1Y, v1Z, -q1Z * v1Y);
		float tY = 2.0f * Math.fma(q1Z, v1X, -q1X * v1Z);
		float tZ = 2.0f * Math.fma(q1X, v1Y, -q1Y * v1X);
		
		res[0] = v1X + Math.fma(q1W, tX, Math.fma(q1Y, tZ, -q1Z * tY));
		res[1] = v1Y + Math.fma(q1W, tY, Math.fma(q1Z, tX, -q1X * tZ));
		res[2] = v1Z + Math.fma(q1W, tZ, Math.fma(q1X, tY, -q1Y * tX));
		
		return res;
	}
	
	public static float[] transformAssign(@ExtractionParam float[] v1, float[] q1)
	{
		float q1X = q1[0];
		float q1Y = q1[1];
		float q1Z = q1[2];
		float q1W = q1[3];
		
		float v1X = v1[0];
		float v1Y = v1[1];
		float v1Z = v1[2];
		
		float tX = 2.0f * Math.fma(q1Y, v1Z, -q1Z * v1Y);
		float tY = 2.0f * Math.fma(q1Z, v1X, -q1X * v1Z);
		float tZ = 2.0f * Math.fma(q1X, v1Y, -q1Y * v1X);
		
		v1[0] = v1X + Math.fma(q1W, tX, Math.fma(q1Y, tZ, -q1Z * tY));
		v1[1] = v1Y + Math.fma(q1W, tY, Math.fma(q1Z, tX, -q1X * tZ));
		v1[2] = v1Z + Math.fma(q1W, tZ, Math.fma(q1X, tY, -q1Y * tX));
		
		return v1;
	}
	
	public static float[] transformAssign(@ExtractionParam float[] v1, float q1X, float q1Y, float q1Z, float q1W)
	{
		float v1X = v1[0];
		float v1Y = v1[1];
		float v1Z = v1[2];
		
		float tX = 2.0f * Math.fma(q1Y, v1Z, -q1Z * v1Y);
		float tY = 2.0f * Math.fma(q1Z, v1X, -q1X * v1Z);
		float tZ = 2.0f * Math.fma(q1X, v1Y, -q1Y * v1X);
		
		v1[0] = v1X + Math.fma(q1W, tX, Math.fma(q1Y, tZ, -q1Z * tY));
		v1[1] = v1Y + Math.fma(q1W, tY, Math.fma(q1Z, tX, -q1X * tZ));
		v1[2] = v1Z + Math.fma(q1W, tZ, Math.fma(q1X, tY, -q1Y * tX));
		
		return v1;
	}
}
