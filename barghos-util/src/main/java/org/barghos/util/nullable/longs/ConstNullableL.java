package org.barghos.util.nullable.longs;

import java.io.ObjectStreamException;
import java.io.Serializable;
import java.util.Objects;

import org.barghos.annotation.AllowNull;

final class ConstNullableL implements IConstNullableL, Serializable
{
	private static final long serialVersionUID = 1L;
	
	public static final IConstNullableL NULL = new Null();
	
	private final long value;
	
	private ConstNullableL(long value)
	{
		this.value = value;
	}
	
	@Override
	public long value()
	{
		return this.value;
	}

	@Override
	public long valueOrDefault(long def)
	{
		return this.value;
	}
	
	@Override
	public long valueOrDefault()
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
		
		if(obj instanceof INullableRL n) return equals(n);
		
		if(obj instanceof Long val) return equals(val);
		
		return false;
	}
	
	@Override
	public boolean equals(@AllowNull INullableRL obj)
	{
		if(obj == null || obj.isNull()) return false;
		if(obj == this) return true;

		return obj.value() == this.value;
	}
	
	@Override
	public boolean equals(long obj)
	{
		return this.value == obj;
	}
	
	@Override
	public boolean equals(@AllowNull Long obj)
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
		return "long?(" + this.value + ")";
	}
	
	public static IConstNullableL of()
	{
		return NULL;
	}
	
	public static IConstNullableL of(long value)
	{
		return new ConstNullableL(value);
	}
	
	public static IConstNullableL of(@AllowNull Long value)
	{
		if(value == null) return NULL;
		
		return new ConstNullableL(value);
	}
	
	public static IConstNullableL of(@AllowNull INullableRL value)
	{
		if(value == null || value == NULL || value.isNull()) return NULL;
		
		return new ConstNullableL(value.value());
	}
	
	static final class Null implements IConstNullableL, Serializable
	{
		private static final long serialVersionUID = 1L;
		
		@Override
		public long value()
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
		public long valueOrDefault()
		{
			return 0;
		}
		
		@Override
		public long valueOrDefault(long def)
		{
			return def;
		}
		
		@Override
		public boolean equals(@AllowNull Object obj)
		{
			if(obj == null) return true;
			if(obj == this) return true;
			
			if(obj instanceof INullableRL n) return equals(n);
			
			if(obj instanceof Long val) return equals(val);
			
			return false;
		}
		
		@Override
		public boolean equals(@AllowNull INullableRL obj)
		{
			if(obj == null || obj.isNull()) return true;
			if(obj == this) return true;
			
			return false;
		}
		
		@Override
		public boolean equals(long obj)
		{
			return false;
		}
		
		@Override
		public boolean equals(@AllowNull Long obj)
		{
			return obj == null;
		}
		
		@Override
		public int hashCode()
		{
			return Objects.hash(false, 0l);
		}
		
		@Override
		public String toString()
		{
			return "long?(null)";
		}
		
		private Object readResolve() throws ObjectStreamException
		{
			return NULL;
		}
	}
}
