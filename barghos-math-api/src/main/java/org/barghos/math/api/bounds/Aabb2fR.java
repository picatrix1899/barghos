package org.barghos.math.api.bounds;

import org.barghos.annotation.ExtractionParam;
import org.barghos.annotation.MinLength;
import org.barghos.math.api.vector.SimpleVec2fC;
import org.barghos.math.api.vector.SimpleVec2fR;
import org.barghos.math.api.vector.Vec2fUtils;

public interface Aabb2fR
{
	Aabb2fR createNew();
	
	default Aabb2fR createNew(Aabb2fR aabb)
	{
		return createNew(aabb.getMinX(), aabb.getMinY(), aabb.getMaxX(), aabb.getMaxY());
	}
	
	default Aabb2fR createNew(SimpleVec2fR min, SimpleVec2fR max)
	{
		return createNew(min.getX(), min.getY(), max.getX(), max.getY());
	}
	
	default Aabb2fR createNew(SimpleVec2fR min, @MinLength(2) float[] max)
	{
		return createNew(min.getX(), min.getY(), max[0], max[1]);
	}
	
	default Aabb2fR createNew(SimpleVec2fR min, float maxX, float maxY)
	{
		return createNew(min.getX(), min.getY(), maxX, maxY);
	}
	
	default Aabb2fR createNew(@MinLength(2) float[] min, SimpleVec2fR max)
	{
		return createNew(min[0], min[1], max.getX(), max.getY());
	}
	
	default Aabb2fR createNew(@MinLength(2) float[] min, @MinLength(2) float[] max)
	{
		return createNew(min[0], min[1], max[0], max[1]);
	}
	
	default Aabb2fR createNew(@MinLength(2) float[] min, float maxX, float maxY)
	{
		return createNew(min[0], min[1], maxX, maxY);
	}
	
	default Aabb2fR createNew(float minX, float minY, SimpleVec2fR max)
	{
		return createNew(minX, minY, max.getX(), max.getY());
	}
	
	default Aabb2fR createNew(float minX, float minY, @MinLength(2) float[] max)
	{
		return createNew(minX, minY, max[0], max[1]);
	}
	
	Aabb2fR createNew(float minX, float minY, float maxX, float maxY);
	
	/**
	 * Creates a new instance of the current class with the same component values.
	 * 
	 * @return A new instance.
	 */
	Aabb2fR copy();
	
	float getMinX();
	float getMinY();
	
	<T extends SimpleVec2fC> T getMin(@ExtractionParam T res);
	float[] getMin(@ExtractionParam @MinLength(2) float[] res);
	
	float getMaxX();
	float getMaxY();
	
	<T extends SimpleVec2fC> T getMax(@ExtractionParam T res);
	float[] getMax(@ExtractionParam @MinLength(2) float[] res);
	
	float getSizeX();
	float getSizeY();
	
	<T extends SimpleVec2fC> T getSize(@ExtractionParam T res);
	float[] getSize(@ExtractionParam @MinLength(2) float[] res);
	
	float getCenterX();
	float getCenterY();
	
	<T extends SimpleVec2fC> T getCenter(@ExtractionParam T res);
	float[] getCenter(@ExtractionParam @MinLength(2) float[] res);
	
	default Aabb2fR scaleN(SimpleVec2fR t)
	{
		return scaleN(t.getX(), t.getY());
	}
	
	default Aabb2fR scaleN(@MinLength(2) float[] v)
	{
		return scaleN(v[0], v[1]);
	}
	
	default Aabb2fR scaleN(float value)
	{
		return scaleN(value, value);
	}
	
	default Aabb2fR scaleN(float x, float y)
	{
		return createNew(getMinX() * x,  getMinY() * y, getMaxX() * x, getMaxY() * y);
	}
	
	default <T extends Aabb2fC> T scaleR(SimpleVec2fR t, @ExtractionParam T res)
	{
		return scaleR(t.getX(), t.getY(), res);
	}
	
	default <T extends Aabb2fC> T scaleR(@MinLength(2) float[] v, @ExtractionParam T res)
	{
		return scaleR(v[0], v[1], res);
	}
	
	default <T extends Aabb2fC> T scaleR(float value, @ExtractionParam T res)
	{
		return scaleR(value, value, res);
	}
	
	default <T extends Aabb2fC> T scaleR(float x, float y, @ExtractionParam T res)
	{
		res.set(getMinX() * x,  getMinY() * y, getMaxX() * x, getMaxY() * y);
		
		return res;
	}
	
	default Aabb2fR mergeN(Aabb2fR aabb)
	{
		return mergeN(aabb.getMinX(), aabb.getMinY(), aabb.getMaxX(), aabb.getMaxY());
	}
	
	default Aabb2fR mergeN(SimpleVec2fR min, SimpleVec2fR max)
	{
		return mergeN(min.getX(), min.getY(), max.getX(), max.getY());
	}
	
	default Aabb2fR mergeN(SimpleVec2fR min, @MinLength(2) float[] max)
	{
		return mergeN(min.getX(), min.getY(), max[0], max[1]);
	}
	
	default Aabb2fR mergeN(SimpleVec2fR min, float maxX, float maxY)
	{
		return mergeN(min.getX(), min.getY(), maxX, maxY);
	}
	
	default Aabb2fR mergeN(@MinLength(2) float[] min, SimpleVec2fR max)
	{
		return mergeN(min[0], min[1], max.getX(), max.getY());
	}
	
	default Aabb2fR mergeN(@MinLength(2) float[] min, @MinLength(2) float[] max)
	{
		return mergeN(min[0], min[1], max[0], max[1]);
	}
	
	default Aabb2fR mergeN(@MinLength(2) float[] min, float maxX, float maxY)
	{
		return mergeN(min[0], min[1], maxX, maxY);
	}
	
	default Aabb2fR mergeN(float minX, float minY, SimpleVec2fR max)
	{
		return mergeN(minX, minY, max.getX(), max.getY());
	}
	
	default Aabb2fR mergeN(float minX, float minY, @MinLength(2) float[] max)
	{
		return mergeN(minX, minY, max[0], max[1]);
	}
	
	default Aabb2fR mergeN(float minX, float minY, float maxX, float maxY)
	{
		float[] newMin = Vec2fUtils.minVector(getMinX(), getMaxY(), Math.min(minX, maxX),  Math.min(minY, maxY), new float[2]);
		float[] newMax = Vec2fUtils.maxVector(getMaxX(), getMaxY(), Math.max(minX, maxX),  Math.max(minY, maxY), new float[2]);
		
		return createNew(newMin[0], newMin[1], newMax[0], newMax[1]);
	}
	
	default <T extends Aabb2fC> T mergeR(Aabb2fR aabb, @ExtractionParam T res)
	{
		return mergeR(aabb.getMinX(), aabb.getMinY(), aabb.getMaxX(), aabb.getMaxY(), res);
	}
	
	default <T extends Aabb2fC> T mergeR(SimpleVec2fR min, SimpleVec2fR max, @ExtractionParam T res)
	{
		return mergeR(min.getX(), min.getY(), max.getX(), max.getY(), res);
	}
	
	default <T extends Aabb2fC> T mergeR(SimpleVec2fR min, @MinLength(2) float[] max, @ExtractionParam T res)
	{
		return mergeR(min.getX(), min.getY(), max[0], max[1], res);
	}
	
	default <T extends Aabb2fC> T mergeR(SimpleVec2fR min, float maxX, float maxY, @ExtractionParam T res)
	{
		return mergeR(min.getX(), min.getY(), maxX, maxY, res);
	}
	
	default <T extends Aabb2fC> T mergeR(@MinLength(2) float[] min, SimpleVec2fR max, @ExtractionParam T res)
	{
		return mergeR(min[0], min[1], max.getX(), max.getY(), res);
	}
	
	default <T extends Aabb2fC> T mergeR(@MinLength(2) float[] min, @MinLength(2) float[] max, @ExtractionParam T res)
	{
		return mergeR(min[0], min[1], max[0], max[1], res);
	}
	
	default <T extends Aabb2fC> T mergeR(@MinLength(2) float[] min, float maxX, float maxY, @ExtractionParam T res)
	{
		return mergeR(min[0], min[1], maxX, maxY, res);
	}
	
	default <T extends Aabb2fC> T mergeR(float minX, float minY, SimpleVec2fR max, @ExtractionParam T res)
	{
		return mergeR(minX, minY, max.getX(), max.getY(), res);
	}
	
	default <T extends Aabb2fC> T mergeR(float minX, float minY, @MinLength(2) float[] max, @ExtractionParam T res)
	{
		return mergeR(minX, minY, max[0], max[1], res);
	}
	
	default <T extends Aabb2fC> T mergeR(float minX, float minY, float maxX, float maxY, @ExtractionParam T res)
	{
		float[] newMin = Vec2fUtils.minVector(getMinX(), getMaxY(), Math.min(minX, maxX),  Math.min(minY, maxY), new float[2]);
		float[] newMax = Vec2fUtils.maxVector(getMaxX(), getMaxY(), Math.max(minX, maxX),  Math.max(minY, maxY), new float[2]);
		
		res.set(newMin, newMax);
		
		return res;
	}
}
