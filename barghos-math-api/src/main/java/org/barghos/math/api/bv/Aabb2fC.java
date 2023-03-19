package org.barghos.math.api.bv;

import org.barghos.annotation.MinLength;
import org.barghos.math.api.vector.Vec2fUtils;
import org.barghos.tuple.api.t2.Tup2fR;

public interface Aabb2fC extends Aabb2fR
{
	Aabb2fC createNew();
	
	default Aabb2fC createNew(Aabb2fR aabb)
	{
		return createNew(aabb.getMinX(), aabb.getMinY(), aabb.getMaxX(), aabb.getMaxY());
	}
	
	default Aabb2fC createNew(Tup2fR min, Tup2fR max)
	{
		return createNew(min.getV0(), min.getV1(), max.getV0(), max.getV1());
	}
	
	default Aabb2fC createNew(Tup2fR min, @MinLength(2) float[] max)
	{
		return createNew(min.getV0(), min.getV1(), max[0], max[1]);
	}
	
	default Aabb2fC createNew(Tup2fR min, float maxX, float maxY)
	{
		return createNew(min.getV0(), min.getV1(), maxX, maxY);
	}
	
	default Aabb2fC createNew(@MinLength(2) float[] min, Tup2fR max)
	{
		return createNew(min[0], min[1], max.getV0(), max.getV1());
	}
	
	default Aabb2fC createNew(@MinLength(2) float[] min, @MinLength(2) float[] max)
	{
		return createNew(min[0], min[1], max[0], max[1]);
	}
	
	default Aabb2fC createNew(@MinLength(2) float[] min, float maxX, float maxY)
	{
		return createNew(min[0], min[1], maxX, maxY);
	}
	
	default Aabb2fC createNew(float minX, float minY, Tup2fR max)
	{
		return createNew(minX, minY, max.getV0(), max.getV1());
	}
	
	default Aabb2fC createNew(float minX, float minY, @MinLength(2) float[] max)
	{
		return createNew(minX, minY, max[0], max[1]);
	}
	
	Aabb2fC createNew(float minX, float minY, float maxX, float maxY);
	
	/**
	 * Creates a new instance of the current class with the same component values.
	 * 
	 * @return A new instance.
	 */
	Aabb2fC copy();
	
	default Aabb2fC set(Aabb2fR aabb)
	{
		return set(aabb.getMinX(), aabb.getMinY(), aabb.getMaxX(), aabb.getMaxY());
	}
	
	default Aabb2fC set(Tup2fR min, Tup2fR max)
	{
		return set(min.getV0(), min.getV1(), max.getV0(), max.getV1());
	}
	
	default Aabb2fC set(Tup2fR min, @MinLength(2) float[] max)
	{
		return set(min.getV0(), min.getV1(), max[0], max[1]);
	}
	
	default Aabb2fC set(Tup2fR min, float maxX, float maxY)
	{
		return set(min.getV0(), min.getV1(), maxX, maxY);
	}
	
	default Aabb2fC set(@MinLength(2) float[] min, Tup2fR max)
	{
		return set(min[0], min[1], max.getV0(), max.getV1());
	}
	
	default Aabb2fC set(@MinLength(2) float[] min, @MinLength(2) float[] max)
	{
		return set(min[0], min[1], max[0], max[1]);
	}
	
	default Aabb2fC set(@MinLength(2) float[] min, float maxX, float maxY)
	{
		return set(min[0], min[1], maxX, maxY);
	}
	
	default Aabb2fC set(float minX, float minY, Tup2fR max)
	{
		return set(minX, minY, max.getV0(), max.getV1());
	}
	
	default Aabb2fC set(float minX, float minY, @MinLength(2) float[] max)
	{
		return set(minX, minY, max[0], max[1]);
	}
	
	Aabb2fC set(float minX, float minY, float maxX, float maxY);
	
	default Aabb2fC scale(Tup2fR t)
	{
		return scale(t.getV0(), t.getV1());
	}
	
	default Aabb2fC scale(@MinLength(2) float[] v)
	{
		return scale(v[0], v[1]);
	}
	
	default Aabb2fC scale(float value)
	{
		return scale(value, value);
	}
	
	default Aabb2fC scale(float x, float y)
	{
		set(getMinX() * x,  getMinY() * y, getMaxX() * x, getMaxY() * y);
		
		return this;
	}
	
	default Aabb2fC scaleN(Tup2fR t)
	{
		return scaleN(t.getV0(), t.getV1());
	}
	
	default Aabb2fC scaleN(@MinLength(2) float[] v)
	{
		return scaleN(v[0], v[1]);
	}
	
	default Aabb2fC scaleN(float value)
	{
		return scaleN(value, value);
	}
	
	default Aabb2fC scaleN(float x, float y)
	{
		return createNew(getMinX() * x,  getMinY() * y, getMaxX() * x, getMaxY() * y);
	}
	
	default Aabb2fC merge(Aabb2fR aabb)
	{
		return merge(aabb.getMinX(), aabb.getMinY(), aabb.getMaxX(), aabb.getMaxY());
	}
	
	default Aabb2fC merge(Tup2fR min, Tup2fR max)
	{
		return merge(min.getV0(), min.getV1(), max.getV0(), max.getV1());
	}
	
	default Aabb2fC merge(Tup2fR min, @MinLength(2) float[] max)
	{
		return merge(min.getV0(), min.getV1(), max[0], max[1]);
	}
	
	default Aabb2fC merge(Tup2fR min, float maxX, float maxY)
	{
		return merge(min.getV0(), min.getV1(), maxX, maxY);
	}
	
	default Aabb2fC merge(@MinLength(2) float[] min, Tup2fR max)
	{
		return merge(min[0], min[1], max.getV0(), max.getV1());
	}
	
	default Aabb2fC merge(@MinLength(2) float[] min, @MinLength(2) float[] max)
	{
		return merge(min[0], min[1], max[0], max[1]);
	}
	
	default Aabb2fC merge(@MinLength(2) float[] min, float maxX, float maxY)
	{
		return merge(min[0], min[1], maxX, maxY);
	}
	
	default Aabb2fC merge(float minX, float minY, Tup2fR max)
	{
		return merge(minX, minY, max.getV0(), max.getV1());
	}
	
	default Aabb2fC merge(float minX, float minY, @MinLength(2) float[] max)
	{
		return merge(minX, minY, max[0], max[1]);
	}
	
	default Aabb2fC merge(float minX, float minY, float maxX, float maxY)
	{
		float[] newMin = Vec2fUtils.minVector(getMinX(), getMaxY(), Math.min(minX, maxX),  Math.min(minY, maxY), new float[2]);
		float[] newMax = Vec2fUtils.maxVector(getMaxX(), getMaxY(), Math.max(minX, maxX),  Math.max(minY, maxY), new float[2]);
		
		set(newMin, newMax);
		
		return this;
	}
	
	default Aabb2fC mergeN(Aabb2fR aabb)
	{
		return mergeN(aabb.getMinX(), aabb.getMinY(), aabb.getMaxX(), aabb.getMaxY());
	}
	
	default Aabb2fC mergeN(Tup2fR min, Tup2fR max)
	{
		return mergeN(min.getV0(), min.getV1(), max.getV0(), max.getV1());
	}
	
	default Aabb2fC mergeN(Tup2fR min, @MinLength(2) float[] max)
	{
		return mergeN(min.getV0(), min.getV1(), max[0], max[1]);
	}
	
	default Aabb2fC mergeN(Tup2fR min, float maxX, float maxY)
	{
		return mergeN(min.getV0(), min.getV1(), maxX, maxY);
	}
	
	default Aabb2fC mergeN(@MinLength(2) float[] min, Tup2fR max)
	{
		return mergeN(min[0], min[1], max.getV0(), max.getV1());
	}
	
	default Aabb2fC mergeN(@MinLength(2) float[] min, @MinLength(2) float[] max)
	{
		return mergeN(min[0], min[1], max[0], max[1]);
	}
	
	default Aabb2fC mergeN(@MinLength(2) float[] min, float maxX, float maxY)
	{
		return mergeN(min[0], min[1], maxX, maxY);
	}
	
	default Aabb2fC mergeN(float minX, float minY, Tup2fR max)
	{
		return mergeN(minX, minY, max.getV0(), max.getV1());
	}
	
	default Aabb2fC mergeN(float minX, float minY, @MinLength(2) float[] max)
	{
		return mergeN(minX, minY, max[0], max[1]);
	}
	
	default Aabb2fC mergeN(float minX, float minY, float maxX, float maxY)
	{
		float[] newMin = Vec2fUtils.minVector(getMinX(), getMaxY(), Math.min(minX, maxX),  Math.min(minY, maxY), new float[2]);
		float[] newMax = Vec2fUtils.maxVector(getMaxX(), getMaxY(), Math.max(minX, maxX),  Math.max(minY, maxY), new float[2]);
		
		return createNew(newMin[0], newMin[1], newMax[0], newMax[1]);
	}
}
