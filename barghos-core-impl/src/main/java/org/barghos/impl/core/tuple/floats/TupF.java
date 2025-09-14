package org.barghos.impl.core.tuple.floats;

import java.util.Arrays;
import java.util.Objects;

import org.barghos.api.core.tuple.floats.ITupRF;
import org.barghos.api.core.tuple.floats.ITupWF;
import org.barghos.api.core.tuple.floats.TupUtilsF;

public class TupF implements ITupWF
{
	private float[] v;
	
	public TupF()
	{
		v = new float[0];
	}
	
	public TupF(int size)
	{
		v = new float[size];
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
		return this.v.length;
	}

	@Override
	public float getAt(int index)
	{
		return this.v[index];
	}

	@Override
	public ITupWF setAt(int index, float value)
	{
		this.v[index] = value;
		
		return this;
	}

	@Override
	public ITupWF set(ITupRF t)
	{
		if(this.v.length < t.size()) this.v = new float[t.size()];
		
		t.toArray(this.v);
		
		return this;
	}

	@Override
	public ITupWF set(float[] t)
	{
		if(this.v.length < t.length) this.v = new float[t.length];
		
		System.arraycopy(t, 0, this.v, 0, this.v.length);
		
		return this;
	}
	
	@Override
	public float[] toArray()
	{
		return Arrays.copyOf(this.v, this.v.length);
	}

	@Override
	public float[] toArray(float[] res)
	{
		System.arraycopy(this.v, 0, res, 0, this.v.length);
		
		return res;
	}

	@Override
	public String toString()
	{
		StringBuilder builder = new StringBuilder();
		
		builder.append("tupf(");

		for(int i = 0, size = this.v.length; i < size; i++)
		{
			if(i > 0) builder.append(", ");
			builder.append(this.v[i]);
		}
		
		builder.append(")");
		
		return builder.toString();
	}
	
	@Override
	public int hashCode()
	{
		return Objects.hash(this.v);
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
	
	@Override
	public boolean isFinite()
	{
		return TupUtilsF.isFinite(this.v);
	}

	@Override
	public boolean isFiniteAt(int index)
	{
		return TupUtilsF.isFiniteAt(index, this.v);
	}

	@Override
	public boolean isZero()
	{
		return TupUtilsF.isZero(this.v);
	}

	@Override
	public boolean isZero(float tolerance)
	{
		return TupUtilsF.isZero(tolerance, this.v);
	}

	@Override
	public boolean isZeroAt(int index)
	{
		return TupUtilsF.isZeroAt(index, this.v);
	}

	@Override
	public boolean isZeroAt(float tolerance, int index)
	{
		return TupUtilsF.isZeroAt(tolerance, index, this.v);
	}

	@Override
	public boolean equals(ITupRF t)
	{
		return TupUtilsF.equals(this.v, t);
	}

	@Override
	public boolean equals(float[] t)
	{
		return TupUtilsF.equals(this.v, t);
	}

	@Override
	public boolean equals(float tolerance, ITupRF t)
	{
		return TupUtilsF.equals(tolerance, this.v, t);
	}

	@Override
	public boolean equals(float tolerance, float[] t)
	{
		return TupUtilsF.equals(tolerance, this.v, t);
	}

	@Override
	public boolean equalsAt(int index, ITupRF t)
	{
		return TupUtilsF.equalsAt(index, this.v, t);
	}

	@Override
	public boolean equalsAt(int index, float[] t)
	{
		return TupUtilsF.equalsAt(index, this.v, t);
	}

	@Override
	public boolean equalsAt(int index, float value)
	{
		return TupUtilsF.equalsAt(index, this.v, value);
	}

	@Override
	public boolean equalsAt(float tolerance, int index, ITupRF t)
	{
		return TupUtilsF.equalsAt(tolerance, index, this.v, t);
	}

	@Override
	public boolean equalsAt(float tolerance, int index, float[] t)
	{
		return TupUtilsF.equalsAt(tolerance, index, this.v, t);
	}

	@Override
	public boolean equalsAt(float tolerance, int index, float value)
	{
		return TupUtilsF.equalsAt(tolerance, index, this.v, value);
	}
}
