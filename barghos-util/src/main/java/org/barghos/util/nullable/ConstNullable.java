package org.barghos.util.nullable;

import java.io.ObjectStreamException;
import java.io.Serializable;
import java.util.Objects;

import org.barghos.annotation.AllowNull;

final class ConstNullable<T> implements IConstNullable<T>, Serializable
{
	private static final long serialVersionUID = 1L;

	public static final IConstNullable<?> NULL = new ConstNullable.Null();
	
	private final T value;
	
	private ConstNullable(T value)
	{
		this.value = value;
	}

	@Override
	public T value()
	{
		return this.value;
	}
	
	@Override
	public T valueOrDefault(T def)
	{
		return this.value;
	}
	
	@Override
	public T valueOrDefault()
	{
		return this.value;
	}
	
	@Override
	public boolean isNull()
	{
		return false;
	}

	@Override
	public boolean isNotNull()
	{
		return true;
	}
	
	@Override
	public boolean equals(@AllowNull Object obj)
	{
		if(obj == null) return false;
		if(obj == this) return true;
		
		if(obj instanceof INullableR<?> n) return equals(n);

		return this.value.equals(obj);
	}
	
	@Override
	public boolean equals(@AllowNull INullableR<?> obj)
	{
		if(obj == null || obj.isNull()) return false;
		if(obj == this) return true;

		return this.value.equals(obj);
	}

	@Override
	public int hashCode()
	{
		return Objects.hash(true, this.value);
	}
	
	@Override
	public String toString()
	{
		return "T?(" + this.value + ")";
	}
	
	@SuppressWarnings("unchecked")
	public static <T> IConstNullable<T> of()
	{
		return (IConstNullable<T>) NULL;
	}
	
	@SuppressWarnings("unchecked")
	public static <T> IConstNullable<T> of(@AllowNull T value)
	{
		if(value == null) return (IConstNullable<T>) NULL;
		
		return new ConstNullable<T>(value);
	}
	
	@SuppressWarnings("unchecked")
	public static <T> IConstNullable<T> of(@AllowNull INullableR<T> value)
	{
		if(value == null || value == NULL || value.isNull()) return (IConstNullable<T>) NULL;
		
		return new ConstNullable<T>(value.value());
	}
	
	static final class Null implements IConstNullable<Object>, Serializable
	{
		private static final long serialVersionUID = 1L;

		@Override
		public Object value()
		{
			return null;
		}
		
		@Override
		public boolean isNull()
		{
			return true;
		}
		
		@Override
		public boolean isNotNull()
		{
			return false;
		}
		
		@Override
		public Object valueOrDefault()
		{
			return null;
		}
		
		@Override
		public Object valueOrDefault(Object def)
		{
			return def;
		}
		
		@Override
		public boolean equals(@AllowNull Object obj)
		{
			if(obj == null) return true;
			if(obj == this) return true;
			
			if(obj instanceof INullableR<?> n) return equals(n);
			
			return obj == null;
		}
		
		@Override
		public boolean equals(@AllowNull INullableR<?> obj)
		{
			if(obj == null || obj.isNull()) return true;
			if(obj == this) return true;
			
			return false;
		}
		
		@Override
		public int hashCode()
		{
			return Objects.hash(false, null);
		}
		
		@Override
		public String toString()
		{
			return "T?(null)";
		}
		
		private Object readResolve() throws ObjectStreamException
		{
			return NULL;
		}
	}
}
