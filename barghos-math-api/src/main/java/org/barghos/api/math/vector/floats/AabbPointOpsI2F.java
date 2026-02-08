package org.barghos.api.math.vector.floats;

import org.barghos.api.math.bounds.IAabb2RF;

public class AabbPointOpsI2F
{
	public static boolean contains(IAabb2RF aabb1, IVec2RF point1)
	{
		float point1X = point1.x();
		float point1Y = point1.y();
		
		return aabb1.minX() < point1X && point1X < aabb1.maxX() &&
			   aabb1.minY() < point1Y && point1Y < aabb1.maxY();
	}
	
	public static boolean contains(IAabb2RF aabb1, float point1X, float point1Y)
	{
		return aabb1.minX() < point1X && point1X < aabb1.maxX() &&
			   aabb1.minY() < point1Y && point1Y < aabb1.maxY();
	}
	
	public static boolean containsWithExtremes(IAabb2RF aabb1, IVec2RF point1)
	{
		float point1X = point1.x();
		float point1Y = point1.y();
		
		return aabb1.minX() <= point1X && point1X <= aabb1.maxX() &&
			   aabb1.minY() <= point1Y && point1Y <= aabb1.maxY();
	}
	
	public static boolean containsWithExtremes(IAabb2RF aabb1, float point1X, float point1Y)
	{
		return aabb1.minX() <= point1X && point1X <= aabb1.maxX() &&
			   aabb1.minY() <= point1Y && point1Y <= aabb1.maxY();
	}
}
