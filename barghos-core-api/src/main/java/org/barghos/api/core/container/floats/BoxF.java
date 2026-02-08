package org.barghos.api.core.container.floats;

import org.barghos.annotation.ExtractionParam;

public class BoxF
{
	public float x;
	public float y;
	public float z;
	public float width;
	public float height;
	public float depth;
	
	public BoxF()
	{
		set(0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f);
	}
	
	public BoxF(BoxF r)
	{
		set(r);
	}
	
	public BoxF(float[] r)
	{
		set(r);
	}
	
	public BoxF(float x, float y, float z, float width, float height, float depth)
	{
		set(x, y, z, width, height, depth);
	}
	
	public float x()
	{
		return this.x;
	}
	
	public float y()
	{
		return this.y;
	}
	
	public float z()
	{
		return this.z;
	}
	
	public float width()
	{
		return this.width;
	}
	
	public float height()
	{
		return this.height;
	}
	
	public float depth()
	{
		return this.depth;
	}
	
	public BoxF set(BoxF r)
	{
		this.x = r.x;
		this.y = r.y;
		this.z = r.z;
		this.width = r.width;
		this.height = r.height;
		this.depth = r.depth;
		
		return this;
	}
	
	public BoxF set(float[] r)
	{
		this.x = r[0];
		this.y = r[1];
		this.z = r[2];
		this.width = r[3];
		this.height = r[4];
		this.depth = r[5];
		
		return this;
	}
	
	public BoxF set(float x, float y, float z, float width, float height, float depth)
	{
		this.x = x;
		this.y = y;
		this.z = z;
		this.width = width;
		this.height = height;
		this.depth = depth;
		
		return this;
	}
	
	public float[] toArray()
	{
		return new float[] {this.x, this.y, this.z, this.width, this.height, this.depth};
	}
	
	public float[] toArray(@ExtractionParam float[] res)
	{
		res[0] = this.x;
		res[1] = this.y;
		res[2] = this.z;
		res[3] = this.width;
		res[4] = this.height;
		res[5] = this.depth;
		
		return res;
	}
}
