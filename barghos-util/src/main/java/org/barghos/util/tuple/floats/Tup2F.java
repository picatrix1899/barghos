package org.barghos.util.tuple.floats;

import java.nio.FloatBuffer;
import java.util.Arrays;
import java.util.Objects;

import org.barghos.util.nio.buffer.IBufferableRF;
import org.barghos.util.nio.buffer.IBufferableWF;

public class Tup2F implements ITup2WF, IBufferableRF, IBufferableWF
{
	private final float[] v = new float[2];
	
	public Tup2F()
	{
		set(0.0f, 0.0f);
	}
	
	public Tup2F(ITup2RF t)
	{
		set(t);
	}
	
	public Tup2F(ITupRF t)
	{
		set(t);
	}
	
	public Tup2F(float[] t)
	{
		set(t);
	}
	
	public Tup2F(float v0, float v1)
	{
		set(v0, v1);
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
	public Tup2F v0(float v0)
	{
		this.v[0] = v0;
		
		return this;
	}

	@Override
	public Tup2F v1(float v1)
	{
		this.v[1] = v1;
		
		return this;
	}

	@Override
	public Tup2F setAt(int index, float value)
	{
		this.v[index] = value;
		
		return this;
	}

	@Override
	public Tup2F set(ITup2RF t)
	{
		t.toArray(this.v);
		
		return this;
	}

	@Override
	public Tup2F set(ITupRF t)
	{
		t.toArray(this.v);
		
		return this;
	}

	@Override
	public Tup2F set(float[] t)
	{
		System.arraycopy(t, 0, this.v, 0, 2);
		
		return this;
	}

	@Override
	public Tup2F set(float v0, float v1)
	{
		this.v[0] = v0;
		this.v[1] = v1;
		
		return this;
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
		return "tup2f(" + this.v[0] + ", " + this.v[1] + ")";
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
	public Tup2F writeTo(FloatBuffer buffer)
	{
		buffer.put(this.v);
		
		return this;
	}
	
	@Override
	public Tup2F readFrom(FloatBuffer buffer, int offset)
	{
		buffer.get(offset, this.v);
		
		return this;
	}
	
	@Override
	public boolean isFinite()
	{
		return TupUtils2F.isFinite(this.v);
	}
	
	@Override
	public boolean isFiniteAt(int index)
	{
		return TupUtils2F.isFiniteAt(index, this.v);
	}

	@Override
	public boolean isFiniteAtV0()
	{
		return TupUtils2F.isFiniteAtV0(this.v);
	}

	@Override
	public boolean isFiniteAtV1()
	{
		return TupUtils2F.isFiniteAtV1(this.v);
	}

	@Override
	public boolean isZero()
	{
		return TupUtils2F.isZero(this.v);
	}
	
	@Override
	public boolean isZeroAt(int index)
	{
		return TupUtils2F.isZeroAt(index, this.v);
	}
	
	@Override
	public boolean isZeroAtV0()
	{
		return TupUtils2F.isZeroAtV0(this.v);
	}

	@Override
	public boolean isZeroAtV1()
	{
		return TupUtils2F.isZeroAtV1(this.v);
	}

	@Override
	public boolean isZero(float tolerance)
	{
		return TupUtils2F.isZero(tolerance, this.v);
	}
	
	@Override
	public boolean isZeroAt(float tolerance, int index)
	{
		return TupUtils2F.isZeroAt(tolerance, index, this.v);
	}
	
	@Override
	public boolean isZeroAtV0(float tolerance)
	{
		return TupUtils2F.isZeroAtV0(tolerance, this.v);
	}

	@Override
	public boolean isZeroAtV1(float tolerance)
	{
		return TupUtils2F.isZeroAtV1(tolerance, this.v);
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
		return TupUtils2F.equals(this.v, t);
	}

	@Override
	public boolean equals(float v0, float v1)
	{
		return TupUtils2F.equals(this.v, v0, v1);
	}

	@Override
	public boolean equals(float tolerance, ITup2RF t)
	{
		return TupUtils2F.equals(tolerance, this.v, t);
	}

	@Override
	public boolean equals(float tolerance, ITupRF t)
	{
		return TupUtils2F.equals(tolerance, this.v, t);
	}

	@Override
	public boolean equals(float tolerance, float[] t)
	{
		return TupUtils2F.equals(tolerance, this.v, t);
	}

	@Override
	public boolean equals(float tolerance, float v0, float v1)
	{
		return TupUtils2F.equals(tolerance, this.v, v0, v1);
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
		return TupUtils2F.equalsAt(index, this.v, t);
	}

	@Override
	public boolean equalsAt(int index, float value)
	{
		return TupUtils2F.equalsAt(index, this.v, value);
	}

	@Override
	public boolean equalsAt(float tolerance, int index, ITup2RF t)
	{
		return TupUtils2F.equalsAt(tolerance, index, this.v, t);
	}

	@Override
	public boolean equalsAt(float tolerance, int index, ITupRF t)
	{
		return TupUtils2F.equalsAt(tolerance, index, this.v, t);
	}

	@Override
	public boolean equalsAt(float tolerance, int index, float[] t)
	{
		return TupUtils2F.equalsAt(tolerance, index, this.v, t);
	}

	@Override
	public boolean equalsAt(float tolerance, int index, float value)
	{
		return TupUtils2F.equalsAt(tolerance, index, this.v, value);
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
		return TupUtils2F.equalsAtV0(this.v, t);
	}

	@Override
	public boolean equalsAtV0(float value)
	{
		return TupUtils2F.equalsAtV0(this.v, value);
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
		return TupUtils2F.equalsAtV1(this.v, t);
	}

	@Override
	public boolean equalsAtV1(float value)
	{
		return TupUtils2F.equalsAtV1(this.v, value);
	}

	@Override
	public boolean equalsAtV0(float tolerance, ITup2RF t)
	{
		return TupUtils2F.equalsAtV0(tolerance, this.v, t);
	}

	@Override
	public boolean equalsAtV0(float tolerance, ITupRF t)
	{
		return TupUtils2F.equalsAtV0(tolerance, this.v, t);
	}

	@Override
	public boolean equalsAtV0(float tolerance, float[] t)
	{
		return TupUtils2F.equalsAtV0(tolerance, this.v, t);
	}

	@Override
	public boolean equalsAtV0(float tolerance, float value)
	{
		return TupUtils2F.equalsAtV1(tolerance, this.v, value);
	}

	@Override
	public boolean equalsAtV1(float tolerance, ITup2RF t)
	{
		return TupUtils2F.equalsAtV1(tolerance, this.v, t);
	}

	@Override
	public boolean equalsAtV1(float tolerance, ITupRF t)
	{
		return TupUtils2F.equalsAtV1(tolerance, this.v, t);
	}

	@Override
	public boolean equalsAtV1(float tolerance, float[] t)
	{
		return TupUtils2F.equalsAtV1(tolerance, this.v, t);
	}

	@Override
	public boolean equalsAtV1(float tolerance, float value)
	{
		return TupUtils2F.equalsAtV1(tolerance, this.v, value);
	}
}
