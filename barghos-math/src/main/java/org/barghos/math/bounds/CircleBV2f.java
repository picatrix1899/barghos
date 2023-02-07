package org.barghos.math.bounds;

import org.barghos.math.api.bounds.CircleBV2fC;
import org.barghos.math.api.bounds.CircleBV2fR;
import org.barghos.math.api.vector.SimpleVec2fC;
import org.barghos.math.api.vector.SimpleVec2fR;

public class CircleBV2f implements CircleBV2fC
{
	protected float[] center = new float[2];
	protected float radius = 1.0f;
	
	public CircleBV2f()
	{
		set(0.0f, 0.0f, 1.0f);
	}
	
	public CircleBV2f(CircleBV2fR bv)
	{
		set(bv);
	}
	
	public CircleBV2f(SimpleVec2fR center, float radius)
	{
		set(center, radius);
	}
	
	public CircleBV2f(float[] center, float radius)
	{
		set(center, radius);
	}
	
	public CircleBV2f(float centerX, float centerY, float radius)
	{
		set(centerX, centerY, radius);
	}
	
	public CircleBV2fC createNew()
	{
		return new CircleBV2f();
	}

	public CircleBV2fC createNew(float centerX, float centerY, float radius)
	{
		return new CircleBV2f(centerX, centerY, radius);
	}

	public CircleBV2fC copy()
	{
		return new CircleBV2f(this);
	}
	
	public CircleBV2f setCenter(float x, float y)
	{
		this.center[0] = x;
		this.center[1] = y;
		
		return this;
	}
	
	public CircleBV2f setRadius(float radius)
	{
		this.radius = radius;
		
		return this;
	}
	
	public float getCenterX()
	{
		return this.center[0];
	}
	
	public float getCenterY()
	{
		return this.center[1];
	}
	
	public <T extends SimpleVec2fC> T getCenter(T res)
	{
		res.setArray(this.center);
		
		return res;
	}
	
	public float[] getCenter(float[] res)
	{
		res[0] = this.center[0];
		res[1] = this.center[1];
		
		return res;
	}
	
	public float getRadius()
	{
		return this.radius;
	}
	
	/** {@inheritDoc}} */
	@Override
	public String toString()
	{
		return "circleBV2f(center=(" + this.center[0] + ", " + this.center[1] + "), radius=" + this.radius + ")";
	}
}
