package org.barghos.util.nullable.bytes;

import java.io.Serializable;
import java.util.Objects;

import org.barghos.annotation.AllowNull;

public class NullableB implements INullableWB, Serializable
{
	private static final long serialVersionUID = 1L;
	
	private byte value;
	private boolean hasValue;
	
	public NullableB()
	{
		setNull();
	}
	
	public NullableB(@AllowNull INullableRB value)
	{
		set(value);
	}

	public NullableB(byte value)
	{
		value(value);
	}
	
	public NullableB(@AllowNull Byte value)
	{
		value(value);
	}
	
	@Override
	public byte value()
	{
		return this.value;
	}

	@Override
	public byte valueOrDefault(byte def)
	{
		if(this.hasValue) return this.value;
		
		return def;
	}
	
	@Override
	public byte valueOrDefault()
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
	public NullableB value(byte value)
	{
		this.value = value;
		this.hasValue = true;
		
		return this;
	}

	@Override
	public NullableB value(@AllowNull Byte value)
	{
		this.hasValue = value != null;
		this.value = this.hasValue ? value : 0;

		return this;
	}
	
	@Override
	public NullableB set(@AllowNull INullableRB value)
	{
		this.hasValue = value != null && value.isNotNull();
		this.value = this.hasValue ? value.value() : 0;
		
		return this;
	}

	@Override
	public NullableB setNull()
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
		
		if(obj instanceof INullableRB n) return equals(n);
		
		if(obj instanceof Byte val) return equals(val);
		
		return false;
	}
	
	@Override
	public boolean equals(@AllowNull INullableRB obj)
	{
		if(obj == null) return !this.hasValue;
		if(obj == this) return true;
		if(obj.isNotNull() != this.hasValue) return false;
		
		if(this.hasValue) return obj.value() == this.value;
		
		return true;
	}
	
	@Override
	public boolean equals(byte obj)
	{
		if(!this.hasValue) return false;
		
		return this.value == obj;
	}
	
	@Override
	public boolean equals(@AllowNull Byte obj)
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
		return "byte?(" + (this.hasValue ? this.value : "null") + ")";
	}
}
