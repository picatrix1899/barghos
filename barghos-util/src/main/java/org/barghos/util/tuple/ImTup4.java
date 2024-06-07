package org.barghos.util.tuple;

import java.util.Objects;

import org.barghos.annotation.Nullable;

/**
 * Basic immutable generic tuple with four components without any restrictions.
 * 
 * @param <V0> The type of the first component.
 * @param <V1> The type of the second component.
 * @param <V2> The type of the third component.
 * @param <V3> The type of the fourth component.
 */
public class ImTup4<V0,V1,V2,V3> implements Tup4R<V0,V1,V2,V3>
{
	public final V0 v0;
	public final V1 v1;
	public final V2 v2;
	public final V3 v3;
	
	/**
	 * Creates a new instance and adopts the component values from the given
	 * tuple {@code t}
	 * 
	 * @param t The tuple to adopt the component values from.
	 */
	public ImTup4(Tup4R<V0,V1,V2,V3> t)
	{
		this(t.v0(), t.v1(), t.v2(), t.v3());
	}
	
	/**
	 * Creates a new instance and adopts the component values from the given
	 * tuple {@code (v0, v1, v2, v3)}
	 * 
	 * @param v0 The value for the first component.
	 * @param v1 The value for the second component.
	 * @param v2 The value for the third component.
	 * @param v3 The value for the fourth component.
	 */
	public ImTup4(@Nullable V0 v0, @Nullable V1 v1, @Nullable V2 v2, @Nullable V3 v3)
	{
		this.v0 = v0;
		this.v1 = v1;
		this.v2 = v2;
		this.v3 = v3;
	}

	/** {@inheritDoc} */
	@Override
	public ImTup4<V0,V1,V2,V3> createNew(Tup4R<V0,V1,V2,V3> t)
	{
		return new ImTup4<V0,V1,V2,V3>(t);
	}

	/** {@inheritDoc} */
	@Override
	public ImTup4<V0,V1,V2,V3> createNew(@Nullable V0 v0, @Nullable V1 v1, @Nullable V2 v2, @Nullable V3 v3)
	{
		return new ImTup4<V0,V1,V2,V3>(v0, v1, v2, v3);
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
	public V3 v3()
	{
		return this.v3;
	}
	
	/** {@inheritDoc} */
	@Override
	public ImTup4<V0,V1,V2,V3> copy()
	{
		return new ImTup4<V0,V1,V2,V3>(this);
	}

	/** {@inheritDoc} */
	@Override
	public boolean equals(@Nullable Object other)
	{
		if(other == null) return false;
		if(other == this) return true;
		
		if(!(other instanceof Tup4R original)) return false;
		
		if(!Objects.equals(this.v0, original.v0())) return false;
		if(!Objects.equals(this.v1, original.v1())) return false;
		if(!Objects.equals(this.v2, original.v2())) return false;
		if(!Objects.equals(this.v3, original.v3())) return false;
		
		return true;
	}
	
	/** {@inheritDoc} */
	@Override
	public boolean equals(@Nullable Tup4R<V0,V1,V2,V3> t)
	{
		if(t == null) return false;
		if(t == this) return true;
		
		if(!Objects.equals(this.v0, t.v0())) return false;
		if(!Objects.equals(this.v1, t.v1())) return false;
		if(!Objects.equals(this.v2, t.v2())) return false;
		if(!Objects.equals(this.v3, t.v3())) return false;
		
		return true;
	}

	/** {@inheritDoc} */
	@Override
	public boolean equals(@Nullable V0 v0, @Nullable V1 v1, @Nullable V2 v2, @Nullable V3 v3)
	{
		if(!Objects.equals(this.v0, v0)) return false;
		if(!Objects.equals(this.v1, v1)) return false;
		if(!Objects.equals(this.v2, v2)) return false;
		if(!Objects.equals(this.v3, v3)) return false;
		
		return true;
	}

	/** {@inheritDoc} */
	@Override
	public String toString()
	{
		return "ImmutableTuple3(v0=" + this.v0 + ", v1=" + this.v1 + ", v2=" + this.v2 + ", v3=" + this.v3 + ")";
	}
	
	/** {@inheritDoc} */
	@Override
	public int hashCode()
	{
		return Objects.hash(this.v0, this.v1, this.v2, this.v3);
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

	/** {@inheritDoc} */
	@Override
	public boolean isV3Null()
	{
		return this.v3 == null;
	}
}
