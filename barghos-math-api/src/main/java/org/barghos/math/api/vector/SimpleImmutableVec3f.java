package org.barghos.math.api.vector;

import java.nio.DoubleBuffer;
import java.nio.FloatBuffer;

import org.barghos.core.api.documentation.MinLength;
import org.barghos.core.api.nio.buffer.BufferableDoubleR;
import org.barghos.core.api.nio.buffer.BufferableFloatR;

public class SimpleImmutableVec3f implements SimpleVec3fR, BufferableFloatR, BufferableDoubleR
{
	private final float x;
	private final float y;
	private final float z;
	
	public SimpleImmutableVec3f(SimpleVec3fR v)
	{
		this.x = v.getX();
		this.y = v.getY();
		this.z = v.getZ();
	}
	
	public SimpleImmutableVec3f(@MinLength(3) float[] v)
	{
		this.x = v[0];
		this.y = v[1];
		this.z = v[2];
	}
	
	public SimpleImmutableVec3f(float x, float y, float z)
	{
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	public float getX()
	{
		return this.x;
	}

	public float getY()
	{
		return this.y;
	}

	public float getZ()
	{
		return this.z;
	}

	public SimpleImmutableVec3f copy()
	{
		return new SimpleImmutableVec3f(this);
	}

	public FloatBuffer toFloatBuffer(FloatBuffer buffer)
	{
		buffer.put(getX());
		buffer.put(getY());
		buffer.put(getZ());
		
		return buffer;
	}

	public DoubleBuffer toDoubleBuffer(DoubleBuffer buffer)
	{
		buffer.put(getX());
		buffer.put(getY());
		buffer.put(getZ());
		
		return buffer;
	}
}
