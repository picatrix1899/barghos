package org.barghos.util.nullable.bools;

import java.io.Serializable;
import java.util.Objects;

import org.barghos.annotation.AllowNull;

public class NullableBo implements INullableWBo, Serializable
{
	private static final long serialVersionUID = 1L;
	
	private boolean value;
	private boolean hasValue;
	
	public NullableBo()
	{
		setNull();
	}
	
	public NullableBo(@AllowNull INullableRBo value)
	{
		set(value);
	}

	public NullableBo(boolean value)
	{
		value(value);
	}
	
	public NullableBo(@AllowNull Boolean value)
	{
		value(value);
	}
	
	@Override
	public boolean value()
	{
		return this.value;
	}

	@Override
	public boolean valueOrDefault(boolean def)
	{
		if(this.hasValue) return this.value;
		
		return def;
	}
	
	@Override
	public boolean valueOrDefault()
	{
		if(this.hasValue) return this.value;
		
		return false;
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
	public NullableBo value(boolean value)
	{
		this.value = value;
		this.hasValue = true;
		
		return this;
	}

	@Override
	public NullableBo value(@AllowNull Boolean value)
	{
		this.hasValue = value != null;
		this.value = this.hasValue ? value : false;

		return this;
	}
	
	@Override
	public NullableBo set(@AllowNull INullableRBo value)
	{
		this.hasValue = value != null && value.isNotNull();
		this.value = this.hasValue ? value.value() : false;
		
		return this;
	}

	@Override
	public NullableBo setNull()
	{
		this.value = false;
		this.hasValue = false;
		
		return this;
	}
	
	@Override
	public boolean equals(@AllowNull Object obj)
	{
		if(obj == null) return !this.hasValue;
		if(obj == this) return true;
		
		if(obj instanceof INullableRBo n) return equals(n);
		
		if(obj instanceof Byte val) return equals(val);
		
		return false;
	}
	
	@Override
	public boolean equals(@AllowNull INullableRBo obj)
	{
		if(obj == null) return !this.hasValue;
		if(obj == this) return true;
		if(obj.isNotNull() != this.hasValue) return false;
		
		if(this.hasValue) return obj.value() == this.value;
		
		return true;
	}
	
	@Override
	public boolean equals(boolean obj)
	{
		if(!this.hasValue) return false;
		
		return this.value == obj;
	}
	
	@Override
	public boolean equals(@AllowNull Boolean obj)
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
		return "boolean?(" + (this.hasValue ? this.value : "null") + ")";
	}
}
