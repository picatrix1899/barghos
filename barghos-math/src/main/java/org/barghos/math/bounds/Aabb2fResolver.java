package org.barghos.math.bounds;

import org.barghos.math.api.bounds.Aabb2fR;
import org.barghos.math.api.vector.SimpleVec2fR;

public class Aabb2fResolver
{
	public static boolean isPointInside(Aabb2fR aabb, SimpleVec2fR t, boolean withBorder)
	{
		return isPointInside(aabb, t.getX(), t.getY(), withBorder);
	}
	
	public static boolean isPointInside(Aabb2fR aabb, float x, float y, boolean withBorder)
	{
		if(withBorder)
		{
			if(aabb.getMaxX() <= x || x <= aabb.getMinX()) return false;
			if(aabb.getMaxY() <= y || y <= aabb.getMinY()) return false;
		}
		else
		{
			if(aabb.getMaxX() < x || x < aabb.getMinX()) return false;
			if(aabb.getMaxY() < y || y < aabb.getMinY()) return false;
		}
		
		return true;
	}
	
	public boolean isPointOnSurface(Aabb2fR aabb, SimpleVec2fR t)
	{
		return isPointOnSurface(aabb, t.getX(), t.getY());
	}
	
	public boolean isPointOnSurface(Aabb2fR aabb, float x, float y)
	{
		float[] min = aabb.getMin(new float[2]);
		float[] max = aabb.getMax(new float[2]);
		
		if(max[0] < x || x < min[0]) return false;
		if(max[1] < y || y < min[1]) return false;
		
		if(x == min[0] || x == max[0]) return true;
		if(y == min[1] || y == max[1]) return true;
		
		return false;
	}
}
