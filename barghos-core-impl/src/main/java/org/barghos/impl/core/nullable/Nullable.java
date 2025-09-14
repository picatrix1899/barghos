package org.barghos.impl.core.nullable;

import java.io.Serializable;
import java.util.Objects;

import org.barghos.annotation.AllowNull;
import org.barghos.api.core.nullable.INullableR;
import org.barghos.api.core.nullable.INullableW;

public class Nullable<T> implements INullableW<T>, Serializable
{
	private static final long serialVersionUID = 1L;
	
	private T value;
	private boolean hasValue;
	
	public Nullable()
	{
		setNull();
	}
	
	public Nullable(@AllowNull INullableR<T> value)
	{
		set(value);
	}
	
	public Nullable(@AllowNull T value)
	{
		value(value);
	}

	@Override
	public T value()
	{
		return this.value;
	}
	
	@Override
	public T valueOrDefault(@AllowNull T def)
	{
		if(this.hasValue) return this.value;
		
		return def;
	}
	
	@Override
	public T valueOrDefault()
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
	public Nullable<T> value(@AllowNull T value)
	{
		this.hasValue = value != null;
		
		this.value = this.hasValue ? value : null;
		
		return this;
	}

	@Override
	public Nullable<T> set(@AllowNull INullableR<T> value)
	{
		this.hasValue = value != null && value.isNotNull();
		this.value = this.hasValue ? value.value(): null;
		
		return this;
	}

	@Override
	public Nullable<T> setNull()
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
		
		if(obj instanceof INullableR<?> n) return equals(n);
		
		if(this.hasValue) return this.value.equals(obj);
		
		return false;
	}
	
	@Override
	public boolean equals(@AllowNull INullableR<?> obj)
	{
		if(obj == null) return !this.hasValue;
		if(obj == this) return true;
		if(obj.isNotNull() != this.hasValue) return false;
		
		if(this.hasValue) return this.value.equals(obj);
		
		return true;
	}

	public int hashCode()
	{
		return Objects.hash(this.hasValue, this.value);
	}
	
	public String toString()
	{
		return "T?(" + (this.hasValue ? this.value : "null") + ")";
	}
	
}
