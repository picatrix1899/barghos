package org.barghos.impl.core.tuple.floats;

import java.util.Arrays;
import java.util.Objects;

import org.barghos.api.core.tuple.floats.ITupRF;
import org.barghos.api.core.tuple.floats.ITupWF;

public class TupF implements ITupWF
{
	public float[] data;
	
	public TupF()
	{
		this.data = new float[0];
	}
	
	public TupF(int size)
	{
		this.data = new float[size];
	}
	
	public TupF(ITupRF t)
	{
		set(t);
	}
	
	public TupF(float[] t)
	{
		set(t);
	}
	
	@Override
	public int size()
	{
		return this.data.length;
	}

	@Override
	public float at(int index)
	{
		return this.data[index];
	}

	@Override
	public ITupWF at(int index, float value)
	{
		this.data[index] = value;
		
		return this;
	}

	@Override
	public ITupWF set(ITupRF t)
	{
		if(this.data.length < t.size()) this.data = new float[t.size()];
		
		t.toArray(this.data);
		
		return this;
	}

	@Override
	public ITupWF set(float[] t)
	{
		if(this.data.length < t.length) this.data = new float[t.length];
		
		System.arraycopy(t, 0, this.data, 0, this.data.length);
		
		return this;
	}
	
	@Override
	public float[] toArray()
	{
		return Arrays.copyOf(this.data, this.data.length);
	}

	@Override
	public float[] toArray(float[] res)
	{
		System.arraycopy(this.data, 0, res, 0, this.data.length);
		
		return res;
	}

	@Override
	public String toString()
	{
		StringBuilder builder = new StringBuilder();
		
		builder.append("tupf(");

		for(int i = 0, size = this.data.length; i < size; i++)
		{
			if(i > 0) builder.append(", ");
			builder.append(this.data[i]);
		}
		
		builder.append(")");
		
		return builder.toString();
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
		
		if(obj instanceof ITupRF t)
		{
			return equals(t);
		}
		
		return false;
	}
	
}
