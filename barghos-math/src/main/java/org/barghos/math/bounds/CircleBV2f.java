package org.barghos.math.bounds;

import org.barghos.core.api.tuple2.Tup2fBase;
import org.barghos.core.api.tuple2.Tup2fR;
import org.barghos.math.api.bounds.BoundingVolume2f;
import org.barghos.math.api.vector.Vec2fUtil;

import org.barghos.math.point.Point2f;
import org.barghos.math.vector.Vec2f;

/**
 * This class represents a 2-dimensional float circle bouding volume.
 * It is used for intersections (i.e. collision detection).
 * 
 * @author picatrix1899
 */
public class CircleBV2f implements BoundingVolume2f
{
	protected float cX;
	protected float cY;
	protected float radius;
	
	/**
	 * Creates a new instance of a circle bounding volume equal to the unit circle.
	 * Thus its center is the origin (0 / 0) and the radius is 1.
	 */
	public CircleBV2f()
	{
		set(0.0f, 0.0f, 1.0f);
	}
	
	/**
	 * Creates a new instance of a circle bounding volume with the given center point and
	 * radius.
	 * @param c The center point.
	 * @param radius The radius.
	 */
	public CircleBV2f(Tup2fR c, float radius)
	{
		set(c, radius);
	}
	
	/**
	 * Creates a new instance of a circle bounding volume with the given center point defined by the components 
	 * and a radius.
	 * @param cX The value of the x component of the center point.
	 * @param cY The value of the y component of the center point.
	 * @param radius The radius.
	 */
	public CircleBV2f(float cX, float cY, float radius)
	{
		set(cX, cY, radius);
	}
	
	public CircleBV2f set(Tup2fR c, float radius)
	{
		return set(c.getX(), c.getY(), radius);
	}
	
	public CircleBV2f set(float cX, float cY, float radius)
	{
		return setCenter(cX, cY).setRadius(radius);
	}
	
	public CircleBV2f setCenter(Tup2fR t)
	{
		return setCenter(t.getX(), t.getY());
	}
	
	public CircleBV2f setCenter(float x, float y)
	{
		this.cX = x;
		this.cY = y;
		
		return this;
	}
	
	public CircleBV2f setRadius(float radius)
	{
		this.radius = radius;
		
		return this;
	}
	
	public float getRadius()
	{
		return this.radius;
	}
	
	public Point2f getCenterAsPoint()
	{
		return getCenter(new Point2f());
	}
	
	public Vec2f getCenterAsVector()
	{
		return getCenter(new Vec2f());
	}
	
	public <T extends Tup2fBase> T getCenter(T res)
	{
		res.set(cX, cY);
		
		return res;
	}
	
	public float getCenterX()
	{
		return this.cX;
	}
	
	public float getCenterY()
	{
		return this.cY;
	}
	
	/** {@inheritDoc}} */
	@Override
	public boolean isInside(Tup2fR t)
	{
		return isInside(t.getX(), t.getY());
	}

	/** {@inheritDoc}} */
	@Override
	public boolean isInside(float x, float y)
	{
		float length = Vec2fUtil.length(x - this.cX, y - this.cY);

		return length <= this.radius;
	}
}
