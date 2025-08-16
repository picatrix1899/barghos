package org.barghos.util.tuple.doubles;

import java.util.Arrays;
import java.util.Objects;

public class ConstTup2D implements ITup2RD
{
	private final double[] v = new double[2];
	
	public ConstTup2D()
	{
		this.v[0] = 0.0f;
		this.v[1] = 0.0f;
	}
	
	public ConstTup2D(ITup2RD t)
	{
		t.toArray(this.v);
	}
	
	public ConstTup2D(ITupRD t)
	{
		t.toArray(this.v);
	}
	
	public ConstTup2D(double[] t)
	{
		System.arraycopy(t, 0, this.v, 0, 2);
	}
	
	public ConstTup2D(double v0, double v1)
	{
		this.v[0] = v0;
		this.v[1] = v1;
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
	public double getAt(int index)
	{
		return this.v[index];
	}
	
	@Override
	public double[] toArray()
	{
		return Arrays.copyOf(this.v, 2);
	}

	@Override
	public double[] toArray(double[] res)
	{
		System.arraycopy(this.v, 0, res, 0, 2);
		
		return res;
	}
	
	@Override
	public String toString()
	{
		return "constTup2d(" + this.v[0] + ", " + this.v[1] + ")";
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
		
		if(obj instanceof ITup2RD t)
		{
			return equals(t);
		}
		
		return false;
	}
	
	@Override
	public boolean isFinite()
	{
		return TupUtils2D.isFinite(this.v);
	}
	
	@Override
	public boolean isFiniteAt(int index)
	{
		return TupUtils2D.isFiniteAt(index, this.v);
	}

	@Override
	public boolean isFiniteAtV0()
	{
		return TupUtils2D.isFiniteAtV0(this.v);
	}

	@Override
	public boolean isFiniteAtV1()
	{
		return TupUtils2D.isFiniteAtV1(this.v);
	}

	@Override
	public boolean isZero()
	{
		return TupUtils2D.isZero(this.v);
	}
	
	@Override
	public boolean isZeroAt(int index)
	{
		return TupUtils2D.isZeroAt(index, this.v);
	}
	
	@Override
	public boolean isZeroAtV0()
	{
		return TupUtils2D.isZeroAtV0(this.v);
	}

	@Override
	public boolean isZeroAtV1()
	{
		return TupUtils2D.isZeroAtV1(this.v);
	}

	@Override
	public boolean isZero(double tolerance)
	{
		return TupUtils2D.isZero(tolerance, this.v);
	}
	
	@Override
	public boolean isZeroAt(double tolerance, int index)
	{
		return TupUtils2D.isZeroAt(tolerance, index, this.v);
	}
	
	@Override
	public boolean isZeroAtV0(double tolerance)
	{
		return TupUtils2D.isZeroAtV0(tolerance, this.v);
	}

	@Override
	public boolean isZeroAtV1(double tolerance)
	{
		return TupUtils2D.isZeroAtV1(tolerance, this.v);
	}

	@Override
	public boolean equals(ITup2RD t)
	{
		return TupUtils2D.equals(this.v, t);
	}

	@Override
	public boolean equals(ITupRD t)
	{
		return TupUtils2D.equals(this.v, t);
	}

	@Override
	public boolean equals(double[] t)
	{
		return TupUtils2D.equals(this.v, t);
	}

	@Override
	public boolean equals(double v0, double v1)
	{
		return TupUtils2D.equals(this.v, v0, v1);
	}

	@Override
	public boolean equals(double tolerance, ITup2RD t)
	{
		return TupUtils2D.equals(tolerance, this.v, t);
	}

	@Override
	public boolean equals(double tolerance, ITupRD t)
	{
		return TupUtils2D.equals(tolerance, this.v, t);
	}

	@Override
	public boolean equals(double tolerance, double[] t)
	{
		return TupUtils2D.equals(tolerance, this.v, t);
	}

	@Override
	public boolean equals(double tolerance, double v0, double v1)
	{
		return TupUtils2D.equals(tolerance, this.v, v0, v1);
	}

	@Override
	public boolean equalsAt(int index, ITup2RD t)
	{
		return TupUtils2D.equalsAt(index, this.v, t);
	}

	@Override
	public boolean equalsAt(int index, ITupRD t)
	{
		return TupUtils2D.equalsAt(index, this.v, t);
	}

	@Override
	public boolean equalsAt(int index, double[] t)
	{
		return TupUtils2D.equalsAt(index, this.v, t);
	}

	@Override
	public boolean equalsAt(int index, double value)
	{
		return TupUtils2D.equalsAt(index, this.v, value);
	}

	@Override
	public boolean equalsAt(double tolerance, int index, ITup2RD t)
	{
		return TupUtils2D.equalsAt(tolerance, index, this.v, t);
	}

	@Override
	public boolean equalsAt(double tolerance, int index, ITupRD t)
	{
		return TupUtils2D.equalsAt(tolerance, index, this.v, t);
	}

	@Override
	public boolean equalsAt(double tolerance, int index, double[] t)
	{
		return TupUtils2D.equalsAt(tolerance, index, this.v, t);
	}

	@Override
	public boolean equalsAt(double tolerance, int index, double value)
	{
		return TupUtils2D.equalsAt(tolerance, index, this.v, value);
	}

	@Override
	public boolean equalsAtV0(ITup2RD t)
	{
		return TupUtils2D.equalsAtV0(this.v, t);
	}

	@Override
	public boolean equalsAtV0(ITupRD t)
	{
		return TupUtils2D.equalsAtV0(this.v, t);
	}

	@Override
	public boolean equalsAtV0(double[] t)
	{
		return TupUtils2D.equalsAtV0(this.v, t);
	}

	@Override
	public boolean equalsAtV0(double value)
	{
		return TupUtils2D.equalsAtV0(this.v, value);
	}

	@Override
	public boolean equalsAtV1(ITup2RD t)
	{
		return TupUtils2D.equalsAtV1(this.v, t);
	}

	@Override
	public boolean equalsAtV1(ITupRD t)
	{
		return TupUtils2D.equalsAtV1(this.v, t);
	}

	@Override
	public boolean equalsAtV1(double[] t)
	{
		return TupUtils2D.equalsAtV1(this.v, t);
	}

	@Override
	public boolean equalsAtV1(double value)
	{
		return TupUtils2D.equalsAtV1(this.v, value);
	}

	@Override
	public boolean equalsAtV0(double tolerance, ITup2RD t)
	{
		return TupUtils2D.equalsAtV0(tolerance, this.v, t);
	}

	@Override
	public boolean equalsAtV0(double tolerance, ITupRD t)
	{
		return TupUtils2D.equalsAtV0(tolerance, this.v, t);
	}

	@Override
	public boolean equalsAtV0(double tolerance, double[] t)
	{
		return TupUtils2D.equalsAtV0(tolerance, this.v, t);
	}

	@Override
	public boolean equalsAtV0(double tolerance, double value)
	{
		return TupUtils2D.equalsAtV0(tolerance, this.v, value);
	}

	@Override
	public boolean equalsAtV1(double tolerance, ITup2RD t)
	{
		return TupUtils2D.equalsAtV1(tolerance, this.v, t);
	}

	@Override
	public boolean equalsAtV1(double tolerance, ITupRD t)
	{
		return TupUtils2D.equalsAtV1(tolerance, this.v, t);
	}

	@Override
	public boolean equalsAtV1(double tolerance, double[] t)
	{
		return TupUtils2D.equalsAtV1(tolerance, this.v, t);
	}

	@Override
	public boolean equalsAtV1(double tolerance, double value)
	{
		return TupUtils2D.equalsAtV1(tolerance, this.v, value);
	}

}
