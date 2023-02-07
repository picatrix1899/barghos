package org.barghos.math.bounds;

import org.barghos.math.api.vector.Vec2fUtils;
import org.barghos.annotation.ExtractionParam;
import org.barghos.annotation.MinLength;
import org.barghos.math.api.bounds.Aabb2fC;
import org.barghos.math.api.bounds.Aabb2fR;
import org.barghos.math.api.vector.SimpleVec2fC;
import org.barghos.math.api.vector.SimpleVec2fR;

public class Aabb2f implements Aabb2fC
{
	protected float[] min = new float[2];
	protected float[] max = new float[2];
	protected transient float[] size = new float[2];
	protected transient float[] center = new float[2];
	
	public Aabb2f()
	{
		set(0.0f, 0.0f, 1.0f, 1.0f);
	}
	
	public Aabb2f(Aabb2fR aabb)
	{
		set(aabb);
	}
	
	public Aabb2f(SimpleVec2fR min, SimpleVec2fR max)
	{
		set(min, max);
	}
	
	public Aabb2f(SimpleVec2fR min, @MinLength(2) float[] max)
	{
		set(min, max);
	}
	
	public Aabb2f(SimpleVec2fR min, float maxX, float maxY)
	{
		set(min, maxX, maxY);
	}
	
	public Aabb2f(@MinLength(2) float[] min, SimpleVec2fR max)
	{
		set(min, max);
	}
	
	public Aabb2f(@MinLength(2) float[] min, @MinLength(2) float[] max)
	{
		set(min, max);
	}
	
	public Aabb2f(@MinLength(2) float[] min, float maxX, float maxY)
	{
		set(min, maxX, maxY);
	}
	
	public Aabb2f(float minX, float minY, SimpleVec2fR max)
	{
		set(minX, minY, max);
	}
	
	public Aabb2f(float minX, float minY, @MinLength(2) float[] max)
	{
		set(minX, minY, max);
	}
	
	public Aabb2f(float minX, float minY, float maxX, float maxY)
	{
		set(minX, minY, maxX, maxY);
	}
	
	public Aabb2fC createNew()
	{
		return new Aabb2f();
	}
	
	public Aabb2fC createNew(float minX, float minY, float maxX, float maxY)
	{
		return new Aabb2f(minX, minY, maxX, maxY);
	}
	
	/**
	 * Creates a new instance of the current class with the same component values.
	 * 
	 * @return A new instance.
	 */
	public Aabb2fC copy()
	{
		return new Aabb2f(this);
	}
	
	public Aabb2fC set(float minX, float minY, float maxX, float maxY)
	{
		Vec2fUtils.minVector(minX, minY, maxX, maxY, this.min);
		Vec2fUtils.maxVector(minX, minY, maxX, maxY, this.max);
		
		Vec2fUtils.sub(this.max, this.min, this.size);
		Vec2fUtils.halfPointBetween(this.min, this.max, this.center);
		
		return this;
	}
	
	public float getMinX()
	{
		return this.min[0];
	}
	
	public float getMinY()
	{
		return this.min[1];
	}
	
	public <T extends SimpleVec2fC> T getMin(@ExtractionParam T res)
	{
		res.setArray(this.min);
		
		return res;
	}
	
	public float[] getMin(@ExtractionParam @MinLength(2) float[] res)
	{
		res[0] = this.min[0];
		res[1] = this.min[1];
		
		return res;
	}
	
	public float getMaxX()
	{
		return this.max[0];
	}
	
	public float getMaxY()
	{
		return this.max[1];
	}
	
	public <T extends SimpleVec2fC> T getMax(@ExtractionParam T res)
	{
		res.setArray(this.max);
		
		return res;
	}
	
	public float[] getMax(@ExtractionParam @MinLength(2) float[] res)
	{
		res[0] = this.max[0];
		res[1] = this.max[1];
		
		return res;
	}

	public float getSizeX()
	{
		return this.size[0];
	}
	
	public float getSizeY()
	{
		return this.size[1];
	}
	
	public <T extends SimpleVec2fC> T getSize(@ExtractionParam T res)
	{
		res.setArray(this.size);
		
		return res;
	}
	
	public float[] getSize(@ExtractionParam @MinLength(2) float[] res)
	{
		res[0] = this.size[0];
		res[1] = this.size[1];
		
		return res;
	}
	
	public float getCenterX()
	{
		return this.center[0];
	}
	
	public float getCenterY()
	{
		return this.center[1];
	}
	
	public <T extends SimpleVec2fC> T getCenter(@ExtractionParam T res)
	{
		res.setArray(this.center);
		
		return res;
	}
	
	public float[] getCenter(@ExtractionParam @MinLength(2) float[] res)
	{
		res[0] = this.center[0];
		res[1] = this.center[1];
		
		return res;
	}
	
	/** {@inheritDoc}} */
	@Override
	public String toString()
	{
		return "aabb2f(min=(" + this.min[0] + ", " + this.min[1] + "), max=(" + this.max[0] + ", " + this.max[1] +  "))";
	}
}
