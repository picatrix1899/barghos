package org.barghos.util.nullable.bigis;

import java.io.ObjectStreamException;
import java.io.Serializable;
import java.math.BigInteger;
import java.util.Objects;

import org.barghos.annotation.AllowNull;

final class ConstNullableBigi implements IConstNullableBigi, Serializable
{
	private static final long serialVersionUID = 1L;
	
	public static final IConstNullableBigi NULL = new Null();
	
	private final BigInteger value;

	private ConstNullableBigi(BigInteger value)
	{
		this.value = value;
	}
	
	@Override
	public BigInteger value()
	{
		return this.value;
	}

	@Override
	public BigInteger valueOrDefault(@AllowNull BigInteger def)
	{
		return this.value;
	}
	
	@Override
	public BigInteger valueOrDefault()
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
		
		if(obj instanceof INullableRBigi n) return equals(n);
		
		if(obj instanceof BigInteger val) return equals(val);
		
		return this.value.equals(obj);
	}
	
	@Override
	public boolean equals(@AllowNull INullableRBigi obj)
	{
		if(obj == null || obj.isNull()) return false;
		if(obj == this) return true;
		
		return this.value.equals(obj.value());
	}
	
	@Override
	public boolean equals(BigInteger obj)
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
		return "BigInteger?(" + this.value + ")";
	}
	
	public static IConstNullableBigi of()
	{
		return NULL;
	}
	
	public static IConstNullableBigi of(@AllowNull BigInteger value)
	{
		if(value == null) return NULL;
		
		return new ConstNullableBigi(value);
	}
	
	public static IConstNullableBigi of(@AllowNull INullableRBigi value)
	{
		if(value == null || value == NULL || value.isNull()) return NULL;
		
		return new ConstNullableBigi(value.value());
	}
	
	static final class Null implements IConstNullableBigi, Serializable
	{
		private static final long serialVersionUID = 1L;
		
		@Override
		public BigInteger value()
		{
			return BigInteger.ZERO;
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
		public BigInteger valueOrDefault()
		{
			return BigInteger.ZERO;
		}
		
		@Override
		public BigInteger valueOrDefault(@AllowNull BigInteger def)
		{
			return def;
		}
		
		@Override
		public boolean equals(@AllowNull Object obj)
		{
			if(obj == null) return true;
			if(obj == this) return true;
			
			if(obj instanceof INullableRBigi n) return equals(n);
			
			if(obj instanceof BigInteger val) return equals(val);
			
			return obj == null;
		}
		
		@Override
		public boolean equals(@AllowNull INullableRBigi obj)
		{
			if(obj == null || obj.isNull()) return true;
			if(obj == this) return true;
			
			return false;
		}
		
		@Override
		public boolean equals(BigInteger obj)
		{
			return false;
		}
		
		@Override
		public int hashCode()
		{
			return Objects.hash(false, BigInteger.ZERO);
		}
		
		@Override
		public String toString()
		{
			return "BigInteger?(null)";
		}
		
		private Object readResolve() throws ObjectStreamException
		{
			return NULL;
		}
	}
}
