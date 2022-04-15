package org.barghos.math.bounds;

import org.barghos.core.api.tuple2.Tup2dC;
import org.barghos.core.api.tuple2.Tup2dR;
import org.barghos.math.api.point.Point2dR;
import org.barghos.math.api.vector.Vec2dR;
import org.barghos.math.api.vector.Vec2dC;
import org.barghos.math.point.Point2d;
import org.barghos.math.vector.Vec2d;

public class AABB2d
{
	protected double minX;
	protected double minY;
	protected double maxX;
	protected double maxY;
	
	public AABB2d()
	{
		set(0, 0, 1, 1);
	}
	
	public AABB2d(AABB2d aabb)
	{
		set(aabb);
	}
	
	public AABB2d(Tup2dR min, Tup2dR max)
	{
		set(min, max);
	}
	
	public AABB2d(Tup2dR min, double maxX, double maxY)
	{
		set(min, maxX, maxY);
	}
	
	public AABB2d(double minX, double minY, Tup2dR max)
	{
		set(minX, minY, max);
	}
	
	public AABB2d(double minX, double minY, double maxX, double maxY)
	{
		set(minX, minY, maxX, maxY);
	}
	
	public AABB2d set(AABB2d aabb)
	{
		return set(aabb.getMinX(), aabb.getMinY(), aabb.getMaxX(), aabb.getMaxY());
	}
	
	public AABB2d set(Tup2dR min, Tup2dR max)
	{
		return set(min.getX(), min.getY(), max.getX(), max.getY());
	}
	
	public AABB2d set(Tup2dR min, double maxX, double maxY)
	{
		return set(min.getX(), min.getY(), maxX, maxY);
	}
	
	public AABB2d set(double minX, double minY, Tup2dR max)
	{
		return set(minX, minY, max.getX(), max.getY());
	}
	
	public AABB2d set(double minX, double minY, double maxX, double maxY)
	{
		this.minX = Math.min(minX, maxX);
		this.minY = Math.min(minY, maxY);
		this.maxX = Math.max(minX, maxX);
		this.maxY = Math.max(minY, maxY);
		
		return this;
	}

	public Point2dR getMinAsPoint()
	{
		return new Point2d(this.minX, this.minY);
	}
	
	public Vec2dR getMinAsVector()
	{
		return new Vec2d(this.minX, this.minY);
	}
	
	public double getMinX()
	{
		return this.minX;
	}
	
	public double getMinY()
	{
		return this.minY;
	}
	
	public <T extends Tup2dC> T getMin(T res)
	{
		res.set(this.minX, this.minY);
		
		return res;
	}
	
	public Point2dR getMaxAsPoint()
	{
		return new Point2d(this.maxX, this.maxY);
	}
	
	public Vec2dR getMaxAsVector()
	{
		return new Vec2d(this.maxX, this.maxY);
	}
	
	public double getMaxX()
	{
		return this.maxX;
	}
	
	public double getMaxY()
	{
		return this.maxY;
	}
	
	public <T extends Tup2dC> T getMax(T res)
	{
		res.set(this.maxX, this.maxY);
		
		return res;
	}
	
	public Vec2dR getSize()
	{
		return getSize(new Vec2d());
	}
	
	public <T extends Vec2dC> T getSize(T res)
	{
		res.set(getSizeX(), getSizeY());
		
		return res;
	}
	
	public double getSizeX()
	{
		return this.maxX - this.minX;
	}
	
	public double getSizeY()
	{
		return this.maxY - this.minY;
	}
	
	public Point2dR getCenterAsPoint()
	{
		return getCenter(new Point2d());
	}
	
	public Vec2dR getCenterAsVector()
	{
		return getCenter(new Vec2d());
	}
	
	public <T extends Tup2dC> T getCenter(T res)
	{
		res.set(getCenterX(), getCenterY());
		
		return res;
	}
	
	public double getCenterX()
	{
		return (this.minX + this.maxX) * 0.5;
	}
	
	public double getCenterY()
	{
		return (this.minY + this.maxY * 0.5);
	}
	
	public AABB2d scale(Tup2dR t)
	{
		return scale(t.getX(), t.getY());
	}
	
	public AABB2d scale(double value)
	{
		return scale(value, value);
	}
	
	public AABB2d scale(double x, double y)
	{
		return scaleR(x, y, this);
	}
	
	public AABB2d scaleN(Tup2dR t)
	{
		return scaleN(t.getX(), t.getY());
	}
	
	public AABB2d scaleN(double value)
	{
		return scaleN(value, value);
	}
	
	public AABB2d scaleN(double x, double y)
	{
		return scaleR(x, y, new AABB2d());
	}
	
	public AABB2d scaleR(Tup2dR t, AABB2d res)
	{
		return scaleR(t.getX(), t.getY(), res);
	}
	
	public AABB2d scaleR(double value, AABB2d res)
	{
		return scaleR(value, value, res);
	}
	
	public AABB2d scaleR(double x, double y, AABB2d res)
	{
		res.set(this.minX * x,  this.minY * y, this.maxX * x, this.maxY * y);
		
		return res;
	}
	
	public AABB2d merge(Tup2dR min, Tup2dR max)
	{
		return merge(min.getX(), min.getY(), max.getX(), max.getY());
	}
	
	public AABB2d merge(Tup2dR min, double maxX, double maxY)
	{
		return merge(min.getX(), min.getY(), maxX, maxY);
	}
	
	public AABB2d merge(double minX, double minY, Tup2dR max)
	{
		return merge(minX, minY, max.getX(), max.getY());
	}
	
	public AABB2d merge(double minX, double minY, double maxX, double maxY)
	{
		return mergeR(minX, minY, maxX, maxY, this);
	}
	
	public AABB2d mergeN(Tup2dR min, Tup2dR max)
	{
		return mergeN(min.getX(), min.getY(), max.getX(), max.getY());
	}
	
	public AABB2d mergeN(Tup2dR min, double maxX, double maxY)
	{
		return mergeN(min.getX(), min.getY(), maxX, maxY);
	}
	
	public AABB2d mergeN(double minX, double minY, Tup2dR max)
	{
		return mergeN(minX, minY, max.getX(), max.getY());
	}
	
	public AABB2d mergeN(double minX, double minY, double maxX, double maxY)
	{
		return mergeR(minX, minY, maxX, maxY, new AABB2d());
	}
	
	public AABB2d mergeR(Tup2dR min, Tup2dR max, AABB2d res)
	{
		return mergeR(min.getX(), min.getY(), max.getX(), max.getY(), res);
	}
	
	public AABB2d mergeR(Tup2dR min, double maxX, double maxY, AABB2d res)
	{
		return mergeR(min.getX(), min.getY(), maxX, maxY, res);
	}
	
	public AABB2d mergeR(double minX, double minY, Tup2dR max, AABB2d res)
	{
		return mergeR(minX, minY, max.getX(), max.getY(), res);
	}
	
	public AABB2d mergeR(double minX, double minY, double maxX, double maxY, AABB2d res)
	{
		double newMinX = Math.min(this.minX, Math.min(minX, maxX));
		double newMinY = Math.min(this.minY, Math.min(minY, maxY));
		double newMaxX = Math.max(this.maxX, Math.max(minX, maxX));
		double newMaxY = Math.max(this.maxY, Math.max(minY, maxY));
		
		res.set(newMinX, newMinY, newMaxX, newMaxY);
		
		return res;
	}
	
	public String toString()
	{
		return "aabb2d(min=(" + this.minX + ", " + this.minY + "), max=(" + this.maxX + ", " + this.maxY +  "))";
	}
	
	/** {@inheritDoc} */
	@Override
	public AABB2d clone()
	{
		return new AABB2d(this);
	}
}
