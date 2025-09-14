package org.barghos.api.core.nullable.doubles;

import java.io.ObjectStreamException;
import java.io.Serializable;
import java.util.Objects;

import org.barghos.annotation.AllowNull;

final class ConstNullableD implements IConstNullableD, Serializable
{
	private static final long serialVersionUID = 1L;
	
	public static final IConstNullableD NULL = new Null();
	
	private final double value;
	
	private ConstNullableD(double value)
	{
		this.value = value;
	}
	
	@Override
	public double value()
	{
		return this.value;
	}

	@Override
	public double valueOrDefault(double def)
	{
		return this.value;
	}
	
	@Override
	public double valueOrDefault()
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
		
		if(obj instanceof INullableRD n) return equals(n);
		
		if(obj instanceof Double val) return equals(val);
		
		return false;
	}
	
	@Override
	public boolean equals(@AllowNull INullableRD obj)
	{
		if(obj == null || obj.isNull()) return false;
		if(obj == this) return true;

		return obj.value() == this.value;
	}
	
	@Override
	public boolean equals(double obj)
	{
		return this.value == obj;
	}
	
	@Override
	public boolean equals(@AllowNull Double obj)
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
		return "double?(" + this.value + ")";
	}
	
	public static IConstNullableD of()
	{
		return NULL;
	}
	
	public static IConstNullableD of(double value)
	{
		return new ConstNullableD(value);
	}
	
	public static IConstNullableD of(@AllowNull Double value)
	{
		if(value == null) return NULL;
		
		return new ConstNullableD(value);
	}
	
	public static IConstNullableD of(@AllowNull INullableRD value)
	{
		if(value == null || value == NULL || value.isNull()) return NULL;
		
		return new ConstNullableD(value.value());
	}
	
	static final class Null implements IConstNullableD, Serializable
	{
		private static final long serialVersionUID = 1L;
		
		@Override
		public double value()
		{
			return 0.0;
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
		public double valueOrDefault()
		{
			return 0.0;
		}
		
		@Override
		public double valueOrDefault(double def)
		{
			return def;
		}
		
		@Override
		public boolean equals(@AllowNull Object obj)
		{
			if(obj == null) return true;
			if(obj == this) return true;
			
			if(obj instanceof INullableRD n) return equals(n);
			
			if(obj instanceof Double val) return equals(val);
			
			return false;
		}
		
		@Override
		public boolean equals(@AllowNull INullableRD obj)
		{
			if(obj == null || obj.isNull()) return true;
			if(obj == this) return true;
			
			return false;
		}
		
		@Override
		public boolean equals(double obj)
		{
			return false;
		}
		
		@Override
		public boolean equals(@AllowNull Double obj)
		{
			return obj == null;
		}
		
		@Override
		public int hashCode()
		{
			return Objects.hash(false, 0.0);
		}
		
		@Override
		public String toString()
		{
			return "double?(null)";
		}
		
		private Object readResolve() throws ObjectStreamException
		{
			return NULL;
		}
	}
}
