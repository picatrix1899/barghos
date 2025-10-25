package org.barghos.impl.core.tuple.floats;

import java.util.Arrays;

import org.barghos.api.core.tuple.floats.ITupRF;

public class ConstTupF implements ITupRF
{
	public final float[] data;
	
	public ConstTupF()
	{
		this.data = new float[0];
	}

	public ConstTupF(ITupRF t)
	{
		this.data = new float[t.size()];
		
		t.toArray(this.data);
	}
	
	public ConstTupF(float[] t)
	{
		this.data = new float[t.length];
		
		System.arraycopy(t, 0, this.data, 0, this.data.length);
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
	
}
