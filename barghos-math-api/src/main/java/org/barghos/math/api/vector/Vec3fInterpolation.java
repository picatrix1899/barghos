package org.barghos.math.api.vector;

import org.barghos.core.api.documentation.ExtractionParam;
import org.barghos.core.api.math.BarghosMath;
import org.barghos.core.api.tuple3.Tup3fC;
import org.barghos.core.api.tuple3.Tup3fR;

public class Vec3fInterpolation
{
	/**
	 * Performs a fast linear interpolation between the given tuple {@code (x1, y1, z1)} and the given tuple {@code (x2, y2, z2)}
	 * and saves the result in the result array.
	 * This sacrifices for reduced calculations the precision and the applicability.
	 * The interpolation happens over the interpolator value alpha in the range of 0.0 to 1.0.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (x1, y1, z1) + ( (x2, y2, z2) - (x1, y1, z1) ) * alpha}
	 * 
	 * @param x1 The value of the x component of the first vector.
	 * @param y1 The value of the y component of the first vector.
	 * @param z1 The value of the z component of the first vector.
	 * @param x2 The value of the x component of the second vector.
	 * @param y2 The value of the y component of the second vector.
	 * @param z2 The value of the z component of the second vector.
	 * @param alpha The interpolator in range of 0.0 to 1.0.
	 * @param res The result array.
	 * 
	 * @return The result array with the result.
	 */
	public static float[] fastLerp(float x1, float y1, float z1, float x2, float y2, float z2, float alpha, @ExtractionParam float[] res)
	{
		if(alpha == 0.0f)
		{
			res[0] = x1;
			res[1] = y1;
			res[2] = z1;
			
			return res;
		}
		
		if(alpha == 1.0f)
		{
			res[0] = x2;
			res[1] = y2;
			res[2] = z2;
			
			return res;
		}
		
		res[0] = x1 + alpha * (x2 - x1);
		res[1] = y1 + alpha * (y2 - y1);
		res[2] = z1 + alpha * (z2 - z1);
		
		return res;
	}
	
	/**
	 * Performs a linear interpolation between the two vectors (x1, y1, z1) and (x2, y2, z2).
	 * The interpolation happens over the interpolator value alpha in the range of 0.0 to 1.0
	 * where a value of 0.0 is exacly (x1, y1, z1) and a value of 1.0 is exactly (x2, y2, z2).
	 * The result is saved in the result array.
	 * 
	 * <p>
	 * Operation:
	 * (1.0 - alpha) * (x1, y1, z1) + alpha * (x2, y2, z2)
	 * 
	 * @param x1 The value of the x component of the first vector.
	 * @param y1 The value of the y component of the first vector.
	 * @param z1 The value of the z component of the first vector.
	 * @param x2 The value of the x component of the second vector.
	 * @param y2 The value of the y component of the second vector.
	 * @param z2 The value of the z component of the second vector.
	 * @param alpha The interpolator in range of 0.0 to 1.0.
	 * @param res The result array.
	 * 
	 * @return The result array with the result.
	 */
	public static float[] lerp(float x1, float y1, float z1, float x2, float y2, float z2, float alpha, @ExtractionParam float[] res)
	{
		if(alpha == 0.0f)
		{
			res[0] = x1;
			res[1] = y1;
			res[2] = z1;
			
			return res;
		}
		
		if(alpha == 1.0f)
		{
			res[0] = x2;
			res[1] = y2;
			res[2] = z2;
			
			return res;
		}
		
		float oneMinusAlpha = 1.0f - alpha;
		
		res[0] = oneMinusAlpha * x1 + alpha * x2;
		res[1] = oneMinusAlpha * y1 + alpha * y2;
		res[2] = oneMinusAlpha * z1 + alpha * z2;
		
		return res;
	}
	
	/**
	 * Performs a linear interpolation between the two vectors {@code (v1)} and {@code (v2)}.
	 * The interpolation happens over the interpolator value alpha in the range of 0.0 to 1.0
	 * where a value of 0.0 is exacly {@code (v1)} and a value of 1.0 is exactly {@code (v2)}.
	 * The result is saved in the result vector.
	 * 
	 * <p>
	 * Operation:<br>
	 * {@code (1.0 - alpha) * v1 + alpha * v2}
	 * 
	 * @param <T> The type of the result vector.
	 * 
	 * @param v1 The first vector.
	 * @param v2 The second vector.
	 * @param alpha The interpolator in range of 0.0 to 1.0.
	 * @param res The result vector.
	 * 
	 * @return The result vector with the result.
	 */
	public static <T extends Tup3fC> T lerp(Tup3fR v1, Tup3fR v2, float alpha, @ExtractionParam T res)
	{
		if(alpha == 0.0f)
		{
			res.set(v1);
			
			return res;
		}
		
		if(alpha == 1.0f)
		{
			res.set(v2);
			
			return res;
		}
		
		float oneMinusAlpha = 1.0f - alpha;

		res.set(oneMinusAlpha * v1.getX() + alpha * v2.getX(), oneMinusAlpha * v1.getY() + alpha * v2.getY(), oneMinusAlpha * v1.getZ() + alpha * v2.getZ());
		
		return res;
	}
	
	public static float[] lerpWeighted(float[] v, float[] weights, float alpha, @ExtractionParam float[] res)
	{
		if(alpha == 0.0f)
		{
			res[0] = v[0];
			res[1] = v[1];
			res[2] = v[2];
			
			return res;
		}
		
		if(alpha == 1.0f)
		{
			res[0] = v[v.length - 3];
			res[1] = v[v.length - 2];
			res[2] = v[v.length - 1];
			
			return res;
		}
		
		int endIndex = weights.length - 1;
		for(int i = 0; i < weights.length; i++)
		{
			if(alpha >= weights[i]) continue;
			
			endIndex = i;

			break;
		}
		
		int startIndex = endIndex - 1;
		
		float subAlpha = (alpha - weights[startIndex]) / (weights[endIndex] - weights[startIndex]);

		float oneMinusAlpha = 1.0f - subAlpha;
		
		res[0] = oneMinusAlpha * v[startIndex*3] + subAlpha * v[endIndex*3];
		res[1] = oneMinusAlpha * v[startIndex*3+1] + subAlpha * v[endIndex*3+1];
		res[2] = oneMinusAlpha * v[startIndex*3+2] + subAlpha * v[endIndex*3+2];
		
		return res;
	}
	
	public static float[] slerp(float x1, float y1, float z1, float x2, float y2, float z2, float alpha, @ExtractionParam float[] res)
	{
		if(alpha == 0.0f)
		{
			res[0] = x1;
			res[1] = y1;
			res[2] = z1;
			
			return res;
		}
		
		if(alpha == 1.0f)
		{
			res[0] = x2;
			res[1] = y2;
			res[2] = z2;
			
			return res;
		}
		
		// v1 X v2
		float perpX = y1 * z2 - z1 * y2;
		float perpY = z1 * x2 - x1 * z2;
		float perpZ = x1 * y2 - y1 * x2;

		// |v1| * |v2| = sqrt(|v1|^2 * |v2|^2)
		float lengthScaled = 1.0f / BarghosMath.sqrt((x1 * x1 + y1 * y1 + z1 * z1) * (x2 * x2 + y2 * y2 + z2 * z2));
		
		// |v1 X v2| = |v1| * |v2| * sin(angle)
		// v1 . v2 = |v1| * |v2| * cos(angle)
		// angle = atan2(|v1 X v2| / |v1| * |v2|, v1 . v2 / |v1| * |v2|)
		float angle = BarghosMath.atan2(BarghosMath.sqrt(perpX * perpX + perpY * perpY + perpZ * perpZ) * lengthScaled, (x1 * x2 + y1 * y2 + z1 * z2) * lengthScaled);
		
		float sinAngle = BarghosMath.sin(angle);
		float factorA = BarghosMath.sin(angle * (1.0f - alpha)) / sinAngle;
		float factorB = BarghosMath.sin(angle * alpha) / sinAngle;
		
		res[0] = factorA * x1 + factorB * x2;
		res[1] = factorA * y1 + factorB * y2;
		res[2] = factorA * z1 + factorB * z2;
		
		return res;
	}
	
	public static float[] slerpShortestPath(float x1, float y1, float z1, float x2, float y2, float z2, float alpha, @ExtractionParam float[] res)
	{
		if(alpha == 0.0f)
		{
			res[0] = x1;
			res[1] = y1;
			res[2] = z1;
			
			return res;
		}
		
		if(alpha == 1.0f)
		{
			res[0] = x2;
			res[1] = y2;
			res[2] = z2;
			
			return res;
		}

		float angle = BarghosMath.acos((x1 * x2 + y1 * y2 + z1 * z2) / BarghosMath.sqrt((x1 * x1 + y1 * y1 + z1 * z1) * (x2 * x2 + y2 * y2 + z2 * z2)));
		
		float sinAngle = BarghosMath.sin(angle);
		float factorA = BarghosMath.sin(angle * (1.0f - alpha)) / sinAngle;
		float factorB = BarghosMath.sin(angle * alpha) / sinAngle;
		
		res[0] = factorA * x1 + factorB * x2;
		res[1] = factorA * y1 + factorB * y2;
		res[2] = factorA * z1 + factorB * z2;
		
		return res;
	}
	
	public static float[] integrate(float x1, float y1, float z1, float x2, float y2, float z2, float alpha, @ExtractionParam float[] res)
	{
		// res = v1 + v2 * alpha
		res[0] = alpha * x2 + x1;
		res[1] = alpha * y2 + y1;
		res[2] = alpha * z2 + z1;
		
		return res;
	}
}
