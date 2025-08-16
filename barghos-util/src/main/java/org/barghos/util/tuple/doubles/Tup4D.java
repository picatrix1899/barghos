package org.barghos.util.tuple.doubles;

import java.util.Arrays;
import java.util.Objects;

public class Tup4D implements ITup4WD
{
	private final double[] v = new double[4];
	
	public Tup4D()
	{
		set(0.0f, 0.0f, 0.0f, 0.0f);
	}
	
	public Tup4D(ITup4RD t)
	{
		set(t);
	}

	public Tup4D(ITupRD t)
	{
		set(t);
	}
	
	public Tup4D(double[] t)
	{
		set(t);
	}
	
	public Tup4D(double v0, double v1, double v2, double v3)
	{
		set(v0, v1, v2, v3);
	}
	
	@Override
	public double v0()
	{
		return this.v[0];
	}

	@Override
	public double v1()
	{
		return this.v[1];
	}

	@Override
	public double v2()
	{
		return this.v[2];
	}

	@Override
	public double v3()
	{
		return this.v[3];
	}

	@Override
	public double getAt(int index)
	{
		return this.v[index];
	}

	@Override
	public Tup4D v0(double v0)
	{
		this.v[0] = v0;
		
		return this;
	}

	@Override
	public Tup4D v1(double v1)
	{
		this.v[1] = v1;
		
		return this;
	}

	@Override
	public Tup4D v2(double v2)
	{
		this.v[2] = v2;
		
		return this;
	}

	@Override
	public Tup4D v3(double v3)
	{
		this.v[3] = v3;
	
		return this;
	}

	@Override
	public Tup4D setAt(int index, double value)
	{
		this.v[index] = index;
		
		return this;
	}

	@Override
	public Tup4D set(ITup4RD t)
	{
		t.toArray(this.v);
		
		return this;
	}

	@Override
	public Tup4D set(ITupRD t)
	{
		t.toArray(this.v);
		
		return this;
	}

	@Override
	public Tup4D set(double[] t)
	{
		System.arraycopy(t, 0, this.v, 0, 4);
		
		return this;
	}

	@Override
	public Tup4D set(double v0, double v1, double v2, double v3)
	{
		this.v[0] = v0;
		this.v[1] = v1;
		this.v[2] = v2;
		this.v[3] = v3;
		
		return this;
	}
	
	@Override
	public double[] toArray()
	{
		return Arrays.copyOf(this.v, 4);
	}

	@Override
	public double[] toArray(double[] res)
	{
		System.arraycopy(this.v, 0, res, 0, 4);
		
		return res;
	}

	@Override
	public String toString()
	{
		return "tup4d(" + this.v[0] + ", " + this.v[1] + ", " + this.v[2] + ", " + this.v[3] + ")";
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
		
		if(obj instanceof ITup4RD t)
		{
			return equals(t);
		}
		
		return false;
	}
	
	@Override
	public boolean isFinite()
	{
		return TupUtils4D.isFinite(this.v);
	}
	
	@Override
	public boolean isFiniteAt(int index)
	{
		return TupUtils4D.isFiniteAt(index, this.v);
	}

	@Override
	public boolean isFiniteAtV0()
	{
		return TupUtils4D.isFiniteAtV0(this.v);
	}

	@Override
	public boolean isFiniteAtV1()
	{
		return TupUtils4D.isFiniteAtV1(this.v);
	}

	@Override
	public boolean isFiniteAtV2()
	{
		return TupUtils4D.isFiniteAtV2(this.v);
	}

	@Override
	public boolean isFiniteAtV3()
	{
		return TupUtils4D.isFiniteAtV3(this.v);
	}

	@Override
	public boolean isZero()
	{
		return TupUtils4D.isZero(this.v);
	}
	
	@Override
	public boolean isZeroAt(int index)
	{
		return TupUtils4D.isZero(index, this.v);
	}
	
	@Override
	public boolean isZeroAtV0()
	{
		return TupUtils4D.isZeroAtV0(this.v);
	}

	@Override
	public boolean isZeroAtV1()
	{
		return TupUtils4D.isZeroAtV1(this.v);
	}

	@Override
	public boolean isZeroAtV2()
	{
		return TupUtils4D.isZeroAtV2(this.v);
	}

	@Override
	public boolean isZeroAtV3()
	{
		return TupUtils4D.isZeroAtV3(this.v);
	}

	@Override
	public boolean isZero(double tolerance)
	{
		return TupUtils4D.isZero(tolerance, this.v);
	}
	
	@Override
	public boolean isZeroAt(double tolerance, int index)
	{
		return TupUtils4D.isZeroAt(tolerance, index, this.v);
	}
	
	@Override
	public boolean isZeroAtV0(double tolerance)
	{
		return TupUtils4D.isZeroAtV0(tolerance, this.v);
	}

	@Override
	public boolean isZeroAtV1(double tolerance)
	{
		return TupUtils4D.isZeroAtV1(tolerance, this.v);
	}

	@Override
	public boolean isZeroAtV2(double tolerance)
	{
		return TupUtils4D.isZeroAtV2(tolerance, this.v);
	}

	@Override
	public boolean isZeroAtV3(double tolerance)
	{
		return TupUtils4D.isZeroAtV3(tolerance, this.v);
	}

	@Override
	public boolean equals(ITup4RD t)
	{
		return TupUtils4D.equals(this.v, t);
	}

	@Override
	public boolean equals(ITupRD t)
	{
		return TupUtils4D.equals(this.v, t);
	}

	@Override
	public boolean equals(double[] t)
	{
		return TupUtils4D.equals(this.v, t);
	}

	@Override
	public boolean equals(double v0, double v1, double v2, double v3)
	{
		return TupUtils4D.equals(this.v, v0, v1, v2, v3);
	}

	@Override
	public boolean equals(double tolerance, ITup4RD t)
	{
		return TupUtils4D.equals(tolerance, this.v, t);
	}

	@Override
	public boolean equals(double tolerance, ITupRD t)
	{
		return TupUtils4D.equals(tolerance, this.v, t);
	}

	@Override
	public boolean equals(double tolerance, double[] t)
	{
		return TupUtils4D.equals(tolerance, this.v, t);
	}

	@Override
	public boolean equals(double tolerance, double v0, double v1, double v2, double v3)
	{
		return TupUtils4D.equals(tolerance, this.v, v0, v1, v2, v3);
	}

	@Override
	public boolean equalsAt(int index, ITup4RD t)
	{
		return TupUtils4D.equalsAt(index, this.v, t);
	}

	@Override
	public boolean equalsAt(int index, ITupRD t)
	{
		return TupUtils4D.equalsAt(index, this.v, t);
	}

	@Override
	public boolean equalsAt(int index, double[] t)
	{
		return TupUtils4D.equalsAt(index, this.v, t);
	}

	@Override
	public boolean equalsAt(int index, double value)
	{
		return TupUtils4D.equalsAt(index, this.v, value);
	}

	@Override
	public boolean equalsAt(double tolerance, int index, ITup4RD t)
	{
		return TupUtils4D.equalsAt(tolerance, index, this.v, t);
	}

	@Override
	public boolean equalsAt(double tolerance, int index, ITupRD t)
	{
		return TupUtils4D.equalsAt(tolerance, index, this.v, t);
	}

	@Override
	public boolean equalsAt(double tolerance, int index, double[] t)
	{
		return TupUtils4D.equalsAt(tolerance, index, this.v, t);
	}

	@Override
	public boolean equalsAt(double tolerance, int index, double value)
	{
		return TupUtils4D.equalsAt(tolerance, index, this.v, value);
	}

	@Override
	public boolean equalsAtV0(ITup4RD t)
	{
		return TupUtils4D.equalsAtV0(this.v, t);
	}

	@Override
	public boolean equalsAtV0(ITupRD t)
	{
		return TupUtils4D.equalsAtV0(this.v, t);
	}

	@Override
	public boolean equalsAtV0(double[] t)
	{
		return TupUtils4D.equalsAtV0(this.v, t);
	}

	@Override
	public boolean equalsAtV0(double value)
	{
		return TupUtils4D.equalsAtV0(this.v, value);
	}

	@Override
	public boolean equalsAtV1(ITup4RD t)
	{
		return TupUtils4D.equalsAtV1(this.v, t);
	}

	@Override
	public boolean equalsAtV1(ITupRD t)
	{
		return TupUtils4D.equalsAtV1(this.v, t);
	}

	@Override
	public boolean equalsAtV1(double[] t)
	{
		return TupUtils4D.equalsAtV1(this.v, t);
	}

	@Override
	public boolean equalsAtV1(double value)
	{
		return TupUtils4D.equalsAtV1(this.v, value);
	}

	@Override
	public boolean equalsAtV2(ITup4RD t)
	{
		return TupUtils4D.equalsAtV2(this.v, t);
	}

	@Override
	public boolean equalsAtV2(ITupRD t)
	{
		return TupUtils4D.equalsAtV2(this.v, t);
	}

	@Override
	public boolean equalsAtV2(double[] t)
	{
		return TupUtils4D.equalsAtV2(this.v, t);
	}

	@Override
	public boolean equalsAtV2(double value)
	{
		return TupUtils4D.equalsAtV2(this.v, value);
	}

	@Override
	public boolean equalsAtV3(ITup4RD t)
	{
		return TupUtils4D.equalsAtV3(this.v, t);
	}

	@Override
	public boolean equalsAtV3(ITupRD t)
	{
		return TupUtils4D.equalsAtV3(this.v, t);
	}

	@Override
	public boolean equalsAtV3(double[] t)
	{
		return TupUtils4D.equalsAtV3(this.v, t);
	}

	@Override
	public boolean equalsAtV3(double value)
	{
		return TupUtils4D.equalsAtV3(this.v, value);
	}

	@Override
	public boolean equalsAtV0(double tolerance, ITup4RD t)
	{
		return TupUtils4D.equalsAtV0(tolerance, this.v, t);
	}

	@Override
	public boolean equalsAtV0(double tolerance, ITupRD t)
	{
		return TupUtils4D.equalsAtV0(tolerance, this.v, t);
	}

	@Override
	public boolean equalsAtV0(double tolerance, double[] t)
	{
		return TupUtils4D.equalsAtV0(tolerance, this.v, t);
	}

	@Override
	public boolean equalsAtV0(double tolerance, double value)
	{
		return TupUtils4D.equalsAtV0(tolerance, this.v, value);
	}

	@Override
	public boolean equalsAtV1(double tolerance, ITup4RD t)
	{
		return TupUtils4D.equalsAtV1(tolerance, this.v, t);
	}

	@Override
	public boolean equalsAtV1(double tolerance, ITupRD t)
	{
		return TupUtils4D.equalsAtV1(tolerance, this.v, t);
	}

	@Override
	public boolean equalsAtV1(double tolerance, double[] t)
	{
		return TupUtils4D.equalsAtV1(tolerance, this.v, t);
	}

	@Override
	public boolean equalsAtV1(double tolerance, double value)
	{
		return TupUtils4D.equalsAtV1(tolerance, this.v, value);
	}

	@Override
	public boolean equalsAtV2(double tolerance, ITup4RD t)
	{
		return TupUtils4D.equalsAtV2(tolerance, this.v, t);
	}

	@Override
	public boolean equalsAtV2(double tolerance, ITupRD t)
	{
		return TupUtils4D.equalsAtV2(tolerance, this.v, t);
	}

	@Override
	public boolean equalsAtV2(double tolerance, double[] t)
	{
		return TupUtils4D.equalsAtV2(tolerance, this.v, t);
	}

	@Override
	public boolean equalsAtV2(double tolerance, double value)
	{
		return TupUtils4D.equalsAtV2(tolerance, this.v, value);
	}

	@Override
	public boolean equalsAtV3(double tolerance, ITup4RD t)
	{
		return TupUtils4D.equalsAtV3(tolerance, this.v, t);
	}

	@Override
	public boolean equalsAtV3(double tolerance, ITupRD t)
	{
		return TupUtils4D.equalsAtV3(tolerance, this.v, t);
	}

	@Override
	public boolean equalsAtV3(double tolerance, double[] t)
	{
		return TupUtils4D.equalsAtV3(tolerance, this.v, t);
	}

	@Override
	public boolean equalsAtV3(double tolerance, double value)
	{
		return TupUtils4D.equalsAtV3(tolerance, this.v, value);
	}
}
