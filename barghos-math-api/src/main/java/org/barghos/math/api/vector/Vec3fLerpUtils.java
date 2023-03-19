//package org.barghos.math.api.vector;
//
//import org.barghos.annotation.ExtractionParam;
//import org.barghos.annotation.MinLength;
//import org.barghos.tuple.api.t3.Tup3fC;
//import org.barghos.tuple.api.t3.Tup3fR;
//
///**
// * This class provides utilities for interpolations with 3-dimensional float vectors.
// */
//public class Vec3fLerpUtils
//{
//	
//	public static float[] lerpWeighted(float[] v, float[] weights, float alpha, @ExtractionParam float[] res)
//	{
//		if(alpha == 0.0f)
//		{
//			res[0] = v[0];
//			res[1] = v[1];
//			res[2] = v[2];
//			
//			return res;
//		}
//		
//		if(alpha == 1.0f)
//		{
//			res[0] = v[v.length - 3];
//			res[1] = v[v.length - 2];
//			res[2] = v[v.length - 1];
//			
//			return res;
//		}
//		
//		int endIndex = weights.length - 1;
//		for(int i = 0; i < weights.length; i++)
//		{
//			if(alpha >= weights[i]) continue;
//			
//			endIndex = i;
//
//			break;
//		}
//		
//		int startIndex = endIndex - 1;
//		
//		float subAlpha = (alpha - weights[startIndex]) / (weights[endIndex] - weights[startIndex]);
//
//		float oneMinusAlpha = 1.0f - subAlpha;
//		
//		res[0] = oneMinusAlpha * v[startIndex*3] + subAlpha * v[endIndex*3];
//		res[1] = oneMinusAlpha * v[startIndex*3+1] + subAlpha * v[endIndex*3+1];
//		res[2] = oneMinusAlpha * v[startIndex*3+2] + subAlpha * v[endIndex*3+2];
//		
//		return res;
//	}
	
//	public static float[] slerp(float x1, float y1, float z1, float x2, float y2, float z2, float alpha, @ExtractionParam float[] res)
//	{
//		if(alpha == 0.0f)
//		{
//			res[0] = x1;
//			res[1] = y1;
//			res[2] = z1;
//			
//			return res;
//		}
//		
//		if(alpha == 1.0f)
//		{
//			res[0] = x2;
//			res[1] = y2;
//			res[2] = z2;
//			
//			return res;
//		}
//		
//		// v1 X v2
//		float perpX = y1 * z2 - z1 * y2;
//		float perpY = z1 * x2 - x1 * z2;
//		float perpZ = x1 * y2 - y1 * x2;
//
//		// |v1| * |v2| = sqrt(|v1|^2 * |v2|^2)
//		float lengthScaled = 1.0f / BarghosMath.sqrt((x1 * x1 + y1 * y1 + z1 * z1) * (x2 * x2 + y2 * y2 + z2 * z2));
//		
//		// |v1 X v2| = |v1| * |v2| * sin(angle)
//		// v1 . v2 = |v1| * |v2| * cos(angle)
//		// angle = atan2(|v1 X v2| / |v1| * |v2|, v1 . v2 / |v1| * |v2|)
//		float angle = BarghosMath.atan2(BarghosMath.sqrt(perpX * perpX + perpY * perpY + perpZ * perpZ) * lengthScaled, (x1 * x2 + y1 * y2 + z1 * z2) * lengthScaled);
//		
//		float sinAngle = BarghosMath.sin(angle);
//		float factorA = BarghosMath.sin(angle * (1.0f - alpha)) / sinAngle;
//		float factorB = BarghosMath.sin(angle * alpha) / sinAngle;
//		
//		res[0] = factorA * x1 + factorB * x2;
//		res[1] = factorA * y1 + factorB * y2;
//		res[2] = factorA * z1 + factorB * z2;
//		
//		return res;
//	}
//	
//	public static float[] slerpShortestPath(float x1, float y1, float z1, float x2, float y2, float z2, float alpha, @ExtractionParam float[] res)
//	{
//		if(alpha == 0.0f)
//		{
//			res[0] = x1;
//			res[1] = y1;
//			res[2] = z1;
//			
//			return res;
//		}
//		
//		if(alpha == 1.0f)
//		{
//			res[0] = x2;
//			res[1] = y2;
//			res[2] = z2;
//			
//			return res;
//		}
//
//		float angle = BarghosMath.acos((x1 * x2 + y1 * y2 + z1 * z2) / BarghosMath.sqrt((x1 * x1 + y1 * y1 + z1 * z1) * (x2 * x2 + y2 * y2 + z2 * z2)));
//		
//		float sinAngle = BarghosMath.sin(angle);
//		float factorA = BarghosMath.sin(angle * (1.0f - alpha)) / sinAngle;
//		float factorB = BarghosMath.sin(angle * alpha) / sinAngle;
//		
//		res[0] = factorA * x1 + factorB * x2;
//		res[1] = factorA * y1 + factorB * y2;
//		res[2] = factorA * z1 + factorB * z2;
//		
//		return res;
//	}
//}
