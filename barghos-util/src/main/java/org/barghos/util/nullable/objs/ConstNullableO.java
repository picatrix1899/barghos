package org.barghos.util.nullable.objs;

import java.io.ObjectStreamException;
import java.io.Serializable;
import java.util.Objects;

import org.barghos.annotation.AllowNull;

final class ConstNullableO implements IConstNullableO, Serializable
{
	private static final long serialVersionUID = 1L;
	
	public static final IConstNullableO NULL = new Null();
	
	private final Object value;

	private ConstNullableO(Object value)
	{
		this.value = value;
	}
	
	@Override
	public Object value()
	{
		return this.value;
	}

	@Override
	public Object valueOrDefault(@AllowNull Object def)
	{
		return this.value;
	}
	
	@Override
	public Object valueOrDefault()
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
		
		if(obj instanceof INullableRO n) return equals(n);
		
		return this.value.equals(obj);
	}
	
	@Override
	public boolean equals(@AllowNull INullableRO obj)
	{
		if(obj == null || obj.isNull()) return false;
		if(obj == this) return true;
		
		return this.value.equals(obj.value());
	}
	
	@Override
	public int hashCode()
	{
		return Objects.hash(true, this.value);
	}
	
	@Override
	public String toString()
	{
		return "Object?(" + this.value + ")";
	}
	
	public static IConstNullableO of()
	{
		return NULL;
	}
	
	public static IConstNullableO of(@AllowNull Object value)
	{
		if(value == null) return NULL;
		
		return new ConstNullableO(value);
	}
	
	public static IConstNullableO of(@AllowNull INullableRO value)
	{
		if(value == null || value == NULL || value.isNull()) return NULL;
		
		return new ConstNullableO(value.value());
	}
	
	static final class Null implements IConstNullableO, Serializable
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
		public Object valueOrDefault(@AllowNull Object def)
		{
			return def;
		}
		
		@Override
		public boolean equals(@AllowNull Object obj)
		{
			if(obj == null) return true;
			if(obj == this) return true;
			
			if(obj instanceof INullableRO n) return equals(n);
			
			return obj == null;
		}
		
		@Override
		public boolean equals(@AllowNull INullableRO obj)
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
			return "Object?(null)";
		}
		
		private Object readResolve() throws ObjectStreamException
		{
			return NULL;
		}
	}
}
