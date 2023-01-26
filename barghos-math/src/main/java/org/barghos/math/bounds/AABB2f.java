package org.barghos.math.bounds;

import org.barghos.math.api.vector.Vec2fR;
import org.barghos.math.api.vector.Vec2fUtils;
import org.barghos.math.api.vector.SimpleVec2fC;
import org.barghos.math.api.vector.SimpleVec2fR;
import org.barghos.math.api.vector.Vec2fC;
import org.barghos.math.vector.Vec2f;

public class AABB2f
{
	protected float[] min = new float[2];
	protected float[] max = new float[2];
	
	public AABB2f()
	{
		set(0, 0, 1, 1);
	}
	
	public AABB2f(AABB2f aabb)
	{
		set(aabb);
	}
	
	public AABB2f(SimpleVec2fR min, SimpleVec2fR max)
	{
		set(min, max);
	}
	
	public AABB2f(SimpleVec2fR min, float maxX, float maxY)
	{
		set(min, maxX, maxY);
	}
	
	public AABB2f(float minX, float minY, SimpleVec2fR max)
	{
		set(minX, minY, max);
	}
	
	public AABB2f(float minX, float minY, float maxX, float maxY)
	{
		set(minX, minY, maxX, maxY);
	}
	
	public AABB2f set(AABB2f aabb)
	{
		return set(aabb.getMinX(), aabb.getMinY(), aabb.getMaxX(), aabb.getMaxY());
	}
	
	public AABB2f set(SimpleVec2fR min, SimpleVec2fR max)
	{
		return set(min.getX(), min.getY(), max.getX(), max.getY());
	}
	
	public AABB2f set(SimpleVec2fR min, float maxX, float maxY)
	{
		return set(min.getX(), min.getY(), maxX, maxY);
	}
	
	public AABB2f set(float minX, float minY, SimpleVec2fR max)
	{
		return set(minX, minY, max.getX(), max.getY());
	}
	
	public AABB2f set(float minX, float minY, float maxX, float maxY)
	{
		Vec2fUtils.minVector(minX, minY, maxX, maxY, this.min);
		Vec2fUtils.maxVector(minX, minY, maxX, maxY, this.max);
		
		return this;
	}
	
	public Vec2fR getMinAsVector()
	{
		return new Vec2f(this.min);
	}
	
	public float getMinX()
	{
		return this.min[0];
	}
	
	public float getMinY()
	{
		return this.min[1];
	}
	
	public <T extends SimpleVec2fC> T getMin(T res)
	{
		res.setArray(this.min);
		
		return res;
	}
	
	public Vec2fR getMaxAsVector()
	{
		return new Vec2f(this.max);
	}
	
	public float getMaxX()
	{
		return this.max[0];
	}
	
	public float getMaxY()
	{
		return this.max[1];
	}
	
	public <T extends SimpleVec2fC> T getMax(T res)
	{
		res.setArray(this.max);
		
		return res;
	}
	
	public Vec2fR getSize()
	{
		return getSize(new Vec2f());
	}
	
	public <T extends Vec2fC> T getSize(T res)
	{
		res.set(getSizeX(), getSizeY());
		
		return res;
	}
	
	public float getSizeX()
	{
		return this.max[0] - this.min[0];
	}
	
	public float getSizeY()
	{
		return this.max[1] - this.min[1];
	}
	
	public Vec2fR getCenterAsVector()
	{
		return getCenter(new Vec2f());
	}
	
	public <T extends SimpleVec2fC> T getCenter(T res)
	{
		res.set(getCenterX(), getCenterY());
		
		return res;
	}
	
	public float getCenterX()
	{
		return (this.min[0] + this.max[0]) * 0.5f;
	}
	
	public float getCenterY()
	{
		return (this.min[0] + this.max[1] * 0.5f);
	}
	
	public AABB2f scale(SimpleVec2fR t)
	{
		return scale(t.getX(), t.getY());
	}
	
	public AABB2f scale(float value)
	{
		return scale(value, value);
	}
	
	public AABB2f scale(float x, float y)
	{
		return scaleR(x, y, this);
	}
	
	public AABB2f scaleN(SimpleVec2fR t)
	{
		return scaleN(t.getX(), t.getY());
	}
	
	public AABB2f scaleN(float value)
	{
		return scaleN(value, value);
	}
	
	public AABB2f scaleN(float x, float y)
	{
		return scaleR(x, y, new AABB2f());
	}
	
	public AABB2f scaleR(SimpleVec2fR t, AABB2f res)
	{
		return scaleR(t.getX(), t.getY(), res);
	}
	
	public AABB2f scaleR(float value, AABB2f res)
	{
		return scaleR(value, value, res);
	}
	
	public AABB2f scaleR(float x, float y, AABB2f res)
	{
		res.set(this.min[0] * x,  this.min[1] * y, this.max[0] * x, this.max[1] * y);
		
		return res;
	}
	
	public AABB2f merge(SimpleVec2fR min, SimpleVec2fR max)
	{
		return merge(min.getX(), min.getY(), max.getX(), max.getY());
	}
	
	public AABB2f merge(SimpleVec2fR min, float maxX, float maxY)
	{
		return merge(min.getX(), min.getY(), maxX, maxY);
	}
	
	public AABB2f merge(float minX, float minY, SimpleVec2fR max)
	{
		return merge(minX, minY, max.getX(), max.getY());
	}
	
	public AABB2f merge(float minX, float minY, float maxX, float maxY)
	{
		return mergeR(minX, minY, maxX, maxY, this);
	}
	
	public AABB2f mergeN(SimpleVec2fR min, SimpleVec2fR max)
	{
		return mergeN(min.getX(), min.getY(), max.getX(), max.getY());
	}
	
	public AABB2f mergeN(SimpleVec2fR min, float maxX, float maxY)
	{
		return mergeN(min.getX(), min.getY(), maxX, maxY);
	}
	
	public AABB2f mergeN(float minX, float minY, SimpleVec2fR max)
	{
		return mergeN(minX, minY, max.getX(), max.getY());
	}
	
	public AABB2f mergeN(float minX, float minY, float maxX, float maxY)
	{
		return mergeR(minX, minY, maxX, maxY, new AABB2f());
	}
	
	public AABB2f mergeR(SimpleVec2fR min, SimpleVec2fR max, AABB2f res)
	{
		return mergeR(min.getX(), min.getY(), max.getX(), max.getY(), res);
	}
	
	public AABB2f mergeR(SimpleVec2fR min, float maxX, float maxY, AABB2f res)
	{
		return mergeR(min.getX(), min.getY(), maxX, maxY, res);
	}
	
	public AABB2f mergeR(float minX, float minY, SimpleVec2fR max, AABB2f res)
	{
		return mergeR(minX, minY, max.getX(), max.getY(), res);
	}
	
	public AABB2f mergeR(float minX, float minY, float maxX, float maxY, AABB2f res)
	{
		float[] newMin = Vec2fUtils.minVector(this.min, Math.min(minX, maxX),  Math.min(minY, maxY), new float[2]);
		float[] newMax = Vec2fUtils.maxVector(this.min, Math.max(minX, maxX),  Math.max(minY, maxY), new float[2]);
		
		res.set(newMin[0], newMin[1], newMax[0], newMax[1]);
		
		return res;
	}
	
	public boolean isInside(SimpleVec2fR t)
	{
		return isInside(t.getX(), t.getY());
	}
	
	public boolean isInside(float x, float y)
	{
		if(this.max[0] < x || x < this.min[0]) return false;
		if(this.max[1] < y || y < this.min[1]) return false;
		
		return true;
	}
	
	public boolean isOnSurface(SimpleVec2fR t)
	{
		return isOnSurface(t.getX(), t.getY());
	}
	
	public boolean isOnSurface(float x, float y)
	{
		if(max[0] < x || x < min[0]) return false;
		if(max[1] < y || y < min[1]) return false;
		
		if(x == min[0] || x == max[0]) return true;
		if(y == min[1] || y == max[1]) return true;
		
		return false;
	}
	
	/** {@inheritDoc}} */
	@Override
	public String toString()
	{
		return "aabb2f(min=(" + this.min[0] + ", " + this.min[1] + "), max=(" + this.max[0] + ", " + this.max[1] +  "))";
	}
	
	/** {@inheritDoc} */
	@Override
	public AABB2f clone()
	{
		return new AABB2f(this);
	}
}
