package org.barghos.impl.math.vector;

import java.lang.foreign.MemoryLayout;

import static java.lang.foreign.ValueLayout.*;

import java.util.Objects;

import org.barghos.annotation.AllowNull;
import org.barghos.api.core.function.floats.IFunc2F;
import org.barghos.api.core.math.MathUtils;
import org.barghos.api.core.tuple.floats.ITup2RF;
import org.barghos.api.core.tuple.floats.ITup2WF;
import org.barghos.api.core.tuple.floats.ITupRF;
import org.barghos.api.math.vector.IVec2WF;
import org.barghos.api.math.vector.VecUtils2F;

public class Vec2F implements IVec2WF
{
	public static final IFunc2F<Vec2F> CTOR = Vec2F::new;
	
	public static final long BYTES = 8;
	public static final long OFFSET_X = 0;
	public static final long OFFSET_Y = 4;
	public static final MemoryLayout MEM_LAYOUT = MemoryLayout.sequenceLayout(2, JAVA_FLOAT);
	public static final MemoryLayout MEM_LAYOUT_8 = MemoryLayout.sequenceLayout(2, JAVA_FLOAT);
	public static final MemoryLayout MEM_LAYOUT_16 = MemoryLayout.structLayout(MemoryLayout.sequenceLayout(2, JAVA_FLOAT), MemoryLayout.paddingLayout(8));
	public static final MemoryLayout MEM_LAYOUT_32 = MemoryLayout.structLayout(MemoryLayout.sequenceLayout(2, JAVA_FLOAT), MemoryLayout.paddingLayout(40));
	
	public final float[] data = new float[SIZE];
	
	public Vec2F()
	{
		set(0.0f, 0.0f);
	}
	
	public Vec2F(ITup2RF t)
	{
		set(t);
	}
	
	public Vec2F(ITupRF t)
	{
		set(t);
	}
	
	public Vec2F(float[] t)
	{
		set(t);
	}
	
	public Vec2F(float value)
	{
		set(value, value);
	}
	
	public Vec2F(float x, float y)
	{
		set(x, y);
	}

	/** {@inheritDoc} */
	@Override
	public float x()
	{
		return this.data[0];
	}

	/** {@inheritDoc} */
	@Override
	public float y()
	{
		return this.data[1];
	}

	/** {@inheritDoc} */
	@Override
	public float v0()
	{
		return this.data[0];
	}

	/** {@inheritDoc} */
	@Override
	public float v1()
	{
		return this.data[1];
	}
	
	/** {@inheritDoc} */
	@Override
	public float at(int index)
	{
		return this.data[index];
	}
	
	/** {@inheritDoc} */
	@Override
	public Vec2F x(float x)
	{
		this.data[0] = x;
		
		return this;
	}

	/** {@inheritDoc} */
	@Override
	public Vec2F y(float y)
	{
		this.data[1] = y;
		
		return this;
	}
	
	/** {@inheritDoc} */
	@Override
	public ITup2WF v0(float v0)
	{
		this.data[0] = v0;
		
		return this;
	}

	/** {@inheritDoc} */
	@Override
	public ITup2WF v1(float v1)
	{
		this.data[1] = v1;
		
		return this;
	}

	/** {@inheritDoc} */
	@Override
	public Vec2F set(ITup2RF v)
	{
		v.toArray(this.data);
		
		return this;
	}

	/** {@inheritDoc} */
	@Override
	public Vec2F set(ITupRF v)
	{
		v.toArray(this.data);
		
		return this;
	}

	/** {@inheritDoc} */
	@Override
	public Vec2F set(float[] values)
	{
		System.arraycopy(values, 0, this.data, 0, 2);
		
		return this;
	}

	public Vec2F set(float value)
	{
		this.data[0] = value;
		this.data[1] = value;
		
		return this;
	}
	
	/** {@inheritDoc} */
	@Override
	public Vec2F set(float x, float y)
	{
		this.data[0] = x;
		this.data[1] = y;
		
		return this;
	}

	/** {@inheritDoc} */
	@Override
	public Vec2F at(int index, float value)
	{
		this.data[index] = value;
		
		return this;
	}

	/** {@inheritDoc} */
	@Override
	public float[] toArray()
	{
		float[] res = new float[2];
		System.arraycopy(this.data, 0, res, 0, 2);
		
		return res;
	}

	/** {@inheritDoc} */
	@Override
	public float[] toArray(float[] res)
	{
		System.arraycopy(this.data, 0, res, 0, 2);
		
		return res;
	}

	/** {@inheritDoc} */
	@Override
	public String toString()
	{
		return "vec2f(x=" + this.data[0] + ", y=" + this.data[1] + ")";
	}
	
	/** {@inheritDoc} */
	@Override
	public int hashCode()
	{
		return Objects.hash(this.data);
	}
	
	/** {@inheritDoc} */
	@Override
	public boolean equals(@AllowNull Object obj)
	{
		if(obj == null) return false;
		if(obj == this) return true;
		
		if(obj instanceof Vec2F t)
		{
			if(this.data[0] != t.data[0]) return false;
			if(this.data[1] != t.data[1]) return false;
			
			return true;
		}
		
		if(obj instanceof ITup2RF t)
		{
			if(this.data[0] != t.v0()) return false;
			if(this.data[1] != t.v1()) return false;
			
			return true;
		}
		
		if(obj instanceof ITupRF t)
		{
			if(this.data[0] != t.at(0)) return false;
			if(this.data[1] != t.at(1)) return false;
			
			return true;
		}
		
		if(obj instanceof float[] t)
		{
			if(this.data[0] != t[0]) return false;
			if(this.data[1] != t[1]) return false;
			
			return true;
		}
		
		return false;
	}
	
	public Vec2F add(Vec2F v)
	{
		this.data[0] += v.data[0];
		this.data[1] += v.data[1];

		return this;
	}
	
	/** {@inheritDoc} */
	@Override
	public Vec2F add(ITup2RF v)
	{
		this.data[0] += v.v0();
		this.data[1] += v.v1();
		
		return this;
	}

	/** {@inheritDoc} */
	@Override
	public Vec2F add(ITupRF v)
	{
		this.data[0] += v.at(0);
		this.data[1] += v.at(1);
		
		return this;
	}
	
	/** {@inheritDoc} */
	@Override
	public Vec2F add(float[] v)
	{
		this.data[0] += v[0];
		this.data[1] += v[1];
		
		return this;
	}
	
	/** {@inheritDoc} */
	@Override
	public Vec2F add(float value)
	{
		this.data[0] += value;
		this.data[1] += value;
		
		return this;
	}
	
	/** {@inheritDoc} */
	@Override
	public Vec2F add(float vX, float vY)
	{
		this.data[0] += vX;
		this.data[1] += vY;
		
		return this;
	}
	
	public Vec2F addN(Vec2F v)
	{
		return new Vec2F(
			this.data[0] + v.data[0],
			this.data[1] + v.data[1]
		);
	}
	
	/** {@inheritDoc} */
	@Override
	public Vec2F addN(ITup2RF v)
	{
		return new Vec2F(
			this.data[0] + v.v0(),
			this.data[1] + v.v1()
		);
	}

	/** {@inheritDoc} */
	@Override
	public Vec2F addN(ITupRF v)
	{
		return new Vec2F(
			this.data[0] + v.at(0),
			this.data[1] + v.at(1)
		);
	}
	
	/** {@inheritDoc} */
	@Override
	public Vec2F addN(float[] v)
	{
		return new Vec2F(
			this.data[0] + v[0],
			this.data[1] + v[1]
		);
	}
	
	/** {@inheritDoc} */
	@Override
	public Vec2F addN(float value)
	{
		return new Vec2F(
			this.data[0] + value,
			this.data[1] + value
		);
	}

	/** {@inheritDoc} */
	@Override
	public Vec2F addN(float vX, float vY)
	{
		return new Vec2F(
			this.data[0] + vX,
			this.data[1] + vY
		);
	}
	
	public Vec2F sub(Vec2F v)
	{
		this.data[0] -= v.data[0];
		this.data[1] -= v.data[1];
		
		return this;
	}
	
	/** {@inheritDoc} */
	@Override
	public Vec2F sub(ITup2RF v)
	{
		this.data[0] -= v.v0();
		this.data[1] -= v.v1();
		
		return this;
	}

	/** {@inheritDoc} */
	@Override
	public Vec2F sub(ITupRF v)
	{
		this.data[0] -= v.at(0);
		this.data[1] -= v.at(1);
		
		return this;
	}
	
	/** {@inheritDoc} */
	@Override
	public Vec2F sub(float[] v)
	{
		this.data[0] -= v[0];
		this.data[1] -= v[1];
		
		return this;
	}
	
	/** {@inheritDoc} */
	@Override
	public Vec2F sub(float value)
	{
		this.data[0] -= value;
		this.data[1] -= value;
		
		return this;
	}

	/** {@inheritDoc} */
	@Override
	public Vec2F sub(float vX, float vY)
	{
		this.data[0] -= vX;
		this.data[1] -= vY;
		
		return this;
	}
	
	public Vec2F subN(Vec2F v)
	{
		return new Vec2F(
			this.data[0] - v.data[0],
			this.data[1] - v.data[1]
		);
	}
	
	/** {@inheritDoc} */
	@Override
	public Vec2F subN(ITup2RF v)
	{
		return new Vec2F(
			this.data[0] - v.v0(),
			this.data[1] - v.v1()
		);
	}

	/** {@inheritDoc} */
	@Override
	public Vec2F subN(ITupRF v)
	{
		return new Vec2F(
			this.data[0] - v.at(0),
			this.data[1] - v.at(1)
		);
	}
	
	/** {@inheritDoc} */
	@Override
	public Vec2F subN(float[] v)
	{
		return new Vec2F(
			this.data[0] - v[0],
			this.data[1] - v[1]
		);
	}
	
	/** {@inheritDoc} */
	@Override
	public Vec2F subN(float value)
	{
		return new Vec2F(
			this.data[0] - value,
			this.data[1] - value
		);
	}

	/** {@inheritDoc} */
	@Override
	public Vec2F subN(float vX, float vY)
	{
		return new Vec2F(
			this.data[0] - vX,
			this.data[1] - vY
		);
	}
	
	public Vec2F revSub(Vec2F v)
	{
		this.data[0] = v.data[0] - this.data[0];
		this.data[1] = v.data[1] - this.data[1];
		
		return this;
	}
	
	/** {@inheritDoc} */
	@Override
	public Vec2F revSub(ITup2RF v)
	{
		this.data[0] = v.v0() - this.data[0];
		this.data[1] = v.v1() - this.data[1];
		
		return this;
	}

	/** {@inheritDoc} */
	@Override
	public Vec2F revSub(ITupRF v)
	{
		this.data[0] = v.at(0) - this.data[0];
		this.data[1] = v.at(1) - this.data[1];
		
		return this;
	}
	
	/** {@inheritDoc} */
	@Override
	public Vec2F revSub(float[] v)
	{
		this.data[0] = v[0] - this.data[0];
		this.data[1] = v[1] - this.data[1];
		
		return this;
	}
	
	/** {@inheritDoc} */
	@Override
	public Vec2F revSub(float value)
	{
		this.data[0] = value - this.data[0];
		this.data[1] = value - this.data[1];
		
		return this;
	}

	/** {@inheritDoc} */
	@Override
	public Vec2F revSub(float vX, float vY)
	{
		this.data[0] = vX - this.data[0];
		this.data[1] = vY - this.data[1];
		
		return this;
	}
	
	public Vec2F revSubN(Vec2F v)
	{
		return new Vec2F(
			v.data[0] - this.data[0],
			v.data[1] - this.data[1]
		);
	}
	
	/** {@inheritDoc} */
	@Override
	public Vec2F revSubN(ITup2RF v)
	{
		return new Vec2F(
			v.v0() - this.data[0],
			v.v1() - this.data[1]
		);
	}

	/** {@inheritDoc} */
	@Override
	public Vec2F revSubN(ITupRF v)
	{
		return new Vec2F(
			v.at(0) - this.data[0],
			v.at(1) - this.data[1]
		);
	}
	
	/** {@inheritDoc} */
	@Override
	public Vec2F revSubN(float[] v)
	{
		return new Vec2F(
			v[0] - this.data[0],
			v[1] - this.data[1]
		);
	}
	
	/** {@inheritDoc} */
	@Override
	public Vec2F revSubN(float value)
	{
		return new Vec2F(
			value - this.data[0],
			value - this.data[1]
		);
	}

	/** {@inheritDoc} */
	@Override
	public Vec2F revSubN(float vX, float vY)
	{
		return new Vec2F(
			vX - this.data[0],
			vY - this.data[1]
		);
	}
	
	public Vec2F mul(Vec2F v)
	{
		this.data[0] *= v.data[0];
		this.data[1] *= v.data[1];

		return this;
	}
	
	/** {@inheritDoc} */
	@Override
	public Vec2F mul(ITup2RF v)
	{
		this.data[0] *= v.v0();
		this.data[1] *= v.v1();
		
		return this;
	}

	/** {@inheritDoc} */
	@Override
	public Vec2F mul(ITupRF v)
	{
		this.data[0] *= v.at(0);
		this.data[1] *= v.at(1);
		
		return this;
	}
	
	/** {@inheritDoc} */
	@Override
	public Vec2F mul(float[] v)
	{
		this.data[0] *= v[0];
		this.data[1] *= v[1];
		
		return this;
	}
	
	/** {@inheritDoc} */
	@Override
	public Vec2F mul(float value)
	{
		this.data[0] *= value;
		this.data[1] *= value;
		
		return this;
	}
	
	/** {@inheritDoc} */
	@Override
	public Vec2F mul(float vX, float vY)
	{
		this.data[0] *= vX;
		this.data[1] *= vY;
		
		return this;
	}
	
	public Vec2F mulN(Vec2F v)
	{
		return new Vec2F(
			this.data[0] * v.data[0],
			this.data[1] * v.data[1]
		);
	}
	
	/** {@inheritDoc} */
	@Override
	public Vec2F mulN(ITup2RF v)
	{
		return new Vec2F(
			this.data[0] * v.v0(),
			this.data[1] * v.v1()
		);
	}

	/** {@inheritDoc} */
	@Override
	public Vec2F mulN(ITupRF v)
	{
		return new Vec2F(
			this.data[0] * v.at(0),
			this.data[1] * v.at(1)
		);
	}
	
	/** {@inheritDoc} */
	@Override
	public Vec2F mulN(float[] v)
	{
		return new Vec2F(
			this.data[0] * v[0],
			this.data[1] * v[1]
		);
	}
	
	/** {@inheritDoc} */
	@Override
	public Vec2F mulN(float value)
	{
		return new Vec2F(
			this.data[0] * value,
			this.data[1] * value
		);
	}

	/** {@inheritDoc} */
	@Override
	public Vec2F mulN(float vX, float vY)
	{
		return new Vec2F(
			this.data[0] * vX,
			this.data[1] * vY
		);
	}
	
	public Vec2F div(Vec2F v)
	{
		this.data[0] /= v.data[0];
		this.data[1] /= v.data[1];
		
		return this;
	}
	
	/** {@inheritDoc} */
	@Override
	public Vec2F div(ITup2RF v)
	{
		this.data[0] /= v.v0();
		this.data[1] /= v.v1();
		
		return this;
	}

	/** {@inheritDoc} */
	@Override
	public Vec2F div(ITupRF v)
	{
		this.data[0] /= v.at(0);
		this.data[1] /= v.at(1);
		
		return this;
	}
	
	/** {@inheritDoc} */
	@Override
	public Vec2F div(float[] v)
	{
		this.data[0] /= v[0];
		this.data[1] /= v[1];
		
		return this;
	}

	/** {@inheritDoc} */
	@Override
	public Vec2F div(float value)
	{
		this.data[0] /= value;
		this.data[1] /= value;
		
		return this;
	}

	/** {@inheritDoc} */
	@Override
	public Vec2F div(float vX, float vY)
	{
		this.data[0] /= vX;
		this.data[1] /= vY;
		
		return this;
	}
	
	public Vec2F divN(Vec2F v)
	{
		return new Vec2F(
			this.data[0] / v.data[0],
			this.data[1] / v.data[1]
		);
	}
	
	/** {@inheritDoc} */
	@Override
	public Vec2F divN(ITup2RF v)
	{
		return new Vec2F(
			this.data[0] / v.v0(),
			this.data[1] / v.v1()
		);
	}

	/** {@inheritDoc} */
	@Override
	public Vec2F divN(ITupRF v)
	{
		return new Vec2F(
			this.data[0] / v.at(0),
			this.data[1] / v.at(1)
		);
	}
	
	/** {@inheritDoc} */
	@Override
	public Vec2F divN(float[] v)
	{
		return new Vec2F(
			this.data[0] / v[0],
			this.data[1] / v[1]
		);
	}

	/** {@inheritDoc} */
	@Override
	public Vec2F divN(float value)
	{
		return new Vec2F(
			this.data[0] / value,
			this.data[1] / value
		);
	}

	/** {@inheritDoc} */
	@Override
	public Vec2F divN(float vX, float vY)
	{
		return new Vec2F(
			this.data[0] / vX,
			this.data[1] / vY
		);
	}
	
	public Vec2F revDiv(Vec2F v)
	{
		this.data[0] = v.data[0] / this.data[0];
		this.data[1] = v.data[1] / this.data[1];
		
		return this;
	}
	
	/** {@inheritDoc} */
	@Override
	public Vec2F revDiv(ITup2RF v)
	{
		this.data[0] = v.v0() / this.data[0];
		this.data[1] = v.v1() / this.data[1];
		
		return this;
	}

	/** {@inheritDoc} */
	@Override
	public Vec2F revDiv(ITupRF v)
	{
		this.data[0] = v.at(0) / this.data[0];
		this.data[1] = v.at(1) / this.data[1];
		
		return this;
	}
	
	/** {@inheritDoc} */
	@Override
	public Vec2F revDiv(float[] v)
	{
		this.data[0] = v[0] / this.data[0];
		this.data[1] = v[1] / this.data[1];
		
		return this;
	}

	/** {@inheritDoc} */
	@Override
	public Vec2F revDiv(float value)
	{
		this.data[0] = value / this.data[0];
		this.data[1] = value / this.data[1];
		
		return this;
	}

	/** {@inheritDoc} */
	@Override
	public Vec2F revDiv(float vX, float vY)
	{
		this.data[0] = vX / this.data[0];
		this.data[1] = vY / this.data[1];
		
		return this;
	}
	
	public Vec2F revDivN(Vec2F v)
	{
		return new Vec2F(
			v.data[0] / this.data[0],
			v.data[1] / this.data[1]
		);
	}
	
	/** {@inheritDoc} */
	@Override
	public Vec2F revDivN(ITup2RF v)
	{
		return new Vec2F(
			v.v0() / this.data[0],
			v.v1() / this.data[1]
		);
	}

	/** {@inheritDoc} */
	@Override
	public Vec2F revDivN(ITupRF v)
	{
		return new Vec2F(
			v.at(0) / this.data[0],
			v.at(1) / this.data[1]
		);
	}
	
	/** {@inheritDoc} */
	@Override
	public Vec2F revDivN(float[] v)
	{
		return new Vec2F(
			v[0] / this.data[0],
			v[1] / this.data[1]
		);
	}

	/** {@inheritDoc} */
	@Override
	public Vec2F revDivN(float value)
	{
		return new Vec2F(
			value / this.data[0],
			value / this.data[1]
		);
	}

	/** {@inheritDoc} */
	@Override
	public Vec2F revDivN(float vX, float vY)
	{
		return new Vec2F(
			vX / this.data[0],
			vY / this.data[1]
		);
	}
	
	/** {@inheritDoc} */
	@Override
	public float length()
	{
		float vX = this.data[0];
		float vY = this.data[1];
		
		if(vX == 0.0f && vY == 0.0f) return 0.0f;
		
		return MathUtils.sqrt(vX * vX + vY * vY);
	}
	
	public float length(Vec2F p)
	{
		float vX = p.data[0] - this.data[0];
		float vY = p.data[1] - this.data[1];
		
		if(vX == 0.0f && vY == 0.0f) return 0.0f;
		
		return MathUtils.sqrt(vX * vX + vY * vY);
	}
	
	/** {@inheritDoc} */
	@Override
	public float length(ITup2RF p)
	{
		float vX = p.v0() - this.data[0];
		float vY = p.v1() - this.data[1];
		
		if(vX == 0.0f && vY == 0.0f) return 0.0f;
		
		return MathUtils.sqrt(vX * vX + vY * vY);
	}

	/** {@inheritDoc} */
	@Override
	public float length(ITupRF p)
	{
		float vX = p.at(0) - this.data[0];
		float vY = p.at(1) - this.data[1];
		
		if(vX == 0.0f && vY == 0.0f) return 0.0f;
		
		return MathUtils.sqrt(vX * vX + vY * vY);
	}
	
	/** {@inheritDoc} */
	@Override
	public float length(float[] p)
	{
		float vX = p[0] - this.data[0];
		float vY = p[1] - this.data[1];
		
		if(vX == 0.0f && vY == 0.0f) return 0.0f;
		
		return MathUtils.sqrt(vX * vX + vY * vY);
	}
	
	/** {@inheritDoc} */
	@Override
	public float length(float pX, float pY)
	{
		float vX = pX - this.data[0];
		float vY = pY - this.data[1];
		
		if(vX == 0.0f && vY == 0.0f) return 0.0f;
		
		return MathUtils.sqrt(vX * vX + vY * vY);
	}
	
	/** {@inheritDoc} */
	@Override
	public float reciprocalLength()
	{
		float vX = this.data[0];
		float vY = this.data[1];
		
		return MathUtils.invSqrt(vX * vX + vY * vY);
	}
	
	public float reciprocalLength(Vec2F p)
	{
		float vX = p.data[0] - this.data[0];
		float vY = p.data[1] - this.data[1];
		
		return MathUtils.invSqrt(vX * vX + vY * vY);
	}

	
	/** {@inheritDoc} */
	@Override
	public float reciprocalLength(ITup2RF p)
	{
		float vX = p.v0() - this.data[0];
		float vY = p.v1() - this.data[1];
		
		return MathUtils.invSqrt(vX * vX + vY * vY);
	}

	/** {@inheritDoc} */
	@Override
	public float reciprocalLength(ITupRF p)
	{
		float vX = p.at(0) - this.data[0];
		float vY = p.at(1) - this.data[1];
		
		return MathUtils.invSqrt(vX * vX + vY * vY);
	}
	
	/** {@inheritDoc} */
	@Override
	public float reciprocalLength(float[] p)
	{
		float vX = p[0] - this.data[0];
		float vY = p[1] - this.data[1];
		
		return MathUtils.invSqrt(vX * vX + vY * vY);
	}

	/** {@inheritDoc} */
	@Override
	public float reciprocalLength(float pX, float pY)
	{
		float vX = pX - this.data[0];
		float vY = pY - this.data[1];
		
		return MathUtils.invSqrt(vX * vX + vY * vY);
	}

	/** {@inheritDoc} */
	@Override
	public float squaredLength()
	{
		float vX = this.data[0];
		float vY = this.data[1];
		
		return vX * vX + vY * vY;
	}
	
	public float squaredLength(Vec2F p)
	{
		float vX = p.data[0] - this.data[0];
		float vY = p.data[1] - this.data[1];
		
		return vX * vX + vY * vY;
	}
	
	/** {@inheritDoc} */
	@Override
	public float squaredLength(ITup2RF p)
	{
		float vX = p.v0() - this.data[0];
		float vY = p.v1() - this.data[1];
		
		return vX * vX + vY * vY;
	}

	/** {@inheritDoc} */
	@Override
	public float squaredLength(ITupRF p)
	{
		float vX = p.at(0) - this.data[0];
		float vY = p.at(1) - this.data[1];
		
		return vX * vX + vY * vY;
	}
	
	/** {@inheritDoc} */
	@Override
	public float squaredLength(float[] p)
	{
		float vX = p[0] - this.data[0];
		float vY = p[1] - this.data[1];
		
		return vX * vX + vY * vY;
	}

	/** {@inheritDoc} */
	@Override
	public float squaredLength(float pX, float pY)
	{
		float vX = pX - this.data[0];
		float vY = pY - this.data[1];
		
		return vX * vX + vY * vY;
	}
	
	public float dot(Vec2F v)
	{
		return this.data[0] * v.data[0] + this.data[1] * v.data[1];
	}
	
	/** {@inheritDoc} */
	@Override
	public float dot(ITup2RF v)
	{
		return this.data[0] * v.v0() + this.data[1] * v.v1();
	}

	/** {@inheritDoc} */
	@Override
	public float dot(ITupRF v)
	{
		return this.data[0] * v.at(0) + this.data[1] * v.at(1);
	}
	
	/** {@inheritDoc} */
	@Override
	public float dot(float[] v)
	{
		return this.data[0] * v[0] + this.data[1] * v[1];
	}

	/** {@inheritDoc} */
	@Override
	public float dot(float vX, float vY)
	{
		return this.data[0] * vX + this.data[1] * vY;
	}
	
	/** {@inheritDoc} */
	@Override
	public Vec2F negate()
	{
		this.data[0] = -this.data[0];
		this.data[1] = -this.data[1];
		
		return this;
	}
	
	/** {@inheritDoc} */
	@Override
	public Vec2F negateN()
	{
		return new Vec2F(
			-this.data[0],
			-this.data[1]
		);
	}
	
	/** {@inheritDoc} */
	@Override
	public Vec2F reciprocal()
	{
		this.data[0] = 1.0f / this.data[0];
		this.data[1] = 1.0f / this.data[1];
		
		return this;
	}
	
	/** {@inheritDoc} */
	@Override
	public Vec2F reciprocalN()
	{
		return new Vec2F(
			1.0f / this.data[0],
			1.0f / this.data[1]
		);
	}
	
	/** {@inheritDoc} */
	@Override
	public Vec2F normalize()
	{
		VecUtils2F.nrm(this.data, this.data);
		
		return this;
	}
	
	/** {@inheritDoc} */
	@Override
	public Vec2F normalizeN()
	{
		return VecUtils2F.nrmFunc(this.data, CTOR);
	}
	
	/** {@inheritDoc} */
	@Override
	public Vec2F abs()
	{
		this.data[0] = Math.abs(this.data[0]);
		this.data[1] = Math.abs(this.data[1]);
		
		return this;
	}
	
	/** {@inheritDoc} */
	@Override
	public Vec2F absN()
	{
		return new Vec2F(
			Math.abs(this.data[0]),
			Math.abs(this.data[1])
		);
	}
	
	/** {@inheritDoc} */
	@Override
	public Vec2F signum()
	{
		this.data[0] = Math.signum(this.data[0]);
		this.data[1] = Math.signum(this.data[1]);
		
		return this;
	}

	/** {@inheritDoc} */
	@Override
	public Vec2F signumN()
	{
		return new Vec2F(
			Math.signum(this.data[0]),
			Math.signum(this.data[1])
		);
	}
	
}
