package org.barghos.impl.core.nullable.longs;

import java.io.Serializable;
import java.util.Objects;

import org.barghos.annotation.AllowNull;
import org.barghos.api.core.nullable.longs.INullableRL;
import org.barghos.api.core.nullable.longs.INullableWL;

public class NullableL implements INullableWL, Serializable
{
	private static final long serialVersionUID = 1L;
	
	private long value;
	private boolean hasValue;
	
	public NullableL()
	{
		setNull();
	}
	
	public NullableL(@AllowNull INullableRL value)
	{
		set(value);
	}

	public NullableL(long value)
	{
		value(value);
	}
	
	public NullableL(@AllowNull Long value)
	{
		value(value);
	}
	
	@Override
	public long value()
	{
		return this.value;
	}

	@Override
	public long valueOrDefault(long def)
	{
		if(this.hasValue) return this.value;
		
		return def;
	}
	
	@Override
	public long valueOrDefault()
	{
		if(this.hasValue) return this.value;
		
		return 0l;
	}
	
	@Override
	public boolean isNull()
	{
		return !this.hasValue;
	}

	@Override
	public boolean isNotNull()
	{
		return this.hasValue;
	}
	
	@Override
	public NullableL value(long value)
	{
		this.value = value;
		this.hasValue = true;
		
		return this;
	}

	@Override
	public NullableL value(@AllowNull Long value)
	{
		this.hasValue = value != null;
		this.value = this.hasValue ? value : 0l;

		return this;
	}
	
	@Override
	public NullableL set(@AllowNull INullableRL value)
	{
		this.hasValue = value != null && value.isNotNull();
		this.value = this.hasValue ? value.value() : 0l;
		
		return this;
	}

	@Override
	public NullableL setNull()
	{
		this.value = 0l;
		this.hasValue = false;
		
		return this;
	}
	
	@Override
	public boolean equals(@AllowNull Object obj)
	{
		if(obj == null) return !this.hasValue;
		if(obj == this) return true;
		
		if(obj instanceof INullableRL n) return equals(n);
		
		if(obj instanceof Long val) return equals(val);
		
		return false;
	}
	
	@Override
	public boolean equals(@AllowNull INullableRL obj)
	{
		if(obj == null) return !this.hasValue;
		if(obj == this) return true;
		if(obj.isNotNull() != this.hasValue) return false;
		
		if(this.hasValue) return obj.value() == this.value;
		
		return true;
	}
	
	@Override
	public boolean equals(long obj)
	{
		if(!this.hasValue) return false;
		
		return this.value == obj;
	}
	
	@Override
	public boolean equals(@AllowNull Long obj)
	{
		if(!this.hasValue && obj == null) return true;
		if(!this.hasValue) return false;
		
		return this.value == obj;
	}
	
	@Override
	public int hashCode()
	{
		return Objects.hash(this.hasValue, this.value);
	}
	
	@Override
	public String toString()
	{
		return "long?(" + (this.hasValue ? this.value : "null") + ")";
	}
}
