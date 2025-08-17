package org.barghos.math.bounds;

import org.barghos.annotation.ExtractionParam;
import org.barghos.util.math.MathUtils;
import org.barghos.util.tuple.floats.ITup3RF;
import org.barghos.util.tuple.floats.ITup3WF;

public class Aabb3F implements IAabb3WF
{
	protected float minX;
	protected float minY;
	protected float minZ;
	protected float maxX;
	protected float maxY;
	protected float maxZ;
	
	public Aabb3F()
	{
		set(0, 0, 0, 1, 1, 1);
	}
	
	public Aabb3F(IAabb3RF aabb)
	{
		set(aabb);
	}
	
	public Aabb3F(ITup3RF min, ITup3RF max)
	{
		set(min, max);
	}
	
	public Aabb3F(ITup3RF min, float maxX, float maxY, float maxZ)
	{
		set(min, maxX, maxY, maxZ);
	}
	
	public Aabb3F(float minX, float minY, float minZ, ITup3RF max)
	{
		set(minX, minY, minZ, max);
	}
	
	public Aabb3F(float minX, float minY, float minZ, float maxX, float maxY, float maxZ)
	{
		set(minX, minY, minZ, maxX, maxY, maxZ);
	}
	
	@Override
	public float minX()
	{
		return this.minX;
	}
	
	@Override
	public float minY()
	{
		return this.minY;
	}
	
	@Override
	public float minZ()
	{
		return this.minZ;
	}
	
	@Override
	public <T extends ITup3WF> T getMin(T res)
	{
		res.set(this.minX, this.minY, this.minZ);
		
		return res;
	}
	
	@Override
	public float[] getMin(float[] res)
	{
		res[0] = this.minX;
		res[1] = this.minY;
		res[2] = this.minZ;
		
		return res;
	}
	
	@Override
	public float maxX()
	{
		return this.maxX;
	}
	
	@Override
	public float maxY()
	{
		return this.maxY;
	}
	
	@Override
	public float maxZ()
	{
		return this.maxZ;
	}
	
	@Override
	public <T extends ITup3WF> T getMax(T res)
	{
		res.set(this.maxX, this.maxY, this.maxZ);
		
		return res;
	}
	
	@Override
	public float[] getMax(float[] res)
	{
		res[0] = this.maxX;
		res[1] = this.maxY;
		res[2] = this.maxZ;
		
		return res;
	}
	
	@Override
	public <T extends ITup3WF> T size(T res)
	{
		res.set(sizeX(), sizeY(), sizeZ());
		
		return res;
	}
	
	@Override
	public float[] size(float[] res)
	{
		res[0] = sizeX();
		res[1] = sizeY();
		res[2] = sizeZ();
		
		return res;
	}
	
	@Override
	public float sizeX()
	{
		return this.maxX - this.minX;
	}
	
	@Override
	public float sizeY()
	{
		return this.maxY - this.minY;
	}
	
	@Override
	public float sizeZ()
	{
		return this.maxZ - this.minZ;
	}
	
	@Override
	public <T extends ITup3WF> T center(T res)
	{
		res.set(centerX(), centerY(), centerZ());
		
		return res;
	}
	
	@Override
	public float[] center(float[] res)
	{
		res[0] = centerX();
		res[1] = centerY();
		res[2] = centerZ();
		
		return res;
	}
	
	@Override
	public float centerX()
	{
		return (this.minX + this.maxX) * 0.5f;
	}
	
	@Override
	public float centerY()
	{
		return (this.minY + this.maxY * 0.5f);
	}
	
	@Override
	public float centerZ()
	{
		return (this.minZ + this.maxZ * 0.5f);
	}
	
	@Override
	public Aabb3F set(IAabb3RF aabb)
	{
		return set(aabb.minX(), aabb.minY(), aabb.minZ(), aabb.maxX(), aabb.maxY(), aabb.maxZ());
	}
	
	@Override
	public Aabb3F set(ITup3RF min, ITup3RF max)
	{
		return set(min.v0(), min.v1(), min.v2(), max.v0(), max.v1(), max.v2());
	}
	
	@Override
	public Aabb3F set(ITup3RF min, float[] max)
	{
		return set(min.v0(), min.v1(), min.v2(), max[0], max[1], max[2]);
	}
	
	@Override
	public Aabb3F set(ITup3RF min, float maxX, float maxY, float maxZ)
	{
		return set(min.v0(), min.v1(), min.v2(), maxX, maxY, maxZ);
	}
	
	@Override
	public Aabb3F set(float[] min, ITup3RF max)
	{
		return set(min[0], min[1], min[2], max.v0(), max.v1(), max.v2());
	}

	@Override
	public Aabb3F set(float[] min, float[] max)
	{
		return set(min[0], min[1], min[2], max[0], max[1], max[2]);
	}

	@Override
	public Aabb3F set(float[] min, float maxX, float maxY, float maxZ)
	{
		return set(min[0], min[1], min[2], maxX, maxY, maxZ);
	}
	
	@Override
	public Aabb3F set(float minX, float minY, float minZ, ITup3RF max)
	{
		return set(minX, minY, minZ, max.v0(), max.v1(), max.v2());
	}
	
	@Override
	public Aabb3F set(float minX, float minY, float minZ, float[] max)
	{
		return set(minX, minY, minZ, max[0], max[1], max[2]);
	}
	
	@Override
	public Aabb3F set(float minX, float minY, float minZ, float maxX, float maxY, float maxZ)
	{
		this.minX = MathUtils.min(minX, maxX);
		this.minY = MathUtils.min(minY, maxY);
		this.minZ = MathUtils.min(minZ, maxZ);
		this.maxX = MathUtils.max(minX, maxX);
		this.maxY = MathUtils.max(minY, maxY);
		this.maxZ = MathUtils.max(minZ, maxZ);
		
		return this;
	}
	
	@Override
	public Aabb3F setMin(ITup3RF min)
	{
		float minX = min.v0();
		float minY = min.v1();
		float minZ = min.v2();
		
		this.minX = MathUtils.min(this.maxX, minX);
		this.minY = MathUtils.min(this.maxY, minY);
		this.minZ = MathUtils.min(this.maxZ, minZ);
		
		this.maxX = MathUtils.max(this.maxX, minX);
		this.maxY = MathUtils.max(this.maxY, minY);
		this.maxZ = MathUtils.max(this.maxZ, minZ);
		
		return this;
	}

	@Override
	public Aabb3F setMin(float[] min)
	{
		float minX = min[0];
		float minY = min[1];
		float minZ = min[2];
		
		this.minX = MathUtils.min(this.maxX, minX);
		this.minY = MathUtils.min(this.maxY, minY);
		this.minZ = MathUtils.min(this.maxZ, minZ);
		
		this.maxX = MathUtils.max(this.maxX, minX);
		this.maxY = MathUtils.max(this.maxY, minY);
		this.maxZ = MathUtils.max(this.maxZ, minZ);
		
		return this;
	}

	@Override
	public Aabb3F setMin(float x, float y, float z)
	{
		this.minX = MathUtils.min(this.maxX, x);
		this.minY = MathUtils.min(this.maxY, y);
		this.minZ = MathUtils.min(this.maxZ, z);
		
		this.maxX = MathUtils.max(this.maxX, x);
		this.maxY = MathUtils.max(this.maxY, y);
		this.maxZ = MathUtils.max(this.maxZ, z);
		
		return this;
	}

	@Override
	public Aabb3F minX(float x)
	{
		this.minX = MathUtils.min(this.maxX, x);
		this.maxX = MathUtils.max(this.maxX, x);
		
		return this;
	}

	@Override
	public Aabb3F minY(float y)
	{
		this.minY = MathUtils.min(this.maxY, y);
		this.maxY = MathUtils.max(this.maxY, y);
		
		return this;
	}

	@Override
	public Aabb3F minZ(float z)
	{
		this.minZ = MathUtils.min(this.maxZ, z);
		this.maxZ = MathUtils.max(this.maxZ, z);
		
		return this;
	}

	@Override
	public Aabb3F setMax(ITup3RF max)
	{
		float maxX = max.v0();
		float maxY = max.v1();
		float maxZ = max.v2();
		
		this.maxX = MathUtils.max(this.minX, maxX);
		this.maxY = MathUtils.max(this.minY, maxY);
		this.maxZ = MathUtils.max(this.minZ, maxZ);
		
		this.minX = MathUtils.min(this.minX, maxX);
		this.minY = MathUtils.min(this.minY, maxY);
		this.minZ = MathUtils.min(this.minZ, maxZ);
		
		return this;
	}

	@Override
	public Aabb3F setMax(float[] max)
	{
		float maxX = max[0];
		float maxY = max[1];
		float maxZ = max[2];
		
		this.maxX = MathUtils.max(this.minX, maxX);
		this.maxY = MathUtils.max(this.minY, maxY);
		this.maxZ = MathUtils.max(this.minZ, maxZ);
		
		this.minX = MathUtils.min(this.minX, maxX);
		this.minY = MathUtils.min(this.minY, maxY);
		this.minZ = MathUtils.min(this.minZ, maxZ);
		
		return this;
	}

	@Override
	public Aabb3F setMax(float x, float y, float z)
	{
		this.maxX = MathUtils.max(this.minX, x);
		this.maxY = MathUtils.max(this.minY, y);
		this.maxZ = MathUtils.max(this.minZ, z);
		
		this.minX = MathUtils.min(this.minX, x);
		this.minY = MathUtils.min(this.minY, y);
		this.minZ = MathUtils.min(this.minZ, z);
		
		return this;
	}

	@Override
	public Aabb3F maxX(float x)
	{
		this.maxX = MathUtils.max(this.minX, x);
		this.minX = MathUtils.min(this.minX, x);
		
		return this;
	}

	@Override
	public Aabb3F maxY(float y)
	{
		this.maxY = MathUtils.max(this.minY, y);
		this.minY = MathUtils.min(this.minY, y);
		
		return this;
	}

	@Override
	public Aabb3F maxZ(float z)
	{
		this.maxZ = MathUtils.max(this.minZ, z);
		this.minZ = MathUtils.min(this.minZ, z);
		
		return this;
	}

	@Override
	public Aabb3F scale(ITup3RF t)
	{
		return scale(t.v0(), t.v1(), t.v2());
	}
	
	@Override
	public IAabb3WF scale(float[] t)
	{
		return scale(t[0], t[1], t[2]);
	}
	
	@Override
	public Aabb3F scale(float value)
	{
		return scale(value, value, value);
	}
	
	@Override
	public Aabb3F scale(float x, float y, float z)
	{
		return scaleT(x, y, z, this);
	}
	
	@Override
	public Aabb3F scaleN(ITup3RF t)
	{
		return scaleN(t.v0(), t.v1(), t.v2());
	}
	
	@Override
	public Aabb3F scaleN(float[] t)
	{
		return scaleN(t[0], t[1], t[2]);
	}
	
	@Override
	public Aabb3F scaleN(float value)
	{
		return scaleN(value, value, value);
	}
	
	@Override
	public Aabb3F scaleN(float x, float y, float z)
	{
		return scaleT(x, y, z, new Aabb3F());
	}
	
	@Override
	public <T extends IAabb3WF> T scaleT(ITup3RF t, @ExtractionParam T res)
	{
		return scaleT(t.v0(), t.v1(), t.v2(), res);
	}
	
	@Override
	public <T extends IAabb3WF> T scaleT(float[] t, T res)
	{
		return scaleT(t[0], t[1], t[2], res);
	}
	
	@Override
	public <T extends IAabb3WF> T scaleT(float value, @ExtractionParam T res)
	{
		return scaleT(value, value, value, res);
	}
	
	@Override
	public <T extends IAabb3WF> T scaleT(float x, float y, float z, @ExtractionParam T res)
	{
		res.set(this.minX * x,  this.minY * y, this.minZ * z, this.maxX * x, this.maxY * y, this.maxX * z);
		
		return res;
	}
	
	@Override
	public Aabb3F merge(IAabb3RF aabb)
	{
		return merge(aabb.minX(), aabb.minY(), aabb.minZ(), aabb.maxX(), aabb.maxY(), aabb.maxZ());
	}
	
	@Override
	public Aabb3F merge(ITup3RF min, ITup3RF max)
	{
		return merge(min.v0(), min.v1(), min.v2(), max.v0(), max.v1(), max.v2());
	}
	
	@Override
	public Aabb3F merge(ITup3RF min, float[] max)
	{
		return merge(min.v0(), min.v1(), min.v2(), max[0], max[1], max[2]);
	}
	
	@Override
	public Aabb3F merge(ITup3RF min, float maxX, float maxY, float maxZ)
	{
		return merge(min.v0(), min.v1(), min.v2(), maxX, maxY, maxZ);
	}
	
	@Override
	public Aabb3F merge(float[] min, ITup3RF max)
	{
		return merge(min[0], min[1], min[2], max.v0(), max.v1(), max.v2());
	}

	@Override
	public Aabb3F merge(float[] min, float[] max)
	{
		return merge(min[0], min[1], min[2], max[0], max[1], max[2]);
	}

	@Override
	public Aabb3F merge(float[] min, float maxX, float maxY, float maxZ)
	{
		return merge(min[0], min[1], min[2], maxX, maxY, maxZ);
	}
	
	@Override
	public Aabb3F merge(float minX, float minY, float minZ, ITup3RF max)
	{
		return merge(minX, minY, minZ, max.v0(), max.v1(), max.v2());
	}
	
	@Override
	public Aabb3F merge(float minX, float minY, float minZ, float[] max)
	{
		return merge(minX, minY, minZ, max[0], max[1], max[2]);
	}
	
	@Override
	public Aabb3F merge(float minX, float minY, float minZ, float maxX, float maxY, float maxZ)
	{
		return mergeT(minX, minY, minZ, maxX, maxY, maxZ, this);
	}
	
	@Override
	public IAabb3WF mergeN(IAabb3RF aabb)
	{
		return mergeN(aabb.minX(), aabb.minY(), aabb.minZ(), aabb.maxX(), aabb.maxY(), aabb.maxZ());
	}
	
	@Override
	public Aabb3F mergeN(ITup3RF min, ITup3RF max)
	{
		return mergeN(min.v0(), min.v1(), min.v2(), max.v0(), max.v1(), max.v2());
	}
	
	@Override
	public IAabb3WF mergeN(ITup3RF min, float[] max)
	{
		return mergeN(min.v0(), min.v1(), min.v2(), max[0], max[1], max[2]);
	}
	
	@Override
	public Aabb3F mergeN(ITup3RF min, float maxX, float maxY, float maxZ)
	{
		return mergeN(min.v0(), min.v1(), min.v2(), maxX, maxY, maxZ);
	}
	
	@Override
	public IAabb3WF mergeN(float[] min, ITup3RF max)
	{
		return mergeN(min[0], min[1], min[2], max.v0(), max.v1(), max.v2());
	}

	@Override
	public IAabb3WF mergeN(float[] min, float[] max)
	{
		return mergeN(min[0], min[1], min[2], max[0], max[1], max[2]);
	}

	@Override
	public IAabb3WF mergeN(float[] min, float maxX, float maxY, float maxZ)
	{
		return mergeN(min[0], min[1], min[2], maxX, maxY, maxZ);
	}
	
	@Override
	public Aabb3F mergeN(float minX, float minY, float minZ, ITup3RF max)
	{
		return mergeN(minX, minY, minZ, max.v0(), max.v1(), max.v2());
	}
	
	@Override
	public IAabb3WF mergeN(float minX, float minY, float minZ, float[] max)
	{
		return mergeN(minX, minY, minZ, max[0], max[1], max[2]);
	}
	
	@Override
	public Aabb3F mergeN(float minX, float minY, float minZ, float maxX, float maxY, float maxZ)
	{
		return mergeT(minX, minY, minZ, maxX, maxY, maxZ, new Aabb3F());
	}
	
	@Override
	public <T extends IAabb3WF> T mergeT(IAabb3RF aabb, T res)
	{
		return mergeT(aabb.minX(), aabb.minY(), aabb.minZ(), aabb.maxX(), aabb.maxY(), aabb.maxZ(), res);
	}
	
	@Override
	public <T extends IAabb3WF> T mergeT(ITup3RF min, ITup3RF max, @ExtractionParam T res)
	{
		return mergeT(min.v0(), min.v1(), min.v2(), max.v0(), max.v1(), max.v2(), res);
	}
	
	@Override
	public <T extends IAabb3WF> T mergeT(ITup3RF min, float[] max, T res)
	{
		return mergeT(min.v0(), min.v1(), min.v2(), max[0], max[1], max[2], res);
	}
	
	@Override
	public <T extends IAabb3WF> T mergeT(ITup3RF min, float maxX, float maxY, float maxZ, @ExtractionParam T res)
	{
		return mergeT(min.v0(), min.v1(), min.v2(), maxX, maxY, maxZ, res);
	}
	
	@Override
	public <T extends IAabb3WF> T mergeT(float[] min, ITup3RF max, T res)
	{
		return mergeT(min[0], min[1], min[2], max.v0(), max.v1(), max.v2(), res);
	}

	@Override
	public <T extends IAabb3WF> T mergeT(float[] min, float[] max, T res)
	{
		return mergeT(min[0], min[1], min[2], max[0], max[1], max[2], res);
	}

	@Override
	public <T extends IAabb3WF> T mergeT(float[] min, float maxX, float maxY, float maxZ, T res)
	{
		return mergeT(min[0], min[1], min[2], maxX, maxY, maxZ, res);
	}
	
	@Override
	public <T extends IAabb3WF> T mergeT(float minX, float minY, float minZ, ITup3RF max, @ExtractionParam T res)
	{
		return mergeT(minX, minY, minZ, max.v0(), max.v1(), max.v2(), res);
	}
	
	@Override
	public <T extends IAabb3WF> T mergeT(float minX, float minY, float minZ, float[] max, T res)
	{
		return mergeT(minX, minY, minZ, max[0], max[1], max[2], res);
	}
	
	@Override
	public <T extends IAabb3WF> T mergeT(float minX, float minY, float minZ, float maxX, float maxY, float maxZ, @ExtractionParam T res)
	{
		float newMinX = Math.min(this.minX, Math.min(minX, maxX));
		float newMinY = Math.min(this.minY, Math.min(minY, maxY));
		float newMinZ = Math.min(this.minZ, Math.min(minZ, maxZ));
		float newMaxX = Math.max(this.maxX, Math.max(minX, maxX));
		float newMaxY = Math.max(this.maxY, Math.max(minY, maxY));
		float newMaxZ = Math.max(this.maxZ, Math.max(minZ, maxZ));
		
		res.set(newMinX, newMinY, newMinZ, newMaxX, newMaxY, newMaxZ);
		
		return res;
	}
	
//	public boolean isInsideInclusive(Tup3fR t)
//	{
//		return isInsideInclusive(t.getX(), t.getY(), t.getZ());
//	}
//	
//	public boolean isInsideInclusive(float x, float y, float z)
//	{
//		if(this.maxX < x || x < this.minX) return false;
//		if(this.maxY < y || y < this.minY) return false;
//		if(this.maxZ < z || z < this.minZ) return false;
//		
//		return true;
//	}
//	
//	public boolean isInsideExclusive(Tup3fR t)
//	{
//		return isInsideExclusive(t.getX(), t.getY(), t.getZ());
//	}
//	
//	public boolean isInsideExclusive(float x, float y, float z)
//	{
//		if(this.maxX <= x || x <= this.minX) return false;
//		if(this.maxY <= y || y <= this.minY) return false;
//		if(this.maxZ <= z || z <= this.minZ) return false;
//		
//		return true;
//	}
//	
//	public boolean isOnSurface(Tup3fR t)
//	{
//		return isOnSurface(t.getX(), t.getY(), t.getZ());
//	}
//	
//	public boolean isOnSurface(float x, float y, float z)
//	{
//		if(maxX < x || x < minX) return false;
//		if(maxY < y || y < minY) return false;
//		if(maxZ < z || z < minZ) return false;
//		
//		if(x == minX || x == maxX) return true;
//		if(y == minY || y == maxY) return true;
//		if(z == minZ || z == maxZ) return true;
//		
//		return false;
//	}
	
	/** {@inheritDoc}} */
	@Override
	public String toString()
	{
		return "aabb3f(min=(" + this.minX + ", " + this.minY + ", " + this.minZ + "), max=(" + this.maxX + ", " + this.maxY + ", " + this.maxZ +  "))";
	}
	
}
