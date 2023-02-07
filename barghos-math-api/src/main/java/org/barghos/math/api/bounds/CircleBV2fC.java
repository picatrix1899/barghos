package org.barghos.math.api.bounds;

import org.barghos.documentation.MinLength;
import org.barghos.math.api.vector.SimpleVec2fR;

public interface CircleBV2fC extends CircleBV2fR
{
	CircleBV2fC createNew();
	
	default CircleBV2fC createNew(CircleBV2fR bv)
	{
		return createNew(bv.getCenterX(), bv.getCenterY(), bv.getRadius());
	}

	default CircleBV2fC createNew(SimpleVec2fR center, float radius)
	{
		return createNew(center.getX(), center.getY(), radius);
	}
	
	default CircleBV2fC createNew(@MinLength(2) float[] center, float radius)
	{
		return createNew(center[0], center[1], radius);
	}
	
	CircleBV2fC createNew(float centerX, float centerY, float radius);
	
	/**
	 * Creates a new instance of the current class with the same component values.
	 * 
	 * @return A new instance.
	 */
	CircleBV2fC copy();
	
	default CircleBV2fC set(CircleBV2fR bv)
	{
		return set(bv.getCenterX(), bv.getCenterY(), bv.getRadius());
	}
	
	default CircleBV2fC set(SimpleVec2fR center, float radius)
	{
		return set(center.getX(), center.getY(), radius);
	}
	
	default CircleBV2fC set(float[] center, float radius)
	{
		return set(center[0], center[1], radius);
	}
	
	default CircleBV2fC set(float centerX, float centerY, float radius)
	{
		setCenter(centerX, centerY);
		setRadius(radius);
		
		return this;
	}
	
	default CircleBV2fC setCenter(SimpleVec2fR v)
	{
		return setCenter(v.getX(), v.getY());
	}
	
	default CircleBV2fC setCenter(float[] v)
	{
		return setCenter(v[0], v[1]);
	}
	
	CircleBV2fC setCenter(float x, float y);
	
	CircleBV2fC setRadius(float radius);
}
