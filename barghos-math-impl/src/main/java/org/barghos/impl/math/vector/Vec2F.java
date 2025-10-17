package org.barghos.impl.math.vector;

import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;

import static java.lang.foreign.ValueLayout.*;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import java.util.Objects;

import org.barghos.api.core.collection.IndexValuePairF;
import org.barghos.api.core.function.floats.IFunc2F;
import org.barghos.api.core.nio.ByteUtils;
import org.barghos.api.core.nio.Endian;
import org.barghos.api.core.tuple.floats.ITup2RF;
import org.barghos.api.core.tuple.floats.ITup2WF;
import org.barghos.api.core.tuple.floats.ITupRF;
import org.barghos.api.core.tuple.floats.ITupWF;
import org.barghos.api.core.tuple.floats.RawTupUtils2F;
import org.barghos.api.core.tuple.floats.TupUtils2F;
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
	
	public final float[] v = new float[SIZE];
	
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
	public float getAt(int index)
	{
		return this.v[index];
	}
	
	/** {@inheritDoc} */
	@Override
	public Vec2F x(float x)
	{
		this.v[0] = x;
		
		return this;
	}

	/** {@inheritDoc} */
	@Override
	public Vec2F y(float y)
	{
		this.v[1] = y;
		
		return this;
	}
	
	/** {@inheritDoc} */
	@Override
	public ITup2WF v0(float v0)
	{
		this.v[0] = v0;
		
		return this;
	}

	/** {@inheritDoc} */
	@Override
	public ITup2WF v1(float v1)
	{
		this.v[1] = v1;
		
		return this;
	}

	/** {@inheritDoc} */
	@Override
	public Vec2F set(ITup2RF t)
	{
		t.toArray(this.v);
		
		return this;
	}

	/** {@inheritDoc} */
	@Override
	public Vec2F set(ITupRF t)
	{
		t.toArray(this.v);
		
		return this;
	}

	/** {@inheritDoc} */
	@Override
	public Vec2F set(float[] values)
	{
		System.arraycopy(values, 0, this.v, 0, 2);
		
		return this;
	}

	public Vec2F set(float value)
	{
		this.v[0] = value;
		this.v[1] = value;
		
		return this;
	}
	
	/** {@inheritDoc} */
	@Override
	public Vec2F set(float x, float y)
	{
		this.v[0] = x;
		this.v[1] = y;
		
		return this;
	}

	/** {@inheritDoc} */
	@Override
	public Vec2F setAt(int index, float value)
	{
		this.v[index] = value;
		
		return this;
	}

	/** {@inheritDoc} */
	@Override
	public float[] toArray()
	{
		float[] res = new float[2];
		System.arraycopy(this.v, 0, res, 0, 2);
		
		return res;
	}

	/** {@inheritDoc} */
	@Override
	public float[] toArray(float[] res)
	{
		System.arraycopy(this.v, 0, res, 0, 2);
		
		return res;
	}

	/** {@inheritDoc} */
	@Override
	public String toString()
	{
		return "vec2f(x=" + this.v[0] + ", y=" + this.v[1] + ")";
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
		
		if(obj instanceof ITup2RF t)
		{
			return equals(t);
		}
		
		return false;
	}
	
	public float[] write(float[] res)
	{
		System.arraycopy(this.v, 0, res, 0, 2);
		
		return res;
	}
	
	public ITupWF write(ITupWF res)
	{
		res.setAt(0, this.v[0]);
		res.setAt(1, this.v[1]);
		
		return res;
	}
	
	public MemorySegment write(MemorySegment res)
	{
		res.set(JAVA_FLOAT, 0, this.v[0]);
		res.set(JAVA_FLOAT, OFFSET_Y, this.v[1]);
		
		return res;
	}
	
	public FloatBuffer write(FloatBuffer res)
	{
		res.put(this.v);
		
		return res;
	}
	
	public ByteBuffer write(ByteBuffer res) throws IOException
	{
		byte[] temp = new byte[(int)BYTES];
		
		ByteUtils.setFloat(this.v[0], Endian.BIG, OFFSET_X, temp);
		ByteUtils.setFloat(this.v[1], Endian.BIG, OFFSET_Y, temp);

		res.put(temp);
		
		return res;
	}
	
	public ByteBuffer write(Endian endian, ByteBuffer res) throws IOException
	{
		byte[] temp = new byte[(int)BYTES];
		
		ByteUtils.setFloat(this.v[0], endian, OFFSET_X, temp);
		ByteUtils.setFloat(this.v[1], endian, OFFSET_Y, temp);

		res.put(temp);
		
		return res;
	}
	
	public void write(OutputStream stream) throws IOException
	{
		byte[] temp = new byte[(int)BYTES];
		
		ByteUtils.setFloat(this.v[0], Endian.BIG, OFFSET_X, temp);
		ByteUtils.setFloat(this.v[1], Endian.BIG, OFFSET_Y, temp);
		
		stream.write(temp, 0, 8);
	}
	
	public void write(Endian endian, OutputStream stream) throws IOException
	{
		byte[] temp = new byte[(int)BYTES];
		
		ByteUtils.setFloat(this.v[0], endian, OFFSET_X, temp);
		ByteUtils.setFloat(this.v[1], endian, OFFSET_Y, temp);
		
		stream.write(temp, 0, 8);
	}
	
	public Vec2F read(float[] buf)
	{
		System.arraycopy(buf, 0, this.v, 0, 2);
		
		return this;
	}
	
	public Vec2F read(ITupRF buf)
	{
		this.v[0] = buf.getAt(0);
		this.v[1] = buf.getAt(1);
		
		return this;
	}
	
	public Vec2F read(MemorySegment buf)
	{
		this.v[0] = buf.get(JAVA_FLOAT, 0);
		this.v[1] = buf.get(JAVA_FLOAT, OFFSET_Y);
		
		return this;
	}
	
	public Vec2F read(FloatBuffer buf)
	{
		buf.get(this.v);
		
		return this;
	}
	
	public Vec2F read(ByteBuffer stream) throws IOException
	{
		byte[] temp = new byte[(int)BYTES];
		
		stream.get(temp);
		
		this.v[0] = ByteUtils.getFloat(OFFSET_X, temp, Endian.BIG);
		this.v[1] = ByteUtils.getFloat(OFFSET_Y, temp, Endian.BIG);
		
		return this;
	}
	
	public Vec2F read(Endian endian, ByteBuffer stream) throws IOException
	{
		byte[] temp = new byte[(int)BYTES];
		
		stream.get(temp);
		
		this.v[0] = ByteUtils.getFloat(OFFSET_X, temp, endian);
		this.v[1] = ByteUtils.getFloat(OFFSET_Y, temp, endian);
		
		return this;
	}
	
	public Vec2F read(Endian endian, InputStream stream) throws IOException
	{
		byte[] temp = new byte[(int)BYTES];
		
		stream.read(temp);
		
		this.v[0] = ByteUtils.getFloat(OFFSET_X, temp, endian);
		this.v[1] = ByteUtils.getFloat(OFFSET_Y, temp, endian);
		
		return this;
	}
	
	public Vec2F add(Vec2F t)
	{
		this.v[0] += t.v[0];
		this.v[1] += t.v[1];

		return this;
	}
	
	/** {@inheritDoc} */
	@Override
	public Vec2F add(ITup2RF t)
	{
		this.v[0] += t.v0();
		this.v[1] += t.v1();
		
		return this;
	}

	/** {@inheritDoc} */
	@Override
	public Vec2F add(ITupRF t)
	{
		this.v[0] += t.getAt(0);
		this.v[1] += t.getAt(1);
		
		return this;
	}
	
	/** {@inheritDoc} */
	@Override
	public Vec2F add(float[] t)
	{
		this.v[0] += t[0];
		this.v[1] += t[1];
		
		return this;
	}
	
	/** {@inheritDoc} */
	@Override
	public Vec2F add(float value)
	{
		this.v[0] += value;
		this.v[1] += value;
		
		return this;
	}
	
	/** {@inheritDoc} */
	@Override
	public Vec2F add(float tX, float tY)
	{
		this.v[0] += tX;
		this.v[1] += tY;
		
		return this;
	}
	
	public Vec2F addN(Vec2F t)
	{
		return new Vec2F(
				this.v[0] + t.v[0],
				this.v[1] + t.v[1]);
	}
	
	/** {@inheritDoc} */
	@Override
	public Vec2F addN(ITup2RF t)
	{
		return new Vec2F(
				this.v[0] + t.v0(),
				this.v[1] + t.v1());
	}

	/** {@inheritDoc} */
	@Override
	public Vec2F addN(ITupRF t)
	{
		return new Vec2F(
				this.v[0] + t.getAt(0),
				this.v[1] + t.getAt(1));
	}
	
	/** {@inheritDoc} */
	@Override
	public Vec2F addN(float[] t)
	{
		return new Vec2F(
				this.v[0] + t[0],
				this.v[1] + t[1]);
	}
	
	/** {@inheritDoc} */
	@Override
	public Vec2F addN(float value)
	{
		return new Vec2F(
				this.v[0] + value,
				this.v[1] + value);
	}

	/** {@inheritDoc} */
	@Override
	public Vec2F addN(float tX, float tY)
	{
		return new Vec2F(
				this.v[0] + tX,
				this.v[1] + tY);
	}
	
	public float[] addT(Vec2F t, float[] res)
	{
		res[0] = this.v[0] + t.v[0];
		res[1] = this.v[1] + t.v[1];
		
		return res;
	}
	
	/** {@inheritDoc} */
	@Override
	public float[] addT(ITup2RF t, float[] res)
	{
		res[0] = this.v[0] + t.v0();
		res[1] = this.v[1] + t.v1();
		
		return res;
	}
	
	/** {@inheritDoc} */
	@Override
	public float[] addT(ITupRF t, float[] res)
	{
		res[0] = this.v[0] + t.getAt(0);
		res[1] = this.v[1] + t.getAt(1);
		
		return res;
	}
	
	/** {@inheritDoc} */
	@Override
	public float[] addT(float[] t, float[] res)
	{
		res[0] = this.v[0] + t[0];
		res[1] = this.v[1] + t[1];
		
		return res;
	}
	
	/** {@inheritDoc} */
	@Override
	public float[] addT(float value, float[] res)
	{
		res[0] = this.v[0] + value;
		res[1] = this.v[1] + value;
		
		return res;
	}
	
	/** {@inheritDoc} */
	@Override
	public float[] addT(float tX, float tY, float[] res)
	{
		res[0] = this.v[0] + tX;
		res[1] = this.v[1] + tY;
		
		return res;
	}
	
	public <T extends ITup2WF> T addT(Vec2F t, T res)
	{
		res.set(
				this.v[0] + t.v[0],
				this.v[1] + t.v[1]);
		
		return res;
	}
	
	/** {@inheritDoc} */
	@Override
	public <T extends ITup2WF> T addT(ITup2RF t, T res)
	{
		res.set(
				this.v[0] + t.v0(),
				this.v[1] + t.v1());
		
		return res;
	}

	/** {@inheritDoc} */
	@Override
	public <T extends ITup2WF> T addT(ITupRF t, T res)
	{
		res.set(
				this.v[0] + t.getAt(0),
				this.v[1] + t.getAt(1));
		
		return res;
	}
	
	/** {@inheritDoc} */
	@Override
	public <T extends ITup2WF> T addT(float[] t, T res)
	{
		res.set(
				this.v[0] + t[0],
				this.v[1] + t[1]);
		
		return res;
	}
	
	/** {@inheritDoc} */
	@Override
	public <T extends ITup2WF> T addT(float value, T res)
	{
		res.set(
				this.v[0] + value,
				this.v[1] + value);
		
		return res;
	}

	/** {@inheritDoc} */
	@Override
	public <T extends ITup2WF> T addT(float tX, float tY, T res)
	{
		res.set(
				this.v[0] + tX,
				this.v[1] + tY);
		
		return res;
	}

	public <T extends ITupWF> T addT(Vec2F t, T res)
	{
		res.setAt(0, this.v[0] + t.v[0]);
		res.setAt(1, this.v[1] + t.v[1]);
		
		return res;
	}
	
	public <T extends ITupWF> T addT(ITup2RF t, T res)
	{
		res.setAt(0, this.v[0] + t.v0());
		res.setAt(1, this.v[1] + t.v1());
		
		return res;
	}
	
	public <T extends ITupWF> T addT(ITupRF t, T res)
	{
		res.setAt(0, this.v[0] + t.getAt(0));
		res.setAt(1, this.v[1] + t.getAt(1));
		
		return res;
	}
	
	public <T extends ITupWF> T addT(float[] t, T res)
	{
		res.setAt(0, this.v[0] + t[0]);
		res.setAt(1, this.v[1] + t[1]);
		
		return res;
	}
	
	public <T extends ITupWF> T addT(float value, T res)
	{
		res.setAt(0, this.v[0] + value);
		res.setAt(1, this.v[1] + value);
		
		return res;
	}
	
	public <T extends ITupWF> T addT(float tX, float tY, T res)
	{
		res.setAt(0, this.v[0] + tX);
		res.setAt(1, this.v[1] + tY);
		
		return res;
	}
	
	public <T> T addFunc(Vec2F t, IFunc2F<T> func)
	{
		return func.apply(
				this.v[0] + t.v[0],
				this.v[1] + t.v[1]);
	}
	
	public <T> T addFunc(ITup2RF t, IFunc2F<T> func)
	{
		return func.apply(
				this.v[0] + t.v0(),
				this.v[1] + t.v1());
	}
	
	public <T> T addFunc(ITupRF t, IFunc2F<T> func)
	{
		return func.apply(
				this.v[0] + t.getAt(0),
				this.v[1] + t.getAt(1));
	}
	
	public <T> T addFunc(float[] t, IFunc2F<T> func)
	{
		return func.apply(
				this.v[0] + t[0],
				this.v[1] + t[1]);
	}
	
	public <T> T addFunc(float value, IFunc2F<T> func)
	{
		return func.apply(
				this.v[0] + value,
				this.v[1] + value);
	}
	
	public <T> T addFunc(float tX, float tY, IFunc2F<T> func)
	{
		return func.apply(
				this.v[0] + tX,
				this.v[1] + tY);
	}
	
	public Vec2F sub(Vec2F t)
	{
		this.v[0] -= t.v[0];
		this.v[1] -= t.v[1];
		
		return this;
	}
	
	/** {@inheritDoc} */
	@Override
	public Vec2F sub(ITup2RF t)
	{
		this.v[0] -= t.v0();
		this.v[1] -= t.v1();
		
		return this;
	}

	/** {@inheritDoc} */
	@Override
	public Vec2F sub(ITupRF t)
	{
		this.v[0] -= t.getAt(0);
		this.v[1] -= t.getAt(1);
		
		return this;
	}
	
	/** {@inheritDoc} */
	@Override
	public Vec2F sub(float[] t)
	{
		this.v[0] -= t[0];
		this.v[1] -= t[1];
		
		return this;
	}
	
	/** {@inheritDoc} */
	@Override
	public Vec2F sub(float value)
	{
		this.v[0] -= value;
		this.v[1] -= value;
		
		return this;
	}

	/** {@inheritDoc} */
	@Override
	public Vec2F sub(float tX, float tY)
	{
		this.v[0] -= tX;
		this.v[1] -= tY;
		
		return this;
	}
	
	public Vec2F subN(Vec2F t)
	{
		return new Vec2F(
				this.v[0] - t.v[0],
				this.v[1] - t.v[1]);
	}
	
	/** {@inheritDoc} */
	@Override
	public Vec2F subN(ITup2RF t)
	{
		return new Vec2F(
				this.v[0] - t.v0(),
				this.v[1] - t.v1());
	}

	/** {@inheritDoc} */
	@Override
	public Vec2F subN(ITupRF t)
	{
		return new Vec2F(
				this.v[0] - t.getAt(0),
				this.v[1] - t.getAt(1));
	}
	
	/** {@inheritDoc} */
	@Override
	public Vec2F subN(float[] t)
	{
		return new Vec2F(
				this.v[0] - t[0],
				this.v[1] - t[1]);
	}
	
	/** {@inheritDoc} */
	@Override
	public Vec2F subN(float value)
	{
		return new Vec2F(
				this.v[0] - value,
				this.v[1] - value);
	}

	/** {@inheritDoc} */
	@Override
	public Vec2F subN(float tx, float ty)
	{
		return new Vec2F(
				this.v[0] - tx,
				this.v[1] - ty);
	}
	
	public float[] subT(Vec2F t, float[] res)
	{
		res[0] = this.v[0] - t.v[0];
		res[1] = this.v[1] - t.v[1];
		
		return res;
	}
	
	/** {@inheritDoc} */
	@Override
	public float[] subT(ITup2RF t, float[] res)
	{
		res[0] = this.v[0] - t.v0();
		res[1] = this.v[1] - t.v1();
		
		return res;
	}
	
	/** {@inheritDoc} */
	@Override
	public float[] subT(ITupRF t, float[] res)
	{
		res[0] = this.v[0] - t.getAt(0);
		res[1] = this.v[1] - t.getAt(1);
		
		return res;
	}
	
	/** {@inheritDoc} */
	@Override
	public float[] subT(float[] t, float[] res)
	{
		res[0] = this.v[0] - t[0];
		res[1] = this.v[1] - t[1];
		
		return res;
	}
	
	/** {@inheritDoc} */
	@Override
	public float[] subT(float value, float[] res)
	{
		res[0] = this.v[0] - value;
		res[1] = this.v[1] - value;
		
		return res;
	}
	
	/** {@inheritDoc} */
	@Override
	public float[] subT(float tx, float ty, float[] res)
	{
		res[0] = this.v[0] - tx;
		res[1] = this.v[1] - ty;
		
		return res;
	}
	
	public <T extends ITup2WF> T subT(Vec2F t, T res)
	{
		res.set(
				this.v[0] - t.v[0],
				this.v[1] - t.v[1]);
		
		return res;
	}
	
	/** {@inheritDoc} */
	@Override
	public <T extends ITup2WF> T subT(ITup2RF t, T res)
	{
		res.set(
				this.v[0] - t.v0(),
				this.v[1] - t.v1());
		
		return res;
	}

	/** {@inheritDoc} */
	@Override
	public <T extends ITup2WF> T subT(ITupRF t, T res)
	{
		res.set(
				this.v[0] - t.getAt(0),
				this.v[1] - t.getAt(1));
		
		return res;
	}
	
	/** {@inheritDoc} */
	@Override
	public <T extends ITup2WF> T subT(float[] t, T res)
	{
		res.set(
				this.v[0] - t[0],
				this.v[1] - t[1]);
		
		return res;
	}
	
	/** {@inheritDoc} */
	@Override
	public <T extends ITup2WF> T subT(float value, T res)
	{
		res.set(
				this.v[0] - value,
				this.v[1] - value);
		
		return res;
	}

	/** {@inheritDoc} */
	@Override
	public <T extends ITup2WF> T subT(float tX, float tY, T res)
	{
		res.set(
				this.v[0] - tX,
				this.v[1] - tY);
		
		return res;
	}

	public <T extends ITupWF> T subT(Vec2F t, T res)
	{
		res.setAt(0, this.v[0] - t.v[0]);
		res.setAt(1, this.v[1] - t.v[1]);
		
		return res;
	}
	
	public <T extends ITupWF> T subT(ITup2RF t, T res)
	{
		res.setAt(0, this.v[0] - t.v0());
		res.setAt(1, this.v[1] - t.v1());
		
		return res;
	}
	
	public <T extends ITupWF> T subT(ITupRF t, T res)
	{
		res.setAt(0, this.v[0] - t.getAt(0));
		res.setAt(1, this.v[1] - t.getAt(1));
		
		return res;
	}
	
	public <T extends ITupWF> T subT(float[] t, T res)
	{
		res.setAt(0, this.v[0] - t[0]);
		res.setAt(1, this.v[1] - t[1]);
		
		return res;
	}
	
	public <T extends ITupWF> T subT(float value, T res)
	{
		res.setAt(0, this.v[0] - value);
		res.setAt(1, this.v[1] - value);
		
		return res;
	}
	
	public <T extends ITupWF> T subT(float tX, float tY, T res)
	{
		res.setAt(0, this.v[0] - tX);
		res.setAt(1, this.v[1] - tY);
		
		return res;
	}

	public <T> T subFunc(float[] t, IFunc2F<T> func)
	{
		return func.apply(
				this.v[0] - t[0],
				this.v[1] - t[1]);
	}
	
	public <T> T subFunc(float value, IFunc2F<T> func)
	{
		return func.apply(
				this.v[0] - value,
				this.v[1] - value);
	}
	
	public <T> T subFunc(float tX, float tY, IFunc2F<T> func)
	{
		return func.apply(
				this.v[0] - tX,
				this.v[1] - tY);
	}
	
	public Vec2F rSub(Vec2F t)
	{
		this.v[0] = t.v[0] - this.v[0];
		this.v[1] = t.v[1] - this.v[1];
		
		return this;
	}
	
	/** {@inheritDoc} */
	@Override
	public Vec2F rSub(ITup2RF t)
	{
		this.v[0] = t.v0() - this.v[0];
		this.v[1] = t.v1() - this.v[1];
		
		return this;
	}

	/** {@inheritDoc} */
	@Override
	public Vec2F rSub(ITupRF t)
	{
		this.v[0] = t.getAt(0) - this.v[0];
		this.v[1] = t.getAt(1) - this.v[1];
		
		return this;
	}
	
	/** {@inheritDoc} */
	@Override
	public Vec2F rSub(float[] t)
	{
		this.v[0] = t[0] - this.v[0];
		this.v[1] = t[1] - this.v[1];
		
		return this;
	}
	
	/** {@inheritDoc} */
	@Override
	public Vec2F rSub(float value)
	{
		this.v[0] = value - this.v[0];
		this.v[1] = value - this.v[1];
		
		return this;
	}

	/** {@inheritDoc} */
	@Override
	public Vec2F rSub(float tX, float tY)
	{
		this.v[0] = tX - this.v[0];
		this.v[1] = tY - this.v[1];
		
		return this;
	}
	
	public Vec2F rSubN(Vec2F t)
	{
		return new Vec2F(
				t.v[0] - this.v[0],
				t.v[1] - this.v[1]);
	}
	
	/** {@inheritDoc} */
	@Override
	public Vec2F rSubN(ITup2RF t)
	{
		return new Vec2F(
				t.v0() - this.v[0],
				t.v1() - this.v[1]);
	}

	/** {@inheritDoc} */
	@Override
	public Vec2F rSubN(ITupRF t)
	{
		return new Vec2F(
				t.getAt(0) - this.v[0],
				t.getAt(1) - this.v[1]);
	}
	
	/** {@inheritDoc} */
	@Override
	public Vec2F rSubN(float[] t)
	{
		return new Vec2F(
				t[0] - this.v[0],
				t[1] - this.v[1]);
	}
	
	/** {@inheritDoc} */
	@Override
	public Vec2F rSubN(float value)
	{
		return new Vec2F(
				value - this.v[0],
				value - this.v[1]);
	}

	/** {@inheritDoc} */
	@Override
	public Vec2F rSubN(float tx, float ty)
	{
		return new Vec2F(
				tx - this.v[0],
				ty - this.v[1]);
	}
	
	public float[] rSubT(Vec2F t, float[] res)
	{
		res[0] = t.v[0] - this.v[0];
		res[1] = t.v[1] - this.v[1];
		
		return res;
	}
	
	/** {@inheritDoc} */
	@Override
	public float[] rSubT(ITup2RF t, float[] res)
	{
		res[0] = t.v0() - this.v[0];
		res[1] = t.v1() - this.v[1];
		
		return res;
	}
	
	/** {@inheritDoc} */
	@Override
	public float[] rSubT(ITupRF t, float[] res)
	{
		res[0] = t.getAt(0) - this.v[0];
		res[1] = t.getAt(1) - this.v[1];
		
		return res;
	}
	
	/** {@inheritDoc} */
	@Override
	public float[] rSubT(float[] t, float[] res)
	{
		res[0] = t[0] - this.v[0];
		res[1] = t[1] - this.v[1];
		
		return res;
	}
	
	/** {@inheritDoc} */
	@Override
	public float[] rSubT(float value, float[] res)
	{
		res[0] = value - this.v[0];
		res[1] = value - this.v[1];
		
		return res;
	}
	
	/** {@inheritDoc} */
	@Override
	public float[] rSubT(float tx, float ty, float[] res)
	{
		res[0] = tx - this.v[0];
		res[1] = ty - this.v[1];
		
		return res;
	}
	
	public <T extends ITup2WF> T rSubT(Vec2F t, T res)
	{
		res.set(
				t.v[0] - this.v[0],
				t.v[1] - this.v[1]);
		
		return res;
	}
	
	/** {@inheritDoc} */
	@Override
	public <T extends ITup2WF> T rSubT(ITup2RF t, T res)
	{
		res.set(
				t.v0() - this.v[0],
				t.v1() - this.v[1]);
		
		return res;
	}

	/** {@inheritDoc} */
	@Override
	public <T extends ITup2WF> T rSubT(ITupRF t, T res)
	{
		res.set(
				t.getAt(0) - this.v[0],
				t.getAt(1) - this.v[1]);
		
		return res;
	}
	
	/** {@inheritDoc} */
	@Override
	public <T extends ITup2WF> T rSubT(float[] t, T res)
	{
		res.set(
				t[0] - this.v[0],
				t[1] - this.v[1]);
		
		return res;
	}
	
	/** {@inheritDoc} */
	@Override
	public <T extends ITup2WF> T rSubT(float value, T res)
	{
		res.set(
				value - this.v[0],
				value - this.v[1]);
		
		return res;
	}

	/** {@inheritDoc} */
	@Override
	public <T extends ITup2WF> T rSubT(float tX, float tY, T res)
	{
		res.set(
				tX - this.v[0],
				tY - this.v[1]);
		
		return res;
	}

	public <T extends ITupWF> T rSubT(Vec2F t, T res)
	{
		res.setAt(0, t.v[0] - this.v[0]);
		res.setAt(1, t.v[1] - this.v[1]);
		
		return res;
	}
	
	public <T extends ITupWF> T rSubT(ITup2RF t, T res)
	{
		res.setAt(0, t.v0() - this.v[0]);
		res.setAt(1, t.v1() - this.v[1]);
		
		return res;
	}
	
	public <T extends ITupWF> T rSubT(ITupRF t, T res)
	{
		res.setAt(0, t.getAt(0) - this.v[0]);
		res.setAt(1, t.getAt(1) - this.v[1]);
		
		return res;
	}
	
	public <T extends ITupWF> T rSubT(float[] t, T res)
	{
		res.setAt(0, t[0] - this.v[0]);
		res.setAt(1, t[1] - this.v[1]);
		
		return res;
	}
	
	public <T extends ITupWF> T rSubT(float value, T res)
	{
		res.setAt(0, value - this.v[0]);
		res.setAt(1, value - this.v[1]);
		
		return res;
	}
	
	public <T extends ITupWF> T rSubT(float tX, float tY, T res)
	{
		res.setAt(0, tX - this.v[0]);
		res.setAt(1, tY - this.v[1]);
		
		return res;
	}

	public <T> T rSubFunc(Vec2F t, IFunc2F<T> func)
	{
		return func.apply(
				t.v[0] - this.v[0],
				t.v[1] - this.v[1]);
	}
	
	public <T> T rSubFunc(ITup2RF t, IFunc2F<T> func)
	{
		return func.apply(
				t.v0() - this.v[0],
				t.v1() - this.v[1]);
	}
	
	public <T> T rSubFunc(ITupRF t, IFunc2F<T> func)
	{
		return func.apply(
				t.getAt(0) - this.v[0],
				t.getAt(1) - this.v[1]);
	}
	
	public <T> T rSubFunc(float[] t, IFunc2F<T> func)
	{
		return func.apply(
				t[0] - this.v[0],
				t[1] - this.v[1]);
	}
	
	public <T> T rSubFunc(float value, IFunc2F<T> func)
	{
		return func.apply(
				value - this.v[0],
				value - this.v[1]);
	}
	
	public <T> T rSubFunc(float tX, float tY, IFunc2F<T> func)
	{
		return func.apply(
				tX - this.v[0],
				tY - this.v[1]);
	}
	
	public Vec2F mul(Vec2F t)
	{
		this.v[0] *= t.v[0];
		this.v[1] *= t.v[1];

		return this;
	}
	
	/** {@inheritDoc} */
	@Override
	public Vec2F mul(ITup2RF t)
	{
		this.v[0] *= t.v0();
		this.v[1] *= t.v1();
		
		return this;
	}

	/** {@inheritDoc} */
	@Override
	public Vec2F mul(ITupRF t)
	{
		this.v[0] *= t.getAt(0);
		this.v[1] *= t.getAt(1);
		
		return this;
	}
	
	/** {@inheritDoc} */
	@Override
	public Vec2F mul(float[] t)
	{
		this.v[0] *= t[0];
		this.v[1] *= t[1];
		
		return this;
	}
	
	/** {@inheritDoc} */
	@Override
	public Vec2F mul(float value)
	{
		this.v[0] *= value;
		this.v[1] *= value;
		
		return this;
	}
	
	/** {@inheritDoc} */
	@Override
	public Vec2F mul(float tX, float tY)
	{
		this.v[0] *= tX;
		this.v[1] *= tY;
		
		return this;
	}
	
	public Vec2F mulN(Vec2F t)
	{
		return new Vec2F(
				this.v[0] * t.v[0],
				this.v[1] * t.v[1]);
	}
	
	/** {@inheritDoc} */
	@Override
	public Vec2F mulN(ITup2RF t)
	{
		return new Vec2F(
				this.v[0] * t.v0(),
				this.v[1] * t.v1());
	}

	/** {@inheritDoc} */
	@Override
	public Vec2F mulN(ITupRF t)
	{
		return new Vec2F(
				this.v[0] * t.getAt(0),
				this.v[1] * t.getAt(1));
	}
	
	/** {@inheritDoc} */
	@Override
	public Vec2F mulN(float[] t)
	{
		return new Vec2F(
				this.v[0] * t[0],
				this.v[1] * t[1]);
	}
	
	/** {@inheritDoc} */
	@Override
	public Vec2F mulN(float value)
	{
		return new Vec2F(
				this.v[0] * value,
				this.v[1] * value);
	}

	/** {@inheritDoc} */
	@Override
	public Vec2F mulN(float tX, float tY)
	{
		return new Vec2F(
				this.v[0] * tX,
				this.v[1] * tY);
	}
	
	public float[] mulT(Vec2F t, float[] res)
	{
		res[0] = this.v[0] * t.v[0];
		res[1] = this.v[1] * t.v[1];
		
		return res;
	}
	
	/** {@inheritDoc} */
	@Override
	public float[] mulT(ITup2RF t, float[] res)
	{
		res[0] = this.v[0] * t.v0();
		res[1] = this.v[1] * t.v1();
		
		return res;
	}
	
	/** {@inheritDoc} */
	@Override
	public float[] mulT(ITupRF t, float[] res)
	{
		res[0] = this.v[0] * t.getAt(0);
		res[1] = this.v[1] * t.getAt(1);
		
		return res;
	}
	
	/** {@inheritDoc} */
	@Override
	public float[] mulT(float[] t, float[] res)
	{
		res[0] = this.v[0] * t[0];
		res[1] = this.v[1] * t[1];
		
		return res;
	}
	
	/** {@inheritDoc} */
	@Override
	public float[] mulT(float value, float[] res)
	{
		res[0] = this.v[0] * value;
		res[1] = this.v[1] * value;
		
		return res;
	}
	
	/** {@inheritDoc} */
	@Override
	public float[] mulT(float tX, float tY, float[] res)
	{
		res[0] = this.v[0] * tX;
		res[1] = this.v[1] * tY;
		
		return res;
	}
	
	public <T extends ITup2WF> T mulT(Vec2F t, T res)
	{
		res.set(
				this.v[0] * t.v[0],
				this.v[1] * t.v[1]);
		
		return res;
	}
	
	/** {@inheritDoc} */
	@Override
	public <T extends ITup2WF> T mulT(ITup2RF t, T res)
	{
		res.set(
				this.v[0] * t.v0(),
				this.v[1] * t.v1());
		
		return res;
	}

	/** {@inheritDoc} */
	@Override
	public <T extends ITup2WF> T mulT(ITupRF t, T res)
	{
		res.set(
				this.v[0] * t.getAt(0),
				this.v[1] * t.getAt(1));
		
		return res;
	}
	
	/** {@inheritDoc} */
	@Override
	public <T extends ITup2WF> T mulT(float[] t, T res)
	{
		res.set(
				this.v[0] * t[0],
				this.v[1] * t[1]);
		
		return res;
	}
	
	/** {@inheritDoc} */
	@Override
	public <T extends ITup2WF> T mulT(float value, T res)
	{
		res.set(
				this.v[0] * value,
				this.v[1] * value);
		
		return res;
	}

	/** {@inheritDoc} */
	@Override
	public <T extends ITup2WF> T mulT(float tX, float tY, T res)
	{
		res.set(
				this.v[0] * tX,
				this.v[1] * tY);
		
		return res;
	}

	public <T extends ITupWF> T mulT(Vec2F t, T res)
	{
		res.setAt(0, this.v[0] * t.v[0]);
		res.setAt(1, this.v[1] * t.v[1]);
		
		return res;
	}
	
	public <T extends ITupWF> T mulT(ITup2RF t, T res)
	{
		res.setAt(0, this.v[0] * t.v0());
		res.setAt(1, this.v[1] * t.v1());
		
		return res;
	}
	
	public <T extends ITupWF> T mulT(ITupRF t, T res)
	{
		res.setAt(0, this.v[0] * t.getAt(0));
		res.setAt(1, this.v[1] * t.getAt(1));
		
		return res;
	}
	
	public <T extends ITupWF> T mulT(float[] t, T res)
	{
		res.setAt(0, this.v[0] * t[0]);
		res.setAt(1, this.v[1] * t[1]);
		
		return res;
	}
	
	public <T extends ITupWF> T mulT(float value, T res)
	{
		res.setAt(0, this.v[0] * value);
		res.setAt(1, this.v[1] * value);
		
		return res;
	}
	
	public <T extends ITupWF> T mulT(float tX, float tY, T res)
	{
		res.setAt(0, this.v[0] * tX);
		res.setAt(1, this.v[1] * tY);
		
		return res;
	}
	
	public <T> T mulFunc(Vec2F t, IFunc2F<T> func)
	{
		return func.apply(
				this.v[0] * t.v[0],
				this.v[1] * t.v[1]);
	}
	
	public <T> T mulFunc(ITup2RF t, IFunc2F<T> func)
	{
		return func.apply(
				this.v[0] * t.v0(),
				this.v[1] * t.v1());
	}
	
	public <T> T mulFunc(ITupRF t, IFunc2F<T> func)
	{
		return func.apply(
				this.v[0] * t.getAt(0),
				this.v[1] * t.getAt(1));
	}
	
	public <T> T mulFunc(float[] t, IFunc2F<T> func)
	{
		return func.apply(
				this.v[0] * t[0],
				this.v[1] * t[1]);
	}
	
	public <T> T mulFunc(float value, IFunc2F<T> func)
	{
		return func.apply(
				this.v[0] * value,
				this.v[1] * value);
	}
	
	public <T> T mulFunc(float tX, float tY, IFunc2F<T> func)
	{
		return func.apply(
				this.v[0] * tX,
				this.v[1] * tY);
	}

	/** {@inheritDoc} */
	@Override
	public Vec2F div(ITup2RF t)
	{
		VecUtils2F.div(this.v, t, this.v);
		
		return this;
	}

	/** {@inheritDoc} */
	@Override
	public Vec2F div(ITupRF t)
	{
		VecUtils2F.div(this.v, t, this.v);
		
		return this;
	}
	
	/** {@inheritDoc} */
	@Override
	public Vec2F div(float[] t)
	{
		VecUtils2F.div(this.v, t, this.v);
		
		return this;
	}

	/** {@inheritDoc} */
	@Override
	public Vec2F div(float value)
	{
		VecUtils2F.div(this.v, value, value, this.v);
		
		return this;
	}

	/** {@inheritDoc} */
	@Override
	public Vec2F div(float tx, float ty)
	{
		VecUtils2F.div(this.v, tx, ty, this.v);
		
		return this;
	}
	
	/** {@inheritDoc} */
	@Override
	public Vec2F divN(ITup2RF t)
	{
		return VecUtils2F.divFunc(this.v, t, CTOR);
	}

	/** {@inheritDoc} */
	@Override
	public Vec2F divN(ITupRF t)
	{
		return VecUtils2F.divFunc(this.v, t, CTOR);
	}
	
	/** {@inheritDoc} */
	@Override
	public Vec2F divN(float[] t)
	{
		return VecUtils2F.divFunc(this.v, t, CTOR);
	}

	/** {@inheritDoc} */
	@Override
	public Vec2F divN(float value)
	{
		return VecUtils2F.divFunc(this.v, value, value, CTOR);
	}

	/** {@inheritDoc} */
	@Override
	public Vec2F divN(float tx, float ty)
	{
		return VecUtils2F.divFunc(this.v, tx, ty, CTOR);
	}
	
	/** {@inheritDoc} */
	@Override
	public float[] divT(ITup2RF t, float[] res)
	{
		return VecUtils2F.div(this.v, t, res);
	}
	
	/** {@inheritDoc} */
	@Override
	public float[] divT(ITupRF t, float[] res)
	{
		return VecUtils2F.div(this.v, t, res);
	}
	
	/** {@inheritDoc} */
	@Override
	public float[] divT(float[] t, float[] res)
	{
		return VecUtils2F.div(this.v, t, res);
	}
	
	/** {@inheritDoc} */
	@Override
	public float[] divT(float value, float[] res)
	{
		return VecUtils2F.div(this.v, value, value, res);
	}
	
	/** {@inheritDoc} */
	@Override
	public float[] divT(float tx, float ty, float[] res)
	{
		return VecUtils2F.div(this.v, tx, ty, res);
	}
	
	/** {@inheritDoc} */
	@Override
	public <T extends ITup2WF> T divT(ITup2RF t, T res)
	{
		return VecUtils2F.div(this.v, t, res);
	}

	/** {@inheritDoc} */
	@Override
	public <T extends ITup2WF> T divT(ITupRF t, T res)
	{
		return VecUtils2F.div(this.v, t, res);
	}
	
	/** {@inheritDoc} */
	@Override
	public <T extends ITup2WF> T divT(float[] t, T res)
	{
		return VecUtils2F.div(this.v, t, res);
	}

	/** {@inheritDoc} */
	@Override
	public <T extends ITup2WF> T divT(float value, T res)
	{
		return VecUtils2F.div(this.v, value, value, res);
	}
	
	/** {@inheritDoc} */
	@Override
	public <T extends ITup2WF> T divT(float tx, float ty, T res)
	{
		return VecUtils2F.div(this.v, tx, ty, res);
	}

	/** {@inheritDoc} */
	@Override
	public Vec2F rDiv(ITup2RF t)
	{
		VecUtils2F.div(t, this.v, this.v);
		
		return this;
	}

	/** {@inheritDoc} */
	@Override
	public Vec2F rDiv(ITupRF t)
	{
		VecUtils2F.div(t, this.v, this.v);
		
		return this;
	}
	
	/** {@inheritDoc} */
	@Override
	public Vec2F rDiv(float[] t)
	{
		VecUtils2F.div(t, this.v, this.v);
		
		return this;
	}

	/** {@inheritDoc} */
	@Override
	public Vec2F rDiv(float value)
	{
		VecUtils2F.div(value, value, this.v, this.v);
		
		return this;
	}

	/** {@inheritDoc} */
	@Override
	public Vec2F rDiv(float tx, float ty)
	{
		VecUtils2F.div(tx, ty, this.v, this.v);
		
		return this;
	}
	
	/** {@inheritDoc} */
	@Override
	public Vec2F rDivN(ITup2RF t)
	{
		return VecUtils2F.divFunc(t, this.v, CTOR);
	}

	/** {@inheritDoc} */
	@Override
	public Vec2F rDivN(ITupRF t)
	{
		return VecUtils2F.divFunc(t, this.v, CTOR);
	}
	
	/** {@inheritDoc} */
	@Override
	public Vec2F rDivN(float[] t)
	{
		return VecUtils2F.divFunc(t, this.v, CTOR);
	}

	/** {@inheritDoc} */
	@Override
	public Vec2F rDivN(float value)
	{
		return VecUtils2F.divFunc(value, value, this.v, CTOR);
	}

	/** {@inheritDoc} */
	@Override
	public Vec2F rDivN(float tx, float ty)
	{
		return VecUtils2F.divFunc(tx, ty, this.v, CTOR);
	}
	
	/** {@inheritDoc} */
	@Override
	public float[] rDivT(ITup2RF t, float[] res)
	{
		return VecUtils2F.div(t, this.v, res);
	}
	
	/** {@inheritDoc} */
	@Override
	public float[] rDivT(ITupRF t, float[] res)
	{
		return VecUtils2F.div(t, this.v, res);
	}
	
	/** {@inheritDoc} */
	@Override
	public float[] rDivT(float[] t, float[] res)
	{
		return VecUtils2F.div(t, this.v, res);
	}
	
	/** {@inheritDoc} */
	@Override
	public float[] rDivT(float value, float[] res)
	{
		return VecUtils2F.div(value, value, this.v, res);
	}
	
	/** {@inheritDoc} */
	@Override
	public float[] rDivT(float tx, float ty, float[] res)
	{
		return VecUtils2F.div(tx, ty, this.v, res);
	}
	
	/** {@inheritDoc} */
	@Override
	public <T extends ITup2WF> T rDivT(ITup2RF t, T res)
	{
		return VecUtils2F.div(t, this.v, res);
	}

	/** {@inheritDoc} */
	@Override
	public <T extends ITup2WF> T rDivT(ITupRF t, T res)
	{
		return VecUtils2F.div(t, this.v, res);
	}
	
	/** {@inheritDoc} */
	@Override
	public <T extends ITup2WF> T rDivT(float[] t, T res)
	{
		return VecUtils2F.div(t, this.v, res);
	}

	/** {@inheritDoc} */
	@Override
	public <T extends ITup2WF> T rDivT(float value, T res)
	{
		return VecUtils2F.div(value, value, this.v, res);
	}

	/** {@inheritDoc} */
	@Override
	public <T extends ITup2WF> T rDivT(float tx, float ty, T res)
	{
		return VecUtils2F.div(tx, ty, this.v, res);
	}
	
	/** {@inheritDoc} */
	@Override
	public float length()
	{
		return VecUtils2F.len(this.v);
	}

	/** {@inheritDoc} */
	@Override
	public float lengthEM(float tolerance)
	{
		return VecUtils2F.lenEM(tolerance, this.v);
	}

	/** {@inheritDoc} */
	@Override
	public float lengthEM4()
	{
		return VecUtils2F.lenEM4(this.v);
	}
	
	/** {@inheritDoc} */
	@Override
	public float lengthEM6()
	{
		return VecUtils2F.lenEM6(this.v);
	}
	
	/** {@inheritDoc} */
	@Override
	public float lengthEM8()
	{
		return VecUtils2F.lenEM8(this.v);
	}
	
	/** {@inheritDoc} */
	@Override
	public float lengthReciprocal()
	{
		return VecUtils2F.lenRc(this.v);
	}

	/** {@inheritDoc} */
	@Override
	public float lengthTo(ITup2RF t)
	{
		return VecUtils2F.lenTo(this.v, t);
	}

	/** {@inheritDoc} */
	@Override
	public float lengthTo(ITupRF t)
	{
		return VecUtils2F.lenTo(this.v, t);
	}
	
	/** {@inheritDoc} */
	@Override
	public float lengthTo(float[] t)
	{
		return VecUtils2F.lenTo(this.v, t);
	}
	
	/** {@inheritDoc} */
	@Override
	public float lengthTo(float tx, float ty)
	{
		return VecUtils2F.lenTo(this.v, tx, ty);
	}
	
	/** {@inheritDoc} */
	@Override
	public float lengthToEM(float tolerance, ITup2RF t)
	{
		return VecUtils2F.lenToEM(tolerance, this.v, t);
	}

	/** {@inheritDoc} */
	@Override
	public float lengthToEM(float tolerance, ITupRF t)
	{
		return VecUtils2F.lenToEM(tolerance, this.v, t);
	}
	
	/** {@inheritDoc} */
	@Override
	public float lengthToEM(float tolerance, float[] t)
	{
		return VecUtils2F.lenToEM(tolerance, this.v, t);
	}
	
	/** {@inheritDoc} */
	@Override
	public float lengthToEM(float tolerance, float tx, float ty)
	{
		return VecUtils2F.lenToEM(tolerance, this.v, tx, ty);
	}

	/** {@inheritDoc} */
	@Override
	public float lengthToEM4(ITup2RF t)
	{
		return VecUtils2F.lenToEM4(this.v, t);
	}

	/** {@inheritDoc} */
	@Override
	public float lengthToEM4(ITupRF t)
	{
		return VecUtils2F.lenToEM4(this.v, t);
	}
	
	/** {@inheritDoc} */
	@Override
	public float lengthToEM4(float[] t)
	{
		return VecUtils2F.lenToEM4(this.v, t);
	}
	
	/** {@inheritDoc} */
	@Override
	public float lengthToEM4(float tx, float ty)
	{
		return VecUtils2F.lenToEM4(this.v, tx, ty);
	}
	
	/** {@inheritDoc} */
	@Override
	public float lengthToEM6(ITup2RF t)
	{
		return VecUtils2F.lenToEM6(this.v, t);
	}

	/** {@inheritDoc} */
	@Override
	public float lengthToEM6(ITupRF t)
	{
		return VecUtils2F.lenToEM6(this.v, t);
	}
	
	/** {@inheritDoc} */
	@Override
	public float lengthToEM6(float[] t)
	{
		return VecUtils2F.lenToEM6(this.v, t);
	}
	
	/** {@inheritDoc} */
	@Override
	public float lengthToEM6(float tx, float ty)
	{
		return VecUtils2F.lenToEM6(this.v, tx, ty);
	}
	
	/** {@inheritDoc} */
	@Override
	public float lengthToEM8(ITup2RF t)
	{
		return VecUtils2F.lenToEM8(this.v, t);
	}

	/** {@inheritDoc} */
	@Override
	public float lengthToEM8(ITupRF t)
	{
		return VecUtils2F.lenToEM8(this.v, t);
	}
	
	/** {@inheritDoc} */
	@Override
	public float lengthToEM8(float[] t)
	{
		return VecUtils2F.lenToEM8(this.v, t);
	}
	
	/** {@inheritDoc} */
	@Override
	public float lengthToEM8(float tx, float ty)
	{
		return VecUtils2F.lenToEM8(this.v, tx, ty);
	}
	
	/** {@inheritDoc} */
	@Override
	public float lengthReciprocalTo(ITup2RF t)
	{
		return VecUtils2F.lenRcTo(this.v, t);
	}

	/** {@inheritDoc} */
	@Override
	public float lengthReciprocalTo(ITupRF t)
	{
		return VecUtils2F.lenRcTo(this.v, t);
	}
	
	/** {@inheritDoc} */
	@Override
	public float lengthReciprocalTo(float[] t)
	{
		return VecUtils2F.lenRcTo(this.v, t);
	}

	/** {@inheritDoc} */
	@Override
	public float lengthReciprocalTo(float tx, float ty)
	{
		return VecUtils2F.lenRcTo(this.v, tx, ty);
	}

	/** {@inheritDoc} */
	@Override
	public float lengthSquared()
	{
		return VecUtils2F.lenSq(this.v);
	}

	/** {@inheritDoc} */
	@Override
	public float lengthSquaredEM(float tolerance)
	{
		return VecUtils2F.lenSqEM(tolerance, this.v);
	}
	
	/** {@inheritDoc} */
	@Override
	public float lengthSquaredEM4()
	{
		return VecUtils2F.lenSqEM4(this.v);
	}
	
	/** {@inheritDoc} */
	@Override
	public float lengthSquaredEM6()
	{
		return VecUtils2F.lenSqEM6(this.v);
	}
	
	/** {@inheritDoc} */
	@Override
	public float lengthSquaredEM8()
	{
		return VecUtils2F.lenSqEM8(this.v);
	}
	
	/** {@inheritDoc} */
	@Override
	public float lengthSquaredTo(ITup2RF t)
	{
		return VecUtils2F.lenSqTo(this.v, t);
	}

	/** {@inheritDoc} */
	@Override
	public float lengthSquaredTo(ITupRF t)
	{
		return VecUtils2F.lenSqTo(this.v, t);
	}
	
	/** {@inheritDoc} */
	@Override
	public float lengthSquaredTo(float[] t)
	{
		return VecUtils2F.lenSqTo(this.v, t);
	}

	/** {@inheritDoc} */
	@Override
	public float lengthSquaredTo(float tx, float ty)
	{
		return VecUtils2F.lenSqTo(this.v, tx, ty);
	}
	
	/** {@inheritDoc} */
	@Override
	public float lengthSquaredToEM(float tolerance, ITup2RF t)
	{
		return VecUtils2F.lenSqToEM(tolerance, this.v, t);
	}

	/** {@inheritDoc} */
	@Override
	public float lengthSquaredToEM(float tolerance, ITupRF t)
	{
		return VecUtils2F.lenSqToEM(tolerance, this.v, t);
	}
	
	/** {@inheritDoc} */
	@Override
	public float lengthSquaredToEM(float tolerance, float[] t)
	{
		return VecUtils2F.lenSqToEM(tolerance, this.v, t);
	}

	/** {@inheritDoc} */
	@Override
	public float lengthSquaredToEM(float tolerance, float tx, float ty)
	{
		return VecUtils2F.lenSqToEM(tolerance, this.v, tx, ty);
	}
	
	/** {@inheritDoc} */
	@Override
	public float lengthSquaredToEM4(ITup2RF t)
	{
		return VecUtils2F.lenSqToEM4(this.v, t);
	}

	/** {@inheritDoc} */
	@Override
	public float lengthSquaredToEM4(ITupRF t)
	{
		return VecUtils2F.lenSqToEM4(this.v, t);
	}
	
	/** {@inheritDoc} */
	@Override
	public float lengthSquaredToEM4(float[] t)
	{
		return VecUtils2F.lenSqToEM4(this.v, t);
	}

	/** {@inheritDoc} */
	@Override
	public float lengthSquaredToEM4(float tx, float ty)
	{
		return VecUtils2F.lenSqToEM4(this.v, tx, ty);
	}
	
	/** {@inheritDoc} */
	@Override
	public float lengthSquaredToEM6(ITup2RF t)
	{
		return VecUtils2F.lenSqToEM6(this.v, t);
	}

	/** {@inheritDoc} */
	@Override
	public float lengthSquaredToEM6(ITupRF t)
	{
		return VecUtils2F.lenSqToEM6(this.v, t);
	}
	
	/** {@inheritDoc} */
	@Override
	public float lengthSquaredToEM6(float[] t)
	{
		return VecUtils2F.lenSqToEM6(this.v, t);
	}

	/** {@inheritDoc} */
	@Override
	public float lengthSquaredToEM6(float tx, float ty)
	{
		return VecUtils2F.lenSqToEM6(this.v, tx, ty);
	}
	
	/** {@inheritDoc} */
	@Override
	public float lengthSquaredToEM8(ITup2RF t)
	{
		return VecUtils2F.lenSqToEM8(this.v, t);
	}

	/** {@inheritDoc} */
	@Override
	public float lengthSquaredToEM8(ITupRF t)
	{
		return VecUtils2F.lenSqToEM8(this.v, t);
	}
	
	/** {@inheritDoc} */
	@Override
	public float lengthSquaredToEM8(float[] t)
	{
		return VecUtils2F.lenSqToEM8(this.v, t);
	}

	/** {@inheritDoc} */
	@Override
	public float lengthSquaredToEM8(float tx, float ty)
	{
		return VecUtils2F.lenSqToEM8(this.v, tx, ty);
	}
	
	/** {@inheritDoc} */
	@Override
	public float dot(ITup2RF t)
	{
		return VecUtils2F.dot(this.v, t);
	}

	/** {@inheritDoc} */
	@Override
	public float dot(ITupRF t)
	{
		return VecUtils2F.dot(this.v, t);
	}
	
	/** {@inheritDoc} */
	@Override
	public float dot(float[] t)
	{
		return VecUtils2F.dot(this.v, t);
	}

	/** {@inheritDoc} */
	@Override
	public float dot(float tx, float ty)
	{
		return VecUtils2F.dot(this.v, tx, ty);
	}
	
	/** {@inheritDoc} */
	@Override
	public Vec2F halfVecTo(ITup2RF t)
	{
		VecUtils2F.halfVecTo(this.v, t, this.v);
		
		return this;
	}

	/** {@inheritDoc} */
	@Override
	public Vec2F halfVecTo(ITupRF t)
	{
		VecUtils2F.halfVecTo(this.v, t, this.v);
		
		return this;
	}
	
	/** {@inheritDoc} */
	@Override
	public Vec2F halfVecTo(float[] t)
	{
		VecUtils2F.halfVecTo(this.v, t, this.v);
		
		return this;
	}

	/** {@inheritDoc} */
	@Override
	public Vec2F halfVecTo(float tx, float ty)
	{
		VecUtils2F.halfVecTo(this.v, tx, ty, this.v);
		
		return this;
	}
	
	/** {@inheritDoc} */
	@Override
	public Vec2F halfVecToN(ITup2RF t)
	{
		return VecUtils2F.halfVecToFunc(this.v, t, CTOR);
	}

	/** {@inheritDoc} */
	@Override
	public Vec2F halfVecToN(ITupRF t)
	{
		return VecUtils2F.halfVecToFunc(this.v, t, CTOR);
	}
	
	/** {@inheritDoc} */
	@Override
	public Vec2F halfVecToN(float[] t)
	{
		return VecUtils2F.halfVecToFunc(this.v, t, CTOR);
	}

	/** {@inheritDoc} */
	@Override
	public Vec2F halfVecToN(float tx, float ty)
	{
		return VecUtils2F.halfVecToFunc(this.v, tx, ty, CTOR);
	}
	
	/** {@inheritDoc} */
	@Override
	public float[] halfVecToT(ITup2RF t, float[] res)
	{
		return VecUtils2F.halfVecTo(this.v, t, res);
	}
	
	/** {@inheritDoc} */
	@Override
	public float[] halfVecToT(ITupRF t, float[] res)
	{
		return VecUtils2F.halfVecTo(this.v, t, res);
	}
	
	/** {@inheritDoc} */
	@Override
	public float[] halfVecToT(float[] t, float[] res)
	{
		return VecUtils2F.halfVecTo(this.v, t, res);
	}
	
	/** {@inheritDoc} */
	@Override
	public float[] halfVecToT(float tx, float ty, float[] res)
	{
		return VecUtils2F.halfVecTo(this.v, tx, ty, res);
	}
	
	/** {@inheritDoc} */
	@Override
	public <T extends ITup2WF> T halfVecToT(ITup2RF t, T res)
	{
		return VecUtils2F.halfVecTo(this.v, t, res);
	}

	/** {@inheritDoc} */
	@Override
	public <T extends ITup2WF> T halfVecToT(ITupRF t, T res)
	{
		return VecUtils2F.halfVecTo(this.v, t, res);
	}
	
	/** {@inheritDoc} */
	@Override
	public <T extends ITup2WF> T halfVecToT(float[] t, T res)
	{
		return VecUtils2F.halfVecTo(this.v, t, res);
	}

	/** {@inheritDoc} */
	@Override
	public <T extends ITup2WF> T halfVecToT(float tx, float ty, T res)
	{
		return VecUtils2F.halfVecTo(this.v, tx, ty, res);
	}

	/** {@inheritDoc} */
	@Override
	public Vec2F midPointTo(ITup2RF t)
	{
		VecUtils2F.midPointTo(this.v, t, this.v);
		
		return this;
	}

	/** {@inheritDoc} */
	@Override
	public Vec2F midPointTo(ITupRF t)
	{
		VecUtils2F.midPointTo(this.v, t, this.v);
		
		return this;
	}
	
	/** {@inheritDoc} */
	@Override
	public Vec2F midPointTo(float[] t)
	{
		VecUtils2F.midPointTo(this.v, t, this.v);
		
		return this;
	}

	/** {@inheritDoc} */
	@Override
	public Vec2F midPointTo(float tx, float ty)
	{
		VecUtils2F.midPointTo(this.v, tx, ty, this.v);
		
		return this;
	}
	
	/** {@inheritDoc} */
	@Override
	public Vec2F midPointToN(ITup2RF t)
	{
		return VecUtils2F.midPointToFunc(this.v, t, CTOR);
	}

	/** {@inheritDoc} */
	@Override
	public Vec2F midPointToN(ITupRF t)
	{
		return VecUtils2F.midPointToFunc(this.v, t, CTOR);
	}
	
	/** {@inheritDoc} */
	@Override
	public Vec2F midPointToN(float[] t)
	{
		return VecUtils2F.midPointToFunc(this.v, t, CTOR);
	}

	/** {@inheritDoc} */
	@Override
	public Vec2F midPointToN(float tx, float ty)
	{
		return VecUtils2F.midPointToFunc(this.v, tx, ty, CTOR);
	}
	
	/** {@inheritDoc} */
	@Override
	public float[] midPointToT(ITup2RF t, float[] res)
	{
		return VecUtils2F.midPointTo(this.v, t, res);
	}

	/** {@inheritDoc} */
	@Override
	public float[] midPointToT(ITupRF t, float[] res)
	{
		return VecUtils2F.midPointTo(this.v, t, res);
	}
	
	/** {@inheritDoc} */
	@Override
	public float[] midPointToT(float[] t, float[] res)
	{
		return VecUtils2F.midPointTo(this.v, t, res);
	}
	
	/** {@inheritDoc} */
	@Override
	public float[] midPointToT(float tx, float ty, float[] res)
	{
		return VecUtils2F.midPointTo(this.v, tx, ty, res);
	}
	
	/** {@inheritDoc} */
	@Override
	public <T extends ITup2WF> T midPointToT(ITup2RF t, T res)
	{
		return VecUtils2F.midPointTo(this.v, t, res);
	}

	/** {@inheritDoc} */
	@Override
	public <T extends ITup2WF> T midPointToT(ITupRF t, T res)
	{
		return VecUtils2F.midPointTo(this.v, t, res);
	}
	
	/** {@inheritDoc} */
	@Override
	public <T extends ITup2WF> T midPointToT(float[] t, T res)
	{
		return VecUtils2F.midPointTo(this.v, t, res);
	}

	/** {@inheritDoc} */
	@Override
	public <T extends ITup2WF> T midPointToT(float tx, float ty, T res)
	{
		return VecUtils2F.midPointTo(this.v, tx, ty, res);
	}

	/** {@inheritDoc} */
	@Override
	public Vec2F negate()
	{
		VecUtils2F.neg(this.v, this.v);
		
		return this;
	}
	
	/** {@inheritDoc} */
	@Override
	public Vec2F negateN()
	{
		return VecUtils2F.negFunc(this.v, CTOR);
	}
	
	/** {@inheritDoc} */
	@Override
	public float[] negateT(float[] res)
	{
		return VecUtils2F.neg(this.v, res);
	}
	
	/** {@inheritDoc} */
	@Override
	public <T extends ITup2WF> T negateT(T res)
	{
		return VecUtils2F.neg(this.v, res);
	}

	/** {@inheritDoc} */
	@Override
	public Vec2F reciprocal()
	{
		VecUtils2F.rec(this.v, this.v);
		
		return this;
	}
	
	/** {@inheritDoc} */
	@Override
	public Vec2F reciprocalN()
	{
		return VecUtils2F.recFunc(this.v, CTOR);
	}
	
	/** {@inheritDoc} */
	@Override
	public float[] reciprocalT(float[] res)
	{
		return VecUtils2F.rec(this.v, res);
	}
	
	/** {@inheritDoc} */
	@Override
	public <T extends ITup2WF> T reciprocalT(T res)
	{
		return VecUtils2F.rec(this.v, res);
	}

	/** {@inheritDoc} */
	@Override
	public Vec2F normalize()
	{
		VecUtils2F.nrm(this.v, this.v);
		
		return this;
	}
	
	/** {@inheritDoc} */
	@Override
	public Vec2F normalizeN()
	{
		return VecUtils2F.nrmFunc(this.v, CTOR);
	}
	
	/** {@inheritDoc} */
	@Override
	public float[] normalizeT(float[] res)
	{
		return VecUtils2F.nrm(this.v, res);
	}
	
	/** {@inheritDoc} */
	@Override
	public <T extends ITup2WF> T normalizeT(T res)
	{
		return VecUtils2F.nrm(this.v, res);
	}

	/** {@inheritDoc} */
	@Override
	public Vec2F normalizeEM(float tolerance)
	{
		VecUtils2F.nrmEM(tolerance, this.v, this.v);
		
		return this;
	}
	
	/** {@inheritDoc} */
	@Override
	public Vec2F normalizeNEM(float tolerance)
	{
		return VecUtils2F.nrmFuncEM(tolerance, this.v, CTOR);
	}
	
	/** {@inheritDoc} */
	@Override
	public float[] normalizeTEM(float tolerance, float[] res)
	{
		return VecUtils2F.nrmEM(tolerance, this.v, res);
	}
	
	/** {@inheritDoc} */
	@Override
	public <T extends ITup2WF> T normalizeTEM(float tolerance, T res)
	{
		return VecUtils2F.nrmEM(tolerance, this.v, res);
	}
	
	/** {@inheritDoc} */
	@Override
	public Vec2F normalizeEM4()
	{
		VecUtils2F.nrmEM4(this.v, this.v);
		
		return this;
	}
	
	/** {@inheritDoc} */
	@Override
	public Vec2F normalizeNEM4()
	{
		return VecUtils2F.nrmFuncEM4(this.v, CTOR);
	}
	
	/** {@inheritDoc} */
	@Override
	public float[] normalizeTEM4(float[] res)
	{
		return VecUtils2F.nrmEM4(this.v, res);
	}
	
	/** {@inheritDoc} */
	@Override
	public <T extends ITup2WF> T normalizeTEM4(T res)
	{
		return VecUtils2F.nrmEM4(this.v, res);
	}
	
	/** {@inheritDoc} */
	@Override
	public Vec2F normalizeEM6()
	{
		VecUtils2F.nrmEM6(this.v, this.v);
		
		return this;
	}
	
	/** {@inheritDoc} */
	@Override
	public Vec2F normalizeNEM6()
	{
		return VecUtils2F.nrmFuncEM6(this.v, CTOR);
	}
	
	/** {@inheritDoc} */
	@Override
	public float[] normalizeTEM6(float[] res)
	{
		return VecUtils2F.nrmEM6(this.v, res);
	}
	
	/** {@inheritDoc} */
	@Override
	public <T extends ITup2WF> T normalizeTEM6(T res)
	{
		return VecUtils2F.nrmEM6(this.v, res);
	}
	
	/** {@inheritDoc} */
	@Override
	public Vec2F normalizeEM8()
	{
		VecUtils2F.nrmEM8(this.v, this.v);
		
		return this;
	}
	
	/** {@inheritDoc} */
	@Override
	public Vec2F normalizeNEM8()
	{
		return VecUtils2F.nrmFuncEM8(this.v, CTOR);
	}
	
	/** {@inheritDoc} */
	@Override
	public float[] normalizeTEM8(float[] res)
	{
		return VecUtils2F.nrmEM8(this.v, res);
	}
	
	/** {@inheritDoc} */
	@Override
	public <T extends ITup2WF> T normalizeTEM8(T res)
	{
		return VecUtils2F.nrmEM8(this.v, res);
	}
	
	/** {@inheritDoc} */
	@Override
	public Vec2F rotateRad(double angle)
	{
		VecUtils2F.rotRad(angle, this.v, this.v);
		
		return this;
	}

	/** {@inheritDoc} */
	@Override
	public Vec2F rotateRadN(double angle)
	{
		return VecUtils2F.rotRadFunc(angle, this.v, CTOR);
	}
	
	/** {@inheritDoc} */
	@Override
	public float[] rotateRadT(double angle, float[] res)
	{
		return VecUtils2F.rotRad(angle, this.v, res);
	}
	
	/** {@inheritDoc} */
	@Override
	public <T extends ITup2WF> T rotateRadT(double angle, T res)
	{
		return VecUtils2F.rotRad(angle, this.v, res);
	}

	/** {@inheritDoc} */
	@Override
	public Vec2F rotateDeg(double angle)
	{
		VecUtils2F.rotDeg(angle, this.v, this.v);
		
		return this;
	}
	
	/** {@inheritDoc} */
	@Override
	public Vec2F rotateDegN(double angle)
	{
		return VecUtils2F.rotDegFunc(angle, this.v, CTOR);
	}
	
	/** {@inheritDoc} */
	@Override
	public float[] rotateDegT(double angle, float[] res)
	{
		return VecUtils2F.rotDeg(angle, this.v, res);
	}
	
	/** {@inheritDoc} */
	@Override
	public <T extends ITup2WF> T rotateDegT(double angle, T res)
	{
		return VecUtils2F.rotDeg(angle, this.v, res);
	}

	/** {@inheritDoc} */
	@Override
	public Vec2F project(ITup2RF t)
	{
		VecUtils2F.project(this.v, t, this.v);
		
		return this;
	}

	/** {@inheritDoc} */
	@Override
	public Vec2F project(ITupRF t)
	{
		VecUtils2F.project(this.v, t, this.v);
		
		return this;
	}
	
	/** {@inheritDoc} */
	@Override
	public Vec2F project(float[] t)
	{
		VecUtils2F.project(this.v, t, this.v);
		
		return this;
	}

	/** {@inheritDoc} */
	@Override
	public Vec2F project(float tx, float ty)
	{
		VecUtils2F.project(this.v, tx, ty, this.v);
		
		return this;
	}
	
	/** {@inheritDoc} */
	@Override
	public Vec2F projectN(ITup2RF t)
	{
		return VecUtils2F.projectFunc(this.v, t, CTOR);
	}

	/** {@inheritDoc} */
	@Override
	public Vec2F projectN(ITupRF t)
	{
		return VecUtils2F.projectFunc(this.v, t, CTOR);
	}
	
	/** {@inheritDoc} */
	@Override
	public Vec2F projectN(float[] t)
	{
		return VecUtils2F.projectFunc(this.v, t, CTOR);
	}

	/** {@inheritDoc} */
	@Override
	public Vec2F projectN(float tx, float ty)
	{
		return VecUtils2F.projectFunc(this.v, tx, ty, CTOR);
	}
	
	/** {@inheritDoc} */
	@Override
	public float[] projectT(ITup2RF t, float[] res)
	{
		return VecUtils2F.project(this.v, t, res);
	}

	/** {@inheritDoc} */
	@Override
	public float[] projectT(ITupRF t, float[] res)
	{
		return VecUtils2F.project(this.v, t, res);
	}
	
	/** {@inheritDoc} */
	@Override
	public float[] projectT(float[] t, float[] res)
	{
		return VecUtils2F.project(this.v, t, res);
	}

	/** {@inheritDoc} */
	@Override
	public float[] projectT(float tx, float ty, float[] res)
	{
		return VecUtils2F.project(this.v, tx, ty, res);
	}
	
	/** {@inheritDoc} */
	@Override
	public <T extends ITup2WF> T projectT(ITup2RF t, T res)
	{
		return VecUtils2F.project(this.v, t, res);
	}

	/** {@inheritDoc} */
	@Override
	public <T extends ITup2WF> T projectT(ITupRF t, T res)
	{
		return VecUtils2F.project(this.v, t, res);
	}
	
	/** {@inheritDoc} */
	@Override
	public <T extends ITup2WF> T projectT(float[] t, T res)
	{
		return VecUtils2F.project(this.v, t, res);
	}

	/** {@inheritDoc} */
	@Override
	public <T extends ITup2WF> T projectT(float tx, float ty, T res)
	{
		return VecUtils2F.project(this.v, tx, ty, res);
	}

	/** {@inheritDoc} */
	@Override
	public Vec2F reflect(ITup2RF n)
	{
		VecUtils2F.reflect(this.v, n, this.v);
		
		return this;
	}

	/** {@inheritDoc} */
	@Override
	public Vec2F reflect(ITupRF n)
	{
		VecUtils2F.reflect(this.v, n, this.v);
		
		return this;
	}
	
	/** {@inheritDoc} */
	@Override
	public Vec2F reflect(float[] n)
	{
		VecUtils2F.reflect(this.v, n, this.v);
		
		return this;
	}

	/** {@inheritDoc} */
	@Override
	public Vec2F reflect(float nx, float ny)
	{
		VecUtils2F.reflect(this.v, nx, ny, this.v);
		
		return this;
	}
	
	/** {@inheritDoc} */
	@Override
	public Vec2F reflectN(ITup2RF n)
	{
		return VecUtils2F.reflectFunc(this.v, n, CTOR);
	}

	/** {@inheritDoc} */
	@Override
	public Vec2F reflectN(ITupRF n)
	{
		return VecUtils2F.reflectFunc(this.v, n, CTOR);
	}
	
	/** {@inheritDoc} */
	@Override
	public Vec2F reflectN(float[] n)
	{
		return VecUtils2F.reflectFunc(this.v, n, CTOR);
	}

	/** {@inheritDoc} */
	@Override
	public Vec2F reflectN(float nx, float ny)
	{
		return VecUtils2F.reflectFunc(this.v, nx, ny, CTOR);
	}
	
	/** {@inheritDoc} */
	@Override
	public float[] reflectT(ITup2RF n, float[] res)
	{
		return VecUtils2F.reflect(this.v, n, res);
	}

	/** {@inheritDoc} */
	@Override
	public float[] reflectT(ITupRF n, float[] res)
	{
		return VecUtils2F.reflect(this.v, n, res);
	}
	
	/** {@inheritDoc} */
	@Override
	public float[] reflectT(float[] n, float[] res)
	{
		return VecUtils2F.reflect(this.v, n, res);
	}

	/** {@inheritDoc} */
	@Override
	public float[] reflectT(float nx, float ny, float[] res)
	{
		return VecUtils2F.reflect(this.v, nx, ny, res);
	}
	
	/** {@inheritDoc} */
	@Override
	public <T extends ITup2WF> T reflectT(ITup2RF n, T res)
	{
		return VecUtils2F.reflect(this.v, n, res);
	}

	/** {@inheritDoc} */
	@Override
	public <T extends ITup2WF> T reflectT(ITupRF n, T res)
	{
		return VecUtils2F.reflect(this.v, n, res);
	}
	
	/** {@inheritDoc} */
	@Override
	public <T extends ITup2WF> T reflectT(float[] n, T res)
	{
		return VecUtils2F.reflect(this.v, n, res);
	}

	/** {@inheritDoc} */
	@Override
	public <T extends ITup2WF> T reflectT(float nx, float ny, T res)
	{
		return VecUtils2F.reflect(this.v, nx, ny, res);
	}

	/** {@inheritDoc} */
	@Override
	public Vec2F abs()
	{
		VecUtils2F.abs(this.v, this.v);
		
		return this;
	}
	
	/** {@inheritDoc} */
	@Override
	public Vec2F absN()
	{
		return VecUtils2F.absFunc(this.v, CTOR);
	}
	
	/** {@inheritDoc} */
	@Override
	public float[] absT(float[] res)
	{
		return VecUtils2F.abs(this.v, res);
	}
	
	/** {@inheritDoc} */
	@Override
	public <T extends ITup2WF> T absT(T res)
	{
		return VecUtils2F.abs(this.v, res);
	}

	/** {@inheritDoc} */
	@Override
	public Vec2F signum()
	{
		VecUtils2F.signum(this.v, this.v);
		
		return this;
	}

	/** {@inheritDoc} */
	@Override
	public Vec2F signumN()
	{
		return VecUtils2F.signumFunc(this.v, CTOR);
	}

	/** {@inheritDoc} */
	@Override
	public float[] signumT(float[] res)
	{
		return VecUtils2F.signum(this.v, res);
	}
	
	/** {@inheritDoc} */
	@Override
	public <T extends ITup2WF> T signumT(T res)
	{
		return VecUtils2F.signum(this.v, res);
	}

	/** {@inheritDoc} */
	@Override
	public Vec2F signumEM(float tolerance)
	{
		VecUtils2F.signumEM(tolerance, this.v, this.v);
		
		return this;
	}

	/** {@inheritDoc} */
	@Override
	public Vec2F signumNEM(float tolerance)
	{
		return VecUtils2F.signumFuncEM(tolerance, this.v, CTOR);
	}

	/** {@inheritDoc} */
	@Override
	public float[] signumTEM(float tolerance, float[] res)
	{
		return VecUtils2F.signumEM(tolerance, this.v, res);
	}
	
	/** {@inheritDoc} */
	@Override
	public <T extends ITup2WF> T signumTEM(float tolerance, T res)
	{
		return VecUtils2F.signumEM(tolerance, this.v, res);
	}
	
	/** {@inheritDoc} */
	@Override
	public Vec2F signumEM4()
	{
		VecUtils2F.signumEM4(this.v, this.v);
		
		return this;
	}

	/** {@inheritDoc} */
	@Override
	public Vec2F signumNEM4()
	{
		return VecUtils2F.signumFuncEM4(this.v, CTOR);
	}

	/** {@inheritDoc} */
	@Override
	public float[] signumTEM4(float[] res)
	{
		return VecUtils2F.signumEM4(this.v, res);
	}
	
	/** {@inheritDoc} */
	@Override
	public <T extends ITup2WF> T signumTEM4(T res)
	{
		return VecUtils2F.signumEM4(this.v, res);
	}
	
	/** {@inheritDoc} */
	@Override
	public Vec2F signumEM6()
	{
		VecUtils2F.signumEM6(this.v, this.v);
		
		return this;
	}

	/** {@inheritDoc} */
	@Override
	public Vec2F signumNEM6()
	{
		return VecUtils2F.signumFuncEM6(this.v, CTOR);
	}

	/** {@inheritDoc} */
	@Override
	public float[] signumTEM6(float[] res)
	{
		return VecUtils2F.signumEM6(this.v, res);
	}
	
	/** {@inheritDoc} */
	@Override
	public <T extends ITup2WF> T signumTEM6(T res)
	{
		return VecUtils2F.signumEM6(this.v, res);
	}
	
	/** {@inheritDoc} */
	@Override
	public Vec2F signumEM8()
	{
		VecUtils2F.signumEM8(this.v, this.v);
		
		return this;
	}

	/** {@inheritDoc} */
	@Override
	public Vec2F signumNEM8()
	{
		return VecUtils2F.signumFuncEM8(this.v, CTOR);
	}

	/** {@inheritDoc} */
	@Override
	public float[] signumTEM8(float[] res)
	{
		return VecUtils2F.signumEM8(this.v, res);
	}
	
	/** {@inheritDoc} */
	@Override
	public <T extends ITup2WF> T signumTEM8(T res)
	{
		return VecUtils2F.signumEM8(this.v, res);
	}
	
	/** {@inheritDoc} */
	@Override
	public boolean isFinite()
	{
		return RawTupUtils2F.isFinite(this.v);
	}
	
	/** {@inheritDoc} */
	@Override
	public boolean isFiniteAt(int index)
	{
		return RawTupUtils2F.isFiniteAt(index, this.v);
	}

	/** {@inheritDoc} */
	@Override
	public boolean isFiniteAtV0()
	{
		return RawTupUtils2F.isFiniteAtV0(this.v);
	}

	/** {@inheritDoc} */
	@Override
	public boolean isFiniteAtV1()
	{
		return RawTupUtils2F.isFiniteAtV1(this.v);
	}

	/** {@inheritDoc} */
	@Override
	public boolean isInfinite()
	{
		return RawTupUtils2F.isInfinite(this.v);
	}
	
	/** {@inheritDoc} */
	@Override
	public boolean isInfiniteAt(int index)
	{
		return RawTupUtils2F.isInfiniteAt(index, this.v);
	}

	/** {@inheritDoc} */
	@Override
	public boolean isInfiniteAtV0()
	{
		return RawTupUtils2F.isInfiniteAtV0(this.v);
	}

	/** {@inheritDoc} */
	@Override
	public boolean isInfiniteAtV1()
	{
		return RawTupUtils2F.isInfiniteAtV1(this.v);
	}
	
	@Override
	public boolean isNaN()
	{
		return RawTupUtils2F.isNaN(this.v);
	}
	
	@Override
	public boolean isNaNAt(int index)
	{
		return RawTupUtils2F.isNaNAt(index, this.v);
	}
	
	@Override
	public boolean isNaNAtV0()
	{
		return RawTupUtils2F.isNaNAtV0(this.v);
	}
	
	@Override
	public boolean isNaNAtV1()
	{
		return RawTupUtils2F.isNaNAtV1(this.v);
	}
	
	/** {@inheritDoc} */
	@Override
	public boolean isZero()
	{
		return RawTupUtils2F.isZero(this.v);
	}

	/** {@inheritDoc} */
	@Override
	public boolean isZeroEM(float tolerance)
	{
		return RawTupUtils2F.isZeroEM(tolerance, this.v);
	}
	
	/** {@inheritDoc} */
	@Override
	public boolean isZeroEM4()
	{
		return RawTupUtils2F.isZeroEM4(this.v);
	}
	
	/** {@inheritDoc} */
	@Override
	public boolean isZeroEM6()
	{
		return RawTupUtils2F.isZeroEM6(this.v);
	}
	
	/** {@inheritDoc} */
	@Override
	public boolean isZeroEM8()
	{
		return RawTupUtils2F.isZeroEM8(this.v);
	}
	
	/** {@inheritDoc} */
	@Override
	public boolean isZeroAt(int index)
	{
		return RawTupUtils2F.isZeroAt(index, this.v);
	}

	/** {@inheritDoc} */
	@Override
	public boolean isZeroAtEM(float tolerance, int index)
	{
		return RawTupUtils2F.isZeroAtEM(tolerance, index, this.v);
	}
	
	/** {@inheritDoc} */
	@Override
	public boolean isZeroAtEM4(int index)
	{
		return RawTupUtils2F.isZeroAtEM4(index, this.v);
	}
	
	/** {@inheritDoc} */
	@Override
	public boolean isZeroAtEM6(int index)
	{
		return RawTupUtils2F.isZeroAtEM6(index, this.v);
	}
	
	/** {@inheritDoc} */
	@Override
	public boolean isZeroAtEM8(int index)
	{
		return RawTupUtils2F.isZeroAtEM8(index, this.v);
	}

	/** {@inheritDoc} */
	@Override
	public boolean isZeroAtV0()
	{
		return RawTupUtils2F.isZeroAtV0(this.v);
	}

	/** {@inheritDoc} */
	@Override
	public boolean isZeroAtV0EM(float tolerance)
	{
		return RawTupUtils2F.isZeroAtV0EM(tolerance, this.v);
	}
	
	/** {@inheritDoc} */
	@Override
	public boolean isZeroAtV0EM4()
	{
		return RawTupUtils2F.isZeroAtV0EM4(this.v);
	}
	
	/** {@inheritDoc} */
	@Override
	public boolean isZeroAtV0EM6()
	{
		return RawTupUtils2F.isZeroAtV0EM6(this.v);
	}
	
	/** {@inheritDoc} */
	@Override
	public boolean isZeroAtV0EM8()
	{
		return RawTupUtils2F.isZeroAtV0EM8(this.v);
	}
	
	/** {@inheritDoc} */
	@Override
	public boolean isZeroAtV1()
	{
		return RawTupUtils2F.isZeroAtV1(this.v);
	}
	
	/** {@inheritDoc} */
	@Override
	public boolean isZeroAtV1EM(float tolerance)
	{
		return RawTupUtils2F.isZeroAtV1EM(tolerance, this.v);
	}
	
	/** {@inheritDoc} */
	@Override
	public boolean isZeroAtV1EM4()
	{
		return RawTupUtils2F.isZeroAtV1EM4(this.v);
	}
	
	/** {@inheritDoc} */
	@Override
	public boolean isZeroAtV1EM6()
	{
		return RawTupUtils2F.isZeroAtV1EM6(this.v);
	}
	
	/** {@inheritDoc} */
	@Override
	public boolean isZeroAtV1EM8()
	{
		return RawTupUtils2F.isZeroAtV1EM8(this.v);
	}
	
	/** {@inheritDoc} */
	@Override
	public boolean equals(ITup2RF t)
	{
		return TupUtils2F.equals(this.v, t);
	}

	/** {@inheritDoc} */
	@Override
	public boolean equals(ITupRF t)
	{
		return TupUtils2F.equals(this.v, t);
	}

	/** {@inheritDoc} */
	@Override
	public boolean equals(float[] t)
	{
		return RawTupUtils2F.equals(this.v, t);
	}

	/** {@inheritDoc} */
	@Override
	public boolean equals(float tv0, float tv1)
	{
		return RawTupUtils2F.equals(this.v, tv0, tv1);
	}

	/** {@inheritDoc} */
	@Override
	public boolean equalsEM(float tolerance, ITup2RF t)
	{
		return TupUtils2F.equalsEM(tolerance, this.v, t);
	}

	/** {@inheritDoc} */
	@Override
	public boolean equalsEM(float tolerance, ITupRF t)
	{
		return TupUtils2F.equalsEM(tolerance, this.v, t);
	}

	/** {@inheritDoc} */
	@Override
	public boolean equalsEM(float tolerance, float[] t)
	{
		return RawTupUtils2F.equalsEM(tolerance, this.v, t);
	}

	/** {@inheritDoc} */
	@Override
	public boolean equalsEM(float tolerance, float tv0, float tv1)
	{
		return RawTupUtils2F.equalsEM(tolerance, this.v, tv0, tv1);
	}
	
	/** {@inheritDoc} */
	@Override
	public boolean equalsEM4(ITup2RF t)
	{
		return TupUtils2F.equalsEM4(this.v, t);
	}

	/** {@inheritDoc} */
	@Override
	public boolean equalsEM4(ITupRF t)
	{
		return TupUtils2F.equalsEM4(this.v, t);
	}

	/** {@inheritDoc} */
	@Override
	public boolean equalsEM4(float[] t)
	{
		return RawTupUtils2F.equalsEM4(this.v, t);
	}

	/** {@inheritDoc} */
	@Override
	public boolean equalsEM4(float tv0, float tv1)
	{
		return RawTupUtils2F.equalsEM4(this.v, tv0, tv1);
	}
	
	/** {@inheritDoc} */
	@Override
	public boolean equalsEM6(ITup2RF t)
	{
		return TupUtils2F.equalsEM6(this.v, t);
	}

	/** {@inheritDoc} */
	@Override
	public boolean equalsEM6(ITupRF t)
	{
		return TupUtils2F.equalsEM6(this.v, t);
	}

	/** {@inheritDoc} */
	@Override
	public boolean equalsEM6(float[] t)
	{
		return RawTupUtils2F.equalsEM6(this.v, t);
	}

	/** {@inheritDoc} */
	@Override
	public boolean equalsEM6(float tv0, float tv1)
	{
		return RawTupUtils2F.equalsEM6(this.v, tv0, tv1);
	}
	
	/** {@inheritDoc} */
	@Override
	public boolean equalsEM8(ITup2RF t)
	{
		return TupUtils2F.equalsEM8(this.v, t);
	}

	/** {@inheritDoc} */
	@Override
	public boolean equalsEM8(ITupRF t)
	{
		return TupUtils2F.equalsEM8(this.v, t);
	}

	/** {@inheritDoc} */
	@Override
	public boolean equalsEM8(float[] t)
	{
		return RawTupUtils2F.equalsEM8(this.v, t);
	}

	/** {@inheritDoc} */
	@Override
	public boolean equalsEM8(float tv0, float tv1)
	{
		return RawTupUtils2F.equalsEM8(this.v, tv0, tv1);
	}

	/** {@inheritDoc} */
	@Override
	public boolean equalsAt(int index, ITup2RF t)
	{
		return TupUtils2F.equalsAt(index, this.v, t);
	}

	/** {@inheritDoc} */
	@Override
	public boolean equalsAt(int index, ITupRF t)
	{
		return TupUtils2F.equalsAt(index, this.v, t);
	}

	/** {@inheritDoc} */
	@Override
	public boolean equalsAt(int index, float[] t)
	{
		return RawTupUtils2F.equalsAt(index, this.v, t);
	}

	/** {@inheritDoc} */
	@Override
	public boolean equalsAt(int index, float value)
	{
		return RawTupUtils2F.equalsAt(index, this.v, value);
	}

	/** {@inheritDoc} */
	@Override
	public boolean equalsAtEM(float tolerance, int index, ITup2RF t)
	{
		return TupUtils2F.equalsAtEM(tolerance, index, this.v, t);
	}

	/** {@inheritDoc} */
	@Override
	public boolean equalsAtEM(float tolerance, int index, ITupRF t)
	{
		return TupUtils2F.equalsAtEM(tolerance, index, this.v, t);
	}

	/** {@inheritDoc} */
	@Override
	public boolean equalsAtEM(float tolerance, int index, float[] t)
	{
		return RawTupUtils2F.equalsAtEM(tolerance, index, this.v, t);
	}

	/** {@inheritDoc} */
	@Override
	public boolean equalsAtEM(float tolerance, int index, float value)
	{
		return RawTupUtils2F.equalsAtEM(tolerance, index, this.v, value);
	}
	
	/** {@inheritDoc} */
	@Override
	public boolean equalsAtEM4(int index, ITup2RF t)
	{
		return TupUtils2F.equalsAtEM4(index, this.v, t);
	}

	/** {@inheritDoc} */
	@Override
	public boolean equalsAtEM4(int index, ITupRF t)
	{
		return TupUtils2F.equalsAtEM4(index, this.v, t);
	}

	/** {@inheritDoc} */
	@Override
	public boolean equalsAtEM4(int index, float[] t)
	{
		return RawTupUtils2F.equalsAtEM4(index, this.v, t);
	}

	/** {@inheritDoc} */
	@Override
	public boolean equalsAtEM4(int index, float value)
	{
		return RawTupUtils2F.equalsAtEM4(index, this.v, value);
	}
	
	/** {@inheritDoc} */
	@Override
	public boolean equalsAtEM6(int index, ITup2RF t)
	{
		return TupUtils2F.equalsAtEM6(index, this.v, t);
	}

	/** {@inheritDoc} */
	@Override
	public boolean equalsAtEM6(int index, ITupRF t)
	{
		return TupUtils2F.equalsAtEM6(index, this.v, t);
	}

	/** {@inheritDoc} */
	@Override
	public boolean equalsAtEM6(int index, float[] t)
	{
		return RawTupUtils2F.equalsAtEM6(index, this.v, t);
	}

	/** {@inheritDoc} */
	@Override
	public boolean equalsAtEM6(int index, float value)
	{
		return RawTupUtils2F.equalsAtEM6(index, this.v, value);
	}
	
	/** {@inheritDoc} */
	@Override
	public boolean equalsAtEM8(int index, ITup2RF t)
	{
		return TupUtils2F.equalsAtEM8(index, this.v, t);
	}

	/** {@inheritDoc} */
	@Override
	public boolean equalsAtEM8(int index, ITupRF t)
	{
		return TupUtils2F.equalsAtEM8(index, this.v, t);
	}

	/** {@inheritDoc} */
	@Override
	public boolean equalsAtEM8(int index, float[] t)
	{
		return RawTupUtils2F.equalsAtEM8(index, this.v, t);
	}

	/** {@inheritDoc} */
	@Override
	public boolean equalsAtEM8(int index, float value)
	{
		return RawTupUtils2F.equalsAtEM8(index, this.v, value);
	}

	/** {@inheritDoc} */
	@Override
	public boolean equalsAtV0(ITup2RF t)
	{
		return TupUtils2F.equalsAtV0(this.v, t);
	}

	/** {@inheritDoc} */
	@Override
	public boolean equalsAtV0(ITupRF t)
	{
		return TupUtils2F.equalsAtV0(this.v, t);
	}

	/** {@inheritDoc} */
	@Override
	public boolean equalsAtV0(float[] t)
	{
		return RawTupUtils2F.equalsAtV0(this.v, t);
	}

	/** {@inheritDoc} */
	@Override
	public boolean equalsAtV0(float value)
	{
		return RawTupUtils2F.equalsAtV0(this.v, value);
	}

	/** {@inheritDoc} */
	@Override
	public boolean equalsAtV0EM(float tolerance, ITup2RF t)
	{
		return TupUtils2F.equalsAtV0EM(tolerance, this.v, t);
	}

	/** {@inheritDoc} */
	@Override
	public boolean equalsAtV0EM(float tolerance, ITupRF t)
	{
		return TupUtils2F.equalsAtV0EM(tolerance, this.v, t);
	}

	/** {@inheritDoc} */
	@Override
	public boolean equalsAtV0EM(float tolerance, float[] t)
	{
		return RawTupUtils2F.equalsAtV0EM(tolerance, this.v, t);
	}

	/** {@inheritDoc} */
	@Override
	public boolean equalsAtV0EM(float tolerance, float value)
	{
		return RawTupUtils2F.equalsAtV0EM(tolerance, this.v, value);
	}
	
	/** {@inheritDoc} */
	@Override
	public boolean equalsAtV0EM4(ITup2RF t)
	{
		return TupUtils2F.equalsAtV0EM4(this.v, t);
	}

	/** {@inheritDoc} */
	@Override
	public boolean equalsAtV0EM4(ITupRF t)
	{
		return TupUtils2F.equalsAtV0EM4(this.v, t);
	}

	/** {@inheritDoc} */
	@Override
	public boolean equalsAtV0EM4(float[] t)
	{
		return RawTupUtils2F.equalsAtV0EM4(this.v, t);
	}

	/** {@inheritDoc} */
	@Override
	public boolean equalsAtV0EM4(float value)
	{
		return RawTupUtils2F.equalsAtV0EM4(this.v, value);
	}
	
	/** {@inheritDoc} */
	@Override
	public boolean equalsAtV0EM6(ITup2RF t)
	{
		return TupUtils2F.equalsAtV0EM6(this.v, t);
	}

	/** {@inheritDoc} */
	@Override
	public boolean equalsAtV0EM6(ITupRF t)
	{
		return TupUtils2F.equalsAtV0EM6(this.v, t);
	}

	/** {@inheritDoc} */
	@Override
	public boolean equalsAtV0EM6(float[] t)
	{
		return RawTupUtils2F.equalsAtV0EM6(this.v, t);
	}

	/** {@inheritDoc} */
	@Override
	public boolean equalsAtV0EM6(float value)
	{
		return RawTupUtils2F.equalsAtV0EM6(this.v, value);
	}
	
	/** {@inheritDoc} */
	@Override
	public boolean equalsAtV0EM8(ITup2RF t)
	{
		return TupUtils2F.equalsAtV0EM8(this.v, t);
	}

	/** {@inheritDoc} */
	@Override
	public boolean equalsAtV0EM8(ITupRF t)
	{
		return TupUtils2F.equalsAtV0EM8(this.v, t);
	}

	/** {@inheritDoc} */
	@Override
	public boolean equalsAtV0EM8(float[] t)
	{
		return RawTupUtils2F.equalsAtV0EM8(this.v, t);
	}

	/** {@inheritDoc} */
	@Override
	public boolean equalsAtV0EM8(float value)
	{
		return RawTupUtils2F.equalsAtV0EM8(this.v, value);
	}
	
	/** {@inheritDoc} */
	@Override
	public boolean equalsAtV1(ITup2RF t)
	{
		return TupUtils2F.equalsAtV1(this.v, t);
	}

	/** {@inheritDoc} */
	@Override
	public boolean equalsAtV1(ITupRF t)
	{
		return TupUtils2F.equalsAtV1(this.v, t);
	}

	/** {@inheritDoc} */
	@Override
	public boolean equalsAtV1(float[] t)
	{
		return RawTupUtils2F.equalsAtV1(this.v, t);
	}

	/** {@inheritDoc} */
	@Override
	public boolean equalsAtV1(float value)
	{
		return RawTupUtils2F.equalsAtV1(this.v, value);
	}

	/** {@inheritDoc} */
	@Override
	public boolean equalsAtV1EM(float tolerance, ITup2RF t)
	{
		return TupUtils2F.equalsAtV1EM(tolerance, this.v, t);
	}

	/** {@inheritDoc} */
	@Override
	public boolean equalsAtV1EM(float tolerance, ITupRF t)
	{
		return TupUtils2F.equalsAtV1EM(tolerance, this.v, t);
	}

	/** {@inheritDoc} */
	@Override
	public boolean equalsAtV1EM(float tolerance, float[] t)
	{
		return RawTupUtils2F.equalsAtV1EM(tolerance, this.v, t);
	}

	/** {@inheritDoc} */
	@Override
	public boolean equalsAtV1EM(float tolerance, float value)
	{
		return RawTupUtils2F.equalsAtV1EM(tolerance, this.v, value);
	}
	
	/** {@inheritDoc} */
	@Override
	public boolean equalsAtV1EM4(ITup2RF t)
	{
		return TupUtils2F.equalsAtV1EM4(this.v, t);
	}

	/** {@inheritDoc} */
	@Override
	public boolean equalsAtV1EM4(ITupRF t)
	{
		return TupUtils2F.equalsAtV1EM4(this.v, t);
	}

	/** {@inheritDoc} */
	@Override
	public boolean equalsAtV1EM4(float[] t)
	{
		return RawTupUtils2F.equalsAtV1EM4(this.v, t);
	}

	/** {@inheritDoc} */
	@Override
	public boolean equalsAtV1EM4(float value)
	{
		return RawTupUtils2F.equalsAtV1EM4(this.v, value);
	}

	/** {@inheritDoc} */
	@Override
	public boolean equalsAtV1EM6(ITup2RF t)
	{
		return TupUtils2F.equalsAtV1EM6(this.v, t);
	}

	/** {@inheritDoc} */
	@Override
	public boolean equalsAtV1EM6(ITupRF t)
	{
		return TupUtils2F.equalsAtV1EM6(this.v, t);
	}

	/** {@inheritDoc} */
	@Override
	public boolean equalsAtV1EM6(float[] t)
	{
		return RawTupUtils2F.equalsAtV1EM6(this.v, t);
	}

	/** {@inheritDoc} */
	@Override
	public boolean equalsAtV1EM6(float value)
	{
		return RawTupUtils2F.equalsAtV1EM6(this.v, value);
	}

	/** {@inheritDoc} */
	@Override
	public boolean equalsAtV1EM8(ITup2RF t)
	{
		return TupUtils2F.equalsAtV1EM8(this.v, t);
	}

	/** {@inheritDoc} */
	@Override
	public boolean equalsAtV1EM8(ITupRF t)
	{
		return TupUtils2F.equalsAtV1EM8(this.v, t);
	}

	/** {@inheritDoc} */
	@Override
	public boolean equalsAtV1EM8(float[] t)
	{
		return RawTupUtils2F.equalsAtV1EM8(this.v, t);
	}

	/** {@inheritDoc} */
	@Override
	public boolean equalsAtV1EM8(float value)
	{
		return RawTupUtils2F.equalsAtV1EM8(this.v, value);
	}

	/** {@inheritDoc} */
	@Override
	public Vec2F swizzle(int[] indices)
	{
		VecUtils2F.swizzle(this.v, indices, this.v);
		
		return this;
	}
	
	/** {@inheritDoc} */
	@Override
	public Vec2F swizzleN(int[] indices)
	{
		return VecUtils2F.swizzleFunc(this.v, indices, CTOR);
	}
	
	/** {@inheritDoc} */
	@Override
	public float[] swizzleT(int[] indices, float[] res)
	{
		return VecUtils2F.swizzle(this.v, indices, res);
	}
	
	/** {@inheritDoc} */
	@Override
	public <T extends ITup2WF> T swizzleT(int[] indices, T res)
	{
		return VecUtils2F.swizzle(this.v, indices, res);
	}
	
	/** {@inheritDoc} */
	@Override
	public Vec2F swizzle(int indexX, int indexY)
	{
		VecUtils2F.swizzle(this.v, indexX, indexY, this.v);
		
		return this;
	}
	
	/** {@inheritDoc} */
	@Override
	public Vec2F swizzleN(int indexX, int indexY)
	{
		return VecUtils2F.swizzleFunc(this.v, indexX, indexY, CTOR);
	}
	
	/** {@inheritDoc} */
	@Override
	public float[] swizzleT(int indexX, int indexY, float[] res)
	{
		return VecUtils2F.swizzle(this.v, indexX, indexY, res);
	}
	
	/** {@inheritDoc} */
	@Override
	public <T extends ITup2WF> T swizzleT(int indexX, int indexY, T res)
	{
		return VecUtils2F.swizzle(this.v, indexX, indexY, res);
	}

	/** {@inheritDoc} */
	@Override
	public Vec2F swap(int indexA, int indexB)
	{
		VecUtils2F.swizzle(this.v, indexA, indexB, this.v);
		
		return this;
	}
	
	/** {@inheritDoc} */
	@Override
	public Vec2F swapN(int indexA, int indexB)
	{
		return VecUtils2F.swapFunc(this.v, indexA, indexB, CTOR);
	}
	
	/** {@inheritDoc} */
	@Override
	public float[] swapT(int indexA, int indexB, float[] res)
	{
		return VecUtils2F.swap(this.v, indexA, indexB, res);
	}
	
	/** {@inheritDoc} */
	@Override
	public <T extends ITup2WF> T swapT(int indexA, int indexB, T res)
	{
		return VecUtils2F.swap(this.v, indexA, indexB, res);
	}
	
	/** {@inheritDoc} */
	@Override
	public Vec2F swapV0V1()
	{
		VecUtils2F.swapV0V1(this.v, this.v);
		
		return this;
	}
	
	/** {@inheritDoc} */
	@Override
	public Vec2F swapV0V1N()
	{
		return VecUtils2F.swapV0V1Func(this.v, CTOR);
	}
	
	/** {@inheritDoc} */
	@Override
	public float[] swapV0V1T(float[] res)
	{
		return VecUtils2F.swapV0V1(this.v, res);
	}
	
	/** {@inheritDoc} */
	@Override
	public <T extends ITup2WF> T swapV0V1T(T res)
	{
		return VecUtils2F.swapV0V1(this.v, res);
	}

	/** {@inheritDoc} */
	@Override
	public Vec2F swapXY()
	{
		VecUtils2F.swapV0V1(this.v, this.v);
		
		return this;
	}
	
	/** {@inheritDoc} */
	@Override
	public Vec2F swapXYN()
	{
		return VecUtils2F.swapV0V1Func(this.v, CTOR);
	}

	/** {@inheritDoc} */
	@Override
	public Vec2F minComponents(ITup2RF t)
	{
		VecUtils2F.minComponents(this.v, t, this.v);
		
		return this;
	}
	
	/** {@inheritDoc} */
	@Override
	public Vec2F minComponents(ITupRF t)
	{
		VecUtils2F.minComponents(this.v, t, this.v);
		
		return this;
	}

	/** {@inheritDoc} */
	@Override
	public Vec2F minComponents(float[] t)
	{
		VecUtils2F.minComponents(this.v, t, this.v);
		
		return this;
	}
	
	/** {@inheritDoc} */
	@Override
	public Vec2F minComponents(float tv0, float tv1)
	{
		VecUtils2F.minComponents(this.v, tv0, tv1, this.v);
		
		return this;
	}
	
	/** {@inheritDoc} */
	@Override
	public Vec2F minComponentsN(ITup2RF t)
	{
		return VecUtils2F.minComponentsFunc(this.v, t, CTOR);
	}

	/** {@inheritDoc} */
	@Override
	public Vec2F minComponentsN(ITupRF t)
	{
		return VecUtils2F.minComponentsFunc(this.v, t, CTOR);
	}

	/** {@inheritDoc} */
	@Override
	public Vec2F minComponentsN(float[] t)
	{
		return VecUtils2F.minComponentsFunc(this.v, t, CTOR);
	}
	
	/** {@inheritDoc} */
	@Override
	public Vec2F minComponentsN(float tv0, float tv1)
	{
		return VecUtils2F.minComponentsFunc(this.v, tv0, tv1, CTOR);
	}
	
	/** {@inheritDoc} */
	@Override
	public float[] minComponentsT(ITup2RF t, float[] res)
	{
		return VecUtils2F.minComponents(this.v, t, res);
	}
	
	/** {@inheritDoc} */
	@Override
	public float[] minComponentsT(ITupRF t, float[] res)
	{
		return VecUtils2F.minComponents(this.v, t, res);
	}
	
	/** {@inheritDoc} */
	@Override
	public float[] minComponentsT(float[] t, float[] res)
	{
		return VecUtils2F.minComponents(this.v, t, res);
	}
	
	/** {@inheritDoc} */
	@Override
	public float[] minComponentsT(float tv0, float tv1, float[] res)
	{
		return VecUtils2F.minComponents(this.v, tv0, tv1, res);
	}
	
	/** {@inheritDoc} */
	@Override
	public <T extends ITup2WF> T minComponentsT(ITup2RF t, T res)
	{
		return VecUtils2F.minComponents(this.v, t, res);
	}

	/** {@inheritDoc} */
	@Override
	public <T extends ITup2WF> T minComponentsT(ITupRF t, T res)
	{
		return VecUtils2F.minComponents(this.v, t, res);
	}

	/** {@inheritDoc} */
	@Override
	public <T extends ITup2WF> T minComponentsT(float[] t, T res)
	{
		return VecUtils2F.minComponents(this.v, t, res);
	}
	
	/** {@inheritDoc} */
	@Override
	public <T extends ITup2WF> T minComponentsT(float tv0, float tv1, T res)
	{
		return VecUtils2F.minComponents(this.v, tv0, tv1, res);
	}
	
	/** {@inheritDoc} */
	@Override
	public Vec2F maxComponents(ITup2RF t)
	{
		VecUtils2F.maxComponents(this.v, t, this.v);
		
		return this;
	}
	
	/** {@inheritDoc} */
	@Override
	public Vec2F maxComponents(ITupRF t)
	{
		VecUtils2F.maxComponents(this.v, t, this.v);
		
		return this;
	}
	
	/** {@inheritDoc} */
	@Override
	public Vec2F maxComponents(float[] t)
	{
		VecUtils2F.maxComponents(this.v, t, this.v);
		
		return this;
	}
	
	/** {@inheritDoc} */
	@Override
	public Vec2F maxComponents(float tv0, float tv1)
	{
		VecUtils2F.maxComponents(this.v, tv0, tv1, this.v);
		
		return this;
	}
	
	/** {@inheritDoc} */
	@Override
	public Vec2F maxComponentsN(ITup2RF t)
	{
		return VecUtils2F.maxComponentsFunc(this.v, t, CTOR);
	}

	/** {@inheritDoc} */
	@Override
	public Vec2F maxComponentsN(ITupRF t)
	{
		return VecUtils2F.maxComponentsFunc(this.v, t, CTOR);
	}

	/** {@inheritDoc} */
	@Override
	public Vec2F maxComponentsN(float[] t)
	{
		return VecUtils2F.maxComponentsFunc(this.v, t, CTOR);
	}
	
	/** {@inheritDoc} */
	@Override
	public Vec2F maxComponentsN(float tv0, float tv1)
	{
		return VecUtils2F.maxComponentsFunc(this.v, tv0, tv1, CTOR);
	}
	
	/** {@inheritDoc} */
	@Override
	public float[] maxComponentsT(ITup2RF t, float[] res)
	{
		return VecUtils2F.maxComponents(this.v, t, res);
	}

	/** {@inheritDoc} */
	@Override
	public float[] maxComponentsT(ITupRF t, float[] res)
	{
		return VecUtils2F.maxComponents(this.v, t, res);
	}

	/** {@inheritDoc} */
	@Override
	public float[] maxComponentsT(float[] t, float[] res)
	{
		return VecUtils2F.maxComponents(this.v, t, res);
	}
	
	/** {@inheritDoc} */
	@Override
	public float[] maxComponentsT(float tv0, float tv1, float[] res)
	{
		return VecUtils2F.maxComponents(this.v, tv0, tv1, res);
	}
	
	/** {@inheritDoc} */
	@Override
	public <T extends ITup2WF> T maxComponentsT(ITup2RF t, T res)
	{
		return VecUtils2F.maxComponents(this.v, t, res);
	}

	/** {@inheritDoc} */
	@Override
	public <T extends ITup2WF> T maxComponentsT(ITupRF t, T res)
	{
		return VecUtils2F.maxComponents(this.v, t, res);
	}

	/** {@inheritDoc} */
	@Override
	public <T extends ITup2WF> T maxComponentsT(float[] t, T res)
	{
		return VecUtils2F.maxComponents(this.v, t, res);
	}
	
	/** {@inheritDoc} */
	@Override
	public <T extends ITup2WF> T maxComponentsT(float tv0, float tv1, T res)
	{
		return VecUtils2F.maxComponents(this.v, tv0, tv1, res);
	}

	/** {@inheritDoc} */
	@Override
	public IndexValuePairF min()
	{
		return VecUtils2F.min(this.v, new IndexValuePairF());
	}

	/** {@inheritDoc} */
	@Override
	public IndexValuePairF min(IndexValuePairF res)
	{
		return VecUtils2F.min(this.v, res);
	}

	/** {@inheritDoc} */
	@Override
	public IndexValuePairF max()
	{
		return VecUtils2F.max(this.v, new IndexValuePairF());
	}

	/** {@inheritDoc} */
	@Override
	public IndexValuePairF max(IndexValuePairF res)
	{
		return VecUtils2F.max(this.v, res);
	}
}
