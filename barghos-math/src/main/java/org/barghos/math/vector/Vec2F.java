package org.barghos.math.vector;

import java.util.Arrays;
import java.util.Objects;

import org.barghos.util.collection.IndexValuePairF;
import org.barghos.util.tuple.floats.ITup2RF;
import org.barghos.util.tuple.floats.ITup2WF;
import org.barghos.util.tuple.floats.ITupRF;
import org.barghos.util.tuple.floats.TupUtils2F;
import org.barghos.util.tuple.floats.ITupWF;

public class Vec2F implements IVec2WF
{
	public final float[] v = new float[SIZE];
	
	public Vec2F()
	{
		set(0.0f);
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
		set(value);
	}
	
	public Vec2F(float x, float y)
	{
		set(x, y);
	}
	
	@Override
	public Vec2F createNew()
	{
		return new Vec2F();
	}
	
	@Override
	public Vec2F createNew(ITup2RF t)
	{
		return new Vec2F(t);
	}
	
	@Override
	public Vec2F createNew(ITupRF t)
	{
		return new Vec2F(t);
	}

	@Override
	public Vec2F createNew(float[] t)
	{
		return new Vec2F(t);
	}

	@Override
	public Vec2F createNew(float value)
	{
		return new Vec2F(value);
	}

	@Override
	public Vec2F createNew(float x, float y)
	{
		return new Vec2F(x, y);
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
	public Vec2F x(float x)
	{
		this.v[0] = x;
		
		return this;
	}

	@Override
	public Vec2F y(float y)
	{
		this.v[1] = y;
		
		return this;
	}
	
	@Override
	public ITup2WF v0(float v0)
	{
		this.v[0] = v0;
		
		return this;
	}

	@Override
	public ITup2WF v1(float v1)
	{
		this.v[1] = v1;
		
		return this;
	}

	@Override
	public Vec2F set(ITup2RF t)
	{
		t.toArray(this.v);
		
		return this;
	}

	@Override
	public Vec2F set(ITupRF t)
	{
		t.toArray(this.v);
		
		return this;
	}

	@Override
	public Vec2F set(float[] values)
	{
		System.arraycopy(values, 0, this.v, 0, 2);
		
		return this;
	}
	
	@Override
	public Vec2F set(float value)
	{
		Arrays.fill(this.v, value);
		
		return this;
	}

	@Override
	public Vec2F set(float x, float y)
	{
		this.v[0] = x;
		this.v[1] = y;
		
		return this;
	}

	@Override
	public Vec2F setAt(int index, float value)
	{
		this.v[index] = value;
		
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
	public Vec2F copy()
	{
		return new Vec2F(this);
	}

	@Override
	public String toString()
	{
		return "vec2f(x=" + this.v[0] + ", y=" + this.v[1] + ")";
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
	public Vec2F add(ITup2RF t)
	{
		VecUtils2F.add(this.v, t, this.v);
		
		return this;
	}

	@Override
	public Vec2F add(ITupRF t)
	{
		VecUtils2F.add(this.v, t, this.v);
		
		return this;
	}
	
	@Override
	public Vec2F add(float[] t)
	{
		VecUtils2F.add(this.v, t, this.v);
		
		return this;
	}

	@Override
	public Vec2F add(float value)
	{
		VecUtils2F.add(this.v, value, value, this.v);
		
		return this;
	}

	@Override
	public Vec2F add(float tx, float ty)
	{
		VecUtils2F.add(this.v, tx, ty, this.v);
		
		return this;
	}
	
	@Override
	public Vec2F addN(ITup2RF t)
	{
		return VecUtils2F.addCreateNew(this.v, t, this);
	}

	@Override
	public Vec2F addN(ITupRF t)
	{
		return VecUtils2F.addCreateNew(this.v, t, this);
	}
	
	@Override
	public Vec2F addN(float[] t)
	{
		return VecUtils2F.addCreateNew(this.v, t, this);
	}

	@Override
	public Vec2F addN(float value)
	{
		return VecUtils2F.addCreateNew(this.v, value, value, this);
	}

	@Override
	public Vec2F addN(float tx, float ty)
	{
		return VecUtils2F.addCreateNew(this.v, tx, ty, this);
	}
	
	@Override
	public float[] addT(ITup2RF t, float[] res)
	{
		return VecUtils2F.add(this.v, t, res);
	}
	
	@Override
	public float[] addT(ITupRF t, float[] res)
	{
		return VecUtils2F.add(this.v, t, res);
	}
	
	@Override
	public float[] addT(float[] t, float[] res)
	{
		return VecUtils2F.add(this.v, t, res);
	}
	
	@Override
	public float[] addT(float value, float[] res)
	{
		return VecUtils2F.add(this.v, value, value, res);
	}

	@Override
	public float[] addT(float tx, float ty, float[] res)
	{
		return VecUtils2F.add(this.v, tx, ty, res);
	}
	
	@Override
	public <T extends ITup2WF> T addT(ITup2RF t, T res)
	{
		return VecUtils2F.add(this.v, t, res);
	}

	@Override
	public <T extends ITup2WF> T addT(ITupRF t, T res)
	{
		return VecUtils2F.add(this.v, t, res);
	}
	
	@Override
	public <T extends ITup2WF> T addT(float[] t, T res)
	{
		return VecUtils2F.add(this.v, t, res);
	}
	
	@Override
	public <T extends ITup2WF> T addT(float value, T res)
	{
		return VecUtils2F.add(this.v, value, value, res);
	}

	@Override
	public <T extends ITup2WF> T addT(float tx, float ty, T res)
	{
		return VecUtils2F.add(this.v, tx, ty, res);
	}

	@Override
	public Vec2F sub(ITup2RF t)
	{
		VecUtils2F.sub(this.v, t, this.v);
		
		return this;
	}

	@Override
	public Vec2F sub(ITupRF t)
	{
		VecUtils2F.sub(this.v, t, this.v);
		
		return this;
	}
	
	@Override
	public Vec2F sub(float[] t)
	{
		VecUtils2F.sub(this.v, t, this.v);
		
		return this;
	}

	@Override
	public Vec2F sub(float value)
	{
		VecUtils2F.sub(this.v, value, value, this.v);
		
		return this;
	}

	@Override
	public Vec2F sub(float tx, float ty)
	{
		VecUtils2F.sub(this.v, tx, ty, this.v);
		
		return this;
	}
	
	@Override
	public Vec2F subN(ITup2RF t)
	{
		return VecUtils2F.subCreateNew(this.v, t, this);
	}

	@Override
	public Vec2F subN(ITupRF t)
	{
		return VecUtils2F.subCreateNew(this.v, t, this);
	}
	
	@Override
	public Vec2F subN(float[] t)
	{
		return VecUtils2F.subCreateNew(this.v, t, this);
	}

	@Override
	public Vec2F subN(float value)
	{
		return VecUtils2F.subCreateNew(this.v, value, value, this);
	}

	@Override
	public Vec2F subN(float tx, float ty)
	{
		return VecUtils2F.subCreateNew(this.v, tx, ty, this);
	}
	
	@Override
	public float[] subT(ITup2RF t, float[] res)
	{
		return VecUtils2F.sub(this.v, t, res);
	}

	@Override
	public float[] subT(ITupRF t, float[] res)
	{
		return VecUtils2F.sub(this.v, t, res);
	}
	
	@Override
	public float[] subT(float[] t, float[] res)
	{
		return VecUtils2F.sub(this.v, t, res);
	}
	
	@Override
	public float[] subT(float value, float[] res)
	{
		return VecUtils2F.sub(this.v, value, value, res);
	}
	
	@Override
	public float[] subT(float tx, float ty, float[] res)
	{
		return VecUtils2F.sub(this.v, tx, ty, res);
	}
	
	@Override
	public <T extends ITup2WF> T subT(ITup2RF t, T res)
	{
		return VecUtils2F.sub(this.v, t, res);
	}
	
	@Override
	public <T extends ITup2WF> T subT(ITupRF t, T res)
	{
		return VecUtils2F.sub(this.v, t, res);
	}
	
	@Override
	public <T extends ITup2WF> T subT(float[] t, T res)
	{
		return VecUtils2F.sub(this.v, t, res);
	}

	@Override
	public <T extends ITup2WF> T subT(float value, T res)
	{
		return VecUtils2F.sub(this.v, value, value, res);
	}

	@Override
	public <T extends ITup2WF> T subT(float tx, float ty, T res)
	{
		return VecUtils2F.sub(this.v, tx, ty, res);
	}

	@Override
	public Vec2F rSub(ITup2RF t)
	{
		VecUtils2F.sub(t, this.v, this.v);
		
		return this;
	}

	@Override
	public Vec2F rSub(ITupRF t)
	{
		VecUtils2F.sub(t, this.v, this.v);
		
		return this;
	}
	
	@Override
	public Vec2F rSub(float[] t)
	{
		VecUtils2F.sub(t, this.v, this.v);
		
		return this;
	}

	@Override
	public Vec2F rSub(float value)
	{
		VecUtils2F.sub(value, value, this.v, this.v);
		
		return this;
	}

	@Override
	public Vec2F rSub(float tx, float ty)
	{
		VecUtils2F.sub(tx, ty, this.v, this.v);
		
		return this;
	}
	
	@Override
	public Vec2F rSubN(ITup2RF t)
	{
		return VecUtils2F.subCreateNew(t, this.v, this);
	}

	@Override
	public Vec2F rSubN(ITupRF t)
	{
		return VecUtils2F.subCreateNew(t, this.v, this);
	}

	
	@Override
	public Vec2F rSubN(float[] t)
	{
		return VecUtils2F.subCreateNew(t, this.v, this);
	}

	@Override
	public Vec2F rSubN(float value)
	{
		return VecUtils2F.subCreateNew(value, value, this.v, this);
	}

	@Override
	public Vec2F rSubN(float tx, float ty)
	{
		return VecUtils2F.subCreateNew(tx, ty, this.v, this);
	}
	
	@Override
	public float[] rSubT(ITup2RF t, float[] res)
	{
		return VecUtils2F.sub(t, this.v, res);
	}
	
	@Override
	public float[] rSubT(ITupRF t, float[] res)
	{
		return VecUtils2F.sub(t, this.v, res);
	}
	
	@Override
	public float[] rSubT(float[] t, float[] res)
	{
		return VecUtils2F.sub(t, this.v, res);
	}
	
	@Override
	public float[] rSubT(float value, float[] res)
	{
		return VecUtils2F.sub(value, value, this.v, res);
	}
	
	@Override
	public <T extends ITup2WF> T rSubT(ITup2RF t, T res)
	{
		return VecUtils2F.sub(t, this.v, res);
	}

	@Override
	public <T extends ITup2WF> T rSubT(ITupRF t, T res)
	{
		return VecUtils2F.sub(t, this.v, res);
	}
	
	@Override
	public float[] rSubT(float tx, float ty, float[] res)
	{
		return VecUtils2F.sub(tx, ty, this.v, res);
	}

	@Override
	public <T extends ITup2WF> T rSubT(float[] t, T res)
	{
		return VecUtils2F.sub(t, this.v, res);
	}

	@Override
	public <T extends ITup2WF> T rSubT(float value, T res)
	{
		return VecUtils2F.sub(value, value, this.v, res);
	}

	@Override
	public <T extends ITup2WF> T rSubT(float tx, float ty, T res)
	{
		return VecUtils2F.sub(tx, ty, this.v, res);
	}

	@Override
	public Vec2F mul(ITup2RF t)
	{
		VecUtils2F.mul(this.v, t, this.v);
		
		return this;
	}

	@Override
	public Vec2F mul(ITupRF t)
	{
		VecUtils2F.mul(this.v, t, this.v);
		
		return this;
	}
	
	@Override
	public Vec2F mul(float[] t)
	{
		VecUtils2F.mul(this.v, t, this.v);
		
		return this;
	}

	@Override
	public Vec2F mul(float value)
	{
		VecUtils2F.mul(this.v, value, value, this.v);
		
		return this;
	}

	@Override
	public Vec2F mul(float tx, float ty)
	{
		VecUtils2F.mul(this.v, tx, ty, this.v);
		
		return this;
	}
	
	@Override
	public Vec2F mulN(ITup2RF t)
	{
		return VecUtils2F.mulCreateNew(this.v, t, this);
	}

	@Override
	public Vec2F mulN(ITupRF t)
	{
		return VecUtils2F.mulCreateNew(this.v, t, this);
	}
	
	@Override
	public Vec2F mulN(float[] t)
	{
		return VecUtils2F.mulCreateNew(this.v, t, this);
	}

	@Override
	public Vec2F mulN(float value)
	{
		return VecUtils2F.mulCreateNew(this.v, value, value, this);
	}

	@Override
	public Vec2F mulN(float tx, float ty)
	{
		return VecUtils2F.mulCreateNew(this.v, tx, ty, this);
	}
	
	@Override
	public float[] mulT(ITup2RF t, float[] res)
	{
		return VecUtils2F.mul(this.v, t, res);
	}
	
	@Override
	public float[] mulT(ITupRF t, float[] res)
	{
		return VecUtils2F.mul(this.v, t, res);
	}
	
	@Override
	public float[] mulT(float[] t, float[] res)
	{
		return VecUtils2F.mul(this.v, t, res);
	}
	
	@Override
	public float[] mulT(float value, float[] res)
	{
		return VecUtils2F.mul(this.v, value, value, res);
	}
	
	@Override
	public float[] mulT(float tx, float ty, float[] res)
	{
		return VecUtils2F.mul(this.v, tx, ty, res);
	}
	
	@Override
	public <T extends ITup2WF> T mulT(ITup2RF t, T res)
	{
		return VecUtils2F.mul(this.v, t, res);
	}

	@Override
	public <T extends ITup2WF> T mulT(ITupRF t, T res)
	{
		return VecUtils2F.mul(this.v, t, res);
	}
	
	@Override
	public <T extends ITup2WF> T mulT(float[] t, T res)
	{
		return VecUtils2F.mul(this.v, t, res);
	}

	@Override
	public <T extends ITup2WF> T mulT(float value, T res)
	{
		return VecUtils2F.mul(this.v, value, value, res);
	}

	@Override
	public <T extends ITup2WF> T mulT(float tx, float ty, T res)
	{
		return VecUtils2F.mul(this.v, tx, ty, res);
	}

	@Override
	public Vec2F div(ITup2RF t)
	{
		VecUtils2F.div(this.v, t, this.v);
		
		return this;
	}

	@Override
	public Vec2F div(ITupRF t)
	{
		VecUtils2F.div(this.v, t, this.v);
		
		return this;
	}
	
	@Override
	public Vec2F div(float[] t)
	{
		VecUtils2F.div(this.v, t, this.v);
		
		return this;
	}

	@Override
	public Vec2F div(float value)
	{
		VecUtils2F.div(this.v, value, value, this.v);
		
		return this;
	}

	@Override
	public Vec2F div(float tx, float ty)
	{
		VecUtils2F.div(this.v, tx, ty, this.v);
		
		return this;
	}
	
	@Override
	public Vec2F divN(ITup2RF t)
	{
		return VecUtils2F.divCreateNew(this.v, t, this);
	}

	@Override
	public Vec2F divN(ITupRF t)
	{
		return VecUtils2F.divCreateNew(this.v, t, this);
	}
	
	@Override
	public Vec2F divN(float[] t)
	{
		return VecUtils2F.divCreateNew(this.v, t, this);
	}

	@Override
	public Vec2F divN(float value)
	{
		return VecUtils2F.divCreateNew(this.v, value, value, this);
	}

	@Override
	public Vec2F divN(float tx, float ty)
	{
		return VecUtils2F.divCreateNew(this.v, tx, ty, this);
	}
	
	@Override
	public float[] divT(ITup2RF t, float[] res)
	{
		return VecUtils2F.div(this.v, t, res);
	}
	
	@Override
	public float[] divT(ITupRF t, float[] res)
	{
		return VecUtils2F.div(this.v, t, res);
	}
	
	@Override
	public float[] divT(float[] t, float[] res)
	{
		return VecUtils2F.div(this.v, t, res);
	}
	
	@Override
	public float[] divT(float value, float[] res)
	{
		return VecUtils2F.div(this.v, value, value, res);
	}
	
	@Override
	public float[] divT(float tx, float ty, float[] res)
	{
		return VecUtils2F.div(this.v, tx, ty, res);
	}
	
	@Override
	public <T extends ITup2WF> T divT(ITup2RF t, T res)
	{
		return VecUtils2F.div(this.v, t, res);
	}

	@Override
	public <T extends ITup2WF> T divT(ITupRF t, T res)
	{
		return VecUtils2F.div(this.v, t, res);
	}
	
	@Override
	public <T extends ITup2WF> T divT(float[] t, T res)
	{
		return VecUtils2F.div(this.v, t, res);
	}

	@Override
	public <T extends ITup2WF> T divT(float value, T res)
	{
		return VecUtils2F.div(this.v, value, value, res);
	}
	
	@Override
	public <T extends ITup2WF> T divT(float tx, float ty, T res)
	{
		return VecUtils2F.div(this.v, tx, ty, res);
	}

	@Override
	public Vec2F rDiv(ITup2RF t)
	{
		VecUtils2F.div(t, this.v, this.v);
		
		return this;
	}

	@Override
	public Vec2F rDiv(ITupRF t)
	{
		VecUtils2F.div(t, this.v, this.v);
		
		return this;
	}
	
	@Override
	public Vec2F rDiv(float[] t)
	{
		VecUtils2F.div(t, this.v, this.v);
		
		return this;
	}

	@Override
	public Vec2F rDiv(float value)
	{
		VecUtils2F.div(value, value, this.v, this.v);
		
		return this;
	}

	@Override
	public Vec2F rDiv(float tx, float ty)
	{
		VecUtils2F.div(tx, ty, this.v, this.v);
		
		return this;
	}
	
	@Override
	public Vec2F rDivN(ITup2RF t)
	{
		return VecUtils2F.divCreateNew(t, this.v, this);
	}

	@Override
	public Vec2F rDivN(ITupRF t)
	{
		return VecUtils2F.divCreateNew(t, this.v, this);
	}
	
	@Override
	public Vec2F rDivN(float[] t)
	{
		return VecUtils2F.divCreateNew(t, this.v, this);
	}

	@Override
	public Vec2F rDivN(float value)
	{
		return VecUtils2F.divCreateNew(value, value, this.v, this);
	}

	@Override
	public Vec2F rDivN(float tx, float ty)
	{
		return VecUtils2F.divCreateNew(tx, ty, this.v, this);
	}
	
	@Override
	public float[] rDivT(ITup2RF t, float[] res)
	{
		return VecUtils2F.div(t, this.v, res);
	}
	
	@Override
	public float[] rDivT(ITupRF t, float[] res)
	{
		return VecUtils2F.div(t, this.v, res);
	}
	
	@Override
	public float[] rDivT(float[] t, float[] res)
	{
		return VecUtils2F.div(t, this.v, res);
	}
	
	@Override
	public float[] rDivT(float value, float[] res)
	{
		return VecUtils2F.div(value, value, this.v, res);
	}
	
	@Override
	public float[] rDivT(float tx, float ty, float[] res)
	{
		return VecUtils2F.div(tx, ty, this.v, res);
	}
	
	@Override
	public <T extends ITup2WF> T rDivT(ITup2RF t, T res)
	{
		return VecUtils2F.div(t, this.v, res);
	}

	@Override
	public <T extends ITup2WF> T rDivT(ITupRF t, T res)
	{
		return VecUtils2F.div(t, this.v, res);
	}
	
	@Override
	public <T extends ITup2WF> T rDivT(float[] t, T res)
	{
		return VecUtils2F.div(t, this.v, res);
	}

	@Override
	public <T extends ITup2WF> T rDivT(float value, T res)
	{
		return VecUtils2F.div(value, value, this.v, res);
	}

	@Override
	public <T extends ITup2WF> T rDivT(float tx, float ty, T res)
	{
		return VecUtils2F.div(tx, ty, this.v, res);
	}
	
	@Override
	public float len()
	{
		return VecUtils2F.len(this.v);
	}

	@Override
	public float len(float tolerance)
	{
		return VecUtils2F.len(tolerance, this.v);
	}

	@Override
	public float recLen()
	{
		return VecUtils2F.recLen(this.v);
	}

	@Override
	public float lenTo(ITup2RF t)
	{
		return VecUtils2F.lenTo(this.v, t);
	}

	@Override
	public float lenTo(ITupRF t)
	{
		return VecUtils2F.lenTo(this.v, t);
	}
	
	@Override
	public float lenTo(float tolerance, ITup2RF t)
	{
		return VecUtils2F.lenTo(tolerance, this.v, t);
	}

	@Override
	public float lenTo(float tolerance, ITupRF t)
	{
		return VecUtils2F.lenTo(tolerance, this.v, t);
	}
	
	@Override
	public float lenTo(float[] t)
	{
		return VecUtils2F.lenTo(this.v, t);
	}

	@Override
	public float lenTo(float tolerance, float[] t)
	{
		return VecUtils2F.lenTo(tolerance, this.v, t);
	}

	@Override
	public float lenTo(float tx, float ty)
	{
		return VecUtils2F.lenTo(this.v, tx, ty);
	}

	@Override
	public float lenTo(float tolerance, float tx, float ty)
	{
		return VecUtils2F.lenTo(tolerance, this.v, tx, ty);
	}

	@Override
	public float recLenTo(ITup2RF t)
	{
		return VecUtils2F.recLenTo(this.v, t);
	}

	@Override
	public float recLenTo(ITupRF t)
	{
		return VecUtils2F.recLenTo(this.v, t);
	}
	
	@Override
	public float recLenTo(float[] t)
	{
		return VecUtils2F.recLenTo(this.v, t);
	}

	@Override
	public float recLenTo(float tx, float ty)
	{
		return VecUtils2F.recLenTo(this.v, tx, ty);
	}

	@Override
	public float sqrLen()
	{
		return VecUtils2F.sqrLen(this.v);
	}

	@Override
	public float sqrLenTo(ITup2RF t)
	{
		return VecUtils2F.sqrLenTo(this.v, t);
	}

	@Override
	public float sqrLenTo(ITupRF t)
	{
		return VecUtils2F.sqrLenTo(this.v, t);
	}
	
	@Override
	public float sqrLenTo(float[] t)
	{
		return VecUtils2F.sqrLenTo(this.v, t);
	}

	@Override
	public float sqrLenTo(float tx, float ty)
	{
		return VecUtils2F.sqrLenTo(this.v, tx, ty);
	}

	@Override
	public float dot(ITup2RF t)
	{
		return VecUtils2F.dot(this.v, t);
	}

	@Override
	public float dot(ITupRF t)
	{
		return VecUtils2F.dot(this.v, t);
	}
	
	@Override
	public float dot(float[] t)
	{
		return VecUtils2F.dot(this.v, t);
	}

	@Override
	public float dot(float tx, float ty)
	{
		return VecUtils2F.dot(this.v, tx, ty);
	}
	
	@Override
	public Vec2F halfVecTo(ITup2RF t)
	{
		VecUtils2F.halfVecTo(this.v, t, this.v);
		
		return this;
	}

	@Override
	public Vec2F halfVecTo(ITupRF t)
	{
		VecUtils2F.halfVecTo(this.v, t, this.v);
		
		return this;
	}
	
	@Override
	public Vec2F halfVecTo(float[] t)
	{
		VecUtils2F.halfVecTo(this.v, t, this.v);
		
		return this;
	}

	@Override
	public Vec2F halfVecTo(float tx, float ty)
	{
		VecUtils2F.halfVecTo(this.v, tx, ty, this.v);
		
		return this;
	}
	
	@Override
	public Vec2F halfVecToN(ITup2RF t)
	{
		return VecUtils2F.halfVecTo(this.v, t, createNew());
	}

	@Override
	public Vec2F halfVecToN(ITupRF t)
	{
		return VecUtils2F.halfVecTo(this.v, t, createNew());
	}
	
	@Override
	public Vec2F halfVecToN(float[] t)
	{
		return VecUtils2F.halfVecTo(this.v, t, createNew());
	}

	@Override
	public Vec2F halfVecToN(float tx, float ty)
	{
		return VecUtils2F.halfVecTo(this.v, tx, ty, createNew());
	}
	
	@Override
	public float[] halfVecToT(ITup2RF t, float[] res)
	{
		return VecUtils2F.halfVecTo(this.v, t, res);
	}
	
	@Override
	public float[] halfVecToT(ITupRF t, float[] res)
	{
		return VecUtils2F.halfVecTo(this.v, t, res);
	}
	
	@Override
	public float[] halfVecToT(float[] t, float[] res)
	{
		return VecUtils2F.halfVecTo(this.v, t, res);
	}
	
	@Override
	public float[] halfVecToT(float tx, float ty, float[] res)
	{
		return VecUtils2F.halfVecTo(this.v, tx, ty, res);
	}
	
	@Override
	public <T extends ITup2WF> T halfVecToT(ITup2RF t, T res)
	{
		return VecUtils2F.halfVecTo(this.v, t, res);
	}

	@Override
	public <T extends ITup2WF> T halfVecToT(ITupRF t, T res)
	{
		return VecUtils2F.halfVecTo(this.v, t, res);
	}
	
	@Override
	public <T extends ITup2WF> T halfVecToT(float[] t, T res)
	{
		return VecUtils2F.halfVecTo(this.v, t, res);
	}

	@Override
	public <T extends ITup2WF> T halfVecToT(float tx, float ty, T res)
	{
		return VecUtils2F.halfVecTo(this.v, tx, ty, res);
	}

	@Override
	public Vec2F midPointTo(ITup2RF t)
	{
		VecUtils2F.midPointTo(this.v, t, this.v);
		
		return this;
	}

	@Override
	public Vec2F midPointTo(ITupRF t)
	{
		VecUtils2F.midPointTo(this.v, t, this.v);
		
		return this;
	}
	
	@Override
	public Vec2F midPointTo(float[] t)
	{
		VecUtils2F.midPointTo(this.v, t, this.v);
		
		return this;
	}

	@Override
	public Vec2F midPointTo(float tx, float ty)
	{
		VecUtils2F.midPointTo(this.v, tx, ty, this.v);
		
		return this;
	}
	
	@Override
	public Vec2F midPointToN(ITup2RF t)
	{
		return VecUtils2F.midPointTo(this.v, t, createNew());
	}

	@Override
	public Vec2F midPointToN(ITupRF t)
	{
		return VecUtils2F.midPointTo(this.v, t, createNew());
	}
	
	@Override
	public Vec2F midPointToN(float[] t)
	{
		return VecUtils2F.midPointTo(this.v, t, createNew());
	}

	@Override
	public Vec2F midPointToN(float tx, float ty)
	{
		return VecUtils2F.midPointTo(this.v, tx, ty, createNew());
	}
	
	@Override
	public float[] midPointToT(ITup2RF t, float[] res)
	{
		return VecUtils2F.midPointTo(this.v, t, res);
	}

	@Override
	public float[] midPointToT(ITupRF t, float[] res)
	{
		return VecUtils2F.midPointTo(this.v, t, res);
	}
	
	@Override
	public float[] midPointToT(float[] t, float[] res)
	{
		return VecUtils2F.midPointTo(this.v, t, res);
	}
	
	@Override
	public float[] midPointToT(float tx, float ty, float[] res)
	{
		return VecUtils2F.midPointTo(this.v, tx, ty, res);
	}
	
	@Override
	public <T extends ITup2WF> T midPointToT(ITup2RF t, T res)
	{
		return VecUtils2F.midPointTo(this.v, t, res);
	}

	@Override
	public <T extends ITup2WF> T midPointToT(ITupRF t, T res)
	{
		return VecUtils2F.midPointTo(this.v, t, res);
	}
	
	@Override
	public <T extends ITup2WF> T midPointToT(float[] t, T res)
	{
		return VecUtils2F.midPointTo(this.v, t, res);
	}

	@Override
	public <T extends ITup2WF> T midPointToT(float tx, float ty, T res)
	{
		return VecUtils2F.midPointTo(this.v, tx, ty, res);
	}

	@Override
	public Vec2F neg()
	{
		VecUtils2F.neg(this.v, this.v);
		
		return this;
	}
	
	@Override
	public Vec2F negN()
	{
		return VecUtils2F.neg(this.v, createNew());
	}
	
	@Override
	public float[] negT(float[] res)
	{
		return VecUtils2F.neg(this.v, res);
	}
	
	@Override
	public <T extends ITup2WF> T negT(T res)
	{
		return VecUtils2F.neg(this.v, res);
	}

	@Override
	public Vec2F rec()
	{
		VecUtils2F.rec(this.v, this.v);
		
		return this;
	}
	
	@Override
	public Vec2F recN()
	{
		return VecUtils2F.rec(this.v, createNew());
	}
	
	@Override
	public float[] recT(float[] res)
	{
		return VecUtils2F.rec(this.v, res);
	}
	
	@Override
	public <T extends ITup2WF> T recT(T res)
	{
		return VecUtils2F.rec(this.v, res);
	}

	@Override
	public Vec2F nrm()
	{
		VecUtils2F.nrm(this.v, this.v);
		
		return this;
	}
	
	@Override
	public Vec2F nrmN()
	{
		return VecUtils2F.nrm(this.v, createNew());
	}
	
	@Override
	public float[] nrmT(float[] res)
	{
		return VecUtils2F.nrm(this.v, res);
	}
	
	@Override
	public <T extends ITup2WF> T nrmT(T res)
	{
		return VecUtils2F.nrm(this.v, res);
	}

	@Override
	public Vec2F rotRad(double angle)
	{
		VecUtils2F.rotRad(angle, this.v, this.v);
		
		return this;
	}

	@Override
	public Vec2F rotRadN(double angle)
	{
		return VecUtils2F.rotRad(angle, this.v, createNew());
	}
	
	@Override
	public float[] rotRadT(double angle, float[] res)
	{
		return VecUtils2F.rotRad(angle, this.v, res);
	}
	
	@Override
	public <T extends ITup2WF> T rotRadT(double angle, T res)
	{
		return VecUtils2F.rotRad(angle, this.v, res);
	}

	@Override
	public Vec2F rotDeg(double angle)
	{
		VecUtils2F.rotDeg(angle, this.v, this.v);
		
		return this;
	}
	
	@Override
	public Vec2F rotDegN(double angle)
	{
		return VecUtils2F.rotDeg(angle, this.v, createNew());
	}
	
	@Override
	public float[] rotDegT(double angle, float[] res)
	{
		return VecUtils2F.rotDeg(angle, this.v, res);
	}
	
	@Override
	public <T extends ITup2WF> T rotDegT(double angle, T res)
	{
		return VecUtils2F.rotDeg(angle, this.v, res);
	}

	@Override
	public Vec2F project(ITup2RF t)
	{
		VecUtils2F.project(this.v, t, this.v);
		
		return this;
	}

	@Override
	public Vec2F project(ITupRF t)
	{
		VecUtils2F.project(this.v, t, this.v);
		
		return this;
	}
	
	@Override
	public Vec2F project(float[] t)
	{
		VecUtils2F.project(this.v, t, this.v);
		
		return this;
	}

	@Override
	public Vec2F project(float tx, float ty)
	{
		VecUtils2F.project(this.v, tx, ty, this.v);
		
		return this;
	}
	
	@Override
	public Vec2F projectN(ITup2RF t)
	{
		return VecUtils2F.project(this.v, t, createNew());
	}

	@Override
	public Vec2F projectN(ITupRF t)
	{
		return VecUtils2F.project(this.v, t, createNew());
	}
	
	@Override
	public Vec2F projectN(float[] t)
	{
		return VecUtils2F.project(this.v, t, createNew());
	}

	@Override
	public Vec2F projectN(float tx, float ty)
	{
		return VecUtils2F.project(this.v, tx, ty, createNew());
	}
	
	@Override
	public float[] projectT(ITup2RF t, float[] res)
	{
		return VecUtils2F.project(this.v, t, res);
	}

	@Override
	public float[] projectT(ITupRF t, float[] res)
	{
		return VecUtils2F.project(this.v, t, res);
	}
	
	@Override
	public float[] projectT(float[] t, float[] res)
	{
		return VecUtils2F.project(this.v, t, res);
	}

	@Override
	public float[] projectT(float tx, float ty, float[] res)
	{
		return VecUtils2F.project(this.v, tx, ty, res);
	}
	
	@Override
	public <T extends ITup2WF> T projectT(ITup2RF t, T res)
	{
		return VecUtils2F.project(this.v, t, res);
	}

	@Override
	public <T extends ITup2WF> T projectT(ITupRF t, T res)
	{
		return VecUtils2F.project(this.v, t, res);
	}
	
	@Override
	public <T extends ITup2WF> T projectT(float[] t, T res)
	{
		return VecUtils2F.project(this.v, t, res);
	}

	@Override
	public <T extends ITup2WF> T projectT(float tx, float ty, T res)
	{
		return VecUtils2F.project(this.v, tx, ty, res);
	}

	@Override
	public Vec2F reflect(ITup2RF n)
	{
		VecUtils2F.reflect(this.v, n, this.v);
		
		return this;
	}

	@Override
	public Vec2F reflect(ITupRF n)
	{
		VecUtils2F.reflect(this.v, n, this.v);
		
		return this;
	}
	
	@Override
	public Vec2F reflect(float[] n)
	{
		VecUtils2F.reflect(this.v, n, this.v);
		
		return this;
	}

	@Override
	public Vec2F reflect(float nx, float ny)
	{
		VecUtils2F.reflect(this.v, nx, ny, this.v);
		
		return this;
	}
	
	@Override
	public Vec2F reflectN(ITup2RF n)
	{
		return VecUtils2F.reflect(this.v, n, createNew());
	}

	@Override
	public Vec2F reflectN(ITupRF n)
	{
		return VecUtils2F.reflect(this.v, n, createNew());
	}
	
	@Override
	public Vec2F reflectN(float[] n)
	{
		return VecUtils2F.reflect(this.v, n, createNew());
	}

	@Override
	public Vec2F reflectN(float nx, float ny)
	{
		return VecUtils2F.reflect(this.v, nx, ny, createNew());
	}
	
	@Override
	public float[] reflectT(ITup2RF n, float[] res)
	{
		return VecUtils2F.reflect(this.v, n, res);
	}

	@Override
	public float[] reflectT(ITupRF n, float[] res)
	{
		return VecUtils2F.reflect(this.v, n, res);
	}
	
	@Override
	public float[] reflectT(float[] n, float[] res)
	{
		return VecUtils2F.reflect(this.v, n, res);
	}

	@Override
	public float[] reflectT(float nx, float ny, float[] res)
	{
		return VecUtils2F.reflect(this.v, nx, ny, res);
	}
	
	@Override
	public <T extends ITup2WF> T reflectT(ITup2RF n, T res)
	{
		return VecUtils2F.reflect(this.v, n, res);
	}

	@Override
	public <T extends ITup2WF> T reflectT(ITupRF n, T res)
	{
		return VecUtils2F.reflect(this.v, n, res);
	}
	
	@Override
	public <T extends ITup2WF> T reflectT(float[] n, T res)
	{
		return VecUtils2F.reflect(this.v, n, res);
	}

	@Override
	public <T extends ITup2WF> T reflectT(float nx, float ny, T res)
	{
		return VecUtils2F.reflect(this.v, nx, ny, res);
	}

	@Override
	public Vec2F abs()
	{
		VecUtils2F.abs(this.v, this.v);
		
		return this;
	}
	
	@Override
	public Vec2F absN()
	{
		return VecUtils2F.abs(this.v, createNew());
	}
	
	@Override
	public float[] absT(float[] res)
	{
		return VecUtils2F.abs(this.v, res);
	}
	
	@Override
	public <T extends ITup2WF> T absT(T res)
	{
		return VecUtils2F.abs(this.v, res);
	}

	@Override
	public Vec2F sign()
	{
		VecUtils2F.sign(this.v, this.v);
		
		return this;
	}

	@Override
	public Vec2F signN()
	{
		return VecUtils2F.sign(this.v, createNew());
	}

	@Override
	public float[] signT(float[] res)
	{
		return VecUtils2F.sign(this.v, res);
	}
	
	@Override
	public <T extends ITup2WF> T signT(T res)
	{
		return VecUtils2F.sign(this.v, res);
	}

	@Override
	public boolean isFiniteAt(int index)
	{
		return TupUtils2F.Comp.isFiniteAt(index, this.v);
	}

	@Override
	public boolean isFiniteAtV0()
	{
		return TupUtils2F.Comp.isFiniteAtV0(this.v);
	}

	@Override
	public boolean isFiniteAtV1()
	{
		return TupUtils2F.Comp.isFiniteAtV1(this.v);
	}

	@Override
	public boolean isZeroAt(int index)
	{
		return TupUtils2F.Comp.isZeroAt(index, this.v);
	}

	@Override
	public boolean isZeroAt(float tolerance, int index)
	{
		return TupUtils2F.Comp.isZeroAt(tolerance, index, this.v);
	}

	@Override
	public boolean isZeroAtV0()
	{
		return TupUtils2F.Comp.isZeroAtV0(this.v);
	}

	@Override
	public boolean isZeroAtV1()
	{
		return TupUtils2F.Comp.isZeroAtV1(this.v);
	}

	@Override
	public boolean isZeroAtV0(float tolerance)
	{
		return TupUtils2F.Comp.isZeroAtV0(tolerance, this.v);
	}

	@Override
	public boolean isZeroAtV1(float tolerance)
	{
		return TupUtils2F.Comp.isZeroAtV1(tolerance, this.v);
	}

	@Override
	public boolean equals(ITup2RF t)
	{
		return TupUtils2F.Comp.equals(this.v, t);
	}

	@Override
	public boolean equals(ITupRF t)
	{
		return TupUtils2F.Comp.equals(this.v, t);
	}

	@Override
	public boolean equals(float[] t)
	{
		return TupUtils2F.Comp.equals(this.v, t);
	}

	@Override
	public boolean equals(float tv0, float tv1)
	{
		return TupUtils2F.Comp.equals(this.v, tv0, tv1);
	}

	@Override
	public boolean equals(float tolerance, ITup2RF t)
	{
		return TupUtils2F.Comp.equals(tolerance, this.v, t);
	}

	@Override
	public boolean equals(float tolerance, ITupRF t)
	{
		return TupUtils2F.Comp.equals(tolerance, this.v, t);
	}

	@Override
	public boolean equals(float tolerance, float[] t)
	{
		return TupUtils2F.Comp.equals(tolerance, this.v, t);
	}

	@Override
	public boolean equals(float tolerance, float tv0, float tv1)
	{
		return TupUtils2F.Comp.equals(tolerance, this.v, tv0, tv1);
	}

	@Override
	public boolean equalsAt(int index, ITup2RF t)
	{
		return TupUtils2F.Comp.equalsAt(index, this.v, t);
	}

	@Override
	public boolean equalsAt(int index, ITupRF t)
	{
		return TupUtils2F.Comp.equalsAt(index, this.v, t);
	}

	@Override
	public boolean equalsAt(int index, float[] t)
	{
		return TupUtils2F.Comp.equalsAt(index, this.v, t);
	}

	@Override
	public boolean equalsAt(int index, float value)
	{
		return TupUtils2F.Comp.equalsAt(index, this.v, value);
	}

	@Override
	public boolean equalsAt(float tolerance, int index, ITup2RF t)
	{
		return TupUtils2F.Comp.equalsAt(tolerance, index, this.v, t);
	}

	@Override
	public boolean equalsAt(float tolerance, int index, ITupRF t)
	{
		return TupUtils2F.Comp.equalsAt(tolerance, index, this.v, t);
	}

	@Override
	public boolean equalsAt(float tolerance, int index, float[] t)
	{
		return TupUtils2F.Comp.equalsAt(tolerance, index, this.v, t);
	}

	@Override
	public boolean equalsAt(float tolerance, int index, float value)
	{
		return TupUtils2F.Comp.equalsAt(tolerance, index, this.v, value);
	}

	@Override
	public boolean equalsAtV0(ITup2RF t)
	{
		return TupUtils2F.Comp.equalsAtV0(this.v, t);
	}

	@Override
	public boolean equalsAtV0(ITupRF t)
	{
		return TupUtils2F.Comp.equalsAtV0(this.v, t);
	}

	@Override
	public boolean equalsAtV0(float[] t)
	{
		return TupUtils2F.Comp.equalsAtV0(this.v, t);
	}

	@Override
	public boolean equalsAtV0(float value)
	{
		return TupUtils2F.Comp.equalsAtV0(this.v, value);
	}

	@Override
	public boolean equalsAtV1(ITup2RF t)
	{
		return TupUtils2F.Comp.equalsAtV1(this.v, t);
	}

	@Override
	public boolean equalsAtV1(ITupRF t)
	{
		return TupUtils2F.Comp.equalsAtV1(this.v, t);
	}

	@Override
	public boolean equalsAtV1(float[] t)
	{
		return TupUtils2F.Comp.equalsAtV1(this.v, t);
	}

	@Override
	public boolean equalsAtV1(float value)
	{
		return TupUtils2F.Comp.equalsAtV1(this.v, value);
	}

	@Override
	public boolean equalsAtV0(float tolerance, ITup2RF t)
	{
		return TupUtils2F.Comp.equalsAtV0(tolerance, this.v, t);
	}

	@Override
	public boolean equalsAtV0(float tolerance, ITupRF t)
	{
		return TupUtils2F.Comp.equalsAtV0(tolerance, this.v, t);
	}

	@Override
	public boolean equalsAtV0(float tolerance, float[] t)
	{
		return TupUtils2F.Comp.equalsAtV0(tolerance, this.v, t);
	}

	@Override
	public boolean equalsAtV0(float tolerance, float value)
	{
		return TupUtils2F.Comp.equalsAtV0(tolerance, this.v, value);
	}

	@Override
	public boolean equalsAtV1(float tolerance, ITup2RF t)
	{
		return TupUtils2F.Comp.equalsAtV1(tolerance, this.v, t);
	}

	@Override
	public boolean equalsAtV1(float tolerance, ITupRF t)
	{
		return TupUtils2F.Comp.equalsAtV1(tolerance, this.v, t);
	}

	@Override
	public boolean equalsAtV1(float tolerance, float[] t)
	{
		return TupUtils2F.Comp.equalsAtV1(tolerance, this.v, t);
	}

	@Override
	public boolean equalsAtV1(float tolerance, float value)
	{
		return TupUtils2F.Comp.equalsAtV1(tolerance, this.v, value);
	}

	@Override
	public Vec2F arrange(int[] indices)
	{
		TupUtils2F.arrange(this.v, indices, this.v);
		
		return this;
	}
	
	@Override
	public Vec2F arrangeN(int[] indices)
	{
		return TupUtils2F.arrange(this.v, indices, createNew());
	}
	
	@Override
	public float[] arrangeT(int[] indices, float[] res)
	{
		return TupUtils2F.arrange(this.v, indices, res);
	}
	
	@Override
	public <T extends ITup2WF> T arrangeT(int[] indices, T res)
	{
		return TupUtils2F.arrange(this.v, indices, res);
	}

	@Override
	public <T extends ITupWF> T arrangeT(int[] indices, T res)
	{
		throw new UnsupportedOperationException("Not implemented yet.");
	}
	
	@Override
	public Vec2F arrange(int indexX, int indexY)
	{
		TupUtils2F.arrange(this.v, indexX, indexY, this.v);
		
		return this;
	}
	
	@Override
	public Vec2F arrangeN(int indexX, int indexY)
	{
		return TupUtils2F.arrange(this.v, indexX, indexY, createNew());
	}
	
	@Override
	public float[] arrangeT(int indexX, int indexY, float[] res)
	{
		return TupUtils2F.arrange(this.v, indexX, indexY, res);
	}
	
	@Override
	public <T extends ITup2WF> T arrangeT(int indexX, int indexY, T res)
	{
		return TupUtils2F.arrange(this.v, indexX, indexY, res);
	}

	@Override
	public Vec2F swizzle(int indexA, int indexB)
	{
		TupUtils2F.swizzle(this.v, indexA, indexB, this.v);
		
		return this;
	}
	
	@Override
	public Vec2F swizzleN(int indexA, int indexB)
	{
		return TupUtils2F.swizzle(this.v, indexA, indexB, createNew());
	}
	
	@Override
	public float[] swizzleT(int indexA, int indexB, float[] res)
	{
		return TupUtils2F.swizzle(this.v, indexA, indexB, res);
	}
	
	@Override
	public <T extends ITup2WF> T swizzleT(int indexA, int indexB, T res)
	{
		return TupUtils2F.swizzle(this.v, indexA, indexB, res);
	}

	@Override
	public <T extends ITupWF> T swizzleT(int indexA, int indexB, T res)
	{
		throw new UnsupportedOperationException("Not implemented yet.");
	}
	
	@Override
	public Vec2F swizzleV0V1()
	{
		TupUtils2F.swizzleV0V1(this.v, this.v);
		
		return this;
	}
	
	@Override
	public Vec2F swizzleV0V1N()
	{
		return TupUtils2F.swizzleV0V1(this.v, createNew());
	}
	
	@Override
	public float[] swizzleV0V1T(float[] res)
	{
		return TupUtils2F.swizzleV0V1(this.v, res);
	}
	
	@Override
	public <T extends ITup2WF> T swizzleV0V1T(T res)
	{
		return TupUtils2F.swizzleV0V1(this.v, res);
	}

	@Override
	public Vec2F swizzleXY()
	{
		TupUtils2F.swizzleV0V1(this.v, this.v);
		
		return this;
	}
	
	@Override
	public Vec2F swizzleXYN()
	{
		return TupUtils2F.swizzleV0V1(this.v, createNew());
	}
	
	@Override
	public boolean isFinite()
	{
		return TupUtils2F.Comp.isFinite(this.v);
	}

	@Override
	public boolean isZero()
	{
		return TupUtils2F.Comp.isZero(this.v);
	}

	@Override
	public boolean isZero(float tolerance)
	{
		return TupUtils2F.Comp.isZero(tolerance, this.v);
	}

	@Override
	public Vec2F minComponents(ITup2RF t)
	{
		TupUtils2F.minComponents(this.v, t, this.v);
		
		return this;
	}
	
	@Override
	public Vec2F minComponents(ITupRF t)
	{
		TupUtils2F.minComponents(this.v, t, this.v);
		
		return this;
	}

	@Override
	public Vec2F minComponents(float[] t)
	{
		TupUtils2F.minComponents(this.v, t, this.v);
		
		return this;
	}
	
	@Override
	public Vec2F minComponents(float tv0, float tv1)
	{
		TupUtils2F.minComponents(this.v, tv0, tv1, this.v);
		
		return this;
	}
	
	@Override
	public Vec2F minComponentsN(ITup2RF t)
	{
		return TupUtils2F.minComponents(this.v, t, createNew());
	}

	@Override
	public Vec2F minComponentsN(ITupRF t)
	{
		return TupUtils2F.minComponents(this.v, t, createNew());
	}

	@Override
	public Vec2F minComponentsN(float[] t)
	{
		return TupUtils2F.minComponents(this.v, t, createNew());
	}
	
	@Override
	public Vec2F minComponentsN(float tv0, float tv1)
	{
		return TupUtils2F.minComponents(this.v, tv0, tv1, createNew());
	}
	
	@Override
	public float[] minComponentsT(ITup2RF t, float[] res)
	{
		return TupUtils2F.minComponents(this.v, t, res);
	}
	
	@Override
	public float[] minComponentsT(ITupRF t, float[] res)
	{
		return TupUtils2F.minComponents(this.v, t, res);
	}
	
	@Override
	public float[] minComponentsT(float[] t, float[] res)
	{
		return TupUtils2F.minComponents(this.v, t, res);
	}
	
	@Override
	public float[] minComponentsT(float tv0, float tv1, float[] res)
	{
		return TupUtils2F.minComponents(this.v, tv0, tv1, res);
	}
	
	@Override
	public <T extends ITup2WF> T minComponentsT(ITup2RF t, T res)
	{
		return TupUtils2F.minComponents(this.v, t, res);
	}

	@Override
	public <T extends ITup2WF> T minComponentsT(ITupRF t, T res)
	{
		return TupUtils2F.minComponents(this.v, t, res);
	}

	@Override
	public <T extends ITup2WF> T minComponentsT(float[] t, T res)
	{
		return TupUtils2F.minComponents(this.v, t, res);
	}
	
	@Override
	public <T extends ITup2WF> T minComponentsT(float tv0, float tv1, T res)
	{
		return TupUtils2F.minComponents(this.v, tv0, tv1, res);
	}
	
	@Override
	public <T extends ITupWF> T minComponentsT(ITupRF t, T res)
	{
		throw new UnsupportedOperationException("Not implemented yet.");
	}
	
	@Override
	public Vec2F maxComponents(ITup2RF t)
	{
		TupUtils2F.maxComponents(this.v, t, this.v);
		
		return this;
	}
	
	@Override
	public Vec2F maxComponents(ITupRF t)
	{
		TupUtils2F.maxComponents(this.v, t, this.v);
		
		return this;
	}
	
	@Override
	public Vec2F maxComponents(float[] t)
	{
		TupUtils2F.maxComponents(this.v, t, this.v);
		
		return this;
	}
	
	@Override
	public Vec2F maxComponents(float tv0, float tv1)
	{
		TupUtils2F.maxComponents(this.v, tv0, tv1, this.v);
		
		return this;
	}
	
	@Override
	public Vec2F maxComponentsN(ITup2RF t)
	{
		return TupUtils2F.maxComponents(this.v, t, createNew());
	}

	@Override
	public Vec2F maxComponentsN(ITupRF t)
	{
		return TupUtils2F.maxComponents(this.v, t, createNew());
	}

	@Override
	public Vec2F maxComponentsN(float[] t)
	{
		return TupUtils2F.maxComponents(this.v, t, createNew());
	}
	
	@Override
	public Vec2F maxComponentsN(float tv0, float tv1)
	{
		return TupUtils2F.maxComponents(this.v, tv0, tv1, createNew());
	}
	
	@Override
	public float[] maxComponentsT(ITup2RF t, float[] res)
	{
		return TupUtils2F.maxComponents(this.v, t, res);
	}

	@Override
	public float[] maxComponentsT(ITupRF t, float[] res)
	{
		return TupUtils2F.maxComponents(this.v, t, res);
	}

	@Override
	public float[] maxComponentsT(float[] t, float[] res)
	{
		return TupUtils2F.maxComponents(this.v, t, res);
	}
	
	@Override
	public float[] maxComponentsT(float tv0, float tv1, float[] res)
	{
		return TupUtils2F.maxComponents(this.v, tv0, tv1, res);
	}
	
	@Override
	public <T extends ITup2WF> T maxComponentsT(ITup2RF t, T res)
	{
		return TupUtils2F.maxComponents(this.v, t, res);
	}

	@Override
	public <T extends ITup2WF> T maxComponentsT(ITupRF t, T res)
	{
		return TupUtils2F.maxComponents(this.v, t, res);
	}

	@Override
	public <T extends ITup2WF> T maxComponentsT(float[] t, T res)
	{
		return TupUtils2F.maxComponents(this.v, t, res);
	}
	
	@Override
	public <T extends ITup2WF> T maxComponentsT(float tv0, float tv1, T res)
	{
		return TupUtils2F.maxComponents(this.v, tv0, tv1, res);
	}
	
	@Override
	public <T extends ITupWF> T maxComponentsT(ITupRF t, T res)
	{
		throw new UnsupportedOperationException("Not implemented yet.");
	}

	@Override
	public IndexValuePairF min()
	{
		return TupUtils2F.min(this.v, new IndexValuePairF());
	}

	@Override
	public IndexValuePairF min(IndexValuePairF res)
	{
		return TupUtils2F.min(this.v, res);
	}

	@Override
	public IndexValuePairF max()
	{
		return TupUtils2F.max(this.v, new IndexValuePairF());
	}

	@Override
	public IndexValuePairF max(IndexValuePairF res)
	{
		return TupUtils2F.max(this.v, res);
	}
}
