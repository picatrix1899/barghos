package org.barghos.math.vector;

import java.nio.FloatBuffer;
import java.util.Arrays;
import java.util.Objects;

import org.barghos.util.collection.IndexValuePairF;
import org.barghos.util.function.floats.IFunc3F;
import org.barghos.util.nio.buffer.IBufferableRF;
import org.barghos.util.nio.buffer.IBufferableWF;
import org.barghos.util.tuple.floats.ITup3RF;
import org.barghos.util.tuple.floats.ITup3WF;
import org.barghos.util.tuple.floats.ITupRF;
import org.barghos.util.tuple.floats.TupUtils3F;

public class Vec3F implements IVec3WF, IBufferableRF, IBufferableWF
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
	public float getAt(int index)
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
	public Vec3F setAt(int index, float value)
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
	
	@Override
	public Vec3F writeTo(FloatBuffer buffer)
	{
		buffer.put(this.v);
		
		return this;
	}
	
	@Override
	public Vec3F readFrom(FloatBuffer buffer, int offset)
	{
		buffer.get(offset, this.v);
		
		return this;
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
		VecUtils3F.add(this.v, v, this.v);
		
		return this;
	}

	/** {@inheritDoc} */
	@Override
	public Vec3F add(float value)
	{
		VecUtils3F.add(this.v, value, value, value, this.v);
		
		return this;
	}

	/** {@inheritDoc} */
	@Override
	public Vec3F add(float x, float y, float z)
	{
		VecUtils3F.add(this.v, x, y, z, this.v);
		
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
	public float[] addT(ITup3RF v, float[] res)
	{
		return VecUtils3F.add(this.v, v, res);
	}
	
	/** {@inheritDoc} */
	@Override
	public float[] addT(ITupRF v, float[] res)
	{
		return VecUtils3F.add(this.v, v, res);
	}
	
	/** {@inheritDoc} */
	@Override
	public float[] addT(float[] v, float[] res)
	{
		return VecUtils3F.add(this.v, v, res);
	}
	
	/** {@inheritDoc} */
	@Override
	public float[] addT(float value, float[] res)
	{
		return VecUtils3F.add(this.v, value, value, value, res);
	}

	/** {@inheritDoc} */
	@Override
	public float[] addT(float x, float y, float z, float[] res)
	{
		return VecUtils3F.add(this.v, x, y, z, res);
	}
	
	/** {@inheritDoc} */
	@Override
	public <T extends ITup3WF> T addT(ITup3RF v, T res)
	{
		return VecUtils3F.add(this.v, v, res);
	}

	/** {@inheritDoc} */
	@Override
	public <T extends ITup3WF> T addT(ITupRF v, T res)
	{
		return VecUtils3F.add(this.v, v, res);
	}
	
	/** {@inheritDoc} */
	@Override
	public <T extends ITup3WF> T addT(float[] v, T res)
	{
		return VecUtils3F.add(this.v, v, res);
	}
	
	/** {@inheritDoc} */
	@Override
	public <T extends ITup3WF> T addT(float value, T res)
	{
		return VecUtils3F.add(this.v, value, value, value, res);
	}

	/** {@inheritDoc} */
	@Override
	public <T extends ITup3WF> T addT(float x, float y, float z, T res)
	{
		return VecUtils3F.add(this.v, x, y, z, res);
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
		VecUtils3F.sub(this.v, v, this.v);
		
		return this;
	}

	/** {@inheritDoc} */
	@Override
	public Vec3F sub(float value)
	{
		VecUtils3F.sub(this.v, value, value, value, this.v);
		
		return this;
	}

	/** {@inheritDoc} */
	@Override
	public Vec3F sub(float x, float y, float z)
	{
		VecUtils3F.sub(this.v, x, y, z, this.v);
		
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
	public float[] subT(ITup3RF v, float[] res)
	{
		return VecUtils3F.sub(this.v, v, res);
	}

	/** {@inheritDoc} */
	@Override
	public float[] subT(ITupRF v, float[] res)
	{
		return VecUtils3F.sub(this.v, v, res);
	}
	
	/** {@inheritDoc} */
	@Override
	public float[] subT(float[] v, float[] res)
	{
		return VecUtils3F.sub(this.v, v, res);
	}
	
	/** {@inheritDoc} */
	@Override
	public float[] subT(float value, float[] res)
	{
		return VecUtils3F.sub(this.v, value, value, value, res);
	}
	
	/** {@inheritDoc} */
	@Override
	public float[] subT(float x, float y, float z, float[] res)
	{
		return VecUtils3F.sub(this.v, x, y, z, res);
	}
	
	/** {@inheritDoc} */
	@Override
	public <T extends ITup3WF> T subT(ITup3RF v, T res)
	{
		return VecUtils3F.sub(this.v, v, res);
	}
	
	/** {@inheritDoc} */
	@Override
	public <T extends ITup3WF> T subT(ITupRF v, T res)
	{
		return VecUtils3F.sub(this.v, v, res);
	}
	
	/** {@inheritDoc} */
	@Override
	public <T extends ITup3WF> T subT(float[] v, T res)
	{
		return VecUtils3F.sub(this.v, v, res);
	}

	/** {@inheritDoc} */
	@Override
	public <T extends ITup3WF> T subT(float value, T res)
	{
		return VecUtils3F.sub(this.v, value, value, value, res);
	}

	/** {@inheritDoc} */
	@Override
	public <T extends ITup3WF> T subT(float x, float y, float z, T res)
	{
		return VecUtils3F.sub(this.v, x, y, z, res);
	}

	/** {@inheritDoc} */
	@Override
	public Vec3F rSub(ITup3RF v)
	{
		VecUtils3F.sub(v, this.v, this.v);
		
		return this;
	}

	/** {@inheritDoc} */
	@Override
	public Vec3F rSub(ITupRF v)
	{
		VecUtils3F.sub(v, this.v, this.v);
		
		return this;
	}
	
	/** {@inheritDoc} */
	@Override
	public Vec3F rSub(float[] v)
	{
		VecUtils3F.sub(v, this.v, this.v);
		
		return this;
	}

	/** {@inheritDoc} */
	@Override
	public Vec3F rSub(float value)
	{
		VecUtils3F.sub(value, value, value, this.v, this.v);
		
		return this;
	}

	/** {@inheritDoc} */
	@Override
	public Vec3F rSub(float x, float y, float z)
	{
		VecUtils3F.sub(x, y, z, this.v, this.v);
		
		return this;
	}
	
	/** {@inheritDoc} */
	@Override
	public Vec3F rSubN(ITup3RF v)
	{
		return VecUtils3F.subFunc(v, this.v, CTOR);
	}

	/** {@inheritDoc} */
	@Override
	public Vec3F rSubN(ITupRF v)
	{
		return VecUtils3F.subFunc(v, this.v, CTOR);
	}
	
	/** {@inheritDoc} */
	@Override
	public Vec3F rSubN(float[] v)
	{
		return VecUtils3F.subFunc(v, this.v, CTOR);
	}

	/** {@inheritDoc} */
	@Override
	public Vec3F rSubN(float value)
	{
		return VecUtils3F.subFunc(value, value, value, this.v, CTOR);
	}

	/** {@inheritDoc} */
	@Override
	public Vec3F rSubN(float x, float y, float z)
	{
		return VecUtils3F.subFunc(x, y, z, this.v, CTOR);
	}
	
	/** {@inheritDoc} */
	@Override
	public float[] rSubT(ITup3RF v, float[] res)
	{
		return VecUtils3F.sub(v, this.v, res);
	}
	
	/** {@inheritDoc} */
	@Override
	public float[] rSubT(ITupRF v, float[] res)
	{
		return VecUtils3F.sub(v, this.v, res);
	}
	
	/** {@inheritDoc} */
	@Override
	public float[] rSubT(float[] v, float[] res)
	{
		return VecUtils3F.sub(v, this.v, res);
	}
	
	/** {@inheritDoc} */
	@Override
	public float[] rSubT(float value, float[] res)
	{
		return VecUtils3F.sub(value, value, value, this.v, res);
	}
	
	/** {@inheritDoc} */
	@Override
	public float[] rSubT(float x, float y, float z, float[] res)
	{
		return VecUtils3F.sub(x, y, z, this.v, res);
	}
	
	/** {@inheritDoc} */
	@Override
	public <T extends ITup3WF> T rSubT(ITup3RF v, T res)
	{
		return VecUtils3F.sub(v, this.v, res);
	}

	/** {@inheritDoc} */
	@Override
	public <T extends ITup3WF> T rSubT(ITupRF v, T res)
	{
		return VecUtils3F.sub(v, this.v, res);
	}
	
	/** {@inheritDoc} */
	@Override
	public <T extends ITup3WF> T rSubT(float[] v, T res)
	{
		return VecUtils3F.sub(v, this.v, res);
	}

	/** {@inheritDoc} */
	@Override
	public <T extends ITup3WF> T rSubT(float value, T res)
	{
		return VecUtils3F.sub(value, value, value, this.v, res);
	}

	/** {@inheritDoc} */
	@Override
	public <T extends ITup3WF> T rSubT(float x, float y, float z, T res)
	{
		return VecUtils3F.sub(x, y, z, this.v, res);
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
		VecUtils3F.mul(this.v, v, this.v);
		
		return this;
	}

	/** {@inheritDoc} */
	@Override
	public Vec3F mul(float value)
	{
		VecUtils3F.mul(this.v, value, value, value, this.v);
		
		return this;
	}

	/** {@inheritDoc} */
	@Override
	public Vec3F mul(float x, float y, float z)
	{
		VecUtils3F.mul(this.v, x, y, z, this.v);
		
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
	public float[] mulT(ITup3RF v, float[] res)
	{
		return VecUtils3F.mul(this.v, v, res);
	}
	
	/** {@inheritDoc} */
	@Override
	public float[] mulT(ITupRF v, float[] res)
	{
		return VecUtils3F.mul(this.v, v, res);
	}
	
	/** {@inheritDoc} */
	@Override
	public float[] mulT(float[] v, float[] res)
	{
		return VecUtils3F.mul(this.v, v, res);
	}
	
	/** {@inheritDoc} */
	@Override
	public float[] mulT(float value, float[] res)
	{
		return VecUtils3F.mul(this.v, value, value, value, res);
	}
	
	/** {@inheritDoc} */
	@Override
	public float[] mulT(float x, float y, float z, float[] res)
	{
		return VecUtils3F.mul(this.v, x, y, z, res);
	}
	
	/** {@inheritDoc} */
	@Override
	public <T extends ITup3WF> T mulT(ITup3RF v, T res)
	{
		return VecUtils3F.mul(this.v, v, res);
	}

	/** {@inheritDoc} */
	@Override
	public <T extends ITup3WF> T mulT(ITupRF v, T res)
	{
		return VecUtils3F.mul(this.v, v, res);
	}
	
	/** {@inheritDoc} */
	@Override
	public <T extends ITup3WF> T mulT(float[] v, T res)
	{
		return VecUtils3F.mul(this.v, v, res);
	}

	/** {@inheritDoc} */
	@Override
	public <T extends ITup3WF> T mulT(float value, T res)
	{
		return VecUtils3F.mul(this.v, value, value, value, res);
	}

	/** {@inheritDoc} */
	@Override
	public <T extends ITup3WF> T mulT(float x, float y, float z, T res)
	{
		return VecUtils3F.mul(this.v, x, y, z, res);
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
		VecUtils3F.div(this.v, v, this.v);
		
		return this;
	}

	/** {@inheritDoc} */
	@Override
	public Vec3F div(float value)
	{
		VecUtils3F.div(this.v, value, value, value, this.v);
		
		return this;
	}

	/** {@inheritDoc} */
	@Override
	public Vec3F div(float x, float y, float z)
	{
		VecUtils3F.div(this.v, x, y, z, this.v);
		
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
	public float[] divT(ITup3RF v, float[] res)
	{
		return VecUtils3F.div(this.v, v, res);
	}
	
	/** {@inheritDoc} */
	@Override
	public float[] divT(ITupRF v, float[] res)
	{
		return VecUtils3F.div(this.v, v, res);
	}
	
	/** {@inheritDoc} */
	@Override
	public float[] divT(float[] v, float[] res)
	{
		return VecUtils3F.div(this.v, v, res);
	}
	
	/** {@inheritDoc} */
	@Override
	public float[] divT(float value, float[] res)
	{
		return VecUtils3F.div(this.v, value, value, value, res);
	}
	
	/** {@inheritDoc} */
	@Override
	public float[] divT(float x, float y, float z, float[] res)
	{
		return VecUtils3F.div(this.v, x, y, z, res);
	}
	
	/** {@inheritDoc} */
	@Override
	public <T extends ITup3WF> T divT(ITup3RF v, T res)
	{
		return VecUtils3F.div(this.v, v, res);
	}

	/** {@inheritDoc} */
	@Override
	public <T extends ITup3WF> T divT(ITupRF v, T res)
	{
		return VecUtils3F.div(this.v, v, res);
	}
	
	/** {@inheritDoc} */
	@Override
	public <T extends ITup3WF> T divT(float[] v, T res)
	{
		return VecUtils3F.div(this.v, v, res);
	}

	/** {@inheritDoc} */
	@Override
	public <T extends ITup3WF> T divT(float value, T res)
	{
		return VecUtils3F.div(this.v, value, value, value, res);
	}
	
	/** {@inheritDoc} */
	@Override
	public <T extends ITup3WF> T divT(float x, float y, float z, T res)
	{
		return VecUtils3F.div(this.v, x, y, z, res);
	}

	/** {@inheritDoc} */
	@Override
	public Vec3F rDiv(ITup3RF v)
	{
		VecUtils3F.div(v, this.v, this.v);
		
		return this;
	}

	/** {@inheritDoc} */
	@Override
	public Vec3F rDiv(ITupRF v)
	{
		VecUtils3F.div(v, this.v, this.v);
		
		return this;
	}
	
	/** {@inheritDoc} */
	@Override
	public Vec3F rDiv(float[] v)
	{
		VecUtils3F.div(v, this.v, this.v);
		
		return this;
	}

	/** {@inheritDoc} */
	@Override
	public Vec3F rDiv(float value)
	{
		VecUtils3F.div(value, value, value, this.v, this.v);
		
		return this;
	}

	/** {@inheritDoc} */
	@Override
	public Vec3F rDiv(float x, float y, float z)
	{
		VecUtils3F.div(x, y, z, this.v, this.v);
		
		return this;
	}
	
	/** {@inheritDoc} */
	@Override
	public Vec3F rDivN(ITup3RF v)
	{
		return VecUtils3F.divFunc(v, this.v, CTOR);
	}

	/** {@inheritDoc} */
	@Override
	public Vec3F rDivN(ITupRF v)
	{
		return VecUtils3F.divFunc(v, this.v, CTOR);
	}
	
	/** {@inheritDoc} */
	@Override
	public Vec3F rDivN(float[] v)
	{
		return VecUtils3F.divFunc(v, this.v, CTOR);
	}

	/** {@inheritDoc} */
	@Override
	public Vec3F rDivN(float value)
	{
		return VecUtils3F.divFunc(value, value, value, this.v, CTOR);
	}

	/** {@inheritDoc} */
	@Override
	public Vec3F rDivN(float x, float y, float z)
	{
		return VecUtils3F.divFunc(x, y, z, this.v, CTOR);
	}
	
	/** {@inheritDoc} */
	@Override
	public float[] rDivT(ITup3RF v, float[] res)
	{
		return VecUtils3F.div(v, this.v, res);
	}
	
	/** {@inheritDoc} */
	@Override
	public float[] rDivT(ITupRF v, float[] res)
	{
		return VecUtils3F.div(v, this.v, res);
	}
	
	/** {@inheritDoc} */
	@Override
	public float[] rDivT(float[] v, float[] res)
	{
		return VecUtils3F.div(v, this.v, res);
	}
	
	/** {@inheritDoc} */
	@Override
	public float[] rDivT(float value, float[] res)
	{
		return VecUtils3F.div(value, value, value, this.v, res);
	}
	
	/** {@inheritDoc} */
	@Override
	public float[] rDivT(float x, float y, float z, float[] res)
	{
		return VecUtils3F.div(x, y, z, this.v, res);
	}
	
	/** {@inheritDoc} */
	@Override
	public <T extends ITup3WF> T rDivT(ITup3RF v, T res)
	{
		return VecUtils3F.div(v, this.v, res);
	}

	/** {@inheritDoc} */
	@Override
	public <T extends ITup3WF> T rDivT(ITupRF v, T res)
	{
		return VecUtils3F.div(v, this.v, res);
	}
	
	/** {@inheritDoc} */
	@Override
	public <T extends ITup3WF> T rDivT(float[] v, T res)
	{
		return VecUtils3F.div(v, this.v, res);
	}

	/** {@inheritDoc} */
	@Override
	public <T extends ITup3WF> T rDivT(float value, T res)
	{
		return VecUtils3F.div(value, value, value, this.v, res);
	}

	/** {@inheritDoc} */
	@Override
	public <T extends ITup3WF> T rDivT(float x, float y, float z, T res)
	{
		return VecUtils3F.div(x, y, z, this.v, res);
	}
	
	/** {@inheritDoc} */
	@Override
	public float len()
	{
		return VecUtils3F.len(this.v);
	}

	/** {@inheritDoc} */
	@Override
	public float len(float tolerance)
	{
		return VecUtils3F.len(tolerance, this.v);
	}

	/** {@inheritDoc} */
	@Override
	public float lenRc()
	{
		return VecUtils3F.lenRc(this.v);
	}

	/** {@inheritDoc} */
	@Override
	public float lenTo(ITup3RF v)
	{
		return VecUtils3F.lenTo(this.v, v);
	}

	/** {@inheritDoc} */
	@Override
	public float lenTo(ITupRF v)
	{
		return VecUtils3F.lenTo(this.v, v);
	}
	
	/** {@inheritDoc} */
	@Override
	public float lenTo(float[] v)
	{
		return VecUtils3F.lenTo(this.v, v);
	}
	
	/** {@inheritDoc} */
	@Override
	public float lenTo(float x, float y, float z)
	{
		return VecUtils3F.lenTo(this.v, x, y, z);
	}
	
	/** {@inheritDoc} */
	@Override
	public float lenTo(float tolerance, ITup3RF v)
	{
		return VecUtils3F.lenTo(tolerance, this.v, v);
	}

	/** {@inheritDoc} */
	@Override
	public float lenTo(float tolerance, ITupRF v)
	{
		return VecUtils3F.lenTo(tolerance, this.v, v);
	}

	/** {@inheritDoc} */
	@Override
	public float lenTo(float tolerance, float[] v)
	{
		return VecUtils3F.lenTo(tolerance, this.v, v);
	}

	/** {@inheritDoc} */
	@Override
	public float lenTo(float tolerance, float x, float y, float z)
	{
		return VecUtils3F.lenTo(tolerance, this.v, x, y, z);
	}

	/** {@inheritDoc} */
	@Override
	public float lenRcTo(ITup3RF v)
	{
		return VecUtils3F.lenRcTo(this.v, v);
	}

	/** {@inheritDoc} */
	@Override
	public float lenRcTo(ITupRF v)
	{
		return VecUtils3F.lenRcTo(this.v, v);
	}
	
	/** {@inheritDoc} */
	@Override
	public float lenRcTo(float[] v)
	{
		return VecUtils3F.lenRcTo(this.v, v);
	}

	/** {@inheritDoc} */
	@Override
	public float lenRcTo(float x, float y, float z)
	{
		return VecUtils3F.lenRcTo(this.v, x, y, z);
	}

	/** {@inheritDoc} */
	@Override
	public float lenSq()
	{
		return VecUtils3F.lenSq(this.v);
	}

	/** {@inheritDoc} */
	@Override
	public float lenSqTo(ITup3RF v)
	{
		return VecUtils3F.lenSqTo(this.v, v);
	}

	/** {@inheritDoc} */
	@Override
	public float lenSqTo(ITupRF v)
	{
		return VecUtils3F.lenSqTo(this.v, v);
	}
	
	/** {@inheritDoc} */
	@Override
	public float lenSqTo(float[] v)
	{
		return VecUtils3F.lenSqTo(this.v, v);
	}

	/** {@inheritDoc} */
	@Override
	public float lenSqTo(float x, float y, float z)
	{
		return VecUtils3F.lenSqTo(this.v, x, y, z);
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
		return VecUtils3F.dot(this.v, v);
	}

	/** {@inheritDoc} */
	@Override
	public float dot(float x, float y, float z)
	{
		return VecUtils3F.dot(this.v, x, y, z);
	}
	
	/** {@inheritDoc} */
	@Override
	public Vec3F vecTo(ITup3RF v)
	{
		VecUtils3F.sub(v, this.v, this.v);
		
		return this;
	}

	/** {@inheritDoc} */
	@Override
	public Vec3F vecTo(ITupRF v)
	{
		VecUtils3F.sub(v, this.v, this.v);
		
		return this;
	}
	
	/** {@inheritDoc} */
	@Override
	public Vec3F vecTo(float[] v)
	{
		VecUtils3F.sub(v, this.v, this.v);
		
		return this;
	}

	/** {@inheritDoc} */
	@Override
	public Vec3F vecTo(float x, float y, float z)
	{
		VecUtils3F.sub(x, y, z, this.v, this.v);
		
		return this;
	}
	
	/** {@inheritDoc} */
	@Override
	public Vec3F vecToN(ITup3RF v)
	{
		return VecUtils3F.subFunc(v, this.v, CTOR);
	}

	/** {@inheritDoc} */
	@Override
	public Vec3F vecToN(ITupRF v)
	{
		return VecUtils3F.subFunc(v, this.v, CTOR);
	}
	
	/** {@inheritDoc} */
	@Override
	public Vec3F vecToN(float[] v)
	{
		return VecUtils3F.subFunc(v, this.v, CTOR);
	}

	/** {@inheritDoc} */
	@Override
	public Vec3F vecToN(float x, float y, float z)
	{
		return VecUtils3F.subFunc(x, y, z, this.v, CTOR);
	}
	
	/** {@inheritDoc} */
	@Override
	public float[] vecToT(ITup3RF v, float[] res)
	{
		return VecUtils3F.sub(v, this.v, res);
	}
	
	/** {@inheritDoc} */
	@Override
	public float[] vecToT(ITupRF v, float[] res)
	{
		return VecUtils3F.sub(v, this.v, res);
	}
	
	/** {@inheritDoc} */
	@Override
	public float[] vecToT(float[] v, float[] res)
	{
		return VecUtils3F.sub(v, this.v, res);
	}
	
	/** {@inheritDoc} */
	@Override
	public float[] vecToT(float x, float y, float z, float[] res)
	{
		return VecUtils3F.sub(x, y, z, this.v, res);
	}
	
	/** {@inheritDoc} */
	@Override
	public <T extends ITup3WF> T vecToT(ITup3RF v, T res)
	{
		return VecUtils3F.sub(v, this.v, res);
	}

	/** {@inheritDoc} */
	@Override
	public <T extends ITup3WF> T vecToT(ITupRF v, T res)
	{
		return VecUtils3F.sub(v, this.v, res);
	}
	
	/** {@inheritDoc} */
	@Override
	public <T extends ITup3WF> T vecToT(float[] v, T res)
	{
		return VecUtils3F.sub(v, this.v, res);
	}

	/** {@inheritDoc} */
	@Override
	public <T extends ITup3WF> T vecToT(float x, float y, float z, T res)
	{
		return VecUtils3F.sub(x, y, z, this.v, res);
	}
	
	/** {@inheritDoc} */
	@Override
	public Vec3F halfVecTo(ITup3RF v)
	{
		VecUtils3F.halfVecTo(this.v, v, this.v);
		
		return this;
	}

	/** {@inheritDoc} */
	@Override
	public Vec3F halfVecTo(ITupRF v)
	{
		VecUtils3F.halfVecTo(this.v, v, this.v);
		
		return this;
	}
	
	/** {@inheritDoc} */
	@Override
	public Vec3F halfVecTo(float[] v)
	{
		VecUtils3F.halfVecTo(this.v, v, this.v);
		
		return this;
	}

	/** {@inheritDoc} */
	@Override
	public Vec3F halfVecTo(float x, float y, float z)
	{
		VecUtils3F.halfVecTo(this.v, x, y, z, this.v);
		
		return this;
	}
	
	/** {@inheritDoc} */
	@Override
	public Vec3F halfVecToN(ITup3RF v)
	{
		return VecUtils3F.halfVecToFunc(this.v, v, CTOR);
	}

	/** {@inheritDoc} */
	@Override
	public Vec3F halfVecToN(ITupRF v)
	{
		return VecUtils3F.halfVecToFunc(this.v, v, CTOR);
	}
	
	/** {@inheritDoc} */
	@Override
	public Vec3F halfVecToN(float[] v)
	{
		return VecUtils3F.halfVecToFunc(this.v, v, CTOR);
	}

	/** {@inheritDoc} */
	@Override
	public Vec3F halfVecToN(float x, float y, float z)
	{
		return VecUtils3F.halfVecToFunc(this.v, x, y, z, CTOR);
	}
	
	/** {@inheritDoc} */
	@Override
	public float[] halfVecToT(ITup3RF v, float[] res)
	{
		return VecUtils3F.halfVecTo(this.v, v, res);
	}
	
	/** {@inheritDoc} */
	@Override
	public float[] halfVecToT(ITupRF v, float[] res)
	{
		return VecUtils3F.halfVecTo(this.v, v, res);
	}
	
	/** {@inheritDoc} */
	@Override
	public float[] halfVecToT(float[] v, float[] res)
	{
		return VecUtils3F.halfVecTo(this.v, v, res);
	}
	
	/** {@inheritDoc} */
	@Override
	public float[] halfVecToT(float x, float y, float z, float[] res)
	{
		return VecUtils3F.halfVecTo(this.v, x, y, z, res);
	}
	
	/** {@inheritDoc} */
	@Override
	public <T extends ITup3WF> T halfVecToT(ITup3RF v, T res)
	{
		return VecUtils3F.halfVecTo(this.v, v, res);
	}

	/** {@inheritDoc} */
	@Override
	public <T extends ITup3WF> T halfVecToT(ITupRF v, T res)
	{
		return VecUtils3F.halfVecTo(this.v, v, res);
	}
	
	/** {@inheritDoc} */
	@Override
	public <T extends ITup3WF> T halfVecToT(float[] v, T res)
	{
		return VecUtils3F.halfVecTo(this.v, v, res);
	}

	/** {@inheritDoc} */
	@Override
	public <T extends ITup3WF> T halfVecToT(float x, float y, float z, T res)
	{
		return VecUtils3F.halfVecTo(this.v, x, y, z, res);
	}

	/** {@inheritDoc} */
	@Override
	public Vec3F midPointTo(ITup3RF v)
	{
		VecUtils3F.midPointTo(this.v, v, this.v);
		
		return this;
	}

	/** {@inheritDoc} */
	@Override
	public Vec3F midPointTo(ITupRF v)
	{
		VecUtils3F.midPointTo(this.v, v, this.v);
		
		return this;
	}
	
	/** {@inheritDoc} */
	@Override
	public Vec3F midPointTo(float[] v)
	{
		VecUtils3F.midPointTo(this.v, v, this.v);
		
		return this;
	}

	/** {@inheritDoc} */
	@Override
	public Vec3F midPointTo(float x, float y, float z)
	{
		VecUtils3F.midPointTo(this.v, x, y, z, this.v);
		
		return this;
	}
	
	/** {@inheritDoc} */
	@Override
	public Vec3F midPointToN(ITup3RF v)
	{
		return VecUtils3F.midPointToFunc(this.v, v, CTOR);
	}

	/** {@inheritDoc} */
	@Override
	public Vec3F midPointToN(ITupRF v)
	{
		return VecUtils3F.midPointToFunc(this.v, v, CTOR);
	}
	
	/** {@inheritDoc} */
	@Override
	public Vec3F midPointToN(float[] v)
	{
		return VecUtils3F.midPointToFunc(this.v, v, CTOR);
	}

	/** {@inheritDoc} */
	@Override
	public Vec3F midPointToN(float x, float y, float z)
	{
		return VecUtils3F.midPointToFunc(this.v, x, y, z, CTOR);
	}
	
	/** {@inheritDoc} */
	@Override
	public float[] midPointToT(ITup3RF v, float[] res)
	{
		return VecUtils3F.midPointTo(this.v, v, res);
	}

	/** {@inheritDoc} */
	@Override
	public float[] midPointToT(ITupRF v, float[] res)
	{
		return VecUtils3F.midPointTo(this.v, v, res);
	}
	
	/** {@inheritDoc} */
	@Override
	public float[] midPointToT(float[] v, float[] res)
	{
		return VecUtils3F.midPointTo(this.v, v, res);
	}
	
	/** {@inheritDoc} */
	@Override
	public float[] midPointToT(float x, float y, float z, float[] res)
	{
		return VecUtils3F.midPointTo(this.v, x, y, z, res);
	}
	
	/** {@inheritDoc} */
	@Override
	public <T extends ITup3WF> T midPointToT(ITup3RF v, T res)
	{
		return VecUtils3F.midPointTo(this.v, v, res);
	}

	/** {@inheritDoc} */
	@Override
	public <T extends ITup3WF> T midPointToT(ITupRF v, T res)
	{
		return VecUtils3F.midPointTo(this.v, v, res);
	}
	
	/** {@inheritDoc} */
	@Override
	public <T extends ITup3WF> T midPointToT(float[] v, T res)
	{
		return VecUtils3F.midPointTo(this.v, v, res);
	}

	/** {@inheritDoc} */
	@Override
	public <T extends ITup3WF> T midPointToT(float x, float y, float z, T res)
	{
		return VecUtils3F.midPointTo(this.v, x, y, z, res);
	}

	/** {@inheritDoc} */
	@Override
	public Vec3F neg()
	{
		VecUtils3F.neg(this.v, this.v);
		
		return this;
	}
	
	/** {@inheritDoc} */
	@Override
	public Vec3F negN()
	{
		return VecUtils3F.negFunc(this.v, CTOR);
	}
	
	/** {@inheritDoc} */
	@Override
	public float[] negT(float[] res)
	{
		return VecUtils3F.neg(this.v, res);
	}
	
	/** {@inheritDoc} */
	@Override
	public <T extends ITup3WF> T negT(T res)
	{
		return VecUtils3F.neg(this.v, res);
	}

	/** {@inheritDoc} */
	@Override
	public Vec3F rec()
	{
		VecUtils3F.rec(this.v, this.v);
		
		return this;
	}
	
	/** {@inheritDoc} */
	@Override
	public Vec3F recN()
	{
		return VecUtils3F.recFunc(this.v, CTOR);
	}
	
	/** {@inheritDoc} */
	@Override
	public float[] recT(float[] res)
	{
		return VecUtils3F.rec(this.v, res);
	}
	
	/** {@inheritDoc} */
	@Override
	public <T extends ITup3WF> T recT(T res)
	{
		return VecUtils3F.rec(this.v, res);
	}

	/** {@inheritDoc} */
	@Override
	public Vec3F nrm()
	{
		VecUtils3F.nrm(this.v, this.v);
		
		return this;
	}
	
	/** {@inheritDoc} */
	@Override
	public Vec3F nrmN()
	{
		return VecUtils3F.nrmFunc(this.v, CTOR);
	}
	
	/** {@inheritDoc} */
	@Override
	public float[] nrmT(float[] res)
	{
		return VecUtils3F.nrm(this.v, res);
	}
	
	/** {@inheritDoc} */
	@Override
	public <T extends ITup3WF> T nrmT(T res)
	{
		return VecUtils3F.nrm(this.v, res);
	}

	/** {@inheritDoc} */
	@Override
	public Vec3F project(ITup3RF v)
	{
		VecUtils3F.project(this.v, v, this.v);
		
		return this;
	}

	/** {@inheritDoc} */
	@Override
	public Vec3F project(ITupRF v)
	{
		VecUtils3F.project(this.v, v, this.v);
		
		return this;
	}
	
	/** {@inheritDoc} */
	@Override
	public Vec3F project(float[] v)
	{
		VecUtils3F.project(this.v, v, this.v);
		
		return this;
	}

	/** {@inheritDoc} */
	@Override
	public Vec3F project(float tX, float tY, float tZ)
	{
		VecUtils3F.project(this.v, tX, tY, tZ, this.v);
		
		return this;
	}
	
	/** {@inheritDoc} */
	@Override
	public Vec3F projectN(ITup3RF t)
	{
		return VecUtils3F.projectFunc(this.v, t, CTOR);
	}

	/** {@inheritDoc} */
	@Override
	public Vec3F projectN(ITupRF t)
	{
		return VecUtils3F.projectFunc(this.v, t, CTOR);
	}
	
	/** {@inheritDoc} */
	@Override
	public Vec3F projectN(float[] t)
	{
		return VecUtils3F.projectFunc(this.v, t, CTOR);
	}

	/** {@inheritDoc} */
	@Override
	public Vec3F projectN(float tX, float tY, float tZ)
	{
		return VecUtils3F.projectFunc(this.v, tX, tY, tZ, CTOR);
	}
	
	/** {@inheritDoc} */
	@Override
	public float[] projectT(ITup3RF t, float[] res)
	{
		return VecUtils3F.project(this.v, t, res);
	}

	/** {@inheritDoc} */
	@Override
	public float[] projectT(ITupRF t, float[] res)
	{
		return VecUtils3F.project(this.v, t, res);
	}
	
	/** {@inheritDoc} */
	@Override
	public float[] projectT(float[] t, float[] res)
	{
		return VecUtils3F.project(this.v, t, res);
	}

	/** {@inheritDoc} */
	@Override
	public float[] projectT(float tX, float tY, float tZ, float[] res)
	{
		return VecUtils3F.project(this.v, tX, tY, tZ, res);
	}
	
	/** {@inheritDoc} */
	@Override
	public <T extends ITup3WF> T projectT(ITup3RF t, T res)
	{
		return VecUtils3F.project(this.v, t, res);
	}

	/** {@inheritDoc} */
	@Override
	public <T extends ITup3WF> T projectT(ITupRF t, T res)
	{
		return VecUtils3F.project(this.v, t, res);
	}
	
	/** {@inheritDoc} */
	@Override
	public <T extends ITup3WF> T projectT(float[] t, T res)
	{
		return VecUtils3F.project(this.v, t, res);
	}

	/** {@inheritDoc} */
	@Override
	public <T extends ITup3WF> T projectT(float tX, float tY, float tZ, T res)
	{
		return VecUtils3F.project(this.v, tX, tY, tZ, res);
	}

	/** {@inheritDoc} */
	@Override
	public Vec3F reflect(ITup3RF n)
	{
		VecUtils3F.reflect(this.v, n, this.v);
		
		return this;
	}

	/** {@inheritDoc} */
	@Override
	public Vec3F reflect(ITupRF n)
	{
		VecUtils3F.reflect(this.v, n, this.v);
		
		return this;
	}
	
	/** {@inheritDoc} */
	@Override
	public Vec3F reflect(float[] n)
	{
		VecUtils3F.reflect(this.v, n, this.v);
		
		return this;
	}

	/** {@inheritDoc} */
	@Override
	public Vec3F reflect(float nX, float nY, float nZ)
	{
		VecUtils3F.reflect(this.v, nX, nY, nZ, this.v);
		
		return this;
	}
	
	/** {@inheritDoc} */
	@Override
	public Vec3F reflectN(ITup3RF n)
	{
		return VecUtils3F.reflectFunc(this.v, n, CTOR);
	}

	/** {@inheritDoc} */
	@Override
	public Vec3F reflectN(ITupRF n)
	{
		return VecUtils3F.reflectFunc(this.v, n, CTOR);
	}
	
	/** {@inheritDoc} */
	@Override
	public Vec3F reflectN(float[] n)
	{
		return VecUtils3F.reflectFunc(this.v, n, CTOR);
	}

	/** {@inheritDoc} */
	@Override
	public Vec3F reflectN(float nX, float nY, float nZ)
	{
		return VecUtils3F.reflectFunc(this.v, nX, nY, nZ, CTOR);
	}
	
	/** {@inheritDoc} */
	@Override
	public float[] reflectT(ITup3RF n, float[] res)
	{
		return VecUtils3F.reflect(this.v, n, res);
	}

	/** {@inheritDoc} */
	@Override
	public float[] reflectT(ITupRF n, float[] res)
	{
		return VecUtils3F.reflect(this.v, n, res);
	}
	
	/** {@inheritDoc} */
	@Override
	public float[] reflectT(float[] n, float[] res)
	{
		return VecUtils3F.reflect(this.v, n, res);
	}

	/** {@inheritDoc} */
	@Override
	public float[] reflectT(float nX, float nY, float nZ, float[] res)
	{
		return VecUtils3F.reflect(this.v, nX, nY, nZ, res);
	}
	
	/** {@inheritDoc} */
	@Override
	public <T extends ITup3WF> T reflectT(ITup3RF n, T res)
	{
		return VecUtils3F.reflect(this.v, n, res);
	}

	/** {@inheritDoc} */
	@Override
	public <T extends ITup3WF> T reflectT(ITupRF n, T res)
	{
		return VecUtils3F.reflect(this.v, n, res);
	}
	
	/** {@inheritDoc} */
	@Override
	public <T extends ITup3WF> T reflectT(float[] n, T res)
	{
		return VecUtils3F.reflect(this.v, n, res);
	}

	/** {@inheritDoc} */
	@Override
	public <T extends ITup3WF> T reflectT(float nX, float nY, float nZ, T res)
	{
		return VecUtils3F.reflect(this.v, nX, nY, nZ, res);
	}

	/** {@inheritDoc} */
	@Override
	public Vec3F abs()
	{
		VecUtils3F.abs(this.v, this.v);
		
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
	public float[] absT(float[] res)
	{
		return VecUtils3F.abs(this.v, res);
	}
	
	/** {@inheritDoc} */
	@Override
	public <T extends ITup3WF> T absT(T res)
	{
		return VecUtils3F.abs(this.v, res);
	}

	/** {@inheritDoc} */
	@Override
	public Vec3F sign()
	{
		VecUtils3F.sign(this.v, this.v);
		
		return this;
	}

	/** {@inheritDoc} */
	@Override
	public Vec3F signN()
	{
		return VecUtils3F.signFunc(this.v, CTOR);
	}

	/** {@inheritDoc} */
	@Override
	public float[] signT(float[] res)
	{
		return VecUtils3F.sign(this.v, res);
	}
	
	/** {@inheritDoc} */
	@Override
	public <T extends ITup3WF> T signT(T res)
	{
		return VecUtils3F.sign(this.v, res);
	}

	/** {@inheritDoc} */
	@Override
	public boolean isFiniteAt(int index)
	{
		return TupUtils3F.isFiniteAt(index, this.v);
	}

	/** {@inheritDoc} */
	@Override
	public boolean isFiniteAtV0()
	{
		return TupUtils3F.isFiniteAtV0(this.v);
	}

	/** {@inheritDoc} */
	@Override
	public boolean isFiniteAtV1()
	{
		return TupUtils3F.isFiniteAtV1(this.v);
	}

	/** {@inheritDoc} */
	@Override
	public boolean isFiniteAtV2()
	{
		return TupUtils3F.isFiniteAtV2(this.v);
	}
	
	/** {@inheritDoc} */
	@Override
	public boolean isZeroAt(int index)
	{
		return TupUtils3F.isZeroAt(index, this.v);
	}

	/** {@inheritDoc} */
	@Override
	public boolean isZeroAtV0()
	{
		return TupUtils3F.isZeroAtV0(this.v);
	}

	/** {@inheritDoc} */
	@Override
	public boolean isZeroAtV1()
	{
		return TupUtils3F.isZeroAtV1(this.v);
	}

	/** {@inheritDoc} */
	@Override
	public boolean isZeroAtV2()
	{
		return TupUtils3F.isZeroAtV2(this.v);
	}
	
	/** {@inheritDoc} */
	@Override
	public boolean isZeroAt(float tolerance, int index)
	{
		return TupUtils3F.isZeroAt(tolerance, index, this.v);
	}
	
	/** {@inheritDoc} */
	@Override
	public boolean isZeroAtV0(float tolerance)
	{
		return TupUtils3F.isZeroAtV0(tolerance, this.v);
	}

	/** {@inheritDoc} */
	@Override
	public boolean isZeroAtV1(float tolerance)
	{
		return TupUtils3F.isZeroAtV1(tolerance, this.v);
	}

	/** {@inheritDoc} */
	@Override
	public boolean isZeroAtV2(float tolerance)
	{
		return TupUtils3F.isZeroAtV2(tolerance, this.v);
	}
	
	/** {@inheritDoc} */
	@Override
	public boolean equals(ITup3RF v)
	{
		return TupUtils3F.equals(this.v, v);
	}

	/** {@inheritDoc} */
	@Override
	public boolean equals(ITupRF v)
	{
		return TupUtils3F.equals(this.v, v);
	}

	/** {@inheritDoc} */
	@Override
	public boolean equals(float[] v)
	{
		return TupUtils3F.equals(this.v, v);
	}

	/** {@inheritDoc} */
	@Override
	public boolean equals(float x, float y, float z)
	{
		return TupUtils3F.equals(this.v, x, y, z);
	}

	/** {@inheritDoc} */
	@Override
	public boolean equals(float tolerance, ITup3RF v)
	{
		return TupUtils3F.equals(tolerance, this.v, v);
	}

	/** {@inheritDoc} */
	@Override
	public boolean equals(float tolerance, ITupRF v)
	{
		return TupUtils3F.equals(tolerance, this.v, v);
	}

	/** {@inheritDoc} */
	@Override
	public boolean equals(float tolerance, float[] v)
	{
		return TupUtils3F.equals(tolerance, this.v, v);
	}

	/** {@inheritDoc} */
	@Override
	public boolean equals(float tolerance, float x, float y, float z)
	{
		return TupUtils3F.equals(tolerance, this.v, x, y, z);
	}

	/** {@inheritDoc} */
	@Override
	public boolean equalsAt(int index, ITup3RF v)
	{
		return TupUtils3F.equalsAt(index, this.v, v);
	}

	/** {@inheritDoc} */
	@Override
	public boolean equalsAt(int index, ITupRF v)
	{
		return TupUtils3F.equalsAt(index, this.v, v);
	}

	/** {@inheritDoc} */
	@Override
	public boolean equalsAt(int index, float[] v)
	{
		return TupUtils3F.equalsAt(index, this.v, v);
	}

	/** {@inheritDoc} */
	@Override
	public boolean equalsAt(int index, float value)
	{
		return TupUtils3F.equalsAt(index, this.v, value);
	}

	/** {@inheritDoc} */
	@Override
	public boolean equalsAt(float tolerance, int index, ITup3RF v)
	{
		return TupUtils3F.equalsAt(tolerance, index, this.v, v);
	}

	/** {@inheritDoc} */
	@Override
	public boolean equalsAt(float tolerance, int index, ITupRF v)
	{
		return TupUtils3F.equalsAt(tolerance, index, this.v, v);
	}

	/** {@inheritDoc} */
	@Override
	public boolean equalsAt(float tolerance, int index, float[] v)
	{
		return TupUtils3F.equalsAt(tolerance, index, this.v, v);
	}

	/** {@inheritDoc} */
	@Override
	public boolean equalsAt(float tolerance, int index, float value)
	{
		return TupUtils3F.equalsAt(tolerance, index, this.v, value);
	}

	/** {@inheritDoc} */
	@Override
	public boolean equalsAtV0(ITup3RF v)
	{
		return TupUtils3F.equalsAtV0(this.v, v);
	}

	/** {@inheritDoc} */
	@Override
	public boolean equalsAtV0(ITupRF v)
	{
		return TupUtils3F.equalsAtV0(this.v, v);
	}

	/** {@inheritDoc} */
	@Override
	public boolean equalsAtV0(float[] v)
	{
		return TupUtils3F.equalsAtV0(this.v, v);
	}

	/** {@inheritDoc} */
	@Override
	public boolean equalsAtV0(float value)
	{
		return TupUtils3F.equalsAtV0(this.v, value);
	}

	/** {@inheritDoc} */
	@Override
	public boolean equalsAtV1(ITup3RF v)
	{
		return TupUtils3F.equalsAtV1(this.v, v);
	}

	/** {@inheritDoc} */
	@Override
	public boolean equalsAtV1(ITupRF v)
	{
		return TupUtils3F.equalsAtV1(this.v, v);
	}

	/** {@inheritDoc} */
	@Override
	public boolean equalsAtV1(float[] v)
	{
		return TupUtils3F.equalsAtV1(this.v, v);
	}

	/** {@inheritDoc} */
	@Override
	public boolean equalsAtV1(float value)
	{
		return TupUtils3F.equalsAtV1(this.v, value);
	}

	/** {@inheritDoc} */
	@Override
	public boolean equalsAtV2(ITup3RF v)
	{
		return TupUtils3F.equalsAtV2(this.v, v);
	}

	/** {@inheritDoc} */
	@Override
	public boolean equalsAtV2(ITupRF v)
	{
		return TupUtils3F.equalsAtV2(this.v, v);
	}

	/** {@inheritDoc} */
	@Override
	public boolean equalsAtV2(float[] v)
	{
		return TupUtils3F.equalsAtV2(this.v, v);
	}

	/** {@inheritDoc} */
	@Override
	public boolean equalsAtV2(float value)
	{
		return TupUtils3F.equalsAtV2(this.v, value);
	}
	
	/** {@inheritDoc} */
	@Override
	public boolean equalsAtV0(float tolerance, ITup3RF v)
	{
		return TupUtils3F.equalsAtV0(tolerance, this.v, v);
	}

	/** {@inheritDoc} */
	@Override
	public boolean equalsAtV0(float tolerance, ITupRF v)
	{
		return TupUtils3F.equalsAtV0(tolerance, this.v, v);
	}

	/** {@inheritDoc} */
	@Override
	public boolean equalsAtV0(float tolerance, float[] v)
	{
		return TupUtils3F.equalsAtV0(tolerance, this.v, v);
	}

	/** {@inheritDoc} */
	@Override
	public boolean equalsAtV0(float tolerance, float value)
	{
		return TupUtils3F.equalsAtV0(tolerance, this.v, value);
	}

	/** {@inheritDoc} */
	@Override
	public boolean equalsAtV1(float tolerance, ITup3RF v)
	{
		return TupUtils3F.equalsAtV1(tolerance, this.v, v);
	}

	/** {@inheritDoc} */
	@Override
	public boolean equalsAtV1(float tolerance, ITupRF v)
	{
		return TupUtils3F.equalsAtV1(tolerance, this.v, v);
	}

	/** {@inheritDoc} */
	@Override
	public boolean equalsAtV1(float tolerance, float[] v)
	{
		return TupUtils3F.equalsAtV1(tolerance, this.v, v);
	}

	/** {@inheritDoc} */
	@Override
	public boolean equalsAtV1(float tolerance, float value)
	{
		return TupUtils3F.equalsAtV1(tolerance, this.v, value);
	}

	/** {@inheritDoc} */
	@Override
	public boolean equalsAtV2(float tolerance, ITup3RF v)
	{
		return TupUtils3F.equalsAtV2(tolerance, this.v, v);
	}

	/** {@inheritDoc} */
	@Override
	public boolean equalsAtV2(float tolerance, ITupRF v)
	{
		return TupUtils3F.equalsAtV2(tolerance, this.v, v);
	}

	/** {@inheritDoc} */
	@Override
	public boolean equalsAtV2(float tolerance, float[] v)
	{
		return TupUtils3F.equalsAtV2(tolerance, this.v, v);
	}

	/** {@inheritDoc} */
	@Override
	public boolean equalsAtV2(float tolerance, float value)
	{
		return TupUtils3F.equalsAtV2(tolerance, this.v, value);
	}
	
	/** {@inheritDoc} */
	@Override
	public Vec3F swizzle(int[] indices)
	{
		VecUtils3F.swizzle(this.v, indices, this.v);
		
		return this;
	}
	
	/** {@inheritDoc} */
	@Override
	public Vec3F swizzleN(int[] indices)
	{
		return VecUtils3F.swizzleFunc(this.v, indices, CTOR);
	}
	
	/** {@inheritDoc} */
	@Override
	public float[] swizzleT(int[] indices, float[] res)
	{
		return VecUtils3F.swizzle(this.v, indices, res);
	}
	
	/** {@inheritDoc} */
	@Override
	public <T extends ITup3WF> T swizzleT(int[] indices, T res)
	{
		return VecUtils3F.swizzle(this.v, indices, res);
	}
	
	/** {@inheritDoc} */
	@Override
	public Vec3F swizzle(int indexX, int indexY, int indexZ)
	{
		VecUtils3F.swizzle(this.v, indexX, indexY, indexZ, this.v);
		
		return this;
	}
	
	/** {@inheritDoc} */
	@Override
	public Vec3F swizzleN(int indexX, int indexY, int indexZ)
	{
		return VecUtils3F.swizzleFunc(this.v, indexX, indexY, indexZ, CTOR);
	}
	
	/** {@inheritDoc} */
	@Override
	public float[] swizzleT(int indexX, int indexY, int indexZ, float[] res)
	{
		return VecUtils3F.swizzle(this.v, indexX, indexY, indexZ, res);
	}
	
	/** {@inheritDoc} */
	@Override
	public <T extends ITup3WF> T swizzleT(int indexX, int indexY, int indexZ, T res)
	{
		return VecUtils3F.swizzle(this.v, indexX, indexY, indexZ, res);
	}

	/** {@inheritDoc} */
	@Override
	public Vec3F swap(int indexA, int indexB)
	{
		VecUtils3F.swap(this.v, indexA, indexB, this.v);
		
		return this;
	}
	
	/** {@inheritDoc} */
	@Override
	public Vec3F swapN(int indexA, int indexB)
	{
		return VecUtils3F.swapFunc(this.v, indexA, indexB, CTOR);
	}
	
	/** {@inheritDoc} */
	@Override
	public float[] swapT(int indexA, int indexB, float[] res)
	{
		return VecUtils3F.swap(this.v, indexA, indexB, res);
	}
	
	/** {@inheritDoc} */
	@Override
	public <T extends ITup3WF> T swapT(int indexA, int indexB, T res)
	{
		return VecUtils3F.swap(this.v, indexA, indexB, res);
	}
	
	/** {@inheritDoc} */
	@Override
	public Vec3F swapV0V1()
	{
		VecUtils3F.swapV0V1(this.v, this.v);
		
		return this;
	}
	
	/** {@inheritDoc} */
	@Override
	public Vec3F swapV0V2()
	{
		VecUtils3F.swapV0V2(this.v, this.v);
		
		return this;
	}
	
	/** {@inheritDoc} */
	@Override
	public Vec3F swapV1V2()
	{
		VecUtils3F.swapV1V2(this.v, this.v);
		
		return this;
	}
	
	/** {@inheritDoc} */
	@Override
	public Vec3F swapV0V1N()
	{
		return VecUtils3F.swapV0V1Func(this.v, CTOR);
	}
	
	/** {@inheritDoc} */
	@Override
	public Vec3F swapV0V2N()
	{
		return VecUtils3F.swapV0V2Func(this.v, CTOR);
	}
	
	/** {@inheritDoc} */
	@Override
	public Vec3F swapV1V2N()
	{
		return VecUtils3F.swapV1V2Func(this.v, CTOR);
	}
	
	/** {@inheritDoc} */
	@Override
	public float[] swapV0V1T(float[] res)
	{
		return VecUtils3F.swapV0V1(this.v, res);
	}
	
	/** {@inheritDoc} */
	@Override
	public float[] swapV0V2T(float[] res)
	{
		return VecUtils3F.swapV0V2(this.v, res);
	}
	
	/** {@inheritDoc} */
	@Override
	public float[] swapV1V2T(float[] res)
	{
		return VecUtils3F.swapV1V2(this.v, res);
	}
	
	/** {@inheritDoc} */
	@Override
	public <T extends ITup3WF> T swapV0V1T(T res)
	{
		return VecUtils3F.swapV0V1(this.v, res);
	}

	/** {@inheritDoc} */
	@Override
	public <T extends ITup3WF> T swapV0V2T(T res)
	{
		return VecUtils3F.swapV0V2(this.v, res);
	}
	
	/** {@inheritDoc} */
	@Override
	public <T extends ITup3WF> T swapV1V2T(T res)
	{
		return VecUtils3F.swapV1V2(this.v, res);
	}
	
	/** {@inheritDoc} */
	@Override
	public Vec3F swapXY()
	{
		VecUtils3F.swapV0V1(this.v, this.v);
		
		return this;
	}
	
	/** {@inheritDoc} */
	@Override
	public Vec3F swapXZ()
	{
		VecUtils3F.swapV0V2(this.v, this.v);
		
		return this;
	}
	
	/** {@inheritDoc} */
	@Override
	public Vec3F swapYZ()
	{
		VecUtils3F.swapV1V2(this.v, this.v);
		
		return this;
	}
	
	/** {@inheritDoc} */
	@Override
	public Vec3F swapXYN()
	{
		return VecUtils3F.swapV0V1Func(this.v, CTOR);
	}
	
	/** {@inheritDoc} */
	@Override
	public Vec3F swapXZN()
	{
		return VecUtils3F.swapV0V2Func(this.v, CTOR);
	}
	
	/** {@inheritDoc} */
	@Override
	public Vec3F swapYZN()
	{
		return VecUtils3F.swapV1V2Func(this.v, CTOR);
	}
	
	/** {@inheritDoc} */
	@Override
	public float[] swapXYT(float[] res)
	{
		return VecUtils3F.swapV0V1(this.v, res);
	}
	
	/** {@inheritDoc} */
	@Override
	public float[] swapXZT(float[] res)
	{
		return VecUtils3F.swapV0V2(this.v, res);
	}
	
	/** {@inheritDoc} */
	@Override
	public float[] swapYZT(float[] res)
	{
		return VecUtils3F.swapV1V2(this.v, res);
	}
	
	/** {@inheritDoc} */
	@Override
	public <T extends ITup3WF> T swapXYT(T res)
	{
		return VecUtils3F.swapV0V1(this.v, res);
	}

	/** {@inheritDoc} */
	@Override
	public <T extends ITup3WF> T swapXZT(T res)
	{
		return VecUtils3F.swapV0V2(this.v, res);
	}
	
	/** {@inheritDoc} */
	@Override
	public <T extends ITup3WF> T swapYZT(T res)
	{
		return VecUtils3F.swapV1V2(this.v, res);
	}
	
	/** {@inheritDoc} */
	@Override
	public boolean isFinite()
	{
		return TupUtils3F.isFinite(this.v);
	}

	/** {@inheritDoc} */
	@Override
	public boolean isZero()
	{
		return TupUtils3F.isZero(this.v);
	}

	/** {@inheritDoc} */
	@Override
	public boolean isZero(float tolerance)
	{
		return TupUtils3F.isZero(tolerance, this.v);
	}

	/** {@inheritDoc} */
	@Override
	public Vec3F minComponents(ITup3RF v)
	{
		VecUtils3F.minComponents(this.v, v, this.v);
		
		return this;
	}
	
	/** {@inheritDoc} */
	@Override
	public Vec3F minComponents(ITupRF v)
	{
		VecUtils3F.minComponents(this.v, v, this.v);
		
		return this;
	}

	/** {@inheritDoc} */
	@Override
	public Vec3F minComponents(float[] v)
	{
		VecUtils3F.minComponents(this.v, v, this.v);
		
		return this;
	}
	
	/** {@inheritDoc} */
	@Override
	public Vec3F minComponents(float x, float y, float z)
	{
		VecUtils3F.minComponents(this.v, x, y, z, this.v);
		
		return this;
	}
	
	/** {@inheritDoc} */
	@Override
	public Vec3F minComponentsN(ITup3RF v)
	{
		return VecUtils3F.minComponentsFunc(this.v, v, CTOR);
	}

	/** {@inheritDoc} */
	@Override
	public Vec3F minComponentsN(ITupRF v)
	{
		return VecUtils3F.minComponentsFunc(this.v, v, CTOR);
	}

	/** {@inheritDoc} */
	@Override
	public Vec3F minComponentsN(float[] v)
	{
		return VecUtils3F.minComponentsFunc(this.v, v, CTOR);
	}
	
	/** {@inheritDoc} */
	@Override
	public Vec3F minComponentsN(float x, float y, float z)
	{
		return VecUtils3F.minComponentsFunc(this.v, x, y, z, CTOR);
	}
	
	/** {@inheritDoc} */
	@Override
	public float[] minComponentsT(ITup3RF v, float[] res)
	{
		return VecUtils3F.minComponents(this.v, v, res);
	}
	
	/** {@inheritDoc} */
	@Override
	public float[] minComponentsT(ITupRF v, float[] res)
	{
		return VecUtils3F.minComponents(this.v, v, res);
	}
	
	/** {@inheritDoc} */
	@Override
	public float[] minComponentsT(float[] v, float[] res)
	{
		return VecUtils3F.minComponents(this.v, v, res);
	}
	
	/** {@inheritDoc} */
	@Override
	public float[] minComponentsT(float x, float y, float z, float[] res)
	{
		return VecUtils3F.minComponents(this.v, x, y, z, res);
	}
	
	/** {@inheritDoc} */
	@Override
	public <T extends ITup3WF> T minComponentsT(ITup3RF v, T res)
	{
		return VecUtils3F.minComponents(this.v, v, res);
	}

	/** {@inheritDoc} */
	@Override
	public <T extends ITup3WF> T minComponentsT(ITupRF v, T res)
	{
		return VecUtils3F.minComponents(this.v, v, res);
	}

	/** {@inheritDoc} */
	@Override
	public <T extends ITup3WF> T minComponentsT(float[] v, T res)
	{
		return VecUtils3F.minComponents(this.v, v, res);
	}
	
	/** {@inheritDoc} */
	@Override
	public <T extends ITup3WF> T minComponentsT(float x, float y, float z, T res)
	{
		return VecUtils3F.minComponents(this.v, x, y, z, res);
	}
	
	/** {@inheritDoc} */
	@Override
	public <T> T minComponentsFunc(ITup3RF v, IFunc3F<T> func)
	{
		return VecUtils3F.minComponentsFunc(this.v, v, func);
	}

	/** {@inheritDoc} */
	@Override
	public <T> T minComponentsFunc(ITupRF v, IFunc3F<T> func)
	{
		return VecUtils3F.minComponentsFunc(this.v, v, func);
	}

	/** {@inheritDoc} */
	@Override
	public <T> T minComponentsFunc(float[] v, IFunc3F<T> func)
	{
		return VecUtils3F.minComponentsFunc(this.v, v, func);
	}
	
	/** {@inheritDoc} */
	@Override
	public <T> T minComponentsFunc(float x, float y, float z, IFunc3F<T> func)
	{
		return VecUtils3F.minComponentsFunc(this.v, x, y, z, func);
	}
	
	/** {@inheritDoc} */
	@Override
	public Vec3F maxComponents(ITup3RF v)
	{
		VecUtils3F.maxComponents(this.v, v, this.v);
		
		return this;
	}
	
	/** {@inheritDoc} */
	@Override
	public Vec3F maxComponents(ITupRF v)
	{
		VecUtils3F.maxComponents(this.v, v, this.v);
		
		return this;
	}
	
	/** {@inheritDoc} */
	@Override
	public Vec3F maxComponents(float[] v)
	{
		VecUtils3F.maxComponents(this.v, v, this.v);
		
		return this;
	}
	
	/** {@inheritDoc} */
	@Override
	public Vec3F maxComponents(float x, float y, float z)
	{
		VecUtils3F.maxComponents(this.v, x, y, z, this.v);
		
		return this;
	}
	
	/** {@inheritDoc} */
	@Override
	public Vec3F maxComponentsN(ITup3RF v)
	{
		return VecUtils3F.maxComponentsFunc(this.v, v, CTOR);
	}

	/** {@inheritDoc} */
	@Override
	public Vec3F maxComponentsN(ITupRF v)
	{
		return VecUtils3F.maxComponentsFunc(this.v, v, CTOR);
	}

	/** {@inheritDoc} */
	@Override
	public Vec3F maxComponentsN(float[] v)
	{
		return VecUtils3F.maxComponentsFunc(this.v, v, CTOR);
	}
	
	/** {@inheritDoc} */
	@Override
	public Vec3F maxComponentsN(float x, float y, float z)
	{
		return VecUtils3F.maxComponentsFunc(this.v, x, y, z, CTOR);
	}
	
	/** {@inheritDoc} */
	@Override
	public float[] maxComponentsT(ITup3RF v, float[] res)
	{
		return VecUtils3F.maxComponents(this.v, v, res);
	}

	/** {@inheritDoc} */
	@Override
	public float[] maxComponentsT(ITupRF v, float[] res)
	{
		return VecUtils3F.maxComponents(this.v, v, res);
	}

	/** {@inheritDoc} */
	@Override
	public float[] maxComponentsT(float[] v, float[] res)
	{
		return VecUtils3F.maxComponents(this.v, v, res);
	}
	
	/** {@inheritDoc} */
	@Override
	public float[] maxComponentsT(float x, float y, float z, float[] res)
	{
		return VecUtils3F.maxComponents(this.v, x, y, z, res);
	}
	
	/** {@inheritDoc} */
	@Override
	public <T extends ITup3WF> T maxComponentsT(ITup3RF v, T res)
	{
		return VecUtils3F.maxComponents(this.v, v, res);
	}

	/** {@inheritDoc} */
	@Override
	public <T extends ITup3WF> T maxComponentsT(ITupRF v, T res)
	{
		return VecUtils3F.maxComponents(this.v, v, res);
	}
	
	/** {@inheritDoc} */
	@Override
	public <T extends ITup3WF> T maxComponentsT(float[] v, T res)
	{
		return VecUtils3F.maxComponents(this.v, v, res);
	}
	
	/** {@inheritDoc} */
	@Override
	public <T extends ITup3WF> T maxComponentsT(float x, float y, float z, T res)
	{
		return VecUtils3F.maxComponents(this.v, x, y, z, res);
	}

	/** {@inheritDoc} */
	@Override
	public <T> T maxComponentsFunc(ITup3RF v, IFunc3F<T> func)
	{
		return VecUtils3F.maxComponentsFunc(this.v, v, func);
	}

	/** {@inheritDoc} */
	@Override
	public <T> T maxComponentsFunc(ITupRF v, IFunc3F<T> func)
	{
		return VecUtils3F.maxComponentsFunc(this.v, v, func);
	}

	/** {@inheritDoc} */
	@Override
	public <T> T maxComponentsFunc(float[] v, IFunc3F<T> func)
	{
		return VecUtils3F.maxComponentsFunc(this.v, v, func);
	}
	
	/** {@inheritDoc} */
	@Override
	public <T> T maxComponentsFunc(float x, float y, float z, IFunc3F<T> func)
	{
		return VecUtils3F.maxComponentsFunc(this.v, x, y, z, func);
	}
	
	/** {@inheritDoc} */
	@Override
	public IndexValuePairF min()
	{
		return VecUtils3F.min(this.v, new IndexValuePairF());
	}

	/** {@inheritDoc} */
	@Override
	public IndexValuePairF min(IndexValuePairF res)
	{
		return VecUtils3F.min(this.v, res);
	}

	/** {@inheritDoc} */
	@Override
	public IndexValuePairF max()
	{
		return VecUtils3F.max(this.v, new IndexValuePairF());
	}

	/** {@inheritDoc} */
	@Override
	public IndexValuePairF max(IndexValuePairF res)
	{
		return VecUtils3F.max(this.v, res);
	}
	
	/** {@inheritDoc} */
	@Override
	public IVec3WF cross(ITup3RF v)
	{
		return VecUtils3F.cross(this, v, this);
	}

	/** {@inheritDoc} */
	@Override
	public IVec3WF cross(ITupRF v)
	{
		return VecUtils3F.cross(this, v, this);
	}

	/** {@inheritDoc} */
	@Override
	public IVec3WF cross(float[] v)
	{
		return VecUtils3F.cross(this, v, this);
	}

	/** {@inheritDoc} */
	@Override
	public IVec3WF cross(float x, float y, float z)
	{
		return VecUtils3F.cross(this, x, y, z, this);
	}

	/** {@inheritDoc} */
	@Override
	public IVec3WF crossN(ITup3RF v)
	{
		return VecUtils3F.crossFunc(this, v, CTOR);
	}

	/** {@inheritDoc} */
	@Override
	public IVec3WF crossN(ITupRF v)
	{
		return VecUtils3F.crossFunc(this, v, CTOR);
	}

	/** {@inheritDoc} */
	@Override
	public IVec3WF crossN(float[] v)
	{
		return VecUtils3F.crossFunc(this, v, CTOR);
	}

	/** {@inheritDoc} */
	@Override
	public IVec3WF crossN(float x, float y, float z)
	{
		return VecUtils3F.crossFunc(this, x, y, z, CTOR);
	}
	
	/** {@inheritDoc} */
	@Override
	public float[] crossT(ITup3RF v, float[] res)
	{
		return VecUtils3F.cross(this, v, res);
	}

	/** {@inheritDoc} */
	@Override
	public float[] crossT(ITupRF v, float[] res)
	{
		return VecUtils3F.cross(this, v, res);
	}

	/** {@inheritDoc} */
	@Override
	public float[] crossT(float[] v, float[] res)
	{
		return VecUtils3F.cross(this, v, res);
	}

	/** {@inheritDoc} */
	@Override
	public float[] crossT(float x, float y, float z, float[] res)
	{
		return VecUtils3F.cross(this, x, y, z, res);
	}
	
	/** {@inheritDoc} */
	@Override
	public <T extends ITup3WF> T crossT(ITup3RF v, T res)
	{
		return VecUtils3F.cross(this, v, res);
	}

	/** {@inheritDoc} */
	@Override
	public <T extends ITup3WF> T crossT(ITupRF v, T res)
	{
		return VecUtils3F.cross(this, v, res);
	}

	/** {@inheritDoc} */
	@Override
	public <T extends ITup3WF> T crossT(float[] v, T res)
	{
		return VecUtils3F.cross(this, v, res);
	}

	/** {@inheritDoc} */
	@Override
	public <T extends ITup3WF> T crossT(float x, float y, float z, T res)
	{
		return VecUtils3F.cross(this, x, y, z, res);
	}

	/** {@inheritDoc} */
	@Override
	public IVec3WF rCross(ITup3RF v)
	{
		return VecUtils3F.cross(v, this, this);
	}

	/** {@inheritDoc} */
	@Override
	public IVec3WF rCross(ITupRF v)
	{
		return VecUtils3F.cross(v, this, this);
	}

	/** {@inheritDoc} */
	@Override
	public IVec3WF rCross(float[] v)
	{
		return VecUtils3F.cross(v, this, this);
	}

	/** {@inheritDoc} */
	@Override
	public IVec3WF rCross(float x, float y, float z)
	{
		return VecUtils3F.cross(x, y, z, this, this);
	}

	/** {@inheritDoc} */
	@Override
	public IVec3WF rCrossN(ITup3RF v)
	{
		return VecUtils3F.crossFunc(v, this, CTOR);
	}

	/** {@inheritDoc} */
	@Override
	public IVec3WF rCrossN(ITupRF v)
	{
		return VecUtils3F.crossFunc(v, this, CTOR);
	}

	/** {@inheritDoc} */
	@Override
	public IVec3WF rCrossN(float[] v)
	{
		return VecUtils3F.crossFunc(v, this, CTOR);
	}

	/** {@inheritDoc} */
	@Override
	public IVec3WF rCrossN(float x, float y, float z)
	{
		return VecUtils3F.crossFunc(x, y, z, this, CTOR);
	}
	
	/** {@inheritDoc} */
	@Override
	public float[] rCrossT(ITup3RF v, float[] res)
	{
		return VecUtils3F.cross(v, this, res);
	}

	/** {@inheritDoc} */
	@Override
	public float[] rCrossT(ITupRF v, float[] res)
	{
		return VecUtils3F.cross(v, this, res);
	}

	/** {@inheritDoc} */
	@Override
	public float[] rCrossT(float[] v, float[] res)
	{
		return VecUtils3F.cross(v, this, res);
	}

	/** {@inheritDoc} */
	@Override
	public float[] rCrossT(float x, float y, float z, float[] res)
	{
		return VecUtils3F.cross(x, y, z, this, res);
	}
	
	/** {@inheritDoc} */
	@Override
	public <T extends ITup3WF> T rCrossT(ITup3RF v, T res)
	{
		return VecUtils3F.cross(v, this, res);
	}

	/** {@inheritDoc} */
	@Override
	public <T extends ITup3WF> T rCrossT(ITupRF v, T res)
	{
		return VecUtils3F.cross(v, this, res);
	}

	/** {@inheritDoc} */
	@Override
	public <T extends ITup3WF> T rCrossT(float[] v, T res)
	{
		return VecUtils3F.cross(v, this, res);
	}

	/** {@inheritDoc} */
	@Override
	public <T extends ITup3WF> T rCrossT(float x, float y, float z, T res)
	{
		return VecUtils3F.cross(x, y, z, this, res);
	}
}
