package org.barghos.math.bounds;

import org.barghos.annotation.ExtractionParam;
import org.barghos.annotation.MinLength;
import org.barghos.core.tuple.Tup2fC;
import org.barghos.core.tuple.Tup2fR;
import org.barghos.math.vector.Vec2fUtils;

public interface Aabb2fR
{
	Aabb2fR createNew();
	
	default Aabb2fR createNew(Aabb2fR aabb)
	{
		return createNew(aabb.minX(), aabb.minY(), aabb.maxX(), aabb.maxY());
	}
	
	default Aabb2fR createNew(Tup2fR min, Tup2fR max)
	{
		return createNew(min.v0(), min.v1(), max.v0(), max.v1());
	}
	
	default Aabb2fR createNew(Tup2fR min, @MinLength(2) float[] max)
	{
		return createNew(min.v0(), min.v1(), max[0], max[1]);
	}
	
	default Aabb2fR createNew(Tup2fR min, float maxX, float maxY)
	{
		return createNew(min.v0(), min.v1(), maxX, maxY);
	}
	
	default Aabb2fR createNew(@MinLength(2) float[] min, Tup2fR max)
	{
		return createNew(min[0], min[1], max.v0(), max.v1());
	}
	
	default Aabb2fR createNew(@MinLength(2) float[] min, @MinLength(2) float[] max)
	{
		return createNew(min[0], min[1], max[0], max[1]);
	}
	
	default Aabb2fR createNew(@MinLength(2) float[] min, float maxX, float maxY)
	{
		return createNew(min[0], min[1], maxX, maxY);
	}
	
	default Aabb2fR createNew(float minX, float minY, Tup2fR max)
	{
		return createNew(minX, minY, max.v0(), max.v1());
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
	
	float minX();
	float minY();
	
	<T extends Tup2fC> T getMin(@ExtractionParam T res);
	float[] getMin(@ExtractionParam @MinLength(2) float[] res);
	
	float maxX();
	float maxY();
	
	<T extends Tup2fC> T getMax(@ExtractionParam T res);
	float[] getMax(@ExtractionParam @MinLength(2) float[] res);
	
	float sizeX();
	float sizeY();
	
	<T extends Tup2fC> T size(@ExtractionParam T res);
	float[] size(@ExtractionParam @MinLength(2) float[] res);
	
	float centerX();
	float centerY();
	
	<T extends Tup2fC> T center(@ExtractionParam T res);
	float[] center(@ExtractionParam @MinLength(2) float[] res);
	
	default Aabb2fR scaleN(Tup2fR t)
	{
		return scaleN(t.v0(), t.v1());
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
		return createNew(minX() * x,  minY() * y, maxX() * x, maxY() * y);
	}
	
	default Aabb2fR mergeN(Aabb2fR aabb)
	{
		return mergeN(aabb.minX(), aabb.minY(), aabb.maxX(), aabb.maxY());
	}
	
	default Aabb2fR mergeN(Tup2fR min, Tup2fR max)
	{
		return mergeN(min.v0(), min.v1(), max.v0(), max.v1());
	}
	
	default Aabb2fR mergeN(Tup2fR min, @MinLength(2) float[] max)
	{
		return mergeN(min.v0(), min.v1(), max[0], max[1]);
	}
	
	default Aabb2fR mergeN(Tup2fR min, float maxX, float maxY)
	{
		return mergeN(min.v0(), min.v1(), maxX, maxY);
	}
	
	default Aabb2fR mergeN(@MinLength(2) float[] min, Tup2fR max)
	{
		return mergeN(min[0], min[1], max.v0(), max.v1());
	}
	
	default Aabb2fR mergeN(@MinLength(2) float[] min, @MinLength(2) float[] max)
	{
		return mergeN(min[0], min[1], max[0], max[1]);
	}
	
	default Aabb2fR mergeN(@MinLength(2) float[] min, float maxX, float maxY)
	{
		return mergeN(min[0], min[1], maxX, maxY);
	}
	
	default Aabb2fR mergeN(float minX, float minY, Tup2fR max)
	{
		return mergeN(minX, minY, max.v0(), max.v1());
	}
	
	default Aabb2fR mergeN(float minX, float minY, @MinLength(2) float[] max)
	{
		return mergeN(minX, minY, max[0], max[1]);
	}
	
	default Aabb2fR mergeN(float minX, float minY, float maxX, float maxY)
	{
		float[] newMin = Vec2fUtils.minVector(minX(), minY(), Math.min(minX, maxX),  Math.min(minY, maxY), new float[2]);
		float[] newMax = Vec2fUtils.maxVector(maxX(), maxY(), Math.max(minX, maxX),  Math.max(minY, maxY), new float[2]);
		
		return createNew(newMin[0], newMin[1], newMax[0], newMax[1]);
	}
	
	default <T extends Aabb2fC> T scaleR(Tup2fR t, @ExtractionParam T res)
	{
		return scaleR(t.v0(), t.v1(), res);
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
		res.set(minX() * x,  minY() * y, maxX() * x, maxY() * y);
		
		return res;
	}
	
	default <T extends Aabb2fC> T mergeR(Aabb2fR aabb, @ExtractionParam T res)
	{
		return mergeR(aabb.minX(), aabb.minY(), aabb.maxX(), aabb.maxY(), res);
	}
	
	default <T extends Aabb2fC> T mergeR(Tup2fR min, Tup2fR max, @ExtractionParam T res)
	{
		return mergeR(min.v0(), min.v1(), max.v0(), max.v1(), res);
	}
	
	default <T extends Aabb2fC> T mergeR(Tup2fR min, @MinLength(2) float[] max, @ExtractionParam T res)
	{
		return mergeR(min.v0(), min.v1(), max[0], max[1], res);
	}
	
	default <T extends Aabb2fC> T mergeR(Tup2fR min, float maxX, float maxY, @ExtractionParam T res)
	{
		return mergeR(min.v0(), min.v1(), maxX, maxY, res);
	}
	
	default <T extends Aabb2fC> T mergeR(@MinLength(2) float[] min, Tup2fR max, @ExtractionParam T res)
	{
		return mergeR(min[0], min[1], max.v0(), max.v1(), res);
	}
	
	default <T extends Aabb2fC> T mergeR(@MinLength(2) float[] min, @MinLength(2) float[] max, @ExtractionParam T res)
	{
		return mergeR(min[0], min[1], max[0], max[1], res);
	}
	
	default <T extends Aabb2fC> T mergeR(@MinLength(2) float[] min, float maxX, float maxY, @ExtractionParam T res)
	{
		return mergeR(min[0], min[1], maxX, maxY, res);
	}
	
	default <T extends Aabb2fC> T mergeR(float minX, float minY, Tup2fR max, @ExtractionParam T res)
	{
		return mergeR(minX, minY, max.v0(), max.v1(), res);
	}
	
	default <T extends Aabb2fC> T mergeR(float minX, float minY, @MinLength(2) float[] max, @ExtractionParam T res)
	{
		return mergeR(minX, minY, max[0], max[1], res);
	}
	
	default <T extends Aabb2fC> T mergeR(float minX, float minY, float maxX, float maxY, @ExtractionParam T res)
	{
		float[] newMin = Vec2fUtils.minVector(minX(), minY(), Math.min(minX, maxX),  Math.min(minY, maxY), new float[2]);
		float[] newMax = Vec2fUtils.maxVector(maxX(), maxY(), Math.max(minX, maxX),  Math.max(minY, maxY), new float[2]);
		
		res.set(newMin, newMax);
		
		return res;
	}
}
