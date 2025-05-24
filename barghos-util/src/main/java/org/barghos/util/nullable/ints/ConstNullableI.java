package org.barghos.util.nullable.ints;

import java.io.ObjectStreamException;
import java.io.Serializable;
import java.util.Objects;

import org.barghos.annotation.AllowNull;

final class ConstNullableI implements IConstNullableI, Serializable
{
	private static final long serialVersionUID = 1L;
	
	public static final IConstNullableI NULL = new Null();
	
	private final int value;
	
	private ConstNullableI(int value)
	{
		this.value = value;
	}
	
	@Override
	public int value()
	{
		return this.value;
	}

	@Override
	public int valueOrDefault(int def)
	{
		return this.value;
	}
	
	@Override
	public int valueOrDefault()
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
		
		if(obj instanceof INullableRI n) return equals(n);
		
		if(obj instanceof Integer val) return equals(val);
		
		return false;
	}
	
	@Override
	public boolean equals(@AllowNull INullableRI obj)
	{
		if(obj == null || obj.isNull()) return false;
		if(obj == this) return true;

		return obj.value() == this.value;
	}
	
	@Override
	public boolean equals(int obj)
	{
		return this.value == obj;
	}
	
	@Override
	public boolean equals(@AllowNull Integer obj)
	{
		return this.value == obj;
	}
	
	@Override
	public int hashCode()
	{
		return Objects.hash(true, this.value);
	}
	
	@Override
	public String toString()
	{
		return "int?(" + this.value + ")";
	}
	
	public static IConstNullableI of()
	{
		return NULL;
	}
	
	public static IConstNullableI of(int value)
	{
		return new ConstNullableI(value);
	}
	
	public static IConstNullableI of(@AllowNull Short value)
	{
		if(value == null) return NULL;
		
		return new ConstNullableI(value);
	}
	
	public static IConstNullableI of(@AllowNull INullableRI value)
	{
		if(value == null || value == NULL || value.isNull()) return NULL;
		
		return new ConstNullableI(value.value());
	}
	
	static final class Null implements IConstNullableI, Serializable
	{
		private static final long serialVersionUID = 1L;
		
		@Override
		public int value()
		{
			return 0;
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
		public int valueOrDefault()
		{
			return 0;
		}
		
		@Override
		public int valueOrDefault(int def)
		{
			return def;
		}
		
		@Override
		public boolean equals(@AllowNull Object obj)
		{
			if(obj == null) return true;
			if(obj == this) return true;
			
			if(obj instanceof INullableRI n) return equals(n);
			
			if(obj instanceof Integer val) return equals(val);
			
			return false;
		}
		
		@Override
		public boolean equals(@AllowNull INullableRI obj)
		{
			if(obj == null || obj.isNull()) return true;
			if(obj == this) return true;
			
			return false;
		}
		
		@Override
		public boolean equals(int obj)
		{
			return false;
		}
		
		@Override
		public boolean equals(@AllowNull Integer obj)
		{
			return obj == null;
		}
		
		@Override
		public int hashCode()
		{
			return Objects.hash(false, 0);
		}
		
		@Override
		public String toString()
		{
			return "int?(null)";
		}
		
		private Object readResolve() throws ObjectStreamException
		{
			return NULL;
		}
	}
}
