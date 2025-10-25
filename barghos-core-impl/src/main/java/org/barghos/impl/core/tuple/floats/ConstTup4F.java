package org.barghos.impl.core.tuple.floats;

import java.util.Arrays;
import java.util.Objects;

import org.barghos.api.core.tuple.floats.ITup4RF;
import org.barghos.api.core.tuple.floats.ITupRF;

public class ConstTup4F implements ITup4RF
{
	public final float[] data = new float[4];
	
	public ConstTup4F()
	{
		this.data[0] = 0.0f;
		this.data[1] = 0.0f;
		this.data[2] = 0.0f;
		this.data[3] = 0.0f;
	}
	
	public ConstTup4F(ITup4RF t)
	{
		t.toArray(this.data);
	}
	
	public ConstTup4F(ITupRF t)
	{
		t.toArray(this.data);
	}
	
	public ConstTup4F(float[] t)
	{
		System.arraycopy(t, 0, this.data, 0, 4);
	}
	
	public ConstTup4F(float v0, float v1, float v2, float v3)
	{
		this.data[0] = v0;
		this.data[1] = v1;
		this.data[2] = v2;
		this.data[3] = v3;
	}
	
	@Override
	public float v0()
	{
		return this.data[0];
	}

	@Override
	public float v1()
	{
		return this.data[1];
	}

	@Override
	public float v2()
	{
		return this.data[2];
	}

	@Override
	public float v3()
	{
		return this.data[3];
	}

	@Override
	public float at(int index)
	{
		return this.data[index];
	}

	@Override
	public float[] toArray()
	{
		return Arrays.copyOf(this.data, 4);
	}

	@Override
	public float[] toArray(float[] res)
	{
		System.arraycopy(this.data, 0, res, 0, 4);
		
		return res;
	}

	@Override
	public String toString()
	{
		return "constTup4f(" + this.data[0] + ", " + this.data[1] + ", " + this.data[2] + ", " + this.data[3] + ")";
	}
	
	@Override
	public int hashCode()
	{
		return Objects.hash(this.data);
	}
	
	@Override
	public boolean equals(Object obj)
	{
		if(obj == null) return false;
		if(obj == this) return true;
		
		if(obj instanceof ITup4RF t)
		{
			return equals(t);
		}
		
		return false;
	}
	
}
