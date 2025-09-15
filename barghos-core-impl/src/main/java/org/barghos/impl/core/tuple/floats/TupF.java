package org.barghos.impl.core.tuple.floats;

import java.util.Arrays;
import java.util.Objects;

import org.barghos.api.core.tuple.floats.ITupRF;
import org.barghos.api.core.tuple.floats.ITupWF;
import org.barghos.api.core.tuple.floats.RawTupUtilsF;
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
		return RawTupUtilsF.isFinite(this.v);
	}

	@Override
	public boolean isFiniteAt(int index)
	{
		return RawTupUtilsF.isFiniteAt(index, this.v);
	}

	@Override
	public boolean isZero()
	{
		return RawTupUtilsF.isZero(this.v);
	}
	
	@Override
	public boolean isZeroEM4()
	{
		return RawTupUtilsF.isZeroEM4(this.v);
	}
	
	@Override
	public boolean isZeroEM6()
	{
		return RawTupUtilsF.isZeroEM6(this.v);
	}
	
	@Override
	public boolean isZeroEM8()
	{
		return RawTupUtilsF.isZeroEM8(this.v);
	}
	
	@Override
	public boolean isZero(float tolerance)
	{
		return RawTupUtilsF.isZero(tolerance, this.v);
	}

	@Override
	public boolean isZeroAt(int index)
	{
		return RawTupUtilsF.isZeroAt(index, this.v);
	}

	@Override
	public boolean isZeroAtEM4(int index)
	{
		return RawTupUtilsF.isZeroAtEM4(index, this.v);
	}
	
	@Override
	public boolean isZeroAtEM6(int index)
	{
		return RawTupUtilsF.isZeroAtEM6(index, this.v);
	}
	
	@Override
	public boolean isZeroAtEM8(int index)
	{
		return RawTupUtilsF.isZeroAtEM8(index, this.v);
	}
	
	@Override
	public boolean isZeroAt(float tolerance, int index)
	{
		return RawTupUtilsF.isZeroAt(tolerance, index, this.v);
	}

	@Override
	public boolean equals(ITupRF t)
	{
		return TupUtilsF.equals(this.v, t);
	}

	@Override
	public boolean equals(float[] t)
	{
		return RawTupUtilsF.equals(this.v, t);
	}

	@Override
	public boolean equalsEM4(ITupRF t)
	{
		return TupUtilsF.equalsEM4(this.v, t);
	}

	@Override
	public boolean equalsEM4(float[] t)
	{
		return RawTupUtilsF.equalsEM4(this.v, t);
	}
	
	@Override
	public boolean equalsEM6(ITupRF t)
	{
		return TupUtilsF.equalsEM6(this.v, t);
	}

	@Override
	public boolean equalsEM6(float[] t)
	{
		return RawTupUtilsF.equalsEM6(this.v, t);
	}
	
	@Override
	public boolean equalsEM8(ITupRF t)
	{
		return TupUtilsF.equalsEM8(this.v, t);
	}

	@Override
	public boolean equalsEM8(float[] t)
	{
		return RawTupUtilsF.equalsEM8(this.v, t);
	}
	
	@Override
	public boolean equals(float tolerance, ITupRF t)
	{
		return TupUtilsF.equals(tolerance, this.v, t);
	}

	@Override
	public boolean equals(float tolerance, float[] t)
	{
		return RawTupUtilsF.equals(tolerance, this.v, t);
	}

	@Override
	public boolean equalsAt(int index, ITupRF t)
	{
		return TupUtilsF.equalsAt(index, this.v, t);
	}

	@Override
	public boolean equalsAt(int index, float[] t)
	{
		return RawTupUtilsF.equalsAt(index, this.v, t);
	}

	@Override
	public boolean equalsAt(int index, float value)
	{
		return RawTupUtilsF.equalsAt(index, this.v, value);
	}

	@Override
	public boolean equalsAtEM4(int index, ITupRF t)
	{
		return TupUtilsF.equalsAtEM4(index, this.v, t);
	}

	@Override
	public boolean equalsAtEM4(int index, float[] t)
	{
		return RawTupUtilsF.equalsAtEM4(index, this.v, t);
	}

	@Override
	public boolean equalsAtEM4(int index, float value)
	{
		return RawTupUtilsF.equalsAtEM4(index, this.v, value);
	}
	
	@Override
	public boolean equalsAtEM6(int index, ITupRF t)
	{
		return TupUtilsF.equalsAtEM6(index, this.v, t);
	}

	@Override
	public boolean equalsAtEM6(int index, float[] t)
	{
		return RawTupUtilsF.equalsAtEM6(index, this.v, t);
	}

	@Override
	public boolean equalsAtEM6(int index, float value)
	{
		return RawTupUtilsF.equalsAtEM6(index, this.v, value);
	}
	
	@Override
	public boolean equalsAtEM8(int index, ITupRF t)
	{
		return TupUtilsF.equalsAtEM8(index, this.v, t);
	}

	@Override
	public boolean equalsAtEM8(int index, float[] t)
	{
		return RawTupUtilsF.equalsAtEM8(index, this.v, t);
	}

	@Override
	public boolean equalsAtEM8(int index, float value)
	{
		return RawTupUtilsF.equalsAtEM8(index, this.v, value);
	}
	
	@Override
	public boolean equalsAt(float tolerance, int index, ITupRF t)
	{
		return TupUtilsF.equalsAt(tolerance, index, this.v, t);
	}

	@Override
	public boolean equalsAt(float tolerance, int index, float[] t)
	{
		return RawTupUtilsF.equalsAt(tolerance, index, this.v, t);
	}

	@Override
	public boolean equalsAt(float tolerance, int index, float value)
	{
		return RawTupUtilsF.equalsAt(tolerance, index, this.v, value);
	}
}
