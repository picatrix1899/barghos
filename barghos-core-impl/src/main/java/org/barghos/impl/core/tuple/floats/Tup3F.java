package org.barghos.impl.core.tuple.floats;

import java.util.Arrays;
import java.util.Objects;

import org.barghos.api.core.tuple.floats.ITup3RF;
import org.barghos.api.core.tuple.floats.ITup3WF;
import org.barghos.api.core.tuple.floats.ITupRF;

public class Tup3F implements ITup3WF
{
	public final float[] data = new float[3];
	
	public Tup3F()
	{
		set(0.0f, 0.0f, 0.0f);
	}
	
	public Tup3F(ITup3RF t)
	{
		set(t);
	}
	
	public Tup3F(ITupRF t)
	{
		set(t);
	}

	public Tup3F(float[] t)
	{
		set(t);
	}
	
	public Tup3F(float v0, float v1, float v2)
	{
		set(v0, v1, v2);
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
	public float at(int index)
	{
		return this.data[index];
	}

	@Override
	public Tup3F v0(float v0)
	{
		this.data[0] = v0;
		
		return this;
	}

	@Override
	public Tup3F v1(float v1)
	{
		this.data[1] = v1;
		
		return this;
	}

	@Override
	public Tup3F v2(float v2)
	{
		this.data[2] = v2;
		
		return this;
	}

	@Override
	public Tup3F at(int index, float value)
	{
		this.data[index] = value;
		
		return this;
	}

	@Override
	public Tup3F set(ITup3RF t)
	{
		t.toArray(this.data);
		
		return this;
	}

	@Override
	public Tup3F set(ITupRF t)
	{
		t.toArray(this.data);
		
		return this;
	}

	@Override
	public Tup3F set(float[] t)
	{
		System.arraycopy(t, 0, this.data, 0, 3);
		
		return this;
	}

	@Override
	public Tup3F set(float v0, float v1, float v2)
	{
		this.data[0] = v0;
		this.data[1] = v1;
		this.data[2] = v2;
		
		return this;
	}
	
	@Override
	public float[] toArray()
	{
		return Arrays.copyOf(this.data, 3);
	}

	@Override
	public float[] toArray(float[] res)
	{
		System.arraycopy(this.data, 0, res, 0, 3);
		
		return res;
	}

	@Override
	public String toString()
	{
		return "tup3f(" + this.data[0] + ", " + this.data[1] + ", " + this.data[2] + ")";
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
		
		if(obj instanceof ITup3RF t)
		{
			return equals(t);
		}
		
		return false;
	}
	
}
