package org.barghos.api.math.bounds;

import org.barghos.annotation.ExtractionParam;
import org.barghos.api.math.vector.floats.IVec2RF;
import org.barghos.core.math.MathUtils;

public class AabbOpsI2F
{
	private AabbOpsI2F() { }
	
	public static float[] merge(IAabb2RF aabb1, IAabb2RF aabb2, @ExtractionParam float[] res)
	{
		float aabb1MinX = aabb1.minX();
		float aabb1MinY = aabb1.minY();
		float aabb1MaxX = aabb1.maxX();
		float aabb1MaxY = aabb1.maxY();
		
		float aabb2MinX = aabb2.minX();
		float aabb2MinY = aabb2.minY();
		float aabb2MaxX = aabb2.maxX();
		float aabb2MaxY = aabb2.maxY();
		
		float newMinX = MathUtils.min(aabb1MinX, aabb1MaxX, aabb2MinX, aabb2MaxX);
		float newMinY = MathUtils.min(aabb1MinY, aabb1MaxY, aabb2MinY, aabb2MaxY);
		float newMaxX = MathUtils.max(aabb1MinX, aabb1MaxX, aabb2MaxX, aabb2MaxX);
		float newMaxY = MathUtils.max(aabb1MinY, aabb1MaxY, aabb2MaxY, aabb2MaxY);
		
		res[0] = newMinX;
		res[1] = newMinY;
		res[2] = newMaxX;
		res[3] = newMaxY;
		
		return res;
	}
	
	public static float[] merge(IAabb2RF aabb1, float[] aabb2, @ExtractionParam float[] res)
	{
		float aabb1MinX = aabb1.minX();
		float aabb1MinY = aabb1.minY();
		float aabb1MaxX = aabb1.maxX();
		float aabb1MaxY = aabb1.maxY();
		
		float aabb2MinX = aabb2[0];
		float aabb2MinY = aabb2[1];
		float aabb2MaxX = aabb2[2];
		float aabb2MaxY = aabb2[3];
		
		float newMinX = MathUtils.min(aabb1MinX, aabb1MaxX, aabb2MinX, aabb2MaxX);
		float newMinY = MathUtils.min(aabb1MinY, aabb1MaxY, aabb2MinY, aabb2MaxY);
		float newMaxX = MathUtils.max(aabb1MinX, aabb1MaxX, aabb2MaxX, aabb2MaxX);
		float newMaxY = MathUtils.max(aabb1MinY, aabb1MaxY, aabb2MaxY, aabb2MaxY);
		
		res[0] = newMinX;
		res[1] = newMinY;
		res[2] = newMaxX;
		res[3] = newMaxY;
		
		return res;
	}
	
	public static float[] merge(IAabb2RF aabb1, IVec2RF aabb2Min, IVec2RF aabb2Max, @ExtractionParam float[] res)
	{
		float aabb1MinX = aabb1.minX();
		float aabb1MinY = aabb1.minY();
		float aabb1MaxX = aabb1.maxX();
		float aabb1MaxY = aabb1.maxY();
		
		float aabb2MinX = aabb2Min.x();
		float aabb2MinY = aabb2Min.y();
		float aabb2MaxX = aabb2Max.x();
		float aabb2MaxY = aabb2Max.y();
		
		float newMinX = MathUtils.min(aabb1MinX, aabb1MaxX, aabb2MinX, aabb2MaxX);
		float newMinY = MathUtils.min(aabb1MinY, aabb1MaxY, aabb2MinY, aabb2MaxY);
		float newMaxX = MathUtils.max(aabb1MinX, aabb1MaxX, aabb2MaxX, aabb2MaxX);
		float newMaxY = MathUtils.max(aabb1MinY, aabb1MaxY, aabb2MaxY, aabb2MaxY);
		
		res[0] = newMinX;
		res[1] = newMinY;
		res[2] = newMaxX;
		res[3] = newMaxY;
		
		return res;
	}
	
	public static float[] merge(IAabb2RF aabb1, IVec2RF aabb2Min, float[] aabb2Max, @ExtractionParam float[] res)
	{
		float aabb1MinX = aabb1.minX();
		float aabb1MinY = aabb1.minY();
		float aabb1MaxX = aabb1.maxX();
		float aabb1MaxY = aabb1.maxY();
		
		float aabb2MinX = aabb2Min.x();
		float aabb2MinY = aabb2Min.y();
		float aabb2MaxX = aabb2Max[0];
		float aabb2MaxY = aabb2Max[1];
		
		float newMinX = MathUtils.min(aabb1MinX, aabb1MaxX, aabb2MinX, aabb2MaxX);
		float newMinY = MathUtils.min(aabb1MinY, aabb1MaxY, aabb2MinY, aabb2MaxY);
		float newMaxX = MathUtils.max(aabb1MinX, aabb1MaxX, aabb2MaxX, aabb2MaxX);
		float newMaxY = MathUtils.max(aabb1MinY, aabb1MaxY, aabb2MaxY, aabb2MaxY);
		
		res[0] = newMinX;
		res[1] = newMinY;
		res[2] = newMaxX;
		res[3] = newMaxY;
		
		return res;
	}
	
	public static float[] merge(IAabb2RF aabb1, IVec2RF aabb2Min, float aabb2MaxX, float aabb2MaxY, @ExtractionParam float[] res)
	{
		float aabb1MinX = aabb1.minX();
		float aabb1MinY = aabb1.minY();
		float aabb1MaxX = aabb1.maxX();
		float aabb1MaxY = aabb1.maxY();
		
		float aabb2MinX = aabb2Min.x();
		float aabb2MinY = aabb2Min.y();
		
		float newMinX = MathUtils.min(aabb1MinX, aabb1MaxX, aabb2MinX, aabb2MaxX);
		float newMinY = MathUtils.min(aabb1MinY, aabb1MaxY, aabb2MinY, aabb2MaxY);
		float newMaxX = MathUtils.max(aabb1MinX, aabb1MaxX, aabb2MaxX, aabb2MaxX);
		float newMaxY = MathUtils.max(aabb1MinY, aabb1MaxY, aabb2MaxY, aabb2MaxY);
		
		res[0] = newMinX;
		res[1] = newMinY;
		res[2] = newMaxX;
		res[3] = newMaxY;
		
		return res;
	}
	
	public static float[] merge(IAabb2RF aabb1, float[] aabb2Min, IVec2RF aabb2Max, @ExtractionParam float[] res)
	{
		float aabb1MinX = aabb1.minX();
		float aabb1MinY = aabb1.minY();
		float aabb1MaxX = aabb1.maxX();
		float aabb1MaxY = aabb1.maxY();
		
		float aabb2MinX = aabb2Min[0];
		float aabb2MinY = aabb2Min[1];
		float aabb2MaxX = aabb2Max.x();
		float aabb2MaxY = aabb2Max.y();
		
		float newMinX = MathUtils.min(aabb1MinX, aabb1MaxX, aabb2MinX, aabb2MaxX);
		float newMinY = MathUtils.min(aabb1MinY, aabb1MaxY, aabb2MinY, aabb2MaxY);
		float newMaxX = MathUtils.max(aabb1MinX, aabb1MaxX, aabb2MaxX, aabb2MaxX);
		float newMaxY = MathUtils.max(aabb1MinY, aabb1MaxY, aabb2MaxY, aabb2MaxY);
		
		res[0] = newMinX;
		res[1] = newMinY;
		res[2] = newMaxX;
		res[3] = newMaxY;
		
		return res;
	}
	
	public static float[] merge(IAabb2RF aabb1, float[] aabb2Min, float[] aabb2Max, @ExtractionParam float[] res)
	{
		float aabb1MinX = aabb1.minX();
		float aabb1MinY = aabb1.minY();
		float aabb1MaxX = aabb1.maxX();
		float aabb1MaxY = aabb1.maxY();
		
		float aabb2MinX = aabb2Min[0];
		float aabb2MinY = aabb2Min[1];
		float aabb2MaxX = aabb2Max[0];
		float aabb2MaxY = aabb2Max[1];
		
		float newMinX = MathUtils.min(aabb1MinX, aabb1MaxX, aabb2MinX, aabb2MaxX);
		float newMinY = MathUtils.min(aabb1MinY, aabb1MaxY, aabb2MinY, aabb2MaxY);
		float newMaxX = MathUtils.max(aabb1MinX, aabb1MaxX, aabb2MaxX, aabb2MaxX);
		float newMaxY = MathUtils.max(aabb1MinY, aabb1MaxY, aabb2MaxY, aabb2MaxY);
		
		res[0] = newMinX;
		res[1] = newMinY;
		res[2] = newMaxX;
		res[3] = newMaxY;
		
		return res;
	}
	
	public static float[] merge(IAabb2RF aabb1, float[] aabb2Min, float aabb2MaxX, float aabb2MaxY, @ExtractionParam float[] res)
	{
		float aabb1MinX = aabb1.minX();
		float aabb1MinY = aabb1.minY();
		float aabb1MaxX = aabb1.maxX();
		float aabb1MaxY = aabb1.maxY();
		
		float aabb2MinX = aabb2Min[0];
		float aabb2MinY = aabb2Min[1];
		
		float newMinX = MathUtils.min(aabb1MinX, aabb1MaxX, aabb2MinX, aabb2MaxX);
		float newMinY = MathUtils.min(aabb1MinY, aabb1MaxY, aabb2MinY, aabb2MaxY);
		float newMaxX = MathUtils.max(aabb1MinX, aabb1MaxX, aabb2MaxX, aabb2MaxX);
		float newMaxY = MathUtils.max(aabb1MinY, aabb1MaxY, aabb2MaxY, aabb2MaxY);
		
		res[0] = newMinX;
		res[1] = newMinY;
		res[2] = newMaxX;
		res[3] = newMaxY;
		
		return res;
	}
	
	public static float[] merge(IAabb2RF aabb1, float aabb2MinX, float aabb2MinY, IVec2RF aabb2Max, @ExtractionParam float[] res)
	{
		float aabb1MinX = aabb1.minX();
		float aabb1MinY = aabb1.minY();
		float aabb1MaxX = aabb1.maxX();
		float aabb1MaxY = aabb1.maxY();
		
		float aabb2MaxX = aabb2Max.x();
		float aabb2MaxY = aabb2Max.y();
		
		float newMinX = MathUtils.min(aabb1MinX, aabb1MaxX, aabb2MinX, aabb2MaxX);
		float newMinY = MathUtils.min(aabb1MinY, aabb1MaxY, aabb2MinY, aabb2MaxY);
		float newMaxX = MathUtils.max(aabb1MinX, aabb1MaxX, aabb2MaxX, aabb2MaxX);
		float newMaxY = MathUtils.max(aabb1MinY, aabb1MaxY, aabb2MaxY, aabb2MaxY);
		
		res[0] = newMinX;
		res[1] = newMinY;
		res[2] = newMaxX;
		res[3] = newMaxY;
		
		return res;
	}
	
	public static float[] merge(IAabb2RF aabb1, float aabb2MinX, float aabb2MinY, float[] aabb2Max, @ExtractionParam float[] res)
	{
		float aabb1MinX = aabb1.minX();
		float aabb1MinY = aabb1.minY();
		float aabb1MaxX = aabb1.maxX();
		float aabb1MaxY = aabb1.maxY();
		
		float aabb2MaxX = aabb2Max[0];
		float aabb2MaxY = aabb2Max[1];
		
		float newMinX = MathUtils.min(aabb1MinX, aabb1MaxX, aabb2MinX, aabb2MaxX);
		float newMinY = MathUtils.min(aabb1MinY, aabb1MaxY, aabb2MinY, aabb2MaxY);
		float newMaxX = MathUtils.max(aabb1MinX, aabb1MaxX, aabb2MaxX, aabb2MaxX);
		float newMaxY = MathUtils.max(aabb1MinY, aabb1MaxY, aabb2MaxY, aabb2MaxY);
		
		res[0] = newMinX;
		res[1] = newMinY;
		res[2] = newMaxX;
		res[3] = newMaxY;
		
		return res;
	}
	
	public static float[] merge(IAabb2RF aabb1, float aabb2MinX, float aabb2MinY, float aabb2MaxX, float aabb2MaxY, @ExtractionParam float[] res)
	{
		float aabb1MinX = aabb1.minX();
		float aabb1MinY = aabb1.minY();
		float aabb1MaxX = aabb1.maxX();
		float aabb1MaxY = aabb1.maxY();
		
		float newMinX = MathUtils.min(aabb1MinX, aabb1MaxX, aabb2MinX, aabb2MaxX);
		float newMinY = MathUtils.min(aabb1MinY, aabb1MaxY, aabb2MinY, aabb2MaxY);
		float newMaxX = MathUtils.max(aabb1MinX, aabb1MaxX, aabb2MaxX, aabb2MaxX);
		float newMaxY = MathUtils.max(aabb1MinY, aabb1MaxY, aabb2MaxY, aabb2MaxY);
		
		res[0] = newMinX;
		res[1] = newMinY;
		res[2] = newMaxX;
		res[3] = newMaxY;
		
		return res;
	}
	
	public static float[] merge(float[] aabb1, IVec2RF aabb2Min, IVec2RF aabb2Max, @ExtractionParam float[] res)
	{
		float aabb1MinX = aabb1[0];
		float aabb1MinY = aabb1[1];
		float aabb1MaxX = aabb1[2];
		float aabb1MaxY = aabb1[3];
		
		float aabb2MinX = aabb2Min.x();
		float aabb2MinY = aabb2Min.y();
		float aabb2MaxX = aabb2Max.x();
		float aabb2MaxY = aabb2Max.y();
		
		float newMinX = MathUtils.min(aabb1MinX, aabb1MaxX, aabb2MinX, aabb2MaxX);
		float newMinY = MathUtils.min(aabb1MinY, aabb1MaxY, aabb2MinY, aabb2MaxY);
		float newMaxX = MathUtils.max(aabb1MinX, aabb1MaxX, aabb2MaxX, aabb2MaxX);
		float newMaxY = MathUtils.max(aabb1MinY, aabb1MaxY, aabb2MaxY, aabb2MaxY);
		
		res[0] = newMinX;
		res[1] = newMinY;
		res[2] = newMaxX;
		res[3] = newMaxY;
		
		return res;
	}
	
	public static float[] merge(float[] aabb1, IVec2RF aabb2Min, float[] aabb2Max, @ExtractionParam float[] res)
	{
		float aabb1MinX = aabb1[0];
		float aabb1MinY = aabb1[1];
		float aabb1MaxX = aabb1[2];
		float aabb1MaxY = aabb1[3];
		
		float aabb2MinX = aabb2Min.x();
		float aabb2MinY = aabb2Min.y();
		float aabb2MaxX = aabb2Max[0];
		float aabb2MaxY = aabb2Max[1];
		
		float newMinX = MathUtils.min(aabb1MinX, aabb1MaxX, aabb2MinX, aabb2MaxX);
		float newMinY = MathUtils.min(aabb1MinY, aabb1MaxY, aabb2MinY, aabb2MaxY);
		float newMaxX = MathUtils.max(aabb1MinX, aabb1MaxX, aabb2MaxX, aabb2MaxX);
		float newMaxY = MathUtils.max(aabb1MinY, aabb1MaxY, aabb2MaxY, aabb2MaxY);
		
		res[0] = newMinX;
		res[1] = newMinY;
		res[2] = newMaxX;
		res[3] = newMaxY;
		
		return res;
	}
	
	public static float[] merge(float[] aabb1, IVec2RF aabb2Min, float aabb2MaxX, float aabb2MaxY, @ExtractionParam float[] res)
	{
		float aabb1MinX = aabb1[0];
		float aabb1MinY = aabb1[1];
		float aabb1MaxX = aabb1[2];
		float aabb1MaxY = aabb1[3];
		
		float aabb2MinX = aabb2Min.x();
		float aabb2MinY = aabb2Min.y();
		
		float newMinX = MathUtils.min(aabb1MinX, aabb1MaxX, aabb2MinX, aabb2MaxX);
		float newMinY = MathUtils.min(aabb1MinY, aabb1MaxY, aabb2MinY, aabb2MaxY);
		float newMaxX = MathUtils.max(aabb1MinX, aabb1MaxX, aabb2MaxX, aabb2MaxX);
		float newMaxY = MathUtils.max(aabb1MinY, aabb1MaxY, aabb2MaxY, aabb2MaxY);
		
		res[0] = newMinX;
		res[1] = newMinY;
		res[2] = newMaxX;
		res[3] = newMaxY;
		
		return res;
	}
	
	public static float[] merge(float[] aabb1, float[] aabb2Min, IVec2RF aabb2Max, @ExtractionParam float[] res)
	{
		float aabb1MinX = aabb1[0];
		float aabb1MinY = aabb1[1];
		float aabb1MaxX = aabb1[2];
		float aabb1MaxY = aabb1[3];
		
		float aabb2MinX = aabb2Min[0];
		float aabb2MinY = aabb2Min[1];
		float aabb2MaxX = aabb2Max.x();
		float aabb2MaxY = aabb2Max.y();
		
		float newMinX = MathUtils.min(aabb1MinX, aabb1MaxX, aabb2MinX, aabb2MaxX);
		float newMinY = MathUtils.min(aabb1MinY, aabb1MaxY, aabb2MinY, aabb2MaxY);
		float newMaxX = MathUtils.max(aabb1MinX, aabb1MaxX, aabb2MaxX, aabb2MaxX);
		float newMaxY = MathUtils.max(aabb1MinY, aabb1MaxY, aabb2MaxY, aabb2MaxY);
		
		res[0] = newMinX;
		res[1] = newMinY;
		res[2] = newMaxX;
		res[3] = newMaxY;
		
		return res;
	}
	
	public static float[] merge(float[] aabb1, float aabb2MinX, float aabb2MinY, IVec2RF aabb2Max, @ExtractionParam float[] res)
	{
		float aabb1MinX = aabb1[0];
		float aabb1MinY = aabb1[1];
		float aabb1MaxX = aabb1[2];
		float aabb1MaxY = aabb1[3];
		
		float aabb2MaxX = aabb2Max.x();
		float aabb2MaxY = aabb2Max.y();
		
		float newMinX = MathUtils.min(aabb1MinX, aabb1MaxX, aabb2MinX, aabb2MaxX);
		float newMinY = MathUtils.min(aabb1MinY, aabb1MaxY, aabb2MinY, aabb2MaxY);
		float newMaxX = MathUtils.max(aabb1MinX, aabb1MaxX, aabb2MaxX, aabb2MaxX);
		float newMaxY = MathUtils.max(aabb1MinY, aabb1MaxY, aabb2MaxY, aabb2MaxY);
		
		res[0] = newMinX;
		res[1] = newMinY;
		res[2] = newMaxX;
		res[3] = newMaxY;
		
		return res;
	}
	
	public static float[] merge(IVec2RF aabb1Min, IVec2RF aabb1Max, IVec2RF aabb2Min, IVec2RF aabb2Max, @ExtractionParam float[] res)
	{
		float aabb1MinX = aabb1Min.x();
		float aabb1MinY = aabb1Min.y();
		float aabb1MaxX = aabb1Max.x();
		float aabb1MaxY = aabb1Max.y();
		
		float aabb2MinX = aabb2Min.x();
		float aabb2MinY = aabb2Min.y();
		float aabb2MaxX = aabb2Max.x();
		float aabb2MaxY = aabb2Max.y();
		
		float newMinX = MathUtils.min(aabb1MinX, aabb1MaxX, aabb2MinX, aabb2MaxX);
		float newMinY = MathUtils.min(aabb1MinY, aabb1MaxY, aabb2MinY, aabb2MaxY);
		float newMaxX = MathUtils.max(aabb1MinX, aabb1MaxX, aabb2MaxX, aabb2MaxX);
		float newMaxY = MathUtils.max(aabb1MinY, aabb1MaxY, aabb2MaxY, aabb2MaxY);
		
		res[0] = newMinX;
		res[1] = newMinY;
		res[2] = newMaxX;
		res[3] = newMaxY;
		
		return res;
	}
	
	public static float[] merge(IVec2RF aabb1Min, IVec2RF aabb1Max, IVec2RF aabb2Min, float[] aabb2Max, @ExtractionParam float[] res)
	{
		float aabb1MinX = aabb1Min.x();
		float aabb1MinY = aabb1Min.y();
		float aabb1MaxX = aabb1Max.x();
		float aabb1MaxY = aabb1Max.y();
		
		float aabb2MinX = aabb2Min.x();
		float aabb2MinY = aabb2Min.y();
		float aabb2MaxX = aabb2Max[0];
		float aabb2MaxY = aabb2Max[1];
		
		float newMinX = MathUtils.min(aabb1MinX, aabb1MaxX, aabb2MinX, aabb2MaxX);
		float newMinY = MathUtils.min(aabb1MinY, aabb1MaxY, aabb2MinY, aabb2MaxY);
		float newMaxX = MathUtils.max(aabb1MinX, aabb1MaxX, aabb2MaxX, aabb2MaxX);
		float newMaxY = MathUtils.max(aabb1MinY, aabb1MaxY, aabb2MaxY, aabb2MaxY);
		
		res[0] = newMinX;
		res[1] = newMinY;
		res[2] = newMaxX;
		res[3] = newMaxY;
		
		return res;
	}
	
	public static float[] merge(IVec2RF aabb1Min, IVec2RF aabb1Max, IVec2RF aabb2Min, float aabb2MaxX, float aabb2MaxY, @ExtractionParam float[] res)
	{
		float aabb1MinX = aabb1Min.x();
		float aabb1MinY = aabb1Min.y();
		float aabb1MaxX = aabb1Max.x();
		float aabb1MaxY = aabb1Max.y();
		
		float aabb2MinX = aabb2Min.x();
		float aabb2MinY = aabb2Min.y();
		
		float newMinX = MathUtils.min(aabb1MinX, aabb1MaxX, aabb2MinX, aabb2MaxX);
		float newMinY = MathUtils.min(aabb1MinY, aabb1MaxY, aabb2MinY, aabb2MaxY);
		float newMaxX = MathUtils.max(aabb1MinX, aabb1MaxX, aabb2MaxX, aabb2MaxX);
		float newMaxY = MathUtils.max(aabb1MinY, aabb1MaxY, aabb2MaxY, aabb2MaxY);
		
		res[0] = newMinX;
		res[1] = newMinY;
		res[2] = newMaxX;
		res[3] = newMaxY;
		
		return res;
	}
	
	public static float[] merge(IVec2RF aabb1Min, IVec2RF aabb1Max, float[] aabb2Min, IVec2RF aabb2Max, @ExtractionParam float[] res)
	{
		float aabb1MinX = aabb1Min.x();
		float aabb1MinY = aabb1Min.y();
		float aabb1MaxX = aabb1Max.x();
		float aabb1MaxY = aabb1Max.y();
		
		float aabb2MinX = aabb2Min[0];
		float aabb2MinY = aabb2Min[1];
		float aabb2MaxX = aabb2Max.x();
		float aabb2MaxY = aabb2Max.y();
		
		float newMinX = MathUtils.min(aabb1MinX, aabb1MaxX, aabb2MinX, aabb2MaxX);
		float newMinY = MathUtils.min(aabb1MinY, aabb1MaxY, aabb2MinY, aabb2MaxY);
		float newMaxX = MathUtils.max(aabb1MinX, aabb1MaxX, aabb2MaxX, aabb2MaxX);
		float newMaxY = MathUtils.max(aabb1MinY, aabb1MaxY, aabb2MaxY, aabb2MaxY);
		
		res[0] = newMinX;
		res[1] = newMinY;
		res[2] = newMaxX;
		res[3] = newMaxY;
		
		return res;
	}

	public static float[] merge(IVec2RF aabb1Min, IVec2RF aabb1Max, float[] aabb2Min, float[] aabb2Max, @ExtractionParam float[] res)
	{
		float aabb1MinX = aabb1Min.x();
		float aabb1MinY = aabb1Min.y();
		float aabb1MaxX = aabb1Max.x();
		float aabb1MaxY = aabb1Max.y();
		
		float aabb2MinX = aabb2Min[0];
		float aabb2MinY = aabb2Min[1];
		float aabb2MaxX = aabb2Max[0];
		float aabb2MaxY = aabb2Max[1];
		
		float newMinX = MathUtils.min(aabb1MinX, aabb1MaxX, aabb2MinX, aabb2MaxX);
		float newMinY = MathUtils.min(aabb1MinY, aabb1MaxY, aabb2MinY, aabb2MaxY);
		float newMaxX = MathUtils.max(aabb1MinX, aabb1MaxX, aabb2MaxX, aabb2MaxX);
		float newMaxY = MathUtils.max(aabb1MinY, aabb1MaxY, aabb2MaxY, aabb2MaxY);
		
		res[0] = newMinX;
		res[1] = newMinY;
		res[2] = newMaxX;
		res[3] = newMaxY;
		
		return res;
	}
	
	public static float[] merge(IVec2RF aabb1Min, IVec2RF aabb1Max, float[] aabb2Min, float aabb2MaxX, float aabb2MaxY, @ExtractionParam float[] res)
	{
		float aabb1MinX = aabb1Min.x();
		float aabb1MinY = aabb1Min.y();
		float aabb1MaxX = aabb1Max.x();
		float aabb1MaxY = aabb1Max.y();
		
		float aabb2MinX = aabb2Min[0];
		float aabb2MinY = aabb2Min[1];
		
		float newMinX = MathUtils.min(aabb1MinX, aabb1MaxX, aabb2MinX, aabb2MaxX);
		float newMinY = MathUtils.min(aabb1MinY, aabb1MaxY, aabb2MinY, aabb2MaxY);
		float newMaxX = MathUtils.max(aabb1MinX, aabb1MaxX, aabb2MaxX, aabb2MaxX);
		float newMaxY = MathUtils.max(aabb1MinY, aabb1MaxY, aabb2MaxY, aabb2MaxY);
		
		res[0] = newMinX;
		res[1] = newMinY;
		res[2] = newMaxX;
		res[3] = newMaxY;
		
		return res;
	}
	
	public static float[] merge(IVec2RF aabb1Min, IVec2RF aabb1Max, float aabb2MinX, float aabb2MinY, IVec2RF aabb2Max, @ExtractionParam float[] res)
	{
		float aabb1MinX = aabb1Min.x();
		float aabb1MinY = aabb1Min.y();
		float aabb1MaxX = aabb1Max.x();
		float aabb1MaxY = aabb1Max.y();
		
		float aabb2MaxX = aabb2Max.x();
		float aabb2MaxY = aabb2Max.y();
		
		float newMinX = MathUtils.min(aabb1MinX, aabb1MaxX, aabb2MinX, aabb2MaxX);
		float newMinY = MathUtils.min(aabb1MinY, aabb1MaxY, aabb2MinY, aabb2MaxY);
		float newMaxX = MathUtils.max(aabb1MinX, aabb1MaxX, aabb2MaxX, aabb2MaxX);
		float newMaxY = MathUtils.max(aabb1MinY, aabb1MaxY, aabb2MaxY, aabb2MaxY);
		
		res[0] = newMinX;
		res[1] = newMinY;
		res[2] = newMaxX;
		res[3] = newMaxY;
		
		return res;
	}

	public static float[] merge(IVec2RF aabb1Min, IVec2RF aabb1Max, float aabb2MinX, float aabb2MinY, float[] aabb2Max, @ExtractionParam float[] res)
	{
		float aabb1MinX = aabb1Min.x();
		float aabb1MinY = aabb1Min.y();
		float aabb1MaxX = aabb1Max.x();
		float aabb1MaxY = aabb1Max.y();
		
		float aabb2MaxX = aabb2Max[0];
		float aabb2MaxY = aabb2Max[1];
		
		float newMinX = MathUtils.min(aabb1MinX, aabb1MaxX, aabb2MinX, aabb2MaxX);
		float newMinY = MathUtils.min(aabb1MinY, aabb1MaxY, aabb2MinY, aabb2MaxY);
		float newMaxX = MathUtils.max(aabb1MinX, aabb1MaxX, aabb2MaxX, aabb2MaxX);
		float newMaxY = MathUtils.max(aabb1MinY, aabb1MaxY, aabb2MaxY, aabb2MaxY);
		
		res[0] = newMinX;
		res[1] = newMinY;
		res[2] = newMaxX;
		res[3] = newMaxY;
		
		return res;
	}
	
	
	
	public static float[] merge(IVec2RF aabb1Min, IVec2RF aabb1Max, float aabb2MinX, float aabb2MinY, float aabb2MaxX, float aabb2MaxY, @ExtractionParam float[] res)
	{
		float aabb1MinX = aabb1Min.x();
		float aabb1MinY = aabb1Min.y();
		float aabb1MaxX = aabb1Max.x();
		float aabb1MaxY = aabb1Max.y();
		
		float newMinX = MathUtils.min(aabb1MinX, aabb1MaxX, aabb2MinX, aabb2MaxX);
		float newMinY = MathUtils.min(aabb1MinY, aabb1MaxY, aabb2MinY, aabb2MaxY);
		float newMaxX = MathUtils.max(aabb1MinX, aabb1MaxX, aabb2MaxX, aabb2MaxX);
		float newMaxY = MathUtils.max(aabb1MinY, aabb1MaxY, aabb2MaxY, aabb2MaxY);
		
		res[0] = newMinX;
		res[1] = newMinY;
		res[2] = newMaxX;
		res[3] = newMaxY;
		
		return res;
	}
	
	public static float[] merge(IVec2RF aabb1Min, float[] aabb1Max, IVec2RF aabb2Min, float[] aabb2Max, @ExtractionParam float[] res)
	{
		float aabb1MinX = aabb1Min.x();
		float aabb1MinY = aabb1Min.y();
		float aabb1MaxX = aabb1Max[0];
		float aabb1MaxY = aabb1Max[1];
		
		float aabb2MinX = aabb2Min.x();
		float aabb2MinY = aabb2Min.y();
		float aabb2MaxX = aabb2Max[0];
		float aabb2MaxY = aabb2Max[1];
		
		float newMinX = MathUtils.min(aabb1MinX, aabb1MaxX, aabb2MinX, aabb2MaxX);
		float newMinY = MathUtils.min(aabb1MinY, aabb1MaxY, aabb2MinY, aabb2MaxY);
		float newMaxX = MathUtils.max(aabb1MinX, aabb1MaxX, aabb2MaxX, aabb2MaxX);
		float newMaxY = MathUtils.max(aabb1MinY, aabb1MaxY, aabb2MaxY, aabb2MaxY);
		
		res[0] = newMinX;
		res[1] = newMinY;
		res[2] = newMaxX;
		res[3] = newMaxY;
		
		return res;
	}
	
	public static float[] merge(IVec2RF aabb1Min, float[] aabb1Max, IVec2RF aabb2Min, float aabb2MaxX, float aabb2MaxY, @ExtractionParam float[] res)
	{
		float aabb1MinX = aabb1Min.x();
		float aabb1MinY = aabb1Min.y();
		float aabb1MaxX = aabb1Max[0];
		float aabb1MaxY = aabb1Max[1];
		
		float aabb2MinX = aabb2Min.x();
		float aabb2MinY = aabb2Min.y();
		
		float newMinX = MathUtils.min(aabb1MinX, aabb1MaxX, aabb2MinX, aabb2MaxX);
		float newMinY = MathUtils.min(aabb1MinY, aabb1MaxY, aabb2MinY, aabb2MaxY);
		float newMaxX = MathUtils.max(aabb1MinX, aabb1MaxX, aabb2MaxX, aabb2MaxX);
		float newMaxY = MathUtils.max(aabb1MinY, aabb1MaxY, aabb2MaxY, aabb2MaxY);
		
		res[0] = newMinX;
		res[1] = newMinY;
		res[2] = newMaxX;
		res[3] = newMaxY;
		
		return res;
	}
	
	public static float[] merge(IVec2RF aabb1Min, float[] aabb1Max, float[] aabb2Min, IVec2RF aabb2Max, @ExtractionParam float[] res)
	{
		float aabb1MinX = aabb1Min.x();
		float aabb1MinY = aabb1Min.y();
		float aabb1MaxX = aabb1Max[0];
		float aabb1MaxY = aabb1Max[1];
		
		float aabb2MinX = aabb2Min[0];
		float aabb2MinY = aabb2Min[1];
		float aabb2MaxX = aabb2Max.x();
		float aabb2MaxY = aabb2Max.y();
		
		float newMinX = MathUtils.min(aabb1MinX, aabb1MaxX, aabb2MinX, aabb2MaxX);
		float newMinY = MathUtils.min(aabb1MinY, aabb1MaxY, aabb2MinY, aabb2MaxY);
		float newMaxX = MathUtils.max(aabb1MinX, aabb1MaxX, aabb2MaxX, aabb2MaxX);
		float newMaxY = MathUtils.max(aabb1MinY, aabb1MaxY, aabb2MaxY, aabb2MaxY);
		
		res[0] = newMinX;
		res[1] = newMinY;
		res[2] = newMaxX;
		res[3] = newMaxY;
		
		return res;
	}

	public static float[] merge(IVec2RF aabb1Min, float[] aabb1Max, float[] aabb2Min, float[] aabb2Max, @ExtractionParam float[] res)
	{
		float aabb1MinX = aabb1Min.x();
		float aabb1MinY = aabb1Min.y();
		float aabb1MaxX = aabb1Max[0];
		float aabb1MaxY = aabb1Max[1];
		
		float aabb2MinX = aabb2Min[0];
		float aabb2MinY = aabb2Min[1];
		float aabb2MaxX = aabb2Max[0];
		float aabb2MaxY = aabb2Max[1];
		
		float newMinX = MathUtils.min(aabb1MinX, aabb1MaxX, aabb2MinX, aabb2MaxX);
		float newMinY = MathUtils.min(aabb1MinY, aabb1MaxY, aabb2MinY, aabb2MaxY);
		float newMaxX = MathUtils.max(aabb1MinX, aabb1MaxX, aabb2MaxX, aabb2MaxX);
		float newMaxY = MathUtils.max(aabb1MinY, aabb1MaxY, aabb2MaxY, aabb2MaxY);
		
		res[0] = newMinX;
		res[1] = newMinY;
		res[2] = newMaxX;
		res[3] = newMaxY;
		
		return res;
	}
	
	public static float[] merge(IVec2RF aabb1Min, float[] aabb1Max, float[] aabb2Min, float aabb2MaxX, float aabb2MaxY, @ExtractionParam float[] res)
	{
		float aabb1MinX = aabb1Min.x();
		float aabb1MinY = aabb1Min.y();
		float aabb1MaxX = aabb1Max[0];
		float aabb1MaxY = aabb1Max[1];
		
		float aabb2MinX = aabb2Min[0];
		float aabb2MinY = aabb2Min[1];
		
		float newMinX = MathUtils.min(aabb1MinX, aabb1MaxX, aabb2MinX, aabb2MaxX);
		float newMinY = MathUtils.min(aabb1MinY, aabb1MaxY, aabb2MinY, aabb2MaxY);
		float newMaxX = MathUtils.max(aabb1MinX, aabb1MaxX, aabb2MaxX, aabb2MaxX);
		float newMaxY = MathUtils.max(aabb1MinY, aabb1MaxY, aabb2MaxY, aabb2MaxY);
		
		res[0] = newMinX;
		res[1] = newMinY;
		res[2] = newMaxX;
		res[3] = newMaxY;
		
		return res;
	}
	
	public static float[] merge(IVec2RF aabb1Min, float[] aabb1Max, float aabb2MinX, float aabb2MinY, IVec2RF aabb2Max, @ExtractionParam float[] res)
	{
		float aabb1MinX = aabb1Min.x();
		float aabb1MinY = aabb1Min.y();
		float aabb1MaxX = aabb1Max[0];
		float aabb1MaxY = aabb1Max[1];
		
		float aabb2MaxX = aabb2Max.x();
		float aabb2MaxY = aabb2Max.y();
		
		float newMinX = MathUtils.min(aabb1MinX, aabb1MaxX, aabb2MinX, aabb2MaxX);
		float newMinY = MathUtils.min(aabb1MinY, aabb1MaxY, aabb2MinY, aabb2MaxY);
		float newMaxX = MathUtils.max(aabb1MinX, aabb1MaxX, aabb2MaxX, aabb2MaxX);
		float newMaxY = MathUtils.max(aabb1MinY, aabb1MaxY, aabb2MaxY, aabb2MaxY);
		
		res[0] = newMinX;
		res[1] = newMinY;
		res[3] = newMaxX;
		res[4] = newMaxY;
		
		return res;
	}

	public static float[] merge(IVec2RF aabb1Min, float[] aabb1Max, float aabb2MinX, float aabb2MinY, float[] aabb2Max, @ExtractionParam float[] res)
	{
		float aabb1MinX = aabb1Min.x();
		float aabb1MinY = aabb1Min.y();
		float aabb1MaxX = aabb1Max[0];
		float aabb1MaxY = aabb1Max[1];
		
		float aabb2MaxX = aabb2Max[0];
		float aabb2MaxY = aabb2Max[1];
		
		float newMinX = MathUtils.min(aabb1MinX, aabb1MaxX, aabb2MinX, aabb2MaxX);
		float newMinY = MathUtils.min(aabb1MinY, aabb1MaxY, aabb2MinY, aabb2MaxY);
		float newMaxX = MathUtils.max(aabb1MinX, aabb1MaxX, aabb2MaxX, aabb2MaxX);
		float newMaxY = MathUtils.max(aabb1MinY, aabb1MaxY, aabb2MaxY, aabb2MaxY);
		
		res[0] = newMinX;
		res[1] = newMinY;
		res[2] = newMaxX;
		res[3] = newMaxY;
		
		return res;
	}
	
	public static float[] merge(IVec2RF aabb1Min, float[] aabb1Max, float aabb2MinX, float aabb2MinY, float aabb2MaxX, float aabb2MaxY, @ExtractionParam float[] res)
	{
		float aabb1MinX = aabb1Min.x();
		float aabb1MinY = aabb1Min.y();
		float aabb1MaxX = aabb1Max[0];
		float aabb1MaxY = aabb1Max[1];
		
		float newMinX = MathUtils.min(aabb1MinX, aabb1MaxX, aabb2MinX, aabb2MaxX);
		float newMinY = MathUtils.min(aabb1MinY, aabb1MaxY, aabb2MinY, aabb2MaxY);
		float newMaxX = MathUtils.max(aabb1MinX, aabb1MaxX, aabb2MaxX, aabb2MaxX);
		float newMaxY = MathUtils.max(aabb1MinY, aabb1MaxY, aabb2MaxY, aabb2MaxY);
		
		res[0] = newMinX;
		res[1] = newMinY;
		res[2] = newMaxX;
		res[3] = newMaxY;
		
		return res;
	}
	
	public static float[] merge(IVec2RF aabb1Min, float aabb1MaxX, float aabb1MaxY, IVec2RF aabb2Min, float aabb2MaxX, float aabb2MaxY, @ExtractionParam float[] res)
	{
		float aabb1MinX = aabb1Min.x();
		float aabb1MinY = aabb1Min.y();
		
		float aabb2MinX = aabb2Min.x();
		float aabb2MinY = aabb2Min.y();
		
		float newMinX = MathUtils.min(aabb1MinX, aabb1MaxX, aabb2MinX, aabb2MaxX);
		float newMinY = MathUtils.min(aabb1MinY, aabb1MaxY, aabb2MinY, aabb2MaxY);
		float newMaxX = MathUtils.max(aabb1MinX, aabb1MaxX, aabb2MaxX, aabb2MaxX);
		float newMaxY = MathUtils.max(aabb1MinY, aabb1MaxY, aabb2MaxY, aabb2MaxY);
		
		res[0] = newMinX;
		res[1] = newMinY;
		res[2] = newMaxX;
		res[3] = newMaxY;
		
		return res;
	}
	
	public static float[] merge(IVec2RF aabb1Min, float aabb1MaxX, float aabb1MaxY, float[] aabb2Min, IVec2RF aabb2Max, @ExtractionParam float[] res)
	{
		float aabb1MinX = aabb1Min.x();
		float aabb1MinY = aabb1Min.y();
		
		float aabb2MinX = aabb2Min[0];
		float aabb2MinY = aabb2Min[1];
		float aabb2MaxX = aabb2Max.x();
		float aabb2MaxY = aabb2Max.y();
		
		float newMinX = MathUtils.min(aabb1MinX, aabb1MaxX, aabb2MinX, aabb2MaxX);
		float newMinY = MathUtils.min(aabb1MinY, aabb1MaxY, aabb2MinY, aabb2MaxY);
		float newMaxX = MathUtils.max(aabb1MinX, aabb1MaxX, aabb2MaxX, aabb2MaxX);
		float newMaxY = MathUtils.max(aabb1MinY, aabb1MaxY, aabb2MaxY, aabb2MaxY);
		
		res[0] = newMinX;
		res[1] = newMinY;
		res[2] = newMaxX;
		res[3] = newMaxY;
		
		return res;
	}

	public static float[] merge(IVec2RF aabb1Min, float aabb1MaxX, float aabb1MaxY, float[] aabb2Min, float[] aabb2Max, @ExtractionParam float[] res)
	{
		float aabb1MinX = aabb1Min.x();
		float aabb1MinY = aabb1Min.y();
		
		float aabb2MinX = aabb2Min[0];
		float aabb2MinY = aabb2Min[1];
		float aabb2MaxX = aabb2Max[0];
		float aabb2MaxY = aabb2Max[1];
		
		float newMinX = MathUtils.min(aabb1MinX, aabb1MaxX, aabb2MinX, aabb2MaxX);
		float newMinY = MathUtils.min(aabb1MinY, aabb1MaxY, aabb2MinY, aabb2MaxY);
		float newMaxX = MathUtils.max(aabb1MinX, aabb1MaxX, aabb2MaxX, aabb2MaxX);
		float newMaxY = MathUtils.max(aabb1MinY, aabb1MaxY, aabb2MaxY, aabb2MaxY);
		
		res[0] = newMinX;
		res[1] = newMinY;
		res[2] = newMaxX;
		res[3] = newMaxY;
		
		return res;
	}
	
	public static float[] merge(IVec2RF aabb1Min, float aabb1MaxX, float aabb1MaxY, float[] aabb2Min, float aabb2MaxX, float aabb2MaxY, @ExtractionParam float[] res)
	{
		float aabb1MinX = aabb1Min.x();
		float aabb1MinY = aabb1Min.y();
		
		float aabb2MinX = aabb2Min[0];
		float aabb2MinY = aabb2Min[1];
		
		float newMinX = MathUtils.min(aabb1MinX, aabb1MaxX, aabb2MinX, aabb2MaxX);
		float newMinY = MathUtils.min(aabb1MinY, aabb1MaxY, aabb2MinY, aabb2MaxY);
		float newMaxX = MathUtils.max(aabb1MinX, aabb1MaxX, aabb2MaxX, aabb2MaxX);
		float newMaxY = MathUtils.max(aabb1MinY, aabb1MaxY, aabb2MaxY, aabb2MaxY);
		
		res[0] = newMinX;
		res[1] = newMinY;
		res[2] = newMaxX;
		res[3] = newMaxY;
		
		return res;
	}
	
	public static float[] merge(IVec2RF aabb1Min, float aabb1MaxX, float aabb1MaxY, float aabb2MinX, float aabb2MinY, IVec2RF aabb2Max, @ExtractionParam float[] res)
	{
		float aabb1MinX = aabb1Min.x();
		float aabb1MinY = aabb1Min.y();
		
		float aabb2MaxX = aabb2Max.x();
		float aabb2MaxY = aabb2Max.y();
		
		float newMinX = MathUtils.min(aabb1MinX, aabb1MaxX, aabb2MinX, aabb2MaxX);
		float newMinY = MathUtils.min(aabb1MinY, aabb1MaxY, aabb2MinY, aabb2MaxY);
		float newMaxX = MathUtils.max(aabb1MinX, aabb1MaxX, aabb2MaxX, aabb2MaxX);
		float newMaxY = MathUtils.max(aabb1MinY, aabb1MaxY, aabb2MaxY, aabb2MaxY);
		
		res[0] = newMinX;
		res[1] = newMinY;
		res[2] = newMaxX;
		res[3] = newMaxY;
		
		return res;
	}

	public static float[] merge(IVec2RF aabb1Min, float aabb1MaxX, float aabb1MaxY, float aabb2MinX, float aabb2MinY, float[] aabb2Max, @ExtractionParam float[] res)
	{
		float aabb1MinX = aabb1Min.x();
		float aabb1MinY = aabb1Min.y();
		
		float aabb2MaxX = aabb2Max[0];
		float aabb2MaxY = aabb2Max[1];
		
		float newMinX = MathUtils.min(aabb1MinX, aabb1MaxX, aabb2MinX, aabb2MaxX);
		float newMinY = MathUtils.min(aabb1MinY, aabb1MaxY, aabb2MinY, aabb2MaxY);
		float newMaxX = MathUtils.max(aabb1MinX, aabb1MaxX, aabb2MaxX, aabb2MaxX);
		float newMaxY = MathUtils.max(aabb1MinY, aabb1MaxY, aabb2MaxY, aabb2MaxY);
		
		res[0] = newMinX;
		res[1] = newMinY;
		res[2] = newMaxX;
		res[3] = newMaxY;
		
		return res;
	}
	
	public static float[] merge(IVec2RF aabb1Min, float aabb1MaxX, float aabb1MaxY, float aabb2MinX, float aabb2MinY, float aabb2MaxX, float aabb2MaxY, @ExtractionParam float[] res)
	{
		float aabb1MinX = aabb1Min.x();
		float aabb1MinY = aabb1Min.y();
		
		float newMinX = MathUtils.min(aabb1MinX, aabb1MaxX, aabb2MinX, aabb2MaxX);
		float newMinY = MathUtils.min(aabb1MinY, aabb1MaxY, aabb2MinY, aabb2MaxY);
		float newMaxX = MathUtils.max(aabb1MinX, aabb1MaxX, aabb2MaxX, aabb2MaxX);
		float newMaxY = MathUtils.max(aabb1MinY, aabb1MaxY, aabb2MaxY, aabb2MaxY);
		
		res[0] = newMinX;
		res[1] = newMinY;
		res[2] = newMaxX;
		res[3] = newMaxY;
		
		return res;
	}
	
	public static float[] merge(float[] aabb1Min, IVec2RF aabb1Max, float[] aabb2Min, IVec2RF aabb2Max, @ExtractionParam float[] res)
	{
		float aabb1MinX = aabb1Min[0];
		float aabb1MinY = aabb1Min[1];
		float aabb1MaxX = aabb1Max.x();
		float aabb1MaxY = aabb1Max.y();
		
		float aabb2MinX = aabb2Min[0];
		float aabb2MinY = aabb2Min[1];
		float aabb2MaxX = aabb2Max.x();
		float aabb2MaxY = aabb2Max.y();
		
		float newMinX = MathUtils.min(aabb1MinX, aabb1MaxX, aabb2MinX, aabb2MaxX);
		float newMinY = MathUtils.min(aabb1MinY, aabb1MaxY, aabb2MinY, aabb2MaxY);
		float newMaxX = MathUtils.max(aabb1MinX, aabb1MaxX, aabb2MaxX, aabb2MaxX);
		float newMaxY = MathUtils.max(aabb1MinY, aabb1MaxY, aabb2MaxY, aabb2MaxY);
		
		res[0] = newMinX;
		res[1] = newMinY;
		res[2] = newMaxX;
		res[3] = newMaxY;
		
		return res;
	}

	public static float[] merge(float[] aabb1Min, IVec2RF aabb1Max, float[] aabb2Min, float[] aabb2Max, @ExtractionParam float[] res)
	{
		float aabb1MinX = aabb1Min[0];
		float aabb1MinY = aabb1Min[1];
		float aabb1MaxX = aabb1Max.x();
		float aabb1MaxY = aabb1Max.y();
		
		float aabb2MinX = aabb2Min[0];
		float aabb2MinY = aabb2Min[1];
		float aabb2MaxX = aabb2Max[0];
		float aabb2MaxY = aabb2Max[1];
		
		float newMinX = MathUtils.min(aabb1MinX, aabb1MaxX, aabb2MinX, aabb2MaxX);
		float newMinY = MathUtils.min(aabb1MinY, aabb1MaxY, aabb2MinY, aabb2MaxY);
		float newMaxX = MathUtils.max(aabb1MinX, aabb1MaxX, aabb2MaxX, aabb2MaxX);
		float newMaxY = MathUtils.max(aabb1MinY, aabb1MaxY, aabb2MaxY, aabb2MaxY);
		
		res[0] = newMinX;
		res[1] = newMinY;
		res[2] = newMaxX;
		res[3] = newMaxY;
		
		return res;
	}
	
	public static float[] merge(float[] aabb1Min, IVec2RF aabb1Max, float[] aabb2Min, float aabb2MaxX, float aabb2MaxY, @ExtractionParam float[] res)
	{
		float aabb1MinX = aabb1Min[0];
		float aabb1MinY = aabb1Min[1];
		float aabb1MaxX = aabb1Max.x();
		float aabb1MaxY = aabb1Max.y();
		
		float aabb2MinX = aabb2Min[0];
		float aabb2MinY = aabb2Min[1];
		
		float newMinX = MathUtils.min(aabb1MinX, aabb1MaxX, aabb2MinX, aabb2MaxX);
		float newMinY = MathUtils.min(aabb1MinY, aabb1MaxY, aabb2MinY, aabb2MaxY);
		float newMaxX = MathUtils.max(aabb1MinX, aabb1MaxX, aabb2MaxX, aabb2MaxX);
		float newMaxY = MathUtils.max(aabb1MinY, aabb1MaxY, aabb2MaxY, aabb2MaxY);
		
		res[0] = newMinX;
		res[1] = newMinY;
		res[2] = newMaxX;
		res[3] = newMaxY;
		
		return res;
	}
	
	public static float[] merge(float[] aabb1Min, IVec2RF aabb1Max, float aabb2MinX, float aabb2MinY, IVec2RF aabb2Max, @ExtractionParam float[] res)
	{
		float aabb1MinX = aabb1Min[0];
		float aabb1MinY = aabb1Min[1];
		float aabb1MaxX = aabb1Max.x();
		float aabb1MaxY = aabb1Max.y();
		
		float aabb2MaxX = aabb2Max.x();
		float aabb2MaxY = aabb2Max.y();
		
		float newMinX = MathUtils.min(aabb1MinX, aabb1MaxX, aabb2MinX, aabb2MaxX);
		float newMinY = MathUtils.min(aabb1MinY, aabb1MaxY, aabb2MinY, aabb2MaxY);
		float newMaxX = MathUtils.max(aabb1MinX, aabb1MaxX, aabb2MaxX, aabb2MaxX);
		float newMaxY = MathUtils.max(aabb1MinY, aabb1MaxY, aabb2MaxY, aabb2MaxY);
		
		res[0] = newMinX;
		res[1] = newMinY;
		res[2] = newMaxX;
		res[3] = newMaxY;
		
		return res;
	}

	public static float[] merge(float[] aabb1Min, IVec2RF aabb1Max, float aabb2MinX, float aabb2MinY, float[] aabb2Max, @ExtractionParam float[] res)
	{
		float aabb1MinX = aabb1Min[0];
		float aabb1MinY = aabb1Min[1];
		float aabb1MaxX = aabb1Max.x();
		float aabb1MaxY = aabb1Max.y();
		
		float aabb2MaxX = aabb2Max[0];
		float aabb2MaxY = aabb2Max[1];
		
		float newMinX = MathUtils.min(aabb1MinX, aabb1MaxX, aabb2MinX, aabb2MaxX);
		float newMinY = MathUtils.min(aabb1MinY, aabb1MaxY, aabb2MinY, aabb2MaxY);
		float newMaxX = MathUtils.max(aabb1MinX, aabb1MaxX, aabb2MaxX, aabb2MaxX);
		float newMaxY = MathUtils.max(aabb1MinY, aabb1MaxY, aabb2MaxY, aabb2MaxY);
		
		res[0] = newMinX;
		res[1] = newMinY;
		res[2] = newMaxX;
		res[3] = newMaxY;
		
		return res;
	}
	
	public static float[] merge(float[] aabb1Min, IVec2RF aabb1Max, float aabb2MinX, float aabb2MinY, float aabb2MaxX, float aabb2MaxY, @ExtractionParam float[] res)
	{
		float aabb1MinX = aabb1Min[0];
		float aabb1MinY = aabb1Min[1];
		float aabb1MaxX = aabb1Max.x();
		float aabb1MaxY = aabb1Max.y();
		
		float newMinX = MathUtils.min(aabb1MinX, aabb1MaxX, aabb2MinX, aabb2MaxX);
		float newMinY = MathUtils.min(aabb1MinY, aabb1MaxY, aabb2MinY, aabb2MaxY);
		float newMaxX = MathUtils.max(aabb1MinX, aabb1MaxX, aabb2MaxX, aabb2MaxX);
		float newMaxY = MathUtils.max(aabb1MinY, aabb1MaxY, aabb2MaxY, aabb2MaxY);
		
		res[0] = newMinX;
		res[1] = newMinY;
		res[2] = newMaxX;
		res[3] = newMaxY;
		
		return res;
	}
	
	public static float[] merge(float[] aabb1Min, float[] aabb1Max, IVec2RF aabb2Min, IVec2RF aabb2Max, @ExtractionParam float[] res)
	{
		float aabb1MinX = aabb1Min[0];
		float aabb1MinY = aabb1Min[1];
		float aabb1MaxX = aabb1Max[0];
		float aabb1MaxY = aabb1Max[1];
		
		float aabb2MinX = aabb2Min.x();
		float aabb2MinY = aabb2Min.y();
		float aabb2MaxX = aabb2Max.x();
		float aabb2MaxY = aabb2Max.y();
		
		float newMinX = MathUtils.min(aabb1MinX, aabb1MaxX, aabb2MinX, aabb2MaxX);
		float newMinY = MathUtils.min(aabb1MinY, aabb1MaxY, aabb2MinY, aabb2MaxY);
		float newMaxX = MathUtils.max(aabb1MinX, aabb1MaxX, aabb2MaxX, aabb2MaxX);
		float newMaxY = MathUtils.max(aabb1MinY, aabb1MaxY, aabb2MaxY, aabb2MaxY);
		
		res[0] = newMinX;
		res[1] = newMinY;
		res[2] = newMaxX;
		res[3] = newMaxY;
		
		return res;
	}
	
	public static float[] merge(float[] aabb1Min, float[] aabb1Max, float aabb2MinX, float aabb2MinY, IVec2RF aabb2Max, @ExtractionParam float[] res)
	{
		float aabb1MinX = aabb1Min[0];
		float aabb1MinY = aabb1Min[1];
		float aabb1MaxX = aabb1Max[0];
		float aabb1MaxY = aabb1Max[1];
		
		float aabb2MaxX = aabb2Max.x();
		float aabb2MaxY = aabb2Max.y();
		
		float newMinX = MathUtils.min(aabb1MinX, aabb1MaxX, aabb2MinX, aabb2MaxX);
		float newMinY = MathUtils.min(aabb1MinY, aabb1MaxY, aabb2MinY, aabb2MaxY);
		float newMaxX = MathUtils.max(aabb1MinX, aabb1MaxX, aabb2MaxX, aabb2MaxX);
		float newMaxY = MathUtils.max(aabb1MinY, aabb1MaxY, aabb2MaxY, aabb2MaxY);
		
		res[0] = newMinX;
		res[1] = newMinY;
		res[2] = newMaxX;
		res[3] = newMaxY;
		
		return res;
	}
	
	public static float[] merge(float[] aabb1Min, float aabb1MaxX, float aabb1MaxY, float aabb2MinX, float aabb2MinY, IVec2RF aabb2Max, @ExtractionParam float[] res)
	{
		float aabb1MinX = aabb1Min[0];
		float aabb1MinY = aabb1Min[1];
		
		float aabb2MaxX = aabb2Max.x();
		float aabb2MaxY = aabb2Max.y();
		
		float newMinX = MathUtils.min(aabb1MinX, aabb1MaxX, aabb2MinX, aabb2MaxX);
		float newMinY = MathUtils.min(aabb1MinY, aabb1MaxY, aabb2MinY, aabb2MaxY);
		float newMaxX = MathUtils.max(aabb1MinX, aabb1MaxX, aabb2MaxX, aabb2MaxX);
		float newMaxY = MathUtils.max(aabb1MinY, aabb1MaxY, aabb2MaxY, aabb2MaxY);
		
		res[0] = newMinX;
		res[1] = newMinY;
		res[2] = newMaxX;
		res[3] = newMaxY;
		
		return res;
	}
	
	public static float[] merge(float aabb1MinX, float aabb1MinY, IVec2RF aabb1Max, float aabb2MinX, float aabb2MinY, IVec2RF aabb2Max, @ExtractionParam float[] res)
	{
		float aabb1MaxX = aabb1Max.x();
		float aabb1MaxY = aabb1Max.y();
		
		float aabb2MaxX = aabb2Max.x();
		float aabb2MaxY = aabb2Max.y();
		
		float newMinX = MathUtils.min(aabb1MinX, aabb1MaxX, aabb2MinX, aabb2MaxX);
		float newMinY = MathUtils.min(aabb1MinY, aabb1MaxY, aabb2MinY, aabb2MaxY);
		float newMaxX = MathUtils.max(aabb1MinX, aabb1MaxX, aabb2MaxX, aabb2MaxX);
		float newMaxY = MathUtils.max(aabb1MinY, aabb1MaxY, aabb2MaxY, aabb2MaxY);
		
		res[0] = newMinX;
		res[1] = newMinY;
		res[2] = newMaxX;
		res[3] = newMaxY;
		
		return res;
	}

	public static float[] merge(float aabb1MinX, float aabb1MinY, IVec2RF aabb1Max, float aabb2MinX, float aabb2MinY, float[] aabb2Max, @ExtractionParam float[] res)
	{
		float aabb1MaxX = aabb1Max.x();
		float aabb1MaxY = aabb1Max.y();
		
		float aabb2MaxX = aabb2Max[0];
		float aabb2MaxY = aabb2Max[1];
		
		float newMinX = MathUtils.min(aabb1MinX, aabb1MaxX, aabb2MinX, aabb2MaxX);
		float newMinY = MathUtils.min(aabb1MinY, aabb1MaxY, aabb2MinY, aabb2MaxY);
		float newMaxX = MathUtils.max(aabb1MinX, aabb1MaxX, aabb2MaxX, aabb2MaxX);
		float newMaxY = MathUtils.max(aabb1MinY, aabb1MaxY, aabb2MaxY, aabb2MaxY);
		
		res[0] = newMinX;
		res[1] = newMinY;
		res[2] = newMaxX;
		res[3] = newMaxY;
		
		return res;
	}
	
	public static float[] merge(float aabb1MinX, float aabb1MinY, IVec2RF aabb1Max, float aabb2MinX, float aabb2MinY, float aabb2MaxX, float aabb2MaxY, @ExtractionParam float[] res)
	{
		float aabb1MaxX = aabb1Max.x();
		float aabb1MaxY = aabb1Max.y();
		
		float newMinX = MathUtils.min(aabb1MinX, aabb1MaxX, aabb2MinX, aabb2MaxX);
		float newMinY = MathUtils.min(aabb1MinY, aabb1MaxY, aabb2MinY, aabb2MaxY);
		float newMaxX = MathUtils.max(aabb1MinX, aabb1MaxX, aabb2MaxX, aabb2MaxX);
		float newMaxY = MathUtils.max(aabb1MinY, aabb1MaxY, aabb2MaxY, aabb2MaxY);
		
		res[0] = newMinX;
		res[1] = newMinY;
		res[2] = newMaxX;
		res[3] = newMaxY;
		
		return res;
	}
	
	public static float[] mergeAssign(@ExtractionParam float[] aabb1, IAabb2RF aabb2)
	{
		float aabb1MinX = aabb1[0];
		float aabb1MinY = aabb1[1];
		float aabb1MaxX = aabb1[2];
		float aabb1MaxY = aabb1[3];
		
		float aabb2MinX = aabb2.minX();
		float aabb2MinY = aabb2.minY();
		float aabb2MaxX = aabb2.maxX();
		float aabb2MaxY = aabb2.maxY();
		
		float newMinX = MathUtils.min(aabb1MinX, aabb1MaxX, aabb2MinX, aabb2MaxX);
		float newMinY = MathUtils.min(aabb1MinY, aabb1MaxY, aabb2MinY, aabb2MaxY);
		float newMaxX = MathUtils.max(aabb1MinX, aabb1MaxX, aabb2MaxX, aabb2MaxX);
		float newMaxY = MathUtils.max(aabb1MinY, aabb1MaxY, aabb2MaxY, aabb2MaxY);
		
		aabb1[0] = newMinX;
		aabb1[1] = newMinY;
		aabb1[2] = newMaxX;
		aabb1[3] = newMaxY;
		
		return aabb1;
	}
	
	public static float[] mergeAssign(@ExtractionParam float[] aabb1, IVec2RF aabb2Min, IVec2RF aabb2Max)
	{
		float aabb1MinX = aabb1[0];
		float aabb1MinY = aabb1[1];
		float aabb1MaxX = aabb1[2];
		float aabb1MaxY = aabb1[3];
		
		float aabb2MinX = aabb2Min.x();
		float aabb2MinY = aabb2Min.y();
		float aabb2MaxX = aabb2Max.x();
		float aabb2MaxY = aabb2Max.y();
		
		float newMinX = MathUtils.min(aabb1MinX, aabb1MaxX, aabb2MinX, aabb2MaxX);
		float newMinY = MathUtils.min(aabb1MinY, aabb1MaxY, aabb2MinY, aabb2MaxY);
		float newMaxX = MathUtils.max(aabb1MinX, aabb1MaxX, aabb2MaxX, aabb2MaxX);
		float newMaxY = MathUtils.max(aabb1MinY, aabb1MaxY, aabb2MaxY, aabb2MaxY);
		
		aabb1[0] = newMinX;
		aabb1[1] = newMinY;
		aabb1[2] = newMaxX;
		aabb1[3] = newMaxY;
		
		return aabb1;
	}
	
	public static float[] mergeAssign(@ExtractionParam float[] aabb1, IVec2RF aabb2Min, float[] aabb2Max)
	{
		float aabb1MinX = aabb1[0];
		float aabb1MinY = aabb1[1];
		float aabb1MaxX = aabb1[2];
		float aabb1MaxY = aabb1[3];
		
		float aabb2MinX = aabb2Min.x();
		float aabb2MinY = aabb2Min.y();
		float aabb2MaxX = aabb2Max[0];
		float aabb2MaxY = aabb2Max[1];
		
		float newMinX = MathUtils.min(aabb1MinX, aabb1MaxX, aabb2MinX, aabb2MaxX);
		float newMinY = MathUtils.min(aabb1MinY, aabb1MaxY, aabb2MinY, aabb2MaxY);
		float newMaxX = MathUtils.max(aabb1MinX, aabb1MaxX, aabb2MaxX, aabb2MaxX);
		float newMaxY = MathUtils.max(aabb1MinY, aabb1MaxY, aabb2MaxY, aabb2MaxY);
		
		aabb1[0] = newMinX;
		aabb1[1] = newMinY;
		aabb1[2] = newMaxX;
		aabb1[3] = newMaxY;
		
		return aabb1;
	}
	
	public static float[] mergeAssign(@ExtractionParam float[] aabb1, IVec2RF aabb2Min, float aabb2MaxX, float aabb2MaxY)
	{
		float aabb1MinX = aabb1[0];
		float aabb1MinY = aabb1[1];
		float aabb1MaxX = aabb1[2];
		float aabb1MaxY = aabb1[3];
		
		float aabb2MinX = aabb2Min.x();
		float aabb2MinY = aabb2Min.y();
		
		float newMinX = MathUtils.min(aabb1MinX, aabb1MaxX, aabb2MinX, aabb2MaxX);
		float newMinY = MathUtils.min(aabb1MinY, aabb1MaxY, aabb2MinY, aabb2MaxY);
		float newMaxX = MathUtils.max(aabb1MinX, aabb1MaxX, aabb2MaxX, aabb2MaxX);
		float newMaxY = MathUtils.max(aabb1MinY, aabb1MaxY, aabb2MaxY, aabb2MaxY);
		
		aabb1[0] = newMinX;
		aabb1[1] = newMinY;
		aabb1[2] = newMaxX;
		aabb1[3] = newMaxY;
		
		return aabb1;
	}
	
	public static float[] mergeAssign(@ExtractionParam float[] aabb1, float[] aabb2Min, IVec2RF aabb2Max)
	{
		float aabb1MinX = aabb1[0];
		float aabb1MinY = aabb1[1];
		float aabb1MaxX = aabb1[2];
		float aabb1MaxY = aabb1[3];
		
		float aabb2MinX = aabb2Min[0];
		float aabb2MinY = aabb2Min[1];
		float aabb2MaxX = aabb2Max.x();
		float aabb2MaxY = aabb2Max.y();
		
		float newMinX = MathUtils.min(aabb1MinX, aabb1MaxX, aabb2MinX, aabb2MaxX);
		float newMinY = MathUtils.min(aabb1MinY, aabb1MaxY, aabb2MinY, aabb2MaxY);
		float newMaxX = MathUtils.max(aabb1MinX, aabb1MaxX, aabb2MaxX, aabb2MaxX);
		float newMaxY = MathUtils.max(aabb1MinY, aabb1MaxY, aabb2MaxY, aabb2MaxY);
		
		aabb1[0] = newMinX;
		aabb1[1] = newMinY;
		aabb1[2] = newMaxX;
		aabb1[3] = newMaxY;
		
		return aabb1;
	}
	
	public static float[] mergeAssign(@ExtractionParam float[] aabb1, float aabb2MinX, float aabb2MinY, IVec2RF aabb2Max)
	{
		float aabb1MinX = aabb1[0];
		float aabb1MinY = aabb1[1];
		float aabb1MaxX = aabb1[2];
		float aabb1MaxY = aabb1[3];
		
		float aabb2MaxX = aabb2Max.x();
		float aabb2MaxY = aabb2Max.y();
		
		float newMinX = MathUtils.min(aabb1MinX, aabb1MaxX, aabb2MinX, aabb2MaxX);
		float newMinY = MathUtils.min(aabb1MinY, aabb1MaxY, aabb2MinY, aabb2MaxY);
		float newMaxX = MathUtils.max(aabb1MinX, aabb1MaxX, aabb2MaxX, aabb2MaxX);
		float newMaxY = MathUtils.max(aabb1MinY, aabb1MaxY, aabb2MaxY, aabb2MaxY);
		
		aabb1[0] = newMinX;
		aabb1[1] = newMinY;
		aabb1[2] = newMaxX;
		aabb1[3] = newMaxY;
		
		return aabb1;
	}
	
	public static <T extends IAabb2WF> T merge(IAabb2RF aabb1, IAabb2RF aabb2, @ExtractionParam T res)
	{
		float aabb1MinX = aabb1.minX();
		float aabb1MinY = aabb1.minY();
		float aabb1MaxX = aabb1.maxX();
		float aabb1MaxY = aabb1.maxY();
		
		float aabb2MinX = aabb2.minX();
		float aabb2MinY = aabb2.minY();
		float aabb2MaxX = aabb2.maxX();
		float aabb2MaxY = aabb2.maxY();
		
		float newMinX = MathUtils.min(aabb1MinX, aabb1MaxX, aabb2MinX, aabb2MaxX);
		float newMinY = MathUtils.min(aabb1MinY, aabb1MaxY, aabb2MinY, aabb2MaxY);
		float newMaxX = MathUtils.max(aabb1MinX, aabb1MaxX, aabb2MaxX, aabb2MaxX);
		float newMaxY = MathUtils.max(aabb1MinY, aabb1MaxY, aabb2MaxY, aabb2MaxY);
		
		res.set(newMinX, newMinY, newMaxX, newMaxY);
		
		return res;
	}
	
	public static <T extends IAabb2WF> T merge(IAabb2RF aabb1, float[] aabb2, @ExtractionParam T res)
	{
		float aabb1MinX = aabb1.minX();
		float aabb1MinY = aabb1.minY();
		float aabb1MaxX = aabb1.maxX();
		float aabb1MaxY = aabb1.maxY();
		
		float aabb2MinX = aabb2[0];
		float aabb2MinY = aabb2[1];
		float aabb2MaxX = aabb2[2];
		float aabb2MaxY = aabb2[3];
		
		float newMinX = MathUtils.min(aabb1MinX, aabb1MaxX, aabb2MinX, aabb2MaxX);
		float newMinY = MathUtils.min(aabb1MinY, aabb1MaxY, aabb2MinY, aabb2MaxY);
		float newMaxX = MathUtils.max(aabb1MinX, aabb1MaxX, aabb2MaxX, aabb2MaxX);
		float newMaxY = MathUtils.max(aabb1MinY, aabb1MaxY, aabb2MaxY, aabb2MaxY);
		
		res.set(newMinX, newMinY, newMaxX, newMaxY);
		
		return res;
	}
	
	public static <T extends IAabb2WF> T merge(IAabb2RF aabb1, IVec2RF aabb2Min, IVec2RF aabb2Max, @ExtractionParam T res)
	{
		float aabb1MinX = aabb1.minX();
		float aabb1MinY = aabb1.minY();
		float aabb1MaxX = aabb1.maxX();
		float aabb1MaxY = aabb1.maxY();
		
		float aabb2MinX = aabb2Min.x();
		float aabb2MinY = aabb2Min.y();
		float aabb2MaxX = aabb2Max.x();
		float aabb2MaxY = aabb2Max.y();
		
		float newMinX = MathUtils.min(aabb1MinX, aabb1MaxX, aabb2MinX, aabb2MaxX);
		float newMinY = MathUtils.min(aabb1MinY, aabb1MaxY, aabb2MinY, aabb2MaxY);
		float newMaxX = MathUtils.max(aabb1MinX, aabb1MaxX, aabb2MaxX, aabb2MaxX);
		float newMaxY = MathUtils.max(aabb1MinY, aabb1MaxY, aabb2MaxY, aabb2MaxY);
		
		res.set(newMinX, newMinY, newMaxX, newMaxY);
		
		return res;
	}
	
	public static <T extends IAabb2WF> T merge(IAabb2RF aabb1, IVec2RF aabb2Min, float[] aabb2Max, @ExtractionParam T res)
	{
		float aabb1MinX = aabb1.minX();
		float aabb1MinY = aabb1.minY();
		float aabb1MaxX = aabb1.maxX();
		float aabb1MaxY = aabb1.maxY();
		
		float aabb2MinX = aabb2Min.x();
		float aabb2MinY = aabb2Min.y();
		float aabb2MaxX = aabb2Max[0];
		float aabb2MaxY = aabb2Max[1];
		
		float newMinX = MathUtils.min(aabb1MinX, aabb1MaxX, aabb2MinX, aabb2MaxX);
		float newMinY = MathUtils.min(aabb1MinY, aabb1MaxY, aabb2MinY, aabb2MaxY);
		float newMaxX = MathUtils.max(aabb1MinX, aabb1MaxX, aabb2MaxX, aabb2MaxX);
		float newMaxY = MathUtils.max(aabb1MinY, aabb1MaxY, aabb2MaxY, aabb2MaxY);
		
		res.set(newMinX, newMinY, newMaxX, newMaxY);
		
		return res;
	}
	
	public static <T extends IAabb2WF> T merge(IAabb2RF aabb1, IVec2RF aabb2Min, float aabb2MaxX, float aabb2MaxY, @ExtractionParam T res)
	{
		float aabb1MinX = aabb1.minX();
		float aabb1MinY = aabb1.minY();
		float aabb1MaxX = aabb1.maxX();
		float aabb1MaxY = aabb1.maxY();
		
		float aabb2MinX = aabb2Min.x();
		float aabb2MinY = aabb2Min.y();
		
		float newMinX = MathUtils.min(aabb1MinX, aabb1MaxX, aabb2MinX, aabb2MaxX);
		float newMinY = MathUtils.min(aabb1MinY, aabb1MaxY, aabb2MinY, aabb2MaxY);
		float newMaxX = MathUtils.max(aabb1MinX, aabb1MaxX, aabb2MaxX, aabb2MaxX);
		float newMaxY = MathUtils.max(aabb1MinY, aabb1MaxY, aabb2MaxY, aabb2MaxY);
		
		res.set(newMinX, newMinY, newMaxX, newMaxY);
		
		return res;
	}
	
	public static <T extends IAabb2WF> T merge(IAabb2RF aabb1, float[] aabb2Min, IVec2RF aabb2Max, @ExtractionParam T res)
	{
		float aabb1MinX = aabb1.minX();
		float aabb1MinY = aabb1.minY();
		float aabb1MaxX = aabb1.maxX();
		float aabb1MaxY = aabb1.maxY();
		
		float aabb2MinX = aabb2Min[0];
		float aabb2MinY = aabb2Min[1];
		float aabb2MaxX = aabb2Max.x();
		float aabb2MaxY = aabb2Max.y();
		
		float newMinX = MathUtils.min(aabb1MinX, aabb1MaxX, aabb2MinX, aabb2MaxX);
		float newMinY = MathUtils.min(aabb1MinY, aabb1MaxY, aabb2MinY, aabb2MaxY);
		float newMaxX = MathUtils.max(aabb1MinX, aabb1MaxX, aabb2MaxX, aabb2MaxX);
		float newMaxY = MathUtils.max(aabb1MinY, aabb1MaxY, aabb2MaxY, aabb2MaxY);
		
		res.set(newMinX, newMinY, newMaxX, newMaxY);
		
		return res;
	}
	
	public static <T extends IAabb2WF> T merge(IAabb2RF aabb1, float[] aabb2Min, float[] aabb2Max, @ExtractionParam T res)
	{
		float aabb1MinX = aabb1.minX();
		float aabb1MinY = aabb1.minY();
		float aabb1MaxX = aabb1.maxX();
		float aabb1MaxY = aabb1.maxY();
		
		float aabb2MinX = aabb2Min[0];
		float aabb2MinY = aabb2Min[1];
		float aabb2MaxX = aabb2Max[0];
		float aabb2MaxY = aabb2Max[1];
		
		float newMinX = MathUtils.min(aabb1MinX, aabb1MaxX, aabb2MinX, aabb2MaxX);
		float newMinY = MathUtils.min(aabb1MinY, aabb1MaxY, aabb2MinY, aabb2MaxY);
		float newMaxX = MathUtils.max(aabb1MinX, aabb1MaxX, aabb2MaxX, aabb2MaxX);
		float newMaxY = MathUtils.max(aabb1MinY, aabb1MaxY, aabb2MaxY, aabb2MaxY);
		
		res.set(newMinX, newMinY, newMaxX, newMaxY);
		
		return res;
	}
	
	public static <T extends IAabb2WF> T merge(IAabb2RF aabb1, float[] aabb2Min, float aabb2MaxX, float aabb2MaxY, @ExtractionParam T res)
	{
		float aabb1MinX = aabb1.minX();
		float aabb1MinY = aabb1.minY();
		float aabb1MaxX = aabb1.maxX();
		float aabb1MaxY = aabb1.maxY();
		
		float aabb2MinX = aabb2Min[0];
		float aabb2MinY = aabb2Min[1];
		
		float newMinX = MathUtils.min(aabb1MinX, aabb1MaxX, aabb2MinX, aabb2MaxX);
		float newMinY = MathUtils.min(aabb1MinY, aabb1MaxY, aabb2MinY, aabb2MaxY);
		float newMaxX = MathUtils.max(aabb1MinX, aabb1MaxX, aabb2MaxX, aabb2MaxX);
		float newMaxY = MathUtils.max(aabb1MinY, aabb1MaxY, aabb2MaxY, aabb2MaxY);
		
		res.set(newMinX, newMinY, newMaxX, newMaxY);
		
		return res;
	}
	
	public static <T extends IAabb2WF> T merge(IAabb2RF aabb1, float aabb2MinX, float aabb2MinY, IVec2RF aabb2Max, @ExtractionParam T res)
	{
		float aabb1MinX = aabb1.minX();
		float aabb1MinY = aabb1.minY();
		float aabb1MaxX = aabb1.maxX();
		float aabb1MaxY = aabb1.maxY();
		
		float aabb2MaxX = aabb2Max.x();
		float aabb2MaxY = aabb2Max.y();
		
		float newMinX = MathUtils.min(aabb1MinX, aabb1MaxX, aabb2MinX, aabb2MaxX);
		float newMinY = MathUtils.min(aabb1MinY, aabb1MaxY, aabb2MinY, aabb2MaxY);
		float newMaxX = MathUtils.max(aabb1MinX, aabb1MaxX, aabb2MaxX, aabb2MaxX);
		float newMaxY = MathUtils.max(aabb1MinY, aabb1MaxY, aabb2MaxY, aabb2MaxY);
		
		res.set(newMinX, newMinY, newMaxX, newMaxY);
		
		return res;
	}
	
	public static <T extends IAabb2WF> T merge(IAabb2RF aabb1, float aabb2MinX, float aabb2MinY, float[] aabb2Max, @ExtractionParam T res)
	{
		float aabb1MinX = aabb1.minX();
		float aabb1MinY = aabb1.minY();
		float aabb1MaxX = aabb1.maxX();
		float aabb1MaxY = aabb1.maxY();
		
		float aabb2MaxX = aabb2Max[0];
		float aabb2MaxY = aabb2Max[1];
		
		float newMinX = MathUtils.min(aabb1MinX, aabb1MaxX, aabb2MinX, aabb2MaxX);
		float newMinY = MathUtils.min(aabb1MinY, aabb1MaxY, aabb2MinY, aabb2MaxY);
		float newMaxX = MathUtils.max(aabb1MinX, aabb1MaxX, aabb2MaxX, aabb2MaxX);
		float newMaxY = MathUtils.max(aabb1MinY, aabb1MaxY, aabb2MaxY, aabb2MaxY);
		
		res.set(newMinX, newMinY, newMaxX, newMaxY);
		
		return res;
	}
	
	public static <T extends IAabb2WF> T merge(IAabb2RF aabb1, float aabb2MinX, float aabb2MinY, float aabb2MaxX, float aabb2MaxY, @ExtractionParam T res)
	{
		float aabb1MinX = aabb1.minX();
		float aabb1MinY = aabb1.minY();
		float aabb1MaxX = aabb1.maxX();
		float aabb1MaxY = aabb1.maxY();
		
		float newMinX = MathUtils.min(aabb1MinX, aabb1MaxX, aabb2MinX, aabb2MaxX);
		float newMinY = MathUtils.min(aabb1MinY, aabb1MaxY, aabb2MinY, aabb2MaxY);
		float newMaxX = MathUtils.max(aabb1MinX, aabb1MaxX, aabb2MaxX, aabb2MaxX);
		float newMaxY = MathUtils.max(aabb1MinY, aabb1MaxY, aabb2MaxY, aabb2MaxY);
		
		res.set(newMinX, newMinY, newMaxX, newMaxY);
		
		return res;
	}
	
	public static <T extends IAabb2WF> T merge(float[] aabb1, float[] aabb2, @ExtractionParam T res)
	{
		float aabb1MinX = aabb1[0];
		float aabb1MinY = aabb1[1];
		float aabb1MaxX = aabb1[2];
		float aabb1MaxY = aabb1[3];
		
		float aabb2MinX = aabb2[0];
		float aabb2MinY = aabb2[1];
		float aabb2MaxX = aabb2[2];
		float aabb2MaxY = aabb2[3];
		
		float newMinX = MathUtils.min(aabb1MinX, aabb1MaxX, aabb2MinX, aabb2MaxX);
		float newMinY = MathUtils.min(aabb1MinY, aabb1MaxY, aabb2MinY, aabb2MaxY);
		float newMaxX = MathUtils.max(aabb1MinX, aabb1MaxX, aabb2MaxX, aabb2MaxX);
		float newMaxY = MathUtils.max(aabb1MinY, aabb1MaxY, aabb2MaxY, aabb2MaxY);
		
		res.set(newMinX, newMinY, newMaxX, newMaxY);
		
		return res;
	}
	
	public static <T extends IAabb2WF> T merge(float[] aabb1, IVec2RF aabb2Min, IVec2RF aabb2Max, @ExtractionParam T res)
	{
		float aabb1MinX = aabb1[0];
		float aabb1MinY = aabb1[1];
		float aabb1MaxX = aabb1[2];
		float aabb1MaxY = aabb1[3];
		
		float aabb2MinX = aabb2Min.x();
		float aabb2MinY = aabb2Min.y();
		float aabb2MaxX = aabb2Max.x();
		float aabb2MaxY = aabb2Max.y();
		
		float newMinX = MathUtils.min(aabb1MinX, aabb1MaxX, aabb2MinX, aabb2MaxX);
		float newMinY = MathUtils.min(aabb1MinY, aabb1MaxY, aabb2MinY, aabb2MaxY);
		float newMaxX = MathUtils.max(aabb1MinX, aabb1MaxX, aabb2MaxX, aabb2MaxX);
		float newMaxY = MathUtils.max(aabb1MinY, aabb1MaxY, aabb2MaxY, aabb2MaxY);
		
		res.set(newMinX, newMinY, newMaxX, newMaxY);
		
		return res;
	}
	
	public static <T extends IAabb2WF> T merge(float[] aabb1, IVec2RF aabb2Min, float[] aabb2Max, @ExtractionParam T res)
	{
		float aabb1MinX = aabb1[0];
		float aabb1MinY = aabb1[1];
		float aabb1MaxX = aabb1[2];
		float aabb1MaxY = aabb1[3];
		
		float aabb2MinX = aabb2Min.x();
		float aabb2MinY = aabb2Min.y();
		float aabb2MaxX = aabb2Max[0];
		float aabb2MaxY = aabb2Max[1];
		
		float newMinX = MathUtils.min(aabb1MinX, aabb1MaxX, aabb2MinX, aabb2MaxX);
		float newMinY = MathUtils.min(aabb1MinY, aabb1MaxY, aabb2MinY, aabb2MaxY);
		float newMaxX = MathUtils.max(aabb1MinX, aabb1MaxX, aabb2MaxX, aabb2MaxX);
		float newMaxY = MathUtils.max(aabb1MinY, aabb1MaxY, aabb2MaxY, aabb2MaxY);
		
		res.set(newMinX, newMinY, newMaxX, newMaxY);
		
		return res;
	}
	
	public static <T extends IAabb2WF> T merge(float[] aabb1, IVec2RF aabb2Min, float aabb2MaxX, float aabb2MaxY, @ExtractionParam T res)
	{
		float aabb1MinX = aabb1[0];
		float aabb1MinY = aabb1[1];
		float aabb1MaxX = aabb1[2];
		float aabb1MaxY = aabb1[3];
		
		float aabb2MinX = aabb2Min.x();
		float aabb2MinY = aabb2Min.y();
		
		float newMinX = MathUtils.min(aabb1MinX, aabb1MaxX, aabb2MinX, aabb2MaxX);
		float newMinY = MathUtils.min(aabb1MinY, aabb1MaxY, aabb2MinY, aabb2MaxY);
		float newMaxX = MathUtils.max(aabb1MinX, aabb1MaxX, aabb2MaxX, aabb2MaxX);
		float newMaxY = MathUtils.max(aabb1MinY, aabb1MaxY, aabb2MaxY, aabb2MaxY);
		
		res.set(newMinX, newMinY, newMaxX, newMaxY);
		
		return res;
	}
	
	public static <T extends IAabb2WF> T merge(float[] aabb1, float[] aabb2Min, IVec2RF aabb2Max, @ExtractionParam T res)
	{
		float aabb1MinX = aabb1[0];
		float aabb1MinY = aabb1[1];
		float aabb1MaxX = aabb1[2];
		float aabb1MaxY = aabb1[3];
		
		float aabb2MinX = aabb2Min[0];
		float aabb2MinY = aabb2Min[1];
		float aabb2MaxX = aabb2Max.x();
		float aabb2MaxY = aabb2Max.y();
		
		float newMinX = MathUtils.min(aabb1MinX, aabb1MaxX, aabb2MinX, aabb2MaxX);
		float newMinY = MathUtils.min(aabb1MinY, aabb1MaxY, aabb2MinY, aabb2MaxY);
		float newMaxX = MathUtils.max(aabb1MinX, aabb1MaxX, aabb2MaxX, aabb2MaxX);
		float newMaxY = MathUtils.max(aabb1MinY, aabb1MaxY, aabb2MaxY, aabb2MaxY);
		
		res.set(newMinX, newMinY, newMaxX, newMaxY);
		
		return res;
	}
	
	public static <T extends IAabb2WF> T merge(float[] aabb1, float[] aabb2Min, float[] aabb2Max, @ExtractionParam T res)
	{
		float aabb1MinX = aabb1[0];
		float aabb1MinY = aabb1[1];
		float aabb1MaxX = aabb1[2];
		float aabb1MaxY = aabb1[3];
		
		float aabb2MinX = aabb2Min[0];
		float aabb2MinY = aabb2Min[1];
		float aabb2MaxX = aabb2Max[0];
		float aabb2MaxY = aabb2Max[1];
		
		float newMinX = MathUtils.min(aabb1MinX, aabb1MaxX, aabb2MinX, aabb2MaxX);
		float newMinY = MathUtils.min(aabb1MinY, aabb1MaxY, aabb2MinY, aabb2MaxY);
		float newMaxX = MathUtils.max(aabb1MinX, aabb1MaxX, aabb2MaxX, aabb2MaxX);
		float newMaxY = MathUtils.max(aabb1MinY, aabb1MaxY, aabb2MaxY, aabb2MaxY);
		
		res.set(newMinX, newMinY, newMaxX, newMaxY);
		
		return res;
	}
	
	public static <T extends IAabb2WF> T merge(float[] aabb1, float[] aabb2Min, float aabb2MaxX, float aabb2MaxY, @ExtractionParam T res)
	{
		float aabb1MinX = aabb1[0];
		float aabb1MinY = aabb1[1];
		float aabb1MaxX = aabb1[2];
		float aabb1MaxY = aabb1[3];
		
		float aabb2MinX = aabb2Min[0];
		float aabb2MinY = aabb2Min[1];
		
		float newMinX = MathUtils.min(aabb1MinX, aabb1MaxX, aabb2MinX, aabb2MaxX);
		float newMinY = MathUtils.min(aabb1MinY, aabb1MaxY, aabb2MinY, aabb2MaxY);
		float newMaxX = MathUtils.max(aabb1MinX, aabb1MaxX, aabb2MaxX, aabb2MaxX);
		float newMaxY = MathUtils.max(aabb1MinY, aabb1MaxY, aabb2MaxY, aabb2MaxY);
		
		res.set(newMinX, newMinY, newMaxX, newMaxY);
		
		return res;
	}
	
	public static <T extends IAabb2WF> T merge(float[] aabb1, float aabb2MinX, float aabb2MinY, IVec2RF aabb2Max, @ExtractionParam T res)
	{
		float aabb1MinX = aabb1[0];
		float aabb1MinY = aabb1[1];
		float aabb1MaxX = aabb1[2];
		float aabb1MaxY = aabb1[3];
		
		float aabb2MaxX = aabb2Max.x();
		float aabb2MaxY = aabb2Max.y();
		
		float newMinX = MathUtils.min(aabb1MinX, aabb1MaxX, aabb2MinX, aabb2MaxX);
		float newMinY = MathUtils.min(aabb1MinY, aabb1MaxY, aabb2MinY, aabb2MaxY);
		float newMaxX = MathUtils.max(aabb1MinX, aabb1MaxX, aabb2MaxX, aabb2MaxX);
		float newMaxY = MathUtils.max(aabb1MinY, aabb1MaxY, aabb2MaxY, aabb2MaxY);
		
		res.set(newMinX, newMinY, newMaxX, newMaxY);
		
		return res;
	}
	
	public static <T extends IAabb2WF> T merge(float[] aabb1, float aabb2MinX, float aabb2MinY, float[] aabb2Max, @ExtractionParam T res)
	{
		float aabb1MinX = aabb1[0];
		float aabb1MinY = aabb1[1];
		float aabb1MaxX = aabb1[2];
		float aabb1MaxY = aabb1[3];
		
		float aabb2MaxX = aabb2Max[0];
		float aabb2MaxY = aabb2Max[1];
		
		float newMinX = MathUtils.min(aabb1MinX, aabb1MaxX, aabb2MinX, aabb2MaxX);
		float newMinY = MathUtils.min(aabb1MinY, aabb1MaxY, aabb2MinY, aabb2MaxY);
		float newMaxX = MathUtils.max(aabb1MinX, aabb1MaxX, aabb2MaxX, aabb2MaxX);
		float newMaxY = MathUtils.max(aabb1MinY, aabb1MaxY, aabb2MaxY, aabb2MaxY);
		
		res.set(newMinX, newMinY, newMaxX, newMaxY);
		
		return res;
	}

	public static <T extends IAabb2WF> T merge(float[] aabb1, float aabb2MinX, float aabb2MinY, float aabb2MaxX, float aabb2MaxY,  @ExtractionParam T res)
	{
		float aabb1MinX = aabb1[0];
		float aabb1MinY = aabb1[1];
		float aabb1MaxX = aabb1[2];
		float aabb1MaxY = aabb1[3];
		
		float newMinX = MathUtils.min(aabb1MinX, aabb1MaxX, aabb2MinX, aabb2MaxX);
		float newMinY = MathUtils.min(aabb1MinY, aabb1MaxY, aabb2MinY, aabb2MaxY);
		float newMaxX = MathUtils.max(aabb1MinX, aabb1MaxX, aabb2MaxX, aabb2MaxX);
		float newMaxY = MathUtils.max(aabb1MinY, aabb1MaxY, aabb2MaxY, aabb2MaxY);
		
		res.set(newMinX, newMinY, newMaxX, newMaxY);
		
		return res;
	}
	
	public static <T extends IAabb2WF> T merge(IVec2RF aabb1Min, IVec2RF aabb1Max, IVec2RF aabb2Min, IVec2RF aabb2Max, @ExtractionParam T res)
	{
		float aabb1MinX = aabb1Min.x();
		float aabb1MinY = aabb1Min.y();
		float aabb1MaxX = aabb1Max.x();
		float aabb1MaxY = aabb1Max.y();
		
		float aabb2MinX = aabb2Min.x();
		float aabb2MinY = aabb2Min.y();
		float aabb2MaxX = aabb2Max.x();
		float aabb2MaxY = aabb2Max.y();
		
		float newMinX = MathUtils.min(aabb1MinX, aabb1MaxX, aabb2MinX, aabb2MaxX);
		float newMinY = MathUtils.min(aabb1MinY, aabb1MaxY, aabb2MinY, aabb2MaxY);
		float newMaxX = MathUtils.max(aabb1MinX, aabb1MaxX, aabb2MaxX, aabb2MaxX);
		float newMaxY = MathUtils.max(aabb1MinY, aabb1MaxY, aabb2MaxY, aabb2MaxY);
		
		res.set(newMinX, newMinY, newMaxX, newMaxY);
		
		return res;
	}
	
	public static <T extends IAabb2WF> T merge(IVec2RF aabb1Min, IVec2RF aabb1Max, IVec2RF aabb2Min, float[] aabb2Max, @ExtractionParam T res)
	{
		float aabb1MinX = aabb1Min.x();
		float aabb1MinY = aabb1Min.y();
		float aabb1MaxX = aabb1Max.x();
		float aabb1MaxY = aabb1Max.y();
		
		float aabb2MinX = aabb2Min.x();
		float aabb2MinY = aabb2Min.y();
		float aabb2MaxX = aabb2Max[0];
		float aabb2MaxY = aabb2Max[1];
		
		float newMinX = MathUtils.min(aabb1MinX, aabb1MaxX, aabb2MinX, aabb2MaxX);
		float newMinY = MathUtils.min(aabb1MinY, aabb1MaxY, aabb2MinY, aabb2MaxY);
		float newMaxX = MathUtils.max(aabb1MinX, aabb1MaxX, aabb2MaxX, aabb2MaxX);
		float newMaxY = MathUtils.max(aabb1MinY, aabb1MaxY, aabb2MaxY, aabb2MaxY);
		
		res.set(newMinX, newMinY, newMaxX, newMaxY);
		
		return res;
	}
	
	public static <T extends IAabb2WF> T merge(IVec2RF aabb1Min, IVec2RF aabb1Max, IVec2RF aabb2Min, float aabb2MaxX, float aabb2MaxY, @ExtractionParam T res)
	{
		float aabb1MinX = aabb1Min.x();
		float aabb1MinY = aabb1Min.y();
		float aabb1MaxX = aabb1Max.x();
		float aabb1MaxY = aabb1Max.y();
		
		float aabb2MinX = aabb2Min.x();
		float aabb2MinY = aabb2Min.y();
		
		float newMinX = MathUtils.min(aabb1MinX, aabb1MaxX, aabb2MinX, aabb2MaxX);
		float newMinY = MathUtils.min(aabb1MinY, aabb1MaxY, aabb2MinY, aabb2MaxY);
		float newMaxX = MathUtils.max(aabb1MinX, aabb1MaxX, aabb2MaxX, aabb2MaxX);
		float newMaxY = MathUtils.max(aabb1MinY, aabb1MaxY, aabb2MaxY, aabb2MaxY);
		
		res.set(newMinX, newMinY, newMaxX, newMaxY);
		
		return res;
	}
	
	public static <T extends IAabb2WF> T merge(IVec2RF aabb1Min, IVec2RF aabb1Max, float[] aabb2Min, IVec2RF aabb2Max, @ExtractionParam T res)
	{
		float aabb1MinX = aabb1Min.x();
		float aabb1MinY = aabb1Min.y();
		float aabb1MaxX = aabb1Max.x();
		float aabb1MaxY = aabb1Max.y();
		
		float aabb2MinX = aabb2Min[0];
		float aabb2MinY = aabb2Min[1];
		float aabb2MaxX = aabb2Max.x();
		float aabb2MaxY = aabb2Max.y();
		
		float newMinX = MathUtils.min(aabb1MinX, aabb1MaxX, aabb2MinX, aabb2MaxX);
		float newMinY = MathUtils.min(aabb1MinY, aabb1MaxY, aabb2MinY, aabb2MaxY);
		float newMaxX = MathUtils.max(aabb1MinX, aabb1MaxX, aabb2MaxX, aabb2MaxX);
		float newMaxY = MathUtils.max(aabb1MinY, aabb1MaxY, aabb2MaxY, aabb2MaxY);
		
		res.set(newMinX, newMinY, newMaxX, newMaxY);
		
		return res;
	}

	public static <T extends IAabb2WF> T merge(IVec2RF aabb1Min, IVec2RF aabb1Max, float[] aabb2Min, float[] aabb2Max, @ExtractionParam T res)
	{
		float aabb1MinX = aabb1Min.x();
		float aabb1MinY = aabb1Min.y();
		float aabb1MaxX = aabb1Max.x();
		float aabb1MaxY = aabb1Max.y();
		
		float aabb2MinX = aabb2Min[0];
		float aabb2MinY = aabb2Min[1];
		float aabb2MaxX = aabb2Max[0];
		float aabb2MaxY = aabb2Max[1];
		
		float newMinX = MathUtils.min(aabb1MinX, aabb1MaxX, aabb2MinX, aabb2MaxX);
		float newMinY = MathUtils.min(aabb1MinY, aabb1MaxY, aabb2MinY, aabb2MaxY);
		float newMaxX = MathUtils.max(aabb1MinX, aabb1MaxX, aabb2MaxX, aabb2MaxX);
		float newMaxY = MathUtils.max(aabb1MinY, aabb1MaxY, aabb2MaxY, aabb2MaxY);
		
		res.set(newMinX, newMinY, newMaxX, newMaxY);
		
		return res;
	}
	
	public static <T extends IAabb2WF> T merge(IVec2RF aabb1Min, IVec2RF aabb1Max, float[] aabb2Min, float aabb2MaxX, float aabb2MaxY, @ExtractionParam T res)
	{
		float aabb1MinX = aabb1Min.x();
		float aabb1MinY = aabb1Min.y();
		float aabb1MaxX = aabb1Max.x();
		float aabb1MaxY = aabb1Max.y();
		
		float aabb2MinX = aabb2Min[0];
		float aabb2MinY = aabb2Min[1];
		
		float newMinX = MathUtils.min(aabb1MinX, aabb1MaxX, aabb2MinX, aabb2MaxX);
		float newMinY = MathUtils.min(aabb1MinY, aabb1MaxY, aabb2MinY, aabb2MaxY);
		float newMaxX = MathUtils.max(aabb1MinX, aabb1MaxX, aabb2MaxX, aabb2MaxX);
		float newMaxY = MathUtils.max(aabb1MinY, aabb1MaxY, aabb2MaxY, aabb2MaxY);
		
		res.set(newMinX, newMinY, newMaxX, newMaxY);
		
		return res;
	}
	
	public static <T extends IAabb2WF> T merge(IVec2RF aabb1Min, IVec2RF aabb1Max, float aabb2MinX, float aabb2MinY, IVec2RF aabb2Max, @ExtractionParam T res)
	{
		float aabb1MinX = aabb1Min.x();
		float aabb1MinY = aabb1Min.y();
		float aabb1MaxX = aabb1Max.x();
		float aabb1MaxY = aabb1Max.y();
		
		float aabb2MaxX = aabb2Max.x();
		float aabb2MaxY = aabb2Max.y();
		
		float newMinX = MathUtils.min(aabb1MinX, aabb1MaxX, aabb2MinX, aabb2MaxX);
		float newMinY = MathUtils.min(aabb1MinY, aabb1MaxY, aabb2MinY, aabb2MaxY);
		float newMaxX = MathUtils.max(aabb1MinX, aabb1MaxX, aabb2MaxX, aabb2MaxX);
		float newMaxY = MathUtils.max(aabb1MinY, aabb1MaxY, aabb2MaxY, aabb2MaxY);
		
		res.set(newMinX, newMinY, newMaxX, newMaxY);
		
		return res;
	}

	public static <T extends IAabb2WF> T merge(IVec2RF aabb1Min, IVec2RF aabb1Max, float aabb2MinX, float aabb2MinY, float[] aabb2Max, @ExtractionParam T res)
	{
		float aabb1MinX = aabb1Min.x();
		float aabb1MinY = aabb1Min.y();
		float aabb1MaxX = aabb1Max.x();
		float aabb1MaxY = aabb1Max.y();
		
		float aabb2MaxX = aabb2Max[0];
		float aabb2MaxY = aabb2Max[1];
		
		float newMinX = MathUtils.min(aabb1MinX, aabb1MaxX, aabb2MinX, aabb2MaxX);
		float newMinY = MathUtils.min(aabb1MinY, aabb1MaxY, aabb2MinY, aabb2MaxY);
		float newMaxX = MathUtils.max(aabb1MinX, aabb1MaxX, aabb2MaxX, aabb2MaxX);
		float newMaxY = MathUtils.max(aabb1MinY, aabb1MaxY, aabb2MaxY, aabb2MaxY);
		
		res.set(newMinX, newMinY, newMaxX, newMaxY);
		
		return res;
	}
	
	public static <T extends IAabb2WF> T merge(IVec2RF aabb1Min, IVec2RF aabb1Max, float aabb2MinX, float aabb2MinY, float aabb2MaxX, float aabb2MaxY, @ExtractionParam T res)
	{
		float aabb1MinX = aabb1Min.x();
		float aabb1MinY = aabb1Min.y();
		float aabb1MaxX = aabb1Max.x();
		float aabb1MaxY = aabb1Max.y();
		
		float newMinX = MathUtils.min(aabb1MinX, aabb1MaxX, aabb2MinX, aabb2MaxX);
		float newMinY = MathUtils.min(aabb1MinY, aabb1MaxY, aabb2MinY, aabb2MaxY);
		float newMaxX = MathUtils.max(aabb1MinX, aabb1MaxX, aabb2MaxX, aabb2MaxX);
		float newMaxY = MathUtils.max(aabb1MinY, aabb1MaxY, aabb2MaxY, aabb2MaxY);
		
		res.set(newMinX, newMinY, newMaxX, newMaxY);
		
		return res;
	}
	
	public static <T extends IAabb2WF> T merge(IVec2RF aabb1Min, float[] aabb1Max, IVec2RF aabb2Min, float[] aabb2Max, @ExtractionParam T res)
	{
		float aabb1MinX = aabb1Min.x();
		float aabb1MinY = aabb1Min.y();
		float aabb1MaxX = aabb1Max[0];
		float aabb1MaxY = aabb1Max[1];
		
		float aabb2MinX = aabb2Min.x();
		float aabb2MinY = aabb2Min.y();
		float aabb2MaxX = aabb2Max[0];
		float aabb2MaxY = aabb2Max[1];
		
		float newMinX = MathUtils.min(aabb1MinX, aabb1MaxX, aabb2MinX, aabb2MaxX);
		float newMinY = MathUtils.min(aabb1MinY, aabb1MaxY, aabb2MinY, aabb2MaxY);
		float newMaxX = MathUtils.max(aabb1MinX, aabb1MaxX, aabb2MaxX, aabb2MaxX);
		float newMaxY = MathUtils.max(aabb1MinY, aabb1MaxY, aabb2MaxY, aabb2MaxY);
		
		res.set(newMinX, newMinY, newMaxX, newMaxY);
		
		return res;
	}
	
	public static <T extends IAabb2WF> T merge(IVec2RF aabb1Min, float[] aabb1Max, IVec2RF aabb2Min, float aabb2MaxX, float aabb2MaxY, @ExtractionParam T res)
	{
		float aabb1MinX = aabb1Min.x();
		float aabb1MinY = aabb1Min.y();
		float aabb1MaxX = aabb1Max[0];
		float aabb1MaxY = aabb1Max[1];
		
		float aabb2MinX = aabb2Min.x();
		float aabb2MinY = aabb2Min.y();
		
		float newMinX = MathUtils.min(aabb1MinX, aabb1MaxX, aabb2MinX, aabb2MaxX);
		float newMinY = MathUtils.min(aabb1MinY, aabb1MaxY, aabb2MinY, aabb2MaxY);
		float newMaxX = MathUtils.max(aabb1MinX, aabb1MaxX, aabb2MaxX, aabb2MaxX);
		float newMaxY = MathUtils.max(aabb1MinY, aabb1MaxY, aabb2MaxY, aabb2MaxY);
		
		res.set(newMinX, newMinY, newMaxX, newMaxY);
		
		return res;
	}
	
	public static <T extends IAabb2WF> T merge(IVec2RF aabb1Min, float[] aabb1Max, float[] aabb2Min, IVec2RF aabb2Max, @ExtractionParam T res)
	{
		float aabb1MinX = aabb1Min.x();
		float aabb1MinY = aabb1Min.y();
		float aabb1MaxX = aabb1Max[0];
		float aabb1MaxY = aabb1Max[1];
		
		float aabb2MinX = aabb2Min[0];
		float aabb2MinY = aabb2Min[1];
		float aabb2MaxX = aabb2Max.x();
		float aabb2MaxY = aabb2Max.y();
		
		float newMinX = MathUtils.min(aabb1MinX, aabb1MaxX, aabb2MinX, aabb2MaxX);
		float newMinY = MathUtils.min(aabb1MinY, aabb1MaxY, aabb2MinY, aabb2MaxY);
		float newMaxX = MathUtils.max(aabb1MinX, aabb1MaxX, aabb2MaxX, aabb2MaxX);
		float newMaxY = MathUtils.max(aabb1MinY, aabb1MaxY, aabb2MaxY, aabb2MaxY);
		
		res.set(newMinX, newMinY, newMaxX, newMaxY);
		
		return res;
	}

	public static <T extends IAabb2WF> T merge(IVec2RF aabb1Min, float[] aabb1Max, float[] aabb2Min, float[] aabb2Max, @ExtractionParam T res)
	{
		float aabb1MinX = aabb1Min.x();
		float aabb1MinY = aabb1Min.y();
		float aabb1MaxX = aabb1Max[0];
		float aabb1MaxY = aabb1Max[1];
		
		float aabb2MinX = aabb2Min[0];
		float aabb2MinY = aabb2Min[1];
		float aabb2MaxX = aabb2Max[0];
		float aabb2MaxY = aabb2Max[1];
		
		float newMinX = MathUtils.min(aabb1MinX, aabb1MaxX, aabb2MinX, aabb2MaxX);
		float newMinY = MathUtils.min(aabb1MinY, aabb1MaxY, aabb2MinY, aabb2MaxY);
		float newMaxX = MathUtils.max(aabb1MinX, aabb1MaxX, aabb2MaxX, aabb2MaxX);
		float newMaxY = MathUtils.max(aabb1MinY, aabb1MaxY, aabb2MaxY, aabb2MaxY);
		
		res.set(newMinX, newMinY, newMaxX, newMaxY);
		
		return res;
	}
	
	public static <T extends IAabb2WF> T merge(IVec2RF aabb1Min, float[] aabb1Max, float[] aabb2Min, float aabb2MaxX, float aabb2MaxY, @ExtractionParam T res)
	{
		float aabb1MinX = aabb1Min.x();
		float aabb1MinY = aabb1Min.y();
		float aabb1MaxX = aabb1Max[0];
		float aabb1MaxY = aabb1Max[1];
		
		float aabb2MinX = aabb2Min[0];
		float aabb2MinY = aabb2Min[1];
		
		float newMinX = MathUtils.min(aabb1MinX, aabb1MaxX, aabb2MinX, aabb2MaxX);
		float newMinY = MathUtils.min(aabb1MinY, aabb1MaxY, aabb2MinY, aabb2MaxY);
		float newMaxX = MathUtils.max(aabb1MinX, aabb1MaxX, aabb2MaxX, aabb2MaxX);
		float newMaxY = MathUtils.max(aabb1MinY, aabb1MaxY, aabb2MaxY, aabb2MaxY);
		
		res.set(newMinX, newMinY, newMaxX, newMaxY);
		
		return res;
	}
	
	public static <T extends IAabb2WF> T merge(IVec2RF aabb1Min, float[] aabb1Max, float aabb2MinX, float aabb2MinY, IVec2RF aabb2Max, @ExtractionParam T res)
	{
		float aabb1MinX = aabb1Min.x();
		float aabb1MinY = aabb1Min.y();
		float aabb1MaxX = aabb1Max[0];
		float aabb1MaxY = aabb1Max[1];
		
		float aabb2MaxX = aabb2Max.x();
		float aabb2MaxY = aabb2Max.y();
		
		float newMinX = MathUtils.min(aabb1MinX, aabb1MaxX, aabb2MinX, aabb2MaxX);
		float newMinY = MathUtils.min(aabb1MinY, aabb1MaxY, aabb2MinY, aabb2MaxY);
		float newMaxX = MathUtils.max(aabb1MinX, aabb1MaxX, aabb2MaxX, aabb2MaxX);
		float newMaxY = MathUtils.max(aabb1MinY, aabb1MaxY, aabb2MaxY, aabb2MaxY);
		
		res.set(newMinX, newMinY, newMaxX, newMaxY);
		
		return res;
	}

	public static <T extends IAabb2WF> T merge(IVec2RF aabb1Min, float[] aabb1Max, float aabb2MinX, float aabb2MinY, float[] aabb2Max, @ExtractionParam T res)
	{
		float aabb1MinX = aabb1Min.x();
		float aabb1MinY = aabb1Min.y();
		float aabb1MaxX = aabb1Max[0];
		float aabb1MaxY = aabb1Max[1];
		
		float aabb2MaxX = aabb2Max[0];
		float aabb2MaxY = aabb2Max[1];
		
		float newMinX = MathUtils.min(aabb1MinX, aabb1MaxX, aabb2MinX, aabb2MaxX);
		float newMinY = MathUtils.min(aabb1MinY, aabb1MaxY, aabb2MinY, aabb2MaxY);
		float newMaxX = MathUtils.max(aabb1MinX, aabb1MaxX, aabb2MaxX, aabb2MaxX);
		float newMaxY = MathUtils.max(aabb1MinY, aabb1MaxY, aabb2MaxY, aabb2MaxY);
		
		res.set(newMinX, newMinY, newMaxX, newMaxY);
		
		return res;
	}
	
	public static <T extends IAabb2WF> T merge(IVec2RF aabb1Min, float[] aabb1Max, float aabb2MinX, float aabb2MinY, float aabb2MaxX, float aabb2MaxY, @ExtractionParam T res)
	{
		float aabb1MinX = aabb1Min.x();
		float aabb1MinY = aabb1Min.y();
		float aabb1MaxX = aabb1Max[0];
		float aabb1MaxY = aabb1Max[1];
		
		float newMinX = MathUtils.min(aabb1MinX, aabb1MaxX, aabb2MinX, aabb2MaxX);
		float newMinY = MathUtils.min(aabb1MinY, aabb1MaxY, aabb2MinY, aabb2MaxY);
		float newMaxX = MathUtils.max(aabb1MinX, aabb1MaxX, aabb2MaxX, aabb2MaxX);
		float newMaxY = MathUtils.max(aabb1MinY, aabb1MaxY, aabb2MaxY, aabb2MaxY);
		
		res.set(newMinX, newMinY, newMaxX, newMaxY);
		
		return res;
	}
	
	public static <T extends IAabb2WF> T merge(IVec2RF aabb1Min, float aabb1MaxX, float aabb1MaxY, IVec2RF aabb2Min, float aabb2MaxX, float aabb2MaxY, @ExtractionParam T res)
	{
		float aabb1MinX = aabb1Min.x();
		float aabb1MinY = aabb1Min.y();
		
		float aabb2MinX = aabb2Min.x();
		float aabb2MinY = aabb2Min.y();
		
		float newMinX = MathUtils.min(aabb1MinX, aabb1MaxX, aabb2MinX, aabb2MaxX);
		float newMinY = MathUtils.min(aabb1MinY, aabb1MaxY, aabb2MinY, aabb2MaxY);
		float newMaxX = MathUtils.max(aabb1MinX, aabb1MaxX, aabb2MaxX, aabb2MaxX);
		float newMaxY = MathUtils.max(aabb1MinY, aabb1MaxY, aabb2MaxY, aabb2MaxY);
		
		res.set(newMinX, newMinY, newMaxX, newMaxY);
		
		return res;
	}
	
	public static <T extends IAabb2WF> T merge(IVec2RF aabb1Min, float aabb1MaxX, float aabb1MaxY, float[] aabb2Min, IVec2RF aabb2Max, @ExtractionParam T res)
	{
		float aabb1MinX = aabb1Min.x();
		float aabb1MinY = aabb1Min.y();
		
		float aabb2MinX = aabb2Min[0];
		float aabb2MinY = aabb2Min[1];
		float aabb2MaxX = aabb2Max.x();
		float aabb2MaxY = aabb2Max.y();
		
		float newMinX = MathUtils.min(aabb1MinX, aabb1MaxX, aabb2MinX, aabb2MaxX);
		float newMinY = MathUtils.min(aabb1MinY, aabb1MaxY, aabb2MinY, aabb2MaxY);
		float newMaxX = MathUtils.max(aabb1MinX, aabb1MaxX, aabb2MaxX, aabb2MaxX);
		float newMaxY = MathUtils.max(aabb1MinY, aabb1MaxY, aabb2MaxY, aabb2MaxY);
		
		res.set(newMinX, newMinY, newMaxX, newMaxY);
		
		return res;
	}

	public static <T extends IAabb2WF> T merge(IVec2RF aabb1Min, float aabb1MaxX, float aabb1MaxY, float[] aabb2Min, float[] aabb2Max, @ExtractionParam T res)
	{
		float aabb1MinX = aabb1Min.x();
		float aabb1MinY = aabb1Min.y();
		
		float aabb2MinX = aabb2Min[0];
		float aabb2MinY = aabb2Min[1];
		float aabb2MaxX = aabb2Max[0];
		float aabb2MaxY = aabb2Max[1];
		
		float newMinX = MathUtils.min(aabb1MinX, aabb1MaxX, aabb2MinX, aabb2MaxX);
		float newMinY = MathUtils.min(aabb1MinY, aabb1MaxY, aabb2MinY, aabb2MaxY);
		float newMaxX = MathUtils.max(aabb1MinX, aabb1MaxX, aabb2MaxX, aabb2MaxX);
		float newMaxY = MathUtils.max(aabb1MinY, aabb1MaxY, aabb2MaxY, aabb2MaxY);
		
		res.set(newMinX, newMinY, newMaxX, newMaxY);
		
		return res;
	}
	
	public static <T extends IAabb2WF> T merge(IVec2RF aabb1Min, float aabb1MaxX, float aabb1MaxY, float[] aabb2Min, float aabb2MaxX, float aabb2MaxY, @ExtractionParam T res)
	{
		float aabb1MinX = aabb1Min.x();
		float aabb1MinY = aabb1Min.y();
		
		float aabb2MinX = aabb2Min[0];
		float aabb2MinY = aabb2Min[1];
		
		float newMinX = MathUtils.min(aabb1MinX, aabb1MaxX, aabb2MinX, aabb2MaxX);
		float newMinY = MathUtils.min(aabb1MinY, aabb1MaxY, aabb2MinY, aabb2MaxY);
		float newMaxX = MathUtils.max(aabb1MinX, aabb1MaxX, aabb2MaxX, aabb2MaxX);
		float newMaxY = MathUtils.max(aabb1MinY, aabb1MaxY, aabb2MaxY, aabb2MaxY);
		
		res.set(newMinX, newMinY, newMaxX, newMaxY);
		
		return res;
	}
	
	public static <T extends IAabb2WF> T merge(IVec2RF aabb1Min, float aabb1MaxX, float aabb1MaxY, float aabb2MinX, float aabb2MinY, IVec2RF aabb2Max, @ExtractionParam T res)
	{
		float aabb1MinX = aabb1Min.x();
		float aabb1MinY = aabb1Min.y();
		
		float aabb2MaxX = aabb2Max.x();
		float aabb2MaxY = aabb2Max.y();
		
		float newMinX = MathUtils.min(aabb1MinX, aabb1MaxX, aabb2MinX, aabb2MaxX);
		float newMinY = MathUtils.min(aabb1MinY, aabb1MaxY, aabb2MinY, aabb2MaxY);
		float newMaxX = MathUtils.max(aabb1MinX, aabb1MaxX, aabb2MaxX, aabb2MaxX);
		float newMaxY = MathUtils.max(aabb1MinY, aabb1MaxY, aabb2MaxY, aabb2MaxY);
		
		res.set(newMinX, newMinY, newMaxX, newMaxY);
		
		return res;
	}

	public static <T extends IAabb2WF> T merge(IVec2RF aabb1Min, float aabb1MaxX, float aabb1MaxY, float aabb2MinX, float aabb2MinY, float[] aabb2Max, @ExtractionParam T res)
	{
		float aabb1MinX = aabb1Min.x();
		float aabb1MinY = aabb1Min.y();
		
		float aabb2MaxX = aabb2Max[0];
		float aabb2MaxY = aabb2Max[1];
		
		float newMinX = MathUtils.min(aabb1MinX, aabb1MaxX, aabb2MinX, aabb2MaxX);
		float newMinY = MathUtils.min(aabb1MinY, aabb1MaxY, aabb2MinY, aabb2MaxY);
		float newMaxX = MathUtils.max(aabb1MinX, aabb1MaxX, aabb2MaxX, aabb2MaxX);
		float newMaxY = MathUtils.max(aabb1MinY, aabb1MaxY, aabb2MaxY, aabb2MaxY);
		
		res.set(newMinX, newMinY, newMaxX, newMaxY);
		
		return res;
	}
	
	public static <T extends IAabb2WF> T merge(IVec2RF aabb1Min, float aabb1MaxX, float aabb1MaxY, float aabb2MinX, float aabb2MinY, float aabb2MaxX, float aabb2MaxY, @ExtractionParam T res)
	{
		float aabb1MinX = aabb1Min.x();
		float aabb1MinY = aabb1Min.y();
		
		float newMinX = MathUtils.min(aabb1MinX, aabb1MaxX, aabb2MinX, aabb2MaxX);
		float newMinY = MathUtils.min(aabb1MinY, aabb1MaxY, aabb2MinY, aabb2MaxY);
		float newMaxX = MathUtils.max(aabb1MinX, aabb1MaxX, aabb2MaxX, aabb2MaxX);
		float newMaxY = MathUtils.max(aabb1MinY, aabb1MaxY, aabb2MaxY, aabb2MaxY);
		
		res.set(newMinX, newMinY, newMaxX, newMaxY);
		
		return res;
	}
	
	public static <T extends IAabb2WF> T merge(float[] aabb1Min, IVec2RF aabb1Max, IVec2RF aabb2Min, IVec2RF aabb2Max, @ExtractionParam T res)
	{
		float aabb1MinX = aabb1Min[0];
		float aabb1MinY = aabb1Min[1];
		float aabb1MaxX = aabb1Max.x();
		float aabb1MaxY = aabb1Max.y();
		
		float aabb2MinX = aabb2Min.x();
		float aabb2MinY = aabb2Min.y();
		float aabb2MaxX = aabb2Max.x();
		float aabb2MaxY = aabb2Max.y();
		
		float newMinX = MathUtils.min(aabb1MinX, aabb1MaxX, aabb2MinX, aabb2MaxX);
		float newMinY = MathUtils.min(aabb1MinY, aabb1MaxY, aabb2MinY, aabb2MaxY);
		float newMaxX = MathUtils.max(aabb1MinX, aabb1MaxX, aabb2MaxX, aabb2MaxX);
		float newMaxY = MathUtils.max(aabb1MinY, aabb1MaxY, aabb2MaxY, aabb2MaxY);
		
		res.set(newMinX, newMinY, newMaxX, newMaxY);
		
		return res;
	}
	
	public static <T extends IAabb2WF> T merge(float[] aabb1Min, IVec2RF aabb1Max, float[] aabb2Min, IVec2RF aabb2Max, @ExtractionParam T res)
	{
		float aabb1MinX = aabb1Min[0];
		float aabb1MinY = aabb1Min[1];
		float aabb1MaxX = aabb1Max.x();
		float aabb1MaxY = aabb1Max.y();
		
		float aabb2MinX = aabb2Min[0];
		float aabb2MinY = aabb2Min[1];
		float aabb2MaxX = aabb2Max.x();
		float aabb2MaxY = aabb2Max.y();
		
		float newMinX = MathUtils.min(aabb1MinX, aabb1MaxX, aabb2MinX, aabb2MaxX);
		float newMinY = MathUtils.min(aabb1MinY, aabb1MaxY, aabb2MinY, aabb2MaxY);
		float newMaxX = MathUtils.max(aabb1MinX, aabb1MaxX, aabb2MaxX, aabb2MaxX);
		float newMaxY = MathUtils.max(aabb1MinY, aabb1MaxY, aabb2MaxY, aabb2MaxY);
		
		res.set(newMinX, newMinY, newMaxX, newMaxY);
		
		return res;
	}

	public static <T extends IAabb2WF> T merge(float[] aabb1Min, IVec2RF aabb1Max, float[] aabb2Min, float[] aabb2Max, @ExtractionParam T res)
	{
		float aabb1MinX = aabb1Min[0];
		float aabb1MinY = aabb1Min[1];
		float aabb1MaxX = aabb1Max.x();
		float aabb1MaxY = aabb1Max.y();
		
		float aabb2MinX = aabb2Min[0];
		float aabb2MinY = aabb2Min[1];
		float aabb2MaxX = aabb2Max[0];
		float aabb2MaxY = aabb2Max[1];
		
		float newMinX = MathUtils.min(aabb1MinX, aabb1MaxX, aabb2MinX, aabb2MaxX);
		float newMinY = MathUtils.min(aabb1MinY, aabb1MaxY, aabb2MinY, aabb2MaxY);
		float newMaxX = MathUtils.max(aabb1MinX, aabb1MaxX, aabb2MaxX, aabb2MaxX);
		float newMaxY = MathUtils.max(aabb1MinY, aabb1MaxY, aabb2MaxY, aabb2MaxY);
		
		res.set(newMinX, newMinY, newMaxX, newMaxY);
		
		return res;
	}
	
	public static <T extends IAabb2WF> T merge(float[] aabb1Min, IVec2RF aabb1Max, float[] aabb2Min, float aabb2MaxX, float aabb2MaxY, @ExtractionParam T res)
	{
		float aabb1MinX = aabb1Min[0];
		float aabb1MinY = aabb1Min[1];
		float aabb1MaxX = aabb1Max.x();
		float aabb1MaxY = aabb1Max.y();
		
		float aabb2MinX = aabb2Min[0];
		float aabb2MinY = aabb2Min[1];
		
		float newMinX = MathUtils.min(aabb1MinX, aabb1MaxX, aabb2MinX, aabb2MaxX);
		float newMinY = MathUtils.min(aabb1MinY, aabb1MaxY, aabb2MinY, aabb2MaxY);
		float newMaxX = MathUtils.max(aabb1MinX, aabb1MaxX, aabb2MaxX, aabb2MaxX);
		float newMaxY = MathUtils.max(aabb1MinY, aabb1MaxY, aabb2MaxY, aabb2MaxY);
		
		res.set(newMinX, newMinY, newMaxX, newMaxY);
		
		return res;
	}
	
	public static <T extends IAabb2WF> T merge(float[] aabb1Min, IVec2RF aabb1Max, float aabb2MinX, float aabb2MinY, IVec2RF aabb2Max, @ExtractionParam T res)
	{
		float aabb1MinX = aabb1Min[0];
		float aabb1MinY = aabb1Min[1];
		float aabb1MaxX = aabb1Max.x();
		float aabb1MaxY = aabb1Max.y();
		
		float aabb2MaxX = aabb2Max.x();
		float aabb2MaxY = aabb2Max.y();
		
		float newMinX = MathUtils.min(aabb1MinX, aabb1MaxX, aabb2MinX, aabb2MaxX);
		float newMinY = MathUtils.min(aabb1MinY, aabb1MaxY, aabb2MinY, aabb2MaxY);
		float newMaxX = MathUtils.max(aabb1MinX, aabb1MaxX, aabb2MaxX, aabb2MaxX);
		float newMaxY = MathUtils.max(aabb1MinY, aabb1MaxY, aabb2MaxY, aabb2MaxY);
		
		res.set(newMinX, newMinY, newMaxX, newMaxY);
		
		return res;
	}

	public static <T extends IAabb2WF> T merge(float[] aabb1Min, IVec2RF aabb1Max, float aabb2MinX, float aabb2MinY, float[] aabb2Max, @ExtractionParam T res)
	{
		float aabb1MinX = aabb1Min[0];
		float aabb1MinY = aabb1Min[1];
		float aabb1MaxX = aabb1Max.x();
		float aabb1MaxY = aabb1Max.y();
		
		float aabb2MaxX = aabb2Max[0];
		float aabb2MaxY = aabb2Max[1];
		
		float newMinX = MathUtils.min(aabb1MinX, aabb1MaxX, aabb2MinX, aabb2MaxX);
		float newMinY = MathUtils.min(aabb1MinY, aabb1MaxY, aabb2MinY, aabb2MaxY);
		float newMaxX = MathUtils.max(aabb1MinX, aabb1MaxX, aabb2MaxX, aabb2MaxX);
		float newMaxY = MathUtils.max(aabb1MinY, aabb1MaxY, aabb2MaxY, aabb2MaxY);
		
		res.set(newMinX, newMinY, newMaxX, newMaxY);
		
		return res;
	}
	
	public static <T extends IAabb2WF> T merge(float[] aabb1Min, IVec2RF aabb1Max, float aabb2MinX, float aabb2MinY, float aabb2MaxX, float aabb2MaxY, @ExtractionParam T res)
	{
		float aabb1MinX = aabb1Min[0];
		float aabb1MinY = aabb1Min[1];
		float aabb1MaxX = aabb1Max.x();
		float aabb1MaxY = aabb1Max.y();
		
		float newMinX = MathUtils.min(aabb1MinX, aabb1MaxX, aabb2MinX, aabb2MaxX);
		float newMinY = MathUtils.min(aabb1MinY, aabb1MaxY, aabb2MinY, aabb2MaxY);
		float newMaxX = MathUtils.max(aabb1MinX, aabb1MaxX, aabb2MaxX, aabb2MaxX);
		float newMaxY = MathUtils.max(aabb1MinY, aabb1MaxY, aabb2MaxY, aabb2MaxY);
		
		res.set(newMinX, newMinY, newMaxX, newMaxY);
		
		return res;
	}
	
	public static <T extends IAabb2WF> T merge(float[] aabb1Min, float[] aabb1Max, float[] aabb2Min, float[] aabb2Max, @ExtractionParam T res)
	{
		float aabb1MinX = aabb1Min[0];
		float aabb1MinY = aabb1Min[1];
		float aabb1MaxX = aabb1Max[0];
		float aabb1MaxY = aabb1Max[1];
		
		float aabb2MinX = aabb2Min[0];
		float aabb2MinY = aabb2Min[1];
		float aabb2MaxX = aabb2Max[0];
		float aabb2MaxY = aabb2Max[1];
		
		float newMinX = MathUtils.min(aabb1MinX, aabb1MaxX, aabb2MinX, aabb2MaxX);
		float newMinY = MathUtils.min(aabb1MinY, aabb1MaxY, aabb2MinY, aabb2MaxY);
		float newMaxX = MathUtils.max(aabb1MinX, aabb1MaxX, aabb2MaxX, aabb2MaxX);
		float newMaxY = MathUtils.max(aabb1MinY, aabb1MaxY, aabb2MaxY, aabb2MaxY);
		
		res.set(newMinX, newMinY, newMaxX, newMaxY);
		
		return res;
	}
	
	public static <T extends IAabb2WF> T merge(float[] aabb1Min, float[] aabb1Max, float[] aabb2Min, float aabb2MaxX, float aabb2MaxY, @ExtractionParam T res)
	{
		float aabb1MinX = aabb1Min[0];
		float aabb1MinY = aabb1Min[1];
		float aabb1MaxX = aabb1Max[0];
		float aabb1MaxY = aabb1Max[1];
		
		float aabb2MinX = aabb2Min[0];
		float aabb2MinY = aabb2Min[1];
		
		float newMinX = MathUtils.min(aabb1MinX, aabb1MaxX, aabb2MinX, aabb2MaxX);
		float newMinY = MathUtils.min(aabb1MinY, aabb1MaxY, aabb2MinY, aabb2MaxY);
		float newMaxX = MathUtils.max(aabb1MinX, aabb1MaxX, aabb2MaxX, aabb2MaxX);
		float newMaxY = MathUtils.max(aabb1MinY, aabb1MaxY, aabb2MaxY, aabb2MaxY);
		
		res.set(newMinX, newMinY, newMaxX, newMaxY);
		
		return res;
	}
	
	public static <T extends IAabb2WF> T merge(float[] aabb1Min, float[] aabb1Max, float aabb2MinX, float aabb2MinY, IVec2RF aabb2Max, @ExtractionParam T res)
	{
		float aabb1MinX = aabb1Min[0];
		float aabb1MinY = aabb1Min[1];
		float aabb1MaxX = aabb1Max[0];
		float aabb1MaxY = aabb1Max[1];
		
		float aabb2MaxX = aabb2Max.x();
		float aabb2MaxY = aabb2Max.y();
		
		float newMinX = MathUtils.min(aabb1MinX, aabb1MaxX, aabb2MinX, aabb2MaxX);
		float newMinY = MathUtils.min(aabb1MinY, aabb1MaxY, aabb2MinY, aabb2MaxY);
		float newMaxX = MathUtils.max(aabb1MinX, aabb1MaxX, aabb2MaxX, aabb2MaxX);
		float newMaxY = MathUtils.max(aabb1MinY, aabb1MaxY, aabb2MaxY, aabb2MaxY);
		
		res.set(newMinX, newMinY, newMaxX, newMaxY);
		
		return res;
	}

	public static <T extends IAabb2WF> T merge(float[] aabb1Min, float[] aabb1Max, float aabb2MinX, float aabb2MinY, float[] aabb2Max, @ExtractionParam T res)
	{
		float aabb1MinX = aabb1Min[0];
		float aabb1MinY = aabb1Min[1];
		float aabb1MaxX = aabb1Max[0];
		float aabb1MaxY = aabb1Max[1];
		
		float aabb2MaxX = aabb2Max[0];
		float aabb2MaxY = aabb2Max[1];
		
		float newMinX = MathUtils.min(aabb1MinX, aabb1MaxX, aabb2MinX, aabb2MaxX);
		float newMinY = MathUtils.min(aabb1MinY, aabb1MaxY, aabb2MinY, aabb2MaxY);
		float newMaxX = MathUtils.max(aabb1MinX, aabb1MaxX, aabb2MaxX, aabb2MaxX);
		float newMaxY = MathUtils.max(aabb1MinY, aabb1MaxY, aabb2MaxY, aabb2MaxY);
		
		res.set(newMinX, newMinY, newMaxX, newMaxY);
		
		return res;
	}
	
	public static <T extends IAabb2WF> T merge(float[] aabb1Min, float[] aabb1Max, float aabb2MinX, float aabb2MinY, float aabb2MaxX, float aabb2MaxY, @ExtractionParam T res)
	{
		float aabb1MinX = aabb1Min[0];
		float aabb1MinY = aabb1Min[1];
		float aabb1MaxX = aabb1Max[0];
		float aabb1MaxY = aabb1Max[1];
		
		float newMinX = MathUtils.min(aabb1MinX, aabb1MaxX, aabb2MinX, aabb2MaxX);
		float newMinY = MathUtils.min(aabb1MinY, aabb1MaxY, aabb2MinY, aabb2MaxY);
		float newMaxX = MathUtils.max(aabb1MinX, aabb1MaxX, aabb2MaxX, aabb2MaxX);
		float newMaxY = MathUtils.max(aabb1MinY, aabb1MaxY, aabb2MaxY, aabb2MaxY);
		
		res.set(newMinX, newMinY, newMaxX, newMaxY);
		
		return res;
	}
	
	public static <T extends IAabb2WF> T merge(float[] aabb1Min, float aabb1MaxX, float aabb1MaxY, float[] aabb2Min, float aabb2MaxX, float aabb2MaxY, @ExtractionParam T res)
	{
		float aabb1MinX = aabb1Min[0];
		float aabb1MinY = aabb1Min[1];
		
		float aabb2MinX = aabb2Min[0];
		float aabb2MinY = aabb2Min[1];
		
		float newMinX = MathUtils.min(aabb1MinX, aabb1MaxX, aabb2MinX, aabb2MaxX);
		float newMinY = MathUtils.min(aabb1MinY, aabb1MaxY, aabb2MinY, aabb2MaxY);
		float newMaxX = MathUtils.max(aabb1MinX, aabb1MaxX, aabb2MaxX, aabb2MaxX);
		float newMaxY = MathUtils.max(aabb1MinY, aabb1MaxY, aabb2MaxY, aabb2MaxY);
		
		res.set(newMinX, newMinY, newMaxX, newMaxY);
		
		return res;
	}
	
	public static <T extends IAabb2WF> T merge(float[] aabb1Min, float aabb1MaxX, float aabb1MaxY, float aabb2MinX, float aabb2MinY, IVec2RF aabb2Max, @ExtractionParam T res)
	{
		float aabb1MinX = aabb1Min[0];
		float aabb1MinY = aabb1Min[1];
		
		float aabb2MaxX = aabb2Max.x();
		float aabb2MaxY = aabb2Max.y();
		
		float newMinX = MathUtils.min(aabb1MinX, aabb1MaxX, aabb2MinX, aabb2MaxX);
		float newMinY = MathUtils.min(aabb1MinY, aabb1MaxY, aabb2MinY, aabb2MaxY);
		float newMaxX = MathUtils.max(aabb1MinX, aabb1MaxX, aabb2MaxX, aabb2MaxX);
		float newMaxY = MathUtils.max(aabb1MinY, aabb1MaxY, aabb2MaxY, aabb2MaxY);
		
		res.set(newMinX, newMinY, newMaxX, newMaxY);
		
		return res;
	}

	public static <T extends IAabb2WF> T merge(float[] aabb1Min, float aabb1MaxX, float aabb1MaxY, float aabb2MinX, float aabb2MinY, float[] aabb2Max, @ExtractionParam T res)
	{
		float aabb1MinX = aabb1Min[0];
		float aabb1MinY = aabb1Min[1];
		
		float aabb2MaxX = aabb2Max[0];
		float aabb2MaxY = aabb2Max[1];
		
		float newMinX = MathUtils.min(aabb1MinX, aabb1MaxX, aabb2MinX, aabb2MaxX);
		float newMinY = MathUtils.min(aabb1MinY, aabb1MaxY, aabb2MinY, aabb2MaxY);
		float newMaxX = MathUtils.max(aabb1MinX, aabb1MaxX, aabb2MaxX, aabb2MaxX);
		float newMaxY = MathUtils.max(aabb1MinY, aabb1MaxY, aabb2MaxY, aabb2MaxY);
		
		res.set(newMinX, newMinY, newMaxX, newMaxY);
		
		return res;
	}
	
	public static <T extends IAabb2WF> T merge(float[] aabb1Min, float aabb1MaxX, float aabb1MaxY, float aabb2MinX, float aabb2MinY, float aabb2MaxX, float aabb2MaxY, @ExtractionParam T res)
	{
		float aabb1MinX = aabb1Min[0];
		float aabb1MinY = aabb1Min[1];
		
		float newMinX = MathUtils.min(aabb1MinX, aabb1MaxX, aabb2MinX, aabb2MaxX);
		float newMinY = MathUtils.min(aabb1MinY, aabb1MaxY, aabb2MinY, aabb2MaxY);
		float newMaxX = MathUtils.max(aabb1MinX, aabb1MaxX, aabb2MaxX, aabb2MaxX);
		float newMaxY = MathUtils.max(aabb1MinY, aabb1MaxY, aabb2MaxY, aabb2MaxY);
		
		res.set(newMinX, newMinY, newMaxX, newMaxY);
		
		return res;
	}
	
	public static <T extends IAabb2WF> T merge(float aabb1MinX, float aabb1MinY, IVec2RF aabb1Max, float aabb2MinX, float aabb2MinY, IVec2RF aabb2Max, @ExtractionParam T res)
	{
		float aabb1MaxX = aabb1Max.x();
		float aabb1MaxY = aabb1Max.y();
		
		float aabb2MaxX = aabb2Max.x();
		float aabb2MaxY = aabb2Max.y();
		
		float newMinX = MathUtils.min(aabb1MinX, aabb1MaxX, aabb2MinX, aabb2MaxX);
		float newMinY = MathUtils.min(aabb1MinY, aabb1MaxY, aabb2MinY, aabb2MaxY);
		float newMaxX = MathUtils.max(aabb1MinX, aabb1MaxX, aabb2MaxX, aabb2MaxX);
		float newMaxY = MathUtils.max(aabb1MinY, aabb1MaxY, aabb2MaxY, aabb2MaxY);
		
		res.set(newMinX, newMinY, newMaxX, newMaxY);
		
		return res;
	}

	public static <T extends IAabb2WF> T merge(float aabb1MinX, float aabb1MinY, IVec2RF aabb1Max, float aabb2MinX, float aabb2MinY, float[] aabb2Max, @ExtractionParam T res)
	{
		float aabb1MaxX = aabb1Max.x();
		float aabb1MaxY = aabb1Max.y();
		
		float aabb2MaxX = aabb2Max[0];
		float aabb2MaxY = aabb2Max[1];
		
		float newMinX = MathUtils.min(aabb1MinX, aabb1MaxX, aabb2MinX, aabb2MaxX);
		float newMinY = MathUtils.min(aabb1MinY, aabb1MaxY, aabb2MinY, aabb2MaxY);
		float newMaxX = MathUtils.max(aabb1MinX, aabb1MaxX, aabb2MaxX, aabb2MaxX);
		float newMaxY = MathUtils.max(aabb1MinY, aabb1MaxY, aabb2MaxY, aabb2MaxY);
		
		res.set(newMinX, newMinY, newMaxX, newMaxY);
		
		return res;
	}
	
	public static <T extends IAabb2WF> T merge(float aabb1MinX, float aabb1MinY, IVec2RF aabb1Max, float aabb2MinX, float aabb2MinY, float aabb2MaxX, float aabb2MaxY, @ExtractionParam T res)
	{
		float aabb1MaxX = aabb1Max.x();
		float aabb1MaxY = aabb1Max.y();
		
		float newMinX = MathUtils.min(aabb1MinX, aabb1MaxX, aabb2MinX, aabb2MaxX);
		float newMinY = MathUtils.min(aabb1MinY, aabb1MaxY, aabb2MinY, aabb2MaxY);
		float newMaxX = MathUtils.max(aabb1MinX, aabb1MaxX, aabb2MaxX, aabb2MaxX);
		float newMaxY = MathUtils.max(aabb1MinY, aabb1MaxY, aabb2MaxY, aabb2MaxY);
		
		res.set(newMinX, newMinY, newMaxX, newMaxY);
		
		return res;
	}
	
	public static <T extends IAabb2WF> T merge(float aabb1MinX, float aabb1MinY, float[] aabb1Max, IVec2RF aabb2Min, IVec2RF aabb2Max, @ExtractionParam T res)
	{
		float aabb1MaxX = aabb1Max[0];
		float aabb1MaxY = aabb1Max[1];
		
		float aabb2MinX = aabb2Min.x();
		float aabb2MinY = aabb2Min.y();
		float aabb2MaxX = aabb2Max.x();
		float aabb2MaxY = aabb2Max.y();
		
		float newMinX = MathUtils.min(aabb1MinX, aabb1MaxX, aabb2MinX, aabb2MaxX);
		float newMinY = MathUtils.min(aabb1MinY, aabb1MaxY, aabb2MinY, aabb2MaxY);
		float newMaxX = MathUtils.max(aabb1MinX, aabb1MaxX, aabb2MaxX, aabb2MaxX);
		float newMaxY = MathUtils.max(aabb1MinY, aabb1MaxY, aabb2MaxY, aabb2MaxY);
		
		res.set(newMinX, newMinY, newMaxX, newMaxY);
		
		return res;
	}

	public static <T extends IAabb2WF> T merge(float aabb1MinX, float aabb1MinY, float[] aabb1Max, float aabb2MinX, float aabb2MinY, float[] aabb2Max, @ExtractionParam T res)
	{
		float aabb1MaxX = aabb1Max[0];
		float aabb1MaxY = aabb1Max[1];
		
		float aabb2MaxX = aabb2Max[0];
		float aabb2MaxY = aabb2Max[1];
		
		float newMinX = MathUtils.min(aabb1MinX, aabb1MaxX, aabb2MinX, aabb2MaxX);
		float newMinY = MathUtils.min(aabb1MinY, aabb1MaxY, aabb2MinY, aabb2MaxY);
		float newMaxX = MathUtils.max(aabb1MinX, aabb1MaxX, aabb2MaxX, aabb2MaxX);
		float newMaxY = MathUtils.max(aabb1MinY, aabb1MaxY, aabb2MaxY, aabb2MaxY);
		
		res.set(newMinX, newMinY, newMaxX, newMaxY);
		
		return res;
	}
	
	public static <T extends IAabb2WF> T merge(float aabb1MinX, float aabb1MinY, float[] aabb1Max, float aabb2MinX, float aabb2MinY, float aabb2MaxX, float aabb2MaxY, @ExtractionParam T res)
	{
		float aabb1MaxX = aabb1Max[0];
		float aabb1MaxY = aabb1Max[1];
		
		float newMinX = MathUtils.min(aabb1MinX, aabb1MaxX, aabb2MinX, aabb2MaxX);
		float newMinY = MathUtils.min(aabb1MinY, aabb1MaxY, aabb2MinY, aabb2MaxY);
		float newMaxX = MathUtils.max(aabb1MinX, aabb1MaxX, aabb2MaxX, aabb2MaxX);
		float newMaxY = MathUtils.max(aabb1MinY, aabb1MaxY, aabb2MaxY, aabb2MaxY);
		
		res.set(newMinX, newMinY, newMaxX, newMaxY);
		
		return res;
	}
	
	public static <T extends IAabb2WF> T merge(float aabb1MinX, float aabb1MinY, float aabb1MaxX, float aabb1MaxY, float aabb2MinX, float aabb2MinY, float aabb2MaxX, float aabb2MaxY, @ExtractionParam T res)
	{
		float newMinX = MathUtils.min(aabb1MinX, aabb1MaxX, aabb2MinX, aabb2MaxX);
		float newMinY = MathUtils.min(aabb1MinY, aabb1MaxY, aabb2MinY, aabb2MaxY);
		float newMaxX = MathUtils.max(aabb1MinX, aabb1MaxX, aabb2MaxX, aabb2MaxX);
		float newMaxY = MathUtils.max(aabb1MinY, aabb1MaxY, aabb2MaxY, aabb2MaxY);
		
		res.set(newMinX, newMinY, newMaxX, newMaxY);
		
		return res;
	}
	
	public static <T extends IAabb2WF> T mergeAssign(@ExtractionParam T aabb1, IAabb2RF aabb2)
	{
		float aabb1MinX = aabb1.minX();
		float aabb1MinY = aabb1.minY();
		float aabb1MaxX = aabb1.maxX();
		float aabb1MaxY = aabb1.maxY();
		
		float aabb2MinX = aabb2.minX();
		float aabb2MinY = aabb2.minY();
		float aabb2MaxX = aabb2.maxX();
		float aabb2MaxY = aabb2.maxY();
		
		float newMinX = MathUtils.min(aabb1MinX, aabb1MaxX, aabb2MinX, aabb2MaxX);
		float newMinY = MathUtils.min(aabb1MinY, aabb1MaxY, aabb2MinY, aabb2MaxY);
		float newMaxX = MathUtils.max(aabb1MinX, aabb1MaxX, aabb2MaxX, aabb2MaxX);
		float newMaxY = MathUtils.max(aabb1MinY, aabb1MaxY, aabb2MaxY, aabb2MaxY);
		
		aabb1.set(newMinX, newMinY, newMaxX, newMaxY);
		
		return aabb1;
	}
	
	public static <T extends IAabb2WF> T mergeAssign(@ExtractionParam T aabb1, float[] aabb2)
	{
		float aabb1MinX = aabb1.minX();
		float aabb1MinY = aabb1.minY();
		float aabb1MaxX = aabb1.maxX();
		float aabb1MaxY = aabb1.maxY();
		
		float aabb2MinX = aabb2[0];
		float aabb2MinY = aabb2[1];
		float aabb2MaxX = aabb2[2];
		float aabb2MaxY = aabb2[3];
		
		float newMinX = MathUtils.min(aabb1MinX, aabb1MaxX, aabb2MinX, aabb2MaxX);
		float newMinY = MathUtils.min(aabb1MinY, aabb1MaxY, aabb2MinY, aabb2MaxY);
		float newMaxX = MathUtils.max(aabb1MinX, aabb1MaxX, aabb2MaxX, aabb2MaxX);
		float newMaxY = MathUtils.max(aabb1MinY, aabb1MaxY, aabb2MaxY, aabb2MaxY);
		
		aabb1.set(newMinX, newMinY, newMaxX, newMaxY);
		
		return aabb1;
	}
	
	public static <T extends IAabb2WF> T mergeAssign(@ExtractionParam T aabb1, IVec2RF aabb2Min, IVec2RF aabb2Max)
	{
		float aabb1MinX = aabb1.minX();
		float aabb1MinY = aabb1.minY();
		float aabb1MaxX = aabb1.maxX();
		float aabb1MaxY = aabb1.maxY();
		
		float aabb2MinX = aabb2Min.x();
		float aabb2MinY = aabb2Min.y();
		float aabb2MaxX = aabb2Max.x();
		float aabb2MaxY = aabb2Max.y();
		
		float newMinX = MathUtils.min(aabb1MinX, aabb1MaxX, aabb2MinX, aabb2MaxX);
		float newMinY = MathUtils.min(aabb1MinY, aabb1MaxY, aabb2MinY, aabb2MaxY);
		float newMaxX = MathUtils.max(aabb1MinX, aabb1MaxX, aabb2MaxX, aabb2MaxX);
		float newMaxY = MathUtils.max(aabb1MinY, aabb1MaxY, aabb2MaxY, aabb2MaxY);
		
		aabb1.set(newMinX, newMinY, newMaxX, newMaxY);
		
		return aabb1;
	}
	
	public static <T extends IAabb2WF> T mergeAssign(@ExtractionParam T aabb1, IVec2RF aabb2Min, float[] aabb2Max)
	{
		float aabb1MinX = aabb1.minX();
		float aabb1MinY = aabb1.minY();
		float aabb1MaxX = aabb1.maxX();
		float aabb1MaxY = aabb1.maxY();
		
		float aabb2MinX = aabb2Min.x();
		float aabb2MinY = aabb2Min.y();
		float aabb2MaxX = aabb2Max[0];
		float aabb2MaxY = aabb2Max[1];
		
		float newMinX = MathUtils.min(aabb1MinX, aabb1MaxX, aabb2MinX, aabb2MaxX);
		float newMinY = MathUtils.min(aabb1MinY, aabb1MaxY, aabb2MinY, aabb2MaxY);
		float newMaxX = MathUtils.max(aabb1MinX, aabb1MaxX, aabb2MaxX, aabb2MaxX);
		float newMaxY = MathUtils.max(aabb1MinY, aabb1MaxY, aabb2MaxY, aabb2MaxY);
		
		aabb1.set(newMinX, newMinY,newMaxX, newMaxY);
		
		return aabb1;
	}
	
	public static <T extends IAabb2WF> T mergeAssign(@ExtractionParam T aabb1, IVec2RF aabb2Min, float aabb2MaxX, float aabb2MaxY)
	{
		float aabb1MinX = aabb1.minX();
		float aabb1MinY = aabb1.minY();
		float aabb1MaxX = aabb1.maxX();
		float aabb1MaxY = aabb1.maxY();
		
		float aabb2MinX = aabb2Min.x();
		float aabb2MinY = aabb2Min.y();
		
		float newMinX = MathUtils.min(aabb1MinX, aabb1MaxX, aabb2MinX, aabb2MaxX);
		float newMinY = MathUtils.min(aabb1MinY, aabb1MaxY, aabb2MinY, aabb2MaxY);
		float newMaxX = MathUtils.max(aabb1MinX, aabb1MaxX, aabb2MaxX, aabb2MaxX);
		float newMaxY = MathUtils.max(aabb1MinY, aabb1MaxY, aabb2MaxY, aabb2MaxY);
		
		aabb1.set(newMinX, newMinY, newMaxX, newMaxY);
		
		return aabb1;
	}
	
	public static <T extends IAabb2WF> T mergeAssign(@ExtractionParam T aabb1, float[] aabb2Min, IVec2RF aabb2Max)
	{
		float aabb1MinX = aabb1.minX();
		float aabb1MinY = aabb1.minY();
		float aabb1MaxX = aabb1.maxX();
		float aabb1MaxY = aabb1.maxY();
		
		float aabb2MinX = aabb2Min[0];
		float aabb2MinY = aabb2Min[1];
		float aabb2MaxX = aabb2Max.x();
		float aabb2MaxY = aabb2Max.y();
		
		float newMinX = MathUtils.min(aabb1MinX, aabb1MaxX, aabb2MinX, aabb2MaxX);
		float newMinY = MathUtils.min(aabb1MinY, aabb1MaxY, aabb2MinY, aabb2MaxY);
		float newMaxX = MathUtils.max(aabb1MinX, aabb1MaxX, aabb2MaxX, aabb2MaxX);
		float newMaxY = MathUtils.max(aabb1MinY, aabb1MaxY, aabb2MaxY, aabb2MaxY);
		
		aabb1.set(newMinX, newMinY, newMaxX, newMaxY);
		
		return aabb1;
	}
	
	public static <T extends IAabb2WF> T mergeAssign(@ExtractionParam T aabb1, float[] aabb2Min, float[] aabb2Max)
	{
		float aabb1MinX = aabb1.minX();
		float aabb1MinY = aabb1.minY();
		float aabb1MaxX = aabb1.maxX();
		float aabb1MaxY = aabb1.maxY();
		
		float aabb2MinX = aabb2Min[0];
		float aabb2MinY = aabb2Min[1];
		float aabb2MaxX = aabb2Max[0];
		float aabb2MaxY = aabb2Max[1];
		
		float newMinX = MathUtils.min(aabb1MinX, aabb1MaxX, aabb2MinX, aabb2MaxX);
		float newMinY = MathUtils.min(aabb1MinY, aabb1MaxY, aabb2MinY, aabb2MaxY);
		float newMaxX = MathUtils.max(aabb1MinX, aabb1MaxX, aabb2MaxX, aabb2MaxX);
		float newMaxY = MathUtils.max(aabb1MinY, aabb1MaxY, aabb2MaxY, aabb2MaxY);
		
		aabb1.set(newMinX, newMinY, newMaxX, newMaxY);
		
		return aabb1;
	}
	
	public static <T extends IAabb2WF> T mergeAssign(@ExtractionParam T aabb1, float[] aabb2Min, float aabb2MaxX, float aabb2MaxY)
	{
		float aabb1MinX = aabb1.minX();
		float aabb1MinY = aabb1.minY();
		float aabb1MaxX = aabb1.maxX();
		float aabb1MaxY = aabb1.maxY();
		
		float aabb2MinX = aabb2Min[0];
		float aabb2MinY = aabb2Min[1];
		
		float newMinX = MathUtils.min(aabb1MinX, aabb1MaxX, aabb2MinX, aabb2MaxX);
		float newMinY = MathUtils.min(aabb1MinY, aabb1MaxY, aabb2MinY, aabb2MaxY);
		float newMaxX = MathUtils.max(aabb1MinX, aabb1MaxX, aabb2MaxX, aabb2MaxX);
		float newMaxY = MathUtils.max(aabb1MinY, aabb1MaxY, aabb2MaxY, aabb2MaxY);
		
		aabb1.set(newMinX, newMinY, newMaxX, newMaxY);
		
		return aabb1;
	}
	
	public static <T extends IAabb2WF> T mergeAssign(@ExtractionParam T aabb1, float aabb2MinX, float aabb2MinY, IVec2RF aabb2Max)
	{
		float aabb1MinX = aabb1.minX();
		float aabb1MinY = aabb1.minY();
		float aabb1MaxX = aabb1.maxX();
		float aabb1MaxY = aabb1.maxY();
		
		float aabb2MaxX = aabb2Max.x();
		float aabb2MaxY = aabb2Max.y();
		
		float newMinX = MathUtils.min(aabb1MinX, aabb1MaxX, aabb2MinX, aabb2MaxX);
		float newMinY = MathUtils.min(aabb1MinY, aabb1MaxY, aabb2MinY, aabb2MaxY);
		float newMaxX = MathUtils.max(aabb1MinX, aabb1MaxX, aabb2MaxX, aabb2MaxX);
		float newMaxY = MathUtils.max(aabb1MinY, aabb1MaxY, aabb2MaxY, aabb2MaxY);
		
		aabb1.set(newMinX, newMinY, newMaxX, newMaxY);
		
		return aabb1;
	}
	
	public static <T extends IAabb2WF> T mergeAssign(@ExtractionParam T aabb1, float aabb2MinX, float aabb2MinY, float[] aabb2Max)
	{
		float aabb1MinX = aabb1.minX();
		float aabb1MinY = aabb1.minY();
		float aabb1MaxX = aabb1.maxX();
		float aabb1MaxY = aabb1.maxY();
		
		float aabb2MaxX = aabb2Max[0];
		float aabb2MaxY = aabb2Max[1];
		
		float newMinX = MathUtils.min(aabb1MinX, aabb1MaxX, aabb2MinX, aabb2MaxX);
		float newMinY = MathUtils.min(aabb1MinY, aabb1MaxY, aabb2MinY, aabb2MaxY);
		float newMaxX = MathUtils.max(aabb1MinX, aabb1MaxX, aabb2MaxX, aabb2MaxX);
		float newMaxY = MathUtils.max(aabb1MinY, aabb1MaxY, aabb2MaxY, aabb2MaxY);
		
		aabb1.set(newMinX, newMinY, newMaxX, newMaxY);
		
		return aabb1;
	}
	
	public static <T extends IAabb2WF> T mergeAssign(@ExtractionParam T aabb1, float aabb2MinX, float aabb2MinY, float aabb2MaxX, float aabb2MaxY)
	{
		float aabb1MinX = aabb1.minX();
		float aabb1MinY = aabb1.minY();
		float aabb1MaxX = aabb1.maxX();
		float aabb1MaxY = aabb1.maxY();
		
		float newMinX = MathUtils.min(aabb1MinX, aabb1MaxX, aabb2MinX, aabb2MaxX);
		float newMinY = MathUtils.min(aabb1MinY, aabb1MaxY, aabb2MinY, aabb2MaxY);
		float newMaxX = MathUtils.max(aabb1MinX, aabb1MaxX, aabb2MaxX, aabb2MaxX);
		float newMaxY = MathUtils.max(aabb1MinY, aabb1MaxY, aabb2MaxY, aabb2MaxY);
		
		aabb1.set(newMinX, newMinY, newMaxX, newMaxY);
		
		return aabb1;
	}
	
	public static float[] scale(IAabb2RF aabb1, IVec2RF scale, @ExtractionParam float[] res)
	{
		float aabb1MinX = aabb1.minX();
		float aabb1MinY = aabb1.minY();
		float aabb1MaxX = aabb1.maxX();
		float aabb1MaxY = aabb1.maxY();
		
		float scaleX = scale.x();
		float scaleY = scale.y();
		
		float scaledMinX = aabb1MinX * scaleX;
		float scaledMinY = aabb1MinY * scaleY;
		float scaledMaxX = aabb1MaxX * scaleX;
		float scaledMaxY = aabb1MaxY * scaleY;
		
		float newMinX = MathUtils.min(scaledMinX, scaledMaxX);
		float newMinY = MathUtils.min(scaledMinY, scaledMaxY);
		float newMaxX = MathUtils.max(scaledMinX, scaledMaxX);
		float newMaxY = MathUtils.max(scaledMinY, scaledMaxY);
		
		res[0] = newMinX;
		res[1] = newMinY;
		res[2] = newMaxX;
		res[3] = newMaxY;
		
		return res;
	}
	
	public static float[] scale(IAabb2RF aabb1, float[] scale, @ExtractionParam float[] res)
	{
		float aabb1MinX = aabb1.minX();
		float aabb1MinY = aabb1.minY();
		float aabb1MaxX = aabb1.maxX();
		float aabb1MaxY = aabb1.maxY();
		
		float scaleX = scale[0];
		float scaleY = scale[1];
		
		float scaledMinX = aabb1MinX * scaleX;
		float scaledMinY = aabb1MinY * scaleY;
		float scaledMaxX = aabb1MaxX * scaleX;
		float scaledMaxY = aabb1MaxY * scaleY;
		
		float newMinX = MathUtils.min(scaledMinX, scaledMaxX);
		float newMinY = MathUtils.min(scaledMinY, scaledMaxY);
		float newMaxX = MathUtils.max(scaledMinX, scaledMaxX);
		float newMaxY = MathUtils.max(scaledMinY, scaledMaxY);
		
		res[0] = newMinX;
		res[1] = newMinY;
		res[2] = newMaxX;
		res[3] = newMaxY;
		
		return res;
	}
	
	public static float[] scale(IAabb2RF aabb1, float scale, @ExtractionParam float[] res)
	{
		float aabb1MinX = aabb1.minX();
		float aabb1MinY = aabb1.minY();
		float aabb1MaxX = aabb1.maxX();
		float aabb1MaxY = aabb1.maxY();
		
		float scaleX = scale;
		float scaleY = scale;
		
		float scaledMinX = aabb1MinX * scaleX;
		float scaledMinY = aabb1MinY * scaleY;
		float scaledMaxX = aabb1MaxX * scaleX;
		float scaledMaxY = aabb1MaxY * scaleY;
		
		float newMinX = MathUtils.min(scaledMinX, scaledMaxX);
		float newMinY = MathUtils.min(scaledMinY, scaledMaxY);
		float newMaxX = MathUtils.max(scaledMinX, scaledMaxX);
		float newMaxY = MathUtils.max(scaledMinY, scaledMaxY);
		
		res[0] = newMinX;
		res[1] = newMinY;
		res[2] = newMaxX;
		res[3] = newMaxY;
		
		return res;
	}
	
	public static float[] scale(IAabb2RF aabb1, float scaleX, float scaleY, @ExtractionParam float[] res)
	{
		float aabb1MinX = aabb1.minX();
		float aabb1MinY = aabb1.minY();
		float aabb1MaxX = aabb1.maxX();
		float aabb1MaxY = aabb1.maxY();
		
		float scaledMinX = aabb1MinX * scaleX;
		float scaledMinY = aabb1MinY * scaleY;
		float scaledMaxX = aabb1MaxX * scaleX;
		float scaledMaxY = aabb1MaxY * scaleY;
		
		float newMinX = MathUtils.min(scaledMinX, scaledMaxX);
		float newMinY = MathUtils.min(scaledMinY, scaledMaxY);
		float newMaxX = MathUtils.max(scaledMinX, scaledMaxX);
		float newMaxY = MathUtils.max(scaledMinY, scaledMaxY);
		
		res[0] = newMinX;
		res[1] = newMinY;
		res[2] = newMaxX;
		res[3] = newMaxY;
		
		return res;
	}
	
	public static float[] scale(float[] aabb1, IVec2RF scale, @ExtractionParam float[] res)
	{
		float aabb1MinX = aabb1[0];
		float aabb1MinY = aabb1[1];
		float aabb1MaxX = aabb1[2];
		float aabb1MaxY = aabb1[3];
		
		float scaleX = scale.x();
		float scaleY = scale.y();
		
		float scaledMinX = aabb1MinX * scaleX;
		float scaledMinY = aabb1MinY * scaleY;
		float scaledMaxX = aabb1MaxX * scaleX;
		float scaledMaxY = aabb1MaxY * scaleY;
		
		float newMinX = MathUtils.min(scaledMinX, scaledMaxX);
		float newMinY = MathUtils.min(scaledMinY, scaledMaxY);
		float newMaxX = MathUtils.max(scaledMinX, scaledMaxX);
		float newMaxY = MathUtils.max(scaledMinY, scaledMaxY);
		
		res[0] = newMinX;
		res[1] = newMinY;
		res[2] = newMaxX;
		res[3] = newMaxY;
		
		return res;
	}
	
	public static float[] scale(IVec2RF aabb1Min, IVec2RF aabb1Max, IVec2RF scale, @ExtractionParam float[] res)
	{
		float aabb1MinX = aabb1Min.x();
		float aabb1MinY = aabb1Min.y();
		float aabb1MaxX = aabb1Max.x();
		float aabb1MaxY = aabb1Max.y();
		
		float scaleX = scale.x();
		float scaleY = scale.y();
		
		float scaledMinX = aabb1MinX * scaleX;
		float scaledMinY = aabb1MinY * scaleY;
		float scaledMaxX = aabb1MaxX * scaleX;
		float scaledMaxY = aabb1MaxY * scaleY;
		
		float newMinX = MathUtils.min(scaledMinX, scaledMaxX);
		float newMinY = MathUtils.min(scaledMinY, scaledMaxY);
		float newMaxX = MathUtils.max(scaledMinX, scaledMaxX);
		float newMaxY = MathUtils.max(scaledMinY, scaledMaxY);
		
		res[0] = newMinX;
		res[1] = newMinY;
		res[2] = newMaxX;
		res[3] = newMaxY;
		
		return res;
	}
	
	public static float[] scale(IVec2RF aabb1Min, IVec2RF aabb1Max, float[] scale, @ExtractionParam float[] res)
	{
		float aabb1MinX = aabb1Min.x();
		float aabb1MinY = aabb1Min.y();
		float aabb1MaxX = aabb1Max.x();
		float aabb1MaxY = aabb1Max.y();
		
		float scaleX = scale[0];
		float scaleY = scale[1];
		
		float scaledMinX = aabb1MinX * scaleX;
		float scaledMinY = aabb1MinY * scaleY;
		float scaledMaxX = aabb1MaxX * scaleX;
		float scaledMaxY = aabb1MaxY * scaleY;
		
		float newMinX = MathUtils.min(scaledMinX, scaledMaxX);
		float newMinY = MathUtils.min(scaledMinY, scaledMaxY);
		float newMaxX = MathUtils.max(scaledMinX, scaledMaxX);
		float newMaxY = MathUtils.max(scaledMinY, scaledMaxY);
		
		res[0] = newMinX;
		res[1] = newMinY;
		res[2] = newMaxX;
		res[3] = newMaxY;
		
		return res;
	}
	
	public static float[] scale(IVec2RF aabb1Min, IVec2RF aabb1Max, float scale, @ExtractionParam float[] res)
	{
		float aabb1MinX = aabb1Min.x();
		float aabb1MinY = aabb1Min.y();
		float aabb1MaxX = aabb1Max.x();
		float aabb1MaxY = aabb1Max.y();
		
		float scaleX = scale;
		float scaleY = scale;
		
		float scaledMinX = aabb1MinX * scaleX;
		float scaledMinY = aabb1MinY * scaleY;
		float scaledMaxX = aabb1MaxX * scaleX;
		float scaledMaxY = aabb1MaxY * scaleY;
		
		float newMinX = MathUtils.min(scaledMinX, scaledMaxX);
		float newMinY = MathUtils.min(scaledMinY, scaledMaxY);
		float newMaxX = MathUtils.max(scaledMinX, scaledMaxX);
		float newMaxY = MathUtils.max(scaledMinY, scaledMaxY);
		
		res[0] = newMinX;
		res[1] = newMinY;
		res[2] = newMaxX;
		res[3] = newMaxY;
		
		return res;
	}
	
	public static float[] scale(IVec2RF aabb1Min, IVec2RF aabb1Max, float scaleX, float scaleY, @ExtractionParam float[] res)
	{
		float aabb1MinX = aabb1Min.x();
		float aabb1MinY = aabb1Min.y();
		float aabb1MaxX = aabb1Max.x();
		float aabb1MaxY = aabb1Max.y();
		
		float scaledMinX = aabb1MinX * scaleX;
		float scaledMinY = aabb1MinY * scaleY;
		float scaledMaxX = aabb1MaxX * scaleX;
		float scaledMaxY = aabb1MaxY * scaleY;
		
		float newMinX = MathUtils.min(scaledMinX, scaledMaxX);
		float newMinY = MathUtils.min(scaledMinY, scaledMaxY);
		float newMaxX = MathUtils.max(scaledMinX, scaledMaxX);
		float newMaxY = MathUtils.max(scaledMinY, scaledMaxY);
		
		res[0] = newMinX;
		res[1] = newMinY;
		res[2] = newMaxX;
		res[3] = newMaxY;
		
		return res;
	}
	
	public static float[] scale(IVec2RF aabb1Min, float[] aabb1Max, IVec2RF scale, @ExtractionParam float[]res)
	{
		float aabb1MinX = aabb1Min.x();
		float aabb1MinY = aabb1Min.y();
		float aabb1MaxX = aabb1Max[0];
		float aabb1MaxY = aabb1Max[1];
		
		float scaleX = scale.x();
		float scaleY = scale.y();
		
		float scaledMinX = aabb1MinX * scaleX;
		float scaledMinY = aabb1MinY * scaleY;
		float scaledMaxX = aabb1MaxX * scaleX;
		float scaledMaxY = aabb1MaxY * scaleY;
		
		float newMinX = MathUtils.min(scaledMinX, scaledMaxX);
		float newMinY = MathUtils.min(scaledMinY, scaledMaxY);
		float newMaxX = MathUtils.max(scaledMinX, scaledMaxX);
		float newMaxY = MathUtils.max(scaledMinY, scaledMaxY);
		
		res[0] = newMinX;
		res[1] = newMinY;
		res[2] = newMaxX;
		res[3] = newMaxY;
		
		return res;
	}
	
	public static float[] scale(IVec2RF aabb1Min, float[] aabb1Max, float[] scale, @ExtractionParam float[] res)
	{
		float aabb1MinX = aabb1Min.x();
		float aabb1MinY = aabb1Min.y();
		float aabb1MaxX = aabb1Max[0];
		float aabb1MaxY = aabb1Max[1];
		
		float scaleX = scale[0];
		float scaleY = scale[1];
		
		float scaledMinX = aabb1MinX * scaleX;
		float scaledMinY = aabb1MinY * scaleY;
		float scaledMaxX = aabb1MaxX * scaleX;
		float scaledMaxY = aabb1MaxY * scaleY;
		
		float newMinX = MathUtils.min(scaledMinX, scaledMaxX);
		float newMinY = MathUtils.min(scaledMinY, scaledMaxY);
		float newMaxX = MathUtils.max(scaledMinX, scaledMaxX);
		float newMaxY = MathUtils.max(scaledMinY, scaledMaxY);
		
		res[0] = newMinX;
		res[1] = newMinY;
		res[2] = newMaxX;
		res[3] = newMaxY;
		
		return res;
	}
	
	public static float[] scale(IVec2RF aabb1Min, float[] aabb1Max, float scale, @ExtractionParam float[] res)
	{
		float aabb1MinX = aabb1Min.x();
		float aabb1MinY = aabb1Min.y();
		float aabb1MaxX = aabb1Max[0];
		float aabb1MaxY = aabb1Max[1];
		
		float scaleX = scale;
		float scaleY = scale;
		
		float scaledMinX = aabb1MinX * scaleX;
		float scaledMinY = aabb1MinY * scaleY;
		float scaledMaxX = aabb1MaxX * scaleX;
		float scaledMaxY = aabb1MaxY * scaleY;
		
		float newMinX = MathUtils.min(scaledMinX, scaledMaxX);
		float newMinY = MathUtils.min(scaledMinY, scaledMaxY);
		float newMaxX = MathUtils.max(scaledMinX, scaledMaxX);
		float newMaxY = MathUtils.max(scaledMinY, scaledMaxY);
		
		res[0] = newMinX;
		res[1] = newMinY;
		res[2] = newMaxX;
		res[3] = newMaxY;
		
		return res;
	}
	
	public static float[] scale(IVec2RF aabb1Min, float[] aabb1Max, float scaleX, float scaleY, @ExtractionParam float[] res)
	{
		float aabb1MinX = aabb1Min.x();
		float aabb1MinY = aabb1Min.y();
		float aabb1MaxX = aabb1Max[0];
		float aabb1MaxY = aabb1Max[1];
		
		float scaledMinX = aabb1MinX * scaleX;
		float scaledMinY = aabb1MinY * scaleY;
		float scaledMaxX = aabb1MaxX * scaleX;
		float scaledMaxY = aabb1MaxY * scaleY;
		
		float newMinX = MathUtils.min(scaledMinX, scaledMaxX);
		float newMinY = MathUtils.min(scaledMinY, scaledMaxY);
		float newMaxX = MathUtils.max(scaledMinX, scaledMaxX);
		float newMaxY = MathUtils.max(scaledMinY, scaledMaxY);
		
		res[0] = newMinX;
		res[1] = newMinY;
		res[2] = newMaxX;
		res[3] = newMaxY;
		
		return res;
	}
	
	public static float[] scale(IVec2RF aabb1Min, float aabb1MaxX, float aabb1MaxY, IVec2RF scale, @ExtractionParam float[] res)
	{
		float aabb1MinX = aabb1Min.x();
		float aabb1MinY = aabb1Min.y();
		
		float scaleX = scale.x();
		float scaleY = scale.y();
		
		float scaledMinX = aabb1MinX * scaleX;
		float scaledMinY = aabb1MinY * scaleY;
		float scaledMaxX = aabb1MaxX * scaleX;
		float scaledMaxY = aabb1MaxY * scaleY;
		
		float newMinX = MathUtils.min(scaledMinX, scaledMaxX);
		float newMinY = MathUtils.min(scaledMinY, scaledMaxY);
		float newMaxX = MathUtils.max(scaledMinX, scaledMaxX);
		float newMaxY = MathUtils.max(scaledMinY, scaledMaxY);
		
		res[0] = newMinX;
		res[1] = newMinY;
		res[2] = newMaxX;
		res[3] = newMaxY;
		
		return res;
	}
	
	public static float[] scale(IVec2RF aabb1Min, float aabb1MaxX, float aabb1MaxY, float[] scale, @ExtractionParam float[] res)
	{
		float aabb1MinX = aabb1Min.x();
		float aabb1MinY = aabb1Min.y();
		
		float scaleX = scale[0];
		float scaleY = scale[1];
		
		float scaledMinX = aabb1MinX * scaleX;
		float scaledMinY = aabb1MinY * scaleY;
		float scaledMaxX = aabb1MaxX * scaleX;
		float scaledMaxY = aabb1MaxY * scaleY;
		
		float newMinX = MathUtils.min(scaledMinX, scaledMaxX);
		float newMinY = MathUtils.min(scaledMinY, scaledMaxY);
		float newMaxX = MathUtils.max(scaledMinX, scaledMaxX);
		float newMaxY = MathUtils.max(scaledMinY, scaledMaxY);
		
		res[0] = newMinX;
		res[1] = newMinY;
		res[2] = newMaxX;
		res[3] = newMaxY;
		
		return res;
	}
	
	public static float[] scale(IVec2RF aabb1Min, float aabb1MaxX, float aabb1MaxY, float scale, @ExtractionParam float[] res)
	{
		float aabb1MinX = aabb1Min.x();
		float aabb1MinY = aabb1Min.y();
		
		float scaleX = scale;
		float scaleY = scale;
		
		float scaledMinX = aabb1MinX * scaleX;
		float scaledMinY = aabb1MinY * scaleY;
		float scaledMaxX = aabb1MaxX * scaleX;
		float scaledMaxY = aabb1MaxY * scaleY;
		
		float newMinX = MathUtils.min(scaledMinX, scaledMaxX);
		float newMinY = MathUtils.min(scaledMinY, scaledMaxY);
		float newMaxX = MathUtils.max(scaledMinX, scaledMaxX);
		float newMaxY = MathUtils.max(scaledMinY, scaledMaxY);
		
		res[0] = newMinX;
		res[1] = newMinY;
		res[2] = newMaxX;
		res[3] = newMaxY;
		
		return res;
	}
	
	public static float[] scale(IVec2RF aabb1Min, float aabb1MaxX, float aabb1MaxY, float scaleX, float scaleY, @ExtractionParam float[] res)
	{
		float aabb1MinX = aabb1Min.x();
		float aabb1MinY = aabb1Min.y();
		
		float scaledMinX = aabb1MinX * scaleX;
		float scaledMinY = aabb1MinY * scaleY;
		float scaledMaxX = aabb1MaxX * scaleX;
		float scaledMaxY = aabb1MaxY * scaleY;
		
		float newMinX = MathUtils.min(scaledMinX, scaledMaxX);
		float newMinY = MathUtils.min(scaledMinY, scaledMaxY);
		float newMaxX = MathUtils.max(scaledMinX, scaledMaxX);
		float newMaxY = MathUtils.max(scaledMinY, scaledMaxY);
		
		res[0] = newMinX;
		res[1] = newMinY;
		res[2] = newMaxX;
		res[3] = newMaxY;
		
		return res;
	}
	
	public static float[] scale(float[] aabb1Min, IVec2RF aabb1Max, IVec2RF scale, @ExtractionParam float[] res)
	{
		float aabb1MinX = aabb1Min[0];
		float aabb1MinY = aabb1Min[1];
		float aabb1MaxX = aabb1Max.x();
		float aabb1MaxY = aabb1Max.y();
		
		float scaleX = scale.x();
		float scaleY = scale.y();
		
		float scaledMinX = aabb1MinX * scaleX;
		float scaledMinY = aabb1MinY * scaleY;
		float scaledMaxX = aabb1MaxX * scaleX;
		float scaledMaxY = aabb1MaxY * scaleY;
		
		float newMinX = MathUtils.min(scaledMinX, scaledMaxX);
		float newMinY = MathUtils.min(scaledMinY, scaledMaxY);
		float newMaxX = MathUtils.max(scaledMinX, scaledMaxX);
		float newMaxY = MathUtils.max(scaledMinY, scaledMaxY);
		
		res[0] = newMinX;
		res[1] = newMinY;
		res[2] = newMaxX;
		res[3] = newMaxY;
		
		return res;
	}
	
	public static float[] scale(float[] aabb1Min, IVec2RF aabb1Max, float[] scale, @ExtractionParam float[] res)
	{
		float aabb1MinX = aabb1Min[0];
		float aabb1MinY = aabb1Min[1];
		float aabb1MaxX = aabb1Max.x();
		float aabb1MaxY = aabb1Max.y();
		
		float scaleX = scale[0];
		float scaleY = scale[1];
		
		float scaledMinX = aabb1MinX * scaleX;
		float scaledMinY = aabb1MinY * scaleY;
		float scaledMaxX = aabb1MaxX * scaleX;
		float scaledMaxY = aabb1MaxY * scaleY;
		
		float newMinX = MathUtils.min(scaledMinX, scaledMaxX);
		float newMinY = MathUtils.min(scaledMinY, scaledMaxY);
		float newMaxX = MathUtils.max(scaledMinX, scaledMaxX);
		float newMaxY = MathUtils.max(scaledMinY, scaledMaxY);
		
		res[0] = newMinX;
		res[1] = newMinY;
		res[2] = newMaxX;
		res[3] = newMaxY;
		
		return res;
	}
	
	public static float[] scale(float[] aabb1Min, IVec2RF aabb1Max, float scale, @ExtractionParam float[] res)
	{
		float aabb1MinX = aabb1Min[0];
		float aabb1MinY = aabb1Min[1];
		float aabb1MaxX = aabb1Max.x();
		float aabb1MaxY = aabb1Max.y();
		
		float scaleX = scale;
		float scaleY = scale;
		
		float scaledMinX = aabb1MinX * scaleX;
		float scaledMinY = aabb1MinY * scaleY;
		float scaledMaxX = aabb1MaxX * scaleX;
		float scaledMaxY = aabb1MaxY * scaleY;
		
		float newMinX = MathUtils.min(scaledMinX, scaledMaxX);
		float newMinY = MathUtils.min(scaledMinY, scaledMaxY);
		float newMaxX = MathUtils.max(scaledMinX, scaledMaxX);
		float newMaxY = MathUtils.max(scaledMinY, scaledMaxY);
		
		res[0] = newMinX;
		res[1] = newMinY;
		res[2] = newMaxX;
		res[3] = newMaxY;
		
		return res;
	}
	
	public static float[] scale(float[] aabb1Min, IVec2RF aabb1Max, float scaleX, float scaleY, @ExtractionParam float[] res)
	{
		float aabb1MinX = aabb1Min[0];
		float aabb1MinY = aabb1Min[1];
		float aabb1MaxX = aabb1Max.x();
		float aabb1MaxY = aabb1Max.y();
		
		float scaledMinX = aabb1MinX * scaleX;
		float scaledMinY = aabb1MinY * scaleY;
		float scaledMaxX = aabb1MaxX * scaleX;
		float scaledMaxY = aabb1MaxY * scaleY;
		
		float newMinX = MathUtils.min(scaledMinX, scaledMaxX);
		float newMinY = MathUtils.min(scaledMinY, scaledMaxY);
		float newMaxX = MathUtils.max(scaledMinX, scaledMaxX);
		float newMaxY = MathUtils.max(scaledMinY, scaledMaxY);
		
		res[0] = newMinX;
		res[1] = newMinY;
		res[2] = newMaxX;
		res[3] = newMaxY;
		
		return res;
	}
	
	public static float[] scale(float[] aabb1Min, float[] aabb1Max, IVec2RF scale, @ExtractionParam float[] res)
	{
		float aabb1MinX = aabb1Min[0];
		float aabb1MinY = aabb1Min[1];
		float aabb1MaxX = aabb1Max[0];
		float aabb1MaxY = aabb1Max[1];
		
		float scaleX = scale.x();
		float scaleY = scale.y();
		
		float scaledMinX = aabb1MinX * scaleX;
		float scaledMinY = aabb1MinY * scaleY;
		float scaledMaxX = aabb1MaxX * scaleX;
		float scaledMaxY = aabb1MaxY * scaleY;
		
		float newMinX = MathUtils.min(scaledMinX, scaledMaxX);
		float newMinY = MathUtils.min(scaledMinY, scaledMaxY);
		float newMaxX = MathUtils.max(scaledMinX, scaledMaxX);
		float newMaxY = MathUtils.max(scaledMinY, scaledMaxY);
		
		res[0] = newMinX;
		res[1] = newMinY;
		res[2] = newMaxX;
		res[3] = newMaxY;
		
		return res;
	}
	
	public static float[] scale(float[] aabb1Min, float aabb1MaxX, float aabb1MaxY, IVec2RF scale, @ExtractionParam float[] res)
	{
		float aabb1MinX = aabb1Min[0];
		float aabb1MinY = aabb1Min[1];
		
		float scaleX = scale.x();
		float scaleY = scale.y();
		
		float scaledMinX = aabb1MinX * scaleX;
		float scaledMinY = aabb1MinY * scaleY;
		float scaledMaxX = aabb1MaxX * scaleX;
		float scaledMaxY = aabb1MaxY * scaleY;
		
		float newMinX = MathUtils.min(scaledMinX, scaledMaxX);
		float newMinY = MathUtils.min(scaledMinY, scaledMaxY);
		float newMaxX = MathUtils.max(scaledMinX, scaledMaxX);
		float newMaxY = MathUtils.max(scaledMinY, scaledMaxY);
		
		res[0] = newMinX;
		res[1] = newMinY;
		res[2] = newMaxX;
		res[3] = newMaxY;
		
		return res;
	}
	
	public static float[] scale(float aabb1MinX, float aabb1MinY, IVec2RF aabb1Max, IVec2RF scale, @ExtractionParam float[] res)
	{
		float aabb1MaxX = aabb1Max.x();
		float aabb1MaxY = aabb1Max.y();
		
		float scaleX = scale.x();
		float scaleY = scale.y();
		
		float scaledMinX = aabb1MinX * scaleX;
		float scaledMinY = aabb1MinY * scaleY;
		float scaledMaxX = aabb1MaxX * scaleX;
		float scaledMaxY = aabb1MaxY * scaleY;
		
		float newMinX = MathUtils.min(scaledMinX, scaledMaxX);
		float newMinY = MathUtils.min(scaledMinY, scaledMaxY);
		float newMaxX = MathUtils.max(scaledMinX, scaledMaxX);
		float newMaxY = MathUtils.max(scaledMinY, scaledMaxY);
		
		res[0] = newMinX;
		res[1] = newMinY;
		res[2] = newMaxX;
		res[3] = newMaxY;
		
		return res;
	}
	
	public static float[] scale(float aabb1MinX, float aabb1MinY, IVec2RF aabb1Max, float[] scale, @ExtractionParam float[] res)
	{
		float aabb1MaxX = aabb1Max.x();
		float aabb1MaxY = aabb1Max.y();
		
		float scaleX = scale[0];
		float scaleY = scale[1];
		
		float scaledMinX = aabb1MinX * scaleX;
		float scaledMinY = aabb1MinY * scaleY;
		float scaledMaxX = aabb1MaxX * scaleX;
		float scaledMaxY = aabb1MaxY * scaleY;
		
		float newMinX = MathUtils.min(scaledMinX, scaledMaxX);
		float newMinY = MathUtils.min(scaledMinY, scaledMaxY);
		float newMaxX = MathUtils.max(scaledMinX, scaledMaxX);
		float newMaxY = MathUtils.max(scaledMinY, scaledMaxY);
		
		res[0] = newMinX;
		res[1] = newMinY;
		res[2] = newMaxX;
		res[3] = newMaxY;
		
		return res;
	}
	
	public static float[] scale(float aabb1MinX, float aabb1MinY, IVec2RF aabb1Max, float scale, @ExtractionParam float[] res)
	{
		float aabb1MaxX = aabb1Max.x();
		float aabb1MaxY = aabb1Max.y();
		
		float scaleX = scale;
		float scaleY = scale;
		
		float scaledMinX = aabb1MinX * scaleX;
		float scaledMinY = aabb1MinY * scaleY;
		float scaledMaxX = aabb1MaxX * scaleX;
		float scaledMaxY = aabb1MaxY * scaleY;
		
		float newMinX = MathUtils.min(scaledMinX, scaledMaxX);
		float newMinY = MathUtils.min(scaledMinY, scaledMaxY);
		float newMaxX = MathUtils.max(scaledMinX, scaledMaxX);
		float newMaxY = MathUtils.max(scaledMinY, scaledMaxY);
		
		res[0] = newMinX;
		res[1] = newMinY;
		res[2] = newMaxX;
		res[3] = newMaxY;
		
		return res;
	}
	
	public static float[] scale(float aabb1MinX, float aabb1MinY, IVec2RF aabb1Max, float scaleX, float scaleY, @ExtractionParam float[] res)
	{
		float aabb1MaxX = aabb1Max.x();
		float aabb1MaxY = aabb1Max.y();
		
		float scaledMinX = aabb1MinX * scaleX;
		float scaledMinY = aabb1MinY * scaleY;
		float scaledMaxX = aabb1MaxX * scaleX;
		float scaledMaxY = aabb1MaxY * scaleY;
		
		float newMinX = MathUtils.min(scaledMinX, scaledMaxX);
		float newMinY = MathUtils.min(scaledMinY, scaledMaxY);
		float newMaxX = MathUtils.max(scaledMinX, scaledMaxX);
		float newMaxY = MathUtils.max(scaledMinY, scaledMaxY);
		
		res[0] = newMinX;
		res[1] = newMinY;
		res[2] = newMaxX;
		res[3] = newMaxY;
		
		return res;
	}
	
	public static float[] scale(float aabb1MinX, float aabb1MinY, float[] aabb1Max, IVec2RF scale, @ExtractionParam float[] res)
	{
		float aabb1MaxX = aabb1Max[0];
		float aabb1MaxY = aabb1Max[1];
		
		float scaleX = scale.x();
		float scaleY = scale.y();
		
		float scaledMinX = aabb1MinX * scaleX;
		float scaledMinY = aabb1MinY * scaleY;
		float scaledMaxX = aabb1MaxX * scaleX;
		float scaledMaxY = aabb1MaxY * scaleY;
		
		float newMinX = MathUtils.min(scaledMinX, scaledMaxX);
		float newMinY = MathUtils.min(scaledMinY, scaledMaxY);
		float newMaxX = MathUtils.max(scaledMinX, scaledMaxX);
		float newMaxY = MathUtils.max(scaledMinY, scaledMaxY);
		
		res[0] = newMinX;
		res[1] = newMinY;
		res[2] = newMaxX;
		res[3] = newMaxY;
		
		return res;
	}
	
	public static float[] scale(float aabb1MinX, float aabb1MinY, float aabb1MaxX, float aabb1MaxY, IVec2RF scale, @ExtractionParam float[] res)
	{
		float scaleX = scale.x();
		float scaleY = scale.y();
		
		float scaledMinX = aabb1MinX * scaleX;
		float scaledMinY = aabb1MinY * scaleY;
		float scaledMaxX = aabb1MaxX * scaleX;
		float scaledMaxY = aabb1MaxY * scaleY;
		
		float newMinX = MathUtils.min(scaledMinX, scaledMaxX);
		float newMinY = MathUtils.min(scaledMinY, scaledMaxY);
		float newMaxX = MathUtils.max(scaledMinX, scaledMaxX);
		float newMaxY = MathUtils.max(scaledMinY, scaledMaxY);
		
		res[0] = newMinX;
		res[1] = newMinY;
		res[2] = newMaxX;
		res[3] = newMaxY;
		
		return res;
	}
	
	public static float[] scaleAssign(@ExtractionParam float[] aabb1, IVec2RF scale)
	{
		float aabb1MinX = aabb1[0];
		float aabb1MinY = aabb1[1];
		float aabb1MaxX = aabb1[3];
		float aabb1MaxY = aabb1[4];
		
		float scaleX = scale.x();
		float scaleY = scale.y();
		
		float scaledMinX = aabb1MinX * scaleX;
		float scaledMinY = aabb1MinY * scaleY;
		float scaledMaxX = aabb1MaxX * scaleX;
		float scaledMaxY = aabb1MaxY * scaleY;
		
		float newMinX = MathUtils.min(scaledMinX, scaledMaxX);
		float newMinY = MathUtils.min(scaledMinY, scaledMaxY);
		float newMaxX = MathUtils.max(scaledMinX, scaledMaxX);
		float newMaxY = MathUtils.max(scaledMinY, scaledMaxY);
		
		aabb1[0] = newMinX;
		aabb1[1] = newMinY;
		aabb1[2] = newMaxX;
		aabb1[3] = newMaxY;
		
		return aabb1;
	}
	
	public static <T extends IAabb2WF> T scale(IAabb2RF aabb1, IVec2RF scale, @ExtractionParam T res)
	{
		float aabb1MinX = aabb1.minX();
		float aabb1MinY = aabb1.minY();
		float aabb1MaxX = aabb1.maxX();
		float aabb1MaxY = aabb1.maxY();
		
		float scaleX = scale.x();
		float scaleY = scale.y();
		
		float scaledMinX = aabb1MinX * scaleX;
		float scaledMinY = aabb1MinY * scaleY;
		float scaledMaxX = aabb1MaxX * scaleX;
		float scaledMaxY = aabb1MaxY * scaleY;
		
		float newMinX = MathUtils.min(scaledMinX, scaledMaxX);
		float newMinY = MathUtils.min(scaledMinY, scaledMaxY);
		float newMaxX = MathUtils.max(scaledMinX, scaledMaxX);
		float newMaxY = MathUtils.max(scaledMinY, scaledMaxY);
		
		res.set(newMinX, newMinY, newMaxX, newMaxY);
		
		return res;
	}
	
	public static <T extends IAabb2WF> T scale(IAabb2RF aabb1, float[] scale, @ExtractionParam T res)
	{
		float aabb1MinX = aabb1.minX();
		float aabb1MinY = aabb1.minY();
		float aabb1MaxX = aabb1.maxX();
		float aabb1MaxY = aabb1.maxY();
		
		float scaleX = scale[0];
		float scaleY = scale[1];
		
		float scaledMinX = aabb1MinX * scaleX;
		float scaledMinY = aabb1MinY * scaleY;
		float scaledMaxX = aabb1MaxX * scaleX;
		float scaledMaxY = aabb1MaxY * scaleY;
		
		float newMinX = MathUtils.min(scaledMinX, scaledMaxX);
		float newMinY = MathUtils.min(scaledMinY, scaledMaxY);
		float newMaxX = MathUtils.max(scaledMinX, scaledMaxX);
		float newMaxY = MathUtils.max(scaledMinY, scaledMaxY);
		
		res.set(newMinX, newMinY, newMaxX, newMaxY);
		
		return res;
	}
	
	public static <T extends IAabb2WF> T scale(IAabb2RF aabb1, float scale, @ExtractionParam T res)
	{
		float aabb1MinX = aabb1.minX();
		float aabb1MinY = aabb1.minY();
		float aabb1MaxX = aabb1.maxX();
		float aabb1MaxY = aabb1.maxY();
		
		float scaleX = scale;
		float scaleY = scale;
		
		float scaledMinX = aabb1MinX * scaleX;
		float scaledMinY = aabb1MinY * scaleY;
		float scaledMaxX = aabb1MaxX * scaleX;
		float scaledMaxY = aabb1MaxY * scaleY;
		
		float newMinX = MathUtils.min(scaledMinX, scaledMaxX);
		float newMinY = MathUtils.min(scaledMinY, scaledMaxY);
		float newMaxX = MathUtils.max(scaledMinX, scaledMaxX);
		float newMaxY = MathUtils.max(scaledMinY, scaledMaxY);
		
		res.set(newMinX, newMinY, newMaxX, newMaxY);
		
		return res;
	}
	
	public static <T extends IAabb2WF> T scale(IAabb2RF aabb1, float scaleX, float scaleY, @ExtractionParam T res)
	{
		float aabb1MinX = aabb1.minX();
		float aabb1MinY = aabb1.minY();
		float aabb1MaxX = aabb1.maxX();
		float aabb1MaxY = aabb1.maxY();
		
		float scaledMinX = aabb1MinX * scaleX;
		float scaledMinY = aabb1MinY * scaleY;
		float scaledMaxX = aabb1MaxX * scaleX;
		float scaledMaxY = aabb1MaxY * scaleY;
		
		float newMinX = MathUtils.min(scaledMinX, scaledMaxX);
		float newMinY = MathUtils.min(scaledMinY, scaledMaxY);
		float newMaxX = MathUtils.max(scaledMinX, scaledMaxX);
		float newMaxY = MathUtils.max(scaledMinY, scaledMaxY);
		
		res.set(newMinX, newMinY, newMaxX, newMaxY);
		
		return res;
	}
	
	public static <T extends IAabb2WF> T scale(float[] aabb1, IVec2RF scale, @ExtractionParam T res)
	{
		float aabb1MinX = aabb1[0];
		float aabb1MinY = aabb1[1];
		float aabb1MaxX = aabb1[3];
		float aabb1MaxY = aabb1[4];
		
		float scaleX = scale.x();
		float scaleY = scale.y();
		
		float scaledMinX = aabb1MinX * scaleX;
		float scaledMinY = aabb1MinY * scaleY;
		float scaledMaxX = aabb1MaxX * scaleX;
		float scaledMaxY = aabb1MaxY * scaleY;
		
		float newMinX = MathUtils.min(scaledMinX, scaledMaxX);
		float newMinY = MathUtils.min(scaledMinY, scaledMaxY);
		float newMaxX = MathUtils.max(scaledMinX, scaledMaxX);
		float newMaxY = MathUtils.max(scaledMinY, scaledMaxY);
		
		res.set(newMinX, newMinY, newMaxX, newMaxY);
		
		return res;
	}
	
	public static <T extends IAabb2WF> T scale(float[] aabb1, float[] scale, @ExtractionParam T res)
	{
		float aabb1MinX = aabb1[0];
		float aabb1MinY = aabb1[1];
		float aabb1MaxX = aabb1[3];
		float aabb1MaxY = aabb1[4];
		
		float scaleX = scale[0];
		float scaleY = scale[1];
		
		float scaledMinX = aabb1MinX * scaleX;
		float scaledMinY = aabb1MinY * scaleY;
		float scaledMaxX = aabb1MaxX * scaleX;
		float scaledMaxY = aabb1MaxY * scaleY;
		
		float newMinX = MathUtils.min(scaledMinX, scaledMaxX);
		float newMinY = MathUtils.min(scaledMinY, scaledMaxY);
		float newMaxX = MathUtils.max(scaledMinX, scaledMaxX);
		float newMaxY = MathUtils.max(scaledMinY, scaledMaxY);
		
		res.set(newMinX, newMinY, newMaxX, newMaxY);
		
		return res;
	}
	
	public static <T extends IAabb2WF> T scale(float[] aabb1, float scale, @ExtractionParam T res)
	{
		float aabb1MinX = aabb1[0];
		float aabb1MinY = aabb1[1];
		float aabb1MaxX = aabb1[3];
		float aabb1MaxY = aabb1[4];
		
		float scaleX = scale;
		float scaleY = scale;
		
		float scaledMinX = aabb1MinX * scaleX;
		float scaledMinY = aabb1MinY * scaleY;
		float scaledMaxX = aabb1MaxX * scaleX;
		float scaledMaxY = aabb1MaxY * scaleY;
		
		float newMinX = MathUtils.min(scaledMinX, scaledMaxX);
		float newMinY = MathUtils.min(scaledMinY, scaledMaxY);
		float newMaxX = MathUtils.max(scaledMinX, scaledMaxX);
		float newMaxY = MathUtils.max(scaledMinY, scaledMaxY);
		
		res.set(newMinX, newMinY, newMaxX, newMaxY);
		
		return res;
	}
	
	public static <T extends IAabb2WF> T scale(float[] aabb1, float scaleX, float scaleY, @ExtractionParam T res)
	{
		float aabb1MinX = aabb1[0];
		float aabb1MinY = aabb1[1];
		float aabb1MaxX = aabb1[3];
		float aabb1MaxY = aabb1[4];
		
		float scaledMinX = aabb1MinX * scaleX;
		float scaledMinY = aabb1MinY * scaleY;
		float scaledMaxX = aabb1MaxX * scaleX;
		float scaledMaxY = aabb1MaxY * scaleY;
		
		float newMinX = MathUtils.min(scaledMinX, scaledMaxX);
		float newMinY = MathUtils.min(scaledMinY, scaledMaxY);
		float newMaxX = MathUtils.max(scaledMinX, scaledMaxX);
		float newMaxY = MathUtils.max(scaledMinY, scaledMaxY);
		
		res.set(newMinX, newMinY, newMaxX, newMaxY);
		
		return res;
	}
	
	public static <T extends IAabb2WF> T scale(IVec2RF aabb1Min, IVec2RF aabb1Max, IVec2RF scale, @ExtractionParam T res)
	{
		float aabb1MinX = aabb1Min.x();
		float aabb1MinY = aabb1Min.y();
		float aabb1MaxX = aabb1Max.x();
		float aabb1MaxY = aabb1Max.y();
		
		float scaleX = scale.x();
		float scaleY = scale.y();
		
		float scaledMinX = aabb1MinX * scaleX;
		float scaledMinY = aabb1MinY * scaleY;
		float scaledMaxX = aabb1MaxX * scaleX;
		float scaledMaxY = aabb1MaxY * scaleY;
		
		float newMinX = MathUtils.min(scaledMinX, scaledMaxX);
		float newMinY = MathUtils.min(scaledMinY, scaledMaxY);
		float newMaxX = MathUtils.max(scaledMinX, scaledMaxX);
		float newMaxY = MathUtils.max(scaledMinY, scaledMaxY);
		
		res.set(newMinX, newMinY, newMaxX, newMaxY);
		
		return res;
	}
	
	public static <T extends IAabb2WF> T scale(IVec2RF aabb1Min, IVec2RF aabb1Max, float[] scale, @ExtractionParam T res)
	{
		float aabb1MinX = aabb1Min.x();
		float aabb1MinY = aabb1Min.y();
		float aabb1MaxX = aabb1Max.x();
		float aabb1MaxY = aabb1Max.y();
		
		float scaleX = scale[0];
		float scaleY = scale[1];
		
		float scaledMinX = aabb1MinX * scaleX;
		float scaledMinY = aabb1MinY * scaleY;
		float scaledMaxX = aabb1MaxX * scaleX;
		float scaledMaxY = aabb1MaxY * scaleY;
		
		float newMinX = MathUtils.min(scaledMinX, scaledMaxX);
		float newMinY = MathUtils.min(scaledMinY, scaledMaxY);
		float newMaxX = MathUtils.max(scaledMinX, scaledMaxX);
		float newMaxY = MathUtils.max(scaledMinY, scaledMaxY);
		
		res.set(newMinX, newMinY, newMaxX, newMaxY);
		
		return res;
	}
	
	public static <T extends IAabb2WF> T scale(IVec2RF aabb1Min, IVec2RF aabb1Max, float scale, @ExtractionParam T res)
	{
		float aabb1MinX = aabb1Min.x();
		float aabb1MinY = aabb1Min.y();
		float aabb1MaxX = aabb1Max.x();
		float aabb1MaxY = aabb1Max.y();
		
		float scaleX = scale;
		float scaleY = scale;
		
		float scaledMinX = aabb1MinX * scaleX;
		float scaledMinY = aabb1MinY * scaleY;
		float scaledMaxX = aabb1MaxX * scaleX;
		float scaledMaxY = aabb1MaxY * scaleY;
		
		float newMinX = MathUtils.min(scaledMinX, scaledMaxX);
		float newMinY = MathUtils.min(scaledMinY, scaledMaxY);
		float newMaxX = MathUtils.max(scaledMinX, scaledMaxX);
		float newMaxY = MathUtils.max(scaledMinY, scaledMaxY);
		
		res.set(newMinX, newMinY, newMaxX, newMaxY);
		
		return res;
	}
	
	public static <T extends IAabb2WF> T scale(IVec2RF aabb1Min, IVec2RF aabb1Max, float scaleX, float scaleY, @ExtractionParam T res)
	{
		float aabb1MinX = aabb1Min.x();
		float aabb1MinY = aabb1Min.y();
		float aabb1MaxX = aabb1Max.x();
		float aabb1MaxY = aabb1Max.y();
		
		float scaledMinX = aabb1MinX * scaleX;
		float scaledMinY = aabb1MinY * scaleY;
		float scaledMaxX = aabb1MaxX * scaleX;
		float scaledMaxY = aabb1MaxY * scaleY;
		
		float newMinX = MathUtils.min(scaledMinX, scaledMaxX);
		float newMinY = MathUtils.min(scaledMinY, scaledMaxY);
		float newMaxX = MathUtils.max(scaledMinX, scaledMaxX);
		float newMaxY = MathUtils.max(scaledMinY, scaledMaxY);
		
		res.set(newMinX, newMinY, newMaxX, newMaxY);
		
		return res;
	}
	
	public static <T extends IAabb2WF> T scale(IVec2RF aabb1Min, float[] aabb1Max, IVec2RF scale, @ExtractionParam T res)
	{
		float aabb1MinX = aabb1Min.x();
		float aabb1MinY = aabb1Min.y();
		float aabb1MaxX = aabb1Max[0];
		float aabb1MaxY = aabb1Max[1];
		
		float scaleX = scale.x();
		float scaleY = scale.y();
		
		float scaledMinX = aabb1MinX * scaleX;
		float scaledMinY = aabb1MinY * scaleY;
		float scaledMaxX = aabb1MaxX * scaleX;
		float scaledMaxY = aabb1MaxY * scaleY;
		
		float newMinX = MathUtils.min(scaledMinX, scaledMaxX);
		float newMinY = MathUtils.min(scaledMinY, scaledMaxY);
		float newMaxX = MathUtils.max(scaledMinX, scaledMaxX);
		float newMaxY = MathUtils.max(scaledMinY, scaledMaxY);
		
		res.set(newMinX, newMinY, newMaxX, newMaxY);
		
		return res;
	}
	
	public static <T extends IAabb2WF> T scale(IVec2RF aabb1Min, float[] aabb1Max, float[] scale, @ExtractionParam T res)
	{
		float aabb1MinX = aabb1Min.x();
		float aabb1MinY = aabb1Min.y();
		float aabb1MaxX = aabb1Max[0];
		float aabb1MaxY = aabb1Max[1];
		
		float scaleX = scale[0];
		float scaleY = scale[1];
		
		float scaledMinX = aabb1MinX * scaleX;
		float scaledMinY = aabb1MinY * scaleY;
		float scaledMaxX = aabb1MaxX * scaleX;
		float scaledMaxY = aabb1MaxY * scaleY;
		
		float newMinX = MathUtils.min(scaledMinX, scaledMaxX);
		float newMinY = MathUtils.min(scaledMinY, scaledMaxY);
		float newMaxX = MathUtils.max(scaledMinX, scaledMaxX);
		float newMaxY = MathUtils.max(scaledMinY, scaledMaxY);
		
		res.set(newMinX, newMinY, newMaxX, newMaxY);
		
		return res;
	}
	
	public static <T extends IAabb2WF> T scale(IVec2RF aabb1Min, float[] aabb1Max, float scale, @ExtractionParam T res)
	{
		float aabb1MinX = aabb1Min.x();
		float aabb1MinY = aabb1Min.y();
		float aabb1MaxX = aabb1Max[0];
		float aabb1MaxY = aabb1Max[1];
		
		float scaleX = scale;
		float scaleY = scale;
		
		float scaledMinX = aabb1MinX * scaleX;
		float scaledMinY = aabb1MinY * scaleY;
		float scaledMaxX = aabb1MaxX * scaleX;
		float scaledMaxY = aabb1MaxY * scaleY;
		
		float newMinX = MathUtils.min(scaledMinX, scaledMaxX);
		float newMinY = MathUtils.min(scaledMinY, scaledMaxY);
		float newMaxX = MathUtils.max(scaledMinX, scaledMaxX);
		float newMaxY = MathUtils.max(scaledMinY, scaledMaxY);
		
		res.set(newMinX, newMinY, newMaxX, newMaxY);
		
		return res;
	}
	
	public static <T extends IAabb2WF> T scale(IVec2RF aabb1Min, float[] aabb1Max, float scaleX, float scaleY, @ExtractionParam T res)
	{
		float aabb1MinX = aabb1Min.x();
		float aabb1MinY = aabb1Min.y();
		float aabb1MaxX = aabb1Max[0];
		float aabb1MaxY = aabb1Max[1];
		
		float scaledMinX = aabb1MinX * scaleX;
		float scaledMinY = aabb1MinY * scaleY;
		float scaledMaxX = aabb1MaxX * scaleX;
		float scaledMaxY = aabb1MaxY * scaleY;
		
		float newMinX = MathUtils.min(scaledMinX, scaledMaxX);
		float newMinY = MathUtils.min(scaledMinY, scaledMaxY);
		float newMaxX = MathUtils.max(scaledMinX, scaledMaxX);
		float newMaxY = MathUtils.max(scaledMinY, scaledMaxY);
		
		res.set(newMinX, newMinY, newMaxX, newMaxY);
		
		return res;
	}
	
	public static <T extends IAabb2WF> T scale(IVec2RF aabb1Min, float aabb1MaxX, float aabb1MaxY, IVec2RF scale, @ExtractionParam T res)
	{
		float aabb1MinX = aabb1Min.x();
		float aabb1MinY = aabb1Min.y();
		
		float scaleX = scale.x();
		float scaleY = scale.y();
		
		float scaledMinX = aabb1MinX * scaleX;
		float scaledMinY = aabb1MinY * scaleY;
		float scaledMaxX = aabb1MaxX * scaleX;
		float scaledMaxY = aabb1MaxY * scaleY;
		
		float newMinX = MathUtils.min(scaledMinX, scaledMaxX);
		float newMinY = MathUtils.min(scaledMinY, scaledMaxY);
		float newMaxX = MathUtils.max(scaledMinX, scaledMaxX);
		float newMaxY = MathUtils.max(scaledMinY, scaledMaxY);
		
		res.set(newMinX, newMinY, newMaxX, newMaxY);
		
		return res;
	}
	
	public static <T extends IAabb2WF> T scale(IVec2RF aabb1Min, float aabb1MaxX, float aabb1MaxY, float[] scale, @ExtractionParam T res)
	{
		float aabb1MinX = aabb1Min.x();
		float aabb1MinY = aabb1Min.y();
		
		float scaleX = scale[0];
		float scaleY = scale[1];
		
		float scaledMinX = aabb1MinX * scaleX;
		float scaledMinY = aabb1MinY * scaleY;
		float scaledMaxX = aabb1MaxX * scaleX;
		float scaledMaxY = aabb1MaxY * scaleY;
		
		float newMinX = MathUtils.min(scaledMinX, scaledMaxX);
		float newMinY = MathUtils.min(scaledMinY, scaledMaxY);
		float newMaxX = MathUtils.max(scaledMinX, scaledMaxX);
		float newMaxY = MathUtils.max(scaledMinY, scaledMaxY);
		
		res.set(newMinX, newMinY, newMaxX, newMaxY);
		
		return res;
	}
	
	public static <T extends IAabb2WF> T scale(IVec2RF aabb1Min, float aabb1MaxX, float aabb1MaxY, float scale, @ExtractionParam T res)
	{
		float aabb1MinX = aabb1Min.x();
		float aabb1MinY = aabb1Min.y();
		
		float scaleX = scale;
		float scaleY = scale;
		
		float scaledMinX = aabb1MinX * scaleX;
		float scaledMinY = aabb1MinY * scaleY;
		float scaledMaxX = aabb1MaxX * scaleX;
		float scaledMaxY = aabb1MaxY * scaleY;
		
		float newMinX = MathUtils.min(scaledMinX, scaledMaxX);
		float newMinY = MathUtils.min(scaledMinY, scaledMaxY);
		float newMaxX = MathUtils.max(scaledMinX, scaledMaxX);
		float newMaxY = MathUtils.max(scaledMinY, scaledMaxY);
		
		res.set(newMinX, newMinY, newMaxX, newMaxY);
		
		return res;
	}
	
	public static <T extends IAabb2WF> T scale(IVec2RF aabb1Min, float aabb1MaxX, float aabb1MaxY, float scaleX, float scaleY, @ExtractionParam T res)
	{
		float aabb1MinX = aabb1Min.x();
		float aabb1MinY = aabb1Min.y();
		
		float scaledMinX = aabb1MinX * scaleX;
		float scaledMinY = aabb1MinY * scaleY;
		float scaledMaxX = aabb1MaxX * scaleX;
		float scaledMaxY = aabb1MaxY * scaleY;
		
		float newMinX = MathUtils.min(scaledMinX, scaledMaxX);
		float newMinY = MathUtils.min(scaledMinY, scaledMaxY);
		float newMaxX = MathUtils.max(scaledMinX, scaledMaxX);
		float newMaxY = MathUtils.max(scaledMinY, scaledMaxY);
		
		res.set(newMinX, newMinY, newMaxX, newMaxY);
		
		return res;
	}
	
	public static <T extends IAabb2WF> T scale(float[] aabb1Min, IVec2RF aabb1Max, IVec2RF scale, @ExtractionParam T res)
	{
		float aabb1MinX = aabb1Min[0];
		float aabb1MinY = aabb1Min[1];
		float aabb1MaxX = aabb1Max.x();
		float aabb1MaxY = aabb1Max.y();
		
		float scaleX = scale.x();
		float scaleY = scale.y();
		
		float scaledMinX = aabb1MinX * scaleX;
		float scaledMinY = aabb1MinY * scaleY;
		float scaledMaxX = aabb1MaxX * scaleX;
		float scaledMaxY = aabb1MaxY * scaleY;
		
		float newMinX = MathUtils.min(scaledMinX, scaledMaxX);
		float newMinY = MathUtils.min(scaledMinY, scaledMaxY);
		float newMaxX = MathUtils.max(scaledMinX, scaledMaxX);
		float newMaxY = MathUtils.max(scaledMinY, scaledMaxY);
		
		res.set(newMinX, newMinY, newMaxX, newMaxY);
		
		return res;
	}
	
	public static <T extends IAabb2WF> T scale(float[] aabb1Min, IVec2RF aabb1Max, float[] scale, @ExtractionParam T res)
	{
		float aabb1MinX = aabb1Min[0];
		float aabb1MinY = aabb1Min[1];
		float aabb1MaxX = aabb1Max.x();
		float aabb1MaxY = aabb1Max.y();
		
		float scaleX = scale[0];
		float scaleY = scale[1];
		
		float scaledMinX = aabb1MinX * scaleX;
		float scaledMinY = aabb1MinY * scaleY;
		float scaledMaxX = aabb1MaxX * scaleX;
		float scaledMaxY = aabb1MaxY * scaleY;
		
		float newMinX = MathUtils.min(scaledMinX, scaledMaxX);
		float newMinY = MathUtils.min(scaledMinY, scaledMaxY);
		float newMaxX = MathUtils.max(scaledMinX, scaledMaxX);
		float newMaxY = MathUtils.max(scaledMinY, scaledMaxY);
		
		res.set(newMinX, newMinY, newMaxX, newMaxY);
		
		return res;
	}
	
	public static <T extends IAabb2WF> T scale(float[] aabb1Min, IVec2RF aabb1Max, float scale, @ExtractionParam T res)
	{
		float aabb1MinX = aabb1Min[0];
		float aabb1MinY = aabb1Min[1];
		float aabb1MaxX = aabb1Max.x();
		float aabb1MaxY = aabb1Max.y();
		
		float scaleX = scale;
		float scaleY = scale;
		
		float scaledMinX = aabb1MinX * scaleX;
		float scaledMinY = aabb1MinY * scaleY;
		float scaledMaxX = aabb1MaxX * scaleX;
		float scaledMaxY = aabb1MaxY * scaleY;
		
		float newMinX = MathUtils.min(scaledMinX, scaledMaxX);
		float newMinY = MathUtils.min(scaledMinY, scaledMaxY);
		float newMaxX = MathUtils.max(scaledMinX, scaledMaxX);
		float newMaxY = MathUtils.max(scaledMinY, scaledMaxY);
		
		res.set(newMinX, newMinY, newMaxX, newMaxY);
		
		return res;
	}
	
	public static <T extends IAabb2WF> T scale(float[] aabb1Min, IVec2RF aabb1Max, float scaleX, float scaleY, @ExtractionParam T res)
	{
		float aabb1MinX = aabb1Min[0];
		float aabb1MinY = aabb1Min[1];
		float aabb1MaxX = aabb1Max.x();
		float aabb1MaxY = aabb1Max.y();
		
		float scaledMinX = aabb1MinX * scaleX;
		float scaledMinY = aabb1MinY * scaleY;
		float scaledMaxX = aabb1MaxX * scaleX;
		float scaledMaxY = aabb1MaxY * scaleY;
		
		float newMinX = MathUtils.min(scaledMinX, scaledMaxX);
		float newMinY = MathUtils.min(scaledMinY, scaledMaxY);
		float newMaxX = MathUtils.max(scaledMinX, scaledMaxX);
		float newMaxY = MathUtils.max(scaledMinY, scaledMaxY);
		
		res.set(newMinX, newMinY, newMaxX, newMaxY);
		
		return res;
	}
	
	public static <T extends IAabb2WF> T scale(float[] aabb1Min, float[] aabb1Max, IVec2RF scale, @ExtractionParam T res)
	{
		float aabb1MinX = aabb1Min[0];
		float aabb1MinY = aabb1Min[1];
		float aabb1MaxX = aabb1Max[0];
		float aabb1MaxY = aabb1Max[1];
		
		float scaleX = scale.x();
		float scaleY = scale.y();
		
		float scaledMinX = aabb1MinX * scaleX;
		float scaledMinY = aabb1MinY * scaleY;
		float scaledMaxX = aabb1MaxX * scaleX;
		float scaledMaxY = aabb1MaxY * scaleY;
		
		float newMinX = MathUtils.min(scaledMinX, scaledMaxX);
		float newMinY = MathUtils.min(scaledMinY, scaledMaxY);
		float newMaxX = MathUtils.max(scaledMinX, scaledMaxX);
		float newMaxY = MathUtils.max(scaledMinY, scaledMaxY);
		
		res.set(newMinX, newMinY, newMaxX, newMaxY);
		
		return res;
	}
	
	public static <T extends IAabb2WF> T scale(float[] aabb1Min, float[] aabb1Max, float[] scale, @ExtractionParam T res)
	{
		float aabb1MinX = aabb1Min[0];
		float aabb1MinY = aabb1Min[1];
		float aabb1MaxX = aabb1Max[0];
		float aabb1MaxY = aabb1Max[1];
		
		float scaleX = scale[0];
		float scaleY = scale[1];
		
		float scaledMinX = aabb1MinX * scaleX;
		float scaledMinY = aabb1MinY * scaleY;
		float scaledMaxX = aabb1MaxX * scaleX;
		float scaledMaxY = aabb1MaxY * scaleY;
		
		float newMinX = MathUtils.min(scaledMinX, scaledMaxX);
		float newMinY = MathUtils.min(scaledMinY, scaledMaxY);
		float newMaxX = MathUtils.max(scaledMinX, scaledMaxX);
		float newMaxY = MathUtils.max(scaledMinY, scaledMaxY);
		
		res.set(newMinX, newMinY, newMaxX, newMaxY);
		
		return res;
	}
	
	public static <T extends IAabb2WF> T scale(float[] aabb1Min, float[] aabb1Max, float scale, @ExtractionParam T res)
	{
		float aabb1MinX = aabb1Min[0];
		float aabb1MinY = aabb1Min[1];
		float aabb1MaxX = aabb1Max[0];
		float aabb1MaxY = aabb1Max[1];
		
		float scaleX = scale;
		float scaleY = scale;
		
		float scaledMinX = aabb1MinX * scaleX;
		float scaledMinY = aabb1MinY * scaleY;
		float scaledMaxX = aabb1MaxX * scaleX;
		float scaledMaxY = aabb1MaxY * scaleY;
		
		float newMinX = MathUtils.min(scaledMinX, scaledMaxX);
		float newMinY = MathUtils.min(scaledMinY, scaledMaxY);
		float newMaxX = MathUtils.max(scaledMinX, scaledMaxX);
		float newMaxY = MathUtils.max(scaledMinY, scaledMaxY);
		
		res.set(newMinX, newMinY, newMaxX, newMaxY);
		
		return res;
	}
	
	public static <T extends IAabb2WF> T scale(float[] aabb1Min, float[] aabb1Max, float scaleX, float scaleY, @ExtractionParam T res)
	{
		float aabb1MinX = aabb1Min[0];
		float aabb1MinY = aabb1Min[1];
		float aabb1MaxX = aabb1Max[0];
		float aabb1MaxY = aabb1Max[1];
		
		float scaledMinX = aabb1MinX * scaleX;
		float scaledMinY = aabb1MinY * scaleY;
		float scaledMaxX = aabb1MaxX * scaleX;
		float scaledMaxY = aabb1MaxY * scaleY;
		
		float newMinX = MathUtils.min(scaledMinX, scaledMaxX);
		float newMinY = MathUtils.min(scaledMinY, scaledMaxY);
		float newMaxX = MathUtils.max(scaledMinX, scaledMaxX);
		float newMaxY = MathUtils.max(scaledMinY, scaledMaxY);
		
		res.set(newMinX, newMinY, newMaxX, newMaxY);
		
		return res;
	}
	
	public static <T extends IAabb2WF> T scale(float[] aabb1Min, float aabb1MaxX, float aabb1MaxY, IVec2RF scale, @ExtractionParam T res)
	{
		float aabb1MinX = aabb1Min[0];
		float aabb1MinY = aabb1Min[1];
		
		float scaleX = scale.x();
		float scaleY = scale.y();
		
		float scaledMinX = aabb1MinX * scaleX;
		float scaledMinY = aabb1MinY * scaleY;
		float scaledMaxX = aabb1MaxX * scaleX;
		float scaledMaxY = aabb1MaxY * scaleY;
		
		float newMinX = MathUtils.min(scaledMinX, scaledMaxX);
		float newMinY = MathUtils.min(scaledMinY, scaledMaxY);
		float newMaxX = MathUtils.max(scaledMinX, scaledMaxX);
		float newMaxY = MathUtils.max(scaledMinY, scaledMaxY);
		
		res.set(newMinX, newMinY, newMaxX, newMaxY);
		
		return res;
	}
	
	public static <T extends IAabb2WF> T scale(float[] aabb1Min, float aabb1MaxX, float aabb1MaxY, float[] scale, @ExtractionParam T res)
	{
		float aabb1MinX = aabb1Min[0];
		float aabb1MinY = aabb1Min[1];
		
		float scaleX = scale[0];
		float scaleY = scale[1];
		
		float scaledMinX = aabb1MinX * scaleX;
		float scaledMinY = aabb1MinY * scaleY;
		float scaledMaxX = aabb1MaxX * scaleX;
		float scaledMaxY = aabb1MaxY * scaleY;
		
		float newMinX = MathUtils.min(scaledMinX, scaledMaxX);
		float newMinY = MathUtils.min(scaledMinY, scaledMaxY);
		float newMaxX = MathUtils.max(scaledMinX, scaledMaxX);
		float newMaxY = MathUtils.max(scaledMinY, scaledMaxY);
		
		res.set(newMinX, newMinY, newMaxX, newMaxY);
		
		return res;
	}
	
	public static <T extends IAabb2WF> T scale(float[] aabb1Min, float aabb1MaxX, float aabb1MaxY, float scale, @ExtractionParam T res)
	{
		float aabb1MinX = aabb1Min[0];
		float aabb1MinY = aabb1Min[1];
		
		float scaleX = scale;
		float scaleY = scale;
		
		float scaledMinX = aabb1MinX * scaleX;
		float scaledMinY = aabb1MinY * scaleY;
		float scaledMaxX = aabb1MaxX * scaleX;
		float scaledMaxY = aabb1MaxY * scaleY;
		
		float newMinX = MathUtils.min(scaledMinX, scaledMaxX);
		float newMinY = MathUtils.min(scaledMinY, scaledMaxY);
		float newMaxX = MathUtils.max(scaledMinX, scaledMaxX);
		float newMaxY = MathUtils.max(scaledMinY, scaledMaxY);
		
		res.set(newMinX, newMinY, newMaxX, newMaxY);
		
		return res;
	}
	
	public static <T extends IAabb2WF> T scale(float[] aabb1Min, float aabb1MaxX, float aabb1MaxY, float scaleX, float scaleY, @ExtractionParam T res)
	{
		float aabb1MinX = aabb1Min[0];
		float aabb1MinY = aabb1Min[1];
		
		float scaledMinX = aabb1MinX * scaleX;
		float scaledMinY = aabb1MinY * scaleY;
		float scaledMaxX = aabb1MaxX * scaleX;
		float scaledMaxY = aabb1MaxY * scaleY;
		
		float newMinX = MathUtils.min(scaledMinX, scaledMaxX);
		float newMinY = MathUtils.min(scaledMinY, scaledMaxY);
		float newMaxX = MathUtils.max(scaledMinX, scaledMaxX);
		float newMaxY = MathUtils.max(scaledMinY, scaledMaxY);
		
		res.set(newMinX, newMinY, newMaxX, newMaxY);
		
		return res;
	}
	
	public static <T extends IAabb2WF> T scale(float aabb1MinX, float aabb1MinY, IVec2RF aabb1Max, IVec2RF scale, @ExtractionParam T res)
	{
		float aabb1MaxX = aabb1Max.x();
		float aabb1MaxY = aabb1Max.y();
		
		float scaleX = scale.x();
		float scaleY = scale.y();
		
		float scaledMinX = aabb1MinX * scaleX;
		float scaledMinY = aabb1MinY * scaleY;
		float scaledMaxX = aabb1MaxX * scaleX;
		float scaledMaxY = aabb1MaxY * scaleY;
		
		float newMinX = MathUtils.min(scaledMinX, scaledMaxX);
		float newMinY = MathUtils.min(scaledMinY, scaledMaxY);
		float newMaxX = MathUtils.max(scaledMinX, scaledMaxX);
		float newMaxY = MathUtils.max(scaledMinY, scaledMaxY);
		
		res.set(newMinX, newMinY, newMaxX, newMaxY);
		
		return res;
	}
	
	public static <T extends IAabb2WF> T scale(float aabb1MinX, float aabb1MinY, IVec2RF aabb1Max, float[] scale, @ExtractionParam T res)
	{
		float aabb1MaxX = aabb1Max.x();
		float aabb1MaxY = aabb1Max.y();
		
		float scaleX = scale[0];
		float scaleY = scale[1];
		
		float scaledMinX = aabb1MinX * scaleX;
		float scaledMinY = aabb1MinY * scaleY;
		float scaledMaxX = aabb1MaxX * scaleX;
		float scaledMaxY = aabb1MaxY * scaleY;
		
		float newMinX = MathUtils.min(scaledMinX, scaledMaxX);
		float newMinY = MathUtils.min(scaledMinY, scaledMaxY);
		float newMaxX = MathUtils.max(scaledMinX, scaledMaxX);
		float newMaxY = MathUtils.max(scaledMinY, scaledMaxY);
		
		res.set(newMinX, newMinY, newMaxX, newMaxY);
		
		return res;
	}
	
	public static <T extends IAabb2WF> T scale(float aabb1MinX, float aabb1MinY, IVec2RF aabb1Max, float scale, @ExtractionParam T res)
	{
		float aabb1MaxX = aabb1Max.x();
		float aabb1MaxY = aabb1Max.y();
		
		float scaleX = scale;
		float scaleY = scale;
		
		float scaledMinX = aabb1MinX * scaleX;
		float scaledMinY = aabb1MinY * scaleY;
		float scaledMaxX = aabb1MaxX * scaleX;
		float scaledMaxY = aabb1MaxY * scaleY;
		
		float newMinX = MathUtils.min(scaledMinX, scaledMaxX);
		float newMinY = MathUtils.min(scaledMinY, scaledMaxY);
		float newMaxX = MathUtils.max(scaledMinX, scaledMaxX);
		float newMaxY = MathUtils.max(scaledMinY, scaledMaxY);
		
		res.set(newMinX, newMinY, newMaxX, newMaxY);
		
		return res;
	}
	
	public static <T extends IAabb2WF> T scale(float aabb1MinX, float aabb1MinY, IVec2RF aabb1Max, float scaleX, float scaleY, @ExtractionParam T res)
	{
		float aabb1MaxX = aabb1Max.x();
		float aabb1MaxY = aabb1Max.y();
		
		float scaledMinX = aabb1MinX * scaleX;
		float scaledMinY = aabb1MinY * scaleY;
		float scaledMaxX = aabb1MaxX * scaleX;
		float scaledMaxY = aabb1MaxY * scaleY;
		
		float newMinX = MathUtils.min(scaledMinX, scaledMaxX);
		float newMinY = MathUtils.min(scaledMinY, scaledMaxY);
		float newMaxX = MathUtils.max(scaledMinX, scaledMaxX);
		float newMaxY = MathUtils.max(scaledMinY, scaledMaxY);
		
		res.set(newMinX, newMinY, newMaxX, newMaxY);
		
		return res;
	}
	
	public static <T extends IAabb2WF> T scale(float aabb1MinX, float aabb1MinY, float[] aabb1Max, IVec2RF scale, @ExtractionParam T res)
	{
		float aabb1MaxX = aabb1Max[0];
		float aabb1MaxY = aabb1Max[1];
		
		float scaleX = scale.x();
		float scaleY = scale.y();
		
		float scaledMinX = aabb1MinX * scaleX;
		float scaledMinY = aabb1MinY * scaleY;
		float scaledMaxX = aabb1MaxX * scaleX;
		float scaledMaxY = aabb1MaxY * scaleY;
		
		float newMinX = MathUtils.min(scaledMinX, scaledMaxX);
		float newMinY = MathUtils.min(scaledMinY, scaledMaxY);
		float newMaxX = MathUtils.max(scaledMinX, scaledMaxX);
		float newMaxY = MathUtils.max(scaledMinY, scaledMaxY);
		
		res.set(newMinX, newMinY, newMaxX, newMaxY);
		
		return res;
	}
	
	public static <T extends IAabb2WF> T scale(float aabb1MinX, float aabb1MinY, float[] aabb1Max, float[] scale, @ExtractionParam T res)
	{
		float aabb1MaxX = aabb1Max[0];
		float aabb1MaxY = aabb1Max[1];
		
		float scaleX = scale[0];
		float scaleY = scale[1];
		
		float scaledMinX = aabb1MinX * scaleX;
		float scaledMinY = aabb1MinY * scaleY;
		float scaledMaxX = aabb1MaxX * scaleX;
		float scaledMaxY = aabb1MaxY * scaleY;
		
		float newMinX = MathUtils.min(scaledMinX, scaledMaxX);
		float newMinY = MathUtils.min(scaledMinY, scaledMaxY);
		float newMaxX = MathUtils.max(scaledMinX, scaledMaxX);
		float newMaxY = MathUtils.max(scaledMinY, scaledMaxY);
		
		res.set(newMinX, newMinY, newMaxX, newMaxY);
		
		return res;
	}
	
	public static <T extends IAabb2WF> T scale(float aabb1MinX, float aabb1MinY, float[] aabb1Max, float scale, @ExtractionParam T res)
	{
		float aabb1MaxX = aabb1Max[0];
		float aabb1MaxY = aabb1Max[1];
		
		float scaleX = scale;
		float scaleY = scale;
		
		float scaledMinX = aabb1MinX * scaleX;
		float scaledMinY = aabb1MinY * scaleY;
		float scaledMaxX = aabb1MaxX * scaleX;
		float scaledMaxY = aabb1MaxY * scaleY;
		
		float newMinX = MathUtils.min(scaledMinX, scaledMaxX);
		float newMinY = MathUtils.min(scaledMinY, scaledMaxY);
		float newMaxX = MathUtils.max(scaledMinX, scaledMaxX);
		float newMaxY = MathUtils.max(scaledMinY, scaledMaxY);
		
		res.set(newMinX, newMinY, newMaxX, newMaxY);
		
		return res;
	}
	
	public static <T extends IAabb2WF> T scale(float aabb1MinX, float aabb1MinY, float[] aabb1Max, float scaleX, float scaleY, @ExtractionParam T res)
	{
		float aabb1MaxX = aabb1Max[0];
		float aabb1MaxY = aabb1Max[1];
		
		float scaledMinX = aabb1MinX * scaleX;
		float scaledMinY = aabb1MinY * scaleY;
		float scaledMaxX = aabb1MaxX * scaleX;
		float scaledMaxY = aabb1MaxY * scaleY;
		
		float newMinX = MathUtils.min(scaledMinX, scaledMaxX);
		float newMinY = MathUtils.min(scaledMinY, scaledMaxY);
		float newMaxX = MathUtils.max(scaledMinX, scaledMaxX);
		float newMaxY = MathUtils.max(scaledMinY, scaledMaxY);
		
		res.set(newMinX, newMinY, newMaxX, newMaxY);
		
		return res;
	}
	
	public static <T extends IAabb2WF> T scale(float aabb1MinX, float aabb1MinY, float aabb1MaxX, float aabb1MaxY, IVec2RF scale, @ExtractionParam T res)
	{
		float scaleX = scale.x();
		float scaleY = scale.y();
		
		float scaledMinX = aabb1MinX * scaleX;
		float scaledMinY = aabb1MinY * scaleY;
		float scaledMaxX = aabb1MaxX * scaleX;
		float scaledMaxY = aabb1MaxY * scaleY;
		
		float newMinX = MathUtils.min(scaledMinX, scaledMaxX);
		float newMinY = MathUtils.min(scaledMinY, scaledMaxY);
		float newMaxX = MathUtils.max(scaledMinX, scaledMaxX);
		float newMaxY = MathUtils.max(scaledMinY, scaledMaxY);
		
		res.set(newMinX, newMinY, newMaxX, newMaxY);
		
		return res;
	}
	
	public static <T extends IAabb2WF> T scale(float aabb1MinX, float aabb1MinY, float aabb1MaxX, float aabb1MaxY, float[] scale, @ExtractionParam T res)
	{
		float scaleX = scale[0];
		float scaleY = scale[1];
		
		float scaledMinX = aabb1MinX * scaleX;
		float scaledMinY = aabb1MinY * scaleY;
		float scaledMaxX = aabb1MaxX * scaleX;
		float scaledMaxY = aabb1MaxY * scaleY;
		
		float newMinX = MathUtils.min(scaledMinX, scaledMaxX);
		float newMinY = MathUtils.min(scaledMinY, scaledMaxY);
		float newMaxX = MathUtils.max(scaledMinX, scaledMaxX);
		float newMaxY = MathUtils.max(scaledMinY, scaledMaxY);
		
		res.set(newMinX, newMinY, newMaxX, newMaxY);
		
		return res;
	}
	
	public static <T extends IAabb2WF> T scale(float aabb1MinX, float aabb1MinY, float aabb1MaxX, float aabb1MaxY, float scale, @ExtractionParam T res)
	{
		float scaleX = scale;
		float scaleY = scale;
		
		float scaledMinX = aabb1MinX * scaleX;
		float scaledMinY = aabb1MinY * scaleY;
		float scaledMaxX = aabb1MaxX * scaleX;
		float scaledMaxY = aabb1MaxY * scaleY;
		
		float newMinX = MathUtils.min(scaledMinX, scaledMaxX);
		float newMinY = MathUtils.min(scaledMinY, scaledMaxY);
		float newMaxX = MathUtils.max(scaledMinX, scaledMaxX);
		float newMaxY = MathUtils.max(scaledMinY, scaledMaxY);
		
		res.set(newMinX, newMinY, newMaxX, newMaxY);
		
		return res;
	}
	
	public static <T extends IAabb2WF> T scale(float aabb1MinX, float aabb1MinY, float aabb1MaxX, float aabb1MaxY, float scaleX, float scaleY, @ExtractionParam T res)
	{
		float scaledMinX = aabb1MinX * scaleX;
		float scaledMinY = aabb1MinY * scaleY;
		float scaledMaxX = aabb1MaxX * scaleX;
		float scaledMaxY = aabb1MaxY * scaleY;
		
		float newMinX = MathUtils.min(scaledMinX, scaledMaxX);
		float newMinY = MathUtils.min(scaledMinY, scaledMaxY);
		float newMaxX = MathUtils.max(scaledMinX, scaledMaxX);
		float newMaxY = MathUtils.max(scaledMinY, scaledMaxY);
		
		res.set(newMinX, newMinY, newMaxX, newMaxY);
		
		return res;
	}
	
	public static <T extends IAabb2WF> T scaleAssign(@ExtractionParam T aabb1, IVec2RF scale)
	{
		float aabb1MinX = aabb1.minX();
		float aabb1MinY = aabb1.minY();
		float aabb1MaxX = aabb1.maxX();
		float aabb1MaxY = aabb1.maxY();
		
		float scaleX = scale.x();
		float scaleY = scale.y();
		
		float scaledMinX = aabb1MinX * scaleX;
		float scaledMinY = aabb1MinY * scaleY;
		float scaledMaxX = aabb1MaxX * scaleX;
		float scaledMaxY = aabb1MaxY * scaleY;
		
		float newMinX = MathUtils.min(scaledMinX, scaledMaxX);
		float newMinY = MathUtils.min(scaledMinY, scaledMaxY);
		float newMaxX = MathUtils.max(scaledMinX, scaledMaxX);
		float newMaxY = MathUtils.max(scaledMinY, scaledMaxY);
		
		aabb1.set(newMinX, newMinY, newMaxX, newMaxY);
		
		return aabb1;
	}
	
	public static <T extends IAabb2WF> T scaleAssign(@ExtractionParam T aabb1, float[] scale)
	{
		float aabb1MinX = aabb1.minX();
		float aabb1MinY = aabb1.minY();
		float aabb1MaxX = aabb1.maxX();
		float aabb1MaxY = aabb1.maxY();
		
		float scaleX = scale[0];
		float scaleY = scale[1];
		
		float scaledMinX = aabb1MinX * scaleX;
		float scaledMinY = aabb1MinY * scaleY;
		float scaledMaxX = aabb1MaxX * scaleX;
		float scaledMaxY = aabb1MaxY * scaleY;
		
		float newMinX = MathUtils.min(scaledMinX, scaledMaxX);
		float newMinY = MathUtils.min(scaledMinY, scaledMaxY);
		float newMaxX = MathUtils.max(scaledMinX, scaledMaxX);
		float newMaxY = MathUtils.max(scaledMinY, scaledMaxY);
		
		aabb1.set(newMinX, newMinY, newMaxX, newMaxY);
		
		return aabb1;
	}
	
	public static <T extends IAabb2WF> T scaleAssign(@ExtractionParam T aabb1, float scale)
	{
		float aabb1MinX = aabb1.minX();
		float aabb1MinY = aabb1.minY();
		float aabb1MaxX = aabb1.maxX();
		float aabb1MaxY = aabb1.maxY();
		
		float scaleX = scale;
		float scaleY = scale;
		
		float scaledMinX = aabb1MinX * scaleX;
		float scaledMinY = aabb1MinY * scaleY;
		float scaledMaxX = aabb1MaxX * scaleX;
		float scaledMaxY = aabb1MaxY * scaleY;
		
		float newMinX = MathUtils.min(scaledMinX, scaledMaxX);
		float newMinY = MathUtils.min(scaledMinY, scaledMaxY);
		float newMaxX = MathUtils.max(scaledMinX, scaledMaxX);
		float newMaxY = MathUtils.max(scaledMinY, scaledMaxY);
		
		aabb1.set(newMinX, newMinY, newMaxX, newMaxY);
		
		return aabb1;
	}
	
	public static <T extends IAabb2WF> T scaleAssign(@ExtractionParam T aabb1, float scaleX, float scaleY)
	{
		float aabb1MinX = aabb1.minX();
		float aabb1MinY = aabb1.minY();
		float aabb1MaxX = aabb1.maxX();
		float aabb1MaxY = aabb1.maxY();
		
		float scaledMinX = aabb1MinX * scaleX;
		float scaledMinY = aabb1MinY * scaleY;
		float scaledMaxX = aabb1MaxX * scaleX;
		float scaledMaxY = aabb1MaxY * scaleY;
		
		float newMinX = MathUtils.min(scaledMinX, scaledMaxX);
		float newMinY = MathUtils.min(scaledMinY, scaledMaxY);
		float newMaxX = MathUtils.max(scaledMinX, scaledMaxX);
		float newMaxY = MathUtils.max(scaledMinY, scaledMaxY);
		
		aabb1.set(newMinX, newMinY, newMaxX, newMaxY);
		
		return aabb1;
	}
	
	public static float[] scaleFromPivot(IAabb2RF aabb, IVec2RF pivot, IVec2RF scale, @ExtractionParam float[] res)
	{
		float aabbMinX = aabb.minX();
		float aabbMinY = aabb.minY();
		float aabbMaxX = aabb.maxX();
		float aabbMaxY = aabb.maxY();
		
		float pivotX = pivot.x();
		float pivotY = pivot.y();
		
		float scaleX = scale.x();
		float scaleY = scale.y();
		
		float scaledMinX = MathUtils.fma(scaleX, aabbMinX - pivotX, pivotX);
		float scaledMinY = MathUtils.fma(scaleY, aabbMinY - pivotY, pivotY);
		float scaledMaxX = MathUtils.fma(scaleX, aabbMaxX - pivotX, pivotX);
		float scaledMaxY = MathUtils.fma(scaleY, aabbMaxY - pivotY, pivotY);
		
		float newMinX = MathUtils.min(scaledMinX, scaledMaxX);
		float newMinY = MathUtils.min(scaledMinY, scaledMaxY);
		float newMaxX = MathUtils.max(scaledMinX, scaledMaxX);
		float newMaxY = MathUtils.max(scaledMinY, scaledMaxY);
		
		res[0] = newMinX;
		res[1] = newMinY;
		res[2] = newMaxX;
		res[3] = newMaxY;
		
		return res;
	}
	
	public static float[] scaleFromPivot(IAabb2RF aabb, IVec2RF pivot, float[] scale, @ExtractionParam float[] res)
	{
		float aabbMinX = aabb.minX();
		float aabbMinY = aabb.minY();
		float aabbMaxX = aabb.maxX();
		float aabbMaxY = aabb.maxY();
		
		float pivotX = pivot.x();
		float pivotY = pivot.y();
		
		float scaleX = scale[0];
		float scaleY = scale[1];
		
		float scaledMinX = MathUtils.fma(scaleX, aabbMinX - pivotX, pivotX);
		float scaledMinY = MathUtils.fma(scaleY, aabbMinY - pivotY, pivotY);
		float scaledMaxX = MathUtils.fma(scaleX, aabbMaxX - pivotX, pivotX);
		float scaledMaxY = MathUtils.fma(scaleY, aabbMaxY - pivotY, pivotY);
		
		float newMinX = MathUtils.min(scaledMinX, scaledMaxX);
		float newMinY = MathUtils.min(scaledMinY, scaledMaxY);
		float newMaxX = MathUtils.max(scaledMinX, scaledMaxX);
		float newMaxY = MathUtils.max(scaledMinY, scaledMaxY);
		
		res[0] = newMinX;
		res[1] = newMinY;
		res[2] = newMaxX;
		res[3] = newMaxY;
		
		return res;
	}
	
	public static float[] scaleFromPivot(IAabb2RF aabb, IVec2RF pivot, float scaleX, float scaleY, @ExtractionParam float[] res)
	{
		float aabbMinX = aabb.minX();
		float aabbMinY = aabb.minY();
		float aabbMaxX = aabb.maxX();
		float aabbMaxY = aabb.maxY();
		
		float pivotX = pivot.x();
		float pivotY = pivot.y();
		
		float scaledMinX = MathUtils.fma(scaleX, aabbMinX - pivotX, pivotX);
		float scaledMinY = MathUtils.fma(scaleY, aabbMinY - pivotY, pivotY);
		float scaledMaxX = MathUtils.fma(scaleX, aabbMaxX - pivotX, pivotX);
		float scaledMaxY = MathUtils.fma(scaleY, aabbMaxY - pivotY, pivotY);
		
		float newMinX = MathUtils.min(scaledMinX, scaledMaxX);
		float newMinY = MathUtils.min(scaledMinY, scaledMaxY);
		float newMaxX = MathUtils.max(scaledMinX, scaledMaxX);
		float newMaxY = MathUtils.max(scaledMinY, scaledMaxY);
		
		res[0] = newMinX;
		res[1] = newMinY;
		res[2] = newMaxX;
		res[3] = newMaxY;
		
		return res;
	}
	
	public static float[] scaleFromPivot(IAabb2RF aabb, float[] pivot, IVec2RF scale, @ExtractionParam float[] res)
	{
		float aabbMinX = aabb.minX();
		float aabbMinY = aabb.minY();
		float aabbMaxX = aabb.maxX();
		float aabbMaxY = aabb.maxY();
		
		float pivotX = pivot[0];
		float pivotY = pivot[1];
		
		float scaleX = scale.x();
		float scaleY = scale.y();
		
		float scaledMinX = MathUtils.fma(scaleX, aabbMinX - pivotX, pivotX);
		float scaledMinY = MathUtils.fma(scaleY, aabbMinY - pivotY, pivotY);
		float scaledMaxX = MathUtils.fma(scaleX, aabbMaxX - pivotX, pivotX);
		float scaledMaxY = MathUtils.fma(scaleY, aabbMaxY - pivotY, pivotY);
		
		float newMinX = MathUtils.min(scaledMinX, scaledMaxX);
		float newMinY = MathUtils.min(scaledMinY, scaledMaxY);
		float newMaxX = MathUtils.max(scaledMinX, scaledMaxX);
		float newMaxY = MathUtils.max(scaledMinY, scaledMaxY);
		
		res[0] = newMinX;
		res[1] = newMinY;
		res[2] = newMaxX;
		res[3] = newMaxY;
		
		return res;
	}
	
	public static float[] scaleFromPivot(IAabb2RF aabb, float[] pivot, float[] scale, @ExtractionParam float[] res)
	{
		float aabbMinX = aabb.minX();
		float aabbMinY = aabb.minY();
		float aabbMaxX = aabb.maxX();
		float aabbMaxY = aabb.maxY();
		
		float pivotX = pivot[0];
		float pivotY = pivot[1];
		
		float scaleX = scale[0];
		float scaleY = scale[1];
		
		float scaledMinX = MathUtils.fma(scaleX, aabbMinX - pivotX, pivotX);
		float scaledMinY = MathUtils.fma(scaleY, aabbMinY - pivotY, pivotY);
		float scaledMaxX = MathUtils.fma(scaleX, aabbMaxX - pivotX, pivotX);
		float scaledMaxY = MathUtils.fma(scaleY, aabbMaxY - pivotY, pivotY);
		
		float newMinX = MathUtils.min(scaledMinX, scaledMaxX);
		float newMinY = MathUtils.min(scaledMinY, scaledMaxY);
		float newMaxX = MathUtils.max(scaledMinX, scaledMaxX);
		float newMaxY = MathUtils.max(scaledMinY, scaledMaxY);
		
		res[0] = newMinX;
		res[1] = newMinY;
		res[2] = newMaxX;
		res[3] = newMaxY;
		
		return res;
	}
	
	public static float[] scaleFromPivot(IAabb2RF aabb, float[] pivot, float scaleX, float scaleY, @ExtractionParam float[] res)
	{
		float aabbMinX = aabb.minX();
		float aabbMinY = aabb.minY();
		float aabbMaxX = aabb.maxX();
		float aabbMaxY = aabb.maxY();
		
		float pivotX = pivot[0];
		float pivotY = pivot[1];
		
		float scaledMinX = MathUtils.fma(scaleX, aabbMinX - pivotX, pivotX);
		float scaledMinY = MathUtils.fma(scaleY, aabbMinY - pivotY, pivotY);
		float scaledMaxX = MathUtils.fma(scaleX, aabbMaxX - pivotX, pivotX);
		float scaledMaxY = MathUtils.fma(scaleY, aabbMaxY - pivotY, pivotY);
		
		float newMinX = MathUtils.min(scaledMinX, scaledMaxX);
		float newMinY = MathUtils.min(scaledMinY, scaledMaxY);
		float newMaxX = MathUtils.max(scaledMinX, scaledMaxX);
		float newMaxY = MathUtils.max(scaledMinY, scaledMaxY);
		
		res[0] = newMinX;
		res[1] = newMinY;
		res[2] = newMaxX;
		res[3] = newMaxY;
		
		return res;
	}
	
	public static float[] scaleFromPivot(IAabb2RF aabb, float pivotX, float pivotY, IVec2RF scale, @ExtractionParam float[] res)
	{
		float aabbMinX = aabb.minX();
		float aabbMinY = aabb.minY();
		float aabbMaxX = aabb.maxX();
		float aabbMaxY = aabb.maxY();
		
		float scaleX = scale.x();
		float scaleY = scale.y();
		
		float scaledMinX = MathUtils.fma(scaleX, aabbMinX - pivotX, pivotX);
		float scaledMinY = MathUtils.fma(scaleY, aabbMinY - pivotY, pivotY);
		float scaledMaxX = MathUtils.fma(scaleX, aabbMaxX - pivotX, pivotX);
		float scaledMaxY = MathUtils.fma(scaleY, aabbMaxY - pivotY, pivotY);
		
		float newMinX = MathUtils.min(scaledMinX, scaledMaxX);
		float newMinY = MathUtils.min(scaledMinY, scaledMaxY);
		float newMaxX = MathUtils.max(scaledMinX, scaledMaxX);
		float newMaxY = MathUtils.max(scaledMinY, scaledMaxY);
		
		res[0] = newMinX;
		res[1] = newMinY;
		res[2] = newMaxX;
		res[3] = newMaxY;
		
		return res;
	}
	
	public static float[] scaleFromPivot(IAabb2RF aabb, float pivotX, float pivotY, float[] scale, @ExtractionParam float[] res)
	{
		float aabbMinX = aabb.minX();
		float aabbMinY = aabb.minY();
		float aabbMaxX = aabb.maxX();
		float aabbMaxY = aabb.maxY();
		
		float scaleX = scale[0];
		float scaleY = scale[1];
		
		float scaledMinX = MathUtils.fma(scaleX, aabbMinX - pivotX, pivotX);
		float scaledMinY = MathUtils.fma(scaleY, aabbMinY - pivotY, pivotY);
		float scaledMaxX = MathUtils.fma(scaleX, aabbMaxX - pivotX, pivotX);
		float scaledMaxY = MathUtils.fma(scaleY, aabbMaxY - pivotY, pivotY);
		
		float newMinX = MathUtils.min(scaledMinX, scaledMaxX);
		float newMinY = MathUtils.min(scaledMinY, scaledMaxY);
		float newMaxX = MathUtils.max(scaledMinX, scaledMaxX);
		float newMaxY = MathUtils.max(scaledMinY, scaledMaxY);
		
		res[0] = newMinX;
		res[1] = newMinY;
		res[2] = newMaxX;
		res[3] = newMaxY;
		
		return res;
	}
	
	public static float[] scaleFromPivot(IAabb2RF aabb, float pivotX, float pivotY, float scaleX, float scaleY, @ExtractionParam float[] res)
	{
		float aabbMinX = aabb.minX();
		float aabbMinY = aabb.minY();
		float aabbMaxX = aabb.maxX();
		float aabbMaxY = aabb.maxY();
		
		float scaledMinX = MathUtils.fma(scaleX, aabbMinX - pivotX, pivotX);
		float scaledMinY = MathUtils.fma(scaleY, aabbMinY - pivotY, pivotY);
		float scaledMaxX = MathUtils.fma(scaleX, aabbMaxX - pivotX, pivotX);
		float scaledMaxY = MathUtils.fma(scaleY, aabbMaxY - pivotY, pivotY);
		
		float newMinX = MathUtils.min(scaledMinX, scaledMaxX);
		float newMinY = MathUtils.min(scaledMinY, scaledMaxY);
		float newMaxX = MathUtils.max(scaledMinX, scaledMaxX);
		float newMaxY = MathUtils.max(scaledMinY, scaledMaxY);
		
		res[0] = newMinX;
		res[1] = newMinY;
		res[2] = newMaxX;
		res[3] = newMaxY;
		
		return res;
	}
	
	public static float[] scaleFromPivot(float[] aabb, IVec2RF pivot, IVec2RF scale, @ExtractionParam float[] res)
	{
		float aabbMinX = aabb[0];
		float aabbMinY = aabb[1];
		float aabbMaxX = aabb[2];
		float aabbMaxY = aabb[3];
		
		float pivotX = pivot.x();
		float pivotY = pivot.y();
		
		float scaleX = scale.x();
		float scaleY = scale.y();
		
		float scaledMinX = MathUtils.fma(scaleX, aabbMinX - pivotX, pivotX);
		float scaledMinY = MathUtils.fma(scaleY, aabbMinY - pivotY, pivotY);
		float scaledMaxX = MathUtils.fma(scaleX, aabbMaxX - pivotX, pivotX);
		float scaledMaxY = MathUtils.fma(scaleY, aabbMaxY - pivotY, pivotY);
		
		float newMinX = MathUtils.min(scaledMinX, scaledMaxX);
		float newMinY = MathUtils.min(scaledMinY, scaledMaxY);
		float newMaxX = MathUtils.max(scaledMinX, scaledMaxX);
		float newMaxY = MathUtils.max(scaledMinY, scaledMaxY);
		
		res[0] = newMinX;
		res[1] = newMinY;
		res[2] = newMaxX;
		res[3] = newMaxY;
		
		return res;
	}
	
	public static float[] scaleFromPivot(float[] aabb, IVec2RF pivot, float[] scale, @ExtractionParam float[] res)
	{
		float aabbMinX = aabb[0];
		float aabbMinY = aabb[1];
		float aabbMaxX = aabb[2];
		float aabbMaxY = aabb[3];
		
		float pivotX = pivot.x();
		float pivotY = pivot.y();
		
		float scaleX = scale[0];
		float scaleY = scale[1];
		
		float scaledMinX = MathUtils.fma(scaleX, aabbMinX - pivotX, pivotX);
		float scaledMinY = MathUtils.fma(scaleY, aabbMinY - pivotY, pivotY);
		float scaledMaxX = MathUtils.fma(scaleX, aabbMaxX - pivotX, pivotX);
		float scaledMaxY = MathUtils.fma(scaleY, aabbMaxY - pivotY, pivotY);
		
		float newMinX = MathUtils.min(scaledMinX, scaledMaxX);
		float newMinY = MathUtils.min(scaledMinY, scaledMaxY);
		float newMaxX = MathUtils.max(scaledMinX, scaledMaxX);
		float newMaxY = MathUtils.max(scaledMinY, scaledMaxY);
		
		res[0] = newMinX;
		res[1] = newMinY;
		res[2] = newMaxX;
		res[3] = newMaxY;
		
		return res;
	}
	
	public static float[] scaleFromPivot(float[] aabb, IVec2RF pivot, float scaleX, float scaleY, @ExtractionParam float[] res)
	{
		float aabbMinX = aabb[0];
		float aabbMinY = aabb[1];
		float aabbMaxX = aabb[2];
		float aabbMaxY = aabb[3];
		
		float pivotX = pivot.x();
		float pivotY = pivot.y();
		
		float scaledMinX = MathUtils.fma(scaleX, aabbMinX - pivotX, pivotX);
		float scaledMinY = MathUtils.fma(scaleY, aabbMinY - pivotY, pivotY);
		float scaledMaxX = MathUtils.fma(scaleX, aabbMaxX - pivotX, pivotX);
		float scaledMaxY = MathUtils.fma(scaleY, aabbMaxY - pivotY, pivotY);
		
		float newMinX = MathUtils.min(scaledMinX, scaledMaxX);
		float newMinY = MathUtils.min(scaledMinY, scaledMaxY);
		float newMaxX = MathUtils.max(scaledMinX, scaledMaxX);
		float newMaxY = MathUtils.max(scaledMinY, scaledMaxY);
		
		res[0] = newMinX;
		res[1] = newMinY;
		res[2] = newMaxX;
		res[3] = newMaxY;
		
		return res;
	}
	
	public static float[] scaleFromPivot(float[] aabb, float[] pivot, IVec2RF scale, @ExtractionParam float[] res)
	{
		float aabbMinX = aabb[0];
		float aabbMinY = aabb[1];
		float aabbMaxX = aabb[2];
		float aabbMaxY = aabb[3];
		
		float pivotX = pivot[0];
		float pivotY = pivot[1];
		
		float scaleX = scale.x();
		float scaleY = scale.y();
		
		float scaledMinX = MathUtils.fma(scaleX, aabbMinX - pivotX, pivotX);
		float scaledMinY = MathUtils.fma(scaleY, aabbMinY - pivotY, pivotY);
		float scaledMaxX = MathUtils.fma(scaleX, aabbMaxX - pivotX, pivotX);
		float scaledMaxY = MathUtils.fma(scaleY, aabbMaxY - pivotY, pivotY);
		
		float newMinX = MathUtils.min(scaledMinX, scaledMaxX);
		float newMinY = MathUtils.min(scaledMinY, scaledMaxY);
		float newMaxX = MathUtils.max(scaledMinX, scaledMaxX);
		float newMaxY = MathUtils.max(scaledMinY, scaledMaxY);
		
		res[0] = newMinX;
		res[1] = newMinY;
		res[2] = newMaxX;
		res[3] = newMaxY;
		
		return res;
	}
	
	public static float[] scaleFromPivot(float[] aabb, float pivotX, float pivotY, IVec2RF scale, @ExtractionParam float[] res)
	{
		float aabbMinX = aabb[0];
		float aabbMinY = aabb[1];
		float aabbMaxX = aabb[2];
		float aabbMaxY = aabb[3];
		
		float scaleX = scale.x();
		float scaleY = scale.y();
		
		float scaledMinX = MathUtils.fma(scaleX, aabbMinX - pivotX, pivotX);
		float scaledMinY = MathUtils.fma(scaleY, aabbMinY - pivotY, pivotY);
		float scaledMaxX = MathUtils.fma(scaleX, aabbMaxX - pivotX, pivotX);
		float scaledMaxY = MathUtils.fma(scaleY, aabbMaxY - pivotY, pivotY);
		
		float newMinX = MathUtils.min(scaledMinX, scaledMaxX);
		float newMinY = MathUtils.min(scaledMinY, scaledMaxY);
		float newMaxX = MathUtils.max(scaledMinX, scaledMaxX);
		float newMaxY = MathUtils.max(scaledMinY, scaledMaxY);
		
		res[0] = newMinX;
		res[1] = newMinY;
		res[2] = newMaxX;
		res[3] = newMaxY;
		
		return res;
	}
	
	public static float[] scaleFromPivot(IVec2RF aabbMin, IVec2RF aabbMax, IVec2RF pivot, IVec2RF scale, @ExtractionParam float[] res)
	{
		float aabbMinX = aabbMin.x();
		float aabbMinY = aabbMin.y();
		float aabbMaxX = aabbMax.x();
		float aabbMaxY = aabbMax.y();
		
		float pivotX = pivot.x();
		float pivotY = pivot.y();
		
		float scaleX = scale.x();
		float scaleY = scale.y();
		
		float scaledMinX = MathUtils.fma(scaleX, aabbMinX - pivotX, pivotX);
		float scaledMinY = MathUtils.fma(scaleY, aabbMinY - pivotY, pivotY);
		float scaledMaxX = MathUtils.fma(scaleX, aabbMaxX - pivotX, pivotX);
		float scaledMaxY = MathUtils.fma(scaleY, aabbMaxY - pivotY, pivotY);
		
		float newMinX = MathUtils.min(scaledMinX, scaledMaxX);
		float newMinY = MathUtils.min(scaledMinY, scaledMaxY);
		float newMaxX = MathUtils.max(scaledMinX, scaledMaxX);
		float newMaxY = MathUtils.max(scaledMinY, scaledMaxY);
		
		res[0] = newMinX;
		res[1] = newMinY;
		res[2] = newMaxX;
		res[3] = newMaxY;
		
		return res;
	}
	
	public static float[] scaleFromPivot(IVec2RF aabbMin, IVec2RF aabbMax, IVec2RF pivot, float[] scale, @ExtractionParam float[] res)
	{
		float aabbMinX = aabbMin.x();
		float aabbMinY = aabbMin.y();
		float aabbMaxX = aabbMax.x();
		float aabbMaxY = aabbMax.y();
		
		float pivotX = pivot.x();
		float pivotY = pivot.y();
		
		float scaleX = scale[0];
		float scaleY = scale[1];
		
		float scaledMinX = MathUtils.fma(scaleX, aabbMinX - pivotX, pivotX);
		float scaledMinY = MathUtils.fma(scaleY, aabbMinY - pivotY, pivotY);
		float scaledMaxX = MathUtils.fma(scaleX, aabbMaxX - pivotX, pivotX);
		float scaledMaxY = MathUtils.fma(scaleY, aabbMaxY - pivotY, pivotY);
		
		float newMinX = MathUtils.min(scaledMinX, scaledMaxX);
		float newMinY = MathUtils.min(scaledMinY, scaledMaxY);
		float newMaxX = MathUtils.max(scaledMinX, scaledMaxX);
		float newMaxY = MathUtils.max(scaledMinY, scaledMaxY);
		
		res[0] = newMinX;
		res[1] = newMinY;
		res[2] = newMaxX;
		res[3] = newMaxY;
		
		return res;
	}
	
	public static float[] scaleFromPivot(IVec2RF aabbMin, IVec2RF aabbMax, IVec2RF pivot, float scaleX, float scaleY, @ExtractionParam float[] res)
	{
		float aabbMinX = aabbMin.x();
		float aabbMinY = aabbMin.y();
		float aabbMaxX = aabbMax.x();
		float aabbMaxY = aabbMax.y();
		
		float pivotX = pivot.x();
		float pivotY = pivot.y();
		
		float scaledMinX = MathUtils.fma(scaleX, aabbMinX - pivotX, pivotX);
		float scaledMinY = MathUtils.fma(scaleY, aabbMinY - pivotY, pivotY);
		float scaledMaxX = MathUtils.fma(scaleX, aabbMaxX - pivotX, pivotX);
		float scaledMaxY = MathUtils.fma(scaleY, aabbMaxY - pivotY, pivotY);
		
		float newMinX = MathUtils.min(scaledMinX, scaledMaxX);
		float newMinY = MathUtils.min(scaledMinY, scaledMaxY);
		float newMaxX = MathUtils.max(scaledMinX, scaledMaxX);
		float newMaxY = MathUtils.max(scaledMinY, scaledMaxY);
		
		res[0] = newMinX;
		res[1] = newMinY;
		res[2] = newMaxX;
		res[3] = newMaxY;
		
		return res;
	}
	
	public static float[] scaleFromPivot(IVec2RF aabbMin, IVec2RF aabbMax, float[] pivot, IVec2RF scale, @ExtractionParam float[] res)
	{
		float aabbMinX = aabbMin.x();
		float aabbMinY = aabbMin.y();
		float aabbMaxX = aabbMax.x();
		float aabbMaxY = aabbMax.y();
		
		float pivotX = pivot[0];
		float pivotY = pivot[1];
		
		float scaleX = scale.x();
		float scaleY = scale.y();
		
		float scaledMinX = MathUtils.fma(scaleX, aabbMinX - pivotX, pivotX);
		float scaledMinY = MathUtils.fma(scaleY, aabbMinY - pivotY, pivotY);
		float scaledMaxX = MathUtils.fma(scaleX, aabbMaxX - pivotX, pivotX);
		float scaledMaxY = MathUtils.fma(scaleY, aabbMaxY - pivotY, pivotY);
		
		float newMinX = MathUtils.min(scaledMinX, scaledMaxX);
		float newMinY = MathUtils.min(scaledMinY, scaledMaxY);
		float newMaxX = MathUtils.max(scaledMinX, scaledMaxX);
		float newMaxY = MathUtils.max(scaledMinY, scaledMaxY);
		
		res[0] = newMinX;
		res[1] = newMinY;
		res[2] = newMaxX;
		res[3] = newMaxY;
		
		return res;
	}
	
	public static float[] scaleFromPivot(IVec2RF aabbMin, IVec2RF aabbMax, float[] pivot, float[] scale, @ExtractionParam float[] res)
	{
		float aabbMinX = aabbMin.x();
		float aabbMinY = aabbMin.y();
		float aabbMaxX = aabbMax.x();
		float aabbMaxY = aabbMax.y();
		
		float pivotX = pivot[0];
		float pivotY = pivot[1];
		
		float scaleX = scale[0];
		float scaleY = scale[1];
		
		float scaledMinX = MathUtils.fma(scaleX, aabbMinX - pivotX, pivotX);
		float scaledMinY = MathUtils.fma(scaleY, aabbMinY - pivotY, pivotY);
		float scaledMaxX = MathUtils.fma(scaleX, aabbMaxX - pivotX, pivotX);
		float scaledMaxY = MathUtils.fma(scaleY, aabbMaxY - pivotY, pivotY);
		
		float newMinX = MathUtils.min(scaledMinX, scaledMaxX);
		float newMinY = MathUtils.min(scaledMinY, scaledMaxY);
		float newMaxX = MathUtils.max(scaledMinX, scaledMaxX);
		float newMaxY = MathUtils.max(scaledMinY, scaledMaxY);
		
		res[0] = newMinX;
		res[1] = newMinY;
		res[2] = newMaxX;
		res[3] = newMaxY;
		
		return res;
	}
	
	public static float[] scaleFromPivot(IVec2RF aabbMin, IVec2RF aabbMax, float[] pivot, float scaleX, float scaleY, @ExtractionParam float[] res)
	{
		float aabbMinX = aabbMin.x();
		float aabbMinY = aabbMin.y();
		float aabbMaxX = aabbMax.x();
		float aabbMaxY = aabbMax.y();
		
		float pivotX = pivot[0];
		float pivotY = pivot[1];
		
		float scaledMinX = MathUtils.fma(scaleX, aabbMinX - pivotX, pivotX);
		float scaledMinY = MathUtils.fma(scaleY, aabbMinY - pivotY, pivotY);
		float scaledMaxX = MathUtils.fma(scaleX, aabbMaxX - pivotX, pivotX);
		float scaledMaxY = MathUtils.fma(scaleY, aabbMaxY - pivotY, pivotY);
		
		float newMinX = MathUtils.min(scaledMinX, scaledMaxX);
		float newMinY = MathUtils.min(scaledMinY, scaledMaxY);
		float newMaxX = MathUtils.max(scaledMinX, scaledMaxX);
		float newMaxY = MathUtils.max(scaledMinY, scaledMaxY);
		
		res[0] = newMinX;
		res[1] = newMinY;
		res[3] = newMaxX;
		res[4] = newMaxY;
		
		return res;
	}
	
	public static float[] scaleFromPivot(IVec2RF aabbMin, IVec2RF aabbMax, float pivotX, float pivotY, float pivotZ, IVec2RF scale, @ExtractionParam float[] res)
	{
		float aabbMinX = aabbMin.x();
		float aabbMinY = aabbMin.y();
		float aabbMaxX = aabbMax.x();
		float aabbMaxY = aabbMax.y();
		
		float scaleX = scale.x();
		float scaleY = scale.y();
		
		float scaledMinX = MathUtils.fma(scaleX, aabbMinX - pivotX, pivotX);
		float scaledMinY = MathUtils.fma(scaleY, aabbMinY - pivotY, pivotY);
		float scaledMaxX = MathUtils.fma(scaleX, aabbMaxX - pivotX, pivotX);
		float scaledMaxY = MathUtils.fma(scaleY, aabbMaxY - pivotY, pivotY);
		
		float newMinX = MathUtils.min(scaledMinX, scaledMaxX);
		float newMinY = MathUtils.min(scaledMinY, scaledMaxY);
		float newMaxX = MathUtils.max(scaledMinX, scaledMaxX);
		float newMaxY = MathUtils.max(scaledMinY, scaledMaxY);
		
		res[0] = newMinX;
		res[1] = newMinY;
		res[2] = newMaxX;
		res[3] = newMaxY;
		
		return res;
	}
	
	public static float[] scaleFromPivot(IVec2RF aabbMin, IVec2RF aabbMax, float pivotX, float pivotY, float[] scale, @ExtractionParam float[] res)
	{
		float aabbMinX = aabbMin.x();
		float aabbMinY = aabbMin.y();
		float aabbMaxX = aabbMax.x();
		float aabbMaxY = aabbMax.y();
		
		float scaleX = scale[0];
		float scaleY = scale[1];
		
		float scaledMinX = MathUtils.fma(scaleX, aabbMinX - pivotX, pivotX);
		float scaledMinY = MathUtils.fma(scaleY, aabbMinY - pivotY, pivotY);
		float scaledMaxX = MathUtils.fma(scaleX, aabbMaxX - pivotX, pivotX);
		float scaledMaxY = MathUtils.fma(scaleY, aabbMaxY - pivotY, pivotY);
		
		float newMinX = MathUtils.min(scaledMinX, scaledMaxX);
		float newMinY = MathUtils.min(scaledMinY, scaledMaxY);
		float newMaxX = MathUtils.max(scaledMinX, scaledMaxX);
		float newMaxY = MathUtils.max(scaledMinY, scaledMaxY);
		
		res[0] = newMinX;
		res[1] = newMinY;
		res[2] = newMaxX;
		res[3] = newMaxY;
		
		return res;
	}
	
	public static float[] scaleFromPivot(IVec2RF aabbMin, IVec2RF aabbMax, float pivotX, float pivotY, float scaleX, float scaleY, @ExtractionParam float[] res)
	{
		float aabbMinX = aabbMin.x();
		float aabbMinY = aabbMin.y();
		float aabbMaxX = aabbMax.x();
		float aabbMaxY = aabbMax.y();
		
		float scaledMinX = MathUtils.fma(scaleX, aabbMinX - pivotX, pivotX);
		float scaledMinY = MathUtils.fma(scaleY, aabbMinY - pivotY, pivotY);
		float scaledMaxX = MathUtils.fma(scaleX, aabbMaxX - pivotX, pivotX);
		float scaledMaxY = MathUtils.fma(scaleY, aabbMaxY - pivotY, pivotY);
		
		float newMinX = MathUtils.min(scaledMinX, scaledMaxX);
		float newMinY = MathUtils.min(scaledMinY, scaledMaxY);
		float newMaxX = MathUtils.max(scaledMinX, scaledMaxX);
		float newMaxY = MathUtils.max(scaledMinY, scaledMaxY);
		
		res[0] = newMinX;
		res[1] = newMinY;
		res[2] = newMaxX;
		res[3] = newMaxY;
		
		return res;
	}
	
	public static float[] scaleFromPivot(IVec2RF aabbMin, float[] aabbMax, IVec2RF pivot, IVec2RF scale, @ExtractionParam float[] res)
	{
		float aabbMinX = aabbMin.x();
		float aabbMinY = aabbMin.y();
		float aabbMaxX = aabbMax[0];
		float aabbMaxY = aabbMax[1];
		
		float pivotX = pivot.x();
		float pivotY = pivot.y();
		
		float scaleX = scale.x();
		float scaleY = scale.y();
		
		float scaledMinX = MathUtils.fma(scaleX, aabbMinX - pivotX, pivotX);
		float scaledMinY = MathUtils.fma(scaleY, aabbMinY - pivotY, pivotY);
		float scaledMaxX = MathUtils.fma(scaleX, aabbMaxX - pivotX, pivotX);
		float scaledMaxY = MathUtils.fma(scaleY, aabbMaxY - pivotY, pivotY);
		
		float newMinX = MathUtils.min(scaledMinX, scaledMaxX);
		float newMinY = MathUtils.min(scaledMinY, scaledMaxY);
		float newMaxX = MathUtils.max(scaledMinX, scaledMaxX);
		float newMaxY = MathUtils.max(scaledMinY, scaledMaxY);
		
		res[0] = newMinX;
		res[1] = newMinY;
		res[2] = newMaxX;
		res[3] = newMaxY;
		
		return res;
	}
	
	public static float[] scaleFromPivot(IVec2RF aabbMin, float[] aabbMax, IVec2RF pivot, float[] scale, @ExtractionParam float[] res)
	{
		float aabbMinX = aabbMin.x();
		float aabbMinY = aabbMin.y();
		float aabbMaxX = aabbMax[0];
		float aabbMaxY = aabbMax[1];
		
		float pivotX = pivot.x();
		float pivotY = pivot.y();
		
		float scaleX = scale[0];
		float scaleY = scale[1];
		
		float scaledMinX = MathUtils.fma(scaleX, aabbMinX - pivotX, pivotX);
		float scaledMinY = MathUtils.fma(scaleY, aabbMinY - pivotY, pivotY);
		float scaledMaxX = MathUtils.fma(scaleX, aabbMaxX - pivotX, pivotX);
		float scaledMaxY = MathUtils.fma(scaleY, aabbMaxY - pivotY, pivotY);
		
		float newMinX = MathUtils.min(scaledMinX, scaledMaxX);
		float newMinY = MathUtils.min(scaledMinY, scaledMaxY);
		float newMaxX = MathUtils.max(scaledMinX, scaledMaxX);
		float newMaxY = MathUtils.max(scaledMinY, scaledMaxY);
		
		res[0] = newMinX;
		res[1] = newMinY;
		res[2] = newMaxX;
		res[3] = newMaxY;
		
		return res;
	}
	
	public static float[] scaleFromPivot(IVec2RF aabbMin, float[] aabbMax, IVec2RF pivot, float scaleX, float scaleY, @ExtractionParam float[] res)
	{
		float aabbMinX = aabbMin.x();
		float aabbMinY = aabbMin.y();
		float aabbMaxX = aabbMax[0];
		float aabbMaxY = aabbMax[1];
		
		float pivotX = pivot.x();
		float pivotY = pivot.y();
		
		float scaledMinX = MathUtils.fma(scaleX, aabbMinX - pivotX, pivotX);
		float scaledMinY = MathUtils.fma(scaleY, aabbMinY - pivotY, pivotY);
		float scaledMaxX = MathUtils.fma(scaleX, aabbMaxX - pivotX, pivotX);
		float scaledMaxY = MathUtils.fma(scaleY, aabbMaxY - pivotY, pivotY);
		
		float newMinX = MathUtils.min(scaledMinX, scaledMaxX);
		float newMinY = MathUtils.min(scaledMinY, scaledMaxY);
		float newMaxX = MathUtils.max(scaledMinX, scaledMaxX);
		float newMaxY = MathUtils.max(scaledMinY, scaledMaxY);
		
		res[0] = newMinX;
		res[1] = newMinY;
		res[2] = newMaxX;
		res[3] = newMaxY;
		
		return res;
	}
	
	public static float[] scaleFromPivot(IVec2RF aabbMin, float[] aabbMax, float[] pivot, IVec2RF scale, @ExtractionParam float[] res)
	{
		float aabbMinX = aabbMin.x();
		float aabbMinY = aabbMin.y();
		float aabbMaxX = aabbMax[0];
		float aabbMaxY = aabbMax[1];
		
		float pivotX = pivot[0];
		float pivotY = pivot[1];
		
		float scaleX = scale.x();
		float scaleY = scale.y();
		
		float scaledMinX = MathUtils.fma(scaleX, aabbMinX - pivotX, pivotX);
		float scaledMinY = MathUtils.fma(scaleY, aabbMinY - pivotY, pivotY);
		float scaledMaxX = MathUtils.fma(scaleX, aabbMaxX - pivotX, pivotX);
		float scaledMaxY = MathUtils.fma(scaleY, aabbMaxY - pivotY, pivotY);
		
		float newMinX = MathUtils.min(scaledMinX, scaledMaxX);
		float newMinY = MathUtils.min(scaledMinY, scaledMaxY);
		float newMaxX = MathUtils.max(scaledMinX, scaledMaxX);
		float newMaxY = MathUtils.max(scaledMinY, scaledMaxY);
		
		res[0] = newMinX;
		res[1] = newMinY;
		res[2] = newMaxX;
		res[3] = newMaxY;
		
		return res;
	}
	
	public static float[] scaleFromPivot(IVec2RF aabbMin, float[] aabbMax, float[] pivot, float[] scale, @ExtractionParam float[] res)
	{
		float aabbMinX = aabbMin.x();
		float aabbMinY = aabbMin.y();
		float aabbMaxX = aabbMax[0];
		float aabbMaxY = aabbMax[1];
		
		float pivotX = pivot[0];
		float pivotY = pivot[1];
		
		float scaleX = scale[0];
		float scaleY = scale[1];
		
		float scaledMinX = MathUtils.fma(scaleX, aabbMinX - pivotX, pivotX);
		float scaledMinY = MathUtils.fma(scaleY, aabbMinY - pivotY, pivotY);
		float scaledMaxX = MathUtils.fma(scaleX, aabbMaxX - pivotX, pivotX);
		float scaledMaxY = MathUtils.fma(scaleY, aabbMaxY - pivotY, pivotY);
		
		float newMinX = MathUtils.min(scaledMinX, scaledMaxX);
		float newMinY = MathUtils.min(scaledMinY, scaledMaxY);
		float newMaxX = MathUtils.max(scaledMinX, scaledMaxX);
		float newMaxY = MathUtils.max(scaledMinY, scaledMaxY);
		
		res[0] = newMinX;
		res[1] = newMinY;
		res[2] = newMaxX;
		res[3] = newMaxY;
		
		return res;
	}
	
	public static float[] scaleFromPivot(IVec2RF aabbMin, float[] aabbMax, float[] pivot, float scaleX, float scaleY, @ExtractionParam float[] res)
	{
		float aabbMinX = aabbMin.x();
		float aabbMinY = aabbMin.y();
		float aabbMaxX = aabbMax[0];
		float aabbMaxY = aabbMax[1];
		
		float pivotX = pivot[0];
		float pivotY = pivot[1];
		
		float scaledMinX = MathUtils.fma(scaleX, aabbMinX - pivotX, pivotX);
		float scaledMinY = MathUtils.fma(scaleY, aabbMinY - pivotY, pivotY);
		float scaledMaxX = MathUtils.fma(scaleX, aabbMaxX - pivotX, pivotX);
		float scaledMaxY = MathUtils.fma(scaleY, aabbMaxY - pivotY, pivotY);
		
		float newMinX = MathUtils.min(scaledMinX, scaledMaxX);
		float newMinY = MathUtils.min(scaledMinY, scaledMaxY);
		float newMaxX = MathUtils.max(scaledMinX, scaledMaxX);
		float newMaxY = MathUtils.max(scaledMinY, scaledMaxY);
		
		res[0] = newMinX;
		res[1] = newMinY;
		res[2] = newMaxX;
		res[3] = newMaxY;
		
		return res;
	}
	
	public static float[] scaleFromPivot(IVec2RF aabbMin, float[] aabbMax, float pivotX, float pivotY, IVec2RF scale, @ExtractionParam float[] res)
	{
		float aabbMinX = aabbMin.x();
		float aabbMinY = aabbMin.y();
		float aabbMaxX = aabbMax[0];
		float aabbMaxY = aabbMax[1];
		
		float scaleX = scale.x();
		float scaleY = scale.y();
		
		float scaledMinX = MathUtils.fma(scaleX, aabbMinX - pivotX, pivotX);
		float scaledMinY = MathUtils.fma(scaleY, aabbMinY - pivotY, pivotY);
		float scaledMaxX = MathUtils.fma(scaleX, aabbMaxX - pivotX, pivotX);
		float scaledMaxY = MathUtils.fma(scaleY, aabbMaxY - pivotY, pivotY);
		
		float newMinX = MathUtils.min(scaledMinX, scaledMaxX);
		float newMinY = MathUtils.min(scaledMinY, scaledMaxY);
		float newMaxX = MathUtils.max(scaledMinX, scaledMaxX);
		float newMaxY = MathUtils.max(scaledMinY, scaledMaxY);
		
		res[0] = newMinX;
		res[1] = newMinY;
		res[2] = newMaxX;
		res[3] = newMaxY;
		
		return res;
	}
	
	public static float[] scaleFromPivot(IVec2RF aabbMin, float[] aabbMax, float pivotX, float pivotY, float[] scale, @ExtractionParam float[] res)
	{
		float aabbMinX = aabbMin.x();
		float aabbMinY = aabbMin.y();
		float aabbMaxX = aabbMax[0];
		float aabbMaxY = aabbMax[1];
		
		float scaleX = scale[0];
		float scaleY = scale[1];
		
		float scaledMinX = MathUtils.fma(scaleX, aabbMinX - pivotX, pivotX);
		float scaledMinY = MathUtils.fma(scaleY, aabbMinY - pivotY, pivotY);
		float scaledMaxX = MathUtils.fma(scaleX, aabbMaxX - pivotX, pivotX);
		float scaledMaxY = MathUtils.fma(scaleY, aabbMaxY - pivotY, pivotY);
		
		float newMinX = MathUtils.min(scaledMinX, scaledMaxX);
		float newMinY = MathUtils.min(scaledMinY, scaledMaxY);
		float newMaxX = MathUtils.max(scaledMinX, scaledMaxX);
		float newMaxY = MathUtils.max(scaledMinY, scaledMaxY);
		
		res[0] = newMinX;
		res[1] = newMinY;
		res[2] = newMaxX;
		res[3] = newMaxY;
		
		return res;
	}
	
	public static float[] scaleFromPivot(IVec2RF aabbMin, float[] aabbMax, float pivotX, float pivotY, float scaleX, float scaleY, @ExtractionParam float[] res)
	{
		float aabbMinX = aabbMin.x();
		float aabbMinY = aabbMin.y();
		float aabbMaxX = aabbMax[0];
		float aabbMaxY = aabbMax[1];
		
		float scaledMinX = MathUtils.fma(scaleX, aabbMinX - pivotX, pivotX);
		float scaledMinY = MathUtils.fma(scaleY, aabbMinY - pivotY, pivotY);
		float scaledMaxX = MathUtils.fma(scaleX, aabbMaxX - pivotX, pivotX);
		float scaledMaxY = MathUtils.fma(scaleY, aabbMaxY - pivotY, pivotY);
		
		float newMinX = MathUtils.min(scaledMinX, scaledMaxX);
		float newMinY = MathUtils.min(scaledMinY, scaledMaxY);
		float newMaxX = MathUtils.max(scaledMinX, scaledMaxX);
		float newMaxY = MathUtils.max(scaledMinY, scaledMaxY);
		
		res[0] = newMinX;
		res[1] = newMinY;
		res[2] = newMaxX;
		res[3] = newMaxY;
		
		return res;
	}
	
	public static float[] scaleFromPivot(IVec2RF aabbMin, float aabbMaxX, float aabbMaxY, IVec2RF pivot, IVec2RF scale, @ExtractionParam float[] res)
	{
		float aabbMinX = aabbMin.x();
		float aabbMinY = aabbMin.y();
		
		float pivotX = pivot.x();
		float pivotY = pivot.y();
		
		float scaleX = scale.x();
		float scaleY = scale.y();
		
		float scaledMinX = MathUtils.fma(scaleX, aabbMinX - pivotX, pivotX);
		float scaledMinY = MathUtils.fma(scaleY, aabbMinY - pivotY, pivotY);
		float scaledMaxX = MathUtils.fma(scaleX, aabbMaxX - pivotX, pivotX);
		float scaledMaxY = MathUtils.fma(scaleY, aabbMaxY - pivotY, pivotY);
		
		float newMinX = MathUtils.min(scaledMinX, scaledMaxX);
		float newMinY = MathUtils.min(scaledMinY, scaledMaxY);
		float newMaxX = MathUtils.max(scaledMinX, scaledMaxX);
		float newMaxY = MathUtils.max(scaledMinY, scaledMaxY);
		
		res[0] = newMinX;
		res[1] = newMinY;
		res[2] = newMaxX;
		res[3] = newMaxY;
		
		return res;
	}
	
	public static float[] scaleFromPivot(IVec2RF aabbMin, float aabbMaxX, float aabbMaxY, IVec2RF pivot, float[] scale, @ExtractionParam float[] res)
	{
		float aabbMinX = aabbMin.x();
		float aabbMinY = aabbMin.y();
		
		float pivotX = pivot.x();
		float pivotY = pivot.y();
		
		float scaleX = scale[0];
		float scaleY = scale[1];
		
		float scaledMinX = MathUtils.fma(scaleX, aabbMinX - pivotX, pivotX);
		float scaledMinY = MathUtils.fma(scaleY, aabbMinY - pivotY, pivotY);
		float scaledMaxX = MathUtils.fma(scaleX, aabbMaxX - pivotX, pivotX);
		float scaledMaxY = MathUtils.fma(scaleY, aabbMaxY - pivotY, pivotY);
		
		float newMinX = MathUtils.min(scaledMinX, scaledMaxX);
		float newMinY = MathUtils.min(scaledMinY, scaledMaxY);
		float newMaxX = MathUtils.max(scaledMinX, scaledMaxX);
		float newMaxY = MathUtils.max(scaledMinY, scaledMaxY);
		
		res[0] = newMinX;
		res[1] = newMinY;
		res[2] = newMaxX;
		res[3] = newMaxY;
		
		return res;
	}
	
	public static float[] scaleFromPivot(IVec2RF aabbMin, float aabbMaxX, float aabbMaxY, IVec2RF pivot, float scaleX, float scaleY, @ExtractionParam float[] res)
	{
		float aabbMinX = aabbMin.x();
		float aabbMinY = aabbMin.y();
		
		float pivotX = pivot.x();
		float pivotY = pivot.y();
		
		float scaledMinX = MathUtils.fma(scaleX, aabbMinX - pivotX, pivotX);
		float scaledMinY = MathUtils.fma(scaleY, aabbMinY - pivotY, pivotY);
		float scaledMaxX = MathUtils.fma(scaleX, aabbMaxX - pivotX, pivotX);
		float scaledMaxY = MathUtils.fma(scaleY, aabbMaxY - pivotY, pivotY);
		
		float newMinX = MathUtils.min(scaledMinX, scaledMaxX);
		float newMinY = MathUtils.min(scaledMinY, scaledMaxY);
		float newMaxX = MathUtils.max(scaledMinX, scaledMaxX);
		float newMaxY = MathUtils.max(scaledMinY, scaledMaxY);
		
		res[0] = newMinX;
		res[1] = newMinY;
		res[2] = newMaxX;
		res[3] = newMaxY;
		
		return res;
	}
	
	public static float[] scaleFromPivot(IVec2RF aabbMin, float aabbMaxX, float aabbMaxY, float[] pivot, IVec2RF scale, @ExtractionParam float[] res)
	{
		float aabbMinX = aabbMin.x();
		float aabbMinY = aabbMin.y();
		
		float pivotX = pivot[0];
		float pivotY = pivot[1];
		
		float scaleX = scale.x();
		float scaleY = scale.y();
		
		float scaledMinX = MathUtils.fma(scaleX, aabbMinX - pivotX, pivotX);
		float scaledMinY = MathUtils.fma(scaleY, aabbMinY - pivotY, pivotY);
		float scaledMaxX = MathUtils.fma(scaleX, aabbMaxX - pivotX, pivotX);
		float scaledMaxY = MathUtils.fma(scaleY, aabbMaxY - pivotY, pivotY);
		
		float newMinX = MathUtils.min(scaledMinX, scaledMaxX);
		float newMinY = MathUtils.min(scaledMinY, scaledMaxY);
		float newMaxX = MathUtils.max(scaledMinX, scaledMaxX);
		float newMaxY = MathUtils.max(scaledMinY, scaledMaxY);
		
		res[0] = newMinX;
		res[1] = newMinY;
		res[2] = newMaxX;
		res[3] = newMaxY;
		
		return res;
	}
	
	public static float[] scaleFromPivot(IVec2RF aabbMin, float aabbMaxX, float aabbMaxY, float[] pivot, float[] scale, @ExtractionParam float[] res)
	{
		float aabbMinX = aabbMin.x();
		float aabbMinY = aabbMin.y();
		
		float pivotX = pivot[0];
		float pivotY = pivot[1];
		
		float scaleX = scale[0];
		float scaleY = scale[1];
		
		float scaledMinX = MathUtils.fma(scaleX, aabbMinX - pivotX, pivotX);
		float scaledMinY = MathUtils.fma(scaleY, aabbMinY - pivotY, pivotY);
		float scaledMaxX = MathUtils.fma(scaleX, aabbMaxX - pivotX, pivotX);
		float scaledMaxY = MathUtils.fma(scaleY, aabbMaxY - pivotY, pivotY);
		
		float newMinX = MathUtils.min(scaledMinX, scaledMaxX);
		float newMinY = MathUtils.min(scaledMinY, scaledMaxY);
		float newMaxX = MathUtils.max(scaledMinX, scaledMaxX);
		float newMaxY = MathUtils.max(scaledMinY, scaledMaxY);
		
		res[0] = newMinX;
		res[1] = newMinY;
		res[2] = newMaxX;
		res[3] = newMaxY;
		
		return res;
	}
	
	public static float[] scaleFromPivot(IVec2RF aabbMin, float aabbMaxX, float aabbMaxY, float[] pivot, float scaleX, float scaleY, @ExtractionParam float[] res)
	{
		float aabbMinX = aabbMin.x();
		float aabbMinY = aabbMin.y();
		
		float pivotX = pivot[0];
		float pivotY = pivot[1];
		
		float scaledMinX = MathUtils.fma(scaleX, aabbMinX - pivotX, pivotX);
		float scaledMinY = MathUtils.fma(scaleY, aabbMinY - pivotY, pivotY);
		float scaledMaxX = MathUtils.fma(scaleX, aabbMaxX - pivotX, pivotX);
		float scaledMaxY = MathUtils.fma(scaleY, aabbMaxY - pivotY, pivotY);
		
		float newMinX = MathUtils.min(scaledMinX, scaledMaxX);
		float newMinY = MathUtils.min(scaledMinY, scaledMaxY);
		float newMaxX = MathUtils.max(scaledMinX, scaledMaxX);
		float newMaxY = MathUtils.max(scaledMinY, scaledMaxY);
		
		res[0] = newMinX;
		res[1] = newMinY;
		res[2] = newMaxX;
		res[3] = newMaxY;
		
		return res;
	}
	
	public static float[] scaleFromPivot(IVec2RF aabbMin, float aabbMaxX, float aabbMaxY, float pivotX, float pivotY, IVec2RF scale, @ExtractionParam float[] res)
	{
		float aabbMinX = aabbMin.x();
		float aabbMinY = aabbMin.y();
		
		float scaleX = scale.x();
		float scaleY = scale.y();
		
		float scaledMinX = MathUtils.fma(scaleX, aabbMinX - pivotX, pivotX);
		float scaledMinY = MathUtils.fma(scaleY, aabbMinY - pivotY, pivotY);
		float scaledMaxX = MathUtils.fma(scaleX, aabbMaxX - pivotX, pivotX);
		float scaledMaxY = MathUtils.fma(scaleY, aabbMaxY - pivotY, pivotY);
		
		float newMinX = MathUtils.min(scaledMinX, scaledMaxX);
		float newMinY = MathUtils.min(scaledMinY, scaledMaxY);
		float newMaxX = MathUtils.max(scaledMinX, scaledMaxX);
		float newMaxY = MathUtils.max(scaledMinY, scaledMaxY);
		
		res[0] = newMinX;
		res[1] = newMinY;
		res[2] = newMaxX;
		res[3] = newMaxY;
		
		return res;
	}
	
	public static float[] scaleFromPivot(IVec2RF aabbMin, float aabbMaxX, float aabbMaxY, float pivotX, float pivotY, float[] scale, @ExtractionParam float[] res)
	{
		float aabbMinX = aabbMin.x();
		float aabbMinY = aabbMin.y();
		
		float scaleX = scale[0];
		float scaleY = scale[1];
		
		float scaledMinX = MathUtils.fma(scaleX, aabbMinX - pivotX, pivotX);
		float scaledMinY = MathUtils.fma(scaleY, aabbMinY - pivotY, pivotY);
		float scaledMaxX = MathUtils.fma(scaleX, aabbMaxX - pivotX, pivotX);
		float scaledMaxY = MathUtils.fma(scaleY, aabbMaxY - pivotY, pivotY);
		
		float newMinX = MathUtils.min(scaledMinX, scaledMaxX);
		float newMinY = MathUtils.min(scaledMinY, scaledMaxY);
		float newMaxX = MathUtils.max(scaledMinX, scaledMaxX);
		float newMaxY = MathUtils.max(scaledMinY, scaledMaxY);
		
		res[0] = newMinX;
		res[1] = newMinY;
		res[2] = newMaxX;
		res[3] = newMaxY;
		
		return res;
	}
	
	public static float[] scaleFromPivot(IVec2RF aabbMin, float aabbMaxX, float aabbMaxY, float pivotX, float pivotY, float scaleX, float scaleY, @ExtractionParam float[] res)
	{
		float aabbMinX = aabbMin.x();
		float aabbMinY = aabbMin.y();
		
		float scaledMinX = MathUtils.fma(scaleX, aabbMinX - pivotX, pivotX);
		float scaledMinY = MathUtils.fma(scaleY, aabbMinY - pivotY, pivotY);
		float scaledMaxX = MathUtils.fma(scaleX, aabbMaxX - pivotX, pivotX);
		float scaledMaxY = MathUtils.fma(scaleY, aabbMaxY - pivotY, pivotY);
		
		float newMinX = MathUtils.min(scaledMinX, scaledMaxX);
		float newMinY = MathUtils.min(scaledMinY, scaledMaxY);
		float newMaxX = MathUtils.max(scaledMinX, scaledMaxX);
		float newMaxY = MathUtils.max(scaledMinY, scaledMaxY);
		
		res[0] = newMinX;
		res[1] = newMinY;
		res[2] = newMaxX;
		res[3] = newMaxY;
		
		return res;
	}
	
	public static float[] scaleFromPivot(float[] aabbMin, IVec2RF aabbMax, IVec2RF pivot, IVec2RF scale, @ExtractionParam float[] res)
	{
		float aabbMinX = aabbMin[0];
		float aabbMinY = aabbMin[1];
		float aabbMaxX = aabbMax.x();
		float aabbMaxY = aabbMax.y();
		
		float pivotX = pivot.x();
		float pivotY = pivot.y();
		
		float scaleX = scale.x();
		float scaleY = scale.y();
		
		float scaledMinX = MathUtils.fma(scaleX, aabbMinX - pivotX, pivotX);
		float scaledMinY = MathUtils.fma(scaleY, aabbMinY - pivotY, pivotY);
		float scaledMaxX = MathUtils.fma(scaleX, aabbMaxX - pivotX, pivotX);
		float scaledMaxY = MathUtils.fma(scaleY, aabbMaxY - pivotY, pivotY);
		
		float newMinX = MathUtils.min(scaledMinX, scaledMaxX);
		float newMinY = MathUtils.min(scaledMinY, scaledMaxY);
		float newMaxX = MathUtils.max(scaledMinX, scaledMaxX);
		float newMaxY = MathUtils.max(scaledMinY, scaledMaxY);
		
		res[0] = newMinX;
		res[1] = newMinY;
		res[2] = newMaxX;
		res[3] = newMaxY;
		
		return res;
	}
	
	public static float[] scaleFromPivot(float[] aabbMin, IVec2RF aabbMax, IVec2RF pivot, float[] scale, @ExtractionParam float[] res)
	{
		float aabbMinX = aabbMin[0];
		float aabbMinY = aabbMin[1];
		float aabbMaxX = aabbMax.x();
		float aabbMaxY = aabbMax.y();
		
		float pivotX = pivot.x();
		float pivotY = pivot.y();
		
		float scaleX = scale[0];
		float scaleY = scale[1];
		
		float scaledMinX = MathUtils.fma(scaleX, aabbMinX - pivotX, pivotX);
		float scaledMinY = MathUtils.fma(scaleY, aabbMinY - pivotY, pivotY);
		float scaledMaxX = MathUtils.fma(scaleX, aabbMaxX - pivotX, pivotX);
		float scaledMaxY = MathUtils.fma(scaleY, aabbMaxY - pivotY, pivotY);
		
		float newMinX = MathUtils.min(scaledMinX, scaledMaxX);
		float newMinY = MathUtils.min(scaledMinY, scaledMaxY);
		float newMaxX = MathUtils.max(scaledMinX, scaledMaxX);
		float newMaxY = MathUtils.max(scaledMinY, scaledMaxY);
		
		res[0] = newMinX;
		res[1] = newMinY;
		res[2] = newMaxX;
		res[3] = newMaxY;
		
		return res;
	}
	
	public static float[] scaleFromPivot(float[] aabbMin, IVec2RF aabbMax, IVec2RF pivot, float scaleX, float scaleY, @ExtractionParam float[] res)
	{
		float aabbMinX = aabbMin[0];
		float aabbMinY = aabbMin[1];
		float aabbMaxX = aabbMax.x();
		float aabbMaxY = aabbMax.y();
		
		float pivotX = pivot.x();
		float pivotY = pivot.y();
		
		float scaledMinX = MathUtils.fma(scaleX, aabbMinX - pivotX, pivotX);
		float scaledMinY = MathUtils.fma(scaleY, aabbMinY - pivotY, pivotY);
		float scaledMaxX = MathUtils.fma(scaleX, aabbMaxX - pivotX, pivotX);
		float scaledMaxY = MathUtils.fma(scaleY, aabbMaxY - pivotY, pivotY);
		
		float newMinX = MathUtils.min(scaledMinX, scaledMaxX);
		float newMinY = MathUtils.min(scaledMinY, scaledMaxY);
		float newMaxX = MathUtils.max(scaledMinX, scaledMaxX);
		float newMaxY = MathUtils.max(scaledMinY, scaledMaxY);
		
		res[0] = newMinX;
		res[1] = newMinY;
		res[2] = newMaxX;
		res[3] = newMaxY;
		
		return res;
	}
	
	public static float[] scaleFromPivot(float[] aabbMin, IVec2RF aabbMax, float[] pivot, IVec2RF scale, @ExtractionParam float[] res)
	{
		float aabbMinX = aabbMin[0];
		float aabbMinY = aabbMin[1];
		float aabbMaxX = aabbMax.x();
		float aabbMaxY = aabbMax.y();
		
		float pivotX = pivot[0];
		float pivotY = pivot[1];
		
		float scaleX = scale.x();
		float scaleY = scale.y();
		
		float scaledMinX = MathUtils.fma(scaleX, aabbMinX - pivotX, pivotX);
		float scaledMinY = MathUtils.fma(scaleY, aabbMinY - pivotY, pivotY);
		float scaledMaxX = MathUtils.fma(scaleX, aabbMaxX - pivotX, pivotX);
		float scaledMaxY = MathUtils.fma(scaleY, aabbMaxY - pivotY, pivotY);
		
		float newMinX = MathUtils.min(scaledMinX, scaledMaxX);
		float newMinY = MathUtils.min(scaledMinY, scaledMaxY);
		float newMaxX = MathUtils.max(scaledMinX, scaledMaxX);
		float newMaxY = MathUtils.max(scaledMinY, scaledMaxY);
		
		res[0] = newMinX;
		res[1] = newMinY;
		res[2] = newMaxX;
		res[3] = newMaxY;
		
		return res;
	}
	
	public static float[] scaleFromPivot(float[] aabbMin, IVec2RF aabbMax, float[] pivot, float[] scale, @ExtractionParam float[] res)
	{
		float aabbMinX = aabbMin[0];
		float aabbMinY = aabbMin[1];
		float aabbMaxX = aabbMax.x();
		float aabbMaxY = aabbMax.y();
		
		float pivotX = pivot[0];
		float pivotY = pivot[1];
		
		float scaleX = scale[0];
		float scaleY = scale[1];
		
		float scaledMinX = MathUtils.fma(scaleX, aabbMinX - pivotX, pivotX);
		float scaledMinY = MathUtils.fma(scaleY, aabbMinY - pivotY, pivotY);
		float scaledMaxX = MathUtils.fma(scaleX, aabbMaxX - pivotX, pivotX);
		float scaledMaxY = MathUtils.fma(scaleY, aabbMaxY - pivotY, pivotY);
		
		float newMinX = MathUtils.min(scaledMinX, scaledMaxX);
		float newMinY = MathUtils.min(scaledMinY, scaledMaxY);
		float newMaxX = MathUtils.max(scaledMinX, scaledMaxX);
		float newMaxY = MathUtils.max(scaledMinY, scaledMaxY);
		
		res[0] = newMinX;
		res[1] = newMinY;
		res[2] = newMaxX;
		res[3] = newMaxY;
		
		return res;
	}
	
	public static float[] scaleFromPivot(float[] aabbMin, IVec2RF aabbMax, float[] pivot, float scaleX, float scaleY, @ExtractionParam float[] res)
	{
		float aabbMinX = aabbMin[0];
		float aabbMinY = aabbMin[1];
		float aabbMaxX = aabbMax.x();
		float aabbMaxY = aabbMax.y();
		
		float pivotX = pivot[0];
		float pivotY = pivot[1];
		
		float scaledMinX = MathUtils.fma(scaleX, aabbMinX - pivotX, pivotX);
		float scaledMinY = MathUtils.fma(scaleY, aabbMinY - pivotY, pivotY);
		float scaledMaxX = MathUtils.fma(scaleX, aabbMaxX - pivotX, pivotX);
		float scaledMaxY = MathUtils.fma(scaleY, aabbMaxY - pivotY, pivotY);
		
		float newMinX = MathUtils.min(scaledMinX, scaledMaxX);
		float newMinY = MathUtils.min(scaledMinY, scaledMaxY);
		float newMaxX = MathUtils.max(scaledMinX, scaledMaxX);
		float newMaxY = MathUtils.max(scaledMinY, scaledMaxY);
		
		res[0] = newMinX;
		res[1] = newMinY;
		res[2] = newMaxX;
		res[3] = newMaxY;
		
		return res;
	}
	
	public static float[] scaleFromPivot(float[] aabbMin, IVec2RF aabbMax, float pivotX, float pivotY, IVec2RF scale, @ExtractionParam float[] res)
	{
		float aabbMinX = aabbMin[0];
		float aabbMinY = aabbMin[1];
		float aabbMaxX = aabbMax.x();
		float aabbMaxY = aabbMax.y();
		
		float scaleX = scale.x();
		float scaleY = scale.y();
		
		float scaledMinX = MathUtils.fma(scaleX, aabbMinX - pivotX, pivotX);
		float scaledMinY = MathUtils.fma(scaleY, aabbMinY - pivotY, pivotY);
		float scaledMaxX = MathUtils.fma(scaleX, aabbMaxX - pivotX, pivotX);
		float scaledMaxY = MathUtils.fma(scaleY, aabbMaxY - pivotY, pivotY);
		
		float newMinX = MathUtils.min(scaledMinX, scaledMaxX);
		float newMinY = MathUtils.min(scaledMinY, scaledMaxY);
		float newMaxX = MathUtils.max(scaledMinX, scaledMaxX);
		float newMaxY = MathUtils.max(scaledMinY, scaledMaxY);
		
		res[0] = newMinX;
		res[1] = newMinY;
		res[2] = newMaxX;
		res[3] = newMaxY;
		
		return res;
	}
	
	public static float[] scaleFromPivot(float[] aabbMin, IVec2RF aabbMax, float pivotX, float pivotY, float[] scale, @ExtractionParam float[] res)
	{
		float aabbMinX = aabbMin[0];
		float aabbMinY = aabbMin[1];
		float aabbMaxX = aabbMax.x();
		float aabbMaxY = aabbMax.y();
		
		float scaleX = scale[0];
		float scaleY = scale[1];
		
		float scaledMinX = MathUtils.fma(scaleX, aabbMinX - pivotX, pivotX);
		float scaledMinY = MathUtils.fma(scaleY, aabbMinY - pivotY, pivotY);
		float scaledMaxX = MathUtils.fma(scaleX, aabbMaxX - pivotX, pivotX);
		float scaledMaxY = MathUtils.fma(scaleY, aabbMaxY - pivotY, pivotY);
		
		float newMinX = MathUtils.min(scaledMinX, scaledMaxX);
		float newMinY = MathUtils.min(scaledMinY, scaledMaxY);
		float newMaxX = MathUtils.max(scaledMinX, scaledMaxX);
		float newMaxY = MathUtils.max(scaledMinY, scaledMaxY);
		
		res[0] = newMinX;
		res[1] = newMinY;
		res[2] = newMaxX;
		res[3] = newMaxY;
		
		return res;
	}
	
	public static float[] scaleFromPivot(float[] aabbMin, IVec2RF aabbMax, float pivotX, float pivotY, float scaleX, float scaleY, @ExtractionParam float[] res)
	{
		float aabbMinX = aabbMin[0];
		float aabbMinY = aabbMin[1];
		float aabbMaxX = aabbMax.x();
		float aabbMaxY = aabbMax.y();
		
		float scaledMinX = MathUtils.fma(scaleX, aabbMinX - pivotX, pivotX);
		float scaledMinY = MathUtils.fma(scaleY, aabbMinY - pivotY, pivotY);
		float scaledMaxX = MathUtils.fma(scaleX, aabbMaxX - pivotX, pivotX);
		float scaledMaxY = MathUtils.fma(scaleY, aabbMaxY - pivotY, pivotY);
		
		float newMinX = MathUtils.min(scaledMinX, scaledMaxX);
		float newMinY = MathUtils.min(scaledMinY, scaledMaxY);
		float newMaxX = MathUtils.max(scaledMinX, scaledMaxX);
		float newMaxY = MathUtils.max(scaledMinY, scaledMaxY);
		
		res[0] = newMinX;
		res[1] = newMinY;
		res[2] = newMaxX;
		res[3] = newMaxY;
		
		return res;
	}
	
	public static float[] scaleFromPivot(float[] aabbMin, float[] aabbMax, IVec2RF pivot, IVec2RF scale, @ExtractionParam float[] res)
	{
		float aabbMinX = aabbMin[0];
		float aabbMinY = aabbMin[1];
		float aabbMaxX = aabbMax[0];
		float aabbMaxY = aabbMax[1];
		
		float pivotX = pivot.x();
		float pivotY = pivot.y();
		
		float scaleX = scale.x();
		float scaleY = scale.y();
		
		float scaledMinX = MathUtils.fma(scaleX, aabbMinX - pivotX, pivotX);
		float scaledMinY = MathUtils.fma(scaleY, aabbMinY - pivotY, pivotY);
		float scaledMaxX = MathUtils.fma(scaleX, aabbMaxX - pivotX, pivotX);
		float scaledMaxY = MathUtils.fma(scaleY, aabbMaxY - pivotY, pivotY);
		
		float newMinX = MathUtils.min(scaledMinX, scaledMaxX);
		float newMinY = MathUtils.min(scaledMinY, scaledMaxY);
		float newMaxX = MathUtils.max(scaledMinX, scaledMaxX);
		float newMaxY = MathUtils.max(scaledMinY, scaledMaxY);
		
		res[0] = newMinX;
		res[1] = newMinY;
		res[2] = newMaxX;
		res[3] = newMaxY;
		
		return res;
	}
	
	public static float[] scaleFromPivot(float[] aabbMin, float[] aabbMax, IVec2RF pivot, float[] scale, @ExtractionParam float[] res)
	{
		float aabbMinX = aabbMin[0];
		float aabbMinY = aabbMin[1];
		float aabbMaxX = aabbMax[0];
		float aabbMaxY = aabbMax[1];
		
		float pivotX = pivot.x();
		float pivotY = pivot.y();
		
		float scaleX = scale[0];
		float scaleY = scale[1];
		
		float scaledMinX = MathUtils.fma(scaleX, aabbMinX - pivotX, pivotX);
		float scaledMinY = MathUtils.fma(scaleY, aabbMinY - pivotY, pivotY);
		float scaledMaxX = MathUtils.fma(scaleX, aabbMaxX - pivotX, pivotX);
		float scaledMaxY = MathUtils.fma(scaleY, aabbMaxY - pivotY, pivotY);
		
		float newMinX = MathUtils.min(scaledMinX, scaledMaxX);
		float newMinY = MathUtils.min(scaledMinY, scaledMaxY);
		float newMaxX = MathUtils.max(scaledMinX, scaledMaxX);
		float newMaxY = MathUtils.max(scaledMinY, scaledMaxY);
		
		res[0] = newMinX;
		res[1] = newMinY;
		res[2] = newMaxX;
		res[3] = newMaxY;
		
		return res;
	}
	
	public static float[] scaleFromPivot(float[] aabbMin, float[] aabbMax, IVec2RF pivot, float scaleX, float scaleY, @ExtractionParam float[] res)
	{
		float aabbMinX = aabbMin[0];
		float aabbMinY = aabbMin[1];
		float aabbMaxX = aabbMax[0];
		float aabbMaxY = aabbMax[1];
		
		float pivotX = pivot.x();
		float pivotY = pivot.y();
		
		float scaledMinX = MathUtils.fma(scaleX, aabbMinX - pivotX, pivotX);
		float scaledMinY = MathUtils.fma(scaleY, aabbMinY - pivotY, pivotY);
		float scaledMaxX = MathUtils.fma(scaleX, aabbMaxX - pivotX, pivotX);
		float scaledMaxY = MathUtils.fma(scaleY, aabbMaxY - pivotY, pivotY);
		
		float newMinX = MathUtils.min(scaledMinX, scaledMaxX);
		float newMinY = MathUtils.min(scaledMinY, scaledMaxY);
		float newMaxX = MathUtils.max(scaledMinX, scaledMaxX);
		float newMaxY = MathUtils.max(scaledMinY, scaledMaxY);
		
		res[0] = newMinX;
		res[1] = newMinY;
		res[2] = newMaxX;
		res[3] = newMaxY;
		
		return res;
	}
	
	public static float[] scaleFromPivot(float[] aabbMin, float[] aabbMax, float[] pivot, IVec2RF scale, @ExtractionParam float[] res)
	{
		float aabbMinX = aabbMin[0];
		float aabbMinY = aabbMin[1];
		float aabbMaxX = aabbMax[0];
		float aabbMaxY = aabbMax[1];
		
		float pivotX = pivot[0];
		float pivotY = pivot[1];
		
		float scaleX = scale.x();
		float scaleY = scale.y();
		
		float scaledMinX = MathUtils.fma(scaleX, aabbMinX - pivotX, pivotX);
		float scaledMinY = MathUtils.fma(scaleY, aabbMinY - pivotY, pivotY);
		float scaledMaxX = MathUtils.fma(scaleX, aabbMaxX - pivotX, pivotX);
		float scaledMaxY = MathUtils.fma(scaleY, aabbMaxY - pivotY, pivotY);
		
		float newMinX = MathUtils.min(scaledMinX, scaledMaxX);
		float newMinY = MathUtils.min(scaledMinY, scaledMaxY);
		float newMaxX = MathUtils.max(scaledMinX, scaledMaxX);
		float newMaxY = MathUtils.max(scaledMinY, scaledMaxY);
		
		res[0] = newMinX;
		res[1] = newMinY;
		res[2] = newMaxX;
		res[3] = newMaxY;
		
		return res;
	}
	
	public static float[] scaleFromPivot(float[] aabbMin, float[] aabbMax, float pivotX, float pivotY, IVec2RF scale, @ExtractionParam float[] res)
	{
		float aabbMinX = aabbMin[0];
		float aabbMinY = aabbMin[1];
		float aabbMaxX = aabbMax[0];
		float aabbMaxY = aabbMax[1];
		
		float scaleX = scale.x();
		float scaleY = scale.y();
		
		float scaledMinX = MathUtils.fma(scaleX, aabbMinX - pivotX, pivotX);
		float scaledMinY = MathUtils.fma(scaleY, aabbMinY - pivotY, pivotY);
		float scaledMaxX = MathUtils.fma(scaleX, aabbMaxX - pivotX, pivotX);
		float scaledMaxY = MathUtils.fma(scaleY, aabbMaxY - pivotY, pivotY);
		
		float newMinX = MathUtils.min(scaledMinX, scaledMaxX);
		float newMinY = MathUtils.min(scaledMinY, scaledMaxY);
		float newMaxX = MathUtils.max(scaledMinX, scaledMaxX);
		float newMaxY = MathUtils.max(scaledMinY, scaledMaxY);
		
		res[0] = newMinX;
		res[1] = newMinY;
		res[2] = newMaxX;
		res[3] = newMaxY;
		
		return res;
	}
	
	public static float[] scaleFromPivot(float[] aabbMin, float aabbMaxX, float aabbMaxY, IVec2RF pivot, IVec2RF scale, @ExtractionParam float[] res)
	{
		float aabbMinX = aabbMin[0];
		float aabbMinY = aabbMin[1];
		
		float pivotX = pivot.x();
		float pivotY = pivot.y();
		
		float scaleX = scale.x();
		float scaleY = scale.y();
		
		float scaledMinX = MathUtils.fma(scaleX, aabbMinX - pivotX, pivotX);
		float scaledMinY = MathUtils.fma(scaleY, aabbMinY - pivotY, pivotY);
		float scaledMaxX = MathUtils.fma(scaleX, aabbMaxX - pivotX, pivotX);
		float scaledMaxY = MathUtils.fma(scaleY, aabbMaxY - pivotY, pivotY);
		
		float newMinX = MathUtils.min(scaledMinX, scaledMaxX);
		float newMinY = MathUtils.min(scaledMinY, scaledMaxY);
		float newMaxX = MathUtils.max(scaledMinX, scaledMaxX);
		float newMaxY = MathUtils.max(scaledMinY, scaledMaxY);
		
		res[0] = newMinX;
		res[1] = newMinY;
		res[2] = newMaxX;
		res[3] = newMaxY;
		
		return res;
	}
	
	public static float[] scaleFromPivot(float[] aabbMin, float aabbMaxX, float aabbMaxY, IVec2RF pivot, float[] scale, @ExtractionParam float[] res)
	{
		float aabbMinX = aabbMin[0];
		float aabbMinY = aabbMin[1];
		
		float pivotX = pivot.x();
		float pivotY = pivot.y();
		
		float scaleX = scale[0];
		float scaleY = scale[1];
		
		float scaledMinX = MathUtils.fma(scaleX, aabbMinX - pivotX, pivotX);
		float scaledMinY = MathUtils.fma(scaleY, aabbMinY - pivotY, pivotY);
		float scaledMaxX = MathUtils.fma(scaleX, aabbMaxX - pivotX, pivotX);
		float scaledMaxY = MathUtils.fma(scaleY, aabbMaxY - pivotY, pivotY);
		
		float newMinX = MathUtils.min(scaledMinX, scaledMaxX);
		float newMinY = MathUtils.min(scaledMinY, scaledMaxY);
		float newMaxX = MathUtils.max(scaledMinX, scaledMaxX);
		float newMaxY = MathUtils.max(scaledMinY, scaledMaxY);
		
		res[0] = newMinX;
		res[1] = newMinY;
		res[2] = newMaxX;
		res[3] = newMaxY;
		
		return res;
	}
	
	public static float[] scaleFromPivot(float[] aabbMin, float aabbMaxX, float aabbMaxY, IVec2RF pivot, float scaleX, float scaleY, @ExtractionParam float[] res)
	{
		float aabbMinX = aabbMin[0];
		float aabbMinY = aabbMin[1];
		
		float pivotX = pivot.x();
		float pivotY = pivot.y();
		
		float scaledMinX = MathUtils.fma(scaleX, aabbMinX - pivotX, pivotX);
		float scaledMinY = MathUtils.fma(scaleY, aabbMinY - pivotY, pivotY);
		float scaledMaxX = MathUtils.fma(scaleX, aabbMaxX - pivotX, pivotX);
		float scaledMaxY = MathUtils.fma(scaleY, aabbMaxY - pivotY, pivotY);
		
		float newMinX = MathUtils.min(scaledMinX, scaledMaxX);
		float newMinY = MathUtils.min(scaledMinY, scaledMaxY);
		float newMaxX = MathUtils.max(scaledMinX, scaledMaxX);
		float newMaxY = MathUtils.max(scaledMinY, scaledMaxY);
		
		res[0] = newMinX;
		res[1] = newMinY;
		res[2] = newMaxX;
		res[3] = newMaxY;
		
		return res;
	}
	
	public static float[] scaleFromPivot(float[] aabbMin, float aabbMaxX, float aabbMaxY, float[] pivot, IVec2RF scale, @ExtractionParam float[] res)
	{
		float aabbMinX = aabbMin[0];
		float aabbMinY = aabbMin[1];
		
		float pivotX = pivot[0];
		float pivotY = pivot[1];
		
		float scaleX = scale.x();
		float scaleY = scale.y();
		
		float scaledMinX = MathUtils.fma(scaleX, aabbMinX - pivotX, pivotX);
		float scaledMinY = MathUtils.fma(scaleY, aabbMinY - pivotY, pivotY);
		float scaledMaxX = MathUtils.fma(scaleX, aabbMaxX - pivotX, pivotX);
		float scaledMaxY = MathUtils.fma(scaleY, aabbMaxY - pivotY, pivotY);
		
		float newMinX = MathUtils.min(scaledMinX, scaledMaxX);
		float newMinY = MathUtils.min(scaledMinY, scaledMaxY);
		float newMaxX = MathUtils.max(scaledMinX, scaledMaxX);
		float newMaxY = MathUtils.max(scaledMinY, scaledMaxY);
		
		res[0] = newMinX;
		res[1] = newMinY;
		res[2] = newMaxX;
		res[3] = newMaxY;
		
		return res;
	}
	
	public static float[] scaleFromPivot(float[] aabbMin, float aabbMaxX, float aabbMaxY, float pivotX, float pivotY, IVec2RF scale, @ExtractionParam float[] res)
	{
		float aabbMinX = aabbMin[0];
		float aabbMinY = aabbMin[1];
		
		float scaleX = scale.x();
		float scaleY = scale.y();
		
		float scaledMinX = MathUtils.fma(scaleX, aabbMinX - pivotX, pivotX);
		float scaledMinY = MathUtils.fma(scaleY, aabbMinY - pivotY, pivotY);
		float scaledMaxX = MathUtils.fma(scaleX, aabbMaxX - pivotX, pivotX);
		float scaledMaxY = MathUtils.fma(scaleY, aabbMaxY - pivotY, pivotY);
		
		float newMinX = MathUtils.min(scaledMinX, scaledMaxX);
		float newMinY = MathUtils.min(scaledMinY, scaledMaxY);
		float newMaxX = MathUtils.max(scaledMinX, scaledMaxX);
		float newMaxY = MathUtils.max(scaledMinY, scaledMaxY);
		
		res[0] = newMinX;
		res[1] = newMinY;
		res[2] = newMaxX;
		res[3] = newMaxY;
		
		return res;
	}
	
	public static float[] scaleFromPivot(float aabbMinX, float aabbMinY, IVec2RF aabbMax, IVec2RF pivot, IVec2RF scale, @ExtractionParam float[] res)
	{
		float aabbMaxX = aabbMax.x();
		float aabbMaxY = aabbMax.y();
		
		float pivotX = pivot.x();
		float pivotY = pivot.y();
		
		float scaleX = scale.x();
		float scaleY = scale.y();
		
		float scaledMinX = MathUtils.fma(scaleX, aabbMinX - pivotX, pivotX);
		float scaledMinY = MathUtils.fma(scaleY, aabbMinY - pivotY, pivotY);
		float scaledMaxX = MathUtils.fma(scaleX, aabbMaxX - pivotX, pivotX);
		float scaledMaxY = MathUtils.fma(scaleY, aabbMaxY - pivotY, pivotY);
		
		float newMinX = MathUtils.min(scaledMinX, scaledMaxX);
		float newMinY = MathUtils.min(scaledMinY, scaledMaxY);
		float newMaxX = MathUtils.max(scaledMinX, scaledMaxX);
		float newMaxY = MathUtils.max(scaledMinY, scaledMaxY);
		
		res[0] = newMinX;
		res[1] = newMinY;
		res[2] = newMaxX;
		res[3] = newMaxY;
		
		return res;
	}
	
	public static float[] scaleFromPivot(float aabbMinX, float aabbMinY, IVec2RF aabbMax, IVec2RF pivot, float[] scale, @ExtractionParam float[] res)
	{
		float aabbMaxX = aabbMax.x();
		float aabbMaxY = aabbMax.y();
		
		float pivotX = pivot.x();
		float pivotY = pivot.y();
		
		float scaleX = scale[0];
		float scaleY = scale[1];
		
		float scaledMinX = MathUtils.fma(scaleX, aabbMinX - pivotX, pivotX);
		float scaledMinY = MathUtils.fma(scaleY, aabbMinY - pivotY, pivotY);
		float scaledMaxX = MathUtils.fma(scaleX, aabbMaxX - pivotX, pivotX);
		float scaledMaxY = MathUtils.fma(scaleY, aabbMaxY - pivotY, pivotY);
		
		float newMinX = MathUtils.min(scaledMinX, scaledMaxX);
		float newMinY = MathUtils.min(scaledMinY, scaledMaxY);
		float newMaxX = MathUtils.max(scaledMinX, scaledMaxX);
		float newMaxY = MathUtils.max(scaledMinY, scaledMaxY);
		
		res[0] = newMinX;
		res[1] = newMinY;
		res[2] = newMaxX;
		res[3] = newMaxY;
		
		return res;
	}
	
	public static float[] scaleFromPivot(float aabbMinX, float aabbMinY, IVec2RF aabbMax, IVec2RF pivot, float scaleX, float scaleY, @ExtractionParam float[] res)
	{
		float aabbMaxX = aabbMax.x();
		float aabbMaxY = aabbMax.y();
		
		float pivotX = pivot.x();
		float pivotY = pivot.y();
		
		float scaledMinX = MathUtils.fma(scaleX, aabbMinX - pivotX, pivotX);
		float scaledMinY = MathUtils.fma(scaleY, aabbMinY - pivotY, pivotY);
		float scaledMaxX = MathUtils.fma(scaleX, aabbMaxX - pivotX, pivotX);
		float scaledMaxY = MathUtils.fma(scaleY, aabbMaxY - pivotY, pivotY);
		
		float newMinX = MathUtils.min(scaledMinX, scaledMaxX);
		float newMinY = MathUtils.min(scaledMinY, scaledMaxY);
		float newMaxX = MathUtils.max(scaledMinX, scaledMaxX);
		float newMaxY = MathUtils.max(scaledMinY, scaledMaxY);
		
		res[0] = newMinX;
		res[1] = newMinY;
		res[2] = newMaxX;
		res[3] = newMaxY;
		
		return res;
	}
	
	public static float[] scaleFromPivot(float aabbMinX, float aabbMinY, IVec2RF aabbMax, float[] pivot, IVec2RF scale, @ExtractionParam float[] res)
	{
		float aabbMaxX = aabbMax.x();
		float aabbMaxY = aabbMax.y();
		
		float pivotX = pivot[0];
		float pivotY = pivot[1];
		
		float scaleX = scale.x();
		float scaleY = scale.y();
		
		float scaledMinX = MathUtils.fma(scaleX, aabbMinX - pivotX, pivotX);
		float scaledMinY = MathUtils.fma(scaleY, aabbMinY - pivotY, pivotY);
		float scaledMaxX = MathUtils.fma(scaleX, aabbMaxX - pivotX, pivotX);
		float scaledMaxY = MathUtils.fma(scaleY, aabbMaxY - pivotY, pivotY);
		
		float newMinX = MathUtils.min(scaledMinX, scaledMaxX);
		float newMinY = MathUtils.min(scaledMinY, scaledMaxY);
		float newMaxX = MathUtils.max(scaledMinX, scaledMaxX);
		float newMaxY = MathUtils.max(scaledMinY, scaledMaxY);
		
		res[0] = newMinX;
		res[1] = newMinY;
		res[2] = newMaxX;
		res[3] = newMaxY;
		
		return res;
	}
	
	public static float[] scaleFromPivot(float aabbMinX, float aabbMinY, IVec2RF aabbMax, float[] pivot, float[] scale, @ExtractionParam float[] res)
	{
		float aabbMaxX = aabbMax.x();
		float aabbMaxY = aabbMax.y();
		
		float pivotX = pivot[0];
		float pivotY = pivot[1];
		
		float scaleX = scale[0];
		float scaleY = scale[1];
		
		float scaledMinX = MathUtils.fma(scaleX, aabbMinX - pivotX, pivotX);
		float scaledMinY = MathUtils.fma(scaleY, aabbMinY - pivotY, pivotY);
		float scaledMaxX = MathUtils.fma(scaleX, aabbMaxX - pivotX, pivotX);
		float scaledMaxY = MathUtils.fma(scaleY, aabbMaxY - pivotY, pivotY);
		
		float newMinX = MathUtils.min(scaledMinX, scaledMaxX);
		float newMinY = MathUtils.min(scaledMinY, scaledMaxY);
		float newMaxX = MathUtils.max(scaledMinX, scaledMaxX);
		float newMaxY = MathUtils.max(scaledMinY, scaledMaxY);
		
		res[0] = newMinX;
		res[1] = newMinY;
		res[2] = newMaxX;
		res[3] = newMaxY;
		
		return res;
	}
	
	public static float[] scaleFromPivot(float aabbMinX, float aabbMinY, IVec2RF aabbMax, float[] pivot, float scaleX, float scaleY, @ExtractionParam float[] res)
	{
		float aabbMaxX = aabbMax.x();
		float aabbMaxY = aabbMax.y();
		
		float pivotX = pivot[0];
		float pivotY = pivot[1];
		
		float scaledMinX = MathUtils.fma(scaleX, aabbMinX - pivotX, pivotX);
		float scaledMinY = MathUtils.fma(scaleY, aabbMinY - pivotY, pivotY);
		float scaledMaxX = MathUtils.fma(scaleX, aabbMaxX - pivotX, pivotX);
		float scaledMaxY = MathUtils.fma(scaleY, aabbMaxY - pivotY, pivotY);
		
		float newMinX = MathUtils.min(scaledMinX, scaledMaxX);
		float newMinY = MathUtils.min(scaledMinY, scaledMaxY);
		float newMaxX = MathUtils.max(scaledMinX, scaledMaxX);
		float newMaxY = MathUtils.max(scaledMinY, scaledMaxY);
		
		res[0] = newMinX;
		res[1] = newMinY;
		res[2] = newMaxX;
		res[3] = newMaxY;
		
		return res;
	}
	
	public static float[] scaleFromPivot(float aabbMinX, float aabbMinY, IVec2RF aabbMax, float pivotX, float pivotY, IVec2RF scale, @ExtractionParam float[] res)
	{
		float aabbMaxX = aabbMax.x();
		float aabbMaxY = aabbMax.y();
		
		float scaleX = scale.x();
		float scaleY = scale.y();
		
		float scaledMinX = MathUtils.fma(scaleX, aabbMinX - pivotX, pivotX);
		float scaledMinY = MathUtils.fma(scaleY, aabbMinY - pivotY, pivotY);
		float scaledMaxX = MathUtils.fma(scaleX, aabbMaxX - pivotX, pivotX);
		float scaledMaxY = MathUtils.fma(scaleY, aabbMaxY - pivotY, pivotY);
		
		float newMinX = MathUtils.min(scaledMinX, scaledMaxX);
		float newMinY = MathUtils.min(scaledMinY, scaledMaxY);
		float newMaxX = MathUtils.max(scaledMinX, scaledMaxX);
		float newMaxY = MathUtils.max(scaledMinY, scaledMaxY);
		
		res[0] = newMinX;
		res[1] = newMinY;
		res[2] = newMaxX;
		res[3] = newMaxY;
		
		return res;
	}
	
	public static float[] scaleFromPivot(float aabbMinX, float aabbMinY, IVec2RF aabbMax, float pivotX, float pivotY, float[] scale, @ExtractionParam float[] res)
	{
		float aabbMaxX = aabbMax.x();
		float aabbMaxY = aabbMax.y();
		
		float scaleX = scale[0];
		float scaleY = scale[1];
		
		float scaledMinX = MathUtils.fma(scaleX, aabbMinX - pivotX, pivotX);
		float scaledMinY = MathUtils.fma(scaleY, aabbMinY - pivotY, pivotY);
		float scaledMaxX = MathUtils.fma(scaleX, aabbMaxX - pivotX, pivotX);
		float scaledMaxY = MathUtils.fma(scaleY, aabbMaxY - pivotY, pivotY);
		
		float newMinX = MathUtils.min(scaledMinX, scaledMaxX);
		float newMinY = MathUtils.min(scaledMinY, scaledMaxY);
		float newMaxX = MathUtils.max(scaledMinX, scaledMaxX);
		float newMaxY = MathUtils.max(scaledMinY, scaledMaxY);
		
		res[0] = newMinX;
		res[1] = newMinY;
		res[2] = newMaxX;
		res[3] = newMaxY;
		
		return res;
	}
	
	public static float[] scaleFromPivot(float aabbMinX, float aabbMinY, IVec2RF aabbMax, float pivotX, float pivotY, float scaleX, float scaleY, @ExtractionParam float[] res)
	{
		float aabbMaxX = aabbMax.x();
		float aabbMaxY = aabbMax.y();
		
		float scaledMinX = MathUtils.fma(scaleX, aabbMinX - pivotX, pivotX);
		float scaledMinY = MathUtils.fma(scaleY, aabbMinY - pivotY, pivotY);
		float scaledMaxX = MathUtils.fma(scaleX, aabbMaxX - pivotX, pivotX);
		float scaledMaxY = MathUtils.fma(scaleY, aabbMaxY - pivotY, pivotY);
		
		float newMinX = MathUtils.min(scaledMinX, scaledMaxX);
		float newMinY = MathUtils.min(scaledMinY, scaledMaxY);
		float newMaxX = MathUtils.max(scaledMinX, scaledMaxX);
		float newMaxY = MathUtils.max(scaledMinY, scaledMaxY);
		
		res[0] = newMinX;
		res[1] = newMinY;
		res[2] = newMaxX;
		res[3] = newMaxY;
		
		return res;
	}
	
	public static float[] scaleFromPivot(float aabbMinX, float aabbMinY, float[] aabbMax, IVec2RF pivot, IVec2RF scale, @ExtractionParam float[] res)
	{
		float aabbMaxX = aabbMax[0];
		float aabbMaxY = aabbMax[1];
		
		float pivotX = pivot.x();
		float pivotY = pivot.y();
		
		float scaleX = scale.x();
		float scaleY = scale.y();
		
		float scaledMinX = MathUtils.fma(scaleX, aabbMinX - pivotX, pivotX);
		float scaledMinY = MathUtils.fma(scaleY, aabbMinY - pivotY, pivotY);
		float scaledMaxX = MathUtils.fma(scaleX, aabbMaxX - pivotX, pivotX);
		float scaledMaxY = MathUtils.fma(scaleY, aabbMaxY - pivotY, pivotY);
		
		float newMinX = MathUtils.min(scaledMinX, scaledMaxX);
		float newMinY = MathUtils.min(scaledMinY, scaledMaxY);
		float newMaxX = MathUtils.max(scaledMinX, scaledMaxX);
		float newMaxY = MathUtils.max(scaledMinY, scaledMaxY);
		
		res[0] = newMinX;
		res[1] = newMinY;
		res[2] = newMaxX;
		res[3] = newMaxY;
		
		return res;
	}
	
	public static float[] scaleFromPivot(float aabbMinX, float aabbMinY, float[] aabbMax, IVec2RF pivot, float[] scale, @ExtractionParam float[] res)
	{
		float aabbMaxX = aabbMax[0];
		float aabbMaxY = aabbMax[1];
		
		float pivotX = pivot.x();
		float pivotY = pivot.y();
		
		float scaleX = scale[0];
		float scaleY = scale[1];
		
		float scaledMinX = MathUtils.fma(scaleX, aabbMinX - pivotX, pivotX);
		float scaledMinY = MathUtils.fma(scaleY, aabbMinY - pivotY, pivotY);
		float scaledMaxX = MathUtils.fma(scaleX, aabbMaxX - pivotX, pivotX);
		float scaledMaxY = MathUtils.fma(scaleY, aabbMaxY - pivotY, pivotY);
		
		float newMinX = MathUtils.min(scaledMinX, scaledMaxX);
		float newMinY = MathUtils.min(scaledMinY, scaledMaxY);
		float newMaxX = MathUtils.max(scaledMinX, scaledMaxX);
		float newMaxY = MathUtils.max(scaledMinY, scaledMaxY);
		
		res[0] = newMinX;
		res[1] = newMinY;
		res[2] = newMaxX;
		res[3] = newMaxY;
		
		return res;
	}
	
	public static float[] scaleFromPivot(float aabbMinX, float aabbMinY, float[] aabbMax, IVec2RF pivot, float scaleX, float scaleY, @ExtractionParam float[] res)
	{
		float aabbMaxX = aabbMax[0];
		float aabbMaxY = aabbMax[1];
		
		float pivotX = pivot.x();
		float pivotY = pivot.y();
		
		float scaledMinX = MathUtils.fma(scaleX, aabbMinX - pivotX, pivotX);
		float scaledMinY = MathUtils.fma(scaleY, aabbMinY - pivotY, pivotY);
		float scaledMaxX = MathUtils.fma(scaleX, aabbMaxX - pivotX, pivotX);
		float scaledMaxY = MathUtils.fma(scaleY, aabbMaxY - pivotY, pivotY);
		
		float newMinX = MathUtils.min(scaledMinX, scaledMaxX);
		float newMinY = MathUtils.min(scaledMinY, scaledMaxY);
		float newMaxX = MathUtils.max(scaledMinX, scaledMaxX);
		float newMaxY = MathUtils.max(scaledMinY, scaledMaxY);
		
		res[0] = newMinX;
		res[1] = newMinY;
		res[2] = newMaxX;
		res[3] = newMaxY;
		
		return res;
	}
	
	public static float[] scaleFromPivot(float aabbMinX, float aabbMinY, float[] aabbMax, float[] pivot, IVec2RF scale, @ExtractionParam float[] res)
	{
		float aabbMaxX = aabbMax[0];
		float aabbMaxY = aabbMax[1];
		
		float pivotX = pivot[0];
		float pivotY = pivot[1];
		
		float scaleX = scale.x();
		float scaleY = scale.y();
		
		float scaledMinX = MathUtils.fma(scaleX, aabbMinX - pivotX, pivotX);
		float scaledMinY = MathUtils.fma(scaleY, aabbMinY - pivotY, pivotY);
		float scaledMaxX = MathUtils.fma(scaleX, aabbMaxX - pivotX, pivotX);
		float scaledMaxY = MathUtils.fma(scaleY, aabbMaxY - pivotY, pivotY);
		
		float newMinX = MathUtils.min(scaledMinX, scaledMaxX);
		float newMinY = MathUtils.min(scaledMinY, scaledMaxY);
		float newMaxX = MathUtils.max(scaledMinX, scaledMaxX);
		float newMaxY = MathUtils.max(scaledMinY, scaledMaxY);
		
		res[0] = newMinX;
		res[1] = newMinY;
		res[2] = newMaxX;
		res[3] = newMaxY;
		
		return res;
	}
	
	public static float[] scaleFromPivot(float aabbMinX, float aabbMinY, float[] aabbMax, float pivotX, float pivotY, IVec2RF scale, @ExtractionParam float[] res)
	{
		float aabbMaxX = aabbMax[0];
		float aabbMaxY = aabbMax[1];
		
		float scaleX = scale.x();
		float scaleY = scale.y();
		
		float scaledMinX = MathUtils.fma(scaleX, aabbMinX - pivotX, pivotX);
		float scaledMinY = MathUtils.fma(scaleY, aabbMinY - pivotY, pivotY);
		float scaledMaxX = MathUtils.fma(scaleX, aabbMaxX - pivotX, pivotX);
		float scaledMaxY = MathUtils.fma(scaleY, aabbMaxY - pivotY, pivotY);
		
		float newMinX = MathUtils.min(scaledMinX, scaledMaxX);
		float newMinY = MathUtils.min(scaledMinY, scaledMaxY);
		float newMaxX = MathUtils.max(scaledMinX, scaledMaxX);
		float newMaxY = MathUtils.max(scaledMinY, scaledMaxY);
		
		res[0] = newMinX;
		res[1] = newMinY;
		res[2] = newMaxX;
		res[3] = newMaxY;
		
		return res;
	}
	
	public static float[] scaleFromPivot(float aabbMinX, float aabbMinY, float aabbMaxX, float aabbMaxY, IVec2RF pivot, IVec2RF scale, @ExtractionParam float[] res)
	{
		float pivotX = pivot.x();
		float pivotY = pivot.y();
		
		float scaleX = scale.x();
		float scaleY = scale.y();
		
		float scaledMinX = MathUtils.fma(scaleX, aabbMinX - pivotX, pivotX);
		float scaledMinY = MathUtils.fma(scaleY, aabbMinY - pivotY, pivotY);
		float scaledMaxX = MathUtils.fma(scaleX, aabbMaxX - pivotX, pivotX);
		float scaledMaxY = MathUtils.fma(scaleY, aabbMaxY - pivotY, pivotY);
		
		float newMinX = MathUtils.min(scaledMinX, scaledMaxX);
		float newMinY = MathUtils.min(scaledMinY, scaledMaxY);
		float newMaxX = MathUtils.max(scaledMinX, scaledMaxX);
		float newMaxY = MathUtils.max(scaledMinY, scaledMaxY);
		
		res[0] = newMinX;
		res[1] = newMinY;
		res[2] = newMaxX;
		res[3] = newMaxY;
		
		return res;
	}
	
	public static float[] scaleFromPivot(float aabbMinX, float aabbMinY, float aabbMaxX, float aabbMaxY, IVec2RF pivot, float[] scale, @ExtractionParam float[] res)
	{
		float pivotX = pivot.x();
		float pivotY = pivot.y();
		
		float scaleX = scale[0];
		float scaleY = scale[1];
		
		float scaledMinX = MathUtils.fma(scaleX, aabbMinX - pivotX, pivotX);
		float scaledMinY = MathUtils.fma(scaleY, aabbMinY - pivotY, pivotY);
		float scaledMaxX = MathUtils.fma(scaleX, aabbMaxX - pivotX, pivotX);
		float scaledMaxY = MathUtils.fma(scaleY, aabbMaxY - pivotY, pivotY);
		
		float newMinX = MathUtils.min(scaledMinX, scaledMaxX);
		float newMinY = MathUtils.min(scaledMinY, scaledMaxY);
		float newMaxX = MathUtils.max(scaledMinX, scaledMaxX);
		float newMaxY = MathUtils.max(scaledMinY, scaledMaxY);
		
		res[0] = newMinX;
		res[1] = newMinY;
		res[2] = newMaxX;
		res[3] = newMaxY;
		
		return res;
	}
	
	public static float[] scaleFromPivot(float aabbMinX, float aabbMinY, float aabbMaxX, float aabbMaxY, IVec2RF pivot, float scaleX, float scaleY, @ExtractionParam float[] res)
	{
		float pivotX = pivot.x();
		float pivotY = pivot.y();
		
		float scaledMinX = MathUtils.fma(scaleX, aabbMinX - pivotX, pivotX);
		float scaledMinY = MathUtils.fma(scaleY, aabbMinY - pivotY, pivotY);
		float scaledMaxX = MathUtils.fma(scaleX, aabbMaxX - pivotX, pivotX);
		float scaledMaxY = MathUtils.fma(scaleY, aabbMaxY - pivotY, pivotY);
		
		float newMinX = MathUtils.min(scaledMinX, scaledMaxX);
		float newMinY = MathUtils.min(scaledMinY, scaledMaxY);
		float newMaxX = MathUtils.max(scaledMinX, scaledMaxX);
		float newMaxY = MathUtils.max(scaledMinY, scaledMaxY);
		
		res[0] = newMinX;
		res[1] = newMinY;
		res[2] = newMaxX;
		res[3] = newMaxY;
		
		return res;
	}
	
	public static float[] scaleFromPivot(float aabbMinX, float aabbMinY, float aabbMaxX, float aabbMaxY, float[] pivot, IVec2RF scale, @ExtractionParam float[] res)
	{
		float pivotX = pivot[0];
		float pivotY = pivot[1];
		
		float scaleX = scale.x();
		float scaleY = scale.y();
		
		float scaledMinX = MathUtils.fma(scaleX, aabbMinX - pivotX, pivotX);
		float scaledMinY = MathUtils.fma(scaleY, aabbMinY - pivotY, pivotY);
		float scaledMaxX = MathUtils.fma(scaleX, aabbMaxX - pivotX, pivotX);
		float scaledMaxY = MathUtils.fma(scaleY, aabbMaxY - pivotY, pivotY);
		
		float newMinX = MathUtils.min(scaledMinX, scaledMaxX);
		float newMinY = MathUtils.min(scaledMinY, scaledMaxY);
		float newMaxX = MathUtils.max(scaledMinX, scaledMaxX);
		float newMaxY = MathUtils.max(scaledMinY, scaledMaxY);
		
		res[0] = newMinX;
		res[1] = newMinY;
		res[2] = newMaxX;
		res[3] = newMaxY;
		
		return res;
	}
	
	public static float[] scaleFromPivot(float aabbMinX, float aabbMinY, float aabbMaxX, float aabbMaxY, float pivotX, float pivotY, IVec2RF scale, @ExtractionParam float[] res)
	{
		float scaleX = scale.x();
		float scaleY = scale.y();
		
		float scaledMinX = MathUtils.fma(scaleX, aabbMinX - pivotX, pivotX);
		float scaledMinY = MathUtils.fma(scaleY, aabbMinY - pivotY, pivotY);
		float scaledMaxX = MathUtils.fma(scaleX, aabbMaxX - pivotX, pivotX);
		float scaledMaxY = MathUtils.fma(scaleY, aabbMaxY - pivotY, pivotY);
		
		float newMinX = MathUtils.min(scaledMinX, scaledMaxX);
		float newMinY = MathUtils.min(scaledMinY, scaledMaxY);
		float newMaxX = MathUtils.max(scaledMinX, scaledMaxX);
		float newMaxY = MathUtils.max(scaledMinY, scaledMaxY);
		
		res[0] = newMinX;
		res[1] = newMinY;
		res[2] = newMaxX;
		res[3] = newMaxY;
		
		return res;
	}
	
	public static float[] scaleFromPivotAssign(@ExtractionParam float[] aabb, IVec2RF pivot, IVec2RF scale)
	{
		float aabbMinX = aabb[0];
		float aabbMinY = aabb[1];
		float aabbMaxX = aabb[2];
		float aabbMaxY = aabb[3];
		
		float pivotX = pivot.x();
		float pivotY = pivot.y();
		
		float scaleX = scale.x();
		float scaleY = scale.y();
		
		float scaledMinX = MathUtils.fma(scaleX, aabbMinX - pivotX, pivotX);
		float scaledMinY = MathUtils.fma(scaleY, aabbMinY - pivotY, pivotY);
		float scaledMaxX = MathUtils.fma(scaleX, aabbMaxX - pivotX, pivotX);
		float scaledMaxY = MathUtils.fma(scaleY, aabbMaxY - pivotY, pivotY);
		
		float newMinX = MathUtils.min(scaledMinX, scaledMaxX);
		float newMinY = MathUtils.min(scaledMinY, scaledMaxY);
		float newMaxX = MathUtils.max(scaledMinX, scaledMaxX);
		float newMaxY = MathUtils.max(scaledMinY, scaledMaxY);
		
		aabb[0] = newMinX;
		aabb[1] = newMinY;
		aabb[2] = newMaxX;
		aabb[3] = newMaxY;
		
		return aabb;
	}
	
	public static float[] scaleFromPivotAssign(@ExtractionParam float[] aabb, IVec2RF pivot, float[] scale)
	{
		float aabbMinX = aabb[0];
		float aabbMinY = aabb[1];
		float aabbMaxX = aabb[2];
		float aabbMaxY = aabb[3];
		
		float pivotX = pivot.x();
		float pivotY = pivot.y();
		
		float scaleX = scale[0];
		float scaleY = scale[1];
		
		float scaledMinX = MathUtils.fma(scaleX, aabbMinX - pivotX, pivotX);
		float scaledMinY = MathUtils.fma(scaleY, aabbMinY - pivotY, pivotY);
		float scaledMaxX = MathUtils.fma(scaleX, aabbMaxX - pivotX, pivotX);
		float scaledMaxY = MathUtils.fma(scaleY, aabbMaxY - pivotY, pivotY);
		
		float newMinX = MathUtils.min(scaledMinX, scaledMaxX);
		float newMinY = MathUtils.min(scaledMinY, scaledMaxY);
		float newMaxX = MathUtils.max(scaledMinX, scaledMaxX);
		float newMaxY = MathUtils.max(scaledMinY, scaledMaxY);
		
		aabb[0] = newMinX;
		aabb[1] = newMinY;
		aabb[2] = newMaxX;
		aabb[3] = newMaxY;
		
		return aabb;
	}
	
	public static float[] scaleFromPivotAssign(@ExtractionParam float[] aabb, IVec2RF pivot, float scaleX, float scaleY)
	{
		float aabbMinX = aabb[0];
		float aabbMinY = aabb[1];
		float aabbMaxX = aabb[2];
		float aabbMaxY = aabb[3];
		
		float pivotX = pivot.x();
		float pivotY = pivot.y();
		
		float scaledMinX = MathUtils.fma(scaleX, aabbMinX - pivotX, pivotX);
		float scaledMinY = MathUtils.fma(scaleY, aabbMinY - pivotY, pivotY);
		float scaledMaxX = MathUtils.fma(scaleX, aabbMaxX - pivotX, pivotX);
		float scaledMaxY = MathUtils.fma(scaleY, aabbMaxY - pivotY, pivotY);
		
		float newMinX = MathUtils.min(scaledMinX, scaledMaxX);
		float newMinY = MathUtils.min(scaledMinY, scaledMaxY);
		float newMaxX = MathUtils.max(scaledMinX, scaledMaxX);
		float newMaxY = MathUtils.max(scaledMinY, scaledMaxY);
		
		aabb[0] = newMinX;
		aabb[1] = newMinY;
		aabb[2] = newMaxX;
		aabb[3] = newMaxY;
		
		return aabb;
	}
	
	public static float[] scaleFromPivotAssign(@ExtractionParam float[] aabb, float[] pivot, IVec2RF scale)
	{
		float aabbMinX = aabb[0];
		float aabbMinY = aabb[1];
		float aabbMaxX = aabb[2];
		float aabbMaxY = aabb[3];
		
		float pivotX = pivot[0];
		float pivotY = pivot[1];
		
		float scaleX = scale.x();
		float scaleY = scale.y();
		
		float scaledMinX = MathUtils.fma(scaleX, aabbMinX - pivotX, pivotX);
		float scaledMinY = MathUtils.fma(scaleY, aabbMinY - pivotY, pivotY);
		float scaledMaxX = MathUtils.fma(scaleX, aabbMaxX - pivotX, pivotX);
		float scaledMaxY = MathUtils.fma(scaleY, aabbMaxY - pivotY, pivotY);
		
		float newMinX = MathUtils.min(scaledMinX, scaledMaxX);
		float newMinY = MathUtils.min(scaledMinY, scaledMaxY);
		float newMaxX = MathUtils.max(scaledMinX, scaledMaxX);
		float newMaxY = MathUtils.max(scaledMinY, scaledMaxY);
		
		aabb[0] = newMinX;
		aabb[1] = newMinY;
		aabb[2] = newMaxX;
		aabb[3] = newMaxY;
		
		return aabb;
	}
	
	public static float[] scaleFromPivotAssign(@ExtractionParam float[] aabb, float pivotX, float pivotY, IVec2RF scale)
	{
		float aabbMinX = aabb[0];
		float aabbMinY = aabb[1];
		float aabbMaxX = aabb[2];
		float aabbMaxY = aabb[3];
		
		float scaleX = scale.x();
		float scaleY = scale.y();
		
		float scaledMinX = MathUtils.fma(scaleX, aabbMinX - pivotX, pivotX);
		float scaledMinY = MathUtils.fma(scaleY, aabbMinY - pivotY, pivotY);
		float scaledMaxX = MathUtils.fma(scaleX, aabbMaxX - pivotX, pivotX);
		float scaledMaxY = MathUtils.fma(scaleY, aabbMaxY - pivotY, pivotY);
		
		float newMinX = MathUtils.min(scaledMinX, scaledMaxX);
		float newMinY = MathUtils.min(scaledMinY, scaledMaxY);
		float newMaxX = MathUtils.max(scaledMinX, scaledMaxX);
		float newMaxY = MathUtils.max(scaledMinY, scaledMaxY);
		
		aabb[0] = newMinX;
		aabb[1] = newMinY;
		aabb[2] = newMaxX;
		aabb[3] = newMaxY;
		
		return aabb;
	}
	
	public static <T extends IAabb2WF> T scaleFromPivot(IAabb2RF aabb, IVec2RF pivot, IVec2RF scale, @ExtractionParam T res)
	{
		float aabbMinX = aabb.minX();
		float aabbMinY = aabb.minY();
		float aabbMaxX = aabb.maxX();
		float aabbMaxY = aabb.maxY();
		
		float pivotX = pivot.x();
		float pivotY = pivot.y();
		
		float scaleX = scale.x();
		float scaleY = scale.y();
		
		float scaledMinX = MathUtils.fma(scaleX, aabbMinX - pivotX, pivotX);
		float scaledMinY = MathUtils.fma(scaleY, aabbMinY - pivotY, pivotY);
		float scaledMaxX = MathUtils.fma(scaleX, aabbMaxX - pivotX, pivotX);
		float scaledMaxY = MathUtils.fma(scaleY, aabbMaxY - pivotY, pivotY);
		
		float newMinX = MathUtils.min(scaledMinX, scaledMaxX);
		float newMinY = MathUtils.min(scaledMinY, scaledMaxY);
		float newMaxX = MathUtils.max(scaledMinX, scaledMaxX);
		float newMaxY = MathUtils.max(scaledMinY, scaledMaxY);
		
		res.set(newMinX, newMinY, newMaxX, newMaxY);
		
		return res;
	}
	
	public static <T extends IAabb2WF> T scaleFromPivot(IAabb2RF aabb, IVec2RF pivot, float[] scale, @ExtractionParam T res)
	{
		float aabbMinX = aabb.minX();
		float aabbMinY = aabb.minY();
		float aabbMaxX = aabb.maxX();
		float aabbMaxY = aabb.maxY();
		
		float pivotX = pivot.x();
		float pivotY = pivot.y();
		
		float scaleX = scale[0];
		float scaleY = scale[1];
		
		float scaledMinX = MathUtils.fma(scaleX, aabbMinX - pivotX, pivotX);
		float scaledMinY = MathUtils.fma(scaleY, aabbMinY - pivotY, pivotY);
		float scaledMaxX = MathUtils.fma(scaleX, aabbMaxX - pivotX, pivotX);
		float scaledMaxY = MathUtils.fma(scaleY, aabbMaxY - pivotY, pivotY);
		
		float newMinX = MathUtils.min(scaledMinX, scaledMaxX);
		float newMinY = MathUtils.min(scaledMinY, scaledMaxY);
		float newMaxX = MathUtils.max(scaledMinX, scaledMaxX);
		float newMaxY = MathUtils.max(scaledMinY, scaledMaxY);
		
		res.set(newMinX, newMinY, newMaxX, newMaxY);
		
		return res;
	}
	
	public static <T extends IAabb2WF> T scaleFromPivot(IAabb2RF aabb, IVec2RF pivot, float scaleX, float scaleY, @ExtractionParam T res)
	{
		float aabbMinX = aabb.minX();
		float aabbMinY = aabb.minY();
		float aabbMaxX = aabb.maxX();
		float aabbMaxY = aabb.maxY();
		
		float pivotX = pivot.x();
		float pivotY = pivot.y();
		
		float scaledMinX = MathUtils.fma(scaleX, aabbMinX - pivotX, pivotX);
		float scaledMinY = MathUtils.fma(scaleY, aabbMinY - pivotY, pivotY);
		float scaledMaxX = MathUtils.fma(scaleX, aabbMaxX - pivotX, pivotX);
		float scaledMaxY = MathUtils.fma(scaleY, aabbMaxY - pivotY, pivotY);
		
		float newMinX = MathUtils.min(scaledMinX, scaledMaxX);
		float newMinY = MathUtils.min(scaledMinY, scaledMaxY);
		float newMaxX = MathUtils.max(scaledMinX, scaledMaxX);
		float newMaxY = MathUtils.max(scaledMinY, scaledMaxY);
		
		res.set(newMinX, newMinY, newMaxX, newMaxY);
		
		return res;
	}
	
	public static <T extends IAabb2WF> T scaleFromPivot(IAabb2RF aabb, float[] pivot, IVec2RF scale, @ExtractionParam T res)
	{
		float aabbMinX = aabb.minX();
		float aabbMinY = aabb.minY();
		float aabbMaxX = aabb.maxX();
		float aabbMaxY = aabb.maxY();
		
		float pivotX = pivot[0];
		float pivotY = pivot[1];
		
		float scaleX = scale.x();
		float scaleY = scale.y();
		
		float scaledMinX = MathUtils.fma(scaleX, aabbMinX - pivotX, pivotX);
		float scaledMinY = MathUtils.fma(scaleY, aabbMinY - pivotY, pivotY);
		float scaledMaxX = MathUtils.fma(scaleX, aabbMaxX - pivotX, pivotX);
		float scaledMaxY = MathUtils.fma(scaleY, aabbMaxY - pivotY, pivotY);
		
		float newMinX = MathUtils.min(scaledMinX, scaledMaxX);
		float newMinY = MathUtils.min(scaledMinY, scaledMaxY);
		float newMaxX = MathUtils.max(scaledMinX, scaledMaxX);
		float newMaxY = MathUtils.max(scaledMinY, scaledMaxY);
		
		res.set(newMinX, newMinY, newMaxX, newMaxY);
		
		return res;
	}
	
	public static <T extends IAabb2WF> T scaleFromPivot(IAabb2RF aabb, float[] pivot, float[] scale, @ExtractionParam T res)
	{
		float aabbMinX = aabb.minX();
		float aabbMinY = aabb.minY();
		float aabbMaxX = aabb.maxX();
		float aabbMaxY = aabb.maxY();
		
		float pivotX = pivot[0];
		float pivotY = pivot[1];
		
		float scaleX = scale[0];
		float scaleY = scale[1];
		
		float scaledMinX = MathUtils.fma(scaleX, aabbMinX - pivotX, pivotX);
		float scaledMinY = MathUtils.fma(scaleY, aabbMinY - pivotY, pivotY);
		float scaledMaxX = MathUtils.fma(scaleX, aabbMaxX - pivotX, pivotX);
		float scaledMaxY = MathUtils.fma(scaleY, aabbMaxY - pivotY, pivotY);
		
		float newMinX = MathUtils.min(scaledMinX, scaledMaxX);
		float newMinY = MathUtils.min(scaledMinY, scaledMaxY);
		float newMaxX = MathUtils.max(scaledMinX, scaledMaxX);
		float newMaxY = MathUtils.max(scaledMinY, scaledMaxY);
		
		res.set(newMinX, newMinY, newMaxX, newMaxY);
		
		return res;
	}
	
	public static <T extends IAabb2WF> T scaleFromPivot(IAabb2RF aabb, float[] pivot, float scaleX, float scaleY, @ExtractionParam T res)
	{
		float aabbMinX = aabb.minX();
		float aabbMinY = aabb.minY();
		float aabbMaxX = aabb.maxX();
		float aabbMaxY = aabb.maxY();
		
		float pivotX = pivot[0];
		float pivotY = pivot[1];
		
		float scaledMinX = MathUtils.fma(scaleX, aabbMinX - pivotX, pivotX);
		float scaledMinY = MathUtils.fma(scaleY, aabbMinY - pivotY, pivotY);
		float scaledMaxX = MathUtils.fma(scaleX, aabbMaxX - pivotX, pivotX);
		float scaledMaxY = MathUtils.fma(scaleY, aabbMaxY - pivotY, pivotY);
		
		float newMinX = MathUtils.min(scaledMinX, scaledMaxX);
		float newMinY = MathUtils.min(scaledMinY, scaledMaxY);
		float newMaxX = MathUtils.max(scaledMinX, scaledMaxX);
		float newMaxY = MathUtils.max(scaledMinY, scaledMaxY);
		
		res.set(newMinX, newMinY, newMaxX, newMaxY);
		
		return res;
	}
	
	public static <T extends IAabb2WF> T scaleFromPivot(IAabb2RF aabb, float pivotX, float pivotY, IVec2RF scale, @ExtractionParam T res)
	{
		float aabbMinX = aabb.minX();
		float aabbMinY = aabb.minY();
		float aabbMaxX = aabb.maxX();
		float aabbMaxY = aabb.maxY();
		
		float scaleX = scale.x();
		float scaleY = scale.y();
		
		float scaledMinX = MathUtils.fma(scaleX, aabbMinX - pivotX, pivotX);
		float scaledMinY = MathUtils.fma(scaleY, aabbMinY - pivotY, pivotY);
		float scaledMaxX = MathUtils.fma(scaleX, aabbMaxX - pivotX, pivotX);
		float scaledMaxY = MathUtils.fma(scaleY, aabbMaxY - pivotY, pivotY);
		
		float newMinX = MathUtils.min(scaledMinX, scaledMaxX);
		float newMinY = MathUtils.min(scaledMinY, scaledMaxY);
		float newMaxX = MathUtils.max(scaledMinX, scaledMaxX);
		float newMaxY = MathUtils.max(scaledMinY, scaledMaxY);
		
		res.set(newMinX, newMinY, newMaxX, newMaxY);
		
		return res;
	}
	
	public static <T extends IAabb2WF> T scaleFromPivot(IAabb2RF aabb, float pivotX, float pivotY, float[] scale, @ExtractionParam T res)
	{
		float aabbMinX = aabb.minX();
		float aabbMinY = aabb.minY();
		float aabbMaxX = aabb.maxX();
		float aabbMaxY = aabb.maxY();
		
		float scaleX = scale[0];
		float scaleY = scale[1];
		
		float scaledMinX = MathUtils.fma(scaleX, aabbMinX - pivotX, pivotX);
		float scaledMinY = MathUtils.fma(scaleY, aabbMinY - pivotY, pivotY);
		float scaledMaxX = MathUtils.fma(scaleX, aabbMaxX - pivotX, pivotX);
		float scaledMaxY = MathUtils.fma(scaleY, aabbMaxY - pivotY, pivotY);
		
		float newMinX = MathUtils.min(scaledMinX, scaledMaxX);
		float newMinY = MathUtils.min(scaledMinY, scaledMaxY);
		float newMaxX = MathUtils.max(scaledMinX, scaledMaxX);
		float newMaxY = MathUtils.max(scaledMinY, scaledMaxY);
		
		res.set(newMinX, newMinY, newMaxX, newMaxY);
		
		return res;
	}
	
	public static <T extends IAabb2WF> T scaleFromPivot(IAabb2RF aabb, float pivotX, float pivotY, float scaleX, float scaleY, @ExtractionParam T res)
	{
		float aabbMinX = aabb.minX();
		float aabbMinY = aabb.minY();
		float aabbMaxX = aabb.maxX();
		float aabbMaxY = aabb.maxY();
		
		float scaledMinX = MathUtils.fma(scaleX, aabbMinX - pivotX, pivotX);
		float scaledMinY = MathUtils.fma(scaleY, aabbMinY - pivotY, pivotY);
		float scaledMaxX = MathUtils.fma(scaleX, aabbMaxX - pivotX, pivotX);
		float scaledMaxY = MathUtils.fma(scaleY, aabbMaxY - pivotY, pivotY);
		
		float newMinX = MathUtils.min(scaledMinX, scaledMaxX);
		float newMinY = MathUtils.min(scaledMinY, scaledMaxY);
		float newMaxX = MathUtils.max(scaledMinX, scaledMaxX);
		float newMaxY = MathUtils.max(scaledMinY, scaledMaxY);
		
		res.set(newMinX, newMinY, newMaxX, newMaxY);
		
		return res;
	}
	
	public static <T extends IAabb2WF> T scaleFromPivot(float[] aabb, IVec2RF pivot, IVec2RF scale, @ExtractionParam T res)
	{
		float aabbMinX = aabb[0];
		float aabbMinY = aabb[1];
		float aabbMaxX = aabb[2];
		float aabbMaxY = aabb[3];
		
		float pivotX = pivot.x();
		float pivotY = pivot.y();
		
		float scaleX = scale.x();
		float scaleY = scale.y();
		
		float scaledMinX = MathUtils.fma(scaleX, aabbMinX - pivotX, pivotX);
		float scaledMinY = MathUtils.fma(scaleY, aabbMinY - pivotY, pivotY);
		float scaledMaxX = MathUtils.fma(scaleX, aabbMaxX - pivotX, pivotX);
		float scaledMaxY = MathUtils.fma(scaleY, aabbMaxY - pivotY, pivotY);
		
		float newMinX = MathUtils.min(scaledMinX, scaledMaxX);
		float newMinY = MathUtils.min(scaledMinY, scaledMaxY);
		float newMaxX = MathUtils.max(scaledMinX, scaledMaxX);
		float newMaxY = MathUtils.max(scaledMinY, scaledMaxY);
		
		res.set(newMinX, newMinY, newMaxX, newMaxY);
		
		return res;
	}
	
	public static <T extends IAabb2WF> T scaleFromPivot(float[] aabb, IVec2RF pivot, float[] scale, @ExtractionParam T res)
	{
		float aabbMinX = aabb[0];
		float aabbMinY = aabb[1];
		float aabbMaxX = aabb[2];
		float aabbMaxY = aabb[3];
		
		float pivotX = pivot.x();
		float pivotY = pivot.y();
		
		float scaleX = scale[0];
		float scaleY = scale[1];
		
		float scaledMinX = MathUtils.fma(scaleX, aabbMinX - pivotX, pivotX);
		float scaledMinY = MathUtils.fma(scaleY, aabbMinY - pivotY, pivotY);
		float scaledMaxX = MathUtils.fma(scaleX, aabbMaxX - pivotX, pivotX);
		float scaledMaxY = MathUtils.fma(scaleY, aabbMaxY - pivotY, pivotY);
		
		float newMinX = MathUtils.min(scaledMinX, scaledMaxX);
		float newMinY = MathUtils.min(scaledMinY, scaledMaxY);
		float newMaxX = MathUtils.max(scaledMinX, scaledMaxX);
		float newMaxY = MathUtils.max(scaledMinY, scaledMaxY);
		
		res.set(newMinX, newMinY, newMaxX, newMaxY);
		
		return res;
	}
	
	public static <T extends IAabb2WF> T scaleFromPivot(float[] aabb, IVec2RF pivot, float scaleX, float scaleY, @ExtractionParam T res)
	{
		float aabbMinX = aabb[0];
		float aabbMinY = aabb[1];
		float aabbMaxX = aabb[2];
		float aabbMaxY = aabb[3];
		
		float pivotX = pivot.x();
		float pivotY = pivot.y();
		
		float scaledMinX = MathUtils.fma(scaleX, aabbMinX - pivotX, pivotX);
		float scaledMinY = MathUtils.fma(scaleY, aabbMinY - pivotY, pivotY);
		float scaledMaxX = MathUtils.fma(scaleX, aabbMaxX - pivotX, pivotX);
		float scaledMaxY = MathUtils.fma(scaleY, aabbMaxY - pivotY, pivotY);
		
		float newMinX = MathUtils.min(scaledMinX, scaledMaxX);
		float newMinY = MathUtils.min(scaledMinY, scaledMaxY);
		float newMaxX = MathUtils.max(scaledMinX, scaledMaxX);
		float newMaxY = MathUtils.max(scaledMinY, scaledMaxY);
		
		res.set(newMinX, newMinY, newMaxX, newMaxY);
		
		return res;
	}
	
	public static <T extends IAabb2WF> T scaleFromPivot(float[] aabb, float[] pivot, IVec2RF scale, @ExtractionParam T res)
	{
		float aabbMinX = aabb[0];
		float aabbMinY = aabb[1];
		float aabbMaxX = aabb[2];
		float aabbMaxY = aabb[3];
		
		float pivotX = pivot[0];
		float pivotY = pivot[1];
		
		float scaleX = scale.x();
		float scaleY = scale.y();
		
		float scaledMinX = MathUtils.fma(scaleX, aabbMinX - pivotX, pivotX);
		float scaledMinY = MathUtils.fma(scaleY, aabbMinY - pivotY, pivotY);
		float scaledMaxX = MathUtils.fma(scaleX, aabbMaxX - pivotX, pivotX);
		float scaledMaxY = MathUtils.fma(scaleY, aabbMaxY - pivotY, pivotY);
		
		float newMinX = MathUtils.min(scaledMinX, scaledMaxX);
		float newMinY = MathUtils.min(scaledMinY, scaledMaxY);
		float newMaxX = MathUtils.max(scaledMinX, scaledMaxX);
		float newMaxY = MathUtils.max(scaledMinY, scaledMaxY);
		
		res.set(newMinX, newMinY, newMaxX, newMaxY);
		
		return res;
	}
	
	public static <T extends IAabb2WF> T scaleFromPivot(float[] aabb, float[] pivot, float[] scale, @ExtractionParam T res)
	{
		float aabbMinX = aabb[0];
		float aabbMinY = aabb[1];
		float aabbMaxX = aabb[2];
		float aabbMaxY = aabb[3];
		
		float pivotX = pivot[0];
		float pivotY = pivot[1];
		
		float scaleX = scale[0];
		float scaleY = scale[1];
		
		float scaledMinX = MathUtils.fma(scaleX, aabbMinX - pivotX, pivotX);
		float scaledMinY = MathUtils.fma(scaleY, aabbMinY - pivotY, pivotY);
		float scaledMaxX = MathUtils.fma(scaleX, aabbMaxX - pivotX, pivotX);
		float scaledMaxY = MathUtils.fma(scaleY, aabbMaxY - pivotY, pivotY);
		
		float newMinX = MathUtils.min(scaledMinX, scaledMaxX);
		float newMinY = MathUtils.min(scaledMinY, scaledMaxY);
		float newMaxX = MathUtils.max(scaledMinX, scaledMaxX);
		float newMaxY = MathUtils.max(scaledMinY, scaledMaxY);
		
		res.set(newMinX, newMinY, newMaxX, newMaxY);
		
		return res;
	}
	
	public static <T extends IAabb2WF> T scaleFromPivot(float[] aabb, float[] pivot, float scaleX, float scaleY, @ExtractionParam T res)
	{
		float aabbMinX = aabb[0];
		float aabbMinY = aabb[1];
		float aabbMaxX = aabb[2];
		float aabbMaxY = aabb[3];
		
		float pivotX = pivot[0];
		float pivotY = pivot[1];
		
		float scaledMinX = MathUtils.fma(scaleX, aabbMinX - pivotX, pivotX);
		float scaledMinY = MathUtils.fma(scaleY, aabbMinY - pivotY, pivotY);
		float scaledMaxX = MathUtils.fma(scaleX, aabbMaxX - pivotX, pivotX);
		float scaledMaxY = MathUtils.fma(scaleY, aabbMaxY - pivotY, pivotY);
		
		float newMinX = MathUtils.min(scaledMinX, scaledMaxX);
		float newMinY = MathUtils.min(scaledMinY, scaledMaxY);
		float newMaxX = MathUtils.max(scaledMinX, scaledMaxX);
		float newMaxY = MathUtils.max(scaledMinY, scaledMaxY);
		
		res.set(newMinX, newMinY, newMaxX, newMaxY);
		
		return res;
	}
	
	public static <T extends IAabb2WF> T scaleFromPivot(float[] aabb, float pivotX, float pivotY, IVec2RF scale, @ExtractionParam T res)
	{
		float aabbMinX = aabb[0];
		float aabbMinY = aabb[1];
		float aabbMaxX = aabb[2];
		float aabbMaxY = aabb[3];
		
		float scaleX = scale.x();
		float scaleY = scale.y();
		
		float scaledMinX = MathUtils.fma(scaleX, aabbMinX - pivotX, pivotX);
		float scaledMinY = MathUtils.fma(scaleY, aabbMinY - pivotY, pivotY);
		float scaledMaxX = MathUtils.fma(scaleX, aabbMaxX - pivotX, pivotX);
		float scaledMaxY = MathUtils.fma(scaleY, aabbMaxY - pivotY, pivotY);
		
		float newMinX = MathUtils.min(scaledMinX, scaledMaxX);
		float newMinY = MathUtils.min(scaledMinY, scaledMaxY);
		float newMaxX = MathUtils.max(scaledMinX, scaledMaxX);
		float newMaxY = MathUtils.max(scaledMinY, scaledMaxY);
		
		res.set(newMinX, newMinY, newMaxX, newMaxY);
		
		return res;
	}
	
	public static <T extends IAabb2WF> T scaleFromPivot(float[] aabb, float pivotX, float pivotY, float[] scale, @ExtractionParam T res)
	{
		float aabbMinX = aabb[0];
		float aabbMinY = aabb[1];
		float aabbMaxX = aabb[2];
		float aabbMaxY = aabb[3];
		
		float scaleX = scale[0];
		float scaleY = scale[1];
		
		float scaledMinX = MathUtils.fma(scaleX, aabbMinX - pivotX, pivotX);
		float scaledMinY = MathUtils.fma(scaleY, aabbMinY - pivotY, pivotY);
		float scaledMaxX = MathUtils.fma(scaleX, aabbMaxX - pivotX, pivotX);
		float scaledMaxY = MathUtils.fma(scaleY, aabbMaxY - pivotY, pivotY);
		
		float newMinX = MathUtils.min(scaledMinX, scaledMaxX);
		float newMinY = MathUtils.min(scaledMinY, scaledMaxY);
		float newMaxX = MathUtils.max(scaledMinX, scaledMaxX);
		float newMaxY = MathUtils.max(scaledMinY, scaledMaxY);
		
		res.set(newMinX, newMinY, newMaxX, newMaxY);
		
		return res;
	}
	
	public static <T extends IAabb2WF> T scaleFromPivot(float[] aabb, float pivotX, float pivotY, float scaleX, float scaleY, @ExtractionParam T res)
	{
		float aabbMinX = aabb[0];
		float aabbMinY = aabb[1];
		float aabbMaxX = aabb[2];
		float aabbMaxY = aabb[3];
		
		float scaledMinX = MathUtils.fma(scaleX, aabbMinX - pivotX, pivotX);
		float scaledMinY = MathUtils.fma(scaleY, aabbMinY - pivotY, pivotY);
		float scaledMaxX = MathUtils.fma(scaleX, aabbMaxX - pivotX, pivotX);
		float scaledMaxY = MathUtils.fma(scaleY, aabbMaxY - pivotY, pivotY);
		
		float newMinX = MathUtils.min(scaledMinX, scaledMaxX);
		float newMinY = MathUtils.min(scaledMinY, scaledMaxY);
		float newMaxX = MathUtils.max(scaledMinX, scaledMaxX);
		float newMaxY = MathUtils.max(scaledMinY, scaledMaxY);
		
		res.set(newMinX, newMinY, newMaxX, newMaxY);
		
		return res;
	}
	
	public static <T extends IAabb2WF> T scaleFromPivot(IVec2RF aabbMin, IVec2RF aabbMax, IVec2RF pivot, IVec2RF scale, @ExtractionParam T res)
	{
		float aabbMinX = aabbMin.x();
		float aabbMinY = aabbMin.y();
		float aabbMaxX = aabbMax.x();
		float aabbMaxY = aabbMax.y();
		
		float pivotX = pivot.x();
		float pivotY = pivot.y();
		
		float scaleX = scale.x();
		float scaleY = scale.y();
		
		float scaledMinX = MathUtils.fma(scaleX, aabbMinX - pivotX, pivotX);
		float scaledMinY = MathUtils.fma(scaleY, aabbMinY - pivotY, pivotY);
		float scaledMaxX = MathUtils.fma(scaleX, aabbMaxX - pivotX, pivotX);
		float scaledMaxY = MathUtils.fma(scaleY, aabbMaxY - pivotY, pivotY);
		
		float newMinX = MathUtils.min(scaledMinX, scaledMaxX);
		float newMinY = MathUtils.min(scaledMinY, scaledMaxY);
		float newMaxX = MathUtils.max(scaledMinX, scaledMaxX);
		float newMaxY = MathUtils.max(scaledMinY, scaledMaxY);
		
		res.set(newMinX, newMinY, newMaxX, newMaxY);
		
		return res;
	}
	
	public static <T extends IAabb2WF> T scaleFromPivot(IVec2RF aabbMin, IVec2RF aabbMax, IVec2RF pivot, float[] scale, @ExtractionParam T res)
	{
		float aabbMinX = aabbMin.x();
		float aabbMinY = aabbMin.y();
		float aabbMaxX = aabbMax.x();
		float aabbMaxY = aabbMax.y();
		
		float pivotX = pivot.x();
		float pivotY = pivot.y();
		
		float scaleX = scale[0];
		float scaleY = scale[1];
		
		float scaledMinX = MathUtils.fma(scaleX, aabbMinX - pivotX, pivotX);
		float scaledMinY = MathUtils.fma(scaleY, aabbMinY - pivotY, pivotY);
		float scaledMaxX = MathUtils.fma(scaleX, aabbMaxX - pivotX, pivotX);
		float scaledMaxY = MathUtils.fma(scaleY, aabbMaxY - pivotY, pivotY);
		
		float newMinX = MathUtils.min(scaledMinX, scaledMaxX);
		float newMinY = MathUtils.min(scaledMinY, scaledMaxY);
		float newMaxX = MathUtils.max(scaledMinX, scaledMaxX);
		float newMaxY = MathUtils.max(scaledMinY, scaledMaxY);
		
		res.set(newMinX, newMinY, newMaxX, newMaxY);
		
		return res;
	}
	
	public static <T extends IAabb2WF> T scaleFromPivot(IVec2RF aabbMin, IVec2RF aabbMax, IVec2RF pivot, float scaleX, float scaleY, @ExtractionParam T res)
	{
		float aabbMinX = aabbMin.x();
		float aabbMinY = aabbMin.y();
		float aabbMaxX = aabbMax.x();
		float aabbMaxY = aabbMax.y();
		
		float pivotX = pivot.x();
		float pivotY = pivot.y();
		
		float scaledMinX = MathUtils.fma(scaleX, aabbMinX - pivotX, pivotX);
		float scaledMinY = MathUtils.fma(scaleY, aabbMinY - pivotY, pivotY);
		float scaledMaxX = MathUtils.fma(scaleX, aabbMaxX - pivotX, pivotX);
		float scaledMaxY = MathUtils.fma(scaleY, aabbMaxY - pivotY, pivotY);
		
		float newMinX = MathUtils.min(scaledMinX, scaledMaxX);
		float newMinY = MathUtils.min(scaledMinY, scaledMaxY);
		float newMaxX = MathUtils.max(scaledMinX, scaledMaxX);
		float newMaxY = MathUtils.max(scaledMinY, scaledMaxY);
		
		res.set(newMinX, newMinY, newMaxX, newMaxY);
		
		return res;
	}
	
	public static <T extends IAabb2WF> T scaleFromPivot(IVec2RF aabbMin, IVec2RF aabbMax, float[] pivot, IVec2RF scale, @ExtractionParam T res)
	{
		float aabbMinX = aabbMin.x();
		float aabbMinY = aabbMin.y();
		float aabbMaxX = aabbMax.x();
		float aabbMaxY = aabbMax.y();
		
		float pivotX = pivot[0];
		float pivotY = pivot[1];
		
		float scaleX = scale.x();
		float scaleY = scale.y();
		
		float scaledMinX = MathUtils.fma(scaleX, aabbMinX - pivotX, pivotX);
		float scaledMinY = MathUtils.fma(scaleY, aabbMinY - pivotY, pivotY);
		float scaledMaxX = MathUtils.fma(scaleX, aabbMaxX - pivotX, pivotX);
		float scaledMaxY = MathUtils.fma(scaleY, aabbMaxY - pivotY, pivotY);
		
		float newMinX = MathUtils.min(scaledMinX, scaledMaxX);
		float newMinY = MathUtils.min(scaledMinY, scaledMaxY);
		float newMaxX = MathUtils.max(scaledMinX, scaledMaxX);
		float newMaxY = MathUtils.max(scaledMinY, scaledMaxY);
		
		res.set(newMinX, newMinY, newMaxX, newMaxY);
		
		return res;
	}
	
	public static <T extends IAabb2WF> T scaleFromPivot(IVec2RF aabbMin, IVec2RF aabbMax, float[] pivot, float[] scale, @ExtractionParam T res)
	{
		float aabbMinX = aabbMin.x();
		float aabbMinY = aabbMin.y();
		float aabbMaxX = aabbMax.x();
		float aabbMaxY = aabbMax.y();
		
		float pivotX = pivot[0];
		float pivotY = pivot[1];
		
		float scaleX = scale[0];
		float scaleY = scale[1];
		
		float scaledMinX = MathUtils.fma(scaleX, aabbMinX - pivotX, pivotX);
		float scaledMinY = MathUtils.fma(scaleY, aabbMinY - pivotY, pivotY);
		float scaledMaxX = MathUtils.fma(scaleX, aabbMaxX - pivotX, pivotX);
		float scaledMaxY = MathUtils.fma(scaleY, aabbMaxY - pivotY, pivotY);
		
		float newMinX = MathUtils.min(scaledMinX, scaledMaxX);
		float newMinY = MathUtils.min(scaledMinY, scaledMaxY);
		float newMaxX = MathUtils.max(scaledMinX, scaledMaxX);
		float newMaxY = MathUtils.max(scaledMinY, scaledMaxY);
		
		res.set(newMinX, newMinY, newMaxX, newMaxY);
		
		return res;
	}
	
	public static <T extends IAabb2WF> T scaleFromPivot(IVec2RF aabbMin, IVec2RF aabbMax, float[] pivot, float scaleX, float scaleY, @ExtractionParam T res)
	{
		float aabbMinX = aabbMin.x();
		float aabbMinY = aabbMin.y();
		float aabbMaxX = aabbMax.x();
		float aabbMaxY = aabbMax.y();
		
		float pivotX = pivot[0];
		float pivotY = pivot[1];
		
		float scaledMinX = MathUtils.fma(scaleX, aabbMinX - pivotX, pivotX);
		float scaledMinY = MathUtils.fma(scaleY, aabbMinY - pivotY, pivotY);
		float scaledMaxX = MathUtils.fma(scaleX, aabbMaxX - pivotX, pivotX);
		float scaledMaxY = MathUtils.fma(scaleY, aabbMaxY - pivotY, pivotY);
		
		float newMinX = MathUtils.min(scaledMinX, scaledMaxX);
		float newMinY = MathUtils.min(scaledMinY, scaledMaxY);
		float newMaxX = MathUtils.max(scaledMinX, scaledMaxX);
		float newMaxY = MathUtils.max(scaledMinY, scaledMaxY);
		
		res.set(newMinX, newMinY, newMaxX, newMaxY);
		
		return res;
	}
	
	public static <T extends IAabb2WF> T scaleFromPivot(IVec2RF aabbMin, IVec2RF aabbMax, float pivotX, float pivotY, IVec2RF scale, @ExtractionParam T res)
	{
		float aabbMinX = aabbMin.x();
		float aabbMinY = aabbMin.y();
		float aabbMaxX = aabbMax.x();
		float aabbMaxY = aabbMax.y();
		
		float scaleX = scale.x();
		float scaleY = scale.y();
		
		float scaledMinX = MathUtils.fma(scaleX, aabbMinX - pivotX, pivotX);
		float scaledMinY = MathUtils.fma(scaleY, aabbMinY - pivotY, pivotY);
		float scaledMaxX = MathUtils.fma(scaleX, aabbMaxX - pivotX, pivotX);
		float scaledMaxY = MathUtils.fma(scaleY, aabbMaxY - pivotY, pivotY);
		
		float newMinX = MathUtils.min(scaledMinX, scaledMaxX);
		float newMinY = MathUtils.min(scaledMinY, scaledMaxY);
		float newMaxX = MathUtils.max(scaledMinX, scaledMaxX);
		float newMaxY = MathUtils.max(scaledMinY, scaledMaxY);
		
		res.set(newMinX, newMinY, newMaxX, newMaxY);
		
		return res;
	}
	
	public static <T extends IAabb2WF> T scaleFromPivot(IVec2RF aabbMin, IVec2RF aabbMax, float pivotX, float pivotY, float[] scale, @ExtractionParam T res)
	{
		float aabbMinX = aabbMin.x();
		float aabbMinY = aabbMin.y();
		float aabbMaxX = aabbMax.x();
		float aabbMaxY = aabbMax.y();
		
		float scaleX = scale[0];
		float scaleY = scale[1];
		
		float scaledMinX = MathUtils.fma(scaleX, aabbMinX - pivotX, pivotX);
		float scaledMinY = MathUtils.fma(scaleY, aabbMinY - pivotY, pivotY);
		float scaledMaxX = MathUtils.fma(scaleX, aabbMaxX - pivotX, pivotX);
		float scaledMaxY = MathUtils.fma(scaleY, aabbMaxY - pivotY, pivotY);
		
		float newMinX = MathUtils.min(scaledMinX, scaledMaxX);
		float newMinY = MathUtils.min(scaledMinY, scaledMaxY);
		float newMaxX = MathUtils.max(scaledMinX, scaledMaxX);
		float newMaxY = MathUtils.max(scaledMinY, scaledMaxY);
		
		res.set(newMinX, newMinY, newMaxX, newMaxY);
		
		return res;
	}
	
	public static <T extends IAabb2WF> T scaleFromPivot(IVec2RF aabbMin, IVec2RF aabbMax, float pivotX, float pivotY, float scaleX, float scaleY, @ExtractionParam T res)
	{
		float aabbMinX = aabbMin.x();
		float aabbMinY = aabbMin.y();
		float aabbMaxX = aabbMax.x();
		float aabbMaxY = aabbMax.y();
		
		float scaledMinX = MathUtils.fma(scaleX, aabbMinX - pivotX, pivotX);
		float scaledMinY = MathUtils.fma(scaleY, aabbMinY - pivotY, pivotY);
		float scaledMaxX = MathUtils.fma(scaleX, aabbMaxX - pivotX, pivotX);
		float scaledMaxY = MathUtils.fma(scaleY, aabbMaxY - pivotY, pivotY);
		
		float newMinX = MathUtils.min(scaledMinX, scaledMaxX);
		float newMinY = MathUtils.min(scaledMinY, scaledMaxY);
		float newMaxX = MathUtils.max(scaledMinX, scaledMaxX);
		float newMaxY = MathUtils.max(scaledMinY, scaledMaxY);
		
		res.set(newMinX, newMinY, newMaxX, newMaxY);
		
		return res;
	}
	
	public static <T extends IAabb2WF> T scaleFromPivot(IVec2RF aabbMin, float[] aabbMax, IVec2RF pivot, IVec2RF scale, @ExtractionParam T res)
	{
		float aabbMinX = aabbMin.x();
		float aabbMinY = aabbMin.y();
		float aabbMaxX = aabbMax[0];
		float aabbMaxY = aabbMax[1];
		
		float pivotX = pivot.x();
		float pivotY = pivot.y();
		
		float scaleX = scale.x();
		float scaleY = scale.y();
		
		float scaledMinX = MathUtils.fma(scaleX, aabbMinX - pivotX, pivotX);
		float scaledMinY = MathUtils.fma(scaleY, aabbMinY - pivotY, pivotY);
		float scaledMaxX = MathUtils.fma(scaleX, aabbMaxX - pivotX, pivotX);
		float scaledMaxY = MathUtils.fma(scaleY, aabbMaxY - pivotY, pivotY);
		
		float newMinX = MathUtils.min(scaledMinX, scaledMaxX);
		float newMinY = MathUtils.min(scaledMinY, scaledMaxY);
		float newMaxX = MathUtils.max(scaledMinX, scaledMaxX);
		float newMaxY = MathUtils.max(scaledMinY, scaledMaxY);
		
		res.set(newMinX, newMinY, newMaxX, newMaxY);
		
		return res;
	}
	
	public static <T extends IAabb2WF> T scaleFromPivot(IVec2RF aabbMin, float[] aabbMax, IVec2RF pivot, float[] scale, @ExtractionParam T res)
	{
		float aabbMinX = aabbMin.x();
		float aabbMinY = aabbMin.y();
		float aabbMaxX = aabbMax[0];
		float aabbMaxY = aabbMax[1];
		
		float pivotX = pivot.x();
		float pivotY = pivot.y();
		
		float scaleX = scale[0];
		float scaleY = scale[1];
		
		float scaledMinX = MathUtils.fma(scaleX, aabbMinX - pivotX, pivotX);
		float scaledMinY = MathUtils.fma(scaleY, aabbMinY - pivotY, pivotY);
		float scaledMaxX = MathUtils.fma(scaleX, aabbMaxX - pivotX, pivotX);
		float scaledMaxY = MathUtils.fma(scaleY, aabbMaxY - pivotY, pivotY);
		
		float newMinX = MathUtils.min(scaledMinX, scaledMaxX);
		float newMinY = MathUtils.min(scaledMinY, scaledMaxY);
		float newMaxX = MathUtils.max(scaledMinX, scaledMaxX);
		float newMaxY = MathUtils.max(scaledMinY, scaledMaxY);
		
		res.set(newMinX, newMinY, newMaxX, newMaxY);
		
		return res;
	}
	
	public static <T extends IAabb2WF> T scaleFromPivot(IVec2RF aabbMin, float[] aabbMax, IVec2RF pivot, float scaleX, float scaleY, @ExtractionParam T res)
	{
		float aabbMinX = aabbMin.x();
		float aabbMinY = aabbMin.y();
		float aabbMaxX = aabbMax[0];
		float aabbMaxY = aabbMax[1];
		
		float pivotX = pivot.x();
		float pivotY = pivot.y();
		
		float scaledMinX = MathUtils.fma(scaleX, aabbMinX - pivotX, pivotX);
		float scaledMinY = MathUtils.fma(scaleY, aabbMinY - pivotY, pivotY);
		float scaledMaxX = MathUtils.fma(scaleX, aabbMaxX - pivotX, pivotX);
		float scaledMaxY = MathUtils.fma(scaleY, aabbMaxY - pivotY, pivotY);
		
		float newMinX = MathUtils.min(scaledMinX, scaledMaxX);
		float newMinY = MathUtils.min(scaledMinY, scaledMaxY);
		float newMaxX = MathUtils.max(scaledMinX, scaledMaxX);
		float newMaxY = MathUtils.max(scaledMinY, scaledMaxY);
		
		res.set(newMinX, newMinY, newMaxX, newMaxY);
		
		return res;
	}
	
	public static <T extends IAabb2WF> T scaleFromPivot(IVec2RF aabbMin, float[] aabbMax, float[] pivot, IVec2RF scale, @ExtractionParam T res)
	{
		float aabbMinX = aabbMin.x();
		float aabbMinY = aabbMin.y();
		float aabbMaxX = aabbMax[0];
		float aabbMaxY = aabbMax[1];
		
		float pivotX = pivot[0];
		float pivotY = pivot[1];
		
		float scaleX = scale.x();
		float scaleY = scale.y();
		
		float scaledMinX = MathUtils.fma(scaleX, aabbMinX - pivotX, pivotX);
		float scaledMinY = MathUtils.fma(scaleY, aabbMinY - pivotY, pivotY);
		float scaledMaxX = MathUtils.fma(scaleX, aabbMaxX - pivotX, pivotX);
		float scaledMaxY = MathUtils.fma(scaleY, aabbMaxY - pivotY, pivotY);
		
		float newMinX = MathUtils.min(scaledMinX, scaledMaxX);
		float newMinY = MathUtils.min(scaledMinY, scaledMaxY);
		float newMaxX = MathUtils.max(scaledMinX, scaledMaxX);
		float newMaxY = MathUtils.max(scaledMinY, scaledMaxY);
		
		res.set(newMinX, newMinY, newMaxX, newMaxY);
		
		return res;
	}
	
	public static <T extends IAabb2WF> T scaleFromPivot(IVec2RF aabbMin, float[] aabbMax, float[] pivot, float[] scale, @ExtractionParam T res)
	{
		float aabbMinX = aabbMin.x();
		float aabbMinY = aabbMin.y();
		float aabbMaxX = aabbMax[0];
		float aabbMaxY = aabbMax[1];
		
		float pivotX = pivot[0];
		float pivotY = pivot[1];
		
		float scaleX = scale[0];
		float scaleY = scale[1];
		
		float scaledMinX = MathUtils.fma(scaleX, aabbMinX - pivotX, pivotX);
		float scaledMinY = MathUtils.fma(scaleY, aabbMinY - pivotY, pivotY);
		float scaledMaxX = MathUtils.fma(scaleX, aabbMaxX - pivotX, pivotX);
		float scaledMaxY = MathUtils.fma(scaleY, aabbMaxY - pivotY, pivotY);
		
		float newMinX = MathUtils.min(scaledMinX, scaledMaxX);
		float newMinY = MathUtils.min(scaledMinY, scaledMaxY);
		float newMaxX = MathUtils.max(scaledMinX, scaledMaxX);
		float newMaxY = MathUtils.max(scaledMinY, scaledMaxY);
		
		res.set(newMinX, newMinY, newMaxX, newMaxY);
		
		return res;
	}
	
	public static <T extends IAabb2WF> T scaleFromPivot(IVec2RF aabbMin, float[] aabbMax, float[] pivot, float scaleX, float scaleY, @ExtractionParam T res)
	{
		float aabbMinX = aabbMin.x();
		float aabbMinY = aabbMin.y();
		float aabbMaxX = aabbMax[0];
		float aabbMaxY = aabbMax[1];
		
		float pivotX = pivot[0];
		float pivotY = pivot[1];
		
		float scaledMinX = MathUtils.fma(scaleX, aabbMinX - pivotX, pivotX);
		float scaledMinY = MathUtils.fma(scaleY, aabbMinY - pivotY, pivotY);
		float scaledMaxX = MathUtils.fma(scaleX, aabbMaxX - pivotX, pivotX);
		float scaledMaxY = MathUtils.fma(scaleY, aabbMaxY - pivotY, pivotY);
		
		float newMinX = MathUtils.min(scaledMinX, scaledMaxX);
		float newMinY = MathUtils.min(scaledMinY, scaledMaxY);
		float newMaxX = MathUtils.max(scaledMinX, scaledMaxX);
		float newMaxY = MathUtils.max(scaledMinY, scaledMaxY);
		
		res.set(newMinX, newMinY, newMaxX, newMaxY);
		
		return res;
	}
	
	public static <T extends IAabb2WF> T scaleFromPivot(IVec2RF aabbMin, float[] aabbMax, float pivotX, float pivotY, IVec2RF scale, @ExtractionParam T res)
	{
		float aabbMinX = aabbMin.x();
		float aabbMinY = aabbMin.y();
		float aabbMaxX = aabbMax[0];
		float aabbMaxY = aabbMax[1];
		
		float scaleX = scale.x();
		float scaleY = scale.y();
		
		float scaledMinX = MathUtils.fma(scaleX, aabbMinX - pivotX, pivotX);
		float scaledMinY = MathUtils.fma(scaleY, aabbMinY - pivotY, pivotY);
		float scaledMaxX = MathUtils.fma(scaleX, aabbMaxX - pivotX, pivotX);
		float scaledMaxY = MathUtils.fma(scaleY, aabbMaxY - pivotY, pivotY);
		
		float newMinX = MathUtils.min(scaledMinX, scaledMaxX);
		float newMinY = MathUtils.min(scaledMinY, scaledMaxY);
		float newMaxX = MathUtils.max(scaledMinX, scaledMaxX);
		float newMaxY = MathUtils.max(scaledMinY, scaledMaxY);
		
		res.set(newMinX, newMinY, newMaxX, newMaxY);
		
		return res;
	}
	
	public static <T extends IAabb2WF> T scaleFromPivot(IVec2RF aabbMin, float[] aabbMax, float pivotX, float pivotY, float[] scale, @ExtractionParam T res)
	{
		float aabbMinX = aabbMin.x();
		float aabbMinY = aabbMin.y();
		float aabbMaxX = aabbMax[0];
		float aabbMaxY = aabbMax[1];
		
		float scaleX = scale[0];
		float scaleY = scale[1];
		
		float scaledMinX = MathUtils.fma(scaleX, aabbMinX - pivotX, pivotX);
		float scaledMinY = MathUtils.fma(scaleY, aabbMinY - pivotY, pivotY);
		float scaledMaxX = MathUtils.fma(scaleX, aabbMaxX - pivotX, pivotX);
		float scaledMaxY = MathUtils.fma(scaleY, aabbMaxY - pivotY, pivotY);
		
		float newMinX = MathUtils.min(scaledMinX, scaledMaxX);
		float newMinY = MathUtils.min(scaledMinY, scaledMaxY);
		float newMaxX = MathUtils.max(scaledMinX, scaledMaxX);
		float newMaxY = MathUtils.max(scaledMinY, scaledMaxY);
		
		res.set(newMinX, newMinY, newMaxX, newMaxY);
		
		return res;
	}
	
	public static <T extends IAabb2WF> T scaleFromPivot(IVec2RF aabbMin, float[] aabbMax, float pivotX, float pivotY, float scaleX, float scaleY, @ExtractionParam T res)
	{
		float aabbMinX = aabbMin.x();
		float aabbMinY = aabbMin.y();
		float aabbMaxX = aabbMax[0];
		float aabbMaxY = aabbMax[1];
		
		float scaledMinX = MathUtils.fma(scaleX, aabbMinX - pivotX, pivotX);
		float scaledMinY = MathUtils.fma(scaleY, aabbMinY - pivotY, pivotY);
		float scaledMaxX = MathUtils.fma(scaleX, aabbMaxX - pivotX, pivotX);
		float scaledMaxY = MathUtils.fma(scaleY, aabbMaxY - pivotY, pivotY);
		
		float newMinX = MathUtils.min(scaledMinX, scaledMaxX);
		float newMinY = MathUtils.min(scaledMinY, scaledMaxY);
		float newMaxX = MathUtils.max(scaledMinX, scaledMaxX);
		float newMaxY = MathUtils.max(scaledMinY, scaledMaxY);
		
		res.set(newMinX, newMinY, newMaxX, newMaxY);
		
		return res;
	}
	
	public static <T extends IAabb2WF> T scaleFromPivot(IVec2RF aabbMin, float aabbMaxX, float aabbMaxY, IVec2RF pivot, IVec2RF scale, @ExtractionParam T res)
	{
		float aabbMinX = aabbMin.x();
		float aabbMinY = aabbMin.y();
		
		float pivotX = pivot.x();
		float pivotY = pivot.y();
		
		float scaleX = scale.x();
		float scaleY = scale.y();
		
		float scaledMinX = MathUtils.fma(scaleX, aabbMinX - pivotX, pivotX);
		float scaledMinY = MathUtils.fma(scaleY, aabbMinY - pivotY, pivotY);
		float scaledMaxX = MathUtils.fma(scaleX, aabbMaxX - pivotX, pivotX);
		float scaledMaxY = MathUtils.fma(scaleY, aabbMaxY - pivotY, pivotY);
		
		float newMinX = MathUtils.min(scaledMinX, scaledMaxX);
		float newMinY = MathUtils.min(scaledMinY, scaledMaxY);
		float newMaxX = MathUtils.max(scaledMinX, scaledMaxX);
		float newMaxY = MathUtils.max(scaledMinY, scaledMaxY);
		
		res.set(newMinX, newMinY, newMaxX, newMaxY);
		
		return res;
	}
	
	public static <T extends IAabb2WF> T scaleFromPivot(IVec2RF aabbMin, float aabbMaxX, float aabbMaxY, IVec2RF pivot, float[] scale, @ExtractionParam T res)
	{
		float aabbMinX = aabbMin.x();
		float aabbMinY = aabbMin.y();
		
		float pivotX = pivot.x();
		float pivotY = pivot.y();
		
		float scaleX = scale[0];
		float scaleY = scale[1];
		
		float scaledMinX = MathUtils.fma(scaleX, aabbMinX - pivotX, pivotX);
		float scaledMinY = MathUtils.fma(scaleY, aabbMinY - pivotY, pivotY);
		float scaledMaxX = MathUtils.fma(scaleX, aabbMaxX - pivotX, pivotX);
		float scaledMaxY = MathUtils.fma(scaleY, aabbMaxY - pivotY, pivotY);
		
		float newMinX = MathUtils.min(scaledMinX, scaledMaxX);
		float newMinY = MathUtils.min(scaledMinY, scaledMaxY);
		float newMaxX = MathUtils.max(scaledMinX, scaledMaxX);
		float newMaxY = MathUtils.max(scaledMinY, scaledMaxY);
		
		res.set(newMinX, newMinY, newMaxX, newMaxY);
		
		return res;
	}
	
	public static <T extends IAabb2WF> T scaleFromPivot(IVec2RF aabbMin, float aabbMaxX, float aabbMaxY, IVec2RF pivot, float scaleX, float scaleY, @ExtractionParam T res)
	{
		float aabbMinX = aabbMin.x();
		float aabbMinY = aabbMin.y();
		
		float pivotX = pivot.x();
		float pivotY = pivot.y();
		
		float scaledMinX = MathUtils.fma(scaleX, aabbMinX - pivotX, pivotX);
		float scaledMinY = MathUtils.fma(scaleY, aabbMinY - pivotY, pivotY);
		float scaledMaxX = MathUtils.fma(scaleX, aabbMaxX - pivotX, pivotX);
		float scaledMaxY = MathUtils.fma(scaleY, aabbMaxY - pivotY, pivotY);
		
		float newMinX = MathUtils.min(scaledMinX, scaledMaxX);
		float newMinY = MathUtils.min(scaledMinY, scaledMaxY);
		float newMaxX = MathUtils.max(scaledMinX, scaledMaxX);
		float newMaxY = MathUtils.max(scaledMinY, scaledMaxY);
		
		res.set(newMinX, newMinY, newMaxX, newMaxY);
		
		return res;
	}
	
	public static <T extends IAabb2WF> T scaleFromPivot(IVec2RF aabbMin, float aabbMaxX, float aabbMaxY, float[] pivot, IVec2RF scale, @ExtractionParam T res)
	{
		float aabbMinX = aabbMin.x();
		float aabbMinY = aabbMin.y();
		
		float pivotX = pivot[0];
		float pivotY = pivot[1];
		
		float scaleX = scale.x();
		float scaleY = scale.y();
		
		float scaledMinX = MathUtils.fma(scaleX, aabbMinX - pivotX, pivotX);
		float scaledMinY = MathUtils.fma(scaleY, aabbMinY - pivotY, pivotY);
		float scaledMaxX = MathUtils.fma(scaleX, aabbMaxX - pivotX, pivotX);
		float scaledMaxY = MathUtils.fma(scaleY, aabbMaxY - pivotY, pivotY);
		
		float newMinX = MathUtils.min(scaledMinX, scaledMaxX);
		float newMinY = MathUtils.min(scaledMinY, scaledMaxY);
		float newMaxX = MathUtils.max(scaledMinX, scaledMaxX);
		float newMaxY = MathUtils.max(scaledMinY, scaledMaxY);
		
		res.set(newMinX, newMinY, newMaxX, newMaxY);
		
		return res;
	}
	
	public static <T extends IAabb2WF> T scaleFromPivot(IVec2RF aabbMin, float aabbMaxX, float aabbMaxY, float[] pivot, float[] scale, @ExtractionParam T res)
	{
		float aabbMinX = aabbMin.x();
		float aabbMinY = aabbMin.y();
		
		float pivotX = pivot[0];
		float pivotY = pivot[1];
		
		float scaleX = scale[0];
		float scaleY = scale[1];
		
		float scaledMinX = MathUtils.fma(scaleX, aabbMinX - pivotX, pivotX);
		float scaledMinY = MathUtils.fma(scaleY, aabbMinY - pivotY, pivotY);
		float scaledMaxX = MathUtils.fma(scaleX, aabbMaxX - pivotX, pivotX);
		float scaledMaxY = MathUtils.fma(scaleY, aabbMaxY - pivotY, pivotY);
		
		float newMinX = MathUtils.min(scaledMinX, scaledMaxX);
		float newMinY = MathUtils.min(scaledMinY, scaledMaxY);
		float newMaxX = MathUtils.max(scaledMinX, scaledMaxX);
		float newMaxY = MathUtils.max(scaledMinY, scaledMaxY);
		
		res.set(newMinX, newMinY, newMaxX, newMaxY);
		
		return res;
	}
	
	public static <T extends IAabb2WF> T scaleFromPivot(IVec2RF aabbMin, float aabbMaxX, float aabbMaxY, float[] pivot, float scaleX, float scaleY, @ExtractionParam T res)
	{
		float aabbMinX = aabbMin.x();
		float aabbMinY = aabbMin.y();
		
		float pivotX = pivot[0];
		float pivotY = pivot[1];
		
		float scaledMinX = MathUtils.fma(scaleX, aabbMinX - pivotX, pivotX);
		float scaledMinY = MathUtils.fma(scaleY, aabbMinY - pivotY, pivotY);
		float scaledMaxX = MathUtils.fma(scaleX, aabbMaxX - pivotX, pivotX);
		float scaledMaxY = MathUtils.fma(scaleY, aabbMaxY - pivotY, pivotY);
		
		float newMinX = MathUtils.min(scaledMinX, scaledMaxX);
		float newMinY = MathUtils.min(scaledMinY, scaledMaxY);
		float newMaxX = MathUtils.max(scaledMinX, scaledMaxX);
		float newMaxY = MathUtils.max(scaledMinY, scaledMaxY);
		
		res.set(newMinX, newMinY, newMaxX, newMaxY);
		
		return res;
	}
	
	public static <T extends IAabb2WF> T scaleFromPivot(IVec2RF aabbMin, float aabbMaxX, float aabbMaxY, float pivotX, float pivotY, IVec2RF scale, @ExtractionParam T res)
	{
		float aabbMinX = aabbMin.x();
		float aabbMinY = aabbMin.y();
		
		float scaleX = scale.x();
		float scaleY = scale.y();
		
		float scaledMinX = MathUtils.fma(scaleX, aabbMinX - pivotX, pivotX);
		float scaledMinY = MathUtils.fma(scaleY, aabbMinY - pivotY, pivotY);
		float scaledMaxX = MathUtils.fma(scaleX, aabbMaxX - pivotX, pivotX);
		float scaledMaxY = MathUtils.fma(scaleY, aabbMaxY - pivotY, pivotY);
		
		float newMinX = MathUtils.min(scaledMinX, scaledMaxX);
		float newMinY = MathUtils.min(scaledMinY, scaledMaxY);
		float newMaxX = MathUtils.max(scaledMinX, scaledMaxX);
		float newMaxY = MathUtils.max(scaledMinY, scaledMaxY);
		
		res.set(newMinX, newMinY, newMaxX, newMaxY);
		
		return res;
	}
	
	public static <T extends IAabb2WF> T scaleFromPivot(IVec2RF aabbMin, float aabbMaxX, float aabbMaxY, float pivotX, float pivotY, float[] scale, @ExtractionParam T res)
	{
		float aabbMinX = aabbMin.x();
		float aabbMinY = aabbMin.y();
		
		float scaleX = scale[0];
		float scaleY = scale[1];
		
		float scaledMinX = MathUtils.fma(scaleX, aabbMinX - pivotX, pivotX);
		float scaledMinY = MathUtils.fma(scaleY, aabbMinY - pivotY, pivotY);
		float scaledMaxX = MathUtils.fma(scaleX, aabbMaxX - pivotX, pivotX);
		float scaledMaxY = MathUtils.fma(scaleY, aabbMaxY - pivotY, pivotY);
		
		float newMinX = MathUtils.min(scaledMinX, scaledMaxX);
		float newMinY = MathUtils.min(scaledMinY, scaledMaxY);
		float newMaxX = MathUtils.max(scaledMinX, scaledMaxX);
		float newMaxY = MathUtils.max(scaledMinY, scaledMaxY);
		
		res.set(newMinX, newMinY, newMaxX, newMaxY);
		
		return res;
	}
	
	public static <T extends IAabb2WF> T scaleFromPivot(IVec2RF aabbMin, float aabbMaxX, float aabbMaxY, float pivotX, float pivotY, float scaleX, float scaleY, @ExtractionParam T res)
	{
		float aabbMinX = aabbMin.x();
		float aabbMinY = aabbMin.y();
		
		float scaledMinX = MathUtils.fma(scaleX, aabbMinX - pivotX, pivotX);
		float scaledMinY = MathUtils.fma(scaleY, aabbMinY - pivotY, pivotY);
		float scaledMaxX = MathUtils.fma(scaleX, aabbMaxX - pivotX, pivotX);
		float scaledMaxY = MathUtils.fma(scaleY, aabbMaxY - pivotY, pivotY);
		
		float newMinX = MathUtils.min(scaledMinX, scaledMaxX);
		float newMinY = MathUtils.min(scaledMinY, scaledMaxY);
		float newMaxX = MathUtils.max(scaledMinX, scaledMaxX);
		float newMaxY = MathUtils.max(scaledMinY, scaledMaxY);
		
		res.set(newMinX, newMinY, newMaxX, newMaxY);
		
		return res;
	}
	
	public static <T extends IAabb2WF> T scaleFromPivot(float[] aabbMin, IVec2RF aabbMax, IVec2RF pivot, IVec2RF scale, @ExtractionParam T res)
	{
		float aabbMinX = aabbMin[0];
		float aabbMinY = aabbMin[1];
		float aabbMaxX = aabbMax.x();
		float aabbMaxY = aabbMax.y();
		
		float pivotX = pivot.x();
		float pivotY = pivot.y();
		
		float scaleX = scale.x();
		float scaleY = scale.y();
		
		float scaledMinX = MathUtils.fma(scaleX, aabbMinX - pivotX, pivotX);
		float scaledMinY = MathUtils.fma(scaleY, aabbMinY - pivotY, pivotY);
		float scaledMaxX = MathUtils.fma(scaleX, aabbMaxX - pivotX, pivotX);
		float scaledMaxY = MathUtils.fma(scaleY, aabbMaxY - pivotY, pivotY);
		
		float newMinX = MathUtils.min(scaledMinX, scaledMaxX);
		float newMinY = MathUtils.min(scaledMinY, scaledMaxY);
		float newMaxX = MathUtils.max(scaledMinX, scaledMaxX);
		float newMaxY = MathUtils.max(scaledMinY, scaledMaxY);
		
		res.set(newMinX, newMinY, newMaxX, newMaxY);
		
		return res;
	}
	
	public static <T extends IAabb2WF> T scaleFromPivot(float[] aabbMin, IVec2RF aabbMax, IVec2RF pivot, float[] scale, @ExtractionParam T res)
	{
		float aabbMinX = aabbMin[0];
		float aabbMinY = aabbMin[1];
		float aabbMaxX = aabbMax.x();
		float aabbMaxY = aabbMax.y();
		
		float pivotX = pivot.x();
		float pivotY = pivot.y();
		
		float scaleX = scale[0];
		float scaleY = scale[1];
		
		float scaledMinX = MathUtils.fma(scaleX, aabbMinX - pivotX, pivotX);
		float scaledMinY = MathUtils.fma(scaleY, aabbMinY - pivotY, pivotY);
		float scaledMaxX = MathUtils.fma(scaleX, aabbMaxX - pivotX, pivotX);
		float scaledMaxY = MathUtils.fma(scaleY, aabbMaxY - pivotY, pivotY);
		
		float newMinX = MathUtils.min(scaledMinX, scaledMaxX);
		float newMinY = MathUtils.min(scaledMinY, scaledMaxY);
		float newMaxX = MathUtils.max(scaledMinX, scaledMaxX);
		float newMaxY = MathUtils.max(scaledMinY, scaledMaxY);
		
		res.set(newMinX, newMinY, newMaxX, newMaxY);
		
		return res;
	}
	
	public static <T extends IAabb2WF> T scaleFromPivot(float[] aabbMin, IVec2RF aabbMax, IVec2RF pivot, float scaleX, float scaleY, @ExtractionParam T res)
	{
		float aabbMinX = aabbMin[0];
		float aabbMinY = aabbMin[1];
		float aabbMaxX = aabbMax.x();
		float aabbMaxY = aabbMax.y();
		
		float pivotX = pivot.x();
		float pivotY = pivot.y();
		
		float scaledMinX = MathUtils.fma(scaleX, aabbMinX - pivotX, pivotX);
		float scaledMinY = MathUtils.fma(scaleY, aabbMinY - pivotY, pivotY);
		float scaledMaxX = MathUtils.fma(scaleX, aabbMaxX - pivotX, pivotX);
		float scaledMaxY = MathUtils.fma(scaleY, aabbMaxY - pivotY, pivotY);
		
		float newMinX = MathUtils.min(scaledMinX, scaledMaxX);
		float newMinY = MathUtils.min(scaledMinY, scaledMaxY);
		float newMaxX = MathUtils.max(scaledMinX, scaledMaxX);
		float newMaxY = MathUtils.max(scaledMinY, scaledMaxY);
		
		res.set(newMinX, newMinY, newMaxX, newMaxY);
		
		return res;
	}
	
	public static <T extends IAabb2WF> T scaleFromPivot(float[] aabbMin, IVec2RF aabbMax, float[] pivot, IVec2RF scale, @ExtractionParam T res)
	{
		float aabbMinX = aabbMin[0];
		float aabbMinY = aabbMin[1];
		float aabbMaxX = aabbMax.x();
		float aabbMaxY = aabbMax.y();
		
		float pivotX = pivot[0];
		float pivotY = pivot[1];
		
		float scaleX = scale.x();
		float scaleY = scale.y();
		
		float scaledMinX = MathUtils.fma(scaleX, aabbMinX - pivotX, pivotX);
		float scaledMinY = MathUtils.fma(scaleY, aabbMinY - pivotY, pivotY);
		float scaledMaxX = MathUtils.fma(scaleX, aabbMaxX - pivotX, pivotX);
		float scaledMaxY = MathUtils.fma(scaleY, aabbMaxY - pivotY, pivotY);
		
		float newMinX = MathUtils.min(scaledMinX, scaledMaxX);
		float newMinY = MathUtils.min(scaledMinY, scaledMaxY);
		float newMaxX = MathUtils.max(scaledMinX, scaledMaxX);
		float newMaxY = MathUtils.max(scaledMinY, scaledMaxY);
		
		res.set(newMinX, newMinY, newMaxX, newMaxY);
		
		return res;
	}
	
	public static <T extends IAabb2WF> T scaleFromPivot(float[] aabbMin, IVec2RF aabbMax, float[] pivot, float[] scale, @ExtractionParam T res)
	{
		float aabbMinX = aabbMin[0];
		float aabbMinY = aabbMin[1];
		float aabbMaxX = aabbMax.x();
		float aabbMaxY = aabbMax.y();
		
		float pivotX = pivot[0];
		float pivotY = pivot[1];
		
		float scaleX = scale[0];
		float scaleY = scale[1];
		
		float scaledMinX = MathUtils.fma(scaleX, aabbMinX - pivotX, pivotX);
		float scaledMinY = MathUtils.fma(scaleY, aabbMinY - pivotY, pivotY);
		float scaledMaxX = MathUtils.fma(scaleX, aabbMaxX - pivotX, pivotX);
		float scaledMaxY = MathUtils.fma(scaleY, aabbMaxY - pivotY, pivotY);
		
		float newMinX = MathUtils.min(scaledMinX, scaledMaxX);
		float newMinY = MathUtils.min(scaledMinY, scaledMaxY);
		float newMaxX = MathUtils.max(scaledMinX, scaledMaxX);
		float newMaxY = MathUtils.max(scaledMinY, scaledMaxY);
		
		res.set(newMinX, newMinY, newMaxX, newMaxY);
		
		return res;
	}
	
	public static <T extends IAabb2WF> T scaleFromPivot(float[] aabbMin, IVec2RF aabbMax, float[] pivot, float scaleX, float scaleY, @ExtractionParam T res)
	{
		float aabbMinX = aabbMin[0];
		float aabbMinY = aabbMin[1];
		float aabbMaxX = aabbMax.x();
		float aabbMaxY = aabbMax.y();
		
		float pivotX = pivot[0];
		float pivotY = pivot[1];
		
		float scaledMinX = MathUtils.fma(scaleX, aabbMinX - pivotX, pivotX);
		float scaledMinY = MathUtils.fma(scaleY, aabbMinY - pivotY, pivotY);
		float scaledMaxX = MathUtils.fma(scaleX, aabbMaxX - pivotX, pivotX);
		float scaledMaxY = MathUtils.fma(scaleY, aabbMaxY - pivotY, pivotY);
		
		float newMinX = MathUtils.min(scaledMinX, scaledMaxX);
		float newMinY = MathUtils.min(scaledMinY, scaledMaxY);
		float newMaxX = MathUtils.max(scaledMinX, scaledMaxX);
		float newMaxY = MathUtils.max(scaledMinY, scaledMaxY);
		
		res.set(newMinX, newMinY, newMaxX, newMaxY);
		
		return res;
	}
	
	public static <T extends IAabb2WF> T scaleFromPivot(float[] aabbMin, IVec2RF aabbMax, float pivotX, float pivotY, IVec2RF scale, @ExtractionParam T res)
	{
		float aabbMinX = aabbMin[0];
		float aabbMinY = aabbMin[1];
		float aabbMaxX = aabbMax.x();
		float aabbMaxY = aabbMax.y();
		
		float scaleX = scale.x();
		float scaleY = scale.y();
		
		float scaledMinX = MathUtils.fma(scaleX, aabbMinX - pivotX, pivotX);
		float scaledMinY = MathUtils.fma(scaleY, aabbMinY - pivotY, pivotY);
		float scaledMaxX = MathUtils.fma(scaleX, aabbMaxX - pivotX, pivotX);
		float scaledMaxY = MathUtils.fma(scaleY, aabbMaxY - pivotY, pivotY);
		
		float newMinX = MathUtils.min(scaledMinX, scaledMaxX);
		float newMinY = MathUtils.min(scaledMinY, scaledMaxY);
		float newMaxX = MathUtils.max(scaledMinX, scaledMaxX);
		float newMaxY = MathUtils.max(scaledMinY, scaledMaxY);
		
		res.set(newMinX, newMinY, newMaxX, newMaxY);
		
		return res;
	}
	
	public static <T extends IAabb2WF> T scaleFromPivot(float[] aabbMin, IVec2RF aabbMax, float pivotX, float pivotY, float[] scale, @ExtractionParam T res)
	{
		float aabbMinX = aabbMin[0];
		float aabbMinY = aabbMin[1];
		float aabbMaxX = aabbMax.x();
		float aabbMaxY = aabbMax.y();
		
		float scaleX = scale[0];
		float scaleY = scale[1];
		
		float scaledMinX = MathUtils.fma(scaleX, aabbMinX - pivotX, pivotX);
		float scaledMinY = MathUtils.fma(scaleY, aabbMinY - pivotY, pivotY);
		float scaledMaxX = MathUtils.fma(scaleX, aabbMaxX - pivotX, pivotX);
		float scaledMaxY = MathUtils.fma(scaleY, aabbMaxY - pivotY, pivotY);
		
		float newMinX = MathUtils.min(scaledMinX, scaledMaxX);
		float newMinY = MathUtils.min(scaledMinY, scaledMaxY);
		float newMaxX = MathUtils.max(scaledMinX, scaledMaxX);
		float newMaxY = MathUtils.max(scaledMinY, scaledMaxY);
		
		res.set(newMinX, newMinY, newMaxX, newMaxY);
		
		return res;
	}
	
	public static <T extends IAabb2WF> T scaleFromPivot(float[] aabbMin, IVec2RF aabbMax, float pivotX, float pivotY, float scaleX, float scaleY, @ExtractionParam T res)
	{
		float aabbMinX = aabbMin[0];
		float aabbMinY = aabbMin[1];
		float aabbMaxX = aabbMax.x();
		float aabbMaxY = aabbMax.y();
		
		float scaledMinX = MathUtils.fma(scaleX, aabbMinX - pivotX, pivotX);
		float scaledMinY = MathUtils.fma(scaleY, aabbMinY - pivotY, pivotY);
		float scaledMaxX = MathUtils.fma(scaleX, aabbMaxX - pivotX, pivotX);
		float scaledMaxY = MathUtils.fma(scaleY, aabbMaxY - pivotY, pivotY);
		
		float newMinX = MathUtils.min(scaledMinX, scaledMaxX);
		float newMinY = MathUtils.min(scaledMinY, scaledMaxY);
		float newMaxX = MathUtils.max(scaledMinX, scaledMaxX);
		float newMaxY = MathUtils.max(scaledMinY, scaledMaxY);
		
		res.set(newMinX, newMinY, newMaxX, newMaxY);
		
		return res;
	}
	
	public static <T extends IAabb2WF> T scaleFromPivot(float[] aabbMin, float[] aabbMax, IVec2RF pivot, IVec2RF scale, @ExtractionParam T res)
	{
		float aabbMinX = aabbMin[0];
		float aabbMinY = aabbMin[1];
		float aabbMaxX = aabbMax[0];
		float aabbMaxY = aabbMax[1];
		
		float pivotX = pivot.x();
		float pivotY = pivot.y();
		
		float scaleX = scale.x();
		float scaleY = scale.y();
		
		float scaledMinX = MathUtils.fma(scaleX, aabbMinX - pivotX, pivotX);
		float scaledMinY = MathUtils.fma(scaleY, aabbMinY - pivotY, pivotY);
		float scaledMaxX = MathUtils.fma(scaleX, aabbMaxX - pivotX, pivotX);
		float scaledMaxY = MathUtils.fma(scaleY, aabbMaxY - pivotY, pivotY);
		
		float newMinX = MathUtils.min(scaledMinX, scaledMaxX);
		float newMinY = MathUtils.min(scaledMinY, scaledMaxY);
		float newMaxX = MathUtils.max(scaledMinX, scaledMaxX);
		float newMaxY = MathUtils.max(scaledMinY, scaledMaxY);
		
		res.set(newMinX, newMinY, newMaxX, newMaxY);
		
		return res;
	}
	
	public static <T extends IAabb2WF> T scaleFromPivot(float[] aabbMin, float[] aabbMax, IVec2RF pivot, float[] scale, @ExtractionParam T res)
	{
		float aabbMinX = aabbMin[0];
		float aabbMinY = aabbMin[1];
		float aabbMaxX = aabbMax[0];
		float aabbMaxY = aabbMax[1];
		
		float pivotX = pivot.x();
		float pivotY = pivot.y();
		
		float scaleX = scale[0];
		float scaleY = scale[1];
		
		float scaledMinX = MathUtils.fma(scaleX, aabbMinX - pivotX, pivotX);
		float scaledMinY = MathUtils.fma(scaleY, aabbMinY - pivotY, pivotY);
		float scaledMaxX = MathUtils.fma(scaleX, aabbMaxX - pivotX, pivotX);
		float scaledMaxY = MathUtils.fma(scaleY, aabbMaxY - pivotY, pivotY);
		
		float newMinX = MathUtils.min(scaledMinX, scaledMaxX);
		float newMinY = MathUtils.min(scaledMinY, scaledMaxY);
		float newMaxX = MathUtils.max(scaledMinX, scaledMaxX);
		float newMaxY = MathUtils.max(scaledMinY, scaledMaxY);
		
		res.set(newMinX, newMinY, newMaxX, newMaxY);
		
		return res;
	}
	
	public static <T extends IAabb2WF> T scaleFromPivot(float[] aabbMin, float[] aabbMax, IVec2RF pivot, float scaleX, float scaleY, @ExtractionParam T res)
	{
		float aabbMinX = aabbMin[0];
		float aabbMinY = aabbMin[1];
		float aabbMaxX = aabbMax[0];
		float aabbMaxY = aabbMax[1];
		
		float pivotX = pivot.x();
		float pivotY = pivot.y();
		
		float scaledMinX = MathUtils.fma(scaleX, aabbMinX - pivotX, pivotX);
		float scaledMinY = MathUtils.fma(scaleY, aabbMinY - pivotY, pivotY);
		float scaledMaxX = MathUtils.fma(scaleX, aabbMaxX - pivotX, pivotX);
		float scaledMaxY = MathUtils.fma(scaleY, aabbMaxY - pivotY, pivotY);
		
		float newMinX = MathUtils.min(scaledMinX, scaledMaxX);
		float newMinY = MathUtils.min(scaledMinY, scaledMaxY);
		float newMaxX = MathUtils.max(scaledMinX, scaledMaxX);
		float newMaxY = MathUtils.max(scaledMinY, scaledMaxY);
		
		res.set(newMinX, newMinY, newMaxX, newMaxY);
		
		return res;
	}
	
	public static <T extends IAabb2WF> T scaleFromPivot(float[] aabbMin, float[] aabbMax, float[] pivot, IVec2RF scale, @ExtractionParam T res)
	{
		float aabbMinX = aabbMin[0];
		float aabbMinY = aabbMin[1];
		float aabbMaxX = aabbMax[0];
		float aabbMaxY = aabbMax[1];
		
		float pivotX = pivot[0];
		float pivotY = pivot[1];
		
		float scaleX = scale.x();
		float scaleY = scale.y();
		
		float scaledMinX = MathUtils.fma(scaleX, aabbMinX - pivotX, pivotX);
		float scaledMinY = MathUtils.fma(scaleY, aabbMinY - pivotY, pivotY);
		float scaledMaxX = MathUtils.fma(scaleX, aabbMaxX - pivotX, pivotX);
		float scaledMaxY = MathUtils.fma(scaleY, aabbMaxY - pivotY, pivotY);
		
		float newMinX = MathUtils.min(scaledMinX, scaledMaxX);
		float newMinY = MathUtils.min(scaledMinY, scaledMaxY);
		float newMaxX = MathUtils.max(scaledMinX, scaledMaxX);
		float newMaxY = MathUtils.max(scaledMinY, scaledMaxY);
		
		res.set(newMinX, newMinY, newMaxX, newMaxY);
		
		return res;
	}
	
	public static <T extends IAabb2WF> T scaleFromPivot(float[] aabbMin, float[] aabbMax, float[] pivot, float[] scale, @ExtractionParam T res)
	{
		float aabbMinX = aabbMin[0];
		float aabbMinY = aabbMin[1];
		float aabbMaxX = aabbMax[0];
		float aabbMaxY = aabbMax[1];
		
		float pivotX = pivot[0];
		float pivotY = pivot[1];
		
		float scaleX = scale[0];
		float scaleY = scale[1];
		
		float scaledMinX = MathUtils.fma(scaleX, aabbMinX - pivotX, pivotX);
		float scaledMinY = MathUtils.fma(scaleY, aabbMinY - pivotY, pivotY);
		float scaledMaxX = MathUtils.fma(scaleX, aabbMaxX - pivotX, pivotX);
		float scaledMaxY = MathUtils.fma(scaleY, aabbMaxY - pivotY, pivotY);
		
		float newMinX = MathUtils.min(scaledMinX, scaledMaxX);
		float newMinY = MathUtils.min(scaledMinY, scaledMaxY);
		float newMaxX = MathUtils.max(scaledMinX, scaledMaxX);
		float newMaxY = MathUtils.max(scaledMinY, scaledMaxY);
		
		res.set(newMinX, newMinY, newMaxX, newMaxY);
		
		return res;
	}
	
	public static <T extends IAabb2WF> T scaleFromPivot(float[] aabbMin, float[] aabbMax, float[] pivot, float scaleX, float scaleY, @ExtractionParam T res)
	{
		float aabbMinX = aabbMin[0];
		float aabbMinY = aabbMin[1];
		float aabbMaxX = aabbMax[0];
		float aabbMaxY = aabbMax[1];
		
		float pivotX = pivot[0];
		float pivotY = pivot[1];
		
		float scaledMinX = MathUtils.fma(scaleX, aabbMinX - pivotX, pivotX);
		float scaledMinY = MathUtils.fma(scaleY, aabbMinY - pivotY, pivotY);
		float scaledMaxX = MathUtils.fma(scaleX, aabbMaxX - pivotX, pivotX);
		float scaledMaxY = MathUtils.fma(scaleY, aabbMaxY - pivotY, pivotY);
		
		float newMinX = MathUtils.min(scaledMinX, scaledMaxX);
		float newMinY = MathUtils.min(scaledMinY, scaledMaxY);
		float newMaxX = MathUtils.max(scaledMinX, scaledMaxX);
		float newMaxY = MathUtils.max(scaledMinY, scaledMaxY);
		
		res.set(newMinX, newMinY, newMaxX, newMaxY);
		
		return res;
	}
	
	public static <T extends IAabb2WF> T scaleFromPivot(float[] aabbMin, float[] aabbMax, float pivotX, float pivotY, IVec2RF scale, @ExtractionParam T res)
	{
		float aabbMinX = aabbMin[0];
		float aabbMinY = aabbMin[1];
		float aabbMaxX = aabbMax[0];
		float aabbMaxY = aabbMax[1];
		
		float scaleX = scale.x();
		float scaleY = scale.y();
		
		float scaledMinX = MathUtils.fma(scaleX, aabbMinX - pivotX, pivotX);
		float scaledMinY = MathUtils.fma(scaleY, aabbMinY - pivotY, pivotY);
		float scaledMaxX = MathUtils.fma(scaleX, aabbMaxX - pivotX, pivotX);
		float scaledMaxY = MathUtils.fma(scaleY, aabbMaxY - pivotY, pivotY);
		
		float newMinX = MathUtils.min(scaledMinX, scaledMaxX);
		float newMinY = MathUtils.min(scaledMinY, scaledMaxY);
		float newMaxX = MathUtils.max(scaledMinX, scaledMaxX);
		float newMaxY = MathUtils.max(scaledMinY, scaledMaxY);
		
		res.set(newMinX, newMinY, newMaxX, newMaxY);
		
		return res;
	}
	
	public static <T extends IAabb2WF> T scaleFromPivot(float[] aabbMin, float[] aabbMax, float pivotX, float pivotY, float[] scale, @ExtractionParam T res)
	{
		float aabbMinX = aabbMin[0];
		float aabbMinY = aabbMin[1];
		float aabbMaxX = aabbMax[0];
		float aabbMaxY = aabbMax[1];
		
		float scaleX = scale[0];
		float scaleY = scale[1];
		
		float scaledMinX = MathUtils.fma(scaleX, aabbMinX - pivotX, pivotX);
		float scaledMinY = MathUtils.fma(scaleY, aabbMinY - pivotY, pivotY);
		float scaledMaxX = MathUtils.fma(scaleX, aabbMaxX - pivotX, pivotX);
		float scaledMaxY = MathUtils.fma(scaleY, aabbMaxY - pivotY, pivotY);
		
		float newMinX = MathUtils.min(scaledMinX, scaledMaxX);
		float newMinY = MathUtils.min(scaledMinY, scaledMaxY);
		float newMaxX = MathUtils.max(scaledMinX, scaledMaxX);
		float newMaxY = MathUtils.max(scaledMinY, scaledMaxY);
		
		res.set(newMinX, newMinY, newMaxX, newMaxY);
		
		return res;
	}
	
	public static <T extends IAabb2WF> T scaleFromPivot(float[] aabbMin, float[] aabbMax, float pivotX, float pivotY, float scaleX, float scaleY, @ExtractionParam T res)
	{
		float aabbMinX = aabbMin[0];
		float aabbMinY = aabbMin[1];
		float aabbMaxX = aabbMax[0];
		float aabbMaxY = aabbMax[1];
		
		float scaledMinX = MathUtils.fma(scaleX, aabbMinX - pivotX, pivotX);
		float scaledMinY = MathUtils.fma(scaleY, aabbMinY - pivotY, pivotY);
		float scaledMaxX = MathUtils.fma(scaleX, aabbMaxX - pivotX, pivotX);
		float scaledMaxY = MathUtils.fma(scaleY, aabbMaxY - pivotY, pivotY);
		
		float newMinX = MathUtils.min(scaledMinX, scaledMaxX);
		float newMinY = MathUtils.min(scaledMinY, scaledMaxY);
		float newMaxX = MathUtils.max(scaledMinX, scaledMaxX);
		float newMaxY = MathUtils.max(scaledMinY, scaledMaxY);
		
		res.set(newMinX, newMinY, newMaxX, newMaxY);
		
		return res;
	}
	
	public static <T extends IAabb2WF> T scaleFromPivot(float[] aabbMin, float aabbMaxX, float aabbMaxY, IVec2RF pivot, IVec2RF scale, @ExtractionParam T res)
	{
		float aabbMinX = aabbMin[0];
		float aabbMinY = aabbMin[1];
		
		float pivotX = pivot.x();
		float pivotY = pivot.y();
		
		float scaleX = scale.x();
		float scaleY = scale.y();
		
		float scaledMinX = MathUtils.fma(scaleX, aabbMinX - pivotX, pivotX);
		float scaledMinY = MathUtils.fma(scaleY, aabbMinY - pivotY, pivotY);
		float scaledMaxX = MathUtils.fma(scaleX, aabbMaxX - pivotX, pivotX);
		float scaledMaxY = MathUtils.fma(scaleY, aabbMaxY - pivotY, pivotY);
		
		float newMinX = MathUtils.min(scaledMinX, scaledMaxX);
		float newMinY = MathUtils.min(scaledMinY, scaledMaxY);
		float newMaxX = MathUtils.max(scaledMinX, scaledMaxX);
		float newMaxY = MathUtils.max(scaledMinY, scaledMaxY);
		
		res.set(newMinX, newMinY, newMaxX, newMaxY);
		
		return res;
	}
	
	public static <T extends IAabb2WF> T scaleFromPivot(float[] aabbMin, float aabbMaxX, float aabbMaxY, IVec2RF pivot, float[] scale, @ExtractionParam T res)
	{
		float aabbMinX = aabbMin[0];
		float aabbMinY = aabbMin[1];
		
		float pivotX = pivot.x();
		float pivotY = pivot.y();
		
		float scaleX = scale[0];
		float scaleY = scale[1];
		
		float scaledMinX = MathUtils.fma(scaleX, aabbMinX - pivotX, pivotX);
		float scaledMinY = MathUtils.fma(scaleY, aabbMinY - pivotY, pivotY);
		float scaledMaxX = MathUtils.fma(scaleX, aabbMaxX - pivotX, pivotX);
		float scaledMaxY = MathUtils.fma(scaleY, aabbMaxY - pivotY, pivotY);
		
		float newMinX = MathUtils.min(scaledMinX, scaledMaxX);
		float newMinY = MathUtils.min(scaledMinY, scaledMaxY);
		float newMaxX = MathUtils.max(scaledMinX, scaledMaxX);
		float newMaxY = MathUtils.max(scaledMinY, scaledMaxY);
		
		res.set(newMinX, newMinY, newMaxX, newMaxY);
		
		return res;
	}
	
	public static <T extends IAabb2WF> T scaleFromPivot(float[] aabbMin, float aabbMaxX, float aabbMaxY, IVec2RF pivot, float scaleX, float scaleY, @ExtractionParam T res)
	{
		float aabbMinX = aabbMin[0];
		float aabbMinY = aabbMin[1];
		
		float pivotX = pivot.x();
		float pivotY = pivot.y();
		
		float scaledMinX = MathUtils.fma(scaleX, aabbMinX - pivotX, pivotX);
		float scaledMinY = MathUtils.fma(scaleY, aabbMinY - pivotY, pivotY);
		float scaledMaxX = MathUtils.fma(scaleX, aabbMaxX - pivotX, pivotX);
		float scaledMaxY = MathUtils.fma(scaleY, aabbMaxY - pivotY, pivotY);
		
		float newMinX = MathUtils.min(scaledMinX, scaledMaxX);
		float newMinY = MathUtils.min(scaledMinY, scaledMaxY);
		float newMaxX = MathUtils.max(scaledMinX, scaledMaxX);
		float newMaxY = MathUtils.max(scaledMinY, scaledMaxY);
		
		res.set(newMinX, newMinY, newMaxX, newMaxY);
		
		return res;
	}
	
	public static <T extends IAabb2WF> T scaleFromPivot(float[] aabbMin, float aabbMaxX, float aabbMaxY, float[] pivot, IVec2RF scale, @ExtractionParam T res)
	{
		float aabbMinX = aabbMin[0];
		float aabbMinY = aabbMin[1];
		
		float pivotX = pivot[0];
		float pivotY = pivot[1];
		
		float scaleX = scale.x();
		float scaleY = scale.y();
		
		float scaledMinX = MathUtils.fma(scaleX, aabbMinX - pivotX, pivotX);
		float scaledMinY = MathUtils.fma(scaleY, aabbMinY - pivotY, pivotY);
		float scaledMaxX = MathUtils.fma(scaleX, aabbMaxX - pivotX, pivotX);
		float scaledMaxY = MathUtils.fma(scaleY, aabbMaxY - pivotY, pivotY);
		
		float newMinX = MathUtils.min(scaledMinX, scaledMaxX);
		float newMinY = MathUtils.min(scaledMinY, scaledMaxY);
		float newMaxX = MathUtils.max(scaledMinX, scaledMaxX);
		float newMaxY = MathUtils.max(scaledMinY, scaledMaxY);
		
		res.set(newMinX, newMinY, newMaxX, newMaxY);
		
		return res;
	}
	
	public static <T extends IAabb2WF> T scaleFromPivot(float[] aabbMin, float aabbMaxX, float aabbMaxY, float[] pivot, float[] scale, @ExtractionParam T res)
	{
		float aabbMinX = aabbMin[0];
		float aabbMinY = aabbMin[1];
		
		float pivotX = pivot[0];
		float pivotY = pivot[1];
		
		float scaleX = scale[0];
		float scaleY = scale[1];
		
		float scaledMinX = MathUtils.fma(scaleX, aabbMinX - pivotX, pivotX);
		float scaledMinY = MathUtils.fma(scaleY, aabbMinY - pivotY, pivotY);
		float scaledMaxX = MathUtils.fma(scaleX, aabbMaxX - pivotX, pivotX);
		float scaledMaxY = MathUtils.fma(scaleY, aabbMaxY - pivotY, pivotY);
		
		float newMinX = MathUtils.min(scaledMinX, scaledMaxX);
		float newMinY = MathUtils.min(scaledMinY, scaledMaxY);
		float newMaxX = MathUtils.max(scaledMinX, scaledMaxX);
		float newMaxY = MathUtils.max(scaledMinY, scaledMaxY);
		
		res.set(newMinX, newMinY, newMaxX, newMaxY);
		
		return res;
	}
	
	public static <T extends IAabb2WF> T scaleFromPivot(float[] aabbMin, float aabbMaxX, float aabbMaxY, float[] pivot, float scaleX, float scaleY, @ExtractionParam T res)
	{
		float aabbMinX = aabbMin[0];
		float aabbMinY = aabbMin[1];
		
		float pivotX = pivot[0];
		float pivotY = pivot[1];
		
		float scaledMinX = MathUtils.fma(scaleX, aabbMinX - pivotX, pivotX);
		float scaledMinY = MathUtils.fma(scaleY, aabbMinY - pivotY, pivotY);
		float scaledMaxX = MathUtils.fma(scaleX, aabbMaxX - pivotX, pivotX);
		float scaledMaxY = MathUtils.fma(scaleY, aabbMaxY - pivotY, pivotY);
		
		float newMinX = MathUtils.min(scaledMinX, scaledMaxX);
		float newMinY = MathUtils.min(scaledMinY, scaledMaxY);
		float newMaxX = MathUtils.max(scaledMinX, scaledMaxX);
		float newMaxY = MathUtils.max(scaledMinY, scaledMaxY);
		
		res.set(newMinX, newMinY, newMaxX, newMaxY);
		
		return res;
	}
	
	public static <T extends IAabb2WF> T scaleFromPivot(float[] aabbMin, float aabbMaxX, float aabbMaxY, float pivotX, float pivotY, IVec2RF scale, @ExtractionParam T res)
	{
		float aabbMinX = aabbMin[0];
		float aabbMinY = aabbMin[1];
		
		float scaleX = scale.x();
		float scaleY = scale.y();
		
		float scaledMinX = MathUtils.fma(scaleX, aabbMinX - pivotX, pivotX);
		float scaledMinY = MathUtils.fma(scaleY, aabbMinY - pivotY, pivotY);
		float scaledMaxX = MathUtils.fma(scaleX, aabbMaxX - pivotX, pivotX);
		float scaledMaxY = MathUtils.fma(scaleY, aabbMaxY - pivotY, pivotY);
		
		float newMinX = MathUtils.min(scaledMinX, scaledMaxX);
		float newMinY = MathUtils.min(scaledMinY, scaledMaxY);
		float newMaxX = MathUtils.max(scaledMinX, scaledMaxX);
		float newMaxY = MathUtils.max(scaledMinY, scaledMaxY);
		
		res.set(newMinX, newMinY, newMaxX, newMaxY);
		
		return res;
	}
	
	public static <T extends IAabb2WF> T scaleFromPivot(float[] aabbMin, float aabbMaxX, float aabbMaxY, float pivotX, float pivotY, float[] scale, @ExtractionParam T res)
	{
		float aabbMinX = aabbMin[0];
		float aabbMinY = aabbMin[1];
		
		float scaleX = scale[0];
		float scaleY = scale[1];
		
		float scaledMinX = MathUtils.fma(scaleX, aabbMinX - pivotX, pivotX);
		float scaledMinY = MathUtils.fma(scaleY, aabbMinY - pivotY, pivotY);
		float scaledMaxX = MathUtils.fma(scaleX, aabbMaxX - pivotX, pivotX);
		float scaledMaxY = MathUtils.fma(scaleY, aabbMaxY - pivotY, pivotY);
		
		float newMinX = MathUtils.min(scaledMinX, scaledMaxX);
		float newMinY = MathUtils.min(scaledMinY, scaledMaxY);
		float newMaxX = MathUtils.max(scaledMinX, scaledMaxX);
		float newMaxY = MathUtils.max(scaledMinY, scaledMaxY);
		
		res.set(newMinX, newMinY, newMaxX, newMaxY);
		
		return res;
	}
	
	public static <T extends IAabb2WF> T scaleFromPivot(float[] aabbMin, float aabbMaxX, float aabbMaxY, float pivotX, float pivotY, float scaleX, float scaleY, @ExtractionParam T res)
	{
		float aabbMinX = aabbMin[0];
		float aabbMinY = aabbMin[1];
		
		float scaledMinX = MathUtils.fma(scaleX, aabbMinX - pivotX, pivotX);
		float scaledMinY = MathUtils.fma(scaleY, aabbMinY - pivotY, pivotY);
		float scaledMaxX = MathUtils.fma(scaleX, aabbMaxX - pivotX, pivotX);
		float scaledMaxY = MathUtils.fma(scaleY, aabbMaxY - pivotY, pivotY);
		
		float newMinX = MathUtils.min(scaledMinX, scaledMaxX);
		float newMinY = MathUtils.min(scaledMinY, scaledMaxY);
		float newMaxX = MathUtils.max(scaledMinX, scaledMaxX);
		float newMaxY = MathUtils.max(scaledMinY, scaledMaxY);
		
		res.set(newMinX, newMinY, newMaxX, newMaxY);
		
		return res;
	}
	
	public static <T extends IAabb2WF> T scaleFromPivot(float aabbMinX, float aabbMinY, IVec2RF aabbMax, IVec2RF pivot, IVec2RF scale, @ExtractionParam T res)
	{
		float aabbMaxX = aabbMax.x();
		float aabbMaxY = aabbMax.y();
		
		float pivotX = pivot.x();
		float pivotY = pivot.y();
		
		float scaleX = scale.x();
		float scaleY = scale.y();
		
		float scaledMinX = MathUtils.fma(scaleX, aabbMinX - pivotX, pivotX);
		float scaledMinY = MathUtils.fma(scaleY, aabbMinY - pivotY, pivotY);
		float scaledMaxX = MathUtils.fma(scaleX, aabbMaxX - pivotX, pivotX);
		float scaledMaxY = MathUtils.fma(scaleY, aabbMaxY - pivotY, pivotY);
		
		float newMinX = MathUtils.min(scaledMinX, scaledMaxX);
		float newMinY = MathUtils.min(scaledMinY, scaledMaxY);
		float newMaxX = MathUtils.max(scaledMinX, scaledMaxX);
		float newMaxY = MathUtils.max(scaledMinY, scaledMaxY);
		
		res.set(newMinX, newMinY, newMaxX, newMaxY);
		
		return res;
	}
	
	public static <T extends IAabb2WF> T scaleFromPivot(float aabbMinX, float aabbMinY, IVec2RF aabbMax, IVec2RF pivot, float[] scale, @ExtractionParam T res)
	{
		float aabbMaxX = aabbMax.x();
		float aabbMaxY = aabbMax.y();
		
		float pivotX = pivot.x();
		float pivotY = pivot.y();
		
		float scaleX = scale[0];
		float scaleY = scale[1];
		
		float scaledMinX = MathUtils.fma(scaleX, aabbMinX - pivotX, pivotX);
		float scaledMinY = MathUtils.fma(scaleY, aabbMinY - pivotY, pivotY);
		float scaledMaxX = MathUtils.fma(scaleX, aabbMaxX - pivotX, pivotX);
		float scaledMaxY = MathUtils.fma(scaleY, aabbMaxY - pivotY, pivotY);
		
		float newMinX = MathUtils.min(scaledMinX, scaledMaxX);
		float newMinY = MathUtils.min(scaledMinY, scaledMaxY);
		float newMaxX = MathUtils.max(scaledMinX, scaledMaxX);
		float newMaxY = MathUtils.max(scaledMinY, scaledMaxY);
		
		res.set(newMinX, newMinY, newMaxX, newMaxY);
		
		return res;
	}
	
	public static <T extends IAabb2WF> T scaleFromPivot(float aabbMinX, float aabbMinY, IVec2RF aabbMax, IVec2RF pivot, float scaleX, float scaleY, @ExtractionParam T res)
	{
		float aabbMaxX = aabbMax.x();
		float aabbMaxY = aabbMax.y();
		
		float pivotX = pivot.x();
		float pivotY = pivot.y();
		
		float scaledMinX = MathUtils.fma(scaleX, aabbMinX - pivotX, pivotX);
		float scaledMinY = MathUtils.fma(scaleY, aabbMinY - pivotY, pivotY);
		float scaledMaxX = MathUtils.fma(scaleX, aabbMaxX - pivotX, pivotX);
		float scaledMaxY = MathUtils.fma(scaleY, aabbMaxY - pivotY, pivotY);
		
		float newMinX = MathUtils.min(scaledMinX, scaledMaxX);
		float newMinY = MathUtils.min(scaledMinY, scaledMaxY);
		float newMaxX = MathUtils.max(scaledMinX, scaledMaxX);
		float newMaxY = MathUtils.max(scaledMinY, scaledMaxY);
		
		res.set(newMinX, newMinY, newMaxX, newMaxY);
		
		return res;
	}
	
	public static <T extends IAabb2WF> T scaleFromPivot(float aabbMinX, float aabbMinY, IVec2RF aabbMax, float[] pivot, IVec2RF scale, @ExtractionParam T res)
	{
		float aabbMaxX = aabbMax.x();
		float aabbMaxY = aabbMax.y();
		
		float pivotX = pivot[0];
		float pivotY = pivot[1];
		
		float scaleX = scale.x();
		float scaleY = scale.y();
		
		float scaledMinX = MathUtils.fma(scaleX, aabbMinX - pivotX, pivotX);
		float scaledMinY = MathUtils.fma(scaleY, aabbMinY - pivotY, pivotY);
		float scaledMaxX = MathUtils.fma(scaleX, aabbMaxX - pivotX, pivotX);
		float scaledMaxY = MathUtils.fma(scaleY, aabbMaxY - pivotY, pivotY);
		
		float newMinX = MathUtils.min(scaledMinX, scaledMaxX);
		float newMinY = MathUtils.min(scaledMinY, scaledMaxY);
		float newMaxX = MathUtils.max(scaledMinX, scaledMaxX);
		float newMaxY = MathUtils.max(scaledMinY, scaledMaxY);
		
		res.set(newMinX, newMinY, newMaxX, newMaxY);
		
		return res;
	}
	
	public static <T extends IAabb2WF> T scaleFromPivot(float aabbMinX, float aabbMinY, IVec2RF aabbMax, float[] pivot, float[] scale, @ExtractionParam T res)
	{
		float aabbMaxX = aabbMax.x();
		float aabbMaxY = aabbMax.y();
		
		float pivotX = pivot[0];
		float pivotY = pivot[1];
		
		float scaleX = scale[0];
		float scaleY = scale[1];
		
		float scaledMinX = MathUtils.fma(scaleX, aabbMinX - pivotX, pivotX);
		float scaledMinY = MathUtils.fma(scaleY, aabbMinY - pivotY, pivotY);
		float scaledMaxX = MathUtils.fma(scaleX, aabbMaxX - pivotX, pivotX);
		float scaledMaxY = MathUtils.fma(scaleY, aabbMaxY - pivotY, pivotY);
		
		float newMinX = MathUtils.min(scaledMinX, scaledMaxX);
		float newMinY = MathUtils.min(scaledMinY, scaledMaxY);
		float newMaxX = MathUtils.max(scaledMinX, scaledMaxX);
		float newMaxY = MathUtils.max(scaledMinY, scaledMaxY);
		
		res.set(newMinX, newMinY, newMaxX, newMaxY);
		
		return res;
	}
	
	public static <T extends IAabb2WF> T scaleFromPivot(float aabbMinX, float aabbMinY, IVec2RF aabbMax, float[] pivot, float scaleX, float scaleY, @ExtractionParam T res)
	{
		float aabbMaxX = aabbMax.x();
		float aabbMaxY = aabbMax.y();
		
		float pivotX = pivot[0];
		float pivotY = pivot[1];
		
		float scaledMinX = MathUtils.fma(scaleX, aabbMinX - pivotX, pivotX);
		float scaledMinY = MathUtils.fma(scaleY, aabbMinY - pivotY, pivotY);
		float scaledMaxX = MathUtils.fma(scaleX, aabbMaxX - pivotX, pivotX);
		float scaledMaxY = MathUtils.fma(scaleY, aabbMaxY - pivotY, pivotY);
		
		float newMinX = MathUtils.min(scaledMinX, scaledMaxX);
		float newMinY = MathUtils.min(scaledMinY, scaledMaxY);
		float newMaxX = MathUtils.max(scaledMinX, scaledMaxX);
		float newMaxY = MathUtils.max(scaledMinY, scaledMaxY);
		
		res.set(newMinX, newMinY, newMaxX, newMaxY);
		
		return res;
	}
	
	public static <T extends IAabb2WF> T scaleFromPivot(float aabbMinX, float aabbMinY, IVec2RF aabbMax, float pivotX, float pivotY, IVec2RF scale, @ExtractionParam T res)
	{
		float aabbMaxX = aabbMax.x();
		float aabbMaxY = aabbMax.y();
		
		float scaleX = scale.x();
		float scaleY = scale.y();
		
		float scaledMinX = MathUtils.fma(scaleX, aabbMinX - pivotX, pivotX);
		float scaledMinY = MathUtils.fma(scaleY, aabbMinY - pivotY, pivotY);
		float scaledMaxX = MathUtils.fma(scaleX, aabbMaxX - pivotX, pivotX);
		float scaledMaxY = MathUtils.fma(scaleY, aabbMaxY - pivotY, pivotY);
		
		float newMinX = MathUtils.min(scaledMinX, scaledMaxX);
		float newMinY = MathUtils.min(scaledMinY, scaledMaxY);
		float newMaxX = MathUtils.max(scaledMinX, scaledMaxX);
		float newMaxY = MathUtils.max(scaledMinY, scaledMaxY);
		
		res.set(newMinX, newMinY, newMaxX, newMaxY);
		
		return res;
	}
	
	public static <T extends IAabb2WF> T scaleFromPivot(float aabbMinX, float aabbMinY, IVec2RF aabbMax, float pivotX, float pivotY, float[] scale, @ExtractionParam T res)
	{
		float aabbMaxX = aabbMax.x();
		float aabbMaxY = aabbMax.y();
		
		float scaleX = scale[0];
		float scaleY = scale[1];
		
		float scaledMinX = MathUtils.fma(scaleX, aabbMinX - pivotX, pivotX);
		float scaledMinY = MathUtils.fma(scaleY, aabbMinY - pivotY, pivotY);
		float scaledMaxX = MathUtils.fma(scaleX, aabbMaxX - pivotX, pivotX);
		float scaledMaxY = MathUtils.fma(scaleY, aabbMaxY - pivotY, pivotY);
		
		float newMinX = MathUtils.min(scaledMinX, scaledMaxX);
		float newMinY = MathUtils.min(scaledMinY, scaledMaxY);
		float newMaxX = MathUtils.max(scaledMinX, scaledMaxX);
		float newMaxY = MathUtils.max(scaledMinY, scaledMaxY);
		
		res.set(newMinX, newMinY, newMaxX, newMaxY);
		
		return res;
	}
	
	public static <T extends IAabb2WF> T scaleFromPivot(float aabbMinX, float aabbMinY, IVec2RF aabbMax, float pivotX, float pivotY, float scaleX, float scaleY, @ExtractionParam T res)
	{
		float aabbMaxX = aabbMax.x();
		float aabbMaxY = aabbMax.y();
		
		float scaledMinX = MathUtils.fma(scaleX, aabbMinX - pivotX, pivotX);
		float scaledMinY = MathUtils.fma(scaleY, aabbMinY - pivotY, pivotY);
		float scaledMaxX = MathUtils.fma(scaleX, aabbMaxX - pivotX, pivotX);
		float scaledMaxY = MathUtils.fma(scaleY, aabbMaxY - pivotY, pivotY);
		
		float newMinX = MathUtils.min(scaledMinX, scaledMaxX);
		float newMinY = MathUtils.min(scaledMinY, scaledMaxY);
		float newMaxX = MathUtils.max(scaledMinX, scaledMaxX);
		float newMaxY = MathUtils.max(scaledMinY, scaledMaxY);
		
		res.set(newMinX, newMinY, newMaxX, newMaxY);
		
		return res;
	}
	
	public static <T extends IAabb2WF> T scaleFromPivot(float aabbMinX, float aabbMinY, float[] aabbMax, IVec2RF pivot, IVec2RF scale, @ExtractionParam T res)
	{
		float aabbMaxX = aabbMax[0];
		float aabbMaxY = aabbMax[1];
		
		float pivotX = pivot.x();
		float pivotY = pivot.y();
		
		float scaleX = scale.x();
		float scaleY = scale.y();
		
		float scaledMinX = MathUtils.fma(scaleX, aabbMinX - pivotX, pivotX);
		float scaledMinY = MathUtils.fma(scaleY, aabbMinY - pivotY, pivotY);
		float scaledMaxX = MathUtils.fma(scaleX, aabbMaxX - pivotX, pivotX);
		float scaledMaxY = MathUtils.fma(scaleY, aabbMaxY - pivotY, pivotY);
		
		float newMinX = MathUtils.min(scaledMinX, scaledMaxX);
		float newMinY = MathUtils.min(scaledMinY, scaledMaxY);
		float newMaxX = MathUtils.max(scaledMinX, scaledMaxX);
		float newMaxY = MathUtils.max(scaledMinY, scaledMaxY);
		
		res.set(newMinX, newMinY, newMaxX, newMaxY);
		
		return res;
	}
	
	public static <T extends IAabb2WF> T scaleFromPivot(float aabbMinX, float aabbMinY, float[] aabbMax, IVec2RF pivot, float[] scale, @ExtractionParam T res)
	{
		float aabbMaxX = aabbMax[0];
		float aabbMaxY = aabbMax[1];
		
		float pivotX = pivot.x();
		float pivotY = pivot.y();
		
		float scaleX = scale[0];
		float scaleY = scale[1];
		
		float scaledMinX = MathUtils.fma(scaleX, aabbMinX - pivotX, pivotX);
		float scaledMinY = MathUtils.fma(scaleY, aabbMinY - pivotY, pivotY);
		float scaledMaxX = MathUtils.fma(scaleX, aabbMaxX - pivotX, pivotX);
		float scaledMaxY = MathUtils.fma(scaleY, aabbMaxY - pivotY, pivotY);
		
		float newMinX = MathUtils.min(scaledMinX, scaledMaxX);
		float newMinY = MathUtils.min(scaledMinY, scaledMaxY);
		float newMaxX = MathUtils.max(scaledMinX, scaledMaxX);
		float newMaxY = MathUtils.max(scaledMinY, scaledMaxY);
		
		res.set(newMinX, newMinY, newMaxX, newMaxY);
		
		return res;
	}
	
	public static <T extends IAabb2WF> T scaleFromPivot(float aabbMinX, float aabbMinY, float[] aabbMax, IVec2RF pivot, float scaleX, float scaleY, @ExtractionParam T res)
	{
		float aabbMaxX = aabbMax[0];
		float aabbMaxY = aabbMax[1];
		
		float pivotX = pivot.x();
		float pivotY = pivot.y();
		
		float scaledMinX = MathUtils.fma(scaleX, aabbMinX - pivotX, pivotX);
		float scaledMinY = MathUtils.fma(scaleY, aabbMinY - pivotY, pivotY);
		float scaledMaxX = MathUtils.fma(scaleX, aabbMaxX - pivotX, pivotX);
		float scaledMaxY = MathUtils.fma(scaleY, aabbMaxY - pivotY, pivotY);
		
		float newMinX = MathUtils.min(scaledMinX, scaledMaxX);
		float newMinY = MathUtils.min(scaledMinY, scaledMaxY);
		float newMaxX = MathUtils.max(scaledMinX, scaledMaxX);
		float newMaxY = MathUtils.max(scaledMinY, scaledMaxY);
		
		res.set(newMinX, newMinY, newMaxX, newMaxY);
		
		return res;
	}
	
	public static <T extends IAabb2WF> T scaleFromPivot(float aabbMinX, float aabbMinY, float[] aabbMax, float[] pivot, IVec2RF scale, @ExtractionParam T res)
	{
		float aabbMaxX = aabbMax[0];
		float aabbMaxY = aabbMax[1];
		
		float pivotX = pivot[0];
		float pivotY = pivot[1];
		
		float scaleX = scale.x();
		float scaleY = scale.y();
		
		float scaledMinX = MathUtils.fma(scaleX, aabbMinX - pivotX, pivotX);
		float scaledMinY = MathUtils.fma(scaleY, aabbMinY - pivotY, pivotY);
		float scaledMaxX = MathUtils.fma(scaleX, aabbMaxX - pivotX, pivotX);
		float scaledMaxY = MathUtils.fma(scaleY, aabbMaxY - pivotY, pivotY);
		
		float newMinX = MathUtils.min(scaledMinX, scaledMaxX);
		float newMinY = MathUtils.min(scaledMinY, scaledMaxY);
		float newMaxX = MathUtils.max(scaledMinX, scaledMaxX);
		float newMaxY = MathUtils.max(scaledMinY, scaledMaxY);
		
		res.set(newMinX, newMinY, newMaxX, newMaxY);
		
		return res;
	}
	
	public static <T extends IAabb2WF> T scaleFromPivot(float aabbMinX, float aabbMinY, float[] aabbMax, float[] pivot, float[] scale, @ExtractionParam T res)
	{
		float aabbMaxX = aabbMax[0];
		float aabbMaxY = aabbMax[1];
		
		float pivotX = pivot[0];
		float pivotY = pivot[1];
		
		float scaleX = scale[0];
		float scaleY = scale[1];
		
		float scaledMinX = MathUtils.fma(scaleX, aabbMinX - pivotX, pivotX);
		float scaledMinY = MathUtils.fma(scaleY, aabbMinY - pivotY, pivotY);
		float scaledMaxX = MathUtils.fma(scaleX, aabbMaxX - pivotX, pivotX);
		float scaledMaxY = MathUtils.fma(scaleY, aabbMaxY - pivotY, pivotY);
		
		float newMinX = MathUtils.min(scaledMinX, scaledMaxX);
		float newMinY = MathUtils.min(scaledMinY, scaledMaxY);
		float newMaxX = MathUtils.max(scaledMinX, scaledMaxX);
		float newMaxY = MathUtils.max(scaledMinY, scaledMaxY);
		
		res.set(newMinX, newMinY, newMaxX, newMaxY);
		
		return res;
	}
	
	public static <T extends IAabb2WF> T scaleFromPivot(float aabbMinX, float aabbMinY, float[] aabbMax, float[] pivot, float scaleX, float scaleY, @ExtractionParam T res)
	{
		float aabbMaxX = aabbMax[0];
		float aabbMaxY = aabbMax[1];
		
		float pivotX = pivot[0];
		float pivotY = pivot[1];
		
		float scaledMinX = MathUtils.fma(scaleX, aabbMinX - pivotX, pivotX);
		float scaledMinY = MathUtils.fma(scaleY, aabbMinY - pivotY, pivotY);
		float scaledMaxX = MathUtils.fma(scaleX, aabbMaxX - pivotX, pivotX);
		float scaledMaxY = MathUtils.fma(scaleY, aabbMaxY - pivotY, pivotY);
		
		float newMinX = MathUtils.min(scaledMinX, scaledMaxX);
		float newMinY = MathUtils.min(scaledMinY, scaledMaxY);
		float newMaxX = MathUtils.max(scaledMinX, scaledMaxX);
		float newMaxY = MathUtils.max(scaledMinY, scaledMaxY);
		
		res.set(newMinX, newMinY, newMaxX, newMaxY);
		
		return res;
	}
	
	public static <T extends IAabb2WF> T scaleFromPivot(float aabbMinX, float aabbMinY, float[] aabbMax, float pivotX, float pivotY, IVec2RF scale, @ExtractionParam T res)
	{
		float aabbMaxX = aabbMax[0];
		float aabbMaxY = aabbMax[1];
		
		float scaleX = scale.x();
		float scaleY = scale.y();
		
		float scaledMinX = MathUtils.fma(scaleX, aabbMinX - pivotX, pivotX);
		float scaledMinY = MathUtils.fma(scaleY, aabbMinY - pivotY, pivotY);
		float scaledMaxX = MathUtils.fma(scaleX, aabbMaxX - pivotX, pivotX);
		float scaledMaxY = MathUtils.fma(scaleY, aabbMaxY - pivotY, pivotY);
		
		float newMinX = MathUtils.min(scaledMinX, scaledMaxX);
		float newMinY = MathUtils.min(scaledMinY, scaledMaxY);
		float newMaxX = MathUtils.max(scaledMinX, scaledMaxX);
		float newMaxY = MathUtils.max(scaledMinY, scaledMaxY);
		
		res.set(newMinX, newMinY, newMaxX, newMaxY);
		
		return res;
	}
	
	public static <T extends IAabb2WF> T scaleFromPivot(float aabbMinX, float aabbMinY, float[] aabbMax, float pivotX, float pivotY, float[] scale, @ExtractionParam T res)
	{
		float aabbMaxX = aabbMax[0];
		float aabbMaxY = aabbMax[1];
		
		float scaleX = scale[0];
		float scaleY = scale[1];
		
		float scaledMinX = MathUtils.fma(scaleX, aabbMinX - pivotX, pivotX);
		float scaledMinY = MathUtils.fma(scaleY, aabbMinY - pivotY, pivotY);
		float scaledMaxX = MathUtils.fma(scaleX, aabbMaxX - pivotX, pivotX);
		float scaledMaxY = MathUtils.fma(scaleY, aabbMaxY - pivotY, pivotY);
		
		float newMinX = MathUtils.min(scaledMinX, scaledMaxX);
		float newMinY = MathUtils.min(scaledMinY, scaledMaxY);
		float newMaxX = MathUtils.max(scaledMinX, scaledMaxX);
		float newMaxY = MathUtils.max(scaledMinY, scaledMaxY);
		
		res.set(newMinX, newMinY, newMaxX, newMaxY);
		
		return res;
	}
	
	public static <T extends IAabb2WF> T scaleFromPivot(float aabbMinX, float aabbMinY, float[] aabbMax, float pivotX, float pivotY, float scaleX, float scaleY, @ExtractionParam T res)
	{
		float aabbMaxX = aabbMax[0];
		float aabbMaxY = aabbMax[1];
		
		float scaledMinX = MathUtils.fma(scaleX, aabbMinX - pivotX, pivotX);
		float scaledMinY = MathUtils.fma(scaleY, aabbMinY - pivotY, pivotY);
		float scaledMaxX = MathUtils.fma(scaleX, aabbMaxX - pivotX, pivotX);
		float scaledMaxY = MathUtils.fma(scaleY, aabbMaxY - pivotY, pivotY);
		
		float newMinX = MathUtils.min(scaledMinX, scaledMaxX);
		float newMinY = MathUtils.min(scaledMinY, scaledMaxY);
		float newMaxX = MathUtils.max(scaledMinX, scaledMaxX);
		float newMaxY = MathUtils.max(scaledMinY, scaledMaxY);
		
		res.set(newMinX, newMinY, newMaxX, newMaxY);
		
		return res;
	}
	
	public static <T extends IAabb2WF> T scaleFromPivot(float aabbMinX, float aabbMinY, float aabbMaxX, float aabbMaxY, IVec2RF pivot, IVec2RF scale, @ExtractionParam T res)
	{
		float pivotX = pivot.x();
		float pivotY = pivot.y();
		
		float scaleX = scale.x();
		float scaleY = scale.y();
		
		float scaledMinX = MathUtils.fma(scaleX, aabbMinX - pivotX, pivotX);
		float scaledMinY = MathUtils.fma(scaleY, aabbMinY - pivotY, pivotY);
		float scaledMaxX = MathUtils.fma(scaleX, aabbMaxX - pivotX, pivotX);
		float scaledMaxY = MathUtils.fma(scaleY, aabbMaxY - pivotY, pivotY);
		
		float newMinX = MathUtils.min(scaledMinX, scaledMaxX);
		float newMinY = MathUtils.min(scaledMinY, scaledMaxY);
		float newMaxX = MathUtils.max(scaledMinX, scaledMaxX);
		float newMaxY = MathUtils.max(scaledMinY, scaledMaxY);
		
		res.set(newMinX, newMinY, newMaxX, newMaxY);
		
		return res;
	}
	
	public static <T extends IAabb2WF> T scaleFromPivot(float aabbMinX, float aabbMinY, float aabbMaxX, float aabbMaxY, IVec2RF pivot, float[] scale, @ExtractionParam T res)
	{
		float pivotX = pivot.x();
		float pivotY = pivot.y();
		
		float scaleX = scale[0];
		float scaleY = scale[1];
		
		float scaledMinX = MathUtils.fma(scaleX, aabbMinX - pivotX, pivotX);
		float scaledMinY = MathUtils.fma(scaleY, aabbMinY - pivotY, pivotY);
		float scaledMaxX = MathUtils.fma(scaleX, aabbMaxX - pivotX, pivotX);
		float scaledMaxY = MathUtils.fma(scaleY, aabbMaxY - pivotY, pivotY);
		
		float newMinX = MathUtils.min(scaledMinX, scaledMaxX);
		float newMinY = MathUtils.min(scaledMinY, scaledMaxY);
		float newMaxX = MathUtils.max(scaledMinX, scaledMaxX);
		float newMaxY = MathUtils.max(scaledMinY, scaledMaxY);
		
		res.set(newMinX, newMinY, newMaxX, newMaxY);
		
		return res;
	}
	
	public static <T extends IAabb2WF> T scaleFromPivot(float aabbMinX, float aabbMinY, float aabbMaxX, float aabbMaxY, IVec2RF pivot, float scaleX, float scaleY, @ExtractionParam T res)
	{
		float pivotX = pivot.x();
		float pivotY = pivot.y();
		
		float scaledMinX = MathUtils.fma(scaleX, aabbMinX - pivotX, pivotX);
		float scaledMinY = MathUtils.fma(scaleY, aabbMinY - pivotY, pivotY);
		float scaledMaxX = MathUtils.fma(scaleX, aabbMaxX - pivotX, pivotX);
		float scaledMaxY = MathUtils.fma(scaleY, aabbMaxY - pivotY, pivotY);
		
		float newMinX = MathUtils.min(scaledMinX, scaledMaxX);
		float newMinY = MathUtils.min(scaledMinY, scaledMaxY);
		float newMaxX = MathUtils.max(scaledMinX, scaledMaxX);
		float newMaxY = MathUtils.max(scaledMinY, scaledMaxY);
		
		res.set(newMinX, newMinY, newMaxX, newMaxY);
		
		return res;
	}
	
	public static <T extends IAabb2WF> T scaleFromPivot(float aabbMinX, float aabbMinY, float aabbMaxX, float aabbMaxY, float[] pivot, IVec2RF scale, @ExtractionParam T res)
	{
		float pivotX = pivot[0];
		float pivotY = pivot[1];
		
		float scaleX = scale.x();
		float scaleY = scale.y();
		
		float scaledMinX = MathUtils.fma(scaleX, aabbMinX - pivotX, pivotX);
		float scaledMinY = MathUtils.fma(scaleY, aabbMinY - pivotY, pivotY);
		float scaledMaxX = MathUtils.fma(scaleX, aabbMaxX - pivotX, pivotX);
		float scaledMaxY = MathUtils.fma(scaleY, aabbMaxY - pivotY, pivotY);
		
		float newMinX = MathUtils.min(scaledMinX, scaledMaxX);
		float newMinY = MathUtils.min(scaledMinY, scaledMaxY);
		float newMaxX = MathUtils.max(scaledMinX, scaledMaxX);
		float newMaxY = MathUtils.max(scaledMinY, scaledMaxY);
		
		res.set(newMinX, newMinY, newMaxX, newMaxY);
		
		return res;
	}
	
	public static <T extends IAabb2WF> T scaleFromPivot(float aabbMinX, float aabbMinY, float aabbMaxX, float aabbMaxY, float[] pivot, float[] scale, @ExtractionParam T res)
	{
		float pivotX = pivot[0];
		float pivotY = pivot[1];
		
		float scaleX = scale[0];
		float scaleY = scale[1];
		
		float scaledMinX = MathUtils.fma(scaleX, aabbMinX - pivotX, pivotX);
		float scaledMinY = MathUtils.fma(scaleY, aabbMinY - pivotY, pivotY);
		float scaledMaxX = MathUtils.fma(scaleX, aabbMaxX - pivotX, pivotX);
		float scaledMaxY = MathUtils.fma(scaleY, aabbMaxY - pivotY, pivotY);
		
		float newMinX = MathUtils.min(scaledMinX, scaledMaxX);
		float newMinY = MathUtils.min(scaledMinY, scaledMaxY);
		float newMaxX = MathUtils.max(scaledMinX, scaledMaxX);
		float newMaxY = MathUtils.max(scaledMinY, scaledMaxY);
		
		res.set(newMinX, newMinY, newMaxX, newMaxY);
		
		return res;
	}
	
	public static <T extends IAabb2WF> T scaleFromPivot(float aabbMinX, float aabbMinY, float aabbMaxX, float aabbMaxY, float[] pivot, float scaleX, float scaleY, @ExtractionParam T res)
	{
		float pivotX = pivot[0];
		float pivotY = pivot[1];
		
		float scaledMinX = MathUtils.fma(scaleX, aabbMinX - pivotX, pivotX);
		float scaledMinY = MathUtils.fma(scaleY, aabbMinY - pivotY, pivotY);
		float scaledMaxX = MathUtils.fma(scaleX, aabbMaxX - pivotX, pivotX);
		float scaledMaxY = MathUtils.fma(scaleY, aabbMaxY - pivotY, pivotY);
		
		float newMinX = MathUtils.min(scaledMinX, scaledMaxX);
		float newMinY = MathUtils.min(scaledMinY, scaledMaxY);
		float newMaxX = MathUtils.max(scaledMinX, scaledMaxX);
		float newMaxY = MathUtils.max(scaledMinY, scaledMaxY);
		
		res.set(newMinX, newMinY, newMaxX, newMaxY);
		
		return res;
	}
	
	public static <T extends IAabb2WF> T scaleFromPivot(float aabbMinX, float aabbMinY, float aabbMaxX, float aabbMaxY, float pivotX, float pivotY, IVec2RF scale, @ExtractionParam T res)
	{
		float scaleX = scale.x();
		float scaleY = scale.y();
		
		float scaledMinX = MathUtils.fma(scaleX, aabbMinX - pivotX, pivotX);
		float scaledMinY = MathUtils.fma(scaleY, aabbMinY - pivotY, pivotY);
		float scaledMaxX = MathUtils.fma(scaleX, aabbMaxX - pivotX, pivotX);
		float scaledMaxY = MathUtils.fma(scaleY, aabbMaxY - pivotY, pivotY);
		
		float newMinX = MathUtils.min(scaledMinX, scaledMaxX);
		float newMinY = MathUtils.min(scaledMinY, scaledMaxY);
		float newMaxX = MathUtils.max(scaledMinX, scaledMaxX);
		float newMaxY = MathUtils.max(scaledMinY, scaledMaxY);
		
		res.set(newMinX, newMinY, newMaxX, newMaxY);
		
		return res;
	}
	
	public static <T extends IAabb2WF> T scaleFromPivot(float aabbMinX, float aabbMinY, float aabbMaxX, float aabbMaxY, float pivotX, float pivotY, float[] scale, @ExtractionParam T res)
	{
		float scaleX = scale[0];
		float scaleY = scale[1];
		
		float scaledMinX = MathUtils.fma(scaleX, aabbMinX - pivotX, pivotX);
		float scaledMinY = MathUtils.fma(scaleY, aabbMinY - pivotY, pivotY);
		float scaledMaxX = MathUtils.fma(scaleX, aabbMaxX - pivotX, pivotX);
		float scaledMaxY = MathUtils.fma(scaleY, aabbMaxY - pivotY, pivotY);
		
		float newMinX = MathUtils.min(scaledMinX, scaledMaxX);
		float newMinY = MathUtils.min(scaledMinY, scaledMaxY);
		float newMaxX = MathUtils.max(scaledMinX, scaledMaxX);
		float newMaxY = MathUtils.max(scaledMinY, scaledMaxY);
		
		res.set(newMinX, newMinY, newMaxX, newMaxY);
		
		return res;
	}
	
	public static <T extends IAabb2WF> T scaleFromPivot(float aabbMinX, float aabbMinY, float aabbMaxX, float aabbMaxY, float pivotX, float pivotY, float scaleX, float scaleY, @ExtractionParam T res)
	{
		float scaledMinX = MathUtils.fma(scaleX, aabbMinX - pivotX, pivotX);
		float scaledMinY = MathUtils.fma(scaleY, aabbMinY - pivotY, pivotY);
		float scaledMaxX = MathUtils.fma(scaleX, aabbMaxX - pivotX, pivotX);
		float scaledMaxY = MathUtils.fma(scaleY, aabbMaxY - pivotY, pivotY);
		
		float newMinX = MathUtils.min(scaledMinX, scaledMaxX);
		float newMinY = MathUtils.min(scaledMinY, scaledMaxY);
		float newMaxX = MathUtils.max(scaledMinX, scaledMaxX);
		float newMaxY = MathUtils.max(scaledMinY, scaledMaxY);
		
		res.set(newMinX, newMinY, newMaxX, newMaxY);
		
		return res;
	}
	
	public static <T extends IAabb2WF> T scaleFromPivotAssign(@ExtractionParam T aabb, IVec2RF pivot, IVec2RF scale)
	{
		float aabbMinX = aabb.minX();
		float aabbMinY = aabb.minY();
		float aabbMaxX = aabb.maxX();
		float aabbMaxY = aabb.maxY();
		
		float pivotX = pivot.x();
		float pivotY = pivot.y();
		
		float scaleX = scale.x();
		float scaleY = scale.y();
		
		float scaledMinX = MathUtils.fma(scaleX, aabbMinX - pivotX, pivotX);
		float scaledMinY = MathUtils.fma(scaleY, aabbMinY - pivotY, pivotY);
		float scaledMaxX = MathUtils.fma(scaleX, aabbMaxX - pivotX, pivotX);
		float scaledMaxY = MathUtils.fma(scaleY, aabbMaxY - pivotY, pivotY);
		
		float newMinX = MathUtils.min(scaledMinX, scaledMaxX);
		float newMinY = MathUtils.min(scaledMinY, scaledMaxY);
		float newMaxX = MathUtils.max(scaledMinX, scaledMaxX);
		float newMaxY = MathUtils.max(scaledMinY, scaledMaxY);
		
		aabb.set(newMinX, newMinY, newMaxX, newMaxY);
		
		return aabb;
	}
	
	public static <T extends IAabb2WF> T scaleFromPivotAssign(@ExtractionParam T aabb, IVec2RF pivot, float[] scale)
	{
		float aabbMinX = aabb.minX();
		float aabbMinY = aabb.minY();
		float aabbMaxX = aabb.maxX();
		float aabbMaxY = aabb.maxY();
		
		float pivotX = pivot.x();
		float pivotY = pivot.y();
		
		float scaleX = scale[0];
		float scaleY = scale[1];
		
		float scaledMinX = MathUtils.fma(scaleX, aabbMinX - pivotX, pivotX);
		float scaledMinY = MathUtils.fma(scaleY, aabbMinY - pivotY, pivotY);
		float scaledMaxX = MathUtils.fma(scaleX, aabbMaxX - pivotX, pivotX);
		float scaledMaxY = MathUtils.fma(scaleY, aabbMaxY - pivotY, pivotY);
		
		float newMinX = MathUtils.min(scaledMinX, scaledMaxX);
		float newMinY = MathUtils.min(scaledMinY, scaledMaxY);
		float newMaxX = MathUtils.max(scaledMinX, scaledMaxX);
		float newMaxY = MathUtils.max(scaledMinY, scaledMaxY);
		
		aabb.set(newMinX, newMinY, newMaxX, newMaxY);
		
		return aabb;
	}
	
	public static <T extends IAabb2WF> T scaleFromPivotAssign(@ExtractionParam T aabb, IVec2RF pivot, float scaleX, float scaleY)
	{
		float aabbMinX = aabb.minX();
		float aabbMinY = aabb.minY();
		float aabbMaxX = aabb.maxX();
		float aabbMaxY = aabb.maxY();
		
		float pivotX = pivot.x();
		float pivotY = pivot.y();
		
		float scaledMinX = MathUtils.fma(scaleX, aabbMinX - pivotX, pivotX);
		float scaledMinY = MathUtils.fma(scaleY, aabbMinY - pivotY, pivotY);
		float scaledMaxX = MathUtils.fma(scaleX, aabbMaxX - pivotX, pivotX);
		float scaledMaxY = MathUtils.fma(scaleY, aabbMaxY - pivotY, pivotY);
		
		float newMinX = MathUtils.min(scaledMinX, scaledMaxX);
		float newMinY = MathUtils.min(scaledMinY, scaledMaxY);
		float newMaxX = MathUtils.max(scaledMinX, scaledMaxX);
		float newMaxY = MathUtils.max(scaledMinY, scaledMaxY);
		
		aabb.set(newMinX, newMinY, newMaxX, newMaxY);
		
		return aabb;
	}
	
	public static <T extends IAabb2WF> T scaleFromPivotAssign(@ExtractionParam T aabb, float[] pivot, IVec2RF scale)
	{
		float aabbMinX = aabb.minX();
		float aabbMinY = aabb.minY();
		float aabbMaxX = aabb.maxX();
		float aabbMaxY = aabb.maxY();
		
		float pivotX = pivot[0];
		float pivotY = pivot[1];
		
		float scaleX = scale.x();
		float scaleY = scale.y();
		
		float scaledMinX = MathUtils.fma(scaleX, aabbMinX - pivotX, pivotX);
		float scaledMinY = MathUtils.fma(scaleY, aabbMinY - pivotY, pivotY);
		float scaledMaxX = MathUtils.fma(scaleX, aabbMaxX - pivotX, pivotX);
		float scaledMaxY = MathUtils.fma(scaleY, aabbMaxY - pivotY, pivotY);
		
		float newMinX = MathUtils.min(scaledMinX, scaledMaxX);
		float newMinY = MathUtils.min(scaledMinY, scaledMaxY);
		float newMaxX = MathUtils.max(scaledMinX, scaledMaxX);
		float newMaxY = MathUtils.max(scaledMinY, scaledMaxY);
		
		aabb.set(newMinX, newMinY, newMaxX, newMaxY);
		
		return aabb;
	}
	
	public static <T extends IAabb2WF> T scaleFromPivotAssign(@ExtractionParam T aabb, float[] pivot, float[] scale)
	{
		float aabbMinX = aabb.minX();
		float aabbMinY = aabb.minY();
		float aabbMaxX = aabb.maxX();
		float aabbMaxY = aabb.maxY();
		
		float pivotX = pivot[0];
		float pivotY = pivot[1];
		
		float scaleX = scale[0];
		float scaleY = scale[1];
		
		float scaledMinX = MathUtils.fma(scaleX, aabbMinX - pivotX, pivotX);
		float scaledMinY = MathUtils.fma(scaleY, aabbMinY - pivotY, pivotY);
		float scaledMaxX = MathUtils.fma(scaleX, aabbMaxX - pivotX, pivotX);
		float scaledMaxY = MathUtils.fma(scaleY, aabbMaxY - pivotY, pivotY);
		
		float newMinX = MathUtils.min(scaledMinX, scaledMaxX);
		float newMinY = MathUtils.min(scaledMinY, scaledMaxY);
		float newMaxX = MathUtils.max(scaledMinX, scaledMaxX);
		float newMaxY = MathUtils.max(scaledMinY, scaledMaxY);
		
		aabb.set(newMinX, newMinY, newMaxX, newMaxY);
		
		return aabb;
	}
	
	public static <T extends IAabb2WF> T scaleFromPivotAssign(@ExtractionParam T aabb, float[] pivot, float scaleX, float scaleY)
	{
		float aabbMinX = aabb.minX();
		float aabbMinY = aabb.minY();
		float aabbMaxX = aabb.maxX();
		float aabbMaxY = aabb.maxY();
		
		float pivotX = pivot[0];
		float pivotY = pivot[1];
		
		float scaledMinX = MathUtils.fma(scaleX, aabbMinX - pivotX, pivotX);
		float scaledMinY = MathUtils.fma(scaleY, aabbMinY - pivotY, pivotY);
		float scaledMaxX = MathUtils.fma(scaleX, aabbMaxX - pivotX, pivotX);
		float scaledMaxY = MathUtils.fma(scaleY, aabbMaxY - pivotY, pivotY);
		
		float newMinX = MathUtils.min(scaledMinX, scaledMaxX);
		float newMinY = MathUtils.min(scaledMinY, scaledMaxY);
		float newMaxX = MathUtils.max(scaledMinX, scaledMaxX);
		float newMaxY = MathUtils.max(scaledMinY, scaledMaxY);
		
		aabb.set(newMinX, newMinY, newMaxX, newMaxY);
		
		return aabb;
	}
	
	public static <T extends IAabb2WF> T scaleFromPivotAssign(@ExtractionParam T aabb, float pivotX, float pivotY, IVec2RF scale)
	{
		float aabbMinX = aabb.minX();
		float aabbMinY = aabb.minY();
		float aabbMaxX = aabb.maxX();
		float aabbMaxY = aabb.maxY();
		
		float scaleX = scale.x();
		float scaleY = scale.y();
		
		float scaledMinX = MathUtils.fma(scaleX, aabbMinX - pivotX, pivotX);
		float scaledMinY = MathUtils.fma(scaleY, aabbMinY - pivotY, pivotY);
		float scaledMaxX = MathUtils.fma(scaleX, aabbMaxX - pivotX, pivotX);
		float scaledMaxY = MathUtils.fma(scaleY, aabbMaxY - pivotY, pivotY);
		
		float newMinX = MathUtils.min(scaledMinX, scaledMaxX);
		float newMinY = MathUtils.min(scaledMinY, scaledMaxY);
		float newMaxX = MathUtils.max(scaledMinX, scaledMaxX);
		float newMaxY = MathUtils.max(scaledMinY, scaledMaxY);
		
		aabb.set(newMinX, newMinY, newMaxX, newMaxY);
		
		return aabb;
	}
	
	public static <T extends IAabb2WF> T scaleFromPivotAssign(@ExtractionParam T aabb, float pivotX, float pivotY, float[] scale)
	{
		float aabbMinX = aabb.minX();
		float aabbMinY = aabb.minY();
		float aabbMaxX = aabb.maxX();
		float aabbMaxY = aabb.maxY();
		
		float scaleX = scale[0];
		float scaleY = scale[1];
		
		float scaledMinX = MathUtils.fma(scaleX, aabbMinX - pivotX, pivotX);
		float scaledMinY = MathUtils.fma(scaleY, aabbMinY - pivotY, pivotY);
		float scaledMaxX = MathUtils.fma(scaleX, aabbMaxX - pivotX, pivotX);
		float scaledMaxY = MathUtils.fma(scaleY, aabbMaxY - pivotY, pivotY);
		
		float newMinX = MathUtils.min(scaledMinX, scaledMaxX);
		float newMinY = MathUtils.min(scaledMinY, scaledMaxY);
		float newMaxX = MathUtils.max(scaledMinX, scaledMaxX);
		float newMaxY = MathUtils.max(scaledMinY, scaledMaxY);
		
		aabb.set(newMinX, newMinY, newMaxX, newMaxY);
		
		return aabb;
	}
	
	public static <T extends IAabb2WF> T scaleFromPivotAssign(@ExtractionParam T aabb, float pivotX, float pivotY, float scaleX, float scaleY)
	{
		float aabbMinX = aabb.minX();
		float aabbMinY = aabb.minY();
		float aabbMaxX = aabb.maxX();
		float aabbMaxY = aabb.maxY();
		
		float scaledMinX = MathUtils.fma(scaleX, aabbMinX - pivotX, pivotX);
		float scaledMinY = MathUtils.fma(scaleY, aabbMinY - pivotY, pivotY);
		float scaledMaxX = MathUtils.fma(scaleX, aabbMaxX - pivotX, pivotX);
		float scaledMaxY = MathUtils.fma(scaleY, aabbMaxY - pivotY, pivotY);
		
		float newMinX = MathUtils.min(scaledMinX, scaledMaxX);
		float newMinY = MathUtils.min(scaledMinY, scaledMaxY);
		float newMaxX = MathUtils.max(scaledMinX, scaledMaxX);
		float newMaxY = MathUtils.max(scaledMinY, scaledMaxY);
		
		aabb.set(newMinX, newMinY, newMaxX, newMaxY);
		
		return aabb;
	}
	
	public static float[] scaleFromMin(IAabb2RF aabb, IVec2RF scale, @ExtractionParam float[] res)
	{
		float aabbMinX = aabb.minX();
		float aabbMinY = aabb.minY();
		float aabbMaxX = aabb.maxX();
		float aabbMaxY = aabb.maxY();
		
		float scaleX = scale.x();
		float scaleY = scale.y();
		
		float scaledMaxX = MathUtils.fma(scaleX, aabbMaxX - aabbMinX, aabbMinX);
		float scaledMaxY = MathUtils.fma(scaleY, aabbMaxY - aabbMinY, aabbMinY);
		
		float newMinX = MathUtils.min(aabbMinX, scaledMaxX);
		float newMinY = MathUtils.min(aabbMinY, scaledMaxY);
		float newMaxX = MathUtils.max(aabbMinX, scaledMaxX);
		float newMaxY = MathUtils.max(aabbMinY, scaledMaxY);
		
		res[0] = newMinX;
		res[1] = newMinY;
		res[2] = newMaxX;
		res[3] = newMaxY;
		
		return res;
	}
	
	public static float[] scaleFromMin(IAabb2RF aabb, float[] scale, @ExtractionParam float[] res)
	{
		float aabbMinX = aabb.minX();
		float aabbMinY = aabb.minY();
		float aabbMaxX = aabb.maxX();
		float aabbMaxY = aabb.maxY();
		
		float scaleX = scale[0];
		float scaleY = scale[1];
		
		float scaledMaxX = MathUtils.fma(scaleX, aabbMaxX - aabbMinX, aabbMinX);
		float scaledMaxY = MathUtils.fma(scaleY, aabbMaxY - aabbMinY, aabbMinY);
		
		float newMinX = MathUtils.min(aabbMinX, scaledMaxX);
		float newMinY = MathUtils.min(aabbMinY, scaledMaxY);
		float newMaxX = MathUtils.max(aabbMinX, scaledMaxX);
		float newMaxY = MathUtils.max(aabbMinY, scaledMaxY);
		
		res[0] = newMinX;
		res[1] = newMinY;
		res[2] = newMaxX;
		res[3] = newMaxY;
		
		return res;
	}
	
	public static float[] scaleFromMin(IAabb2RF aabb, float scaleX, float scaleY, @ExtractionParam float[] res)
	{
		float aabbMinX = aabb.minX();
		float aabbMinY = aabb.minY();
		float aabbMaxX = aabb.maxX();
		float aabbMaxY = aabb.maxY();
		
		float scaledMaxX = MathUtils.fma(scaleX, aabbMaxX - aabbMinX, aabbMinX);
		float scaledMaxY = MathUtils.fma(scaleY, aabbMaxY - aabbMinY, aabbMinY);
		
		float newMinX = MathUtils.min(aabbMinX, scaledMaxX);
		float newMinY = MathUtils.min(aabbMinY, scaledMaxY);
		float newMaxX = MathUtils.max(aabbMinX, scaledMaxX);
		float newMaxY = MathUtils.max(aabbMinY, scaledMaxY);
		
		res[0] = newMinX;
		res[1] = newMinY;
		res[2] = newMaxX;
		res[3] = newMaxY;
		
		return res;
	}
	
	public static float[] scaleFromMin(float[] aabb, IVec2RF scale, @ExtractionParam float[] res)
	{
		float aabbMinX = aabb[0];
		float aabbMinY = aabb[1];
		float aabbMaxX = aabb[2];
		float aabbMaxY = aabb[3];
		
		float scaleX = scale.x();
		float scaleY = scale.y();
		
		float scaledMaxX = MathUtils.fma(scaleX, aabbMaxX - aabbMinX, aabbMinX);
		float scaledMaxY = MathUtils.fma(scaleY, aabbMaxY - aabbMinY, aabbMinY);
		
		float newMinX = MathUtils.min(aabbMinX, scaledMaxX);
		float newMinY = MathUtils.min(aabbMinY, scaledMaxY);
		float newMaxX = MathUtils.max(aabbMinX, scaledMaxX);
		float newMaxY = MathUtils.max(aabbMinY, scaledMaxY);
		
		res[0] = newMinX;
		res[1] = newMinY;
		res[2] = newMaxX;
		res[3] = newMaxY;
		
		return res;
	}
	
	public static float[] scaleFromMin(IVec2RF aabbMin, IVec2RF aabbMax, IVec2RF scale, @ExtractionParam float[] res)
	{
		float aabbMinX = aabbMin.x();
		float aabbMinY = aabbMin.y();
		float aabbMaxX = aabbMax.x();
		float aabbMaxY = aabbMax.y();
		
		float scaleX = scale.x();
		float scaleY = scale.y();
		
		float scaledMaxX = MathUtils.fma(scaleX, aabbMaxX - aabbMinX, aabbMinX);
		float scaledMaxY = MathUtils.fma(scaleY, aabbMaxY - aabbMinY, aabbMinY);
		
		float newMinX = MathUtils.min(aabbMinX, scaledMaxX);
		float newMinY = MathUtils.min(aabbMinY, scaledMaxY);
		float newMaxX = MathUtils.max(aabbMinX, scaledMaxX);
		float newMaxY = MathUtils.max(aabbMinY, scaledMaxY);
		
		res[0] = newMinX;
		res[1] = newMinY;
		res[2] = newMaxX;
		res[3] = newMaxY;
		
		return res;
	}
	
	public static float[] scaleFromMin(IVec2RF aabbMin, IVec2RF aabbMax, float[] scale, @ExtractionParam float[] res)
	{
		float aabbMinX = aabbMin.x();
		float aabbMinY = aabbMin.y();
		float aabbMaxX = aabbMax.x();
		float aabbMaxY = aabbMax.y();
		
		float scaleX = scale[0];
		float scaleY = scale[1];
		
		float scaledMaxX = MathUtils.fma(scaleX, aabbMaxX - aabbMinX, aabbMinX);
		float scaledMaxY = MathUtils.fma(scaleY, aabbMaxY - aabbMinY, aabbMinY);
		
		float newMinX = MathUtils.min(aabbMinX, scaledMaxX);
		float newMinY = MathUtils.min(aabbMinY, scaledMaxY);
		float newMaxX = MathUtils.max(aabbMinX, scaledMaxX);
		float newMaxY = MathUtils.max(aabbMinY, scaledMaxY);
		
		res[0] = newMinX;
		res[1] = newMinY;
		res[2] = newMaxX;
		res[3] = newMaxY;
		
		return res;
	}
	
	public static float[] scaleFromMin(IVec2RF aabbMin, IVec2RF aabbMax, float scaleX, float scaleY, @ExtractionParam float[] res)
	{
		float aabbMinX = aabbMin.x();
		float aabbMinY = aabbMin.y();
		float aabbMaxX = aabbMax.x();
		float aabbMaxY = aabbMax.y();
		
		float scaledMaxX = MathUtils.fma(scaleX, aabbMaxX - aabbMinX, aabbMinX);
		float scaledMaxY = MathUtils.fma(scaleY, aabbMaxY - aabbMinY, aabbMinY);
		
		float newMinX = MathUtils.min(aabbMinX, scaledMaxX);
		float newMinY = MathUtils.min(aabbMinY, scaledMaxY);
		float newMaxX = MathUtils.max(aabbMinX, scaledMaxX);
		float newMaxY = MathUtils.max(aabbMinY, scaledMaxY);
		
		res[0] = newMinX;
		res[1] = newMinY;
		res[2] = newMaxX;
		res[3] = newMaxY;
		
		return res;
	}
	
	public static float[] scaleFromMin(IVec2RF aabbMin, float[] aabbMax, IVec2RF scale, @ExtractionParam float[] res)
	{
		float aabbMinX = aabbMin.x();
		float aabbMinY = aabbMin.y();
		float aabbMaxX = aabbMax[0];
		float aabbMaxY = aabbMax[1];
		
		float scaleX = scale.x();
		float scaleY = scale.y();
		
		float scaledMaxX = MathUtils.fma(scaleX, aabbMaxX - aabbMinX, aabbMinX);
		float scaledMaxY = MathUtils.fma(scaleY, aabbMaxY - aabbMinY, aabbMinY);
		
		float newMinX = MathUtils.min(aabbMinX, scaledMaxX);
		float newMinY = MathUtils.min(aabbMinY, scaledMaxY);
		float newMaxX = MathUtils.max(aabbMinX, scaledMaxX);
		float newMaxY = MathUtils.max(aabbMinY, scaledMaxY);
		
		res[0] = newMinX;
		res[1] = newMinY;
		res[2] = newMaxX;
		res[3] = newMaxY;
		
		return res;
	}
	
	public static float[] scaleFromMin(IVec2RF aabbMin, float[] aabbMax, float[] scale, @ExtractionParam float[] res)
	{
		float aabbMinX = aabbMin.x();
		float aabbMinY = aabbMin.y();
		float aabbMaxX = aabbMax[0];
		float aabbMaxY = aabbMax[1];
		
		float scaleX = scale[0];
		float scaleY = scale[1];
		
		float scaledMaxX = MathUtils.fma(scaleX, aabbMaxX - aabbMinX, aabbMinX);
		float scaledMaxY = MathUtils.fma(scaleY, aabbMaxY - aabbMinY, aabbMinY);
		
		float newMinX = MathUtils.min(aabbMinX, scaledMaxX);
		float newMinY = MathUtils.min(aabbMinY, scaledMaxY);
		float newMaxX = MathUtils.max(aabbMinX, scaledMaxX);
		float newMaxY = MathUtils.max(aabbMinY, scaledMaxY);
		
		res[0] = newMinX;
		res[1] = newMinY;
		res[2] = newMaxX;
		res[3] = newMaxY;
		
		return res;
	}
	
	public static float[] scaleFromMin(IVec2RF aabbMin, float[] aabbMax, float scaleX, float scaleY, @ExtractionParam float[] res)
	{
		float aabbMinX = aabbMin.x();
		float aabbMinY = aabbMin.y();
		float aabbMaxX = aabbMax[0];
		float aabbMaxY = aabbMax[1];
		
		float scaledMaxX = MathUtils.fma(scaleX, aabbMaxX - aabbMinX, aabbMinX);
		float scaledMaxY = MathUtils.fma(scaleY, aabbMaxY - aabbMinY, aabbMinY);
		
		float newMinX = MathUtils.min(aabbMinX, scaledMaxX);
		float newMinY = MathUtils.min(aabbMinY, scaledMaxY);
		float newMaxX = MathUtils.max(aabbMinX, scaledMaxX);
		float newMaxY = MathUtils.max(aabbMinY, scaledMaxY);
		
		res[0] = newMinX;
		res[1] = newMinY;
		res[2] = newMaxX;
		res[3] = newMaxY;
		
		return res;
	}
	
	public static float[] scaleFromMin(IVec2RF aabbMin, float aabbMaxX, float aabbMaxY, IVec2RF scale, @ExtractionParam float[] res)
	{
		float aabbMinX = aabbMin.x();
		float aabbMinY = aabbMin.y();
		
		float scaleX = scale.x();
		float scaleY = scale.y();
		
		float scaledMaxX = MathUtils.fma(scaleX, aabbMaxX - aabbMinX, aabbMinX);
		float scaledMaxY = MathUtils.fma(scaleY, aabbMaxY - aabbMinY, aabbMinY);
		
		float newMinX = MathUtils.min(aabbMinX, scaledMaxX);
		float newMinY = MathUtils.min(aabbMinY, scaledMaxY);
		float newMaxX = MathUtils.max(aabbMinX, scaledMaxX);
		float newMaxY = MathUtils.max(aabbMinY, scaledMaxY);
		
		res[0] = newMinX;
		res[1] = newMinY;
		res[2] = newMaxX;
		res[3] = newMaxY;
		
		return res;
	}
	
	public static float[] scaleFromMin(IVec2RF aabbMin, float aabbMaxX, float aabbMaxY, float[] scale, @ExtractionParam float[] res)
	{
		float aabbMinX = aabbMin.x();
		float aabbMinY = aabbMin.y();
		
		float scaleX = scale[0];
		float scaleY = scale[1];
		
		float scaledMaxX = MathUtils.fma(scaleX, aabbMaxX - aabbMinX, aabbMinX);
		float scaledMaxY = MathUtils.fma(scaleY, aabbMaxY - aabbMinY, aabbMinY);
		
		float newMinX = MathUtils.min(aabbMinX, scaledMaxX);
		float newMinY = MathUtils.min(aabbMinY, scaledMaxY);
		float newMaxX = MathUtils.max(aabbMinX, scaledMaxX);
		float newMaxY = MathUtils.max(aabbMinY, scaledMaxY);
		
		res[0] = newMinX;
		res[1] = newMinY;
		res[3] = newMaxX;
		res[4] = newMaxY;
		
		return res;
	}
	
	public static float[] scaleFromMin(IVec2RF aabbMin, float aabbMaxX, float aabbMaxY, float scaleX, float scaleY, @ExtractionParam float[] res)
	{
		float aabbMinX = aabbMin.x();
		float aabbMinY = aabbMin.y();
		
		float scaledMaxX = MathUtils.fma(scaleX, aabbMaxX - aabbMinX, aabbMinX);
		float scaledMaxY = MathUtils.fma(scaleY, aabbMaxY - aabbMinY, aabbMinY);
		
		float newMinX = MathUtils.min(aabbMinX, scaledMaxX);
		float newMinY = MathUtils.min(aabbMinY, scaledMaxY);
		float newMaxX = MathUtils.max(aabbMinX, scaledMaxX);
		float newMaxY = MathUtils.max(aabbMinY, scaledMaxY);
		
		res[0] = newMinX;
		res[1] = newMinY;
		res[2] = newMaxX;
		res[3] = newMaxY;
		
		return res;
	}
	
	public static float[] scaleFromMin(float[] aabbMin, IVec2RF aabbMax, IVec2RF scale, @ExtractionParam float[] res)
	{
		float aabbMinX = aabbMin[0];
		float aabbMinY = aabbMin[1];
		float aabbMaxX = aabbMax.x();
		float aabbMaxY = aabbMax.y();
		
		float scaleX = scale.x();
		float scaleY = scale.y();
		
		float scaledMaxX = MathUtils.fma(scaleX, aabbMaxX - aabbMinX, aabbMinX);
		float scaledMaxY = MathUtils.fma(scaleY, aabbMaxY - aabbMinY, aabbMinY);
		
		float newMinX = MathUtils.min(aabbMinX, scaledMaxX);
		float newMinY = MathUtils.min(aabbMinY, scaledMaxY);
		float newMaxX = MathUtils.max(aabbMinX, scaledMaxX);
		float newMaxY = MathUtils.max(aabbMinY, scaledMaxY);
		
		res[0] = newMinX;
		res[1] = newMinY;
		res[2] = newMaxX;
		res[3] = newMaxY;
		
		return res;
	}
	
	public static float[] scaleFromMin(float[] aabbMin, IVec2RF aabbMax, float[] scale, @ExtractionParam float[] res)
	{
		float aabbMinX = aabbMin[0];
		float aabbMinY = aabbMin[1];
		float aabbMaxX = aabbMax.x();
		float aabbMaxY = aabbMax.y();
		
		float scaleX = scale[0];
		float scaleY = scale[1];
		
		float scaledMaxX = MathUtils.fma(scaleX, aabbMaxX - aabbMinX, aabbMinX);
		float scaledMaxY = MathUtils.fma(scaleY, aabbMaxY - aabbMinY, aabbMinY);
		
		float newMinX = MathUtils.min(aabbMinX, scaledMaxX);
		float newMinY = MathUtils.min(aabbMinY, scaledMaxY);
		float newMaxX = MathUtils.max(aabbMinX, scaledMaxX);
		float newMaxY = MathUtils.max(aabbMinY, scaledMaxY);
		
		res[0] = newMinX;
		res[1] = newMinY;
		res[2] = newMaxX;
		res[3] = newMaxY;
		
		return res;
	}
	
	public static float[] scaleFromMin(float[] aabbMin, IVec2RF aabbMax, float scaleX, float scaleY, @ExtractionParam float[] res)
	{
		float aabbMinX = aabbMin[0];
		float aabbMinY = aabbMin[1];
		float aabbMaxX = aabbMax.x();
		float aabbMaxY = aabbMax.y();
		
		float scaledMaxX = MathUtils.fma(scaleX, aabbMaxX - aabbMinX, aabbMinX);
		float scaledMaxY = MathUtils.fma(scaleY, aabbMaxY - aabbMinY, aabbMinY);
		
		float newMinX = MathUtils.min(aabbMinX, scaledMaxX);
		float newMinY = MathUtils.min(aabbMinY, scaledMaxY);
		float newMaxX = MathUtils.max(aabbMinX, scaledMaxX);
		float newMaxY = MathUtils.max(aabbMinY, scaledMaxY);
		
		res[0] = newMinX;
		res[1] = newMinY;
		res[2] = newMaxX;
		res[3] = newMaxY;
		
		return res;
	}
	
	public static float[] scaleFromMin(float[] aabbMin, float[] aabbMax, IVec2RF scale, @ExtractionParam float[] res)
	{
		float aabbMinX = aabbMin[0];
		float aabbMinY = aabbMin[1];
		float aabbMaxX = aabbMax[0];
		float aabbMaxY = aabbMax[1];
		
		float scaleX = scale.x();
		float scaleY = scale.y();
		
		float scaledMaxX = MathUtils.fma(scaleX, aabbMaxX - aabbMinX, aabbMinX);
		float scaledMaxY = MathUtils.fma(scaleY, aabbMaxY - aabbMinY, aabbMinY);
		
		float newMinX = MathUtils.min(aabbMinX, scaledMaxX);
		float newMinY = MathUtils.min(aabbMinY, scaledMaxY);
		float newMaxX = MathUtils.max(aabbMinX, scaledMaxX);
		float newMaxY = MathUtils.max(aabbMinY, scaledMaxY);
		
		res[0] = newMinX;
		res[1] = newMinY;
		res[2] = newMaxX;
		res[3] = newMaxY;
		
		return res;
	}
	
	public static float[] scaleFromMin(float[] aabbMin, float aabbMaxX, float aabbMaxY, IVec2RF scale, @ExtractionParam float[] res)
	{
		float aabbMinX = aabbMin[0];
		float aabbMinY = aabbMin[1];
		
		float scaleX = scale.x();
		float scaleY = scale.y();
		
		float scaledMaxX = MathUtils.fma(scaleX, aabbMaxX - aabbMinX, aabbMinX);
		float scaledMaxY = MathUtils.fma(scaleY, aabbMaxY - aabbMinY, aabbMinY);
		
		float newMinX = MathUtils.min(aabbMinX, scaledMaxX);
		float newMinY = MathUtils.min(aabbMinY, scaledMaxY);
		float newMaxX = MathUtils.max(aabbMinX, scaledMaxX);
		float newMaxY = MathUtils.max(aabbMinY, scaledMaxY);
		
		res[0] = newMinX;
		res[1] = newMinY;
		res[2] = newMaxX;
		res[3] = newMaxY;
		
		return res;
	}
	
	public static float[] scaleFromMin(float aabbMinX, float aabbMinY, IVec2RF aabbMax, IVec2RF scale, @ExtractionParam float[] res)
	{
		float aabbMaxX = aabbMax.x();
		float aabbMaxY = aabbMax.y();
		
		float scaleX = scale.x();
		float scaleY = scale.y();
		
		float scaledMaxX = MathUtils.fma(scaleX, aabbMaxX - aabbMinX, aabbMinX);
		float scaledMaxY = MathUtils.fma(scaleY, aabbMaxY - aabbMinY, aabbMinY);
		
		float newMinX = MathUtils.min(aabbMinX, scaledMaxX);
		float newMinY = MathUtils.min(aabbMinY, scaledMaxY);
		float newMaxX = MathUtils.max(aabbMinX, scaledMaxX);
		float newMaxY = MathUtils.max(aabbMinY, scaledMaxY);
		
		res[0] = newMinX;
		res[1] = newMinY;
		res[2] = newMaxX;
		res[3] = newMaxY;
		
		return res;
	}
	
	public static float[] scaleFromMin(float aabbMinX, float aabbMinY, float aabbMinZ, IVec2RF aabbMax, float[] scale, @ExtractionParam float[] res)
	{
		float aabbMaxX = aabbMax.x();
		float aabbMaxY = aabbMax.y();
		
		float scaleX = scale[0];
		float scaleY = scale[1];
		
		float scaledMaxX = MathUtils.fma(scaleX, aabbMaxX - aabbMinX, aabbMinX);
		float scaledMaxY = MathUtils.fma(scaleY, aabbMaxY - aabbMinY, aabbMinY);
		
		float newMinX = MathUtils.min(aabbMinX, scaledMaxX);
		float newMinY = MathUtils.min(aabbMinY, scaledMaxY);
		float newMaxX = MathUtils.max(aabbMinX, scaledMaxX);
		float newMaxY = MathUtils.max(aabbMinY, scaledMaxY);
		
		res[0] = newMinX;
		res[1] = newMinY;
		res[2] = newMaxX;
		res[3] = newMaxY;
		
		return res;
	}
	
	public static float[] scaleFromMin(float aabbMinX, float aabbMinY, IVec2RF aabbMax, float scaleX, float scaleY, @ExtractionParam float[] res)
	{
		float aabbMaxX = aabbMax.x();
		float aabbMaxY = aabbMax.y();
		
		float scaledMaxX = MathUtils.fma(scaleX, aabbMaxX - aabbMinX, aabbMinX);
		float scaledMaxY = MathUtils.fma(scaleY, aabbMaxY - aabbMinY, aabbMinY);
		
		float newMinX = MathUtils.min(aabbMinX, scaledMaxX);
		float newMinY = MathUtils.min(aabbMinY, scaledMaxY);
		float newMaxX = MathUtils.max(aabbMinX, scaledMaxX);
		float newMaxY = MathUtils.max(aabbMinY, scaledMaxY);
		
		res[0] = newMinX;
		res[1] = newMinY;
		res[2] = newMaxX;
		res[3] = newMaxY;
		
		return res;
	}
	
	public static float[] scaleFromMin(float aabbMinX, float aabbMinY, float[] aabbMax, IVec2RF scale, @ExtractionParam float[] res)
	{
		float aabbMaxX = aabbMax[0];
		float aabbMaxY = aabbMax[1];
		
		float scaleX = scale.x();
		float scaleY = scale.y();
		
		float scaledMaxX = MathUtils.fma(scaleX, aabbMaxX - aabbMinX, aabbMinX);
		float scaledMaxY = MathUtils.fma(scaleY, aabbMaxY - aabbMinY, aabbMinY);
		
		float newMinX = MathUtils.min(aabbMinX, scaledMaxX);
		float newMinY = MathUtils.min(aabbMinY, scaledMaxY);
		float newMaxX = MathUtils.max(aabbMinX, scaledMaxX);
		float newMaxY = MathUtils.max(aabbMinY, scaledMaxY);
		
		res[0] = newMinX;
		res[1] = newMinY;
		res[2] = newMaxX;
		res[3] = newMaxY;
		
		return res;
	}
	
	public static float[] scaleFromMin(float aabbMinX, float aabbMinY, float aabbMaxX, float aabbMaxY, IVec2RF scale, @ExtractionParam float[] res)
	{
		float scaleX = scale.x();
		float scaleY = scale.y();
		
		float scaledMaxX = MathUtils.fma(scaleX, aabbMaxX - aabbMinX, aabbMinX);
		float scaledMaxY = MathUtils.fma(scaleY, aabbMaxY - aabbMinY, aabbMinY);
		
		float newMinX = MathUtils.min(aabbMinX, scaledMaxX);
		float newMinY = MathUtils.min(aabbMinY, scaledMaxY);
		float newMaxX = MathUtils.max(aabbMinX, scaledMaxX);
		float newMaxY = MathUtils.max(aabbMinY, scaledMaxY);
		
		res[0] = newMinX;
		res[1] = newMinY;
		res[2] = newMaxX;
		res[3] = newMaxY;
		
		return res;
	}
	
	public static float[] scaleFromMinAssign(@ExtractionParam float[] aabb, IVec2RF scale)
	{
		float aabbMinX = aabb[0];
		float aabbMinY = aabb[1];
		float aabbMaxX = aabb[2];
		float aabbMaxY = aabb[3];
		
		float scaleX = scale.x();
		float scaleY = scale.y();
		
		float scaledMaxX = MathUtils.fma(scaleX, aabbMaxX - aabbMinX, aabbMinX);
		float scaledMaxY = MathUtils.fma(scaleY, aabbMaxY - aabbMinY, aabbMinY);
		
		float newMinX = MathUtils.min(aabbMinX, scaledMaxX);
		float newMinY = MathUtils.min(aabbMinY, scaledMaxY);
		float newMaxX = MathUtils.max(aabbMinX, scaledMaxX);
		float newMaxY = MathUtils.max(aabbMinY, scaledMaxY);
		
		aabb[0] = newMinX;
		aabb[1] = newMinY;
		aabb[2] = newMaxX;
		aabb[3] = newMaxY;
		
		return aabb;
	}
	
	public static <T extends IAabb2WF> T scaleFromMin(IAabb2RF aabb, IVec2RF scale, @ExtractionParam T res)
	{
		float aabbMinX = aabb.minX();
		float aabbMinY = aabb.minY();
		float aabbMaxX = aabb.maxX();
		float aabbMaxY = aabb.maxY();
		
		float scaleX = scale.x();
		float scaleY = scale.y();
		
		float scaledMaxX = MathUtils.fma(scaleX, aabbMaxX - aabbMinX, aabbMinX);
		float scaledMaxY = MathUtils.fma(scaleY, aabbMaxY - aabbMinY, aabbMinY);
		
		float newMinX = MathUtils.min(aabbMinX, scaledMaxX);
		float newMinY = MathUtils.min(aabbMinY, scaledMaxY);
		float newMaxX = MathUtils.max(aabbMinX, scaledMaxX);
		float newMaxY = MathUtils.max(aabbMinY, scaledMaxY);
		
		res.set(newMinX, newMinY, newMaxX, newMaxY);
		
		return res;
	}
	
	public static <T extends IAabb2WF> T scaleFromMin(IAabb2RF aabb, float[] scale, @ExtractionParam T res)
	{
		float aabbMinX = aabb.minX();
		float aabbMinY = aabb.minY();
		float aabbMaxX = aabb.maxX();
		float aabbMaxY = aabb.maxY();
		
		float scaleX = scale[0];
		float scaleY = scale[1];
		
		float scaledMaxX = MathUtils.fma(scaleX, aabbMaxX - aabbMinX, aabbMinX);
		float scaledMaxY = MathUtils.fma(scaleY, aabbMaxY - aabbMinY, aabbMinY);
		
		float newMinX = MathUtils.min(aabbMinX, scaledMaxX);
		float newMinY = MathUtils.min(aabbMinY, scaledMaxY);
		float newMaxX = MathUtils.max(aabbMinX, scaledMaxX);
		float newMaxY = MathUtils.max(aabbMinY, scaledMaxY);
		
		res.set(newMinX, newMinY, newMaxX, newMaxY);
		
		return res;
	}
	
	public static <T extends IAabb2WF> T scaleFromMin(IAabb2RF aabb, float scaleX, float scaleY, @ExtractionParam T res)
	{
		float aabbMinX = aabb.minX();
		float aabbMinY = aabb.minY();
		float aabbMaxX = aabb.maxX();
		float aabbMaxY = aabb.maxY();
		
		float scaledMaxX = MathUtils.fma(scaleX, aabbMaxX - aabbMinX, aabbMinX);
		float scaledMaxY = MathUtils.fma(scaleY, aabbMaxY - aabbMinY, aabbMinY);
		
		float newMinX = MathUtils.min(aabbMinX, scaledMaxX);
		float newMinY = MathUtils.min(aabbMinY, scaledMaxY);
		float newMaxX = MathUtils.max(aabbMinX, scaledMaxX);
		float newMaxY = MathUtils.max(aabbMinY, scaledMaxY);
		
		res.set(newMinX, newMinY, newMaxX, newMaxY);
		
		return res;
	}
	
	public static <T extends IAabb2WF> T scaleFromMin(float[] aabb, IVec2RF scale, @ExtractionParam T res)
	{
		float aabbMinX = aabb[0];
		float aabbMinY = aabb[1];
		float aabbMaxX = aabb[2];
		float aabbMaxY = aabb[3];
		
		float scaleX = scale.x();
		float scaleY = scale.y();
		
		float scaledMaxX = MathUtils.fma(scaleX, aabbMaxX - aabbMinX, aabbMinX);
		float scaledMaxY = MathUtils.fma(scaleY, aabbMaxY - aabbMinY, aabbMinY);
		
		float newMinX = MathUtils.min(aabbMinX, scaledMaxX);
		float newMinY = MathUtils.min(aabbMinY, scaledMaxY);
		float newMaxX = MathUtils.max(aabbMinX, scaledMaxX);
		float newMaxY = MathUtils.max(aabbMinY, scaledMaxY);
		
		res.set(newMinX, newMinY, newMaxX, newMaxY);
		
		return res;
	}
	
	public static <T extends IAabb2WF> T scaleFromMin(float[] aabb, float[] scale, @ExtractionParam T res)
	{
		float aabbMinX = aabb[0];
		float aabbMinY = aabb[1];
		float aabbMaxX = aabb[2];
		float aabbMaxY = aabb[3];
		
		float scaleX = scale[0];
		float scaleY = scale[1];
		
		float scaledMaxX = MathUtils.fma(scaleX, aabbMaxX - aabbMinX, aabbMinX);
		float scaledMaxY = MathUtils.fma(scaleY, aabbMaxY - aabbMinY, aabbMinY);
		
		float newMinX = MathUtils.min(aabbMinX, scaledMaxX);
		float newMinY = MathUtils.min(aabbMinY, scaledMaxY);
		float newMaxX = MathUtils.max(aabbMinX, scaledMaxX);
		float newMaxY = MathUtils.max(aabbMinY, scaledMaxY);
		
		res.set(newMinX, newMinY, newMaxX, newMaxY);
		
		return res;
	}
	
	public static <T extends IAabb2WF> T scaleFromMin(float[] aabb, float scaleX, float scaleY, @ExtractionParam T res)
	{
		float aabbMinX = aabb[0];
		float aabbMinY = aabb[1];
		float aabbMaxX = aabb[2];
		float aabbMaxY = aabb[3];
		
		float scaledMaxX = MathUtils.fma(scaleX, aabbMaxX - aabbMinX, aabbMinX);
		float scaledMaxY = MathUtils.fma(scaleY, aabbMaxY - aabbMinY, aabbMinY);
		
		float newMinX = MathUtils.min(aabbMinX, scaledMaxX);
		float newMinY = MathUtils.min(aabbMinY, scaledMaxY);
		float newMaxX = MathUtils.max(aabbMinX, scaledMaxX);
		float newMaxY = MathUtils.max(aabbMinY, scaledMaxY);
		
		res.set(newMinX, newMinY, newMaxX, newMaxY);
		
		return res;
	}
	
	public static <T extends IAabb2WF> T scaleFromMin(IVec2RF aabbMin, IVec2RF aabbMax, IVec2RF scale, @ExtractionParam T res)
	{
		float aabbMinX = aabbMin.x();
		float aabbMinY = aabbMin.y();
		float aabbMaxX = aabbMax.x();
		float aabbMaxY = aabbMax.y();
		
		float scaleX = scale.x();
		float scaleY = scale.y();
		
		float scaledMaxX = MathUtils.fma(scaleX, aabbMaxX - aabbMinX, aabbMinX);
		float scaledMaxY = MathUtils.fma(scaleY, aabbMaxY - aabbMinY, aabbMinY);
		
		float newMinX = MathUtils.min(aabbMinX, scaledMaxX);
		float newMinY = MathUtils.min(aabbMinY, scaledMaxY);
		float newMaxX = MathUtils.max(aabbMinX, scaledMaxX);
		float newMaxY = MathUtils.max(aabbMinY, scaledMaxY);
		
		res.set(newMinX, newMinY, newMaxX, newMaxY);
		
		return res;
	}
	
	public static <T extends IAabb2WF> T scaleFromMin(IVec2RF aabbMin, IVec2RF aabbMax, float[] scale, @ExtractionParam T res)
	{
		float aabbMinX = aabbMin.x();
		float aabbMinY = aabbMin.y();
		float aabbMaxX = aabbMax.x();
		float aabbMaxY = aabbMax.y();
		
		float scaleX = scale[0];
		float scaleY = scale[1];
		
		float scaledMaxX = MathUtils.fma(scaleX, aabbMaxX - aabbMinX, aabbMinX);
		float scaledMaxY = MathUtils.fma(scaleY, aabbMaxY - aabbMinY, aabbMinY);
		
		float newMinX = MathUtils.min(aabbMinX, scaledMaxX);
		float newMinY = MathUtils.min(aabbMinY, scaledMaxY);
		float newMaxX = MathUtils.max(aabbMinX, scaledMaxX);
		float newMaxY = MathUtils.max(aabbMinY, scaledMaxY);
		
		res.set(newMinX, newMinY, newMaxX, newMaxY);
		
		return res;
	}
	
	public static <T extends IAabb2WF> T scaleFromMin(IVec2RF aabbMin, IVec2RF aabbMax, float scaleX, float scaleY, @ExtractionParam T res)
	{
		float aabbMinX = aabbMin.x();
		float aabbMinY = aabbMin.y();
		float aabbMaxX = aabbMax.x();
		float aabbMaxY = aabbMax.y();
		
		float scaledMaxX = MathUtils.fma(scaleX, aabbMaxX - aabbMinX, aabbMinX);
		float scaledMaxY = MathUtils.fma(scaleY, aabbMaxY - aabbMinY, aabbMinY);
		
		float newMinX = MathUtils.min(aabbMinX, scaledMaxX);
		float newMinY = MathUtils.min(aabbMinY, scaledMaxY);
		float newMaxX = MathUtils.max(aabbMinX, scaledMaxX);
		float newMaxY = MathUtils.max(aabbMinY, scaledMaxY);
		
		res.set(newMinX, newMinY, newMaxX, newMaxY);
		
		return res;
	}
	
	public static <T extends IAabb2WF> T scaleFromMin(IVec2RF aabbMin, float[] aabbMax, IVec2RF scale, @ExtractionParam T res)
	{
		float aabbMinX = aabbMin.x();
		float aabbMinY = aabbMin.y();
		float aabbMaxX = aabbMax[0];
		float aabbMaxY = aabbMax[1];
		
		float scaleX = scale.x();
		float scaleY = scale.y();
		
		float scaledMaxX = MathUtils.fma(scaleX, aabbMaxX - aabbMinX, aabbMinX);
		float scaledMaxY = MathUtils.fma(scaleY, aabbMaxY - aabbMinY, aabbMinY);
		
		float newMinX = MathUtils.min(aabbMinX, scaledMaxX);
		float newMinY = MathUtils.min(aabbMinY, scaledMaxY);
		float newMaxX = MathUtils.max(aabbMinX, scaledMaxX);
		float newMaxY = MathUtils.max(aabbMinY, scaledMaxY);
		
		res.set(newMinX, newMinY, newMaxX, newMaxY);
		
		return res;
	}
	
	public static <T extends IAabb2WF> T scaleFromMin(IVec2RF aabbMin, float[] aabbMax, float[] scale, @ExtractionParam T res)
	{
		float aabbMinX = aabbMin.x();
		float aabbMinY = aabbMin.y();
		float aabbMaxX = aabbMax[0];
		float aabbMaxY = aabbMax[1];
		
		float scaleX = scale[0];
		float scaleY = scale[1];
		
		float scaledMaxX = MathUtils.fma(scaleX, aabbMaxX - aabbMinX, aabbMinX);
		float scaledMaxY = MathUtils.fma(scaleY, aabbMaxY - aabbMinY, aabbMinY);
		
		float newMinX = MathUtils.min(aabbMinX, scaledMaxX);
		float newMinY = MathUtils.min(aabbMinY, scaledMaxY);
		float newMaxX = MathUtils.max(aabbMinX, scaledMaxX);
		float newMaxY = MathUtils.max(aabbMinY, scaledMaxY);
		
		res.set(newMinX, newMinY, newMaxX, newMaxY);
		
		return res;
	}
	
	public static <T extends IAabb2WF> T scaleFromMin(IVec2RF aabbMin, float[] aabbMax, float scaleX, float scaleY, @ExtractionParam T res)
	{
		float aabbMinX = aabbMin.x();
		float aabbMinY = aabbMin.y();
		float aabbMaxX = aabbMax[0];
		float aabbMaxY = aabbMax[1];
		
		float scaledMaxX = MathUtils.fma(scaleX, aabbMaxX - aabbMinX, aabbMinX);
		float scaledMaxY = MathUtils.fma(scaleY, aabbMaxY - aabbMinY, aabbMinY);
		
		float newMinX = MathUtils.min(aabbMinX, scaledMaxX);
		float newMinY = MathUtils.min(aabbMinY, scaledMaxY);
		float newMaxX = MathUtils.max(aabbMinX, scaledMaxX);
		float newMaxY = MathUtils.max(aabbMinY, scaledMaxY);
		
		res.set(newMinX, newMinY, newMaxX, newMaxY);
		
		return res;
	}
	
	public static <T extends IAabb2WF> T scaleFromMin(IVec2RF aabbMin, float aabbMaxX, float aabbMaxY, IVec2RF scale, @ExtractionParam T res)
	{
		float aabbMinX = aabbMin.x();
		float aabbMinY = aabbMin.y();
		
		float scaleX = scale.x();
		float scaleY = scale.y();
		
		float scaledMaxX = MathUtils.fma(scaleX, aabbMaxX - aabbMinX, aabbMinX);
		float scaledMaxY = MathUtils.fma(scaleY, aabbMaxY - aabbMinY, aabbMinY);
		
		float newMinX = MathUtils.min(aabbMinX, scaledMaxX);
		float newMinY = MathUtils.min(aabbMinY, scaledMaxY);
		float newMaxX = MathUtils.max(aabbMinX, scaledMaxX);
		float newMaxY = MathUtils.max(aabbMinY, scaledMaxY);
		
		res.set(newMinX, newMinY, newMaxX, newMaxY);
		
		return res;
	}
	
	public static <T extends IAabb2WF> T scaleFromMin(IVec2RF aabbMin, float aabbMaxX, float aabbMaxY, float[] scale, @ExtractionParam T res)
	{
		float aabbMinX = aabbMin.x();
		float aabbMinY = aabbMin.y();
		
		float scaleX = scale[0];
		float scaleY = scale[1];
		
		float scaledMaxX = MathUtils.fma(scaleX, aabbMaxX - aabbMinX, aabbMinX);
		float scaledMaxY = MathUtils.fma(scaleY, aabbMaxY - aabbMinY, aabbMinY);
		
		float newMinX = MathUtils.min(aabbMinX, scaledMaxX);
		float newMinY = MathUtils.min(aabbMinY, scaledMaxY);
		float newMaxX = MathUtils.max(aabbMinX, scaledMaxX);
		float newMaxY = MathUtils.max(aabbMinY, scaledMaxY);
		
		res.set(newMinX, newMinY, newMaxX, newMaxY);
		
		return res;
	}
	
	public static <T extends IAabb2WF> T scaleFromMin(IVec2RF aabbMin, float aabbMaxX, float aabbMaxY, float scaleX, float scaleY, @ExtractionParam T res)
	{
		float aabbMinX = aabbMin.x();
		float aabbMinY = aabbMin.y();
		
		float scaledMaxX = MathUtils.fma(scaleX, aabbMaxX - aabbMinX, aabbMinX);
		float scaledMaxY = MathUtils.fma(scaleY, aabbMaxY - aabbMinY, aabbMinY);
		
		float newMinX = MathUtils.min(aabbMinX, scaledMaxX);
		float newMinY = MathUtils.min(aabbMinY, scaledMaxY);
		float newMaxX = MathUtils.max(aabbMinX, scaledMaxX);
		float newMaxY = MathUtils.max(aabbMinY, scaledMaxY);
		
		res.set(newMinX, newMinY, newMaxX, newMaxY);
		
		return res;
	}
	
	public static <T extends IAabb2WF> T scaleFromMin(float[] aabbMin, IVec2RF aabbMax, IVec2RF scale, @ExtractionParam T res)
	{
		float aabbMinX = aabbMin[0];
		float aabbMinY = aabbMin[1];
		float aabbMaxX = aabbMax.x();
		float aabbMaxY = aabbMax.y();
		
		float scaleX = scale.x();
		float scaleY = scale.y();
		
		float scaledMaxX = MathUtils.fma(scaleX, aabbMaxX - aabbMinX, aabbMinX);
		float scaledMaxY = MathUtils.fma(scaleY, aabbMaxY - aabbMinY, aabbMinY);
		
		float newMinX = MathUtils.min(aabbMinX, scaledMaxX);
		float newMinY = MathUtils.min(aabbMinY, scaledMaxY);
		float newMaxX = MathUtils.max(aabbMinX, scaledMaxX);
		float newMaxY = MathUtils.max(aabbMinY, scaledMaxY);
		
		res.set(newMinX, newMinY, newMaxX, newMaxY);
		
		return res;
	}
	
	public static <T extends IAabb2WF> T scaleFromMin(float[] aabbMin, IVec2RF aabbMax, float[] scale, @ExtractionParam T res)
	{
		float aabbMinX = aabbMin[0];
		float aabbMinY = aabbMin[1];
		float aabbMaxX = aabbMax.x();
		float aabbMaxY = aabbMax.y();
		
		float scaleX = scale[0];
		float scaleY = scale[1];
		
		float scaledMaxX = MathUtils.fma(scaleX, aabbMaxX - aabbMinX, aabbMinX);
		float scaledMaxY = MathUtils.fma(scaleY, aabbMaxY - aabbMinY, aabbMinY);
		
		float newMinX = MathUtils.min(aabbMinX, scaledMaxX);
		float newMinY = MathUtils.min(aabbMinY, scaledMaxY);
		float newMaxX = MathUtils.max(aabbMinX, scaledMaxX);
		float newMaxY = MathUtils.max(aabbMinY, scaledMaxY);
		
		res.set(newMinX, newMinY, newMaxX, newMaxY);
		
		return res;
	}
	
	public static <T extends IAabb2WF> T scaleFromMin(float[] aabbMin, IVec2RF aabbMax, float scaleX, float scaleY, @ExtractionParam T res)
	{
		float aabbMinX = aabbMin[0];
		float aabbMinY = aabbMin[1];
		float aabbMaxX = aabbMax.x();
		float aabbMaxY = aabbMax.y();
		
		float scaledMaxX = MathUtils.fma(scaleX, aabbMaxX - aabbMinX, aabbMinX);
		float scaledMaxY = MathUtils.fma(scaleY, aabbMaxY - aabbMinY, aabbMinY);
		
		float newMinX = MathUtils.min(aabbMinX, scaledMaxX);
		float newMinY = MathUtils.min(aabbMinY, scaledMaxY);
		float newMaxX = MathUtils.max(aabbMinX, scaledMaxX);
		float newMaxY = MathUtils.max(aabbMinY, scaledMaxY);
		
		res.set(newMinX, newMinY, newMaxX, newMaxY);
		
		return res;
	}
	
	public static <T extends IAabb2WF> T scaleFromMin(float[] aabbMin, float[] aabbMax, IVec2RF scale, @ExtractionParam T res)
	{
		float aabbMinX = aabbMin[0];
		float aabbMinY = aabbMin[1];
		float aabbMaxX = aabbMax[0];
		float aabbMaxY = aabbMax[1];
		
		float scaleX = scale.x();
		float scaleY = scale.y();
		
		float scaledMaxX = MathUtils.fma(scaleX, aabbMaxX - aabbMinX, aabbMinX);
		float scaledMaxY = MathUtils.fma(scaleY, aabbMaxY - aabbMinY, aabbMinY);
		
		float newMinX = MathUtils.min(aabbMinX, scaledMaxX);
		float newMinY = MathUtils.min(aabbMinY, scaledMaxY);
		float newMaxX = MathUtils.max(aabbMinX, scaledMaxX);
		float newMaxY = MathUtils.max(aabbMinY, scaledMaxY);
		
		res.set(newMinX, newMinY, newMaxX, newMaxY);
		
		return res;
	}
	
	public static <T extends IAabb2WF> T scaleFromMin(float[] aabbMin, float[] aabbMax, float[] scale, @ExtractionParam T res)
	{
		float aabbMinX = aabbMin[0];
		float aabbMinY = aabbMin[1];
		float aabbMaxX = aabbMax[0];
		float aabbMaxY = aabbMax[1];
		
		float scaleX = scale[0];
		float scaleY = scale[1];
		
		float scaledMaxX = MathUtils.fma(scaleX, aabbMaxX - aabbMinX, aabbMinX);
		float scaledMaxY = MathUtils.fma(scaleY, aabbMaxY - aabbMinY, aabbMinY);
		
		float newMinX = MathUtils.min(aabbMinX, scaledMaxX);
		float newMinY = MathUtils.min(aabbMinY, scaledMaxY);
		float newMaxX = MathUtils.max(aabbMinX, scaledMaxX);
		float newMaxY = MathUtils.max(aabbMinY, scaledMaxY);
		
		res.set(newMinX, newMinY, newMaxX, newMaxY);
		
		return res;
	}
	
	public static <T extends IAabb2WF> T scaleFromMin(float[] aabbMin, float[] aabbMax, float scaleX, float scaleY, @ExtractionParam T res)
	{
		float aabbMinX = aabbMin[0];
		float aabbMinY = aabbMin[1];
		float aabbMaxX = aabbMax[0];
		float aabbMaxY = aabbMax[1];
		
		float scaledMaxX = MathUtils.fma(scaleX, aabbMaxX - aabbMinX, aabbMinX);
		float scaledMaxY = MathUtils.fma(scaleY, aabbMaxY - aabbMinY, aabbMinY);
		
		float newMinX = MathUtils.min(aabbMinX, scaledMaxX);
		float newMinY = MathUtils.min(aabbMinY, scaledMaxY);
		float newMaxX = MathUtils.max(aabbMinX, scaledMaxX);
		float newMaxY = MathUtils.max(aabbMinY, scaledMaxY);
		
		res.set(newMinX, newMinY, newMaxX, newMaxY);
		
		return res;
	}
	
	public static <T extends IAabb2WF> T scaleFromMin(float[] aabbMin, float aabbMaxX, float aabbMaxY, IVec2RF scale, @ExtractionParam T res)
	{
		float aabbMinX = aabbMin[0];
		float aabbMinY = aabbMin[1];
		
		float scaleX = scale.x();
		float scaleY = scale.y();
		
		float scaledMaxX = MathUtils.fma(scaleX, aabbMaxX - aabbMinX, aabbMinX);
		float scaledMaxY = MathUtils.fma(scaleY, aabbMaxY - aabbMinY, aabbMinY);
		
		float newMinX = MathUtils.min(aabbMinX, scaledMaxX);
		float newMinY = MathUtils.min(aabbMinY, scaledMaxY);
		float newMaxX = MathUtils.max(aabbMinX, scaledMaxX);
		float newMaxY = MathUtils.max(aabbMinY, scaledMaxY);
		
		res.set(newMinX, newMinY, newMaxX, newMaxY);
		
		return res;
	}
	
	public static <T extends IAabb2WF> T scaleFromMin(float[] aabbMin, float aabbMaxX, float aabbMaxY, float[] scale, @ExtractionParam T res)
	{
		float aabbMinX = aabbMin[0];
		float aabbMinY = aabbMin[1];
		
		float scaleX = scale[0];
		float scaleY = scale[1];
		
		float scaledMaxX = MathUtils.fma(scaleX, aabbMaxX - aabbMinX, aabbMinX);
		float scaledMaxY = MathUtils.fma(scaleY, aabbMaxY - aabbMinY, aabbMinY);
		
		float newMinX = MathUtils.min(aabbMinX, scaledMaxX);
		float newMinY = MathUtils.min(aabbMinY, scaledMaxY);
		float newMaxX = MathUtils.max(aabbMinX, scaledMaxX);
		float newMaxY = MathUtils.max(aabbMinY, scaledMaxY);
		
		res.set(newMinX, newMinY, newMaxX, newMaxY);
		
		return res;
	}
	
	public static <T extends IAabb2WF> T scaleFromMin(float[] aabbMin, float aabbMaxX, float aabbMaxY, float scaleX, float scaleY, @ExtractionParam T res)
	{
		float aabbMinX = aabbMin[0];
		float aabbMinY = aabbMin[1];
		
		float scaledMaxX = MathUtils.fma(scaleX, aabbMaxX - aabbMinX, aabbMinX);
		float scaledMaxY = MathUtils.fma(scaleY, aabbMaxY - aabbMinY, aabbMinY);
		
		float newMinX = MathUtils.min(aabbMinX, scaledMaxX);
		float newMinY = MathUtils.min(aabbMinY, scaledMaxY);
		float newMaxX = MathUtils.max(aabbMinX, scaledMaxX);
		float newMaxY = MathUtils.max(aabbMinY, scaledMaxY);
		
		res.set(newMinX, newMinY, newMaxX, newMaxY);
		
		return res;
	}
	
	public static <T extends IAabb2WF> T scaleFromMin(float aabbMinX, float aabbMinY, IVec2RF aabbMax, IVec2RF scale, @ExtractionParam T res)
	{
		float aabbMaxX = aabbMax.x();
		float aabbMaxY = aabbMax.y();
		
		float scaleX = scale.x();
		float scaleY = scale.y();
		
		float scaledMaxX = MathUtils.fma(scaleX, aabbMaxX - aabbMinX, aabbMinX);
		float scaledMaxY = MathUtils.fma(scaleY, aabbMaxY - aabbMinY, aabbMinY);
		
		float newMinX = MathUtils.min(aabbMinX, scaledMaxX);
		float newMinY = MathUtils.min(aabbMinY, scaledMaxY);
		float newMaxX = MathUtils.max(aabbMinX, scaledMaxX);
		float newMaxY = MathUtils.max(aabbMinY, scaledMaxY);
		
		res.set(newMinX, newMinY, newMaxX, newMaxY);
		
		return res;
	}
	
	public static <T extends IAabb2WF> T scaleFromMin(float aabbMinX, float aabbMinY, IVec2RF aabbMax, float[] scale, @ExtractionParam T res)
	{
		float aabbMaxX = aabbMax.x();
		float aabbMaxY = aabbMax.y();
		
		float scaleX = scale[0];
		float scaleY = scale[1];
		
		float scaledMaxX = MathUtils.fma(scaleX, aabbMaxX - aabbMinX, aabbMinX);
		float scaledMaxY = MathUtils.fma(scaleY, aabbMaxY - aabbMinY, aabbMinY);
		
		float newMinX = MathUtils.min(aabbMinX, scaledMaxX);
		float newMinY = MathUtils.min(aabbMinY, scaledMaxY);
		float newMaxX = MathUtils.max(aabbMinX, scaledMaxX);
		float newMaxY = MathUtils.max(aabbMinY, scaledMaxY);
		
		res.set(newMinX, newMinY, newMaxX, newMaxY);
		
		return res;
	}
	
	public static <T extends IAabb2WF> T scaleFromMin(float aabbMinX, float aabbMinY, IVec2RF aabbMax, float scaleX, float scaleY, @ExtractionParam T res)
	{
		float aabbMaxX = aabbMax.x();
		float aabbMaxY = aabbMax.y();
		
		float scaledMaxX = MathUtils.fma(scaleX, aabbMaxX - aabbMinX, aabbMinX);
		float scaledMaxY = MathUtils.fma(scaleY, aabbMaxY - aabbMinY, aabbMinY);
		
		float newMinX = MathUtils.min(aabbMinX, scaledMaxX);
		float newMinY = MathUtils.min(aabbMinY, scaledMaxY);
		float newMaxX = MathUtils.max(aabbMinX, scaledMaxX);
		float newMaxY = MathUtils.max(aabbMinY, scaledMaxY);
		
		res.set(newMinX, newMinY, newMaxX, newMaxY);
		
		return res;
	}
	
	public static <T extends IAabb2WF> T scaleFromMin(float aabbMinX, float aabbMinY, float[] aabbMax, IVec2RF scale, @ExtractionParam T res)
	{
		float aabbMaxX = aabbMax[0];
		float aabbMaxY = aabbMax[1];
		
		float scaleX = scale.x();
		float scaleY = scale.y();
		
		float scaledMaxX = MathUtils.fma(scaleX, aabbMaxX - aabbMinX, aabbMinX);
		float scaledMaxY = MathUtils.fma(scaleY, aabbMaxY - aabbMinY, aabbMinY);
		
		float newMinX = MathUtils.min(aabbMinX, scaledMaxX);
		float newMinY = MathUtils.min(aabbMinY, scaledMaxY);
		float newMaxX = MathUtils.max(aabbMinX, scaledMaxX);
		float newMaxY = MathUtils.max(aabbMinY, scaledMaxY);
		
		res.set(newMinX, newMinY, newMaxX, newMaxY);
		
		return res;
	}
	
	public static <T extends IAabb2WF> T scaleFromMin(float aabbMinX, float aabbMinY, float[] aabbMax, float[] scale, @ExtractionParam T res)
	{
		float aabbMaxX = aabbMax[0];
		float aabbMaxY = aabbMax[1];
		
		float scaleX = scale[0];
		float scaleY = scale[1];
		
		float scaledMaxX = MathUtils.fma(scaleX, aabbMaxX - aabbMinX, aabbMinX);
		float scaledMaxY = MathUtils.fma(scaleY, aabbMaxY - aabbMinY, aabbMinY);
		
		float newMinX = MathUtils.min(aabbMinX, scaledMaxX);
		float newMinY = MathUtils.min(aabbMinY, scaledMaxY);
		float newMaxX = MathUtils.max(aabbMinX, scaledMaxX);
		float newMaxY = MathUtils.max(aabbMinY, scaledMaxY);
		
		res.set(newMinX, newMinY, newMaxX, newMaxY);
		
		return res;
	}
	
	public static <T extends IAabb2WF> T scaleFromMin(float aabbMinX, float aabbMinY, float[] aabbMax, float scaleX, float scaleY, @ExtractionParam T res)
	{
		float aabbMaxX = aabbMax[0];
		float aabbMaxY = aabbMax[1];
		
		float scaledMaxX = MathUtils.fma(scaleX, aabbMaxX - aabbMinX, aabbMinX);
		float scaledMaxY = MathUtils.fma(scaleY, aabbMaxY - aabbMinY, aabbMinY);
		
		float newMinX = MathUtils.min(aabbMinX, scaledMaxX);
		float newMinY = MathUtils.min(aabbMinY, scaledMaxY);
		float newMaxX = MathUtils.max(aabbMinX, scaledMaxX);
		float newMaxY = MathUtils.max(aabbMinY, scaledMaxY);
		
		res.set(newMinX, newMinY, newMaxX, newMaxY);
		
		return res;
	}
	
	public static <T extends IAabb2WF> T scaleFromMin(float aabbMinX, float aabbMinY, float aabbMaxX, float aabbMaxY, IVec2RF scale, @ExtractionParam T res)
	{
		float scaleX = scale.x();
		float scaleY = scale.y();
		
		float scaledMaxX = MathUtils.fma(scaleX, aabbMaxX - aabbMinX, aabbMinX);
		float scaledMaxY = MathUtils.fma(scaleY, aabbMaxY - aabbMinY, aabbMinY);
		
		float newMinX = MathUtils.min(aabbMinX, scaledMaxX);
		float newMinY = MathUtils.min(aabbMinY, scaledMaxY);
		float newMaxX = MathUtils.max(aabbMinX, scaledMaxX);
		float newMaxY = MathUtils.max(aabbMinY, scaledMaxY);
		
		res.set(newMinX, newMinY, newMaxX, newMaxY);
		
		return res;
	}
	
	public static <T extends IAabb2WF> T scaleFromMin(float aabbMinX, float aabbMinY, float aabbMaxX, float aabbMaxY, float[] scale, @ExtractionParam T res)
	{
		float scaleX = scale[0];
		float scaleY = scale[1];
		
		float scaledMaxX = MathUtils.fma(scaleX, aabbMaxX - aabbMinX, aabbMinX);
		float scaledMaxY = MathUtils.fma(scaleY, aabbMaxY - aabbMinY, aabbMinY);
		
		float newMinX = MathUtils.min(aabbMinX, scaledMaxX);
		float newMinY = MathUtils.min(aabbMinY, scaledMaxY);
		float newMaxX = MathUtils.max(aabbMinX, scaledMaxX);
		float newMaxY = MathUtils.max(aabbMinY, scaledMaxY);
		
		res.set(newMinX, newMinY, newMaxX, newMaxY);
		
		return res;
	}
	
	public static <T extends IAabb2WF> T scaleFromMin(float aabbMinX, float aabbMinY, float aabbMaxX, float aabbMaxY, float scaleX, float scaleY, @ExtractionParam T res)
	{
		float scaledMaxX = MathUtils.fma(scaleX, aabbMaxX - aabbMinX, aabbMinX);
		float scaledMaxY = MathUtils.fma(scaleY, aabbMaxY - aabbMinY, aabbMinY);
		
		float newMinX = MathUtils.min(aabbMinX, scaledMaxX);
		float newMinY = MathUtils.min(aabbMinY, scaledMaxY);
		float newMaxX = MathUtils.max(aabbMinX, scaledMaxX);
		float newMaxY = MathUtils.max(aabbMinY, scaledMaxY);
		
		res.set(newMinX, newMinY, newMaxX, newMaxY);
		
		return res;
	}
	
	public static <T extends IAabb2WF> T scaleFromMinAssign(@ExtractionParam T aabb, IVec2RF scale)
	{
		float aabbMinX = aabb.minX();
		float aabbMinY = aabb.minY();
		float aabbMaxX = aabb.maxX();
		float aabbMaxY = aabb.maxY();
		
		float scaleX = scale.x();
		float scaleY = scale.y();
		
		float scaledMaxX = MathUtils.fma(scaleX, aabbMaxX - aabbMinX, aabbMinX);
		float scaledMaxY = MathUtils.fma(scaleY, aabbMaxY - aabbMinY, aabbMinY);
		
		float newMinX = MathUtils.min(aabbMinX, scaledMaxX);
		float newMinY = MathUtils.min(aabbMinY, scaledMaxY);
		float newMaxX = MathUtils.max(aabbMinX, scaledMaxX);
		float newMaxY = MathUtils.max(aabbMinY, scaledMaxY);
		
		aabb.set(newMinX, newMinY, newMaxX, newMaxY);
		
		return aabb;
	}
	
	public static <T extends IAabb2WF> T scaleFromMinAssign(@ExtractionParam T aabb, float[] scale)
	{
		float aabbMinX = aabb.minX();
		float aabbMinY = aabb.minY();
		float aabbMaxX = aabb.maxX();
		float aabbMaxY = aabb.maxY();
		
		float scaleX = scale[0];
		float scaleY = scale[1];
		
		float scaledMaxX = MathUtils.fma(scaleX, aabbMaxX - aabbMinX, aabbMinX);
		float scaledMaxY = MathUtils.fma(scaleY, aabbMaxY - aabbMinY, aabbMinY);
		
		float newMinX = MathUtils.min(aabbMinX, scaledMaxX);
		float newMinY = MathUtils.min(aabbMinY, scaledMaxY);
		float newMaxX = MathUtils.max(aabbMinX, scaledMaxX);
		float newMaxY = MathUtils.max(aabbMinY, scaledMaxY);
		
		aabb.set(newMinX, newMinY, newMaxX, newMaxY);
		
		return aabb;
	}
	
	public static <T extends IAabb2WF> T scaleFromMinAssign(@ExtractionParam T aabb, float scaleX, float scaleY)
	{
		float aabbMinX = aabb.minX();
		float aabbMinY = aabb.minY();
		float aabbMaxX = aabb.maxX();
		float aabbMaxY = aabb.maxY();
		
		float scaledMaxX = MathUtils.fma(scaleX, aabbMaxX - aabbMinX, aabbMinX);
		float scaledMaxY = MathUtils.fma(scaleY, aabbMaxY - aabbMinY, aabbMinY);
		
		float newMinX = MathUtils.min(aabbMinX, scaledMaxX);
		float newMinY = MathUtils.min(aabbMinY, scaledMaxY);
		float newMaxX = MathUtils.max(aabbMinX, scaledMaxX);
		float newMaxY = MathUtils.max(aabbMinY, scaledMaxY);
		
		aabb.set(newMinX, newMinY, newMaxX, newMaxY);
		
		return aabb;
	}
	
	public static float[] scaleFromMax(IAabb2RF aabb, IVec2RF scale, @ExtractionParam float[] res)
	{
		float aabbMinX = aabb.minX();
		float aabbMinY = aabb.minY();
		float aabbMaxX = aabb.maxX();
		float aabbMaxY = aabb.maxY();
		
		float scaleX = scale.x();
		float scaleY = scale.y();
		
		float scaledMinX = MathUtils.fma(scaleX, -aabbMaxX + aabbMinX, aabbMaxX);
		float scaledMinY = MathUtils.fma(scaleY, -aabbMaxY + aabbMinY, aabbMaxY);
		
		float newMinX = MathUtils.min(scaledMinX, aabbMaxX);
		float newMinY = MathUtils.min(scaledMinY, aabbMaxY);
		float newMaxX = MathUtils.max(scaledMinX, aabbMaxX);
		float newMaxY = MathUtils.max(scaledMinY, aabbMaxY);
		
		res[0] = newMinX;
		res[1] = newMinY;
		res[2] = newMaxX;
		res[3] = newMaxY;
		
		return res;
	}
	
	public static float[] scaleFromMax(IAabb2RF aabb, float[] scale, @ExtractionParam float[] res)
	{
		float aabbMinX = aabb.minX();
		float aabbMinY = aabb.minY();
		float aabbMaxX = aabb.maxX();
		float aabbMaxY = aabb.maxY();
		
		float scaleX = scale[0];
		float scaleY = scale[1];
		
		float scaledMinX = MathUtils.fma(scaleX, -aabbMaxX + aabbMinX, aabbMaxX);
		float scaledMinY = MathUtils.fma(scaleY, -aabbMaxY + aabbMinY, aabbMaxY);
		
		float newMinX = MathUtils.min(scaledMinX, aabbMaxX);
		float newMinY = MathUtils.min(scaledMinY, aabbMaxY);
		float newMaxX = MathUtils.max(scaledMinX, aabbMaxX);
		float newMaxY = MathUtils.max(scaledMinY, aabbMaxY);
		
		res[0] = newMinX;
		res[1] = newMinY;
		res[2] = newMaxX;
		res[3] = newMaxY;
		
		return res;
	}
	
	public static float[] scaleFromMax(IAabb2RF aabb, float scaleX, float scaleY, @ExtractionParam float[] res)
	{
		float aabbMinX = aabb.minX();
		float aabbMinY = aabb.minY();
		float aabbMaxX = aabb.maxX();
		float aabbMaxY = aabb.maxY();
		
		float scaledMinX = MathUtils.fma(scaleX, -aabbMaxX + aabbMinX, aabbMaxX);
		float scaledMinY = MathUtils.fma(scaleY, -aabbMaxY + aabbMinY, aabbMaxY);
		
		float newMinX = MathUtils.min(scaledMinX, aabbMaxX);
		float newMinY = MathUtils.min(scaledMinY, aabbMaxY);
		float newMaxX = MathUtils.max(scaledMinX, aabbMaxX);
		float newMaxY = MathUtils.max(scaledMinY, aabbMaxY);
		
		res[0] = newMinX;
		res[1] = newMinY;
		res[2] = newMaxX;
		res[3] = newMaxY;
		
		return res;
	}
	
	public static float[] scaleFromMax(float[] aabb, IVec2RF scale, @ExtractionParam float[] res)
	{
		float aabbMinX = aabb[0];
		float aabbMinY = aabb[1];
		float aabbMaxX = aabb[2];
		float aabbMaxY = aabb[3];
		
		float scaleX = scale.x();
		float scaleY = scale.y();
		
		float scaledMinX = MathUtils.fma(scaleX, -aabbMaxX + aabbMinX, aabbMaxX);
		float scaledMinY = MathUtils.fma(scaleY, -aabbMaxY + aabbMinY, aabbMaxY);
		
		float newMinX = MathUtils.min(scaledMinX, aabbMaxX);
		float newMinY = MathUtils.min(scaledMinY, aabbMaxY);
		float newMaxX = MathUtils.max(scaledMinX, aabbMaxX);
		float newMaxY = MathUtils.max(scaledMinY, aabbMaxY);
		
		res[0] = newMinX;
		res[1] = newMinY;
		res[2] = newMaxX;
		res[3] = newMaxY;
		
		return res;
	}
	
	public static float[] scaleFromMax(IVec2RF aabbMin, IVec2RF aabbMax, IVec2RF scale, @ExtractionParam float[] res)
	{
		float aabbMinX = aabbMin.x();
		float aabbMinY = aabbMin.y();
		float aabbMaxX = aabbMax.x();
		float aabbMaxY = aabbMax.y();
		
		float scaleX = scale.x();
		float scaleY = scale.y();
		
		float scaledMinX = MathUtils.fma(scaleX, -aabbMaxX + aabbMinX, aabbMaxX);
		float scaledMinY = MathUtils.fma(scaleY, -aabbMaxY + aabbMinY, aabbMaxY);
		
		float newMinX = MathUtils.min(scaledMinX, aabbMaxX);
		float newMinY = MathUtils.min(scaledMinY, aabbMaxY);
		float newMaxX = MathUtils.max(scaledMinX, aabbMaxX);
		float newMaxY = MathUtils.max(scaledMinY, aabbMaxY);
		
		res[0] = newMinX;
		res[1] = newMinY;
		res[2] = newMaxX;
		res[3] = newMaxY;
		
		return res;
	}
	
	public static float[] scaleFromMax(IVec2RF aabbMin, IVec2RF aabbMax, float[] scale, @ExtractionParam float[] res)
	{
		float aabbMinX = aabbMin.x();
		float aabbMinY = aabbMin.y();
		float aabbMaxX = aabbMax.x();
		float aabbMaxY = aabbMax.y();
		
		float scaleX = scale[0];
		float scaleY = scale[1];
		
		float scaledMinX = MathUtils.fma(scaleX, -aabbMaxX + aabbMinX, aabbMaxX);
		float scaledMinY = MathUtils.fma(scaleY, -aabbMaxY + aabbMinY, aabbMaxY);
		
		float newMinX = MathUtils.min(scaledMinX, aabbMaxX);
		float newMinY = MathUtils.min(scaledMinY, aabbMaxY);
		float newMaxX = MathUtils.max(scaledMinX, aabbMaxX);
		float newMaxY = MathUtils.max(scaledMinY, aabbMaxY);
		
		res[0] = newMinX;
		res[1] = newMinY;
		res[2] = newMaxX;
		res[3] = newMaxY;
		
		return res;
	}
	
	public static float[] scaleFromMax(IVec2RF aabbMin, IVec2RF aabbMax, float scaleX, float scaleY, @ExtractionParam float[] res)
	{
		float aabbMinX = aabbMin.x();
		float aabbMinY = aabbMin.y();
		float aabbMaxX = aabbMax.x();
		float aabbMaxY = aabbMax.y();
		
		float scaledMinX = MathUtils.fma(scaleX, -aabbMaxX + aabbMinX, aabbMaxX);
		float scaledMinY = MathUtils.fma(scaleY, -aabbMaxY + aabbMinY, aabbMaxY);
		
		float newMinX = MathUtils.min(scaledMinX, aabbMaxX);
		float newMinY = MathUtils.min(scaledMinY, aabbMaxY);
		float newMaxX = MathUtils.max(scaledMinX, aabbMaxX);
		float newMaxY = MathUtils.max(scaledMinY, aabbMaxY);
		
		res[0] = newMinX;
		res[1] = newMinY;
		res[2] = newMaxX;
		res[3] = newMaxY;
		
		return res;
	}
	
	public static float[] scaleFromMax(IVec2RF aabbMin, float[] aabbMax, IVec2RF scale, @ExtractionParam float[] res)
	{
		float aabbMinX = aabbMin.x();
		float aabbMinY = aabbMin.y();
		float aabbMaxX = aabbMax[0];
		float aabbMaxY = aabbMax[1];
		
		float scaleX = scale.x();
		float scaleY = scale.y();
		
		float scaledMinX = MathUtils.fma(scaleX, -aabbMaxX + aabbMinX, aabbMaxX);
		float scaledMinY = MathUtils.fma(scaleY, -aabbMaxY + aabbMinY, aabbMaxY);
		
		float newMinX = MathUtils.min(scaledMinX, aabbMaxX);
		float newMinY = MathUtils.min(scaledMinY, aabbMaxY);
		float newMaxX = MathUtils.max(scaledMinX, aabbMaxX);
		float newMaxY = MathUtils.max(scaledMinY, aabbMaxY);
		
		res[0] = newMinX;
		res[1] = newMinY;
		res[2] = newMaxX;
		res[3] = newMaxY;
		
		return res;
	}
	
	public static float[] scaleFromMax(IVec2RF aabbMin, float[] aabbMax, float[] scale, @ExtractionParam float[] res)
	{
		float aabbMinX = aabbMin.x();
		float aabbMinY = aabbMin.y();
		float aabbMaxX = aabbMax[0];
		float aabbMaxY = aabbMax[1];
		
		float scaleX = scale[0];
		float scaleY = scale[1];
		
		float scaledMinX = MathUtils.fma(scaleX, -aabbMaxX + aabbMinX, aabbMaxX);
		float scaledMinY = MathUtils.fma(scaleY, -aabbMaxY + aabbMinY, aabbMaxY);
		
		float newMinX = MathUtils.min(scaledMinX, aabbMaxX);
		float newMinY = MathUtils.min(scaledMinY, aabbMaxY);
		float newMaxX = MathUtils.max(scaledMinX, aabbMaxX);
		float newMaxY = MathUtils.max(scaledMinY, aabbMaxY);
		
		res[0] = newMinX;
		res[1] = newMinY;
		res[2] = newMaxX;
		res[3] = newMaxY;
		
		return res;
	}
	
	public static float[] scaleFromMax(IVec2RF aabbMin, float[] aabbMax, float scaleX, float scaleY, @ExtractionParam float[] res)
	{
		float aabbMinX = aabbMin.x();
		float aabbMinY = aabbMin.y();
		float aabbMaxX = aabbMax[0];
		float aabbMaxY = aabbMax[1];
		
		float scaledMinX = MathUtils.fma(scaleX, -aabbMaxX + aabbMinX, aabbMaxX);
		float scaledMinY = MathUtils.fma(scaleY, -aabbMaxY + aabbMinY, aabbMaxY);
		
		float newMinX = MathUtils.min(scaledMinX, aabbMaxX);
		float newMinY = MathUtils.min(scaledMinY, aabbMaxY);
		float newMaxX = MathUtils.max(scaledMinX, aabbMaxX);
		float newMaxY = MathUtils.max(scaledMinY, aabbMaxY);
		
		res[0] = newMinX;
		res[1] = newMinY;
		res[2] = newMaxX;
		res[3] = newMaxY;
		
		return res;
	}
	
	public static float[] scaleFromMax(IVec2RF aabbMin, float aabbMaxX, float aabbMaxY, IVec2RF scale, @ExtractionParam float[] res)
	{
		float aabbMinX = aabbMin.x();
		float aabbMinY = aabbMin.y();
		
		float scaleX = scale.x();
		float scaleY = scale.y();
		
		float scaledMinX = MathUtils.fma(scaleX, -aabbMaxX + aabbMinX, aabbMaxX);
		float scaledMinY = MathUtils.fma(scaleY, -aabbMaxY + aabbMinY, aabbMaxY);
		
		float newMinX = MathUtils.min(scaledMinX, aabbMaxX);
		float newMinY = MathUtils.min(scaledMinY, aabbMaxY);
		float newMaxX = MathUtils.max(scaledMinX, aabbMaxX);
		float newMaxY = MathUtils.max(scaledMinY, aabbMaxY);
		
		res[0] = newMinX;
		res[1] = newMinY;
		res[2] = newMaxX;
		res[3] = newMaxY;
		
		return res;
	}
	
	public static float[] scaleFromMax(IVec2RF aabbMin, float aabbMaxX, float aabbMaxY, float[] scale, @ExtractionParam float[] res)
	{
		float aabbMinX = aabbMin.x();
		float aabbMinY = aabbMin.y();
		
		float scaleX = scale[0];
		float scaleY = scale[1];
		
		float scaledMinX = MathUtils.fma(scaleX, -aabbMaxX + aabbMinX, aabbMaxX);
		float scaledMinY = MathUtils.fma(scaleY, -aabbMaxY + aabbMinY, aabbMaxY);
		
		float newMinX = MathUtils.min(scaledMinX, aabbMaxX);
		float newMinY = MathUtils.min(scaledMinY, aabbMaxY);
		float newMaxX = MathUtils.max(scaledMinX, aabbMaxX);
		float newMaxY = MathUtils.max(scaledMinY, aabbMaxY);
		
		res[0] = newMinX;
		res[1] = newMinY;
		res[2] = newMaxX;
		res[3] = newMaxY;
		
		return res;
	}
	
	public static float[] scaleFromMax(IVec2RF aabbMin, float aabbMaxX, float aabbMaxY, float scaleX, float scaleY, @ExtractionParam float[] res)
	{
		float aabbMinX = aabbMin.x();
		float aabbMinY = aabbMin.y();
		
		float scaledMinX = MathUtils.fma(scaleX, -aabbMaxX + aabbMinX, aabbMaxX);
		float scaledMinY = MathUtils.fma(scaleY, -aabbMaxY + aabbMinY, aabbMaxY);
		
		float newMinX = MathUtils.min(scaledMinX, aabbMaxX);
		float newMinY = MathUtils.min(scaledMinY, aabbMaxY);
		float newMaxX = MathUtils.max(scaledMinX, aabbMaxX);
		float newMaxY = MathUtils.max(scaledMinY, aabbMaxY);
		
		res[0] = newMinX;
		res[1] = newMinY;
		res[2] = newMaxX;
		res[3] = newMaxY;
		
		return res;
	}
	
	public static float[] scaleFromMax(float[] aabbMin, IVec2RF aabbMax, IVec2RF scale, @ExtractionParam float[] res)
	{
		float aabbMinX = aabbMin[0];
		float aabbMinY = aabbMin[1];
		float aabbMaxX = aabbMax.x();
		float aabbMaxY = aabbMax.y();
		
		float scaleX = scale.x();
		float scaleY = scale.y();
		
		float scaledMinX = MathUtils.fma(scaleX, -aabbMaxX + aabbMinX, aabbMaxX);
		float scaledMinY = MathUtils.fma(scaleY, -aabbMaxY + aabbMinY, aabbMaxY);
		
		float newMinX = MathUtils.min(scaledMinX, aabbMaxX);
		float newMinY = MathUtils.min(scaledMinY, aabbMaxY);
		float newMaxX = MathUtils.max(scaledMinX, aabbMaxX);
		float newMaxY = MathUtils.max(scaledMinY, aabbMaxY);
		
		res[0] = newMinX;
		res[1] = newMinY;
		res[2] = newMaxX;
		res[3] = newMaxY;
		
		return res;
	}
	
	public static float[] scaleFromMax(float[] aabbMin, IVec2RF aabbMax, float[] scale, @ExtractionParam float[] res)
	{
		float aabbMinX = aabbMin[0];
		float aabbMinY = aabbMin[1];
		float aabbMaxX = aabbMax.x();
		float aabbMaxY = aabbMax.y();
		
		float scaleX = scale[0];
		float scaleY = scale[1];
		
		float scaledMinX = MathUtils.fma(scaleX, -aabbMaxX + aabbMinX, aabbMaxX);
		float scaledMinY = MathUtils.fma(scaleY, -aabbMaxY + aabbMinY, aabbMaxY);
		
		float newMinX = MathUtils.min(scaledMinX, aabbMaxX);
		float newMinY = MathUtils.min(scaledMinY, aabbMaxY);
		float newMaxX = MathUtils.max(scaledMinX, aabbMaxX);
		float newMaxY = MathUtils.max(scaledMinY, aabbMaxY);
		
		res[0] = newMinX;
		res[1] = newMinY;
		res[2] = newMaxX;
		res[3] = newMaxY;
		
		return res;
	}
	
	public static float[] scaleFromMax(float[] aabbMin, IVec2RF aabbMax, float scaleX, float scaleY, @ExtractionParam float[] res)
	{
		float aabbMinX = aabbMin[0];
		float aabbMinY = aabbMin[1];
		float aabbMaxX = aabbMax.x();
		float aabbMaxY = aabbMax.y();
		
		float scaledMinX = MathUtils.fma(scaleX, -aabbMaxX + aabbMinX, aabbMaxX);
		float scaledMinY = MathUtils.fma(scaleY, -aabbMaxY + aabbMinY, aabbMaxY);
		
		float newMinX = MathUtils.min(scaledMinX, aabbMaxX);
		float newMinY = MathUtils.min(scaledMinY, aabbMaxY);
		float newMaxX = MathUtils.max(scaledMinX, aabbMaxX);
		float newMaxY = MathUtils.max(scaledMinY, aabbMaxY);
		
		res[0] = newMinX;
		res[1] = newMinY;
		res[2] = newMaxX;
		res[3] = newMaxY;
		
		return res;
	}
	
	public static float[] scaleFromMax(float[] aabbMin, float[] aabbMax, IVec2RF scale, @ExtractionParam float[] res)
	{
		float aabbMinX = aabbMin[0];
		float aabbMinY = aabbMin[1];
		float aabbMaxX = aabbMax[0];
		float aabbMaxY = aabbMax[1];
		
		float scaleX = scale.x();
		float scaleY = scale.y();
		
		float scaledMinX = MathUtils.fma(scaleX, -aabbMaxX + aabbMinX, aabbMaxX);
		float scaledMinY = MathUtils.fma(scaleY, -aabbMaxY + aabbMinY, aabbMaxY);
		
		float newMinX = MathUtils.min(scaledMinX, aabbMaxX);
		float newMinY = MathUtils.min(scaledMinY, aabbMaxY);
		float newMaxX = MathUtils.max(scaledMinX, aabbMaxX);
		float newMaxY = MathUtils.max(scaledMinY, aabbMaxY);
		
		res[0] = newMinX;
		res[1] = newMinY;
		res[2] = newMaxX;
		res[3] = newMaxY;
		
		return res;
	}
	
	public static float[] scaleFromMax(float[] aabbMin, float aabbMaxX, float aabbMaxY, IVec2RF scale, @ExtractionParam float[] res)
	{
		float aabbMinX = aabbMin[0];
		float aabbMinY = aabbMin[1];
		
		float scaleX = scale.x();
		float scaleY = scale.y();
		
		float scaledMinX = MathUtils.fma(scaleX, -aabbMaxX + aabbMinX, aabbMaxX);
		float scaledMinY = MathUtils.fma(scaleY, -aabbMaxY + aabbMinY, aabbMaxY);
		
		float newMinX = MathUtils.min(scaledMinX, aabbMaxX);
		float newMinY = MathUtils.min(scaledMinY, aabbMaxY);
		float newMaxX = MathUtils.max(scaledMinX, aabbMaxX);
		float newMaxY = MathUtils.max(scaledMinY, aabbMaxY);
		
		res[0] = newMinX;
		res[1] = newMinY;
		res[2] = newMaxX;
		res[3] = newMaxY;
		
		return res;
	}
	
	public static float[] scaleFromMax(float aabbMinX, float aabbMinY, IVec2RF aabbMax, IVec2RF scale, @ExtractionParam float[] res)
	{
		float aabbMaxX = aabbMax.x();
		float aabbMaxY = aabbMax.y();
		
		float scaleX = scale.x();
		float scaleY = scale.y();
		
		float scaledMinX = MathUtils.fma(scaleX, -aabbMaxX + aabbMinX, aabbMaxX);
		float scaledMinY = MathUtils.fma(scaleY, -aabbMaxY + aabbMinY, aabbMaxY);
		
		float newMinX = MathUtils.min(scaledMinX, aabbMaxX);
		float newMinY = MathUtils.min(scaledMinY, aabbMaxY);
		float newMaxX = MathUtils.max(scaledMinX, aabbMaxX);
		float newMaxY = MathUtils.max(scaledMinY, aabbMaxY);
		
		res[0] = newMinX;
		res[1] = newMinY;
		res[2] = newMaxX;
		res[3] = newMaxY;
		
		return res;
	}
	
	public static float[] scaleFromMax(float aabbMinX, float aabbMinY, IVec2RF aabbMax, float[] scale, @ExtractionParam float[] res)
	{
		float aabbMaxX = aabbMax.x();
		float aabbMaxY = aabbMax.y();
		
		float scaleX = scale[0];
		float scaleY = scale[1];
		
		float scaledMinX = MathUtils.fma(scaleX, -aabbMaxX + aabbMinX, aabbMaxX);
		float scaledMinY = MathUtils.fma(scaleY, -aabbMaxY + aabbMinY, aabbMaxY);
		
		float newMinX = MathUtils.min(scaledMinX, aabbMaxX);
		float newMinY = MathUtils.min(scaledMinY, aabbMaxY);
		float newMaxX = MathUtils.max(scaledMinX, aabbMaxX);
		float newMaxY = MathUtils.max(scaledMinY, aabbMaxY);
		
		res[0] = newMinX;
		res[1] = newMinY;
		res[2] = newMaxX;
		res[3] = newMaxY;
		
		return res;
	}
	
	public static float[] scaleFromMax(float aabbMinX, float aabbMinY, IVec2RF aabbMax, float scaleX, float scaleY, @ExtractionParam float[] res)
	{
		float aabbMaxX = aabbMax.x();
		float aabbMaxY = aabbMax.y();
		
		float scaledMinX = MathUtils.fma(scaleX, -aabbMaxX + aabbMinX, aabbMaxX);
		float scaledMinY = MathUtils.fma(scaleY, -aabbMaxY + aabbMinY, aabbMaxY);
		
		float newMinX = MathUtils.min(scaledMinX, aabbMaxX);
		float newMinY = MathUtils.min(scaledMinY, aabbMaxY);
		float newMaxX = MathUtils.max(scaledMinX, aabbMaxX);
		float newMaxY = MathUtils.max(scaledMinY, aabbMaxY);
		
		res[0] = newMinX;
		res[1] = newMinY;
		res[2] = newMaxX;
		res[3] = newMaxY;
		
		return res;
	}
	
	public static float[] scaleFromMax(float aabbMinX, float aabbMinY, float[] aabbMax, IVec2RF scale, @ExtractionParam float[] res)
	{
		float aabbMaxX = aabbMax[0];
		float aabbMaxY = aabbMax[1];
		
		float scaleX = scale.x();
		float scaleY = scale.y();
		
		float scaledMinX = MathUtils.fma(scaleX, -aabbMaxX + aabbMinX, aabbMaxX);
		float scaledMinY = MathUtils.fma(scaleY, -aabbMaxY + aabbMinY, aabbMaxY);
		
		float newMinX = MathUtils.min(scaledMinX, aabbMaxX);
		float newMinY = MathUtils.min(scaledMinY, aabbMaxY);
		float newMaxX = MathUtils.max(scaledMinX, aabbMaxX);
		float newMaxY = MathUtils.max(scaledMinY, aabbMaxY);
		
		res[0] = newMinX;
		res[1] = newMinY;
		res[2] = newMaxX;
		res[3] = newMaxY;
		
		return res;
	}
	
	public static float[] scaleFromMax(float aabbMinX, float aabbMinY, float aabbMaxX, float aabbMaxY, IVec2RF scale, @ExtractionParam float[] res)
	{
		float scaleX = scale.x();
		float scaleY = scale.y();
		
		float scaledMinX = MathUtils.fma(scaleX, -aabbMaxX + aabbMinX, aabbMaxX);
		float scaledMinY = MathUtils.fma(scaleY, -aabbMaxY + aabbMinY, aabbMaxY);
		
		float newMinX = MathUtils.min(scaledMinX, aabbMaxX);
		float newMinY = MathUtils.min(scaledMinY, aabbMaxY);
		float newMaxX = MathUtils.max(scaledMinX, aabbMaxX);
		float newMaxY = MathUtils.max(scaledMinY, aabbMaxY);
		
		res[0] = newMinX;
		res[1] = newMinY;
		res[2] = newMaxX;
		res[3] = newMaxY;
		
		return res;
	}
	
	public static float[] scaleFromMaxAssign(@ExtractionParam float[] aabb, IVec2RF scale)
	{
		float aabbMinX = aabb[0];
		float aabbMinY = aabb[1];
		float aabbMaxX = aabb[2];
		float aabbMaxY = aabb[3];
		
		float scaleX = scale.x();
		float scaleY = scale.y();
		
		float scaledMinX = MathUtils.fma(scaleX, -aabbMaxX + aabbMinX, aabbMaxX);
		float scaledMinY = MathUtils.fma(scaleY, -aabbMaxY + aabbMinY, aabbMaxY);
		
		float newMinX = MathUtils.min(scaledMinX, aabbMaxX);
		float newMinY = MathUtils.min(scaledMinY, aabbMaxY);
		float newMaxX = MathUtils.max(scaledMinX, aabbMaxX);
		float newMaxY = MathUtils.max(scaledMinY, aabbMaxY);
		
		aabb[0] = newMinX;
		aabb[1] = newMinY;
		aabb[2] = newMaxX;
		aabb[3] = newMaxY;
		
		return aabb;
	}
	
	public static <T extends IAabb2WF> T scaleFromMax(IAabb2RF aabb, IVec2RF scale, @ExtractionParam T res)
	{
		float aabbMinX = aabb.minX();
		float aabbMinY = aabb.minY();
		float aabbMaxX = aabb.maxX();
		float aabbMaxY = aabb.maxY();
		
		float scaleX = scale.x();
		float scaleY = scale.y();
		
		float scaledMinX = MathUtils.fma(scaleX, -aabbMaxX + aabbMinX, aabbMaxX);
		float scaledMinY = MathUtils.fma(scaleY, -aabbMaxY + aabbMinY, aabbMaxY);
		
		float newMinX = MathUtils.min(scaledMinX, aabbMaxX);
		float newMinY = MathUtils.min(scaledMinY, aabbMaxY);
		float newMaxX = MathUtils.max(scaledMinX, aabbMaxX);
		float newMaxY = MathUtils.max(scaledMinY, aabbMaxY);
		
		res.set(newMinX, newMinY, newMaxX, newMaxY);
		
		return res;
	}
	
	public static <T extends IAabb2WF> T scaleFromMax(IAabb2RF aabb, float[] scale, @ExtractionParam T res)
	{
		float aabbMinX = aabb.minX();
		float aabbMinY = aabb.minY();
		float aabbMaxX = aabb.maxX();
		float aabbMaxY = aabb.maxY();
		
		float scaleX = scale[0];
		float scaleY = scale[1];
		
		float scaledMinX = MathUtils.fma(scaleX, -aabbMaxX + aabbMinX, aabbMaxX);
		float scaledMinY = MathUtils.fma(scaleY, -aabbMaxY + aabbMinY, aabbMaxY);
		
		float newMinX = MathUtils.min(scaledMinX, aabbMaxX);
		float newMinY = MathUtils.min(scaledMinY, aabbMaxY);
		float newMaxX = MathUtils.max(scaledMinX, aabbMaxX);
		float newMaxY = MathUtils.max(scaledMinY, aabbMaxY);
		
		res.set(newMinX, newMinY, newMaxX, newMaxY);
		
		return res;
	}
	
	public static <T extends IAabb2WF> T scaleFromMax(IAabb2RF aabb, float scaleX, float scaleY, @ExtractionParam T res)
	{
		float aabbMinX = aabb.minX();
		float aabbMinY = aabb.minY();
		float aabbMaxX = aabb.maxX();
		float aabbMaxY = aabb.maxY();
		
		float scaledMinX = MathUtils.fma(scaleX, -aabbMaxX + aabbMinX, aabbMaxX);
		float scaledMinY = MathUtils.fma(scaleY, -aabbMaxY + aabbMinY, aabbMaxY);
		
		float newMinX = MathUtils.min(scaledMinX, aabbMaxX);
		float newMinY = MathUtils.min(scaledMinY, aabbMaxY);
		float newMaxX = MathUtils.max(scaledMinX, aabbMaxX);
		float newMaxY = MathUtils.max(scaledMinY, aabbMaxY);
		
		res.set(newMinX, newMinY, newMaxX, newMaxY);
		
		return res;
	}
	
	public static <T extends IAabb2WF> T scaleFromMax(float[] aabb, IVec2RF scale, @ExtractionParam T res)
	{
		float aabbMinX = aabb[0];
		float aabbMinY = aabb[1];
		float aabbMaxX = aabb[2];
		float aabbMaxY = aabb[3];
		
		float scaleX = scale.x();
		float scaleY = scale.y();
		
		float scaledMinX = MathUtils.fma(scaleX, -aabbMaxX + aabbMinX, aabbMaxX);
		float scaledMinY = MathUtils.fma(scaleY, -aabbMaxY + aabbMinY, aabbMaxY);
		
		float newMinX = MathUtils.min(scaledMinX, aabbMaxX);
		float newMinY = MathUtils.min(scaledMinY, aabbMaxY);
		float newMaxX = MathUtils.max(scaledMinX, aabbMaxX);
		float newMaxY = MathUtils.max(scaledMinY, aabbMaxY);
		
		res.set(newMinX, newMinY, newMaxX, newMaxY);
		
		return res;
	}
	
	public static <T extends IAabb2WF> T scaleFromMax(float[] aabb, float[] scale, @ExtractionParam T res)
	{
		float aabbMinX = aabb[0];
		float aabbMinY = aabb[1];
		float aabbMaxX = aabb[2];
		float aabbMaxY = aabb[3];
		
		float scaleX = scale[0];
		float scaleY = scale[1];
		
		float scaledMinX = MathUtils.fma(scaleX, -aabbMaxX + aabbMinX, aabbMaxX);
		float scaledMinY = MathUtils.fma(scaleY, -aabbMaxY + aabbMinY, aabbMaxY);
		
		float newMinX = MathUtils.min(scaledMinX, aabbMaxX);
		float newMinY = MathUtils.min(scaledMinY, aabbMaxY);
		float newMaxX = MathUtils.max(scaledMinX, aabbMaxX);
		float newMaxY = MathUtils.max(scaledMinY, aabbMaxY);
		
		res.set(newMinX, newMinY, newMaxX, newMaxY);
		
		return res;
	}
	
	public static <T extends IAabb2WF> T scaleFromMax(float[] aabb, float scaleX, float scaleY, @ExtractionParam T res)
	{
		float aabbMinX = aabb[0];
		float aabbMinY = aabb[1];
		float aabbMaxX = aabb[2];
		float aabbMaxY = aabb[3];
		
		float scaledMinX = MathUtils.fma(scaleX, -aabbMaxX + aabbMinX, aabbMaxX);
		float scaledMinY = MathUtils.fma(scaleY, -aabbMaxY + aabbMinY, aabbMaxY);
		
		float newMinX = MathUtils.min(scaledMinX, aabbMaxX);
		float newMinY = MathUtils.min(scaledMinY, aabbMaxY);
		float newMaxX = MathUtils.max(scaledMinX, aabbMaxX);
		float newMaxY = MathUtils.max(scaledMinY, aabbMaxY);
		
		res.set(newMinX, newMinY, newMaxX, newMaxY);
		
		return res;
	}
	
	public static <T extends IAabb2WF> T scaleFromMax(IVec2RF aabbMin, IVec2RF aabbMax, IVec2RF scale, @ExtractionParam T res)
	{
		float aabbMinX = aabbMin.x();
		float aabbMinY = aabbMin.y();
		float aabbMaxX = aabbMax.x();
		float aabbMaxY = aabbMax.y();
		
		float scaleX = scale.x();
		float scaleY = scale.y();
		
		float scaledMinX = MathUtils.fma(scaleX, -aabbMaxX + aabbMinX, aabbMaxX);
		float scaledMinY = MathUtils.fma(scaleY, -aabbMaxY + aabbMinY, aabbMaxY);
		
		float newMinX = MathUtils.min(scaledMinX, aabbMaxX);
		float newMinY = MathUtils.min(scaledMinY, aabbMaxY);
		float newMaxX = MathUtils.max(scaledMinX, aabbMaxX);
		float newMaxY = MathUtils.max(scaledMinY, aabbMaxY);
		
		res.set(newMinX, newMinY, newMaxX, newMaxY);
		
		return res;
	}
	
	public static <T extends IAabb2WF> T scaleFromMax(IVec2RF aabbMin, IVec2RF aabbMax, float[] scale, @ExtractionParam T res)
	{
		float aabbMinX = aabbMin.x();
		float aabbMinY = aabbMin.y();
		float aabbMaxX = aabbMax.x();
		float aabbMaxY = aabbMax.y();
		
		float scaleX = scale[0];
		float scaleY = scale[1];
		
		float scaledMinX = MathUtils.fma(scaleX, -aabbMaxX + aabbMinX, aabbMaxX);
		float scaledMinY = MathUtils.fma(scaleY, -aabbMaxY + aabbMinY, aabbMaxY);
		
		float newMinX = MathUtils.min(scaledMinX, aabbMaxX);
		float newMinY = MathUtils.min(scaledMinY, aabbMaxY);
		float newMaxX = MathUtils.max(scaledMinX, aabbMaxX);
		float newMaxY = MathUtils.max(scaledMinY, aabbMaxY);
		
		res.set(newMinX, newMinY, newMaxX, newMaxY);
		
		return res;
	}
	
	public static <T extends IAabb2WF> T scaleFromMax(IVec2RF aabbMin, IVec2RF aabbMax, float scaleX, float scaleY, @ExtractionParam T res)
	{
		float aabbMinX = aabbMin.x();
		float aabbMinY = aabbMin.y();
		float aabbMaxX = aabbMax.x();
		float aabbMaxY = aabbMax.y();
		
		float scaledMinX = MathUtils.fma(scaleX, -aabbMaxX + aabbMinX, aabbMaxX);
		float scaledMinY = MathUtils.fma(scaleY, -aabbMaxY + aabbMinY, aabbMaxY);
		
		float newMinX = MathUtils.min(scaledMinX, aabbMaxX);
		float newMinY = MathUtils.min(scaledMinY, aabbMaxY);
		float newMaxX = MathUtils.max(scaledMinX, aabbMaxX);
		float newMaxY = MathUtils.max(scaledMinY, aabbMaxY);
		
		res.set(newMinX, newMinY, newMaxX, newMaxY);
		
		return res;
	}
	
	public static <T extends IAabb2WF> T scaleFromMax(IVec2RF aabbMin, float[] aabbMax, IVec2RF scale, @ExtractionParam T res)
	{
		float aabbMinX = aabbMin.x();
		float aabbMinY = aabbMin.y();
		float aabbMaxX = aabbMax[0];
		float aabbMaxY = aabbMax[1];
		
		float scaleX = scale.x();
		float scaleY = scale.y();
		
		float scaledMinX = MathUtils.fma(scaleX, -aabbMaxX + aabbMinX, aabbMaxX);
		float scaledMinY = MathUtils.fma(scaleY, -aabbMaxY + aabbMinY, aabbMaxY);
		
		float newMinX = MathUtils.min(scaledMinX, aabbMaxX);
		float newMinY = MathUtils.min(scaledMinY, aabbMaxY);
		float newMaxX = MathUtils.max(scaledMinX, aabbMaxX);
		float newMaxY = MathUtils.max(scaledMinY, aabbMaxY);
		
		res.set(newMinX, newMinY, newMaxX, newMaxY);
		
		return res;
	}
	
	public static <T extends IAabb2WF> T scaleFromMax(IVec2RF aabbMin, float[] aabbMax, float[] scale, @ExtractionParam T res)
	{
		float aabbMinX = aabbMin.x();
		float aabbMinY = aabbMin.y();
		float aabbMaxX = aabbMax[0];
		float aabbMaxY = aabbMax[1];
		
		float scaleX = scale[0];
		float scaleY = scale[1];
		
		float scaledMinX = MathUtils.fma(scaleX, -aabbMaxX + aabbMinX, aabbMaxX);
		float scaledMinY = MathUtils.fma(scaleY, -aabbMaxY + aabbMinY, aabbMaxY);
		
		float newMinX = MathUtils.min(scaledMinX, aabbMaxX);
		float newMinY = MathUtils.min(scaledMinY, aabbMaxY);
		float newMaxX = MathUtils.max(scaledMinX, aabbMaxX);
		float newMaxY = MathUtils.max(scaledMinY, aabbMaxY);
		
		res.set(newMinX, newMinY, newMaxX, newMaxY);
		
		return res;
	}
	
	public static <T extends IAabb2WF> T scaleFromMax(IVec2RF aabbMin, float[] aabbMax, float scaleX, float scaleY, @ExtractionParam T res)
	{
		float aabbMinX = aabbMin.x();
		float aabbMinY = aabbMin.y();
		float aabbMaxX = aabbMax[0];
		float aabbMaxY = aabbMax[1];
		
		float scaledMinX = MathUtils.fma(scaleX, -aabbMaxX + aabbMinX, aabbMaxX);
		float scaledMinY = MathUtils.fma(scaleY, -aabbMaxY + aabbMinY, aabbMaxY);
		
		float newMinX = MathUtils.min(scaledMinX, aabbMaxX);
		float newMinY = MathUtils.min(scaledMinY, aabbMaxY);
		float newMaxX = MathUtils.max(scaledMinX, aabbMaxX);
		float newMaxY = MathUtils.max(scaledMinY, aabbMaxY);
		
		res.set(newMinX, newMinY, newMaxX, newMaxY);
		
		return res;
	}
	
	public static <T extends IAabb2WF> T scaleFromMax(IVec2RF aabbMin, float aabbMaxX, float aabbMaxY, IVec2RF scale, @ExtractionParam T res)
	{
		float aabbMinX = aabbMin.x();
		float aabbMinY = aabbMin.y();
		
		float scaleX = scale.x();
		float scaleY = scale.y();
		
		float scaledMinX = MathUtils.fma(scaleX, -aabbMaxX + aabbMinX, aabbMaxX);
		float scaledMinY = MathUtils.fma(scaleY, -aabbMaxY + aabbMinY, aabbMaxY);
		
		float newMinX = MathUtils.min(scaledMinX, aabbMaxX);
		float newMinY = MathUtils.min(scaledMinY, aabbMaxY);
		float newMaxX = MathUtils.max(scaledMinX, aabbMaxX);
		float newMaxY = MathUtils.max(scaledMinY, aabbMaxY);
		
		res.set(newMinX, newMinY, newMaxX, newMaxY);
		
		return res;
	}
	
	public static <T extends IAabb2WF> T scaleFromMax(IVec2RF aabbMin, float aabbMaxX, float aabbMaxY, float[] scale, @ExtractionParam T res)
	{
		float aabbMinX = aabbMin.x();
		float aabbMinY = aabbMin.y();
		
		float scaleX = scale[0];
		float scaleY = scale[1];
		
		float scaledMinX = MathUtils.fma(scaleX, -aabbMaxX + aabbMinX, aabbMaxX);
		float scaledMinY = MathUtils.fma(scaleY, -aabbMaxY + aabbMinY, aabbMaxY);
		
		float newMinX = MathUtils.min(scaledMinX, aabbMaxX);
		float newMinY = MathUtils.min(scaledMinY, aabbMaxY);
		float newMaxX = MathUtils.max(scaledMinX, aabbMaxX);
		float newMaxY = MathUtils.max(scaledMinY, aabbMaxY);
		
		res.set(newMinX, newMinY, newMaxX, newMaxY);
		
		return res;
	}
	
	public static <T extends IAabb2WF> T scaleFromMax(IVec2RF aabbMin, float aabbMaxX, float aabbMaxY, float scaleX, float scaleY, @ExtractionParam T res)
	{
		float aabbMinX = aabbMin.x();
		float aabbMinY = aabbMin.y();
		
		float scaledMinX = MathUtils.fma(scaleX, -aabbMaxX + aabbMinX, aabbMaxX);
		float scaledMinY = MathUtils.fma(scaleY, -aabbMaxY + aabbMinY, aabbMaxY);
		
		float newMinX = MathUtils.min(scaledMinX, aabbMaxX);
		float newMinY = MathUtils.min(scaledMinY, aabbMaxY);
		float newMaxX = MathUtils.max(scaledMinX, aabbMaxX);
		float newMaxY = MathUtils.max(scaledMinY, aabbMaxY);
		
		res.set(newMinX, newMinY, newMaxX, newMaxY);
		
		return res;
	}
	
	public static <T extends IAabb2WF> T scaleFromMax(float[] aabbMin, IVec2RF aabbMax, IVec2RF scale, @ExtractionParam T res)
	{
		float aabbMinX = aabbMin[0];
		float aabbMinY = aabbMin[1];
		float aabbMaxX = aabbMax.x();
		float aabbMaxY = aabbMax.y();
		
		float scaleX = scale.x();
		float scaleY = scale.y();
		
		float scaledMinX = MathUtils.fma(scaleX, -aabbMaxX + aabbMinX, aabbMaxX);
		float scaledMinY = MathUtils.fma(scaleY, -aabbMaxY + aabbMinY, aabbMaxY);
		
		float newMinX = MathUtils.min(scaledMinX, aabbMaxX);
		float newMinY = MathUtils.min(scaledMinY, aabbMaxY);
		float newMaxX = MathUtils.max(scaledMinX, aabbMaxX);
		float newMaxY = MathUtils.max(scaledMinY, aabbMaxY);
		
		res.set(newMinX, newMinY, newMaxX, newMaxY);
		
		return res;
	}
	
	public static <T extends IAabb2WF> T scaleFromMax(float[] aabbMin, IVec2RF aabbMax, float[] scale, @ExtractionParam T res)
	{
		float aabbMinX = aabbMin[0];
		float aabbMinY = aabbMin[1];
		float aabbMaxX = aabbMax.x();
		float aabbMaxY = aabbMax.y();
		
		float scaleX = scale[0];
		float scaleY = scale[1];
		
		float scaledMinX = MathUtils.fma(scaleX, -aabbMaxX + aabbMinX, aabbMaxX);
		float scaledMinY = MathUtils.fma(scaleY, -aabbMaxY + aabbMinY, aabbMaxY);
		
		float newMinX = MathUtils.min(scaledMinX, aabbMaxX);
		float newMinY = MathUtils.min(scaledMinY, aabbMaxY);
		float newMaxX = MathUtils.max(scaledMinX, aabbMaxX);
		float newMaxY = MathUtils.max(scaledMinY, aabbMaxY);
		
		res.set(newMinX, newMinY, newMaxX, newMaxY);
		
		return res;
	}
	
	public static <T extends IAabb2WF> T scaleFromMax(float[] aabbMin, IVec2RF aabbMax, float scaleX, float scaleY, @ExtractionParam T res)
	{
		float aabbMinX = aabbMin[0];
		float aabbMinY = aabbMin[1];
		float aabbMaxX = aabbMax.x();
		float aabbMaxY = aabbMax.y();
		
		float scaledMinX = MathUtils.fma(scaleX, -aabbMaxX + aabbMinX, aabbMaxX);
		float scaledMinY = MathUtils.fma(scaleY, -aabbMaxY + aabbMinY, aabbMaxY);
		
		float newMinX = MathUtils.min(scaledMinX, aabbMaxX);
		float newMinY = MathUtils.min(scaledMinY, aabbMaxY);
		float newMaxX = MathUtils.max(scaledMinX, aabbMaxX);
		float newMaxY = MathUtils.max(scaledMinY, aabbMaxY);
		
		res.set(newMinX, newMinY, newMaxX, newMaxY);
		
		return res;
	}
	
	public static <T extends IAabb2WF> T scaleFromMax(float[] aabbMin, float[] aabbMax, IVec2RF scale, @ExtractionParam T res)
	{
		float aabbMinX = aabbMin[0];
		float aabbMinY = aabbMin[1];
		float aabbMaxX = aabbMax[0];
		float aabbMaxY = aabbMax[1];
		
		float scaleX = scale.x();
		float scaleY = scale.y();
		
		float scaledMinX = MathUtils.fma(scaleX, -aabbMaxX + aabbMinX, aabbMaxX);
		float scaledMinY = MathUtils.fma(scaleY, -aabbMaxY + aabbMinY, aabbMaxY);
		
		float newMinX = MathUtils.min(scaledMinX, aabbMaxX);
		float newMinY = MathUtils.min(scaledMinY, aabbMaxY);
		float newMaxX = MathUtils.max(scaledMinX, aabbMaxX);
		float newMaxY = MathUtils.max(scaledMinY, aabbMaxY);
		
		res.set(newMinX, newMinY, newMaxX, newMaxY);
		
		return res;
	}
	
	public static <T extends IAabb2WF> T scaleFromMax(float[] aabbMin, float[] aabbMax, float[] scale, @ExtractionParam T res)
	{
		float aabbMinX = aabbMin[0];
		float aabbMinY = aabbMin[1];
		float aabbMaxX = aabbMax[0];
		float aabbMaxY = aabbMax[1];
		
		float scaleX = scale[0];
		float scaleY = scale[1];
		
		float scaledMinX = MathUtils.fma(scaleX, -aabbMaxX + aabbMinX, aabbMaxX);
		float scaledMinY = MathUtils.fma(scaleY, -aabbMaxY + aabbMinY, aabbMaxY);
		
		float newMinX = MathUtils.min(scaledMinX, aabbMaxX);
		float newMinY = MathUtils.min(scaledMinY, aabbMaxY);
		float newMaxX = MathUtils.max(scaledMinX, aabbMaxX);
		float newMaxY = MathUtils.max(scaledMinY, aabbMaxY);
		
		res.set(newMinX, newMinY, newMaxX, newMaxY);
		
		return res;
	}
	
	public static <T extends IAabb2WF> T scaleFromMax(float[] aabbMin, float[] aabbMax, float scaleX, float scaleY, @ExtractionParam T res)
	{
		float aabbMinX = aabbMin[0];
		float aabbMinY = aabbMin[1];
		float aabbMaxX = aabbMax[0];
		float aabbMaxY = aabbMax[1];
		
		float scaledMinX = MathUtils.fma(scaleX, -aabbMaxX + aabbMinX, aabbMaxX);
		float scaledMinY = MathUtils.fma(scaleY, -aabbMaxY + aabbMinY, aabbMaxY);
		
		float newMinX = MathUtils.min(scaledMinX, aabbMaxX);
		float newMinY = MathUtils.min(scaledMinY, aabbMaxY);
		float newMaxX = MathUtils.max(scaledMinX, aabbMaxX);
		float newMaxY = MathUtils.max(scaledMinY, aabbMaxY);
		
		res.set(newMinX, newMinY, newMaxX, newMaxY);
		
		return res;
	}
	
	public static <T extends IAabb2WF> T scaleFromMax(float[] aabbMin, float aabbMaxX, float aabbMaxY, IVec2RF scale, @ExtractionParam T res)
	{
		float aabbMinX = aabbMin[0];
		float aabbMinY = aabbMin[1];
		
		float scaleX = scale.x();
		float scaleY = scale.y();
		
		float scaledMinX = MathUtils.fma(scaleX, -aabbMaxX + aabbMinX, aabbMaxX);
		float scaledMinY = MathUtils.fma(scaleY, -aabbMaxY + aabbMinY, aabbMaxY);
		
		float newMinX = MathUtils.min(scaledMinX, aabbMaxX);
		float newMinY = MathUtils.min(scaledMinY, aabbMaxY);
		float newMaxX = MathUtils.max(scaledMinX, aabbMaxX);
		float newMaxY = MathUtils.max(scaledMinY, aabbMaxY);
		
		res.set(newMinX, newMinY, newMaxX, newMaxY);
		
		return res;
	}
	
	public static <T extends IAabb2WF> T scaleFromMax(float[] aabbMin, float aabbMaxX, float aabbMaxY, float[] scale, @ExtractionParam T res)
	{
		float aabbMinX = aabbMin[0];
		float aabbMinY = aabbMin[1];
		
		float scaleX = scale[0];
		float scaleY = scale[1];
		
		float scaledMinX = MathUtils.fma(scaleX, -aabbMaxX + aabbMinX, aabbMaxX);
		float scaledMinY = MathUtils.fma(scaleY, -aabbMaxY + aabbMinY, aabbMaxY);
		
		float newMinX = MathUtils.min(scaledMinX, aabbMaxX);
		float newMinY = MathUtils.min(scaledMinY, aabbMaxY);
		float newMaxX = MathUtils.max(scaledMinX, aabbMaxX);
		float newMaxY = MathUtils.max(scaledMinY, aabbMaxY);
		
		res.set(newMinX, newMinY, newMaxX, newMaxY);
		
		return res;
	}
	
	public static <T extends IAabb2WF> T scaleFromMax(float[] aabbMin, float aabbMaxX, float aabbMaxY, float scaleX, float scaleY, @ExtractionParam T res)
	{
		float aabbMinX = aabbMin[0];
		float aabbMinY = aabbMin[1];
		
		float scaledMinX = MathUtils.fma(scaleX, -aabbMaxX + aabbMinX, aabbMaxX);
		float scaledMinY = MathUtils.fma(scaleY, -aabbMaxY + aabbMinY, aabbMaxY);
		
		float newMinX = MathUtils.min(scaledMinX, aabbMaxX);
		float newMinY = MathUtils.min(scaledMinY, aabbMaxY);
		float newMaxX = MathUtils.max(scaledMinX, aabbMaxX);
		float newMaxY = MathUtils.max(scaledMinY, aabbMaxY);
		
		res.set(newMinX, newMinY, newMaxX, newMaxY);
		
		return res;
	}
	
	public static <T extends IAabb2WF> T scaleFromMax(float aabbMinX, float aabbMinY, IVec2RF aabbMax, IVec2RF scale, @ExtractionParam T res)
	{
		float aabbMaxX = aabbMax.x();
		float aabbMaxY = aabbMax.y();
		
		float scaleX = scale.x();
		float scaleY = scale.y();
		
		float scaledMinX = MathUtils.fma(scaleX, -aabbMaxX + aabbMinX, aabbMaxX);
		float scaledMinY = MathUtils.fma(scaleY, -aabbMaxY + aabbMinY, aabbMaxY);
		
		float newMinX = MathUtils.min(scaledMinX, aabbMaxX);
		float newMinY = MathUtils.min(scaledMinY, aabbMaxY);
		float newMaxX = MathUtils.max(scaledMinX, aabbMaxX);
		float newMaxY = MathUtils.max(scaledMinY, aabbMaxY);
		
		res.set(newMinX, newMinY, newMaxX, newMaxY);
		
		return res;
	}
	
	public static <T extends IAabb2WF> T scaleFromMax(float aabbMinX, float aabbMinY, IVec2RF aabbMax, float[] scale, @ExtractionParam T res)
	{
		float aabbMaxX = aabbMax.x();
		float aabbMaxY = aabbMax.y();
		
		float scaleX = scale[0];
		float scaleY = scale[1];
		
		float scaledMinX = MathUtils.fma(scaleX, -aabbMaxX + aabbMinX, aabbMaxX);
		float scaledMinY = MathUtils.fma(scaleY, -aabbMaxY + aabbMinY, aabbMaxY);
		
		float newMinX = MathUtils.min(scaledMinX, aabbMaxX);
		float newMinY = MathUtils.min(scaledMinY, aabbMaxY);
		float newMaxX = MathUtils.max(scaledMinX, aabbMaxX);
		float newMaxY = MathUtils.max(scaledMinY, aabbMaxY);
		
		res.set(newMinX, newMinY, newMaxX, newMaxY);
		
		return res;
	}
	
	public static <T extends IAabb2WF> T scaleFromMax(float aabbMinX, float aabbMinY, IVec2RF aabbMax, float scaleX, float scaleY, @ExtractionParam T res)
	{
		float aabbMaxX = aabbMax.x();
		float aabbMaxY = aabbMax.y();
		
		float scaledMinX = MathUtils.fma(scaleX, -aabbMaxX + aabbMinX, aabbMaxX);
		float scaledMinY = MathUtils.fma(scaleY, -aabbMaxY + aabbMinY, aabbMaxY);
		
		float newMinX = MathUtils.min(scaledMinX, aabbMaxX);
		float newMinY = MathUtils.min(scaledMinY, aabbMaxY);
		float newMaxX = MathUtils.max(scaledMinX, aabbMaxX);
		float newMaxY = MathUtils.max(scaledMinY, aabbMaxY);
		
		res.set(newMinX, newMinY, newMaxX, newMaxY);
		
		return res;
	}
	
	public static <T extends IAabb2WF> T scaleFromMax(float aabbMinX, float aabbMinY, float[] aabbMax, IVec2RF scale, @ExtractionParam T res)
	{
		float aabbMaxX = aabbMax[0];
		float aabbMaxY = aabbMax[1];
		
		float scaleX = scale.x();
		float scaleY = scale.y();
		
		float scaledMinX = MathUtils.fma(scaleX, -aabbMaxX + aabbMinX, aabbMaxX);
		float scaledMinY = MathUtils.fma(scaleY, -aabbMaxY + aabbMinY, aabbMaxY);
		
		float newMinX = MathUtils.min(scaledMinX, aabbMaxX);
		float newMinY = MathUtils.min(scaledMinY, aabbMaxY);
		float newMaxX = MathUtils.max(scaledMinX, aabbMaxX);
		float newMaxY = MathUtils.max(scaledMinY, aabbMaxY);
		
		res.set(newMinX, newMinY, newMaxX, newMaxY);
		
		return res;
	}
	
	public static <T extends IAabb2WF> T scaleFromMax(float aabbMinX, float aabbMinY, float[] aabbMax, float[] scale, @ExtractionParam T res)
	{
		float aabbMaxX = aabbMax[0];
		float aabbMaxY = aabbMax[1];
		
		float scaleX = scale[0];
		float scaleY = scale[1];
		
		float scaledMinX = MathUtils.fma(scaleX, -aabbMaxX + aabbMinX, aabbMaxX);
		float scaledMinY = MathUtils.fma(scaleY, -aabbMaxY + aabbMinY, aabbMaxY);
		
		float newMinX = MathUtils.min(scaledMinX, aabbMaxX);
		float newMinY = MathUtils.min(scaledMinY, aabbMaxY);
		float newMaxX = MathUtils.max(scaledMinX, aabbMaxX);
		float newMaxY = MathUtils.max(scaledMinY, aabbMaxY);
		
		res.set(newMinX, newMinY, newMaxX, newMaxY);
		
		return res;
	}
	
	public static <T extends IAabb2WF> T scaleFromMax(float aabbMinX, float aabbMinY, float[] aabbMax, float scaleX, float scaleY, @ExtractionParam T res)
	{
		float aabbMaxX = aabbMax[0];
		float aabbMaxY = aabbMax[1];
		
		float scaledMinX = MathUtils.fma(scaleX, -aabbMaxX + aabbMinX, aabbMaxX);
		float scaledMinY = MathUtils.fma(scaleY, -aabbMaxY + aabbMinY, aabbMaxY);
		
		float newMinX = MathUtils.min(scaledMinX, aabbMaxX);
		float newMinY = MathUtils.min(scaledMinY, aabbMaxY);
		float newMaxX = MathUtils.max(scaledMinX, aabbMaxX);
		float newMaxY = MathUtils.max(scaledMinY, aabbMaxY);
		
		res.set(newMinX, newMinY, newMaxX, newMaxY);
		
		return res;
	}
	
	public static <T extends IAabb2WF> T scaleFromMax(float aabbMinX, float aabbMinY, float aabbMaxX, float aabbMaxY, IVec2RF scale, @ExtractionParam T res)
	{
		float scaleX = scale.x();
		float scaleY = scale.y();
		
		float scaledMinX = MathUtils.fma(scaleX, -aabbMaxX + aabbMinX, aabbMaxX);
		float scaledMinY = MathUtils.fma(scaleY, -aabbMaxY + aabbMinY, aabbMaxY);
		
		float newMinX = MathUtils.min(scaledMinX, aabbMaxX);
		float newMinY = MathUtils.min(scaledMinY, aabbMaxY);
		float newMaxX = MathUtils.max(scaledMinX, aabbMaxX);
		float newMaxY = MathUtils.max(scaledMinY, aabbMaxY);
		
		res.set(newMinX, newMinY, newMaxX, newMaxY);
		
		return res;
	}
	
	public static <T extends IAabb2WF> T scaleFromMax(float aabbMinX, float aabbMinY, float aabbMaxX, float aabbMaxY, float[] scale, @ExtractionParam T res)
	{
		float scaleX = scale[0];
		float scaleY = scale[1];
		
		float scaledMinX = MathUtils.fma(scaleX, -aabbMaxX + aabbMinX, aabbMaxX);
		float scaledMinY = MathUtils.fma(scaleY, -aabbMaxY + aabbMinY, aabbMaxY);
		
		float newMinX = MathUtils.min(scaledMinX, aabbMaxX);
		float newMinY = MathUtils.min(scaledMinY, aabbMaxY);
		float newMaxX = MathUtils.max(scaledMinX, aabbMaxX);
		float newMaxY = MathUtils.max(scaledMinY, aabbMaxY);
		
		res.set(newMinX, newMinY, newMaxX, newMaxY);
		
		return res;
	}
	
	public static <T extends IAabb2WF> T scaleFromMax(float aabbMinX, float aabbMinY, float aabbMaxX, float aabbMaxY, float scaleX, float scaleY, @ExtractionParam T res)
	{
		float scaledMinX = MathUtils.fma(scaleX, -aabbMaxX + aabbMinX, aabbMaxX);
		float scaledMinY = MathUtils.fma(scaleY, -aabbMaxY + aabbMinY, aabbMaxY);
		
		float newMinX = MathUtils.min(scaledMinX, aabbMaxX);
		float newMinY = MathUtils.min(scaledMinY, aabbMaxY);
		float newMaxX = MathUtils.max(scaledMinX, aabbMaxX);
		float newMaxY = MathUtils.max(scaledMinY, aabbMaxY);
		
		res.set(newMinX, newMinY, newMaxX, newMaxY);
		
		return res;
	}
	
	public static <T extends IAabb2WF> T scaleFromMaxAssign(@ExtractionParam T aabb, IVec2RF scale)
	{
		float aabbMinX = aabb.minX();
		float aabbMinY = aabb.minY();
		float aabbMaxX = aabb.maxX();
		float aabbMaxY = aabb.maxY();
		
		float scaleX = scale.x();
		float scaleY = scale.y();
		
		float scaledMinX = MathUtils.fma(scaleX, -aabbMaxX + aabbMinX, aabbMaxX);
		float scaledMinY = MathUtils.fma(scaleY, -aabbMaxY + aabbMinY, aabbMaxY);
		
		float newMinX = MathUtils.min(scaledMinX, aabbMaxX);
		float newMinY = MathUtils.min(scaledMinY, aabbMaxY);
		float newMaxX = MathUtils.max(scaledMinX, aabbMaxX);
		float newMaxY = MathUtils.max(scaledMinY, aabbMaxY);
		
		aabb.set(newMinX, newMinY, newMaxX, newMaxY);
		
		return aabb;
	}
	
	public static <T extends IAabb2WF> T scaleFromMaxAssign(@ExtractionParam T aabb, float[] scale)
	{
		float aabbMinX = aabb.minX();
		float aabbMinY = aabb.minY();
		float aabbMaxX = aabb.maxX();
		float aabbMaxY = aabb.maxY();
		
		float scaleX = scale[0];
		float scaleY = scale[1];
		
		float scaledMinX = MathUtils.fma(scaleX, -aabbMaxX + aabbMinX, aabbMaxX);
		float scaledMinY = MathUtils.fma(scaleY, -aabbMaxY + aabbMinY, aabbMaxY);
		
		float newMinX = MathUtils.min(scaledMinX, aabbMaxX);
		float newMinY = MathUtils.min(scaledMinY, aabbMaxY);
		float newMaxX = MathUtils.max(scaledMinX, aabbMaxX);
		float newMaxY = MathUtils.max(scaledMinY, aabbMaxY);
		
		aabb.set(newMinX, newMinY, newMaxX, newMaxY);
		
		return aabb;
	}
	
	public static <T extends IAabb2WF> T scaleFromMaxAssign(@ExtractionParam T aabb, float scaleX, float scaleY)
	{
		float aabbMinX = aabb.minX();
		float aabbMinY = aabb.minY();
		float aabbMaxX = aabb.maxX();
		float aabbMaxY = aabb.maxY();
		
		float scaledMinX = MathUtils.fma(scaleX, -aabbMaxX + aabbMinX, aabbMaxX);
		float scaledMinY = MathUtils.fma(scaleY, -aabbMaxY + aabbMinY, aabbMaxY);
		
		float newMinX = MathUtils.min(scaledMinX, aabbMaxX);
		float newMinY = MathUtils.min(scaledMinY, aabbMaxY);
		float newMaxX = MathUtils.max(scaledMinX, aabbMaxX);
		float newMaxY = MathUtils.max(scaledMinY, aabbMaxY);
		
		aabb.set(newMinX, newMinY, newMaxX, newMaxY);
		
		return aabb;
	}
	
	public static float[] translate(IAabb2RF aabb, IVec2RF t, @ExtractionParam float[] res)
	{
		float aabbMinX = aabb.minX();
		float aabbMinY = aabb.minY();
		float aabbMaxX = aabb.maxX();
		float aabbMaxY = aabb.maxY();
		
		float tX = t.x();
		float tY = t.y();
		
		float newMinX = aabbMinX + tX;
		float newMinY = aabbMinY + tY;
		float newMaxX = aabbMaxX + tX;
		float newMaxY = aabbMaxY + tY;
		
		res[0] = newMinX;
		res[1] = newMinY;
		res[2] = newMaxX;
		res[3] = newMaxY;
		
		return res;
	}
	
	public static float[] translate(IAabb2RF aabb, float[] t, @ExtractionParam float[] res)
	{
		float aabbMinX = aabb.minX();
		float aabbMinY = aabb.minY();
		float aabbMaxX = aabb.maxX();
		float aabbMaxY = aabb.maxY();
		
		float tX = t[0];
		float tY = t[1];
		
		float newMinX = aabbMinX + tX;
		float newMinY = aabbMinY + tY;
		float newMaxX = aabbMaxX + tX;
		float newMaxY = aabbMaxY + tY;
		
		res[0] = newMinX;
		res[1] = newMinY;
		res[2] = newMaxX;
		res[3] = newMaxY;
		
		return res;
	}
	
	public static float[] translate(IAabb2RF aabb, float tX, float tY, @ExtractionParam float[] res)
	{
		float aabbMinX = aabb.minX();
		float aabbMinY = aabb.minY();
		float aabbMaxX = aabb.maxX();
		float aabbMaxY = aabb.maxY();
		
		float newMinX = aabbMinX + tX;
		float newMinY = aabbMinY + tY;
		float newMaxX = aabbMaxX + tX;
		float newMaxY = aabbMaxY + tY;
		
		res[0] = newMinX;
		res[1] = newMinY;
		res[2] = newMaxX;
		res[3] = newMaxY;
		
		return res;
	}
	
	public static float[] translate(float[] aabb, IVec2RF t, @ExtractionParam float[] res)
	{
		float aabbMinX = aabb[0];
		float aabbMinY = aabb[1];
		float aabbMaxX = aabb[2];
		float aabbMaxY = aabb[3];
		
		float tX = t.x();
		float tY = t.y();
		
		float newMinX = aabbMinX + tX;
		float newMinY = aabbMinY + tY;
		float newMaxX = aabbMaxX + tX;
		float newMaxY = aabbMaxY + tY;
		
		res[0] = newMinX;
		res[1] = newMinY;
		res[2] = newMaxX;
		res[3] = newMaxY;
		
		return res;
	}
	
	public static float[] translate(IVec2RF aabbMin, IVec2RF aabbMax, IVec2RF t, @ExtractionParam float[] res)
	{
		float aabbMinX = aabbMin.x();
		float aabbMinY = aabbMin.y();
		float aabbMaxX = aabbMax.x();
		float aabbMaxY = aabbMax.y();
		
		float tX = t.x();
		float tY = t.y();
		
		float newMinX = aabbMinX + tX;
		float newMinY = aabbMinY + tY;
		float newMaxX = aabbMaxX + tX;
		float newMaxY = aabbMaxY + tY;
		
		res[0] = newMinX;
		res[1] = newMinY;
		res[2] = newMaxX;
		res[3] = newMaxY;
		
		return res;
	}
	
	public static float[] translate(IVec2RF aabbMin, IVec2RF aabbMax, float[] t, @ExtractionParam float[] res)
	{
		float aabbMinX = aabbMin.x();
		float aabbMinY = aabbMin.y();
		float aabbMaxX = aabbMax.x();
		float aabbMaxY = aabbMax.y();
		
		float tX = t[0];
		float tY = t[1];
		
		float newMinX = aabbMinX + tX;
		float newMinY = aabbMinY + tY;
		float newMaxX = aabbMaxX + tX;
		float newMaxY = aabbMaxY + tY;
		
		res[0] = newMinX;
		res[1] = newMinY;
		res[2] = newMaxX;
		res[3] = newMaxY;
		
		return res;
	}
	
	public static float[] translate(IVec2RF aabbMin, IVec2RF aabbMax, float tX, float tY, @ExtractionParam float[] res)
	{
		float aabbMinX = aabbMin.x();
		float aabbMinY = aabbMin.y();
		float aabbMaxX = aabbMax.x();
		float aabbMaxY = aabbMax.y();
		
		float newMinX = aabbMinX + tX;
		float newMinY = aabbMinY + tY;
		float newMaxX = aabbMaxX + tX;
		float newMaxY = aabbMaxY + tY;
		
		res[0] = newMinX;
		res[1] = newMinY;
		res[2] = newMaxX;
		res[3] = newMaxY;
		
		return res;
	}
	
	public static float[] translate(IVec2RF aabbMin, float[] aabbMax, IVec2RF t, @ExtractionParam float[] res)
	{
		float aabbMinX = aabbMin.x();
		float aabbMinY = aabbMin.y();
		float aabbMaxX = aabbMax[0];
		float aabbMaxY = aabbMax[1];
		
		float tX = t.x();
		float tY = t.y();
		
		float newMinX = aabbMinX + tX;
		float newMinY = aabbMinY + tY;
		float newMaxX = aabbMaxX + tX;
		float newMaxY = aabbMaxY + tY;
		
		res[0] = newMinX;
		res[1] = newMinY;
		res[2] = newMaxX;
		res[3] = newMaxY;
		
		return res;
	}
	
	public static float[] translate(IVec2RF aabbMin, float[] aabbMax, float[] t, @ExtractionParam float[] res)
	{
		float aabbMinX = aabbMin.x();
		float aabbMinY = aabbMin.y();
		float aabbMaxX = aabbMax[0];
		float aabbMaxY = aabbMax[1];
		
		float tX = t[0];
		float tY = t[1];
		
		float newMinX = aabbMinX + tX;
		float newMinY = aabbMinY + tY;
		float newMaxX = aabbMaxX + tX;
		float newMaxY = aabbMaxY + tY;
		
		res[0] = newMinX;
		res[1] = newMinY;
		res[2] = newMaxX;
		res[3] = newMaxY;
		
		return res;
	}
	
	public static float[] translate(IVec2RF aabbMin, float[] aabbMax, float tX, float tY, @ExtractionParam float[] res)
	{
		float aabbMinX = aabbMin.x();
		float aabbMinY = aabbMin.y();
		float aabbMaxX = aabbMax[0];
		float aabbMaxY = aabbMax[1];
		
		float newMinX = aabbMinX + tX;
		float newMinY = aabbMinY + tY;
		float newMaxX = aabbMaxX + tX;
		float newMaxY = aabbMaxY + tY;
		
		res[0] = newMinX;
		res[1] = newMinY;
		res[2] = newMaxX;
		res[3] = newMaxY;
		
		return res;
	}
	
	public static float[] translate(IVec2RF aabbMin, float aabbMaxX, float aabbMaxY, IVec2RF t, @ExtractionParam float[] res)
	{
		float aabbMinX = aabbMin.x();
		float aabbMinY = aabbMin.y();
		
		float tX = t.x();
		float tY = t.y();
		
		float newMinX = aabbMinX + tX;
		float newMinY = aabbMinY + tY;
		float newMaxX = aabbMaxX + tX;
		float newMaxY = aabbMaxY + tY;
		
		res[0] = newMinX;
		res[1] = newMinY;
		res[2] = newMaxX;
		res[3] = newMaxY;
		
		return res;
	}
	
	public static float[] translate(IVec2RF aabbMin, float aabbMaxX, float aabbMaxY, float[] t, @ExtractionParam float[] res)
	{
		float aabbMinX = aabbMin.x();
		float aabbMinY = aabbMin.y();
		
		float tX = t[0];
		float tY = t[1];
		
		float newMinX = aabbMinX + tX;
		float newMinY = aabbMinY + tY;
		float newMaxX = aabbMaxX + tX;
		float newMaxY = aabbMaxY + tY;
		
		res[0] = newMinX;
		res[1] = newMinY;
		res[2] = newMaxX;
		res[3] = newMaxY;
		
		return res;
	}
	
	public static float[] translate(IVec2RF aabbMin, float aabbMaxX, float aabbMaxY, float tX, float tY, @ExtractionParam float[] res)
	{
		float aabbMinX = aabbMin.x();
		float aabbMinY = aabbMin.y();
		
		float newMinX = aabbMinX + tX;
		float newMinY = aabbMinY + tY;
		float newMaxX = aabbMaxX + tX;
		float newMaxY = aabbMaxY + tY;
		
		res[0] = newMinX;
		res[1] = newMinY;
		res[2] = newMaxX;
		res[3] = newMaxY;
		
		return res;
	}
	
	public static float[] translate(float[] aabbMin, IVec2RF aabbMax, IVec2RF t, @ExtractionParam float[] res)
	{
		float aabbMinX = aabbMin[0];
		float aabbMinY = aabbMin[1];
		float aabbMaxX = aabbMax.x();
		float aabbMaxY = aabbMax.y();
		
		float tX = t.x();
		float tY = t.y();
		
		float newMinX = aabbMinX + tX;
		float newMinY = aabbMinY + tY;
		float newMaxX = aabbMaxX + tX;
		float newMaxY = aabbMaxY + tY;
		
		res[0] = newMinX;
		res[1] = newMinY;
		res[2] = newMaxX;
		res[3] = newMaxY;
		
		return res;
	}
	
	public static float[] translate(float[] aabbMin, IVec2RF aabbMax, float[] t, @ExtractionParam float[] res)
	{
		float aabbMinX = aabbMin[0];
		float aabbMinY = aabbMin[1];
		float aabbMaxX = aabbMax.x();
		float aabbMaxY = aabbMax.y();
		
		float tX = t[0];
		float tY = t[1];
		
		float newMinX = aabbMinX + tX;
		float newMinY = aabbMinY + tY;
		float newMaxX = aabbMaxX + tX;
		float newMaxY = aabbMaxY + tY;
		
		res[0] = newMinX;
		res[1] = newMinY;
		res[2] = newMaxX;
		res[3] = newMaxY;
		
		return res;
	}
	
	public static float[] translate(float[] aabbMin, IVec2RF aabbMax, float tX, float tY, @ExtractionParam float[] res)
	{
		float aabbMinX = aabbMin[0];
		float aabbMinY = aabbMin[1];
		float aabbMaxX = aabbMax.x();
		float aabbMaxY = aabbMax.y();
		
		float newMinX = aabbMinX + tX;
		float newMinY = aabbMinY + tY;
		float newMaxX = aabbMaxX + tX;
		float newMaxY = aabbMaxY + tY;
		
		res[0] = newMinX;
		res[1] = newMinY;
		res[2] = newMaxX;
		res[3] = newMaxY;
		
		return res;
	}
	
	public static float[] translate(float[] aabbMin, float[] aabbMax, IVec2RF t, @ExtractionParam float[] res)
	{
		float aabbMinX = aabbMin[0];
		float aabbMinY = aabbMin[1];
		float aabbMaxX = aabbMax[0];
		float aabbMaxY = aabbMax[1];
		
		float tX = t.x();
		float tY = t.y();
		
		float newMinX = aabbMinX + tX;
		float newMinY = aabbMinY + tY;
		float newMaxX = aabbMaxX + tX;
		float newMaxY = aabbMaxY + tY;
		
		res[0] = newMinX;
		res[1] = newMinY;
		res[2] = newMaxX;
		res[3] = newMaxY;
		
		return res;
	}
	
	public static float[] translate(float[] aabbMin, float aabbMaxX, float aabbMaxY, IVec2RF t, @ExtractionParam float[] res)
	{
		float aabbMinX = aabbMin[0];
		float aabbMinY = aabbMin[1];
		
		float tX = t.x();
		float tY = t.y();
		
		float newMinX = aabbMinX + tX;
		float newMinY = aabbMinY + tY;
		float newMaxX = aabbMaxX + tX;
		float newMaxY = aabbMaxY + tY;
		
		res[0] = newMinX;
		res[1] = newMinY;
		res[2] = newMaxX;
		res[3] = newMaxY;
		
		return res;
	}
	
	public static float[] translate(float aabbMinX, float aabbMinY, IVec2RF aabbMax, IVec2RF t, @ExtractionParam float[] res)
	{
		float aabbMaxX = aabbMax.x();
		float aabbMaxY = aabbMax.y();
		
		float tX = t.x();
		float tY = t.y();
		
		float newMinX = aabbMinX + tX;
		float newMinY = aabbMinY + tY;
		float newMaxX = aabbMaxX + tX;
		float newMaxY = aabbMaxY + tY;
		
		res[0] = newMinX;
		res[1] = newMinY;
		res[2] = newMaxX;
		res[3] = newMaxY;
		
		return res;
	}
	
	public static float[] translate(float aabbMinX, float aabbMinY, IVec2RF aabbMax, float[] t, @ExtractionParam float[] res)
	{
		float aabbMaxX = aabbMax.x();
		float aabbMaxY = aabbMax.y();
		
		float tX = t[0];
		float tY = t[1];
		
		float newMinX = aabbMinX + tX;
		float newMinY = aabbMinY + tY;
		float newMaxX = aabbMaxX + tX;
		float newMaxY = aabbMaxY + tY;
		
		res[0] = newMinX;
		res[1] = newMinY;
		res[2] = newMaxX;
		res[3] = newMaxY;
		
		return res;
	}
	
	public static float[] translate(float aabbMinX, float aabbMinY, IVec2RF aabbMax, float tX, float tY, @ExtractionParam float[] res)
	{
		float aabbMaxX = aabbMax.x();
		float aabbMaxY = aabbMax.y();
		
		float newMinX = aabbMinX + tX;
		float newMinY = aabbMinY + tY;
		float newMaxX = aabbMaxX + tX;
		float newMaxY = aabbMaxY + tY;
		
		res[0] = newMinX;
		res[1] = newMinY;
		res[2] = newMaxX;
		res[3] = newMaxY;
		
		return res;
	}
	
	public static float[] translate(float aabbMinX, float aabbMinY, float[] aabbMax, IVec2RF t, @ExtractionParam float[] res)
	{
		float aabbMaxX = aabbMax[0];
		float aabbMaxY = aabbMax[1];
		
		float tX = t.x();
		float tY = t.y();
		
		float newMinX = aabbMinX + tX;
		float newMinY = aabbMinY + tY;
		float newMaxX = aabbMaxX + tX;
		float newMaxY = aabbMaxY + tY;
		
		res[0] = newMinX;
		res[1] = newMinY;
		res[2] = newMaxX;
		res[3] = newMaxY;
		
		return res;
	}
	
	public static float[] translate(float aabbMinX, float aabbMinY, float aabbMaxX, float aabbMaxY, IVec2RF t, @ExtractionParam float[] res)
	{
		float tX = t.x();
		float tY = t.y();
		
		float newMinX = aabbMinX + tX;
		float newMinY = aabbMinY + tY;
		float newMaxX = aabbMaxX + tX;
		float newMaxY = aabbMaxY + tY;
		
		res[0] = newMinX;
		res[1] = newMinY;
		res[2] = newMaxX;
		res[3] = newMaxY;
		
		return res;
	}
	
	public static float[] translateAssign(@ExtractionParam float[] aabb, IVec2RF t)
	{
		float aabbMinX = aabb[0];
		float aabbMinY = aabb[1];
		float aabbMaxX = aabb[2];
		float aabbMaxY = aabb[3];
		
		float tX = t.x();
		float tY = t.y();
		
		float newMinX = aabbMinX + tX;
		float newMinY = aabbMinY + tY;
		float newMaxX = aabbMaxX + tX;
		float newMaxY = aabbMaxY + tY;
		
		aabb[0] = newMinX;
		aabb[1] = newMinY;
		aabb[2] = newMaxX;
		aabb[3] = newMaxY;
		
		return aabb;
	}
	
	public static <T extends IAabb2WF> T translate(IAabb2RF aabb, IVec2RF t, @ExtractionParam T res)
	{
		float aabbMinX = aabb.minX();
		float aabbMinY = aabb.minY();
		float aabbMaxX = aabb.maxX();
		float aabbMaxY = aabb.maxY();
		
		float tX = t.x();
		float tY = t.y();
		
		float newMinX = aabbMinX + tX;
		float newMinY = aabbMinY + tY;
		float newMaxX = aabbMaxX + tX;
		float newMaxY = aabbMaxY + tY;
		
		res.set(newMinX, newMinY, newMaxX, newMaxY);
		
		return res;
	}
	
	public static <T extends IAabb2WF> T translate(IAabb2RF aabb, float[] t, @ExtractionParam T res)
	{
		float aabbMinX = aabb.minX();
		float aabbMinY = aabb.minY();
		float aabbMaxX = aabb.maxX();
		float aabbMaxY = aabb.maxY();
		
		float tX = t[0];
		float tY = t[1];
		
		float newMinX = aabbMinX + tX;
		float newMinY = aabbMinY + tY;
		float newMaxX = aabbMaxX + tX;
		float newMaxY = aabbMaxY + tY;
		
		res.set(newMinX, newMinY, newMaxX, newMaxY);
		
		return res;
	}
	
	public static <T extends IAabb2WF> T translate(IAabb2RF aabb, float tX, float tY, @ExtractionParam T res)
	{
		float aabbMinX = aabb.minX();
		float aabbMinY = aabb.minY();
		float aabbMaxX = aabb.maxX();
		float aabbMaxY = aabb.maxY();
		
		float newMinX = aabbMinX + tX;
		float newMinY = aabbMinY + tY;
		float newMaxX = aabbMaxX + tX;
		float newMaxY = aabbMaxY + tY;
		
		res.set(newMinX, newMinY, newMaxX, newMaxY);
		
		return res;
	}
	
	public static <T extends IAabb2WF> T translate(float[] aabb, IVec2RF t, @ExtractionParam T res)
	{
		float aabbMinX = aabb[0];
		float aabbMinY = aabb[1];
		float aabbMaxX = aabb[2];
		float aabbMaxY = aabb[3];
		
		float tX = t.x();
		float tY = t.y();
		
		float newMinX = aabbMinX + tX;
		float newMinY = aabbMinY + tY;
		float newMaxX = aabbMaxX + tX;
		float newMaxY = aabbMaxY + tY;
		
		res.set(newMinX, newMinY, newMaxX, newMaxY);
		
		return res;
	}
	
	public static <T extends IAabb2WF> T translate(float[] aabb, float[] t, @ExtractionParam T res)
	{
		float aabbMinX = aabb[0];
		float aabbMinY = aabb[1];
		float aabbMaxX = aabb[2];
		float aabbMaxY = aabb[3];
		
		float tX = t[0];
		float tY = t[1];
		
		float newMinX = aabbMinX + tX;
		float newMinY = aabbMinY + tY;
		float newMaxX = aabbMaxX + tX;
		float newMaxY = aabbMaxY + tY;
		
		res.set(newMinX, newMinY, newMaxX, newMaxY);
		
		return res;
	}
	
	public static <T extends IAabb2WF> T translate(float[] aabb, float tX, float tY, @ExtractionParam T res)
	{
		float aabbMinX = aabb[0];
		float aabbMinY = aabb[1];
		float aabbMaxX = aabb[2];
		float aabbMaxY = aabb[3];
		
		float newMinX = aabbMinX + tX;
		float newMinY = aabbMinY + tY;
		float newMaxX = aabbMaxX + tX;
		float newMaxY = aabbMaxY + tY;
		
		res.set(newMinX, newMinY, newMaxX, newMaxY);
		
		return res;
	}
	
	public static <T extends IAabb2WF> T translate(IVec2RF aabbMin, IVec2RF aabbMax, IVec2RF t, @ExtractionParam T res)
	{
		float aabbMinX = aabbMin.x();
		float aabbMinY = aabbMin.y();
		float aabbMaxX = aabbMax.x();
		float aabbMaxY = aabbMax.y();
		
		float tX = t.x();
		float tY = t.y();
		
		float newMinX = aabbMinX + tX;
		float newMinY = aabbMinY + tY;
		float newMaxX = aabbMaxX + tX;
		float newMaxY = aabbMaxY + tY;
		
		res.set(newMinX, newMinY, newMaxX, newMaxY);
		
		return res;
	}
	
	public static <T extends IAabb2WF> T translate(IVec2RF aabbMin, IVec2RF aabbMax, float[] t, @ExtractionParam T res)
	{
		float aabbMinX = aabbMin.x();
		float aabbMinY = aabbMin.y();
		float aabbMaxX = aabbMax.x();
		float aabbMaxY = aabbMax.y();
		
		float tX = t[0];
		float tY = t[1];
		
		float newMinX = aabbMinX + tX;
		float newMinY = aabbMinY + tY;
		float newMaxX = aabbMaxX + tX;
		float newMaxY = aabbMaxY + tY;
		
		res.set(newMinX, newMinY, newMaxX, newMaxY);
		
		return res;
	}
	
	public static <T extends IAabb2WF> T translate(IVec2RF aabbMin, IVec2RF aabbMax, float tX, float tY, @ExtractionParam T res)
	{
		float aabbMinX = aabbMin.x();
		float aabbMinY = aabbMin.y();
		float aabbMaxX = aabbMax.x();
		float aabbMaxY = aabbMax.y();
		
		float newMinX = aabbMinX + tX;
		float newMinY = aabbMinY + tY;
		float newMaxX = aabbMaxX + tX;
		float newMaxY = aabbMaxY + tY;
		
		res.set(newMinX, newMinY, newMaxX, newMaxY);
		
		return res;
	}
	
	public static <T extends IAabb2WF> T translate(IVec2RF aabbMin, float[] aabbMax, IVec2RF t, @ExtractionParam T res)
	{
		float aabbMinX = aabbMin.x();
		float aabbMinY = aabbMin.y();
		float aabbMaxX = aabbMax[0];
		float aabbMaxY = aabbMax[1];
		
		float tX = t.x();
		float tY = t.y();
		
		float newMinX = aabbMinX + tX;
		float newMinY = aabbMinY + tY;
		float newMaxX = aabbMaxX + tX;
		float newMaxY = aabbMaxY + tY;
		
		res.set(newMinX, newMinY, newMaxX, newMaxY);
		
		return res;
	}
	
	public static <T extends IAabb2WF> T translate(IVec2RF aabbMin, float[] aabbMax, float[] t, @ExtractionParam T res)
	{
		float aabbMinX = aabbMin.x();
		float aabbMinY = aabbMin.y();
		float aabbMaxX = aabbMax[0];
		float aabbMaxY = aabbMax[1];
		
		float tX = t[0];
		float tY = t[1];
		
		float newMinX = aabbMinX + tX;
		float newMinY = aabbMinY + tY;
		float newMaxX = aabbMaxX + tX;
		float newMaxY = aabbMaxY + tY;
		
		res.set(newMinX, newMinY, newMaxX, newMaxY);
		
		return res;
	}
	
	public static <T extends IAabb2WF> T translate(IVec2RF aabbMin, float[] aabbMax, float tX, float tY, @ExtractionParam T res)
	{
		float aabbMinX = aabbMin.x();
		float aabbMinY = aabbMin.y();
		float aabbMaxX = aabbMax[0];
		float aabbMaxY = aabbMax[1];
		
		float newMinX = aabbMinX + tX;
		float newMinY = aabbMinY + tY;
		float newMaxX = aabbMaxX + tX;
		float newMaxY = aabbMaxY + tY;
		
		res.set(newMinX, newMinY, newMaxX, newMaxY);
		
		return res;
	}
	
	public static <T extends IAabb2WF> T translate(IVec2RF aabbMin, float aabbMaxX, float aabbMaxY, IVec2RF t, @ExtractionParam T res)
	{
		float aabbMinX = aabbMin.x();
		float aabbMinY = aabbMin.y();
		
		float tX = t.x();
		float tY = t.y();
		
		float newMinX = aabbMinX + tX;
		float newMinY = aabbMinY + tY;
		float newMaxX = aabbMaxX + tX;
		float newMaxY = aabbMaxY + tY;
		
		res.set(newMinX, newMinY, newMaxX, newMaxY);
		
		return res;
	}
	
	public static <T extends IAabb2WF> T translate(IVec2RF aabbMin, float aabbMaxX, float aabbMaxY, float[] t, @ExtractionParam T res)
	{
		float aabbMinX = aabbMin.x();
		float aabbMinY = aabbMin.y();
		
		float tX = t[0];
		float tY = t[1];
		
		float newMinX = aabbMinX + tX;
		float newMinY = aabbMinY + tY;
		float newMaxX = aabbMaxX + tX;
		float newMaxY = aabbMaxY + tY;
		
		res.set(newMinX, newMinY, newMaxX, newMaxY);
		
		return res;
	}
	
	public static <T extends IAabb2WF> T translate(IVec2RF aabbMin, float aabbMaxX, float aabbMaxY, float tX, float tY, @ExtractionParam T res)
	{
		float aabbMinX = aabbMin.x();
		float aabbMinY = aabbMin.y();
		
		float newMinX = aabbMinX + tX;
		float newMinY = aabbMinY + tY;
		float newMaxX = aabbMaxX + tX;
		float newMaxY = aabbMaxY + tY;
		
		res.set(newMinX, newMinY, newMaxX, newMaxY);
		
		return res;
	}
	
	public static <T extends IAabb2WF> T translate(float[] aabbMin, IVec2RF aabbMax, IVec2RF t, @ExtractionParam T res)
	{
		float aabbMinX = aabbMin[0];
		float aabbMinY = aabbMin[1];
		float aabbMaxX = aabbMax.x();
		float aabbMaxY = aabbMax.y();
		
		float tX = t.x();
		float tY = t.y();
		
		float newMinX = aabbMinX + tX;
		float newMinY = aabbMinY + tY;
		float newMaxX = aabbMaxX + tX;
		float newMaxY = aabbMaxY + tY;
		
		res.set(newMinX, newMinY, newMaxX, newMaxY);
		
		return res;
	}
	
	public static <T extends IAabb2WF> T translate(float[] aabbMin, IVec2RF aabbMax, float[] t, @ExtractionParam T res)
	{
		float aabbMinX = aabbMin[0];
		float aabbMinY = aabbMin[1];
		float aabbMaxX = aabbMax.x();
		float aabbMaxY = aabbMax.y();
		
		float tX = t[0];
		float tY = t[1];
		
		float newMinX = aabbMinX + tX;
		float newMinY = aabbMinY + tY;
		float newMaxX = aabbMaxX + tX;
		float newMaxY = aabbMaxY + tY;
		
		res.set(newMinX, newMinY, newMaxX, newMaxY);
		
		return res;
	}
	
	public static <T extends IAabb2WF> T translate(float[] aabbMin, IVec2RF aabbMax, float tX, float tY, @ExtractionParam T res)
	{
		float aabbMinX = aabbMin[0];
		float aabbMinY = aabbMin[1];
		float aabbMaxX = aabbMax.x();
		float aabbMaxY = aabbMax.y();
		
		float newMinX = aabbMinX + tX;
		float newMinY = aabbMinY + tY;
		float newMaxX = aabbMaxX + tX;
		float newMaxY = aabbMaxY + tY;
		
		res.set(newMinX, newMinY, newMaxX, newMaxY);
		
		return res;
	}
	
	public static <T extends IAabb2WF> T translate(float[] aabbMin, float[] aabbMax, IVec2RF t, @ExtractionParam T res)
	{
		float aabbMinX = aabbMin[0];
		float aabbMinY = aabbMin[1];
		float aabbMaxX = aabbMax[0];
		float aabbMaxY = aabbMax[1];
		
		float tX = t.x();
		float tY = t.y();
		
		float newMinX = aabbMinX + tX;
		float newMinY = aabbMinY + tY;
		float newMaxX = aabbMaxX + tX;
		float newMaxY = aabbMaxY + tY;
		
		res.set(newMinX, newMinY, newMaxX, newMaxY);
		
		return res;
	}
	
	public static <T extends IAabb2WF> T translate(float[] aabbMin, float[] aabbMax, float[] t, @ExtractionParam T res)
	{
		float aabbMinX = aabbMin[0];
		float aabbMinY = aabbMin[1];
		float aabbMaxX = aabbMax[0];
		float aabbMaxY = aabbMax[1];
		
		float tX = t[0];
		float tY = t[1];
		
		float newMinX = aabbMinX + tX;
		float newMinY = aabbMinY + tY;
		float newMaxX = aabbMaxX + tX;
		float newMaxY = aabbMaxY + tY;
		
		res.set(newMinX, newMinY, newMaxX, newMaxY);
		
		return res;
	}
	
	public static <T extends IAabb2WF> T translate(float[] aabbMin, float[] aabbMax, float tX, float tY, @ExtractionParam T res)
	{
		float aabbMinX = aabbMin[0];
		float aabbMinY = aabbMin[1];
		float aabbMaxX = aabbMax[0];
		float aabbMaxY = aabbMax[1];
		
		float newMinX = aabbMinX + tX;
		float newMinY = aabbMinY + tY;
		float newMaxX = aabbMaxX + tX;
		float newMaxY = aabbMaxY + tY;
		
		res.set(newMinX, newMinY, newMaxX, newMaxY);
		
		return res;
	}
	
	public static <T extends IAabb2WF> T translate(float[] aabbMin, float aabbMaxX, float aabbMaxY, IVec2RF t, @ExtractionParam T res)
	{
		float aabbMinX = aabbMin[0];
		float aabbMinY = aabbMin[1];
		
		float tX = t.x();
		float tY = t.y();
		
		float newMinX = aabbMinX + tX;
		float newMinY = aabbMinY + tY;
		float newMaxX = aabbMaxX + tX;
		float newMaxY = aabbMaxY + tY;
		
		res.set(newMinX, newMinY, newMaxX, newMaxY);
		
		return res;
	}
	
	public static <T extends IAabb2WF> T translate(float[] aabbMin, float aabbMaxX, float aabbMaxY, float[] t, @ExtractionParam T res)
	{
		float aabbMinX = aabbMin[0];
		float aabbMinY = aabbMin[1];
		
		float tX = t[0];
		float tY = t[1];
		
		float newMinX = aabbMinX + tX;
		float newMinY = aabbMinY + tY;
		float newMaxX = aabbMaxX + tX;
		float newMaxY = aabbMaxY + tY;
		
		res.set(newMinX, newMinY, newMaxX, newMaxY);
		
		return res;
	}
	
	public static <T extends IAabb2WF> T translate(float[] aabbMin, float aabbMaxX, float aabbMaxY, float tX, float tY, @ExtractionParam T res)
	{
		float aabbMinX = aabbMin[0];
		float aabbMinY = aabbMin[1];
		
		float newMinX = aabbMinX + tX;
		float newMinY = aabbMinY + tY;
		float newMaxX = aabbMaxX + tX;
		float newMaxY = aabbMaxY + tY;
		
		res.set(newMinX, newMinY, newMaxX, newMaxY);
		
		return res;
	}
	
	public static <T extends IAabb2WF> T translate(float aabbMinX, float aabbMinY, IVec2RF aabbMax, IVec2RF t, @ExtractionParam T res)
	{
		float aabbMaxX = aabbMax.x();
		float aabbMaxY = aabbMax.y();
		
		float tX = t.x();
		float tY = t.y();
		
		float newMinX = aabbMinX + tX;
		float newMinY = aabbMinY + tY;
		float newMaxX = aabbMaxX + tX;
		float newMaxY = aabbMaxY + tY;
		
		res.set(newMinX, newMinY, newMaxX, newMaxY);
		
		return res;
	}
	
	public static <T extends IAabb2WF> T translate(float aabbMinX, float aabbMinY, IVec2RF aabbMax, float[] t, @ExtractionParam T res)
	{
		float aabbMaxX = aabbMax.x();
		float aabbMaxY = aabbMax.y();
		
		float tX = t[0];
		float tY = t[1];
		
		float newMinX = aabbMinX + tX;
		float newMinY = aabbMinY + tY;
		float newMaxX = aabbMaxX + tX;
		float newMaxY = aabbMaxY + tY;
		
		res.set(newMinX, newMinY, newMaxX, newMaxY);
		
		return res;
	}
	
	public static <T extends IAabb2WF> T translate(float aabbMinX, float aabbMinY, IVec2RF aabbMax, float tX, float tY, @ExtractionParam T res)
	{
		float aabbMaxX = aabbMax.x();
		float aabbMaxY = aabbMax.y();
		
		float newMinX = aabbMinX + tX;
		float newMinY = aabbMinY + tY;
		float newMaxX = aabbMaxX + tX;
		float newMaxY = aabbMaxY + tY;
		
		res.set(newMinX, newMinY, newMaxX, newMaxY);
		
		return res;
	}
	
	public static <T extends IAabb2WF> T translate(float aabbMinX, float aabbMinY, float[] aabbMax, IVec2RF t, @ExtractionParam T res)
	{
		float aabbMaxX = aabbMax[0];
		float aabbMaxY = aabbMax[1];
		
		float tX = t.x();
		float tY = t.y();
		
		float newMinX = aabbMinX + tX;
		float newMinY = aabbMinY + tY;
		float newMaxX = aabbMaxX + tX;
		float newMaxY = aabbMaxY + tY;
		
		res.set(newMinX, newMinY, newMaxX, newMaxY);
		
		return res;
	}
	
	public static <T extends IAabb2WF> T translate(float aabbMinX, float aabbMinY, float[] aabbMax, float[] t, @ExtractionParam T res)
	{
		float aabbMaxX = aabbMax[0];
		float aabbMaxY = aabbMax[1];
		
		float tX = t[0];
		float tY = t[1];
		
		float newMinX = aabbMinX + tX;
		float newMinY = aabbMinY + tY;
		float newMaxX = aabbMaxX + tX;
		float newMaxY = aabbMaxY + tY;
		
		res.set(newMinX, newMinY, newMaxX, newMaxY);
		
		return res;
	}
	
	public static <T extends IAabb2WF> T translate(float aabbMinX, float aabbMinY, float[] aabbMax, float tX, float tY, @ExtractionParam T res)
	{
		float aabbMaxX = aabbMax[0];
		float aabbMaxY = aabbMax[1];
		
		float newMinX = aabbMinX + tX;
		float newMinY = aabbMinY + tY;
		float newMaxX = aabbMaxX + tX;
		float newMaxY = aabbMaxY + tY;
		
		res.set(newMinX, newMinY, newMaxX, newMaxY);
		
		return res;
	}
	
	public static <T extends IAabb2WF> T translate(float aabbMinX, float aabbMinY, float aabbMaxX, float aabbMaxY, IVec2RF t, @ExtractionParam T res)
	{
		float tX = t.x();
		float tY = t.y();
		
		float newMinX = aabbMinX + tX;
		float newMinY = aabbMinY + tY;
		float newMaxX = aabbMaxX + tX;
		float newMaxY = aabbMaxY + tY;
		
		res.set(newMinX, newMinY, newMaxX, newMaxY);
		
		return res;
	}
	
	public static <T extends IAabb2WF> T translate(float aabbMinX, float aabbMinY, float aabbMaxX, float aabbMaxY, float[] t, @ExtractionParam T res)
	{
		float tX = t[0];
		float tY = t[1];
		
		float newMinX = aabbMinX + tX;
		float newMinY = aabbMinY + tY;
		float newMaxX = aabbMaxX + tX;
		float newMaxY = aabbMaxY + tY;
		
		res.set(newMinX, newMinY, newMaxX, newMaxY);
		
		return res;
	}
	
	public static <T extends IAabb2WF> T translate(float aabbMinX, float aabbMinY, float aabbMaxX, float aabbMaxY, float tX, float tY, @ExtractionParam T res)
	{
		float newMinX = aabbMinX + tX;
		float newMinY = aabbMinY + tY;
		float newMaxX = aabbMaxX + tX;
		float newMaxY = aabbMaxY + tY;
		
		res.set(newMinX, newMinY, newMaxX, newMaxY);
		
		return res;
	}
	
	public static <T extends IAabb2WF> T translateAssign(@ExtractionParam T aabb, IVec2RF t)
	{
		float aabbMinX = aabb.minX();
		float aabbMinY = aabb.minY();
		float aabbMaxX = aabb.maxX();
		float aabbMaxY = aabb.maxY();
		
		float tX = t.x();
		float tY = t.y();
		
		float newMinX = aabbMinX + tX;
		float newMinY = aabbMinY + tY;
		float newMaxX = aabbMaxX + tX;
		float newMaxY = aabbMaxY + tY;
		
		aabb.set(newMinX, newMinY, newMaxX, newMaxY);
		
		return aabb;
	}
	
	public static <T extends IAabb2WF> T translateAssign(@ExtractionParam T aabb, float[] t)
	{
		float aabbMinX = aabb.minX();
		float aabbMinY = aabb.minY();
		float aabbMaxX = aabb.maxX();
		float aabbMaxY = aabb.maxY();
		
		float tX = t[0];
		float tY = t[1];
		
		float newMinX = aabbMinX + tX;
		float newMinY = aabbMinY + tY;
		float newMaxX = aabbMaxX + tX;
		float newMaxY = aabbMaxY + tY;
		
		aabb.set(newMinX, newMinY, newMaxX, newMaxY);
		
		return aabb;
	}
	
	public static <T extends IAabb2WF> T translateAssign(@ExtractionParam T aabb, float tX, float tY)
	{
		float aabbMinX = aabb.minX();
		float aabbMinY = aabb.minY();
		float aabbMaxX = aabb.maxX();
		float aabbMaxY = aabb.maxY();
		
		float newMinX = aabbMinX + tX;
		float newMinY = aabbMinY + tY;
		float newMaxX = aabbMaxX + tX;
		float newMaxY = aabbMaxY + tY;
		
		aabb.set(newMinX, newMinY, newMaxX, newMaxY);
		
		return aabb;
	}
	
	public static float[] translateMin(IAabb2RF aabb, IVec2RF t, @ExtractionParam float[] res)
	{
		float aabbMinX = aabb.minX();
		float aabbMinY = aabb.minY();
		float aabbMaxX = aabb.maxX();
		float aabbMaxY = aabb.maxY();
		
		float tX = t.x();
		float tY = t.y();
		
		float translatedMinX = aabbMinX + tX;
		float translatedMinY = aabbMinY + tY;
		
		float newMinX = MathUtils.min(translatedMinX, aabbMaxX);
		float newMinY = MathUtils.min(translatedMinY, aabbMaxY);
		float newMaxX = MathUtils.min(translatedMinX, aabbMaxX);
		float newMaxY = MathUtils.min(translatedMinY, aabbMaxY);
		
		res[0] = newMinX;
		res[1] = newMinY;
		res[2] = newMaxX;
		res[3] = newMaxY;
		
		return res;
	}
	
	public static float[] translateMin(IAabb2RF aabb, float[] t, @ExtractionParam float[] res)
	{
		float aabbMinX = aabb.minX();
		float aabbMinY = aabb.minY();
		float aabbMaxX = aabb.maxX();
		float aabbMaxY = aabb.maxY();
		
		float tX = t[0];
		float tY = t[1];
		
		float translatedMinX = aabbMinX + tX;
		float translatedMinY = aabbMinY + tY;
		
		float newMinX = MathUtils.min(translatedMinX, aabbMaxX);
		float newMinY = MathUtils.min(translatedMinY, aabbMaxY);
		float newMaxX = MathUtils.min(translatedMinX, aabbMaxX);
		float newMaxY = MathUtils.min(translatedMinY, aabbMaxY);
		
		res[0] = newMinX;
		res[1] = newMinY;
		res[2] = newMaxX;
		res[3] = newMaxY;
		
		return res;
	}
	
	public static float[] translateMin(IAabb2RF aabb, float tX, float tY, @ExtractionParam float[] res)
	{
		float aabbMinX = aabb.minX();
		float aabbMinY = aabb.minY();
		float aabbMaxX = aabb.maxX();
		float aabbMaxY = aabb.maxY();
		
		float translatedMinX = aabbMinX + tX;
		float translatedMinY = aabbMinY + tY;
		
		float newMinX = MathUtils.min(translatedMinX, aabbMaxX);
		float newMinY = MathUtils.min(translatedMinY, aabbMaxY);
		float newMaxX = MathUtils.min(translatedMinX, aabbMaxX);
		float newMaxY = MathUtils.min(translatedMinY, aabbMaxY);
		
		res[0] = newMinX;
		res[1] = newMinY;
		res[2] = newMaxX;
		res[3] = newMaxY;
		
		return res;
	}
	
	public static float[] translateMin(float[] aabb, IVec2RF t, @ExtractionParam float[] res)
	{
		float aabbMinX = aabb[0];
		float aabbMinY = aabb[1];
		float aabbMaxX = aabb[2];
		float aabbMaxY = aabb[3];
		
		float tX = t.x();
		float tY = t.y();
		
		float translatedMinX = aabbMinX + tX;
		float translatedMinY = aabbMinY + tY;
		
		float newMinX = MathUtils.min(translatedMinX, aabbMaxX);
		float newMinY = MathUtils.min(translatedMinY, aabbMaxY);
		float newMaxX = MathUtils.min(translatedMinX, aabbMaxX);
		float newMaxY = MathUtils.min(translatedMinY, aabbMaxY);
		
		res[0] = newMinX;
		res[1] = newMinY;
		res[2] = newMaxX;
		res[3] = newMaxY;
		
		return res;
	}
	
	public static float[] translateMin(IVec2RF aabbMin, IVec2RF aabbMax, IVec2RF t, @ExtractionParam float[] res)
	{
		float aabbMinX = aabbMin.x();
		float aabbMinY = aabbMin.y();
		float aabbMaxX = aabbMax.x();
		float aabbMaxY = aabbMax.y();
		
		float tX = t.x();
		float tY = t.y();
		
		float translatedMinX = aabbMinX + tX;
		float translatedMinY = aabbMinY + tY;
		
		float newMinX = MathUtils.min(translatedMinX, aabbMaxX);
		float newMinY = MathUtils.min(translatedMinY, aabbMaxY);
		float newMaxX = MathUtils.min(translatedMinX, aabbMaxX);
		float newMaxY = MathUtils.min(translatedMinY, aabbMaxY);
		
		res[0] = newMinX;
		res[1] = newMinY;
		res[2] = newMaxX;
		res[3] = newMaxY;
		
		return res;
	}
	
	public static float[] translateMin(IVec2RF aabbMin, IVec2RF aabbMax, float[] t, @ExtractionParam float[] res)
	{
		float aabbMinX = aabbMin.x();
		float aabbMinY = aabbMin.y();
		float aabbMaxX = aabbMax.x();
		float aabbMaxY = aabbMax.y();
		
		float tX = t[0];
		float tY = t[1];
		
		float translatedMinX = aabbMinX + tX;
		float translatedMinY = aabbMinY + tY;
		
		float newMinX = MathUtils.min(translatedMinX, aabbMaxX);
		float newMinY = MathUtils.min(translatedMinY, aabbMaxY);
		float newMaxX = MathUtils.min(translatedMinX, aabbMaxX);
		float newMaxY = MathUtils.min(translatedMinY, aabbMaxY);
		
		res[0] = newMinX;
		res[1] = newMinY;
		res[2] = newMaxX;
		res[3] = newMaxY;
		
		return res;
	}
	
	public static float[] translateMin(IVec2RF aabbMin, IVec2RF aabbMax, float tX, float tY, @ExtractionParam float[] res)
	{
		float aabbMinX = aabbMin.x();
		float aabbMinY = aabbMin.y();
		float aabbMaxX = aabbMax.x();
		float aabbMaxY = aabbMax.y();
		
		float translatedMinX = aabbMinX + tX;
		float translatedMinY = aabbMinY + tY;
		
		float newMinX = MathUtils.min(translatedMinX, aabbMaxX);
		float newMinY = MathUtils.min(translatedMinY, aabbMaxY);
		float newMaxX = MathUtils.min(translatedMinX, aabbMaxX);
		float newMaxY = MathUtils.min(translatedMinY, aabbMaxY);
		
		res[0] = newMinX;
		res[1] = newMinY;
		res[2] = newMaxX;
		res[3] = newMaxY;
		
		return res;
	}
	
	public static float[] translateMin(IVec2RF aabbMin, float[] aabbMax, IVec2RF t, @ExtractionParam float[] res)
	{
		float aabbMinX = aabbMin.x();
		float aabbMinY = aabbMin.y();
		float aabbMaxX = aabbMax[0];
		float aabbMaxY = aabbMax[1];
		
		float tX = t.x();
		float tY = t.y();
		
		float translatedMinX = aabbMinX + tX;
		float translatedMinY = aabbMinY + tY;
		
		float newMinX = MathUtils.min(translatedMinX, aabbMaxX);
		float newMinY = MathUtils.min(translatedMinY, aabbMaxY);
		float newMaxX = MathUtils.min(translatedMinX, aabbMaxX);
		float newMaxY = MathUtils.min(translatedMinY, aabbMaxY);
		
		res[0] = newMinX;
		res[1] = newMinY;
		res[2] = newMaxX;
		res[3] = newMaxY;
		
		return res;
	}
	
	public static float[] translateMin(IVec2RF aabbMin, float[] aabbMax, float[] t, @ExtractionParam float[] res)
	{
		float aabbMinX = aabbMin.x();
		float aabbMinY = aabbMin.y();
		float aabbMaxX = aabbMax[0];
		float aabbMaxY = aabbMax[1];
		
		float tX = t[0];
		float tY = t[1];
		
		float translatedMinX = aabbMinX + tX;
		float translatedMinY = aabbMinY + tY;
		
		float newMinX = MathUtils.min(translatedMinX, aabbMaxX);
		float newMinY = MathUtils.min(translatedMinY, aabbMaxY);
		float newMaxX = MathUtils.min(translatedMinX, aabbMaxX);
		float newMaxY = MathUtils.min(translatedMinY, aabbMaxY);
		
		res[0] = newMinX;
		res[1] = newMinY;
		res[2] = newMaxX;
		res[3] = newMaxY;
		
		return res;
	}
	
	public static float[] translateMin(IVec2RF aabbMin, float[] aabbMax, float tX, float tY, @ExtractionParam float[] res)
	{
		float aabbMinX = aabbMin.x();
		float aabbMinY = aabbMin.y();
		float aabbMaxX = aabbMax[0];
		float aabbMaxY = aabbMax[1];
		
		float translatedMinX = aabbMinX + tX;
		float translatedMinY = aabbMinY + tY;
		
		float newMinX = MathUtils.min(translatedMinX, aabbMaxX);
		float newMinY = MathUtils.min(translatedMinY, aabbMaxY);
		float newMaxX = MathUtils.min(translatedMinX, aabbMaxX);
		float newMaxY = MathUtils.min(translatedMinY, aabbMaxY);
		
		res[0] = newMinX;
		res[1] = newMinY;
		res[2] = newMaxX;
		res[3] = newMaxY;
		
		return res;
	}
	
	public static float[] translateMin(IVec2RF aabbMin, float aabbMaxX, float aabbMaxY, IVec2RF t, @ExtractionParam float[] res)
	{
		float aabbMinX = aabbMin.x();
		float aabbMinY = aabbMin.y();
		
		float tX = t.x();
		float tY = t.y();
		
		float translatedMinX = aabbMinX + tX;
		float translatedMinY = aabbMinY + tY;
		
		float newMinX = MathUtils.min(translatedMinX, aabbMaxX);
		float newMinY = MathUtils.min(translatedMinY, aabbMaxY);
		float newMaxX = MathUtils.min(translatedMinX, aabbMaxX);
		float newMaxY = MathUtils.min(translatedMinY, aabbMaxY);
		
		res[0] = newMinX;
		res[1] = newMinY;
		res[2] = newMaxX;
		res[3] = newMaxY;
		
		return res;
	}
	
	public static float[] translateMin(IVec2RF aabbMin, float aabbMaxX, float aabbMaxY, float[] t, @ExtractionParam float[] res)
	{
		float aabbMinX = aabbMin.x();
		float aabbMinY = aabbMin.y();
		
		float tX = t[0];
		float tY = t[1];
		
		float translatedMinX = aabbMinX + tX;
		float translatedMinY = aabbMinY + tY;
		
		float newMinX = MathUtils.min(translatedMinX, aabbMaxX);
		float newMinY = MathUtils.min(translatedMinY, aabbMaxY);
		float newMaxX = MathUtils.min(translatedMinX, aabbMaxX);
		float newMaxY = MathUtils.min(translatedMinY, aabbMaxY);
		
		res[0] = newMinX;
		res[1] = newMinY;
		res[2] = newMaxX;
		res[3] = newMaxY;
		
		return res;
	}
	
	public static float[] translateMin(IVec2RF aabbMin, float aabbMaxX, float aabbMaxY, float tX, float tY, @ExtractionParam float[] res)
	{
		float aabbMinX = aabbMin.x();
		float aabbMinY = aabbMin.y();
		
		float translatedMinX = aabbMinX + tX;
		float translatedMinY = aabbMinY + tY;
		
		float newMinX = MathUtils.min(translatedMinX, aabbMaxX);
		float newMinY = MathUtils.min(translatedMinY, aabbMaxY);
		float newMaxX = MathUtils.min(translatedMinX, aabbMaxX);
		float newMaxY = MathUtils.min(translatedMinY, aabbMaxY);
		
		res[0] = newMinX;
		res[1] = newMinY;
		res[2] = newMaxX;
		res[3] = newMaxY;
		
		return res;
	}
	
	public static float[] translateMin(float[] aabbMin, IVec2RF aabbMax, IVec2RF t, @ExtractionParam float[] res)
	{
		float aabbMinX = aabbMin[0];
		float aabbMinY = aabbMin[1];
		float aabbMaxX = aabbMax.x();
		float aabbMaxY = aabbMax.y();
		
		float tX = t.x();
		float tY = t.y();
		
		float translatedMinX = aabbMinX + tX;
		float translatedMinY = aabbMinY + tY;
		
		float newMinX = MathUtils.min(translatedMinX, aabbMaxX);
		float newMinY = MathUtils.min(translatedMinY, aabbMaxY);
		float newMaxX = MathUtils.min(translatedMinX, aabbMaxX);
		float newMaxY = MathUtils.min(translatedMinY, aabbMaxY);
		
		res[0] = newMinX;
		res[1] = newMinY;
		res[2] = newMaxX;
		res[3] = newMaxY;
		
		return res;
	}
	
	public static float[] translateMin(float[] aabbMin, IVec2RF aabbMax, float[] t, @ExtractionParam float[] res)
	{
		float aabbMinX = aabbMin[0];
		float aabbMinY = aabbMin[1];
		float aabbMaxX = aabbMax.x();
		float aabbMaxY = aabbMax.y();
		
		float tX = t[0];
		float tY = t[1];
		
		float translatedMinX = aabbMinX + tX;
		float translatedMinY = aabbMinY + tY;
		
		float newMinX = MathUtils.min(translatedMinX, aabbMaxX);
		float newMinY = MathUtils.min(translatedMinY, aabbMaxY);
		float newMaxX = MathUtils.min(translatedMinX, aabbMaxX);
		float newMaxY = MathUtils.min(translatedMinY, aabbMaxY);
		
		res[0] = newMinX;
		res[1] = newMinY;
		res[2] = newMaxX;
		res[3] = newMaxY;
		
		return res;
	}
	
	public static float[] translateMin(float[] aabbMin, IVec2RF aabbMax, float tX, float tY, @ExtractionParam float[] res)
	{
		float aabbMinX = aabbMin[0];
		float aabbMinY = aabbMin[1];
		float aabbMaxX = aabbMax.x();
		float aabbMaxY = aabbMax.y();
		
		float translatedMinX = aabbMinX + tX;
		float translatedMinY = aabbMinY + tY;
		
		float newMinX = MathUtils.min(translatedMinX, aabbMaxX);
		float newMinY = MathUtils.min(translatedMinY, aabbMaxY);
		float newMaxX = MathUtils.min(translatedMinX, aabbMaxX);
		float newMaxY = MathUtils.min(translatedMinY, aabbMaxY);
		
		res[0] = newMinX;
		res[1] = newMinY;
		res[2] = newMaxX;
		res[3] = newMaxY;
		
		return res;
	}
	
	public static float[] translateMin(float[] aabbMin, float[] aabbMax, IVec2RF t, @ExtractionParam float[] res)
	{
		float aabbMinX = aabbMin[0];
		float aabbMinY = aabbMin[1];
		float aabbMaxX = aabbMax[0];
		float aabbMaxY = aabbMax[1];
		
		float tX = t.x();
		float tY = t.y();
		
		float translatedMinX = aabbMinX + tX;
		float translatedMinY = aabbMinY + tY;
		
		float newMinX = MathUtils.min(translatedMinX, aabbMaxX);
		float newMinY = MathUtils.min(translatedMinY, aabbMaxY);
		float newMaxX = MathUtils.min(translatedMinX, aabbMaxX);
		float newMaxY = MathUtils.min(translatedMinY, aabbMaxY);
		
		res[0] = newMinX;
		res[1] = newMinY;
		res[2] = newMaxX;
		res[3] = newMaxY;
		
		return res;
	}
	
	public static float[] translateMin(float[] aabbMin, float aabbMaxX, float aabbMaxY, IVec2RF t, @ExtractionParam float[] res)
	{
		float aabbMinX = aabbMin[0];
		float aabbMinY = aabbMin[1];
		
		float tX = t.x();
		float tY = t.y();
		
		float translatedMinX = aabbMinX + tX;
		float translatedMinY = aabbMinY + tY;
		
		float newMinX = MathUtils.min(translatedMinX, aabbMaxX);
		float newMinY = MathUtils.min(translatedMinY, aabbMaxY);
		float newMaxX = MathUtils.min(translatedMinX, aabbMaxX);
		float newMaxY = MathUtils.min(translatedMinY, aabbMaxY);
		
		res[0] = newMinX;
		res[1] = newMinY;
		res[2] = newMaxX;
		res[3] = newMaxY;
		
		return res;
	}
	
	public static float[] translateMin(float aabbMinX, float aabbMinY, IVec2RF aabbMax, IVec2RF t, @ExtractionParam float[] res)
	{
		float aabbMaxX = aabbMax.x();
		float aabbMaxY = aabbMax.y();
		
		float tX = t.x();
		float tY = t.y();
		
		float translatedMinX = aabbMinX + tX;
		float translatedMinY = aabbMinY + tY;
		
		float newMinX = MathUtils.min(translatedMinX, aabbMaxX);
		float newMinY = MathUtils.min(translatedMinY, aabbMaxY);
		float newMaxX = MathUtils.min(translatedMinX, aabbMaxX);
		float newMaxY = MathUtils.min(translatedMinY, aabbMaxY);
		
		res[0] = newMinX;
		res[1] = newMinY;
		res[2] = newMaxX;
		res[3] = newMaxY;
		
		return res;
	}
	
	public static float[] translateMin(float aabbMinX, float aabbMinY, IVec2RF aabbMax, float[] t, @ExtractionParam float[] res)
	{
		float aabbMaxX = aabbMax.x();
		float aabbMaxY = aabbMax.y();
		
		float tX = t[0];
		float tY = t[1];
		
		float translatedMinX = aabbMinX + tX;
		float translatedMinY = aabbMinY + tY;
		
		float newMinX = MathUtils.min(translatedMinX, aabbMaxX);
		float newMinY = MathUtils.min(translatedMinY, aabbMaxY);
		float newMaxX = MathUtils.min(translatedMinX, aabbMaxX);
		float newMaxY = MathUtils.min(translatedMinY, aabbMaxY);
		
		res[0] = newMinX;
		res[1] = newMinY;
		res[2] = newMaxX;
		res[3] = newMaxY;
		
		return res;
	}
	
	public static float[] translateMin(float aabbMinX, float aabbMinY, IVec2RF aabbMax, float tX, float tY, @ExtractionParam float[] res)
	{
		float aabbMaxX = aabbMax.x();
		float aabbMaxY = aabbMax.y();
		
		float translatedMinX = aabbMinX + tX;
		float translatedMinY = aabbMinY + tY;
		
		float newMinX = MathUtils.min(translatedMinX, aabbMaxX);
		float newMinY = MathUtils.min(translatedMinY, aabbMaxY);
		float newMaxX = MathUtils.min(translatedMinX, aabbMaxX);
		float newMaxY = MathUtils.min(translatedMinY, aabbMaxY);
		
		res[0] = newMinX;
		res[1] = newMinY;
		res[2] = newMaxX;
		res[3] = newMaxY;
		
		return res;
	}
	
	public static float[] translateMin(float aabbMinX, float aabbMinY, float[] aabbMax, IVec2RF t, @ExtractionParam float[] res)
	{
		float aabbMaxX = aabbMax[0];
		float aabbMaxY = aabbMax[1];
		
		float tX = t.x();
		float tY = t.y();
		
		float translatedMinX = aabbMinX + tX;
		float translatedMinY = aabbMinY + tY;
		
		float newMinX = MathUtils.min(translatedMinX, aabbMaxX);
		float newMinY = MathUtils.min(translatedMinY, aabbMaxY);
		float newMaxX = MathUtils.min(translatedMinX, aabbMaxX);
		float newMaxY = MathUtils.min(translatedMinY, aabbMaxY);
		
		res[0] = newMinX;
		res[1] = newMinY;
		res[2] = newMaxX;
		res[3] = newMaxY;
		
		return res;
	}
	
	public static float[] translateMin(float aabbMinX, float aabbMinY, float aabbMaxX, float aabbMaxY, IVec2RF t, @ExtractionParam float[] res)
	{
		float tX = t.x();
		float tY = t.y();
		
		float translatedMinX = aabbMinX + tX;
		float translatedMinY = aabbMinY + tY;
		
		float newMinX = MathUtils.min(translatedMinX, aabbMaxX);
		float newMinY = MathUtils.min(translatedMinY, aabbMaxY);
		float newMaxX = MathUtils.min(translatedMinX, aabbMaxX);
		float newMaxY = MathUtils.min(translatedMinY, aabbMaxY);
		
		res[0] = newMinX;
		res[1] = newMinY;
		res[2] = newMaxX;
		res[3] = newMaxY;
		
		return res;
	}
	
	public static float[] translateMinAssign(@ExtractionParam float[] aabb, IVec2RF t)
	{
		float aabbMinX = aabb[0];
		float aabbMinY = aabb[1];
		float aabbMaxX = aabb[2];
		float aabbMaxY = aabb[3];
		
		float tX = t.x();
		float tY = t.y();
		
		float translatedMinX = aabbMinX + tX;
		float translatedMinY = aabbMinY + tY;
		
		float newMinX = MathUtils.min(translatedMinX, aabbMaxX);
		float newMinY = MathUtils.min(translatedMinY, aabbMaxY);
		float newMaxX = MathUtils.min(translatedMinX, aabbMaxX);
		float newMaxY = MathUtils.min(translatedMinY, aabbMaxY);
		
		aabb[0] = newMinX;
		aabb[1] = newMinY;
		aabb[2] = newMaxX;
		aabb[3] = newMaxY;
		
		return aabb;
	}
	
	public static <T extends IAabb2WF> T translateMin(IAabb2RF aabb, IVec2RF t, @ExtractionParam T res)
	{
		float aabbMinX = aabb.minX();
		float aabbMinY = aabb.minY();
		float aabbMaxX = aabb.maxX();
		float aabbMaxY = aabb.maxY();
		
		float tX = t.x();
		float tY = t.y();
		
		float translatedMinX = aabbMinX + tX;
		float translatedMinY = aabbMinY + tY;
		
		float newMinX = MathUtils.min(translatedMinX, aabbMaxX);
		float newMinY = MathUtils.min(translatedMinY, aabbMaxY);
		float newMaxX = MathUtils.min(translatedMinX, aabbMaxX);
		float newMaxY = MathUtils.min(translatedMinY, aabbMaxY);
		
		res.set(newMinX, newMinY, newMaxX, newMaxY);
		
		return res;
	}
	
	public static <T extends IAabb2WF> T translateMin(IAabb2RF aabb, float[] t, @ExtractionParam T res)
	{
		float aabbMinX = aabb.minX();
		float aabbMinY = aabb.minY();
		float aabbMaxX = aabb.maxX();
		float aabbMaxY = aabb.maxY();
		
		float tX = t[0];
		float tY = t[1];
		
		float translatedMinX = aabbMinX + tX;
		float translatedMinY = aabbMinY + tY;
		
		float newMinX = MathUtils.min(translatedMinX, aabbMaxX);
		float newMinY = MathUtils.min(translatedMinY, aabbMaxY);
		float newMaxX = MathUtils.min(translatedMinX, aabbMaxX);
		float newMaxY = MathUtils.min(translatedMinY, aabbMaxY);
		
		res.set(newMinX, newMinY, newMaxX, newMaxY);
		
		return res;
	}
	
	public static <T extends IAabb2WF> T translateMin(IAabb2RF aabb, float tX, float tY, @ExtractionParam T res)
	{
		float aabbMinX = aabb.minX();
		float aabbMinY = aabb.minY();
		float aabbMaxX = aabb.maxX();
		float aabbMaxY = aabb.maxY();
		
		float translatedMinX = aabbMinX + tX;
		float translatedMinY = aabbMinY + tY;
		
		float newMinX = MathUtils.min(translatedMinX, aabbMaxX);
		float newMinY = MathUtils.min(translatedMinY, aabbMaxY);
		float newMaxX = MathUtils.min(translatedMinX, aabbMaxX);
		float newMaxY = MathUtils.min(translatedMinY, aabbMaxY);
		
		res.set(newMinX, newMinY, newMaxX, newMaxY);
		
		return res;
	}
	
	public static <T extends IAabb2WF> T translateMin(float[] aabb, IVec2RF t, @ExtractionParam T res)
	{
		float aabbMinX = aabb[0];
		float aabbMinY = aabb[1];
		float aabbMaxX = aabb[3];
		float aabbMaxY = aabb[4];
		
		float tX = t.x();
		float tY = t.y();
		
		float translatedMinX = aabbMinX + tX;
		float translatedMinY = aabbMinY + tY;
		
		float newMinX = MathUtils.min(translatedMinX, aabbMaxX);
		float newMinY = MathUtils.min(translatedMinY, aabbMaxY);
		float newMaxX = MathUtils.min(translatedMinX, aabbMaxX);
		float newMaxY = MathUtils.min(translatedMinY, aabbMaxY);
		
		res.set(newMinX, newMinY, newMaxX, newMaxY);
		
		return res;
	}
	
	public static <T extends IAabb2WF> T translateMin(float[] aabb, float[] t, @ExtractionParam T res)
	{
		float aabbMinX = aabb[0];
		float aabbMinY = aabb[1];
		float aabbMaxX = aabb[2];
		float aabbMaxY = aabb[3];
		
		float tX = t[0];
		float tY = t[1];
		
		float translatedMinX = aabbMinX + tX;
		float translatedMinY = aabbMinY + tY;
		
		float newMinX = MathUtils.min(translatedMinX, aabbMaxX);
		float newMinY = MathUtils.min(translatedMinY, aabbMaxY);
		float newMaxX = MathUtils.min(translatedMinX, aabbMaxX);
		float newMaxY = MathUtils.min(translatedMinY, aabbMaxY);
		
		res.set(newMinX, newMinY, newMaxX, newMaxY);
		
		return res;
	}
	
	public static <T extends IAabb2WF> T translateMin(float[] aabb, float tX, float tY, @ExtractionParam T res)
	{
		float aabbMinX = aabb[0];
		float aabbMinY = aabb[1];
		float aabbMaxX = aabb[2];
		float aabbMaxY = aabb[3];
		
		float translatedMinX = aabbMinX + tX;
		float translatedMinY = aabbMinY + tY;
		
		float newMinX = MathUtils.min(translatedMinX, aabbMaxX);
		float newMinY = MathUtils.min(translatedMinY, aabbMaxY);
		float newMaxX = MathUtils.min(translatedMinX, aabbMaxX);
		float newMaxY = MathUtils.min(translatedMinY, aabbMaxY);
		
		res.set(newMinX, newMinY, newMaxX, newMaxY);
		
		return res;
	}
	
	public static <T extends IAabb2WF> T translateMin(IVec2RF aabbMin, IVec2RF aabbMax, IVec2RF t, @ExtractionParam T res)
	{
		float aabbMinX = aabbMin.x();
		float aabbMinY = aabbMin.y();
		float aabbMaxX = aabbMax.x();
		float aabbMaxY = aabbMax.y();
		
		float tX = t.x();
		float tY = t.y();
		
		float translatedMinX = aabbMinX + tX;
		float translatedMinY = aabbMinY + tY;
		
		float newMinX = MathUtils.min(translatedMinX, aabbMaxX);
		float newMinY = MathUtils.min(translatedMinY, aabbMaxY);
		float newMaxX = MathUtils.min(translatedMinX, aabbMaxX);
		float newMaxY = MathUtils.min(translatedMinY, aabbMaxY);
		
		res.set(newMinX, newMinY, newMaxX, newMaxY);
		
		return res;
	}
	
	public static <T extends IAabb2WF> T translateMin(IVec2RF aabbMin, IVec2RF aabbMax, float[] t, @ExtractionParam T res)
	{
		float aabbMinX = aabbMin.x();
		float aabbMinY = aabbMin.y();
		float aabbMaxX = aabbMax.x();
		float aabbMaxY = aabbMax.y();
		
		float tX = t[0];
		float tY = t[1];
		
		float translatedMinX = aabbMinX + tX;
		float translatedMinY = aabbMinY + tY;
		
		float newMinX = MathUtils.min(translatedMinX, aabbMaxX);
		float newMinY = MathUtils.min(translatedMinY, aabbMaxY);
		float newMaxX = MathUtils.min(translatedMinX, aabbMaxX);
		float newMaxY = MathUtils.min(translatedMinY, aabbMaxY);
		
		res.set(newMinX, newMinY, newMaxX, newMaxY);
		
		return res;
	}
	
	public static <T extends IAabb2WF> T translateMin(IVec2RF aabbMin, IVec2RF aabbMax, float tX, float tY, @ExtractionParam T res)
	{
		float aabbMinX = aabbMin.x();
		float aabbMinY = aabbMin.y();
		float aabbMaxX = aabbMax.x();
		float aabbMaxY = aabbMax.y();
		
		float translatedMinX = aabbMinX + tX;
		float translatedMinY = aabbMinY + tY;
		
		float newMinX = MathUtils.min(translatedMinX, aabbMaxX);
		float newMinY = MathUtils.min(translatedMinY, aabbMaxY);
		float newMaxX = MathUtils.min(translatedMinX, aabbMaxX);
		float newMaxY = MathUtils.min(translatedMinY, aabbMaxY);
		
		res.set(newMinX, newMinY, newMaxX, newMaxY);
		
		return res;
	}
	
	public static <T extends IAabb2WF> T translateMin(IVec2RF aabbMin, float[] aabbMax, IVec2RF t, @ExtractionParam T res)
	{
		float aabbMinX = aabbMin.x();
		float aabbMinY = aabbMin.y();
		float aabbMaxX = aabbMax[0];
		float aabbMaxY = aabbMax[1];
		
		float tX = t.x();
		float tY = t.y();
		
		float translatedMinX = aabbMinX + tX;
		float translatedMinY = aabbMinY + tY;
		
		float newMinX = MathUtils.min(translatedMinX, aabbMaxX);
		float newMinY = MathUtils.min(translatedMinY, aabbMaxY);
		float newMaxX = MathUtils.min(translatedMinX, aabbMaxX);
		float newMaxY = MathUtils.min(translatedMinY, aabbMaxY);
		
		res.set(newMinX, newMinY, newMaxX, newMaxY);
		
		return res;
	}
	
	public static <T extends IAabb2WF> T translateMin(IVec2RF aabbMin, float[] aabbMax, float[] t, @ExtractionParam T res)
	{
		float aabbMinX = aabbMin.x();
		float aabbMinY = aabbMin.y();
		float aabbMaxX = aabbMax[0];
		float aabbMaxY = aabbMax[1];
		
		float tX = t[0];
		float tY = t[1];
		
		float translatedMinX = aabbMinX + tX;
		float translatedMinY = aabbMinY + tY;
		
		float newMinX = MathUtils.min(translatedMinX, aabbMaxX);
		float newMinY = MathUtils.min(translatedMinY, aabbMaxY);
		float newMaxX = MathUtils.min(translatedMinX, aabbMaxX);
		float newMaxY = MathUtils.min(translatedMinY, aabbMaxY);
		
		res.set(newMinX, newMinY, newMaxX, newMaxY);
		
		return res;
	}
	
	public static <T extends IAabb2WF> T translateMin(IVec2RF aabbMin, float[] aabbMax, float tX, float tY, @ExtractionParam T res)
	{
		float aabbMinX = aabbMin.x();
		float aabbMinY = aabbMin.y();
		float aabbMaxX = aabbMax[0];
		float aabbMaxY = aabbMax[1];
		
		float translatedMinX = aabbMinX + tX;
		float translatedMinY = aabbMinY + tY;
		
		float newMinX = MathUtils.min(translatedMinX, aabbMaxX);
		float newMinY = MathUtils.min(translatedMinY, aabbMaxY);
		float newMaxX = MathUtils.min(translatedMinX, aabbMaxX);
		float newMaxY = MathUtils.min(translatedMinY, aabbMaxY);
		
		res.set(newMinX, newMinY, newMaxX, newMaxY);
		
		return res;
	}
	
	public static <T extends IAabb2WF> T translateMin(IVec2RF aabbMin, float aabbMaxX, float aabbMaxY, IVec2RF t, @ExtractionParam T res)
	{
		float aabbMinX = aabbMin.x();
		float aabbMinY = aabbMin.y();
		
		float tX = t.x();
		float tY = t.y();
		
		float translatedMinX = aabbMinX + tX;
		float translatedMinY = aabbMinY + tY;
		
		float newMinX = MathUtils.min(translatedMinX, aabbMaxX);
		float newMinY = MathUtils.min(translatedMinY, aabbMaxY);
		float newMaxX = MathUtils.min(translatedMinX, aabbMaxX);
		float newMaxY = MathUtils.min(translatedMinY, aabbMaxY);
		
		res.set(newMinX, newMinY, newMaxX, newMaxY);
		
		return res;
	}
	
	public static <T extends IAabb2WF> T translateMin(IVec2RF aabbMin, float aabbMaxX, float aabbMaxY, float[] t, @ExtractionParam T res)
	{
		float aabbMinX = aabbMin.x();
		float aabbMinY = aabbMin.y();
		
		float tX = t[0];
		float tY = t[1];
		
		float translatedMinX = aabbMinX + tX;
		float translatedMinY = aabbMinY + tY;
		
		float newMinX = MathUtils.min(translatedMinX, aabbMaxX);
		float newMinY = MathUtils.min(translatedMinY, aabbMaxY);
		float newMaxX = MathUtils.min(translatedMinX, aabbMaxX);
		float newMaxY = MathUtils.min(translatedMinY, aabbMaxY);
		
		res.set(newMinX, newMinY, newMaxX, newMaxY);
		
		return res;
	}
	
	public static <T extends IAabb2WF> T translateMin(IVec2RF aabbMin, float aabbMaxX, float aabbMaxY, float tX, float tY, @ExtractionParam T res)
	{
		float aabbMinX = aabbMin.x();
		float aabbMinY = aabbMin.y();
		
		float translatedMinX = aabbMinX + tX;
		float translatedMinY = aabbMinY + tY;
		
		float newMinX = MathUtils.min(translatedMinX, aabbMaxX);
		float newMinY = MathUtils.min(translatedMinY, aabbMaxY);
		float newMaxX = MathUtils.min(translatedMinX, aabbMaxX);
		float newMaxY = MathUtils.min(translatedMinY, aabbMaxY);
		
		res.set(newMinX, newMinY, newMaxX, newMaxY);
		
		return res;
	}
	
	public static <T extends IAabb2WF> T translateMin(float[] aabbMin, IVec2RF aabbMax, IVec2RF t, @ExtractionParam T res)
	{
		float aabbMinX = aabbMin[0];
		float aabbMinY = aabbMin[1];
		float aabbMaxX = aabbMax.x();
		float aabbMaxY = aabbMax.y();
		
		float tX = t.x();
		float tY = t.y();
		
		float translatedMinX = aabbMinX + tX;
		float translatedMinY = aabbMinY + tY;
		
		float newMinX = MathUtils.min(translatedMinX, aabbMaxX);
		float newMinY = MathUtils.min(translatedMinY, aabbMaxY);
		float newMaxX = MathUtils.min(translatedMinX, aabbMaxX);
		float newMaxY = MathUtils.min(translatedMinY, aabbMaxY);
		
		res.set(newMinX, newMinY, newMaxX, newMaxY);
		
		return res;
	}
	
	public static <T extends IAabb2WF> T translateMin(float[] aabbMin, IVec2RF aabbMax, float[] t, @ExtractionParam T res)
	{
		float aabbMinX = aabbMin[0];
		float aabbMinY = aabbMin[1];
		float aabbMaxX = aabbMax.x();
		float aabbMaxY = aabbMax.y();
		
		float tX = t[0];
		float tY = t[1];
		
		float translatedMinX = aabbMinX + tX;
		float translatedMinY = aabbMinY + tY;
		
		float newMinX = MathUtils.min(translatedMinX, aabbMaxX);
		float newMinY = MathUtils.min(translatedMinY, aabbMaxY);
		float newMaxX = MathUtils.min(translatedMinX, aabbMaxX);
		float newMaxY = MathUtils.min(translatedMinY, aabbMaxY);
		
		res.set(newMinX, newMinY, newMaxX, newMaxY);
		
		return res;
	}
	
	public static <T extends IAabb2WF> T translateMin(float[] aabbMin, IVec2RF aabbMax, float tX, float tY, @ExtractionParam T res)
	{
		float aabbMinX = aabbMin[0];
		float aabbMinY = aabbMin[1];
		float aabbMaxX = aabbMax.x();
		float aabbMaxY = aabbMax.y();
		
		float translatedMinX = aabbMinX + tX;
		float translatedMinY = aabbMinY + tY;
		
		float newMinX = MathUtils.min(translatedMinX, aabbMaxX);
		float newMinY = MathUtils.min(translatedMinY, aabbMaxY);
		float newMaxX = MathUtils.min(translatedMinX, aabbMaxX);
		float newMaxY = MathUtils.min(translatedMinY, aabbMaxY);
		
		res.set(newMinX, newMinY, newMaxX, newMaxY);
		
		return res;
	}
	
	public static <T extends IAabb2WF> T translateMin(float[] aabbMin, float[] aabbMax, IVec2RF t, @ExtractionParam T res)
	{
		float aabbMinX = aabbMin[0];
		float aabbMinY = aabbMin[1];
		float aabbMaxX = aabbMax[0];
		float aabbMaxY = aabbMax[1];
		
		float tX = t.x();
		float tY = t.y();
		
		float translatedMinX = aabbMinX + tX;
		float translatedMinY = aabbMinY + tY;
		
		float newMinX = MathUtils.min(translatedMinX, aabbMaxX);
		float newMinY = MathUtils.min(translatedMinY, aabbMaxY);
		float newMaxX = MathUtils.min(translatedMinX, aabbMaxX);
		float newMaxY = MathUtils.min(translatedMinY, aabbMaxY);
		
		res.set(newMinX, newMinY, newMaxX, newMaxY);
		
		return res;
	}
	
	public static <T extends IAabb2WF> T translateMin(float[] aabbMin, float[] aabbMax, float[] t, @ExtractionParam T res)
	{
		float aabbMinX = aabbMin[0];
		float aabbMinY = aabbMin[1];
		float aabbMaxX = aabbMax[0];
		float aabbMaxY = aabbMax[1];
		
		float tX = t[0];
		float tY = t[1];
		
		float translatedMinX = aabbMinX + tX;
		float translatedMinY = aabbMinY + tY;
		
		float newMinX = MathUtils.min(translatedMinX, aabbMaxX);
		float newMinY = MathUtils.min(translatedMinY, aabbMaxY);
		float newMaxX = MathUtils.min(translatedMinX, aabbMaxX);
		float newMaxY = MathUtils.min(translatedMinY, aabbMaxY);
		
		res.set(newMinX, newMinY, newMaxX, newMaxY);
		
		return res;
	}
	
	public static <T extends IAabb2WF> T translateMin(float[] aabbMin, float[] aabbMax, float tX, float tY, @ExtractionParam T res)
	{
		float aabbMinX = aabbMin[0];
		float aabbMinY = aabbMin[1];
		float aabbMaxX = aabbMax[0];
		float aabbMaxY = aabbMax[1];
		
		float translatedMinX = aabbMinX + tX;
		float translatedMinY = aabbMinY + tY;
		
		float newMinX = MathUtils.min(translatedMinX, aabbMaxX);
		float newMinY = MathUtils.min(translatedMinY, aabbMaxY);
		float newMaxX = MathUtils.min(translatedMinX, aabbMaxX);
		float newMaxY = MathUtils.min(translatedMinY, aabbMaxY);
		
		res.set(newMinX, newMinY, newMaxX, newMaxY);
		
		return res;
	}
	
	public static <T extends IAabb2WF> T translateMin(float[] aabbMin, float aabbMaxX, float aabbMaxY, IVec2RF t, @ExtractionParam T res)
	{
		float aabbMinX = aabbMin[0];
		float aabbMinY = aabbMin[1];
		
		float tX = t.x();
		float tY = t.y();
		
		float translatedMinX = aabbMinX + tX;
		float translatedMinY = aabbMinY + tY;
		
		float newMinX = MathUtils.min(translatedMinX, aabbMaxX);
		float newMinY = MathUtils.min(translatedMinY, aabbMaxY);
		float newMaxX = MathUtils.min(translatedMinX, aabbMaxX);
		float newMaxY = MathUtils.min(translatedMinY, aabbMaxY);
		
		res.set(newMinX, newMinY, newMaxX, newMaxY);
		
		return res;
	}
	
	public static <T extends IAabb2WF> T translateMin(float[] aabbMin, float aabbMaxX, float aabbMaxY, float[] t, @ExtractionParam T res)
	{
		float aabbMinX = aabbMin[0];
		float aabbMinY = aabbMin[1];
		
		float tX = t[0];
		float tY = t[1];
		
		float translatedMinX = aabbMinX + tX;
		float translatedMinY = aabbMinY + tY;
		
		float newMinX = MathUtils.min(translatedMinX, aabbMaxX);
		float newMinY = MathUtils.min(translatedMinY, aabbMaxY);
		float newMaxX = MathUtils.min(translatedMinX, aabbMaxX);
		float newMaxY = MathUtils.min(translatedMinY, aabbMaxY);
		
		res.set(newMinX, newMinY, newMaxX, newMaxY);
		
		return res;
	}
	
	public static <T extends IAabb2WF> T translateMin(float[] aabbMin, float aabbMaxX, float aabbMaxY, float tX, float tY, @ExtractionParam T res)
	{
		float aabbMinX = aabbMin[0];
		float aabbMinY = aabbMin[1];
		
		float translatedMinX = aabbMinX + tX;
		float translatedMinY = aabbMinY + tY;
		
		float newMinX = MathUtils.min(translatedMinX, aabbMaxX);
		float newMinY = MathUtils.min(translatedMinY, aabbMaxY);
		float newMaxX = MathUtils.min(translatedMinX, aabbMaxX);
		float newMaxY = MathUtils.min(translatedMinY, aabbMaxY);
		
		res.set(newMinX, newMinY, newMaxX, newMaxY);
		
		return res;
	}
	
	public static <T extends IAabb2WF> T translateMin(float aabbMinX, float aabbMinY, IVec2RF aabbMax, IVec2RF t, @ExtractionParam T res)
	{
		float aabbMaxX = aabbMax.x();
		float aabbMaxY = aabbMax.y();
		
		float tX = t.x();
		float tY = t.y();
		
		float translatedMinX = aabbMinX + tX;
		float translatedMinY = aabbMinY + tY;
		
		float newMinX = MathUtils.min(translatedMinX, aabbMaxX);
		float newMinY = MathUtils.min(translatedMinY, aabbMaxY);
		float newMaxX = MathUtils.min(translatedMinX, aabbMaxX);
		float newMaxY = MathUtils.min(translatedMinY, aabbMaxY);
		
		res.set(newMinX, newMinY, newMaxX, newMaxY);
		
		return res;
	}
	
	public static <T extends IAabb2WF> T translateMin(float aabbMinX, float aabbMinY, IVec2RF aabbMax, float[] t, @ExtractionParam T res)
	{
		float aabbMaxX = aabbMax.x();
		float aabbMaxY = aabbMax.y();
		
		float tX = t[0];
		float tY = t[1];
		
		float translatedMinX = aabbMinX + tX;
		float translatedMinY = aabbMinY + tY;
		
		float newMinX = MathUtils.min(translatedMinX, aabbMaxX);
		float newMinY = MathUtils.min(translatedMinY, aabbMaxY);
		float newMaxX = MathUtils.min(translatedMinX, aabbMaxX);
		float newMaxY = MathUtils.min(translatedMinY, aabbMaxY);
		
		res.set(newMinX, newMinY, newMaxX, newMaxY);
		
		return res;
	}
	
	public static <T extends IAabb2WF> T translateMin(float aabbMinX, float aabbMinY, IVec2RF aabbMax, float tX, float tY, @ExtractionParam T res)
	{
		float aabbMaxX = aabbMax.x();
		float aabbMaxY = aabbMax.y();
		
		float translatedMinX = aabbMinX + tX;
		float translatedMinY = aabbMinY + tY;
		
		float newMinX = MathUtils.min(translatedMinX, aabbMaxX);
		float newMinY = MathUtils.min(translatedMinY, aabbMaxY);
		float newMaxX = MathUtils.min(translatedMinX, aabbMaxX);
		float newMaxY = MathUtils.min(translatedMinY, aabbMaxY);
		
		res.set(newMinX, newMinY, newMaxX, newMaxY);
		
		return res;
	}
	
	public static <T extends IAabb2WF> T translateMin(float aabbMinX, float aabbMinY, float[] aabbMax, IVec2RF t, @ExtractionParam T res)
	{
		float aabbMaxX = aabbMax[0];
		float aabbMaxY = aabbMax[1];
		
		float tX = t.x();
		float tY = t.y();
		
		float translatedMinX = aabbMinX + tX;
		float translatedMinY = aabbMinY + tY;
		
		float newMinX = MathUtils.min(translatedMinX, aabbMaxX);
		float newMinY = MathUtils.min(translatedMinY, aabbMaxY);
		float newMaxX = MathUtils.min(translatedMinX, aabbMaxX);
		float newMaxY = MathUtils.min(translatedMinY, aabbMaxY);
		
		res.set(newMinX, newMinY, newMaxX, newMaxY);
		
		return res;
	}
	
	public static <T extends IAabb2WF> T translateMin(float aabbMinX, float aabbMinY, float[] aabbMax, float[] t, @ExtractionParam T res)
	{
		float aabbMaxX = aabbMax[0];
		float aabbMaxY = aabbMax[1];
		
		float tX = t[0];
		float tY = t[1];
		
		float translatedMinX = aabbMinX + tX;
		float translatedMinY = aabbMinY + tY;
		
		float newMinX = MathUtils.min(translatedMinX, aabbMaxX);
		float newMinY = MathUtils.min(translatedMinY, aabbMaxY);
		float newMaxX = MathUtils.min(translatedMinX, aabbMaxX);
		float newMaxY = MathUtils.min(translatedMinY, aabbMaxY);
		
		res.set(newMinX, newMinY, newMaxX, newMaxY);
		
		return res;
	}
	
	public static <T extends IAabb2WF> T translateMin(float aabbMinX, float aabbMinY, float[] aabbMax, float tX, float tY, @ExtractionParam T res)
	{
		float aabbMaxX = aabbMax[0];
		float aabbMaxY = aabbMax[1];
		
		float translatedMinX = aabbMinX + tX;
		float translatedMinY = aabbMinY + tY;
		
		float newMinX = MathUtils.min(translatedMinX, aabbMaxX);
		float newMinY = MathUtils.min(translatedMinY, aabbMaxY);
		float newMaxX = MathUtils.min(translatedMinX, aabbMaxX);
		float newMaxY = MathUtils.min(translatedMinY, aabbMaxY);
		
		res.set(newMinX, newMinY, newMaxX, newMaxY);
		
		return res;
	}
	
	public static <T extends IAabb2WF> T translateMin(float aabbMinX, float aabbMinY, float aabbMaxX, float aabbMaxY, IVec2RF t, @ExtractionParam T res)
	{
		float tX = t.x();
		float tY = t.y();
		
		float translatedMinX = aabbMinX + tX;
		float translatedMinY = aabbMinY + tY;
		
		float newMinX = MathUtils.min(translatedMinX, aabbMaxX);
		float newMinY = MathUtils.min(translatedMinY, aabbMaxY);
		float newMaxX = MathUtils.min(translatedMinX, aabbMaxX);
		float newMaxY = MathUtils.min(translatedMinY, aabbMaxY);
		
		res.set(newMinX, newMinY, newMaxX, newMaxY);
		
		return res;
	}
	
	public static <T extends IAabb2WF> T translateMin(float aabbMinX, float aabbMinY, float aabbMaxX, float aabbMaxY, float[] t, @ExtractionParam T res)
	{
		float tX = t[0];
		float tY = t[1];
		
		float translatedMinX = aabbMinX + tX;
		float translatedMinY = aabbMinY + tY;
		
		float newMinX = MathUtils.min(translatedMinX, aabbMaxX);
		float newMinY = MathUtils.min(translatedMinY, aabbMaxY);
		float newMaxX = MathUtils.min(translatedMinX, aabbMaxX);
		float newMaxY = MathUtils.min(translatedMinY, aabbMaxY);
		
		res.set(newMinX, newMinY, newMaxX, newMaxY);
		
		return res;
	}
	
	public static <T extends IAabb2WF> T translateMin(float aabbMinX, float aabbMinY, float aabbMaxX, float aabbMaxY, float tX, float tY, @ExtractionParam T res)
	{
		float translatedMinX = aabbMinX + tX;
		float translatedMinY = aabbMinY + tY;
		
		float newMinX = MathUtils.min(translatedMinX, aabbMaxX);
		float newMinY = MathUtils.min(translatedMinY, aabbMaxY);
		float newMaxX = MathUtils.min(translatedMinX, aabbMaxX);
		float newMaxY = MathUtils.min(translatedMinY, aabbMaxY);
		
		res.set(newMinX, newMinY, newMaxX, newMaxY);
		
		return res;
	}
	
	public static <T extends IAabb2WF> T translateMinAssign(@ExtractionParam T aabb, IVec2RF t)
	{
		float aabbMinX = aabb.minX();
		float aabbMinY = aabb.minY();
		float aabbMaxX = aabb.maxX();
		float aabbMaxY = aabb.maxY();
		
		float tX = t.x();
		float tY = t.y();
		
		float translatedMinX = aabbMinX + tX;
		float translatedMinY = aabbMinY + tY;
		
		float newMinX = MathUtils.min(translatedMinX, aabbMaxX);
		float newMinY = MathUtils.min(translatedMinY, aabbMaxY);
		float newMaxX = MathUtils.min(translatedMinX, aabbMaxX);
		float newMaxY = MathUtils.min(translatedMinY, aabbMaxY);
		
		aabb.set(newMinX, newMinY, newMaxX, newMaxY);
		
		return aabb;
	}
	
	public static <T extends IAabb2WF> T translateMinAssign(@ExtractionParam T aabb, float[] t)
	{
		float aabbMinX = aabb.minX();
		float aabbMinY = aabb.minY();
		float aabbMaxX = aabb.maxX();
		float aabbMaxY = aabb.maxY();
		
		float tX = t[0];
		float tY = t[1];
		
		float translatedMinX = aabbMinX + tX;
		float translatedMinY = aabbMinY + tY;
		
		float newMinX = MathUtils.min(translatedMinX, aabbMaxX);
		float newMinY = MathUtils.min(translatedMinY, aabbMaxY);
		float newMaxX = MathUtils.min(translatedMinX, aabbMaxX);
		float newMaxY = MathUtils.min(translatedMinY, aabbMaxY);
		
		aabb.set(newMinX, newMinY, newMaxX, newMaxY);
		
		return aabb;
	}
	
	public static <T extends IAabb2WF> T translateMinAssign(@ExtractionParam T aabb, float tX, float tY, float tZ)
	{
		float aabbMinX = aabb.minX();
		float aabbMinY = aabb.minY();
		float aabbMaxX = aabb.maxX();
		float aabbMaxY = aabb.maxY();
		
		float translatedMinX = aabbMinX + tX;
		float translatedMinY = aabbMinY + tY;
		
		float newMinX = MathUtils.min(translatedMinX, aabbMaxX);
		float newMinY = MathUtils.min(translatedMinY, aabbMaxY);
		float newMaxX = MathUtils.min(translatedMinX, aabbMaxX);
		float newMaxY = MathUtils.min(translatedMinY, aabbMaxY);
		
		aabb.set(newMinX, newMinY, newMaxX, newMaxY);
		
		return aabb;
	}
	
	public static float[] translateMax(IAabb2RF aabb, IVec2RF t, @ExtractionParam float[] res)
	{
		float aabbMinX = aabb.minX();
		float aabbMinY = aabb.minY();
		float aabbMaxX = aabb.maxX();
		float aabbMaxY = aabb.maxY();
		
		float tX = t.x();
		float tY = t.y();
		
		float translatedMaxX = aabbMaxX + tX;
		float translatedMaxY = aabbMaxY + tY;
		
		float newMinX = MathUtils.min(aabbMinX, translatedMaxX);
		float newMinY = MathUtils.min(aabbMinY, translatedMaxY);
		float newMaxX = MathUtils.min(aabbMinX, translatedMaxX);
		float newMaxY = MathUtils.min(aabbMinY, translatedMaxY);
		
		res[0] = newMinX;
		res[1] = newMinY;
		res[2] = newMaxX;
		res[3] = newMaxY;
		
		return res;
	}
	
	public static float[] translateMax(IAabb2RF aabb, float[] t, @ExtractionParam float[] res)
	{
		float aabbMinX = aabb.minX();
		float aabbMinY = aabb.minY();
		float aabbMaxX = aabb.maxX();
		float aabbMaxY = aabb.maxY();
		
		float tX = t[0];
		float tY = t[1];
		
		float translatedMaxX = aabbMaxX + tX;
		float translatedMaxY = aabbMaxY + tY;
		
		float newMinX = MathUtils.min(aabbMinX, translatedMaxX);
		float newMinY = MathUtils.min(aabbMinY, translatedMaxY);
		float newMaxX = MathUtils.min(aabbMinX, translatedMaxX);
		float newMaxY = MathUtils.min(aabbMinY, translatedMaxY);
		
		res[0] = newMinX;
		res[1] = newMinY;
		res[2] = newMaxX;
		res[3] = newMaxY;
		
		return res;
	}
	
	public static float[] translateMax(IAabb2RF aabb, float tX, float tY, @ExtractionParam float[] res)
	{
		float aabbMinX = aabb.minX();
		float aabbMinY = aabb.minY();
		float aabbMaxX = aabb.maxX();
		float aabbMaxY = aabb.maxY();
		
		float translatedMaxX = aabbMaxX + tX;
		float translatedMaxY = aabbMaxY + tY;
		
		float newMinX = MathUtils.min(aabbMinX, translatedMaxX);
		float newMinY = MathUtils.min(aabbMinY, translatedMaxY);
		float newMaxX = MathUtils.min(aabbMinX, translatedMaxX);
		float newMaxY = MathUtils.min(aabbMinY, translatedMaxY);
		
		res[0] = newMinX;
		res[1] = newMinY;
		res[2] = newMaxX;
		res[3] = newMaxY;
		
		return res;
	}
	
	public static float[] translateMax(float[] aabb, IVec2RF t, @ExtractionParam float[] res)
	{
		float aabbMinX = aabb[0];
		float aabbMinY = aabb[1];
		float aabbMaxX = aabb[2];
		float aabbMaxY = aabb[3];
		
		float tX = t.x();
		float tY = t.y();
		
		float translatedMaxX = aabbMaxX + tX;
		float translatedMaxY = aabbMaxY + tY;
		
		float newMinX = MathUtils.min(aabbMinX, translatedMaxX);
		float newMinY = MathUtils.min(aabbMinY, translatedMaxY);
		float newMaxX = MathUtils.min(aabbMinX, translatedMaxX);
		float newMaxY = MathUtils.min(aabbMinY, translatedMaxY);
		
		res[0] = newMinX;
		res[1] = newMinY;
		res[2] = newMaxX;
		res[3] = newMaxY;
		
		return res;
	}
	
	public static float[] translateMax(IVec2RF aabbMin, IVec2RF aabbMax, IVec2RF t, @ExtractionParam float[] res)
	{
		float aabbMinX = aabbMin.x();
		float aabbMinY = aabbMin.y();
		float aabbMaxX = aabbMax.x();
		float aabbMaxY = aabbMax.y();
		
		float tX = t.x();
		float tY = t.y();
		
		float translatedMaxX = aabbMaxX + tX;
		float translatedMaxY = aabbMaxY + tY;
		
		float newMinX = MathUtils.min(aabbMinX, translatedMaxX);
		float newMinY = MathUtils.min(aabbMinY, translatedMaxY);
		float newMaxX = MathUtils.min(aabbMinX, translatedMaxX);
		float newMaxY = MathUtils.min(aabbMinY, translatedMaxY);
		
		res[0] = newMinX;
		res[1] = newMinY;
		res[2] = newMaxX;
		res[3] = newMaxY;
		
		return res;
	}
	
	public static float[] translateMax(IVec2RF aabbMin, IVec2RF aabbMax, float[] t, @ExtractionParam float[] res)
	{
		float aabbMinX = aabbMin.x();
		float aabbMinY = aabbMin.y();
		float aabbMaxX = aabbMax.x();
		float aabbMaxY = aabbMax.y();
		
		float tX = t[0];
		float tY = t[1];
		
		float translatedMaxX = aabbMaxX + tX;
		float translatedMaxY = aabbMaxY + tY;
		
		float newMinX = MathUtils.min(aabbMinX, translatedMaxX);
		float newMinY = MathUtils.min(aabbMinY, translatedMaxY);
		float newMaxX = MathUtils.min(aabbMinX, translatedMaxX);
		float newMaxY = MathUtils.min(aabbMinY, translatedMaxY);
		
		res[0] = newMinX;
		res[1] = newMinY;
		res[2] = newMaxX;
		res[3] = newMaxY;
		
		return res;
	}
	
	public static float[] translateMax(IVec2RF aabbMin, IVec2RF aabbMax, float tX, float tY, @ExtractionParam float[] res)
	{
		float aabbMinX = aabbMin.x();
		float aabbMinY = aabbMin.y();
		float aabbMaxX = aabbMax.x();
		float aabbMaxY = aabbMax.y();
		
		float translatedMaxX = aabbMaxX + tX;
		float translatedMaxY = aabbMaxY + tY;
		
		float newMinX = MathUtils.min(aabbMinX, translatedMaxX);
		float newMinY = MathUtils.min(aabbMinY, translatedMaxY);
		float newMaxX = MathUtils.min(aabbMinX, translatedMaxX);
		float newMaxY = MathUtils.min(aabbMinY, translatedMaxY);
		
		res[0] = newMinX;
		res[1] = newMinY;
		res[2] = newMaxX;
		res[3] = newMaxY;
		
		return res;
	}
	
	public static float[] translateMax(IVec2RF aabbMin, float[] aabbMax, IVec2RF t, @ExtractionParam float[] res)
	{
		float aabbMinX = aabbMin.x();
		float aabbMinY = aabbMin.y();
		float aabbMaxX = aabbMax[0];
		float aabbMaxY = aabbMax[1];
		
		float tX = t.x();
		float tY = t.y();
		
		float translatedMaxX = aabbMaxX + tX;
		float translatedMaxY = aabbMaxY + tY;
		
		float newMinX = MathUtils.min(aabbMinX, translatedMaxX);
		float newMinY = MathUtils.min(aabbMinY, translatedMaxY);
		float newMaxX = MathUtils.min(aabbMinX, translatedMaxX);
		float newMaxY = MathUtils.min(aabbMinY, translatedMaxY);
		
		res[0] = newMinX;
		res[1] = newMinY;
		res[2] = newMaxX;
		res[3] = newMaxY;
		
		return res;
	}
	
	public static float[] translateMax(IVec2RF aabbMin, float[] aabbMax, float[] t, @ExtractionParam float[] res)
	{
		float aabbMinX = aabbMin.x();
		float aabbMinY = aabbMin.y();
		float aabbMaxX = aabbMax[0];
		float aabbMaxY = aabbMax[1];
		
		float tX = t[0];
		float tY = t[1];
		
		float translatedMaxX = aabbMaxX + tX;
		float translatedMaxY = aabbMaxY + tY;
		
		float newMinX = MathUtils.min(aabbMinX, translatedMaxX);
		float newMinY = MathUtils.min(aabbMinY, translatedMaxY);
		float newMaxX = MathUtils.min(aabbMinX, translatedMaxX);
		float newMaxY = MathUtils.min(aabbMinY, translatedMaxY);
		
		res[0] = newMinX;
		res[1] = newMinY;
		res[2] = newMaxX;
		res[3] = newMaxY;
		
		return res;
	}
	
	public static float[] translateMax(IVec2RF aabbMin, float[] aabbMax, float tX, float tY, @ExtractionParam float[] res)
	{
		float aabbMinX = aabbMin.x();
		float aabbMinY = aabbMin.y();
		float aabbMaxX = aabbMax[0];
		float aabbMaxY = aabbMax[1];
		
		float translatedMaxX = aabbMaxX + tX;
		float translatedMaxY = aabbMaxY + tY;
		
		float newMinX = MathUtils.min(aabbMinX, translatedMaxX);
		float newMinY = MathUtils.min(aabbMinY, translatedMaxY);
		float newMaxX = MathUtils.min(aabbMinX, translatedMaxX);
		float newMaxY = MathUtils.min(aabbMinY, translatedMaxY);
		
		res[0] = newMinX;
		res[1] = newMinY;
		res[2] = newMaxX;
		res[3] = newMaxY;
		
		return res;
	}
	
	public static float[] translateMax(IVec2RF aabbMin, float aabbMaxX, float aabbMaxY, IVec2RF t, @ExtractionParam float[] res)
	{
		float aabbMinX = aabbMin.x();
		float aabbMinY = aabbMin.y();
		
		float tX = t.x();
		float tY = t.y();
		
		float translatedMaxX = aabbMaxX + tX;
		float translatedMaxY = aabbMaxY + tY;
		
		float newMinX = MathUtils.min(aabbMinX, translatedMaxX);
		float newMinY = MathUtils.min(aabbMinY, translatedMaxY);
		float newMaxX = MathUtils.min(aabbMinX, translatedMaxX);
		float newMaxY = MathUtils.min(aabbMinY, translatedMaxY);
		
		res[0] = newMinX;
		res[1] = newMinY;
		res[2] = newMaxX;
		res[3] = newMaxY;
		
		return res;
	}
	
	public static float[] translateMax(IVec2RF aabbMin, float aabbMaxX, float aabbMaxY, float[] t, @ExtractionParam float[] res)
	{
		float aabbMinX = aabbMin.x();
		float aabbMinY = aabbMin.y();
		
		float tX = t[0];
		float tY = t[1];
		
		float translatedMaxX = aabbMaxX + tX;
		float translatedMaxY = aabbMaxY + tY;
		
		float newMinX = MathUtils.min(aabbMinX, translatedMaxX);
		float newMinY = MathUtils.min(aabbMinY, translatedMaxY);
		float newMaxX = MathUtils.min(aabbMinX, translatedMaxX);
		float newMaxY = MathUtils.min(aabbMinY, translatedMaxY);
		
		res[0] = newMinX;
		res[1] = newMinY;
		res[2] = newMaxX;
		res[3] = newMaxY;
		
		return res;
	}
	
	public static float[] translateMax(IVec2RF aabbMin, float aabbMaxX, float aabbMaxY, float tX, float tY, @ExtractionParam float[] res)
	{
		float aabbMinX = aabbMin.x();
		float aabbMinY = aabbMin.y();
		
		float translatedMaxX = aabbMaxX + tX;
		float translatedMaxY = aabbMaxY + tY;
		
		float newMinX = MathUtils.min(aabbMinX, translatedMaxX);
		float newMinY = MathUtils.min(aabbMinY, translatedMaxY);
		float newMaxX = MathUtils.min(aabbMinX, translatedMaxX);
		float newMaxY = MathUtils.min(aabbMinY, translatedMaxY);
		
		res[0] = newMinX;
		res[1] = newMinY;
		res[2] = newMaxX;
		res[3] = newMaxY;
		
		return res;
	}
	
	public static float[] translateMax(float[] aabbMin, IVec2RF aabbMax, IVec2RF t, @ExtractionParam float[] res)
	{
		float aabbMinX = aabbMin[0];
		float aabbMinY = aabbMin[1];
		float aabbMaxX = aabbMax.x();
		float aabbMaxY = aabbMax.y();
		
		float tX = t.x();
		float tY = t.y();
		
		float translatedMaxX = aabbMaxX + tX;
		float translatedMaxY = aabbMaxY + tY;
		
		float newMinX = MathUtils.min(aabbMinX, translatedMaxX);
		float newMinY = MathUtils.min(aabbMinY, translatedMaxY);
		float newMaxX = MathUtils.min(aabbMinX, translatedMaxX);
		float newMaxY = MathUtils.min(aabbMinY, translatedMaxY);
		
		res[0] = newMinX;
		res[1] = newMinY;
		res[2] = newMaxX;
		res[3] = newMaxY;
		
		return res;
	}
	
	public static float[] translateMax(float[] aabbMin, IVec2RF aabbMax, float[] t, @ExtractionParam float[] res)
	{
		float aabbMinX = aabbMin[0];
		float aabbMinY = aabbMin[1];
		float aabbMaxX = aabbMax.x();
		float aabbMaxY = aabbMax.y();
		
		float tX = t[0];
		float tY = t[1];
		
		float translatedMaxX = aabbMaxX + tX;
		float translatedMaxY = aabbMaxY + tY;
		
		float newMinX = MathUtils.min(aabbMinX, translatedMaxX);
		float newMinY = MathUtils.min(aabbMinY, translatedMaxY);
		float newMaxX = MathUtils.min(aabbMinX, translatedMaxX);
		float newMaxY = MathUtils.min(aabbMinY, translatedMaxY);
		
		res[0] = newMinX;
		res[1] = newMinY;
		res[2] = newMaxX;
		res[3] = newMaxY;
		
		return res;
	}
	
	public static float[] translateMax(float[] aabbMin, IVec2RF aabbMax, float tX, float tY, @ExtractionParam float[] res)
	{
		float aabbMinX = aabbMin[0];
		float aabbMinY = aabbMin[1];
		float aabbMaxX = aabbMax.x();
		float aabbMaxY = aabbMax.y();
		
		float translatedMaxX = aabbMaxX + tX;
		float translatedMaxY = aabbMaxY + tY;
		
		float newMinX = MathUtils.min(aabbMinX, translatedMaxX);
		float newMinY = MathUtils.min(aabbMinY, translatedMaxY);
		float newMaxX = MathUtils.min(aabbMinX, translatedMaxX);
		float newMaxY = MathUtils.min(aabbMinY, translatedMaxY);
		
		res[0] = newMinX;
		res[1] = newMinY;
		res[2] = newMaxX;
		res[3] = newMaxY;
		
		return res;
	}
	
	public static float[] translateMax(float[] aabbMin, float[] aabbMax, IVec2RF t, @ExtractionParam float[] res)
	{
		float aabbMinX = aabbMin[0];
		float aabbMinY = aabbMin[1];
		float aabbMaxX = aabbMax[0];
		float aabbMaxY = aabbMax[1];
		
		float tX = t.x();
		float tY = t.y();
		
		float translatedMaxX = aabbMaxX + tX;
		float translatedMaxY = aabbMaxY + tY;
		
		float newMinX = MathUtils.min(aabbMinX, translatedMaxX);
		float newMinY = MathUtils.min(aabbMinY, translatedMaxY);
		float newMaxX = MathUtils.min(aabbMinX, translatedMaxX);
		float newMaxY = MathUtils.min(aabbMinY, translatedMaxY);
		
		res[0] = newMinX;
		res[1] = newMinY;
		res[2] = newMaxX;
		res[3] = newMaxY;
		
		return res;
	}
	
	public static float[] translateMax(float[] aabbMin, float aabbMaxX, float aabbMaxY, IVec2RF t, @ExtractionParam float[] res)
	{
		float aabbMinX = aabbMin[0];
		float aabbMinY = aabbMin[1];
		
		float tX = t.x();
		float tY = t.y();
		
		float translatedMaxX = aabbMaxX + tX;
		float translatedMaxY = aabbMaxY + tY;
		
		float newMinX = MathUtils.min(aabbMinX, translatedMaxX);
		float newMinY = MathUtils.min(aabbMinY, translatedMaxY);
		float newMaxX = MathUtils.min(aabbMinX, translatedMaxX);
		float newMaxY = MathUtils.min(aabbMinY, translatedMaxY);
		
		res[0] = newMinX;
		res[1] = newMinY;
		res[2] = newMaxX;
		res[3] = newMaxY;
		
		return res;
	}
	
	public static float[] translateMax(float aabbMinX, float aabbMinY, IVec2RF aabbMax, IVec2RF t, @ExtractionParam float[] res)
	{
		float aabbMaxX = aabbMax.x();
		float aabbMaxY = aabbMax.y();
		
		float tX = t.x();
		float tY = t.y();
		
		float translatedMaxX = aabbMaxX + tX;
		float translatedMaxY = aabbMaxY + tY;
		
		float newMinX = MathUtils.min(aabbMinX, translatedMaxX);
		float newMinY = MathUtils.min(aabbMinY, translatedMaxY);
		float newMaxX = MathUtils.min(aabbMinX, translatedMaxX);
		float newMaxY = MathUtils.min(aabbMinY, translatedMaxY);
		
		res[0] = newMinX;
		res[1] = newMinY;
		res[2] = newMaxX;
		res[3] = newMaxY;
		
		return res;
	}
	
	public static float[] translateMax(float aabbMinX, float aabbMinY, IVec2RF aabbMax, float[] t, @ExtractionParam float[] res)
	{
		float aabbMaxX = aabbMax.x();
		float aabbMaxY = aabbMax.y();
		
		float tX = t[0];
		float tY = t[1];
		
		float translatedMaxX = aabbMaxX + tX;
		float translatedMaxY = aabbMaxY + tY;
		
		float newMinX = MathUtils.min(aabbMinX, translatedMaxX);
		float newMinY = MathUtils.min(aabbMinY, translatedMaxY);
		float newMaxX = MathUtils.min(aabbMinX, translatedMaxX);
		float newMaxY = MathUtils.min(aabbMinY, translatedMaxY);
		
		res[0] = newMinX;
		res[1] = newMinY;
		res[2] = newMaxX;
		res[3] = newMaxY;
		
		return res;
	}
	
	public static float[] translateMax(float aabbMinX, float aabbMinY, IVec2RF aabbMax, float tX, float tY, @ExtractionParam float[] res)
	{
		float aabbMaxX = aabbMax.x();
		float aabbMaxY = aabbMax.y();
		
		float translatedMaxX = aabbMaxX + tX;
		float translatedMaxY = aabbMaxY + tY;
		
		float newMinX = MathUtils.min(aabbMinX, translatedMaxX);
		float newMinY = MathUtils.min(aabbMinY, translatedMaxY);
		float newMaxX = MathUtils.min(aabbMinX, translatedMaxX);
		float newMaxY = MathUtils.min(aabbMinY, translatedMaxY);
		
		res[0] = newMinX;
		res[1] = newMinY;
		res[2] = newMaxX;
		res[3] = newMaxY;
		
		return res;
	}
	
	public static float[] translateMax(float aabbMinX, float aabbMinY, float[] aabbMax, IVec2RF t, @ExtractionParam float[] res)
	{
		float aabbMaxX = aabbMax[0];
		float aabbMaxY = aabbMax[1];
		
		float tX = t.x();
		float tY = t.y();
		
		float translatedMaxX = aabbMaxX + tX;
		float translatedMaxY = aabbMaxY + tY;
		
		float newMinX = MathUtils.min(aabbMinX, translatedMaxX);
		float newMinY = MathUtils.min(aabbMinY, translatedMaxY);
		float newMaxX = MathUtils.min(aabbMinX, translatedMaxX);
		float newMaxY = MathUtils.min(aabbMinY, translatedMaxY);
		
		res[0] = newMinX;
		res[1] = newMinY;
		res[2] = newMaxX;
		res[3] = newMaxY;
		
		return res;
	}
	
	public static float[] translateMax(float aabbMinX, float aabbMinY, float aabbMaxX, float aabbMaxY, IVec2RF t, @ExtractionParam float[] res)
	{
		float tX = t.x();
		float tY = t.y();
		
		float translatedMaxX = aabbMaxX + tX;
		float translatedMaxY = aabbMaxY + tY;
		
		float newMinX = MathUtils.min(aabbMinX, translatedMaxX);
		float newMinY = MathUtils.min(aabbMinY, translatedMaxY);
		float newMaxX = MathUtils.min(aabbMinX, translatedMaxX);
		float newMaxY = MathUtils.min(aabbMinY, translatedMaxY);
		
		res[0] = newMinX;
		res[1] = newMinY;
		res[2] = newMaxX;
		res[3] = newMaxY;
		
		return res;
	}
	
	public static float[] translateMaxAssign(@ExtractionParam float[] aabb, IVec2RF t)
	{
		float aabbMinX = aabb[0];
		float aabbMinY = aabb[1];
		float aabbMaxX = aabb[2];
		float aabbMaxY = aabb[3];
		
		float tX = t.x();
		float tY = t.y();
		
		float translatedMaxX = aabbMaxX + tX;
		float translatedMaxY = aabbMaxY + tY;
		
		float newMinX = MathUtils.min(aabbMinX, translatedMaxX);
		float newMinY = MathUtils.min(aabbMinY, translatedMaxY);
		float newMaxX = MathUtils.min(aabbMinX, translatedMaxX);
		float newMaxY = MathUtils.min(aabbMinY, translatedMaxY);
		
		aabb[0] = newMinX;
		aabb[1] = newMinY;
		aabb[2] = newMaxX;
		aabb[3] = newMaxY;
		
		return aabb;
	}
	
	public static <T extends IAabb2WF> T translateMax(IAabb2RF aabb, IVec2RF t, @ExtractionParam T res)
	{
		float aabbMinX = aabb.minX();
		float aabbMinY = aabb.minY();
		float aabbMaxX = aabb.maxX();
		float aabbMaxY = aabb.maxY();
		
		float tX = t.x();
		float tY = t.y();
		
		float translatedMaxX = aabbMaxX + tX;
		float translatedMaxY = aabbMaxY + tY;
		
		float newMinX = MathUtils.min(aabbMinX, translatedMaxX);
		float newMinY = MathUtils.min(aabbMinY, translatedMaxY);
		float newMaxX = MathUtils.min(aabbMinX, translatedMaxX);
		float newMaxY = MathUtils.min(aabbMinY, translatedMaxY);
		
		res.set(newMinX, newMinY, newMaxX, newMaxY);
		
		return res;
	}
	
	public static <T extends IAabb2WF> T translateMax(IAabb2RF aabb, float[] t, @ExtractionParam T res)
	{
		float aabbMinX = aabb.minX();
		float aabbMinY = aabb.minY();
		float aabbMaxX = aabb.maxX();
		float aabbMaxY = aabb.maxY();
		
		float tX = t[0];
		float tY = t[1];
		
		float translatedMaxX = aabbMaxX + tX;
		float translatedMaxY = aabbMaxY + tY;
		
		float newMinX = MathUtils.min(aabbMinX, translatedMaxX);
		float newMinY = MathUtils.min(aabbMinY, translatedMaxY);
		float newMaxX = MathUtils.min(aabbMinX, translatedMaxX);
		float newMaxY = MathUtils.min(aabbMinY, translatedMaxY);
		
		res.set(newMinX, newMinY, newMaxX, newMaxY);
		
		return res;
	}
	
	public static <T extends IAabb2WF> T translateMax(IAabb2RF aabb, float tX, float tY, @ExtractionParam T res)
	{
		float aabbMinX = aabb.minX();
		float aabbMinY = aabb.minY();
		float aabbMaxX = aabb.maxX();
		float aabbMaxY = aabb.maxY();
		
		float translatedMaxX = aabbMaxX + tX;
		float translatedMaxY = aabbMaxY + tY;
		
		float newMinX = MathUtils.min(aabbMinX, translatedMaxX);
		float newMinY = MathUtils.min(aabbMinY, translatedMaxY);
		float newMaxX = MathUtils.min(aabbMinX, translatedMaxX);
		float newMaxY = MathUtils.min(aabbMinY, translatedMaxY);
		
		res.set(newMinX, newMinY, newMaxX, newMaxY);
		
		return res;
	}
	
	public static <T extends IAabb2WF> T translateMax(float[] aabb, IVec2RF t, @ExtractionParam T res)
	{
		float aabbMinX = aabb[0];
		float aabbMinY = aabb[1];
		float aabbMaxX = aabb[3];
		float aabbMaxY = aabb[4];
		
		float tX = t.x();
		float tY = t.y();
		
		float translatedMaxX = aabbMaxX + tX;
		float translatedMaxY = aabbMaxY + tY;
		
		float newMinX = MathUtils.min(aabbMinX, translatedMaxX);
		float newMinY = MathUtils.min(aabbMinY, translatedMaxY);
		float newMaxX = MathUtils.min(aabbMinX, translatedMaxX);
		float newMaxY = MathUtils.min(aabbMinY, translatedMaxY);
		
		res.set(newMinX, newMinY, newMaxX, newMaxY);
		
		return res;
	}
	
	public static <T extends IAabb2WF> T translateMax(float[] aabb, float[] t, @ExtractionParam T res)
	{
		float aabbMinX = aabb[0];
		float aabbMinY = aabb[1];
		float aabbMaxX = aabb[3];
		float aabbMaxY = aabb[4];
		
		float tX = t[0];
		float tY = t[1];
		
		float translatedMaxX = aabbMaxX + tX;
		float translatedMaxY = aabbMaxY + tY;
		
		float newMinX = MathUtils.min(aabbMinX, translatedMaxX);
		float newMinY = MathUtils.min(aabbMinY, translatedMaxY);
		float newMaxX = MathUtils.min(aabbMinX, translatedMaxX);
		float newMaxY = MathUtils.min(aabbMinY, translatedMaxY);
		
		res.set(newMinX, newMinY, newMaxX, newMaxY);
		
		return res;
	}
	
	public static <T extends IAabb2WF> T translateMax(float[] aabb, float tX, float tY, @ExtractionParam T res)
	{
		float aabbMinX = aabb[0];
		float aabbMinY = aabb[1];
		float aabbMaxX = aabb[3];
		float aabbMaxY = aabb[4];
		
		float translatedMaxX = aabbMaxX + tX;
		float translatedMaxY = aabbMaxY + tY;
		
		float newMinX = MathUtils.min(aabbMinX, translatedMaxX);
		float newMinY = MathUtils.min(aabbMinY, translatedMaxY);
		float newMaxX = MathUtils.min(aabbMinX, translatedMaxX);
		float newMaxY = MathUtils.min(aabbMinY, translatedMaxY);
		
		res.set(newMinX, newMinY, newMaxX, newMaxY);
		
		return res;
	}
	
	public static <T extends IAabb2WF> T translateMax(IVec2RF aabbMin, IVec2RF aabbMax, IVec2RF t, @ExtractionParam T res)
	{
		float aabbMinX = aabbMin.x();
		float aabbMinY = aabbMin.y();
		float aabbMaxX = aabbMax.x();
		float aabbMaxY = aabbMax.y();
		
		float tX = t.x();
		float tY = t.y();
		
		float translatedMaxX = aabbMaxX + tX;
		float translatedMaxY = aabbMaxY + tY;
		
		float newMinX = MathUtils.min(aabbMinX, translatedMaxX);
		float newMinY = MathUtils.min(aabbMinY, translatedMaxY);
		float newMaxX = MathUtils.min(aabbMinX, translatedMaxX);
		float newMaxY = MathUtils.min(aabbMinY, translatedMaxY);
		
		res.set(newMinX, newMinY, newMaxX, newMaxY);
		
		return res;
	}
	
	public static <T extends IAabb2WF> T translateMax(IVec2RF aabbMin, IVec2RF aabbMax, float[] t, @ExtractionParam T res)
	{
		float aabbMinX = aabbMin.x();
		float aabbMinY = aabbMin.y();
		float aabbMaxX = aabbMax.x();
		float aabbMaxY = aabbMax.y();
		
		float tX = t[0];
		float tY = t[1];
		
		float translatedMaxX = aabbMaxX + tX;
		float translatedMaxY = aabbMaxY + tY;
		
		float newMinX = MathUtils.min(aabbMinX, translatedMaxX);
		float newMinY = MathUtils.min(aabbMinY, translatedMaxY);
		float newMaxX = MathUtils.min(aabbMinX, translatedMaxX);
		float newMaxY = MathUtils.min(aabbMinY, translatedMaxY);
		
		res.set(newMinX, newMinY, newMaxX, newMaxY);
		
		return res;
	}
	
	public static <T extends IAabb2WF> T translateMax(IVec2RF aabbMin, IVec2RF aabbMax, float tX, float tY, @ExtractionParam T res)
	{
		float aabbMinX = aabbMin.x();
		float aabbMinY = aabbMin.y();
		float aabbMaxX = aabbMax.x();
		float aabbMaxY = aabbMax.y();
		
		float translatedMaxX = aabbMaxX + tX;
		float translatedMaxY = aabbMaxY + tY;
		
		float newMinX = MathUtils.min(aabbMinX, translatedMaxX);
		float newMinY = MathUtils.min(aabbMinY, translatedMaxY);
		float newMaxX = MathUtils.min(aabbMinX, translatedMaxX);
		float newMaxY = MathUtils.min(aabbMinY, translatedMaxY);
		
		res.set(newMinX, newMinY, newMaxX, newMaxY);
		
		return res;
	}
	
	public static <T extends IAabb2WF> T translateMax(IVec2RF aabbMin, float[] aabbMax, IVec2RF t, @ExtractionParam T res)
	{
		float aabbMinX = aabbMin.x();
		float aabbMinY = aabbMin.y();
		float aabbMaxX = aabbMax[0];
		float aabbMaxY = aabbMax[1];
		
		float tX = t.x();
		float tY = t.y();
		
		float translatedMaxX = aabbMaxX + tX;
		float translatedMaxY = aabbMaxY + tY;
		
		float newMinX = MathUtils.min(aabbMinX, translatedMaxX);
		float newMinY = MathUtils.min(aabbMinY, translatedMaxY);
		float newMaxX = MathUtils.min(aabbMinX, translatedMaxX);
		float newMaxY = MathUtils.min(aabbMinY, translatedMaxY);
		
		res.set(newMinX, newMinY, newMaxX, newMaxY);
		
		return res;
	}
	
	public static <T extends IAabb2WF> T translateMax(IVec2RF aabbMin, float[] aabbMax, float[] t, @ExtractionParam T res)
	{
		float aabbMinX = aabbMin.x();
		float aabbMinY = aabbMin.y();
		float aabbMaxX = aabbMax[0];
		float aabbMaxY = aabbMax[1];
		
		float tX = t[0];
		float tY = t[1];
		
		float translatedMaxX = aabbMaxX + tX;
		float translatedMaxY = aabbMaxY + tY;
		
		float newMinX = MathUtils.min(aabbMinX, translatedMaxX);
		float newMinY = MathUtils.min(aabbMinY, translatedMaxY);
		float newMaxX = MathUtils.min(aabbMinX, translatedMaxX);
		float newMaxY = MathUtils.min(aabbMinY, translatedMaxY);
		
		res.set(newMinX, newMinY, newMaxX, newMaxY);
		
		return res;
	}
	
	public static <T extends IAabb2WF> T translateMax(IVec2RF aabbMin, float[] aabbMax, float tX, float tY, @ExtractionParam T res)
	{
		float aabbMinX = aabbMin.x();
		float aabbMinY = aabbMin.y();
		float aabbMaxX = aabbMax[0];
		float aabbMaxY = aabbMax[1];
		
		float translatedMaxX = aabbMaxX + tX;
		float translatedMaxY = aabbMaxY + tY;
		
		float newMinX = MathUtils.min(aabbMinX, translatedMaxX);
		float newMinY = MathUtils.min(aabbMinY, translatedMaxY);
		float newMaxX = MathUtils.min(aabbMinX, translatedMaxX);
		float newMaxY = MathUtils.min(aabbMinY, translatedMaxY);
		
		res.set(newMinX, newMinY, newMaxX, newMaxY);
		
		return res;
	}
	
	public static <T extends IAabb2WF> T translateMax(IVec2RF aabbMin, float aabbMaxX, float aabbMaxY, IVec2RF t, @ExtractionParam T res)
	{
		float aabbMinX = aabbMin.x();
		float aabbMinY = aabbMin.y();
		
		float tX = t.x();
		float tY = t.y();
		
		float translatedMaxX = aabbMaxX + tX;
		float translatedMaxY = aabbMaxY + tY;
		
		float newMinX = MathUtils.min(aabbMinX, translatedMaxX);
		float newMinY = MathUtils.min(aabbMinY, translatedMaxY);
		float newMaxX = MathUtils.min(aabbMinX, translatedMaxX);
		float newMaxY = MathUtils.min(aabbMinY, translatedMaxY);
		
		res.set(newMinX, newMinY, newMaxX, newMaxY);
		
		return res;
	}
	
	public static <T extends IAabb2WF> T translateMax(IVec2RF aabbMin, float aabbMaxX, float aabbMaxY, float[] t, @ExtractionParam T res)
	{
		float aabbMinX = aabbMin.x();
		float aabbMinY = aabbMin.y();
		
		float tX = t[0];
		float tY = t[1];
		
		float translatedMaxX = aabbMaxX + tX;
		float translatedMaxY = aabbMaxY + tY;
		
		float newMinX = MathUtils.min(aabbMinX, translatedMaxX);
		float newMinY = MathUtils.min(aabbMinY, translatedMaxY);
		float newMaxX = MathUtils.min(aabbMinX, translatedMaxX);
		float newMaxY = MathUtils.min(aabbMinY, translatedMaxY);
		
		res.set(newMinX, newMinY, newMaxX, newMaxY);
		
		return res;
	}
	
	public static <T extends IAabb2WF> T translateMax(IVec2RF aabbMin, float aabbMaxX, float aabbMaxY, float tX, float tY, @ExtractionParam T res)
	{
		float aabbMinX = aabbMin.x();
		float aabbMinY = aabbMin.y();
		
		float translatedMaxX = aabbMaxX + tX;
		float translatedMaxY = aabbMaxY + tY;
		
		float newMinX = MathUtils.min(aabbMinX, translatedMaxX);
		float newMinY = MathUtils.min(aabbMinY, translatedMaxY);
		float newMaxX = MathUtils.min(aabbMinX, translatedMaxX);
		float newMaxY = MathUtils.min(aabbMinY, translatedMaxY);
		
		res.set(newMinX, newMinY, newMaxX, newMaxY);
		
		return res;
	}
	
	public static <T extends IAabb2WF> T translateMax(float[] aabbMin, IVec2RF aabbMax, IVec2RF t, @ExtractionParam T res)
	{
		float aabbMinX = aabbMin[0];
		float aabbMinY = aabbMin[1];
		float aabbMaxX = aabbMax.x();
		float aabbMaxY = aabbMax.y();
		
		float tX = t.x();
		float tY = t.y();
		
		float translatedMaxX = aabbMaxX + tX;
		float translatedMaxY = aabbMaxY + tY;
		
		float newMinX = MathUtils.min(aabbMinX, translatedMaxX);
		float newMinY = MathUtils.min(aabbMinY, translatedMaxY);
		float newMaxX = MathUtils.min(aabbMinX, translatedMaxX);
		float newMaxY = MathUtils.min(aabbMinY, translatedMaxY);
		
		res.set(newMinX, newMinY, newMaxX, newMaxY);
		
		return res;
	}
	
	public static <T extends IAabb2WF> T translateMax(float[] aabbMin, IVec2RF aabbMax, float[] t, @ExtractionParam T res)
	{
		float aabbMinX = aabbMin[0];
		float aabbMinY = aabbMin[1];
		float aabbMaxX = aabbMax.x();
		float aabbMaxY = aabbMax.y();
		
		float tX = t[0];
		float tY = t[1];
		
		float translatedMaxX = aabbMaxX + tX;
		float translatedMaxY = aabbMaxY + tY;
		
		float newMinX = MathUtils.min(aabbMinX, translatedMaxX);
		float newMinY = MathUtils.min(aabbMinY, translatedMaxY);
		float newMaxX = MathUtils.min(aabbMinX, translatedMaxX);
		float newMaxY = MathUtils.min(aabbMinY, translatedMaxY);
		
		res.set(newMinX, newMinY, newMaxX, newMaxY);
		
		return res;
	}
	
	public static <T extends IAabb2WF> T translateMax(float[] aabbMin, IVec2RF aabbMax, float tX, float tY, @ExtractionParam T res)
	{
		float aabbMinX = aabbMin[0];
		float aabbMinY = aabbMin[1];
		float aabbMaxX = aabbMax.x();
		float aabbMaxY = aabbMax.y();
		
		float translatedMaxX = aabbMaxX + tX;
		float translatedMaxY = aabbMaxY + tY;
		
		float newMinX = MathUtils.min(aabbMinX, translatedMaxX);
		float newMinY = MathUtils.min(aabbMinY, translatedMaxY);
		float newMaxX = MathUtils.min(aabbMinX, translatedMaxX);
		float newMaxY = MathUtils.min(aabbMinY, translatedMaxY);
		
		res.set(newMinX, newMinY, newMaxX, newMaxY);
		
		return res;
	}
	
	public static <T extends IAabb2WF> T translateMax(float[] aabbMin, float[] aabbMax, IVec2RF t, @ExtractionParam T res)
	{
		float aabbMinX = aabbMin[0];
		float aabbMinY = aabbMin[1];
		float aabbMaxX = aabbMax[0];
		float aabbMaxY = aabbMax[1];
		
		float tX = t.x();
		float tY = t.y();
		
		float translatedMaxX = aabbMaxX + tX;
		float translatedMaxY = aabbMaxY + tY;
		
		float newMinX = MathUtils.min(aabbMinX, translatedMaxX);
		float newMinY = MathUtils.min(aabbMinY, translatedMaxY);
		float newMaxX = MathUtils.min(aabbMinX, translatedMaxX);
		float newMaxY = MathUtils.min(aabbMinY, translatedMaxY);
		
		res.set(newMinX, newMinY, newMaxX, newMaxY);
		
		return res;
	}
	
	public static <T extends IAabb2WF> T translateMax(float[] aabbMin, float[] aabbMax, float[] t, @ExtractionParam T res)
	{
		float aabbMinX = aabbMin[0];
		float aabbMinY = aabbMin[1];
		float aabbMaxX = aabbMax[0];
		float aabbMaxY = aabbMax[1];
		
		float tX = t[0];
		float tY = t[1];
		
		float translatedMaxX = aabbMaxX + tX;
		float translatedMaxY = aabbMaxY + tY;
		
		float newMinX = MathUtils.min(aabbMinX, translatedMaxX);
		float newMinY = MathUtils.min(aabbMinY, translatedMaxY);
		float newMaxX = MathUtils.min(aabbMinX, translatedMaxX);
		float newMaxY = MathUtils.min(aabbMinY, translatedMaxY);
		
		res.set(newMinX, newMinY, newMaxX, newMaxY);
		
		return res;
	}
	
	public static <T extends IAabb2WF> T translateMax(float[] aabbMin, float[] aabbMax, float tX, float tY, @ExtractionParam T res)
	{
		float aabbMinX = aabbMin[0];
		float aabbMinY = aabbMin[1];
		float aabbMaxX = aabbMax[0];
		float aabbMaxY = aabbMax[1];
		
		float translatedMaxX = aabbMaxX + tX;
		float translatedMaxY = aabbMaxY + tY;
		
		float newMinX = MathUtils.min(aabbMinX, translatedMaxX);
		float newMinY = MathUtils.min(aabbMinY, translatedMaxY);
		float newMaxX = MathUtils.min(aabbMinX, translatedMaxX);
		float newMaxY = MathUtils.min(aabbMinY, translatedMaxY);
		
		res.set(newMinX, newMinY, newMaxX, newMaxY);
		
		return res;
	}
	
	public static <T extends IAabb2WF> T translateMax(float[] aabbMin, float aabbMaxX, float aabbMaxY, IVec2RF t, @ExtractionParam T res)
	{
		float aabbMinX = aabbMin[0];
		float aabbMinY = aabbMin[1];
		
		float tX = t.x();
		float tY = t.y();
		
		float translatedMaxX = aabbMaxX + tX;
		float translatedMaxY = aabbMaxY + tY;
		
		float newMinX = MathUtils.min(aabbMinX, translatedMaxX);
		float newMinY = MathUtils.min(aabbMinY, translatedMaxY);
		float newMaxX = MathUtils.min(aabbMinX, translatedMaxX);
		float newMaxY = MathUtils.min(aabbMinY, translatedMaxY);
		
		res.set(newMinX, newMinY, newMaxX, newMaxY);
		
		return res;
	}
	
	public static <T extends IAabb2WF> T translateMax(float[] aabbMin, float aabbMaxX, float aabbMaxY, float[] t, @ExtractionParam T res)
	{
		float aabbMinX = aabbMin[0];
		float aabbMinY = aabbMin[1];
		
		float tX = t[0];
		float tY = t[1];
		
		float translatedMaxX = aabbMaxX + tX;
		float translatedMaxY = aabbMaxY + tY;
		
		float newMinX = MathUtils.min(aabbMinX, translatedMaxX);
		float newMinY = MathUtils.min(aabbMinY, translatedMaxY);
		float newMaxX = MathUtils.min(aabbMinX, translatedMaxX);
		float newMaxY = MathUtils.min(aabbMinY, translatedMaxY);
		
		res.set(newMinX, newMinY, newMaxX, newMaxY);
		
		return res;
	}
	
	public static <T extends IAabb2WF> T translateMax(float[] aabbMin, float aabbMaxX, float aabbMaxY, float tX, float tY, @ExtractionParam T res)
	{
		float aabbMinX = aabbMin[0];
		float aabbMinY = aabbMin[1];
		
		float translatedMaxX = aabbMaxX + tX;
		float translatedMaxY = aabbMaxY + tY;
		
		float newMinX = MathUtils.min(aabbMinX, translatedMaxX);
		float newMinY = MathUtils.min(aabbMinY, translatedMaxY);
		float newMaxX = MathUtils.min(aabbMinX, translatedMaxX);
		float newMaxY = MathUtils.min(aabbMinY, translatedMaxY);
		
		res.set(newMinX, newMinY, newMaxX, newMaxY);
		
		return res;
	}
	
	public static <T extends IAabb2WF> T translateMax(float aabbMinX, float aabbMinY, IVec2RF aabbMax, IVec2RF t, @ExtractionParam T res)
	{
		float aabbMaxX = aabbMax.x();
		float aabbMaxY = aabbMax.y();
		
		float tX = t.x();
		float tY = t.y();
		
		float translatedMaxX = aabbMaxX + tX;
		float translatedMaxY = aabbMaxY + tY;
		
		float newMinX = MathUtils.min(aabbMinX, translatedMaxX);
		float newMinY = MathUtils.min(aabbMinY, translatedMaxY);
		float newMaxX = MathUtils.min(aabbMinX, translatedMaxX);
		float newMaxY = MathUtils.min(aabbMinY, translatedMaxY);
		
		res.set(newMinX, newMinY, newMaxX, newMaxY);
		
		return res;
	}
	
	public static <T extends IAabb2WF> T translateMax(float aabbMinX, float aabbMinY, IVec2RF aabbMax, float[] t, @ExtractionParam T res)
	{
		float aabbMaxX = aabbMax.x();
		float aabbMaxY = aabbMax.y();
		
		float tX = t[0];
		float tY = t[1];
		
		float translatedMaxX = aabbMaxX + tX;
		float translatedMaxY = aabbMaxY + tY;
		
		float newMinX = MathUtils.min(aabbMinX, translatedMaxX);
		float newMinY = MathUtils.min(aabbMinY, translatedMaxY);
		float newMaxX = MathUtils.min(aabbMinX, translatedMaxX);
		float newMaxY = MathUtils.min(aabbMinY, translatedMaxY);
		
		res.set(newMinX, newMinY, newMaxX, newMaxY);
		
		return res;
	}
	
	public static <T extends IAabb2WF> T translateMax(float aabbMinX, float aabbMinY, IVec2RF aabbMax, float tX, float tY, @ExtractionParam T res)
	{
		float aabbMaxX = aabbMax.x();
		float aabbMaxY = aabbMax.y();
		
		float translatedMaxX = aabbMaxX + tX;
		float translatedMaxY = aabbMaxY + tY;
		
		float newMinX = MathUtils.min(aabbMinX, translatedMaxX);
		float newMinY = MathUtils.min(aabbMinY, translatedMaxY);
		float newMaxX = MathUtils.min(aabbMinX, translatedMaxX);
		float newMaxY = MathUtils.min(aabbMinY, translatedMaxY);
		
		res.set(newMinX, newMinY, newMaxX, newMaxY);
		
		return res;
	}
	
	public static <T extends IAabb2WF> T translateMax(float aabbMinX, float aabbMinY, float[] aabbMax, IVec2RF t, @ExtractionParam T res)
	{
		float aabbMaxX = aabbMax[0];
		float aabbMaxY = aabbMax[1];
		
		float tX = t.x();
		float tY = t.y();
		
		float translatedMaxX = aabbMaxX + tX;
		float translatedMaxY = aabbMaxY + tY;
		
		float newMinX = MathUtils.min(aabbMinX, translatedMaxX);
		float newMinY = MathUtils.min(aabbMinY, translatedMaxY);
		float newMaxX = MathUtils.min(aabbMinX, translatedMaxX);
		float newMaxY = MathUtils.min(aabbMinY, translatedMaxY);
		
		res.set(newMinX, newMinY, newMaxX, newMaxY);
		
		return res;
	}
	
	public static <T extends IAabb2WF> T translateMax(float aabbMinX, float aabbMinY, float[] aabbMax, float[] t, @ExtractionParam T res)
	{
		float aabbMaxX = aabbMax[0];
		float aabbMaxY = aabbMax[1];
		
		float tX = t[0];
		float tY = t[1];
		
		float translatedMaxX = aabbMaxX + tX;
		float translatedMaxY = aabbMaxY + tY;
		
		float newMinX = MathUtils.min(aabbMinX, translatedMaxX);
		float newMinY = MathUtils.min(aabbMinY, translatedMaxY);
		float newMaxX = MathUtils.min(aabbMinX, translatedMaxX);
		float newMaxY = MathUtils.min(aabbMinY, translatedMaxY);
		
		res.set(newMinX, newMinY, newMaxX, newMaxY);
		
		return res;
	}
	
	public static <T extends IAabb2WF> T translateMax(float aabbMinX, float aabbMinY, float[] aabbMax, float tX, float tY, @ExtractionParam T res)
	{
		float aabbMaxX = aabbMax[0];
		float aabbMaxY = aabbMax[1];
		
		float translatedMaxX = aabbMaxX + tX;
		float translatedMaxY = aabbMaxY + tY;
		
		float newMinX = MathUtils.min(aabbMinX, translatedMaxX);
		float newMinY = MathUtils.min(aabbMinY, translatedMaxY);
		float newMaxX = MathUtils.min(aabbMinX, translatedMaxX);
		float newMaxY = MathUtils.min(aabbMinY, translatedMaxY);
		
		res.set(newMinX, newMinY, newMaxX, newMaxY);
		
		return res;
	}
	
	public static <T extends IAabb2WF> T translateMax(float aabbMinX, float aabbMinY, float aabbMaxX, float aabbMaxY, IVec2RF t, @ExtractionParam T res)
	{
		float tX = t.x();
		float tY = t.y();
		
		float translatedMaxX = aabbMaxX + tX;
		float translatedMaxY = aabbMaxY + tY;
		
		float newMinX = MathUtils.min(aabbMinX, translatedMaxX);
		float newMinY = MathUtils.min(aabbMinY, translatedMaxY);
		float newMaxX = MathUtils.min(aabbMinX, translatedMaxX);
		float newMaxY = MathUtils.min(aabbMinY, translatedMaxY);
		
		res.set(newMinX, newMinY, newMaxX, newMaxY);
		
		return res;
	}
	
	public static <T extends IAabb2WF> T translateMax(float aabbMinX, float aabbMinY, float aabbMaxX, float aabbMaxY, float[] t, @ExtractionParam T res)
	{
		float tX = t[0];
		float tY = t[1];
		
		float translatedMaxX = aabbMaxX + tX;
		float translatedMaxY = aabbMaxY + tY;
		
		float newMinX = MathUtils.min(aabbMinX, translatedMaxX);
		float newMinY = MathUtils.min(aabbMinY, translatedMaxY);
		float newMaxX = MathUtils.min(aabbMinX, translatedMaxX);
		float newMaxY = MathUtils.min(aabbMinY, translatedMaxY);
		
		res.set(newMinX, newMinY, newMaxX, newMaxY);
		
		return res;
	}
	
	public static <T extends IAabb2WF> T translateMax(float aabbMinX, float aabbMinY, float aabbMaxX, float aabbMaxY, float tX, float tY, @ExtractionParam T res)
	{
		float translatedMaxX = aabbMaxX + tX;
		float translatedMaxY = aabbMaxY + tY;
		
		float newMinX = MathUtils.min(aabbMinX, translatedMaxX);
		float newMinY = MathUtils.min(aabbMinY, translatedMaxY);
		float newMaxX = MathUtils.min(aabbMinX, translatedMaxX);
		float newMaxY = MathUtils.min(aabbMinY, translatedMaxY);
		
		res.set(newMinX, newMinY, newMaxX, newMaxY);
		
		return res;
	}
	
	public static <T extends IAabb2WF> T translateMaxAssign(@ExtractionParam T aabb, IVec2RF t)
	{
		float aabbMinX = aabb.minX();
		float aabbMinY = aabb.minY();
		float aabbMaxX = aabb.maxX();
		float aabbMaxY = aabb.maxY();
		
		float tX = t.x();
		float tY = t.y();
		
		float translatedMaxX = aabbMaxX + tX;
		float translatedMaxY = aabbMaxY + tY;
		
		float newMinX = MathUtils.min(aabbMinX, translatedMaxX);
		float newMinY = MathUtils.min(aabbMinY, translatedMaxY);
		float newMaxX = MathUtils.min(aabbMinX, translatedMaxX);
		float newMaxY = MathUtils.min(aabbMinY, translatedMaxY);
		
		aabb.set(newMinX, newMinY, newMaxX, newMaxY);
		
		return aabb;
	}
	
	public static <T extends IAabb2WF> T translateMaxAssign(@ExtractionParam T aabb, float[] t)
	{
		float aabbMinX = aabb.minX();
		float aabbMinY = aabb.minY();
		float aabbMaxX = aabb.maxX();
		float aabbMaxY = aabb.maxY();
		
		float tX = t[0];
		float tY = t[1];
		
		float translatedMaxX = aabbMaxX + tX;
		float translatedMaxY = aabbMaxY + tY;
		
		float newMinX = MathUtils.min(aabbMinX, translatedMaxX);
		float newMinY = MathUtils.min(aabbMinY, translatedMaxY);
		float newMaxX = MathUtils.min(aabbMinX, translatedMaxX);
		float newMaxY = MathUtils.min(aabbMinY, translatedMaxY);
		
		aabb.set(newMinX, newMinY, newMaxX, newMaxY);
		
		return aabb;
	}
	
	public static <T extends IAabb2WF> T translateMaxAssign(@ExtractionParam T aabb, float tX, float tY)
	{
		float aabbMinX = aabb.minX();
		float aabbMinY = aabb.minY();
		float aabbMaxX = aabb.maxX();
		float aabbMaxY = aabb.maxY();
		
		float translatedMaxX = aabbMaxX + tX;
		float translatedMaxY = aabbMaxY + tY;
		
		float newMinX = MathUtils.min(aabbMinX, translatedMaxX);
		float newMinY = MathUtils.min(aabbMinY, translatedMaxY);
		float newMaxX = MathUtils.min(aabbMinX, translatedMaxX);
		float newMaxY = MathUtils.min(aabbMinY, translatedMaxY);
		
		aabb.set(newMinX, newMinY, newMaxX, newMaxY);
		
		return aabb;
	}
	
	public static float[] grow(IAabb2RF aabb, IVec2RF e, @ExtractionParam float[] res)
	{
		float aabbMinX = aabb.minX();
		float aabbMinY = aabb.minY();
		float aabbMaxX = aabb.maxX();
		float aabbMaxY = aabb.maxY();
		
		float eX = e.x();
		float eY = e.y();
		
		float newMinX = aabbMinX - eX;
		float newMinY = aabbMinY - eY;
		float newMaxX = aabbMaxX + eX;
		float newMaxY = aabbMaxY + eY;
		
		res[0] = newMinX;
		res[1] = newMinY;
		res[2] = newMaxX;
		res[3] = newMaxY;
		
		return res;
	}
	
	public static float[] grow(IAabb2RF aabb, float[] e, @ExtractionParam float[] res)
	{
		float aabbMinX = aabb.minX();
		float aabbMinY = aabb.minY();
		float aabbMaxX = aabb.maxX();
		float aabbMaxY = aabb.maxY();
		
		float eX = e[0];
		float eY = e[1];
		
		float newMinX = aabbMinX - eX;
		float newMinY = aabbMinY - eY;
		float newMaxX = aabbMaxX + eX;
		float newMaxY = aabbMaxY + eY;
		
		res[0] = newMinX;
		res[1] = newMinY;
		res[2] = newMaxX;
		res[3] = newMaxY;
		
		return res;
	}
	
	public static float[] grow(IAabb2RF aabb, float eX, float eY, @ExtractionParam float[] res)
	{
		float aabbMinX = aabb.minX();
		float aabbMinY = aabb.minY();
		float aabbMaxX = aabb.maxX();
		float aabbMaxY = aabb.maxY();
		
		float newMinX = aabbMinX - eX;
		float newMinY = aabbMinY - eY;
		float newMaxX = aabbMaxX + eX;
		float newMaxY = aabbMaxY + eY;
		
		res[0] = newMinX;
		res[1] = newMinY;
		res[2] = newMaxX;
		res[3] = newMaxY;
		
		return res;
	}
	
	public static float[] grow(float[] aabb, IVec2RF e, @ExtractionParam float[] res)
	{
		float aabbMinX = aabb[0];
		float aabbMinY = aabb[1];
		float aabbMaxX = aabb[3];
		float aabbMaxY = aabb[4];
		
		float eX = e.x();
		float eY = e.y();
		
		float newMinX = aabbMinX - eX;
		float newMinY = aabbMinY - eY;
		float newMaxX = aabbMaxX + eX;
		float newMaxY = aabbMaxY + eY;
		
		res[0] = newMinX;
		res[1] = newMinY;
		res[2] = newMaxX;
		res[3] = newMaxY;
		
		return res;
	}
	
	public static float[] grow(IVec2RF aabbMin, IVec2RF aabbMax, IVec2RF e, @ExtractionParam float[] res)
	{
		float aabbMinX = aabbMin.x();
		float aabbMinY = aabbMin.y();
		float aabbMaxX = aabbMax.x();
		float aabbMaxY = aabbMax.y();
		
		float eX = e.x();
		float eY = e.y();
		
		float newMinX = aabbMinX - eX;
		float newMinY = aabbMinY - eY;
		float newMaxX = aabbMaxX + eX;
		float newMaxY = aabbMaxY + eY;
		
		res[0] = newMinX;
		res[1] = newMinY;
		res[2] = newMaxX;
		res[3] = newMaxY;
		
		return res;
	}
	
	public static float[] grow(IVec2RF aabbMin, IVec2RF aabbMax, float[] e, @ExtractionParam float[] res)
	{
		float aabbMinX = aabbMin.x();
		float aabbMinY = aabbMin.y();
		float aabbMaxX = aabbMax.x();
		float aabbMaxY = aabbMax.y();
		
		float eX = e[0];
		float eY = e[1];
		
		float newMinX = aabbMinX - eX;
		float newMinY = aabbMinY - eY;
		float newMaxX = aabbMaxX + eX;
		float newMaxY = aabbMaxY + eY;
		
		res[0] = newMinX;
		res[1] = newMinY;
		res[2] = newMaxX;
		res[3] = newMaxY;
		
		return res;
	}
	
	public static float[] grow(IVec2RF aabbMin, IVec2RF aabbMax, float eX, float eY, @ExtractionParam float[] res)
	{
		float aabbMinX = aabbMin.x();
		float aabbMinY = aabbMin.y();
		float aabbMaxX = aabbMax.x();
		float aabbMaxY = aabbMax.y();
		
		float newMinX = aabbMinX - eX;
		float newMinY = aabbMinY - eY;
		float newMaxX = aabbMaxX + eX;
		float newMaxY = aabbMaxY + eY;
		
		res[0] = newMinX;
		res[1] = newMinY;
		res[2] = newMaxX;
		res[3] = newMaxY;
		
		return res;
	}
	
	public static float[] grow(IVec2RF aabbMin, float[] aabbMax, IVec2RF e, @ExtractionParam float[] res)
	{
		float aabbMinX = aabbMin.x();
		float aabbMinY = aabbMin.y();
		float aabbMaxX = aabbMax[0];
		float aabbMaxY = aabbMax[1];
		
		float eX = e.x();
		float eY = e.y();
		
		float newMinX = aabbMinX - eX;
		float newMinY = aabbMinY - eY;
		float newMaxX = aabbMaxX + eX;
		float newMaxY = aabbMaxY + eY;
		
		res[0] = newMinX;
		res[1] = newMinY;
		res[2] = newMaxX;
		res[3] = newMaxY;
		
		return res;
	}
	
	public static float[] grow(IVec2RF aabbMin, float[] aabbMax, float[] e, @ExtractionParam float[] res)
	{
		float aabbMinX = aabbMin.x();
		float aabbMinY = aabbMin.y();
		float aabbMaxX = aabbMax[0];
		float aabbMaxY = aabbMax[1];
		
		float eX = e[0];
		float eY = e[1];
		
		float newMinX = aabbMinX - eX;
		float newMinY = aabbMinY - eY;
		float newMaxX = aabbMaxX + eX;
		float newMaxY = aabbMaxY + eY;
		
		res[0] = newMinX;
		res[1] = newMinY;
		res[2] = newMaxX;
		res[3] = newMaxY;
		
		return res;
	}
	
	public static float[] grow(IVec2RF aabbMin, float[] aabbMax, float eX, float eY, @ExtractionParam float[] res)
	{
		float aabbMinX = aabbMin.x();
		float aabbMinY = aabbMin.y();
		float aabbMaxX = aabbMax[0];
		float aabbMaxY = aabbMax[1];
		
		float newMinX = aabbMinX - eX;
		float newMinY = aabbMinY - eY;
		float newMaxX = aabbMaxX + eX;
		float newMaxY = aabbMaxY + eY;
		
		res[0] = newMinX;
		res[1] = newMinY;
		res[2] = newMaxX;
		res[3] = newMaxY;
		
		return res;
	}
	
	public static float[] grow(IVec2RF aabbMin, float aabbMaxX, float aabbMaxY, IVec2RF e, @ExtractionParam float[] res)
	{
		float aabbMinX = aabbMin.x();
		float aabbMinY = aabbMin.y();
		
		float eX = e.x();
		float eY = e.y();
		
		float newMinX = aabbMinX - eX;
		float newMinY = aabbMinY - eY;
		float newMaxX = aabbMaxX + eX;
		float newMaxY = aabbMaxY + eY;
		
		res[0] = newMinX;
		res[1] = newMinY;
		res[2] = newMaxX;
		res[3] = newMaxY;
		
		return res;
	}
	
	public static float[] grow(IVec2RF aabbMin, float aabbMaxX, float aabbMaxY, float[] e, @ExtractionParam float[] res)
	{
		float aabbMinX = aabbMin.x();
		float aabbMinY = aabbMin.y();
		
		float eX = e[0];
		float eY = e[1];
		
		float newMinX = aabbMinX - eX;
		float newMinY = aabbMinY - eY;
		float newMaxX = aabbMaxX + eX;
		float newMaxY = aabbMaxY + eY;
		
		res[0] = newMinX;
		res[1] = newMinY;
		res[2] = newMaxX;
		res[3] = newMaxY;
		
		return res;
	}
	
	public static float[] grow(IVec2RF aabbMin, float aabbMaxX, float aabbMaxY, float eX, float eY, @ExtractionParam float[] res)
	{
		float aabbMinX = aabbMin.x();
		float aabbMinY = aabbMin.y();
		
		float newMinX = aabbMinX - eX;
		float newMinY = aabbMinY - eY;
		float newMaxX = aabbMaxX + eX;
		float newMaxY = aabbMaxY + eY;
		
		res[0] = newMinX;
		res[1] = newMinY;
		res[2] = newMaxX;
		res[3] = newMaxY;
		
		return res;
	}
	
	public static float[] grow(float[] aabbMin, IVec2RF aabbMax, IVec2RF e, @ExtractionParam float[] res)
	{
		float aabbMinX = aabbMin[0];
		float aabbMinY = aabbMin[1];
		float aabbMaxX = aabbMax.x();
		float aabbMaxY = aabbMax.y();
		
		float eX = e.x();
		float eY = e.y();
		
		float newMinX = aabbMinX - eX;
		float newMinY = aabbMinY - eY;
		float newMaxX = aabbMaxX + eX;
		float newMaxY = aabbMaxY + eY;
		
		res[0] = newMinX;
		res[1] = newMinY;
		res[2] = newMaxX;
		res[3] = newMaxY;
		
		return res;
	}
	
	public static float[] grow(float[] aabbMin, IVec2RF aabbMax, float[] e, @ExtractionParam float[] res)
	{
		float aabbMinX = aabbMin[0];
		float aabbMinY = aabbMin[1];
		float aabbMaxX = aabbMax.x();
		float aabbMaxY = aabbMax.y();
		
		float eX = e[0];
		float eY = e[1];
		
		float newMinX = aabbMinX - eX;
		float newMinY = aabbMinY - eY;
		float newMaxX = aabbMaxX + eX;
		float newMaxY = aabbMaxY + eY;
		
		res[0] = newMinX;
		res[1] = newMinY;
		res[2] = newMaxX;
		res[3] = newMaxY;
		
		return res;
	}
	
	public static float[] grow(float[] aabbMin, IVec2RF aabbMax, float eX, float eY, @ExtractionParam float[] res)
	{
		float aabbMinX = aabbMin[0];
		float aabbMinY = aabbMin[1];
		float aabbMaxX = aabbMax.x();
		float aabbMaxY = aabbMax.y();
		
		float newMinX = aabbMinX - eX;
		float newMinY = aabbMinY - eY;
		float newMaxX = aabbMaxX + eX;
		float newMaxY = aabbMaxY + eY;
		
		res[0] = newMinX;
		res[1] = newMinY;
		res[2] = newMaxX;
		res[3] = newMaxY;
		
		return res;
	}
	
	public static float[] grow(float[] aabbMin, float[] aabbMax, IVec2RF e, @ExtractionParam float[] res)
	{
		float aabbMinX = aabbMin[0];
		float aabbMinY = aabbMin[1];
		float aabbMaxX = aabbMax[0];
		float aabbMaxY = aabbMax[1];
		
		float eX = e.x();
		float eY = e.y();
		
		float newMinX = aabbMinX - eX;
		float newMinY = aabbMinY - eY;
		float newMaxX = aabbMaxX + eX;
		float newMaxY = aabbMaxY + eY;
		
		res[0] = newMinX;
		res[1] = newMinY;
		res[2] = newMaxX;
		res[3] = newMaxY;
		
		return res;
	}
	
	public static float[] grow(float[] aabbMin, float aabbMaxX, float aabbMaxY, IVec2RF e, @ExtractionParam float[] res)
	{
		float aabbMinX = aabbMin[0];
		float aabbMinY = aabbMin[1];
		
		float eX = e.x();
		float eY = e.y();
		
		float newMinX = aabbMinX - eX;
		float newMinY = aabbMinY - eY;
		float newMaxX = aabbMaxX + eX;
		float newMaxY = aabbMaxY + eY;
		
		res[0] = newMinX;
		res[1] = newMinY;
		res[2] = newMaxX;
		res[3] = newMaxY;
		
		return res;
	}
	
	public static float[] grow(float aabbMinX, float aabbMinY, IVec2RF aabbMax, IVec2RF e, @ExtractionParam float[] res)
	{
		float aabbMaxX = aabbMax.x();
		float aabbMaxY = aabbMax.y();
		
		float eX = e.x();
		float eY = e.y();
		
		float newMinX = aabbMinX - eX;
		float newMinY = aabbMinY - eY;
		float newMaxX = aabbMaxX + eX;
		float newMaxY = aabbMaxY + eY;
		
		res[0] = newMinX;
		res[1] = newMinY;
		res[2] = newMaxX;
		res[3] = newMaxY;
		
		return res;
	}
	
	public static float[] grow(float aabbMinX, float aabbMinY, IVec2RF aabbMax, float[] e, @ExtractionParam float[] res)
	{
		float aabbMaxX = aabbMax.x();
		float aabbMaxY = aabbMax.y();
		
		float eX = e[0];
		float eY = e[1];
		
		float newMinX = aabbMinX - eX;
		float newMinY = aabbMinY - eY;
		float newMaxX = aabbMaxX + eX;
		float newMaxY = aabbMaxY + eY;
		
		res[0] = newMinX;
		res[1] = newMinY;
		res[2] = newMaxX;
		res[3] = newMaxY;
		
		return res;
	}
	
	public static float[] grow(float aabbMinX, float aabbMinY, IVec2RF aabbMax, float eX, float eY, @ExtractionParam float[] res)
	{
		float aabbMaxX = aabbMax.x();
		float aabbMaxY = aabbMax.y();
		
		float newMinX = aabbMinX - eX;
		float newMinY = aabbMinY - eY;
		float newMaxX = aabbMaxX + eX;
		float newMaxY = aabbMaxY + eY;
		
		res[0] = newMinX;
		res[1] = newMinY;
		res[2] = newMaxX;
		res[3] = newMaxY;
		
		return res;
	}
	
	public static float[] grow(float aabbMinX, float aabbMinY, float[] aabbMax, IVec2RF e, @ExtractionParam float[] res)
	{
		float aabbMaxX = aabbMax[0];
		float aabbMaxY = aabbMax[1];
		
		float eX = e.x();
		float eY = e.y();
		
		float newMinX = aabbMinX - eX;
		float newMinY = aabbMinY - eY;
		float newMaxX = aabbMaxX + eX;
		float newMaxY = aabbMaxY + eY;
		
		res[0] = newMinX;
		res[1] = newMinY;
		res[2] = newMaxX;
		res[3] = newMaxY;
		
		return res;
	}
	
	public static float[] grow(float aabbMinX, float aabbMinY, float aabbMaxX, float aabbMaxY, IVec2RF e, @ExtractionParam float[] res)
	{
		float eX = e.x();
		float eY = e.y();
		
		float newMinX = aabbMinX - eX;
		float newMinY = aabbMinY - eY;
		float newMaxX = aabbMaxX + eX;
		float newMaxY = aabbMaxY + eY;
		
		res[0] = newMinX;
		res[1] = newMinY;
		res[2] = newMaxX;
		res[3] = newMaxY;
		
		return res;
	}
	
	public static float[] growAssign(@ExtractionParam float[] aabb, IVec2RF e)
	{
		float aabbMinX = aabb[0];
		float aabbMinY = aabb[1];
		float aabbMaxX = aabb[2];
		float aabbMaxY = aabb[3];
		
		float eX = e.x();
		float eY = e.y();
		
		float newMinX = aabbMinX - eX;
		float newMinY = aabbMinY - eY;
		float newMaxX = aabbMaxX + eX;
		float newMaxY = aabbMaxY + eY;
		
		aabb[0] = newMinX;
		aabb[1] = newMinY;
		aabb[2] = newMaxX;
		aabb[3] = newMaxY;
		
		return aabb;
	}
	
	public static <T extends IAabb2WF> T grow(IAabb2RF aabb, IVec2RF e, @ExtractionParam T res)
	{
		float aabbMinX = aabb.minX();
		float aabbMinY = aabb.minY();
		float aabbMaxX = aabb.maxX();
		float aabbMaxY = aabb.maxY();
		
		float eX = e.x();
		float eY = e.y();
		
		float newMinX = aabbMinX - eX;
		float newMinY = aabbMinY - eY;
		float newMaxX = aabbMaxX + eX;
		float newMaxY = aabbMaxY + eY;
		
		res.set(newMinX, newMinY, newMaxX, newMaxY);
		
		return res;
	}
	
	public static <T extends IAabb2WF> T grow(IAabb2RF aabb, float[] e, @ExtractionParam T res)
	{
		float aabbMinX = aabb.minX();
		float aabbMinY = aabb.minY();
		float aabbMaxX = aabb.maxX();
		float aabbMaxY = aabb.maxY();
		
		float eX = e[0];
		float eY = e[1];
		
		float newMinX = aabbMinX - eX;
		float newMinY = aabbMinY - eY;
		float newMaxX = aabbMaxX + eX;
		float newMaxY = aabbMaxY + eY;
		
		res.set(newMinX, newMinY, newMaxX, newMaxY);
		
		return res;
	}
	
	public static <T extends IAabb2WF> T grow(IAabb2RF aabb, float eX, float eY, @ExtractionParam T res)
	{
		float aabbMinX = aabb.minX();
		float aabbMinY = aabb.minY();
		float aabbMaxX = aabb.maxX();
		float aabbMaxY = aabb.maxY();
		
		float newMinX = aabbMinX - eX;
		float newMinY = aabbMinY - eY;
		float newMaxX = aabbMaxX + eX;
		float newMaxY = aabbMaxY + eY;
		
		res.set(newMinX, newMinY, newMaxX, newMaxY);
		
		return res;
	}
	
	public static <T extends IAabb2WF> T grow(float[] aabb, IVec2RF e, @ExtractionParam T res)
	{
		float aabbMinX = aabb[0];
		float aabbMinY = aabb[1];
		float aabbMaxX = aabb[2];
		float aabbMaxY = aabb[3];
		
		float eX = e.x();
		float eY = e.y();
		
		float newMinX = aabbMinX - eX;
		float newMinY = aabbMinY - eY;
		float newMaxX = aabbMaxX + eX;
		float newMaxY = aabbMaxY + eY;
		
		res.set(newMinX, newMinY, newMaxX, newMaxY);
		
		return res;
	}
	
	public static <T extends IAabb2WF> T grow(float[] aabb, float[] e, @ExtractionParam T res)
	{
		float aabbMinX = aabb[0];
		float aabbMinY = aabb[1];
		float aabbMaxX = aabb[2];
		float aabbMaxY = aabb[3];
		
		float eX = e[0];
		float eY = e[1];
		
		float newMinX = aabbMinX - eX;
		float newMinY = aabbMinY - eY;
		float newMaxX = aabbMaxX + eX;
		float newMaxY = aabbMaxY + eY;
		
		res.set(newMinX, newMinY, newMaxX, newMaxY);
		
		return res;
	}
	
	public static <T extends IAabb2WF> T grow(float[] aabb, float eX, float eY, @ExtractionParam T res)
	{
		float aabbMinX = aabb[0];
		float aabbMinY = aabb[1];
		float aabbMaxX = aabb[2];
		float aabbMaxY = aabb[3];
		
		float newMinX = aabbMinX - eX;
		float newMinY = aabbMinY - eY;
		float newMaxX = aabbMaxX + eX;
		float newMaxY = aabbMaxY + eY;
		
		res.set(newMinX, newMinY, newMaxX, newMaxY);
		
		return res;
	}
	
	public static <T extends IAabb2WF> T grow(IVec2RF aabbMin, IVec2RF aabbMax, IVec2RF e, @ExtractionParam T res)
	{
		float aabbMinX = aabbMin.x();
		float aabbMinY = aabbMin.y();
		float aabbMaxX = aabbMax.x();
		float aabbMaxY = aabbMax.y();
		
		float eX = e.x();
		float eY = e.y();
		
		float newMinX = aabbMinX - eX;
		float newMinY = aabbMinY - eY;
		float newMaxX = aabbMaxX + eX;
		float newMaxY = aabbMaxY + eY;
		
		res.set(newMinX, newMinY, newMaxX, newMaxY);
		
		return res;
	}
	
	public static <T extends IAabb2WF> T grow(IVec2RF aabbMin, IVec2RF aabbMax, float[] e, @ExtractionParam T res)
	{
		float aabbMinX = aabbMin.x();
		float aabbMinY = aabbMin.y();
		float aabbMaxX = aabbMax.x();
		float aabbMaxY = aabbMax.y();
		
		float eX = e[0];
		float eY = e[1];
		
		float newMinX = aabbMinX - eX;
		float newMinY = aabbMinY - eY;
		float newMaxX = aabbMaxX + eX;
		float newMaxY = aabbMaxY + eY;
		
		res.set(newMinX, newMinY, newMaxX, newMaxY);
		
		return res;
	}
	
	public static <T extends IAabb2WF> T grow(IVec2RF aabbMin, IVec2RF aabbMax, float eX, float eY, @ExtractionParam T res)
	{
		float aabbMinX = aabbMin.x();
		float aabbMinY = aabbMin.y();
		float aabbMaxX = aabbMax.x();
		float aabbMaxY = aabbMax.y();
		
		float newMinX = aabbMinX - eX;
		float newMinY = aabbMinY - eY;
		float newMaxX = aabbMaxX + eX;
		float newMaxY = aabbMaxY + eY;
		
		res.set(newMinX, newMinY, newMaxX, newMaxY);
		
		return res;
	}
	
	public static <T extends IAabb2WF> T grow(IVec2RF aabbMin, float[] aabbMax, IVec2RF e, @ExtractionParam T res)
	{
		float aabbMinX = aabbMin.x();
		float aabbMinY = aabbMin.y();
		float aabbMaxX = aabbMax[0];
		float aabbMaxY = aabbMax[1];
		
		float eX = e.x();
		float eY = e.y();
		
		float newMinX = aabbMinX - eX;
		float newMinY = aabbMinY - eY;
		float newMaxX = aabbMaxX + eX;
		float newMaxY = aabbMaxY + eY;
		
		res.set(newMinX, newMinY, newMaxX, newMaxY);
		
		return res;
	}
	
	public static <T extends IAabb2WF> T grow(IVec2RF aabbMin, float[] aabbMax, float[] e, @ExtractionParam T res)
	{
		float aabbMinX = aabbMin.x();
		float aabbMinY = aabbMin.y();
		float aabbMaxX = aabbMax[0];
		float aabbMaxY = aabbMax[1];
		
		float eX = e[0];
		float eY = e[1];
		
		float newMinX = aabbMinX - eX;
		float newMinY = aabbMinY - eY;
		float newMaxX = aabbMaxX + eX;
		float newMaxY = aabbMaxY + eY;
		
		res.set(newMinX, newMinY, newMaxX, newMaxY);
		
		return res;
	}
	
	public static <T extends IAabb2WF> T grow(IVec2RF aabbMin, float[] aabbMax, float eX, float eY, @ExtractionParam T res)
	{
		float aabbMinX = aabbMin.x();
		float aabbMinY = aabbMin.y();
		float aabbMaxX = aabbMax[0];
		float aabbMaxY = aabbMax[1];
		
		float newMinX = aabbMinX - eX;
		float newMinY = aabbMinY - eY;
		float newMaxX = aabbMaxX + eX;
		float newMaxY = aabbMaxY + eY;
		
		res.set(newMinX, newMinY, newMaxX, newMaxY);
		
		return res;
	}
	
	public static <T extends IAabb2WF> T grow(IVec2RF aabbMin, float aabbMaxX, float aabbMaxY, IVec2RF e, @ExtractionParam T res)
	{
		float aabbMinX = aabbMin.x();
		float aabbMinY = aabbMin.y();
		
		float eX = e.x();
		float eY = e.y();
		
		float newMinX = aabbMinX - eX;
		float newMinY = aabbMinY - eY;
		float newMaxX = aabbMaxX + eX;
		float newMaxY = aabbMaxY + eY;
		
		res.set(newMinX, newMinY, newMaxX, newMaxY);
		
		return res;
	}
	
	public static <T extends IAabb2WF> T grow(IVec2RF aabbMin, float aabbMaxX, float aabbMaxY, float[] e, @ExtractionParam T res)
	{
		float aabbMinX = aabbMin.x();
		float aabbMinY = aabbMin.y();
		
		float eX = e[0];
		float eY = e[1];
		
		float newMinX = aabbMinX - eX;
		float newMinY = aabbMinY - eY;
		float newMaxX = aabbMaxX + eX;
		float newMaxY = aabbMaxY + eY;
		
		res.set(newMinX, newMinY, newMaxX, newMaxY);
		
		return res;
	}
	
	public static <T extends IAabb2WF> T grow(IVec2RF aabbMin, float aabbMaxX, float aabbMaxY, float eX, float eY, @ExtractionParam T res)
	{
		float aabbMinX = aabbMin.x();
		float aabbMinY = aabbMin.y();
		
		float newMinX = aabbMinX - eX;
		float newMinY = aabbMinY - eY;
		float newMaxX = aabbMaxX + eX;
		float newMaxY = aabbMaxY + eY;
		
		res.set(newMinX, newMinY, newMaxX, newMaxY);
		
		return res;
	}
	
	public static <T extends IAabb2WF> T grow(float[] aabbMin, IVec2RF aabbMax, IVec2RF e, @ExtractionParam T res)
	{
		float aabbMinX = aabbMin[0];
		float aabbMinY = aabbMin[1];
		float aabbMaxX = aabbMax.x();
		float aabbMaxY = aabbMax.y();
		
		float eX = e.x();
		float eY = e.y();
		
		float newMinX = aabbMinX - eX;
		float newMinY = aabbMinY - eY;
		float newMaxX = aabbMaxX + eX;
		float newMaxY = aabbMaxY + eY;
		
		res.set(newMinX, newMinY, newMaxX, newMaxY);
		
		return res;
	}
	
	public static <T extends IAabb2WF> T grow(float[] aabbMin, IVec2RF aabbMax, float[] e, @ExtractionParam T res)
	{
		float aabbMinX = aabbMin[0];
		float aabbMinY = aabbMin[1];
		float aabbMaxX = aabbMax.x();
		float aabbMaxY = aabbMax.y();
		
		float eX = e[0];
		float eY = e[1];
		
		float newMinX = aabbMinX - eX;
		float newMinY = aabbMinY - eY;
		float newMaxX = aabbMaxX + eX;
		float newMaxY = aabbMaxY + eY;
		
		res.set(newMinX, newMinY, newMaxX, newMaxY);
		
		return res;
	}
	
	public static <T extends IAabb2WF> T grow(float[] aabbMin, IVec2RF aabbMax, float eX, float eY, @ExtractionParam T res)
	{
		float aabbMinX = aabbMin[0];
		float aabbMinY = aabbMin[1];
		float aabbMaxX = aabbMax.x();
		float aabbMaxY = aabbMax.y();
		
		float newMinX = aabbMinX - eX;
		float newMinY = aabbMinY - eY;
		float newMaxX = aabbMaxX + eX;
		float newMaxY = aabbMaxY + eY;
		
		res.set(newMinX, newMinY, newMaxX, newMaxY);
		
		return res;
	}
	
	public static <T extends IAabb2WF> T grow(float[] aabbMin, float[] aabbMax, IVec2RF e, @ExtractionParam T res)
	{
		float aabbMinX = aabbMin[0];
		float aabbMinY = aabbMin[1];
		float aabbMaxX = aabbMax[0];
		float aabbMaxY = aabbMax[1];
		
		float eX = e.x();
		float eY = e.y();
		
		float newMinX = aabbMinX - eX;
		float newMinY = aabbMinY - eY;
		float newMaxX = aabbMaxX + eX;
		float newMaxY = aabbMaxY + eY;
		
		res.set(newMinX, newMinY, newMaxX, newMaxY);
		
		return res;
	}
	
	public static <T extends IAabb2WF> T grow(float[] aabbMin, float[] aabbMax, float[] e, @ExtractionParam T res)
	{
		float aabbMinX = aabbMin[0];
		float aabbMinY = aabbMin[1];
		float aabbMaxX = aabbMax[0];
		float aabbMaxY = aabbMax[1];
		
		float eX = e[0];
		float eY = e[1];
		
		float newMinX = aabbMinX - eX;
		float newMinY = aabbMinY - eY;
		float newMaxX = aabbMaxX + eX;
		float newMaxY = aabbMaxY + eY;
		
		res.set(newMinX, newMinY, newMaxX, newMaxY);
		
		return res;
	}
	
	public static <T extends IAabb2WF> T grow(float[] aabbMin, float[] aabbMax, float eX, float eY, @ExtractionParam T res)
	{
		float aabbMinX = aabbMin[0];
		float aabbMinY = aabbMin[1];
		float aabbMaxX = aabbMax[0];
		float aabbMaxY = aabbMax[1];
		
		float newMinX = aabbMinX - eX;
		float newMinY = aabbMinY - eY;
		float newMaxX = aabbMaxX + eX;
		float newMaxY = aabbMaxY + eY;
		
		res.set(newMinX, newMinY, newMaxX, newMaxY);
		
		return res;
	}
	
	public static <T extends IAabb2WF> T grow(float[] aabbMin, float aabbMaxX, float aabbMaxY, IVec2RF e, @ExtractionParam T res)
	{
		float aabbMinX = aabbMin[0];
		float aabbMinY = aabbMin[1];
		
		float eX = e.x();
		float eY = e.y();
		
		float newMinX = aabbMinX - eX;
		float newMinY = aabbMinY - eY;
		float newMaxX = aabbMaxX + eX;
		float newMaxY = aabbMaxY + eY;
		
		res.set(newMinX, newMinY, newMaxX, newMaxY);
		
		return res;
	}
	
	public static <T extends IAabb2WF> T grow(float[] aabbMin, float aabbMaxX, float aabbMaxY, float[] e, @ExtractionParam T res)
	{
		float aabbMinX = aabbMin[0];
		float aabbMinY = aabbMin[1];
		
		float eX = e[0];
		float eY = e[1];
		
		float newMinX = aabbMinX - eX;
		float newMinY = aabbMinY - eY;
		float newMaxX = aabbMaxX + eX;
		float newMaxY = aabbMaxY + eY;
		
		res.set(newMinX, newMinY, newMaxX, newMaxY);
		
		return res;
	}
	
	public static <T extends IAabb2WF> T grow(float[] aabbMin, float aabbMaxX, float aabbMaxY, float eX, float eY, @ExtractionParam T res)
	{
		float aabbMinX = aabbMin[0];
		float aabbMinY = aabbMin[1];
		
		float newMinX = aabbMinX - eX;
		float newMinY = aabbMinY - eY;
		float newMaxX = aabbMaxX + eX;
		float newMaxY = aabbMaxY + eY;
		
		res.set(newMinX, newMinY, newMaxX, newMaxY);
		
		return res;
	}
	
	public static <T extends IAabb2WF> T grow(float aabbMinX, float aabbMinY, IVec2RF aabbMax, IVec2RF e, @ExtractionParam T res)
	{
		float aabbMaxX = aabbMax.x();
		float aabbMaxY = aabbMax.y();
		
		float eX = e.x();
		float eY = e.y();
		
		float newMinX = aabbMinX - eX;
		float newMinY = aabbMinY - eY;
		float newMaxX = aabbMaxX + eX;
		float newMaxY = aabbMaxY + eY;
		
		res.set(newMinX, newMinY, newMaxX, newMaxY);
		
		return res;
	}
	
	public static <T extends IAabb2WF> T grow(float aabbMinX, float aabbMinY, IVec2RF aabbMax, float[] e, @ExtractionParam T res)
	{
		float aabbMaxX = aabbMax.x();
		float aabbMaxY = aabbMax.y();
		
		float eX = e[0];
		float eY = e[1];
		
		float newMinX = aabbMinX - eX;
		float newMinY = aabbMinY - eY;
		float newMaxX = aabbMaxX + eX;
		float newMaxY = aabbMaxY + eY;
		
		res.set(newMinX, newMinY, newMaxX, newMaxY);
		
		return res;
	}
	
	public static <T extends IAabb2WF> T grow(float aabbMinX, float aabbMinY, IVec2RF aabbMax, float eX, float eY, @ExtractionParam T res)
	{
		float aabbMaxX = aabbMax.x();
		float aabbMaxY = aabbMax.y();
		
		float newMinX = aabbMinX - eX;
		float newMinY = aabbMinY - eY;
		float newMaxX = aabbMaxX + eX;
		float newMaxY = aabbMaxY + eY;
		
		res.set(newMinX, newMinY, newMaxX, newMaxY);
		
		return res;
	}
	
	public static <T extends IAabb2WF> T grow(float aabbMinX, float aabbMinY, float[] aabbMax, IVec2RF e, @ExtractionParam T res)
	{
		float aabbMaxX = aabbMax[0];
		float aabbMaxY = aabbMax[1];
		
		float eX = e.x();
		float eY = e.y();
		
		float newMinX = aabbMinX - eX;
		float newMinY = aabbMinY - eY;
		float newMaxX = aabbMaxX + eX;
		float newMaxY = aabbMaxY + eY;
		
		res.set(newMinX, newMinY, newMaxX, newMaxY);
		
		return res;
	}
	
	public static <T extends IAabb2WF> T grow(float aabbMinX, float aabbMinY, float[] aabbMax, float[] e, @ExtractionParam T res)
	{
		float aabbMaxX = aabbMax[0];
		float aabbMaxY = aabbMax[1];
		
		float eX = e[0];
		float eY = e[1];
		
		float newMinX = aabbMinX - eX;
		float newMinY = aabbMinY - eY;
		float newMaxX = aabbMaxX + eX;
		float newMaxY = aabbMaxY + eY;
		
		res.set(newMinX, newMinY, newMaxX, newMaxY);
		
		return res;
	}
	
	public static <T extends IAabb2WF> T grow(float aabbMinX, float aabbMinY, float[] aabbMax, float eX, float eY, @ExtractionParam T res)
	{
		float aabbMaxX = aabbMax[0];
		float aabbMaxY = aabbMax[1];
		
		float newMinX = aabbMinX - eX;
		float newMinY = aabbMinY - eY;
		float newMaxX = aabbMaxX + eX;
		float newMaxY = aabbMaxY + eY;
		
		res.set(newMinX, newMinY, newMaxX, newMaxY);
		
		return res;
	}
	
	public static <T extends IAabb2WF> T grow(float aabbMinX, float aabbMinY, float aabbMaxX, float aabbMaxY, IVec2RF e, @ExtractionParam T res)
	{
		float eX = e.x();
		float eY = e.y();
		
		float newMinX = aabbMinX - eX;
		float newMinY = aabbMinY - eY;
		float newMaxX = aabbMaxX + eX;
		float newMaxY = aabbMaxY + eY;
		
		res.set(newMinX, newMinY, newMaxX, newMaxY);
		
		return res;
	}
	
	public static <T extends IAabb2WF> T grow(float aabbMinX, float aabbMinY, float aabbMaxX, float aabbMaxY, float[] e, @ExtractionParam T res)
	{
		float eX = e[0];
		float eY = e[1];
		
		float newMinX = aabbMinX - eX;
		float newMinY = aabbMinY - eY;
		float newMaxX = aabbMaxX + eX;
		float newMaxY = aabbMaxY + eY;
		
		res.set(newMinX, newMinY, newMaxX, newMaxY);
		
		return res;
	}
	
	public static <T extends IAabb2WF> T grow(float aabbMinX, float aabbMinY, float aabbMaxX, float aabbMaxY, float eX, float eY, @ExtractionParam T res)
	{
		float newMinX = aabbMinX - eX;
		float newMinY = aabbMinY - eY;
		float newMaxX = aabbMaxX + eX;
		float newMaxY = aabbMaxY + eY;
		
		res.set(newMinX, newMinY, newMaxX, newMaxY);
		
		return res;
	}
	
	public static <T extends IAabb2WF> T growAssign(@ExtractionParam T aabb, IVec2RF e)
	{
		float aabbMinX = aabb.minX();
		float aabbMinY = aabb.minY();
		float aabbMaxX = aabb.maxX();
		float aabbMaxY = aabb.maxY();
		
		float eX = e.x();
		float eY = e.y();
		
		float newMinX = aabbMinX - eX;
		float newMinY = aabbMinY - eY;
		float newMaxX = aabbMaxX + eX;
		float newMaxY = aabbMaxY + eY;
		
		aabb.set(newMinX, newMinY, newMaxX, newMaxY);
		
		return aabb;
	}
	
	public static <T extends IAabb2WF> T growAssign(@ExtractionParam T aabb, float[] e)
	{
		float aabbMinX = aabb.minX();
		float aabbMinY = aabb.minY();
		float aabbMaxX = aabb.maxX();
		float aabbMaxY = aabb.maxY();
		
		float eX = e[0];
		float eY = e[1];
		
		float newMinX = aabbMinX - eX;
		float newMinY = aabbMinY - eY;
		float newMaxX = aabbMaxX + eX;
		float newMaxY = aabbMaxY + eY;
		
		aabb.set(newMinX, newMinY, newMaxX, newMaxY);
		
		return aabb;
	}
	
	public static <T extends IAabb2WF> T growAssign(@ExtractionParam T aabb, float eX, float eY)
	{
		float aabbMinX = aabb.minX();
		float aabbMinY = aabb.minY();
		float aabbMaxX = aabb.maxX();
		float aabbMaxY = aabb.maxY();
		
		float newMinX = aabbMinX - eX;
		float newMinY = aabbMinY - eY;
		float newMaxX = aabbMaxX + eX;
		float newMaxY = aabbMaxY + eY;
		
		aabb.set(newMinX, newMinY, newMaxX, newMaxY);
		
		return aabb;
	}
	
	public static float[] expand(IAabb2RF aabb, float[] e, @ExtractionParam float[] res)
	{
		float aabbMinX = aabb.minX();
		float aabbMinY = aabb.minY();
		float aabbMaxX = aabb.maxX();
		float aabbMaxY = aabb.maxY();
		
		float eMinX = e[0];
		float eMinY = e[1];
		float eMaxX = e[2];
		float eMaxY = e[3];
		
		float newMinX = aabbMinX - eMinX;
		float newMinY = aabbMinY - eMinY;
		float newMaxX = aabbMaxX + eMaxX;
		float newMaxY = aabbMaxY + eMaxY;
		
		res[0] = newMinX;
		res[1] = newMinY;
		res[2] = newMaxX;
		res[3] = newMaxY;
		
		return res;
	}
	
	public static float[] expand(IAabb2RF aabb, float eMinX, float eMinY, float eMaxX, float eMaxY, @ExtractionParam float[] res)
	{
		float aabbMinX = aabb.minX();
		float aabbMinY = aabb.minY();
		float aabbMaxX = aabb.maxX();
		float aabbMaxY = aabb.maxY();
		
		float newMinX = aabbMinX - eMinX;
		float newMinY = aabbMinY - eMinY;
		float newMaxX = aabbMaxX + eMaxX;
		float newMaxY = aabbMaxY + eMaxY;
		
		res[0] = newMinX;
		res[1] = newMinY;
		res[2] = newMaxX;
		res[3] = newMaxY;
		
		return res;
	}
	
	public static float[] expand(IVec2RF aabbMin, IVec2RF aabbMax, float[] e, @ExtractionParam float[] res)
	{
		float aabbMinX = aabbMin.x();
		float aabbMinY = aabbMin.y();
		float aabbMaxX = aabbMax.x();
		float aabbMaxY = aabbMax.y();
		
		float eMinX = e[0];
		float eMinY = e[1];
		float eMaxX = e[2];
		float eMaxY = e[3];
		
		float newMinX = aabbMinX - eMinX;
		float newMinY = aabbMinY - eMinY;
		float newMaxX = aabbMaxX + eMaxX;
		float newMaxY = aabbMaxY + eMaxY;
		
		res[0] = newMinX;
		res[1] = newMinY;
		res[2] = newMaxX;
		res[3] = newMaxY;
		
		return res;
	}
	
	public static float[] expand(IVec2RF aabbMin, IVec2RF aabbMax, float eMinX, float eMinY, float eMaxX, float eMaxY, @ExtractionParam float[] res)
	{
		float aabbMinX = aabbMin.x();
		float aabbMinY = aabbMin.y();
		float aabbMaxX = aabbMax.x();
		float aabbMaxY = aabbMax.y();
		
		float newMinX = aabbMinX - eMinX;
		float newMinY = aabbMinY - eMinY;
		float newMaxX = aabbMaxX + eMaxX;
		float newMaxY = aabbMaxY + eMaxY;
		
		res[0] = newMinX;
		res[1] = newMinY;
		res[2] = newMaxX;
		res[3] = newMaxY;
		
		return res;
	}
	
	public static float[] expand(IVec2RF aabbMin, float[] aabbMax, float[] e, @ExtractionParam float[] res)
	{
		float aabbMinX = aabbMin.x();
		float aabbMinY = aabbMin.y();
		float aabbMaxX = aabbMax[0];
		float aabbMaxY = aabbMax[1];
		
		float eMinX = e[0];
		float eMinY = e[1];
		float eMaxX = e[2];
		float eMaxY = e[3];
		
		float newMinX = aabbMinX - eMinX;
		float newMinY = aabbMinY - eMinY;
		float newMaxX = aabbMaxX + eMaxX;
		float newMaxY = aabbMaxY + eMaxY;
		
		res[0] = newMinX;
		res[1] = newMinY;
		res[2] = newMaxX;
		res[3] = newMaxY;
		
		return res;
	}
	
	public static float[] expand(IVec2RF aabbMin, float[] aabbMax, float eMinX, float eMinY, float eMaxX, float eMaxY, @ExtractionParam float[] res)
	{
		float aabbMinX = aabbMin.x();
		float aabbMinY = aabbMin.y();
		float aabbMaxX = aabbMax[0];
		float aabbMaxY = aabbMax[1];
		
		float newMinX = aabbMinX - eMinX;
		float newMinY = aabbMinY - eMinY;
		float newMaxX = aabbMaxX + eMaxX;
		float newMaxY = aabbMaxY + eMaxY;
		
		res[0] = newMinX;
		res[1] = newMinY;
		res[2] = newMaxX;
		res[3] = newMaxY;
		
		return res;
	}
	
	public static float[] expand(IVec2RF aabbMin, float aabbMaxX, float aabbMaxY, float[] e, @ExtractionParam float[] res)
	{
		float aabbMinX = aabbMin.x();
		float aabbMinY = aabbMin.y();
		
		float eMinX = e[0];
		float eMinY = e[1];
		float eMaxX = e[2];
		float eMaxY = e[3];
		
		float newMinX = aabbMinX - eMinX;
		float newMinY = aabbMinY - eMinY;
		float newMaxX = aabbMaxX + eMaxX;
		float newMaxY = aabbMaxY + eMaxY;
		
		res[0] = newMinX;
		res[1] = newMinY;
		res[2] = newMaxX;
		res[3] = newMaxY;
		
		return res;
	}
	
	public static float[] expand(IVec2RF aabbMin, float aabbMaxX, float aabbMaxY, float eMinX, float eMinY, float eMaxX, float eMaxY, @ExtractionParam float[] res)
	{
		float aabbMinX = aabbMin.x();
		float aabbMinY = aabbMin.y();
		
		float newMinX = aabbMinX - eMinX;
		float newMinY = aabbMinY - eMinY;
		float newMaxX = aabbMaxX + eMaxX;
		float newMaxY = aabbMaxY + eMaxY;
		
		res[0] = newMinX;
		res[1] = newMinY;
		res[2] = newMaxX;
		res[3] = newMaxY;
		
		return res;
	}
	
	public static float[] expand(float[] aabbMin, IVec2RF aabbMax, float[] e, @ExtractionParam float[] res)
	{
		float aabbMinX = aabbMin[0];
		float aabbMinY = aabbMin[1];
		float aabbMaxX = aabbMax.x();
		float aabbMaxY = aabbMax.y();
		
		float eMinX = e[0];
		float eMinY = e[1];
		float eMaxX = e[2];
		float eMaxY = e[3];
		
		float newMinX = aabbMinX - eMinX;
		float newMinY = aabbMinY - eMinY;
		float newMaxX = aabbMaxX + eMaxX;
		float newMaxY = aabbMaxY + eMaxY;
		
		res[0] = newMinX;
		res[1] = newMinY;
		res[2] = newMaxX;
		res[3] = newMaxY;
		
		return res;
	}
	
	public static float[] expand(float[] aabbMin, IVec2RF aabbMax, float eMinX, float eMinY, float eMaxX, float eMaxY, @ExtractionParam float[] res)
	{
		float aabbMinX = aabbMin[0];
		float aabbMinY = aabbMin[1];
		float aabbMaxX = aabbMax.x();
		float aabbMaxY = aabbMax.y();
		
		float newMinX = aabbMinX - eMinX;
		float newMinY = aabbMinY - eMinY;
		float newMaxX = aabbMaxX + eMaxX;
		float newMaxY = aabbMaxY + eMaxY;
		
		res[0] = newMinX;
		res[1] = newMinY;
		res[2] = newMaxX;
		res[3] = newMaxY;
		
		return res;
	}
	
	public static float[] expand(float aabbMinX, float aabbMinY, IVec2RF aabbMax, float[] e, @ExtractionParam float[] res)
	{
		float aabbMaxX = aabbMax.x();
		float aabbMaxY = aabbMax.y();
		
		float eMinX = e[0];
		float eMinY = e[1];
		float eMaxX = e[2];
		float eMaxY = e[3];
		
		float newMinX = aabbMinX - eMinX;
		float newMinY = aabbMinY - eMinY;
		float newMaxX = aabbMaxX + eMaxX;
		float newMaxY = aabbMaxY + eMaxY;
		
		res[0] = newMinX;
		res[1] = newMinY;
		res[2] = newMaxX;
		res[3] = newMaxY;
		
		return res;
	}
	
	public static float[] expand(float aabbMinX, float aabbMinY, IVec2RF aabbMax, float eMinX, float eMinY, float eMaxX, float eMaxY, @ExtractionParam float[] res)
	{
		float aabbMaxX = aabbMax.x();
		float aabbMaxY = aabbMax.y();
		
		float newMinX = aabbMinX - eMinX;
		float newMinY = aabbMinY - eMinY;
		float newMaxX = aabbMaxX + eMaxX;
		float newMaxY = aabbMaxY + eMaxY;
		
		res[0] = newMinX;
		res[1] = newMinY;
		res[2] = newMaxX;
		res[3] = newMaxY;
		
		return res;
	}
	
	public static <T extends IAabb2WF> T expand(IAabb2RF aabb, float[] e, @ExtractionParam T res)
	{
		float aabbMinX = aabb.minX();
		float aabbMinY = aabb.minY();
		float aabbMaxX = aabb.maxX();
		float aabbMaxY = aabb.maxY();
		
		float eMinX = e[0];
		float eMinY = e[1];
		float eMaxX = e[2];
		float eMaxY = e[3];
		
		float newMinX = aabbMinX - eMinX;
		float newMinY = aabbMinY - eMinY;
		float newMaxX = aabbMaxX + eMaxX;
		float newMaxY = aabbMaxY + eMaxY;
		
		res.set(newMinX, newMinY, newMaxX, newMaxY);
		
		return res;
	}
	
	public static <T extends IAabb2WF> T expand(IAabb2RF aabb, float eMinX, float eMinY, float eMaxX, float eMaxY, @ExtractionParam T res)
	{
		float aabbMinX = aabb.minX();
		float aabbMinY = aabb.minY();
		float aabbMaxX = aabb.maxX();
		float aabbMaxY = aabb.maxY();
		
		float newMinX = aabbMinX - eMinX;
		float newMinY = aabbMinY - eMinY;
		float newMaxX = aabbMaxX + eMaxX;
		float newMaxY = aabbMaxY + eMaxY;
		
		res.set(newMinX, newMinY, newMaxX, newMaxY);
		
		return res;
	}
	
	public static <T extends IAabb2WF> T expand(float[] aabb, float[] e, @ExtractionParam T res)
	{
		float aabbMinX = aabb[0];
		float aabbMinY = aabb[1];
		float aabbMaxX = aabb[2];
		float aabbMaxY = aabb[3];
		
		float eMinX = e[0];
		float eMinY = e[1];
		float eMaxX = e[2];
		float eMaxY = e[3];
		
		float newMinX = aabbMinX - eMinX;
		float newMinY = aabbMinY - eMinY;
		float newMaxX = aabbMaxX + eMaxX;
		float newMaxY = aabbMaxY + eMaxY;
		
		res.set(newMinX, newMinY, newMaxX, newMaxY);
		
		return res;
	}
	
	public static <T extends IAabb2WF> T expand(float[] aabb, float eMinX, float eMinY, float eMaxX, float eMaxY, @ExtractionParam T res)
	{
		float aabbMinX = aabb[0];
		float aabbMinY = aabb[1];
		float aabbMaxX = aabb[2];
		float aabbMaxY = aabb[3];
		
		float newMinX = aabbMinX - eMinX;
		float newMinY = aabbMinY - eMinY;
		float newMaxX = aabbMaxX + eMaxX;
		float newMaxY = aabbMaxY + eMaxY;
		
		res.set(newMinX, newMinY, newMaxX, newMaxY);
		
		return res;
	}
	
	public static <T extends IAabb2WF> T expand(IVec2RF aabbMin, IVec2RF aabbMax, float[] e, @ExtractionParam T res)
	{
		float aabbMinX = aabbMin.x();
		float aabbMinY = aabbMin.y();
		float aabbMaxX = aabbMax.x();
		float aabbMaxY = aabbMax.y();
		
		float eMinX = e[0];
		float eMinY = e[1];
		float eMaxX = e[2];
		float eMaxY = e[3];
		
		float newMinX = aabbMinX - eMinX;
		float newMinY = aabbMinY - eMinY;
		float newMaxX = aabbMaxX + eMaxX;
		float newMaxY = aabbMaxY + eMaxY;
		
		res.set(newMinX, newMinY, newMaxX, newMaxY);
		
		return res;
	}
	
	public static <T extends IAabb2WF> T expand(IVec2RF aabbMin, IVec2RF aabbMax, float eMinX, float eMinY, float eMaxX, float eMaxY, @ExtractionParam T res)
	{
		float aabbMinX = aabbMin.x();
		float aabbMinY = aabbMin.y();
		float aabbMaxX = aabbMax.x();
		float aabbMaxY = aabbMax.y();
		
		float newMinX = aabbMinX - eMinX;
		float newMinY = aabbMinY - eMinY;
		float newMaxX = aabbMaxX + eMaxX;
		float newMaxY = aabbMaxY + eMaxY;
		
		res.set(newMinX, newMinY, newMaxX, newMaxY);
		
		return res;
	}
	
	public static <T extends IAabb2WF> T expand(IVec2RF aabbMin, float[] aabbMax, float[] e, @ExtractionParam T res)
	{
		float aabbMinX = aabbMin.x();
		float aabbMinY = aabbMin.y();
		float aabbMaxX = aabbMax[0];
		float aabbMaxY = aabbMax[1];
		
		float eMinX = e[0];
		float eMinY = e[1];
		float eMaxX = e[2];
		float eMaxY = e[3];
		
		float newMinX = aabbMinX - eMinX;
		float newMinY = aabbMinY - eMinY;
		float newMaxX = aabbMaxX + eMaxX;
		float newMaxY = aabbMaxY + eMaxY;
		
		res.set(newMinX, newMinY, newMaxX, newMaxY);
		
		return res;
	}
	
	public static <T extends IAabb2WF> T expand(IVec2RF aabbMin, float[] aabbMax, float eMinX, float eMinY, float eMaxX, float eMaxY, @ExtractionParam T res)
	{
		float aabbMinX = aabbMin.x();
		float aabbMinY = aabbMin.y();
		float aabbMaxX = aabbMax[0];
		float aabbMaxY = aabbMax[1];
		
		float newMinX = aabbMinX - eMinX;
		float newMinY = aabbMinY - eMinY;
		float newMaxX = aabbMaxX + eMaxX;
		float newMaxY = aabbMaxY + eMaxY;
		
		res.set(newMinX, newMinY, newMaxX, newMaxY);
		
		return res;
	}
	
	public static <T extends IAabb2WF> T expand(IVec2RF aabbMin, float aabbMaxX, float aabbMaxY, float[] e, @ExtractionParam T res)
	{
		float aabbMinX = aabbMin.x();
		float aabbMinY = aabbMin.y();
		
		float eMinX = e[0];
		float eMinY = e[1];
		float eMaxX = e[2];
		float eMaxY = e[3];
		
		float newMinX = aabbMinX - eMinX;
		float newMinY = aabbMinY - eMinY;
		float newMaxX = aabbMaxX + eMaxX;
		float newMaxY = aabbMaxY + eMaxY;
		
		res.set(newMinX, newMinY, newMaxX, newMaxY);
		
		return res;
	}
	
	public static <T extends IAabb2WF> T expand(IVec2RF aabbMin, float aabbMaxX, float aabbMaxY, float eMinX, float eMinY, float eMaxX, float eMaxY, @ExtractionParam T res)
	{
		float aabbMinX = aabbMin.x();
		float aabbMinY = aabbMin.y();
		
		float newMinX = aabbMinX - eMinX;
		float newMinY = aabbMinY - eMinY;
		float newMaxX = aabbMaxX + eMaxX;
		float newMaxY = aabbMaxY + eMaxY;
		
		res.set(newMinX, newMinY, newMaxX, newMaxY);
		
		return res;
	}
	
	public static <T extends IAabb2WF> T expand(float[] aabbMin, IVec2RF aabbMax, float[] e, @ExtractionParam T res)
	{
		float aabbMinX = aabbMin[0];
		float aabbMinY = aabbMin[1];
		float aabbMaxX = aabbMax.x();
		float aabbMaxY = aabbMax.y();
		
		float eMinX = e[0];
		float eMinY = e[1];
		float eMaxX = e[2];
		float eMaxY = e[3];
		
		float newMinX = aabbMinX - eMinX;
		float newMinY = aabbMinY - eMinY;
		float newMaxX = aabbMaxX + eMaxX;
		float newMaxY = aabbMaxY + eMaxY;
		
		res.set(newMinX, newMinY, newMaxX, newMaxY);
		
		return res;
	}
	
	public static <T extends IAabb2WF> T expand(float[] aabbMin, IVec2RF aabbMax, float eMinX, float eMinY, float eMaxX, float eMaxY, @ExtractionParam T res)
	{
		float aabbMinX = aabbMin[0];
		float aabbMinY = aabbMin[1];
		float aabbMaxX = aabbMax.x();
		float aabbMaxY = aabbMax.y();
		
		float newMinX = aabbMinX - eMinX;
		float newMinY = aabbMinY - eMinY;
		float newMaxX = aabbMaxX + eMaxX;
		float newMaxY = aabbMaxY + eMaxY;
		
		res.set(newMinX, newMinY, newMaxX, newMaxY);
		
		return res;
	}
	
	public static <T extends IAabb2WF> T expand(float[] aabbMin, float[] aabbMax, float[] e, @ExtractionParam T res)
	{
		float aabbMinX = aabbMin[0];
		float aabbMinY = aabbMin[1];
		float aabbMaxX = aabbMax[0];
		float aabbMaxY = aabbMax[1];
		
		float eMinX = e[0];
		float eMinY = e[1];
		float eMaxX = e[2];
		float eMaxY = e[3];
		
		float newMinX = aabbMinX - eMinX;
		float newMinY = aabbMinY - eMinY;
		float newMaxX = aabbMaxX + eMaxX;
		float newMaxY = aabbMaxY + eMaxY;
		
		res.set(newMinX, newMinY, newMaxX, newMaxY);
		
		return res;
	}
	
	public static <T extends IAabb2WF> T expand(float[] aabbMin, float[] aabbMax, float eMinX, float eMinY, float eMaxX, float eMaxY, @ExtractionParam T res)
	{
		float aabbMinX = aabbMin[0];
		float aabbMinY = aabbMin[1];
		float aabbMaxX = aabbMax[0];
		float aabbMaxY = aabbMax[1];
		
		float newMinX = aabbMinX - eMinX;
		float newMinY = aabbMinY - eMinY;
		float newMaxX = aabbMaxX + eMaxX;
		float newMaxY = aabbMaxY + eMaxY;
		
		res.set(newMinX, newMinY, newMaxX, newMaxY);
		
		return res;
	}
	
	public static <T extends IAabb2WF> T expand(float[] aabbMin, float aabbMaxX, float aabbMaxY, float[] e, @ExtractionParam T res)
	{
		float aabbMinX = aabbMin[0];
		float aabbMinY = aabbMin[1];
		
		float eMinX = e[0];
		float eMinY = e[1];
		float eMaxX = e[2];
		float eMaxY = e[3];
		
		float newMinX = aabbMinX - eMinX;
		float newMinY = aabbMinY - eMinY;
		float newMaxX = aabbMaxX + eMaxX;
		float newMaxY = aabbMaxY + eMaxY;
		
		res.set(newMinX, newMinY, newMaxX, newMaxY);
		
		return res;
	}
	
	public static <T extends IAabb2WF> T expand(float[] aabbMin, float aabbMaxX, float aabbMaxY, float eMinX, float eMinY, float eMaxX, float eMaxY, @ExtractionParam T res)
	{
		float aabbMinX = aabbMin[0];
		float aabbMinY = aabbMin[1];
		
		float newMinX = aabbMinX - eMinX;
		float newMinY = aabbMinY - eMinY;
		float newMaxX = aabbMaxX + eMaxX;
		float newMaxY = aabbMaxY + eMaxY;
		
		res.set(newMinX, newMinY, newMaxX, newMaxY);
		
		return res;
	}
	
	public static <T extends IAabb2WF> T expand(float aabbMinX, float aabbMinY, IVec2RF aabbMax, float[] e, @ExtractionParam T res)
	{
		float aabbMaxX = aabbMax.x();
		float aabbMaxY = aabbMax.y();
		
		float eMinX = e[0];
		float eMinY = e[1];
		float eMaxX = e[2];
		float eMaxY = e[3];
		
		float newMinX = aabbMinX - eMinX;
		float newMinY = aabbMinY - eMinY;
		float newMaxX = aabbMaxX + eMaxX;
		float newMaxY = aabbMaxY + eMaxY;
		
		res.set(newMinX, newMinY, newMaxX, newMaxY);
		
		return res;
	}
	
	public static <T extends IAabb2WF> T expand(float aabbMinX, float aabbMinY, IVec2RF aabbMax, float eMinX, float eMinY, float eMaxX, float eMaxY, @ExtractionParam T res)
	{
		float aabbMaxX = aabbMax.x();
		float aabbMaxY = aabbMax.y();
		
		float newMinX = aabbMinX - eMinX;
		float newMinY = aabbMinY - eMinY;
		float newMaxX = aabbMaxX + eMaxX;
		float newMaxY = aabbMaxY + eMaxY;
		
		res.set(newMinX, newMinY, newMaxX, newMaxY);
		
		return res;
	}
	
	public static <T extends IAabb2WF> T expand(float aabbMinX, float aabbMinY, float[] aabbMax, float[] e, @ExtractionParam T res)
	{
		float aabbMaxX = aabbMax[0];
		float aabbMaxY = aabbMax[1];
		
		float eMinX = e[0];
		float eMinY = e[1];
		float eMaxX = e[2];
		float eMaxY = e[3];
		
		float newMinX = aabbMinX - eMinX;
		float newMinY = aabbMinY - eMinY;
		float newMaxX = aabbMaxX + eMaxX;
		float newMaxY = aabbMaxY + eMaxY;
		
		res.set(newMinX, newMinY, newMaxX, newMaxY);
		
		return res;
	}
	
	public static <T extends IAabb2WF> T expand(float aabbMinX, float aabbMinY, float[] aabbMax, float eMinX, float eMinY, float eMaxX, float eMaxY, @ExtractionParam T res)
	{
		float aabbMaxX = aabbMax[0];
		float aabbMaxY = aabbMax[1];
		
		float newMinX = aabbMinX - eMinX;
		float newMinY = aabbMinY - eMinY;
		float newMaxX = aabbMaxX + eMaxX;
		float newMaxY = aabbMaxY + eMaxY;
		
		res.set(newMinX, newMinY, newMaxX, newMaxY);
		
		return res;
	}
	
	public static <T extends IAabb2WF> T expand(float aabbMinX, float aabbMinY, float aabbMaxX, float aabbMaxY, float[] e, @ExtractionParam T res)
	{
		float eMinX = e[0];
		float eMinY = e[1];
		float eMaxX = e[2];
		float eMaxY = e[3];
		
		float newMinX = aabbMinX - eMinX;
		float newMinY = aabbMinY - eMinY;
		float newMaxX = aabbMaxX + eMaxX;
		float newMaxY = aabbMaxY + eMaxY;
		
		res.set(newMinX, newMinY, newMaxX, newMaxY);
		
		return res;
	}
	
	public static <T extends IAabb2WF> T expand(float aabbMinX, float aabbMinY, float aabbMaxX, float aabbMaxY, float eMinX, float eMinY, float eMaxX, float eMaxY, @ExtractionParam T res)
	{
		float newMinX = aabbMinX - eMinX;
		float newMinY = aabbMinY - eMinY;
		float newMaxX = aabbMaxX + eMaxX;
		float newMaxY = aabbMaxY + eMaxY;
		
		res.set(newMinX, newMinY, newMaxX, newMaxY);
		
		return res;
	}
	
	public static <T extends IAabb2WF> T expandAssign(@ExtractionParam T aabb, float[] e)
	{
		float aabbMinX = aabb.minX();
		float aabbMinY = aabb.minY();
		float aabbMaxX = aabb.maxX();
		float aabbMaxY = aabb.maxY();
		
		float eMinX = e[0];
		float eMinY = e[1];
		float eMaxX = e[2];
		float eMaxY = e[3];
		
		float newMinX = aabbMinX - eMinX;
		float newMinY = aabbMinY - eMinY;
		float newMaxX = aabbMaxX + eMaxX;
		float newMaxY = aabbMaxY + eMaxY;
		
		aabb.set(newMinX, newMinY, newMaxX, newMaxY);
		
		return aabb;
	}
	
	public static <T extends IAabb2WF> T expandAssign(@ExtractionParam T aabb, float eMinX, float eMinY, float eMaxX, float eMaxY)
	{
		float aabbMinX = aabb.minX();
		float aabbMinY = aabb.minY();
		float aabbMaxX = aabb.maxX();
		float aabbMaxY = aabb.maxY();
		
		float newMinX = aabbMinX - eMinX;
		float newMinY = aabbMinY - eMinY;
		float newMaxX = aabbMaxX + eMaxX;
		float newMaxY = aabbMaxY + eMaxY;
		
		aabb.set(newMinX, newMinY, newMaxX, newMaxY);
		
		return aabb;
	}
}
