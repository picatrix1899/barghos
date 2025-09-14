package org.barghos.impl.core.nullable.shorts;

import java.io.Serializable;
import java.util.Objects;

import org.barghos.annotation.AllowNull;
import org.barghos.api.core.nullable.shorts.INullableRS;
import org.barghos.api.core.nullable.shorts.INullableWS;

public class NullableS implements INullableWS, Serializable
{
	private static final long serialVersionUID = 1L;
	
	private short value;
	private boolean hasValue;
	
	public NullableS()
	{
		setNull();
	}
	
	public NullableS(@AllowNull INullableRS value)
	{
		set(value);
	}

	public NullableS(short value)
	{
		value(value);
	}
	
	public NullableS(@AllowNull Short value)
	{
		value(value);
	}
	
	@Override
	public short value()
	{
		return this.value;
	}

	@Override
	public short valueOrDefault(short def)
	{
		if(this.hasValue) return this.value;
		
		return def;
	}
	
	@Override
	public short valueOrDefault()
	{
		if(this.hasValue) return this.value;
		
		return 0;
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
	public NullableS value(short value)
	{
		this.value = value;
		this.hasValue = true;
		
		return this;
	}

	@Override
	public NullableS value(@AllowNull Short value)
	{
		this.hasValue = value != null;
		this.value = this.hasValue ? value : 0;

		return this;
	}
	
	@Override
	public NullableS set(@AllowNull INullableRS value)
	{
		this.hasValue = value != null && value.isNotNull();
		this.value = this.hasValue ? value.value() : 0;
		
		return this;
	}

	@Override
	public NullableS setNull()
	{
		this.value = 0;
		this.hasValue = false;
		
		return this;
	}
	
	@Override
	public boolean equals(@AllowNull Object obj)
	{
		if(obj == null) return !this.hasValue;
		if(obj == this) return true;
		
		if(obj instanceof INullableRS n) return equals(n);
		
		if(obj instanceof Short val) return equals(val);
		
		return false;
	}
	
	@Override
	public boolean equals(@AllowNull INullableRS obj)
	{
		if(obj == null) return !this.hasValue;
		if(obj == this) return true;
		if(obj.isNotNull() != this.hasValue) return false;
		
		if(this.hasValue) return obj.value() == this.value;
		
		return true;
	}
	
	@Override
	public boolean equals(short obj)
	{
		if(!this.hasValue) return false;
		
		return this.value == obj;
	}
	
	@Override
	public boolean equals(@AllowNull Short obj)
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
		return "short?(" + (this.hasValue ? this.value : "null") + ")";
	}
}
