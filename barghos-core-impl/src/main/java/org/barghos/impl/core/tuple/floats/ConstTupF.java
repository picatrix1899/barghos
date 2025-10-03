package org.barghos.impl.core.tuple.floats;

import java.util.Arrays;

import org.barghos.api.core.tuple.floats.ITupRF;
import org.barghos.api.core.tuple.floats.RawTupUtilsF;
import org.barghos.api.core.tuple.floats.TupUtilsF;

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
		return RawTupUtilsF.isFinite(this.v);
	}

	@Override
	public boolean isFiniteAt(int index)
	{
		return RawTupUtilsF.isFiniteAt(index, this.v);
	}

	@Override
	public boolean isInfinite()
	{
		return RawTupUtilsF.isInfinite(this.v);
	}

	@Override
	public boolean isInfiniteAt(int index)
	{
		return RawTupUtilsF.isInfiniteAt(index, this.v);
	}
	
	@Override
	public boolean isNaN()
	{
		return RawTupUtilsF.isNaN(this.v);
	}

	@Override
	public boolean isNaNAt(int index)
	{
		return RawTupUtilsF.isNaNAt(index, this.v);
	}
	
	@Override
	public boolean isZero()
	{
		return RawTupUtilsF.isZero(this.v);
	}

	@Override
	public boolean isZeroEM(float tolerance)
	{
		return RawTupUtilsF.isZeroEM(tolerance, this.v);
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
	public boolean isZeroAt(int index)
	{
		return RawTupUtilsF.isZeroAt(index, this.v);
	}

	@Override
	public boolean isZeroAtEM(float tolerance, int index)
	{
		return RawTupUtilsF.isZeroAtEM(tolerance, index, this.v);
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
	public boolean equalsEM(float tolerance, ITupRF t)
	{
		return TupUtilsF.equalsEM(tolerance, this.v, t);
	}

	@Override
	public boolean equalsEM(float tolerance, float[] t)
	{
		return RawTupUtilsF.equalsEM(tolerance, this.v, t);
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
	public boolean equalsAtEM(float tolerance, int index, ITupRF t)
	{
		return TupUtilsF.equalsAtEM(tolerance, index, this.v, t);
	}

	@Override
	public boolean equalsAtEM(float tolerance, int index, float[] t)
	{
		return RawTupUtilsF.equalsAtEM(tolerance, index, this.v, t);
	}

	@Override
	public boolean equalsAtEM(float tolerance, int index, float value)
	{
		return RawTupUtilsF.equalsAtEM(tolerance, index, this.v, value);
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
	
}
