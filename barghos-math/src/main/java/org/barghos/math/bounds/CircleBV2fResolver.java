package org.barghos.math.bounds;

import org.barghos.math.api.bounds.CircleBV2fR;
import org.barghos.math.api.vector.SimpleVec2fR;
import org.barghos.math.api.vector.Vec2fUtils;

public class CircleBV2fResolver
{
	public static boolean isPointInside(CircleBV2fR bv, SimpleVec2fR t, boolean withBorder)
	{
		return isPointInside(bv, t.getX(), t.getY(), withBorder);
	}
	
	public static boolean isPointInside(CircleBV2fR bv, float x, float y, boolean withBorder)
	{
		float squaredLength = Vec2fUtils.squaredDistanceTo(bv.getCenterX(), bv.getCenterY(), x, y);
		float squaredRadius = bv.getRadius() * bv.getRadius();
		
		if(withBorder)
		{
			if(squaredLength <= squaredRadius) return true;
		}
		else
		{
			if(squaredLength < squaredRadius) return true;
		}
		
		return false;
	}
	
	public boolean isPointOnSurface(CircleBV2fR bv, SimpleVec2fR t)
	{
		return isPointOnSurface(bv, t.getX(), t.getY());
	}
	
	public boolean isPointOnSurface(CircleBV2fR bv, float x, float y)
	{
		float squaredLength = Vec2fUtils.squaredDistanceTo(bv.getCenterX(), bv.getCenterY(), x, y);
		float squaredRadius = bv.getRadius() * bv.getRadius();
		
		if(squaredLength == squaredRadius) return true;
		
		return false;
	}
}
