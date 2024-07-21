package org.barghos.math.vector;

import java.util.Objects;

import org.barghos.math.BarghosMathConfiguration;
import org.barghos.util.collection.IndexValuePairF;
import org.barghos.util.math.MathUtils;
import org.barghos.util.math.RoundMethodF;
import org.barghos.util.tuple.floats.Tup2RF;
import org.barghos.util.tuple.floats.Tup2WF;
import org.barghos.util.tuple.floats.TupRF;
import org.barghos.util.tuple.floats.TupUtils2F;
import org.barghos.validation.exception.IndexOutOfRangeException;

public class ImVec2F implements Vec2RF
{
	private static final VecFactory2F FACTORY;
	
	static
	{
		FACTORY = BarghosMathConfiguration.vecFactory2f();
	}
	
	public static Vec2WF get()
	{
		return FACTORY.get();
	}
	
	public static Vec2WF get(Tup2RF t)
	{
		return FACTORY.get(t);
	}
	
	public static Vec2WF get(TupRF t)
	{
		return FACTORY.get(t);
	}
	
	public static Vec2WF get(float value)
	{
		return FACTORY.get(value);
	}
	
	public static Vec2WF get(float x, float y)
	{
		return FACTORY.get(x, y);
	}
	
	public static Vec2WF temp()
	{
		return FACTORY.temp();
	}
	
	public static Vec2WF temp(Tup2RF t)
	{
		return FACTORY.temp(t);
	}
	
	public static Vec2WF temp(TupRF t)
	{
		return FACTORY.temp(t);
	}
	
	public static Vec2WF temp(float value)
	{
		return FACTORY.temp(value);
	}
	
	public static Vec2WF temp(float x, float y)
	{
		return FACTORY.temp(x, y);
	}
	
	public static void store(Vec2WF v)
	{
		FACTORY.store(v);
	}
	
	public static Vec2RF immutable(Tup2RF t)
	{
		return FACTORY.immutable(t);
	}
	
	public static Vec2RF immutable(TupRF t)
	{
		return FACTORY.immutable(t);
	}
	
	public static Vec2RF immutable(float value)
	{
		return FACTORY.immutable(value);
	}
	
	public static Vec2RF immutable(float x, float y)
	{
		return FACTORY.immutable(x, y);
	}

	public final float x;
	public final float y;
	
	public ImVec2F(Tup2RF t)
	{
		this(t.v0(), t.v1());
	}
	
	public ImVec2F(TupRF t)
	{
		this(t.getAt(0), t.getAt(1));
	}
	
	public ImVec2F(float value)
	{
		this(value, value);
	}
	
	public ImVec2F(float... t)
	{
		this(t[0], t[1]);
	}
	
	public ImVec2F(float x, float y)
	{
		this.x = x;
		this.y = y;
	}

	/** {@inheritDoc} */
	@Override
	public ImVec2F createNew(Tup2RF t)
	{
		return new ImVec2F(t);
	}

	/** {@inheritDoc} */
	@Override
	public ImVec2F createNew(TupRF t)
	{
		return new ImVec2F(t);
	}
	
	/** {@inheritDoc} */
	@Override
	public ImVec2F createNew(float... t)
	{
		return new ImVec2F(t);
	}

	/** {@inheritDoc} */
	@Override
	public ImVec2F createNew(float value)
	{
		return new ImVec2F(value);
	}

	/** {@inheritDoc} */
	@Override
	public ImVec2F createNew(float x, float y)
	{
		return new ImVec2F(x, y);
	}
	
	/** {@inheritDoc} */
	@Override
	public float x()
	{
		return this.x;
	}

	/** {@inheritDoc} */
	@Override
	public float y()
	{
		return this.y;
	}
	
	/** {@inheritDoc} */
	@Override
	public float v0()
	{
		return this.x;
	}

	/** {@inheritDoc} */
	@Override
	public float v1()
	{
		return this.y;
	}

	/** {@inheritDoc} */
	@Override
	public float getAt(int index)
	{
		switch(index)
		{
			case 0: return this.x;
			case 1: return this.y;
			default: throw new IndexOutOfRangeException(index, 1);
		}
	}

	/** {@inheritDoc} */
	@Override
	public float[] toArray()
	{
		return new float[] {this.x, this.y};
	}

	/** {@inheritDoc} */
	@Override
	public float[] toArray(float[] res)
	{
		res[0] = this.x;
		res[1] = this.y;
		
		return res;
	}
	
	/** {@inheritDoc} */
	@Override
	public ImVec2F copy()
	{
		return new ImVec2F(this);
	}

	/** {@inheritDoc} */
	@Override
	public String toString()
	{
		return "immutableVec2F(x=" + this.x + ", y=" + this.y + ")";
	}

	/** {@inheritDoc} */
	@Override
	public int hashCode()
	{
		return Objects.hash(this.x, this.y);
	}
	
	/** {@inheritDoc} */
	@Override
	public boolean equals(Object obj)
	{
		if(obj == this) return true;
		if(obj == null) return false;
		
		if(obj instanceof Tup2RF) return equals((Tup2RF) obj);
		if(obj instanceof TupRF) return equals((TupRF) obj);
		
		return false;
	}
	
	/** {@inheritDoc} */
	@Override
	public boolean equals(Tup2RF t)
	{
		return TupUtils2F.equals(this, t);
	}

	/** {@inheritDoc} */
	@Override
	public boolean equals(TupRF t)
	{
		return TupUtils2F.equals(this, t);
	}

	/** {@inheritDoc} */
	@Override
	public boolean equals(float... t)
	{
		return TupUtils2F.equals(this, t);
	}

	/** {@inheritDoc} */
	@Override
	public boolean equals(float tx, float ty)
	{
		return TupUtils2F.equals(this, tx, ty);
	}

	/** {@inheritDoc} */
	@Override
	public boolean equals(float tolerance, Tup2RF t)
	{
		return TupUtils2F.equals(tolerance, this, t);
	}

	/** {@inheritDoc} */
	@Override
	public boolean equals(float tolerance, TupRF t)
	{
		return TupUtils2F.equals(tolerance, this, t);
	}

	/** {@inheritDoc} */
	@Override
	public boolean equals(float tolerance, float... t)
	{
		return TupUtils2F.equals(tolerance, this, t);
	}

	/** {@inheritDoc} */
	@Override
	public boolean equals(float tolerance, float x, float y)
	{
		return TupUtils2F.equals(tolerance, this, x, y);
	}

	/** {@inheritDoc} */
	@Override
	public boolean equalsAt(int index, Tup2RF t)
	{
		return TupUtils2F.equalsAt(index, this, t);
	}

	/** {@inheritDoc} */
	@Override
	public boolean equalsAt(int index, TupRF t)
	{
		return TupUtils2F.equalsAt(index, this, t);
	}

	/** {@inheritDoc} */
	@Override
	public boolean equalsAt(int index, float... t)
	{
		return TupUtils2F.equalsAt(index, this, t);
	}

	/** {@inheritDoc} */
	@Override
	public boolean equalsAt(int index, float value)
	{
		return TupUtils2F.equalsAt(index, this, value);
	}

	/** {@inheritDoc} */
	@Override
	public boolean equalsAt(float tolerance, int index, Tup2RF t)
	{
		return TupUtils2F.equalsAt(tolerance, index, this, t);
	}

	/** {@inheritDoc} */
	@Override
	public boolean equalsAt(float tolerance, int index, TupRF t)
	{
		return TupUtils2F.equalsAt(tolerance, index, this, t);
	}

	/** {@inheritDoc} */
	@Override
	public boolean equalsAt(float tolerance, int index, float... t)
	{
		return TupUtils2F.equalsAt(tolerance, index, this, t);
	}

	/** {@inheritDoc} */
	@Override
	public boolean equalsAt(float tolerance, int index, float value)
	{
		return TupUtils2F.equalsAt(tolerance, index, this, value);
	}

	/** {@inheritDoc} */
	@Override
	public boolean equalsAtV0(Tup2RF t)
	{
		return TupUtils2F.equalsAtV0(this, t);
	}

	/** {@inheritDoc} */
	@Override
	public boolean equalsAtV0(TupRF t)
	{
		return TupUtils2F.equalsAtV0(this, t);
	}

	/** {@inheritDoc} */
	@Override
	public boolean equalsAtV0(float... t)
	{
		return TupUtils2F.equalsAtV0(this, t);
	}

	/** {@inheritDoc} */
	@Override
	public boolean equalsAtV0(float value)
	{
		return TupUtils2F.equalsAtV0(this, value);
	}

	/** {@inheritDoc} */
	@Override
	public boolean equalsAtV1(Tup2RF t)
	{
		return TupUtils2F.equalsAtV1(this, t);
	}

	/** {@inheritDoc} */
	@Override
	public boolean equalsAtV1(TupRF t)
	{
		return TupUtils2F.equalsAtV1(this, t);
	}

	/** {@inheritDoc} */
	@Override
	public boolean equalsAtV1(float... t)
	{
		return TupUtils2F.equalsAtV1(this, t);
	}

	/** {@inheritDoc} */
	@Override
	public boolean equalsAtV1(float value)
	{
		return TupUtils2F.equalsAtV1(this, value);
	}

	/** {@inheritDoc} */
	@Override
	public boolean equalsAtV0(float tolerance, Tup2RF t)
	{
		return TupUtils2F.equalsAtV0(tolerance, this, t);
	}

	/** {@inheritDoc} */
	@Override
	public boolean equalsAtV0(float tolerance, TupRF t)
	{
		return TupUtils2F.equalsAtV0(tolerance, this, t);
	}

	/** {@inheritDoc} */
	@Override
	public boolean equalsAtV0(float tolerance, float... t)
	{
		return TupUtils2F.equalsAtV0(tolerance, this, t);
	}

	/** {@inheritDoc} */
	@Override
	public boolean equalsAtV0(float tolerance, float value)
	{
		return TupUtils2F.equalsAtV0(tolerance, this, value);
	}

	/** {@inheritDoc} */
	@Override
	public boolean equalsAtV1(float tolerance, Tup2RF t)
	{
		return TupUtils2F.equalsAtV1(tolerance, this, t);
	}

	/** {@inheritDoc} */
	@Override
	public boolean equalsAtV1(float tolerance, TupRF t)
	{
		return TupUtils2F.equalsAtV1(tolerance, this, t);
	}

	/** {@inheritDoc} */
	@Override
	public boolean equalsAtV1(float tolerance, float... t)
	{
		return TupUtils2F.equalsAtV1(tolerance, this, t);
	}

	/** {@inheritDoc} */
	@Override
	public boolean equalsAtV1(float tolerance, float value)
	{
		return TupUtils2F.equalsAtV1(tolerance, this, value);
	}

	/** {@inheritDoc} */
	@Override
	public float len()
	{
		return VecUtils2F.len(this);
	}

	/** {@inheritDoc} */
	@Override
	public float len(float tolerance)
	{
		return VecUtils2F.len(tolerance, this);
	}

	/** {@inheritDoc} */
	@Override
	public float invLen()
	{
		return VecUtils2F.invLen(this);
	}

	/** {@inheritDoc} */
	@Override
	public float dist(Tup2RF v2)
	{
		return VecUtils2F.dist(this, v2);
	}

	/** {@inheritDoc} */
	@Override
	public float dist(Tup2RF v2, float tolerance)
	{
		return VecUtils2F.dist(tolerance, this, v2);
	}

	/** {@inheritDoc} */
	@Override
	public float dist(float[] v2)
	{
		return VecUtils2F.dist(this, v2);
	}

	/** {@inheritDoc} */
	@Override
	public float dist(float[] v2, float tolerance)
	{
		return VecUtils2F.dist(tolerance, this, v2);
	}

	/** {@inheritDoc} */
	@Override
	public float dist(float v2x, float v2y)
	{
		return VecUtils2F.dist(this, v2x, v2y);
	}

	/** {@inheritDoc} */
	@Override
	public float dist(float v2x, float v2y, float tolerance)
	{
		return VecUtils2F.dist(tolerance, this, v2x, v2y);
	}

	/** {@inheritDoc} */
	@Override
	public float invDist(Tup2RF v2)
	{
		return VecUtils2F.invDist(this, v2);
	}

	/** {@inheritDoc} */
	@Override
	public float invDist(float[] v2)
	{
		return VecUtils2F.invDist(this, v2);
	}

	/** {@inheritDoc} */
	@Override
	public float invDist(float v2x, float v2y)
	{
		return VecUtils2F.invDist(this, v2x, v2y);
	}

	/** {@inheritDoc} */
	@Override
	public float sqrLen()
	{
		return VecUtils2F.sqrLen(this);
	}

	/** {@inheritDoc} */
	@Override
	public float sqrDist(Tup2RF v2)
	{
		return VecUtils2F.sqrDist(this, v2);
	}

	/** {@inheritDoc} */
	@Override
	public float sqrDist(float[] v2)
	{
		return VecUtils2F.sqrDist(this, v2);
	}

	/** {@inheritDoc} */
	@Override
	public float sqrDist(float v2x, float v2y)
	{
		return VecUtils2F.sqrDist(this, v2x, v2y);
	}

	/** {@inheritDoc} */
	@Override
	public float dot(Tup2RF v2)
	{
		return VecUtils2F.dot(this, v2);
	}

	/** {@inheritDoc} */
	@Override
	public float dot(float[] v2)
	{
		return VecUtils2F.dot(this, v2);
	}

	/** {@inheritDoc} */
	@Override
	public float dot(float v2x, float v2y)
	{
		return VecUtils2F.dot(this, v2x, v2y);
	}

	/** {@inheritDoc} */
	@Override
	public IndexValuePairF minEntry()
	{
		return VecUtils2F.minEntry(this, new IndexValuePairF());
	}

	/** {@inheritDoc} */
	@Override
	public IndexValuePairF minEntry(IndexValuePairF res)
	{
		return VecUtils2F.minEntry(this, res);
	}

	/** {@inheritDoc} */
	@Override
	public float minValue()
	{
		return VecUtils2F.minValue(this);
	}

	/** {@inheritDoc} */
	@Override
	public int minComponent()
	{
		return VecUtils2F.minComponent(this);
	}

	/** {@inheritDoc} */
	@Override
	public IndexValuePairF maxEntry()
	{
		return VecUtils2F.maxEntry(this, new IndexValuePairF());
	}

	/** {@inheritDoc} */
	@Override
	public IndexValuePairF maxEntry(IndexValuePairF res)
	{
		return VecUtils2F.maxEntry(this, res);
	}

	/** {@inheritDoc} */
	@Override
	public float maxValue()
	{
		return VecUtils2F.maxValue(this);
	}

	/** {@inheritDoc} */
	@Override
	public int maxComponent()
	{
		return VecUtils2F.maxComponent(this);
	}

	/** {@inheritDoc} */
	@Override
	public <T extends Tup2WF> T addR(Tup2RF v2, T res)
	{
		return VecUtils2F.add(this, v2, res);
	}

	/** {@inheritDoc} */
	@Override
	public float[] addR(Tup2RF v2, float[] res)
	{
		return VecUtils2F.add(this, v2, res);
	}

	/** {@inheritDoc} */
	@Override
	public <T extends Tup2WF> T addR(float[] v2, T res)
	{
		return VecUtils2F.add(this, v2, res);
	}

	/** {@inheritDoc} */
	@Override
	public float[] addR(float[] v2, float[] res)
	{
		return VecUtils2F.add(this, v2, res);
	}

	/** {@inheritDoc} */
	@Override
	public <T extends Tup2WF> T addR(float value, T res)
	{
		return VecUtils2F.add(this, value, value, res);
	}

	/** {@inheritDoc} */
	@Override
	public float[] addR(float value, float[] res)
	{
		return VecUtils2F.add(this, value, value, res);
	}

	/** {@inheritDoc} */
	@Override
	public <T extends Tup2WF> T addR(float v2x, float v2y, T res)
	{
		return VecUtils2F.add(this, v2x, v2y, res);
	}

	/** {@inheritDoc} */
	@Override
	public float[] addR(float v2x, float v2y, float[] res)
	{
		return VecUtils2F.add(this, v2x, v2y, res);
	}

	/** {@inheritDoc} */
	@Override
	public <T extends Tup2WF> T subR(Tup2RF v2, T res)
	{
		return VecUtils2F.sub(this, v2, res);
	}

	/** {@inheritDoc} */
	@Override
	public float[] subR(Tup2RF v2, float[] res)
	{
		return VecUtils2F.sub(this, v2, res);
	}

	/** {@inheritDoc} */
	@Override
	public <T extends Tup2WF> T subR(float[] v2, T res)
	{
		return VecUtils2F.sub(this, v2, res);
	}

	/** {@inheritDoc} */
	@Override
	public float[] subR(float[] v2, float[] res)
	{
		return VecUtils2F.sub(this, v2, res);
	}

	/** {@inheritDoc} */
	@Override
	public <T extends Tup2WF> T subR(float value, T res)
	{
		return VecUtils2F.sub(this, value, value, res);
	}

	/** {@inheritDoc} */
	@Override
	public float[] subR(float value, float[] res)
	{
		return VecUtils2F.sub(this, value, value, res);
	}

	/** {@inheritDoc} */
	@Override
	public <T extends Tup2WF> T subR(float v2x, float v2y, T res)
	{
		return VecUtils2F.sub(this, v2x, v2y, res);
	}

	/** {@inheritDoc} */
	@Override
	public float[] subR(float v2x, float v2y, float[] res)
	{
		return VecUtils2F.sub(this, v2x, v2y, res);
	}

	/** {@inheritDoc} */
	@Override
	public <T extends Tup2WF> T revSubR(Tup2RF v2, T res)
	{
		return VecUtils2F.sub(v2, this, res);
	}

	/** {@inheritDoc} */
	@Override
	public float[] revSubR(Tup2RF v2, float[] res)
	{
		return VecUtils2F.sub(v2, this, res);
	}

	/** {@inheritDoc} */
	@Override
	public <T extends Tup2WF> T revSubR(float[] v2, T res)
	{
		return VecUtils2F.sub(v2, this, res);
	}

	/** {@inheritDoc} */
	@Override
	public float[] revSubR(float[] v2, float[] res)
	{
		return VecUtils2F.sub(v2, this, res);
	}

	/** {@inheritDoc} */
	@Override
	public <T extends Tup2WF> T revSubR(float value, T res)
	{
		return VecUtils2F.sub(value, value, this, res);
	}

	/** {@inheritDoc} */
	@Override
	public float[] revSubR(float value, float[] res)
	{
		return VecUtils2F.sub(value, value, this, res);
	}

	/** {@inheritDoc} */
	@Override
	public <T extends Tup2WF> T revSubR(float v2x, float v2y, T res)
	{
		return VecUtils2F.sub(v2x, v2y, this, res);
	}

	/** {@inheritDoc} */
	@Override
	public float[] revSubR(float v2x, float v2y, float[] res)
	{
		return VecUtils2F.sub(v2x, v2y, this, res);
	}

	/** {@inheritDoc} */
	@Override
	public <T extends Tup2WF> T mulR(Tup2RF v2, T res)
	{
		return VecUtils2F.mul(this, v2, res);
	}

	/** {@inheritDoc} */
	@Override
	public float[] mulR(Tup2RF v2, float[] res)
	{
		return VecUtils2F.mul(this, v2, res);
	}

	/** {@inheritDoc} */
	@Override
	public <T extends Tup2WF> T mulR(float[] v2, T res)
	{
		return VecUtils2F.mul(this, v2, res);
	}

	/** {@inheritDoc} */
	@Override
	public float[] mulR(float[] v2, float[] res)
	{
		return VecUtils2F.mul(this, v2, res);
	}

	/** {@inheritDoc} */
	@Override
	public <T extends Tup2WF> T mulR(float value, T res)
	{
		return VecUtils2F.mul(this, value, value, res);
	}

	/** {@inheritDoc} */
	@Override
	public float[] mulR(float value, float[] res)
	{
		return VecUtils2F.mul(this, value, value, res);
	}

	/** {@inheritDoc} */
	@Override
	public <T extends Tup2WF> T mulR(float v2x, float v2y, T res)
	{
		return VecUtils2F.mul(this, v2x, v2y, res);
	}

	/** {@inheritDoc} */
	@Override
	public float[] mulR(float v2x, float v2y, float[] res)
	{
		return VecUtils2F.mul(this, v2x, v2y, res);
	}

	/** {@inheritDoc} */
	@Override
	public <T extends Tup2WF> T divR(Tup2RF v2, T res)
	{
		return VecUtils2F.div(this, v2, res);
	}

	/** {@inheritDoc} */
	@Override
	public float[] divR(Tup2RF v2, float[] res)
	{
		return VecUtils2F.div(this, v2, res);
	}

	/** {@inheritDoc} */
	@Override
	public <T extends Tup2WF> T divR(float[] v2, T res)
	{
		return VecUtils2F.div(this, v2, res);
	}

	/** {@inheritDoc} */
	@Override
	public float[] divR(float[] v2, float[] res)
	{
		return VecUtils2F.div(this, v2, res);
	}

	/** {@inheritDoc} */
	@Override
	public <T extends Tup2WF> T divR(float value, T res)
	{
		return VecUtils2F.div(this, value, value, res);
	}

	/** {@inheritDoc} */
	@Override
	public float[] divR(float value, float[] res)
	{
		return VecUtils2F.div(this, value, value, res);
	}

	/** {@inheritDoc} */
	@Override
	public <T extends Tup2WF> T divR(float v2x, float v2y, T res)
	{
		return VecUtils2F.div(this, v2x, v2y, res);
	}

	/** {@inheritDoc} */
	@Override
	public float[] divR(float v2x, float v2y, float[] res)
	{
		return VecUtils2F.div(this, v2x, v2y, res);
	}

	/** {@inheritDoc} */
	@Override
	public <T extends Tup2WF> T revDivR(Tup2RF v2, T res)
	{
		return VecUtils2F.div(v2, this, res);
	}

	/** {@inheritDoc} */
	@Override
	public float[] revDivR(Tup2RF v2, float[] res)
	{
		return VecUtils2F.div(v2, this, res);
	}

	/** {@inheritDoc} */
	@Override
	public <T extends Tup2WF> T revDivR(float[] v2, T res)
	{
		return VecUtils2F.div(v2, this, res);
	}

	/** {@inheritDoc} */
	@Override
	public float[] revDivR(float[] v2, float[] res)
	{
		return VecUtils2F.div(v2, this, res);
	}

	/** {@inheritDoc} */
	@Override
	public <T extends Tup2WF> T revDivR(float value, T res)
	{
		return VecUtils2F.div(value, value, this, res);
	}

	/** {@inheritDoc} */
	@Override
	public float[] revDivR(float value, float[] res)
	{
		return VecUtils2F.div(value, value, this, res);
	}

	/** {@inheritDoc} */
	@Override
	public <T extends Tup2WF> T revDivR(float v2x, float v2y, T res)
	{
		return VecUtils2F.div(v2x, v2y, this, res);
	}

	/** {@inheritDoc} */
	@Override
	public float[] revDivR(float v2x, float v2y, float[] res)
	{
		return VecUtils2F.div(v2x, v2y, this, res);
	}

	/** {@inheritDoc} */
	@Override
	public <T extends Tup2WF> T halfVecR(Tup2RF v2, T res)
	{
		return VecUtils2F.halfVec(this, v2, res);
	}

	/** {@inheritDoc} */
	@Override
	public float[] halfVecR(Tup2RF v2, float[] res)
	{
		return VecUtils2F.halfVec(this, v2, res);
	}

	/** {@inheritDoc} */
	@Override
	public <T extends Tup2WF> T halfVecR(float[] v2, T res)
	{
		return VecUtils2F.halfVec(this, v2, res);
	}

	/** {@inheritDoc} */
	@Override
	public float[] halfVecR(float[] v2, float[] res)
	{
		return VecUtils2F.halfVec(this, v2, res);
	}

	/** {@inheritDoc} */
	@Override
	public <T extends Tup2WF> T halfVecR(float v2x, float v2y, T res)
	{
		return VecUtils2F.halfVec(this, v2x, v2y, res);
	}

	/** {@inheritDoc} */
	@Override
	public float[] halfVecR(float v2x, float v2y, float[] res)
	{
		return VecUtils2F.halfVec(this, v2x, v2y, res);
	}

	/** {@inheritDoc} */
	@Override
	public <T extends Tup2WF> T halfPointR(Tup2RF v2, T res)
	{
		return VecUtils2F.halfPoint(this, v2, res);
	}

	/** {@inheritDoc} */
	@Override
	public float[] halfPointR(Tup2RF v2, float[] res)
	{
		return VecUtils2F.halfPoint(this, v2, res);
	}

	/** {@inheritDoc} */
	@Override
	public <T extends Tup2WF> T halfPointR(float[] v2, T res)
	{
		return VecUtils2F.halfPoint(this, v2, res);
	}

	/** {@inheritDoc} */
	@Override
	public float[] halfPointR(float[] v2, float[] res)
	{
		return VecUtils2F.halfPoint(this, v2, res);
	}

	/** {@inheritDoc} */
	@Override
	public <T extends Tup2WF> T halfPointR(float v2x, float v2y, T res)
	{
		return VecUtils2F.halfPoint(this, v2x, v2y, res);
	}

	/** {@inheritDoc} */
	@Override
	public float[] halfPointR(float v2x, float v2y, float[] res)
	{
		return VecUtils2F.halfPoint(this, v2x, v2y, res);
	}

	/** {@inheritDoc} */
	@Override
	public <T extends Tup2WF> T negR(T res)
	{
		return VecUtils2F.neg(this, res);
	}

	/** {@inheritDoc} */
	@Override
	public float[] negR(float[] res)
	{
		return VecUtils2F.neg(this, res);
	}

	/** {@inheritDoc} */
	@Override
	public <T extends Tup2WF> T invR(T res)
	{
		return VecUtils2F.inv(this, res);
	}

	/** {@inheritDoc} */
	@Override
	public float[] invR(float[] res)
	{
		return VecUtils2F.inv(this, res);
	}

	/** {@inheritDoc} */
	@Override
	public <T extends Tup2WF> T nrmR(T res)
	{
		return VecUtils2F.nrm(this, res);
	}

	/** {@inheritDoc} */
	@Override
	public float[] nrmR(float[] res)
	{
		return VecUtils2F.nrm(this, res);
	}

	/** {@inheritDoc} */
	@Override
	public <T extends Tup2WF> T minR(Tup2RF v2, T res)
	{
		return VecUtils2F.min(this, v2, res);
	}

	/** {@inheritDoc} */
	@Override
	public float[] minR(Tup2RF v2, float[] res)
	{
		return VecUtils2F.min(this, v2, res);
	}

	/** {@inheritDoc} */
	@Override
	public <T extends Tup2WF> T minR(float[] v2, T res)
	{
		return VecUtils2F.min(this, v2, res);
	}

	/** {@inheritDoc} */
	@Override
	public float[] minR(float[] v2, float[] res)
	{
		return VecUtils2F.min(this, v2, res);
	}

	/** {@inheritDoc} */
	@Override
	public <T extends Tup2WF> T minR(float v2x, float v2y, T res)
	{
		return VecUtils2F.min(this, v2x, v2y, res);
	}

	/** {@inheritDoc} */
	@Override
	public float[] minR(float v2x, float v2y, float[] res)
	{
		return VecUtils2F.min(this, v2x, v2y, res);
	}

	/** {@inheritDoc} */
	@Override
	public <T extends Tup2WF> T maxR(Tup2RF v2, T res)
	{
		return VecUtils2F.max(this, v2, res);
	}

	/** {@inheritDoc} */
	@Override
	public float[] maxR(Tup2RF v2, float[] res)
	{
		return VecUtils2F.max(this, v2, res);
	}

	/** {@inheritDoc} */
	@Override
	public <T extends Tup2WF> T maxR(float[] v2, T res)
	{
		return VecUtils2F.max(this, v2, res);
	}

	/** {@inheritDoc} */
	@Override
	public float[] maxR(float[] v2, float[] res)
	{
		return VecUtils2F.max(this, v2, res);
	}

	/** {@inheritDoc} */
	@Override
	public <T extends Tup2WF> T maxR(float v2x, float v2y, T res)
	{
		return VecUtils2F.max(this, v2x, v2y, res);
	}

	/** {@inheritDoc} */
	@Override
	public float[] maxR(float v2x, float v2y, float[] res)
	{
		return VecUtils2F.max(this, v2x, v2y, res);
	}

	/** {@inheritDoc} */
	@Override
	public <T extends Tup2WF> T rotRadR(float angle, T res)
	{
		return VecUtils2F.rotRad(this, angle, res);
	}

	/** {@inheritDoc} */
	@Override
	public float[] rotRadR(float angle, float[] res)
	{
		return VecUtils2F.rotRad(this, angle, res);
	}

	/** {@inheritDoc} */
	@Override
	public <T extends Tup2WF> T rotDegR(float angle, T res)
	{
		return VecUtils2F.rotDeg(this, angle, res);
	}

	/** {@inheritDoc} */
	@Override
	public float[] rotDegR(float angle, float[] res)
	{
		return VecUtils2F.rotDeg(this, angle, res);
	}

	/** {@inheritDoc} */
	@Override
	public <T extends Tup2WF> T prjR(Tup2RF t, T res)
	{
		return VecUtils2F.prj(this, t, res);
	}

	/** {@inheritDoc} */
	@Override
	public <T extends Tup2WF> T prjR(float[] t, T res)
	{
		return VecUtils2F.prj(this, t, res);
	}

	/** {@inheritDoc} */
	@Override
	public <T extends Tup2WF> T prjR(float tx, float ty, T res)
	{
		return VecUtils2F.prj(this, tx, ty, res);
	}

	/** {@inheritDoc} */
	@Override
	public float[] prjR(Tup2RF t, float[] res)
	{
		return VecUtils2F.prj(this, t, res);
	}

	/** {@inheritDoc} */
	@Override
	public float[] prjR(float[] t, float[] res)
	{
		return VecUtils2F.prj(this, t, res);
	}

	/** {@inheritDoc} */
	@Override
	public float[] prjR(float tx, float ty, float[] res)
	{
		return VecUtils2F.prj(this, tx, ty, res);
	}

	/** {@inheritDoc} */
	@Override
	public <T extends Tup2WF> T rflR(Tup2RF n, T res)
	{
		return VecUtils2F.rfl(this, n, res);
	}

	/** {@inheritDoc} */
	@Override
	public <T extends Tup2WF> T rflR(float[] n, T res)
	{
		return VecUtils2F.rfl(this, n, res);
	}

	/** {@inheritDoc} */
	@Override
	public <T extends Tup2WF> T rflR(float nx, float ny, T res)
	{
		return VecUtils2F.rfl(this, nx, ny, res);
	}

	/** {@inheritDoc} */
	@Override
	public float[] rflR(Tup2RF n, float[] res)
	{
		return VecUtils2F.rfl(this, n, res);
	}

	/** {@inheritDoc} */
	@Override
	public float[] rflR(float[] n, float[] res)
	{
		return VecUtils2F.rfl(this, n, res);
	}

	/** {@inheritDoc} */
	@Override
	public float[] rflR(float nx, float ny, float[] res)
	{
		return VecUtils2F.rfl(this, nx, ny, res);
	}

	/** {@inheritDoc} */
	@Override
	public <T extends Tup2WF> T ceilR(T res)
	{
		return VecUtils2F.ceil(this, res);
	}

	/** {@inheritDoc} */
	@Override
	public float[] ceilR(float[] res)
	{
		return VecUtils2F.ceil(this, res);
	}

	/** {@inheritDoc} */
	@Override
	public <T extends Tup2WF> T floorR(T res)
	{
		return VecUtils2F.floor(this, res);
	}

	/** {@inheritDoc} */
	@Override
	public float[] floorR(float[] res)
	{
		return VecUtils2F.floor(this, res);
	}

	/** {@inheritDoc} */
	@Override
	public <T extends Tup2WF> T roundR(T res)
	{
		return VecUtils2F.round(this, res);
	}

	/** {@inheritDoc} */
	@Override
	public float[] roundR(float[] res)
	{
		return VecUtils2F.round(this, res);
	}

	/** {@inheritDoc} */
	@Override
	public <T extends Tup2WF> T truncR(T res)
	{
		return VecUtils2F.trunc(this, res);
	}

	/** {@inheritDoc} */
	@Override
	public float[] truncR(float[] res)
	{
		return VecUtils2F.trunc(this, res);
	}

	/** {@inheritDoc} */
	@Override
	public <T extends Tup2WF> T roundR(RoundMethodF method, T res)
	{
		return VecUtils2F.round(this, method, res);
	}

	/** {@inheritDoc} */
	@Override
	public float[] roundR(RoundMethodF method, float[] res)
	{
		return VecUtils2F.round(this, method, res);
	}

	/** {@inheritDoc} */
	@Override
	public <T extends Tup2WF> T absR(T res)
	{
		return VecUtils2F.abs(this, res);
	}

	/** {@inheritDoc} */
	@Override
	public float[] absR(float[] res)
	{
		return VecUtils2F.abs(this, res);
	}

	/** {@inheritDoc} */
	@Override
	public <T extends Tup2WF> T signR(T res)
	{
		return VecUtils2F.sign(this, res);
	}

	/** {@inheritDoc} */
	@Override
	public float[] signR(float[] res)
	{
		return VecUtils2F.sign(this, res);
	}

	/** {@inheritDoc} */
	@Override
	public <T extends Tup2WF> T intVecLinR(Tup2RF v2, float alpha, T res)
	{
		return VecUtils2F.intVecLin(this, v2, alpha, res);
	}

	/** {@inheritDoc} */
	@Override
	public <T extends Tup2WF> T intVecLinR(float[] v2, float alpha, T res)
	{
		return VecUtils2F.intVecLin(this, v2, alpha, res);
	}

	/** {@inheritDoc} */
	@Override
	public <T extends Tup2WF> T intVecLinR(float v2x, float v2y, float alpha, T res)
	{
		return VecUtils2F.intVecLin(this, v2x, v2y, alpha, res);
	}

	/** {@inheritDoc} */
	@Override
	public float[] intVecLinR(Tup2RF v2, float alpha, float[] res)
	{
		return VecUtils2F.intVecLin(this, v2, alpha, res);
	}

	/** {@inheritDoc} */
	@Override
	public float[] intVecLinR(float[] v2, float alpha, float[] res)
	{
		return VecUtils2F.intVecLin(this, v2, alpha, res);
	}

	/** {@inheritDoc} */
	@Override
	public float[] intVecLinR(float v2x, float v2y, float alpha, float[] res)
	{
		return VecUtils2F.intVecLin(this, v2x, v2y, alpha, res);
	}

	/** {@inheritDoc} */
	@Override
	public boolean isFiniteAt(int index)
	{
		switch(index)
		{
			case 0: return isFiniteAtV0();
			case 1: return isFiniteAtV1();
			default: throw new IndexOutOfRangeException(index, 1);
		}
	}

	/** {@inheritDoc} */
	@Override
	public boolean isFiniteAtV0()
	{
		return Float.isFinite(this.x);
	}

	/** {@inheritDoc} */
	@Override
	public boolean isFiniteAtV1()
	{
		return Float.isFinite(this.y);
	}

	/** {@inheritDoc} */
	@Override
	public boolean isZeroAt(int index)
	{
		switch(index)
		{
			case 0: return isZeroAtV0();
			case 1: return isZeroAtV1();
			default: throw new IndexOutOfRangeException(index, 1);
		}
	}

	/** {@inheritDoc} */
	@Override
	public boolean isZeroAt(float tolerance, int index)
	{
		switch(index)
		{
			case 0: return isZeroAtV0(tolerance);
			case 1: return isZeroAtV1(tolerance);
			default: throw new IndexOutOfRangeException(index, 1);
		}
	}

	/** {@inheritDoc} */
	@Override
	public boolean isZeroAtV0()
	{
		return this.x == 0.0f;
	}

	/** {@inheritDoc} */
	@Override
	public boolean isZeroAtV1()
	{
		return this.y == 0.0f;
	}

	/** {@inheritDoc} */
	@Override
	public boolean isZeroAtV0(float tolerance)
	{
		return MathUtils.isZero(tolerance, this.x);
	}

	/** {@inheritDoc} */
	@Override
	public boolean isZeroAtV1(float tolerance)
	{
		return MathUtils.isZero(tolerance, this.y);
	}

	/** {@inheritDoc} */
	@Override
	public boolean isFinite()
	{
		return isFiniteAtV0() && isFiniteAtV1();
	}

	/** {@inheritDoc} */
	@Override
	public boolean isZero()
	{
		return isZeroAtV0() && isZeroAtV1();
	}

	/** {@inheritDoc} */
	@Override
	public boolean isZero(float tolerance)
	{
		return isZeroAtV0(tolerance) && isZeroAtV1(tolerance);
	}

	/** {@inheritDoc} */
	@Override
	public ImVec2F arrangeN(int... indices)
	{
		return new ImVec2F(getAt(indices[0]), getAt(indices[1]));
	}

	/** {@inheritDoc} */
	@Override
	public ImVec2F arrangeN(int iv0, int iv1)
	{
		return new ImVec2F(getAt(iv0), getAt(iv0));
	}

	/** {@inheritDoc} */
	@Override
	public ImVec2F swizzleN(int indexA, int indexB)
	{
		float a;
		switch(indexA)
		{
			case 0: a = this.x; break;
			case 1: a = this.y; break;
			default: throw new IndexOutOfRangeException(indexA, 1);
		}
		
		float b;
		switch(indexB)
		{
			case 0: b = this.x; break;
			case 1: b = this.y; break;
			default: throw new IndexOutOfRangeException(indexB, 1);
		}
		
		float x = this.x;
		float y = this.y;
		
		switch(indexB)
		{
			case 0: x = a; break;
			case 1: y = a; break;
			default: throw new IndexOutOfRangeException(indexB, 1);
		}
		
		switch(indexA)
		{
			case 0: x = b; break;
			case 1: y = b; break;
			default: throw new IndexOutOfRangeException(indexB, 1);
		}
		
		return new ImVec2F(x, y);
	}

	/** {@inheritDoc} */
	@Override
	public ImVec2F swizzleV0V1N()
	{
		return new ImVec2F(this.y, this.x);
	}

	/** {@inheritDoc} */
	@Override
	public ImVec2F addN(Tup2RF v2)
	{
		return VecUtils2F.addFunc(this, v2, ImVec2F::new);
	}

	/** {@inheritDoc} */
	@Override
	public ImVec2F addN(float[] v2)
	{
		return VecUtils2F.addFunc(this, v2, ImVec2F::new);
	}

	/** {@inheritDoc} */
	@Override
	public ImVec2F addN(float value)
	{
		return VecUtils2F.addFunc(this, value, value, ImVec2F::new);
	}

	/** {@inheritDoc} */
	@Override
	public ImVec2F addN(float v2x, float v2y)
	{
		return VecUtils2F.addFunc(this, v2x, v2y, ImVec2F::new);
	}

	/** {@inheritDoc} */
	@Override
	public ImVec2F subN(Tup2RF v2)
	{
		return VecUtils2F.subFunc(this, v2, ImVec2F::new);
	}

	/** {@inheritDoc} */
	@Override
	public ImVec2F subN(float[] v2)
	{
		return VecUtils2F.subFunc(this, v2, ImVec2F::new);
	}

	/** {@inheritDoc} */
	@Override
	public ImVec2F subN(float value)
	{
		return VecUtils2F.subFunc(this, value, value, ImVec2F::new);
	}

	/** {@inheritDoc} */
	@Override
	public ImVec2F subN(float v2x, float v2y)
	{
		return VecUtils2F.subFunc(this, v2x, v2y, ImVec2F::new);
	}

	/** {@inheritDoc} */
	@Override
	public ImVec2F revSubN(Tup2RF v2)
	{
		return VecUtils2F.subFunc(v2, this, ImVec2F::new);
	}

	/** {@inheritDoc} */
	@Override
	public ImVec2F revSubN(float[] v2)
	{
		return VecUtils2F.subFunc(v2, this, ImVec2F::new);
	}

	/** {@inheritDoc} */
	@Override
	public ImVec2F revSubN(float value)
	{
		return VecUtils2F.subFunc(value, value, this,ImVec2F::new);
	}

	/** {@inheritDoc} */
	@Override
	public ImVec2F revSubN(float v2x, float v2y)
	{
		return VecUtils2F.subFunc(v2x, v2y, this, ImVec2F::new);
	}

	/** {@inheritDoc} */
	@Override
	public ImVec2F mulN(Tup2RF v2)
	{
		return VecUtils2F.mulFunc(this, v2, ImVec2F::new);
	}

	/** {@inheritDoc} */
	@Override
	public ImVec2F mulN(float[] v2)
	{
		return VecUtils2F.mulFunc(this, v2, ImVec2F::new);
	}

	/** {@inheritDoc} */
	@Override
	public ImVec2F mulN(float value)
	{
		return VecUtils2F.mulFunc(this, value, value, ImVec2F::new);
	}

	/** {@inheritDoc} */
	@Override
	public ImVec2F mulN(float v2x, float v2y)
	{
		return VecUtils2F.mulFunc(this, v2x, v2y, ImVec2F::new);
	}

	/** {@inheritDoc} */
	@Override
	public ImVec2F divN(Tup2RF v2)
	{
		return VecUtils2F.divFunc(this, v2, ImVec2F::new);
	}

	/** {@inheritDoc} */
	@Override
	public ImVec2F divN(float[] v2)
	{
		return VecUtils2F.divFunc(this, v2, ImVec2F::new);
	}

	/** {@inheritDoc} */
	@Override
	public ImVec2F divN(float value)
	{
		return VecUtils2F.divFunc(this, value, value, ImVec2F::new);
	}

	/** {@inheritDoc} */
	@Override
	public ImVec2F divN(float v2x, float v2y)
	{
		return VecUtils2F.divFunc(this, v2x, v2y, ImVec2F::new);
	}

	/** {@inheritDoc} */
	@Override
	public ImVec2F revDivN(Tup2RF v2)
	{
		return VecUtils2F.divFunc(v2, this, ImVec2F::new);
	}

	/** {@inheritDoc} */
	@Override
	public ImVec2F revDivN(float[] v2)
	{
		return VecUtils2F.divFunc(v2, this, ImVec2F::new);
	}

	/** {@inheritDoc} */
	@Override
	public ImVec2F revDivN(float value)
	{
		return VecUtils2F.divFunc(value, value, this, ImVec2F::new);
	}

	/** {@inheritDoc} */
	@Override
	public ImVec2F revDivN(float v2x, float v2y)
	{
		return VecUtils2F.divFunc(v2x, v2y, this, ImVec2F::new);
	}

	/** {@inheritDoc} */
	@Override
	public ImVec2F halfVecN(Tup2RF v2)
	{
		return VecUtils2F.halfVecFunc(this, v2, ImVec2F::new);
	}

	/** {@inheritDoc} */
	@Override
	public ImVec2F halfVecN(float[] v2)
	{
		return VecUtils2F.halfVecFunc(this, v2, ImVec2F::new);
	}

	/** {@inheritDoc} */
	@Override
	public ImVec2F halfVecN(float v2x, float v2y)
	{
		return VecUtils2F.halfVecFunc(this, v2x, v2y, ImVec2F::new);
	}

	/** {@inheritDoc} */
	@Override
	public ImVec2F halfPointN(Tup2RF v2)
	{
		return VecUtils2F.halfPointFunc(this, v2, ImVec2F::new);
	}

	/** {@inheritDoc} */
	@Override
	public ImVec2F halfPointN(float[] v2)
	{
		return VecUtils2F.halfPointFunc(this, v2, ImVec2F::new);
	}

	/** {@inheritDoc} */
	@Override
	public ImVec2F halfPointN(float v2x, float v2y)
	{
		return VecUtils2F.halfPointFunc(this, v2x, v2y, ImVec2F::new);
	}

	/** {@inheritDoc} */
	@Override
	public ImVec2F negN()
	{
		return VecUtils2F.negFunc(this, ImVec2F::new);
	}

	/** {@inheritDoc} */
	@Override
	public ImVec2F invN()
	{
		return VecUtils2F.invFunc(this, ImVec2F::new);
	}

	/** {@inheritDoc} */
	@Override
	public ImVec2F nrmN()
	{
		return VecUtils2F.nrmFunc(this, ImVec2F::new);
	}

	/** {@inheritDoc} */
	@Override
	public ImVec2F minN(Tup2RF v2)
	{
		return VecUtils2F.minFunc(this, v2, ImVec2F::new);
	}

	/** {@inheritDoc} */
	@Override
	public ImVec2F minN(float[] v2)
	{
		return VecUtils2F.minFunc(this, v2, ImVec2F::new);
	}

	/** {@inheritDoc} */
	@Override
	public ImVec2F minN(float v2x, float v2y)
	{
		return VecUtils2F.minFunc(this, v2x, v2y, ImVec2F::new);
	}

	/** {@inheritDoc} */
	@Override
	public ImVec2F maxN(Tup2RF v2)
	{
		return VecUtils2F.maxFunc(this, v2, ImVec2F::new);
	}

	/** {@inheritDoc} */
	@Override
	public ImVec2F maxN(float[] v2)
	{
		return VecUtils2F.maxFunc(this, v2, ImVec2F::new);
	}

	/** {@inheritDoc} */
	@Override
	public ImVec2F maxN(float v2x, float v2y)
	{
		return VecUtils2F.maxFunc(this, v2x, v2y, ImVec2F::new);
	}

	/** {@inheritDoc} */
	@Override
	public ImVec2F rotRadN(float angle)
	{
		return VecUtils2F.rotRadFunc(this, angle, ImVec2F::new);
	}

	/** {@inheritDoc} */
	@Override
	public ImVec2F rotDegN(float angle)
	{
		return VecUtils2F.rotDegFunc(this, angle, ImVec2F::new);
	}

	/** {@inheritDoc} */
	@Override
	public ImVec2F prjN(Tup2RF t)
	{
		return VecUtils2F.prjFunc(this, t, ImVec2F::new);
	}

	/** {@inheritDoc} */
	@Override
	public ImVec2F prjN(float[] t)
	{
		return VecUtils2F.prjFunc(this, t, ImVec2F::new);
	}

	/** {@inheritDoc} */
	@Override
	public ImVec2F prjN(float tx, float ty)
	{
		return VecUtils2F.prjFunc(this, tx, ty, ImVec2F::new);
	}

	/** {@inheritDoc} */
	@Override
	public ImVec2F rflN(Tup2RF n)
	{
		return VecUtils2F.rflFunc(this, n, ImVec2F::new);
	}

	/** {@inheritDoc} */
	@Override
	public ImVec2F rflN(float[] n)
	{
		return VecUtils2F.rflFunc(this, n, ImVec2F::new);
	}

	/** {@inheritDoc} */
	@Override
	public ImVec2F rflN(float nx, float ny)
	{
		return VecUtils2F.rflFunc(this, nx, ny, ImVec2F::new);
	}

	/** {@inheritDoc} */
	@Override
	public ImVec2F ceilN()
	{
		return VecUtils2F.ceilFunc(this, ImVec2F::new);
	}

	/** {@inheritDoc} */
	@Override
	public ImVec2F floorN()
	{
		return VecUtils2F.floorFunc(this, ImVec2F::new);
	}

	/** {@inheritDoc} */
	@Override
	public ImVec2F roundN()
	{
		return VecUtils2F.roundFunc(this, ImVec2F::new);
	}

	/** {@inheritDoc} */
	@Override
	public ImVec2F truncN()
	{
		return VecUtils2F.truncFunc(this, ImVec2F::new);
	}

	/** {@inheritDoc} */
	@Override
	public ImVec2F roundN(RoundMethodF method)
	{
		return VecUtils2F.roundFunc(this, method, ImVec2F::new);
	}

	/** {@inheritDoc} */
	@Override
	public ImVec2F absN()
	{
		return VecUtils2F.absFunc(this, ImVec2F::new);
	}

	/** {@inheritDoc} */
	@Override
	public ImVec2F signN()
	{
		return VecUtils2F.signFunc(this, ImVec2F::new);
	}

	/** {@inheritDoc} */
	@Override
	public ImVec2F intVecLinN(Tup2RF v2, float alpha)
	{
		return VecUtils2F.intVecLinFunc(this, v2, alpha, ImVec2F::new);
	}

	/** {@inheritDoc} */
	@Override
	public ImVec2F intVecLinN(float[] v2, float alpha)
	{
		return VecUtils2F.intVecLinFunc(this, v2, alpha, ImVec2F::new);
	}

	/** {@inheritDoc} */
	@Override
	public ImVec2F intVecLinN(float v2x, float v2y, float alpha)
	{
		return VecUtils2F.intVecLinFunc(this, v2x, v2y, alpha, ImVec2F::new);
	}
}
