package org.barghos.math.bounds;

import org.barghos.annotation.MinLength;
import org.barghos.core.tuple.Tup3fR;
import org.barghos.math.vector.Vec3fUtils;

public interface Aabb3fC extends Aabb3fR
{
	Aabb3fC createNew();
	
	default Aabb3fC createNew(Aabb3fR aabb)
	{
		return createNew(aabb.minX(), aabb.minY(), aabb.minZ(), aabb.maxX(), aabb.maxY(), aabb.maxZ());
	}
	
	default Aabb3fC createNew(Tup3fR min, Tup3fR max)
	{
		return createNew(min.v0(), min.v1(), min.v2(), max.v0(), max.v1(), max.v2());
	}
	
	default Aabb3fC createNew(Tup3fR min, @MinLength(3) float[] max)
	{
		return createNew(min.v0(), min.v1(), min.v2(), max[0], max[1], max[2]);
	}
	
	default Aabb3fC createNew(Tup3fR min, float maxX, float maxY, float maxZ)
	{
		return createNew(min.v0(), min.v1(), min.v2(), maxX, maxY, maxZ);
	}
	
	default Aabb3fC createNew(@MinLength(3) float[] min, Tup3fR max)
	{
		return createNew(min[0], min[1], min[2], max.v0(), max.v1(), max.v2());
	}
	
	default Aabb3fC createNew(@MinLength(3) float[] min, @MinLength(3) float[] max)
	{
		return createNew(min[0], min[1], min[2], max[0], max[1], max[2]);
	}
	
	default Aabb3fC createNew(@MinLength(3) float[] min, float maxX, float maxY, float maxZ)
	{
		return createNew(min[0], min[1], min[2], maxX, maxY, maxZ);
	}
	
	default Aabb3fC createNew(float minX, float minY, float minZ, Tup3fR max)
	{
		return createNew(minX, minY, minZ, max.v0(), max.v1(), max.v2());
	}
	
	default Aabb3fC createNew(float minX, float minY, float minZ, @MinLength(3) float[] max)
	{
		return createNew(minX, minY, minZ, max[0], max[1], max[2]);
	}
	
	Aabb3fC createNew(float minX, float minY, float minZ, float maxX, float maxY, float maxZ);
	
	/**
	 * Creates a new instance of the current class with the same component values.
	 * 
	 * @return A new instance.
	 */
	Aabb3fC copy();
	
	default Aabb3fC set(Aabb3fR aabb)
	{
		return set(aabb.minX(), aabb.minY(), aabb.minZ(), aabb.maxX(), aabb.maxY(), aabb.maxZ());
	}
	
	default Aabb3fC set(Tup3fR min, Tup3fR max)
	{
		return set(min.v0(), min.v1(), min.v2(), max.v0(), max.v1(), max.v2());
	}
	
	default Aabb3fC set(Tup3fR min, @MinLength(3) float[] max)
	{
		return set(min.v0(), min.v1(), min.v2(), max[0], max[1], max[2]);
	}
	
	default Aabb3fC set(Tup3fR min, float maxX, float maxY, float maxZ)
	{
		return set(min.v0(), min.v1(), min.v2(), maxX, maxY, maxZ);
	}
	
	default Aabb3fC set(@MinLength(3) float[] min, Tup3fR max)
	{
		return set(min[0], min[1], min[2], max.v0(), max.v1(), max.v2());
	}
	
	default Aabb3fC set(@MinLength(3) float[] min, @MinLength(3) float[] max)
	{
		return set(min[0], min[1], min[2], max[0], max[1], max[2]);
	}
	
	default Aabb3fC set(@MinLength(3) float[] min, float maxX, float maxY, float maxZ)
	{
		return set(min[0], min[1], min[2], maxX, maxY, maxZ);
	}
	
	default Aabb3fC set(float minX, float minY, float minZ, Tup3fR max)
	{
		return set(minX, minY, minZ, max.v0(), max.v1(), max.v2());
	}
	
	default Aabb3fC set(float minX, float minY, float minZ, @MinLength(3) float[] max)
	{
		return set(minX, minY, minZ, max[0], max[1], max[2]);
	}
	
	Aabb3fC set(float minX, float minY, float minZ, float maxX, float maxY, float maxZ);
	
	default Aabb3fC setMin(Tup3fR min)
	{
		return setMin(min.v0(), min.v1(), min.v2());
	}
	
	default Aabb3fC setMin(@MinLength(3) float[] min)
	{
		return setMin(min[0], min[1], min[2]);
	}
	
	default Aabb3fC setMin(float x, float y, float z)
	{
		setMinX(x);
		setMinY(y);
		setMinZ(z);
		
		return this;
	}
	
	Aabb3fC setMinX(float x);
	Aabb3fC setMinY(float y);
	Aabb3fC setMinZ(float z);
	
	default Aabb3fC setMax(Tup3fR max)
	{
		return setMin(max.v0(), max.v1(), max.v2());
	}
	
	default Aabb3fC setMax(@MinLength(3) float[] max)
	{
		return setMax(max[0], max[1], max[2]);
	}
	
	default Aabb3fC setMax(float x, float y, float z)
	{
		setMaxX(x);
		setMaxY(y);
		setMaxZ(z);
		
		return this;
	}
	
	Aabb3fC setMaxX(float x);
	Aabb3fC setMaxY(float y);
	Aabb3fC setMaxZ(float z);
	
	default Aabb3fC scale(Tup3fR t)
	{
		return scale(t.v0(), t.v1(), t.v2());
	}
	
	default Aabb3fC scale(@MinLength(3) float[] v)
	{
		return scale(v[0], v[1], v[2]);
	}
	
	default Aabb3fC scale(float value)
	{
		return scale(value, value, value);
	}
	
	default Aabb3fC scale(float x, float y, float z)
	{
		set(minX() * x,  minY() * y, minZ() * z, maxX() * x, maxY() * y, maxZ() * z);
		
		return this;
	}
	
	default Aabb3fC scaleN(Tup3fR t)
	{
		return scaleN(t.v0(), t.v1(), t.v2());
	}
	
	default Aabb3fC scaleN(@MinLength(3) float[] v)
	{
		return scaleN(v[0], v[1], v[2]);
	}
	
	default Aabb3fC scaleN(float value)
	{
		return scaleN(value, value, value);
	}
	
	default Aabb3fC scaleN(float x, float y, float z)
	{
		return createNew(minX() * x,  minY() * y, minZ() * z, maxX() * x, maxY() * y, maxZ() * z);
	}
	
	default Aabb3fC merge(Aabb3fR aabb)
	{
		return merge(aabb.minX(), aabb.minY(), aabb.minZ(), aabb.maxX(), aabb.maxY(), aabb.maxZ());
	}
	
	default Aabb3fC merge(Tup3fR min, Tup3fR max)
	{
		return merge(min.v0(), min.v1(), min.v2(), max.v0(), max.v1(), max.v2());
	}
	
	default Aabb3fC merge(Tup3fR min, @MinLength(3) float[] max)
	{
		return merge(min.v0(), min.v1(), min.v2(), max[0], max[1], max[2]);
	}
	
	default Aabb3fC merge(Tup3fR min, float maxX, float maxY, float maxZ)
	{
		return merge(min.v0(), min.v1(), min.v2(), maxX, maxY, maxZ);
	}
	
	default Aabb3fC merge(@MinLength(3) float[] min, Tup3fR max)
	{
		return merge(min[0], min[1], min[2], max.v0(), max.v1(), max.v2());
	}
	
	default Aabb3fC merge(@MinLength(3) float[] min, @MinLength(3) float[] max)
	{
		return merge(min[0], min[1], min[2], max[0], max[1], max[2]);
	}
	
	default Aabb3fC merge(@MinLength(3) float[] min, float maxX, float maxY, float maxZ)
	{
		return merge(min[0], min[1], min[2], maxX, maxY, maxZ);
	}
	
	default Aabb3fC merge(float minX, float minY, float minZ, Tup3fR max)
	{
		return merge(minX, minY, minZ, max.v0(), max.v1(), max.v2());
	}
	
	default Aabb3fC merge(float minX, float minY, float minZ, @MinLength(3) float[] max)
	{
		return merge(minX, minY, minZ, max[0], max[1], max[2]);
	}
	
	default Aabb3fC merge(float minX, float minY, float minZ, float maxX, float maxY, float maxZ)
	{
		float[] newMin = Vec3fUtils.minVector(minX(), minY(), minZ(), Math.min(minX, maxX),  Math.min(minY, maxY), Math.min(minZ, maxZ), new float[3]);
		float[] newMax = Vec3fUtils.maxVector(maxX(), maxY(), maxZ(), Math.max(minX, maxX),  Math.max(minY, maxY), Math.max(minZ, maxZ), new float[3]);
		
		set(newMin, newMax);
		
		return this;
	}
	
	default Aabb3fC mergeN(Aabb3fR aabb)
	{
		return mergeN(aabb.minX(), aabb.minY(), aabb.minZ(), aabb.maxX(), aabb.maxY(), aabb.maxZ());
	}
	
	default Aabb3fC mergeN(Tup3fR min, Tup3fR max)
	{
		return mergeN(min.v0(), min.v1(), min.v2(), max.v0(), max.v1(), max.v2());
	}
	
	default Aabb3fC mergeN(Tup3fR min, @MinLength(3) float[] max)
	{
		return mergeN(min.v0(), min.v1(), min.v2(), max[0], max[1], max[2]);
	}
	
	default Aabb3fC mergeN(Tup3fR min, float maxX, float maxY, float maxZ)
	{
		return mergeN(min.v0(), min.v1(), min.v2(), maxX, maxY, maxZ);
	}
	
	default Aabb3fC mergeN(@MinLength(3) float[] min, Tup3fR max)
	{
		return mergeN(min[0], min[1], min[2], max.v0(), max.v1(), max.v2());
	}
	
	default Aabb3fC mergeN(@MinLength(3) float[] min, @MinLength(3) float[] max)
	{
		return mergeN(min[0], min[1], min[2], max[0], max[1], max[2]);
	}
	
	default Aabb3fC mergeN(@MinLength(3) float[] min, float maxX, float maxY, float maxZ)
	{
		return mergeN(min[0], min[1], min[2], maxX, maxY, maxZ);
	}
	
	default Aabb3fC mergeN(float minX, float minY, float minZ, Tup3fR max)
	{
		return mergeN(minX, minY, minZ, max.v0(), max.v1(), max.v2());
	}
	
	default Aabb3fC mergeN(float minX, float minY, float minZ, @MinLength(3) float[] max)
	{
		return mergeN(minX, minY, minZ, max[0], max[1], max[2]);
	}
	
	default Aabb3fC mergeN(float minX, float minY, float minZ, float maxX, float maxY, float maxZ)
	{
		float[] newMin = Vec3fUtils.minVector(minX(), minY(), minZ(), Math.min(minX, maxX),  Math.min(minY, maxY), Math.min(minZ, maxZ), new float[3]);
		float[] newMax = Vec3fUtils.maxVector(maxX(), maxY(), maxZ(), Math.max(minX, maxX),  Math.max(minY, maxY), Math.max(minZ, maxZ), new float[3]);
		
		return createNew(newMin, newMax);
	}
}
