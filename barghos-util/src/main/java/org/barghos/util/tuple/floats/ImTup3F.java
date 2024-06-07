package org.barghos.util.tuple.floats;

import java.util.Objects;

import org.barghos.annotation.MinLength;
import org.barghos.annotation.Nullable;
import org.barghos.util.math.MathUtil;

/**
 * Basic immutable float tuple with three components without any restrictions.
 */
public class ImTup3F implements Tup3RF
{
	/**
	 * This member contains the first component.
	 */
	public final float v0;
	
	/**
	 * This member contains the second component.
	 */
	public final float v1;
	
	/**
	 * This member contains the third component.
	 */
	public final float v2;
	
	/**
	 * Creates a new instance and adopts the component values from the given
	 * tuple {@code t}.
	 * 
	 * @param t The tuple to adopt the component values from.
	 */
	public ImTup3F(Tup3RF t)
	{
		this(t.v0(), t.v1(), t.v2());
	}
	
	/**
	 * Creates a new instance and adopts the component values from the given
	 * tuple {@code t}. The size of the given tuple (t) has to be a minimum of
	 * three components.
	 * 
	 * @param t The tuple to adopt the component values from.
	 */
	public ImTup3F(@MinLength(3) TupRF t)
	{
		this(t.getAt(0), t.getAt(1), t.getAt(2));
	}
	
	/**
	 * Creates a new instance and adopts the component values from the given
	 * tuple {@code t}. The size of the given tuple (t) has to be a minimum of
	 * three entries. 
	 * 
	 * @param t The tuple to adopt the component values from.
	 */
	public ImTup3F(@MinLength(3) float... t)
	{
		this(t[0], t[1], t[2]);
	}
	
	/**
	 * Creates a new instance and adopts the component values from the given
	 * tuple {@code (v0, v1, v2)}.
	 * 
	 * @param v0 The value for the first component.
	 * @param v1 The value for the second component.
	 * @param v2 The value for the third component.
	 */
	public ImTup3F(float v0, float v1, float v2)
	{
		this.v0 = v0;
		this.v1 = v1;
		this.v2 = v2;
	}
	
	/** {@inheritDoc} */
	@Override
	public boolean isFinite()
	{
		return isFiniteAtV0() && isFiniteAtV1() && isFiniteAtV2();
	}

	/** {@inheritDoc} */
	@Override
	public boolean isZero()
	{
		return isZeroAtV0() && isZeroAtV1() && isZeroAtV2();
	}

	/** {@inheritDoc} */
	@Override
	public boolean isZero(float tolerance)
	{
		return isZeroAtV0(tolerance) && isZeroAtV1(tolerance) && isZeroAtV2(tolerance);
	}

	/** {@inheritDoc} */
	@Override
	public ImTup3F createNew(Tup3RF t)
	{
		return new ImTup3F(t);
	}

	/** {@inheritDoc} */
	@Override
	public ImTup3F createNew(TupRF t)
	{
		return new ImTup3F(t);
	}

	/** {@inheritDoc} */
	@Override
	public ImTup3F createNew(float... t)
	{
		return new ImTup3F(t);
	}

	/** {@inheritDoc} */
	@Override
	public ImTup3F createNew(float value)
	{
		return new ImTup3F(value, value, value);
	}

	/** {@inheritDoc} */
	@Override
	public ImTup3F createNew(float v0, float v1, float v2)
	{
		return new ImTup3F(v0, v1, v2);
	}

	/** {@inheritDoc} */
	@Override
	public float v0()
	{
		return this.v0;
	}

	/** {@inheritDoc} */
	@Override
	public float v1()
	{
		return this.v1;
	}

	/** {@inheritDoc} */
	@Override
	public float v2()
	{
		return this.v2;
	}
	
	/** {@inheritDoc} */
	@Override
	public float getAt(int index)
	{
		switch(index)
		{
			case 0:
				return v0();
			case 1:
				return v1();
			case 2:
				return v2();
			default:
				throw new IndexOutOfBoundsException();
		}
	}

	/** {@inheritDoc} */
	@Override
	public float[] toArray()
	{
		return new float[] {this.v0, this.v1, this.v2};
	}

	/** {@inheritDoc} */
	@Override
	public float[] toArray(float[] res)
	{
		res[0] = this.v0;
		res[1] = this.v1;
		res[2] = this.v2;
		
		return res;
	}

	/** {@inheritDoc} */
	@Override
	public boolean isFiniteAt(int index)
	{
		switch(index)
		{
			case 0:
				return isFiniteAtV0();
			case 1:
				return isFiniteAtV1();
			case 2:
				return isFiniteAtV2();
			default:
				throw new IndexOutOfBoundsException();
		}
	}

	/** {@inheritDoc} */
	@Override
	public boolean isFiniteAtV0()
	{
		return Float.isFinite(this.v0);
	}

	/** {@inheritDoc} */
	@Override
	public boolean isFiniteAtV1()
	{
		return Float.isFinite(this.v1);
	}

	/** {@inheritDoc} */
	@Override
	public boolean isFiniteAtV2()
	{
		return Float.isFinite(this.v2);
	}
	
	/** {@inheritDoc} */
	@Override
	public boolean isZeroAt(int index)
	{
		switch(index)
		{
			case 0:
				return isZeroAtV0();
			case 1:
				return isZeroAtV1();
			case 2:
				return isZeroAtV2();
			default:
				throw new IndexOutOfBoundsException();
		}
	}

	/** {@inheritDoc} */
	@Override
	public boolean isZeroAt(float tolerance, int index)
	{
		switch(index)
		{
			case 0:
				return isZeroAtV0(tolerance);
			case 1:
				return isZeroAtV1(tolerance);
			case 2:
				return isZeroAtV2(tolerance);
			default:
				throw new IndexOutOfBoundsException();
		}
	}

	/** {@inheritDoc} */
	@Override
	public boolean isZeroAtV0()
	{
		return MathUtil.isZero(this.v0);
	}

	/** {@inheritDoc} */
	@Override
	public boolean isZeroAtV1()
	{
		return MathUtil.isZero(this.v1);
	}

	/** {@inheritDoc} */
	@Override
	public boolean isZeroAtV2()
	{
		return MathUtil.isZero(this.v2);
	}
	
	/** {@inheritDoc} */
	@Override
	public boolean isZeroAtV0(float tolerance)
	{
		return MathUtil.isZero(tolerance, this.v0);
	}

	/** {@inheritDoc} */
	@Override
	public boolean isZeroAtV1(float tolerance)
	{
		return MathUtil.isZero(tolerance, this.v1);
	}

	/** {@inheritDoc} */
	@Override
	public boolean isZeroAtV2(float tolerance)
	{
		return MathUtil.isZero(tolerance, this.v2);
	}
	
	/** {@inheritDoc} */
	@Override
	public ImTup3F copy()
	{
		return new ImTup3F(this);
	}

	/** {@inheritDoc} */
	@Override
	public boolean equals(Tup3RF t)
	{
		if(t == null) return false;
		if(t == this) return true;
		
		return equalsAtV0(t) && equalsAtV1(t) && equalsAtV2(t);
	}

	/** {@inheritDoc} */
	@Override
	public boolean equals(TupRF t)
	{
		if(t == null) return false;
		if(t == this) return true;
		if(t.size() != 3) return false;
		
		return equalsAtV0(t) && equalsAtV1(t) && equalsAtV2(t);
	}

	/** {@inheritDoc} */
	@Override
	public boolean equals(float... t)
	{
		if(t == null) return false;
		if(t.length != 3) return false;
		
		return equalsAtV0(t) && equalsAtV1(t) && equalsAtV2(t);
	}

	/** {@inheritDoc} */
	@Override
	public boolean equals(float v0, float v1, float v2)
	{
		return equalsAtV0(v0) && equalsAtV1(v1) && equalsAtV2(v2);
	}

	/** {@inheritDoc} */
	@Override
	public boolean equals(float tolerance, Tup3RF t)
	{
		if(t == null) return false;
		if(t == this) return true;
		
		return equalsAtV0(tolerance, t) && equalsAtV1(tolerance, t) && equalsAtV2(tolerance, t);
	}

	/** {@inheritDoc} */
	@Override
	public boolean equals(float tolerance, TupRF t)
	{
		if(t == null) return false;
		if(t == this) return true;
		if(t.size() != 3) return false;
		
		return equalsAtV0(tolerance, t) && equalsAtV1(tolerance, t) && equalsAtV2(tolerance, t);
	}

	/** {@inheritDoc} */
	@Override
	public boolean equals(float tolerance, float... t)
	{
		if(t == null) return false;
		if(t.length != 3) return false;
		
		return equalsAtV0(tolerance, t) && equalsAtV1(tolerance, t) && equalsAtV2(tolerance, t);
	}

	/** {@inheritDoc} */
	@Override
	public boolean equals(float tolerance, float v0, float v1, float v2)
	{
		return equalsAtV0(tolerance, v0) && equalsAtV1(tolerance, v1) && equalsAtV2(tolerance, v1);
	}

	/** {@inheritDoc} */
	@Override
	public boolean equalsAt(int index, Tup3RF t)
	{
		if(t == null) return false;
		if(t == this) return true;
		
		switch(index)
		{
			case 0:
				return equalsAtV0(t);
			case 1:
				return equalsAtV1(t);
			case 2:
				return equalsAtV2(t);
			default:
				throw new IndexOutOfBoundsException();
		}
	}
	
	/** {@inheritDoc} */
	@Override
	public boolean equalsAt(int index, TupRF t)
	{
		if(t == null) return false;
		if(t == this) return true;
		if(index > t.size() - 1) return false;
		
		switch(index)
		{
			case 0:
				return equalsAtV0(t);
			case 1:
				return equalsAtV1(t);
			case 2:
				return equalsAtV2(t);
			default:
				throw new IndexOutOfBoundsException();
		}
	}

	/** {@inheritDoc} */
	@Override
	public boolean equalsAt(int index, float... t)
	{
		if(t == null) return false;
		if(index > t.length - 1) return false;
		
		switch(index)
		{
			case 0:
				return equalsAtV0(t);
			case 1:
				return equalsAtV1(t);
			case 2:
				return equalsAtV2(t);
			default:
				throw new IndexOutOfBoundsException();
		}
	}

	/** {@inheritDoc} */
	@Override
	public boolean equalsAt(int index, float value)
	{
		switch(index)
		{
			case 0:
				return equalsAtV0(value);
			case 1:
				return equalsAtV1(value);
			case 2:
				return equalsAtV2(value);
			default:
				throw new IndexOutOfBoundsException();
		}
	}

	/** {@inheritDoc} */
	@Override
	public boolean equalsAt(float tolerance, int index, Tup3RF t)
	{
		if(t == null) return false;
		if(t == this) return true;
		
		switch(index)
		{
			case 0:
				return equalsAtV0(tolerance, t);
			case 1:
				return equalsAtV1(tolerance, t);
			case 2:
				return equalsAtV2(tolerance, t);
			default:
				throw new IndexOutOfBoundsException();
		}
	}
	
	/** {@inheritDoc} */
	@Override
	public boolean equalsAt(float tolerance, int index, TupRF t)
	{
		if(t == null) return false;
		if(t == this) return true;
		if(index > t.size() - 1) return false;
		
		switch(index)
		{
			case 0:
				return equalsAtV0(tolerance, t);
			case 1:
				return equalsAtV1(tolerance, t);
			case 2:
				return equalsAtV2(tolerance, t);
			default:
				throw new IndexOutOfBoundsException();
		}
	}

	/** {@inheritDoc} */
	@Override
	public boolean equalsAt(float tolerance, int index, float... t)
	{
		if(t == null) return false;
		if(index > t.length - 1) return false;
		
		switch(index)
		{
			case 0:
				return equalsAtV0(tolerance, t);
			case 1:
				return equalsAtV1(tolerance, t);
			case 2:
				return equalsAtV2(tolerance, t);
			default:
				throw new IndexOutOfBoundsException();
		}
	}

	/** {@inheritDoc} */
	@Override
	public boolean equalsAt(float tolerance, int index, float value)
	{
		switch(index)
		{
			case 0:
				return equalsAtV0(tolerance, value);
			case 1:
				return equalsAtV1(tolerance, value);
			case 2:
				return equalsAtV2(tolerance, value);
			default:
				throw new IndexOutOfBoundsException();
		}
	}

	/** {@inheritDoc} */
	@Override
	public boolean equalsAtV0(Tup3RF t)
	{
		return MathUtil.equals(this.v0, t.v0());
	}
	
	/** {@inheritDoc} */
	@Override
	public boolean equalsAtV0(TupRF t)
	{
		if(1 > t.size() - 1) return false;
		
		return MathUtil.equals(this.v0, t.getAt(0));
	}

	/** {@inheritDoc} */
	@Override
	public boolean equalsAtV0(float... t)
	{
		if(1 > t.length - 1) return false;
		
		return MathUtil.equals(this.v0, t[1]);
	}

	/** {@inheritDoc} */
	@Override
	public boolean equalsAtV0(float value)
	{
		return MathUtil.equals(this.v0, value);
	}

	/** {@inheritDoc} */
	@Override
	public boolean equalsAtV1(Tup3RF t)
	{
		return MathUtil.equals(this.v1, t.v1());
	}
	
	/** {@inheritDoc} */
	@Override
	public boolean equalsAtV1(TupRF t)
	{
		if(2 > t.size() - 1) return false;
		
		return MathUtil.equals(this.v1, t.getAt(1));
	}

	/** {@inheritDoc} */
	@Override
	public boolean equalsAtV1(float... t)
	{
		if(2 > t.length - 1) return false;
		
		return MathUtil.equals(this.v1, t[1]);
	}

	/** {@inheritDoc} */
	@Override
	public boolean equalsAtV1(float value)
	{
		return MathUtil.equals(this.v1, value);
	}

	/** {@inheritDoc} */
	@Override
	public boolean equalsAtV2(Tup3RF t)
	{
		return MathUtil.equals(this.v2, t.v2());
	}
	
	/** {@inheritDoc} */
	@Override
	public boolean equalsAtV2(TupRF t)
	{
		if(3 > t.size() - 1) return false;
		
		return MathUtil.equals(this.v2, t.getAt(2));
	}

	/** {@inheritDoc} */
	@Override
	public boolean equalsAtV2(float... t)
	{
		if(3 > t.length - 1) return false;
		
		return MathUtil.equals(this.v2, t[2]);
	}

	/** {@inheritDoc} */
	@Override
	public boolean equalsAtV2(float value)
	{
		return MathUtil.equals(this.v2, value);
	}
	
	/** {@inheritDoc} */
	@Override
	public boolean equalsAtV0(float tolerance, Tup3RF t)
	{
		return MathUtil.equals(tolerance, this.v0, t.v0());
	}

	/** {@inheritDoc} */
	@Override
	public boolean equalsAtV0(float tolerance, TupRF t)
	{
		if(1 > t.size() - 1) return false;
		
		return MathUtil.equals(tolerance, this.v0, t.getAt(0));
	}

	/** {@inheritDoc} */
	@Override
	public boolean equalsAtV0(float tolerance, float... t)
	{
		if(1 > t.length - 1) return false;
		
		return MathUtil.equals(tolerance, this.v0, t[0]);
	}

	/** {@inheritDoc} */
	@Override
	public boolean equalsAtV0(float tolerance, float value)
	{
		return MathUtil.equals(tolerance, this.v0, value);
	}

	/** {@inheritDoc} */
	@Override
	public boolean equalsAtV1(float tolerance, Tup3RF t)
	{
		return MathUtil.equals(tolerance, this.v1, t.v1());
	}

	/** {@inheritDoc} */
	@Override
	public boolean equalsAtV1(float tolerance, TupRF t)
	{
		if(2 > t.size() - 1) return false;
		
		return MathUtil.equals(tolerance, this.v1, t.getAt(1));
	}

	/** {@inheritDoc} */
	@Override
	public boolean equalsAtV1(float tolerance, float... t)
	{
		if(2 > t.length - 1) return false;
		
		return MathUtil.equals(tolerance, this.v1, t[1]);
	}

	/** {@inheritDoc} */
	@Override
	public boolean equalsAtV1(float tolerance, float value)
	{
		return MathUtil.equals(tolerance, this.v1, value);
	}

	/** {@inheritDoc} */
	@Override
	public boolean equalsAtV2(float tolerance, Tup3RF t)
	{
		return MathUtil.equals(tolerance, this.v2, t.v2());
	}

	/** {@inheritDoc} */
	@Override
	public boolean equalsAtV2(float tolerance, TupRF t)
	{
		if(3 > t.size() - 1) return false;
		
		return MathUtil.equals(tolerance, this.v2, t.getAt(2));
	}

	/** {@inheritDoc} */
	@Override
	public boolean equalsAtV2(float tolerance, float... t)
	{
		if(3 > t.length - 1) return false;
		
		return MathUtil.equals(tolerance, this.v2, t[2]);
	}

	/** {@inheritDoc} */
	@Override
	public boolean equalsAtV2(float tolerance, float value)
	{
		return MathUtil.equals(tolerance, this.v2, value);
	}
	
	/** {@inheritDoc} */
	@Override
	public ImTup3F arrangeN(int... indices)
	{
		return createNew(getAt(indices[0]), getAt(indices[1]), getAt(indices[2]));
	}

	/** {@inheritDoc} */
	@Override
	public ImTup3F arrangeN(int i0, int i1, int i2)
	{
		return createNew(getAt(i0), getAt(i1), getAt(i2));
	}

	/** {@inheritDoc} */
	@Override
	public ImTup3F swizzleN(int indexA, int indexB)
	{
		return createNew(getAt(indexB), getAt(indexA));
	}

	/** {@inheritDoc} */
	@Override
	public ImTup3F swizzleV0V1N()
	{
		return createNew(this.v1, this.v0);
	}

	/** {@inheritDoc} */
	@Override
	public ImTup3F swizzleV0V2N()
	{
		return createNew(this.v2, this.v0);
	}
	
	/** {@inheritDoc} */
	@Override
	public ImTup3F swizzleV1V2N()
	{
		return createNew(this.v2, this.v1);
	}
	
	/** {@inheritDoc} */
	@Override
	public int compareAt(int index, Tup3RF t)
	{
		switch(index)
		{
			case 0:
				return compareAtV0(t);
			case 1:
				return compareAtV1(t);
			case 2:
				return compareAtV2(t);
			default:
				throw new IndexOutOfBoundsException();
		}
	}
	
	/** {@inheritDoc} */
	@Override
	public int compareAt(int index, TupRF t)
	{
		switch(index)
		{
			case 0:
				return compareAtV0(t);
			case 1:
				return compareAtV1(t);
			case 2:
				return compareAtV2(t);
			default:
				throw new IndexOutOfBoundsException();
		}
	}

	/** {@inheritDoc} */
	@Override
	public int compareAt(int index, float... t)
	{
		switch(index)
		{
			case 0:
				return compareAtV0(t);
			case 1:
				return compareAtV1(t);
			case 2:
				return compareAtV2(t);
			default:
				throw new IndexOutOfBoundsException();
		}
	}

	/** {@inheritDoc} */
	@Override
	public int compareAt(int index, float value)
	{
		switch(index)
		{
			case 0:
				return compareAtV0(value);
			case 1:
				return compareAtV1(value);
			case 2:
				return compareAtV2(value);
			default:
				throw new IndexOutOfBoundsException();
		}
	}

	/** {@inheritDoc} */
	@Override
	public int compareAt(float tolerance, int index, Tup3RF t)
	{
		switch(index)
		{
			case 0:
				return compareAtV0(tolerance, t);
			case 1:
				return compareAtV1(tolerance, t);
			case 2:
				return compareAtV2(tolerance, t);
			default:
				throw new IndexOutOfBoundsException();
		}
	}
	
	/** {@inheritDoc} */
	@Override
	public int compareAt(float tolerance, int index, TupRF t)
	{
		switch(index)
		{
			case 0:
				return compareAtV0(tolerance, t);
			case 1:
				return compareAtV1(tolerance, t);
			case 2:
				return compareAtV2(tolerance, t);
			default:
				throw new IndexOutOfBoundsException();
		}
	}

	/** {@inheritDoc} */
	@Override
	public int compareAt(float tolerance, int index, float... t)
	{
		switch(index)
		{
			case 0:
				return compareAtV0(tolerance, t);
			case 1:
				return compareAtV1(tolerance, t);
			case 2:
				return compareAtV2(tolerance, t);
			default:
				throw new IndexOutOfBoundsException();
		}
	}

	/** {@inheritDoc} */
	@Override
	public int compareAt(float tolerance, int index, float value)
	{
		switch(index)
		{
			case 0:
				return compareAtV0(tolerance, value);
			case 1:
				return compareAtV1(tolerance, value);
			case 2:
				return compareAtV2(tolerance, value);
			default:
				throw new IndexOutOfBoundsException();
		}
	}

	/** {@inheritDoc} */
	@Override
	public int compareAtV0(Tup3RF t)
	{
		return MathUtil.compare(this.v0, t.v0());
	}

	/** {@inheritDoc} */
	@Override
	public int compareAtV0(TupRF t)
	{
		return MathUtil.compare(this.v0, t.getAt(0));
	}

	/** {@inheritDoc} */
	@Override
	public int compareAtV0(float... t)
	{
		return MathUtil.compare(this.v0, t[0]);
	}

	/** {@inheritDoc} */
	@Override
	public int compareAtV0(float value)
	{
		return MathUtil.compare(this.v0, value);
	}

	/** {@inheritDoc} */
	@Override
	public int compareAtV1(Tup3RF t)
	{
		return MathUtil.compare(this.v1, t.v1());
	}

	/** {@inheritDoc} */
	@Override
	public int compareAtV1(TupRF t)
	{
		return MathUtil.compare(this.v1, t.getAt(1));
	}
	
	/** {@inheritDoc} */
	@Override
	public int compareAtV1(float... t)
	{
		return MathUtil.compare(this.v1, t[1]);
	}

	/** {@inheritDoc} */
	@Override
	public int compareAtV1(float value)
	{
		return MathUtil.compare(this.v1, value);
	}

	/** {@inheritDoc} */
	@Override
	public int compareAtV2(Tup3RF t)
	{
		return MathUtil.compare(this.v2, t.v2());
	}

	/** {@inheritDoc} */
	@Override
	public int compareAtV2(TupRF t)
	{
		return MathUtil.compare(this.v2, t.getAt(2));
	}
	
	/** {@inheritDoc} */
	@Override
	public int compareAtV2(float... t)
	{
		return MathUtil.compare(this.v2, t[2]);
	}

	/** {@inheritDoc} */
	@Override
	public int compareAtV2(float value)
	{
		return MathUtil.compare(this.v2, value);
	}
	
	/** {@inheritDoc} */
	@Override
	public int compareAtV0(float tolerance, Tup3RF t)
	{
		return MathUtil.compare(tolerance, this.v0, t.v0());
	}

	/** {@inheritDoc} */
	@Override
	public int compareAtV0(float tolerance, TupRF t)
	{
		return MathUtil.compare(tolerance, this.v0, t.getAt(0));
	}

	/** {@inheritDoc} */
	@Override
	public int compareAtV0(float tolerance, float... t)
	{
		return MathUtil.compare(tolerance, this.v0, t[0]);
	}

	/** {@inheritDoc} */
	@Override
	public int compareAtV0(float tolerance, float value)
	{
		return MathUtil.compare(tolerance, this.v0, value);
	}

	/** {@inheritDoc} */
	@Override
	public int compareAtV1(float tolerance, Tup3RF t)
	{
		return MathUtil.compare(tolerance, this.v1, t.v1());
	}

	/** {@inheritDoc} */
	@Override
	public int compareAtV1(float tolerance, TupRF t)
	{
		return MathUtil.compare(tolerance, this.v1, t.getAt(1));
	}

	/** {@inheritDoc} */
	@Override
	public int compareAtV1(float tolerance, float... t)
	{
		return MathUtil.compare(tolerance, this.v1, t[1]);
	}

	/** {@inheritDoc} */
	@Override
	public int compareAtV1(float tolerance, float value)
	{
		return MathUtil.compare(tolerance, this.v1, value);
	}

	/** {@inheritDoc} */
	@Override
	public int compareAtV2(float tolerance, Tup3RF t)
	{
		return MathUtil.compare(tolerance, this.v2, t.v2());
	}

	/** {@inheritDoc} */
	@Override
	public int compareAtV2(float tolerance, TupRF t)
	{
		return MathUtil.compare(tolerance, this.v2, t.getAt(2));
	}

	/** {@inheritDoc} */
	@Override
	public int compareAtV2(float tolerance, float... t)
	{
		return MathUtil.compare(tolerance, this.v2, t[2]);
	}

	/** {@inheritDoc} */
	@Override
	public int compareAtV2(float tolerance, float value)
	{
		return MathUtil.compare(tolerance, this.v2, value);
	}
	
	/** {@inheritDoc} */
	@Override
	public boolean equals(@Nullable Object other)
	{
		if(other == null) return false;
		if(other == this) return true;
		
		if(!(other instanceof Tup3RF original)) return false;
		
		if(this.v0 != original.v0()) return false;
		if(this.v1 != original.v1()) return false;
		if(this.v2 != original.v2()) return false;
		
		return true;
	}
	
	/** {@inheritDoc} */
	@Override
	public String toString()
	{
		return "ImTup3F(v0=" + this.v0 + ", v1=" + this.v1 + ", v2=" + this.v2 + ")";
	}
	
	/** {@inheritDoc} */
	@Override
	public int hashCode()
	{
		return Objects.hash(this.v0, this.v1, this.v2);
	}
}
