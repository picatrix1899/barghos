package org.barghos.math.vector.floats;

import org.barghos.annotation.ExtractionParam;
import org.barghos.core.math.LerpUtils;

public class LerpVecOps3F
{
	
	public static float[] lerp(float[] alpha, float[] v1, float[] v2, @ExtractionParam float[] res)
	{
		res[0] = LerpUtils.lerp(alpha[0], v1[0], v2[0]);
		res[1] = LerpUtils.lerp(alpha[1], v1[1], v2[1]);
		res[2] = LerpUtils.lerp(alpha[2], v1[2], v2[2]);
		
		return res;
	}
	
	public static float[] lerp(float[] alpha, float[] v1, float v2X, float v2Y, float v2Z, @ExtractionParam float[] res)
	{
		res[0] = LerpUtils.lerp(alpha[0], v1[0], v2X);
		res[1] = LerpUtils.lerp(alpha[1], v1[1], v2Y);
		res[2] = LerpUtils.lerp(alpha[2], v1[2], v2Z);
		
		return res;
	}
	
	public static float[] lerp(float[] alpha, float v1X, float v1Y, float v1Z, float[] v2, @ExtractionParam float[] res)
	{
		res[0] = LerpUtils.lerp(alpha[0], v1X, v2[0]);
		res[1] = LerpUtils.lerp(alpha[1], v1Y, v2[1]);
		res[2] = LerpUtils.lerp(alpha[2], v1Z, v2[2]);
		
		return res;
	}
	
	public static float[] lerp(float[] alpha, float v1X, float v1Y, float v1Z, float v2X, float v2Y, float v2Z, @ExtractionParam float[] res)
	{
		res[0] = LerpUtils.lerp(alpha[0], v1X, v2X);
		res[1] = LerpUtils.lerp(alpha[1], v1Y, v2Y);
		res[2] = LerpUtils.lerp(alpha[2], v1Z, v2Z);
		
		return res;
	}
	
	public static float[] lerp(float alpha, float[] v1, float[] v2, @ExtractionParam float[] res)
	{
		res[0] = LerpUtils.lerp(alpha, v1[0], v2[0]);
		res[1] = LerpUtils.lerp(alpha, v1[1], v2[1]);
		res[2] = LerpUtils.lerp(alpha, v1[2], v2[2]);
		
		return res;
	}
	
	public static float[] lerp(float alpha, float[] v1, float v2X, float v2Y, float v2Z, @ExtractionParam float[] res)
	{
		res[0] = LerpUtils.lerp(alpha, v1[0], v2X);
		res[1] = LerpUtils.lerp(alpha, v1[1], v2Y);
		res[2] = LerpUtils.lerp(alpha, v1[2], v2Z);
		
		return res;
	}
	
	public static float[] lerp(float alpha, float v1X, float v1Y, float v1Z, float[] v2, @ExtractionParam float[] res)
	{
		res[0] = LerpUtils.lerp(alpha, v1X, v2[0]);
		res[1] = LerpUtils.lerp(alpha, v1Y, v2[1]);
		res[2] = LerpUtils.lerp(alpha, v1Z, v2[2]);
		
		return res;
	}
	
	public static float[] lerp(float alpha, float v1X, float v1Y, float v1Z, float v2X, float v2Y, float v2Z, @ExtractionParam float[] res)
	{
		res[0] = LerpUtils.lerp(alpha, v1X, v2X);
		res[1] = LerpUtils.lerp(alpha, v1Y, v2Y);
		res[2] = LerpUtils.lerp(alpha, v1Z, v2Z);
		
		return res;
	}
	
	public static float[] lerp(float alphaX, float alphaY, float alphaZ, float[] v1, float[] v2, @ExtractionParam float[] res)
	{
		res[0] = LerpUtils.lerp(alphaX, v1[0], v2[0]);
		res[1] = LerpUtils.lerp(alphaY, v1[1], v2[1]);
		res[2] = LerpUtils.lerp(alphaZ, v1[2], v2[2]);
		
		return res;
	}
	
	public static float[] lerp(float alphaX, float alphaY, float alphaZ, float[] v1, float v2X, float v2Y, float v2Z, @ExtractionParam float[] res)
	{
		res[0] = LerpUtils.lerp(alphaX, v1[0], v2X);
		res[1] = LerpUtils.lerp(alphaY, v1[1], v2Y);
		res[2] = LerpUtils.lerp(alphaZ, v1[2], v2Z);
		
		return res;
	}
	
	public static float[] lerp(float alphaX, float alphaY, float alphaZ, float v1X, float v1Y, float v1Z, float[] v2, @ExtractionParam float[] res)
	{
		res[0] = LerpUtils.lerp(alphaX, v1X, v2[0]);
		res[1] = LerpUtils.lerp(alphaY, v1Y, v2[1]);
		res[2] = LerpUtils.lerp(alphaZ, v1Z, v2[2]);
		
		return res;
	}
	
	public static float[] lerp(float alphaX, float alphaY, float alphaZ, float v1X, float v1Y, float v1Z, float v2X, float v2Y, float v2Z, @ExtractionParam float[] res)
	{
		res[0] = LerpUtils.lerp(alphaX, v1X, v2X);
		res[1] = LerpUtils.lerp(alphaY, v1Y, v2Y);
		res[2] = LerpUtils.lerp(alphaZ, v1Z, v2Z);
		
		return res;
	}
	
	public static float[] invLerp(float[] v1, float[] min, float[] max, @ExtractionParam float[] res)
	{
		res[0] = LerpUtils.invLerp(v1[0], min[0], max[0]);
		res[1] = LerpUtils.invLerp(v1[1], min[1], max[1]);
		res[2] = LerpUtils.invLerp(v1[2], min[2], max[2]);
		
		return res;
	}
	
	public static float[] invLerp(float[] v1, float[] min, float maxX, float maxY, float maxZ, @ExtractionParam float[] res)
	{
		res[0] = LerpUtils.invLerp(v1[0], min[0], maxX);
		res[1] = LerpUtils.invLerp(v1[1], min[1], maxY);
		res[2] = LerpUtils.invLerp(v1[2], min[2], maxZ);
		
		return res;
	}
	
	public static float[] invLerp(float[] v1, float min, float max, @ExtractionParam float[] res)
	{
		res[0] = LerpUtils.invLerp(v1[0], min, max);
		res[1] = LerpUtils.invLerp(v1[1], min, max);
		res[2] = LerpUtils.invLerp(v1[2], min, max);
		
		return res;
	}
	
	public static float[] invLerp(float[] v1, float minX, float minY, float minZ, float[] max, @ExtractionParam float[] res)
	{
		res[0] = LerpUtils.invLerp(v1[0], minX, max[0]);
		res[1] = LerpUtils.invLerp(v1[1], minY, max[1]);
		res[2] = LerpUtils.invLerp(v1[2], minZ, max[2]);
		
		return res;
	}
	
	public static float[] invLerp(float[] v1, float minX, float minY, float minZ, float maxX, float maxY, float maxZ, @ExtractionParam float[] res)
	{
		res[0] = LerpUtils.invLerp(v1[0], minX, maxX);
		res[1] = LerpUtils.invLerp(v1[1], minY, maxY);
		res[2] = LerpUtils.invLerp(v1[2], minZ, maxZ);
		
		return res;
	}
	
	public static float[] invLerp(float v1X, float v1Y, float v1Z, float[] min, float[] max, @ExtractionParam float[] res)
	{
		res[0] = LerpUtils.invLerp(v1X, min[0], max[0]);
		res[1] = LerpUtils.invLerp(v1Y, min[1], max[1]);
		res[2] = LerpUtils.invLerp(v1Z, min[2], max[2]);
		
		return res;
	}
	
	public static float[] invLerp(float v1X, float v1Y, float v1Z, float[] min, float maxX, float maxY, float maxZ, @ExtractionParam float[] res)
	{
		res[0] = LerpUtils.invLerp(v1X, min[0], maxX);
		res[1] = LerpUtils.invLerp(v1Y, min[1], maxY);
		res[2] = LerpUtils.invLerp(v1Z, min[2], maxZ);
		
		return res;
	}
	
	public static float[] invLerp(float v1X, float v1Y, float v1Z, float min, float max, @ExtractionParam float[] res)
	{
		res[0] = LerpUtils.invLerp(v1X, min, max);
		res[1] = LerpUtils.invLerp(v1Y, min, max);
		res[2] = LerpUtils.invLerp(v1Z, min, max);
		
		return res;
	}
	
	public static float[] invLerp(float v1X, float v1Y, float v1Z, float minX, float minY, float minZ, float[] max, @ExtractionParam float[] res)
	{
		res[0] = LerpUtils.invLerp(v1X, minX, max[0]);
		res[1] = LerpUtils.invLerp(v1Y, minY, max[1]);
		res[2] = LerpUtils.invLerp(v1Z, minZ, max[2]);
		
		return res;
	}
	
	public static float[] invLerp(float v1X, float v1Y, float v1Z, float minX, float minY, float minZ, float maxX, float maxY, float maxZ, @ExtractionParam float[] res)
	{
		res[0] = LerpUtils.invLerp(v1X, minX, maxX);
		res[1] = LerpUtils.invLerp(v1Y, minY, maxY);
		res[2] = LerpUtils.invLerp(v1Z, minZ, maxZ);
		
		return res;
	}
	
}
