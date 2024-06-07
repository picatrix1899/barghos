package org.barghos.util.tuple;

import java.util.Objects;

import org.barghos.annotation.Nullable;
import org.barghos.validation.ParameterValidation;

/**
 * Basic mutable generic tuple with three components without any restrictions.
 * 
 * @param <V0> The type of the first component.
 * @param <V1> The type of the second component.
 * @param <V2> The type of the third component.
 */
public class Tup3<V0,V1,V2> implements Tup3W<V0,V1,V2>
{
	public V0 v0;
	public V1 v1;
	public V2 v2;
	
	/**
	 * Creates a new instance with all components left as default values.
	 */
	public Tup3() {}
	
	/**
	 * Creates a new instance and adopts the component values from the given
	 * tuple {@code t}
	 * 
	 * @param t The tuple to adopt the component values from.
	 */
	public Tup3(Tup3R<V0,V1,V2> t)
	{
		set(t);
	}
	
	/**
	 * Creates a new instance and adopts the component values from the given
	 * tuple {@code (v0, v1, v2)}
	 * 
	 * @param v0 The value for the first component.
	 * @param v1 The value for the second component.
	 * @param v2 The value for the third component.
	 */
	public Tup3(@Nullable V0 v0, @Nullable V1 v1, @Nullable V2 v2)
	{
		set(v0, v1, v2);
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
	public V2 v2()
	{
		return this.v2;
	}
	
	/** {@inheritDoc} */
	@Override
	public Tup3<V0,V1,V2> set(Tup3R<V0,V1,V2> t)
	{
		ParameterValidation.pvNotNull("t", t);
		
		return set(t.v0(), t.v1(), t.v2());
	}
	
	/** {@inheritDoc} */
	@Override
	public Tup3<V0,V1,V2> set(@Nullable V0 v0, @Nullable V1 v1, @Nullable V2 v2)
	{
		v0(v0);
		v1(v1);
		v2(v2);
		
		return this;
	}
	
	/** {@inheritDoc} */
	@Override
	public Tup3<V0,V1,V2> createNew()
	{
		return new Tup3<V0,V1,V2>();
	}

	/** {@inheritDoc} */
	@Override
	public Tup3<V0,V1,V2> createNew(Tup3R<V0,V1,V2> t)
	{
		ParameterValidation.pvNotNull("t", t);
		
		return new Tup3<V0,V1,V2>(t);
	}
	
	/** {@inheritDoc} */
	@Override
	public Tup3<V0,V1,V2> createNew(@Nullable V0 v0, @Nullable V1 v1, @Nullable V2 v2)
	{
		return new Tup3<V0,V1,V2>(v0, v1, v2);
	}

	/** {@inheritDoc} */
	@Override
	public Tup3<V0,V1,V2> v0(@Nullable V0 v0)
	{
		this.v0 = v0;
		
		return this;
	}

	/** {@inheritDoc} */
	@Override
	public Tup3<V0,V1,V2> v1(@Nullable V1 v1)
	{
		this.v1 = v1;
		
		return this;
	}

	/** {@inheritDoc} */
	@Override
	public Tup3<V0,V1,V2> v2(@Nullable V2 v2)
	{
		this.v2 = v2;
		
		return this;
	}
	
	/** {@inheritDoc} */
	@Override
	public Tup3<V0,V1,V2> copy()
	{
		return new Tup3<V0,V1,V2>(this);
	}
	
	/** {@inheritDoc} */
	@Override
	public boolean equals(@Nullable Object other)
	{
		if(other == null) return false;
		if(other == this) return true;
		
		if(!(other instanceof Tup3R original)) return false;
		
		if(!Objects.equals(this.v0, original.v0())) return false;
		if(!Objects.equals(this.v1, original.v1())) return false;
		if(!Objects.equals(this.v2, original.v2())) return false;
		
		return true;
	}
	
	/** {@inheritDoc} */
	@Override
	public boolean equals(@Nullable Tup3R<V0,V1,V2> t)
	{
		if(t == null) return false;
		if(t == this) return true;
		
		if(!Objects.equals(this.v0, t.v0())) return false;
		if(!Objects.equals(this.v1, t.v1())) return false;
		if(!Objects.equals(this.v2, t.v2())) return false;
		
		return true;
	}
	
	/** {@inheritDoc} */
	@Override
	public boolean equals(@Nullable V0 v0, @Nullable V1 v1, @Nullable V2 v2)
	{
		if(!Objects.equals(this.v0, v0)) return false;
		if(!Objects.equals(this.v1, v1)) return false;
		if(!Objects.equals(this.v2, v2)) return false;
		
		return true;
	}
	
	/** {@inheritDoc} */
	@Override
	public String toString()
	{
		return "Tup3(v0=" + this.v0 + ", v1=" + this.v1 + ", v2=" + this.v2 + ")";
	}
	
	/** {@inheritDoc} */
	@Override
	public int hashCode()
	{
		return Objects.hash(this.v0, this.v1, this.v2);
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

	/** {@inheritDoc} */
	@Override
	public boolean isV2Null()
	{
		return this.v2 == null;
	}
}
