package org.barghos.impl.core.tuple.floats;

import java.nio.FloatBuffer;
import java.util.Arrays;
import java.util.Objects;

import org.barghos.api.core.nio.buffer.IBufferableRF;
import org.barghos.api.core.nio.buffer.IBufferableWF;
import org.barghos.api.core.tuple.floats.ITup4RF;
import org.barghos.api.core.tuple.floats.ITup4WF;
import org.barghos.api.core.tuple.floats.ITupRF;
import org.barghos.api.core.tuple.floats.RawTupUtils4F;
import org.barghos.api.core.tuple.floats.TupUtils4F;

public class Tup4F implements ITup4WF, IBufferableRF, IBufferableWF
{
	private final float[] v = new float[4];
	
	public Tup4F()
	{
		set(0.0f, 0.0f, 0.0f, 0.0f);
	}
	
	public Tup4F(ITup4RF t)
	{
		set(t);
	}

	public Tup4F(ITupRF t)
	{
		set(t);
	}
	
	public Tup4F(float[] t)
	{
		set(t);
	}
	
	public Tup4F(float v0, float v1, float v2, float v3)
	{
		set(v0, v1, v2, v3);
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
	public float v2()
	{
		return this.v[2];
	}

	@Override
	public float v3()
	{
		return this.v[3];
	}

	@Override
	public float getAt(int index)
	{
		return this.v[index];
	}

	@Override
	public Tup4F v0(float v0)
	{
		this.v[0] = v0;
		
		return this;
	}

	@Override
	public Tup4F v1(float v1)
	{
		this.v[1] = v1;
		
		return this;
	}

	@Override
	public Tup4F v2(float v2)
	{
		this.v[2] = v2;
		
		return this;
	}

	@Override
	public Tup4F v3(float v3)
	{
		this.v[3] = v3;
	
		return this;
	}

	@Override
	public Tup4F setAt(int index, float value)
	{
		this.v[index] = index;
		
		return this;
	}

	@Override
	public Tup4F set(ITup4RF t)
	{
		t.toArray(this.v);
		
		return this;
	}

	@Override
	public Tup4F set(ITupRF t)
	{
		t.toArray(this.v);
		
		return this;
	}

	@Override
	public Tup4F set(float[] t)
	{
		System.arraycopy(t, 0, this.v, 0, 4);
		
		return this;
	}

	@Override
	public Tup4F set(float v0, float v1, float v2, float v3)
	{
		this.v[0] = v0;
		this.v[1] = v1;
		this.v[2] = v2;
		this.v[3] = v3;
		
		return this;
	}
	
	@Override
	public float[] toArray()
	{
		return Arrays.copyOf(this.v, 4);
	}

	@Override
	public float[] toArray(float[] res)
	{
		System.arraycopy(this.v, 0, res, 0, 4);
		
		return res;
	}

	@Override
	public String toString()
	{
		return "tup4f(" + this.v[0] + ", " + this.v[1] + ", " + this.v[2] + ", " + this.v[3] + ")";
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
		
		if(obj instanceof ITup4RF t)
		{
			return equals(t);
		}
		
		return false;
	}
	
	@Override
	public Tup4F writeTo(FloatBuffer buffer)
	{
		buffer.put(this.v);
		
		return this;
	}
	
	@Override
	public Tup4F readFrom(FloatBuffer buffer, int offset)
	{
		buffer.get(offset, this.v);
		
		return this;
	}
	
	@Override
	public boolean isFinite()
	{
		return RawTupUtils4F.isFinite(this.v);
	}
	
	@Override
	public boolean isFiniteAt(int index)
	{
		return RawTupUtils4F.isFiniteAt(index, this.v);
	}

	@Override
	public boolean isFiniteAtV0()
	{
		return RawTupUtils4F.isFiniteAtV0(this.v);
	}

	@Override
	public boolean isFiniteAtV1()
	{
		return RawTupUtils4F.isFiniteAtV1(this.v);
	}

	@Override
	public boolean isFiniteAtV2()
	{
		return RawTupUtils4F.isFiniteAtV2(this.v);
	}

	@Override
	public boolean isFiniteAtV3()
	{
		return RawTupUtils4F.isFiniteAtV3(this.v);
	}

	@Override
	public boolean isInfinite()
	{
		return RawTupUtils4F.isInfinite(this.v);
	}
	
	@Override
	public boolean isInfiniteAt(int index)
	{
		return RawTupUtils4F.isInfiniteAt(index, this.v);
	}

	@Override
	public boolean isInfiniteAtV0()
	{
		return RawTupUtils4F.isInfiniteAtV0(this.v);
	}

	@Override
	public boolean isInfiniteAtV1()
	{
		return RawTupUtils4F.isInfiniteAtV1(this.v);
	}

	@Override
	public boolean isInfiniteAtV2()
	{
		return RawTupUtils4F.isInfiniteAtV2(this.v);
	}

	@Override
	public boolean isInfiniteAtV3()
	{
		return RawTupUtils4F.isInfiniteAtV3(this.v);
	}
	
	@Override
	public boolean isNaN()
	{
		return RawTupUtils4F.isNaN(this.v);
	}
	
	@Override
	public boolean isNaNAt(int index)
	{
		return RawTupUtils4F.isNaNAt(index, this.v);
	}

	@Override
	public boolean isNaNAtV0()
	{
		return RawTupUtils4F.isNaNAtV0(this.v);
	}

	@Override
	public boolean isNaNAtV1()
	{
		return RawTupUtils4F.isNaNAtV1(this.v);
	}

	@Override
	public boolean isNaNAtV2()
	{
		return RawTupUtils4F.isNaNAtV2(this.v);
	}

	@Override
	public boolean isNaNAtV3()
	{
		return RawTupUtils4F.isNaNAtV3(this.v);
	}
	
	@Override
	public boolean isZero()
	{
		return RawTupUtils4F.isZero(this.v);
	}
	
	@Override
	public boolean isZeroEM(float tolerance)
	{
		return RawTupUtils4F.isZeroEM(tolerance, this.v);
	}
	
	@Override
	public boolean isZeroEM4()
	{
		return RawTupUtils4F.isZeroEM4(this.v);
	}
	
	@Override
	public boolean isZeroEM6()
	{
		return RawTupUtils4F.isZeroEM6(this.v);
	}
	
	@Override
	public boolean isZeroEM8()
	{
		return RawTupUtils4F.isZeroEM8(this.v);
	}
	
	@Override
	public boolean isZeroAt(int index)
	{
		return RawTupUtils4F.isZeroAt(index, this.v);
	}
	
	@Override
	public boolean isZeroAtEM(float tolerance, int index)
	{
		return RawTupUtils4F.isZeroAtEM(tolerance, index, this.v);
	}
	
	@Override
	public boolean isZeroAtEM4(int index)
	{
		return RawTupUtils4F.isZeroAtEM4(index, this.v);
	}
	
	@Override
	public boolean isZeroAtEM6(int index)
	{
		return RawTupUtils4F.isZeroAtEM6(index, this.v);
	}
	
	@Override
	public boolean isZeroAtEM8(int index)
	{
		return RawTupUtils4F.isZeroAtEM8(index, this.v);
	}
	
	@Override
	public boolean isZeroAtV0()
	{
		return RawTupUtils4F.isZeroAtV0(this.v);
	}

	@Override
	public boolean isZeroAtV0EM(float tolerance)
	{
		return RawTupUtils4F.isZeroAtV0EM(tolerance, this.v);
	}
	
	@Override
	public boolean isZeroAtV0EM4()
	{
		return RawTupUtils4F.isZeroAtV0EM4(this.v);
	}
	
	@Override
	public boolean isZeroAtV0EM6()
	{
		return RawTupUtils4F.isZeroAtV0EM6(this.v);
	}
	
	@Override
	public boolean isZeroAtV0EM8()
	{
		return RawTupUtils4F.isZeroAtV0EM8(this.v);
	}
	
	@Override
	public boolean isZeroAtV1()
	{
		return RawTupUtils4F.isZeroAtV1(this.v);
	}

	@Override
	public boolean isZeroAtV1EM(float tolerance)
	{
		return RawTupUtils4F.isZeroAtV1EM(tolerance, this.v);
	}
	
	@Override
	public boolean isZeroAtV1EM4()
	{
		return RawTupUtils4F.isZeroAtV1EM4(this.v);
	}
	
	@Override
	public boolean isZeroAtV1EM6()
	{
		return RawTupUtils4F.isZeroAtV1EM6(this.v);
	}
	
	@Override
	public boolean isZeroAtV1EM8()
	{
		return RawTupUtils4F.isZeroAtV1EM8(this.v);
	}
	
	@Override
	public boolean isZeroAtV2()
	{
		return RawTupUtils4F.isZeroAtV2(this.v);
	}

	@Override
	public boolean isZeroAtV2EM(float tolerance)
	{
		return RawTupUtils4F.isZeroAtV2EM(tolerance, this.v);
	}
	
	@Override
	public boolean isZeroAtV2EM4()
	{
		return RawTupUtils4F.isZeroAtV2EM4(this.v);
	}
	
	@Override
	public boolean isZeroAtV2EM6()
	{
		return RawTupUtils4F.isZeroAtV2EM6(this.v);
	}
	
	@Override
	public boolean isZeroAtV2EM8()
	{
		return RawTupUtils4F.isZeroAtV2EM8(this.v);
	}
	
	@Override
	public boolean isZeroAtV3()
	{
		return RawTupUtils4F.isZeroAtV3(this.v);
	}

	@Override
	public boolean isZeroAtV3EM4()
	{
		return RawTupUtils4F.isZeroAtV3EM4(this.v);
	}
	
	@Override
	public boolean isZeroAtV3EM6()
	{
		return RawTupUtils4F.isZeroAtV3EM6(this.v);
	}
	
	@Override
	public boolean isZeroAtV3EM8()
	{
		return RawTupUtils4F.isZeroAtV3EM8(this.v);
	}

	@Override
	public boolean isZeroAtV3EM(float tolerance)
	{
		return RawTupUtils4F.isZeroAtV3EM(tolerance, this.v);
	}

	@Override
	public boolean equals(ITup4RF t)
	{
		return TupUtils4F.equals(this.v, t);
	}

	@Override
	public boolean equals(ITupRF t)
	{
		return TupUtils4F.equals(this.v, t);
	}

	@Override
	public boolean equals(float[] t)
	{
		return RawTupUtils4F.equals(this.v, t);
	}

	@Override
	public boolean equals(float v0, float v1, float v2, float v3)
	{
		return RawTupUtils4F.equals(this.v, v0, v1, v2, v3);
	}

	@Override
	public boolean equalsEM(float tolerance, ITup4RF t)
	{
		return TupUtils4F.equalsEM(tolerance, this.v, t);
	}

	@Override
	public boolean equalsEM(float tolerance, ITupRF t)
	{
		return TupUtils4F.equalsEM(tolerance, this.v, t);
	}

	@Override
	public boolean equalsEM(float tolerance, float[] t)
	{
		return RawTupUtils4F.equalsEM(tolerance, this.v, t);
	}

	@Override
	public boolean equalsEM(float tolerance, float v0, float v1, float v2, float v3)
	{
		return RawTupUtils4F.equalsEM(tolerance, this.v, v0, v1, v2, v3);
	}
	
	@Override
	public boolean equalsEM4(ITup4RF t)
	{
		return TupUtils4F.equalsEM4(this.v, t);
	}

	@Override
	public boolean equalsEM4(ITupRF t)
	{
		return TupUtils4F.equalsEM4(this.v, t);
	}

	@Override
	public boolean equalsEM4(float[] t)
	{
		return RawTupUtils4F.equalsEM4(this.v, t);
	}

	@Override
	public boolean equalsEM4(float v0, float v1, float v2, float v3)
	{
		return RawTupUtils4F.equalsEM4(this.v, v0, v1, v2, v3);
	}
	
	@Override
	public boolean equalsEM6(ITup4RF t)
	{
		return TupUtils4F.equalsEM6(this.v, t);
	}

	@Override
	public boolean equalsEM6(ITupRF t)
	{
		return TupUtils4F.equalsEM6(this.v, t);
	}

	@Override
	public boolean equalsEM6(float[] t)
	{
		return RawTupUtils4F.equalsEM6(this.v, t);
	}

	@Override
	public boolean equalsEM6(float v0, float v1, float v2, float v3)
	{
		return RawTupUtils4F.equalsEM6(this.v, v0, v1, v2, v3);
	}
	
	@Override
	public boolean equalsEM8(ITup4RF t)
	{
		return TupUtils4F.equalsEM8(this.v, t);
	}

	@Override
	public boolean equalsEM8(ITupRF t)
	{
		return TupUtils4F.equalsEM8(this.v, t);
	}

	@Override
	public boolean equalsEM8(float[] t)
	{
		return RawTupUtils4F.equalsEM8(this.v, t);
	}

	@Override
	public boolean equalsEM8(float v0, float v1, float v2, float v3)
	{
		return RawTupUtils4F.equalsEM8(this.v, v0, v1, v2, v3);
	}

	@Override
	public boolean equalsAt(int index, ITup4RF t)
	{
		return TupUtils4F.equalsAt(index, this.v, t);
	}

	@Override
	public boolean equalsAt(int index, ITupRF t)
	{
		return TupUtils4F.equalsAt(index, this.v, t);
	}

	@Override
	public boolean equalsAt(int index, float[] t)
	{
		return RawTupUtils4F.equalsAt(index, this.v, t);
	}

	@Override
	public boolean equalsAt(int index, float value)
	{
		return RawTupUtils4F.equalsAt(index, this.v, value);
	}

	@Override
	public boolean equalsAtEM(float tolerance, int index, ITup4RF t)
	{
		return TupUtils4F.equalsAtEM(tolerance, index, this.v, t);
	}

	@Override
	public boolean equalsAtEM(float tolerance, int index, ITupRF t)
	{
		return TupUtils4F.equalsAtEM(tolerance, index, this.v, t);
	}

	@Override
	public boolean equalsAtEM(float tolerance, int index, float[] t)
	{
		return RawTupUtils4F.equalsAtEM(tolerance, index, this.v, t);
	}

	@Override
	public boolean equalsAtEM(float tolerance, int index, float value)
	{
		return RawTupUtils4F.equalsAtEM(tolerance, index, this.v, value);
	}
	
	@Override
	public boolean equalsAtEM4(int index, ITup4RF t)
	{
		return TupUtils4F.equalsAtEM4(index, this.v, t);
	}

	@Override
	public boolean equalsAtEM4(int index, ITupRF t)
	{
		return TupUtils4F.equalsAtEM4(index, this.v, t);
	}

	@Override
	public boolean equalsAtEM4(int index, float[] t)
	{
		return RawTupUtils4F.equalsAtEM4(index, this.v, t);
	}

	@Override
	public boolean equalsAtEM4(int index, float value)
	{
		return RawTupUtils4F.equalsAtEM4(index, this.v, value);
	}
	
	@Override
	public boolean equalsAtEM6(int index, ITup4RF t)
	{
		return TupUtils4F.equalsAtEM6(index, this.v, t);
	}

	@Override
	public boolean equalsAtEM6(int index, ITupRF t)
	{
		return TupUtils4F.equalsAtEM6(index, this.v, t);
	}

	@Override
	public boolean equalsAtEM6(int index, float[] t)
	{
		return RawTupUtils4F.equalsAtEM6(index, this.v, t);
	}

	@Override
	public boolean equalsAtEM6(int index, float value)
	{
		return RawTupUtils4F.equalsAtEM6(index, this.v, value);
	}
	
	@Override
	public boolean equalsAtEM8(int index, ITup4RF t)
	{
		return TupUtils4F.equalsAtEM8(index, this.v, t);
	}

	@Override
	public boolean equalsAtEM8(int index, ITupRF t)
	{
		return TupUtils4F.equalsAtEM8(index, this.v, t);
	}

	@Override
	public boolean equalsAtEM8(int index, float[] t)
	{
		return RawTupUtils4F.equalsAtEM8(index, this.v, t);
	}

	@Override
	public boolean equalsAtEM8(int index, float value)
	{
		return RawTupUtils4F.equalsAtEM8(index, this.v, value);
	}

	@Override
	public boolean equalsAtV0(ITup4RF t)
	{
		return TupUtils4F.equalsAtV0(this.v, t);
	}

	@Override
	public boolean equalsAtV0(ITupRF t)
	{
		return TupUtils4F.equalsAtV0(this.v, t);
	}

	@Override
	public boolean equalsAtV0(float[] t)
	{
		return RawTupUtils4F.equalsAtV0(this.v, t);
	}

	@Override
	public boolean equalsAtV0(float value)
	{
		return RawTupUtils4F.equalsAtV0(this.v, value);
	}

	@Override
	public boolean equalsAtV0EM(float tolerance, ITup4RF t)
	{
		return TupUtils4F.equalsAtV0EM(tolerance, this.v, t);
	}

	@Override
	public boolean equalsAtV0EM(float tolerance, ITupRF t)
	{
		return TupUtils4F.equalsAtV0EM(tolerance, this.v, t);
	}

	@Override
	public boolean equalsAtV0EM(float tolerance, float[] t)
	{
		return RawTupUtils4F.equalsAtV0EM(tolerance, this.v, t);
	}

	@Override
	public boolean equalsAtV0EM(float tolerance, float value)
	{
		return RawTupUtils4F.equalsAtV0EM(tolerance, this.v, value);
	}
	
	@Override
	public boolean equalsAtV0EM4(ITup4RF t)
	{
		return TupUtils4F.equalsAtV0EM4(this.v, t);
	}

	@Override
	public boolean equalsAtV0EM4(ITupRF t)
	{
		return TupUtils4F.equalsAtV0EM4(this.v, t);
	}

	@Override
	public boolean equalsAtV0EM4(float[] t)
	{
		return RawTupUtils4F.equalsAtV0EM4(this.v, t);
	}

	@Override
	public boolean equalsAtV0EM4(float value)
	{
		return RawTupUtils4F.equalsAtV0EM4(this.v, value);
	}
	
	@Override
	public boolean equalsAtV0EM6(ITup4RF t)
	{
		return TupUtils4F.equalsAtV0EM6(this.v, t);
	}

	@Override
	public boolean equalsAtV0EM6(ITupRF t)
	{
		return TupUtils4F.equalsAtV0EM6(this.v, t);
	}

	@Override
	public boolean equalsAtV0EM6(float[] t)
	{
		return RawTupUtils4F.equalsAtV0EM6(this.v, t);
	}

	@Override
	public boolean equalsAtV0EM6(float value)
	{
		return RawTupUtils4F.equalsAtV0EM6(this.v, value);
	}
	
	@Override
	public boolean equalsAtV0EM8(ITup4RF t)
	{
		return TupUtils4F.equalsAtV0EM8(this.v, t);
	}

	@Override
	public boolean equalsAtV0EM8(ITupRF t)
	{
		return TupUtils4F.equalsAtV0EM8(this.v, t);
	}

	@Override
	public boolean equalsAtV0EM8(float[] t)
	{
		return RawTupUtils4F.equalsAtV0EM8(this.v, t);
	}

	@Override
	public boolean equalsAtV0EM8(float value)
	{
		return RawTupUtils4F.equalsAtV0EM8(this.v, value);
	}
	
	@Override
	public boolean equalsAtV1(ITup4RF t)
	{
		return TupUtils4F.equalsAtV1(this.v, t);
	}

	@Override
	public boolean equalsAtV1(ITupRF t)
	{
		return TupUtils4F.equalsAtV1(this.v, t);
	}

	@Override
	public boolean equalsAtV1(float[] t)
	{
		return RawTupUtils4F.equalsAtV1(this.v, t);
	}

	@Override
	public boolean equalsAtV1(float value)
	{
		return RawTupUtils4F.equalsAtV1(this.v, value);
	}

	@Override
	public boolean equalsAtV1EM(float tolerance, ITup4RF t)
	{
		return TupUtils4F.equalsAtV1EM(tolerance, this.v, t);
	}

	@Override
	public boolean equalsAtV1EM(float tolerance, ITupRF t)
	{
		return TupUtils4F.equalsAtV1EM(tolerance, this.v, t);
	}

	@Override
	public boolean equalsAtV1EM(float tolerance, float[] t)
	{
		return RawTupUtils4F.equalsAtV1EM(tolerance, this.v, t);
	}

	@Override
	public boolean equalsAtV1EM(float tolerance, float value)
	{
		return RawTupUtils4F.equalsAtV1EM(tolerance, this.v, value);
	}
	
	@Override
	public boolean equalsAtV1EM4(ITup4RF t)
	{
		return TupUtils4F.equalsAtV1EM4(this.v, t);
	}

	@Override
	public boolean equalsAtV1EM4(ITupRF t)
	{
		return TupUtils4F.equalsAtV1EM4(this.v, t);
	}

	@Override
	public boolean equalsAtV1EM4(float[] t)
	{
		return RawTupUtils4F.equalsAtV1EM4(this.v, t);
	}

	@Override
	public boolean equalsAtV1EM4(float value)
	{
		return RawTupUtils4F.equalsAtV1EM4(this.v, value);
	}
	
	@Override
	public boolean equalsAtV1EM6(ITup4RF t)
	{
		return TupUtils4F.equalsAtV1EM6(this.v, t);
	}

	@Override
	public boolean equalsAtV1EM6(ITupRF t)
	{
		return TupUtils4F.equalsAtV1EM6(this.v, t);
	}

	@Override
	public boolean equalsAtV1EM6(float[] t)
	{
		return RawTupUtils4F.equalsAtV1EM6(this.v, t);
	}

	@Override
	public boolean equalsAtV1EM6(float value)
	{
		return RawTupUtils4F.equalsAtV1EM6(this.v, value);
	}
	
	@Override
	public boolean equalsAtV1EM8(ITup4RF t)
	{
		return TupUtils4F.equalsAtV1EM8(this.v, t);
	}

	@Override
	public boolean equalsAtV1EM8(ITupRF t)
	{
		return TupUtils4F.equalsAtV1EM8(this.v, t);
	}

	@Override
	public boolean equalsAtV1EM8(float[] t)
	{
		return RawTupUtils4F.equalsAtV1EM8(this.v, t);
	}

	@Override
	public boolean equalsAtV1EM8(float value)
	{
		return RawTupUtils4F.equalsAtV1EM8(this.v, value);
	}
	
	@Override
	public boolean equalsAtV2(ITup4RF t)
	{
		return TupUtils4F.equalsAtV2(this.v, t);
	}

	@Override
	public boolean equalsAtV2(ITupRF t)
	{
		return TupUtils4F.equalsAtV2(this.v, t);
	}

	@Override
	public boolean equalsAtV2(float[] t)
	{
		return RawTupUtils4F.equalsAtV2(this.v, t);
	}

	@Override
	public boolean equalsAtV2(float value)
	{
		return RawTupUtils4F.equalsAtV2(this.v, value);
	}

	@Override
	public boolean equalsAtV2EM(float tolerance, ITup4RF t)
	{
		return TupUtils4F.equalsAtV2EM(tolerance, this.v, t);
	}

	@Override
	public boolean equalsAtV2EM(float tolerance, ITupRF t)
	{
		return TupUtils4F.equalsAtV2EM(tolerance, this.v, t);
	}

	@Override
	public boolean equalsAtV2EM(float tolerance, float[] t)
	{
		return RawTupUtils4F.equalsAtV2EM(tolerance, this.v, t);
	}

	@Override
	public boolean equalsAtV2EM(float tolerance, float value)
	{
		return RawTupUtils4F.equalsAtV2EM(tolerance, this.v, value);
	}
	
	@Override
	public boolean equalsAtV2EM4(ITup4RF t)
	{
		return TupUtils4F.equalsAtV2EM4(this.v, t);
	}

	@Override
	public boolean equalsAtV2EM4(ITupRF t)
	{
		return TupUtils4F.equalsAtV2EM4(this.v, t);
	}

	@Override
	public boolean equalsAtV2EM4(float[] t)
	{
		return RawTupUtils4F.equalsAtV2EM4(this.v, t);
	}

	@Override
	public boolean equalsAtV2EM4(float value)
	{
		return RawTupUtils4F.equalsAtV2EM4(this.v, value);
	}
	
	@Override
	public boolean equalsAtV2EM6(ITup4RF t)
	{
		return TupUtils4F.equalsAtV2EM6(this.v, t);
	}

	@Override
	public boolean equalsAtV2EM6(ITupRF t)
	{
		return TupUtils4F.equalsAtV2EM6(this.v, t);
	}

	@Override
	public boolean equalsAtV2EM6(float[] t)
	{
		return RawTupUtils4F.equalsAtV2EM6(this.v, t);
	}

	@Override
	public boolean equalsAtV2EM6(float value)
	{
		return RawTupUtils4F.equalsAtV2EM6(this.v, value);
	}
	
	@Override
	public boolean equalsAtV2EM8(ITup4RF t)
	{
		return TupUtils4F.equalsAtV2EM8(this.v, t);
	}

	@Override
	public boolean equalsAtV2EM8(ITupRF t)
	{
		return TupUtils4F.equalsAtV2EM8(this.v, t);
	}

	@Override
	public boolean equalsAtV2EM8(float[] t)
	{
		return RawTupUtils4F.equalsAtV2EM8(this.v, t);
	}

	@Override
	public boolean equalsAtV2EM8(float value)
	{
		return RawTupUtils4F.equalsAtV2EM8(this.v, value);
	}
	
	@Override
	public boolean equalsAtV3(ITup4RF t)
	{
		return TupUtils4F.equalsAtV3(this.v, t);
	}

	@Override
	public boolean equalsAtV3(ITupRF t)
	{
		return TupUtils4F.equalsAtV3(this.v, t);
	}

	@Override
	public boolean equalsAtV3(float[] t)
	{
		return RawTupUtils4F.equalsAtV3(this.v, t);
	}

	@Override
	public boolean equalsAtV3(float value)
	{
		return RawTupUtils4F.equalsAtV3(this.v, value);
	}

	@Override
	public boolean equalsAtV3EM(float tolerance, ITup4RF t)
	{
		return TupUtils4F.equalsAtV3EM(tolerance, this.v, t);
	}

	@Override
	public boolean equalsAtV3EM(float tolerance, ITupRF t)
	{
		return TupUtils4F.equalsAtV3EM(tolerance, this.v, t);
	}

	@Override
	public boolean equalsAtV3EM(float tolerance, float[] t)
	{
		return RawTupUtils4F.equalsAtV3EM(tolerance, this.v, t);
	}

	@Override
	public boolean equalsAtV3EM(float tolerance, float value)
	{
		return RawTupUtils4F.equalsAtV3EM(tolerance, this.v, value);
	}

	@Override
	public boolean equalsAtV3EM4(ITup4RF t)
	{
		return TupUtils4F.equalsAtV3EM4(this.v, t);
	}

	@Override
	public boolean equalsAtV3EM4(ITupRF t)
	{
		return TupUtils4F.equalsAtV3EM4(this.v, t);
	}

	@Override
	public boolean equalsAtV3EM4(float[] t)
	{
		return RawTupUtils4F.equalsAtV3EM4(this.v, t);
	}

	@Override
	public boolean equalsAtV3EM4(float value)
	{
		return RawTupUtils4F.equalsAtV3EM4(this.v, value);
	}

	@Override
	public boolean equalsAtV3EM6(ITup4RF t)
	{
		return TupUtils4F.equalsAtV3EM6(this.v, t);
	}

	@Override
	public boolean equalsAtV3EM6(ITupRF t)
	{
		return TupUtils4F.equalsAtV3EM6(this.v, t);
	}

	@Override
	public boolean equalsAtV3EM6(float[] t)
	{
		return RawTupUtils4F.equalsAtV3EM6(this.v, t);
	}

	@Override
	public boolean equalsAtV3EM6(float value)
	{
		return RawTupUtils4F.equalsAtV3EM6(this.v, value);
	}

	@Override
	public boolean equalsAtV3EM8(ITup4RF t)
	{
		return TupUtils4F.equalsAtV3EM8(this.v, t);
	}

	@Override
	public boolean equalsAtV3EM8(ITupRF t)
	{
		return TupUtils4F.equalsAtV3EM8(this.v, t);
	}

	@Override
	public boolean equalsAtV3EM8(float[] t)
	{
		return RawTupUtils4F.equalsAtV3EM8(this.v, t);
	}

	@Override
	public boolean equalsAtV3EM8(float value)
	{
		return RawTupUtils4F.equalsAtV3EM8(this.v, value);
	}
	
}
