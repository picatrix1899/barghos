package org.barghos.util.nullable.bigis;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.Objects;

import org.barghos.annotation.AllowNull;

public class NullableBigi implements INullableWBigi, Serializable
{
	private static final long serialVersionUID = 1L;
	
	private BigInteger value;
	private boolean hasValue;
	
	public NullableBigi()
	{
		setNull();
	}
	
	public NullableBigi(@AllowNull INullableRBigi value)
	{
		set(value);
	}

	public NullableBigi(@AllowNull BigInteger value)
	{
		value(value);
	}
	
	@Override
	public BigInteger value()
	{
		return this.value;
	}

	@Override
	public BigInteger valueOrDefault(@AllowNull BigInteger def)
	{
		if(this.hasValue) return this.value;
		
		return def;
	}
	
	@Override
	public BigInteger valueOrDefault()
	{
		if(this.hasValue) return this.value;
		
		return null;
	}
	
	@Override
	public boolean isNull()
	{
		return !this.hasValue;
	}

	@Override
	public boolean isNotNull()
	{
		return this.hasValue;
	}

	@Override
	public NullableBigi value(@AllowNull BigInteger value)
	{
		this.hasValue = value != null;
		this.value = this.hasValue ? value : null;

		return this;
	}
	
	@Override
	public NullableBigi set(@AllowNull INullableRBigi value)
	{
		this.hasValue = value != null && value.isNotNull();
		this.value = this.hasValue ? value.value() : null;
		
		return this;
	}

	@Override
	public NullableBigi setNull()
	{
		this.value = null;
		this.hasValue = false;
		
		return this;
	}
	
	@Override
	public boolean equals(@AllowNull Object obj)
	{
		if(obj == null) return !this.hasValue;
		if(obj == this) return true;
		
		if(obj instanceof INullableRBigi n) return equals(n);
		
		if(obj instanceof BigInteger val) return equals(val);
		
		return this.value.equals(obj);
	}
	
	@Override
	public boolean equals(BigInteger obj)
	{
		if(!this.hasValue) return false;
		
		return this.value.equals(obj);
	}
	
	@Override
	public boolean equals(@AllowNull INullableRBigi obj)
	{
		if(obj == null) return !this.hasValue;
		if(obj == this) return true;
		if(obj.isNotNull() != this.hasValue) return false;
		
		if(this.hasValue)
		{
			return obj.value() == this.value;
		}
		
		return true;
	}
	
	@Override
	public int hashCode()
	{
		return Objects.hash(this.hasValue, this.value);
	}
	
	@Override
	public String toString()
	{
		return "BigInteger?(" + (this.hasValue ? this.value : "null") + ")";
	}
}
