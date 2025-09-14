package org.barghos.api.core.nullable.bytes;

import java.io.ObjectStreamException;
import java.io.Serializable;
import java.util.Objects;

import org.barghos.annotation.AllowNull;

final class ConstNullableB implements IConstNullableB, Serializable
{
	private static final long serialVersionUID = 1L;
	
	public static final IConstNullableB NULL = new Null();
	
	private final byte value;
	
	private ConstNullableB(byte value)
	{
		this.value = value;
	}
	
	@Override
	public byte value()
	{
		return this.value;
	}

	@Override
	public byte valueOrDefault(byte def)
	{
		return this.value;
	}
	
	@Override
	public byte valueOrDefault()
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
		
		if(obj instanceof INullableRB n) return equals(n);
		
		if(obj instanceof Byte val) return equals(val);
		
		return false;
	}
	
	@Override
	public boolean equals(@AllowNull INullableRB obj)
	{
		if(obj == null || obj.isNull()) return false;
		if(obj == this) return true;

		return obj.value() == this.value;
	}
	
	@Override
	public boolean equals(byte obj)
	{
		return this.value == obj;
	}
	
	@Override
	public boolean equals(@AllowNull Byte obj)
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
		return "byte?(" + this.value + ")";
	}
	
	public static IConstNullableB of()
	{
		return NULL;
	}
	
	public static IConstNullableB of(byte value)
	{
		return new ConstNullableB(value);
	}
	
	public static IConstNullableB of(@AllowNull Byte value)
	{
		if(value == null) return NULL;
		
		return new ConstNullableB(value);
	}
	
	public static IConstNullableB of(@AllowNull INullableRB value)
	{
		if(value == null || value == NULL || value.isNull()) return NULL;
		
		return new ConstNullableB(value.value());
	}
	
	static final class Null implements IConstNullableB, Serializable
	{
		private static final long serialVersionUID = 1L;
		
		@Override
		public byte value()
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
		public byte valueOrDefault()
		{
			return 0;
		}
		
		@Override
		public byte valueOrDefault(byte def)
		{
			return def;
		}
		
		@Override
		public boolean equals(@AllowNull Object obj)
		{
			if(obj == null) return true;
			if(obj == this) return true;
			
			if(obj instanceof INullableRB n) return equals(n);
			
			if(obj instanceof Byte val) return equals(val);
			
			return false;
		}
		
		@Override
		public boolean equals(@AllowNull INullableRB obj)
		{
			if(obj == null || obj.isNull()) return true;
			if(obj == this) return true;
			
			return false;
		}
		
		@Override
		public boolean equals(byte obj)
		{
			return false;
		}
		
		@Override
		public boolean equals(@AllowNull Byte obj)
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
			return "byte?(null)";
		}
		
		private Object readResolve() throws ObjectStreamException
		{
			return NULL;
		}
	}
}
