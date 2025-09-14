package org.barghos.api.core.nullable.chars;

import java.io.ObjectStreamException;
import java.io.Serializable;
import java.util.Objects;

import org.barghos.annotation.AllowNull;

final class ConstNullableC implements IConstNullableC, Serializable
{
	private static final long serialVersionUID = 1L;
	
	public static final IConstNullableC NULL = new Null();
	
	private final char value;
	
	private ConstNullableC(char value)
	{
		this.value = value;
	}
	
	@Override
	public char value()
	{
		return this.value;
	}

	@Override
	public char valueOrDefault(char def)
	{
		return this.value;
	}
	
	@Override
	public char valueOrDefault()
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
		
		if(obj instanceof INullableRC n) return equals(n);
		
		if(obj instanceof Character val) return equals(val);
		
		return false;
	}
	
	@Override
	public boolean equals(@AllowNull INullableRC obj)
	{
		if(obj == null || obj.isNull()) return false;
		if(obj == this) return true;

		return obj.value() == this.value;
	}
	
	@Override
	public boolean equals(char obj)
	{
		return this.value == obj;
	}
	
	@Override
	public boolean equals(@AllowNull Character obj)
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
		return "char?(" + this.value + ")";
	}
	
	public static IConstNullableC of()
	{
		return NULL;
	}
	
	public static IConstNullableC of(char value)
	{
		return new ConstNullableC(value);
	}
	
	public static IConstNullableC of(@AllowNull Character value)
	{
		if(value == null) return NULL;
		
		return new ConstNullableC(value);
	}
	
	public static IConstNullableC of(@AllowNull INullableRC value)
	{
		if(value == null || value == NULL || value.isNull()) return NULL;
		
		return new ConstNullableC(value.value());
	}
	
	static final class Null implements IConstNullableC, Serializable
	{
		private static final long serialVersionUID = 1L;
		
		@Override
		public char value()
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
		public char valueOrDefault()
		{
			return 0;
		}
		
		@Override
		public char valueOrDefault(char def)
		{
			return def;
		}
		
		@Override
		public boolean equals(@AllowNull Object obj)
		{
			if(obj == null) return true;
			if(obj == this) return true;
			
			if(obj instanceof INullableRC n) return equals(n);
			
			if(obj instanceof Character val) return equals(val);
			
			return false;
		}
		
		@Override
		public boolean equals(@AllowNull INullableRC obj)
		{
			if(obj == null || obj.isNull()) return true;
			if(obj == this) return true;
			
			return false;
		}
		
		@Override
		public boolean equals(char obj)
		{
			return false;
		}
		
		@Override
		public boolean equals(@AllowNull Character obj)
		{
			return obj == null;
		}
		
		@Override
		public int hashCode()
		{
			return Objects.hash(false, (char)0);
		}
		
		@Override
		public String toString()
		{
			return "char?(null)";
		}
		
		private Object readResolve() throws ObjectStreamException
		{
			return NULL;
		}
	}
}
