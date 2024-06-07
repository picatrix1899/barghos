package org.barghos.util.tuple.floats;

import java.util.Objects;

import org.barghos.annotation.MinLength;
import org.barghos.annotation.Nullable;
import org.barghos.util.math.MathUtil;

/**
 * Basic float tuple with two components without any restrictions.
 */
public class Tup2F implements Tup2WF
{
	/**
	 * This member contains the first component.
	 */
	public float v0;
	
	/**
	 * This member contains the second component.
	 */
	public float v1;
	
	/**
	 * Creates a new instance with the components set to 0.0f.
	 * 
	 * @param t The tuple to adopt the component values from.
	 */
	public Tup2F() { }
	
	/**
	 * Creates a new instance and adopts the component values from the given
	 * tuple {@code t}.
	 * 
	 * @param t The tuple to adopt the component values from.
	 */
	public Tup2F(Tup2RF t)
	{
		this(t.v0(), t.v1());
	}
	
	/**
	 * Creates a new instance and adopts the component values from the given
	 * tuple {@code t}. The size of the given tuple (t) has to be a minimum of
	 * two components.
	 * 
	 * @param t The tuple to adopt the component values from.
	 */
	public Tup2F(@MinLength(2) TupRF t)
	{
		this(t.getAt(0), t.getAt(1));
	}
	
	/**
	 * Creates a new instance and adopts the component values from the given
	 * tuple {@code t}. The size of the given tuple (t) has to be a minimum of
	 * two entries. 
	 * 
	 * @param t The tuple to adopt the component values from.
	 */
	public Tup2F(@MinLength(2) float... t)
	{
		this(t[0], t[1]);
	}
	
	/**
	 * Creates a new instance and adopts the component values from the given
	 * tuple {@code (v0, v1)}.
	 * 
	 * @param v0 The value for the first component.
	 * @param v1 The value for the second component.
	 */
	public Tup2F(float v0, float v1)
	{
		this.v0 = v0;
		this.v1 = v1;
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
	public Tup2F createNew()
	{
		return new Tup2F();
	}
	
	/** {@inheritDoc} */
	@Override
	public Tup2F createNew(Tup2RF t)
	{
		return new Tup2F(t);
	}

	/** {@inheritDoc} */
	@Override
	public Tup2F createNew(@MinLength(2) TupRF t)
	{
		return new Tup2F(t);
	}

	/** {@inheritDoc} */
	@Override
	public Tup2F createNew(@MinLength(2) float... t)
	{
		return new Tup2F(t);
	}

	/** {@inheritDoc} */
	@Override
	public Tup2F createNew(float value)
	{
		return new Tup2F(value, value);
	}

	/** {@inheritDoc} */
	@Override
	public Tup2F createNew(float v0, float v1)
	{
		return new Tup2F(v0, v1);
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
	public float getAt(int index)
	{
		switch(index)
		{
			case 0:
				return v0();
			case 1:
				return v1();
			default:
				throw new IndexOutOfBoundsException();
		}
	}

	/** {@inheritDoc} */
	@Override
	public Tup2F v0(float v0)
	{
		this.v0 = v0;
		
		return this;
	}

	/** {@inheritDoc} */
	@Override
	public Tup2F v1(float v1)
	{
		this.v1 = v1;
		
		return this;
	}

	/** {@inheritDoc} */
	@Override
	public Tup2F setAt(int index, float value)
	{
		switch(index)
		{
			case 0:
				return v0(value);
			case 1:
				return v1(value);
			default:
				throw new IndexOutOfBoundsException();
		}
	}

	/** {@inheritDoc} */
	@Override
	public Tup2F set(Tup2RF t)
	{
		v0(t.v0());
		v1(t.v1());
		
		return this;
	}

	/** {@inheritDoc} */
	@Override
	public Tup2F set(TupRF t)
	{
		v0(t.getAt(0));
		v1(t.getAt(1));
		
		return this;
	}

	/** {@inheritDoc} */
	@Override
	public Tup2F set(float... t)
	{
		v0(t[0]);
		v1(t[1]);
		
		return this;
	}

	/** {@inheritDoc} */
	@Override
	public Tup2F set(float value)
	{
		v0(value);
		v1(value);
		
		return this;
	}

	/** {@inheritDoc} */
	@Override
	public Tup2F set(float v0, float v1)
	{
		v0(v0);
		v1(v1);
		
		return this;
	}
	
	/** {@inheritDoc} */
	@Override
	public float[] toArray()
	{
		return new float[] {this.v0, this.v1};
	}

	/** {@inheritDoc} */
	@Override
	public float[] toArray(@MinLength(2) float[] res)
	{
		res[0] = this.v0;
		res[1] = this.v1;
		
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
	public boolean isZeroAt(int index)
	{
		switch(index)
		{
			case 0:
				return isZeroAtV0();
			case 1:
				return isZeroAtV1();
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
	public Tup2F copy()
	{
		return new Tup2F(this);
	}

	/** {@inheritDoc} */
	@Override
	public boolean equals(Tup2RF t)
	{
		if(t == null) return false;
		if(t == this) return true;
		
		return equalsAtV0(t) && equalsAtV1(t);
	}

	/** {@inheritDoc} */
	@Override
	public boolean equals(TupRF t)
	{
		if(t == null) return false;
		if(t == this) return true;
		if(t.size() != 2) return false;
		
		return equalsAtV0(t) && equalsAtV1(t);
	}

	/** {@inheritDoc} */
	@Override
	public boolean equals(float... t)
	{
		if(t == null) return false;
		if(t.length != 2) return false;
		
		return equalsAtV0(t) && equalsAtV1(t);
	}

	/** {@inheritDoc} */
	@Override
	public boolean equals(float v0, float v1)
	{
		return equalsAtV0(v0) && equalsAtV1(v1);
	}

	/** {@inheritDoc} */
	@Override
	public boolean equals(float tolerance, Tup2RF t)
	{
		if(t == null) return false;
		if(t == this) return true;
		
		return equalsAtV0(tolerance, t) && equalsAtV1(tolerance, t);
	}

	/** {@inheritDoc} */
	@Override
	public boolean equals(float tolerance, TupRF t)
	{
		if(t == null) return false;
		if(t == this) return true;
		if(t.size() != 2) return false;
		
		return equalsAtV0(tolerance, t) && equalsAtV1(tolerance, t);
	}

	/** {@inheritDoc} */
	@Override
	public boolean equals(float tolerance, float... t)
	{
		if(t == null) return false;
		if(t.length != 2) return false;
		
		return equalsAtV0(tolerance, t) && equalsAtV1(tolerance, t);
	}

	/** {@inheritDoc} */
	@Override
	public boolean equals(float tolerance, float v0, float v1)
	{
		return equalsAtV0(tolerance, v0) && equalsAtV1(tolerance, v1);
	}

	/** {@inheritDoc} */
	@Override
	public boolean equalsAt(int index, Tup2RF t)
	{
		if(t == null) return false;
		if(t == this) return true;
		
		switch(index)
		{
			case 0:
				return equalsAtV0(t);
			case 1:
				return equalsAtV1(t);
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
			default:
				throw new IndexOutOfBoundsException();
		}
	}

	/** {@inheritDoc} */
	@Override
	public boolean equalsAt(float tolerance, int index, Tup2RF t)
	{
		if(t == null) return false;
		if(t == this) return true;
		
		switch(index)
		{
			case 0:
				return equalsAtV0(tolerance, t);
			case 1:
				return equalsAtV1(tolerance, t);
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
			default:
				throw new IndexOutOfBoundsException();
		}
	}

	/** {@inheritDoc} */
	@Override
	public boolean equalsAtV0(Tup2RF t)
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
		
		return MathUtil.equals(this.v0, t[0]);
	}

	/** {@inheritDoc} */
	@Override
	public boolean equalsAtV0(float value)
	{
		return MathUtil.equals(this.v0, value);
	}

	/** {@inheritDoc} */
	@Override
	public boolean equalsAtV1(Tup2RF t)
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
	public boolean equalsAtV0(float tolerance, Tup2RF t)
	{
		return MathUtil.equals(this.v0, t.v0());
	}

	/** {@inheritDoc} */
	@Override
	public boolean equalsAtV0(float tolerance, TupRF t)
	{
		if(1 > t.size() - 1) return false;
		
		return MathUtil.equals(this.v0, t.getAt(0));
	}

	/** {@inheritDoc} */
	@Override
	public boolean equalsAtV0(float tolerance, float... t)
	{
		if(1 > t.length - 1) return false;
		
		return MathUtil.equals(this.v0, t[0]);
	}

	/** {@inheritDoc} */
	@Override
	public boolean equalsAtV0(float tolerance, float value)
	{
		return MathUtil.equals(this.v0, value);
	}

	/** {@inheritDoc} */
	@Override
	public boolean equalsAtV1(float tolerance, Tup2RF t)
	{
		return MathUtil.equals(this.v1, t.v1());
	}

	/** {@inheritDoc} */
	@Override
	public boolean equalsAtV1(float tolerance, TupRF t)
	{
		if(2 > t.size() - 1) return false;
		
		return MathUtil.equals(this.v1, t.getAt(1));
	}

	/** {@inheritDoc} */
	@Override
	public boolean equalsAtV1(float tolerance, float... t)
	{
		if(2 > t.length - 1) return false;
		
		return MathUtil.equals(this.v1, t[1]);
	}

	/** {@inheritDoc} */
	@Override
	public boolean equalsAtV1(float tolerance, float value)
	{
		return MathUtil.equals(this.v1, value);
	}

	/** {@inheritDoc} */
	@Override
	public Tup2F arrangeN(int... indices)
	{
		return createNew(getAt(indices[0]), getAt(indices[1]));
	}

	/** {@inheritDoc} */
	@Override
	public Tup2F arrangeN(int i0, int i1)
	{
		return createNew(getAt(i0), getAt(i1));
	}

	/** {@inheritDoc} */
	@Override
	public Tup2F swizzleN(int indexA, int indexB)
	{
		return createNew(getAt(indexB), getAt(indexA));
	}

	/** {@inheritDoc} */
	@Override
	public Tup2F swizzleV0V1N()
	{
		return createNew(this.v1, this.v0);
	}

	/** {@inheritDoc} */
	@Override
	public int compareAt(int index, Tup2RF t)
	{
		switch(index)
		{
			case 0:
				return compareAtV0(t);
			case 1:
				return compareAtV1(t);
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
			default:
				throw new IndexOutOfBoundsException();
		}
	}

	/** {@inheritDoc} */
	@Override
	public int compareAt(float tolerance, int index, Tup2RF t)
	{
		switch(index)
		{
			case 0:
				return compareAtV0(tolerance, t);
			case 1:
				return compareAtV1(tolerance, t);
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
			default:
				throw new IndexOutOfBoundsException();
		}
	}

	/** {@inheritDoc} */
	@Override
	public int compareAtV0(Tup2RF t)
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
	public int compareAtV1(Tup2RF t)
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
	public int compareAtV0(float tolerance, Tup2RF t)
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
	public int compareAtV1(float tolerance, Tup2RF t)
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
		return MathUtil.compare(tolerance, this.v1, t[2]);
	}

	/** {@inheritDoc} */
	@Override
	public int compareAtV1(float tolerance, float value)
	{
		return MathUtil.compare(tolerance, this.v1, value);
	}

	/** {@inheritDoc} */
	@Override
	public boolean equals(@Nullable Object other)
	{
		if(other == null) return false;
		if(other == this) return true;
		
		if(!(other instanceof Tup2RF original)) return false;
		
		if(this.v0 != original.v0()) return false;
		if(this.v1 != original.v1()) return false;
		
		return true;
	}
	
	/** {@inheritDoc} */
	@Override
	public String toString()
	{
		return "ImTup2F(v0=" + this.v0 + ", v1=" + this.v1 + ")";
	}
	
	/** {@inheritDoc} */
	@Override
	public int hashCode()
	{
		return Objects.hash(this.v0, this.v1);
	}

	/** {@inheritDoc} */
	@Override
	public Tup2F arrange(int... indices)
	{
		set(getAt(indices[0]), getAt(indices[1]));
		
		return this;
	}

	/** {@inheritDoc} */
	@Override
	public Tup2F arrange(int iV0, int iV1)
	{
		set(getAt(iV0), getAt(iV1));
		
		return this;
	}

	/** {@inheritDoc} */
	@Override
	public Tup2F swizzle(int indexA, int indexB)
	{
		set(getAt(indexA), getAt(indexB));
		
		return this;
	}

	/** {@inheritDoc} */
	@Override
	public Tup2F swizzleV0V1()
	{
		set(v1(), v0());
		
		return this;
	}
}
