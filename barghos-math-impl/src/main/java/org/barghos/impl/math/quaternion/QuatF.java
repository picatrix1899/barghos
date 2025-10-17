package org.barghos.impl.math.quaternion;

import java.util.Arrays;
import java.util.Objects;

import org.barghos.api.core.function.floats.IFunc4F;
import org.barghos.api.core.math.MathUtils;
import org.barghos.api.core.tuple.floats.ITup3RF;
import org.barghos.api.core.tuple.floats.ITup3WF;
import org.barghos.api.core.tuple.floats.ITup4RF;
import org.barghos.api.core.tuple.floats.ITupRF;
import org.barghos.api.core.tuple.floats.RawTupUtils4F;
import org.barghos.api.core.tuple.floats.TupUtils4F;
import org.barghos.api.math.quaternion.IQuatWF;
import org.barghos.api.math.quaternion.QuatUtilsF;

public class QuatF implements IQuatWF
{
	public static final IFunc4F<QuatF> CTOR = QuatF::new;
	
	private final float[] q = new float[4];
	
	public QuatF()
	{
		set(0.0f, 0.0f, 0.0f, 1.0f);
	}
	
	public QuatF(ITup4RF t)
	{
		set(t);
	}
	
	public QuatF(ITupRF t)
	{
		set(t);
	}
	
	public QuatF(float[] t)
	{
		set(t);
	}
	
	public QuatF(float x, float y, float z, float w)
	{
		set(x, y, z, w);
	}
	
	/** {@inheritDoc} */
	@Override
	public float x()
	{
		return this.q[0];
	}

	/** {@inheritDoc} */
	@Override
	public float y()
	{
		return this.q[1];
	}

	/** {@inheritDoc} */
	@Override
	public float z()
	{
		return this.q[2];
	}

	/** {@inheritDoc} */
	@Override
	public float w()
	{
		return this.q[3];
	}

	/** {@inheritDoc} */
	@Override
	public float v0()
	{
		return this.q[0];
	}

	/** {@inheritDoc} */
	@Override
	public float v1()
	{
		return this.q[1];
	}

	/** {@inheritDoc} */
	@Override
	public float v2()
	{
		return this.q[2];
	}

	/** {@inheritDoc} */
	@Override
	public float v3()
	{
		return this.q[3];
	}
	
	/** {@inheritDoc} */
	@Override
	public float getAt(int index)
	{
		return this.q[index];
	}
	
	/** {@inheritDoc} */
	@Override
	public QuatF x(float x)
	{
		this.q[0] = x;
		
		return this;
	}

	/** {@inheritDoc} */
	@Override
	public QuatF y(float y)
	{
		this.q[1] = y;
		
		return this;
	}

	/** {@inheritDoc} */
	@Override
	public QuatF z(float z)
	{
		this.q[2] = z;
		
		return this;
	}

	/** {@inheritDoc} */
	@Override
	public QuatF w(float w)
	{
		this.q[3] = w;
		
		return this;
	}

	/** {@inheritDoc} */
	@Override
	public QuatF v0(float v0)
	{
		this.q[0] = v0;
		
		return this;
	}

	/** {@inheritDoc} */
	@Override
	public QuatF v1(float v1)
	{
		this.q[1] = v1;
		
		return this;
	}

	/** {@inheritDoc} */
	@Override
	public QuatF v2(float v2)
	{
		this.q[2] = v2;
		
		return this;
	}

	/** {@inheritDoc} */
	@Override
	public QuatF v3(float v3)
	{
		this.q[3] = v3;
		
		return this;
	}

	/** {@inheritDoc} */
	@Override
	public QuatF set(ITup4RF t)
	{
		t.toArray(this.q);
		
		return this;
	}

	/** {@inheritDoc} */
	@Override
	public QuatF set(ITupRF t)
	{
		t.toArray(this.q);
		
		return this;
	}

	/** {@inheritDoc} */
	@Override
	public QuatF set(float[] values)
	{
		System.arraycopy(values, 0, this.q, 0, 4);
		
		return this;
	}

	/** {@inheritDoc} */
	@Override
	public QuatF set(float x, float y, float z, float w)
	{
		this.q[0] = x;
		this.q[1] = y;
		this.q[2] = z;
		this.q[3] = w;
		
		return this;
	}

	/** {@inheritDoc} */
	@Override
	public QuatF setAt(int index, float value)
	{
		this.q[index] = value;
		
		return this;
	}
	
	/** {@inheritDoc} */
	@Override
	public QuatF setFromAxisAngle(float ax, float ay, float az, float angle)
	{
		float halfAngle = angle * 0.5f;
		float sinHalfAngle = MathUtils.sin(halfAngle);
		
		float x_ = ax * sinHalfAngle;
		float y_ = ay * sinHalfAngle;
		float z_ = az * sinHalfAngle;
		float w_ = MathUtils.cos(halfAngle);
		
		float invLength = MathUtils.invSqrt(x_ * x_ + y_ * y_ + z_ * z_ + w_ * w_);

		return set(x_ * invLength, y_ * invLength, z_ * invLength, w_ * invLength);
	}
	
	/** {@inheritDoc} */
	@Override
	public float[] toArray()
	{
		return Arrays.copyOf(this.q, 4);
	}

	/** {@inheritDoc} */
	@Override
	public float[] toArray(float[] res)
	{
		System.arraycopy(this.q, 0, res, 0, 4);
		
		return res;
	}

	/** {@inheritDoc} */
	@Override
	public String toString()
	{
		return "quatf(x=" + this.q[0] + ", y=" + this.q[1] + ", z=" + this.q[2] + "; w=" + this.q[3] + ")";
	}
	
	/** {@inheritDoc} */
	@Override
	public int hashCode()
	{
		return Objects.hash(this.q);
	}
	
	/** {@inheritDoc} */
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
	
	/** {@inheritDoc} */
	@Override
	public boolean isFinite()
	{
		return RawTupUtils4F.isFinite(this.q);
	}
	
	/** {@inheritDoc} */
	@Override
	public boolean isFiniteAt(int index)
	{
		return RawTupUtils4F.isFiniteAt(index, this.q);
	}

	/** {@inheritDoc} */
	@Override
	public boolean isFiniteAtV0()
	{
		return RawTupUtils4F.isFiniteAtV0(this.q);
	}

	/** {@inheritDoc} */
	@Override
	public boolean isFiniteAtV1()
	{
		return RawTupUtils4F.isFiniteAtV1(this.q);
	}

	/** {@inheritDoc} */
	@Override
	public boolean isFiniteAtV2()
	{
		return RawTupUtils4F.isFiniteAtV2(this.q);
	}

	/** {@inheritDoc} */
	@Override
	public boolean isFiniteAtV3()
	{
		return RawTupUtils4F.isFiniteAtV3(this.q);
	}

	/** {@inheritDoc} */
	@Override
	public boolean isInfinite()
	{
		return RawTupUtils4F.isInfinite(this.q);
	}
	
	/** {@inheritDoc} */
	@Override
	public boolean isInfiniteAt(int index)
	{
		return RawTupUtils4F.isInfiniteAt(index, this.q);
	}

	/** {@inheritDoc} */
	@Override
	public boolean isInfiniteAtV0()
	{
		return RawTupUtils4F.isInfiniteAtV0(this.q);
	}

	/** {@inheritDoc} */
	@Override
	public boolean isInfiniteAtV1()
	{
		return RawTupUtils4F.isInfiniteAtV1(this.q);
	}

	/** {@inheritDoc} */
	@Override
	public boolean isInfiniteAtV2()
	{
		return RawTupUtils4F.isInfiniteAtV2(this.q);
	}

	/** {@inheritDoc} */
	@Override
	public boolean isInfiniteAtV3()
	{
		return RawTupUtils4F.isInfiniteAtV3(this.q);
	}
	
	/** {@inheritDoc} */
	@Override
	public boolean isNaN()
	{
		return RawTupUtils4F.isNaN(this.q);
	}
	
	/** {@inheritDoc} */
	@Override
	public boolean isNaNAt(int index)
	{
		return RawTupUtils4F.isNaNAt(index, this.q);
	}

	/** {@inheritDoc} */
	@Override
	public boolean isNaNAtV0()
	{
		return RawTupUtils4F.isNaNAtV0(this.q);
	}

	/** {@inheritDoc} */
	@Override
	public boolean isNaNAtV1()
	{
		return RawTupUtils4F.isNaNAtV1(this.q);
	}

	/** {@inheritDoc} */
	@Override
	public boolean isNaNAtV2()
	{
		return RawTupUtils4F.isNaNAtV2(this.q);
	}

	/** {@inheritDoc} */
	@Override
	public boolean isNaNAtV3()
	{
		return RawTupUtils4F.isNaNAtV3(this.q);
	}
	
	/** {@inheritDoc} */
	@Override
	public boolean isZero()
	{
		return RawTupUtils4F.isZero(this.q);
	}

	/** {@inheritDoc} */
	@Override
	public boolean isZeroEM(float tolerance)
	{
		return RawTupUtils4F.isZeroEM(tolerance, this.q);
	}
	
	/** {@inheritDoc} */
	@Override
	public boolean isZeroEM4()
	{
		return RawTupUtils4F.isZeroEM4(this.q);
	}
	
	/** {@inheritDoc} */
	@Override
	public boolean isZeroEM6()
	{
		return RawTupUtils4F.isZeroEM6(this.q);
	}
	
	/** {@inheritDoc} */
	@Override
	public boolean isZeroEM8()
	{
		return RawTupUtils4F.isZeroEM8(this.q);
	}
	
	/** {@inheritDoc} */
	@Override
	public boolean isZeroAt(int index)
	{
		return RawTupUtils4F.isZeroAt(index, this.q);
	}

	/** {@inheritDoc} */
	@Override
	public boolean isZeroAtEM(float tolerance, int index)
	{
		return RawTupUtils4F.isZeroAtEM(tolerance, index, this.q);
	}
	
	/** {@inheritDoc} */
	@Override
	public boolean isZeroAtEM4(int index)
	{
		return RawTupUtils4F.isZeroAtEM4(index, this.q);
	}
	
	/** {@inheritDoc} */
	@Override
	public boolean isZeroAtEM6(int index)
	{
		return RawTupUtils4F.isZeroAtEM6(index, this.q);
	}

	/** {@inheritDoc} */
	@Override
	public boolean isZeroAtEM8(int index)
	{
		return RawTupUtils4F.isZeroAtEM8(index, this.q);
	}

	/** {@inheritDoc} */
	@Override
	public boolean isZeroAtV0()
	{
		return RawTupUtils4F.isZeroAtV0(this.q);
	}

	/** {@inheritDoc} */
	@Override
	public boolean isZeroAtV0EM(float tolerance)
	{
		return RawTupUtils4F.isZeroAtV0EM(tolerance, this.q);
	}
	
	/** {@inheritDoc} */
	@Override
	public boolean isZeroAtV0EM4()
	{
		return RawTupUtils4F.isZeroAtV0EM4(this.q);
	}
	
	/** {@inheritDoc} */
	@Override
	public boolean isZeroAtV0EM6()
	{
		return RawTupUtils4F.isZeroAtV0EM6(this.q);
	}
	
	/** {@inheritDoc} */
	@Override
	public boolean isZeroAtV0EM8()
	{
		return RawTupUtils4F.isZeroAtV0EM8(this.q);
	}
	
	/** {@inheritDoc} */
	@Override
	public boolean isZeroAtV1()
	{
		return RawTupUtils4F.isZeroAtV1(this.q);
	}

	/** {@inheritDoc} */
	@Override
	public boolean isZeroAtV1EM(float tolerance)
	{
		return RawTupUtils4F.isZeroAtV1EM(tolerance, this.q);
	}
	
	/** {@inheritDoc} */
	@Override
	public boolean isZeroAtV1EM4()
	{
		return RawTupUtils4F.isZeroAtV1EM4(this.q);
	}
	
	/** {@inheritDoc} */
	@Override
	public boolean isZeroAtV1EM6()
	{
		return RawTupUtils4F.isZeroAtV1EM6(this.q);
	}
	
	/** {@inheritDoc} */
	@Override
	public boolean isZeroAtV1EM8()
	{
		return RawTupUtils4F.isZeroAtV1EM8(this.q);
	}
	
	/** {@inheritDoc} */
	@Override
	public boolean isZeroAtV2()
	{
		return RawTupUtils4F.isZeroAtV2(this.q);
	}

	/** {@inheritDoc} */
	@Override
	public boolean isZeroAtV2EM(float tolerance)
	{
		return RawTupUtils4F.isZeroAtV2EM(tolerance, this.q);
	}
	
	/** {@inheritDoc} */
	@Override
	public boolean isZeroAtV2EM4()
	{
		return RawTupUtils4F.isZeroAtV2EM4(this.q);
	}
	
	/** {@inheritDoc} */
	@Override
	public boolean isZeroAtV2EM6()
	{
		return RawTupUtils4F.isZeroAtV2EM6(this.q);
	}
	
	/** {@inheritDoc} */
	@Override
	public boolean isZeroAtV2EM8()
	{
		return RawTupUtils4F.isZeroAtV2EM8(this.q);
	}
	
	/** {@inheritDoc} */
	@Override
	public boolean isZeroAtV3()
	{
		return RawTupUtils4F.isZeroAtV3(this.q);
	}

	/** {@inheritDoc} */
	@Override
	public boolean isZeroAtV3EM(float tolerance)
	{
		return RawTupUtils4F.isZeroAtV3EM(tolerance, this.q);
	}
	
	/** {@inheritDoc} */
	@Override
	public boolean isZeroAtV3EM4()
	{
		return RawTupUtils4F.isZeroAtV3EM4(this.q);
	}

	/** {@inheritDoc} */
	@Override
	public boolean isZeroAtV3EM6()
	{
		return RawTupUtils4F.isZeroAtV3EM6(this.q);
	}

	/** {@inheritDoc} */
	@Override
	public boolean isZeroAtV3EM8()
	{
		return RawTupUtils4F.isZeroAtV3EM8(this.q);
	}

	/** {@inheritDoc} */
	@Override
	public boolean equals(ITup4RF t)
	{
		return TupUtils4F.equals(this.q, t);
	}

	/** {@inheritDoc} */
	@Override
	public boolean equals(ITupRF t)
	{
		return TupUtils4F.equals(this.q, t);
	}

	/** {@inheritDoc} */
	@Override
	public boolean equals(float[] t)
	{
		return RawTupUtils4F.equals(this.q, t);
	}

	/** {@inheritDoc} */
	@Override
	public boolean equals(float v0, float v1, float v2, float v3)
	{
		return RawTupUtils4F.equals(this.q, v0, v1, v2, v3);
	}

	/** {@inheritDoc} */
	@Override
	public boolean equalsEM(float tolerance, ITup4RF t)
	{
		return TupUtils4F.equalsEM(tolerance, this.q, t);
	}

	/** {@inheritDoc} */
	@Override
	public boolean equalsEM(float tolerance, ITupRF t)
	{
		return TupUtils4F.equalsEM(tolerance, this.q, t);
	}

	/** {@inheritDoc} */
	@Override
	public boolean equalsEM(float tolerance, float[] t)
	{
		return RawTupUtils4F.equalsEM(tolerance, this.q, t);
	}

	/** {@inheritDoc} */
	@Override
	public boolean equalsEM(float tolerance, float v0, float v1, float v2, float v3)
	{
		return RawTupUtils4F.equalsEM(tolerance, this.q, v0, v1, v2, v3);
	}
	
	/** {@inheritDoc} */
	@Override
	public boolean equalsEM4(ITup4RF t)
	{
		return TupUtils4F.equalsEM4(this.q, t);
	}

	/** {@inheritDoc} */
	@Override
	public boolean equalsEM4(ITupRF t)
	{
		return TupUtils4F.equalsEM4(this.q, t);
	}

	/** {@inheritDoc} */
	@Override
	public boolean equalsEM4(float[] t)
	{
		return RawTupUtils4F.equalsEM4(this.q, t);
	}

	/** {@inheritDoc} */
	@Override
	public boolean equalsEM4(float v0, float v1, float v2, float v3)
	{
		return RawTupUtils4F.equalsEM4(this.q, v0, v1, v2, v3);
	}
	
	/** {@inheritDoc} */
	@Override
	public boolean equalsEM6(ITup4RF t)
	{
		return TupUtils4F.equalsEM6(this.q, t);
	}

	/** {@inheritDoc} */
	@Override
	public boolean equalsEM6(ITupRF t)
	{
		return TupUtils4F.equalsEM6(this.q, t);
	}

	/** {@inheritDoc} */
	@Override
	public boolean equalsEM6(float[] t)
	{
		return RawTupUtils4F.equalsEM6(this.q, t);
	}

	/** {@inheritDoc} */
	@Override
	public boolean equalsEM6(float v0, float v1, float v2, float v3)
	{
		return RawTupUtils4F.equalsEM6(this.q, v0, v1, v2, v3);
	}
	
	/** {@inheritDoc} */
	@Override
	public boolean equalsEM8(ITup4RF t)
	{
		return TupUtils4F.equalsEM8(this.q, t);
	}

	/** {@inheritDoc} */
	@Override
	public boolean equalsEM8(ITupRF t)
	{
		return TupUtils4F.equalsEM8(this.q, t);
	}

	/** {@inheritDoc} */
	@Override
	public boolean equalsEM8(float[] t)
	{
		return RawTupUtils4F.equalsEM8(this.q, t);
	}

	/** {@inheritDoc} */
	@Override
	public boolean equalsEM8(float v0, float v1, float v2, float v3)
	{
		return RawTupUtils4F.equalsEM8(this.q, v0, v1, v2, v3);
	}

	/** {@inheritDoc} */
	@Override
	public boolean equalsAt(int index, ITup4RF t)
	{
		return TupUtils4F.equalsAt(index, this.q, t);
	}

	/** {@inheritDoc} */
	@Override
	public boolean equalsAt(int index, ITupRF t)
	{
		return TupUtils4F.equalsAt(index, this.q, t);
	}

	/** {@inheritDoc} */
	@Override
	public boolean equalsAt(int index, float[] t)
	{
		return RawTupUtils4F.equalsAt(index, this.q, t);
	}

	/** {@inheritDoc} */
	@Override
	public boolean equalsAt(int index, float value)
	{
		return RawTupUtils4F.equalsAt(index, this.q, value);
	}
	
	/** {@inheritDoc} */
	@Override
	public boolean equalsAtEM(float tolerance, int index, ITup4RF t)
	{
		return TupUtils4F.equalsAtEM(tolerance, index, this.q, t);
	}

	/** {@inheritDoc} */
	@Override
	public boolean equalsAtEM(float tolerance, int index, ITupRF t)
	{
		return TupUtils4F.equalsAtEM(tolerance, index, this.q, t);
	}

	/** {@inheritDoc} */
	@Override
	public boolean equalsAtEM(float tolerance, int index, float[] t)
	{
		return RawTupUtils4F.equalsAtEM(tolerance, index, this.q, t);
	}

	/** {@inheritDoc} */
	@Override
	public boolean equalsAtEM(float tolerance, int index, float value)
	{
		return RawTupUtils4F.equalsAtEM(tolerance, index, this.q, value);
	}
	
	/** {@inheritDoc} */
	@Override
	public boolean equalsAtEM4(int index, ITup4RF t)
	{
		return TupUtils4F.equalsAtEM4(index, this.q, t);
	}

	/** {@inheritDoc} */
	@Override
	public boolean equalsAtEM4(int index, ITupRF t)
	{
		return TupUtils4F.equalsAtEM4(index, this.q, t);
	}

	/** {@inheritDoc} */
	@Override
	public boolean equalsAtEM4(int index, float[] t)
	{
		return RawTupUtils4F.equalsAtEM4(index, this.q, t);
	}

	/** {@inheritDoc} */
	@Override
	public boolean equalsAtEM4(int index, float value)
	{
		return RawTupUtils4F.equalsAtEM4(index, this.q, value);
	}
	
	/** {@inheritDoc} */
	@Override
	public boolean equalsAtEM6(int index, ITup4RF t)
	{
		return TupUtils4F.equalsAtEM6(index, this.q, t);
	}

	/** {@inheritDoc} */
	@Override
	public boolean equalsAtEM6(int index, ITupRF t)
	{
		return TupUtils4F.equalsAtEM6(index, this.q, t);
	}

	/** {@inheritDoc} */
	@Override
	public boolean equalsAtEM6(int index, float[] t)
	{
		return RawTupUtils4F.equalsAtEM6(index, this.q, t);
	}

	/** {@inheritDoc} */
	@Override
	public boolean equalsAtEM6(int index, float value)
	{
		return RawTupUtils4F.equalsAtEM6(index, this.q, value);
	}
	
	/** {@inheritDoc} */
	@Override
	public boolean equalsAtEM8(int index, ITup4RF t)
	{
		return TupUtils4F.equalsAtEM8(index, this.q, t);
	}

	/** {@inheritDoc} */
	@Override
	public boolean equalsAtEM8(int index, ITupRF t)
	{
		return TupUtils4F.equalsAtEM8(index, this.q, t);
	}

	/** {@inheritDoc} */
	@Override
	public boolean equalsAtEM8(int index, float[] t)
	{
		return RawTupUtils4F.equalsAtEM8(index, this.q, t);
	}

	/** {@inheritDoc} */
	@Override
	public boolean equalsAtEM8(int index, float value)
	{
		return RawTupUtils4F.equalsAtEM8(index, this.q, value);
	}

	/** {@inheritDoc} */
	@Override
	public boolean equalsAtV0(ITup4RF t)
	{
		return TupUtils4F.equalsAtV0(this.q, t);
	}

	/** {@inheritDoc} */
	@Override
	public boolean equalsAtV0(ITupRF t)
	{
		return TupUtils4F.equalsAtV0(this.q, t);
	}

	/** {@inheritDoc} */
	@Override
	public boolean equalsAtV0(float[] t)
	{
		return RawTupUtils4F.equalsAtV0(this.q, t);
	}

	/** {@inheritDoc} */
	@Override
	public boolean equalsAtV0(float value)
	{
		return RawTupUtils4F.equalsAtV0(this.q, value);
	}

	/** {@inheritDoc} */
	@Override
	public boolean equalsAtV0EM(float tolerance, ITup4RF t)
	{
		return TupUtils4F.equalsAtV0EM(tolerance, this.q, t);
	}

	/** {@inheritDoc} */
	@Override
	public boolean equalsAtV0EM(float tolerance, ITupRF t)
	{
		return TupUtils4F.equalsAtV0EM(tolerance, this.q, t);
	}

	/** {@inheritDoc} */
	@Override
	public boolean equalsAtV0EM(float tolerance, float[] t)
	{
		return RawTupUtils4F.equalsAtV0EM(tolerance, this.q, t);
	}

	/** {@inheritDoc} */
	@Override
	public boolean equalsAtV0EM(float tolerance, float value)
	{
		return RawTupUtils4F.equalsAtV0EM(tolerance, this.q, value);
	}
	
	/** {@inheritDoc} */
	@Override
	public boolean equalsAtV0EM4(ITup4RF t)
	{
		return TupUtils4F.equalsAtV0EM4(this.q, t);
	}

	/** {@inheritDoc} */
	@Override
	public boolean equalsAtV0EM4(ITupRF t)
	{
		return TupUtils4F.equalsAtV0EM4(this.q, t);
	}

	/** {@inheritDoc} */
	@Override
	public boolean equalsAtV0EM4(float[] t)
	{
		return RawTupUtils4F.equalsAtV0EM4(this.q, t);
	}

	/** {@inheritDoc} */
	@Override
	public boolean equalsAtV0EM4(float value)
	{
		return RawTupUtils4F.equalsAtV0EM4(this.q, value);
	}
	
	/** {@inheritDoc} */
	@Override
	public boolean equalsAtV0EM6(ITup4RF t)
	{
		return TupUtils4F.equalsAtV0EM6(this.q, t);
	}

	/** {@inheritDoc} */
	@Override
	public boolean equalsAtV0EM6(ITupRF t)
	{
		return TupUtils4F.equalsAtV0EM6(this.q, t);
	}

	/** {@inheritDoc} */
	@Override
	public boolean equalsAtV0EM6(float[] t)
	{
		return RawTupUtils4F.equalsAtV0EM6(this.q, t);
	}

	/** {@inheritDoc} */
	@Override
	public boolean equalsAtV0EM6(float value)
	{
		return RawTupUtils4F.equalsAtV0EM6(this.q, value);
	}
	
	/** {@inheritDoc} */
	@Override
	public boolean equalsAtV0EM8(ITup4RF t)
	{
		return TupUtils4F.equalsAtV0EM8(this.q, t);
	}

	/** {@inheritDoc} */
	@Override
	public boolean equalsAtV0EM8(ITupRF t)
	{
		return TupUtils4F.equalsAtV0EM8(this.q, t);
	}

	/** {@inheritDoc} */
	@Override
	public boolean equalsAtV0EM8(float[] t)
	{
		return RawTupUtils4F.equalsAtV0EM8(this.q, t);
	}

	/** {@inheritDoc} */
	@Override
	public boolean equalsAtV0EM8(float value)
	{
		return RawTupUtils4F.equalsAtV0EM8(this.q, value);
	}
	
	/** {@inheritDoc} */
	@Override
	public boolean equalsAtV1(ITup4RF t)
	{
		return TupUtils4F.equalsAtV1(this.q, t);
	}

	/** {@inheritDoc} */
	@Override
	public boolean equalsAtV1(ITupRF t)
	{
		return TupUtils4F.equalsAtV1(this.q, t);
	}

	/** {@inheritDoc} */
	@Override
	public boolean equalsAtV1(float[] t)
	{
		return RawTupUtils4F.equalsAtV1(this.q, t);
	}

	/** {@inheritDoc} */
	@Override
	public boolean equalsAtV1(float value)
	{
		return RawTupUtils4F.equalsAtV1(this.q, value);
	}

	/** {@inheritDoc} */
	@Override
	public boolean equalsAtV1EM(float tolerance, ITup4RF t)
	{
		return TupUtils4F.equalsAtV1EM(tolerance, this.q, t);
	}

	/** {@inheritDoc} */
	@Override
	public boolean equalsAtV1EM(float tolerance, ITupRF t)
	{
		return TupUtils4F.equalsAtV1EM(tolerance, this.q, t);
	}

	/** {@inheritDoc} */
	@Override
	public boolean equalsAtV1EM(float tolerance, float[] t)
	{
		return RawTupUtils4F.equalsAtV1EM(tolerance, this.q, t);
	}

	/** {@inheritDoc} */
	@Override
	public boolean equalsAtV1EM(float tolerance, float value)
	{
		return RawTupUtils4F.equalsAtV1EM(tolerance, this.q, value);
	}
	
	/** {@inheritDoc} */
	@Override
	public boolean equalsAtV1EM4(ITup4RF t)
	{
		return TupUtils4F.equalsAtV1EM4(this.q, t);
	}

	/** {@inheritDoc} */
	@Override
	public boolean equalsAtV1EM4(ITupRF t)
	{
		return TupUtils4F.equalsAtV1EM4(this.q, t);
	}

	/** {@inheritDoc} */
	@Override
	public boolean equalsAtV1EM4(float[] t)
	{
		return RawTupUtils4F.equalsAtV1EM4(this.q, t);
	}

	/** {@inheritDoc} */
	@Override
	public boolean equalsAtV1EM4(float value)
	{
		return RawTupUtils4F.equalsAtV1EM4(this.q, value);
	}
	
	/** {@inheritDoc} */
	@Override
	public boolean equalsAtV1EM6(ITup4RF t)
	{
		return TupUtils4F.equalsAtV1EM6(this.q, t);
	}

	/** {@inheritDoc} */
	@Override
	public boolean equalsAtV1EM6(ITupRF t)
	{
		return TupUtils4F.equalsAtV1EM6(this.q, t);
	}

	/** {@inheritDoc} */
	@Override
	public boolean equalsAtV1EM6(float[] t)
	{
		return RawTupUtils4F.equalsAtV1EM6(this.q, t);
	}

	/** {@inheritDoc} */
	@Override
	public boolean equalsAtV1EM6(float value)
	{
		return RawTupUtils4F.equalsAtV1EM6(this.q, value);
	}
	
	/** {@inheritDoc} */
	@Override
	public boolean equalsAtV1EM8(ITup4RF t)
	{
		return TupUtils4F.equalsAtV1EM8(this.q, t);
	}

	/** {@inheritDoc} */
	@Override
	public boolean equalsAtV1EM8(ITupRF t)
	{
		return TupUtils4F.equalsAtV1EM8(this.q, t);
	}

	/** {@inheritDoc} */
	@Override
	public boolean equalsAtV1EM8(float[] t)
	{
		return RawTupUtils4F.equalsAtV1EM8(this.q, t);
	}

	/** {@inheritDoc} */
	@Override
	public boolean equalsAtV1EM8(float value)
	{
		return RawTupUtils4F.equalsAtV1EM8(this.q, value);
	}
	
	/** {@inheritDoc} */
	@Override
	public boolean equalsAtV2(ITup4RF t)
	{
		return TupUtils4F.equalsAtV2(this.q, t);
	}

	/** {@inheritDoc} */
	@Override
	public boolean equalsAtV2(ITupRF t)
	{
		return TupUtils4F.equalsAtV2(this.q, t);
	}

	/** {@inheritDoc} */
	@Override
	public boolean equalsAtV2(float[] t)
	{
		return RawTupUtils4F.equalsAtV2(this.q, t);
	}

	/** {@inheritDoc} */
	@Override
	public boolean equalsAtV2(float value)
	{
		return RawTupUtils4F.equalsAtV2(this.q, value);
	}

	/** {@inheritDoc} */
	@Override
	public boolean equalsAtV2EM(float tolerance, ITup4RF t)
	{
		return TupUtils4F.equalsAtV2EM(tolerance, this.q, t);
	}

	/** {@inheritDoc} */
	@Override
	public boolean equalsAtV2EM(float tolerance, ITupRF t)
	{
		return TupUtils4F.equalsAtV2EM(tolerance, this.q, t);
	}

	/** {@inheritDoc} */
	@Override
	public boolean equalsAtV2EM(float tolerance, float[] t)
	{
		return RawTupUtils4F.equalsAtV2EM(tolerance, this.q, t);
	}

	/** {@inheritDoc} */
	@Override
	public boolean equalsAtV2EM(float tolerance, float value)
	{
		return RawTupUtils4F.equalsAtV2EM(tolerance, this.q, value);
	}
	
	/** {@inheritDoc} */
	@Override
	public boolean equalsAtV2EM4(ITup4RF t)
	{
		return TupUtils4F.equalsAtV2EM4(this.q, t);
	}

	/** {@inheritDoc} */
	@Override
	public boolean equalsAtV2EM4(ITupRF t)
	{
		return TupUtils4F.equalsAtV2EM4(this.q, t);
	}

	/** {@inheritDoc} */
	@Override
	public boolean equalsAtV2EM4(float[] t)
	{
		return RawTupUtils4F.equalsAtV2EM4(this.q, t);
	}

	/** {@inheritDoc} */
	@Override
	public boolean equalsAtV2EM4(float value)
	{
		return RawTupUtils4F.equalsAtV2EM4(this.q, value);
	}
	
	/** {@inheritDoc} */
	@Override
	public boolean equalsAtV2EM6(ITup4RF t)
	{
		return TupUtils4F.equalsAtV2EM6(this.q, t);
	}

	/** {@inheritDoc} */
	@Override
	public boolean equalsAtV2EM6(ITupRF t)
	{
		return TupUtils4F.equalsAtV2EM6(this.q, t);
	}

	/** {@inheritDoc} */
	@Override
	public boolean equalsAtV2EM6(float[] t)
	{
		return RawTupUtils4F.equalsAtV2EM6(this.q, t);
	}

	/** {@inheritDoc} */
	@Override
	public boolean equalsAtV2EM6(float value)
	{
		return RawTupUtils4F.equalsAtV2EM6(this.q, value);
	}
	
	/** {@inheritDoc} */
	@Override
	public boolean equalsAtV2EM8(ITup4RF t)
	{
		return TupUtils4F.equalsAtV2EM8(this.q, t);
	}

	/** {@inheritDoc} */
	@Override
	public boolean equalsAtV2EM8(ITupRF t)
	{
		return TupUtils4F.equalsAtV2EM8(this.q, t);
	}

	/** {@inheritDoc} */
	@Override
	public boolean equalsAtV2EM8(float[] t)
	{
		return RawTupUtils4F.equalsAtV2EM8(this.q, t);
	}

	/** {@inheritDoc} */
	@Override
	public boolean equalsAtV2EM8(float value)
	{
		return RawTupUtils4F.equalsAtV2EM8(this.q, value);
	}
	
	/** {@inheritDoc} */
	@Override
	public boolean equalsAtV3(ITup4RF t)
	{
		return TupUtils4F.equalsAtV3(this.q, t);
	}

	/** {@inheritDoc} */
	@Override
	public boolean equalsAtV3(ITupRF t)
	{
		return TupUtils4F.equalsAtV3(this.q, t);
	}

	/** {@inheritDoc} */
	@Override
	public boolean equalsAtV3(float[] t)
	{
		return RawTupUtils4F.equalsAtV3(this.q, t);
	}

	/** {@inheritDoc} */
	@Override
	public boolean equalsAtV3(float value)
	{
		return RawTupUtils4F.equalsAtV3(this.q, value);
	}

	/** {@inheritDoc} */
	@Override
	public boolean equalsAtV3EM(float tolerance, ITup4RF t)
	{
		return TupUtils4F.equalsAtV3EM(tolerance, this.q, t);
	}

	/** {@inheritDoc} */
	@Override
	public boolean equalsAtV3EM(float tolerance, ITupRF t)
	{
		return TupUtils4F.equalsAtV3EM(tolerance, this.q, t);
	}

	/** {@inheritDoc} */
	@Override
	public boolean equalsAtV3EM(float tolerance, float[] t)
	{
		return RawTupUtils4F.equalsAtV3EM(tolerance, this.q, t);
	}

	/** {@inheritDoc} */
	@Override
	public boolean equalsAtV3EM(float tolerance, float value)
	{
		return RawTupUtils4F.equalsAtV3EM(tolerance, this.q, value);
	}

	/** {@inheritDoc} */
	@Override
	public boolean equalsAtV3EM4(ITup4RF t)
	{
		return TupUtils4F.equalsAtV3EM4(this.q, t);
	}

	/** {@inheritDoc} */
	@Override
	public boolean equalsAtV3EM4(ITupRF t)
	{
		return TupUtils4F.equalsAtV3EM4(this.q, t);
	}

	/** {@inheritDoc} */
	@Override
	public boolean equalsAtV3EM4(float[] t)
	{
		return RawTupUtils4F.equalsAtV3EM4(this.q, t);
	}

	/** {@inheritDoc} */
	@Override
	public boolean equalsAtV3EM4(float value)
	{
		return RawTupUtils4F.equalsAtV3EM4(this.q, value);
	}

	/** {@inheritDoc} */
	@Override
	public boolean equalsAtV3EM6(ITup4RF t)
	{
		return TupUtils4F.equalsAtV3EM6(this.q, t);
	}

	/** {@inheritDoc} */
	@Override
	public boolean equalsAtV3EM6(ITupRF t)
	{
		return TupUtils4F.equalsAtV3EM6(this.q, t);
	}

	/** {@inheritDoc} */
	@Override
	public boolean equalsAtV3EM6(float[] t)
	{
		return RawTupUtils4F.equalsAtV3EM6(this.q, t);
	}

	/** {@inheritDoc} */
	@Override
	public boolean equalsAtV3EM6(float value)
	{
		return RawTupUtils4F.equalsAtV3EM6(this.q, value);
	}

	/** {@inheritDoc} */
	@Override
	public boolean equalsAtV3EM8(ITup4RF t)
	{
		return TupUtils4F.equalsAtV3EM8(this.q, t);
	}

	/** {@inheritDoc} */
	@Override
	public boolean equalsAtV3EM8(ITupRF t)
	{
		return TupUtils4F.equalsAtV3EM8(this.q, t);
	}

	/** {@inheritDoc} */
	@Override
	public boolean equalsAtV3EM8(float[] t)
	{
		return RawTupUtils4F.equalsAtV3EM8(this.q, t);
	}

	/** {@inheritDoc} */
	@Override
	public boolean equalsAtV3EM8(float value)
	{
		return RawTupUtils4F.equalsAtV3EM8(this.q, value);
	}

	/** {@inheritDoc} */
	@Override
	public QuatF conjugate()
	{
		QuatUtilsF.conj(this.q, this.q);
		
		return this;
	}

	/** {@inheritDoc} */
	@Override
	public QuatF conjugateN()
	{
		return QuatUtilsF.conjFunc(this.q, CTOR);
	}

	/** {@inheritDoc} */
	@Override
	public float[] conjugateT(float[] res)
	{
		QuatUtilsF.conj(this.q, res);
		
		return res;
	}
	
	/** {@inheritDoc} */
	@Override
	public <T extends IQuatWF> T conjugateT(T res)
	{
		QuatUtilsF.conj(this.q, res);
		
		return res;
	}
	
	/** {@inheritDoc} */
	@Override
	public QuatF inverse()
	{
		QuatUtilsF.inv(this.q, this.q);
		
		return this;
	}
	
	/** {@inheritDoc} */
	@Override
	public QuatF inverseN()
	{
		return QuatUtilsF.invFunc(this.q, CTOR);
	}
	
	/** {@inheritDoc} */
	@Override
	public float[] inverseT(float[] res)
	{
		QuatUtilsF.inv(this.q, res);
		
		return res;
	}
	
	/** {@inheritDoc} */
	@Override
	public <T extends IQuatWF> T inverseT(T res)
	{
		QuatUtilsF.inv(this.q, res);
		
		return res;
	}
	
	/** {@inheritDoc} */
	@Override
	public QuatF normalize()
	{
		QuatUtilsF.nrm(this.q, this.q);
		
		return this;
	}

	/** {@inheritDoc} */
	@Override
	public QuatF normalizeN()
	{
		return QuatUtilsF.nrmFunc(this.q, CTOR);
	}

	/** {@inheritDoc} */
	@Override
	public float[] normalizeT(float[] res)
	{
		QuatUtilsF.nrm(this.q, res);
		
		return res;
	}

	/** {@inheritDoc} */
	@Override
	public <T extends IQuatWF> T normalizeT(T res)
	{
		QuatUtilsF.nrm(this.q, res);
		
		return res;
	}
	
	/** {@inheritDoc} */
	@Override
	public float length()
	{
		return QuatUtilsF.len(this.q);
	}

	/** {@inheritDoc} */
	@Override
	public float lengthSquared()
	{
		return QuatUtilsF.lenSq(this.q);
	}

	/** {@inheritDoc} */
	@Override
	public float lengthReciprocal()
	{
		return QuatUtilsF.lenRc(this.q);
	}

	/** {@inheritDoc} */
	@Override
	public float dot(ITup4RF q)
	{
		return QuatUtilsF.dot(this.q, q);
	}

	/** {@inheritDoc} */
	@Override
	public float dot(float[] q)
	{
		return QuatUtilsF.dot(this.q, q);
	}

	/** {@inheritDoc} */
	@Override
	public float dot(float x, float y, float z, float w)
	{
		return QuatUtilsF.dot(this.q, x, y, z, w);
	}

	/** {@inheritDoc} */
	@Override
	public QuatF mul(ITup4RF q)
	{
		float w_ = this.q[3] * q.v3() - this.q[0] * q.v0() - this.q[1] * q.v1() - this.q[2] * q.v2(); // w * w' - v * v'
		
		float x_ = this.q[3] * q.v0() + q.v3() * this.q[0] + this.q[1] * q.v2() - this.q[2] * q.v1(); // s * v'.x + s' * v.x + (V x V').x
		float y_ = this.q[3] * q.v1() + q.v3() * this.q[1] + this.q[2] * q.v0() - this.q[0] * q.v2(); // s * v'.y + s' * v.y + (V x V').y
		float z_ = this.q[3] * q.v2() + q.v3() * this.q[2] + this.q[0] * q.v1() - this.q[1] * q.v0(); // s * v'.z + s' * v.z + (V x V').z
		
		this.q[0] = x_;
		this.q[1] = y_;
		this.q[2] = z_;
		this.q[3] = w_;
		
		return this;
	}

	/** {@inheritDoc} */
	@Override
	public QuatF mul(float[] q)
	{
		float w_ = this.q[3] * q[3] - this.q[0] * q[0] - this.q[1] * q[1] - this.q[2] * q[2]; // w * w' - v * v'
		
		float x_ = this.q[3] * q[0] + q[3] * this.q[0] + this.q[1] * q[2] - this.q[2] * q[1]; // s * v'.x + s' * v.x + (V x V').x
		float y_ = this.q[3] * q[1] + q[3] * this.q[1] + this.q[2] * q[0] - this.q[0] * q[2]; // s * v'.y + s' * v.y + (V x V').y
		float z_ = this.q[3] * q[2] + q[3] * this.q[2] + this.q[0] * q[1] - this.q[1] * q[0]; // s * v'.z + s' * v.z + (V x V').z
		
		this.q[0] = x_;
		this.q[1] = y_;
		this.q[2] = z_;
		this.q[3] = w_;
		
		return this;
	}

	/** {@inheritDoc} */
	@Override
	public QuatF mul(float x, float y, float z, float w)
	{
		float w_ = this.q[3] * w - this.q[0] * x - this.q[1] * y - this.q[2] * z; // w * w' - v * v'
		
		float x_ = this.q[3] * x + w * this.q[0] + this.q[1] * z - this.q[2] * y; // s * v'.x + s' * v.x + (V x V').x
		float y_ = this.q[3] * y + w * this.q[1] + this.q[2] * x - this.q[0] * z; // s * v'.y + s' * v.y + (V x V').y
		float z_ = this.q[3] * z + w * this.q[2] + this.q[0] * y - this.q[1] * x; // s * v'.z + s' * v.z + (V x V').z
		
		this.q[0] = x_;
		this.q[1] = y_;
		this.q[2] = z_;
		this.q[3] = w_;
		
		return this;
	}

	/** {@inheritDoc} */
	@Override
	public QuatF mulN(ITup4RF q)
	{
		float w_ = this.q[3] * q.v3() - this.q[0] * q.v0() - this.q[1] * q.v1() - this.q[2] * q.v2(); // w * w' - v * v'
		
		float x_ = this.q[3] * q.v0() + q.v3() * this.q[0] + this.q[1] * q.v2() - this.q[2] * q.v1(); // s * v'.x + s' * v.x + (V x V').x
		float y_ = this.q[3] * q.v1() + q.v3() * this.q[1] + this.q[2] * q.v0() - this.q[0] * q.v2(); // s * v'.y + s' * v.y + (V x V').y
		float z_ = this.q[3] * q.v2() + q.v3() * this.q[2] + this.q[0] * q.v1() - this.q[1] * q.v0(); // s * v'.z + s' * v.z + (V x V').z
		
		return new QuatF(x_, y_, z_, w_);
	}

	/** {@inheritDoc} */
	@Override
	public QuatF mulN(float[] q)
	{
		float w_ = this.q[3] * q[3] - this.q[0] * q[0] - this.q[1] * q[1] - this.q[2] * q[2]; // w * w' - v * v'
		
		float x_ = this.q[3] * q[0] + q[3] * this.q[0] + this.q[1] * q[2] - this.q[2] * q[1]; // s * v'.x + s' * v.x + (V x V').x
		float y_ = this.q[3] * q[1] + q[3] * this.q[1] + this.q[2] * q[0] - this.q[0] * q[2]; // s * v'.y + s' * v.y + (V x V').y
		float z_ = this.q[3] * q[2] + q[3] * this.q[2] + this.q[0] * q[1] - this.q[1] * q[0]; // s * v'.z + s' * v.z + (V x V').z
		
		return new QuatF(x_, y_, z_, w_);
	}

	/** {@inheritDoc} */
	@Override
	public QuatF mulN(float x, float y, float z, float w)
	{
		float w_ = this.q[3] * w - this.q[0] * x - this.q[1] * y - this.q[2] * z; // w * w' - v * v'
		
		float x_ = this.q[3] * x + w * this.q[0] + this.q[1] * z - this.q[2] * y; // s * v'.x + s' * v.x + (V x V').x
		float y_ = this.q[3] * y + w * this.q[1] + this.q[2] * x - this.q[0] * z; // s * v'.y + s' * v.y + (V x V').y
		float z_ = this.q[3] * z + w * this.q[2] + this.q[0] * y - this.q[1] * x; // s * v'.z + s' * v.z + (V x V').z
		
		return new QuatF(x_, y_, z_, w_);
	}
	
	/** {@inheritDoc} */
	@Override
	public <T extends IQuatWF> T mulT(ITup4RF q, T res)
	{
		float w_ = this.q[3] * q.v3() - this.q[0] * q.v0() - this.q[1] * q.v1() - this.q[2] * q.v2(); // w * w' - v * v'
		
		float x_ = this.q[3] * q.v0() + q.v3() * this.q[0] + this.q[1] * q.v2() - this.q[2] * q.v1(); // s * v'.x + s' * v.x + (V x V').x
		float y_ = this.q[3] * q.v1() + q.v3() * this.q[1] + this.q[2] * q.v0() - this.q[0] * q.v2(); // s * v'.y + s' * v.y + (V x V').y
		float z_ = this.q[3] * q.v2() + q.v3() * this.q[2] + this.q[0] * q.v1() - this.q[1] * q.v0(); // s * v'.z + s' * v.z + (V x V').z
		
		res.set(x_, y_, z_, w_);
		
		return res;
	}

	/** {@inheritDoc} */
	@Override
	public <T extends IQuatWF> T mulT(float[] q, T res)
	{
		float w_ = this.q[3] * q[3] - this.q[0] * q[0] - this.q[1] * q[1] - this.q[2] * q[2]; // w * w' - v * v'
		
		float x_ = this.q[3] * q[0] + q[3] * this.q[0] + this.q[1] * q[2] - this.q[2] * q[1]; // s * v'.x + s' * v.x + (V x V').x
		float y_ = this.q[3] * q[1] + q[3] * this.q[1] + this.q[2] * q[0] - this.q[0] * q[2]; // s * v'.y + s' * v.y + (V x V').y
		float z_ = this.q[3] * q[2] + q[3] * this.q[2] + this.q[0] * q[1] - this.q[1] * q[0]; // s * v'.z + s' * v.z + (V x V').z
		
		res.set(x_, y_, z_, w_);
		
		return res;
	}

	/** {@inheritDoc} */
	@Override
	public <T extends IQuatWF> T mulT(float x, float y, float z, float w, T res)
	{
		float w_ = this.q[3] * w - this.q[0] * x - this.q[1] * y - this.q[2] * z; // w * w' - v * v'
		
		float x_ = this.q[3] * x + w * this.q[0] + this.q[1] * z - this.q[2] * y; // s * v'.x + s' * v.x + (V x V').x
		float y_ = this.q[3] * y + w * this.q[1] + this.q[2] * x - this.q[0] * z; // s * v'.y + s' * v.y + (V x V').y
		float z_ = this.q[3] * z + w * this.q[2] + this.q[0] * y - this.q[1] * x; // s * v'.z + s' * v.z + (V x V').z
		
		res.set(x_, y_, z_, w_);
		
		return res;
	}

	/** {@inheritDoc} */
	@Override
	public float[] mulT(ITup4RF q, float[] res)
	{
		float w_ = this.q[3] * q.v3() - this.q[0] * q.v0() - this.q[1] * q.v1() - this.q[2] * q.v2(); // w * w' - v * v'
		
		float x_ = this.q[3] * q.v0() + q.v3() * this.q[0] + this.q[1] * q.v2() - this.q[2] * q.v1(); // s * v'.x + s' * v.x + (V x V').x
		float y_ = this.q[3] * q.v1() + q.v3() * this.q[1] + this.q[2] * q.v0() - this.q[0] * q.v2(); // s * v'.y + s' * v.y + (V x V').y
		float z_ = this.q[3] * q.v2() + q.v3() * this.q[2] + this.q[0] * q.v1() - this.q[1] * q.v0(); // s * v'.z + s' * v.z + (V x V').z
		
		res[0] = x_;
		res[1] = y_;
		res[2] = z_;
		res[3] = w_;
		
		return res;
	}

	/** {@inheritDoc} */
	@Override
	public float[] mulT(float[] q, float[] res)
	{
		float w_ = this.q[3] * q[3] - this.q[0] * q[0] - this.q[1] * q[1] - this.q[2] * q[2]; // w * w' - v * v'
		
		float x_ = this.q[3] * q[0] + q[3] * this.q[0] + this.q[1] * q[2] - this.q[2] * q[1]; // s * v'.x + s' * v.x + (V x V').x
		float y_ = this.q[3] * q[1] + q[3] * this.q[1] + this.q[2] * q[0] - this.q[0] * q[2]; // s * v'.y + s' * v.y + (V x V').y
		float z_ = this.q[3] * q[2] + q[3] * this.q[2] + this.q[0] * q[1] - this.q[1] * q[0]; // s * v'.z + s' * v.z + (V x V').z
		
		res[0] = x_;
		res[1] = y_;
		res[2] = z_;
		res[3] = w_;
		
		return res;
	}

	/** {@inheritDoc} */
	@Override
	public float[] mulT(float x, float y, float z, float w, float[] res)
	{
		float w_ = this.q[3] * w - this.q[0] * x - this.q[1] * y - this.q[2] * z; // w * w' - v * v'
		
		float x_ = this.q[3] * x + w * this.q[0] + this.q[1] * z - this.q[2] * y; // s * v'.x + s' * v.x + (V x V').x
		float y_ = this.q[3] * y + w * this.q[1] + this.q[2] * x - this.q[0] * z; // s * v'.y + s' * v.y + (V x V').y
		float z_ = this.q[3] * z + w * this.q[2] + this.q[0] * y - this.q[1] * x; // s * v'.z + s' * v.z + (V x V').z
		
		res[0] = x_;
		res[1] = y_;
		res[2] = z_;
		res[3] = w_;
		
		return res;
	}

	/** {@inheritDoc} */
	@Override
	public QuatF rMul(ITup4RF q)
	{
		float w_ = q.v3() * this.q[3] - q.v0() * this.q[0] - q.v1() * this.q[1] - q.v2() * this.q[2]; // w * w' - v * v'
		
		float x_ = q.v3() * this.q[0] + this.q[3] * q.v0() + q.v1() * this.q[2] - q.v2() * this.q[1]; // s * v'.x + s' * v.x + (V x V').x
		float y_ = q.v3() * this.q[1] + this.q[3] * q.v1() + q.v2() * this.q[0] - q.v0() * this.q[2]; // s * v'.y + s' * v.y + (V x V').y
		float z_ = q.v3() * this.q[2] + this.q[3] * q.v2() + q.v0() * this.q[1] - q.v1() * this.q[0]; // s * v'.z + s' * v.z + (V x V').z
		
		this.q[0] = x_;
		this.q[1] = y_;
		this.q[2] = z_;
		this.q[3] = w_;
		
		return this;
	}

	/** {@inheritDoc} */
	@Override
	public QuatF rMul(float[] q)
	{
		float w_ = q[3] * this.q[3] - q[0] * this.q[0] - q[1] * this.q[1] - q[2] * this.q[2]; // w * w' - v * v'
		
		float x_ = q[3] * this.q[0] + this.q[3] * q[0] + q[1] * this.q[2] - q[2] * this.q[1]; // s * v'.x + s' * v.x + (V x V').x
		float y_ = q[3] * this.q[1] + this.q[3] * q[1] + q[2] * this.q[0] - q[0] * this.q[2]; // s * v'.y + s' * v.y + (V x V').y
		float z_ = q[3] * this.q[2] + this.q[3] * q[2] + q[0] * this.q[1] - q[1] * this.q[0]; // s * v'.z + s' * v.z + (V x V').z
		
		this.q[0] = x_;
		this.q[1] = y_;
		this.q[2] = z_;
		this.q[3] = w_;
		
		return this;
	}

	/** {@inheritDoc} */
	@Override
	public QuatF rMul(float x, float y, float z, float w)
	{
		float w_ = w * this.q[3] - x * this.q[0] - y * this.q[1] - z * this.q[2]; // w * w' - v * v'
		
		float x_ = w * this.q[0] + this.q[3] * x + y * this.q[2] - z * this.q[1]; // s * v'.x + s' * v.x + (V x V').x
		float y_ = w * this.q[1] + this.q[3] * y + z * this.q[0] - x * this.q[2]; // s * v'.y + s' * v.y + (V x V').y
		float z_ = w * this.q[2] + this.q[3] * z + x * this.q[1] - y * this.q[0]; // s * v'.z + s' * v.z + (V x V').z
		
		this.q[0] = x_;
		this.q[1] = y_;
		this.q[2] = z_;
		this.q[3] = w_;
		
		return this;
	}

	/** {@inheritDoc} */
	@Override
	public QuatF rMulN(ITup4RF q)
	{
		float w_ = q.v3() * this.q[3] - q.v0() * this.q[0] - q.v1() * this.q[1] - q.v2() * this.q[2]; // w * w' - v * v'
		
		float x_ = q.v3() * this.q[0] + this.q[3] * q.v0() + q.v1() * this.q[2] - q.v2() * this.q[1]; // s * v'.x + s' * v.x + (V x V').x
		float y_ = q.v3() * this.q[1] + this.q[3] * q.v1() + q.v2() * this.q[0] - q.v0() * this.q[2]; // s * v'.y + s' * v.y + (V x V').y
		float z_ = q.v3() * this.q[2] + this.q[3] * q.v2() + q.v0() * this.q[1] - q.v1() * this.q[0]; // s * v'.z + s' * v.z + (V x V').z
		
		return new QuatF(x_, y_, z_, w_);
	}

	/** {@inheritDoc} */
	@Override
	public QuatF rMulN(float[] q)
	{
		float w_ = q[3] * this.q[3] - q[0] * this.q[0] - q[1] * this.q[1] - q[2] * this.q[2]; // w * w' - v * v'
		
		float x_ = q[3] * this.q[0] + this.q[3] * q[0] + q[1] * this.q[2] - q[2] * this.q[1]; // s * v'.x + s' * v.x + (V x V').x
		float y_ = q[3] * this.q[1] + this.q[3] * q[1] + q[2] * this.q[0] - q[0] * this.q[2]; // s * v'.y + s' * v.y + (V x V').y
		float z_ = q[3] * this.q[2] + this.q[3] * q[2] + q[0] * this.q[1] - q[1] * this.q[0]; // s * v'.z + s' * v.z + (V x V').z
		
		return new QuatF(x_, y_, z_, w_);
	}

	/** {@inheritDoc} */
	@Override
	public QuatF rMulN(float x, float y, float z, float w)
	{
		float w_ = w * this.q[3] - x * this.q[0] - y * this.q[1] - z * this.q[2]; // w * w' - v * v'
		
		float x_ = w * this.q[0] + this.q[3] * x + y * this.q[2] - z * this.q[1]; // s * v'.x + s' * v.x + (V x V').x
		float y_ = w * this.q[1] + this.q[3] * y + z * this.q[0] - x * this.q[2]; // s * v'.y + s' * v.y + (V x V').y
		float z_ = w * this.q[2] + this.q[3] * z + x * this.q[1] - y * this.q[0]; // s * v'.z + s' * v.z + (V x V').z
		
		return new QuatF(x_, y_, z_, w_);
	}
	
	/** {@inheritDoc} */
	@Override
	public float[] rMulT(ITup4RF q, float[] res)
	{
		float w_ = q.v3() * this.q[3] - q.v0() * this.q[0] - q.v1() * this.q[1] - q.v2() * this.q[2]; // w * w' - v * v'
		
		float x_ = q.v3() * this.q[0] + this.q[3] * q.v0() + q.v1() * this.q[2] - q.v2() * this.q[1]; // s * v'.x + s' * v.x + (V x V').x
		float y_ = q.v3() * this.q[1] + this.q[3] * q.v1() + q.v2() * this.q[0] - q.v0() * this.q[2]; // s * v'.y + s' * v.y + (V x V').y
		float z_ = q.v3() * this.q[2] + this.q[3] * q.v2() + q.v0() * this.q[1] - q.v1() * this.q[0]; // s * v'.z + s' * v.z + (V x V').z
		
		res[0] = x_;
		res[1] = y_;
		res[2] = z_;
		res[3] = w_;
		
		return res;
	}

	/** {@inheritDoc} */
	@Override
	public float[] rMulT(float[] q, float[] res)
	{
		float w_ = q[3] * this.q[3] - q[0] * this.q[0] - q[1] * this.q[1] - q[2] * this.q[2]; // w * w' - v * v'
		
		float x_ = q[3] * this.q[0] + this.q[3] * q[0] + q[1] * this.q[2] - q[2] * this.q[1]; // s * v'.x + s' * v.x + (V x V').x
		float y_ = q[3] * this.q[1] + this.q[3] * q[1] + q[2] * this.q[0] - q[0] * this.q[2]; // s * v'.y + s' * v.y + (V x V').y
		float z_ = q[3] * this.q[2] + this.q[3] * q[2] + q[0] * this.q[1] - q[1] * this.q[0]; // s * v'.z + s' * v.z + (V x V').z
		
		res[0] = x_;
		res[1] = y_;
		res[2] = z_;
		res[3] = w_;
		
		return res;
	}

	/** {@inheritDoc} */
	@Override
	public float[] rMulT(float x, float y, float z, float w, float[] res)
	{
		float w_ = w * this.q[3] - x * this.q[0] - y * this.q[1] - z * this.q[2]; // w * w' - v * v'
		
		float x_ = w * this.q[0] + this.q[3] * x + y * this.q[2] - z * this.q[1]; // s * v'.x + s' * v.x + (V x V').x
		float y_ = w * this.q[1] + this.q[3] * y + z * this.q[0] - x * this.q[2]; // s * v'.y + s' * v.y + (V x V').y
		float z_ = w * this.q[2] + this.q[3] * z + x * this.q[1] - y * this.q[0]; // s * v'.z + s' * v.z + (V x V').z
		
		res[0] = x_;
		res[1] = y_;
		res[2] = z_;
		res[3] = w_;
		
		return res;
	}
	
	/** {@inheritDoc} */
	@Override
	public <T extends IQuatWF> T rMulT(ITup4RF q, T res)
	{
		float w_ = q.v3() * this.q[3] - q.v0() * this.q[0] - q.v1() * this.q[1] - q.v2() * this.q[2]; // w * w' - v * v'
		
		float x_ = q.v3() * this.q[0] + this.q[3] * q.v0() + q.v1() * this.q[2] - q.v2() * this.q[1]; // s * v'.x + s' * v.x + (V x V').x
		float y_ = q.v3() * this.q[1] + this.q[3] * q.v1() + q.v2() * this.q[0] - q.v0() * this.q[2]; // s * v'.y + s' * v.y + (V x V').y
		float z_ = q.v3() * this.q[2] + this.q[3] * q.v2() + q.v0() * this.q[1] - q.v1() * this.q[0]; // s * v'.z + s' * v.z + (V x V').z
		
		res.set(x_, y_, z_, w_);
		
		return res;
	}

	/** {@inheritDoc} */
	@Override
	public <T extends IQuatWF> T rMulT(float[] q, T res)
	{
		float w_ = q[3] * this.q[3] - q[0] * this.q[0] - q[1] * this.q[1] - q[2] * this.q[2]; // w * w' - v * v'
		
		float x_ = q[3] * this.q[0] + this.q[3] * q[0] + q[1] * this.q[2] - q[2] * this.q[1]; // s * v'.x + s' * v.x + (V x V').x
		float y_ = q[3] * this.q[1] + this.q[3] * q[1] + q[2] * this.q[0] - q[0] * this.q[2]; // s * v'.y + s' * v.y + (V x V').y
		float z_ = q[3] * this.q[2] + this.q[3] * q[2] + q[0] * this.q[1] - q[1] * this.q[0]; // s * v'.z + s' * v.z + (V x V').z
		
		res.set(x_, y_, z_, w_);
		
		return res;
	}

	/** {@inheritDoc} */
	@Override
	public <T extends IQuatWF> T rMulT(float x, float y, float z, float w, T res)
	{
		float w_ = w * this.q[3] - x * this.q[0] - y * this.q[1] - z * this.q[2]; // w * w' - v * v'
		
		float x_ = w * this.q[0] + this.q[3] * x + y * this.q[2] - z * this.q[1]; // s * v'.x + s' * v.x + (V x V').x
		float y_ = w * this.q[1] + this.q[3] * y + z * this.q[0] - x * this.q[2]; // s * v'.y + s' * v.y + (V x V').y
		float z_ = w * this.q[2] + this.q[3] * z + x * this.q[1] - y * this.q[0]; // s * v'.z + s' * v.z + (V x V').z
		
		res.set(x_, y_, z_, w_);
		
		return res;
	}

	
	/** {@inheritDoc} */
	@Override
	public float[] transformT(ITup3RF v, float[] res)
	{
		float tx = 2.0f * (this.q[1] * v.v2() - this.q[2] * v.v1());
		float ty = 2.0f * (this.q[2] * v.v0() - this.q[0] * v.v2());
		float tz = 2.0f * (this.q[0] * v.v1() - this.q[1] * v.v0());
		
		float rv0 = v.v0() + this.q[3] * tx + (this.q[1] * tz - this.q[2] * ty);
		float rv1 = v.v1() + this.q[3] * ty + (this.q[2] * tx - this.q[0] * tz);
		float rv2 = v.v2() + this.q[3] * tz + (this.q[0] * ty - this.q[1] * tx);
		
		res[0] = rv0;
		res[1] = rv1;
		res[2] = rv2;
		
		return res;
	}

	/** {@inheritDoc} */
	@Override
	public float[] transformT(float[] v, float[] res)
	{
		float tx = 2.0f * (this.q[1] * v[2] - this.q[2] * v[1]);
		float ty = 2.0f * (this.q[2] * v[0] - this.q[0] * v[2]);
		float tz = 2.0f * (this.q[0] * v[1] - this.q[1] * v[0]);
		
		float rv0 = v[0] + this.q[3] * tx + (this.q[1] * tz - this.q[2] * ty);
		float rv1 = v[1] + this.q[3] * ty + (this.q[2] * tx - this.q[0] * tz);
		float rv2 = v[2] + this.q[3] * tz + (this.q[0] * ty - this.q[1] * tx);
		
		res[0] = rv0;
		res[1] = rv1;
		res[2] = rv2;
		
		return res;
	}

	/** {@inheritDoc} */
	@Override
	public float[] transformT(float v0, float v1, float v2, float[] res)
	{
		float tx = 2.0f * (this.q[1] * v2 - this.q[2] * v1);
		float ty = 2.0f * (this.q[2] * v0 - this.q[0] * v2);
		float tz = 2.0f * (this.q[0] * v1 - this.q[1] * v0);
		
		float rv0 = v0 + this.q[3] * tx + (this.q[1] * tz - this.q[2] * ty);
		float rv1 = v1 + this.q[3] * ty + (this.q[2] * tx - this.q[0] * tz);
		float rv2 = v2 + this.q[3] * tz + (this.q[0] * ty - this.q[1] * tx);
		
		res[0] = rv0;
		res[1] = rv1;
		res[2] = rv2;
		
		return res;
	}

	/** {@inheritDoc} */
	@Override
	public <T extends ITup3WF> T transformT(ITup3RF v, T res)
	{
		float tx = 2.0f * (this.q[1] * v.v2() - this.q[2] * v.v1());
		float ty = 2.0f * (this.q[2] * v.v0() - this.q[0] * v.v2());
		float tz = 2.0f * (this.q[0] * v.v1() - this.q[1] * v.v0());
		
		float rv0 = v.v0() + this.q[3] * tx + (this.q[1] * tz - this.q[2] * ty);
		float rv1 = v.v1() + this.q[3] * ty + (this.q[2] * tx - this.q[0] * tz);
		float rv2 = v.v2() + this.q[3] * tz + (this.q[0] * ty - this.q[1] * tx);
		
		res.set(rv0, rv1, rv2);
		
		return res;
	}

	/** {@inheritDoc} */
	@Override
	public <T extends ITup3WF> T transformT(float[] v, T res)
	{
		float tx = 2.0f * (this.q[1] * v[2] - this.q[2] * v[1]);
		float ty = 2.0f * (this.q[2] * v[0] - this.q[0] * v[2]);
		float tz = 2.0f * (this.q[0] * v[1] - this.q[1] * v[0]);
		
		float rv0 = v[0] + this.q[3] * tx + (this.q[1] * tz - this.q[2] * ty);
		float rv1 = v[1] + this.q[3] * ty + (this.q[2] * tx - this.q[0] * tz);
		float rv2 = v[2] + this.q[3] * tz + (this.q[0] * ty - this.q[1] * tx);
		
		res.set(rv0, rv1, rv2);
		
		return res;
	}

	/** {@inheritDoc} */
	@Override
	public <T extends ITup3WF> T transformT(float v0, float v1, float v2, T res)
	{
		float tx = 2.0f * (this.q[1] * v2 - this.q[2] * v1);
		float ty = 2.0f * (this.q[2] * v0 - this.q[0] * v2);
		float tz = 2.0f * (this.q[0] * v1 - this.q[1] * v0);
		
		float rv0 = v0 + this.q[3] * tx + (this.q[1] * tz - this.q[2] * ty);
		float rv1 = v1 + this.q[3] * ty + (this.q[2] * tx - this.q[0] * tz);
		float rv2 = v2 + this.q[3] * tz + (this.q[0] * ty - this.q[1] * tx);
		
		res.set(rv0, rv1, rv2);
		
		return res;
	}
}
