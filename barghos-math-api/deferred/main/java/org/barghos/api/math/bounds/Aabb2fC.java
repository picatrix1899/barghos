//package org.barghos.math.bounds;
//
//import org.barghos.annotation.MinLength;
//import org.barghos.core.tuple.Tup2fR;
//import org.barghos.core.tuple.Tup3fR;
//import org.barghos.math.vector.Vec2fUtils;
//
//public interface Aabb2fC extends Aabb2fR
//{
//	Aabb2fC createNew();
//	
//	default Aabb2fC createNew(Aabb2fR aabb)
//	{
//		return createNew(aabb.minX(), aabb.minY(), aabb.maxX(), aabb.maxY());
//	}
//	
//	default Aabb2fC createNew(Tup2fR min, Tup2fR max)
//	{
//		return createNew(min.v0(), min.v1(), max.v0(), max.v1());
//	}
//	
//	default Aabb2fC createNew(Tup2fR min, @MinLength(2) float[] max)
//	{
//		return createNew(min.v0(), min.v1(), max[0], max[1]);
//	}
//	
//	default Aabb2fC createNew(Tup2fR min, float maxX, float maxY)
//	{
//		return createNew(min.v0(), min.v1(), maxX, maxY);
//	}
//	
//	default Aabb2fC createNew(@MinLength(2) float[] min, Tup2fR max)
//	{
//		return createNew(min[0], min[1], max.v0(), max.v1());
//	}
//	
//	default Aabb2fC createNew(@MinLength(2) float[] min, @MinLength(2) float[] max)
//	{
//		return createNew(min[0], min[1], max[0], max[1]);
//	}
//	
//	default Aabb2fC createNew(@MinLength(2) float[] min, float maxX, float maxY)
//	{
//		return createNew(min[0], min[1], maxX, maxY);
//	}
//	
//	default Aabb2fC createNew(float minX, float minY, Tup2fR max)
//	{
//		return createNew(minX, minY, max.v0(), max.v1());
//	}
//	
//	default Aabb2fC createNew(float minX, float minY, @MinLength(2) float[] max)
//	{
//		return createNew(minX, minY, max[0], max[1]);
//	}
//	
//	Aabb2fC createNew(float minX, float minY, float maxX, float maxY);
//	
//	/**
//	 * Creates a new instance of the current class with the same component values.
//	 * 
//	 * @return A new instance.
//	 */
//	Aabb2fC copy();
//	
//	default Aabb2fC set(Aabb2fR aabb)
//	{
//		return set(aabb.minX(), aabb.minY(), aabb.maxX(), aabb.maxY());
//	}
//	
//	default Aabb2fC set(Tup2fR min, Tup2fR max)
//	{
//		return set(min.v0(), min.v1(), max.v0(), max.v1());
//	}
//	
//	default Aabb2fC set(Tup2fR min, @MinLength(2) float[] max)
//	{
//		return set(min.v0(), min.v1(), max[0], max[1]);
//	}
//	
//	default Aabb2fC set(Tup2fR min, float maxX, float maxY)
//	{
//		return set(min.v0(), min.v1(), maxX, maxY);
//	}
//	
//	default Aabb2fC set(@MinLength(2) float[] min, Tup2fR max)
//	{
//		return set(min[0], min[1], max.v0(), max.v1());
//	}
//	
//	default Aabb2fC set(@MinLength(2) float[] min, @MinLength(2) float[] max)
//	{
//		return set(min[0], min[1], max[0], max[1]);
//	}
//	
//	default Aabb2fC set(@MinLength(2) float[] min, float maxX, float maxY)
//	{
//		return set(min[0], min[1], maxX, maxY);
//	}
//	
//	default Aabb2fC set(float minX, float minY, Tup2fR max)
//	{
//		return set(minX, minY, max.v0(), max.v1());
//	}
//	
//	default Aabb2fC set(float minX, float minY, @MinLength(2) float[] max)
//	{
//		return set(minX, minY, max[0], max[1]);
//	}
//	
//	Aabb2fC set(float minX, float minY, float maxX, float maxY);
//	
//	default Aabb2fC setMin(Tup3fR min)
//	{
//		return setMin(min.v0(), min.v1(), min.v2());
//	}
//	
//	default Aabb2fC setMin(@MinLength(3) float[] min)
//	{
//		return setMin(min[0], min[1], min[2]);
//	}
//	
//	default Aabb2fC setMin(float x, float y, float z)
//	{
//		minX(x);
//		minY(y);
//		
//		return this;
//	}
//	
//	Aabb2fC minX(float x);
//	Aabb2fC minY(float y);
//	
//	default Aabb2fC setMax(Tup2fR max)
//	{
//		return setMax(max.v0(), max.v1());
//	}
//	
//	default Aabb2fC setMax(@MinLength(2) float[] max)
//	{
//		return setMax(max[0], max[1]);
//	}
//	
//	default Aabb2fC setMax(float x, float y)
//	{
//		maxX(x);
//		maxY(y);
//		
//		return this;
//	}
//	
//	Aabb2fC maxX(float x);
//	Aabb2fC maxY(float y);
//	
//	default Aabb2fC scale(Tup2fR t)
//	{
//		return scale(t.v0(), t.v1());
//	}
//	
//	default Aabb2fC scale(@MinLength(2) float[] v)
//	{
//		return scale(v[0], v[1]);
//	}
//	
//	default Aabb2fC scale(float value)
//	{
//		return scale(value, value);
//	}
//	
//	default Aabb2fC scale(float x, float y)
//	{
//		set(minX() * x,  minY() * y, maxX() * x, maxY() * y);
//		
//		return this;
//	}
//	
//	default Aabb2fC scaleN(Tup2fR t)
//	{
//		return scaleN(t.v0(), t.v1());
//	}
//	
//	default Aabb2fC scaleN(@MinLength(2) float[] v)
//	{
//		return scaleN(v[0], v[1]);
//	}
//	
//	default Aabb2fC scaleN(float value)
//	{
//		return scaleN(value, value);
//	}
//	
//	default Aabb2fC scaleN(float x, float y)
//	{
//		return createNew(minX() * x,  minY() * y, maxX() * x, maxY() * y);
//	}
//	
//	default Aabb2fC merge(Aabb2fR aabb)
//	{
//		return merge(aabb.minX(), aabb.minY(), aabb.maxX(), aabb.maxY());
//	}
//	
//	default Aabb2fC merge(Tup2fR min, Tup2fR max)
//	{
//		return merge(min.v0(), min.v1(), max.v0(), max.v1());
//	}
//	
//	default Aabb2fC merge(Tup2fR min, @MinLength(2) float[] max)
//	{
//		return merge(min.v0(), min.v1(), max[0], max[1]);
//	}
//	
//	default Aabb2fC merge(Tup2fR min, float maxX, float maxY)
//	{
//		return merge(min.v0(), min.v1(), maxX, maxY);
//	}
//	
//	default Aabb2fC merge(@MinLength(2) float[] min, Tup2fR max)
//	{
//		return merge(min[0], min[1], max.v0(), max.v1());
//	}
//	
//	default Aabb2fC merge(@MinLength(2) float[] min, @MinLength(2) float[] max)
//	{
//		return merge(min[0], min[1], max[0], max[1]);
//	}
//	
//	default Aabb2fC merge(@MinLength(2) float[] min, float maxX, float maxY)
//	{
//		return merge(min[0], min[1], maxX, maxY);
//	}
//	
//	default Aabb2fC merge(float minX, float minY, Tup2fR max)
//	{
//		return merge(minX, minY, max.v0(), max.v1());
//	}
//	
//	default Aabb2fC merge(float minX, float minY, @MinLength(2) float[] max)
//	{
//		return merge(minX, minY, max[0], max[1]);
//	}
//	
//	default Aabb2fC merge(float minX, float minY, float maxX, float maxY)
//	{
//		float[] newMin = Vec2fUtils.minVector(minX(), minY(), Math.min(minX, maxX),  Math.min(minY, maxY), new float[2]);
//		float[] newMax = Vec2fUtils.maxVector(maxX(), maxY(), Math.max(minX, maxX),  Math.max(minY, maxY), new float[2]);
//		
//		set(newMin, newMax);
//		
//		return this;
//	}
//	
//	default Aabb2fC mergeN(Aabb2fR aabb)
//	{
//		return mergeN(aabb.minX(), aabb.minY(), aabb.maxX(), aabb.maxX());
//	}
//	
//	default Aabb2fC mergeN(Tup2fR min, Tup2fR max)
//	{
//		return mergeN(min.v0(), min.v1(), max.v0(), max.v1());
//	}
//	
//	default Aabb2fC mergeN(Tup2fR min, @MinLength(2) float[] max)
//	{
//		return mergeN(min.v0(), min.v1(), max[0], max[1]);
//	}
//	
//	default Aabb2fC mergeN(Tup2fR min, float maxX, float maxY)
//	{
//		return mergeN(min.v0(), min.v1(), maxX, maxY);
//	}
//	
//	default Aabb2fC mergeN(@MinLength(2) float[] min, Tup2fR max)
//	{
//		return mergeN(min[0], min[1], max.v0(), max.v1());
//	}
//	
//	default Aabb2fC mergeN(@MinLength(2) float[] min, @MinLength(2) float[] max)
//	{
//		return mergeN(min[0], min[1], max[0], max[1]);
//	}
//	
//	default Aabb2fC mergeN(@MinLength(2) float[] min, float maxX, float maxY)
//	{
//		return mergeN(min[0], min[1], maxX, maxY);
//	}
//	
//	default Aabb2fC mergeN(float minX, float minY, Tup2fR max)
//	{
//		return mergeN(minX, minY, max.v0(), max.v1());
//	}
//	
//	default Aabb2fC mergeN(float minX, float minY, @MinLength(2) float[] max)
//	{
//		return mergeN(minX, minY, max[0], max[1]);
//	}
//	
//	default Aabb2fC mergeN(float minX, float minY, float maxX, float maxY)
//	{
//		float[] newMin = Vec2fUtils.minVector(minX(), minY(), Math.min(minX, maxX),  Math.min(minY, maxY), new float[2]);
//		float[] newMax = Vec2fUtils.maxVector(maxX(), maxY(), Math.max(minX, maxX),  Math.max(minY, maxY), new float[2]);
//		
//		return createNew(newMin[0], newMin[1], newMax[0], newMax[1]);
//	}
//}
package org;


