package org.barghos.util.nullable.bools;

import java.io.ObjectStreamException;
import java.io.Serializable;
import java.util.Objects;

import org.barghos.annotation.AllowNull;

final class ConstNullableBo implements IConstNullableBo, Serializable
{
	private static final long serialVersionUID = 1L;
	
	public static final IConstNullableBo NULL = new Null();
	
	private final boolean value;
	
	private ConstNullableBo(boolean value)
	{
		this.value = value;
	}
	
	@Override
	public boolean value()
	{
		return this.value;
	}

	@Override
	public boolean valueOrDefault(boolean def)
	{
		return this.value;
	}
	
	@Override
	public boolean valueOrDefault()
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
		
		if(obj instanceof INullableRBo n) return equals(n);
		
		if(obj instanceof Boolean val) return equals(val);
		
		return false;
	}
	
	@Override
	public boolean equals(@AllowNull INullableRBo obj)
	{
		if(obj == null || obj.isNull()) return false;
		if(obj == this) return true;

		return obj.value() == this.value;
	}
	
	@Override
	public boolean equals(boolean obj)
	{
		return this.value == obj;
	}
	
	@Override
	public boolean equals(@AllowNull Boolean obj)
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
		return "boolean?(" + this.value + ")";
	}
	
	public static IConstNullableBo of()
	{
		return NULL;
	}
	
	public static IConstNullableBo of(boolean value)
	{
		return new ConstNullableBo(value);
	}
	
	public static IConstNullableBo of(@AllowNull Boolean value)
	{
		if(value == null) return NULL;
		
		return new ConstNullableBo(value);
	}
	
	public static IConstNullableBo of(@AllowNull INullableRBo value)
	{
		if(value == null || value == NULL || value.isNull()) return NULL;
		
		return new ConstNullableBo(value.value());
	}
	
	static final class Null implements IConstNullableBo, Serializable
	{
		private static final long serialVersionUID = 1L;
		
		@Override
		public boolean value()
		{
			return false;
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
		public boolean valueOrDefault()
		{
			return false;
		}
		
		@Override
		public boolean valueOrDefault(boolean def)
		{
			return def;
		}
		
		@Override
		public boolean equals(@AllowNull Object obj)
		{
			if(obj == null) return true;
			if(obj == this) return true;
			
			if(obj instanceof INullableRBo n) return equals(n);
			
			if(obj instanceof Boolean val) return equals(val);
			
			return false;
		}
		
		@Override
		public boolean equals(@AllowNull INullableRBo obj)
		{
			if(obj == null || obj.isNull()) return true;
			if(obj == this) return true;
			
			return false;
		}
		
		@Override
		public boolean equals(boolean obj)
		{
			return false;
		}
		
		@Override
		public boolean equals(@AllowNull Boolean obj)
		{
			return obj == null;
		}
		
		@Override
		public int hashCode()
		{
			return Objects.hash(false, false);
		}
		
		@Override
		public String toString()
		{
			return "boolean?(null)";
		}
		
		private Object readResolve() throws ObjectStreamException
		{
			return NULL;
		}
	}
}
