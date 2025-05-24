package org.barghos.util.nullable.shorts;

import java.io.ObjectStreamException;
import java.io.Serializable;
import java.util.Objects;

import org.barghos.annotation.AllowNull;

final class ConstNullableS implements IConstNullableS, Serializable
{
	private static final long serialVersionUID = 1L;
	
	public static final IConstNullableS NULL = new Null();
	
	private final short value;
	
	private ConstNullableS(short value)
	{
		this.value = value;
	}
	
	@Override
	public short value()
	{
		return this.value;
	}

	@Override
	public short valueOrDefault(short def)
	{
		return this.value;
	}
	
	@Override
	public short valueOrDefault()
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
		
		if(obj instanceof INullableRS n) return equals(n);
		
		if(obj instanceof Short val) return equals(val);
		
		return false;
	}
	
	@Override
	public boolean equals(@AllowNull INullableRS obj)
	{
		if(obj == null || obj.isNull()) return false;
		if(obj == this) return true;

		return obj.value() == this.value;
	}
	
	@Override
	public boolean equals(short obj)
	{
		return this.value == obj;
	}
	
	@Override
	public boolean equals(@AllowNull Short obj)
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
		return "short?(" + this.value + ")";
	}
	
	public static IConstNullableS of()
	{
		return NULL;
	}
	
	public static IConstNullableS of(short value)
	{
		return new ConstNullableS(value);
	}
	
	public static IConstNullableS of(@AllowNull Short value)
	{
		if(value == null) return NULL;
		
		return new ConstNullableS(value);
	}
	
	public static IConstNullableS of(@AllowNull INullableRS value)
	{
		if(value == null || value == NULL || value.isNull()) return NULL;
		
		return new ConstNullableS(value.value());
	}
	
	static final class Null implements IConstNullableS, Serializable
	{
		private static final long serialVersionUID = 1L;
		
		@Override
		public short value()
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
		public short valueOrDefault()
		{
			return 0;
		}
		
		@Override
		public short valueOrDefault(short def)
		{
			return def;
		}
		
		@Override
		public boolean equals(@AllowNull Object obj)
		{
			if(obj == null) return true;
			if(obj == this) return true;
			
			if(obj instanceof INullableRS n) return equals(n);
			
			if(obj instanceof Short val) return equals(val);
			
			return false;
		}
		
		@Override
		public boolean equals(@AllowNull INullableRS obj)
		{
			if(obj == null || obj.isNull()) return true;
			if(obj == this) return true;
			
			return false;
		}
		
		@Override
		public boolean equals(short obj)
		{
			return false;
		}
		
		@Override
		public boolean equals(@AllowNull Short obj)
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
			return "short?(null)";
		}
		
		private Object readResolve() throws ObjectStreamException
		{
			return NULL;
		}
	}
}
