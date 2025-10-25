package org.barghos.impl.math.vector;

import java.util.Arrays;
import java.util.Objects;

import org.barghos.api.core.function.floats.IFunc3F;
import org.barghos.api.core.tuple.floats.ITup3RF;
import org.barghos.api.core.tuple.floats.ITup3WF;
import org.barghos.api.core.tuple.floats.ITupRF;
import org.barghos.api.math.vector.IVec3WF;
import org.barghos.api.math.vector.RawVecUtils3F;
import org.barghos.api.math.vector.VecUtils3F;

public class Vec3F implements IVec3WF
{
	public static final IFunc3F<Vec3F> CTOR = Vec3F::new;
	
	private final float[] v = new float[SIZE];
	
	public Vec3F()
	{
		set(0.0f, 0.0f, 0.0f);
	}
	
	public Vec3F(ITup3RF v)
	{
		set(v);
	}
	
	public Vec3F(ITupRF v)
	{
		set(v);
	}
	
	public Vec3F(float[] v)
	{
		set(v);
	}
	
	public Vec3F(float x, float y, float z)
	{
		set(x, y, z);
	}

	/** {@inheritDoc} */
	@Override
	public float x()
	{
		return this.v[0];
	}

	/** {@inheritDoc} */
	@Override
	public float y()
	{
		return this.v[1];
	}

	/** {@inheritDoc} */
	@Override
	public float z()
	{
		return this.v[2];
	}
	
	/** {@inheritDoc} */
	@Override
	public float v0()
	{
		return this.v[0];
	}

	/** {@inheritDoc} */
	@Override
	public float v1()
	{
		return this.v[1];
	}
	
	/** {@inheritDoc} */
	@Override
	public float v2()
	{
		return this.v[2];
	}
	
	/** {@inheritDoc} */
	@Override
	public float at(int index)
	{
		return this.v[index];
	}
	
	/** {@inheritDoc} */
	@Override
	public Vec3F x(float x)
	{
		this.v[0] = x;
		
		return this;
	}

	/** {@inheritDoc} */
	@Override
	public Vec3F y(float y)
	{
		this.v[1] = y;
		
		return this;
	}
	
	/** {@inheritDoc} */
	@Override
	public Vec3F z(float z)
	{
		this.v[2] = z;
		
		return this;
	}
	
	/** {@inheritDoc} */
	@Override
	public ITup3WF v0(float v0)
	{
		this.v[0] = v0;
		
		return this;
	}

	/** {@inheritDoc} */
	@Override
	public ITup3WF v1(float v1)
	{
		this.v[1] = v1;
		
		return this;
	}

	/** {@inheritDoc} */
	@Override
	public ITup3WF v2(float v2)
	{
		this.v[2] = v2;
		
		return this;
	}
	
	/** {@inheritDoc} */
	@Override
	public Vec3F set(ITup3RF v)
	{
		v.toArray(this.v);
		
		return this;
	}

	/** {@inheritDoc} */
	@Override
	public Vec3F set(ITupRF v)
	{
		v.toArray(this.v);
		
		return this;
	}

	/** {@inheritDoc} */
	@Override
	public Vec3F set(float[] v)
	{
		System.arraycopy(v, 0, this.v, 0, 3);
		
		return this;
	}

	/** {@inheritDoc} */
	@Override
	public Vec3F set(float x, float y, float z)
	{
		this.v[0] = x;
		this.v[1] = y;
		this.v[2] = z;
		
		return this;
	}

	/** {@inheritDoc} */
	@Override
	public Vec3F at(int index, float value)
	{
		this.v[index] = value;
		
		return this;
	}

	/** {@inheritDoc} */
	@Override
	public float[] toArray()
	{
		return Arrays.copyOf(this.v, 3);
	}

	/** {@inheritDoc} */
	@Override
	public float[] toArray(float[] res)
	{
		System.arraycopy(this.v, 0, res, 0, 3);
		
		return res;
	}
	
	/** {@inheritDoc} */
	@Override
	public String toString()
	{
		return "vec3f(x=" + this.v[0] + ", y=" + this.v[1] + ", z=" + this.v[2] + ")";
	}
	
	/** {@inheritDoc} */
	@Override
	public int hashCode()
	{
		return Objects.hash(this.v);
	}
	
	/** {@inheritDoc} */
	@Override
	public boolean equals(Object obj)
	{
		if(obj == null) return false;
		if(obj == this) return true;
		
		if(obj instanceof ITup3RF v)
		{
			return equals(v);
		}
		
		return false;
	}
	
	/** {@inheritDoc} */
	@Override
	public Vec3F add(ITup3RF v)
	{
		VecUtils3F.add(this.v, v, this.v);
		
		return this;
	}

	/** {@inheritDoc} */
	@Override
	public Vec3F add(ITupRF v)
	{
		VecUtils3F.add(this.v, v, this.v);
		
		return this;
	}
	
	/** {@inheritDoc} */
	@Override
	public Vec3F add(float[] v)
	{
		RawVecUtils3F.add(this.v, v, this.v);
		
		return this;
	}

	/** {@inheritDoc} */
	@Override
	public Vec3F add(float value)
	{
		RawVecUtils3F.add(this.v, value, value, value, this.v);
		
		return this;
	}

	/** {@inheritDoc} */
	@Override
	public Vec3F add(float x, float y, float z)
	{
		RawVecUtils3F.add(this.v, x, y, z, this.v);
		
		return this;
	}
	
	/** {@inheritDoc} */
	@Override
	public Vec3F addN(ITup3RF v)
	{
		return VecUtils3F.addFunc(this.v, v, CTOR);
	}

	/** {@inheritDoc} */
	@Override
	public Vec3F addN(ITupRF v)
	{
		return VecUtils3F.addFunc(this.v, v, CTOR);
	}
	
	/** {@inheritDoc} */
	@Override
	public Vec3F addN(float[] v)
	{
		return VecUtils3F.addFunc(this.v, v, CTOR);
	}

	/** {@inheritDoc} */
	@Override
	public Vec3F addN(float value)
	{
		return VecUtils3F.addFunc(this.v, value, value, value, CTOR);
	}

	/** {@inheritDoc} */
	@Override
	public Vec3F addN(float x, float y, float z)
	{
		return VecUtils3F.addFunc(this.v, x, y, z, CTOR);
	}
	
	/** {@inheritDoc} */
	@Override
	public Vec3F sub(ITup3RF v)
	{
		VecUtils3F.sub(this.v, v, this.v);
		
		return this;
	}

	/** {@inheritDoc} */
	@Override
	public Vec3F sub(ITupRF v)
	{
		VecUtils3F.sub(this.v, v, this.v);
		
		return this;
	}
	
	/** {@inheritDoc} */
	@Override
	public Vec3F sub(float[] v)
	{
		RawVecUtils3F.sub(this.v, v, this.v);
		
		return this;
	}

	/** {@inheritDoc} */
	@Override
	public Vec3F sub(float value)
	{
		RawVecUtils3F.sub(this.v, value, value, value, this.v);
		
		return this;
	}

	/** {@inheritDoc} */
	@Override
	public Vec3F sub(float x, float y, float z)
	{
		RawVecUtils3F.sub(this.v, x, y, z, this.v);
		
		return this;
	}
	
	/** {@inheritDoc} */
	@Override
	public Vec3F subN(ITup3RF v)
	{
		return VecUtils3F.subFunc(this.v, v, CTOR);
	}

	/** {@inheritDoc} */
	@Override
	public Vec3F subN(ITupRF v)
	{
		return VecUtils3F.subFunc(this.v, v, CTOR);
	}
	
	/** {@inheritDoc} */
	@Override
	public Vec3F subN(float[] v)
	{
		return VecUtils3F.subFunc(this.v, v, CTOR);
	}

	/** {@inheritDoc} */
	@Override
	public Vec3F subN(float value)
	{
		return VecUtils3F.subFunc(this.v, value, value, value, CTOR);
	}

	/** {@inheritDoc} */
	@Override
	public Vec3F subN(float x, float y, float z)
	{
		return VecUtils3F.subFunc(this.v, x, y, z, CTOR);
	}
	
	/** {@inheritDoc} */
	@Override
	public Vec3F revSub(ITup3RF v)
	{
		VecUtils3F.sub(v, this.v, this.v);
		
		return this;
	}

	/** {@inheritDoc} */
	@Override
	public Vec3F revSub(ITupRF v)
	{
		VecUtils3F.sub(v, this.v, this.v);
		
		return this;
	}
	
	/** {@inheritDoc} */
	@Override
	public Vec3F revSub(float[] v)
	{
		RawVecUtils3F.sub(v, this.v, this.v);
		
		return this;
	}

	/** {@inheritDoc} */
	@Override
	public Vec3F revSub(float value)
	{
		RawVecUtils3F.sub(value, value, value, this.v, this.v);
		
		return this;
	}

	/** {@inheritDoc} */
	@Override
	public Vec3F revSub(float x, float y, float z)
	{
		RawVecUtils3F.sub(x, y, z, this.v, this.v);
		
		return this;
	}
	
	/** {@inheritDoc} */
	@Override
	public Vec3F revSubN(ITup3RF v)
	{
		return VecUtils3F.subFunc(v, this.v, CTOR);
	}

	/** {@inheritDoc} */
	@Override
	public Vec3F revSubN(ITupRF v)
	{
		return VecUtils3F.subFunc(v, this.v, CTOR);
	}
	
	/** {@inheritDoc} */
	@Override
	public Vec3F revSubN(float[] v)
	{
		return VecUtils3F.subFunc(v, this.v, CTOR);
	}

	/** {@inheritDoc} */
	@Override
	public Vec3F revSubN(float value)
	{
		return VecUtils3F.subFunc(value, value, value, this.v, CTOR);
	}

	/** {@inheritDoc} */
	@Override
	public Vec3F revSubN(float x, float y, float z)
	{
		return VecUtils3F.subFunc(x, y, z, this.v, CTOR);
	}
	
	/** {@inheritDoc} */
	@Override
	public Vec3F mul(ITup3RF v)
	{
		VecUtils3F.mul(this.v, v, this.v);
		
		return this;
	}

	/** {@inheritDoc} */
	@Override
	public Vec3F mul(ITupRF v)
	{
		VecUtils3F.mul(this.v, v, this.v);
		
		return this;
	}
	
	/** {@inheritDoc} */
	@Override
	public Vec3F mul(float[] v)
	{
		RawVecUtils3F.mul(this.v, v, this.v);
		
		return this;
	}

	/** {@inheritDoc} */
	@Override
	public Vec3F mul(float value)
	{
		RawVecUtils3F.mul(this.v, value, value, value, this.v);
		
		return this;
	}

	/** {@inheritDoc} */
	@Override
	public Vec3F mul(float x, float y, float z)
	{
		RawVecUtils3F.mul(this.v, x, y, z, this.v);
		
		return this;
	}
	
	/** {@inheritDoc} */
	@Override
	public Vec3F mulN(ITup3RF v)
	{
		return VecUtils3F.mulFunc(this.v, v, CTOR);
	}

	/** {@inheritDoc} */
	@Override
	public Vec3F mulN(ITupRF v)
	{
		return VecUtils3F.mulFunc(this.v, v, CTOR);
	}
	
	/** {@inheritDoc} */
	@Override
	public Vec3F mulN(float[] v)
	{
		return VecUtils3F.mulFunc(this.v, v, CTOR);
	}

	/** {@inheritDoc} */
	@Override
	public Vec3F mulN(float value)
	{
		return VecUtils3F.mulFunc(this.v, value, value, value, CTOR);
	}

	/** {@inheritDoc} */
	@Override
	public Vec3F mulN(float x, float y, float z)
	{
		return VecUtils3F.mulFunc(this.v, x, y, z, CTOR);
	}
	
	/** {@inheritDoc} */
	@Override
	public Vec3F div(ITup3RF v)
	{
		VecUtils3F.div(this.v, v, this.v);
		
		return this;
	}


	/** {@inheritDoc} */
	@Override
	public Vec3F div(ITupRF v)
	{
		VecUtils3F.div(this.v, v, this.v);
		
		return this;
	}
	
	/** {@inheritDoc} */
	@Override
	public Vec3F div(float[] v)
	{
		RawVecUtils3F.div(this.v, v, this.v);
		
		return this;
	}

	/** {@inheritDoc} */
	@Override
	public Vec3F div(float value)
	{
		RawVecUtils3F.div(this.v, value, value, value, this.v);
		
		return this;
	}

	/** {@inheritDoc} */
	@Override
	public Vec3F div(float x, float y, float z)
	{
		RawVecUtils3F.div(this.v, x, y, z, this.v);
		
		return this;
	}
	
	/** {@inheritDoc} */
	@Override
	public Vec3F divN(ITup3RF v)
	{
		return VecUtils3F.divFunc(this.v, v, CTOR);
	}

	/** {@inheritDoc} */
	@Override
	public Vec3F divN(ITupRF v)
	{
		return VecUtils3F.divFunc(this.v, v, CTOR);
	}
	
	/** {@inheritDoc} */
	@Override
	public Vec3F divN(float[] v)
	{
		return VecUtils3F.divFunc(this.v, v, CTOR);
	}

	/** {@inheritDoc} */
	@Override
	public Vec3F divN(float value)
	{
		return VecUtils3F.divFunc(this.v, value, value, value, CTOR);
	}

	/** {@inheritDoc} */
	@Override
	public Vec3F divN(float x, float y, float z)
	{
		return VecUtils3F.divFunc(this.v, x, y, z, CTOR);
	}
	
	/** {@inheritDoc} */
	@Override
	public Vec3F revDiv(ITup3RF v)
	{
		VecUtils3F.div(v, this.v, this.v);
		
		return this;
	}

	/** {@inheritDoc} */
	@Override
	public Vec3F revDiv(ITupRF v)
	{
		VecUtils3F.div(v, this.v, this.v);
		
		return this;
	}
	
	/** {@inheritDoc} */
	@Override
	public Vec3F revDiv(float[] v)
	{
		RawVecUtils3F.div(v, this.v, this.v);
		
		return this;
	}

	/** {@inheritDoc} */
	@Override
	public Vec3F revDiv(float value)
	{
		RawVecUtils3F.div(value, value, value, this.v, this.v);
		
		return this;
	}

	/** {@inheritDoc} */
	@Override
	public Vec3F revDiv(float x, float y, float z)
	{
		RawVecUtils3F.div(x, y, z, this.v, this.v);
		
		return this;
	}
	
	/** {@inheritDoc} */
	@Override
	public Vec3F revDivN(ITup3RF v)
	{
		return VecUtils3F.divFunc(v, this.v, CTOR);
	}

	/** {@inheritDoc} */
	@Override
	public Vec3F revDivN(ITupRF v)
	{
		return VecUtils3F.divFunc(v, this.v, CTOR);
	}
	
	/** {@inheritDoc} */
	@Override
	public Vec3F revDivN(float[] v)
	{
		return VecUtils3F.divFunc(v, this.v, CTOR);
	}

	/** {@inheritDoc} */
	@Override
	public Vec3F revDivN(float value)
	{
		return VecUtils3F.divFunc(value, value, value, this.v, CTOR);
	}

	/** {@inheritDoc} */
	@Override
	public Vec3F revDivN(float x, float y, float z)
	{
		return VecUtils3F.divFunc(x, y, z, this.v, CTOR);
	}
	
	/** {@inheritDoc} */
	@Override
	public float length()
	{
		return RawVecUtils3F.len(this.v);
	}
	
	/** {@inheritDoc} */
	@Override
	public float length(ITup3RF v)
	{
		return VecUtils3F.lenTo(this.v, v);
	}

	/** {@inheritDoc} */
	@Override
	public float length(ITupRF v)
	{
		return VecUtils3F.lenTo(this.v, v);
	}
	
	/** {@inheritDoc} */
	@Override
	public float length(float[] v)
	{
		return RawVecUtils3F.lenTo(this.v, v);
	}
	
	/** {@inheritDoc} */
	@Override
	public float length(float x, float y, float z)
	{
		return RawVecUtils3F.lenTo(this.v, x, y, z);
	}
	
	/** {@inheritDoc} */
	@Override
	public float reciprocalLength()
	{
		return RawVecUtils3F.lenRc(this.v);
	}
	
	/** {@inheritDoc} */
	@Override
	public float reciprocalLength(ITup3RF v)
	{
		return VecUtils3F.lenRcTo(this.v, v);
	}

	/** {@inheritDoc} */
	@Override
	public float reciprocalLength(ITupRF v)
	{
		return VecUtils3F.lenRcTo(this.v, v);
	}
	
	/** {@inheritDoc} */
	@Override
	public float reciprocalLength(float[] v)
	{
		return RawVecUtils3F.lenRcTo(this.v, v);
	}

	/** {@inheritDoc} */
	@Override
	public float reciprocalLength(float x, float y, float z)
	{
		return RawVecUtils3F.lenRcTo(this.v, x, y, z);
	}

	/** {@inheritDoc} */
	@Override
	public float squaredLength()
	{
		return RawVecUtils3F.lenSq(this.v);
	}
	
	/** {@inheritDoc} */
	@Override
	public float squaredLength(ITup3RF v)
	{
		return VecUtils3F.lenSqTo(this.v, v);
	}

	/** {@inheritDoc} */
	@Override
	public float squaredLength(ITupRF v)
	{
		return VecUtils3F.lenSqTo(this.v, v);
	}
	
	/** {@inheritDoc} */
	@Override
	public float squaredLength(float[] v)
	{
		return RawVecUtils3F.lenSqTo(this.v, v);
	}

	/** {@inheritDoc} */
	@Override
	public float squaredLength(float x, float y, float z)
	{
		return RawVecUtils3F.lenSqTo(this.v, x, y, z);
	}
	
	/** {@inheritDoc} */
	@Override
	public float dot(ITup3RF v)
	{
		return VecUtils3F.dot(this.v, v);
	}

	/** {@inheritDoc} */
	@Override
	public float dot(ITupRF v)
	{
		return VecUtils3F.dot(this.v, v);
	}
	
	/** {@inheritDoc} */
	@Override
	public float dot(float[] v)
	{
		return RawVecUtils3F.dot(this.v, v);
	}

	/** {@inheritDoc} */
	@Override
	public float dot(float x, float y, float z)
	{
		return RawVecUtils3F.dot(this.v, x, y, z);
	}
	
	/** {@inheritDoc} */
	@Override
	public Vec3F negate()
	{
		RawVecUtils3F.neg(this.v, this.v);
		
		return this;
	}
	
	/** {@inheritDoc} */
	@Override
	public Vec3F negateN()
	{
		return VecUtils3F.negFunc(this.v, CTOR);
	}
	
	/** {@inheritDoc} */
	@Override
	public Vec3F reciprocal()
	{
		RawVecUtils3F.rec(this.v, this.v);
		
		return this;
	}
	
	/** {@inheritDoc} */
	@Override
	public Vec3F reciprocalN()
	{
		return VecUtils3F.recFunc(this.v, CTOR);
	}
	
	/** {@inheritDoc} */
	@Override
	public Vec3F normalize()
	{
		RawVecUtils3F.nrm(this.v, this.v);
		
		return this;
	}
	
	/** {@inheritDoc} */
	@Override
	public Vec3F normalizeN()
	{
		return VecUtils3F.nrmFunc(this.v, CTOR);
	}
	
	/** {@inheritDoc} */
	@Override
	public Vec3F abs()
	{
		RawVecUtils3F.abs(this.v, this.v);
		
		return this;
	}
	
	/** {@inheritDoc} */
	@Override
	public Vec3F absN()
	{
		return VecUtils3F.absFunc(this.v, CTOR);
	}
	
	/** {@inheritDoc} */
	@Override
	public Vec3F signum()
	{
		RawVecUtils3F.signum(this.v, this.v);
		
		return this;
	}

	/** {@inheritDoc} */
	@Override
	public Vec3F signumN()
	{
		return VecUtils3F.signumFunc(this.v, CTOR);
	}
	
	/** {@inheritDoc} */
	@Override
	public Vec3F cross(ITup3RF v)
	{
		return VecUtils3F.cross(this, v, this);
	}

	/** {@inheritDoc} */
	@Override
	public Vec3F cross(ITupRF v)
	{
		return VecUtils3F.cross(this, v, this);
	}

	/** {@inheritDoc} */
	@Override
	public Vec3F cross(float[] v)
	{
		return VecUtils3F.cross(this, v, this);
	}

	/** {@inheritDoc} */
	@Override
	public Vec3F cross(float x, float y, float z)
	{
		return VecUtils3F.cross(this, x, y, z, this);
	}

	/** {@inheritDoc} */
	@Override
	public Vec3F crossN(ITup3RF v)
	{
		return VecUtils3F.crossFunc(this, v, CTOR);
	}

	/** {@inheritDoc} */
	@Override
	public Vec3F crossN(ITupRF v)
	{
		return VecUtils3F.crossFunc(this, v, CTOR);
	}

	/** {@inheritDoc} */
	@Override
	public Vec3F crossN(float[] v)
	{
		return VecUtils3F.crossFunc(this, v, CTOR);
	}

	/** {@inheritDoc} */
	@Override
	public Vec3F crossN(float x, float y, float z)
	{
		return VecUtils3F.crossFunc(this, x, y, z, CTOR);
	}
	
	/** {@inheritDoc} */
	@Override
	public Vec3F revCross(ITup3RF v)
	{
		return VecUtils3F.cross(v, this, this);
	}

	/** {@inheritDoc} */
	@Override
	public Vec3F revCross(ITupRF v)
	{
		return VecUtils3F.cross(v, this, this);
	}

	/** {@inheritDoc} */
	@Override
	public Vec3F revCross(float[] v)
	{
		return VecUtils3F.cross(v, this, this);
	}

	/** {@inheritDoc} */
	@Override
	public Vec3F revCross(float x, float y, float z)
	{
		return VecUtils3F.cross(x, y, z, this, this);
	}

	/** {@inheritDoc} */
	@Override
	public Vec3F revCrossN(ITup3RF v)
	{
		return VecUtils3F.crossFunc(v, this, CTOR);
	}

	/** {@inheritDoc} */
	@Override
	public Vec3F revCrossN(ITupRF v)
	{
		return VecUtils3F.crossFunc(v, this, CTOR);
	}

	/** {@inheritDoc} */
	@Override
	public Vec3F revCrossN(float[] v)
	{
		return VecUtils3F.crossFunc(v, this, CTOR);
	}

	/** {@inheritDoc} */
	@Override
	public Vec3F revCrossN(float x, float y, float z)
	{
		return VecUtils3F.crossFunc(x, y, z, this, CTOR);
	}
}
