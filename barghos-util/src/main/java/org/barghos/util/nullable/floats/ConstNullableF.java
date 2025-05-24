package org.barghos.util.nullable.floats;

import java.io.ObjectStreamException;
import java.io.Serializable;
import java.util.Objects;

import org.barghos.annotation.AllowNull;

final class ConstNullableF implements IConstNullableF, Serializable
{
	private static final long serialVersionUID = 1L;
	
	public static final IConstNullableF NULL = new Null();
	
	private final float value;
	
	private ConstNullableF(float value)
	{
		this.value = value;
	}
	
	@Override
	public float value()
	{
		return this.value;
	}

	@Override
	public float valueOrDefault(float def)
	{
		return this.value;
	}
	
	@Override
	public float valueOrDefault()
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
		
		if(obj instanceof INullableRF n) return equals(n);
		
		if(obj instanceof Float val) return equals(val);
		
		return false;
	}
	
	@Override
	public boolean equals(@AllowNull INullableRF obj)
	{
		if(obj == null || obj.isNull()) return false;
		if(obj == this) return true;

		return obj.value() == this.value;
	}
	
	@Override
	public boolean equals(float obj)
	{
		return this.value == obj;
	}
	
	@Override
	public boolean equals(@AllowNull Float obj)
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
		return "float?(" + this.value + ")";
	}
	
	public static IConstNullableF of()
	{
		return NULL;
	}
	
	public static IConstNullableF of(float value)
	{
		return new ConstNullableF(value);
	}
	
	public static IConstNullableF of(@AllowNull Float value)
	{
		if(value == null) return NULL;
		
		return new ConstNullableF(value);
	}
	
	public static IConstNullableF of(@AllowNull INullableRF value)
	{
		if(value == null || value == NULL || value.isNull()) return NULL;
		
		return new ConstNullableF(value.value());
	}
	
	static final class Null implements IConstNullableF, Serializable
	{
		private static final long serialVersionUID = 1L;
		
		@Override
		public float value()
		{
			return 0.0f;
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
		public float valueOrDefault()
		{
			return 0.0f;
		}
		
		@Override
		public float valueOrDefault(float def)
		{
			return def;
		}
		
		@Override
		public boolean equals(@AllowNull Object obj)
		{
			if(obj == null) return true;
			if(obj == this) return true;
			
			if(obj instanceof INullableRF n) return equals(n);
			
			if(obj instanceof Float val) return equals(val);
			
			return false;
		}
		
		@Override
		public boolean equals(@AllowNull INullableRF obj)
		{
			if(obj == null || obj.isNull()) return true;
			if(obj == this) return true;
			
			return false;
		}
		
		@Override
		public boolean equals(float obj)
		{
			return false;
		}
		
		@Override
		public boolean equals(@AllowNull Float obj)
		{
			return obj == null;
		}
		
		@Override
		public int hashCode()
		{
			return Objects.hash(false, 0.0f);
		}
		
		@Override
		public String toString()
		{
			return "float?(null)";
		}
		
		private Object readResolve() throws ObjectStreamException
		{
			return NULL;
		}
	}
}
