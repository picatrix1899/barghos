package org.barghos.impl.core.tuple;

import java.util.Objects;

import org.barghos.api.core.tuple.ITup2R;
import org.barghos.api.core.tuple.ITup2W;

public class Tup2<V0,V1> implements ITup2W<V0,V1>
{
	private V0 v0;
	private V1 v1;
	
	public Tup2()
	{
		
	}
	
	public Tup2(ITup2R<V0,V1> t)
	{
		set(t);
	}
	
	public Tup2(V0 v0, V1 v1)
	{
		set(v0, v1);
	}
	
	@Override
	public V0 v0()
	{
		return this.v0;
	}
	@Override
	public V1 v1()
	{
		return this.v1;
	}
	@Override
	public boolean equals(ITup2R<V0, V1> t)
	{
		if(t == null) return false;
		if(t == this) return true;
		
		if(!Objects.equals(this.v0, t.v0())) return false;
		if(!Objects.equals(this.v1, t.v1())) return false;
		
		return true;
	}
	@Override
	public boolean equals(V0 v0, V1 v1)
	{
		if(!Objects.equals(this.v0, v0)) return false;
		if(!Objects.equals(this.v1, v1)) return false;
		
		return true;
	}
	
	@Override
	public int hashCode()
	{
		return Objects.hash(this.v0, this.v1);
	}
	
	@Override
	public String toString()
	{
		return "tup2(v0=" + this.v0 + ", v1=" + this.v1 + ")";
	}
	
	@Override
	public boolean isV0Null()
	{
		return this.v0 == null;
	}
	@Override
	public boolean isV1Null()
	{
		return this.v1 == null;
	}
	@Override
	public Tup2<V0,V1> v0(V0 v0)
	{
		this.v0 = v0;
		
		return this;
	}
	@Override
	public Tup2<V0,V1> v1(V1 v1)
	{
		this.v1 = v1;
		
		return this;
	}
	@Override
	public Tup2<V0,V1> set(ITup2R<V0, V1> t)
	{
		this.v0 = t.v0();
		this.v1 = t.v1();
		
		return this;
	}
	@Override
	public Tup2<V0,V1> set(V0 v0, V1 v1)
	{
		this.v0 = v0;
		this.v1 = v1;
		
		return this;
	}

}
