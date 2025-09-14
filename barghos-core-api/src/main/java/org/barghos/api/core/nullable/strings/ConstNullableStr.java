package org.barghos.api.core.nullable.strings;

import java.io.ObjectStreamException;
import java.io.Serializable;
import java.util.Objects;

import org.barghos.annotation.AllowNull;

final class ConstNullableStr implements IConstNullableStr, Serializable
{
	private static final long serialVersionUID = 1L;
	
	public static final IConstNullableStr NULL = new Null();
	
	private final String value;

	private ConstNullableStr(String value)
	{
		this.value = value;
	}
	
	@Override
	public String value()
	{
		return this.value;
	}

	@Override
	public String valueOrDefault(@AllowNull String def)
	{
		return this.value;
	}
	
	@Override
	public String valueOrDefault()
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
		
		if(obj instanceof INullableRStr n) return equals(n);
		
		if(obj instanceof String val) return equals(val);
		
		return false;
	}
	
	@Override
	public boolean equals(@AllowNull INullableRStr obj)
	{
		if(obj == null || obj.isNull()) return false;
		if(obj == this) return true;
		
		return this.value.equals(obj.value());
	}

	@Override
	public boolean equals(@AllowNull String obj)
	{
		if(obj == null) return false;
		
		return this.value.equals(obj);
	}
	
	@Override
	public boolean equalsIgnoreCase(@AllowNull String obj)
	{
		if(obj == null) return false;
		
		return this.value.equalsIgnoreCase(obj);
	}
	
	@Override
	public int hashCode()
	{
		return Objects.hash(true, this.value);
	}
	
	@Override
	public String toString()
	{
		return "String?(" + this.value + ")";
	}
	
	public static IConstNullableStr of()
	{
		return ConstNullableStr.NULL;
	}
	
	public static IConstNullableStr of(@AllowNull String value)
	{
		if(value == null) return ConstNullableStr.NULL;
		
		return new ConstNullableStr(value);
	}
	
	public static IConstNullableStr of(@AllowNull INullableRStr value)
	{
		if(value == null || value == ConstNullableStr.NULL || value.isNull()) return ConstNullableStr.NULL;
		
		return new ConstNullableStr(value.value());
	}
	
	static final class Null implements IConstNullableStr, Serializable
	{
		private static final long serialVersionUID = 1L;

		@Override
		public String value()
		{
			return "";
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
		public String valueOrDefault()
		{
			return "";
		}
		
		@Override
		public String valueOrDefault(@AllowNull String def)
		{
			return def;
		}
		
		@Override
		public boolean equals(@AllowNull Object obj)
		{
			if(obj == null) return true;
			if(obj == this) return true;
			
			if(obj instanceof INullableRStr n) return equals(n);
			
			if(obj instanceof String val) return equals(val);

			return false;
		}
		
		@Override
		public boolean equals(@AllowNull INullableRStr obj)
		{
			if(obj == null || obj.isNull()) return true;
			if(obj == this) return true;
			
			return false;
		}
		
		@Override
		public boolean equals(@AllowNull String obj)
		{
			return obj == null;
		}
		
		@Override
		public boolean equalsIgnoreCase(@AllowNull String obj)
		{
			return obj == null;
		}
		
		@Override
		public int hashCode()
		{
			return Objects.hash(false, "");
		}
		
		@Override
		public String toString()
		{
			return "String?(null)";
		}
		
		private Object readResolve() throws ObjectStreamException
		{
			return NULL;
		}
	}
}
