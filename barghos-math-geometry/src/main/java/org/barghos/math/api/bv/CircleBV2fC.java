package org.barghos.math.api.bv;

import org.barghos.annotation.MinLength;
import org.barghos.math.api.vector.SimpleVec2fR;

public interface CircleBV2fC extends CircleBV2fR
{
	CircleBV2fC createNew();
	
	default CircleBV2fC createNew(CircleBV2fR bv)
	{
		return createNew(bv.centerX(), bv.centerY(), bv.radius());
	}

	default CircleBV2fC createNew(SimpleVec2fR center, float radius)
	{
		return createNew(center.x(), center.y(), radius);
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
		return set(bv.centerX(), bv.centerY(), bv.radius());
	}
	
	default CircleBV2fC set(SimpleVec2fR center, float radius)
	{
		return set(center.x(), center.y(), radius);
	}
	
	default CircleBV2fC set(@MinLength(2) float[] center, float radius)
	{
		return set(center[0], center[1], radius);
	}
	
	default CircleBV2fC set(float centerX, float centerY, float radius)
	{
		setCenter(centerX, centerY);
		radius(radius);
		
		return this;
	}
	
	default CircleBV2fC setCenter(SimpleVec2fR v)
	{
		return setCenter(v.x(), v.y());
	}
	
	default CircleBV2fC setCenter(@MinLength(2) float[] v)
	{
		return setCenter(v[0], v[1]);
	}
	
	default CircleBV2fC setCenter(float x, float y)
	{
		centerX(x);
		centerY(y);
		
		return this;
	}
	
	CircleBV2fC centerX(float x);
	CircleBV2fC centerY(float y);
	
	CircleBV2fC radius(float radius);
}
