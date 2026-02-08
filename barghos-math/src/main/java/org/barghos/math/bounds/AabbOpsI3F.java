package org.barghos.math.bounds;

import org.barghos.annotation.ExtractionParam;
import org.barghos.core.math.MathUtils;

public class AabbOpsI3F
{
	private AabbOpsI3F() { }
	
	public static float[] merge(float[] aabb1, float[] aabb2, @ExtractionParam float[] res)
	{
		float aabb1MinX = aabb1[0];
		float aabb1MinY = aabb1[1];
		float aabb1MinZ = aabb1[2];
		float aabb1MaxX = aabb1[3];
		float aabb1MaxY = aabb1[4];
		float aabb1MaxZ = aabb1[5];
		
		float aabb2MinX = aabb2[0];
		float aabb2MinY = aabb2[1];
		float aabb2MinZ = aabb2[2];
		float aabb2MaxX = aabb2[3];
		float aabb2MaxY = aabb2[4];
		float aabb2MaxZ = aabb2[5];
		
		float newMinX = MathUtils.min(aabb1MinX, aabb1MaxX, aabb2MinX, aabb2MaxX);
		float newMinY = MathUtils.min(aabb1MinY, aabb1MaxY, aabb2MinY, aabb2MaxY);
		float newMinZ = MathUtils.min(aabb1MinZ, aabb1MaxZ, aabb2MinZ, aabb2MaxZ);
		float newMaxX = MathUtils.max(aabb1MinX, aabb1MaxX, aabb2MaxX, aabb2MaxX);
		float newMaxY = MathUtils.max(aabb1MinY, aabb1MaxY, aabb2MaxY, aabb2MaxY);
		float newMaxZ = MathUtils.max(aabb1MinZ, aabb1MaxZ, aabb2MaxZ, aabb2MaxZ);
		
		res[0] = newMinX;
		res[1] = newMinY;
		res[2] = newMinZ;
		res[3] = newMaxX;
		res[4] = newMaxY;
		res[5] = newMaxZ;
		
		return res;
	}
	
	public static float[] merge(float[] aabb1, float[] aabb2Min, float[] aabb2Max, @ExtractionParam float[] res)
	{
		float aabb1MinX = aabb1[0];
		float aabb1MinY = aabb1[1];
		float aabb1MinZ = aabb1[2];
		float aabb1MaxX = aabb1[3];
		float aabb1MaxY = aabb1[4];
		float aabb1MaxZ = aabb1[5];
		
		float aabb2MinX = aabb2Min[0];
		float aabb2MinY = aabb2Min[1];
		float aabb2MinZ = aabb2Min[2];
		float aabb2MaxX = aabb2Max[0];
		float aabb2MaxY = aabb2Max[1];
		float aabb2MaxZ = aabb2Max[2];
		
		float newMinX = MathUtils.min(aabb1MinX, aabb1MaxX, aabb2MinX, aabb2MaxX);
		float newMinY = MathUtils.min(aabb1MinY, aabb1MaxY, aabb2MinY, aabb2MaxY);
		float newMinZ = MathUtils.min(aabb1MinZ, aabb1MaxZ, aabb2MinZ, aabb2MaxZ);
		float newMaxX = MathUtils.max(aabb1MinX, aabb1MaxX, aabb2MaxX, aabb2MaxX);
		float newMaxY = MathUtils.max(aabb1MinY, aabb1MaxY, aabb2MaxY, aabb2MaxY);
		float newMaxZ = MathUtils.max(aabb1MinZ, aabb1MaxZ, aabb2MaxZ, aabb2MaxZ);
		
		res[0] = newMinX;
		res[1] = newMinY;
		res[2] = newMinZ;
		res[3] = newMaxX;
		res[4] = newMaxY;
		res[5] = newMaxZ;
		
		return res;
	}
	
	public static float[] merge(float[] aabb1, float[] aabb2Min, float aabb2MaxX, float aabb2MaxY, float aabb2MaxZ, @ExtractionParam float[] res)
	{
		float aabb1MinX = aabb1[0];
		float aabb1MinY = aabb1[1];
		float aabb1MinZ = aabb1[2];
		float aabb1MaxX = aabb1[3];
		float aabb1MaxY = aabb1[4];
		float aabb1MaxZ = aabb1[5];
		
		float aabb2MinX = aabb2Min[0];
		float aabb2MinY = aabb2Min[1];
		float aabb2MinZ = aabb2Min[2];
		
		float newMinX = MathUtils.min(aabb1MinX, aabb1MaxX, aabb2MinX, aabb2MaxX);
		float newMinY = MathUtils.min(aabb1MinY, aabb1MaxY, aabb2MinY, aabb2MaxY);
		float newMinZ = MathUtils.min(aabb1MinZ, aabb1MaxZ, aabb2MinZ, aabb2MaxZ);
		float newMaxX = MathUtils.max(aabb1MinX, aabb1MaxX, aabb2MaxX, aabb2MaxX);
		float newMaxY = MathUtils.max(aabb1MinY, aabb1MaxY, aabb2MaxY, aabb2MaxY);
		float newMaxZ = MathUtils.max(aabb1MinZ, aabb1MaxZ, aabb2MaxZ, aabb2MaxZ);
		
		res[0] = newMinX;
		res[1] = newMinY;
		res[2] = newMinZ;
		res[3] = newMaxX;
		res[4] = newMaxY;
		res[5] = newMaxZ;
		
		return res;
	}
	
	public static float[] merge(float[] aabb1, float aabb2MinX, float aabb2MinY, float aabb2MinZ, float[] aabb2Max, @ExtractionParam float[] res)
	{
		float aabb1MinX = aabb1[0];
		float aabb1MinY = aabb1[1];
		float aabb1MinZ = aabb1[2];
		float aabb1MaxX = aabb1[3];
		float aabb1MaxY = aabb1[4];
		float aabb1MaxZ = aabb1[5];
		
		float aabb2MaxX = aabb2Max[0];
		float aabb2MaxY = aabb2Max[1];
		float aabb2MaxZ = aabb2Max[2];
		
		float newMinX = MathUtils.min(aabb1MinX, aabb1MaxX, aabb2MinX, aabb2MaxX);
		float newMinY = MathUtils.min(aabb1MinY, aabb1MaxY, aabb2MinY, aabb2MaxY);
		float newMinZ = MathUtils.min(aabb1MinZ, aabb1MaxZ, aabb2MinZ, aabb2MaxZ);
		float newMaxX = MathUtils.max(aabb1MinX, aabb1MaxX, aabb2MaxX, aabb2MaxX);
		float newMaxY = MathUtils.max(aabb1MinY, aabb1MaxY, aabb2MaxY, aabb2MaxY);
		float newMaxZ = MathUtils.max(aabb1MinZ, aabb1MaxZ, aabb2MaxZ, aabb2MaxZ);
		
		res[0] = newMinX;
		res[1] = newMinY;
		res[2] = newMinZ;
		res[3] = newMaxX;
		res[4] = newMaxY;
		res[5] = newMaxZ;
		
		return res;
	}

	public static float[] merge(float[] aabb1, float aabb2MinX, float aabb2MinY, float aabb2MinZ, float aabb2MaxX, float aabb2MaxY, float aabb2MaxZ, @ExtractionParam float[] res)
	{
		float aabb1MinX = aabb1[0];
		float aabb1MinY = aabb1[1];
		float aabb1MinZ = aabb1[2];
		float aabb1MaxX = aabb1[3];
		float aabb1MaxY = aabb1[4];
		float aabb1MaxZ = aabb1[5];
		
		float newMinX = MathUtils.min(aabb1MinX, aabb1MaxX, aabb2MinX, aabb2MaxX);
		float newMinY = MathUtils.min(aabb1MinY, aabb1MaxY, aabb2MinY, aabb2MaxY);
		float newMinZ = MathUtils.min(aabb1MinZ, aabb1MaxZ, aabb2MinZ, aabb2MaxZ);
		float newMaxX = MathUtils.max(aabb1MinX, aabb1MaxX, aabb2MaxX, aabb2MaxX);
		float newMaxY = MathUtils.max(aabb1MinY, aabb1MaxY, aabb2MaxY, aabb2MaxY);
		float newMaxZ = MathUtils.max(aabb1MinZ, aabb1MaxZ, aabb2MaxZ, aabb2MaxZ);
		
		res[0] = newMinX;
		res[1] = newMinY;
		res[2] = newMinZ;
		res[3] = newMaxX;
		res[4] = newMaxY;
		res[5] = newMaxZ;
		
		return res;
	}
	
	public static float[] merge(float[] aabb1Min, float[] aabb1Max, float[] aabb2Min, float[] aabb2Max, @ExtractionParam float[] res)
	{
		float aabb1MinX = aabb1Min[0];
		float aabb1MinY = aabb1Min[1];
		float aabb1MinZ = aabb1Min[2];
		float aabb1MaxX = aabb1Max[0];
		float aabb1MaxY = aabb1Max[1];
		float aabb1MaxZ = aabb1Max[2];
		
		float aabb2MinX = aabb2Min[0];
		float aabb2MinY = aabb2Min[1];
		float aabb2MinZ = aabb2Min[2];
		float aabb2MaxX = aabb2Max[0];
		float aabb2MaxY = aabb2Max[1];
		float aabb2MaxZ = aabb2Max[2];
		
		float newMinX = MathUtils.min(aabb1MinX, aabb1MaxX, aabb2MinX, aabb2MaxX);
		float newMinY = MathUtils.min(aabb1MinY, aabb1MaxY, aabb2MinY, aabb2MaxY);
		float newMinZ = MathUtils.min(aabb1MinZ, aabb1MaxZ, aabb2MinZ, aabb2MaxZ);
		float newMaxX = MathUtils.max(aabb1MinX, aabb1MaxX, aabb2MaxX, aabb2MaxX);
		float newMaxY = MathUtils.max(aabb1MinY, aabb1MaxY, aabb2MaxY, aabb2MaxY);
		float newMaxZ = MathUtils.max(aabb1MinZ, aabb1MaxZ, aabb2MaxZ, aabb2MaxZ);
		
		res[0] = newMinX;
		res[1] = newMinY;
		res[2] = newMinZ;
		res[3] = newMaxX;
		res[4] = newMaxY;
		res[5] = newMaxZ;
		
		return res;
	}
	
	public static float[] merge(float[] aabb1Min, float[] aabb1Max, float[] aabb2Min, float aabb2MaxX, float aabb2MaxY, float aabb2MaxZ, @ExtractionParam float[] res)
	{
		float aabb1MinX = aabb1Min[0];
		float aabb1MinY = aabb1Min[1];
		float aabb1MinZ = aabb1Min[2];
		float aabb1MaxX = aabb1Max[0];
		float aabb1MaxY = aabb1Max[1];
		float aabb1MaxZ = aabb1Max[2];
		
		float aabb2MinX = aabb2Min[0];
		float aabb2MinY = aabb2Min[1];
		float aabb2MinZ = aabb2Min[2];
		
		float newMinX = MathUtils.min(aabb1MinX, aabb1MaxX, aabb2MinX, aabb2MaxX);
		float newMinY = MathUtils.min(aabb1MinY, aabb1MaxY, aabb2MinY, aabb2MaxY);
		float newMinZ = MathUtils.min(aabb1MinZ, aabb1MaxZ, aabb2MinZ, aabb2MaxZ);
		float newMaxX = MathUtils.max(aabb1MinX, aabb1MaxX, aabb2MaxX, aabb2MaxX);
		float newMaxY = MathUtils.max(aabb1MinY, aabb1MaxY, aabb2MaxY, aabb2MaxY);
		float newMaxZ = MathUtils.max(aabb1MinZ, aabb1MaxZ, aabb2MaxZ, aabb2MaxZ);
		
		res[0] = newMinX;
		res[1] = newMinY;
		res[2] = newMinZ;
		res[3] = newMaxX;
		res[4] = newMaxY;
		res[5] = newMaxZ;
		
		return res;
	}
	
	public static float[] merge(float[] aabb1Min, float[] aabb1Max, float aabb2MinX, float aabb2MinY, float aabb2MinZ, float[] aabb2Max, @ExtractionParam float[] res)
	{
		float aabb1MinX = aabb1Min[0];
		float aabb1MinY = aabb1Min[1];
		float aabb1MinZ = aabb1Min[2];
		float aabb1MaxX = aabb1Max[0];
		float aabb1MaxY = aabb1Max[1];
		float aabb1MaxZ = aabb1Max[2];
		
		float aabb2MaxX = aabb2Max[0];
		float aabb2MaxY = aabb2Max[1];
		float aabb2MaxZ = aabb2Max[2];
		
		float newMinX = MathUtils.min(aabb1MinX, aabb1MaxX, aabb2MinX, aabb2MaxX);
		float newMinY = MathUtils.min(aabb1MinY, aabb1MaxY, aabb2MinY, aabb2MaxY);
		float newMinZ = MathUtils.min(aabb1MinZ, aabb1MaxZ, aabb2MinZ, aabb2MaxZ);
		float newMaxX = MathUtils.max(aabb1MinX, aabb1MaxX, aabb2MaxX, aabb2MaxX);
		float newMaxY = MathUtils.max(aabb1MinY, aabb1MaxY, aabb2MaxY, aabb2MaxY);
		float newMaxZ = MathUtils.max(aabb1MinZ, aabb1MaxZ, aabb2MaxZ, aabb2MaxZ);
		
		res[0] = newMinX;
		res[1] = newMinY;
		res[2] = newMinZ;
		res[3] = newMaxX;
		res[4] = newMaxY;
		res[5] = newMaxZ;
		
		return res;
	}
	
	public static float[] merge(float[] aabb1Min, float[] aabb1Max, float aabb2MinX, float aabb2MinY, float aabb2MinZ, float aabb2MaxX, float aabb2MaxY, float aabb2MaxZ, @ExtractionParam float[] res)
	{
		float aabb1MinX = aabb1Min[0];
		float aabb1MinY = aabb1Min[1];
		float aabb1MinZ = aabb1Min[2];
		float aabb1MaxX = aabb1Max[0];
		float aabb1MaxY = aabb1Max[1];
		float aabb1MaxZ = aabb1Max[2];
		
		float newMinX = MathUtils.min(aabb1MinX, aabb1MaxX, aabb2MinX, aabb2MaxX);
		float newMinY = MathUtils.min(aabb1MinY, aabb1MaxY, aabb2MinY, aabb2MaxY);
		float newMinZ = MathUtils.min(aabb1MinZ, aabb1MaxZ, aabb2MinZ, aabb2MaxZ);
		float newMaxX = MathUtils.max(aabb1MinX, aabb1MaxX, aabb2MaxX, aabb2MaxX);
		float newMaxY = MathUtils.max(aabb1MinY, aabb1MaxY, aabb2MaxY, aabb2MaxY);
		float newMaxZ = MathUtils.max(aabb1MinZ, aabb1MaxZ, aabb2MaxZ, aabb2MaxZ);
		
		res[0] = newMinX;
		res[1] = newMinY;
		res[2] = newMinZ;
		res[3] = newMaxX;
		res[4] = newMaxY;
		res[5] = newMaxZ;
		
		return res;
	}
	
	public static float[] merge(float[] aabb1Min, float aabb1MaxX, float aabb1MaxY, float aabb1MaxZ, float[] aabb2Min, float aabb2MaxX, float aabb2MaxY, float aabb2MaxZ, @ExtractionParam float[] res)
	{
		float aabb1MinX = aabb1Min[0];
		float aabb1MinY = aabb1Min[1];
		float aabb1MinZ = aabb1Min[2];
		
		float aabb2MinX = aabb2Min[0];
		float aabb2MinY = aabb2Min[1];
		float aabb2MinZ = aabb2Min[2];
		
		float newMinX = MathUtils.min(aabb1MinX, aabb1MaxX, aabb2MinX, aabb2MaxX);
		float newMinY = MathUtils.min(aabb1MinY, aabb1MaxY, aabb2MinY, aabb2MaxY);
		float newMinZ = MathUtils.min(aabb1MinZ, aabb1MaxZ, aabb2MinZ, aabb2MaxZ);
		float newMaxX = MathUtils.max(aabb1MinX, aabb1MaxX, aabb2MaxX, aabb2MaxX);
		float newMaxY = MathUtils.max(aabb1MinY, aabb1MaxY, aabb2MaxY, aabb2MaxY);
		float newMaxZ = MathUtils.max(aabb1MinZ, aabb1MaxZ, aabb2MaxZ, aabb2MaxZ);
		
		res[0] = newMinX;
		res[1] = newMinY;
		res[2] = newMinZ;
		res[3] = newMaxX;
		res[4] = newMaxY;
		res[5] = newMaxZ;
		
		return res;
	}
	
	public static float[] merge(float[] aabb1Min, float aabb1MaxX, float aabb1MaxY, float aabb1MaxZ, float aabb2MinX, float aabb2MinY, float aabb2MinZ, float[] aabb2Max, @ExtractionParam float[] res)
	{
		float aabb1MinX = aabb1Min[0];
		float aabb1MinY = aabb1Min[1];
		float aabb1MinZ = aabb1Min[2];
		
		float aabb2MaxX = aabb2Max[0];
		float aabb2MaxY = aabb2Max[1];
		float aabb2MaxZ = aabb2Max[2];
		
		float newMinX = MathUtils.min(aabb1MinX, aabb1MaxX, aabb2MinX, aabb2MaxX);
		float newMinY = MathUtils.min(aabb1MinY, aabb1MaxY, aabb2MinY, aabb2MaxY);
		float newMinZ = MathUtils.min(aabb1MinZ, aabb1MaxZ, aabb2MinZ, aabb2MaxZ);
		float newMaxX = MathUtils.max(aabb1MinX, aabb1MaxX, aabb2MaxX, aabb2MaxX);
		float newMaxY = MathUtils.max(aabb1MinY, aabb1MaxY, aabb2MaxY, aabb2MaxY);
		float newMaxZ = MathUtils.max(aabb1MinZ, aabb1MaxZ, aabb2MaxZ, aabb2MaxZ);
		
		res[0] = newMinX;
		res[1] = newMinY;
		res[2] = newMinZ;
		res[3] = newMaxX;
		res[4] = newMaxY;
		res[5] = newMaxZ;
		
		return res;
	}
	
	public static float[] merge(float[] aabb1Min, float aabb1MaxX, float aabb1MaxY, float aabb1MaxZ, float aabb2MinX, float aabb2MinY, float aabb2MinZ, float aabb2MaxX, float aabb2MaxY, float aabb2MaxZ, @ExtractionParam float[] res)
	{
		float aabb1MinX = aabb1Min[0];
		float aabb1MinY = aabb1Min[1];
		float aabb1MinZ = aabb1Min[2];
		
		float newMinX = MathUtils.min(aabb1MinX, aabb1MaxX, aabb2MinX, aabb2MaxX);
		float newMinY = MathUtils.min(aabb1MinY, aabb1MaxY, aabb2MinY, aabb2MaxY);
		float newMinZ = MathUtils.min(aabb1MinZ, aabb1MaxZ, aabb2MinZ, aabb2MaxZ);
		float newMaxX = MathUtils.max(aabb1MinX, aabb1MaxX, aabb2MaxX, aabb2MaxX);
		float newMaxY = MathUtils.max(aabb1MinY, aabb1MaxY, aabb2MaxY, aabb2MaxY);
		float newMaxZ = MathUtils.max(aabb1MinZ, aabb1MaxZ, aabb2MaxZ, aabb2MaxZ);
		
		res[0] = newMinX;
		res[1] = newMinY;
		res[2] = newMinZ;
		res[3] = newMaxX;
		res[4] = newMaxY;
		res[5] = newMaxZ;
		
		return res;
	}
	
	public static float[] merge(float aabb1MinX, float aabb1MinY, float aabb1MinZ, float[] aabb1Max, float aabb2MinX, float aabb2MinY, float aabb2MinZ, float[] aabb2Max, @ExtractionParam float[] res)
	{
		float aabb1MaxX = aabb1Max[0];
		float aabb1MaxY = aabb1Max[1];
		float aabb1MaxZ = aabb1Max[2];
		
		float aabb2MaxX = aabb2Max[0];
		float aabb2MaxY = aabb2Max[1];
		float aabb2MaxZ = aabb2Max[2];
		
		float newMinX = MathUtils.min(aabb1MinX, aabb1MaxX, aabb2MinX, aabb2MaxX);
		float newMinY = MathUtils.min(aabb1MinY, aabb1MaxY, aabb2MinY, aabb2MaxY);
		float newMinZ = MathUtils.min(aabb1MinZ, aabb1MaxZ, aabb2MinZ, aabb2MaxZ);
		float newMaxX = MathUtils.max(aabb1MinX, aabb1MaxX, aabb2MaxX, aabb2MaxX);
		float newMaxY = MathUtils.max(aabb1MinY, aabb1MaxY, aabb2MaxY, aabb2MaxY);
		float newMaxZ = MathUtils.max(aabb1MinZ, aabb1MaxZ, aabb2MaxZ, aabb2MaxZ);
		
		res[0] = newMinX;
		res[1] = newMinY;
		res[2] = newMinZ;
		res[3] = newMaxX;
		res[4] = newMaxY;
		res[5] = newMaxZ;
		
		return res;
	}
	
	public static float[] merge(float aabb1MinX, float aabb1MinY, float aabb1MinZ, float[] aabb1Max, float aabb2MinX, float aabb2MinY, float aabb2MinZ, float aabb2MaxX, float aabb2MaxY, float aabb2MaxZ, @ExtractionParam float[] res)
	{
		float aabb1MaxX = aabb1Max[0];
		float aabb1MaxY = aabb1Max[1];
		float aabb1MaxZ = aabb1Max[2];
		
		float newMinX = MathUtils.min(aabb1MinX, aabb1MaxX, aabb2MinX, aabb2MaxX);
		float newMinY = MathUtils.min(aabb1MinY, aabb1MaxY, aabb2MinY, aabb2MaxY);
		float newMinZ = MathUtils.min(aabb1MinZ, aabb1MaxZ, aabb2MinZ, aabb2MaxZ);
		float newMaxX = MathUtils.max(aabb1MinX, aabb1MaxX, aabb2MaxX, aabb2MaxX);
		float newMaxY = MathUtils.max(aabb1MinY, aabb1MaxY, aabb2MaxY, aabb2MaxY);
		float newMaxZ = MathUtils.max(aabb1MinZ, aabb1MaxZ, aabb2MaxZ, aabb2MaxZ);
		
		res[0] = newMinX;
		res[1] = newMinY;
		res[2] = newMinZ;
		res[3] = newMaxX;
		res[4] = newMaxY;
		res[5] = newMaxZ;
		
		return res;
	}
	
	public static float[] merge(float aabb1MinX, float aabb1MinY, float aabb1MinZ, float aabb1MaxX, float aabb1MaxY, float aabb1MaxZ, float aabb2MinX, float aabb2MinY, float aabb2MinZ, float aabb2MaxX, float aabb2MaxY, float aabb2MaxZ, @ExtractionParam float[] res)
	{
		float newMinX = MathUtils.min(aabb1MinX, aabb1MaxX, aabb2MinX, aabb2MaxX);
		float newMinY = MathUtils.min(aabb1MinY, aabb1MaxY, aabb2MinY, aabb2MaxY);
		float newMinZ = MathUtils.min(aabb1MinZ, aabb1MaxZ, aabb2MinZ, aabb2MaxZ);
		float newMaxX = MathUtils.max(aabb1MinX, aabb1MaxX, aabb2MaxX, aabb2MaxX);
		float newMaxY = MathUtils.max(aabb1MinY, aabb1MaxY, aabb2MaxY, aabb2MaxY);
		float newMaxZ = MathUtils.max(aabb1MinZ, aabb1MaxZ, aabb2MaxZ, aabb2MaxZ);
		
		res[0] = newMinX;
		res[1] = newMinY;
		res[2] = newMinZ;
		res[3] = newMaxX;
		res[4] = newMaxY;
		res[5] = newMaxZ;
		
		return res;
	}
	
	public static float[] mergeAssign(@ExtractionParam float[] aabb1, float[] aabb2)
	{
		float aabb1MinX = aabb1[0];
		float aabb1MinY = aabb1[1];
		float aabb1MinZ = aabb1[2];
		float aabb1MaxX = aabb1[3];
		float aabb1MaxY = aabb1[4];
		float aabb1MaxZ = aabb1[5];
		
		float aabb2MinX = aabb2[0];
		float aabb2MinY = aabb2[1];
		float aabb2MinZ = aabb2[2];
		float aabb2MaxX = aabb2[3];
		float aabb2MaxY = aabb2[4];
		float aabb2MaxZ = aabb2[5];
		
		float newMinX = MathUtils.min(aabb1MinX, aabb1MaxX, aabb2MinX, aabb2MaxX);
		float newMinY = MathUtils.min(aabb1MinY, aabb1MaxY, aabb2MinY, aabb2MaxY);
		float newMinZ = MathUtils.min(aabb1MinZ, aabb1MaxZ, aabb2MinZ, aabb2MaxZ);
		float newMaxX = MathUtils.max(aabb1MinX, aabb1MaxX, aabb2MaxX, aabb2MaxX);
		float newMaxY = MathUtils.max(aabb1MinY, aabb1MaxY, aabb2MaxY, aabb2MaxY);
		float newMaxZ = MathUtils.max(aabb1MinZ, aabb1MaxZ, aabb2MaxZ, aabb2MaxZ);
		
		aabb1[0] = newMinX;
		aabb1[1] = newMinY;
		aabb1[2] = newMinZ;
		aabb1[3] = newMaxX;
		aabb1[4] = newMaxY;
		aabb1[5] = newMaxZ;
		
		return aabb1;
	}
	
	public static float[] mergeAssign(@ExtractionParam float[] aabb1, float[] aabb2Min, float[] aabb2Max)
	{
		float aabb1MinX = aabb1[0];
		float aabb1MinY = aabb1[1];
		float aabb1MinZ = aabb1[2];
		float aabb1MaxX = aabb1[3];
		float aabb1MaxY = aabb1[4];
		float aabb1MaxZ = aabb1[5];
		
		float aabb2MinX = aabb2Min[0];
		float aabb2MinY = aabb2Min[1];
		float aabb2MinZ = aabb2Min[2];
		float aabb2MaxX = aabb2Max[0];
		float aabb2MaxY = aabb2Max[1];
		float aabb2MaxZ = aabb2Max[2];
		
		float newMinX = MathUtils.min(aabb1MinX, aabb1MaxX, aabb2MinX, aabb2MaxX);
		float newMinY = MathUtils.min(aabb1MinY, aabb1MaxY, aabb2MinY, aabb2MaxY);
		float newMinZ = MathUtils.min(aabb1MinZ, aabb1MaxZ, aabb2MinZ, aabb2MaxZ);
		float newMaxX = MathUtils.max(aabb1MinX, aabb1MaxX, aabb2MaxX, aabb2MaxX);
		float newMaxY = MathUtils.max(aabb1MinY, aabb1MaxY, aabb2MaxY, aabb2MaxY);
		float newMaxZ = MathUtils.max(aabb1MinZ, aabb1MaxZ, aabb2MaxZ, aabb2MaxZ);
		
		aabb1[0] = newMinX;
		aabb1[1] = newMinY;
		aabb1[2] = newMinZ;
		aabb1[3] = newMaxX;
		aabb1[4] = newMaxY;
		aabb1[5] = newMaxZ;
		
		return aabb1;
	}
	
	public static float[] mergeAssign(@ExtractionParam float[] aabb1, float[] aabb2Min, float aabb2MaxX, float aabb2MaxY, float aabb2MaxZ)
	{
		float aabb1MinX = aabb1[0];
		float aabb1MinY = aabb1[1];
		float aabb1MinZ = aabb1[2];
		float aabb1MaxX = aabb1[3];
		float aabb1MaxY = aabb1[4];
		float aabb1MaxZ = aabb1[5];
		
		float aabb2MinX = aabb2Min[0];
		float aabb2MinY = aabb2Min[1];
		float aabb2MinZ = aabb2Min[2];
		
		float newMinX = MathUtils.min(aabb1MinX, aabb1MaxX, aabb2MinX, aabb2MaxX);
		float newMinY = MathUtils.min(aabb1MinY, aabb1MaxY, aabb2MinY, aabb2MaxY);
		float newMinZ = MathUtils.min(aabb1MinZ, aabb1MaxZ, aabb2MinZ, aabb2MaxZ);
		float newMaxX = MathUtils.max(aabb1MinX, aabb1MaxX, aabb2MaxX, aabb2MaxX);
		float newMaxY = MathUtils.max(aabb1MinY, aabb1MaxY, aabb2MaxY, aabb2MaxY);
		float newMaxZ = MathUtils.max(aabb1MinZ, aabb1MaxZ, aabb2MaxZ, aabb2MaxZ);
		
		aabb1[0] = newMinX;
		aabb1[1] = newMinY;
		aabb1[2] = newMinZ;
		aabb1[3] = newMaxX;
		aabb1[4] = newMaxY;
		aabb1[5] = newMaxZ;
		
		return aabb1;
	}
	
	public static float[] mergeAssign(@ExtractionParam float[] aabb1, float aabb2MinX, float aabb2MinY, float aabb2MinZ, float[] aabb2Max)
	{
		float aabb1MinX = aabb1[0];
		float aabb1MinY = aabb1[1];
		float aabb1MinZ = aabb1[2];
		float aabb1MaxX = aabb1[3];
		float aabb1MaxY = aabb1[4];
		float aabb1MaxZ = aabb1[5];
		
		float aabb2MaxX = aabb2Max[0];
		float aabb2MaxY = aabb2Max[1];
		float aabb2MaxZ = aabb2Max[2];
		
		float newMinX = MathUtils.min(aabb1MinX, aabb1MaxX, aabb2MinX, aabb2MaxX);
		float newMinY = MathUtils.min(aabb1MinY, aabb1MaxY, aabb2MinY, aabb2MaxY);
		float newMinZ = MathUtils.min(aabb1MinZ, aabb1MaxZ, aabb2MinZ, aabb2MaxZ);
		float newMaxX = MathUtils.max(aabb1MinX, aabb1MaxX, aabb2MaxX, aabb2MaxX);
		float newMaxY = MathUtils.max(aabb1MinY, aabb1MaxY, aabb2MaxY, aabb2MaxY);
		float newMaxZ = MathUtils.max(aabb1MinZ, aabb1MaxZ, aabb2MaxZ, aabb2MaxZ);
		
		aabb1[0] = newMinX;
		aabb1[1] = newMinY;
		aabb1[2] = newMinZ;
		aabb1[3] = newMaxX;
		aabb1[4] = newMaxY;
		aabb1[5] = newMaxZ;
		
		return aabb1;
	}

	public static float[] mergeAssign(@ExtractionParam float[] aabb1, float aabb2MinX, float aabb2MinY, float aabb2MinZ, float aabb2MaxX, float aabb2MaxY, float aabb2MaxZ)
	{
		float aabb1MinX = aabb1[0];
		float aabb1MinY = aabb1[1];
		float aabb1MinZ = aabb1[2];
		float aabb1MaxX = aabb1[3];
		float aabb1MaxY = aabb1[4];
		float aabb1MaxZ = aabb1[5];
		
		float newMinX = MathUtils.min(aabb1MinX, aabb1MaxX, aabb2MinX, aabb2MaxX);
		float newMinY = MathUtils.min(aabb1MinY, aabb1MaxY, aabb2MinY, aabb2MaxY);
		float newMinZ = MathUtils.min(aabb1MinZ, aabb1MaxZ, aabb2MinZ, aabb2MaxZ);
		float newMaxX = MathUtils.max(aabb1MinX, aabb1MaxX, aabb2MaxX, aabb2MaxX);
		float newMaxY = MathUtils.max(aabb1MinY, aabb1MaxY, aabb2MaxY, aabb2MaxY);
		float newMaxZ = MathUtils.max(aabb1MinZ, aabb1MaxZ, aabb2MaxZ, aabb2MaxZ);
		
		aabb1[0] = newMinX;
		aabb1[1] = newMinY;
		aabb1[2] = newMinZ;
		aabb1[3] = newMaxX;
		aabb1[4] = newMaxY;
		aabb1[5] = newMaxZ;
		
		return aabb1;
	}
	
	public static float[] scale(float[] aabb1, float[] scale, @ExtractionParam float[] res)
	{
		float aabb1MinX = aabb1[0];
		float aabb1MinY = aabb1[1];
		float aabb1MinZ = aabb1[2];
		float aabb1MaxX = aabb1[3];
		float aabb1MaxY = aabb1[4];
		float aabb1MaxZ = aabb1[5];
		
		float scaleX = scale[0];
		float scaleY = scale[1];
		float scaleZ = scale[2];
		
		float scaledMinX = aabb1MinX * scaleX;
		float scaledMinY = aabb1MinY * scaleY;
		float scaledMinZ = aabb1MinZ * scaleZ;
		float scaledMaxX = aabb1MaxX * scaleX;
		float scaledMaxY = aabb1MaxY * scaleY;
		float scaledMaxZ = aabb1MaxZ * scaleZ;
		
		float newMinX = MathUtils.min(scaledMinX, scaledMaxX);
		float newMinY = MathUtils.min(scaledMinY, scaledMaxY);
		float newMinZ = MathUtils.min(scaledMinZ, scaledMaxZ);
		float newMaxX = MathUtils.max(scaledMinX, scaledMaxX);
		float newMaxY = MathUtils.max(scaledMinY, scaledMaxY);
		float newMaxZ = MathUtils.max(scaledMinZ, scaledMaxZ);
		
		res[0] = newMinX;
		res[1] = newMinY;
		res[2] = newMinZ;
		res[3] = newMaxX;
		res[4] = newMaxY;
		res[5] = newMaxZ;
		
		return res;
	}
	
	public static float[] scale(float[] aabb1, float scale, @ExtractionParam float[] res)
	{
		float aabb1MinX = aabb1[0];
		float aabb1MinY = aabb1[1];
		float aabb1MinZ = aabb1[2];
		float aabb1MaxX = aabb1[3];
		float aabb1MaxY = aabb1[4];
		float aabb1MaxZ = aabb1[5];
		
		float scaleX = scale;
		float scaleY = scale;
		float scaleZ = scale;
		
		float scaledMinX = aabb1MinX * scaleX;
		float scaledMinY = aabb1MinY * scaleY;
		float scaledMinZ = aabb1MinZ * scaleZ;
		float scaledMaxX = aabb1MaxX * scaleX;
		float scaledMaxY = aabb1MaxY * scaleY;
		float scaledMaxZ = aabb1MaxZ * scaleZ;
		
		float newMinX = MathUtils.min(scaledMinX, scaledMaxX);
		float newMinY = MathUtils.min(scaledMinY, scaledMaxY);
		float newMinZ = MathUtils.min(scaledMinZ, scaledMaxZ);
		float newMaxX = MathUtils.max(scaledMinX, scaledMaxX);
		float newMaxY = MathUtils.max(scaledMinY, scaledMaxY);
		float newMaxZ = MathUtils.max(scaledMinZ, scaledMaxZ);
		
		res[0] = newMinX;
		res[1] = newMinY;
		res[2] = newMinZ;
		res[3] = newMaxX;
		res[4] = newMaxY;
		res[5] = newMaxZ;
		
		return res;
	}
	
	public static float[] scale(float[] aabb1, float scaleX, float scaleY, float scaleZ, @ExtractionParam float[] res)
	{
		float aabb1MinX = aabb1[0];
		float aabb1MinY = aabb1[1];
		float aabb1MinZ = aabb1[2];
		float aabb1MaxX = aabb1[3];
		float aabb1MaxY = aabb1[4];
		float aabb1MaxZ = aabb1[5];
		
		float scaledMinX = aabb1MinX * scaleX;
		float scaledMinY = aabb1MinY * scaleY;
		float scaledMinZ = aabb1MinZ * scaleZ;
		float scaledMaxX = aabb1MaxX * scaleX;
		float scaledMaxY = aabb1MaxY * scaleY;
		float scaledMaxZ = aabb1MaxZ * scaleZ;
		
		float newMinX = MathUtils.min(scaledMinX, scaledMaxX);
		float newMinY = MathUtils.min(scaledMinY, scaledMaxY);
		float newMinZ = MathUtils.min(scaledMinZ, scaledMaxZ);
		float newMaxX = MathUtils.max(scaledMinX, scaledMaxX);
		float newMaxY = MathUtils.max(scaledMinY, scaledMaxY);
		float newMaxZ = MathUtils.max(scaledMinZ, scaledMaxZ);
		
		res[0] = newMinX;
		res[1] = newMinY;
		res[2] = newMinZ;
		res[3] = newMaxX;
		res[4] = newMaxY;
		res[5] = newMaxZ;
		
		return res;
	}
	
	public static float[] scale(float[] aabb1Min, float[] aabb1Max, float[] scale, @ExtractionParam float[] res)
	{
		float aabb1MinX = aabb1Min[0];
		float aabb1MinY = aabb1Min[1];
		float aabb1MinZ = aabb1Min[2];
		float aabb1MaxX = aabb1Max[0];
		float aabb1MaxY = aabb1Max[1];
		float aabb1MaxZ = aabb1Max[2];
		
		float scaleX = scale[0];
		float scaleY = scale[1];
		float scaleZ = scale[2];
		
		float scaledMinX = aabb1MinX * scaleX;
		float scaledMinY = aabb1MinY * scaleY;
		float scaledMinZ = aabb1MinZ * scaleZ;
		float scaledMaxX = aabb1MaxX * scaleX;
		float scaledMaxY = aabb1MaxY * scaleY;
		float scaledMaxZ = aabb1MaxZ * scaleZ;
		
		float newMinX = MathUtils.min(scaledMinX, scaledMaxX);
		float newMinY = MathUtils.min(scaledMinY, scaledMaxY);
		float newMinZ = MathUtils.min(scaledMinZ, scaledMaxZ);
		float newMaxX = MathUtils.max(scaledMinX, scaledMaxX);
		float newMaxY = MathUtils.max(scaledMinY, scaledMaxY);
		float newMaxZ = MathUtils.max(scaledMinZ, scaledMaxZ);
		
		res[0] = newMinX;
		res[1] = newMinY;
		res[2] = newMinZ;
		res[3] = newMaxX;
		res[4] = newMaxY;
		res[5] = newMaxZ;
		
		return res;
	}
	
	public static float[] scale(float[] aabb1Min, float[] aabb1Max, float scale, @ExtractionParam float[] res)
	{
		float aabb1MinX = aabb1Min[0];
		float aabb1MinY = aabb1Min[1];
		float aabb1MinZ = aabb1Min[2];
		float aabb1MaxX = aabb1Max[0];
		float aabb1MaxY = aabb1Max[1];
		float aabb1MaxZ = aabb1Max[2];
		
		float scaleX = scale;
		float scaleY = scale;
		float scaleZ = scale;
		
		float scaledMinX = aabb1MinX * scaleX;
		float scaledMinY = aabb1MinY * scaleY;
		float scaledMinZ = aabb1MinZ * scaleZ;
		float scaledMaxX = aabb1MaxX * scaleX;
		float scaledMaxY = aabb1MaxY * scaleY;
		float scaledMaxZ = aabb1MaxZ * scaleZ;
		
		float newMinX = MathUtils.min(scaledMinX, scaledMaxX);
		float newMinY = MathUtils.min(scaledMinY, scaledMaxY);
		float newMinZ = MathUtils.min(scaledMinZ, scaledMaxZ);
		float newMaxX = MathUtils.max(scaledMinX, scaledMaxX);
		float newMaxY = MathUtils.max(scaledMinY, scaledMaxY);
		float newMaxZ = MathUtils.max(scaledMinZ, scaledMaxZ);
		
		res[0] = newMinX;
		res[1] = newMinY;
		res[2] = newMinZ;
		res[3] = newMaxX;
		res[4] = newMaxY;
		res[5] = newMaxZ;
		
		return res;
	}
	
	public static float[] scale(float[] aabb1Min, float[] aabb1Max, float scaleX, float scaleY, float scaleZ, @ExtractionParam float[] res)
	{
		float aabb1MinX = aabb1Min[0];
		float aabb1MinY = aabb1Min[1];
		float aabb1MinZ = aabb1Min[2];
		float aabb1MaxX = aabb1Max[0];
		float aabb1MaxY = aabb1Max[1];
		float aabb1MaxZ = aabb1Max[2];
		
		float scaledMinX = aabb1MinX * scaleX;
		float scaledMinY = aabb1MinY * scaleY;
		float scaledMinZ = aabb1MinZ * scaleZ;
		float scaledMaxX = aabb1MaxX * scaleX;
		float scaledMaxY = aabb1MaxY * scaleY;
		float scaledMaxZ = aabb1MaxZ * scaleZ;
		
		float newMinX = MathUtils.min(scaledMinX, scaledMaxX);
		float newMinY = MathUtils.min(scaledMinY, scaledMaxY);
		float newMinZ = MathUtils.min(scaledMinZ, scaledMaxZ);
		float newMaxX = MathUtils.max(scaledMinX, scaledMaxX);
		float newMaxY = MathUtils.max(scaledMinY, scaledMaxY);
		float newMaxZ = MathUtils.max(scaledMinZ, scaledMaxZ);
		
		res[0] = newMinX;
		res[1] = newMinY;
		res[2] = newMinZ;
		res[3] = newMaxX;
		res[4] = newMaxY;
		res[5] = newMaxZ;
		
		return res;
	}
	
	public static float[] scale(float[] aabb1Min, float aabb1MaxX, float aabb1MaxY, float aabb1MaxZ, float[] scale, @ExtractionParam float[] res)
	{
		float aabb1MinX = aabb1Min[0];
		float aabb1MinY = aabb1Min[1];
		float aabb1MinZ = aabb1Min[2];
		
		float scaleX = scale[0];
		float scaleY = scale[1];
		float scaleZ = scale[2];
		
		float scaledMinX = aabb1MinX * scaleX;
		float scaledMinY = aabb1MinY * scaleY;
		float scaledMinZ = aabb1MinZ * scaleZ;
		float scaledMaxX = aabb1MaxX * scaleX;
		float scaledMaxY = aabb1MaxY * scaleY;
		float scaledMaxZ = aabb1MaxZ * scaleZ;
		
		float newMinX = MathUtils.min(scaledMinX, scaledMaxX);
		float newMinY = MathUtils.min(scaledMinY, scaledMaxY);
		float newMinZ = MathUtils.min(scaledMinZ, scaledMaxZ);
		float newMaxX = MathUtils.max(scaledMinX, scaledMaxX);
		float newMaxY = MathUtils.max(scaledMinY, scaledMaxY);
		float newMaxZ = MathUtils.max(scaledMinZ, scaledMaxZ);
		
		res[0] = newMinX;
		res[1] = newMinY;
		res[2] = newMinZ;
		res[3] = newMaxX;
		res[4] = newMaxY;
		res[5] = newMaxZ;
		
		return res;
	}
	
	public static float[] scale(float[] aabb1Min, float aabb1MaxX, float aabb1MaxY, float aabb1MaxZ, float scale, @ExtractionParam float[] res)
	{
		float aabb1MinX = aabb1Min[0];
		float aabb1MinY = aabb1Min[1];
		float aabb1MinZ = aabb1Min[2];
		
		float scaleX = scale;
		float scaleY = scale;
		float scaleZ = scale;
		
		float scaledMinX = aabb1MinX * scaleX;
		float scaledMinY = aabb1MinY * scaleY;
		float scaledMinZ = aabb1MinZ * scaleZ;
		float scaledMaxX = aabb1MaxX * scaleX;
		float scaledMaxY = aabb1MaxY * scaleY;
		float scaledMaxZ = aabb1MaxZ * scaleZ;
		
		float newMinX = MathUtils.min(scaledMinX, scaledMaxX);
		float newMinY = MathUtils.min(scaledMinY, scaledMaxY);
		float newMinZ = MathUtils.min(scaledMinZ, scaledMaxZ);
		float newMaxX = MathUtils.max(scaledMinX, scaledMaxX);
		float newMaxY = MathUtils.max(scaledMinY, scaledMaxY);
		float newMaxZ = MathUtils.max(scaledMinZ, scaledMaxZ);
		
		res[0] = newMinX;
		res[1] = newMinY;
		res[2] = newMinZ;
		res[3] = newMaxX;
		res[4] = newMaxY;
		res[5] = newMaxZ;
		
		return res;
	}
	
	public static float[] scale(float[] aabb1Min, float aabb1MaxX, float aabb1MaxY, float aabb1MaxZ, float scaleX, float scaleY, float scaleZ, @ExtractionParam float[] res)
	{
		float aabb1MinX = aabb1Min[0];
		float aabb1MinY = aabb1Min[1];
		float aabb1MinZ = aabb1Min[2];
		
		float scaledMinX = aabb1MinX * scaleX;
		float scaledMinY = aabb1MinY * scaleY;
		float scaledMinZ = aabb1MinZ * scaleZ;
		float scaledMaxX = aabb1MaxX * scaleX;
		float scaledMaxY = aabb1MaxY * scaleY;
		float scaledMaxZ = aabb1MaxZ * scaleZ;
		
		float newMinX = MathUtils.min(scaledMinX, scaledMaxX);
		float newMinY = MathUtils.min(scaledMinY, scaledMaxY);
		float newMinZ = MathUtils.min(scaledMinZ, scaledMaxZ);
		float newMaxX = MathUtils.max(scaledMinX, scaledMaxX);
		float newMaxY = MathUtils.max(scaledMinY, scaledMaxY);
		float newMaxZ = MathUtils.max(scaledMinZ, scaledMaxZ);
		
		res[0] = newMinX;
		res[1] = newMinY;
		res[2] = newMinZ;
		res[3] = newMaxX;
		res[4] = newMaxY;
		res[5] = newMaxZ;
		
		return res;
	}
	
	public static float[] scale(float aabb1MinX, float aabb1MinY, float aabb1MinZ, float[] aabb1Max, float[] scale, @ExtractionParam float[] res)
	{
		float aabb1MaxX = aabb1Max[0];
		float aabb1MaxY = aabb1Max[1];
		float aabb1MaxZ = aabb1Max[2];
		
		float scaleX = scale[0];
		float scaleY = scale[1];
		float scaleZ = scale[2];
		
		float scaledMinX = aabb1MinX * scaleX;
		float scaledMinY = aabb1MinY * scaleY;
		float scaledMinZ = aabb1MinZ * scaleZ;
		float scaledMaxX = aabb1MaxX * scaleX;
		float scaledMaxY = aabb1MaxY * scaleY;
		float scaledMaxZ = aabb1MaxZ * scaleZ;
		
		float newMinX = MathUtils.min(scaledMinX, scaledMaxX);
		float newMinY = MathUtils.min(scaledMinY, scaledMaxY);
		float newMinZ = MathUtils.min(scaledMinZ, scaledMaxZ);
		float newMaxX = MathUtils.max(scaledMinX, scaledMaxX);
		float newMaxY = MathUtils.max(scaledMinY, scaledMaxY);
		float newMaxZ = MathUtils.max(scaledMinZ, scaledMaxZ);
		
		res[0] = newMinX;
		res[1] = newMinY;
		res[2] = newMinZ;
		res[3] = newMaxX;
		res[4] = newMaxY;
		res[5] = newMaxZ;
		
		return res;
	}
	
	public static float[] scale(float aabb1MinX, float aabb1MinY, float aabb1MinZ, float[] aabb1Max, float scale, @ExtractionParam float[] res)
	{
		float aabb1MaxX = aabb1Max[0];
		float aabb1MaxY = aabb1Max[1];
		float aabb1MaxZ = aabb1Max[2];
		
		float scaleX = scale;
		float scaleY = scale;
		float scaleZ = scale;
		
		float scaledMinX = aabb1MinX * scaleX;
		float scaledMinY = aabb1MinY * scaleY;
		float scaledMinZ = aabb1MinZ * scaleZ;
		float scaledMaxX = aabb1MaxX * scaleX;
		float scaledMaxY = aabb1MaxY * scaleY;
		float scaledMaxZ = aabb1MaxZ * scaleZ;
		
		float newMinX = MathUtils.min(scaledMinX, scaledMaxX);
		float newMinY = MathUtils.min(scaledMinY, scaledMaxY);
		float newMinZ = MathUtils.min(scaledMinZ, scaledMaxZ);
		float newMaxX = MathUtils.max(scaledMinX, scaledMaxX);
		float newMaxY = MathUtils.max(scaledMinY, scaledMaxY);
		float newMaxZ = MathUtils.max(scaledMinZ, scaledMaxZ);
		
		res[0] = newMinX;
		res[1] = newMinY;
		res[2] = newMinZ;
		res[3] = newMaxX;
		res[4] = newMaxY;
		res[5] = newMaxZ;
		
		return res;
	}
	
	public static float[] scale(float aabb1MinX, float aabb1MinY, float aabb1MinZ, float[] aabb1Max, float scaleX, float scaleY, float scaleZ, @ExtractionParam float[] res)
	{
		float aabb1MaxX = aabb1Max[0];
		float aabb1MaxY = aabb1Max[1];
		float aabb1MaxZ = aabb1Max[2];
		
		float scaledMinX = aabb1MinX * scaleX;
		float scaledMinY = aabb1MinY * scaleY;
		float scaledMinZ = aabb1MinZ * scaleZ;
		float scaledMaxX = aabb1MaxX * scaleX;
		float scaledMaxY = aabb1MaxY * scaleY;
		float scaledMaxZ = aabb1MaxZ * scaleZ;
		
		float newMinX = MathUtils.min(scaledMinX, scaledMaxX);
		float newMinY = MathUtils.min(scaledMinY, scaledMaxY);
		float newMinZ = MathUtils.min(scaledMinZ, scaledMaxZ);
		float newMaxX = MathUtils.max(scaledMinX, scaledMaxX);
		float newMaxY = MathUtils.max(scaledMinY, scaledMaxY);
		float newMaxZ = MathUtils.max(scaledMinZ, scaledMaxZ);
		
		res[0] = newMinX;
		res[1] = newMinY;
		res[2] = newMinZ;
		res[3] = newMaxX;
		res[4] = newMaxY;
		res[5] = newMaxZ;
		
		return res;
	}
	
	public static float[] scale(float aabb1MinX, float aabb1MinY, float aabb1MinZ, float aabb1MaxX, float aabb1MaxY, float aabb1MaxZ, float[] scale, @ExtractionParam float[] res)
	{
		float scaleX = scale[0];
		float scaleY = scale[1];
		float scaleZ = scale[2];
		
		float scaledMinX = aabb1MinX * scaleX;
		float scaledMinY = aabb1MinY * scaleY;
		float scaledMinZ = aabb1MinZ * scaleZ;
		float scaledMaxX = aabb1MaxX * scaleX;
		float scaledMaxY = aabb1MaxY * scaleY;
		float scaledMaxZ = aabb1MaxZ * scaleZ;
		
		float newMinX = MathUtils.min(scaledMinX, scaledMaxX);
		float newMinY = MathUtils.min(scaledMinY, scaledMaxY);
		float newMinZ = MathUtils.min(scaledMinZ, scaledMaxZ);
		float newMaxX = MathUtils.max(scaledMinX, scaledMaxX);
		float newMaxY = MathUtils.max(scaledMinY, scaledMaxY);
		float newMaxZ = MathUtils.max(scaledMinZ, scaledMaxZ);
		
		res[0] = newMinX;
		res[1] = newMinY;
		res[2] = newMinZ;
		res[3] = newMaxX;
		res[4] = newMaxY;
		res[5] = newMaxZ;
		
		return res;
	}
	
	public static float[] scale(float aabb1MinX, float aabb1MinY, float aabb1MinZ, float aabb1MaxX, float aabb1MaxY, float aabb1MaxZ, float scale, @ExtractionParam float[] res)
	{
		float scaleX = scale;
		float scaleY = scale;
		float scaleZ = scale;
		
		float scaledMinX = aabb1MinX * scaleX;
		float scaledMinY = aabb1MinY * scaleY;
		float scaledMinZ = aabb1MinZ * scaleZ;
		float scaledMaxX = aabb1MaxX * scaleX;
		float scaledMaxY = aabb1MaxY * scaleY;
		float scaledMaxZ = aabb1MaxZ * scaleZ;
		
		float newMinX = MathUtils.min(scaledMinX, scaledMaxX);
		float newMinY = MathUtils.min(scaledMinY, scaledMaxY);
		float newMinZ = MathUtils.min(scaledMinZ, scaledMaxZ);
		float newMaxX = MathUtils.max(scaledMinX, scaledMaxX);
		float newMaxY = MathUtils.max(scaledMinY, scaledMaxY);
		float newMaxZ = MathUtils.max(scaledMinZ, scaledMaxZ);
		
		res[0] = newMinX;
		res[1] = newMinY;
		res[2] = newMinZ;
		res[3] = newMaxX;
		res[4] = newMaxY;
		res[5] = newMaxZ;
		
		return res;
	}
	
	public static float[] scale(float aabb1MinX, float aabb1MinY, float aabb1MinZ, float aabb1MaxX, float aabb1MaxY, float aabb1MaxZ, float scaleX, float scaleY, float scaleZ, @ExtractionParam float[] res)
	{
		float scaledMinX = aabb1MinX * scaleX;
		float scaledMinY = aabb1MinY * scaleY;
		float scaledMinZ = aabb1MinZ * scaleZ;
		float scaledMaxX = aabb1MaxX * scaleX;
		float scaledMaxY = aabb1MaxY * scaleY;
		float scaledMaxZ = aabb1MaxZ * scaleZ;
		
		float newMinX = MathUtils.min(scaledMinX, scaledMaxX);
		float newMinY = MathUtils.min(scaledMinY, scaledMaxY);
		float newMinZ = MathUtils.min(scaledMinZ, scaledMaxZ);
		float newMaxX = MathUtils.max(scaledMinX, scaledMaxX);
		float newMaxY = MathUtils.max(scaledMinY, scaledMaxY);
		float newMaxZ = MathUtils.max(scaledMinZ, scaledMaxZ);
		
		res[0] = newMinX;
		res[1] = newMinY;
		res[2] = newMinZ;
		res[3] = newMaxX;
		res[4] = newMaxY;
		res[5] = newMaxZ;
		
		return res;
	}
	
	public static float[] scaleAssign(@ExtractionParam float[] aabb1, float[] scale)
	{
		float aabb1MinX = aabb1[0];
		float aabb1MinY = aabb1[1];
		float aabb1MinZ = aabb1[2];
		float aabb1MaxX = aabb1[3];
		float aabb1MaxY = aabb1[4];
		float aabb1MaxZ = aabb1[5];
		
		float scaleX = scale[0];
		float scaleY = scale[1];
		float scaleZ = scale[2];
		
		float scaledMinX = aabb1MinX * scaleX;
		float scaledMinY = aabb1MinY * scaleY;
		float scaledMinZ = aabb1MinZ * scaleZ;
		float scaledMaxX = aabb1MaxX * scaleX;
		float scaledMaxY = aabb1MaxY * scaleY;
		float scaledMaxZ = aabb1MaxZ * scaleZ;
		
		float newMinX = MathUtils.min(scaledMinX, scaledMaxX);
		float newMinY = MathUtils.min(scaledMinY, scaledMaxY);
		float newMinZ = MathUtils.min(scaledMinZ, scaledMaxZ);
		float newMaxX = MathUtils.max(scaledMinX, scaledMaxX);
		float newMaxY = MathUtils.max(scaledMinY, scaledMaxY);
		float newMaxZ = MathUtils.max(scaledMinZ, scaledMaxZ);
		
		aabb1[0] = newMinX;
		aabb1[1] = newMinY;
		aabb1[2] = newMinZ;
		aabb1[3] = newMaxX;
		aabb1[4] = newMaxY;
		aabb1[5] = newMaxZ;
		
		return aabb1;
	}
	
	public static float[] scaleAssign(@ExtractionParam float[] aabb1, float scale)
	{
		float aabb1MinX = aabb1[0];
		float aabb1MinY = aabb1[1];
		float aabb1MinZ = aabb1[2];
		float aabb1MaxX = aabb1[3];
		float aabb1MaxY = aabb1[4];
		float aabb1MaxZ = aabb1[5];
		
		float scaleX = scale;
		float scaleY = scale;
		float scaleZ = scale;
		
		float scaledMinX = aabb1MinX * scaleX;
		float scaledMinY = aabb1MinY * scaleY;
		float scaledMinZ = aabb1MinZ * scaleZ;
		float scaledMaxX = aabb1MaxX * scaleX;
		float scaledMaxY = aabb1MaxY * scaleY;
		float scaledMaxZ = aabb1MaxZ * scaleZ;
		
		float newMinX = MathUtils.min(scaledMinX, scaledMaxX);
		float newMinY = MathUtils.min(scaledMinY, scaledMaxY);
		float newMinZ = MathUtils.min(scaledMinZ, scaledMaxZ);
		float newMaxX = MathUtils.max(scaledMinX, scaledMaxX);
		float newMaxY = MathUtils.max(scaledMinY, scaledMaxY);
		float newMaxZ = MathUtils.max(scaledMinZ, scaledMaxZ);
		
		aabb1[0] = newMinX;
		aabb1[1] = newMinY;
		aabb1[2] = newMinZ;
		aabb1[3] = newMaxX;
		aabb1[4] = newMaxY;
		aabb1[5] = newMaxZ;
		
		return aabb1;
	}
	
	public static float[] scaleAssign(@ExtractionParam float[] aabb1, float scaleX, float scaleY, float scaleZ)
	{
		float aabb1MinX = aabb1[0];
		float aabb1MinY = aabb1[1];
		float aabb1MinZ = aabb1[2];
		float aabb1MaxX = aabb1[3];
		float aabb1MaxY = aabb1[4];
		float aabb1MaxZ = aabb1[5];
		
		float scaledMinX = aabb1MinX * scaleX;
		float scaledMinY = aabb1MinY * scaleY;
		float scaledMinZ = aabb1MinZ * scaleZ;
		float scaledMaxX = aabb1MaxX * scaleX;
		float scaledMaxY = aabb1MaxY * scaleY;
		float scaledMaxZ = aabb1MaxZ * scaleZ;
		
		float newMinX = MathUtils.min(scaledMinX, scaledMaxX);
		float newMinY = MathUtils.min(scaledMinY, scaledMaxY);
		float newMinZ = MathUtils.min(scaledMinZ, scaledMaxZ);
		float newMaxX = MathUtils.max(scaledMinX, scaledMaxX);
		float newMaxY = MathUtils.max(scaledMinY, scaledMaxY);
		float newMaxZ = MathUtils.max(scaledMinZ, scaledMaxZ);
		
		aabb1[0] = newMinX;
		aabb1[1] = newMinY;
		aabb1[2] = newMinZ;
		aabb1[3] = newMaxX;
		aabb1[4] = newMaxY;
		aabb1[5] = newMaxZ;
		
		return aabb1;
	}
	
	public static float[] scaleFromPivot(float[] aabb, float[] pivot, float[] scale, @ExtractionParam float[] res)
	{
		float aabbMinX = aabb[0];
		float aabbMinY = aabb[1];
		float aabbMinZ = aabb[2];
		float aabbMaxX = aabb[3];
		float aabbMaxY = aabb[4];
		float aabbMaxZ = aabb[5];
		
		float pivotX = pivot[0];
		float pivotY = pivot[1];
		float pivotZ = pivot[2];
		
		float scaleX = scale[0];
		float scaleY = scale[1];
		float scaleZ = scale[2];
		
		float scaledMinX = MathUtils.fma(scaleX, aabbMinX - pivotX, pivotX);
		float scaledMinY = MathUtils.fma(scaleY, aabbMinY - pivotY, pivotY);
		float scaledMinZ = MathUtils.fma(scaleZ, aabbMinZ - pivotZ, pivotZ);
		float scaledMaxX = MathUtils.fma(scaleX, aabbMaxX - pivotX, pivotX);
		float scaledMaxY = MathUtils.fma(scaleY, aabbMaxY - pivotY, pivotY);
		float scaledMaxZ = MathUtils.fma(scaleZ, aabbMaxZ - pivotZ, pivotZ);
		
		float newMinX = MathUtils.min(scaledMinX, scaledMaxX);
		float newMinY = MathUtils.min(scaledMinY, scaledMaxY);
		float newMinZ = MathUtils.min(scaledMinZ, scaledMaxZ);
		float newMaxX = MathUtils.max(scaledMinX, scaledMaxX);
		float newMaxY = MathUtils.max(scaledMinY, scaledMaxY);
		float newMaxZ = MathUtils.max(scaledMinZ, scaledMaxZ);
		
		res[0] = newMinX;
		res[1] = newMinY;
		res[2] = newMinZ;
		res[3] = newMaxX;
		res[4] = newMaxY;
		res[5] = newMaxZ;
		
		return res;
	}
	
	public static float[] scaleFromPivot(float[] aabb, float[] pivot, float scaleX, float scaleY, float scaleZ, @ExtractionParam float[] res)
	{
		float aabbMinX = aabb[0];
		float aabbMinY = aabb[1];
		float aabbMinZ = aabb[2];
		float aabbMaxX = aabb[3];
		float aabbMaxY = aabb[4];
		float aabbMaxZ = aabb[5];
		
		float pivotX = pivot[0];
		float pivotY = pivot[1];
		float pivotZ = pivot[2];
		
		float scaledMinX = MathUtils.fma(scaleX, aabbMinX - pivotX, pivotX);
		float scaledMinY = MathUtils.fma(scaleY, aabbMinY - pivotY, pivotY);
		float scaledMinZ = MathUtils.fma(scaleZ, aabbMinZ - pivotZ, pivotZ);
		float scaledMaxX = MathUtils.fma(scaleX, aabbMaxX - pivotX, pivotX);
		float scaledMaxY = MathUtils.fma(scaleY, aabbMaxY - pivotY, pivotY);
		float scaledMaxZ = MathUtils.fma(scaleZ, aabbMaxZ - pivotZ, pivotZ);
		
		float newMinX = MathUtils.min(scaledMinX, scaledMaxX);
		float newMinY = MathUtils.min(scaledMinY, scaledMaxY);
		float newMinZ = MathUtils.min(scaledMinZ, scaledMaxZ);
		float newMaxX = MathUtils.max(scaledMinX, scaledMaxX);
		float newMaxY = MathUtils.max(scaledMinY, scaledMaxY);
		float newMaxZ = MathUtils.max(scaledMinZ, scaledMaxZ);
		
		res[0] = newMinX;
		res[1] = newMinY;
		res[2] = newMinZ;
		res[3] = newMaxX;
		res[4] = newMaxY;
		res[5] = newMaxZ;
		
		return res;
	}
	
	public static float[] scaleFromPivot(float[] aabb, float pivotX, float pivotY, float pivotZ, float[] scale, @ExtractionParam float[] res)
	{
		float aabbMinX = aabb[0];
		float aabbMinY = aabb[1];
		float aabbMinZ = aabb[2];
		float aabbMaxX = aabb[3];
		float aabbMaxY = aabb[4];
		float aabbMaxZ = aabb[5];
		
		float scaleX = scale[0];
		float scaleY = scale[1];
		float scaleZ = scale[2];
		
		float scaledMinX = MathUtils.fma(scaleX, aabbMinX - pivotX, pivotX);
		float scaledMinY = MathUtils.fma(scaleY, aabbMinY - pivotY, pivotY);
		float scaledMinZ = MathUtils.fma(scaleZ, aabbMinZ - pivotZ, pivotZ);
		float scaledMaxX = MathUtils.fma(scaleX, aabbMaxX - pivotX, pivotX);
		float scaledMaxY = MathUtils.fma(scaleY, aabbMaxY - pivotY, pivotY);
		float scaledMaxZ = MathUtils.fma(scaleZ, aabbMaxZ - pivotZ, pivotZ);
		
		float newMinX = MathUtils.min(scaledMinX, scaledMaxX);
		float newMinY = MathUtils.min(scaledMinY, scaledMaxY);
		float newMinZ = MathUtils.min(scaledMinZ, scaledMaxZ);
		float newMaxX = MathUtils.max(scaledMinX, scaledMaxX);
		float newMaxY = MathUtils.max(scaledMinY, scaledMaxY);
		float newMaxZ = MathUtils.max(scaledMinZ, scaledMaxZ);
		
		res[0] = newMinX;
		res[1] = newMinY;
		res[2] = newMinZ;
		res[3] = newMaxX;
		res[4] = newMaxY;
		res[5] = newMaxZ;
		
		return res;
	}
	
	public static float[] scaleFromPivot(float[] aabb, float pivotX, float pivotY, float pivotZ, float scaleX, float scaleY, float scaleZ, @ExtractionParam float[] res)
	{
		float aabbMinX = aabb[0];
		float aabbMinY = aabb[1];
		float aabbMinZ = aabb[2];
		float aabbMaxX = aabb[3];
		float aabbMaxY = aabb[4];
		float aabbMaxZ = aabb[5];
		
		float scaledMinX = MathUtils.fma(scaleX, aabbMinX - pivotX, pivotX);
		float scaledMinY = MathUtils.fma(scaleY, aabbMinY - pivotY, pivotY);
		float scaledMinZ = MathUtils.fma(scaleZ, aabbMinZ - pivotZ, pivotZ);
		float scaledMaxX = MathUtils.fma(scaleX, aabbMaxX - pivotX, pivotX);
		float scaledMaxY = MathUtils.fma(scaleY, aabbMaxY - pivotY, pivotY);
		float scaledMaxZ = MathUtils.fma(scaleZ, aabbMaxZ - pivotZ, pivotZ);
		
		float newMinX = MathUtils.min(scaledMinX, scaledMaxX);
		float newMinY = MathUtils.min(scaledMinY, scaledMaxY);
		float newMinZ = MathUtils.min(scaledMinZ, scaledMaxZ);
		float newMaxX = MathUtils.max(scaledMinX, scaledMaxX);
		float newMaxY = MathUtils.max(scaledMinY, scaledMaxY);
		float newMaxZ = MathUtils.max(scaledMinZ, scaledMaxZ);
		
		res[0] = newMinX;
		res[1] = newMinY;
		res[2] = newMinZ;
		res[3] = newMaxX;
		res[4] = newMaxY;
		res[5] = newMaxZ;
		
		return res;
	}
	
	public static float[] scaleFromPivot(float[] aabbMin, float[] aabbMax, float[] pivot, float[] scale, @ExtractionParam float[] res)
	{
		float aabbMinX = aabbMin[0];
		float aabbMinY = aabbMin[1];
		float aabbMinZ = aabbMin[2];
		float aabbMaxX = aabbMax[0];
		float aabbMaxY = aabbMax[1];
		float aabbMaxZ = aabbMax[2];
		
		float pivotX = pivot[0];
		float pivotY = pivot[1];
		float pivotZ = pivot[2];
		
		float scaleX = scale[0];
		float scaleY = scale[1];
		float scaleZ = scale[2];
		
		float scaledMinX = MathUtils.fma(scaleX, aabbMinX - pivotX, pivotX);
		float scaledMinY = MathUtils.fma(scaleY, aabbMinY - pivotY, pivotY);
		float scaledMinZ = MathUtils.fma(scaleZ, aabbMinZ - pivotZ, pivotZ);
		float scaledMaxX = MathUtils.fma(scaleX, aabbMaxX - pivotX, pivotX);
		float scaledMaxY = MathUtils.fma(scaleY, aabbMaxY - pivotY, pivotY);
		float scaledMaxZ = MathUtils.fma(scaleZ, aabbMaxZ - pivotZ, pivotZ);
		
		float newMinX = MathUtils.min(scaledMinX, scaledMaxX);
		float newMinY = MathUtils.min(scaledMinY, scaledMaxY);
		float newMinZ = MathUtils.min(scaledMinZ, scaledMaxZ);
		float newMaxX = MathUtils.max(scaledMinX, scaledMaxX);
		float newMaxY = MathUtils.max(scaledMinY, scaledMaxY);
		float newMaxZ = MathUtils.max(scaledMinZ, scaledMaxZ);
		
		res[0] = newMinX;
		res[1] = newMinY;
		res[2] = newMinZ;
		res[3] = newMaxX;
		res[4] = newMaxY;
		res[5] = newMaxZ;
		
		return res;
	}
	
	public static float[] scaleFromPivot(float[] aabbMin, float[] aabbMax, float[] pivot, float scaleX, float scaleY, float scaleZ, @ExtractionParam float[] res)
	{
		float aabbMinX = aabbMin[0];
		float aabbMinY = aabbMin[1];
		float aabbMinZ = aabbMin[2];
		float aabbMaxX = aabbMax[0];
		float aabbMaxY = aabbMax[1];
		float aabbMaxZ = aabbMax[2];
		
		float pivotX = pivot[0];
		float pivotY = pivot[1];
		float pivotZ = pivot[2];
		
		float scaledMinX = MathUtils.fma(scaleX, aabbMinX - pivotX, pivotX);
		float scaledMinY = MathUtils.fma(scaleY, aabbMinY - pivotY, pivotY);
		float scaledMinZ = MathUtils.fma(scaleZ, aabbMinZ - pivotZ, pivotZ);
		float scaledMaxX = MathUtils.fma(scaleX, aabbMaxX - pivotX, pivotX);
		float scaledMaxY = MathUtils.fma(scaleY, aabbMaxY - pivotY, pivotY);
		float scaledMaxZ = MathUtils.fma(scaleZ, aabbMaxZ - pivotZ, pivotZ);
		
		float newMinX = MathUtils.min(scaledMinX, scaledMaxX);
		float newMinY = MathUtils.min(scaledMinY, scaledMaxY);
		float newMinZ = MathUtils.min(scaledMinZ, scaledMaxZ);
		float newMaxX = MathUtils.max(scaledMinX, scaledMaxX);
		float newMaxY = MathUtils.max(scaledMinY, scaledMaxY);
		float newMaxZ = MathUtils.max(scaledMinZ, scaledMaxZ);
		
		res[0] = newMinX;
		res[1] = newMinY;
		res[2] = newMinZ;
		res[3] = newMaxX;
		res[4] = newMaxY;
		res[5] = newMaxZ;
		
		return res;
	}
	
	public static float[] scaleFromPivot(float[] aabbMin, float[] aabbMax, float pivotX, float pivotY, float pivotZ, float[] scale, @ExtractionParam float[] res)
	{
		float aabbMinX = aabbMin[0];
		float aabbMinY = aabbMin[1];
		float aabbMinZ = aabbMin[2];
		float aabbMaxX = aabbMax[0];
		float aabbMaxY = aabbMax[1];
		float aabbMaxZ = aabbMax[2];
		
		float scaleX = scale[0];
		float scaleY = scale[1];
		float scaleZ = scale[2];
		
		float scaledMinX = MathUtils.fma(scaleX, aabbMinX - pivotX, pivotX);
		float scaledMinY = MathUtils.fma(scaleY, aabbMinY - pivotY, pivotY);
		float scaledMinZ = MathUtils.fma(scaleZ, aabbMinZ - pivotZ, pivotZ);
		float scaledMaxX = MathUtils.fma(scaleX, aabbMaxX - pivotX, pivotX);
		float scaledMaxY = MathUtils.fma(scaleY, aabbMaxY - pivotY, pivotY);
		float scaledMaxZ = MathUtils.fma(scaleZ, aabbMaxZ - pivotZ, pivotZ);
		
		float newMinX = MathUtils.min(scaledMinX, scaledMaxX);
		float newMinY = MathUtils.min(scaledMinY, scaledMaxY);
		float newMinZ = MathUtils.min(scaledMinZ, scaledMaxZ);
		float newMaxX = MathUtils.max(scaledMinX, scaledMaxX);
		float newMaxY = MathUtils.max(scaledMinY, scaledMaxY);
		float newMaxZ = MathUtils.max(scaledMinZ, scaledMaxZ);
		
		res[0] = newMinX;
		res[1] = newMinY;
		res[2] = newMinZ;
		res[3] = newMaxX;
		res[4] = newMaxY;
		res[5] = newMaxZ;
		
		return res;
	}
	
	public static float[] scaleFromPivot(float[] aabbMin, float[] aabbMax, float pivotX, float pivotY, float pivotZ, float scaleX, float scaleY, float scaleZ, @ExtractionParam float[] res)
	{
		float aabbMinX = aabbMin[0];
		float aabbMinY = aabbMin[1];
		float aabbMinZ = aabbMin[2];
		float aabbMaxX = aabbMax[0];
		float aabbMaxY = aabbMax[1];
		float aabbMaxZ = aabbMax[2];
		
		float scaledMinX = MathUtils.fma(scaleX, aabbMinX - pivotX, pivotX);
		float scaledMinY = MathUtils.fma(scaleY, aabbMinY - pivotY, pivotY);
		float scaledMinZ = MathUtils.fma(scaleZ, aabbMinZ - pivotZ, pivotZ);
		float scaledMaxX = MathUtils.fma(scaleX, aabbMaxX - pivotX, pivotX);
		float scaledMaxY = MathUtils.fma(scaleY, aabbMaxY - pivotY, pivotY);
		float scaledMaxZ = MathUtils.fma(scaleZ, aabbMaxZ - pivotZ, pivotZ);
		
		float newMinX = MathUtils.min(scaledMinX, scaledMaxX);
		float newMinY = MathUtils.min(scaledMinY, scaledMaxY);
		float newMinZ = MathUtils.min(scaledMinZ, scaledMaxZ);
		float newMaxX = MathUtils.max(scaledMinX, scaledMaxX);
		float newMaxY = MathUtils.max(scaledMinY, scaledMaxY);
		float newMaxZ = MathUtils.max(scaledMinZ, scaledMaxZ);
		
		res[0] = newMinX;
		res[1] = newMinY;
		res[2] = newMinZ;
		res[3] = newMaxX;
		res[4] = newMaxY;
		res[5] = newMaxZ;
		
		return res;
	}
	
	public static float[] scaleFromPivot(float[] aabbMin, float aabbMaxX, float aabbMaxY, float aabbMaxZ, float[] pivot, float[] scale, @ExtractionParam float[] res)
	{
		float aabbMinX = aabbMin[0];
		float aabbMinY = aabbMin[1];
		float aabbMinZ = aabbMin[2];
		
		float pivotX = pivot[0];
		float pivotY = pivot[1];
		float pivotZ = pivot[2];
		
		float scaleX = scale[0];
		float scaleY = scale[1];
		float scaleZ = scale[2];
		
		float scaledMinX = MathUtils.fma(scaleX, aabbMinX - pivotX, pivotX);
		float scaledMinY = MathUtils.fma(scaleY, aabbMinY - pivotY, pivotY);
		float scaledMinZ = MathUtils.fma(scaleZ, aabbMinZ - pivotZ, pivotZ);
		float scaledMaxX = MathUtils.fma(scaleX, aabbMaxX - pivotX, pivotX);
		float scaledMaxY = MathUtils.fma(scaleY, aabbMaxY - pivotY, pivotY);
		float scaledMaxZ = MathUtils.fma(scaleZ, aabbMaxZ - pivotZ, pivotZ);
		
		float newMinX = MathUtils.min(scaledMinX, scaledMaxX);
		float newMinY = MathUtils.min(scaledMinY, scaledMaxY);
		float newMinZ = MathUtils.min(scaledMinZ, scaledMaxZ);
		float newMaxX = MathUtils.max(scaledMinX, scaledMaxX);
		float newMaxY = MathUtils.max(scaledMinY, scaledMaxY);
		float newMaxZ = MathUtils.max(scaledMinZ, scaledMaxZ);
		
		res[0] = newMinX;
		res[1] = newMinY;
		res[2] = newMinZ;
		res[3] = newMaxX;
		res[4] = newMaxY;
		res[5] = newMaxZ;
		
		return res;
	}
	
	public static float[] scaleFromPivot(float[] aabbMin, float aabbMaxX, float aabbMaxY, float aabbMaxZ, float[] pivot, float scaleX, float scaleY, float scaleZ, @ExtractionParam float[] res)
	{
		float aabbMinX = aabbMin[0];
		float aabbMinY = aabbMin[1];
		float aabbMinZ = aabbMin[2];
		
		float pivotX = pivot[0];
		float pivotY = pivot[1];
		float pivotZ = pivot[2];
		
		float scaledMinX = MathUtils.fma(scaleX, aabbMinX - pivotX, pivotX);
		float scaledMinY = MathUtils.fma(scaleY, aabbMinY - pivotY, pivotY);
		float scaledMinZ = MathUtils.fma(scaleZ, aabbMinZ - pivotZ, pivotZ);
		float scaledMaxX = MathUtils.fma(scaleX, aabbMaxX - pivotX, pivotX);
		float scaledMaxY = MathUtils.fma(scaleY, aabbMaxY - pivotY, pivotY);
		float scaledMaxZ = MathUtils.fma(scaleZ, aabbMaxZ - pivotZ, pivotZ);
		
		float newMinX = MathUtils.min(scaledMinX, scaledMaxX);
		float newMinY = MathUtils.min(scaledMinY, scaledMaxY);
		float newMinZ = MathUtils.min(scaledMinZ, scaledMaxZ);
		float newMaxX = MathUtils.max(scaledMinX, scaledMaxX);
		float newMaxY = MathUtils.max(scaledMinY, scaledMaxY);
		float newMaxZ = MathUtils.max(scaledMinZ, scaledMaxZ);
		
		res[0] = newMinX;
		res[1] = newMinY;
		res[2] = newMinZ;
		res[3] = newMaxX;
		res[4] = newMaxY;
		res[5] = newMaxZ;
		
		return res;
	}
	
	public static float[] scaleFromPivot(float[] aabbMin, float aabbMaxX, float aabbMaxY, float aabbMaxZ, float pivotX, float pivotY, float pivotZ, float[] scale, @ExtractionParam float[] res)
	{
		float aabbMinX = aabbMin[0];
		float aabbMinY = aabbMin[1];
		float aabbMinZ = aabbMin[2];
		
		float scaleX = scale[0];
		float scaleY = scale[1];
		float scaleZ = scale[2];
		
		float scaledMinX = MathUtils.fma(scaleX, aabbMinX - pivotX, pivotX);
		float scaledMinY = MathUtils.fma(scaleY, aabbMinY - pivotY, pivotY);
		float scaledMinZ = MathUtils.fma(scaleZ, aabbMinZ - pivotZ, pivotZ);
		float scaledMaxX = MathUtils.fma(scaleX, aabbMaxX - pivotX, pivotX);
		float scaledMaxY = MathUtils.fma(scaleY, aabbMaxY - pivotY, pivotY);
		float scaledMaxZ = MathUtils.fma(scaleZ, aabbMaxZ - pivotZ, pivotZ);
		
		float newMinX = MathUtils.min(scaledMinX, scaledMaxX);
		float newMinY = MathUtils.min(scaledMinY, scaledMaxY);
		float newMinZ = MathUtils.min(scaledMinZ, scaledMaxZ);
		float newMaxX = MathUtils.max(scaledMinX, scaledMaxX);
		float newMaxY = MathUtils.max(scaledMinY, scaledMaxY);
		float newMaxZ = MathUtils.max(scaledMinZ, scaledMaxZ);
		
		res[0] = newMinX;
		res[1] = newMinY;
		res[2] = newMinZ;
		res[3] = newMaxX;
		res[4] = newMaxY;
		res[5] = newMaxZ;
		
		return res;
	}
	
	public static float[] scaleFromPivot(float[] aabbMin, float aabbMaxX, float aabbMaxY, float aabbMaxZ, float pivotX, float pivotY, float pivotZ, float scaleX, float scaleY, float scaleZ, @ExtractionParam float[] res)
	{
		float aabbMinX = aabbMin[0];
		float aabbMinY = aabbMin[1];
		float aabbMinZ = aabbMin[2];
		
		float scaledMinX = MathUtils.fma(scaleX, aabbMinX - pivotX, pivotX);
		float scaledMinY = MathUtils.fma(scaleY, aabbMinY - pivotY, pivotY);
		float scaledMinZ = MathUtils.fma(scaleZ, aabbMinZ - pivotZ, pivotZ);
		float scaledMaxX = MathUtils.fma(scaleX, aabbMaxX - pivotX, pivotX);
		float scaledMaxY = MathUtils.fma(scaleY, aabbMaxY - pivotY, pivotY);
		float scaledMaxZ = MathUtils.fma(scaleZ, aabbMaxZ - pivotZ, pivotZ);
		
		float newMinX = MathUtils.min(scaledMinX, scaledMaxX);
		float newMinY = MathUtils.min(scaledMinY, scaledMaxY);
		float newMinZ = MathUtils.min(scaledMinZ, scaledMaxZ);
		float newMaxX = MathUtils.max(scaledMinX, scaledMaxX);
		float newMaxY = MathUtils.max(scaledMinY, scaledMaxY);
		float newMaxZ = MathUtils.max(scaledMinZ, scaledMaxZ);
		
		res[0] = newMinX;
		res[1] = newMinY;
		res[2] = newMinZ;
		res[3] = newMaxX;
		res[4] = newMaxY;
		res[5] = newMaxZ;
		
		return res;
	}
	
	public static float[] scaleFromPivot(float aabbMinX, float aabbMinY, float aabbMinZ, float[] aabbMax, float[] pivot, float[] scale, @ExtractionParam float[] res)
	{
		float aabbMaxX = aabbMax[0];
		float aabbMaxY = aabbMax[1];
		float aabbMaxZ = aabbMax[2];
		
		float pivotX = pivot[0];
		float pivotY = pivot[1];
		float pivotZ = pivot[2];
		
		float scaleX = scale[0];
		float scaleY = scale[1];
		float scaleZ = scale[2];
		
		float scaledMinX = MathUtils.fma(scaleX, aabbMinX - pivotX, pivotX);
		float scaledMinY = MathUtils.fma(scaleY, aabbMinY - pivotY, pivotY);
		float scaledMinZ = MathUtils.fma(scaleZ, aabbMinZ - pivotZ, pivotZ);
		float scaledMaxX = MathUtils.fma(scaleX, aabbMaxX - pivotX, pivotX);
		float scaledMaxY = MathUtils.fma(scaleY, aabbMaxY - pivotY, pivotY);
		float scaledMaxZ = MathUtils.fma(scaleZ, aabbMaxZ - pivotZ, pivotZ);
		
		float newMinX = MathUtils.min(scaledMinX, scaledMaxX);
		float newMinY = MathUtils.min(scaledMinY, scaledMaxY);
		float newMinZ = MathUtils.min(scaledMinZ, scaledMaxZ);
		float newMaxX = MathUtils.max(scaledMinX, scaledMaxX);
		float newMaxY = MathUtils.max(scaledMinY, scaledMaxY);
		float newMaxZ = MathUtils.max(scaledMinZ, scaledMaxZ);
		
		res[0] = newMinX;
		res[1] = newMinY;
		res[2] = newMinZ;
		res[3] = newMaxX;
		res[4] = newMaxY;
		res[5] = newMaxZ;
		
		return res;
	}
	
	public static float[] scaleFromPivot(float aabbMinX, float aabbMinY, float aabbMinZ, float[] aabbMax, float[] pivot, float scaleX, float scaleY, float scaleZ, @ExtractionParam float[] res)
	{
		float aabbMaxX = aabbMax[0];
		float aabbMaxY = aabbMax[1];
		float aabbMaxZ = aabbMax[2];
		
		float pivotX = pivot[0];
		float pivotY = pivot[1];
		float pivotZ = pivot[2];
		
		float scaledMinX = MathUtils.fma(scaleX, aabbMinX - pivotX, pivotX);
		float scaledMinY = MathUtils.fma(scaleY, aabbMinY - pivotY, pivotY);
		float scaledMinZ = MathUtils.fma(scaleZ, aabbMinZ - pivotZ, pivotZ);
		float scaledMaxX = MathUtils.fma(scaleX, aabbMaxX - pivotX, pivotX);
		float scaledMaxY = MathUtils.fma(scaleY, aabbMaxY - pivotY, pivotY);
		float scaledMaxZ = MathUtils.fma(scaleZ, aabbMaxZ - pivotZ, pivotZ);
		
		float newMinX = MathUtils.min(scaledMinX, scaledMaxX);
		float newMinY = MathUtils.min(scaledMinY, scaledMaxY);
		float newMinZ = MathUtils.min(scaledMinZ, scaledMaxZ);
		float newMaxX = MathUtils.max(scaledMinX, scaledMaxX);
		float newMaxY = MathUtils.max(scaledMinY, scaledMaxY);
		float newMaxZ = MathUtils.max(scaledMinZ, scaledMaxZ);
		
		res[0] = newMinX;
		res[1] = newMinY;
		res[2] = newMinZ;
		res[3] = newMaxX;
		res[4] = newMaxY;
		res[5] = newMaxZ;
		
		return res;
	}
	
	public static float[] scaleFromPivot(float aabbMinX, float aabbMinY, float aabbMinZ, float[] aabbMax, float pivotX, float pivotY, float pivotZ, float[] scale, @ExtractionParam float[] res)
	{
		float aabbMaxX = aabbMax[0];
		float aabbMaxY = aabbMax[1];
		float aabbMaxZ = aabbMax[2];
		
		float scaleX = scale[0];
		float scaleY = scale[1];
		float scaleZ = scale[2];
		
		float scaledMinX = MathUtils.fma(scaleX, aabbMinX - pivotX, pivotX);
		float scaledMinY = MathUtils.fma(scaleY, aabbMinY - pivotY, pivotY);
		float scaledMinZ = MathUtils.fma(scaleZ, aabbMinZ - pivotZ, pivotZ);
		float scaledMaxX = MathUtils.fma(scaleX, aabbMaxX - pivotX, pivotX);
		float scaledMaxY = MathUtils.fma(scaleY, aabbMaxY - pivotY, pivotY);
		float scaledMaxZ = MathUtils.fma(scaleZ, aabbMaxZ - pivotZ, pivotZ);
		
		float newMinX = MathUtils.min(scaledMinX, scaledMaxX);
		float newMinY = MathUtils.min(scaledMinY, scaledMaxY);
		float newMinZ = MathUtils.min(scaledMinZ, scaledMaxZ);
		float newMaxX = MathUtils.max(scaledMinX, scaledMaxX);
		float newMaxY = MathUtils.max(scaledMinY, scaledMaxY);
		float newMaxZ = MathUtils.max(scaledMinZ, scaledMaxZ);
		
		res[0] = newMinX;
		res[1] = newMinY;
		res[2] = newMinZ;
		res[3] = newMaxX;
		res[4] = newMaxY;
		res[5] = newMaxZ;
		
		return res;
	}
	
	public static float[] scaleFromPivot(float aabbMinX, float aabbMinY, float aabbMinZ, float[] aabbMax, float pivotX, float pivotY, float pivotZ, float scaleX, float scaleY, float scaleZ, @ExtractionParam float[] res)
	{
		float aabbMaxX = aabbMax[0];
		float aabbMaxY = aabbMax[1];
		float aabbMaxZ = aabbMax[2];
		
		float scaledMinX = MathUtils.fma(scaleX, aabbMinX - pivotX, pivotX);
		float scaledMinY = MathUtils.fma(scaleY, aabbMinY - pivotY, pivotY);
		float scaledMinZ = MathUtils.fma(scaleZ, aabbMinZ - pivotZ, pivotZ);
		float scaledMaxX = MathUtils.fma(scaleX, aabbMaxX - pivotX, pivotX);
		float scaledMaxY = MathUtils.fma(scaleY, aabbMaxY - pivotY, pivotY);
		float scaledMaxZ = MathUtils.fma(scaleZ, aabbMaxZ - pivotZ, pivotZ);
		
		float newMinX = MathUtils.min(scaledMinX, scaledMaxX);
		float newMinY = MathUtils.min(scaledMinY, scaledMaxY);
		float newMinZ = MathUtils.min(scaledMinZ, scaledMaxZ);
		float newMaxX = MathUtils.max(scaledMinX, scaledMaxX);
		float newMaxY = MathUtils.max(scaledMinY, scaledMaxY);
		float newMaxZ = MathUtils.max(scaledMinZ, scaledMaxZ);
		
		res[0] = newMinX;
		res[1] = newMinY;
		res[2] = newMinZ;
		res[3] = newMaxX;
		res[4] = newMaxY;
		res[5] = newMaxZ;
		
		return res;
	}
	
	public static float[] scaleFromPivot(float aabbMinX, float aabbMinY, float aabbMinZ, float aabbMaxX, float aabbMaxY, float aabbMaxZ, float[] pivot, float[] scale, @ExtractionParam float[] res)
	{
		float pivotX = pivot[0];
		float pivotY = pivot[1];
		float pivotZ = pivot[2];
		
		float scaleX = scale[0];
		float scaleY = scale[1];
		float scaleZ = scale[2];
		
		float scaledMinX = MathUtils.fma(scaleX, aabbMinX - pivotX, pivotX);
		float scaledMinY = MathUtils.fma(scaleY, aabbMinY - pivotY, pivotY);
		float scaledMinZ = MathUtils.fma(scaleZ, aabbMinZ - pivotZ, pivotZ);
		float scaledMaxX = MathUtils.fma(scaleX, aabbMaxX - pivotX, pivotX);
		float scaledMaxY = MathUtils.fma(scaleY, aabbMaxY - pivotY, pivotY);
		float scaledMaxZ = MathUtils.fma(scaleZ, aabbMaxZ - pivotZ, pivotZ);
		
		float newMinX = MathUtils.min(scaledMinX, scaledMaxX);
		float newMinY = MathUtils.min(scaledMinY, scaledMaxY);
		float newMinZ = MathUtils.min(scaledMinZ, scaledMaxZ);
		float newMaxX = MathUtils.max(scaledMinX, scaledMaxX);
		float newMaxY = MathUtils.max(scaledMinY, scaledMaxY);
		float newMaxZ = MathUtils.max(scaledMinZ, scaledMaxZ);
		
		res[0] = newMinX;
		res[1] = newMinY;
		res[2] = newMinZ;
		res[3] = newMaxX;
		res[4] = newMaxY;
		res[5] = newMaxZ;
		
		return res;
	}
	
	public static float[] scaleFromPivot(float aabbMinX, float aabbMinY, float aabbMinZ, float aabbMaxX, float aabbMaxY, float aabbMaxZ, float[] pivot, float scaleX, float scaleY, float scaleZ, @ExtractionParam float[] res)
	{
		float pivotX = pivot[0];
		float pivotY = pivot[1];
		float pivotZ = pivot[2];
		
		float scaledMinX = MathUtils.fma(scaleX, aabbMinX - pivotX, pivotX);
		float scaledMinY = MathUtils.fma(scaleY, aabbMinY - pivotY, pivotY);
		float scaledMinZ = MathUtils.fma(scaleZ, aabbMinZ - pivotZ, pivotZ);
		float scaledMaxX = MathUtils.fma(scaleX, aabbMaxX - pivotX, pivotX);
		float scaledMaxY = MathUtils.fma(scaleY, aabbMaxY - pivotY, pivotY);
		float scaledMaxZ = MathUtils.fma(scaleZ, aabbMaxZ - pivotZ, pivotZ);
		
		float newMinX = MathUtils.min(scaledMinX, scaledMaxX);
		float newMinY = MathUtils.min(scaledMinY, scaledMaxY);
		float newMinZ = MathUtils.min(scaledMinZ, scaledMaxZ);
		float newMaxX = MathUtils.max(scaledMinX, scaledMaxX);
		float newMaxY = MathUtils.max(scaledMinY, scaledMaxY);
		float newMaxZ = MathUtils.max(scaledMinZ, scaledMaxZ);
		
		res[0] = newMinX;
		res[1] = newMinY;
		res[2] = newMinZ;
		res[3] = newMaxX;
		res[4] = newMaxY;
		res[5] = newMaxZ;
		
		return res;
	}
	
	public static float[] scaleFromPivot(float aabbMinX, float aabbMinY, float aabbMinZ, float aabbMaxX, float aabbMaxY, float aabbMaxZ, float pivotX, float pivotY, float pivotZ, float[] scale, @ExtractionParam float[] res)
	{
		float scaleX = scale[0];
		float scaleY = scale[1];
		float scaleZ = scale[2];
		
		float scaledMinX = MathUtils.fma(scaleX, aabbMinX - pivotX, pivotX);
		float scaledMinY = MathUtils.fma(scaleY, aabbMinY - pivotY, pivotY);
		float scaledMinZ = MathUtils.fma(scaleZ, aabbMinZ - pivotZ, pivotZ);
		float scaledMaxX = MathUtils.fma(scaleX, aabbMaxX - pivotX, pivotX);
		float scaledMaxY = MathUtils.fma(scaleY, aabbMaxY - pivotY, pivotY);
		float scaledMaxZ = MathUtils.fma(scaleZ, aabbMaxZ - pivotZ, pivotZ);
		
		float newMinX = MathUtils.min(scaledMinX, scaledMaxX);
		float newMinY = MathUtils.min(scaledMinY, scaledMaxY);
		float newMinZ = MathUtils.min(scaledMinZ, scaledMaxZ);
		float newMaxX = MathUtils.max(scaledMinX, scaledMaxX);
		float newMaxY = MathUtils.max(scaledMinY, scaledMaxY);
		float newMaxZ = MathUtils.max(scaledMinZ, scaledMaxZ);
		
		res[0] = newMinX;
		res[1] = newMinY;
		res[2] = newMinZ;
		res[3] = newMaxX;
		res[4] = newMaxY;
		res[5] = newMaxZ;
		
		return res;
	}
	
	public static float[] scaleFromPivot(float aabbMinX, float aabbMinY, float aabbMinZ, float aabbMaxX, float aabbMaxY, float aabbMaxZ, float pivotX, float pivotY, float pivotZ, float scaleX, float scaleY, float scaleZ, @ExtractionParam float[] res)
	{
		float scaledMinX = MathUtils.fma(scaleX, aabbMinX - pivotX, pivotX);
		float scaledMinY = MathUtils.fma(scaleY, aabbMinY - pivotY, pivotY);
		float scaledMinZ = MathUtils.fma(scaleZ, aabbMinZ - pivotZ, pivotZ);
		float scaledMaxX = MathUtils.fma(scaleX, aabbMaxX - pivotX, pivotX);
		float scaledMaxY = MathUtils.fma(scaleY, aabbMaxY - pivotY, pivotY);
		float scaledMaxZ = MathUtils.fma(scaleZ, aabbMaxZ - pivotZ, pivotZ);
		
		float newMinX = MathUtils.min(scaledMinX, scaledMaxX);
		float newMinY = MathUtils.min(scaledMinY, scaledMaxY);
		float newMinZ = MathUtils.min(scaledMinZ, scaledMaxZ);
		float newMaxX = MathUtils.max(scaledMinX, scaledMaxX);
		float newMaxY = MathUtils.max(scaledMinY, scaledMaxY);
		float newMaxZ = MathUtils.max(scaledMinZ, scaledMaxZ);
		
		res[0] = newMinX;
		res[1] = newMinY;
		res[2] = newMinZ;
		res[3] = newMaxX;
		res[4] = newMaxY;
		res[5] = newMaxZ;
		
		return res;
	}
	
	public static float[] scaleFromPivotAssign(@ExtractionParam float[] aabb, float[] pivot, float[] scale)
	{
		float aabbMinX = aabb[0];
		float aabbMinY = aabb[1];
		float aabbMinZ = aabb[2];
		float aabbMaxX = aabb[3];
		float aabbMaxY = aabb[4];
		float aabbMaxZ = aabb[5];
		
		float pivotX = pivot[0];
		float pivotY = pivot[1];
		float pivotZ = pivot[2];
		
		float scaleX = scale[0];
		float scaleY = scale[1];
		float scaleZ = scale[2];
		
		float scaledMinX = MathUtils.fma(scaleX, aabbMinX - pivotX, pivotX);
		float scaledMinY = MathUtils.fma(scaleY, aabbMinY - pivotY, pivotY);
		float scaledMinZ = MathUtils.fma(scaleZ, aabbMinZ - pivotZ, pivotZ);
		float scaledMaxX = MathUtils.fma(scaleX, aabbMaxX - pivotX, pivotX);
		float scaledMaxY = MathUtils.fma(scaleY, aabbMaxY - pivotY, pivotY);
		float scaledMaxZ = MathUtils.fma(scaleZ, aabbMaxZ - pivotZ, pivotZ);
		
		float newMinX = MathUtils.min(scaledMinX, scaledMaxX);
		float newMinY = MathUtils.min(scaledMinY, scaledMaxY);
		float newMinZ = MathUtils.min(scaledMinZ, scaledMaxZ);
		float newMaxX = MathUtils.max(scaledMinX, scaledMaxX);
		float newMaxY = MathUtils.max(scaledMinY, scaledMaxY);
		float newMaxZ = MathUtils.max(scaledMinZ, scaledMaxZ);
		
		aabb[0] = newMinX;
		aabb[1] = newMinY;
		aabb[2] = newMinZ;
		aabb[3] = newMaxX;
		aabb[4] = newMaxY;
		aabb[5] = newMaxZ;
		
		return aabb;
	}
	
	public static float[] scaleFromPivotAssign(@ExtractionParam float[] aabb, float[] pivot, float scaleX, float scaleY, float scaleZ)
	{
		float aabbMinX = aabb[0];
		float aabbMinY = aabb[1];
		float aabbMinZ = aabb[2];
		float aabbMaxX = aabb[3];
		float aabbMaxY = aabb[4];
		float aabbMaxZ = aabb[5];
		
		float pivotX = pivot[0];
		float pivotY = pivot[1];
		float pivotZ = pivot[2];
		
		float scaledMinX = MathUtils.fma(scaleX, aabbMinX - pivotX, pivotX);
		float scaledMinY = MathUtils.fma(scaleY, aabbMinY - pivotY, pivotY);
		float scaledMinZ = MathUtils.fma(scaleZ, aabbMinZ - pivotZ, pivotZ);
		float scaledMaxX = MathUtils.fma(scaleX, aabbMaxX - pivotX, pivotX);
		float scaledMaxY = MathUtils.fma(scaleY, aabbMaxY - pivotY, pivotY);
		float scaledMaxZ = MathUtils.fma(scaleZ, aabbMaxZ - pivotZ, pivotZ);
		
		float newMinX = MathUtils.min(scaledMinX, scaledMaxX);
		float newMinY = MathUtils.min(scaledMinY, scaledMaxY);
		float newMinZ = MathUtils.min(scaledMinZ, scaledMaxZ);
		float newMaxX = MathUtils.max(scaledMinX, scaledMaxX);
		float newMaxY = MathUtils.max(scaledMinY, scaledMaxY);
		float newMaxZ = MathUtils.max(scaledMinZ, scaledMaxZ);
		
		aabb[0] = newMinX;
		aabb[1] = newMinY;
		aabb[2] = newMinZ;
		aabb[3] = newMaxX;
		aabb[4] = newMaxY;
		aabb[5] = newMaxZ;
		
		return aabb;
	}
	
	public static float[] scaleFromPivotAssign(@ExtractionParam float[] aabb, float pivotX, float pivotY, float pivotZ, float[] scale)
	{
		float aabbMinX = aabb[0];
		float aabbMinY = aabb[1];
		float aabbMinZ = aabb[2];
		float aabbMaxX = aabb[3];
		float aabbMaxY = aabb[4];
		float aabbMaxZ = aabb[5];
		
		float scaleX = scale[0];
		float scaleY = scale[1];
		float scaleZ = scale[2];
		
		float scaledMinX = MathUtils.fma(scaleX, aabbMinX - pivotX, pivotX);
		float scaledMinY = MathUtils.fma(scaleY, aabbMinY - pivotY, pivotY);
		float scaledMinZ = MathUtils.fma(scaleZ, aabbMinZ - pivotZ, pivotZ);
		float scaledMaxX = MathUtils.fma(scaleX, aabbMaxX - pivotX, pivotX);
		float scaledMaxY = MathUtils.fma(scaleY, aabbMaxY - pivotY, pivotY);
		float scaledMaxZ = MathUtils.fma(scaleZ, aabbMaxZ - pivotZ, pivotZ);
		
		float newMinX = MathUtils.min(scaledMinX, scaledMaxX);
		float newMinY = MathUtils.min(scaledMinY, scaledMaxY);
		float newMinZ = MathUtils.min(scaledMinZ, scaledMaxZ);
		float newMaxX = MathUtils.max(scaledMinX, scaledMaxX);
		float newMaxY = MathUtils.max(scaledMinY, scaledMaxY);
		float newMaxZ = MathUtils.max(scaledMinZ, scaledMaxZ);
		
		aabb[0] = newMinX;
		aabb[1] = newMinY;
		aabb[2] = newMinZ;
		aabb[3] = newMaxX;
		aabb[4] = newMaxY;
		aabb[5] = newMaxZ;
		
		return aabb;
	}
	
	public static float[] scaleFromPivotAssign(@ExtractionParam float[] aabb, float pivotX, float pivotY, float pivotZ, float scaleX, float scaleY, float scaleZ)
	{
		float aabbMinX = aabb[0];
		float aabbMinY = aabb[1];
		float aabbMinZ = aabb[2];
		float aabbMaxX = aabb[3];
		float aabbMaxY = aabb[4];
		float aabbMaxZ = aabb[5];
		
		float scaledMinX = MathUtils.fma(scaleX, aabbMinX - pivotX, pivotX);
		float scaledMinY = MathUtils.fma(scaleY, aabbMinY - pivotY, pivotY);
		float scaledMinZ = MathUtils.fma(scaleZ, aabbMinZ - pivotZ, pivotZ);
		float scaledMaxX = MathUtils.fma(scaleX, aabbMaxX - pivotX, pivotX);
		float scaledMaxY = MathUtils.fma(scaleY, aabbMaxY - pivotY, pivotY);
		float scaledMaxZ = MathUtils.fma(scaleZ, aabbMaxZ - pivotZ, pivotZ);
		
		float newMinX = MathUtils.min(scaledMinX, scaledMaxX);
		float newMinY = MathUtils.min(scaledMinY, scaledMaxY);
		float newMinZ = MathUtils.min(scaledMinZ, scaledMaxZ);
		float newMaxX = MathUtils.max(scaledMinX, scaledMaxX);
		float newMaxY = MathUtils.max(scaledMinY, scaledMaxY);
		float newMaxZ = MathUtils.max(scaledMinZ, scaledMaxZ);
		
		aabb[0] = newMinX;
		aabb[1] = newMinY;
		aabb[2] = newMinZ;
		aabb[3] = newMaxX;
		aabb[4] = newMaxY;
		aabb[5] = newMaxZ;
		
		return aabb;
	}
	
	public static float[] scaleFromMin(float[] aabb, float[] scale, @ExtractionParam float[] res)
	{
		float aabbMinX = aabb[0];
		float aabbMinY = aabb[1];
		float aabbMinZ = aabb[2];
		float aabbMaxX = aabb[3];
		float aabbMaxY = aabb[4];
		float aabbMaxZ = aabb[5];
		
		float scaleX = scale[0];
		float scaleY = scale[1];
		float scaleZ = scale[2];
		
		float scaledMaxX = MathUtils.fma(scaleX, aabbMaxX - aabbMinX, aabbMinX);
		float scaledMaxY = MathUtils.fma(scaleY, aabbMaxY - aabbMinY, aabbMinY);
		float scaledMaxZ = MathUtils.fma(scaleZ, aabbMaxZ - aabbMinZ, aabbMinZ);
		
		float newMinX = MathUtils.min(aabbMinX, scaledMaxX);
		float newMinY = MathUtils.min(aabbMinY, scaledMaxY);
		float newMinZ = MathUtils.min(aabbMinZ, scaledMaxZ);
		float newMaxX = MathUtils.max(aabbMinX, scaledMaxX);
		float newMaxY = MathUtils.max(aabbMinY, scaledMaxY);
		float newMaxZ = MathUtils.max(aabbMinZ, scaledMaxZ);
		
		res[0] = newMinX;
		res[1] = newMinY;
		res[2] = newMinZ;
		res[3] = newMaxX;
		res[4] = newMaxY;
		res[5] = newMaxZ;
		
		return res;
	}
	
	public static float[] scaleFromMin(float[] aabb, float scaleX, float scaleY, float scaleZ, @ExtractionParam float[] res)
	{
		float aabbMinX = aabb[0];
		float aabbMinY = aabb[1];
		float aabbMinZ = aabb[2];
		float aabbMaxX = aabb[3];
		float aabbMaxY = aabb[4];
		float aabbMaxZ = aabb[5];
		
		float scaledMaxX = MathUtils.fma(scaleX, aabbMaxX - aabbMinX, aabbMinX);
		float scaledMaxY = MathUtils.fma(scaleY, aabbMaxY - aabbMinY, aabbMinY);
		float scaledMaxZ = MathUtils.fma(scaleZ, aabbMaxZ - aabbMinZ, aabbMinZ);
		
		float newMinX = MathUtils.min(aabbMinX, scaledMaxX);
		float newMinY = MathUtils.min(aabbMinY, scaledMaxY);
		float newMinZ = MathUtils.min(aabbMinZ, scaledMaxZ);
		float newMaxX = MathUtils.max(aabbMinX, scaledMaxX);
		float newMaxY = MathUtils.max(aabbMinY, scaledMaxY);
		float newMaxZ = MathUtils.max(aabbMinZ, scaledMaxZ);
		
		res[0] = newMinX;
		res[1] = newMinY;
		res[2] = newMinZ;
		res[3] = newMaxX;
		res[4] = newMaxY;
		res[5] = newMaxZ;
		
		return res;
	}
	
	public static float[] scaleFromMin(float[] aabbMin, float[] aabbMax, float[] scale, @ExtractionParam float[] res)
	{
		float aabbMinX = aabbMin[0];
		float aabbMinY = aabbMin[1];
		float aabbMinZ = aabbMin[2];
		float aabbMaxX = aabbMax[0];
		float aabbMaxY = aabbMax[1];
		float aabbMaxZ = aabbMax[2];
		
		float scaleX = scale[0];
		float scaleY = scale[1];
		float scaleZ = scale[2];
		
		float scaledMaxX = MathUtils.fma(scaleX, aabbMaxX - aabbMinX, aabbMinX);
		float scaledMaxY = MathUtils.fma(scaleY, aabbMaxY - aabbMinY, aabbMinY);
		float scaledMaxZ = MathUtils.fma(scaleZ, aabbMaxZ - aabbMinZ, aabbMinZ);
		
		float newMinX = MathUtils.min(aabbMinX, scaledMaxX);
		float newMinY = MathUtils.min(aabbMinY, scaledMaxY);
		float newMinZ = MathUtils.min(aabbMinZ, scaledMaxZ);
		float newMaxX = MathUtils.max(aabbMinX, scaledMaxX);
		float newMaxY = MathUtils.max(aabbMinY, scaledMaxY);
		float newMaxZ = MathUtils.max(aabbMinZ, scaledMaxZ);
		
		res[0] = newMinX;
		res[1] = newMinY;
		res[2] = newMinZ;
		res[3] = newMaxX;
		res[4] = newMaxY;
		res[5] = newMaxZ;
		
		return res;
	}
	
	public static float[] scaleFromMin(float[] aabbMin, float[] aabbMax, float scaleX, float scaleY, float scaleZ, @ExtractionParam float[] res)
	{
		float aabbMinX = aabbMin[0];
		float aabbMinY = aabbMin[1];
		float aabbMinZ = aabbMin[2];
		float aabbMaxX = aabbMax[0];
		float aabbMaxY = aabbMax[1];
		float aabbMaxZ = aabbMax[2];
		
		float scaledMaxX = MathUtils.fma(scaleX, aabbMaxX - aabbMinX, aabbMinX);
		float scaledMaxY = MathUtils.fma(scaleY, aabbMaxY - aabbMinY, aabbMinY);
		float scaledMaxZ = MathUtils.fma(scaleZ, aabbMaxZ - aabbMinZ, aabbMinZ);
		
		float newMinX = MathUtils.min(aabbMinX, scaledMaxX);
		float newMinY = MathUtils.min(aabbMinY, scaledMaxY);
		float newMinZ = MathUtils.min(aabbMinZ, scaledMaxZ);
		float newMaxX = MathUtils.max(aabbMinX, scaledMaxX);
		float newMaxY = MathUtils.max(aabbMinY, scaledMaxY);
		float newMaxZ = MathUtils.max(aabbMinZ, scaledMaxZ);
		
		res[0] = newMinX;
		res[1] = newMinY;
		res[2] = newMinZ;
		res[3] = newMaxX;
		res[4] = newMaxY;
		res[5] = newMaxZ;
		
		return res;
	}
	
	public static float[] scaleFromMin(float[] aabbMin, float aabbMaxX, float aabbMaxY, float aabbMaxZ, float[] scale, @ExtractionParam float[] res)
	{
		float aabbMinX = aabbMin[0];
		float aabbMinY = aabbMin[1];
		float aabbMinZ = aabbMin[2];
		
		float scaleX = scale[0];
		float scaleY = scale[1];
		float scaleZ = scale[2];
		
		float scaledMaxX = MathUtils.fma(scaleX, aabbMaxX - aabbMinX, aabbMinX);
		float scaledMaxY = MathUtils.fma(scaleY, aabbMaxY - aabbMinY, aabbMinY);
		float scaledMaxZ = MathUtils.fma(scaleZ, aabbMaxZ - aabbMinZ, aabbMinZ);
		
		float newMinX = MathUtils.min(aabbMinX, scaledMaxX);
		float newMinY = MathUtils.min(aabbMinY, scaledMaxY);
		float newMinZ = MathUtils.min(aabbMinZ, scaledMaxZ);
		float newMaxX = MathUtils.max(aabbMinX, scaledMaxX);
		float newMaxY = MathUtils.max(aabbMinY, scaledMaxY);
		float newMaxZ = MathUtils.max(aabbMinZ, scaledMaxZ);
		
		res[0] = newMinX;
		res[1] = newMinY;
		res[2] = newMinZ;
		res[3] = newMaxX;
		res[4] = newMaxY;
		res[5] = newMaxZ;
		
		return res;
	}
	
	public static float[] scaleFromMin(float[] aabbMin, float aabbMaxX, float aabbMaxY, float aabbMaxZ, float scaleX, float scaleY, float scaleZ, @ExtractionParam float[] res)
	{
		float aabbMinX = aabbMin[0];
		float aabbMinY = aabbMin[1];
		float aabbMinZ = aabbMin[2];
		
		float scaledMaxX = MathUtils.fma(scaleX, aabbMaxX - aabbMinX, aabbMinX);
		float scaledMaxY = MathUtils.fma(scaleY, aabbMaxY - aabbMinY, aabbMinY);
		float scaledMaxZ = MathUtils.fma(scaleZ, aabbMaxZ - aabbMinZ, aabbMinZ);
		
		float newMinX = MathUtils.min(aabbMinX, scaledMaxX);
		float newMinY = MathUtils.min(aabbMinY, scaledMaxY);
		float newMinZ = MathUtils.min(aabbMinZ, scaledMaxZ);
		float newMaxX = MathUtils.max(aabbMinX, scaledMaxX);
		float newMaxY = MathUtils.max(aabbMinY, scaledMaxY);
		float newMaxZ = MathUtils.max(aabbMinZ, scaledMaxZ);
		
		res[0] = newMinX;
		res[1] = newMinY;
		res[2] = newMinZ;
		res[3] = newMaxX;
		res[4] = newMaxY;
		res[5] = newMaxZ;
		
		return res;
	}
	
	public static float[] scaleFromMin(float aabbMinX, float aabbMinY, float aabbMinZ, float[] aabbMax, float[] scale, @ExtractionParam float[] res)
	{
		float aabbMaxX = aabbMax[0];
		float aabbMaxY = aabbMax[1];
		float aabbMaxZ = aabbMax[2];
		
		float scaleX = scale[0];
		float scaleY = scale[1];
		float scaleZ = scale[2];
		
		float scaledMaxX = MathUtils.fma(scaleX, aabbMaxX - aabbMinX, aabbMinX);
		float scaledMaxY = MathUtils.fma(scaleY, aabbMaxY - aabbMinY, aabbMinY);
		float scaledMaxZ = MathUtils.fma(scaleZ, aabbMaxZ - aabbMinZ, aabbMinZ);
		
		float newMinX = MathUtils.min(aabbMinX, scaledMaxX);
		float newMinY = MathUtils.min(aabbMinY, scaledMaxY);
		float newMinZ = MathUtils.min(aabbMinZ, scaledMaxZ);
		float newMaxX = MathUtils.max(aabbMinX, scaledMaxX);
		float newMaxY = MathUtils.max(aabbMinY, scaledMaxY);
		float newMaxZ = MathUtils.max(aabbMinZ, scaledMaxZ);
		
		res[0] = newMinX;
		res[1] = newMinY;
		res[2] = newMinZ;
		res[3] = newMaxX;
		res[4] = newMaxY;
		res[5] = newMaxZ;
		
		return res;
	}
	
	public static float[] scaleFromMin(float aabbMinX, float aabbMinY, float aabbMinZ, float[] aabbMax, float scaleX, float scaleY, float scaleZ, @ExtractionParam float[] res)
	{
		float aabbMaxX = aabbMax[0];
		float aabbMaxY = aabbMax[1];
		float aabbMaxZ = aabbMax[2];
		
		float scaledMaxX = MathUtils.fma(scaleX, aabbMaxX - aabbMinX, aabbMinX);
		float scaledMaxY = MathUtils.fma(scaleY, aabbMaxY - aabbMinY, aabbMinY);
		float scaledMaxZ = MathUtils.fma(scaleZ, aabbMaxZ - aabbMinZ, aabbMinZ);
		
		float newMinX = MathUtils.min(aabbMinX, scaledMaxX);
		float newMinY = MathUtils.min(aabbMinY, scaledMaxY);
		float newMinZ = MathUtils.min(aabbMinZ, scaledMaxZ);
		float newMaxX = MathUtils.max(aabbMinX, scaledMaxX);
		float newMaxY = MathUtils.max(aabbMinY, scaledMaxY);
		float newMaxZ = MathUtils.max(aabbMinZ, scaledMaxZ);
		
		res[0] = newMinX;
		res[1] = newMinY;
		res[2] = newMinZ;
		res[3] = newMaxX;
		res[4] = newMaxY;
		res[5] = newMaxZ;
		
		return res;
	}
	
	public static float[] scaleFromMin(float aabbMinX, float aabbMinY, float aabbMinZ, float aabbMaxX, float aabbMaxY, float aabbMaxZ, float[] scale, @ExtractionParam float[] res)
	{
		float scaleX = scale[0];
		float scaleY = scale[1];
		float scaleZ = scale[2];
		
		float scaledMaxX = MathUtils.fma(scaleX, aabbMaxX - aabbMinX, aabbMinX);
		float scaledMaxY = MathUtils.fma(scaleY, aabbMaxY - aabbMinY, aabbMinY);
		float scaledMaxZ = MathUtils.fma(scaleZ, aabbMaxZ - aabbMinZ, aabbMinZ);
		
		float newMinX = MathUtils.min(aabbMinX, scaledMaxX);
		float newMinY = MathUtils.min(aabbMinY, scaledMaxY);
		float newMinZ = MathUtils.min(aabbMinZ, scaledMaxZ);
		float newMaxX = MathUtils.max(aabbMinX, scaledMaxX);
		float newMaxY = MathUtils.max(aabbMinY, scaledMaxY);
		float newMaxZ = MathUtils.max(aabbMinZ, scaledMaxZ);
		
		res[0] = newMinX;
		res[1] = newMinY;
		res[2] = newMinZ;
		res[3] = newMaxX;
		res[4] = newMaxY;
		res[5] = newMaxZ;
		
		return res;
	}
	
	public static float[] scaleFromMin(float aabbMinX, float aabbMinY, float aabbMinZ, float aabbMaxX, float aabbMaxY, float aabbMaxZ, float scaleX, float scaleY, float scaleZ, @ExtractionParam float[] res)
	{
		float scaledMaxX = MathUtils.fma(scaleX, aabbMaxX - aabbMinX, aabbMinX);
		float scaledMaxY = MathUtils.fma(scaleY, aabbMaxY - aabbMinY, aabbMinY);
		float scaledMaxZ = MathUtils.fma(scaleZ, aabbMaxZ - aabbMinZ, aabbMinZ);
		
		float newMinX = MathUtils.min(aabbMinX, scaledMaxX);
		float newMinY = MathUtils.min(aabbMinY, scaledMaxY);
		float newMinZ = MathUtils.min(aabbMinZ, scaledMaxZ);
		float newMaxX = MathUtils.max(aabbMinX, scaledMaxX);
		float newMaxY = MathUtils.max(aabbMinY, scaledMaxY);
		float newMaxZ = MathUtils.max(aabbMinZ, scaledMaxZ);
		
		res[0] = newMinX;
		res[1] = newMinY;
		res[2] = newMinZ;
		res[3] = newMaxX;
		res[4] = newMaxY;
		res[5] = newMaxZ;
		
		return res;
	}
	
	public static float[] scaleFromMinAssign(@ExtractionParam float[] aabb, float[] scale)
	{
		float aabbMinX = aabb[0];
		float aabbMinY = aabb[1];
		float aabbMinZ = aabb[2];
		float aabbMaxX = aabb[3];
		float aabbMaxY = aabb[4];
		float aabbMaxZ = aabb[5];
		
		float scaleX = scale[0];
		float scaleY = scale[1];
		float scaleZ = scale[2];
		
		float scaledMaxX = MathUtils.fma(scaleX, aabbMaxX - aabbMinX, aabbMinX);
		float scaledMaxY = MathUtils.fma(scaleY, aabbMaxY - aabbMinY, aabbMinY);
		float scaledMaxZ = MathUtils.fma(scaleZ, aabbMaxZ - aabbMinZ, aabbMinZ);
		
		float newMinX = MathUtils.min(aabbMinX, scaledMaxX);
		float newMinY = MathUtils.min(aabbMinY, scaledMaxY);
		float newMinZ = MathUtils.min(aabbMinZ, scaledMaxZ);
		float newMaxX = MathUtils.max(aabbMinX, scaledMaxX);
		float newMaxY = MathUtils.max(aabbMinY, scaledMaxY);
		float newMaxZ = MathUtils.max(aabbMinZ, scaledMaxZ);
		
		aabb[0] = newMinX;
		aabb[1] = newMinY;
		aabb[2] = newMinZ;
		aabb[3] = newMaxX;
		aabb[4] = newMaxY;
		aabb[5] = newMaxZ;
		
		return aabb;
	}
	
	public static float[] scaleFromMinAssign(@ExtractionParam float[] aabb, float scaleX, float scaleY, float scaleZ)
	{
		float aabbMinX = aabb[0];
		float aabbMinY = aabb[1];
		float aabbMinZ = aabb[2];
		float aabbMaxX = aabb[3];
		float aabbMaxY = aabb[4];
		float aabbMaxZ = aabb[5];
		
		float scaledMaxX = MathUtils.fma(scaleX, aabbMaxX - aabbMinX, aabbMinX);
		float scaledMaxY = MathUtils.fma(scaleY, aabbMaxY - aabbMinY, aabbMinY);
		float scaledMaxZ = MathUtils.fma(scaleZ, aabbMaxZ - aabbMinZ, aabbMinZ);
		
		float newMinX = MathUtils.min(aabbMinX, scaledMaxX);
		float newMinY = MathUtils.min(aabbMinY, scaledMaxY);
		float newMinZ = MathUtils.min(aabbMinZ, scaledMaxZ);
		float newMaxX = MathUtils.max(aabbMinX, scaledMaxX);
		float newMaxY = MathUtils.max(aabbMinY, scaledMaxY);
		float newMaxZ = MathUtils.max(aabbMinZ, scaledMaxZ);
		
		aabb[0] = newMinX;
		aabb[1] = newMinY;
		aabb[2] = newMinZ;
		aabb[3] = newMaxX;
		aabb[4] = newMaxY;
		aabb[5] = newMaxZ;
		
		return aabb;
	}
	
	public static float[] scaleFromMax(float[] aabb, float[] scale, @ExtractionParam float[] res)
	{
		float aabbMinX = aabb[0];
		float aabbMinY = aabb[0];
		float aabbMinZ = aabb[0];
		float aabbMaxX = aabb[0];
		float aabbMaxY = aabb[0];
		float aabbMaxZ = aabb[0];
		
		float scaleX = scale[0];
		float scaleY = scale[1];
		float scaleZ = scale[2];
		
		float scaledMinX = MathUtils.fma(scaleX, -aabbMaxX + aabbMinX, aabbMaxX);
		float scaledMinY = MathUtils.fma(scaleY, -aabbMaxY + aabbMinY, aabbMaxY);
		float scaledMinZ = MathUtils.fma(scaleZ, -aabbMaxZ + aabbMinZ, aabbMaxZ);
		
		float newMinX = MathUtils.min(scaledMinX, aabbMaxX);
		float newMinY = MathUtils.min(scaledMinY, aabbMaxY);
		float newMinZ = MathUtils.min(scaledMinZ, aabbMaxZ);
		float newMaxX = MathUtils.max(scaledMinX, aabbMaxX);
		float newMaxY = MathUtils.max(scaledMinY, aabbMaxY);
		float newMaxZ = MathUtils.max(scaledMinZ, aabbMaxZ);
		
		res[0] = newMinX;
		res[1] = newMinY;
		res[2] = newMinZ;
		res[3] = newMaxX;
		res[4] = newMaxY;
		res[5] = newMaxZ;
		
		return res;
	}
	
	public static float[] scaleFromMax(float[] aabb, float scaleX, float scaleY, float scaleZ, @ExtractionParam float[] res)
	{
		float aabbMinX = aabb[0];
		float aabbMinY = aabb[0];
		float aabbMinZ = aabb[0];
		float aabbMaxX = aabb[0];
		float aabbMaxY = aabb[0];
		float aabbMaxZ = aabb[0];
		
		float scaledMinX = MathUtils.fma(scaleX, -aabbMaxX + aabbMinX, aabbMaxX);
		float scaledMinY = MathUtils.fma(scaleY, -aabbMaxY + aabbMinY, aabbMaxY);
		float scaledMinZ = MathUtils.fma(scaleZ, -aabbMaxZ + aabbMinZ, aabbMaxZ);
		
		float newMinX = MathUtils.min(scaledMinX, aabbMaxX);
		float newMinY = MathUtils.min(scaledMinY, aabbMaxY);
		float newMinZ = MathUtils.min(scaledMinZ, aabbMaxZ);
		float newMaxX = MathUtils.max(scaledMinX, aabbMaxX);
		float newMaxY = MathUtils.max(scaledMinY, aabbMaxY);
		float newMaxZ = MathUtils.max(scaledMinZ, aabbMaxZ);
		
		res[0] = newMinX;
		res[1] = newMinY;
		res[2] = newMinZ;
		res[3] = newMaxX;
		res[4] = newMaxY;
		res[5] = newMaxZ;
		
		return res;
	}
	
	public static float[] scaleFromMax(float[] aabbMin, float[] aabbMax, float[] scale, @ExtractionParam float[] res)
	{
		float aabbMinX = aabbMin[0];
		float aabbMinY = aabbMin[1];
		float aabbMinZ = aabbMin[2];
		float aabbMaxX = aabbMax[0];
		float aabbMaxY = aabbMax[1];
		float aabbMaxZ = aabbMax[2];
		
		float scaleX = scale[0];
		float scaleY = scale[1];
		float scaleZ = scale[2];
		
		float scaledMinX = MathUtils.fma(scaleX, -aabbMaxX + aabbMinX, aabbMaxX);
		float scaledMinY = MathUtils.fma(scaleY, -aabbMaxY + aabbMinY, aabbMaxY);
		float scaledMinZ = MathUtils.fma(scaleZ, -aabbMaxZ + aabbMinZ, aabbMaxZ);
		
		float newMinX = MathUtils.min(scaledMinX, aabbMaxX);
		float newMinY = MathUtils.min(scaledMinY, aabbMaxY);
		float newMinZ = MathUtils.min(scaledMinZ, aabbMaxZ);
		float newMaxX = MathUtils.max(scaledMinX, aabbMaxX);
		float newMaxY = MathUtils.max(scaledMinY, aabbMaxY);
		float newMaxZ = MathUtils.max(scaledMinZ, aabbMaxZ);
		
		res[0] = newMinX;
		res[1] = newMinY;
		res[2] = newMinZ;
		res[3] = newMaxX;
		res[4] = newMaxY;
		res[5] = newMaxZ;
		
		return res;
	}
	
	public static float[] scaleFromMax(float[] aabbMin, float[] aabbMax, float scaleX, float scaleY, float scaleZ, @ExtractionParam float[] res)
	{
		float aabbMinX = aabbMin[0];
		float aabbMinY = aabbMin[1];
		float aabbMinZ = aabbMin[2];
		float aabbMaxX = aabbMax[0];
		float aabbMaxY = aabbMax[1];
		float aabbMaxZ = aabbMax[2];
		
		float scaledMinX = MathUtils.fma(scaleX, -aabbMaxX + aabbMinX, aabbMaxX);
		float scaledMinY = MathUtils.fma(scaleY, -aabbMaxY + aabbMinY, aabbMaxY);
		float scaledMinZ = MathUtils.fma(scaleZ, -aabbMaxZ + aabbMinZ, aabbMaxZ);
		
		float newMinX = MathUtils.min(scaledMinX, aabbMaxX);
		float newMinY = MathUtils.min(scaledMinY, aabbMaxY);
		float newMinZ = MathUtils.min(scaledMinZ, aabbMaxZ);
		float newMaxX = MathUtils.max(scaledMinX, aabbMaxX);
		float newMaxY = MathUtils.max(scaledMinY, aabbMaxY);
		float newMaxZ = MathUtils.max(scaledMinZ, aabbMaxZ);
		
		res[0] = newMinX;
		res[1] = newMinY;
		res[2] = newMinZ;
		res[3] = newMaxX;
		res[4] = newMaxY;
		res[5] = newMaxZ;
		
		return res;
	}
	
	public static float[] scaleFromMax(float[] aabbMin, float aabbMaxX, float aabbMaxY, float aabbMaxZ, float[] scale, @ExtractionParam float[] res)
	{
		float aabbMinX = aabbMin[0];
		float aabbMinY = aabbMin[1];
		float aabbMinZ = aabbMin[2];
		
		float scaleX = scale[0];
		float scaleY = scale[1];
		float scaleZ = scale[2];
		
		float scaledMinX = MathUtils.fma(scaleX, -aabbMaxX + aabbMinX, aabbMaxX);
		float scaledMinY = MathUtils.fma(scaleY, -aabbMaxY + aabbMinY, aabbMaxY);
		float scaledMinZ = MathUtils.fma(scaleZ, -aabbMaxZ + aabbMinZ, aabbMaxZ);
		
		float newMinX = MathUtils.min(scaledMinX, aabbMaxX);
		float newMinY = MathUtils.min(scaledMinY, aabbMaxY);
		float newMinZ = MathUtils.min(scaledMinZ, aabbMaxZ);
		float newMaxX = MathUtils.max(scaledMinX, aabbMaxX);
		float newMaxY = MathUtils.max(scaledMinY, aabbMaxY);
		float newMaxZ = MathUtils.max(scaledMinZ, aabbMaxZ);
		
		res[0] = newMinX;
		res[1] = newMinY;
		res[2] = newMinZ;
		res[3] = newMaxX;
		res[4] = newMaxY;
		res[5] = newMaxZ;
		
		return res;
	}
	
	public static float[] scaleFromMax(float[] aabbMin, float aabbMaxX, float aabbMaxY, float aabbMaxZ, float scaleX, float scaleY, float scaleZ, @ExtractionParam float[] res)
	{
		float aabbMinX = aabbMin[0];
		float aabbMinY = aabbMin[1];
		float aabbMinZ = aabbMin[2];
		
		float scaledMinX = MathUtils.fma(scaleX, -aabbMaxX + aabbMinX, aabbMaxX);
		float scaledMinY = MathUtils.fma(scaleY, -aabbMaxY + aabbMinY, aabbMaxY);
		float scaledMinZ = MathUtils.fma(scaleZ, -aabbMaxZ + aabbMinZ, aabbMaxZ);
		
		float newMinX = MathUtils.min(scaledMinX, aabbMaxX);
		float newMinY = MathUtils.min(scaledMinY, aabbMaxY);
		float newMinZ = MathUtils.min(scaledMinZ, aabbMaxZ);
		float newMaxX = MathUtils.max(scaledMinX, aabbMaxX);
		float newMaxY = MathUtils.max(scaledMinY, aabbMaxY);
		float newMaxZ = MathUtils.max(scaledMinZ, aabbMaxZ);
		
		res[0] = newMinX;
		res[1] = newMinY;
		res[2] = newMinZ;
		res[3] = newMaxX;
		res[4] = newMaxY;
		res[5] = newMaxZ;
		
		return res;
	}
	
	public static float[] scaleFromMax(float aabbMinX, float aabbMinY, float aabbMinZ, float[] aabbMax, float[] scale, @ExtractionParam float[] res)
	{
		float aabbMaxX = aabbMax[0];
		float aabbMaxY = aabbMax[1];
		float aabbMaxZ = aabbMax[2];
		
		float scaleX = scale[0];
		float scaleY = scale[1];
		float scaleZ = scale[2];
		
		float scaledMinX = MathUtils.fma(scaleX, -aabbMaxX + aabbMinX, aabbMaxX);
		float scaledMinY = MathUtils.fma(scaleY, -aabbMaxY + aabbMinY, aabbMaxY);
		float scaledMinZ = MathUtils.fma(scaleZ, -aabbMaxZ + aabbMinZ, aabbMaxZ);
		
		float newMinX = MathUtils.min(scaledMinX, aabbMaxX);
		float newMinY = MathUtils.min(scaledMinY, aabbMaxY);
		float newMinZ = MathUtils.min(scaledMinZ, aabbMaxZ);
		float newMaxX = MathUtils.max(scaledMinX, aabbMaxX);
		float newMaxY = MathUtils.max(scaledMinY, aabbMaxY);
		float newMaxZ = MathUtils.max(scaledMinZ, aabbMaxZ);
		
		res[0] = newMinX;
		res[1] = newMinY;
		res[2] = newMinZ;
		res[3] = newMaxX;
		res[4] = newMaxY;
		res[5] = newMaxZ;
		
		return res;
	}
	
	public static float[] scaleFromMax(float aabbMinX, float aabbMinY, float aabbMinZ, float[] aabbMax, float scaleX, float scaleY, float scaleZ, @ExtractionParam float[] res)
	{
		float aabbMaxX = aabbMax[0];
		float aabbMaxY = aabbMax[1];
		float aabbMaxZ = aabbMax[2];
		
		float scaledMinX = MathUtils.fma(scaleX, -aabbMaxX + aabbMinX, aabbMaxX);
		float scaledMinY = MathUtils.fma(scaleY, -aabbMaxY + aabbMinY, aabbMaxY);
		float scaledMinZ = MathUtils.fma(scaleZ, -aabbMaxZ + aabbMinZ, aabbMaxZ);
		
		float newMinX = MathUtils.min(scaledMinX, aabbMaxX);
		float newMinY = MathUtils.min(scaledMinY, aabbMaxY);
		float newMinZ = MathUtils.min(scaledMinZ, aabbMaxZ);
		float newMaxX = MathUtils.max(scaledMinX, aabbMaxX);
		float newMaxY = MathUtils.max(scaledMinY, aabbMaxY);
		float newMaxZ = MathUtils.max(scaledMinZ, aabbMaxZ);
		
		res[0] = newMinX;
		res[1] = newMinY;
		res[2] = newMinZ;
		res[3] = newMaxX;
		res[4] = newMaxY;
		res[5] = newMaxZ;
		
		return res;
	}
	
	public static float[] scaleFromMax(float aabbMinX, float aabbMinY, float aabbMinZ, float aabbMaxX, float aabbMaxY, float aabbMaxZ, float[] scale, @ExtractionParam float[] res)
	{
		float scaleX = scale[0];
		float scaleY = scale[1];
		float scaleZ = scale[2];
		
		float scaledMinX = MathUtils.fma(scaleX, -aabbMaxX + aabbMinX, aabbMaxX);
		float scaledMinY = MathUtils.fma(scaleY, -aabbMaxY + aabbMinY, aabbMaxY);
		float scaledMinZ = MathUtils.fma(scaleZ, -aabbMaxZ + aabbMinZ, aabbMaxZ);
		
		float newMinX = MathUtils.min(scaledMinX, aabbMaxX);
		float newMinY = MathUtils.min(scaledMinY, aabbMaxY);
		float newMinZ = MathUtils.min(scaledMinZ, aabbMaxZ);
		float newMaxX = MathUtils.max(scaledMinX, aabbMaxX);
		float newMaxY = MathUtils.max(scaledMinY, aabbMaxY);
		float newMaxZ = MathUtils.max(scaledMinZ, aabbMaxZ);
		
		res[0] = newMinX;
		res[1] = newMinY;
		res[2] = newMinZ;
		res[3] = newMaxX;
		res[4] = newMaxY;
		res[5] = newMaxZ;
		
		return res;
	}
	
	public static float[] scaleFromMax(float aabbMinX, float aabbMinY, float aabbMinZ, float aabbMaxX, float aabbMaxY, float aabbMaxZ, float scaleX, float scaleY, float scaleZ, @ExtractionParam float[] res)
	{
		float scaledMinX = MathUtils.fma(scaleX, -aabbMaxX + aabbMinX, aabbMaxX);
		float scaledMinY = MathUtils.fma(scaleY, -aabbMaxY + aabbMinY, aabbMaxY);
		float scaledMinZ = MathUtils.fma(scaleZ, -aabbMaxZ + aabbMinZ, aabbMaxZ);
		
		float newMinX = MathUtils.min(scaledMinX, aabbMaxX);
		float newMinY = MathUtils.min(scaledMinY, aabbMaxY);
		float newMinZ = MathUtils.min(scaledMinZ, aabbMaxZ);
		float newMaxX = MathUtils.max(scaledMinX, aabbMaxX);
		float newMaxY = MathUtils.max(scaledMinY, aabbMaxY);
		float newMaxZ = MathUtils.max(scaledMinZ, aabbMaxZ);
		
		res[0] = newMinX;
		res[1] = newMinY;
		res[2] = newMinZ;
		res[3] = newMaxX;
		res[4] = newMaxY;
		res[5] = newMaxZ;
		
		return res;
	}
	
	public static float[] scaleFromMaxAssign(@ExtractionParam float[] aabb, float[] scale)
	{
		float aabbMinX = aabb[0];
		float aabbMinY = aabb[0];
		float aabbMinZ = aabb[0];
		float aabbMaxX = aabb[0];
		float aabbMaxY = aabb[0];
		float aabbMaxZ = aabb[0];
		
		float scaleX = scale[0];
		float scaleY = scale[1];
		float scaleZ = scale[2];
		
		float scaledMinX = MathUtils.fma(scaleX, -aabbMaxX + aabbMinX, aabbMaxX);
		float scaledMinY = MathUtils.fma(scaleY, -aabbMaxY + aabbMinY, aabbMaxY);
		float scaledMinZ = MathUtils.fma(scaleZ, -aabbMaxZ + aabbMinZ, aabbMaxZ);
		
		float newMinX = MathUtils.min(scaledMinX, aabbMaxX);
		float newMinY = MathUtils.min(scaledMinY, aabbMaxY);
		float newMinZ = MathUtils.min(scaledMinZ, aabbMaxZ);
		float newMaxX = MathUtils.max(scaledMinX, aabbMaxX);
		float newMaxY = MathUtils.max(scaledMinY, aabbMaxY);
		float newMaxZ = MathUtils.max(scaledMinZ, aabbMaxZ);
		
		aabb[0] = newMinX;
		aabb[1] = newMinY;
		aabb[2] = newMinZ;
		aabb[3] = newMaxX;
		aabb[4] = newMaxY;
		aabb[5] = newMaxZ;
		
		return aabb;
	}
	
	public static float[] scaleFromMaxAssign(@ExtractionParam float[] aabb, float scaleX, float scaleY, float scaleZ)
	{
		float aabbMinX = aabb[0];
		float aabbMinY = aabb[0];
		float aabbMinZ = aabb[0];
		float aabbMaxX = aabb[0];
		float aabbMaxY = aabb[0];
		float aabbMaxZ = aabb[0];
		
		float scaledMinX = MathUtils.fma(scaleX, -aabbMaxX + aabbMinX, aabbMaxX);
		float scaledMinY = MathUtils.fma(scaleY, -aabbMaxY + aabbMinY, aabbMaxY);
		float scaledMinZ = MathUtils.fma(scaleZ, -aabbMaxZ + aabbMinZ, aabbMaxZ);
		
		float newMinX = MathUtils.min(scaledMinX, aabbMaxX);
		float newMinY = MathUtils.min(scaledMinY, aabbMaxY);
		float newMinZ = MathUtils.min(scaledMinZ, aabbMaxZ);
		float newMaxX = MathUtils.max(scaledMinX, aabbMaxX);
		float newMaxY = MathUtils.max(scaledMinY, aabbMaxY);
		float newMaxZ = MathUtils.max(scaledMinZ, aabbMaxZ);
		
		aabb[0] = newMinX;
		aabb[1] = newMinY;
		aabb[2] = newMinZ;
		aabb[3] = newMaxX;
		aabb[4] = newMaxY;
		aabb[5] = newMaxZ;
		
		return aabb;
	}
	
	public static float[] translate(float[] aabb, float[] t, @ExtractionParam float[] res)
	{
		float aabbMinX = aabb[0];
		float aabbMinY = aabb[1];
		float aabbMinZ = aabb[2];
		float aabbMaxX = aabb[3];
		float aabbMaxY = aabb[4];
		float aabbMaxZ = aabb[5];
		
		float tX = t[0];
		float tY = t[1];
		float tZ = t[2];
		
		float newMinX = aabbMinX + tX;
		float newMinY = aabbMinY + tY;
		float newMinZ = aabbMinZ + tZ;
		float newMaxX = aabbMaxX + tX;
		float newMaxY = aabbMaxY + tY;
		float newMaxZ = aabbMaxZ + tZ;
		
		res[0] = newMinX;
		res[1] = newMinY;
		res[2] = newMinZ;
		res[3] = newMaxX;
		res[4] = newMaxY;
		res[5] = newMaxZ;
		
		return res;
	}
	
	public static float[] translate(float[] aabb, float tX, float tY, float tZ, @ExtractionParam float[] res)
	{
		float aabbMinX = aabb[0];
		float aabbMinY = aabb[1];
		float aabbMinZ = aabb[2];
		float aabbMaxX = aabb[3];
		float aabbMaxY = aabb[4];
		float aabbMaxZ = aabb[5];
		
		float newMinX = aabbMinX + tX;
		float newMinY = aabbMinY + tY;
		float newMinZ = aabbMinZ + tZ;
		float newMaxX = aabbMaxX + tX;
		float newMaxY = aabbMaxY + tY;
		float newMaxZ = aabbMaxZ + tZ;
		
		res[0] = newMinX;
		res[1] = newMinY;
		res[2] = newMinZ;
		res[3] = newMaxX;
		res[4] = newMaxY;
		res[5] = newMaxZ;
		
		return res;
	}
	
	public static float[] translate(float[] aabbMin, float[] aabbMax, float[] t, @ExtractionParam float[] res)
	{
		float aabbMinX = aabbMin[0];
		float aabbMinY = aabbMin[1];
		float aabbMinZ = aabbMin[2];
		float aabbMaxX = aabbMax[0];
		float aabbMaxY = aabbMax[1];
		float aabbMaxZ = aabbMax[2];
		
		float tX = t[0];
		float tY = t[1];
		float tZ = t[2];
		
		float newMinX = aabbMinX + tX;
		float newMinY = aabbMinY + tY;
		float newMinZ = aabbMinZ + tZ;
		float newMaxX = aabbMaxX + tX;
		float newMaxY = aabbMaxY + tY;
		float newMaxZ = aabbMaxZ + tZ;
		
		res[0] = newMinX;
		res[1] = newMinY;
		res[2] = newMinZ;
		res[3] = newMaxX;
		res[4] = newMaxY;
		res[5] = newMaxZ;
		
		return res;
	}
	
	public static float[] translate(float[] aabbMin, float[] aabbMax, float tX, float tY, float tZ, @ExtractionParam float[] res)
	{
		float aabbMinX = aabbMin[0];
		float aabbMinY = aabbMin[1];
		float aabbMinZ = aabbMin[2];
		float aabbMaxX = aabbMax[0];
		float aabbMaxY = aabbMax[1];
		float aabbMaxZ = aabbMax[2];
		
		float newMinX = aabbMinX + tX;
		float newMinY = aabbMinY + tY;
		float newMinZ = aabbMinZ + tZ;
		float newMaxX = aabbMaxX + tX;
		float newMaxY = aabbMaxY + tY;
		float newMaxZ = aabbMaxZ + tZ;
		
		res[0] = newMinX;
		res[1] = newMinY;
		res[2] = newMinZ;
		res[3] = newMaxX;
		res[4] = newMaxY;
		res[5] = newMaxZ;
		
		return res;
	}
	
	public static float[] translate(float[] aabbMin, float aabbMaxX, float aabbMaxY, float aabbMaxZ, float[] t, @ExtractionParam float[] res)
	{
		float aabbMinX = aabbMin[0];
		float aabbMinY = aabbMin[1];
		float aabbMinZ = aabbMin[2];
		
		float tX = t[0];
		float tY = t[1];
		float tZ = t[2];
		
		float newMinX = aabbMinX + tX;
		float newMinY = aabbMinY + tY;
		float newMinZ = aabbMinZ + tZ;
		float newMaxX = aabbMaxX + tX;
		float newMaxY = aabbMaxY + tY;
		float newMaxZ = aabbMaxZ + tZ;
		
		res[0] = newMinX;
		res[1] = newMinY;
		res[2] = newMinZ;
		res[3] = newMaxX;
		res[4] = newMaxY;
		res[5] = newMaxZ;
		
		return res;
	}
	
	public static float[] translate(float[] aabbMin, float aabbMaxX, float aabbMaxY, float aabbMaxZ, float tX, float tY, float tZ, @ExtractionParam float[] res)
	{
		float aabbMinX = aabbMin[0];
		float aabbMinY = aabbMin[1];
		float aabbMinZ = aabbMin[2];
		
		float newMinX = aabbMinX + tX;
		float newMinY = aabbMinY + tY;
		float newMinZ = aabbMinZ + tZ;
		float newMaxX = aabbMaxX + tX;
		float newMaxY = aabbMaxY + tY;
		float newMaxZ = aabbMaxZ + tZ;
		
		res[0] = newMinX;
		res[1] = newMinY;
		res[2] = newMinZ;
		res[3] = newMaxX;
		res[4] = newMaxY;
		res[5] = newMaxZ;
		
		return res;
	}
	
	public static float[] translate(float aabbMinX, float aabbMinY, float aabbMinZ, float[] aabbMax, float[] t, @ExtractionParam float[] res)
	{
		float aabbMaxX = aabbMax[0];
		float aabbMaxY = aabbMax[1];
		float aabbMaxZ = aabbMax[2];
		
		float tX = t[0];
		float tY = t[1];
		float tZ = t[2];
		
		float newMinX = aabbMinX + tX;
		float newMinY = aabbMinY + tY;
		float newMinZ = aabbMinZ + tZ;
		float newMaxX = aabbMaxX + tX;
		float newMaxY = aabbMaxY + tY;
		float newMaxZ = aabbMaxZ + tZ;
		
		res[0] = newMinX;
		res[1] = newMinY;
		res[2] = newMinZ;
		res[3] = newMaxX;
		res[4] = newMaxY;
		res[5] = newMaxZ;
		
		return res;
	}
	
	public static float[] translate(float aabbMinX, float aabbMinY, float aabbMinZ, float[] aabbMax, float tX, float tY, float tZ, @ExtractionParam float[] res)
	{
		float aabbMaxX = aabbMax[0];
		float aabbMaxY = aabbMax[1];
		float aabbMaxZ = aabbMax[2];
		
		float newMinX = aabbMinX + tX;
		float newMinY = aabbMinY + tY;
		float newMinZ = aabbMinZ + tZ;
		float newMaxX = aabbMaxX + tX;
		float newMaxY = aabbMaxY + tY;
		float newMaxZ = aabbMaxZ + tZ;
		
		res[0] = newMinX;
		res[1] = newMinY;
		res[2] = newMinZ;
		res[3] = newMaxX;
		res[4] = newMaxY;
		res[5] = newMaxZ;
		
		return res;
	}
	
	public static float[] translate(float aabbMinX, float aabbMinY, float aabbMinZ, float aabbMaxX, float aabbMaxY, float aabbMaxZ, float[] t, @ExtractionParam float[] res)
	{
		float tX = t[0];
		float tY = t[1];
		float tZ = t[2];
		
		float newMinX = aabbMinX + tX;
		float newMinY = aabbMinY + tY;
		float newMinZ = aabbMinZ + tZ;
		float newMaxX = aabbMaxX + tX;
		float newMaxY = aabbMaxY + tY;
		float newMaxZ = aabbMaxZ + tZ;
		
		res[0] = newMinX;
		res[1] = newMinY;
		res[2] = newMinZ;
		res[3] = newMaxX;
		res[4] = newMaxY;
		res[5] = newMaxZ;
		
		return res;
	}
	
	public static float[] translate(float aabbMinX, float aabbMinY, float aabbMinZ, float aabbMaxX, float aabbMaxY, float aabbMaxZ, float tX, float tY, float tZ, @ExtractionParam float[] res)
	{
		float newMinX = aabbMinX + tX;
		float newMinY = aabbMinY + tY;
		float newMinZ = aabbMinZ + tZ;
		float newMaxX = aabbMaxX + tX;
		float newMaxY = aabbMaxY + tY;
		float newMaxZ = aabbMaxZ + tZ;
		
		res[0] = newMinX;
		res[1] = newMinY;
		res[2] = newMinZ;
		res[3] = newMaxX;
		res[4] = newMaxY;
		res[5] = newMaxZ;
		
		return res;
	}
	
	public static float[] translateAssign(@ExtractionParam float[] aabb, float[] t)
	{
		float aabbMinX = aabb[0];
		float aabbMinY = aabb[1];
		float aabbMinZ = aabb[2];
		float aabbMaxX = aabb[3];
		float aabbMaxY = aabb[4];
		float aabbMaxZ = aabb[5];
		
		float tX = t[0];
		float tY = t[1];
		float tZ = t[2];
		
		float newMinX = aabbMinX + tX;
		float newMinY = aabbMinY + tY;
		float newMinZ = aabbMinZ + tZ;
		float newMaxX = aabbMaxX + tX;
		float newMaxY = aabbMaxY + tY;
		float newMaxZ = aabbMaxZ + tZ;
		
		aabb[0] = newMinX;
		aabb[1] = newMinY;
		aabb[2] = newMinZ;
		aabb[3] = newMaxX;
		aabb[4] = newMaxY;
		aabb[5] = newMaxZ;
		
		return aabb;
	}
	
	public static float[] translateAssign(@ExtractionParam float[] aabb, float tX, float tY, float tZ)
	{
		float aabbMinX = aabb[0];
		float aabbMinY = aabb[1];
		float aabbMinZ = aabb[2];
		float aabbMaxX = aabb[3];
		float aabbMaxY = aabb[4];
		float aabbMaxZ = aabb[5];
		
		float newMinX = aabbMinX + tX;
		float newMinY = aabbMinY + tY;
		float newMinZ = aabbMinZ + tZ;
		float newMaxX = aabbMaxX + tX;
		float newMaxY = aabbMaxY + tY;
		float newMaxZ = aabbMaxZ + tZ;
		
		aabb[0] = newMinX;
		aabb[1] = newMinY;
		aabb[2] = newMinZ;
		aabb[3] = newMaxX;
		aabb[4] = newMaxY;
		aabb[5] = newMaxZ;
		
		return aabb;
	}
	
	public static float[] translateMin(float[] aabb, float[] t, @ExtractionParam float[] res)
	{
		float aabbMinX = aabb[0];
		float aabbMinY = aabb[1];
		float aabbMinZ = aabb[2];
		float aabbMaxX = aabb[3];
		float aabbMaxY = aabb[4];
		float aabbMaxZ = aabb[5];
		
		float tX = t[0];
		float tY = t[1];
		float tZ = t[2];
		
		float translatedMinX = aabbMinX + tX;
		float translatedMinY = aabbMinY + tY;
		float translatedMinZ = aabbMinZ + tZ;
		
		float newMinX = MathUtils.min(translatedMinX, aabbMaxX);
		float newMinY = MathUtils.min(translatedMinY, aabbMaxY);
		float newMinZ = MathUtils.min(translatedMinZ, aabbMaxZ);
		float newMaxX = MathUtils.min(translatedMinX, aabbMaxX);
		float newMaxY = MathUtils.min(translatedMinY, aabbMaxY);
		float newMaxZ = MathUtils.min(translatedMinZ, aabbMaxZ);
		
		res[0] = newMinX;
		res[1] = newMinY;
		res[2] = newMinZ;
		res[3] = newMaxX;
		res[4] = newMaxY;
		res[5] = newMaxZ;
		
		return res;
	}
	
	public static float[] translateMin(float[] aabb, float tX, float tY, float tZ, @ExtractionParam float[] res)
	{
		float aabbMinX = aabb[0];
		float aabbMinY = aabb[1];
		float aabbMinZ = aabb[2];
		float aabbMaxX = aabb[3];
		float aabbMaxY = aabb[4];
		float aabbMaxZ = aabb[5];
		
		float translatedMinX = aabbMinX + tX;
		float translatedMinY = aabbMinY + tY;
		float translatedMinZ = aabbMinZ + tZ;
		
		float newMinX = MathUtils.min(translatedMinX, aabbMaxX);
		float newMinY = MathUtils.min(translatedMinY, aabbMaxY);
		float newMinZ = MathUtils.min(translatedMinZ, aabbMaxZ);
		float newMaxX = MathUtils.min(translatedMinX, aabbMaxX);
		float newMaxY = MathUtils.min(translatedMinY, aabbMaxY);
		float newMaxZ = MathUtils.min(translatedMinZ, aabbMaxZ);
		
		res[0] = newMinX;
		res[1] = newMinY;
		res[2] = newMinZ;
		res[3] = newMaxX;
		res[4] = newMaxY;
		res[5] = newMaxZ;
		
		return res;
	}
	
	public static float[] translateMin(float[] aabbMin, float[] aabbMax, float[] t, @ExtractionParam float[] res)
	{
		float aabbMinX = aabbMin[0];
		float aabbMinY = aabbMin[1];
		float aabbMinZ = aabbMin[2];
		float aabbMaxX = aabbMax[0];
		float aabbMaxY = aabbMax[1];
		float aabbMaxZ = aabbMax[2];
		
		float tX = t[0];
		float tY = t[1];
		float tZ = t[2];
		
		float translatedMinX = aabbMinX + tX;
		float translatedMinY = aabbMinY + tY;
		float translatedMinZ = aabbMinZ + tZ;
		
		float newMinX = MathUtils.min(translatedMinX, aabbMaxX);
		float newMinY = MathUtils.min(translatedMinY, aabbMaxY);
		float newMinZ = MathUtils.min(translatedMinZ, aabbMaxZ);
		float newMaxX = MathUtils.min(translatedMinX, aabbMaxX);
		float newMaxY = MathUtils.min(translatedMinY, aabbMaxY);
		float newMaxZ = MathUtils.min(translatedMinZ, aabbMaxZ);
		
		res[0] = newMinX;
		res[1] = newMinY;
		res[2] = newMinZ;
		res[3] = newMaxX;
		res[4] = newMaxY;
		res[5] = newMaxZ;
		
		return res;
	}
	
	public static float[] translateMin(float[] aabbMin, float[] aabbMax, float tX, float tY, float tZ, @ExtractionParam float[] res)
	{
		float aabbMinX = aabbMin[0];
		float aabbMinY = aabbMin[1];
		float aabbMinZ = aabbMin[2];
		float aabbMaxX = aabbMax[0];
		float aabbMaxY = aabbMax[1];
		float aabbMaxZ = aabbMax[2];
		
		float translatedMinX = aabbMinX + tX;
		float translatedMinY = aabbMinY + tY;
		float translatedMinZ = aabbMinZ + tZ;
		
		float newMinX = MathUtils.min(translatedMinX, aabbMaxX);
		float newMinY = MathUtils.min(translatedMinY, aabbMaxY);
		float newMinZ = MathUtils.min(translatedMinZ, aabbMaxZ);
		float newMaxX = MathUtils.min(translatedMinX, aabbMaxX);
		float newMaxY = MathUtils.min(translatedMinY, aabbMaxY);
		float newMaxZ = MathUtils.min(translatedMinZ, aabbMaxZ);
		
		res[0] = newMinX;
		res[1] = newMinY;
		res[2] = newMinZ;
		res[3] = newMaxX;
		res[4] = newMaxY;
		res[5] = newMaxZ;
		
		return res;
	}
	
	public static float[] translateMin(float[] aabbMin, float aabbMaxX, float aabbMaxY, float aabbMaxZ, float[] t, @ExtractionParam float[] res)
	{
		float aabbMinX = aabbMin[0];
		float aabbMinY = aabbMin[1];
		float aabbMinZ = aabbMin[2];
		
		float tX = t[0];
		float tY = t[1];
		float tZ = t[2];
		
		float translatedMinX = aabbMinX + tX;
		float translatedMinY = aabbMinY + tY;
		float translatedMinZ = aabbMinZ + tZ;
		
		float newMinX = MathUtils.min(translatedMinX, aabbMaxX);
		float newMinY = MathUtils.min(translatedMinY, aabbMaxY);
		float newMinZ = MathUtils.min(translatedMinZ, aabbMaxZ);
		float newMaxX = MathUtils.min(translatedMinX, aabbMaxX);
		float newMaxY = MathUtils.min(translatedMinY, aabbMaxY);
		float newMaxZ = MathUtils.min(translatedMinZ, aabbMaxZ);
		
		res[0] = newMinX;
		res[1] = newMinY;
		res[2] = newMinZ;
		res[3] = newMaxX;
		res[4] = newMaxY;
		res[5] = newMaxZ;
		
		return res;
	}
	
	public static float[] translateMin(float aabbMinX, float aabbMinY, float aabbMinZ, float[] aabbMax, float[] t, @ExtractionParam float[] res)
	{
		float aabbMaxX = aabbMax[0];
		float aabbMaxY = aabbMax[1];
		float aabbMaxZ = aabbMax[2];
		
		float tX = t[0];
		float tY = t[1];
		float tZ = t[2];
		
		float translatedMinX = aabbMinX + tX;
		float translatedMinY = aabbMinY + tY;
		float translatedMinZ = aabbMinZ + tZ;
		
		float newMinX = MathUtils.min(translatedMinX, aabbMaxX);
		float newMinY = MathUtils.min(translatedMinY, aabbMaxY);
		float newMinZ = MathUtils.min(translatedMinZ, aabbMaxZ);
		float newMaxX = MathUtils.min(translatedMinX, aabbMaxX);
		float newMaxY = MathUtils.min(translatedMinY, aabbMaxY);
		float newMaxZ = MathUtils.min(translatedMinZ, aabbMaxZ);
		
		res[0] = newMinX;
		res[1] = newMinY;
		res[2] = newMinZ;
		res[3] = newMaxX;
		res[4] = newMaxY;
		res[5] = newMaxZ;
		
		return res;
	}
	
	public static float[] translateMin(float aabbMinX, float aabbMinY, float aabbMinZ, float[] aabbMax, float tX, float tY, float tZ, @ExtractionParam float[] res)
	{
		float aabbMaxX = aabbMax[0];
		float aabbMaxY = aabbMax[1];
		float aabbMaxZ = aabbMax[2];
		
		float translatedMinX = aabbMinX + tX;
		float translatedMinY = aabbMinY + tY;
		float translatedMinZ = aabbMinZ + tZ;
		
		float newMinX = MathUtils.min(translatedMinX, aabbMaxX);
		float newMinY = MathUtils.min(translatedMinY, aabbMaxY);
		float newMinZ = MathUtils.min(translatedMinZ, aabbMaxZ);
		float newMaxX = MathUtils.min(translatedMinX, aabbMaxX);
		float newMaxY = MathUtils.min(translatedMinY, aabbMaxY);
		float newMaxZ = MathUtils.min(translatedMinZ, aabbMaxZ);
		
		res[0] = newMinX;
		res[1] = newMinY;
		res[2] = newMinZ;
		res[3] = newMaxX;
		res[4] = newMaxY;
		res[5] = newMaxZ;
		
		return res;
	}
	
	public static float[] translateMin(float aabbMinX, float aabbMinY, float aabbMinZ, float aabbMaxX, float aabbMaxY, float aabbMaxZ, float[] t, @ExtractionParam float[] res)
	{
		float tX = t[0];
		float tY = t[1];
		float tZ = t[2];
		
		float translatedMinX = aabbMinX + tX;
		float translatedMinY = aabbMinY + tY;
		float translatedMinZ = aabbMinZ + tZ;
		
		float newMinX = MathUtils.min(translatedMinX, aabbMaxX);
		float newMinY = MathUtils.min(translatedMinY, aabbMaxY);
		float newMinZ = MathUtils.min(translatedMinZ, aabbMaxZ);
		float newMaxX = MathUtils.min(translatedMinX, aabbMaxX);
		float newMaxY = MathUtils.min(translatedMinY, aabbMaxY);
		float newMaxZ = MathUtils.min(translatedMinZ, aabbMaxZ);
		
		res[0] = newMinX;
		res[1] = newMinY;
		res[2] = newMinZ;
		res[3] = newMaxX;
		res[4] = newMaxY;
		res[5] = newMaxZ;
		
		return res;
	}
	
	public static float[] translateMin(float aabbMinX, float aabbMinY, float aabbMinZ, float aabbMaxX, float aabbMaxY, float aabbMaxZ, float tX, float tY, float tZ, @ExtractionParam float[] res)
	{
		float translatedMinX = aabbMinX + tX;
		float translatedMinY = aabbMinY + tY;
		float translatedMinZ = aabbMinZ + tZ;
		
		float newMinX = MathUtils.min(translatedMinX, aabbMaxX);
		float newMinY = MathUtils.min(translatedMinY, aabbMaxY);
		float newMinZ = MathUtils.min(translatedMinZ, aabbMaxZ);
		float newMaxX = MathUtils.min(translatedMinX, aabbMaxX);
		float newMaxY = MathUtils.min(translatedMinY, aabbMaxY);
		float newMaxZ = MathUtils.min(translatedMinZ, aabbMaxZ);
		
		res[0] = newMinX;
		res[1] = newMinY;
		res[2] = newMinZ;
		res[3] = newMaxX;
		res[4] = newMaxY;
		res[5] = newMaxZ;
		
		return res;
	}
	
	public static float[] translateMinAssign(@ExtractionParam float[] aabb, float[] t)
	{
		float aabbMinX = aabb[0];
		float aabbMinY = aabb[1];
		float aabbMinZ = aabb[2];
		float aabbMaxX = aabb[3];
		float aabbMaxY = aabb[4];
		float aabbMaxZ = aabb[5];
		
		float tX = t[0];
		float tY = t[1];
		float tZ = t[2];
		
		float translatedMinX = aabbMinX + tX;
		float translatedMinY = aabbMinY + tY;
		float translatedMinZ = aabbMinZ + tZ;
		
		float newMinX = MathUtils.min(translatedMinX, aabbMaxX);
		float newMinY = MathUtils.min(translatedMinY, aabbMaxY);
		float newMinZ = MathUtils.min(translatedMinZ, aabbMaxZ);
		float newMaxX = MathUtils.min(translatedMinX, aabbMaxX);
		float newMaxY = MathUtils.min(translatedMinY, aabbMaxY);
		float newMaxZ = MathUtils.min(translatedMinZ, aabbMaxZ);
		
		aabb[0] = newMinX;
		aabb[1] = newMinY;
		aabb[2] = newMinZ;
		aabb[3] = newMaxX;
		aabb[4] = newMaxY;
		aabb[5] = newMaxZ;
		
		return aabb;
	}
	
	public static float[] translateMinAssign(@ExtractionParam float[] aabb, float tX, float tY, float tZ)
	{
		float aabbMinX = aabb[0];
		float aabbMinY = aabb[1];
		float aabbMinZ = aabb[2];
		float aabbMaxX = aabb[3];
		float aabbMaxY = aabb[4];
		float aabbMaxZ = aabb[5];
		
		float translatedMinX = aabbMinX + tX;
		float translatedMinY = aabbMinY + tY;
		float translatedMinZ = aabbMinZ + tZ;
		
		float newMinX = MathUtils.min(translatedMinX, aabbMaxX);
		float newMinY = MathUtils.min(translatedMinY, aabbMaxY);
		float newMinZ = MathUtils.min(translatedMinZ, aabbMaxZ);
		float newMaxX = MathUtils.min(translatedMinX, aabbMaxX);
		float newMaxY = MathUtils.min(translatedMinY, aabbMaxY);
		float newMaxZ = MathUtils.min(translatedMinZ, aabbMaxZ);
		
		aabb[0] = newMinX;
		aabb[1] = newMinY;
		aabb[2] = newMinZ;
		aabb[3] = newMaxX;
		aabb[4] = newMaxY;
		aabb[5] = newMaxZ;
		
		return aabb;
	}
	
	public static float[] translateMax(float[] aabb, float[] t, @ExtractionParam float[] res)
	{
		float aabbMinX = aabb[0];
		float aabbMinY = aabb[1];
		float aabbMinZ = aabb[2];
		float aabbMaxX = aabb[3];
		float aabbMaxY = aabb[4];
		float aabbMaxZ = aabb[5];
		
		float tX = t[0];
		float tY = t[1];
		float tZ = t[2];
		
		float translatedMaxX = aabbMaxX + tX;
		float translatedMaxY = aabbMaxY + tY;
		float translatedMaxZ = aabbMaxZ + tZ;
		
		float newMinX = MathUtils.min(aabbMinX, translatedMaxX);
		float newMinY = MathUtils.min(aabbMinY, translatedMaxY);
		float newMinZ = MathUtils.min(aabbMinZ, translatedMaxZ);
		float newMaxX = MathUtils.min(aabbMinX, translatedMaxX);
		float newMaxY = MathUtils.min(aabbMinY, translatedMaxY);
		float newMaxZ = MathUtils.min(aabbMinZ, translatedMaxZ);
		
		res[0] = newMinX;
		res[1] = newMinY;
		res[2] = newMinZ;
		res[3] = newMaxX;
		res[4] = newMaxY;
		res[5] = newMaxZ;
		
		return res;
	}
	
	public static float[] translateMax(float[] aabb, float tX, float tY, float tZ, @ExtractionParam float[] res)
	{
		float aabbMinX = aabb[0];
		float aabbMinY = aabb[1];
		float aabbMinZ = aabb[2];
		float aabbMaxX = aabb[3];
		float aabbMaxY = aabb[4];
		float aabbMaxZ = aabb[5];
		
		float translatedMaxX = aabbMaxX + tX;
		float translatedMaxY = aabbMaxY + tY;
		float translatedMaxZ = aabbMaxZ + tZ;
		
		float newMinX = MathUtils.min(aabbMinX, translatedMaxX);
		float newMinY = MathUtils.min(aabbMinY, translatedMaxY);
		float newMinZ = MathUtils.min(aabbMinZ, translatedMaxZ);
		float newMaxX = MathUtils.min(aabbMinX, translatedMaxX);
		float newMaxY = MathUtils.min(aabbMinY, translatedMaxY);
		float newMaxZ = MathUtils.min(aabbMinZ, translatedMaxZ);
		
		res[0] = newMinX;
		res[1] = newMinY;
		res[2] = newMinZ;
		res[3] = newMaxX;
		res[4] = newMaxY;
		res[5] = newMaxZ;
		
		return res;
	}
	
	public static float[] translateMax(float[] aabbMin, float[] aabbMax, float[] t, @ExtractionParam float[] res)
	{
		float aabbMinX = aabbMin[0];
		float aabbMinY = aabbMin[1];
		float aabbMinZ = aabbMin[2];
		float aabbMaxX = aabbMax[0];
		float aabbMaxY = aabbMax[1];
		float aabbMaxZ = aabbMax[2];
		
		float tX = t[0];
		float tY = t[1];
		float tZ = t[2];
		
		float translatedMaxX = aabbMaxX + tX;
		float translatedMaxY = aabbMaxY + tY;
		float translatedMaxZ = aabbMaxZ + tZ;
		
		float newMinX = MathUtils.min(aabbMinX, translatedMaxX);
		float newMinY = MathUtils.min(aabbMinY, translatedMaxY);
		float newMinZ = MathUtils.min(aabbMinZ, translatedMaxZ);
		float newMaxX = MathUtils.min(aabbMinX, translatedMaxX);
		float newMaxY = MathUtils.min(aabbMinY, translatedMaxY);
		float newMaxZ = MathUtils.min(aabbMinZ, translatedMaxZ);
		
		res[0] = newMinX;
		res[1] = newMinY;
		res[2] = newMinZ;
		res[3] = newMaxX;
		res[4] = newMaxY;
		res[5] = newMaxZ;
		
		return res;
	}
	
	public static float[] translateMax(float[] aabbMin, float[] aabbMax, float tX, float tY, float tZ, @ExtractionParam float[] res)
	{
		float aabbMinX = aabbMin[0];
		float aabbMinY = aabbMin[1];
		float aabbMinZ = aabbMin[2];
		float aabbMaxX = aabbMax[0];
		float aabbMaxY = aabbMax[1];
		float aabbMaxZ = aabbMax[2];
		
		float translatedMaxX = aabbMaxX + tX;
		float translatedMaxY = aabbMaxY + tY;
		float translatedMaxZ = aabbMaxZ + tZ;
		
		float newMinX = MathUtils.min(aabbMinX, translatedMaxX);
		float newMinY = MathUtils.min(aabbMinY, translatedMaxY);
		float newMinZ = MathUtils.min(aabbMinZ, translatedMaxZ);
		float newMaxX = MathUtils.min(aabbMinX, translatedMaxX);
		float newMaxY = MathUtils.min(aabbMinY, translatedMaxY);
		float newMaxZ = MathUtils.min(aabbMinZ, translatedMaxZ);
		
		res[0] = newMinX;
		res[1] = newMinY;
		res[2] = newMinZ;
		res[3] = newMaxX;
		res[4] = newMaxY;
		res[5] = newMaxZ;
		
		return res;
	}
	
	public static float[] translateMax(float[] aabbMin, float aabbMaxX, float aabbMaxY, float aabbMaxZ, float[] t, @ExtractionParam float[] res)
	{
		float aabbMinX = aabbMin[0];
		float aabbMinY = aabbMin[1];
		float aabbMinZ = aabbMin[2];
		
		float tX = t[0];
		float tY = t[1];
		float tZ = t[2];
		
		float translatedMaxX = aabbMaxX + tX;
		float translatedMaxY = aabbMaxY + tY;
		float translatedMaxZ = aabbMaxZ + tZ;
		
		float newMinX = MathUtils.min(aabbMinX, translatedMaxX);
		float newMinY = MathUtils.min(aabbMinY, translatedMaxY);
		float newMinZ = MathUtils.min(aabbMinZ, translatedMaxZ);
		float newMaxX = MathUtils.min(aabbMinX, translatedMaxX);
		float newMaxY = MathUtils.min(aabbMinY, translatedMaxY);
		float newMaxZ = MathUtils.min(aabbMinZ, translatedMaxZ);
		
		res[0] = newMinX;
		res[1] = newMinY;
		res[2] = newMinZ;
		res[3] = newMaxX;
		res[4] = newMaxY;
		res[5] = newMaxZ;
		
		return res;
	}
	
	public static float[] translateMax(float[] aabbMin, float aabbMaxX, float aabbMaxY, float aabbMaxZ, float tX, float tY, float tZ, @ExtractionParam float[] res)
	{
		float aabbMinX = aabbMin[0];
		float aabbMinY = aabbMin[1];
		float aabbMinZ = aabbMin[2];
		
		float translatedMaxX = aabbMaxX + tX;
		float translatedMaxY = aabbMaxY + tY;
		float translatedMaxZ = aabbMaxZ + tZ;
		
		float newMinX = MathUtils.min(aabbMinX, translatedMaxX);
		float newMinY = MathUtils.min(aabbMinY, translatedMaxY);
		float newMinZ = MathUtils.min(aabbMinZ, translatedMaxZ);
		float newMaxX = MathUtils.min(aabbMinX, translatedMaxX);
		float newMaxY = MathUtils.min(aabbMinY, translatedMaxY);
		float newMaxZ = MathUtils.min(aabbMinZ, translatedMaxZ);
		
		res[0] = newMinX;
		res[1] = newMinY;
		res[2] = newMinZ;
		res[3] = newMaxX;
		res[4] = newMaxY;
		res[5] = newMaxZ;
		
		return res;
	}
	
	public static float[] translateMax(float aabbMinX, float aabbMinY, float aabbMinZ, float[] aabbMax, float[] t, @ExtractionParam float[] res)
	{
		float aabbMaxX = aabbMax[0];
		float aabbMaxY = aabbMax[1];
		float aabbMaxZ = aabbMax[2];
		
		float tX = t[0];
		float tY = t[1];
		float tZ = t[2];
		
		float translatedMaxX = aabbMaxX + tX;
		float translatedMaxY = aabbMaxY + tY;
		float translatedMaxZ = aabbMaxZ + tZ;
		
		float newMinX = MathUtils.min(aabbMinX, translatedMaxX);
		float newMinY = MathUtils.min(aabbMinY, translatedMaxY);
		float newMinZ = MathUtils.min(aabbMinZ, translatedMaxZ);
		float newMaxX = MathUtils.min(aabbMinX, translatedMaxX);
		float newMaxY = MathUtils.min(aabbMinY, translatedMaxY);
		float newMaxZ = MathUtils.min(aabbMinZ, translatedMaxZ);
		
		res[0] = newMinX;
		res[1] = newMinY;
		res[2] = newMinZ;
		res[3] = newMaxX;
		res[4] = newMaxY;
		res[5] = newMaxZ;
		
		return res;
	}
	
	public static float[] translateMax(float aabbMinX, float aabbMinY, float aabbMinZ, float[] aabbMax, float tX, float tY, float tZ, @ExtractionParam float[] res)
	{
		float aabbMaxX = aabbMax[0];
		float aabbMaxY = aabbMax[1];
		float aabbMaxZ = aabbMax[2];
		
		float translatedMaxX = aabbMaxX + tX;
		float translatedMaxY = aabbMaxY + tY;
		float translatedMaxZ = aabbMaxZ + tZ;
		
		float newMinX = MathUtils.min(aabbMinX, translatedMaxX);
		float newMinY = MathUtils.min(aabbMinY, translatedMaxY);
		float newMinZ = MathUtils.min(aabbMinZ, translatedMaxZ);
		float newMaxX = MathUtils.min(aabbMinX, translatedMaxX);
		float newMaxY = MathUtils.min(aabbMinY, translatedMaxY);
		float newMaxZ = MathUtils.min(aabbMinZ, translatedMaxZ);
		
		res[0] = newMinX;
		res[1] = newMinY;
		res[2] = newMinZ;
		res[3] = newMaxX;
		res[4] = newMaxY;
		res[5] = newMaxZ;
		
		return res;
	}
	
	public static float[] translateMax(float aabbMinX, float aabbMinY, float aabbMinZ, float aabbMaxX, float aabbMaxY, float aabbMaxZ, float[] t, @ExtractionParam float[] res)
	{
		float tX = t[0];
		float tY = t[1];
		float tZ = t[2];
		
		float translatedMaxX = aabbMaxX + tX;
		float translatedMaxY = aabbMaxY + tY;
		float translatedMaxZ = aabbMaxZ + tZ;
		
		float newMinX = MathUtils.min(aabbMinX, translatedMaxX);
		float newMinY = MathUtils.min(aabbMinY, translatedMaxY);
		float newMinZ = MathUtils.min(aabbMinZ, translatedMaxZ);
		float newMaxX = MathUtils.min(aabbMinX, translatedMaxX);
		float newMaxY = MathUtils.min(aabbMinY, translatedMaxY);
		float newMaxZ = MathUtils.min(aabbMinZ, translatedMaxZ);
		
		res[0] = newMinX;
		res[1] = newMinY;
		res[2] = newMinZ;
		res[3] = newMaxX;
		res[4] = newMaxY;
		res[5] = newMaxZ;
		
		return res;
	}
	
	public static float[] translateMax(float aabbMinX, float aabbMinY, float aabbMinZ, float aabbMaxX, float aabbMaxY, float aabbMaxZ, float tX, float tY, float tZ, @ExtractionParam float[] res)
	{
		float translatedMaxX = aabbMaxX + tX;
		float translatedMaxY = aabbMaxY + tY;
		float translatedMaxZ = aabbMaxZ + tZ;
		
		float newMinX = MathUtils.min(aabbMinX, translatedMaxX);
		float newMinY = MathUtils.min(aabbMinY, translatedMaxY);
		float newMinZ = MathUtils.min(aabbMinZ, translatedMaxZ);
		float newMaxX = MathUtils.min(aabbMinX, translatedMaxX);
		float newMaxY = MathUtils.min(aabbMinY, translatedMaxY);
		float newMaxZ = MathUtils.min(aabbMinZ, translatedMaxZ);
		
		res[0] = newMinX;
		res[1] = newMinY;
		res[2] = newMinZ;
		res[3] = newMaxX;
		res[4] = newMaxY;
		res[5] = newMaxZ;
		
		return res;
	}
	
	public static float[] translateMaxAssign(@ExtractionParam float[] aabb, float[] t)
	{
		float aabbMinX = aabb[0];
		float aabbMinY = aabb[1];
		float aabbMinZ = aabb[2];
		float aabbMaxX = aabb[3];
		float aabbMaxY = aabb[4];
		float aabbMaxZ = aabb[5];
		
		float tX = t[0];
		float tY = t[1];
		float tZ = t[2];
		
		float translatedMaxX = aabbMaxX + tX;
		float translatedMaxY = aabbMaxY + tY;
		float translatedMaxZ = aabbMaxZ + tZ;
		
		float newMinX = MathUtils.min(aabbMinX, translatedMaxX);
		float newMinY = MathUtils.min(aabbMinY, translatedMaxY);
		float newMinZ = MathUtils.min(aabbMinZ, translatedMaxZ);
		float newMaxX = MathUtils.min(aabbMinX, translatedMaxX);
		float newMaxY = MathUtils.min(aabbMinY, translatedMaxY);
		float newMaxZ = MathUtils.min(aabbMinZ, translatedMaxZ);
		
		aabb[0] = newMinX;
		aabb[1] = newMinY;
		aabb[2] = newMinZ;
		aabb[3] = newMaxX;
		aabb[4] = newMaxY;
		aabb[5] = newMaxZ;
		
		return aabb;
	}
	
	public static float[] translateMaxAssign(@ExtractionParam float[] aabb, float tX, float tY, float tZ)
	{
		float aabbMinX = aabb[0];
		float aabbMinY = aabb[1];
		float aabbMinZ = aabb[2];
		float aabbMaxX = aabb[3];
		float aabbMaxY = aabb[4];
		float aabbMaxZ = aabb[5];
		
		float translatedMaxX = aabbMaxX + tX;
		float translatedMaxY = aabbMaxY + tY;
		float translatedMaxZ = aabbMaxZ + tZ;
		
		float newMinX = MathUtils.min(aabbMinX, translatedMaxX);
		float newMinY = MathUtils.min(aabbMinY, translatedMaxY);
		float newMinZ = MathUtils.min(aabbMinZ, translatedMaxZ);
		float newMaxX = MathUtils.min(aabbMinX, translatedMaxX);
		float newMaxY = MathUtils.min(aabbMinY, translatedMaxY);
		float newMaxZ = MathUtils.min(aabbMinZ, translatedMaxZ);
		
		aabb[0] = newMinX;
		aabb[1] = newMinY;
		aabb[2] = newMinZ;
		aabb[3] = newMaxX;
		aabb[4] = newMaxY;
		aabb[5] = newMaxZ;
		
		return aabb;
	}
	
	public static float[] grow(float[] aabb, float[] e, @ExtractionParam float[] res)
	{
		float aabbMinX = aabb[0];
		float aabbMinY = aabb[1];
		float aabbMinZ = aabb[2];
		float aabbMaxX = aabb[3];
		float aabbMaxY = aabb[4];
		float aabbMaxZ = aabb[5];
		
		float eX = e[0];
		float eY = e[1];
		float eZ = e[2];
		
		float newMinX = aabbMinX - eX;
		float newMinY = aabbMinY - eY;
		float newMinZ = aabbMinZ - eZ;
		float newMaxX = aabbMaxX + eX;
		float newMaxY = aabbMaxY + eY;
		float newMaxZ = aabbMaxZ + eZ;
		
		res[0] = newMinX;
		res[1] = newMinY;
		res[2] = newMinZ;
		res[3] = newMaxX;
		res[4] = newMaxY;
		res[5] = newMaxZ;
		
		return res;
	}
	
	public static float[] grow(float[] aabb, float eX, float eY, float eZ, @ExtractionParam float[] res)
	{
		float aabbMinX = aabb[0];
		float aabbMinY = aabb[1];
		float aabbMinZ = aabb[2];
		float aabbMaxX = aabb[3];
		float aabbMaxY = aabb[4];
		float aabbMaxZ = aabb[5];
		
		float newMinX = aabbMinX - eX;
		float newMinY = aabbMinY - eY;
		float newMinZ = aabbMinZ - eZ;
		float newMaxX = aabbMaxX + eX;
		float newMaxY = aabbMaxY + eY;
		float newMaxZ = aabbMaxZ + eZ;
		
		res[0] = newMinX;
		res[1] = newMinY;
		res[2] = newMinZ;
		res[3] = newMaxX;
		res[4] = newMaxY;
		res[5] = newMaxZ;
		
		return res;
	}
	
	public static float[] grow(float[] aabbMin, float[] aabbMax, float[] e, @ExtractionParam float[] res)
	{
		float aabbMinX = aabbMin[0];
		float aabbMinY = aabbMin[1];
		float aabbMinZ = aabbMin[2];
		float aabbMaxX = aabbMax[0];
		float aabbMaxY = aabbMax[1];
		float aabbMaxZ = aabbMax[2];
		
		float eX = e[0];
		float eY = e[1];
		float eZ = e[2];
		
		float newMinX = aabbMinX - eX;
		float newMinY = aabbMinY - eY;
		float newMinZ = aabbMinZ - eZ;
		float newMaxX = aabbMaxX + eX;
		float newMaxY = aabbMaxY + eY;
		float newMaxZ = aabbMaxZ + eZ;
		
		res[0] = newMinX;
		res[1] = newMinY;
		res[2] = newMinZ;
		res[3] = newMaxX;
		res[4] = newMaxY;
		res[5] = newMaxZ;
		
		return res;
	}
	
	public static float[] grow(float[] aabbMin, float[] aabbMax, float eX, float eY, float eZ, @ExtractionParam float[] res)
	{
		float aabbMinX = aabbMin[0];
		float aabbMinY = aabbMin[1];
		float aabbMinZ = aabbMin[2];
		float aabbMaxX = aabbMax[0];
		float aabbMaxY = aabbMax[1];
		float aabbMaxZ = aabbMax[2];
		
		float newMinX = aabbMinX - eX;
		float newMinY = aabbMinY - eY;
		float newMinZ = aabbMinZ - eZ;
		float newMaxX = aabbMaxX + eX;
		float newMaxY = aabbMaxY + eY;
		float newMaxZ = aabbMaxZ + eZ;
		
		res[0] = newMinX;
		res[1] = newMinY;
		res[2] = newMinZ;
		res[3] = newMaxX;
		res[4] = newMaxY;
		res[5] = newMaxZ;
		
		return res;
	}
	
	public static float[] grow(float[] aabbMin, float aabbMaxX, float aabbMaxY, float aabbMaxZ, float[] e, @ExtractionParam float[] res)
	{
		float aabbMinX = aabbMin[0];
		float aabbMinY = aabbMin[1];
		float aabbMinZ = aabbMin[2];
		
		float eX = e[0];
		float eY = e[1];
		float eZ = e[2];
		
		float newMinX = aabbMinX - eX;
		float newMinY = aabbMinY - eY;
		float newMinZ = aabbMinZ - eZ;
		float newMaxX = aabbMaxX + eX;
		float newMaxY = aabbMaxY + eY;
		float newMaxZ = aabbMaxZ + eZ;
		
		res[0] = newMinX;
		res[1] = newMinY;
		res[2] = newMinZ;
		res[3] = newMaxX;
		res[4] = newMaxY;
		res[5] = newMaxZ;
		
		return res;
	}
	
	public static float[] grow(float[] aabbMin, float aabbMaxX, float aabbMaxY, float aabbMaxZ, float eX, float eY, float eZ, @ExtractionParam float[] res)
	{
		float aabbMinX = aabbMin[0];
		float aabbMinY = aabbMin[1];
		float aabbMinZ = aabbMin[2];
		
		float newMinX = aabbMinX - eX;
		float newMinY = aabbMinY - eY;
		float newMinZ = aabbMinZ - eZ;
		float newMaxX = aabbMaxX + eX;
		float newMaxY = aabbMaxY + eY;
		float newMaxZ = aabbMaxZ + eZ;
		
		res[0] = newMinX;
		res[1] = newMinY;
		res[2] = newMinZ;
		res[3] = newMaxX;
		res[4] = newMaxY;
		res[5] = newMaxZ;
		
		return res;
	}
	
	public static float[] grow(float aabbMinX, float aabbMinY, float aabbMinZ, float[] aabbMax, float[] e, @ExtractionParam float[] res)
	{
		float aabbMaxX = aabbMax[0];
		float aabbMaxY = aabbMax[1];
		float aabbMaxZ = aabbMax[2];
		
		float eX = e[0];
		float eY = e[1];
		float eZ = e[2];
		
		float newMinX = aabbMinX - eX;
		float newMinY = aabbMinY - eY;
		float newMinZ = aabbMinZ - eZ;
		float newMaxX = aabbMaxX + eX;
		float newMaxY = aabbMaxY + eY;
		float newMaxZ = aabbMaxZ + eZ;
		
		res[0] = newMinX;
		res[1] = newMinY;
		res[2] = newMinZ;
		res[3] = newMaxX;
		res[4] = newMaxY;
		res[5] = newMaxZ;
		
		return res;
	}
	
	public static float[] grow(float aabbMinX, float aabbMinY, float aabbMinZ, float[] aabbMax, float eX, float eY, float eZ, @ExtractionParam float[] res)
	{
		float aabbMaxX = aabbMax[0];
		float aabbMaxY = aabbMax[1];
		float aabbMaxZ = aabbMax[2];
		
		float newMinX = aabbMinX - eX;
		float newMinY = aabbMinY - eY;
		float newMinZ = aabbMinZ - eZ;
		float newMaxX = aabbMaxX + eX;
		float newMaxY = aabbMaxY + eY;
		float newMaxZ = aabbMaxZ + eZ;
		
		res[0] = newMinX;
		res[1] = newMinY;
		res[2] = newMinZ;
		res[3] = newMaxX;
		res[4] = newMaxY;
		res[5] = newMaxZ;
		
		return res;
	}
	
	public static float[] grow(float aabbMinX, float aabbMinY, float aabbMinZ, float aabbMaxX, float aabbMaxY, float aabbMaxZ, float[] e, @ExtractionParam float[] res)
	{
		float eX = e[0];
		float eY = e[1];
		float eZ = e[2];
		
		float newMinX = aabbMinX - eX;
		float newMinY = aabbMinY - eY;
		float newMinZ = aabbMinZ - eZ;
		float newMaxX = aabbMaxX + eX;
		float newMaxY = aabbMaxY + eY;
		float newMaxZ = aabbMaxZ + eZ;
		
		res[0] = newMinX;
		res[1] = newMinY;
		res[2] = newMinZ;
		res[3] = newMaxX;
		res[4] = newMaxY;
		res[5] = newMaxZ;
		
		return res;
	}
	
	public static float[] grow(float aabbMinX, float aabbMinY, float aabbMinZ, float aabbMaxX, float aabbMaxY, float aabbMaxZ, float eX, float eY, float eZ, @ExtractionParam float[] res)
	{
		float newMinX = aabbMinX - eX;
		float newMinY = aabbMinY - eY;
		float newMinZ = aabbMinZ - eZ;
		float newMaxX = aabbMaxX + eX;
		float newMaxY = aabbMaxY + eY;
		float newMaxZ = aabbMaxZ + eZ;
		
		res[0] = newMinX;
		res[1] = newMinY;
		res[2] = newMinZ;
		res[3] = newMaxX;
		res[4] = newMaxY;
		res[5] = newMaxZ;
		
		return res;
	}
	
	public static float[] growAssign(@ExtractionParam float[] aabb, float[] e)
	{
		float aabbMinX = aabb[0];
		float aabbMinY = aabb[1];
		float aabbMinZ = aabb[2];
		float aabbMaxX = aabb[3];
		float aabbMaxY = aabb[4];
		float aabbMaxZ = aabb[5];
		
		float eX = e[0];
		float eY = e[1];
		float eZ = e[2];
		
		float newMinX = aabbMinX - eX;
		float newMinY = aabbMinY - eY;
		float newMinZ = aabbMinZ - eZ;
		float newMaxX = aabbMaxX + eX;
		float newMaxY = aabbMaxY + eY;
		float newMaxZ = aabbMaxZ + eZ;
		
		aabb[0] = newMinX;
		aabb[1] = newMinY;
		aabb[2] = newMinZ;
		aabb[3] = newMaxX;
		aabb[4] = newMaxY;
		aabb[5] = newMaxZ;
		
		return aabb;
	}
	
	public static float[] growAssign(@ExtractionParam float[] aabb, float eX, float eY, float eZ)
	{
		float aabbMinX = aabb[0];
		float aabbMinY = aabb[1];
		float aabbMinZ = aabb[2];
		float aabbMaxX = aabb[3];
		float aabbMaxY = aabb[4];
		float aabbMaxZ = aabb[5];
		
		float newMinX = aabbMinX - eX;
		float newMinY = aabbMinY - eY;
		float newMinZ = aabbMinZ - eZ;
		float newMaxX = aabbMaxX + eX;
		float newMaxY = aabbMaxY + eY;
		float newMaxZ = aabbMaxZ + eZ;
		
		aabb[0] = newMinX;
		aabb[1] = newMinY;
		aabb[2] = newMinZ;
		aabb[3] = newMaxX;
		aabb[4] = newMaxY;
		aabb[5] = newMaxZ;
		
		return aabb;
	}
	
	public static float[] expand(float[] aabb, float[] e, @ExtractionParam float[] res)
	{
		float aabbMinX = aabb[0];
		float aabbMinY = aabb[1];
		float aabbMinZ = aabb[2];
		float aabbMaxX = aabb[3];
		float aabbMaxY = aabb[4];
		float aabbMaxZ = aabb[5];
		
		float eMinX = e[0];
		float eMinY = e[1];
		float eMinZ = e[2];
		float eMaxX = e[3];
		float eMaxY = e[4];
		float eMaxZ = e[5];
		
		float newMinX = aabbMinX - eMinX;
		float newMinY = aabbMinY - eMinY;
		float newMinZ = aabbMinZ - eMinZ;
		float newMaxX = aabbMaxX + eMaxX;
		float newMaxY = aabbMaxY + eMaxY;
		float newMaxZ = aabbMaxZ + eMaxZ;
		
		res[0] = newMinX;
		res[1] = newMinY;
		res[2] = newMinZ;
		res[3] = newMaxX;
		res[4] = newMaxY;
		res[5] = newMaxZ;
		
		return res;
	}
	
	public static float[] expand(float[] aabb, float eMinX, float eMinY, float eMinZ, float eMaxX, float eMaxY, float eMaxZ, @ExtractionParam float[] res)
	{
		float aabbMinX = aabb[0];
		float aabbMinY = aabb[1];
		float aabbMinZ = aabb[2];
		float aabbMaxX = aabb[3];
		float aabbMaxY = aabb[4];
		float aabbMaxZ = aabb[5];
		
		float newMinX = aabbMinX - eMinX;
		float newMinY = aabbMinY - eMinY;
		float newMinZ = aabbMinZ - eMinZ;
		float newMaxX = aabbMaxX + eMaxX;
		float newMaxY = aabbMaxY + eMaxY;
		float newMaxZ = aabbMaxZ + eMaxZ;
		
		res[0] = newMinX;
		res[1] = newMinY;
		res[2] = newMinZ;
		res[3] = newMaxX;
		res[4] = newMaxY;
		res[5] = newMaxZ;
		
		return res;
	}
	
	public static float[] expand(float[] aabbMin, float[] aabbMax, float[] e, @ExtractionParam float[] res)
	{
		float aabbMinX = aabbMin[0];
		float aabbMinY = aabbMin[1];
		float aabbMinZ = aabbMin[2];
		float aabbMaxX = aabbMax[0];
		float aabbMaxY = aabbMax[1];
		float aabbMaxZ = aabbMax[2];
		
		float eMinX = e[0];
		float eMinY = e[1];
		float eMinZ = e[2];
		float eMaxX = e[3];
		float eMaxY = e[4];
		float eMaxZ = e[5];
		
		float newMinX = aabbMinX - eMinX;
		float newMinY = aabbMinY - eMinY;
		float newMinZ = aabbMinZ - eMinZ;
		float newMaxX = aabbMaxX + eMaxX;
		float newMaxY = aabbMaxY + eMaxY;
		float newMaxZ = aabbMaxZ + eMaxZ;
		
		res[0] = newMinX;
		res[1] = newMinY;
		res[2] = newMinZ;
		res[3] = newMaxX;
		res[4] = newMaxY;
		res[5] = newMaxZ;
		
		return res;
	}
	
	public static float[] expand(float[] aabbMin, float[] aabbMax, float eMinX, float eMinY, float eMinZ, float eMaxX, float eMaxY, float eMaxZ, @ExtractionParam float[] res)
	{
		float aabbMinX = aabbMin[0];
		float aabbMinY = aabbMin[1];
		float aabbMinZ = aabbMin[2];
		float aabbMaxX = aabbMax[0];
		float aabbMaxY = aabbMax[1];
		float aabbMaxZ = aabbMax[2];
		
		float newMinX = aabbMinX - eMinX;
		float newMinY = aabbMinY - eMinY;
		float newMinZ = aabbMinZ - eMinZ;
		float newMaxX = aabbMaxX + eMaxX;
		float newMaxY = aabbMaxY + eMaxY;
		float newMaxZ = aabbMaxZ + eMaxZ;
		
		res[0] = newMinX;
		res[1] = newMinY;
		res[2] = newMinZ;
		res[3] = newMaxX;
		res[4] = newMaxY;
		res[5] = newMaxZ;
		
		return res;
	}
	
	public static float[] expand(float[] aabbMin, float aabbMaxX, float aabbMaxY, float aabbMaxZ, float[] e, @ExtractionParam float[] res)
	{
		float aabbMinX = aabbMin[0];
		float aabbMinY = aabbMin[1];
		float aabbMinZ = aabbMin[2];
		
		float eMinX = e[0];
		float eMinY = e[1];
		float eMinZ = e[2];
		float eMaxX = e[3];
		float eMaxY = e[4];
		float eMaxZ = e[5];
		
		float newMinX = aabbMinX - eMinX;
		float newMinY = aabbMinY - eMinY;
		float newMinZ = aabbMinZ - eMinZ;
		float newMaxX = aabbMaxX + eMaxX;
		float newMaxY = aabbMaxY + eMaxY;
		float newMaxZ = aabbMaxZ + eMaxZ;
		
		res[0] = newMinX;
		res[1] = newMinY;
		res[2] = newMinZ;
		res[3] = newMaxX;
		res[4] = newMaxY;
		res[5] = newMaxZ;
		
		return res;
	}
	
	public static float[] expand(float aabbMinX, float aabbMinY, float aabbMinZ, float[] aabbMax, float[] e, @ExtractionParam float[] res)
	{
		float aabbMaxX = aabbMax[0];
		float aabbMaxY = aabbMax[1];
		float aabbMaxZ = aabbMax[2];
		
		float eMinX = e[0];
		float eMinY = e[1];
		float eMinZ = e[2];
		float eMaxX = e[3];
		float eMaxY = e[4];
		float eMaxZ = e[5];
		
		float newMinX = aabbMinX - eMinX;
		float newMinY = aabbMinY - eMinY;
		float newMinZ = aabbMinZ - eMinZ;
		float newMaxX = aabbMaxX + eMaxX;
		float newMaxY = aabbMaxY + eMaxY;
		float newMaxZ = aabbMaxZ + eMaxZ;
		
		res[0] = newMinX;
		res[1] = newMinY;
		res[2] = newMinZ;
		res[3] = newMaxX;
		res[4] = newMaxY;
		res[5] = newMaxZ;
		
		return res;
	}
	
	public static float[] expand(float aabbMinX, float aabbMinY, float aabbMinZ, float[] aabbMax, float eMinX, float eMinY, float eMinZ, float eMaxX, float eMaxY, float eMaxZ, @ExtractionParam float[] res)
	{
		float aabbMaxX = aabbMax[0];
		float aabbMaxY = aabbMax[1];
		float aabbMaxZ = aabbMax[2];
		
		float newMinX = aabbMinX - eMinX;
		float newMinY = aabbMinY - eMinY;
		float newMinZ = aabbMinZ - eMinZ;
		float newMaxX = aabbMaxX + eMaxX;
		float newMaxY = aabbMaxY + eMaxY;
		float newMaxZ = aabbMaxZ + eMaxZ;
		
		res[0] = newMinX;
		res[1] = newMinY;
		res[2] = newMinZ;
		res[3] = newMaxX;
		res[4] = newMaxY;
		res[5] = newMaxZ;
		
		return res;
	}
	
	public static float[] expand(float aabbMinX, float aabbMinY, float aabbMinZ, float aabbMaxX, float aabbMaxY, float aabbMaxZ, float[] e, @ExtractionParam float[] res)
	{
		float eMinX = e[0];
		float eMinY = e[1];
		float eMinZ = e[2];
		float eMaxX = e[3];
		float eMaxY = e[4];
		float eMaxZ = e[5];
		
		float newMinX = aabbMinX - eMinX;
		float newMinY = aabbMinY - eMinY;
		float newMinZ = aabbMinZ - eMinZ;
		float newMaxX = aabbMaxX + eMaxX;
		float newMaxY = aabbMaxY + eMaxY;
		float newMaxZ = aabbMaxZ + eMaxZ;
		
		res[0] = newMinX;
		res[1] = newMinY;
		res[2] = newMinZ;
		res[3] = newMaxX;
		res[4] = newMaxY;
		res[5] = newMaxZ;
		
		return res;
	}
	
	public static float[] expand(float aabbMinX, float aabbMinY, float aabbMinZ, float aabbMaxX, float aabbMaxY, float aabbMaxZ, float eMinX, float eMinY, float eMinZ, float eMaxX, float eMaxY, float eMaxZ, @ExtractionParam float[] res)
	{
		float newMinX = aabbMinX - eMinX;
		float newMinY = aabbMinY - eMinY;
		float newMinZ = aabbMinZ - eMinZ;
		float newMaxX = aabbMaxX + eMaxX;
		float newMaxY = aabbMaxY + eMaxY;
		float newMaxZ = aabbMaxZ + eMaxZ;
		
		res[0] = newMinX;
		res[1] = newMinY;
		res[2] = newMinZ;
		res[3] = newMaxX;
		res[4] = newMaxY;
		res[5] = newMaxZ;
		
		return res;
	}
	
	public static float[] expandAssign(@ExtractionParam float[] aabb, float[] e)
	{
		float aabbMinX = aabb[0];
		float aabbMinY = aabb[1];
		float aabbMinZ = aabb[2];
		float aabbMaxX = aabb[3];
		float aabbMaxY = aabb[4];
		float aabbMaxZ = aabb[5];
		
		float eMinX = e[0];
		float eMinY = e[1];
		float eMinZ = e[2];
		float eMaxX = e[3];
		float eMaxY = e[4];
		float eMaxZ = e[5];
		
		float newMinX = aabbMinX - eMinX;
		float newMinY = aabbMinY - eMinY;
		float newMinZ = aabbMinZ - eMinZ;
		float newMaxX = aabbMaxX + eMaxX;
		float newMaxY = aabbMaxY + eMaxY;
		float newMaxZ = aabbMaxZ + eMaxZ;
		
		aabb[0] = newMinX;
		aabb[1] = newMinY;
		aabb[2] = newMinZ;
		aabb[3] = newMaxX;
		aabb[4] = newMaxY;
		aabb[5] = newMaxZ;
		
		return aabb;
	}
	
	public static float[] expandAssign(@ExtractionParam float[] aabb, float eMinX, float eMinY, float eMinZ, float eMaxX, float eMaxY, float eMaxZ)
	{
		float aabbMinX = aabb[0];
		float aabbMinY = aabb[1];
		float aabbMinZ = aabb[2];
		float aabbMaxX = aabb[3];
		float aabbMaxY = aabb[4];
		float aabbMaxZ = aabb[5];
		
		float newMinX = aabbMinX - eMinX;
		float newMinY = aabbMinY - eMinY;
		float newMinZ = aabbMinZ - eMinZ;
		float newMaxX = aabbMaxX + eMaxX;
		float newMaxY = aabbMaxY + eMaxY;
		float newMaxZ = aabbMaxZ + eMaxZ;
		
		aabb[0] = newMinX;
		aabb[1] = newMinY;
		aabb[2] = newMinZ;
		aabb[3] = newMaxX;
		aabb[4] = newMaxY;
		aabb[5] = newMaxZ;
		
		return aabb;
	}
	
}
