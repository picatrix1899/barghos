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
	
	public Vec3F(ITup3RF t)
	{
		set(t);
	}
	
	public Vec3F(ITupRF t)
	{
		set(t);
	}
	
	public Vec3F(float[] t)
	{
		set(t);
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
	public Vec3F set(ITup3RF t)
	{
		t.toArray(this.v);
		
		return this;
	}

	/** {@inheritDoc} */
	@Override
	public Vec3F set(ITupRF t)
	{
		t.toArray(this.v);
		
		return this;
	}

	/** {@inheritDoc} */
	@Override
	public Vec3F set(float[] values)
	{
		System.arraycopy(values, 0, this.v, 0, 3);
		
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
		
		if(obj instanceof ITup3RF t)
		{
			return equals(t);
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
	public Vec3F add(ITup3RF t)
	{
		VecUtils3F.add(this.v, t, this.v);
		
		return this;
	}

	/** {@inheritDoc} */
	@Override
	public Vec3F add(ITupRF t)
	{
		VecUtils3F.add(this.v, t, this.v);
		
		return this;
	}
	
	/** {@inheritDoc} */
	@Override
	public Vec3F add(float[] t)
	{
		VecUtils3F.add(this.v, t, this.v);
		
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
	public Vec3F add(float tx, float ty, float tz)
	{
		VecUtils3F.add(this.v, tx, ty, tz, this.v);
		
		return this;
	}
	
	/** {@inheritDoc} */
	@Override
	public Vec3F addN(ITup3RF t)
	{
		return VecUtils3F.addFunc(this.v, t, CTOR);
	}

	/** {@inheritDoc} */
	@Override
	public Vec3F addN(ITupRF t)
	{
		return VecUtils3F.addFunc(this.v, t, CTOR);
	}
	
	/** {@inheritDoc} */
	@Override
	public Vec3F addN(float[] t)
	{
		return VecUtils3F.addFunc(this.v, t, CTOR);
	}

	/** {@inheritDoc} */
	@Override
	public Vec3F addN(float value)
	{
		return VecUtils3F.addFunc(this.v, value, value, value, CTOR);
	}

	/** {@inheritDoc} */
	@Override
	public Vec3F addN(float tx, float ty, float tz)
	{
		return VecUtils3F.addFunc(this.v, tx, ty, tz, CTOR);
	}
	
	/** {@inheritDoc} */
	@Override
	public float[] addT(ITup3RF t, float[] res)
	{
		return VecUtils3F.add(this.v, t, res);
	}
	
	/** {@inheritDoc} */
	@Override
	public float[] addT(ITupRF t, float[] res)
	{
		return VecUtils3F.add(this.v, t, res);
	}
	
	/** {@inheritDoc} */
	@Override
	public float[] addT(float[] t, float[] res)
	{
		return VecUtils3F.add(this.v, t, res);
	}
	
	/** {@inheritDoc} */
	@Override
	public float[] addT(float value, float[] res)
	{
		return VecUtils3F.add(this.v, value, value, value, res);
	}

	/** {@inheritDoc} */
	@Override
	public float[] addT(float tx, float ty, float tz, float[] res)
	{
		return VecUtils3F.add(this.v, tx, ty, tz, res);
	}
	
	/** {@inheritDoc} */
	@Override
	public <T extends ITup3WF> T addT(ITup3RF t, T res)
	{
		return VecUtils3F.add(this.v, t, res);
	}

	/** {@inheritDoc} */
	@Override
	public <T extends ITup3WF> T addT(ITupRF t, T res)
	{
		return VecUtils3F.add(this.v, t, res);
	}
	
	/** {@inheritDoc} */
	@Override
	public <T extends ITup3WF> T addT(float[] t, T res)
	{
		return VecUtils3F.add(this.v, t, res);
	}
	
	/** {@inheritDoc} */
	@Override
	public <T extends ITup3WF> T addT(float value, T res)
	{
		return VecUtils3F.add(this.v, value, value, value, res);
	}

	/** {@inheritDoc} */
	@Override
	public <T extends ITup3WF> T addT(float tx, float ty, float tz, T res)
	{
		return VecUtils3F.add(this.v, tx, ty, tz, res);
	}

	/** {@inheritDoc} */
	@Override
	public Vec3F sub(ITup3RF t)
	{
		VecUtils3F.sub(this.v, t, this.v);
		
		return this;
	}

	/** {@inheritDoc} */
	@Override
	public Vec3F sub(ITupRF t)
	{
		VecUtils3F.sub(this.v, t, this.v);
		
		return this;
	}
	
	/** {@inheritDoc} */
	@Override
	public Vec3F sub(float[] t)
	{
		VecUtils3F.sub(this.v, t, this.v);
		
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
	public Vec3F sub(float tx, float ty, float tz)
	{
		VecUtils3F.sub(this.v, tx, ty, tz, this.v);
		
		return this;
	}
	
	/** {@inheritDoc} */
	@Override
	public Vec3F subN(ITup3RF t)
	{
		return VecUtils3F.subFunc(this.v, t, CTOR);
	}

	/** {@inheritDoc} */
	@Override
	public Vec3F subN(ITupRF t)
	{
		return VecUtils3F.subFunc(this.v, t, CTOR);
	}
	
	/** {@inheritDoc} */
	@Override
	public Vec3F subN(float[] t)
	{
		return VecUtils3F.subFunc(this.v, t, CTOR);
	}

	/** {@inheritDoc} */
	@Override
	public Vec3F subN(float value)
	{
		return VecUtils3F.subFunc(this.v, value, value, value, CTOR);
	}

	/** {@inheritDoc} */
	@Override
	public Vec3F subN(float tx, float ty, float tz)
	{
		return VecUtils3F.subFunc(this.v, tx, ty, tz, CTOR);
	}
	
	/** {@inheritDoc} */
	@Override
	public float[] subT(ITup3RF t, float[] res)
	{
		return VecUtils3F.sub(this.v, t, res);
	}

	/** {@inheritDoc} */
	@Override
	public float[] subT(ITupRF t, float[] res)
	{
		return VecUtils3F.sub(this.v, t, res);
	}
	
	/** {@inheritDoc} */
	@Override
	public float[] subT(float[] t, float[] res)
	{
		return VecUtils3F.sub(this.v, t, res);
	}
	
	/** {@inheritDoc} */
	@Override
	public float[] subT(float value, float[] res)
	{
		return VecUtils3F.sub(this.v, value, value, value, res);
	}
	
	/** {@inheritDoc} */
	@Override
	public float[] subT(float tx, float ty, float tz, float[] res)
	{
		return VecUtils3F.sub(this.v, tx, ty, tz, res);
	}
	
	/** {@inheritDoc} */
	@Override
	public <T extends ITup3WF> T subT(ITup3RF t, T res)
	{
		return VecUtils3F.sub(this.v, t, res);
	}
	
	/** {@inheritDoc} */
	@Override
	public <T extends ITup3WF> T subT(ITupRF t, T res)
	{
		return VecUtils3F.sub(this.v, t, res);
	}
	
	/** {@inheritDoc} */
	@Override
	public <T extends ITup3WF> T subT(float[] t, T res)
	{
		return VecUtils3F.sub(this.v, t, res);
	}

	/** {@inheritDoc} */
	@Override
	public <T extends ITup3WF> T subT(float value, T res)
	{
		return VecUtils3F.sub(this.v, value, value, value, res);
	}

	/** {@inheritDoc} */
	@Override
	public <T extends ITup3WF> T subT(float tx, float ty, float tz, T res)
	{
		return VecUtils3F.sub(this.v, tx, ty, tz, res);
	}

	/** {@inheritDoc} */
	@Override
	public Vec3F rSub(ITup3RF t)
	{
		VecUtils3F.sub(t, this.v, this.v);
		
		return this;
	}

	/** {@inheritDoc} */
	@Override
	public Vec3F rSub(ITupRF t)
	{
		VecUtils3F.sub(t, this.v, this.v);
		
		return this;
	}
	
	/** {@inheritDoc} */
	@Override
	public Vec3F rSub(float[] t)
	{
		VecUtils3F.sub(t, this.v, this.v);
		
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
	public Vec3F rSub(float tx, float ty, float tz)
	{
		VecUtils3F.sub(tx, ty, tz, this.v, this.v);
		
		return this;
	}
	
	/** {@inheritDoc} */
	@Override
	public Vec3F rSubN(ITup3RF t)
	{
		return VecUtils3F.subFunc(t, this.v, CTOR);
	}

	/** {@inheritDoc} */
	@Override
	public Vec3F rSubN(ITupRF t)
	{
		return VecUtils3F.subFunc(t, this.v, CTOR);
	}
	
	/** {@inheritDoc} */
	@Override
	public Vec3F rSubN(float[] t)
	{
		return VecUtils3F.subFunc(t, this.v, CTOR);
	}

	/** {@inheritDoc} */
	@Override
	public Vec3F rSubN(float value)
	{
		return VecUtils3F.subFunc(value, value, value, this.v, CTOR);
	}

	/** {@inheritDoc} */
	@Override
	public Vec3F rSubN(float tx, float ty, float tz)
	{
		return VecUtils3F.subFunc(tx, ty, tz, this.v, CTOR);
	}
	
	/** {@inheritDoc} */
	@Override
	public float[] rSubT(ITup3RF t, float[] res)
	{
		return VecUtils3F.sub(t, this.v, res);
	}
	
	/** {@inheritDoc} */
	@Override
	public float[] rSubT(ITupRF t, float[] res)
	{
		return VecUtils3F.sub(t, this.v, res);
	}
	
	/** {@inheritDoc} */
	@Override
	public float[] rSubT(float[] t, float[] res)
	{
		return VecUtils3F.sub(t, this.v, res);
	}
	
	/** {@inheritDoc} */
	@Override
	public float[] rSubT(float value, float[] res)
	{
		return VecUtils3F.sub(value, value, value, this.v, res);
	}
	
	/** {@inheritDoc} */
	@Override
	public float[] rSubT(float tx, float ty, float tz, float[] res)
	{
		return VecUtils3F.sub(tx, ty, tz, this.v, res);
	}
	
	/** {@inheritDoc} */
	@Override
	public <T extends ITup3WF> T rSubT(ITup3RF t, T res)
	{
		return VecUtils3F.sub(t, this.v, res);
	}

	/** {@inheritDoc} */
	@Override
	public <T extends ITup3WF> T rSubT(ITupRF t, T res)
	{
		return VecUtils3F.sub(t, this.v, res);
	}
	
	/** {@inheritDoc} */
	@Override
	public <T extends ITup3WF> T rSubT(float[] t, T res)
	{
		return VecUtils3F.sub(t, this.v, res);
	}

	/** {@inheritDoc} */
	@Override
	public <T extends ITup3WF> T rSubT(float value, T res)
	{
		return VecUtils3F.sub(value, value, value, this.v, res);
	}

	/** {@inheritDoc} */
	@Override
	public <T extends ITup3WF> T rSubT(float tx, float ty, float tz, T res)
	{
		return VecUtils3F.sub(tx, ty, tz, this.v, res);
	}

	/** {@inheritDoc} */
	@Override
	public Vec3F mul(ITup3RF t)
	{
		VecUtils3F.mul(this.v, t, this.v);
		
		return this;
	}

	/** {@inheritDoc} */
	@Override
	public Vec3F mul(ITupRF t)
	{
		VecUtils3F.mul(this.v, t, this.v);
		
		return this;
	}
	
	/** {@inheritDoc} */
	@Override
	public Vec3F mul(float[] t)
	{
		VecUtils3F.mul(this.v, t, this.v);
		
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
	public Vec3F mul(float tx, float ty, float tz)
	{
		VecUtils3F.mul(this.v, tx, ty, tz, this.v);
		
		return this;
	}
	
	/** {@inheritDoc} */
	@Override
	public Vec3F mulN(ITup3RF t)
	{
		return VecUtils3F.mulFunc(this.v, t, CTOR);
	}

	/** {@inheritDoc} */
	@Override
	public Vec3F mulN(ITupRF t)
	{
		return VecUtils3F.mulFunc(this.v, t, CTOR);
	}
	
	/** {@inheritDoc} */
	@Override
	public Vec3F mulN(float[] t)
	{
		return VecUtils3F.mulFunc(this.v, t, CTOR);
	}

	/** {@inheritDoc} */
	@Override
	public Vec3F mulN(float value)
	{
		return VecUtils3F.mulFunc(this.v, value, value, value, CTOR);
	}

	/** {@inheritDoc} */
	@Override
	public Vec3F mulN(float tx, float ty, float tz)
	{
		return VecUtils3F.mulFunc(this.v, tx, ty, tz, CTOR);
	}
	
	/** {@inheritDoc} */
	@Override
	public float[] mulT(ITup3RF t, float[] res)
	{
		return VecUtils3F.mul(this.v, t, res);
	}
	
	/** {@inheritDoc} */
	@Override
	public float[] mulT(ITupRF t, float[] res)
	{
		return VecUtils3F.mul(this.v, t, res);
	}
	
	/** {@inheritDoc} */
	@Override
	public float[] mulT(float[] t, float[] res)
	{
		return VecUtils3F.mul(this.v, t, res);
	}
	
	/** {@inheritDoc} */
	@Override
	public float[] mulT(float value, float[] res)
	{
		return VecUtils3F.mul(this.v, value, value, value, res);
	}
	
	/** {@inheritDoc} */
	@Override
	public float[] mulT(float tx, float ty, float tz, float[] res)
	{
		return VecUtils3F.mul(this.v, tx, ty, tz, res);
	}
	
	/** {@inheritDoc} */
	@Override
	public <T extends ITup3WF> T mulT(ITup3RF t, T res)
	{
		return VecUtils3F.mul(this.v, t, res);
	}

	/** {@inheritDoc} */
	@Override
	public <T extends ITup3WF> T mulT(ITupRF t, T res)
	{
		return VecUtils3F.mul(this.v, t, res);
	}
	
	/** {@inheritDoc} */
	@Override
	public <T extends ITup3WF> T mulT(float[] t, T res)
	{
		return VecUtils3F.mul(this.v, t, res);
	}

	/** {@inheritDoc} */
	@Override
	public <T extends ITup3WF> T mulT(float value, T res)
	{
		return VecUtils3F.mul(this.v, value, value, value, res);
	}

	/** {@inheritDoc} */
	@Override
	public <T extends ITup3WF> T mulT(float tx, float ty, float tz, T res)
	{
		return VecUtils3F.mul(this.v, tx, ty, tz, res);
	}

	/** {@inheritDoc} */
	@Override
	public Vec3F div(ITup3RF t)
	{
		VecUtils3F.div(this.v, t, this.v);
		
		return this;
	}


	/** {@inheritDoc} */
	@Override
	public Vec3F div(ITupRF t)
	{
		VecUtils3F.div(this.v, t, this.v);
		
		return this;
	}
	
	/** {@inheritDoc} */
	@Override
	public Vec3F div(float[] t)
	{
		VecUtils3F.div(this.v, t, this.v);
		
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
	public Vec3F div(float tx, float ty, float tz)
	{
		VecUtils3F.div(this.v, tx, ty, tz, this.v);
		
		return this;
	}
	
	/** {@inheritDoc} */
	@Override
	public Vec3F divN(ITup3RF t)
	{
		return VecUtils3F.divFunc(this.v, t, CTOR);
	}

	/** {@inheritDoc} */
	@Override
	public Vec3F divN(ITupRF t)
	{
		return VecUtils3F.divFunc(this.v, t, CTOR);
	}
	
	/** {@inheritDoc} */
	@Override
	public Vec3F divN(float[] t)
	{
		return VecUtils3F.divFunc(this.v, t, CTOR);
	}

	/** {@inheritDoc} */
	@Override
	public Vec3F divN(float value)
	{
		return VecUtils3F.divFunc(this.v, value, value, value, CTOR);
	}

	/** {@inheritDoc} */
	@Override
	public Vec3F divN(float tx, float ty, float tz)
	{
		return VecUtils3F.divFunc(this.v, tx, ty, tz, CTOR);
	}
	
	/** {@inheritDoc} */
	@Override
	public float[] divT(ITup3RF t, float[] res)
	{
		return VecUtils3F.div(this.v, t, res);
	}
	
	/** {@inheritDoc} */
	@Override
	public float[] divT(ITupRF t, float[] res)
	{
		return VecUtils3F.div(this.v, t, res);
	}
	
	/** {@inheritDoc} */
	@Override
	public float[] divT(float[] t, float[] res)
	{
		return VecUtils3F.div(this.v, t, res);
	}
	
	/** {@inheritDoc} */
	@Override
	public float[] divT(float value, float[] res)
	{
		return VecUtils3F.div(this.v, value, value, value, res);
	}
	
	/** {@inheritDoc} */
	@Override
	public float[] divT(float tx, float ty, float tz, float[] res)
	{
		return VecUtils3F.div(this.v, tx, ty ,tz, res);
	}
	
	/** {@inheritDoc} */
	@Override
	public <T extends ITup3WF> T divT(ITup3RF t, T res)
	{
		return VecUtils3F.div(this.v, t, res);
	}

	/** {@inheritDoc} */
	@Override
	public <T extends ITup3WF> T divT(ITupRF t, T res)
	{
		return VecUtils3F.div(this.v, t, res);
	}
	
	/** {@inheritDoc} */
	@Override
	public <T extends ITup3WF> T divT(float[] t, T res)
	{
		return VecUtils3F.div(this.v, t, res);
	}

	/** {@inheritDoc} */
	@Override
	public <T extends ITup3WF> T divT(float value, T res)
	{
		return VecUtils3F.div(this.v, value, value, value, res);
	}
	
	/** {@inheritDoc} */
	@Override
	public <T extends ITup3WF> T divT(float tx, float ty, float tz, T res)
	{
		return VecUtils3F.div(this.v, tx, ty, tz, res);
	}

	/** {@inheritDoc} */
	@Override
	public Vec3F rDiv(ITup3RF t)
	{
		VecUtils3F.div(t, this.v, this.v);
		
		return this;
	}

	/** {@inheritDoc} */
	@Override
	public Vec3F rDiv(ITupRF t)
	{
		VecUtils3F.div(t, this.v, this.v);
		
		return this;
	}
	
	/** {@inheritDoc} */
	@Override
	public Vec3F rDiv(float[] t)
	{
		VecUtils3F.div(t, this.v, this.v);
		
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
	public Vec3F rDiv(float tx, float ty, float tz)
	{
		VecUtils3F.div(tx, ty, tz, this.v, this.v);
		
		return this;
	}
	
	/** {@inheritDoc} */
	@Override
	public Vec3F rDivN(ITup3RF t)
	{
		return VecUtils3F.divFunc(t, this.v, CTOR);
	}

	/** {@inheritDoc} */
	@Override
	public Vec3F rDivN(ITupRF t)
	{
		return VecUtils3F.divFunc(t, this.v, CTOR);
	}
	
	/** {@inheritDoc} */
	@Override
	public Vec3F rDivN(float[] t)
	{
		return VecUtils3F.divFunc(t, this.v, CTOR);
	}

	/** {@inheritDoc} */
	@Override
	public Vec3F rDivN(float value)
	{
		return VecUtils3F.divFunc(value, value, value, this.v, CTOR);
	}

	/** {@inheritDoc} */
	@Override
	public Vec3F rDivN(float tx, float ty, float tz)
	{
		return VecUtils3F.divFunc(tx, ty, tz, this.v, CTOR);
	}
	
	/** {@inheritDoc} */
	@Override
	public float[] rDivT(ITup3RF t, float[] res)
	{
		return VecUtils3F.div(t, this.v, res);
	}
	
	/** {@inheritDoc} */
	@Override
	public float[] rDivT(ITupRF t, float[] res)
	{
		return VecUtils3F.div(t, this.v, res);
	}
	
	/** {@inheritDoc} */
	@Override
	public float[] rDivT(float[] t, float[] res)
	{
		return VecUtils3F.div(t, this.v, res);
	}
	
	/** {@inheritDoc} */
	@Override
	public float[] rDivT(float value, float[] res)
	{
		return VecUtils3F.div(value, value, value, this.v, res);
	}
	
	/** {@inheritDoc} */
	@Override
	public float[] rDivT(float tx, float ty, float tz, float[] res)
	{
		return VecUtils3F.div(tx, ty, tz, this.v, res);
	}
	
	/** {@inheritDoc} */
	@Override
	public <T extends ITup3WF> T rDivT(ITup3RF t, T res)
	{
		return VecUtils3F.div(t, this.v, res);
	}

	/** {@inheritDoc} */
	@Override
	public <T extends ITup3WF> T rDivT(ITupRF t, T res)
	{
		return VecUtils3F.div(t, this.v, res);
	}
	
	/** {@inheritDoc} */
	@Override
	public <T extends ITup3WF> T rDivT(float[] t, T res)
	{
		return VecUtils3F.div(t, this.v, res);
	}

	/** {@inheritDoc} */
	@Override
	public <T extends ITup3WF> T rDivT(float value, T res)
	{
		return VecUtils3F.div(value, value, value, this.v, res);
	}

	/** {@inheritDoc} */
	@Override
	public <T extends ITup3WF> T rDivT(float tx, float ty, float tz, T res)
	{
		return VecUtils3F.div(tx, ty, tz, this.v, res);
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
	public float lenTo(ITup3RF t)
	{
		return VecUtils3F.lenTo(this.v, t);
	}

	/** {@inheritDoc} */
	@Override
	public float lenTo(ITupRF t)
	{
		return VecUtils3F.lenTo(this.v, t);
	}
	
	/** {@inheritDoc} */
	@Override
	public float lenTo(float[] t)
	{
		return VecUtils3F.lenTo(this.v, t);
	}
	
	/** {@inheritDoc} */
	@Override
	public float lenTo(float tx, float ty, float tz)
	{
		return VecUtils3F.lenTo(this.v, tx, ty, tz);
	}
	
	/** {@inheritDoc} */
	@Override
	public float lenTo(float tolerance, ITup3RF t)
	{
		return VecUtils3F.lenTo(tolerance, this.v, t);
	}

	/** {@inheritDoc} */
	@Override
	public float lenTo(float tolerance, ITupRF t)
	{
		return VecUtils3F.lenTo(tolerance, this.v, t);
	}

	/** {@inheritDoc} */
	@Override
	public float lenTo(float tolerance, float[] t)
	{
		return VecUtils3F.lenTo(tolerance, this.v, t);
	}

	/** {@inheritDoc} */
	@Override
	public float lenTo(float tolerance, float tx, float ty, float tz)
	{
		return VecUtils3F.lenTo(tolerance, this.v, tx, ty, tz);
	}

	/** {@inheritDoc} */
	@Override
	public float lenRcTo(ITup3RF t)
	{
		return VecUtils3F.lenRcTo(this.v, t);
	}

	/** {@inheritDoc} */
	@Override
	public float lenRcTo(ITupRF t)
	{
		return VecUtils3F.lenRcTo(this.v, t);
	}
	
	/** {@inheritDoc} */
	@Override
	public float lenRcTo(float[] t)
	{
		return VecUtils3F.lenRcTo(this.v, t);
	}

	/** {@inheritDoc} */
	@Override
	public float lenRcTo(float tx, float ty, float tz)
	{
		return VecUtils3F.lenRcTo(this.v, tx, ty, tz);
	}

	/** {@inheritDoc} */
	@Override
	public float lenSq()
	{
		return VecUtils3F.lenSq(this.v);
	}

	/** {@inheritDoc} */
	@Override
	public float lenSqTo(ITup3RF t)
	{
		return VecUtils3F.lenSqTo(this.v, t);
	}

	/** {@inheritDoc} */
	@Override
	public float lenSqTo(ITupRF t)
	{
		return VecUtils3F.lenSqTo(this.v, t);
	}
	
	/** {@inheritDoc} */
	@Override
	public float lenSqTo(float[] t)
	{
		return VecUtils3F.lenSqTo(this.v, t);
	}

	/** {@inheritDoc} */
	@Override
	public float lenSqTo(float tx, float ty, float tz)
	{
		return VecUtils3F.lenSqTo(this.v, tx, ty, tz);
	}

	/** {@inheritDoc} */
	@Override
	public float dot(ITup3RF t)
	{
		return VecUtils3F.dot(this.v, t);
	}

	/** {@inheritDoc} */
	@Override
	public float dot(ITupRF t)
	{
		return VecUtils3F.dot(this.v, t);
	}
	
	/** {@inheritDoc} */
	@Override
	public float dot(float[] t)
	{
		return VecUtils3F.dot(this.v, t);
	}

	/** {@inheritDoc} */
	@Override
	public float dot(float tx, float ty, float tz)
	{
		return VecUtils3F.dot(this.v, tx, ty, tz);
	}
	
	/** {@inheritDoc} */
	@Override
	public Vec3F halfVecTo(ITup3RF t)
	{
		VecUtils3F.halfVecTo(this.v, t, this.v);
		
		return this;
	}

	/** {@inheritDoc} */
	@Override
	public Vec3F halfVecTo(ITupRF t)
	{
		VecUtils3F.halfVecTo(this.v, t, this.v);
		
		return this;
	}
	
	/** {@inheritDoc} */
	@Override
	public Vec3F halfVecTo(float[] t)
	{
		VecUtils3F.halfVecTo(this.v, t, this.v);
		
		return this;
	}

	/** {@inheritDoc} */
	@Override
	public Vec3F halfVecTo(float tx, float ty, float tz)
	{
		VecUtils3F.halfVecTo(this.v, tx, ty, tz, this.v);
		
		return this;
	}
	
	/** {@inheritDoc} */
	@Override
	public Vec3F halfVecToN(ITup3RF t)
	{
		return VecUtils3F.halfVecToFunc(this.v, t, CTOR);
	}

	/** {@inheritDoc} */
	@Override
	public Vec3F halfVecToN(ITupRF t)
	{
		return VecUtils3F.halfVecToFunc(this.v, t, CTOR);
	}
	
	/** {@inheritDoc} */
	@Override
	public Vec3F halfVecToN(float[] t)
	{
		return VecUtils3F.halfVecToFunc(this.v, t, CTOR);
	}

	/** {@inheritDoc} */
	@Override
	public Vec3F halfVecToN(float tx, float ty, float tz)
	{
		return VecUtils3F.halfVecToFunc(this.v, tx, ty, tz, CTOR);
	}
	
	/** {@inheritDoc} */
	@Override
	public float[] halfVecToT(ITup3RF t, float[] res)
	{
		return VecUtils3F.halfVecTo(this.v, t, res);
	}
	
	/** {@inheritDoc} */
	@Override
	public float[] halfVecToT(ITupRF t, float[] res)
	{
		return VecUtils3F.halfVecTo(this.v, t, res);
	}
	
	/** {@inheritDoc} */
	@Override
	public float[] halfVecToT(float[] t, float[] res)
	{
		return VecUtils3F.halfVecTo(this.v, t, res);
	}
	
	/** {@inheritDoc} */
	@Override
	public float[] halfVecToT(float tx, float ty, float tz, float[] res)
	{
		return VecUtils3F.halfVecTo(this.v, tx, ty, tz, res);
	}
	
	/** {@inheritDoc} */
	@Override
	public <T extends ITup3WF> T halfVecToT(ITup3RF t, T res)
	{
		return VecUtils3F.halfVecTo(this.v, t, res);
	}

	/** {@inheritDoc} */
	@Override
	public <T extends ITup3WF> T halfVecToT(ITupRF t, T res)
	{
		return VecUtils3F.halfVecTo(this.v, t, res);
	}
	
	/** {@inheritDoc} */
	@Override
	public <T extends ITup3WF> T halfVecToT(float[] t, T res)
	{
		return VecUtils3F.halfVecTo(this.v, t, res);
	}

	/** {@inheritDoc} */
	@Override
	public <T extends ITup3WF> T halfVecToT(float tx, float ty, float tz, T res)
	{
		return VecUtils3F.halfVecTo(this.v, tx, ty, tz, res);
	}

	/** {@inheritDoc} */
	@Override
	public Vec3F midPointTo(ITup3RF t)
	{
		VecUtils3F.midPointTo(this.v, t, this.v);
		
		return this;
	}

	/** {@inheritDoc} */
	@Override
	public Vec3F midPointTo(ITupRF t)
	{
		VecUtils3F.midPointTo(this.v, t, this.v);
		
		return this;
	}
	
	/** {@inheritDoc} */
	@Override
	public Vec3F midPointTo(float[] t)
	{
		VecUtils3F.midPointTo(this.v, t, this.v);
		
		return this;
	}

	/** {@inheritDoc} */
	@Override
	public Vec3F midPointTo(float tx, float ty, float tz)
	{
		VecUtils3F.midPointTo(this.v, tx, ty, tz, this.v);
		
		return this;
	}
	
	/** {@inheritDoc} */
	@Override
	public Vec3F midPointToN(ITup3RF t)
	{
		return VecUtils3F.midPointToFunc(this.v, t, CTOR);
	}

	/** {@inheritDoc} */
	@Override
	public Vec3F midPointToN(ITupRF t)
	{
		return VecUtils3F.midPointToFunc(this.v, t, CTOR);
	}
	
	/** {@inheritDoc} */
	@Override
	public Vec3F midPointToN(float[] t)
	{
		return VecUtils3F.midPointToFunc(this.v, t, CTOR);
	}

	/** {@inheritDoc} */
	@Override
	public Vec3F midPointToN(float tx, float ty, float tz)
	{
		return VecUtils3F.midPointToFunc(this.v, tx, ty, tz, CTOR);
	}
	
	/** {@inheritDoc} */
	@Override
	public float[] midPointToT(ITup3RF t, float[] res)
	{
		return VecUtils3F.midPointTo(this.v, t, res);
	}

	/** {@inheritDoc} */
	@Override
	public float[] midPointToT(ITupRF t, float[] res)
	{
		return VecUtils3F.midPointTo(this.v, t, res);
	}
	
	/** {@inheritDoc} */
	@Override
	public float[] midPointToT(float[] t, float[] res)
	{
		return VecUtils3F.midPointTo(this.v, t, res);
	}
	
	/** {@inheritDoc} */
	@Override
	public float[] midPointToT(float tx, float ty, float tz, float[] res)
	{
		return VecUtils3F.midPointTo(this.v, tx, ty, tz, res);
	}
	
	/** {@inheritDoc} */
	@Override
	public <T extends ITup3WF> T midPointToT(ITup3RF t, T res)
	{
		return VecUtils3F.midPointTo(this.v, t, res);
	}

	/** {@inheritDoc} */
	@Override
	public <T extends ITup3WF> T midPointToT(ITupRF t, T res)
	{
		return VecUtils3F.midPointTo(this.v, t, res);
	}
	
	/** {@inheritDoc} */
	@Override
	public <T extends ITup3WF> T midPointToT(float[] t, T res)
	{
		return VecUtils3F.midPointTo(this.v, t, res);
	}

	/** {@inheritDoc} */
	@Override
	public <T extends ITup3WF> T midPointToT(float tx, float ty, float tz, T res)
	{
		return VecUtils3F.midPointTo(this.v, tx, ty, tz, res);
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
	public Vec3F project(ITup3RF t)
	{
		VecUtils3F.project(this.v, t, this.v);
		
		return this;
	}

	/** {@inheritDoc} */
	@Override
	public Vec3F project(ITupRF t)
	{
		VecUtils3F.project(this.v, t, this.v);
		
		return this;
	}
	
	/** {@inheritDoc} */
	@Override
	public Vec3F project(float[] t)
	{
		VecUtils3F.project(this.v, t, this.v);
		
		return this;
	}

	/** {@inheritDoc} */
	@Override
	public Vec3F project(float tx, float ty, float tz)
	{
		VecUtils3F.project(this.v, tx, ty, tz, this.v);
		
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
	public Vec3F projectN(float tx, float ty, float tz)
	{
		return VecUtils3F.projectFunc(this.v, tx, ty, tz, CTOR);
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
	public float[] projectT(float tx, float ty,float tz, float[] res)
	{
		return VecUtils3F.project(this.v, tx, ty, tz, res);
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
	public <T extends ITup3WF> T projectT(float tx, float ty, float tz, T res)
	{
		return VecUtils3F.project(this.v, tx, ty, tz, res);
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
	public Vec3F reflect(float nx, float ny, float nz)
	{
		VecUtils3F.reflect(this.v, nx, ny, nz, this.v);
		
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
	public Vec3F reflectN(float nx, float ny, float nz)
	{
		return VecUtils3F.reflectFunc(this.v, nx, ny, nz, CTOR);
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
	public float[] reflectT(float nx, float ny, float nz, float[] res)
	{
		return VecUtils3F.reflect(this.v, nx, ny, nz, res);
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
	public <T extends ITup3WF> T reflectT(float nx, float ny, float nz, T res)
	{
		return VecUtils3F.reflect(this.v, nx, ny, nz, res);
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
	public boolean equals(ITup3RF t)
	{
		return TupUtils3F.equals(this.v, t);
	}

	/** {@inheritDoc} */
	@Override
	public boolean equals(ITupRF t)
	{
		return TupUtils3F.equals(this.v, t);
	}

	/** {@inheritDoc} */
	@Override
	public boolean equals(float[] t)
	{
		return TupUtils3F.equals(this.v, t);
	}

	/** {@inheritDoc} */
	@Override
	public boolean equals(float tv0, float tv1, float tv2)
	{
		return TupUtils3F.equals(this.v, tv0, tv1, tv2);
	}

	/** {@inheritDoc} */
	@Override
	public boolean equals(float tolerance, ITup3RF t)
	{
		return TupUtils3F.equals(tolerance, this.v, t);
	}

	/** {@inheritDoc} */
	@Override
	public boolean equals(float tolerance, ITupRF t)
	{
		return TupUtils3F.equals(tolerance, this.v, t);
	}

	/** {@inheritDoc} */
	@Override
	public boolean equals(float tolerance, float[] t)
	{
		return TupUtils3F.equals(tolerance, this.v, t);
	}

	/** {@inheritDoc} */
	@Override
	public boolean equals(float tolerance, float tv0, float tv1, float tv2)
	{
		return TupUtils3F.equals(tolerance, this.v, tv0, tv1, tv2);
	}

	/** {@inheritDoc} */
	@Override
	public boolean equalsAt(int index, ITup3RF t)
	{
		return TupUtils3F.equalsAt(index, this.v, t);
	}

	/** {@inheritDoc} */
	@Override
	public boolean equalsAt(int index, ITupRF t)
	{
		return TupUtils3F.equalsAt(index, this.v, t);
	}

	/** {@inheritDoc} */
	@Override
	public boolean equalsAt(int index, float[] t)
	{
		return TupUtils3F.equalsAt(index, this.v, t);
	}

	/** {@inheritDoc} */
	@Override
	public boolean equalsAt(int index, float value)
	{
		return TupUtils3F.equalsAt(index, this.v, value);
	}

	/** {@inheritDoc} */
	@Override
	public boolean equalsAt(float tolerance, int index, ITup3RF t)
	{
		return TupUtils3F.equalsAt(tolerance, index, this.v, t);
	}

	/** {@inheritDoc} */
	@Override
	public boolean equalsAt(float tolerance, int index, ITupRF t)
	{
		return TupUtils3F.equalsAt(tolerance, index, this.v, t);
	}

	/** {@inheritDoc} */
	@Override
	public boolean equalsAt(float tolerance, int index, float[] t)
	{
		return TupUtils3F.equalsAt(tolerance, index, this.v, t);
	}

	/** {@inheritDoc} */
	@Override
	public boolean equalsAt(float tolerance, int index, float value)
	{
		return TupUtils3F.equalsAt(tolerance, index, this.v, value);
	}

	/** {@inheritDoc} */
	@Override
	public boolean equalsAtV0(ITup3RF t)
	{
		return TupUtils3F.equalsAtV0(this.v, t);
	}

	/** {@inheritDoc} */
	@Override
	public boolean equalsAtV0(ITupRF t)
	{
		return TupUtils3F.equalsAtV0(this.v, t);
	}

	/** {@inheritDoc} */
	@Override
	public boolean equalsAtV0(float[] t)
	{
		return TupUtils3F.equalsAtV0(this.v, t);
	}

	/** {@inheritDoc} */
	@Override
	public boolean equalsAtV0(float value)
	{
		return TupUtils3F.equalsAtV0(this.v, value);
	}

	/** {@inheritDoc} */
	@Override
	public boolean equalsAtV1(ITup3RF t)
	{
		return TupUtils3F.equalsAtV1(this.v, t);
	}

	/** {@inheritDoc} */
	@Override
	public boolean equalsAtV1(ITupRF t)
	{
		return TupUtils3F.equalsAtV1(this.v, t);
	}

	/** {@inheritDoc} */
	@Override
	public boolean equalsAtV1(float[] t)
	{
		return TupUtils3F.equalsAtV1(this.v, t);
	}

	/** {@inheritDoc} */
	@Override
	public boolean equalsAtV1(float value)
	{
		return TupUtils3F.equalsAtV1(this.v, value);
	}

	/** {@inheritDoc} */
	@Override
	public boolean equalsAtV2(ITup3RF t)
	{
		return TupUtils3F.equalsAtV2(this.v, t);
	}

	/** {@inheritDoc} */
	@Override
	public boolean equalsAtV2(ITupRF t)
	{
		return TupUtils3F.equalsAtV2(this.v, t);
	}

	/** {@inheritDoc} */
	@Override
	public boolean equalsAtV2(float[] t)
	{
		return TupUtils3F.equalsAtV2(this.v, t);
	}

	/** {@inheritDoc} */
	@Override
	public boolean equalsAtV2(float value)
	{
		return TupUtils3F.equalsAtV2(this.v, value);
	}
	
	/** {@inheritDoc} */
	@Override
	public boolean equalsAtV0(float tolerance, ITup3RF t)
	{
		return TupUtils3F.equalsAtV0(tolerance, this.v, t);
	}

	/** {@inheritDoc} */
	@Override
	public boolean equalsAtV0(float tolerance, ITupRF t)
	{
		return TupUtils3F.equalsAtV0(tolerance, this.v, t);
	}

	/** {@inheritDoc} */
	@Override
	public boolean equalsAtV0(float tolerance, float[] t)
	{
		return TupUtils3F.equalsAtV0(tolerance, this.v, t);
	}

	/** {@inheritDoc} */
	@Override
	public boolean equalsAtV0(float tolerance, float value)
	{
		return TupUtils3F.equalsAtV0(tolerance, this.v, value);
	}

	/** {@inheritDoc} */
	@Override
	public boolean equalsAtV1(float tolerance, ITup3RF t)
	{
		return TupUtils3F.equalsAtV1(tolerance, this.v, t);
	}

	/** {@inheritDoc} */
	@Override
	public boolean equalsAtV1(float tolerance, ITupRF t)
	{
		return TupUtils3F.equalsAtV1(tolerance, this.v, t);
	}

	/** {@inheritDoc} */
	@Override
	public boolean equalsAtV1(float tolerance, float[] t)
	{
		return TupUtils3F.equalsAtV1(tolerance, this.v, t);
	}

	/** {@inheritDoc} */
	@Override
	public boolean equalsAtV1(float tolerance, float value)
	{
		return TupUtils3F.equalsAtV1(tolerance, this.v, value);
	}

	/** {@inheritDoc} */
	@Override
	public boolean equalsAtV2(float tolerance, ITup3RF t)
	{
		return TupUtils3F.equalsAtV2(tolerance, this.v, t);
	}

	/** {@inheritDoc} */
	@Override
	public boolean equalsAtV2(float tolerance, ITupRF t)
	{
		return TupUtils3F.equalsAtV2(tolerance, this.v, t);
	}

	/** {@inheritDoc} */
	@Override
	public boolean equalsAtV2(float tolerance, float[] t)
	{
		return TupUtils3F.equalsAtV2(tolerance, this.v, t);
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
	public Vec3F minComponents(ITup3RF t)
	{
		VecUtils3F.minComponents(this.v, t, this.v);
		
		return this;
	}
	
	/** {@inheritDoc} */
	@Override
	public Vec3F minComponents(ITupRF t)
	{
		VecUtils3F.minComponents(this.v, t, this.v);
		
		return this;
	}

	/** {@inheritDoc} */
	@Override
	public Vec3F minComponents(float[] t)
	{
		VecUtils3F.minComponents(this.v, t, this.v);
		
		return this;
	}
	
	/** {@inheritDoc} */
	@Override
	public Vec3F minComponents(float tv0, float tv1, float tv2)
	{
		VecUtils3F.minComponents(this.v, tv0, tv1, tv2, this.v);
		
		return this;
	}
	
	/** {@inheritDoc} */
	@Override
	public Vec3F minComponentsN(ITup3RF t)
	{
		return VecUtils3F.minComponentsFunc(this.v, t, CTOR);
	}

	/** {@inheritDoc} */
	@Override
	public Vec3F minComponentsN(ITupRF t)
	{
		return VecUtils3F.minComponentsFunc(this.v, t, CTOR);
	}

	/** {@inheritDoc} */
	@Override
	public Vec3F minComponentsN(float[] t)
	{
		return VecUtils3F.minComponentsFunc(this.v, t, CTOR);
	}
	
	/** {@inheritDoc} */
	@Override
	public Vec3F minComponentsN(float tv0, float tv1, float tv2)
	{
		return VecUtils3F.minComponentsFunc(this.v, tv0, tv1, tv2, CTOR);
	}
	
	/** {@inheritDoc} */
	@Override
	public float[] minComponentsT(ITup3RF t, float[] res)
	{
		return VecUtils3F.minComponents(this.v, t, res);
	}
	
	/** {@inheritDoc} */
	@Override
	public float[] minComponentsT(ITupRF t, float[] res)
	{
		return VecUtils3F.minComponents(this.v, t, res);
	}
	
	/** {@inheritDoc} */
	@Override
	public float[] minComponentsT(float[] t, float[] res)
	{
		return VecUtils3F.minComponents(this.v, t, res);
	}
	
	/** {@inheritDoc} */
	@Override
	public float[] minComponentsT(float tv0, float tv1, float tv2, float[] res)
	{
		return VecUtils3F.minComponents(this.v, tv0, tv1, tv2, res);
	}
	
	/** {@inheritDoc} */
	@Override
	public <T extends ITup3WF> T minComponentsT(ITup3RF t, T res)
	{
		return VecUtils3F.minComponents(this.v, t, res);
	}

	/** {@inheritDoc} */
	@Override
	public <T extends ITup3WF> T minComponentsT(ITupRF t, T res)
	{
		return VecUtils3F.minComponents(this.v, t, res);
	}

	/** {@inheritDoc} */
	@Override
	public <T extends ITup3WF> T minComponentsT(float[] t, T res)
	{
		return VecUtils3F.minComponents(this.v, t, res);
	}
	
	/** {@inheritDoc} */
	@Override
	public <T extends ITup3WF> T minComponentsT(float tv0, float tv1, float tv2, T res)
	{
		return VecUtils3F.minComponents(this.v, tv0, tv1, tv2, res);
	}
	
	/** {@inheritDoc} */
	@Override
	public Vec3F maxComponents(ITup3RF t)
	{
		VecUtils3F.maxComponents(this.v, t, this.v);
		
		return this;
	}
	
	/** {@inheritDoc} */
	@Override
	public Vec3F maxComponents(ITupRF t)
	{
		VecUtils3F.maxComponents(this.v, t, this.v);
		
		return this;
	}
	
	/** {@inheritDoc} */
	@Override
	public Vec3F maxComponents(float[] t)
	{
		VecUtils3F.maxComponents(this.v, t, this.v);
		
		return this;
	}
	
	/** {@inheritDoc} */
	@Override
	public Vec3F maxComponents(float tv0, float tv1, float tv2)
	{
		VecUtils3F.maxComponents(this.v, tv0, tv1, tv2, this.v);
		
		return this;
	}
	
	/** {@inheritDoc} */
	@Override
	public Vec3F maxComponentsN(ITup3RF t)
	{
		return VecUtils3F.maxComponentsFunc(this.v, t, CTOR);
	}

	/** {@inheritDoc} */
	@Override
	public Vec3F maxComponentsN(ITupRF t)
	{
		return VecUtils3F.maxComponentsFunc(this.v, t, CTOR);
	}

	/** {@inheritDoc} */
	@Override
	public Vec3F maxComponentsN(float[] t)
	{
		return VecUtils3F.maxComponentsFunc(this.v, t, CTOR);
	}
	
	/** {@inheritDoc} */
	@Override
	public Vec3F maxComponentsN(float tv0, float tv1, float tv2)
	{
		return VecUtils3F.maxComponentsFunc(this.v, tv0, tv1, tv2, CTOR);
	}
	
	/** {@inheritDoc} */
	@Override
	public float[] maxComponentsT(ITup3RF t, float[] res)
	{
		return VecUtils3F.maxComponents(this.v, t, res);
	}

	/** {@inheritDoc} */
	@Override
	public float[] maxComponentsT(ITupRF t, float[] res)
	{
		return VecUtils3F.maxComponents(this.v, t, res);
	}

	/** {@inheritDoc} */
	@Override
	public float[] maxComponentsT(float[] t, float[] res)
	{
		return VecUtils3F.maxComponents(this.v, t, res);
	}
	
	/** {@inheritDoc} */
	@Override
	public float[] maxComponentsT(float tv0, float tv1, float tv2, float[] res)
	{
		return VecUtils3F.maxComponents(this.v, tv0, tv1, tv2, res);
	}
	
	/** {@inheritDoc} */
	@Override
	public <T extends ITup3WF> T maxComponentsT(ITup3RF t, T res)
	{
		return VecUtils3F.maxComponents(this.v, t, res);
	}

	/** {@inheritDoc} */
	@Override
	public <T extends ITup3WF> T maxComponentsT(ITupRF t, T res)
	{
		return VecUtils3F.maxComponents(this.v, t, res);
	}
	
	/** {@inheritDoc} */
	@Override
	public <T extends ITup3WF> T maxComponentsT(float[] t, T res)
	{
		return VecUtils3F.maxComponents(this.v, t, res);
	}
	
	/** {@inheritDoc} */
	@Override
	public <T extends ITup3WF> T maxComponentsT(float tv0, float tv1, float tv2, T res)
	{
		return VecUtils3F.maxComponents(this.v, tv0, tv1, tv2, res);
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
	public IVec3WF cross(ITup3RF t)
	{
		return VecUtils3F.cross(this, t, this);
	}

	/** {@inheritDoc} */
	@Override
	public IVec3WF cross(ITupRF t)
	{
		return VecUtils3F.cross(this, t, this);
	}

	/** {@inheritDoc} */
	@Override
	public IVec3WF cross(float[] t)
	{
		return VecUtils3F.cross(this, t, this);
	}

	/** {@inheritDoc} */
	@Override
	public IVec3WF cross(float tv0, float tv1, float tv2)
	{
		return VecUtils3F.cross(this, tv0, tv1, tv2, this);
	}

	/** {@inheritDoc} */
	@Override
	public IVec3WF crossN(ITup3RF t)
	{
		return VecUtils3F.crossFunc(this, t, CTOR);
	}

	/** {@inheritDoc} */
	@Override
	public IVec3WF crossN(ITupRF t)
	{
		return VecUtils3F.crossFunc(this, t, CTOR);
	}

	/** {@inheritDoc} */
	@Override
	public IVec3WF crossN(float[] t)
	{
		return VecUtils3F.crossFunc(this, t, CTOR);
	}

	/** {@inheritDoc} */
	@Override
	public IVec3WF crossN(float tv0, float tv1, float tv2)
	{
		return VecUtils3F.crossFunc(this, tv0, tv1, tv2, CTOR);
	}
	
	/** {@inheritDoc} */
	@Override
	public float[] crossT(ITup3RF t, float[] res)
	{
		return VecUtils3F.cross(this, t, res);
	}

	/** {@inheritDoc} */
	@Override
	public float[] crossT(ITupRF t, float[] res)
	{
		return VecUtils3F.cross(this, t, res);
	}

	/** {@inheritDoc} */
	@Override
	public float[] crossT(float[] t, float[] res)
	{
		return VecUtils3F.cross(this, t, res);
	}

	/** {@inheritDoc} */
	@Override
	public float[] crossT(float tv0, float tv1, float tv2, float[] res)
	{
		return VecUtils3F.cross(this, tv0, tv1, tv2, res);
	}
	
	/** {@inheritDoc} */
	@Override
	public <T extends ITup3WF> T crossT(ITup3RF t, T res)
	{
		return VecUtils3F.cross(this, t, res);
	}

	/** {@inheritDoc} */
	@Override
	public <T extends ITup3WF> T crossT(ITupRF t, T res)
	{
		return VecUtils3F.cross(this, t, res);
	}

	/** {@inheritDoc} */
	@Override
	public <T extends ITup3WF> T crossT(float[] t, T res)
	{
		return VecUtils3F.cross(this, t, res);
	}

	/** {@inheritDoc} */
	@Override
	public <T extends ITup3WF> T crossT(float tv0, float tv1, float tv2, T res)
	{
		return VecUtils3F.cross(this, tv0, tv1, tv2, res);
	}

	/** {@inheritDoc} */
	@Override
	public IVec3WF rCross(ITup3RF t)
	{
		return VecUtils3F.cross(t, this, this);
	}

	/** {@inheritDoc} */
	@Override
	public IVec3WF rCross(ITupRF t)
	{
		return VecUtils3F.cross(t, this, this);
	}

	/** {@inheritDoc} */
	@Override
	public IVec3WF rCross(float[] t)
	{
		return VecUtils3F.cross(t, this, this);
	}

	/** {@inheritDoc} */
	@Override
	public IVec3WF rCross(float tv0, float tv1, float tv2)
	{
		return VecUtils3F.cross(tv0, tv1, tv2, this, this);
	}

	/** {@inheritDoc} */
	@Override
	public IVec3WF rCrossN(ITup3RF t)
	{
		return VecUtils3F.crossFunc(t, this, CTOR);
	}

	/** {@inheritDoc} */
	@Override
	public IVec3WF rCrossN(ITupRF t)
	{
		return VecUtils3F.crossFunc(t, this, CTOR);
	}

	/** {@inheritDoc} */
	@Override
	public IVec3WF rCrossN(float[] t)
	{
		return VecUtils3F.crossFunc(t, this, CTOR);
	}

	/** {@inheritDoc} */
	@Override
	public IVec3WF rCrossN(float tv0, float tv1, float tv2)
	{
		return VecUtils3F.crossFunc(tv0, tv1, tv2, this, CTOR);
	}
	
	/** {@inheritDoc} */
	@Override
	public float[] rCrossT(ITup3RF t, float[] res)
	{
		return VecUtils3F.cross(t, this, res);
	}

	/** {@inheritDoc} */
	@Override
	public float[] rCrossT(ITupRF t, float[] res)
	{
		return VecUtils3F.cross(t, this, res);
	}

	/** {@inheritDoc} */
	@Override
	public float[] rCrossT(float[] t, float[] res)
	{
		return VecUtils3F.cross(t, this, res);
	}

	/** {@inheritDoc} */
	@Override
	public float[] rCrossT(float tv0, float tv1, float tv2, float[] res)
	{
		return VecUtils3F.cross(tv0, tv1, tv2, this, res);
	}
	
	/** {@inheritDoc} */
	@Override
	public <T extends ITup3WF> T rCrossT(ITup3RF t, T res)
	{
		return VecUtils3F.cross(t, this, res);
	}

	/** {@inheritDoc} */
	@Override
	public <T extends ITup3WF> T rCrossT(ITupRF t, T res)
	{
		return VecUtils3F.cross(t, this, res);
	}

	/** {@inheritDoc} */
	@Override
	public <T extends ITup3WF> T rCrossT(float[] t, T res)
	{
		return VecUtils3F.cross(t, this, res);
	}

	/** {@inheritDoc} */
	@Override
	public <T extends ITup3WF> T rCrossT(float tv0, float tv1, float tv2, T res)
	{
		return VecUtils3F.cross(tv0, tv1, tv2, this, res);
	}
}
