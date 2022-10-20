//package org.barghos.math.bounds;
//
//import org.barghos.core.api.tuple3.Tup3fR;
//import org.barghos.core.api.tuple3.Tup3fC;
//import org.barghos.math.api.vector.Vec3fR;
//import org.barghos.math.api.vector.Vec3fC;
//import org.barghos.math.vector.Vec3f;
//
//public class AABB3f
//{
//	protected float minX;
//	protected float minY;
//	protected float minZ;
//	protected float maxX;
//	protected float maxY;
//	protected float maxZ;
//	
//	public AABB3f()
//	{
//		set(0, 0, 0, 1, 1, 1);
//	}
//	
//	public AABB3f(AABB3f aabb)
//	{
//		set(aabb);
//	}
//	
//	public AABB3f(Tup3fR min, Tup3fR max)
//	{
//		set(min, max);
//	}
//	
//	public AABB3f(Tup3fR min, float maxX, float maxY, float maxZ)
//	{
//		set(min, maxX, maxY, maxZ);
//	}
//	
//	public AABB3f(float minX, float minY, float minZ, Tup3fR max)
//	{
//		set(minX, minY, minZ, max);
//	}
//	
//	public AABB3f(float minX, float minY, float minZ, float maxX, float maxY, float maxZ)
//	{
//		set(minX, minY, minZ, maxX, maxY, maxZ);
//	}
//	
//	public AABB3f set(AABB3f aabb)
//	{
//		return set(aabb.getMinX(), aabb.getMinY(), aabb.getMinZ(), aabb.getMaxX(), aabb.getMaxY(), aabb.getMaxZ());
//	}
//	
//	public AABB3f set(Tup3fR min, Tup3fR max)
//	{
//		return set(min.getX(), min.getY(), min.getZ(), max.getX(), max.getY(), max.getZ());
//	}
//	
//	public AABB3f set(Tup3fR min, float maxX, float maxY, float maxZ)
//	{
//		return set(min.getX(), min.getY(), min.getZ(), maxX, maxY, maxZ);
//	}
//	
//	public AABB3f set(float minX, float minY, float minZ, Tup3fR max)
//	{
//		return set(minX, minY, minZ, max.getX(), max.getY(), max.getZ());
//	}
//	
//	public AABB3f set(float minX, float minY, float minZ, float maxX, float maxY, float maxZ)
//	{
//		this.minX = Math.min(minX, maxX);
//		this.minY = Math.min(minY, maxY);
//		this.minZ = Math.min(minZ, maxZ);
//		this.maxX = Math.max(minX, maxX);
//		this.maxY = Math.max(minY, maxY);
//		this.maxZ = Math.max(minZ, maxZ);
//		
//		return this;
//	}
//	
//	public Vec3fR getMinAsVector()
//	{
//		return new Vec3f(this.minX, this.minY, this.minZ);
//	}
//	
//	public float getMinX()
//	{
//		return this.minX;
//	}
//	
//	public float getMinY()
//	{
//		return this.minY;
//	}
//	
//	public float getMinZ()
//	{
//		return this.minZ;
//	}
//	
//	public <T extends Tup3fC> T getMin(T res)
//	{
//		res.set(this.minX, this.minY, this.minZ);
//		
//		return res;
//	}
//	
//	public Vec3fR getMaxAsVector()
//	{
//		return new Vec3f(this.maxX, this.maxY, this.maxZ);
//	}
//	
//	public float getMaxX()
//	{
//		return this.maxX;
//	}
//	
//	public float getMaxY()
//	{
//		return this.maxY;
//	}
//	
//	public float getMaxZ()
//	{
//		return this.maxZ;
//	}
//	
//	public <T extends Tup3fC> T getMax(T res)
//	{
//		res.set(this.maxX, this.maxY, this.maxZ);
//		
//		return res;
//	}
//	
//	public Vec3fR getSize()
//	{
//		return getSize(new Vec3f());
//	}
//	
//	public <T extends Vec3fC> T getSize(T res)
//	{
//		res.set(getSizeX(), getSizeY(), getSizeZ());
//		
//		return res;
//	}
//	
//	public float getSizeX()
//	{
//		return this.maxX - this.minX;
//	}
//	
//	public float getSizeY()
//	{
//		return this.maxY - this.minY;
//	}
//	
//	public float getSizeZ()
//	{
//		return this.maxZ - this.minZ;
//	}
//	
//	public Vec3fR getCenterAsVector()
//	{
//		return getCenter(new Vec3f());
//	}
//	
//	public <T extends Tup3fC> T getCenter(T res)
//	{
//		res.set(getCenterX(), getCenterY(), getCenterZ());
//		
//		return res;
//	}
//	
//	public float getCenterX()
//	{
//		return (this.minX + this.maxX) * 0.5f;
//	}
//	
//	public float getCenterY()
//	{
//		return (this.minY + this.maxY * 0.5f);
//	}
//	
//	public float getCenterZ()
//	{
//		return (this.minZ + this.maxZ * 0.5f);
//	}
//	
//	public AABB3f scale(Tup3fR t)
//	{
//		return scale(t.getX(), t.getY(), t.getZ());
//	}
//	
//	public AABB3f scale(float value)
//	{
//		return scale(value, value, value);
//	}
//	
//	public AABB3f scale(float x, float y, float z)
//	{
//		return scaleR(x, y, z, this);
//	}
//	
//	public AABB3f scaleN(Tup3fR t)
//	{
//		return scaleN(t.getX(), t.getY(), t.getZ());
//	}
//	
//	public AABB3f scaleN(float value)
//	{
//		return scaleN(value, value, value);
//	}
//	
//	public AABB3f scaleN(float x, float y, float z)
//	{
//		return scaleR(x, y, z, new AABB3f());
//	}
//	
//	public AABB3f scaleR(Tup3fR t, AABB3f res)
//	{
//		return scaleR(t.getX(), t.getY(), t.getZ(), res);
//	}
//	
//	public AABB3f scaleR(float value, AABB3f res)
//	{
//		return scaleR(value, value, value, res);
//	}
//	
//	public AABB3f scaleR(float x, float y, float z, AABB3f res)
//	{
//		res.set(this.minX * x,  this.minY * y, this.minZ * z, this.maxX * x, this.maxY * y, this.maxX * z);
//		
//		return res;
//	}
//	
//	public AABB3f merge(Tup3fR min, Tup3fR max)
//	{
//		return merge(min.getX(), min.getY(), min.getZ(), max.getX(), max.getY(), max.getZ());
//	}
//	
//	public AABB3f merge(Tup3fR min, float maxX, float maxY, float maxZ)
//	{
//		return merge(min.getX(), min.getY(), min.getZ(), maxX, maxY, maxZ);
//	}
//	
//	public AABB3f merge(float minX, float minY, float minZ, Tup3fR max)
//	{
//		return merge(minX, minY, minZ, max.getX(), max.getY(), max.getZ());
//	}
//	
//	public AABB3f merge(float minX, float minY, float minZ, float maxX, float maxY, float maxZ)
//	{
//		return mergeR(minX, minY, minZ, maxX, maxY, maxZ, this);
//	}
//	
//	public AABB3f mergeN(Tup3fR min, Tup3fR max)
//	{
//		return mergeN(min.getX(), min.getY(), min.getZ(), max.getX(), max.getY(), max.getZ());
//	}
//	
//	public AABB3f mergeN(Tup3fR min, float maxX, float maxY, float maxZ)
//	{
//		return mergeN(min.getX(), min.getY(), min.getZ(), maxX, maxY, maxZ);
//	}
//	
//	public AABB3f mergeN(float minX, float minY, float minZ, Tup3fR max)
//	{
//		return mergeN(minX, minY, minZ, max.getX(), max.getY(), max.getZ());
//	}
//	
//	public AABB3f mergeN(float minX, float minY, float minZ, float maxX, float maxY, float maxZ)
//	{
//		return mergeR(minX, minY, minZ, maxX, maxY, maxZ, new AABB3f());
//	}
//	
//	public AABB3f mergeR(Tup3fR min, Tup3fR max, AABB3f res)
//	{
//		return mergeR(min.getX(), min.getY(), min.getZ(), max.getX(), max.getY(), max.getZ(), res);
//	}
//	
//	public AABB3f mergeR(Tup3fR min, float maxX, float maxY, AABB3f res)
//	{
//		return mergeR(min.getX(), min.getY(), min.getZ(), maxX, maxY, maxZ, res);
//	}
//	
//	public AABB3f mergeR(float minX, float minY, Tup3fR max, AABB3f res)
//	{
//		return mergeR(minX, minY, minZ, max.getX(), max.getY(), max.getZ(), res);
//	}
//	
//	public AABB3f mergeR(float minX, float minY, float minZ, float maxX, float maxY, float maxZ, AABB3f res)
//	{
//		float newMinX = Math.min(this.minX, Math.min(minX, maxX));
//		float newMinY = Math.min(this.minY, Math.min(minY, maxY));
//		float newMinZ = Math.min(this.minZ, Math.min(minZ, maxZ));
//		float newMaxX = Math.max(this.maxX, Math.max(minX, maxX));
//		float newMaxY = Math.max(this.maxY, Math.max(minY, maxY));
//		float newMaxZ = Math.max(this.maxZ, Math.max(minZ, maxZ));
//		
//		res.set(newMinX, newMinY, newMinZ, newMaxX, newMaxY, newMaxZ);
//		
//		return res;
//	}
//	
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
//	
//	/** {@inheritDoc}} */
//	@Override
//	public String toString()
//	{
//		return "aabb3f(min=(" + this.minX + ", " + this.minY + ", " + this.minZ + "), max=(" + this.maxX + ", " + this.maxY + ", " + this.maxZ +  "))";
//	}
//	
//	/** {@inheritDoc} */
//	@Override
//	public AABB3f clone()
//	{
//		return new AABB3f(this);
//	}
//}
