package org.barghos.math.bounds;

import org.barghos.annotation.ExtractionParam;
import org.barghos.annotation.MinLength;
import org.barghos.math.api.vector.SimpleVec2fC;
import org.barghos.math.api.vector.SimpleVec2fR;

public interface CircleBV2fR
{
	CircleBV2fR createNew();
	
	default CircleBV2fR createNew(CircleBV2fR bv)
	{
		return createNew(bv.centerX(), bv.centerY(), bv.radius());
	}

	default CircleBV2fR createNew(SimpleVec2fR center, float radius)
	{
		return createNew(center.x(), center.y(), radius);
	}
	
	default CircleBV2fR createNew(@MinLength(2) float[] center, float radius)
	{
		return createNew(center[0], center[1], radius);
	}
	
	CircleBV2fR createNew(float centerX, float centerY, float radius);
	
	/**
	 * Creates a new instance of the current class with the same component values.
	 * 
	 * @return A new instance.
	 */
	CircleBV2fR copy();
	
	float centerX();
	
	float centerY();
	
	<T extends SimpleVec2fC> T getCenter(@ExtractionParam T res);
	
	float[] getCenter(@ExtractionParam @MinLength(2) float[] res);
	
	float radius();
}
