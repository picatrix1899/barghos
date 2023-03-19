package org.barghos.math.api.bv;

import org.barghos.annotation.MinLength;
import org.barghos.math.api.vector.Vec3fUtils;
import org.barghos.tuple.api.t3.Tup3fR;

public interface Aabb3fC extends Aabb3fR
{
	Aabb3fC createNew();
	
	default Aabb3fC createNew(Aabb3fR aabb)
	{
		return createNew(aabb.getMinX(), aabb.getMinY(), aabb.getMinZ(), aabb.getMaxX(), aabb.getMaxY(), aabb.getMaxZ());
	}
	
	default Aabb3fC createNew(Tup3fR min, Tup3fR max)
	{
		return createNew(min.getV0(), min.getV1(), min.getV2(), max.getV0(), max.getV1(), max.getV2());
	}
	
	default Aabb3fC createNew(Tup3fR min, @MinLength(3) float[] max)
	{
		return createNew(min.getV0(), min.getV1(), min.getV2(), max[0], max[1], max[2]);
	}
	
	default Aabb3fC createNew(Tup3fR min, float maxX, float maxY, float maxZ)
	{
		return createNew(min.getV0(), min.getV1(), min.getV2(), maxX, maxY, maxZ);
	}
	
	default Aabb3fC createNew(@MinLength(3) float[] min, Tup3fR max)
	{
		return createNew(min[0], min[1], min[2], max.getV0(), max.getV1(), max.getV2());
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
		return createNew(minX, minY, minZ, max.getV0(), max.getV1(), max.getV2());
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
		return set(aabb.getMinX(), aabb.getMinY(), aabb.getMinZ(), aabb.getMaxX(), aabb.getMaxY(), aabb.getMaxZ());
	}
	
	default Aabb3fC set(Tup3fR min, Tup3fR max)
	{
		return set(min.getV0(), min.getV1(), min.getV2(), max.getV0(), max.getV1(), max.getV2());
	}
	
	default Aabb3fC set(Tup3fR min, @MinLength(3) float[] max)
	{
		return set(min.getV0(), min.getV1(), min.getV2(), max[0], max[1], max[2]);
	}
	
	default Aabb3fC set(Tup3fR min, float maxX, float maxY, float maxZ)
	{
		return set(min.getV0(), min.getV1(), min.getV2(), maxX, maxY, maxZ);
	}
	
	default Aabb3fC set(@MinLength(3) float[] min, Tup3fR max)
	{
		return set(min[0], min[1], min[2], max.getV0(), max.getV1(), max.getV2());
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
		return set(minX, minY, minZ, max.getV0(), max.getV1(), max.getV2());
	}
	
	default Aabb3fC set(float minX, float minY, float minZ, @MinLength(3) float[] max)
	{
		return set(minX, minY, minZ, max[0], max[1], max[2]);
	}
	
	Aabb3fC set(float minX, float minY, float minZ, float maxX, float maxY, float maxZ);
	
	default Aabb3fC setMin(Tup3fR min)
	{
		return setMin(min.getV0(), min.getV1(), min.getV2());
	}
	
	default Aabb3fC setMin(@MinLength(3) float[] min)
	{
		return setMin(min[0], min[1], min[2]);
	}
	
	Aabb3fC setMin(float x, float y, float z);
	
	Aabb3fC setMinX(float x);
	Aabb3fC setMinY(float y);
	Aabb3fC setMinZ(float z);
	
	default Aabb3fC setMax(Tup3fR max)
	{
		return setMin(max.getV0(), max.getV1(), max.getV2());
	}
	
	default Aabb3fC setMax(@MinLength(3) float[] max)
	{
		return setMax(max[0], max[1], max[2]);
	}
	
	Aabb3fC setMax(float x, float y, float z);
	
	Aabb3fC setMaxX(float x);
	Aabb3fC setMaxY(float y);
	Aabb3fC setMaxZ(float z);
	
	default Aabb3fC scale(Tup3fR t)
	{
		return scale(t.getV0(), t.getV1(), t.getV2());
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
		set(getMinX() * x,  getMinY() * y, getMinZ() * z, getMaxX() * x, getMaxY() * y, getMaxZ() * z);
		
		return this;
	}
	
	default Aabb3fC scaleN(Tup3fR t)
	{
		return scaleN(t.getV0(), t.getV1(), t.getV2());
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
		return createNew(getMinX() * x,  getMinY() * y, getMinZ() * z, getMaxX() * x, getMaxY() * y, getMaxZ() * z);
	}
	
	default Aabb3fC merge(Aabb3fR aabb)
	{
		return merge(aabb.getMinX(), aabb.getMinY(), aabb.getMinZ(), aabb.getMaxX(), aabb.getMaxY(), aabb.getMaxZ());
	}
	
	default Aabb3fC merge(Tup3fR min, Tup3fR max)
	{
		return merge(min.getV0(), min.getV1(), min.getV2(), max.getV0(), max.getV1(), max.getV2());
	}
	
	default Aabb3fC merge(Tup3fR min, @MinLength(3) float[] max)
	{
		return merge(min.getV0(), min.getV1(), min.getV2(), max[0], max[1], max[2]);
	}
	
	default Aabb3fC merge(Tup3fR min, float maxX, float maxY, float maxZ)
	{
		return merge(min.getV0(), min.getV1(), min.getV2(), maxX, maxY, maxZ);
	}
	
	default Aabb3fC merge(@MinLength(3) float[] min, Tup3fR max)
	{
		return merge(min[0], min[1], min[2], max.getV0(), max.getV1(), max.getV2());
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
		return merge(minX, minY, minZ, max.getV0(), max.getV1(), max.getV2());
	}
	
	default Aabb3fC merge(float minX, float minY, float minZ, @MinLength(3) float[] max)
	{
		return merge(minX, minY, minZ, max[0], max[1], max[2]);
	}
	
	default Aabb3fC merge(float minX, float minY, float minZ, float maxX, float maxY, float maxZ)
	{
		float[] newMin = Vec3fUtils.minVector(getMinX(), getMinY(), getMinZ(), Math.min(minX, maxX),  Math.min(minY, maxY), Math.min(minZ, maxZ), new float[3]);
		float[] newMax = Vec3fUtils.maxVector(getMaxX(), getMaxY(), getMaxZ(), Math.max(minX, maxX),  Math.max(minY, maxY), Math.max(minZ, maxZ), new float[3]);
		
		set(newMin, newMax);
		
		return this;
	}
	
	default Aabb3fC mergeN(Aabb3fR aabb)
	{
		return mergeN(aabb.getMinX(), aabb.getMinY(), aabb.getMinZ(), aabb.getMaxX(), aabb.getMaxY(), aabb.getMaxZ());
	}
	
	default Aabb3fC mergeN(Tup3fR min, Tup3fR max)
	{
		return mergeN(min.getV0(), min.getV1(), min.getV2(), max.getV0(), max.getV1(), max.getV2());
	}
	
	default Aabb3fC mergeN(Tup3fR min, @MinLength(3) float[] max)
	{
		return mergeN(min.getV0(), min.getV1(), min.getV2(), max[0], max[1], max[2]);
	}
	
	default Aabb3fC mergeN(Tup3fR min, float maxX, float maxY, float maxZ)
	{
		return mergeN(min.getV0(), min.getV1(), min.getV2(), maxX, maxY, maxZ);
	}
	
	default Aabb3fC mergeN(@MinLength(3) float[] min, Tup3fR max)
	{
		return mergeN(min[0], min[1], min[2], max.getV0(), max.getV1(), max.getV2());
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
		return mergeN(minX, minY, minZ, max.getV0(), max.getV1(), max.getV2());
	}
	
	default Aabb3fC mergeN(float minX, float minY, float minZ, @MinLength(3) float[] max)
	{
		return mergeN(minX, minY, minZ, max[0], max[1], max[2]);
	}
	
	default Aabb3fC mergeN(float minX, float minY, float minZ, float maxX, float maxY, float maxZ)
	{
		float[] newMin = Vec3fUtils.minVector(getMinX(), getMinY(), getMinZ(), Math.min(minX, maxX),  Math.min(minY, maxY), Math.min(minZ, maxZ), new float[3]);
		float[] newMax = Vec3fUtils.maxVector(getMaxX(), getMaxY(), getMaxZ(), Math.max(minX, maxX),  Math.max(minY, maxY), Math.max(minZ, maxZ), new float[3]);
		
		return createNew(newMin, newMax);
	}
}
