package org.barghos.impl.core.nullable.chars;

import java.io.Serializable;
import java.util.Objects;

import org.barghos.annotation.AllowNull;
import org.barghos.api.core.nullable.chars.INullableRC;
import org.barghos.api.core.nullable.chars.INullableWC;

public class NullableC implements INullableWC, Serializable
{
	private static final long serialVersionUID = 1L;
	
	private char value;
	private boolean hasValue;
	
	public NullableC()
	{
		setNull();
	}
	
	public NullableC(@AllowNull INullableRC value)
	{
		set(value);
	}

	public NullableC(char value)
	{
		value(value);
	}
	
	public NullableC(@AllowNull Character value)
	{
		value(value);
	}
	
	@Override
	public char value()
	{
		return this.value;
	}

	@Override
	public char valueOrDefault(char def)
	{
		if(this.hasValue) return this.value;
		
		return def;
	}
	
	@Override
	public char valueOrDefault()
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
	public NullableC value(char value)
	{
		this.value = value;
		this.hasValue = true;
		
		return this;
	}

	@Override
	public NullableC value(@AllowNull Character value)
	{
		this.hasValue = value != null;
		this.value = this.hasValue ? value : 0;

		return this;
	}
	
	@Override
	public NullableC set(@AllowNull INullableRC value)
	{
		this.hasValue = value != null && value.isNotNull();
		this.value = this.hasValue ? value.value() : 0;
		
		return this;
	}

	@Override
	public NullableC setNull()
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
		
		if(obj instanceof INullableRC n) return equals(n);
		
		if(obj instanceof Character val) return equals(val);
		
		return false;
	}
	
	@Override
	public boolean equals(@AllowNull INullableRC obj)
	{
		if(obj == null) return !this.hasValue;
		if(obj == this) return true;
		if(obj.isNotNull() != this.hasValue) return false;
		
		if(this.hasValue) return obj.value() == this.value;
		
		return true;
	}
	
	@Override
	public boolean equals(char obj)
	{
		if(!this.hasValue) return false;
		
		return this.value == obj;
	}
	
	@Override
	public boolean equals(@AllowNull Character obj)
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
		return "char?(" + (this.hasValue ? this.value : "null") + ")";
	}
}
