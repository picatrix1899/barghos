package org.barghos.util.tuple.floats;

import java.nio.FloatBuffer;
import java.util.Arrays;
import java.util.Objects;

import org.barghos.util.nio.buffer.IBufferableRF;
import org.barghos.util.nio.buffer.IBufferableWF;

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
		return TupUtils4F.isFinite(this.v);
	}
	
	@Override
	public boolean isFiniteAt(int index)
	{
		return TupUtils4F.isFiniteAt(index, this.v);
	}

	@Override
	public boolean isFiniteAtV0()
	{
		return TupUtils4F.isFiniteAtV0(this.v);
	}

	@Override
	public boolean isFiniteAtV1()
	{
		return TupUtils4F.isFiniteAtV1(this.v);
	}

	@Override
	public boolean isFiniteAtV2()
	{
		return TupUtils4F.isFiniteAtV2(this.v);
	}

	@Override
	public boolean isFiniteAtV3()
	{
		return TupUtils4F.isFiniteAtV3(this.v);
	}

	@Override
	public boolean isZero()
	{
		return TupUtils4F.isZero(this.v);
	}
	
	@Override
	public boolean isZeroAt(int index)
	{
		return TupUtils4F.isZero(index, this.v);
	}
	
	@Override
	public boolean isZeroAtV0()
	{
		return TupUtils4F.isZeroAtV0(this.v);
	}

	@Override
	public boolean isZeroAtV1()
	{
		return TupUtils4F.isZeroAtV1(this.v);
	}

	@Override
	public boolean isZeroAtV2()
	{
		return TupUtils4F.isZeroAtV2(this.v);
	}

	@Override
	public boolean isZeroAtV3()
	{
		return TupUtils4F.isZeroAtV3(this.v);
	}

	@Override
	public boolean isZero(float tolerance)
	{
		return TupUtils4F.isZero(tolerance, this.v);
	}
	
	@Override
	public boolean isZeroAt(float tolerance, int index)
	{
		return TupUtils4F.isZeroAt(tolerance, index, this.v);
	}
	
	@Override
	public boolean isZeroAtV0(float tolerance)
	{
		return TupUtils4F.isZeroAtV0(tolerance, this.v);
	}

	@Override
	public boolean isZeroAtV1(float tolerance)
	{
		return TupUtils4F.isZeroAtV1(tolerance, this.v);
	}

	@Override
	public boolean isZeroAtV2(float tolerance)
	{
		return TupUtils4F.isZeroAtV2(tolerance, this.v);
	}

	@Override
	public boolean isZeroAtV3(float tolerance)
	{
		return TupUtils4F.isZeroAtV3(tolerance, this.v);
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
		return TupUtils4F.equals(this.v, t);
	}

	@Override
	public boolean equals(float v0, float v1, float v2, float v3)
	{
		return TupUtils4F.equals(this.v, v0, v1, v2, v3);
	}

	@Override
	public boolean equals(float tolerance, ITup4RF t)
	{
		return TupUtils4F.equals(tolerance, this.v, t);
	}

	@Override
	public boolean equals(float tolerance, ITupRF t)
	{
		return TupUtils4F.equals(tolerance, this.v, t);
	}

	@Override
	public boolean equals(float tolerance, float[] t)
	{
		return TupUtils4F.equals(tolerance, this.v, t);
	}

	@Override
	public boolean equals(float tolerance, float v0, float v1, float v2, float v3)
	{
		return TupUtils4F.equals(tolerance, this.v, v0, v1, v2, v3);
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
		return TupUtils4F.equalsAt(index, this.v, t);
	}

	@Override
	public boolean equalsAt(int index, float value)
	{
		return TupUtils4F.equalsAt(index, this.v, value);
	}

	@Override
	public boolean equalsAt(float tolerance, int index, ITup4RF t)
	{
		return TupUtils4F.equalsAt(tolerance, index, this.v, t);
	}

	@Override
	public boolean equalsAt(float tolerance, int index, ITupRF t)
	{
		return TupUtils4F.equalsAt(tolerance, index, this.v, t);
	}

	@Override
	public boolean equalsAt(float tolerance, int index, float[] t)
	{
		return TupUtils4F.equalsAt(tolerance, index, this.v, t);
	}

	@Override
	public boolean equalsAt(float tolerance, int index, float value)
	{
		return TupUtils4F.equalsAt(tolerance, index, this.v, value);
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
		return TupUtils4F.equalsAtV0(this.v, t);
	}

	@Override
	public boolean equalsAtV0(float value)
	{
		return TupUtils4F.equalsAtV0(this.v, value);
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
		return TupUtils4F.equalsAtV1(this.v, t);
	}

	@Override
	public boolean equalsAtV1(float value)
	{
		return TupUtils4F.equalsAtV1(this.v, value);
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
		return TupUtils4F.equalsAtV2(this.v, t);
	}

	@Override
	public boolean equalsAtV2(float value)
	{
		return TupUtils4F.equalsAtV2(this.v, value);
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
		return TupUtils4F.equalsAtV3(this.v, t);
	}

	@Override
	public boolean equalsAtV3(float value)
	{
		return TupUtils4F.equalsAtV3(this.v, value);
	}

	@Override
	public boolean equalsAtV0(float tolerance, ITup4RF t)
	{
		return TupUtils4F.equalsAtV0(tolerance, this.v, t);
	}

	@Override
	public boolean equalsAtV0(float tolerance, ITupRF t)
	{
		return TupUtils4F.equalsAtV0(tolerance, this.v, t);
	}

	@Override
	public boolean equalsAtV0(float tolerance, float[] t)
	{
		return TupUtils4F.equalsAtV0(tolerance, this.v, t);
	}

	@Override
	public boolean equalsAtV0(float tolerance, float value)
	{
		return TupUtils4F.equalsAtV0(tolerance, this.v, value);
	}

	@Override
	public boolean equalsAtV1(float tolerance, ITup4RF t)
	{
		return TupUtils4F.equalsAtV1(tolerance, this.v, t);
	}

	@Override
	public boolean equalsAtV1(float tolerance, ITupRF t)
	{
		return TupUtils4F.equalsAtV1(tolerance, this.v, t);
	}

	@Override
	public boolean equalsAtV1(float tolerance, float[] t)
	{
		return TupUtils4F.equalsAtV1(tolerance, this.v, t);
	}

	@Override
	public boolean equalsAtV1(float tolerance, float value)
	{
		return TupUtils4F.equalsAtV1(tolerance, this.v, value);
	}

	@Override
	public boolean equalsAtV2(float tolerance, ITup4RF t)
	{
		return TupUtils4F.equalsAtV2(tolerance, this.v, t);
	}

	@Override
	public boolean equalsAtV2(float tolerance, ITupRF t)
	{
		return TupUtils4F.equalsAtV2(tolerance, this.v, t);
	}

	@Override
	public boolean equalsAtV2(float tolerance, float[] t)
	{
		return TupUtils4F.equalsAtV2(tolerance, this.v, t);
	}

	@Override
	public boolean equalsAtV2(float tolerance, float value)
	{
		return TupUtils4F.equalsAtV2(tolerance, this.v, value);
	}

	@Override
	public boolean equalsAtV3(float tolerance, ITup4RF t)
	{
		return TupUtils4F.equalsAtV3(tolerance, this.v, t);
	}

	@Override
	public boolean equalsAtV3(float tolerance, ITupRF t)
	{
		return TupUtils4F.equalsAtV3(tolerance, this.v, t);
	}

	@Override
	public boolean equalsAtV3(float tolerance, float[] t)
	{
		return TupUtils4F.equalsAtV3(tolerance, this.v, t);
	}

	@Override
	public boolean equalsAtV3(float tolerance, float value)
	{
		return TupUtils4F.equalsAtV3(tolerance, this.v, value);
	}
}
