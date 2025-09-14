package org.barghos.impl.math.quaternion;

import java.util.Arrays;
import java.util.Objects;

import org.barghos.api.core.function.floats.IFunc4F;
import org.barghos.api.core.math.MathUtils;
import org.barghos.api.core.tuple.floats.ITup4RF;
import org.barghos.api.core.tuple.floats.ITupRF;
import org.barghos.api.core.tuple.floats.TupUtils4F;

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
	
	@Override
	public QuatF x(float x)
	{
		this.q[0] = x;
		
		return this;
	}

	@Override
	public QuatF y(float y)
	{
		this.q[1] = y;
		
		return this;
	}

	@Override
	public QuatF z(float z)
	{
		this.q[2] = z;
		
		return this;
	}

	@Override
	public QuatF w(float w)
	{
		this.q[3] = w;
		
		return this;
	}

	@Override
	public QuatF v0(float v0)
	{
		this.q[0] = v0;
		
		return this;
	}

	@Override
	public QuatF v1(float v1)
	{
		this.q[1] = v1;
		
		return this;
	}

	@Override
	public QuatF v2(float v2)
	{
		this.q[2] = v2;
		
		return this;
	}

	@Override
	public QuatF v3(float v3)
	{
		this.q[3] = v3;
		
		return this;
	}

	@Override
	public QuatF set(ITup4RF t)
	{
		t.toArray(this.q);
		
		return this;
	}

	@Override
	public QuatF set(ITupRF t)
	{
		t.toArray(this.q);
		
		return this;
	}

	@Override
	public QuatF set(float[] values)
	{
		System.arraycopy(values, 0, this.q, 0, 4);
		
		return this;
	}

	@Override
	public QuatF set(float x, float y, float z, float w)
	{
		this.q[0] = x;
		this.q[1] = y;
		this.q[2] = z;
		this.q[3] = w;
		
		return this;
	}

	@Override
	public QuatF setAt(int index, float value)
	{
		this.q[index] = value;
		
		return this;
	}
	
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
	
	@Override
	public float[] toArray()
	{
		return Arrays.copyOf(this.q, 4);
	}

	@Override
	public float[] toArray(float[] res)
	{
		System.arraycopy(this.q, 0, res, 0, 4);
		
		return res;
	}

	@Override
	public String toString()
	{
		return "quatf(x=" + this.q[0] + ", y=" + this.q[1] + ", z=" + this.q[2] + "; w=" + this.q[3] + ")";
	}
	
	@Override
	public int hashCode()
	{
		return Objects.hash(this.q);
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
	public boolean isFiniteAt(int index)
	{
		return TupUtils4F.isFiniteAt(index, this.q);
	}

	@Override
	public boolean isFiniteAtV0()
	{
		return TupUtils4F.isFiniteAtV0(this.q);
	}

	@Override
	public boolean isFiniteAtV1()
	{
		return TupUtils4F.isFiniteAtV1(this.q);
	}

	@Override
	public boolean isFiniteAtV2()
	{
		return TupUtils4F.isFiniteAtV2(this.q);
	}

	@Override
	public boolean isFiniteAtV3()
	{
		return TupUtils4F.isFiniteAtV3(this.q);
	}

	@Override
	public boolean isZeroAt(int index)
	{
		return TupUtils4F.isZeroAt(index, this.q);
	}

	@Override
	public boolean isZeroAt(float tolerance, int index)
	{
		return TupUtils4F.isZeroAt(tolerance, index, this.q);
	}

	@Override
	public boolean isZeroAtV0()
	{
		return TupUtils4F.isZeroAtV0(this.q);
	}

	@Override
	public boolean isZeroAtV1()
	{
		return TupUtils4F.isZeroAtV1(this.q);
	}

	@Override
	public boolean isZeroAtV2()
	{
		return TupUtils4F.isZeroAtV2(this.q);
	}

	@Override
	public boolean isZeroAtV3()
	{
		return TupUtils4F.isZeroAtV3(this.q);
	}

	@Override
	public boolean isZeroAtV0(float tolerance)
	{
		return TupUtils4F.isZeroAtV0(tolerance, this.q);
	}

	@Override
	public boolean isZeroAtV1(float tolerance)
	{
		return TupUtils4F.isZeroAtV1(tolerance, this.q);
	}

	@Override
	public boolean isZeroAtV2(float tolerance)
	{
		return TupUtils4F.isZeroAtV2(tolerance, this.q);
	}

	@Override
	public boolean isZeroAtV3(float tolerance)
	{
		return TupUtils4F.isZeroAtV3(tolerance, this.q);
	}

	@Override
	public boolean equals(ITup4RF t)
	{
		return TupUtils4F.equals(this.q, t);
	}

	@Override
	public boolean equals(ITupRF t)
	{
		return TupUtils4F.equals(this.q, t);
	}

	@Override
	public boolean equals(float[] t)
	{
		return TupUtils4F.equals(this.q, t);
	}

	@Override
	public boolean equals(float v0, float v1, float v2, float v3)
	{
		return TupUtils4F.equals(this.q, v0, v1, v2, v3);
	}

	@Override
	public boolean equals(float tolerance, ITup4RF t)
	{
		return TupUtils4F.equals(tolerance, this.q, t);
	}

	@Override
	public boolean equals(float tolerance, ITupRF t)
	{
		return TupUtils4F.equals(tolerance, this.q, t);
	}

	@Override
	public boolean equals(float tolerance, float[] t)
	{
		return TupUtils4F.equals(tolerance, this.q, t);
	}

	@Override
	public boolean equals(float tolerance, float v0, float v1, float v2, float v3)
	{
		return TupUtils4F.equals(tolerance, this.q, v0, v1, v2, v3);
	}

	@Override
	public boolean equalsAt(int index, ITup4RF t)
	{
		return TupUtils4F.equalsAt(index, this.q, t);
	}

	@Override
	public boolean equalsAt(int index, ITupRF t)
	{
		return TupUtils4F.equalsAt(index, this.q, t);
	}

	@Override
	public boolean equalsAt(int index, float[] t)
	{
		return TupUtils4F.equalsAt(index, this.q, t);
	}

	@Override
	public boolean equalsAt(int index, float value)
	{
		return TupUtils4F.equalsAt(index, this.q, value);
	}

	@Override
	public boolean equalsAt(float tolerance, int index, ITup4RF t)
	{
		return TupUtils4F.equalsAt(tolerance, index, this.q, t);
	}

	@Override
	public boolean equalsAt(float tolerance, int index, ITupRF t)
	{
		return TupUtils4F.equalsAt(tolerance, index, this.q, t);
	}

	@Override
	public boolean equalsAt(float tolerance, int index, float[] t)
	{
		return TupUtils4F.equalsAt(tolerance, index, this.q, t);
	}

	@Override
	public boolean equalsAt(float tolerance, int index, float value)
	{
		return TupUtils4F.equalsAt(tolerance, index, this.q, value);
	}

	@Override
	public boolean equalsAtV0(ITup4RF t)
	{
		return TupUtils4F.equalsAtV0(this.q, t);
	}

	@Override
	public boolean equalsAtV0(ITupRF t)
	{
		return TupUtils4F.equalsAtV0(this.q, t);
	}

	@Override
	public boolean equalsAtV0(float[] t)
	{
		return TupUtils4F.equalsAtV0(this.q, t);
	}

	@Override
	public boolean equalsAtV0(float value)
	{
		return TupUtils4F.equalsAtV0(this.q, value);
	}

	@Override
	public boolean equalsAtV1(ITup4RF t)
	{
		return TupUtils4F.equalsAtV1(this.q, t);
	}

	@Override
	public boolean equalsAtV1(ITupRF t)
	{
		return TupUtils4F.equalsAtV1(this.q, t);
	}

	@Override
	public boolean equalsAtV1(float[] t)
	{
		return TupUtils4F.equalsAtV1(this.q, t);
	}

	@Override
	public boolean equalsAtV1(float value)
	{
		return TupUtils4F.equalsAtV1(this.q, value);
	}

	@Override
	public boolean equalsAtV2(ITup4RF t)
	{
		return TupUtils4F.equalsAtV2(this.q, t);
	}

	@Override
	public boolean equalsAtV2(ITupRF t)
	{
		return TupUtils4F.equalsAtV2(this.q, t);
	}

	@Override
	public boolean equalsAtV2(float[] t)
	{
		return TupUtils4F.equalsAtV2(this.q, t);
	}

	@Override
	public boolean equalsAtV2(float value)
	{
		return TupUtils4F.equalsAtV2(this.q, value);
	}

	@Override
	public boolean equalsAtV3(ITup4RF t)
	{
		return TupUtils4F.equalsAtV3(this.q, t);
	}

	@Override
	public boolean equalsAtV3(ITupRF t)
	{
		return TupUtils4F.equalsAtV3(this.q, t);
	}

	@Override
	public boolean equalsAtV3(float[] t)
	{
		return TupUtils4F.equalsAtV3(this.q, t);
	}

	@Override
	public boolean equalsAtV3(float value)
	{
		return TupUtils4F.equalsAtV3(this.q, value);
	}

	@Override
	public boolean equalsAtV0(float tolerance, ITup4RF t)
	{
		return TupUtils4F.equalsAtV0(tolerance, this.q, t);
	}

	@Override
	public boolean equalsAtV0(float tolerance, ITupRF t)
	{
		return TupUtils4F.equalsAtV0(tolerance, this.q, t);
	}

	@Override
	public boolean equalsAtV0(float tolerance, float[] t)
	{
		return TupUtils4F.equalsAtV0(tolerance, this.q, t);
	}

	@Override
	public boolean equalsAtV0(float tolerance, float value)
	{
		return TupUtils4F.equalsAtV0(tolerance, this.q, value);
	}

	@Override
	public boolean equalsAtV1(float tolerance, ITup4RF t)
	{
		return TupUtils4F.equalsAtV1(tolerance, this.q, t);
	}

	@Override
	public boolean equalsAtV1(float tolerance, ITupRF t)
	{
		return TupUtils4F.equalsAtV1(tolerance, this.q, t);
	}

	@Override
	public boolean equalsAtV1(float tolerance, float[] t)
	{
		return TupUtils4F.equalsAtV1(tolerance, this.q, t);
	}

	@Override
	public boolean equalsAtV1(float tolerance, float value)
	{
		return TupUtils4F.equalsAtV1(tolerance, this.q, value);
	}

	@Override
	public boolean equalsAtV2(float tolerance, ITup4RF t)
	{
		return TupUtils4F.equalsAtV2(tolerance, this.q, t);
	}

	@Override
	public boolean equalsAtV2(float tolerance, ITupRF t)
	{
		return TupUtils4F.equalsAtV2(tolerance, this.q, t);
	}

	@Override
	public boolean equalsAtV2(float tolerance, float[] t)
	{
		return TupUtils4F.equalsAtV2(tolerance, this.q, t);
	}

	@Override
	public boolean equalsAtV2(float tolerance, float value)
	{
		return TupUtils4F.equalsAtV2(tolerance, this.q, value);
	}

	@Override
	public boolean equalsAtV3(float tolerance, ITup4RF t)
	{
		return TupUtils4F.equalsAtV3(tolerance, this.q, t);
	}

	@Override
	public boolean equalsAtV3(float tolerance, ITupRF t)
	{
		return TupUtils4F.equalsAtV3(tolerance, this.q, t);
	}

	@Override
	public boolean equalsAtV3(float tolerance, float[] t)
	{
		return TupUtils4F.equalsAtV3(tolerance, this.q, t);
	}

	@Override
	public boolean equalsAtV3(float tolerance, float value)
	{
		return TupUtils4F.equalsAtV3(tolerance, this.q, value);
	}
	
	@Override
	public boolean isFinite()
	{
		return TupUtils4F.isFinite(this.q);
	}

	@Override
	public boolean isZero()
	{
		return TupUtils4F.isZero(this.q);
	}

	@Override
	public boolean isZero(float tolerance)
	{
		return TupUtils4F.isZero(tolerance, this.q);
	}

	@Override
	public QuatF conj()
	{
		QuatUtilsF.conj(this.q, this.q);
		
		return this;
	}

	@Override
	public QuatF conjN()
	{
		return QuatUtilsF.conjFunc(this.q, CTOR);
	}

	@Override
	public float[] conjT(float[] res)
	{
		QuatUtilsF.conj(this.q, res);
		
		return res;
	}
	
	@Override
	public <T extends IQuatWF> T conjT(T res)
	{
		QuatUtilsF.conj(this.q, res);
		
		return res;
	}
	
	@Override
	public QuatF inv()
	{
		QuatUtilsF.inv(this.q, this.q);
		
		return this;
	}
	
	@Override
	public QuatF invN()
	{
		return QuatUtilsF.invFunc(this.q, CTOR);
	}
	
	@Override
	public float[] invT(float[] res)
	{
		QuatUtilsF.inv(this.q, res);
		
		return res;
	}
	
	@Override
	public <T extends IQuatWF> T invT(T res)
	{
		QuatUtilsF.inv(this.q, res);
		
		return res;
	}
	
	@Override
	public QuatF nrm()
	{
		QuatUtilsF.nrm(this.q, this.q);
		
		return this;
	}

	@Override
	public QuatF nrmN()
	{
		return QuatUtilsF.nrmFunc(this.q, CTOR);
	}

	@Override
	public float[] nrmT(float[] res)
	{
		QuatUtilsF.nrm(this.q, res);
		
		return res;
	}

	@Override
	public <T extends IQuatWF> T nrmT(T res)
	{
		QuatUtilsF.nrm(this.q, res);
		
		return res;
	}
	
	@Override
	public float len()
	{
		return QuatUtilsF.len(this.q);
	}

	@Override
	public float lenSq()
	{
		return QuatUtilsF.lenSq(this.q);
	}

	@Override
	public float lenRc()
	{
		return QuatUtilsF.lenRc(this.q);
	}

	@Override
	public float dot(ITup4RF q)
	{
		return QuatUtilsF.dot(this.q, q);
	}

	@Override
	public float dot(float[] q)
	{
		return QuatUtilsF.dot(this.q, q);
	}

	@Override
	public float dot(float x, float y, float z, float w)
	{
		return QuatUtilsF.dot(this.q, x, y, z, w);
	}
}
