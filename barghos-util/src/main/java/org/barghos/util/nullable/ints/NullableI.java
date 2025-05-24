package org.barghos.util.nullable.ints;

import java.io.Serializable;
import java.util.Objects;

import org.barghos.annotation.AllowNull;

public class NullableI implements INullableWI, Serializable
{
	private static final long serialVersionUID = 1L;
	
	private int value;
	private boolean hasValue;
	
	public NullableI()
	{
		setNull();
	}
	
	public NullableI(@AllowNull INullableRI value)
	{
		set(value);
	}

	public NullableI(int value)
	{
		value(value);
	}
	
	public NullableI(@AllowNull Integer value)
	{
		value(value);
	}
	
	@Override
	public int value()
	{
		return this.value;
	}

	@Override
	public int valueOrDefault(int def)
	{
		if(this.hasValue) return this.value;
		
		return def;
	}
	
	@Override
	public int valueOrDefault()
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
	public NullableI value(int value)
	{
		this.value = value;
		this.hasValue = true;
		
		return this;
	}

	@Override
	public NullableI value(@AllowNull Integer value)
	{
		this.hasValue = value != null;
		this.value = this.hasValue ? value : 0;

		return this;
	}
	
	@Override
	public NullableI set(@AllowNull INullableRI value)
	{
		this.hasValue = value != null && value.isNotNull();
		this.value = this.hasValue ? value.value() : 0;
		
		return this;
	}

	@Override
	public NullableI setNull()
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
		
		if(obj instanceof INullableRI n) return equals(n);
		
		if(obj instanceof Integer val) return equals(val);
		
		return false;
	}
	
	@Override
	public boolean equals(@AllowNull INullableRI obj)
	{
		if(obj == null) return !this.hasValue;
		if(obj == this) return true;
		if(obj.isNotNull() != this.hasValue) return false;
		
		if(this.hasValue) return obj.value() == this.value;
		
		return true;
	}
	
	@Override
	public boolean equals(int obj)
	{
		if(!this.hasValue) return false;
		
		return this.value == obj;
	}
	
	@Override
	public boolean equals(@AllowNull Integer obj)
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
		return "int?(" + (this.hasValue ? this.value : "null") + ")";
	}
}
