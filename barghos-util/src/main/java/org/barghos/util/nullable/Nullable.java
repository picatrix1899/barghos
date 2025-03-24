package org.barghos.util.nullable;

import java.util.Objects;

public class Nullable<T> implements NullableW<T>
{
	public T value;
	public boolean isNotNull;
	
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
	public boolean isNull()
	{
		return !this.isNotNull;
	}

	@Override
	public boolean isNotNull()
	{
		return this.isNotNull;
	}
	
	@Override
	public Nullable<T> value(T value)
	{
		this.value = value;
		this.isNotNull = true;
		
		return this;
	}

	@Override
	public Nullable<T> set(NullableR<T> value)
	{
		this.isNotNull = value.isNotNull();
		if(this.isNotNull) this.value = value.value();
		
		return this;
	}

	@Override
	public Nullable<T> setNull()
	{
		this.value = null;
		this.isNotNull = false;
		
		return this;
	}
	
	@Override
	public boolean equals(Object obj)
	{
		if(obj == null) return !this.isNotNull;
		if(obj == this) return true;
		
		if(obj instanceof NullableR<?> n)
		{
			return equals(n);
		}
		
		if(this.isNotNull)
		{
			return this.value.equals(obj);
		}
		
		return false;
	}
	
	@Override
	public boolean equalsValue(T obj)
	{
		if(!this.isNotNull) return false;
		
		return this.value.equals(obj);
	}
	
	@Override
	public boolean equals(NullableR<?> obj)
	{
		if(obj == null) return !this.isNotNull;
		if(obj == this) return true;
		if(obj.isNotNull() != this.isNotNull) return false;
		
		if(this.isNotNull)
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
		return Objects.hash(this.isNotNull, this.value);
	}
	
	public String toString()
	{
		return "nullable(" + (this.isNotNull ? this.value : "null") + ")";
	}
	
}
