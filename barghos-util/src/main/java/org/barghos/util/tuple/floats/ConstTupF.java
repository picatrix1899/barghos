package org.barghos.util.tuple.floats;

import java.util.Arrays;

public class ConstTupF implements ITupRF
{
	public final float[] v;
	
	public ConstTupF()
	{
		this.v = new float[0];
	}

	public ConstTupF(ITupRF t)
	{
		this.v = new float[t.size()];
		
		t.toArray(this.v);
	}
	
	public ConstTupF(float[] t)
	{
		this.v = new float[t.length];
		
		System.arraycopy(t, 0, this.v, 0, this.v.length);
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
