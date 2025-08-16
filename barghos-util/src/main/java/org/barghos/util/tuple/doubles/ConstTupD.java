package org.barghos.util.tuple.doubles;

import java.util.Arrays;

public class ConstTupD implements ITupRD
{
	public final double[] v;
	
	public ConstTupD()
	{
		this.v = new double[0];
	}

	public ConstTupD(ITupRD t)
	{
		this.v = new double[t.size()];
		
		t.toArray(this.v);
	}
	
	public ConstTupD(double[] t)
	{
		this.v = new double[t.length];
		
		System.arraycopy(t, 0, this.v, 0, this.v.length);
	}

	@Override
	public int size()
	{
		return this.v.length;
	}

	@Override
	public double getAt(int index)
	{
		return this.v[index];
	}

	@Override
	public double[] toArray()
	{
		return Arrays.copyOf(this.v, this.v.length);
	}

	@Override
	public double[] toArray(double[] res)
	{
		System.arraycopy(this.v, 0, res, 0, this.v.length);
		
		return res;
	}

	@Override
	public boolean isFinite()
	{
		return TupUtilsD.isFinite(this.v);
	}

	@Override
	public boolean isFiniteAt(int index)
	{
		return TupUtilsD.isFiniteAt(index, this.v);
	}

	@Override
	public boolean isZero()
	{
		return TupUtilsD.isZero(this.v);
	}

	@Override
	public boolean isZero(double tolerance)
	{
		return TupUtilsD.isZero(tolerance, this.v);
	}

	@Override
	public boolean isZeroAt(int index)
	{
		return TupUtilsD.isZeroAt(index, this.v);
	}

	@Override
	public boolean isZeroAt(double tolerance, int index)
	{
		return TupUtilsD.isZeroAt(tolerance, index, this.v);
	}

	@Override
	public boolean equals(ITupRD t)
	{
		return TupUtilsD.equals(this.v, t);
	}

	@Override
	public boolean equals(double[] t)
	{
		return TupUtilsD.equals(this.v, t);
	}

	@Override
	public boolean equals(double tolerance, ITupRD t)
	{
		return TupUtilsD.equals(tolerance, this.v, t);
	}

	@Override
	public boolean equals(double tolerance, double[] t)
	{
		return TupUtilsD.equals(tolerance, this.v, t);
	}

	@Override
	public boolean equalsAt(int index, ITupRD t)
	{
		return TupUtilsD.equalsAt(index, this.v, t);
	}

	@Override
	public boolean equalsAt(int index, double[] t)
	{
		return TupUtilsD.equalsAt(index, this.v, t);
	}

	@Override
	public boolean equalsAt(int index, double value)
	{
		return TupUtilsD.equalsAt(index, this.v, value);
	}

	@Override
	public boolean equalsAt(double tolerance, int index, ITupRD t)
	{
		return TupUtilsD.equalsAt(tolerance, index, this.v, t);
	}

	@Override
	public boolean equalsAt(double tolerance, int index, double[] t)
	{
		return TupUtilsD.equalsAt(tolerance, index, this.v, t);
	}

	@Override
	public boolean equalsAt(double tolerance, int index, double value)
	{
		return TupUtilsD.equalsAt(tolerance, index, this.v, value);
	}
}
