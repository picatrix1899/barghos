package org.barghos.math.vector;

import java.util.Arrays;
import java.util.Objects;

import org.barghos.util.collection.IndexValuePairF;
import org.barghos.util.tuple.floats.ITup3RF;
import org.barghos.util.tuple.floats.ITup3WF;
import org.barghos.util.tuple.floats.ITupRF;
import org.barghos.util.tuple.floats.TupUtils3F;
import org.barghos.util.tuple.floats.ITupWF;

public class Vec3F implements IVec3WF
{
	public final float[] v = new float[SIZE];
	
	public Vec3F()
	{
		set(0.0f);
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
	
	public Vec3F(float value)
	{
		set(value);
	}
	
	public Vec3F(float x, float y, float z)
	{
		set(x, y, z);
	}
	
	@Override
	public Vec3F createNew()
	{
		return new Vec3F();
	}
	
	@Override
	public Vec3F createNew(ITup3RF t)
	{
		return new Vec3F(t);
	}
	
	@Override
	public Vec3F createNew(ITupRF t)
	{
		return new Vec3F(t);
	}

	@Override
	public Vec3F createNew(float[] t)
	{
		return new Vec3F(t);
	}

	@Override
	public Vec3F createNew(float value)
	{
		return new Vec3F(value);
	}

	@Override
	public Vec3F createNew(float x, float y, float z)
	{
		return new Vec3F(x, y, z);
	}

	@Override
	public float x()
	{
		return this.v[0];
	}

	@Override
	public float y()
	{
		return this.v[1];
	}

	@Override
	public float z()
	{
		return this.v[2];
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
	public float getAt(int index)
	{
		return this.v[index];
	}
	
	@Override
	public Vec3F x(float x)
	{
		this.v[0] = x;
		
		return this;
	}

	@Override
	public Vec3F y(float y)
	{
		this.v[1] = y;
		
		return this;
	}
	
	@Override
	public Vec3F z(float z)
	{
		this.v[2] = z;
		
		return this;
	}
	
	@Override
	public ITup3WF v0(float v0)
	{
		this.v[0] = v0;
		
		return this;
	}

	@Override
	public ITup3WF v1(float v1)
	{
		this.v[1] = v1;
		
		return this;
	}

	@Override
	public ITup3WF v2(float v2)
	{
		this.v[2] = v2;
		
		return this;
	}
	
	@Override
	public Vec3F set(ITup3RF t)
	{
		t.toArray(this.v);
		
		return this;
	}

	@Override
	public Vec3F set(ITupRF t)
	{
		t.toArray(this.v);
		
		return this;
	}

	@Override
	public Vec3F set(float[] values)
	{
		System.arraycopy(values, 0, this.v, 0, 3);
		
		return this;
	}
	
	@Override
	public Vec3F set(float value)
	{
		Arrays.fill(this.v, value);
		
		return this;
	}

	@Override
	public Vec3F set(float x, float y, float z)
	{
		this.v[0] = x;
		this.v[1] = y;
		this.v[2] = z;
		
		return this;
	}

	@Override
	public Vec3F setAt(int index, float value)
	{
		this.v[index] = value;
		
		return this;
	}

	@Override
	public float[] toArray()
	{
		return Arrays.copyOf(this.v, 3);
	}

	@Override
	public float[] toArray(float[] res)
	{
		System.arraycopy(this.v, 0, res, 0, 3);
		
		return res;
	}
	
	@Override
	public Vec3F copy()
	{
		return new Vec3F(this);
	}

	@Override
	public String toString()
	{
		return "vec3f(x=" + this.v[0] + ", y=" + this.v[1] + ", z=" + this.v[2] + ")";
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
		
		if(obj instanceof ITup3RF t)
		{
			return equals(t);
		}
		
		return false;
	}
	
	@Override
	public Vec3F add(ITup3RF t)
	{
		VecUtils3F.add(this.v, t, this.v);
		
		return this;
	}

	@Override
	public Vec3F add(ITupRF t)
	{
		VecUtils3F.add(this.v, t, this.v);
		
		return this;
	}
	
	@Override
	public Vec3F add(float[] t)
	{
		VecUtils3F.add(this.v, t, this.v);
		
		return this;
	}

	@Override
	public Vec3F add(float value)
	{
		VecUtils3F.add(this.v, value, value, value, this.v);
		
		return this;
	}

	@Override
	public Vec3F add(float tx, float ty, float tz)
	{
		VecUtils3F.add(this.v, tx, ty, tz, this.v);
		
		return this;
	}
	
	@Override
	public Vec3F addN(ITup3RF t)
	{
		return VecUtils3F.addCreateNew(this.v, t, this);
	}

	@Override
	public Vec3F addN(ITupRF t)
	{
		return VecUtils3F.addCreateNew(this.v, t, this);
	}
	
	@Override
	public Vec3F addN(float[] t)
	{
		return VecUtils3F.addCreateNew(this.v, t, this);
	}

	@Override
	public Vec3F addN(float value)
	{
		return VecUtils3F.addCreateNew(this.v, value, value, value, this);
	}

	@Override
	public Vec3F addN(float tx, float ty, float tz)
	{
		return VecUtils3F.addCreateNew(this.v, tx, ty, tz, this);
	}
	
	@Override
	public float[] addT(ITup3RF t, float[] res)
	{
		return VecUtils3F.add(this.v, t, res);
	}
	
	@Override
	public float[] addT(ITupRF t, float[] res)
	{
		return VecUtils3F.add(this.v, t, res);
	}
	
	@Override
	public float[] addT(float[] t, float[] res)
	{
		return VecUtils3F.add(this.v, t, res);
	}
	
	@Override
	public float[] addT(float value, float[] res)
	{
		return VecUtils3F.add(this.v, value, value, value, res);
	}

	@Override
	public float[] addT(float tx, float ty, float tz, float[] res)
	{
		return VecUtils3F.add(this.v, tx, ty, tz, res);
	}
	
	@Override
	public <T extends ITup3WF> T addT(ITup3RF t, T res)
	{
		return VecUtils3F.add(this.v, t, res);
	}

	@Override
	public <T extends ITup3WF> T addT(ITupRF t, T res)
	{
		return VecUtils3F.add(this.v, t, res);
	}
	
	@Override
	public <T extends ITup3WF> T addT(float[] t, T res)
	{
		return VecUtils3F.add(this.v, t, res);
	}
	
	@Override
	public <T extends ITup3WF> T addT(float value, T res)
	{
		return VecUtils3F.add(this.v, value, value, value, res);
	}

	@Override
	public <T extends ITup3WF> T addT(float tx, float ty, float tz, T res)
	{
		return VecUtils3F.add(this.v, tx, ty, tz, res);
	}

	@Override
	public Vec3F sub(ITup3RF t)
	{
		VecUtils3F.sub(this.v, t, this.v);
		
		return this;
	}

	@Override
	public Vec3F sub(ITupRF t)
	{
		VecUtils3F.sub(this.v, t, this.v);
		
		return this;
	}
	
	@Override
	public Vec3F sub(float[] t)
	{
		VecUtils3F.sub(this.v, t, this.v);
		
		return this;
	}

	@Override
	public Vec3F sub(float value)
	{
		VecUtils3F.sub(this.v, value, value, value, this.v);
		
		return this;
	}

	@Override
	public Vec3F sub(float tx, float ty, float tz)
	{
		VecUtils3F.sub(this.v, tx, ty, tz, this.v);
		
		return this;
	}
	
	@Override
	public Vec3F subN(ITup3RF t)
	{
		return VecUtils3F.subCreateNew(this.v, t, this);
	}

	@Override
	public Vec3F subN(ITupRF t)
	{
		return VecUtils3F.subCreateNew(this.v, t, this);
	}
	
	@Override
	public Vec3F subN(float[] t)
	{
		return VecUtils3F.subCreateNew(this.v, t, this);
	}

	@Override
	public Vec3F subN(float value)
	{
		return VecUtils3F.subCreateNew(this.v, value, value, value, this);
	}

	@Override
	public Vec3F subN(float tx, float ty, float tz)
	{
		return VecUtils3F.subCreateNew(this.v, tx, ty, tz, this);
	}
	
	@Override
	public float[] subT(ITup3RF t, float[] res)
	{
		return VecUtils3F.sub(this.v, t, res);
	}

	@Override
	public float[] subT(ITupRF t, float[] res)
	{
		return VecUtils3F.sub(this.v, t, res);
	}
	
	@Override
	public float[] subT(float[] t, float[] res)
	{
		return VecUtils3F.sub(this.v, t, res);
	}
	
	@Override
	public float[] subT(float value, float[] res)
	{
		return VecUtils3F.sub(this.v, value, value, value, res);
	}
	
	@Override
	public float[] subT(float tx, float ty, float tz, float[] res)
	{
		return VecUtils3F.sub(this.v, tx, ty, tz, res);
	}
	
	@Override
	public <T extends ITup3WF> T subT(ITup3RF t, T res)
	{
		return VecUtils3F.sub(this.v, t, res);
	}
	
	@Override
	public <T extends ITup3WF> T subT(ITupRF t, T res)
	{
		return VecUtils3F.sub(this.v, t, res);
	}
	
	@Override
	public <T extends ITup3WF> T subT(float[] t, T res)
	{
		return VecUtils3F.sub(this.v, t, res);
	}

	@Override
	public <T extends ITup3WF> T subT(float value, T res)
	{
		return VecUtils3F.sub(this.v, value, value, value, res);
	}

	@Override
	public <T extends ITup3WF> T subT(float tx, float ty, float tz, T res)
	{
		return VecUtils3F.sub(this.v, tx, ty, tz, res);
	}

	@Override
	public Vec3F rSub(ITup3RF t)
	{
		VecUtils3F.sub(t, this.v, this.v);
		
		return this;
	}

	@Override
	public Vec3F rSub(ITupRF t)
	{
		VecUtils3F.sub(t, this.v, this.v);
		
		return this;
	}
	
	@Override
	public Vec3F rSub(float[] t)
	{
		VecUtils3F.sub(t, this.v, this.v);
		
		return this;
	}

	@Override
	public Vec3F rSub(float value)
	{
		VecUtils3F.sub(value, value, value, this.v, this.v);
		
		return this;
	}

	@Override
	public Vec3F rSub(float tx, float ty, float tz)
	{
		VecUtils3F.sub(tx, ty, tz, this.v, this.v);
		
		return this;
	}
	
	@Override
	public Vec3F rSubN(ITup3RF t)
	{
		return VecUtils3F.subCreateNew(t, this.v, this);
	}

	@Override
	public Vec3F rSubN(ITupRF t)
	{
		return VecUtils3F.subCreateNew(t, this.v, this);
	}
	
	@Override
	public Vec3F rSubN(float[] t)
	{
		return VecUtils3F.subCreateNew(t, this.v, this);
	}

	@Override
	public Vec3F rSubN(float value)
	{
		return VecUtils3F.subCreateNew(value, value, value, this.v, this);
	}

	@Override
	public Vec3F rSubN(float tx, float ty, float tz)
	{
		return VecUtils3F.subCreateNew(tx, ty, tz, this.v, this);
	}
	
	@Override
	public float[] rSubT(ITup3RF t, float[] res)
	{
		return VecUtils3F.sub(t, this.v, res);
	}
	
	@Override
	public float[] rSubT(ITupRF t, float[] res)
	{
		return VecUtils3F.sub(t, this.v, res);
	}
	
	@Override
	public float[] rSubT(float[] t, float[] res)
	{
		return VecUtils3F.sub(t, this.v, res);
	}
	
	@Override
	public float[] rSubT(float value, float[] res)
	{
		return VecUtils3F.sub(value, value, value, this.v, res);
	}
	
	@Override
	public float[] rSubT(float tx, float ty, float tz, float[] res)
	{
		return VecUtils3F.sub(tx, ty, tz, this.v, res);
	}
	
	@Override
	public <T extends ITup3WF> T rSubT(ITup3RF t, T res)
	{
		return VecUtils3F.sub(t, this.v, res);
	}

	@Override
	public <T extends ITup3WF> T rSubT(ITupRF t, T res)
	{
		return VecUtils3F.sub(t, this.v, res);
	}
	
	@Override
	public <T extends ITup3WF> T rSubT(float[] t, T res)
	{
		return VecUtils3F.sub(t, this.v, res);
	}

	@Override
	public <T extends ITup3WF> T rSubT(float value, T res)
	{
		return VecUtils3F.sub(value, value, value, this.v, res);
	}

	@Override
	public <T extends ITup3WF> T rSubT(float tx, float ty, float tz, T res)
	{
		return VecUtils3F.sub(tx, ty, tz, this.v, res);
	}

	@Override
	public Vec3F mul(ITup3RF t)
	{
		VecUtils3F.mul(this.v, t, this.v);
		
		return this;
	}

	@Override
	public Vec3F mul(ITupRF t)
	{
		VecUtils3F.mul(this.v, t, this.v);
		
		return this;
	}
	
	@Override
	public Vec3F mul(float[] t)
	{
		VecUtils3F.mul(this.v, t, this.v);
		
		return this;
	}

	@Override
	public Vec3F mul(float value)
	{
		VecUtils3F.mul(this.v, value, value, value, this.v);
		
		return this;
	}

	@Override
	public Vec3F mul(float tx, float ty, float tz)
	{
		VecUtils3F.mul(this.v, tx, ty, tz, this.v);
		
		return this;
	}
	
	@Override
	public Vec3F mulN(ITup3RF t)
	{
		return VecUtils3F.mulCreateNew(this.v, t, this);
	}

	@Override
	public Vec3F mulN(ITupRF t)
	{
		return VecUtils3F.mulCreateNew(this.v, t, this);
	}
	
	@Override
	public Vec3F mulN(float[] t)
	{
		return VecUtils3F.mulCreateNew(this.v, t, this);
	}

	@Override
	public Vec3F mulN(float value)
	{
		return VecUtils3F.mulCreateNew(this.v, value, value, value, this);
	}

	@Override
	public Vec3F mulN(float tx, float ty, float tz)
	{
		return VecUtils3F.mulCreateNew(this.v, tx, ty, tz, this);
	}
	
	@Override
	public float[] mulT(ITup3RF t, float[] res)
	{
		return VecUtils3F.mul(this.v, t, res);
	}
	
	@Override
	public float[] mulT(ITupRF t, float[] res)
	{
		return VecUtils3F.mul(this.v, t, res);
	}
	
	@Override
	public float[] mulT(float[] t, float[] res)
	{
		return VecUtils3F.mul(this.v, t, res);
	}
	
	@Override
	public float[] mulT(float value, float[] res)
	{
		return VecUtils3F.mul(this.v, value, value, value, res);
	}
	
	@Override
	public float[] mulT(float tx, float ty, float tz, float[] res)
	{
		return VecUtils3F.mul(this.v, tx, ty, tz, res);
	}
	
	@Override
	public <T extends ITup3WF> T mulT(ITup3RF t, T res)
	{
		return VecUtils3F.mul(this.v, t, res);
	}

	@Override
	public <T extends ITup3WF> T mulT(ITupRF t, T res)
	{
		return VecUtils3F.mul(this.v, t, res);
	}
	
	@Override
	public <T extends ITup3WF> T mulT(float[] t, T res)
	{
		return VecUtils3F.mul(this.v, t, res);
	}

	@Override
	public <T extends ITup3WF> T mulT(float value, T res)
	{
		return VecUtils3F.mul(this.v, value, value, value, res);
	}

	@Override
	public <T extends ITup3WF> T mulT(float tx, float ty, float tz, T res)
	{
		return VecUtils3F.mul(this.v, tx, ty, tz, res);
	}

	@Override
	public Vec3F div(ITup3RF t)
	{
		VecUtils3F.div(this.v, t, this.v);
		
		return this;
	}


	@Override
	public Vec3F div(ITupRF t)
	{
		VecUtils3F.div(this.v, t, this.v);
		
		return this;
	}
	
	@Override
	public Vec3F div(float[] t)
	{
		VecUtils3F.div(this.v, t, this.v);
		
		return this;
	}

	@Override
	public Vec3F div(float value)
	{
		VecUtils3F.div(this.v, value, value, value, this.v);
		
		return this;
	}

	@Override
	public Vec3F div(float tx, float ty, float tz)
	{
		VecUtils3F.div(this.v, tx, ty, tz, this.v);
		
		return this;
	}
	
	@Override
	public Vec3F divN(ITup3RF t)
	{
		return VecUtils3F.divCreateNew(this.v, t, this);
	}

	@Override
	public Vec3F divN(ITupRF t)
	{
		return VecUtils3F.divCreateNew(this.v, t, this);
	}
	
	@Override
	public Vec3F divN(float[] t)
	{
		return VecUtils3F.divCreateNew(this.v, t, this);
	}

	@Override
	public Vec3F divN(float value)
	{
		return VecUtils3F.divCreateNew(this.v, value, value, value, this);
	}

	@Override
	public Vec3F divN(float tx, float ty, float tz)
	{
		return VecUtils3F.divCreateNew(this.v, tx, ty, tz, this);
	}
	
	@Override
	public float[] divT(ITup3RF t, float[] res)
	{
		return VecUtils3F.div(this.v, t, res);
	}
	
	@Override
	public float[] divT(ITupRF t, float[] res)
	{
		return VecUtils3F.div(this.v, t, res);
	}
	
	@Override
	public float[] divT(float[] t, float[] res)
	{
		return VecUtils3F.div(this.v, t, res);
	}
	
	@Override
	public float[] divT(float value, float[] res)
	{
		return VecUtils3F.div(this.v, value, value, value, res);
	}
	
	@Override
	public float[] divT(float tx, float ty, float tz, float[] res)
	{
		return VecUtils3F.div(this.v, tx, ty ,tz, res);
	}
	
	@Override
	public <T extends ITup3WF> T divT(ITup3RF t, T res)
	{
		return VecUtils3F.div(this.v, t, res);
	}

	@Override
	public <T extends ITup3WF> T divT(ITupRF t, T res)
	{
		return VecUtils3F.div(this.v, t, res);
	}
	
	@Override
	public <T extends ITup3WF> T divT(float[] t, T res)
	{
		return VecUtils3F.div(this.v, t, res);
	}

	@Override
	public <T extends ITup3WF> T divT(float value, T res)
	{
		return VecUtils3F.div(this.v, value, value, value, res);
	}
	
	@Override
	public <T extends ITup3WF> T divT(float tx, float ty, float tz, T res)
	{
		return VecUtils3F.div(this.v, tx, ty, tz, res);
	}

	@Override
	public Vec3F rDiv(ITup3RF t)
	{
		VecUtils3F.div(t, this.v, this.v);
		
		return this;
	}

	@Override
	public Vec3F rDiv(ITupRF t)
	{
		VecUtils3F.div(t, this.v, this.v);
		
		return this;
	}
	
	@Override
	public Vec3F rDiv(float[] t)
	{
		VecUtils3F.div(t, this.v, this.v);
		
		return this;
	}

	@Override
	public Vec3F rDiv(float value)
	{
		VecUtils3F.div(value, value, value, this.v, this.v);
		
		return this;
	}

	@Override
	public Vec3F rDiv(float tx, float ty, float tz)
	{
		VecUtils3F.div(tx, ty, tz, this.v, this.v);
		
		return this;
	}
	
	@Override
	public Vec3F rDivN(ITup3RF t)
	{
		return VecUtils3F.divCreateNew(t, this.v, this);
	}

	@Override
	public Vec3F rDivN(ITupRF t)
	{
		return VecUtils3F.divCreateNew(t, this.v, this);
	}
	
	@Override
	public Vec3F rDivN(float[] t)
	{
		return VecUtils3F.divCreateNew(t, this.v, this);
	}

	@Override
	public Vec3F rDivN(float value)
	{
		return VecUtils3F.divCreateNew(value, value, value, this.v, this);
	}

	@Override
	public Vec3F rDivN(float tx, float ty, float tz)
	{
		return VecUtils3F.divCreateNew(tx, ty, tz, this.v, this);
	}
	
	@Override
	public float[] rDivT(ITup3RF t, float[] res)
	{
		return VecUtils3F.div(t, this.v, res);
	}
	
	@Override
	public float[] rDivT(ITupRF t, float[] res)
	{
		return VecUtils3F.div(t, this.v, res);
	}
	
	@Override
	public float[] rDivT(float[] t, float[] res)
	{
		return VecUtils3F.div(t, this.v, res);
	}
	
	@Override
	public float[] rDivT(float value, float[] res)
	{
		return VecUtils3F.div(value, value, value, this.v, res);
	}
	
	@Override
	public float[] rDivT(float tx, float ty, float tz, float[] res)
	{
		return VecUtils3F.div(tx, ty, tz, this.v, res);
	}
	
	@Override
	public <T extends ITup3WF> T rDivT(ITup3RF t, T res)
	{
		return VecUtils3F.div(t, this.v, res);
	}

	@Override
	public <T extends ITup3WF> T rDivT(ITupRF t, T res)
	{
		return VecUtils3F.div(t, this.v, res);
	}
	
	@Override
	public <T extends ITup3WF> T rDivT(float[] t, T res)
	{
		return VecUtils3F.div(t, this.v, res);
	}

	@Override
	public <T extends ITup3WF> T rDivT(float value, T res)
	{
		return VecUtils3F.div(value, value, value, this.v, res);
	}

	@Override
	public <T extends ITup3WF> T rDivT(float tx, float ty, float tz, T res)
	{
		return VecUtils3F.div(tx, ty, tz, this.v, res);
	}
	
	@Override
	public float len()
	{
		return VecUtils3F.len(this.v);
	}

	@Override
	public float len(float tolerance)
	{
		return VecUtils3F.len(tolerance, this.v);
	}

	@Override
	public float recLen()
	{
		return VecUtils3F.recLen(this.v);
	}

	@Override
	public float lenTo(ITup3RF t)
	{
		return VecUtils3F.lenTo(this.v, t);
	}

	@Override
	public float lenTo(ITupRF t)
	{
		return VecUtils3F.lenTo(this.v, t);
	}
	
	@Override
	public float lenTo(float tolerance, ITup3RF t)
	{
		return VecUtils3F.lenTo(tolerance, this.v, t);
	}

	@Override
	public float lenTo(float tolerance, ITupRF t)
	{
		return VecUtils3F.lenTo(tolerance, this.v, t);
	}
	
	@Override
	public float lenTo(float[] t)
	{
		return VecUtils3F.lenTo(this.v, t);
	}

	@Override
	public float lenTo(float tolerance, float[] t)
	{
		return VecUtils3F.lenTo(tolerance, this.v, t);
	}

	@Override
	public float lenTo(float tx, float ty, float tz)
	{
		return VecUtils3F.lenTo(this.v, tx, ty, tz);
	}

	@Override
	public float lenTo(float tolerance, float tx, float ty, float tz)
	{
		return VecUtils3F.lenTo(tolerance, this.v, tx, ty, tz);
	}

	@Override
	public float recLenTo(ITup3RF t)
	{
		return VecUtils3F.recLenTo(this.v, t);
	}

	@Override
	public float recLenTo(ITupRF t)
	{
		return VecUtils3F.recLenTo(this.v, t);
	}
	
	@Override
	public float recLenTo(float[] t)
	{
		return VecUtils3F.recLenTo(this.v, t);
	}

	@Override
	public float recLenTo(float tx, float ty, float tz)
	{
		return VecUtils3F.recLenTo(this.v, tx, ty, tz);
	}

	@Override
	public float sqrLen()
	{
		return VecUtils3F.sqrLen(this.v);
	}

	@Override
	public float sqrLenTo(ITup3RF t)
	{
		return VecUtils3F.sqrLenTo(this.v, t);
	}

	@Override
	public float sqrLenTo(ITupRF t)
	{
		return VecUtils3F.sqrLenTo(this.v, t);
	}
	
	@Override
	public float sqrLenTo(float[] t)
	{
		return VecUtils3F.sqrLenTo(this.v, t);
	}

	@Override
	public float sqrLenTo(float tx, float ty, float tz)
	{
		return VecUtils3F.sqrLenTo(this.v, tx, ty, tz);
	}

	@Override
	public float dot(ITup3RF t)
	{
		return VecUtils3F.dot(this.v, t);
	}

	@Override
	public float dot(ITupRF t)
	{
		return VecUtils3F.dot(this.v, t);
	}
	
	@Override
	public float dot(float[] t)
	{
		return VecUtils3F.dot(this.v, t);
	}

	@Override
	public float dot(float tx, float ty, float tz)
	{
		return VecUtils3F.dot(this.v, tx, ty, tz);
	}
	
	@Override
	public Vec3F halfVecTo(ITup3RF t)
	{
		VecUtils3F.halfVecTo(this.v, t, this.v);
		
		return this;
	}

	@Override
	public Vec3F halfVecTo(ITupRF t)
	{
		VecUtils3F.halfVecTo(this.v, t, this.v);
		
		return this;
	}
	
	@Override
	public Vec3F halfVecTo(float[] t)
	{
		VecUtils3F.halfVecTo(this.v, t, this.v);
		
		return this;
	}

	@Override
	public Vec3F halfVecTo(float tx, float ty, float tz)
	{
		VecUtils3F.halfVecTo(this.v, tx, ty, tz, this.v);
		
		return this;
	}
	
	@Override
	public Vec3F halfVecToN(ITup3RF t)
	{
		return VecUtils3F.halfVecToCreateNew(this.v, t, this);
	}

	@Override
	public Vec3F halfVecToN(ITupRF t)
	{
		return VecUtils3F.halfVecToCreateNew(this.v, t, this);
	}
	
	@Override
	public Vec3F halfVecToN(float[] t)
	{
		return VecUtils3F.halfVecToCreateNew(this.v, t, this);
	}

	@Override
	public Vec3F halfVecToN(float tx, float ty, float tz)
	{
		return VecUtils3F.halfVecToCreateNew(this.v, tx, ty, tz, this);
	}
	
	@Override
	public float[] halfVecToT(ITup3RF t, float[] res)
	{
		return VecUtils3F.halfVecTo(this.v, t, res);
	}
	
	@Override
	public float[] halfVecToT(ITupRF t, float[] res)
	{
		return VecUtils3F.halfVecTo(this.v, t, res);
	}
	
	@Override
	public float[] halfVecToT(float[] t, float[] res)
	{
		return VecUtils3F.halfVecTo(this.v, t, res);
	}
	
	@Override
	public float[] halfVecToT(float tx, float ty, float tz, float[] res)
	{
		return VecUtils3F.halfVecTo(this.v, tx, ty, tz, res);
	}
	
	@Override
	public <T extends ITup3WF> T halfVecToT(ITup3RF t, T res)
	{
		return VecUtils3F.halfVecTo(this.v, t, res);
	}

	@Override
	public <T extends ITup3WF> T halfVecToT(ITupRF t, T res)
	{
		return VecUtils3F.halfVecTo(this.v, t, res);
	}
	
	@Override
	public <T extends ITup3WF> T halfVecToT(float[] t, T res)
	{
		return VecUtils3F.halfVecTo(this.v, t, res);
	}

	@Override
	public <T extends ITup3WF> T halfVecToT(float tx, float ty, float tz, T res)
	{
		return VecUtils3F.halfVecTo(this.v, tx, ty, tz, res);
	}

	@Override
	public Vec3F midPointTo(ITup3RF t)
	{
		VecUtils3F.midPointTo(this.v, t, this.v);
		
		return this;
	}

	@Override
	public Vec3F midPointTo(ITupRF t)
	{
		VecUtils3F.midPointTo(this.v, t, this.v);
		
		return this;
	}
	
	@Override
	public Vec3F midPointTo(float[] t)
	{
		VecUtils3F.midPointTo(this.v, t, this.v);
		
		return this;
	}

	@Override
	public Vec3F midPointTo(float tx, float ty, float tz)
	{
		VecUtils3F.midPointTo(this.v, tx, ty, tz, this.v);
		
		return this;
	}
	
	@Override
	public Vec3F midPointToN(ITup3RF t)
	{
		return VecUtils3F.midPointToCreateNew(this.v, t, this);
	}

	@Override
	public Vec3F midPointToN(ITupRF t)
	{
		return VecUtils3F.midPointToCreateNew(this.v, t, this);
	}
	
	@Override
	public Vec3F midPointToN(float[] t)
	{
		return VecUtils3F.midPointToCreateNew(this.v, t, this);
	}

	@Override
	public Vec3F midPointToN(float tx, float ty, float tz)
	{
		return VecUtils3F.midPointToCreateNew(this.v, tx, ty, tz, this);
	}
	
	@Override
	public float[] midPointToT(ITup3RF t, float[] res)
	{
		return VecUtils3F.midPointTo(this.v, t, res);
	}

	@Override
	public float[] midPointToT(ITupRF t, float[] res)
	{
		return VecUtils3F.midPointTo(this.v, t, res);
	}
	
	@Override
	public float[] midPointToT(float[] t, float[] res)
	{
		return VecUtils3F.midPointTo(this.v, t, res);
	}
	
	@Override
	public float[] midPointToT(float tx, float ty, float tz, float[] res)
	{
		return VecUtils3F.midPointTo(this.v, tx, ty, tz, res);
	}
	
	@Override
	public <T extends ITup3WF> T midPointToT(ITup3RF t, T res)
	{
		return VecUtils3F.midPointTo(this.v, t, res);
	}

	@Override
	public <T extends ITup3WF> T midPointToT(ITupRF t, T res)
	{
		return VecUtils3F.midPointTo(this.v, t, res);
	}
	
	@Override
	public <T extends ITup3WF> T midPointToT(float[] t, T res)
	{
		return VecUtils3F.midPointTo(this.v, t, res);
	}

	@Override
	public <T extends ITup3WF> T midPointToT(float tx, float ty, float tz, T res)
	{
		return VecUtils3F.midPointTo(this.v, tx, ty, tz, res);
	}

	@Override
	public Vec3F neg()
	{
		VecUtils3F.neg(this.v, this.v);
		
		return this;
	}
	
	@Override
	public Vec3F negN()
	{
		return VecUtils3F.negCreateNew(this.v, this);
	}
	
	@Override
	public float[] negT(float[] res)
	{
		return VecUtils3F.neg(this.v, res);
	}
	
	@Override
	public <T extends ITup3WF> T negT(T res)
	{
		return VecUtils3F.neg(this.v, res);
	}

	@Override
	public Vec3F rec()
	{
		VecUtils3F.rec(this.v, this.v);
		
		return this;
	}
	
	@Override
	public Vec3F recN()
	{
		return VecUtils3F.recCreateNew(this.v, this);
	}
	
	@Override
	public float[] recT(float[] res)
	{
		return VecUtils3F.rec(this.v, res);
	}
	
	@Override
	public <T extends ITup3WF> T recT(T res)
	{
		return VecUtils3F.rec(this.v, res);
	}

	@Override
	public Vec3F nrm()
	{
		VecUtils3F.nrm(this.v, this.v);
		
		return this;
	}
	
	@Override
	public Vec3F nrmN()
	{
		return VecUtils3F.nrmCreateNew(this.v, this);
	}
	
	@Override
	public float[] nrmT(float[] res)
	{
		return VecUtils3F.nrm(this.v, res);
	}
	
	@Override
	public <T extends ITup3WF> T nrmT(T res)
	{
		return VecUtils3F.nrm(this.v, res);
	}

	@Override
	public Vec3F project(ITup3RF t)
	{
		VecUtils3F.project(this.v, t, this.v);
		
		return this;
	}

	@Override
	public Vec3F project(ITupRF t)
	{
		VecUtils3F.project(this.v, t, this.v);
		
		return this;
	}
	
	@Override
	public Vec3F project(float[] t)
	{
		VecUtils3F.project(this.v, t, this.v);
		
		return this;
	}

	@Override
	public Vec3F project(float tx, float ty, float tz)
	{
		VecUtils3F.project(this.v, tx, ty, tz, this.v);
		
		return this;
	}
	
	@Override
	public Vec3F projectN(ITup3RF t)
	{
		return VecUtils3F.projectCreateNew(this.v, t, this);
	}

	@Override
	public Vec3F projectN(ITupRF t)
	{
		return VecUtils3F.projectCreateNew(this.v, t, this);
	}
	
	@Override
	public Vec3F projectN(float[] t)
	{
		return VecUtils3F.projectCreateNew(this.v, t, this);
	}

	@Override
	public Vec3F projectN(float tx, float ty, float tz)
	{
		return VecUtils3F.projectCreateNew(this.v, tx, ty, tz, this);
	}
	
	@Override
	public float[] projectT(ITup3RF t, float[] res)
	{
		return VecUtils3F.project(this.v, t, res);
	}

	@Override
	public float[] projectT(ITupRF t, float[] res)
	{
		return VecUtils3F.project(this.v, t, res);
	}
	
	@Override
	public float[] projectT(float[] t, float[] res)
	{
		return VecUtils3F.project(this.v, t, res);
	}

	@Override
	public float[] projectT(float tx, float ty,float tz, float[] res)
	{
		return VecUtils3F.project(this.v, tx, ty, tz, res);
	}
	
	@Override
	public <T extends ITup3WF> T projectT(ITup3RF t, T res)
	{
		return VecUtils3F.project(this.v, t, res);
	}

	@Override
	public <T extends ITup3WF> T projectT(ITupRF t, T res)
	{
		return VecUtils3F.project(this.v, t, res);
	}
	
	@Override
	public <T extends ITup3WF> T projectT(float[] t, T res)
	{
		return VecUtils3F.project(this.v, t, res);
	}

	@Override
	public <T extends ITup3WF> T projectT(float tx, float ty, float tz, T res)
	{
		return VecUtils3F.project(this.v, tx, ty, tz, res);
	}

	@Override
	public Vec3F reflect(ITup3RF n)
	{
		VecUtils3F.reflect(this.v, n, this.v);
		
		return this;
	}

	@Override
	public Vec3F reflect(ITupRF n)
	{
		VecUtils3F.reflect(this.v, n, this.v);
		
		return this;
	}
	
	@Override
	public Vec3F reflect(float[] n)
	{
		VecUtils3F.reflect(this.v, n, this.v);
		
		return this;
	}

	@Override
	public Vec3F reflect(float nx, float ny, float nz)
	{
		VecUtils3F.reflect(this.v, nx, ny, nz, this.v);
		
		return this;
	}
	
	@Override
	public Vec3F reflectN(ITup3RF n)
	{
		return VecUtils3F.reflectCreateNew(this.v, n, this);
	}

	@Override
	public Vec3F reflectN(ITupRF n)
	{
		return VecUtils3F.reflectCreateNew(this.v, n, this);
	}
	
	@Override
	public Vec3F reflectN(float[] n)
	{
		return VecUtils3F.reflectCreateNew(this.v, n, this);
	}

	@Override
	public Vec3F reflectN(float nx, float ny, float nz)
	{
		return VecUtils3F.reflectCreateNew(this.v, nx, ny, nz, this);
	}
	
	@Override
	public float[] reflectT(ITup3RF n, float[] res)
	{
		return VecUtils3F.reflect(this.v, n, res);
	}

	@Override
	public float[] reflectT(ITupRF n, float[] res)
	{
		return VecUtils3F.reflect(this.v, n, res);
	}
	
	@Override
	public float[] reflectT(float[] n, float[] res)
	{
		return VecUtils3F.reflect(this.v, n, res);
	}

	@Override
	public float[] reflectT(float nx, float ny, float nz, float[] res)
	{
		return VecUtils3F.reflect(this.v, nx, ny, nz, res);
	}
	
	@Override
	public <T extends ITup3WF> T reflectT(ITup3RF n, T res)
	{
		return VecUtils3F.reflect(this.v, n, res);
	}

	@Override
	public <T extends ITup3WF> T reflectT(ITupRF n, T res)
	{
		return VecUtils3F.reflect(this.v, n, res);
	}
	
	@Override
	public <T extends ITup3WF> T reflectT(float[] n, T res)
	{
		return VecUtils3F.reflect(this.v, n, res);
	}

	@Override
	public <T extends ITup3WF> T reflectT(float nx, float ny, float nz, T res)
	{
		return VecUtils3F.reflect(this.v, nx, ny, nz, res);
	}

	@Override
	public Vec3F abs()
	{
		VecUtils3F.abs(this.v, this.v);
		
		return this;
	}
	
	@Override
	public Vec3F absN()
	{
		return VecUtils3F.absCreateNew(this.v, this);
	}
	
	@Override
	public float[] absT(float[] res)
	{
		return VecUtils3F.abs(this.v, res);
	}
	
	@Override
	public <T extends ITup3WF> T absT(T res)
	{
		return VecUtils3F.abs(this.v, res);
	}

	@Override
	public Vec3F sign()
	{
		VecUtils3F.sign(this.v, this.v);
		
		return this;
	}

	@Override
	public Vec3F signN()
	{
		return VecUtils3F.signCreateNew(this.v, this);
	}

	@Override
	public float[] signT(float[] res)
	{
		return VecUtils3F.sign(this.v, res);
	}
	
	@Override
	public <T extends ITup3WF> T signT(T res)
	{
		return VecUtils3F.sign(this.v, res);
	}

	@Override
	public boolean isFiniteAt(int index)
	{
		return TupUtils3F.Comp.isFiniteAt(index, this.v);
	}

	@Override
	public boolean isFiniteAtV0()
	{
		return TupUtils3F.Comp.isFiniteAtV0(this.v);
	}

	@Override
	public boolean isFiniteAtV1()
	{
		return TupUtils3F.Comp.isFiniteAtV1(this.v);
	}

	@Override
	public boolean isFiniteAtV2()
	{
		return TupUtils3F.Comp.isFiniteAtV2(this.v);
	}
	
	@Override
	public boolean isZeroAt(int index)
	{
		return TupUtils3F.Comp.isZeroAt(index, this.v);
	}

	@Override
	public boolean isZeroAt(float tolerance, int index)
	{
		return TupUtils3F.Comp.isZeroAt(tolerance, index, this.v);
	}

	@Override
	public boolean isZeroAtV0()
	{
		return TupUtils3F.Comp.isZeroAtV0(this.v);
	}

	@Override
	public boolean isZeroAtV1()
	{
		return TupUtils3F.Comp.isZeroAtV1(this.v);
	}

	@Override
	public boolean isZeroAtV2()
	{
		return TupUtils3F.Comp.isZeroAtV2(this.v);
	}
	
	@Override
	public boolean isZeroAtV0(float tolerance)
	{
		return TupUtils3F.Comp.isZeroAtV0(tolerance, this.v);
	}

	@Override
	public boolean isZeroAtV1(float tolerance)
	{
		return TupUtils3F.Comp.isZeroAtV1(tolerance, this.v);
	}

	@Override
	public boolean isZeroAtV2(float tolerance)
	{
		return TupUtils3F.Comp.isZeroAtV2(tolerance, this.v);
	}
	
	@Override
	public boolean equals(ITup3RF t)
	{
		return TupUtils3F.Comp.equals(this.v, t);
	}

	@Override
	public boolean equals(ITupRF t)
	{
		return TupUtils3F.Comp.equals(this.v, t);
	}

	@Override
	public boolean equals(float[] t)
	{
		return TupUtils3F.Comp.equals(this.v, t);
	}

	@Override
	public boolean equals(float tv0, float tv1, float tv2)
	{
		return TupUtils3F.Comp.equals(this.v, tv0, tv1, tv2);
	}

	@Override
	public boolean equals(float tolerance, ITup3RF t)
	{
		return TupUtils3F.Comp.equals(tolerance, this.v, t);
	}

	@Override
	public boolean equals(float tolerance, ITupRF t)
	{
		return TupUtils3F.Comp.equals(tolerance, this.v, t);
	}

	@Override
	public boolean equals(float tolerance, float[] t)
	{
		return TupUtils3F.Comp.equals(tolerance, this.v, t);
	}

	@Override
	public boolean equals(float tolerance, float tv0, float tv1, float tv2)
	{
		return TupUtils3F.Comp.equals(tolerance, this.v, tv0, tv1, tv2);
	}

	@Override
	public boolean equalsAt(int index, ITup3RF t)
	{
		return TupUtils3F.Comp.equalsAt(index, this.v, t);
	}

	@Override
	public boolean equalsAt(int index, ITupRF t)
	{
		return TupUtils3F.Comp.equalsAt(index, this.v, t);
	}

	@Override
	public boolean equalsAt(int index, float[] t)
	{
		return TupUtils3F.Comp.equalsAt(index, this.v, t);
	}

	@Override
	public boolean equalsAt(int index, float value)
	{
		return TupUtils3F.Comp.equalsAt(index, this.v, value);
	}

	@Override
	public boolean equalsAt(float tolerance, int index, ITup3RF t)
	{
		return TupUtils3F.Comp.equalsAt(tolerance, index, this.v, t);
	}

	@Override
	public boolean equalsAt(float tolerance, int index, ITupRF t)
	{
		return TupUtils3F.Comp.equalsAt(tolerance, index, this.v, t);
	}

	@Override
	public boolean equalsAt(float tolerance, int index, float[] t)
	{
		return TupUtils3F.Comp.equalsAt(tolerance, index, this.v, t);
	}

	@Override
	public boolean equalsAt(float tolerance, int index, float value)
	{
		return TupUtils3F.Comp.equalsAt(tolerance, index, this.v, value);
	}

	@Override
	public boolean equalsAtV0(ITup3RF t)
	{
		return TupUtils3F.Comp.equalsAtV0(this.v, t);
	}

	@Override
	public boolean equalsAtV0(ITupRF t)
	{
		return TupUtils3F.Comp.equalsAtV0(this.v, t);
	}

	@Override
	public boolean equalsAtV0(float[] t)
	{
		return TupUtils3F.Comp.equalsAtV0(this.v, t);
	}

	@Override
	public boolean equalsAtV0(float value)
	{
		return TupUtils3F.Comp.equalsAtV0(this.v, value);
	}

	@Override
	public boolean equalsAtV1(ITup3RF t)
	{
		return TupUtils3F.Comp.equalsAtV1(this.v, t);
	}

	@Override
	public boolean equalsAtV1(ITupRF t)
	{
		return TupUtils3F.Comp.equalsAtV1(this.v, t);
	}

	@Override
	public boolean equalsAtV1(float[] t)
	{
		return TupUtils3F.Comp.equalsAtV1(this.v, t);
	}

	@Override
	public boolean equalsAtV1(float value)
	{
		return TupUtils3F.Comp.equalsAtV1(this.v, value);
	}

	@Override
	public boolean equalsAtV2(ITup3RF t)
	{
		return TupUtils3F.Comp.equalsAtV2(this.v, t);
	}

	@Override
	public boolean equalsAtV2(ITupRF t)
	{
		return TupUtils3F.Comp.equalsAtV2(this.v, t);
	}

	@Override
	public boolean equalsAtV2(float[] t)
	{
		return TupUtils3F.Comp.equalsAtV2(this.v, t);
	}

	@Override
	public boolean equalsAtV2(float value)
	{
		return TupUtils3F.Comp.equalsAtV2(this.v, value);
	}
	
	@Override
	public boolean equalsAtV0(float tolerance, ITup3RF t)
	{
		return TupUtils3F.Comp.equalsAtV0(tolerance, this.v, t);
	}

	@Override
	public boolean equalsAtV0(float tolerance, ITupRF t)
	{
		return TupUtils3F.Comp.equalsAtV0(tolerance, this.v, t);
	}

	@Override
	public boolean equalsAtV0(float tolerance, float[] t)
	{
		return TupUtils3F.Comp.equalsAtV0(tolerance, this.v, t);
	}

	@Override
	public boolean equalsAtV0(float tolerance, float value)
	{
		return TupUtils3F.Comp.equalsAtV0(tolerance, this.v, value);
	}

	@Override
	public boolean equalsAtV1(float tolerance, ITup3RF t)
	{
		return TupUtils3F.Comp.equalsAtV1(tolerance, this.v, t);
	}

	@Override
	public boolean equalsAtV1(float tolerance, ITupRF t)
	{
		return TupUtils3F.Comp.equalsAtV1(tolerance, this.v, t);
	}

	@Override
	public boolean equalsAtV1(float tolerance, float[] t)
	{
		return TupUtils3F.Comp.equalsAtV1(tolerance, this.v, t);
	}

	@Override
	public boolean equalsAtV1(float tolerance, float value)
	{
		return TupUtils3F.Comp.equalsAtV1(tolerance, this.v, value);
	}

	@Override
	public boolean equalsAtV2(float tolerance, ITup3RF t)
	{
		return TupUtils3F.Comp.equalsAtV2(tolerance, this.v, t);
	}

	@Override
	public boolean equalsAtV2(float tolerance, ITupRF t)
	{
		return TupUtils3F.Comp.equalsAtV2(tolerance, this.v, t);
	}

	@Override
	public boolean equalsAtV2(float tolerance, float[] t)
	{
		return TupUtils3F.Comp.equalsAtV2(tolerance, this.v, t);
	}

	@Override
	public boolean equalsAtV2(float tolerance, float value)
	{
		return TupUtils3F.Comp.equalsAtV2(tolerance, this.v, value);
	}
	
	@Override
	public Vec3F arrange(int[] indices)
	{
		TupUtils3F.arrange(this.v, indices, this.v);
		
		return this;
	}
	
	@Override
	public Vec3F arrangeN(int[] indices)
	{
		return TupUtils3F.arrange(this.v, indices, createNew());
	}
	
	@Override
	public float[] arrangeT(int[] indices, float[] res)
	{
		return TupUtils3F.arrange(this.v, indices, res);
	}
	
	@Override
	public <T extends ITup3WF> T arrangeT(int[] indices, T res)
	{
		return TupUtils3F.arrange(this.v, indices, res);
	}

	@Override
	public <T extends ITupWF> T arrangeT(int[] indices, T res)
	{
		throw new UnsupportedOperationException("Not implemented yet.");
	}
	
	@Override
	public Vec3F arrange(int indexX, int indexY, int indexZ)
	{
		TupUtils3F.arrange(this.v, indexX, indexY, indexZ, this.v);
		
		return this;
	}
	
	@Override
	public Vec3F arrangeN(int indexX, int indexY, int indexZ)
	{
		return TupUtils3F.arrangeCreateNew(this.v, indexX, indexY, indexZ, this);
	}
	
	@Override
	public float[] arrangeT(int indexX, int indexY, int indexZ, float[] res)
	{
		return TupUtils3F.arrange(this.v, indexX, indexY, indexZ, res);
	}
	
	@Override
	public <T extends ITup3WF> T arrangeT(int indexX, int indexY, int indexZ, T res)
	{
		return TupUtils3F.arrange(this.v, indexX, indexY, indexZ, res);
	}

	@Override
	public Vec3F swizzle(int indexA, int indexB)
	{
		TupUtils3F.swizzle(this.v, indexA, indexB, this.v);
		
		return this;
	}
	
	@Override
	public Vec3F swizzleN(int indexA, int indexB)
	{
		return TupUtils3F.swizzleCreateNew(this.v, indexA, indexB, this);
	}
	
	@Override
	public float[] swizzleT(int indexA, int indexB, float[] res)
	{
		return TupUtils3F.swizzle(this.v, indexA, indexB, res);
	}
	
	@Override
	public <T extends ITup3WF> T swizzleT(int indexA, int indexB, T res)
	{
		return TupUtils3F.swizzle(this.v, indexA, indexB, res);
	}

	@Override
	public <T extends ITupWF> T swizzleT(int indexA, int indexB, T res)
	{
		throw new UnsupportedOperationException("Not implemented yet.");
	}
	
	@Override
	public Vec3F swizzleV0V1()
	{
		TupUtils3F.swizzleV0V1(this.v, this.v);
		
		return this;
	}
	
	@Override
	public Vec3F swizzleV0V2()
	{
		TupUtils3F.swizzleV0V2(this.v, this.v);
		
		return this;
	}
	
	@Override
	public Vec3F swizzleV1V2()
	{
		TupUtils3F.swizzleV1V2(this.v, this.v);
		
		return this;
	}
	
	@Override
	public Vec3F swizzleV0V1N()
	{
		return TupUtils3F.swizzleV0V1CreateNew(this.v, this);
	}
	
	@Override
	public Vec3F swizzleV0V2N()
	{
		return TupUtils3F.swizzleV0V2CreateNew(this.v, this);
	}
	
	@Override
	public Vec3F swizzleV1V2N()
	{
		return TupUtils3F.swizzleV1V2CreateNew(this.v, this);
	}
	
	@Override
	public float[] swizzleV0V1T(float[] res)
	{
		return TupUtils3F.swizzleV0V1(this.v, res);
	}
	
	@Override
	public float[] swizzleV0V2T(float[] res)
	{
		return TupUtils3F.swizzleV0V2(this.v, res);
	}
	
	@Override
	public float[] swizzleV1V2T(float[] res)
	{
		return TupUtils3F.swizzleV1V2(this.v, res);
	}
	
	@Override
	public <T extends ITup3WF> T swizzleV0V1T(T res)
	{
		return TupUtils3F.swizzleV0V1(this.v, res);
	}

	@Override
	public <T extends ITup3WF> T swizzleV0V2T(T res)
	{
		return TupUtils3F.swizzleV0V2(this.v, res);
	}
	
	@Override
	public <T extends ITup3WF> T swizzleV1V2T(T res)
	{
		return TupUtils3F.swizzleV1V2(this.v, res);
	}
	
	@Override
	public Vec3F swizzleXY()
	{
		TupUtils3F.swizzleV0V1(this.v, this.v);
		
		return this;
	}
	
	@Override
	public Vec3F swizzleXZ()
	{
		TupUtils3F.swizzleV0V2(this.v, this.v);
		
		return this;
	}
	
	@Override
	public Vec3F swizzleYZ()
	{
		TupUtils3F.swizzleV1V2(this.v, this.v);
		
		return this;
	}
	
	@Override
	public Vec3F swizzleXYN()
	{
		return TupUtils3F.swizzleV0V1CreateNew(this.v, this);
	}
	
	@Override
	public Vec3F swizzleXZN()
	{
		return TupUtils3F.swizzleV0V2CreateNew(this.v, this);
	}
	
	@Override
	public Vec3F swizzleYZN()
	{
		return TupUtils3F.swizzleV1V2CreateNew(this.v, this);
	}
	
	@Override
	public boolean isFinite()
	{
		return TupUtils3F.Comp.isFinite(this.v);
	}

	@Override
	public boolean isZero()
	{
		return TupUtils3F.Comp.isZero(this.v);
	}

	@Override
	public boolean isZero(float tolerance)
	{
		return TupUtils3F.Comp.isZero(tolerance, this.v);
	}

	@Override
	public Vec3F minComponents(ITup3RF t)
	{
		TupUtils3F.minComponents(this.v, t, this.v);
		
		return this;
	}
	
	@Override
	public Vec3F minComponents(ITupRF t)
	{
		TupUtils3F.minComponents(this.v, t, this.v);
		
		return this;
	}

	@Override
	public Vec3F minComponents(float[] t)
	{
		TupUtils3F.minComponents(this.v, t, this.v);
		
		return this;
	}
	
	@Override
	public Vec3F minComponents(float tv0, float tv1, float tv2)
	{
		TupUtils3F.minComponents(this.v, tv0, tv1, tv2, this.v);
		
		return this;
	}
	
	@Override
	public Vec3F minComponentsN(ITup3RF t)
	{
		return TupUtils3F.minComponentsCreateNew(this.v, t, this);
	}

	@Override
	public Vec3F minComponentsN(ITupRF t)
	{
		return TupUtils3F.minComponentsCreateNew(this.v, t, this);
	}

	@Override
	public Vec3F minComponentsN(float[] t)
	{
		return TupUtils3F.minComponentsCreateNew(this.v, t, this);
	}
	
	@Override
	public Vec3F minComponentsN(float tv0, float tv1, float tv2)
	{
		return TupUtils3F.minComponentsCreateNew(this.v, tv0, tv1, tv2, this);
	}
	
	@Override
	public float[] minComponentsT(ITup3RF t, float[] res)
	{
		return TupUtils3F.minComponents(this.v, t, res);
	}
	
	@Override
	public float[] minComponentsT(ITupRF t, float[] res)
	{
		return TupUtils3F.minComponents(this.v, t, res);
	}
	
	@Override
	public float[] minComponentsT(float[] t, float[] res)
	{
		return TupUtils3F.minComponents(this.v, t, res);
	}
	
	@Override
	public float[] minComponentsT(float tv0, float tv1, float tv2, float[] res)
	{
		return TupUtils3F.minComponents(this.v, tv0, tv1, tv2, res);
	}
	
	@Override
	public <T extends ITup3WF> T minComponentsT(ITup3RF t, T res)
	{
		return TupUtils3F.minComponents(this.v, t, res);
	}

	@Override
	public <T extends ITup3WF> T minComponentsT(ITupRF t, T res)
	{
		return TupUtils3F.minComponents(this.v, t, res);
	}

	@Override
	public <T extends ITup3WF> T minComponentsT(float[] t, T res)
	{
		return TupUtils3F.minComponents(this.v, t, res);
	}
	
	@Override
	public <T extends ITup3WF> T minComponentsT(float tv0, float tv1, float tv2, T res)
	{
		return TupUtils3F.minComponents(this.v, tv0, tv1, tv2, res);
	}
	
	@Override
	public <T extends ITupWF> T minComponentsT(ITupRF t, T res)
	{
		throw new UnsupportedOperationException("Not implemented yet.");
	}
	
	@Override
	public Vec3F maxComponents(ITup3RF t)
	{
		TupUtils3F.maxComponents(this.v, t, this.v);
		
		return this;
	}
	
	@Override
	public Vec3F maxComponents(ITupRF t)
	{
		TupUtils3F.maxComponents(this.v, t, this.v);
		
		return this;
	}
	
	@Override
	public Vec3F maxComponents(float[] t)
	{
		TupUtils3F.maxComponents(this.v, t, this.v);
		
		return this;
	}
	
	@Override
	public Vec3F maxComponents(float tv0, float tv1, float tv2)
	{
		TupUtils3F.maxComponents(this.v, tv0, tv1, tv2, this.v);
		
		return this;
	}
	
	@Override
	public Vec3F maxComponentsN(ITup3RF t)
	{
		return TupUtils3F.maxComponentsCreateNew(this.v, t, this);
	}

	@Override
	public Vec3F maxComponentsN(ITupRF t)
	{
		return TupUtils3F.maxComponentsCreateNew(this.v, t, this);
	}

	@Override
	public Vec3F maxComponentsN(float[] t)
	{
		return TupUtils3F.maxComponentsCreateNew(this.v, t, this);
	}
	
	@Override
	public Vec3F maxComponentsN(float tv0, float tv1, float tv2)
	{
		return TupUtils3F.maxComponentsCreateNew(this.v, tv0, tv1, tv2, this);
	}
	
	@Override
	public float[] maxComponentsT(ITup3RF t, float[] res)
	{
		return TupUtils3F.maxComponents(this.v, t, res);
	}

	@Override
	public float[] maxComponentsT(ITupRF t, float[] res)
	{
		return TupUtils3F.maxComponents(this.v, t, res);
	}

	@Override
	public float[] maxComponentsT(float[] t, float[] res)
	{
		return TupUtils3F.maxComponents(this.v, t, res);
	}
	
	@Override
	public float[] maxComponentsT(float tv0, float tv1, float tv2, float[] res)
	{
		return TupUtils3F.maxComponents(this.v, tv0, tv1, tv2, res);
	}
	
	@Override
	public <T extends ITup3WF> T maxComponentsT(ITup3RF t, T res)
	{
		return TupUtils3F.maxComponents(this.v, t, res);
	}

	@Override
	public <T extends ITup3WF> T maxComponentsT(ITupRF t, T res)
	{
		return TupUtils3F.maxComponents(this.v, t, res);
	}
	
	@Override
	public <T extends ITup3WF> T maxComponentsT(float[] t, T res)
	{
		return TupUtils3F.maxComponents(this.v, t, res);
	}
	
	@Override
	public <T extends ITup3WF> T maxComponentsT(float tv0, float tv1, float tv2, T res)
	{
		return TupUtils3F.maxComponents(this.v, tv0, tv1, tv2, res);
	}
	
	@Override
	public <T extends ITupWF> T maxComponentsT(ITupRF t, T res)
	{
		throw new UnsupportedOperationException("Not implemented yet.");
	}

	@Override
	public IndexValuePairF min()
	{
		return TupUtils3F.min(this.v, new IndexValuePairF());
	}

	@Override
	public IndexValuePairF min(IndexValuePairF res)
	{
		return TupUtils3F.min(this.v, res);
	}

	@Override
	public IndexValuePairF max()
	{
		return TupUtils3F.max(this.v, new IndexValuePairF());
	}

	@Override
	public IndexValuePairF max(IndexValuePairF res)
	{
		return TupUtils3F.max(this.v, res);
	}
	
	@Override
	public IVec3WF cross(ITup3RF t)
	{
		return VecUtils3F.cross(this, t, this);
	}

	@Override
	public IVec3WF cross(ITupRF t)
	{
		return VecUtils3F.cross(this, t, this);
	}

	@Override
	public IVec3WF cross(float[] t)
	{
		return VecUtils3F.cross(this, t, this);
	}

	@Override
	public IVec3WF cross(float tv0, float tv1, float tv2)
	{
		return VecUtils3F.cross(this, tv0, tv1, tv2, this);
	}

	@Override
	public IVec3WF crossN(ITup3RF t)
	{
		return VecUtils3F.crossCreateNew(this, t, this);
	}

	@Override
	public IVec3WF crossN(ITupRF t)
	{
		return VecUtils3F.crossCreateNew(this, t, this);
	}

	@Override
	public IVec3WF crossN(float[] t)
	{
		return VecUtils3F.crossCreateNew(this, t, this);
	}

	@Override
	public IVec3WF crossN(float tv0, float tv1, float tv2)
	{
		return VecUtils3F.crossCreateNew(this, tv0, tv1, tv2, this);
	}
	
	@Override
	public float[] crossT(ITup3RF t, float[] res)
	{
		return VecUtils3F.cross(this, t, res);
	}

	@Override
	public float[] crossT(ITupRF t, float[] res)
	{
		return VecUtils3F.cross(this, t, res);
	}

	@Override
	public float[] crossT(float[] t, float[] res)
	{
		return VecUtils3F.cross(this, t, res);
	}

	@Override
	public float[] crossT(float tv0, float tv1, float tv2, float[] res)
	{
		return VecUtils3F.cross(this, tv0, tv1, tv2, res);
	}
	
	@Override
	public <T extends ITup3WF> T crossT(ITup3RF t, T res)
	{
		return VecUtils3F.cross(this, t, res);
	}

	@Override
	public <T extends ITup3WF> T crossT(ITupRF t, T res)
	{
		return VecUtils3F.cross(this, t, res);
	}

	@Override
	public <T extends ITup3WF> T crossT(float[] t, T res)
	{
		return VecUtils3F.cross(this, t, res);
	}

	@Override
	public <T extends ITup3WF> T crossT(float tv0, float tv1, float tv2, T res)
	{
		return VecUtils3F.cross(this, tv0, tv1, tv2, res);
	}

	@Override
	public IVec3WF rCross(ITup3RF t)
	{
		return VecUtils3F.cross(t, this, this);
	}

	@Override
	public IVec3WF rCross(ITupRF t)
	{
		return VecUtils3F.cross(t, this, this);
	}

	@Override
	public IVec3WF rCross(float[] t)
	{
		return VecUtils3F.cross(t, this, this);
	}

	@Override
	public IVec3WF rCross(float tv0, float tv1, float tv2)
	{
		return VecUtils3F.cross(tv0, tv1, tv2, this, this);
	}

	@Override
	public IVec3WF rCrossN(ITup3RF t)
	{
		return VecUtils3F.crossCreateNew(t, this, this);
	}

	@Override
	public IVec3WF rCrossN(ITupRF t)
	{
		return VecUtils3F.crossCreateNew(t, this, this);
	}

	@Override
	public IVec3WF rCrossN(float[] t)
	{
		return VecUtils3F.crossCreateNew(t, this, this);
	}

	@Override
	public IVec3WF rCrossN(float tv0, float tv1, float tv2)
	{
		return VecUtils3F.crossCreateNew(tv0, tv1, tv2, this, this);
	}
	
	@Override
	public float[] rCrossT(ITup3RF t, float[] res)
	{
		return VecUtils3F.cross(t, this, res);
	}

	@Override
	public float[] rCrossT(ITupRF t, float[] res)
	{
		return VecUtils3F.cross(t, this, res);
	}

	@Override
	public float[] rCrossT(float[] t, float[] res)
	{
		return VecUtils3F.cross(t, this, res);
	}

	@Override
	public float[] rCrossT(float tv0, float tv1, float tv2, float[] res)
	{
		return VecUtils3F.cross(tv0, tv1, tv2, this, res);
	}
	
	@Override
	public <T extends ITup3WF> T rCrossT(ITup3RF t, T res)
	{
		return VecUtils3F.cross(t, this, res);
	}

	@Override
	public <T extends ITup3WF> T rCrossT(ITupRF t, T res)
	{
		return VecUtils3F.cross(t, this, res);
	}

	@Override
	public <T extends ITup3WF> T rCrossT(float[] t, T res)
	{
		return VecUtils3F.cross(t, this, res);
	}

	@Override
	public <T extends ITup3WF> T rCrossT(float tv0, float tv1, float tv2, T res)
	{
		return VecUtils3F.cross(tv0, tv1, tv2, this, res);
	}
}
