package org.barghos.util.nullable.objs;

import java.io.Serializable;
import java.util.Objects;

import org.barghos.annotation.AllowNull;

public class NullableO implements INullableWO, Serializable
{
	private static final long serialVersionUID = 1L;
	
	private Object value;
	private boolean hasValue;
	
	public NullableO()
	{
		setNull();
	}
	
	public NullableO(@AllowNull INullableRO value)
	{
		set(value);
	}

	public NullableO(@AllowNull Object value)
	{
		value(value);
	}
	
	@Override
	public Object value()
	{
		return this.value;
	}

	@Override
	public Object valueOrDefault(@AllowNull Object def)
	{
		if(this.hasValue) return this.value;
		
		return def;
	}
	
	@Override
	public Object valueOrDefault()
	{
		if(this.hasValue) return this.value;
		
		return null;
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
	public NullableO value(@AllowNull Object value)
	{
		this.hasValue = value != null;
		this.value = this.hasValue ? value : null;

		return this;
	}
	
	@Override
	public NullableO set(@AllowNull INullableRO value)
	{
		this.hasValue = value != null && value.isNotNull();
		this.value = this.hasValue ? value.value() : null;
		
		return this;
	}

	@Override
	public NullableO setNull()
	{
		this.value = null;
		this.hasValue = false;
		
		return this;
	}
	
	@Override
	public boolean equals(@AllowNull Object obj)
	{
		if(obj == null) return !this.hasValue;
		if(obj == this) return true;
		
		if(obj instanceof INullableRO n) return equals(n);
		
		return this.value.equals(obj);
	}
	
	@Override
	public boolean equals(@AllowNull INullableRO obj)
	{
		if(obj == null) return !this.hasValue;
		if(obj == this) return true;
		if(obj.isNotNull() != this.hasValue) return false;
		
		if(this.hasValue)
		{
			return obj.value() == this.value;
		}
		
		return true;
	}
	
	@Override
	public int hashCode()
	{
		return Objects.hash(this.hasValue, this.value);
	}
	
	@Override
	public String toString()
	{
		return "Object?(" + (this.hasValue ? this.value : "null") + ")";
	}
}
