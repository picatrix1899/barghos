package org.barghos.impl.core.tuple.floats;

import java.util.Arrays;
import java.util.Objects;

import org.barghos.api.core.tuple.floats.ITup2RF;
import org.barghos.api.core.tuple.floats.ITupRF;
import org.barghos.api.core.tuple.floats.RawTupUtils2F;
import org.barghos.api.core.tuple.floats.TupUtils2F;

public class ConstTup2F implements ITup2RF
{
	private final float[] v = new float[2];
	
	public ConstTup2F()
	{
		this.v[0] = 0.0f;
		this.v[1] = 0.0f;
	}
	
	public ConstTup2F(ITup2RF t)
	{
		t.toArray(this.v);
	}
	
	public ConstTup2F(ITupRF t)
	{
		t.toArray(this.v);
	}
	
	public ConstTup2F(float[] t)
	{
		System.arraycopy(t, 0, this.v, 0, 2);
	}
	
	public ConstTup2F(float v0, float v1)
	{
		this.v[0] = v0;
		this.v[1] = v1;
	}
	
	@Override
	public float v0()
	{
		return this.v[0];
	}

	@Override
	public float v1()
	{
		return this.v[1];
	}

	@Override
	public float getAt(int index)
	{
		return this.v[index];
	}
	
	@Override
	public float[] toArray()
	{
		return Arrays.copyOf(this.v, 2);
	}

	@Override
	public float[] toArray(float[] res)
	{
		System.arraycopy(this.v, 0, res, 0, 2);
		
		return res;
	}
	
	@Override
	public String toString()
	{
		return "constTup2f(" + this.v[0] + ", " + this.v[1] + ")";
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
		
		if(obj instanceof ITup2RF t)
		{
			return equals(t);
		}
		
		return false;
	}
	
	@Override
	public boolean isFinite()
	{
		return RawTupUtils2F.isFinite(this.v);
	}
	
	@Override
	public boolean isFiniteAt(int index)
	{
		return RawTupUtils2F.isFiniteAt(index, this.v);
	}

	@Override
	public boolean isFiniteAtV0()
	{
		return RawTupUtils2F.isFiniteAtV0(this.v);
	}

	@Override
	public boolean isFiniteAtV1()
	{
		return RawTupUtils2F.isFiniteAtV1(this.v);
	}

	@Override
	public boolean isInfinite()
	{
		return RawTupUtils2F.isInfinite(this.v);
	}
	
	@Override
	public boolean isInfiniteAt(int index)
	{
		return RawTupUtils2F.isInfiniteAt(index, this.v);
	}

	@Override
	public boolean isInfiniteAtV0()
	{
		return RawTupUtils2F.isInfiniteAtV0(this.v);
	}

	@Override
	public boolean isInfiniteAtV1()
	{
		return RawTupUtils2F.isInfiniteAtV1(this.v);
	}
	
	@Override
	public boolean isNaN()
	{
		return RawTupUtils2F.isNaN(this.v);
	}
	
	@Override
	public boolean isNaNAt(int index)
	{
		return RawTupUtils2F.isNaNAt(index, this.v);
	}

	@Override
	public boolean isNaNAtV0()
	{
		return RawTupUtils2F.isNaNAtV0(this.v);
	}

	@Override
	public boolean isNaNAtV1()
	{
		return RawTupUtils2F.isNaNAtV1(this.v);
	}
	
	@Override
	public boolean isZero()
	{
		return RawTupUtils2F.isZero(this.v);
	}
	
	@Override
	public boolean isZeroEM(float tolerance)
	{
		return RawTupUtils2F.isZeroEM(tolerance, this.v);
	}
	
	@Override
	public boolean isZeroEM4()
	{
		return RawTupUtils2F.isZeroEM4(this.v);
	}
	
	@Override
	public boolean isZeroEM6()
	{
		return RawTupUtils2F.isZeroEM6(this.v);
	}
	
	@Override
	public boolean isZeroEM8()
	{
		return RawTupUtils2F.isZeroEM8(this.v);
	}
	
	@Override
	public boolean isZeroAt(int index)
	{
		return RawTupUtils2F.isZeroAt(index, this.v);
	}
	
	@Override
	public boolean isZeroAtEM(float tolerance, int index)
	{
		return RawTupUtils2F.isZeroAtEM(tolerance, index, this.v);
	}
	
	@Override
	public boolean isZeroAtEM4(int index)
	{
		return RawTupUtils2F.isZeroAtEM4(index, this.v);
	}
	
	@Override
	public boolean isZeroAtEM6(int index)
	{
		return RawTupUtils2F.isZeroAtEM6(index, this.v);
	}
	
	@Override
	public boolean isZeroAtEM8(int index)
	{
		return RawTupUtils2F.isZeroAtEM8(index, this.v);
	}
	
	@Override
	public boolean isZeroAtV0()
	{
		return RawTupUtils2F.isZeroAtV0(this.v);
	}

	@Override
	public boolean isZeroAtV0EM(float tolerance)
	{
		return RawTupUtils2F.isZeroAtV0EM(tolerance, this.v);
	}
	
	@Override
	public boolean isZeroAtV0EM4()
	{
		return RawTupUtils2F.isZeroAtV0EM4(this.v);
	}
	
	@Override
	public boolean isZeroAtV0EM6()
	{
		return RawTupUtils2F.isZeroAtV0EM6(this.v);
	}
	
	@Override
	public boolean isZeroAtV0EM8()
	{
		return RawTupUtils2F.isZeroAtV0EM8(this.v);
	}
	
	@Override
	public boolean isZeroAtV1()
	{
		return RawTupUtils2F.isZeroAtV1(this.v);
	}
	
	@Override
	public boolean isZeroAtV1EM(float tolerance)
	{
		return RawTupUtils2F.isZeroAtV1EM(tolerance, this.v);
	}
	
	@Override
	public boolean isZeroAtV1EM4()
	{
		return RawTupUtils2F.isZeroAtV1EM4(this.v);
	}
	
	@Override
	public boolean isZeroAtV1EM6()
	{
		return RawTupUtils2F.isZeroAtV1EM6(this.v);
	}
	
	@Override
	public boolean isZeroAtV1EM8()
	{
		return RawTupUtils2F.isZeroAtV1EM8(this.v);
	}

	@Override
	public boolean equals(ITup2RF t)
	{
		return TupUtils2F.equals(this.v, t);
	}

	@Override
	public boolean equals(ITupRF t)
	{
		return TupUtils2F.equals(this.v, t);
	}

	@Override
	public boolean equals(float[] t)
	{
		return RawTupUtils2F.equals(this.v, t);
	}

	@Override
	public boolean equals(float v0, float v1)
	{
		return RawTupUtils2F.equals(this.v, v0, v1);
	}

	@Override
	public boolean equalsEM(float tolerance, ITup2RF t)
	{
		return TupUtils2F.equalsEM(tolerance, this.v, t);
	}

	@Override
	public boolean equalsEM(float tolerance, ITupRF t)
	{
		return TupUtils2F.equalsEM(tolerance, this.v, t);
	}

	@Override
	public boolean equalsEM(float tolerance, float[] t)
	{
		return RawTupUtils2F.equalsEM(tolerance, this.v, t);
	}

	@Override
	public boolean equalsEM(float tolerance, float v0, float v1)
	{
		return RawTupUtils2F.equalsEM(tolerance, this.v, v0, v1);
	}
	
	@Override
	public boolean equalsEM4(ITup2RF t)
	{
		return TupUtils2F.equalsEM4(this.v, t);
	}

	@Override
	public boolean equalsEM4(ITupRF t)
	{
		return TupUtils2F.equalsEM4(this.v, t);
	}

	@Override
	public boolean equalsEM4(float[] t)
	{
		return RawTupUtils2F.equalsEM4(this.v, t);
	}

	@Override
	public boolean equalsEM4(float v0, float v1)
	{
		return RawTupUtils2F.equalsEM4(this.v, v0, v1);
	}
	
	@Override
	public boolean equalsEM6(ITup2RF t)
	{
		return TupUtils2F.equalsEM6(this.v, t);
	}

	@Override
	public boolean equalsEM6(ITupRF t)
	{
		return TupUtils2F.equalsEM6(this.v, t);
	}

	@Override
	public boolean equalsEM6(float[] t)
	{
		return RawTupUtils2F.equalsEM6(this.v, t);
	}

	@Override
	public boolean equalsEM6(float v0, float v1)
	{
		return RawTupUtils2F.equalsEM6(this.v, v0, v1);
	}
	
	@Override
	public boolean equalsEM8(ITup2RF t)
	{
		return TupUtils2F.equalsEM8(this.v, t);
	}

	@Override
	public boolean equalsEM8(ITupRF t)
	{
		return TupUtils2F.equalsEM8(this.v, t);
	}

	@Override
	public boolean equalsEM8(float[] t)
	{
		return RawTupUtils2F.equalsEM8(this.v, t);
	}

	@Override
	public boolean equalsEM8(float v0, float v1)
	{
		return RawTupUtils2F.equalsEM8(this.v, v0, v1);
	}

	@Override
	public boolean equalsAt(int index, ITup2RF t)
	{
		return TupUtils2F.equalsAt(index, this.v, t);
	}

	@Override
	public boolean equalsAt(int index, ITupRF t)
	{
		return TupUtils2F.equalsAt(index, this.v, t);
	}

	@Override
	public boolean equalsAt(int index, float[] t)
	{
		return RawTupUtils2F.equalsAt(index, this.v, t);
	}

	@Override
	public boolean equalsAt(int index, float value)
	{
		return RawTupUtils2F.equalsAt(index, this.v, value);
	}

	@Override
	public boolean equalsAtEM(float tolerance, int index, ITup2RF t)
	{
		return TupUtils2F.equalsAtEM(tolerance, index, this.v, t);
	}

	@Override
	public boolean equalsAtEM(float tolerance, int index, ITupRF t)
	{
		return TupUtils2F.equalsAtEM(tolerance, index, this.v, t);
	}

	@Override
	public boolean equalsAtEM(float tolerance, int index, float[] t)
	{
		return RawTupUtils2F.equalsAtEM(tolerance, index, this.v, t);
	}

	@Override
	public boolean equalsAtEM(float tolerance, int index, float value)
	{
		return RawTupUtils2F.equalsAtEM(tolerance, index, this.v, value);
	}
	
	@Override
	public boolean equalsAtEM4(int index, ITup2RF t)
	{
		return TupUtils2F.equalsAtEM4(index, this.v, t);
	}

	@Override
	public boolean equalsAtEM4(int index, ITupRF t)
	{
		return TupUtils2F.equalsAtEM4(index, this.v, t);
	}

	@Override
	public boolean equalsAtEM4(int index, float[] t)
	{
		return RawTupUtils2F.equalsAtEM4(index, this.v, t);
	}

	@Override
	public boolean equalsAtEM4(int index, float value)
	{
		return RawTupUtils2F.equalsAtEM4(index, this.v, value);
	}
	
	@Override
	public boolean equalsAtEM6(int index, ITup2RF t)
	{
		return TupUtils2F.equalsAtEM6(index, this.v, t);
	}

	@Override
	public boolean equalsAtEM6(int index, ITupRF t)
	{
		return TupUtils2F.equalsAtEM6(index, this.v, t);
	}

	@Override
	public boolean equalsAtEM6(int index, float[] t)
	{
		return RawTupUtils2F.equalsAtEM6(index, this.v, t);
	}

	@Override
	public boolean equalsAtEM6(int index, float value)
	{
		return RawTupUtils2F.equalsAtEM6(index, this.v, value);
	}
	
	@Override
	public boolean equalsAtEM8(int index, ITup2RF t)
	{
		return TupUtils2F.equalsAtEM8(index, this.v, t);
	}

	@Override
	public boolean equalsAtEM8(int index, ITupRF t)
	{
		return TupUtils2F.equalsAtEM8(index, this.v, t);
	}

	@Override
	public boolean equalsAtEM8(int index, float[] t)
	{
		return RawTupUtils2F.equalsAtEM8(index, this.v, t);
	}

	@Override
	public boolean equalsAtEM8(int index, float value)
	{
		return RawTupUtils2F.equalsAtEM8(index, this.v, value);
	}

	@Override
	public boolean equalsAtV0(ITup2RF t)
	{
		return TupUtils2F.equalsAtV0(this.v, t);
	}

	@Override
	public boolean equalsAtV0(ITupRF t)
	{
		return TupUtils2F.equalsAtV0(this.v, t);
	}

	@Override
	public boolean equalsAtV0(float[] t)
	{
		return RawTupUtils2F.equalsAtV0(this.v, t);
	}

	@Override
	public boolean equalsAtV0(float value)
	{
		return RawTupUtils2F.equalsAtV0(this.v, value);
	}

	@Override
	public boolean equalsAtV0EM(float tolerance, ITup2RF t)
	{
		return TupUtils2F.equalsAtV0EM(tolerance, this.v, t);
	}

	@Override
	public boolean equalsAtV0EM(float tolerance, ITupRF t)
	{
		return TupUtils2F.equalsAtV0EM(tolerance, this.v, t);
	}

	@Override
	public boolean equalsAtV0EM(float tolerance, float[] t)
	{
		return RawTupUtils2F.equalsAtV0EM(tolerance, this.v, t);
	}

	@Override
	public boolean equalsAtV0EM(float tolerance, float value)
	{
		return RawTupUtils2F.equalsAtV0EM(tolerance, this.v, value);
	}
	
	@Override
	public boolean equalsAtV0EM4(ITup2RF t)
	{
		return TupUtils2F.equalsAtV0EM4(this.v, t);
	}

	@Override
	public boolean equalsAtV0EM4(ITupRF t)
	{
		return TupUtils2F.equalsAtV0EM4(this.v, t);
	}

	@Override
	public boolean equalsAtV0EM4(float[] t)
	{
		return RawTupUtils2F.equalsAtV0EM4(this.v, t);
	}

	@Override
	public boolean equalsAtV0EM4(float value)
	{
		return RawTupUtils2F.equalsAtV0EM4(this.v, value);
	}
	
	@Override
	public boolean equalsAtV0EM6(ITup2RF t)
	{
		return TupUtils2F.equalsAtV0EM6(this.v, t);
	}

	@Override
	public boolean equalsAtV0EM6(ITupRF t)
	{
		return TupUtils2F.equalsAtV0EM6(this.v, t);
	}

	@Override
	public boolean equalsAtV0EM6(float[] t)
	{
		return RawTupUtils2F.equalsAtV0EM6(this.v, t);
	}

	@Override
	public boolean equalsAtV0EM6(float value)
	{
		return RawTupUtils2F.equalsAtV0EM6(this.v, value);
	}
	
	@Override
	public boolean equalsAtV0EM8(ITup2RF t)
	{
		return TupUtils2F.equalsAtV0EM8(this.v, t);
	}

	@Override
	public boolean equalsAtV0EM8(ITupRF t)
	{
		return TupUtils2F.equalsAtV0EM8(this.v, t);
	}

	@Override
	public boolean equalsAtV0EM8(float[] t)
	{
		return RawTupUtils2F.equalsAtV0EM8(this.v, t);
	}

	@Override
	public boolean equalsAtV0EM8(float value)
	{
		return RawTupUtils2F.equalsAtV0EM8(this.v, value);
	}
	
	@Override
	public boolean equalsAtV1(ITup2RF t)
	{
		return TupUtils2F.equalsAtV1(this.v, t);
	}

	@Override
	public boolean equalsAtV1(ITupRF t)
	{
		return TupUtils2F.equalsAtV1(this.v, t);
	}

	@Override
	public boolean equalsAtV1(float[] t)
	{
		return RawTupUtils2F.equalsAtV1(this.v, t);
	}

	@Override
	public boolean equalsAtV1(float value)
	{
		return RawTupUtils2F.equalsAtV1(this.v, value);
	}

	@Override
	public boolean equalsAtV1EM(float tolerance, ITup2RF t)
	{
		return TupUtils2F.equalsAtV1EM(tolerance, this.v, t);
	}

	@Override
	public boolean equalsAtV1EM(float tolerance, ITupRF t)
	{
		return TupUtils2F.equalsAtV1EM(tolerance, this.v, t);
	}

	@Override
	public boolean equalsAtV1EM(float tolerance, float[] t)
	{
		return RawTupUtils2F.equalsAtV1EM(tolerance, this.v, t);
	}

	@Override
	public boolean equalsAtV1EM(float tolerance, float value)
	{
		return RawTupUtils2F.equalsAtV1EM(tolerance, this.v, value);
	}

	@Override
	public boolean equalsAtV1EM4(ITup2RF t)
	{
		return TupUtils2F.equalsAtV1EM4(this.v, t);
	}

	@Override
	public boolean equalsAtV1EM4(ITupRF t)
	{
		return TupUtils2F.equalsAtV1EM4(this.v, t);
	}

	@Override
	public boolean equalsAtV1EM4(float[] t)
	{
		return RawTupUtils2F.equalsAtV1EM4(this.v, t);
	}

	@Override
	public boolean equalsAtV1EM4(float value)
	{
		return RawTupUtils2F.equalsAtV1EM4(this.v, value);
	}

	@Override
	public boolean equalsAtV1EM6(ITup2RF t)
	{
		return TupUtils2F.equalsAtV1EM6(this.v, t);
	}

	@Override
	public boolean equalsAtV1EM6(ITupRF t)
	{
		return TupUtils2F.equalsAtV1EM6(this.v, t);
	}

	@Override
	public boolean equalsAtV1EM6(float[] t)
	{
		return RawTupUtils2F.equalsAtV1EM6(this.v, t);
	}

	@Override
	public boolean equalsAtV1EM6(float value)
	{
		return RawTupUtils2F.equalsAtV1EM6(this.v, value);
	}

	@Override
	public boolean equalsAtV1EM8(ITup2RF t)
	{
		return TupUtils2F.equalsAtV1EM8(this.v, t);
	}

	@Override
	public boolean equalsAtV1EM8(ITupRF t)
	{
		return TupUtils2F.equalsAtV1EM8(this.v, t);
	}

	@Override
	public boolean equalsAtV1EM8(float[] t)
	{
		return RawTupUtils2F.equalsAtV1EM8(this.v, t);
	}

	@Override
	public boolean equalsAtV1EM8(float value)
	{
		return RawTupUtils2F.equalsAtV1EM8(this.v, value);
	}
	
}
