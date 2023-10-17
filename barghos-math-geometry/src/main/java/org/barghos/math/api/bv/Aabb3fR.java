package org.barghos.math.api.bv;

import org.barghos.annotation.ExtractionParam;
import org.barghos.annotation.MinLength;
import org.barghos.core.tuple.Tup3fC;
import org.barghos.core.tuple.Tup3fR;
import org.barghos.math.api.vector.Vec3fUtils;

public interface Aabb3fR
{
	Aabb3fR createNew();
	
	default Aabb3fR createNew(Aabb3fR aabb)
	{
		return createNew(aabb.minX(), aabb.minY(), aabb.minZ(), aabb.maxX(), aabb.maxY(), aabb.maxZ());
	}
	
	default Aabb3fR createNew(Tup3fR min, Tup3fR max)
	{
		return createNew(min.v0(), min.v1(), min.v2(), max.v0(), max.v1(), max.v2());
	}
	
	default Aabb3fR createNew(Tup3fR min, @MinLength(2) float[] max)
	{
		return createNew(min.v0(), min.v1(), min.v2(), max[0], max[1], max[2]);
	}
	
	default Aabb3fR createNew(Tup3fR min, float maxX, float maxY, float maxZ)
	{
		return createNew(min.v0(), min.v1(), min.v2(), maxX, maxY, maxZ);
	}
	
	default Aabb3fR createNew(@MinLength(3) float[] min, Tup3fR max)
	{
		return createNew(min[0], min[1], min[2], max.v0(), max.v1(), max.v2());
	}
	
	default Aabb3fR createNew(@MinLength(3) float[] min, @MinLength(3) float[] max)
	{
		return createNew(min[0], min[1], min[2], max[0], max[1], max[2]);
	}
	
	default Aabb3fR createNew(@MinLength(3) float[] min, float maxX, float maxY, float maxZ)
	{
		return createNew(min[0], min[1], min[2], maxX, maxY, maxZ);
	}
	
	default Aabb3fR createNew(float minX, float minY, float minZ, Tup3fR max)
	{
		return createNew(minX, minY, minZ, max.v0(), max.v1(), max.v2());
	}
	
	default Aabb3fR createNew(float minX, float minY, float minZ, @MinLength(3) float[] max)
	{
		return createNew(minX, minY, minZ, max[0], max[1], max[2]);
	}
	
	Aabb3fR createNew(float minX, float minY, float minZ, float maxX, float maxY, float maxZ);
	
	/**
	 * Creates a new instance of the current class with the same component values.
	 * 
	 * @return A new instance.
	 */
	Aabb3fR copy();
	
	float minX();
	float minY();
	float minZ();
	
	<T extends Tup3fC> T getMin(@ExtractionParam T res);
	float[] getMin(@ExtractionParam @MinLength(3) float[] res);
	
	float maxX();
	float maxY();
	float maxZ();
	
	<T extends Tup3fC> T getMax(@ExtractionParam T res);
	float[] getMax(@ExtractionParam @MinLength(3) float[] res);
	
	float sizeX();
	float sizeY();
	float sizeZ();
	
	<T extends Tup3fC> T size(@ExtractionParam T res);
	float[] size(@ExtractionParam @MinLength(3) float[] res);
	
	float centerX();
	float centerY();
	float centerz();
	
	<T extends Tup3fC> T center(@ExtractionParam T res);
	float[] center(@ExtractionParam @MinLength(3) float[] res);
	
	default Aabb3fR scaleN(Tup3fR t)
	{
		return scaleN(t.v0(), t.v1(), t.v2());
	}
	
	default Aabb3fR scaleN(@MinLength(3) float[] v)
	{
		return scaleN(v[0], v[1], v[2]);
	}
	
	default Aabb3fR scaleN(float value)
	{
		return scaleN(value, value, value);
	}
	
	default Aabb3fR scaleN(float x, float y, float z)
	{
		return createNew(minX() * x,  minY() * y, minZ() * z, maxX() * x, maxY() * y, maxZ() * z);
	}
	
	default Aabb3fR mergeN(Aabb3fR aabb)
	{
		return mergeN(aabb.minX(), aabb.minY(), aabb.minZ(), aabb.maxX(), aabb.maxY(), aabb.maxZ());
	}
	
	default Aabb3fR mergeN(Tup3fR min, Tup3fR max)
	{
		return mergeN(min.v0(), min.v1(), min.v2(), max.v0(), max.v1(), max.v2());
	}
	
	default Aabb3fR mergeN(Tup3fR min, @MinLength(3) float[] max)
	{
		return mergeN(min.v0(), min.v1(), min.v2(), max[0], max[1], max[2]);
	}
	
	default Aabb3fR mergeN(Tup3fR min, float maxX, float maxY, float maxZ)
	{
		return mergeN(min.v0(), min.v1(), min.v2(), maxX, maxY, maxZ);
	}
	
	default Aabb3fR mergeN(@MinLength(3) float[] min, Tup3fR max)
	{
		return mergeN(min[0], min[1], min[2], max.v0(), max.v1(), max.v2());
	}
	
	default Aabb3fR mergeN(@MinLength(3) float[] min, @MinLength(3) float[] max)
	{
		return mergeN(min[0], min[1], min[2], max[0], max[1], max[2]);
	}
	
	default Aabb3fR mergeN(@MinLength(3) float[] min, float maxX, float maxY, float maxZ)
	{
		return mergeN(min[0], min[1], min[2], maxX, maxY, maxZ);
	}
	
	default Aabb3fR mergeN(float minX, float minY, float minZ, Tup3fR max)
	{
		return mergeN(minX, minY, minZ, max.v0(), max.v1(), max.v2());
	}
	
	default Aabb3fR mergeN(float minX, float minY, float minZ, @MinLength(3) float[] max)
	{
		return mergeN(minX, minY, minZ, max[0], max[1], max[2]);
	}
	
	default Aabb3fR mergeN(float minX, float minY, float minZ, float maxX, float maxY, float maxZ)
	{
		float[] newMin = Vec3fUtils.minVector(minX(), minY(), minZ(), Math.min(minX, maxX),  Math.min(minY, maxY), Math.min(minZ, maxZ), new float[3]);
		float[] newMax = Vec3fUtils.maxVector(maxX(), maxY(), maxZ(), Math.max(minX, maxX),  Math.max(minY, maxY), Math.max(minZ, maxZ), new float[3]);
		
		return createNew(newMin, newMax);
	}
	
	default <T extends Aabb3fC> T scaleR(Tup3fR t, @ExtractionParam T res)
	{
		return scaleR(t.v0(), t.v1(), t.v2(), res);
	}
	
	default <T extends Aabb3fC> T scaleR(@MinLength(3) float[] v, @ExtractionParam T res)
	{
		return scaleR(v[0], v[1], v[2], res);
	}
	
	default <T extends Aabb3fC> T scaleR(float value, @ExtractionParam T res)
	{
		return scaleR(value, value, value, res);
	}
	
	default <T extends Aabb3fC> T scaleR(float x, float y, float z, @ExtractionParam T res)
	{
		res.set(minX() * x,  minY() * y, minZ() * z, maxX() * x, maxY() * y, maxZ() * z);
		
		return res;
	}
	
	default <T extends Aabb3fC> T mergeR(Aabb3fR aabb, @ExtractionParam T res)
	{
		return mergeR(aabb.minX(), aabb.minY(), aabb.minZ(), aabb.maxX(), aabb.maxY(), aabb.maxZ(), res);
	}
	
	default <T extends Aabb3fC> T mergeR(Tup3fR min, Tup3fR max, @ExtractionParam T res)
	{
		return mergeR(min.v0(), min.v1(), min.v2(), max.v0(), max.v1(), max.v2(), res);
	}
	
	default <T extends Aabb3fC> T mergeR(Tup3fR min, @MinLength(3) float[] max, @ExtractionParam T res)
	{
		return mergeR(min.v0(), min.v1(), min.v2(), max[0], max[1], max[2], res);
	}
	
	default <T extends Aabb3fC> T mergeR(Tup3fR min, float maxX, float maxY, float maxZ, @ExtractionParam T res)
	{
		return mergeR(min.v0(), min.v1(), min.v2(), maxX, maxY, maxZ, res);
	}
	
	default <T extends Aabb3fC> T mergeR(@MinLength(3) float[] min, Tup3fR max, @ExtractionParam T res)
	{
		return mergeR(min[0], min[1], min[2], max.v0(), max.v1(), max.v2(), res);
	}
	
	default <T extends Aabb3fC> T mergeR(@MinLength(3) float[] min, @MinLength(3) float[] max, @ExtractionParam T res)
	{
		return mergeR(min[0], min[1], min[2], max[0], max[1], max[2], res);
	}
	
	default <T extends Aabb3fC> T mergeR(@MinLength(3) float[] min, float maxX, float maxY, float maxZ, @ExtractionParam T res)
	{
		return mergeR(min[0], min[1], min[2], maxX, maxY, maxZ, res);
	}
	
	default <T extends Aabb3fC> T mergeR(float minX, float minY, float minZ, Tup3fR max, @ExtractionParam T res)
	{
		return mergeR(minX, minY, minZ, max.v0(), max.v1(), max.v2(), res);
	}
	
	default <T extends Aabb3fC> T mergeR(float minX, float minY, float minZ, @MinLength(3) float[] max, @ExtractionParam T res)
	{
		return mergeR(minX, minY, minZ, max[0], max[1], max[2], res);
	}
	
	default <T extends Aabb3fC> T mergeR(float minX, float minY, float minZ, float maxX, float maxY, float maxZ, @ExtractionParam T res)
	{
		float[] newMin = Vec3fUtils.minVector(minX(), minY(), minZ(), Math.min(minX, maxX),  Math.min(minY, maxY), Math.min(minZ, maxZ), new float[3]);
		float[] newMax = Vec3fUtils.maxVector(maxX(), maxY(), maxZ(), Math.max(minX, maxX),  Math.max(minY, maxY), Math.max(minZ, maxZ), new float[3]);
		
		res.set(newMin, newMax);
		
		return res;
	}
}
