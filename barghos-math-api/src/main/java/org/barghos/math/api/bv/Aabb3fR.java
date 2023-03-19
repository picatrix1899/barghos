package org.barghos.math.api.bv;

import org.barghos.annotation.ExtractionParam;
import org.barghos.annotation.MinLength;
import org.barghos.math.api.vector.Vec3fUtils;
import org.barghos.tuple.api.t3.Tup3fC;
import org.barghos.tuple.api.t3.Tup3fR;

public interface Aabb3fR
{
	Aabb3fR createNew();
	
	default Aabb3fR createNew(Aabb3fR aabb)
	{
		return createNew(aabb.getMinX(), aabb.getMinY(), aabb.getMinZ(), aabb.getMaxX(), aabb.getMaxY(), aabb.getMaxZ());
	}
	
	default Aabb3fR createNew(Tup3fR min, Tup3fR max)
	{
		return createNew(min.getV0(), min.getV1(), min.getV2(), max.getV0(), max.getV1(), max.getV2());
	}
	
	default Aabb3fR createNew(Tup3fR min, @MinLength(2) float[] max)
	{
		return createNew(min.getV0(), min.getV1(), min.getV2(), max[0], max[1], max[2]);
	}
	
	default Aabb3fR createNew(Tup3fR min, float maxX, float maxY, float maxZ)
	{
		return createNew(min.getV0(), min.getV1(), min.getV2(), maxX, maxY, maxZ);
	}
	
	default Aabb3fR createNew(@MinLength(3) float[] min, Tup3fR max)
	{
		return createNew(min[0], min[1], min[2], max.getV0(), max.getV1(), max.getV2());
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
		return createNew(minX, minY, minZ, max.getV0(), max.getV1(), max.getV2());
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
	
	float getMinX();
	float getMinY();
	float getMinZ();
	
	<T extends Tup3fC> T getMin(@ExtractionParam T res);
	float[] getMin(@ExtractionParam @MinLength(3) float[] res);
	
	float getMaxX();
	float getMaxY();
	float getMaxZ();
	
	<T extends Tup3fC> T getMax(@ExtractionParam T res);
	float[] getMax(@ExtractionParam @MinLength(3) float[] res);
	
	float getSizeX();
	float getSizeY();
	float getSizeZ();
	
	<T extends Tup3fC> T getSize(@ExtractionParam T res);
	float[] getSize(@ExtractionParam @MinLength(3) float[] res);
	
	float getCenterX();
	float getCenterY();
	float getCenterz();
	
	<T extends Tup3fC> T getCenter(@ExtractionParam T res);
	float[] getCenter(@ExtractionParam @MinLength(3) float[] res);
	
	default Aabb3fR scaleN(Tup3fR t)
	{
		return scaleN(t.getV0(), t.getV1(), t.getV2());
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
		return createNew(getMinX() * x,  getMinY() * y, getMinZ() * z, getMaxX() * x, getMaxY() * y, getMaxZ() * z);
	}
	
	default Aabb3fR mergeN(Aabb3fR aabb)
	{
		return mergeN(aabb.getMinX(), aabb.getMinY(), aabb.getMinZ(), aabb.getMaxX(), aabb.getMaxY(), aabb.getMaxZ());
	}
	
	default Aabb3fR mergeN(Tup3fR min, Tup3fR max)
	{
		return mergeN(min.getV0(), min.getV1(), min.getV2(), max.getV0(), max.getV1(), max.getV2());
	}
	
	default Aabb3fR mergeN(Tup3fR min, @MinLength(3) float[] max)
	{
		return mergeN(min.getV0(), min.getV1(), min.getV2(), max[0], max[1], max[2]);
	}
	
	default Aabb3fR mergeN(Tup3fR min, float maxX, float maxY, float maxZ)
	{
		return mergeN(min.getV0(), min.getV1(), min.getV2(), maxX, maxY, maxZ);
	}
	
	default Aabb3fR mergeN(@MinLength(3) float[] min, Tup3fR max)
	{
		return mergeN(min[0], min[1], min[2], max.getV0(), max.getV1(), max.getV2());
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
		return mergeN(minX, minY, minZ, max.getV0(), max.getV1(), max.getV2());
	}
	
	default Aabb3fR mergeN(float minX, float minY, float minZ, @MinLength(3) float[] max)
	{
		return mergeN(minX, minY, minZ, max[0], max[1], max[2]);
	}
	
	default Aabb3fR mergeN(float minX, float minY, float minZ, float maxX, float maxY, float maxZ)
	{
		float[] newMin = Vec3fUtils.minVector(getMinX(), getMinY(), getMinZ(), Math.min(minX, maxX),  Math.min(minY, maxY), Math.min(minZ, maxZ), new float[3]);
		float[] newMax = Vec3fUtils.maxVector(getMaxX(), getMaxY(), getMaxZ(), Math.max(minX, maxX),  Math.max(minY, maxY), Math.max(minZ, maxZ), new float[3]);
		
		return createNew(newMin, newMax);
	}
	
	default <T extends Aabb3fC> T scaleR(Tup3fR t, @ExtractionParam T res)
	{
		return scaleR(t.getV0(), t.getV1(), t.getV2(), res);
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
		res.set(getMinX() * x,  getMinY() * y, getMinZ() * z, getMaxX() * x, getMaxY() * y, getMaxZ() * z);
		
		return res;
	}
	
	default <T extends Aabb3fC> T mergeR(Aabb3fR aabb, @ExtractionParam T res)
	{
		return mergeR(aabb.getMinX(), aabb.getMinY(), aabb.getMinZ(), aabb.getMaxX(), aabb.getMaxY(), aabb.getMaxZ(), res);
	}
	
	default <T extends Aabb3fC> T mergeR(Tup3fR min, Tup3fR max, @ExtractionParam T res)
	{
		return mergeR(min.getV0(), min.getV1(), min.getV2(), max.getV0(), max.getV1(), max.getV2(), res);
	}
	
	default <T extends Aabb3fC> T mergeR(Tup3fR min, @MinLength(3) float[] max, @ExtractionParam T res)
	{
		return mergeR(min.getV0(), min.getV1(), min.getV2(), max[0], max[1], max[2], res);
	}
	
	default <T extends Aabb3fC> T mergeR(Tup3fR min, float maxX, float maxY, float maxZ, @ExtractionParam T res)
	{
		return mergeR(min.getV0(), min.getV1(), min.getV2(), maxX, maxY, maxZ, res);
	}
	
	default <T extends Aabb3fC> T mergeR(@MinLength(3) float[] min, Tup3fR max, @ExtractionParam T res)
	{
		return mergeR(min[0], min[1], min[2], max.getV0(), max.getV1(), max.getV2(), res);
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
		return mergeR(minX, minY, minZ, max.getV0(), max.getV1(), max.getV2(), res);
	}
	
	default <T extends Aabb3fC> T mergeR(float minX, float minY, float minZ, @MinLength(3) float[] max, @ExtractionParam T res)
	{
		return mergeR(minX, minY, minZ, max[0], max[1], max[2], res);
	}
	
	default <T extends Aabb3fC> T mergeR(float minX, float minY, float minZ, float maxX, float maxY, float maxZ, @ExtractionParam T res)
	{
		float[] newMin = Vec3fUtils.minVector(getMinX(), getMinY(), getMinZ(), Math.min(minX, maxX),  Math.min(minY, maxY), Math.min(minZ, maxZ), new float[3]);
		float[] newMax = Vec3fUtils.maxVector(getMaxX(), getMaxY(), getMaxZ(), Math.max(minX, maxX),  Math.max(minY, maxY), Math.max(minZ, maxZ), new float[3]);
		
		res.set(newMin, newMax);
		
		return res;
	}
}
