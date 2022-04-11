package org.barghos.math.bounds;

import org.barghos.core.api.tuple2.Tup2fR;
import org.barghos.core.api.tuple2.Tup2fBase;
import org.barghos.math.api.point.Point2fR;
import org.barghos.math.api.vector.Vec2fR;
import org.barghos.math.api.vector.Vec2fBase;
import org.barghos.math.point.Point2f;
import org.barghos.math.vector.Vec2f;

public class AABB2f
{
	protected float minX;
	protected float minY;
	protected float maxX;
	protected float maxY;
	
	public AABB2f()
	{
		set(0, 0, 1, 1);
	}
	
	public AABB2f(AABB2f aabb)
	{
		set(aabb);
	}
	
	public AABB2f(Tup2fR min, Tup2fR max)
	{
		set(min, max);
	}
	
	public AABB2f(Tup2fR min, float maxX, float maxY)
	{
		set(min, maxX, maxY);
	}
	
	public AABB2f(float minX, float minY, Tup2fR max)
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
	
	public AABB2f set(Tup2fR min, Tup2fR max)
	{
		return set(min.getX(), min.getY(), max.getX(), max.getY());
	}
	
	public AABB2f set(Tup2fR min, float maxX, float maxY)
	{
		return set(min.getX(), min.getY(), maxX, maxY);
	}
	
	public AABB2f set(float minX, float minY, Tup2fR max)
	{
		return set(minX, minY, max.getX(), max.getY());
	}
	
	public AABB2f set(float minX, float minY, float maxX, float maxY)
	{
		this.minX = Math.min(minX, maxX);
		this.minY = Math.min(minY, maxY);
		this.maxX = Math.max(minX, maxX);
		this.maxY = Math.max(minY, maxY);
		
		return this;
	}

	public Point2fR getMinAsPoint()
	{
		return new Point2f(this.minX, this.minY);
	}
	
	public Vec2fR getMinAsVector()
	{
		return new Vec2f(this.minX, this.minY);
	}
	
	public float getMinX()
	{
		return this.minX;
	}
	
	public float getMinY()
	{
		return this.minY;
	}
	
	public <T extends Tup2fBase> T getMin(T res)
	{
		res.set(this.minX, this.minY);
		
		return res;
	}
	
	public Point2fR getMaxAsPoint()
	{
		return new Point2f(this.maxX, this.maxY);
	}
	
	public Vec2fR getMaxAsVector()
	{
		return new Vec2f(this.maxX, this.maxY);
	}
	
	public float getMaxX()
	{
		return this.maxX;
	}
	
	public float getMaxY()
	{
		return this.maxY;
	}
	
	public <T extends Tup2fBase> T getMax(T res)
	{
		res.set(this.maxX, this.maxY);
		
		return res;
	}
	
	public Vec2fR getSize()
	{
		return getSize(new Vec2f());
	}
	
	public <T extends Vec2fBase> T getSize(T res)
	{
		res.set(getSizeX(), getSizeY());
		
		return res;
	}
	
	public float getSizeX()
	{
		return this.maxX - this.minX;
	}
	
	public float getSizeY()
	{
		return this.maxY - this.minY;
	}
	
	public Point2fR getCenterAsPoint()
	{
		return getCenter(new Point2f());
	}
	
	public Vec2fR getCenterAsVector()
	{
		return getCenter(new Vec2f());
	}
	
	public <T extends Tup2fBase> T getCenter(T res)
	{
		res.set(getCenterX(), getCenterY());
		
		return res;
	}
	
	public float getCenterX()
	{
		return (this.minX + this.maxX) * 0.5f;
	}
	
	public float getCenterY()
	{
		return (this.minY + this.maxY * 0.5f);
	}
	
	public AABB2f scale(Tup2fR t)
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
	
	public AABB2f scaleN(Tup2fR t)
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
	
	public AABB2f scaleR(Tup2fR t, AABB2f res)
	{
		return scaleR(t.getX(), t.getY(), res);
	}
	
	public AABB2f scaleR(float value, AABB2f res)
	{
		return scaleR(value, value, res);
	}
	
	public AABB2f scaleR(float x, float y, AABB2f res)
	{
		res.set(this.minX * x,  this.minY * y, this.maxX * x, this.maxY * y);
		
		return res;
	}
	
	public AABB2f merge(Tup2fR min, Tup2fR max)
	{
		return merge(min.getX(), min.getY(), max.getX(), max.getY());
	}
	
	public AABB2f merge(Tup2fR min, float maxX, float maxY)
	{
		return merge(min.getX(), min.getY(), maxX, maxY);
	}
	
	public AABB2f merge(float minX, float minY, Tup2fR max)
	{
		return merge(minX, minY, max.getX(), max.getY());
	}
	
	public AABB2f merge(float minX, float minY, float maxX, float maxY)
	{
		return mergeR(minX, minY, maxX, maxY, this);
	}
	
	public AABB2f mergeN(Tup2fR min, Tup2fR max)
	{
		return mergeN(min.getX(), min.getY(), max.getX(), max.getY());
	}
	
	public AABB2f mergeN(Tup2fR min, float maxX, float maxY)
	{
		return mergeN(min.getX(), min.getY(), maxX, maxY);
	}
	
	public AABB2f mergeN(float minX, float minY, Tup2fR max)
	{
		return mergeN(minX, minY, max.getX(), max.getY());
	}
	
	public AABB2f mergeN(float minX, float minY, float maxX, float maxY)
	{
		return mergeR(minX, minY, maxX, maxY, new AABB2f());
	}
	
	public AABB2f mergeR(Tup2fR min, Tup2fR max, AABB2f res)
	{
		return mergeR(min.getX(), min.getY(), max.getX(), max.getY(), res);
	}
	
	public AABB2f mergeR(Tup2fR min, float maxX, float maxY, AABB2f res)
	{
		return mergeR(min.getX(), min.getY(), maxX, maxY, res);
	}
	
	public AABB2f mergeR(float minX, float minY, Tup2fR max, AABB2f res)
	{
		return mergeR(minX, minY, max.getX(), max.getY(), res);
	}
	
	public AABB2f mergeR(float minX, float minY, float maxX, float maxY, AABB2f res)
	{
		float newMinX = Math.min(this.minX, Math.min(minX, maxX));
		float newMinY = Math.min(this.minY, Math.min(minY, maxY));
		float newMaxX = Math.max(this.maxX, Math.max(minX, maxX));
		float newMaxY = Math.max(this.maxY, Math.max(minY, maxY));
		
		res.set(newMinX, newMinY, newMaxX, newMaxY);
		
		return res;
	}
	
	public boolean isInsideInclusive(Tup2fR t)
	{
		return isInsideInclusive(t.getX(), t.getY());
	}
	
	public boolean isInsideInclusive(float x, float y)
	{
		if(this.maxX < x || x < this.minX) return false;
		if(this.maxY < y || y < this.minY) return false;
		
		return true;
	}
	
	public boolean isInsideExclusive(Tup2fR t)
	{
		return isInsideExclusive(t.getX(), t.getY());
	}
	
	public boolean isInsideExclusive(float x, float y)
	{
		if(this.maxX <= x || x <= this.minX) return false;
		if(this.maxY <= y || y <= this.minY) return false;
		
		return true;
	}
	
	public boolean isOnSurface(Tup2fR t)
	{
		return isOnSurface(t.getX(), t.getY());
	}
	
	public boolean isOnSurface(float x, float y)
	{
		if(maxX < x || x < minX) return false;
		if(maxY < y || y < minY) return false;
		
		if(x == minX || x == maxX) return true;
		if(y == minY || y == maxY) return true;
		
		return false;
	}
	
	/** {@inheritDoc}} */
	@Override
	public String toString()
	{
		return "aabb2f(min=(" + this.minX + ", " + this.minY + "), max=(" + this.maxX + ", " + this.maxY +  "))";
	}
	
	/** {@inheritDoc} */
	@Override
	public AABB2f clone()
	{
		return new AABB2f(this);
	}
}
