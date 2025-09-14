package org.barghos.api.core.nullable.bigd;

import java.io.ObjectStreamException;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Objects;

import org.barghos.annotation.AllowNull;

final class ConstNullableBigd implements IConstNullableBigd, Serializable
{
	private static final long serialVersionUID = 1L;
	
	public static final IConstNullableBigd NULL = new Null();
	
	private final BigDecimal value;

	private ConstNullableBigd(BigDecimal value)
	{
		this.value = value;
	}
	
	@Override
	public BigDecimal value()
	{
		return this.value;
	}

	@Override
	public BigDecimal valueOrDefault(@AllowNull BigDecimal def)
	{
		return this.value;
	}
	
	@Override
	public BigDecimal valueOrDefault()
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
		
		if(obj instanceof INullableRBigd n) return equals(n);
		
		if(obj instanceof BigDecimal val) return equals(val);
		
		return this.value.equals(obj);
	}
	
	@Override
	public boolean equals(@AllowNull INullableRBigd obj)
	{
		if(obj == null || obj.isNull()) return false;
		if(obj == this) return true;
		
		return this.value.equals(obj.value());
	}
	
	@Override
	public boolean equals(BigDecimal obj)
	{
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
		return "BigDecimal?(" + this.value + ")";
	}
	
	public static IConstNullableBigd of()
	{
		return NULL;
	}
	
	public static IConstNullableBigd of(@AllowNull BigDecimal value)
	{
		if(value == null) return NULL;
		
		return new ConstNullableBigd(value);
	}
	
	public static IConstNullableBigd of(@AllowNull INullableRBigd value)
	{
		if(value == null || value == NULL || value.isNull()) return NULL;
		
		return new ConstNullableBigd(value.value());
	}
	
	static final class Null implements IConstNullableBigd, Serializable
	{
		private static final long serialVersionUID = 1L;
		
		@Override
		public BigDecimal value()
		{
			return BigDecimal.ZERO;
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
		public BigDecimal valueOrDefault()
		{
			return BigDecimal.ZERO;
		}
		
		@Override
		public BigDecimal valueOrDefault(@AllowNull BigDecimal def)
		{
			return def;
		}
		
		@Override
		public boolean equals(@AllowNull Object obj)
		{
			if(obj == null) return true;
			if(obj == this) return true;
			
			if(obj instanceof INullableRBigd n) return equals(n);
			
			if(obj instanceof BigDecimal val) return equals(val);
			
			return obj == null;
		}
		
		@Override
		public boolean equals(@AllowNull INullableRBigd obj)
		{
			if(obj == null || obj.isNull()) return true;
			if(obj == this) return true;
			
			return false;
		}
		
		@Override
		public boolean equals(BigDecimal obj)
		{
			return false;
		}
		
		@Override
		public int hashCode()
		{
			return Objects.hash(false, BigDecimal.ZERO);
		}
		
		@Override
		public String toString()
		{
			return "BigDecimal?(null)";
		}
		
		private Object readResolve() throws ObjectStreamException
		{
			return NULL;
		}
	}
}
