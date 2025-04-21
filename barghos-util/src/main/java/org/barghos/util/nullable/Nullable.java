package org.barghos.util.nullable;

import java.util.Objects;

public class Nullable<T> implements NullableW<T>
{
	public T value;
	public boolean hasValue;
	
	public Nullable()
	{
		setNull();
	}
	
	public Nullable(NullableR<T> value)
	{
		set(value);
	}
	
	public Nullable(T value)
	{
		value(value);
	}

	@Override
	public T value()
	{
		return this.value;
	}
	
	@Override
	public T valueOrDefault(T def)
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
	public Nullable<T> value(T value)
	{
		this.value = value;
		this.hasValue = true;
		
		return this;
	}

	@Override
	public Nullable<T> set(NullableR<T> value)
	{
		this.hasValue = value.isNotNull();
		if(this.hasValue) this.value = value.value();
		
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
	public boolean equals(Object obj)
	{
		if(obj == null) return !this.hasValue;
		if(obj == this) return true;
		
		if(obj instanceof NullableR<?> n)
		{
			return equals(n);
		}
		
		if(this.hasValue)
		{
			return this.value.equals(obj);
		}
		
		return false;
	}
	
	@Override
	public boolean equalsValue(T obj)
	{
		if(!this.hasValue) return false;
		
		return this.value.equals(obj);
	}
	
	@Override
	public boolean equals(NullableR<?> obj)
	{
		if(obj == null) return !this.hasValue;
		if(obj == this) return true;
		if(obj.isNotNull() != this.hasValue) return false;
		
		if(this.hasValue)
		{
			if(obj.value() instanceof Float f)
			{
				return f == this.value;
			}
			
			return false;
		}
		
		return true;
	}
	
	public int hashCode()
	{
		return Objects.hash(this.hasValue, this.value);
	}
	
	public String toString()
	{
		return "nullable(" + (this.hasValue ? this.value : "null") + ")";
	}
	
}
