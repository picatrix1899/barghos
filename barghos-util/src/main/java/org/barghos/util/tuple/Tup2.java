package org.barghos.util.tuple;

import java.util.Objects;

import org.barghos.annotation.Nullable;
import org.barghos.validation.ParameterValidation;

/**
 * Basic mutable generic tuple with two components without any restrictions.
 * 
 * @param <V0> The type of the first component.
 * @param <V1> The type of the second component.
 */
public class Tup2<V0,V1> implements Tup2W<V0,V1>
{
	public V0 v0;
	public V1 v1;
	
	/**
	 * Creates a new instance with all components left as default values.
	 */
	public Tup2() {}
	
	/**
	 * Creates a new instance and adopts the component values from the given
	 * tuple {@code t}
	 * 
	 * @param t The tuple to adopt the component values from.
	 */
	public Tup2(Tup2R<V0,V1> t)
	{
		set(t);
	}
	
	/**
	 * Creates a new instance and adopts the component values from the given
	 * tuple {@code (v0, v1)}
	 * 
	 * @param v0 The value for the first component.
	 * @param v1 The value for the second component.
	 */
	public Tup2(@Nullable V0 v0, @Nullable V1 v1)
	{
		set(v0, v1);
	}
	
	/** {@inheritDoc} */
	@Override
	public V0 v0()
	{
		return this.v0;
	}

	/** {@inheritDoc} */
	@Override
	public V1 v1()
	{
		return this.v1;
	}

	/** {@inheritDoc} */
	@Override
	public Tup2<V0,V1> set(Tup2R<V0,V1> t)
	{
		ParameterValidation.pvNotNull("t", t);
		
		return set(t.v0(), t.v1());
	}
	
	/** {@inheritDoc} */
	@Override
	public Tup2<V0,V1> set(@Nullable V0 v0, @Nullable V1 v1)
	{
		v0(v0);
		v1(v1);
		
		return this;
	}
	
	/** {@inheritDoc} */
	@Override
	public Tup2<V0,V1> createNew()
	{
		return new Tup2<V0,V1>();
	}

	/** {@inheritDoc} */
	@Override
	public Tup2<V0,V1> createNew(Tup2R<V0,V1> t)
	{
		ParameterValidation.pvNotNull("t", t);
		
		return new Tup2<V0,V1>(t);
	}
	
	/** {@inheritDoc} */
	@Override
	public Tup2<V0,V1> createNew(@Nullable V0 v0, @Nullable V1 v1)
	{
		return new Tup2<V0,V1>(v0, v1);
	}

	/** {@inheritDoc} */
	@Override
	public Tup2<V0,V1> v0(@Nullable V0 v0)
	{
		this.v0 = v0;
		
		return this;
	}

	/** {@inheritDoc} */
	@Override
	public Tup2<V0,V1> v1(@Nullable V1 v1)
	{
		this.v1 = v1;
		
		return this;
	}

	/** {@inheritDoc} */
	@Override
	public Tup2<V0,V1> copy()
	{
		return new Tup2<V0,V1>(this);
	}
	
	/** {@inheritDoc}} */
	@Override
	public boolean equals(@Nullable Object other)
	{
		if(other == null) return false;
		if(other == this) return true;
		
		if(!(other instanceof Tup2R original)) return false;
		
		if(!Objects.equals(this.v0, original.v0())) return false;
		if(!Objects.equals(this.v1, original.v1())) return false;
		
		return true;
	}
	
	/** {@inheritDoc} */
	@Override
	public boolean equals(@Nullable Tup2R<V0,V1> t)
	{
		if(t == null) return false;
		if(t == this) return true;
		
		if(!Objects.equals(this.v0, t.v0())) return false;
		if(!Objects.equals(this.v1, t.v1())) return false;
		
		return true;
	}
	
	/** {@inheritDoc} */
	@Override
	public boolean equals(@Nullable V0 v0, @Nullable V1 v1)
	{
		if(!Objects.equals(this.v0, v0)) return false;
		if(!Objects.equals(this.v1, v1)) return false;
		
		return true;
	}
	
	/** {@inheritDoc} */
	@Override
	public String toString()
	{
		return "Tup2(v0=" + this.v0 + ", v1=" + this.v1 + ")";
	}
	
	/** {@inheritDoc} */
	@Override
	public int hashCode()
	{
		return Objects.hash(this.v0, this.v1);
	}

	/** {@inheritDoc} */
	@Override
	public boolean isV0Null()
	{
		return this.v0 == null;
	}

	/** {@inheritDoc} */
	@Override
	public boolean isV1Null()
	{
		return this.v1 == null;
	}
}
